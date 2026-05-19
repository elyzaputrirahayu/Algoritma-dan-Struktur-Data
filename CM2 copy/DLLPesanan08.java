package CM2 copy;

public class DLLPesanan08 {
    nodeAntrian08 head;
    nodePesanan08 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPesanan(Pembeli08 pembeli, Pesanan08 pesanan) {

        nodePesanan08 newNode = new nodePesanan08(tail, pembeli, pesanan, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void sortingPesanan() {
        if (head == null) {
            return;
        }

        boolean tukar;

        do {
            tukar = false;

            nodePesanan08 current = head;

            while (current.next != null) {

                if (current.pesanan.namaPesanan.compareToIgnoreCase(current.next.pesanan.namaPesanan) > 0) {

                    Pesanan08 tempPesanan = current.pesanan;
                    Pembeli08 tempPembeli = current.pembeli;

                    current.pesanan = current.next.pesanan;
                    current.pembeli = current.next.pembeli;

                    current.next.pesanan = tempPesanan;
                    current.next.pembeli = tempPembeli;

                    tukar = true;
                }

                current = current.next;
            }

        } while (tukar);
    }

    public void laporanPesanan() {

    if (isEmpty()) {
        System.out.println("Belum ada pesanan");
        return;
    }

    sortingPesanan();

    nodePesanan08 temp = head;

    int total = 0;

    System.out.println("====================================");
    System.out.println("     LAPORAN PESANAN (URUT NAMA)    ");
    System.out.println("====================================");

    System.out.printf("%-10s %-20s %-10s\n", "Kode", "Nama Pesanan", "Harga");

    System.out.println("====================================");

    while (temp != null) {

        System.out.printf("%-10d %-20s %-10d\n", temp.pesanan.kodePesanan, temp.pesanan.namaPesanan, temp.pesanan.harga);

        total += temp.pesanan.harga;

        temp = temp.next;
    }

    System.out.println("====================================");
    System.out.println("Total Pendapatan : " + total);
}
}
