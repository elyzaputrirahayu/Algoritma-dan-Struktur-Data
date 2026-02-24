package JOBSHEET3;

import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Mahasiswa08[] arrayOfMahasiswa = new Mahasiswa08[3];

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa08();

            System.out.println("Data Mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();

            System.out.print("Nama  : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();

            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();

            System.out.print("IPK   : ");
            arrayOfMahasiswa[i].ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println();
        }

        System.out.println("=== DATA MAHASISWA ===");
        for (Mahasiswa08 mhs : arrayOfMahasiswa) {
            System.out.println("NIM   : " + mhs.nim);
            System.out.println("Nama  : " + mhs.nama);
            System.out.println("Kelas : " + mhs.kelas);
            System.out.println("IPK   : " + mhs.ipk);
            System.out.println();
        }
    }
}