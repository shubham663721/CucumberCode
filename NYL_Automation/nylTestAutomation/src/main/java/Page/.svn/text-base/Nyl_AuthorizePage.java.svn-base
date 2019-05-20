package Page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import Selenium.ScreenShotUtility;
import Selenium.SetUp;
import Utility.ReuseableMethod;
//import Utility.Excel_Utility;
import Utility.propertyUtility;

public class Nyl_AuthorizePage extends SetUp {
	public WebDriver driver = getDriver();
	private final Logger log = LogManager.getLogger(Nyl_AuthorizePage.class.getName());

	public Nyl_AuthorizePage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	@FindBy(xpath = "//input[@id='chkSignConsentSlf']")
	WebElement TermNconditions_Self;

	@FindBy(id = "chkSignConsentSps")
	WebElement TermNconditions_Spouse;

	@FindBy(xpath = "//label[contains(text(),'Authorization & Consent')]")
	WebElement Authorization;

	@FindBy(xpath = "//div[@class='info']")
	WebElement AuthorizationInfo;

	@FindBy(xpath = "//span[@class='alert-txt']")
	WebElement AuthorizeErrorMsg;

	@FindBy(id = "next")
	WebElement Next;

	@FindBy(xpath = "//h1[contains(text(),'Authorize & Consent')]")
	WebElement AuthorizationMob;

	@FindBy(xpath = "//div[@*='lblSignAuthMsg']//label/ul[contains(text(),'that payment')]")
	WebElement UnderstandMsg1;

	@FindBy(xpath = "//div[@*='lblSignAuthMsg']//label/ul[contains(text(),'right to')]")
	WebElement UnderstandMsg2;

	@FindBy(xpath = "//div[@*='lblSignAuthMsg']//label/ul[contains(text(),'I authorize') or contains(text(),'I hereby authorize')]")
	WebElement Authorization_Message;

	@FindBy(xpath = "//label[@for='chkSignConsentSlf']/i")
	WebElement mobSelfTermNconditions;

	@FindBy(xpath = "//label[@for='chkSignConsentSps']/i")
	WebElement mobSpouseTermNconditions;

	@FindBy(xpath = "//a[@id='elecContent']")
	WebElement mobPrint;

	@FindBy(xpath = "//div[@*='lblSignAuthMsg']//label/ul[contains(text(),'Any person who knowingly') or contains(text(),'Any person who, knowingly')or contains(text(),'any person who knowingly')]//preceding::br[1]")
	WebElement fraud_Notice_scroll;
	@FindBy(xpath = "//div[@*='lblSignAuthMsg']//label/ul[contains(text(),'Any person who knowingly') or contains(text(),'Any person who, knowingly')or contains(text(),'any person who knowingly')]")
	WebElement Fraud_Notice_Common;

	@FindBy(xpath = "//div[@*='lblSignAuthMsg']//label/ul[contains(text(),'It is a crime to')]")
	WebElement Fraud_Notice_DC_ME_TN_WA;

	@FindBy(xpath = "//div[@*='lblSignAuthMsg']//label/ul[contains(text(),'Any person who includes any false or misleading')]")
	WebElement Fraud_Notice_NJ;

	@FindBy(xpath = "//div[@*='lblSignAuthMsg']//label/ul[contains(text(),'Any person who, with the intent to defraud')]")
	WebElement Fraud_Notice_VA;

	@FindBy(xpath = "//div[@*='lblSignAuthMsg']//label/ul[contains(text(),'By signing and dating this application')]")
	WebElement Consent_Msg;

	@FindBy(xpath = "//div[@data-fields='lblSignConnecticutMsg' or @id='lblSignConnecticutMsg']//*[contains(text(),'REVIEW THE ANSWERS ON THIS APPLICATION')]")
	WebElement ConnecticutNote;


	@FindBy(xpath = "//div[@*='lblSignAuthMsg']//label/ul[contains(text(),'premium contribution')]")
	WebElement Verbiage_Msg;

	// div[@*='lblSignAuthMsg']//label/ul[contains(text(),'premium contribution')]

	@FindBy(id = "txtSignDivFirstName")
	WebElement FirstName;

	@FindBy(xpath = "//div[@class='auth-box']//label[contains(text(),'not')]")
	WebElement DividentBox;

	@FindBy(xpath = "//div[@class='auth-l2']//label/ul[1]/li/p")
	WebElement FiveYr_Msg;

	@FindBy(xpath = "//div[@class='auth-l2']//label/ul[2]/li/p")
	WebElement TenYr_Msg;

	@FindBy(xpath = "//div[@class='auth-l2']//label/ul[3]/li/p")
	WebElement TwentyYr_Msg;

	@FindBy(xpath = "//div[@class='auth-l2']//label/ul[4]/li/p")
	WebElement FiftyYr_Msg;

	@FindBy(xpath = "//div[@class='auth-l2']//label/ul[5]/li/p")
	WebElement AccidentDeath_Msg;

	@FindBy(xpath = "//div[@class='auth-l2']//label/ul[6]/li/p")
	WebElement LTDP_Msg;

	@FindBy(xpath = "//div[@class='auth-l2']//label/ul[7]/li/p")
	WebElement LTD_Msg;

	@FindBy(xpath = "//div[@class='auth-l2']//label/ul[8]/li/p")
	WebElement MID_Msg;

	@FindBy(xpath = "//div[@class='auth-l2']//label/ul[9]/li/p")
	WebElement Retirement_Msg;

	@FindBy(xpath = "//div[@class='auth-l2']//label/ul[10]/li/p")
	WebElement Professional_Msg;

	@FindBy(xpath = "//div[@class='auth-l2']//label/ul[11]/li/p")
	WebElement CriticalIllness_Msg;

	@FindBy(xpath = "//div[@class='auth-l2']//label/ul[12]/li/p")
	WebElement Hospital_Msg;

	@FindBy(xpath = "//div[@class='auth-l2']//label[contains(text(),'member')]")
	WebElement DividentBoxText;

	@FindBy(xpath = "//div[@class='auth-l2']//label[contains(text(),'year')]")
	WebElement DividentBoxText_Election;

	@FindBy(xpath = "//div[@data-fields='lblSignAuthMsg']//ul//p[contains(text(),'I HEREBY ATTEST')]")
	WebElement HealthSupplementNote_Msg;

	@FindBy(xpath = "//div[@class='auth-box']")
	WebElement readAndSignBox;

	@FindBy(xpath = "//div[@class='auth-l1']")
	WebElement ReadCareFully;

	@FindBy(xpath = "//a//font[contains(text(),'IMPORTANT NOTICE')]")
	WebElement Important_Notice;

	@FindBy(xpath = "//label[contains(text(),'Submit Application')]")
	WebElement SubmitApplication;

	@FindBy(id="txtSignFirstNameSlf")
	WebElement FirstNameSelf;

	@FindBy(id = "txtSignLastNameSlf")
	WebElement SecondNameSelf;

	@FindBy(id = "dtSignBirthDateSlf")
	WebElement DOBSelf;

	@FindBy(id = "txtSignFirstNameSps")
	WebElement FirstNameSpouse;

	@FindBy(id = "txtSignLastNameSps")
	WebElement SecondNameSpouse;

	@FindBy(id = "dtSignBirthDateSps")
	WebElement DOBSpouse;
	
	@FindBy(xpath="//input[@id='txtSignFirstNameSlf']//parent::div//following-sibling::div[@class='error-text']")
	WebElement errorFirstName;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement btnSubmit;
	
	@FindBy(xpath="//div[@class='auth-box']//following-sibling::div[@class='slimScrollBar']")
	WebElement ConsentScrollBar;

	ReuseableMethod reuseMethod = new ReuseableMethod();
	ScreenShotUtility screenShotUtility = new ScreenShotUtility();
	propertyUtility PropertyUtility = new propertyUtility();

