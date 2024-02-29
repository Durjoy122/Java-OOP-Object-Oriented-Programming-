import java.util.ArrayList;
public class Zoo {
	private ArrayList<Animal> animals;
	Zoo(){
	   this.animals = new ArrayList<>();
	}
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	public ArrayList<Animal> all_animal() {
		return animals;
	}
	public void makeAllSounds() {
       for(Animal animal : animals) {
          animal.makeSound();
       }
    }
}