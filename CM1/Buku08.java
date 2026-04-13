package CM1;

public class Buku08 {
    String kode, judul;
    int tahun;

    Buku08(String koBu, String jdl, int thn) {
        this.kode = koBu;
        this.judul = jdl;
        this.tahun = thn;
    }

    void tampil() {
        System.out.println("Kode : " + kode + " | " + "Judul : " + judul + " | " + "Tahun : " + tahun);
    }
}