import Model.Personne;

public class Main {
    public static void main(String[] args) {

        Personne p = new Personne("miraide","bassam",'F',23);
        Personne p1 = new Personne("Diouf","Samba",'M',40);
        p.sePresenter();
        p1.sePresenter();
        System.out.println(Personne.getNbPersonnses());

    }
}
