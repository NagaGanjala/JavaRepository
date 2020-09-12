package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {

	public static void main(String[] args) {
		int count=0;
		Pattern p =Pattern.compile("ab");//Pattern String
		Matcher m = p.matcher("ababbba"); //target string
		while(m.find()) { //Searching for ab in Target String
			count++;
			System.out.println(m.start()+"---"+m.end()+"---"+m.group());//starting index,ending index+1 and match string.
		}
		System.out.println("No of times 'ab' exists is:"+count);

	}

}
