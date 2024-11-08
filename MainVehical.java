package objectmodelingInheritance;

public class MainVehical {

	
	public static void main(String []arg) {
		
		Vehical [] vehicals = {new Car(), new Bike(),new Car()};
		for (Vehical vehical: vehicals) {
			vehical.Start();
		}
	}
}
