package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_4_LocatorAbsolute {

	public static void main(String[] args) {
		
		// Browser Open
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Element -- Locator -Absolute XPath
		
		WebElement Email=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		Email.sendKeys("Test@gmail.com");
		
		WebElement Password=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
		Password.sendKeys("123456789");
		
		WebElement ButtonLogin=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
		ButtonLogin.click();
		
		//Verify
		
		String ExpectedTitle="ABC";
		String ActualTitle=driver.getTitle(); //Log in to Facebook
		
		System.out.println(ActualTitle);
		
		if(ExpectedTitle.equals(ActualTitle)) {
			
			System.out.println("Test Case Pass...");
		}else {
			System.out.println("Test Case Fail...");
		}
		
		//equals() --- content comparison
		// ==  ---- refrence comparision 
		
//		String s1="Test" ; // SCP
//		String s2=new String("Test"); //heap memory 
//		String s3="Test";
//		
//		System.out.println(s1.equals(s2));// true
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
