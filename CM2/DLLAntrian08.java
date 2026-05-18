package CM2;

public class DLLAntrian08 {
    nodeAntrian08 head;
    nodeAntrian08 tail;
    int nomor = 1;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(Pembeli08 pembeli) {

        nodeAntrian08 newNode =
                new nodeAntrian08(tail, nomor, pembeli, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        System.out.println("Antrian berhasil ditambahkan");
        nomor++;
    }

    public void cetakAntrian() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        nodeAntrian08 temp = head;

        System.out.println("\n=== DAFTAR ANTRIAN ===");

        while (temp != null) {

            System.out.println(
                    "No Antrian : " + temp.nomorAntrian);

            temp.pembeli.tampil();

            System.out.println("---------------------");

            temp = temp.next;
        }
    }

    public nodeAntrian08 hapusAntrian() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }

        nodeAntrian08 temp = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return temp;
    }
}
