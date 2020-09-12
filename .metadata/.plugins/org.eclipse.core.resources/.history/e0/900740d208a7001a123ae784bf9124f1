package programs;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsInString {
	public static void duplicateWords(String str) {
		HashMap<String,Integer> hm=new HashMap<String,Integer> ();
		String[] words=str.split(" ");
		for(int i=0; i<words.length;i++) {
			if(hm.containsKey(words[i].toLowerCase())) {
				hm.put(words[i].toLowerCase(),hm.get(words[i].toLowerCase())+1);				
			}
			else {
				hm.put(words[i].toLowerCase(),1);				
			}
		}
		Set<String> keys=hm.keySet();
		for(String key:keys) {
			if(hm.get(key)>1) {
				System.out.println(key+"--"+hm.get(key));
			}
		}
	}
	public static void main(String[] args) {	
		System.out.println("------------OUTPUT----------");
		 duplicateWords("Bread butter and bread");		 
	        duplicateWords("Java is java again java");	 
	        duplicateWords("Super Man Bat Man Spider Man");
	}

}
