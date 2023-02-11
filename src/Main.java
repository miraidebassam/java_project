import Exceptions.NullAuthentificationDataException;
import Models.User;

public class Main {
    public static void main(String[] args) {
       User user = new User("user","passer");
        try {
            user.authentification("user","passer");
        } catch (NullAuthentificationDataException e) {
            System.out.println(e.getMessage());
        }
    }
}