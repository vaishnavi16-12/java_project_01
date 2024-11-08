package objectmodelingInheritance;

public class EmployeeMain{ 
public  static void main(String[] args) {
   

	EmployeeSalary[] employees = {
            new FullTimeEmployee(3000),       
            new PartTimeEmployee(20, 80),   
            new FullTimeEmployee(3500)
            };
    
    
    for (EmployeeSalary employeeSalary : employees) {


        System.out.println("Salary: $" + employeeSalary.calculateSalary());
        System.out.println(); 
    }
}
}



 
