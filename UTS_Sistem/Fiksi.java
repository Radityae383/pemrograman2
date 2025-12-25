package UTS_Sistem;

public class Fiksi extends Buku {
    public Fiksi(String judul, String penulis, int halaman) {
        super(judul, penulis, halaman);
    }

    @Override
    public String info() {
        return "Fiksi - " + super.info();
    }
}

