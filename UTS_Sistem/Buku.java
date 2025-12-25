package UTS_Sistem;

public class Buku {
    private String judul;
    private String penulis;
    private int halaman;

    public Buku(String judul, String penulis, int halaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.halaman = halaman;
    }

    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }

    public String getPenulis() { return penulis; }
    public void setPenulis(String penulis) { this.penulis = penulis; }

    public int getHalaman() { return halaman; }
    public void setHalaman(int halaman) { this.halaman = halaman; }

    public String info() {
        return judul + " | " + penulis + " | " + halaman + " halaman";
    }
}
