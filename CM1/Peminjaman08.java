package CM1;

import java.util.Scanner;

public class Peminjaman08 {

    int lamaPinjam;
    int denda;
    String Nama;
    String NIM;
    String JudulBuku;

    Peminjaman08 (int LM, String Nam, String NIM, String juBu) {
        this.Nama = Nam;
        this.NIM = NIM;
        this.JudulBuku = juBu;
        this.lamaPinjam = LM;
    }

    void hitungdenda () {
        int batas = 5;
        int telat = lamaPinjam - batas;
        if (telat > 0) {
            denda = telat * 2000;
        } else {
            denda = 0;
        }
    }

    void tampil() {
        System.out.println(NIM + " | " + Nama + " | " + JudulBuku + " | " + lamaPinjam + " hari | Denda " + denda);
    }
}
