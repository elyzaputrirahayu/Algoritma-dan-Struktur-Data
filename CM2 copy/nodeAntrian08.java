package CM2;

public class nodeAntrian08 {
    int nomorAntrian;
    Pembeli08 pembeli;
    nodeAntrian08 prev;
    nodeAntrian08 next;

    public nodeAntrian08(nodeAntrian08 prev, int nomorAntrian, Pembeli08 pembeli, nodeAntrian08 next) {
        this.prev = prev;
        this.nomorAntrian = nomorAntrian;
        this.pembeli = pembeli;
        this.next = next;
    }
}
