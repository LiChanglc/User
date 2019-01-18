package com.sundaniu.commonobject;

import java.util.concurrent.TimeUnit;

import org.apache.regexp.recompile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * 公共类，操作浏览器相关的
 * @author sundaniu
 *
 */
public class UseBrowser {
	
	WebDriver driver;
	
	//启动Chrome浏览器
	public WebDriver setupChrome(String test_url){
		//指定驱动路径
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		
		//实例化谷歌浏览器对象
		driver=new ChromeDriver();
		
		//打开页面
		driver.get( test_url);
		
		//设置浏览器窗口显示最大化
		driver.manage().window().maximize();
	
		//设置连接超时响应时间
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		

		
	}
	
	
	//启动Fierfox
	public WebDriver setupFierfox(String test_url){
		//指定驱动路径
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
				
				//实例化谷歌浏览器对象
				driver=new FirefoxDriver();
				
				//打开页面
				driver.get( test_url);
				
				//设置浏览器窗口显示最大化
				driver.manage().window().maximize();
			
				//设置连接超时响应时间
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
				return driver;
	}
	
	
	//关闭浏览器
	public void closeBrowser(){
	
		driver.close();
		
	}
	
	

}
