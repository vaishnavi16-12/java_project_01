package objectmodelingInheritance;

public class ShapeDemo {
	public static void main(String[] args) {
		
		Shape [] shapes = {new Circle(), new Square(), new  Circle()	};
		
  for(Shape shape : shapes) {
	  shape.draw();
	  
	  
	  if (shape instanceof Circle) {
		  Circle circle =(Circle) shape;
		  
		  
		 circle.calculateArea(6.0);
		  
	  
	  }else if (shape instanceof Square) {
		  Square square = (Square) shape;
		  
		  square.calculateArea(5.0);
		  
		  
		  
	  }
	  }
	  
  }
}
