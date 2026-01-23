package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import koneksi.Koneksi;

public class StasiunDAO {

    Connection conn;

    public StasiunDAO() {
        conn = Koneksi.getConnection();
        if(conn == null) throw new RuntimeException("Gagal koneksi ke db_stasiun");
    }

    public void insert(String kode, String nama, String kota) {
        try {
            String sql = "INSERT INTO stasiun (kode_stasiun, nama_stasiun, kota) VALUES (?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, kode);
            pst.setString(2, nama);
            pst.setString(3, kota);
            pst.executeUpdate();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void update(String kode, String nama, String kota) {
        try {
            String sql = "UPDATE stasiun SET nama_stasiun=?, kota=? WHERE kode_stasiun=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, nama);
            pst.setString(2, kota);
            pst.setString(3, kode);
            pst.executeUpdate();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(String kode) {
        try {
            String sql = "DELETE FROM stasiun WHERE kode_stasiun=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, kode);
            pst.executeUpdate();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void tampilData(JTable table) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Stasiun");
        model.addColumn("Nama Stasiun");
        model.addColumn("Kota");

        try {
            String sql = "SELECT * FROM stasiun";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("kode_stasiun"),
                    rs.getString("nama_stasiun"),
                    rs.getString("kota")
                });
            }
        } catch(Exception e) {
            throw new RuntimeException(e);
        }

        table.setModel(model);
    }
}
