package chapter6;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter any number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(isPalindrome(num)){
			System.out.println("The given number is a palindrome.");
		}
		else{
			System.out.println("The given number is not a palindrome.");
		}
	}
		public static int reverse(int number){
			int rev=0;
			while (number!=0){
				rev = rev*10+number%10;
				number = number/10;
			}
			return rev;
		}
		public static boolean isPalindrome(int number){
			return (number==reverse(number));
		}
}
