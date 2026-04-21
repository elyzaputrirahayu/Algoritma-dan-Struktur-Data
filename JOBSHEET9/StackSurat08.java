package JOBSHEET9;

public class StackSurat08 {
    Surat08[] stack;
    int top;
    int size;

    public StackSurat08(int size) {
        this.size = size;
        stack = new Surat08[size];
        top = -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat08 s) {
        if (!isFull()) {
            top++;
            stack[top] = s;
            System.out.println("Surat berhasil ditambahkan!");
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Surat08 pop() {
        if (!isEmpty()) {
            Surat08 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Tidak ada surat!");
            return null;
        }
    }

    public Surat08 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public void cari(String nama) {
        boolean ketemu = false;

        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                stack[i].tampil();
                ketemu = true;
            }
        }

        if (!ketemu) {
            System.out.println("Surat tidak ditemukan!");
        }
    }

    public void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Belum ada surat");
        } else {
            for (int i = 0; i <= top; i++) {
                stack[i].tampil();
            }
        }
    }
}
