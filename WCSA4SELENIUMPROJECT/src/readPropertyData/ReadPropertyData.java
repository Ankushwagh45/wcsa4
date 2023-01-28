package readPropertyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("./testData/config.properties");

		Properties prop = new Properties();
		prop.load(fis);

		String data = prop.getProperty("username");

		System.out.println(data);
	}

}
