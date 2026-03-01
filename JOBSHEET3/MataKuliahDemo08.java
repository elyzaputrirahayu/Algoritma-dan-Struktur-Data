package JOBSHEET3;

import java.util.Scanner;

public class MataKuliahDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MataKuliah08[] arrayOfMataKuliah08 = new MataKuliah08[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i=0; i < 3; i++) {
            System.out.println("Masukkan Data MataKuliah ke-" + (i + 1));
            System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("Sks         : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("--------------------------------");

            arrayOfMataKuliah08[i] = new MataKuliah08(kode, nama, sks, jumlahJam);
        }

        for (int i=0; i < 3; i++) {
            System.out.println("Data MataKuliah ke-" + (i + 1));
            System.out.println("Kode        : " + arrayOfMataKuliah08[i].kode);
            System.out.println("Nama        : " + arrayOfMataKuliah08[i].nama);
            System.out.println("Sks         : " + arrayOfMataKuliah08[i].sks);
            System.out.println("Jumlah Jam  : " + arrayOfMataKuliah08[i].jumlahJam);
            System.out.println("---------------------------------------------");
        }
    }
}
