public class test {
	public static void main(String[] args) 
	{
		student ans = new student(123 , "abc" , "x" , 1);
		String print = ans.getResult("A+");
		ans.info();
		System.out.println("Name just " +print);
	}
}