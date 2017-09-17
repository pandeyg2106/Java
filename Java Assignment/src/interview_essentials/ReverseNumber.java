package interview_essentials;

public class ReverseNumber {
	
	public void reverseNumber(int n){
		int num = n;
		int reverse = 0;
		while(num>0) {
		int digit = num % 10;
		reverse = reverse*10 + digit;		
		num = num/10;
		} 
		System.out.println("The reverse of "+n+" is "+reverse);
	}
	
	public static void main(String[] args) {
		ReverseNumber obj = new ReverseNumber();
		obj.reverseNumber(527);		
	}

}
