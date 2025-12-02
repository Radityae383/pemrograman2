package Pertemuan6_Constructor;

// Class Main
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Mimi", "Kucing", 2, "K-001");
        Hewan anjing = new Hewan("Bobby", "Anjing", 3, "A-12");

        kucing.checkStatus();
        anjing.checkStatus();
    }
}