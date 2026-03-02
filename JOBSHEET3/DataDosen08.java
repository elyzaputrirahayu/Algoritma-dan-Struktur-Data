package JOBSHEET3;

public class DataDosen08 {
    
    void dataSemuaDosen(Dosen08[] arrayOfDosen) {
        System.out.println("\n=== DATA SEMUA DOSEN ===");
        for (Dosen08 d : arrayOfDosen) {
            d.cetakInfo();
        }
    }

    void jumlahDosenPerjenisKelamin(Dosen08[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosen08 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("\nJumlah Dosen Pria : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen08[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen08 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                countPria++;
            } else {
                totalWanita += d.usia;
                countWanita++;
            }
        }

        if (countPria > 0) {
            System.out.println("\nRata-rata Usia Dosen Pria   : " + (totalPria / countPria));
        }
        if (countWanita > 0) {
            System.out.println("Rata-rata Usia Dosen Wanita : " + (totalWanita / countWanita));
        }
    }
        void infoDosenPalingTua(Dosen08[] arrayOfDosen) {
        Dosen08 tertua = arrayOfDosen[0];

        for (Dosen08 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("\n=== DOSEN PALING TUA ===");
        tertua.cetakInfo();
    }

    void infoDosenPalingMuda(Dosen08[] arrayOfDosen) {
        Dosen08 termuda = arrayOfDosen[0];

        for (Dosen08 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("\n=== DOSEN PALING MUDA ===");
        termuda.cetakInfo();
    }
}

