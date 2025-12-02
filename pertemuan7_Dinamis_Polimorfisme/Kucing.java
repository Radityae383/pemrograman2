// Subkelas Kucing
class Kucing extends Hewan {
    Kucing(String nama) {
        super(nama);
    }

    @Override
    void suara() {
        System.out.println(nama + " mengeong: Meong!");
    }
}
