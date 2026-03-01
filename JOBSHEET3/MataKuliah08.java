package JOBSHEET3;

public class MataKuliah08 {
    String kode;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah08(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void cetakInfo() {
        System.out.println(kode + " | " + nama + " | " + sks);
    }
}
