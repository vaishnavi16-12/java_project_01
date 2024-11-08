package objectmodelingInheritance;

public class SavingAccount extends Account {
	
	private double inerestRate= 0.04;
	
	public SavingAccount(double balance) {
		
		super(balance);
		
		}
	@Override
	void accountType() {
		
		System.out.println( "This is a Saving Account.");
		
	}
    public void addInterest() {
    	
    	double interest = balance * inerestRate;
    	balance+= interest;
    	System.out.println("Intersted added : "+ interest);
    }
}
