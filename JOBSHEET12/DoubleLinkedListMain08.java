package JOBSHEET12;

import java.util.Scanner;

public class DoubleLinkedListMain08 {

    public static Mahasiswa08 inputMahasiswa08(Scanner sc) {
        System.out.print("NIM\t: ");
        String nim = sc.nextLine();

        System.out.print("Nama\t: ");
        String nama = sc.nextLine();

        System.out.print("Kelas\t: ");
        String kelas = sc.nextLine();

        System.out.print("IPK\t: ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        return new Mahasiswa08(nim, nama, kelas, ipk);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList08 list = new DoubleLinkedList08();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. keluar");
            
            System.out.print("Pilih Menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa08 mhsAwal = inputMahasiswa08(sc);
                    list.addFirst(mhsAwal);
                    break;
                
                case 2:
                    Mahasiswa08 mhsAkhir = inputMahasiswa08(sc);
                    list.addLast(mhsAkhir);
                    break;
                
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = sc.nextLine();

                    System.out.println("Masukkan data baru : ");
                    Mahasiswa08 dataBaru = inputMahasiswa08(sc);
                    list.insertAfter(keyNim, dataBaru);
                    break;

                case 4:
                    list.removeFirst();
                    break;

                case 5:
                    list.removeLast();
                    break;

                case 6:
                    list.print();
                    break;

                case 0:
                    System.out.println("program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid");;
            }
        } while (pilihan != 0);
        sc.close();
    }
}
