package interview_essentials;


public class MaxTwoNumbersFromArray {
	
	public void getMaxTwo(int[] a){
		
		int max = 0;
		int secondmax = 0;
		for(int i=0;i<a.length;i++){
			
			if(a[i] > max){
				secondmax = max;
				max = a[i];					 
			}	
		}
		System.out.println("Biggest Number is "+max);
		System.out.println("Second Biggest Number is "+secondmax);
	}
	
	public static void main(String[] args) {
		int[] arr = {8,5,7,4,2,6,9};
		MaxTwoNumbersFromArray obj = new MaxTwoNumbersFromArray();
		obj.getMaxTwo(arr);
	}

}
