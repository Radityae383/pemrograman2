package Pertemuan9;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Insert {

    Koneksi konek = new Koneksi();

    public void insert(int nim, String nama, String alamat, String jk) {
        try {
            Connection con = konek.getConnection();

            if (con == null) {
                JOptionPane.showMessageDialog(null, "Koneksi database gagal");
                return;
            }

            Statement statement = con.createStatement();

            // Pakai nama tabel yang benar: dataMahasiswa
            String sql = "INSERT INTO dataMahasiswa (NIM, Nama, Alamat, Gender) VALUES ("
                       + nim + ",'" + nama + "','" + alamat + "','" + jk + "')";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Insert tambah = new Insert();
        tambah.insert(2455, "Raditya Eka Ahmad", "Dsn. Ngegong Ds. Gedog", "L");
    }
}
