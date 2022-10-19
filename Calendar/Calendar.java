package Calendar;
public class Calendar{
private static int isEven;
static boolean EvenorOdd;

public void Days(int isEven) {
isEven = 0;
EvenorOdd = false;
}

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

