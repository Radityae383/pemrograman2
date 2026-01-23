package gui;

import dao.StasiunDAO;
import dao.JadwalKeretaDAO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainForm extends JFrame {

    JTabbedPane tabbedPane = new JTabbedPane();

    Color bgMain = new Color(245, 247, 250);
    Color headerColor = new Color(30, 64, 175);
    Color btnColor = new Color(59, 130, 246);
    Color btnText = Color.WHITE;

    // ===== TAB STASIUN =====
    JTable tableStasiun = new JTable();
    JTextField txtKode = new JTextField(5);
    JTextField txtNama = new JTextField(15);
    JTextField txtKota = new JTextField(15);
    JButton btnInsertStasiun = new JButton("Insert");
    JButton btnUpdateStasiun = new JButton("Update");
    JButton btnDeleteStasiun = new JButton("Delete");

    StasiunDAO stasiunDAO = new StasiunDAO();

    // ===== TAB JADWAL =====
    JTable tableJadwal = new JTable();
    JTextField txtIdJadwal = new JTextField();
    JTextField txtKodeStasiun = new JTextField(5);
    JTextField txtNamaKereta = new JTextField(15);
    JTextField txtWaktu = new JTextField(10);
    JButton btnInsertJadwal = new JButton("Insert");
    JButton btnUpdateJadwal = new JButton("Update");
    JButton btnDeleteJadwal = new JButton("Delete");

    JadwalKeretaDAO jadwalDAO = new JadwalKeretaDAO();

    public MainForm() {
        setTitle("Sistem Stasiun & Jadwal Kereta");
        setSize(900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        txtIdJadwal.setEnabled(false);
        txtIdJadwal.setVisible(false);

        setLayout(new BorderLayout());
        add(createHeader(), BorderLayout.NORTH);

        initStasiunTab();
        initJadwalTab();

        add(tabbedPane, BorderLayout.CENTER);
        setVisible(true);
    }

    // ================= HEADER =================
    private JPanel createHeader() {
        JPanel header = new JPanel(new FlowLayout(FlowLayout.LEFT));
        header.setBackground(headerColor);
        header.setPreferredSize(new Dimension(100, 80));

        ImageIcon icon = new ImageIcon("src/img/logo.png");
        Image img = icon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
JLabel logo = new JLabel(new ImageIcon(img));
        

        JLabel title = new JLabel("Sistem Stasiun & Jadwal Kereta");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Segoe UI", Font.BOLD, 22));

        header.add(logo);
        header.add(title);
        return header;
    }

    // ================= TAB STASIUN =================
    private void initStasiunTab() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(bgMain);

        JPanel inputPanel = new JPanel();
        inputPanel.setBackground(bgMain);

        styleButton(btnInsertStasiun);
        styleButton(btnUpdateStasiun);
        styleButton(btnDeleteStasiun);

        inputPanel.add(new JLabel("Kode"));
        inputPanel.add(txtKode);
        inputPanel.add(new JLabel("Nama"));
        inputPanel.add(txtNama);
        inputPanel.add(new JLabel("Kota"));
        inputPanel.add(txtKota);
        inputPanel.add(btnInsertStasiun);
        inputPanel.add(btnUpdateStasiun);
        inputPanel.add(btnDeleteStasiun);

        panel.add(new JScrollPane(tableStasiun), BorderLayout.CENTER);
        panel.add(inputPanel, BorderLayout.SOUTH);

        tabbedPane.addTab("Stasiun", panel);

        stasiunDAO.tampilData(tableStasiun);

        btnInsertStasiun.addActionListener(e -> {
            stasiunDAO.insert(txtKode.getText(), txtNama.getText(), txtKota.getText());
            refreshAll();
        });

        btnUpdateStasiun.addActionListener(e -> {
            stasiunDAO.update(txtKode.getText(), txtNama.getText(), txtKota.getText());
            refreshAll();
        });

        btnDeleteStasiun.addActionListener(e -> {
            stasiunDAO.delete(txtKode.getText());
            refreshAll();
        });
    }

    // ================= TAB JADWAL =================
    private void initJadwalTab() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(bgMain);

        JPanel inputPanel = new JPanel();
        inputPanel.setBackground(bgMain);

        styleButton(btnInsertJadwal);
        styleButton(btnUpdateJadwal);
        styleButton(btnDeleteJadwal);

        inputPanel.add(new JLabel("Kode Stasiun"));
        inputPanel.add(txtKodeStasiun);
        inputPanel.add(new JLabel("Nama Kereta"));
        inputPanel.add(txtNamaKereta);
        inputPanel.add(new JLabel("Waktu"));
        inputPanel.add(txtWaktu);
        inputPanel.add(btnInsertJadwal);
        inputPanel.add(btnUpdateJadwal);
        inputPanel.add(btnDeleteJadwal);

        panel.add(new JScrollPane(tableJadwal), BorderLayout.CENTER);
        panel.add(inputPanel, BorderLayout.SOUTH);

        tabbedPane.addTab("Jadwal Kereta", panel);

        jadwalDAO.tampilData(tableJadwal);

        tableJadwal.getColumnModel().getColumn(0).setMinWidth(0);
        tableJadwal.getColumnModel().getColumn(0).setMaxWidth(0);

        tableJadwal.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int r = tableJadwal.getSelectedRow();
                txtIdJadwal.setText(tableJadwal.getValueAt(r, 0).toString());
                txtKodeStasiun.setText(tableJadwal.getValueAt(r, 1).toString());
                txtNamaKereta.setText(tableJadwal.getValueAt(r, 2).toString());
                txtWaktu.setText(tableJadwal.getValueAt(r, 3).toString());
            }
        });

        btnInsertJadwal.addActionListener(e -> {
            jadwalDAO.insert(txtKodeStasiun.getText(), txtNamaKereta.getText(), txtWaktu.getText());
            jadwalDAO.tampilData(tableJadwal);
        });

        btnUpdateJadwal.addActionListener(e -> {
            jadwalDAO.update(Integer.parseInt(txtIdJadwal.getText()),
                    txtKodeStasiun.getText(), txtNamaKereta.getText(), txtWaktu.getText());
            jadwalDAO.tampilData(tableJadwal);
        });

        btnDeleteJadwal.addActionListener(e -> {
            jadwalDAO.delete(Integer.parseInt(txtIdJadwal.getText()));
            jadwalDAO.tampilData(tableJadwal);
        });
    }

    private void styleButton(JButton btn) {
        btn.setBackground(btnColor);
        btn.setForeground(btnText);
        btn.setFocusPainted(false);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 12));
    }

    private void refreshAll() {
        stasiunDAO.tampilData(tableStasiun);
        jadwalDAO.tampilData(tableJadwal);
    }

    public static void main(String[] args) {
        new MainForm();
    }
}