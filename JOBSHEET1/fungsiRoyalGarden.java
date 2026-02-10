public class fungsiRoyalGarden {

    static int[] harga = {75000, 50000, 60000, 10000};
    // Urutan: Aglonema, Keladi, Alocasia, Mawar

    public static int hitungPendapatan(int[] stokCabang) {
        int totalPendapatan = 0;
        for (int i = 0; i < stokCabang.length; i++) {
            totalPendapatan += stokCabang[i] * harga[i];
        }
        return totalPendapatan;
    }

    public static String tentukanStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {

        int[][] stok = {
            {10, 5, 15, 7},  
            {6, 11, 9, 12},   
            {2, 10, 10, 5},   
            {5, 7, 12, 9}  
        };

        System.out.println("Pendapatan Setiap Cabang RoyalGarden");
        System.out.println("===================================");

        for (int i = 0; i < stok.length; i++) {
            int pendapatan = hitungPendapatan(stok[i]);
            String status = tentukanStatus(pendapatan);

            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Pendapatan : Rp " + pendapatan);
            System.out.println("Status     : " + status);
            System.out.println("-----------------------------------");
        }
    }
}
