import java.util.ArrayList;
public class bank{
	 private ArrayList<account> accounts;
	 bank() {
        accounts = new ArrayList<account> ();
     }
	 public void addAccount(account Account) {
        accounts.add(Account);
     }
     public void removeAccount(account Account) {
        accounts.remove(Account);
     }
	 public ArrayList<account> getAccounts() {
        return accounts;
     }
}