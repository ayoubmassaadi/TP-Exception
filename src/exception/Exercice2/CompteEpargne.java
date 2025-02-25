package exception.Exercice2;

public class CompteEpargne extends CompteBancaire{
    private double tauxInteret;

    public CompteEpargne(String numeroCompte, double solde, String nomTitulaire, double tauxInteret) {
        super(numeroCompte, solde, nomTitulaire);
        this.tauxInteret = tauxInteret;
    }

    public void ajouterInterets() {
        solde += solde * tauxInteret / 100;
    }
}
