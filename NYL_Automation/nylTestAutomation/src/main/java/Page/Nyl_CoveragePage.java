package Page;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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

public class Nyl_CoveragePage extends SetUp {

	private static final boolean True = false;
	// public WebDriver driver = null;
	private final Logger log = LogManager.getLogger(Nyl_CoveragePage.class.getName());

	public Nyl_CoveragePage() {
		driver = getDriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	ReuseableMethod reuseMethod = new ReuseableMethod();
	ScreenShotUtility screenShotUtility = new ScreenShotUtility();
	propertyUtility PropertyUtility = new propertyUtility();

	@FindBy(id = "coverageLink")
	WebElement Coverage_Icon;

	@FindBy(id = "covg_LITenYr_Slf_rdTypeOfCovg-0")
	WebElement acs_CoverageNewTenYTL;

	@FindBy(id = "back")
	WebElement Previous;

	@FindBy(id = "cancel")
	WebElement Cancel;

	@FindBy(id = "saveForLater")
	WebElement SaveForLater;

	@FindBy(id = "next")
	WebElement Next;

	@FindBy(xpath = "//div[@class='slider-handle min-slider-handle']")
	WebElement Slider;

	@FindBy(id = "rdRiderOnlySlf-0")
	WebElement selfRiderOnlyYes;

	@FindBy(id = "rdRiderOnlySlf-1")
	WebElement selfRiderOnlyNo;

	@FindBy(id = "ciradioself1")
	WebElement SelfRiderYes;

	@FindBy(id = "ciradioself2")
	WebElement SelfRiderNo;

	@FindBy(id = "rdRiderOnlySps-0")
	WebElement spouseRiderOnlyYes;

	@FindBy(id = "rdRiderOnlySps-1")
	WebElement spouseRiderOnlyNo;

	@FindBy(xpath = "//label[contains(text(),'Request Coverage')]")
	WebElement RequestCoveragePage;

	@FindBy(xpath = "//div[@data-fields='lblLIFiveYr']//span[@class='lblLIFiveYr']")
	WebElement MaxAggregate_FiveYr;

	@FindBy(xpath = "//div[@data-fields='lblLITenYr']//span[@class='lblLITenYr']")
	WebElement MaxAggregate_TenYr;

	@FindBy(xpath = "//div[@data-fields='lblLITwentyYr']//span[@class='lblLITwentyYr']")
	WebElement MaxAggregate_TwentyYr;

	@FindBy(xpath = "//input[@id='covg_DIGrpDisable2_Slf_txtMaxBenefitAmt' or @id='covg_DIGrpDisable_Slf_txtMaxBenefitAmt' or @id='covg_DIGrpDisable3_Slf_txtMaxBenefitAmt']")
	WebElement MaxBenefitAmount_DII;
	
	@FindBy(xpath = "//input[@id='rider_DIGrpDisable_chk_cat_Slf']")
	WebElement Rider_Catastrophic_DII;

	@FindBy(xpath = "//input[@id='rider_DIGrpDisable_chk_cola_Slf']")
	WebElement Rider_COLA_DII;

	@FindBy(xpath = "//div[@class='row MA-0 field-rider_DIGrpDisable_widget_cat_Slf']//i")
	WebElement RiderMessage;

	@FindBy(xpath = "//span[@class='alert-txt']")
	WebElement CoverageErrorMsg;

	@FindBy(xpath = "//div[@id='page-spouse']//div[@class='info']/label[1]")
	WebElement CoveragenotificationMsgSpouse1;

	@FindBy(xpath = "//div[@id='page-spouse']//div[@class='info']/label[2]")
	WebElement CoveragenotificationMsgSpouse2;

	@FindBy(id = "covg_LIAnnual_Slf_rdTypeOfCovg-0")
	WebElement newCoverageSelf_Traditional;

	@FindBy(id = "covg_LIAnnual_Slf_rdTypeOfCovg-1")
	WebElement changeCoverageSelf_Traditional;

	@FindBy(xpath = "//div[@data-fields='covg_LIAnnual_Sps']")
	WebElement SpouseSection_Traditional;

	@FindBy(xpath = "//div[@data-fields='covg_LITenYr_Sps']")
	WebElement SpouseSection_Ten;

	@FindBy(id = "covg_LIAnnual_Sps_rdTypeOfCovg-0")
	WebElement newCoverageSpouse_Traditional;

	@FindBy(id = "covg_LIAnnual_Sps_rdTypeOfCovg-1")
	WebElement changeCoverageSpouse_Traditional;

	@FindBy(id = "covg_LITenYr_Slf_rdTypeOfCovg-0")
	WebElement newCoverageSelf_Ten;

	@FindBy(id = "covg_LITenYr_Slf_rdTypeOfCovg-1")
	WebElement changeCoverageSelf_Ten;

	@FindBy(id = "covg_LITenYr_Sps_rdTypeOfCovg-0")
	WebElement newCoverageSpouse_Ten;

	@FindBy(id = "covg_LITenYr_Sps_rdTypeOfCovg-1")
	WebElement changeCoverageSpouse_Ten;

	@FindBy(id = "covg_LIFifteenYr_Slf_rdTypeOfCovg-0")
	WebElement newCoverageSelf_Fifteen;

	@FindBy(id = "covg_LIFifteenYr_Slf_rdTypeOfCovg-1")
	WebElement changeCoverageSelf_Fifteen;

	@FindBy(id = "covg_LIFifteenYr_Sps_rdTypeOfCovg-0")
	WebElement newCoverageSpouse_Fifteen;

	@FindBy(id = "covg_LIFifteenYr_Sps_rdTypeOfCovg-1")
	WebElement changeCoverageSpouse_Fifteen;

	@FindBy(id = "covg_LITwentyYr_Slf_rdTypeOfCovg-0")
	WebElement newCoverageSelf_Twenty;

	@FindBy(id = "covg_LITwentyYr_Slf_rdTypeOfCovg-1")
	WebElement changeCoverageSelf_Twenty;

	@FindBy(id = "covg_LITwentyYr_Sps_rdTypeOfCovg-0")
	WebElement newCoverageSpouse_Twenty;

	@FindBy(id = "covg_LITwentyYr_Sps_rdTypeOfCovg-1")
	WebElement changeCoverageSpouse_Twenty;

	@FindBy(id = "covg_AccdntDeath_Slf_rdTypeOfCovg-0")
	WebElement newCoverageSelf_ADDI;

	@FindBy(id = "covg_AccdntDeath_Slf_rdTypeOfCovg-1")
	WebElement changeCoverageSelf_ADDI;

	@FindBy(id = "rider_LIAnnual_widget_adnd_Sps_rdTypeOfCovg-0")
	WebElement newCoverageSpouse_AdnD_TermLife;

	@FindBy(id = "rider_LIAnnual_widget_adnd_Sps_rdTypeOfCovg-1")
	WebElement changeCoverageSpouse_AdnD_TermLife;

	// TIE
	@FindBy(id = "covg_AccdntDeath1_Sps_rdTypeOfCovg-0")
	WebElement newCoverageSpouse_ADDI;

	@FindBy(id = "covg_AccdntDeath1_Sps_rdTypeOfCovg-1")
	WebElement changeCoverageSpouse_ADDI;

	@FindBy(id = "covg_AccdntDeath1_Chd_rdTypeOfCovg-0")
	WebElement newCoverageChild_ADDI;

	@FindBy(id = "covg_AccdntDeath1_Chd_rdTypeOfCovg-1")
	WebElement changeCoverageChild_ADDI;

	//GEOCARE
	
	@FindBy(id = "heading_lblHdrLIFtDTermLif")
	WebElement FirstToDie_Label;
	
	@FindBy(id = "covg_LIFtDTermLif_Slf_rdTypeOfCovg-0")
	WebElement newCoverage_FirstToDie_SelfSpouse;
	
	@FindBy(id = "covg_LIFtDTermLif_Slf_rdTypeOfCovg-1")
	WebElement ChangeInCoverage_FirstToDie_SelfSpouse;
	
	@FindBy(id = "covg_LIFtDTermLif_Slf_slidBenefitAmt-minLabel")
	WebElement FirstToDie_Min_SelfSpouse;

	@FindBy(id = "covg_LIFtDTermLif_Slf_slidBenefitAmt-maxLabel")
	WebElement FirstToDie_Max_SelfSpouse;
	
	@FindBy(id = "covg_LIFtDTermLif_Slf_slidBenefitAmt-sliderLabel")
	WebElement FirstToDie_BenefitAmount_SelfSpouse;
	
	@FindBy(xpath = "//span[@id='covg_LIFtDTermLif_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_FirstToDie_Self;

	@FindBy(xpath = "//span[@id='covg_LIFtDTermLif_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_FirstToDie_Self;
	
	
	// *******************

	@FindBy(id = "covg_AccdntDeath2_Sps_rdTypeOfCovg-0")
	WebElement newCoverageSpouse_AdnD;

	@FindBy(id = "covg_AccdntDeath2_Sps_rdTypeOfCovg-1")
	WebElement changeCoverageSpouse_AdnD;

	@FindBy(id = "covg_DILong_Slf_rdTypeOfCovg-0")
	WebElement newCoverageSelf_LTD;

	@FindBy(id = "covg_DILong_Slf_rdTypeOfCovg-1")
	WebElement changeCoverageSelf_LTD;

	@FindBy(id = "covg_DIShort3_Slf_rdTypeOfCovg-0")
	WebElement newCoverageSelf_STD;

	@FindBy(id = "covg_DIShort3_Slf_rdTypeOfCovg-1")
	WebElement changeCoverageSelf_STD;

	@FindBy(id = "covg_GrpOffOvr_Slf_rdTypeOfCovg-0")
	WebElement newCoverageSelf_OO;

	@FindBy(id = "covg_GrpOffOvr_Slf_rdTypeOfCovg-1")
	WebElement changeCoverageSelf_OO;

	@FindBy(id = "covg_DILong25_Slf_rdTypeOfCovg-0")
	WebElement newCoverageSelf_SDI;

	@FindBy(id = "covg_DILong25_Slf_rdTypeOfCovg-1")
	WebElement changeCoverageSelf_SDI;

	@FindBy(id = "covg_HospitalIndem_Slf_rdTypeOfCovg-0")
	WebElement newCoverageSelf_HII;

	@FindBy(id = "covg_HospitalIndem_Slf_rdTypeOfCovg-1")
	WebElement changeCoverageSelf_HII;

	@FindBy(id = "covg_HospitalIndem_Sps_rdTypeOfCovg-0")
	WebElement newCoverageSpouse_HII;

	@FindBy(id = "covg_HospitalIndem_Sps_rdTypeOfCovg-1")
	WebElement changeCoverageSpouse_HII;

	@FindBy(id = "covg_HospitalIndem_Chd_rdTypeOfCovg-0")
	WebElement newCoverageChild_HII;

	@FindBy(id = "covg_HospitalIndem_Chd_rdTypeOfCovg-1")
	WebElement changeCoverageChild_HII;

	// TIE
	@FindBy(xpath="//input[@id = 'covg_DIGrpDisable2_Slf_rdTypeOfCovg-0' or @id='covg_DIGrpDisable3_Slf_rdTypeOfCovg-0']")
	WebElement newCoverageSelf_DII_nd_DIP;
	
	//@FindBy(id = "covg_DIGrpDisable2_Slf_rdTypeOfCovg-1")
	@FindBy(xpath="//input[@id = 'covg_DIGrpDisable2_Slf_rdTypeOfCovg-1' or @id='covg_DIGrpDisable3_Slf_rdTypeOfCovg-1']")
	WebElement changeCoverageSelf_DII_nd_DIP;

	/****************** Benefit amount for Five Year Products *******************/

	/*---------------------------Self----------------------*/

	@FindBy(xpath = "//span[@id='covg_LIFiveYr_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_FiveYrProduct;

	@FindBy(xpath = "//span[@id='covg_LIFiveYr_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_FiveYrProduct;

	@FindBy(id = "covg_LIFiveYr_Chd_selBenefitAmt")
	WebElement BenefitAmount_Child_FiveYrProduct;
	
	@FindBy(xpath = "//select[@id='covg_LIFiveYr_Chd_selBenefitAmt']/option[2]")
	WebElement BenefitAmount_Child_FiveYrProduct_fixed;

	@FindBy(id = "covg_LIFiveYr_Slf_slidBenefitAmt-sliderLabel")
	WebElement abeSelfBenefitAmount5Yr;

	@FindBy(id = "covg_LIFiveYr_Slf_slidBenefitAmt-minLabel")
	WebElement MinAmount_FiveYrSelf;

	@FindBy(id = "covg_LIFiveYr_Slf_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_FiveYrSelf;

	@FindBy(xpath = "//input[@id='rider_LIFiveYr_chk_ccr_Slf']")
	WebElement ChronicRider_FiveYrSelf;

	/*-------------------Spouse-------------------------------*/
	@FindBy(id = "covg_LIFiveYr_Sps_slidBenefitAmt-sliderLabel")
	WebElement abeSpouseBenefitAmount5Yr;

	@FindBy(xpath = "//span[@id='covg_LIFiveYr_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Spouse_FiveYrProduct;

	@FindBy(xpath = "//span[@id='covg_LIFiveYr_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Spouse_FiveYrProduct;

	@FindBy(id = "covg_LIFiveYr_Sps_slidBenefitAmt-minLabel")
	WebElement MinAmount_FiveYrSpouse;

	@FindBy(id = "covg_LIFiveYr_Sps_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_FiveYrSpouse;

	@FindBy(xpath = "//input[@id='rider_LIFiveYr_chk_ccr_Sps']")
	WebElement ChronicRider_FiveYrSpouse;

	@FindBy(id = "covg_DILong1_Sps_txtBenefitAmt")
	WebElement BenefitAmnt_SpouseLTD;

	@FindBy(xpath = "//ul[@id='rdEligIsMemberSps']//following-sibling::div[contains(@class,'error')]")
	WebElement Validation_SpouseMember_EligibilityPage_Spouse;

	/*------------Child--------------------------*/

	@FindBy(id = "covg_LIFiveYr_Chd_selBenefitAmt")
	WebElement BenefitAmount_Child_5YrProduct;

	// WAEPA-For disablr child drop down
	@FindBy(xpath = "//select[@id='covg_LIFiveYr_Chd_selBenefitAmt' and @disabled]")
	WebElement BenefitAmount_Child_5YrProduct_Disabled;
	/*****************
	 * Benefit amount for Ten Year Products
	 ************************************/

	/*---------------------------Self----------------------*/

	@FindBy(id = "covg_LITenYr_Slf_slidBenefitAmt-sliderLabel")
	WebElement abeSelfBenefitAmount10Yr;

	@FindBy(xpath = "//span[@id='covg_LITenYr_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_TenYrProduct;

	@FindBy(xpath = "//span[@id='covg_LITenYr_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_TenYrProduct;

	@FindBy(id = "covg_LITenYr_Slf_slidBenefitAmt-minLabel")
	WebElement MinAmount_TenYrSelf;

	@FindBy(id = "covg_LITenYr_Slf_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_TenYrSelf;

	@FindBy(xpath = "//input[@id='rider_LITenYr_chk_wop_Slf']")
	WebElement Rider_TenYrSelf;

	/*---------------------------Spouse -----------------------------*/

	@FindBy(id = "covg_LITenYr_Sps_slidBenefitAmt-sliderLabel")
	WebElement SpouseBenefitAmount10Yr;

	@FindBy(xpath = "//span[@id='covg_LITenYr_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Spouse_TenYrProduct;

	@FindBy(xpath = "//span[@id='covg_LITenYr_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Spouse_TenYrProduct;

	@FindBy(id = "covg_LITenYr_Sps_slidBenefitAmt-minLabel")
	WebElement MinAmount_TenYrSpouse;

	@FindBy(id = "covg_LITenYr_Sps_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_TenYrSpouse;

	@FindBy(xpath = "//input[@id='rider_LITenYr_chk_wop_Sps']")
	WebElement Rider_TenYrSpouse;

	/*------------Child--------------------------*/
	@FindBy(id = "covg_LITenYr_Chd_selBenefitAmt")
	WebElement BenefitAmount_Child_10YrProduct;

	@FindBy(id = "heading_lblHdrLITenYr")
	WebElement TenYrProduct_Label_Child;

	/******************
	 * Benefit amount for Fifteen Year Products
	 ************************************/

	/*--------------------Self---------------------*/

	@FindBy(id = "covg_LIFifteenYr_Slf_slidBenefitAmt-sliderLabel")
	WebElement SelfBenefitAmount15Yr;

	@FindBy(xpath = "//span[@id='covg_LIFifteenYr_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_FifteenYrProduct;

	@FindBy(xpath = "//span[@id='covg_LIFifteenYr_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_FifteenYrProduct;

	@FindBy(id = "covg_LIFifteenYr_Slf_slidBenefitAmt-minLabel")
	WebElement FifteenMin_AmntSelf;

	@FindBy(id = "covg_LIFifteenYr_Slf_slidBenefitAmt-maxLabel")
	WebElement FifteenMax_AmntSelf;

	@FindBy(id = "rider_LIFifteenYr_chk_wop_Slf")
	WebElement WOP_Rider_FifteenYTL;

	@FindBy(id = "rider_LIFifteenYr_chk_adnd_Slf")
	WebElement ADnD_Rider_FifteenYTL;

	@FindBy(id = "rider_LIFifteenYr_widget_adnd_Slf_slidBenefitAmt-sliderLabel")
	WebElement SelfBenefitAmount15Yr_ADnDRider;

	@FindBy(xpath = "//span[@id='rider_LIFifteenYr_widget_adnd_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_FifteenYrProduct_ADnDRider;

	@FindBy(xpath = "//span[@id='rider_LIFifteenYr_widget_adnd_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_FifteenYrProduct_ADnDRider;

	@FindBy(id = "rider_LIFifteenYr_widget_adnd_Slf_slidBenefitAmt-minLabel")
	WebElement FifteenMin_AmntSelf_ADnDRider;

	@FindBy(id = "rider_LIFifteenYr_widget_adnd_Slf_slidBenefitAmt-maxLabel")
	WebElement FifteenMax_AmntSelf_ADnDRider;

	/*****************
	 * Benefit amount for Twenty Year Products
	 ************************************/

	/*---------------------------Self----------------------*/

	@FindBy(id = "covg_LITwentyYr_Slf_slidBenefitAmt-sliderLabel")
	WebElement SelfBenefitAmount20Yr;



	@FindBy(id = "covg_LITwentyYr_Slf_slidBenefitAmt-minLabel")
	WebElement MinAmount_TwentyYrSelf;

	@FindBy(id = "covg_LITwentyYr_Slf_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_TwentyYrSelf;

	@FindBy(xpath = "//span[@id='covg_LITwentyYr_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_TwentyYrProduct;

	@FindBy(xpath = "//span[@id='covg_LITwentyYr_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_TwentyYrProduct;



	@FindBy(xpath = "//input[@id='rider_LITwentyYr_chk_wop_Slf']")
	WebElement Rider_TwentyYrSelf;

	@FindBy(xpath = "//span[@id='rider_DILong_widget_fpo_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_LTDFPO;

	@FindBy(xpath = "//span[@id='rider_DILong_widget_fpo_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_LTDFPO;

	/*-------------------Spouse----------------------------*/

	@FindBy(id = "covg_LITwentyYr_Sps_slidBenefitAmt-sliderLabel")
	WebElement abeSpouseBenefitAmount20Yr;

	@FindBy(id = "covg_LIFifteenYr_Sps_slidBenefitAmt-sliderLabel")
	WebElement spouseBenefitAmount15Yr;

	@FindBy(id = "covg_AccdntDeath2_Sps_selBenefitAmt")
	WebElement spouseBenefitAmount_ADnD;

	@FindBy(id = "covg_LITwentyYr_Sps_slidBenefitAmt-minLabel")
	WebElement MinAmount_TwentyYrSpouse;

	@FindBy(id = "covg_LITwentyYr_Sps_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_TwentyYrSpouse;

	@FindBy(xpath = "//span[@id='covg_LITwentyYr_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Spouse_TwentyYrProduct;

	@FindBy(xpath = "//span[@id='covg_LITwentyYr_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Spouse_TwentyYrProduct;

	@FindBy(xpath = "//span[@id='covg_LIFifteenYr_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Spouse_FifteenYrProduct;

	@FindBy(xpath = "//span[@id='covg_LIFifteenYr_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Spouse_FifteenYrProduct;

	@FindBy(xpath = "//input[@id='rider_LITwentyYr_chk_wop_Sps']")
	WebElement Rider_TwentyYrSpouse;

	/*----------Child-------------*/

	@FindBy(id = "covg_LITwentyYr_Chd_selBenefitAmt")
	WebElement BenefitAmount_Child_20YrProduct;

	@FindBy(xpath = "//select[@id='covg_LITwentyYr_Chd_selBenefitAmt']//parent::div")
	WebElement BenefitAmount_Child_20YrProduct_label;

	@FindBy(id = "covg_LIFifteenYr_Chd_selBenefitAmt")
	WebElement BenefitAmount_Child_15YrProduct;

	/*****************
	 * Benefit amount for Fifty Year Products
	 ************************************/

	/****************** Self ******************************/

	@FindBy(id = "covg_LIFiftyYr_Slf_slidBenefitAmt-sliderLabel")
	WebElement abeSelfBenefitAmount50Yr;

	@FindBy(id = "covg_ADOnlyAccidntDthOnly_Slf_slidBenefitAmt-sliderLabel")
	WebElement CatfBenefitAmountAccidentalDeath;

	
	
	@FindBy(id = "covg_ADOnlyAccidntDthOnly_Slf_slidBenefitAmt-minLabel")
	WebElement MinAmount_AccidentalDeath;
	
	@FindBy(id = "covg_ADOnlyAccidntDthOnly_Slf_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_AccidentalDeath;
	
	
	@FindBy(id = "covg_LIFiftyYr_Slf_slidBenefitAmt-minLabel")
	WebElement MinAmount_FiftyYrSelf;
	
	@FindBy(id = "covg_LIFiftyYr_Slf_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_FiftyYrSelf;

		
		
		
		
	@FindBy(xpath = "//span[@id='covg_LIFiftyYr_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_FiftyYrProduct;

	@FindBy(xpath = "//span[@id='covg_LIFiftyYr_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_FiftyYrProduct;
	
	@FindBy(xpath = "//span[@id='covg_ADOnlyAccidntDthOnly_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_AccidentalDeath;
	
	@FindBy(xpath = "//span[@id='covg_ADOnlyAccidntDthOnly_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_AccidentalDeath;
	

	/*----------------Spouse----------------------*/

	@FindBy(id = "covg_LIFiftyYr_Sps_slidBenefitAmt-sliderLabel")
	WebElement abeSpouseBenefitAmount50Yr;

	@FindBy(id = "covg_LIFiftyYr_Sps_slidBenefitAmt-minLabel")
	WebElement MinAmount_FiftyYrSpouse;

	@FindBy(id = "covg_LIFiftyYr_Sps_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_FiftyYrSpouse;

	@FindBy(xpath = "//span[@id='covg_LIFiftyYr_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Spouse_FiftyYrProduct;

	@FindBy(xpath = "//span[@id='covg_LIFiftyYr_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Spouse_FiftyYrProduct;

	/*****************
	 * Benefit amount for Accidental Death Products
	 ************************************/

	/****************** Self ******************************/

	@FindBy(id = "covg_AccdntDeath_Slf_slidBenefitAmt-sliderLabel")
	WebElement abeSelfBenefitAmountAccidentalProduct;

	@FindBy(id = "covg_AccdntDeath_Slf_slidBenefitAmt-minLabel")
	WebElement MinAmount_ACCDeathSelf;

	@FindBy(id = "covg_AccdntDeath_Slf_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_ACCDeathSelf;

	@FindBy(xpath = "//span[@id='covg_AccdntDeath_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_AccidentalProduct;

	@FindBy(xpath = "//span[@id='covg_AccdntDeath_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_AccidentalProduct;

	// TIE
	@FindBy(id = "slidADNDInforceBenefitAmt-sliderLabel")
	WebElement BenefitAmount_ADDI_Self;

	@FindBy(id = "slidADNDInforceBenefitAmt-minLabel")
	WebElement MinAmount_ADnD_Self;

	@FindBy(id = "slidADNDInforceBenefitAmt-maxLabel")
	WebElement MaxAmount_ADnD_Self;

	@FindBy(xpath = "//span[@id='slidADNDInforceBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_ADnD_Self;

	@FindBy(xpath = "//span[@id='slidADNDInforceBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_ADnD_Self;

	///////////////////////////////////////////// Spouse/////////////////////////////////

	@FindBy(id = "covg_AccdntDeath_Sps_slidBenefitAmt-sliderLabel")
	WebElement abeSpouseBenefitAmountAccidentalProduct;

	@FindBy(xpath = "//span[@id='covg_AccdntDeath_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Spouse_AccidentalProduct;

	@FindBy(xpath = "//span[@id='covg_AccdntDeath_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Spouse_AccidentalProduct;

	@FindBy(id = "covg_AccdntDeath_Chd_selBenefitAmt")
	WebElement BenefitAmount_Child_AccidentalProduct;

	@FindBy(id = "covg_AccdntDeath_Sps_slidBenefitAmt-minLabel")
	WebElement MinAmount_ACCSpouse;

	@FindBy(id = "covg_AccdntDeath_Sps_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_ACCSpouse;

	@FindBy(xpath = "//input[@id='covg_AccdntDeath1_Sps_txtBenefitAmt']")
	WebElement BenefitAmountVerify_ADDI_Spouse;

	@FindBy(id = "covg_AccdntDeath1_Chd_txtBenefitAmt")
	WebElement BenefitAmountVerify_ADDI_Child;

	/*****************
	 * Benefit amount for Long term Disability Plus Products
	 ************************************/

	/****************** Self ******************************/

	@FindBy(id = "covg_DILongPlus_Slf_slidMonBenefitAmt-sliderLabel")
	WebElement abeSelfBenefitAmountLTDPProduct;

	@FindBy(id = "covg_DILongPlus_Slf_slidMonBenefitAmt-minLabel")
	WebElement MinAmount_LTDPSelf;

	@FindBy(id = "covg_DILongPlus_Slf_slidMonBenefitAmt-maxLabel")
	WebElement MaxAmount_LTDPSelf;

	@FindBy(xpath = "//span[@id='covg_DILongPlus_Slf_slidMonBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_LTDPProduct;

	@FindBy(xpath = "//span[@id='covg_DILongPlus_Slf_slidMonBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_LTDPProduct;

	@FindBy(id = "covg_DILongPlus_Slf_selWaitingPeriod")
	WebElement WaitingPeriod_LTDP;

	@FindBy(xpath = "//input[@id='rider_DILongPlus_chk_catstrophicDisBft_Slf']")
	WebElement Rider_Catastrophic;

	@FindBy(xpath = "//input[@id='rider_DILongPlus_chk_cola_Slf']")
	WebElement Rider_COLA_LTDP;

	@FindBy(xpath = "//input[@id='rider_DILongPlus_chk_LSLPB_Slf']")
	WebElement Law_School_LTDP;

	//////////////////////////////////////// Spouse/////////////////////////

	@FindBy(id = "covg_DILongPlus_Sps_slidMonBenefitAmt-sliderLabel")
	WebElement abeSpouseBenefitAmountLTDPProduct;

	@FindBy(id = "covg_DILongPlus_Sps_slidMonBenefitAmt-minLabel")
	WebElement MinAmount_LTDPSpouse;

	@FindBy(id = "covg_DILongPlus_Sps_slidMonBenefitAmt-maxLabel")
	WebElement MaxAmount_LTDPSpouse;

	@FindBy(xpath = "//span[@id='covg_DILongPlus_Sps_slidMonBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Spouse_LTDPProduct;

	@FindBy(xpath = "//span[@id='covg_DILongPlus_Sps_slidMonBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Spouse_LTDPProduct;

	@FindBy(id = "covg_DILongPlus_Sps_selWaitingPeriod")
	WebElement WaitingPeriodSpouse_LTDP;

	@FindBy(xpath = "//input[@id='rider_DILongPlus_chk_catstrophicDisBft_Sps']")
	WebElement Rider_Catastrophic_Spouse;

	@FindBy(xpath = "//input[@id='rider_DILongPlus_chk_cola_Sps']")
	WebElement Rider_COLA_LTDP_Spouse;

	/******************
	 * Benefit amount for Long term Disability Products
	 ************************************/

	/****************** Self ******************************/

	@FindBy(xpath = "//span[@id='covg_DILong1_Slf_slidMonBenefitAmt-sliderLabel' or @id='covg_DILong_Slf_slidMonBenefitAmt-sliderLabel']")
	WebElement abeSelfBenefitAmountLTDProduct;

	@FindBy(xpath = "//div[@id='covg_DILong1_Slf_slidMonBenefitAmt-minLabel' or @id='covg_DILong_Slf_slidMonBenefitAmt-minLabel']")
	WebElement MinAmount_LTDSelf;

	@FindBy(xpath = "//div[@id='covg_DILong_Slf_slidMonBenefitAmt-maxLabel' or @id='covg_DILong1_Slf_slidMonBenefitAmt-maxLabel']")
	WebElement MaxAmount_LTDSelf;

	@FindBy(xpath = "//span[@id='covg_DILong_Slf_slidMonBenefitAmt-sliderLabel' or @id='covg_DILong1_Slf_slidMonBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_LTDProduct;

	@FindBy(xpath = "//span[@id='covg_DILong_Slf_slidMonBenefitAmt-sliderLabel'or @id='covg_DILong1_Slf_slidMonBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_LTDProduct;

	@FindBy(id = "covg_DILong_Slf_selWaitingPeriod")
	WebElement WaitingPeriod_LTD;

	@FindBy(xpath = "//input[@id='rider_DILong_chk_cola_Slf']")
	WebElement Rider_COLA_Self_LTD;

	@FindBy(xpath = "//input[@id='rider_DILong_chk_LSLPB_Slf']")
	WebElement Law_School_LTD;

	@FindBy(xpath = "//input[@id='rider_DILong_chk_fpo_Slf']")
	WebElement FPO_Self_LTD;

	@FindBy(id = "rider_DILong_widget_fpo_Slf_slidBenefitAmt-sliderLabel")
	WebElement FPO_Self_SliderAmntLTD;

	//////////// Spouse/////////////////////////////////

	@FindBy(id = "covg_DILong_Sps_slidMonBenefitAmt-sliderLabel")
	WebElement abeSpouseBenefitAmountLTDProduct;

	@FindBy(id = "covg_DILong_Sps_slidMonBenefitAmt-minLabel")
	WebElement MinAmount_LTDSpouse;

	@FindBy(id = "covg_DILong_Sps_slidMonBenefitAmt-maxLabel")
	WebElement MaxAmount_LTDSpouse;

	@FindBy(xpath = "//span[@id='covg_DILong_Sps_slidMonBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Spouse_LTDProduct;

	@FindBy(xpath = "//span[@id='covg_DILong_Sps_slidMonBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Spouse_LTDProduct;

	@FindBy(id = "covg_DILong_Sps_selWaitingPeriod")
	WebElement WaitingPeriodSpouse_LTD;

	@FindBy(xpath = "//input[@id='rider_DILong_chk_cola_Sps']")
	WebElement Rider_COLA_LTD_Spouse;

	/******************
	 * Benefit amount for Group Long term Disability Products
	 ************************************/

	/****************** Self ******************************/

	@FindBy(id = "covg_DILong3_Slf_slidBenefitAmt-sliderLabel")
	WebElement SelfBenefitAmountGLTDProduct;

	@FindBy(xpath = "//div[@id='covg_DILong3_Slf_slidBenefitAmt-minLabel']")
	WebElement MinAmount_GLTDSelf;

	@FindBy(xpath = "//div[@id='covg_DILong3_Slf_slidBenefitAmt-maxLabel']")
	WebElement MaxAmount_GLTDSelf;

	@FindBy(xpath = "//span[@id='covg_DILong3_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_GLTDProduct;

	@FindBy(xpath = "//span[@id='covg_DILong3_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_GLTDProduct;

	@FindBy(id = "covg_DILong3_Slf_selWaitingPeriod")
	WebElement WaitingPeriod_GLTD;

	@FindBy(id = "covg_DILong3_Slf_selBenefitDuration")
	WebElement BenefitDuration_GLTD;

	@FindBy(id = "covg_DILong3_Slf_txtBenefitAmt")
	WebElement BenefitAmount_GLTDI;

	/*****************
	 * Benefit amount for Mid Term Disability Products
	 ************************************/

	/****************** Self ******************************/

	@FindBy(id = "covg_DIShort_Slf_slidMonBenefitAmt-sliderLabel")
	WebElement abeSelfBenefitAmountMIDProduct;

	@FindBy(id = "covg_DIShort_Slf_slidMonBenefitAmt-minLabel")
	WebElement MinAmount_MIDSelf;

	@FindBy(id = "covg_DIShort_Slf_slidMonBenefitAmt-maxLabel")
	WebElement MaxAmount_MIDSelf;

	@FindBy(id = "covg_DIShort_Slf_selWaitingPeriod")
	WebElement WaitingPeriod_MID;

	@FindBy(xpath = "//span[@id='covg_DIShort_Slf_slidMonBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_MIDProduct;

	@FindBy(xpath = "//span[@id='covg_DIShort_Slf_slidMonBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_MIDProduct;

	///////////////// Spouse//////////////////////////////////////

	@FindBy(id = "covg_DIShort_Sps_slidMonBenefitAmt-sliderLabel")
	WebElement abeSpouseBenefitAmountMIDProduct;

	@FindBy(id = "covg_DIShort_Sps_slidMonBenefitAmt-minLabel")
	WebElement MinAmount_MIDSpouse;

	@FindBy(id = "covg_DIShort_Sps_slidMonBenefitAmt-maxLabel")
	WebElement MaxAmount_MIDSpouse;

	@FindBy(xpath = "//span[@id='covg_DIShort_Sps_slidMonBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Spouse_MIDProduct;

	@FindBy(xpath = "//span[@id='covg_DIShort_Sps_slidMonBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Spouse_MIDProduct;

	@FindBy(id = "covg_DIShort_Sps_selWaitingPeriod")
	WebElement WaitingPeriod_MID_Spouse;

	/*****************
	 * * Benefit amount for Short Term Disability Products
	 ************************************/

	/****************** Self ******************************/

	@FindBy(id = "covg_DIShort3_Slf_slidBenefitAmt-minLabel")
	WebElement MinAmount_STDSelf;

	@FindBy(id = "covg_DIShort3_Slf_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_STDSelf;

	@FindBy(id = "covg_DIShort3_Slf_slidBenefitAmt-sliderLabel")
	WebElement SelfBenefitAmount_STDProduct;

	@FindBy(xpath = "//span[@id='covg_DIShort3_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_STDProduct;

	@FindBy(xpath = "//span[@id='covg_DIShort3_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_STDProduct;

	@FindBy(id = "covg_DIShort3_Slf_selWaitingPeriod")
	WebElement WaitingPrd_Self_STD;

	@FindBy(id = "covg_DIShort3_Slf_selBenefitDuration")
	WebElement BenefitDur_Self_STD;

	/*****************
	 * Benefit amount for Retirement Disability Products
	 ************************************/

	/****************** Self ******************************/

	@FindBy(id = "covg_DIRetirement_Slf_slidMonBenefitAmt-sliderLabel")
	WebElement abeSelfBenefitAmountRetireProduct;

	@FindBy(id = "covg_DIRetirement_Slf_slidMonBenefitAmt-minLabel")
	WebElement MinAmount_RetireSelf;

	@FindBy(id = "covg_DIRetirement_Slf_slidMonBenefitAmt-maxLabel")
	WebElement MaxAmount_RetireSelf;

	@FindBy(xpath = "//span[@id='covg_DIRetirement_Slf_slidMonBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_RetireProduct;

	@FindBy(xpath = "//span[@id='covg_DIRetirement_Slf_slidMonBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_RetireProduct;

	@FindBy(id = "covg_DIRetirement_Slf_selWaitingPeriod")
	WebElement WaitingPeriod_Retire;

	/*****************
	 * Benefit amount for Professional Overhead Expenses Disability Products
	 ************************************/

	/****************** Self ******************************/

	@FindBy(id = "covg_GrpOffOvr_Slf_slidBenefitAmt-sliderLabel")
	WebElement SelfBenefitAmountProfProduct;

	@FindBy(id = "covg_GrpOffOvr_Slf_slidBenefitAmt-minLabel")
	WebElement MinAmount_ProfSelf;

	@FindBy(id = "covg_GrpOffOvr_Slf_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_ProfSelf;

	@FindBy(xpath = "//span[@id='covg_GrpOffOvr_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_ProfProduct;

	@FindBy(xpath = "//span[@id='covg_GrpOffOvr_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_ProfProduct;

	@FindBy(xpath = "//select[@id='covg_GrpOffOvr_Slf_selWaitingPeriod']//parent::div")
	WebElement waitPrd_OOEDISelf_Label;

	@FindBy(xpath = "//select[@id='covg_GrpOffOvr_Slf_selBenefitDuration']//parent::div")
	WebElement BeneDuration_OOEDISelf_Label;
	@FindBy(id = "covg_GrpOffOvr_Slf_selBenefitDuration")
	WebElement BeneDuration_OOEDI_BOE_Self;

	@FindBy(id = "rider_GrpOffOvr_Purchase_Slf")
	WebElement GPO_chkbox_under_BOE_Self;

	@FindBy(id = "rider_GrpOffOvr_Recovery_Slf")
	WebElement Recovery_chkbox_under_BOE_Self;

	@FindBy(id = "rider_GrpOffOvr_Retroactive_Slf")
	WebElement Retroactive_chkbox_under_BOE_Self;

	/*****************
	 * Benefit amount for Critical Illness Products
	 ************************************/

	/*-----------------------Self-----------------------*/

	@FindBy(id = "covg_CICriticalIllness_Slf_slidBenefitAmt-sliderLabel")
	WebElement abeSelfBenefitAmountCIProduct;

	@FindBy(id = "covg_CICriticalIllness_Slf_slidBenefitAmt-minLabel")
	WebElement MinAmount_CISelf;

	@FindBy(id = "covg_CICriticalIllness_Slf_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_CISelf;

	@FindBy(xpath = "//span[@id='covg_CICriticalIllness_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_CIProduct;

	@FindBy(xpath = "//span[@id='covg_CICriticalIllness_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_CIProduct;

	/*--------------------Spouse----------------------------*/

	@FindBy(id = "covg_CICriticalIllness_Sps_slidBenefitAmt-sliderLabel")
	WebElement abeSpouseBenefitAmountCIProduct;

	@FindBy(id = "covg_CICriticalIllness_Sps_slidBenefitAmt-minLabel")
	WebElement MinAmount_CISpouse;

	@FindBy(id = "covg_CICriticalIllness_Sps_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_CISpouse;

	@FindBy(xpath = "//span[@id='covg_CICriticalIllness_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Spouse_CIProduct;

	@FindBy(xpath = "//span[@id='covg_CICriticalIllness_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Spouse_CIProduct;

	/*****************
	 * Benefit amount for Hospital Money Insurance Products
	 ************************************/

	@FindBy(id = "covg_HospitalIndem_Slf_selDailyBenefitAmt")
	WebElement BenefitAmount_Self_HMI;

	@FindBy(id = "rider_HospitalIndem_chk_sa_Slf")
	WebElement Surgical_Rider;

	@FindBy(id = "rider_HospitalIndem_sel_sa_Slf")
	WebElement Surgical_Amount;

	@FindBy(id = "covg_HospitalIndem_Chd_selDailyBenefitAmt")
	WebElement BenefitAmount_Child_HospitalMoneyProduct;

	@FindBy(id = "covg_HospitalIndem_Sps_selDailyBenefitAmt")
	WebElement BenefitAmount_Spouse_HMI;

	/******************
	 * Benefit amount for Term Life Insurance Products
	 *******************/

	/*---------------------------Self----------------------*/

	@FindBy(xpath = "//span[@id='covg_LIAnnual_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_TermLifeProduct;

	@FindBy(xpath = "//span[@id='covg_LIAnnual_Slf_slidBenefitAmt-sliderLabel' or @id='covg_LIAnnual_Slf_slidBenefitAmt-sliderLabel ']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_TermLifeProduct;

	@FindBy(id = "covg_LIAnnual_Slf_slidBenefitAmt-sliderLabel")
	WebElement SelfBenefitAmountTermLife;

	@FindBy(id = "covg_LIAnnual_Slf_slidBenefitAmt-minLabel")
	WebElement MinAmount_TermLifeSelf;

	@FindBy(id = "covg_LIAnnual_Slf_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_TermLifeSelf;

	@FindBy(xpath = "//input[@id='rider_LIAnnual_chk_ccr_Slf']")
	WebElement ChronicRider_TermLifeSelf;

	/*----------Rider----------------------*/

	@FindBy(xpath = "//span[@id='rider_LIAnnual_widget_ccr_Slf_slidPortionLICCR-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_TermLifeProductRider;

	@FindBy(xpath = "//span[@id='rider_LIAnnual_widget_ccr_Slf_slidPortionLICCR-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_TermLifeProductRider;

	@FindBy(id = "rider_LIAnnual_widget_ccr_Slf_slidPortionLICCR-sliderLabel")
	WebElement abeSelfBenefitAmountTermLifeRider;

	@FindBy(id = "rider_LIAnnual_widget_ccr_Slf_slidPortionLICCR-minLabel")
	WebElement MinAmount_TermLifeSelfRider;

	@FindBy(id = "rider_LIAnnual_widget_ccr_Slf_slidPortionLICCR-maxLabel")
	WebElement MaxAmount_TermLifeSelfRider;



	@FindBy(id = "rider_LIAnnual_widget_adnd_Slf_slidBenefitAmt-minLabel")
	WebElement MinAmount_TermLifeSelf_ADnDRider;

	@FindBy(id = "rider_LIAnnual_widget_adnd_Slf_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_TermLifeSelf_ADnDRider;

	/*-------------------Spouse-------------------------------*/

	@FindBy(id = "covg_LIAnnual_Sps_slidBenefitAmt-sliderLabel")
	WebElement SpouseBenefitAmountTermLife;

	@FindBy(xpath = "//span[@id='covg_LIAnnual_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Spouse_TermLifeProduct;

	@FindBy(xpath = "//span[@id='covg_LIAnnual_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Spouse_TermLifeProduct;

	@FindBy(xpath = "//div[@id='covg_LIAnnual_Sps_slidBenefitAmt-minLabel' or @id='covg_LIAnnual1_Sps_slidBenefitAmt-minLabel']")
	WebElement MinAmount_TermLifeSpouse;

	@FindBy(xpath = "//div[@id='covg_LIAnnual_Sps_slidBenefitAmt-maxLabel' or @id='covg_LIAnnual1_Sps_slidBenefitAmt-maxLabel']")
	WebElement MaxAmount_TermLifeSpouse;

	@FindBy(xpath = "//input[@id='rider_LIAnnual_chk_ccr_Sps']")
	WebElement ChronicRider_TermLifeSpouse;

	@FindBy(id = "covg_LIFifteenYr_Sps_slidBenefitAmt-minLabel")
	WebElement FifteenMin_AmntSpouse;

	@FindBy(id = "covg_LIFifteenYr_Sps_slidBenefitAmt-maxLabel")
	WebElement FifteenMax_AmntSpouse;
	/*----------Rider----------------------*/

	@FindBy(xpath = "//span[@id='rider_LIAnnual_widget_ccr_Sps_slidPortionLICCR-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Spouse_TermLifeProductRider;

	@FindBy(xpath = "//span[@id='rider_LIAnnual_widget_ccr_Sps_slidPortionLICCR-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Spouse_TermLifeProductRider;

	@FindBy(id = "rider_LIAnnual_widget_ccr_Sps_slidPortionLICCR-sliderLabel")
	WebElement abeSpouseBenefitAmountTermLifeRider;

	@FindBy(id = "rider_LIAnnual_widget_ccr_Sps_slidPortionLICCR-minLabel")
	WebElement MinAmount_TermLifeSpouseRider;

	@FindBy(id = "rider_LIAnnual_widget_ccr_Sps_slidPortionLICCR-maxLabel")
	WebElement MaxAmount_TermLifeSpouseRider;

	@FindBy(xpath = "//span[@id='rider_LIAnnual_widget_adnd_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Spouse_TermLifeADDRider;

	@FindBy(xpath = "//span[@id='rider_LIAnnual_widget_adnd_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Spouse_TermLifeADDRider;

	@FindBy(id = "rider_LIAnnual_widget_adnd_Sps_slidBenefitAmt-sliderLabel")
	WebElement SpouseBenefitAmountTermLifeADDRider;

	@FindBy(id = "rider_LIAnnual_widget_adnd_Sps_slidBenefitAmt-minLabel")
	WebElement MinAmount_TermLifeSpouseADDRider;

	@FindBy(id = "rider_LIAnnual_widget_adnd_Sps_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_TermLifeSpouseADDRider;

	/*------------Child--------------------------*/

	@FindBy(xpath = "//select[@id='covg_LIAnnual_Chd_selBenefitAmt']")
	WebElement BenefitAmountChildTermLife_ARTLProduct;

	@FindBy(xpath = "//select[@id='covg_LIAnnual_Chd_selBenefitAmt' or @id='covg_LIFiveYr_Chd_selBenefitAmt']//parent::div")
	WebElement BenefitAmountChildTermLifeProduct_Label;

	@FindBy(xpath = "//select[@id='covg_LIFiveYr_Chd_selBenefitAmt']")
	WebElement BenefitAmountChild_TraditionalGroupTermLifeProduct_Label;

	@FindBy(xpath = "//select[@id='covg_LITenYr_Chd_selBenefitAmt']//parent::div")
	WebElement BenefitAmountChild_TenYTL_Label;

	@FindBy(xpath = "//select[@id='covg_LITenYr_Chd_selBenefitAmt']")
	WebElement BenefitAmountChild_TenYTL_Label2;

	// AAFP*********TermLifeInsurance**************

//Spouse
	@FindBy(xpath = "//span[@id='covg_LIAnnual_Sps_slidBenefitAmt-sliderLabel']/parent::div/div[@id='upArrow']")
	WebElement TermLifeProduct_upArrow_Spouse;

	@FindBy(xpath = "//span[@id='covg_LIAnnual_Sps_slidBenefitAmt-sliderLabel']/parent::div/div[@id='downArrow']")
	WebElement TermLifeProduct_downArrow_Spouse;

	@FindBy(xpath = "//span[@id='covg_LIAnnual_Sps_slidBenefitAmt-sliderLabel']")
	WebElement TermLifeProduct_BenefitAmt_Spouse;

	// ********************TermLifeInsurance********AD&DRiderBenefit*********************

	@FindBy(xpath = "//span[@id='rider_LIAnnual_widget_adnd_Slf_slidBenefitAmt-sliderLabel']/parent::div/div[@id='upArrow']")
	WebElement TermLifeProduct_upArrow_ADDRider_Self;

	@FindBy(xpath = "//span[@id='rider_LIAnnual_widget_adnd_Slf_slidBenefitAmt-sliderLabel']/parent::div/div[@id='downArrow']")
	WebElement TermLifeProduct_downArrow_ADDRider_Self;

	@FindBy(xpath = "//span[@id='rider_LIAnnual_widget_adnd_Slf_slidBenefitAmt-sliderLabel']")
	WebElement TermLifeProduct_BenefitAmt_ADDRider_Self;

	// AAFP ADDRider

	@FindBy(xpath = "//input[@id='rider_LIAnnual_chk_adnd_Slf']")
	WebElement TermLifeProduct_ADDRider_ChkBox_Self;

	@FindBy(xpath = "//input[@id='rider_LIAnnual_chk_adnd_Sps']")
	WebElement TermLifeProduct_ADDRider_ChkBox_Spouse;

	@FindBy(id = "rider_LIAnnual_widget_adnd_Slf_rdTypeOfCovg-0")
	WebElement newCoverage_ADDRider_Self;

	@FindBy(id = "rider_LIAnnual_widget_adnd_Slf_rdTypeOfCovg-1")
	WebElement changeCoverage_ADDRider_Self;

//Child
	@FindBy(id = "covg_LIAnnual_Chd_selBenefitAmt")
	WebElement TermLifeProduct_BenefitAmt_Child;

	@FindBy(xpath = "//div[@id='covg_LIAnnual_Chd']//span[@class='childLabel']")
	WebElement TermLifeProduct_EligibleChildName;

	@FindBy(xpath = "//div[@id='covg_HiLimitAccdntD1_Chd']//span[@class='childLabel']")
	WebElement EligibleChildName_HLAI;
	
	// WOP Rider

	@FindBy(xpath = "//input[@id='rider_LIAnnual_chk_wop_Slf']")
	WebElement TermLifeProduct_WOPRider_ChkBox_Self;

	/****************** Practice Overhead Products *******************/
	@FindBy(id = "covg_GrpOffOvr_Slf_selWaitingPeriod")
	WebElement PracticeOverhead_WaitingPeriod_Self;

	/******************
	 * Benefit amount for Disability Income Insurance Products
	 *******************/

	@FindBy(xpath = "//select[@id='covg_DIGrpDisable_Slf_selWaitingPeriod' or @id='covg_DIGrpDisable3_Slf_selWaitingPeriod']")
	WebElement WaitingPeriodDII_Self;

	@FindBy(xpath = "//span[@id='covg_DIGrpDisable_Slf_slidMonBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_DII;

	@FindBy(xpath = "//span[@id='covg_DIGrpDisable_Slf_slidMonBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_DII;

	@FindBy(id = "covg_DIGrpDisable_Slf_slidMonBenefitAmt-sliderLabel")
	WebElement SelfBenefitAmountDII;

	@FindBy(id = "covg_DIGrpDisable_Slf_slidMonBenefitAmt-minLabel")
	WebElement MinAmount_DIISelf;

	@FindBy(id = "covg_DIGrpDisable_Slf_slidMonBenefitAmt-maxLabel")
	WebElement MaxAmount_DIISelf;

	@FindBy(id = "covg_DIGrpDisable_Slf_selBenefitOption")
	WebElement BenefitOptionDII_Self;
	
	@FindBy(id = "covg_DIGrpDisable3_Slf_selPlanType")
	WebElement DII_PlanType_Self;
	
	
	@FindBy(id = "covg_DIGrpDisable_Sps_txtMonBenefitAmt")
	WebElement SpouseBenefitAmountDII;

	@FindBy(id = "covg_DIGrpDisable_Sps_txtWaitingPeriod")
	WebElement WaitingPeriodDII_Spouse;

	@FindBy(id = "covg_DIGrpDisable_Slf_txtBenefitPeriod")
	WebElement BenefitPeriodDII_Self;

	@FindBy(id = "covg_DIGrpDisable_Sps_txtBenefitPeriod")
	WebElement BenefitPeriodDII_Spouse;

	/*---------------  Catastrophic Disability Benefit Rider under DII ----------------*/

	@FindBy(xpath = "//span[@id='rider_DIGrpDisable_widget_cat_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_DIIRider;

	// TIE
	@FindBy(xpath = "//span[@id='covg_DIGrpDisable2_Slf_slidBenefitAmt-sliderLabel' or @id='covg_DIGrpDisable3_Slf_slidBenefitAmt-sliderLabel']")
	WebElement DII_nd_DIP_BenefitAmount_Self;

	/******************
	 * Supplemental Disability Insurance Products // *******************Disability
	 * Income Insurance AND Disability Income Protection Insurance
	 ***********************************/

	@FindBy(xpath = "//span[@id='covg_DIGrpDisable2_Slf_slidBenefitAmt-sliderLabel' or  @id='covg_DIGrpDisable3_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement DII_nd_DIP_UpArrow_Self;

	@FindBy(xpath = "//span[@id='covg_DIGrpDisable2_Slf_slidBenefitAmt-sliderLabel' or @id='covg_DIGrpDisable3_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement DII_nd_DIP_DownArrow_Self;

	@FindBy(xpath = "//div[@id='covg_DIGrpDisable2_Slf_slidBenefitAmt-minLabel' or @id='covg_DIGrpDisable3_Slf_slidBenefitAmt-minLabel']")
	WebElement DII_nd_DIP_MinAmount_Self;

	@FindBy(xpath = "//div[@id='covg_DIGrpDisable2_Slf_slidBenefitAmt-maxLabel' or @id='covg_DIGrpDisable3_Slf_slidBenefitAmt-maxLabel']")
	WebElement DII_nd_DIP_MaxAmount_Self;

	//@FindBy(id = "covg_DIGrpDisable2_Slf_selWaitingPeriod")
	@FindBy(xpath = "//div[@id='covg_DIGrpDisable2_Slf_selWaitingPeriod' or @id='covg_DIGrpDisable3_Slf_selWaitingPeriod']")
	WebElement DII_nd_DIP_WaitingPeriod_Self;

	@FindBy(id = "covg_DIGrpDisable2_Slf_selCoverageOption")
	WebElement DII_BenefitOption_Self;

	@FindBy(id = "covg_DIGrpDisable2_Slf_selBenefitDuration")
	WebElement benefitDuration_Self_DII_nd_DIP;

	@FindBy(xpath = "//span[@id='rider_DIGrpDisable_widget_cat_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_DIIRider;

	@FindBy(id = "rider_DIGrpDisable_widget_cat_Slf_slidBenefitAmt-sliderLabel")
	WebElement SelfBenefitAmountDII_Rider;

	@FindBy(id = "rider_DIGrpDisable_widget_cat_Slf_slidBenefitAmt-minLabel")
	WebElement MinAmount_DIISelfRider;

	@FindBy(id = "rider_DIGrpDisable_widget_cat_Slf_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_DIISelfRider;

	@FindBy(id = "rider_DIIncome_chk_adnd_Slf")
	WebElement ADDRider_Checkbox_DIP;

	@FindBy(id = "rider_DI_Protection_chk_Recovery_Slf")
	WebElement RecoveryRider_Checkbox_DIP;

	@FindBy(id = "rider_DI_Protection_chk_ResidualDB_Slf")
	WebElement ResidualDIBen_Checkbox_DIP;

	@FindBy(id = "rider_DI_Protection_chk_cola_Slf")
	WebElement COLA_Checkbox_DIP;

	@FindBy(id = "rider_DIProtection_chk_hip_Slf")
	WebElement HIP_Checkbox_DIP;

	@FindBy(id = "rider_DIIncome_widget_adnd_Slf_slidBenefitAmt-sliderLabel")
	WebElement ADDRiderSelf_Amnt_DIP;

	@FindBy(id = "rider_DIIncome_widget_adnd_Slf_slidBenefitAmt-minLabel")
	WebElement ADDRiderSelf_Slider_MinAmnt_DIP;

	@FindBy(id = "rider_DIIncome_widget_adnd_Slf_slidBenefitAmt-maxLabel")
	WebElement ADDRiderSelf_Slider_MaxAmnt_DIP;

	@FindBy(xpath = "//span[@id='rider_DIIncome_widget_adnd_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_ADDRider;

	@FindBy(xpath = "//span[@id='rider_DIIncome_widget_adnd_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_ADDRider;

	@FindBy(id = "rider_DIProtection_sel_hip_Slf")
	WebElement HIP_Selfamnt_DIP;
	@FindBy(id = "covg_DILong1_Slf_rdTypeOfCovg-0")
	WebElement newCoverage_Self_GDII;

	@FindBy(id = "covg_DILong1_Slf_rdTypeOfCovg-1")
	WebElement changeCoverage_Self_GDII;

	@FindBy(id = "covg_DILong1_Slf_selWaitingPeriod")
	WebElement GDII_WaitingPeriod_Self;

	@FindBy(id = "covg_DILong1_Slf_selCoverageOption")
	WebElement beneOption_GDIISelf;

	@FindBy(xpath = "//span[@id='covg_DILong1_Slf_slidMonBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement GDII_UpArrow_Self;

	@FindBy(xpath = "//span[@id='covg_DILong1_Slf_slidMonBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement GDII_downArrow_Self;

	@FindBy(id = "covg_DILong1_Slf_slidMonBenefitAmt-sliderLabel")
	WebElement GDII_benefitAmount;

	/*******************
	 * Supplemental Disability Insurance Products
	 *******************/
	@FindBy(xpath = "//div[@data-fields='covg_DIGrpDisable_Slf' or @data-fields='covg_DIGrpDisable1_Slf']//i")
	WebElement SelficonDII;

	@FindBy(id = "covg_DILong25_Slf_slidBenefitAmt-sliderLabel")
	WebElement beneAmount_SDI;

	@FindBy(id = "rider_DIGrpDisable_chk_IPO_Slf")
	WebElement InflationProtectionRider_Self_AAFP;

	@FindBy(id = "covg_DIGrpDisable1_Slf_selBenefitOptionRankGrade")
	WebElement BenefitOptionDII_Self_AAFP;

	@FindBy(xpath = "//span[@id='covg_DILong25_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_SDI;

	@FindBy(xpath = "//span[@id='covg_DILong25_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_SDI;

	@FindBy(id = "covg_DILong25_Slf_slidBenefitAmt-minLabel")
	WebElement minSliderLabel_SDISelf;

	@FindBy(id = "covg_DILong25_Slf_slidBenefitAmt-maxLabel")
	WebElement maxSliderLabel_SDISelf;

	@FindBy(id = "covg_DILong25_Slf_selWaitingPeriod")
	WebElement waitPrd_SDISelf;

	@FindBy(id = "covg_DILong25_Slf_selBenefitDuration")
	WebElement beneDuration_SDISelf;

	/*********************
	 * Labels Of Product on Coverage page
	 ********************************/

	@FindBy(xpath = "//div[@id='covg_LITenYr_Chd']//span[@class='childLabel']")
	WebElement Eligibile_Childs_Ten;

	@FindBy(xpath = "//div[@id='covg_LIAnnual_Chd']//span")
	WebElement Eligibile_Childs_GTLI;

	@FindBy(xpath = "//div[@id='covg_AccdntDeath_Chd']//span[@class='childLabel']")
	WebElement EligibileChilds_HLDD;

	@FindBy(xpath = "//div[@id='covg_HospitalIndem_Chd']//span[@class='childLabel']")
	WebElement EligibileChilds_HII;

	@FindBy(xpath = "//div[@id='covg_LIFiveYr_Chd' or @id='covg_LIAnnual_Chd']//span[@class='childLabel']")
	WebElement EligibileChildsName_GroupTermLife;

	@FindBy(xpath = "//span[@class='lblHdrLIFiveYr']")
	WebElement FiveYrLifeTermInsuranceLabel;

	@FindBy(xpath = "//span[@class='lblHdrLIFifteenYr']")
	WebElement FifteenYrLabel;

	@FindBy(xpath = "//span[@class='lblHdrLITenYr']")
	WebElement TenYrLifeTermInsuranceLabel;

	@FindBy(xpath = "//span[@class='lblHdrDIAccdntOnly']")
	WebElement AODInsuranceLabel;

	@FindBy(xpath = "//span[@class='lblHdrLITwentyYr']")
	WebElement TwentyYrLifeTermInsuranceLabel;

	@FindBy(xpath = "//span[@class='lblHdrLIFiftyYr']")
	WebElement FiftyYrLifeTermInsuranceLabel;

	@FindBy(xpath = "//span[@class='lblHdrAccdntDeathOnly']")
	WebElement AccidentDeathCover;
	
	@FindBy(xpath = "//span[@class='lblHdrAccdntDeath']")
	WebElement AccidentalDeathLabel;

	@FindBy(xpath = "//span[@class='lblHdrDILongPlus']")
	WebElement LongTermDisabilityPlusLabel;

	@FindBy(xpath = "//span[@class='lblHdrDILong']")
	WebElement LongTermDisabilityLabel;

	@FindBy(xpath = "//span[@class='lblHdrDIShort']")
	WebElement MidTermDisabilityLabel;

	@FindBy(xpath = "//span[@class='lblHdrDIRetirement']")
	WebElement RetirementDisabilityLabel;

	@FindBy(xpath = "//span[@class='lblHdrGrpOffOvr']")
	WebElement ProfessionalExpenseDisabilityLabel;

	@FindBy(xpath = "//span[@class='lblHdrCICriticalIllness']")
	WebElement CriticalIllnessLabel;

	@FindBy(xpath = "//span[@class='lblHdrHospitalIndem']")
	WebElement HospitalMoneyInsuranceLabel;

	@FindBy(xpath = "//span[@class='lblHdrLIAnnual']")
	WebElement TermLifeInsuranceLabel;

	@FindBy(xpath = "//span[@class='lblHdrDIGrpDisable']")
	WebElement DisabilityIncomeInsuranceLabel;

	@FindBy(id = "rdRiderOnlySlf-0")
	WebElement ChrinicIllnessRider_Self_Yes;

	@FindBy(xpath = "//div[@data-fields='covg_LIAnnual_Chd']")
	WebElement TermLife_ChildLabel;

	@FindBy(xpath = "//div[@data-fields='covg_LIAnnual1_Sps']")
	WebElement TermLife_SpouseLabel;

	/****************** Self ******************************/
	@FindBy(xpath = "//div[@id='covg_LIFiveYr_Slf']//span[@style='font-weight:bold;']")
	WebElement FiveYearQDSelf;

	@FindBy(xpath = "//div[@id='covg_LITenYr_Slf']//span[@style='font-weight:bold;']")
	WebElement TenYearQDSelf;

	@FindBy(xpath = "//div[@id='collapse_lblHdrLIAnnual']//p[contains(text(),'Your Compass Rose Benefits Group Term Life')]")
	WebElement RiderMessage_CRBG;

	@FindBy(xpath = "//div[@id='coverageTab']//label[starts-with(text(),'Note:')]")
	WebElement BasicLifeCoverage;

	@FindBy(xpath = "//div[@class='row MA-0 field-covg_LIAnnual_Slf']//span//li")
	WebElement GuarantedIssueCoverage_Self;

	@FindBy(xpath = "//div[@class='row MA-0 field-covg_LIAnnual1_Sps']//span//li")
	WebElement GuarantedIssueCoverage_Spouse;

	@FindBy(xpath = "//div[@id='collapse_lblHdrLIAnnual']//span[contains(text(),'Supplemental Spouse Coverage')]")
	WebElement SupplementCoverageMessage_Spouse;
	
	
	@FindBy(id = "covg_LIAnnual1_Sps_rdTypeOfCovg-1")
	WebElement ChangeInCoverage_GTLISpouse;
	
	@FindBy(id = "covg_LIAnnual1_Sps_rdTypeOfCovg-0")
	WebElement New_GTLISpouse;

	@FindBy(xpath = "//div[@class='row MA-0 txtChdamt show']//label[contains(text(),'$')]")
	WebElement BenefitAmtChild_GTLI;

	@FindBy(xpath = "//div[@class='row MA-0 PL-60 txtSpsamt show']//label[contains(text(),'$')]")
	WebElement BenefitAmtSpouse_GTLI;

	/*************************** CRBG Site ***************************************/

	/*------------Request Coverage - Health Questions--------------------------*/

	@FindBy(xpath = "//div[@data-fields='rdHlthQ1PrescribedMedicationSlf']")
	WebElement Question1_Self;

	@FindBy(xpath = "//div[@data-fields='rdHlthQ2DiseaseSlf']")
	WebElement Question2_Self;

	@FindBy(xpath = "//div[@data-fields='rdHlthQ3DiseaseAlcoholSlf']")
	WebElement Question3_Self;

	@FindBy(xpath = "//div[@data-fields='rdHlthQ1PrescribedMedicationSps']")
	WebElement Question1_Spouse;

	@FindBy(xpath = "//div[@data-fields='rdHlthQ2DiseaseSps']")
	WebElement Question2_Spouse;

	@FindBy(xpath = "//div[@data-fields='rdHlthQ3DiseaseAlcoholSps']")
	WebElement Question3_Spouse;


	// *******************SELF************************//
	@FindBy(xpath = "//h1[text()='Your Coverage']")
	WebElement YourCoverage;

	/*---------------------------------------------------------------------------------------------------*/

	@FindBy(xpath = "//div[@id='div_covg_LIFiveYr_Slf_slidBenefitAmt']//div[contains(@class,'slider-controls')]//span[@class='slider-plus']")
	WebElement traditionalPlusSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LIFiveYr_Slf_slidBenefitAmt']//div[contains(@class,'slider-controls')]//span[@class='slider-minus']")
	WebElement traditionalMinusSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LIFiveYr_Slf_slidBenefitAmt']//div[contains(@class,'value')]")
	WebElement traditionalAmountSelf_Mobile;

	/*
	 * @FindBy(xpath =
	 * "(//div[@id='lblHdrLIFiveYr']//parent::div//following-sibling::div)[1]/i")
	 * WebElement traditionalArrowSelf_Mobile;
	 */

	@FindBy(xpath = "//div[@id='page-self']//div[@id='lblHdrLIFiveYr']//parent::div//following-sibling::div//i")
	WebElement traditionalArrowSelf_Mobile;

	@FindBy(xpath = "//div[@id='page-self']//div[@id='lblHdrLITenYr']//parent::div//following-sibling::div//i")
	WebElement tenYearArrowSelf_Mobile;

	/******************* Benefit amount for Pure Term Life Insurance Products*******************/

	/*---------------------------Self----------------------*/

	@FindBy(xpath = "//span[@class='lblHdrLIFiveYr2']")
	WebElement PureTermLifeInsuranceLabel;

	@FindBy(id = "covg_LIFiveYr2_Slf_slidBenefitAmt-sliderLabel")
	WebElement BenefitAmount_PureTerm_Self;

	@FindBy(xpath = "//span[@id='covg_LIFiveYr2_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_PureTerm;

	@FindBy(xpath = "//span[@id='covg_LIFiveYr2_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_PureTerm;

	@FindBy(id = "covg_LIFiveYr2_Slf_slidBenefitAmt-minLabel")
	WebElement MinAmount_PureTermSelf;

	@FindBy(id = "covg_LIFiveYr2_Slf_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_PureTermSelf;

	@FindBy(xpath = "//input[@id='rider_LIFiveYr2_chk_wop_Slf']")
	WebElement WOPRider_PureTerm_Self;

	/*******************
	 * Benefit amount for Preferred Term Life Insurance Products
	 *******************/

	/*---------------------------Self----------------------*/

	@FindBy(xpath = "//span[@class='lblHdrLIFiveYr3']")
	WebElement PrefTermLifeInsuranceLabel;

	@FindBy(id = "covg_LIFiveYr3_Slf_slidBenefitAmt-sliderLabel")
	WebElement BenefitAmount_PrefTerm_Self;

	@FindBy(xpath = "//span[@id='covg_LIFiveYr3_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_PrefTerm;

	@FindBy(xpath = "//span[@id='covg_LIFiveYr3_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_PrefTerm;

	@FindBy(id = "covg_LIFiveYr3_Slf_slidBenefitAmt-minLabel")
	WebElement MinAmount_PrefTermSelf;

	@FindBy(id = "covg_LIFiveYr3_Slf_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_PrefTermSelf;

	@FindBy(xpath = "//input[@id='rider_LIFiveYr3_chk_wop_Slf']")
	WebElement WOPRider_PrefTerm_Self;

	@FindBy(xpath = "//input[@id='rider_LIFiveYr3_chk_adnd_Slf']")
	WebElement ADnDRider_PrefTerm_Self;

	@FindBy(id = "rider_LIFiveYr3_widget_adnd_Slf_slidBenefitAmt-sliderLabel")
	WebElement BenefitAmount_PrefTerm_Self_ADnDRider;

	@FindBy(xpath = "//span[@id='rider_LIFiveYr3_widget_adnd_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_PrefTerm_ADnDRider;

	@FindBy(xpath = "//span[@id='rider_LIFiveYr3_widget_adnd_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_PrefTerm_ADnDRider;

	@FindBy(id = "rider_LIFiveYr3_widget_adnd_Slf_slidBenefitAmt-minLabel")
	WebElement MinAmount_PrefTermSelf_ADnDRider;

	@FindBy(id = "rider_LIFiveYr3_widget_adnd_Slf_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_PrefTermSelf_ADnDRider;

	/*
	 * @FindBy(xpath =
	 * "(//div[@id='lblHdrLITenYr']//parent::div//following-sibling::div)[1]/i")
	 * WebElement tenYearArrowSelf_Mobile;
	 */

	@FindBy(xpath = "//div[@id='div_covg_LITenYr_Slf_slidBenefitAmt']//div[contains(@class,'slider-controls')]//span[@class='slider-plus']")
	WebElement tenYearPlusSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LITenYr_Slf_slidBenefitAmt']//div[contains(@class,'slider-controls')]//span[@class='slider-minus']")
	WebElement tenYearMinusSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LITenYr_Slf_slidBenefitAmt']//div[contains(@class,'value')]")
	WebElement tenYrAmountSelf_Mobile;

	/*
	 * @FindBy(xpath =
	 * "(//div[@id='lblHdrLITwentyYr']//parent::div//following-sibling::div)[1]/i")
	 * WebElement twentyYearArrowSelf_Mobile;
	 */

	@FindBy(xpath = "//div[@id='page-self']//div[@id='lblHdrLITwentyYr']//parent::div//following-sibling::div//i")
	WebElement twentyYearArrowSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LITwentyYr_Slf_slidBenefitAmt']//div[contains(@class,'slider-controls')]//span[@class='slider-plus']")
	WebElement twentyYearPlusSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LITwentyYr_Slf_slidBenefitAmt']//div[contains(@class,'slider-controls')]//span[@class='slider-minus']")
	WebElement twentyYearMinusSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LITwentyYr_Slf_slidBenefitAmt']//div[contains(@class,'value')]")
	WebElement twentyYrAmountSelf_Mobile;

	/*
	 * @FindBy(xpath =
	 * "(//div[@id='lblHdrDIGrpDisable']//parent::div//following-sibling::div)[1]/i")
	 * WebElement longTermArrowSelf_Mobile;
	 */
	@FindBy(xpath = "//div[@id='page-self']//div[@id='lblHdrDIGrpDisable']//parent::div//following-sibling::div//i")
	WebElement longTermArrowSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_DIGrpDisable7_Slf_slidBenefitAmt']//div[contains(@class,'slider-controls')]//span[@class='slider-plus']")
	WebElement longTermPlusSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_DIGrpDisable7_Slf_slidBenefitAmt']//div[contains(@class,'slider-controls')]//span[@class='slider-minus']")
	WebElement longTermMinusSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_DIGrpDisable7_Slf_slidBenefitAmt']//div[contains(@class,'value')]")
	WebElement longTermAmountSelf_Mobile;

	/*
	 * @FindBy(xpath =
	 * "(//div[@id='lblHdrDIShort']//parent::div//following-sibling::div)[1]/i")
	 * WebElement shortTermArrowSelf_Mobile;
	 */

	@FindBy(xpath = "//div[@id='page-self']//div[@id='lblHdrDIShort']//parent::div//following-sibling::div//i")
	WebElement shortTermArrowSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_DIShort25_Slf_slidBenefitAmt']//div[contains(@class,'slider-controls')]//span[@class='slider-plus']")
	WebElement shortTermPlusSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_DIShort25_Slf_slidBenefitAmt']//div[contains(@class,'slider-controls')]//span[@class='slider-minus']")
	WebElement shortTermMinusSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_DIShort25_Slf_slidBenefitAmt']//div[contains(@class,'value')]")
	WebElement shortTermAmountSelf_Mobile;

	/*
	 * @FindBy(xpath =
	 * "(//div[@id='lblHdrGrpOffOvr']//parent::div//following-sibling::div)[1]/i")
	 * WebElement businessArrowSelf_Mobile;
	 */

	@FindBy(xpath = "//div[@id='page-self']//div[@id='lblHdrGrpOffOvr']//parent::div//following-sibling::div//i")
	WebElement businessArrowSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_GrpOffOvr_Slf_slidBenefitAmt']//div[contains(@class,'value')]")
	WebElement BusinessAmountSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_GrpOffOvr_Slf_slidBenefitAmt']//div[contains(@class,'slider-controls')]//span[@class='slider-plus']")
	WebElement BusinessPlusSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_GrpOffOvr_Slf_slidBenefitAmt']//div[contains(@class,'slider-controls')]//span[@class='slider-minus']")
	WebElement BusinessMinusSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LIFiveYr_Slf_slidBenefitAmt']//div[contains(@class,'noUi-handle noUi')]")
	WebElement traditionalSliderSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LITenYr_Slf_slidBenefitAmt']//div[contains(@class,'noUi-handle noUi')]")
	WebElement tenYrSliderSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LITwentyYr_Slf_slidBenefitAmt']//div[contains(@class,'noUi-handle noUi')]")
	WebElement twentyYrSliderSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_DIGrpDisable7_Slf_slidBenefitAmt']//div[contains(@class,'noUi-handle noUi')]")
	WebElement longTermSliderSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_DIShort25_Slf_slidBenefitAmt']//div[contains(@class,'noUi-handle noUi')]")
	WebElement shortTermSliderSelf_Mobile;

	/*
	 * @FindBy(xpath =
	 * "//div[@id='div_covg_DIShort25_Slf_slidBenefitAmt']//div[contains(@class,'noUi-handle noUi')]"
	 * ) WebElement shortTermSliderSelf_Mobile;
	 */

	// NSPE
	@FindBy(id = "covg_DIGrpDisable7_Slf_slidBenefitAmt-sliderLabel")
	WebElement DII_BenefitAmount_Self;

	@FindBy(xpath = "//span[@id='covg_DIGrpDisable7_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement DII_upArrow_Self;

	@FindBy(xpath = "//span[@id='covg_DIGrpDisable7_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement DII_downArrow_Self;

	@FindBy(id = "covg_DIGrpDisable7_Slf_slidBenefitAmt-minLabel")
	WebElement DII_MinAmount_Self;

	@FindBy(id = "covg_DIGrpDisable7_Slf_slidBenefitAmt-maxLabel")
	WebElement DII_MaxAmount_Self;

	@FindBy(id = "covg_DIGrpDisable7_Slf_selWaitingPeriod")
	WebElement longWaitingPeriodSelf_Mobile;

	@FindBy(id = "covg_DIGrpDisable7_Slf_selBenefitDuration")
	WebElement longBenefitDurationSelf_Mobile;

	@FindBy(id = "covg_DIShort25_Slf_selWaitingPeriod")
	WebElement shortwaitingPeriodSelf_Mobile;

	@FindBy(id = "covg_DIShort25_Slf_selBenefitDuration")
	WebElement shortBenefitDurationSelf_Mobile;

	@FindBy(id = "covg_GrpOffOvr_Slf_selWaitingPeriod")
	WebElement businessWaitingPeriodSelf_Mobile;

	@FindBy(id = "covg_GrpOffOvr_Slf_selBenefitDuration")
	WebElement businessBenefitDurationSelf_Mobile;

	@FindBy(xpath = "//div[@id='field-rider_DIGrpDisable_chk_cola_Slf']//div//label//i")
	WebElement checkboxCOLASelf_Mobile;

	@FindBy(id = "rider_DIGrpDisable_chk_cola_Slf")
	WebElement checkboxCOLASelf_verify_Mobile;

	@FindBy(xpath = "//div[@id='field-rider_DILong_chk_catstrophicDisBft_Slf']//div//label//i")
	WebElement checkboxCDBSelf_Mobile;

	@FindBy(id = "rider_DILong_chk_catstrophicDisBft_Slf")
	WebElement checkboxCDBSelf_verify_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LIFiveYr_Chd_lblEligibleChildNames']/label")
	WebElement EligibleChildName_Mob;

	// ******************Coverage Error Message*****************//
	@FindBy(xpath = "//div[@id='covg_LIAnnual_Sps' or @id='covg_LIFiveYr_Sps']//div[contains(@class,'has-error')]//p")
	WebElement spouseCoverageErrorMsg;

	@FindBy(xpath = "//input[@id='covg_LITenYr_Sps_slidBenefitAmt']//parent::div//parent::div//following-sibling::p[contains(@class,'error')]")
	WebElement CoverageErrorMsg_TenYTL_Spouse;

	@FindBy(xpath = "//input[@id='covg_DIAccdntOnly_Sps_slidMonBenefitAmt']//parent::div//parent::div//following-sibling::p[contains(@class,'error')]")
	WebElement CoverageErrorMsg_AOD_Spouse;

	@FindBy(xpath = "//p[contains(text(),'cannot exceed')]")
	WebElement spouseCoverageError1;

	@FindBy(id = "rdRiderOnlySlf-1")
	WebElement ChrinicIllnessRider_Self_No;

	@FindBy(id = "ciradioself1")
	WebElement OptionalRider_Self_Yes;

	@FindBy(id = "ciradioself2")
	WebElement OptionalRider_Self_No;

	@FindBy(id = "rdRiderOnlySps-0")
	WebElement ChrinicIllnessRider_Spouse_Yes;

	@FindBy(id = "rdRiderOnlySps-1")
	WebElement ChrinicIllnessRider_Spouse_No;

	@FindBy(id = "ciradiosps1")
	WebElement OptionalRider_Spouse_Yes;

	@FindBy(id = "ciradiosps2")
	WebElement OptionalRider_Spouse_No;

	@FindBy(xpath = "//div[@id='covg_LIAnnual_Slf']//span//div")
	WebElement QuickDecisionOption_Self;

	@FindBy(xpath = "//div[@id='covg_LIAnnual_Sps']//span//div")
	WebElement QuickDecisionOption_Spouse;

	@FindBy(xpath = "//div[@id='covg_LIFiveYr_Slf']//span//div")
	WebElement QuickDecisionFiveYear_Self;

	//////////////////////////// Spouse/////////////////////

	// @FindBy(id="covg_LIFiveYr_Slf_slidBenefitAmt-sliderLabel")
	// WebElement abeSelfBenefitAmount5Yr;

	//////////////////////////// Spouse_Mobile/////////////////////

	@FindBy(xpath = "//h1[text()='Spouse Coverage']")
	WebElement SpouseCoverage_Mobile;

	@FindBy(xpath = "//div[@id='covg_LIFiveYr_Sps']//div[contains(@class,'noUi-handle noUi')]")
	WebElement traditionalSliderSpouse_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LIFiveYr_Sps_slidBenefitAmt']//div[contains(@class,'value')]")
	WebElement traditionalAmountSpouse_Mobile;

	/*
	 * @FindBy(xpath =
	 * "(//div[@id='lblHdrLIFiveYr']//parent::div//following-sibling::div)[2]")
	 * WebElement traditionalArrowSpouse_Mobile;
	 */
	@FindBy(xpath = "//div[@id='page-spouse']//div[@id='lblHdrLIFiveYr']//parent::div//following-sibling::div//i")
	WebElement traditionalArrowSpouse_Mobile;

	/*
	 * @FindBy(xpath =
	 * "(//div[@class='accordion-panel-title']//div[@id='lblHdrLITenYr']//parent::div//following-sibling::div//i)[2]")
	 * WebElement tenYearArrowSpouse_Mobile;
	 */

	@FindBy(xpath = "//div[@id='page-spouse']//div[@id='lblHdrLITenYr']//parent::div//following-sibling::div//i")
	WebElement tenYearArrowSpouse_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LIFiveYr_Sps_slidBenefitAmt']//div[contains(@class,'slider-controls')]//span[@class='slider-plus']/i")
	WebElement traditionalPlusSpouse_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LIFiveYr_Sps_slidBenefitAmt']//div[contains(@class,'slider-controls')]//span[@class='slider-minus']/i")
	WebElement traditionalMinusSpouse_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LITenYr_Sps_slidBenefitAmt']//div[contains(@class,'noUi-handle noUi')]")
	WebElement tenYrSliderSpouse_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LITenYr_Sps_slidBenefitAmt']//div[contains(@class,'value')]")
	WebElement tenYrAmountSpouse_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LITenYr_Sps_slidBenefitAmt']//div[contains(@class,'slider-controls')]//span[@class='slider-plus']/i")
	WebElement tenYrPlusSpouse_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LITenYr_Sps_slidBenefitAmt']//div[contains(@class,'slider-controls')]//span[@class='slider-minus']/i")
	WebElement tenYrMinusSpouse_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LITwentyYr_Sps_slidBenefitAmt']//div[contains(@class,'noUi-handle noUi')]")
	WebElement twentyYrSliderSpouse_Mobile;

	/*
	 * @FindBy(xpath =
	 * "(//div[@class='accordion-panel-title']//div[@id='lblHdrLITwentyYr']//parent::div//following-sibling::div//i)[2]")
	 * WebElement twentyYearArrowSpouse_Mobile;
	 */

	@FindBy(xpath = "//div[@id='page-spouse']//div[@id='lblHdrLITwentyYr']//parent::div//following-sibling::div//i")
	WebElement twentyYearArrowSpouse_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LITwentyYr_Sps_slidBenefitAmt']//div[contains(@class,'value')]")
	WebElement twentyYrAmountSpouse_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LITwentyYr_Sps_slidBenefitAmt']//div[contains(@class,'slider-controls')]//span[@class='slider-plus']/i")
	WebElement twentyYrPlusSpouse_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LITwentyYr_Sps_slidBenefitAmt']//div[contains(@class,'slider-controls')]//span[@class='slider-minus']/i")
	WebElement twentyYrMinusSpouse_Mobile;

	@FindBy(xpath = "//div[@id='covg_DIGrpDisable7_Sps']//div[contains(@class,'noUi-handle noUi')]")
	WebElement longTermSliderSpouse_Mobile;

	/*
	 * @FindBy(xpath =
	 * "(//div[@class='accordion-panel-title']//div[@id='lblHdrDIGrpDisable']//parent::div//following-sibling::div//i)[2]")
	 * WebElement longtermArrowSpouse_Mobile
	 */;
	@FindBy(xpath = "//div[@id='page-spouse']//div[@id='lblHdrDIGrpDisable']//parent::div//following-sibling::div//i")
	WebElement longtermArrowSpouse_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_DIGrpDisable7_Sps_slidBenefitAmt']//div[contains(@class,'slider-controls')]//span[@class='slider-plus']/i")
	WebElement longTermPlusSpouse_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_DIGrpDisable7_Sps_slidBenefitAmt']//div[contains(@class,'slider-controls')]//span[@class='slider-minus']/i")
	WebElement longTermMinusSpouse_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_DIGrpDisable7_Sps_slidBenefitAmt']//div[contains(@class,'value')]")
	WebElement longTermAmountSpouse_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_DIShort25_Sps_slidBenefitAmt']//div[contains(@class,'noUi-handle noUi')]")
	WebElement shortTermSliderSpouse_Mobile;

	/*
	 * @FindBy(xpath =
	 * "(//div[@class='accordion-panel-title']//div[@id='lblHdrDIShort']//parent::div//following-sibling::div//i)[2]")
	 * WebElement shorttermArrowSpouse_Mobile;
	 */

	@FindBy(xpath = "//div[@id='page-spouse']//div[@id='lblHdrDIShort']//parent::div//following-sibling::div//i")
	WebElement shorttermArrowSpouse_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_DIShort25_Sps_slidBenefitAmt']//div[contains(@class,'slider-controls')]//span[@class='slider-plus']/i")
	WebElement shortTermPlusSpouse_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_DIShort25_Sps_slidBenefitAmt']//div[contains(@class,'slider-controls')]//span[@class='slider-minus']/i")
	WebElement shortTermMinusSpouse_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_DIShort25_Sps_slidBenefitAmt']//div[contains(@class,'value')]")
	WebElement shortTermAmountSpouse_Mobile;

	@FindBy(id = "covg_DIGrpDisable7_Sps_selWaitingPeriod")
	WebElement longWaitingSpouse_Mobile;

	@FindBy(id = "covg_DIGrpDisable7_Sps_selBenefitDuration")
	WebElement longBenefitSpouse_Mobile;

	@FindBy(xpath = "//div[@id='field-rider_DIGrpDisable_chk_cola_Sps']//div//label")
	WebElement COLAcheckboxSpouse_Mobile;

	@FindBy(id = "rider_DIGrpDisable_chk_cola_Sps")
	WebElement COLAcheckboxSpouse_verify_Mobile;

	@FindBy(xpath = "//div[@id='field-rider_DILong_chk_catstrophicDisBft_Sps']//div//label")
	WebElement CDBcheckboxSpouse_Mobile;

	@FindBy(id = "rider_DILong_chk_catstrophicDisBft_Sps")
	WebElement CDBcheckboxSpouse_verify_Mobile;

	@FindBy(id = "covg_DIShort25_Sps_selWaitingPeriod")
	WebElement shortWaitingSpouse_Mobile;

	@FindBy(id = "covg_DIShort25_Sps_selBenefitDuration")
	WebElement shortBenefitSpouse_Mobile;

	//////////////////// Child///////////////////

	@FindBy(id = "covg_LIFiveYr_Chd_selBenefitAmt")
	WebElement BenefitChild_Mobile;

	@FindBy(xpath = "//h1[text()='Child Coverage']")
	WebElement ChildCoverage_Page_Mobile;

	@FindBy(xpath = "//div[@id='div_covg_LIFiveYr_Chd_selBenefitAmt']/label")
	WebElement BenefitQuesChild_Mobile;

	@FindBy(id = "covg_LIFiveYr_Chd_selBenefitAmt")
	WebElement Child_BenifitAmount;

	@FindBy(xpath = "//span[@class='lblHdrLIManager']")
	WebElement ManagerLifeInsuranceLabel;

	@FindBy(id = "covg_LIManager_Slf_rdTypeOfCovg-0")
	WebElement newCoverageSelf_MLI;

	@FindBy(id = "covg_LIManager_Slf_rdTypeOfCovg-1")
	WebElement changeCoverageSelf_MLI;

	@FindBy(xpath = "//span[@id='covg_LIManager_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_MLIProduct;

	@FindBy(xpath = "//span[@id='covg_LIManager_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_MLIProduct;

	@FindBy(id = "covg_LIManager_Slf_slidBenefitAmt-sliderLabel")
	WebElement nadaSelfBenefitAmountMLI;

	@FindBy(id = "covg_LIManager_Sps_rdTypeOfCovg-0")
	WebElement newCoverageSpouse_MLI;

	@FindBy(id = "covg_LIManager_Sps_rdTypeOfCovg-1")
	WebElement changeCoverageSpouse_MLI;

	@FindBy(id = "rider_LIManager_chk_adnd_Slf")
	WebElement MLIProduct_ADDRider_ChkBox_Self;

	@FindBy(id = "rider_LIManager_widget_adnd_Slf_selBenefitAmt")
	WebElement MLIProduct_ADDRider_BenefitAmount_Self;

	@FindBy(id = "covg_LIManager_Sps_slidBenefitAmt-sliderLabel")
	WebElement nadaSpouseBenefitAmountMLI;

	@FindBy(xpath = "//span[@id='covg_LIManager_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Spouse_MLIProduct;

	@FindBy(xpath = "//span[@id='covg_LIManager_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Spouse_MLIProduct;

	@FindBy(id = "rider_LIManager_chk_adnd_Sps")
	WebElement MLIProduct_ADDRider_ChkBox_Spouse;

	@FindBy(id = "rider_LIManager_widget_adnd_Sps_selBenefitAmt")
	WebElement MLIProduct_ADDRider_BenefitAmount_Spouse;

	@FindBy(id = "covg_LIManager_Chd_selBenefitAmt")
	WebElement nadaChildBenefitAmountMLI;

	@FindBy(id = "rider_LIManager_chk_adnd_Chd")
	WebElement MLIProduct_ADDRider_ChkBox_Child;

	@FindBy(id = "covg_LIEmp_Slf_rdTypeOfCovg-0")
	WebElement newCoverageSelf_ELI;

	@FindBy(id = "covg_LIEmp_Slf_rdTypeOfCovg-1")
	WebElement changeCoverageSelf_ELI;

	@FindBy(xpath = "//span[@class='lblHdrLIEmp']")
	WebElement EmployeeLifeInsuranceLabel;

	@FindBy(id = "covg_LIEmp_Slf_slidBenefitAmt-minLabel")
	WebElement minAmount_ELISelf;

	@FindBy(id = "covg_LIEmp_Slf_slidBenefitAmt-maxLabel")
	WebElement maxAmount_ELISelf;

	@FindBy(id = "covg_LIEmp_Slf_slidBenefitAmt-sliderLabel")
	WebElement nadaSelfBenefitAmountELIr;

	@FindBy(xpath = "//span[@id='covg_LIEmp_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_ELIProduct;

	@FindBy(xpath = "//span[@id='covg_LIEmp_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_ELIProduct;

	@FindBy(id = "rider_LIEmp_widget_adnd_Slf_selBenefitAmt")
	WebElement ELIProduct_ADDRider_BenefitAmount_Self;

	@FindBy(id = "rider_LIEmp_chk_adnd_Slf")
	WebElement ELIProduct_ADDRider_ChkBox_Self;

	@FindBy(id = "covg_LIManager_Sps_slidBenefitAmt-minLabel")
	WebElement minAmount_MLISpouse;

	@FindBy(id = "covg_LIManager_Sps_slidBenefitAmt-maxLabel")
	WebElement maxAmount_MLISpouse;

	@FindBy(id = "rider_LIEmp_chk_adnd_Sps")
	WebElement ELIProduct_ADDRider_ChkBox_Spouse;

	@FindBy(id = "rider_LIEmp_chk_adnd_Chd")
	WebElement ELIProduct_ADDRider_ChkBox_Child;

	@FindBy(id = "rider_LIAnnual2_chk_adnd_Slf")
	WebElement GTLIProduct_ADDRider_ChkBox_Self;

	// ===================Accident Only Disability==========================//

	@FindBy(id = "covg_DIAccdntOnly_Slf_rdTypeOfCovg-0")
	WebElement newCoverageSelf_AOD;

	@FindBy(id = "covg_DIAccdntOnly_Slf_rdTypeOfCovg-1")
	WebElement changeCoverageSelf_AOD;

	@FindBy(id = "covg_DIAccdntOnly_Sps_rdTypeOfCovg-0")
	WebElement newCoverageSpouse_AOD;

	@FindBy(id = "covg_DIAccdntOnly_Sps_rdTypeOfCovg-1")
	WebElement changeCoverageSpouse_AOD;

	@FindBy(id = "covg_DIAccdntOnly_Slf_selWaitingPeriod")
	WebElement WaitP_Self_AOD;

	@FindBy(id = "covg_DIAccdntOnly_Slf_selBenefitDuration")
	WebElement BenDuration_Self_AOD;

	@FindBy(id = "covg_DIAccdntOnly_Slf_slidMonBenefitAmt-sliderLabel")
	WebElement BenAmnt_Self_AOD;

	@FindBy(id = "covg_DIAccdntOnly_Slf_slidMonBenefitAmt-minLabel")
	WebElement MinBenAmnt_Slider_Self_AOD;

	@FindBy(id = "covg_DIAccdntOnly_Slf_slidMonBenefitAmt-maxLabel")
	WebElement MaxBenAmnt_Slider_Self_AOD;

	@FindBy(xpath = "//span[@id='covg_DIAccdntOnly_Slf_slidMonBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_AODProduct;

	@FindBy(xpath = "//span[@id='covg_DIAccdntOnly_Slf_slidMonBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_AODProduct;

	@FindBy(id = "covg_DIAccdntOnly_Slf_txtMaxBenefitAmt")
	WebElement max_MonthlyBenAmnt_Self_AOD;

	@FindBy(id = "covg_DILong1_Slf_txtMaxBenefitAmt")
	WebElement max_MonthlyBenAmnt_Self_LTD_GDII;

	@FindBy(id = "covg_DIAccdntOnly_Sps_txtMaxBenefitAmt")
	WebElement max_MonthlyBenAmnt_Spouse_AOD;

	@FindBy(id = "covg_DIAccdntOnly_Sps_selWaitingPeriod")
	WebElement waitPeriod_Spouse_AOD;

	@FindBy(id = "covg_DIAccdntOnly_Sps_selBenefitDuration")
	WebElement benDuration_Spouse_AOD;

	@FindBy(id = "covg_DIAccdntOnly_Sps_slidMonBenefitAmt-sliderLabel")
	WebElement benefitAmnt_Slider_Spouse_AOD;

	@FindBy(id = "covg_DIAccdntOnly_Sps_slidMonBenefitAmt-minLabel")
	WebElement MinBenAmnt_Slider_Spouse_AOD;

	@FindBy(id = "covg_DIAccdntOnly_Sps_slidMonBenefitAmt-maxLabel")
	WebElement MaxBenAmnt_Slider_Spouse_AOD;

	@FindBy(xpath = "//span[@id='covg_DIAccdntOnly_Sps_slidMonBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Spouse_AODProduct;

	@FindBy(xpath = "//span[@id='covg_DIAccdntOnly_Sps_slidMonBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Spouse_AODProduct;

	@FindBy(id = "covg_LIGrpTermDeal_Slf_rdTypeOfCovg-0")
	WebElement newCoverageSelf_GTDLI;

	@FindBy(id = "covg_LIGrpTermDeal_Slf_rdTypeOfCovg-1")
	WebElement changeCoverageSelf_GTDLI;

	@FindBy(xpath = "//span[@class='lblHdrLIGrpTermDeal']")
	WebElement GTDLifeInsuranceLabel;

	@FindBy(id = "covg_LIGrpTermDeal_Slf_slidBenefitAmt-minLabel")
	WebElement MinAmount_GTDLISelf;

	@FindBy(id = "covg_LIGrpTermDeal_Slf_slidBenefitAmt-maxLabel")
	WebElement MaxAmount_GTDLISelf;

	@FindBy(id = "rider_LIGrpTermDeal_chk_adnd_Slf")
	WebElement GTDLIProduct_ADDRider_ChkBox_Self;

	@FindBy(id = "covg_LIGrpTermDeal_Slf_slidBenefitAmt-sliderLabel")
	WebElement nadaSelfBenefitAmountGTDLI;

	@FindBy(xpath = "//span[@id='covg_LIGrpTermDeal_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_GTDLIProduct;

	@FindBy(xpath = "//span[@id='covg_LIGrpTermDeal_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_GTDLIProduct;

	@FindBy(id = "rider_LIGrpTermDeal_widget_adnd_Slf_selBenefitAmt")
	WebElement GTDLIProduct_ADDRider_BenefitAmount_Self;

	@FindBy(id = "covg_LIGrpTermDeal_Chd_selBenefitAmt")
	WebElement nadaChildBenefitAmountGTDLI;

	@FindBy(id = "rider_LIGrpTermDeal_chk_adnd_Chd")
	WebElement GTDLIProduct_ADDRider_ChkBox_Child;

	@FindBy(id = "covg_LIEmp_Sps_rdTypeOfCovg-0")
	WebElement newCoverageSpouse_ELI;

	@FindBy(id = "covg_LIEmp_Sps_rdTypeOfCovg-1")
	WebElement changeCoverageSpouse_ELI;

	@FindBy(id = "covg_LIEmp_Sps_slidBenefitAmt-minLabel")
	WebElement minAmount_ELISpouse;

	@FindBy(id = "covg_LIEmp_Sps_slidBenefitAmt-maxLabel")
	WebElement maxAmount_ELISpouse;

	@FindBy(xpath = "//span[@id='covg_LIEmp_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Spouse_ELIProduct;

	@FindBy(xpath = "//span[@id='covg_LIEmp_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Spouse_ELIProduct;

	@FindBy(id = "covg_LIEmp_Sps_slidBenefitAmt-sliderLabel")
	WebElement nadaSpouseBenefitAmountELIr;

	@FindBy(id = "rider_LIEmp_widget_adnd_Sps_selBenefitAmt")
	WebElement ELIProduct_ADDRider_BenefitAmount_Spouse;

	@FindBy(id = "covg_LIEmp_Chd_selBenefitAmt")
	WebElement ELIProduct_ADDRider_BenefitAmount_Child;

	@FindBy(id = "covg_LIGrpTermDeal_Sps_rdTypeOfCovg-0")
	WebElement newCoverageSpouse_GTDLI;

	@FindBy(id = "covg_LIGrpTermDeal_Sps_rdTypeOfCovg-1")
	WebElement changeCoverageSpouse_GTDLI;

	@FindBy(id = "covg_LIGrpTermDeal_Sps_slidBenefitAmt-sliderLabel")
	WebElement nadaSpouseBenefitAmountGTDLI;

	@FindBy(xpath = "//span[@id='covg_LIGrpTermDeal_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Spouse_GTDLIProduct;

	@FindBy(xpath = "//span[@id='covg_LIGrpTermDeal_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Spouse_GTDLIProduct;

	@FindBy(xpath = "//div[@id='covg_LITwentyYr_Sps']//div[contains(@class,'has-error')]//p")
	WebElement spouseTwentyYrLICoverageErrorMsg;

	@FindBy(xpath = "//div[@id='covg_LITenYr_Sps']//div[contains(@class,'has-error')]//p")
	WebElement spouseTenYrLICoverageErrorMsg;

	@FindBy(id = "covg_LIAnnual2_Slf_rdMultiplyBenefitAmt")
	WebElement selfMultiplyBaseSalary_GTLIProduct;

	@FindBy(xpath = "//ul[@id='rider_LIAnnual2_widget_adnd_Slf_rdMultiplyBenefitAmt']")
	WebElement selfOptionalMultiplyBaseSalary_GTLIProduct;

	@FindBy(xpath = "//span[@id='covg_LIAnnual_Sps_slidBenefitAmt-sliderLabel' or @id='covg_LIAnnual2_Sps_slidBenefitAmt-sliderLabel' or @id='covg_LIAnnual1_Sps_slidBenefitAmt-sliderLabel']")
	WebElement SpouseBenefitAmountGTLI;

	@FindBy(xpath = "//span[@id='covg_LIAnnual2_Sps_slidBenefitAmt-sliderLabel' or @id='covg_LIAnnual_Sps_slidBenefitAmt-sliderLabel' or @id='covg_LIAnnual1_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Spouse_GTLIProduct;

	@FindBy(xpath = "//span[@id='covg_LIAnnual2_Sps_slidBenefitAmt-sliderLabel' or @id='covg_LIAnnual_Sps_slidBenefitAmt-sliderLabel' or @id='covg_LIAnnual1_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Spouse_GTLIProduct;

	@FindBy(id = "rider_LIAnnual2_chk_adnd_Sps")
	WebElement GTLIProduct_ADDRider_ChkBox_Spouse;

	@FindBy(id = "rider_LIAnnual2_widget_adnd_Sps_slidBenefitAmt-sliderLabel")
	WebElement nadagiSpouseOptionalADDBenefitAmountGTLI;

	@FindBy(xpath = "//span[@id='rider_LIAnnual2_widget_adnd_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Spouse_OptionalADD_GTLIProduct;

	@FindBy(xpath = "//span[@id='rider_LIAnnual2_widget_adnd_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Spouse_OptionalADD_GTLIProduct;

	@FindBy(xpath = "//select[@id='covg_LIAnnual2_Chd_selBenefitAmt' or @id='covg_LIAnnual_Chd_selBenefitAmt']")
	WebElement ChildBenefitAmountGTLI;

	@FindBy(id = "rider_LIAnnual2_chk_adnd_Chd")
	WebElement GTLIProduct_ADDRider_ChkBox_Child;

	@FindBy(xpath = "//div[@id='covg_LIAnnual2_Sps']//div[contains(@class,'has-error')]//p")
	WebElement spouseGTLICoverageErrorMsg;

	@FindBy(xpath = "//div[@id='covg_LIAnnual1_Sps']//div[contains(@class,'has-error')]//p")
	WebElement SpouseCoverageExceedMsg;

	@FindBy(xpath = "//label[contains(text(),'Request Coverage - Health Questions')]")
	WebElement RequestCoverageHealthQuestionPage;

	@FindBy(id = "rdHlthQ1PrescribedMedicationSlf-0")
	WebElement prescribedMedicationSelf_Yes;

	@FindBy(id = "rdHlthQ2DiseaseSlf-0")
	WebElement physicianSelf_Yes;

	@FindBy(id = "rdHlthQ3DiseaseAlcoholSlf-0")
	WebElement AlcoholSelf_Yes;

	@FindBy(id = "rdHlthQ4EatingCookingSlf-0")
	WebElement EatingCookingSelf_Yes;

	@FindBy(id = "rdHlthQ5FamilyDiseaseSlf-0")
	WebElement FamilySelf_Yes;

	@FindBy(xpath = "//div[@class='row MA-0 field-lstHlthQ1PrescribedMedicationSlf']//button[@id='compDIListSlf']")
	WebElement AddDetail_First_Self;

	@FindBy(xpath = "//label[contains(text(),'Explanation')]")
	WebElement ExplanationPage;

	@FindBy(id = "selHlthQOnsetMnth")
	WebElement MonthOfOnset;

	@FindBy(id = "selHlthQOnsetYr")
	WebElement YearOfOnset;

	@FindBy(id = "txtConditions")
	WebElement ConditionsDetails;

	@FindBy(id = "txtNameAndAddrOfPhysician")
	WebElement Physician;

	@FindBy(xpath = "//button[@class='btn btn-success ok']")
	WebElement AddButton;

	@FindBy(xpath = "//div[@class='row MA-0 field-lstHlthQ2DiseaseSlf']//button[@id='compDIListSlf']")
	WebElement AddDetail_Second_Self;

	@FindBy(xpath = "//div[@class='row MA-0 field-lstHlthQ3DiseaseAlcoholSlf']//button[@id='compDIListSlf']")
	WebElement AddDetail_Third_Self;

	@FindBy(xpath = "//div[@class='row MA-0 field-lstHlthQ4EatingCookingSlf']//button[@id='compDIListSlf']")
	WebElement AddDetail_Fourth_Self;

	@FindBy(xpath = "//div[@class='row MA-0 field-lstHlthQ5FamilyDiseaseSlf']//button[@id='compDIListSlf']")
	WebElement AddDetail_Fifth_Self;

	@FindBy(id = "rdHlthQ1PrescribedMedicationSps-0")
	WebElement prescribedMedicationSpouse_Yes;

	@FindBy(id = "rdHlthQ2DiseaseSps-0")
	WebElement physicianSpouse_Yes;

	@FindBy(id = "rdHlthQ3DiseaseAlcoholSps-0")
	WebElement AlcoholSpouse_Yes;

	@FindBy(id = "rdHlthQ4EatingCookingSps-0")
	WebElement EatingCookingSpouse_Yes;

	@FindBy(id = "rdHlthQ5FamilyDiseaseSps-0")
	WebElement FamilySpouse_Yes;

	@FindBy(xpath = "//div[@class='row MA-0 field-lstHlthQ1PrescribedMedicationSps']//button[@id='compDIListSlf']")
	WebElement AddDetail_First_Spouse;

	@FindBy(xpath = "//div[@class='row MA-0 field-lstHlthQ2DiseaseSps']//button[@id='compDIListSlf']")
	WebElement AddDetail_Second_Spouse;

	@FindBy(xpath = "//div[@class='row MA-0 field-lstHlthQ3DiseaseAlcoholSps']//button[@id='compDIListSlf']")
	WebElement AddDetail_Third_Spouse;

	@FindBy(xpath = "//div[@class='row MA-0 field-lstHlthQ4EatingCookingSps']//button[@id='compDIListSlf']")
	WebElement AddDetail_Fourth_Spouse;

	@FindBy(xpath = "//div[@class='row MA-0 field-lstHlthQ5FamilyDiseaseSps']//button[@id='compDIListSlf']")
	WebElement AddDetail_Fifth_Spouse;

	@FindBy(id = "prescribedMedicationSelf_No-1")
	WebElement prescribedMedicationSelf_No;
	
	
	@FindBy(id = "rdHlthQ1PrescribedMedicationSlf-1")
	WebElement prescribedMedicationSelf_No_cat;
	
	@FindBy(xpath = "//input[@id = 'rdHlthQ2DiseaseSlf-1']")
	WebElement physicianSelf_No;

	@FindBy(id = "rdHlthQ3DiseaseAlcoholSlf-1")
	WebElement AlcoholSelf_No;

	@FindBy(id = "rdHlthQ4EatingCookingSlf-1")
	WebElement EatingCookingSelf_No;

	@FindBy(id = "rdHlthQ5FamilyDiseaseSlf-1")
	WebElement FamilySelf_No;

	@FindBy(id = "rdHlthQ1PrescribedMedicationSps-1")
	WebElement prescribedMedicationSpouse_No;

	@FindBy(id = "rdHlthQ2DiseaseSps-1")
	WebElement physicianSpouse_No;

	@FindBy(id = "rdHlthQ3DiseaseAlcoholSps-1")
	WebElement AlcoholSpouse_No;

	@FindBy(id = "rdHlthQ4EatingCookingSps-1")
	WebElement EatingCookingSpouse_No;

	@FindBy(id = "rdHlthQ5FamilyDiseaseSps-1")
	WebElement FamilySpouse_No;

	@FindBy(id = "covg_LIAnnual2_Sps_slidBenefitAmt-minLabel")
	WebElement minAmount_GTLISpouse;

	@FindBy(id = "covg_LIAnnual2_Sps_slidBenefitAmt-maxLabel")
	WebElement maxAmount_GTLISpouse;

	@FindBy(id = "covg_HiLimitAccdntD_Slf_rdTypeOfCovg-0")
	WebElement newCoverageSelf_GADD;

	@FindBy(id = "covg_HiLimitAccdntD_Slf_rdTypeOfCovg-1")
	WebElement changeCoverageSelf_GADD;

	@FindBy(xpath = "//span[@class='lblHdrHiLimitAccdntD']")
	WebElement GroupAccidentalDeathDismembermentLabel;

	@FindBy(id = "covg_HiLimitAccdntD_Slf_slidBenefitAmt-sliderLabel")
	WebElement sassSelfBenefitAmountGADDProduct;

	@FindBy(xpath = "//span[@id='covg_HiLimitAccdntD_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_GADDProduct;

	@FindBy(xpath = "//span[@id='covg_HiLimitAccdntD_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_GADDProduct;

	@FindBy(id = "covg_HiLimitAccdntD_Slf_slidBenefitAmt-minLabel")
	WebElement minAmount_GADDSelf;

	@FindBy(id = "covg_HiLimitAccdntD_Slf_slidBenefitAmt-maxLabel")
	WebElement maxAmount_GADDSelf;

	@FindBy(xpath = "//input[@id='covg_HiLimitAccdntD_Sps_rdTypeOfCovg-0' or @id='covg_HiLimitAccdntD2_Sps_rdTypeOfCovg-0']")
	WebElement newCoverageSpouse_GADD;

	//@FindBy(id = "covg_HiLimitAccdntD_Sps_rdTypeOfCovg-1")
	@FindBy(xpath = "//input[@id='covg_HiLimitAccdntD_Sps_rdTypeOfCovg-1' or @id='covg_HiLimitAccdntD2_Sps_rdTypeOfCovg-1']")
	WebElement changeCoverageSpouse_GADD;

	@FindBy(id = "//input[@id='covg_HiLimitAccdntD_Sps_selBenefitAmt']")
	WebElement BenefitAmount_Spouse_GADDProduct;
	
	@FindBy(id = "//span[@id='covg_HiLimitAccdntD2_Sps_slidBenefitAmt-sliderLabel']")
	WebElement HLAI_BenefitAmount_Spouse;
	
	@FindBy(xpath = "//span[@id='covg_HiLimitAccdntD2_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement HLAI_UpArrow_Spouse;

	@FindBy(xpath = "//span[@id='covg_HiLimitAccdntD2_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement HLAI_DownArrow_Spouse;
	
	@FindBy(xpath = "//div[@id='covg_HiLimitAccdntD2_Sps_slidBenefitAmt-minLabel']")
	WebElement HLAI_MinAmt_Spouse;
	
	@FindBy(xpath = "//div[@id='covg_HiLimitAccdntD2_Sps_slidBenefitAmt-maxLabel']")
	WebElement HLAI_MaxAmt_Spouse;
	
	
	@FindBy(id = "covg_HiLimitAccdntD1_Chd_txtBenefitAmt")
	WebElement HLAI_BenefitAmt_Label_Child;

	@FindBy(id = "covg_DIGrpDisable_Slf_rdTypeOfCovg-0")
	WebElement newCoverageSelf_GDI;

	@FindBy(id = "covg_DIGrpDisable_Slf_rdTypeOfCovg-1")
	WebElement changeCoverageSelf_GDI;

	@FindBy(id = "covg_DIGrpDisable_Slf_slidMonBenefitAmt-minLabel")
	WebElement MinAmount_GDISelf;

	@FindBy(id = "covg_DIGrpDisable_Slf_slidMonBenefitAmt-maxLabel")
	WebElement MaxAmount_GDISelf;

	@FindBy(id = "rider_DIGrpDisable_chk_partialDI_Slf")
	WebElement chkPartialDisabilityBenefit;

	@FindBy(id = "covg_GrpOffOvr_Slf_txtMaxBenefitAmt")
	WebElement MaxMonth_amount_BOE_Self;

	@FindBy(id = "rider_LIAnnual_chk_abio_Slf")
	WebElement TraditionalProduct_AutomaticBenefitRider_Self;

	@FindBy(id = "rider_LIAnnual_chk_abio_Sps")
	WebElement TraditionalProduct_AutomaticBenefitRider_Spouse;

	@FindBy(id = "covg_DILong_Slf_txtMaxBenefitAmt")
	WebElement max_MonthlyBenAmnt_Self_GDII;

	@FindBy(id = "covg_DIShort_Slf_txtMaxBenefitAmt")
	WebElement max_MonthlyBenAmnt_Self_GDIIST;

	@FindBy(xpath = "//label[@class='coverage-selection-notes' and contains(text(),'Spouse benefit amount may not exceed the member benefit amount (whether already insured or applying now).')]")
	WebElement SpouseBenefit_Message;

	@FindBy(id = "covg_DIShort_Slf_rdTypeOfCovg-0")
	WebElement newCoverageSelf_GDIIST;

	@FindBy(id = "covg_DIShort_Slf_rdTypeOfCovg-1")
	WebElement changeCoverageSelf_GDIIST;

	@FindBy(id = "covg_CICriticalIllness_Slf_rdTypeOfCovg-0")
	WebElement newCoverageSelf_CI;

	@FindBy(id = "covg_CICriticalIllness_Slf_rdTypeOfCovg-1")
	WebElement changeCoverageSelf_CI;

	@FindBy(id = "covg_CICriticalIllness_Sps_rdTypeOfCovg-0")
	WebElement newCoverageSpouse_CI;

	@FindBy(id = "covg_CICriticalIllness_Sps_rdTypeOfCovg-1")
	WebElement changeCoverageSpouse_CI;

	@FindBy(id = "rider_DILong_widget_fpo_Slf_slidBenefitAmt-minLabel")
	WebElement minFPO_Self;

	@FindBy(id = "rider_DILong_widget_fpo_Slf_slidBenefitAmt-maxLabel")
	WebElement maxFPO_Self;

	@FindBy(xpath = "//div[@data-fields='slidMonBenefitAmt']//div[contains(@class,'has-error')]//p")
	WebElement MonthlyBenefitAmtError;

	@FindBy(xpath = "//div[@data-fields='slidBenefitAmt']//div[contains(@class,'has-error')]//p")
	WebElement FPOMonthlyBenefitAmtError;

	@FindBy(xpath = "//div[@id='covg_LITwentyYr_Chd']//span[@class='childLabel']")
	WebElement Eligibile_Childs_GTwenty;

	@FindBy(xpath = "//div[@id='covg_CICriticalIllness_Sps']//div[contains(@class,'has-error')]//p")
	WebElement spouseCICoverageErrorMsg;

	@FindBy(id = "rider_LITenYr_chk_adnd_Slf")
	WebElement chkOptionalRiderFlex10_Self;

	@FindBy(id = "rider_LITenYr_chk_adnd_Sps")
	WebElement chkOptionalRiderFlex10_Spouse;

	@FindBy(id = "rider_LITenYr_chk_wop_Slf")
	WebElement chkWavierPremiumFlex10_Self;

	@FindBy(id = "rider_LIFiveYr_chk_wop_Slf")
	WebElement chkWavierPremiumGTLP75I_Self;

	@FindBy(id = "rider_LIFiveYr_chk_adnd_Slf")
	WebElement chkOptionalRiderGTLP75I_Self;

	@FindBy(id = "rider_LIFiveYr_chk_adnd_Sps")
	WebElement chkOptionalRiderGTLP75I_Spouse;

	@FindBy(id = "rider_LITwentyYr_chk_adnd_Slf")
	WebElement chkOptionalRiderFlex20_Self;

	@FindBy(id = "rider_LITwentyYr_chk_wop_Slf")
	WebElement chkWavierPremiumFlex20_Self;

	@FindBy(id = "rider_LIFiveYr_widget_adnd_Slf_slidBenefitAmt-minLabel")
	WebElement minAmt_AD_GTLP75ISelf;

	@FindBy(id = "rider_LIFiveYr_widget_adnd_Slf_slidBenefitAmt-maxLabel")
	WebElement maxAmt_AD_GTLP75ISelf;

	@FindBy(id = "rider_LITenYr_widget_adnd_Slf_slidBenefitAmt-minLabel")
	WebElement minAmt_AD_Flex10Self;

	@FindBy(id = "rider_LITenYr_widget_adnd_Slf_slidBenefitAmt-maxLabel")
	WebElement maxAmt_AD_Flex10Self;

	@FindBy(id = "rider_LITwentyYr_widget_adnd_Slf_slidBenefitAmt-minLabel")
	WebElement minAmt_AD_Flex20Self;

	@FindBy(id = "rider_LITwentyYr_widget_adnd_Slf_slidBenefitAmt-maxLabel")
	WebElement maxAmt_AD_Flex20Self;

	@FindBy(id = "rider_LIFiveYr_widget_adnd_Slf_slidBenefitAmt-sliderLabel")
	WebElement omaSelfBenefitAmountAD_GTLP75I;

	@FindBy(xpath = "//span[@id='rider_LIFiveYr_widget_adnd_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_AD_GTLP75IProduct;

	@FindBy(xpath = "//span[@id='rider_LIFiveYr_widget_adnd_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_AD_GTLP75IProduct;

	@FindBy(id = "rider_LITwentyYr_widget_adnd_Slf_slidBenefitAmt-sliderLabel")
	WebElement omaSelfBenefitAmountAD_Flex20;

	@FindBy(xpath = "//span[@id='rider_LITwentyYr_widget_adnd_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_AD_Flex20Product;

	@FindBy(xpath = "//span[@id='rider_LITwentyYr_widget_adnd_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_AD_Flex20Product;

	@FindBy(id = "rider_LITenYr_widget_adnd_Slf_slidBenefitAmt-sliderLabel")
	WebElement omaSelfBenefitAmountAD_Flex10;

	@FindBy(xpath = "//span[@id='rider_LITenYr_widget_adnd_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_AD_Flex10Product;

	@FindBy(xpath = "//span[@id='rider_LITenYr_widget_adnd_Slf_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_AD_Flex10Product;

	@FindBy(xpath = "//label[contains(text(),'Interim Insurance')]")
	WebElement InterimInsurancePage;

	@FindBy(xpath = "//label[contains(text(),'Terminate or Reduce Coverage')]")
	WebElement TerminateorReduceCoveragePage;

	@FindBy(xpath = "//label[contains(text(),'Transfer Ownership')]")
	WebElement TransferOwnershipPage;

	@FindBy(id = "rider_LIFiveYr_widget_adnd_Sps_slidBenefitAmt-sliderLabel")
	WebElement omaSpouseBenefitAmountAD_GTLP75I;

	@FindBy(xpath = "//span[@id='rider_LIFiveYr_widget_adnd_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Spouse_AD_GTLP75IProduct;

	@FindBy(xpath = "//span[@id='rider_LIFiveYr_widget_adnd_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Spouse_AD_GTLP75IProduct;

	@FindBy(id = "rider_LIFiveYr_widget_adnd_Sps_slidBenefitAmt-minLabel")
	WebElement minAmt_AD_GTLP75ISpouse;

	@FindBy(id = "rider_LIFiveYr_widget_adnd_Sps_slidBenefitAmt-maxLabel")
	WebElement maxAmt_AD_GTLP75ISpouse;

	@FindBy(id = "rider_LITenYr_widget_adnd_Sps_slidBenefitAmt-sliderLabel")
	WebElement omaSpouseBenefitAmountAD_Flex10;

	@FindBy(xpath = "//span[@id='rider_LITenYr_widget_adnd_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Spouse_AD_Flex10Product;

	@FindBy(xpath = "//span[@id='rider_LITenYr_widget_adnd_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Spouse_AD_Flex10Product;

	@FindBy(id = "rider_LITenYr_widget_adnd_Sps_slidBenefitAmt-minLabel")
	WebElement minAmt_AD_Flex10Spouse;

	@FindBy(id = "rider_LITenYr_widget_adnd_Sps_slidBenefitAmt-maxLabel")
	WebElement maxAmt_AD_Flex10Spouse;

	@FindBy(id = "rider_LITwentyYr_chk_adnd_Sps")
	WebElement chkOptionalRiderFlex20_Spouse;

	@FindBy(id = "rider_LITwentyYr_widget_adnd_Sps_slidBenefitAmt-sliderLabel")
	WebElement omaSpouseBenefitAmountAD_Flex20;

	@FindBy(xpath = "//span[@id='rider_LITwentyYr_widget_adnd_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Spouse_AD_Flex20Product;

	@FindBy(xpath = "//span[@id='rider_LITwentyYr_widget_adnd_Sps_slidBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Spouse_AD_Flex20Product;

	@FindBy(id = "rider_LITwentyYr_widget_adnd_Sps_slidBenefitAmt-maxLabel")
	WebElement maxAmt_AD_Flex20Spouse;

	@FindBy(id = "rider_LITwentyYr_widget_adnd_Sps_slidBenefitAmt-minLabel")
	WebElement minAmt_AD_Flex20Spouse;

	@FindBy(id = "skipInterimInsurance")
	WebElement skipInterimInsurancelnk;

	@FindBy(id = "skipTerminateReduceCovg")
	WebElement skipTerminateReduceCovglnk;

	@FindBy(id = "skipTransferOwnership")
	WebElement skipTransferOwnershiplnk;
	
	@FindBy(id="chkRequestInterimInsuranceSlf")
	WebElement Interim_Self;
	
	@FindBy(xpath="//div[@data-fields='rider_LITenYr_widget_adnd_Sps']//p")
	WebElement SpouseFlex10_ADDError;

	/********* Inforce Benefit Amount for Self GTLI ****/
	
	
	@FindBy(xpath = "//span[@id='slidLIAnnualInforceBenefitAmt-sliderLabel']//parent::div/div[@id='upArrow']")
	WebElement upArrow_Self_GTLIProduct;

	@FindBy(xpath = "//span[@id='slidLIAnnualInforceBenefitAmt-sliderLabel']//parent::div/div[@id='downArrow']")
	WebElement downArrow_Self_GTLIProduct;

	@FindBy(id = "slidLIAnnualInforceBenefitAmt-sliderLabel")
	WebElement SelfInforceBenefitAmountGTLI;

	@FindBy(id = "slidLIAnnualInforceBenefitAmt-minLabel")
	WebElement MinAmountInforce_GTLISelf;

	@FindBy(id = "slidLIAnnualInforceBenefitAmt-maxLabel")
	WebElement MaxAmountInforce_GTLISelf;
	
	@FindBy(id = "covg_AccdntDeath_Slf_selBenefitAmt")
	WebElement RequestedAmount_PAI_Self;

	@FindBy(id = "covg_AccdntDeath_Sps_txtBenefitAmt")
	WebElement RequestedAmount_PAI_Spouse;

	@FindBy(id = "covg_AccdntDeath_Chd_txtBenefitAmt")
	WebElement RequestedAmount_PAI_Child;

	
	
	

	public boolean select_Type_of_Coverage_as_for_self_TermLife(String TypeofCove) throws Exception {

		try {
			log.debug("Select type of coverage for self for Term Life");
			if (!newCoverageSelf_Traditional.isDisplayed()) {
				TermLifeInsuranceLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSelf_Traditional, changeCoverageSelf_Traditional, TypeofCove);

			log.info("Coverage type for self for Term Life selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for self for Term Life || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean select_Type_of_Coverage_as_for_self_TenYTL(String TypeofCove) throws Exception {

		try {
			log.debug("Select type of coverage for self Ten year");
			Thread.sleep(1000);
			if (!newCoverageSelf_Ten.isDisplayed()) {
				TenYrLifeTermInsuranceLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSelf_Ten, changeCoverageSelf_Ten, TypeofCove);

			log.info("Coverage type for self selected for Ten year successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for self Ten year|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean select_Type_of_Coverage_as_for_self_FifteenYTL(String TypeofCove) throws Exception {

		try {
			log.debug("Select type of coverage for self Fifteen year");
			if (!newCoverageSelf_Fifteen.isDisplayed()) {
				FifteenYrLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSelf_Fifteen, changeCoverageSelf_Fifteen, TypeofCove);

			log.info("Coverage type for self selected for Fifteen year successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for self Fifteen year|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean select_Type_of_Coverage_as_for_self_TwentyYTL(String TypeofCove) throws Exception {

		try {
			log.debug("Select type of coverage for self Twenty year");
			if (!newCoverageSelf_Twenty.isDisplayed()) {
				TwentyYrLifeTermInsuranceLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSelf_Twenty, changeCoverageSelf_Twenty, TypeofCove);

			log.info("Coverage type for self selected for Twenty year successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for self Twenty year|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean select_Type_of_Coverage_as_for_self_ADDI(String TypeofCov) throws Exception {

		try {
			log.debug("Select type of coverage for self ADnD");
			if (!newCoverageSelf_ADDI.isDisplayed()) {
				AccidentalDeathLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSelf_ADDI, changeCoverageSelf_ADDI, TypeofCov);

			log.info("Coverage type for self selected for ADnD successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for self ADnD|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean select_Type_of_Coverage_as_for_self_LTD(String TypeofCov) throws Exception {

		try {
			log.debug("Select type of coverage for self LTD");
			if (!newCoverageSelf_LTD.isDisplayed()) {
				LongTermDisabilityLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSelf_LTD, changeCoverageSelf_LTD, TypeofCov);

			log.info("Coverage type for self selected for LTD successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for self LTD|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean selects_Type_of_Coverage_as_for_Self_under_STD(String TypeofCov) throws Throwable {
		try {
			log.debug("Select type of coverage for self STD");
			if (!newCoverageSelf_STD.isDisplayed()) {
				MidTermDisabilityLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSelf_STD, changeCoverageSelf_STD, TypeofCov);

			log.info("Coverage type for self selected for STD successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for self STD|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean selects_Type_of_Coverage_as_for_Self_under_OOEDI(String TypeofCov) throws Throwable {
		try {
			log.debug("Select type of coverage for self Office Overhead");
			if (!newCoverageSelf_OO.isDisplayed()) {
				ProfessionalExpenseDisabilityLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSelf_OO, changeCoverageSelf_OO, TypeofCov);

			log.info("Coverage type for self selected for Office Overhead successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for self Office Overhead|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean selects_Type_of_Coverage_as_for_Self_under_SDI(String TypeofCov) throws Throwable {
		try {
			log.debug("Select type of coverage for self SDI");
			if (!newCoverageSelf_SDI.isDisplayed()) {
				LongTermDisabilityPlusLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSelf_SDI, changeCoverageSelf_SDI, TypeofCov);

			log.info("Coverage type for self selected for SDI successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for self SDI|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean selects_Type_of_Coverage_as_for_Self_under_HII(String TypeofCov) throws Throwable {
		try {
			log.debug("Select type of coverage for self HII/In Hospital Insurance");
			if (!newCoverageSelf_HII.isDisplayed()) {
				HospitalMoneyInsuranceLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSelf_HII, changeCoverageSelf_HII, TypeofCov);

			log.info("Coverage type for self selected for HII/In Hospital Insurance successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for self HII/In Hospital Insurance|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean selects_Type_of_Coverage_as_for_Spouse_under_HII(String TypeofCov_HII) throws Throwable {
		try {
			log.debug("Select type of coverage for spouse HII");
			if (!newCoverageSpouse_HII.isDisplayed()) {
				HospitalMoneyInsuranceLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSpouse_HII, changeCoverageSpouse_HII, TypeofCov_HII);

			log.info("Coverage type for spouse selected for HII successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for spouse HII|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean select_Type_of_Coverage_as_for_spouse_Accidental_Death(String TypeofCov_ADnD) throws Exception {

		try {
			log.debug("Select type of coverage for Spouse Accidental Death");
			if (!newCoverageSpouse_AdnD.isDisplayed()) {
				AccidentalDeathLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSpouse_AdnD, changeCoverageSpouse_AdnD, TypeofCov_ADnD);

			log.info("Coverage type for spouse for Accidental Death selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for spouse for Accidental Death || Fail" + e.getMessage());
			throw (e);

		}

	}

	// TIE
	public boolean select_Type_of_Coverage_as_for_spouse_ADDI(String TypeofCov_ADnD) throws Exception {

		try {
			log.debug("Select type of coverage for Spouse ADDI");
			if (!newCoverageSpouse_ADDI.isDisplayed()) {
				AccidentalDeathLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSpouse_ADDI, changeCoverageSpouse_ADDI, TypeofCov_ADnD);

			log.info("Coverage type for spouse for ADDI selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for spouse for ADDI || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean select_Type_of_Coverage_as_for_child_ADDI(String TypeofCov_ADnD) throws Exception {

		try {
			log.debug("Select type of coverage for Child ADDI");
			if (!newCoverageChild_ADDI.isDisplayed()) {
				AccidentalDeathLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageChild_ADDI, changeCoverageChild_ADDI, TypeofCov_ADnD);

			log.info("Coverage type for child for ADDI selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for child for ADDI || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean select_Type_of_Coverage_as_for_spouse_TwentyYTL(String TypeofCov_twenty) throws Exception {

		try {
			log.debug("Select type of coverage for Spouse Twenty Year");
			if (!newCoverageSpouse_Twenty.isDisplayed()) {
				TwentyYrLifeTermInsuranceLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSpouse_Twenty, changeCoverageSpouse_Twenty, TypeofCov_twenty);

			log.info("Coverage type for spouse for Twenty year selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for spouse for Twenty year || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean select_Type_of_Coverage_as_for_spouse_TenYTL(String TypeofCov_ten) throws Exception {

		try {
			log.debug("Select type of coverage for Spouse Ten Year");
			if (!SpouseSection_Ten.isDisplayed()) {
				TenYrLifeTermInsuranceLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSpouse_Ten, changeCoverageSpouse_Ten, TypeofCov_ten);

			log.info("Coverage type for spouse for Ten year selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for spouse for Ten year || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Change_in_Coverage_is_unavailable_under_TenYTL_for_Spouse() throws Exception {

		try {
			log.debug("Verify Type of Coverage 'Change In coverage' is unavailable for Spouse for TenYTL");

			if (!SpouseSection_Ten.isDisplayed()) {
				TermLifeInsuranceLabel.click();
				Thread.sleep(1000);
			}
			Assert.assertFalse(changeCoverageSpouse_Ten.isDisplayed(),
					"Bug|| Change In coverage is displayed for Spouse");

			log.info(
					"Verified Type of Coverage 'Change In coverage' is unavailable for Spouse for TenYTL successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to verify Type of Coverage 'Change In coverage' is unavailable for Spouse for TenYTL || Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean verify_Change_in_Coverage_is_available_under_TenYTL_for_Spouse() throws Exception {

		try {
			log.debug("Verify Type of Coverage 'Change in coverage' is available for Spouse for TenYTL");

			if (!SpouseSection_Ten.isDisplayed()) {
				TermLifeInsuranceLabel.click();
				Thread.sleep(1000);
			}
			Assert.assertTrue(changeCoverageSpouse_Ten.isDisplayed(),
					"Bug|| Change in coverage is not displayed for Spouse");

			log.info(
					"Verified Type of Coverage 'Change In coverage' is available for Spouse for TenYTL successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to verify Type of Coverage 'Change in coverage' is available for Spouse for TenYTL || Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean select_Type_of_Coverage_as_for_spouse_FifteenYTL(String TypeofCov_fifteen) throws Exception {

		try {
			log.debug("Select type of coverage for Spouse Fifteen Year");
			if (!newCoverageSpouse_Fifteen.isDisplayed()) {
				FifteenYrLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSpouse_Fifteen, changeCoverageSpouse_Fifteen, TypeofCov_fifteen);

			log.info("Coverage type for spouse for Fifteen year selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for spouse for Fifteen year || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean select_Type_of_Coverage_as_for_spouse_ARTL_or_TermLife(String STypeofCove) throws Exception {

		try {
			log.debug("Select type of coverage for spouse for TermLife or ARTL");
			if (!newCoverageSpouse_Traditional.isDisplayed()) {
				TermLifeInsuranceLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSpouse_Traditional, changeCoverageSpouse_Traditional, STypeofCove);

			log.info("Coverage type selected for spouse for TermLife or ARTL successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for spouse for TermLife or ARTL|| Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Change_in_Coverage_is_unavailable_under_ARTL_or_TermLife_for_Spouse() throws Exception {

		try {
			log.debug("Verify Type of Coverage 'Change In coverage' is unavailable for Spouse for TermLife or ARTL");

			if (!SpouseSection_Traditional.isDisplayed()) {
				TermLifeInsuranceLabel.click();
				Thread.sleep(1000);
			}
			Assert.assertFalse(changeCoverageSpouse_Traditional.isDisplayed(),
					"Bug|| Change In coverage is displayed for Spouse");

			log.info(
					"Verified Type of Coverage 'Change In coverage' is unavailable for Spouse for TermLife or ARTL successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to verify Type of Coverage 'Change In coverage' is unavailable for Spouse for TermLife or ARTL || Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean verify_Change_in_Coverage_is_available_under_ARTL_or_TermLife_for_Spouse() throws Exception {

		try {
			log.debug("Verify Type of Coverage 'Change In coverage' is available for Spouse for TermLife or ARTL");

			if (!SpouseSection_Traditional.isDisplayed()) {
				TermLifeInsuranceLabel.click();
				Thread.sleep(1000);
			}
			Assert.assertTrue(changeCoverageSpouse_Traditional.isDisplayed(),
					"Bug|| Change In coverage is not displayed for Spouse");

			log.info(
					"Verified Type of Coverage 'Change In coverage' is available for Spouse for TermLife or ARTL successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to verify Type of Coverage 'Change In coverage' is available for Spouse for TermLife or ARTL || Fail"
							+ e.getMessage());
			throw (e);

		}

	}

	public boolean selects_Type_of_Coverage_as_for_Child_HII(String CTypeofCove) throws Throwable {
		try {
			log.debug("Select type of coverage for Child under HII");
			if (!newCoverageChild_HII.isDisplayed()) {
				HospitalMoneyInsuranceLabel.click();
				Thread.sleep(1000);
			}

			reuseMethod.selectSinglevalue(newCoverageChild_HII, changeCoverageChild_HII, CTypeofCove);
			log.info("Coverage type selected for Child successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for Child || Fail" + e.getMessage());
			throw (e);

		}
	}

	// TIE
	public boolean selects_Type_of_Coverage_as_for_Self_under_DII_or_DIP(String TypeofCov) throws Throwable {
		try {
			log.debug("Select type of coverage for self for DII or DIP product");
			if (newCoverageSelf_DII_nd_DIP.isDisplayed()) {
				reuseMethod.selectSinglevalue(newCoverageSelf_DII_nd_DIP, changeCoverageSelf_DII_nd_DIP, TypeofCov);				
				Thread.sleep(1000);
			}
			DisabilityIncomeInsuranceLabel.click();
			Thread.sleep(2000);
			reuseMethod.selectSinglevalue(newCoverageSelf_DII_nd_DIP, changeCoverageSelf_DII_nd_DIP, TypeofCov);
			log.info("Coverage type for self selected for DII or DIP product successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for self DII or DIP product|| Fail" + e.getMessage());
			throw (e);

		}
	}

	/*
	 * public boolean
	 * coverage_page_is_displayed_to_user_and_select_Benefit_Amount_on_coverage_page
	 * () throws Exception { >>>>>>> .r551
	 * 
	 * public boolean selects_Type_of_Coverage_as_for_Child_HII(String CTypeofCove)
	 * throws Throwable { try {
	 * log.debug("Select type of coverage for Child under HII"); if
	 * (!newCoverageChild_HII.isDisplayed()) { HospitalMoneyInsuranceLabel.click();
	 * Thread.sleep(1000); }
	 * 
	 * reuseMethod.selectSinglevalue(newCoverageChild_HII, changeCoverageChild_HII,
	 * CTypeofCove);
	 * log.info("Coverage type selected for Child successfully || Pass"); return
	 * true; } catch (Exception e) {
	 * log.error("Not able to select coverage type for Child || Fail" +
	 * e.getMessage()); throw (e);
	 * 
	 * } } /* public boolean
	 * coverage_page_is_displayed_to_user_and_select_Benefit_Amount_on_coverage_page
	 * () throws Exception {
	 *
	 * try { log.debug("Select Benefit amount"); reuseMethod.scrollDown(Slider);
	 * reuseMethod.Slider(Slider, 20);
	 * log.info("Amount selected sucessfully || Pass"); return true; } catch
	 * (Exception e) { log.error("Notable to select the amount || Fail" +
	 * e.getMessage()); throw (e); }
	 *
	 * }
	 */

	public boolean select_Benefit_Amount_for_FiveYTL_Insurance_Product_Self_as(String Benefit) throws Exception {

		try {

			log.debug("Select Benefit Amount for Self of Term Life Insurance Products");
			if (abeSelfBenefitAmount5Yr.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_FiveYrProduct, Benefit, abeSelfBenefitAmount5Yr,
						downArrow_Self_FiveYrProduct);
			} else {
				FiveYrLifeTermInsuranceLabel.click();
				Thread.sleep(1000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_FiveYrProduct, Benefit, abeSelfBenefitAmount5Yr,
						downArrow_Self_FiveYrProduct);
			}
			Thread.sleep(1000);
			log.info("Amount selected for Self of Term Life Insurance Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Self of Term Life Insurance Product || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean request_Coverage_page_is_displayed_to_user_and_select_Benefit_Amount_for_Spouse_as(String sBenefit)
			throws Exception {

		try {
			reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_FiveYrProduct, sBenefit, abeSpouseBenefitAmount5Yr,
					downArrow_Spouse_FiveYrProduct);
			log.info("Amount selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Notable to select the amount || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}
	// public boolean selects_benefit_amount_for_Spouse_as(String sBenefit) throws
	// Exception{

	public boolean selects_benefit_amount_for_FiveYTL_Child_as(String cBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Child of FiveYTL Insurance");
			reuseMethod.dropDownselectbyvalue(BenefitAmount_Child_FiveYrProduct, cBenefit);
			log.info("Amount selected for Child of FiveYTL Insurance Product sucessfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select Benefit Amount for Child of FiveYTL Insurance|| Fail" + e.getMessage());
			throw (e);
		}

	}
	
	public boolean Validate_benefit_amount_for_GroupTermLife_Child(String cBenefit) throws Exception {

		try {
			log.debug("Verify Benefit Amount for Child of FiveYTL Insurance");
			Thread.sleep(1000);
			String amt = BenefitAmount_Child_FiveYrProduct_fixed.getText();
			amt=amt.replaceAll(",","").replaceAll("\\s","");
			cBenefit=cBenefit.replaceAll("\\s","");
			System.out.println("Amount after removal is: "+amt+" Expected amount is "+cBenefit);
			Assert.assertEquals(amt, cBenefit, "Child Benefit does not match");
			log.info("Amount Verified for Child of FiveYTL Insurance Product sucessfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify Benefit Amount for Child of FiveYTL Insurance|| Fail" + e.getMessage());
			throw (e);
		}

	}
	

	public boolean selects_Benefit_Amount_for_Child_as_under_TLI(String CBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Child of Term Life Insurance Products");
			reuseMethod.dropDownselectbyvalue(BenefitAmount_Child_5YrProduct, CBenefit);
			log.info("Amount selected for Child of Term Life Insurance Product sucessfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Child of Term Life Insurance Product || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean selects_benefit_amount_for_Ten_Year_Product_Child_as(String CBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Child of Ten Years Products");

			if (BenefitAmount_Child_10YrProduct.isDisplayed()) {
				reuseMethod.dropDownselectbyvalue(BenefitAmount_Child_10YrProduct, CBenefit);
			} else {
				TenYrLifeTermInsuranceLabel.click();
				Thread.sleep(3000);
				reuseMethod.dropDownselectbyvalue(BenefitAmount_Child_10YrProduct, CBenefit);
			}

			log.info("Amount selected for Child of Ten Years Product sucessfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Child of Ten Year Product || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_benefit_amount_for_Child_as_under_TwentyYTL(String CBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Child of 20 Years Products");

			if (BenefitAmount_Child_20YrProduct.isDisplayed()) {
				reuseMethod.dropDownselectbyvalue(BenefitAmount_Child_20YrProduct, CBenefit);
			} else {
				TwentyYrLifeTermInsuranceLabel.click();
				Thread.sleep(2000);
				reuseMethod.dropDownselectbyvalue(BenefitAmount_Child_20YrProduct, CBenefit);
			}

			log.info("Amount selected for Child of 20 Years Product sucessfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Child of 20 Year Product || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_and_are_not_displayed_in_eligible_children_HLDD(String child) throws Exception {

		try {
			log.debug("Verify only Eligible Children under HLDD are Present on Coverage Page ");
			EligibileChilds_HLDD.isDisplayed();
			reuseMethod.scrollDown(AccidentalDeathLabel);
			boolean check;
			String Childs = EligibileChilds_HLDD.getText();
			String[] eligi_ChildList = Childs.split(",");

			if (!(BenefitAmount_Child_AccidentalProduct.isDisplayed())) {
				AccidentalDeathLabel.click();
			}
			for (int i = 0; i < eligi_ChildList.length; i++) {

				if (child.equalsIgnoreCase(eligi_ChildList[i])) {

					check = true;

					System.out.println("Child is Present for HLDD" + child);
				} else {
					check = false;

				}
				Assert.assertFalse(check);
				System.out.println("Child is not Present for HLDD" + child);
			}
			log.info("Eligible Childrens under HLDD are Verfied sucessfully... ||PASS");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify Eligible Children under HLDD || Fail" + e.getMessage());
			throw (e);
		}

	}

	// NSPE
	public boolean validates_eligible_children_Names_displayed_as_under_GroupTermLife(String ChildName)
			throws Exception {

		try {
			log.debug("Verify only some Children are available under GroupTermLife  on Coverage Page ");

			boolean check=false;
			String Childs = EligibileChildsName_GroupTermLife.getText();
			String[] eligi_ChildList = Childs.split(",");

			for (int i = 0; i < eligi_ChildList.length; i++) {
				String s = eligi_ChildList[i].replaceAll("\\s","");
				if (ChildName.equalsIgnoreCase(s)) {

					check = true;
					Assert.assertTrue(check);
					//break;

				} else {
					check = false;
				}
				
			}
			//Assert.assertTrue(check);
			System.out.println("Child is Present for GroupTermLife: " + ChildName);
			log.info("Eligible Childrens under GroupTermLife are Verfied sucessfully... ||PASS");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify Eligible Children under GroupTermLife || Fail" + e.getMessage());
			throw (e);
		}

	}
	
	public boolean validates_and_are_not_displayed_in_eligible_children_GroupTermLife(String child) throws Exception {
		try {
			log.debug("Verify only some Children are not available under GroupTermLife on Coverage Page ");
			//EligibileChildsName_GroupTermLife.isDisplayed();
			reuseMethod.scrollDown(TenYrLifeTermInsuranceLabel);
			boolean check;
			String Childs = EligibileChildsName_GroupTermLife.getText();
			String[] eligi_ChildList = Childs.split(",");

			for (int i = 0; i < eligi_ChildList.length; i++) {

				if (child.equalsIgnoreCase(eligi_ChildList[i])) {

					check = true;

				} else {
					check = false;
				}

				Assert.assertFalse(check);
			}
			System.out.println("Child is not Present for TenYTL" + child);
			log.info("Eligible Childrens under GroupTermLife are Verfied sucessfully... ||PASS");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify Eligible Children under GroupTermLife || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_eligible_children_Names_displayed_as_under_TenYTL(String ChildName) throws Exception {

		try {
			log.debug("Verify only some Children are available under TenYTL on Coverage Page ");
			Eligibile_Childs_Ten.isDisplayed();
			reuseMethod.scrollDown(TenYrLifeTermInsuranceLabel);
			boolean check;
			String Childs = Eligibile_Childs_Ten.getText();
			String[] eligi_ChildList = Childs.split(",");

			if (!(BenefitAmount_Child_10YrProduct.isDisplayed() || BenefitAmountChild_TenYTL_Label.isDisplayed())) {
				TenYrLifeTermInsuranceLabel.click();
			}
			for (int i = 0; i < eligi_ChildList.length; i++) {

				if (ChildName.equalsIgnoreCase(eligi_ChildList[i])) {

					check = true;
					Assert.assertTrue(check);
					break;
				} else {
					check = false;
				}

				// Assert.assertTrue(check);

			}
			System.out.println("Child is Present for TenYTL" + ChildName);

			log.info("Eligible Childrens under TenYTL are Verfied sucessfully... ||PASS");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify Eligible Children under TenYTL || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_and_are_not_displayed_in_eligible_children_HII(String child) throws Exception {

		try {
			log.debug("Verify only Eligible Children under HII are Present on Coverage Page ");
			EligibileChilds_HII.isDisplayed();
			reuseMethod.scrollDown(HospitalMoneyInsuranceLabel);
			boolean check;
			String Childs = EligibileChilds_HII.getText();
			String[] eligi_ChildList = Childs.split(",");

			if (!(BenefitAmount_Child_HospitalMoneyProduct.isDisplayed())) {
				HospitalMoneyInsuranceLabel.click();
			}
			for (int i = 0; i < eligi_ChildList.length; i++) {

				if (child.equalsIgnoreCase(eligi_ChildList[i])) {

					check = true;

					System.out.println("Child is Present for HII" + child);
				} else {
					check = false;

				}
				Assert.assertFalse(check);
				System.out.println("Child is not Present for HII" + child);
			}
			log.info("Eligible Childrens under HII are Verfied sucessfully... ||PASS");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify Eligible Children under HII || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_and_are_displayed_in_eligible_children_HII(String child) throws Exception {

		try {
			log.debug("Verify only Eligible Children under HII are Present on Coverage Page ");
			EligibileChilds_HII.isDisplayed();
			reuseMethod.scrollDown(HospitalMoneyInsuranceLabel);
			boolean check = false;
			String Childs = EligibileChilds_HII.getText();
			String[] eligi_ChildList = Childs.split(",");

			if (!(BenefitAmount_Child_HospitalMoneyProduct.isDisplayed())) {
				HospitalMoneyInsuranceLabel.click();
			}
			for (int i = 0; i < eligi_ChildList.length; i++) {

				if (child.equalsIgnoreCase(eligi_ChildList[i])) {

					check = true;

					Assert.assertTrue(check);
					System.out.println("Child is Present for HII" + child);
				}
			}

			log.info("Eligible Childrens under HII are Verfied sucessfully... ||PASS");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify Eligible Children under HII || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_and_are_not_displayed_in_eligible_children_TenYTL(String child) throws Exception {
		try {
			log.debug("Verify only some Children are not available under TenYTL  on Coverage Page ");
			Eligibile_Childs_Ten.isDisplayed();
			reuseMethod.scrollDown(TenYrLifeTermInsuranceLabel);
			boolean check;
			String Childs = Eligibile_Childs_Ten.getText();
			String[] eligi_ChildList = Childs.split(",");

			if (!(BenefitAmount_Child_10YrProduct.isDisplayed() || BenefitAmountChild_TenYTL_Label.isDisplayed())) {
				TenYrLifeTermInsuranceLabel.click();
			}
			for (int i = 0; i < eligi_ChildList.length; i++) {

				if (child.equalsIgnoreCase(eligi_ChildList[i])) {

					check = true;

				} else {
					check = false;
				}

				Assert.assertFalse(check);
			}
			System.out.println("Child is not Present for TenYTL" + child);
			log.info("Eligible Childrens under TenYTL are Verfied sucessfully... ||PASS");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify Eligible Children under TenYTL || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Quick_Decision_is_not_displayed_for_FiveYTL() throws Throwable {

		try {
			log.debug("Verify Quick Decision is not displayed for FiveYTL");

			boolean check = FiveYearQDSelf.isDisplayed();
			Assert.assertFalse(check, "Bug||Quick Decision is displayed for FiveYTL");

			log.info("Quick Decision is displayed for FiveYTL");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Quick Decision is not displayed for FiveYTL");
			log.error("Not able to validate that Quick Decision is not displayed for FiveYTL|| Fail");
			return false;
		}
	}

	public boolean validates_Quick_Decision_is_not_displayed_for_TenYTL() throws Throwable {

		try {
			log.debug("Verify Quick Decision is not displayed for TenYTL");

			boolean check = TenYearQDSelf.isDisplayed();
			Assert.assertFalse(check, "Bug||Quick Decision is displayed for TenYTL");

			log.info("Quick Decision is displayed for TenYTL");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Quick Decision is not displayed for TenYTL");
			log.error("Not able to validate that Quick Decision is not displayed for tenYTL|| Fail");
			return false;
		}
	}

	public boolean validate_Max_aggregrate_Message_is_displayed_for_GroupTerm_Product() throws Throwable {

		try {
			log.debug("Validate Max aggregrate Message is displayed for Group Term Product");
			String MaxAggregate_Message = PropertyUtility.Load_MessageFile_Data("MaxAggregateMessage");
			reuseMethod.scrollDown(MaxAggregate_FiveYr);
			MaxAggregate_FiveYr.isDisplayed();
			String actual = MaxAggregate_FiveYr.getText();
			Assert.assertEquals(actual, MaxAggregate_Message, "MaxAggregate_Message does not match");

			log.info("Max aggregrate Message is validated for Group Term Product");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Max aggregrate Message is not validated for Group Term Product");
			log.error("Not able to validate Max aggregrate Message for Group Term Product|| Fail");
			return false;
		}
	}

	public boolean validate_Max_aggregrate_Message_is_displayed_for_TenYTL_Product() throws Throwable {

		try {
			log.debug("Validate Max aggregrate Message is displayed for 10-Year Level Term Life Insurance product");
			String MaxAggregate_Message = PropertyUtility.Load_MessageFile_Data("MaxAggregateMessage");
			Thread.sleep(2000);
			MaxAggregate_TenYr.isDisplayed();
			reuseMethod.scrollDown(MaxAggregate_TenYr);
			String actual = MaxAggregate_TenYr.getText();
			Assert.assertEquals(actual, MaxAggregate_Message, "MaxAggregate_Message does not match");

			log.info("Max aggregrate Message is validated for 10-Year Level Term Life Insurance product");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Max aggregrate Message is not validated for 10-Year Level Term Life Insurance product");
			log.error(
					"Not able to validate Max aggregrate Message for 10-Year Level Term Life Insurance product|| Fail");
			return false;
		}
	}

	public boolean validate_Max_aggregrate_Message_is_displayed_for_TwentyYTL_Product() throws Throwable {

		try {
			log.debug("Validate Max aggregrate Message is displayed for 20-Year Level Term Life Insurance product");
			String MaxAggregate_Message = PropertyUtility.Load_MessageFile_Data("MaxAggregateMessage");
			Thread.sleep(2000);
			MaxAggregate_TwentyYr.isDisplayed();
			reuseMethod.scrollDown(MaxAggregate_TwentyYr);
			String actual = MaxAggregate_TwentyYr.getText();
			Assert.assertEquals(actual, MaxAggregate_Message, "MaxAggregate_Message does not match");

			log.info("Max aggregrate Message is validated for 20-Year Level Term Life Insurance product");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Max aggregrate Message is not validated for 20-Year Level Term Life Insurance product");
			log.error(
					"Not able to validate Max aggregrate Message for 20-Year Level Term Life Insurance product|| Fail");
			return false;
		}
	}

	public boolean selects_Self_benefit_amount_of_for_Accidental_Death_as(String Benefit) throws Exception {

		try {

			log.debug("Select Benefit Amount for Self of Accidental Death Products");
			// reuseMethod.scrollDown(Next);
			if (abeSelfBenefitAmountAccidentalProduct.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_AccidentalProduct, Benefit,
						abeSelfBenefitAmountAccidentalProduct, downArrow_Self_AccidentalProduct);
			} else {
				AccidentalDeathLabel.click();
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_AccidentalProduct, Benefit,
						abeSelfBenefitAmountAccidentalProduct, downArrow_Self_AccidentalProduct);
			}
			log.info("Amount selected for Self of Accidental Death Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Self of Accidental Death Product || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Spouse_benefit_amount_for_Accidental_Death_as(String sBenefit) throws Exception {

		try {

			log.debug("Select Benefit Amount for Spouse of Accidental Death Products");
			if (abeSpouseBenefitAmountAccidentalProduct.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_AccidentalProduct, sBenefit,
						abeSpouseBenefitAmountAccidentalProduct, downArrow_Spouse_AccidentalProduct);
			} else {
				AccidentalDeathLabel.click();
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_AccidentalProduct, sBenefit,
						abeSpouseBenefitAmountAccidentalProduct, downArrow_Spouse_AccidentalProduct);
			}
			log.info("Amount selected for Spouse of Accidental Death Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Spouse of Accidental Death Product|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Child_benefit_amount_for_Accidental_Death_as(String cBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Child of Accidental Death Products");
			if (BenefitAmount_Child_AccidentalProduct.isDisplayed()) {
				reuseMethod.dropDownselectbyvalue(BenefitAmount_Child_AccidentalProduct, cBenefit);
			} else {
				AccidentalDeathLabel.click();
				Thread.sleep(3000);
				reuseMethod.dropDownselectbyvalue(BenefitAmount_Child_AccidentalProduct, cBenefit);
			}
			log.info("Amount selected for Child of Accidental Death Product sucessfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Child of Accidental Death Product || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean selects_benefit_amount_for_Child_as_under_HMI(String cBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Child of Hospital Money Insurance Products");
			if (BenefitAmount_Child_HospitalMoneyProduct.isDisplayed()) {
				reuseMethod.dropDownselectbyvalue(BenefitAmount_Child_HospitalMoneyProduct, cBenefit);
			} else {
				HospitalMoneyInsuranceLabel.click();

				Thread.sleep(3000);
				reuseMethod.dropDownselectbyvalue(BenefitAmount_Child_HospitalMoneyProduct, cBenefit);
			}
			log.info("Amount selected for Child of Hospital Money Insurance Product sucessfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Child of Hospital Money Insurance Product || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean selects_benefit_amount_for_Ten_Year_Product_Spouse_as(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Spouse of Ten Years Products");
			if (SpouseBenefitAmount10Yr.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_TenYrProduct, sBenefit, SpouseBenefitAmount10Yr,
						downArrow_Spouse_TenYrProduct);
			} else {
				TenYrLifeTermInsuranceLabel.click();
				Thread.sleep(3000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_TenYrProduct, sBenefit, SpouseBenefitAmount10Yr,
						downArrow_Spouse_TenYrProduct);
			}

			log.info("Amount selected for Spouse of Ten Years Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Spouse of Ten Year Product|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_under_FiveYTL_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for Five Years Products");
			String MinAmt = MinAmount_FiveYrSelf.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for Five Year Product is validated");
			}
			String MaxAmt = MaxAmount_FiveYrSelf.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for Five Year Product is validated");
			}
			log.info("Benefit Slider Ranges for Five Years Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for Five Years Products|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Chronic_Illness_Rider_for_Five_Year_Product() throws Exception {

		try {
			log.debug("Selects Chronic Illness Rider for Five Year Product");
			ChronicRider_FiveYrSelf.isDisplayed();
			ChronicRider_FiveYrSelf.click();
			Thread.sleep(2000);

			log.info("Chronic Illness Rider for Five Year Product is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Chronic Illness Rider for Five Year Product|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Chronic_Illness_Rider_for_Five_Year_Product_Spouse() throws Exception {

		try {
			log.debug("Selects Chronic Illness Rider for Five Year Product Spouse");
			ChronicRider_FiveYrSpouse.isDisplayed();
			ChronicRider_FiveYrSpouse.click();

			log.info("Chronic Illness Rider for Five Year Product Spouse is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Chronic Illness Rider for Five Year Product Spouse|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Self_as_under_TenYTL(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Self of Ten Years Products");
			if (abeSelfBenefitAmount10Yr.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_TenYrProduct, sBenefit, abeSelfBenefitAmount10Yr,
						downArrow_Self_TenYrProduct);
			} else {
				TenYrLifeTermInsuranceLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_TenYrProduct, sBenefit, abeSelfBenefitAmount10Yr,
						downArrow_Self_TenYrProduct);
			}
			log.info("Amount selected for Self of Ten Years Product sucessfully || Pass");
			return true;
		} catch (Exception e) {

			log.error("Not able to select the benefit Amount for Self of Ten Year Product|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_TenYTL_the_Benefit_Slider_Range_as_to_Self(String Min, String Max) throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for Ten Years Products");
			String MinAmt = MinAmount_TenYrSelf.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			
			if(MinAmt.contains("$")){
				MinAmt=MinAmt.substring(1);
			}
			MinAmt.replaceAll(",","");
			MinAmt.trim();
			if(Min.contains("$")){
				Min=Min.substring(1);
			}
			Min.replaceAll(",","");
			Min.trim();
			
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for Ten Year Product is validated");
			}
			
			String MaxAmt = MaxAmount_TenYrSelf.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);
			
			if(MaxAmt.contains("$")){
				MaxAmt=MaxAmt.substring(1);
			}
			MaxAmt.replaceAll(",","");
			MaxAmt.trim();
			if(Max.contains("$")){
				Max=Max.substring(1);
			}
			Max.replaceAll(",","");
			Max.trim();
						

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for Ten Year Product is validated");
			}
			log.info("Benefit Slider Ranges for Ten Years Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for Ten Years Products|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Waiver_of_Premium_Rider_for_TenYear_for_Self() throws Exception {

		try {
			log.debug("Selects Waiver of Premium  Rider for Ten Year Product");
			reuseMethod.scrollDown(abeSelfBenefitAmount10Yr);
			Thread.sleep(500);
			Rider_TenYrSelf.isDisplayed();
			Rider_TenYrSelf.click();
			Thread.sleep(1000);

			log.info("Waiver of Premium  Rider for Ten Year Product is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Waiver of Premium  Rider for Ten Year Product|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Waiver_of_Premium_Rider_for_TenYear_Spouse() throws Exception {

		try {
			log.debug("Selects Waiver of Premium  Rider for Ten Year Product Spouse ");
			Rider_TenYrSpouse.isDisplayed();
			Rider_TenYrSpouse.click();

			log.info("Waiver of Premium  Rider for Ten Year Product Spouse is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Waiver of Premium  Rider for Ten Year Product|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Waiver_Rider_for_Twenty_Year_Product_Spouse() throws Exception {

		try {
			log.debug("Selects Waiver of Premium  Rider for Twenty Year Product Spouse ");
			Rider_TwentyYrSpouse.isDisplayed();
			Rider_TwentyYrSpouse.click();

			log.info("Waiver of Premium  Rider for Twenty Year Product Spouse is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Waiver of Premium  Rider for Twenty Year Product|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_TenYTL_the_Benefit_Amounts_Listed_are(String amount) throws Exception {

		try {
			log.debug("Validate Ten Year Benefit Amount for Child dropdown");

			List<WebElement> options = reuseMethod.dropDowngetOption(BenefitAmount_Child_10YrProduct);
			for (WebElement we : options) {
				if (we.getText().equals(amount)) {
					System.out.println("Value for Ten Year Dropdown list is matched..." + we.getText());

				}

			}

			log.info("Dropdown values for Ten year Child Benefit dropdown Values are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Dropdown values for Ten year Child Benefit dropdown Values|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_FiveYTL_the_Benefit_Amounts_for_Child_Listed_are(String amount) throws Exception {

		try {
			log.debug("Validate FiveYTL ABE Benefit Amount for Child dropdown");

			List<WebElement> options = reuseMethod.dropDowngetOption(BenefitAmount_Child_5YrProduct);
			for (WebElement we : options) {
				if (we.getText().equals(amount)) {
					System.out.println("Value for FiveYTL ABE Child Dropdown list is matched..." + we.getText());

				}

			}
			log.info("Dropdown values for FiveYTL ABE Child Benefit dropdown Values are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Dropdown values for FiveYTL ABE Child Benefit dropdown Values|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_Term_Life_the_Benefit_Amounts_for_Child_Listed_are(String amount) throws Exception {

		try {
			log.debug("Validate FiveYTL ABE Benefit Amount for Child dropdown");

			List<WebElement> options = reuseMethod.dropDowngetOption(BenefitAmount_Child_5YrProduct);
			for (WebElement we : options) {
				if (we.getText().equals(amount)) {
					System.out.println("Value for Term Life Child Dropdown list is matched..." + we.getText());

				}

			}
			log.info("Dropdown values for Term Life Child Benefit dropdown Values are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Dropdown values for Term Life Child Benefit dropdown Values|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_TwentyYTL_the_Benefit_Amounts_for_Child_Listed_are(String amount) throws Exception {

		try {
			log.debug("Validate Twenty Year Benefit Amount for Child dropdown");

			List<WebElement> options = reuseMethod.dropDowngetOption(BenefitAmount_Child_20YrProduct);
			for (WebElement we : options) {
				if (we.getText().equals(amount)) {
					System.out.println("Value for Twenty Year Child Dropdown list is matched..." + we.getText());

				}

			}

			log.info("Dropdown values for Twenty year Child Benefit dropdown Values are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Dropdown values for Twenty year Child Benefit dropdown Values|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_HLDD_the_Benefit_Amounts_Listed_are(String amount) throws Exception {

		try {

			log.debug("Validate HLDD Benefit Amount for Child dropdown");
			// Select select=new Select(BenefitAmount_Child_AccidentalProduct);
			List<WebElement> options = reuseMethod.dropDowngetOption(BenefitAmount_Child_AccidentalProduct);
			for (WebElement we : options) {
				if (we.getText().equals(amount)) {
					System.out.println("Value for HLDD Dropdown list is matched for Child..." + we.getText());

				}

			}

			log.info("Dropdown values for HLDD Child Benefit dropdown Values are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Dropdown values for HLDD Child Benefit dropdown Values|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_HII_the_Benefit_Amounts_for_Child_Listed_are(String amount) throws Exception {

		try {
			log.debug("Validate HII Benefit Amount for Child dropdown");
			// Select select=new Select(BenefitAmount_Child_HospitalMoneyProduct);
			if (!BenefitAmount_Child_HospitalMoneyProduct.isDisplayed()) {
				HospitalMoneyInsuranceLabel.click();
			}
			List<WebElement> ChildBeneAmt_HII = reuseMethod.dropDowngetOption(BenefitAmount_Child_HospitalMoneyProduct);
			for (WebElement we : ChildBeneAmt_HII) {
				if (we.getText().equals(amount)) {
					System.out.println("Value for HII Dropdown list is matched for Child..." + we.getText());

				}

			}

			log.info("Dropdown values for HII Child Benefit dropdown Values are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Dropdown values for HII Child Benefit dropdown Values|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_FifteenYTL_the_Benefit_Amounts_for_Child_Listed_are(String amount) throws Exception {

		try {
			log.debug("Validate HII Benefit Amount for Child dropdown");
			// Select select=new Select(BenefitAmount_Child_HospitalMoneyProduct);
			if (!BenefitAmount_Child_15YrProduct.isDisplayed()) {
				FifteenYrLabel.click();
			}
			List<WebElement> ChildBeneAmt_HII = reuseMethod.dropDowngetOption(BenefitAmount_Child_15YrProduct);
			for (WebElement we : ChildBeneAmt_HII) {
				if (we.getText().equals(amount)) {
					System.out.println("Value for 15 year Dropdown list is matched for Child..." + we.getText());

				}

			}

			log.info("Dropdown values for 15 year Child Benefit dropdown Values are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Dropdown values for 15 year Child Benefit dropdown Values|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_HII_the_Benefit_Amounts_for_Self_Listed_are(String amount) throws Exception {

		try {
			log.debug("Validate HII Benefit Amount for Self dropdown");
			List<WebElement> SelfBeneAmt_HII = reuseMethod.dropDowngetOption(BenefitAmount_Self_HMI);
			for (WebElement we : SelfBeneAmt_HII) {
				if (we.getText().equals(amount)) {
					System.out.println("Value for HII Dropdown list is matched for Self..." + we.getText());

				}

			}

			log.info("Dropdown values for HII Self Benefit dropdown Values are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Dropdown values for HLDD Self Benefit dropdown Values|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_HII_the_Benefit_Amounts_for_Spouse_Listed_are(String amount) throws Exception {

		try {
			log.debug("Validate HII Benefit Amount for Spouse dropdown");
			List<WebElement> SpouseBeneAmt_HII = reuseMethod.dropDowngetOption(BenefitAmount_Spouse_HMI);
			for (WebElement we : SpouseBeneAmt_HII) {
				if (we.getText().equals(amount)) {
					System.out.println("Value for HII Dropdown list is matched for Spouse..." + we.getText());

				}

			}

			log.info("Dropdown values for HII Spouse Benefit dropdown Values are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Dropdown values for HLDD Spouse Benefit dropdown Values|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_DII_the_Waiting_Period_Listed_are(String period) throws Exception {

		try {
			log.debug("Validate DII Waiting Period for Self dropdown");
			// Select select=new Select(WaitingPeriodDII_Self);
			List<WebElement> waitingPeriod = reuseMethod.dropDowngetOption(WaitingPeriodDII_Self);
			for (WebElement we : waitingPeriod) {
				if (we.getText().equals(period)) {
					System.out.println("Value for DII Waiting Period Dropdown list is matched..." + we.getText());

				}

			}

			log.info(
					"Dropdown values for  DII Waiting Period Self Benefit dropdown Values are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Dropdown values for DII Waiting Period Self Benefit dropdown Values|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_DII_the_Benefit_Option_Listed_are(String option) throws Exception {

		try {
			log.debug("Validate DII Benefit Option for Self dropdown");

			List<WebElement> benefitOption = reuseMethod.dropDowngetOption(BenefitOptionDII_Self);
			for (WebElement we : benefitOption) {
				if (we.getText().equals(option)) {
					System.out.println("Value for DII Benefit Option Dropdown list is matched..." + we.getText());

				}

			}
			log.info(
					"Dropdown values for  DII Benefit Option Self Benefit dropdown Values are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Dropdown values for DII Benefit Option Self Benefit dropdown Values|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validate_Maximum_Monthly_Benefit_Amount_for_Self_for_DII(String amount) throws Throwable {

		try {
			log.debug("Validate Maximum Monthly Benefit Amount for DII");
			if (!MaxBenefitAmount_DII.isDisplayed()) {
				DisabilityIncomeInsuranceLabel.click();
			}
			reuseMethod.scrollDown(DisabilityIncomeInsuranceLabel);
			Thread.sleep(2000);

			MaxBenefitAmount_DII.isDisplayed();
			String actual = MaxBenefitAmount_DII.getAttribute("value");
					actual = actual.replace("$","");
					actual=actual.replaceAll(",","");
					actual=actual.trim();
					
					if (amount.contains("$")) {
						amount = amount.substring(1);
					}
					amount = amount.replaceAll(",","");
					amount=amount.trim();	
					

			System.out.println("Maximum Monthly Benefit Amount for DII is validated Successfully.. " + actual);
			Assert.assertEquals(actual, amount, "Maximum Benefit amount does not match");

			log.info("Maximum Monthly Benefit Amount for DII is validated successfully ||Pass");
			return true;
		} catch (Exception e) {
			System.out.println("Maximum Monthly Benefit Amount is not validated for DII Self");
			log.error("Not able to validate Maximum Monthly Benefit Amount for DII Self|| Fail");
			return false;
		}
	}

	public boolean selects_Catastrophic_Disability_Benefit_Rider_for_DII_Self() throws Exception {

		try {
			log.debug("Selects Catastrophic Disability Benefit Rider for Disability Income Insurance Product");
			reuseMethod.scrollDown(SelfBenefitAmountDII);
			Thread.sleep(1000);
			Rider_Catastrophic_DII.isDisplayed();
			Rider_Catastrophic_DII.click();
			Thread.sleep(500);

			log.info(
					"Catastrophic Disability Benefit Rider for Disability Income Insurance Product is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Selects Catastrophic Disability Benefit Rider for Disability Income Insurance Product|| Fail"
							+ e.getMessage());

			throw (e);
		}

	}

	public boolean validate_that_the_Catastrophic_Disability_Benefit_Rider_is_rendered() throws Exception {

		try {
			log.debug("Validate that the Catastrophic Disability Benefit Rider is rendered");

			boolean check = Rider_Catastrophic_DII.isDisplayed();
			assertTrue(check, "Catastrophic Disability Benefit Rider is not rendered");
			System.out.println(
					"Catastrophic Disability Benefit Rider for Disability Income Insurance Product is Renderded  sucessfully");
			log.info(
					"Catastrophic Disability Benefit Rider for Disability Income Insurance Product is Renderded  sucessfully || Pass");
			return true;
		} catch (NoSuchElementException e) {
			log.error(
					"Not able to validate Catastrophic Disability Benefit Rider for Disability Income Insurance Product|| Fail"
							+ e.getMessage());
			return false;
		}

	}

	public boolean validate_that_the_Catastrophic_Disability_Benefit_Rider_is_not_rendered() throws Exception {

		try {
			log.debug("Validate that the Catastrophic Disability Benefit Rider is not rendered");

			boolean check = Rider_Catastrophic_DII.isDisplayed();
			Assert.assertFalse(check, "Catastrophic Disability Benefit Rider is rendered");
			System.out.println(
					"Catastrophic Disability Benefit Rider for Disability Income Insurance Product is not Renderded  sucessfully");
			log.info(
					"Catastrophic Disability Benefit Rider for Disability Income Insurance Product is Renderded  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate Catastrophic Disability Benefit Rider for Disability Income Insurance Product is not rendered|| Fail"
							+ e.getMessage());

			throw (e);
		}

	}

	public boolean select_Rider_Benefit_Amount_for_DII_Self_as(String Benefit) throws Exception {

		try {

			log.debug("Select Benefit Amount for Self of DII Rider Insurance Products");
			if (SelfBenefitAmountDII_Rider.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_DIIRider, Benefit, SelfBenefitAmountDII_Rider,
						downArrow_Self_DIIRider);
			} else {
				DisabilityIncomeInsuranceLabel.click();
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_DIIRider, Benefit, SelfBenefitAmountDII_Rider,
						downArrow_Self_DIIRider);
			}

			log.info("Amount selected for Self of DII Rider Insurance Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Self of DII Rider Insurance Product || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean validates_under_Rider_the_Benefit_Slider_Range_for_DII_Self_as_to(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for DII Rider Products");
			String MinAmt = MinAmount_DIISelfRider.getText();
			System.out.println("Actual Min DII Amount Self Rider:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for DII Product Rider is validated");
			}
			String MaxAmt = MaxAmount_DIISelfRider.getText();
			System.out.println("Actual Max DII Amount Self Rider:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for DII Rider Product is validated");
			}
			log.info("Benefit Slider Ranges for DII Rider Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for DII Rider Products|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Cost_of_Living_Adjustment_Rider_for_DII_Self() throws Exception {

		try {
			log.debug("Selects Cost of Living Adjustment  Rider for Disability Income Insurance Product");
			reuseMethod.scrollDown(SelfBenefitAmountDII);
			Thread.sleep(1000);
			Rider_COLA_DII.isDisplayed();
			Rider_COLA_DII.click();
			Thread.sleep(500);

			log.info(
					"Cost of Living Adjustment Rider for Disability Income Insurance is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Selects Cost of Living Adjustment Rider for Disability Income Insurance Product|| Fail"
							+ e.getMessage());

			throw (e);
		}

	}

	public boolean validate_that_the_Rider_message_is_displayed() throws Throwable {

		try {
			log.debug("Validate that the Rider message is displayed");
			String expected = PropertyUtility.Load_MessageFile_Data("Rider_Message");
			reuseMethod.scrollDown(RiderMessage);
			RiderMessage.isDisplayed();
			String actual = RiderMessage.getText();
			Assert.assertEquals(actual, expected, "Rider_Message does not match");
			System.out.println("Rider Message is valiadted...");
			log.info("Rider Meaage is validated sucessfully...||Pass");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Rider Message is not valiadted...");
			log.error("Not able to Validate that the Rider message|| Fail");
			return false;
		}
	}

	public boolean validates_under_the_Benefit_Amounts_for_child_Listed_are(String amount1, String amount2,
			String amount3, String amount4, String amount5, String amount6, String amount7, String amount8,
			String amount9, String amount10, String amount11) {

		try {
			log.debug("Validate Benefit Amount for Child dropdown");
			String[] amount = { amount1, amount2, amount3, amount4, amount5, amount6, amount7, amount8, amount9,
					amount10, amount11 };
			int length = amount.length;
			/*
			 * Select s = new Select(BenefitAmount_Child_FiveYrProduct); List<WebElement>
			 * ChildBeneAmt=s.getOptions(); System.out.println(ChildBeneAmt.size());
			 */

			// List<WebElement> ChildBeneAmt = driver.findElements((By)
			// BenefitAmount_Child_FiveYrProduct);
			List<WebElement> ChildBeneAmt = reuseMethod.dropDowngetOption(BenefitAmount_Child_FiveYrProduct);
			for (int j = 1; j <= ChildBeneAmt.size(); j++) {

				if (ChildBeneAmt.get(j).getText().equals(amount1)) {
					System.out.println("Value form Dropdown list is matched..." + ChildBeneAmt.get(j).getText());

				} else if (ChildBeneAmt.get(j).getText().equals(amount2)) {
					System.out.println("Value form Dropdown list is matched..." + ChildBeneAmt.get(j).getText());
				}

				else if (ChildBeneAmt.get(j).getText().equals(amount3)) {
					System.out.println("Value form Dropdown list is matched..." + ChildBeneAmt.get(j).getText());
				} else if (ChildBeneAmt.get(j).getText().equals(amount4)) {
					System.out.println("Value form Dropdown list is matched..." + ChildBeneAmt.get(j).getText());
				}

				else if (ChildBeneAmt.get(j).getText().equals(amount5)) {
					System.out.println("Value form Dropdown list is matched..." + ChildBeneAmt.get(j).getText());
				}

				else if (ChildBeneAmt.get(j).getText().equals(amount6)) {
					System.out.println("Value form Dropdown list is matched..." + ChildBeneAmt.get(j).getText());
				}

				else if (ChildBeneAmt.get(j).getText().equals(amount7)) {
					System.out.println("Value form Dropdown list is matched..." + ChildBeneAmt.get(j).getText());
				}

				else if (ChildBeneAmt.get(j).getText().equals(amount8)) {
					System.out.println("Value form Dropdown list is matched..." + ChildBeneAmt.get(j).getText());
				}

				else if (ChildBeneAmt.get(j).getText().equals(amount9)) {
					System.out.println("Value form Dropdown list is matched..." + ChildBeneAmt.get(j).getText());
				}

				else if (ChildBeneAmt.get(j).getText().equals(amount10)) {
					System.out.println("Value form Dropdown list is matched..." + ChildBeneAmt.get(j).getText());
				} else if (ChildBeneAmt.get(j).getText().equals(amount11)) {
					System.out.println("Value form Dropdown list is matched..." + ChildBeneAmt.get(j).getText());
				}

				break;

			}

			log.info("Dropdown values for HII Child Benefit dropdown Values are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Dropdown values for HLDD Child Benefit dropdown Values|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	// **********************************************MOBILE***************************************************//

	public boolean your_Coverage_page_is_displayed_select_the_amount_of_Traditional_Term_coverage_as_Mobile(
			String Benefit) throws Exception {
		try {
			log.debug("Traditional benefit Selected for Self (Mobile Site)");
			your_Coverage_page_is_displayed();
			reuseMethod.select_Benefit_Amount_slider(traditionalPlusSelf_Mobile, Benefit, traditionalAmountSelf_Mobile,
					traditionalMinusSelf_Mobile);

			log.info("Traditional benefit Selected for Self (Mobile Site)|| Pass");
		}

		catch (Exception e) {
			log.error("Traditional benefit Selected for Self (Mobile Site)|| Fail" + e.getMessage());
			throw (e);
		}
		return true;
	}

	public boolean selects_Benefit_Amount_for_Self_as_under_TwentyYTL(String sBenefit) throws Exception {

		try {

			log.debug("Select Benefit Amount for Self of Twenty Years Products");
			if (SelfBenefitAmount20Yr.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_TwentyYrProduct, sBenefit, SelfBenefitAmount20Yr,
						downArrow_Self_TwentyYrProduct);
			} else {
				TwentyYrLifeTermInsuranceLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_TwentyYrProduct, sBenefit, SelfBenefitAmount20Yr,
						downArrow_Self_TwentyYrProduct);
			}
			log.info("Amount selected for Self of Twenty Years Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for self of Twenty Year Product|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_TwentyYTL_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for Twenty Years Products");
			String MinAmt = MinAmount_TwentyYrSelf.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for Twenty Year Product is validated");
			}
			String MaxAmt = MaxAmount_TwentyYrSelf.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for Twenty Year Product is validated");
			}
			log.info("Benefit Slider Ranges for Twenty Years Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for Twenty Years Products|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Spouse_as_under_TwentyYTL(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Spouse of Twenty Years Products");
			if (abeSpouseBenefitAmount20Yr.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_TwentyYrProduct, sBenefit,
						abeSpouseBenefitAmount20Yr, downArrow_Spouse_TwentyYrProduct);
			} else {
				TwentyYrLifeTermInsuranceLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_TwentyYrProduct, sBenefit,
						abeSpouseBenefitAmount20Yr, downArrow_Spouse_TwentyYrProduct);
			}
			log.info("Amount selected for Spouse of Twenty Years Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select the benefit Amount for Spouse of Twenty Year Product|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Spouse_as_under_LTDPlus(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Spouse of LTDP Products");
			if (abeSpouseBenefitAmountLTDPProduct.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_LTDPProduct, sBenefit,
						abeSpouseBenefitAmountLTDPProduct, downArrow_Spouse_LTDPProduct);
			} else {
				LongTermDisabilityPlusLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_LTDPProduct, sBenefit,
						abeSpouseBenefitAmountLTDPProduct, downArrow_Spouse_LTDPProduct);
			}
			log.info("Amount selected for Spouse of LTDP Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Spouse of LTDP Product|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_TwentyYTL_for_Spouse_the_Benefit_Slider_Range_as_to(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges of Spouse for Twenty Years Products");
			String MinAmt = MinAmount_TwentyYrSpouse.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for Twenty Year Product of Spouse is validated");
			}
			String MaxAmt = MaxAmount_TwentyYrSpouse.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for Twenty Year Product of Spouse is validated");
			}
			log.info("Benefit Slider Ranges for Twenty Years Products of Spouse  are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for Twenty Years of Spouse Products|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_ADDI_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges of Spouse for Accidental Death Products");
			String MinAmt = MinAmount_ACCSpouse.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for Accidental Death Product of Spouse is validated");
			}
			String MaxAmt = MaxAmount_ACCSpouse.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for  Accidental Death Product of Spouse is validated");
			}
			log.info(
					"Benefit Slider Ranges for Accidental Death Products of Spouse  are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for Accidental Death of Spouse Products|| Fail"
					+ e.getMessage());

			throw (e);
		}
	}

	public boolean validates_under_FiveYTL_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges of Spouse for Five Year Term Insurance Products");
			String MinAmt = MinAmount_FiveYrSpouse.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for Five Year Term Insurance of Spouse is validated");
			}
			String MaxAmt = MaxAmount_FiveYrSpouse.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for Five Year Term Insurance Product of Spouse is validated");
			}
			log.info(
					"Benefit Slider Ranges for Five Year Term Insurance Products of Spouse  are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Validate Benefit Slider Ranges for Five Year Term Insurance of Spouse Products|| Fail"
							+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_TenYTL_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges of Spouse for Ten Year Term Insurance Products");
			String MinAmt = MinAmount_TenYrSpouse.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for Ten Year Term Insurance Product of Spouse is validated");
			}
			String MaxAmt = MaxAmount_TenYrSpouse.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for Ten Year Term Insurance of Spouse is validated");
			}
			log.info(
					"Benefit Slider Ranges for Ten Year Term Insurance Products of Spouse  are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for Ten Year Term Insurance Spouse Products|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_TwentyYTL_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges of Spouse for Twenty Year Term Insurance Products");
			String MinAmt = MinAmount_TwentyYrSpouse.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for Twenty Year Term Insurance Product of Spouse is validated");
			}
			String MaxAmt = MaxAmount_TwentyYrSpouse.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for Twenty Year Term Insurance of Spouse is validated");
			}
			log.info(
					"Benefit Slider Ranges for Twenty Year Term Insurance Products of Spouse  are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for Twenty Year Term Insurance Spouse Products|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_LTDPlus_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges of Spouse for LTDP Products");
			String MinAmt = MinAmount_LTDPSpouse.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for LTDP of Spouse is validated");
			}
			String MaxAmt = MaxAmount_LTDPSpouse.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for LTDP Product of Spouse is validated");
			}
			log.info("Benefit Slider Ranges for LTDP Products of Spouse  are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for LTDP of Spouse Products|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_LTD_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges of Spouse for LTD Products");
			String MinAmt = MinAmount_LTDSpouse.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for LTD Product of Spouse is validated");
			}
			String MaxAmt = MaxAmount_LTDSpouse.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for LTD of Spouse is validated");
			}
			log.info("Benefit Slider Ranges for LTD Products of Spouse  are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for LTD Spouse Products|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_MTDI_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges of Spouse for MID Products");
			String MinAmt = MinAmount_MIDSpouse.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for MID of Spouse is validated");
			}
			String MaxAmt = MaxAmount_MIDSpouse.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for MID Product of Spouse is validated");
			}
			log.info("Benefit Slider Ranges for MID Products of Spouse  are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for MID of Spouse Products|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_CI_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges of Spouse for CI Products");
			String MinAmt = MinAmount_CISpouse.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for CI Product of Spouse is validated");
			}
			String MaxAmt = MaxAmount_CISpouse.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for CI of Spouse is validated");
			}
			log.info("Benefit Slider Ranges for CI Products of Spouse  are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for CI Spouse Products|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Waiver_Rider_for_Twenty_Year_Product() throws Exception {

		try {
			log.debug("Selects Waiver of Premium  Rider for Twenty Year Product");
			reuseMethod.scrollDown(SelfBenefitAmount20Yr);
			Thread.sleep(500);
			Rider_TwentyYrSelf.isDisplayed();
			Rider_TwentyYrSelf.click();
			Thread.sleep(1000);

			log.info("Waiver of Premium  Rider for Twenty Year Product is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Waiver of Premium  Rider for Twenty Year Product|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Waiver_of_Premium_Rider_for_Self_under_FifteenYTL() throws Exception {

		try {
			log.debug("Selects Waiver of Premium  Rider for Fifteen Year Product");
			reuseMethod.scrollDown(SelfBenefitAmount15Yr);
			Thread.sleep(500);
			WOP_Rider_FifteenYTL.isDisplayed();
			WOP_Rider_FifteenYTL.click();
			Thread.sleep(1000);

			log.info("Waiver of Premium  Rider for Fifteen Year Product is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Waiver of Premium  Rider for Fifteen Year Product|| Fail" + e.getMessage());

			throw (e);
		}

	}



	public boolean selects_Rider_Benefit_Amount_for_Self_as_for_ADnD_Rider_under_FifteenYTL(String Benefit2)
			throws Exception {

		try {
			log.debug("Selects Rider Benefit Amount for Self ADnD Rider under FifteenYTL");
			if (!SelfBenefitAmount15Yr.isDisplayed()) {

				FifteenYrLabel.click();
				Thread.sleep(2000);

			}

			reuseMethod.select_Benefit_Amount_slider(upArrow_Self_FifteenYrProduct_ADnDRider, Benefit2,
					SelfBenefitAmount15Yr_ADnDRider, downArrow_Self_FifteenYrProduct_ADnDRider);

			log.info(" Rider Benefit Amount for Self ADnD Rider under FifteenYTL is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Rider Benefit Amount for Self ADnD Rider under FifteenYTL|| Fail"+ e.getMessage());
			throw (e);
		}

	}

	public boolean validates_under_ADnD_Rider_FifteenYTL_Benefit_Slider_Range_as_to_for_Self(String Min, String Max)throws Exception {

		try {
			log.debug("Validates under ADnD Rider FifteenYTL Benefit Slider Range as for Self");
			String MinAmt = FifteenMin_AmntSelf_ADnDRider.getText();
			System.out.println("Actual Min Amount Self:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for self for ADnD Rider FifteenYTL is validated");
			}
			String MaxAmt = FifteenMax_AmntSelf_ADnDRider.getText();
			System.out.println("Actual Max Amount self:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for self for ADnD Rider FifteenYTL is validated");
			}
			log.info("Benefit Slider Ranges for self for ADnD Rider FifteenYTL are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for ADnD Rider FifteenYTL for self|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Benefit_Amount_for_Self_as_under_PureTerm(String Benefit2) throws Exception {

		try {
			log.debug("Selects Benefit Amount for Self under Pure Term Life Insurance");
			if (!BenefitAmount_PureTerm_Self.isDisplayed()) {

				PureTermLifeInsuranceLabel.click();
				Thread.sleep(2000);
			}
			reuseMethod.select_Benefit_Amount_slider(upArrow_Self_PureTerm, Benefit2, BenefitAmount_PureTerm_Self,
					downArrow_Self_PureTerm);

			log.info("Benefit Amount for Self under PureTerm Life Insurance is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select  Benefit Amount for Self under PureTerm|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_under_PureTerm_the_Benefit_Slider_Range_as_to_for_Self(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validates under PureTerm Benefit Slider Range as for Self");
			String MinAmt = MinAmount_PureTermSelf.getText();
			System.out.println("Actual Min Amount Self under PureTerm:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for self for PureTerm is validated");
			}
			String MaxAmt = MaxAmount_PureTermSelf.getText();
			System.out.println("Actual Max Amount self:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for self for PureTerm is validated");
			}
			log.info("Benefit Slider Ranges for self for PureTerm are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges forPureTerm for self|| Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean selects_Waiver_of_Premium_Rider_for_Self_under_PureTerm() throws Exception {

		try {
			log.debug("Selects Waiver of Premium  Rider for PureTermLife Product");
			reuseMethod.scrollDown(BenefitAmount_PureTerm_Self);
			Thread.sleep(500);
			WOPRider_PureTerm_Self.isDisplayed();
			WOPRider_PureTerm_Self.click();
			Thread.sleep(1000);

			log.info("Waiver of Premium  Rider for PureTermLife Product is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Waiver of Premium  Rider for PureTermLife Product|| Fail" + e.getMessage());

			throw (e);
		}

	}
	
	
	public boolean selects_Benefit_Amount_for_Self_as_under_PrefTerm(String Benefit2) throws Exception {

		try {
			log.debug("Selects Benefit Amount for Self under Preferred Term Life Insurance");
			if (!BenefitAmount_PrefTerm_Self.isDisplayed()) {

				PrefTermLifeInsuranceLabel.click();
				Thread.sleep(2000);
			}
			reuseMethod.select_Benefit_Amount_slider(upArrow_Self_PrefTerm, Benefit2, BenefitAmount_PrefTerm_Self,
					downArrow_Self_PrefTerm);

			log.info("Benefit Amount for Self under Preferred Term Life Insurance is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select  Benefit Amount for Self under Preferred Term|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_under_PrefTerm_the_Benefit_Slider_Range_as_to_for_Self(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validates under Preferred Term Benefit Slider Range as for Self");
			String MinAmt = MinAmount_PrefTermSelf.getText();
			System.out.println("Actual Min Amount Self under PrefTerm:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for self for Preferred Term is validated");
			}
			String MaxAmt = MaxAmount_PrefTermSelf.getText();
			System.out.println("Actual Max Amount self:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for self for Preferred Term is validated");
			}
			log.info("Benefit Slider Ranges for self for Preferred Term are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for Preferred Term for self|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Waiver_of_Premium_Rider_for_Self_under_PrefTerm() throws Exception {

		try {
			log.debug("Selects Waiver of Premium  Rider for Preferred TermLife Product");
			reuseMethod.scrollDown(BenefitAmount_PrefTerm_Self);
			Thread.sleep(500);
			WOPRider_PrefTerm_Self.isDisplayed();
			WOPRider_PrefTerm_Self.click();
			Thread.sleep(1000);

			log.info("Waiver of Premium  Rider for Preferred TermLife Product is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Waiver of Premium  Rider for Preferred TermLife Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_AD_D_Rider_for_Self_under_PrefTerm() throws Exception {

		try {
			log.debug("Selects ADnD  Rider for Preferred Term Life Product");
			reuseMethod.scrollDown(SelfBenefitAmount15Yr);
			Thread.sleep(500);
			ADnDRider_PrefTerm_Self.isDisplayed();
			ADnDRider_PrefTerm_Self.click();
			Thread.sleep(1000);

			log.info("ADnD Rider for Preferred Term Life Product is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects ADnD Rider for Preferred Term Life Product|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Rider_Benefit_Amount_for_Self_as_for_ADnD_Rider_under_PrefTerm(String Benefit2)
			throws Exception {

		try {
			log.debug("Selects Rider Benefit Amount for Self ADnD Rider under PrefTerm");
			if (!SelfBenefitAmount15Yr.isDisplayed()) {

				PrefTermLifeInsuranceLabel.click();
				Thread.sleep(2000);

			}
			reuseMethod.select_Benefit_Amount_slider(upArrow_Self_PrefTerm_ADnDRider, Benefit2,
					BenefitAmount_PrefTerm_Self_ADnDRider, downArrow_Self_PrefTerm_ADnDRider);

			log.info(" Rider Benefit Amount for Self ADnD Rider under PrefTerm is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Rider Benefit Amount for Self ADnD Rider under PrefTerm|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean validates_under_ADnD_Rider_PrefTerm_Benefit_Slider_Range_as_to_for_Self(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validates under ADnD Rider PerfTerm Benefit Slider Range as for Self");
			String MinAmt = MinAmount_PrefTermSelf_ADnDRider.getText();
			System.out.println("Actual Min Amount Self:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for self for ADnD Rider PerfTerm is validated");
			}
			String MaxAmt = MaxAmount_PrefTermSelf_ADnDRider.getText();
			System.out.println("Actual Max Amount self:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for self for ADnD Rider PerfTerm is validated");
			}
			log.info("Benefit Slider Ranges for self for ADnD Rider PerfTerm are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for ADnD Rider PerfTerm for self|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean selects_AD_D_Rider_for_Self_under_FifteenYTL() throws Exception {

		try {
			log.debug("Selects ADnD  Rider for Fifteen Year Product");
			reuseMethod.scrollDown(SelfBenefitAmount15Yr);
			Thread.sleep(500);
			ADnD_Rider_FifteenYTL.isDisplayed();
			ADnD_Rider_FifteenYTL.click();
			Thread.sleep(1000);

			log.info("ADnD Rider for Fifteen Year Product is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects ADnD Rider for Fifteen Year Product|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Self_as_under_FiftyYTL(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Self of Fifty Years Products");
			if (abeSelfBenefitAmount50Yr.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_FiftyYrProduct, sBenefit,
						abeSelfBenefitAmount50Yr, downArrow_Self_FiftyYrProduct);
			} else {
				FiftyYrLifeTermInsuranceLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_FiftyYrProduct, sBenefit,
						abeSelfBenefitAmount50Yr, downArrow_Self_FiftyYrProduct);
			}
			log.info("Amount selected for Self of Fifty Years Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for self of Fifty Year Product|| Fail" + e.getMessage());

			throw (e);
		}

	}
	
//	public boolean selects_Benefit_Amount_for_Self_as_under_LifeTo95(String sBenefit) throws Exception {
//
//		try {
//			log.debug("Select Benefit Amount for Self of LifeTo95 Products");
//			FiftyYrLifeTermInsuranceLabel.click();
//			Thread.sleep(2000);
//			reuseMethod.select_Benefit_Amount_slider(upArrow_Self_FiftyYrProduct, sBenefit,
//			abeSelfBenefitAmount50Yr, downArrow_Self_FiftyYrProduct);
//			log.info("Amount selected for Self of LifeTo95 Product sucessfully || Pass");
//			return true;
//		} catch (Exception e) {
//			log.error("Not able to select the benefit Amount for self of LifeTo95 Product|| Fail" + e.getMessage());
//
//			throw (e);
//		}
//
//	}
	
	public boolean selects_Benefit_Amount_for_Self_as_under_AccidentalDeath(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Self of AccidentalDeath Products");
			
			if (CatfBenefitAmountAccidentalDeath.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_AccidentalDeath, sBenefit,
						CatfBenefitAmountAccidentalDeath, downArrow_Self_AccidentalDeath);
			} else {
				AccidentDeathCover.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_AccidentalDeath, sBenefit,
				CatfBenefitAmountAccidentalDeath, downArrow_Self_AccidentalDeath);
			}
			
			
			log.info("Amount selected for Self of AccidentalDeath Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for self of AccidentalDeath Product|| Fail" + e.getMessage());

			throw (e);
		}

	}
	
	
	

	public boolean validates_under_FiftyYTL_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for Fifty Years Products");
			String MinAmt = MinAmount_FiftyYrSelf.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for Fifty Year Product is validated");
			}
			String MaxAmt = MaxAmount_FiftyYrSelf.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for Fifty Year Product is validated");
			}
			log.info("Benefit Slider Ranges for Fifty Years Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for Fifty Years Products|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_Accidental_Death_Benefit_Slider_Range_as_to(String Min, String Max) throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for Fifty Years Products");
			
//			if(!abeSelfBenefitAmountAccidentalProduct.isDisplayed())
//			{ 
//				AccidentalDeathLabel.click();
//				Thread.sleep(1500);
//			}
			String MinAmt = MinAmount_AccidentalDeath.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for Fifty Year Product is validated");
			}
			String MaxAmt = MaxAmount_AccidentalDeath.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for Fifty Year Product is validated");
			}
			log.info("Benefit Slider Ranges for Fifty Years Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for Fifty Years Products|| Fail" + e.getMessage());

			throw (e);
		}
	}

	
	public boolean selects_Benefit_Amount_for_Spouse_as_under_FiftyYTL(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Spouse of Fifty Years Products");
			if (abeSpouseBenefitAmount50Yr.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_FiftyYrProduct, sBenefit,
						abeSpouseBenefitAmount50Yr, downArrow_Spouse_FiftyYrProduct);
			} else {
				FiftyYrLifeTermInsuranceLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_FiftyYrProduct, sBenefit,
						abeSpouseBenefitAmount50Yr, downArrow_Spouse_FiftyYrProduct);
			}
			log.info("Amount selected for Spouse of Fifty Years Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Spouse of Fifty Year Product|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_FiftyYTL_for_Spouse_the_Benefit_Slider_Range_as_to(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges of Spouse for Fifty Years Products");
			String MinAmt = MinAmount_FiftyYrSpouse.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for Fifty Year Product of Spouse is validated");
			}
			String MaxAmt = MaxAmount_FiftyYrSpouse.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for Fifty Year Product of Spouse is validated");
			}
			log.info("Benefit Slider Ranges for Fifty Years Products of Spouse  are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for Fifty Years of Spouse Products|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Self_as_under_ADDI(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Self of Accidental Death Products");
			if (abeSelfBenefitAmountAccidentalProduct.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_AccidentalProduct, sBenefit,
						abeSelfBenefitAmountAccidentalProduct, downArrow_Self_AccidentalProduct);
			} else {
				AccidentalDeathLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_AccidentalProduct, sBenefit,
						abeSelfBenefitAmountAccidentalProduct, downArrow_Self_AccidentalProduct);
			}
			log.info("Amount selected for Self of Accidental Death Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for self of Accidental Death Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}
	// TIE

	public boolean selects_Benefit_Amount_for_Self_as_under_ADnD(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Self of Accidental Death Products");
			if (BenefitAmount_ADDI_Self.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_ADnD_Self, sBenefit, BenefitAmount_ADDI_Self,
						downArrow_ADnD_Self);
			} else {
				AccidentalDeathLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_ADnD_Self, sBenefit, BenefitAmount_ADDI_Self,
						downArrow_ADnD_Self);
			}
			log.info("Amount selected for Self of Accidental Death Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for self of Accidental Death Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_AccidentalDeath_the_Benefit_Slider_Range_as_to(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for Accidental Death Products");
			String MinAmt = MinAmount_ACCDeathSelf.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range forAccidental Death Product is validated");
			}
			String MaxAmt = MaxAmount_ACCDeathSelf.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for Accidental Death Product is validated");
			}
			log.info("Benefit Slider Ranges for Accidental Death Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Validate Benefit Slider Ranges for Accidental Death Products|| Fail" + e.getMessage());

			throw (e);
		}

	}

	// TIE

	public boolean validates_under_ADnD_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for Accidental Death Products");
			String MinAmt = MinAmount_ADnD_Self.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range forAccidental Death Product is validated");
			}
			String MaxAmt = MaxAmount_ADnD_Self.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for Accidental Death Product is validated");
			}
			log.info("Benefit Slider Ranges for Accidental Death Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Validate Benefit Slider Ranges for Accidental Death Products|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean click_on_Long_Term_Disability_Plus_Insurance_on_Request_Coverage_Page() throws Throwable {

		try {
			log.debug("Click on Long-Term Disability Plus Insurance on Request Coverage Page");
			reuseMethod.scrollDown(LongTermDisabilityPlusLabel);
			LongTermDisabilityPlusLabel.click();
			Thread.sleep(2000);

			log.info("Long-Term Disability Plus Insurance on Request Coverage Page is Clicked sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Click on Long-Term Disability Plus Insurance on Request Coverage Page|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean click_on_Long_Term_Disability_Insurance_on_Request_Coverage_Page() throws Throwable {

		try {
			log.debug("Click on Long-Term Disability Insurance on Request Coverage Page");
			reuseMethod.scrollDown(LongTermDisabilityLabel);
			LongTermDisabilityLabel.click();
			Thread.sleep(2000);
			log.info("Long-Term Disability Insurance on Request Coverage Page is Clicked sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Click on Long-Term Disability Insurance on Request Coverage Page|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean click_on_Mid_Term_Disability_Insurance_on_Request_Coverage_Page() throws Throwable {

		try {
			log.debug("Click on Mid-Term Disability Insurance on Request Coverage Page");
			reuseMethod.scrollDown(MidTermDisabilityLabel);
			MidTermDisabilityLabel.click();
			Thread.sleep(2000);
			log.info("Mid-Term Disability Plus Insurance on Request Coverage Page is Clicked sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Click on Mid-Term Disability Plus Insurance on Request Coverage Page|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean click_on_Group_Ten_Year_Level_Term_Life_Insurance_on_Request_Coverage_Page() throws Throwable {

		try {
			log.debug("Click on Group Ten-Year Level Term Life Insurance on Request Coverage Page");
			reuseMethod.scrollDown(TenYrLifeTermInsuranceLabel);
			TenYrLifeTermInsuranceLabel.click();
			Thread.sleep(2000);

			log.info(
					"Group Ten-Year Level Term Life Insurance on Request Coverage Page is Clicked sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Click on Group Ten-Year Level Term Life Insurance on Request Coverage Page|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean click_on_Group_Twenty_Year_Level_Term_Life_Insurance_on_Request_Coverage_Page() throws Throwable {

		try {
			log.debug("Click on Twenty-Year Level Term Life Insurance on Request Coverage Page");
			reuseMethod.scrollDown(TwentyYrLifeTermInsuranceLabel);
			TwentyYrLifeTermInsuranceLabel.click();
			Thread.sleep(2000);

			log.info("Twenty-Year Level Term Life Insurance on Request Coverage Page is Clicked sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Click on Twenty-Year Level Term Life Insurance on Request Coverage Page|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Self_as_under_LTDPlus(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Self of Long term Disability Plus Products");
			if (abeSelfBenefitAmountLTDPProduct.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_LTDPProduct, sBenefit,
						abeSelfBenefitAmountLTDPProduct, downArrow_Self_LTDPProduct);
			} else {
				LongTermDisabilityPlusLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_LTDPProduct, sBenefit,
						abeSelfBenefitAmountLTDPProduct, downArrow_Self_LTDPProduct);
			}
			log.info("Amount selected for Self of Long term Disability Plus Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for self of  Long term Disability Plus Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Wait_Period_for_Self_as_under_LTDPlus(String period) throws Exception {

		try {
			log.debug("Select Waiting Period for Long term Disability Plus Products");
			reuseMethod.scrollDown(WaitingPeriod_LTDP);
			reuseMethod.dropDownselectbyvalue(WaitingPeriod_LTDP, period);
			Thread.sleep(1000);

			log.info("Waiting Period is  selected for Self of Long term Disability Plus Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the Waiting Period for self of Long term Disability Plus Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Wait_Period_for_Self_as_under_GLTDI(String period) throws Exception {

		try {
			log.debug("Select Waiting Period for Group Long term Disability  Products");
			reuseMethod.scrollDown(WaitingPeriod_GLTD);
			reuseMethod.dropDown_select_byPartialText(WaitingPeriod_GLTD, period);
			Thread.sleep(1000);

			log.info("Waiting Period is  selected for Self of Group Long term Disability  Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the Waiting Period for Group self of Long term Disability  Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_duration_for_Self_as_under_GLTDI(String duration) throws Exception {

		try {
			log.debug("Select Benefit Duration for Group Long term Disability  Products");
			reuseMethod.scrollDown(BenefitDuration_GLTD);
			reuseMethod.dropDown_select_byPartialText(BenefitDuration_GLTD, duration);
			Thread.sleep(1000);

			log.info(
					"Benefit Duration is  selected for Self of Group Long term Disability  Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the Benefit Duration for Group self of Long term Disability  Product|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Wait_Period_for_Spouse_as_under_LTDPlus(String period) throws Exception {

		try {
			log.debug("Select Waiting Period for Long term Disability Plus Products Spouse");
			reuseMethod.dropDownselectbyvalue(WaitingPeriodSpouse_LTDP, period);

			log.info("Waiting Period is  selected for Spouse of Long term Disability Plus Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the Waiting Period for Spouse of Long term Disability Plus Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_LTDPlus_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for Long term Disability Plus Products");
			String MinAmt = MinAmount_LTDPSelf.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for Long term Disability Plus is validated");
			}
			String MaxAmt = MaxAmount_LTDPSelf.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range forLong term Disability Plus  Product is validated");
			}
			log.info("Benefit Slider Ranges for Long term Disability Plus Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for Long term Disability Plus Products|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Catastrophic_Disability_Benefit_Rider_for_LDTP() throws Exception {

		try {
			log.debug("Selects Catastrophic Disability Benefit Rider for Long term Disability Plus Product");
			reuseMethod.scrollDown(abeSelfBenefitAmountLTDPProduct);
			Thread.sleep(1000);
			Rider_Catastrophic.isDisplayed();
			Rider_Catastrophic.click();
			Thread.sleep(500);

			log.info(
					"Catastrophic Disability Benefit Rider for Long term Disability Plus Product is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Selects Catastrophic Disability Benefit Rider for Long term Disability Plus Product|| Fail"
							+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Cost_of_Living_Adjustment_Rider_under_LTDP_Product() throws Exception {

		try {
			log.debug("Selects Cost of Living Adjustment  Rider for Long term Disability Plus Product");
			reuseMethod.scrollDown(abeSelfBenefitAmountLTDPProduct);
			Thread.sleep(1000);
			Rider_COLA_LTDP.isDisplayed();
			Rider_COLA_LTDP.click();
			Thread.sleep(500);

			log.info(
					"Cost of Living Adjustment Rider for Long term Disability Plus Product is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Cost of Living Adjustment Rider for Long term Disability Plus Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Law_School_Loan_Payment_Benefit_Rider_under_LTDP() throws Exception {

		try {
			log.debug("Selects Law School Loan Payment Benefit Rider under LTDP");
			reuseMethod.scrollDown(abeSelfBenefitAmountLTDPProduct);
			Thread.sleep(1000);
			Law_School_LTDP.isDisplayed();
			Law_School_LTDP.click();
			Thread.sleep(500);

			log.info("Law School Loan Payment Benefit Rider under LTDP Product is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Law School Loan Payment Benefit Rider under LTDP Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Catastrophic_Disability_Benefit_Rider_for_Spouse_under_LTDPlus() throws Exception {

		try {
			log.debug("Selects Catastrophic Disability Benefit Rider for Spouse Long term Disability Plus Product");
			Rider_Catastrophic_Spouse.isDisplayed();
			Rider_Catastrophic_Spouse.click();

			log.info(
					"Catastrophic Disability Benefit Rider for Spouse Long term Disability Plus Product is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Selects Catastrophic Disability Benefit Rider for Spouse Long term Disability Plus Product|| Fail"
							+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Cost_of_Living_Adjustment_Rider_for_LTDP_Product_for_Spouse() throws Exception {

		try {
			log.debug("Selects Cost of Living Adjustment Rider for Spouse Long term Disability Plus Product");
			Rider_COLA_LTDP_Spouse.isDisplayed();
			Rider_COLA_LTDP_Spouse.click();

			log.info(
					"Cost of Living Adjustment Rider for Spouse Long term Disability Plus Product is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Selects Cost of Living Adjustment Rider for Spouse Long term Disability Plus Product|| Fail"
							+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Self_as_under_LTD(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Self of Long term Disability  Products");
			if (abeSelfBenefitAmountLTDProduct.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_LTDProduct, sBenefit,
						abeSelfBenefitAmountLTDProduct, downArrow_Self_LTDProduct);
			} else {
				LongTermDisabilityLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_LTDProduct, sBenefit,
						abeSelfBenefitAmountLTDProduct, downArrow_Self_LTDProduct);
			}
			log.info("Amount selected for Self of Long term Disability Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for self of  Long term Disability Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Self_as_under_GLTDI(String Benefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Self of Group Long term Disability  Products");
			if (SelfBenefitAmountGLTDProduct.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_GLTDProduct, Benefit,
						SelfBenefitAmountGLTDProduct, downArrow_Self_GLTDProduct);
			} else {
				LongTermDisabilityLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_GLTDProduct, Benefit,
						SelfBenefitAmountGLTDProduct, downArrow_Self_GLTDProduct);
			}
			log.info("Amount selected for Self of Group Long term Disability Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for self of Group Long term Disability Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Spouse_as_under_LTD(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Spouse of Long term Disability  Products");
			if (abeSpouseBenefitAmountLTDProduct.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_LTDProduct, sBenefit,
						abeSpouseBenefitAmountLTDProduct, downArrow_Spouse_LTDProduct);
			} else {
				LongTermDisabilityLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_LTDProduct, sBenefit,
						abeSpouseBenefitAmountLTDProduct, downArrow_Spouse_LTDProduct);
			}
			log.info("Amount selected for Spouse of Long term Disability Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Spouse of  Long term Disability Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Wait_Period_for_Self_as_under_LTD(String period) throws Exception {

		try {
			log.debug("Select Waiting Period for Long term Disability Products");
			reuseMethod.dropDownselectbyvalue(WaitingPeriod_LTD, period);

			log.info("Waiting Period is  selected for Self of Long term Disability Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the Waiting Period for self of Long term Disability  Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Wait_Period_for_Spouse_as_under_LTD(String period) throws Exception {

		try {
			log.debug("Select Waiting Period for Spouse Long term Disability Products");
			reuseMethod.dropDownselectbyvalue(WaitingPeriodSpouse_LTD, period);

			log.info("Waiting Period is  selected for Spouse of Long term Disability Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the Waiting Period for Spouse of Long term Disability  Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_LTD_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for Long term Disability Products");
			String MinAmt = MinAmount_LTDSelf.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for Long term Disability is validated");
			}
			String MaxAmt = MaxAmount_LTDSelf.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range forLong term Disability Product is validated");
			}
			log.info("Benefit Slider Ranges for Long term Disability Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for Long term DisabilityProducts|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_GLTDI_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for Group Long term Disability Products");
			String MinAmt = MinAmount_GLTDSelf.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for Group Long term Disability is validated");
			}
			String MaxAmt = MaxAmount_GLTDSelf.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for Group term Disability Product is validated");
			}
			log.info("Benefit Slider Ranges for Group Long term Disability Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for Group Long term DisabilityProducts|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Cost_of_Living_Adjustment_Rider_under_LTD_product() throws Exception {

		try {
			log.debug("Selects Cost of Living Adjustment  Rider for Long term Disability Product");
			reuseMethod.scrollDown(abeSelfBenefitAmountLTDProduct);
			Thread.sleep(1000);
			if (!Rider_COLA_Self_LTD.isDisplayed()) {
				LongTermDisabilityLabel.click();
				Thread.sleep(1000);
			}
			Rider_COLA_Self_LTD.isDisplayed();
			Rider_COLA_Self_LTD.click();
			Thread.sleep(500);

			log.info(
					"Cost of Living Adjustment Rider for Long term Disability Product is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Cost of Living Adjustment Rider for Long term Disability Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Law_School_Loan_Payment_Benefit_Rider_under_LTD() throws Exception {

		try {
			log.debug("Selects Law School Loan Payment Benefit Rider under LTD");
			reuseMethod.scrollDown(abeSelfBenefitAmountLTDProduct);
			Thread.sleep(1000);
			Law_School_LTD.isDisplayed();
			Law_School_LTD.click();
			Thread.sleep(500);

			log.info("Law School Loan Payment Benefit Rider under LTD is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Law School Loan Payment Benefit Rider under LTD Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Cost_of_Living_Adjustment_Rider_for_Spouse_under_LTD() throws Exception {

		try {
			log.debug("Selects Cost of Living Adjustment Rider for Spouse Long term Disability Product");
			Rider_COLA_LTD_Spouse.isDisplayed();
			Rider_COLA_LTD_Spouse.click();

			log.info(
					"Cost of Living Adjustment Rider for Spouse Long term Disability Product is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Selects Cost of Living Adjustment Rider for Spouse Long term Disability Product|| Fail"
							+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Self_as_under_MTDI(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Self of Mid term Disability  Products");
			if (!abeSelfBenefitAmountMIDProduct.isDisplayed()) {

				MidTermDisabilityLabel.click();
				Thread.sleep(2000);
			}
			reuseMethod.select_Benefit_Amount_slider(upArrow_Self_MIDProduct, sBenefit, abeSelfBenefitAmountMIDProduct,
					downArrow_Self_MIDProduct);

			log.info("Amount selected for Self of Mid term Disability Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for self of Mid term Disability Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Self_as_under_STD(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Self of Short term Disability Products");
			if (!SelfBenefitAmount_STDProduct.isDisplayed()) {
				MidTermDisabilityLabel.click();
				Thread.sleep(1000);

			}
			reuseMethod.select_Benefit_Amount_slider(upArrow_Self_STDProduct, sBenefit, SelfBenefitAmount_STDProduct,
					downArrow_Self_STDProduct);

			log.info("Amount selected for Self of Short term Disability Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for self of Short term Disability Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Wait_Period_for_Self_as_under_STD(String period) throws Exception {

		try {
			log.debug("Select Waiting Period for Short term Disability Products");
			reuseMethod.dropDown_select_byPartialText(WaitingPrd_Self_STD, period);

			log.info("Waiting Period is  selected for Self of Short term Disability Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the Waiting Period for self of Short term Disability  Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Wait_Period_for_Self_as_under_MTDI(String period) throws Exception {

		try {
			log.debug("Select Waiting Period for Mid term Disability Products");
			reuseMethod.dropDown_select_byPartialText(WaitingPeriod_MID, period);

			log.info("Waiting Period is  selected for Self of Mid term Disability Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the Waiting Period for self of Mid term Disability  Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_duration_for_Self_as_under_GSTDI(String duration) throws Exception {

		try {
			log.debug("Select Benefit duration for Short term Disability Products");
			reuseMethod.dropDown_select_byPartialText(BenefitDur_Self_STD, duration);

			log.info("Benefit duration is selected for Self of Short term Disability Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the Benefit duration for self of Short term Disability  Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Spouse_as_under_MTDI(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Spouse of Mid term Disability  Products");
			if (abeSpouseBenefitAmountMIDProduct.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_MIDProduct, sBenefit,
						abeSpouseBenefitAmountMIDProduct, downArrow_Spouse_MIDProduct);
			} else {
				MidTermDisabilityLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_MIDProduct, sBenefit,
						abeSpouseBenefitAmountMIDProduct, downArrow_Spouse_MIDProduct);
			}
			log.info("Amount selected for Spouse of Mid term Disability Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Spouse of Mid term Disability Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Wait_Period_for_Spouse_as_under_MTDI(String period) throws Exception {

		try {
			log.debug("Select Waiting Period for Mid term Disability Products Spouse");
			reuseMethod.dropDownselectbyvalue(WaitingPeriod_MID_Spouse, period);

			log.info("Waiting Period is  selected for Spouse of Mid term Disability Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the Waiting Period for Spouse of Mid term Disability  Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_Benefit_Duration_for_Self_as_under_STD(String duration) throws Exception {

		try {
			log.debug("Validate Benefit Duration for Short term Disability Products");
			List<WebElement> durationLi = reuseMethod.dropDowngetOption(BenefitDur_Self_STD);
			duration = duration.replaceAll("$", "").replaceAll(",", "");
			for (WebElement e : durationLi) {

				String durationamnt = e.getText();
				durationamnt = durationamnt.replaceAll("$", "").replaceAll(",", "");
				if (!durationamnt.equalsIgnoreCase("Select")) {
					if (durationamnt.equals(duration)) {
						System.out.println("Benefit Amount for STD matched");
					} else {
						System.out.println("Benefit Amount for STD does not match");
					}
				}
			}
			log.info("Validated Benefit Duration for Self of Short term Disability Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Benefit Duration for Self of Short term Disability  Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_MTDI_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for Mid term Disability Products");
			String MinAmt = MinAmount_MIDSelf.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for Long term Disability is validated");
			}
			String MaxAmt = MaxAmount_MIDSelf.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for Mid term Disability Product is validated");
			}
			log.info("Benefit Slider Ranges for Mid term Disability Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for Mid term Disability Products|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Self_as_under_CI(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Self of Critical Illness Products");
			if (abeSelfBenefitAmountCIProduct.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_CIProduct, sBenefit,
						abeSelfBenefitAmountCIProduct, downArrow_Self_CIProduct);
			} else {
				CriticalIllnessLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_CIProduct, sBenefit,
						abeSelfBenefitAmountCIProduct, downArrow_Self_CIProduct);
			}
			log.info("Amount selected for Self Critical Illness  Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for self of Critical Illness Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Spouse_as_under_CI(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Spouse of Critical Illness Products");
			if (abeSpouseBenefitAmountCIProduct.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_CIProduct, sBenefit,
						abeSpouseBenefitAmountCIProduct, downArrow_Spouse_CIProduct);
			} else {
				CriticalIllnessLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_CIProduct, sBenefit,
						abeSpouseBenefitAmountCIProduct, downArrow_Spouse_CIProduct);
			}
			log.info("Amount selected for Spouse Critical Illness  Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Spouse of Critical Illness Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_CI_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges forCritical Illness Products");
			String MinAmt = MinAmount_CISelf.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range forCritical Illness is validated");
			}
			String MaxAmt = MaxAmount_CISelf.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for Critical Illness Product is validated");
			}
			log.info("Benefit Slider Ranges forCritical Illness Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider RangesCritical Illness Products|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Self_as_under_RDI(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Self of Retirement Disability  Products");
			if (abeSelfBenefitAmountRetireProduct.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_RetireProduct, sBenefit,
						abeSelfBenefitAmountRetireProduct, downArrow_Self_RetireProduct);
			} else {
				RetirementDisabilityLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_RetireProduct, sBenefit,
						abeSelfBenefitAmountRetireProduct, downArrow_Self_RetireProduct);
			}
			log.info("Amount selected for Self of Retirement  Disability Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for self of Retirement Disability Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Wait_Period_for_Self_as_under_RDI(String period) throws Exception {

		try {
			log.debug("Select Waiting Period for Retirement Disability Products");
			reuseMethod.dropDownselectbyvalue(WaitingPeriod_Retire, period);

			log.info("Waiting Period is  selected for Self of Retirement Disability Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the Waiting Period for self of Retirement term Disability  Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Wait_Period_for_Self_as_under_PO_POEDI_BOE(String WaitPeriod1) throws Exception {

		try {
			log.debug("Select Waiting Period for Practice Overhead/Business Overhead Products");
			reuseMethod.dropDown_select_byPartialText(PracticeOverhead_WaitingPeriod_Self, WaitPeriod1);

			log.info(
					"Waiting Period is  selected for Self of Practice Overhead/Business Overhead Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select the Waiting Period for self of Practice Overhead/Business Overhead Product|| Fail"
							+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_RDI_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for Retirement Disability Products");
			String MinAmt = MinAmount_RetireSelf.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for Retirement Disability is validated");
			}
			String MaxAmt = MaxAmount_RetireSelf.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for Retirement Disability Product is validated");
			}
			log.info("Benefit Slider Ranges for Retirement Disability Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for Retirement Disability Products|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Self_as_under_POEDI_BOE_OO(String Benefit) throws Exception {

		try {
			log.debug(
					"Select Benefit Amount for Self of Professional/Office Overhead/Business Overhead Disability Products");
			if (!SelfBenefitAmountProfProduct.isDisplayed()) {
				ProfessionalExpenseDisabilityLabel.click();
				Thread.sleep(2000);
			}

			reuseMethod.select_Benefit_Amount_slider(upArrow_Self_ProfProduct, Benefit, SelfBenefitAmountProfProduct,
					downArrow_Self_ProfProduct);

			log.info(
					"Amount selected for Self Professional/Office Overhead/Business Overhead Disability Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select the benefit Amount for self of  Professional/Office Overhead/Business Overhead Disability Product|| Fail"
							+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_POEDI_OR_BOE_the_Benefit_Slider_Range_as_to(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for  Professional Disability/Business Overhead Products");
			String MinAmt = MinAmount_ProfSelf.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for Professional Disability/Business Overhead is validated");
			}
			String MaxAmt = MaxAmount_ProfSelf.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for Professional Disability/Business Overhead Product is validated");
			}
			log.info(
					"Benefit Slider Ranges for Professional Disability/Business Overhead Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Validate Benefit Slider Ranges Professional Disability/Business Overhead Products|| Fail"
							+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Self_as_under_HMI(String benefit) throws Exception {

		try {
			log.debug("Select Maximum Benefit amount for self Hospital Money Insurance Products");
			int index = benefit.indexOf("$");
			String benefitAmnt = benefit.substring(index + 1);
			benefitAmnt = benefitAmnt.replaceAll(",", "");
			if (BenefitAmount_Self_HMI.isDisplayed()) {
				reuseMethod.dropDownselectbyvalue(BenefitAmount_Self_HMI, benefitAmnt);
			} else {
				HospitalMoneyInsuranceLabel.click();
				Thread.sleep(2000);
				reuseMethod.dropDownselectbyvalue(BenefitAmount_Self_HMI, benefitAmnt);
			}

			log.info(
					" Maximum Benefit amount for self Hospital Money Insurance Products is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select Maximum Benefit amount for Hospital Money Insurance Products for self|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Surgical_Option_Rider() throws Exception {

		try {
			log.debug("Select Surgical Rider for Hospital money Insurance");
			reuseMethod.scrollDown(BenefitAmount_Self_HMI);
			Thread.sleep(1000);
			Surgical_Rider.click();
			Thread.sleep(500);
			log.info("Select Surgical Rider for Hospital money Insurance is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Surgical Rider for Hospital money Insurance|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Surgical_Amount_as(String amount) throws Exception {

		try {
			log.debug("Select Surgical amount for Hospital money Insurance");
			reuseMethod.dropDownselectbyvalue(Surgical_Amount, amount);

			log.info("Select Surgical Amount for Hospital money Insurance is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select Surgical Amount for Hospital money Insurance|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Spouse_as_under_HMI(String benefit) throws Exception {

		try {
			log.debug("Select Maximum Benefit amount for Spouse Hospital Money Insurance Products");
			if (BenefitAmount_Spouse_HMI.isDisplayed()) {
				reuseMethod.dropDownselectbyvalue(BenefitAmount_Spouse_HMI, benefit);
			} else {
				HospitalMoneyInsuranceLabel.click();
				Thread.sleep(2000);
				reuseMethod.dropDownselectbyvalue(BenefitAmount_Spouse_HMI, benefit);
			}

			log.info(
					" Maximum Benefit amount for Spouse Hospital Money Insurance Products is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Select Maximum Benefit amount for Hospital Money Insurance Products for Spouse|| Fail"
							+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_amount_for_Five_Year_Product_Spouse_as(String sBenefit) throws Exception {

		try {

			log.debug("Select Benefit Amount for Spouse of Five Years Products");

			if (abeSpouseBenefitAmount5Yr.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_FiveYrProduct, sBenefit,
						abeSpouseBenefitAmount5Yr, downArrow_Spouse_FiveYrProduct);
			} else {
				FiveYrLifeTermInsuranceLabel.click();
				Thread.sleep(1000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_FiveYrProduct, sBenefit,
						abeSpouseBenefitAmount5Yr, downArrow_Spouse_FiveYrProduct);
			}
			Thread.sleep(1000);
			log.info("Amount selected for Spouse of Five Years Product sucessfully || Pass");
			return true;

		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Spouse of Five Year Product|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_under_FiveYTL_for_Spouse_the_Benefit_Slider_Range_as_to(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for Five Years Spouse Products");
			String MinAmt = MinAmount_FiveYrSpouse.getText();
			System.out.println("Actual Min Amount Spouse:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for Five Year Spouse Product is validated");
			}
			String MaxAmt = MaxAmount_FiveYrSpouse.getText();
			System.out.println("Actual Max Amount Spouse:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for Five Year Spouse Product is validated");
			}
			log.info("Benefit Slider Ranges for Five Years  Spouse Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for Five Years Spouse Products|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	// AAFP*****************TermLife**************************

	public boolean validates_under_TermLife_or_ARTL_the_Benefit_Slider_Range_for_Self_as_to(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for TermLife/ARTL/GTLI Products");
			if (!MinAmount_TermLifeSelf.isDisplayed()) {
				TermLifeInsuranceLabel.click();
				Thread.sleep(1000);
			}

			String MinAmt = MinAmount_TermLifeSelf.getText();
			System.out.println("Actual Min Amount Self:" + MinAmt);
			if(MinAmt.contains("$")){
				MinAmt=MinAmt.substring(1);
			}
			MinAmt.replaceAll(",","");
			MinAmt.trim();
			if(Min.contains("$")){
				Min=Min.substring(1);
			}
			Min.replaceAll(",","");
			Min.trim();
			
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for TermLife/ARTL/GTLI Product is validated");
			}
			
			
			String MaxAmt = MaxAmount_TermLifeSelf.getText();
			System.out.println("Actual Max Amount Self:" + MaxAmt);
			if(MaxAmt.contains("$")){
				MaxAmt=MaxAmt.substring(1);
			}	
			MaxAmt.replaceAll(",","");
			MaxAmt.trim();
			
			if(Max.contains("$")){
				Max=Max.substring(1);
			}
			Max.replaceAll(",","");
			Max.trim();
			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for TermLife/ARTL/GTLI Product is validated");
			}

			log.info("Benefit Slider Ranges for TermLife/ARTL/GTLI Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for TermLife/ARTL Products|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_under_GTLI_the_Inforce_Benefit_Slider_Range_for_Self_as_to(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Inforce Benefit Slider Ranges for TermLife/ARTL Products");
			if (!MinAmountInforce_GTLISelf.isDisplayed()) {
				TermLifeInsuranceLabel.click();
				Thread.sleep(1000);
			}

			String MinAmt = MinAmountInforce_GTLISelf.getText();
			System.out.println("Actual Min Amount Spouse:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for GTLI Product is validated");
			}
			String MaxAmt = MaxAmountInforce_GTLISelf.getText();
			System.out.println("Actual Max Amount Self:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for GTLI Product is validated");
			}

			log.info(" Inforce Benefit Slider Ranges for GTLI Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Inforce Benefit Slider Ranges for GTLI Products|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_under_TermLife_or_ARTL_the_ADnD_Rider_Benefit_Slider_Range_for_Self_as_to(String Min_Rider,
			String Max_Rider) throws Exception {
/////// Note: ARTL is same as TermLife product
		try {
			log.debug("Validate AD&D Rider Benefit Slider Ranges for TermLife Products");
			String MinAmt = MinAmount_TermLifeSelf_ADnDRider.getText();
			System.out.println("Actual Min Amount Spouse:" + MinAmt);
			
			
			if (MinAmt.equalsIgnoreCase(Min_Rider)) {
				System.out.println("Minimum Range for TermLife AD&D Rider Product is validated");
			}
			String MaxAmt = MaxAmount_TermLifeSelf_ADnDRider.getText();
			System.out.println("Actual Max Amount Spouse:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max_Rider)) {
				System.out.println("Maximum Range for TermLife AD&D Rider Product is validated");
			}
			log.info("AD&D Rider Benefit Slider Ranges for TermLife Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate AD&D Rider Benefit Slider Ranges for TermLife Self Products|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Optional_AD_D_Rider_under_TermLife_or_ARTL() throws Exception {

		try {
			log.debug("Select AD & D Rider for Self under TermLife/ARTL products");
			TermLifeProduct_ADDRider_ChkBox_Self.click();

			log.info("AD & D Rider is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select AD & D Rider || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Optional_AD_D_Rider_under_TermLife_or_ARTL_for_Spouse() throws Exception {

		try {
			log.debug("Select AD & D Rider for Spouse under TermLife/ARTL products ");
			TermLifeProduct_ADDRider_ChkBox_Spouse.click();

			log.info("Selected AD & D Rider for Spouse under TermLife/ARTL products sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select AD & D Rider for Spouse under TermLife/ARTL products || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Rider_Benefit_Amount_under_TermLife_or_ARTL_for_Self_as(String DRiderBenefit)
			throws Exception {

		try {

			log.debug("Select Benefit Amount for Self of TermLife/ARTL Products");
			if (!TermLifeProduct_BenefitAmt_ADDRider_Self.isDisplayed()) {
				TermLifeInsuranceLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.select_Benefit_Amount_slider(TermLifeProduct_upArrow_ADDRider_Self, DRiderBenefit,
					TermLifeProduct_BenefitAmt_ADDRider_Self, TermLifeProduct_downArrow_ADDRider_Self);
			log.info("Amount selected for Self of TermLife/ARTL Product sucessfully || Pass");
			return true;

		} catch (Exception e) {
			log.error(
					"Not able to select the benefit Amount for Self of TermLife/ARTL Product|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Waiver_of_Premium_Rider_under_TermLife_for_Self() throws Exception {

		try {
			log.debug("Validate AD & D Rider is selected");
			TermLifeProduct_WOPRider_ChkBox_Self.click();

			log.info("AD & D Rider is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select AD & D Rider || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_under_TermLife_or_ARTL_the_Benefit_Slider_Range_for_Spouse_as_to(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for TermLife/ARTL Products");
			if (!MinAmount_TermLifeSpouse.isDisplayed()) {
				TermLifeInsuranceLabel.click();
				Thread.sleep(1000);
			}
			String MinAmt = MinAmount_TermLifeSpouse.getText();
			System.out.println("Actual Min Amount Spouse:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for TermLife/ARTL Product is validated");
			}
			String MaxAmt = MaxAmount_TermLifeSpouse.getText();
			System.out.println("Actual Max Amount Spouse:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for TermLife/ARTL Product for spouse is validated");
			}
			log.info("Benefit Slider Ranges for TermLife/ARTL Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {

			log.error(
					"Not able to Validate Benefit Slider Ranges for TermLife Spouse Products|| Fail" + e.getMessage());

			log.error("Not able to Validate Benefit Slider Ranges for TermLife/ARTL Spouse Products|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_DII_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for DII Products");
			String MinAmt = MinAmount_DIISelf.getText();
			System.out.println("Actual Min DII Amount Self:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for DII Product is validated");
			}
			String MaxAmt = MaxAmount_DIISelf.getText();
			System.out.println("Actual Max DII Amount Self:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for DII Product is validated");
			}
			log.info("Benefit Slider Ranges for DII Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for DII Products|| Fail" + e.getMessage());
			throw (e);
		}

	}

	// NSPE
	public boolean validates_under_DisabilityIncomeInsurance_the_Benefit_Slider_Range_as_to(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for DisabilityIncomeInsurance Products");
			String MinAmt = DII_MinAmount_Self.getText();
			System.out.println("Actual Min DisabilityIncomeInsurance Amount Self:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for DisabilityIncomeInsurance Product is validated");
			}
			String MaxAmt = DII_MaxAmount_Self.getText();
			System.out.println("Actual Max DisabilityIncomeInsurance Amount Self:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for DisabilityIncomeInsurance Product is validated");
			}
			log.info("Benefit Slider Ranges for DisabilityIncomeInsurance Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for DisabilityIncomeInsurance Products|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	// **********************************************MOBILE***************************************************//

	public boolean your_Coverage_page_is_displayed() throws Exception {
		try {
			log.debug("Your Coverage page is displayed (Mobile Site)");
			if (YourCoverage.isDisplayed()) {
				log.info("Your Coverage page is displayed (Mobile Site)|| Pass");
			}
			return true;
		}

		catch (Exception e) {
			log.error("Your Coverage page is displayed (Mobile Site)|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_the_amount_of_Traditional_Term_coverage_for_self_as_Mobile(String Benefit) throws Exception {
		try {
			log.debug("Traditional benefit Selected for Self (Mobile Site)");

			if (traditionalAmountSelf_Mobile.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(traditionalPlusSelf_Mobile, Benefit,
						traditionalAmountSelf_Mobile, traditionalMinusSelf_Mobile);

			}

			else {

				Thread.sleep(500);

				traditionalArrowSelf_Mobile.click();

				Thread.sleep(500);

				reuseMethod.select_Benefit_Amount_slider(traditionalPlusSelf_Mobile, Benefit,
						traditionalAmountSelf_Mobile, traditionalMinusSelf_Mobile);

			}
			reuseMethod.scrollDown(traditionalArrowSelf_Mobile);
			log.info("Traditional benefit Selected for Self (Mobile Site)|| Pass");
			return true;
		}

		catch (Exception e) {
			log.error("Traditional benefit Selected for Self (Mobile Site)|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_the_amount_of_Ten_Year_coverage_for_self_as_Mobile(String Benefit1) throws Exception {
		try {
			log.debug("Ten year Selected for Self (Mobile Site)");

			if (tenYrAmountSelf_Mobile.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(tenYearPlusSelf_Mobile, Benefit1, tenYrAmountSelf_Mobile,
						tenYearMinusSelf_Mobile);
			}

			else {

				Thread.sleep(500);
				tenYearArrowSelf_Mobile.click();

				Thread.sleep(500);

				reuseMethod.select_Benefit_Amount_slider(tenYearPlusSelf_Mobile, Benefit1, tenYrAmountSelf_Mobile,
						tenYearMinusSelf_Mobile);
				reuseMethod.scrollDown(tenYearArrowSelf_Mobile);
			}

			log.info("Ten year Selected for Self (Mobile Site) || Pass");
			return true;
		} catch (Exception e) {
			log.error("Ten year Selected for Self (Mobile Site)|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_the_amount_of_Twenty_Year_coverage_for_self_as_Mobile(String Benefit2) throws Exception {
		try {
			log.debug("Twenty Year Selected for Self (Mobile Site)");

			if (twentyYrAmountSelf_Mobile.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(twentyYearPlusSelf_Mobile, Benefit2, twentyYrAmountSelf_Mobile,
						twentyYearMinusSelf_Mobile);
			} else {

				Thread.sleep(500);
				twentyYearArrowSelf_Mobile.click();

				Thread.sleep(500);

				reuseMethod.select_Benefit_Amount_slider(twentyYearPlusSelf_Mobile, Benefit2, twentyYrAmountSelf_Mobile,
						twentyYearMinusSelf_Mobile);
				reuseMethod.scrollDown(twentyYearArrowSelf_Mobile);
			}

			log.info("Twenty Year Selected for Self (Mobile Site) || Pass");
		} catch (Exception e) {
			log.error("Twenty Year Selected for Self (Mobile Site) Fail" + e.getMessage());
			throw (e);
		}
		return true;
	}

	public boolean select_the_amount_of_Long_Term_coverage_for_self_as_Mobile(String Benefit3, String GDIwait,
			String GDIduration) throws Exception {
		try {

			log.debug("Long Term Selected for Self (Mobile Site)");

			if (longTermAmountSelf_Mobile.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(longTermPlusSelf_Mobile, Benefit3, longTermAmountSelf_Mobile,
						longTermMinusSelf_Mobile);
			} else {

				Thread.sleep(500);
				longTermArrowSelf_Mobile.click();

				Thread.sleep(500);

				reuseMethod.select_Benefit_Amount_slider(longTermPlusSelf_Mobile, Benefit3, longTermAmountSelf_Mobile,
						longTermMinusSelf_Mobile);
				reuseMethod.scrollDown(longTermArrowSelf_Mobile);
			}

			reuseMethod.dropDownselectbyvalue(longWaitingPeriodSelf_Mobile, GDIwait);

			reuseMethod.dropDownselectbyvalue(longBenefitDurationSelf_Mobile, GDIduration);

			log.info("Long Term Selected for Self (Mobile Site) || Pass");
		} catch (Exception e) {
			log.error("Long Term Selected for Self (Mobile Site) Fail" + e.getMessage());
			throw (e);
		}
		return true;
	}

	public boolean select_the_amount_of_Group_Disability_Insurance_coverage_as(String Benefit, String GDIwait)
			throws Throwable {

		try {

			log.debug("Group Disability Selected for Self (Mobile Site)");

			if (!longTermAmountSelf_Mobile.isDisplayed()) {
				Thread.sleep(500);

				longTermArrowSelf_Mobile.click();

				Thread.sleep(500);

			}
			if (longTermPlusSelf_Mobile.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(longTermPlusSelf_Mobile, Benefit, longTermAmountSelf_Mobile,
						longTermMinusSelf_Mobile);
				reuseMethod.scrollDown(longTermArrowSelf_Mobile);
			}

			reuseMethod.dropDownselectbyvalue(longWaitingPeriodSelf_Mobile, GDIwait);

			log.info("Group Disability Selected for Self (Mobile Site) || Pass");
		} catch (Exception e) {
			log.error("Group Disability Selected for Self (Mobile Site) Fail" + e.getMessage());
			throw (e);
		}
		return true;
	}

	public boolean select_the_amount_of_Short_Term_coverage_for_self_as_Mobile(String Benefit4, String SDIwait,
			String SDIduration1) throws Exception {
		try {
			log.debug("Short Term Selected for Self (Mobile Site)");

			if (shortTermAmountSelf_Mobile.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(shortTermPlusSelf_Mobile, Benefit4, shortTermAmountSelf_Mobile,
						shortTermMinusSelf_Mobile);
			} else {
				Thread.sleep(500);
				shortTermArrowSelf_Mobile.click();

				Thread.sleep(500);

				reuseMethod.select_Benefit_Amount_slider(shortTermPlusSelf_Mobile, Benefit4, shortTermAmountSelf_Mobile,
						shortTermMinusSelf_Mobile);
				reuseMethod.scrollDown(shortTermArrowSelf_Mobile);
			}
			reuseMethod.dropDownselectbyvalue(shortwaitingPeriodSelf_Mobile, SDIwait);
			reuseMethod.dropDownselectbyvalue(shortBenefitDurationSelf_Mobile, SDIduration1);
			log.info("Short Term Selected for Self (Mobile Site)|| Pass");
		}

		catch (Exception e) {
			log.error("Short Term Selected for Self (Mobile Site) Fail" + e.getMessage());
			throw (e);
		}

		return true;
	}

	public boolean select_the_amount_of_Business_Overhead_coverage_for_self_as_Mobile(String Benefit5, String BOEwait,
			String BOEduration) throws Exception {
		try {
			log.debug("Business benefit Selected for Self (Mobile Site)");

			if (!BusinessAmountSelf_Mobile.isDisplayed()) {
				Thread.sleep(500);

				businessArrowSelf_Mobile.click();

				Thread.sleep(500);

			}
			if (BusinessPlusSelf_Mobile.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(BusinessPlusSelf_Mobile, Benefit5, BusinessAmountSelf_Mobile,
						BusinessMinusSelf_Mobile);
				reuseMethod.scrollDown(businessArrowSelf_Mobile);
			}
			reuseMethod.dropDownselectbyvalue(businessWaitingPeriodSelf_Mobile, BOEwait);
			reuseMethod.dropDownselectbyvalue(businessBenefitDurationSelf_Mobile, BOEduration);
			log.info("Business benefit Selected for Self (Mobile Site)|| Pass");
		}

		catch (Exception e) {
			log.error("Business benefit Selected for Self (Mobile Site) Fail" + e.getMessage());
			throw (e);
		}

		return true;
	}

	public boolean select_the_amount_for_all_coverages_for_self_as_Mobile(String Benefit, String Benefit1,
			String Benefit2, String Benefit3, String Benefit4, String GDIwait, String GDIduration, String SDIwait,
			String SDIduration1, String BOEwait, String BOEduration) throws Exception {
		try {
			log.debug("Select Coverage page details for self in Mobile site");

			select_the_amount_of_Traditional_Term_coverage_for_self_as_Mobile(Benefit);
			select_the_amount_of_Ten_Year_coverage_for_self_as_Mobile(Benefit1);
			select_the_amount_of_Twenty_Year_coverage_for_self_as_Mobile(Benefit2);
			select_the_amount_of_Long_Term_coverage_for_self_as_Mobile(Benefit3, GDIwait, GDIduration);
			select_the_amount_of_Short_Term_coverage_for_self_as_Mobile(Benefit4, SDIwait, SDIduration1);
			select_the_amount_of_Business_Overhead_coverage_for_self_as_Mobile(Benefit4, BOEwait, BOEduration);

			log.info("Coverage Page is filled sucessfully for self in Mobile Site || Pass");

			return true;
		} catch (Exception e) {
			log.error("Coverage Page is filled for self in Mobile Site || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean Select_BOTH_rider_Checkbox_COLA_and_CDB_self_Mobile() throws Exception {
		try {
			log.debug("Select check box for BOTH riders for Self in Mobile site");
			Thread.sleep(1000);
			reuseMethod.scrollDown(longBenefitDurationSelf_Mobile);
			if (!checkboxCOLASelf_verify_Mobile.isSelected()) {
				checkboxCOLASelf_Mobile.click();
			}
			if (!checkboxCDBSelf_verify_Mobile.isSelected()) {
				checkboxCDBSelf_Mobile.click();
			}

			log.info("Selected check box for BOTH riders for self in Mobile Site || Pass");

			return true;
		} catch (Exception e) {
			log.error("Not able to select check box for BOTH riders for self in Mobile Site || Fail" + e.getMessage());
			throw (e);
		}

	}

	// ***********************SPOUSE*************************************************//

	public boolean Spouse_Coverage_page_is_displayed_Mobile() throws Exception {
		try {
			log.debug("Spouse Coverage page is displayed (Mobile Site)");
			if (SpouseCoverage_Mobile.isDisplayed()) {
				log.info("Spouse Coverage page is displayed (Mobile Site)|| Pass");
			}
		}

		catch (Exception e) {
			log.error("Spouse Coverage page is displayed (Mobile Site)|| Fail" + e.getMessage());
			throw (e);
		}
		return true;
	}

	public boolean select_the_amount_of_Traditional_Term_coverage_for_spouse_as_Mobile(String SBenefit)
			throws Exception {
		try {
			log.debug("Traditional benefit Coverage selected for Spouse (Mobile Site)");
			Spouse_Coverage_page_is_displayed_Mobile();

			if (traditionalAmountSpouse_Mobile.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(traditionalPlusSpouse_Mobile, SBenefit,
						traditionalAmountSpouse_Mobile, traditionalMinusSpouse_Mobile);
			} else {
				traditionalArrowSelf_Mobile.click();
				Thread.sleep(1000);

				reuseMethod.select_Benefit_Amount_slider(traditionalPlusSpouse_Mobile, SBenefit,
						traditionalAmountSpouse_Mobile, traditionalMinusSpouse_Mobile);
				reuseMethod.scrollDown(traditionalArrowSelf_Mobile);
			}
			log.info("Traditional benefit Selected for Spouse (Mobile Site)|| Pass");
		}

		catch (Exception e) {
			log.error("Traditional benefit Coverage selected for Spouse (Mobile Site)|| Fail" + e.getMessage());
			throw (e);
		}
		return true;
	}

	public boolean select_the_amount_of_Ten_Year_coverage_for_spouse_as_Mobile(String SBenefit1) throws Exception {
		try {
			log.debug("Ten year Coverage selected for Spouse (Mobile Site)");

			if (tenYrAmountSpouse_Mobile.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(tenYrPlusSpouse_Mobile, SBenefit1, tenYrAmountSpouse_Mobile,
						tenYrMinusSpouse_Mobile);
			} else {
				tenYearArrowSpouse_Mobile.click();
				Thread.sleep(2000);

				reuseMethod.select_Benefit_Amount_slider(tenYrPlusSpouse_Mobile, SBenefit1, tenYrAmountSpouse_Mobile,
						tenYrMinusSpouse_Mobile);
				reuseMethod.scrollDown(tenYearArrowSpouse_Mobile);
			}
			log.info("Ten year Selected for Spouse (Mobile Site) || Pass");
		} catch (Exception e) {
			log.error("Ten year Coverage selected for Self (Mobile Site)|| Fail" + e.getMessage());
			throw (e);
		}
		return true;
	}

	public boolean select_the_amount_of_Twenty_Year_coverage_for_spouse_as_Mobile(String SBenefit2) throws Exception {
		try {
			log.debug("Twenty Year Coverage selected for Spouse (Mobile Site)");

			if (twentyYrAmountSpouse_Mobile.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(twentyYrPlusSpouse_Mobile, SBenefit2,
						twentyYrAmountSpouse_Mobile, twentyYrMinusSpouse_Mobile);
			} else {
				twentyYearArrowSpouse_Mobile.click();
				Thread.sleep(1000);

				reuseMethod.select_Benefit_Amount_slider(twentyYrPlusSpouse_Mobile, SBenefit2,
						twentyYrAmountSpouse_Mobile, twentyYrMinusSpouse_Mobile);
				reuseMethod.scrollDown(twentyYearArrowSpouse_Mobile);
			}
			log.info("Twenty Year Selected for Spouse (Mobile Site) || Pass");
		} catch (Exception e) {
			log.error("Twenty Year Coverage selected for Spouse (Mobile Site) Fail" + e.getMessage());
			throw (e);
		}
		return true;
	}

	public boolean select_the_amount_of_Long_Term_coverage_for_spouse_as_Mobile(String SBenefit3, String SGDIwait,
			String SGDIduration) throws Exception {
		try {

			log.debug("Long Term Coverage selected for Spouse (Mobile Site)");

			if (longTermAmountSpouse_Mobile.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(longTermPlusSpouse_Mobile, SBenefit3,
						longTermAmountSpouse_Mobile, longTermMinusSpouse_Mobile);
			} else {
				longtermArrowSpouse_Mobile.click();
				Thread.sleep(2000);

				reuseMethod.select_Benefit_Amount_slider(longTermPlusSpouse_Mobile, SBenefit3,
						longTermAmountSpouse_Mobile, longTermMinusSpouse_Mobile);
				reuseMethod.scrollDown(longtermArrowSpouse_Mobile);

			}
			reuseMethod.dropDownselectbyvalue(longWaitingSpouse_Mobile, SGDIwait);
			reuseMethod.dropDownselectbyvalue(longBenefitSpouse_Mobile, SGDIduration);
			log.info("Long Term Coverage selected for Spouse (Mobile Site) || Pass");
		} catch (Exception e) {
			log.error("Long Term Coverage selected for Spouse (Mobile Site) Fail" + e.getMessage());
			throw (e);
		}
		return true;
	}

	public boolean select_the_amount_of_Short_Term_coverage_for_spouse_as_Mobile(String SBenefit4, String SSDIwait,
			String SSDIduration1) throws Exception {
		try {
			log.debug("Short Term Coverage Selected for Spouse (Mobile Site)");

			if (shortTermAmountSpouse_Mobile.isDisplayed()) {

				reuseMethod.select_Benefit_Amount_slider(shortTermPlusSpouse_Mobile, SBenefit4,
						shortTermAmountSpouse_Mobile, shortTermMinusSpouse_Mobile);
			} else {
				shorttermArrowSpouse_Mobile.click();
				Thread.sleep(1000);

				reuseMethod.select_Benefit_Amount_slider(shortTermPlusSpouse_Mobile, SBenefit4,
						shortTermAmountSpouse_Mobile, shortTermMinusSpouse_Mobile);
				reuseMethod.scrollDown(shorttermArrowSpouse_Mobile);
			}

			reuseMethod.dropDownselectbyvalue(shortWaitingSpouse_Mobile, SSDIwait);
			reuseMethod.dropDownselectbyvalue(shortBenefitSpouse_Mobile, SSDIduration1);
			Thread.sleep(500);
			log.info("Short Term Coverage Selected for Spouse (Mobile Site)|| Pass");
		}

		catch (Exception e) {
			log.error("Short Term Coverage Selected for Self (Mobile Site) Fail" + e.getMessage());
			throw (e);
		}

		return true;
	}

	public boolean select_the_amount_of_All_coverage_for_spouse_as_Mobile(String SBenefit, String SBenefit1,
			String SBenefit2, String SBenefit3, String SBenefit4, String SGDIwait, String SGDIduration, String SSDIwait,
			String SSDIduration1) throws Throwable {

		try {
			log.debug("Select Coverage page details for Spouse in Mobile site");

			select_the_amount_of_Traditional_Term_coverage_for_spouse_as_Mobile(SBenefit);
			select_the_amount_of_Ten_Year_coverage_for_spouse_as_Mobile(SBenefit1);
			select_the_amount_of_Twenty_Year_coverage_for_spouse_as_Mobile(SBenefit2);
			select_the_amount_of_Long_Term_coverage_for_spouse_as_Mobile(SBenefit3, SGDIwait, SGDIduration);
			select_the_amount_of_Long_Term_coverage_for_spouse_as_Mobile(SBenefit4, SSDIwait, SSDIduration1);
			log.info("Select Coverage page details for Spouse in Mobile site || PASS");
			return true;
		} catch (Exception e) {
			log.error("Coverage page details for Spouse in Mobile site || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean select_the_amount_of_child_coverage_as_TermLife_Mobile(String CBenefit) throws Exception {
		try {
			log.debug("Select Coverage page details for Child in Mobile site");

			reuseMethod.dropDownselectbyvalue(BenefitChild_Mobile, CBenefit);
			Thread.sleep(500);
			log.info("Child Coverage selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Coverage page details for Child in Mobile site || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean child_coverage_page_is_dispalyed_Mobile() throws Exception {
		try {
			log.debug("Child coverage page is dispalyed in Mobile site");
			ChildCoverage_Page_Mobile.isDisplayed();
			reuseMethod.scrollDown(BenefitQuesChild_Mobile);
			Thread.sleep(500);
			log.info("Child coverage page is dispalyed in Mobile site || Pass");
			return true;
		} catch (Exception e) {
			log.error("Child coverage page is not dispalyed in Mobile site|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_min_and_max_values_for_Long_Term_for_self_as_Mobile(String LTMin, String LTMax)
			throws Throwable {

		try {
			log.debug("Validate coverage range for Long Term for self");
			String amount = longTermAmountSelf_Mobile.getText();

			if (!longTermAmountSelf_Mobile.isDisplayed()) {
				longTermArrowSelf_Mobile.click();
				Thread.sleep(1000);
			}
			reuseMethod.scrollDown(longTermArrowSelf_Mobile);
			if (amount.equals(LTMin)) {
				System.out.println("Minimum is validated for Long Term");
			}
			reuseMethod.select_Benefit_Amount_slider(longTermPlusSelf_Mobile, LTMax, longTermAmountSelf_Mobile,
					longTermMinusSelf_Mobile);
			amount = longTermAmountSelf_Mobile.getText();

			if (amount.equals(LTMax)) {
				System.out.println("Maximum is validated for Long Term");
			}
			log.info("Validate coverage range for Long Term for self sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate coverage range for Long Term for self || Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean validate_min_and_max_values_for_Short_Term_for_self_Mobile(String STMin, String STMax)
			throws Throwable {

		try {
			log.debug("Validate coverage range for Short Term for self");

			if (!shortTermAmountSelf_Mobile.isDisplayed()) {
				shortTermArrowSelf_Mobile.click();
				Thread.sleep(1000);

				reuseMethod.scrollDown(shortTermArrowSelf_Mobile);
				if (shortTermAmountSelf_Mobile.getText().equals(STMin)) {
					System.out.println("Minimum is validated for Short Term");
				}
				reuseMethod.select_Benefit_Amount_slider(shortTermPlusSelf_Mobile, STMax, shortTermAmountSelf_Mobile,
						shortTermMinusSelf_Mobile);
			}
			if (shortTermAmountSelf_Mobile.getText().equals(STMax)) {
				System.out.println("Maximum is validated for Short Term");
			}
			log.info("Validate coverage range for Short Term for self sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate coverage range for Short Term for self || Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean validate_min_and_max_values_for_Traditional_insurance_for_self_Mobile(String Min1, String Max1)
			throws Throwable {

		try {
			log.debug("Validate coverage range for Traditional Insurance for self");

			if (!traditionalAmountSelf_Mobile.isDisplayed()) {
				traditionalArrowSelf_Mobile.click();
				Thread.sleep(1000);

				reuseMethod.scrollDown(traditionalArrowSelf_Mobile);
				if (traditionalAmountSelf_Mobile.getText().equals(Min1)) {
					System.out.println("Minimum is validated for Traditional Insurance");
				}
				reuseMethod.select_Benefit_Amount_slider(traditionalPlusSelf_Mobile, Max1, traditionalAmountSelf_Mobile,
						traditionalMinusSelf_Mobile);
			}
			if (traditionalAmountSelf_Mobile.getText().equals(Max1)) {
				System.out.println("Maximum is validated for Traditional Insurance");
			}
			log.info("Validate coverage range for Traditional Insurance for self sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate coverage range for Traditional Insurance for self || Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean validate_min_and_max_values_for_TenYR_for_self_Mobile(String TYMin, String TYMax) throws Throwable {

		try {
			log.debug("Validate coverage range for Ten Year for self");

			if (!tenYrAmountSelf_Mobile.isDisplayed()) {
				tenYearArrowSelf_Mobile.click();
				Thread.sleep(1000);

				reuseMethod.scrollDown(tenYearArrowSelf_Mobile);
				if (tenYrAmountSelf_Mobile.getText().equals(TYMin)) {
					System.out.println("Minimum is validated for Ten Year");
				}
				reuseMethod.select_Benefit_Amount_slider(tenYearPlusSelf_Mobile, TYMax, tenYrAmountSelf_Mobile,
						tenYearMinusSelf_Mobile);
			}
			if (tenYrAmountSelf_Mobile.getText().equals(TYMax)) {
				System.out.println("Maximum is validated for Ten Year");
			}
			log.info("Validate coverage range for Ten Year for self sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate coverage range for Ten Year for self || Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean validate_min_and_max_values_for_TwentyYTL_for_self_Mobile(String TYMin, String TYMax)
			throws Throwable {

		try {
			log.debug("Validate coverage range for Twenty Year for self");

			if (!twentyYrAmountSelf_Mobile.isDisplayed()) {
				twentyYearArrowSelf_Mobile.click();
				Thread.sleep(1000);

				reuseMethod.scrollDown(twentyYearArrowSelf_Mobile);
				if (twentyYrAmountSelf_Mobile.getText().equals(TYMin)) {
					System.out.println("Minimum is validated for Short Term");
				}
				reuseMethod.select_Benefit_Amount_slider(twentyYearPlusSelf_Mobile, TYMax, twentyYrAmountSelf_Mobile,
						twentyYearMinusSelf_Mobile);
			}
			if (twentyYrAmountSelf_Mobile.getText().equals(TYMax)) {
				System.out.println("Maximum is validated for Twenty year");
			}
			log.info("Validate coverage range for Twenty year for self sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate coverage range for Twenty year for self || Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean validate_min_and_max_values_for_Short_Term_for_spouse_to_Mobile(String STMin1, String STMax1)
			throws Throwable {

		try {
			log.debug("Validate coverage range for Short Term for Spouse");
			String amount = shortTermAmountSpouse_Mobile.getText();

			if (!shortTermAmountSpouse_Mobile.isDisplayed()) {
				shorttermArrowSpouse_Mobile.click();
				Thread.sleep(1000);
			}
			reuseMethod.scrollDown(shorttermArrowSpouse_Mobile);
			if (amount.equals(STMin1)) {
				System.out.println("Minimum is validated for Short Term");
			}
			reuseMethod.select_Benefit_Amount_slider(shortTermPlusSpouse_Mobile, STMax1, shortTermAmountSpouse_Mobile,
					shortTermMinusSpouse_Mobile);
			amount = shortTermAmountSpouse_Mobile.getText();

			if (amount.equals(STMax1)) {
				System.out.println("Maximum is validated for Short Term");
			}
			log.info("Validate coverage range for Short Term for Spouse sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate coverage range for Short Term for Spouse || Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean validate_min_and_max_values_for_Long_Term_for_spouse_to_Mobile(String LTMin1, String LTMax1)
			throws Throwable {

		try {
			log.debug("Validate coverage range for Long Term for Spouse");
			String amount = longTermAmountSpouse_Mobile.getText();

			if (!longTermAmountSpouse_Mobile.isDisplayed()) {

				longtermArrowSpouse_Mobile.click();
				Thread.sleep(1000);

			}
			reuseMethod.scrollDown(longtermArrowSpouse_Mobile);
			if (amount.equals(LTMin1)) {
				System.out.println("Minimum is validated for Long Term");
			}
			reuseMethod.select_Benefit_Amount_slider(longTermPlusSpouse_Mobile, LTMax1, longTermAmountSpouse_Mobile,
					longTermMinusSpouse_Mobile);
			amount = longTermAmountSpouse_Mobile.getText();

			if (amount.equals(LTMax1)) {
				System.out.println("Maximum is validated for Long Term");
			}
			log.info("Validate coverage range for Long Term for Spouse sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate coverage range for Long Term for Spouse || Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean validate_min_and_max_values_for_Traditional_Insurance_for_spouse_Mobile(String TMin1, String TMax1)
			throws Throwable {

		try {
			log.debug("Validate coverage range for Traditional Insurance for Spouse");
			String amount = traditionalAmountSpouse_Mobile.getText();

			if (!traditionalAmountSpouse_Mobile.isDisplayed()) {

				traditionalArrowSpouse_Mobile.click();
				Thread.sleep(1000);

			}
			reuseMethod.scrollDown(traditionalArrowSpouse_Mobile);

			if (amount.equals(TMin1)) {
				System.out.println("Minimum is validated for Traditional Insurance in mobile application");
			}
			reuseMethod.select_Benefit_Amount_slider(traditionalPlusSpouse_Mobile, TMax1,
					traditionalAmountSpouse_Mobile, traditionalMinusSpouse_Mobile);
			amount = traditionalAmountSpouse_Mobile.getText();

			if (amount.equals(TMax1)) {
				System.out.println("Maximum is validated for Traditional Insurance Spouse");
			}
			log.info(
					"Validate coverage range for Traditional Insurance  for Spouse sucessfully in mobile application || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate coverage range for Traditional Insurance for Spouse in mobile application || Fail"
							+ e.getMessage());

			throw (e);
		}
	}

	public boolean validate_min_and_max_values_for_Ten_Year_Insurance_for_spouse_Mobile(String STYMin, String STYMax)
			throws Throwable {

		try {
			log.debug("Validate coverage range for Ten year Insurance for Spouse");
			String amount = tenYrAmountSpouse_Mobile.getText();

			if (!tenYrAmountSpouse_Mobile.isDisplayed()) {

				tenYearArrowSpouse_Mobile.click();
				Thread.sleep(1000);

			}
			reuseMethod.scrollDown(tenYearArrowSpouse_Mobile);

			if (amount.equals(STYMin)) {
				System.out.println("Minimum is validated for Ten year Insurance in mobile application");
			}
			reuseMethod.select_Benefit_Amount_slider(tenYrPlusSpouse_Mobile, STYMax, tenYrAmountSpouse_Mobile,
					tenYrMinusSpouse_Mobile);
			amount = tenYrAmountSpouse_Mobile.getText();

			if (amount.equals(STYMax)) {
				System.out.println("Maximum is validated for Ten year Insurance Spouse");
			}
			log.info(
					"Validate coverage range for Ten year Insurance  for Spouse sucessfully in mobile application || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate coverage range for Ten year Insurance for Spouse in mobile application || Fail"
							+ e.getMessage());

			throw (e);
		}
	}

	public boolean validate_min_and_max_values_for_Twenty_Year_Insurance_for_spouse_Mobile(String STYMin, String STYMax)
			throws Throwable {

		try {
			log.debug("Validate coverage range for Twenty year Insurance for Spouse");
			String amount = twentyYrAmountSpouse_Mobile.getText();

			if (!twentyYrAmountSpouse_Mobile.isDisplayed()) {

				twentyYearArrowSpouse_Mobile.click();
				Thread.sleep(1000);

			}
			reuseMethod.scrollDown(twentyYearArrowSpouse_Mobile);

			if (amount.equals(STYMin)) {
				System.out.println("Minimum is validated for Twenty year Insurance in mobile application");
			}
			reuseMethod.select_Benefit_Amount_slider(twentyYrPlusSpouse_Mobile, STYMax, twentyYrAmountSpouse_Mobile,
					twentyYrMinusSpouse_Mobile);
			amount = twentyYrAmountSpouse_Mobile.getText();

			if (amount.equals(STYMax)) {
				System.out.println("Maximum is validated for Twenty year Insurance Spouse");
			}
			log.info(
					"Validate coverage range for Twenty year Insurance  for Spouse sucessfully in mobile application || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate coverage range for Twenty year Insurance for Spouse in mobile application || Fail"
							+ e.getMessage());

			throw (e);
		}
	}
	// WAEPA_CoveragePage***************************

	public boolean request_Coverage_page_is_displayed_to_user_and_Select_NO_for_Rider_questions_for_Self()
			throws Exception {

		try {
			log.debug("Select Rider Question as NO");
			ChrinicIllnessRider_Self_No.click();
			// Optional_Rider_No.click();
			log.info("Rider Question as NO selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Notable to select the Rider Question || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}
	}

	public boolean verify_Coverage_Error_Message_in_Spouse_section_FiveYear() throws Exception {
		try {
			log.debug("Error Message is displayed on selecting incorrect spouse coverage amount");
			reuseMethod.scrollDown(upArrow_Spouse_FiveYrProduct);
			spouseCoverageError1.isDisplayed();
			log.info("Error Message is displayed on selecting incorrect spouse coverage amount sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Error Message is displayed on selecting incorrect spouse coverage amount || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean verify_Coverage_Error_Message_in_Spouse_section_TermLife() throws Exception {
		try {
			log.debug("Error Message is displayed on selecting incorrect spouse coverage amount");
			String spouseCoverageError = PropertyUtility.Load_MessageFile_Data("SpouseCoverageErrorMessage");
			if (!upArrow_Spouse_TermLifeProduct.isDisplayed()) {
				TermLifeInsuranceLabel.click();
				Thread.sleep(1000);
			}

			reuseMethod.scrollDown(upArrow_Spouse_TermLifeProduct);
			spouseCoverageErrorMsg.isDisplayed();
			String actualError = spouseCoverageErrorMsg.getText();
			Assert.assertEquals(actualError, spouseCoverageError, "Error message does not match");
			log.info("Error Message is displayed on selecting incorrect spouse coverage amount sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Error Message is displayed on selecting incorrect spouse coverage amount || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	// AAFP
	public boolean verify_Coverage_Error_Message_in_Spouse_section_for_TenYTL() throws Exception {
		try {
			log.debug("Error Message is displayed on selecting incorrect spouse coverage amount");
			String spouseCoverageError = PropertyUtility.Load_MessageFile_Data("SpouseCoverageErrorMessage");
			CoverageErrorMsg_TenYTL_Spouse.isDisplayed();
			String actualError = CoverageErrorMsg_TenYTL_Spouse.getText();
			Assert.assertEquals(actualError, spouseCoverageError, "Error message does not match");
			log.info("Error Message is displayed on selecting incorrect spouse coverage amount sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Error Message is displayed on selecting incorrect spouse coverage amount || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean verify_Spouse_Membership_mandatory_validation_message_on_Eligibility_page() throws Exception {
		try {
			log.debug("Error Message is displayed on eligibility page for Spouse Membership Validation");
			String spouseMemberShipError = PropertyUtility.Load_MessageFile_Data("SpouseMembershipValidation");
			Validation_SpouseMember_EligibilityPage_Spouse.isDisplayed();
			String actualError = Validation_SpouseMember_EligibilityPage_Spouse.getText();
			Assert.assertEquals(actualError, spouseMemberShipError, "Error message does not match");
			log.info("Error Message is displayed on eligibility page sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Error Message is not displayed for Spouse Membership Validation || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean Select_for_Rider_Only_question_for_self(String riderOnly) throws Exception {
		try {
			log.debug(" Select option for Rider only question for self");

			reuseMethod.selectSinglevalue(selfRiderOnlyNo, selfRiderOnlyYes, riderOnly);
			log.info(" Select option for Rider only question for self sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Select option for Rider only question for self || Fail" + e.getMessage());
			throw (e);
		}
	}

	public Boolean validate_Coverage_related_Error_message() throws Throwable {
		try {
			log.debug("Validate Error Messege on Coverage Page");
			String Expected = PropertyUtility.Load_MessageFile_Data("CoverageErrorMessege");
			CoverageErrorMsg.isDisplayed();
			String actual = CoverageErrorMsg.getText();
			System.err.println("Error Messege on Coverage Page===" + actual);
			Assert.assertEquals(actual, Expected, "Error messege on Coverage is Not Displayed");

			log.info("Error Messege on Coverage Page is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Error Messege on coverage Page || Fail" + e.getMessage());
			throw (e);
		}
	}

	public Boolean validate_Coverage_related_Error_message_ACS() throws Throwable {
		try {
			log.debug("Validate Error Messege on Coverage Page");
			String Expected = PropertyUtility.Load_MessageFile_Data("CoverageErrorMessege_ACS");
			CoverageErrorMsg.isDisplayed();
			String actual = CoverageErrorMsg.getText();
			System.err.println("Error Messege on Coverage Page===" + actual);
			Assert.assertEquals(actual, Expected, "Error messege on Coverage is Not Displayed");

			log.info("Error Messege on Coverage Page is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Error Messege on coverage Page || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean Request_coverage_page_is_displayed_to_user() throws Exception {
		try {
			log.debug("Request Coverage page is displayed to user");
			RequestCoveragePage.isDisplayed();
			log.info("Request Coverage page is displayed to user sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Request Coverage page is displayed to user || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean Validate_that_Guaranteed_Issue_Group_Term_Life_is_displayed() throws Exception {
		try {
			log.debug("Verifying whether Guaranteed Issue Group Term Life is displayed");

			boolean check = FiveYrLifeTermInsuranceLabel.isDisplayed();
			Assert.assertTrue(check, "Guaranteed Issue Group Term Life not visible || Bug");

			log.info("Guaranteed Issue Group Term Life is displayed || Pass");
			return true;
		} catch (Exception e) {
			log.error("Guaranteed Issue Group Term Life is not displayed to user || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean select_to_Rider_only_question_for_spouse(String sRiderOnly) throws Exception {
		try {
			log.debug("Select option for Rider only question for Spouse");

			try {
				/*
				 * log.debug("Select Rider Question as NO for Spouse");
				 * ChrinicIllnessRider_Spouse_No.click(); //Optional_Rider_No.click();
				 * log.info("Rider Question as NO selected sucessfully || Pass");
				 */

				reuseMethod.selectSinglevalue(spouseRiderOnlyNo, spouseRiderOnlyYes, sRiderOnly);
				log.info("Select option for Rider only question for Spouse sucessfully || Pass");
				return true;
			} catch (Exception e) {
				log.error("Notable to select the Rider Question || Fail" + e.getMessage());
				screenShotUtility.GetScreenShot(driver);
				throw (e);
			}

			// reuseMethod.selectSinglevalue(spouseRiderOnlyNo, spouseRiderOnlyYes,
			// sRiderOnly);
			// log.info("Select option for Rider only question for Spouse sucessfully ||
			// Pass");
			// return true;
		} catch (Exception e) {
			log.error("Select option for Rider only question for Spouse || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean Select_BOTH_rider_Checkbox_COLA_and_CDB_Spouse_Mobile() throws Exception {
		try {
			log.debug("Select check box for BOTH riders for Self in Mobile site");
			Thread.sleep(1000);
			reuseMethod.scrollDown(longBenefitSpouse_Mobile);
			if (!COLAcheckboxSpouse_verify_Mobile.isSelected()) {
				COLAcheckboxSpouse_Mobile.click();
			}
			if (!CDBcheckboxSpouse_verify_Mobile.isSelected()) {

				CDBcheckboxSpouse_Mobile.click();
			}
			Thread.sleep(500);
			log.info("Selected check box for BOTH riders for self in Mobile Site || Pass");

			return true;
		} catch (Exception e) {
			log.error("Not able to select check box for BOTH riders for self in Mobile Site || Fail" + e.getMessage());
			throw (e);
		}

	}

	// WAEPA method for Optional rider
	public boolean select_to_Optional_Rider_question_for_Self(String OptionalRider) throws Exception {
		try {
			log.debug("Request Coverage page is displayed to user And Select optional Rider question for self");
			Thread.sleep(2000);
			reuseMethod.scrollDown(OptionalRider_Self_No);
			reuseMethod.selectSinglevalue(OptionalRider_Self_No, OptionalRider_Self_Yes, OptionalRider);
			log.info(
					"Request Coverage page is displayed to user And Select optional Rider question for self sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Request Coverage page is displayed to user And Select optional Rider question for self || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean select_to_Optional_Rider_question_for_Spouse(String sOptionalRider) throws Exception {
		try {
			log.debug("Request Coverage page is displayed to user And Select optional Rider question for Spouse");

			reuseMethod.selectSinglevalue(OptionalRider_Spouse_No, OptionalRider_Spouse_Yes, sOptionalRider);
			log.info(
					"Request Coverage page is displayed to user And Select optional Rider question for Spouse sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Request Coverage page is displayed to user And Select optional Rider question for Spouse || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean verify_that_the_Optional_rider_is_disabled_for_Spouse() throws Exception {

		try {
			log.debug("Selects Optional rider is disabled for Spouse");
			boolean Actual_Rider_Yes = OptionalRider_Spouse_Yes.isEnabled();
			boolean Actual_Rider_No = OptionalRider_Spouse_No.isEnabled();
			Assert.assertFalse(Actual_Rider_Yes, "Optional rider YES is Enabled for Spouse || Bug");
			Assert.assertFalse(Actual_Rider_No, "Optional rider NO is Enabled for Spouse || Bug");

			log.info("Optional rider is disabled for Spouse is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects optional rider is disabled for Spouse || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean verify_that_the_optional_rider_is_enabled_for_Spouse() throws Exception {

		try {
			log.debug("Selects Optional rider is enabled for Spouse");
			boolean Actual_Rider_Yes = OptionalRider_Spouse_Yes.isEnabled();
			boolean Actual_Rider_No = OptionalRider_Spouse_No.isEnabled();
			Assert.assertTrue(Actual_Rider_Yes, "Optional rider YES is Disabled for Spouse || Bug");
			Assert.assertTrue(Actual_Rider_No, "Optional rider NO is Disabled for Spouse || Bug");

			log.info("Optional rider is enabled for Spouse is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Optional rider is enabled for Spouse || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_YES_to_Rider_only_question_for_Self() throws Exception {

		try {
			log.debug("Select Rider Question as Yes for self");
			ChrinicIllnessRider_Self_Yes.click();
			// Optional_Rider_No.click();
			log.info("Rider Question as Yes selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Notable to select the Rider Question || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}
	}

	public boolean Select_NO_for_optional_Rider_questions() throws Exception {

		try {
			log.debug("Select Optional Rider Question as NO");
			OptionalRider_Self_No.click();
			log.info("Optional Rider Question as NO selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Notable to select the Optional Rider Question || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}
	}

	public boolean verify_that_Quick_Decision_is_Unavailable_under_TermLife_for_Self() throws Exception {

		log.debug("Validate that Quick Decision is Unavailable for Term Life Self");
		try {
			if (QuickDecisionOption_Self.getText().equalsIgnoreCase("UNAVAILABLE")) {
				reuseMethod.scrollDown(QuickDecisionOption_Self);
				System.out.println("Quick Decision is::" + QuickDecisionOption_Self.getText());
				log.info("Quick Decision is Unavailable for Term Life Self");
				System.out.println("Quick Decision is Unavailable for Term Life Self");
				return true;
			}
		} catch (NoSuchElementException e) {
			log.error("Quick Decision is Available for Term Life Self");
			System.out.println("Quick Decision is Available for Term Life Self");
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}
		return false;

	}

	public boolean Verify_that_Quick_Decision_is_Available_under_TermLife_for_Self() throws Exception {

		log.debug("Validate that Quick Decision is Available for Term Life Self");
		try {
			if (QuickDecisionOption_Self.getText().equalsIgnoreCase("AVAILABLE")) {
				reuseMethod.scrollDown(QuickDecisionOption_Self);
				System.out.println("Quick Decision is::" + QuickDecisionOption_Self.getText());
				log.info("Quick Decision is Available for Term Life Self");
				System.out.println("Quick Decision is Available for Term Life Self");
				return true;
			}
		} catch (Exception e) {
			log.error("Quick Decision is not  Available for Term Life Self");
			System.out.println("Quick Decision is not Available for Term Life Self");
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}
		return false;

	}

	public boolean verify_that_Quick_Decision_is_Unavailable_under_TermLife_for_Spouse() throws Exception {

		log.debug("Validate that Quick Decision is Unavailable for Term Life Spouse");
		try {
			if (QuickDecisionOption_Spouse.getText().equalsIgnoreCase("UNAVAILABLE")) {
				reuseMethod.scrollDown(QuickDecisionOption_Spouse);
				System.out.println("Quick Decision is::" + QuickDecisionOption_Spouse.getText());
				log.info("Quick Decision is Unavailable for Term Life Spouse");
				System.out.println("Quick Decision is Unavailable for Term Life Spouse");
				return true;
			}
		} catch (Exception e) {
			log.error("Quick Decision is Available for Term Life Spouse");
			System.out.println("Quick Decision is Available for Term Life Spouse");
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}
		return false;
	}

	public boolean verify_that_Quick_Decision_is_Available_under_TermLife_for_Spouse() throws Exception {

		log.debug("Validate that Quick Decision is available for Term Life Spouse");
		try {
			if (QuickDecisionOption_Spouse.getText().equalsIgnoreCase("AVAILABLE")) {
				reuseMethod.scrollDown(QuickDecisionOption_Spouse);
				System.out.println("Quick Decision is::" + QuickDecisionOption_Spouse.getText());
				log.info("Quick Decision is available for Term Life Spouse");
				System.out.println("Quick Decision is available for Term Life Spouse");
				return true;
			}
		} catch (Exception e) {
			log.error("Quick Decision is UnAvailable for Term Life Spouse");
			System.out.println("Quick Decision is Unvailable for Term Life Spouse");
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}
		return false;
	}

	public boolean verify_that_Quick_Decision_is_Unavailable_for_FiveYTL_Self() throws Exception {

		log.debug("Validate that Quick Decision is Unavailable for FiveYTL Self");
		try {
			if (QuickDecisionFiveYear_Self.getText().equalsIgnoreCase("UNAVAILABLE")) {
				reuseMethod.scrollDown(QuickDecisionFiveYear_Self);
				System.out.println("Quick Decision is::" + QuickDecisionFiveYear_Self.getText());
				log.info("Quick Decision is Unavailable for FiveYTL Self");
				System.out.println("Quick Decision is Unavailable for FiveYTL Self");

			}
			return true;
		} catch (NoSuchElementException e) {
			log.error("Quick Decision is Available for FiveYTL Self");
			System.out.println("Quick Decision is unavailable for FiveYTL Self");
			return false;
		}

	}

	public boolean verify_that_Quick_Decision_is_Available_for_FiveYTL_Self() throws Exception {

		log.debug("Validate that Quick Decision is Available for FiveYTL Self");
		try {
			reuseMethod.scrollDown(QuickDecisionFiveYear_Self);
			if (QuickDecisionFiveYear_Self.getText().equalsIgnoreCase("AVAILABLE")) {

				System.out.println("Quick Decision is::" + QuickDecisionFiveYear_Self.getText());
				log.info("Quick Decision is Available for FiveYTL Self");
				System.out.println("Quick Decision is Available for FiveYTL Self");
				return true;
			}
		} catch (Exception e) {
			log.error("Quick Decision is not  Available for FiveYTL Self");
			System.out.println("Quick Decision is not Available for FiveYTL Self");
			throw (e);
		}
		return false;

	}

	public boolean selects_Benefit_Amount_for_Self_as_under_TermLife_or_ARTL(String Benefit) throws Exception {

		try {

			log.debug("Select Benefit Amount for Self of Term Life Insurance Products");
			if (!SelfBenefitAmountTermLife.isDisplayed())
			{
				TermLifeInsuranceLabel.click();
			}

			reuseMethod.select_Benefit_Amount_slider(upArrow_Self_TermLifeProduct, Benefit, SelfBenefitAmountTermLife,downArrow_Self_TermLifeProduct);
			log.info("Amount selected for Self of Term Life/ARTL Insurance Product sucessfully || Pass");
			return true;
		} catch (Exception e) {

			log.error("Not able to select the benefit Amount for Self of Term Life/ARTL Insurance Product || Fail"+ e.getMessage());

			throw (e);
		}

	}
	
	public boolean selects_Inforce_Benefit_Amount_for_Self_as_under_GTLI(String Benefit) throws Exception {

		try {

			log.debug("Select Inforce Benefit Amount for Self of GTLI Products");
			if (!SelfInforceBenefitAmountGTLI.isDisplayed())
			{
				TermLifeInsuranceLabel.click();
			}

			reuseMethod.select_Benefit_Amount_slider(upArrow_Self_GTLIProduct, Benefit, SelfInforceBenefitAmountGTLI,downArrow_Self_GTLIProduct);
			log.info("Inforce Benefit Amount selected for Self of GTLI Product sucessfully || Pass");
			return true;
		} catch (Exception e) {

			log.error("Not able to select the Inforce Benefit Amount for Self of GTLI Product || Fail"+ e.getMessage());

			throw (e);
		}

	}

	public boolean checks_Chronic_Illness_Rider_for_Self_checkbox_under_TermLife() throws Exception {

		try {
			log.debug("Selects Chronic Illness Rider for Term Life Insurance for Self");
			ChronicRider_TermLifeSelf.isDisplayed();
			ChronicRider_TermLifeSelf.click();

			log.info("Chronic Illness Rider for Term Life Insurance for Self is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Chronic Illness Rider for Term Life Insurance for Self|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean selects_CIR_portion_for_Self_as_under_TermLife(String Benefit) throws Exception {

		try {

			log.debug("Select Benefit Amount for Self of Term Life Insurance Products");
			if (abeSelfBenefitAmountTermLifeRider.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_TermLifeProductRider, Benefit,
						abeSelfBenefitAmountTermLifeRider, downArrow_Self_TermLifeProductRider);
			} else {
				TermLifeInsuranceLabel.click();
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_TermLifeProductRider, Benefit,
						abeSelfBenefitAmountTermLifeRider, downArrow_Self_TermLifeProductRider);
			}

			log.info("Amount selected for Self of Term Life Insurance Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Self of Term Life Insurance Product || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Spouse_as_under_TermLife_or_ARTL(String Benefit) throws Exception {

		try {

			log.debug("Select Benefit Amount for Spouse of Term Life/ARTL Insurance Products");
			if (SpouseBenefitAmountTermLife.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_TermLifeProduct, Benefit,
						SpouseBenefitAmountTermLife, downArrow_Spouse_TermLifeProduct);
			} else {
				TermLifeInsuranceLabel.click();
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_TermLifeProduct, Benefit,
						SpouseBenefitAmountTermLife, downArrow_Spouse_TermLifeProduct);
			}

			log.info("Amount selected for Spouse of Term Life/ARTL Insurance Product sucessfully || Pass");
			return true;
		} catch (Exception e) {

			log.error("Not able to select the benefit Amount for Spouse of Term Life Insurance Product || Fail"
					+ e.getMessage());

			log.error("Not able to select the benefit Amount for Spouse of Term Life/ARTL Insurance Product || Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean checks_CIR_checkbox_for_Spouse() throws Exception {

		try {
			log.debug("Selects Chronic Illness Rider for Term Life Insurance for Spouse");
			ChronicRider_TermLifeSpouse.isDisplayed();
			ChronicRider_TermLifeSpouse.click();

			log.info("Chronic Illness Rider forTerm Life Insurance for Spouse is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Chronic Illness Rider for Term Life Insurance for Spouse|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean selects_CIR_portion_for_Spouse_as_under_TermLife(String Benefit) throws Exception {

		try {

			log.debug("Select Benefit Amount for Spouse of Term Life Insurance Products");
			if (abeSpouseBenefitAmountTermLifeRider.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_TermLifeProductRider, Benefit,
						abeSpouseBenefitAmountTermLifeRider, downArrow_Spouse_TermLifeProductRider);
			} else {
				TermLifeInsuranceLabel.click();
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_TermLifeProductRider, Benefit,
						abeSpouseBenefitAmountTermLifeRider, downArrow_Spouse_TermLifeProductRider);
			}

			log.info("Amount selected for Spouse of Term Life Insurance Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Spouse of Term Life Insurance Product || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Child_as_under_TermLife_or_ARTL(String CBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Child of Term Life Insurance or ARTL Products");
			reuseMethod.scrollDown(BenefitAmountChildTermLife_ARTLProduct);
			reuseMethod.dropDownselectbyvalue(BenefitAmountChildTermLife_ARTLProduct, CBenefit);
			log.info("Amount selected for Child of Term Life Insurance or ARTL Product sucessfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Child of Term Life Insurance or ARTL Product || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Waiting_Period_for_Self_as_under_DII(String Period) throws Exception {

		try {
			log.debug("Select Waiting Period for Disability Income Insurance Products");
			if (!WaitingPeriodDII_Self.isDisplayed()) {
				DisabilityIncomeInsuranceLabel.click();
			}
			reuseMethod.scrollDown(WaitingPeriodDII_Self);
			Thread.sleep(1000);
			reuseMethod.dropDown_select_byPartialText(WaitingPeriodDII_Self, Period);
			log.info(
					"Waiting Period for Disability Income Insurance Products for Self is selected sucessfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select Waiting Period for Disability Income Insurance Products || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean validate_that_the_Wait_Period_is_disabled_with_value_as(String Period) throws Exception {

		try {
			log.debug("Validate that the Wait Period is disabled");
			if (!WaitingPeriodDII_Self.isDisplayed()) {
				DisabilityIncomeInsuranceLabel.click();
			}
			reuseMethod.scrollDown(WaitingPeriodDII_Self);
			Thread.sleep(1000);
			boolean check = WaitingPeriodDII_Self.isEnabled();
			Assert.assertFalse(check, "Waiting Period is not disbled");
			System.out.println("Waiting period is disabled for:" + Period);
			log.info("Waiting Period for Disability Income Insurance Products is disabled || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate that the Wait Period is disabled|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Monthly_Benefit_Amount_for_Self_as_under_DII(String Benefit) throws Exception {

		try {

			log.debug("Select Benefit Amount for Self of DII Insurance Products");
			if (SelfBenefitAmountDII.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_DII, Benefit, SelfBenefitAmountDII,
						downArrow_Self_DII);
			} else {
				DisabilityIncomeInsuranceLabel.click();
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_DII, Benefit, SelfBenefitAmountDII,
						downArrow_Self_DII);
			}

			log.info("Amount selected for Self of DII Insurance Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select the benefit Amount for Self of DII Insurance Product || Fail" + e.getMessage());
			throw (e);
		}

	}

	// NSPE
	public boolean selects_Benefit_Amount_for_Self_as_under_DII(String Benefit) throws Exception {

		try {

			log.debug("Select Benefit Amount for Self of DII Insurance Products");
			if (DII_BenefitAmount_Self.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(DII_upArrow_Self, Benefit, DII_BenefitAmount_Self,
						DII_downArrow_Self);
			} else {
				DisabilityIncomeInsuranceLabel.click();
				reuseMethod.select_Benefit_Amount_slider(DII_upArrow_Self, Benefit, DII_BenefitAmount_Self,
						DII_downArrow_Self);
			}

			log.info("Amount selected for Self of DII Insurance Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select the benefit Amount for Self of DII Insurance Product || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_Monthly_Benefit_Amount_for_Spouse_as_under_DII(String Benefit) throws Exception {

		try {

			log.debug("Validates Monthly Benefit Amount for Spouse under DII");
			Thread.sleep(2000);

			String actual = SpouseBenefitAmountDII.getAttribute("value");
			System.out.println("Actual Benefit Amount:" + actual);
			assertEquals(actual, Benefit, "Monthly Banefit amount for Spouse under DII is Not Validated");

			log.info("Monthly Benefit Amount for Spouse under DII is validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Monthly Benefit Amount for Spouse under DII || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_Waiting_Period_for_Spouse_as_under_DII(String waitPeriod) throws Exception {

		try {

			log.debug("Validates Waiting Period for Spouse under DII");
			Thread.sleep(2000);
			String actual = WaitingPeriodDII_Spouse.getAttribute("value");
			assertEquals(actual, waitPeriod, " Waiting Period for Spouse under DII is Not Validated");

			log.info(" Waiting Period for Spouse under DII is validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate  Waiting Period for Spouse under DII || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_Benefit_Period_for_Self_as_under_DPOSDI(String benefitPeriod) throws Exception {

		try {

			log.debug("Validates Benefit Period for Self under DII");
			Thread.sleep(2000);
			String actual = BenefitPeriodDII_Self.getAttribute("value");
			assertEquals(actual, benefitPeriod, " Benefit Period for Self under DII is Not Validated");

			log.info(" Benefit Period for Self under DII is validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Benefit Period for Self under DII || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_Benefit_Period_for_Spouse_as_under_DII(String benefitPeriod) throws Exception {

		try {

			log.debug("Validates Benefit Period for Spouse under DII");
			Thread.sleep(2000);
			String actual = BenefitPeriodDII_Spouse.getAttribute("value");
			assertEquals(actual, benefitPeriod, " Benefit Period for Spouse under DII is Not Validated");

			log.info(" Benefit Period for Spouse under DII is validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Benefit Period for Spouse under DII || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_Plan_Type_for_Self_as_under_DII(String PlanType) throws Exception {

		try {

			log.debug("Validates Plan Type for Self under DII");
			Thread.sleep(2000);			
			List<WebElement> Actual_Values = reuseMethod.dropDowngetOption(DII_PlanType_Self);
			 
			for(WebElement e: Actual_Values)
			 {
				String Value= e.getText();	
				if(!Value.equalsIgnoreCase("string"))
				{
					if(Value.equalsIgnoreCase(PlanType))
					{
					assertEquals(Value, PlanType, " Plan Type for Self under DII is Not Validated");
					}
				}					
			 }
			log.info(" Plan Type for Self under DII is validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Plan Type for Self under DII || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	// TIE
	public boolean selects_Monthly_Benefit_Amount_for_Self_as_under_DisabilityIncomeInsurance_OR_DIP(String Benefit)
			throws Exception {

		try {

			log.debug(
					"Select Benefit Amount for Self of Disability Income Insurance OR Disability Income Protection Insurance Products");
			if (DII_nd_DIP_BenefitAmount_Self.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(DII_nd_DIP_UpArrow_Self, Benefit,
						DII_nd_DIP_BenefitAmount_Self, DII_nd_DIP_DownArrow_Self);
			} else {
				DisabilityIncomeInsuranceLabel.click();
				reuseMethod.select_Benefit_Amount_slider(DII_nd_DIP_UpArrow_Self, Benefit,
						DII_nd_DIP_BenefitAmount_Self, DII_nd_DIP_DownArrow_Self);
			}

			log.info("Amount selected for Self of DII or DIP Insurance Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Self of DII or DIP Insurance Product || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean AAFP_selects_Monthly_Benefit_Amount_for_Self_as_under_DII(String Benefit) throws Exception {

		try {

			log.debug("Select Benefit Amount for Self of DII Insurance Products");
			if (!SelficonDII.isDisplayed()) {
				DisabilityIncomeInsuranceLabel.click();
			}
			reuseMethod.scrollDown(BenefitOptionDII_Self_AAFP);
			reuseMethod.dropDown_select_byPartialText(BenefitOptionDII_Self_AAFP, Benefit);

			log.info("Amount selected for Self of DII Insurance Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select the benefit Amount for Self of DII Insurance Product || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Benefit_Option_for_Self_as_under_DII(String Period) throws Exception {

		try {
			log.debug("Select Waiting Period for Disability Income Insurance Products");
			Thread.sleep(1000);
			reuseMethod.dropDown_select_byPartialText(BenefitOptionDII_Self, Period);
			log.info(
					"Waiting Period for Disability Income Insurance Products for Self is selected sucessfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select Waiting Period for Disability Income Insurance Products || Fail"
					+ e.getMessage());
			throw (e);
		}

	}
	
	public boolean selects_Plan_Type_for_Self_as_under_DII(String PlanType) throws Exception {

		try {
			log.debug("Select Plan Type for Disability Income Insurance Products");
			Thread.sleep(1000);
			//reuseMethod.dropDown_select_byPartialText(DII_PlanType_Self, PlanType);
			reuseMethod.dropDown_select_byPartialText(DII_PlanType_Self, PlanType);
			log.info(
					"Plan Type for Disability Income Insurance Products for Self is selected sucessfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select Plan Type for Disability Income Insurance Products || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	// TIE

	public boolean selects_Waiting_Period_for_Self_as_under_DisabilityIncomeInsurance_OR_DIP(String WaitingPeriod)
			throws Exception {

		try {
			log.debug("Select Waiting Period for Disability Income Insurance OR DIP Products");
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(DII_nd_DIP_WaitingPeriod_Self, WaitingPeriod);
			log.info(
					"Waiting Period for Disability Income Insurance OR DIP Products for Self is selected sucessfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select Waiting Period for Disability Income Insurance or DIP Products || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Benefit_Option_for_Self_as_under_DisabilityIncomeInsurance(String BenefitOption)
			throws Exception {

		try {
			log.debug("Select Benefit_Option for Disability Income Insurance Products");
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(DII_BenefitOption_Self, BenefitOption);
			log.info(
					"Benefit_Option for Disability Income Insurance Products for Self is selected sucessfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select Benefit_Option for Disability Income Insurance Products || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

//AAFP

	public boolean validates_under_DII_the_Benefit_Slider_Range_for_Self_as_to(String Min_DII, String Max_DII)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges of Self for DII Products");
			String MinAmt = MinAmount_DIISelf.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min_DII)) {
				System.out.println("Minimum Range for Self of DII Product is validated");
			}
			String MaxAmt = MaxAmount_DIISelf.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max_DII)) {
				System.out.println("Maximum Range for Self of DII is validated");
			}
			log.info("Benefit Slider Ranges for Self of DII Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for Self of DII || Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_DisabilityIncomeInsurance_or_DisabilityIncomeProtectionInsurance_the_Benefit_Slider_Range_as_to_for_Self(
			String Min_DII, String Max_DII) throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges of Self for DII or DIP Products");
			String MinAmt = DII_nd_DIP_MinAmount_Self.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			MinAmt.replace("$", " ").replaceAll(",", " ");
			MinAmt.trim();
			
			if(Min_DII.contains("$"))
			{
				Min_DII.replace("$", " ");			
			}
			Min_DII.replaceAll(",", " ");
			Min_DII.trim();
			
			if (MinAmt.equalsIgnoreCase(Min_DII)) {
				System.out.println("Minimum Range for Self of DII or DIP Product is validated");
			}
			
			String MaxAmt = DII_nd_DIP_MaxAmount_Self.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);
			MaxAmt.replace("$", " ").replaceAll(",", " ");
			MaxAmt.trim();
			
			if(Max_DII.contains("$"))
			{
				Max_DII.replace("$", " ");			
			}
			Max_DII.replaceAll(",", " ");
			Max_DII.trim();
			
			if (MaxAmt.equalsIgnoreCase(Max_DII)) {
				System.out.println("Maximum Range for Self of DII or DIP is validated");
			}
			log.info("Benefit Slider Ranges for Self of DII or DIP Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for Self of DII or DIP || Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Inflation_Protection_Option_Rider_under_DII() throws Exception {

		try {
			log.debug("Validate Inflation Protection Rider of Self for DII Products");

			InflationProtectionRider_Self_AAFP.click();

			log.info("Inflation Protection Rider for Self of DII Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Inflation Protection Rider for Self of DII || Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean validate_that_Child_Name_is_Eligible_for_Child_coverage_Mobile(String CNameEli) throws Throwable {

		try {
			log.debug("Validate that mentioned Child Name is eligibile for product");
			boolean check = false;
			String cName = EligibleChildName_Mob.getText();
			String[] cNameList = cName.split(",");

			for (int i = 0; i < cNameList.length; i++) {

				if (cNameList[i].equalsIgnoreCase(CNameEli)) {
					check = true;
					cName = cNameList[i];

				}
				if (check == true) {
					Assert.assertEquals(cName, CNameEli, "Child Name does not match");

				}
				System.out.println(CNameEli + " is validated successfully");
				check = false;
			}

			log.info("Validated that mentioned Child is eligibile for product || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate that mentioned Child is eligibile for product || Fail" + e.getMessage());
			throw (e);

		}
	}

	// TIE
	public boolean verify_that_Eligible_Child_Names_under_TermLife_as(String CNameEli) throws Throwable {

		try {
			log.debug("Validate that Child Name is eligibile for product");
			boolean check = false;
			String cName = TermLifeProduct_EligibleChildName.getText();
			String[] cNameList = cName.split(",");

			for (int i = 0; i < cNameList.length; i++) {

				if (cNameList[i].equalsIgnoreCase(CNameEli)) {
					check = true;
					cName = cNameList[i];
				}
			}

			if (check == true) {
				Assert.assertEquals(cName, CNameEli, "Child Name does not match");
			}
			log.info("Validated that Child Name is eligibile for product || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate that Child Name is eligibile for product || Fail" + e.getMessage());
			throw (e);

		}
	}
	
	public boolean verify_that_Eligible_Child_Names_under_HLAI_as(String CNameEli) throws Throwable {

		try {
			log.debug("Validate that Child Name is eligibile for product");
			boolean check = false;
			String cName = EligibleChildName_HLAI.getText();
			String[] cNameList = cName.split(",");

			for (int i = 0; i < cNameList.length; i++) {

				if (cNameList[i].equalsIgnoreCase(CNameEli)) {
					check = true;
					cName = cNameList[i];
				}
			}

			if (check == true) {
				Assert.assertEquals(cName, CNameEli, "Child Name does not match");
			}
			log.info("Validated that Child Name is eligibile for product || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate that Child Name is eligibile for product || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean validate_that_is_Child_coverage_amount_dropdown_under_Traditional_Mobile(String CAmount)
			throws Throwable {
		try {
			log.debug("Validate that child coverage amount is correct");

			List<WebElement> ChildCoverageAmnt = reuseMethod.dropDowngetOption(BenefitChild_Mobile);

			for (WebElement element : ChildCoverageAmnt) {
				String values = element.getText();
				if (!values.equalsIgnoreCase("Select")) {
					String val = values.replaceAll("$", "").replaceAll(",", "");
					if (val.equalsIgnoreCase(CAmount)) {
						Assert.assertEquals(val, CAmount, "Child coverage amount does not match");
					}
				}

			}

			log.info("Validated that child coverage amount is correct || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate that child coverage amount is correct || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean validates_under_TermLife_the_Benefit_Slider_Range_for_CIR_as_to_for_Self(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for TermLife Products");
			String MinAmt = MinAmount_TermLifeSelfRider.getText();
			System.out.println("Actual Min Amount Self:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for CIR is validated");
			}
			String MaxAmt = MaxAmount_TermLifeSelfRider.getText();
			System.out.println("Actual Max Amount self:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for CIR is validated");
			}
			log.info("Benefit Slider Ranges for CIR  are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for CIR || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_under_TermLife_the_Benefit_Slider_Range_for_CIR_as_to_for_Spouse(String SMin_CIR,
			String SMax_CIR) throws Exception {

		try {
			log.debug("Validate CIR Slider Ranges for TermLife Products for Spouse");
			String MinAmt = MinAmount_TermLifeSpouseRider.getText();
			System.out.println("Actual Min Amount Self:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(SMin_CIR)) {
				System.out.println("Minimum Range for CIR is validated");
			}
			String MaxAmt = MaxAmount_TermLifeSpouseRider.getText();
			System.out.println("Actual Max Amount self:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(SMax_CIR)) {
				System.out.println("Maximum Range for CIR is validated");
			}
			log.info("Benefit Slider Ranges for CIR  are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for CIR || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_Benefit_Amount_for_Child_as_under_TermLife(String cBenefit) throws Exception {

		try {
			log.debug("Validate Benefit Amount for Child under TermLife");
			// String expected = cBenefit.replaceAll(",", "");
			// String expectedAmnt = expected.replaceAll("$", "");

			String actualvalue = BenefitAmountChildTermLifeProduct_Label.getText();
			if (cBenefit.contains("$")) {
				cBenefit = cBenefit.substring(1);
			}
			cBenefit = cBenefit.replaceAll(",", "");
			cBenefit.trim();
			if (actualvalue.contains("$")) {
				actualvalue = actualvalue.substring(1);
			}
			actualvalue = actualvalue.replaceAll(",", "");
			actualvalue.trim();

			Assert.assertEquals(actualvalue, cBenefit, "Benefit Amount for Child does not match");
			log.info("Validated Benefit Amount for Child under TermLife sucessfully || Pass");

			return true;
		} catch (Exception e) {
			log.error("Not able to validate Benefit Amount for Child under TermLife || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_Benefit_Amount_for_Child_as_under_TraditionalGroupTermLife(String cBenefit)
			throws Exception {

		try {
			log.debug("Validate Benefit Amount for Child under TraditionalGroupTermLife");
			// String expected = cBenefit.replaceAll(",", "");
			// String expectedAmnt = expected.replaceAll("$", "");

			String actualvalue = BenefitAmountChild_TraditionalGroupTermLifeProduct_Label.getAttribute("value");
			if (cBenefit.contains("$")) {
				cBenefit = cBenefit.substring(1);
			}
			cBenefit = cBenefit.replaceAll(",", "");
			cBenefit.trim();

			if (actualvalue.contains("$")) {
				actualvalue = actualvalue.substring(1);
			}
			actualvalue = actualvalue.replaceAll(",", "");
			actualvalue.trim();

			Assert.assertEquals(actualvalue, cBenefit, "Benefit Amount for Child does not match");

			log.info("Validated Benefit Amount for Child under TraditionalGroupTermLife sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Benefit Amount for Child under TraditionalGroupTermLife || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean validates_Benefit_Amount_for_Child_as_under_TenYTL_as_label(String cBenefit) throws Exception {

		try {
			log.debug("Validate Benefit Amount for Child under TenYTL");

			TenYrLifeTermInsuranceLabel.click();
			String expected = cBenefit.replaceAll(",", "");

			if (expected.contains("$")) {
				expected = expected.substring(expected.indexOf("$") + 1);
			}
			String actualvalue = BenefitAmountChild_TenYTL_Label2.getAttribute("value");
			String actualAmnt = actualvalue.substring(actualvalue.indexOf("$") + 1);
			actualAmnt = actualAmnt.replaceAll(",", "");
			Assert.assertEquals(actualAmnt, expected, "Benefit Amount for Child does not match");

			log.info("Validated Benefit Amount for Child under TenYTL sucessfully || Pass");
			return true;

		} catch (Exception e) {
			log.error("Not able to validate Benefit Amount for Child under TenYTL || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_Benefit_Amount_for_Child_as_under_TwentyYTL_as_label(String cBenefit) throws Exception {

		try {
			log.debug("Validate Benefit Amount for Child under TwentyYTL");
			String expected = cBenefit.replaceAll(",", "");

			if (expected.contains("$")) {
				expected = expected.substring(expected.indexOf("$") + 1);
			}
			String actualvalue = BenefitAmount_Child_20YrProduct_label.getText();
			String actualAmnt = actualvalue.substring(actualvalue.indexOf("$") + 1);
			actualAmnt = actualAmnt.replaceAll(",", "");
			Assert.assertEquals(actualAmnt, expected, "Benefit Amount for Child does not match");

			log.info("Validated Benefit Amount for Child under TwentyYTL sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Benefit Amount for Child under TwentyYTL || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Self_as_under_FifteenYr(String Benefit2) throws Exception {

		try {
			log.debug("Select Benefit Amount for Self of Fifteen Year");
			if (!SelfBenefitAmount15Yr.isDisplayed()) {

				FifteenYrLabel.click();
				Thread.sleep(3000);

			}

			reuseMethod.select_Benefit_Amount_slider(upArrow_Self_FifteenYrProduct, Benefit2, SelfBenefitAmount15Yr,
					downArrow_Self_FifteenYrProduct);

			log.info("Amount selected for Self  Fifteen Year Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for self of Fifteen Year Product|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_FifteenYTL_the_Benefit_Slider_Range_for_Self(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for self for Fifteen year Products");
			String MinAmt = FifteenMin_AmntSelf.getText();
			System.out.println("Actual Min Amount Self:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for self for  Fifteen year is validated");
			}
			String MaxAmt = FifteenMax_AmntSelf.getText();
			System.out.println("Actual Max Amount self:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for self for  Fifteen year is validated");
			}
			log.info("Benefit Slider Ranges for self for Fifteen year are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for Fifteen year for self|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_benefit_amount_for_Fifteen_Year_Product_Spouse_as(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Spouse of Fifteen Years Products");
			if (!spouseBenefitAmount15Yr.isDisplayed()) {

				FifteenYrLabel.click();
				Thread.sleep(2000);
			}
			reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_FifteenYrProduct, sBenefit, spouseBenefitAmount15Yr,
					downArrow_Spouse_FifteenYrProduct);

			log.info("Amount selected for Spouse of Fifteen Years Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select the benefit Amount for Spouse of Fifteen Year Product|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_under_FifteenYTL_the_Benefit_Slider_Range_for_Spouse(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for Fifteen year Products for spouse");
			String MinAmt = FifteenMin_AmntSpouse.getText();
			System.out.println("Actual Min Amount Spouse:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for Fifteen year is validated for spouse");
			}
			String MaxAmt = FifteenMax_AmntSpouse.getText();
			System.out.println("Actual Max Amount Spouse:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for Fifteen year is validated for spouse");
			}
			log.info("Benefit Slider Ranges for Fifteen year for spouse are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Validate Benefit Slider Ranges for Fifteen year for spouse || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Benefit_Amount_for_Spouse_as_under_Accidental_death_from_dropdown(String sBenefit)
			throws Exception {

		try {
			log.debug("Select Benefit Amount for Spouse of ADnD");
			if (!spouseBenefitAmount_ADnD.isDisplayed()) {

				AccidentalDeathLabel.click();
				Thread.sleep(2000);
			}

			reuseMethod.dropDownselectbyvalue(spouseBenefitAmount_ADnD, sBenefit);

			log.info("Amount selected for Spouse of ADnD Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Spouse of ADnD Product|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_under_ADDI_the_Benefit_Amounts_Listed_for_spouse(String ADnD_sAmount) throws Throwable {
		try {
			log.debug("Validates under Accidental death the Benefit Amounts Listed for spouse");
			List<WebElement> SpsAmnt = reuseMethod.dropDowngetOption(spouseBenefitAmount_ADnD);
			ADnD_sAmount = ADnD_sAmount.replaceAll("$", "").replaceAll(",", "");
			for (WebElement e : SpsAmnt) {
				if (!e.getText().equalsIgnoreCase("select")) {

					String ActualAmnt = e.getText();
					if (ActualAmnt.equals(ADnD_sAmount)) {
						int index = ActualAmnt.indexOf("$");
						ActualAmnt = ActualAmnt.substring(index + 1).replaceAll(",", "");
						System.out.println("Amount matched, Actual Amount in dropdown is: " + ActualAmnt);
					}
				}
			}
			log.info("Validated under Accidental death the Benefit Amounts Listed for spouse sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate under Accidental death the Benefit Amounts Listed for spouse|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Future_Purchase_Option_rider_under_LTD_product() throws Exception {

		try {
			log.debug("Select Future Purchase Option Rider for Long term Disability Product");
			reuseMethod.scrollDown(abeSelfBenefitAmountLTDProduct);
			Thread.sleep(1000);
			FPO_Self_LTD.isDisplayed();
			FPO_Self_LTD.click();
			Thread.sleep(500);

			log.info("Future Purchase Option Rider for Long term Disability Product is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Future Purchase Option Rider for Long term Disability Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_FPO_Rider_Benefit_Amount_for_Self_as(String Benefit) throws Throwable {

		try {
			log.debug("Selects FPO Rider Benefit Amount for Self");
			if (!FPO_Self_SliderAmntLTD.isDisplayed()) {

				LongTermDisabilityLabel.click();
				Thread.sleep(2000);
			}
			reuseMethod.select_Benefit_Amount_slider(upArrow_Self_LTDFPO, Benefit, FPO_Self_SliderAmntLTD,
					downArrow_Self_LTDFPO);

			log.info("Selects FPO Rider Benefit Amount for Self sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select FPO Rider Benefit Amount for Self|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Benefit_Amount_for_Spouse_as_under_LTD(String SBenefit) throws Throwable {
		try {
			log.debug("Validates Benefit Amount for Spouse under LTD");
			if (!BenefitAmnt_SpouseLTD.isDisplayed()) {
				LongTermDisabilityLabel.click();
			}
			String actual_Amount = BenefitAmnt_SpouseLTD.getAttribute("value");
			if (SBenefit.contains("$")) {
				SBenefit = SBenefit.substring(1);
			}
			SBenefit = SBenefit.replaceAll(",", "");

			actual_Amount = actual_Amount.substring(1);
			actual_Amount = actual_Amount.replaceAll(",", "");

			Assert.assertEquals(actual_Amount, SBenefit, "Benefit Amount for spouse does not match under LTD");
			log.info("Validated Benefit Amount for Spouse under LTD sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Benefit Amount for Spouse under LTD|| Fail" + e.getMessage());
			throw (e);
		}
	}

	// TIE
	public boolean validates_Benefit_Amount_value_for_Spouse_under_ADDI_as(String SBenefit) throws Exception {

		try {
			log.debug("Validate Benefit Amount for Spouse under ADDI");
			String expected = SBenefit.replaceAll(",", "");
			String expectedAmnt = expected.replace("$", "");
			expectedAmnt.trim();
			String actualvalue = BenefitAmountVerify_ADDI_Spouse.getAttribute("value");
			String actualAmnt = actualvalue.replace("$", "");
			actualAmnt = actualAmnt.replaceAll(",", "");
			actualAmnt.trim();
			System.out.println(actualvalue);
			Assert.assertEquals(actualAmnt, expectedAmnt, "Benefit Amount for Spouse does not match");

			log.info("Validated Benefit Amount for Spouse under ADDI sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Benefit Amount for Spouse under ADDI || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_Benefit_Amount_value_for_Child_under_ADDI_as(String CBenefit) throws Exception {

		try {
			log.debug("Validate Benefit Amount for Child under ADDI");
			String expected = CBenefit.replaceAll(",", "");
			String expectedAmnt = expected.replace("$", "");
			expectedAmnt.trim();
			String actualvalue = BenefitAmountVerify_ADDI_Child.getAttribute("value");
			String actualAmnt = actualvalue.replace("$", "");
			actualAmnt = actualAmnt.replaceAll(",", "");
			actualAmnt.trim();
			Assert.assertEquals(actualAmnt, expectedAmnt, "Benefit Amount for Child does not match");

			log.info("Validated Benefit Amount for Child under ADDI sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Benefit Amount for Child under ADDI || Fail" + e.getMessage());
			throw (e);
		}

	}

	// **************

	public boolean validates_under_STD_the_Benefit_Slider_Range_for_Self(String Min, String Max) throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for self for STD Product");
			String MinAmt = MinAmount_STDSelf.getText();
			System.out.println("Actual Min Amount Self:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for self for STD is validated");
			}
			String MaxAmt = MaxAmount_STDSelf.getText();
			System.out.println("Actual Max Amount self:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for self for STD is validated");
			}
			log.info("Benefit Slider Ranges for self forSTD are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for STD for self|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Wait_Period_for_Self_as_under_OOEDI_displayed_as_label(String wPeriod) throws Throwable {
		try {
			log.debug("Validates Wait Period for Self as under OOEDI");
			String ActualAmnt = waitPrd_OOEDISelf_Label.getText().trim();
			String Expected = wPeriod.trim();
			Assert.assertEquals(ActualAmnt, Expected, "Wait Period for Self does not match under OOEDI");
			log.info("Validated Wait Period for Self as under OOEDI sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Wait Period for Self as under OOEDI|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Benefit_duration_for_Self_as_under_OOEDI_displayed_as_label(String bDuration)
			throws Throwable {
		try {
			log.debug("Validates Wait Period for Self as under OOEDI");
			String ActualAmnt = BeneDuration_OOEDISelf_Label.getText().trim();
			String Expected = bDuration.trim();
			Assert.assertEquals(ActualAmnt, Expected, "Wait Period for Self does not match under OOEDI");
			log.info("Validated Wait Period for Self as under OOEDI sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Wait Period for Self as under OOEDI|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Benefit_Amount_for_Self_as_under_SDI(String bAmount) throws Throwable {
		try {
			log.debug("Select Benefit Amount for Self as under SDI");
			if (!beneAmount_SDI.isDisplayed()) {
				LongTermDisabilityPlusLabel.click();
				Thread.sleep(2000);
			}
			reuseMethod.select_Benefit_Amount_slider(upArrow_Self_SDI, bAmount, beneAmount_SDI, downArrow_Self_SDI);
			log.info("Selected Benefit Amount for Self as under SDI sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Benefit Amount for Self as as under SDI|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_under_SDI_the_Benefit_Slider_Range_for_Self(String Min, String Max) throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for self for SDI Product");
			String MinAmt = minSliderLabel_SDISelf.getText();
			System.out.println("Actual Min Amount Self:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for self for SDI is validated");
			}
			String MaxAmt = maxSliderLabel_SDISelf.getText();
			System.out.println("Actual Max Amount self:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for self for SDI is validated");
			}
			log.info("Benefit Slider Ranges for self for SDI are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for SDI for self|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Wait_Period_for_Self_as_under_SDI(String wPeriod) throws Throwable {
		try {
			log.debug("Validates Wait Period for Self as under SDI");
			List<WebElement> waitPeriod = reuseMethod.dropDowngetOption(waitPrd_SDISelf);
			String expectedPeriod = wPeriod.trim();
			for (WebElement e : waitPeriod) {
				String actualPeriod = e.getText().trim();
				if (!actualPeriod.equalsIgnoreCase("Select")) {
					if (actualPeriod.equalsIgnoreCase(expectedPeriod))
						System.out.println("Wait Period for Self matched under SDI");
				}
			}
			log.info("Validated Wait Period for Self as under SDI sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Wait Period for Self as under SDI|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Benefit_Duration_for_Self_as_under_SDI(String bDuration) throws Throwable {

		try {
			log.debug("Selects Benefit Duration for Self under SDI");
			reuseMethod.dropDownselectbyvalue(beneDuration_SDISelf, bDuration);
			log.info("Selects Benefit Duration for Self under SDI sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Benefit Duration for Self under SDI|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Waiting_Period_for_Self_as_under_GDII(String period) throws Throwable {

		try {
			log.debug("Selects Waiting Periodn for Self under GDII");
			reuseMethod.dropDownselectbyvalue(GDII_WaitingPeriod_Self, period);
			log.info("Selects Waiting Period for Self under GDII sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Waiting Period for Self under GDII|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_benefit_option_for_Self_as_under_GDII(String option) throws Throwable {

		try {
			log.debug("Selects Benefit option for Self under GDII");
			reuseMethod.dropDownselectbyvalue(beneOption_GDIISelf, option);
			log.info("Selects Benefit option for Self under GDII sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Benefit option for Self under GDII|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Wait_Period_for_Self_as_under_GDII(String wPeriod) throws Throwable {
		try {
			log.debug("Validates dropdown values Wait Period for Self as under GDII");
			List<WebElement> waitPeriod = reuseMethod.dropDowngetOption(GDII_WaitingPeriod_Self);
			String expectedPeriod = wPeriod.trim();
			for (WebElement e : waitPeriod) {
				String actualPeriod = e.getText().trim();
				if (!actualPeriod.equalsIgnoreCase("Select")) {
					if (actualPeriod.equalsIgnoreCase(expectedPeriod))
						System.out.println("Wait Period for Self matched under GDII");
				}
			}
			log.info("Validated dropdown values Wait Period for Self as under GDII sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate dropdown values Wait Period for Self as under GDII|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_dropdown_values_benefit_option_for_Self_as_under_GDII(String option) throws Throwable {
		try {
			log.debug("Validates dropdown values of Benefit Option for Self as under GDII");
			List<WebElement> bOption = reuseMethod.dropDowngetOption(beneOption_GDIISelf);
			String expectedOption = option.trim();
			for (WebElement e : bOption) {
				String actualOption = e.getText().trim();
				if (!actualOption.equalsIgnoreCase("Select")) {
					if (actualOption.equalsIgnoreCase(expectedOption))
						System.out.println("Benefit Option for Self matched under GDII");
				}
			}
			log.info("Validated dropdown values of Benefit Option for Self as under GDII sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate dropdown values of Benefit Option for Self as under GDII|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	// ************************END*******************

	// WAEPA

	public boolean validates_that_the_Child_benefit_amount_for_Group_Term_Product_is_disabled_and_selected_as(
			String Cbenefit) throws Exception {

		try {
			log.debug("Child benefit amount for Group Term Product is disabled and Selected as" + Cbenefit);
			boolean Actual = BenefitAmount_Child_5YrProduct.isEnabled();
			Assert.assertFalse(Actual, "Child benefit amount for Group Term Product is enabled || Bug");
			String Actual_Value = BenefitAmount_Child_5YrProduct.getText();
			if (Actual_Value.equalsIgnoreCase(Cbenefit)) {
				System.out.println("Expected value is getting selected as " + Cbenefit);
			}
			log.info("Child benefit amount for Group Term Product is disabled || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Child of Five Year Product || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validate_message_for_spouse_displayed_in_blue_box_in_coverage_page() throws Throwable {
		try {
			log.debug("Validate Notification Messege on Coverage Page for spouse");
			String Expected = PropertyUtility.Load_MessageFile_Data("SpouseCoveragenotification");
			String msg1 = CoveragenotificationMsgSpouse1.getText();
			String msg2 = CoveragenotificationMsgSpouse2.getText();
			String Actualmsg = msg1 + msg2;
			Actualmsg = Actualmsg.replaceAll("//s", "");
			Expected = Expected.replaceAll("//s", "");
			Actualmsg.trim();
			Expected.trim();
			System.err.println("Error Messege on Coverage Page===" + Actualmsg);
			Assert.assertEquals(Actualmsg, Expected, "Notification message on Coverage does not match");

			log.info("Notification message for spouse on Coverage page validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Notification Messege on coverage Page || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean select_Type_of_Coverage_as_for_self_MLI(String TypeofCove) throws Exception {

		try {
			log.debug("Select type of coverage for self Manager Life Insurance");
			if (!newCoverageSelf_MLI.isDisplayed()) {
				ManagerLifeInsuranceLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSelf_MLI, changeCoverageSelf_MLI, TypeofCove);

			log.info("Coverage type for self selected for Manager Life Insurance successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for self Manager Life Insurance|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean selects_Benefit_Amount_for_Self_as_under_MLI(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Self of Manager Life Insurance Products");
			if (nadaSelfBenefitAmountMLI.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_MLIProduct, sBenefit, nadaSelfBenefitAmountMLI,
						downArrow_Self_MLIProduct);
			} else {
				ManagerLifeInsuranceLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_MLIProduct, sBenefit, nadaSelfBenefitAmountMLI,
						downArrow_Self_MLIProduct);
			}
			log.info("Amount selected for Self of Manager Life Insurance Product sucessfully || Pass");
			return true;
		} catch (Exception e) {

			log.error("Not able to select the benefit Amount for Self of  Manager Life Insurance Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean select_Type_of_Coverage_as_for_spouse_MLI(String TypeofCove) throws Exception {

		try {
			log.debug("Select type of coverage for spouse Manager Life Insurance");
			if (!newCoverageSpouse_MLI.isDisplayed()) {
				ManagerLifeInsuranceLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSpouse_MLI, changeCoverageSpouse_MLI, TypeofCove);

			log.info("Coverage type for spouse selected for Manager Life Insurance successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for spouse Manager Life Insurance|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean selects_Optional_AD_D_Rider_Self_under_ManagerLifeInsurance() throws Exception {

		try {
			log.debug("Validate AD & D Rider is selected for self for MLI");
			MLIProduct_ADDRider_ChkBox_Self.click();

			log.info("AD & D Rider for self for MLI is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select AD & D Rider for self for MLI || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_optional_AD_D_Rider_Benefit_Amount_Self(String amount) throws Exception {
		try {
			log.debug("Select Optional AD&D Rider Benefit amount for self");
			MLIProduct_ADDRider_BenefitAmount_Self.isDisplayed();
			reuseMethod.dropDown(MLIProduct_ADDRider_BenefitAmount_Self, amount);
			log.info("Optional AD&D Rider Benefit amount for self is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Optional AD&D Rider Benefit amount for self || Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Spouse_as_under_MLI(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Spouse of Manager Life Insurance Products");
			if (nadaSpouseBenefitAmountMLI.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_MLIProduct, sBenefit,
						nadaSpouseBenefitAmountMLI, downArrow_Spouse_MLIProduct);
			} else {
				ManagerLifeInsuranceLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_MLIProduct, sBenefit,
						nadaSpouseBenefitAmountMLI, downArrow_Spouse_MLIProduct);
			}
			log.info("Amount selected for Spouse of Manager Life Insurance Product sucessfully || Pass");
			return true;
		} catch (Exception e) {

			log.error("Not able to select the benefit Amount for Spouse of  Manager Life Insurance Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Optional_AD_D_Rider_Spouse_under_ManagerLifeInsurance() throws Exception {

		try {
			log.debug("Validate AD & D Rider is selected for Spouse for MLI");
			MLIProduct_ADDRider_ChkBox_Spouse.click();

			log.info("AD & D Rider for Spouse for MLI is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select AD & D Rider for Spouse for MLI || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_optional_AD_D_Rider_under_MLI_Benefit_Amount_Spouse(String amount) throws Exception {
		try {
			log.debug("Select Optional AD&D Rider Benefit amount for spouse");
			MLIProduct_ADDRider_BenefitAmount_Spouse.isDisplayed();
			reuseMethod.dropDown(MLIProduct_ADDRider_BenefitAmount_Spouse, amount);
			log.info("Optional AD&D Rider Benefit amount for spouse is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Optional AD&D Rider Benefit amount for spouse || Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Child_as_under_MLI(String amount) throws Exception {
		try {
			log.debug("Select Benefit amount for child");
			nadaChildBenefitAmountMLI.isDisplayed();
			reuseMethod.dropDownselectbyvalue(nadaChildBenefitAmountMLI, amount);
			log.info("Benefit amount for child is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Benefit amount for child || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean Selects_AD_D_Rider_for_Child_for_MLI() throws Exception {

		try {
			log.debug("Validate AD & D Rider is selected for Child for MLI");
			MLIProduct_ADDRider_ChkBox_Child.click();

			log.info("AD & D Rider for child for MLI is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select AD & D Rider for child for MLI || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_Type_of_Coverage_as_for_self_ELI(String TypeofCove) throws Exception {

		try {
			log.debug("Select type of coverage for self Employee Life Insurance");
			if (!newCoverageSelf_ELI.isDisplayed()) {
				EmployeeLifeInsuranceLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSelf_ELI, changeCoverageSelf_ELI, TypeofCove);

			log.info("Coverage type for self selected for Employee Life Insurance successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for self Employee Life Insurance|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean validates_under_ELI_the_Benefit_Slider_Range_as_to_Self(String Min, String Max) throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for ELI Products");
			String MinAmt = minAmount_ELISelf.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for ELI Product is validated");
			}
			String MaxAmt = maxAmount_ELISelf.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for ELI Product is validated");
			}
			log.info("Benefit Slider Ranges for ELI Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for ELI Products|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Self_as_under_ELI(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Self of Employee Life Insurance Products");
			if (nadaSelfBenefitAmountELIr.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_ELIProduct, sBenefit, nadaSelfBenefitAmountELIr,
						downArrow_Self_ELIProduct);
			} else {
				EmployeeLifeInsuranceLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_ELIProduct, sBenefit, nadaSelfBenefitAmountELIr,
						downArrow_Self_ELIProduct);
			}
			log.info("Amount selected for Self of Employee Life Insurance Product sucessfully || Pass");
			return true;
		} catch (Exception e) {

			log.error("Not able to select the benefit Amount for Self of Employee Life Insurance Product|| Fail"
					+ e.getMessage());

			throw (e);
		}
	}

	public boolean selects_optional_AD_D_Rider_Benefit_Amount_Self_for_ELI(String amount) throws Exception {
		try {
			log.debug("Select Optional AD&D Rider Benefit amount for self for ELI");
			ELIProduct_ADDRider_BenefitAmount_Self.isDisplayed();
			reuseMethod.dropDown(ELIProduct_ADDRider_BenefitAmount_Self, amount);
			log.info("Optional AD&D Rider Benefit amount for self for ELI is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Optional AD&D Rider Benefit amount for self for ELI|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Optional_AD_D_Rider_Self_under_EmployeeLifeInsurance() throws Exception {

		try {
			log.debug("Validate AD & D Rider is selected for self for ELI");
			ELIProduct_ADDRider_ChkBox_Self.click();
			log.info("AD & D Rider for self for ELI is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select AD & D Rider for self for ELI || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_under_MLI_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for MLI Products for spouse");
			String MinAmt = minAmount_MLISpouse.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for MLI Product is validated for spouse");
			}
			String MaxAmt = maxAmount_MLISpouse.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for MLI Product is validated for spouse");
			}
			log.info("Benefit Slider Ranges for MLI Products are validated for spouse sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Validate Benefit Slider Ranges for MLI Products for spouse || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean verify_Change_in_Coverage_is_unavailable_for_ADDRider_under_ARTL_or_TermLife_for_Spouse()
			throws Exception {

		try {
			log.debug(
					"Verify Type of Coverage 'Change In coverage' is unavailable for Spouse for AD&D rider under TermLife or ARTL");

			if (!SpouseSection_Traditional.isDisplayed()) {
				TermLifeInsuranceLabel.click();
				Thread.sleep(1000);
			}
			Assert.assertFalse(changeCoverageSpouse_AdnD_TermLife.isDisplayed(),
					"Bug|| Change In coverage is displayed for Spouse AD&D rider under TermLife or ARTL");

			log.info(
					"Verified Type of Coverage 'Change In coverage' is unavailable for Spouse for AD&D rider under TermLife or ARTL successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to verify Type of Coverage 'Change In coverage' is unavailable for Spouse for AD&D rider under TermLife or ARTL || Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean selects_Type_of_Coverage_as_for_Self_for_ADDRider_under_ARTL_or_TermLife(String TypeofCov)
			throws Throwable {
		try {
			log.debug("Select type of coverage for self for AD&D rider under ARTL/TermLife");
			if (!newCoverage_ADDRider_Self.isDisplayed()) {
				TermLifeInsuranceLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverage_ADDRider_Self, changeCoverage_ADDRider_Self, TypeofCov);

			log.info("Coverage type for self selected for AD&D rider under ARTL/TermLife successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select coverage type for self AD&D rider under ARTL/TermLife|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean verify_Change_in_Coverage_is_available_for_ADDRider_under_ARTL_or_TermLife_for_Spouse()
			throws Exception {

		try {
			log.debug(
					"Verify Type of Coverage 'Change In coverage' is available for Spouse for AD&D rider under TermLife or ARTL");

			if (!SpouseSection_Traditional.isDisplayed()) {
				TermLifeInsuranceLabel.click();
				Thread.sleep(1000);
			}
			Assert.assertTrue(changeCoverageSpouse_AdnD_TermLife.isDisplayed(),
					"Bug|| Change In coverage is not displayed for Spouse AD&D rider under TermLife or ARTL");

			log.info(
					"Verified Type of Coverage 'Change In coverage' is available for Spouse for AD&D rider under TermLife or ARTL successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to verify Type of Coverage 'Change In coverage' is available for Spouse for AD&D rider under TermLife or ARTL || Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean selects_Type_of_Coverage_as_for_Spouse_for_ADDRider_under_ARTL_or_TermLife(String TypeofCov)
			throws Throwable {
		try {
			log.debug("Select type of coverage for spouse for AD&D rider under ARTL/TermLife");
			if (!newCoverageSpouse_AdnD_TermLife.isDisplayed()) {
				TermLifeInsuranceLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSpouse_AdnD_TermLife, changeCoverageSpouse_AdnD_TermLife,
					TypeofCov);

			log.info("Coverage type for spouse selected for AD&D rider under ARTL/TermLife successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for spouse AD&D rider under ARTL/TermLife|| Fail"
					+ e.getMessage());
			throw (e);

		}
	}

	public boolean validates_under_TermLife_the_Benefit_Slider_Range_for_ADDRider_as_to_for_Spouse(String SMin,
			String SMax) throws Exception {

		try {
			log.debug("Validate ADD Rider Slider Ranges for ARTL Products for Spouse");
			String MinAmt = MinAmount_TermLifeSpouseADDRider.getText();
			System.out.println("Actual Min Amount Spouse:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(SMin)) {
				System.out.println("Minimum Range for ADD Rider Slider Ranges under ARTL is validated");
			}
			String MaxAmt = MaxAmount_TermLifeSpouseADDRider.getText();
			System.out.println("Actual Max Amount Spouse:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(SMax)) {
				System.out.println("Maximum Range for ADD Rider Slider Ranges under ARTL is validated");
			}
			log.info("Benefit Slider Ranges for ADD Rider Slider Ranges under ARTL are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for ADD Rider Slider Ranges under ARTL || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean validate_min_and_max_values_for_BOE_for_self_Mobile(String TYMin, String TYMax) throws Throwable {

		try {
			log.debug("Validate coverage range for Business Overhead Expenses for self");

			if (!BusinessAmountSelf_Mobile.isDisplayed()) {
				businessArrowSelf_Mobile.click();
				Thread.sleep(1000);

				reuseMethod.scrollDown(businessArrowSelf_Mobile);
				if (BusinessAmountSelf_Mobile.getText().equals(TYMin)) {
					System.out.println("Minimum is validated for Business Overhead Expenses");
				}
				reuseMethod.select_Benefit_Amount_slider(BusinessPlusSelf_Mobile, TYMax, BusinessAmountSelf_Mobile,
						BusinessMinusSelf_Mobile);
			}
			if (BusinessAmountSelf_Mobile.getText().equals(TYMax)) {
				System.out.println("Maximum is validated for Business Overhead Expenses");
			}
			log.info("Validate coverage range for Business Overhead Expenses for self sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate coverage range for Business Overhead Expenses for self || Fail"
					+ e.getMessage());

			throw (e);
		}
	}

	public boolean selects_Benefit_Amount_for_Spouse_as_for_ADDRider_under_ARTL(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Spouse for AD&D Rider of ARTL Product");
			if (!SpouseBenefitAmountTermLifeADDRider.isDisplayed()) {
				TermLifeInsuranceLabel.click();
			}
			reuseMethod.scrollDown(upArrow_Spouse_TermLifeADDRider);
			reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_TermLifeADDRider, sBenefit,
					SpouseBenefitAmountTermLifeADDRider, downArrow_Spouse_TermLifeADDRider);

			log.info("Amount selected for Spouse for AD&D Rider of ARTL Product sucessfully || Pass");
			return true;
		} catch (Exception e) {

			log.error(
					"Not able to select the benefit Amount for Spouse for AD&D Rider of ARTL|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean select_Type_of_Coverage_as_for_self_AOD(String TypeofCov) throws Exception {

		try {
			log.debug("Select type of coverage for Self AOD");
			if (!newCoverageSelf_AOD.isDisplayed()) {
				AODInsuranceLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSelf_AOD, changeCoverageSelf_AOD, TypeofCov);

			log.info("Coverage type for Self for AOD selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for Self for AOD || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean verify_Change_in_Coverage_is_available_under_AOD_for_Spouse() throws Exception {

		try {
			log.debug("Verify Type of Coverage 'Change in coverage' is available for Spouse for AOD");

			if (!changeCoverageSpouse_AOD.isDisplayed()) {
				AODInsuranceLabel.click();
				Thread.sleep(1000);
			}
			Assert.assertTrue(changeCoverageSpouse_AOD.isDisplayed(),
					"Bug|| Change in coverage is not displayed for Spouse");

			log.info(
					"Verified Type of Coverage 'Change In coverage' is available for Spouse for AOD successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify Type of Coverage 'Change in coverage' is available for Spouse for AOD || Fail"
					+ e.getMessage());
			throw (e);

		}
	}

	public boolean verify_Change_in_Coverage_is_unavailable_under_AOD_for_Spouse() throws Exception {

		try {
			log.debug("Verify Type of Coverage 'Change in coverage' is unavailable for Spouse for AOD");

			if (!changeCoverageSpouse_AOD.isDisplayed()) {
				AODInsuranceLabel.click();
				Thread.sleep(1000);
			}
			Assert.assertFalse(changeCoverageSpouse_AOD.isDisplayed(),
					"Bug|| Change in coverage is displayed for Spouse");

			log.info(
					"Verified Type of Coverage 'Change In coverage' is unavailable for Spouse for AOD successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to verify Type of Coverage 'Change in coverage' is unavailable for Spouse for AOD || Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean validates_under_AOD_the_Benefit_Slider_Range_as_to_for_Self(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for AOD Products for Self");
			String MinAmt = MinBenAmnt_Slider_Self_AOD.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for AOD is validated for Self");
			}
			String MaxAmt = MaxBenAmnt_Slider_Self_AOD.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for AOD Product is validated for Self");
			}
			log.info("Benefit Slider Ranges for AOD Products for Self are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for AOD Products for Self|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Self_as_under_AOD(String Benefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Self of AOD Products");
			if (!BenAmnt_Self_AOD.isDisplayed()) {
				AODInsuranceLabel.click();
			}
			Thread.sleep(2000);
			reuseMethod.select_Benefit_Amount_slider(upArrow_Self_AODProduct, Benefit, BenAmnt_Self_AOD,
					downArrow_Self_AODProduct);

			log.info("Amount selected for Self of AOD Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for self of AOD Product|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean validates_Wait_Period_for_Self_as_under_AOD_from_dropdown(String wPeriod) throws Throwable {
		try {
			log.debug("Validates Wait Period for Self as under AOD");
			List<WebElement> waitPeriod = reuseMethod.dropDowngetOption(WaitP_Self_AOD);
			String expectedPeriod = wPeriod.trim();
			for (WebElement e : waitPeriod) {
				String actualPeriod = e.getText().trim();
				if (!actualPeriod.equalsIgnoreCase("Select")) {
					if (actualPeriod.equalsIgnoreCase(expectedPeriod))
						System.out.println("Wait Period for Self matched under AOD");
				}
			}
			log.info("Validated Wait Period for Self as under AOD sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Wait Period for Self as under AOD|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean select_Type_of_Coverage_as_for_self_GTDLI(String TypeofCove) throws Exception {

		try {
			log.debug("Select type of coverage for self General Term Dealer Life Insurance");
			if (!newCoverageSelf_GTDLI.isDisplayed()) {
				GTDLifeInsuranceLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSelf_GTDLI, changeCoverageSelf_GTDLI, TypeofCove);

			log.info("Coverage type for self selected for General Term Dealer Life Insurance successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for self General Term Dealer Life Insurance|| Fail"
					+ e.getMessage());
			throw (e);

		}
	}

	public boolean validates_under_GTDLI_the_Benefit_Slider_Range_as_to_Self(String Min, String Max) throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for General term dealer life insurance Products");
			String MinAmt = MinAmount_GTDLISelf.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for General term dealer life insurance Product is validated");
			}
			String MaxAmt = MaxAmount_GTDLISelf.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for General term dealer life insurance Product is validated");
			}
			log.info(
					"Benefit Slider Ranges for General term dealer life insurance Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Validate Benefit Slider Ranges for General term dealer life insurance Products|| Fail"
							+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Optional_AD_D_Rider_Self_under_GeneralTermDealerLifeInsurance() throws Exception {

		try {
			log.debug("Validate AD & D Rider is selected for self for GTDLI");
			GTDLIProduct_ADDRider_ChkBox_Self.click();

			log.info("AD & D Rider for self for GTDLI is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select AD & D Rider for self for GTDLI || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Self_as_under_GTDLI(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Self of General Term Dealer Life Insurance Products");
			if (nadaSelfBenefitAmountGTDLI.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_GTDLIProduct, sBenefit,
						nadaSelfBenefitAmountGTDLI, downArrow_Self_GTDLIProduct);
			} else {
				GTDLifeInsuranceLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_GTDLIProduct, sBenefit,
						nadaSelfBenefitAmountGTDLI, downArrow_Self_GTDLIProduct);
			}
			log.info("Amount selected for Self of General Term Dealer Life Insurance Product sucessfully || Pass");
			return true;
		} catch (Exception e) {

			log.error(
					"Not able to select the benefit Amount for Self of  General Term Deale Life Insurance Product|| Fail"
							+ e.getMessage());

			throw (e);
		}
	}

	public boolean selects_Benefit_Amount_for_Spouse_as_under_GTDLI(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Spousef of General Term Dealer Life Insurance Products");
			if (nadaSpouseBenefitAmountGTDLI.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_GTDLIProduct, sBenefit,
						nadaSpouseBenefitAmountGTDLI, downArrow_Spouse_GTDLIProduct);
			} else {
				GTDLifeInsuranceLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_GTDLIProduct, sBenefit,
						nadaSpouseBenefitAmountGTDLI, downArrow_Spouse_GTDLIProduct);
			}
			log.info("Amount selected for Spouse of General Term Dealer Life Insurance Product sucessfully || Pass");
			return true;
		} catch (Exception e) {

			log.error(
					"Not able to select the benefit Amount for Spouse of General Term Dealer Life Insurance Product|| Fail"
							+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_optional_AD_D_Rider_Benefit_Amount_Self_for_GTDLI(String amount) throws Exception {
		try {
			log.debug("Select Optional AD&D Rider Benefit amount for self for GTDLI");
			Thread.sleep(1000);
			GTDLIProduct_ADDRider_BenefitAmount_Self.isDisplayed();
			reuseMethod.dropDown(GTDLIProduct_ADDRider_BenefitAmount_Self, amount);
			log.info("Optional AD&D Rider Benefit amount for self for GTDLI is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Optional AD&D Rider Benefit amount for self for GTDLI|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Child_as_under_GTDLI(String amount) throws Exception {
		try {
			log.debug("Select Benefit amount for child under GTDLI");
			nadaChildBenefitAmountGTDLI.isDisplayed();
			reuseMethod.dropDownselectbyvalue(nadaChildBenefitAmountGTDLI, amount);
			log.info("Benefit amount for child under GTDLI is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Benefit amount for child under GTDLI || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Optional_AD_D_Rider_Child_under_GeneralTermDealerLifeInsurance() throws Exception {

		try {
			log.debug("Validate AD & D Rider is selected for child for GTDLI");
			GTDLIProduct_ADDRider_ChkBox_Child.click();
			log.info("AD & D Rider for child for GTDLI is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select AD & D Rider for child for GTDLI || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Waiting_Period_for_Self_as_under_AOD(String WaitingPeriod) throws Exception {

		try {
			log.debug("Select Waiting Period for AOD Products");
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(WaitP_Self_AOD, WaitingPeriod);
			log.info("Waiting Period for AOD Products for Self is selected sucessfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select Waiting Period for AOD Products || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean select_Benefit_Duration_for_Self_as_under_AOD(String duration) throws Exception {

		try {
			log.debug("Selects Benefit Duration for Self under AOD");
			reuseMethod.dropDownselectbyvalue(BenDuration_Self_AOD, duration);
			log.info("Selects Benefit Duration for Self under AOD sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Benefit Duration for Self under AOD|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean select_Type_of_Coverage_as_for_spouse_ELI(String TypeofCove) throws Exception {

		try {
			log.debug("Select type of coverage for spouse Employee Life Insurance");
			if (!newCoverageSpouse_ELI.isDisplayed()) {
				EmployeeLifeInsuranceLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSpouse_ELI, changeCoverageSpouse_ELI, TypeofCove);

			log.info("Coverage type for spouse selected for Employee Life Insurance successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for spouse Employee Life Insurance|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean validates_under_ELI_the_Benefit_Slider_Range_as_to_Spouse(String Min, String Max) throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for Spouse under ELI Products");
			String MinAmt = minAmount_ELISpouse.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for Spouse underELI Product is validated");
			}
			String MaxAmt = maxAmount_ELISpouse.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for Spouse under ELI Product is validated");
			}
			log.info("Benefit Slider Ranges for Spouse under ELI Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Validate Benefit Slider Ranges for Spouse under ELI Products|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Spouse_as_under_ELI(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Spouse of Employee Life Insurance Products");
			if (nadaSpouseBenefitAmountELIr.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_ELIProduct, sBenefit,
						nadaSpouseBenefitAmountELIr, downArrow_Spouse_ELIProduct);
			} else {
				EmployeeLifeInsuranceLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_ELIProduct, sBenefit,
						nadaSpouseBenefitAmountELIr, downArrow_Spouse_ELIProduct);
			}
			log.info("Amount selected for Spouse of Employee Life Insurance Product sucessfully || Pass");
			return true;
		} catch (Exception e) {

			log.error("Not able to select the benefit Amount for Spouse of Employee Life Insurance Product|| Fail"
					+ e.getMessage());

			throw (e);
		}
	}

	public boolean selects_Optional_AD_D_Rider_Spouse_under_EmployeeLifeInsurance() throws Exception {

		try {
			log.debug("Validate AD & D Rider is selected for spouse for ELI");
			ELIProduct_ADDRider_ChkBox_Spouse.click();
			log.info("AD & D Rider for spouse for ELI is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select AD & D Rider for spouse for ELI || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_optional_AD_D_Rider_Benefit_Amount_Spouse_for_ELI(String amount) throws Exception {
		try {
			log.debug("Select Optional AD&D Rider Benefit amount for self for ELI");
			ELIProduct_ADDRider_BenefitAmount_Spouse.isDisplayed();
			reuseMethod.dropDown(ELIProduct_ADDRider_BenefitAmount_Spouse, amount);
			log.info("Optional AD&D Rider Benefit amount for self for ELI is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Optional AD&D Rider Benefit amount for self for ELI|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Child_as_under_ELI(String sBenefit) throws Exception {
		try {
			log.debug("Select Optional AD&D Rider Benefit amount for child for ELI");
			ELIProduct_ADDRider_BenefitAmount_Child.isDisplayed();
			reuseMethod.dropDownselectbyvalue(ELIProduct_ADDRider_BenefitAmount_Child, sBenefit);
			log.info("Optional AD&D Rider Benefit amount for child for ELI is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Optional AD&D Rider Benefit amount for child for ELI|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Optional_AD_D_Rider_Child_under_EmployeeLifeInsurance() throws Exception {

		try {
			log.debug("Validate AD & D Rider is selected for child for ELI");
			ELIProduct_ADDRider_ChkBox_Child.click();
			log.info("AD & D Rider for child for ELI is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select AD & D Rider for child for ELI || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_Type_of_Coverage_as_for_spouse_GTDLI(String TypeofCove) throws Exception {

		try {
			log.debug("Select type of coverage for spouse General Term Dealer Life Insurance");
			if (!newCoverageSpouse_GTDLI.isDisplayed()) {
				GTDLifeInsuranceLabel.click();
				Thread.sleep(1000);
			}
			newCoverageSpouse_GTDLI.click();

			log.info("Coverage type for spouse selected for General Term Dealer Life Insurance successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for spouse General Term Dealer Life Insurance|| Fail"
					+ e.getMessage());
			throw (e);

		}
	}

	public boolean verify_Coverage_Error_Message_in_Spouse_section_TwentyYrLI() throws Exception {
		try {
			log.debug("Error Message is displayed on selecting incorrect spouse coverage amount");
			String spouseCoverageError = PropertyUtility.Load_MessageFile_Data("SpouseExceedErrorMessage");

			reuseMethod.scrollDown(spouseTwentyYrLICoverageErrorMsg);
			spouseTwentyYrLICoverageErrorMsg.isDisplayed();
			String actualError = spouseTwentyYrLICoverageErrorMsg.getText();
			Assert.assertEquals(actualError, spouseCoverageError, "Error message does not match");
			log.info("Error Message is displayed on selecting incorrect spouse coverage amount sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Error Message is displayed on selecting incorrect spouse coverage amount || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean selects_multiply_base_Salary_self_GTLI(String benefitAmt) throws Exception {
		try {
			log.debug("Selects Benefit Amount for Self under GTLI");
			WebElement baseSalary = selfMultiplyBaseSalary_GTLIProduct
					.findElement(By.xpath(".//label[contains(text(),'" + benefitAmt + "')]"));
			reuseMethod.scrollDown(baseSalary);
			baseSalary.click();
			log.info("Selects Benefit Amount for Self under GTLI successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Benefit Amount for Self under GTLI || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Optional_AD_D_Rider_Self_under_TraditionalGroupTermLifeInsurance() throws Exception {

		try {
			log.debug("Validate AD & D Rider is selected for self for GTLI");
			GTLIProduct_ADDRider_ChkBox_Self.click();
			log.info("AD & D Rider for self for GTLI is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select AD & D Rider for self for GTLI || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_optional_AD_D_Rider_multiply_base_Salary_self_GTLI(String benefitAmt) throws Exception {
		try {
			log.debug("Selects optional AD&D Rider Benefit Amount for Self under GTLI");
			Thread.sleep(2000);
			WebElement baseSalary1 = selfOptionalMultiplyBaseSalary_GTLIProduct
					.findElement(By.xpath(".//label[contains(text(),'" + benefitAmt + "')]"));
			reuseMethod.scrollDown(baseSalary1);
			baseSalary1.click();
			log.info("Selects optional AD&D Rider Benefit Amount for Self under GTLI successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects optional AD&D Rider Benefit Amount for Self under GTLI || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Benefit_Amount_for_Spouse_as_under_GTLI(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Spousef of Traditional General Term Life Insurance Products");
			if (SpouseBenefitAmountGTLI.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_GTLIProduct, sBenefit, SpouseBenefitAmountGTLI,
						downArrow_Spouse_GTLIProduct);
			} else {
				TermLifeInsuranceLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_GTLIProduct, sBenefit, SpouseBenefitAmountGTLI,
						downArrow_Spouse_GTLIProduct);
			}
			log.info(
					"Amount selected for Spouse of Traditional General Term Life Insurance Product sucessfully || Pass");
			return true;
		} catch (Exception e) {

			log.error(
					"Not able to select the benefit Amount for Spouse of Traditional General Term Life Insurance Product|| Fail"
							+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Optional_AD_D_Rider_Spouse_under_TraditionalGroupTermLifeInsurance() throws Exception {

		try {
			log.debug("Validate AD & D Rider is selected for spouse for GTLI");
			GTLIProduct_ADDRider_ChkBox_Spouse.click();
			log.info("AD & D Rider for spouse for GTLI is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select AD & D Rider for spouse for GTLI || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_optional_AD_D_Rider_under_GTLI_Benefit_Amount_Spouse(String amount) throws Exception {
		try {
			log.debug("Select Optional AD&D Rider Benefit amount for spouse");
			MLIProduct_ADDRider_BenefitAmount_Spouse.isDisplayed();
			reuseMethod.dropDownselectbyvalue(MLIProduct_ADDRider_BenefitAmount_Spouse, amount);
			log.info("Optional AD&D Rider Benefit amount for spouse is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Optional AD&D Rider Benefit amount for spouse || Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Optional_ADD_Benefit_Amount_for_Spouse_as_under_GTLI(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Spousef of Traditional General Term Life Insurance Products");
			Thread.sleep(1000);
			if (nadagiSpouseOptionalADDBenefitAmountGTLI.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_OptionalADD_GTLIProduct, sBenefit,
						nadagiSpouseOptionalADDBenefitAmountGTLI, downArrow_Spouse_OptionalADD_GTLIProduct);
			} else {
				TermLifeInsuranceLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_OptionalADD_GTLIProduct, sBenefit,
						nadagiSpouseOptionalADDBenefitAmountGTLI, downArrow_Spouse_OptionalADD_GTLIProduct);
			}
			log.info(
					"Amount selected for Spouse of Traditional General Term Life Insurance Product sucessfully || Pass");
			return true;
		} catch (Exception e) {

			log.error(
					"Not able to select the benefit Amount for Spouse of Traditional General Term Life Insurance Product|| Fail"
							+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Child_as_under_GTLI(String amount) throws Exception {
		try {
			log.debug("Select Benefit amount for child under GTLI");
			ChildBenefitAmountGTLI.isDisplayed();
			reuseMethod.dropDownselectbyvalue(ChildBenefitAmountGTLI, amount);
			log.info("Benefit amount for child under GTLI is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Benefit amount for child under GTLI || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Optional_AD_D_Rider_Child_under_GeneralTermLifeInsurance() throws Exception {

		try {
			log.debug("Validate AD & D Rider is selected for child for GTLI");
			GTLIProduct_ADDRider_ChkBox_Child.click();
			log.info("AD & D Rider for child for GTLI is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select AD & D Rider for child for GTLI || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean verify_Coverage_Error_Message_in_Spouse_section_GTLI() throws Exception {
		try {
			log.debug("Error Message is displayed on selecting incorrect spouse coverage amount");
			String spouseCoverageError = PropertyUtility.Load_MessageFile_Data("SpouseExceedErrorMessage");

			reuseMethod.scrollDown(spouseGTLICoverageErrorMsg);
			spouseGTLICoverageErrorMsg.isDisplayed();
			String actualError = spouseGTLICoverageErrorMsg.getText();
			Assert.assertEquals(actualError, spouseCoverageError, "Error message does not match");
			log.info("Error Message is displayed on selecting incorrect spouse coverage amount sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Error Message is displayed on selecting incorrect spouse coverage amount || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	// Message is different
	public boolean verify_Spouse_cannot_exceed_Member_Error_Message_under_GTLI() throws Exception {
		try {
			log.debug("Error Message is displayed on selecting incorrect spouse coverage amount");
			String spouseCoverageError = PropertyUtility.Load_MessageFile_Data("SpouseExceedCoverageMessage");

			reuseMethod.scrollDown(SpouseCoverageExceedMsg);
			SpouseCoverageExceedMsg.isDisplayed();
			String actualError = SpouseCoverageExceedMsg.getText();
			Assert.assertEquals(actualError, spouseCoverageError, "Error message does not match");
			log.info("Error Message is displayed on selecting incorrect spouse coverage amount sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Error Message is displayed on selecting incorrect spouse coverage amount || Fail"+ e.getMessage());
			throw (e);
		}

	}

	public boolean Request_coverage_Health_Question_page_is_displayed_to_user() throws Exception {
		try {
			log.debug("Request Coverage health question page is displayed to user");
			RequestCoverageHealthQuestionPage.isDisplayed();
			log.info("Request Coverage health question page is displayed to user sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(" Not able to validated that Request Coverage health question page is displayed to user || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean validates_that_Request_Coverage_Health_Questions_page_is_Not_displayed_to_user() throws Exception {
		try {
			log.debug("Request Coverage health question page is displayed to user");
			RequestCoverageHealthQuestionPage.isDisplayed();
			// assertFalse(check, "Request Coverage health question page is displayed to
			// user");
			System.out.println("Request Coverage - Health Questions page is Not displayed to user");
			log.info("Request Coverage health question page is not displayed to user sucessfully || Pass");
			return true;
		} catch (NoSuchElementException e) {
			log.info("Request Coverage health question page is not displayed to user sucessfully || Pass");
			System.out.println("Request Coverage - Health Questions page is Not displayed to user");
			return false;
		}

	}

	public boolean verify_that_Health_Questions_are_rendered_for_Self() throws Exception {
		try {
			log.debug("Verify that Health Questions are rendered for Self");
			Question1_Self.isDisplayed();
			reuseMethod.scrollDown(Question1_Self);
			Question2_Self.isDisplayed();
			reuseMethod.scrollDown(Question2_Self);
			Question3_Self.isDisplayed();
			reuseMethod.scrollDown(Question3_Self);
			log.info("Health Questions are rendered for Self is displayed to user sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify that Health Questions are rendered for Self  || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean verify_that_Health_Questions_are_not_rendered_for_Self() throws Exception {
		try {
			log.debug("Verify that Health Questions are not rendered for Self");
			Boolean check;
			if (Question1_Self.isDisplayed() && Question2_Self.isDisplayed() && Question3_Self.isDisplayed()) {
				check = true;
			} else {
				check = false;
				assertFalse(check, " Health Questions are rendered for Self");
				System.out.println("Health Questions are not rendered for Self");
			}
			
			log.info("Health Questions are not  rendered for Self is displayed to user sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify that Health Questions are not  rendered for Self  || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean verify_that_Health_Questions_are_rendered_for_Spouse() throws Exception {
		try {
			log.debug("Verify that Health Questions are rendered for Spouse");
			Question1_Spouse.isDisplayed();
			reuseMethod.scrollDown(Question1_Spouse);
			Question2_Spouse.isDisplayed();
			reuseMethod.scrollDown(Question2_Spouse);
			Question3_Spouse.isDisplayed();
			reuseMethod.scrollDown(Question3_Spouse);
			log.info("Health Questions are rendered for Spouse is displayed to user sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify that Health Questions are rendered for Spouse  || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean verify_that_Health_Questions_are_not_rendered_for_Spouse() throws Exception {
		try {
			log.debug("Verify that Health Questions are not rendered for Spouse");
			Boolean check;
			if (Question1_Spouse.isDisplayed() && Question2_Spouse.isDisplayed() && Question3_Spouse.isDisplayed()) {
				check = true;
			} else {
				check = false;
				assertFalse(check, " Health Questions are rendered for Spouse");
				System.out.println("Health Questions are not rendered for Spouse");
			}
			
			log.info("Health Questions are not  rendered for Spouse is displayed to user sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify that Health Questions are not  rendered for Spouse  || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean Request_Coverage_Health_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_Yes_for_all_questions_for_Self()
			throws Exception {

		try {
			log.debug("Answer the questions of request coverage health question Page as Yes for self");
			Thread.sleep(2000);
			reuseMethod.scrollDown(prescribedMedicationSelf_Yes);
			prescribedMedicationSelf_Yes.click();
			Thread.sleep(2000);
			physicianSelf_Yes.click();
			Thread.sleep(2000);
			AlcoholSelf_Yes.click();
			Thread.sleep(2000);
			reuseMethod.scrollDown(EatingCookingSelf_Yes);
			EatingCookingSelf_Yes.click();
			Thread.sleep(2000);
			FamilySelf_Yes.click();
			log.info("Request coverage health question page answered as YES for self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer on Request coverage health question page as YES for self || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_Add_Details_FirstQuestion_Self() throws Exception {
		try {
			log.debug("Click on add details button for first question in self");
			reuseMethod.scrollDown(AddDetail_First_Self);
			reuseMethod.Clickbutton(AddDetail_First_Self);
			Thread.sleep(5000);
			log.info("Click on add details button for first question in self successfully || Pass");
			return true;

		} catch (Exception e) {
			log.error("Not able to click on add details button for first question in self || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean verify_explanation_page_displayed_And_User_Enters_Details(String mOnset, String YrOnset,
			String Condition, String physician) throws Exception {
		try {
			log.debug("Validate Explanation page is displayed and user enters details");
			ExplanationPage.isDisplayed();
			Thread.sleep(1000);
			reuseMethod.dropDown(MonthOfOnset, mOnset);
			Thread.sleep(1000);
			reuseMethod.dropDown(YearOfOnset, YrOnset);
			Thread.sleep(1000);
			ConditionsDetails.sendKeys(Condition);
			Thread.sleep(1000);
			Physician.sendKeys(physician);
			return true;
		} catch (Exception e) {
			log.error("Not able to view Explanation page and user unable to enter details || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean click_on_Add_Button() throws Exception {

		try {
			log.debug("click on Add Button");
			Thread.sleep(2000);
			AddButton.isDisplayed();
			AddButton.click();
			Thread.sleep(2000);
			log.info("Add button is clicked  successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Add Button || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean clicks_Add_Details_SecondQuestion_Self() throws Exception {
		try {
			log.debug("Click on add details button for second question in self");
			reuseMethod.scrollDown(AddDetail_Second_Self);
			reuseMethod.Clickbutton(AddDetail_Second_Self);
			Thread.sleep(5000);
			log.info("Click on add details button for second question in self successfully || Pass");
			return true;

		} catch (Exception e) {
			log.error("Not able to click on add details button for second question in self || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_Add_Details_ThirdQuestion_Self() throws Exception {
		try {
			log.debug("Click on add details button for third question in self");
			reuseMethod.scrollDown(AddDetail_Third_Self);
			reuseMethod.Clickbutton(AddDetail_Third_Self);
			Thread.sleep(5000);
			log.info("Click on add details button for third question in self successfully || Pass");
			return true;

		} catch (Exception e) {
			log.error("Not able to click on add details button for third question in self || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_Add_Details_FourthQuestion_Self() throws Exception {
		try {
			log.debug("Click on add details button for fourth question in self");
			reuseMethod.scrollDown(AddDetail_Fourth_Self);
			reuseMethod.Clickbutton(AddDetail_Fourth_Self);
			Thread.sleep(5000);
			log.info("Click on add details button for fourth question in self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click on add details button for fourth question in self || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_Add_Details_FifthQuestion_Self() throws Exception {
		try {
			log.debug("Click on add details button for fifth question in self");
			reuseMethod.scrollDown(AddDetail_Fifth_Self);
			reuseMethod.Clickbutton(AddDetail_Fifth_Self);
			Thread.sleep(5000);
			log.info("Click on add details button for fifth question in self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click on add details button for fifth question in self || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean Request_Coverage_Health_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_Yes_for_all_questions_for_Spouse()
			throws Exception {

		try {
			log.debug("Answer the questions of request coverage health question Page as Yes for spouse");
			Thread.sleep(1000);
			reuseMethod.scrollDown(prescribedMedicationSpouse_Yes);
			prescribedMedicationSpouse_Yes.click();
			Thread.sleep(1000);
			physicianSpouse_Yes.click();
			Thread.sleep(1000);
			AlcoholSpouse_Yes.click();
			Thread.sleep(1000);
			reuseMethod.scrollDown(EatingCookingSpouse_Yes);
			EatingCookingSpouse_Yes.click();
			FamilySpouse_Yes.click();
			log.info("Request coverage health question page answered as YES for spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer on Request coverage health question page as YES for spouse || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_Add_Details_FirstQuestion_Spouse() throws Exception {
		try {
			log.debug("Click on add details button for first question in spouse");
			reuseMethod.scrollDown(AddDetail_First_Spouse);
			reuseMethod.Clickbutton(AddDetail_First_Spouse);
			Thread.sleep(5000);
			log.info("Click on add details button for first question in spouse successfully || Pass");
			return true;

		} catch (Exception e) {
			log.error("Not able to click on add details button for first question in spouse || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_Add_Details_SecondQuestion_Spouse() throws Exception {
		try {
			log.debug("Click on add details button for second question in spouse");
			reuseMethod.scrollDown(AddDetail_Second_Spouse);
			reuseMethod.Clickbutton(AddDetail_Second_Spouse);
			Thread.sleep(5000);
			log.info("Click on add details button for second question in spouse successfully || Pass");
			return true;

		} catch (Exception e) {
			log.error("Not able to click on add details button for second question in spouse || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_Add_Details_ThirdQuestion_Spouse() throws Exception {
		try {
			log.debug("Click on add details button for third question in spouse");
			reuseMethod.scrollDown(AddDetail_Third_Spouse);
			reuseMethod.Clickbutton(AddDetail_Third_Spouse);
			Thread.sleep(5000);
			log.info("Click on add details button for third question in spouse successfully || Pass");
			return true;

		} catch (Exception e) {
			log.error("Not able to click on add details button for third question in spouse || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_Add_Details_FourthQuestion_Spouse() throws Exception {
		try {
			log.debug("Click on add details button for fourth question in spouse");
			reuseMethod.scrollDown(AddDetail_Fourth_Spouse);
			reuseMethod.Clickbutton(AddDetail_Fourth_Spouse);
			Thread.sleep(5000);
			log.info("Click on add details button for fourth question in spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click on add details button for fourth question in spouse || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_Add_Details_FifthQuestion_Spouse() throws Exception {
		try {
			log.debug("Click on add details button for fifth question in spouse");
			reuseMethod.scrollDown(AddDetail_Fifth_Spouse);
			reuseMethod.Clickbutton(AddDetail_Fifth_Spouse);
			Thread.sleep(5000);
			log.info("Click on add details button for fifth question in spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click on add details button for fifth question in spouse || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean Request_Coverage_Health_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_No_for_all_questions_for_Self()
			throws Exception {

		try {
			log.debug("Answer the questions of request coverage health question Page as No for self");
			Thread.sleep(2000);
			reuseMethod.scrollDown(prescribedMedicationSelf_No);
			prescribedMedicationSelf_No.click();
			physicianSelf_No.click();
			AlcoholSelf_No.click();
			reuseMethod.scrollDown(EatingCookingSelf_No);
			EatingCookingSelf_No.click();
			FamilySelf_No.click();
			log.info("Request coverage health question page answered as NO for self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer on Request coverage health question page as NO for self || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	
	public boolean Request_Coverage_Health_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_No_for_all_questions_for_Self_wihtout_Cooking_family()
			throws Exception {

		try {
			log.debug("Answer the questions of request coverage health question Page as No for self");
			Thread.sleep(3000);
			reuseMethod.scrollDown(prescribedMedicationSelf_No_cat);
			
			prescribedMedicationSelf_No_cat.click();
			Thread.sleep(1500);
			physicianSelf_No.click();
			Thread.sleep(1000);
			physicianSelf_No.click(); //clicking again for safer side
			Thread.sleep(1500);
			AlcoholSelf_No.click();
			
			log.info("Request coverage health question page answered as NO for self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer on Request coverage health question page as NO for self || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	
	
	public boolean validate_Multiplier_Benefit_Amount_Self_GTLI() throws Exception {
		try {
			log.debug(
					"Verify the benefit amount for Self under GTLI is in Multiplier: 1x, 2x, 3x, 4x, 5x, 6x of Base Salary");
			for (int i = 1; i <= 6; i++) {
				WebElement baseSalary = selfMultiplyBaseSalary_GTLIProduct
						.findElement(By.xpath(".//label[contains(text(),'" + i + "X')]"));
				baseSalary.isDisplayed();
				log.info(
						"The benefit amount for Self under GTLI is in Multiplier: 1x, 2x, 3x, 4x, 5x, 6x of Base Salary validated successfully || Pass");
			}
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to verify the benefit amount for Self under GTLI is in Multiplier: 1x, 2x, 3x, 4x, 5x, 6x of Base Salary || Fail"
							+ e.getMessage());
			throw (e);
		}
	}

	public boolean validate_Multiplier_Rider_Benefit_Amount_Self_GTLI() throws Exception {
		try {
			log.debug(
					"Verify the benefit amount of rider for Self under GTLI is in Multiplier: 1x, 2x, 3x, 4x, 5x of Base Salary");
			for (int i = 1; i <= 5; i++) {
				WebElement baseSalary = selfOptionalMultiplyBaseSalary_GTLIProduct
						.findElement(By.xpath(".//label[contains(text(),'" + i + "X')]"));
				baseSalary.isDisplayed();
				log.info(
						"Verify the benefit amount of rider for Self under GTLI is in Multiplier: 1x, 2x, 3x, 4x, 5x of Base Salary validated successfully || Pass");
			}
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to verify the benefit amount of rider for Self under GTLI is in Multiplier: 1x, 2x, 3x, 4x, 5x of Base Salary || Fail"
							+ e.getMessage());
			throw (e);
		}
	}

	public boolean Request_Coverage_Health_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_No_for_all_questions_for_Spouse()
			throws Exception {

		try {
			log.debug("Answer the questions of request coverage health question Page as No for spouse");
			Thread.sleep(2000);
			reuseMethod.scrollDown(prescribedMedicationSpouse_No);
			prescribedMedicationSpouse_No.click();
			physicianSpouse_No.click();
			AlcoholSpouse_No.click();
			reuseMethod.scrollDown(EatingCookingSpouse_No);
			EatingCookingSpouse_No.click();
			FamilySpouse_No.click();
			log.info("Request coverage health question page answered as NO for spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer on Request coverage health question page as NO for spouse || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_under_GTLI_the_Benefit_Slider_Range_as_to_Spouse(String Min, String Max) throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for GTLI Products");
			String MinAmt = minAmount_GTLISpouse.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for GTLI Product is validated");
			}
			String MaxAmt = maxAmount_GTLISpouse.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for GTLI Product is validated");
			}
			log.info("Benefit Slider Ranges for GTLI Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for GTLI Products|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_Type_of_Coverage_as_for_Spouse_under_AOD(String typeOfCov) throws Exception {

		try {
			log.debug("Select type of coverage for Spouse AOD");
			if (!newCoverageSpouse_AOD.isDisplayed()) {
				AODInsuranceLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSpouse_AOD, changeCoverageSpouse_AOD, typeOfCov);

			log.info("Coverage type for Spouse for AOD selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for Spouse for AOD || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean validates_under_AOD_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for AOD Products for Spouse");
			String MinAmt = MinBenAmnt_Slider_Spouse_AOD.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for AOD is validated");
			}
			String MaxAmt = MaxBenAmnt_Slider_Spouse_AOD.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for AOD Product is validated");
			}
			log.info("Benefit Slider Ranges for AOD Products for Spouse are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for AOD Products for Spouse|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Duration_for_Spouse_as_under_AOD(String duration) throws Exception {

		try {
			log.debug("Selects Benefit Duration for Spouse under AOD");
			reuseMethod.dropDownselectbyvalue(benDuration_Spouse_AOD, duration);
			log.info("Selects Benefit Duration for Spouse under AOD sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Benefit Duration for Spouse under AOD|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Wait_Period_for_Spouse_as_under_AOD_from_dropdown(String wPeriod) throws Throwable {
		try {
			log.debug("Validates Wait Period for Spouse as under AOD");
			List<WebElement> waitPeriod = reuseMethod.dropDowngetOption(waitPeriod_Spouse_AOD);
			String expectedPeriod = wPeriod.trim();
			for (WebElement e : waitPeriod) {
				String actualPeriod = e.getText().trim();
				if (!actualPeriod.equalsIgnoreCase("Select")) {
					if (actualPeriod.equalsIgnoreCase(expectedPeriod))
						System.out.println("Wait Period for Spouse matched under AOD");
				}
			}
			log.info("Validated Wait Period for Spouse as under AOD sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Wait Period for Spouse as under AOD|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Waiting_Period_for_Spouse_as_under_AOD(String WaitingPeriod) throws Exception {

		try {
			log.debug("Select Waiting Period for AOD Products for Spouse");
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(waitPeriod_Spouse_AOD, WaitingPeriod);
			log.info("Waiting Period for AOD Products for Spouse is selected sucessfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select Waiting Period for AOD Products for Spouse|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Benefit_Amount_for_Spouse_as_under_AOD(String Benefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Spouse of AOD Products");
			if (!benefitAmnt_Slider_Spouse_AOD.isDisplayed()) {
				AODInsuranceLabel.click();
			}
			Thread.sleep(2000);
			reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_AODProduct, Benefit, benefitAmnt_Slider_Spouse_AOD,
					downArrow_Spouse_AODProduct);

			log.info("Amount selected for Spouse of AOD Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Spouse of AOD Product|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean validates_Wait_Period_for_Self_as_under_DIP_or_DII_from_dropdown(String wPeriod) throws Throwable {
		try {
			log.debug("Validates Wait Period for Self as under DII or DIP");
			List<WebElement> waitPeriod = reuseMethod.dropDowngetOption(DII_nd_DIP_WaitingPeriod_Self);
			String expectedPeriod = wPeriod.trim();
			for (WebElement e : waitPeriod) {
				String actualPeriod = e.getText().trim();
				if (!actualPeriod.equalsIgnoreCase("Select")) {
					if (actualPeriod.equalsIgnoreCase(expectedPeriod))
						System.out.println("Wait Period for Self matched under DII or DIP");
				}
			}
			log.info("Validated Wait Period for Self as under DII or DIP sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Wait Period for Self as under DII or DIP|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_benefit_Duration_for_Self_as_under_DIP_or_DII_from_dropdown(String bDuration)
			throws Throwable {
		try {
			log.debug("Validates Benefit Duration for Self as under DII or DIP");
			List<WebElement> benefitDuration = reuseMethod.dropDowngetOption(benefitDuration_Self_DII_nd_DIP);
			String expectedPeriod = bDuration.trim();
			for (WebElement e : benefitDuration) {
				String actualPeriod = e.getText().trim();
				if (!actualPeriod.equalsIgnoreCase("Select")) {
					if (actualPeriod.equalsIgnoreCase(expectedPeriod))
						System.out.println("Benefit Duration for Self matched under DII or DIP");
				}
			}
			log.info("Validated Benefit Duration for Self as under DII or DIP sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Benefit Duration for Self as under DII or DIP|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean select_benefit_Duration_for_Self_as_under_DIP_or_DII_from_dropdown(String bDuration)
			throws Throwable {
		try {
			log.debug("Select Benefit Duration for Self as under DII or DIP");
			Thread.sleep(1000);
			reuseMethod.dropDown_select_byPartialText(benefitDuration_Self_DII_nd_DIP, bDuration);

			log.info("Selected Benefit Duration for Self as under DII or DIP sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Benefit Duration for Self as under DII or DIP|| Fail" + e.getMessage());
			throw (e);
		}
	}

	// NSPE - DII locater is different from other DII product
	public boolean NSPE_select_benefit_Duration_for_Self_as_under_DII_from_dropdown(String bDuration) throws Throwable {
		try {
			log.debug("Select Benefit Duration for Self as under DII");
			Thread.sleep(1000);
			reuseMethod.dropDown_select_byPartialText(longBenefitDurationSelf_Mobile, bDuration);

			log.info("Selected Benefit Duration for Self as under DII sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Benefit Duration for Self as under DII || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean NSPE_select_Waiting_Period_for_Self_as_under_DII_from_dropdown(String WaitingPeriod)
			throws Throwable {
		try {
			log.debug("Select Waiting Period for Self as under DII");
			Thread.sleep(1000);
			reuseMethod.dropDown_select_byPartialText(longWaitingPeriodSelf_Mobile, WaitingPeriod);

			log.info("Selected Waiting Period for Self as under DII sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Waiting Period for Self as under DII || Fail" + e.getMessage());
			throw (e);
		}
	}

	// ****************

	public boolean selects_Accidental_Death_and_Dismemberment_checkbox_for_Self_under_DIP() throws Throwable {

		try {
			log.debug("Select Accidental Death and Dismemberment checkbox for Self unde DII or DIP");
			Thread.sleep(1000);

			if (!ADDRider_Checkbox_DIP.isDisplayed()) {
				DisabilityIncomeInsuranceLabel.click();

			}
			ADDRider_Checkbox_DIP.click();
			Thread.sleep(1000);
			log.info(
					"Selected Accidental Death and Dismemberment checkbox for Self under DII or DIP sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Accidental Death and Dismemberment checkbox for Self under DII or DIP|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_for_ADND_under_DIP_the_Benefit_Slider_Range_as_to_for_Self(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges of Self for ADND Rider under DII or DIP Products");
			String MinAmt = ADDRiderSelf_Slider_MinAmnt_DIP.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for Self for ADND Rider under DII or DIP Product is validated");
			}
			String MaxAmt = ADDRiderSelf_Slider_MaxAmnt_DIP.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for Self of DII or DIP is validated");
			}
			log.info(
					"Benefit Slider Ranges for Self for ADND Rider under DII or DIP Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for Self for ADND Rider under DII or DIP || Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Benefit_Amount_for_Self_as_under_ADND_under_DIP(String Benefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Self for ADND under DIP");
			if (!ADDRiderSelf_Amnt_DIP.isDisplayed()) {
				DisabilityIncomeInsuranceLabel.click();
			}
			Thread.sleep(2000);
			reuseMethod.select_Benefit_Amount_slider(upArrow_Self_ADDRider, Benefit, ADDRiderSelf_Amnt_DIP,
					downArrow_Self_ADDRider);

			log.info("Amount selected for Self for ADND under DIP sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Self for ADND under DIP Product|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Recovery_Option_checkbox_for_Self_under_DIP() throws Throwable {

		try {
			log.debug("Select Recovery Option checkbox for Self unde DII or DIP");
			Thread.sleep(1000);

			if (!RecoveryRider_Checkbox_DIP.isDisplayed()) {
				DisabilityIncomeInsuranceLabel.click();
			}
			RecoveryRider_Checkbox_DIP.click();
			Thread.sleep(1000);
			log.info("Selected Recovery Option checkbox for Self under DII or DIP sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Recovery Option checkbox for Self under DII or DIP|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Residual_Disability_Benefit_checkbox_for_Self_under_DIP() throws Throwable {

		try {
			log.debug("Select Residual Disability Benefit checkbox for Self unde DII or DIP");
			Thread.sleep(1000);
			if (!ResidualDIBen_Checkbox_DIP.isDisplayed()) {
				DisabilityIncomeInsuranceLabel.click();
			}
			ResidualDIBen_Checkbox_DIP.click();
			Thread.sleep(1000);
			log.info("Selected Residual Disability Benefit checkbox for Self under DII or DIP sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Residual Disability Benefit checkbox for Self under DII or DIP|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Cost_of_Living_Adjustment_Benefit_checkbox_for_Self_under_DIP() throws Throwable {

		try {
			log.debug("Select Cost of Living Adjustment Benefit checkbox for Self unde DII or DIP");
			Thread.sleep(1000);
			if (!COLA_Checkbox_DIP.isDisplayed()) {
				DisabilityIncomeInsuranceLabel.click();

			}
			COLA_Checkbox_DIP.click();
			Thread.sleep(1000);
			log.info(
					"Selected Cost of Living Adjustment Benefit checkbox for Self under DII or DIP sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Cost of Living Adjustment Benefit checkbox for Self under DII or DIP|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Hospital_Indemnity_Protection_checkbox_for_Self_under_DIP() throws Throwable {

		try {
			log.debug("Select Hospital Indemnity Protection checkbox for Self unde DII or DIP");
			Thread.sleep(1000);
			if (!HIP_Checkbox_DIP.isDisplayed()) {
				DisabilityIncomeInsuranceLabel.click();
			}

			HIP_Checkbox_DIP.click();
			Thread.sleep(1000);
			log.info("Selected Hospital Indemnity Protection checkbox for Self under DII or DIP sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Hospital Indemnity Protection checkbox for Self under DII or DIP|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validate_amount_for_Hospital_Indemnity_Protection_for_Self_as_from_dropdown_under_DIP(String amount)
			throws Throwable {
		try {
			log.debug("Validates values for Hospital Indemnity Protection for Self under DII or DIP from dropdown");
			List<WebElement> benefitDuration = reuseMethod.dropDowngetOption(HIP_Selfamnt_DIP);
			String expectedPeriod = amount.trim();
			for (WebElement e : benefitDuration) {
				String actualPeriod = e.getText().trim();
				if (!actualPeriod.equalsIgnoreCase("Select")) {
					if (actualPeriod.equalsIgnoreCase(expectedPeriod))
						System.out.println(
								"Values for Hospital Indemnity Protection for Self under DII or DIP from dropdown matched");
				}
			}
			log.info(
					"Validated values for Hospital Indemnity Protection for Self under DII or DIP from dropdown sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate values for Hospital Indemnity Protection for Self under DII or DIP from dropdown|| Fail"
							+ e.getMessage());
			throw (e);
		}
	}

	public boolean select_amount_for_Hospital_Indemnity_Protection_for_Self_as_under_DIP(String amount)
			throws Throwable {
		try {
			log.debug("Select amount for Hospital Indemnity Protection for Self as under DII or DIP");
			reuseMethod.dropDownselectbyvalue(HIP_Selfamnt_DIP, amount);

			log.info(
					"Selected amount for Hospital Indemnity Protection for Self as under DII or DIP from dropdown sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select amount for Hospital Indemnity Protection for Self as under DII or DIP from dropdown|| Fail"
							+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_dropdown_values_for_Wait_Period_for_Self_as_under_BOE_POEDI_PO(String wPeriod)
			throws Throwable {
		try {
			log.debug("Validates Wait Period for Self as under SDI");
			List<WebElement> waitPeriod = reuseMethod.dropDowngetOption(PracticeOverhead_WaitingPeriod_Self);
			String expectedPeriod = wPeriod.trim();
			for (WebElement e : waitPeriod) {
				String actualPeriod = e.getText().trim();
				if (!actualPeriod.equalsIgnoreCase("Select")) {
					if (actualPeriod.equalsIgnoreCase(expectedPeriod))
						System.out.println("Wait Period for Self matched under POEDI/BOE/OOEDI");
				}
			}
			log.info("Validated Wait Period for Self as under POEDI/BOE/OOEDI sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Wait Period for Self as under POEDI/BOE/OOEDI|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_Benefit_Duration_values_for_Self_as_under_BOE_from_dropdown(String amount)
			throws Throwable {
		try {
			log.debug("Validates Benefit Duration values for Self under BOE from dropdown");
			List<WebElement> benefitDuration = reuseMethod.dropDowngetOption(BeneDuration_OOEDI_BOE_Self);
			String expectedPeriod = amount.trim();
			for (WebElement e : benefitDuration) {
				String actualPeriod = e.getText().trim();
				if (!actualPeriod.equalsIgnoreCase("Select")) {
					if (actualPeriod.equalsIgnoreCase(expectedPeriod))
						System.out
								.println("Values for Benefit Duration values for Self under BOE from dropdown matched");
				}
			}
			log.info("Validated Benefit Duration values for Self under BOE from dropdown sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Benefit Duration values for Self under BOE from dropdown|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Benefit_Duration_for_Self_as_under_BOE(String duration) throws Throwable {
		try {
			log.debug("Selects Benefit Duration for Self under BOE from dropdown");
			Thread.sleep(1000);
			reuseMethod.dropDown_select_byPartialText(BeneDuration_OOEDI_BOE_Self, duration);

			log.info("Selected Benefit Duration for Self from dropdown sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Benefit Duration for Self under BOE from dropdown|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Recovery_Option_checkbox_for_Self_under_BOE() throws Throwable {

		try {
			log.debug("Select Recovery Option checkbox for Self unde BOE");
			Thread.sleep(1000);
			if (!Recovery_chkbox_under_BOE_Self.isDisplayed()) {
				ProfessionalExpenseDisabilityLabel.click();
			}
			Recovery_chkbox_under_BOE_Self.click();
			Thread.sleep(1000);
			log.info("Selected Recovery Option checkbox for Self under BOE sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Recovery Option checkbox for Self under BOE|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Retroactive_checkbox_for_Self_under_BOE() throws Throwable {

		try {
			log.debug("Select Retroactive checkbox for Self unde BOE");
			Thread.sleep(1000);
			if (!Retroactive_chkbox_under_BOE_Self.isDisplayed()) {
				ProfessionalExpenseDisabilityLabel.click();
			}
			Retroactive_chkbox_under_BOE_Self.click();
			Thread.sleep(1000);
			log.info("Selected Retroactive checkbox for Self under BOE sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Retroactive checkbox for Self under BOE|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Guaranteed_Purchase_Option_checkbox_for_Self_under_BOE() throws Throwable {

		try {
			log.debug("Select Guaranteed Purchase Option checkbox for Self unde BOE");
			Thread.sleep(1000);
			if (!GPO_chkbox_under_BOE_Self.isDisplayed()) {
				ProfessionalExpenseDisabilityLabel.click();
			}
			GPO_chkbox_under_BOE_Self.click();
			Thread.sleep(1000);
			log.info("Selected Guaranteed Purchase Option checkbox for Self under BOE sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Guaranteed Purchase Option checkbox for Self under BOE|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean select_Type_of_Coverage_as_for_self_GADD(String TypeofCov_GADD) throws Exception {

		try {
			log.debug("Select type of coverage for Self GADD");
			if (!newCoverageSelf_GADD.isDisplayed()) {
				GroupAccidentalDeathDismembermentLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSelf_GADD, changeCoverageSelf_GADD, TypeofCov_GADD);

			log.info("Coverage type for self for GADD selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for self for GADD || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean select_Type_of_Coverage_as_for_self_FirstToDie(String TypeofCov_FirstToDie) throws Exception {

		try {
			log.debug("Select type of coverage for FirstToDie");
			if (!newCoverage_FirstToDie_SelfSpouse.isDisplayed()) {
				FirstToDie_Label.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverage_FirstToDie_SelfSpouse, ChangeInCoverage_FirstToDie_SelfSpouse, TypeofCov_FirstToDie);

			log.info("Coverage type for FirstToDie selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for FirstToDie || Fail" + e.getMessage());
			throw (e);

		}

	}
	
	public boolean selects_Self_benefit_amount_of_for_Group_Accidental_Death_and_Dismemberment_as(String Benefit)
			throws Exception {

		try {

			log.debug("Select Benefit Amount for Self of Group Accidental Death and Dismemberment Products");
			if (sassSelfBenefitAmountGADDProduct.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_GADDProduct, Benefit,
						sassSelfBenefitAmountGADDProduct, downArrow_Self_GADDProduct);
			} else {
				GroupAccidentalDeathDismembermentLabel.click();
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_GADDProduct, Benefit,
						sassSelfBenefitAmountGADDProduct, downArrow_Self_GADDProduct);
			}
			log.info(
					"Amount selected for Self of Group Accidental Death and Dismemberment Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Self of Accidental Death Product || Fail"
					+ e.getMessage());
			throw (e);
		}

	}
	
	public boolean selects_Self_benefit_amount_for_FirstToDie_as(String Benefit)
			throws Exception {

		try {

			log.debug("Select Benefit Amount for FirstToDie Products");
			if (FirstToDie_BenefitAmount_SelfSpouse.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_FirstToDie_Self, Benefit,
						FirstToDie_BenefitAmount_SelfSpouse, downArrow_FirstToDie_Self);
			} else {
				FirstToDie_Label.click();
				reuseMethod.select_Benefit_Amount_slider(upArrow_FirstToDie_Self, Benefit,
						FirstToDie_BenefitAmount_SelfSpouse, downArrow_FirstToDie_Self);
			}
			log.info(
					"Amount selected for FirstToDie Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for FirstToDie Product || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean validates_under_GADD_the_Benefit_Slider_Range_for_Self_as_to(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for GADD Products");
			if (!minAmount_GADDSelf.isDisplayed()) {
				GroupAccidentalDeathDismembermentLabel.click();
				Thread.sleep(1000);
			}
			String MinAmt = minAmount_GADDSelf.getText();
			System.out.println("Actual Min Amount Self:" + MinAmt);
			
			if(MinAmt.contains("$")){
				MinAmt=MinAmt.substring(1);
			}
			MinAmt.replaceAll(",","");
			MinAmt.trim();
			if(Min.contains("$")){
				Min=Min.substring(1);
			}
			Min.replaceAll(",","");
			Min.trim();
			
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for GADD Product is validated");
			}
			String MaxAmt = maxAmount_GADDSelf.getText();
			System.out.println("Actual Max Amount Self:" + MaxAmt);
			
			if(MaxAmt.contains("$")){
				MaxAmt=MaxAmt.substring(1);
			}
			MaxAmt.replaceAll(",","");
			MaxAmt.trim();
			if(Max.contains("$")){
				Max=Max.substring(1);
			}
			Max.replaceAll(",","");
			Max.trim();

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for GADD Product for self is validated");
			}
			log.info("Benefit Slider Ranges for GADD Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {

			log.error("Not able to Validate Benefit Slider Ranges for GADD Self Products|| Fail" + e.getMessage());

			log.error("Not able to Validate Benefit Slider Ranges for GADD Self Products|| Fail" + e.getMessage());

			throw (e);
		}
	}
	
	public boolean validates_under_FirstToDie_the_Benefit_Slider_Range_for_Self_as_to(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for FirstToDie Products");
			if (!FirstToDie_Min_SelfSpouse.isDisplayed()) {
				FirstToDie_Label.click();
				Thread.sleep(1000);
			}
			String MinAmt = FirstToDie_Min_SelfSpouse.getText();
			System.out.println("Actual Min Amount Self:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for FirstToDie Product is validated");
			}
			String MaxAmt = FirstToDie_Max_SelfSpouse.getText();
			System.out.println("Actual Max Amount Self:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for FirstToDie Product for self is validated");
			}
			log.info("Benefit Slider Ranges for FirstToDie Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {

			log.error("Not able to Validate Benefit Slider Ranges for FirstToDie Self Products|| Fail" + e.getMessage());

			throw (e);
		}
	}
	
	

	public boolean select_Type_of_Coverage_as_for_spouse_GADD(String TypeofCov_GADD) throws Exception {

		try {
			log.debug("Select type of coverage for Spouse GADD");
			if (!newCoverageSpouse_GADD.isDisplayed()) {
				GroupAccidentalDeathDismembermentLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSpouse_GADD, changeCoverageSpouse_GADD, TypeofCov_GADD);

			log.info("Coverage type for spouse for GADD selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for spouse for GADD || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean selects_Benefit_Amount_Spouse_GADD(String amount) throws Exception {
		try {
			log.debug("Select Benefit amount for spouse under GADD");
			BenefitAmount_Spouse_GADDProduct.isDisplayed();
			reuseMethod.dropDown(BenefitAmount_Spouse_GADDProduct, amount);
			log.info("Benefit amount for spouse is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Benefit amount for spouse || Fail" + e.getMessage());

			throw (e);
		}
	}
	
	
	public boolean selects_Benefit_Amount_for_Spouse_as_under_HLAI(String Benefit)
			throws Exception {

		try {

			log.debug("Select Benefit Amount for Spouse of HLAI Products");
			Thread.sleep(1000);
			if (GroupAccidentalDeathDismembermentLabel.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(HLAI_UpArrow_Spouse, Benefit,
						HLAI_BenefitAmount_Spouse, HLAI_DownArrow_Spouse);
			} else {
				GroupAccidentalDeathDismembermentLabel.click();
				reuseMethod.select_Benefit_Amount_slider(HLAI_UpArrow_Spouse, Benefit,
						HLAI_BenefitAmount_Spouse, HLAI_DownArrow_Spouse);
			}
			log.info("Amount selected for Spouse of HLAI Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Spouse of HLAI Product || Fail"
					+ e.getMessage());
			throw (e);
		}

	}
	
	

	public boolean selects_benefit_amount_for_GADD_Product_Self_as(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Self of GADD Products");
			if (SpouseBenefitAmount10Yr.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_TenYrProduct, sBenefit, SpouseBenefitAmount10Yr,
						downArrow_Spouse_TenYrProduct);
			} else {
				TenYrLifeTermInsuranceLabel.click();
				Thread.sleep(3000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_TenYrProduct, sBenefit, SpouseBenefitAmount10Yr,
						downArrow_Spouse_TenYrProduct);
			}

			log.info("Amount selected for Self of GADD Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Self of GADD Product|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_under_GADD_the_Benefit_Option_Listed_Spouse_are(String option) throws Exception {

		try {
			log.debug("Validate GADD Benefit Option for Spouse dropdown");

			List<WebElement> benefitOption = reuseMethod.dropDowngetOption(BenefitAmount_Spouse_GADDProduct);
			for (WebElement we : benefitOption) {
				if (we.getText().equals(option)) {
					System.out.println("Value for GADD Benefit Option Dropdown list is matched..." + we.getText());

				}

			}

			log.info(
					"Dropdown values for  GADD Benefit Option Spouse Benefit dropdown Values are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate Dropdown values for GADD Benefit Option Spouse Benefit dropdown Values|| Fail"
							+ e.getMessage());

			throw (e);
		}
	}
	
	public boolean validates_Benefit_Amount_for_Child_as_under_HLAI_displayed_in_label(String cBenefit) throws Exception {

		try {
			log.debug("Validate Benefit Amount for Child under HLAI");
			//String expected = cBenefit.replaceAll(",", "");
			//String expectedAmnt = expected.replaceAll("$", "");

			String actualvalue = HLAI_BenefitAmt_Label_Child.getAttribute("value");
			if (cBenefit.contains("$")) {
				cBenefit = cBenefit.substring(1);
			}
			cBenefit = cBenefit.replaceAll(",", "");
			cBenefit.trim();
			
			if (actualvalue.contains("$")) {
				actualvalue = actualvalue.substring(1);
			}
			actualvalue = actualvalue.replaceAll(",", "");
			actualvalue.trim();
			
			Assert.assertEquals(actualvalue, cBenefit, "Benefit Amount for Child does not match");

			log.info("Validated Benefit Amount for Child under HLAI sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Benefit Amount for Child under HLAI || Fail" + e.getMessage());
			throw (e);
		}

	}
	
	
	public boolean validates_under_HLAI_the_Benefit_Slider_Range_for_Spouse_as_to(String Min, String Max)
			throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for HLAI Products");
			if (!HLAI_MinAmt_Spouse.isDisplayed()) {
				GroupAccidentalDeathDismembermentLabel.click();
				Thread.sleep(1000);
			}

			String MinAmt = HLAI_MinAmt_Spouse.getText();
			System.out.println("Actual Min Amount Spouse:" + MinAmt);
			if(MinAmt.contains("$")){
				MinAmt=MinAmt.substring(1);
			}
			MinAmt.replaceAll(",","");
			MinAmt.trim();
			if(Min.contains("$")){
				Min=Min.substring(1);
			}
			Min.replaceAll(",","");
			Min.trim();
			
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for HLAI Product is validated");
			}
			
			
			String MaxAmt = HLAI_MaxAmt_Spouse.getText();
			System.out.println("Actual Max Amount Self:" + MaxAmt);
			if(MaxAmt.contains("$")){
				MaxAmt=MaxAmt.substring(1);
			}	
			MaxAmt.replaceAll(",","");
			MaxAmt.trim();
			
			if(Max.contains("$")){
				Max=Max.substring(1);
			}
			Max.replaceAll(",","");
			Max.trim();
			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for HLAI Product is validated");
			}

			log.info("Benefit Slider Ranges for HLAI Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for HLAI Products|| Fail" + e.getMessage());
			throw (e);
		}

	}
	
	public boolean selects_Type_of_Coverage_as_for_Self_under_GDI(String TypeofCov) throws Throwable {
		try {
			log.debug("Select type of coverage for self GDI");
			if (!newCoverageSelf_GDI.isDisplayed()) {
				DisabilityIncomeInsuranceLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSelf_GDI, changeCoverageSelf_GDI, TypeofCov);

			log.info("Coverage type for self selected for GDI successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for self GDI|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean validates_under_GDI_the_Benefit_Slider_Range_for_Self(String Min, String Max) throws Exception {

		try {
			log.debug("Validate Benefit Slider Ranges for self for GDI Product");
			String MinAmt = MinAmount_GDISelf.getText();
			System.out.println("Actual Min Amount Self:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for self for GDI is validated");
			}
			String MaxAmt = MaxAmount_GDISelf.getText();
			System.out.println("Actual Max Amount self:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for self for GDI is validated");
			}
			log.info("Benefit Slider Ranges for self for GDI are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for GDI for self|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Partial_Disability_Benefit_Self_under_GDI() throws Exception {
		try {
			log.debug("Select the checkbox of Partial disability benefit");
			System.out.println("Select the checkbox of Partial disability benefit");
			if (!chkPartialDisabilityBenefit.isSelected()) {
				log.info("Checkbox is not selected");
				chkPartialDisabilityBenefit.click();
			} else {
				log.info("Checkbox is selected");
			}

			log.info("Checkbox of Imp Replacement Info is selected Successfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the checkbox of Imp Replacement Info  || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_under_AAFP_DII_the_Benefit_Option_Listed_are(String option) throws Exception {

		try {
			log.debug("Validate AAFP DII Benefit Option for Self dropdown");

			List<WebElement> benefitOption = reuseMethod.dropDowngetOption(BenefitOptionDII_Self_AAFP);
			for (WebElement we : benefitOption) {
				if (we.getText().equals(option)) {
					System.out.println("Value for AAFP DII Benefit Option Dropdown list is matched..." + we.getText());

				}

			}
			log.info(
					"Dropdown values for AAFP DII Benefit Option Self Benefit dropdown Values are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Dropdown values for DII Benefit Option Self Benefit dropdown Values|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean verify_Benefit_duration_value_displayed_Mobile(String GDIduration) throws Exception {
		try {

			log.debug("verify that Benefit duration as (Mobile Site)");

			reuseMethod.scrollDown(longTermArrowSelf_Mobile);
			Thread.sleep(1000);

			String duration = longBenefitDurationSelf_Mobile.getAttribute("value");

			Assert.assertEquals(duration, GDIduration, "Duration value does not match");

			log.info("Verify that Benefit duration as (Mobile Site) || Pass");
		} catch (Exception e) {
			log.error("Verify that Benefit duration as (Mobile Site) Fail" + e.getMessage());
			throw (e);
		}
		return true;
	}

	public boolean validate_Maximum_Monthly_Benefit_Amount_for_Self_as_BOE(String maxMonAmount) throws Exception {
		try {

			log.debug("Validate Maximum Monthly Benefit Amount for Self under BOE");

			if (!MaxMonth_amount_BOE_Self.isDisplayed()) {
				ProfessionalExpenseDisabilityLabel.click();
			}
			reuseMethod.scrollDown(ProfessionalExpenseDisabilityLabel);
			Thread.sleep(1000);

			String duration = MaxMonth_amount_BOE_Self.getAttribute("value");
			Assert.assertEquals(duration, maxMonAmount, "Maximum Monthly Benefit Amount value does not match");

			log.info("Validated Maximum Monthly Benefit Amount for Self under BOE || Pass");
		} catch (Exception e) {
			log.error("Validate Maximum Monthly Benefit Amount for Self under BOE|| Fail" + e.getMessage());
			throw (e);
		}
		return true;
	}

	public boolean verify_Coverage_Error_Message_in_Spouse_section_for_AOD() throws Exception {
		try {
			log.debug("Error Message is displayed on selecting incorrect spouse coverage amount");
			String spouseCoverageError = PropertyUtility.Load_MessageFile_Data("SpouseCoverageErrorMessage");
			CoverageErrorMsg_AOD_Spouse.isDisplayed();
			String actualError = CoverageErrorMsg_AOD_Spouse.getText();
			Assert.assertEquals(actualError, spouseCoverageError, "Error message does not match");
			log.info("Error Message is displayed on selecting incorrect spouse coverage amount sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Error Message is displayed on selecting incorrect spouse coverage amount || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean validate_Maximum_Monthly_Benefit_Amount_for_Self_as_under_AOD(String maxMonAmount) throws Throwable {
		try {

			log.debug("Validate Maximum Monthly Benefit Amount for Self under AOD");

			if (!max_MonthlyBenAmnt_Self_AOD.isDisplayed()) {
				AODInsuranceLabel.click();
			}
			reuseMethod.scrollDown(AODInsuranceLabel);
			Thread.sleep(1000);

			String duration = max_MonthlyBenAmnt_Self_AOD.getAttribute("value");
			Assert.assertEquals(duration, maxMonAmount, "Maximum Monthly Benefit Amount value does not match");

			log.info("Validated Maximum Monthly Benefit Amount for Self under AOD || Pass");
		} catch (Exception e) {
			log.error("Validate Maximum Monthly Benefit Amount for Self under AOD|| Fail" + e.getMessage());
			throw (e);
		}
		return true;
	}

	public boolean validate_Maximum_Monthly_Benefit_Amount_for_Spouse_as_under_AOD(String maxMonAmount)
			throws Throwable {
		try {

			log.debug("Validate Maximum Monthly Benefit Amount for Self under AOD");

			if (!max_MonthlyBenAmnt_Spouse_AOD.isDisplayed()) {
				AODInsuranceLabel.click();
			}
			reuseMethod.scrollDown(AODInsuranceLabel);
			Thread.sleep(1000);

			String duration = max_MonthlyBenAmnt_Spouse_AOD.getAttribute("value");
			Assert.assertEquals(duration, maxMonAmount, "Maximum Monthly Benefit Amount value does not match");

			log.info("Validated Maximum Monthly Benefit Amount for Self under AOD || Pass");
		} catch (Exception e) {
			log.error("Validate Maximum Monthly Benefit Amount for Self under AOD|| Fail" + e.getMessage());
			throw (e);
		}
		return true;
	}

	public boolean selects_Automatic_Benefit_Increase_Option_Self_under_TraditionalGroupTermLifeInsurance()
			throws Exception {
		try {
			log.debug(
					"Validate Automatic benefit increase option is selected for self for Traditional Group Term Life Insurance");
			TraditionalProduct_AutomaticBenefitRider_Self.click();

			log.info(
					"Automatic benefit increase option for self for Traditional Group Term Life Insurance is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Automatic benefit increase option for self for Traditional Group Term Life Insurance || Fail"
							+ e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Automatic_Benefit_Increase_Option_Spouse_under_TraditionalGroupTermLifeInsurance()
			throws Exception {
		try {
			log.debug(
					"Validate Automatic benefit increase option is selected for spouse for Traditional Group Term Life Insurance");
			TraditionalProduct_AutomaticBenefitRider_Spouse.click();

			log.info(
					"Automatic benefit increase option for spouse for Traditional Group Term Life Insurance is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Automatic benefit increase option for spouse for Traditional Group Term Life Insurance || Fail"
							+ e.getMessage());
			throw (e);
		}
	}

	public boolean validate_Maximum_Monthly_Benefit_Amount_for_Self_as_under_LTD_or_GDII(String maxMonAmount)
			throws Throwable {
		try {

			log.debug("Validate Maximum Monthly Benefit Amount for Self under LTD or GDII");

			if (!max_MonthlyBenAmnt_Self_LTD_GDII.isDisplayed()) {
				LongTermDisabilityLabel.click();
			}
			reuseMethod.scrollDown(LongTermDisabilityLabel);
			Thread.sleep(1000);

			String duration = max_MonthlyBenAmnt_Self_LTD_GDII.getAttribute("value");
			Assert.assertEquals(duration, maxMonAmount, "Maximum Monthly Benefit Amount value does not match");

			log.info("Validated Maximum Monthly Benefit Amount for Self under LTD or GDII || Pass");
		} catch (Exception e) {
			log.error("Validate Maximum Monthly Benefit Amount for Self under LTD or GDII|| Fail" + e.getMessage());
			throw (e);
		}
		return true;
	}

	public boolean select_Type_of_Coverage_as_for_self_GDII(String TypeofCove) throws Exception {

		try {
			log.debug("Select type of coverage for self GDII");
			if (!newCoverage_Self_GDII.isDisplayed()) {
				LongTermDisabilityLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverage_Self_GDII, changeCoverage_Self_GDII, TypeofCove);

			log.info("Coverage type for self selected for GDII successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for self GDII|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean selects_Benefit_Amount_for_Self_as_under_GDII(String sBenefit) throws Exception {

		try {
			log.debug("Select Benefit Amount for Self of Group Disability Income Insurance Products");
			if (!GDII_benefitAmount.isDisplayed()) {

				LongTermDisabilityLabel.click();
				Thread.sleep(2000);
			}
			reuseMethod.select_Benefit_Amount_slider(GDII_UpArrow_Self, sBenefit, GDII_benefitAmount,
					GDII_downArrow_Self);

			log.info("Amount selected for Self of Group Disability Income Insurance Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select the benefit Amount for self of Group Disability Income Insurance Product|| Fail"
							+ e.getMessage());

			throw (e);
		}
	}

	public boolean validate_Maximum_Monthly_Benefit_Amount_for_Self_as_under_GDII(String maxMonAmount)
			throws Throwable {
		try {

			log.debug("Validate Maximum Monthly Benefit Amount for Self under GDII");

			if (!max_MonthlyBenAmnt_Self_GDII.isDisplayed()) {
				LongTermDisabilityLabel.click();
			}
			reuseMethod.scrollDown(LongTermDisabilityLabel);
			Thread.sleep(1000);

			String duration = max_MonthlyBenAmnt_Self_GDII.getAttribute("value");
			Assert.assertEquals(duration, maxMonAmount, "Maximum Monthly Benefit Amount value does not match");

			log.info("Validated Maximum Monthly Benefit Amount for Self under GDII || Pass");
		} catch (Exception e) {
			log.error("Validate Maximum Monthly Benefit Amount for Self under GDII|| Fail" + e.getMessage());
			throw (e);
		}
		return true;
	}

	public boolean validate_Waiting_Period_Self_as_under_GDIIST(String waitingPeriod) throws Throwable {
		try {

			log.debug("Validate Waiting Period for Self under GDIIST");

			if (!WaitingPeriod_MID.isDisplayed()) {
				MidTermDisabilityLabel.click();
			}
			reuseMethod.scrollDown(MidTermDisabilityLabel);
			Thread.sleep(1000);
			String duration = WaitingPeriod_MID.getAttribute("value");
			Assert.assertEquals(duration, waitingPeriod, "Waiting Period for Self under GDIIST value does not match");

			log.info("Validated Waiting Period for Self under GDIIST || Pass");
		} catch (Exception e) {
			log.error("Validate Waiting Period for Self under GDIIST|| Fail" + e.getMessage());
			throw (e);
		}
		return true;
	}

	public boolean validate_Maximum_Monthly_Benefit_Amount_for_Self_as_under_GDIIST(String maxMonAmount)
			throws Throwable {
		try {

			log.debug("Validate Maximum Monthly Benefit Amount for Self under GDIIST");

			if (!max_MonthlyBenAmnt_Self_GDIIST.isDisplayed()) {
				MidTermDisabilityLabel.click();
			}
			reuseMethod.scrollDown(MidTermDisabilityLabel);
			Thread.sleep(1000);

			String duration = max_MonthlyBenAmnt_Self_GDIIST.getAttribute("value");
			Assert.assertEquals(duration, maxMonAmount, "Maximum Monthly Benefit Amount value does not match");

			log.info("Validated Maximum Monthly Benefit Amount for Self under GDIIST || Pass");
		} catch (Exception e) {
			log.error("Validate Maximum Monthly Benefit Amount for Self under GDIIST || Fail" + e.getMessage());
			throw (e);
		}
		return true;
	}

	public boolean selects_Type_of_Coverage_as_for_Self_under_GDIIST(String TypeofCov) throws Throwable {
		try {
			log.debug("Select type of coverage for self GDIIST");
			if (!newCoverageSelf_GDIIST.isDisplayed()) {
				MidTermDisabilityLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSelf_GDIIST, changeCoverageSelf_GDIIST, TypeofCov);

			log.info("Coverage type for self selected for GDIIST successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for self GDIIST || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean selects_Type_of_Coverage_as_for_Self_under_CI(String TypeofCov) throws Throwable {
		try {
			log.debug("Select type of coverage for self under CI");
			if (!newCoverageSelf_CI.isDisplayed()) {
				CriticalIllnessLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSelf_CI, changeCoverageSelf_CI, TypeofCov);
			log.info("Coverage type for self selected for CI successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for self CI || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean selects_Type_of_Coverage_as_for_Spouse_under_CI(String TypeofCov) throws Throwable {
		try {
			log.debug("Select type of coverage for spouse under CI");
			if (!newCoverageSpouse_CI.isDisplayed()) {
				CriticalIllnessLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.selectSinglevalue(newCoverageSpouse_CI, changeCoverageSpouse_CI, TypeofCov);
			log.info("Coverage type for spouse selected for CI successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for spouse CI || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean verify_that_Spouse_Benefit_Message_is_displayed() throws Exception {
		try {
			log.debug("Verify that Spouse Benefit Message is displayed");
			Thread.sleep(4000);
			reuseMethod.scrollDown(SpouseBenefit_Message);
			System.err.println(SpouseBenefit_Message.getText());
			SpouseBenefit_Message.isDisplayed();

			String Expected = PropertyUtility.Load_MessageFile_Data("SpouseBenefitMessage");
			String actual = SpouseBenefit_Message.getText();
			Assert.assertEquals(actual, Expected, " Spouse Benefit Message is Not Validated...");
			log.info("Spouse Benefit Messageis validated sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Spouse Benefit Message || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Wait_Period_for_Self_as_under_GDIILT_from_dropdown(String wPeriod) throws Throwable {
		try {
			log.debug("Validates Wait Period for Self as under GDIILT");
			List<WebElement> waitPeriod = reuseMethod.dropDowngetOption(WaitingPeriod_LTD);
			String expectedPeriod = wPeriod.trim();
			for (WebElement e : waitPeriod) {
				String actualPeriod = e.getText().trim();
				if (!actualPeriod.equalsIgnoreCase("Select")) {
					if (actualPeriod.equalsIgnoreCase(expectedPeriod))
						System.out.println("Wait Period for Self matched under GDIILT");
				}
			}
			log.info("Validated Wait Period for Self as under GDIILT sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Wait Period for Self as under GDIILT || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_are_displayed_in_eligible_children_GTLI(String child) throws Exception {

		try {
			log.debug("Verify only some Children are available under GTLI on Coverage Page ");
			Eligibile_Childs_GTLI.isDisplayed();
			reuseMethod.scrollDown(TermLifeInsuranceLabel);
			boolean check = false;
			String Childs = Eligibile_Childs_GTLI.getText();
			String[] eligi_ChildList = Childs.split(",");
			if (!BenefitAmountChildTermLife_ARTLProduct.isDisplayed()) {
				TermLifeInsuranceLabel.click();
			}
			for (int i = 0; i < eligi_ChildList.length; i++) {

				if (child.equalsIgnoreCase(eligi_ChildList[i])) {

					check = true;
					Assert.assertTrue(check);
				}
			}
			System.out.println("Child is Present for GTLI=" + child);
			log.info("Eligible Childrens under GTLI are Verfied sucessfully... ||PASS");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify Eligible Children under GTLI || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_under_FPO_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Exception {

		try {
			log.debug("Validate Monthly Benefit Slider Ranges for Future Purchase Option Product");
			String MinAmt = minFPO_Self.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for Future Purchase Option is validated");
			}
			String MaxAmt = maxFPO_Self.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for Future Purchase Option Product is validated");
			}
			log.info(
					"Monthly Benefit Slider Ranges for Future Purchase Option Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Monthly Benefit Slider Ranges for Future Purchase Option Products|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public Boolean validates_error_message_on_Monthly_Benefit_Amount_Exceed() throws Throwable {
		try {
			log.debug("Validate Error Messege on Monthly Benefit Amount exceed ");

			String ExpectedBeneficiaryMsg = PropertyUtility.Load_MessageFile_Data("SelfMonthlyBenefitExceed");
			MonthlyBenefitAmtError.isDisplayed();
			String actual = MonthlyBenefitAmtError.getText();
			Assert.assertEquals(actual, ExpectedBeneficiaryMsg,
					"Error messege for Monthly Benefit Amount exceed is Not Displayed");

			log.info("Error Messege on Monthly Benefit Amount exceed is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Error Messege on Monthly Benefit Amount exceed|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public Boolean validates_error_message_on_Monthly_Benefit_Amount_Exceed_FPO() throws Throwable {
		try {
			log.debug("Validate Error Messege on FPO Monthly Benefit Amount exceed ");

			String ExpectedBeneficiaryMsg = PropertyUtility.Load_MessageFile_Data("SelfMonthlyBenefitExceed");
			FPOMonthlyBenefitAmtError.isDisplayed();
			String actual = FPOMonthlyBenefitAmtError.getText();
			Assert.assertEquals(actual, ExpectedBeneficiaryMsg,
					"Error messege for FPO Monthly Benefit Amount exceed is Not Displayed");

			log.info("Error Messege on FPO Monthly Benefit Amount exceed is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Validate Error Messege on FPO Monthly Benefit Amount exceed|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Benefit_Amount_for_Self_under_GTLDI_is_displayed_as(String Benefit) throws Exception {

		try {

			log.debug("Validates Benefit Amount under GTLDI for Self");
			Thread.sleep(2000);

			String actual = BenefitAmount_GLTDI.getAttribute("value");
			System.out.println("Actual Benefit Amount:" + actual);
			assertEquals(actual, Benefit, "Benefit Amount under GTLDI for Self is Not Validated");

			log.info("Benefit Amount under GTLDI for Self is validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Benefit Amount under GTLDI for Self || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_Benefit_Duration_Dropdown_for_Self_value_under_GTLDI_as(String amount) throws Exception {
		try {
			log.debug("Validates Benefit Duration Dropdown for Self value under GTLDI");

			List<WebElement> options = reuseMethod.dropDowngetOption(BenefitDuration_GLTD);
			for (WebElement we : options) {
				if (we.getText().equals(amount)) {
					System.out.println(
							" Benefit Duration Dropdown for Self value under GTLDI is matched..." + we.getText());
				}
			}
			log.info(" Benefit Duration Dropdown for Self value under GTLDI are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validates Benefit Duration Dropdown for Self value under GTLDI|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	public boolean validate_Benefit_Amount_for_Child_from_dropdown_as_under_GTLI(String amount) throws Throwable {
		try {

			log.debug("Validate Benefit Amount for Child under GTLI");
			boolean check = false;
			if (!BenefitAmountChildTermLife_ARTLProduct.isDisplayed()) {
				TermLifeInsuranceLabel.click();
			}
			reuseMethod.scrollDown(TermLifeInsuranceLabel);
			Thread.sleep(1000);

			List<WebElement> benefitAmount = reuseMethod.dropDowngetOption(BenefitAmountChildTermLife_ARTLProduct);
			for (int i = 0; i < benefitAmount.size(); i++) {
				String expected = benefitAmount.get(i).getText();
				if (amount.equalsIgnoreCase(expected)) {

					check = true;
					Assert.assertEquals(amount, expected, " Benefit Amount value does not match");
				}

			}

			log.info("Validated Benefit Amount for Child under GTLI || Pass");
		} catch (Exception e) {
			log.error("Validate Benefit Amount for Child under GTLI|| Fail" + e.getMessage());
			throw (e);
		}
		return true;
	}

	public boolean validates_and_are_displayed_in_eligible_children_TenYTL(String child) throws Exception {

		try {
			log.debug("Verify only some Children are available under TenYTL  on Coverage Page ");
			Eligibile_Childs_Ten.isDisplayed();
			reuseMethod.scrollDown(TenYrLifeTermInsuranceLabel);
			boolean check;
			String Childs = Eligibile_Childs_Ten.getText();
			String[] eligi_ChildList = Childs.split(",");

			if (!(BenefitAmount_Child_10YrProduct.isDisplayed() || BenefitAmountChild_TenYTL_Label.isDisplayed())) {
				TenYrLifeTermInsuranceLabel.click();
			}
			for (int i = 0; i < eligi_ChildList.length; i++) {

				if (child.equalsIgnoreCase(eligi_ChildList[i])) {

					check = true;

					Assert.assertTrue(check);
				}

			}
			System.out.println("Child is not Present for TenYTL=" + child);
			log.info("Eligible Childrens under TenYTL are Verfied sucessfully... ||PASS");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify Eligible Children under TenYTL || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_and_are_not_displayed_in_eligible_children_GTTLI(String child) throws Exception {
		try {
			log.debug("Verify only some Children are not available under GTTLI  on Coverage Page ");
			TermLifeProduct_EligibleChildName.isDisplayed();
			reuseMethod.scrollDown(TermLifeInsuranceLabel);
			boolean check;
			String Childs = TermLifeProduct_EligibleChildName.getText();
			String[] eligi_ChildList = Childs.split(",");
			if (!(BenefitAmountChildTermLife_ARTLProduct.isDisplayed()
					|| BenefitAmountChildTermLifeProduct_Label.isDisplayed())) {
				TermLifeInsuranceLabel.click();
			}
			for (int i = 0; i < eligi_ChildList.length; i++) {
				if (child.equalsIgnoreCase(eligi_ChildList[i])) {
					check = true;
				} else {
					check = false;
				}
				Assert.assertFalse(check);
			}
			System.out.println("Child is not Present for GTTLI" + child);
			log.info("Eligible Childrens under GTTLI are Verfied sucessfully... ||PASS");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify Eligible Children under GTTLI || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_and_are_not_displayed_in_eligible_children_GTwentyYTL(String child) throws Exception {
		try {
			log.debug("Verify only some Children are not available under GTwentyYTL  on Coverage Page ");
			Eligibile_Childs_GTwenty.isDisplayed();
			reuseMethod.scrollDown(TwentyYrLifeTermInsuranceLabel);
			boolean check;
			String Childs = Eligibile_Childs_GTwenty.getText();
			String[] eligi_ChildList = Childs.split(",");

			if (!(BenefitAmount_Child_20YrProduct.isDisplayed()
					|| BenefitAmount_Child_20YrProduct_label.isDisplayed())) {
				TwentyYrLifeTermInsuranceLabel.click();
			}
			for (int i = 0; i < eligi_ChildList.length; i++) {
				if (child.equalsIgnoreCase(eligi_ChildList[i])) {
					check = true;

				} else {
					check = false;
				}
				Assert.assertFalse(check);
			}
			System.out.println("Child is not Present for GTwentyYTL" + child);
			log.info("Eligible Childrens under GTwentyYTL are Verfied sucessfully... ||PASS");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify Eligible Children under GTwentyYTL || Fail" + e.getMessage());
			throw (e);
		}
	}

	public Boolean validate_Coverage_Required_Questions_Error_message() throws Throwable {
		try {
			log.debug("Validate Error Messege on Coverage Page");
			String Expected = PropertyUtility.Load_MessageFile_Data("CoverageRequiredQuestionsError");
			CoverageErrorMsg.isDisplayed();
			String actual = CoverageErrorMsg.getText();
			System.err.println("Error Messege on Coverage Page===" + actual);
			Assert.assertEquals(actual, Expected, "Error messege on Coverage is Not Displayed");

			log.info("Error Messege on Coverage Page is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Error Messege on coverage Page || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean verify_Coverage_Error_Message_in_Spouse_section_GTenYrLI() throws Exception {
		try {
			log.debug("Error Message is displayed on selecting incorrect spouse coverage amount");
			String spouseCoverageError = PropertyUtility.Load_MessageFile_Data("SpouseCoverageErrorMessage");
			if (!SpouseBenefitAmount10Yr.isDisplayed()) {
				TenYrLifeTermInsuranceLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.scrollDown(spouseTenYrLICoverageErrorMsg);
			spouseTenYrLICoverageErrorMsg.isDisplayed();
			String actualError = spouseTenYrLICoverageErrorMsg.getText();
			Assert.assertEquals(actualError, spouseCoverageError, "Error message does not match for GTenYLI");
			log.info("Error Message is displayed on selecting incorrect spouse coverage amount sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Error Message is displayed on selecting incorrect spouse coverage amount || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean verify_Coverage_Error_Message_in_Spouse_section_CI() throws Exception {
		try {
			log.debug("Error Message is displayed on selecting incorrect spouse coverage amount for CI");
			String spouseCoverageError = PropertyUtility.Load_MessageFile_Data("SpouseCoverageErrorMessage");
			if (!abeSelfBenefitAmountCIProduct.isDisplayed()) {
				CriticalIllnessLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.scrollDown(spouseCICoverageErrorMsg);
			spouseCICoverageErrorMsg.isDisplayed();
			String actualError = spouseCICoverageErrorMsg.getText();
			Assert.assertEquals(actualError, spouseCoverageError, "Error message does not match for CI");
			log.info(
					"Error Message is displayed on selecting incorrect spouse coverage amount for CI sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Error Message is displayed on selecting incorrect spouse coverage amount for CI || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean verify_Coverage_Error_Message_in_Spouse_section_GTwentyYrLI() throws Exception {
		try {
			log.debug("Error Message is displayed on selecting incorrect spouse coverage amount");
			String spouseCoverageError = PropertyUtility.Load_MessageFile_Data("SpouseCoverageErrorMessage");
			if (!abeSpouseBenefitAmount20Yr.isDisplayed()) {
				TwentyYrLifeTermInsuranceLabel.click();
				Thread.sleep(1000);
			}
			reuseMethod.scrollDown(spouseTwentyYrLICoverageErrorMsg);
			spouseTwentyYrLICoverageErrorMsg.isDisplayed();
			String actualError = spouseTwentyYrLICoverageErrorMsg.getText();
			Assert.assertEquals(actualError, spouseCoverageError, "Error message does not match");
			log.info("Error Message is displayed on selecting incorrect spouse coverage amount sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Error Message is displayed on selecting incorrect spouse coverage amount || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_that_Optional_Rider_displayed_for_Self_under_Flex10() throws Throwable {
		try {
			log.debug("Verify the Optional rider AD is displayed or not for self under Flex10");
			Assert.assertTrue(chkOptionalRiderFlex10_Self.isDisplayed(),
					"Optional rider AD is not displayed for self under Flex10");
			System.out.println("Optional rider AD is displayed for self under Flex10");
			log.info("Optional rider AD is displayed for self under Flex10");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Optional rider AD is displayed for self under Flex10**********");
			log.error("Optional rider AD is displayed for self under Flex10 || Fail");
			return false;
		}
	}

	public boolean validates_that_Optional_Rider_displayed_for_Spouse_under_Flex10() throws Throwable {
		try {
			log.debug("Verify the Optional rider AD is displayed or not for spouse under Flex10");
			Assert.assertTrue(chkOptionalRiderFlex10_Spouse.isDisplayed(),
					"Optional rider AD is not displayed for spouse under Flex10");
			System.out.println("Optional rider AD is displayed for spouse under Flex10");
			log.info("Optional rider AD is displayed for spouse under Flex10");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Optional rider AD is displayed for spouse under Flex10**********");
			log.error("Optional rider AD is displayed for spouse under Flex10 || Fail");
			return false;
		}
	}

	public boolean validates_that_Wavier_Premium_not_displayed_for_Self_under_Flex10() throws Exception {
		try {
			log.debug("Verify the optional Rider WOP is not displayed for Self under Flex10");
			Assert.assertFalse(chkWavierPremiumFlex10_Self.isDisplayed(),
					"Optional Rider WOP is displayed for Self under Flex10");
			System.out.println("Optional Rider WOP for Self under Flex10 is not displayed");
			log.info("Optional Rider WOP for Self under Flex10 is not displayed||Pass");
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Optional Rider WOP for Self under Flex10 is not displayed");
			log.error("Not able to validate Optional Rider WOP for Self under Flex10 || Fail");
			return false;
		}
	}

	public boolean validates_that_Wavier_Premium_displayed_for_Self_under_Flex10() throws Exception {
		try {
			log.debug("Verify the optional Rider WOP is displayed for Self under Flex10");
			Assert.assertTrue(chkWavierPremiumFlex10_Self.isDisplayed(),
					"Optional Rider WOP is not displayed for Self under Flex10");
			System.out.println("Optional Rider WOP for Self under Flex10 is displayed");
			log.info("Optional Rider WOP for Self under Flex10 is displayed||Pass");
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Optional Rider WOP for Self under Flex10 is displayed");
			log.error("Not able to validate Optional Rider WOP for Self under Flex10 || Fail");
			return false;
		}
	}

	public boolean validates_that_Wavier_Premium_displayed_for_Self_under_GTLP75I() throws Exception {
		try {
			log.debug("Verify the optional Rider WOP is displayed for Self under GTLP75I");
			Assert.assertTrue(chkWavierPremiumGTLP75I_Self.isDisplayed(),
					"Optional Rider WOP is not displayed for Self under GTLP75I");
			System.out.println("Optional Rider WOP for Self under GTLP75I is displayed");
			log.info("Optional Rider WOP for Self under GTLP75I is displayed||Pass");
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Optional Rider WOP for Self under GTLP75I is displayed");
			log.error("Not able to validate Optional Rider WOP for Self under GTLP75I || Fail");
			return false;
		}
	}

	public boolean validates_that_Optional_Rider_displayed_for_Self_under_GTLP75I() throws Throwable {
		try {
			log.debug("Verify the Optional rider AD is displayed or not for self under GTLP75I");
			Assert.assertTrue(chkOptionalRiderGTLP75I_Self.isDisplayed(),
					"Optional rider AD is not displayed for self under GTLP75I");
			System.out.println("Optional rider AD is displayed for self under GTLP75I");
			log.info("Optional rider AD is displayed for self under GTLP75I");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Optional rider AD is displayed for self under GTLP75I**********");
			log.error("Optional rider AD is displayed for self under GTLP75I || Fail");
			return false;
		}
	}

	public boolean validates_that_Optional_Rider_displayed_for_Spouse_under_GTLP75I() throws Throwable {
		try {
			log.debug("Verify the Optional rider AD is displayed or not for spouse under GTLP75I");
			Assert.assertTrue(chkOptionalRiderGTLP75I_Spouse.isDisplayed(),
					"Optional rider AD is not displayed for spouse under GTLP75I");
			System.out.println("Optional rider AD is displayed for spouse under GTLP75I");
			log.info("Optional rider AD is displayed for spouse under GTLP75I");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Optional rider AD is displayed for spouse under GTLP75I**********");
			log.error("Optional rider AD is displayed for spouse under GTLP75I || Fail");
			return false;
		}
	}

	public boolean selects_Optional_Rider_Self_under_GTLP75I() throws Exception {
		try {
			log.debug("Validate Optional Rider AD is selected for self for GTLP75I");
			if (!chkOptionalRiderGTLP75I_Self.isDisplayed()) {
				FiveYrLifeTermInsuranceLabel.click();
			Thread.sleep(2000);
			}
			chkOptionalRiderGTLP75I_Self.click();
			log.info("Optional Rider AD for self for GTLP75I is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Optional Rider AD for self for GTLP75I || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Optional_Rider_Wavier_Premium_Self_under_GTLP75I() throws Exception {
		try {
			log.debug("Validate Optional Rider WOP is selected for self for GTLP75I");
			if (!chkWavierPremiumGTLP75I_Self.isDisplayed()) {
				FiveYrLifeTermInsuranceLabel.click();
			Thread.sleep(1000);
			}
			chkWavierPremiumGTLP75I_Self.click();
			log.info("Optional Rider WOP for self for GTLP75I is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Optional Rider WOP for self for GTLP75I || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Optional_Rider_Self_under_Flex10() throws Exception {
		try {
			log.debug("Validate Optional Rider AD is selected for self for Flex10");
			if (!chkOptionalRiderFlex10_Self.isDisplayed()) {
				TenYrLifeTermInsuranceLabel.click();
			Thread.sleep(1000);
			}
			chkOptionalRiderFlex10_Self.click();
			log.info("Optional Rider AD for self for Flex10 is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Optional Rider AD for self for Flex10 || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Optional_Rider_Wavier_Premium_Self_under_Flex10() throws Exception {
		try {
			log.debug("Validate Optional Rider WOP is selected for self for Flex10");
			if (!chkWavierPremiumFlex10_Self.isDisplayed()) {
				TenYrLifeTermInsuranceLabel.click();
			Thread.sleep(1000);
		}
			chkWavierPremiumFlex10_Self.click();
			log.info("Optional Rider WOP for self for Flex10 is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Optional Rider WOP for self for Flex10 || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Optional_Rider_Self_under_Flex20() throws Exception {
		try {
			log.debug("Validate Optional Rider AD is selected for self for Flex20");
			if (!chkOptionalRiderFlex20_Self.isDisplayed()) {
				TwentyYrLifeTermInsuranceLabel.click();
			Thread.sleep(1000);
		}
			chkOptionalRiderFlex20_Self.click();
			log.info("Optional Rider AD for self for Flex20 is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Optional Rider AD for self for Flex20 || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Optional_Rider_Wavier_Premium_Self_under_Flex20() throws Exception {
		try {
			log.debug("Validate Optional Rider WOP is selected for self for Flex20");
			if(!chkWavierPremiumFlex20_Self.isDisplayed()) {
				TwentyYrLifeTermInsuranceLabel.click();
			Thread.sleep(1000);
			}
			chkWavierPremiumFlex20_Self.click();
			log.info("Optional Rider WOP for self for Flex20 is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Optional Rider WOP for self for Flex20 || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_under_AD_Under_GTLP75I_the_Benefit_Slider_Range_as_to(String Min, String Max)
			throws Exception {
		try {
			log.debug("Validates AD under GTLP75I the Benefit Slider Range for Self");
			String MinAmt = minAmt_AD_GTLP75ISelf.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for AD under GTLP75I Product is validated");
			}
			String MaxAmt = maxAmt_AD_GTLP75ISelf.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for AD under GTLP75I Product is validated");
			}
			log.info("Benefit Slider Ranges for AD under GTLP75I Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Validate Benefit Slider Ranges for AD under GTLP75I Products|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_under_AD_Under_Flex10_the_Benefit_Slider_Range_as_to(String Min, String Max)
			throws Exception {
		try {
			log.debug("Validates AD under Flex10 the Benefit Slider Range for Self");
			String MinAmt = minAmt_AD_Flex10Self.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for AD under Flex10 Product is validated");
			}
			String MaxAmt = maxAmt_AD_Flex10Self.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for AD under Flex10 Product is validated");
			}
			log.info("Benefit Slider Ranges for AD under Flex10 Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Validate Benefit Slider Ranges for AD under Flex10 Products|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_under_AD_Under_Flex20_the_Benefit_Slider_Range_as_to(String Min, String Max)
			throws Exception {
		try {
			log.debug("Validates AD under Flex20 the Benefit Slider Range for Self");
			String MinAmt = minAmt_AD_Flex20Self.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for AD under Flex20 Product is validated");
			}
			String MaxAmt = maxAmt_AD_Flex20Self.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for AD under Flex20 Product is validated");
			}
			log.info("Benefit Slider Ranges for AD under Flex20 Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Validate Benefit Slider Ranges for AD under Flex20 Products|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Benefit_Amount_for_Self_as_AD_under_GTLP75I(String sBenefit) throws Exception {
		try {
			log.debug("Select Benefit Amount for Self of AD under GTLP75I Products");
			Thread.sleep(2000);
			if (omaSelfBenefitAmountAD_GTLP75I.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_AD_GTLP75IProduct, sBenefit,
						omaSelfBenefitAmountAD_GTLP75I, downArrow_Self_AD_GTLP75IProduct);
			} else {
				FiveYrLifeTermInsuranceLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_AD_GTLP75IProduct, sBenefit,
						omaSelfBenefitAmountAD_GTLP75I, downArrow_Self_AD_GTLP75IProduct);
			}
			Thread.sleep(1000);
			log.info("Amount selected for Self of AD under GTLP75I Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Self of AD under GTLP75I Product|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Benefit_Amount_for_Self_as_AD_under_Flex20(String sBenefit) throws Exception {
		try {
			log.debug("Select Benefit Amount for Self of AD under Flex20 Products");
			if (omaSelfBenefitAmountAD_Flex20.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_AD_Flex20Product, sBenefit,
						omaSelfBenefitAmountAD_Flex20, downArrow_Self_AD_Flex20Product);
			} else {
				TwentyYrLifeTermInsuranceLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_AD_Flex20Product, sBenefit,
						omaSelfBenefitAmountAD_Flex20, downArrow_Self_AD_Flex20Product);
			}
			log.info("Amount selected for Self of AD under Flex20 Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Self of AD under Flex20 Product|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Benefit_Amount_for_Self_as_AD_under_Flex10(String sBenefit) throws Exception {
		try {
			log.debug("Select Benefit Amount for Self of AD under Flex10 Products");
			Thread.sleep(2000);
			if (omaSelfBenefitAmountAD_Flex10.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_AD_Flex10Product, sBenefit,
						omaSelfBenefitAmountAD_Flex10, downArrow_Self_AD_Flex10Product);
			} else {
				TenYrLifeTermInsuranceLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Self_AD_Flex10Product, sBenefit,
						omaSelfBenefitAmountAD_Flex10, downArrow_Self_AD_Flex10Product);
			}
			Thread.sleep(1000);
			log.info("Amount selected for Self of AD under Flex10 Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Self of AD under Flex10 Product|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean Interim_Insurance_page_is_displayed_to_user() throws Exception {
		try {
			log.debug("Interim Insurance page is displayed to user");
			InterimInsurancePage.isDisplayed();
			log.info("Interim Insurance page is displayed to user sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Interim Insurance page is displayed to user || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Optional_Rider_Spouse_under_GTLP75I() throws Exception {
		try {
			log.debug("Validate Optional Rider AD is selected for spouse for GTLP75I");
			if(!chkOptionalRiderGTLP75I_Spouse.isDisplayed()) {
				FiveYrLifeTermInsuranceLabel.click();
			Thread.sleep(2000);
			}
			chkOptionalRiderGTLP75I_Spouse.click();
			log.info("Optional Rider AD for spouse for GTLP75I is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Optional Rider AD for spouse for GTLP75I || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Benefit_Amount_for_Spouse_as_AD_under_GTLP75I(String sBenefit) throws Exception {
		try {
			log.debug("Select Benefit Amount for Spouse of AD under GTLP75I Products");
			if (omaSpouseBenefitAmountAD_GTLP75I.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_AD_GTLP75IProduct, sBenefit,
						omaSpouseBenefitAmountAD_GTLP75I, downArrow_Spouse_AD_GTLP75IProduct);
			} else {
				FiveYrLifeTermInsuranceLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_AD_GTLP75IProduct, sBenefit,
						omaSpouseBenefitAmountAD_GTLP75I, downArrow_Spouse_AD_GTLP75IProduct);
			}
			log.info("Amount selected for Spouse of AD under GTLP75I Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Spouse of AD under GTLP75I Product|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_under_AD_Under_GTLP75I_the_Benefit_Slider_Range__for_spouse_as_to(String Min, String Max)
			throws Exception {
		try {
			log.debug("Validates AD under GTLP75I the Benefit Slider Range for Spouse");
			String MinAmt = minAmt_AD_GTLP75ISpouse.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for AD under GTLP75I Product is validated");
			}
			String MaxAmt = maxAmt_AD_GTLP75ISpouse.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for AD under GTLP75I Product is validated");
			}
			log.info(
					"Benefit Slider Ranges for AD under GTLP75I Products for spouse are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for AD under GTLP75I Products for spouse || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Optional_Rider_Spouse_under_Flex10() throws Exception {
		try {
			log.debug("Validate Optional Rider AD is selected for spouse for Flex10");
			if(!chkOptionalRiderFlex10_Spouse.isDisplayed()) {
				TenYrLifeTermInsuranceLabel.click();
			Thread.sleep(1000);
			}
			chkOptionalRiderFlex10_Spouse.click();
			log.info("Optional Rider AD for spouse for Flex10 is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Optional Rider AD for spouse for Flex10 || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Benefit_Amount_for_Spouse_as_AD_under_Flex10(String sBenefit) throws Exception {
		try {
			log.debug("Select Benefit Amount for Spouse of AD under Flex10 Products");
			if (omaSpouseBenefitAmountAD_Flex10.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_AD_Flex10Product, sBenefit,
						omaSpouseBenefitAmountAD_Flex10, downArrow_Spouse_AD_Flex10Product);
			} else {
				TenYrLifeTermInsuranceLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_AD_Flex10Product, sBenefit,
						omaSpouseBenefitAmountAD_Flex10, downArrow_Spouse_AD_Flex10Product);
			}
			log.info("Amount selected for Spouse of AD under Flex10 Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Spouse of AD under Flex10 Product|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_under_AD_Under_Flex10_the_Benefit_Slider_Range_Spouse_as_to(String Min, String Max)
			throws Exception {
		try {
			log.debug("Validates AD under Flex10 the Benefit Slider Range for Spouse");
			String MinAmt = minAmt_AD_Flex10Spouse.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for AD under Flex10 Product for Spouse is validated");
			}
			String MaxAmt = maxAmt_AD_Flex10Spouse.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for AD under Flex10 Product is validated");
			}
			log.info("Benefit Slider Ranges for AD under Flex10 Products are validated sucessfully for Spouse || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Benefit Slider Ranges for AD under Flex10 Products for Spouse|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Optional_Rider_Spouse_under_Flex20() throws Exception {
		try {
			log.debug("Validate Optional Rider AD is selected for self for Flex20");
			if(!chkOptionalRiderFlex20_Spouse.isDisplayed()) {
				TwentyYrLifeTermInsuranceLabel.click();
				Thread.sleep(2000);
			}
			chkOptionalRiderFlex20_Spouse.click();
			log.info("Optional Rider AD for self for Flex20 is selected sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Optional Rider AD for self for Flex20 || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Benefit_Amount_for_Spouse_as_AD_under_Flex20(String sBenefit) throws Exception {
		try {
			log.debug("Select Benefit Amount for Spouse of AD under Flex20 Products");
			if (omaSpouseBenefitAmountAD_Flex20.isDisplayed()) {
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_AD_Flex20Product, sBenefit,
						omaSpouseBenefitAmountAD_Flex20, downArrow_Spouse_AD_Flex20Product);
			} else {
				TwentyYrLifeTermInsuranceLabel.click();
				Thread.sleep(2000);
				reuseMethod.select_Benefit_Amount_slider(upArrow_Spouse_AD_Flex20Product, sBenefit,
						omaSpouseBenefitAmountAD_Flex20, downArrow_Spouse_AD_Flex20Product);
			}
			log.info("Amount selected for Spouse of AD under Flex20 Product sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the benefit Amount for Spouse of AD under Flex20 Product|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_under_AD_Under_Flex20_the_Benefit_Slider_Range_Spouse_as_to(String Min, String Max)
			throws Exception {
		try {
			log.debug("Validates AD under Flex20 the Benefit Slider Range for Spouse");
			String MinAmt = minAmt_AD_Flex20Spouse.getText();
			System.out.println("Actual Min Amount:" + MinAmt);
			if (MinAmt.equalsIgnoreCase(Min)) {
				System.out.println("Minimum Range for AD under Flex20 Product is validated");
			}
			String MaxAmt = maxAmt_AD_Flex20Spouse.getText();
			System.out.println("Actual Max Amount:" + MaxAmt);

			if (MaxAmt.equalsIgnoreCase(Max)) {
				System.out.println("Maximum Range for AD under Flex20 Product is validated");
			}
			log.info("Benefit Slider Ranges for AD under Flex20 Products are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Validate Benefit Slider Ranges for AD under Flex20 Products|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean Terminate_Reduce_Coverage_page_is_displayed_to_user() throws Exception {
		try {
			log.debug("Terminate or Reduce Coverage page is displayed to user");
			TerminateorReduceCoveragePage.isDisplayed();
			log.info("Terminate or Reduce Coverage page is displayed to user sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Terminate or Reduce Coverage page is displayed to user || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean Transfer_Ownership_page_is_displayed_to_user() throws Exception {
		try {
			log.debug("Transfer Ownership page is displayed to user");
			TransferOwnershipPage.isDisplayed();
			log.info("Transfer Ownership page is displayed to user sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Transfer Ownership page is displayed to user || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_dont_wish_Interim_Insurance() throws Exception {
		try {
			log.debug("Click on I do not wish to request Interim Insurance");
			reuseMethod.scrollDown(skipInterimInsurancelnk);
			reuseMethod.Clickbutton(skipInterimInsurancelnk);
			Thread.sleep(1000);
			log.info("Click on I do not wish to request Interim Insurance successfully || Pass");
			return true;
		} catch (Exception e) {
			System.out.println(
					"Not able to Click on I do not wish to request Interim Insurance || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_dont_wish_Terminate_Reduce_Coverage() throws Exception {
		try {
			log.debug("Click I do not wish to Terminate or Reduce Coverage");
			reuseMethod.scrollDown(skipTerminateReduceCovglnk);
			reuseMethod.Clickbutton(skipTerminateReduceCovglnk);
			Thread.sleep(1000);
			log.info("Click I do not wish to Terminate or Reduce Coverage successfully || Pass");
			return true;
		} catch (Exception e) {
			System.out.println(
					"Not able to Click I do not wish to Terminate or Reduce Coverage || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_dont_wish_Transfer_Ownership() throws Exception {
		try {
			log.debug("Click I do not wish to Transfer Ownership");
			reuseMethod.scrollDown(skipTransferOwnershiplnk);
			reuseMethod.Clickbutton(skipTransferOwnershiplnk);
			Thread.sleep(1000);
			log.info("Click I do not wish to Transfer Ownership successfully || Pass");
			return true;
		} catch (Exception e) {
			System.out.println("Not able to Click I do not wish to Transfer Ownership || Fail" + e.getMessage());
			throw (e);
		}
	}


	public boolean verify_that_Child_Benefit_is_not_rendered_under_GTLI() throws Throwable {
	try {
			log.debug("Verify that Child Benefit is not rendered under GTLI");
			reuseMethod.scrollDown(Next);
			boolean check = TermLife_ChildLabel.isDisplayed();
			assertFalse(check, "Child Benefit is rendered for Group Term Life");
			System.out.println("Child Benefit is not rendered under GTLI");
			return true;
	} catch (Exception e) {
			log.error("Not able to Verify that Child Benefit is not rendered under GTLI || Fail"
				+ e.getMessage());
		throw (e);
	}
	}

	public boolean verify_that_Spouse_Benefit_is_not_rendered_under_GTLI() throws Throwable {
		try {
			log.debug("Verify that Spouse Benefit is not rendered under GTLI");
			reuseMethod.scrollDown(Next);
			boolean check = TermLife_SpouseLabel.isDisplayed();
			assertFalse(check, "Spouse Benefit is rendered for Group Term Life");
			System.out.println("Spouse Benefit is not rendered under GTLI");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify that Spouse Benefit is not rendered under GTLI || Fail" + e.getMessage());
			throw (e);
		}
	}


	
	public boolean click_Interim_Self() throws Exception {
		try {
			log.debug("Click Interim Life insurance on self icon");
			reuseMethod.scrollDown(Interim_Self);
			Interim_Self.click();
			Thread.sleep(1000);
			log.info("Click Interim Life insurance on self icon successfully || Pass");
			return true;
		} catch (Exception e) {
			System.out.println("Not able to Click Interim Life insurance on self icon || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public Boolean validate_Spouse_AD_D_Benefit_Exceed_Error_message() throws Throwable {
		try {
			log.debug("Validate Error Message on AD&D Benefit amount exceed for Spouse");
			String Expected = PropertyUtility.Load_MessageFile_Data("SpouseADDBenefitExceed");
			SpouseFlex10_ADDError.isDisplayed();
			String actual = SpouseFlex10_ADDError.getText();
			System.err.println("Error Messege on AD&D Benefit amount exceed for Spouse===" + actual);
			Assert.assertEquals(actual, Expected, "Error messege on AD&D Benefit amount exceed for Spouse is Not Displayed");

			log.info("Error Message on AD&D Benefit amount exceed for Spouse is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Error Message on AD&D Benefit amount exceed for Spouse || Fail" + e.getMessage());
			throw (e);
		}
	}


	public boolean validates_that_Rider_Message_is_displayed_for_Self_under_GTLI() throws Exception {
		try {
			log.debug("Validates that Rider Message is displayed for Self under GTLI");
			String expected = PropertyUtility.Load_MessageFile_Data("RiderMessageCRBG");
			reuseMethod.scrollDown(RiderMessage_CRBG);
			RiderMessage_CRBG.isDisplayed();
			String actual = RiderMessage_CRBG.getText();
			System.err.println("Rider Message for Self Under GTLI is==" + actual);
			Assert.assertEquals(actual, expected, "Rider Message is not displayed for Self under GTLI");
			log.info("Rider Message is displayed for Self under GTLI sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validates that Rider Message for Self under GTLI || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_that_Basic_Life_Coverage_Message_is_displayed_for_Self_under_GTLI() throws Exception {
		try {
			log.debug("Validates that Basic Life Coverage Message is displayed for Self under GTLI");
			String expected = PropertyUtility.Load_MessageFile_Data("BasicLifeCoverageMessage");
			reuseMethod.scrollDown(BasicLifeCoverage);
			BasicLifeCoverage.isDisplayed();
			String actual = BasicLifeCoverage.getText();
			System.err.println("Basic Life Coverage Message for Self Under GTLI is==" + actual);
			Assert.assertEquals(actual, expected, "Basic Life Coverage Message is not displayed for Self under GTLI");
			log.info("Basic Life Coverage Message is displayed for Self under GTLI sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validates that Basic Life Coverage Message  for Self under GTLI || Fail"+ e.getMessage());
			throw (e);
		}

	}

	public boolean validates_Guaranteed_Issue_Coverage_is_Not_displayed_for_Self_under_GTLI() throws Throwable {
		try {
			log.debug("Validates Guaranteed Issue Coverage is Not displayed for Self under GTLI");
			boolean check=GuarantedIssueCoverage_Self.isDisplayed();
			assertFalse(check, "Guaranteed Issue Coverage is displayed for Self under GTLI");
			System.out.println("Guaranteed Issue Coverage is Not displayed for Self under GTLI");
			log.info("Guaranteed Issue Coverage is Not displayed for Self under GTLI sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validates Guaranteed Issue Coverage is Not displayed for Self under GTLI || Fail"+ e.getMessage());
			throw (e);
		}

	}
	
	public boolean validates_Guaranteed_Issue_Coverage_is_Not_displayed_for_Spouse_under_GTLI() throws Throwable {
		try {
			log.debug("Validates Guaranteed Issue Coverage is Not displayed for Spouse under GTLI");
			boolean check=GuarantedIssueCoverage_Spouse.isDisplayed();
			assertFalse(check, "Guaranteed Issue Coverage is displayed for Spouse under GTLI");
			System.out.println("Guaranteed Issue Coverage is Not displayed for Spouse under GTLI");
			log.info("Guaranteed Issue Coverage is Not displayed for Spouse under GTLI sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validates Guaranteed Issue Coverage is Not displayed for Spouse under GTLI || Fail"+ e.getMessage());
			throw (e);
		}

	}
	
	public boolean validates_Guaranteed_Issue_Coverage_is_displayed_for_Self_under_GTLI() throws Throwable {
		try {
			log.debug("Validates Guaranteed Issue Coverage is  displayed for Self under GTLI");
			boolean check=GuarantedIssueCoverage_Self.isDisplayed();
			assertTrue(check, "Guaranteed Issue Coverage is not displayed for Self under GTLI");
			System.out.println("Guaranteed Issue Coverage is displayed for Self under GTLI");
			log.info("Guaranteed Issue Coverage is  displayed for Self under GTLI sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validates Guaranteed Issue Coverage is displayed for Self under GTLI || Fail"+ e.getMessage());
			throw (e);
		}

	}
	
	public boolean validates_Guaranteed_Issue_Coverage_is_displayed_for_Spouse_under_GTLI() throws Throwable {
		try {
			log.debug("Validates Guaranteed Issue Coverage is  displayed for Spouse under GTLI");
			boolean check=GuarantedIssueCoverage_Spouse.isDisplayed();
			assertTrue(check, "Guaranteed Issue Coverage is not  displayed for Spouse under GTLI");
			System.out.println("Guaranteed Issue Coverage is displayed for Spouse under GTLI");
			log.info("Guaranteed Issue Coverage is displayed for Spouse under GTLI sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validates Guaranteed Issue Coverage is displayed for Spouse under GTLI || Fail"+ e.getMessage());
			throw (e);
		}

	}
	
	public boolean validates_that_Supplemental_Spouse_Coverage_Message_is_displayed_for_Spouse_under_GTLI() throws Exception {
		try {
			log.debug("Validates that Supplemental Spouse Coverage Message is displayed for Spouse under GTLI");
			String expected = PropertyUtility.Load_MessageFile_Data("SupplementalSpouseCoverageMessage");
			reuseMethod.scrollDown(SupplementCoverageMessage_Spouse);
			SupplementCoverageMessage_Spouse.isDisplayed();
			String actual = SupplementCoverageMessage_Spouse.getText();
			System.err.println("Supplemental Spouse Coverage Message for Self Under GTLI is==" + actual);
			Assert.assertEquals(actual, expected, "Supplemental Spouse Coverage Message is not displayed for Spouse under GTLI");
			log.info("Supplemental Spouse Coverage Message is displayed for Spouse under GTLIsucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validates that Supplemental Spouse Coverage Message || Fail"+ e.getMessage());
			throw (e);
		}

	}
	
	
	public boolean verify_Type_of_Coverage_Change_in_Coverage_is_Unavailable_for_Spouse_under_GTLI() throws Throwable {

		try {
			log.debug("Verify Type of Coverage Change in Coverage is Unavailable for Spouse under GTLI");

			Assert.assertFalse(ChangeInCoverage_GTLISpouse.isDisplayed(),"Bug|| Change In coverage is displayed for Spouse");
			System.out.println("Type of Coverage Change in Coverage is Unavailable for Spouse under GTLI");
			log.info("Verified Type of Coverage Change in Coverage is Unavailable for Spouse under GTLI successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify Type of Coverage Change in Coverage is Unavailable for Spouse under GTLI || Fail"+ e.getMessage());
			throw (e);

		}
	}
	public boolean verify_Type_of_Coverage_Change_in_Coverage_is_Available_for_Spouse_under_GTLI() throws Exception {

		try {
			log.debug("Verify Type of Coverage Change in Coverage is Available for Spouse under GTLI");

			Assert.assertTrue(ChangeInCoverage_GTLISpouse.isDisplayed(),"Bug|| Change In coverage is not displayed for Spouse");
			System.out.println("Type of Coverage Change in Coverage is Available for Spouse under GTLI");
			log.info("Verified Type of Coverage Change in Coverage is Available for Spouse under GTLI successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify Type of Coverage Change in Coverage is Available for Spouse under GTLI || Fail"+ e.getMessage());
			throw (e);

		}
	}
	/// Change In Coverage Locator is different for Group Term Life Insurance in CRBG site
	public boolean selects_Type_of_Coverage_as_for_Spouse_under_GTLI(String STypeofCove) throws Exception {

		try {
			log.debug("Select type of coverage for spouse for TermLife or ARTL");
			
			reuseMethod.selectSinglevalue(New_GTLISpouse, ChangeInCoverage_GTLISpouse, STypeofCove);

			log.info("Coverage type selected for spouse for TermLife or ARTL successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select coverage type for spouse for TermLife or ARTL|| Fail" + e.getMessage());
			throw (e);

		}

	}
	
	public boolean verify_Benefit_Amount_as_for_Child_under_GTLI_on_Request_Coverage_Page(String Value) throws Exception {
		try {
			log.debug("Verify Benefit Amount for Child under GTLI ");

			reuseMethod.scrollDown(BenefitAmtChild_GTLI);
			BenefitAmtChild_GTLI.isDisplayed();
			String actual = BenefitAmtChild_GTLI.getText();

			Assert.assertEquals(actual, Value, "Benefit Amount for Child under GTLI is not validated");
			log.info("Benefit Amount for Child under GTLI is validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validates that Benefit Amount for Child under GTLI || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean verify_Benefit_Amount_as_for_Spouse_under_GTLI_on_Request_Coverage_Page(String Value) throws Exception {
		try {
			log.debug("Verify Benefit Amount for Spouse under GTLI ");

			reuseMethod.scrollDown(BenefitAmtSpouse_GTLI);
			BenefitAmtSpouse_GTLI.isDisplayed();
			String actual = BenefitAmtSpouse_GTLI.getText();

			Assert.assertEquals(actual, Value, "Benefit Amount for Spouse under GTLI is not validated");
			log.info("Benefit Amount for Spouse under GTLI is validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validates that Benefit Amount for Spouse under GTLI || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Yes_for_all_Health_Questions_of_Request_Coverage_under_Self() throws Exception {

		try {
			log.debug("Selects Yes for all Health Questions of Request Coverage under Self");
			Thread.sleep(1000);
			reuseMethod.scrollDown(prescribedMedicationSelf_Yes);
			prescribedMedicationSelf_Yes.click();
			Thread.sleep(1000);
			physicianSelf_Yes.click();
			Thread.sleep(1000);
			AlcoholSelf_Yes.click();
			Thread.sleep(1000);
			log.info(
					"Health Questions of Request Coverage under Self are answered as YES for self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer Health Questions of Request Coverage under Self || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean selects_Yes_for_Prescribed_Medication_of_Request_Coverage_under_Self() throws Exception {

		try {
			log.debug("Selects Yes for Prescribed_Medication Question of Request Coverage under Self");
			Thread.sleep(1000);
			reuseMethod.scrollDown(prescribedMedicationSelf_Yes);
			prescribedMedicationSelf_Yes.click();
			Thread.sleep(1000);
			log.info(
					"Health Questions of Request Coverage for Prescribed_Medication under Self are answered as YES for self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer Health Questions of Request Coverage under Self || Fail" + e.getMessage());
			throw (e);
		}
	}

	
	public boolean selects_Yes_for_Physician_diagnose_of_Request_Coverage_under_Self() throws Exception {

		try {
			log.debug("Selects Yes for Prescribed_Medication Question of Request Coverage under Self");
			Thread.sleep(1500);
			reuseMethod.scrollDown(physicianSelf_Yes);
			physicianSelf_Yes.click();
			Thread.sleep(1000);
			log.info(
					"Health Questions of Request Coverage for Physician under Self are answered as YES for self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer Health Questions for Physician of Request Coverage under Self || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean selects_Yes_for_Alcohol_Drugs_of_Request_Coverage_under_Self() throws Exception {

		try {
			log.debug("Selects Yes for Prescribed_Medication Question of Request Coverage under Self");
			Thread.sleep(1000);
			reuseMethod.scrollDown(AlcoholSelf_Yes);
			AlcoholSelf_Yes.click();
			Thread.sleep(1000);
			log.info(
					"Health Questions of Request Coverage for Alcohol under Self are answered as YES for self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer Health Questions for alcohol of Request Coverage under Self || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	

	
	public boolean selects_Yes_for_all_Health_Questions_Request_Coverage_under_Spouse()throws Exception {

		try {
			log.debug("Selects Yes for all Health Questions Request Coverage under Spouse");
			Thread.sleep(1000);
			reuseMethod.scrollDown(prescribedMedicationSpouse_Yes);
			prescribedMedicationSpouse_Yes.click();
			Thread.sleep(1000);
			physicianSpouse_Yes.click();
			Thread.sleep(1000);
			AlcoholSpouse_Yes.click();
			Thread.sleep(1000);
			
			log.info("Request coverage health question page answered as YES for spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer on Request coverage health question page as YES for spouse || Fail"+ e.getMessage());
			throw (e);
		}
	}
	
	public boolean selects_No_for_all_Health_Questions_of_Request_Coverage_under_Self() throws Exception {

		try {
			log.debug("Selects No for all Health Questions of Request Coverage under Self");
			Thread.sleep(1000);

			prescribedMedicationSelf_No_cat.click();
			Thread.sleep(1000);
			physicianSelf_No.click();
			Thread.sleep(1000);
			AlcoholSelf_No.click();
			Thread.sleep(1000);
			log.info("Health Questions of Request Coverage under Self are answered as No for self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer on Health Questions of Request Coverage as No under Self || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_No_for_all_Health_Questions_Request_Coverage_under_Spouse() throws Exception {

		try {
			log.debug("Selects No for all Health Questions Request Coverage under Spouse");
			Thread.sleep(1000);
			reuseMethod.scrollDown(prescribedMedicationSpouse_Yes);
			prescribedMedicationSpouse_No.click();
			Thread.sleep(1000);
			physicianSpouse_No.click();
			Thread.sleep(1000);
			AlcoholSpouse_No.click();
			Thread.sleep(1000);

			log.info("Request coverage health question page answered as No for spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer on Request coverage health question page as No for spouse || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean navigate_back_to_Coverage_page() throws Exception {
		try {
			log.debug("Navigate back to Coverage page");

			reuseMethod.scrollDown(Coverage_Icon);
			Coverage_Icon.click();
			log.info("Coverage page is Navigateed sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("No able to Navigate back to Coverage page|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Benefit_Amount_for_Self_as_under_PAI(String amount) throws Exception {

		try {

			log.debug("Selects Benefit Amount for Self under Premier Accident Insurance");
			if (!RequestedAmount_PAI_Self.isDisplayed()) {

				AccidentalDeathLabel.click();
				Thread.sleep(2000);
			}

			Thread.sleep(500);
			RequestedAmount_PAI_Self.isDisplayed();
			reuseMethod.dropDownselectbyvalue(RequestedAmount_PAI_Self, amount);

			Thread.sleep(1000);

			log.info(" Benefit Amount for Self under Premier Accident Insurance is selected  sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Selects Benefit Amount for Self under Premier Accident Insurance|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}
	
	public boolean validates_Benefit_Amount_for_Spouse_as_under_PAI(String amount) throws Exception {

		try {
			log.debug("Validates Benefit Amount for Spouse under PAI");
			RequestedAmount_PAI_Spouse.isDisplayed();
			String Actual = RequestedAmount_PAI_Spouse.getAttribute("value");
			assertEquals(Actual, amount, "Benefit Amount for Spouse is not validated..");
			log.info("Benefit Amount for Spouse under PAI are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Benefit Amount for Spouse under PAI|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean validates_Benefit_Amount_for_Child_as_under_PAI(String amount) throws Exception {

		try {
			log.debug("Validates Benefit Amount for Child under PAI");
			RequestedAmount_PAI_Child.isDisplayed();
			String Actual = RequestedAmount_PAI_Child.getAttribute("value");
			assertEquals(Actual, amount, "Benefit Amount for Child is not validated..");
			log.info("Benefit Amount for Child under PAI are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Benefit Amount for Child under PAI|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean validates_under_PAI_the_Benefit_Amount_listed_for_Self_are(String amount) throws Exception {

		try {
			log.debug("Validate PAI Benefit Amount for Self dropdown");
			List<WebElement> SelfBeneAmt_PAI = reuseMethod.dropDowngetOption(RequestedAmount_PAI_Child);
			for (WebElement we : SelfBeneAmt_PAI) {
				if (we.getText().equals(amount)) {
					System.out.println("Value for PAI Dropdown list is matched for Self..." + we.getText());

				}

			}

			log.info("Dropdown values for PAI Self Benefit dropdown Values are validated sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Dropdown values for PAI Self Benefit dropdown Values|| Fail"
					+ e.getMessage());

			throw (e);
		}

	}

	}

	



