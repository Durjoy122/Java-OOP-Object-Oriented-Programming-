public class Giraffe extends Animal{
	 private String color;
	 public Giraffe(String name , String color) {
		 super(name); 
		 this.color = color;
	 }
	 public String getColor() {
		 return color; 
	 }
	 public void makeSound() {
        System.out.println("Giraffe sound");
     }
}