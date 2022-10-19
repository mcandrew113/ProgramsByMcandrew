package loopsMhm;


public class loops{
	public static void main(String[]args) {
		int z = 15;
		System.out.println(5 != z);
	skipCountAddition(0,0);
	quizCheck() ;
		System.out.println ("2. The amount of zeros in 1020 is:" + zeroDigits(1020));
	System.out.println("3. If there are any digits from the second number in the first number, result is: " +Mystery(23, 2));
	Mystery(188,8);
	
	}
	
	private static void skipCountAddition(int i, int x) {
	for (i =1; i < 169; i++ ) {
	

		

	
	System.out.println("#1." + i + "+" + (i+1)) ;

		}
	}
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
	
public static void rowsColumns(int rows) {
	   for (int a = 1; a<=rows ; a = a+1 ) {

		   
		   
		  // this method learn printRow!!!!!!!! 
		   
		   
     }
}
private static void quizCheck() {
	for (int i=1; i<=7; i++) {
		System.out.println (" ewfhfwej" +i); 
		
	}
}






}





