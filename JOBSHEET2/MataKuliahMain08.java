package JOBSHEET2;

import java.util.Scanner;

public class MataKuliahMain08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MataKuliah08 matkul1 = new MataKuliah08();
        matkul1.KodeMK = "TA54";
        matkul1.nama = "Sistem Operasi";
        matkul1.sks = 2;
        matkul1.jumlahJam = 3;

        matkul1.tampilInformasi();
        matkul1.tambahJam(4);

        MataKuliah08 matkul2 = new MataKuliah08("EL74", "Agama", 2, 4);
        matkul2.tampilInformasi();
        matkul2.kurangiJam(2);
    }
}
