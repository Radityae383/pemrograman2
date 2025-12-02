package Pertemuan6_Setter_Getter;

public class FBUser {
    private String username;
    private String password;

    // Konstruktor kosong
    public FBUser() {
    }

    // Getter dan Setter
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

