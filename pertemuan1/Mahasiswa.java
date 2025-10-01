package pertemuan1;

public class Mahasiswa {
    private String nim;
    private String nama;
    private double[] nilai;

    public Mahasiswa(String nim, String nama, double[] nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }

    public double hitungRata() {
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        return nilai.length == 0 ? 0 : total / nilai.length;
    }

    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama + ", R
