package Pertemuan6_Setter_Getter;

public class Main {
    public static void main(String[] args) {
        FB_Login login = new FB_Login();
        Master_FB_User user = new Master_FB_User();

        login.login("RaditEka", "03456", user); // login gagal (belum set)

        user.Set_username("RaditEka");
        user.Set_password("03456");

        login.login("Radit", "03456", user);       // login gagal
        login.login("RaditEka", "03456", user);   // login berhasil
    }
}