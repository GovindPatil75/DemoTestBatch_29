package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_3_LocatorID {

	public static void main(String[] args) {
		
		//Step 1 : Browser open -Chrome (Url)
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Step 2 : Enter valid data to Email id
		
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys("Test@gmail.com");
		
		//Step 3 : Enter valid data to Password
		
		WebElement Password=driver.findElement(By.name("pass"));
		Password.sendKeys("12345678");
		
		//Step 4 :Click on Login button
		
		WebElement LoginBtn=driver.findElement(By.name("login"));
		LoginBtn.click();
		
		
		
		
		
		

	}

}
