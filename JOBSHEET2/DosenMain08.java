package JOBSHEET2;

import java.util.Scanner;

public class DosenMain08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dosen08 Dosenku1 = new Dosen08();
        Dosenku1.idDosen = "CG 08";
        Dosenku1.nama = "Zhinia";
        Dosenku1.bidangkeahlian = "RPL";
        Dosenku1.statusAktif = true;
        Dosenku1.tahunBergabung = 2023;

        Dosenku1.tampilInformasi();

        Dosen08 Dosenku2 = new Dosen08("2541", "Budi", "Sistem Operasi", true, 2024);
        Dosenku2.tampilInformasi();
    }
}
