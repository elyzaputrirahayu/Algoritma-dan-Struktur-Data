package JOBSHEET10TUGAS;

import java.util.Scanner;

public class MainKRS08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS08 antrian = new AntrianKRS08(10);
        
        int pilih;
        do {
            System.out.println("\n=== MENU KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses KRS (2 orang)");
            System.out.println("3. Lihat 2 terdepan");
            System.out.println("4. Lihat semua");
            System.out.println("5. Lihat paling belakang");
            System.out.println("6. Jumlah antrian");
            System.out.println("7. Jumlah dilayani");
            System.out.println("8. Sisa belum dilayani");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();

                    antrian.enqueue(new Mahasiswa08(nim, nama, prodi, kelas));
                    break;

                case 2:
                    antrian.dequeue2();
                    break;

                case 3:
                    antrian.lihatDepan();
                    break;

                case 4:
                    antrian.tampilSemua();
                    break;

                case 5:
                    antrian.lihatAkhir();
                    break;

                case 6:
                    antrian.jumlahAntrian();
                    break;

                case 7:
                    antrian.jumlahDilayani();
                    break;

                case 8:
                    antrian.sisaBelumDilayani();
                    break;
            }
        } while (pilih != 0);
    }
}
