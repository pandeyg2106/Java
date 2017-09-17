package interview_essentials;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacter {

	String s = "gauravpandey";

	public void findDuplicateChar(String str) {

		char[] chars = s.toCharArray();
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();

		for (Character ch : chars) {

			if (charmap.containsKey(ch)) {
				charmap.put(ch, charmap.get(ch) + 1);

			} else {
				charmap.put(ch, 1);
			}
		}
		
		Set<Character> keys = charmap.keySet();
		for(Character ch:keys){
			if(charmap.get(ch)>1){
				System.out.println(ch+" occurs "+charmap.get(ch)+" times");
			}
		}

	}
	
	public static void main(String[] args) {
		DuplicateCharacter duplicatecharter = new DuplicateCharacter();
		System.out.println("In the given string: "+duplicatecharter.s+"\n");
		duplicatecharter.findDuplicateChar(duplicatecharter.s);
		
	}
}
