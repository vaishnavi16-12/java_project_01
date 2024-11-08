package objectmodelingInheritance;

public class Square extends Shape{
  void draw() {
	  
	  
	  System.out.println("Drawing the Square");
	  
  }
  
  void calculateArea (double side ) {
	  double area = side *side;
	  System.out.println("Area of Square : "+area);
  }
}
