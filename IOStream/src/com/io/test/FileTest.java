package com.io.test;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		File f = new File("xyz.txt");
		//check file exists or not
		System.out.println(f.exists()); 
		f.createNewFile();
		//check file exists or not
		System.out.println(f.exists());
		System.out.println(System.getProperty("user.dir")); //your current project directory
		File f1 = new File("Dummy");
		f1.mkdir();//create a new directory with name Dummy
		System.out.println(f1.exists()); //Dummy directory exists or not
		
		File f2 = new File("C:\\Program Files\\Java\\jdk1.8.0_221\\");
		//By using List method
		String[] s=f2.list();
		for(String s1:s) {
			File f3=new File(f2,s1);//here we are passing each file to the file object
			if(f3.isFile()) {
				System.out.println(f3);
			}
		}
		//By using listFiles() method
		for(File f4:f2.listFiles()) {
			// To Print all files
			if(f4.isFile()) {
				System.out.println(f4);
			}
			//To print all directories	
			if(f4.isDirectory()) {
				System.out.println(f4);
				for(File of:f4.listFiles()) {
					System.out.println(of);
					
				}
				
			}
		}
		
		

	}

}
