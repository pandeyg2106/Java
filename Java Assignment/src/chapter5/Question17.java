package chapter5;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int num = input.nextInt();
		for(int i=1;i<num+1;i++){
			for(int j=num;j>0;j--){
				if (j>i){
					System.out.print("   ");
				}
				else{
					System.out.printf("%3d",j);
				}
			}
			for(int k=1;k<num+1;k++){
				if (k<=i){
					if (k!=1){
						System.out.printf("%3d",k);
					}
				}
			}
			System.out.println();
		}

	}

}
