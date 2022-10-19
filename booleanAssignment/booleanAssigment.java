package booleanAssignment;

public class booleanAssigment {
public static void main (String[] args) {
	numberOne();
	numberThree();
	numberFour();
	//! (a > c) && b > c

//What if values of a,b,c are respectively 1,2,3? Result of expression is......

//What if values of a,b,c are respectively 3,2,1? Result of expression is......

//What if values of a,b,c are all equal to 3? Result of expression is......
	
	
	//If the expression p is more likely to be true than the expression q, which one should you place

//	on the left of each operator to avoid doing extra work? Explain why.

	//a) left of the && expression: 

//	b) left of the || expression: 
}

private static void numberOne() {
int a =1;
int b =2;
int c =3;
			System.out.println("Number 1a is, " + (! (a > c) && b > c));
		
a = 3 ; c = 1 ;
System.out.println("Number 1b is, "+ (! (a > c) && b > c)) ;

a=3 ;
b=3 ;
c=3; 
System.out.println ("Number 1c is, " + (! (a > c) && b > c));
}
// Number 2 short circuiting:
	// A. To the left of the && expression, Q should go first, because there's a better chance the expression will compile as false with Q. 
//The program has to read both P and Q but can avoid more work if possible if Q is already false, a true and false returns false.

//B. On the left of || operand, P should go first logically. The compiler will return true only if 1 side is true, 
// this means that the best chance of a short circuit would be putting P first!

private static void numberThree() {

//System.out.println ("The result of A is, " + (1 + 0 > 0 || 1 / 0 > 0) );

//Here number 1 throws an error because of the middle expression. To avoid this, we could use the or operand because 
//The first expression returns as true so the system will take a shortcut.


//System.out.println ("The result of B is, " + (1 + 0 > 0 || 1 / 0 > 0) );
}
private static void numberFour() {
	int a = 5; int b = 6; int c = 4;
	System.out.println(" Number 4a is, "+ ! (a < b));
	
	System.out.println(" Number 4b is, "+ ! (b < c));
	int d = 10;
	int s = 11;
	System.out.println ("Number 4c is, "+ !( (s >= d) ||( d >= s)))  ;
	
	System.out.println ("Number 4c is, "+ !( (s >= d) ||( d >= s)))  ;

	System.out.println ("Number 4c is, "+ ( (s >= d) ||( d >= s)))  ;
}

}