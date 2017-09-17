package interview_essentials;

public class Pattern6 {
	
/*	1 2 3 4 5 6 7 
	1 2 3 4 5 6 
	1 2 3 4 5 
	1 2 3 4 
	1 2 3 
	1 2 
	1 
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 
	1 2 3 4 5 6 
	1 2 3 4 5 6 7 */
	
	public static void pattern6(int n){
		
		for(int i=n;i>0;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");				
			}
			System.out.println("");
		}
		
		for(int i=1;i<=7;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");			
			}
			System.out.println("");			
		}
	}
	
	public static void main(String[] args) {
		pattern6(7);
	}

}
