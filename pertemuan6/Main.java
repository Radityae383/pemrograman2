package pertemuan6;

public class Main {

    public static void main(String[] args) {

        // membuat objek dari class User
        User dian = new User();

        // menggunakan method setter
        dian.setUsername("dian");
        dian.setPassword("kopiJava");

        // menggunakan method getter
        System.out.println("Username: " + dian.getUsername());
        System.out.println("Password: " + dian.getPassword());
    }
}