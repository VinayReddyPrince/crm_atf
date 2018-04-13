package com.crm.objectrepo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class CrmOr {
	
public Properties getObjects(){
	Properties prop = new Properties();
	File f= new File("src//test//resources//crmObjects.properties");
	try {
		FileInputStream fis = new FileInputStream(f);
		prop.load(fis);
		
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	return prop;
	
	}
}
