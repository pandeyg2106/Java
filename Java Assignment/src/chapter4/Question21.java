package chapter4;

import java.util.Scanner;
public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a SSN:");//Social Security number in the format DDD-DD-DDDD, where D is a digit
		String ssn=input.next();
		if(ssn.length()!=11)
			System.out.print(ssn+" is an invalid social security number");
		else if(Character.isDigit(ssn.charAt(0))&&Character.isDigit(ssn.charAt(1))&&Character.isDigit(ssn.charAt(2))&&
				(ssn.charAt(3)=='-')&&Character.isDigit(ssn.charAt(4)
				)&&Character.isDigit(ssn.charAt(5))&&(ssn.charAt(6)=='-')&&Character.isDigit(ssn.charAt(7))&&Character.isDigit(ssn.charAt(8))
				&&Character.isDigit(ssn.charAt(9))&&Character.isDigit(ssn.charAt(10)))
			System.out.print(ssn+" is a valid social security number");
		else
			System.out.print(ssn+" is an invalid social security number");
	}

	}

