import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        /*try {

            TestBD testBD = new TestBD();
            testBD.run();
        } catch (DAOException e) {
            System.out.println(e.getMessage());
        }*/

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));
            String login = properties.getProperty("admin.login");
            String password = properties.getProperty("admin.password");

        } catch (IOException e) {

            //throw new Exception("Error while loading application.properties file", e);
            System.out.println(e.getMessage());
        }


    }
}