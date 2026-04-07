package CM1;

import java.util.Scanner;

public class MahasiswaMain08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Mahasiswa08 m = new Mahasiswa08(null, null, null);

        System.out.println("\n === DATA MENU === ");
        m.tampilinfomasimenu();

        System.out.print("Pilih Menu : ");
        int Menu = sc.nextInt();
        sc.nextLine();

        sc.close();
    }    
}
