package interview_essentials;

public class FindMiddleIndexWhereRightSumEqualsLeftSum {
	
	public static int findMiddleIndex(int[] num) throws Exception{
	
	int rightsum = 0;
	int leftsum = 0;
	
	int endindex = num.length-1;
	int startindex = 0;
	
	
	while(true){
		if(leftsum > rightsum){
			rightsum = rightsum + num[endindex--];
		}
		else{
			leftsum = leftsum + num[startindex++];
		}
		
		if(startindex>endindex){
			if(leftsum == rightsum){
				break;
			}
			else{
				throw new Exception("Enter valid Array");
			}
			
		}
	}
	return endindex;

}
	public static void main(String[] args) throws Exception {
		int[] array = {2,4,4,5,4,1};
		System.out.println(findMiddleIndex(array));
	}
}
