package com.Test;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin {

	public static void main(String[] args) {
		
		// First Automation Script -Browser Launch
		
		//Browser execution -- Execuatble setUp
		
		WebDriverManager.chromedriver().setup();
		
		// We need to create Object of Browser driver class
		ChromeDriver driver=new ChromeDriver();
		
		//Browser -Application Window Open
		
		driver.get("https://www.facebook.com/");
		
		// Browser window -Maximize
		
//		Options op=driver.manage();
//		
//		Window wd=op.window();
//		
//		wd.maximize();

		driver.manage().window().maximize();
		
		//driver.close(); //Current window Close
		
		driver.quit(); //Current Window + Other Open Window close 
		
		// EdgeDriver
		
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver1=new EdgeDriver();
		
		driver1.get("https://www.facebook.com/");
		
		driver1.manage().window().maximize();
		
		driver1.close(); // Current window Close
		
		
		
		
		
		
		
		
	
	}

}
