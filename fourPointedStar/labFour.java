package fourPointedStar;
import java.util.Scanner;
/**
 * @author Mcandrew Okwei
 * @version 1.7 (17 August 2021)
 */

public class labFour {
	public static void main (String[]args) {      //only call area method here to print answer!!
		double radius = getRadius();
		double sArea = squareArea(radius);
		double cArea = circleArea(radius);
		printArea(sArea - cArea);
		int a = 5;

		System.out.println(10 > a);
}

/**
 * print the area of this shape based off of user input
 * @param areaStar
 */
public static void printArea(double areaStar) {
	System.out.println ("The area of a four pointed star is, " + areaStar) ;
}
/**
 * when called will prompt until a valid double radius is given then return it
 * @param areaStar
 * @return radius
 */
public static double getRadius()
{	
	Scanner scanner = new Scanner (System.in) ;
	System.out.println ("Please enter any double value for the radius of a circle!") ;
	double radius = scanner.nextDouble() ;
	scanner.close();
	return radius ;
	
}
/**
 * When called set the circles area using the area formula and user given radius
 * @param radius
 * @return areaCircle
 */
public static double circleArea(double radius) {	
	double areaCircle =  (Math.PI * Math.pow(radius,2));
	return areaCircle ;
}
/**
 * When called set the Square area using the area formula and user given radius * 2 for length
 * @param radius
 * @return areaofSquare
 */
public static double squareArea(double radius) {	
	double areaofSquare =  Math.pow(2 * radius, 2) ;
	return areaofSquare;
}

 }




