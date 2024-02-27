import java.util.ArrayList;
public class mian {
	public static void main(String[] args) {
		bank b = new bank();
		account a1 = new account("Karim" , "C001" , 7500);
		account b1 = new account("Rahim" , "C002" , 8500);
		account c1 = new account("Mohit" , "C004" , 9500);
		b.addAccount(a1);
		b.addAccount(b1);
		b.addAccount(c1);
		ArrayList<account> Accounts = b.getAccounts();
		for(account a : Accounts) {
			System.out.println(a.getName() + " " + a.getAccount() + " " + a.getAmount());
		}
		System.out.println("After Deletion of elements b1");
		b.removeAccount(b1);
		for(account a : Accounts) {
		   System.out.println(a.getName() + " " + a.getAccount() + " " + a.getAmount());
		}
	}
}