package CM1;

import java.util.Scanner;

public class MahasiswaMain08 {
    public static void main(String[] args) {

        Mahasiswa08 Mhs = new Mahasiswa08(null, null, null);
        Mhs.tampilkanMahasiswa(mahasiswa);

        Buku08[] Buku = new Buku08[4];
        Buku08 Bk = new Buku08(null, null, 0);
        Bk.tampilkanBuku(Buku);

        Peminjaman08[] pinjam = new Peminjaman08[5];
        Peminjaman08 Pjm = new Peminjaman08(0, 0, 0, 0, null, null, null);
        Pjm.isiDataPeminjaman(null);

        Peminjaman08[] isimenu = new Peminjaman08[5];
        Peminjaman08 IM = new Peminjaman08();
        IM.isiMenu();

        System.out.print("pilih menu : ");
        Scanner sc = new Scanner(System.in);
        int Pilih = sc.nextInt();

        System.out.println(" === SISTEM PEMINJAMAN BACA JTI === ");
        System.out.println("1. Tampilkan Mahasiswa");
        System.out.println("2. Tampilkan Buku");
        System.out.println("3. Tampilkan Peminjaman");
        System.out.println("4. Urutkan Berdasarkan Denda");
        System.out.println("5. Cari Berdasarkan NIM");
        System.out.println("0. Keluar");


    } 
}
