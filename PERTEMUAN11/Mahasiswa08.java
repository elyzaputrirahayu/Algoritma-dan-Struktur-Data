package PERTEMUAN11;

import org.w3c.dom.Node;

public class Mahasiswa08 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    Mahasiswa08() {

    }

    Mahasiswa08(String nm, String name, String kls, double ip) {
        nama = name;
        nim = nm;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println(nama + "\t " + nim + "\t" + kelas + "\t" + ipk);
    }
}
