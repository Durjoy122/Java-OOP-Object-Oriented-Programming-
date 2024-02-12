public class teacher extends person
{
	private String subject;
	public void info(String Name , String id , int age , String subject) {
	    super.info(Name, id, age); 	
		this.subject = subject;
	}
	public String sub() {
	   return this.subject;	
	}
	public void display() {
	   super.display();
	   System.out.println("Subject: "+ subject);
	}
	
}