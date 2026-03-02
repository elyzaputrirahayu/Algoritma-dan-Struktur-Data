package JOBSHEET3;

import java.util.Scanner;

public class DosenDemo08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen : ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen08[] arrayOfDosen = new Dosen08[jumlah];

        for ( int i = 0; i < jumlah; i++) {

            System.out.println("\nData Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (1 = Pria, 0 = Wanita): ");
            int jkInput = sc.nextInt();
            Boolean jenisKelamin = (jkInput == 1);

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen[i] = new Dosen08(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\n=== DATA DOSEN ===");

        for (Dosen08 dsn : arrayOfDosen) {
            dsn.cetakInfo();
        }

        sc.close();
    }
}
