package Pertemuan6_Setter_Getter;

public class Main {
    public static void main(String[] args) {
        FBUser user = new FBUser();
        FBLogin login = new FBLogin();

        // Percobaan login sebelum set data
        login.attemptLogin("RaditEka", "03456", user);

        // Set username dan password
        user.setUsername("RaditEka");
        user.setPassword("03456");

        // Percobaan login
        login.attemptLogin("Radit", "03456", user);       // login gagal
        login.attemptLogin("RaditEka", "03456", user);   // login berhasil
    }
}
