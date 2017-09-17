package interview_essentials;

public class DecimalToBinary {
	String bin = "";
	
	public void decimalToBinary(int n){
		
		while(n > 0){
			int rem = n % 2;
			
			bin = bin + rem;
			n = n/2;
		}
	}
	
	public static void main(String[] args) {
		DecimalToBinary obj = new DecimalToBinary();
		obj.decimalToBinary(156);
		for(int i = obj.bin.length()-1;i>=0;i--){
			System.out.print(obj.bin.charAt(i));			
		}
	}

}
