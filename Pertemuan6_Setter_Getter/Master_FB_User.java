package Pertemuan6_Setter_Getter;

public class Master_FB_User {
    private String userName;
    private String password;

    // Setter
    public void Set_username(String userName){
        this.userName = userName;
    }

    public void Set_password(String password){
        this.password = password;
    }

    // Getter
    public String Get_username(){
        return this.userName;
    }

    public String Get_password(){
        return this.password;
    }
}