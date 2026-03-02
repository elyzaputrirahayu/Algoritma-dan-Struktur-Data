package JOBSHEET2;

public class Dosen08 {
    
    String idDosen;
    String nama;
    String bidangkeahlian;
    Boolean statusAktif;
    int tahunBergabung;

    public Dosen08 () {

    }

    public Dosen08 (String idDosen, String nama, String bidangkeahlian, Boolean statusAktif, int tahunBergabung) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.bidangkeahlian = bidangkeahlian;
        this.tahunBergabung = tahunBergabung;
        this.statusAktif = statusAktif;
    }

    void tampilInformasi() {
        System.out.println("id Dosen : " + idDosen);
        System.out.println("Nama Dosen : " + nama);
        System.out.println("Status Dosen : " +statusAktif);
        System.out.println("Tahun bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian Dosen : " +bidangkeahlian);
    }

    void setStatusAktif (boolean status) {
        statusAktif = status;
        System.out.println("status aktif diubah menjadi " + status);
    }

    int hitungMasaKerja (int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangkeahlian = bidang;
        System.out.println("Bidang keahlian diubah menjadi " +bidang);
    }
}
