package scannerPhrase;
import java.util.Scanner;            // import input stream
public class ScannerPhrase {               // Author: Mcandrew Okwei 28 August 2022
	
	public static void main(String[]args) {         //first point execution
		
		Scanner phrase = new Scanner(System.in);				//declare scanner object
		
		System.out.println("Type an inspirational phrase and hit enter");           //prompt for input
		String inspiration = phrase.nextLine();											//store reference for input
		System.out.println( "You entered, " + inspiration);							//release input back to user
	
	phrase.close();   //  Remove comment if compiling requires you to close scanner please!
						//In Eclipse, it is a common convention to close when finished.
	
	}
	
	
}