package ex1;

import java.util.Date;

/**
 * Cette classe représente une entreprise avec des informations telles que le Siret, le nom, l'adresse et la date de création.
 */
public class Entreprise {

    public int siret;
    public String nom;
    public String adresse;
    public Date dateCreation;

    /**
     * Le capital maximum autorisé pour toutes les entreprises.
     */
    public static final int CAPITAL_MAX = 3000000;

    /**
     * Affiche le statut de l'entreprise.
     */
    public void afficherStatut() {

    }
}
