// Main class untuk uji polimorfisme
public class Main_Hewan {
    public static void main(String[] args) {
        // Membuat array hewan
        Hewan[] daftarHewan = {
            new Anjing("Bobby"),
            new Kucing("Mimi"),
            new Burung("Tweety")
        };

        // Memanggil method suara() secara polimorfik
        for (Hewan h : daftarHewan) {
            h.suara();  // Dinamis Polimorfisme terjadi di sini
        }
    }
}
