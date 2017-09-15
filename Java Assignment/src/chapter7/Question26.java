package chapter7;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter array 1: ");
		int [] arr1 = new int[5];
		int [] arr2 = new int[5];
		for(int i=0;i<arr1.length;i++){
			arr1[i] = input.nextInt();
		}
		System.out.print("Enter array 2: ");
		for(int j=0;j<arr2.length;j++){
			arr2[j] = input.nextInt();
		}
		if (equals(arr1,arr2)){
			System.out.print("The two arrays are strictly identical");
		}
		else
			System.out.print("The two arrays are not strictly identical");
	}
	public static boolean equals(int[] list1, int[] list2){
		for(int i=0;i<list1.length;i++){
			if(list1[i]!=list2[i]){
				return false;
			}
		}
		return true;
	}

}
