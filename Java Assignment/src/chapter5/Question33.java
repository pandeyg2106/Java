package chapter5;

public class Question33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2, count=0;
		System.out.println("The first 4 perfect numbers are: \n");
		while (num<10000){
			int sum=0;
			for(int i=1;i<=num/2;i++){
				if (num%i==0){
					sum+=i;
				}
			}
			if (sum==num){
				count+=1;
				System.out.print(+num+"\n");
			}
			num+=1;
		}
	}
}
