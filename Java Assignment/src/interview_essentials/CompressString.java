package interview_essentials;

public class CompressString {
	
	String s = "aaabababccxcd";
	int count = 0;
	
	public void compressString(String str){
		
		char temp = s.charAt(0);
		for(int i=0;i<s.length();i++){
			
			if(s.charAt(i) == temp){
				count++;				
			}
			else{
				System.out.print(temp+""+count);
				temp = s.charAt(i);
				count = 1;
			}			
		}
		System.out.println(temp+""+count);
	}
	
	public static void main(String[] args) {
		CompressString obj = new CompressString();
		obj.compressString(obj.s);
	}
	
}
