package strings;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	
	String s1 = "gaurav";
	String s2 = "auarbg";
	
	public void isAnagram(String a, String b){
		
		char[] char1 = s1.toCharArray();
		char[] char2 = s2.toCharArray();
		
		if(s1.length()!=s2.length()){
			System.out.println("The given strings are not an Anagram.");
		}
		else{
			Map<Character, Integer> map1 = new HashMap<Character, Integer>();
			for(Character ch1:char1){
				if(map1.containsKey(ch1)){
					map1.put(ch1, map1.get(ch1)+1);
				}
				else{
					map1.put(ch1, 1);
				}
			}
			
			Map<Character, Integer> map2 = new HashMap<Character, Integer>();
			for(Character ch2:char2){
				if(map2.containsKey(ch2)){
					map2.put(ch2, map2.get(ch2)+1);
				}
				else{
					map2.put(ch2, 1);
				}				
			}
			
			if(map1.equals(map2)){
				System.out.println("The two strings are anagram");
				
			}
			else{
				System.out.println("The two strings are not anagram.");
			}
			
		}
	}
	
	public static void main(String[] args) {
		Anagram obj = new Anagram();
		obj.isAnagram(obj.s1, obj.s2);
	}
			

}
