package objectmodelingInheritance;

public class AccountDemo {
	
	public static void main(String[] args) {
		
		Account  [] accounts = { new SavingAccount(1000), new CurrentAccount(-600), new SavingAccount(2000)};
	
		for(Account account :accounts) {
			account.accountType();
	            account.displyBalance();

	            if (account instanceof SavingAccount) {
	                SavingAccount savings = (SavingAccount) account; 
	                savings.addInterest();
	                savings.displyBalance(); 
	            } else if (account instanceof CurrentAccount) {
	                CurrentAccount current = (CurrentAccount) account; 
	                current.checkOverdraft();
	            }

	            System.out.println();
			
		}
			
		}
		
		
		
		
		}


