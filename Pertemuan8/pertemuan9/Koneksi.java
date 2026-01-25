package Pertemuan9;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Koneksi {

    public Connection con = null;

    public void koneksi() {
        try {
            String connectionURL = "jdbc:mysql://localhost:3306/mahasiswa?useSSL=false&serverTimezone=UTC";
            String username = "root"; // ganti kalau MySQL lo pakai password
            String password = "";     // kosong kalau default XAMPP

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(connectionURL, username, password);

            JOptionPane.showMessageDialog(null, "Koneksi Berhasil!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi database gagal! Cek console error");
            e.printStackTrace(); // biar muncul error di console
        }
    }

    // Optional: bisa bikin getter supaya Insert lebih rapi
    public Connection getConnection() {
        if (con == null) {
            koneksi();
        }
        return con;
    }

    public static void main(String[] args) {
        Koneksi koneksi = new Koneksi();
        koneksi.koneksi();
    }
}
