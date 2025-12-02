package Pertemuan5_Inherintance_Hewan_Override;

public class Hewan {

    protected String nama;
    protected String jenis;

    public Hewan() {
    }

    public void daftarHewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Jenis      : " + jenis);
    }

    public double hitungTotal(double a, double b) {
        return a + b;
    }
}
