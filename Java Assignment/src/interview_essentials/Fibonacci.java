package interview_essentials;

public class Fibonacci {
	
	int a = 0;
	int b = 1; 
	
	public void fibonacci(int n){
		System.out.print(a+" "+b+" ");
		for(int i=0;i<n;i++){
			int sum = a + b;
			System.out.print(sum+" ");
			a = b;
			b = sum;			
		}		
	}	
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		fib.fibonacci(10);
		
	}

}
