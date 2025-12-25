package UTS_Sistem;

import java.util.ArrayList;

public class Implement_System implements Interface_System {

    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    @Override
    public void tambahBuku(Buku b) {
        daftarBuku.add(b);
    }

    @Override
    public void hapusBuku(int index) {
        if(index >=0 && index < daftarBuku.size()) daftarBuku.remove(index);
    }

    @Override
    public void editBuku(int index, Buku b) {
        if(index >=0 && index < daftarBuku.size()) {
            daftarBuku.set(index, b);
        }
    }

    @Override
    public int totalHalaman() {
        // Method reference diperbaiki
        return daftarBuku.stream().mapToInt(Buku::getHalaman).sum();
    }

    public ArrayList<Buku> getDaftarBuku() {
        return daftarBuku;
    }
}
