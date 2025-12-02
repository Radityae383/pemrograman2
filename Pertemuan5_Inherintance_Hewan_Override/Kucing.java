package Pertemuan5_Inherintance_Hewan_Override;

public class Kucing extends Hewan {

    private int jumlahMakan;
    private double hargaPerGram;

    public Kucing() {
        super();
    }

    public void beriMakan(int porsi, double harga) {
        jumlahMakan = porsi;
        hargaPerGram = harga;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Porsi Makan (gram) : " + jumlahMakan);
        System.out.println("Harga/Gram         : " + hargaPerGram);
        System.out.println("Total Biaya Makan  : " + hitungTotal(0.0, jumlahMakan * hargaPerGram));
    }
}