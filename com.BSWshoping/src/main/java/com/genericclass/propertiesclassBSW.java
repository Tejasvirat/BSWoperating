package com.genericclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesclassBSW
{
	
   public String  featchproperty(String key) 
   {
	   Properties prop=new Properties();
	   FileInputStream fis=null;
	try {
		fis = new FileInputStream("./test-resource\\Dws.properties/");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   try {
		prop.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   String value=prop.getProperty(key);
	   return value;
	   
   }
	

}
