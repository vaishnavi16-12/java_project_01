package objectmodelingInheritance;

public class PolymorphismCompileTime {
	public int calculate(int a,int b) {
		return a+b;
		
	}
	public double calculate(double a, double b) {
		return a+b;
		
	}
     public String calculate (String a ,String b) {
    	 return a+b;
    	 
}
     public static void main(String [] arg) {
    PolymorphismCompileTime polymorphism = new PolymorphismCompileTime() ;
    	
    
    int intResult =polymorphism.calculate(4, 6) ;
    System.out.println("Adding two Integers"+ intResult );
    
    double  doubleResult =polymorphism.calculate(4.8, 6.5) ;
    System.out.println("Adding two Doubles "+ doubleResult );
    
    String stringResult= polymorphism.calculate("Vaishnavi, ", "Sanskruti");
    System.out.println("Concatenating two String :" +stringResult);
    
    
    
    
     }
     
    
     
}
