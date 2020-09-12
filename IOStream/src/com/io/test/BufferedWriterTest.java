package com.io.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {

	public static void main(String[] args) throws IOException {
		//Create a new file
		//File f =new File("abc.txt");
		//f.createNewFile();
		//Write something into the created file.
        FileWriter fw = new FileWriter("abc.txt"); //here also we can pass a file object also
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(100);//add a character i.e d:we are passing unicode
		bw.newLine(); //add new line
		char[] ch= {'a','b','c','d'};
		bw.write(ch);
		bw.newLine(); //add new line
		bw.write("Hi Naga Ganjala,"); //Adding string data
		bw.newLine(); //add new line		
		bw.write("How are you");
		bw.flush();//makesure all data is written
		
		bw.close(); //closed buffered writer stream
		System.out.println("BufferedWriter all methods are covered");
	}

}
