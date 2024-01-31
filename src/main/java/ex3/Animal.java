package ex3;

/**
 * Cette classe représente un animal avec un nom, un type et un comportement.
 */
public class Animal {

    /** Le nom de l'animal */
    private String nom;

    /** Le type de l'animal */
    private String type;

    /** Le comportement de l'animal */
    private String comportement;

    /**
     * Constructeur pour créer un nouvel animal avec un nom, un type et un comportement spécifiés.
     *
     * @param nom Le nom de l'animal.
     * @param type Le type de l'animal.
     * @param comportement Le comportement de l'animal.
     */
    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    /**
     * Obtient le nom de l'animal.
     *
     * @return Le nom de l'animal.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Modifie le nom de l'animal.
     *
     * @param nom Le nouveau nom de l'animal.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Obtient le type de l'animal.
     *
     * @return Le type de l'animal.
     */
    public String getType() {
        return type;
    }

    /**
     * Modifie le type de l'animal.
     *
     * @param type Le nouveau type de l'animal.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Obtient le comportement de l'animal.
     *
     * @return Le comportement de l'animal.
     */
    public String getComportement() {
        return comportement;
    }

    /**
     * Modifie le comportement de l'animal.
     *
     * @param comportement Le nouveau comportement de l'animal.
     */
    public void setComportement(String comportement) {
        this.comportement = comportement;
    }
}
