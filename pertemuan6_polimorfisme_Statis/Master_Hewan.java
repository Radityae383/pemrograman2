package Pertemuan6_Polimorfisme_Statis;

public class Master_Hewan {

    private String namaHewan;

    // Search berdasarkan nama
    public void search(String nama) {
        System.out.println(">> Mencari hewan berdasarkan nama: " + nama);
        if (nama.equalsIgnoreCase("Kucing") || nama.equalsIgnoreCase("Anjing") ||
            nama.equalsIgnoreCase("Kelinci") || nama.equalsIgnoreCase("Ayam") ||
            nama.equalsIgnoreCase("Kuda")) {
            namaHewan = capitalize(nama);
            System.out.println("Hewan ditemukan: " + namaHewan);
        } else {
            System.out.println("Hewan '" + nama + "' tidak ada di database.");
            namaHewan = null;
        }
        System.out.println("---------------------------");
    }

    // Search berdasarkan kode hewan
    public void search(int kodeHewan) {
        System.out.println(">> Mencari hewan berdasarkan kode: " + kodeHewan);
        switch (kodeHewan) {
            case 201: namaHewan = "Kucing"; break;
            case 202: namaHewan = "Anjing"; break;
            case 203: namaHewan = "Kelinci"; break;
            case 204: namaHewan = "Ayam"; break;
            case 205: namaHewan = "Kuda"; break;
            default: namaHewan = null; break;
        }

        if (namaHewan != null) {
            System.out.println("Hewan dengan kode " + kodeHewan + " adalah: " + namaHewan);
        } else {
            System.out.println("Kode hewan " + kodeHewan + " tidak ditemukan!");
        }
        System.out.println("---------------------------");
    }

    // Search berdasarkan nama + usia
    public void search(String nama, int usia) {
        System.out.println(">> Mencari hewan: " + nama + " (Usia " + usia + " tahun)");
        namaHewan = capitalize(nama);
        System.out.println("Hewan ditemukan: " + namaHewan + " (" + usia + " tahun)");
        System.out.println("---------------------------");
    }

    // Helper: huruf kapital di awal
    private String capitalize(String s) {
        if (s == null || s.isEmpty()) return s;
        return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }
}

