package JOBSHEET3;

public class Matakuliah08 {
    String kode;
    String nama;
    int sks;

    public Matakuliah08(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    void cetakInfo() {
        System.out.println(kode + " | " + nama + " | " + sks);
    }
}
