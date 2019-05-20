package Page;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import Selenium.ScreenShotUtility;
import Selenium.SetUp;
import Utility.ExcelUtility;
import Utility.ReuseableMethod;

public class Nyl_PreviewPage extends SetUp {

//public WebDriver driver = null;

	String sheetName = "Beneficiary";
	ExcelUtility testUtil = new ExcelUtility();
	private final Logger log = LogManager.getLogger(Nyl_PreviewPage.class.getName());

	public Nyl_PreviewPage() {
		driver = getDriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	ReuseableMethod reuseMethod = new ReuseableMethod();
	ScreenShotUtility screenShotUtility = new ScreenShotUtility();

	String email = null;
	@FindBy(xpath = "//input[contains(@id,'txtPassword') or contains(@id,'saveLaterPassword')]")
	WebElement password;

	@FindBy(xpath = "//input[contains(@id,'txtVerifyPassword') or contains(@id,'saveLaterVerifyPassword')]")
	WebElement VerifyPassword;

	@FindBy(xpath = "(//*[text()='Save Information' or text()='Application Saved']//following::button[@class='modal-confirm submit' or @class='btn btn-success'])[1]")
	// @FindBy(id="submit")
	WebElement Submit;

	// @FindBy(id="close-msg-button")

	@FindBy(xpath = "(//button[text()='OK'])[1]")
	WebElement SaveForLaterOK;

	@FindBy(xpath = "//input[@id='saveLaterEmailID' or @id='txtEmail']")
	WebElement emailid;

	@FindBy(xpath = "//label[text()='Application Saved']//following::button[1]")
	WebElement SavedAppOK;

	@FindBy(id = "next")
	WebElement Next;

	@FindBy(xpath = "//h1[text()='Preview']")
	WebElement previewPage;

	@FindBy(xpath = "//label[contains(text(),'Application Summary')]")
	WebElement applicationSummary;

	@FindBy(xpath = "//label[contains(text(),'Application Preview')]")
	WebElement applicationPreview;

	@FindBy(xpath = "//div[@class='child-preview-sec']//div//following-sibling::div[contains(@class,'preview-subSection-bg')]//div[contains(@class,'col-sm-12')]/label")
	List<WebElement> eli_Child_NameList;

	
	@FindBy(xpath = "//label[text()='YOUR INFO']")
	WebElement yourInfo_Mobile;
	@FindBy(xpath = "//label[text()='SPOUSE INFO']")
	WebElement spouseInfo_Mobile;
	@FindBy(xpath = "//label[text()='CHILD INFO']")
	WebElement childInfo_Mobile;
	/*
	 * @FindBy(
	 * xpath="//div[@class='self-preview-sec']//div[@class='col-xs-12 col-sm-4 col-md-4 col-lg-4']//label[@class='amt']"
	 * ) WebElement CoverageAmount_Self;
	 */

	/*----------------------Term Life Insurance--------------------*/

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Term Life')or starts-with(text(),'5-Year') or starts-with(text(),'Group Term Life')or starts-with(text(),'Traditional') or starts-with (text(), 'Annual Renewable Term Life') or starts-with(text(),'Group Traditional')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtTermLife_Self;

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Life to 95')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtLifeTo95_Self;

	
	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Chronic Illness Rider')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtChronicIllnessRider_Self;

	@FindBy(xpath = "//div[@class='spouse-preview-sec']//label[starts-with(text(),'Term Life Insurance')or starts-with(text(),'5-Year')or contains(text(),'Group Term Life')or starts-with(text(),'Traditional') or starts-with (text(), 'Annual Renewable Term Life') or starts-with(text(),'Group Traditional')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtTermLife_Spouse;

	@FindBy(xpath = "//div[@class='spouse-preview-sec']//label[starts-with(text(),'Chronic Illness Rider')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtChronicIllnessRider_Spouse;

	@FindBy(xpath = "//div[@class='child-preview-sec']//label[starts-with(text(),'Term Life') or starts-with(text(),'5-Year') or starts-with(text(),'Group Term Life')or starts-with(text(),'Traditional')or starts-with (text(), 'Annual Renewable Term Life')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtTermLife_Child;

	@FindBy(xpath = "//div[text()='COVERAGE']//parent::h3//div[@data-applicant='slf']//parent::h3//following-sibling::div//div//div[contains(text(),'Traditional Term Life')]//following-sibling::div")
	WebElement BenefitAmtTrad_Self_Mobile;

	@FindBy(xpath = "//div[text()='COVERAGE']//parent::h3//div[@data-applicant='sps']//parent::h3//following-sibling::div//div//div[contains(text(),'Traditional Term Life')]//following-sibling::div")
	WebElement BenefitAmtTrad_Spouse_Mobile;

	@FindBy(xpath = "//div[text()='COVERAGE']//parent::h3//div[@data-applicant='chd']//parent::h3//following-sibling::div//div//div[contains(text(),'Traditional Term Life') or contains(text(),'Group Term Life Insurance')]//following-sibling::div")
	WebElement BenefitAmtTrad_Child_Mobile;

	@FindBy(xpath = "//div[text()='COVERAGE']//parent::h3//div[@data-applicant='chd']//parent::h3//following-sibling::div//div//div[contains(text(),'Covered Children')]//following-sibling::div")
	List<WebElement> ChildName_MobileList;

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Chronic Illness Rider')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement ApplicationSummary_ChronicIllnessRider_Self_Yes;

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Waiver of Premium')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement ApplicationSummary_WaiverOfPremiumRider_Self_Yes;
	
	@FindBy(xpath="(//div[@class='self-preview-sec']//label[starts-with(text(),'Waiver of Premium')]//parent::div//following-sibling::div//label[@class='amt'])[1]")
	WebElement Rider_WOP_GTLP75ISelf;
	
	@FindBy(xpath="(//div[@class='self-preview-sec']//label[starts-with(text(),'Waiver of Premium')]//parent::div//following-sibling::div//label[@class='amt'])[2]")
	WebElement Rider_WOP_Flex10Self;
	
	@FindBy(xpath="(//div[@class='self-preview-sec']//label[starts-with(text(),'Waiver of Premium')]//parent::div//following-sibling::div//label[@class='amt'])[3]")
	WebElement Rider_WOP_Flex20Self;

	/*----------------------Ten Year Level Term Life Insurance--------------------*/

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[contains(text(),'10-Year Level') or contains(text(),'10 Life')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmt10YearLevel_Self;

	@FindBy(xpath = "//div[@class='spouse-preview-sec']//label[contains(text(),'10-Year Level') or contains(text(),'10 Year Level') or contains(text(),'10 Life')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmt10YearLevel_Spouse;

	@FindBy(xpath = "//div[@class='child-preview-sec']//label[contains(text(),'10-Year Level Term Life')]//parent::div/following-sibling::div//label[@class='amt']")
	List<WebElement> BenefitAmt10YearLevel_Child;

	@FindBy(xpath = "//div[text()='COVERAGE']//parent::h3//div[@data-applicant='slf']//parent::h3//following-sibling::div//div//div[contains(text(),'10-Year Level Term Life')]//following-sibling::div")
	WebElement BenefitAmt10Year_Self_Mobile;

	@FindBy(xpath = "//div[text()='COVERAGE']//parent::h3//div[@data-applicant='sps']//parent::h3//following-sibling::div//div//div[contains(text(),'10-Year Level Term Life')]//following-sibling::div")
	WebElement BenefitAmt10Year_Spouse_Mobile;

	// ************************** Fifteen YTL****************************//
	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'15-Year Level Term Life')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmt15YearLevel_Self;

	@FindBy(xpath = "//div[@class='spouse-preview-sec']//label[starts-with(text(),'15-Year Level Term Life')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmt15YearLevel_Spouse;

	/*----------------------Twenty Year Level Term Life Insurance--------------------*/

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[contains(text(),'20-Year Level') or contains(text(),'20 Life')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmt20YearLevel_Self;

	@FindBy(xpath = "//div[@class='spouse-preview-sec']//label[contains(text(),'20-Year Level') or contains(text(),'20 Life')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmt20YearLevel_Spouse;

	@FindBy(xpath = "//div[text()='COVERAGE']//parent::h3//div[@data-applicant='slf']")
	WebElement coverageEdit_Self_Mobile;

	@FindBy(xpath = "//div[text()='COVERAGE']//parent::h3//div[@data-applicant='sps']")
	WebElement coverageEdit_Spouse_Mobile;

	@FindBy(xpath = "//div[text()='COVERAGE']//parent::h3//div[@data-applicant='slf']//parent::h3//following-sibling::div//div//div[contains(text(),'20-Year Level Term Life')]//following-sibling::div")
	WebElement BenefitAmt20Year_Self_Mobile;

	@FindBy(xpath = "//div[text()='COVERAGE']//parent::h3//div[@data-applicant='sps']//parent::h3//following-sibling::div//div//div[contains(text(),'20-Year Level Term Life')]//following-sibling::div")
	WebElement BenefitAmt20Year_Spouse_Mobile;

	/*----------------------High-Limit Death and Dismemberment Insurance--------------------*/

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'High-Limit Death and Dismemberment Insurance')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtHLDD_Self;

	@FindBy(xpath = "//div[@class='spouse-preview-sec']//label[starts-with(text(),'High-Limit Death and Dismemberment Insurance')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtHLDD_Spouse;

	@FindBy(xpath = "//div[@class='child-preview-sec']//label[starts-with(text(),'High-Limit Death and Dismemberment Insurance')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtHLDD_Child;

	/*----------------------Accidental Death and Dismemberment Insurance--------------------*/

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Accidental Death') or starts-with(text(),'Accident-Only Disability') or starts-with(text(),'Group Accidental')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtADD_Self;

	@FindBy(xpath = "//div[@class='spouse-preview-sec']//label[starts-with(text(),'Accidental Death')or starts-with(text(),'Accident-Only Disability') or starts-with(text(),'Group Accidental')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtADD_Spouse;

	@FindBy(xpath = "//div[@class='child-preview-sec']//label[starts-with(text(),'Accidental Death')or starts-with(text(),'Accident-Only Disability')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtADD_Child;

	@FindBy(xpath = "//div[@class='child-preview-sec']//label[starts-with(text(),'Manager Life Insurance')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtMLI_Child;
        
	@FindBy(xpath ="//div[@class='self-preview-sec']//label[contains(text(),'Accidental Death')or starts-with(text(),'Optional AD&D')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtADD_SelfRider;

	@FindBy(xpath = "//div[@class='spouse-preview-sec']//label[starts-with(text(),'Optional AD&D')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtADD_SpouseRider;
	
	@FindBy(xpath="(//div[@class='self-preview-sec']//label[contains(text(),'Accidental Death')or starts-with(text(),'Optional AD&D')]//parent::div//following-sibling::div//label[@class='amt'])[1]")
	WebElement BenefitAmtADD_GTLP75ISelf;
	
	@FindBy(xpath="(//div[@class='self-preview-sec']//label[contains(text(),'Accidental Death')or starts-with(text(),'Optional AD&D')]//parent::div//following-sibling::div//label[@class='amt'])[2]")
	WebElement BenefitAmtADD_Flex10Self;
	
	@FindBy(xpath="(//div[@class='self-preview-sec']//label[contains(text(),'Accidental Death')or starts-with(text(),'Optional AD&D')]//parent::div//following-sibling::div//label[@class='amt'])[3]")
	WebElement BenefitAmtADD_Flex20Self;
	
	@FindBy(xpath="(//div[@class='spouse-preview-sec']//label[contains(text(),'Accidental Death')or starts-with(text(),'Optional AD&D')]//parent::div//following-sibling::div//label[@class='amt'])[1]")
	WebElement BenefitAmtADD_GTLP75ISpouse;
	
	@FindBy(xpath="(//div[@class='spouse-preview-sec']//label[contains(text(),'Accidental Death')or starts-with(text(),'Optional AD&D')]//parent::div//following-sibling::div//label[@class='amt'])[2]")
	WebElement BenefitAmtADD_Flex10Spouse;
	
	@FindBy(xpath="(//div[@class='spouse-preview-sec']//label[contains(text(),'Accidental Death')or starts-with(text(),'Optional AD&D')]//parent::div//following-sibling::div//label[@class='amt'])[3]")
	WebElement BenefitAmtADD_Flex20Spouse;
	
	/*----------------------Long-Term Disability Plus Insurance--------------------*/

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Long-Term Disability Plus Insurance')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtLTDPlus_Self;

	@FindBy(xpath = "//div[@class='spouse-preview-sec']//label[starts-with(text(),'Long-Term Disability Plus Insurance')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtLTDPlus_Spouse;

	/*----------------------Mid-Term Disability  Insurance--------------------*/

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Mid-Term Disability Insurance')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtMid_Self;

	@FindBy(xpath = "//div[@class='spouse-preview-sec']//label[starts-with(text(),'Mid-Term Disability Insurance')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtMid_Spouse;

	/*----------------------Retirement Disability Insurance--------------------*/

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Retirement Disability Insurance')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtRDI_Self;

	/*----------------------Professional Overhead Expense Disability Insurance--------------------*/

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Professional Overhead Expense Disability Insurance') or starts-with(text(),'Group Business Overhead')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtPOEDI_Self;

	/*----------------------Critical Illness--------------------*/

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Critical Illness')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtCI_Self;

	@FindBy(xpath = "//div[@class='spouse-preview-sec']//label[starts-with(text(),'Critical Illness')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtCI_Spouse;

	/*----------------------Long-Term Disability Insurance--------------------*/

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Long-Term Disability Insurance') or starts-with(text(),'Group Long Term')] //parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtLTD_Self;

	@FindBy(xpath = "//div[@class='spouse-preview-sec']//label[starts-with(text(),'Long-Term Disability Insurance')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtLTD_Spouse;

	@FindBy(xpath = "(//div[@class='self-preview-sec']//label[starts-with(text(),'Future Purchase Option')]//parent::div//following-sibling::div//label[@class='amt'])[1]")
	WebElement BenefitAmtFPO_Self_LTD;

	@FindBy(xpath = "(//div[@class='self-preview-sec']//label[starts-with(text(),'Cost of Living Adjustment')]//parent::div//following-sibling::div//label[@class='amt'])[1]")
	WebElement COLASeleceted_Self_LTD;

	@FindBy(xpath = "//div[text()='COVERAGE']//parent::h3//div[@data-applicant='slf']//parent::h3//following-sibling::div//div//div[contains(text(),'Long-Term Disability')]//following-sibling::div")
	WebElement BenefitAmtLTD_SelfMobile;

	@FindBy(xpath = "//div[text()='COVERAGE']//parent::h3//div[@data-applicant='sps']//parent::h3//following-sibling::div//div//div[contains(text(),'Long-Term Disability')]//following-sibling::div")
	WebElement BenefitAmtLTD_SpouseMobile;

	/*----------------------Disability Income Insurance--------------------*/

	@FindBy(xpath = "//div[@class='self-preview-sec']//div[@class='row MA-0 preview-subSection-bg']//label[contains(text(),'Disability Income Insurance')or starts-with(text(),'Disability Income Protection')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtDII_Self;

	@FindBy(xpath = "//div[@class='spouse-preview-sec']//div[@class='row MA-0 preview-subSection-bg']//label[contains(text(),'Disability Income Insurance')or starts-with(text(),'Disability Income Protection')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtDII_Spouse;

	@FindBy(xpath = "//div[@class='self-preview-sec']//div[@class='row MA-0 preview-subSection-bg']//label[starts-with(text(),'Option A (Five Year Plan)')]")
	WebElement BenefitOptionDII_Self;

	@FindBy(xpath = "//div[@class='self-preview-sec']//div[@class='row MA-0 preview-subSection-bg']//label[starts-with(text(),'Plan A - To age 65')]")
	WebElement BenefitOptionDII_Self2;

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Inflation Protection')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement ApplicatioSummary_InflationProtectionRiderDI_Self;

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Cost of Living Adjustment (COLA)')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement COLARider_DII;

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Catastrophic Disability Benefit')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtDII_Self_Rider;

	/*----------------------Short-Term Disability Insurance--------------------*/

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Short-Term') or text()='Group Disability Income Insurance (Short Term)']//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtSTD_Self;

	@FindBy(xpath = "//div[@class='spouse-preview-sec']//label[starts-with(text(),'Short-Term')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtSTD_Spouse;

	@FindBy(xpath = "//div[text()='COVERAGE']//parent::h3//div[@data-applicant='slf']//parent::h3//following-sibling::div//div//div[contains(text(),'Short-Term Disability')]//following-sibling::div")
	WebElement BenefitAmtSTD_SelfMobile;

	@FindBy(xpath = "//div[text()='COVERAGE']//parent::h3//div[@data-applicant='sps']//parent::h3//following-sibling::div//div//div[contains(text(),'Short-Term Disability')]//following-sibling::div")
	WebElement BenefitAmtSTD_SpouseMobile;
	/*----------------------Office Overhead Expense Disability Insurance--------------------*/

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Office Overhead') or starts-with(text(),'Practice Overhead') or starts-with(text(),'Business Overhead') or starts-with(text(),'Group Office') or starts-with(text(),'Group Professional')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtOOEDI_Self;

	@FindBy(xpath = "//div[@class='spouse-preview-sec']//label[starts-with(text(),'Office Overhead')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtOOEDI_Spouse;

	@FindBy(xpath = "//div[text()='COVERAGE']//parent::h3//div[@data-applicant='slf']//parent::h3//following-sibling::div//div//div[contains(text(),'Business Overhead Expense')]//following-sibling::div")
	WebElement BenefitAmtBOE_Self_Mobile;

	@FindBy(xpath = "//div[@class='self-preview-sec']//div[@class='row MA-0 preview-subSection-bg']//label[contains(text(),'Business Overhead Expense')]//parent::div//parent::div//following-sibling::div//label[contains(text(),'Recovery')]//parent::div//following-sibling::div//label")
	WebElement recoveryValue_BOE;
	@FindBy(xpath = "//div[@class='self-preview-sec']//div[@class='row MA-0 preview-subSection-bg']//label[contains(text(),'Business Overhead Expense')]//parent::div//parent::div//following-sibling::div//label[contains(text(),'Guaranteed Purchase')]//parent::div//following-sibling::div//label")
	WebElement guaranteedValue_BOE;
	@FindBy(xpath = "//div[@class='self-preview-sec']//div[@class='row MA-0 preview-subSection-bg']//label[contains(text(),'Business Overhead Expense')]//parent::div//parent::div//following-sibling::div//label[contains(text(),'Retroactive')]//parent::div//following-sibling::div//label")
	WebElement RetroactiveValue_BOE;
	/*----------------------Supplemental Disability Insurance--------------------*/

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Supplemental Disability')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtSDI_Self;

	@FindBy(xpath = "//div[@class='spouse-preview-sec']//label[starts-with(text(),'Supplemental Disability')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtSDI_Spouse;

	@FindBy(xpath = "(//div[@class='self-preview-sec']//label[starts-with(text(),'Future Purchase Option')]//parent::div//following-sibling::div//label[@class='amt'])[2]")
	WebElement BenefitAmtFPO_Self_SDI;

	@FindBy(xpath = "(//div[@class='self-preview-sec']//label[starts-with(text(),'Cost of Living Adjustment')]//parent::div//following-sibling::div//label[@class='amt'])[2]")
	WebElement COLASeleceted_Self_SDI;
	/*----------------------Hospital Indemnity Insurance -------------------*/

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Hospital')or starts-with(text(),'Group Hospital')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtHII_Self;

	@FindBy(xpath = "//div[@class='spouse-preview-sec']//label[starts-with(text(),'Hospital')or starts-with(text(),'Group Hospital')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtHII_Spouse;

	@FindBy(xpath = "//div[@class='child-preview-sec']//label[starts-with(text(),'Hospital') or starts-with(text(),'Group Hospital')]//parent::div//following-sibling::div//label[@class='amt']")
	List<WebElement> BenefitAmtHII_Child;

	@FindBy(id = "previewLink")
	WebElement preview;

	@FindBy(id = "medicalQuestionsSelfLink")
	WebElement health;

	@FindBy(id = "paymentLink")
	WebElement payment;

	@FindBy(xpath = "//label[text()='Authorization & Consent']")
	WebElement Anth_cons;

	@FindBy(xpath = "//div[@class='spouse-preview-sec']//label[starts-with(text(),'Manager Life Insurance')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtMLI_Spouse;

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Manager Life Insurance')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtMLI_Self;

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Optional AD&D')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement OptionalAD_D_MLI_Self;

	@FindBy(xpath = "//div[@class='spouse-preview-sec']//label[starts-with(text(),'Optional AD&D')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement OptionalAD_D_MLI_Spouse;

	@FindBy(xpath = "//div[@class='self-preview-sec']//div[@class='ques-subHeader-title']//label")
	WebElement SelfFname_Lname_header;

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[contains(text(),'Group Term Dealer Life Insurance')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtGTDLI_Self;

	@FindBy(xpath = "//div[@class='spouse-preview-sec']//label[contains(text(),'Group Term Dealer Life Insurance')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtGTDLI_Spouse;

	@FindBy(xpath = "//div[@class='spouse-preview-sec']//div[@class='ques-subHeader-title']//label")
	WebElement SpouseFname_Lname_header;

	@FindBy(xpath = "(//div[@class='child-preview-sec']//label[contains(text(),'Group Term Dealer Life Insurance') or contains(text(),'Traditional Group Term Life Insurance')]//parent::div//following-sibling::div//label[@class='amt'])[1]")
	WebElement BenefitAmtGTDLI_FirstChild;

	@FindBy(xpath = "(//div[@class='child-preview-sec']//label[contains(text(),'Group Term Dealer Life Insurance') or contains(text(),'Traditional Group Term Life Insurance')]//parent::div//following-sibling::div//label[@class='amt'])[2]")
	WebElement BenefitAmtGTDLI_SecondChild;

	@FindBy(xpath = "(//div[@class='child-preview-sec']//label[contains(text(),'Group Term Dealer Life Insurance') or contains(text(),'Traditional Group Term Life Insurance')]//parent::div//following-sibling::div//label[@class='amt'])[3]")
	WebElement BenefitAmtGTDLI_ThirdChild;

	@FindBy(xpath = "(//div[@class='child-preview-sec']//label[contains(text(),'Group Term Dealer Life Insurance') or contains(text(),'Traditional Group Term Life Insurance')]//parent::div//following-sibling::div//label[@class='amt'])[4]")
	WebElement BenefitAmtGTDLI_FourthChild;

	@FindBy(xpath = "(//div[@class='child-preview-sec']//label[contains(text(),'Group Term Dealer Life Insurance') or contains(text(),'Traditional Group Term Life Insurance')]//parent::div//following-sibling::div//label[@class='amt'])[5]")
	WebElement BenefitAmtGTDLI_FifthChild;

	@FindBy(xpath = "//div[@class='child-preview-sec']")
	WebElement ChildFname_Lname_header;

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Group Disability Insurance')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement BenefitAmtGDI_Self;

	@FindBy(xpath = "//div[@class='self-preview-sec']//label[starts-with(text(),'Benefit Option')]//parent::div//following-sibling::div//label")
	WebElement BenefitOptionGDI_Self;
	
	@FindBy(xpath="//div[@class='self-preview-sec']//label[starts-with(text(),'Partial Disability')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement PartialDisabilityGDI_Self;
	
	@FindBy(xpath="//div[@class='spouse-preview-sec']//label[starts-with(text(),'Automatic Benefit Increase Option')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement AutomaticBenefitGLI_Spouse;
	
	@FindBy(xpath="//div[@class='self-preview-sec']//label[starts-with(text(),'Automatic Benefit Increase Option')]//parent::div//following-sibling::div//label[@class='amt']")
	WebElement AutomaticBenefitGLI_Self;

	public boolean user_scroll_to_next_in_preview_page() throws Exception {

		try {
			log.debug("Scroll to next button");
			reuseMethod.scrollDown(Next);
			log.info("Scroll the page successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to scroll the page || Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean Preview_Page_is_displayed_Mobile() throws Exception {

		try {
			log.debug("Preview Page is dispalyed");
			previewPage.isDisplayed();

			log.info("Preview Page is dispalyed successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display the Preview Page || Fail" + e.getMessage());

			throw (e);
		}
	}

	/*
	 * public boolean user_enters_and_and_submit_to_save_the_information(String
	 * Password, String VerifyPass) throws Exception{
	 *
	 * try { log.debug("Save the information"); password.sendKeys(Password);
	 * VerifyPassword.sendKeys(VerifyPass); Submit.click(); Thread.sleep(2000);
	 * Submit.click(); log.info("Save the Information successfully || Pass"); return
	 * true; }catch (Exception e) {
	 * log.error("Not able to save information || Fail"+e.getMessage()); throw(e); }
	 * }
	 */
	public boolean user_enters_and_and_submit(String Password, String VerifyPass) throws Exception {

		try {
			log.debug("Enter login details and sumit");
			password.sendKeys(Password);
			VerifyPassword.sendKeys(VerifyPass);
			Submit.click();
			Thread.sleep(2000);
			SavedAppOK.click();
			log.info("Login details entered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter login details || Fail");
			throw (e);
		}

	}

	public boolean application_Summary_Page_is_displayed_to_user() throws Exception {
		try {

			log.debug("Application Summary page is displayed to user");
			Thread.sleep(4000);
			applicationSummary.isDisplayed();
			log.info("Application Summary page is displayed to user successfully || Pass");

			return true;
		} catch (Exception e) {
			log.error("Not able to display the elements of Application summary page || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean application_Preview_Page_is_displayed_to_user() throws Exception {
		try {

			log.debug("Application Preview page is displayed to user");
			Thread.sleep(2000);
			applicationPreview.isDisplayed();
			log.info("Application Preview page is displayed to user successfully || Pass");

			return true;
		} catch (Exception e) {
			log.error("Not able to display the elements of Application Preview page || Fail" + e.getMessage());
			throw (e);

		}

	}

//WAEPA

	/*
	 * public boolean verify_that_the_coverage_amount_for_Self_is(String Benefit)
	 * throws Exception { try {
	 *
	 * log.debug("Verify that the coverage amount is displayed");
	 *
	 * //CoverageAmount_Self.getText();
	 * Assert.assertEquals(CoverageAmount_Self.getText(),
	 * Benefit,"Coverage for Self is Verified");
	 *
	 * log.info("coverage amount is displayed to user successfully || Pass"); return
	 * true; }catch (Exception e) {
	 * log.error("Not able to display coverage amount || Fail"+e.getMessage());
	 * throw(e);
	 *
	 * }
	 *
	 * }
	 */

	public boolean verify_Benefit_Amount_for_Self_as_under_TermLife_ARTL_FiveYTL(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under Term Life/ARTL/FiveYTL Insurance");
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtTermLife_Self.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,"Coverage Benefit Amount for Self Under Term Life/ARTL/FiveYTL Insurance is Verified");
System.out.println("Coverage Benefit Amount for Self Under Term Life/ARTL/FiveYTL Insurance is validated");
			log.info("Coverage Benefit Amount for Self Under Term Life/ARTL/FiveYTL Insurance is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(	"Not able to verify Coverage Benefit Amount for Self Under Term Life/ARTL/FiveYTL Insurance || Fail"+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_under_LifeTo95(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under Term LifeTo95 Insurance");
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtLifeTo95_Self.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,"Coverage Benefit Amount for Self Under Term LifeTo95 Insurance is Verified");
System.out.println("Coverage Benefit Amount for Self Under Term LifeTo95 Insurance is validated");
			log.info("Coverage Benefit Amount for Self Under Term LifeTo95 Insurance is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(	"Not able to verify Coverage Benefit Amount for Self Under Term LifeTo95 Insurance || Fail"+ e.getMessage());
			throw (e);

		}

	}
	
	
	public boolean verify_CIR_portion_for_Self_as_under_TermLife(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under Chronic Illness Rider");
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtChronicIllnessRider_Self.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Under Chronic Illness Rider is Verified");

			log.info(
					"Coverage Benefit Amount for Self Under Chronic Illness Rider is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Coverage Benefit Amount for Self Under Term Life Insurance || Fail"
					+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Spouse_as_under_TermLife_ARTL_FiveYTL(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Spouse Under Term Life/FiveYTL/ARTL Insurance");
			// reuseMethod.scrollDown(BenefitAmtChronicIllnessRider_Spouse);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtTermLife_Spouse.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,"Coverage Benefit Amount for Spouse Under Term LifeLife/FiveYTL/ARTL Insurance is Verified");
			System.out.println("Coverage Benefit Amount for Spouse Under Term LifeLife/FiveYTL/ARTL Insurance is validated");
			log.info("Coverage Benefit Amount for Spouse Under Term LifeLife/FiveYTL/ARTL Insurance is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify Coverage Benefit Amount for Spouse Under Term LifeLife/FiveYTL/ARTL Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_CIR_portion_for_Spouse_as_under_TermLife(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Spouse Under Chronic Illness Rider");
			reuseMethod.scrollDown(BenefitAmtChronicIllnessRider_Spouse);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtChronicIllnessRider_Spouse.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Spouse Under Chronic Illness Rider is Verified");

			log.info(
					"Coverage Benefit Amount for Spouse Under Chronic Illness Rider is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Coverage Benefit Amount for Spouse Under Term Life Insurance || Fail"
					+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Child_as_under_TermLife_FiveYTL_ARTL(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Child Under Term Life/FiveYTL/ARTL Insurance");
			reuseMethod.scrollDown(BenefitAmtTermLife_Child);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtTermLife_Child.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Child Under Term Life/FiveYTL/ARTL Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Child Under Term Life/FiveYTL/ARTL Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Child Under Term Life/FiveYTL/ARTL Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_under_TenYTL(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under 10 Year Level Term Life Insurance");
			reuseMethod.scrollDown(BenefitAmt10YearLevel_Self);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmt10YearLevel_Self.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,	"Coverage Benefit Amount for Self Under 10 Year Level Term Life Insurance does not match");
			System.out.println("Coverage Benefit Amount for Self Under 10 Year Level Term Life Insurance is validated");
			log.info("Coverage Benefit Amount for Self Under 10 Year Level Term Life Insurance is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify Coverage Benefit Amount for Self Under 10 Year Level Term Life Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Spouse_as_under_TenYTL(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Spouse Under 10 Year Level Term Life Insurance");
			reuseMethod.scrollDown(BenefitAmt10YearLevel_Spouse);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmt10YearLevel_Spouse.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,"Coverage Benefit Amount for Spouse Under 10 Year Level Term Life Insurance does not match");
			System.out.println("Coverage Benefit Amount for Spouse under 10 Year Level Term Life Insurance is validated");
			log.info("Coverage Benefit Amount for Spouse Under 10 Year Level Term Life Insurance is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Spouse Under 10 Year Level Term Life Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_under_TwentyYTL(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under 20 Year Level Term Life Insurance");
			reuseMethod.scrollDown(BenefitAmt20YearLevel_Self);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmt20YearLevel_Self.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Under 20 Year Level Term Life Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Self Under 20 Year Level Term Life Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Self Under 20 Year Level Term Life Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Spouse_as_under_TwentyYTL(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Spouse Under 20 Year Level Term Life Insurance");
			reuseMethod.scrollDown(BenefitAmt20YearLevel_Spouse);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmt20YearLevel_Spouse.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Spouse Under 20 Year Level Term Life Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Spouse Under 20 Year Level Term Life Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Spouse Under 20 Year Level Term Life Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_under_HLDD(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under High-Limit Death and Dismemberment Insurance");
			reuseMethod.scrollDown(BenefitAmtHLDD_Self);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtHLDD_Self.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Under High-Limit Death and Dismemberment Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Self Under High-Limit Death and Dismemberment Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Self Under High-Limit Death and Dismemberment Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Spouse_as_under_HLDD(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Spouse Under High-Limit Death and Dismemberment Insurance");
			reuseMethod.scrollDown(BenefitAmtHLDD_Spouse);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtHLDD_Spouse.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Spouse High-Limit Death and Dismemberment Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Spouse Under High-Limit Death and Dismemberment Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Spouse Under High-Limit Death and Dismemberment Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Child_as_under_HLDD(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Child High-Limit Death and Dismemberment Insurance");
			reuseMethod.scrollDown(BenefitAmtHLDD_Child);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtHLDD_Child.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Child Under High-Limit Death and Dismemberment Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Child Under High-Limit Death and Dismemberment Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Child Under High-Limit Death and Dismemberment Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Child_as_under_ADDI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Child Accidental Death and Dismemberment Insurance");
			reuseMethod.scrollDown(BenefitAmtADD_Child);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtADD_Child.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Child UnderAccidental Death and Dismemberment Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Child Under Accidental Death and Dismemberment Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Child Under Accidental Death and Dismemberment Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Monthly_Benefit_Amount_for_Self_as_under_DII(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under Disability Income Insurance");
			reuseMethod.scrollDown(BenefitAmtDII_Self);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtDII_Self.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,"Coverage Benefit Amount for Self Under Disability Income Insurance does not match");
System.out.println("Coverage Benefit Amount for Self Under Disability Income Insurance is validated");
			log.info("Coverage Benefit Amount for Self Under Disability Income Insurance is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify Coverage Benefit Amount for Self Under Disability Income Insurance || Fail"
					+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Option_for_Self_as_under_DII_FiveYear_Plan(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Option for Self Under Disability Income Insurance");

			String actual_Amount = BenefitOptionDII_Self.getText();

			Assert.assertEquals(actual_Amount, Benefit,"Coverage Benefit Option for Self Under Disability Income Insurance does not match");

			log.info(
					"Coverage Benefit Option for Self Under Disability Income Insurance is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify Coverage Benefit Option for Self Under Disability Income Insurance || Fail"
					+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Option_for_Self_as_under_DII_Plan_Age65(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Option for Self Under Disability Income Insurance");
			reuseMethod.scrollDown(BenefitOptionDII_Self2);

			String actual_Amount = BenefitOptionDII_Self2.getText();

			Assert.assertEquals(actual_Amount, Benefit,"Coverage Benefit Option for Self Under Disability Income Insurance is Verified");

			log.info(
					"Coverage Benefit Option for Self Under Disability Income Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Coverage Benefit Option for Self Under Disability Income Insurance || Fail"
					+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Monthly_Benefit_Amount_for_Spouse_as_under_DII(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Spouse Under Disability Income Insurance");
			reuseMethod.scrollDown(BenefitAmtDII_Spouse);

			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtDII_Spouse.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Spouse Disability Income Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Spouse Under Disability Income Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Coverage Benefit Amount for Spouse Under Disability Income Insurance || Fail"
					+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Maximum_Daily_Benefit_Amount_for_Self_as_under_HII(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under Hospital Indemnity Insurance");
			reuseMethod.scrollDown(BenefitAmtHII_Self);
			Benefit = Benefit.replaceAll(",", "");
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			String actual_Amount = BenefitAmtHII_Self.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,"Coverage Benefit Amount for Self Under Hospital Indemnity Insurance does not match");
System.out.println("Coverage Benefit Amount for Self Under Hospital Indemnity Insurance is validated");
			log.info("Coverage Benefit Amount for Self Under Hospital Indemnity Insurance is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify Coverage Benefit Amount for Self Under Hospital Indemnity Insurance || Fail"	+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Maximum_Daily_Benefit_Amount_for_Spouse_as_under_HII(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Spouse Under Hospital Indemnity Insurance");
			reuseMethod.scrollDown(BenefitAmtHII_Spouse);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtHII_Spouse.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Spouse Hospital Indemnity Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Spouse Under Hospital Indemnity Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Spouse Under Hospital Indemnity Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean save_Information_page_will_be_displayed_to_user_and_user_will_enter_Login_details_as(String Password,
			String VPassword) throws Exception {
		try {
			log.debug("Enter user login details on save Information Page");
			if (emailid.isDisplayed()) {
				if (emailid.getAttribute("value").isEmpty()) {
					email = reuseMethod.RandomEmail(emailid);
					Thread.sleep(500);
					reuseMethod.addemail(email);

				}
			}
			password.sendKeys(Password);
			Thread.sleep(500);
			VerifyPassword.sendKeys(VPassword);
			Thread.sleep(500);
			Submit.click();
			Thread.sleep(1000);
			log.info("Login details entered on Save Informtion page successfully || Pass");

			return true;
		} catch (Exception e) {
			log.error("Not able to enter the Login details on Save InformationPage || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean clicks_OK_Button_Save_For_Later() throws Exception {
		try {
			log.debug("Click on Ok Button Save For Later");
			Thread.sleep(3000);
			SaveForLaterOK.click();
			log.info("Ok button is clicked sucessfully || Pass");

			return true;
		} catch (Exception e) {
			log.error("Not able to click on Ok Button Save For Later || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean clicks_on_Next_and_OK_Button() throws Exception {
		try {
			log.debug("Click on Ok Button ");
			Thread.sleep(4000);
			Submit.isDisplayed();
			Submit.click();
			log.info("Ok button is clicked sucessfully || Pass");

			return true;
		} catch (Exception e) {
			log.error("Not able to click on Ok Button || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_on_Payment_and_Health_page_to_verify_that_the_Screen_is_not_rendered() throws Exception {
		try {
			log.debug("verify payment and Health page thar the screen is not rendered ");
			Thread.sleep(2000);
			reuseMethod.scrollDown(preview);
			health.click();
			Thread.sleep(5000);
			reuseMethod.scrollDown(preview);
			String actualTitle = Anth_cons.getText();
			System.out.println(actualTitle);
			String expectedTitle = "Authorization & Consent";
			assertEquals(expectedTitle, actualTitle);

			if (payment.isEnabled()) {
				System.out.println("\n payment Button is Enabled");
			} else {
				System.out.println("\n payment Button is Disabled");
			}

			log.info("Ok button is clicked sucessfully || Pass");

			return true;
		} catch (Exception e) {
			log.error("Not able to click on Ok Button || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_under_FifteenYTL(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self for FifteenYTL");
			String actual_Amount = BenefitAmt15YearLevel_Self.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount.trim(), Benefit.trim(),
					"Coverage Benefit Amount for Self Under Term FifteenYTL is Verified");

			log.info("Coverage Benefit Amount for Self Under FifteenYTL is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Coverage Benefit Amount for Self Under FifteenYTL || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean verify_Benefit_Amount_for_Spouse_as_under_FifteenYTL(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Spouse for FifteenYTL");
			String actual_Amount = BenefitAmt15YearLevel_Spouse.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount.trim(), Benefit.trim(),
					"Coverage Benefit Amount for Spouse Under Term FifteenYTL is Verified");

			log.info("Coverage Benefit Amount for Spouse Under FifteenYTL is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Spouse Under FifteenYTL || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean verify_Benefit_Amount_for_Self_as_under_ADDI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under Accidental Death and Dismemberment Insurance");
			reuseMethod.scrollDown(BenefitAmtADD_Self);
			String actual_Amount = BenefitAmtADD_Self.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Under Accidental Death and Dismemberment Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Self Under Accidental Death and Dismemberment Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Self Under Accidental Death and Dismemberment Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Spouse_as_under_ADDI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Spouse Under Accidental Death and Dismemberment Insurance");
			reuseMethod.scrollDown(BenefitAmtADD_Spouse);
			String actual_Amount = BenefitAmtADD_Spouse.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Spouse Under Accidental Death and Dismemberment Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Self Under Accidental Death and Dismemberment Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Spouse Under Accidental Death and Dismemberment Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_under_LTD(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under Long-Term Disability Insurance");
			reuseMethod.scrollDown(BenefitAmtLTD_Self);
			String actual_Amount = BenefitAmtLTD_Self.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Under Long-Term Disability Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Self Under Long-Term Disability Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Self Under Long-Term Disability Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_under_LTDP(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under Long-Term Disability Plus Insurance");
			reuseMethod.scrollDown(BenefitAmtLTDPlus_Self);
			String actual_Amount = BenefitAmtLTDPlus_Self.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Under Long-Term Disability Plus Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Self Under Long-Term Disability Plus Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Self Under Long-Term Disability Plus Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_under_MTDI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under Mid-Term Disability  Insurance");
			reuseMethod.scrollDown(BenefitAmtMid_Self);
			String actual_Amount = BenefitAmtMid_Self.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Under Mid-Term Disability  Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Self Under Mid-Term Disability  Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Self Under Mid-Term Disability  Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_under_RDI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under Retirement Disability Insurance");
			reuseMethod.scrollDown(BenefitAmtRDI_Self);
			String actual_Amount = BenefitAmtRDI_Self.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Under Retirement Disability Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Self Under Retirement Disability Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Self Under Retirement Disability Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_under_POEDI(String Benefit) throws Exception {
		try {

			log.debug(
					"Verify Coverage Benefit Amount for Self Under Professional Overhead Expense Disability Insurance");
			reuseMethod.scrollDown(BenefitAmtPOEDI_Self);
			String actual_Amount = BenefitAmtPOEDI_Self.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Under Professional Overhead Expense Disability Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Self Under Professional Overhead Expense Disability Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Self Under Professional Overhead Expense Disability Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_under_CI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under Critical Illness");
			reuseMethod.scrollDown(BenefitAmtCI_Self);
			String actual_Amount = BenefitAmtCI_Self.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Under Critical Illness is Verified");

			log.info(
					"Coverage Benefit Amount for Self Under Critical Illness is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Coverage Benefit Amount for Self Under Critical Illness || Fail"
					+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Spouse_as_under_LTD(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under Long-Term Disability Insurance");
			reuseMethod.scrollDown(BenefitAmtLTD_Spouse);
			String actual_Amount = BenefitAmtLTD_Spouse.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Under Long-Term Disability Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Self Under Long-Term Disability Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Self Under Long-Term Disability Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Spouse_as_under_LTDP(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Spouse Under Long-Term Disability Plus Insurance");
			reuseMethod.scrollDown(BenefitAmtLTDPlus_Spouse);
			String actual_Amount = BenefitAmtLTDPlus_Spouse.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Spouse Under Long-Term Disability Plus Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Spouse Under Long-Term Disability Plus Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Spouse Under Long-Term Disability Plus Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Spouse_as_under_MTDI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Spouse Under Mid-Term Disability  Insurance");
			reuseMethod.scrollDown(BenefitAmtMid_Spouse);
			String actual_Amount = BenefitAmtMid_Spouse.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Spouse Under Mid-Term Disability  Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Spouse Under Mid-Term Disability  Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Spouse Under Mid-Term Disability  Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Spouse_as_under_CI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Spouse Under Critical Illness");
			reuseMethod.scrollDown(BenefitAmtCI_Spouse);
			String actual_Amount = BenefitAmtCI_Spouse.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Spouse Under Critical Illness is Verified");

			log.info(
					"Coverage Benefit Amount for Spouse Under Critical Illness is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Coverage Benefit Amount for Spouse Under Critical Illness || Fail"
					+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_for_FPO_under_LTD(String Benefit) throws Exception {
		try {

			log.debug("Verify for self Rider FPO Rider Benefit Amount for Long-Term Disability Insurance");
			reuseMethod.scrollDown(BenefitAmtFPO_Self_LTD);
			String actual_Amount = BenefitAmtFPO_Self_LTD.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Rider FPO Rider Benefit Amount for Long-Term Disability Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Self Rider FPO Rider Benefit Amount for Long-Term Disability Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Self Rider FPO Rider Benefit Amount for Long-Term Disability Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Cost_of_Living_Adjustment_Rider_under_LTD() throws Throwable {
		try {

			log.debug("Verify for self Cost of Living Adjustment Rider is selected for Long-Term Disability Insurance");
			reuseMethod.scrollDown(COLASeleceted_Self_LTD);
			String actual_Value = COLASeleceted_Self_LTD.getText();
			if (actual_Value.equalsIgnoreCase("Yes")) {
				System.out.println(
						"(Self) Cost of Living Adjustment Rider is selected for Long-Term Disability Insurance is Verified");
			}

			log.info(
					"(Self) Cost of Living Adjustment Rider is selected for Long-Term Disability Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Rider COLA for Long-Term Disability Insurance || Fail" + e.getMessage());
			throw (e);

		}

	}

//WAEPA
	public boolean verify_that_the_Chronic_Illness_Rider_is_rendered_on_screen_as_Yes() throws Exception {
		try {

			log.debug("Verify for Chronic Illness Rider is selected as YES");
			reuseMethod.scrollDown(ApplicationSummary_ChronicIllnessRider_Self_Yes);
			String actual_Value = ApplicationSummary_ChronicIllnessRider_Self_Yes.getText();
			if (actual_Value.equalsIgnoreCase("Yes")) {
				System.out.println("(Self) Chronic Illness Rider is selected as YES");
			}

			log.info("(Self) Chronic Illness Rider is selected as YES successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Chronic Illness Rider as YES || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean verify_Benefit_Amount_for_Self_as_under_STD(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under Short-Term Disability Insurance");
			reuseMethod.scrollDown(BenefitAmtSTD_Self);
			String actual_Amount = BenefitAmtSTD_Self.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Under Short-Term Disability Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Self Under Short-Term Disability Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Self Under Short-Term Disability Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_under_OOEDI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under Office Overhead or Practice Overhead");
			reuseMethod.scrollDown(BenefitAmtOOEDI_Self);
			String actual_Amount = BenefitAmtOOEDI_Self.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Under Office Overhead or Practice Overhead is Verified");

			log.info(
					"Coverage Benefit Amount for Self Under Office Overhead or Practice Overhead is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Self Under Office Overhead or Practice Overhead || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_under_SDI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self under Supplemental Disability Insurance");
			reuseMethod.scrollDown(BenefitAmtSDI_Self);
			String actual_Amount = BenefitAmtSDI_Self.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self under Supplemental Disability Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Self under Supplemental Disability Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Self Under Supplemental Disability Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_for_FPO_under_SDI(String Benefit) throws Exception {
		try {

			log.debug("Verify for self Rider FPO Rider Benefit Amount for Long-Term Disability Insurance");
			reuseMethod.scrollDown(BenefitAmtFPO_Self_SDI);
			String actual_Amount = BenefitAmtFPO_Self_SDI.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Rider FPO Rider Benefit Amount for Long-Term Disability Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Self Rider FPO Rider Benefit Amount for Long-Term Disability Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Self Rider FPO Rider Benefit Amount for Long-Term Disability Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Cost_of_Living_Adjustment_Rider_under_SDI() throws Exception {
		try {

			log.debug(
					"Verify for self Cost of Living Adjustment Rider is selected for Supplemental Disability Insurance");
			reuseMethod.scrollDown(COLASeleceted_Self_SDI);
			String actual_Value = COLASeleceted_Self_SDI.getText();
			if (actual_Value.equalsIgnoreCase("Yes")) {
				System.out.println(
						"(Self) Cost of Living Adjustment Rider is selected for Supplemental Disability Insurance is Verified");
			}

			log.info(
					"(Self) Cost of Living Adjustment Rider is selected for Supplemental Disability Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Rider COLA for Supplemental Disability Insurance || Fail" + e.getMessage());
			throw (e);

		}

	}

//AAFP
	public boolean verify_Waiver_of_Premium_Rider_for_Self_as_YES() throws Exception {
		try {

			log.debug(
					"Verify for self Cost of Living Adjustment Rider is selected for Supplemental Disability Insurance");
			reuseMethod.scrollDown(ApplicationSummary_WaiverOfPremiumRider_Self_Yes);
			String actual_Value = ApplicationSummary_WaiverOfPremiumRider_Self_Yes.getText();
			if (actual_Value.equalsIgnoreCase("Yes")) {
				System.out.println(
						"(Self) Cost of Living Adjustment Rider is selected for Supplemental Disability Insurance is Verified");
			}

			log.info(
					"(Self) Cost of Living Adjustment Rider is selected for Supplemental Disability Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Rider COLA for Supplemental Disability Insurance || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Inflation_Protection_Option_Rider_for_Self_as_YES() throws Exception {
		try {

			log.debug("Verify for self Inflation Protection Rider is selected for Disability Insurance");
			reuseMethod.scrollDown(ApplicatioSummary_InflationProtectionRiderDI_Self);
			String actual_Value = ApplicatioSummary_InflationProtectionRiderDI_Self.getText();
			if (actual_Value.equalsIgnoreCase("Yes")) {
				System.out
						.println("(Self) Inflation Protection Rider is selected for Disability Insurance is Verified");
			}

			log.info(
					"(Self) Inflation Protection Rider is selected for Disability Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Inflation Protection Rider for Disability Insurance || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Riders_COLA_is_displayed() throws Exception {
		try {

			log.debug("Verify Riders COLA is displayed");
			reuseMethod.scrollDown(COLARider_DII);
			COLARider_DII.isDisplayed();

			log.info("Riders COLA is displayed successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify Riders COLA is displayed || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Riders_portion_for_Self_amount_as_under_DII(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under Catastrophic Disability Benefit Rider");
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtDII_Self_Rider.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Catastrophic Disability Benefit Rider is Verified");

			log.info(
					"Coverage Benefit Amount for Self Under Catastrophic Disability Benefit Rider is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Self UnderCatastrophic Disability Benefit Rider Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Child_name_at_summary_page_as(String fname, String lname) throws Throwable {
		try {

			log.debug("Verify child name at summary page");

			String cName, childname, cFname, cLname;
			boolean condition = false;
			for (WebElement e : eli_Child_NameList) {
				cName = e.getText();
				String name[] = cName.split("-");
				childname = name[0];
				String Name[] = childname.split(" ");
				cFname = Name[0];
				cLname = Name[1];

				if (cFname.equalsIgnoreCase(fname) && cLname.equalsIgnoreCase(lname)) {
					condition = true;
					System.out.println("Child First Name=" + fname);
					System.out.println("Child Last Name=" + lname);
					
				} else {

					condition = false;
				}
			}
			if (condition == true) {
				Assert.assertTrue(condition, "Child name does not match");
				System.out.println("Child name is validated");
			}

			log.info("Verified child name at summary page successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify child name at summary page || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean verify_Benefit_Amount_for_child_as_under_TenYTL(String amount) throws Throwable {

		try {

			log.debug("Verify Benefit Amount for child under TenYTL");
			boolean condition = false;
				
			if (amount.contains("$")) {
				amount = amount.substring(amount.indexOf("$") + 1);
			}
			amount = amount.replaceAll(",", "");
			for (int j=0;j< BenefitAmt10YearLevel_Child.size();j++ ) {
				String coverage = BenefitAmt10YearLevel_Child.get(j).getText();
				
				
				if (coverage.contains("$")) {
					coverage = coverage.substring(coverage.indexOf("$") + 1);
				}
				coverage = coverage.replaceAll(",", "");
				
				if (coverage.equals(amount)) {
					condition = true;
					
				}
				
			}
System.out.println(condition);
			Assert.assertTrue(condition, "Benefit amount for child does not match at summary page");

			log.info("Verified Benefit Amount for child under TenYTL successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify Benefit Amount for child under TenYTL || Fail" + e.getMessage());
			throw (e);

		}

	}

	// AAFP
	public boolean verify_Benefit_Amount_for_child_as_under_TenYTL(String CFname, String SequenceNo, String CBenefit)
			throws Throwable {

		try {

			log.debug("Verify Benefit Amount for child under TenYTL");
			boolean condition = false;

			if (CBenefit.contains("$") || CBenefit.contains(",")) {
				CBenefit = CBenefit.replace("$", "");
				CBenefit = CBenefit.replaceAll(",", "");
				CBenefit.trim();
			}

			String Actual_CBenefit = driver
					.findElement(By.xpath("//div[@class='child-preview-sec']//label[contains(text(),'" + CFname + "')]"
							+ "//parent::div/parent::div//following-sibling::div[" + SequenceNo
							+ "]//label[starts-with(text(),'10 Year Level Term') or starts-with(text(),'10-Year Level') ]"
							+ "//parent::div/following-sibling::div//label[@class='amt']"))
					.getText();
			/*String Actual_CBenefit = driver
					.findElement(By.xpath("(//div[@class='child-preview-sec']//following-sibling::div//label[contains(text(),'10 Year Level Term') or contains(text(),'10-Year Level')]//parent::div/following-sibling::div//label[@class='amt'])[" + SequenceNo+ "]")).getText();	
*/
			if (Actual_CBenefit.contains("$") || Actual_CBenefit.contains(",")) {
				Actual_CBenefit = Actual_CBenefit.replace("$", "");
				Actual_CBenefit = Actual_CBenefit.replaceAll(",", "");
				Actual_CBenefit.trim();
			}

			if (Actual_CBenefit.equals(CBenefit)) {
				condition = true;
			}

			Assert.assertTrue(condition, "Child benifit amount not matched || Bug");
			System.out.println("Benefit Amount for child "+CFname+ " under TenYTL is: "+Actual_CBenefit);
			log.info("Verified Benefit Amount for child under TenYTL successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify Benefit Amount for child under TenYTL || Fail" + e.getMessage());
			throw (e);

		}

	}
	
	//GEOCARE
	
	public boolean verify_Benefit_Amount_for_child_as_under(String CFname, String SequenceNo, String CBenefit, String product)
			throws Throwable {

		try {

			log.debug("Verify Benefit Amount for child under TenYTL");
			boolean condition = false;

			if (CBenefit.contains("$") || CBenefit.contains(",")) {
				CBenefit = CBenefit.replace("$", "");
				CBenefit = CBenefit.replaceAll(",", "");
				CBenefit.trim();
			}

			WebElement CBenefit_Object = driver.findElement(By.xpath("//div[@class='child-preview-sec']//label[contains(text(),'" + CFname + "')]"
							+ "//parent::div/parent::div//following-sibling::div[" + SequenceNo
							+ "]//label[starts-with(text(),'"+product+"') ]"
							+ "//parent::div/following-sibling::div//label[@class='amt']"));
					String Actual_CBenefit = CBenefit_Object.getText();
			/*String Actual_CBenefit = driver
					.findElement(By.xpath("(//div[@class='child-preview-sec']//following-sibling::div//label[contains(text(),'10 Year Level Term') or contains(text(),'10-Year Level')]//parent::div/following-sibling::div//label[@class='amt'])[" + SequenceNo+ "]")).getText();	
*/
			if (Actual_CBenefit.contains("$") || Actual_CBenefit.contains(",")) {
				Actual_CBenefit = Actual_CBenefit.replace("$", "");
				Actual_CBenefit = Actual_CBenefit.replaceAll(",", "");
				Actual_CBenefit.trim();
			}

			if (Actual_CBenefit.equals(CBenefit)) {
				condition = true;
			}

			Assert.assertTrue(condition, "Child benifit amount not matched || Bug");
			System.out.println("Benefit Amount for child "+CFname+ " under TenYTL is: "+Actual_CBenefit);
			log.info("Verified Benefit Amount for child under TenYTL successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify Benefit Amount for child under TenYTL || Fail" + e.getMessage());
			throw (e);

		}

	}
	
	public boolean verify_Benefit_Amount_for_as_for_product_under(String Type, String Benefit, String product, String UnderProduct)
			throws Throwable {
		
		
		try {

			log.debug("Benefit Amount of child for "+product+" Under "+UnderProduct+ "");
			boolean condition = false;		

			
			if (Benefit.contains("$") || Benefit.contains(",")) {
				Benefit = Benefit.replace("$", "");
				Benefit = Benefit.replaceAll(",", "");
				Benefit.trim();
			}
			
			
			Type=Type.toLowerCase();
			
			switch (Type)
			{
			
			case "self":			
				
				//String Actual_SelfBenefit = driver.findElement(By.xpath("//div[@class='"+Type+"-preview-sec']//div[starts-with(text(),'"+UnderProduct+"')]//parent::div/parent::div//following-sibling::div[1]//label[text()='+"+product+"' ]//parent::div/following-sibling::div//label[@class='amt']")).getText();	            								
				
				WebElement SelfObject = driver.findElement(By.xpath("//div[@class='"+Type+"-preview-sec']//div[contains(text(),'"+UnderProduct+"')]//parent::div/parent::div//following-sibling::div[1]//label[starts-with(text(),'"+product+"')]//parent::div/following-sibling::div//label[@class='amt']"));	            								
				String Actual_SelfBenefit =SelfObject.getText();
				
				if (Actual_SelfBenefit.contains("$") || Actual_SelfBenefit.contains(",")) {
					Actual_SelfBenefit = Actual_SelfBenefit.replace("$", "");
					Actual_SelfBenefit = Actual_SelfBenefit.replaceAll(",", "");
					Actual_SelfBenefit.trim();
				}

				if (Actual_SelfBenefit.equals(Benefit)) {
					condition = true;
				}
				
				Assert.assertTrue(condition, ""+Type+" benifit amount not matched || Bug");
				System.out.println("Benefit Amount of child for product "+product+" Under "+UnderProduct+ " is: "+Actual_SelfBenefit);
				break;
				
			case "spouse":
				WebElement SpouseObject = driver.findElement(By.xpath("//div[@class='"+Type+"-preview-sec']//div[contains(text(),'"+UnderProduct+"')]//parent::div/parent::div//following-sibling::div[1]//label[starts-with(text(),'"+product+"')]//parent::div/following-sibling::div//label[@class='amt']"));	            								
				String Actual_SpouseBenefit =SpouseObject.getText();
				
				if (Actual_SpouseBenefit.contains("$") || Actual_SpouseBenefit.contains(",")) {
					Actual_SpouseBenefit = Actual_SpouseBenefit.replace("$", "");
					Actual_SpouseBenefit = Actual_SpouseBenefit.replaceAll(",", "");
					Actual_SpouseBenefit.trim();
				}

				if (Actual_SpouseBenefit.equals(Benefit)) {
					condition = true;
				}
				
				Assert.assertTrue(condition, ""+Type+" benifit amount not matched || Bug");
				System.out.println("Benefit Amount of child for product "+product+" Under "+UnderProduct+ " is: "+Actual_SpouseBenefit);
				break;
				
			case "child":
				WebElement ChildObject = driver.findElement(By.xpath("//div[@class='"+Type+"-preview-sec']//div[contains(text(),'"+UnderProduct+"')]//parent::div/parent::div//following-sibling::div[1]//label[starts-with(text(),'"+product+"')]//parent::div/following-sibling::div//label[@class='amt']"));	            								
				String Actual_ChildBenefit =ChildObject.getText();
				
				if (Actual_ChildBenefit.contains("$") || Actual_ChildBenefit.contains(",")) {
					Actual_ChildBenefit = Actual_ChildBenefit.replace("$", "");
					Actual_ChildBenefit = Actual_ChildBenefit.replaceAll(",", "");
					Actual_ChildBenefit.trim();
				}

				if (Actual_ChildBenefit.equals(Benefit)) {
					condition = true;
				}
				
				Assert.assertTrue(condition, ""+Type+" benifit amount not matched || Bug");
				System.out.println("Benefit Amount of child for product "+product+" Under "+UnderProduct+ " is: "+Actual_ChildBenefit);
				break;
				
			default:
				System.out.println("Input mismatch");
			}
			           
           
			
			log.info("Benefit Amount of child for product "+product+" Under "+UnderProduct+ " successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify Benefit Amount of child for product "+product+" Under "+UnderProduct+ " || Fail" + e.getMessage());
			throw (e);

		}

	}
	//**********

	public boolean verify_Benefit_Amount_for_child_as_under_TermLife(String CFname, String SequenceNo, String CBenefit)
			throws Throwable {


		try {

			log.debug("Verify Benefit Amount for child under TermLife/Group Term Life");
			boolean condition = false;

			if (CBenefit.contains("$") || CBenefit.contains(",")) {
				CBenefit = CBenefit.replace("$", "");
				CBenefit = CBenefit.replaceAll(",", "");
				CBenefit.trim();
			}

			String Actual_CBenefit = driver
					.findElement(By.xpath("//div[@class='child-preview-sec']//label[contains(text(),'" + CFname + "')]"
							+ "//parent::div/parent::div//following-sibling::div[" + SequenceNo
							+ "]//label[starts-with(text(),'Term Life') or starts-with(text(),'Group Term Life') ]"
							+ "//parent::div/following-sibling::div//label[@class='amt']"))
					.getText();
			
			/*String Actual_CBenefit = driver.findElement(By.xpath(
					"(//div[@class='child-preview-sec']//following-sibling::div//label[contains(text(),'Term Life')]//parent::div/following-sibling::div//label[@class='amt'])["
							+ SequenceNo + "]"))
					.getText();
*/
			if (Actual_CBenefit.contains("$") || Actual_CBenefit.contains(",")) {
				Actual_CBenefit = Actual_CBenefit.replace("$", "");
				Actual_CBenefit = Actual_CBenefit.replaceAll(",", "");
				Actual_CBenefit.trim();
			}

			if (Actual_CBenefit.equals(CBenefit)) {
				condition = true;
			}

			Assert.assertTrue(condition, "Child benifit amount not matched || Bug");
			System.out.println(
					"Benefit Amount for child " + CFname + " under TermLife/Group Term Life is: " + Actual_CBenefit);
			log.info("Verified Benefit Amount for child under TermLife/Group Term Life successfully || Pass");
			return true;

		} catch (Exception e) {
			log.error("Not able to Verify Benefit Amount for child under TermLife/Group Term Life || Fail"
					+ e.getMessage());
			throw (e);

		}

	}
	
	
	public boolean verify_Child_name_BenefitAmt_at_summary_page_as_Under_GrpTermLife(String fname, String lname, String BenAmt) throws Throwable {
		try {

			log.debug("Verify child name at summary page");

			String cName, childname, cFname, cLname, cAmt;
			boolean condition = false;
			boolean Amtcondition = false;
			for (WebElement e : eli_Child_NameList) {
				cName = e.getText();
				String name[] = cName.split("-");
				childname = name[0];
				String Name[] = childname.split(" ");
				cFname = Name[0];
				cLname = Name[1];

				if (cFname.equalsIgnoreCase(fname) && cLname.equalsIgnoreCase(lname)) {
					condition = true;
					System.out.println("Child First Name=" + fname);
					System.out.println("Child Last Name=" + lname);
					
					//verifying the benefit amount
					WebElement eamt = driver.findElement(By.xpath("//label[contains(text(),'"+cFname+"')]/parent::div/parent::div/following-sibling::div[1]/div[3]/label"));
					cAmt=eamt.getText();
					//cAmt = cAmt.replace("$", "");
					cAmt = cAmt.replaceAll(",", "");
					if (cAmt.equalsIgnoreCase(BenAmt))
					{
					Amtcondition = true;
					System.out.println("Amount Verified Successfully :" + cAmt);
					}
					break;
				} 
				
			}
			if (condition == true) {
				Assert.assertTrue(condition, "Child name does not match");
				Assert.assertTrue(Amtcondition, "Child name does not match");
				System.out.println("Child name is validated");
			}

			log.info("Verified child name at summary page successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify child name at summary page || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean verify_Benefit_Amount_for_child_as_under_ADDI(String CFname, String SequenceNo, String CBenefit)
			throws Throwable {

		try {

			log.debug("Verify Benefit Amount for child under TenYTL");
			boolean condition = false;

			if (CBenefit.contains("$") || CBenefit.contains(",")) {
				CBenefit = CBenefit.replace("$", "");
				CBenefit = CBenefit.replaceAll(",", "");
				CBenefit.trim();
			}

			String Actual_CBenefit = driver
					.findElement(By.xpath("//div[@class='child-preview-sec']//label[contains(text(),'" + CFname + "')]"
							+ "//parent::div/parent::div//following-sibling::div[" + SequenceNo
							+ "]//label[starts-with(text(),'Accidental Death') or starts-with(text(),'High-limit Accidental')]"
							+ "//parent::div/following-sibling::div//label[@class='amt']"))
					.getText();

			if (Actual_CBenefit.contains("$") || Actual_CBenefit.contains(",")) {
				Actual_CBenefit = Actual_CBenefit.replace("$", "");
				Actual_CBenefit = Actual_CBenefit.replaceAll(",", "");
				Actual_CBenefit.trim();
			}

			if (Actual_CBenefit.equals(CBenefit)) {
				condition = true;
			}

			Assert.assertTrue(condition, "Child benifit amount not matched || Bug");

			log.info("Verified Benefit Amount for child under TenYTL successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify Benefit Amount for child under TenYTL || Fail" + e.getMessage());
			throw (e);

		}

	}
	
	public boolean verify_Benefit_Amount_for_Child_as_under_HII(String CFname, String SequenceNo, String CBenefit)
			throws Throwable {

		try {

			log.debug("Verify Benefit Amount for child under HII");
			boolean condition = false;

			if (CBenefit.contains("$") || CBenefit.contains(",")) {
				CBenefit = CBenefit.replace("$", "");
				CBenefit = CBenefit.replaceAll(",", "");
				CBenefit.trim();
			}

			String Actual_CBenefit = driver
					.findElement(By.xpath("//div[@class='child-preview-sec']//label[contains(text(),'" + CFname + "')]"
							+ "//parent::div/parent::div//following-sibling::div[" + SequenceNo
							+ "]//label[starts-with(text(),'Hospital') or starts-with(text(),'Group Hospital') or starts-with(text(),'In-Hospital')]"
							+ "//parent::div/following-sibling::div//label[@class='amt']"))
					.getText();
			
			//String Actual_CBenefit = driver.findElement(By.xpath("(//div[@class='child-preview-sec']//label[starts-with(text(),'Hospital') or starts-with(text(),'Group Hospital')]//parent::div//following-sibling::div//label[@class='amt'])[" +SequenceNo+ "]")).getText();	

			if (Actual_CBenefit.contains("$") || Actual_CBenefit.contains(",")) {
				Actual_CBenefit = Actual_CBenefit.replace("$", "");
				Actual_CBenefit = Actual_CBenefit.replaceAll(",", "");
				Actual_CBenefit.trim();
			}

			if (Actual_CBenefit.equals(CBenefit)) {
				condition = true;
			}

			Assert.assertTrue(condition, "Child benefit amount not matched || Bug");
			System.out.println("Benefit Amount for child "+CFname+ " under HII is: "+Actual_CBenefit);
			log.info("Verified Benefit Amount for child under HII successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify Benefit Amount for child under HII || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Child_as_under_HLDD(String CFname, String SequenceNo, String CBenefit)
			throws Throwable {

		try {

			log.debug("Verify Benefit Amount for child under HLDD");
			boolean condition = false;

			if (CBenefit.contains("$") || CBenefit.contains(",")) {
				CBenefit = CBenefit.replace("$", "");
				CBenefit = CBenefit.replaceAll(",", "");
				CBenefit.trim();
			}

			String Actual_CBenefit = driver.findElement(By.xpath(
					"(//div[@class='child-preview-sec']//label[starts-with(text(),'High-Limit Death and Dismemberment Insurance')]//parent::div//following-sibling::div//label[@class='amt'])["
							+ SequenceNo + "]"))
					.getText();

			if (Actual_CBenefit.contains("$") || Actual_CBenefit.contains(",")) {
				Actual_CBenefit = Actual_CBenefit.replace("$", "");
				Actual_CBenefit = Actual_CBenefit.replaceAll(",", "");
				Actual_CBenefit.trim();
			}

			if (Actual_CBenefit.equals(CBenefit)) {
				condition = true;
			}

			Assert.assertTrue(condition, "Child benefit amount not matched for HLDD || Bug");
			System.out.println("Benefit Amount for child " + CFname + " under HLDD is: " + Actual_CBenefit);
			log.info("Verified Benefit Amount for child under HLDD successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify Benefit Amount for child under HLDD || Fail" + e.getMessage());
			throw (e);

		}

	}


//***************
	public boolean verify_Benefit_Amount_for_child_as_under_HII(String amount) throws Throwable {

		try {

			log.debug("Verify Benefit Amount for child under HII");
			boolean condition = false;

			if (amount.contains("$")) {
				amount = amount.substring(amount.indexOf("$") + 1);
			}
			amount = amount.replaceAll(",", "");
			for (WebElement e : BenefitAmtHII_Child) {
				String coverage = e.getText();
				if (coverage.contains("$")) {
					coverage = coverage.substring(coverage.indexOf("$") + 1);
				}
				coverage = coverage.replaceAll(",", "");
				if (coverage.equals(amount)) {
					condition = true;
				}

			}

			Assert.assertTrue(condition, "Benefit amount for child does not match at summary page");

			log.info("Verified Benefit Amount for child under TenYTL successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify Benefit Amount for child under TenYTL || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_under_BOE_Mobile(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self under Business Overhead Disability Insurance Mobile");
			reuseMethod.scrollDown(coverageEdit_Self_Mobile);
			String actual_Amount = BenefitAmtBOE_Self_Mobile.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self under Business Overhead Disability Insurance is Verified");

			log.info(
					"(Mobile)Coverage Benefit Amount for Self under Business Overhead Disability Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"(Mobile)Not able to display Coverage Benefit Amount for Self under Business Overhead Disability Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_under_LTD_Mobile(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under Long-Term Disability Insurance Mobile");
			reuseMethod.scrollDown(coverageEdit_Self_Mobile);
			String actual_Amount = BenefitAmtLTD_SelfMobile.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Under Long-Term Disability Insurance is Verified for Mobile application");

			log.info(
					"Coverage Benefit Amount for Self Under Long-Term Disability Insurance is displayed to user for Mobile application successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Self Under Long-Term Disability Insurance for Mobile application || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_under_STD_Mobile(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under Short-Term Disability Insurance Mobile");
			reuseMethod.scrollDown(coverageEdit_Self_Mobile);
			String actual_Amount = BenefitAmtSTD_SelfMobile.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Under Short-Term Disability Insurance is Verified");

			log.info(
					"(Mobile)Coverage Benefit Amount for Self Under Short-Term Disability Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"(Mobile)Not able to display Coverage Benefit Amount for Self Under Short-Term Disability Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_under_TraditionalTerm_Mobile(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under Traditional Term Life Insurance Mobile");
			reuseMethod.scrollDown(coverageEdit_Self_Mobile);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtTrad_Self_Mobile.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self under Traditional Term Life Insurance is Verified");

			log.info(
					"(Mobile)Coverage Benefit Amount for Self under Traditional Term Life Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"(Mobile)Not able to display Coverage Benefit Amount for Self under Traditional Term Life Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Spouse_as_under_TraditionalTerm_Mobile(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Spouse Under Traditional Term Life Insurance Mobile");
			reuseMethod.scrollDown(coverageEdit_Spouse_Mobile);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtTrad_Spouse_Mobile.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Spouse under Traditional Term Life Insurance is Verified");

			log.info(
					"(Mobile)Coverage Benefit Amount for Spouse under Traditional Term Life Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"(Mobile)Not able to display Coverage Benefit Amount for Spouse under Traditional Term Life Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_under_TenYTL_Mobile(String Benefit) throws Exception {
		try {

			log.debug("(Mobile)Verify Coverage Benefit Amount for Self Under 10 Year Level Term Life Insurance");
			reuseMethod.scrollDown(coverageEdit_Self_Mobile);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmt10Year_Self_Mobile.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Under 10 Year Level Term Life Insurance is Verified");

			log.info(
					" (Mobile) Coverage Benefit Amount for Self Under 10 Year Level Term Life Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"(Mobile) Not able to display Coverage Benefit Amount for Self Under 10 Year Level Term Life Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Spouse_as_under_TenYTL_Mobile(String Benefit) throws Exception {
		try {

			log.debug("(Mobile) Verify Coverage Benefit Amount for Spouse Under 10 Year Level Term Life Insurance");
			reuseMethod.scrollDown(coverageEdit_Spouse_Mobile);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmt10Year_Spouse_Mobile.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Spouse Under 10 Year Level Term Life Insurance is Verified");

			log.info(
					"(Mobile) Coverage Benefit Amount for Spouse Under 10 Year Level Term Life Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"(Mobile) Not able to display Coverage Benefit Amount for Spouse Under 10 Year Level Term Life Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_under_TwentyYTL_Mobile(String Benefit) throws Exception {
		try {

			log.debug("(Mobile) Verify Coverage Benefit Amount for Self Under 20 Year Level Term Life Insurance");
			reuseMethod.scrollDown(coverageEdit_Self_Mobile);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmt20Year_Self_Mobile.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Under 20 Year Level Term Life Insurance is Verified");

			log.info(
					"(Mobile) Coverage Benefit Amount for Self Under 20 Year Level Term Life Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"(Mobile) Not able to display Coverage Benefit Amount for Self Under 20 Year Level Term Life Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Spouse_as_under_TwentyYTL_Mobile(String Benefit) throws Exception {
		try {

			log.debug("(Mobile) Verify Coverage Benefit Amount for Spouse Under 20 Year Level Term Life Insurance");
			reuseMethod.scrollDown(coverageEdit_Spouse_Mobile);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmt20Year_Spouse_Mobile.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Spouse Under 20 Year Level Term Life Insurance is Verified");

			log.info(
					"(Mobile) Coverage Benefit Amount for Spouse Under 20 Year Level Term Life Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"(Mobile) Not able to display Coverage Benefit Amount for Spouse Under 20 Year Level Term Life Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Spouse_as_under_LTD_Mobile(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Spouse Under Long-Term Disability Insurance Mobile");
			reuseMethod.scrollDown(coverageEdit_Spouse_Mobile);
			String actual_Amount = BenefitAmtLTD_SpouseMobile.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Spouse Under Long-Term Disability Insurance is Verified for Mobile application");

			log.info(
					"Coverage Benefit Amount for Spouse Under Long-Term Disability Insurance is displayed to user for Mobile application successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Spouse Under Long-Term Disability Insurance for Mobile application || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Spouse_as_under_STD_Mobile(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Spouse Under Short-Term Disability Insurance Mobile");
			reuseMethod.scrollDown(coverageEdit_Spouse_Mobile);
			String actual_Amount = BenefitAmtSTD_SpouseMobile.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Spouse Under Short-Term Disability Insurance is Verified");

			log.info(
					"(Mobile)Coverage Benefit Amount for Spouse Under Short-Term Disability Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"(Mobile)Not able to display Coverage Benefit Amount for Spouse Under Short-Term Disability Insurance || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_that_the_Child_name_is_displayed_as_and_preview_page_Mobile(String fname, String lname)
			throws Throwable {
		try {

			log.debug("Verify child name at summary page for mobile application");

			String cName, childname, cFname, cLname;
			boolean condition = false;
			for (WebElement e : ChildName_MobileList) {
				cName = e.getText();
				String name[] = cName.split("-");
				childname = name[0];
				String Name[] = childname.split(" ");
				cFname = Name[0];
				cLname = Name[1];

				if (cFname.equalsIgnoreCase(fname) && cLname.equalsIgnoreCase(lname)) {
					condition = true;

				}

			}
			if (condition == true) {
				Assert.assertTrue(condition, "Child name does not match");
			}

			log.info("Verified child name at summary page successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify child name at summary page || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean expand_Your_Info_Mobile() throws Exception {
		try {

			log.debug("Expand Your Info (Mobile)");

			yourInfo_Mobile.click();
			Thread.sleep(1000);

			log.info("(Mobile)Expanded Your Info successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("(Mobile)Not able to expand Your Info || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean expand_Spouse_Info_Mobile() throws Exception {
		try {

			log.debug("Expand Spouse Info (Mobile)");

			spouseInfo_Mobile.click();
			Thread.sleep(1000);

			log.info("(Mobile)Expanded Spouse Info successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("(Mobile)Not able to expand Spouse Info || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean expand_Child_Info_Mobile() throws Exception {
		try {

			log.debug("Expand Child Info (Mobile)");

			childInfo_Mobile.click();
			Thread.sleep(1000);

			log.info("(Mobile)Expanded Child Info successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("(Mobile)Not able to expand Child Info || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean verify_Benefit_Amount_for_Child_as_under_Traditional_term_Mobile(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Child under Traditional Term Life Insurance");
			reuseMethod.scrollDown(childInfo_Mobile);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtTrad_Child_Mobile.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Child Under Term Life Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Child Under Term Life Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Coverage Benefit Amount for Child Under Term Life Insurance || Fail"
					+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_under_MLI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under Manager Life Insurance");
			reuseMethod.scrollDown(BenefitAmtMLI_Self);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtMLI_Self.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Under Manager Life Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Self Under Manager Life Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Coverage Benefit Amount for Self Under  Life Insurance || Fail"
					+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Spouse_as_under_MLI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Spouse Under Manager Life Insurance");
			reuseMethod.scrollDown(BenefitAmtMLI_Spouse);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtMLI_Spouse.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Spouse Under Manager Life Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Spouse Under Manager Life Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Coverage Benefit Amount for Spouse Under  Life Insurance || Fail"
					+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Child_as_under_MLI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Child Under Manager Life Insurance");
			reuseMethod.scrollDown(BenefitAmtMLI_Child);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtMLI_Child.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Child Under Manager Life Insurance is Verified");

			log.info(
					"Coverage Benefit Amount for Child Under Manager Life Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Coverage Benefit Amount for Child Under  Life Insurance || Fail"
					+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Rider_Benefit_Amount_for_Self_as_under_MLI(String Benefit) throws Exception {
		try {

			log.debug("Verify Rider Benefit Amount for Self Under Manager Life Insurance");
			reuseMethod.scrollDown(OptionalAD_D_MLI_Self);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = OptionalAD_D_MLI_Self.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Rider Benefit Amount for Self Under Manager Life Insurance is Verified");

			log.info(
					"Rider Benefit Amount for Self Under Manager Life Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Rider Benefit Amount for Self Under Manager Life Insurance || Fail"
					+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Rider_Benefit_Amount_for_Spouse_as_under_MLI(String Benefit) throws Exception {
		try {

			log.debug("Verify Rider Benefit Amount for Spouse Under Manager Life Insurance");
			reuseMethod.scrollDown(OptionalAD_D_MLI_Spouse);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = OptionalAD_D_MLI_Spouse.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Rider Benefit Amount for Spouse Under Manager Life Insurance is Verified");

			log.info(
					"Rider Benefit Amount for Spouse Under Manager Life Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Rider Benefit Amount for Spouse Under Manager Life Insurance || Fail"
					+ e.getMessage());
			throw (e);

		}

	}

	public boolean validate_Self_Fname_Lname(String fname, String lname) throws Exception {
		try {

			log.debug("Validate First name and last name for self");
			String strReturnValue = SelfFname_Lname_header.getText().trim();
			String expectedValue = fname + " " + lname;
			if (strReturnValue.contains(expectedValue))
				log.info("Validate First name and last name for self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate First name and last name for self || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean verify_Benefit_Amount_for_Self_as_under_GTDLI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under GTDLI");
			reuseMethod.scrollDown(BenefitAmtGTDLI_Self);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtGTDLI_Self.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit, "Coverage Benefit Amount for Self Under GTDLI is Verified");

			log.info("Coverage Benefit Amount for Self Under GTDLI is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Coverage Benefit Amount for Self Under GTDLI || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Spouse_as_under_GTDLI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Spouse Under GTDLI");
			reuseMethod.scrollDown(BenefitAmtGTDLI_Spouse);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtGTDLI_Spouse.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit, "Coverage Benefit Amount for Spouse Under GTDLI is Verified");

			log.info("Coverage Benefit Amount for Spouse Under GTDLI is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Coverage Benefit Amount for Spouse Under GTDLI || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean validate_Spouse_Fname_Lname(String fname, String lname) throws Exception {
		try {

			log.debug("Validate First name and last name for spouse");
			String strReturnValue = SelfFname_Lname_header.getText().trim();
			String expectedValue = fname + " " + lname;
			if (strReturnValue.contains(expectedValue))
				log.info("Validate First name and last name for spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate First name and last name for spouse || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean verify_Benefit_Amount_for_First_Child_as_under_GTDLI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for First child Under GTDLI");
			reuseMethod.scrollDown(BenefitAmtGTDLI_FirstChild);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtGTDLI_FirstChild.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for First child Under GTDLI is Verified");

			log.info("Coverage Benefit Amount for First child Under GTDLI is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for First child Under GTDLI || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Second_Child_as_under_GTDLI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for First child Under GTDLI");
			reuseMethod.scrollDown(BenefitAmtGTDLI_SecondChild);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtGTDLI_SecondChild.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Second child Under GTDLI is Verified");

			log.info("Coverage Benefit Amount for Second child Under GTDLI is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Coverage Benefit Amount for Second child Under GTDLI || Fail"
					+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Third_Child_as_under_GTDLI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Third child Under GTDLI");
			reuseMethod.scrollDown(BenefitAmtGTDLI_ThirdChild);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtGTDLI_ThirdChild.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Third child Under GTDLI is Verified");

			log.info("Coverage Benefit Amount for Third child Under GTDLI is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Third child Under GTDLI || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Fourth_Child_as_under_GTDLI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Fourth child Under GTDLI");
			reuseMethod.scrollDown(BenefitAmtGTDLI_FourthChild);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtGTDLI_FourthChild.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Fourth child Under GTDLI is Verified");

			log.info("Coverage Benefit Amount for Fourth child Under GTDLI is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Coverage Benefit Amount for Fourth child Under GTDLI || Fail"
					+ e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Benefit_Amount_for_Fifth_Child_as_under_GTDLI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Fifth child Under GTDLI");
			reuseMethod.scrollDown(BenefitAmtGTDLI_FifthChild);
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			String actual_Amount = BenefitAmtGTDLI_FifthChild.getText();
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Fifth child Under GTDLI is Verified");

			log.info("Coverage Benefit Amount for Fifth child Under GTDLI is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Fifth child Under GTDLI || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Child_Fname_Lname(String fname, String lname) throws Exception {
		try {
			log.debug("Verify First and last name of child Under GTDLI ");
			WebElement childName = ChildFname_Lname_header
					.findElement(By.xpath(".//label[contains(text(),'" + fname + " " + lname + "')]"));
			reuseMethod.scrollDown(childName);
			childName.isDisplayed();
			log.info("First and last name of child Under GTDLI displayed successfully || Pass");

			return true;
		} catch (Exception e) {
			log.error("Not able to verify first and last name of child Under GTDLI || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean verify_Benefit_Amount_for_Self_as_under_ADnDRider_under_ARTL(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self for ADnD Rider under ARTL");

			String actual_Amount = BenefitAmtADD_SelfRider.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount.trim(), Benefit.trim(),
					"Coverage Benefit Amount for Self Under Term ADnD Rider under ARTL is Verified");

			log.info(
					"Coverage Benefit Amount for Self Under ADnD Rider under ARTL is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Coverage Benefit Amount for Self Under ADD Rider under ARTL || Fail"
					+ e.getMessage());
			throw (e);

		}
	}

	public boolean verify_Benefit_Amount_for_Spouse_as_under_ADDRider_under_ARTL(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Spouse for ADD Rider under ARTL");
			String actual_Amount = BenefitAmtADD_SpouseRider.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount.trim(), Benefit.trim(),
					"Coverage Benefit Amount for Spouse Under Term ADD Rider under ARTL is Verified");

			log.info(
					"Coverage Benefit Amount for Spouse Under ADD Rider under ARTL is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Coverage Benefit Amount for Spouse Under ADD Rider under ARTL || Fail"
					+ e.getMessage());
			throw (e);

		}
	}

	public boolean verify_Guaranteed_Purchase_Option_as_Yes_for_Self_under_BOE() throws Exception {
		try {

			log.debug("Verify Guaranteed Purchase Option as Yes for Self under BOE");
			String actual_Value = guaranteedValue_BOE.getText();

			Assert.assertEquals(actual_Value, "Yes", "Guaranteed Purchase Option for Self under BOE dos not match");

			log.info("Verified Guaranteed Purchase Option as Yes for Self under BOE successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to verify Guaranteed Purchase Option as Yes for Self under BOE || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean verify_Recovery_Option_as_Yes_for_Self_under_BOE() throws Exception {
		try {

			log.debug("Verify Recovery Option Option as Yes for Self under BOE");
			String actual_Value = recoveryValue_BOE.getText();

			Assert.assertEquals(actual_Value, "Yes", "Recovery Option for Self under BOE dos not match");

			log.info("Verified Recovery Option as Yes for Self under BOE successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify Recovery Option as Yes for Self under BOE || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean verify_Retroactive_Option_as_Yes_for_Self_under_BOE() throws Exception {
		try {

			log.debug("Verify Retroactive Option Option as Yes for Self under BOE");
			String actual_Value = RetroactiveValue_BOE.getText();

			Assert.assertEquals(actual_Value, "Yes", "Retroactive Option for Self under BOE dos not match");

			log.info("Verified Retroactive Option as Yes for Self under BOE successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify Retroactive Option as Yes for Self under BOE || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean verify_Benefit_Amount_for_Self_as_under_GDI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self under GDI");

			String actual_Amount = BenefitAmtGDI_Self.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount.trim(), Benefit.trim(),
					"Coverage Benefit Amount for Self Under GDI is Verified");

			log.info("Coverage Benefit Amount for Self Under GDI is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Coverage Benefit Amount for Self Under GDI || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean verify_Benefit_Option_for_Self_as_under_GDI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Option for Self Under Group Disability Insurance");

			String actual_Amount = BenefitOptionGDI_Self.getText();

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Option for Self Under Group Disability Insurance is Verified");

			log.info(
					"Coverage Benefit Option for Self Under Group Disability Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Coverage Benefit Option for Self Under Group Disability Insurance || Fail"
					+ e.getMessage());
			throw (e);
		}
	}
	
	public boolean verify_Partial_Disability_Benefit_Rider_for_Self_as_under_GDI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Partial Disability Benefit Rider for Self Under Group Disability Insurance");

			String actual_Amount = PartialDisabilityGDI_Self.getText();

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Partial Disability Benefit Rider for Self Under Group Disability Insurance is Verified");

			log.info(
					"Coverage Partial Disability Benefit Rider for Self Under Group Disability Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Coverage Partial Disability Benefit Rider for Self Under Group Disability Insurance || Fail"
					+ e.getMessage());
			throw (e);
		}
	}
	
	public boolean verify_Automatic_Benefit_Increase_Option_Rider_for_Self_as_under_GLI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Automatic Benefit Increase Option Rider for Self Under Group Life Insurance");

			String actual_Amount = AutomaticBenefitGLI_Self.getText();

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Automatic Benefit Increase Option Rider for Self Under Group Life Insurance is Verified");

			log.info(
					"Coverage Automatic Benefit Increase Option Rider for Self Under Group Life Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Coverage Automatic Benefit Increase Option Rider for Self Under Group Life Insurance || Fail"
					+ e.getMessage());
			throw (e);
		}
	}
	
	public boolean verify_Automatic_Benefit_Increase_Option_Rider_for_Spouse_as_under_GLI(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Automatic Benefit Increase Option Rider for Spouse Under Group Life Insurance");

			String actual_Amount = AutomaticBenefitGLI_Spouse.getText();

			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Automatic Benefit Increase Option Rider for Spouse Under Group Life Insurance is Verified");

			log.info(
					"Coverage Automatic Benefit Increase Option Rider for Spouse Under Group Life Insurance is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Coverage Automatic Benefit Increase Option Rider for Spouse Under Group Life Insurance || Fail"
					+ e.getMessage());
			throw (e);
		}
	}
	public boolean verify_Benefit_Amount_for_Self_as_under_ADD_Under_GTLP75I(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under Accidental Death and Dismemberment Rider under GTLP75I");
			reuseMethod.scrollDown(BenefitAmtADD_GTLP75ISelf);
			String actual_Amount = BenefitAmtADD_GTLP75ISelf.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Under Accidental Death and Dismemberment Rider under GTLP75I is Verified");
			log.info(
					"Coverage Benefit Amount for Self Under Accidental Death and Dismemberment Rider under GTLP75I is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Self Under Accidental Death and Dismemberment Rider under GTLP75I || Fail"
							+ e.getMessage());
			throw (e);
		}
	}
	
	public boolean verify_Benefit_Amount_for_Self_as_under_ADD_Under_Flex10(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under Accidental Death and Dismemberment Rider under Flex10");
			reuseMethod.scrollDown(BenefitAmtADD_Flex10Self);
			String actual_Amount = BenefitAmtADD_Flex10Self.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Under Accidental Death and Dismemberment Rider under Flex10 is Verified");
			log.info(
					"Coverage Benefit Amount for Self Under Accidental Death and Dismemberment Rider under Flex10 is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Self Under Accidental Death and Dismemberment Rider under Flex10 || Fail"
							+ e.getMessage());
			throw (e);
		}
	}
	
	public boolean verify_Benefit_Amount_for_Self_as_under_ADD_Under_Flex20(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Self Under Accidental Death and Dismemberment Rider under Flex20");
			reuseMethod.scrollDown(BenefitAmtADD_Flex20Self);
			String actual_Amount = BenefitAmtADD_Flex20Self.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Self Under Accidental Death and Dismemberment Rider under Flex20 is Verified");
			log.info(
					"Coverage Benefit Amount for Self Under Accidental Death and Dismemberment Rider under Flex20 is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Self Under Accidental Death and Dismemberment Rider under Flex20 || Fail"
							+ e.getMessage());
			throw (e);
		}
	}
	
	public boolean verify_Benefit_Amount_for_Spouse_as_under_ADD_Under_GTLP75I(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Spouse Under Accidental Death and Dismemberment Rider under GTLP75I");
			reuseMethod.scrollDown(BenefitAmtADD_GTLP75ISpouse);
			String actual_Amount = BenefitAmtADD_GTLP75ISpouse.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Spouse Under Accidental Death and Dismemberment Rider under GTLP75I is Verified");
			log.info(
					"Coverage Benefit Amount for Spouse Under Accidental Death and Dismemberment Rider under GTLP75I is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Spouse Under Accidental Death and Dismemberment Rider under GTLP75I || Fail"
							+ e.getMessage());
			throw (e);
		}
	}
	
	public boolean verify_Benefit_Amount_for_Spouse_as_under_ADD_Under_Flex10(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Spouse Under Accidental Death and Dismemberment Rider under Flex10");
			reuseMethod.scrollDown(BenefitAmtADD_Flex10Spouse);
			String actual_Amount = BenefitAmtADD_Flex10Spouse.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Spouse Under Accidental Death and Dismemberment Rider under Flex10 is Verified");
			log.info(
					"Coverage Benefit Amount for Spouse Under Accidental Death and Dismemberment Rider under Flex10 is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Spouse Under Accidental Death and Dismemberment Rider under Flex10 || Fail"
							+ e.getMessage());
			throw (e);
		}
	}
	
	public boolean verify_Benefit_Amount_for_Spouse_as_under_ADD_Under_Flex20(String Benefit) throws Exception {
		try {

			log.debug("Verify Coverage Benefit Amount for Spouse Under Accidental Death and Dismemberment Rider under Flex20");
			reuseMethod.scrollDown(BenefitAmtADD_Flex20Spouse);
			String actual_Amount = BenefitAmtADD_Flex20Spouse.getText();
			if (Benefit.contains("$")) {
				Benefit = Benefit.substring(1);
			}
			Benefit = Benefit.replaceAll(",", "");
			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");
			Assert.assertEquals(actual_Amount, Benefit,
					"Coverage Benefit Amount for Spouse Under Accidental Death and Dismemberment Rider under Flex20 is Verified");
			log.info(
					"Coverage Benefit Amount for Spouse Under Accidental Death and Dismemberment Rider under Flex20 is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to display Coverage Benefit Amount for Spouse Under Accidental Death and Dismemberment Rider under Flex20 || Fail"
							+ e.getMessage());
			throw (e);
		}
	}
	
	public boolean verify_Waiver_of_Premium_Rider_for_Self_under_GTLP75I_as_YES() throws Exception {
		try {
			log.debug(
					"Verify for self Wavier of Premium Rider is selected for GTLP75I");
			reuseMethod.scrollDown(Rider_WOP_GTLP75ISelf);
			String actual_Value = Rider_WOP_GTLP75ISelf.getText();
			if (actual_Value.equalsIgnoreCase("Yes")) {
				System.out.println(
						"(Self) Wavier of Premium Rider is selected for GTLP75I is Verified");
			}
			log.info(
					"(Self) Wavier of Premium Rider is selected for GTLP75I is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Rider Wavier of Premium for GTLP75I || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean verify_Waiver_of_Premium_Rider_for_Self_under_Flex10_as_YES() throws Exception {
		try {
			log.debug(
					"Verify for self Wavier of Premium Rider is selected for Flex10");
			reuseMethod.scrollDown(Rider_WOP_Flex10Self);
			String actual_Value = Rider_WOP_Flex10Self.getText();
			if (actual_Value.equalsIgnoreCase("Yes")) {
				System.out.println(
						"(Self) Wavier of Premium Rider is selected for Flex10 is Verified");
			}
			log.info(
					"(Self) Wavier of Premium Rider is selected for Flex10 is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Rider Wavier of Premium for Flex10 || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean verify_Waiver_of_Premium_Rider_for_Self_under_Flex20_as_YES() throws Exception {
		try {
			log.debug(
					"Verify for self Wavier of Premium Rider is selected for Flex20");
			reuseMethod.scrollDown(Rider_WOP_Flex20Self);
			String actual_Value = Rider_WOP_Flex20Self.getText();
			if (actual_Value.equalsIgnoreCase("Yes")) {
				System.out.println(
						"(Self) Wavier of Premium Rider is selected for Flex20 is Verified");
			}
			log.info(
					"(Self) Wavier of Premium Rider is selected for Flex20 is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Rider Wavier of Premium for Flex20 || Fail" + e.getMessage());
			throw (e);
		}
	}
}
