package objectmodelingInheritance;

import objectmodeling.CompanyManage.Main;

public class ShapeArea {
	
	public double area( double side) {
		return side *side;
		
	}

	public double area (double length,double width) {
		return length * width;
		
	}
	public double area (double radius, boolean isCircle) {
		return Math.PI*  radius* radius;
	}
	
		
		public static void main(String [] arg) {
			ShapeArea shapeArea = new ShapeArea();
			
			double squareArea = shapeArea.area(5);
			System.out.println("Area of square with side : "+ squareArea);
			
			double rectangleArea=shapeArea.area(4, 7);
			System.out.println("Area of rectangle with : "+ rectangleArea );
			
			double circleArea = shapeArea.area(3,true);
			System.out.println("Area of Circle with radius : " +circleArea);
			
			
			
			
		}
	}

