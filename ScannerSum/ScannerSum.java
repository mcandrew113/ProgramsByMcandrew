package ScannerSum; // Comment this first line to run in https://www.codepost.io/code/608154 otherwise compilation will fail

import java.util.Scanner; // importing the scanner class

 public class ScannerSum { // Class author: Mcandrew Okwei 29 September 2022
    static Scanner Nums = new Scanner(System.in);
    static int Num1;
    static int Num2;
    static int Num3;

    public static void AddNums(Scanner Nums, int Num1, int Num2, int Num3) {
        System.out.println("Please enter any whole number, positive or negative only!"); // prompt user to enter an int
                                                                                         // value
        Num1 = Nums.nextInt(); // assigning latter int to variable Number1
        System.out.println("Please enter any whole number, positive or negative only!"); // prompt user to enter a
                                                                                         // second int value
        Num2 = Nums.nextInt(); // assigning latter int to variable Number2
        System.out.println("Please enter any whole number, positive or negative only!"); // prompt user to enter a third
                                                                                         // int value
        Num3 = Nums.nextInt(); // assigning latter int to variable Number3
        int combine = (Num1 + Num2 + Num3);
        System.out.println("Your 3 numbers total out to " + combine);
    }

     public static void main(String[] args) { // main point of execution
    	 int count = 0;
    	 ++count;
    	 System.out.print( count );
    	 AddNums(Nums, Num1, Num2, Num3);
    }
}