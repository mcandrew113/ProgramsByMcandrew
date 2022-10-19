package scannerPhrase;
import java.util.Scanner;           
/**
 * prompr for a phrase then display it using scanner
 * @class ScannerPhrase
 * @author Mcandrew Okwei
 * @version 2.8 (28 August 2022)
 */
public class ScannerPhrase {              
	public static void main(String[]args) {         //first point execution
		
		Scanner phrase = new Scanner(System.in);				//declare scanner object
		
		System.out.println("Type an inspirational phrase and hit enter");           //prompt for input
		String inspiration = phrase.nextLine();											//store reference for input
		System.out.println( "You entered, " + inspiration);							//release input back to user
	
	phrase.close();   
						//In Eclipse, it is a common convention to close when finished.
	
	}
	
	
}