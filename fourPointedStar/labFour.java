package fourPointedStar;
import java.util.Scanner;

public class labFour {
	public static void main (String[]args) {      //only call area method here to print answer!!
		double radius = getRadius();
		double sArea = squareArea(radius);
		double cArea = circleArea(radius);
		printArea(sArea - cArea);
		int a = 5;

		System.out.println(10 > a);
}


public static void printArea(double areaStar) {
	System.out.println ("The area of a four pointed star is, " + areaStar) ;
}
public static double getRadius()
{	
	Scanner scanner = new Scanner (System.in) ;
	System.out.println ("Please enter any double value for the radius of a circle!") ;
	double radius = scanner.nextDouble() ;
	scanner.close();
	return radius ;
	
}

public static double circleArea(double radius) {	
	double areaCircle =  (Math.PI * Math.pow(radius,2));
	return areaCircle ;
}

public static double squareArea(double radius) {	
	double areaofSquare =  Math.pow(2 * radius, 2) ;
	return areaofSquare;
}

 }




