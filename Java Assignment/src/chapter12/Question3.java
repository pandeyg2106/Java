package chapter12;

import java.util.Scanner;

public class Question3 {
public static void main(String args[]){
	int a[]=createArray();
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the index of the array");
	int index=input.nextInt();
	try{
		System.out.println("Element at index "+index+" is "+a[index]);
	}catch(ArrayIndexOutOfBoundsException ex){
		System.out.println("Out of Bounds");
	}
}
public static int[] createArray(){
	int ar[]=new int[100];
	for(int i=0;i<100;i++){
		ar[i]=(int)(Math.random()*1000);
	}
	return ar;
}
}