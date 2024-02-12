public class person {
	private String Name , id;
	private int age;
	public void info(String Name , String id , int age) {
	    this.Name = Name;
        this.id = id;
        this.age = age;		
	}
	public String Name() {
	   return this.Name;	
	}
	public String id() {
	   return this.id;	
	}
	public int age() {
	   return this.age;	
	}
	public void display() {
	   System.out.println("Name: " +Name);
	   System.out.println("Id:  " +id);
       System.out.println("Age: " +age);
	}
}