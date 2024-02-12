public class main {
   	public static void main(String[] args) {
		student s = new student();
		teacher t = new teacher();
		t.info("Benjamin" , "88" , 50, "Math");
		System.out.println("Subject "+t.sub());
		s.info("Max" , "123" , 21 , "A+");
		s.display();
	}
}