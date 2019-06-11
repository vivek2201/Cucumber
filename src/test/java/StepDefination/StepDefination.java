package StepDefination;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import ObjectDirectory.Base;
import Pages.DepositPage;
import Pages.HomePage;
import Pages.LandingPage;
import Pages.LoginFunction;
import Pages.LoginWindow;
import Pages.RsgPage;
import Pages.Signup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination extends Base{
	
		
	   
	
	@Given("^user is created with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_is_created_with_and_password(String arg1, String arg2) throws Throwable {
	    
		LoginFunction loginfunction=new LoginFunction(Base.driver);
		loginfunction.login(arg1,arg2);
		
	}
	

	@Given("^User is logged in$")
	public void user_is_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is logged in");
	}
	
	@When("^Click on right menu$")
	public void click_on_right_menu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000L);
		HomePage homepage=new HomePage(Base.driver);
		homepage.clickOnMenu().click();
	   
	}

	@When("^Click on Deposit button$")
	public void click_on_Deposit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePage homepage=new HomePage(Base.driver);
		homepage.clickOnDeposit().click();
	   
	 
	}

	@When("^Click on Other Methods$")
	public void click_on_Other_Methods() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DepositPage depositpage=new DepositPage(Base.driver);
		depositpage.clickOnOtherMethod().click();
		
	
	}

	@When("^Click on Credit/debit Card option$")
	public void click_on_Credit_debit_Card_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DepositPage depositpage=new DepositPage(Base.driver);
		depositpage.clickOnCreditCard().click();
	    
	}

	@When("^Enter Cardnumber \"([^\"]*)\" and Expiry date \"([^\"]*)\" and CVV \"([^\"]*)\" and Amount \"([^\"]*)\"$")
	public void enter_Cardnumber_and_Expiry_date_and_CVV_and_Amount(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DepositPage depositpage=new DepositPage(Base.driver);
		depositpage.CardDetails(arg1,arg2,arg3,arg4);
	    
	 
	}

	@When("^Hit the Deposit button$")
	public void hit_the_Deposit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DepositPage depositpage=new DepositPage(Base.driver);
		depositpage.clickOnDepositButton().click();
		Thread.sleep(4000L);
	
		
	   
	}

	@Then("^Deposit should successfully happen$")
	public void deposit_should_successfully_happen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Deposit is done");
	  
	}
	
	@When("^Click on Online banking$")
	public void click_on_Online_banking() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DepositPage depositpage=new DepositPage(Base.driver);
		depositpage.clickOnOnlineBanking().click();
	    
	}

	@When("^Click on Other banks$")
	public void click_on_Other_banks() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DepositPage depositpage=new DepositPage(Base.driver);
		depositpage.clickOnOtherBank().click();
	}

	@When("^Enter \"([^\"]*)\"$")
	public void enter(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DepositPage depositpage=new DepositPage(Base.driver);
		depositpage.enterDemoText(arg1);
	    
	}

	@When("^Click on demo bank$")
	public void click_on_demo_bank() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DepositPage depositpage=new DepositPage(Base.driver);
		depositpage.clickOnDemoBank().click();
	}
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on home page");
	}

	@Then("^Click on responsible gaming link$")
	public void click_on_responsible_gaming_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePage homepage=new HomePage(Base.driver);
	  homepage.clickOnRSGLink().click();
	}

	@Then("^Click on Set Limit Button$")
	public void click_on_Set_Limit_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RsgPage rsgpage=new RsgPage(Base.driver);
		rsgpage.clickOnSetButton().click();
	    
	}

	@Then("^Select Per \"([^\"]*)\" option$")
	public void select_Per_option(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RsgPage rsgpage=new RsgPage(Base.driver);
		rsgpage.clickOnPerButton(arg1);
	    
	}

	@Then("^Enter the \"([^\"]*)\" amount$")
	public void enter_the_amount(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RsgPage rsgpage=new RsgPage(Base.driver);
		rsgpage.enterAmount(arg1);
	 
	}

	@Then("^Click on set deposit limit button$")
	public void click_on_set_deposit_limit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RsgPage rsgpage=new RsgPage(Base.driver);
		rsgpage.clickonSetLimit().click();
	  
	}

	@Then("^Click on Confirm deposit limit$")
	public void click_on_Confirm_deposit_limit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RsgPage rsgpage=new RsgPage(Base.driver);
		rsgpage.clickonConfirmLimit().click();
	}

	@Then("^Click on Update limit$")
	public void click_on_Update_limit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RsgPage rsgpage=new RsgPage(Base.driver);
		rsgpage.clickonupdateLimit().click();
		
	   
	}

	@Then("^Click on Account History$")
	public void click_on_Account_History() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000L);
		HomePage homepage=new HomePage(Base.driver);
		homepage.clickOnAccountHistory().click();
	 
	}

	@Then("^Verify Account history is updated$")
	public void verify_Account_history_is_updated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@Given("^User is on homepage$")
	public void user_is_on_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Base base=new Base();
		base.browserOpening();
	   
	}

	@Then("^Click on Pushnotification$")
	public void click_on_Pushnotification() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage landingpage=new LandingPage(Base.driver);
		landingpage.pushnotication();
	    
	}

	@Then("^Click on Signup$")
	public void click_on_Signup() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage landingpage=new LandingPage(Base.driver);
		landingpage.clickOnSignUp().click();
		
	    
	}
	@When("^Enter the promocode \"([^\"]*)\"$")
	public void enter_the_promocode(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		 Signup signup= new Signup(Base.driver);
		 signup.enterpromocode(arg1);
	}
	@When("^Enter firstname \"([^\"]*)\" & Lastname \"([^\"]*)\" & Email \"([^\"]*)\"$")
	public void enter_firstname_Lastname_Email(String arg1, String arg2, String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   Signup signup= new Signup(Base.driver);
	   signup.enterFirstname(arg1);
	   signup.enterLastname(arg2);
	   signup.enterEmail(arg3);
	   
	}

	@When("^Click on Continue$")
	public void click_on_Continue() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Signup signup= new Signup(Base.driver);
		  signup.clickonContinue();
	}

	@When("^Select salutation \"([^\"]*)\"$")
	public void select_salutation(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  Signup signup= new Signup(Base.driver);
		  signup.clickonSalutation(arg1);
	}

	@When("^Enter date of birth$")
	public void enter_date_of_birth() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  Signup signup= new Signup(Base.driver);
		  signup.EnterMonth();
		  signup.EnterDay();
		  signup.EnterYear();
		  
	}

	@When("^Enter Cell number \"([^\"]*)\"$")
	public void enter_Cell_number(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  Signup signup= new Signup(Base.driver);
		  signup.enterContact(arg1);
	}

	@When("^Enter Last SSN number \"([^\"]*)\"$")
	public void enter_Last_SSN_number(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  Signup signup= new Signup(Base.driver);
		  signup.enterSSN(arg1);
	}

	@When("^Click on Enter it Manually$")
	public void click_on_Enter_it_Manually() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  Signup signup= new Signup(Base.driver);
		  signup.clickonLink().click();
	}

	@When("^Enter addressline(\\d+) \"([^\"]*)\"$")
	public void enter_addressline(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Signup signup= new Signup(Base.driver);
		signup.EnterAdressline1(arg1);
		signup.EnterAdressline2(arg2);
	}

	@When("^Enter city \"([^\"]*)\"$")
	public void enter_city(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Signup signup= new Signup(Base.driver);
		signup.EnterCity(arg1);
	}

	@When("^Enter zip \"([^\"]*)\"$")
	public void enter_zip(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Signup signup= new Signup(Base.driver);
		signup.EnterZip(arg1);
	}

	@When("^Select State$")
	public void select_State() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Signup signup= new Signup(Base.driver);
		signup.SelectState();
	}

	@When("^Enter username \"([^\"]*)\" &password \"([^\"]*)\" & confirmpassword \"([^\"]*)\"$")
	public void enter_username_password_confirmpassword(String arg1, String arg2, String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Signup signup= new Signup(Base.driver);
		signup.EnterUsername(arg1);
		signup.EnterPassword(arg2);
		signup.EnterConfirmPassword(arg3);
	}

	@When("^check Terms&condition$")
	public void check_Terms_condition() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Signup signup= new Signup(Base.driver);
		signup.clickTermsCondition();
	}

	@When("^Check age$")
	public void check_age() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Signup signup= new Signup(Base.driver);
		signup.clickOnAge();
	}

	@When("^Check casio key employee checkbox$")
	public void check_casio_key_employee_checkbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Signup signup= new Signup(Base.driver);
		signup.clickOnKeyEmployee();
	}

	@When("^Check all declaration are true$")
	public void check_all_declaration_are_true() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Signup signup= new Signup(Base.driver);
		signup.ClickOnTrueDeclaration();
	}

	@When("^hit the Join Pointsbet button$")
	public void hit_the_Join_Pointsbet_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Signup signup= new Signup(Base.driver);
		signup.clickOnjointPointsbet();
	}








	


}
