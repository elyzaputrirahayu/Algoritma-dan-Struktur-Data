package PERTEMUAN11;

public class Mhs08 {
    String nim;
    String nama;
    String kelas;

    public Mhs08(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public void tampil() {
        System.out.println(nim + " - " + nama + " - " + kelas);
    }
}