package chapter4;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String letter = input.next();
		char ch=letter.toLowerCase().charAt(0);
		if (ch=='a'||ch=='b'||ch=='c'){
			System.out.print("The corresponding number is 2");
		}
		else if (ch=='d'||ch=='e'||ch=='f'){
			System.out.print("The corresponding number is 3");
		}
		else if (ch=='g'||ch=='h'||ch=='i'){
			System.out.print("The corresponding number is 4");
		}
		else if (ch=='j'||ch=='k'||ch=='l'){
			System.out.print("The corresponding number is 5");
		}
		else if (ch=='m'||ch=='n'||ch=='o'){
			System.out.print("The corresponding number is 6");
		}
		else if (ch=='p'||ch=='q'||ch=='r'||ch=='s'){
			System.out.print("The corresponding number is 7");
		}
		else if (ch=='t'||ch=='u'||ch=='v'){
			System.out.print("The corresponding number is 8");
		}
		else if (ch=='w'||ch=='x'||ch=='y'||ch=='z'){
			System.out.print("The corresponding number is 9");
		}
		else{
			System.out.print(letter+" is an invalid input");
		}
		

	}

}
