package pertemuan3;

public class utama{
    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa("2455201069", "Raditya E.", 3.52);

        // Data awal
        mhs.tampilkanInfo();
        System.out.println("Predikat: " + mhs.hitungPredikat());

        // Update nama
        mhs.gantiNama("Raditya Eka F.");

        // Data setelah update
        System.out.println("\nData terbaru:");
        mhs.tampilkanInfo();

        // Cek kelulusan
        double minimalIPK = 3.0;
        System.out.println(mhs.lulus(minimalIPK) ? "Selamat, lulus!" : "Belum lulus.");

        // Hitung bonus
        System.out.println("Bonus yang diterima: Rp " + mhs.hitungBonus());
    }
}