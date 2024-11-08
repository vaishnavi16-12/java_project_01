package objectmodelingInheritance;

public class FullTimeEmployee  extends EmployeeSalary {
  private double monthlySalary;
  
  public FullTimeEmployee(double monthlySalary) {
	  this.monthlySalary= monthlySalary;
  }
  
	  @Override
	   public double calculateSalary() {
		  return monthlySalary;
		  
	  }
  }

