package JOBSHEET9;

public class Surat08 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; 
    int durasi;

    public Surat08() {}

    public Surat08(String id, String nama, String kelas, char jenis, int durasi) {
        this.idSurat = id;
        this.namaMahasiswa = nama;
        this.kelas = kelas;
        this.jenisIzin = jenis;
        this.durasi = durasi;
    }

    public void tampil() {
        System.out.println(idSurat + "\t" + namaMahasiswa + "\t" + kelas +
                "\t" + jenisIzin + "\t" + durasi + " hari");
    }
}

