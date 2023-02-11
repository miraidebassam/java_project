import models.*;
import interfaces.Personne;
import interfaces.Evaluation;
public class Application_10 {
    public static void main(String[] args) {
        AbstractFactory factoryPersonne = ConcreteFactory.getFactory (PersonneFactory.class) ;
        Personne etudiant = factoryPersonne.getPersonne(Etudiant.class) ; etudiant.sePresenter () ;
        AbstractFactory factoryEvaluation = ConcreteFactory.getFactory(EvaluationFactory.class) ;
        Evaluation evaluationEcrite = factoryEvaluation.getEvaluation(Ecrite.class) ;
        evaluationEcrite.noter () ;
    }
}
