package Recursiveloops;
/**
 * practice using loops to create custom methods
 * 
 * @class loops
 * @author Mcandrew Okwei
 * @version 8.0 (August 8, 2022)
 * 
 */

public class loops{
	public static void main(String[]args) {
		int z = 15;
		System.out.println(5 != z);
	skipCountAddition();
	
		System.out.println ("2. The amount of zeros in 1020 is:" + zeroDigits(1020));
	System.out.println("3. If there are any digits from the second number in the first number, result is: " +Mystery(23, 2));
	Mystery(188,8);
	
	}
	/**
	 * Set numbers from 1-168 to the second power (multiply by themselves once)
	 */
	private static void skipCountAddition() {
	for (int i =1; i < 169; i++ ) {
	System.out.println("#1. 2nd Power of " +i+ "\t" + "is:" + "\t" + (i*i)) ;
		}
	}
	/**
	 * Check if a param number has any 0's and how many 0's are in the number </p>
	 * 
	 * @return count
	 * 
	 * <p> return 0 tracker </p>
	 */
	public static int zeroDigits(int number ) {
	    int count = 0;
	    
	    do {
	        if (number % 10 == 0) {
	            count++;
	        }
	        number /= 10;
	    } while (number > 0);
	    
	    return count;
	    //This method uses the modulo to divide a given int by 10 until it's <10. If there are no 0's, the loop breaks and returns false. If there are 0's the amount is given.
	}
	/**
	 * This method checks if the remainder dividing 10 by a param first == second
	 * 
	 * @param first
	 * @param second
	 * @return false if first number / 10 does not leave a remainder of the second given number.
	 */
	public static boolean Mystery(int first, int second) {
		 boolean result = false;
		 while (first > 0) {
		 if (first % 10 == second) {
		 result = true;
		 }
		 first /= 10;
		 }
		 return result;
	//This method use the modulo to divide the first int by 10 until it finds a digit that matches int 2 with the while condition. It returns true if condition is met or false.
}
	







}





