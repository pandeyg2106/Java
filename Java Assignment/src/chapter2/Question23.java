package chapter2;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the driving distance: ");
		double dist = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double mpg = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double ppg = input.nextDouble();
		
		double fuel_used = dist/mpg;
		double cost = fuel_used*ppg;
		
		System.out.print("The cost of driving is $"+cost);

	}

}
