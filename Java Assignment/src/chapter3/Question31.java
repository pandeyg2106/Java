package chapter3;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double rate = input.nextDouble();
		
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int choice = input.nextInt();
		
		if (choice==0){
			System.out.print("Enter the dollar amount: ");
			double dollar = input.nextDouble();
			double yuan = dollar*rate;
			System.out.print("$"+dollar+" is "+yuan+" yuan.");
		}
		else{
			System.out.print("Enter the yuan amount: ");
			double yuan = input.nextDouble();
			double dollar = yuan/rate;
			System.out.print("yuan "+yuan+" is $"+dollar);
		}

	}

}
