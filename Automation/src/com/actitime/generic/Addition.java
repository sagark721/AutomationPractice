package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Addition {

	public static String readProp(String path, String key) throws IOException {
		FileInputStream fis=new FileInputStream(path);
		Properties p =new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		System.out.println(value);
		return value;
	}

	static int add(int a, int b) {
		return a+b;
	}
	//
	public static void main(String[] args) throws IOException {
		
		readProp("./data/ShoppersStackUrl.property","url");
		readProp("./data/actitimedata1.property","un");
		
	}
	
	

	

}