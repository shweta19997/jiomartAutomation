package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import tesBase.WebTestbase;

public class AddToCart extends WebTestbase{
	public void cart1()
	{
		driver.findElement(By.xpath("//*[@id=\"algolia_hits\"]/div/div/ol/li[1]/a/div[2]/div[1]/div/div[1]/img")).click();
	    driver.findElement(By.xpath("/html/body/main/section/section[2]/div[1]/div/div[1]/div/div[3]/div")).click();
	}
	public void finditems()
	{
		WebElement element = driver.findElement(By.className("ais-RefinementList"));
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView();", element);		
	}
	public void cart2()
	{
		driver.findElement(By.xpath("//*[@id=\"category_filter\"]/div/ul/li[1]/div/label/span")).click();
		driver.findElement(By.xpath("//*[@id=\"category_filter\"]/div/ul/li[2]/div/label/span")).click();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,-800)","");
		driver.findElement(By.xpath("//*[@id=\"current_refinements\"]/div[2]/button/img")).click();
	}
}
