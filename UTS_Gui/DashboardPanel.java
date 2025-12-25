package UTS_Gui;

import UTS_Sistem.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class DashboardPanel extends JFrame {
    private JTable table;
    private DefaultTableModel model;
    private Implement_System sistem = new Implement_System();

    public DashboardPanel() {
        setTitle("Dashboard Perpustakaan");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(245,247,250)); // abu lembut

        // ===== HEADER =====
        JLabel header = new JLabel("Dashboard Buku", SwingConstants.CENTER);
        header.setFont(new Font("Segoe UI", Font.BOLD, 24));
        header.setOpaque(true);
        header.setBackground(new Color(33,150,243));
        header.setForeground(Color.WHITE);
        header.setPreferredSize(new Dimension(800, 60));
        add(header, BorderLayout.NORTH);

        // ===== SIDEBAR =====
        JPanel sidebar = new JPanel();
        sidebar.setBackground(new Color(224,224,224));
        sidebar.setLayout(new GridLayout(3,1,10,10));
        sidebar.setBorder(BorderFactory.createEmptyBorder(20,10,20,10));

        JButton tambahBtn = new JButton("Tambah Buku");
        JButton hapusBtn = new JButton("Hapus Buku");
        JButton totalBtn = new JButton("Total Halaman");

        // Warna tombol
        tambahBtn.setBackground(new Color(76,175,80)); tambahBtn.setForeground(Color.WHITE);
        hapusBtn.setBackground(new Color(244,67,54)); hapusBtn.setForeground(Color.WHITE);
        totalBtn.setBackground(new Color(33,150,243)); totalBtn.setForeground(Color.WHITE);

        // Hilangkan focus border
        tambahBtn.setFocusPainted(false); hapusBtn.setFocusPainted(false); totalBtn.setFocusPainted(false);

        sidebar.add(tambahBtn);
        sidebar.add(hapusBtn);
        sidebar.add(totalBtn);

        add(sidebar, BorderLayout.WEST);

        // ===== CONTENT PANEL (TABEL) =====
        model = new DefaultTableModel(new String[]{"Judul","Jenis","Penulis","Halaman"},0);
        table = new JTable(model);
        table.setRowHeight(28);
        table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        table.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        add(scrollPane, BorderLayout.CENTER);

        // ===== ACTIONS =====
        tambahBtn.addActionListener(e -> {
            String judul = JOptionPane.showInputDialog(this,"Judul Buku:");
            if(judul==null || judul.isEmpty()) return;
            String jenis = JOptionPane.showInputDialog(this,"Jenis Buku (Fiksi/NonFiksi):");
            if(jenis==null || jenis.isEmpty()) return;
            String penulis = JOptionPane.showInputDialog(this,"Penulis:");
            if(penulis==null || penulis.isEmpty()) return;
            int halaman;
            try{
                halaman = Integer.parseInt(JOptionPane.showInputDialog(this,"Jumlah Halaman:"));
            }catch(Exception ex){ JOptionPane.showMessageDialog(this,"Input halaman salah!"); return; }

            Buku b = jenis.equalsIgnoreCase("Fiksi") ? new Fiksi(judul,penulis,halaman) : new NonFiksi(judul,penulis,halaman);
            sistem.tambahBuku(b);
            model.addRow(new Object[]{b.getJudul(),jenis,b.getPenulis(),b.getHalaman()});
        });

        hapusBtn.addActionListener(e -> {
            int row = table.getSelectedRow();
            if(row==-1){ JOptionPane.showMessageDialog(this,"Pilih buku dulu!"); return; }
            int konfirmasi = JOptionPane.showConfirmDialog(this,"Yakin ingin menghapus?","Konfirmasi",JOptionPane.YES_NO_OPTION);
            if(konfirmasi==JOptionPane.YES_OPTION){
                sistem.hapusBuku(row);
                model.removeRow(row);
            }
        });

        totalBtn.addActionListener(e -> JOptionPane.showMessageDialog(this,"Total halaman: "+sistem.totalHalaman()));
    }
}
