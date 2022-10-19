package FrozenYogurt;
import java.util.Scanner;

/**
 * validate user input in order to create a frozen yogurt object and fill it with attributes (Topping, price etc.)
 * 
 * @author Mcandrew Okwei
 *@version 0.6 (6 September 2022)
 */

public class FrozenYogurtDriverWithMixins { 
	final static double update = 0.49;
	public static void main(String[] args) {		
		FrozenYogurt myYogurt = new FrozenYogurt();
		Scanner yogurts = new Scanner(System.in);
		
		System.out.println("Welcome to the Frozen Yogurt Selector");        //prompting for choices here
		System.out.println("");
		System.out.println("Would you like to add a frozen yogurt ?");  // keep prompting until conditions met and "" is returned
		String choose = yogurts.nextLine();
	
		while (!choose.equalsIgnoreCase("yes") ) {		
			System.out.println("You chose:  "+ choose);
		if ((choose.equalsIgnoreCase("no"))) { // keep prompting until conditions met and "" is returned
				yogurts.close();
				System.out.println("Thank you!");
				return;
		}
			if ((!choose.equalsIgnoreCase("no")) || !choose.equalsIgnoreCase("yes")) {
				System.out.println("Sorry, " + choose +" is neither yes nor no");
				System.out.println("Would you like to add a frozen yogurt ?");  // keep prompting until conditions met and "" is returned
				choose = yogurts.nextLine();			
			}	
		}
		System.out.println("What is the name of the frozen yogurt ?"); // keep prompting until conditions met and "" is returned
		String yogurtName = yogurts.nextLine();
		myYogurt.setName(yogurtName); 		
		System.out.println("What is the price of the yogurt ?"); // keep prompting until conditions met and "" is returned
		String mychoice = myYogurt.setPrice(yogurts.nextDouble());		
		while(mychoice != ""){
			System.out.println(mychoice);
			System.out.println("What is the price of the yogurt ?");
			mychoice = myYogurt.setPrice(yogurts.nextDouble());
		}
		System.out.println("What is the base flavor of the yogurt ?"); // keep prompting until conditions met and "" is returned
		String baseFlavor = yogurts.next();
		while(myYogurt.setYogurtFlavor(baseFlavor)!= "" ) {			
			System.out.println( myYogurt.setYogurtFlavor(baseFlavor));
			System.out.println("What is the base flavor of the yogurt ?");	
			 baseFlavor = yogurts.next();
		}
		System.out.println("What is the topping of the yogurt ?"); // keep prompting until conditions met and "" is returned
		myYogurt.addTopping(yogurts.next());
		String end ="no";
		while(end.equalsIgnoreCase("no")) {
		System.out.println("Would you like another topping for the yogurt ?");   // keep prompting until conditions met and "" is returned
		String choice = yogurts.next();		
			if(!(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("no"))) {
				System.out.println("Sorry, " + choice +" is neither yes nor no");						
			}	
			if(choice.equalsIgnoreCase("yes")) {
				System.out.println("What additional topping would you like for the yogurt ?");
				myYogurt.addTopping(yogurts.next());	
			}
			if(choice.equalsIgnoreCase("no")) {
				break;		
			}			
		}
		
		System.out.println(myYogurt.toString());
		System.out.println("");
		System.out.println("Thank you!");
		yogurts.close();
	}		
}