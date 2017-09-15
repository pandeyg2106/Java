package chapter5;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int num = input.nextInt();
		int count_pos=0, count_neg=0, sum=0;
		while (num!=0){
			if (num<0){
				count_neg++;
			}
			else{
				count_pos++;
			}
			sum = sum + num;
			num=input.nextInt();
		}
		double total = count_pos+count_neg;
		double avg = (double)sum/(double)total;
		System.out.print("The number of positives is "+count_pos);
		System.out.print("\nThe number of negatives is "+count_neg);
		System.out.print("\nThe total is "+sum);
		System.out.print("\nThe average is "+avg);
	}

}
