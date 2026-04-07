package CM1;

public class Mahasiswa08 {
    String NIM;
    String Nama;
    String Prodi;

    Mahasiswa08 (String nm, String name, String prody) {
        NIM = nm;
        Nama = name;
        Prodi = prody;
    }

    void datasemuaMahasiswa(Mahasiswa08 [] arrayOfMahasiswa) {
        arrayOfMahasiswa[0] = new Mahasiswa08(null, null, null);
        arrayOfMahasiswa[0].NIM = "22001";
        arrayOfMahasiswa[0].Nama = "Andi";
        arrayOfMahasiswa[0].Prodi = "Teknik Informatika";

        arrayOfMahasiswa[1] = new Mahasiswa08(null, null, null);
        arrayOfMahasiswa[1].NIM = "22002";
        arrayOfMahasiswa[1].Nama = "Budi";
        arrayOfMahasiswa[1].Prodi = "Teknik Informatika";

        arrayOfMahasiswa[2] = new Mahasiswa08(null, null, null);
        arrayOfMahasiswa[2].NIM = "22003";
        arrayOfMahasiswa[2].Nama = "Citra";
        arrayOfMahasiswa[2].Prodi = "Sistem Informasi Bisnis";

        System.out.println("NIM     : " +arrayOfMahasiswa[0].NIM);
        System.out.println("Nama    : " +arrayOfMahasiswa[0].Nama);
        System.out.println("Prodi   : " +arrayOfMahasiswa[0].Prodi);
        System.out.println("-----------------------------------------------------");

        System.out.println("NIM     : " +arrayOfMahasiswa[1].NIM);
        System.out.println("Nama    : " +arrayOfMahasiswa[1].Nama);
        System.out.println("Prodi   : " +arrayOfMahasiswa[1].Prodi);
        System.out.println("-----------------------------------------------------");

        System.out.println("NIM     : " +arrayOfMahasiswa[2].NIM);
        System.out.println("Nama    : " +arrayOfMahasiswa[2].Nama);
        System.out.println("Prodi   : " +arrayOfMahasiswa[2].Prodi);
        System.out.println("-----------------------------------------------------");
    }

    void tampilinfomasimenu () {
        System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
        System.out.println("1. Tampilkan Mahasiswa");
        System.out.println("2. Tampilkan Buku");
        System.out.println("3. Tampilkan Peminjaman");
        System.out.println("4. Urutkan Berdasarkan Denda");
        System.out.println("5. Cari Berdasarkan NIM");
        System.out.println("0. keluar");
    }
}
