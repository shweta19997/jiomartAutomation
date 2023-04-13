package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import tesBase.WebTestbase;

public class Homepg extends WebTestbase{
	public void scroll()
	{
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,500)","");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	public void hompg1()
	{	
		driver.findElement(By.id("autocomplete-0-input")).sendKeys(prop.getProperty("search"));
	    driver.findElement(By.xpath("/html/body/header/section[1]/div/section[2]/div[1]/div[2]/section[2]/div/div[1]/section/ul/li[1]/div")).click();
	}
	
	public void fashion()
	{
		WebElement ele = driver.findElement(By.linkText("Fashion"));
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		//Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.findElement(By.linkText("Women")).click();		
	}
	public void navigatehome()
	{
		driver.findElement(By.xpath("/html/body/header/section[1]/div/section[1]/div[2]/a")).click();
	}
}



