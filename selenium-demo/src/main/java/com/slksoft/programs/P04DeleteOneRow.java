package com.slksoft.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P04DeleteOneRow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://vinod.co/phonebook-webapp";
		driver.get(url);
		String XpathSelector="html//table/tbody/tr[2]//a[@href]";
		String CssSelector="html table > tbody > tr:nth-child(2) a[href]/span";
		WebElement link = driver.findElement(By.xpath(XpathSelector));
		link.click();
		
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.quit();
	}

}
