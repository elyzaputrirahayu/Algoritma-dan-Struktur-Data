package JOBSHEET10TUGAS;

public class AntrianKRS08 {
    Mahasiswa08[] data;
    int front, rear, size, max;
    int jumlahDilayani = 0;

    public AntrianKRS08(int max) {
        this.max = max;
        data = new Mahasiswa08[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa08 m) {
        if (IsFull()) {
            System.out.println("Antrian penuh!");
        } else {
            rear = (rear + 1) % max;
            data[rear] = m;
            size++;
        }
    }

    public void dequeue2() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2!");
            return;
        }

        System.out.println("Memproses 2 mahasiswa:");

        for (int i = 0; i < 2; i++) {
            Mahasiswa08 m = data[front];
            m.tampil();
            front = (front + 1) % max;
            size--;
            jumlahDilayani++;
        }
    }

    public void lihatDepan() {
        if (IsEmpty()) {
            System.out.println("Kosong");
        } else {
            data[front].tampil();
            data[(front + 1) % max].tampil();
        }
    }

    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Kosong");
        } else {
            data[rear].tampil();
        }
    }

    public void tampilSemua() {
        if (IsEmpty()) {
            System.out.println("Kosong");
        } else {
            for (int i = 0; i < size; i++) {
                data[(front + i) % max].tampil();
            }
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah antrian: " + size);
    }

    public void jumlahDilayani() {
        System.out.println("Sudah dilayani: " + jumlahDilayani);
    }

    public void sisaBelumDilayani() {
        int sisa = 30 - jumlahDilayani;
        System.out.println("Sisa belum dilayani: " + sisa);
    }

    public void clear() {
        front = rear = -1;
        size = 0;
    }
}