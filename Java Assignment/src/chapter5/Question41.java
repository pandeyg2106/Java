package chapter5;

import java.util.Scanner;

public class Question41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter Numbers: ");
		int num = input.nextInt();
		int count=1, max=num;
		while (num!=0){
			num=input.nextInt();
			if (num>max){
				max=num;
				count=1;
			}
			else if (num==max){
				count+=1;
			}
		}
		System.out.print("The largest number is "+max);
		System.out.print("\nThe occurrence count of the largest number is "+count);
	}
}
