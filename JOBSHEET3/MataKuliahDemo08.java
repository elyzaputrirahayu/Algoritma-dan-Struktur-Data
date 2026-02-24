package JOBSHEET3;

public class MatakuliahDemo08 {
    public static void main(String[] args) {

        Matakuliah08[] arrayMK = {
            new Matakuliah08("IF101", "Algoritma", 3),
            new Matakuliah08("IF102", "Basis Data", 3),
            new Matakuliah08("IF103", "Struktur Data", 4)
        };

        for (Matakuliah08 mk : arrayMK) {
            mk.cetakInfo();
        }
    }
}