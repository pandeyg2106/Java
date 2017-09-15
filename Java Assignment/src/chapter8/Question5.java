package chapter8;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub			
			System.out.println("Enter matrix1");
			double[][] matrix1=createMatrix(3,3);
			System.out.println("Enter matrix2");
			double[][] matrix2=createMatrix(3,3);
			System.out.println("The matrices are added as follows \n");
			double[][] res=addMatrix(matrix1, matrix2);
			printMatrix(matrix1,matrix2,res);			
		}
			public static double[][] createMatrix(int row, int col) {
				Scanner input= new Scanner(System.in);
				double[][] res=new double[row][col];
				for(int i=0;i<row;i++){
					for(int j=0;j<col;j++)
						res[i][j]=input.nextDouble();		
				}
				return res;			
			}
			public static double[][] addMatrix(double[][] a, double[][] b) {
				double[][] total=new double[a.length][a[0].length];
				for(int i=0;i<a.length;i++){
					for(int j=0;j<a[0].length;j++)
						total[i][j]=a[i][j]+b[i][j];	
				}
				return total;	
			}
			public static void printMatrix(double[][] a, double[][] b,double res[][]) {
				for(int i=0;i<a.length;i++){
					for(int j=0;j<a[0].length;j++)
			            System.out.print(" " + (a[i][j]));
			        if (i ==(a.length/2))
			        	System.out.print( "  " + "+" + "  ");
			        else
			        	System.out.print( "     ");
			        for(int j=0;j<b[0].length;j++)
			        	System.out.print(" " + (b[i][j]));
			        if (i ==(a.length/2))
			           System.out.print("  =  ");
			        else
			           System.out.print("     ");
			        for (int j=0;j<res[0].length;j++)
			            System.out.print("  "+res[i][j]);
			        System.out.println();
			}
			}

	}

