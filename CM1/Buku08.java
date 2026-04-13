package CM1;

public class Buku08 {
    String KodeBuku;
    String Judul;
    int TahunTerbit; 

    Buku08 (String koBu, String judul, int taTer) {
        this.KodeBuku = koBu;
        this.Judul = judul;
        this.TahunTerbit = taTer;
    }

    void tampilkanBuku () {
        System.out.println(KodeBuku + " | " + Judul + " | " + TahunTerbit);
    }
}