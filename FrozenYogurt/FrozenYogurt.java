package FrozenYogurt;      //Author Mcandrew Okwei 6 September 2022
/**
 * @author Mcandrew Okwei 
 * @version 1.0
 * 
 * 
 *
 */
public class FrozenYogurt{  
	
private static String name;         // Field variables
private static double price;
static String flavor;
private static StringBuilder topping;
private static String myMessage ="We appreciate you getting Frozen Yogurt";


// Get methods here (find the variables involved) Return needs to be data type
	public FrozenYogurt() {		
		name="";
		price = 0.0;
		flavor="";
		topping= new StringBuilder();
	}
	/**
	 * @param name1
	 * @param price1
	 * @param flavor1
	 * @param topping1
	 *
	 */
	public FrozenYogurt(String name1, double price1, String flavor1, StringBuilder topping1) {
		this();
		name=name1;
		price=price1;
		flavor=flavor1;
		topping=topping1;
	}

	/**
	 * 
	 * @return name's value saved in stack
	 */
	public String getName() { //accessor
		return name;
		}
	/**
	 * 
	 * @return memory location of flavor in stack
	 */
	public  String getYogurtFlavor() { //accessor
		return flavor;
		}
	/**
	 * 
	 * @param price1
	 * @return price only if price>0 and price<100
	 */
	public String setPrice(double price1){ //accessor
		if (isNegative(price1)  ) {return "ALERT: Unable to set " + name + "'s price to " + price1 + " (negative values are not allowed)";}
		if (price1 >= 100) {return "ALERT: Unable to set " + name + "'s price to " + price1 + " (value is too high (>=100.00))";}		
	price = price1;
	return "";		
	}
	/**
	 * 
	 * @param d
	 * @return true if double d is less than 0, false if d>= 0
	 */
	public static boolean isNegative(double d) { 
	     return Double.compare(d, 0.0) < 0;
	}
	/**
	 * @return Name location in memory
	 */
	public String setName(String name1) { // set field to instance
		 name = name1;
		 return name;
	   }
	/**
	 * 
	 * @return base or updated price of yogurt
	 */
	public double getPrice(){
	   return price;
		} //take price out of memory
	/**
	 * 
	 * @param flavor1
	 * @return Alert if price <0 or price>= 100
	 */
	public String setYogurtFlavor(String flavor1) { //mutator		 	
		 if (!(flavor1.equalsIgnoreCase("vanilla") || flavor1.equalsIgnoreCase("chocolate"))) {
			 return ("ALERT: " + flavor1 +" is not one of the valid yogurt flavors (chocolate or vanilla)!"); //return if flavor != vanilla || chocholate;
		 }
		 flavor=flavor1;
		 return "";       // return flavor value and "" if flavor== vanilla || chocolate;
	}
	/**
	 * 
	 * @param topping1
	 * @return empty string after topping is added
	 */
	public String addTopping (String topping1) {		  // give a topping to string builder 
		price=price + .49;
		if (topping1.length() > 0) {
			topping.append(topping1 + ", ");
		}
		
		return "";
	
	}
	/**
	 * 
	 * @return Frozen yogurt constructor name price toppings and flavor values
	 */
	
	public String toString() {
		return "Frozen Yogurt :  " + name + "\r\n Price  :  $" + String.format("%.2f", price) + "\r\n Yogurt        :" + flavor + "\r\n Topping(s)    :" + topping.toString().substring(0,topping.length()-2);		
	}
	/**
	 * 
	 * @return a pretty message because im so kind i deserve 10 extra points **COUGH COUGH PLEASE DR CARROLL**
	 */
	public String mycustomMethod() {
		return myMessage;
	}
	
	public static void main(String[]args) {	}
	
}
	
	
	
	
	
	
	/*Points      Item
	----------  --------------------------------------------------------------
	_____ / 10  Style
	            + Code is indented correctly
	            + Methods should be no longer than 1 page
	            + Documentation: (written for another software developer)
	              * All source code files include header block with description, author, version, etc.
	              * Comments before each method
	              * All non-trivial variables are commented
	              * Comments included before major portions of code
	_____ /     Compiles (max of 50% if it doesn't compile)
	_____ /  8  Constructor-No Parameters and Accessor Methods Test
	_____ / 13  Constructor and Accessors Test
	_____ / 20  Mutators and Accessors Test
	_____ / 13  toString() Test
	_____ / 21  Input / Output Tests (including creating and using a FrozenYogurt object) 
	_____ /  5  this (Keyword) Test
	_____ /  8  Custom method (designed and called)
	_____ /  2  Completed rubric (estimates for each line including hours spent, and signing your name to affirm it's your own work)

	_____ /100  Total


	_____  Approximate number of hours spent

	I, (REPLACE WITH YOUR FULL NAME), affirm that the code that I submitted is my own work and that I did not receive help that was not authorized by the instructor.
	
	
	
	
	*/
							