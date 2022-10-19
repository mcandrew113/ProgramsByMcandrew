package Calendar;
/**
 * Test whether days of the month are even or odd with logic
 * @author Mcandrew Okwei
 * @version 1.8 (18 January 2022)
 */
public class Calendar{
private static int isEven;
static boolean EvenorOdd;
/**
 * set fields to use in other methods
 * @param isEven
 */
public void Days(int isEven) {
isEven = 0;
EvenorOdd = false;
}
/**
 * 
 * @param Counter
 * @return true (when day counter is even)
 */
public static boolean Track(int Counter ) {

Counter=0;
Counter++;
while (Counter <= 31) {
if (Counter % 2 == isEven)
{
EvenorOdd= true;
}
else  {
	EvenorOdd= false;
}
return EvenorOdd;
						}
return false;				}
public static void main (String[]args) {
	Track (isEven );
	System.out.println("Which days of the month are even? " + Track(10));
}

					}

