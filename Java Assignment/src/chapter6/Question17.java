package chapter6;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter n: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		printMatrix(num);
	}	
		public static void printMatrix(int n){
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.printf("%2d",(int)(Math.random()*2));
				}
				System.out.println();
		}
	}
}
