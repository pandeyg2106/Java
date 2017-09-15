package chapter5;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float tution=10000;
		float rate=(float) 0.05,total=0;
		for(int i=0;i<14;i++){
			tution=tution*(1+rate);
			if(i==9)
				System.out.printf("The tuition in ten years will be :$%.2f",tution);			   
			if(i>9)
				total+=tution;
		}
		System.out.println();
		System.out.printf("Total cost of four years’ worth of tuition after the tenth year will be :$%.2f",total);

	}

}
