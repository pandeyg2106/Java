package interview_essentials;

import java.util.HashMap;

public class LengthOfLongestSubstring {
	
	String s1 = "gauravppandey";
	
	public int findLength(String s){
		char[] chararray = s.toCharArray();
		
		int len = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<chararray.length;i++){
			
			if(!map.containsKey(chararray[i])){
				map.put(chararray[i], i);
				
			}
			else{
				len = Math.max(len, map.size());
				map.clear();
			}
			
		}
		return Math.max(len, map.size());
		
	}
	
	public static void main(String[] args) {
		LengthOfLongestSubstring obj = new LengthOfLongestSubstring();
		System.out.println(obj.findLength("gauravppandey"));
		
	}

}
