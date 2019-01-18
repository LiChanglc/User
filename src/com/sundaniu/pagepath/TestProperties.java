package com.sundaniu.pagepath;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class TestProperties {
	String filePath;
	public TestProperties(String filePath){
		this.filePath=filePath;
	}
	
	
	public  String getProperties(String keyWord){
		 Properties prop = new Properties();
		String value = null;
		  try {
			  //读取属性文件
			    InputStream InputStream = new BufferedInputStream(new FileInputStream(new File(filePath)));
			    // 加载输入流
			    prop.load(InputStream);
			    // 根据关键字获取value值
			    value = prop.getProperty(keyWord);  
		         } catch (IOException e) {
		            e.printStackTrace();
		         }
		        return value;
		
		
	}
	

	
	
}
