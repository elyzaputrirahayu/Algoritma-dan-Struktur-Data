package QUIZ1;

import java.util.Scanner;

public class CafeMain08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Cafe08 Cafe1 = new Cafe08();

        System.out.print("Masukkan jumlah menu yang dipesan pelanggan : ");
        int jumlahMenu = sc.nextInt();

        Cafe1.tampilkaninformasi();

        Cafe08 [] arrayOfCafe08 = new Cafe08[jumlahMenu];

        for ( int i = 0; i < jumlahMenu; i++) {

            System.out.println("\nPelanggan Memilih Menu ");

            System.out.print("Memilih menu : " );
            String menuPilihan = sc.nextLine();
            sc.nextLine();

            arrayOfCafe08[i] = new Cafe08();

        }

        Cafe1.hitungtotalbayar();
    }
}
