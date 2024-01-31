package ex2;

/**
 * Cette classe représente un compte bancaire avec un solde et un montant de découvert autorisé.
 */
public class CompteBancaire {

    /** Le solde du compte */
    private double solde;

    /** Le montant autorisé de découvert */
    private double decouvert;

    /**
     * Constructeur pour créer un nouveau compte bancaire.
     *
     * @param solde     Le solde initial du compte.
     * @param decouvert Le montant autorisé de découvert (peut être zéro pour un compte sans découvert autorisé).
     */
    public CompteBancaire(double solde, double decouvert) {
        this.solde = solde;
        this.decouvert = decouvert;
    }

    /**
     * Ajoute un montant spécifié au solde du compte.
     *
     * @param montant Le montant à ajouter au solde.
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /**
     * Débite un montant spécifié du solde du compte, sous réserve de ne pas dépasser le découvert autorisé.
     *
     * @param montant Le montant à débiter du solde.
     */
    public void debiterMontant(double montant) {
        if (this.solde - montant >= -decouvert) {
            this.solde -= montant;
        }
    }

    /**
     * Obtient le solde actuel du compte.
     *
     * @return Le solde du compte.
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Obtient le montant autorisé de découvert.
     *
     * @return Le montant autorisé de découvert (zéro si aucun découvert n'est autorisé).
     */
    public double getDecouvert() {
        return decouvert;
    }
}
