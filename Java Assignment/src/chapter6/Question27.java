package chapter6;

public class Question27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("***Program to print first 100 Emirp numbers***\n\n");
		int count=1,num=11;
		while (count<=100){
			if(isEmirp(num)){
				if(count%20==0)
					System.out.printf("%5d\n",num);
			    else
			    	System.out.printf("%5d",num," ");
				count++;}
			num++;
		}	
	}
	public static boolean isPrime(int number){
		for(int i=2;i<=number/2;i++){
			if(number%i==0)
				return false;
		}
		return true;			
	}
	
	public static int reverse(int number){
		int rev = 0;
		while(number!=0){
			rev=rev*10+number%10;
			number=number/10;
		}
		return rev;
	}
	
	public static boolean isEmirp(int number){
		return (isPrime(number)&&isPrime(reverse(number))&&(number!=reverse(number)));
	}

}
