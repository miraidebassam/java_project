import interfaces.Personne;
import models.Etudiant;
import models.Formateur;
import models.PersonneFactory;
import models.Responsable;

public class Application_9 {
    public static void main(String[] args) {
        PersonneFactory personneFactory = new PersonneFactory ();
        // Instanciation d’un responsable et appel à sa méthode sePresenter ()
        Personne responsable = personneFactory.getPersonne (Responsable.class); responsable.sePresenter();
        // Instanciation d’un formateur et appel à sa méthode sePresenter ()
        Personne formateur = personneFactory.getPersonne (Formateur.class); formateur.sePresenter();
        // Instanciation d’un étudiant et appel à sa méthode sePresenter ()
        Personne etudiant = personneFactory.getPersonne (Etudiant.class);
        etudiant.sePresenter();
    }
}
