package Pertemuan6_Polimorfisme_Statis;

public class Main {
    public static void main(String[] args) {
        Master_Hewan db = new Master_Hewan();

        db.search("Kucing");        // search by name
        db.search(202);             // search by code
        db.search("Ayam", 2);       // search by name + age
        db.search("Domba");         // search nama yang tidak ada
        db.search(999);             // search kode yang tidak ada
    }
}
