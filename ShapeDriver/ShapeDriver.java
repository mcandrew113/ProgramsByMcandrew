package ShapeDriver;
import Circle.Circle;
/**
 * Create a simple Circle object
 *
 * @author Hyrum D. Carroll
 * @version 0.2 (10/12/2020)
 */
public class ShapeDriver{
    public static void main( String[] args ){
	Circle cir = new Circle();
cir.setShapeName("Circle");
	cir.setRadius( 5.0 );
	System.out.println( cir.toString() );
    }
}