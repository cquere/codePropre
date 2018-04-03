package ex3.correction;

import ex3.correction.model.Animal;
import ex3.correction.model.ComportementAnimal;
import ex3.correction.model.TypeAnimal;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal("Gazelle", TypeAnimal.MAMMIFERE, ComportementAnimal.HERBIVORE));
		zoo.addAnimal(new Animal("Zèbre", TypeAnimal.MAMMIFERE , ComportementAnimal.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", TypeAnimal.MAMMIFERE, ComportementAnimal.HERBIVORE));
		zoo.addAnimal(new Animal("Panthère", TypeAnimal.MAMMIFERE, ComportementAnimal.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", TypeAnimal.AQUATIQUE, ComportementAnimal.HERBIVORE));
		zoo.addAnimal(new Animal("Truite dorée", TypeAnimal.AQUATIQUE, ComportementAnimal.HERBIVORE));
		zoo.addAnimal(new Animal("Boa constrictor", TypeAnimal.REPTILE, ComportementAnimal.CARNIVORE));
		zoo.addAnimal(new Animal("Python", TypeAnimal.REPTILE, ComportementAnimal.CARNIVORE));
	}

}
