package CM1;

import java.util.Scanner;

public class MahasiswaMain08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Mahasiswa08 [] Mhs = {
            new Mahasiswa08 ("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa08("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa08("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku08[] Buku = {
            new Buku08("B001", "Algoritma", 2020),
            new Buku08("B002", "Basis Data", 2019),
            new Buku08("B003", "Pemrograman", 2021),
            new Buku08("B004", "Fisika", 2024)
        };


        Peminjaman08[] pinjam = {
            new Peminjaman08("22001", "Andi", "Algoritma", 7),
            new Peminjaman08("22002", "Budi", "Basis Data", 3),
            new Peminjaman08("22003", "Citra", "Pemrograman", 10),
            new Peminjaman08("22003", "Citra", "Fisika", 6),
            new Peminjaman08("22001", "Andi", "Basis Data", 4)
        };

        int Pilih;

    do {
        System.out.println(" === SISTEM PEMINJAMAN BACA JTI === ");
        System.out.println("1. Tampilkan Mahasiswa");
        System.out.println("2. Tampilkan Buku");
        System.out.println("3. Tampilkan Peminjaman");
        System.out.println("4. Urutkan Berdasarkan Denda");
        System.out.println("5. Cari Berdasarkan NIM");
        System.out.println("0. Keluar");
        System.out.print("pilih menu : ");
        Pilih = sc.nextInt();

        switch (Pilih) {
            case 1:
                System.out.println("Data Mahasiswa");
                for (Mahasiswa08 m : Mhs) m.tampilkanMahasiswa(Mhs);
                break;

            case 2:
                System.out.println("Data Buku");
                for (Buku08 b : Buku) b.tampilkanBuku();
                break;

            case 3:
                System.out.println("Data Peminjaman : ");
                for (Peminjaman08 p : pinjam) p.tampil();
                break;

            case 4:
                System.out.println("Denda");
                for (Peminjaman08 p : pinjam) p.tampil();
                break;

            case 5:
                for (int i = 1; i < pinjam.length; i++) {
                    Peminjaman08 temp = pinjam[i];
                    int j = i - 1;
                    while (j >= 0 && pinjam[j].denda < temp.denda) {
                        pinjam[j + 1] = pinjam[j];
                        j--;
                    }
                    pinjam[j + 1] = temp;
                }

                System.out.println("Setelah Sorting");
                for (Peminjaman08 p : pinjam) p.tampil();
                break;

            case 6 :
                for (int i = 1; i < pinjam.length; i++) {
                    Peminjaman08 temp = pinjam[i];
                    int j = i -1;
                    while (j >= 0 && pinjam[j].NIM.compareTo(temp.NIM) > 0) {
                        pinjam[j + 1] = pinjam[j];
                        j--;
                    }
                    pinjam[j + 1] = temp;
                }

                System.out.print("Masukkan NIM : ");
                String cari = sc.next();

                int left = 0, right = pinjam.length - 1;
                boolean ketemu = false;

                while (left <= right) {
                    int mid = (left + right) / 2;

                    if (pinjam[mid].NIM.equals(cari)) {
                        pinjam[mid].tampil();
                        ketemu = true;
                        break;
                    } else if (pinjam[mid].NIM.compareTo(cari) > 0) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }

                if (!ketemu) {
                    System.out.println("Data tidak ditemukan");
                }

                break;
        }

    } while (Pilih != 0);

    sc.close();

    } 
}
