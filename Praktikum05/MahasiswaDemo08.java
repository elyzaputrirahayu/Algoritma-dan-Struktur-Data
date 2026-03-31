package Praktikum05;

public class MahasiswaDemo08 {
    public static void main(String[] args) {
        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08();
        Mahasiswa08 m1 = new Mahasiswa08("111", "ayu", "2c", 3.7);
        Mahasiswa08 m2 = new Mahasiswa08("222", "dika", "2c", 3.0);
        Mahasiswa08 m3 = new Mahasiswa08("333", "ila", "2c", 3.8);
        Mahasiswa08 m4 = new Mahasiswa08("444", "susi", "2c", 3.1);
        Mahasiswa08 m5 = new Mahasiswa08("555", "yayuk", "2c", 3.4);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC)");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.SelectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}
