package BruteForceDivideConquer.minggu5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        int nilai = input.nextInt();

        Faktorial08 fk = new Faktorial08();
        System.out.println("Nilai faktorial " +nilai+ " menggunakan BF :" +fk.faktorialBF((nilai)));
        System.out.println("Nilai faktorial "+nilai+ " menggunakan DC : "+fk.faktorialDC(nilai));
    }
}
