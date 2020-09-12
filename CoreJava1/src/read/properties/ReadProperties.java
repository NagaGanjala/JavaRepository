package read.properties;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("config.properties"));
		//FileReader fr=new FileReader("config.properties");
		//FileInputStream fir=new FileInputStream("config.properties");
		Properties p=new Properties();
		p.load(br);
		System.out.println(p.getProperty("Name"));
		System.out.println(p.getProperty("Email"));
		br.close();
		//fr.close();
		//fir.close();

	}

}
