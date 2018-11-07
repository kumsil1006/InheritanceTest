

public class Circle extends _2Dshape{

		// constructor : set radius
		public Circle(double radius) {
			setRadius(radius);
		}
		
		// methods
		@Override
		public double calculateArea() {
			// calculate Circle's Area
			return Math.PI * getRadius() * getRadius();
		}
		@Override
		public double calculatePerimeter() {
			// calculate Circle's perimeter
			return Math.PI * getRadius() * 2;
		}
		@Override
		public String toString() {
			// it also calls superClass' toString method
			// it shows which class is the superClass
			return String.format("A Circle object, %s", super.toString());
		}
}
