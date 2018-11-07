
import java.util.Scanner;
public class Runner {
	
	public static void main(String[] args) {
		
		double width, height, radius, length;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		/*
		 * Circle : user must input radius which is > 0
		 * iterate until user inputs the value > 0
		 */
		System.out.println("1. Circle (Please enter the radius.)");
		do{
			// user enters a double value as radius for this circle
			radius = input.nextDouble();
			if(radius <= 0)
				System.out.println("Radius should be bigger than 0. Please try again!");
			
		}while(radius <= 0);
		
		Circle cir = new Circle(radius);
		
		// print detailed information about cir
		System.out.printf("%s%n", cir.toString());
		System.out.printf("Its surface area is\t%.3f\n", cir.calculateArea());
		System.out.printf("And its perimeter is\t%.3f\n\n", cir.calculatePerimeter());
		
		// Square
		System.out.println("2. Square (Please enter the width.)");
		do{
			// user inputs a double value : width
			width = input.nextDouble();
			if(width <= 0)
				System.out.println("Width should be bigger than 0. Please try again!");
			
		}while(width <= 0);
		Square sqr = new Square(width);
		
		// print details about the sqr
		System.out.printf("%s%n", sqr.toString());
		System.out.printf("Its surface area is\t%.3f\n", sqr.calculateArea());
		System.out.printf("And its perimeter is\t%.3f\n\n", sqr.calculatePerimeter());
		
		// Square
		System.out.println("3. Rectangle (Please enter the width and height.)");
		do{
			// user inputs two double values : width and height
			width = input.nextDouble();
			height = input.nextDouble();
			if(width <= 0)
				System.out.println("Width and height should be bigger than 0. Please try again!");
			
		}while(width <= 0);
		Rectangle rec = new Rectangle(width, height);
		
		// print details about the rec
		System.out.printf("%s%n", rec.toString());
		System.out.printf("Its surface area is\t%.3f\n", rec.calculateArea());
		System.out.printf("And its perimeter is\t%.3f\n\n", rec.calculatePerimeter());
		
		
		//Cone
		System.out.println("4. Cone (Please enter the radius and height.)");
		do{
			// user inputs a double value : radius and height
			radius = input.nextDouble();
			height = input.nextDouble();
			if(radius <= 0 || height <= 0)
				System.out.println("Radius and height should be bigger than 0. Please try again!");
			
		}while(radius <= 0 || height <= 0);
		
		Cone cone = new Cone(radius, height);
		
		// print details about the cone
		System.out.printf("%s %n", cone.toString());
		System.out.printf("Its surface area is\t%.3f\n", cone.calculateArea());
	 	System.out.printf("And its volume is\t%.3f\n\n", cone.calculateVolume());
	 	
	 	// Sphere
		System.out.println("5. Sphere (Please enter the radius.)");
		do{
			// user inputs a double value : radius
			radius = input.nextDouble();
			if(radius <= 0)
				System.out.println("Radius should be bigger than 0. Please try again!");
			
		}while(radius <= 0);
		
		Sphere sphere = new Sphere(radius);
		
		// print details about the sphere
		System.out.printf("%s%n", sphere.toString());
		System.out.printf("Its surface area is\t%.3f\n", sphere.calculateArea());
		System.out.printf("And its perimeter is\t%.3f\n\n", sphere.calculateVolume());
		
		System.out.println("6. Cube (Please enter the length.)");
		do{
			// user inputs a double value : length
			length = input.nextDouble();
			if(radius <= 0)
				System.out.println("length should be bigger than 0. Please try again!");
			
		}while(radius <= 0);

		Cube cube = new Cube(length);
		
		// print details about the cube
		System.out.printf("%s%n", cube.toString());
		System.out.printf("Its surface area is\t%.3f\n", cube.calculateArea());
		System.out.printf("And its perimeter is\t%.3f\n\n", cube.calculateVolume());
		

}
}
