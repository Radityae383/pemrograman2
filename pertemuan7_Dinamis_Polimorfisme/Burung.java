// Subkelas Burung
class Burung extends Hewan {
    Burung(String nama) {
        super(nama);
    }

    @Override
    void suara() {
        System.out.println(nama + " berkicau: Cit cit!");
    }
}