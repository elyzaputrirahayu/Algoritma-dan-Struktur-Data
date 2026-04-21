package JOBSHEET9;

import java.util.Scanner;

public class SuratMain08 {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StackSurat08 stack = new StackSurat08(10);

        int pilih;

        do {
            System.out.println("\n=== MENU SURAT IZIN ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat (Nama)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();

                    System.out.print("Nama: ");
                    String nama = sc.nextLine();

                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();

                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);

                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat08 s = new Surat08(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    break;

                case 2:
                    Surat08 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Surat diproses:");
                        proses.tampil();
                    }
                    break;

                case 3:
                    Surat08 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir:");
                        lihat.tampil();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama: ");
                    String cari = sc.nextLine();
                    stack.cari(cari);
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);

        sc.close();
    }
}

