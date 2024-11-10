package org.pom.testUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	File file;
	FileInputStream inputStream;
	public Properties p;
	
	public PropertiesReader(String filePath) {
		try {
		file = new File(filePath);
		inputStream = new FileInputStream(file);
		 p = new Properties();
		p.load(inputStream);
		}
		catch(FileNotFoundException e) {
			System.out.println("Throw the FileNotFoundException");
		}
		catch(IOException e) {
			System.out.println("Throw the IOException");
		}
	}
	public String getProperty(String key) {
		String property = p.getProperty(key);
		return property;
	}
}
