package Circle;
import Shape.Shape;
/**
 * Create a circle
 * @author User Mcandrew Okwei
 * @version 0.5 (10/5/2022)
 */

public class Circle extends Shape {
	private  String ShapeName;
	private double radius;
	public Circle() {
	}
	public Circle (String Name, double area, double radius) {
		this.ShapeName = Name;
	this.radius = radius;
		
	}
	
	public double setRadius (double r) {
		radius = r;
		area = Math.PI * Math.pow(r, 2);
		setArea(area);
		return radius;
	}
	public double getRadius() {
		return radius;
	}
	public String getShapeName() {
		return ShapeName;
	}
	public void setShapeName(String Name) {
		ShapeName = Name;
	}
	public String toString (){
		 return "Shape:\t" + ShapeName + "\n\tarea: " + area + "\n\t\tradius: " + radius;
    }
	
	public static void main(String[]args) {
	
		
	}
	
}