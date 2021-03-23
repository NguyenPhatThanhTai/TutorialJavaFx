package Model;

public class userModel {
    private String Id;
    private String UserName;
    private String Email;
    private String Password;
    private String roleId;

    public userModel() {

    }

    public userModel(String userName, String password) {
        UserName = userName;
        Password = password;
    }

    public userModel(String id, String userName, String email, String password, String roleId) {
        Id = id;
        UserName = userName;
        Email = email;
        Password = password;
        this.roleId = roleId;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}
