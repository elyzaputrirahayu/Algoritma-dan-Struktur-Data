package JOBSHEET2;

public class MataKuliah08 {
    String KodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi () {
        System.out.println("KodeMK : " + KodeMK);
        System.out.println("nama : " +nama);
        System.out.println("sks : " + sks);
        System.out.println("jumlah Jam : " + jumlahJam);
    }

    void ubahSKS (int sksBaru) {
        sks = sksBaru;
        System.out.println("sks berhasil menjadi " +sksBaru);
    }

    void tambahJam (int jam) {
        jumlahJam += jam;
        System.out.println("jumlah jam menjadi " +jam);
    }

    void kurangiJam (int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam sekarang : " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan, jam tidak mencukupi");
        }
    }
}
