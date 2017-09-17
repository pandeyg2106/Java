package interview_essentials;

public class Fibonacci_Recursion {
	
	public int fibonacci(int n)  {
	    if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	      return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static void main(String[] args) {
		Fibonacci_Recursion fib = new Fibonacci_Recursion();
		System.out.println(fib.fibonacci(5));
	}
}

