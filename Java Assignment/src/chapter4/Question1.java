package chapter4;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length from the center to a vertex: ");
		double r = input.nextDouble();
		double s = 2*r*Math.sin(Math.PI / 5);
		
		double Area = (5*s*s)/(4*(Math.tan(Math.PI / 5)));
		
		System.out.printf("The area of the pentagon is %.2f",Area);

	}

}
