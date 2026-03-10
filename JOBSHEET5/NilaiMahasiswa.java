package JOBSHEET5;

public class NilaiMahasiswa {

    static int[] uts = {78, 85, 90, 76, 92, 88, 80, 82};
    static int[] uas = {82, 88, 87, 79, 95, 85, 83, 84};

    // Divide and Conquer mencari nilai max
    static int maxUTS(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }

        int mid = (left + right) / 2;

        int maxKiri = maxUTS(arr, left, mid);
        int maxKanan = maxUTS(arr, mid + 1, right);

        return Math.max(maxKiri, maxKanan);
    }

    // Divide and Conquer mencari nilai min
    static int minUTS(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }

        int mid = (left + right) / 2;

        int minKiri = minUTS(arr, left, mid);
        int minKanan = minUTS(arr, mid + 1, right);

        return Math.min(minKiri, minKanan);
    }

    // Brute Force menghitung rata-rata
    static double rataUAS(int[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        return (double) total / arr.length;
    }

    public static void main(String[] args) {

        int max = maxUTS(uts, 0, uts.length - 1);
        int min = minUTS(uts, 0, uts.length - 1);
        double rata = rataUAS(uas);

        System.out.println("Nilai UTS tertinggi : " + max);
        System.out.println("Nilai UTS terendah  : " + min);
        System.out.println("Rata-rata UAS       : " + rata);
    }
}