package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		// Ajout d'animaux au zoo en utilisant la classe Animal
		Animal gazelle = new Animal("Gazelle", "MAMMIFERE", "HERBIVORE");
		Animal zebre = new Animal("Zèbre", "MAMMIFERE", "HERBIVORE");
		Animal lion = new Animal("Lion", "MAMMIFERE", "CARNIVORE");
		Animal panthere = new Animal("Panthère", "MAMMIFERE", "CARNIVORE");
		Animal requinBlanc = new Animal("Requin blanc", "POISSON",
				"HERBIVORE");
		Animal truiteDoree = new Animal("Truite dorée", "POISSON",
				"HERBIVORE");
		Animal boaConstrictor = new Animal("Boa constrictor", "SERPENT",
				"CARNIVORE");
		Animal python = new Animal("Python", "SERPENT", "CARNIVORE");

		// Ajout des animaux au zoo
		zoo.addAnimal(gazelle);
		zoo.addAnimal(zebre);
		zoo.addAnimal(lion);
		zoo.addAnimal(panthere);
		zoo.addAnimal(requinBlanc);
		zoo.addAnimal(truiteDoree);
		zoo.addAnimal(boaConstrictor);
		zoo.addAnimal(python);

		// Affichage de la liste des animaux  
		zoo.afficherListeAnimaux();

	}

}
