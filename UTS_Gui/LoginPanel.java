package UTS_Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPanel extends JFrame {
    private JTextField userField;
    private JPasswordField passField;

    public LoginPanel() {
        setTitle("Login Perpustakaan Digital");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Header
        JLabel header = new JLabel("Perpustakaan Digital", SwingConstants.CENTER);
        header.setFont(new Font("Segoe UI", Font.BOLD, 20));
        header.setOpaque(true);
        header.setBackground(new Color(33, 150, 243));
        header.setForeground(Color.WHITE);
        header.setPreferredSize(new Dimension(350, 50));
        add(header, BorderLayout.NORTH);

        // Form
        JPanel form = new JPanel();
        form.setLayout(new GridLayout(2,2,10,10));
        form.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        form.add(new JLabel("Username:"));
        userField = new JTextField();
        form.add(userField);

        form.add(new JLabel("Password:"));
        passField = new JPasswordField();
        form.add(passField);

        add(form, BorderLayout.CENTER);

        // Button
        JButton loginBtn = new JButton("Login");
        loginBtn.setBackground(new Color(76, 175, 80));
        loginBtn.setForeground(Color.WHITE);
        loginBtn.setFocusPainted(false);
        add(loginBtn, BorderLayout.SOUTH);

        loginBtn.addActionListener(e -> {
            String user = userField.getText();
            String pass = new String(passField.getPassword());
            if(user.equals("admin") && pass.equals("123")) {
                new DashboardPanel().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Login gagal!");
            }
        });
    }
}
