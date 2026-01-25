package Pertemuan9;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Delete {

    Koneksi konek = new Koneksi();

    public void delete(int nim) {
        try {
            konek.koneksi();

            String sql = "DELETE FROM mhs_ilkom WHERE nim = ?";
            PreparedStatement ps = konek.con.prepareStatement(sql);

            ps.setInt(1, nim);
            ps.executeUpdate();
            ps.close();

            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

