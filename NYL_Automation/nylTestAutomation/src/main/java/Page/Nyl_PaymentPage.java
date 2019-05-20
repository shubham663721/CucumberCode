package Page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import Selenium.ScreenShotUtility;
import Selenium.SetUp;

//import Utility.Excel_Utility;

import Utility.ReuseableMethod;

public class Nyl_PaymentPage extends SetUp {

//public WebDriver driver = null;
	private final Logger log = LogManager.getLogger(Nyl_PaymentPage.class.getName());

	public Nyl_PaymentPage() {
		driver = getDriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	ReuseableMethod reuseMethod = new ReuseableMethod();

	ScreenShotUtility screenShotUtility = new ScreenShotUtility();

	@FindBy(id = "skipPayment")
	WebElement SkipPayment;

	@FindBy(xpath = "//label[contains(text(),'Payment Information')]")
	WebElement Payment_Info;

	@FindBy(xpath = "//label[text()='Thank you! Your application has been received.']")
	WebElement FinalTextMsg;

	@FindBy(xpath = "//div[@class='dispay-receipt-no']")
	WebElement ReceiptNum;

	@FindBy(id = "paymentLIFiveYr_txtPaymentMethod")
	WebElement PaymentMethod_FiveYear;

	@FindBy(id = "paymentLIFiveYr_selPaymentFrequency")
	WebElement PaymentFrequency_FiveYear;

	@FindBy(id = "paymentLITenYr_txtPaymentMethod")
	WebElement PaymentMethod_TenYear;

	@FindBy(xpath = "//input[@name='existing-payment']")
	WebElement ExistingPayment;

	@FindBy(id = "paymentLITenYr_selPaymentFrequency")
	WebElement PaymentFrequency_TenYear;

	@FindBy(id = "paymentLITwentyYr_txtPaymentMethod")
	WebElement PaymentMethod_TwentyYear;

	@FindBy(id = "paymentLITwentyYr_selPaymentFrequency")
	WebElement PaymentFrequency_TwentyYear;

	@FindBy(id = "paymentLIFiftyYr_txtPaymentMethod")
	WebElement PaymentMethod_FiftyYear;

	@FindBy(id = "paymentLIFiftyYr_selPaymentFrequency")
	WebElement PaymentFrequency_FiftyYear;

	@FindBy(id = "paymentAccdntDeath_txtPaymentMethod")
	WebElement PaymentMethod_AccidentDeath;

	@FindBy(id = "paymentAccdntDeath_selPaymentFrequency")
	WebElement PaymentFrequency_AccidentDeath;

	@FindBy(id = "paymentDILongPlus_txtPaymentMethod")
	WebElement PaymentMethod_LTDP;

	@FindBy(id = "paymentDILongPlus_selPaymentFrequency")
	WebElement PaymentFrequency_LTDP;

	@FindBy(id = "paymentDILong_txtPaymentMethod")
	WebElement PaymentMethod_LTD;

	@FindBy(id = "paymentDILong_selPaymentFrequency")
	WebElement PaymentFrequency_LTD;

	@FindBy(id = "paymentDIShort_txtPaymentMethod")
	WebElement PaymentMethod_MidTerm;

	@FindBy(id = "paymentDIShort_selPaymentFrequency")
	WebElement PaymentFrequency_MidTerm;

	@FindBy(id = "paymentDIRetirement_txtPaymentMethod")
	WebElement PaymentMethod_Retire;

	@FindBy(id = "paymentDIRetirement_selPaymentFrequency")
	WebElement PaymentFrequency_Retire;

	@FindBy(id = "paymentGrpOffOvr_txtPaymentMethod")
	WebElement PaymentMethod_Prof;

	@FindBy(id = "paymentGrpOffOvr_selPaymentFrequency")
	WebElement PaymentFrequency_Prof;

	@FindBy(id = "paymentCICriticalIllness_txtPaymentMethod")
	WebElement PaymentMethod_CI;

	@FindBy(id = "paymentCICriticalIllness_selPaymentFrequency")
	WebElement PaymentFrequency_CI;

	@FindBy(id = "paymentHospitalIndem_txtPaymentMethod")
	WebElement PaymentMethod_HospitalMoneyIns;

	@FindBy(id = "paymentHospitalIndem_selPaymentFrequency")
	WebElement PaymentFrequency_HospitalMoneyIns;

	@FindBy(id = "paymentLIAnnual_txtPaymentMethod")
	WebElement PaymentMethod_TermLife;

	@FindBy(id = "paymentLIAnnual_selPaymentFrequency")
	WebElement PaymentFrequency_TermLife;

	@FindBy(id = "paymentDIGrpDisable_txtPaymentMethod")
	WebElement PaymentMethod_DisabilityIncome;

	@FindBy(id = "paymentDIGrpDisable_selPaymentFrequency")
	WebElement PaymentFrequency_DisabilityIncome;

	@FindBy(xpath = "//a[@id='skipPayment']")
	WebElement skipPayment;

	@FindBy(xpath = "//ul[@id='rdPaymentMethod']/li/label[contains(@class,'money')]")
	WebElement Billme;

	@FindBy(xpath = "//ul[@id='rdPaymentMethod']/li/label[contains(@class,'university')]")
	WebElement Bank;

	@FindBy(xpath = "//span[@class='label-text']")
	WebElement Estimated_Premium;

	@FindBy(xpath = "//span[@class='rate-item-value']")
	WebElement Total_val;

	/*
	 * @FindBy(id="rdPaymentMethod-1") WebElement Bank;
	 */

	@FindBy(id = "addBen")
	WebElement Save;

	@FindBy(id = "submit")
	WebElement alertYES;

	@FindBy(id = "next")
	WebElement Next;

	@FindBy(id = "txtPDBankName")
	WebElement BankName;

	@FindBy(id = "txtPDAccountOwnerName")
	WebElement AccountName;

	@FindBy(id = "txtPDRoutingNum")
	WebElement RountingNumber;

	@FindBy(id = "txtPDAccountNum")
	WebElement AccountNumber;

	@FindBy(id = "chkPaymentAuthorization")
	WebElement paymentauthorize;
	
	@FindBy(id="chkAuthenticnAuthorization")
	WebElement SunLife_authorize;

	@FindBy(id = "authText")
	WebElement print;

	@FindBy(xpath = "//label[@for='rdAddPayment-0']")
	WebElement mobBiledYes;

	@FindBy(xpath = "//label[@for='rdAddPayment-1']")
	WebElement mobBiledNo;
	
	@FindBy(id="firstName")
	WebElement Card_FName;
	
	@FindBy(id="lastName")
	WebElement Card_LName;
	
	@FindBy(xpath="//input[@id='ccNum' and @type='number']")
	WebElement Card_Number;
	
	@FindBy(xpath="//input[@id='datetimepicker']")
	WebElement Card_ExpDate;
	
	

	// ======================MOBILE===============================//
	/*
	 * @FindBy(xpath="(//div[@id='rdAddPayment']//label//i)[1]") WebElement
	 * PaymentYes;
	 * 
	 * @FindBy(xpath="(//div[@id='rdAddPayment']//label//i)[2]") WebElement
	 * PaymentNo;
	 */

	@FindBy(xpath = "//div[@id='div_paymentLIFiveYr_lblProductName']/following-sibling::div/i")
	WebElement Traditional_arrow_Mobile;

	@FindBy(xpath = "//div[@id=\"paymentLIFiveYr\"]//div[@name='rdPaymentMethod']//label//i")
	WebElement Traditional_BillMe_Mobile;

	@FindBy(xpath = "//div[@id='div_paymentLITenYr_lblProductName']/following-sibling::div/i")
	WebElement TenYr_arrow_Mobile;

	@FindBy(xpath = "//div[@id='paymentLITenYr']//div[@name='rdPaymentMethod']//label/i")
	WebElement Tenyr_BillMe_Mobile;

	@FindBy(xpath = "//div[@id='div_paymentLITwentyYr_lblProductName']/following-sibling::div/i")
	WebElement TwentyYr_arrow_Mobile;

	@FindBy(xpath = "//div[@id='paymentLITwentyYr']//div[@name='rdPaymentMethod']//label/i")
	WebElement Twentyyr_BillMe_Mobile;

	@FindBy(xpath = "//div[@id='div_paymentDIGrpDisable_lblProductName']/following-sibling::div")
	WebElement LongTerm_arrow_Mobile;

	@FindBy(xpath = "//div[@id='paymentDIGrpDisable']//div[@name='rdPaymentMethod']//label//i")
	WebElement LongTerm_BillMe_Mobile;

	@FindBy(xpath = "//div[@id='div_paymentDIShort_lblProductName']/following-sibling::div/i")
	WebElement ShortTerm_arrow_Mobile;

	@FindBy(xpath = "//div[@id='div_paymentGrpOffOvr_lblProductName']/following-sibling::div/i")
	WebElement Business_arrow_Mobile;

	@FindBy(xpath = "//div[@id='paymentDIShort']//div[@name='rdPaymentMethod']//label//i")
	WebElement ShortTerm_BillMe_Mobile;

	@FindBy(xpath = "//div[@id='paymentGrpOffOvr']//div[@name='rdPaymentMethod']//label//i")
	WebElement BusinessOver_BillMe_Mobile;

	@FindBy(id = "paymentLIFiveYr_selPaymentFrequency")
	WebElement TraditionalFreq_Mobile;

	@FindBy(xpath = "//div[@id='div_paymentLIFiveYr_txtPaymentAmtSlf']//following-sibling::label[2]")
	WebElement SelfTrad_EstimatedRate_Mobile;

	// @FindBy(xpath="//span[text()='Self:']//following::span[1]")
	// @FindBy(xpath="//div[@id='paymentLIFiveYr']//span[text()='Self:']//following::span[1]")
	@FindBy(xpath = "//div[@id='paymentLIFiveYr']//span[text()='Self:']//following::span[1][@class='rate-item-value']")
	WebElement SelfFiveYr_EstimatedRate;

	@FindBy(xpath = "//div[@id='div_paymentLIFiveYr_txtPaymentAmtSps']//following-sibling::label[2]")
	WebElement SpouseTrad_EstimatedRate_Mobile;
	// WAEPA
	@FindBy(xpath = "//div[@id='paymentLIFiveYr']//span[text()='Spouse:']//following::span[1]")
	WebElement SpouseFiveYr_EstimatedRate;

	@FindBy(xpath = "//div[@id='div_paymentLIFiveYr_txtPaymentAmtChd']//following-sibling::label[2]")
	WebElement ChildTrad_EstimatedRate_Mobile;
	// WAEPA
	@FindBy(xpath = "//div[@id='paymentLIFiveYr']//span[text()='Child:']//following::span[1]")
	WebElement ChildFiveYr_EstimatedRate;

	@FindBy(xpath = "//div[@id='div_paymentLIFiveYr_txtTotalNetAmt']//following-sibling::label[2]")
	WebElement TotalTrad_EstimatedRate_Mobile;
	// WAEPA
	@FindBy(xpath = "//div[@id='paymentLIFiveYr']//span[text()='Total:']//following::span[1]")
	WebElement TotalFiveYr_EstimatedRate;
	// WAEPA
	@FindBy(xpath = "//div[@id='paymentLIFiveYr']//span[text()='Dependents:']//following::span[1]")
	WebElement DependentsFiveYr_EstimatedRate;

	@FindBy(id = "paymentLITenYr_selPaymentFrequency")
	WebElement TenYearFreq_Mobile;

	@FindBy(xpath = "//div[@id='div_paymentLITenYr_txtPaymentAmtSlf']//following-sibling::label[2]")
	WebElement SelfTenYr_EstimatedRate_Mobile;

	@FindBy(xpath = "//div[@id='div_paymentLITenYr_txtPaymentAmtSps']//following-sibling::label[2]")
	WebElement SpouseTenYr_EstimatedRate_Mobile;

	@FindBy(xpath = "//div[@id='div_paymentLITenYr_txtTotalNetAmt']//following-sibling::label[2]")
	WebElement TotalTenYr_EstimatedRate_Mobile;

	@FindBy(id = "paymentLITwentyYr_selPaymentFrequency")
	WebElement TwentyYearFreq_Mobile;

	@FindBy(xpath = "//div[@id='div_paymentLITwentyYr_txtPaymentAmtSlf']//following-sibling::label[2]")
	WebElement SelfTwentyYr_EstimatedRate_Mobile;

	@FindBy(xpath = "//div[@id='div_paymentLITwentyYr_txtPaymentAmtSps']//following-sibling::label[2]")
	WebElement SpouseTwentyYr_EstimatedRate_Mobile;

	@FindBy(xpath = "//div[@id='div_paymentLITwentyYr_txtTotalNetAmt']//following-sibling::label[2]")
	WebElement TotalTwentyYr_EstimatedRate_Mobile;

	@FindBy(id = "paymentDIGrpDisable_selPaymentFrequency")
	WebElement LongTerm_Freq_Mobile;

	@FindBy(xpath = "//div[@id='div_paymentDIGrpDisable_txtPaymentAmtSlf']//following-sibling::label[2]")
	WebElement SelfLongDisYr_EstimatedRate_Mobile;

	@FindBy(xpath = "//div[@id='div_paymentDIGrpDisable_txtPaymentAmtSps']//following-sibling::label[2]")
	WebElement SpouseLongDisYr_EstimatedRate_Mobile;

	@FindBy(xpath = "//div[@id='div_paymentDIGrpDisable_txtTotalNetAmt']//following-sibling::label[2]")
	WebElement TotalLongDisYr_EstimatedRate_Mobile;

	@FindBy(id = "paymentDIShort_selPaymentFrequency")
	WebElement ShortTerm_Freq_Mobile;

	@FindBy(xpath = "//div[@id='div_paymentDIShort_txtPaymentAmtSlf']//following-sibling::label[@class='rate']")
	WebElement SelfShortDisYr_EstimatedRate_Mobile;

	@FindBy(xpath = "//div[@id='div_paymentDIShort_txtPaymentAmtSps']//following-sibling::label[@class='rate']")
	WebElement SpouseShortDisYr_EstimatedRate_Mobile;

	@FindBy(xpath = "//div[@id='div_paymentDIShort_txtTotalNetAmt']//following-sibling::label[@class='rate']")
	WebElement TotalShortDisYr_EstimatedRate_Mobile;

	@FindBy(id = "paymentGrpOffOvr_selPaymentFrequency")
	WebElement BusinessOver_Freq_Mobile;

	@FindBy(xpath = "//div[@id='div_paymentGrpOffOvr_txtPaymentAmtSlf']//following-sibling::label[2]")
	WebElement SelfBusinessOver_EstimatedRate_Mobile;

	@FindBy(xpath = "//div[@id='div_paymentGrpOffOvr_txtTotalNetAmt']//following-sibling::label[2]")
	WebElement TotalBusinessOver_EstimatedRate_Mobile;

	@FindBy(xpath = "//h1[text()='Payment']")
	WebElement payment_page_Mobile;

	/*----------------------------- Estimated Premium Rates for ABE-------------------------------- */

	/*************************
	 * Five Year Level
	 *************************************/

	@FindBy(xpath = "//div[@id='paymentLIFiveYr']//label//b//span[contains(text(),'Estimated Premium')]")
	WebElement EstimatedRate_FiveYear;

	@FindBy(xpath = "//div[@id='paymentLIFiveYr']//span[text()='Self:']//following::span[1]")
	WebElement SelfFiveYear_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentLIFiveYr']//span[text()='Spouse:']//following::span[1]")
	WebElement SpouseFiveYear_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentLIFiveYr']//span[text()='Child(ren):']//following::span[1]")
	WebElement ChildFiveYear_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentLIFiveYr']//span[text()='Total:']//following::span[1]")
	WebElement TotalAmountFiveYear_EstimatedRate;

	/************************* Ten Year Level *************************************/

	@FindBy(xpath = "//div[@id='paymentLITenYr']//label//b//span[contains(text(),'Estimated Premium')]")
	WebElement EstimatedRate_TenYear;

	@FindBy(xpath = "//div[@id='paymentLITenYr']//span[text()='Self:']//following::span[1]")
	WebElement SelfTenYear_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentLITenYr']//span[text()='Spouse:']//following::span[1]")
	WebElement SpouseTenYear_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentLITenYr']//span[text()='Child(ren):']//following::span[1]")
	WebElement ChildTenYear_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentLITenYr']//span[text()='Total:']//following::span[1]")
	WebElement TotalAmountTenYear_EstimatedRate;

	/**************************
	 * Twenty Year Level
	 *************************************/

	@FindBy(xpath = "//div[@id='paymentLITwentyYr']//label//b//span[contains(text(),'Estimated Premium')]")
	WebElement EstimatedRate_TwentyYear;

	@FindBy(xpath = "//div[@id='paymentLITwentyYr']//span[text()='Self:']//following::span[1]")
	WebElement SelfTwentyYear_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentLITwentyYr']//span[text()='Spouse:']//following::span[1]")
	WebElement SpouseTwentyYear_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentLITwentyYr']//span[text()='Child(ren):']//following::span[1]")
	WebElement ChildTwentyYear_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentLITwentyYr']//span[text()='Total:']//following::span[1]")
	WebElement TotalAmountTwentyYear_EstimatedRate;

	/***************************
	 * Fifty Year Level
	 *************************************/

	@FindBy(xpath = "//div[@id='paymentLIFiftyYr']//label//b//span[contains(text(),'Estimated Premium')]")
	WebElement EstimatedRate_FiftyYear;

	@FindBy(xpath = "//div[@id='paymentLIFiftyYr']//span[text()='Self:']//following::span[1]")
	WebElement SelfFiftyYear_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentLIFiftyYr']//span[text()='Spouse:']//following::span[1]")
	WebElement SpouseFiftyYear_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentLIFiftyYr']//span[text()='Child(ren):']//following::span[1]")
	WebElement ChildFiftyYear_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentLIFiftyYr']//span[text()='Total:']//following::span[1]")
	WebElement TotalAmountFiftyYear_EstimatedRate;

	/******************
	 * Accidental Death and Dismemberment Insurance
	 *****************/

	@FindBy(xpath = "//div[@id='paymentAccdntDeath']//label//b//span[contains(text(),'Estimated Premium')]")
	WebElement EstimatedRate_ADDI;

	@FindBy(xpath = "//div[@id='paymentAccdntDeath']//span[text()='Self:']//following::span[1]")
	WebElement SelfADDI_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentAccdntDeath']//span[text()='Spouse:']//following::span[1]")
	WebElement SpouseADDI_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentAccdntDeath']//span[text()='Child(ren):']//following::span[1]")
	WebElement ChildADDI_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentAccdntDeath']//span[text()='Total:']//following::span[1]")
	WebElement TotalAmountADDI_EstimatedRate;

	/***************** Long-Term Disability Plus Insurance *****************/

	@FindBy(xpath = "//div[@id='paymentDILongPlus']//label//b//span[contains(text(),'Estimated Premium')]")
	WebElement EstimatedRate_LTDP;

	@FindBy(xpath = "//div[@id='paymentDILongPlus']//span[text()='Self:']//following::span[1]")
	WebElement SelfLTDP_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentDILongPlus']//span[text()='Spouse:']//following::span[1]")
	WebElement SpouseLTDP_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentDILongPlus']//span[text()='Child(ren):']//following::span[1]")
	WebElement ChildLTDP_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentDILongPlus']//span[text()='Total:']//following::span[1]")
	WebElement TotalAmountLTDP_EstimatedRate;

	/***************** Long-Term Disability Insurance *****************/

	@FindBy(xpath = "//div[@id='paymentDILong']//label//b//span[contains(text(),'Estimated Premium')]")
	WebElement EstimatedRate_LTD;

	@FindBy(xpath = "//div[@id='paymentDILong']//span[text()='Self:']//following::span[1]")
	WebElement SelfLTD_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentDILong']//span[text()='Spouse:']//following::span[1]")
	WebElement SpouseLTD_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentDILong']//span[text()='Child(ren):']//following::span[1]")
	WebElement ChildLTD_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentDILong']//span[text()='Total:']//following::span[1]")
	WebElement TotalAmountLTD_EstimatedRate;

	/***************** MID-Term Disability Insurance *****************/

	@FindBy(xpath = "//div[@id='paymentDIShort']//label//b//span[contains(text(),'Estimated Premium')]")
	WebElement EstimatedRate_MTD;

	@FindBy(xpath = "//div[@id='paymentDIShort']//span[text()='Self:']//following::span[1]")
	WebElement SelfMTD_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentDIShort']//span[text()='Spouse:']//following::span[1]")
	WebElement SpouseMTD_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentDIShort']//span[text()='Child(ren):']//following::span[1]")
	WebElement ChildMTD_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentDIShort']//span[text()='Total:']//following::span[1]")
	WebElement TotalAmountMTD_EstimatedRate;

	/***************** Retirement Disability Insurance *****************/

	@FindBy(xpath = "//div[@id='paymentDIRetirement']//label//b//span[contains(text(),'Estimated Premium')]")
	WebElement EstimatedRate_RDI;

	@FindBy(xpath = "//div[@id='paymentDIRetirement']//span[text()='Self:']//following::span[1]")
	WebElement SelfRDI_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentDIRetirement']//span[text()='Total:']//following::span[1]")
	WebElement TotalAmountRDI_EstimatedRate;

	/********* Professional Overhead Expense Disability Insurance *****************/

	@FindBy(xpath = "//div[@id='paymentGrpOffOvr']//label//b//span[contains(text(),'Estimated Premium')]")
	WebElement EstimatedRate_POEDI;

	@FindBy(xpath = "//div[@id='paymentGrpOffOvr']//span[text()='Self:']//following::span[1]")
	WebElement SelfPOEDI_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentGrpOffOvr']//span[text()='Total:']//following::span[1]")
	WebElement TotalAmountPOEDI_EstimatedRate;

	/***************** Hospital Money Insurance *****************/

	@FindBy(xpath = "//div[@id='paymentHospitalIndem']//label//b//span[contains(text(),'Estimated Premium')]")
	WebElement EstimatedRate_HMI;

	@FindBy(xpath = "//div[@id='paymentHospitalIndem']//span[text()='Self:']//following::span[1]")
	WebElement SelfHMI_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentHospitalIndem']//span[text()='Spouse:']//following::span[1]")
	WebElement SpouseHMI_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentHospitalIndem']//span[text()='Child(ren):']//following::span[1]")
	WebElement ChildHMI_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentHospitalIndem']//span[text()='Total:']//following::span[1]")
	WebElement TotalAmountHMI_EstimatedRate;

	/***************** Critical Illness *****************/

	@FindBy(xpath = "//div[@id='paymentCICriticalIllness']//label//b//span[contains(text(),'Estimated Premium')]")
	WebElement EstimatedRate_CI;

	@FindBy(xpath = "//div[@id='paymentCICriticalIllness']//span[text()='Self:']//following::span[1]")
	WebElement SelfCI_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentCICriticalIllness']//span[text()='Spouse:']//following::span[1]")
	WebElement SpouseCI_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentCICriticalIllness']//span[text()='Child(ren):']//following::span[1]")
	WebElement ChildCI_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentCICriticalIllness']//span[text()='Total:']//following::span[1]")
	WebElement TotalAmountCI_EstimatedRate;

	/************************* Term Life *************************************/
	@FindBy(xpath = "//div[@id='paymentLIAnnual']//label//b//span[contains(text(),'Estimated Premium')]")
	WebElement EstimatedRate_TermLife;

	@FindBy(xpath = "//div[@id='paymentLIAnnual']//span[text()='Self:']//following::span[1]")
	WebElement SelfTermLife_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentLIAnnual']//span[text()='Spouse:']//following::span[1]")
	WebElement SpouseTermLife_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentLIAnnual']//span[text()='Child(ren):']//following::span[1]")
	WebElement ChildTermLife_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentLIAnnual']//span[text()='Total:']//following::span[1]")
	WebElement TotalAmountTermLife_EstimatedRate;
	
	/************************* Group Term Life *************************************/

	@FindBy(xpath = "//div[@id='paymentLIAnnual']//label//b[contains(text(),'Estimated Cost')]")
	WebElement EstimatedRate_GTLI;

	@FindBy(id = "paymentLIAnnual_txtPaymentAmtSlf")
	WebElement SelfGTLI_EstimatedRate;

	@FindBy(id = "paymentLIAnnual_txtPaymentAmtSps")
	WebElement SpouseGTLI_EstimatedRate;

	@FindBy(id = "paymentLIAnnual_txtPaymentAmtChd")
	WebElement ChildGTLI_EstimatedRate;

	@FindBy(id = "paymentLIAnnual_txtTotalNetAmt")
	WebElement TotalAmountGTLI_EstimatedRate;


	
	
	/************************** Disability Income Insurance *************************************/
	@FindBy(xpath = "//div[@id='paymentDIGrpDisable']//label//b//span[contains(text(),'Estimated Premium')]")
	WebElement EstimatedRate_DII;

	@FindBy(xpath = "//div[@id='paymentDIGrpDisable']//span[text()='Self:']//following::span[1]")
	WebElement SelfDII_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentDIGrpDisable']//span[text()='Spouse:']//following::span[1]")
	WebElement SpouseDII_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentDIGrpDisable']//span[text()='Child(ren):']//following::span[1]")
	WebElement ChildDII_EstimatedRate;

	@FindBy(xpath = "//div[@id='paymentDIGrpDisable']//span[text()='Total:']//following::span[1]")
	WebElement TotalAmountDII_EstimatedRate;

	@FindBy(id = "rdAccntHolderYN-0")
	WebElement YesAccHolder_Self;

	@FindBy(id = "paymentLIFiveYr_txtPaymentAmtSlf")
	WebElement EstimateCostSelf_GTLP75I;

	@FindBy(id = "paymentLIFiveYr_txtPaymentAmtSps")
	WebElement EstimateCostSpouse_GTLP75I;

	@FindBy(id = "paymentLIFiveYr_txtProvTaxAmt")
	WebElement EstimateCostProvincialTax_GTLP75I;

	@FindBy(id = "paymentLIFiveYr_txtTotalNetAmt")
	WebElement EstimateCostTotal_GTLP75I;
	
	@FindBy(id = "paymentLITenYr_txtPaymentAmtSlf")
	WebElement EstimateCostSelf_Flex10;

	@FindBy(id = "paymentLITenYr_txtPaymentAmtSps")
	WebElement EstimateCostSpouse_Flex10;

	@FindBy(id = "paymentLITenYr_txtProvTaxAmt")
	WebElement EstimateCostProvincialTax_Flex10;

	@FindBy(id = "paymentLITenYr_txtTotalNetAmt")
	WebElement EstimateCostTotal_Flex10;
	
	@FindBy(id = "paymentLITwentyYr_txtPaymentAmtSlf")
	WebElement EstimateCostSelf_Flex20;

	@FindBy(id = "paymentLITwentyYr_txtPaymentAmtSps")
	WebElement EstimateCostSpouse_Flex20;

	@FindBy(id = "paymentLITwentyYr_txtProvTaxAmt")
	WebElement EstimateCostProvincialTax_Flex20;

	@FindBy(id = "paymentLITwentyYr_txtTotalNetAmt")
	WebElement EstimateCostTotal_Flex20;
	
	@FindBy(id="radioAccountNum")
	WebElement Existing_Bank;

	/*************************
	 * Hospital Indemnity Insurance
	 *************************************/
	@FindBy(xpath = "//div[@id='paymentHospitalIndem']//p[contains(text(),'Not Available')]")
	WebElement EstimatedRate_NotAvailable;
	
	@FindBy(xpath = "//ul[@id='rdPaymentMethod']/li/label[contains(@class,'credit-card')]")
	WebElement CreditCard;

	/*----------------------------ENDS Here-------------------------------- */

	public boolean payment_page_details_are_displayed_to_user_and_skip_payment() throws Exception {

		try {
			log.debug("Skip the payment from the payment page");
			Thread.sleep(2000);
			SkipPayment.click();
			Thread.sleep(5000);
			log.info("Payment skipped successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Notable to skip payment || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean payment_Information_Page_is_displayed_to_user() throws Exception {

		try {
			log.debug("Payment Information Page is displayed to user");
			Payment_Info.isDisplayed();
			Thread.sleep(5000);
			log.info("Payment Information Page is displayed to user successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Payment Information Page || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean user_get_the_receipt_number_and_validate_Application_has_been_recieved() throws Exception {

		try {
			log.debug("Validate the recieved message and print the receipt number");
			String Expected = "Thank you! Your application has been received.";
			Thread.sleep(2000);
			String ActulText = FinalTextMsg.getText();
			Assert.assertEquals(ActulText, Expected);
			String receipt = ReceiptNum.getText();
			System.out.println(receipt);

			log.info("Get Receipt Number successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Notable to get receipt number || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean payment_Information_Page_is_displayed_to_user_and_user_Selects_Payment_option_as_Bank_for_Five_Yr_Product()
			throws Exception {

		try {
			log.debug("Payment Informtion page is displyed to user and select Payment Method as Bank for Five Year");

			Thread.sleep(1000);
			PaymentMethod_FiveYear.isDisplayed();
			Thread.sleep(2000);
			PaymentMethod_FiveYear.click();
			Thread.sleep(2000);
			// Billme.isDisplayed();
			Bank.isDisplayed();
			Bank.click();

			log.info(
					"Payment Informtion page is displyed to user and select Payment Method for Five Year Product as Bank successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select payment method as Bank for Five Year Product|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean payment_Information_Page_is_displayed_to_user_and_user_Selects_Payment_option_as_Bank_for_Ten_Year_Product()
			throws Exception {

		try {
			log.debug(
					"Payment Informtion page is displyed to user and select Payment Method as Bank for Ten Year Product");
			reuseMethod.scrollDown(EstimatedRate_TenYear);
			PaymentMethod_TenYear.isDisplayed();
			PaymentMethod_TenYear.click();
			Billme.isDisplayed();
			Bank.isDisplayed();
			Bank.click();

			log.info(
					"Payment Informtion page is displyed to user and select Payment Method for Ten Year Product as Bank successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select payment method as Bank for Ten Year Product|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean payment_Information_Page_is_displayed_to_user_and_user_Selects_Payment_option_as_Bank_Accidental_Death_Product()
			throws Exception {

		try {
			log.debug(
					"Payment Informtion page is displyed to user and select Payment Method as Bank for Accidental Death Product");

			PaymentMethod_AccidentDeath.isDisplayed();
			Thread.sleep(2000);
			PaymentMethod_AccidentDeath.click();
			Billme.isDisplayed();
			Bank.isDisplayed();
			Bank.click();

			log.info(
					"Payment Informtion page is displyed to user and select Payment Method for Accidental Death Product as Bank successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select payment method as Bank for Accidental Death Product|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean user_Selects_Payment_option_as_Bank_for_Hopsital_Money_Insurance() throws Exception {

		try {
			log.debug(
					"Payment Informtion page is displyed to user and select Payment Method as Bank for Hospital Money Insurance");
			PaymentMethod_HospitalMoneyIns.isDisplayed();
			reuseMethod.scrollDown(PaymentMethod_HospitalMoneyIns);
			Thread.sleep(2000);
			PaymentMethod_HospitalMoneyIns.click();
			Billme.isDisplayed();
			Bank.isDisplayed();
			Bank.click();

			log.info(
					"Payment Informtion page is displyed to user and select Payment Method for Hospital Money Insurance as Bank successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select payment method as Bank for Hospital Money Insurance|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean user_enters_Details_for_Bank_Account_as(String Bank, String AccName, String Rnum, String Anum)
			throws Exception {

		try {
			log.debug("User enters the Bank account details");
			Thread.sleep(1000);
			BankName.isDisplayed();
			BankName.sendKeys(Bank);
			AccountName.isDisplayed();
			AccountName.sendKeys(AccName);
			RountingNumber.isDisplayed();
			RountingNumber.sendKeys(Rnum);
			AccountNumber.isDisplayed();
			AccountNumber.sendKeys(Anum);

			log.info("Bank details are entered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter Bank details || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean clicks_on_Save_button() throws Exception {

		try {
			log.debug("Save the Bank Information");

			Save.isDisplayed();
			Thread.sleep(1000);
			Save.click();

			log.info("Bank Information is saved Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to save bank Information  || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Payment_Method_for_FiveYTL_Product() throws Exception {

		try {
			log.debug("Select Payment Method for Term Life Insurance");
			reuseMethod.scrollDown(PaymentFrequency_FiveYear);
			PaymentMethod_FiveYear.isDisplayed();
			Thread.sleep(2000);
			PaymentMethod_FiveYear.click();
			log.info("Payment Method for Term Life Insurance Product is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Method for Term Life Insurance Product|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Frequency_for_Five_Year_Product_and_reviews(String frequency) throws Exception {

		try {
			log.debug("Select Payment Frequency for Five Year Product");
			PaymentFrequency_FiveYear.isDisplayed();
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(PaymentFrequency_FiveYear, frequency);

			log.info("Payment Frequency for Five Year Product is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Frequency for Five Year Product  || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean confirms_I_have_read_the_Information_Check_Box_on_Payment_Page() throws Exception {

		try {
			log.debug("Check the checkbox on Payment Page that I have Read Information");
			Thread.sleep(5000);
			reuseMethod.scrollDown(paymentauthorize);
			paymentauthorize.isDisplayed();
			paymentauthorize.click();
			Thread.sleep(2000);
			log.info("Payment page checkbox is clicked Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click  Payment page checkbox  || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Frequency_for_Ten_Year_Product_and_reviews(String frequency) throws Exception {

		try {
			log.debug("Select Payment Frequency for Ten Year Product");
			reuseMethod.scrollDown(EstimatedRate_TenYear);
			PaymentFrequency_TenYear.isDisplayed();
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(PaymentFrequency_TenYear, frequency);

			log.info("Payment Frequency for Ten Year Product is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Frequency for Ten Year Product  || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Frequency_for_Accidental_Death_Product_and_reviews(String frequency) throws Exception {

		try {
			log.debug("Select Payment Frequency for Accidental Death Product");
			PaymentFrequency_AccidentDeath.isDisplayed();
			reuseMethod.scrollDown(EstimatedRate_ADDI);
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(PaymentFrequency_AccidentDeath, frequency);
			log.info("Payment Frequency for Accidental Death Product is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Frequency forAccidental Death Product  || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Frequency_for_Hospital_Money_Insurance_Product_and_reviews(String frequency)
			throws Exception {

		try {
			log.debug("Select Payment Frequency for Accidental Death Product");
			reuseMethod.scrollDown(EstimatedRate_HMI);
			PaymentFrequency_HospitalMoneyIns.isDisplayed();
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(PaymentFrequency_HospitalMoneyIns, frequency);
			log.info("Payment Frequency for Accidental Death Product is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Frequency forAccidental Death Product  || Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Payment_Method_for_TLI() throws Exception {

		try {
			log.debug("Select Payment Method for Term Life Insurance Product ");
			PaymentMethod_FiveYear.isDisplayed();
			Thread.sleep(2000);
			PaymentMethod_FiveYear.click();
			log.info("Payment Method for Term Life Insurance Product is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Method for Term Life Insurance Product || Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Payment_Method_for_TenYTL() throws Exception {

		try {
			log.debug("Select Payment Method for Ten Year Product ");
			PaymentMethod_TenYear.isDisplayed();
			Thread.sleep(2000);
			PaymentMethod_TenYear.click();
			log.info("Payment Method for Ten Year Product is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Method for Ten Year Product || Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Radio_Button_for_existing_payment_method() throws Exception {

		try {
			log.debug("Select Radio Button For Existing Payment Method");
			Thread.sleep(500);
			ExistingPayment.isDisplayed();
			Thread.sleep(500);
			ExistingPayment.click();
			Thread.sleep(500);
			log.info("Radio Button For Existing Payment Method is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select Radio Button For Existing Payment Method || Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Payment_Method_for_TwentyYTL() throws Exception {

		try {
			log.debug("Select Payment Method for Twenty Year Product ");
			reuseMethod.scrollDown(EstimatedRate_TwentyYear);
			PaymentMethod_TwentyYear.isDisplayed();
			Thread.sleep(1000);
			PaymentMethod_TwentyYear.click();
			Thread.sleep(1000);
			log.info("Payment Method for Twenty Year Product is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Method for Twenty Year Product || Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Frequency_for_Twenty_Year_Product(String frequency) throws Exception {

		try {
			log.debug("Select Payment Frequency for  Twenty Year Product");
			reuseMethod.scrollDown(EstimatedRate_TwentyYear);
			PaymentFrequency_TwentyYear.isDisplayed();
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(PaymentFrequency_TwentyYear, frequency);
			log.info("Payment Frequency for  Twenty Year is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Frequency  Twenty Year Product  || Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean payment_Information_Page_is_displayed_to_user_And_Selects_Payment_Method_for_FiftyYTL()
			throws Exception {

		try {
			log.debug("Select Payment Method for Fifty Year Product ");
			reuseMethod.scrollDown(EstimatedRate_FiftyYear);
			PaymentMethod_FiftyYear.isDisplayed();
			Thread.sleep(1000);
			PaymentMethod_FiftyYear.click();
			Thread.sleep(1000);
			log.info("Payment Method for Fifty Year Product is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Method for Fifty Year Product || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Payment_option_as_Bank() throws Exception {

		try {
			log.debug("Select Payment option as a Bank");
			Bank.isDisplayed();
			Bank.click();
			Thread.sleep(2000);
			log.info("Payment option for bank is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment option as a Bank|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Payment_option_as_Bill_Me() throws Exception {

		try {
			log.debug("Select Payment option as a Bill Me");
			Billme.isDisplayed();
			Billme.click();
			Thread.sleep(2000);
			log.info("Payment option as Bill Me is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment option as a Bill Me|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Frequency_for_Fifty_Year_Product(String frequency) throws Exception {

		try {
			log.debug("Select Payment Frequency for Fifty Year Product");
			reuseMethod.scrollDown(EstimatedRate_FiftyYear);
			PaymentFrequency_FiftyYear.isDisplayed();
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(PaymentFrequency_FiftyYear, frequency);
			log.info("Payment Frequency for Fifty Year is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Frequency Fifty Year Product  || Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean verify_Premium_Rates() {

		try {
			log.debug("Verify Premium Rates");
			Estimated_Premium.isDisplayed();
			Total_val.isDisplayed();
			log.info("Premium Rates are Verified Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Verify Premium Rates|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Payment_Method_for_ADDI() throws Exception {

		try {
			log.debug("Select Payment Method for Accidental Death Product  ");
			reuseMethod.scrollDown(EstimatedRate_ADDI);
			PaymentMethod_AccidentDeath.isDisplayed();
			Thread.sleep(2000);
			PaymentMethod_AccidentDeath.click();
			Thread.sleep(1000);
			log.info("Payment Method  for Accidental Death Product is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Method for Accidental Death Product|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Payment_Method_for_HMI() throws Exception {

		try {
			log.debug("Select Payment Method for Hospital Money Insurance");
			reuseMethod.scrollDown(EstimatedRate_HMI);
			PaymentMethod_HospitalMoneyIns.isDisplayed();
			Thread.sleep(2000);
			PaymentMethod_HospitalMoneyIns.click();
			Thread.sleep(1000);
			log.info("Payment Method for Hospital Money Insurance is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Method for for Hospital Money Insurance|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Payment_Method_for_LTDPlus() throws Exception {

		try {
			log.debug("Select Payment Method for Long Term Disability Plus Product  ");
			reuseMethod.scrollDown(EstimatedRate_LTDP);
			PaymentMethod_LTDP.isDisplayed();
			Thread.sleep(1000);
			PaymentMethod_LTDP.click();
			Thread.sleep(1000);
			log.info("Payment Method  for Long Term Disability Plus Product is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Payment Method for Long Term Disability Plus Product|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Frequency_for_Long_Term_Disablitity_Plus_Product(String frequency) throws Exception {

		try {
			log.debug("Select Payment Frequency for Long Term Disability Plus Product");
			reuseMethod.scrollDown(EstimatedRate_LTDP);
			PaymentFrequency_LTDP.isDisplayed();
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(PaymentFrequency_LTDP, frequency);
			log.info("Payment Frequency for Long Term Disability Plus is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Frequency Long Term Disability Plus  || Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Payment_Method_for_LTD() throws Exception {

		try {
			log.debug("Select Payment Method for Long Term Disability Product  ");
			reuseMethod.scrollDown(EstimatedRate_LTD);
			PaymentMethod_LTD.isDisplayed();
			Thread.sleep(2000);
			PaymentMethod_LTD.click();
			Thread.sleep(2000);
			log.info("Payment Method  for Long Term Disability Product is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Method for Long Term Disability Product|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Frequency_for_Long_Term_Disablitity_Product(String frequency) throws Exception {

		try {
			log.debug("Select Payment Frequency for Long Term Disability Product");
			reuseMethod.scrollDown(EstimatedRate_LTD);
			PaymentFrequency_LTD.isDisplayed();
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(PaymentFrequency_LTD, frequency);
			log.info("Payment Frequency for Long Term Disability is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Frequency Long Term Disability  || Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Payment_Method_for_MTDI() throws Exception {

		try {
			log.debug("Select Payment Method for Mid Term Disability Product  ");
			reuseMethod.scrollDown(EstimatedRate_MTD);
			PaymentMethod_MidTerm.isDisplayed();
			Thread.sleep(1000);
			PaymentMethod_MidTerm.click();
			Thread.sleep(1000);
			log.info("Payment Method  for Mid Term Disability Product is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Method for Mid Term Disability Product|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Frequency_for_Mid_Term_Disablitity_Product(String frequency) throws Exception {

		try {
			log.debug("Select Payment Frequency for Mid Term Disability Product");
			reuseMethod.scrollDown(EstimatedRate_MTD);
			PaymentFrequency_MidTerm.isDisplayed();
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(PaymentFrequency_MidTerm, frequency);
			log.info("Payment Frequency for Mid Term Disability is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Frequency Mid Term Disability  || Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Payment_Method_for_RTDI() throws Exception {

		try {
			log.debug("Select Payment Method for Retirement Disability Product  ");
			reuseMethod.scrollDown(EstimatedRate_RDI);
			PaymentMethod_Retire.isDisplayed();
			Thread.sleep(1000);
			PaymentMethod_Retire.click();
			Thread.sleep(1000);
			log.info("Payment Method for Retirement Disability Product is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Method for Retirement Disability Product|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Frequency_for_Retirement_Disablitity_Product(String frequency) throws Exception {

		try {
			log.debug("Select Payment Frequency for Retirement Disability Product");
			reuseMethod.scrollDown(EstimatedRate_RDI);
			PaymentFrequency_Retire.isDisplayed();
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(PaymentFrequency_Retire, frequency);
			log.info("Payment Frequency for Retirement Disability is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Frequency Retirement Disability  || Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Payment_Method_for_POEDI() throws Exception {

		try {
			log.debug("Select Payment Method for Professional Disability Product  ");
			reuseMethod.scrollDown(EstimatedRate_POEDI);
			PaymentMethod_Prof.isDisplayed();
			Thread.sleep(1000);
			PaymentMethod_Prof.click();
			Thread.sleep(1000);
			log.info("Payment Method for Professional Disability Product is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Method for Professional Disability Product|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Frequency_for_Professional_Disablitity_Product(String frequency) throws Exception {

		try {
			log.debug("Select Payment Frequency for Professional Disability Product");
			reuseMethod.scrollDown(EstimatedRate_POEDI);
			PaymentFrequency_Prof.isDisplayed();
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(PaymentFrequency_Prof, frequency);
			log.info("Payment Frequency for Professional Disability is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Frequency Professional Disability  || Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean selects_Payment_Method_for_CI() throws Exception {

		try {
			log.debug("Select Payment Method for Critical Illness Product  ");
			reuseMethod.scrollDown(EstimatedRate_CI);
			PaymentMethod_CI.isDisplayed();
			Thread.sleep(1000);
			PaymentMethod_CI.click();
			Thread.sleep(1000);
			log.info("Payment Method for Critical Illness Product is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Method for Critical Illness Product|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean selects_Frequency_for_Critical_Illness_Product(String frequency) throws Exception {

		try {
			log.debug("Select Payment Frequency for Critical Illness Product");
			reuseMethod.scrollDown(EstimatedRate_CI);
			PaymentFrequency_CI.isDisplayed();
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(PaymentFrequency_CI, frequency);
			log.info("Payment Frequency for Critical Illness is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Frequency Critical Illness  || Fail" + e.getMessage());

			throw (e);
		}
	}

	public boolean payment_page_is_displayed_select_NO_Mobile() throws Exception {

		try {
			log.debug("Payment page is displayed and select No in payment page");
			payment_page_Mobile.isDisplayed();
			mobBiledNo.click();
			log.info("Payment page is displayed and No clicked successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click on No in payment page|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean payment_page_is_displayed_select_Yes_Mobile() throws Exception {

		try {
			log.debug("Payment page is displayed and select billed Yes in payment page");
			payment_page_Mobile.isDisplayed();
			mobBiledYes.click();
			Thread.sleep(500);
			log.info("Payment page is displayed and select billed Yes clicked successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click on billed Yes || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean payment_page_is_displayed_Mobile() throws Exception {

		try {
			log.debug("Payment page is displayed");
			payment_page_Mobile.isDisplayed();

			Thread.sleep(500);
			log.info("verified Payment page is displayed successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify Payment page is displayed  || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean click_on_traditional_term_product_and_select_method_Bill_Me_and_Select_Mobile(String Freq)
			throws Exception {
		try {
			log.debug("Payment for Traditional Term Insurance");

			reuseMethod.scrollDown(Traditional_arrow_Mobile);
			if (!Traditional_BillMe_Mobile.isDisplayed()) {
				reuseMethod.Clickbutton(Traditional_arrow_Mobile);
				Thread.sleep(2000);
			}

			Traditional_BillMe_Mobile.click();
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(TraditionalFreq_Mobile, Freq);

			log.info("Bill me clicked for Traditional Term Insurance successfully  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Not able to click on biled no || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean click_on_Ten_Year_Level_Term_Life_Insurance_coverage_and_Select_method_Bill_Me_and_Select_Mobile(
			String Freq1) throws Exception {
		try {
			log.debug("Payment for Ten Year Term Insurance");

			reuseMethod.scrollDown(TenYr_arrow_Mobile);
			if (!Tenyr_BillMe_Mobile.isDisplayed()) {
				reuseMethod.Clickbutton(TenYr_arrow_Mobile);
				Thread.sleep(2000);
			}

			Tenyr_BillMe_Mobile.click();
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(TenYearFreq_Mobile, Freq1);

			log.info("Bill me clicked successfully for Ten year  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Not able to click on bill me for Ten year || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean click_on_Twenty_Year_Level_Term_Life_Insurance_coverage_and_Select_method_Bill_Me_and_Select(
			String Freq2) throws Exception {
		try {
			log.debug("Payment for Twenty Year Term Insurance");
			reuseMethod.scrollDown(TwentyYr_arrow_Mobile);
			if (!Twentyyr_BillMe_Mobile.isDisplayed()) {
				reuseMethod.Clickbutton(TwentyYr_arrow_Mobile);
				Thread.sleep(2000);
			}
			Twentyyr_BillMe_Mobile.click();
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(TwentyYearFreq_Mobile, Freq2);

			log.info("Bill me clicked successfully for Twenty year  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Not able to click on bill me for Twenty year || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_rates_values_For_Traditional_Self_Mobile(String Mpremium) throws Exception {
		try {
			log.debug("Validate Estimated rates for Five Year for Self in Mobile");
			reuseMethod.scrollDown(TraditionalFreq_Mobile);
			if (!TraditionalFreq_Mobile.isDisplayed()) {
				reuseMethod.Clickbutton(Traditional_arrow_Mobile);
			}
			Thread.sleep(2000);
			Assert.assertEquals(SelfTrad_EstimatedRate_Mobile.getText(), Mpremium, "Rate for Self Verified");

			log.info("Validate Estimated rates for Five Year for Self in Mobile || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Five Year for Self in Mobile|| Fail" + e.getMessage());
			throw (e);
		}
	}

//WAEPA
	public boolean validate_the_estimated_rates_values_For_FiveYear_Self(String Mpremium) throws Exception {
		try {
			log.debug("Validate Estimated rates for Five Year for Self");
			Thread.sleep(5000);
			String ActualSelfPremium = SelfFiveYr_EstimatedRate.getText();
			System.out.println("Rate:::" + ActualSelfPremium);
			Assert.assertEquals(ActualSelfPremium, Mpremium, "Rate for Self Verified");

			log.info("Validate Estimated rates for Five Year for Self || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Five Year for Self|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_rates_values_For_FiveYear_Spouse(String Spremium) throws Exception {
		try {
			log.debug("Validate Estimated rates for Five Year for Spouse");
			Thread.sleep(5000);
			Assert.assertEquals(SpouseFiveYr_EstimatedRate.getText(), Spremium, "Rate for Spouse Verified");
			log.info("Validate Estimated rates for Five Year for Spouse in Mobile || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Five Year for Spouse|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_rates_values_For_FiveYear_child(String Cpremium) throws Exception {
		try {
			log.debug("Validate Estimated rates for Five Year for Child");
			Thread.sleep(5000);
			Assert.assertEquals(ChildFiveYr_EstimatedRate.getText(), Cpremium, "Rate for Child Verified");
			log.info("Validate Estimated rates for Five Year for Child || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Five Year for Child || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_rates_values_For_FiveYear_Total(String Total) throws Exception {
		try {
			log.debug("Validate Estimated rates for Five Year for Total");
			Thread.sleep(5000);
			Assert.assertEquals(TotalFiveYr_EstimatedRate.getText(), Total, "Rate for Total Verified");
			log.info("Validate Estimated rates for Five Year for Total  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Five Year for Total|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_rates_values_For_FiveYear_Dependents(String Dependents1) throws Exception {
		try {
			log.debug("Validate Estimated rates for Five Year for Dependents");
			Thread.sleep(5000);
			Assert.assertEquals(DependentsFiveYr_EstimatedRate.getText(), Dependents1, "Rate for Dependents Verified");
			log.info("Validate Estimated rates for Five Year for Dependents  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Five Year for Dependents || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_rates_values_For_Traditional_Spouse_Mobile(String Spremium) throws Exception {
		try {
			log.debug("Validate Estimated rates for Five Year for Spouse in Mobile");

			if (!SpouseTrad_EstimatedRate_Mobile.isDisplayed()) {
				reuseMethod.Clickbutton(Traditional_arrow_Mobile);
			}
			Thread.sleep(2000);
			Assert.assertEquals(SpouseTrad_EstimatedRate_Mobile.getText(), Spremium, "Rate for Spouse Verified");
			log.info("Validate Estimated rates for Five Year for Spouse in Mobile || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Five Year for Spouse in Mobile|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_rates_values_For_Traditional_product_child_Mobile(String Cpremium)
			throws Exception {
		try {
			log.debug("Validate Estimated rates for Five Year for Child in Mobile");
			Thread.sleep(1000);
			if (!ChildTrad_EstimatedRate_Mobile.isDisplayed()) {
				reuseMethod.Clickbutton(Traditional_arrow_Mobile);
			}
			Thread.sleep(2000);
			Assert.assertEquals(ChildTrad_EstimatedRate_Mobile.getText(), Cpremium, "Rate for Child Verified");
			log.info("Validate Estimated rates for Five Year for Child in Mobile  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Five Year for Child in Mobile|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_rates_values_For_Traditional_Product_Total_Mobile(String Total)
			throws Exception {
		try {
			log.debug("Validate Estimated rates for Five Year for Total");
			Thread.sleep(2000);
			Assert.assertEquals(TotalTrad_EstimatedRate_Mobile.getText(), Total, "Rate for Total Verified");
			log.info("Validate Estimated rates for Five Year for Total  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Five Year for Total|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_rates_values_For_TenYear_Self_Mobile(String Mpremium1) throws Exception {
		try {
			log.debug("Validate Estimated rates for Ten Year for Self");
			if (!TenYearFreq_Mobile.isDisplayed()) {
				reuseMethod.Clickbutton(TenYr_arrow_Mobile);
			}
			Thread.sleep(2000);
			reuseMethod.scrollDown(TenYearFreq_Mobile);
			Assert.assertEquals(SelfTenYr_EstimatedRate_Mobile.getText(), Mpremium1,
					"Rate for Self Verified for Ten year");

			log.info("Validate Estimated rates for Ten Year for Self  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Ten Year for Self|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_rates_values_For_TenYear_Spouse_Mobile(String Spremium1) throws Exception {
		try {
			log.debug("Validate Estimated rates for Ten Year for Spouse");
			if (!TenYearFreq_Mobile.isDisplayed()) {
				reuseMethod.Clickbutton(TenYr_arrow_Mobile);
			}
			Thread.sleep(2000);
			Assert.assertEquals(SpouseTenYr_EstimatedRate_Mobile.getText(), Spremium1,
					"Rate for Spouse Verified for Ten year");

			log.info("Validate Estimated rates for Ten Year for Spouse  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Ten Year for Spouse|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_rates_values_For_TenYear_Total_Mobile(String Total1) throws Exception {
		try {
			log.debug("Validate Estimated rates for Ten Year for Total");

			Assert.assertEquals(TotalTenYr_EstimatedRate_Mobile.getText(), Total1,
					"Rate for Total Verified for Ten Year");
			log.info("Validate Estimated rates for Ten Year for Total  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Ten Year for Total|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_rates_values_For_TwentyYear_Total_Mobile(String Total2) throws Exception {
		try {
			log.debug("Validate Estimated rates for Twenty Year for Total");

			Assert.assertEquals(TotalTwentyYr_EstimatedRate_Mobile.getText(), Total2,
					"Rate for Total Verified for Twenty Year");
			log.info("Validate Estimated rates for Twenty Year for Total  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Twenty Year for Total|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_rates_values_For_TwentyYear_Self_Mobile(String Mpremium2) throws Exception {
		try {
			log.debug("Validate Estimated rates for Twenty Year for Self");
			if (!TwentyYearFreq_Mobile.isDisplayed()) {
				reuseMethod.Clickbutton(TwentyYr_arrow_Mobile);
			}
			Thread.sleep(2000);
			reuseMethod.scrollDown(TwentyYearFreq_Mobile);
			Assert.assertEquals(SelfTwentyYr_EstimatedRate_Mobile.getText(), Mpremium2,
					"Rate for Self Verified for Twenty year");

			log.info("Validate Estimated rates for Twenty Year for Self  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Twenty Year for Self|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_rates_values_For_TwentyYear_Spouse_Mobile(String Spremium2) throws Exception {
		try {
			log.debug("Validate Estimated rates for Twenty Year for Spouse");

			if (!TwentyYearFreq_Mobile.isDisplayed()) {
				reuseMethod.Clickbutton(TwentyYr_arrow_Mobile);
			}
			Thread.sleep(2000);
			reuseMethod.scrollDown(TwentyYearFreq_Mobile);

			Assert.assertEquals(SpouseTwentyYr_EstimatedRate_Mobile.getText(), Spremium2,
					"Rate for Spouse Verified for Twenty year");

			log.info("Validate Estimated rates for Twenty Year for Spouse  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Twenty Year for Spouse|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean click_on_Long_Term_Life_Insurance_coverage_and_Select_method_Bill_Me_and_Select_Mobile(String Freq3)
			throws Exception {
		try {
			log.debug("Payment for Long Term Disability Insurance");

			reuseMethod.scrollDown(LongTerm_arrow_Mobile);
			if (!LongTerm_BillMe_Mobile.isDisplayed()) {
				reuseMethod.Clickbutton(LongTerm_arrow_Mobile);
				Thread.sleep(2000);
			}

			LongTerm_BillMe_Mobile.click();
			Thread.sleep(2000);
			reuseMethod.dropDownselectbyvalue(LongTerm_Freq_Mobile, Freq3);

			log.info("Bill me clicked successfully for Long Term  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Not able to click on bill me for Long Term || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean click_on_Short_Term_Life_Insurance_coverage_and_Select_method_Bill_Me_and_Select_Mobile(String Freq4)
			throws Exception {
		try {
			log.debug("Payment for Short Term Disability Insurance");

			reuseMethod.scrollDown(ShortTerm_arrow_Mobile);
			if (!ShortTerm_BillMe_Mobile.isDisplayed()) {
				reuseMethod.Clickbutton(ShortTerm_arrow_Mobile);
				Thread.sleep(2000);
			}
			ShortTerm_BillMe_Mobile.click();
			Thread.sleep(2000);
			reuseMethod.dropDownselectbyvalue(ShortTerm_Freq_Mobile, Freq4);

			log.info("Bill me clicked successfully for Short Term  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Not able to click on bill me for Short Term || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean click_on_Business_Overhead_coverage_and_Select_method_Bill_Me_and_Select_Mobile(String Freq5)
			throws Exception {
		try {
			log.debug("Payment for Business Overhead Disability Insurance");

			reuseMethod.scrollDown(Business_arrow_Mobile);
			if (!BusinessOver_BillMe_Mobile.isDisplayed()) {
				reuseMethod.Clickbutton(Business_arrow_Mobile);
				Thread.sleep(2000);
			}
			BusinessOver_BillMe_Mobile.click();
			Thread.sleep(2000);
			reuseMethod.dropDownselectbyvalue(BusinessOver_Freq_Mobile, Freq5);

			log.info("Bill me clicked successfully for Business Overhead  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Not able to click on bill me for Business Overhead || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_rates_values_For_LongTerm_Total_Mobile(String Total3) throws Exception {
		try {
			log.debug("Validate Estimated rates for Long Term for Total");
			Thread.sleep(2000);
			Assert.assertEquals(TotalLongDisYr_EstimatedRate_Mobile.getText(), Total3,
					"Rate for Total Verified for Long Term");
			log.info("Validate Estimated rates for LongTerm for Total  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Long Term for Total|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_rates_values_For_LongTerm_Self_Mobile(String Mpremium3) throws Exception {
		try {
			log.debug("Validate Estimated rates for Long Term for Self");
			Thread.sleep(2000);

			if (!LongTerm_Freq_Mobile.isDisplayed()) {
				reuseMethod.Clickbutton(LongTerm_arrow_Mobile);
			}

			reuseMethod.scrollDown(LongTerm_Freq_Mobile);

			Assert.assertEquals(SelfLongDisYr_EstimatedRate_Mobile.getText(), Mpremium3,
					"Rate for Self Verified for Long Term");

			log.info("Validate Estimated rates for Long Term for Self  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Long Term for Self|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_rates_values_For_LongTerm_Spouse_Mobile(String Spremium3) throws Exception {
		try {
			log.debug("Validate Estimated rates for Long Term for Spouse");

			if (!LongTerm_Freq_Mobile.isDisplayed()) {
				reuseMethod.Clickbutton(LongTerm_arrow_Mobile);
			}
			Thread.sleep(2000);
			reuseMethod.scrollDown(LongTerm_Freq_Mobile);
			Thread.sleep(2000);
			Assert.assertEquals(SpouseLongDisYr_EstimatedRate_Mobile.getText(), Spremium3,
					"Rate for Spouse Verified for Long Term");

			log.info("Validate Estimated rates for Long Term for Spouse  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Long Term for Spouse|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_rates_values_For_ShortTerm_Total_Mobile(String Total4) throws Exception {
		try {
			log.debug("Validate Estimated rates for Short Term for Total");

			Assert.assertEquals(TotalShortDisYr_EstimatedRate_Mobile.getText(), Total4,
					"Rate for Total Verified for Short Term");

			log.info("Validate Estimated rates for Short Term for Total  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Short Term for Total|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_rates_values_For_ShortTerm_Self_Mobile(String Mpremium4) throws Exception {
		try {

			log.debug("Validate Estimated rates for Short Term for Self");

			if (!ShortTerm_Freq_Mobile.isDisplayed()) {
				reuseMethod.Clickbutton(ShortTerm_arrow_Mobile);
			}
			reuseMethod.scrollDown(ShortTerm_Freq_Mobile);
			Thread.sleep(2000);
			Assert.assertEquals(SelfShortDisYr_EstimatedRate_Mobile.getText(), Mpremium4,
					"Rate for Self Verified for Short Term");

			log.info("Validate Estimated rates for Long Term for Self  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Short Term for Self|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_rates_values_For_ShortTerm_Spouse_Mobile(String Spremium4) throws Exception {
		try {
			log.debug("Validate Estimated rates for Short Term for Spouse");
			if (!ShortTerm_Freq_Mobile.isDisplayed()) {
				reuseMethod.Clickbutton(ShortTerm_arrow_Mobile);
			}
			Thread.sleep(2000);
			reuseMethod.scrollDown(ShortTerm_Freq_Mobile);
			Assert.assertEquals(SpouseShortDisYr_EstimatedRate_Mobile.getText(), Spremium4,
					"Rate for Spouse Verified for Short Term");

			log.info("Validate Estimated rates for Long Term for Spouse  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Short Term for Spouse|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_rates_values_For_Business_Overhead_Total_Mobile(String Total5)
			throws Exception {
		try {
			log.debug("Validate Estimated rates for Business Overhead for Total");
			Thread.sleep(2000);
			Assert.assertEquals(TotalBusinessOver_EstimatedRate_Mobile.getText(), Total5,
					"Rate for Total Verified for Business Overhead");

			log.info("Validate Estimated rates for Business Overhead for Total  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Business Overhead for Total|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_rates_values_For_Business_Overhead_Self_Mobile(String Mpremium5)
			throws Exception {
		try {
			log.debug("Validate Estimated rates for Business Overhead for Self");
			if (!BusinessOver_Freq_Mobile.isDisplayed()) {
				reuseMethod.Clickbutton(Business_arrow_Mobile);
			}
			Thread.sleep(2000);
			reuseMethod.scrollDown(BusinessOver_Freq_Mobile);

			Assert.assertEquals(SelfBusinessOver_EstimatedRate_Mobile.getText(), Mpremium5,
					"Rate for Self Verified for Business Overhead");

			log.info("Validate Estimated rates for Business Overhead for Self  || Pass");

			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Business Overhead for Self|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Payment_Method_for_TermLife() throws Exception {

		try {
			log.debug("Select Payment method for Term Life");

			PaymentMethod_TermLife.isDisplayed();
			PaymentMethod_TermLife.click();
			Thread.sleep(2000);

			log.info("Select Payment Method for Term Life Insurance Product succcessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select payment method  for Term Life Insurance|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Frequency_for_Term_Life_Product(String frequency) throws Exception {

		try {
			log.debug("Select Payment Frequency for Term Life Insurance Product");
			PaymentFrequency_TermLife.isDisplayed();
			Thread.sleep(1000);
			reuseMethod.dropDownselectbyvalue(PaymentFrequency_TermLife, frequency);

			log.info("Payment Frequency for Term Life Insurance Product is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Frequency for Term Life Insurance Product  || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean clicks_on_Payment_Method_for_DII() throws Exception {

		try {
			log.debug("Select Payment method for Disability Income Insurance");
			reuseMethod.scrollDown(EstimatedRate_DII);
			PaymentMethod_DisabilityIncome.isDisplayed();
			Thread.sleep(2000);
			PaymentMethod_DisabilityIncome.click();
			Thread.sleep(2000);

			log.info("Select Payment Method for Disability Income Insurance Product succcessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select payment method  for Disability Income Insurance|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Frequency_for_DII_Product(String frequency) throws Exception {

		try {
			log.debug("Select Payment Frequency for Disability Income Insurance Product");
			PaymentFrequency_DisabilityIncome.isDisplayed();
			Thread.sleep(1000);
			reuseMethod.scrollDown(EstimatedRate_DII);
			reuseMethod.dropDownselectbyvalue(PaymentFrequency_DisabilityIncome, frequency);

			log.info("Payment Frequency for Disability Income Insurance Product is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Payment Frequency for Disability Income Insurance Product  || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	/*************************************
	 * RATE VERIFICATION
	 ***************************************/

	public boolean validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_FiveYTL(String premium,
			String amount) throws Exception {
		try {
			log.debug("Validates Estimated Premium for Self for given Benefit Amount under FiveYTL");
			reuseMethod.scrollDown(EstimatedRate_FiveYear);
			Thread.sleep(2000);
			String actualRate = SelfFiveYear_EstimatedRate.getText();
			Assert.assertEquals(actualRate, premium, " Estimated Rate for 5-Year Term Life Self is not Verified");
			System.out.println(
					"Estimated Rate for 5-Year Term Life Self is==" + premium + " " + "For Benefit Amount==" + amount);
			log.info("Estimated Rate for 5-Year Term Life Self is==" + premium + " " + "For Benefit Amount==" + amount);
			log.info("Premium Rates for 5-Year Term Life Self is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate Estimated Premium Rates for 5-Year Term Life Self || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_FiveYTL(String Spremium,
			String amount) throws Exception {
		try {
			log.debug("Validates Estimated Premium for Spouse for given Benefit Amount under FiveYTL");
			reuseMethod.scrollDown(EstimatedRate_FiveYear);
			Thread.sleep(2000);
			String actualRate = SpouseFiveYear_EstimatedRate.getText();
			Assert.assertEquals(actualRate, Spremium, "Estimated Rate for 5-Year Term Life Spouse is not Verified");
			System.out.println("Estimated Rate for 5-Year Term Life Spouse is==" + Spremium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for 5-Year Term Life Spouse is==" + Spremium + " " + "For Benefit Amount=="
					+ amount);
			log.info("Premium Rates for 5-Year Term Life Spouse is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Rates for 5-Year Term Life Spouse || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Child_as_for_Benefit_Amount_under_FiveYTL(String Cpremium,
			String amount) throws Exception {
		try {
			log.debug("Validates Estimated Premium for Child for given Benefit Amount under FiveYTL");
			reuseMethod.scrollDown(EstimatedRate_FiveYear);
			Thread.sleep(2000);
			String actualRate = ChildFiveYear_EstimatedRate.getText();
			Assert.assertEquals(actualRate, Cpremium, " Estimated Rate for 5-Year Term Life Child is not Verified");
			System.out.println("Estimated Rate for 5-Year Term Life Spouse is==" + Cpremium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for 5-Year Term Life Child is==" + Cpremium + " " + "For Benefit Amount=="
					+ amount);
			log.info("Premium Rates for 5-Year Term Life Child is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate Estimated Premium Rates for 5-Year Term Life Child || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Total_Premium_as_under_FiveYTL(String TotalAmt) throws Exception {
		try {
			log.debug("Validates Total Premium for FiveYTL product");
			reuseMethod.scrollDown(EstimatedRate_FiveYear);
			Thread.sleep(2000);
			String actualRate = TotalAmountFiveYear_EstimatedRate.getText();
			Assert.assertEquals(actualRate, TotalAmt, "Estimated Total Amount for 5-Year Term Life is not Verified");
			System.out.println("Estimated Total Amount for 5-Year Term Life is==" + TotalAmt);
			log.info("Estimated Total Amount for 5-Year Term Life is==" + TotalAmt);
			log.info("Estimated Total Amount for 5-Year Term Life is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Total Amount for 5-Year Term Life || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_TenYTL(String premium,
			String amount) throws Exception {
		try {
			log.debug("Validates Estimated Premium for Self for given Benefit Amount under TenYTL");
			reuseMethod.scrollDown(EstimatedRate_TenYear);
			Thread.sleep(2000);
			String actualRate = SelfTenYear_EstimatedRate.getText();
			Assert.assertEquals(actualRate, premium,
					" Estimated Rate for 10 Year Level Term Life Self is not Verified");
			System.out.println("Estimated Rate for 10 Year Level Term Life Self is==" + premium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for 10 Year Level Term Life Self is==" + premium + " " + "For Benefit Amount=="
					+ amount);
			log.info("Premium Rates for 10 Year Level Term Life Self is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Rates for 10 Year Level Term Life Self || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_TenYTL(String Spremium,
			String amount) throws Exception {
		try {
			log.debug("Validates Estimated Premium for Spouse for given Benefit Amount under TenYTL");
			reuseMethod.scrollDown(EstimatedRate_TenYear);
			Thread.sleep(2000);
			String actualRate = SpouseTenYear_EstimatedRate.getText();
			Assert.assertEquals(actualRate, Spremium,
					"Estimated Rate for 10 Year Level Term Life Spouse is not Verified");
			System.out.println("Estimated Rate for 10 Year Level Term Life Spouse is==" + Spremium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for 10 Year Level Term Life Spouse is==" + Spremium + " " + "For Benefit Amount=="
					+ amount);
			log.info("Premium Rates for 10 Year Level Term Life Spouse is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Rates for 10 Year Level Term Life Spouse || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Child_as_for_Benefit_Amount_under_TenYTL(String Cpremium,
			String amount) throws Exception {
		try {
			log.debug("Validates Estimated Premium for Child for given Benefit Amount under TenYTL");
			reuseMethod.scrollDown(EstimatedRate_TenYear);
			Thread.sleep(2000);
			String actualRate = ChildTenYear_EstimatedRate.getText();
			Assert.assertEquals(actualRate, Cpremium,
					" Estimated Rate for 10 Year Level Term Life Child is not Verified");
			System.out.println("Estimated Rate for 10 Year Level Term Life Spouse is==" + Cpremium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for 10 Year Level Term Life Child is==" + Cpremium + " " + "For Benefit Amount=="
					+ amount);
			log.info("Premium Rates for 10 Year Level Term Life Child is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Rates for 10 Year Level Term Life Child || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Total_Premium_as_under_TenYTL(String TotalAmt) throws Exception {
		try {
			log.debug("Validates Total Premium for TenYTL product");
			reuseMethod.scrollDown(EstimatedRate_TenYear);
			Thread.sleep(2000);
			String actualRate = TotalAmountTenYear_EstimatedRate.getText();
			Assert.assertEquals(actualRate, TotalAmt,
					"Estimated Total Amount for 10 Year Level Term Life is not Verified");
			System.out.println("Estimated Total Amount for 10 Year Level Term Life is==" + TotalAmt);
			log.info("Estimated Total Amount for 10 Year Level Term Life is==" + TotalAmt);
			log.info("Estimated Total Amount for 10 Year Level Term Life is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate Estimated Total Amount for 10 Year Level Term Life || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_TwentyYTL(String premium,
			String amount) throws Exception {
		try {
			log.debug("Validates Estimated Premium for Self for given Benefit Amount under TwentyYTL");
			reuseMethod.scrollDown(EstimatedRate_TwentyYear);
			Thread.sleep(2000);
			String actualRate = SelfTwentyYear_EstimatedRate.getText();
			Assert.assertEquals(actualRate, premium,
					" Estimated Rate for 20 Year Level Term Life Self is not Verified");
			System.out.println("Estimated Rate for 20 Year Level Term Life Self is==" + premium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for 20 Year Level Term Life Self is==" + premium + " " + "For Benefit Amount=="
					+ amount);
			log.info("Premium Rates for 20 Year Level Term Life Self is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Rates for 20 Year Level Term Life Self || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_TwentyYTL(String Spremium,
			String amount) throws Exception {
		try {
			log.debug("Validates Estimated Premium for Spouse for given Benefit Amount under TwentyYTL");
			reuseMethod.scrollDown(EstimatedRate_TwentyYear);
			Thread.sleep(2000);
			String actualRate = SpouseTwentyYear_EstimatedRate.getText();
			Assert.assertEquals(actualRate, Spremium,
					"Estimated Rate for 20 Year Level Term Life Spouse is not Verified");
			System.out.println("Estimated Rate for 20 Year Level Term Life Spouse is==" + Spremium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for 20 Year Level Term Life Spouse is==" + Spremium + " " + "For Benefit Amount=="
					+ amount);
			log.info("Premium Rates for 20 Year Level Term Life Spouse is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Rates for 20 Year Level Term Life Spouse || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Child_as_for_Benefit_Amount_under_TwentyYTL(String Cpremium,
			String amount) throws Exception {
		try {
			log.debug("Validates Estimated Premium for Child for given Benefit Amount under TwentyYTL");
			reuseMethod.scrollDown(EstimatedRate_TwentyYear);
			Thread.sleep(2000);
			String actualRate = ChildTwentyYear_EstimatedRate.getText();
			Assert.assertEquals(actualRate, Cpremium,
					" Estimated Rate for 20 Year Level Term Life Child is not Verified");
			System.out.println("Estimated Rate for 20 Year Level Term Life Spouse is==" + Cpremium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for 20 Year Level Term Life Child is==" + Cpremium + " " + "For Benefit Amount=="
					+ amount);
			log.info("Premium Rates for 20 Year Level Term Life Child is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Rates for 20 Year Level Term Life Child || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Total_Premium_as_under_TwentyYTL(String TotalAmt) throws Exception {
		try {
			log.debug("Validates Total Premium for TwentyYTL product");
			reuseMethod.scrollDown(EstimatedRate_TwentyYear);
			Thread.sleep(2000);
			String actualRate = TotalAmountTwentyYear_EstimatedRate.getText();
			Assert.assertEquals(actualRate, TotalAmt,
					"Estimated Total Amount for 20 Year Level Term Life is not Verified");
			System.out.println("Estimated Total Amount for 20 Year Level Term Life is==" + TotalAmt);
			log.info("Estimated Total Amount for 20 Year Level Term Life is==" + TotalAmt);
			log.info("Estimated Total Amount for 20 Year Level Term Life is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate Estimated Total Amount for 20 Year Level Term Life || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_FiftyYTL(String premium,
			String amount) throws Exception {
		try {
			log.debug("Validates Estimated Premium for Self for given Benefit Amount under FiftyYTL");
			reuseMethod.scrollDown(EstimatedRate_FiftyYear);
			Thread.sleep(2000);
			String actualRate = SelfFiftyYear_EstimatedRate.getText();
			Assert.assertEquals(actualRate, premium,
					" Estimated Rate for 50 Year Level Term Life Self is not Verified");
			System.out.println("Estimated Rate for 50 Year Level Term Life Self is==" + premium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for 50 Year Level Term Life Self is==" + premium + " " + "For Benefit Amount=="
					+ amount);
			log.info("Premium Rates for 50 Year Level Term Life Self is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Rates for 50 Year Level Term Life Self || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_FiftyYTL(String Spremium,
			String amount) throws Exception {
		try {
			log.debug("Validates Estimated Premium for Spouse for given Benefit Amount under FiftyYTL");
			reuseMethod.scrollDown(EstimatedRate_FiftyYear);
			Thread.sleep(2000);
			String actualRate = SpouseFiftyYear_EstimatedRate.getText();
			Assert.assertEquals(actualRate, Spremium,
					"Estimated Rate for 50 Year Level Term Life Spouse is not Verified");
			System.out.println("Estimated Rate for 50 Year Level Term Life Spouse is==" + Spremium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for 50 Year Level Term Life Spouse is==" + Spremium + " " + "For Benefit Amount=="
					+ amount);
			log.info("Premium Rates for 50 Year Level Term Life Spouse is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Rates for 50 Year Level Term Life Spouse || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Total_Premium_as_under_FiftyYTL(String TotalAmt) throws Exception {
		try {
			log.debug("Validates Total Premium for FiftyYTL product");
			reuseMethod.scrollDown(EstimatedRate_FiftyYear);
			Thread.sleep(2000);
			String actualRate = TotalAmountFiftyYear_EstimatedRate.getText();
			Assert.assertEquals(actualRate, TotalAmt,
					"Estimated Total Amount for 50 Year Level Term Life is not Verified");
			System.out.println("Estimated Total Amount for 50 Year Level Term Life is==" + TotalAmt);
			log.info("Estimated Total Amount for 50 Year Level Term Life is==" + TotalAmt);
			log.info("Estimated Total Amount for 50 Year Level Term Life is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate Estimated Total Amount for 50 Year Level Term Life || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_ADDI(String premium, String amount)
			throws Exception {
		try {
			log.debug("Validates Estimated Premium for Self for given Benefit Amount under ADDI");
			reuseMethod.scrollDown(EstimatedRate_ADDI);
			Thread.sleep(2000);
			String actualRate = SelfADDI_EstimatedRate.getText();
			Assert.assertEquals(actualRate, premium,
					" Estimated Rate for Accidental Death and Dismemberment Insurance Self is not Verified");
			System.out.println("Estimated Rate for Accidental Death and Dismemberment Insurance Self is==" + premium
					+ " " + "For Benefit Amount==" + amount);
			log.info("Estimated Rate for Accidental Death and Dismemberment Insurance Self is==" + premium + " "
					+ "For Benefit Amount==" + amount);
			log.info(
					"Premium Rates for Accidental Death and Dismemberment Insurance Self is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate Estimated Premium Rates for Accidental Death and Dismemberment Insurance Self || Fail"
							+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_ADDI(String Spremium,
			String amount) throws Exception {
		try {
			log.debug("Validates Estimated Premium for Spouse for given Benefit Amount under ADDI");
			reuseMethod.scrollDown(EstimatedRate_ADDI);
			Thread.sleep(2000);
			String actualRate = SpouseADDI_EstimatedRate.getText();
			Assert.assertEquals(actualRate, Spremium,
					"Estimated Rate for Accidental Death and Dismemberment Insurance Spouse is not Verified");
			System.out.println("Estimated Rate for Accidental Death and Dismemberment Insurance Spouse is==" + Spremium
					+ " " + "For Benefit Amount==" + amount);
			log.info("Estimated Rate for Accidental Death and Dismemberment Insurance Spouse is==" + Spremium + " "
					+ "For Benefit Amount==" + amount);
			log.info(
					"Premium Rates for Accidental Death and Dismemberment Insurance Spouse is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate Estimated Premium Rates for Accidental Death and Dismemberment Insurance Spouse || Fail"
							+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Child_as_for_Benefit_Amount_under_ADDI(String Cpremium,
			String amount) throws Exception {
		try {
			log.debug("Validates Estimated Premium for Child for given Benefit Amount under ADDI");
			reuseMethod.scrollDown(EstimatedRate_ADDI);
			Thread.sleep(2000);
			String actualRate = ChildADDI_EstimatedRate.getText();
			Assert.assertEquals(actualRate, Cpremium,
					" Estimated Rate for Accidental Death and Dismemberment Insurance Child is not Verified");
			System.out.println("Estimated Rate for Accidental Death and Dismemberment Insurance Spouse is==" + Cpremium
					+ " " + "For Benefit Amount==" + amount);
			log.info("Estimated Rate for Accidental Death and Dismemberment Insurance Child is==" + Cpremium + " "
					+ "For Benefit Amount==" + amount);
			log.info(
					"Premium Rates for Accidental Death and Dismemberment Insurance Child is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate Estimated Premium Rates for Accidental Death and Dismemberment Insurance Child || Fail"
							+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Total_Premium_as_under_ADDI(String TotalAmt) throws Exception {
		try {
			log.debug("Validates Total Premium for ADDI product");
			reuseMethod.scrollDown(EstimatedRate_ADDI);
			Thread.sleep(2000);
			String actualRate = TotalAmountADDI_EstimatedRate.getText();
			Assert.assertEquals(actualRate, TotalAmt,
					"Estimated Total Amount for Accidental Death and Dismemberment Insurance is not Verified");
			System.out
					.println("Estimated Total Amount for Accidental Death and Dismemberment Insurance is==" + TotalAmt);
			log.info("Estimated Total Amount for Accidental Death and Dismemberment Insurance is==" + TotalAmt);
			log.info(
					"Estimated Total Amount for Accidental Death and Dismemberment Insurance is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate Estimated Total Amount for Accidental Death and Dismemberment Insurance || Fail"
							+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_LTDPlus(String premium,
			String amount) throws Exception {
		try {
			log.debug("Validates Estimated Premium for Self for given Benefit Amount under LTDP");
			reuseMethod.scrollDown(EstimatedRate_LTDP);
			Thread.sleep(2000);
			String actualRate = SelfLTDP_EstimatedRate.getText();
			Assert.assertEquals(actualRate, premium,
					" Estimated Rate for Long-Term Disability Plus Insurance Self is not Verified");
			System.out.println("Estimated Rate for Long-Term Disability Plus Insurance Self is==" + premium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for Long-Term Disability Plus Insurance Self is==" + premium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Premium Rates for Long-Term Disability Plus Insurance Self is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate Estimated Premium Rates for Long-Term Disability Plus Insurance Self || Fail"
							+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_LTDPlus(String Spremium,
			String amount) throws Exception {
		try {
			log.debug("Validates Estimated Premium for Spouse for given Benefit Amount under LTDP");
			reuseMethod.scrollDown(EstimatedRate_LTDP);
			Thread.sleep(2000);
			String actualRate = SpouseLTDP_EstimatedRate.getText();
			Assert.assertEquals(actualRate, Spremium,
					"Estimated Rate for Long-Term Disability Plus Insurance Spouse is not Verified");
			System.out.println("Estimated Rate for Long-Term Disability Plus Insurance Spouse is==" + Spremium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for Long-Term Disability Plus Insurance Spouse is==" + Spremium + " "
					+ "For Benefit Amount==" + amount);
			log.info(
					"Premium Rates for Long-Term Disability Plus Insurance Spouse is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate Estimated Premium Rates for Long-Term Disability Plus Insurance Spouse || Fail"
							+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Total_Premium_as_under_LTDPlus(String TotalAmt) throws Exception {
		try {
			log.debug("Validates Total Premium for LTDP product");
			reuseMethod.scrollDown(EstimatedRate_LTDP);
			Thread.sleep(2000);
			String actualRate = TotalAmountLTDP_EstimatedRate.getText();
			Assert.assertEquals(actualRate, TotalAmt,
					"Estimated Total Amount for Long-Term Disability Plus Insurance is not Verified");
			System.out.println("Estimated Total Amount for Long-Term Disability Plus Insurance is==" + TotalAmt);
			log.info("Estimated Total Amount for Long-Term Disability Plus Insurance is==" + TotalAmt);
			log.info(
					"Estimated Total Amount for Long-Term Disability Plus Insurance is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Total Amount for Long-Term Disability Plus Insurance || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_LTD(String premium, String amount)
			throws Exception {
		try {
			log.debug("Validates Estimated Premium for Self for given Benefit Amount under LTD");
			reuseMethod.scrollDown(EstimatedRate_LTD);
			Thread.sleep(2000);
			String actualRate = SelfLTD_EstimatedRate.getText();
			Assert.assertEquals(actualRate, premium,
					" Estimated Rate for Long-Term Disability Insurance Self is not Verified");
			System.out.println("Estimated Rate for Long-Term Disability  Insurance Self is==" + premium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for Long-Term Disability  Insurance Self is==" + premium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Premium Rates for Long-Term Disability  Insurance Self is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate Estimated Premium Rates for Long-Term Disability Plus Insurance Self || Fail"
							+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_LTD(String Spremium,
			String amount) throws Exception {
		try {
			log.debug("Validates Estimated Premium for Spouse for given Benefit Amount under LTD");
			reuseMethod.scrollDown(EstimatedRate_LTD);
			Thread.sleep(2000);
			String actualRate = SpouseLTD_EstimatedRate.getText();
			Assert.assertEquals(actualRate, Spremium,
					"Estimated Rate for Long-Term Disability Insurance Spouse is not Verified");
			System.out.println("Estimated Rate for Long-Term Disability Insurance Spouse is==" + Spremium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for Long-Term Disability Insurance Spouse is==" + Spremium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Premium Rates for Long-Term Disability Insurance Spouse is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Rates for Long-Term Disability Insurance Spouse || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Total_Premium_as_under_LTD(String TotalAmt) throws Exception {
		try {
			log.debug("Validates Total Premium for LTD product");
			reuseMethod.scrollDown(EstimatedRate_LTD);
			Thread.sleep(2000);
			String actualRate = TotalAmountLTD_EstimatedRate.getText();
			Assert.assertEquals(actualRate, TotalAmt,
					"Estimated Total Amount for Long-Term Disability Insurance is not Verified");
			System.out.println("Estimated Total Amount for Long-Term Disability Insurance is==" + TotalAmt);
			log.info("Estimated Total Amount for Long-Term Disability Insurance is==" + TotalAmt);
			log.info("Estimated Total Amount for Long-Term Disability Insurance is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Total Amount for Long-Term Disability Insurance || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_MTDI(String premium, String amount)
			throws Exception {
		try {
			log.debug("Validates Estimated Premium for Self for given Benefit Amount under MTD");
			reuseMethod.scrollDown(EstimatedRate_MTD);
			Thread.sleep(2000);
			String actualRate = SelfMTD_EstimatedRate.getText();
			Assert.assertEquals(actualRate, premium,
					" Estimated Rate for Mid-Term Disability Insurance Self is not Verified");
			System.out.println("Estimated Rate for Mid-Term Disability  Insurance Self is==" + premium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for Mid-Term Disability  Insurance Self is==" + premium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Premium Rates for Mid-Term Disability  Insurance Self is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Rates for Mid-Term Disability Insurance Self || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_MTDI(String Spremium,
			String amount) throws Exception {
		try {
			log.debug("Validates Estimated Premium for Spouse for given Benefit Amount under MTD");
			reuseMethod.scrollDown(EstimatedRate_MTD);
			Thread.sleep(2000);
			String actualRate = SpouseMTD_EstimatedRate.getText();
			Assert.assertEquals(actualRate, Spremium,
					"Estimated Rate for Mid-Term Disability Insurance Spouse is not Verified");
			System.out.println("Estimated Rate for Mid-Term Disability Insurance Spouse is==" + Spremium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for Mid-Term Disability Insurance Spouse is==" + Spremium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Premium Rates for Mid-Term Disability Insurance Spouse is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Rates for Mid-Term Disability Insurance Spouse || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Total_Premium_as_under_MTDI(String TotalAmt) throws Exception {
		try {
			log.debug("Validates Total Premium for MTD product");
			reuseMethod.scrollDown(EstimatedRate_MTD);
			Thread.sleep(2000);
			String actualRate = TotalAmountMTD_EstimatedRate.getText();
			Assert.assertEquals(actualRate, TotalAmt,
					"Estimated Total Amount for Mid-Term Disability Insurance is not Verified");
			System.out.println("Estimated Total Amount for Mid-Term Disability Insurance is==" + TotalAmt);
			log.info("Estimated Total Amount for Mid-Term Disability Insurance is==" + TotalAmt);
			log.info("Estimated Total Amount for Mid-Term Disability Insurance is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Total Amount for Mid-Term Disability Insurance || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_RDI(String premium, String amount)
			throws Exception {
		try {
			log.debug("Validates Estimated Premium for Self for given Benefit Amount under RDI");
			reuseMethod.scrollDown(EstimatedRate_RDI);
			Thread.sleep(2000);
			String actualRate = SelfRDI_EstimatedRate.getText();
			Assert.assertEquals(actualRate, premium,
					" Estimated Rate for Retirement Disability Insurance Self is not Verified");
			System.out.println("Estimated Rate for Retirement Disability Insurance Self is==" + premium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for Retirement Disability Insurance Self is==" + premium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Premium Rates for Retirement Disability Insurance Self is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Rates for Retirement Disability Insurance  Self || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Total_Premium_as_under_RDI(String TotalAmt) throws Exception {
		try {
			log.debug("Validates Total Premium for RDI product");
			reuseMethod.scrollDown(EstimatedRate_RDI);
			Thread.sleep(2000);
			String actualRate = TotalAmountRDI_EstimatedRate.getText();
			Assert.assertEquals(actualRate, TotalAmt,
					"Estimated Total Amount for Retirement Disability Insurance is not Verified");
			System.out.println("Estimated Total Amount for Retirement Disability Insurance is==" + TotalAmt);
			log.info("Estimated Total Amount for Retirement Disability Insurance is==" + TotalAmt);
			log.info("Estimated Total Amount for Retirement Disability Insurance is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Total Amount forRetirement Disability Insurance || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_POEDI(String premium, String amount)
			throws Exception {
		try {
			log.debug("Validates Estimated Premium for Self for given Benefit Amount under POEDI");
			reuseMethod.scrollDown(EstimatedRate_POEDI);
			Thread.sleep(2000);
			String actualRate = SelfPOEDI_EstimatedRate.getText();
			Assert.assertEquals(actualRate, premium,
					" Estimated Rate for Professional Overhead Expense Disability Insurance Self is not Verified");
			System.out.println("Estimated Rate for Professional Overhead Expense Disability Insurance Self is=="
					+ premium + " " + "For Benefit Amount==" + amount);
			log.info("Estimated Rate for Professional Overhead Expense Disability Insurance Self is==" + premium + " "
					+ "For Benefit Amount==" + amount);
			log.info(
					"Premium Rates forProfessional Overhead Expense Disability Insurance Self is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate Estimated Premium Rates forProfessional Overhead Expense Disability Insurance Self || Fail"
							+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Total_Premium_as_under_POEDI(String TotalAmt) throws Exception {
		try {
			log.debug("Validates Total Premium for POEDI product");
			reuseMethod.scrollDown(EstimatedRate_POEDI);
			Thread.sleep(2000);
			String actualRate = TotalAmountPOEDI_EstimatedRate.getText();
			Assert.assertEquals(actualRate, TotalAmt,
					"Estimated Total Amount for Professional Overhead Expense Disability Insurance is not Verified");
			System.out.println(
					"Estimated Total Amount for Professional Overhead Expense Disability Insurance is==" + TotalAmt);
			log.info("Estimated Total Amount for Professional Overhead Expense Disability Insurance is==" + TotalAmt);
			log.info(
					"Estimated Total Amount for Professional Overhead Expense Disability Insurance is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate Estimated Total Amount for Professional Overhead Expense Disability Insurance || Fail"
							+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_HMI(String premium, String amount)
			throws Exception {
		try {
			log.debug("Validates Estimated Premium for Self for given Benefit Amount under HMI");
			reuseMethod.scrollDown(EstimatedRate_HMI);
			Thread.sleep(2000);
			String actualRate = SelfHMI_EstimatedRate.getText();
			Assert.assertEquals(actualRate, premium,
					" Estimated Rate for Hospital Money Insurance Self is not Verified");
			System.out.println("Estimated Rate for Hospital Money Insurance Self is==" + premium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for Hospital Money Insurance Self is==" + premium + " " + "For Benefit Amount=="
					+ amount);
			log.info("Premium Rates for Hospital Money Insurance Self is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Rates for Hospital Money Insurance Self || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_HMI(String Spremium,
			String amount) throws Exception {
		try {
			log.debug("Validates Estimated Premium for Spouse for given Benefit Amount under HMI");
			reuseMethod.scrollDown(EstimatedRate_HMI);
			Thread.sleep(2000);
			String actualRate = SpouseHMI_EstimatedRate.getText();
			Assert.assertEquals(actualRate, Spremium,
					"Estimated Rate for Hospital Money Insurance Spouse is not Verified");
			System.out.println("Estimated Rate for Hospital Money Insurance Spouse is==" + Spremium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for Hospital Money Insurance Spouse is==" + Spremium + " " + "For Benefit Amount=="
					+ amount);
			log.info("Premium Rates for Hospital Money Insurance Spouse is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Rates for Hospital Money Insurance Spouse || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Child_as_for_Benefit_Amount_under_HMI(String Cpremium, String amount)
			throws Exception {
		try {
			log.debug("Validates Estimated Premium for Child for given Benefit Amount under HMI");
			reuseMethod.scrollDown(EstimatedRate_HMI);
			Thread.sleep(2000);
			String actualRate = ChildHMI_EstimatedRate.getText();
			Assert.assertEquals(actualRate, Cpremium,
					" Estimated Rate for Hospital Money Insurance Child is not Verified");
			System.out.println("Estimated Rate for Hospital Money Insurance Spouse is==" + Cpremium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for Hospital Money Insurance Child is==" + Cpremium + " " + "For Benefit Amount=="
					+ amount);
			log.info("Premium Rates for Hospital Money Insurance Child is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Rates for Hospital Money Insurance Child || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Total_Premium_as_under_HMI(String TotalAmt) throws Exception {
		try {
			log.debug("Validates Total Premium for HMI product");
			reuseMethod.scrollDown(EstimatedRate_HMI);
			Thread.sleep(2000);
			String actualRate = TotalAmountHMI_EstimatedRate.getText();
			Assert.assertEquals(actualRate, TotalAmt,
					"Estimated Total Amount for Hospital Money Insurance is not Verified");
			System.out.println("Estimated Total Amount for Hospital Money Insurance is==" + TotalAmt);
			log.info("Estimated Total Amount for Hospital Money Insurance is==" + TotalAmt);
			log.info("Estimated Total Amount for Hospital Money Insurance is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Total Amount for Hospital Money Insurance || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_CI(String premium, String amount)
			throws Exception {
		try {
			log.debug("Validates Estimated Premium for Self for given Benefit Amount under CI");
			reuseMethod.scrollDown(EstimatedRate_CI);
			Thread.sleep(2000);
			String actualRate = SelfCI_EstimatedRate.getText();
			Assert.assertEquals(actualRate, premium, " Estimated Rate for Critical Illness Self is not Verified");
			System.out.println(
					"Estimated Rate for Critical Illness Self is==" + premium + " " + "For Benefit Amount==" + amount);
			log.info("Estimated Rate for Critical Illness Self is==" + premium + " " + "For Benefit Amount==" + amount);
			log.info("Premium Rates for Critical Illness Self is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate Estimated Premium Rates for Critical Illness Self || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_CI(String Spremium, String amount)
			throws Exception {
		try {
			log.debug("Validates Estimated Premium for Spouse for given Benefit Amount under CI");
			reuseMethod.scrollDown(EstimatedRate_CI);
			Thread.sleep(2000);
			String actualRate = SpouseCI_EstimatedRate.getText();
			Assert.assertEquals(actualRate, Spremium, "Estimated Rate for Critical Illness Spouse is not Verified");
			System.out.println("Estimated Rate for Critical Illness Spouse is==" + Spremium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for Critical Illness Spouse is==" + Spremium + " " + "For Benefit Amount=="
					+ amount);
			log.info("Premium Rates for Critical Illness Spouse is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to validate Estimated Premium Rates forCritical Illness Spouse || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Total_Premium_as_under_CI(String TotalAmt) throws Exception {
		try {
			log.debug("Validates Total Premium for CI product");
			reuseMethod.scrollDown(EstimatedRate_CI);
			Thread.sleep(2000);
			String actualRate = TotalAmountCI_EstimatedRate.getText();
			Assert.assertEquals(actualRate, TotalAmt, "Estimated Total Amount for Critical Illness is not Verified");
			System.out.println("Estimated Total Amount for Critical Illness is==" + TotalAmt);
			log.info("Estimated Total Amount for Critical Illness is==" + TotalAmt);
			log.info("Estimated Total Amount for Critical Illness is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Total Amount for Critical Illness || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_TermLife(String premium,
			String amount) throws Exception {
		try {
			log.debug("Validates Estimated Premium for Self for given Benefit Amount under TermLife");
			reuseMethod.scrollDown(EstimatedRate_TermLife);
			Thread.sleep(2000);
			String actualRate = SelfTermLife_EstimatedRate.getText();
			Assert.assertEquals(actualRate, premium, " Estimated Rate for Term Life Self is not Verified");
			System.out.println(
					"Estimated Rate for Term Life Self is==" + premium + " " + "For Benefit Amount==" + amount);
			log.info("Estimated Rate for Term Life Self is==" + premium + " " + "For Benefit Amount==" + amount);
			log.info("Premium Rates for Term Life Self is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Rates for Term Life Self || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_TermLife(String Spremium,
			String amount) throws Exception {
		try {
			log.debug("Validates Estimated Premium for Spouse for given Benefit Amount under TermLife");
			reuseMethod.scrollDown(EstimatedRate_TermLife);
			Thread.sleep(2000);
			String actualRate = SpouseTermLife_EstimatedRate.getText();
			Assert.assertEquals(actualRate, Spremium, "Estimated Rate for Term Life Spouse is not Verified");
			System.out.println(
					"Estimated Rate for Term Life Spouse is==" + Spremium + " " + "For Benefit Amount==" + amount);
			log.info("Estimated Rate for Term Life Spouse is==" + Spremium + " " + "For Benefit Amount==" + amount);
			log.info("Premium Rates for Term Life Spouse is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Rates for Term Life Spouse || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Child_as_for_Benefit_Amount_under_TermLife(String Cpremium,
			String amount) throws Exception {
		try {
			log.debug("Validates Estimated Premium for Child for given Benefit Amount under TermLife");
			reuseMethod.scrollDown(EstimatedRate_TermLife);
			Thread.sleep(2000);
			String actualRate = ChildTermLife_EstimatedRate.getText();
			Assert.assertEquals(actualRate, Cpremium, " Estimated Rate for Term Life Child is not Verified");
			System.out.println(
					"Estimated Rate forTerm Life Spouse is==" + Cpremium + " " + "For Benefit Amount==" + amount);
			log.info("Estimated Rate for Term Life Child is==" + Cpremium + " " + "For Benefit Amount==" + amount);
			log.info("Premium Rates for Term Life Child is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Rates for Term Life Child || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Total_Premium_as_under_TermLife(String TotalAmt) throws Exception {
		try {
			log.debug("Validates Total Premium for TermLife product");
			reuseMethod.scrollDown(EstimatedRate_TermLife);
			Thread.sleep(2000);
			String actualRate = TotalAmountTermLife_EstimatedRate.getText();
			Assert.assertEquals(actualRate, TotalAmt, "Estimated Total Amount for Term Life is not Verified");
			System.out.println("Estimated Total Amount for  Term Life is==" + TotalAmt);
			log.info("Estimated Total Amount for Term Life is==" + TotalAmt);
			log.info("Estimated Total Amount for Term Life is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Total Amount for Term Life || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_DII(String premium, String amount)
			throws Exception {
		try {
			log.debug("Validates Estimated Premium for Self for given Benefit Amount under DII");
			reuseMethod.scrollDown(EstimatedRate_DII);
			Thread.sleep(2000);
			String actualRate = SelfDII_EstimatedRate.getText();
			Assert.assertEquals(actualRate, premium,
					" Estimated Rate for Disability Income Insurance Self is not Verified");
			System.out.println("Estimated Rate for Disability Income Insurance Self is==" + premium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for Disability Income Insurance Self is==" + premium + " " + "For Benefit Amount=="
					+ amount);
			log.info("Premium Rates for Disability Income Insurance Self is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Rates for Disability Income Insurance Self || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_DII(String Spremium,
			String amount) throws Exception {
		try {
			log.debug("Validates Estimated Premium for Spouse for given Benefit Amount under DII");
			reuseMethod.scrollDown(EstimatedRate_DII);
			Thread.sleep(2000);
			String actualRate = SpouseDII_EstimatedRate.getText();
			Assert.assertEquals(actualRate, Spremium,
					"Estimated Rate for Disability Income Insurance Spouse is not Verified");
			System.out.println("Estimated Rate for Disability Income Insurance Spouse is==" + Spremium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Estimated Rate for Disability Income Insurance Spouse is==" + Spremium + " "
					+ "For Benefit Amount==" + amount);
			log.info("Premium Rates for Disability Income Insurance Spouse is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Rates for Disability Income Insurance Spouse || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Total_Premium_as_under_DII(String TotalAmt) throws Exception {
		try {
			log.debug("Validates Total Premium for DII product");
			reuseMethod.scrollDown(EstimatedRate_DII);
			Thread.sleep(2000);
			String actualRate = TotalAmountDII_EstimatedRate.getText();
			Assert.assertEquals(actualRate, TotalAmt,
					"Estimated Total Amount for Disability Income Insurance is not Verified");
			System.out.println("Estimated Total Amount for Disability Income Insurance is==" + TotalAmt);
			log.info("Estimated Total Amount for Disability Income Insurance is==" + TotalAmt);
			log.info("Estimated Total Amount for Disability Income Insurance is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Total Amount for Disability Income Insurance || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Premium_is_not_available_under_HII() throws Exception {
		try {
			log.debug("Validates Estimated Premium is not available under HII");
			reuseMethod.scrollDown(EstimatedRate_HMI);
			Thread.sleep(2000);
			EstimatedRate_NotAvailable.isDisplayed();
			log.info("Estimated Premium is not available under HII is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium is not available under HII || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_on_Yes_Account_Holder() throws Exception {
		try {
			log.debug("Clicks on Yes for are you a account holder or authorized to use this account");
			YesAccHolder_Self.isDisplayed();
			Thread.sleep(1000);
			YesAccHolder_Self.click();
			log.info(
					"Clicks on Yes for are you a account holder or authorized to use this account Successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Click on Yes for are you a account holder or authorized to use this account || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_cost_values_For_GTLP75I_Self(String Mpremium) throws Exception {
		try {
			log.debug("Validate Estimated rates for GTLP75I for Self");
			Thread.sleep(5000);
			String ActualSelfPremium = EstimateCostSelf_GTLP75I.getText();
			System.out.println("Rate:::" + ActualSelfPremium);
			Assert.assertEquals(ActualSelfPremium, Mpremium, "Rate for Self Verified");
			log.info("Validate Estimated rates for GTLP75I for Self || Pass");
			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for GTLP75I for Self|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_cost_values_For_GTLP75I_Spouse(String Mpremium) throws Exception {
		try {
			log.debug("Validate Estimated rates for GTLP75I for Spouse");
			Thread.sleep(5000);
			String ActualSelfPremium = EstimateCostSpouse_GTLP75I.getText();
			System.out.println("Rate:::" + ActualSelfPremium);
			Assert.assertEquals(ActualSelfPremium, Mpremium, "Rate for Spouse Verified");
			log.info("Validate Estimated rates for GTLP75I for Spouse || Pass");
			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for GTLP75I for Spouse|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_cost_values_For_GTLP75I_ProvincialTax(String Mpremium) throws Exception {
		try {
			log.debug("Validate Estimated rates for GTLP75I for Provincial Tax");
			Thread.sleep(5000);
			String ActualSelfPremium = EstimateCostProvincialTax_GTLP75I.getText();
			System.out.println("Rate:::" + ActualSelfPremium);
			Assert.assertEquals(ActualSelfPremium, Mpremium, "Rate for ProvincialTax Verified");
			log.info("Validate Estimated rates for GTLP75I for ProvincialTax || Pass");
			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for GTLP75I for ProvincialTax|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_cost_values_For_GTLP75I_Total(String Mpremium) throws Exception {
		try {
			log.debug("Validate Estimated rates for GTLP75I for Total");
			Thread.sleep(5000);
			String ActualSelfPremium = EstimateCostTotal_GTLP75I.getText();
			System.out.println("Rate:::" + ActualSelfPremium);
			Assert.assertEquals(ActualSelfPremium, Mpremium, "Rate for Total Verified");
			log.info("Validate Estimated rates for GTLP75I for Total || Pass");
			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for GTLP75I for Total|| Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean payment_Information_Page_is_displayed_to_user_and_user_Selects_Payment_option_as_CreditCard_for_Flex10_Product()
			throws Exception {
		try {
			log.debug("Payment Informtion page is displayed to user and select Payment Method as Credit card for Flex10");
			Thread.sleep(1000);
			PaymentMethod_TenYear.isDisplayed();
			Thread.sleep(2000);
			PaymentMethod_TenYear.click();
			Thread.sleep(2000);
			CreditCard.isDisplayed();
			CreditCard.click();
			log.info(
					"Payment Informtion page is displayed to user and select Payment Method for Flex10 Product as Credit card successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select payment method as Bank for Flex10 Product as Credit card|| Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean user_enters_Details_for_Card_as(String Fname, String Lname, String CNum, String ExpDate)
			throws Exception {
		try {
			log.debug("User enters the card details");
			Thread.sleep(1000);
			Card_FName.isDisplayed();
			Card_FName.sendKeys(Fname);
			Card_LName.isDisplayed();
			Card_LName.sendKeys(Lname);
			Card_Number.isDisplayed();
			Card_Number.sendKeys(CNum);
			Card_ExpDate.isDisplayed();
			Card_ExpDate.click();
			Card_ExpDate.sendKeys(ExpDate);
			log.info("card details are entered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter card details || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_cost_values_For_Flex10_Self(String Mpremium) throws Exception {
		try {
			log.debug("Validate Estimated rates for Flex10 for Self");
			Thread.sleep(5000);
			String ActualSelfPremium = EstimateCostSelf_Flex10.getText();
			System.out.println("Rate:::" + ActualSelfPremium);
			Assert.assertEquals(ActualSelfPremium, Mpremium, "Rate for Self Verified");
			log.info("Validate Estimated rates for Flex10 for Self || Pass");
			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Flex10 for Self|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_cost_values_For_Flex10_Spouse(String Mpremium) throws Exception {
		try {
			log.debug("Validate Estimated rates for Flex10 for Spouse");
			Thread.sleep(5000);
			String ActualSelfPremium = EstimateCostSpouse_Flex10.getText();
			System.out.println("Rate:::" + ActualSelfPremium);
			Assert.assertEquals(ActualSelfPremium, Mpremium, "Rate for Spouse Verified");
			log.info("Validate Estimated rates for Flex10 for Spouse || Pass");
			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Flex10 for Spouse|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_cost_values_For_Flex10_ProvincialTax(String Mpremium) throws Exception {
		try {
			log.debug("Validate Estimated rates for Flex10 for Provincial Tax");
			Thread.sleep(5000);
			String ActualSelfPremium = EstimateCostProvincialTax_Flex10.getText();
			System.out.println("Rate:::" + ActualSelfPremium);
			Assert.assertEquals(ActualSelfPremium, Mpremium, "Rate for ProvincialTax Verified");
			log.info("Validate Estimated rates for Flex10 for ProvincialTax || Pass");
			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Flex10 for ProvincialTax|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_cost_values_For_Flex10_Total(String Mpremium) throws Exception {
		try {
			log.debug("Validate Estimated rates for Flex10 for Total");
			Thread.sleep(5000);
			String ActualSelfPremium = EstimateCostTotal_Flex10.getText();
			System.out.println("Rate:::" + ActualSelfPremium);
			Assert.assertEquals(ActualSelfPremium, Mpremium, "Rate for Total Verified");
			log.info("Validate Estimated rates for Flex10 for Total || Pass");
			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Flex10 for Total|| Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean selects_Existing_Bank_Acc() throws Exception {
		try {
			log.debug("Select existing bank account radio button");
			Existing_Bank.isDisplayed();
			Thread.sleep(1000);
			Existing_Bank.click();
			log.info("Existing bank account is selected Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Existing bank account  || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean validate_the_estimated_cost_values_For_Flex20_Self(String Mpremium) throws Exception {
		try {
			log.debug("Validate Estimated rates for Flex20 for Self");
			Thread.sleep(5000);
			String ActualSelfPremium = EstimateCostSelf_Flex20.getText();
			System.out.println("Rate:::" + ActualSelfPremium);
			Assert.assertEquals(ActualSelfPremium, Mpremium, "Rate for Self Verified");
			log.info("Validate Estimated rates for Flex20 for Self || Pass");
			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Flex20 for Self|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_cost_values_For_Flex20_Spouse(String Mpremium) throws Exception {
		try {
			log.debug("Validate Estimated rates for Flex20 for Spouse");
			Thread.sleep(5000);
			String ActualSelfPremium = EstimateCostSpouse_Flex20.getText();
			System.out.println("Rate:::" + ActualSelfPremium);
			Assert.assertEquals(ActualSelfPremium, Mpremium, "Rate for Spouse Verified");
			log.info("Validate Estimated rates for Flex20 for Spouse || Pass");
			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Flex20 for Spouse|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_cost_values_For_Flex20_ProvincialTax(String Mpremium) throws Exception {
		try {
			log.debug("Validate Estimated rates for Flex20 for Provincial Tax");
			Thread.sleep(5000);
			String ActualSelfPremium = EstimateCostProvincialTax_Flex20.getText();
			System.out.println("Rate:::" + ActualSelfPremium);
			Assert.assertEquals(ActualSelfPremium, Mpremium, "Rate for ProvincialTax Verified");
			log.info("Validate Estimated rates for Flex20 for ProvincialTax || Pass");
			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Flex20 for ProvincialTax|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_estimated_cost_values_For_Flex20_Total(String Mpremium) throws Exception {
		try {
			log.debug("Validate Estimated rates for Flex20 for Total");
			Thread.sleep(5000);
			String ActualSelfPremium = EstimateCostTotal_Flex20.getText();
			System.out.println("Rate:::" + ActualSelfPremium);
			Assert.assertEquals(ActualSelfPremium, Mpremium, "Rate for Total Verified");
			log.info("Validate Estimated rates for Flex20 for Total || Pass");
			return true;
		} catch (Exception e) {
			log.error("Validate Estimated rates for Flex20 for Total|| Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean confirms_I_authorize_SunLife_Check_Box_on_Payment_Page() throws Exception {

		try {
			log.debug("Check the checkbox on Payment Page that I authorize SunLife");
			Thread.sleep(5000);
			reuseMethod.scrollDown(SunLife_authorize);
			SunLife_authorize.isDisplayed();
			SunLife_authorize.click();
			Thread.sleep(2000);
			log.info("Payment page checkbox is clicked Successfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click  Payment page checkbox  || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean validates_Estimated_Cost_for_Self_as_for_Benefit_Amount_under_GTLI(String premium, String amount)
			throws Exception {
		try {
			log.debug("Validates Estimated Cost for Self for given Benefit Amount under GTLI");
			reuseMethod.scrollDown(EstimatedRate_GTLI);
			Thread.sleep(2000);
			String actualRate = SelfGTLI_EstimatedRate.getAttribute("value");
			Assert.assertEquals(actualRate, premium, " Estimated Cost for GTLI Self is not Verified");
			System.out.println("Estimated Cost for GTLI Self is==" + premium + " " + "For Benefit Amount==" + amount);
			log.info("Estimated Cost for GTLI Self is==" + premium + " " + "For Benefit Amount==" + amount);
			log.info("Premium Cost for GTLI Self is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Cost for GTLI Self || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Cost_for_Spouse_as_for_Benefit_Amount_under_GTLI(String Spremium, String amount)
			throws Exception {
		try {
			log.debug("Validates Estimated Cost for Spouse for given Benefit Amount under GTLI");
			reuseMethod.scrollDown(EstimatedRate_GTLI);
			Thread.sleep(2000);
			String actualRate = SpouseGTLI_EstimatedRate.getAttribute("value");
			Assert.assertEquals(actualRate, Spremium, "Estimated Cost for GTLI Spouse is not Verified");
			System.out.println("Estimated Cost for GTLI Spouse is==" + Spremium + " " + "For Benefit Amount==" + amount);
			log.info("Estimated Cost for GTLI Spouse is==" + Spremium + " " + "For Benefit Amount==" + amount);
			log.info("Premium Cost for GTLI Spouse is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Premium Cost for GTLI Spouse || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Estimated_Cost_for_Child_as_for_Benefit_Amount_under_GTLI(String Cpremium, String amount)
			throws Exception {
		try {
			log.debug("Validates Estimated Cost for Child for given Benefit Amount under GTLI");
			reuseMethod.scrollDown(EstimatedRate_GTLI);
			Thread.sleep(2000);
			String actualRate = ChildGTLI_EstimatedRate.getAttribute("value");
			Assert.assertEquals(actualRate, Cpremium, " Estimated Cost for GTLI Child is not Verified");
			System.out.println("Estimated Cost for GTLI  Spouse is==" + Cpremium + " " + "For Benefit Amount==" + amount);
			log.info("Estimated Cost for GTLI Child is==" + Cpremium + " " + "For Benefit Amount==" + amount);
			log.info("Premium Cost for GTLI Child is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Cost Rates for GTLI Child || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_Total_Cost_as_under_GTLI(String TotalAmt) throws Exception {
		try {
			log.debug("Validates Total Cost for GTLI product");
			reuseMethod.scrollDown(EstimatedRate_GTLI);
			Thread.sleep(2000);
			String actualRate = TotalAmountGTLI_EstimatedRate.getAttribute("value");
			Assert.assertEquals(actualRate, TotalAmt, "Estimated Total Amount for GTLI is not Verified");
			System.out.println("Estimated Total Amount for GTLI is==" + TotalAmt);
			log.info("Estimated Total Amount for GTLI is==" + TotalAmt);
			log.info("Estimated Total Amount for GTLI is Validated Successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Estimated Total Amount for GTLI || Fail" + e.getMessage());
			throw (e);
		}
	}

}
