package chapter6;

import java.util.Scanner;

public class Question37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.print("Enter the width you want: ");
		int width = input.nextInt();
		System.out.print("The formatted string is "+format(num,width));
	}
	public static String format(int number, int width){
		String s = String.valueOf(number);
		int d = width-s.length();
		if (d<0){
			return s;
		}
		else{
			while(d!=0){
			s = '0'+s;
			d--;
		}}
		return s;
	}

}
