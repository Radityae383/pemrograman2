package Pertemuan6_Constructor;

// Class Hewan
public class Hewan {
    public String nama;
    public String jenis;
    public int umur;
    private boolean statusTerdaftar = false;

    // Constructor
    public Hewan(String nama, String jenis, int umur, String idHewan) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
        // Misal hewan dianggap terdaftar kalau idHewan panjang >= 3
        this.statusTerdaftar = idHewan.length() >= 3;
    }

    // Method cek status
    public void checkStatus() {
        if (statusTerdaftar) {
            System.out.println(">> Hewan Sudah Terdaftar");
            System.out.println(">> Nama Hewan : " + nama);
            System.out.println(">> Jenis Hewan: " + jenis);
            System.out.println(">> Umur       : " + umur + " tahun\n");
        } else {
            System.out.println("!! Hewan Belum Terdaftar\n");
        }
    }
}
