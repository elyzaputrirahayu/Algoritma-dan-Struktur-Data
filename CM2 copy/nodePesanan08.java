package CM2;

public class nodePesanan08 {
    Pembeli08 pembeli;
    Pesanan08 pesanan;
    nodePesanan08 prev;
    nodePesanan08 next;

    public nodePesanan08 (nodePesanan08 prev, Pembeli08 pembeli, Pesanan08 pesanan, nodePesanan08 next) {
        this.prev = prev;
        this.pembeli = pembeli;
        this.pesanan = pesanan;
        this.next = next;
    }
}
