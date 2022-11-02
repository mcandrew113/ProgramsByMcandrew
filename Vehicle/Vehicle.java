package Vehicle;
/**
 * Create methods for a Vehicle object to set and obtain its attributes
 * 
 * @author Mcandrew Okwei
 * @version 2.6 (August 26, 2022)
 */
public class Vehicle{                               
  private double price;  // dollars and cents       
/**
 * Set double price of vehicle object
 * 
 * @param price
 */
  public void setPrice( double price ){             
    this.price = price;                             
  }                                                
/*
*return value of price when called
 * @return price
 * 
 */
  public double getPrice( ){                        
    return price;                                  
  }                                                                                                


  public static void main( String[] args ){         
    Vehicle econo = new Vehicle( );                 
    econo.setPrice( 5000.0 );                       
    System.out.println( "$: " + econo.getPrice() ); 
  }
}