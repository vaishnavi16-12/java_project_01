package objectmodelingInheritance;

public class Circle extends Shape {
	
	 public void draw() {
		System.out.println("Drawing a Circle ");
	}
        void calculateArea(double radius) {
        	double area = Math.PI * radius *radius ;
        	System.out.println("Area of Circle : " + area);
        	
        	
        	
        }
}
