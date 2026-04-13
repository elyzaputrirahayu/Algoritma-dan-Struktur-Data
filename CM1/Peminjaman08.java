package CM1;

import java.util.Scanner;

public class Peminjaman08 {

    int denda;
    int telat;
    String Nama;
    String NIM;
    String JudulBuku;
    int lamaPinjam;

    Peminjaman08 (String NIM, String Nam, String juBu, int LM) {
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
            telat = 0;
        }
    }

    void tampil() {
        System.out.println(NIM + " | " + Nama + " \t| " + JudulBuku + " \t| " + "lama : " + lamaPinjam + " | " + "terlambat : " + telat + " | " + "Denda : " + denda);
    }
}
