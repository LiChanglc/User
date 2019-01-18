package com.sundaniu.pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



/**
 * pageobject页面对象类及操作
 * @author sundaniu
 *
 */
public class HomePageObject {
	WebDriver driver;
	public HomePageObject(WebDriver browserDriver){
		driver=browserDriver;
		
		
	}
	
	//输入框输入
	public void input(String element,String value){
		//定位元素
		WebElement findElement = driver.findElement(By.xpath(element));
		//清空文本框内容
		findElement.clear();
		//输入内容
		findElement.sendKeys(value);
		
	}
	
	//单击按钮
	public void click(String element){
		//定位元素
		WebElement findElement = driver.findElement(By.xpath(element));
		//点击操作
		findElement.click();
		
		
	
	}
	
	//多选框选择
	public void select(String element,String text){
		//定位元素
		WebElement findElement = driver.findElement(By.xpath(element));
		//创建Select对象
		Select select=new Select(findElement);
		//根据文本选择相应内容
		select.selectByVisibleText(text);
		
		
	}
	
	//警告框
	
	public void alert(){
		//定位元素
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		
	}
	
	
}
