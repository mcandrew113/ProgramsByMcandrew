package Vehicle;
public class Vehicle{                               // Line 1
  private double price;  // dollars and cents       // Line 2

  public void setPrice( double price ){             // Line 4
    this.price = price;                             // Line 5
  }                                                 // Line 6

  public double getPrice( ){                        // Line 8
    return price;                                   // Line 9
  }                                                 // Line 10
                                                 // Line 11


  public static void main( String[] args ){         // Line 14
    Vehicle econo = new Vehicle( );                 // Line 15
    econo.setPrice( 5000.0 );                       // Line 16
    System.out.println( "$: " + econo.getPrice() ); // Line 17
  }
}