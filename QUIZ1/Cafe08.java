package QUIZ1;

public class Cafe08 {
    
    String pilihanMenu;
    String matchaLatte;
    String americanoCoffe;
    String waffle;
    String crepes;
    int jumlahMenu;
    int totalBayar;

    public Cafe08 () {

    }
    public Cafe08 (String pilihanMenu, String matchaLatte, String matchaLatteString, String americanoCoffe, String waffle, String crepes, int jumlahMenu, int totalBayar) {
        this.pilihanMenu = pilihanMenu;
        this.matchaLatte = matchaLatte;
        this.americanoCoffe = americanoCoffe;
        this.waffle = waffle;
        this.crepes = crepes;
        this.jumlahMenu = jumlahMenu;
        this.totalBayar = totalBayar;
    }

    void tampilkaninformasi() {
        System.out.println("Pilih Menu Makanan atau Minuman : " );
        System.out.println("1. Matcha Latte");
        System.out.println("2. americano Coffe");
        System.out.println("3. Crepes");
        System.out.println("4. Waffle");
    }

    void pilihanmenu () {
        if (pilihanMenu.equalsIgnoreCase("Matcha Latte")) {
            System.out.println("memilih matcha");
        } else if (pilihanMenu.equalsIgnoreCase("americanoCoffe")) {
            System.out.println("Memilih americano coffe");
        } else if (pilihanMenu.equalsIgnoreCase("Crepes")) {
            System.out.println("Memilih Crepes");
        } else if (pilihanMenu.equalsIgnoreCase("waffle")) {
            System.out.println("Memilih Waffle");
        } else {
            System.out.println("Pelanggan belum memilih");
        }
        return;
    }

    void hitungtotalbayar() {

        totalBayar = jumlahMenu;
        if (pilihanMenu == "matcha") {
            System.out.println("10000");
        } else if (pilihanMenu == "americano coffe") {
            System.out.println("15000");
        } else if (pilihanMenu == "Crepes") {
            System.out.println("8000");
        } else if (pilihanMenu == "waffle") {
            System.out.println("5000");
        }
    }
}
