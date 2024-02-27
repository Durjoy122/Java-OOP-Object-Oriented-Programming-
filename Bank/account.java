public class account {
	private String name;
	private String accountno;
	private int amount;
	public account(String name , String accountno , int amount) {
	    this.name = name;
        this.accountno = accountno;		 
		this.amount = amount;
	}
	public String getName() {
        return this.name;
    }		
	public String getAccount() {
	    return this.accountno;	
	}
	public int getAmount() {
	    return this.amount;	
	}
}