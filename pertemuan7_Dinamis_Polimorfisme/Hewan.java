// Kelas induk
abstract class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }

    // Method abstrak untuk polimorfisme dinamis
    abstract void suara();
}
