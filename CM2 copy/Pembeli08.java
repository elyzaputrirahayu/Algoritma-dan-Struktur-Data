package CM2 "copy";

public class Pembeli08 {
    String namaPembeli;
    String noHp;

    public Pembeli08 (String namaPembeli, String noHp) {
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }

    public void tampil() {
        System.out.println(namaPembeli + " - " + noHp);
    }
}

