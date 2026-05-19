import java.util.Scanner;

public class Tugas2{
    Scanner sc = new Scanner(System.in);

    public static void inputJadwal(String[][] jadwal, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Hari Kuliah      : ");
            jadwal[i][2] = sc.nextLine();

            System.out.print("Jam Kuliah       : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    public static void tampilkanSemuaJadwal(String[][] jadwal, int n) {
        System.out.println("\nDAFTAR JADWAL KULIAH");
        System.out.println("==============================================================");
        System.out.printf("%-25s %-20s %-10s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("==============================================================");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-20s %-10s %-15s\n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    public static void tampilkanByHari(String[][] jadwal, int n, String hari) {
        System.out.println("\nJadwal Hari " + hari);
        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " | " +
                                   jadwal[i][1] + " | " +
                                   jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    public static void tampilkanByMataKuliah(String[][] jadwal, int n, String mk) {
        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println("\nDetail Jadwal Mata Kuliah");
                System.out.println("Mata Kuliah : " + jadwal[i][0]);
                System.out.println("Ruang       : " + jadwal[i][1]);
                System.out.println("Hari        : " + jadwal[i][2]);
                System.out.println("Jam         : " + jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n, sc);

        tampilkanSemuaJadwal(jadwal, n);

        System.out.print("\nMasukkan hari yang ingin dicari: ");
        String hari = sc.nextLine();
        tampilkanByHari(jadwal, n, hari);

        System.out.print("\nMasukkan nama mata kuliah yang ingin dicari: ");
        String mk = sc.nextLine();
        tampilkanByMataKuliah(jadwal, n, mk);

        sc.close();
    }
}

// AddFirst
//public void addFirst(Pembeli08 pembeli) {

//     nodeAntrian08 newNode =
//         new nodeAntrian08(null, nomor, pembeli, head);

//     if (isEmpty()) {

//         head = tail = newNode;

//     } else {

//         head.prev = newNode;
//         head = newNode;
//     }

//     System.out.println("Data berhasil ditambahkan di depan");
//     nomor++;
// }

// Add Last

// public void addLast(Pembeli08 pembeli) {

//     nodeAntrian08 newNode =
//         new nodeAntrian08(tail, nomor, pembeli, null);

//     if (isEmpty()) {

//         head = tail = newNode;

//     } else {

//         tail.next = newNode;
//         newNode.prev = tail;
//         tail = newNode;
//     }

//     System.out.println("Data berhasil ditambahkan di belakang");
//     nomor++;
// }

// remove first
// public void removeFirst() {

//     if (isEmpty()) {

//         System.out.println("List kosong");

//     } else if (head == tail) {

//         head = tail = null;

//     } else {

//         head = head.next;
//         head.prev = null;
//     }

//     System.out.println("Data depan berhasil dihapus");
// }

//remove last
// public void removeLast() {

//     if (isEmpty()) {

//         System.out.println("List kosong");

//     } else if (head == tail) {

//         head = tail = null;

//     } else {

//         tail = tail.prev;
//         tail.next = null;
//     }

//     System.out.println("Data belakang berhasil dihapus");
// }

// ascending berdasarkan nama
// public void sortingNamaAscending() {

//     if (head == null) {
//         return;
//     }

//     boolean tukar;

//     do {

//         tukar = false;

//         nodePesanan08 current = head;

//         while (current.next != null) {

//             if (current.pesanan.namaPesanan.compareToIgnoreCase(
//                     current.next.pesanan.namaPesanan) > 0) {

//                 Pesanan08 tempPesanan = current.pesanan;
//                 Pembeli08 tempPembeli = current.pembeli;

//                 current.pesanan = current.next.pesanan;
//                 current.pembeli = current.next.pembeli;

//                 current.next.pesanan = tempPesanan;
//                 current.next.pembeli = tempPembeli;

//                 tukar = true;
//             }

//             current = current.next;
//         }

//     } while (tukar);
// }

// sorting berdasarkan harga ascending
// public void sortingHargaAscending() {

//     if (head == null) {
//         return;
//     }

//     boolean tukar;

//     do {

//         tukar = false;

//         nodePesanan08 current = head;

//         while (current.next != null) {

//             if (current.pesanan.harga >
//                 current.next.pesanan.harga) {

//                 Pesanan08 tempPesanan = current.pesanan;
//                 Pembeli08 tempPembeli = current.pembeli;

//                 current.pesanan = current.next.pesanan;
//                 current.pembeli = current.next.pembeli;

//                 current.next.pesanan = tempPesanan;
//                 current.next.pembeli = tempPembeli;

//                 tukar = true;
//             }

//             current = current.next;
//         }

//     } while (tukar);
// }

// sorting berdasarkan kode pemesanan ascending
// public void sortingPesanan() {

//     if (head == null) {
//         return;
//     }

//     boolean tukar;

//     do {

//         tukar = false;

//         nodePesanan08 current = head;

//         while (current.next != null) {

//             if (current.pesanan.kodePesanan >
//                 current.next.pesanan.kodePesanan) {

//                 Pesanan08 tempPesanan = current.pesanan;
//                 Pembeli08 tempPembeli = current.pembeli;

//                 current.pesanan = current.next.pesanan;
//                 current.pembeli = current.next.pembeli;

//                 current.next.pesanan = tempPesanan;
//                 current.next.pembeli = tempPembeli;

//                 tukar = true;
//             }

//             current = current.next;
//         }

//     } while (tukar);
// }

// linklist queue dinamis
// package PERTEMUAN11;

// public class QueueLinkedList08 {

//     NodeMahasiswa08 head;
//     NodeMahasiswa08 tail;

//     boolean isEmpty() {
//         return head == null;
//     }

//     // tambah antrian
//     public void enqueue(Mahasiswa08 input) {

//         NodeMahasiswa08 newNode =
//                 new NodeMahasiswa08(input, null);

//         if (isEmpty()) {

//             head = tail = newNode;

//         } else {

//             tail.next = newNode;
//             tail = newNode;
//         }

//         System.out.println("Data masuk queue");
//     }

//     // hapus antrian depan
//     public void dequeue() {

//         if (isEmpty()) {

//             System.out.println("Queue kosong");

//         } else if (head == tail) {

//             head = tail = null;

//         } else {

//             head = head.next;
//         }

//         System.out.println("Data depan keluar");
//     }

//     public void print() {

//         if (isEmpty()) {

//             System.out.println("Queue kosong");

//         } else {

//             NodeMahasiswa08 temp = head;

//             System.out.println("\nISI QUEUE");

//             while (temp != null) {

//                 temp.data.tampilInformasi();

//                 temp = temp.next;
//             }
//         }
//     }
// }

// main queue dinamis
// package PERTEMUAN11;

// import java.util.Scanner;

// public class MainQueue08 {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         QueueLinkedList08 q =
//                 new QueueLinkedList08();

//         int pilih;

//         do {

//             System.out.println("\n=== MENU QUEUE ===");
//             System.out.println("1. Enqueue");
//             System.out.println("2. Dequeue");
//             System.out.println("3. Print");
//             System.out.println("0. Keluar");

//             System.out.print("Pilih: ");
//             pilih = Integer.parseInt(sc.nextLine());

//             switch (pilih) {

//                 case 1:

//                     System.out.print("NIM   : ");
//                     String nim = sc.nextLine();

//                     System.out.print("Nama  : ");
//                     String nama = sc.nextLine();

//                     System.out.print("Kelas : ");
//                     String kelas = sc.nextLine();

//                     System.out.print("IPK   : ");
//                     double ipk =
//                             Double.parseDouble(
//                                     sc.nextLine());

//                     Mahasiswa08 m =
//                             new Mahasiswa08(
//                                     nim,
//                                     nama,
//                                     kelas,
//                                     ipk);

//                     q.enqueue(m);

//                     break;

//                 case 2:

//                     q.dequeue();

//                     break;

//                 case 3:

//                     q.print();

//                     break;

//                 case 0:

//                     System.out.println(
//                             "Program selesai");

//                     break;

//                 default:

//                     System.out.println(
//                             "Menu tidak valid");
//             }

//         } while (pilih != 0);

//         sc.close();
//     }
// }

// stack dinamis
// package PERTEMUAN11;

// public class StackLinkedList08 {

//     NodeMahasiswa08 head;

//     boolean isEmpty() {
//         return head == null;
//     }

//     // PUSH
//     public void push(Mahasiswa08 input) {

//         NodeMahasiswa08 newNode =
//                 new NodeMahasiswa08(input, null);

//         if (isEmpty()) {

//             head = newNode;

//         } else {

//             newNode.next = head;
//             head = newNode;
//         }

//         System.out.println("Data masuk stack");
//     }

//     // POP
//     public void pop() {

//         if (isEmpty()) {

//             System.out.println("Stack kosong");

//         } else {

//             head = head.next;
//         }

//         System.out.println("Data teratas dihapus");
//     }

//     public void print() {

//         if (isEmpty()) {

//             System.out.println("Stack kosong");

//         } else {

//             NodeMahasiswa08 temp = head;

//             System.out.println("\nISI STACK");

//             while (temp != null) {

//                 temp.data.tampilInformasi();

//                 temp = temp.next;
//             }
//         }
//     }
// }

// main stack
// package PERTEMUAN11;

// import java.util.Scanner;

// public class MainStack08 {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         StackLinkedList08 s =
//                 new StackLinkedList08();

//         int pilih;

//         do {

//             System.out.println("\n=== MENU STACK ===");
//             System.out.println("1. Push");
//             System.out.println("2. Pop");
//             System.out.println("3. Print");
//             System.out.println("0. Keluar");

//             System.out.print("Pilih: ");
//             pilih = Integer.parseInt(sc.nextLine());

//             switch (pilih) {

//                 case 1:

//                     System.out.print("NIM   : ");
//                     String nim = sc.nextLine();

//                     System.out.print("Nama  : ");
//                     String nama = sc.nextLine();

//                     System.out.print("Kelas : ");
//                     String kelas = sc.nextLine();

//                     System.out.print("IPK   : ");
//                     double ipk =
//                             Double.parseDouble(
//                                     sc.nextLine());

//                     Mahasiswa08 m =
//                             new Mahasiswa08(
//                                     nim,
//                                     nama,
//                                     kelas,
//                                     ipk);

//                     s.push(m);

//                     break;

//                 case 2:

//                     s.pop();

//                     break;

//                 case 3:

//                     s.print();

//                     break;

//                 case 0:

//                     System.out.println(
//                             "Program selesai");

//                     break;

//                 default:

//                     System.out.println(
//                             "Menu tidak valid");
//             }

//         } while (pilih != 0);

//         sc.close();
//     }
// }

