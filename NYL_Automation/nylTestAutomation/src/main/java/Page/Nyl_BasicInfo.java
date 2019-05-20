package Page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import Selenium.ScreenShotUtility;
import Selenium.SetUp;
import Utility.ExcelUtility;
import Utility.ReuseableMethod;
import cucumber.api.Scenario;

public class Nyl_BasicInfo extends SetUp {

	public WebDriver driver = getDriver();
	private final Logger log = LogManager.getLogger(Nyl_BasicInfo.class.getName());
	Scenario scenario;
	public Nyl_BasicInfo() {

		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}
	
	ReuseableMethod reuseMethod = new ReuseableMethod();
	ScreenShotUtility screenShotUtility = new ScreenShotUtility();
	ExcelUtility util= new ExcelUtility();
	Nyl_EligibilityPage EligibilityPage = new Nyl_EligibilityPage();

	private String emailid;
	@FindBy(id = "idNewApplicant")
	WebElement applyNow;

	@FindBy(xpath = "//img[@src='images/u95.png']")
	WebElement logo;

	@FindBy(xpath = "//div[@id='abe_applynow']")
	WebElement form;

	@FindBy(id = "ApplyNow-sec-button")
	WebElement ApplyNowInfo;
	
	//TIE	
	@FindBy(id = "selAssDrop")
	WebElement Association;

	//@FindBy(id = "idExistingApplicant")
	@FindBy(xpath="//a[@id='idExistingApplicant' or @id='resumeApplication']")
	WebElement SavedApplication;

//	@FindBy(id = "retrieveEmailID")
	@FindBy(xpath="//input[@id='retrieveEmailID' or @id='txtEmail' or @id='email']")
	WebElement retEmailID;

	@FindBy(xpath="//input[@id='txtPassword' or @id='retrievePassword' or @id='password']")
	WebElement retPassword;

	/*@FindBy(xpath = "//div[text()='Your application progress has been saved.']//following::div[1]")
	WebElement CloseButtonOk;*/

	@FindBy(xpath = "//*[text()='Saved Application']//following::button[1]")
	WebElement SavedAppOK;

	//@FindBy(id = "submit")
	@FindBy(xpath="//button[text()='Retrieve' or text()='Next']")
	WebElement Retrieve;

	@FindBy(xpath="//div[preceding-sibling::div/div[contains(text(),'logged')]]/button[@id='close-msg-button']")
	WebElement Retrieve_ok;
	
	@FindBy(xpath="//label[contains(text(),'Almost Done!')]") 
	WebElement AlmostDone;
	
	@FindBy(xpath="//img[@alt='eSignature step one']") 
	WebElement Stepone;
	
	@FindBy(xpath="//img[@alt='eSignature step two']") 
	WebElement Steptwo;
	
	@FindBy(xpath="//img[@alt='eSignature step three']") 
	WebElement Stepthree;
	
	@FindBy(xpath="//label[contains(text(),'Your Insurance Request Decision')]")
	WebElement request_decision;
	
	@FindBy(id="decision-output")
	WebElement template;
	
	@FindBy(xpath="//label[text()='Thank you! Your application has been received.']")
	WebElement FinalTextMsg;
	
	@FindBy(xpath="//div[@class='dispay-receipt-no']")
	WebElement ReceiptNum;
	
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id="next")
	WebElement Next;
	
	@FindBy(xpath="//div[@class='dispay-receipt-no']/p")
	WebElement WaepaReceiptNum;
	
	@FindBy(xpath="//div[@class='dispay-receipt-no']/p[2]")
	WebElement WaepaReceiptNum1;
	
	
	@FindBy(id="selAssDrop")
	WebElement MemberdropDown;
	
	
