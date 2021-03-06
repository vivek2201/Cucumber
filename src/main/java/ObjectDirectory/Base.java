package ObjectDirectory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Base {
	
	public static WebDriver driver=null;
	
	public void browserOpening() throws IOException,FileNotFoundException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya.singhal\\MavenProject\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\priya.singhal\\eclipse-workspace\\Automation\\src\\main\\java\\ObjectDirectory\\Sorce.properties");
		prop.load(fis);
		String browser=prop.getProperty("Browser");
		String URL=prop.getProperty("URL");
		//Assert.assertEquals(prop.getProperty("URL"),"https://user-usa.test.pointsbet.com/ft/b47554551c82474ea1ab3b3f273f5107");
		if(browser.equals("Chrome"))
		{
		driver= new ChromeDriver();
		 driver.manage().window().maximize();
	    driver.get(URL);
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}	
		
		
		
	
	}
	
	
	

}
