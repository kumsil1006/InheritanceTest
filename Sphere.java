public class Sphere extends _3Dshape{

	// constructor
		public Sphere(double radius) {
			setRadius(radius);
		}
		
		// methods
		@Override
		public double calculateArea() {
			// calculate Sphere's Area
			return 4 * Math.PI * getRadius() * getRadius();
		}
		@Override
		public double calculateVolume() {
			// calculate Sphere's Volume
			return 4 * Math.PI * getRadius() * getRadius() * getRadius() / 3;
		}
		
		// print details
		@Override
		public String toString() {
			// it shows which class is the superClass
			return String.format("A Sphere object, %s", super.toString());
		}
}
