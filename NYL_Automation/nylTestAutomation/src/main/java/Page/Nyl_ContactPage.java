
package Page;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Selenium.ScreenShotUtility;
import Selenium.SetUp;
import Utility.ExcelUtility;
import Utility.ReuseableMethod;
import Utility.propertyUtility;

public class Nyl_ContactPage extends SetUp {

//public WebDriver driver = null;

	String sheetName = "Beneficiary";
	ExcelUtility testUtil = new ExcelUtility();
	private final Logger log = LogManager.getLogger(Nyl_ContactPage.class.getName());

	public Nyl_ContactPage() {
		driver = getDriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	ReuseableMethod reuseMethod = new ReuseableMethod();
	ScreenShotUtility screenShotUtility = new ScreenShotUtility();
	propertyUtility PropertyUtility = new propertyUtility();

	/************* Contact Page Locators for Self **************/
//Test-Pradeep
	@FindBy(xpath = "//*[text()='Contact Details']")
	WebElement Element1;
	
	
	@FindBy(xpath = "//*[text()='Contact Details']")
	WebElement ContactPage;

	@FindBy(xpath = "//input[@id='txtSsnSlf']")
	WebElement SocialSecurityNum;

	@FindBy(xpath = "//input[@id='txtOptionalSsnSlf']")
	WebElement SSNSelf_Optional;

	@FindBy(id = "selMaritalStatusSlf")
	WebElement maritalStatus;

	@FindBy(id = "selfHeightNdWeight_selHeight")
	WebElement height;

	@FindBy(id = "selfHeightNdWeight_selWeight")
	WebElement weight;

	@FindBy(xpath = "//*[@for='rdGenderSlf-0']")
	WebElement Male_Self;

	@FindBy(xpath = "//*[@for='rdGenderSlf-1']")
	WebElement Female_Self;

	@FindBy(id = "rdGenderSlf-0")
	WebElement MaleSelf_Text;

	@FindBy(id = "rdGenderSlf-1")
	WebElement FemaleSelf_Text;

	@FindBy(id = "weightTwelveMonthsAgoSlf")
	WebElement WeightTwelveMnth;

	@FindBy(id = "rdDriversLicenseSlf-0")
	WebElement DriverLicenseYes;

	@FindBy(id = "rdDriversLicenseSlf-1")
	WebElement DriverLicenseNo;

	@FindBy(id = "txtDriversLicenseNumberSlf")
	WebElement License_num;

	@FindBy(id = "selDriversLicenseStateSlf")
	WebElement License_state;

	@FindBy(id = "rdNonUSAddrSlf-0")
	WebElement OutsideUS12MonthYes;

	@FindBy(id = "rdNonUSAddrSlf-1")
	WebElement OutsideUS12MonthNo;

	@FindBy(id = "rdOutsideUSInSixSlf-0")
	WebElement OutsideUS06MonthYes;

	@FindBy(id = "rdOutsideUSInSixSlf-1")
	WebElement OutsideUS06MonthNo;
	
	@FindBy(id = "txtCurrInsrdAccNum")
	WebElement CurrAccountNo;
	

	// WAEPA

	@FindBy(id = "selCountrySlf")
	WebElement OutsideUSCountry_Self;

	@FindBy(id = "selCountrySps")
	WebElement OutsideUSCountry_Spouse;

	@FindBy(id = "txtDurationOfStaySlf")
	WebElement HowLong_Self;

	@FindBy(id = "txtDurationOfStaySps")
	WebElement HowLong_Spouse;

	@FindBy(id = "rdJetSmokerQuestSlf-0")
	WebElement SmokeYes;

	@FindBy(id = "rdJetSmokerQuestSlf-1")
	WebElement SmokeNo;

	@FindBy(id = "dtJetSmokerLastUsedSlf")
	WebElement LastSmokingDate;

	@FindBy(xpath = "//input[@id='selJetSmokerPickListSlf-selectized']")
	WebElement Product_used;

	//div[@data-fields='selJetSmokerPickListSlf']//label[contains(text(),'Yes')]
	@FindBy(xpath = "//div[@data-fields='selJetSmokerPickListSlf']//label[contains(text(),'Yes')]")
	WebElement Product_used_text;

	// AAFP

	@FindBy(id = "rdOutsideUSInSixSlf-1")
	WebElement OutsideUSCountry_SixMonth_NO_Self;

	@FindBy(id = "dtJetSmokerLastUsedSps")
	WebElement LastSmokingDate_Spouse;

	@FindBy(xpath = "//input[@id='selJetSmokerPickListSps-selectized']")
	WebElement ProductUsed_Spouse;

	@FindBy(xpath = "//input[@id='txtOptMembershipIdSlf' or @id='txtMembershipIdSlf']")
	WebElement memberId;

	@FindBy(id = "txtAgentCode")
	WebElement AgentId;

	@FindBy(id = "selPayFrequency")
	WebElement PayFrequency;

	@FindBy(id = "residentialAddress_txtStreetLine1Slf")
	WebElement address;

	@FindBy(id = "residentialAddress_txtCity")
	WebElement city;

	@FindBy(id = "residentialAddress_txtZipCodeSlf")
	WebElement ZipCode;

	@FindBy(id = "selfPreferredContact_selPrimaryPhType")
	WebElement PrimaryPhNumType;

	@FindBy(id = "selfPreferredContact_txtPrimaryPhNo")
	WebElement PrimaryPhNum;

	@FindBy(id = "rdContactPrefSlf-0")
	WebElement Residential;

	@FindBy(id = "rdContactPrefSlf-1")
	WebElement BusinessAddress;

	@FindBy(id = "rdCopyResiAddrSlf-0")
	WebElement BusinessAddress_YES;

	@FindBy(id = "rdCopyResiAddrSlf-1")
	WebElement BusinessAddress_NO;

	@FindBy(id = "txtBusinessNameSlf")
	WebElement Business_Name;

	@FindBy(id = "selBusinessType")
	WebElement Business_Type;

	@FindBy(id = "businessAddress_txtStreetLine1Slf")
	WebElement BusinessAddress_Street;

	@FindBy(id = "businessAddress_txtCity")
	WebElement BusinessAddress_City;

	@FindBy(id = "businessAddress_selStateProvinceSlf")
	WebElement BusinessAddress_State;

	@FindBy(id = "businessAddress_txtZipCodeSlf")
	WebElement BusinessAddress_Zip;

	@FindBy(id = "family")
	WebElement FamilyCheck;

	@FindBy(xpath = "//div[@data-fields='rdNonUSAddrSlf']//label[contains(text(),'Do you intend to reside outside the U.S. or Canada in the next 12 months?')]")
	WebElement TravelQuestionNONQDSelf;

	@FindBy(xpath = "//div[@data-fields='rdNonUSAddrSps']//label[contains(text(),'Do you intend to reside outside the U.S. or Canada in the next 12 months?')]")
	WebElement TravelQuestionNONQDSpouse;

	@FindBy(xpath = "//label[contains(text(),'Do you intend to reside outside the U.S. or Canada in the next 12 months?')]")
	WebElement TravelQuestionNONQD;

	@FindBy(xpath = "//p[contains(text(),'ID number is required.')]")
	WebElement MemberIdErrorMessege;

	@FindBy(xpath = "//input[@id='txtSsnSps']//parent::div//following-sibling::p[@class='error-text']")
	WebElement SSNMessage_Spouse;

	@FindBy(xpath = "//input[@id='txtSsnSlf']//parent::div//following-sibling::p[@class='error-text']")
	WebElement SSNMessage_Self;

	@FindBy(xpath = "//div[@data-fields='rdOutsideUSInSixSlf']//label[contains(text(),'Do you intend to reside outside the U.S. or Canada for more than six months?')]")
	WebElement TravelQuestionQDSelf;

	@FindBy(xpath = "//div[@data-fields='rdOutsideUSInSixSps']//label[contains(text(),'Do you intend to reside outside the U.S. or Canada for more than six months?')]")
	WebElement TravelQuestionQDSpouse;

	@FindBy(xpath = "//div[@class='field-rdJetSmokerQuestSlf']//label[contains(text(),'nicotine')]")
	WebElement TobaccoQuestion_Self;

	@FindBy(xpath = "//div[@class='field-rdJetSmokerQuestSps']//label[contains(text(),'nicotine')]")
	WebElement TobaccoQuestion_Spouse;

	/************* Contact Page Locators for Spouse **************/

	@FindBy(xpath = "//input[@id='txtSsnSps']")
	WebElement Ssn_Spouse;

	@FindBy(xpath = "//input[@id='txtOptionalSsnSps']")
	WebElement SSNSpouse_Optional;

	@FindBy(id = "spouseHeightNdWeight_selHeight")
	WebElement Height_Spouse;

	@FindBy(id = "spouseHeightNdWeight_selWeight")
	WebElement Weight_Spouse;

	@FindBy(xpath = "//*[@for='rdGenderSps-0']")
	WebElement Male_Spouse;

	@FindBy(id = "rdGenderSps-0")
	WebElement Male_SpouseText;

	@FindBy(xpath = "//*[@for='rdGenderSps-1']")
	WebElement Female_Spouse;

	@FindBy(id = "rdGenderSps-1")
	WebElement Female_SpouseText;

	@FindBy(id = "weightTwelveMonthsAgoSps")
	WebElement WeightTwelveMnth_Spouse;

	@FindBy(id = "rdDriversLicenseSps-0")
	WebElement DriverLicenseYes_Spouse;

	@FindBy(id = "rdDriversLicenseSps-1")
	WebElement DriverLicenseNo_Spouse;

	@FindBy(id = "txtDriversLicenseNumberSps")
	WebElement LicenseNum_Spouse;

	@FindBy(id = "selDriversLicenseStateSps")
	WebElement LicenseState_Spouse;

	@FindBy(id = "rdOutsideUSInSixSps-0")
	WebElement OutsideUS06MonthYes_Spouse;

	@FindBy(id = "rdOutsideUSInSixSps-1")
	WebElement OutsideUS06MonthNo_Spouse;

	@FindBy(id = "rdNonUSAddrSps-0")
	WebElement OutsideUS12MonthYes_Spouse;

	@FindBy(id = "selCountrySps")
	WebElement CountrySpouse;

	@FindBy(id = "selOutsideUSInSixCountrySlf")
	WebElement CountrySelfQD;

	@FindBy(id = "selOutsideUSInSixCountrySps")
	WebElement CountrySpouseQD;

	@FindBy(id = "txtDurationOfStaySps")
	WebElement MonthsSpouse;

	@FindBy(id = "rdNonUSAddrSps-1")
	WebElement OutsideUS12MonthNo_Spouse;

	@FindBy(id = "rdJetSmokerQuestSps-0")
	WebElement SmokeYes_Spouse;

	@FindBy(id = "rdJetSmokerQuestSps-1")
	WebElement SmokeNo_Spouse;

	@FindBy(id = "txtMembershipIdSps")
	WebElement MemberId_Spouse;

	@FindBy(id = "spousePreferredContact_selPrimaryPhType")
	WebElement PrimaryPhNumType_Spouse;

	@FindBy(id = "spousePreferredContact_txtPrimaryPhNo")
	WebElement PrimaryPhNum_Spouse;

	/*
	 * @FindBy(id="rdNonUSAddrSps-0") WebElement WaepaOutsideUSYes_Spouse;
	 * 
	 * @FindBy(id="rdNonUSAddrSps-1") WebElement WaepaOutsideUSNO_Spouse;
	 */
	/*--------------------------------------------------------*/
	@FindBy(xpath = "//div[@id='div_selfPreferredContact_txtPrimaryPhNo']/div/span/span[2]/input")
	WebElement mobSelfPrimaryPhNum;

	@FindBy(xpath = "//label[@for='rdContactPrefSlf-0']")
	WebElement mobHome;

	@FindBy(xpath = "//label[@for='rdContactPrefSlf-1']")
	WebElement mobBusiness;

	@FindBy(id = "txtBusinessNameSlf")
	WebElement mobBusinessName;

	@FindBy(id = "selBusinessType")
	WebElement mobBusinessType;

	@FindBy(xpath = "//label[@for='rdCopyResiAddrSlf-0']")
	WebElement mobSameAddressYes;

	@FindBy(xpath = "//label[@for='rdCopyResiAddrSlf-1']")
	WebElement mobSameAddressNo;

	@FindBy(id = "txtEmailSps")
	WebElement mobSpouseEmail;

	@FindBy(id = "txtEmailSlf")
	WebElement mobSelfEmail;

	@FindBy(id = "spousePreferredContact_selPrimaryPhType")
	WebElement mobSpousePhoneType;

	@FindBy(xpath = "//div[@id='div_spousePreferredContact_txtPrimaryPhNo']/div/span/span[2]/input")
	WebElement mobSpousePrimaryPhNum;

	@FindBy(id = "selfPreferredContact_txtPrimaryPhExtn")
	WebElement mobExtension;

	// WAEPA************************
	@FindBy(id = "tv")
	WebElement HearAboutWAEPA_TV;
	// *****************************

	@FindBy(id = "back")
	WebElement Previous;

	@FindBy(id = "cancel")
	WebElement Cancel;

	@FindBy(id = "saveForLater")
	WebElement SaveForLater;

	@FindBy(id = "next")
	WebElement Next;

	@FindBy(id = "tv")
	WebElement tv_checkbox;

	@FindBy(xpath = "//div[@id='businessGoogleAddress']//input[not(@id)]")
	WebElement BusinessAddressSelf_Mob;

	@FindBy(id = "businessGoogleAddress-address-extra")
	WebElement AddressExtra_Mob;

	@FindBy(xpath = "//input[@id='txtDealershipName']")
	WebElement DealershipName;

	@FindBy(xpath = "//input[@id='dealershipAddress_txtStreetLine1Slf']")
	WebElement DealershipStreet;

	@FindBy(xpath = "//input[@id='dealershipAddress_txtCity']")
	WebElement DealershipCity;

	@FindBy(id = "dealershipAddress_selStateProvinceSlf")
	WebElement DealershipState;

	@FindBy(xpath = "//input[@id='dealershipAddress_txtZipCodeSlf']")
	WebElement DealershipZip;

	@FindBy(id = "txtStockOwnedPer")
	WebElement StockOwned;

	@FindBy(xpath = "//div[@data-fields='txtOptionalSsnSps']//label[not(@class='mandatory1')][text()='Social Security Number']")
	WebElement SpouseSSNOptional;

	@FindBy(id = "selTitleSlf")
	WebElement drpTitle;

	@FindBy(id = "txtFirstNameSlf")
	WebElement inpFirstName;

	@FindBy(id = "txtLastNameSlf")
	WebElement inpLastName;

	@FindBy(id = "rdAssSmokerSlf-1")
	WebElement rbSmokerNo_Self;

	@FindBy(id = "rdAssSmokerSlf-0")
	WebElement rbSmokerYes_Self;

	@FindBy(id = "mrate")
	WebElement SemiAnnualRate;

	@FindBy(xpath = "//button[normalize-space()='Continue' and not(contains(@style,'none'))]")
	WebElement btnContinue;
	
	@FindBy(xpath="//label[contains(text(),'Applicant Details')]")
	WebElement ApplicantDetailsPage;
	
	@FindBy(id="rdOMASmokerQSlf-0")
	WebElement NicotineYes_Self;
	
	@FindBy(id="rdOMASmokerQSlf-1")
	WebElement NicotineNo_Self;
	
	@FindBy(id="txtOMASmokerHowLongSlf")
	WebElement HowLongUsed_Self;
	
	@FindBy(id="dtOMASmokerLastUsedSlf")
	WebElement OMALastUsed_Self;
	
	@FindBy(id="rdOMASmokerQSps-0")
	WebElement NicotineYes_Spouse;
	
	@FindBy(id="txtOMASmokerHowLongSps")
	WebElement HowLongUsed_Spouse;
	
	@FindBy(id="dtOMASmokerLastUsedSps")
	WebElement OMALastUsed_Spouse;
	
	@FindBy(id="residentialAddress_txtCanadianZipCodeSlf")
	WebElement CanadianZipCode_Self;

	public boolean contact_details_page_are_displayed_to_user() throws Exception {
		try {
			log.debug("Contact page is displayed");
			ContactPage.isDisplayed();
			log.info("Contact page is displayed is sucessful || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify that contact page is displayed || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean contact_page_details_are_displayed_to_user_and_validate_details() throws Exception {
		try {
			log.debug("Validate elements of contact page");
			SocialSecurityNum.isDisplayed();
			maritalStatus.isDisplayed();
			height.isDisplayed();
			weight.isDisplayed();
			Male_Self.isDisplayed();
			Female_Self.isDisplayed();

			SmokeNo.isDisplayed();
			SmokeYes.isDisplayed();
			OutsideUS12MonthYes.isDisplayed();
			OutsideUS12MonthNo.isDisplayed();
			reuseMethod.scrollDown(Next);
			address.isDisplayed();
			city.isDisplayed();
			ZipCode.isDisplayed();
			PrimaryPhNumType.isDisplayed();
			PrimaryPhNum.isDisplayed();
			Residential.isDisplayed();
			BusinessAddress.isDisplayed();
			ZipCode.isDisplayed();
			Previous.isDisplayed();
			SaveForLater.isDisplayed();
			Next.isDisplayed();
			Cancel.isDisplayed();
			reuseMethod.scrollDown(SocialSecurityNum);

			log.info("Element validation of contact page is sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Notable to validate the elements of contact page || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean validate_the_Travel_Question_for_Non_QD_application_for_Self() throws Throwable {
		try {
			log.debug("Validate Travel Question for NON QD Application Self");
			TravelQuestionNONQDSelf.isDisplayed();

			String actual = TravelQuestionNONQDSelf.getText();
			String Expected = PropertyUtility.Load_MessageFile_Data("TravelQuestion");

			System.out.println("********************Information***********************/n" + Expected);

			Assert.assertEquals(actual, Expected, "Travel Question for Non QD Self is not Validated");
			System.out.println("Validation Question for Self is::::" + TravelQuestionNONQDSelf.getText());
			log.info("Travel Question for Self  is validated sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Travel Question for Self|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_the_Travel_Question_for_QD_application() throws Throwable {
		try {
			log.debug("Validate Travel Question for QD Application Self");
			TravelQuestionQDSelf.isDisplayed();

			String actual = TravelQuestionQDSelf.getText();
			String Expected = PropertyUtility.Load_MessageFile_Data("TravelQuestionQD");

			System.out.println("************Information*************\n" + Expected);

			Assert.assertEquals(actual, Expected, "Travel Question for QD Self is not Validated");
			System.out.println("Validation Question for Self is::::" + TravelQuestionQDSelf.getText());
			log.info("Travel Question for QD Self  is validated sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Travel Question for QD Self|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_the_Travel_Question_for_QD_application_for_Spouse() throws Throwable {
		try {
			log.debug("Validate Travel Question for QD Application Spouse");
			TravelQuestionQDSpouse.isDisplayed();

			String actual = TravelQuestionQDSpouse.getText();
			String Expected = PropertyUtility.Load_MessageFile_Data("TravelQuestionQD");

			System.out.println("********************Information***********************/n" + Expected);

			Assert.assertEquals(actual, Expected, "Travel Question for QD Spouse is  not  Validated");
			System.out.println("Validation Question for Self is::::" + TravelQuestionQDSpouse.getText());
			log.info("Travel Question for QD Self  is validated sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Travel Question for QD Spouse|| Fail" + e.getMessage());
			throw (e);
		}
	}

	// AAFP

	public boolean enters_WeightTwelveMonths_ago_details_for_Self_as(String Weight12mnths) throws Throwable {
		try {
			log.debug("Verify that WeightTwelveMonths ago value enters successfully");
			WeightTwelveMnth.sendKeys(Weight12mnths);
			log.info("WeightTwelveMonths ago entered sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to WeightTwelveMonths ago value for Self|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_Travel_Question_for_Non_QD_application_for_Spouse() throws Throwable {
		try {
			log.debug("Validate Travel Question for QD Application Spouse");
			TravelQuestionNONQDSpouse.isDisplayed();
			String actual = TravelQuestionNONQDSpouse.getText();
			String Expected = PropertyUtility.Load_MessageFile_Data("TravelQuestion");
			Assert.assertEquals(actual, Expected, "Travel Question for Non QD Spouse is Validated ");
			System.out.println("Validation Question for Spouse is::::" + TravelQuestionNONQDSpouse.getText());
			log.info("Travel Question for Spouse validated sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Travel Question|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Membership_ID_Required_Message() throws Throwable {
		try {
			log.debug("Validate Error Messege for MembershipId");
			reuseMethod.scrollDown(memberId);
			MemberIdErrorMessege.isDisplayed();

			String actual = MemberIdErrorMessege.getText();
			String Expected = PropertyUtility.Load_MessageFile_Data("MemberIdErrorText");
			Assert.assertEquals(actual, Expected, "Error Messege for MembershipId is Validated ");
			log.info("Error Messege for MembershipId validated sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Error Messege for MembershipId|| Fail" + e.getMessage());
			throw (e);
		}
	}

	// WAEPA_Contact page*******************************

	public boolean enter_contact_details_for_self_for_Child_only_policy_as(String SSN, String Mstatus, String Gender,
			String Street, String City, String Zip) throws Exception {
		try {
			log.debug("Enter contact details");
			// SocialSecurityNum.click();
			// SocialSecurityNum.sendKeys(SSN);

			SocialSecurityNum.clear();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('txtSsnSlf').value=\'" + SSN + "\';");
			Thread.sleep(2000);
			reuseMethod.dropDown(maritalStatus, Mstatus);
			Thread.sleep(1000);
			if (Gender.equalsIgnoreCase("Male")) {
				Male_Self.click();
			} else {
				Female_Self.click();
			}
			address.sendKeys(Street);
			city.sendKeys(City);
			ZipCode.clear();
			ZipCode.sendKeys(Zip);
			reuseMethod.scrollDown(Next);
			log.info("Contact details added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add contact details || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	/*
	 * public boolean enters_Spouse_details_as(String Sheight, String Sweight)
	 * throws Exception{ try { log.debug("Enter contact details for Spouse");
	 * 
	 * reuseMethod.dropDownselectbyvalue(Height_Spouse, Sheight);
	 * Weight_Spouse.sendKeys(Sweight); reuseMethod.scrollDown(Next);
	 * //HearAboutWAEPA_TV.click();
	 * log.info("Contact details for Spouse added successfully || Pass"); return
	 * true; }catch (Exception e) {
	 * log.error("Not able to add contact details || Fail"+e.getMessage());
	 * screenShotUtility.GetScreenShot(driver); throw(e); }
	 * 
	 * }
	 */

	// WAEPA
	public boolean enter_datails_for_Outside_US_country_and_How_Long_months_for_Spouse_as(String Country, String Months)
			throws Exception {
		try {
			log.debug("Enter Outside U.S Details for Spouse");
			reuseMethod.dropDown(OutsideUSCountry_Spouse, Country);
			HowLong_Spouse.sendKeys(Months);
			log.info("Outside U.S Details for Spouse details enter successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter Outside U.S Details for Spouse || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	public boolean enter_details_for_Outside_US_country_and_How_Long_months_for_Self_as(String Country, String Months)
			throws Exception {
		try {
			log.debug("Enter Outside U.S Details for Self");
			Thread.sleep(2000);
			reuseMethod.dropDown(OutsideUSCountry_Self, Country);
			HowLong_Self.sendKeys(Months);
			log.info("Outside U.S Details for Self details enter successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter Outside U.S Details for Self || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}
	
	public boolean enter_current_Account_NO_for_Self_as(String Acctno)
			throws Exception {
		try {
			log.debug("Enter Current Acct for Self");
			Thread.sleep(1000);
			CurrAccountNo.sendKeys(Acctno);
			log.info("Current Acct No for Self details enter successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter Current Acct No for Self || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}
	

	// ***************************END******************

	public boolean your_Contact_details_page_displayed_and_select_Business_and_select_YES_and_user_enters_details_as_Mobile(
			String Phtype, String Number, String Bsname, String Typebusiness) throws Exception {

		try {
			log.debug("Enter Your contact details of mobile application");
			reuseMethod.dropDown(PrimaryPhNumType, Phtype);
			mobSelfPrimaryPhNum.click();
			mobSelfPrimaryPhNum.sendKeys(Number);
			reuseMethod.scrollDown(mobExtension);
			mobBusiness.click();
			mobBusinessName.sendKeys(Bsname);
			reuseMethod.dropDown(mobBusinessType, Typebusiness);
			reuseMethod.scrollDown(mobBusinessType);
			mobSameAddressYes.click();

			log.info("Your Contact details of mobile page added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add Your contact details of mobile page || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean your_Contact_details_page_displayed_and_select_Home_and_user_enters_details_as_Mobile(String Phtype,
			String Number) throws Exception {

		try {
			log.debug("Enter Your contact details as Home in mobile application");
			if (mobSelfEmail.isDisplayed()) {
				if (reuseMethod.getemail() != null) {
					if (mobSelfEmail.getAttribute("value").isEmpty()) {
						mobSelfEmail.sendKeys(reuseMethod.getemail());
					}
				} else
					reuseMethod.RandomEmail(mobSelfEmail);
			}
			reuseMethod.dropDown(PrimaryPhNumType, Phtype);
			mobSelfPrimaryPhNum.click();
			mobSelfPrimaryPhNum.sendKeys(Number);
			reuseMethod.scrollDown(mobExtension);
			mobHome.click();

			log.info("Your Contact details as Home in mobile page added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add Your contact details of mobile page as Home || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean your_Contact_details_page_displayed_and_select_Business_and_select_NO_and_user_enters_details_as_Mobile(
			String Phtype, String Number, String Bsname, String Typebusiness, String Baddress) throws Exception {

		try {
			log.debug(
					"Enter Your contact details of mobile application when Residence and Business address are different");

			Thread.sleep(2000);
			if (mobSelfEmail.isDisplayed()) {
				if (reuseMethod.getemail() != null) {
					if (mobSelfEmail.getAttribute("value").isEmpty()) {
						mobSelfEmail.sendKeys(reuseMethod.getemail());
					}
				} else
					reuseMethod.RandomEmail(mobSelfEmail);
			}

			reuseMethod.dropDown(PrimaryPhNumType, Phtype);
			mobSelfPrimaryPhNum.click();
			mobSelfPrimaryPhNum.sendKeys(Number);
			reuseMethod.scrollDown(mobExtension);
			mobBusiness.click();
			mobBusinessName.sendKeys(Bsname);
			reuseMethod.dropDown(mobBusinessType, Typebusiness);
			reuseMethod.scrollDown(mobBusinessType);
			mobSameAddressNo.click();
			BusinessAddressSelf_Mob.click();
			Thread.sleep(500);
			BusinessAddressSelf_Mob.sendKeys(Baddress);
			reuseMethod.Select_value_by_Up_Down_arrow();

			log.info(
					"Your contact details of mobile application when Residence and Business address are different are filled successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to add Your contact details when Residence and Business address are different in mobile Site || Fail"
							+ e.getMessage());
			throw (e);
		}

	}

	public boolean spouse_Contact_details_page_displayed_and_user_enters_details_as_mobile(String SPhtype, String Sno)
			throws Exception {

		try {
			log.debug("Enter spouse contact details of mobile application");
			reuseMethod.RandomEmail(mobSpouseEmail);
			reuseMethod.dropDown(mobSpousePhoneType, SPhtype);
			reuseMethod.scrollDown(mobSpousePhoneType);
			mobSpousePrimaryPhNum.click();
			mobSpousePrimaryPhNum.sendKeys(Sno);
			Thread.sleep(2000);

			log.info("Spouse Contact details of mobile page added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add Spouse contact details of mobile page || Fail" + e.getMessage());
			throw (e);
		}

	}

	/*
	 * public boolean
	 * contact_Details_page_is_displayed_to_user_and_enters_contact_Details_for_self_as
	 * (String SocialSecurityNo, String MaritalStatus, String Height, String Weight,
	 * String Gender,String Wt12MonthAgo, String MemberId, String Address, String
	 * City, String Zip) throws Exception{
	 * 
	 * try { log.debug("Enter contact details for Self");
	 * SocialSecurityNum.sendKeys(SocialSecurityNo);
	 * reuseMethod.dropDown(maritalStatus, MaritalStatus); Thread.sleep(1000);
	 * reuseMethod.dropDownselectbyvalue(height,Height); weight.sendKeys(Weight);
	 * if(Gender.equalsIgnoreCase("Male")) { Male_Self.click(); } else {
	 * Female_Self.click(); }
	 * 
	 * try { if(WeightTwelveMnth.isDisplayed()) {
	 * WeightTwelveMnth.sendKeys(Wt12MonthAgo); } }catch(NoSuchElementException e) {
	 * System.out.println("Weight Before 12 months Field is Not Present"+e); }
	 * DriverLicenseNo.click(); OutsideUS06MonthNo.click(); SmokeNo.click();
	 * memberId.sendKeys(MemberId); reuseMethod.scrollDown(city);
	 * address.sendKeys(Address); city.sendKeys(City); ZipCode.sendKeys(Zip);
	 * reuseMethod.scrollDown(Next);
	 * 
	 * Residential.click(); log.info("Contact details added successfully || Pass");
	 * return true; }catch (Exception e) {
	 * log.error("Not able to add contact details || Fail"+e.getMessage());
	 * throw(e); }
	 * 
	 * }
	 */

	public boolean contact_Details_page_is_displayed_to_user_and_enters_contact_Details_for_self_complete_details_as(
			String SocialSecurityNo, String MaritalStatus, String Height, String Weight, String Gender, String MemberId,
			String Address, String City, String Zip) throws Exception {

		try {
			log.debug("Enter contact details");
			// SocialSecurityNum.sendKeys(SocialSecurityNo);
			SocialSecurityNum.clear();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('txtSsnSlf').value=\'" + SocialSecurityNo + "\';");
			reuseMethod.dropDown_select_byPartialText(maritalStatus, MaritalStatus);
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(height, Height);
			weight.sendKeys(Weight);
			reuseMethod.select_Single_value_Icon(MaleSelf_Text, Male_Self, Female_Self, Gender);
			reuseMethod.scrollDown(height);
			memberId.sendKeys(MemberId);
			reuseMethod.scrollDown(city);
			address.sendKeys(Address);
			city.sendKeys(City);
			ZipCode.clear();
			ZipCode.sendKeys(Zip);

			log.info("Contact details added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add contact details || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	public boolean enters_Contact_Details_for_Self_Without_SSN_as(String MaritalStatus, String Height, String Weight,
			String Gender, String MemberId, String Address, String City, String Zip) throws Exception {

		try {
			log.debug("Enter contact details for Self Without SSN");

			reuseMethod.dropDown_select_byPartialText(maritalStatus, MaritalStatus);
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(height, Height);
			weight.sendKeys(Weight);
			reuseMethod.select_Single_value_Icon(MaleSelf_Text, Male_Self, Female_Self, Gender);
			reuseMethod.scrollDown(height);
			memberId.sendKeys(MemberId);
			reuseMethod.scrollDown(city);
			address.sendKeys(Address);
			city.sendKeys(City);
			ZipCode.sendKeys(Zip);

			log.info("Contact details for Self Without SSN added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add contact details for Self Without SSN || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean enters_Contact_Details_for_Self_without_SSN_Height_and_Weight_as(String MaritalStatus, String Gender,String MemberId, String Address, String City, String Zip) throws Exception {

		try {
			log.debug("Enter contact details for Self without SSN, Height and Weight");

			reuseMethod.dropDownselectbyvalue(maritalStatus, MaritalStatus);
			Thread.sleep(1000);
			reuseMethod.select_Single_value_Icon(MaleSelf_Text, Male_Self, Female_Self, Gender);
			reuseMethod.scrollDown(height);
			memberId.sendKeys(MemberId);
			reuseMethod.scrollDown(city);
			address.sendKeys(Address);
			city.sendKeys(City);
			ZipCode.sendKeys(Zip);

			log.info("Contact details for Self without SSN, Height and Weight added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add contact details for Self without SSN, Height and Weight || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	public boolean enters_contact_Details_without_SSN_and_MemberId_for_Self_as(String MaritalStatus, String Height,
			String Weight, String Gender, String Address, String City, String Zip) throws Exception {

		try {
			log.debug("Enter contact details Without SSN and MemberId for Self");

			reuseMethod.dropDownselectbyvalue(maritalStatus, MaritalStatus);
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(height, Height);
			weight.sendKeys(Weight);
			reuseMethod.select_Single_value_Icon(MaleSelf_Text, Male_Self, Female_Self, Gender);
			reuseMethod.scrollDown(height);
			reuseMethod.scrollDown(city);
			address.sendKeys(Address);
			city.sendKeys(City);
			ZipCode.clear();
			ZipCode.sendKeys(Zip);

			log.info("Contact details Without SSN and MemberId for Self added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add contact details Without SSN and MemberId || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	public boolean enters_SSN_for_Self(String SocialSecurityNo) throws Exception {

		try {
			log.debug("Enter SSN for Self");
			// SocialSecurityNum.sendKeys(SocialSecurityNo);
			SocialSecurityNum.clear();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('txtSsnSlf').value=\'" + SocialSecurityNo + "\';");


			log.info("SSN for Self is entered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter SSN for Self || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	public boolean enters_Optional_Ssn_for_Self(String SocialSecurityNo) throws Exception {

		try {
			log.debug("Enter Optional SSN for Self");

			SSNSelf_Optional.clear();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('txtOptionalSsnSlf').value=\'" + SocialSecurityNo + "\';");

			log.info("Optional SSN for Self is entered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter Optional SSN for Self || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	public boolean enters_Optional_Ssn_for_Spouse(String SocialSecurityNo) throws Exception {

		try {
			log.debug("Enter Optional SSN for Spouse");

			SSNSpouse_Optional.clear();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('txtOptionalSsnSps').value=\'" + SocialSecurityNo + "\';");

			log.info("Optional SSN for Spouse is entered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter Optional SSN for Spouse || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	

	public boolean enters_contact_Details_for_Self_without_MemberShipID_as(String SocialSecurityNo,
			String MaritalStatus, String Height, String Weight, String Gender, String Address, String City, String Zip)
			throws Exception {

		try {
			log.debug("Enter contact details");
			// SocialSecurityNum.sendKeys(SocialSecurityNo);
			SocialSecurityNum.clear();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('txtSsnSlf').value=\'" + SocialSecurityNo + "\';");

			reuseMethod.dropDown(maritalStatus, MaritalStatus);
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(height, Height);
			weight.sendKeys(Weight);

			if (Gender.equalsIgnoreCase("Male")) {
				Male_Self.click();
			} else {
				Female_Self.click();
			}

			reuseMethod.scrollDown(city);
			address.sendKeys(Address);
			city.sendKeys(City);
			ZipCode.clear();
			ZipCode.sendKeys(Zip);
			reuseMethod.scrollDown(Residential);
			/*
			 * reuseMethod.dropDownselectbyvalue(PrimaryPhNumType,PrimaryPhType);
			 * PrimaryPhNum.sendKeys(PrimaryPhNo);
			 */

			log.info("Contact details added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add contact details || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	public boolean enters_contact_Details_for_Self_without_MemberShipID_Mstatus_as(String SocialSecurityNo,
			String Height, String Weight, String Gender, String Address, String City, String Zip) throws Exception {

		try {
			log.debug("Enter contact details");
			// SocialSecurityNum.sendKeys(SocialSecurityNo);
			SocialSecurityNum.clear();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('txtSsnSlf').value=\'" + SocialSecurityNo + "\';");

			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(height, Height);
			weight.sendKeys(Weight);

			if (Gender.equalsIgnoreCase("Male")) {
				Male_Self.click();
			} else {
				Female_Self.click();
			}

			reuseMethod.scrollDown(city);
			address.sendKeys(Address);
			city.sendKeys(City);
			ZipCode.clear();
			ZipCode.sendKeys(Zip);
			log.info("Contact details added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add contact details || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	public boolean enters_Membership_ID_as_for_Self(String MembershipId) throws Exception {

		try {
			log.debug("Enter Membership Id in Contact Page");
			memberId.isDisplayed();
			reuseMethod.scrollDown(memberId);
			memberId.sendKeys(MembershipId);
			log.info("Membership Id in Contact Page is entered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Enter Membership Id in Contact Page || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	/*
	 * public boolean
	 * answer_Driving_Licence_Question_as_YES_and_enters_contact_Details_for_self_as
	 * (String SSN_NO, String Marital_status, String Height,String Weight,String
	 * Gender,String Weightbefore_year, String License_NO, String State, String
	 * MemberId, String Street_Address, String City, String Zip, String PhoneType,
	 * String PhoneNumber) throws Exception{
	 * 
	 * try {
	 * 
	 * log.debug("Enter contact details with Driver details.");
	 * SocialSecurityNum.click(); SocialSecurityNum.sendKeys(SSN_NO);
	 * Thread.sleep(2000); reuseMethod.dropDown(maritalStatus, Marital_status);
	 * Thread.sleep(1000); reuseMethod.dropDownselectbyvalue(height,Height);
	 * weight.sendKeys(Weight); if(Gender.equalsIgnoreCase("Male")) {
	 * Male_Self.click(); }else { Female_Self.click(); } try {
	 * if(WeightTwelveMnth.isDisplayed()) {
	 * WeightTwelveMnth.sendKeys(Weightbefore_year); } }catch(NoSuchElementException
	 * e) { System.out.println("Weight Before 12 months Field is Not Present"+e); }
	 * 
	 * reuseMethod.scrollDown(memberId); DriverLicenseYes.click();
	 * License_num.sendKeys(License_NO);
	 * reuseMethod.dropDownselectbyvalue(License_state, State);
	 * OutsideUS06MonthNo.click(); SmokeNo.click(); memberId.sendKeys(MemberId);
	 * address.sendKeys(Street_Address); city.sendKeys(City); ZipCode.sendKeys(Zip);
	 * reuseMethod.dropDown(PrimaryPhNumType, PhoneType);
	 * PrimaryPhNum.sendKeys(PhoneNumber); Residential.click();
	 * log.info("Contact page with driver details are entered successfully || Pass"
	 * ); return true; }catch (Exception e) {
	 * log.error("Not able to add contact page with driver details || Fail"+e.
	 * getMessage()); throw(e);
	 * 
	 * } }
	 */
	// AAFP

	public boolean select_DrivingLicense_Question_as_Yes_and_Enters_details_for_Self_as(String DrivingLicenseNo,
			String DrivingLicenseState) throws Exception {

		try {

			log.debug("Enter contact details with Driver details.");
			DriverLicenseYes.click();
			License_num.sendKeys(DrivingLicenseNo);
			reuseMethod.dropDownselectbyvalue(License_state, DrivingLicenseState);

			log.info("Contact page with driver details are entered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add contact page with driver details || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean select_DrivingLicense_Question_as_Yes_and_Enters_details_for_Spouse_as(String DrivingLicenseNo,
			String DrivingLicenseState) throws Exception {

		try {

			log.debug("Enter contact details with Driver details.");
			DriverLicenseYes_Spouse.click();
			LicenseNum_Spouse.sendKeys(DrivingLicenseNo);
			reuseMethod.dropDownselectbyvalue(LicenseState_Spouse, DrivingLicenseState);

			log.info("Contact page with driver details are entered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add contact page with driver details || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean enters_contact_Details_for_Spouse_as(String SSN_Spouse, String SHeight, String SWeight,
			String Gender, String SPhoneType, String SPhoneNum) throws Exception {

		try {
			log.debug("Enter contact details for Spouse");
			// Ssn_Spouse.click();
			// Ssn_Spouse.sendKeys(SSN_Spouse);

			Ssn_Spouse.clear();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('txtSsnSps').value=\'" + SSN_Spouse + "\';");

			Thread.sleep(2000);
			reuseMethod.dropDownselectbyvalue(Height_Spouse, SHeight);
			Weight_Spouse.sendKeys(SWeight);
			reuseMethod.select_Single_value_Icon(Male_SpouseText, Male_Spouse, Female_Spouse, Gender);
			reuseMethod.scrollDown(Male_SpouseText);
			reuseMethod.dropDown(PrimaryPhNumType_Spouse, SPhoneType);
			PrimaryPhNum_Spouse.sendKeys(SPhoneNum);

			log.info("Contact details for Spouse are added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add contact details for Spouse || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_that_Height_is_not_displayed_for_Self() throws Throwable {
		try {
			log.debug("Verify the Height is not displayed for Self");
			boolean check = height.isDisplayed();
			Assert.assertFalse(check, "Bug||Height is displayed for Self");

			log.info("Height is not displayed for Self");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Height is not displayed for Self**********");
			log.error("Unable to validate that Height is not displayed for Self || Fail");
			return false;
		}

	}

	public boolean validates_that_Weight_is_not_displayed_for_Self() throws Throwable {
		try {
			log.debug("Verify the Weight is not displayed for Self");
			boolean check = weight.isDisplayed();
			Assert.assertFalse(check, "Bug||Weight is displayed for Self");
			log.info("Weight is not displayed for Self");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Weight is not displayed for Self**********");
			log.error("Unable to validate that Weight is not displayed for Self || Fail");
			return false;
		}

	}

	public boolean validates_that_Height_is_not_displayed_for_Spouse() throws Throwable {
		try {
			log.debug("Verify the Height is not displayed for Spouse");
			boolean check = Height_Spouse.isDisplayed();
			Assert.assertFalse(check, "Bug||Height is displayed for Spouse");

			log.info("Height is not displayed for Spouse");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Height is not displayed for Spouse**********");
			log.error("Unable to validate that Height is not displayed for Spouse|| Fail");
			return false;
		}

	}

	public boolean validates_that_Weight_is_not_displayed_for_Spouse() throws Throwable {
		try {
			log.debug("Verify the Weight is not displayed for Spouse");
			boolean check = Weight_Spouse.isDisplayed();
			Assert.assertFalse(check, "Bug||Weight is displayed for Spouse");
			log.info("Weight is not displayed for Spouse");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Weight is not displayed for Spouse**********");
			log.error("Unable to validate that Weight is not displayed for Spouse || Fail");
			return false;
		}

	}

	// AAFP
	public boolean enters_contact_Details_for_Spouse_with_SSN_and_MembershipID_as(String SSN_Spouse, String SHeight,
			String SWeight, String SSex, String SMembershipID, String SPhoneType, String SPhoneNum) throws Exception {

		try {
			log.debug("Enter contact details for Spouse with SSN and MembershipID");
			// Ssn_Spouse.click();
			// Ssn_Spouse.sendKeys(SSN_Spouse);

			Ssn_Spouse.clear();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('txtSsnSps').value=\'" + SSN_Spouse + "\';");
			Thread.sleep(2000);
			reuseMethod.dropDownselectbyvalue(Height_Spouse, SHeight);
			Weight_Spouse.sendKeys(SWeight);
			reuseMethod.select_Single_value_Icon(Male_SpouseText, Male_Spouse, Female_Spouse, SSex);
			reuseMethod.scrollDown(Male_SpouseText);
			MemberId_Spouse.sendKeys(SMembershipID);
			if(SPhoneType.equalsIgnoreCase("Cell"))
			{
				reuseMethod.dropDownselectbyvalue(PrimaryPhNumType_Spouse, SPhoneType);	
			}
			else
			{
			reuseMethod.dropDown(PrimaryPhNumType_Spouse, SPhoneType);
			}
			PrimaryPhNum_Spouse.sendKeys(SPhoneNum);

			log.info("Contact details for Spouse with SSN and MembershipID are added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add contact details for Spouse with SSN and MembershipID || Fail" + e.getMessage());
			throw (e);
		}

	}
	
	public boolean enters_MembershipID_for_Spouse_as(String SMembershipID) throws Exception {

		try {
			log.debug("Enter MembershipID for Spouse");
			
			Thread.sleep(2000);
			reuseMethod.scrollDown(MemberId_Spouse);
			MemberId_Spouse.clear();
			MemberId_Spouse.sendKeys(SMembershipID);
			

			log.info("Entered MembershipID for Spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter MembershipID for Spouse || Fail" + e.getMessage());
			throw (e);
		}

	}

	/*public boolean answer_all_other_questions_as_No_for_Spouse() throws Exception {

		try {
			log.debug("Answer Additional Questions as NO for Spouse");

			try {
				if (DriverLicenseNo_Spouse.isDisplayed()) {
					DriverLicenseNo_Spouse.click();
				}
			} catch (NoSuchElementException e) {
				System.out.println("Driver Question is Not Present for Spouse" + e);
			}
			try {
				if (OutsideUS06MonthNo_Spouse.isDisplayed()) {
					OutsideUS06MonthNo_Spouse.click();
				}
			} catch (NoSuchElementException e) {
				System.out.println("Outside US for Six Month Radio Button is Not Present for Spouse" + e);
			}

			SmokeNo_Spouse.click();

			log.info("Additional Questions as NO for Spouse are selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Answer Additional Questions as NO for Spouse|| Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}*/

	public boolean answer_for_Outside_the_US_or_Canada_in_the_next_twelve_months_for_Spouse() throws Exception {

		try {
			log.debug("Answer for Outside the US or Canada in the next twelve months for Spouse");
			OutsideUS12MonthNo_Spouse.isDisplayed();
			OutsideUS12MonthNo_Spouse.click();

			log.info(
					"Answer for Outside the US or Canada in the next twelve months for Spouse are selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Answer Answer for Outside the US or Canada in the next twelve months for Spouse|| Fail"
							+ e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	public boolean answer_all_other_questions_of_Spouse_as_No_for_Nicotin_and_Outside_US_Twelve() throws Exception {

		try {
			log.debug("Answer all other questions of Spouse as No for Nicotin and Outside US Twelve");
			OutsideUS12MonthNo_Spouse.click();
			SmokeNo_Spouse.click();

			log.info(
					"Additional Questions as NO for Spouse for Nicotin and Outside US 12 are selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Answer Additional Questions as NO  for Nicotin and Outside US 12 for Spouse|| Fail"
					+ e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	/*
	 * public boolean enters_contact_Details_for_Spouse_as_Waepa(String SHeight,
	 * String SWeight, String SPhoneType, String SPhoneNum,String Sgender,String
	 * SOutside) throws Exception{
	 * 
	 * try { log.debug("Enter contact details for Spouse for Waepa");
	 * 
	 * reuseMethod.dropDownselectbyvalue(Height_Spouse,SHeight);
	 * Weight_Spouse.sendKeys(SWeight);
	 * reuseMethod.select_Single_value_Icon(Male_SpouseText,
	 * Male_Spouse,Female_Spouse, Sgender);
	 * reuseMethod.selectSinglevalue(OutsideUS12MonthNo_Spouse,
	 * OutsideUS12MonthYes_Spouse, SOutside); reuseMethod.scrollDown(Next);
	 * reuseMethod.dropDownselectbyvalue(PrimaryPhNumType_Spouse,SPhoneType);
	 * PrimaryPhNum_Spouse.sendKeys(SPhoneNum);
	 * 
	 * log.
	 * info("Contact details for Spouse are added for Waepa successfully || Pass");
	 * return true; }catch (Exception e) {
	 * log.error("Not able to add contact details for Spouse for Waepa || Fail"+e.
	 * getMessage()); throw(e); }
	 * 
	 * }
	 */

	public boolean enters_contact_Details_for_Spouse_as_minimum_details(String SSN_Spouse, String Gender,
			String SPhoneType, String SPhoneNum) throws Exception {

		try {
			log.debug("Enter contact details for Spouse for Accidental Death Product");
			// Ssn_Spouse.click();
			// Ssn_Spouse.sendKeys(SSN_Spouse);

			Ssn_Spouse.clear();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('txtSsnSps').value=\'" + SSN_Spouse + "\';");
			Thread.sleep(2000);
			reuseMethod.select_Single_value_Icon(Male_SpouseText, Male_Spouse, Female_Spouse, Gender);
			reuseMethod.scrollDown(Next);
			reuseMethod.dropDown(PrimaryPhNumType_Spouse, SPhoneType);
			PrimaryPhNum_Spouse.sendKeys(SPhoneNum);

			log.info("Contact details for Spouse for Accidental Death Product are added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to add contact details for Spousefor Accidental Death Product || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean contact_Details_page_is_displayed_to_user_and_enters_contact_Details_for_self_without_height_weight_as(
			String SSN, String Mstatus, String Gender_Self, String MembershipID, String Street, String City, String Zip)
			throws Exception {

		try {
			log.debug("Enter contact details");
			// SocialSecurityNum.click();
			// SocialSecurityNum.sendKeys(SSN);

			SocialSecurityNum.clear();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('txtSsnSlf').value=\'" + SSN + "\';");

			Thread.sleep(2000);
		
			reuseMethod.dropDown_select_byPartialText(maritalStatus, Mstatus);
			Thread.sleep(1000);
			reuseMethod.select_Single_value_Icon(MaleSelf_Text, Male_Self, Female_Self, Gender_Self);
			reuseMethod.scrollDown(memberId);
			memberId.sendKeys(MembershipID);
			reuseMethod.scrollDown(city);
			address.sendKeys(Street);
			city.sendKeys(City);
			ZipCode.clear();
			ZipCode.sendKeys(Zip);

			log.info("Contact details added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add contact details || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean contact_Details_page_is_displayed_to_user_and_enters_contact_Details_for_self_Without_MemberID_and_Weight_as(
			String SSN, String Mstatus, String gender, String Street, String City, String Zip) throws Exception {

		try {
			log.debug("Enter contact details");
			// SocialSecurityNum.click();
			// SocialSecurityNum.sendKeys(SSN);

			SocialSecurityNum.clear();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('txtSsnSlf').value=\'" + SSN + "\';");

			Thread.sleep(2000);
			reuseMethod.dropDown(maritalStatus, Mstatus);

			Thread.sleep(1000);
			reuseMethod.select_Single_value_Icon(MaleSelf_Text, Male_Self, Female_Self, gender);
			// reuseMethod.selectSinglevalue(WaepaMale_Self, WaepaFemale_Self, gender);
			address.sendKeys(Street);
			city.sendKeys(City);
			ZipCode.clear();
			ZipCode.sendKeys(Zip);
			log.info("Contact details added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add contact details || Fail" + e.getMessage());
			throw (e);
		}

	}
	
	public boolean enters_contact_Details_for_self_Without_MemberID_Height_Weight_and_Mstatus_as(String SSN,String gender, String Street, String City, String Zip) throws Exception {

		try {
			log.debug("Enter contact details");
			// SocialSecurityNum.click();
			// SocialSecurityNum.sendKeys(SSN);

			SocialSecurityNum.clear();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('txtSsnSlf').value=\'" + SSN + "\';");
			Thread.sleep(2000);
			
			reuseMethod.select_Single_value_Icon(MaleSelf_Text, Male_Self, Female_Self, gender);
			// reuseMethod.selectSinglevalue(WaepaMale_Self, WaepaFemale_Self, gender);
			address.sendKeys(Street);
			city.sendKeys(City);
			ZipCode.clear();
			ZipCode.sendKeys(Zip);
			log.info("Contact details added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add contact details || Fail" + e.getMessage());
			throw (e);
		}

	}
	
	public boolean enters_contact_Details_for_self_Without_SSN_MemberID_Height_Weight_and_Mstatus_as(String gender, String Street, String City, String Zip) throws Exception {

		try {
			log.debug("Enter contact details");
					
			reuseMethod.select_Single_value_Icon(MaleSelf_Text, Male_Self, Female_Self, gender);
			// reuseMethod.selectSinglevalue(WaepaMale_Self, WaepaFemale_Self, gender);
			address.sendKeys(Street);
			city.sendKeys(City);
			ZipCode.clear();
			ZipCode.sendKeys(Zip);
			log.info("Contact details added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add contact details || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean waepa_Contact_Details_page_is_displayed_to_user_and_enter_contact_Details_for_self_as(String SSN,
			String Mstatus, String Height, String Weight, String Street, String City, String Zip) throws Exception {
		try {
			log.debug("Enter contact details for WAEPA");
			// SocialSecurityNum.click();
			// SocialSecurityNum.sendKeys(SSN);

			SocialSecurityNum.clear();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('txtSsnSlf').value=\'" + SSN + "\';");

			Thread.sleep(2000);
			reuseMethod.dropDown(maritalStatus, Mstatus);
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(height, Height);
			weight.sendKeys(Weight);
			reuseMethod.scrollDown(city);
			address.sendKeys(Street);
			city.sendKeys(City);
			ZipCode.clear();
			ZipCode.sendKeys(Zip);

			log.info("Contact details added successfully for WAEPA || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add contact details for WAEPA|| Fail" + e.getMessage());
			throw (e);
		}
	}

	// AAFP-ContactPage

	public boolean Clicks_on_TV_checkbox() throws Exception {
		try {
			log.debug("Select Promotion as TV for WAEPA");
			tv_checkbox.click();
			log.info("Selected Promotion as TV for WAEPA|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select Promotion as TV for WAEPA|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean Clicks_on_Family_checkbox() throws Exception {
		try {
			log.debug("Select Promotion as Family for WAEPA");
			FamilyCheck.click();
			log.info("Selected Promotion as Family for WAEPA|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select Promotion as Family for WAEPA|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Yes_Radio_button_for_Tobacco_Question() throws Exception {
		try {
			log.debug("Select Yes Radio Button for Tobacco Question");
			SmokeYes.click();
			Thread.sleep(3000);
			log.info("Yes Radio Button for Tobacco Question is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Yes Radio Button for Tobacco Question|| Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean validates_Last_Used_Date_Textbox_and_Specify_the_products_used_Textbox_is_displayed()
			throws Exception {
		try {
			log.debug("Last used date and Product Used Textbox are Displayed");
			LastSmokingDate.isDisplayed();
			Product_used.isDisplayed();
			log.info("Last used date and Product Used Textbox are Displayed Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Last used date and Product Used Textbox|| Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean selects_Yes_Radio_button_for_Tobacco_Question_for_Spouse() throws Exception {
		try {
			log.debug("Select Yes Radio Button for Spouse  Tobacco Question");
			SmokeYes_Spouse.click();
			Thread.sleep(3000);
			log.info("Yes Radio Button for Spouse  Tobacco Question is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Yes Radio Button for Spouse Tobacco Question|| Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean validates_Last_Used_Date_Textbox_and_Specify_the_products_used_Textbox_is_displayed_for_Spouse()
			throws Exception {
		try {
			log.debug("Last used date and Product Used Textbox are Displayed for Spouse");
			LastSmokingDate_Spouse.isDisplayed();
			ProductUsed_Spouse.isDisplayed();
			log.info("Last used date and Product Used Textbox are Displayed for Spouse Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Last used date and Product Used Textbox for Spouse|| Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean enters_Last_Used_Tobacco_Date_Details_for_Self_as(String date) throws Exception {
		try {
			log.debug("Enter Last used date for Tobacco or Nicotine Product for Self ");
			LastSmokingDate.isDisplayed();
			LastSmokingDate.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			if (date.contains("SYSDATE") || date.contains("SYSDate") || date.contains("SYSdate")) {
				String date1 = reuseMethod.Enter_customized_previous_Date(date);
				Thread.sleep(1000);
				LastSmokingDate.click();
				LastSmokingDate.sendKeys(date1);

			}
			else if (date.equalsIgnoreCase("CurrentDate")) {
				Thread.sleep(1000);
				LastSmokingDate.click();
				String nDate=reuseMethod.Enter_Current_System_Date();
				nDate=nDate.substring(0, 2)+"/"+nDate.substring(2, 4)+"/"+nDate.substring(4, nDate.length());
				LastSmokingDate.sendKeys(nDate);
			} else if(!date.contains("/")){
				
				LastSmokingDate.click();
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				LastSmokingDate.sendKeys(date);
			}
			
			else
			{
				
				LastSmokingDate.click();
				LastSmokingDate.sendKeys(date);
				Thread.sleep(1000);
			}
			LastSmokingDate.click();

			log.info("Last used date for Nicotine Product for Self is entered Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter the Last used date for Nicotine Product for Self || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_on_Products_used_textbox_for_Self_and_Selects_Product_as(String product) throws Exception {
		try {
			log.debug("Enter Tobacco or Nicotine Product for Self ");
			Product_used.isDisplayed();
			Product_used.sendKeys(product);
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ENTER).build().perform();
			action.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(2000);
			//address.click();
			//Product_used_text.click();
			log.info(" Nicotine Product for Self is entered Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter the Nicotine Product for Self || Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean enters_Last_Used_Tobacco_Date_Details_for_Spouse_as(String date) throws Exception {
		try {
			log.debug("Enter Last used date for Tobacco or Nicotine Product for Self ");
			LastSmokingDate_Spouse.isDisplayed();
			LastSmokingDate_Spouse.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			if (date.contains("SYSDATE") || date.contains("SYSDate") || date.contains("SYSdate")) {
				String date1 = reuseMethod.Enter_customized_previous_Date(date);
				Thread.sleep(1000);
				LastSmokingDate_Spouse.click();
				LastSmokingDate_Spouse.sendKeys(date1);

			}
			else if (date.equalsIgnoreCase("CurrentDate")) {
				Thread.sleep(1000);
				LastSmokingDate_Spouse.click();
				String nDate=reuseMethod.Enter_Current_System_Date();
				nDate=nDate.substring(0, 2)+"/"+nDate.substring(2, 4)+"/"+nDate.substring(4, date.length());
				LastSmokingDate_Spouse.sendKeys(nDate);
			} 
			
			else if(!date.contains("/")) {
				Thread.sleep(1000);
				LastSmokingDate_Spouse.click();
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				LastSmokingDate_Spouse.sendKeys(date);
				Thread.sleep(1000);
			}
			
			else
			{
				Thread.sleep(1000);
				LastSmokingDate_Spouse.click();
				LastSmokingDate_Spouse.sendKeys(date);

			}
			LastSmokingDate_Spouse.click();
			log.info("Last used date for Nicotine Product for Self is entered Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter the Last used date for Nicotine Product for Self || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_on_Products_used_textbox_for_Spouse_and_Selects_Product_as(String product) throws Exception {
		try {
			log.debug("Enter Tobacco or Nicotine Product for Self ");
			ProductUsed_Spouse.isDisplayed();
			ProductUsed_Spouse.sendKeys(product);
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1000);
			action.sendKeys(Keys.TAB).build().perform();
			// PrimaryPhNum_Spouse.click();

			Weight_Spouse.click();

			log.info(" Nicotine Product for Self is entered Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter the Nicotine Product for Self || Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean selects_No_Radio_button_for_Tobacco_Question_Self() throws Exception {
		try {
			log.debug("Select No Radio Button for Tobacco Question for Self");
			SmokeNo.click();
			Thread.sleep(1000);
			log.info("No Radio Button for Tobacco Question Self is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click  No Radio Button for Tobacco Question Self|| Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean selects_No_Radio_button_for_Tobacco_Question_Spouse() throws Exception {
		try {
			log.debug("Select No Radio Button for Tobacco Question for Spouse");
			SmokeNo_Spouse.click();
			Thread.sleep(1000);
			log.info("No Radio Button for Tobacco Question Spouse is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click  No Radio Button for Tobacco Question Spouse|| Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean selects_Residential_Radio_Button() throws Exception {
		try {
			log.debug("Select Residential Radio Button");
			Thread.sleep(2000);
			reuseMethod.scrollDown(PrimaryPhNumType);
			Residential.click();
			log.info("Residential Radio Button is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Residential Radio Button|| Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean selects_Yes_Radio_Button_for_Business_Address() throws Exception {
		try {
			log.debug("Select Business Address Radio Button");
			Thread.sleep(4000);
			BusinessAddress_YES.click();
			log.info(" Business Address  Radio Button is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to  Business Address  Radio Button|| Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean selects_NO_Radio_Button_for_Business_Address() throws Exception {
		try {
			log.debug("Select Business Address Radio Button same as Above as NO");
			Thread.sleep(1500);
			BusinessAddress_NO.click();
			Thread.sleep(1000);
			log.info(" Business Address NO  Radio Button is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to  Business Address  Radio Button as NO|| Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean selects_Business_Address_Radio_Button_for_Send_Correspondence_To() throws Exception {
		try {
			log.debug("Select Business Address Radio Button");
			reuseMethod.scrollDown(BusinessAddress);
			
			BusinessAddress.click();
			log.info(" Business Address Radio Button is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to  Business Address  Radio Button|| Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean enters_Business_Details_as(String BussinessName, String BusinessType) throws Exception {
		try {
			log.debug("Enter Business Details");
			Business_Name.sendKeys(BussinessName);
			reuseMethod.dropDownselectbyvalue(Business_Type, BusinessType);
			log.info(" Business details are entered Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter Business details|| Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean enters_Business_Address_Details_as(String BStreet, String BCity, String BState, String BZipcode)
			throws Exception {
		try {
			log.debug("Enter Business Address Details");
			BusinessAddress_Street.sendKeys(BStreet);
			BusinessAddress_City.sendKeys(BCity);
			reuseMethod.dropDownselectbyvalue(BusinessAddress_State, BState);
			BusinessAddress_Zip.sendKeys(BZipcode);
			log.info(" Business Address details are entered Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter Business Address details|| Fail" + e.getMessage());

			throw (e);
		}
	}
	
	

	public boolean selects_Yes_for_Travel_Question_Non_QD_for_Self() throws Exception {
		try {
			log.debug("Select Yes radio Button for NON QD Travel Question for Self");
			OutsideUS12MonthYes.isDisplayed();
			OutsideUS12MonthYes.click();
			log.info("NON QD Travel Question for Self Radio Button is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select NON QD Travel Question for Self Radio Button|| Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean selects_No_for_Travel_Question_Non_QD_for_Self() throws Exception {
		try {
			log.debug("Select No radio Button for NON QD Travel Question for Self");
			OutsideUS12MonthNo.isDisplayed();
			OutsideUS12MonthNo.click();
			log.info("NON QD Travel Question for Self NO Radio Button is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select NON QD Travel Question for Self Radio Button|| Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean selects_Yes_for_Travel_Question_Non_QD_for_Spouse() throws Exception {
		try {
			log.debug("Select Yes radio Button for NON QD Travel Question for Spouse");
			OutsideUS12MonthYes_Spouse.click();
			log.info("NON QD Travel Question for Spouse Radio Button is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select NON QD Travel Question for Spouse Radio Button|| Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean selects_No_for_Travel_Question_Non_QD_for_Spouse() throws Exception {
		try {
			log.debug("Select No radio Button for NON QD Travel Question for Spouse");
			OutsideUS12MonthNo_Spouse.isDisplayed();
			OutsideUS12MonthNo_Spouse.click();
			log.info("NON QD Travel Question for Spouse Radio Button is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select NON QD Travel Question for Spouse Radio Button|| Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean selects_Yes_for_Travel_Question_QD_for_Spouse() throws Exception {
		try {
			log.debug("Select Yes radio Button for QD Travel Question for Spouse");
			OutsideUS06MonthYes_Spouse.click();
			log.info("QD Travel Question for Spouse Radio Button is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select QD Travel Question for Spouse Radio Button|| Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean selects_Yes_for_Travel_Question_QD_for_Self() throws Exception {
		try {

			log.debug("Select Yes radio Button for QD Travel Question for Self");
			OutsideUS06MonthYes.click();
			log.info("QD Travel Question for Self Radio Button is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select QD Travel Question for Self Radio Button|| Fail" + e.getMessage());

			throw (e);
		}
	}

	// AAFP

	public boolean select_No_for_Travel_Question_SixMonths_for_Self() throws Exception {
		try {
			log.debug("Select Yes radio Button for OutsideUSCountry SixMonth Question for Self");
			OutsideUSCountry_SixMonth_NO_Self.click();
			log.info("OutsideUSCountry SixMonth Question for Self Radio Button is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select OutsideUSCountry SixMonth Question for Self Radio Button|| Fail"
					+ e.getMessage());

			throw (e);
		}
	}

	public boolean select_DrivingLicense_Question_as_No_for_Spouse() throws Exception {
		try {
			log.debug("Select Driving License Question as No for Spouse");
			DriverLicenseNo_Spouse.click();
			log.info("DrivingLicense Question as No for Spouse selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select DrivingLicense Question as No for Spouse || Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean selects_No_Radio_button_for_Driving_Licensing_Question_for_Self() throws Exception {
		try {
			log.debug("Select Driving License Question as No for Self");
			DriverLicenseNo.click();
			log.info("DrivingLicense Question as No for Self selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select DrivingLicense Question as No for Self || Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean selects_No_for_Travel_Question_TwelveMonths_for_Spouse() throws Exception {
		try {
			log.debug("Select No for Travel Question-TwelveMonths for Spouse");
			OutsideUS12MonthNo_Spouse.click();
			log.info("No for Travel Question-TwelveMonths for Spouse select Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select No for Travel Question-TwelveMonths for Spouse || Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean select_No_for_Travel_Question_SixMonths_for_Spouse() throws Exception {
		try {
			log.debug("Select No for Travel Question-SixMonths for Spouse");
			OutsideUS06MonthNo_Spouse.click();
			log.info("No for Travel Question-SixMonths for Spouse select Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select No for Travel Question-SixMonths for Spouse || Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean enters_WeightTwelveMonths_ago_details_for_Spouse_as(String S12mnthsWeight) throws Exception {
		try {
			log.debug("Enters Weight Twelve Months ago_details_for_Spouse");
			WeightTwelveMnth_Spouse.sendKeys(S12mnthsWeight);
			log.info("Enters Weight Twelve Months ago is selected for Spouse Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Enters Weight Twelve Months ago details for Spouse || Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean enters_details_for_Spouse_as(String Country, String Month) throws Exception {
		try {
			log.debug("Enter travel Question details for Spouse");

			reuseMethod.dropDownselectbyvalue(CountrySpouse, Country);
			MonthsSpouse.sendKeys(Month);
			log.info("Travel Question details for Spouse are entered Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter travel Question details for Spouse|| Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean selects_Yes_for_Travel_Question_QD_and_Enters_details_as_Spouse(String Country) throws Exception {
		try {
			log.debug("Enter travel Question Country for Spouse QD");

			reuseMethod.dropDownselectbyvalue(CountrySpouseQD, Country);

			log.info("Travel Question details for Spouse QD are entered Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter travel Question details for Spouse QD|| Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean selects_Yes_for_Travel_Question_QD_and_Enters_details_as_Self(String Country) throws Exception {
		try {
			log.debug("Enter travel Question Country for Self QD");

			reuseMethod.dropDownselectbyvalue(CountrySelfQD, Country);

			log.info("Travel Question details for Self QD are entered Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter travel Question details for Self QD|| Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean enters_contact_Details_for_Spouse_as_without_SSN(String SGender, String SHeight, String SWeight,
			String SPhoneType, String SPhoneNum) throws Exception {

		try {
			log.debug("Enter contact details for Spouse for without SSN");

			Thread.sleep(1000);
			reuseMethod.select_Single_value_Icon(Male_SpouseText, Male_Spouse, Female_Spouse, SGender);
			 reuseMethod.scrollDown(Height_Spouse);
			reuseMethod.dropDownselectbyvalue(Height_Spouse, SHeight);
			Weight_Spouse.sendKeys(SWeight);
			reuseMethod.scrollDown(Weight_Spouse);
			if(SPhoneType.equalsIgnoreCase("Cell"))
			{reuseMethod.dropDownselectbyvalue(PrimaryPhNumType_Spouse, SPhoneType);
			
			}
			else
			{
			reuseMethod.dropDown(PrimaryPhNumType_Spouse, SPhoneType);
			}
			PrimaryPhNum_Spouse.sendKeys(SPhoneNum);

			log.info("Contact details for Spouse without SSN are added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add contact details for Spouse without SSN || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean enters_SSN_as_for_Spouse(String SSN) throws Exception {

		try {
			log.debug("Enter SSN in Contact Page for Spouse");

			// Ssn_Spouse.click();
			// Ssn_Spouse.sendKeys(SSN);
			Ssn_Spouse.clear();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('txtSsnSps').value=\'" + SSN + "\';");
			Thread.sleep(2000);
			log.info(" SSN in Contact Page is entered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Enter Membership Id in Contact Page || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	public boolean selects_Frequency_as_at_contact_page(String PaymentFrequency) throws Exception {

		try {
			log.debug("Enter frequency details at contact page of ACS site for Self");

			reuseMethod.scrollDown(memberId);

			reuseMethod.dropDownselectbyvalue(PayFrequency, PaymentFrequency);

			log.info("Frequency details at contact page added for Self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add frequency details at contact page for Self || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean validates_SSN_Required_Message_for_Spouse() throws Throwable {
		try {
			log.debug("Validate Error Message for SSN for Spouse");
			reuseMethod.scrollDown(SSNMessage_Spouse);
			SSNMessage_Spouse.isDisplayed();

			String actual = SSNMessage_Spouse.getText();
			String Expected = PropertyUtility.Load_MessageFile_Data("SSNMessage");
			Assert.assertEquals(actual, Expected, "Error Messege for SSN does not match ");
			log.info("Error Messege for SSN for Spouse validated sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Error Messege for SSN for Spouse|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_SSN_Required_Message_for_Self() throws Throwable {
		try {
			log.debug("Validate Error Message for SSN for Self");
			reuseMethod.scrollDown(SSNMessage_Self);
			SSNMessage_Self.isDisplayed();

			String actual = SSNMessage_Self.getText();
			String Expected = PropertyUtility.Load_MessageFile_Data("SSNMessage");
			Assert.assertEquals(actual, Expected, "Error Messege for SSN does not match for Self  ");
			log.info("Error Messege for SSN for Self validated sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Error Messege for SSN for Self|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_and_enter_phonenumber_for_Self_at_contact_page(String phoneType, String phoneNum)
			throws Exception {

		try {
			log.debug("Select Phone Type and Phone Number for Self");

			reuseMethod.scrollDown(city);
			if(phoneType.equalsIgnoreCase("Cell"))
			{
				reuseMethod.dropDownselectbyvalue(PrimaryPhNumType, phoneType);
			}
			else
			{
			reuseMethod.dropDown(PrimaryPhNumType, phoneType);
			}
			PrimaryPhNum.sendKeys(phoneNum);
			Thread.sleep(1000);
			log.info("Select Phone Type and Phone Number for Self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Select Phone Type and Phone Number for self at contact page || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean enters_Dealership_name_and_Address(String dName, String dStreet, String dCity, String dState,
			String dZip) throws Exception {
		try {
			log.debug("Enter contact details");
			reuseMethod.scrollDown(DealershipName);
			Thread.sleep(1000);
			DealershipName.sendKeys(dName);
			DealershipStreet.sendKeys(dStreet);
			Thread.sleep(1000);
			DealershipCity.sendKeys(dCity);
			reuseMethod.dropDownselectbyvalue(DealershipState, dState);
			Thread.sleep(1000);
			DealershipZip.sendKeys(dZip);

			log.info("Dealership details added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add dealership details || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}
	}

	public boolean validate_Tobacco_Question() throws Throwable {
		try {
			log.debug("Validate Tobacco Question for Self");
			TobaccoQuestion_Self.isDisplayed();

			String actual = TobaccoQuestion_Self.getText();
			String Expected = PropertyUtility.Load_MessageFile_Data("TobaccoQuestion");

			System.out.println("********************Information***********************/n" + Expected);

			Assert.assertEquals(actual, Expected, "Tobacco Question for Self is not Validated");
			System.out.println("Validation Question for Self is::::" + TobaccoQuestion_Self.getText());
			log.info("Tobacco Question for Self  is validated sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Tobacco Question for Self|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validate_Tobacco_Question_for_Spouse() throws Throwable {
		try {
			log.debug("Validate Tobacco/Smoker Question for Spouse");
			TobaccoQuestion_Spouse.isDisplayed();

			String actual = TobaccoQuestion_Spouse.getText();
			String Expected = PropertyUtility.Load_MessageFile_Data("SmokeQuestion_Spouse");

			System.out.println("********************Information***********************/n" + Expected);

			Assert.assertEquals(actual, Expected, "Tobacco Question for Spouse is not Validated");
			System.out.println("Validation Question for Spouse is::::" + TobaccoQuestion_Spouse.getText());
			log.info("Tobacco Question for Spouse is validated sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Tobacco Question for Spouse|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validate_is_not_displayed_in_Marital_Status_Drop_Down(String mstatus) throws Exception {
		try {
			log.debug("Validate following values are not present in Marital status Dropdown ");

			maritalStatus.isDisplayed();
			Select select = new Select(maritalStatus);
			List<WebElement> options = select.getOptions();

			for (WebElement option : options) {
				if (option.getText().equals(mstatus)) {
					System.out.println("Value is present in Marital status Dropdown");
				} else {
					System.out.println("Value is not present in Marital status Dropdown" + mstatus);
					break;
				}
			}

			log.info("Marital status dropdown options are validated sucessfully..|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able Validate following values are not present in Marital status Dropdown || Fail"
					+ e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}
	}

	public boolean enter_StockOwned_for_Self(String stockOwned) throws Exception {
		try {
			log.debug("Enters stockwoned for self");
			reuseMethod.scrollDown(StockOwned);
			Thread.sleep(1000);
			StockOwned.sendKeys(stockOwned);
			log.info("Enters stockwoned for self || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able enter stock owned for self || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}
	}

	public boolean validate_Mandatory_field_StockOwned_Displayed_for_Self() throws Exception {
		try {
			log.debug("Validate Manadatory field Stock owned is displayed for Self");
			reuseMethod.scrollDown(StockOwned);
			StockOwned.isDisplayed();
			log.info("Validate Manadatory field Stock owned is displayed for Self || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able validate mandatory field stock owned for self || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}
	}

	public boolean validate_SSN_Optional_Spouse() throws Exception {
		try {
			log.debug("Validate SSN is optional for Spouse");
			reuseMethod.scrollDown(SpouseSSNOptional);
			SpouseSSNOptional.isDisplayed();
			log.info("Validate SSN is optional for Spouse");
			return true;

		} catch (Exception e) {
			log.error("Not able validate mandatory field stock owned for self || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	public boolean enters_contact_Details_without_SSN_MemberId_Height_Weight_for_Self_as(String MaritalStatus,
			String Gender, String Address, String City, String Zip) throws Exception {

		try {
			log.debug("Enter contact details Without SSN, MemberId, height, weight for Self");

			reuseMethod.dropDownselectbyvalue(maritalStatus, MaritalStatus);
			Thread.sleep(1000);
			reuseMethod.select_Single_value_Icon(MaleSelf_Text, Male_Self, Female_Self, Gender);
			reuseMethod.scrollDown(city);
			address.sendKeys(Address);
			city.sendKeys(City);
			ZipCode.sendKeys(Zip);

			log.info("Contact details Without SSN and MemberId for Self added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add contact details Without SSN and MemberId || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	public boolean validate_Tobacco_Question_is_not_displayed() throws Throwable {
		try {
			log.debug("Validate Tobacco Question is not displayed");
			Assert.assertFalse(TobaccoQuestion_Self.isDisplayed(), "BUG--Tobacco Question is displayed");

			log.info("Validated Tobacco Question is not displayed sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Tobacco Question is not displayed for Self|| Fail" + e.getMessage());
			return false;
		}

	}

	public boolean your_Contact_details_page_displayed_and_select_Home_select_No_and_enters_details_as_Mobile(
			String Phtype, String Number, String Bsname, String Typebusiness, String Baddress) throws Exception {

		try {
			log.debug("Enter Your contact details as Home with business address in mobile application");
			if (mobSelfEmail.isDisplayed()) {
				if (reuseMethod.getemail() != null) {
					if (mobSelfEmail.getAttribute("value").isEmpty()) {
						mobSelfEmail.sendKeys(reuseMethod.getemail());
					}
				} else
					reuseMethod.RandomEmail(mobSelfEmail);
			}
			reuseMethod.dropDown(PrimaryPhNumType, Phtype);
			mobSelfPrimaryPhNum.click();
			mobSelfPrimaryPhNum.sendKeys(Number);
			reuseMethod.scrollDown(mobExtension);
			mobHome.click();
			mobBusinessName.sendKeys(Bsname);
			reuseMethod.dropDown(mobBusinessType, Typebusiness);
			reuseMethod.scrollDown(mobBusinessType);
			mobSameAddressNo.click();
			BusinessAddressSelf_Mob.click();
			Thread.sleep(500);
			BusinessAddressSelf_Mob.sendKeys(Baddress);
			reuseMethod.Select_value_by_Up_Down_arrow();

			log.info("Your Contact details as Home with business address in mobile page added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add Your contact details of mobile page as Home with business address || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean enter_Contact_details_for_Self_as(String title, String Fname, String Lname) throws Exception {

		try {
			log.debug("Enter Contact details");
			reuseMethod.scrollDown(drpTitle);
			reuseMethod.dropDown(drpTitle, title);
			inpFirstName.sendKeys(Fname);
			inpLastName.sendKeys(Lname);
			if (mobSelfEmail.isDisplayed()) {
				if (reuseMethod.getemail() != null) {
					if (mobSelfEmail.getAttribute("value").isEmpty()) {
						mobSelfEmail.sendKeys(reuseMethod.getemail());
					}
				} else
					reuseMethod.RandomEmail(mobSelfEmail);
			}
			log.info("Contact Details entered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able enter Contact details || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean select_NO_Radio_button_for_Smoker() throws Exception {
		try {
			log.debug("Selects NO Radio button for smoker question");
			reuseMethod.scrollDown(rbSmokerNo_Self);
			Thread.sleep(1000);
			rbSmokerNo_Self.click();
			log.info("NO Radio button for smoker question Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select NO Radio button for smoker question|| Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean select_YES_Radio_button_for_Smoker() throws Exception {
		try {
			log.debug("Selects YES Radio button for smoker question");
			reuseMethod.scrollDown(rbSmokerYes_Self);
			Thread.sleep(1000);
			rbSmokerYes_Self.click();
			log.info("YES Radio button for smoker question Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select YES Radio button for smoker question|| Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean verify_Semiannual_rate(String rate) throws Exception {
		try {
			log.debug("Verify Semiannual rate");
			String actualRate = SemiAnnualRate.getText();
			Assert.assertEquals(actualRate, rate, "Semiannual rate not validated");
			System.out.println("Verified Semiannual rate : " + actualRate);
			log.info("Semiannual rate is validated sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Semiannual rate|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_Continue_button() throws Exception {

		try {
			log.debug("Click on Continue button");
			Thread.sleep(5000);
			reuseMethod.scrollDown(btnContinue);
			reuseMethod.Clickbutton(btnContinue);			
			log.info("Click on Continue button successfully || Pass");
			return true;
		} catch (Exception e) {
			System.out.println("Not able to click on Continue button || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean validates_that_Height_is_displayed_for_Self() throws Exception {
		try {
			log.debug("Verify the Height is displayed for Self");
			boolean check = height.isDisplayed();
			Assert.assertTrue(check, "Bug||Height is not displayed for Self");
			log.info("Height is displayed for Self");
			return true;
		} catch (Exception e) {
			System.out.println("*****Height is displayed for Self**********");
			log.error("Unable to validate that Height is displayed for Self || Fail");
			throw(e);
		}

	}

	public boolean validates_that_Weight_is_displayed_for_Self() throws Throwable {
		try {
			log.debug("Verify the Weight is displayed for Self");
			boolean check = weight.isDisplayed();
			Assert.assertTrue(check, "Bug||Weight is not displayed for Self");
			log.info("Weight is displayed for Self");
			return true;
		} catch (Exception e) {
			System.out.println("*****Weight is displayed for Self**********");
			log.error("Unable to validate that Weight is displayed for Self || Fail");
			return false;
		}

	}
	
	public boolean applicant_details_page_are_displayed_to_user() throws Exception {
		try {
			log.debug("Applicant page is displayed");
			ApplicantDetailsPage.isDisplayed();
			log.info("Applicant page is displayed is sucessful || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify that Applicant page is displayed || Fail" + e.getMessage());
			throw (e);

		}
	}
	
	public boolean enters_Contact_Details_for_Self_without_SSN_MaritalStatus_Height_and_Weight_as(String Gender,String MemberId, String Address, String City, String Zip) throws Exception {

		try {
			log.debug("Enter contact details for Self without SSN,Marital Status,Height and Weight");
			Thread.sleep(1000);
			reuseMethod.select_Single_value_Icon(MaleSelf_Text, Male_Self, Female_Self, Gender);
			reuseMethod.scrollDown(height);
			memberId.sendKeys(MemberId);
			reuseMethod.scrollDown(city);
			address.sendKeys(Address);
			city.sendKeys(City);
			CanadianZipCode_Self.sendKeys(Zip);

			log.info("Contact details for Self without SSN,Marital Status,Height and Weight added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add contact details for Self without SSN,Marital Status,Height and Weight || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}
	}
	public boolean selects_Yes_Radio_button_for_Nicotine_Question_Self() throws Exception {
		try {
			log.debug("Select Yes Radio Button for Nicotine Question");
			NicotineYes_Self.click();
			Thread.sleep(3000);
			log.info("Yes Radio Button for Nicotine Question is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Yes Radio Button for Nicotine Question|| Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean selects_No_Radio_button_for_Nicotine_Question_Self() throws Exception {
		try {
			log.debug("Select No Radio Button for Nicotine Question");
			NicotineNo_Self.click();
			Thread.sleep(3000);
			log.info("No Radio Button for Nicotine Question is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click No Radio Button for Nicotine Question|| Fail" + e.getMessage());
			throw (e);
		}
	}
	public boolean validates_How_Long_Used_and_Last_Used_Date_Textbox_is_displayed_for_Self()throws Exception {
		try {
			log.debug("How Long used and Last used date Textbox are Displayed for Self");
			HowLongUsed_Self.isDisplayed();
			OMALastUsed_Self.isDisplayed();
			log.info("How Long used and Last used date Textbox are Displayed for Self Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display How Long used and Last used date Textbox for Self|| Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean enters_Last_Used_Nicotine_Date_Details_for_Self_as(String date) throws Exception {
		try {
			log.debug("Enter Last used date for Tobacco or Nicotine Product for Self ");
			OMALastUsed_Self.isDisplayed();
			OMALastUsed_Self.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			if (date.contains("SYSDATE") || date.contains("SYSDate") || date.contains("SYSdate")) {
				String date1 = reuseMethod.Enter_customized_previous_Date(date);
				Thread.sleep(1000);
				OMALastUsed_Self.click();
				OMALastUsed_Self.sendKeys(date1);

			}
			else if (date.equalsIgnoreCase("CurrentDate")) {
				Thread.sleep(1000);
				OMALastUsed_Self.click();
				String nDate=reuseMethod.Enter_Current_System_Date();
				nDate=nDate.substring(0, 2)+"/"+nDate.substring(2, 4)+"/"+nDate.substring(4, date.length());
				OMALastUsed_Self.sendKeys(nDate);
			} 
			
			else if(!date.contains("/")) {
				Thread.sleep(1000);
				OMALastUsed_Self.click();
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				OMALastUsed_Self.sendKeys(date);
				Thread.sleep(1000);
			}
			
			else
			{
				Thread.sleep(1000);
				OMALastUsed_Self.click();
				OMALastUsed_Self.sendKeys(date);

			}
			OMALastUsed_Self.click();
			log.info("Last used date for Nicotine Product for Self is entered Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter the Last used date for Nicotine Product for Self || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean enters_How_Long_Used_details_for_Self_as(String years) throws Exception {
		try {
			log.debug("Enter How Long used details for Self");
			HowLongUsed_Self.sendKeys(years);
			log.info("How Long used details for Self are entered Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter How Long used details for Self || Fail" + e.getMessage());

			throw (e);
		}
	}
	
	public boolean enters_contact_Details_for_Spouse_as_minimum_details_without_SSN(String Gender,
			String SPhoneType, String SPhoneNum) throws Exception {

		try {
			log.debug("Enter contact details for Spouse like Gender, Phonetype and Phone number");
			Thread.sleep(2000);
			reuseMethod.select_Single_value_Icon(Male_SpouseText, Male_Spouse, Female_Spouse, Gender);
			reuseMethod.scrollDown(Next);
			reuseMethod.dropDown(PrimaryPhNumType_Spouse, SPhoneType);
			PrimaryPhNum_Spouse.sendKeys(SPhoneNum);
			log.info("Contact details for Spouse like Gender, Phonetype and Phone number are added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to add contact details for Spouse like Gender, Phonetype and Phone number || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean selects_Yes_Radio_button_for_Nicotine_Question_Spouse() throws Exception {
		try {
			log.debug("Select Yes Radio Button for Nicotine Question");
			NicotineYes_Spouse.click();
			Thread.sleep(3000);
			log.info("Yes Radio Button for Nicotine Question for spouse is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Yes Radio Button for Nicotine Question for Spouse|| Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean validates_How_Long_Used_and_Last_Used_Date_Textbox_is_displayed_for_Spouse()throws Exception {
		try {
			log.debug("How Long used and Last used date Textbox are Displayed for Spouse");
			HowLongUsed_Spouse.isDisplayed();
			OMALastUsed_Spouse.isDisplayed();
			log.info("How Long used and Last used date Textbox are Displayed for Spouse Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display How Long used and Last used date Textbox for Spouse|| Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean enters_How_Long_Used_details_for_Spouse_as(String years) throws Exception {
		try {
			log.debug("Enter How Long used details for Spouse");
			HowLongUsed_Spouse.sendKeys(years);
			log.info("How Long used details for Spouse are entered Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter How Long used details for Spouse || Fail" + e.getMessage());

			throw (e);
		}
	}
	
	public boolean enters_Last_Used_Nicotine_Date_Details_for_Spouse_as(String date) throws Exception {
		try {
			log.debug("Enter Last used date for Tobacco or Nicotine Product for Spouse ");
			OMALastUsed_Spouse.isDisplayed();
			OMALastUsed_Spouse.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			if (date.contains("SYSDATE") || date.contains("SYSDate") || date.contains("SYSdate")) {
				String date1 = reuseMethod.Enter_customized_previous_Date(date);
				Thread.sleep(1000);
				OMALastUsed_Spouse.click();
				OMALastUsed_Spouse.sendKeys(date1);

			}
			else if (date.equalsIgnoreCase("CurrentDate")) {
				Thread.sleep(1000);
				OMALastUsed_Spouse.click();
				String nDate=reuseMethod.Enter_Current_System_Date();
				nDate=nDate.substring(0, 2)+"/"+nDate.substring(2, 4)+"/"+nDate.substring(4, date.length());
				OMALastUsed_Spouse.sendKeys(nDate);
			} 
			
			else if(!date.contains("/")) {
				Thread.sleep(1000);
				OMALastUsed_Spouse.click();
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				OMALastUsed_Spouse.sendKeys(date);
				Thread.sleep(1000);
			}
			
			else
			{
				Thread.sleep(1000);
				OMALastUsed_Spouse.click();
				OMALastUsed_Spouse.sendKeys(date);

			}
			OMALastUsed_Spouse.click();
			log.info("Last used date for Nicotine Product for Spouse is entered Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter the Last used date for Nicotine Product for Spouse || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean enters_Height_and_Weight_for_Self_as(String Height, String Weight) throws Exception {

		try {
			log.debug("Enters Height and Weight for Self");

			reuseMethod.dropDownselectbyvalue(height, Height);
			weight.sendKeys(Weight);
			log.info("Height and Weight for Self added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Enters Height and Weight for Self || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean enters_Height_and_Weight_for_Spouse_as(String Height, String Weight) throws Exception {

		try {
			log.debug("Enters Height and Weight for Spouse");

			reuseMethod.dropDownselectbyvalue(Height_Spouse, Height);
			Weight_Spouse.sendKeys(Weight);
			log.info("Height and Weight for Spouse added successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Enters Height and Weight for Spouse || Fail" + e.getMessage());
			throw (e);
		}

	}

}
