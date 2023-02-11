import models.Etudiant;

public class Application6 {

    public static void main(String[] args) {
        try{
            Etudiant e = new Etudiant("Ndongo", "Cheikh", 'M',  12330, "MP-ISI1");
            e.setAge(-1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


}
