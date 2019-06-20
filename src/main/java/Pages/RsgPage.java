package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ObjectDirectory.Base;

public class RsgPage {
	public WebDriver driver=null;
	
	
	@FindBy(xpath="//deposit-limit-usa//span[text()='Set Limit']")
	WebElement setButton;
	@FindBy(xpath="//label[text()='1 day']")
	WebElement day;
	@FindBy(xpath="//label[text()='7 days']")
	WebElement week;
	@FindBy(xpath="//label[text()='30 days']\r\n")
	WebElement month;
	@FindBy(xpath="//input[@id='Amount']")
	WebElement amount;
	@FindBy(xpath="//span[text()='Set  deposit limit']")
	WebElement setLimitButton;
	@FindBy(xpath="//span[text()='Confirm deposit limit']")
	WebElement confirmLimitButton;
	@FindBy(xpath="//span[text()='Update Limit']")
	WebElement updateLimitButton;
	@FindBy(xpath="//spend-limit//span[text()='Update Limit']")
	WebElement updateSpendLimit;
	@FindBy(xpath="//spend-limit//span[text()='Set Limit']")
	WebElement SetLimitButton;
	@FindBy(xpath="//span[text()='Set  spend limit']")
	WebElement SetSpendLimitButton;
	@FindBy(xpath="//span[text()='Confirm spend limit']")
	WebElement ConfirmSpendLimit;
	@FindBy(xpath="//div[@class='responsive-table transaction-history-table']")
	WebElement TransactionList;
	@FindBy(xpath="//time-limit//a[contains(text(),'Set Limit')]")
	WebElement setTimeLimit;
	@FindBy(xpath="//input[@id='limit']")
	WebElement ClickToEnterAmount;
	@FindBy(xpath="//span[text()='Set time limit']")
	WebElement SETTIMETIMIT;
	@FindBy(xpath="//span[text()='Confirm time limit']")
	WebElement ConifrmTIMELimit;
	
	
	
	public RsgPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement clickOnSetButton() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000L);
		return setButton;
	}
	public void clickOnPerButton(String arg1) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		if(arg1.equals("1 day"))
		{
			Thread.sleep(3000L);
			RsgPage rsgpage=new RsgPage(Base.driver);
			rsgpage.day.click();
		}
		else if(arg1.equals("7 days"))
		{
			Thread.sleep(3000L);
			RsgPage rsgpage=new RsgPage(Base.driver);
			rsgpage.week.click();
		}
		else if(arg1.equals("30 days"))
		{
			Thread.sleep(3000L);
			RsgPage rsgpage=new RsgPage(Base.driver);
			rsgpage.month.click();
		}
		
		
	}
	public void enterAmount(String arg1) {
		// TODO Auto-generated method stub
		RsgPage rsgpage=new RsgPage(Base.driver);
		rsgpage.amount.clear();
		rsgpage.amount.sendKeys(arg1);
		
	}
	public WebElement clickonSetLimit() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000L);
		return setLimitButton;
	}
	public WebElement clickonConfirmLimit() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000L);
		return confirmLimitButton;
	}
	public WebElement clickonupdateLimit() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000L);
		return updateLimitButton;
	}
	public WebElement clickonsetLimit() {
		// TODO Auto-generated method stub
		return SetLimitButton;
	}
	public WebElement clickonsetlimitbutton() {
		// TODO Auto-generated method stub
		return SetSpendLimitButton;
	}
	public WebElement clickonConfirmSpendLimit() {
		// TODO Auto-generated method stub
		return ConfirmSpendLimit;
	}
	public void verifyAccountHistory() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000L);
	System.out.println(TransactionList.findElements(By.xpath("//div[@class='table-row ng-scope']")).size());

		

		
}
	public WebElement clickonupdateSpendLimit() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000L);
		return updateSpendLimit;
	}
	public WebElement clickSetTimeLimitButton() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000L);
		return setTimeLimit;
	}
	public WebElement clickToEnterAmount() {
		// TODO Auto-generated method stub
		return ClickToEnterAmount;
	}
	public void EnterTime(String arg1) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000L);
		RsgPage rsgpage=new RsgPage(Base.driver);
		rsgpage.ClickToEnterAmount.clear();
		rsgpage.ClickToEnterAmount.sendKeys(arg1);
		
	}
	public WebElement clickToSETTIMELIMIT() {
		// TODO Auto-generated method stub
		return SETTIMETIMIT;
	}
	public WebElement clickToconfirmTIMELIMIT() {
		// TODO Auto-generated method stub
		return ConifrmTIMELimit;
	}
	
	

	
	
	
}
