package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathByAttribute {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Element --- Identify --- XPath By Attribute 
		//tagname[@attribute name='Attribute Value']
		
//		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
//		Email.sendKeys("Test@gmail.com");
//		
//		WebElement Password=driver.findElement(By.xpath("//input[@id='pass']"));
//		Password.sendKeys("Test123");
//		
//		WebElement LoginBtn=driver.findElement(By.xpath("//button[@name='login']"));
//		LoginBtn.click();
//		
		
		// Element -identify -Xpath By Text()
		//tagname[text()='text value']
		
		WebElement FP=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		FP.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
