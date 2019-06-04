package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver=null;
	@FindBy(xpath="//span[@class='hidden-xs ng-binding']")
	WebElement username;
	@FindBy(xpath="//top-bar[@ng-click='$ctrl.hideAllNav()']//a[@href='/responsible-gambling']")
	WebElement RSGlink ;
	@FindBy(xpath="//button[@ng-click='$ctrl.toggleNav($ctrl.navItems.user)']\"))")
	WebElement Menu;
	@FindBy(xpath="//nav[@id='user-nav']//a[@href='/account/deposit']")
	WebElement Deposit ;
	@FindBy(xpath="//a[text()='ACCOUNT HISTORY']")
	WebElement accountHistory;
	

	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	public WebElement findUsername() {
		// TODO Auto-generated method stub
		return username;
		
	}

	public WebElement  clickOnMenu() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000L);
		return Menu;
		
	}

	public WebElement clickOnDeposit() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(4000L);
		return Deposit;
		
	
	}



	public WebElement clickOnRSGLink() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(8000L);
		return RSGlink;
	}



	public WebElement clickOnAccountHistory() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(4000L);
		return accountHistory;
	}
	

}
