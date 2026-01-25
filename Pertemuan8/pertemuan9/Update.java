package Pertemuan9;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Update {

    Koneksi konek = new Koneksi();

    public void update(int nim, String nama, String alamat, String jenis) {
        try {
            konek.koneksi();

            String sql = "UPDATE mhs_ilkom SET nama=?, alamat=?, jeniskelamin=? WHERE nim=?";
            PreparedStatement ps = konek.con.prepareStatement(sql);

            ps.setString(1, nama);
            ps.setString(2, alamat);
            ps.setString(3, jenis);
            ps.setInt(4, nim);

            ps.executeUpdate();
            ps.close();

            JOptionPane.showMessageDialog(null, "Data berhasil diubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

