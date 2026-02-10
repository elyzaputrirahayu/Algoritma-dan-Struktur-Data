import java.util.Scanner;

public class PemilihanmenghitungnilaiakhirMHS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bobotNilaiTugas = 0.2;
        double bobotNilaiKuis = 0.2;
        double bobotNilaiUTS = 0.3;
        double bobotNilaiUAS = 0.4;
        
        System.out.println("Program menghitung Nilai Akhir");
        System.out.println("================================");
        System.out.print("Masukkan Nilai Tugas : ");
        int NilaiTugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        int NilaiKuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        int NilaiUTS = sc.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        int NilaiUAS = sc.nextInt();

        System.out.println("=================================");
        System.out.println("=================================");

        if (NilaiTugas < 0 || NilaiTugas > 100 ||
            NilaiKuis < 0 || NilaiKuis > 100 ||
            NilaiUTS < 0 || NilaiUTS > 100 ||
            NilaiUAS < 0 || NilaiUAS > 100) {

            System.out.println("Nilai tidak valid");
        } else {
        double nilaiakhir = NilaiTugas*bobotNilaiTugas + NilaiKuis*bobotNilaiKuis + NilaiUTS*bobotNilaiUTS + NilaiUAS*bobotNilaiUAS;

        String nilaiHuruf;
        String keterangan;
        
        if (nilaiakhir > 80 ) {
            nilaiHuruf = "A";
        } else if (nilaiakhir >= 73 ) {
            nilaiHuruf = "B+";
        } else if (nilaiakhir >= 65 ) {
            nilaiHuruf = "B";
        } else if (nilaiakhir >= 60 ) {
            nilaiHuruf = "C+";
        } else if (nilaiakhir >= 50 ) {
            nilaiHuruf = "C";
        } else if ( nilaiakhir >= 39 ) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) { keterangan = "SELAMAT ANDA LULUS";
        } else {
            keterangan = "TIDAK LULUS";
        }

        System.out.println("nilai akhir : " + nilaiakhir);
        System.out.println("nilai huruf : " + nilaiHuruf);

        System.out.println("==================================");

        System.out.println(keterangan);
        }
    }
}