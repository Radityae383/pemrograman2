package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {

    private static Connection conn;

    public static Connection getConnection() {
        try {
            if (conn == null) {
                conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_stasiun", "root", ""); // password kosong default XAMPP
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}

