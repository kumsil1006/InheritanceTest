

public abstract class _3Dshape {
	// fields
	private double width;
	private double length;
	private double height;
	private double radius;
	private double area;
	private double volume;
	
	// constructor
	public _3Dshape(double width, double length, double height, double radius){
		
	}
	
	//constructor Overloading
	public _3Dshape(){
	
	}
	
	// methods
	// setter
	public void setWidth(double w){
		this.width = w;
	}
	public void setLength(double l){
		this.length = l;
	}
	public void setHeight(double h){
		this.height = h;
	}
	public void setRadius(double r){
		this.radius = r;
	}
	public void setArea(double a){
		this.area = a;
	}
	public void setVolume(double p){
		this.volume = p;
	}
	
	// getter
	public double getWidth(){
		return width;
	}
	public double getLength(){
		return length;
	}
	public double getHeight(){
		return height;
	}
	public double getRadius(){
		return radius;
	}
	public double getArea(){
		return area;
	}
	public double getPerimeter(){
		return volume;
	}
	
	// toString
	public String toString(){
		return "inherited from _3Dshape class.";
	}
	
	// abstract methods : So the class _3Dshape should be an abstract class
	public abstract double calculateArea(); // an abstract method for calculating area
	public abstract double calculateVolume(); // an abstract method for calculating volume
}
