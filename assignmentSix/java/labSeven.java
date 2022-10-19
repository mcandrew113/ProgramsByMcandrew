package assignmentSix.java;
import java.util.Arrays;
public class labSeven {
public static void main(String[]args) {
	for (int i = 0; i<30; i+=2) {

		System.out.println(i + "47");

		} 
	 
	gradesOrganized();
	int [] lowest = {75,80,77,79,82}; 
	System.out.println("Lowest grade is "+ lowGrade(lowest,5));
} 


public static void gradesOrganized() {
	int [] tests = {75,80,77,79,82};                 
	int a = 90; int b = 80; int c = 70; 
	int testavg = 0;
	for (int n = 0; n< tests.length; n++) {
		if (tests[n]>a) {                      // I tried using .length in these arrays, but just couldnt figure it out so i used parameter for highest
			System.out.println((n+1) + "." + tests[n] + " A");
		}
		if (tests[n]>=b && tests[n]<a) {
			System.out.println((n+1) + "." + tests[n] + " B");
	}
		if (tests[n]>c && tests[n]<b) {
			System.out.println((n+1) + "." + tests[n] + " C");
		}
   // testavg=testavg + tests[n];
}
	//System.out.println("The test average is " + testavg ); 
Arrays.sort(tests);

if (tests[4]>=a) {
	System.out.println(tests[4] + "A was highest grade, good job!");                                        // Biggest grade
}
if (tests[4]>=b && tests[4]<a) {
	System.out.println("B " + tests[4] +", This was your highest grade.");
}
if (tests[4]>=c && tests[4]<b) {
	System.out.println("C " + tests[4] +", This was your highest grade.");
}
for (int g = 0; g< tests.length; g++) {

testavg=testavg + tests[g];
double realavg= testavg/tests.length;
	if (realavg>a) {
		System.out.println( "Final grade is an A");
	}
	if (realavg>=b && realavg<a) {
		System.out.println("Final grade is a B");
}
	if (realavg>c && realavg<b) {
		System.out.println( " Final grade is a C.");
	System.out.println("Average of tests is, " + realavg);
}
	}
}
private static int lowGrade(int[]lowest, int total) {
	int temp;   //minimum sub method, had to make my own side method because soo many loops it just got too hard.
	for (int i = 0; i < total; i++)   
	        {  
	            for (int j = i + 1; j < total; j++)   
	            {  
	                if (lowest[i] > lowest[j])   
	                {  
	                    temp = lowest[i];  
	                    lowest[i] = lowest[j];  
	                    lowest[j] = temp;  
	                }  
	            }  
	        }  
	       return lowest[0];  
}



}
/*public static void matricy(int[][] puzzle) {
	
	
	
	for(int x=0; x<puzzle.length;x++) {
		
		for(int i=0; i<puzzle[0].length;i++) {
			
	System.out.print(puzzle[x][i]+ "");
		}
		System.out.println("");
	}

	}







/*int[][] puzzle = {{1,2,3}, {4,5,6,},{7,8,9}};
matricy(puzzle);*/
//int [] [] puzzle, int i, int x*/





	









