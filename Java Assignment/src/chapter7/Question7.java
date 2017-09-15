package chapter7;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to generate 100 random integers between 0 and 9 and display the count for each number ");
		int [] randnum = new int[100];
		int [] count = new int[10];
		
		for(int i=0;i<randnum.length;i++){
			randnum[i] = (int)(Math.random()*10);
		}
		for(int i=0;i<randnum.length;i++){
			int temp = randnum[i];
			count[temp]++;
		}
		for(int i=0;i<count.length;i++){
			if (count[i]>0){
				System.out.print(i+" occurs "+count[i]+" times\n");
			}
		}		
	}	
}
