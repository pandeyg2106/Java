package strings;

public class Palindrome {
	
	String s = "Malayalam";
	int n = s.length();
	
	public boolean isPalindrome(String string){
		
		String str = s.toLowerCase();
		for(int i=0;i<n/2;i++){
			
			if(str.charAt(i) != str.charAt(n-i-1)){	
				return false;
			}			
		}
		return true;
	}
	
	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		if(palindrome.isPalindrome(palindrome.s)){
			System.out.println("The String "+palindrome.s+" is a palindrome.");
		}
		else{
			System.out.println("The string is not a palindrome.");
		}
	}

}