	public boolean authorize_page_details_are_displayed_to_user() throws Exception {

		try {
			log.debug("Authorize Page is displayed to user");
			Thread.sleep(1000);
			Authorization.isDisplayed();
			AuthorizationInfo.isDisplayed();

			log.info("Authorize Page is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Authorize Page|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean authorize_page_details_are_displayed_to_user_and_confirm_the_term_and_conditions_for_Self()
			throws Exception {

		try {
			log.debug("Confirm the term and conditions for Self");
			Authorization.isDisplayed();
			Thread.sleep(2000);
			reuseMethod.scrollDown(TermNconditions_Self);
			Thread.sleep(1000);
			TermNconditions_Self.click();
			Thread.sleep(2000);

			log.info("Term and Conditions for Self selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Term and Conditions for self || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean authorize_page_details_are_displayed_to_user_and_confirm_the_term_and_conditions_for_Spouse()
			throws Exception {

		try {
			log.debug("Confirm the term and conditions for Spouse");
			Authorization.isDisplayed();
			Thread.sleep(2000);
			reuseMethod.scrollDown(TermNconditions_Spouse);
			Thread.sleep(2000);
			TermNconditions_Spouse.click();

			log.info("Term and Conditions for Spouse selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Term and Conditions for Spouse || Fail" + e.getMessage());
			throw (e);
		}

	}

	public Boolean validate_Error_message_for_Authorization() throws Throwable {
		try {
			log.debug("Validate Error Messege on Authorize Page");
			String Expected = PropertyUtility.Load_MessageFile_Data("AuthenticationErrorMessege");

			AuthorizeErrorMsg.isDisplayed();
			String actual = AuthorizeErrorMsg.getText();
			System.err.println("Error Messege on Authorize Page===" + actual);
			Assert.assertEquals(actual, Expected, "Error messege is Displayed");

			log.info("Error Messege is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Error Messege || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean authorization_page_is_displayed_to_user_Mobile() throws Throwable {
		try {
			log.debug("Authorization page is displayed to user in Mobile Site");
			AuthorizationMob.isDisplayed();
			Thread.sleep(1000);

			log.info("Authorization page is displayed to user in Mobile Site || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Authorization page in Mobile Site || Fail" + e.getMessage());
			throw (e);
		}
	}

	public Boolean verify_Supplemental_Health_Note_in_Authorization_Page() throws Throwable {
		try {
			log.debug("Validate Supplemental Health Note on Authorize Page");
			// String expected="For All Supplemental Health Products Applied For:\n" +
			// "I HEREBY ATTEST THAT I AM PURCHASING THIS POLICY AS A SUPPLEMENT TO MY
			// HEALTH COVERAGE, WHICH MEETS THE FEDERAL REQUIREMENT OF MINIMUM ESSENTIAL
			// COVERAGE.";
			String Expected = PropertyUtility.Load_MessageFile_Data("HealthSupplementNote");

			reuseMethod.scrollDown(ReadCareFully);
			Thread.sleep(1000);
			ReadCareFully.click();
			reuseMethod.scrollDown(HealthSupplementNote_Msg);
			HealthSupplementNote_Msg.isDisplayed();
			Thread.sleep(2000);
			String actual = HealthSupplementNote_Msg.getText().replaceAll("\\n", "");
			System.err.println("\n Supplemental Health Note Messege is ===" + actual);
			Assert.assertEquals(actual, Expected, "Supplemental Health Notee is not Displayed");
			log.info("Supplemental Health Note on Authorize Page is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Supplemental Health Note on Authorize Page || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean authorization_Consent_Page_is_displayed_and_users_Clicks_the_checkbox_for_Self_Mobile()
			throws Throwable {

		try {
			log.debug("Confirm the term and conditions for Self");
			authorization_page_is_displayed_to_user_Mobile();

			reuseMethod.scrollDown(mobPrint);
			Thread.sleep(1000);
			mobSelfTermNconditions.click();

			log.info("Term and Conditions selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Term and Conditions || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean authorization_Consent_Page_is_displayed_and_users_Clicks_the_checkbox_for_Spouse_Mobile()
			throws Throwable {

		try {
			log.debug("Confirm the term and conditions for Spouse");
			authorization_page_is_displayed_to_user_Mobile();

			reuseMethod.scrollDown(mobPrint);

			mobSpouseTermNconditions.click();

			log.info("Term and Conditions selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Term and Conditions || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validate_Authorization_message_in_Read_and_Sign_Box() throws Throwable {

		try {
			log.debug("Validate Authorization message in Read and Sign Box");
			String ExpectedAuthMsg = PropertyUtility.Load_MessageFile_Data("NYLAuthorizationMessage");
			reuseMethod.scrollDown(readAndSignBox);
			readAndSignBox.click();
			reuseMethod.scrollDown(Authorization_Message);
			String AuthMsg = Authorization_Message.getText();
			String ActualAuth_Msg = AuthMsg.replaceAll("\\n", "");
			System.err.println("ActualAuthMsg :" + ActualAuth_Msg);

			Assert.assertEquals(ActualAuth_Msg, ExpectedAuthMsg, "Authorization Message validation fail");

			log.info("Validated Authorization message in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Authorization message in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validate_Authorization_message_NY_in_Read_and_Sign_Box() throws Throwable {

		try {
			log.debug("Validate Authorization message NY in Read and Sign Box");
			String ExpectedAuthMsg = PropertyUtility.Load_MessageFile_Data("AuthorizationMessage_NY");
			reuseMethod.scrollDown(readAndSignBox);
			readAndSignBox.click();
			reuseMethod.scrollDown(Authorization_Message);
			String AuthMsg = Authorization_Message.getText();
			String ActualAuth_Msg = AuthMsg.replaceAll("\\n", "");
			System.err.println("ActualAuthMsg :" + ActualAuth_Msg);

			Assert.assertEquals(ActualAuth_Msg, ExpectedAuthMsg, "Authorization Message NY validation fail");

			log.info("Validated Authorization message NY in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Authorization NY message in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validate_Authorization_Message_MN_in_Read_and_Sign_Box() throws Throwable {

		try {
			log.debug("Validate Authorization message in Read and Sign Box for MN");
			String ExpectedAuthMsg = PropertyUtility.Load_MessageFile_Data("AuthorizationMessage_MN");
			
			Thread.sleep(1000);
			readAndSignBox.click();
			reuseMethod.scrollDown(Authorization_Message);
			String AuthMsg = Authorization_Message.getText();
			String ActualAuth_Msg = AuthMsg.replaceAll("\\n", "");
			System.err.println("ActualAuthMsg :" + ActualAuth_Msg);
			Assert.assertEquals(ActualAuth_Msg, ExpectedAuthMsg, "Authorization Message validation fail");

			log.info("Validated Authorization message for MN in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate Authorization message for MN in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean Validates_I_Understand_verbiage_one_in_Read_and_Sign_Box() throws Throwable {

		try {
			log.debug("Validate I understand one message in Read and Sign Box");
			String ExpectedAuthMsg = PropertyUtility.Load_MessageFile_Data("NYLIundestandMessage1");
			reuseMethod.scrollDown(UnderstandMsg1);
			String AuthMsg = UnderstandMsg1.getText();
			String ActualAuth_Msg = AuthMsg.replaceAll("\\n", "");
			System.err.println("ActualAuthMsg :" + ActualAuth_Msg);
			// readAndSignBox.click();
			// reuseMethod.scrollDown(Authorization_Message);
			Assert.assertEquals(ActualAuth_Msg, ExpectedAuthMsg, "I Understand verbiage validation fail");

			log.info("I understand message1 in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate I understand message1 in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}

	}

		
	public boolean Validates_I_Understand_verbiage_two_in_Read_and_Sign_Box() throws Throwable {

		try {
			log.debug("Validate I understand second message in Read and Sign Box");
			String ExpectedAuthMsg = PropertyUtility.Load_MessageFile_Data("NYLIundestandMessage2");
			String AuthMsg = UnderstandMsg2.getText();
			String ActualAuth_Msg = AuthMsg.replaceAll("\\n", "");
			System.err.println("ActualAuthMsg :" + ActualAuth_Msg);
			// readAndSignBox.click();
			// reuseMethod.scrollDown(Authorization_Message);
			Assert.assertEquals(ActualAuth_Msg, ExpectedAuthMsg, "Authorization Message validation fail");

			log.info("Validated I understand message2 in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate AI understand message2 in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validate_Fraud_Notice_CO_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Fraud Notice CO in Read and Sign Box");
			String ExpectedFraud_CO_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_CO");
			ExpectedFraud_CO_Msg = ExpectedFraud_CO_Msg.replaceAll("\\s", "");
			reuseMethod.scrollDown(Fraud_Notice_Common);
			Thread.sleep(500);
			String Fraud_CO_Msg = Fraud_Notice_Common.getText();

			String ActualFraud_CO_Msg = Fraud_CO_Msg.replaceAll("\\n", "");
			System.err.println("ExpectedFraud_CO_Msg :" + ExpectedFraud_CO_Msg);
			
			ActualFraud_CO_Msg = ActualFraud_CO_Msg.replaceAll("\\s", "");
			System.err.println("ActualFraud_CO_Msg :" + ActualFraud_CO_Msg);
			
			Assert.assertEquals(ActualFraud_CO_Msg, ExpectedFraud_CO_Msg, "Fraud Notice CO validation fail");

			log.info("Validated Fraud Notice CO in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice CO in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Fraud_Notice_CA_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Fraud Notice CA in Read and Sign Box");
			Thread.sleep(2500);
			reuseMethod.scrollDown(Fraud_Notice_Common);
			Thread.sleep(500);
			String ExpectedFraud_CA_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_CA");
			ExpectedFraud_CA_Msg = ExpectedFraud_CA_Msg.replaceAll("\\s", "");
			
			//String Fraud_CA_Msg = Fraud_Notice_Common.getText();
			String Fraud_CA_Msg = Fraud_Notice_Common.getAttribute("innerText");
			
			String ActualFraud_CA_Msg = Fraud_CA_Msg.replaceAll("\\n", "");

			ActualFraud_CA_Msg = ActualFraud_CA_Msg.replaceAll("\\s", "");
			System.err.println("ExpectedFraud CA Msg :" + ExpectedFraud_CA_Msg);
			System.err.println("ActualFraud CA Msg :" + ActualFraud_CA_Msg);
			Assert.assertEquals(ActualFraud_CA_Msg, ExpectedFraud_CA_Msg, "Fraud Notice CA validation fail");

			log.info("Validated Fraud Notice CA in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice CA in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Fraud_Notice_AL_in_Read_and_Sign_Box() throws Throwable {
		try {

			log.debug("Validate Fraud Notice AL in Read and Sign Box");
			Thread.sleep(2500);
			reuseMethod.scrollDown(Fraud_Notice_Common);
			Thread.sleep(500);
			String ExpectedFraud_AL_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_AL");
			ExpectedFraud_AL_Msg = ExpectedFraud_AL_Msg.replaceAll("\\s", "");
			//String Fraud_AL_Msg = Fraud_Notice_Common.getText();
			String Fraud_AL_Msg = Fraud_Notice_Common.getAttribute("innerText");
			String ActualFraud_AL_Msg = Fraud_AL_Msg.replaceAll("\\n", "");

			ActualFraud_AL_Msg = ActualFraud_AL_Msg.replaceAll("\\s", "");
			System.err.println("ExpectedFraud AL Msg :" + ExpectedFraud_AL_Msg);
			System.err.println("ActualFraud AL Msg :" + ActualFraud_AL_Msg);
			
			Assert.assertEquals(ActualFraud_AL_Msg, ExpectedFraud_AL_Msg, "Fraud Notice AL validation fail");

			log.info("Validated Fraud Notice AL in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice AL in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Fraud_Notice_AR_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Fraud Notice AR in Read and Sign Box");
			Thread.sleep(2500);
			reuseMethod.scrollDown(Fraud_Notice_Common);
			Thread.sleep(500);
			String ExpectedFraud_AR_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_AR");
			ExpectedFraud_AR_Msg = ExpectedFraud_AR_Msg.replaceAll("\\s", "");
			//String Fraud_AR_Msg = Fraud_Notice_Common.getText();
			String Fraud_AR_Msg = Fraud_Notice_Common.getAttribute("innerText");
			String ActualFraud_AR_Msg = Fraud_AR_Msg.replaceAll("\\n", "");

			
			ActualFraud_AR_Msg = ActualFraud_AR_Msg.replaceAll("\\s", "");
			System.err.println("ExpectedFraud AR Msg :" + ExpectedFraud_AR_Msg);
			System.err.println("ActualFraud AR Msg :" + ActualFraud_AR_Msg);
			Assert.assertEquals(ActualFraud_AR_Msg, ExpectedFraud_AR_Msg, "Fraud Notice AR validation fail");

			log.info("Validated Fraud Notice AR in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice AR in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Fraud_Notice_LA_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Fraud Notice LA in Read and Sign Box");
			Thread.sleep(2500);
			reuseMethod.scrollDown(fraud_Notice_scroll);
			String ExpectedFraud_LA_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_LA");
			ExpectedFraud_LA_Msg = ExpectedFraud_LA_Msg.replaceAll("\\s", "");
			//String Fraud_LA_Msg = Fraud_Notice_Common.getText();
			String Fraud_LA_Msg = Fraud_Notice_Common.getAttribute("innerText");
			Thread.sleep(500);
			String ActualFraud_LA_Msg = Fraud_LA_Msg.replaceAll("\\n", "");

			ActualFraud_LA_Msg = ActualFraud_LA_Msg.replaceAll("\\s", "");
			System.err.println("ExpectedFraud LA Msg :" + ExpectedFraud_LA_Msg);
			System.err.println("ActualFraud LA Msg :" + ActualFraud_LA_Msg);
			Assert.assertEquals(ActualFraud_LA_Msg, ExpectedFraud_LA_Msg, "Fraud Notice LA validation fail");

			log.info("Validated Fraud Notice LA in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice LA in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Fraud_Notice_PA_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Fraud Notice PA in Read and Sign Box");
			//reuseMethod.scrollDown(Fraud_Notice_Common);
			Thread.sleep(2500);
			reuseMethod.scrollDown(fraud_Notice_scroll);
			
			String ExpectedFraud_PA_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_PA");
			ExpectedFraud_PA_Msg = ExpectedFraud_PA_Msg.replaceAll("\\s", "");
			Thread.sleep(1000);
			//String Fraud_PA_Msg = Fraud_Notice_Common.getText();
			String Fraud_PA_Msg = Fraud_Notice_Common.getAttribute("innerText");
			Thread.sleep(1000);
			String ActualFraud_PA_Msg = Fraud_PA_Msg.replaceAll("\\n", "");

			ActualFraud_PA_Msg = ActualFraud_PA_Msg.replaceAll("\\s", "");
			System.err.println("ExpectedFraud PA Msg :" + ExpectedFraud_PA_Msg);
			System.err.println("ActualFraud PA Msg :" + ActualFraud_PA_Msg);
			Assert.assertEquals(ActualFraud_PA_Msg, ExpectedFraud_PA_Msg, "Fraud Notice PA validation fail");

			log.info("Validated Fraud Notice PA in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice PA in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Fraud_Notice_RI_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Fraud Notice RI in Read and Sign Box");
			Thread.sleep(2500);
			reuseMethod.scrollDown(Fraud_Notice_Common);
			Thread.sleep(1000);
			String ExpectedFraud_RI_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_RI");
			ExpectedFraud_RI_Msg = ExpectedFraud_RI_Msg.replaceAll("\\s", "");
			//String Fraud_RI_Msg = Fraud_Notice_Common.getText();
			String Fraud_RI_Msg = Fraud_Notice_Common.getAttribute("innerText");
			String ActualFraud_RI_Msg = Fraud_RI_Msg.replaceAll("\\n", "");

			
			ActualFraud_RI_Msg = ActualFraud_RI_Msg.replaceAll("\\s", "");
			System.err.println("ExpectedFraud RI Msg :" + ExpectedFraud_RI_Msg);
			System.err.println("ActualFraud RI Msg :" + ActualFraud_RI_Msg);
			Assert.assertEquals(ActualFraud_RI_Msg, ExpectedFraud_RI_Msg, "Fraud Notice RI validation fail");

			log.info("Validated Fraud Notice RI in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice RI in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Fraud_Notice_MD_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Fraud Notice MD in Read and Sign Box");
			Thread.sleep(2500);
			reuseMethod.scrollDown(Fraud_Notice_Common);
			
			String ExpectedFraud_MD_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_MD");
			ExpectedFraud_MD_Msg = ExpectedFraud_MD_Msg.replaceAll("\\s", "");
			Thread.sleep(1000);
			//String Fraud_MD_Msg = Fraud_Notice_Common.getText();
			String Fraud_MD_Msg = Fraud_Notice_Common.getAttribute("innerText");
			Thread.sleep(2000);
			String ActualFraud_MD_Msg = Fraud_MD_Msg.replaceAll("\\n", "");

			
			ActualFraud_MD_Msg = ActualFraud_MD_Msg.replaceAll("\\s", "");
			System.err.println("ExpectedFraud MD Msg :" + ExpectedFraud_MD_Msg);
			System.err.println("ActualFraud MD Msg :" + ActualFraud_MD_Msg);
			Assert.assertEquals(ActualFraud_MD_Msg, ExpectedFraud_MD_Msg, "Fraud Notice MD validation fail");

			log.info("Validated Fraud Notice MD in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice MD in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Fraud_Notice_DC_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Fraud Notice DC in Read and Sign Box");
			Thread.sleep(2500);
			reuseMethod.scrollDown(Fraud_Notice_DC_ME_TN_WA);
			
			String ExpectedFraud_DC_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_DC");
			ExpectedFraud_DC_Msg = ExpectedFraud_DC_Msg.replaceAll("\\s", "");
			//String Fraud_DC_Msg = Fraud_Notice_DC_ME_TN_WA.getText();
			String Fraud_DC_Msg = Fraud_Notice_DC_ME_TN_WA.getAttribute("innerText");
			
			String ActualFraud_DC_Msg = Fraud_DC_Msg.replaceAll("\\n", "");

			ActualFraud_DC_Msg = ActualFraud_DC_Msg.replaceAll("\\s", "");
			System.err.println("ExpectedFraud DC Msg :" + ExpectedFraud_DC_Msg);
			System.err.println("ActualFraud DC Msg :" + ActualFraud_DC_Msg);
			Assert.assertEquals(ActualFraud_DC_Msg, ExpectedFraud_DC_Msg, "Fraud Notice DC validation fail");

			log.info("Validated Fraud Notice DC in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice DC in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Fraud_Notice_FL_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Fraud Notice FL in Read and Sign Box");
			Thread.sleep(2500);
			reuseMethod.scrollDown(Fraud_Notice_Common);
			
			String ExpectedFraud_FL_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_FL");
			ExpectedFraud_FL_Msg = ExpectedFraud_FL_Msg.replaceAll("\\s", "");
			//String Fraud_FL_Msg = Fraud_Notice_Common.getText();
			String Fraud_FL_Msg = Fraud_Notice_Common.getAttribute("innerText");
			String ActualFraud_FL_Msg = Fraud_FL_Msg.replaceAll("\\n", "");

			
			ActualFraud_FL_Msg = ActualFraud_FL_Msg.replaceAll("\\s", "");
			System.err.println("ExpectedFraud FL Msg :" + ExpectedFraud_FL_Msg);
			System.err.println("ActualFraud FL Msg :" + ActualFraud_FL_Msg);
			Assert.assertEquals(ActualFraud_FL_Msg, ExpectedFraud_FL_Msg, "Fraud Notice FL validation fail");

			log.info("Validated Fraud Notice FL in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice FL in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Fraud_Notice_KS_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Fraud Notice KS in Read and Sign Box");
			Thread.sleep(2500);
			reuseMethod.scrollDown(Fraud_Notice_Common);
			
			String ExpectedFraud_KS_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_KS");
			ExpectedFraud_KS_Msg = ExpectedFraud_KS_Msg.replaceAll("\\s", "");
			//String Fraud_KS_Msg = Fraud_Notice_Common.getText();
			String Fraud_KS_Msg = Fraud_Notice_Common.getAttribute("innerText");
			String ActualFraud_KS_Msg = Fraud_KS_Msg.replaceAll("\\n", "");

			
			ActualFraud_KS_Msg = ActualFraud_KS_Msg.replaceAll("\\s", "");
			System.err.println("ExpectedFraud KS Msg :" + ExpectedFraud_KS_Msg);
			System.err.println("ActualFraud KS Msg :" + ActualFraud_KS_Msg);
			Assert.assertEquals(ActualFraud_KS_Msg, ExpectedFraud_KS_Msg, "Fraud Notice KS validation fail");

			log.info("Validated Fraud Notice KS in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice KS in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Fraud_Notice_ME_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Fraud Notice ME in Read and Sign Box");
			Thread.sleep(2500);
			reuseMethod.scrollDown(Fraud_Notice_DC_ME_TN_WA);
			
			String ExpectedFraud_ME_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_ME");
			ExpectedFraud_ME_Msg = ExpectedFraud_ME_Msg.replaceAll("\\s", "");
			//String Fraud_ME_Msg = Fraud_Notice_DC_ME_TN_WA.getText();
			String Fraud_ME_Msg = Fraud_Notice_DC_ME_TN_WA.getAttribute("innerText");
			String ActualFraud_ME_Msg = Fraud_ME_Msg.replaceAll("\\n", "");

			
			ActualFraud_ME_Msg = ActualFraud_ME_Msg.replaceAll("\\s", "");
			System.err.println("ExpectedFraud ME Msg :" + ExpectedFraud_ME_Msg);
			System.err.println("ActualFraud ME Msg :" + ActualFraud_ME_Msg);
			Assert.assertEquals(ActualFraud_ME_Msg, ExpectedFraud_ME_Msg, "Fraud Notice ME validation fail");

			log.info("Validated Fraud Notice ME in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice ME in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Fraud_Notice_NJ_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Fraud Notice NJ in Read and Sign Box");
			Thread.sleep(2500);
			reuseMethod.scrollDown(Fraud_Notice_NJ);
			
			String ExpectedFraud_NJ_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_NJ");
			ExpectedFraud_NJ_Msg = ExpectedFraud_NJ_Msg.replaceAll("\\s", "");
			//String Fraud_NJ_Msg = Fraud_Notice_NJ.getText();
			String Fraud_NJ_Msg = Fraud_Notice_NJ.getAttribute("innerText");
			String ActualFraud_NJ_Msg = Fraud_NJ_Msg.replaceAll("\\n", "");

			
			ActualFraud_NJ_Msg = ActualFraud_NJ_Msg.replaceAll("\\s", "");
			System.err.println("ExpectedFraud NJ Msg :" + ExpectedFraud_NJ_Msg);
			System.err.println("ActualFraud NJ Msg :" + ActualFraud_NJ_Msg);
			Assert.assertEquals(ActualFraud_NJ_Msg, ExpectedFraud_NJ_Msg, "Fraud Notice NJ validation fail");

			log.info("Validated Fraud Notice NJ in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice NJ in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Fraud_Notice_NY_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Fraud Notice NY in Read and Sign Box");
			Thread.sleep(2500);
			reuseMethod.scrollDown(Fraud_Notice_Common);
			
			String ExpectedFraud_NY_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_NY");
			ExpectedFraud_NY_Msg = ExpectedFraud_NY_Msg.replaceAll("\\s", "");
			//String Fraud_NY_Msg = Fraud_Notice_Common.getText();
			String Fraud_NY_Msg = Fraud_Notice_Common.getAttribute("innerText");
			String ActualFraud_NY_Msg = Fraud_NY_Msg.replaceAll("\\n", "");

			ActualFraud_NY_Msg = ActualFraud_NY_Msg.replaceAll("\\s", "");
			System.err.println("ExpectedFraud NY Msg :" + ExpectedFraud_NY_Msg);
			System.err.println("ActualFraud NY Msg :" + ActualFraud_NY_Msg);
			
			Assert.assertEquals(ActualFraud_NY_Msg, ExpectedFraud_NY_Msg, "Fraud Notice NY validation fail");

			log.info("Validated Fraud Notice NY in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice NY in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Fraud_Notice_OK_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Fraud Notice OK in Read and Sign Box");
			Thread.sleep(2500);
			reuseMethod.scrollDown(Fraud_Notice_Common);
			
			String ExpectedFraud_OK_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_OK");
			ExpectedFraud_OK_Msg = ExpectedFraud_OK_Msg.replaceAll("\\s", "");
			//String Fraud_OK_Msg = Fraud_Notice_Common.getText();
			String Fraud_OK_Msg = Fraud_Notice_Common.getAttribute("innerText");
			String ActualFraud_OK_Msg = Fraud_OK_Msg.replaceAll("\\n", "");

			
			ActualFraud_OK_Msg = ActualFraud_OK_Msg.replaceAll("\\s", "");
			System.err.println("ExpectedFraud OK Msg :" + ExpectedFraud_OK_Msg);
			System.err.println("ActualFraud OK Msg :" + ActualFraud_OK_Msg);
			Assert.assertEquals(ActualFraud_OK_Msg, ExpectedFraud_OK_Msg, "Fraud Notice OK validation fail");

			log.info("Validated Fraud Notice OK in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice OK in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Fraud_Notice_PR_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Fraud Notice PR in Read and Sign Box");
			
			Thread.sleep(2500);
			reuseMethod.scrollDown(Fraud_Notice_Common);
			
			String ExpectedFraud_PR_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_PR");
			ExpectedFraud_PR_Msg = ExpectedFraud_PR_Msg.replaceAll("\\s", "");
			//String Fraud_PR_Msg = Fraud_Notice_Common.getText();
			String Fraud_PR_Msg = Fraud_Notice_Common.getAttribute("innerText");
			String ActualFraud_PR_Msg = Fraud_PR_Msg.replaceAll("\\n", "");
			
			ActualFraud_PR_Msg = ActualFraud_PR_Msg.replaceAll("\\s", "");
			System.err.println("ExpectedFraud PR Msg :" + ExpectedFraud_PR_Msg);
			System.err.println("ActualFraud PR Msg :" + ActualFraud_PR_Msg);
			Assert.assertEquals(ActualFraud_PR_Msg, ExpectedFraud_PR_Msg, "Fraud Notice PR validation fail");

			log.info("Validated Fraud Notice PR in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice PR in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Fraud_Notice_WA_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Fraud Notice WA in Read and Sign Box");
			
			Thread.sleep(2500);
			reuseMethod.scrollDown(Fraud_Notice_DC_ME_TN_WA);
			
			String ExpectedFraud_WA_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_WA");
			ExpectedFraud_WA_Msg = ExpectedFraud_WA_Msg.replaceAll("\\s", "");
			Thread.sleep(2000);
			//String Fraud_WA_Msg = Fraud_Notice_DC_ME_TN_WA.getText();
			String Fraud_WA_Msg = Fraud_Notice_DC_ME_TN_WA.getAttribute("innerText");
			Thread.sleep(2000);
			String ActualFraud_WA_Msg = Fraud_WA_Msg.replaceAll("\\n", "");

			ActualFraud_WA_Msg = ActualFraud_WA_Msg.replaceAll("\\s", "");
			System.err.println("ExpectedFraud WA Msg :" + ExpectedFraud_WA_Msg);
			System.err.println("ActualFraud WA Msg :" + ActualFraud_WA_Msg);
			Assert.assertEquals(ActualFraud_WA_Msg, ExpectedFraud_WA_Msg, "Fraud Notice WA validation fail");

			log.info("Validated Fraud Notice WA in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice WA in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Fraud_Notice_TN_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Fraud Notice TN in Read and Sign Box");
			Thread.sleep(2500);
			reuseMethod.scrollDown(Fraud_Notice_DC_ME_TN_WA);
			
			String ExpectedFraud_TN_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_TN");
			ExpectedFraud_TN_Msg = ExpectedFraud_TN_Msg.replaceAll("\\s", "");
			//String Fraud_TN_Msg = Fraud_Notice_DC_ME_TN_WA.getText();
			String Fraud_TN_Msg = Fraud_Notice_DC_ME_TN_WA.getAttribute("innerText");
			String ActualFraud_TN_Msg = Fraud_TN_Msg.replaceAll("\\n", "");

			ActualFraud_TN_Msg = ActualFraud_TN_Msg.replaceAll("\\s", "");
			System.err.println("ExpectedFraud TN Msg :" + ExpectedFraud_TN_Msg);
			System.err.println("ActualFraud TN Msg :" + ActualFraud_TN_Msg);
			Assert.assertEquals(ActualFraud_TN_Msg, ExpectedFraud_TN_Msg, "Fraud Notice TN validation fail");

			log.info("Validated Fraud Notice TN in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice TN in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Fraud_Notice_VA_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Fraud Notice VA in Read and Sign Box");
			Thread.sleep(2500);
			reuseMethod.scrollDown(Fraud_Notice_VA);
			
			String ExpectedFraud_VA_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_VA");
			ExpectedFraud_VA_Msg = ExpectedFraud_VA_Msg.replaceAll("\\s", "");
			//String Fraud_VA_Msg = Fraud_Notice_VA.getText();
			String Fraud_VA_Msg = Fraud_Notice_VA.getAttribute("innerText");
			String ActualFraud_VA_Msg = Fraud_VA_Msg.replaceAll("\\n", "");

			ActualFraud_VA_Msg = ActualFraud_VA_Msg.replaceAll("\\s", "");
			System.err.println("ExpectedFraud VA Msg :" + ExpectedFraud_VA_Msg);
			System.err.println("ActualFraud VA Msg :" + ActualFraud_VA_Msg);
			Assert.assertEquals(ActualFraud_VA_Msg, ExpectedFraud_VA_Msg, "Fraud Notice VA validation fail");

			log.info("Validated Fraud Notice VA in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice VA in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Fraud_Notice_WM_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Fraud Notice WM in Read and Sign Box");
			Thread.sleep(2500);
			reuseMethod.scrollDown(Fraud_Notice_Common);
			
			String ExpectedFraud_WM_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_WM");
			ExpectedFraud_WM_Msg = ExpectedFraud_WM_Msg.replaceAll("\\s", "");
			//String Fraud_WM_Msg = Fraud_Notice_Common.getText();
			String Fraud_WM_Msg = Fraud_Notice_Common.getAttribute("innerText");
			String ActualFraud_WM_Msg = Fraud_WM_Msg.replaceAll("\\n", "");
			
			ActualFraud_WM_Msg = ActualFraud_WM_Msg.replaceAll("\\s", "");
			System.err.println("ExpectedFraud WM Msg :" + ExpectedFraud_WM_Msg);
			System.err.println("ActualFraud WM Msg :" + ActualFraud_WM_Msg);
			Assert.assertEquals(ActualFraud_WM_Msg, ExpectedFraud_WM_Msg, "Fraud Notice WM validation fail");

			log.info("Validated Fraud Notice WM in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice WM in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_Fraud_Notice_NM_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Fraud Notice New Mexico in Read and Sign Box");
			
			Thread.sleep(2500);
			reuseMethod.scrollDown(Fraud_Notice_Common);
			String ExpectedFraud_NM_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_NM");
			ExpectedFraud_NM_Msg = ExpectedFraud_NM_Msg.replaceAll("\\s", "");
			//String Fraud_NM_Msg = Fraud_Notice_Common.getText();
			String Fraud_NM_Msg = Fraud_Notice_Common.getAttribute("innerText");
			String ActualFraud_NM_Msg = Fraud_NM_Msg.replaceAll("\\n", "");

			ActualFraud_NM_Msg = ActualFraud_NM_Msg.replaceAll("\\s", "");
			System.err.println("ExpectedFraud NM Msg :" + ExpectedFraud_NM_Msg);
			System.err.println("ActualFraud NM Msg :" + ActualFraud_NM_Msg);
			Assert.assertEquals(ActualFraud_NM_Msg, ExpectedFraud_NM_Msg, "Fraud Notice NM validation fail");

			log.info("Validated Fraud Notice NM in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice NM in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_Fraud_Notice_CT_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Fraud Notice of Connecticut in Read and Sign Box");
			reuseMethod.scrollDown(Fraud_Notice_Common);
			Thread.sleep(1000);
			String ExpectedFraud_NM_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_CT");
			ExpectedFraud_NM_Msg = ExpectedFraud_NM_Msg.replaceAll("\\s", "");
			String Fraud_NM_Msg = Fraud_Notice_Common.getText();

			String ActualFraud_NM_Msg = Fraud_NM_Msg.replaceAll("\\n", "");

			System.err.println("ActualFraud NM Msg :" + ActualFraud_NM_Msg);
			ActualFraud_NM_Msg = ActualFraud_NM_Msg.replaceAll("\\s", "");
			Assert.assertEquals(ActualFraud_NM_Msg, ExpectedFraud_NM_Msg, "Fraud Notice CT validation fail");

			log.info("Validated Fraud Notice of Connecticut in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice of Connecticut in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_Fraud_Notice_MN_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Fraud Notice of Minnesota in Read and Sign Box");
			reuseMethod.scrollDown(Fraud_Notice_Common);
			Thread.sleep(1000);
			String ExpectedFraud_NM_Msg = PropertyUtility.Load_MessageFile_Data("Fraud_Notice_MN");
			ExpectedFraud_NM_Msg = ExpectedFraud_NM_Msg.replaceAll("\\s", "");
			String Fraud_NM_Msg = Fraud_Notice_Common.getText();

			String ActualFraud_NM_Msg = Fraud_NM_Msg.replaceAll("\\n", "");

			System.err.println("ActualFraud NM Msg :" + ActualFraud_NM_Msg);
			ActualFraud_NM_Msg = ActualFraud_NM_Msg.replaceAll("\\s", "");
			Assert.assertEquals(ActualFraud_NM_Msg, ExpectedFraud_NM_Msg, "Fraud Notice CT validation fail");

			log.info("Validated Fraud Notice of Minnesota in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fraud Notice of Minnesota in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_additional_Notes_for_Connecticut_state() throws Throwable {
		try {
			log.debug("Validate Connecticut Note in Read and Sign Box");
			reuseMethod.scrollDown(ConnecticutNote);
			Thread.sleep(1000);
			String ExpectedConnecticutNote = PropertyUtility.Load_MessageFile_Data("ConnecticutNote");
			ExpectedConnecticutNote = ExpectedConnecticutNote.replaceAll("\\s", "");
			String ConnecticutNote_Mssg = ConnecticutNote.getText();

			String ActualConnecticutNote1 = ConnecticutNote_Mssg.replaceAll("\\n", "");
			String ActualConnecticutNote = ActualConnecticutNote1.replaceAll("", "");

			System.err.println("Additional Note CT Msg :" + ActualConnecticutNote);
			ActualConnecticutNote = ActualConnecticutNote.replaceAll("\\s", "");
			Assert.assertEquals(ActualConnecticutNote, ExpectedConnecticutNote, "Additional Note CT validation fail");

			log.info("Validated Connecticut Note in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Connecticut Note in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_Consent_message_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Consent message in Read and Sign Box");
			Thread.sleep(2000);
			String ExpectedConsent_Msg = PropertyUtility.Load_MessageFile_Data("Consent_message");
			String ConsentMsg = Consent_Msg.getAttribute("innerText");

			String ActualConsent_Msg = ConsentMsg.replaceAll("\\n", "");

			System.err.println("ActualConsent_Msg :" + ActualConsent_Msg);
			ActualConsent_Msg.replaceAll("\\s", "");
			ExpectedConsent_Msg.replaceAll("\\s", "");
			readAndSignBox.click();
			reuseMethod.scrollDown(Consent_Msg);
			Assert.assertEquals(ActualConsent_Msg, ExpectedConsent_Msg, "Consent message validation fail");

			log.info("Validated Consent message in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Consent message in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_Consent_message_TX_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Consent message in Read and Sign Box");
			Thread.sleep(2000);
			readAndSignBox.click();
			reuseMethod.scrollDown(Consent_Msg);
			String ExpectedConsent_Msg = PropertyUtility.Load_MessageFile_Data("Consent_message_TX");
			String ConsentMsg = Consent_Msg.getAttribute("innerText");

			String ActualConsent_Msg = ConsentMsg.replaceAll("\\n", "");

			System.err.println("ActualConsent_Msg :" + ActualConsent_Msg);
			ActualConsent_Msg.replaceAll("\\s", "");
			ExpectedConsent_Msg.replaceAll("\\s", "");
			readAndSignBox.click();
			reuseMethod.scrollDown(Consent_Msg);
			System.out.println(ActualConsent_Msg);
			System.out.println(ExpectedConsent_Msg);
			Assert.assertEquals(ActualConsent_Msg, ExpectedConsent_Msg, "Consent message validation fail");

			log.info("Validated Consent message in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Consent message in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean validate_Consent_message_CO_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Consent message in Read and Sign Box");
			Thread.sleep(2000);
			readAndSignBox.click();
			reuseMethod.scrollDown(Consent_Msg);
			String ExpectedConsent_Msg = PropertyUtility.Load_MessageFile_Data("Consent_messageCO");
			String ConsentMsg = Consent_Msg.getAttribute("innerText");

			String ActualConsent_Msg = ConsentMsg.replaceAll("\\n", "");

			System.err.println("ActualConsent_Msg :" + ActualConsent_Msg);
			ActualConsent_Msg.replaceAll("\\s", "");
			ExpectedConsent_Msg.replaceAll("\\s", "");
			readAndSignBox.click();
			reuseMethod.scrollDown(Consent_Msg);
			System.out.println(ActualConsent_Msg);
			System.out.println(ExpectedConsent_Msg);
			Assert.assertEquals(ActualConsent_Msg, ExpectedConsent_Msg, "Consent message validation fail");

			log.info("Validated Consent message in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Consent message in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}


	public boolean validates_Consent_message_in_Read_and_Sign_Box_for_NonUW() throws Throwable {
		try {
			log.debug("Validate Consent message in Read and Sign Box");
			Thread.sleep(1000);
			String ExpectedConsent_Msg = PropertyUtility.Load_MessageFile_Data("Consent_MessageNonUW");
			// String ConsentMsg=Consent_Msg.getText();
			String ConsentMsg = Consent_Msg.getAttribute("innerText");
			String ActualConsent_Msg = ConsentMsg.replaceAll("\\n", "");

			//System.err.println("ActualConsent_Msg :" + ActualConsent_Msg);
			ActualConsent_Msg=ActualConsent_Msg.replaceAll("\\s", "");
			ExpectedConsent_Msg = ExpectedConsent_Msg.replaceAll("\\s", "");
			System.err.println("EXpectedConsent_Msg :" + ExpectedConsent_Msg);
			System.err.println("ActualConsent_Msg :" + ActualConsent_Msg);
			//ReadCareFully.click();
			Consent_Msg.click();
			reuseMethod.scrollDown(Consent_Msg);
			Assert.assertEquals(ActualConsent_Msg, ExpectedConsent_Msg, "Consent message validation fail");

			log.info("Validated Consent message in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Consent message in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_Consent_message_Non_GI_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Consent message NON GI in Read and Sign Box");
			Thread.sleep(1000);
			String ExpectedConsent_Msg = PropertyUtility.Load_MessageFile_Data("Consent_MessageNonGI");
			// String ConsentMsg=Consent_Msg.getText();
			String ConsentMsg = Consent_Msg.getAttribute("innerText");
			String ActualConsent_Msg = ConsentMsg.replaceAll("\\n", "");

			// System.err.println("ActualConsent_Msg :" + ActualConsent_Msg);
			ActualConsent_Msg = ActualConsent_Msg.replaceAll("\\s", "");
			ExpectedConsent_Msg = ExpectedConsent_Msg.replaceAll("\\s", "");
			System.err.println("EXpectedConsent_Msg :" + ExpectedConsent_Msg);
			System.err.println("ActualConsent_Msg :" + ActualConsent_Msg);
			// ReadCareFully.click();
			Thread.sleep(1000);
			reuseMethod.scrollDown(Consent_Msg);
			Thread.sleep(1000);
			Assert.assertEquals(ActualConsent_Msg, ExpectedConsent_Msg, "Consent message for NON GI validation fail");

			log.info("Validated Consent message for NON GI in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Consent message for NON GI in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_Consent_message_GI_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Consent message GI in Read and Sign Box");
			Thread.sleep(1000);
			String ExpectedConsent_Msg = PropertyUtility.Load_MessageFile_Data("Consent_MessageGI");
			// String ConsentMsg=Consent_Msg.getText();
			String ConsentMsg = Consent_Msg.getAttribute("innerText");
			String ActualConsent_Msg = ConsentMsg.replaceAll("\\n", "");

			// System.err.println("ActualConsent_Msg :" + ActualConsent_Msg);
			ActualConsent_Msg = ActualConsent_Msg.replaceAll("\\s", "");
			ExpectedConsent_Msg = ExpectedConsent_Msg.replaceAll("\\s", "");
			System.err.println("EXpectedConsent_Msg :" + ExpectedConsent_Msg);
			System.err.println("ActualConsent_Msg :" + ActualConsent_Msg);
			// ReadCareFully.click();
			Thread.sleep(1000);
			reuseMethod.scrollDown(Consent_Msg);
			Thread.sleep(1000);
			Assert.assertEquals(ActualConsent_Msg, ExpectedConsent_Msg, "Consent message for GI validation fail");

			log.info("Validated Consent message for GI in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Consent message for GI in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_I_Understand_Verbiage_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validates I Understand Verbiage in Read and Sign Box");
			Thread.sleep(1000);
			String ExpectedVerbiage_Msg = PropertyUtility.Load_MessageFile_Data("Verbiage_Message");
			String VerbiageMsg = Verbiage_Msg.getText();

			String ActualVerbiage_Msg = VerbiageMsg.replaceAll("\\n", "");

			
			ActualVerbiage_Msg = ActualVerbiage_Msg.replaceAll("\\s", "");
			ExpectedVerbiage_Msg = ExpectedVerbiage_Msg.replaceAll("\\s", "");
			System.err.println("ExpectedlVerbiage_Msg :" + ExpectedVerbiage_Msg);
			System.err.println("ActualVerbiage_Msg :" + ActualVerbiage_Msg);
			ReadCareFully.click();
			reuseMethod.scrollDown(Verbiage_Msg);
			Assert.assertEquals(ActualVerbiage_Msg, ExpectedVerbiage_Msg, "Verbiage message validation fail");

			log.info("Validated Verbiage message in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate VerbiageMsg message in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_Dividend_message_in_Dividend_Box() throws Throwable {
		try {
			log.debug("Validate DIVIDEND Notice in Divident Box");
			Thread.sleep(1000);
			String ExpectedMsg = PropertyUtility.Load_MessageFile_Data("Dividend_message");
			String DivMsg = DividentBoxText.getText();
			String[] parts = DivMsg.split("(?<=another.)");
			String part1 = parts[0];
			String part2 = parts[1];
			System.err.println("Election messege is:::" + part1);
			String ActualMsg = part1.replaceAll("\\n", "");

			System.err.println("Actual DIVIDEND Notice Messaege :" + ActualMsg);
			reuseMethod.scrollDown(FirstName);
			DividentBox.click();
			reuseMethod.scrollDown(DividentBoxText);
			Assert.assertEquals(ActualMsg.trim(), ExpectedMsg, "DIVIDENT Notice message validation fail");

			log.info("Validated DIVIDEND Notice message in Divident Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate DIVIDEND Notice message in Divident Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_FiveYTL_message_in_Dividend_Box() throws Throwable {
		try {
			log.debug("Validate Five Year Term Life  Messege in Divident Box");
			String ExpectedMsg = PropertyUtility.Load_MessageFile_Data("FiveYTL_message");
			String TermLifeMsg = FiveYr_Msg.getText();
			// String
			// ActualConsent_Msg=Consent_Msg.replaceAll(System.getProperty("line.separator"),
			// "");
			String ActualMsg = TermLifeMsg.replaceAll("\\n", "");

			System.err.println("Actual Five Year Messaege :" + ActualMsg);
			reuseMethod.scrollDown(FirstName);
			DividentBox.click();
			reuseMethod.scrollDown(FiveYr_Msg);
			Assert.assertEquals(ActualMsg.trim(), ExpectedMsg, "Five Year Term Life message validation fail");

			log.info("Validated Five Year Term Life message in Divident Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Five Year Term Life message in Divident Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_TenYTL_message_in_Dividend_Box() throws Throwable {
		try {
			log.debug("Validate Ten Year Term Messege in Divident Box");
			Thread.sleep(1000);
			String ExpectedMsg = PropertyUtility.Load_MessageFile_Data("TenYTL_message");
			String TenYearMsg = TenYr_Msg.getText();
			// String
			// ActualConsent_Msg=Consent_Msg.replaceAll(System.getProperty("line.separator"),
			// "");
			String ActualMsg = TenYearMsg.replaceAll("\\n", "");

			System.err.println("Actual Ten Year Messaege :" + ActualMsg);
			reuseMethod.scrollDown(FirstName);
			DividentBox.click();
			reuseMethod.scrollDown(TenYr_Msg);
			Assert.assertEquals(ActualMsg.trim(), ExpectedMsg, "Ten Year message validation fail");

			log.info("Validated Ten Year message in Divident Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Ten Year message in Divident Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_TwentyYTL_message_in_Dividend_Box() throws Throwable {
		try {
			log.debug("Validate Twenty Year Term Messege in Divident Box");
			Thread.sleep(1000);
			String ExpectedMsg = PropertyUtility.Load_MessageFile_Data("TwentyYTL_message");
			String TwentyYearMsg = TwentyYr_Msg.getText();
			// String
			// ActualConsent_Msg=Consent_Msg.replaceAll(System.getProperty("line.separator"),
			// "");
			String ActualMsg = TwentyYearMsg.replaceAll("\\n", "");

			System.err.println("Actual Twenty Year Messaege :" + ActualMsg);
			reuseMethod.scrollDown(FirstName);
			DividentBox.click();
			reuseMethod.scrollDown(TwentyYr_Msg);
			Assert.assertEquals(ActualMsg.trim(), ExpectedMsg, "Twenty Year message validation fail");

			log.info("Validated Twenty Year message in Divident Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Twenty Year message in Divident Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_FiftyMBTL_message_in_Dividend_Box() throws Throwable {
		try {
			log.debug("Validate Fifty Year Term Messege in Divident Box");
			String ExpectedMsg = PropertyUtility.Load_MessageFile_Data("FiftyMBTL_message");
			String FiftyYearMsg = FiftyYr_Msg.getText();
			// String
			// ActualConsent_Msg=Consent_Msg.replaceAll(System.getProperty("line.separator"),
			// "");
			String ActualMsg = FiftyYearMsg.replaceAll("\\n", "");

			System.err.println("Actual Fifty Year Messaege :" + ActualMsg);
			reuseMethod.scrollDown(FirstName);
			DividentBox.click();
			reuseMethod.scrollDown(FiftyYr_Msg);
			Assert.assertEquals(ActualMsg.trim(), ExpectedMsg, "Fifty Year message validation fail");

			log.info("Validated Fifty Year message in Divident Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Fifty Year message in Divident Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_ADDI_message_in_Dividend_Box() throws Throwable {
		try {
			log.debug("Validate AccidentDeath Message in Divident Box");
			String ExpectedMsg = PropertyUtility.Load_MessageFile_Data("ADnD_message");
			String AccidentDeathMsg = AccidentDeath_Msg.getText();
			// String
			// ActualConsent_Msg=Consent_Msg.replaceAll(System.getProperty("line.separator"),
			// "");
			String ActualMsg = AccidentDeathMsg.replaceAll("\\n", "");

			System.err.println("Actual AccidentDeath  Messaege :" + ActualMsg);
			reuseMethod.scrollDown(FirstName);
			DividentBox.click();
			reuseMethod.scrollDown(AccidentDeath_Msg);
			Assert.assertEquals(ActualMsg.trim(), ExpectedMsg, "Accidental Death message validation fail");

			log.info("Validated AccidentDeath message in Divident Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate AccidentDeath message in Divident Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_LTDPlus_message_in_Dividend_Box() throws Throwable {
		try {
			log.debug("Validate LTDP  Messege in Divident Box");
			String ExpectedMsg = PropertyUtility.Load_MessageFile_Data("LTDPlus_message");
			String LTDPlusMsg = LTDP_Msg.getText();
			// String
			// ActualConsent_Msg=Consent_Msg.replaceAll(System.getProperty("line.separator"),
			// "");
			String ActualMsg = LTDPlusMsg.replaceAll("\\n", "");

			System.err.println("Actual LTDPlusMsg  Messaege :" + ActualMsg);
			reuseMethod.scrollDown(FirstName);
			DividentBox.click();
			reuseMethod.scrollDown(LTDP_Msg);
			Assert.assertEquals(ActualMsg.trim(), ExpectedMsg,
					"Long Term disability Plus Product message validation fail");

			log.info("Validated LTDPlus message in Divident Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate LTDPlus  message in Divident Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_LTD_message_in_Dividend_Box() throws Throwable {
		try {
			log.debug("Validate LTD  Messege in Divident Box");
			String ExpectedMsg = PropertyUtility.Load_MessageFile_Data("LTD_message");
			String LTDMsg = LTD_Msg.getText();
			// String
			// ActualConsent_Msg=Consent_Msg.replaceAll(System.getProperty("line.separator"),
			// "");
			String ActualMsg = LTDMsg.replaceAll("\\n", "");

			System.err.println("Actual LTDMsg  Messaege :" + ActualMsg);
			reuseMethod.scrollDown(FirstName);
			DividentBox.click();
			reuseMethod.scrollDown(LTD_Msg);
			Assert.assertEquals(ActualMsg.trim(), ExpectedMsg, "Long Term disability Product message validation fail");

			log.info("Validated LTD message in Divident Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate LTD  message in Divident Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_MTDI_message_in_Dividend_Box() throws Throwable {
		try {
			log.debug("Validate MID Year  Messege in Divident Box");
			String ExpectedMsg = PropertyUtility.Load_MessageFile_Data("MTDI_message");
			String MidYrMsg = MID_Msg.getText();
			// String
			// ActualConsent_Msg=Consent_Msg.replaceAll(System.getProperty("line.separator"),
			// "");
			String ActualMsg = MidYrMsg.replaceAll("\\n", "");

			System.err.println("Actual Mid Year  Messaege :" + ActualMsg);
			reuseMethod.scrollDown(FirstName);
			DividentBox.click();
			reuseMethod.scrollDown(MID_Msg);
			Assert.assertEquals(ActualMsg.trim(), ExpectedMsg, "Mid Term disability Product message validation fail");

			log.info("Validated Mid Term message in Divident Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Mid Term  message in Divident Box || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_RDI_message_in_Dividend_Box() throws Throwable {
		try {
			log.debug("Validate Retirement Disability Insurance Messege in Divident Box");
			String ExpectedMsg = PropertyUtility.Load_MessageFile_Data("RDI_message");
			String RetirementMsg = Retirement_Msg.getText();
			// String
			// ActualConsent_Msg=Consent_Msg.replaceAll(System.getProperty("line.separator"),
			// "");
			String ActualMsg = RetirementMsg.replaceAll("\\n", "");

			System.err.println("Actual Retirement Disability Insurance  Messaege :" + ActualMsg);
			reuseMethod.scrollDown(FirstName);
			DividentBox.click();
			reuseMethod.scrollDown(Retirement_Msg);
			Assert.assertEquals(ActualMsg.trim(), ExpectedMsg,
					"Retirement Disability Insurance Product message validation fail");

			log.info("Validated Retirement Disability Insurance Messege in Divident Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Retirement Disability Insurance Messege in Divident Box || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validate_POEDI_message_in_Dividend_Box() throws Throwable {
		try {
			log.debug("Validate Professional Disability Insurance Messege in Divident Box");
			String ExpectedMsg = PropertyUtility.Load_MessageFile_Data("POEDI_message");
			String ProfessionalMsg = Professional_Msg.getText();
			// String
			// ActualConsent_Msg=Consent_Msg.replaceAll(System.getProperty("line.separator"),
			// "");
			String ActualMsg = ProfessionalMsg.replaceAll("\\n", "");

			System.err.println("Actual Professional Disability Insurance  Messaege :" + ActualMsg);
			reuseMethod.scrollDown(FirstName);
			DividentBox.click();
			reuseMethod.scrollDown(Professional_Msg);
			Assert.assertEquals(ActualMsg.trim(), ExpectedMsg,
					"Professional Disability Insurance Product message validation fail");

			log.info("Validated Professional Disability Insurance Messege in Divident Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Professional Disability Insurance Messege in Divident Box || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validate_CI_message_in_Dividend_Box() throws Throwable {
		try {
			log.debug("Validate Critical Illness Product Messege in Divident Box");
			String ExpectedMsg = PropertyUtility.Load_MessageFile_Data("CI_message");
			String CriticalMsg = CriticalIllness_Msg.getText();
			// String
			// ActualConsent_Msg=Consent_Msg.replaceAll(System.getProperty("line.separator"),
			// "");
			String ActualMsg = CriticalMsg.replaceAll("\\n", "");

			System.err.println("Actual Critical Illness Product Messaege :" + ActualMsg);
			reuseMethod.scrollDown(FirstName);
			DividentBox.click();
			reuseMethod.scrollDown(CriticalIllness_Msg);
			Assert.assertEquals(ActualMsg.trim(), ExpectedMsg, "Critical Illness Product message validation fail");

			log.info("Validated Critical Illness Product Messege in Divident Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Critical Illness Product Messege inDivident Box|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_HMI_message_in_Dividend_Box() throws Throwable {
		try {
			log.debug("Validate Hospital Money Insurance Product Messege in Divident Box");
			String ExpectedMsg = PropertyUtility.Load_MessageFile_Data("HMI_message");
			String HospitalMsg = Hospital_Msg.getText();
			// String
			// ActualConsent_Msg=Consent_Msg.replaceAll(System.getProperty("line.separator"),
			// "");
			String ActualMsg = HospitalMsg.replaceAll("\\n", "");

			System.err.println("Actual Hospital Money Insurance Product Messaege :" + ActualMsg);
			reuseMethod.scrollDown(FirstName);
			DividentBox.click();
			reuseMethod.scrollDown(Hospital_Msg);
			Assert.assertEquals(ActualMsg.trim(), ExpectedMsg,
					"Hospital Money Insurance Product message validation fail");

			log.info("Validated Hospital Money Insurance Product Messege in Divident Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Hospital Money Insurance Product Messege inDivident Box|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validate_Election_message_in_Dividend_Box() throws Throwable {
		try {
			log.debug("Validate Election Messege in Divident Box");
			String ExpectedMsg = PropertyUtility.Load_MessageFile_Data("Election_message");
			String ElectionMsg = DividentBoxText_Election.getText();
			System.err.println(ElectionMsg);

			String[] parts = ElectionMsg.split("(?=ELECTION)");
			String part1 = parts[0];
			String part2 = parts[1];
			System.err.println("Election messege is:::" + part2);
			Assert.assertEquals(part2.trim(), ExpectedMsg, "Election Message validation fail");
			log.info("Validated Election Messege in Divident Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Election Messege inDivident Box|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean verify_that_fraud_notice_is_not_rendered_at_Authorization_page() throws Exception {

		try {
			log.debug("Validate Fraud Notice is not available in Read and Sign Box");

			Thread.sleep(1000);
			boolean check = Fraud_Notice_Common.isDisplayed();
			Assert.assertFalse(check, "Fraud Notice is available in Read and Sign Box");

			log.info("Validated Fraud Notice is not available in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate Fraud Notice is not available in Read and Sign Box || Fail" + e.getMessage());
			return false;
		}
	}

	public boolean clicks_on_IMPORTANT_NOTICE_in_the_Consent_message_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Clicks on IMPORTANT NOTICE in the Consent message in Read and Sign Box");
			Important_Notice.isDisplayed();
			Important_Notice.click();
			log.info("Important Notice in the Consent message in Read and Sign Box is clicked successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Clicks on IMPORTANT NOTICE in the Consent message in Read and Sign Box || Fail"
					+ e.getMessage());
			throw (e);
		}
	}
	public boolean submit_application_page_details_are_displayed_to_user_and_confirm_the_term_and_conditions_for_Self()
			throws Exception {

		try {
			log.debug("Confirm the term and conditions for Self");
			SubmitApplication.isDisplayed();
			Thread.sleep(2000);
			reuseMethod.scrollDown(TermNconditions_Self);
			TermNconditions_Self.click();
			Thread.sleep(2000);

			log.info("Term and Conditions for Self selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Term and Conditions for self || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean submit_application_page_details_are_displayed_to_user_and_confirm_the_term_and_conditions_for_Spouse()
			throws Exception {

		try {
			log.debug("Confirm the term and conditions for Spouse");
			SubmitApplication.isDisplayed();
			Thread.sleep(2000);
			reuseMethod.scrollDown(TermNconditions_Spouse);
			Thread.sleep(2000);
			TermNconditions_Spouse.click();

			log.info("Term and Conditions for Spouse selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Term and Conditions for Spouse || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean verify_FirstName_LastName_DOB_Self_Displayed() throws Exception {
		try {
			log.debug("Verify First name,last name and DOB of self");
			Thread.sleep(1000);
			reuseMethod.scrollDown(FirstNameSelf);
			FirstNameSelf.isDisplayed();
			SecondNameSelf.isDisplayed();
			DOBSelf.isDisplayed();
			log.info("First name,last name and DOB of self is displayed successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify first name,last name and DOB of self || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean verify_FirstName_LastName_DOB_Spouse_Displayed() throws Exception {
		try {
			log.debug("Verify First name,last name and DOB of spouse");
			Thread.sleep(1000);
			reuseMethod.scrollDown(FirstNameSpouse);
			FirstNameSpouse.isDisplayed();
			SecondNameSpouse.isDisplayed();
			DOBSpouse.isDisplayed();
			log.info("First name,last name and DOB of spouse is displayed successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify first name,last name and DOB of spouse || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean enters_FirstName_LastName_DOB_Self(String fname, String lname, String dob) throws Exception {
		try {
			log.debug("Enters First name,last name and DOB of self");
			Thread.sleep(2000);
			reuseMethod.scrollDown(FirstNameSelf);
			FirstNameSelf.clear();
			FirstNameSelf.sendKeys(fname);
			Thread.sleep(1000);
			SecondNameSelf.clear();
			SecondNameSelf.sendKeys(lname);
			Thread.sleep(1000);
			if (dob.contains("SYSDate") || dob.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(dob);
				DOBSelf.sendKeys(date);
			} else
				DOBSelf.sendKeys(dob);
			log.info("Enters First name,last name and DOB of self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter first name,last name and DOB of self || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean enters_FirstName_LastName_DOB_Spouse(String fname, String lname, String dob) throws Exception {
		try {
			log.debug("Enters First name,last name and DOB of spouse");
			Thread.sleep(1000);
			FirstNameSpouse.clear();
			FirstNameSpouse.sendKeys(fname);
			Thread.sleep(1000);
			SecondNameSpouse.clear();
			SecondNameSpouse.sendKeys(lname);
			Thread.sleep(1000);
			if (dob.contains("SYSDate") || dob.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(dob);
				DOBSpouse.sendKeys(date);
			} else
				DOBSpouse.sendKeys(dob);
			log.info("Enters First name,last name and DOB of spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter first name,last name and DOB of spouse || Fail" + e.getMessage());
			throw (e);
		}
	}


	public boolean validate_Submit_Application_Displayed() throws Exception {
		try {
			log.debug("Validate submit application is displayed");
			Thread.sleep(1000);
			SubmitApplication.isDisplayed();
			log.info("Submit application is displayed successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate submit application || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean validates_Second_I_Understand_verbiage_not_Displayed_in_Read_and_Sign_Box() throws Exception {

		try {
			log.debug("Validate Second I understand verbiage is not displayed in Read and Sign Box");
			Thread.sleep(1000);
			boolean check = UnderstandMsg2.isDisplayed();
			Assert.assertFalse(check, "Second I understand verbiage is not displayed in Read and Sign Box");
			log.info("Validated Second I understand verbiage is not displayed in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate Second I understand verbiage is not displayed in Read and Sign Box || Fail" + e.getMessage());
			return false;
		}
	}
	
	public boolean validate_Authorization_message_not_displayed_in_Read_and_Sign_Box() throws Exception {

		try {
			log.debug("Validate Authorization message is not displayed in Read and Sign Box");

			Thread.sleep(1000);
			boolean check = Authorization_Message.isDisplayed();
			Assert.assertFalse(check, "Authorization message is displayed in Read and Sign Box");

			log.info("Validated Authorization message is not displayed in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate Authorization message is not displayed in Read and Sign Box || Fail" + e.getMessage());
			return false;
		}
	}
	
	public boolean confirm_the_term_and_conditions_for_Self()
			throws Exception {

		try {
			log.debug("Confirm the term and conditions for Self");
			Thread.sleep(2000);
			reuseMethod.scrollDown(TermNconditions_Self);
			TermNconditions_Self.click();
			Thread.sleep(2000);

			log.info("Term and Conditions for Self selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Term and Conditions for self || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public Boolean validate_Error_message_for_FirstName_Mismatch() throws Throwable {
		try {
			log.debug("Validate Error Messege for mismatch in first name");
			String Expected = PropertyUtility.Load_MessageFile_Data("PreviouslyEnteredNotMatched");

			errorFirstName.isDisplayed();
			String actual = errorFirstName.getText();
			System.err.println("Error Messege on Authorize Page===" + actual);
			Assert.assertEquals(actual, Expected, "Error message is Displayed");

			log.info("Error Message is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Error Message || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean enters_FirstName_Self(String fname) throws Exception {
		try {
			log.debug("Enters First name of self");
			Thread.sleep(1000);
			FirstNameSelf.sendKeys(fname);
			FirstNameSelf.sendKeys(Keys.TAB);
			log.info("Enters First name of self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter first name of self || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean click_Submit_button() throws Exception{
		try {
			log.debug("Clicks on submit button");
			reuseMethod.scrollDown(btnSubmit);
			btnSubmit.click();
			
			log.info("Clicks on submit button successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Click on submit button || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean validate_Consent_message_for_LA_in_Read_and_Sign_Box() throws Throwable {
		try {
			log.debug("Validate Consent message for LA in Read and Sign Box");
			Thread.sleep(1000);
			String ExpectedConsent_Msg = PropertyUtility.Load_MessageFile_Data("Consent_messageLA");
			String ConsentMsg = Consent_Msg.getText();

			String ActualConsent_Msg = ConsentMsg.replaceAll("\\n", "");

			System.err.println("ActualConsent_Msg :" + ActualConsent_Msg);
			ActualConsent_Msg.replaceAll("\\s", "");
			ExpectedConsent_Msg.replaceAll("\\s", "");
			readAndSignBox.click();
			reuseMethod.scrollDown(Consent_Msg);
			Assert.assertEquals(ActualConsent_Msg, ExpectedConsent_Msg, "Consent message for LA validation fail");

			log.info("Validated Consent message for LA in Read and Sign Box successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Consent message for LA in Read and Sign Box || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean click_Scroll_Consent_Message()throws Exception{
		try {
			log.debug("Click and scroll on Consent message in Read and Sign box");
			reuseMethod.scrollDown(Consent_Msg);
			Consent_Msg.click();
			JavascriptExecutor js= (JavascriptExecutor) reuseMethod.driver;
			js.executeScript("arguments[0].scrollIntoView(0,-160);",ConsentScrollBar);			
			log.info("User click and scroll on Consent message in Read and Sign box successfully");
			return true;
		}catch(Exception e) {
			log.error("Not able to click and scroll on Consent message in Read and Sign Box || Fail" + e.getMessage());
			throw(e);
		}
	}
}
