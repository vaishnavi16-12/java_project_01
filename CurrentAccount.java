package objectmodelingInheritance;

public class CurrentAccount extends Account{

	
	private double overdraftLimit = 500.0; 

    public CurrentAccount(double balance) {
        super(balance);
    }

    
    @Override
    void accountType() {
        System.out.println("This is a Current Account.");
    }

    
    public void checkOverdraft() {
        if (balance < 0 && Math.abs(balance) > overdraftLimit) {
            System.out.println("Overdraft limit exceeded!");
        } else {
            System.out.println("Within overdraft limit.");
        }
    }
}

