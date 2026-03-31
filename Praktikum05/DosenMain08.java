package Praktikum05;

import java.util.Scanner;

public class DosenMain08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        DataDosen08 list = new DataDosen08 ();

        int pilihan;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Sorting ASC (muda → tua)");
            System.out.println("4. Sorting DSC (tua → muda)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode          : ");
                    String kd = sc.nextLine();

                    System.out.print("Nama          : ");
                    String nm = sc.nextLine();

                    System.out.print("Jenis Kelamin (1=Pria, 0=Wanita): ");
                    int jkInput = sc.nextInt();
                    boolean jk = (jkInput == 1);

                    System.out.print("Usia          : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen08 d = new Dosen08 (kd, nm, jk, usia);
                    list.tambah(d);
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.SortingASC();
                    break;

                case 4:
                    list.sortingDSC();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        sc.close();
    }
}

