package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMobileNumValidation {

	public static void main(String[] args) {
		Pattern p =Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Matcher m=p.matcher("09966525534");
		
		while(m.find()) {
			System.out.println(m.group());
		}

	}

}
