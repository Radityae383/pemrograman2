// Subkelas Anjing
class Anjing extends Hewan {
    Anjing(String nama) {
        super(nama);
    }

    @Override
    void suara() {
        System.out.println(nama + " mengonggong: Guk guk!");
    }
}

