package Pertemuan5_Inherintance_Hewan_Override;

public class Anjing extends Hewan {

    private double biayaPerawatan;

    public Anjing() {
        super();
    }

    public void beriPerawatan(double biaya) {
        biayaPerawatan = biaya;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Biaya Perawatan : " + biayaPerawatan);
        System.out.println("Total Biaya     : " + hitungTotal(0.0, biayaPerawatan));
    }
}