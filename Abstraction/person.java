abstract class person {
	public int id;
	public String address , name , phone;
	person(){}
	person(int id , String address , String name , String phone) 
    {
        this.id = id;
		this.address = address;
		this.name = name;
		this.phone = phone;
    }		
	abstract void info();
	abstract String getResult(String result);
}