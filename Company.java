package objectmodelingInheritance;

public class Company {
	

		 public static void main(String[] args) {
			Employee [] employee = new Employee[3];
			employee[0]= new Developer();
			employee[1]= new Manager();
			employee[2]= new Developer();
			
			for(Employee emp : employee) {
				emp.work();
			}

}
}
