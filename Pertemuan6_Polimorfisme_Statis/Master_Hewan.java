package Pertemuan6_Polimorfisme_Statis;

public class Master_Hewan {

    private String namaHewan;

    // Search berdasarkan nama
    void search(String nama) {
        System.out.println("Mencari hewan dengan nama: " + nama);
        switch (nama) {
            case "Kucing":
                namaHewan = "Kucing";
                break;
            case "Anjing":
                namaHewan = "Anjing";
                break;
            case "Kelinci":
                namaHewan = "Kelinci";
                break;
            case "Ayam":
                namaHewan = "Ayam";
                break;
            case "Kuda":
                namaHewan = "Kuda";
                break;
            default:
                namaHewan = null;
                System.out.println(">> Hewan tidak ditemukan dalam database.");
        }

        if (namaHewan != null) {
            System.out.println(">> Hewan ditemukan: " + namaHewan);
        }
    }

    // Search berdasarkan kode hewan
    void search(int kodeHewan) {
        System.out.println("Mencari hewan dengan KODE: " + kodeHewan);
        switch (kodeHewan) {
            case 201:
                namaHewan = "Kucing";
                break;
            case 202:
                namaHewan = "Anjing";
                break;
            case 203:
                namaHewan = "Kelinci";
                break;
            case 204:
                namaHewan = "Ayam";
                break;
            case 205:
                namaHewan = "Kuda";
                break;
            default:
                namaHewan = null;
                System.out.println(">> Kode hewan tidak ditemukan.");
        }

        if (namaHewan != null) {
            System.out.println(">> Hewan ditemukan: " + namaHewan);
        }
    }

    // Search berdasarkan nama + usia
    void search(String nama, int usia) {
        System.out.println("Mencari hewan: " + nama + " (Usia: " + usia + " tahun)");
        namaHewan = nama;
        System.out.println(">> Hewan ditemukan: " + namaHewan + " (" + usia + " tahun)");
    }
}