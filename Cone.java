

public class Cone extends _3Dshape{

	// constructor
	public Cone(double radius, double height) {
		setRadius(radius);
		setHeight(height);
	}
	// methods
	@Override
	public double calculateArea() {
		// calculate Cone's area
		return Math.PI * Math.pow(getRadius(), 2) 
				+ Math.PI * getRadius() * Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getRadius(), 2));
	}
	@Override
	public double calculateVolume() {
		// calculate cone's volume
		return Math.PI * getRadius() * getRadius() * getHeight()/ 3;
	}
	@Override
	public String toString() {
		// it also calls superClass' toString method
		// it shows which class is the superClass
		return String.format("A Cone object, %s"
					, super.toString());
	}
}
