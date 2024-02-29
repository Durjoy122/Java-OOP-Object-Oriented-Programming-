import java.util.ArrayList;
import java.util.List;
public class main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
		Giraffe G = new Giraffe("Dann" , "Pink");
		Lion L = new Lion("Leo");
		Elephant E = new Elephant("Fat Boy");
		System.out.println("Giraffe color "+ G.getColor());
		zoo.addAnimal(G);
		zoo.addAnimal(L);
		zoo.addAnimal(E);
		ArrayList<Animal> an = zoo.all_animal();
		for(Animal u : an) {
			System.out.println(u.getName());	
		}
		zoo.makeAllSounds();
    }	
}