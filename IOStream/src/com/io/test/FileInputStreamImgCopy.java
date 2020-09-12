package com.io.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamImgCopy {

	public static void main(String[] args) throws IOException {
    FileInputStream fis =new FileInputStream("C:\\Users\\nganjala.ORADEV\\Desktop\\xyz.jpg");
    int size=fis.available();
    byte[] b=new byte[size];
    fis.read(b);
    FileOutputStream fos=new FileOutputStream("abc.jpg");
    fos.write(b);
    fis.close();
    fos.close();
	}

}
