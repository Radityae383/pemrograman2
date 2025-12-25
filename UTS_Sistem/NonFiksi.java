package UTS_Sistem;

public class NonFiksi extends Buku {
    public NonFiksi(String judul, String penulis, int halaman) {
        super(judul, penulis, halaman);
    }

    @Override
    public String info() {
        return "Non-Fiksi - " + super.info();
    }
}

