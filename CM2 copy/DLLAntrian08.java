package CM2 copy;

public class DLLAntrian08 {
    nodeAntrian08 head;
    nodeAntrian08 tail;
    int nomor = 1;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(Pembeli08 pembeli) {

        nodeAntrian08 newNode = new nodeAntrian08(tail, nomor, pembeli, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        System.out.println(
        "Antrian berhasil ditambahkan dengan nomor : " + nomor);
        nomor ++;
    }

    public void cetakAntrian() {

    if (isEmpty()) {
        System.out.println("Antrian kosong");
        return;
    }

    nodeAntrian08 temp = head;

    System.out.println("====================================");
    System.out.println("       DAFTAR ANTRIAN PEMBELI       ");
    System.out.println("====================================");
    System.out.printf("%-12s %-15s %-15s\n", "No Antrian", "Nama", "No HP");
    System.out.println("====================================");

    while (temp != null) {

        System.out.printf("%-12d %-15s %-15s\n", temp.nomorAntrian, temp.pembeli.namaPembeli, temp.pembeli.noHp);

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
