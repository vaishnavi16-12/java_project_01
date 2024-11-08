package objectmodelingInheritance;

public class PartTimeEmployee extends EmployeeSalary {
    private int hoursWorked;
    private double hourlyRate;
   
    
    public PartTimeEmployee(int hoursWorked,double hourlyRate) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override

    public double calculateSalary() {
       
        return hourlyRate * hoursWorked;
    }
}