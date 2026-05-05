package PERTEMUAN11;

import java.util.Scanner;

public class MainMenu08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList08 antrian = new QueueLinkedList08();

        int pilih;

        do {
            System.out.println("\n=== MENU ANTRIAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Terdepan");
            System.out.println("4. Lihat Terakhir");
            System.out.println("5. Tampilkan Semua");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mhs08 m = new Mhs08(nim, nama, kelas);
                    antrian.enqueue(m);
                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.peekFront();
                    break;

                case 4:
                    antrian.peekRear();
                    break;

                case 5:
                    antrian.print();
                    break;

                case 6:
                    System.out.println("Jumlah antrian: " + antrian.jumlah());
                    break;

                case 7:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Terima kasih");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilih != 0);

        sc.close();
    }
}
