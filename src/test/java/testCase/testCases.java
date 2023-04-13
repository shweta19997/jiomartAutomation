package testCase;

import tesBase.WebTestbase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

import pages.AddToCart;
import pages.Homepg;
public class testCases extends WebTestbase{
	Homepg hp;
	AddToCart ac;
	
	public testCases()
	{
		super();
	}	
	@BeforeMethod
	public void BeforeMethod()
	{
		//Loading the driver file and eatablishing the connection ,loading the url
		initialstage();
		hp=new Homepg();
		ac=new AddToCart();
	}

	@Test
	public void Ahompagepincode()
	{
		hp.scroll();
		hp.hompg1();
		ac.cart1();
		hp.navigatehome();
	}
	
	@Test
	public void BFashion()
	{
		hp.navigatehome();
		hp.fashion();
		ac.finditems();
		ac.cart2();
		hp.navigatehome();
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		driver.close();
	}
}
	
