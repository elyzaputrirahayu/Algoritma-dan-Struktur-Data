import java.util.Scanner;

public class ArrayMenghitungIPSem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] namaMK = new String[n];
        int[] sks = new int[n];
        String[] nilaiHuruf = new String[n];
        double[] bobot = new double[n];

        double totalNilai = 0;
        int totalSKS = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            namaMK[i] = sc.nextLine();

            System.out.print("SKS              : ");
            sks[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Nilai Huruf      : ");
            nilaiHuruf[i] = sc.nextLine();

            if (nilaiHuruf[i].equalsIgnoreCase("A")) {
                bobot[i] = 4.0;
            } else if (nilaiHuruf[i].equalsIgnoreCase("B+")) {
                bobot[i] = 3.5;
            } else if (nilaiHuruf[i].equalsIgnoreCase("B")) {
                bobot[i] = 3.0;
            } else if (nilaiHuruf[i].equalsIgnoreCase("C+")) {
                bobot[i] = 2.5;
            } else if (nilaiHuruf[i].equalsIgnoreCase("C")) {
                bobot[i] = 2.0;
            } else if (nilaiHuruf[i].equalsIgnoreCase("D")) {
                bobot[i] = 1.0;
            } else {
                bobot[i] = 0.0;
            }

            totalNilai += bobot[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalNilai / totalSKS;

        System.out.println("\n==============================");
        System.out.println("IP Semester : " + ip);

        sc.close();
    }
}
