public class student extends person {
	public int roll;
	student(){}
	student(int id , String address , String name , int roll) 
	{
		this.id = id;
		this.address = address;
		this.name = name;
		this.roll = roll;
	}
	public void info() 
	{
		System.out.println("Id "+ this.id);
		System.out.println("Address "+ this.address);
		System.out.println("Name "+this.name);
		System.out.println("Roll "+this.roll);
	}
	public String getResult(String result) {
		return result;
	}
}