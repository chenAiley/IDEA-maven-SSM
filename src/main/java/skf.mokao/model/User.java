package skf.mokao.model;

public class User {
    private int user_Id;
    private String user_Name;
    private String user_Mobile;
    private String user_Password;

    public int getId() {
        return user_Id;
    }
    public void setId(int id) {
        this.user_Id = id;
    }

    public String getUsername() {
        return user_Name;
    }
    public void setUsername(String username) {
        this.user_Name = username == null ? null : username.trim();
    }

    public String getPassword() {
        return user_Password;
    }
    public void setPassword(String password) {
        this.user_Password = password == null ? null : password.trim();
    }

    public String getMobile() {
        return user_Mobile;
    }
    public void setMobile(String mobile) {
        this.user_Mobile = mobile == null ? null : mobile.trim();
    }
}
