package chapter3;

import java.util.Scanner;
import java.util.Random;

public class Question17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2): ");
		int user = input.nextInt();
		
		int computer = (int )(Math.random() * 2 + 0);
		
		if (computer==user){
				System.out.print("The computer is "+user+" You are a "+user+" too. Its a tie");
			}
		if (user==0){
			if (computer==1){
				System.out.print("The computer is rock. You are scissor. You loose");
			}
			else if(computer==2){
				System.out.print("The computer is paper. You are scissor. You won");
			}
		}
		if (user==1){
			if (computer==0){
				System.out.print("The computer is scissor. You are rock. You won");
			}
			else if(computer==2){
				System.out.print("The computer is paper. You are rock. You loose");
			}
		}
		if (user==2){
			if (computer==0){
				System.out.print("The computer is scissor. You are paper. You loose");
			}
			else if (computer==1){
				System.out.print("The computer is rock. You are paper. You won");
			}
		}
		}
		}
		


