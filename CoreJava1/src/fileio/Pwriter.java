package fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Pwriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\nganjala.ORADEV\\Desktop\\test.txt",true);
		PrintWriter pw=new PrintWriter(fw);
		pw.println("st line");
		pw.println("nd line");
		pw.close();
		

	}

}
