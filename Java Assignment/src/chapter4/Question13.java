package chapter4;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String letter = input.next();
		char ch=letter.toLowerCase().charAt(0);
		
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			System.out.print(letter+" is a vowel.");
		}
		else if ('a'<ch&&ch<'z'){
			System.out.print(letter+" is not a vowel.");
		}
		else{
			System.out.print(letter+" is an invalid input");
		}

	}

}
