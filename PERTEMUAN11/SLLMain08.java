package PERTEMUAN11;

import java.util.Scanner;

public class SLLMain08 {
    public static void main(String[] args) {
        SingleLinkedList08 sll = new SingleLinkedList08();
        Scanner sc = new Scanner(System.in);

        String lanjut = "y";

        while (lanjut.equalsIgnoreCase("y")) {

            System.out.println("\nMasukkan data mahasiswa");

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = Double.parseDouble(sc.nextLine());

            Mahasiswa08 m = new Mahasiswa08(nim, nama, kelas, ipk);
            sll.addLast(m);

            System.out.print("\nTambah data lagi? (y/n): ");
            lanjut = sc.nextLine();
        }

        System.out.println("data index 1 : ");
            sll.getData(1);

            System.out.println("data mahasiswa an Bimon berada pada index : "+sll.indexOf("bimon"));
            System.out.println();

            sll.removeFirst();
            sll.removeLast();
            sll.print();
            sll.removeAt(0);
            sll.print();

        System.out.println("Program selesai.");
        sc.close();
    }
}