
public abstract class _2Dshape {

	// fields
	private double width;
	private double height;
	private double radius;
	private double area;
	private double perimeter;
	
	// constructor
	public _2Dshape(double width, double height, double radius){
			
	}
	// Constructor Overloading
	public _2Dshape(){
		
	}
	// methods
	// setter
	public void setWidth(double w){
		this.width = w;
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
	public void setPerimeter(double p){
		this.perimeter = p;
	}
	
	// getter
	public double getWidth(){
		return width;
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
		return perimeter;
	}
	
	// toString
	public String toString(){
		return "inherited from _2Dshape class.";
	}
	
	// abstract methods : So the class _2Dshape should be an abstract class
	public abstract double calculateArea(); // an abstract method for calculating Area
	public abstract double calculatePerimeter(); // an abstract method for calculating Perimeter
	
}
