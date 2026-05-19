package CM2;

import java.util.Scanner;

public class MainRestoRoyal08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DLLAntrian08 antrian = new DLLAntrian08();
        DLLPesanan08 pesanan = new DLLPesanan08();

        int pilih;

        do {

            System.out.println("====================================");
            System.out.println("      SISTEM ANTRIAN ROYAL DELISH   ");
            System.out.println("====================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Antrian Prioritas");
            System.out.println("0. Keluar");
            System.out.println("====================================");

            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();

                    Pembeli08 pembeli = new Pembeli08(nama, hp);

                    antrian.tambahAntrian(pembeli);

                    break;

                case 2:

                    antrian.cetakAntrian();

                    break;

                case 3:

                    nodeAntrian08 dataKeluar = antrian.hapusAntrian();

                        if (dataKeluar != null) {

                            System.out.println( dataKeluar.pembeli.namaPembeli + " telah memesan makanan");
                            System.out.print("Kode Pesanan : ");
                            int kode = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Nama Pesanan : ");
                            String namaPesanan = sc.nextLine();

                            System.out.print("Harga        : ");
                            int harga = sc.nextInt();
                            sc.nextLine();

                        Pesanan08 p = new Pesanan08(kode, namaPesanan, harga);

                        pesanan.tambahPesanan( dataKeluar.pembeli, p);

                        System.out.println(dataKeluar.pembeli.namaPembeli + " telah memesan " + namaPesanan);
                    }

                    break;
                case 4:

                    pesanan.laporanPesanan();

                    break;

                case 5 :
            
                    break;
    

                case 0:

                    System.out.println("Program selesai");

                    break;

                default:

                    System.out.println("Menu tidak valid");
            }

        } while (pilih != 0);

        sc.close();
    }
}
