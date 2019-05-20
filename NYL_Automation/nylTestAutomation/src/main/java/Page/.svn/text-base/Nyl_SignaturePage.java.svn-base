package Page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import MyCommonObject.CommonPage;
import Selenium.ScreenShotUtility;
import Selenium.SetUp;
//import Utility.Excel_Utility;
import Utility.ReuseableMethod;
import Utility.ExcelUtility;

public class Nyl_SignaturePage extends SetUp {

//public WebDriver driver = null;
	private final Logger log = LogManager.getLogger(Nyl_SignaturePage.class.getName());

	public Nyl_SignaturePage() {
		driver = getDriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	ReuseableMethod reuseMethod = new ReuseableMethod();
	ScreenShotUtility screenShotUtility = new ScreenShotUtility();

	@FindBy(id = "action-bar-btn-continue")
	WebElement Continue;

	@FindBy(xpath = "//button[contains(@id,'tab-form-element')][@class='tab-button']")
	WebElement Sign;

	@FindBy(xpath = "//img[contains(@data-qa,'adopt-signature-img')]")
	WebElement SignImage;

	@FindBy(xpath = "//button[@data-qa='adopt-submit'][1]")
	WebElement AdoptAndSign;

	@FindBy(id = "end-of-document-btn-finish")
	WebElement NextToFinish;

	@FindBy(xpath = "//h3[text()='Signature']")
	WebElement hdrSignature;

	public boolean review_and_sign_page_details_are_displayed_to_user_and_Click_on_continue_and_attached_the_sign()
			throws Exception {

		try {
			log.debug("Continue and attached the sign");
			Thread.sleep(10000);
			Continue.click();
			reuseMethod.scrollDown(Sign);
			Thread.sleep(5000);
			Sign.click();
			Thread.sleep(4000);
			SignImage.click();
			Thread.sleep(4000);
			AdoptAndSign.click();
			Thread.sleep(5000);
			log.info("Signature Added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add signature|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean clicks_on_next_button_to_finish() throws Exception {

		try {
			log.debug("Click on next button to finish");
			Thread.sleep(2000);
			reuseMethod.scrollDown(NextToFinish);
			Thread.sleep(2000);
			NextToFinish.click();
			Thread.sleep(10000);

			log.info("Click on next to finish button successfully || Pass");
			return true;
		} catch (Exception e) {
			log.info("Not able to click on next to finish button || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean payment_Authorization_Letter_is_displayed_to_user_and_clicks_on_Continue() throws Exception {

		try {
			log.debug("Payment Authorization letter is displyed to user and Click On Continue Button");

			Thread.sleep(10000);
			Continue.click();

			log.info("Click on Continue Button sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.info("Not able to click on Continue button || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean signs_Payment_Authorization_Letter() throws Exception {

		try {
			log.debug("Sign Payment Authorization Page");

			reuseMethod.scrollDown(Sign);
			Sign.click();
			Thread.sleep(2000);

			log.info("Sign Payment Authorization Page sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.info("Not able to sign Payment Authorization Page || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean signature_details_are_displayed_to_user() throws Exception {

		try {
			log.debug("Validate the Signature details is Displayed");
			hdrSignature.isDisplayed();
			log.info("Signature details is Displayed successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to displayed Signature deatils || Fail" + e.getMessage());
			throw (e);

		}
	}
}
