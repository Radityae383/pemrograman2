package Pertemuan6_Polimorfisme_Statis;

public class Main {
    public static void main(String[] args) {
        Master_Hewan hewan = new Master_Hewan();

        hewan.search("Kucing");        // search pakai nama
        hewan.search(201);             // search pakai kode
        hewan.search("Kucing", 3);     // search pakai nama + usia
    }
}