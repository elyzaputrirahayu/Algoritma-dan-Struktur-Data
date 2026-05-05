package PERTEMUAN11;

public class QueueLinkedList08 {
    LinkedList08 front;
    LinkedList08 rear;
    int size;

    public QueueLinkedList08() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false;
    }

    public void enqueue(Mhs08 mhs) {
        LinkedList08 newNode = new LinkedList08(mhs);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println(mhs.nama + " masuk antrian");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.print("Memanggil: ");
            front.data.tampil();

            front = front.next;
            size--;

            if (front == null) {
                rear = null;
            }
        }
    }

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.print("Terdepan: ");
            front.data.tampil();
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.print("Terakhir: ");
            rear.data.tampil();
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            LinkedList08 temp = front;
            System.out.println("Daftar antrian:");
            while (temp != null) {
                temp.data.tampil();
                temp = temp.next;
            }
        }
    }

    public int jumlah() {
        return size;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }
}
