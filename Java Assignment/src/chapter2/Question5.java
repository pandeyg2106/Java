package chapter2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal amount: ");
		double subtotal = input.nextDouble();
		
		System.out.print("Enter the gratuity rate: ");
		double gr = input.nextDouble();
		
		double gratuity = (subtotal*gr)/100;
		
		double total = subtotal + gratuity;
		
		System.out.println("The gratuity is "+ gr +"% and the total is "+ total);

	}

}
