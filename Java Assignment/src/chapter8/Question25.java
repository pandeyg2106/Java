package chapter8;
import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a 3-by-3 matrix row by row:");
		double[][] matrix=createMatrix(3);
		if(isMarkovMatrix(matrix))
			System.out.println("It is a Markov matrix");
		else
			System.out.println("It is not a Markov matrix");
		
	}
		public static double[][] createMatrix(int n) {
			Scanner input= new Scanner(System.in);
			double[][] res=new double[n][n];
			for(int i=0;i<n;i++){	
				System.out.println("Enter row: "+i);
					res[i][0]=input.nextDouble();	
					res[i][1]=input.nextDouble();	
					res[i][2]=input.nextDouble();	
			}
			return res;			
		}
		public static boolean isMarkovMatrix(double[][] m){
			for(int col=0;col<m[0].length;col++){
				double total=0;
				for(int row=0;row<m.length;row++){
					if(m[row][col]<0)
						return false;
					else
						total+=m[row][col];				
				}
				if(total!=1)
					return false;
		}
			return true;
		}

	}
