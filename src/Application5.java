import models.Etudiant;

public class Application5 {

    public static void main(String[] args) {
        testException();
        testRuntimeException();
    }

    public static void testRuntimeException() {
        Etudiant etudiant = new Etudiant("Ndongo", "Cheikh", 'M',  12330, "MP-ISI1");
        try {
            etudiant.setAge(10);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }

        etudiant.sePresenter();
    }

    public static void testException() {
        try {
            Etudiant etudiant = new Etudiant("Ndongo", "Cheikh", 'M', 23, 1232, "MP-ISI1");
            etudiant.sePresenter();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
