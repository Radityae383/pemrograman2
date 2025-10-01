package pertemuan1;

import java.util.Scanner;

public class SistemMahasiswa {
    static final int MAKS_MAHASISWA = 100;
    static Mahasiswa[] daftarMahasiswa = new Mahasiswa[MAKS_MAHASISWA];
    static int jumlahData = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            tampilkanMenu();
            pilihan = Integer.parseInt(scanner.nextLine());
            switch (pilihan) {
                case 1:
                    tambahMahasiswa();
                    break;
                case 2:
                    tampilkanMahasiswa();
                    break;
                case 0:
                    System.out.println("Terima kasih. Keluar program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }

    public static void tampilkanMenu() {
        System.out.println("\n=== MENU ===");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Tampilkan Mahasiswa");
        System.out.println("0. Keluar");
        System.out.print("Pilih: ");
    }

    public static void tambahMahasiswa() {
        if (jumlahData >= MAKS_MAHASISWA) {
            System.out.println("Data penuh!");
            return;
        }

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Jumlah Mata Kuliah: ");
        int jumlahMK = Integer.parseInt(scanner.nextLine());

        double[] nilai = new double[jumlahMK];
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = Double.parseDouble(scanner.nextLine());
        }

        Mahasiswa mhs = new Mahasiswa(nim, nama, nilai);
        daftarMahasiswa[jumlahData] = mhs;
        jumlahData++;

        System.out.println("Data mahasiswa ditambahkan.");
    }

    public static void tampilkanMahasiswa() {
        if (jumlahData == 0) {
            System.out.println("Belum ada data.");
            return;
        }

        System.out.println("\n=== DATA MAHASISWA ===");
        for (int i = 0; i < jumlahData; i++) {
            Mahasiswa m = daftarMahasiswa[i];
            System.out.println((i + 1) + ". " + m.toString());
        }
    }
}
