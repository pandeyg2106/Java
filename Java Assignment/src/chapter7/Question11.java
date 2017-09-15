package chapter7;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter ten data points ");
		double [] num = new double[10];
		for(int i=0; i < num.length; i++){
	        num[i] = input.nextDouble();
		}
		System.out.printf("The mean is %.2f",mean(num));
		System.out.printf("\nThe standard deviation is %.5f",deviation(num));
	}
	public static double mean(double[] x){
		double sum = 0;
		for(int i=0;i<x.length;i++){
			sum=sum+x[i];
			}
		return (sum/x.length);
	}
	public static double deviation(double[] x){
		double sum = 0;
		double m = mean(x);
		for(int i=0;i<x.length;i++){
			sum+=Math.pow((x[i]-m), 2);
			}	
		double deviation=Math.sqrt(sum/(x.length-1));
		return deviation;
	}
}
