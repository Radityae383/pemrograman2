package Pertemuan6_Setter_Getter;

public class FB_Login {
    void login(String userName, String password, Master_FB_User user){
        if(userName.equals(user.Get_username()) && password.equals(user.Get_password())){
            System.out.println(">> Berhasil Login Facebook");
            System.out.println("!! Rubah password anda untuk keamanan \n");
        } else {
            System.out.println("!! Gagal Login Facebook.. Silahkan Coba Lagi");
            System.out.println(">> Check kebenaran username dan password saat ini");
            System.out.println("   Username Saat ini : " + user.Get_username());
            System.out.println("   Password Saat ini : " + user.Get_password() + "\n");
        }
    }
}