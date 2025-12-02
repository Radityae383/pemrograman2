package Pertemuan6_Setter_Getter;

public class FBLogin {

    public void attemptLogin(String inputUser, String inputPass, FBUser user) {
        System.out.println("=== Mencoba login untuk user: " + inputUser + " ===");
        if(inputUser.equals(user.getUsername()) && inputPass.equals(user.getPassword())) {
            System.out.println(">>> Login Berhasil! Selamat datang, " + inputUser);
            System.out.println(">>> Disarankan untuk mengganti password secara berkala.\n");
        } else {
            System.out.println(">>> Login Gagal!");
            System.out.println(">> Cek username dan password saat ini:");
            System.out.println("   Username: " + user.getUsername());
            System.out.println("   Password: " + user.getPassword() + "\n");
        }
    }
}

