package CM1;

public class Peminjaman08 {
    String nim, nama, judul;
    int lamaPinjam;
    int denda;

    Peminjaman08(String nim, String nama, String judul, int lama) {
        this.nim = nim;
        this.nama = nama;
        this.judul = judul;
        this.lamaPinjam = lama;
        hitungDenda();
    }

    void hitungDenda() {
        int batas = 5;
        int telat = lamaPinjam - batas;
        if (telat > 0) {
            denda = telat * 2000;
        } else {
            denda = 0;
        }
    }

    void tampil() {
        System.out.println(nama + " | " + judul + " | " + "Lama : " + lamaPinjam + " Terlambat | Denda: " + denda);
    }
}