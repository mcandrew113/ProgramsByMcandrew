package ninePuzzle;
import java.util.Scanner;
/**
 * create a 3x3 box number sorting puzzle with 9 spaces
 * 
 * @author Mcandrew Okwei
 * @version 2.4 (May 24 2022)
 * 
 */
public class nineBox{
public static void main (String[] args) {
	Scanner inp = new Scanner(System.in);
	
	char [] [] puz= {{' ','5','8'}, {'1','3','2'},{'4','7','6'}};
	//char [] [] complete= {{' ','1','2'}, {'3','4','5'},{'6','7','8'}};
	stringArr(puz);
	
	System.out.println("Enter a value from 1-8.");
	String a = inp.next();

while (!a.startsWith("0") ) {
	char choice = a.charAt(0);
		int q= 0;
		int w=0;
		
		
	search: for(q=0; q<=puz.length-1;q++) {
			
			for(w=0; w<=puz[q].length-1;w++){
					if (puz[q][w] == a.charAt(0)) {
						break search;
					}
			}
			
	}
	if (q > 0 && (puz[q-1][w] == ' ')) {
		
		puz[q][w] = ' ';
		puz[q-1][w] = choice;
	}
	else if (q < 2 && (puz[q+1][w] == ' ')) {
	
		puz[q][w] = ' ';
		puz[q+1][w] = choice;
	}
	else if (w > 0 && (puz[q][w-1] == ' ')) {
		
		puz[q][w] = ' ';
		puz[q][w-1] = choice;
	}
	else if (w < 2 && (puz[q][w+1] == ' ')) {
		puz[q][w] = ' ';
		puz[q][w+1] = choice;
	}
	stringArr(puz);
	System.out.println("Enter a value from 1-8.");
	 a = inp.next();
	
	 /* Like you said before prof, no need to be extra. I was going to make condition if game = another array thats in order,
		if (puz[q][w] == complete[x][y]) {  print game over, but no need. Just need to have the actual puzzle working.
			System.out.println("Game over!");
			break;}
	*/
	
} inp.close();

}
/**
 * toString method with another name 
 * 
 * @param puz
 */
public static void stringArr(char[][] puz) {
	
for(int x=0; x<=puz.length-1;x++) {
		
		for(int i=0; i<=puz[x].length-1;i++){
			System.out.print(puz[x][i]);

		}
		System.out.println();
		
}


}
	
}