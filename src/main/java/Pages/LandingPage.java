package Pages;

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
	
	
	public WebElement pushnotication() throws InterruptedException
	{
		Thread.sleep(5000L);
		return driver.findElement(By.xpath("//button[@class='ab-message-button'][2]"));
	}


	public WebElement loginButton() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000L);
		return driver.findElement(By.xpath("//button[@ng-click='$ctrl.openLoginModal()']"));
	}


	public WebElement clickOnSignUp() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(4000L);
		if(PushPopup.isDisplayed())
		PushPopup.click();
		else 
		Thread.sleep(4000L);
		
		Thread.sleep(4000L);
		return signUp;
		
	}


	
	

}
