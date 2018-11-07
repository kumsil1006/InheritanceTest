

public class Cube extends _3Dshape{

	// constructor
		public Cube(double length) {
			setLength(length);
		}
		
		// methods
		@Override
		public double calculateArea() {
			// calculate Cube's Area
			return 6 * getLength() * getLength();
		}
		@Override
		public double calculateVolume() {
			// calculate Cube's Volume
			return Math.pow(getLength(), 3);
		}
		@Override
		public String toString() {
			// it shows which class is the superClass
			return String.format("A Cube object, %s"
						, super.toString());
		}
}
