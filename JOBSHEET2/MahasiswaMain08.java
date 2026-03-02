package JOBSHEET2;

public class MahasiswaMain08 {

    public static void main(String[] args) {

        Mahasiswa08 mhs1 = new Mahasiswa08();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2J");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa08 mhs2 = new Mahasiswa08("2141720160", "Annisa Nabila", "TI 2L", 3.25);
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
    }
}