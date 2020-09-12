package com.io.test;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) throws IOException {

		BufferedReader br =new BufferedReader(new FileReader("abc.txt"));
		int count=0;
		int wc=0;
		String line;
			
		while((line=br.readLine())!=null) {
			count ++;
			String[] words=line.split(" ");
			wc=wc+words.length;
			System.out.println(line);
			//
			for(String s:words) {
			System.out.println("Print each word****************"+s);
			}
			
		}
		System.out.println("No of lines in file:"+count);
		System.out.println("No of words in file:"+wc);
		
		br.close();
	}

}
