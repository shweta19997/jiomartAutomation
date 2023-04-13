package tesBase;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class WebTestbase
	{
	 public static WebDriver driver;
	 public static Properties prop;
	 
	 public  WebTestbase()
	 {
		 try
		 {
			 FileInputStream fileInputStream =new FileInputStream(System.getProperty("user.dir")+"//properties//config1.properties");
		     prop = new Properties();
		     prop.load(fileInputStream);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 
	 public void initialstage()
	 {
		System.setProperty("Webdriver.chrome.driver","/driver/chromedriver.exe");

			 ChromeOptions options=new ChromeOptions();
			    options.addArguments("---remote-allow-origins=*");
			    
			    driver= new ChromeDriver(options);
			    driver.navigate().to(prop.getProperty("url"));

			    driver.manage().window().maximize();

			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			  //  driver.manage().deleteAllCookies();
	     
		 }


}
