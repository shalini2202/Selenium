package com.Selenium;

import java.rmi.activation.ActivationGroup_Stub;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		/*//mouse hover
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a631020\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		Actions builder = new Actions(driver);
		Action act = builder.moveToElement(driver.findElement(By.xpath("//a[@id='ch_funnel_more']"))).build();
		act.perform();*/
		
		
		
		/*//dropdown
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a631020\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("http://automationpractice.com/index.php?id_product=3&controller=product");
		driver.manage().window().maximize();
		
		Select s = new Select(driver.findElement(By.xpath("//select[@id='group_1']")));
		s.selectByVisibleText("L");*/
		
		
		
		/*//<ul><li><li><li><ul> display all element.or total counts of elements present in the below page
		int count = 0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a631020\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath(".//*[@class = 'be-tabs-snipe clearfix']"));
		List<WebElement> list = element.findElements(By.tagName("li"));
		
		for(WebElement e : list) {
			System.out.println(e.getText());
			count++;
		}
		
		System.out.println(count);*/

		
		
		//Scrolling until an element is found.
	}

}
