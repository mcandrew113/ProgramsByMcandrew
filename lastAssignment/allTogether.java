package lastAssignment;
import java.util.Random;
//import java.util.Arrays;
public class allTogether{
	
public static void main(String[]args) {
	//Scanner inp = new Scanner(System.in);
double[][] puzzle = new double [3] [3];
	//int [] [] gameOver = {{0,1,2}, {3,4,5}, {6,7,8}};
	Random random = new Random();

	//matricy(puzzle, random);
	//input(inp, puzzle);
	distFormula(puzzle, random );

	}
public static void matricy(int[][] puzzle, Random random) {
	
	
	
	for(int x=0; x<puzzle.length;x++) {
		
		for(int i=0; i<puzzle[0].length;i++) {
			puzzle[x][i] = random.nextInt(8);
			
	//System.out.print(puzzle[x][i]);
		}
		System.out.println("");
	}

	}

	/*public static void input(Scanner inp, double [] [] puzzle){
		
			
		while(inp!=0) {
			System.out.println("Please enter an int 0-8");
			int num = inp.nextInt();
			
			if (num<1000 || num>10) {
				System.out.print("true"); 
				System.out.println(" ");
			}
			
			
			

		}
	
	}
	*/
	public static void distFormula(double [][]puzzle, Random random) {
		
		for(int x=0; x<puzzle.length;x++) {
			
			for(int i=0; i<puzzle[0].length;i++) {
				
				puzzle[x][i] = random.nextInt(8);
				
		System.out.println (puzzle[x][i]);
		
			}
			System.out.println("");
	}

		
		
		
		
		
	}
	
}


 	
