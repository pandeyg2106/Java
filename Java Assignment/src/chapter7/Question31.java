package chapter7;
import java.util.Arrays;
import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size and elements of the first list:");
		Scanner input= new Scanner(System.in);
		int size=input.nextInt();
		int[] list1=new int[size];
		for(int i=0;i<size;i++){
			list1[i]=input.nextInt();			
		}
		System.out.println("Enter the size and elements of the second list:");
		size=input.nextInt();
		int[] list2=new int[size];
		for(int i=0;i<size;i++){
			list2[i]=input.nextInt();			
		}
		System.out.println("The merged list is:");
		printArray(merge(list1,list2));
	}
	public static int[] merge(int[] list1, int[] list2){
		Arrays.sort(list1);
		Arrays.sort(list2);
		int [] merge= new int[(list1.length+list2.length)];
		int m=(list1.length-1),n=(list2.length-1);
		int i=0,j=0,l=0;
		while(i<=m && j<=n){
			if(list1[i]<=list2[j]){
				merge[l]=list1[i];
				i++;}
			else{
				merge[l]=list2[j];			    
			    j++;}
			l++;   }
		while(i<=m){
			merge[l]=list1[i];
		    l++;
		    i++;}
		while(j<=n){
			merge[l]=list2[j];
		    l++;
		    j++;}
		
	   return merge;
		}		
	
	public static void printArray(int[] ar){
		for (int i=0;i<ar.length;i++){
			System.out.print(ar[i]+" ");
		}

	}

}
