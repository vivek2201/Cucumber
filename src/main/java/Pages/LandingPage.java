package Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ObjectDirectory.Base;



public class LandingPage{
public WebDriver driver=null;
@FindBy(xpath="//a[@href='/signup']")
WebElement signUp;
@FindBy(xpath="//button[text()='Submit']")
WebElement PushPopup;

	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void pushnotication() throws InterruptedException
	{
		Thread.sleep(5000L);
		if(PushPopup.isDisplayed())
		{
			System.out.println("push notification is displaying");
		PushPopup.click();
		}
	
	}


	public WebElement loginButton() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000L);
		return driver.findElement(By.xpath("//button[@ng-click='$ctrl.openLoginModal()']"));
	}


	public WebElement clickOnSignUp() throws InterruptedException {
		// TODO Auto-generated method stub
		
Thread.sleep(4000L);
		return signUp;
		
	}


	
	

}
