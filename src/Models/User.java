package Models;

import Exceptions.NullAuthentificationDataException;

public class User {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void authentification (String login,String password) throws NullAuthentificationDataException {
        if(login == null  || password == null){
            throw new NullAuthentificationDataException("Login ou le mot de passe est null");
        } else if (!login.equals(getLogin()) && !password.equals(getPassword())) {
            throw new NullAuthentificationDataException("Login ou le mot de passe incorrect");
        }
        else{
            System.out.println("OK");
        }
    }


}
