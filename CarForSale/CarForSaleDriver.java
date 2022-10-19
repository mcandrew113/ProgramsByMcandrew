package CarForSale;
import java.util.Scanner;


public class CarForSaleDriver{

    public static void main( String[] args ){

        // Prompt the user for the model, asking price and year for two different vehicles
        Scanner stdin = new Scanner( System.in );

        // local variables to hold input from the user for each of the two vehicles
        String modelFromUser = "";
        double priceFromUser = 0.0;
        int yearFromUser = 0;

        System.out.print( "Please enter the model of the first vehicle: ");
        modelFromUser = stdin.next();
        System.out.println( "You entered " + modelFromUser);

        System.out.print( "Please enter the asking price for the " + modelFromUser + ": ");
        priceFromUser = stdin.nextDouble();
        System.out.println( "You entered " + priceFromUser);

        System.out.print( "Please enter the year of the " + modelFromUser + ": ");
        yearFromUser = stdin.nextInt();
        System.out.println( "You entered " + yearFromUser);

        // first vehicle
        CarForSale carA = new CarForSale( modelFromUser, priceFromUser, yearFromUser);

        // second vehicle
        CarForSale carB = new CarForSale();

        System.out.print( "Please enter the model of the second vehicle: ");
        modelFromUser = stdin.next();
        System.out.println( "You entered " + modelFromUser);
        carB.setModel( modelFromUser );

        System.out.print( "Please enter the asking price for the " + carB.getModel() + ": ");
        priceFromUser = stdin.nextDouble();
        System.out.println( "You entered " + priceFromUser);
        carB.setPrice( priceFromUser );

        System.out.print( "Please enter the year of the " + carB.getModel() + ": ");
        yearFromUser = stdin.nextInt();
        System.out.println( "You entered " + yearFromUser);
        carB.setYear( yearFromUser );

        System.out.println();


        // Display the car to by based on the asking price then the year  
        boolean decided = false;

        if( carA.getPrice() < carB.getPrice() ){
            System.out.println( "The " + carA.getModel() + " has a lower asking price" );

            if( carA.getYear() >= carB.getYear() ){
                System.out.println( "The " + carA.getModel() + " is also newer" );
                System.out.println( "I'm going to go with the " + carA.toString() );
                decided = true;
            }
        }else{
            System.out.println( "The " + carB.getModel() + " has a lower asking price" );

            if( carB.getYear() >= carA.getYear() ){
                System.out.println( "The " + carB.getModel() + " is also newer" );
                System.out.println( "I'm going to go with the " + carB.toString() );
                decided = true;
            }
        }

        // Neither vehicle is an obvious choice, so display both of them
        if( ! decided ){
            System.out.println("I can't decided between the following cars:");
            System.out.println( carA.toString() );
            System.out.println( carB.toString() );
        }
        stdin.close();
    }	
}