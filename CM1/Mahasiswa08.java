package CM1;

public class Mahasiswa08 {
    String NIM;
    String Nama;
    String Prodi;

    Mahasiswa08 (String nim, String nama, String prodi) {
        this.NIM = nim;
        this.Nama = nama;
        this.Prodi = prodi;
    }

    void tampilkanMahasiswa (Mahasiswa08 [] arrayOfMahasiswa) {
        System.out.println("NIM : " + NIM + " | " + "\tNama : " + Nama + " \t| " + "yProdi : " + Prodi);
    }
}
