package uiTests.businessObjects;

public class User {
    private String userName;
    private String login;
    private String passaword;

    public User(String userName, String login, String password) {
        this.userName = userName;
        this.login = login;
        this.passaword = password;
    };

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return passaword;
    }

    public void setPassword(String password) {
        this.passaword = password;
    }

}
