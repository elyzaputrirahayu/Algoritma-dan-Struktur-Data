package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
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

        list.tampil();
        //melakukan pencarian data sequential
        System.out.println("----------------------------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari : ");
        System.out.print("IPK : ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(posisi, pss);
        list.tampilDataSearch(posisi, pss);

        //Melakukan pencarian data binary
        System.out.println("-----------------------------------------------------------------");
        System.out.println(" Pencarian data");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari : ");
        System.out.print("IPK : ");
        double cari2 = sc.nextDouble();
        
        System.out.println("------------------------------------------------------------------");
        System.out.println("Menggunakan bianry search");
        System.out.println("------------------------------------------------------------------");
        double posisi2 = list.findBinarySearch(cari2, 0, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari2, pss2);
        list.tampilDataSearch(cari2, pss2);

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

