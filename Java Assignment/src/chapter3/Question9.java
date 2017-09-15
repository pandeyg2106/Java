package chapter3;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		//int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		long num = input.nextLong();
		int d1 = (int)num%10;
		int s1 = d1*9;
		
		long num1 = num/10;
		int d2 = (int)num1%10;
		int s2 = d2*8;
		
		long num2 = num1/10;
		int d3 = (int)num2%10;
		int s3 = d3*7;
		
		long num3 = num2/10;
		int d4 = (int)num3%10;
		int s4 = d4*6;
		
		long num4 = num3/10;
		int d5 = (int)num4%10;
		int s5 = d5*5;
		
		long num5 = num4/10;
		int d6 = (int)num5%10;
		int s6 = d6*4;
		
		long num6 = num5/10;
		int d7 = (int)num6%10;
		int s7 = d7*3;
		
		long num7 = num6/10;
		int d8 = (int)num7%10;
		int s8 = d8*2;
		
		long num8 = num7/10;
		int d9 = (int)num8%10;
		int s9 = d9*1;
		
		
		
		int sum = s1+s2+s3+s4+s5+s6+s7+s8+s9;
		int chksum = sum%11;
		
		//int d = 9-l;
		//String str = String.format("%03d",num1);
		//System.out.println(str);
		
		if (chksum==10){
			String d10 = "X";
			System.out.print("The ISBN-10 number is "+d9+d8+d7+d6+d5+d4+d3+d2+d1+d10);
	}
		else{
			int d10 = chksum;
			System.out.print("The ISBN-10 number is "+d9+d8+d7+d6+d5+d4+d3+d2+d1+d10);
		}
		

	}
	}


