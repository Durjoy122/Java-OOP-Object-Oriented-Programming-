public class student extends person 
{
	private String Grade;
	public void info(String Name , String id , int age , String Grade) {
	    super.info(Name, id, age); 
        this.Grade = Grade;		
	}
	public String grade() {
		return this.Grade;
	}
	public void display() {
	   super.display();
	   System.out.println("Grade: "+Grade);
	}
}