package Pertemuan5_Inherintance_Hewan_Override;

public class Main {
    public static void main(String[] args) {

        Hewan[] daftarHewan = new Hewan[4];

        Kucing kucing1 = new Kucing();
        kucing1.daftarHewan("Miko", "Persia");
        kucing1.beriMakan(200, 1500);

        Kucing kucing2 = new Kucing();
        kucing2.daftarHewan("Snow", "Anggora");
        kucing2.beriMakan(300, 2000);

        Anjing anjing1 = new Anjing();
        anjing1.daftarHewan("Rocky", "Bulldog");
        anjing1.beriPerawatan(75000);

        Anjing anjing2 = new Anjing();
        anjing2.daftarHewan("Kuro", "Shiba Inu");
        anjing2.beriPerawatan(120000);

        daftarHewan[0] = kucing1;
        daftarHewan[1] = kucing2;
        daftarHewan[2] = anjing1;
        daftarHewan[3] = anjing2;

        // Polimorfisme: panggil method override di subclass
        for (Hewan h : daftarHewan) {
            System.out.println("======================");
            h.tampilkanInfo();
            System.out.println("----------------------");
        }
    }
}
