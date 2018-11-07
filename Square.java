

public class Square extends Rectangle {
	
	// field
	private double dim;
	
	// constructor
	public Square(double dim){
		super(dim, dim);
		this.dim = dim;
	}
	
	// methods
	@Override
	public double calculateArea() {
		// calculate Square's area
		return dim * dim;
	}
	@Override
	public double calculatePerimeter(){
		// calculate Square's Perimeter
		return dim * 4;
	}
	
	@Override
	public String toString() {
		// it shows which classes are the superClasses
		return String.format("A Square object, inherited from %s", super.toString());
	}
}
