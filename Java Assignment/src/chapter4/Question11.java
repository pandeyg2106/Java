package chapter4;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal value (0 to 15): ");
		int decimal = input.nextInt();
		
		if (decimal < 10){
			int hex = decimal;
			System.out.print("The hex value is "+hex);
		}
		else if(decimal<15){
			char hex = (char)(decimal+55);
			System.out.print("The hex value is "+hex);
		}
		else{
			System.out.print(decimal+" is an invalid input.");
		}
		}

	}
