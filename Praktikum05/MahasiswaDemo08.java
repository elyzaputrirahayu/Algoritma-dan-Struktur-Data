package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i+1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa08 m = new Mahasiswa08(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\nData sebelum sorting:");
        list.tampil();

        System.out.println("\nSetelah Bubble Sort (DESC):");
        list.bubbleSort();
        list.tampil();

        System.out.println("\nSetelah Selection Sort (ASC):");
        list.SelectionSort();
        list.tampil();

        System.out.println("\nSetelah Insertion Sort (ASC):");
        list.insertionSort();
        list.tampil();

        sc.close();
    }
}

