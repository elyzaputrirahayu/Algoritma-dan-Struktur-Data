package JOBSHEET2;

public class MahasiswaMain08 {

    public static void main(String[] args) {

        Mahasiswa08 mhs1 = new Mahasiswa08();

        mhs1.nama = "Elyza Putri";
        mhs1.nim = "2241720001";
        mhs1.kelas = "TI-2A";
        mhs1.ipk = 3.45;

        System.out.println("=== DATA MAHASISWA 1 ===");
        mhs1.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs1.nilaiKinerja());

        mhs1.ubahKelas("TI-2B");
        mhs1.updateIpk(3.80);

        System.out.println("\n=== SETELAH UPDATE ===");
        mhs1.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs1.nilaiKinerja());


        Mahasiswa08 mhs2 = new Mahasiswa08(
                "2241720002",
                "Muhammad Ali Farhan",
                "SI-2J",
                3.70
        );

        System.out.println("\n=== DATA MAHASISWA 2 ===");
        mhs2.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs2.nilaiKinerja());
    }
}