package com.slksoft.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01OpenWebsiteInChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("http://localhost:4200/");
		WebElement elem=driver.findElement(By.name("productName"));
		elem.sendKeys("Butter");
		 elem=driver.findElement(By.name("unitPrice"));
		elem.sendKeys("50");
		elem=driver.findElement(By.name("unitsInStock"));
		elem.sendKeys("55");
		
		
		
		driver.findElement(By.cssSelector("fa fa-save") ).click();
		
		
		
		
		
		// elem=driver.findElement(By.id("email"));
		//elem.sendKeys("abhishekreddy196@gmail.com");
		//elem=driver.findElement(By.id("phone"));
		//elem.sendKeys("8660171186");
		
		//driver.findElement(By.id ("btnAdd")).click();
		
	}

}
