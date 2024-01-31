package ex2;

/**
 * Cette classe représente un livret A, qui est un type particulier de compte bancaire avec un taux de rémunération annuel.
 */
public class LivretA extends CompteBancaire {

    /** Le taux de rémunération annuel du livret A */
    private double tauxRemuneration;

    /**
     * Constructeur pour créer un nouveau compte de type Livret A.
     *
     * @param solde           Le solde initial du compte.
     * @param tauxRemuneration Le taux de rémunération annuel du livret A.
     */
    public LivretA(double solde, double tauxRemuneration) {
        // Les livrets A n'ont pas de découvert autorisé
        super(solde, 0);
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Applique la rémunération annuelle au solde du livret A en fonction de son taux de rémunération.
     */
    public void appliquerRemunerationAnnuelle() {
        double remuneration = getSolde() * tauxRemuneration / 100;
        ajouterMontant(remuneration);
    }

    /**
     * Obtient le taux de rémunération annuel du livret A.
     *
     * @return Le taux de rémunération annuel.
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /**
     * Modifie le taux de rémunération annuel du livret A.
     *
     * @param tauxRemuneration Le nouveau taux de rémunération annuel à définir.
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }
}
