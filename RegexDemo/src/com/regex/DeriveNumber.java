package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeriveNumber {
    static String number="";
	public static void main(String[] args) {
		Pattern p =Pattern.compile("[0-9]");
		Matcher m=p.matcher("Naga99sfdsf66dZXF525fsf53yy4");
		
		while(m.find()) {
			System.out.println(m.group());
			number=number+m.group();
			
		}
		System.out.println("String Number:"+Long.parseLong(number));

	}

}
