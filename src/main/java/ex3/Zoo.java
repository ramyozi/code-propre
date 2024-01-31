package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Cette classe représente un zoo qui peut contenir différents animaux.
 */
public class Zoo {

	/** Le nom du zoo */
	private String nom;

	/** La liste des animaux dans le zoo */
	private List<Animal> animaux;

	/**
	 * Constructeur pour créer un nouveau zoo avec un nom spécifié.
	 *
	 * @param nom Le nom du zoo.
	 */
	public Zoo(String nom) {
		this.nom = nom;
		this.animaux = new ArrayList<>();
	}

	/**
	 * Ajoute un animal au zoo.
	 *
	 * @param animal L'animal à ajouter au zoo.
	 */
	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}

	/**
	 * Affiche la liste des animaux présents dans le zoo avec leurs détails.
	 */
	public void afficherListeAnimaux() {
		System.out.println("Liste des animaux dans le zoo " + nom + ":");
		System.out.println(
				"----------------------------------------------------------");
		System.out.println(
				"|    Nom            |    Type        |    Comportement    |");
		System.out.println(
				"----------------------------------------------------------");

		for (Animal animal : animaux) {
			String nom = animal.getNom();
			String type = animal.getType();
			String comportement = animal.getComportement();
			System.out.printf("| %-18s | %-14s | %-18s |\n", nom, type,
					comportement);
		}

		System.out.println(
				"----------------------------------------------------------");
	}

	/**
	 * Obtient le nombre d'animaux dans le zoo.
	 *
	 * @return Le nombre d'animaux dans le zoo.
	 */
	public int taille() {
		return animaux.size();
	}

	/**
	 * Obtient le nom du zoo.
	 *
	 * @return Le nom du zoo.
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Modifie le nom du zoo.
	 *
	 * @param nom Le nouveau nom du zoo.
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
