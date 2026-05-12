package JOBSHEET12;

public class DoubleLinkedList08 {
    Node08 head;
    Node08 tail;

    public DoubleLinkedList08() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa08 data) {
        Node08 newNode08 = new Node08(data);
        if (isEmpty()) {
            head = tail = newNode08;
        } else {
            newNode08.next = head;
            head.prev = newNode08;
            head = newNode08;
        }
    }

    public void addLast (Mahasiswa08 data) {
        Node08 newNode08 = new Node08(data);
        if (isEmpty()) {
            head = tail = newNode08;
        } else {
            tail.next = newNode08;
            newNode08.prev = tail;
            tail = newNode08;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa08 data) {
        Node08 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node08 newNode08 = new Node08(data);

        // jika current adalah tail, node baru ditambahkan diakhir
        if (current == tail) {
            newNode08.prev = current;
            current.next = newNode08;
            tail = newNode08;
        } else { //node baru disisipkan ditengah
            newNode08.prev = current;
            newNode08.next = current.next;
            current.next.prev = newNode08;
            current.next = newNode08;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        Node08 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
        } else {
            Node08 temp = tail;

            while (temp != null) {
                temp.data.tampil();
                temp = temp.prev;
            }
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else if (head == tail) {

            System.out.println("Data yang dihapus : ");
            head.data.tampil();

            head = tail = null;

        } else {

            System.out.println("Data yang dihapus : ");
            head.data.tampil();

            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else if (head == tail) {

            System.out.println("Data yang dihapus : ");
            tail.data.tampil();

            head = tail = null;

        } else {

            System.out.println("Data yang dihapus : ");
            tail.data.tampil();
            
            tail = tail.prev;
            tail.next = null;
        }
    }
}