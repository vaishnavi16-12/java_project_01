package objectmodelingInheritance;

public abstract  class Account {
	
	protected  double balance;
	
	public Account(double balance2) {
		this.balance=balance;
	}
		
		
		abstract void accountType();
		
		
		
		public void displyBalance() {
			System.out.println("Balance: "+ balance);
		}
	}
