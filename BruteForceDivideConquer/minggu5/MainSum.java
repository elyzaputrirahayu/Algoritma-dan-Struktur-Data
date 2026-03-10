package BruteForceDivideConquer.minggu5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int elemen = input.nextInt();

        Sum08 sm = new Sum08(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan Keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = input.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan BruteForce : "+sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: "+sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}
