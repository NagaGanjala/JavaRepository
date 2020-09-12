package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapWordsInString {
	public static void main(String[] args) {
		String str ="This is Naga Ganjala Employee of Oracle";
		String[] words=str.split(" ");
		String[] temp=new String[words.length];
		
		for(int i=2;i<=words.length;i++) {
			temp[i-2]=words[i-2];
			words[i-2]=words[i-2+1];
			words[i-2+1]=temp[i-2];	
			i++;
		}
		System.out.println(Arrays.toString(words));
		
	}
	

}