//=====================Mobile==========================//
	@FindBy(xpath="//div[@class='page-title']/h1")
	WebElement ThankYouTitleMob;
	
	@FindBy(xpath="//div[@class='page-title']/h2")
	WebElement ApplicationreceivedTitleMob;
	
	@FindBy(xpath="//div[@id='lblThankYou']/label")
	WebElement ReceiptNumMobile;

	@FindBy(id="landing-Region")
	WebElement landingPage;
	//***************************************************************************************************************//
	public boolean navigate_to_NYL_URL(String website) throws Exception {
		try {
			log.debug("Navigating to URL");
			NavigateURL(driver, website);
			Thread.sleep(30000);
			log.info("Navigation || Navigate URL || Pass");
			return true;
		} catch (Exception e) {
			log.error("Navigation || Navigate URL || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean Home_Page_is_displayed() throws Exception {
		try {
			log.debug("Home Page is dispalyed");
			landingPage.isDisplayed();
			
			log.info("Home Page is dispalyed || Pass");
			return true;
		} catch (Exception e) {
			log.error("Home Page is dispalyed || Fail" + e.getMessage());
			throw (e);
		}
	}

	public void clicks_on_Apply_now_button() throws Exception {
	
			try {
				log.debug("Click on apply now button");
				applyNow.click();
				log.info("Navigation || click on apply now button || Pass");
	
			} catch (Exception e) {
				
				log.error("Navigation || Not able to click on apply now button || Fail" + e.getMessage());
				throw (e);
			}
		
		
	}

	public void scroll_down_and_click_on_I_Attest_To_Having_Read_the_Above_Information_button() throws Exception {
		try {
			log.debug("Scroll down and click on information button");
			reuseMethod.scrollDown(ApplyNowInfo);
			Thread.sleep(2000);
			ApplyNowInfo.click();
			log.info("Navigation || Scroll the page and click on information button|| Pass");
		} catch (Exception e) {

			log.error("Navigation || Not able to scroll and click on information button|| Fail" + e.getMessage());
			throw (e);
		}
	}


	public boolean clicks_on_Login_in_saved_application_and_Enter_emailId_and(String Password) throws Exception {
		try {
			log.debug("Login to saved application");
			SavedApplication.click();
			Thread.sleep(2000);
			reuseMethod.scrollDown(retEmailID);
			
			retEmailID.click();
			retEmailID.sendKeys(reuseMethod.getemail());

			retPassword.sendKeys(Password);
			Retrieve.click();
			Thread.sleep(7000);
			
			
			SavedAppOK.click();
			log.info("Login to saved application successfully.|| Pass");
			return true;

		} catch (Exception e) {
			System.out.println("Not able to login to saved application || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_on_Login_in_saved_application_and_Enter_emailId_Under_CAT(String Password) throws Exception {
		try {
			log.debug("Login to saved application");
			SavedApplication.click();
			Thread.sleep(2000);
			reuseMethod.scrollDown(retEmailID);
			
			retEmailID.click();
			retEmailID.sendKeys(reuseMethod.getemail());

			retPassword.sendKeys(Password);
			Retrieve.click();
			Thread.sleep(5000);
			
			
			Retrieve_ok.click();
			log.info("Login to saved application successfully.|| Pass");
			return true;

		} catch (Exception e) {
			System.out.println("Not able to login to saved application || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	
	public boolean almost_done_page_is_displayed_to_user() throws Exception{
		try {
			log.debug("Almost done page is displyed successfully");
			AlmostDone.isDisplayed();
			Stepone.isDisplayed();
			Steptwo.isDisplayed();
			Stepthree.isDisplayed();
			log.info("Almost done page is displyed successfully|| Pass");
			return true;

		} catch (Exception e) {
			System.out.println("Not able to display Almost Done page successfully || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean your_Insurance_Request_Decision_Page_is_displayed_to_user() throws Exception{
		try {
			log.debug("Insurance Decision Request page is displayed to user");
			request_decision.isDisplayed();
			template.isDisplayed();
			Thread.sleep(2000);
			log.info("Insurance Decision Request page is displayed to user successfully || Pass");
			return true;

		} catch (Exception e) {
			System.out.println("Not able to display Insurance Decision Request to user || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	
	public boolean selects_association_as_at_HomePage(String member) throws Exception {
		try {
			log.debug("Select member/Association from dropdown");
			reuseMethod.dropDown(MemberdropDown, member);
			Thread.sleep(1000);
			log.info("Selected member/Association from dropdown successfully || Pass");
			return true;

		} catch (Exception e) {
			System.out.println("Not able to Select member/Association from dropdown || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean thank_you_page_is_displayed_to_user() throws Exception{
		try {
			log.debug("Thank You Page is displayed to user with Receipt number");
			String Expected="Thank you! Your application has been received.";
			String ActulText=FinalTextMsg.getText();
			 Assert.assertEquals(ActulText, Expected);
			String receipt= ReceiptNum.getText();
			System.out.println(receipt);
			  
			log.info("Thank You Page is displayed to user with Receipt number successfully || Pass");
			return true;
		}catch (Exception e) {
			System.out.println("Not able to display Thank You Page and to get receipt number || Fail" + e.getMessage());
			throw (e);
		}
	}

		public boolean let_s_get_started_page_is_displayed_and_enters_login_details_as_Mobile(String Password) throws Exception {
			try {
				log.debug("Login to saved application");
				emailid=reuseMethod.RandomEmail(email);
				reuseMethod.addemail(emailid);
				password.sendKeys(Password);
				log.info("Login to get started mobile application successfully.|| Pass");
				return true;

			} catch (Exception e) {
				System.out.println("Notable to login to mobile application || Fail" + e.getMessage());
				throw (e);
			}
		}
		public boolean thank_you_page_is_displayed_to_user_Mobile() throws Exception{
			try {
				log.debug("Thank You Page is displayed to user");
				String Expected="THANK YOU! Your application has been received.";
				Thread.sleep(5000);
				String ActualText=ThankYouTitleMob.getText()+" " + ApplicationreceivedTitleMob.getText();
				 Assert.assertEquals(ActualText,Expected );
				
				/*String receipt= ReceiptNumMobile.getText();
				System.out.println(ActualText + " " + Expected);
				util.Write_Receipt_Number("APTA", receipt);*/
				  
				log.info("Thank You Page is displayed to user successfully || Pass");
				return true;
			}catch (Exception e) {
				System.out.println("Not able to display Thank You Page || Fail" + e.getMessage());
				throw (e);
			}
		}
		
		public boolean confirmation_Number_is_generated_Mobile(String website) throws Exception{
			try {
				log.debug("Confirmation number is generated");
				
				Thread.sleep(2000);
				String receipt= ReceiptNumMobile.getText();
				System.out.println("Application Number for "+website+": "+ receipt);
				util.Write_Receipt_Number(website, receipt,"");
				  
				log.info("Confirmation number is generated and written in excel sheet || Pass");
				return true;
			}catch (Exception e) {
				System.out.println("Not able to display Confirmation number write in excel sheet || Fail" + e.getMessage());
				throw (e);
			}

		}
		

		
		public boolean confirmation_Number_is_generated(String website) throws Exception{
			try {
				log.debug("Confirmation number is generated");
				
				Thread.sleep(2000);
				
				
				String receipt= WaepaReceiptNum.getText();
				
				util.Write_Receipt_Number(website, receipt,"");
				  
				log.info("Confirmation number is generated and written in excel sheet || Pass");
				return true;
			}catch (Exception e) {
				System.out.println("Not able to display Confirmation number write in excel sheet || Fail" + e.getMessage());
				throw (e);
			}
		}
		
		public boolean Two_confirmation_Number_are_generated(String website) throws Exception{
			try {
				log.debug("Two confirmation number are generated");
				
				Thread.sleep(2000);
				String receipt1= WaepaReceiptNum.getText();
				/*String[] data= receipt.split("/");
				String part1 = data[0];*/ 
				util.Write_Receipt_Number(website, receipt1,"QD");
				String receipt2= WaepaReceiptNum1.getText();
				util.Write_Receipt_Number(website, receipt2,"NonQD");
				
				log.info("Confirmation number is generated and written in excel sheet || Pass");
				return true;
			}catch (Exception e) {
				System.out.println("Not able to display Confirmation number write in excel sheet || Fail" + e.getMessage());
				throw (e);
			}
		}

		public boolean select_Association_from_Drop_down_value_as(String Association_value) throws Exception{
			try {
				log.debug("Association value should be selected");
				
				Thread.sleep(1000);				
				reuseMethod.dropDown(Association, Association_value);
				  
				log.info("Association value is selected || Pass");
				return true;
			}catch (Exception e) {
				System.out.println("Not able to select Association value || Fail" + e.getMessage());
				throw (e);
			}
		}	
		public boolean clicks_on_Login_in_and_Enter_emailId_and_Mobile(String Password) throws Exception {
			try {
				log.debug("Login to saved application and enter saved email id and password");
				SavedApplication.click();
				Thread.sleep(2000);
								
				retEmailID.click();
				retEmailID.sendKeys(reuseMethod.getemail());

				retPassword.sendKeys(Password);
				Retrieve.click();
				log.info("Login to saved application successfully.|| Pass");
				return true;

			} catch (Exception e) {
				System.out.println("Not able to login to saved application || Fail" + e.getMessage());
				throw (e);
			}
		}
	}

