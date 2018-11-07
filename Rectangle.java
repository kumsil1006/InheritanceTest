

public class Rectangle extends _2Dshape{

	// constructor
	public Rectangle(double width, double height) {
		
		setWidth(width);
		setHeight(height);
	}
	
	// constructor overloading
	public Rectangle(){
		
	};

	// methods	
	@Override
	public double calculateArea() {
		// calculate Rectangle's Area
		return getWidth() * getHeight();
	}
	@Override
	public double calculatePerimeter(){
		// calculate Rectangle's Perimeter
		return (getWidth() + getHeight()) * 2;
	}
	@Override
	public String toString() {
		// it shows which class is the superClass
		return String.format("A Rectangle class, %s", super.toString());
	}
}
