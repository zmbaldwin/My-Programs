import java.util.Scanner;

public class CircleDemo
{
   public static void main(String [] args)
	{
      Scanner scan = new Scanner(System.in);
		double radius;
      
	   Circle circle1 = new Circle();
      
		circle1.setRadius(2);
		System.out.println("radius: " + circle1.getRadius());
      
      System.out.println("diameter: " + circle1.getDiameter());
      
		System.out.println("area: " + cirle1.getArea());
      
		System.out.println("circumference: " + circle1.getCircumference());		
		
		
		System.out.println("Enter radius of circle: ");
		radius = scan.nextDouble();
      
		Circle circle2 = new Circle(radius);
		
		System.out.println("radius: " + circle2.getRadius());
      
      System.out.println("diameter: " + circle2.getDiameter());
      
		System.out.println("area: " + circle2.getArea());
      
		System.out.println("Circumference: " + circle2.getCircumference());			
	
	}
}