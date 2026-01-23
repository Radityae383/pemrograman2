package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import koneksi.Koneksi;

public class JadwalKeretaDAO {

    Connection conn;

    public JadwalKeretaDAO() {
        conn = Koneksi.getConnection();
        if(conn == null) throw new RuntimeException("Gagal koneksi ke db_stasiun");
    }

    public void insert(String kodeStasiun, String namaKereta, String waktu) {
        try {
            String sql = "INSERT INTO jadwal (kode_stasiun, nama_kereta, waktu_berangkat) VALUES (?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, kodeStasiun);
            pst.setString(2, namaKereta);
            pst.setString(3, waktu);
            pst.executeUpdate();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void update(int idJadwal, String kodeStasiun, String namaKereta, String waktu) {
        try {
            String sql = "UPDATE jadwal SET kode_stasiun=?, nama_kereta=?, waktu_berangkat=? WHERE id_jadwal=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, kodeStasiun);
            pst.setString(2, namaKereta);
            pst.setString(3, waktu);
            pst.setInt(4, idJadwal);
            pst.executeUpdate();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(int idJadwal) {
        try {
            String sql = "DELETE FROM jadwal WHERE id_jadwal=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, idJadwal);
            pst.executeUpdate();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void tampilData(JTable table) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Jadwal");
        model.addColumn("Kode Stasiun");
        model.addColumn("Nama Kereta");
        model.addColumn("Waktu Berangkat");
        model.addColumn("Nama Stasiun");

        try {
            String sql = "SELECT j.id_jadwal, j.kode_stasiun, j.nama_kereta, j.waktu_berangkat, s.nama_stasiun "
                       + "FROM jadwal j "
                       + "INNER JOIN stasiun s ON j.kode_stasiun = s.kode_stasiun";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id_jadwal"),
                    rs.getString("kode_stasiun"),
                    rs.getString("nama_kereta"),
                    rs.getTime("waktu_berangkat"),
                    rs.getString("nama_stasiun")
                });
            }
        } catch(Exception e) {
            throw new RuntimeException("Gagal tampil data: " + e.getMessage());
        }

        table.setModel(model);
    }
}
