package CM1;

public class DataMahasiswa08 {



    void datasemuaMahasiswa(Mahasiswa08 [] arrayOfMahasiswa) {
        System.out.println("\n === DATA SEMUA MAHASISWA === ");
        for (Mahasiswa08 M : arrayOfMahasiswa) {
            M.datasemuaMahasiswa(arrayOfMahasiswa);
        }
    }

    void Menu (Mahasiswa08 [] arrayOfMenu ) {
        System.out.println("\n === DATA MENU === ");

        for (Mahasiswa08 m : arrayOfMenu) {
            m.tampilinfomasimenu();
        }
    }
}
