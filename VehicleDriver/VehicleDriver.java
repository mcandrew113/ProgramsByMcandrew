package VehicleDriver;

import Vehicle.Vehicle;
/**
 * Import Vehicle class create and give attributes to a vehicle object.
 * @author Mcandrew Okwei
 * @version 2.8 (28 August 2022)
 */
public class VehicleDriver{                         // Line 13
	  public static void main( String[] args ){         // Line 14
	    Vehicle econo = new Vehicle( );                 // Line 15
	    econo.setPrice( 5000.0 );                       // Line 16
	    System.out.println( "$: " + econo.getPrice() ); // Line 17
	  }
	}
