package Shape;
/**
 * Defines a basic shape with just area
 * @author Hyrum D. Carroll
 * @version 0.3 (3/23/2022)
 */
public class Shape{
    protected double area;
    protected String ShapeName;
    public Shape(){ area = 0.0; }
    public Shape( double a ){ area = a; }
    public void setArea( double a ){ area = a; }
    public void setShapeName( String name ){ ShapeName = name; 
    ;}
    public String getShapeName( ){ 
    	return ShapeName;
    }

    public double getArea(){ return area; }
    public String toString(){
        return "Shape:\t" + ShapeName + "\n\tarea: " + area; 
    }
}
	
	
	
