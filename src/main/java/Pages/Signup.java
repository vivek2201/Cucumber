package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ObjectDirectory.Base;

public class Signup {
	public WebDriver driver=null;
	@FindBy(xpath="//input[@ng-model='$ctrl.user.promotionCode']")
	WebElement Promocode;
	@FindBy(xpath="//input[@ng-model='$ctrl.user.firstName']")
	WebElement firstname;
	@FindBy(xpath="//input[@ng-model='$ctrl.user.lastName']")
	WebElement lastname;
	@FindBy(xpath="//input[@ng-model='$ctrl.user.email']")
	WebElement email;
	@FindBy(xpath="//button[@ng-click='$ctrl.goToStep(2)']")
	WebElement ContinueButton;
	@FindBy(xpath="//div[@class='custom-radiobuttons custom-radiobuttons-inline'] /ul/li[3]")
	WebElement salutation;
	@FindBy(xpath="//div[@class='dropdown'] /button[@id='month']")
	WebElement month;
	@FindBy(xpath="//div[@class='dropdown'] /button[@id='month']")
	WebElement selectMonth;
	@FindBy(xpath="//button[@id='day']")
	WebElement day;
	@FindBy(xpath="//div[@aria-labelledby='day'] /ul/li[3]")
	WebElement selectDay;
	@FindBy(xpath="//div[@class='dropdown'] /button[@id='year']")
	WebElement year;
	@FindBy(xpath="//div[@aria-labelledby='year'] /ul/li[3]")
	WebElement selectYear;
	@FindBy(xpath="//input[@ng-model='$ctrl.user.contactNumber']")
	WebElement ContactNumber;
	@FindBy(xpath="//input[@ng-model='$ctrl.user.ssn']")
	WebElement SSN;
	@FindBy(xpath="//div[@class='custom-message']/label/span")
	WebElement EnterManuallyLink;
	@FindBy(xpath="//input[@ng-model='$ctrl.user.addressLine1']")
	WebElement addressline1;
	@FindBy(xpath="//input[@ng-model='$ctrl.user.addressLine2']")
	WebElement addressline2;
	@FindBy(xpath="//input[@ng-model='$ctrl.user.addressSuburb']")
	WebElement suburb;
	@FindBy(xpath="//input[@ng-model='$ctrl.user.addressPostCode']")
	WebElement PostCode;
	@FindBy(xpath="//div[@class='form-input dropdown ng-scope']//button")
	WebElement state;
	@FindBy(xpath="//div[@aria-labelledby='signuptitle']/ul/li[1]")
	WebElement selectState;
	@FindBy(xpath="//input[@ng-model='$ctrl.user.userName']")
	WebElement username;
	@FindBy(xpath="//input[@ng-model='$ctrl.user.password']")
	WebElement password;
	@FindBy(xpath="//input[@ng-model='$ctrl.user.confirmPassword']")
	WebElement ConfirmPassword;
	@FindBy(xpath="//label[@for='TermsAndConditions']")
	WebElement Termscondition;
	@FindBy(xpath="//label[@for='AgeUsageAccepeted']")
	WebElement AgeUsageAccepeted;
	@FindBy(xpath="//label[@for='NotCasinoEmployeeAccepted']")
	WebElement NotCasinoEmployeeAccepted;
	@FindBy(xpath="//label[@for='SignupTrueInfo']")
	WebElement SignupTrueInfo;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitbutton;
		public  Signup (WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		public void enterFirstname(String arg1) {
			// TODO Auto-generated method stub
			
			Signup signup= new Signup(Base.driver);
			signup.firstname.sendKeys(arg1);
			
		}
		public void enterLastname(String arg2) {
			// TODO Auto-generated method stub
			Signup signup= new Signup(Base.driver);
			signup.lastname.sendKeys(arg2);
		}
		public void enterEmail(String arg3) {
			// TODO Auto-generated method stub
			Signup signup= new Signup(Base.driver);
			signup.email.sendKeys(arg3);
			
		}
		public void enterpromocode(String arg1) {
			// TODO Auto-generated method stub
			Signup signup= new Signup(Base.driver);
			signup.Promocode.clear();
			signup.Promocode.sendKeys(arg1);
			
			
		}
		public void clickonContinue() {
			// TODO Auto-generated method stub
			Signup signup= new Signup(Base.driver);
			signup.ContinueButton.click();
			
		}
		public void clickonSalutation(String arg1) {
			// TODO Auto-generated method stub
			Signup signup= new Signup(Base.driver);
			signup.salutation.click();
			
		}
		public void EnterMonth() {
			// TODO Auto-generated method stub
			
		}
		public void EnterYear() {
			// TODO Auto-generated method stub
			
		}
		public void EnterDay() {
			// TODO Auto-generated method stub
			
		}
		public void enterContact(String arg1) {
			// TODO Auto-generated method stub
			
		}
		public void enterSSN(String arg1) {
			// TODO Auto-generated method stub
			
		}
		public void clickOnLink() {
			// TODO Auto-generated method stub
			
		}
		

}
