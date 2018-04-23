package com.sample.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;


public class PropertyHandler {
	
	   private static PropertyHandler instance = null;
	   private Properties properties = null;
	   private FileInputStream fileInput = null;
	   private InputStream input = null;

	   private PropertyHandler() throws Exception{
	        		   
		   properties = new Properties();
		 		   
		   try {
			   
			   ClassLoader loader = Thread.currentThread().getContextClassLoader();
			  
				   input = loader.getResourceAsStream("config.properties");
				   
				   if(input == null)
					   input = new FileInputStream("../conf/config.properties");
			   			   	
			   properties.load(input);		   
			   		
			} catch (Exception e) {
				throw new Exception ( e );
			} finally{
				try {
					if(fileInput!=null)
						fileInput.close();
				} catch (IOException e) {
				}
			}
	   }

	   public static synchronized PropertyHandler getInstance() throws Exception{
	       if (instance == null)
	           instance = new PropertyHandler();
	       return instance;
	   }

	   public String getValue(String propKey){
	       return this.properties.getProperty(propKey);
	   }

}