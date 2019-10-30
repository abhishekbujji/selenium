package com.slksoft.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03GetFirstRowData {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		String url="https://vinod.co/phonebook-webapp";
		driver.get(url);
		
		String xpath="html//table/tbody/tr[1]/td";
		driver.findElements(By.xpath(xpath));
		List<WebElement> list=driver.findElements(By.xpath(xpath));
		for(WebElement td: list) {
			System.out.println(td.getText());
			
		}
		
		String css= "html table > tbody > tr:first-child > td";
		list=driver.findElements(By.cssSelector(css));
		for(WebElement td: list) {
			System.out.println(td.getText());
			
		}
		driver.quit();

	}

}
