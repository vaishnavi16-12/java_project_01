package objectmodelingInheritance;

public class ApplianceMain {
	public static void main(String [] args) {
		Appliance [] appliances= {new WashingMachine(), new Refrigerator(),new WashingMachine()};

		
		 for(Appliance appliance : appliances) {
			 appliance.turnon();
		 }
}
}
