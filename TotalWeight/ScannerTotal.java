package TotalWeight;

import java.util.Scanner;
public class ScannerTotal{
	
	public static void main (String[]args) {
		Scanner Weights = new Scanner (System.in);
		System.out.println("Please enter a weight average.");
		double avg = Weights.nextDouble();
		System.out.println("Please enter the amount of weights.");
		int quantity = Weights.nextInt();
		double WeightTotal = avg * quantity;
		System.out.println("Your combined weight is " + WeightTotal);
		Weights.close();
	}

}