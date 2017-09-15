package chapter2;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minuites: "); 
		long min = input.nextLong();
		
		double total_days = min/(60*24);
		double total_years = min/(60*24*365);
		int years = (int) (total_years);
		System.out.println(total_years);
		double days = total_days%365;
		
		System.out.println(+min+" minutes is approximately "+years+" years and "+(int)days+" days");		

	}

}
