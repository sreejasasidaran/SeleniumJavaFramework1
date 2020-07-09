package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.Demo_TestNG;

public class PropertiesFile {
	static Properties prop = new Properties();
	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();

	}
	public static void getProperties() {
		try {

			InputStream input = new FileInputStream("C:\\Users\\SREEJA\\workspace\\SeleniumJavaProject\\src\\test\\java\\config\\config.properties");

			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			Demo_TestNG.browserName	= browser;		
		} catch (Exception exp) 
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

	public static void setProperties() {
		try {

			OutputStream output = new FileOutputStream("C:\\Users\\SREEJA\\workspace\\SeleniumJavaProject\\src\\test\\java\\config\\config.properties");
			prop.setProperty("result", "pass");
			prop.store(output, null);

		} catch (Exception exp) 
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}


}


