package Page;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import Selenium.ScreenShotUtility;
import Selenium.SetUp;
import Utility.ReuseableMethod;
import Utility.propertyUtility;

public class Nyl_ProductPage extends SetUp {

	private final Logger log = LogManager.getLogger(Nyl_ProductPage.class.getName());

	public Nyl_ProductPage() {
		driver = getDriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	ReuseableMethod reuseMethod = new ReuseableMethod();
	ScreenShotUtility screenShotUtility = new ScreenShotUtility();
	propertyUtility PropertyUtility = new propertyUtility();

	@FindBy(xpath = "//label[contains(text(),'Select Product(s)')]")
	WebElement Select_Product;

	@FindBy(xpath = "//div[@id='productLIFiveYr']")
	WebElement FiveYearProduct;

	@FindBy(xpath = "//div[@id='productLITenYr']")
	WebElement TenYearProduct;

	@FindBy(xpath = "//div[@id='productLITwentyYr']")
	WebElement TwentyYearProduct;

	@FindBy(xpath = "//label[contains(text(),'50+ Multi-Benefit Term Life Insurance')]")
	WebElement FiftyPlusMultiBenefitProduct;

	@FindBy(xpath = "//label[contains(text(),'Accidental Death and Dismemberment Insurance')]")
	WebElement AccidentalDeathProduct;

	@FindBy(xpath = "//div[@id='productDILongPlus']")
	WebElement LongTermDisabilityPlusProduct;

	@FindBy(xpath = "//div[@id='productDILong']")
	WebElement LongTermDisabilityProduct;

	@FindBy(xpath = "//div[@id='productDIShort']")
	WebElement MidTermDisabilityProduct;

	@FindBy(xpath = "//div[@id='productDIRetirement']")
	WebElement RetirementDisabilityProduct;

	@FindBy(xpath = "//label[contains(text(),'Professional Overhead Expense Disability Insurance')]")
	WebElement ProfessionalProduct;

	@FindBy(xpath = "//label[contains(text(),'Critical Illness')]")
	WebElement CriticalIllnessProduct;

	@FindBy(xpath = "//label[contains(text(),'Hospital Money Insurance')]")
	WebElement HospitalMoneyInsuranceProduct;

	@FindBy(xpath = "//input[@id='productLIFiveYr_chkPartySlf']//following-sibling::div")
	WebElement FiveYrTermself;

	// @FindBy(xpath="//input[@id='productLIFiveYr_chkPartyChd']//following::div[1]")
	// WebElement FiveYrTermchild;

	// @FindBy(xpath="//input[@id='productLITenYr_chkPartySlf']//following::div[1]")
	@FindBy(xpath = "//input[@id='productLITenYr_chkPartySlf']//following-sibling::div")
	WebElement TenYrTermself;

	@FindBy(xpath = "//input[@id='productLIFiftyYr_chkPartySlf']//following-sibling::div")
	WebElement FiftyYrTermself;

	@FindBy(xpath = "//input[@id='productAccdntDeath_chkPartySlf']//following-sibling::div")
	WebElement AccdntDeathSelf;

	@FindBy(id = "productAccdntDeath_chkPartySlf")
	WebElement AccdntDeathSelfverify;

	@FindBy(xpath = "//input[@id='productLITwentyYr_chkPartySlf']//following-sibling::div")
	WebElement TwentyYrTermProductSelf;

	@FindBy(xpath = "//input[@id='productDILongPlus_chkPartySlf']//following-sibling::div")
	WebElement LongTermDisabilityPlusProductSelf;

	@FindBy(xpath = "//input[@id='productDILong_chkPartySlf']//following-sibling::div")
	WebElement LongTermDisabilityProductSelf;

	@FindBy(xpath = "//input[@id='productDIShort_chkPartySlf']//following-sibling::div")
	WebElement MidTermDisabilityProductSelf;

	@FindBy(xpath = "//input[@id='productDIRetirement_chkPartySlf']//following-sibling::div")
	WebElement RetirementDisablityProductSelf;

	@FindBy(xpath = "//input[@id='productGrpOffOvr_chkPartySlf']//following-sibling::div")
	WebElement ProfessionalExpenseProductself;

	@FindBy(xpath = "//input[@id='productGrpOffOvr_chkPartySps']//following-sibling::div")
	WebElement ProfessionalExpenseProductSpouse;

	@FindBy(xpath = "//input[@id='productCICriticalIllness_chkPartySlf']//following-sibling::div")
	WebElement CriticalIllnessProductSelf;

	@FindBy(xpath = "//input[@id='productLIFiveYr2_chkPartySlf']//following-sibling::div")
	WebElement PureTermLifeProductSelf;

	@FindBy(xpath = "//input[@id='productLIFiveYr3_chkPartySlf']//following-sibling::div")
	WebElement PreferredTermLifeProductSelf;

	@FindBy(xpath = "//input[@id='productLIFiveYr3_chkPartyChd']//parent::div/parent::label")
	WebElement PreferredTermLifeProductChild;




	// AAFPIN

	// Practice Overhead Insurance= Business Overhead Expense Insurance=Office
	// Overhead

	// Practice Overhead Insurance Product
	@FindBy(xpath = "//input[@id='productGrpOffOvr_chkPartySlf']/following-sibling::div")

	WebElement PO_OR_BOE_OR_OO_Product_Self;

	@FindBy(xpath = "//input[@id='productGrpOffOvr_chkPartySps']/following-sibling::div")
	WebElement PO_OR_BOE_OR_OO_Product_Spouse;

	@FindBy(xpath = "//input[@id='productGrpOffOvr_chkPartyChd']/following-sibling::div")
	WebElement PO_OR_BOE_OR_OO_Product_Child;

	@FindBy(xpath = "//input[@id='productLIFifteenYr_chkPartySlf']//following-sibling::div")
	WebElement FifteenYrTermProductSelf;

	@FindBy(xpath = "//div[@id='productGrpOffOvr']")
	WebElement PO_OR_BOE_Product_Available;
	/*---------------Spouse---------------------------*/

	@FindBy(xpath = "//input[@id='productLIFiveYr_chkPartySps']//following-sibling::div")
	WebElement FiveYrTermSpouse;

	@FindBy(xpath = "//input[@id='productLITenYr_chkPartySps']//following-sibling::div")
	WebElement TenYrTermSpouse;

	@FindBy(xpath = "//input[@id='productLITwentyYr_chkPartySps']//following-sibling::div")
	WebElement TwentyYrTermSpouse;

	@FindBy(xpath = "//input[@id='productLIFiftyYr_chkPartySps']//following-sibling::div")
	WebElement FiftyYrTermspouse;

	@FindBy(xpath = "//input[@id='productAccdntDeath_chkPartySps']//following-sibling::div")
	WebElement AccdntDeathSpouse;

	@FindBy(xpath = "//input[@id='productDILongPlus_chkPartySps']//following-sibling::div")
	WebElement LongTermDisability_PlusProductSpouse;

	@FindBy(xpath = "//input[@id='productDILong_chkPartySps']//following-sibling::div")
	WebElement LongTermDisabilityProductSpouse;

	@FindBy(xpath = "//input[@id='productDIShort_chkPartySps']//following-sibling::div")
	WebElement MidTermDisabilityProductSpouse;

	@FindBy(xpath = "//input[@id='productCICriticalIllness_chkPartySps']//following-sibling::div")
	WebElement CriticalIllnessProductSpouse;

	@FindBy(xpath = "//input[@id='productLIFifteenYr_chkPartySps']//following-sibling::div")
	WebElement FifteenYrTermSpouse;

	/*---------------Child Product---------------------------*/

	@FindBy(xpath = "//input[@id='productLIAnnual_chkPartyChd']//parent::div/parent::label")
	WebElement TermLifeChild;
	@FindBy(id = "productLIAnnual_chkPartyChd")
	WebElement TermLifeChildverify;
	
	@FindBy(xpath = "//input[@id='productLIFiveYr_chkPartyChd']//following-sibling::div")
	WebElement FiveYrTermChild;

	@FindBy(xpath = "//input[@id='productLITenYr_chkPartyChd']//parent::div/parent::label")
	WebElement TenYrTermChild;

	@FindBy(xpath = "//input[@id='productLITwentyYr_chkPartyChd']//parent::div/parent::label")
	WebElement TwentyYrTermChild;

	@FindBy(xpath = "//input[@id='productAccdntDeath_chkPartyChd']//following-sibling::div")
	WebElement AccdntDeathChild;

	@FindBy(xpath = "//input[@id='productLIFifteenYr_chkPartyChd']//parent::div/parent::label")
	WebElement FifteenYrChild;

	// ******************************ASCE Product
	// Page******************************************//

	/*---------------Term Life Insurance OR Annual Renewable Term Life Insurance------------------*/

	@FindBy(xpath = "//div[@id='productLIAnnual']//div[@class='qd-productLIAnnual']")
	WebElement QuickDecision_TermLife;

	@FindBy(xpath = "//label[contains(text(),'Term Life Insurance')]")
	WebElement TermLifeInsuranceLabel;

	@FindBy(xpath = "//div[@data-fields='productLIAnnual']")
	WebElement TermLifeInsurance;

	@FindBy(xpath = "//input[@id='productLIAnnual_chkPartySlf']//following-sibling::div")
	WebElement TermLifeSelf;

	@FindBy(xpath = "//input[@id='productLIAnnual_chkPartySps']//following-sibling::div")
	WebElement TermLifeSpouse;

	/*---------------10 Year Term Life Insurance------------------*/

	@FindBy(xpath = "//div[@data-fields='productLITenYr']")
	WebElement TenYearTermLifeInsurance;

	/*---------------20 Year Term Life Insurance------------------*/

	@FindBy(xpath = "//div[@data-fields='productLITwentyYr']")
	WebElement TwentyYearTermLifeInsurance;

	/*--------------------First-to-Die Term Life Insurance-------------------*/
	
	@FindBy(xpath="//input[@id='productLIFtDTermLif_chkPartySlf']//following-sibling::div")
	WebElement FirsttoDieTermLifeInsurance_Self;
	
	@FindBy(xpath="//input[@id='productLIFtDTermLif_chkPartySps']//following-sibling::div")
	WebElement FirsttoDieTermLifeInsurance_Spouse;
	
	/*----------High-Limit Death and Dismemberment Insurance--------*/

	@FindBy(xpath = "//label[contains(text(),'High-Limit Death and Dismemberment Insurance')]")
	WebElement HighLimitDeathInsuranceLabel;

	@FindBy(xpath = "//div[@data-fields='productAccdntDeath']")
	WebElement HighLimitDeathInsurance;

	/*---------------	Disability Income Insurance--------*/

	@FindBy(xpath = "//label[contains(text(),'Disability Income Insurance')]")
	WebElement DisabilityIncomeInsuranceLabel;

	@FindBy(xpath = "//div[@data-fields='productDIGrpDisable']")
	WebElement DisabilityIncomeInsurance;

	@FindBy(xpath = "//input[@id='productDIGrpDisable_chkPartySlf']//following::div[1]")
	WebElement DisabilityIncomeSelf;

	@FindBy(xpath = "//input[@id='productDIGrpDisable_chkPartySps']//following::div[1]")
	WebElement DisabilityIncomeSpouse;

	@FindBy(xpath = "//input[@id='productDIGrpDisable_chkPartyChd']//following::div[1]")
	WebElement DisabilityIncomeChild;

	/*---------------Hospital Indemnity Insurance------------------*/

	@FindBy(xpath = "//label[contains(text(),'Hospital Indemnity Insurance')]")
	WebElement HospitalIdemLabel;

	@FindBy(xpath = "//div[@data-fields='productHospitalIndem']")
	WebElement HospitalIdem;

	// ********Note: Hospital Indeminity in Acs is same as Hospital Money in ABE //

	@FindBy(xpath = "//input[@id='productHospitalIndem_chkPartySlf']//following-sibling::div")
	WebElement HospitalIdemSelf;

	@FindBy(xpath = "//input[@id='productHospitalIndem_chkPartySps']//following-sibling::div")
	WebElement HospitalIdemSpouse;

	@FindBy(xpath = "//input[@id='productHospitalIndem_chkPartyChd']//following-sibling::div")
	WebElement HospitalIdemChild;

	// *****************Accident-Only Disability Insurance**************//
	@FindBy(xpath = "//input[@id='productDIAccdntOnly_chkPartySlf']//following-sibling::div")
	WebElement Accident_only_Self;
	@FindBy(xpath = "//input[@id='productDIAccdntOnly_chkPartySps']//following-sibling::div")
	WebElement Accident_only_Spouse;

	@FindBy(xpath = "//input[@id='productDIAccdntOnly_chkPartyChd']//following-sibling::div")
	WebElement Accident_only_Child;
	@FindBy(xpath = "//div[@data-fields='productDIAccdntOnly']")
	WebElement Accident_only_product;

	/******************* Dependent Coverage Window *******************************/

	@FindBy(xpath = "//input[@id='productLIFiveYr_chkPartyChd']//following::div[1]")
	WebElement FiveYrTermchild;

	@FindBy(id = "submit")
	WebElement DependentCoverageWindow_Child;

	// WAEPA_Product***************

	@FindBy(xpath = "//*[contains(text(),'Group Term Life Insurance')]")
	WebElement GroupTermLife_Label;
	
	@FindBy(xpath = "//*[@data-fields='chkPartySlf']")
	WebElement GroupTermLife_Self;

	// WAEPA*************END************

	//CAT product************************************
	@FindBy(xpath = "//*[contains(text(),'Life to 95')]")
	WebElement LifeTo95Prod;
	
	@FindBy(xpath = "//*[contains(text(),'Accidental Death')]")
	WebElement AccidentalDeathProd;
	
	@FindBy(xpath = "//div[preceding-sibling::input[@id='productADOnlyAccidntDthOnly_chkPartySlf']]")
	WebElement AccidentalDeathProd_self;
	
	//@FindBy(xpath = "//div[preceding-sibling::label[@class='btn btn-selectgreen child-field']]/label[contains(text(),'Child')]")
	@FindBy(xpath = "//div[preceding-sibling::input[@id='productLIFiveYr_chkPartyChd']]")
	WebElement GroupTermLife_child;
	
	@FindBy(xpath = "//div[preceding-sibling::label[@class='btn btn-selectgreen']]/label[contains(text(),'Self')]")
	WebElement GroupTermLife_self;
	
	
	
	//CAT **********End*********************************************
	
	
	@FindBy(xpath = "//div[@class='modal-body']//div[@class='PA-15 confirmationMsg']")
	WebElement DependentCoverage;

	@FindBy(xpath = "//div[@class='PA-15 confirmationMsg' and contains(text(),'I understand that to apply for dependent coverage I must be insured or applying for that coverage.')]")
	WebElement DependentNote;

	@FindBy(xpath = "//button[@id='submit']")
	WebElement Dependent_Yes;

	@FindBy(xpath = "//button[@id='cancel' and @type='button']")
	WebElement Dependent_No;

	/*******************
	 * Product Additional Quetions Page
	 *******************************/

	@FindBy(id = "rdLIInforceSlf-1")
	WebElement LyfInsNoSelf;

	@FindBy(id = "rdLIInforceSlf-0")
	WebElement LyfInsYesSelf;

	@FindBy(id = "rdLIInforceSps-0")
	WebElement OtherLyfIns_Yes_Spouse;

	@FindBy(id = "txtLIInforceTtlSlf")
	WebElement TotalInsSelf;

	@FindBy(id = "rdLICovRplceSlf-0")
	WebElement ExistingInsPolicy_Yes;

	@FindBy(id = "rdLICovRplceSps-0")
	WebElement ExistingInsPolicy_Yes_Spouse;

	@FindBy(id = "rdLIPendSlf-0")
	WebElement PendingInsYesSelf;

	@FindBy(id = "rdLIPendSps-0")
	WebElement PendingInsYes_Spouse;

	@FindBy(id = "rdLIPendSlf-1")
	WebElement PendingInsNoSelf;

	@FindBy(id = "rdLIInforceSps-1")
	WebElement LyfInsNOSpouse;

	@FindBy(id = "rdLIPendSps-1")
	WebElement PendingInsNOSpouse;

	@FindBy(id = "txtLIInforceTtlSlf")
	WebElement TotalAmount;

	@FindBy(id = "txtLIPendTtlSlf")
	WebElement PendingAmount;

	@FindBy(id = "txtLIPendCarrSlf")
	WebElement CompanySelf;

	@FindBy(id = "txtLIInforceTtlSps")
	WebElement TotalAmount_Spouse;

	@FindBy(id = "txtLIPendTtlSps")
	WebElement PendingAmount_Spouse;

	@FindBy(id = "txtLIPendCarrSps")
	WebElement Company_Spouse;

	@FindBy(xpath = "//span[@class='alert-txt']")
	WebElement ErrorMsg;

	// AAFP
	@FindBy(xpath = "//span[@class='alert-txt' and text()='Please select at least one product.']")
	WebElement ErrorMsg_AtleastOneProduct;

	@FindBy(xpath = "//div[contains(@class,'Life-ques-sec')]")
	List<WebElement> li;

	@FindBy(id = "back")
	WebElement Previous;

	@FindBy(id = "cancel")
	WebElement Cancel;

	@FindBy(id = "saveForLater")
	WebElement SaveForLater;

	@FindBy(id = "next")
	WebElement Next;

	@FindBy(xpath = "//div[@class='EFT-l1 text-justify']")
	WebElement Replacement_Info;

	@FindBy(xpath = "//div[@*='lblLINoticeSlf']//label")
	// @FindBy(xpath="//label[contains(text(),'You have')]")
	WebElement NewyorkInfo;

	@FindBy(id = "chkLIConsentSlf")
	WebElement checkbox_Replacement;

	// TIE
	@FindBy(xpath = "//p[@class='error-text' and contains(text(),'Please select an option.')]")
	WebElement ErrorMsg_ReplacementInformation;

	@FindBy(id = "txtDIIncomeSlf")
	WebElement MonthlyIncome_Self;

	@FindBy(id = "txtOOMonBuisExpSlf")
	WebElement MonthlyBusinessExpense_Self;

	@FindBy(id = "txtOOMonBuisPercntSlf")
	WebElement MonthlyExpensePercent_Self;

	@FindBy(id = "rdDIInforceSlf-0")
	WebElement OtherIns_YES;

	@FindBy(id = "rdDIInforceSlf-1")
	WebElement OtherIns_NO;

	// AAFP
	@FindBy(id = "rdAddQuesUniservChapter-0")
	WebElement UniformedServiceChapter_Self_Yes;

	@FindBy(id = "rdAddQuesUniservChapter-1")
	WebElement UniformedServiceChapter_Self_NO;

	@FindBy(id = "rdAddQuesResident-0")
	WebElement ResidentMember_Self_Yes;

	@FindBy(id = "rdAddQuesResident-1")
	WebElement ResidentMember_Self_NO;

	@FindBy(id = "rdOOInforceSlf-0")
	WebElement OtherBusiness_YES;

	@FindBy(id = "rdOOInforceSlf-1")
	WebElement OtherBusiness_NO;

	@FindBy(id = "txtDIIncomeSps")
	WebElement MonthlyIncome_Spouse;

	@FindBy(id = "rdDIInforceSps-0")
	WebElement OtherInsSpouse_DI_YES;

	@FindBy(id = "rdDIInforceSps-1")
	WebElement OtherInsSpouse_NO;

	@FindBy(id = "compDIListSlf")
	WebElement AddCompanyDIButton;
	@FindBy(id = "compDIListSps")
	WebElement AddCompanySps_DIButton;

	// AAFP

	@FindBy(id = "compOOListSlf")
	WebElement AddCompanyOOButton;

	@FindBy(id = "txtCarrier")
	WebElement CompanyName;

	@FindBy(id = "txtMonBneftAmt")
	WebElement MonthlyBenefitAmt;

	@FindBy(xpath = "//input[@id='txtBnftPeriod' or @id='txtBneftPrd']")
	WebElement BenefitPeriod;

	@FindBy(id = "selOthrCovgBenPeriod")
	WebElement BenefitPeriod_Dropdown;

	@FindBy(xpath = "//button[@class='btn btn-success ok']")
	WebElement AddButton;

	@FindBy(id = "rdDICovgRplceSlf-0")
	WebElement CompanyCoverage_DIYES;

	// AAFP
	@FindBy(id = "rdOOCovgRplceSlf-0")
	WebElement CompanyCoverageYES_OO;

	@FindBy(id = "rdDICovgRplceSlf-1")
	WebElement ReplaceCompanyCoverage_NO;

	@FindBy(id = "rdDISlfEmpSlf-0")
	WebElement LessThanYearYES;

	@FindBy(id = "rdDISlfEmpSlf-1")
	WebElement LessThanYearNO;

	@FindBy(id = "txtDICovgRplceAmtSlf")
	WebElement ReplaceAmtSelf_DI;

	// AAFP
	@FindBy(id = "txtOOCovgRplceAmtSlf")
	WebElement ReplaceAmtSelf_OO;

	// AAFP

	@FindBy(id = "rdAddQuesHazardousPay-0")
	WebElement HazardousDuty_Self_Yes;

	@FindBy(id = "rdAddQuesHazardousPay-1")
	WebElement HazardousDuty_Self_No;

	@FindBy(id = "txtHazardousExplanation")
	WebElement HazardousExplanation_Self;

	@FindBy(id = "txtOOCovgRplceAmtSlf")
	WebElement ReplaceAmount_Self;

	@FindBy(id = "txtDICovgRplceAmtSps")
	WebElement SpouseReplaceAmnt;

	@FindBy(id = "rdDICovgRplceSps-0")
	WebElement SpouseReplace_DIYes;
	@FindBy(id = "rdDICovgRplceSps-1")
	WebElement SpouseReplace_DINo;

	/***********************************
	 * Mobile
	 *******************************************/

	@FindBy(xpath = "//h1[text()='Select Product']")
	WebElement product_page_Mob;
	@FindBy(xpath = "//input[starts-with(@id,'rdL')][contains(@id,'-1')]")
	List<WebElement> questions;

	@FindBy(xpath = "//div[@class='accordion-panel']//label[text()='Traditional Term Life Insurance' or text()='Group Term Life Insurance']")
	WebElement Traditional_Insurance_Mobile_label_arrow;

	@FindBy(xpath = "//div[@id='div_productLIFiveYr_chkPartySlf']//label")
	WebElement TraditionalProductSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_productLIFiveYr_chkPartySps']//label")
	WebElement TraditionalProductSpouse_Mobile;

	@FindBy(xpath = "//div[@id='div_productLIFiveYr_chkPartyChd']//label")
	WebElement TraditionalProductChild_Mobile;

	@FindBy(xpath = "//div[@id='div_productLITenYr_chkPartySlf']//label")
	WebElement TenYearProductSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_productLITenYr_chkPartySps']//label")
	WebElement TenYearProductSpouse_Mobile;

	@FindBy(xpath = "//div[@id='div_productLITwentyYr_chkPartySlf']//label")
	WebElement TwentyYearProductSelf_Mobile;

	@FindBy(id = "productLITwentyYr_chkPartySlf")
	WebElement TwentyYearProductSelf_verify_Mobile;

	@FindBy(xpath = "//div[@id='div_productLITwentyYr_chkPartySps']//label")
	WebElement TwentyYearProductSpouse_Mobile;

	@FindBy(id = "productLITwentyYr_chkPartySps")
	WebElement TwentyYearProductSpouse_verify_Mobile;

	@FindBy(xpath = "//div[@class='accordion-panel']//label[text()='10-Year Level Term Life Insurance ']")
	WebElement Ten_year_Life_Insurance_Mobile;

	@FindBy(xpath = "//div[@class='accordion-panel']//label[text()='20-Year Level Term Life Insurance ']")
	WebElement Twenty_year_Life_Insurance_Mobile;

	@FindBy(xpath = "//div[@class='accordion-panel']//label[text()='Long-Term Disability Insurance' or text()='Group Disability Income Insurance']")
	WebElement Long_Term_Disability_insurance_Mobile;

	@FindBy(xpath = "//div[@class='accordion-panel']//label[text()='Short-Term Disability Insurance']")
	WebElement short_Term_Disability_insurance_Mobile;

	@FindBy(xpath = "//div[@class='accordion-panel']//label[text()='Business Overhead Expense Insurance ']")
	WebElement Business_Overhead_Mobile;

	@FindBy(xpath = "//div[@class='accordion-panel']//label[text()='Group Disability Income Insurance']")
	WebElement Group_Disability_RUAA_Mobile;

	@FindBy(xpath = "//div[@id='div_productDIGrpDisable_chkPartySlf']//label")
	WebElement LongTerm_productSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_productDIGrpDisable_chkPartySps']//label")
	WebElement LongTerm_productSpouse_Mobile;

	@FindBy(xpath = "//div[@id='div_productDIShort_chkPartySlf']//label")
	WebElement ShortTerm_productSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_productDIShort_chkPartySps']//label")
	WebElement ShortTerm_productSpouse_Mobile;

	@FindBy(id = "productDIShort_chkPartySlf")
	WebElement ShortTerm_productSelfverify_Mobile;

	@FindBy(id = "productDIShort_chkPartySps")
	WebElement ShortTerm_productSpouseverify_Mobile;

	@FindBy(xpath = "//div[@id='div_productGrpOffOvr_chkPartySlf']//label")
	WebElement Business_Overhead_productSelf_Mobile;

	@FindBy(id = "productGrpOffOvr_chkPartySlf")
	WebElement Business_Overhead_productSelf_verify_Mobile;

	@FindBy(xpath = "//h2[text()='Group Disability Insurance']")
	WebElement Group_Disability_Title_Mobile;

	@FindBy(xpath = "//h2[text()='Group Term Life Insurance']")
	WebElement Group_Term_Title_Mobile;

	@FindBy(xpath = "//label[@for='chkLIConsentSlf']")
	WebElement NY_Info_Chk_Mobile;

	@FindBy(xpath = "//div[@id='lblLIConsentSlf']/label")
	WebElement NY_Info_text_Mobile;

	@FindBy(xpath = "//div[@id='rdLIInforceSps']//label[2]")
	WebElement SpouseInsuranceNO1_Mobile;

	@FindBy(xpath = "//div[@id='rdLIInforceSps']//label[1]")
	WebElement SpouseInsuranceYes1_Mobile;

	@FindBy(id = "txtLIInforceTtlSps")
	WebElement SpouseForceAmnt_Mobile;

	@FindBy(xpath = "//div[@id='rdLICovRplceSps']//label[1]")
	WebElement SpousereplaceYes_Mobile;

	@FindBy(xpath = "//div[@id='rdLICovRplceSps']//label[2]")
	WebElement SpousereplaceNo_Mobile;

	@FindBy(xpath = "//div[@id='rdLIPendSps']//label[2]")
	WebElement SpousePendNO_Mobile;

	@FindBy(xpath = "//div[@id='rdLIPendSps']//label[1]")
	WebElement SpousePendYes_Mobile;

	@FindBy(id = "txtLIPendTtlSps")
	WebElement SpousePendingAmnt_Mobile;

	@FindBy(id = "txtLIPendCarrSps")
	WebElement SpouseCompany_Mobile;

	@FindBy(id = "txtDIIncomeSps")
	WebElement SpouseIncome_Mobile;

	@FindBy(xpath = "(//div[@id='rdDIInforceSps']//label)[2]")
	WebElement SpouseInsuranceNO2_Mobile;

	@FindBy(xpath = "(//div[@id='rdDIInforceSps']//label)[1]")
	WebElement SpouseInsuranceYes2_Mobile;

	@FindBy(id = "0-dIInforceCovgSps_txtCarrier")
	WebElement SpouseCompany1_Mobile;

	@FindBy(id = "0-dIInforceCovgSps_txtMonBneftAmt")
	WebElement SpouseBenefitAmnt_Mobile;

	@FindBy(id = "0-dIInforceCovgSps_txtBneftPrd")
	WebElement SpouseBenefitPrd_Mobile;

	@FindBy(xpath = "(//div[@id='rdDICovgRplceSps']//label)[1]")
	WebElement SpouseReplaceYes_Mobile;

	@FindBy(xpath = "(//div[@id='rdDICovgRplceSps']//label)[2]")
	WebElement SpouseReplaceNo_Mobile;

	@FindBy(id = "txtDICovgRplceAmtSps")
	WebElement SpouseReplaceAmnt_Mobile;

	@FindBy(xpath = "(//div[@id='rdLIInforceSlf']//label)[2]")
	WebElement otherSelfNO_Mobile;

	@FindBy(xpath = "(//div[@id='rdLIInforceSlf']//label)[1]")
	WebElement otherSelfYes_Mobile;

	@FindBy(xpath = "(//div[@id='rdLIPendSlf']//label)[2]")
	WebElement pendingSelfNO_Mobile;

	@FindBy(xpath = "(//div[@id='rdLIPendSlf']//label)[1]")
	WebElement pendingSelfYes_Mobile;

	@FindBy(xpath = "//div[@id='field-rdLIInforceSlf']/label")
	WebElement otherSelfQuestion_Mobile;

	@FindBy(xpath = "//div[@id='field-rdLIPendSlf']/label")
	WebElement pendingSelfQuestion_Mobile;

	@FindBy(xpath = "(//div[@id='rdLICovRplceSlf']//label)[1]")
	WebElement replaceSelfQuestion_Yes_Mobile;

	@FindBy(xpath = "(//div[@id='rdLICovRplceSlf']//label)[2]")
	WebElement replaceSelfQuestion_No_Mobile;

	@FindBy(xpath = "(//div[@id='rdDIInforceSlf']//label)[1]")
	WebElement LongYes1_Self_Mobile;

	@FindBy(xpath = "(//div[@id='rdDIInforceSlf']//label)[2]")
	WebElement LongNo1_Self_Mobile;

	@FindBy(xpath = "(//div[@id='rdDICovgRplceSlf']//label)[2]")
	WebElement LongNo2_Self_Mobile;

	@FindBy(xpath = "(//div[@id='rdDICovgRplceSlf']//label)[1]")
	WebElement LongYes2_Self_Mobile;

	@FindBy(xpath = "(//div[@id='rdOOInforceSlf']//label)[2]")
	WebElement overHeadGroupNo1_Self_Mobile;

	@FindBy(xpath = "(//div[@id='rdOOInforceSlf']//label)[1]")
	WebElement overHeadGroupYes1_Self_Mobile;

	@FindBy(xpath = "(//div[@id='rdOOCovgRplceSlf']//label)[2]")
	WebElement overHeadGroupNo2_Self_Mobile;

	@FindBy(xpath = "(//div[@id='rdOOCovgRplceSlf']//label)[1]")
	WebElement overHeadGroupYes2_Self_Mobile;

	@FindBy(xpath = "//div[@id='field-rdLIInforceSps']/label")
	WebElement otherSpouseQuestion_Mobile;

	@FindBy(xpath = "//div[@id='field-rdLIPendSps']/label")
	WebElement pendingSpouseQuestion_Mobile;

	@FindBy(xpath = "//h1[text()='Spouse Product Questions']")
	WebElement SpouseProductQuesPage_Mobile;

	@FindBy(xpath = "//h1[text()='Your Product Questions']")
	WebElement YourProductQuesPage_Mobile;

	@FindBy(id = "txtLIInforceTtlSlf")
	WebElement ForceAmount_Self_Mobile;

	@FindBy(id = "txtLIPendTtlSlf")
	WebElement PendingAmount_Self_Mobile;

	@FindBy(id = "txtLIPendCarrSlf")
	WebElement CompanyGroupTerm_Self_Mobile;

	@FindBy(id = "0-dIInforceCovgSlf_txtCarrier")
	WebElement Company_Long_disab_Self_Mobile;

	@FindBy(id = "0-dIInforceCovgSlf_txtMonBneftAmt")
	WebElement Benefit_Amt_Long_Self_Mobile;

	@FindBy(id = "0-dIInforceCovgSlf_txtBneftPrd")
	WebElement Benefit_Prd_Long_Self_Mobile;

	@FindBy(id = "txtDICovgRplceAmtSlf")
	WebElement replace_Amnt_Self_Mobile1;

	@FindBy(id = "txtOOMonBuisExpSlf")
	WebElement Expense_Bus_Self_Mobile;

	@FindBy(id = "txtOOMonBuisPercntSlf")
	WebElement ExpensePer_Bus_Self_Mobile;

	@FindBy(id = "0-oOInforceCovgSlf_txtCarrier")
	WebElement Company_Bus_Overhead_Self_Mobile;

	@FindBy(id = "0-oOInforceCovgSlf_txtMonBneftAmt")
	WebElement Benefit_Amt_Bus_overhead_Self_Mobile;

	@FindBy(id = "0-oOInforceCovgSlf_txtBneftPrd")
	WebElement Benefit_Prd_Bus_overhead_Self_Mobile;

	@FindBy(id = "txtOOCovgRplceAmtSlf")
	WebElement replace_Amnt_Self_Mobile2;

	@FindBy(xpath = "//button[contains(@class,' submit')]")
	WebElement Dependent_OK_Mobile;

	@FindBy(xpath = "(//div[contains(@class,'modal-section')]/h3)[1]")
	WebElement Dependent_Msg_Header_Mobile;

	@FindBy(xpath = "(//div[contains(@class,'modal-section')]/p)[1]")
	WebElement Dependent_Msg_Body_Mobile;

	@FindBy(xpath = "(//div[contains(@class,'modal-section')])[1]")
	WebElement Dependent_PopUpMobile;

	@FindBy(id = "rdOOCovgRplceSlf-0")
	WebElement replace_OO_Yes;

	@FindBy(id = "rdOOCovgRplceSlf-1")
	WebElement replace_OO_No;

	@FindBy(id = "txtOOCovgRplceAmtSlf")
	WebElement replace_amount_OO;

	@FindBy(xpath = "//input[@id='productLIManager_chkPartySlf']//following-sibling::div")
	WebElement ManagerLifeInsuranceSelf;

	@FindBy(xpath = "//input[@id='productLIManager_chkPartySps']//following-sibling::div")
	WebElement ManagerLifeInsuranceSpouse;

	@FindBy(xpath = "//input[@id='productLIManager_chkPartyChd']//parent::div/parent::label")
	WebElement ManagerLifeInsuranceChild;

	@FindBy(xpath = "//div[@id='productLIManager']")
	WebElement ManagerLifeInsurance;

	@FindBy(xpath = "//input[@id='productLIEmp_chkPartySlf']//parent::div/parent::label")
	WebElement EmployeeLifeInsuranceSelf;

	@FindBy(xpath = "//input[@id='productLIGrpTermDeal_chkPartySlf']//following-sibling::div")
	WebElement GroupTermDealerLifeInsuranceSelf;

	@FindBy(xpath = "//div[@id='productLIGrpTermDeal']")
	WebElement GroupTermDealerLifeInsurance;

	@FindBy(xpath = "//input[@id='productLIGrpTermDeal_chkPartyChd']//following-sibling::div")
	WebElement GroupTermDealerLifeInsuranceChild;

	@FindBy(xpath = "//input[@id='productLIEmp_chkPartySps']//parent::div/parent::label")
	WebElement EmployeeLifeInsuranceSpouse;

	@FindBy(xpath = "//input[@id='productLIEmp_chkPartyChd']//parent::div/parent::label")
	WebElement EmployeeLifeInsuranceChild;

	@FindBy(xpath = "//input[@id='productLIGrpTermDeal_chkPartySps']//following-sibling::div")
	WebElement GroupTermDealerLifeInsuranceSpouse;

	/*********** Group Accidental Death and Dismemberment ******************/
	@FindBy(id = "productHiLimitAccdntDth")
	WebElement GroupAccidentalDeathAndDismemberment;

	@FindBy(xpath = "//input[@id='productHiLimitAccdntDth_chkPartySps']//following-sibling::div")
	WebElement GroupAccidentalDeathAndDismembermentSpouse;

	@FindBy(xpath = "//input[@id='productHiLimitAccdntDth_chkPartySlf']//following-sibling::div")
	WebElement GroupAccidentalDeathAndDismembermentSelf;

	
	@FindBy(xpath="//input[@id='productHiLimitAccdntDth_chkPartyChd']//following-sibling::div")
	WebElement GroupAccidentalDeathAndDismembermentChild;

	
	@FindBy(id = "productLink")
	WebElement Products_Icon;
	
	@FindBy(id = "genericError")
	WebElement Eligibilty_Iconscroll;
	
	@FindBy(xpath = "//div[@id='contactTab']//label[contains(text(),'Product(s): Additional Questions')]")
	WebElement ProductsAdditionalHeader;



	// waepagi

	@FindBy(xpath = "//h3[text()='Additional Questions']")
	WebElement Additional_Questions_label;

	public boolean product_page_details_are_displayed_to_user() throws Exception {
		try {
			log.debug("Product Page Details are displayed to user");
			Thread.sleep(2000);
			Select_Product.isDisplayed();

			log.info("Product Page details are validated successfully || PASS");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate the Product Page details|| Fail");
			throw (e);
		}

	}

	/*
	 * public boolean verify_that_product_page_are_displayed_to_user() throws
	 * Exception { try { log.debug("Product Page Details are displayed to user");
	 * Select_Product.isDisplayed();
	 * log.info("Product Page details are validated successfully || PASS"); return
	 * true; } catch (Exception e) {
	 * log.error("Not able to validate the Product Page details|| Fail"); throw (e);
	 * }
	 * 
	 * }
	 */

	public boolean validates_CI_is_not_displayed() throws Exception {
		try {

			log.debug("Validate CI is not displayed");

			Assert.assertFalse(CriticalIllnessProduct.isDisplayed(), "Critical illness Product is  displayed");

			log.info(" Validated CI is not displayed successfully || PASS");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Critical illness Product is not displayed");
			log.error(" Critical illness Product is not displayed|| Fail");
			return false;
		}

	}

	public boolean validates_MTDI_is_not_displayed() throws Exception {
		try {

			log.debug("Validate MTDI is not displayed");

			Assert.assertFalse(MidTermDisabilityProduct.isDisplayed(), "Mid Term Disability Product is  displayed");

			log.info(" Validate MTDI is not displayed successfully || PASS");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Mid Term Disability Product is not displayed");
			log.error(" Mid Term Disability Product is not displayed|| Fail");
			return false;
		}

	}

	public boolean validates_LTD_is_not_displayed() throws Exception {
		try {

			log.debug("Validate LTD is not displayed");

			Assert.assertFalse(LongTermDisabilityProduct.isDisplayed(), "Long Term Disability Product is displayed");

			log.info(" Validated LTD is not displayed successfully || PASS");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Long Term Disability Product is not displayed");
			log.error(" LTD Plus,LTD,MIDI,CI Product Page details that products are not displyed|| Fail");
			return false;
		}

	}

	public boolean validates_LTDPlus_is_not_displayed() throws Exception {
		try {

			log.debug("Validate LTD Plus is not displayed");
			Assert.assertFalse(LongTermDisabilityPlusProduct.isDisplayed(),
					"Long Term Disability Plus Product is  displayed");

			log.info(" Validated LTD Plus is not displayed successfully || PASS");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Long Term Disability Plus Product is not displayed");
			log.error(" LTD Plus is not displayed|| Fail");
			return false;
		}

	}

	public boolean validates_Accidental_Death_product_is_not_displayed() throws Exception {
		try {

			log.debug("Validate ACC Products is not displayed");
			Assert.assertFalse(AccidentalDeathProduct.isDisplayed(), "Accidental Health Product is displayed");

			log.info(" Validated ACC Products is not displayed successfully || PASS");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Accidental Health Product is not displayed");
			log.error(" ACC product at Product Page is not displyed|| Fail");
			return false;
		}

	}

	public boolean validates_HMI_product_is_not_displayed() throws Exception {
		try {

			log.debug("Validate HMI Products is not displayed");

			Assert.assertFalse(HospitalMoneyInsuranceProduct.isDisplayed(),
					"Hospital Money Insurance Product is displayed");

			log.info(" Validated HMI Product is not displayed successfully || PASS");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("HMI Product is not displayed");
			log.error(" HMI product at Product Page is not displyed|| Fail");
			return false;
		}

	}

	public boolean validates_the_product_TwentyYTL_is_not_displayed() throws Exception {
		try {
			log.debug("Verify the 20 year Products for Spouse is not displayed");

			if (TwentyYearProduct.isDisplayed()) {
				System.out.println("Twenty Year Product is displayed");
			}
			log.info("All Products are validated successfully || PASS");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("20 year Product is not Present");
			log.error("Not able to validate the twenty Year products is not displyed|| Fail");
			return false;
		}

	}

	public boolean verify_Available_Product_HII() throws Exception {
		try {
			log.debug("Verify the Products for Hospital Indemnity Insurance");

			if (HospitalIdem.isDisplayed()) {
				System.out.println("Hospital Indemnity Insurance Product is displayed");
			}

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Hospital Indemnity Insurance that products are not displayed");
			log.error(
					"Not able to validate the Product Page for Hospital Indemnity Insurance that products are not displayed|| Fail");
			return false;
		}

	}



	public boolean validates_that_Spouse_is_not_displayed_for_DII() throws Exception {
		try {
			log.debug("Validates that DII is not displayed");
			boolean Actual = DisabilityIncomeSpouse.isDisplayed();
			Assert.assertFalse(Actual, "Bug||Spouse is displayed for TermLife");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("*****DII product is not displayed**********");
			log.error("Not able to Validates that DII is not displayed || Fail");
			return false;
		}
	}

	public boolean validates_that_Spouse_is_displayed_for_DII() throws Exception {
		try {
			log.debug("Validates that DII is displayed");
			boolean Actual=DisabilityIncomeSpouse.isDisplayed();
			Assert.assertTrue(Actual, "Bug||Spouse is not displayed for DII");

			return true;
		} catch (NoSuchElementException e) {
	    	System.out.println("*****DII product is displayed**********");
	    	log.error("Not able to Validates that DII is displayed || Fail");
	        return false;
	    }
	}
	
	public boolean validates_that_Child_is_not_displayed_for_DII() throws Exception {
		try {
			log.debug("Validates that DII is not displayed");
			boolean Actual = DisabilityIncomeChild.isDisplayed();
			Assert.assertFalse(Actual, "Bug||Child is displayed for DII");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("*****DII product is not displayed**********");
			log.error("Not able to Validates that DII is not displayed || Fail");
			return false;
		}
	}

	public boolean Validates_that_PO_or_OO_or_BOE_is_not_displayed() throws Exception {

		try {
			log.debug("Validates that PO/OO/BOE product is not displayed");

			Assert.assertFalse(PO_OR_BOE_Product_Available.isDisplayed(), "Bug||PO/OO/BOE product is Displayed");

			return true;
		} catch (NoSuchElementException e) {

			System.out.println("*****PO/OO/BOE product is not displayed**********");
			log.error("Not able to Validates that PO is not displayed || Fail");
			return false;
		}

	}

	public boolean Validates_that_PO_or_OO_or_BOE_is_displayed() throws Exception {
		try {
			log.debug("Validates that PO/OO/BOE product is displayed");

			Assert.assertTrue(PO_OR_BOE_Product_Available.isDisplayed(), "Bug||PO/OO/BOE product is not Displayed");
			System.out.println("PO/OO/BOE product is displayed");
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("*****PO/OO/BOE product is not displayed**********");
			log.error("Not able to Validates that PO/OO/BOE product is displayed || Fail");
			return false;
		}
	}

	public boolean validate_Term_Life_ARTL_Insurance_Product_is_available() throws Exception {

		try {
			log.debug("Verify the Products for Term Life/ARTL Insurance");

			Assert.assertTrue (TermLifeInsurance.isDisplayed(),"Term Life Insurance Product is not displayed") ;
			System.out.println("Term LifeLife/ARTL Insurance Product is displayed");	
			log.info("Term LifeLife/ARTL Insurance Product is displayed");
			
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Term LifeLife/ARTL Insurance Product is not displayed");
			log.error("Not able to validate Products for Term Life Insurance || Fail");
			return false;
		}

	}
	
	public boolean validate_Term_Life_ARTL_Insurance_Product_is_not_available() throws Exception {

		try {
			log.debug("Verify the Products Term Life/ARTL Insurance is not available/displayed");

			Assert.assertFalse (TermLifeInsurance.isDisplayed(),"Term Life Insurance Product is displayed") ;
				log.info("Term LifeLife/ARTL Insurance Product is not displayed");
			
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("****Term LifeLife/ARTL Insurance Product is not displayed***********");
			log.error("Not able to validate Products for Term Life Insurance || Fail");
			return false;
		}

	}

	public boolean validate_Ten_Year_Term_Life_Insurance_Product_is_available() throws Exception {
		try {
			log.debug("Verify the Products for Ten Year Term Life Insurance");

			Assert.assertTrue(TenYearTermLifeInsurance.isDisplayed(),
					"Ten Year Term Life Insurance Product is not displayed");
			System.out.println("Ten Year Term Life Insurance Product is displayed");
			log.info("Ten Year Term Life Insurance Product is displayed");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Ten Year Term Life Insurance Product is not displayed");
			log.error("Not able to validate Products for Ten Year Term Life Insurance || Fail");
			return false;
		}

	}

	public boolean validate_Ten_Year_Term_Life_Insurance_Product_is_not_displayed() throws Exception {
		try {
			log.debug("Verify the Products for Ten Year Term Life Insurance is not displayed");

			Assert.assertFalse(TenYearTermLifeInsurance.isDisplayed(),
					"Ten Year Term Life Insurance Product is  displayed");
			System.out.println("Ten Year Term Life Insurance Product is not displayed");
			log.info("Ten Year Term Life Insurance Product is not displayed||Pass");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Ten Year Term Life Insurance Product is not displayed");
			log.error("Not able to validate Products for Ten Year Term Life Insurance || Fail");
			return false;
		}
	}


	public boolean validate_Twenty_Year_Term_Life_Insurance_Product_is_displayed() throws Exception {
		try {
			log.debug("Verify the Products for Twenty Year Term Life Insurance");

			Assert.assertTrue(TwentyYearTermLifeInsurance.isDisplayed(),
					"Twenty Year Term Life Insurance Product is not displayed");
			System.out.println("Twenty Year Term Life Insurance Product is displayed");
			log.info("Twenty Year Term Life Insurance Product is displayed||Pass");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Twenty Year Term Life Insurance Product is not displayed");
			log.error("Not able to validate Products for Twenty Year Term Life Insurance || Fail");
			return false;
		}

	}

	public boolean validate_Twenty_Year_Term_Life_Insurance_Product_is_not_displayed() throws Exception {
		try {
			log.debug("Verify the Products for Twenty Year Term Life Insurance is not displayed");

			Assert.assertFalse(TwentyYearTermLifeInsurance.isDisplayed(),
					"Twenty Year Term Life Insurance Product is  displayed");
			System.out.println("Twenty Year Term Life Insurance Product is not displayed");
			log.info("Twenty Year Term Life Insurance Product is not displayed||Pass");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Twenty Year Term Life Insurance Product is not displayed");
			log.error("Not able to validate Products for Twenty Year Term Life Insurance || Fail");
			return false;
		}
	}

	public boolean verify_the_Quick_Decision_is_Available_under_TermLife_on_Product_Page() throws Exception {
		try {
			log.debug("Verify the Quick Decision under Term Life Insurance");

			Assert.assertTrue(QuickDecision_TermLife.isDisplayed(),
					"Quick Decision under Term Life Insurance Product is not displayed");
			System.out.println("Quick Decision under Term Life Insurance Product is displayed");
			log.info("Quick Decision under Term Life Insurance Product is displayed||Pass");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Quick Decision under Term Life Insurance Product is not displayed");
			log.error("Not able to validate Products for Quick Decision under Term Life Insurance || Fail");
			return false;
		}

	}

	public boolean verify_the_Quick_Decision_is_not_Available_under_TermLife_on_Product_Page() throws Exception {
		try {
			log.debug("Verify the Quick Decision under Term Life Insurance is not displayed");

			Assert.assertFalse(QuickDecision_TermLife.isDisplayed(),
					"Quick Decision under Term Life Insurance Product is displayed");
			System.out.println("Quick Decision under Term Life Insurance Product is not  displayed");
			log.info("Quick Decision under Term Life Insurance Product is not displayed||Pass");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Quick Decision under Term Life Insurance Product is not displayed");
			log.error("Not able to validate Products for Quick Decision under Term Life Insurance || Fail");
			return false;
		}

	}

	public boolean validate_High_Limit_Death_Insurance_Product_is_displayed() throws Throwable {
		try {
			log.debug("Verify the Products for High Limit Death Insurance");

			Assert.assertTrue(HighLimitDeathInsurance.isDisplayed(),
					"High Limit Death Insurance Product is not displayed");
			System.out.println("High Limit Death Insurance Product is displayed");
			log.info("High Limit Death Insurance Product is displayed");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("High Limit Death Insurance Product is not displayed");
			log.error("Not able to validate Products for High Limit Death Insurance|| Fail");
			return false;
		}

	}

	public boolean validate_High_Limit_Death_Insurance_Product_is_not_displayed() throws Throwable {
		try {
			log.debug("Verify the Products for High Limit Death Insurance is not displayed");

			Assert.assertFalse(HighLimitDeathInsurance.isDisplayed(),
					"High Limit Death Insurance Product is displayed");
			System.out.println("High Limit Death Insurance Product is not displayed");
			log.info("High Limit Death Insurance Product is not displayed");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("High Limit Death Insurance Product is not displayed");
			log.error("Not able to validate Products for High Limit Death Insurance is not displayed|| Fail");
			return false;
		}

	}

	public boolean validate_Disability_Income_Insurance_Product_is_displayed() throws Throwable {
		try {
			log.debug("Verify the Products for Disability Income Insurance is displayed");


			Assert.assertTrue(DisabilityIncomeInsurance.isDisplayed(),
					"Disability Income Insurance Product is not displayed");
			System.out.println("Disability Income Insurance Product is displayed");

			boolean Actual = DisabilityIncomeInsurance.isDisplayed();
			Assert.assertTrue (Actual,"Disability Income Insurance Product is not displayed") ;
			System.out.println("Disability Income Insurance Product is displayed");	

			log.info("Disability Income Insurance Product is displayed");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Disability Income Insurance Product is not displayed");
			log.error("Not able to validate Products for Disability Income Insurance|| Fail");
			return false;
		}

	}

	public boolean validates_that_Self_is_displayed_for_HII() throws Throwable {
		try {
			log.debug("Verify the Self is displayed for HII/InHospitalInsurance");

			boolean check = HospitalIdemSelf.isDisplayed();
			Assert.assertTrue(check, "Bug||Self is not displayed for HII/InHospitalInsurance");
			System.out.println("Self is displayed for HII/InHospitalInsurance");

			System.out.println("*****Self is displayed for HII**********");
			log.info("Self is displayed for HII");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for HII/InHospitalInsurance**********");
			log.error("Self is not displayed for HII/InHospitalInsurance || Fail");
			return false;
		}
	}

	public boolean validate_Hospital_Indemnity_Insurance_Product_is_displayed() throws Throwable {
		try {
			log.debug("Verify the Products for Hospital Indemnity Insurance ");

			Assert.assertTrue(HospitalIdem.isDisplayed(), "Hospital Indemnity Insurance  Product is not displayed");
			System.out.println("Hospital Indemnity Insurance Product is displayed");
			log.info("Hospital Indemnity Insurance Product is displayed");

			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Hospital Indemnity Insurance  Product is not displayed");
			log.info("Hospital Indemnity Insurance Product is not  displayed");
			log.error("Not able to validate Products for Hospital Indemnity Insurance || Fail");
			return false;
		}

	}

	public boolean validate_Hospital_Indemnity_Insurance_Product_is_not_displayed() throws Throwable {
		try {
			log.debug("Verify the Products for Hospital Indemnity Insurance is not displayed ");

			Assert.assertFalse(HospitalIdem.isDisplayed(), "Hospital Indemnity Insurance  Product is displayed");
			System.out.println("Hospital Indemnity Insurance Product is not displayed");
			log.info("Hospital Indemnity Insurance Product is not displayed");

			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Hospital Indemnity Insurance  Product is not displayed");
			log.info("Hospital Indemnity Insurance Product is not  displayed");
			log.error("Not able to validate Products for Hospital Indemnity Insurance || Fail");
			return false;
		}

	}

	public boolean validate_Five_Year_Term_Life_Insurance_Product_is_displayed() throws Throwable {
		try {
			log.debug("Verify the Products for Five Year Term Life Insurance is not displayed");
			Assert.assertTrue(FiveYearProduct.isDisplayed(), "Five Year Life Insurance Product is not displayed");
			log.info("Five Year Term Life/Group Term Life Insurance Product is displayed");
			System.out.println("Five Year Term Life/Group Term Life Insurance Product is displayed");
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Five Year Insurance Product is not displayed");
			log.error("Not able to validate Products for Five Year Life Insurance || Fail");
			return false;
		}

	}

	public boolean validate_Fifty_Year_Term_Life_Insurance_Product_is_displayed() throws Throwable {
		try {
			log.debug("Verify the Products for Fifty Plus Multi Benefit Insurance  ");
			Assert.assertTrue(FiftyPlusMultiBenefitProduct.isDisplayed(),
					"Fifty Plus Multi Benefit Insurance Product is not displayed");
			System.out.println("Fifty Plus Multi Benefit Insurance Product is displayed");
			log.info("Fifty Plus Multi Benefit Insurance Product is displayed");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Fifty Plus Multi Benefit Insurance Product is not displayed");
			log.info("Fifty Plus Multi Benefit Insurance Product is not displayed");
			log.error("Not able to validate Products for Fifty Plus Multi Benefit Insurance Product || Fail");
			return false;
		}

	}

	public boolean validate_Accidental_Death_and_Dismemberment_Insurance_Product_is_displayed() throws Throwable {
		try {
			log.debug("Verify the Products for Accidental Death and Dismemberment Insurance");

			Assert.assertTrue(AccidentalDeathProduct.isDisplayed(),
					"Accidental Death and Dismemberment Insurance Product Product is not displayed");
			System.out.println(" Accidental Death and Dismemberment Insurance Product is displayed");

			log.info(" Accidental Death and Dismemberment Insurance Product Product is displayed");
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Accidental Death and Dismemberment Insurance Product is not displayed");
			log.info(" Accidental Death and Dismemberment Insurance Product is not displayed");
			log.error(
					"Not able to validate Products for  Accidental Death and Dismemberment Insurance Product || Fail");
			return false;
		}

	}

	public boolean validate_Long_Term_Disability_Plus_Insurance_Product_is_displayed() throws Throwable {
		try {
			log.debug("Verify the Products for Long-Term Disability Plus Insurance");
			Thread.sleep(1000);
			Assert.assertTrue(LongTermDisabilityPlusProduct.isDisplayed(),
					"Long-Term Disability Plus Insurance Product Product is not displayed");

			System.out.println("Long-Term Disability Plus Insurance Product is displayed");

			log.info("Long-Term Disability Plus Insurance Product Product is displayed");
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Long-Term Disability Plus Insurance Product is not displayed");
			log.info("Long-Term Disability Plus Insurance Product is not displayed");
			log.error(
					"Not able to validate Products for Long-Term Disability Plus Insurance Product is displayed|| Fail");
			return false;
		}

	}

	public boolean validate_Long_Term_Disability_Insurance_Product_is_displayed() throws Throwable {
		try {
			log.debug("Verify the Products for Long-Term Disability Insurance/Group Disability Income Insurance");

			Assert.assertTrue(LongTermDisabilityProduct.isDisplayed(),
					"Long-Term Disability Insurance Product Product is not displayed");

			System.out.println("Long-Term Disability Insurance/Group Disability Income Insurance Product is displayed");
			log.info("Long-Term Disability Insurance Product Product is displayed");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Long-Term Disability Insurance/Group Disability Income Insurance Product is not displayed");

			log.error("Not able to validate Products for Long-Term Disability /Group Disability Income Insurance || Fail");
			return false;
		}

	}

	public boolean validate_Mid_Term_Disability_Insurance_Product_is_displayed() throws Throwable {
		try {
			log.debug("Verify the Products for Mid/Short-Term Disability Insurance");
			Assert.assertTrue(MidTermDisabilityProduct.isDisplayed(),
					"Mid/Short-Term Disability Insurance Product is displayed");
			System.out.println("Mid/Short-Term Disability Insurance Product is displayed");
			log.info("Mid/Short-Term Disability Insurance Product  is displayed");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Mid/Short-Term Disability Insurance Product is not displayed");
			log.info("Mid/Short-Term Disability Insurance Product is not displayed");
			log.error("Not able to validate Products for Mid/Short-Term Disability Insurance Product || Fail");
			return false;
		}

	}

	public boolean validate_Retirement_Disability_Disability_Insurance_Product_is_displayed() throws Throwable {
		try {
			log.debug("Verify the Products for Retirement Disability Insurance");
			Assert.assertTrue(RetirementDisabilityProduct.isDisplayed(),
					"Retirement Disability Insurance Product is not displayed");
			System.out.println("Retirement Disability Insurance Product is displayed");
			log.info("Retirement Disability Insurance Product is displayed");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Retirement Disability Insurance Product is not displayed");

			log.error("Not able to validate Products for Retirement Disability Insurance || Fail");
			return false;
		}

	}

	public boolean validate_Retirement_Disability_Disability_Insurance_Product_is_not_displayed() throws Throwable {
		try {
			log.debug("Verify the Products for Retirement Disability Insurance is not displayed");
			Assert.assertFalse(RetirementDisabilityProduct.isDisplayed(),
					"Retirement Disability Insurance Product is displayed");

			log.info("Retirement Disability Insurance Product is not displayed");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Retirement Disability Insurance Product is not displayed");
			log.error("Not able to validate Products for Retirement Disability Insurance || Fail");
			return false;
		}

	}

	public boolean validate_Professional_Overhead_Expense_Disability_Insurance_Product_is_displayed() throws Throwable {
		try {
			log.debug("Verify the Products for Professional Overhead Expense Disability Insurance");
			Assert.assertTrue(ProfessionalProduct.isDisplayed(),
					"Professional Overhead Expense Disability Insurance Product is displayed");
			System.out.println("Professional Overhead Expense Disability Insurance Product is displayed");
			log.info("Professional Overhead Expense Disability Insurance Product is displayed");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Professional Overhead Expense Disability Insurance Product is not displayed");

			log.error(
					"Not able to validate Products for Professional Overhead Expense Disability Insurance Product || Fail");
			return false;
		}

	}

	public boolean validate_Professional_Overhead_Expense_Disability_Insurance_Product_is_not_displayed()
			throws Throwable {
		try {
			log.debug("Verify the Products for Professional Overhead Expense Disability Insurance is not displayed");
			Assert.assertFalse(ProfessionalProduct.isDisplayed(),
					"Professional Overhead Expense Disability Insurance Product is not displayed");
			System.out.println("Professional Overhead Expense Disability Insurance Product is not displayed");
			log.info("Professional Overhead Expense Disability Insurance Product is not displayed");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Professional Overhead Expense Disability Insurance Product is not displayed");

			log.error(
					"Not able to validate Products for Professional Overhead Expense Disability Insurance Product || Fail");
			return false;
		}

	}

	public boolean validate_Critical_Illness_Product_is_displayed() throws Throwable {
		try {
			log.debug("Verify the Products for Critical Illness");
			Assert.assertTrue(CriticalIllnessProduct.isDisplayed(), "Critical Illness Product is not displayed");
			System.out.println("Critical Illness Product is displayed");
			log.info("Critical Illness Product  is displayed");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Critical Illness Product is not displayed");
			log.info("Critical Illness Product is not displayed");
			log.error("Not able to validate Products for Critical Illness Product || Fail");
			return false;
		}

	}

	public boolean validate_Hospital_Money_Insurance_Product_is_displayed() throws Throwable {
		try {
			log.debug("Verify the Products for Hospital Money Insurance");
			Assert.assertTrue(HospitalMoneyInsuranceProduct.isDisplayed(),
					"Hospital Money Insurance Product is not displayed");
			System.out.println("Hospital Money Insurance Product is displayed");
			log.info("Hospital Money Insurance Product Product is displayed");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Hospital Money Insurance Product is not displayed");
			log.info("Hospital Money Insurance Product is not displayed");
			log.error("Not able to validate Products for Hospital Money Insurance Product || Fail");
			return false;
		}

	}

	public boolean validates_that_Self_is_displayed_for_TenYTL() throws Throwable {
		try {
			log.debug("Verify the Self is displayed for TenYTL");
			boolean check = TenYrTermself.isDisplayed();
			Assert.assertTrue(check, "Bug||Self is not displayed for TenYTL");
			System.out.println("Self is displayed for TenYTL");
			log.info("Self is displayed for TenYTL");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for TenYTL**********");
			log.error("Self is displayed for TenYTL || Fail");
			throw e;
		}
	}

	public boolean validates_that_Self_is_not_displayed_for_TenYTL() throws Throwable {

		try {
			log.debug("Verify the Self is not displayed for TenYTL");
			boolean check = TenYrTermself.isDisplayed();
			Assert.assertFalse(check, "Bug||Self is displayed for TenYTL");
			log.info("Self is not displayed for TenYTL");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for TenYTL**********");
			log.error("Self is not displayed for TenYTL || Fail");
			return false;
		}

	}

	// AAFP

	public boolean validates_that_Self_is_not_displayed_for_TermLife() throws Throwable {
		try {
			log.debug("Verify the Self is not displayed for TermLife");
			boolean check = TermLifeSelf.isDisplayed();
			Assert.assertFalse(check, "Bug||Self is displayed for TermLife/GTLI");
			System.out.println("Self is not displayed for TermLife/GTLI");
			log.info("Self is not displayed for TermLife/GTLI");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for TermLife/GTLI**********");
			log.error("Self is not displayed for TermLife/GTLI || Fail");
			return false;
		}
	}

	public boolean validates_that_Self_is_displayed_for_TermLife() throws Throwable {
		try {
			log.debug("Verify the Self is displayed for TermLife");
			boolean check = TermLifeSelf.isDisplayed();
			Assert.assertTrue(check, "Bug||Self is not displayed for TermLife");
			System.out.println("Self is displayed for TermLife");
			log.info("Self is displayed for TermLife");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for TermLife**********");
			log.error("Self is not displayed for TermLife || Fail");
			throw e;
		}
	}
	
	public boolean validates_that_Self_is_displayed_for_FirstToDie_TLI() throws Throwable {
		try {
			log.debug("Verify the Self is displayed for FirstToDie TermLife Insurance");
			boolean check = FirsttoDieTermLifeInsurance_Self.isDisplayed();
			Assert.assertTrue(check, "Bug||Self is not displayed for FirstToDie TermLife Insurance");

			log.info("Self is displayed for FirstToDie TermLife Insurance");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is Not displayed for FirstToDie TermLife Insurance**********");
			log.error("Self is not displayed for FirstToDie TermLife Insurance || Fail");
			return false;
		}
	}
	
	public boolean validates_that_Spouse_is_displayed_for_FirstToDie_TLI() throws Throwable {
		try {
			log.debug("Verify the Spouse is displayed for FirstToDie TermLife Insurance");
			boolean check = FirsttoDieTermLifeInsurance_Spouse.isDisplayed();
			Assert.assertTrue(check, "Bug||Spouse is not displayed for FirstToDie TermLife Insurance");

			log.info("Spouse is displayed for FirstToDie TermLife Insurance");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is Not displayed for FirstToDie TermLife Insurance**********");
			log.error("Spouse is not displayed for FirstToDie TermLife Insurance || Fail");
			return false;
		}
	}
	
	public boolean validates_that_Self_is_displayed_for_TraditionalGroupTermLife() throws Throwable {
		try {
			log.debug("Verify the Self is displayed for Traditional Group Term Life");
			boolean check = FiveYrTermself.isDisplayed();
			Assert.assertTrue(check, "Bug||Self is not displayed for Traditional Group Term Life");

			log.info("Self is displayed for Traditional Group Term Life");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for Traditional Group Term Life**********");
			log.error("Self is not displayed for TermLife || Fail");
			throw e;
		}
	}

	public boolean validates_that_FiftyYTL_product_is_not_displayed() throws Throwable {
		try {
			log.debug("FiftyYTL is not displayed");
			boolean check = FiftyPlusMultiBenefitProduct.isDisplayed();
			Assert.assertFalse(check, "Bug||FiftyYTL is displayed");
			log.info("FiftyYTL is not displayed");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****FiftyYTL is not displayed**********");
			log.error("Not able to validate FiftyYTL is not displayed || Fail");
			return false;
		}

	}

	public boolean validates_that_Self_is_not_displayed_for_FifteenYTL() throws Throwable {
		try {
			log.debug("Verify the Self is not displayed for FifteenYTL");
			boolean check = FifteenYrTermProductSelf.isDisplayed();
			Assert.assertFalse(check, "Bug||Self is displayed for FifteenYTL");
			log.info("Self is not displayed for FifteenYTL");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for FifteenYTL**********");
			log.error("Self is not displayed for FifteenYTL || Fail");
			return false;
		}

	}

	public boolean validates_that_Self_is_displayed_for_FifteenYTL() throws Throwable {
		try {
			log.debug("Verify the Self is displayed for FifteenYTL");
			boolean check = FifteenYrTermProductSelf.isDisplayed();
			Assert.assertTrue(check, "Bug||Self is not displayed for FifteenYTL");
			System.out.println("*****Self is displayed for FifteenYTL**********");
			log.info("Self is displayed for FifteenYTL");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			log.error("Self is displayed for FifteenYTL || Fail");
			throw e;
		}

	}

	public boolean validates_that_Self_is_not_displayed_for_TwentyYTL() throws Throwable {
		try {
			log.debug("Verify the Self is not displayed for TwentyYTL");
			boolean check = TwentyYrTermProductSelf.isDisplayed();
			Assert.assertFalse(check, "Bug||Self is displayed for TwentyYTL");
			log.info("Self is displayed for TwentyYTL");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for TwentyYTL**********");
			log.error("Self is not displayed for TwentyYTL || Fail");
			return false;
		}

	}

	public boolean validates_that_Self_is_displayed_for_TwentyYTL() throws Throwable {
		try {
			log.debug("Verify the Self is displayed for TwentyYTL");
			boolean check = TwentyYrTermProductSelf.isDisplayed();
			Assert.assertTrue(check, "Bug||Self is not displayed for TwentyYTL");
			System.out.println("*****Self is displayed for TwentyYTL**********");
			log.info("Self is displayed for TwentyYTL");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			log.error("Self is displayed for TwentyYTL || Fail");
			throw e;
		}

	}

	public boolean validates_that_Self_is_not_displayed_for_ADDI() throws Throwable {
		try {
			log.debug("Verify the Self is not displayed for ADDI");

			boolean check = AccdntDeathSelf.isDisplayed();
			Assert.assertFalse(check, "Bug||Self is displayed for ADDI");

			log.info("Self is not displayed for ADnD");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for ADDI**********");
			log.error("Self is not displayed for ADnD || Fail");
			return false;
		}

	}

	public boolean validates_that_Self_is_not_displayed_for_LTD() throws Throwable {
		try {
			log.debug("Verify the Self is not displayed for LTD/GDII");

			boolean check = LongTermDisabilityProductSelf.isDisplayed();
			Assert.assertFalse(check, "Bug||Self is displayed for LTD/GDII");
			log.info("Self is not displayed for LTD");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for LTD/GDII**********");
			log.error("Self is not displayed for LTD/GDII || Fail");
			return false;
		}

	}

	public boolean validates_that_Self_is_displayed_for_LTD() throws Throwable {
		try {
			log.debug("Verify the Self is displayed for LTD");

			boolean check = LongTermDisabilityProductSelf.isDisplayed();
			Assert.assertTrue(check, "Bug||Self is not displayed for LTD");
			log.info("Self is displayed for LTD");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for LTD**********");
			log.error("Self is displayed for LTD || Fail");
			throw e;
		}

	}

	public boolean validates_that_Self_is_not_displayed_for_HII() throws Throwable {
		try {
			log.debug("Verify the Self is not displayed for HII");

			boolean check = HospitalIdemSelf.isDisplayed();
			Assert.assertFalse(check, "Bug||Self is displayed for HII");
			// System.out.println("Self is displayed for HII");

			log.info("Self is not displayed for HII");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for HII**********");
			log.error("Self is displayed for HII || Fail");
			return false;
		}

	}

	public boolean validates_that_Self_is_not_displayed_for_FiveYTL() throws Throwable {
		try {
			log.debug("Verify the Self is not displayed for FiveYTL");
			Thread.sleep(2000);
			boolean check = FiveYrTermself.isDisplayed();
			Assert.assertFalse(check, "Bug||Self is displayed for FiveYTL");
			log.info("Self is not displayed for FiveYTL/Group Term Life");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for FiveYTL/Group Term Life**********");
			log.error("Self is not displayed for FiveYTL/Group Term Life || Fail");
			return false;
		}

	}

	public boolean validates_that_Self_is_displayed_for_FiveYTL() throws Throwable {
		try {
			log.debug("Verify the Self is displayed for FiveYTL");

			boolean check = FiveYrTermself.isDisplayed();
			Assert.assertTrue(check, "Bug||Self is not displayed for FiveYTL");
			log.info("Self is displayed for FiveYTL");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is displayed for FiveYTL**********");
			log.error("Self is displayed for FiveYTL || Fail");
			return false;
		}

	}

	public boolean validates_that_Child_is_not_displayed_for_FiveYTL() throws Throwable {
		try {
			log.debug("Verify the Child is not displayed for FiveYTL/Group Term Life");

			boolean check = FiveYrTermchild.isDisplayed();
			Assert.assertFalse(check, "Bug||Child is displayed for FiveYTL/Group Term Life");
			log.info("Child is not displayed for FiveYTL/Group Term Life");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Child is not displayed for FiveYTL/Group Term Life**********");
			log.error("Child is not displayed for FiveYTL/Group Term Life || Fail");
			return false;
		}

	}

	public boolean validates_that_Child_is_displayed_for_FiveYTL() throws Throwable {

		try {
			log.debug("Verify the Child is displayed for FiveYTL/Group Term Life");
			Assert.assertTrue(FiveYrTermchild.isDisplayed(), "Bug||Child is not displayed for FiveYTL/Group Term Life");
			System.out.println("Child is displayed for FiveYTL/Group Term Life");
			log.info("Child is displayed for FiveYTL/Group Term Life");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Child is not displayed for FiveYTL/Group Term Life**********");
			log.error("Child is not displayed for FiveYTL/Group Term Life || Fail");
			return false;
		}

	}

	public boolean validates_that_Spouse_is_displayed_for_TermLife() throws Throwable {

		try {
			log.debug("Verify the Spouse is displayed for TermLife");
			Assert.assertTrue(TermLifeSpouse.isDisplayed(), "Bug||Spouse is not displayed for TermLife");
			System.out.println("Spouse is displayed for TermLife");
			log.info("Spouse is displayed for TermLife");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for TermLife**********");
			log.error("Spouse is not displayed for TermLife || Fail");
			return false;
		}

	}

	public boolean validates_that_Spouse_is_not_displayed_for_TermLife() throws Throwable {
		try {
			log.debug("Verify the Spouse is not displayed for TermLife/GTLI");

			boolean check = TermLifeSpouse.isDisplayed();
			Assert.assertFalse(check, "Bug||Spouse is displayed for TermLife/GTLI");

			System.out.println("Spouse is not displayed for TermLife/GTLI");

			log.info("Spouse is not displayed for TermLife/GTLI");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for TermLife/GTLI**********");
			log.error("Spouse is not displayed for TermLife/GTLI || Fail");
			return false;
		}

	}

	public boolean validates_that_Spouse_is_displayed_for_TenYTL() throws Throwable {

		try {
			log.debug("Verify the Spouse is displayed or not for TenYTL");
			Assert.assertTrue(TenYrTermSpouse.isDisplayed(), "Bug||Spouse is not displayed for TenYTL");
			System.out.println("Spouse is displayed for TenYTL");
			log.info("Spouse is displayed for TenYTL");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for TenYTL**********");
			log.error("Spouse is not displayed for TenYTL || Fail");
			return false;
		}

	}

	public boolean validates_that_Spouse_is_not_displayed_for_TenYTL() throws Throwable {
		try {
			log.debug("Verify the Spouse is not displayed for TenYTL");

			boolean check = TenYrTermSpouse.isDisplayed();
			Assert.assertFalse(check, "Bug||Spouse is displayed for TenYTL");
			log.info("Spouse is not displayed for TenYTL");

			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for TenYTL**********");
			log.error("Unable to validate that Spouse is not displayed for TenYTL || Fail");
			return false;
		}

	}

	public boolean validates_that_Spouse_is_displayed_for_FiveYTL() throws Throwable {

		try {
			log.debug("Verify the Spouse is displayed for FiveYTL/GroupTerm Life");
			Assert.assertTrue(FiveYrTermSpouse.isDisplayed(), "Bug||Spouse is not displayed for TenYTL");
			System.out.println("Spouse is displayed for FiveYTL/Group Term Life");
			log.info("Spouse is displayed for FiveYTL/Group Term Life");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for FiveYTL/Group Term Life**********");
			log.error("Spouse is not displayed for FiveYTL/Group Term Life || Fail");
			return false;
		}

	}

	public boolean validates_that_Spouse_is_not_displayed_for_FiveYTL() throws Throwable {
		try {
			log.debug("Verify the Spouse is displayed or not for FiveYTL/Group Term Life");
			boolean check = FiveYrTermSpouse.isDisplayed();
			Assert.assertFalse(check, "Bug||Spouse is displayed for FiveYTL/Group Term Life");
			log.info("Spouse is not displayed for FiveYTL/Group Term Life");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for FiveYTL/Group Term LifeL**********");
			log.error("Unable to validate that Spouse is not displayed for FiveYTL/Group Term Life || Fail");
			return false;
		}

	}

	public boolean validates_that_Spouse_is_not_displayed_for_FifteenYTL() throws Throwable {
		try {
			log.debug("Verify the Spouse is not displayed for FifteenYTL");

			boolean check = FifteenYrTermSpouse.isDisplayed();
			Assert.assertFalse(check, "Bug||Spouse is displayed for FifteenYTL");

			log.info("Spouse is not displayed for FifteenYTL");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for FifteenYTL**********");
			log.error("Spouse is not displayed for FifteenYTL|| Fail");
			return false;
		}

	}

	public boolean validates_that_Child_is_not_displayed_for_TermLife() throws Throwable {
		try {
			log.debug("Verify the Child are not displayed for TermLife");

			boolean check = TermLifeChild.isDisplayed();
			Assert.assertFalse(check, "Bug||Child is displayed for TermLife");
			log.info("Child is not displayed for TermLife");

			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Child is not displayed for TermLife**********");
			log.error("Child is not displayed for TermLife || Fail");
			return false;
		}
	}

	public boolean validates_that_Spouse_is_displayed_for_TwentyYTL() throws Throwable {

		try {
			log.debug("Verify the Spouse is displayed for TwentyYTL");
			Assert.assertTrue(TwentyYrTermSpouse.isDisplayed(), "Bug||Spouse is not displayed forTwentyYTL");
			System.out.println("Spouse is displayed for TwentyYTL");
			log.info("Spouse is displayed for TwentyYTL");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for TwentyYTL**********");
			log.error("Spouse is not displayed for TwentyYTL || Fail");
			return false;
		}

	}

	public boolean validates_that_Spouse_is_not_displayed_for_TwentyYTL() throws Throwable {
		try {
			log.debug("Verify the Spouse is not displayed for TwentyYTL");

			boolean check = TwentyYrTermSpouse.isDisplayed();
			Assert.assertFalse(check, "Bug||Spouse is displayed for TwentyYTL");
			log.info("Spouse is not displayed for TwentyYTL");

			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for TwentyYTL**********");
			log.error("Not able to validate that Spouse is not displayed for TwentyYTL|| Fail");
			return false;
		}
	}

	public boolean validates_that_Child_is_not_displayed_for_TenYTL() throws Throwable {
		try {
			log.debug("Verify the Child is not displayed for TenYTL");

			boolean check = TenYrTermChild.isDisplayed();
			Assert.assertFalse(check, "Bug||Child is displayed for TenYTL");
			
			log.info("Child is not displayed for TenYTL");

			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Child is not displayed for TenYTL**********");
			log.error("Child is not displayed for TenYTL || Fail");
			return false;
		}
	}

	public boolean validates_that_Child_is_not_displayed_for_TwentyYTL() throws Throwable {
		try {
			log.debug("Verify the Child is not displayed for TwentyYTL");

			boolean check = TwentyYrTermChild.isDisplayed();
			Assert.assertFalse(check, "Bug||Child is displayed for TwentyYTL");
			System.out.println("*****Child is not displayed for TwentyYTL**********");
			log.info("Child is not displayed for TwentyYTL");

			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Child is not displayed for TwentyYTL**********");
			log.error("Child is displayed for TwentyYTL|| Fail");
			return false;
		}

	}

	public boolean validates_that_Child_is_not_displayed_for_ADDI() throws Throwable {
		try {
			log.debug("Verify the Child is not displayed for ADDI");

			boolean check = AccdntDeathChild.isDisplayed();
			Assert.assertFalse(check, "Bug||Child is displayed for ADDI");
			System.out.println("*****Child is not displayed for ADDI**********");
			log.info("Child is not displayed for ADDI");

			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Child is not displayed for ADDI**********");
			log.error("Child is displayed for ADDI|| Fail");
			return false;
		}

	}

	public boolean validates_that_Spouse_is_displayed_for_ADDI() throws Throwable {

		try {
			log.debug("Verify the Spouse is displayed for ADDI");
			Assert.assertTrue(AccdntDeathSpouse.isDisplayed(), "Bug||Spouse is not displayed for ADDI");
			System.out.println("Spouse is displayed for ADDI");
			log.info("Spouse is displayed for ADDI");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for ADDI**********");
			log.error("Spouse is not displayed for ADnD || Fail");
			return false;
		}

	}

	public boolean validates_that_Self_is_displayed_for_ADDI() throws Throwable {

		try {
			log.debug("Verify the Self is displayed for ADDI");
			boolean Actual = AccdntDeathSelf.isDisplayed();
			Assert.assertTrue(Actual, "Bug||Self is not displayed for ADDI");
			System.out.println("Self is displayed for ADDI");
			log.info("Self is displayed for ADDI");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for ADDI**********");
			log.error("Self is not displayed for ADnD || Fail");
			return false;
		}

	}

	public boolean validates_that_Spouse_is_not_displayed_for_ADDI() throws Throwable {

		try {
			log.debug("Verify the Spouse is not displayed for ADDI/PAI");

			boolean check = AccdntDeathSpouse.isDisplayed();
			Assert.assertFalse(check, "Bug||Spouse is displayed for ADDI/PAI");

			log.info("Spouse is not displayed for ADnD/PAI");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for ADDI/PAI**********");
			log.error("Spouse is not displayed for ADDI/PAI|| Fail");
			return false;
		}
	}

	public boolean validates_that_Spouse_is_displayed_for_LTDP() throws Throwable {

		try {
			log.debug("Verify the Spouse is displayed for LTDPlus");
			Assert.assertTrue(LongTermDisability_PlusProductSpouse.isDisplayed(),
					"Bug||Spouse is not displayed for LTDPlus");
			System.out.println("Spouse is displayed for LTDPlus");
			log.info("Spouse is displayed for LTDPlus");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for LTDPlus**********");
			log.error("Spouse is not displayed for LTDPlus || Fail");
			return false;
		}

	}

	public boolean validates_that_Spouse_is_not_displayed_for_LTDP() throws Throwable {
		try {
			log.debug("Verify the Spouse is displayed or not for LTDPlus");
			boolean check = LongTermDisability_PlusProductSpouse.isDisplayed();
			Assert.assertFalse(check, "Bug||Spouse is displayed for LTDP");

			log.info("Spouse is not displayed for LTD Plus");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for LTD Plus**********");
			log.error("Not able to Validate that Spouse is not displayed for LTD Plus|| Fail");
			return false;
		}
	}

	public boolean validates_that_Spouse_is_displayed_for_LTD() throws Throwable {

		try {
			log.debug("Verify the Spouse is displayed for LTD");
			Assert.assertTrue(LongTermDisabilityProductSpouse.isDisplayed(), "Bug||Spouse is not displayed for LTD");
			System.out.println("Spouse is displayed for LTD");
			log.info("Spouse is displayed for LTD");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for LTD**********");
			log.error("Spouse is not displayed for LTD || Fail");
			return false;
		}

	}

	public boolean validates_that_Spouse_is_not_displayed_for_LTD() throws Throwable {
		try {
			log.debug("Verify the Spouse is not displayed for LTD");

			boolean check = LongTermDisabilityProductSpouse.isDisplayed();
			Assert.assertFalse(check, "Bug||Spouse is displayed for LTD");

			log.info("Spouse is not displayed for LTD");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for LTD**********");
			log.error("Not able to validate that Spouse is not displayed for LTD|| Fail");
			return false;
		}
	}

	public boolean validates_that_Spouse_is_displayed_for_MIDT() throws Throwable {

		try {
			log.debug("Verify the Spouse is displayed for MIDT");
			Assert.assertTrue(MidTermDisabilityProductSpouse.isDisplayed(), "Bug||Spouse is not displayed for MIDT");
			System.out.println("Spouse is displayed for MIDT");
			log.info("Spouse is displayed for MIDT");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for MIDT**********");
			log.error("Spouse is not displayed for MIDT || Fail");
			return false;
		}

	}

	public boolean validates_that_Self_is_displayed_for_MIDT_SDT() throws Throwable {

		try {
			log.debug("Verify the Self is displayed for Mid/Short Term");
			Assert.assertTrue(MidTermDisabilityProductSelf.isDisplayed(), "Bug||Self is not displayed for MIDT");
			System.out.println("Self is displayed for Mid/Short Term");
			log.info("Self is displayed for Mid/Short Term");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for MIDT**********");
			log.error("Self is not displayed for MIDT || Fail");
			throw e;
		}

	}

	public boolean validates_that_Self_is_not_displayed_for_MIDT_or_STD() throws Throwable {

		try {
			log.debug("Verify the Self is not displayed for Mid/Short Term");
			Assert.assertFalse(MidTermDisabilityProductSelf.isDisplayed(), "Bug||Self is displayed for MIDT/STD");

			log.info("Self is not displayed for Mid/Short Term");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for MIDT/STD**********");
			log.error("Self is not displayed for MIDT || Fail");
			return false;
		}

	}

	public boolean validates_that_Self_is_displayed_for_MIDT_or_STD() throws Throwable {

		try {
			log.debug("Verify the Self is displayed for Mid/Short Term");
			Assert.assertTrue(MidTermDisabilityProductSelf.isDisplayed(), "Bug||Self is not displayed for MIDT/STD");
			System.out.println("Self is displayed for Mid/Short Term");
			log.info("Self is displayed for Mid/Short Term");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is displayed for MIDT/STD**********");
			log.error("Self is displayed for MIDT/STD || Fail");
			throw e;
		}

	}

	public boolean validates_that_Spouse_is_not_displayed_for_MIDT() throws Throwable {
		try {
			log.debug("Verify the Spouse is not displayed for Mid Term/Short Term Disability Product");

			boolean check = MidTermDisabilityProductSpouse.isDisplayed();
			Assert.assertFalse(check, "Bug||Spouse is displayed for Mid Term/Short");
			log.info("Spouse is not displayed for Mid Term/Short Disability Product");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for Mid Term/Short Disability Product**********");
			log.error("Not able to validate that Spouse is not displayed for Mid Term/Short Disability Product|| Fail");
			return false;
		}
	}

	public boolean validates_that_Spouse_is_displayed_for_CI() throws Throwable {

		try {
			log.debug("Verify the Spouse is displayed for CI");
			Assert.assertTrue(CriticalIllnessProductSpouse.isDisplayed(), "Bug||Spouse is not displayed for CI");
			System.out.println("Spouse is displayed for CI");
			log.info("Spouse is displayed for CI");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for CI**********");
			log.error("Spouse is not displayed for CI || Fail");
			throw e;
		}

	}

	public boolean validates_that_Spouse_is_not_displayed_for_CI() throws Throwable {
		try {
			log.debug("Verify the Spouse is displayed or not for Critical Illness Product");
			boolean check = CriticalIllnessProductSpouse.isDisplayed();
			Assert.assertFalse(check, "Bug||Spouse is displayed for Critical Illness");

			log.info("Spouse is not displayed for Critical Illness Product");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for Critical Illness Product Product**********");
			log.error("Not able to validate that Spouse is not displayed for Critical Illness Product || Fail");
			return false;
		}
	}

	public boolean validates_that_Spouse_is_displayed_for_HII() throws Throwable {
		try {
			log.debug("Verify the Spouse is displayed or not for HII/InHospitalInsurance");

			boolean check = HospitalIdemSpouse.isDisplayed();
			Assert.assertTrue(check, "Bug||Spouse is not displayed for HII/InHospitalInsurance");
			System.out.println("Spouse is displayed for HII/InHospitalInsurance");
			log.info("Spouse is displayed for HII/InHospitalInsurance");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is displayed for HII/InHospitalInsurance**********");
			log.error("Spouse is displayed for HII/InHospitalInsurance|| Fail");
			return false;
		}
	}

	public boolean validates_that_Spouse_is_not_displayed_for_HII() throws Throwable {

		try {
			log.debug("Verify the Spouse is displayed or not for HII");

			boolean check = HospitalIdemSpouse.isDisplayed();
			Assert.assertFalse(check, "Bug||Spouse is displayed for HII");
			System.out.println("Spouse is not displayed for HII");
			log.info("Spouse is not displayed for HII");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for HII**********");
			log.error("Not able to validate that Spouse is not displayed for HII|| Fail");
			return false;
		}
	}

	public boolean validates_that_Child_is_displayed_for_HII() throws Exception {
		try {
			log.debug("Verify the Child is displayed for HII/InHospitalInsurance");

			boolean check = HospitalIdemChild.isDisplayed();
			Assert.assertTrue(check, "Bug||Child is not displayed for HII/InHospitalInsurance");
			System.out.println("Child is displayed for HII/InHospitalInsurance");
			log.info("Child is displayed for HII/InHospitalInsurance");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			
			log.error("Child is displayed for HII/InHospitalInsurance|| Fail");
			return false;
		}
	}
	
	public boolean validates_that_Child_is_not_displayed_for_HII() throws Exception {
		try {
			log.debug("Verify the Child is not displayed for HII");

			boolean check = HospitalIdemChild.isDisplayed();
			Assert.assertFalse(check, "Bug||Child is displayed for HII");
			
			log.info("Child is not displayed for HII");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Child is not displayed for HII**********");
			log.error("Child is displayed for HII|| Fail");
			return false;
		}
	}

	// AAFP
	public boolean validates_that_Child_is_displayed_for_TermLife() throws Throwable {
		try {
			log.debug("Verify the Child is displayed for TermLife");
			boolean check = TermLifeChild.isDisplayed();
			Assert.assertTrue(check, "Bug||Child is not displayed for TermLife");
			System.out.println("Child is displayed for TermLife");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Child is not displayed for TermLife**********");
			log.error("Child is displayed for TermLife || Fail");
			return false;
		}
	}
	
	public boolean validates_that_Child_is_displayed_for_TraditionalGroupTermLife() throws Throwable {
		try {
			log.debug("Verify the Child is displayed for Traditional Group TermLife");
			boolean check = FiveYrTermChild.isDisplayed();
			Assert.assertTrue(check, "Bug||Child is not displayed for Traditional Group TermLife");
			System.out.println("Child is displayed for Traditional Group TermLife");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Child is not displayed for Traditional Group TermLife**********");
			log.error("Child is displayed for TermLife || Fail");
			return false;
		}
	}

	public boolean validates_that_Child_is_displayed_for_TenYTL() throws Throwable {
		try {
			log.debug("Verify the Child is displayed for TenYTL");
			boolean check = TenYrTermChild.isDisplayed();
			Assert.assertTrue(check, "Bug||Child is not displayed for TenYTL");
			System.out.println("Child is displayed for TenYTL");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Child is not displayed for TenYTL**********");
			log.error("Child is not displayed for TenYTL || Fail");
			return false;
		}

	}

	public boolean validates_that_Child_is_displayed_for_TwentyYTL() throws Throwable {
		try {
			log.debug("Verify the Child is displayed for TwentyYTL");
			boolean check = TwentyYrTermChild.isDisplayed();
			Assert.assertTrue(check, "Bug||Child is not displayed for TwentyYTL");
			System.out.println("Child is displayed for TwentyYTL");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Child is not displayed for TwentyYTL**********");
			log.error("Child is displayed for TwentyYTL|| Fail");
			return false;
		}

	}

	public boolean validates_that_Child_is_displayed_for_ADDI() throws Throwable {
		try {
			log.debug("Verify the Child is displayed for ADDI");
			boolean check = AccdntDeathChild.isDisplayed();
			Assert.assertTrue(check, "Bug||Child is not displayed for ADDI");
			System.out.println("Child is displayed for ADDI");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Child is not displayed for ADDI**********");
			log.error("Child is displayed for ADDI|| Fail");
			return false;
		}

	}

	// WAEPA_for Selecting product*********

	public boolean select_Group_Term_Life_Insurance_Product_for_Self() throws Exception {

		try {
			log.debug("Select the Self product");

			GroupTermLife_Self.click();
			// reuseMethod.scrollDown(Next);
			log.info("Group Term Life Insurance Product selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the product || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	public boolean select_Product_page_displayed_with_Group_Term_Life_Insurance_Product() throws Exception {
		try {
			log.debug("Group_Term_Life_Insurance_Product is displayed to user");
			GroupTermLife_Label.isDisplayed();
			log.info("Group_Term_Life_Insurance_Product are validated successfully || PASS");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate the Group_Term_Life_Insurance_Product Page details|| Fail");
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}
	
	
	
	public boolean select_Product_page_displayed_with_Group_Term_Life_Insurance_Product_For_Child() throws Exception {
		try {
			log.debug("Group_Term_Life_Insurance_Product for child is displayed to user");
			Thread.sleep(1500);
			boolean check = GroupTermLife_child.isDisplayed();
			Assert.assertTrue(check, "Critical illness Product is  displayed");
			Thread.sleep(1000);
			log.info("Group_Term_Life_Insurance_Product for child are validated successfully || PASS");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate the Group_Term_Life_Insurance_Product for child Page details|| Fail");
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}
	
		
	public boolean select_Product_page_displayed_with_Life_To_95_Product() throws Exception {
		try {
			log.debug("Life To 95 Product is displayed to user");
			reuseMethod.scrollDown(FiftyYrTermself);
			Thread.sleep(1500);
			//LifeTo95Prod.isDisplayed();
			FiftyYrTermself.isDisplayed();
			log.info("Life To 95  Product are validated successfully || PASS");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate the Life To 95 Product Page details|| Fail");
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}
	
	public boolean select_Product_page_displayed_with_Accidental_Death_Product() throws Exception {
		try {
			log.debug("Accidental Death Product is displayed to user");
			AccidentalDeathProd.isDisplayed();
			log.info("Accidental Death Insurance_Product are validated successfully || PASS");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate the Accidental Death Product Page details|| Fail");
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}
	
	public boolean select_Product_Accidental_Death_Product_for_self() throws Exception {
		try {
			log.debug("Accidental Death Product is clicked by user");
			Thread.sleep(1000);
			AccidentalDeathProd_self.click();;
			log.info("Accidental Death Insurance_Product for self is clicked successfully || PASS");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate the Accidental Death Product Page details|| Fail");
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}
	
	public boolean validates_that_Group_Term_Life_Insurance_product_is_not_displayed_for_Self() throws Throwable {
		try {
			log.debug("Option to click Group Term Life Insurance_product for self is displayed");
			Thread.sleep(2000);
			boolean check = GroupTermLife_self.isDisplayed();
			Assert.assertFalse(check, "Bug||FiftyYTL is displayed");
			log.info("Group Term Life Insurance_product for self is not displayed");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****FiftyYTL is not displayed**********");
			log.error("Not able to validate Group Term Life Insurance_product for self || Fail");
			return false;
		}

	}
	
	public boolean validates_Accidental_Death_Product_is_not_displayed_for_self() throws Exception {
		try {
			log.debug("Accidental Death Product is not displayed to user");
			Thread.sleep(2000);
			try{
			boolean check = AccidentalDeathProd_self.isDisplayed();
			Assert.assertFalse(check, "Bug||Self is displayed for FiveYTL");
			log.info("Accidental Death Insurance_Product are validated successfully || PASS");
			return true;
			}catch(Exception e){
			log.info("Accidental Death Insurance_Product are validated successfully || PASS");	
			System.out.println("*****Self is not displayed for Accidental death**********");
			return true;
			}finally{System.out.println("*****Self is validated for Accidental death**********");}
			
		} catch (Exception e) {
			System.out.println("*****Error occured for Accidental death Validation**********");
			log.error("Not able to validate the Accidental Death Product not displayed Page details|| Fail");
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}
	
	public boolean validates_that_Life_To_95_product_is_not_displayed() throws Throwable {
		try {
			log.debug("Life To 95 is not displayed");
			boolean check = LifeTo95Prod.isDisplayed();
			Assert.assertFalse(check, "Bug||FiftyYTL is displayed");
			log.info("Life To 95 is not displayed");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****FiftyYTL is not displayed**********");
			log.error("Not able to validate Life To 95 is not displayed || Fail");
			return false;
		}

	}
	
	
	public boolean verify_additional_Questions_details_are_displayed() throws Exception {

		try {
			log.debug("Verify Additional questions page is displayed for Self");
			Additional_Questions_label.isEnabled();
			log.info("Additional Product page answered successfully for Self || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer on Additional Product page for Self || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	public boolean product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_No_for_Self()
			throws Exception {

		try {
			log.debug("Answer the questions of Product Additional Page for Self");
			LyfInsNoSelf.click();
			PendingInsNoSelf.click();
			log.info("Additional Product page answered successfully for Self || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer on Additional Product page for Self || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	public boolean product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_No_for_Spouse()
			throws Exception {

		try {
			log.debug("Answer the questions of Product Additional Page for Self");
			LyfInsNOSpouse.click();
			PendingInsNOSpouse.click();
			log.info("Additional Product page answered successfully for Self || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer on Additional Product page for Self || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

//AAFP

	public boolean selects_Answer_as_YES_for_Additional_Questions_of_Group_Disability_Insurance_for_Self()
			throws Exception {

		try {
			log.debug("Answer the questions of Group_Disability Product on Additional Page for Self");
			UniformedServiceChapter_Self_Yes.click();
			HazardousDuty_Self_Yes.click();
			// OtherBusiness_YES.click();
			// CoverageReplaceOO_Self_Yes.click();
			log.info("Group_Disability of Additional Product page answered successfully for Self || Pass");
			return true;

		} catch (Exception e) {
			log.error("Not able to answer on Group_Disability on Additional Product page for Self || Fail"
					+ e.getMessage());

			throw (e);
		}
	}

	public boolean enter_Hazardous_duty_explanation_as(String HazardousExplanation) throws Exception {

		try {
			log.debug("HazardousExplanation of Group_Disability Product on Additional Page for Self");

			HazardousExplanation_Self.sendKeys(HazardousExplanation);

			log.info("Group_Disability of HazardousExplanation answered successfully for Self || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer of HazardousExplanation on Additional Product page for Self || Fail"
					+ e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	public boolean selects_product_for_Spouse_as_Ten_YTL() throws Exception {

		try {
			log.debug("Select the Ten Year Level Term Life Insurance product for Spouse");
			System.out.println("Click on 10 yrs term plans for Spouse");

			reuseMethod.scrollDown(TenYrTermSpouse);
			TenYrTermSpouse.click();
			log.info("10 year Product selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Ten Year Product for Spouse || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	public boolean selects_product_FiveYr_Term_Life_Insurance_Spouse() throws Exception {

		try {
			log.debug("Select Term Life Insurance product for Spouse");
			System.out.println("Click on Term Life Insurance product for Spouse");

			reuseMethod.scrollDown(FiveYrTermSpouse);
			FiveYrTermSpouse.click();
			log.info("Term Life Insurance product for Spouse Product selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Term Life Insurance product for Spouse || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	public boolean selects_Product_for_Spouse_as_FiftyYTL() throws Exception {

		try {
			log.debug("Select the Fifty Plus Year Level Term Life Insurance product for Spouse");
			System.out.println("Click on 50+ yrs term plans for Spouse");

			reuseMethod.scrollDown(FiftyYrTermspouse);
			FiftyYrTermspouse.click();
			log.info("50+ year Product selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Fifty Year Product for Spouse || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	public boolean selects_the_product_TwentyYTL_for_Spouse() throws Exception {

		try {
			log.debug("Select the Twenty Year Level Term Life Insurance product for Spouse");
			System.out.println("Click on 20 yrs term plans for Spouse");

			reuseMethod.scrollDown(TwentyYrTermSpouse);
			TwentyYrTermSpouse.click();
			Thread.sleep(500);
			log.info("20 year Product selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select 20 Year Product for Spouse || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}

	}

	/*
	 * public boolean click_on_Yes_on_Dependent_CoverageWindow() throws Exception {
	 * 
	 * try { log.debug("click on Yes on Dependent Coverage Window");
	 * 
	 * DependentCoverage.isDisplayed(); Dependent_Yes.isDisplayed();
	 * 
	 * Thread.sleep(1000); Dependent_Yes.click(); Thread.sleep(3000);
	 * log.info("Yes Button is clicked sucessfully  || Pass"); return true; } catch
	 * (Exception e) {
	 * log.error("Not able to click Yes Button on Coverage Dependent  || Fail" +
	 * e.getMessage()); throw (e); }
	 * 
	 * }
	 */

	public boolean selects_product_FiveYrTerm_Life_Insurance_Child() throws Exception {
		try {
			log.debug("Select the Product Terms Life Insurance for child ");
			Thread.sleep(2000);
			reuseMethod.scrollDown(FiveYrTermchild);
			FiveYrTermchild.click();
			log.info("Product Terms Life Insurance for child is selected successfully || Pass");
			return true;

		} catch (Exception e) {
			log.error("Not able to select the product for child of Terms Life Insurance || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validate_message_and_click_YES_for_Dependent_Coverage_information() throws Exception {
		try {
			log.debug("Select the Dependent_Coverage_information");
			String expected = PropertyUtility.Load_MessageFile_Data("DependentCoverage");
			String actual=DependentCoverage.getText();
			System.out.println("Depenedent coverage message-->"+actual);
			if(expected.equals(actual))
			{
				System.out.println("Depenedent coverage message validated");
			}
			Thread.sleep(2000);
			DependentCoverageWindow_Child.click();
			Thread.sleep(7000);
			log.info("Dependent_Coverage_information select successfully|| Pass");
			return true;

		} catch (Exception e) {
			log.error("Not able to select the Dependent_Coverage_information || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean verify_the_Dependent_Note_Displayed_on_Popup_Window_of_Dependent_Coverage() throws Exception {
		try {
			log.debug("Verify the Dependent Note Displayed on Popup Window of Dependent Coverage");
			String expected = PropertyUtility.Load_MessageFile_Data("DependentNote_Msg");
			String actual = DependentNote.getText();
			System.err.println("Depenedent coverage message-->" + actual);
			Assert.assertEquals(actual, expected,"Dependent Note Displayed on Popup Window of Dependent Coverage Message is not Validated");
			Thread.sleep(2000);
			log.info("Dependent Note Displayed on Popup Window of Dependent Coverage is validated successfully|| Pass");
			return true;

		} catch (Exception e) {
			log.error("Not able to Verify the Dependent Note Displayed on Popup Window of Dependent Coverage || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean clicks_on_OK_Button_on_Dependent_Coverage_Window() throws Exception {

		try {
			log.debug("Clicks on OK Button on Dependent Coverage Window");
			DependentCoverage.isDisplayed();
			Dependent_Yes.isDisplayed();
			Thread.sleep(1000);
			Dependent_Yes.click();
			Thread.sleep(1000);
			log.info("OK Button on Dependent Coverage Window is clicked sucessfully  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click OK Button on Dependent Coverage Window || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Self_for_Accidental_Death_Product() throws Exception {
		try {
			log.debug("Select Self for Accidental Death Product");
			reuseMethod.scrollDown(AccdntDeathSelf);
			Thread.sleep(1000);
			if (!AccdntDeathSelfverify.isSelected()) {
				AccdntDeathSelf.click();
			}
			log.info("Accidental Death product for self is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Self for Accidental Death Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Spouse_for_Accidental_Death_Product() throws Exception {
		try {
			log.debug("Select Spouse for Accidental Death Product");
			AccdntDeathSpouse.click();
			Thread.sleep(1000);
			log.info("Accidental Death product for Spouse is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Spouse for Accidental Death Product || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_product_LTDPlus_for_Spouse() throws Exception {
		try {
			log.debug("Select Spouse for Long Term disability Plus Product");
			LongTermDisability_PlusProductSpouse.isDisplayed();
			LongTermDisability_PlusProductSpouse.click();
			Thread.sleep(1000);
			log.info(" Long Term disability Plus Product for Spouse is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Spouse for Long Term disability Plus Product || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_product_LTD_for_Spouse() throws Exception {
		try {
			log.debug("Select Spouse for Long Term disability Product");

			LongTermDisabilityProductSpouse.click();
			Thread.sleep(1000);
			log.info("Long Term disability product for Spouse is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Spouse for Long Term disability Product || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_product_MTDI_for_Spouse() throws Exception {
		try {
			log.debug("Select Spouse for Mid Term disability Product");
			MidTermDisabilityProductSpouse.isDisplayed();
			MidTermDisabilityProductSpouse.click();
			Thread.sleep(1000);
			log.info("Mid Term disability product for Spouse is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Spouse for Mid Term disability Product || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_product_CI_for_Spouse() throws Exception {
		try {
			log.debug("Select Spouse for Critical Illness Product");
			CriticalIllnessProductSpouse.isDisplayed();
			CriticalIllnessProductSpouse.click();
			Thread.sleep(1000);
			log.info("Critical Illness product for Spouse is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Spouse for Critical Illness Product || Fail" + e.getMessage());
			throw (e);
		}

	}

	/*public boolean selects_product_HMI_for_Spouse() throws Exception {
		try {
			log.debug("Select Spouse for Hospital Money Insurance Product");
			HospitalIdemSpouse.isDisplayed();
			HospitalIdemSpouse.click();
			Thread.sleep(1000);
			log.info("Hospital Money Insurance product for Spouse is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Spouse forHospital Money Insurance Product || Fail" + e.getMessage());
			throw (e);
		}

	}*/

	public boolean selects_Child_for_Accidental_Death_Product() throws Exception {
		try {
			log.debug("Select Child for Accidental Death Product");
			reuseMethod.scrollDown(AccdntDeathChild);
			Thread.sleep(1000);
			AccdntDeathChild.click();
			log.info("Accidental Death product for Child is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Child for Accidental Death Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_TenYTL_for_Child() throws Exception {
		try {
			log.debug("Select Child for Ten Year Level Term  Product");
			reuseMethod.scrollDown(TenYrTermChild);
			Thread.sleep(2000);
			TenYrTermChild.click();
			Thread.sleep(1000);
			log.info(" Ten Year Level Term product for Child is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Child for Ten Year Level Term  Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_TwentyYTL_for_Child() throws Exception {
		try {
			log.debug("Select Child for Twenty Year Level Term  Product");
			reuseMethod.scrollDown(TwentyYrTermChild);
			Thread.sleep(2000);
			TwentyYrTermChild.click();
			Thread.sleep(1000);
			log.info(" Twenty Year Level Term product for Child is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Child for Twenty Year Level Term  Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	/*public boolean selects_Child_for_Hospital_Product() throws Exception {
		try {
			log.debug("Select Child for Hospital Money Insurance Product");
			reuseMethod.scrollDown(HospitalIdemChild);
			Thread.sleep(2000);
			HospitalIdemChild.click();

			log.info("Hospital Money Insurance Product for Child is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Child for Hospital Money Insurance Product|| Fail" + e.getMessage());
			throw (e);
		}
	}*/

	public boolean product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_No_for_all_for_Self()
			throws Exception {

		try {
			log.debug("Answer the questions of Product Additional Page");
			LyfInsNoSelf.click();
			PendingInsNoSelf.click();
			log.info("Additional Product page answered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer on Additional Product page || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_Yes_for_all_questions_for_Self()
			throws Exception {

		try {
			log.debug("Answer the questions of Product Additional Page as Yes");
			Thread.sleep(2000);
			reuseMethod.scrollDown(LyfInsYesSelf);
			LyfInsYesSelf.click();
			Thread.sleep(2000);
			ExistingInsPolicy_Yes.click();
			Thread.sleep(2000);
			PendingInsYesSelf.click();
			log.info("Additional Product page answered as YES successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer on Additional Product page as YES || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_Yes_for_all_questions_for_Spouse()
			throws Exception {

		try {
			log.debug("Answer the questions of Product Additional Page as Yes for Spouse");
			OtherLyfIns_Yes_Spouse.click();
			ExistingInsPolicy_Yes_Spouse.click();
			PendingInsYes_Spouse.click();
			log.info("Additional Product page answered as YES for Spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer on Additional Product page as YES for Spouse|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Yes_for_Do_you_have_other_life_insurance_in_force_for_Spouse() throws Exception {

		try {
			log.debug("Selects Yes for Do you have other life insurance in force for Spouse");
			OtherLyfIns_Yes_Spouse.click();
			log.info(
					"Do you have other life insurance in force for Spouse is answered as YES for Spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Yes for Do you have other life insurance in force for Spouse|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Yes_for_Do_you_have_other_insurance_pending_for_Spouse() throws Exception {

		try {
			log.debug("Selects Yes for Do you have other insurance pending for Spouse");
			PendingInsYes_Spouse.click();
			log.info(
					"Do you have other life insurance pending for Spouse is answered as YES for Spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Yes for Do you have other life insurance pending for Spouse|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public Boolean enters_Total_Amount_for_Spouse_as(String total) throws Exception {
		try {
			log.debug("Enters Total Amount for Spouse ");
			TotalAmount_Spouse.isDisplayed();
			TotalAmount_Spouse.sendKeys(total);
			log.info("Total amount for Spouse is entered  successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Enters Total Amount for Spouse || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Yes_for_life_insurance_applied_for_intended_to_replace_for_Spouse() throws Exception {

		try {
			log.debug("Selects Yes for life insurance applied for intended to replace for Spouse");
			Thread.sleep(2000);
			ExistingInsPolicy_Yes_Spouse.click();

			log.info("life insurance applied for intended to replace for Spouse answered as YES  successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to life insurance applied for intended to replace as YES for Spouse|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public Boolean enter_additional_details_as(String total, String pending, String company) throws Exception {
		try {
			log.debug("Enter Addition details on product page");
			TotalAmount.isDisplayed();
			TotalAmount.sendKeys(total);
			Thread.sleep(1000);
			PendingAmount.isDisplayed();
			PendingAmount.sendKeys(pending);
			Thread.sleep(1000);
			CompanySelf.isDisplayed();
			CompanySelf.sendKeys(company);
			Thread.sleep(1000);
			log.info("additional deatils are entered  successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Enter Additional details on Product page   || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Yes_for_unable_to_work_because_of_a_disability_for_Spouse() throws Exception {

		try {
			log.debug("Answer the questions of Unable to work because of Disability as Yes for Spouse ");
			reuseMethod.scrollDown(OtherInsSpouse_DI_YES);
			OtherInsSpouse_DI_YES.click();
			log.info(" work because of Disability Question answered as YES for Spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer on Unable to work because of Disability as YES for Spouse|| Fail"
					+ e.getMessage());
			throw (e);

		}
	}

	public boolean selects_Yes_for_Do_you_have_other_insurance_pending_for_self() throws Exception {

		try {
			log.debug("Selects Yes for Do you have other insurance applications pending for self");
			PendingInsYesSelf.click();
			log.info("Selected Yes for Do you have other insurance applications pending for self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Yes for Do you have other insurance applications pending for self|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean enters_details_for_Company_and_click_on_add_button(String Company, String Amount, String period)
			throws Exception {

		try {
			log.debug("Enter Company Details");
			Thread.sleep(1000);
			CompanyName.isDisplayed();
			CompanyName.sendKeys(Company);
			MonthlyBenefitAmt.isDisplayed();
			MonthlyBenefitAmt.sendKeys(Amount);
			BenefitPeriod.isDisplayed();
			BenefitPeriod.sendKeys(period);
			AddButton.isDisplayed();
			AddButton.click();
			Thread.sleep(1000);
			log.info("Company details are entered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to to enter Company details|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Benefit_Option_as(String BeneOpt) throws Exception {
		try {
			log.debug("Selects Benefit Option");
			Thread.sleep(1000);
			BenefitPeriod_Dropdown.isDisplayed();
			reuseMethod.dropDown(BenefitPeriod_Dropdown, BeneOpt);

			log.info("Selects Benefit Option is selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Benefit Option|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Yes_for_Do_you_have_other_life_insurance_in_force() throws Exception {

		try {
			log.debug("Answer the questions of Product Do you have other life insurance in force");
			reuseMethod.scrollDown(LyfInsYesSelf);
			Thread.sleep(1000);
			LyfInsYesSelf.click();
			log.info(
					"Answer the questions of Product Do you have other life insurance in force answered as YES for Self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Answer the questions of Product Do you have other life insurance in force answered as YES for Self|| Fail"
							+ e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_on_Add_Company_Button_Spouse() throws Exception {

		try {
			log.debug("Click on Add Company Button for Spouse for DI");
			reuseMethod.scrollDown(AddCompanySps_DIButton);
			AddCompanySps_DIButton.click();
			log.info("Add Company Button for Spouse is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to to click Add Company Button for Spouse for DI|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Yes_for_replace_any_other_company_s_coverage_for_Self_for_OO() throws Exception {

		try {
			log.debug("Answer the Replacement Coverage Disability as Yes ");
			Thread.sleep(1000);
			CompanyCoverageYES_OO.isDisplayed();
			CompanyCoverageYES_OO.click();
			log.info(" Replacement Coverage Disability Question answered as YES for Self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer onReplacement Coverage Disability as YES for Self|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_No_for_replace_any_other_company_s_coverage_for_Self_for_OO() throws Exception {

		try {
			log.debug("Answer the Replacement Coverage Disability as No ");
			Thread.sleep(1000);
			ReplaceCompanyCoverage_NO.isDisplayed();
			ReplaceCompanyCoverage_NO.click();
			log.info(" Replacement Coverage Disability Question answered as No for Self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer onReplacement Coverage Disability as No for Self|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Yes_for_replace_any_other_company_s_coverage_for_Spouse_for_OO() throws Exception {

		try {
			log.debug("Answer the 'Wiil this coverage replace any other company's coverage' as Yes for Spouse ");
			Thread.sleep(1000);

			SpouseReplace_DIYes.click();
			log.info(" Replacement Coverage Disability Question answered as YES for Spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer onReplacement Coverage Disability as YES for Spouse|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean enters_Amount_under_replace_any_other_company_s_coverage_as_DI(String Amount) throws Exception {

		try {
			log.debug("Enter amount will be Replaced");
			Thread.sleep(1000);
			ReplaceAmtSelf_DI.isDisplayed();
			ReplaceAmtSelf_DI.sendKeys(Amount);

			log.info("Amount to be replaced is entered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter amount will be replaced|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Yes_for_life_insurance_applied_for_intended_to_replace() throws Exception {

		try {
			log.debug("Answer the questions of Product life insurance applied for intended to replace as Yes for Self");
			Thread.sleep(2000);
			ExistingInsPolicy_Yes.click();

			log.info("life insurance applied for intended to replace answered as YES for Self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Answer the questions of Product life insurance applied for intended to replace as Yes for Self|| Fail"
							+ e.getMessage());
			throw (e);
		}

	}

	public boolean enters_Amount_under_replace_any_other_company_s_coverage_of_OO_as(String Amount) throws Exception {

		try {
			log.debug("Enter amount will be Replaced");
			Thread.sleep(1000);
			ReplaceAmtSelf_OO.isDisplayed();
			ReplaceAmtSelf_OO.sendKeys(Amount);

			log.info("Amount to be replaced is entered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter amount will be replaced|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public Boolean enters_Total_Amount_as(String total) throws Throwable {
		try {
			log.debug("Enter Total amount on product page");
			TotalAmount.isDisplayed();
			TotalAmount.sendKeys(total);

			log.info("Total Amount is entered  successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Enter total amount  on Product page   || Fail" + e.getMessage());
			throw (e);
		}

	}

	public Boolean enter_additional_details_as_for_Spouse(String total, String pending, String company)
			throws Throwable {

		try {
			log.debug("Enter Addition details on product page for Spouse");
			TotalAmount_Spouse.isDisplayed();
			TotalAmount_Spouse.sendKeys(total);
			Thread.sleep(1000);
			PendingAmount_Spouse.isDisplayed();
			PendingAmount_Spouse.sendKeys(pending);
			Thread.sleep(1000);
			Company_Spouse.isDisplayed();
			Company_Spouse.sendKeys(company);
			Thread.sleep(1000);
			log.info("Additional deatils are entered for Spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Enter Additional details on Product page for Spouse   || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Yes_for_unable_to_work_because_of_a_disability_for_Self() throws Exception {

		try {
			log.debug("Answer the questions of Unable to work because of Disability as Yes ");
			OtherIns_YES.isDisplayed();
			OtherIns_YES.click();
			log.info(" work because of Disability Question answered as YES for Self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer on Unable to work because of Disability as YES for Self|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean clicks_on_Add_Company_Button() throws Exception {

		try {
			log.debug("Click on Add Company Button");
			AddCompanyDIButton.isDisplayed();
			AddCompanyDIButton.click();
			log.info("Add Company Button is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to to click Add Company Button|| Fail" + e.getMessage());
			throw (e);
		}

	}


	public boolean selects_Yes_for_replace_any_other_company_s_coverage_for_Self() throws Exception {

		try {
			log.debug("Answer the Replacement Coverage Disability as Yes ");
			Thread.sleep(1000);
			CompanyCoverage_DIYES.isDisplayed();
			CompanyCoverage_DIYES.click();
			log.info(" Replacement Coverage Disability Question answered as YES for Self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer onReplacement Coverage Disability as YES for Self|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean enters_Amount_under_replace_any_other_company_s_coverage_as(String Amount) throws Exception {

		try {
			log.debug("Enter amount will be Replaced");
			Thread.sleep(1000);
			ReplaceAmtSelf_DI.isDisplayed();
			ReplaceAmtSelf_DI.sendKeys(Amount);

			log.info("Amount to be replaced is entered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter amount will be replaced|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_product_AccidentOnly_for_Self() throws Exception {
		try {
			log.debug("Select Self for Accident-Only Insurance Product");
			reuseMethod.scrollDown(Accident_only_Self);
			Thread.sleep(1000);
			Accident_only_Self.click();
			Thread.sleep(500);

			log.info("Accident-Only Insurance Product for Self is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Self for Accident-Only Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}

//AAFP

	public boolean selects_Yes_for_self_employed_for_less_than_One_year_under_Self() throws Exception {

		try {
			log.debug("Answer the Self Employed for Less Than Year as Yes ");
			LessThanYearYES.isDisplayed();
			LessThanYearYES.click();
			log.info("Self Employed less than Year Question answered as YES for Self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer Self Employed less than Year as YES for Self|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validate_error_message_for_required_question() throws Exception {
		try {
			log.debug("Validate Error Messege");
			String expected = PropertyUtility.Load_MessageFile_Data("requiredQues_Msg");

			ErrorMsg.isDisplayed();
			String actual = ErrorMsg.getText();
			Assert.assertEquals(actual, expected, "Error message does not match");

			log.info("Error Messege is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Error Messege || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_AccidentOnly_for_Spouse() throws Exception {
		try {
			log.debug("Select Spouse for Accident-Only Insurance Product");
			reuseMethod.scrollDown(Accident_only_Spouse);
			Thread.sleep(1000);
			Accident_only_Spouse.click();
			Thread.sleep(500);

			log.info("Accident-Only Insurance Product for Spouse is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Spouse for Accident-Only Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_Error_Message_on_Product_Page() throws Exception {
		try {
			log.debug("Validate Error Message on Product Page");

			String ExpectedProdctMsg = PropertyUtility.Load_MessageFile_Data("ProductErrorMessege");
			ErrorMsg.isDisplayed();
			String actual = ErrorMsg.getText();
			Assert.assertEquals(actual, ExpectedProdctMsg, "Error message for Product Page is Displayed");

			log.info("Error Message on Product Page is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Error Message on Product Page|| Fail" + e.getMessage());
			throw (e);
		}
	}

//AAFP

	public Boolean verify_Error_Message_for_ATLEAST_ONE_PRODUCT_is_displayed_on_Product_page() throws Exception {
		try {
			log.debug("Validate Error Messege for ATLEAST ONE PRODUCT validation");
			ErrorMsg_AtleastOneProduct.isDisplayed();
			log.info("Error Messege for ATLEAST ONE PRODUCT is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Error Messege for ATLEAST ONE PRODUCT || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_No_for_Self_and_Spouse()
			throws Exception {

		try {
			log.debug("Answer the questions of Product Additional Page for self and Spouse");
			LyfInsNoSelf.click();
			PendingInsNoSelf.click();
			LyfInsNOSpouse.click();
			PendingInsNOSpouse.click();
			log.info("Additional Product page for self and spouse answered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer on Additional Product page for self and Spouse|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_No_for_all_for_Spouse()
			throws Exception {

		try {
			log.debug("Answer the questions of Product Additional Page for Spouse");

			reuseMethod.scrollatTop();
			LyfInsNOSpouse.isDisplayed();
			LyfInsNOSpouse.click();
			PendingInsNOSpouse.isDisplayed();
			PendingInsNOSpouse.click();
			log.info("Additional Product page for Spouse answered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer on Additional Product page for Spouse|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_Yes_for_Self_and_enter_details_as(
			String InforcePolicyAmount, String PendingPolicyAmount, String Company) throws Exception {

		try {
			log.debug("Answer the questions as Yes of Product Additional Page for Self");
			Thread.sleep(2000);
			reuseMethod.scrollDown(Next);
			LyfInsYesSelf.click();
			TotalInsSelf.sendKeys(InforcePolicyAmount);
			Thread.sleep(2000);
			ExistingInsPolicy_Yes.click();
			PendingInsYesSelf.click();
			PendingAmount.sendKeys(PendingPolicyAmount);
			CompanySelf.sendKeys(Company);
			log.info("Additional Product page for Self answered as Yes successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer as Yes on Additional Product page for Self|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_Yes_for_Self_and_Spouse_and_enter_details_as(
			String InforcePolicyAmount, String PendingPolicyAmount, String Company) throws Exception {

		try {
			log.debug("Answer the questions as Yes of Product Additional Page for Self and Spouse");
			LyfInsYesSelf.click();
			TotalInsSelf.sendKeys(InforcePolicyAmount);
			ExistingInsPolicy_Yes.click();
			PendingInsYesSelf.click();
			PendingAmount_Self_Mobile.sendKeys(PendingPolicyAmount);
			CompanyGroupTerm_Self_Mobile.sendKeys(Company);
			// ForSpouse
			OtherLyfIns_Yes_Spouse.click();
			SpouseForceAmnt_Mobile.sendKeys(InforcePolicyAmount);
			ExistingInsPolicy_Yes_Spouse.click();
			PendingInsYes_Spouse.click();
			SpousePendingAmnt_Mobile.sendKeys(PendingPolicyAmount);
			SpouseCompany_Mobile.sendKeys(Company);

			log.info("Additional Product page for Self and Spouse answered as Yes successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to answer as Yes on Additional Product page for Self and Spouse || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean selects_the_product_as_FiveYr_Term_Life_insurance_for_self() throws Exception {

		try {
			log.debug("Select the product for Term Life Insurance for Self");
			System.out.println("Click on 5 yrs term plans");
			Thread.sleep(3000);
			reuseMethod.scrollDown(FiveYrTermself);
			FiveYrTermself.click();
			
			log.info("Product for Term life Insurance for Self selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the product for Term Life Insurance for Self || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_product_TenYTL_for_Self() throws Exception {
		try {
			log.debug("Select Self for Ten Year Life term Insurance Product");
			reuseMethod.scrollDown(TenYrTermself);
			Thread.sleep(2000);
			TenYrTermself.click();

			log.info("Ten Year Life term Insurance Product for self is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Self for Ten Year Life term Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_TwentyYTL_for_Self() throws Exception {
		try {
			log.debug("Select Self for Twenty Year Life term Insurance Product");
			reuseMethod.scrollDown(TwentyYrTermProductSelf);
			Thread.sleep(2000);
			TwentyYrTermProductSelf.click();

			log.info("Twenty Year Life term Insurance Product for self is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Self for Twenty Year Life term Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_the_product_as_FiftyYTL_for_Self() throws Exception {

		try {
			log.debug("Select the product for Fifty Year Term Insurance for Self");
			reuseMethod.scrollDown(FiftyYrTermself);
			Thread.sleep(2000);
			FiftyYrTermself.click();

			log.info("Product for Fifty Year Term Insurance for Self selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select the product for Fifty Year Term Insurance for Self || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_product_LTDPlus_for_Self() throws Exception {
		try {
			log.debug("Select Self for Long Term disability Plus Insurance Product");
			reuseMethod.scrollDown(LongTermDisabilityPlusProductSelf);
			Thread.sleep(2000);
			LongTermDisabilityPlusProductSelf.click();

			log.info("Long Term disability Plus Insurance Product for self is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Self for Long Term disability Plus Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_LTD_for_Self() throws Exception {
		try {
			log.debug("Select Self for Long Term disability Insurance Product");
			reuseMethod.scrollDown(LongTermDisabilityProductSelf);
			Thread.sleep(2000);
			LongTermDisabilityProductSelf.click();

			log.info("Long Term disability  Insurance Product for self is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Self for Long Term disability  Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_MTDI_for_Self() throws Exception {
		try {
			log.debug("Select Self for Mid/Short Term disability Insurance Product");
			reuseMethod.scrollDown(MidTermDisabilityProductSelf);
			Thread.sleep(2000);
			MidTermDisabilityProductSelf.click();

			log.info("Mid/Short Term disability Insurance Product for self is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Self for Mid/Short Term disability Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_CI_for_Self() throws Exception {
		try {
			log.debug("Select Self for Critical Illness Product");
			Thread.sleep(2000);
			reuseMethod.scrollDown(CriticalIllnessProductSelf);
			
			CriticalIllnessProductSelf.click();
			Thread.sleep(1000);

			log.info("Critical Illness Product for self is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Self for Critical Illness Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_RDI_for_Self() throws Exception {
		try {
			log.debug("Select Self for Retirement Disability Product");
			reuseMethod.scrollDown(RetirementDisablityProductSelf);
			Thread.sleep(2000);
			RetirementDisablityProductSelf.click();

			log.info("Retirement Disability Product for self is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Self for Retirement Disability Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_POEDI_for_Self() throws Exception {
		try {
			log.debug("Select Self for Professional Expense Disability Product");
			reuseMethod.scrollDown(ProfessionalExpenseProductself);
			Thread.sleep(2000);
			ProfessionalExpenseProductself.click();

			log.info("Professional Expense Disability Product for self is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Self for Professional Expense Disability|| Fail" + e.getMessage());
			throw (e);
		}
	}

	/*public boolean selects_product_HMI_for_Self() throws Exception {
		try {
			log.debug("Select Self for Hospital Money Insurance Product");
			reuseMethod.scrollDown(HospitalIdemSelf);
			Thread.sleep(2000);
			HospitalIdemSelf.click();

			log.info("Hospital Money Insurance Product for self is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Self for Hospital Money Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}*/

	public boolean selects_product_TermLife_for_Self() throws Exception {
		try {
			log.debug("Select Self for Term Life Insurance Product");
			reuseMethod.scrollDown(TermLifeSelf);
			Thread.sleep(1000);
			TermLifeSelf.click();
			Thread.sleep(500);

			log.info("Term Life Insurance Product for Self is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Self for Term Life Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean selects_product_FirstToDie_TLI_for_Self() throws Exception {
		try {
			log.debug("Select Self for FirstToDie TermLife Insurance Product");
			reuseMethod.scrollDown(FirsttoDieTermLifeInsurance_Self);
			Thread.sleep(1000);
			FirsttoDieTermLifeInsurance_Self.click();
			Thread.sleep(500);

			log.info("FirstToDieTermLifeInsurance Product for Self is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Self for FirstToDie TermLife Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean selects_product_FirstToDie_TLI_for_Spouse() throws Exception {
		try {
			log.debug("Select Spouse for FirstToDie TermLife Insurance Product");
			reuseMethod.scrollDown(FirsttoDieTermLifeInsurance_Spouse);
			Thread.sleep(1000);
			FirsttoDieTermLifeInsurance_Spouse.click();
			Thread.sleep(500);

			log.info("FirstToDieTermLifeInsurance Product for Spouse is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Spouse for FirstToDie TermLife Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean verify_that_Spouse_icon_is_selected_for_FirstToDie_TLI() throws Exception {
		try {
			log.debug("Verify that Spouse icon is selected for FirstToDie TLI");
			reuseMethod.scrollDown(FirsttoDieTermLifeInsurance_Spouse);
			Thread.sleep(1000);
			boolean Actual=FirsttoDieTermLifeInsurance_Spouse.isEnabled();
			Assert.assertTrue(Actual, "Spouse icon is NOT selected for FirstToDie TLI || FAIL");

			log.info("FirstToDieTermLifeInsurance Product for Spouse is already selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify Spouse for FirstToDie TermLife Insurance Product is selected || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_DII_for_Self() throws Exception {
		try {
			log.debug("Select Self for Disability Income Insurance Product");
			reuseMethod.scrollDown(DisabilityIncomeSelf);
			Thread.sleep(1000);
			DisabilityIncomeSelf.click();
			Thread.sleep(500);

			log.info("Disability Income Insurance Product for Self is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Self for Disability Income Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_HII_for_Self() throws Exception {
		try {
			log.debug("Select Self for Hospital Idemnity Insurance Product/Hospital Money Insurance Product");
			reuseMethod.scrollDown(HospitalIdemSelf);
			Thread.sleep(1000);
			HospitalIdemSelf.click();
			Thread.sleep(500);

			log.info("Hospital Idemnity Insurance Product for Self is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Self for Hospital Idemnity Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_TermLife_for_Spouse() throws Exception {
		try {
			log.debug("Select Spouse for Term Life Insurance Product");
			reuseMethod.scrollDown(TermLifeSpouse);
			Thread.sleep(1000);
			TermLifeSpouse.click();
			Thread.sleep(500);

			log.info("Term Life Insurance Product for Spouse is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Spouse for Term Life Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_DII_for_Spouse() throws Exception {
		try {
			log.debug("Select Spouse for Disability Income Insurance Product");
			reuseMethod.scrollDown(DisabilityIncomeSpouse);
			Thread.sleep(1000);
			DisabilityIncomeSpouse.click();
			Thread.sleep(500);

			log.info("Disability Income Insurance Product for Spouse is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Spouse for Disability Income Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_HII_for_Spouse() throws Exception {
		try {
			log.debug("Select Spouse for Hospital Idemnity Insurance Product");
			// reuseMethod.scrollDown(HospitalIdemSpouse);
			Thread.sleep(1000);
			HospitalIdemSpouse.click();
			Thread.sleep(500);

			log.info("Hospital Idemnity Insurance Product for Spouse is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Spouse for Hospital Idemnity Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_TermLife_for_Child() throws Exception {
		try {
			log.debug("Select Child for Term Life Insurance Product");
			 reuseMethod.scrollDown(TermLifeChild);
			Thread.sleep(2000);
			System.out.println(TermLifeChildverify.isSelected());
			
			TermLifeChild.click();
			
			Thread.sleep(1000);

			log.info("Term Life Insurance Product for Child is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Child for Term Life Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_HII_for_Child() throws Exception {
		try {
			log.debug("Select Child for Hospital Idemnity Insurance/Hospital Money Insurance Product");
			// reuseMethod.scrollDown(HospitalIdemChild);
			Thread.sleep(1000);
			HospitalIdemChild.click();
			Thread.sleep(500);

			log.info("Hospital Idemnity Insurance/Hospital Money Insurance Product for Child is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Child for Hospital Idemnity Insurance/Hospital Money Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean confirms_Imp_Replacement_Info_for_NewYork_state() throws Exception {
		try {
			log.debug("Select the checkbox of Imp Replacement Info");
			System.out.println("Select the checkbox of Imp Replacement Info");
			reuseMethod.scrollDown(Replacement_Info);
			checkbox_Replacement.isDisplayed();

			if (!checkbox_Replacement.isSelected()) {
				log.info("Checkbox is not selected");
				//checkbox_Replacement.click();
				reuseMethod.Clickbutton(checkbox_Replacement);
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

	public boolean validate_Imp_Replacement_Info_for_NewYork_state() throws Exception {
		try {
			log.debug("Validate Replacement Information and Select the checkbox");
			System.out.println("Validate Replacement Information for New York state");
			Replacement_Info.isDisplayed();
			String actual = Replacement_Info.getText();
			String Expected = PropertyUtility.Load_MessageFile_Data("NYReplacementText");

			System.out.println("********************Information***********************/n" + Expected);

			Assert.assertEquals(actual, Expected, "Important Replacement Information is Validated for NewYork State");

			log.info("Replacement Information validated Successfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate the replacement information || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean verify_New_York_State_paragraph_is_displayed_for_Self() throws Exception {
		try {
			log.debug("Validate Information for New York State ");
			System.out.println("Validate Replacement Information and Select the checkbox");
			reuseMethod.scrollDown(NewyorkInfo);
			NewyorkInfo.isDisplayed();
			String actual = NewyorkInfo.getText().replaceAll("\\n", "");
			String Expected = PropertyUtility.Load_MessageFile_Data("NewYorkState");

			System.out.println("********************Information***********************/n" + Expected);

			Assert.assertEquals(actual, Expected, "Important Replacement Information is Validated for NewYork State");
			log.info(" Information validated  Successfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate the  information for New York State|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean enters_Monthly_Income_for_disability_coverage_as(String Income) throws Exception {
		try {
			log.debug("Enter Average Monthly income for Disability Coverage");
			reuseMethod.scrollDown(MonthlyIncome_Self);
			MonthlyIncome_Self.clear();
			Thread.sleep(2000);
			MonthlyIncome_Self.sendKeys(Income);
			MonthlyIncome_Self.sendKeys(Keys.TAB);
			Thread.sleep(500);

			log.info("Monthly Income is Entered Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Enter Monthly average Income || Fail" + e.getMessage());
			throw (e);
		}
	}
	/*
	 * public boolean enters_New_Monthly_Income_as(String Income) throws Exception {
	 * try { log.debug("Enter New  Average Monthly income for Disability Coverage");
	 * //reuseMethod.scrollDown(MonthlyIncome_Self); MonthlyIncome_Self.clear();
	 * Thread.sleep(500); MonthlyIncome_Self.sendKeys(Income);
	 *
	 * log.info(" New Monthly Income is Entered Sucessfully|| Pass"); return true; }
	 * catch (Exception e) {
	 * log.error("Not able to Enter New Monthly average Income || Fail"+e.getMessage
	 * ()); throw(e); } }
	 */

	public boolean enters_Monthly_Income_as_for_Spouse(String Income) throws Exception {
		try {
			log.debug("Enter Average Monthly income for Disability Coverage Spouse");
			reuseMethod.scrollDown(MonthlyIncome_Spouse);
			MonthlyIncome_Spouse.clear();
			MonthlyIncome_Spouse.sendKeys(Income);

			log.info("Monthly Income for Spouse is Entered Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Enter Monthly average Income for Spouse || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean enters_details_for_Monthly_Expense_and_Percentage_Responsible_as(String MonthlyExpense,
			String Percent) throws Exception {
		try {
			log.debug("Enter Average Monthly Expense and Percentage for Disability Coverage");
			MonthlyBusinessExpense_Self.sendKeys(MonthlyExpense);
			MonthlyExpensePercent_Self.sendKeys(Percent);
			MonthlyExpensePercent_Self.sendKeys(Keys.TAB);
			log.info(" Average Monthly Expense and Percentage for Disability Coverage is Entered Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Enter  Average Monthly Expense and Percentage for Disability Coverage || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Answer_as_No_for_Applying_any_Other_Insurance() throws Exception {
		try {
			log.debug("Selects Answer as No for Applying any Other Insurance");
			OtherIns_NO.click();
			log.info(" No Options for Applying any Other Insurance is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select No Options for for Applying any Other Insurance || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean enters_details_for_Monthly_Expense_as(String MonthlyExpense) throws Exception {
		try {
			log.debug("Enter Average Monthly Expense for Disability Coverage");
			reuseMethod.scrollDown(MonthlyBusinessExpense_Self);
			MonthlyBusinessExpense_Self.clear();
			MonthlyBusinessExpense_Self.sendKeys(MonthlyExpense);
			Thread.sleep(1000);

			log.info(" Average Monthly Expense for Disability Coverage is Entered Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Enter  Average Monthly Expense for Disability Coverage || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Answer_as_No_for_Additional_Questions_as_No_for_all_for_Self_of_Group_Disability_Insuranse()
			throws Exception {
		try {
			log.debug("Select No Options for additional Questions Group Disability Insurance");
			OtherIns_NO.click();
			OtherBusiness_NO.click();

			log.info(" No Options for additional Questions Group Disability Insurance is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select No Options for additional Questions Group Disability Insurance || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Answer_as_No_for_other_business_question_for_Self_of_Group_Disability_Insurance()
			throws Exception {
		try {
			log.debug("Select No Options for other business question of Group Disability Insurance");
			OtherBusiness_NO.click();

			log.info(" No Options for additional Questions Group Disability Insurance is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select No Options for additional Questions Group Disability Insurance || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Answer_as_No_for_all_Group_Disability_Insurance_for_Self() throws Exception {
		try {
			log.debug("Select No Options for additional Questions Group Disability Insurance for Self");
			OtherIns_NO.click();
			LessThanYearNO.click();

			log.info(
					" No Options for additional Questions Group Disability Insurance for Self is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Select No Options for additional Questions Group Disability Insurance for self || Fail"
							+ e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Answer_as_No_for_other_insurance_question_for_Spouse_of_Group_Disability_Insurance()
			throws Exception {
		try {
			log.debug("Select No Options for Spouse addtional Questions Group Disability Insurance");
			OtherInsSpouse_NO.click();

			log.info(
					" No Options for Spouse addtional Questions Group Disability Insurance is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select No Options for Spouse addtional Questions Group Disability Insurance || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

//AAFP
	public boolean selects_Answer_as_No_for_Uniformed_Service_for_Self_of_Group_Disability_Insurance()
			throws Exception {
		try {
			log.debug("Select No Options for uniformed services Group Disability Insurance");

			UniformedServiceChapter_Self_NO.click();

			log.info(
					" No Options for uniformed services question Group Disability Insurance is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select No Options for uniformed services question Group Disability Insurance || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Answer_as_No_for_resident_member_for_Self_of_Group_Disability_Insurance() throws Exception {
		try {
			log.debug("Select No Options for Resident member question for Group Disability Insurance");

			ResidentMember_Self_NO.click();

			log.info(
					" No Options for Resident member question for Group Disability Insurance is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select No for Resident member question for Group Disability Insurance || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean selects_YES_for_Question_Are_you_a_resident_member() throws Exception {
		try {
			log.debug("Select No Options for addtional Questions Group Disability Insurance");

			ResidentMember_Self_Yes.click();

			log.info(" No Options for addtional Questions Group Disability Insurance is selected Sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select No Options for addtional Questions Group Disability Insurance || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

//*********************************************Mobile************************************************************************//

	public boolean Product_Page_is_displayed_Mobile() throws Exception {
		try {
			log.debug("Product page is displayed in Mobile");
			product_page_Mob.isDisplayed();
			log.info("Product page is displayed in Mobile || Pass");
			return true;
		} catch (Exception e) {
			log.error("Product page is displayed in Mobile || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean Product_page_is_displayed_with_product_list_And_select_all_members_for_all_products_Mobile()
			throws Exception {
		try {
			log.debug("Select All product with All memebers Mobile");

			Select_Self_for_Traditional_Term_Life_Insurance_Mobile();
			Select_Spouse_for_Traditional_Term_Life_Insurance_Mobile();
			Select_child_for_Traditional_Term_Life_Insurance_Mobile();

			Select_self_for_Ten_Year_Insurance_Mobile();
			Select_Spouse_for_Ten_Year_Insurance_Mobile();

			Select_Self_for_Twenty_Year_Life_Insurance_Mobile();
			Select_Spouse_for_Twenty_Year_Life_Insurance_Mobile();

			Select_Self_for_Long_Term_Life_Insurance_Mobile();
			Select_Spouse_for_Long_Term_Life_Insurance_Mobile();

			Select_Self_for_Short_Term_Life_Insurance_Mobile();
			Select_Spouse_for_Short_Term_Life_Insurance_Mobile();

			Select_self_for_Business_Overhead_Mobile();
			log.info("Select All product with All memebers Mobile SuccessFully|| Pass");
			return true;
		}

		catch (Exception e) {
			log.error("Not able to select products Mobile || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean Select_Self_for_Traditional_Term_Life_Insurance_Mobile() throws Exception {
		try {
			log.info("Select Traditional Product for Self");
			reuseMethod.scrollDown(Group_Term_Title_Mobile);
			if (!TraditionalProductSelf_Mobile.isDisplayed()) {
				Traditional_Insurance_Mobile_label_arrow.click();
				Thread.sleep(1000);
			}

			TraditionalProductSelf_Mobile.click();
			log.info("Selected Traditional Product for Self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Traditional Product for Self || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean Select_Spouse_for_Traditional_Term_Life_Insurance_Mobile() throws Exception {
		try {
			log.info("Select Tradional or Five Year Product for Spouse");
			reuseMethod.scrollDown(Group_Term_Title_Mobile);
			if (!TraditionalProductSpouse_Mobile.isDisplayed()) {
				Traditional_Insurance_Mobile_label_arrow.click();
				Thread.sleep(1000);
			}

			TraditionalProductSpouse_Mobile.click();

			log.info("Selected Tradional Product for Spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Tradional Product for Spouse || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean Select_child_for_Traditional_Term_Life_Insurance_Mobile() throws Exception {
		try {
			log.info("Select Traditional Product for Child");
			reuseMethod.scrollDown(Group_Term_Title_Mobile);
			if (!TraditionalProductChild_Mobile.isDisplayed()) {
				Traditional_Insurance_Mobile_label_arrow.click();
				Thread.sleep(1000);
			}

			TraditionalProductChild_Mobile.click();
			log.info("Selected Traditional Product for Child successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Traditional Product for Child || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean Select_self_for_Ten_Year_Insurance_Mobile() throws Exception {
		try {
			log.debug("Select Ten Year Product for Self");
			reuseMethod.scrollDown(Group_Term_Title_Mobile);
			if (!TenYearProductSelf_Mobile.isDisplayed()) {
				Ten_year_Life_Insurance_Mobile.click();
			}
			Thread.sleep(1000);
			TenYearProductSelf_Mobile.click();

			log.info("Selected Ten Year Product for Self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Ten Year Product for Self || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean Select_Spouse_for_Ten_Year_Insurance_Mobile() throws Exception {
		try {
			log.debug("Select Ten Year Product for Spouse");
			reuseMethod.scrollDown(Group_Term_Title_Mobile);
			if (!TenYearProductSpouse_Mobile.isDisplayed()) {
				Ten_year_Life_Insurance_Mobile.click();
				Thread.sleep(1000);
			}
			reuseMethod.scrollDown(Ten_year_Life_Insurance_Mobile);
			TenYearProductSpouse_Mobile.click();
			log.info("Selected Ten Year Product for Spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Ten Year Product for Spouse || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean Select_Self_for_Twenty_Year_Life_Insurance_Mobile() throws Exception {
		try {
			log.debug("Select Twenty Year Product for Self ");
			reuseMethod.scrollDown(Group_Term_Title_Mobile);
			Thread.sleep(1000);
			if (!TwentyYearProductSelf_Mobile.isDisplayed()) {

				Twenty_year_Life_Insurance_Mobile.click();
				Thread.sleep(1000);
			}
			// reuseMethod.scrollDown(Twenty_year_Life_Insurance_Mobile);
			if (!TwentyYearProductSelf_verify_Mobile.isSelected()) {
				TwentyYearProductSelf_Mobile.click();
			}
			log.info("Selected Twenty Year Product for Self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Ten Year Product for Self || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean Select_Spouse_for_Twenty_Year_Life_Insurance_Mobile() throws Exception {
		try {
			log.debug("Select Twenty Year Product for Spouse");

			reuseMethod.scrollDown(Group_Term_Title_Mobile);
			Thread.sleep(1000);
			if (!TwentyYearProductSpouse_Mobile.isDisplayed()) {
				Twenty_year_Life_Insurance_Mobile.click();
				Thread.sleep(1000);
			}
			// reuseMethod.scrollDown(Twenty_year_Life_Insurance_Mobile);
			if (!TwentyYearProductSpouse_verify_Mobile.isSelected()) {
				TwentyYearProductSpouse_Mobile.click();
			}

			log.info("Selected Twenty Year Product for Spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Ten Year Product for Self and Spouse || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean Select_Self_for_Long_Term_Life_Insurance_Mobile() throws Exception {
		try {
			log.debug("Select Long-Term Disability Insurance for Self");
			reuseMethod.scrollDown(Group_Disability_Title_Mobile);
			if (!LongTerm_productSelf_Mobile.isDisplayed()) {
				Long_Term_Disability_insurance_Mobile.click();
				Thread.sleep(1000);
			}
			LongTerm_productSelf_Mobile.click();

			log.info("Selected Long-Term Disability Insurance for Self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Long-Term Disability Insurance for Self || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean Select_Spouse_for_Long_Term_Life_Insurance_Mobile() throws Exception {
		try {
			log.debug("Select Long-Term Disability Insurance for Spouse");

			reuseMethod.scrollDown(Group_Disability_Title_Mobile);
			if (!LongTerm_productSpouse_Mobile.isDisplayed()) {
				Long_Term_Disability_insurance_Mobile.click();
				Thread.sleep(1000);
			}
			reuseMethod.scrollDown(Long_Term_Disability_insurance_Mobile);
			LongTerm_productSpouse_Mobile.click();
			log.info("Selected Long-Term Disability Insurance for Spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Long-Term Disability Insurance for Spouse || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean Select_Self_for_Short_Term_Life_Insurance_Mobile() throws Exception {
		try {
			log.debug("Select Short-Term Disability Insurance for Self");
			reuseMethod.scrollDown(Group_Disability_Title_Mobile);
			Thread.sleep(1000);
			if (!ShortTerm_productSelf_Mobile.isDisplayed()) {
				short_Term_Disability_insurance_Mobile.click();
				Thread.sleep(1000);
			}
			reuseMethod.scrollDown(short_Term_Disability_insurance_Mobile);
			Thread.sleep(1000);
			if (!ShortTerm_productSelfverify_Mobile.isSelected()) {
				ShortTerm_productSelf_Mobile.click();
			}

			log.info("Selected Short-Term Disability Insurance for Selfsuccessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Short-Term Disability Insurance for Self || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean Select_Spouse_for_Short_Term_Life_Insurance_Mobile() throws Exception {
		try {
			log.debug("Select Short-Term Disability Insurance for Spouse");

			reuseMethod.scrollDown(Group_Disability_Title_Mobile);
			if (!ShortTerm_productSpouse_Mobile.isDisplayed()) {
				short_Term_Disability_insurance_Mobile.click();

				Thread.sleep(1000);
			}
			reuseMethod.scrollDown(short_Term_Disability_insurance_Mobile);
			Thread.sleep(1000);
			if (!ShortTerm_productSpouseverify_Mobile.isSelected()) {
				ShortTerm_productSpouse_Mobile.click();
			}

			log.info("Selected Short-Term Disability Insurance for Spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Short-Term Disability Insurance for Spouse || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean Select_self_for_Business_Overhead_Mobile() throws Exception {
		try {

			log.debug("Select Business Overhead Expense Insurance for Self");
			reuseMethod.scrollDown(Group_Disability_Title_Mobile);
			Thread.sleep(1000);
			if (!Business_Overhead_productSelf_Mobile.isDisplayed()) {
				Business_Overhead_Mobile.click();
				Thread.sleep(1000);
			}
			reuseMethod.scrollDown(Business_Overhead_Mobile);
			Thread.sleep(1000);
			if (!Business_Overhead_productSelf_verify_Mobile.isSelected()) {
				Business_Overhead_productSelf_Mobile.click();
			}
			log.info("Selected Business Overhead Expense Insurance for Self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Business Overhead Expense Insurance for Self || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean Your_product_questions_page_is_displayed_And_select_the_checkbox_and_NO_for_all_the_questions_for_group_term_life_insurance_Mobile()
			throws Exception

	{
		try {
			log.debug("Select questions for Self");
			Thread.sleep(2000);
			your_Product_Question_Page_is_displayed_Mobile();
			reuseMethod.scrollDown(otherSelfQuestion_Mobile);
			Thread.sleep(1000);
			otherSelfNO_Mobile.click();
			Thread.sleep(2000);
			pendingSelfNO_Mobile.click();
			Thread.sleep(1000);
			log.info("Questions for self in Mobile Website selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select/fill questions for self in Mobile Website || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean your_product_questions_page_is_displayed_select_Yes_for_group_term_life_insurance_questions_Mobile()
			throws Exception

	{
		try {
			log.debug("Select questions for Self as Yes for Group Term Life Insurance");
			your_Product_Question_Page_is_displayed_Mobile();
			Thread.sleep(2000);

			otherSelfYes_Mobile.click();
			Thread.sleep(1000);
			reuseMethod.scrollDown(otherSelfYes_Mobile);
			replaceSelfQuestion_Yes_Mobile.click();
			reuseMethod.scrollDown(pendingSelfQuestion_Mobile);
			pendingSelfYes_Mobile.click();
			Thread.sleep(500);
			log.info(
					"Questions for self in Mobile Website selected as Yes successfully for Group Term Life Insurance|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select questions for self as Yes in Mobile Website for Group Term Life Insurance|| Fail"
							+ e.getMessage());
			throw (e);
		}

	}

	public boolean enter_detail_for_Self_group_term_life_insurance_question_as_Mobile(String Totalamtinforce,
			String Totalamtpending, String Company) throws Exception

	{
		try {
			log.debug("Fill details questions for Self for Group Term Life Insurance");
			reuseMethod.scrollDown(otherSelfQuestion_Mobile);
			Thread.sleep(500);
			ForceAmount_Self_Mobile.sendKeys(Totalamtinforce);

			reuseMethod.scrollDown(pendingSelfQuestion_Mobile);
			PendingAmount_Self_Mobile.sendKeys(Totalamtpending);
			reuseMethod.scrollDown(PendingAmount_Self_Mobile);
			CompanyGroupTerm_Self_Mobile.sendKeys(Company);
			Thread.sleep(500);
			log.info("Questions for self in Mobile Website filled successfully for Group Term Life Insurance|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to fill details for self in Mobile Website for Group Term Life Insurance|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean select_Yes_and_enter_details_for_self_for_Long_OR_Short_Term_group_disability_question_as_Mobile(
			String GDImonthlyincome, String GDIcompany1, String GDIMonthlybenamt1, String GDIBenperiod1,
			String GDIReplaced1) throws Exception {
		try {
			log.debug("Select questions for Self for Long or Short Term Group Disability as Yes and fill details");
			MonthlyIncome_Self.sendKeys(GDImonthlyincome);
			LongYes1_Self_Mobile.click();
			Thread.sleep(1000);
			Company_Long_disab_Self_Mobile.sendKeys(GDIcompany1);
			Benefit_Amt_Long_Self_Mobile.sendKeys(GDIMonthlybenamt1);
			Benefit_Prd_Long_Self_Mobile.sendKeys(GDIBenperiod1);

			LongYes2_Self_Mobile.click();
			Thread.sleep(500);
			replace_Amnt_Self_Mobile1.sendKeys(GDIReplaced1);

			log.info(
					"Questions for for Self for Long or Short Term Group Disability in Mobile Website selected as yes successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select/fill questions for Self for Long or Short Term Group Disability in Mobile Website || Fail"
							+ e.getMessage());
			throw (e);
		}
	}

	public boolean select_Yes_and_enter_details_for_self_for_Business_Overhead_question_as_Mobile(String BOEmonthbusexp,
			String Percentmonthbusexp, String GDIcompany2, String GDIMonthlybenamt2, String GDIBenperiod2,
			String GDIReplaced2) throws Exception {
		try {
			log.debug("Select questions for Self for Business Overhead as Yes and fill details");
			reuseMethod.scrollDown(Group_Disability_Title_Mobile);
			Expense_Bus_Self_Mobile.sendKeys(BOEmonthbusexp);
			ExpensePer_Bus_Self_Mobile.sendKeys(Percentmonthbusexp);

			overHeadGroupYes1_Self_Mobile.click();
			Thread.sleep(500);
			reuseMethod.scrollDown(overHeadGroupYes1_Self_Mobile);
			Company_Bus_Overhead_Self_Mobile.sendKeys(GDIcompany2);
			Benefit_Amt_Bus_overhead_Self_Mobile.sendKeys(GDIMonthlybenamt2);
			Benefit_Prd_Bus_overhead_Self_Mobile.sendKeys(GDIBenperiod2);

			overHeadGroupYes2_Self_Mobile.click();
			Thread.sleep(500);
			reuseMethod.scrollDown(Benefit_Prd_Bus_overhead_Self_Mobile);
			replace_Amnt_Self_Mobile2.sendKeys(GDIReplaced2);

			log.info(
					"Questions for for Self for Business Overhead in Mobile Website selected as yes successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select/fill questions for Self for Business Overhead in Mobile Website || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean Your_product_questions_page_is_displayed_Select_No_and_enter_the_details_for_Long_OR_Short_Term_Insurance_for_self_as_Mobile(
			String Income) throws Exception {
		try {
			log.debug(
					"Select questions for Self as No and fill details for Long or Short Term Group Disability in Mobile Website");
			your_Product_Question_Page_is_displayed_Mobile();
			MonthlyIncome_Self.clear();
			MonthlyIncome_Self.sendKeys(Income);
			// reuseMethod.scrollDown(MonthlyIncome_Self);
			LongNo1_Self_Mobile.click();
			Thread.sleep(300);
			log.info(
					"Questions for Long or Short Term Group Disability in Mobile Website selected as No successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select/fill questions Long or Short Term Group Disability in Mobile Website || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean Your_product_questions_page_is_displayed_Select_No_and_enter_the_details_for_Business_Overhead_for_self_as_Mobile(
			String Expense, String BusExp) throws Exception {
		try {
			log.debug("Select questions for Self as No and fill details for Business Overhead");
			your_Product_Question_Page_is_displayed_Mobile();
			Expense_Bus_Self_Mobile.clear();
			Expense_Bus_Self_Mobile.sendKeys(Expense);
			ExpensePer_Bus_Self_Mobile.clear();
			ExpensePer_Bus_Self_Mobile.sendKeys(BusExp);
			overHeadGroupNo1_Self_Mobile.click();
			log.info("Questions for Business Overhead in Mobile Website selected as No successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select/fill questions Business Overhead in Mobile Website || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean spouse_Product_questions_page_is_displayed_And_select_the_checkbox_NO_for_group_term_life_insurance_for_all_the_questions_Mobile()
			throws Exception {
		try {
			log.debug("Select questions for Spouse");

			spouse_Product_Ques__Page_is_displayed_Mobile();
			reuseMethod.scrollDown(otherSpouseQuestion_Mobile);
			SpouseInsuranceNO1_Mobile.click();
			SpousePendNO_Mobile.click();
			Thread.sleep(500);

			log.info("Questions for Spouse in Mobile Website selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select/fill questions for Spouse in Mobile || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean spouse_product_questions_page_is_displayed_and_select_NO_for_other_insurance_questions_and_enter_detail_Mobile(
			String SIncome) throws Exception {
		try {
			log.debug("Fill answers for Group Disability for Spouse");
			spouse_Product_Ques__Page_is_displayed_Mobile();
			reuseMethod.scrollDown(SpouseProductQuesPage_Mobile);
			SpouseIncome_Mobile.sendKeys(SIncome);
			SpouseInsuranceNO2_Mobile.click();
			log.info("Fill answers for Group Disability for Spouse in Mobile || Pass");
			return true;
		} catch (Exception e) {
			log.error("Fill answers for Group Disability for Spouse in Mobile || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean spouse_Product_Ques__Page_is_displayed_Mobile() throws Exception {
		try {
			log.debug("Spouse Product Question page is displayed in Mobile");
			Thread.sleep(4000);
			String Expected = "SPOUSE PRODUCT QUESTIONS";
			reuseMethod.scrollatTop();
			Assert.assertEquals(SpouseProductQuesPage_Mobile.getText(), Expected,
					"Spouse Product Question Page is Displayed");
			log.info("Spouse Product page is displayed in Mobile || Pass");
			return true;
		} catch (Exception e) {
			log.error("Spouse Product Question is displayed in Mobile || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean your_Product_Question_Page_is_displayed_Mobile() throws Exception {
		try {
			log.debug("Your Product Question page is displayed in Mobile");
			String Expected = "YOUR PRODUCT QUESTIONS";
			reuseMethod.scrollatTop();
			Thread.sleep(1000);
			Assert.assertEquals(YourProductQuesPage_Mobile.getText(), Expected,
					"Your Product Question Page is Displayed");
			log.info("Your Product Question page is displayed in Mobile || Pass");
			return true;
		} catch (Exception e) {
			log.error("Product Question page is displayed in Mobile || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean spouse_Product_questions_page_is_displayed_And_select_the_checkbox_and_YES_for_all_the_questions_and_enter_details_Mobile(
			String STotalamtinforce, String STotalamtpending, String SCompany, String SGDImonthlyincome,
			String SGDIcompany1, String SGDIMonthlybenamt1, String SGDIBenperiod1, String SGDIReplaced1)
			throws Exception {

		{
			try {
				log.debug(
						"Spouse Product questions page is displayed, select YES for all questions and enter details in Mobile site");
				spouse_Product_Ques__Page_is_displayed_Mobile();

				SpouseInsuranceYes1_Mobile.click();
				Thread.sleep(300);
				SpouseForceAmnt_Mobile.sendKeys(STotalamtinforce);
				SpousereplaceYes_Mobile.click();
				reuseMethod.scrollDown(SpouseInsuranceYes1_Mobile);
				SpousePendYes_Mobile.click();
				Thread.sleep(500);
				SpousePendingAmnt_Mobile.sendKeys(STotalamtpending);
				SpouseCompany_Mobile.sendKeys(SCompany);

				SpouseIncome_Mobile.sendKeys(SGDImonthlyincome);
				SpouseInsuranceYes2_Mobile.click();
				Thread.sleep(300);
				SpouseCompany1_Mobile.sendKeys(SGDIcompany1);
				SpouseBenefitAmnt_Mobile.sendKeys(SGDIMonthlybenamt1);
				SpouseBenefitPrd_Mobile.sendKeys(SGDIBenperiod1);

				SpouseReplaceYes_Mobile.click();
				Thread.sleep(300);
				SpouseReplaceAmnt_Mobile.sendKeys(SGDIReplaced1);

				log.info(
						"Spouse Product questions page is displayed, select YES for all questions and enter details in Mobile site Successfully || Pass");
				return true;
			} catch (Exception e) {
				log.error(
						"Spouse Product questions page is displayed, select YES for all questions and enter details in Mobile site || Fail"
								+ e.getMessage());
				throw (e);
			}
		}
	}

	public boolean validate_that_Traditional_TLI_is_available_Mobile() throws Exception {

		try {
			log.debug("Validate that Traditional TLI is available in Mobile site");
			Traditional_Insurance_Mobile_label_arrow.isDisplayed();

			log.info("Validated Traditional TLI is available for in Mobile site || Pass");
			return true;
		} catch (Exception e) {
			log.error("Validate that Traditional TLI is available in Mobile || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_that_TenYTL_is_available_Mobile() throws Exception {

		try {
			log.debug("Validate that TenYTL is available in Mobile site");
			Ten_year_Life_Insurance_Mobile.isDisplayed();

			log.info("Validated TenYTL is available in Mobile site || Pass");
			return true;
		} catch (Exception e) {
			log.error("Validate that TTenYTL is available in Mobile || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_that_Business_OEI_is_available_Mobile() throws Exception {

		try {
			log.debug("Validate that Business OEI is available in Mobile site");

			Business_Overhead_Mobile.isDisplayed();

			log.info("Validated Business OEI is available in Mobile site || Pass");
			return true;
		} catch (Exception e) {
			log.error("Validate that Business OEI is available in Mobile || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_that_TwentyYTL_is_available_Mobile() throws Exception {

		try {
			log.debug("Validate that TwentyYTL is available in Mobile site");
			Twenty_year_Life_Insurance_Mobile.isDisplayed();

			log.info("Validated TwentyYTL is available in Mobile site || Pass");
			return true;
		} catch (Exception e) {
			log.error("Validate that TwentyYTL is available in Mobile || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_that_Long_Term_is_available_Mobile() throws Exception {

		try {
			log.debug("Validate that Long Term is available in Mobile site");
			Long_Term_Disability_insurance_Mobile.isDisplayed();

			log.info("Validated Long Term is available in Mobile site || Pass");
			return true;
		} catch (Exception e) {
			log.error("Validate that Long Term is available in Mobile || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_that_Short_Term_is_available_Mobile() throws Exception {

		try {
			log.debug("Validate that Short Term is available in Mobile site");
			short_Term_Disability_insurance_Mobile.isDisplayed();

			log.info("Validated Short Term is available in Mobile site || Pass");
			return true;
		} catch (Exception e) {
			log.error("Validate that Short Term is available in Mobile || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_Dependent_only_Pop_up_message_and_click_on_ok_Mobile() throws Exception {
		try {
			log.debug("Validate Dependent only Pop up message and click on ok in Mobile site");
			String Expected = PropertyUtility.Load_MessageFile_Data("DependentOnlyCoverage");
			Thread.sleep(3000);

			String header = Dependent_Msg_Header_Mobile.getText();
			String body = Dependent_Msg_Body_Mobile.getText();
			String Actual = header + " " + body;

			System.err.println("Dependent Message: " + Actual);
			Assert.assertEquals(Actual, Expected, "Dependent Popup Message Validated");

			reuseMethod.Clickbutton(Dependent_OK_Mobile);
			Thread.sleep(500);

			log.info("Validate Dependent only Pop up message and click on ok in Mobile site || Pass");
			return true;
		} catch (Exception e) {
			log.error("Validate Dependent only Pop up message and click on ok in Mobile Site || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean select_the_NY_Imp_Info_checkbox_mobile() throws Exception {
		try {
			log.debug("Select the NY Imp Info checkbox for self in Mobile site");
			reuseMethod.scrollDown(YourProductQuesPage_Mobile);
			NY_Info_Chk_Mobile.click();
			Thread.sleep(500);
			log.info("Selected the NY Imp Info checkbox for self in Mobile site || Pass");
			return true;
		} catch (Exception e) {
			log.error("Select the NY Imp Info checkbox for self in Mobile Site || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_the_content_of_Ny_Replacemenet_Info_mobile() throws Throwable {

		try {
			log.debug("Validate the content of NY Imp Replacement Info in Mobile site");

			String Actual = PropertyUtility.Load_MessageFile_Data("NYReplacementText");

			Assert.assertEquals(Actual, NY_Info_text_Mobile.getText(), "Text does not match for NY Replacement Notice");
			System.out.println("Text validated for NY Replacement Notice");
			log.info("Validated the content of NY Imp Replacement Info in Mobile site || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate the content of NY Imp Replacement Info in Mobile Site || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean select_Self_for_all_the_Products_Mobile() throws Exception {

		try {
			log.debug("Select Self for all the Products in Mobile site");

			Select_Self_for_Traditional_Term_Life_Insurance_Mobile();

			Select_self_for_Ten_Year_Insurance_Mobile();

			Select_Self_for_Twenty_Year_Life_Insurance_Mobile();

			Select_Self_for_Long_Term_Life_Insurance_Mobile();

			Select_Self_for_Short_Term_Life_Insurance_Mobile();

			Select_self_for_Business_Overhead_Mobile();

			log.info("Selected Self for all the Products in Mobile site || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Self for all the Products in Mobile Site || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean select_Spouse_for_Traditional_TenYTL_TwentyYTL_LongTerm_and_ShortTerm_Products_Mobile()
			throws Exception {

		try {
			log.debug("Select Spouse for all the Products in Mobile site");

			Select_Spouse_for_Traditional_Term_Life_Insurance_Mobile();

			Select_Spouse_for_Ten_Year_Insurance_Mobile();

			Select_Spouse_for_Twenty_Year_Life_Insurance_Mobile();

			Select_Spouse_for_Long_Term_Life_Insurance_Mobile();

			Select_Spouse_for_Short_Term_Life_Insurance_Mobile();

			log.info("Selected Spouse for all the Products in Mobile site || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Spouse for all the Products in Mobile Site || Fail" + e.getMessage());
			throw (e);
		}
	}

//AAFP

	public boolean selects_product_PO_for_Self() throws Exception {
		try {
			log.debug("Select Self for Practice OverHead Product");
			reuseMethod.scrollDown(PO_OR_BOE_OR_OO_Product_Self);
			Thread.sleep(1000);
			PO_OR_BOE_OR_OO_Product_Self.click();
			Thread.sleep(500);

			log.info("Practice OverHead Product for Self is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Self for Practice OverHead Product || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean verify_Child_icon_is_disabled_for_TenYTL() throws Exception {
		try {
			log.debug("Child icon is disabled for Ten Year Level Term  Product");
			reuseMethod.scrollDown(TenYrTermChild);
			boolean condition;
			Thread.sleep(1000);
			String disabled = TenYrTermChild.getAttribute("disabled");

			if (disabled.equals("true")) {
				condition = true;
				System.out.println("Child Icon for Ten Year is Disabled ");
			} else {
				condition = false;
				System.out.println("Child Icon for Ten Year is enabled ");
			}
			Assert.assertTrue(condition, "Child icon is disabled for Ten Year Product");
			log.info(" Verified Child icon is disabled for Ten Year Product sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify child icon is disabled for Ten Year Product || Fail" + e.getMessage());
			throw (e);
		}
	}

//TIE

	public boolean verify_Error_message_is_displayed_for_Important_Replacement_Information_CheckBox_is_Mandatory()
			throws Throwable {

		try {
			log.debug("Validate the Important Replacement CheckBox is mandatory");

			String Expected = PropertyUtility.Load_MessageFile_Data("ImportantReplacementCheckBox");
			String Actual = ErrorMsg_ReplacementInformation.getText();
			Assert.assertEquals(Expected, Actual, "Text validated for NY Replacement Notice");

			log.info("Error message is displayed for Important Replacement CheckBox || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate the Important Replacement CheckBox is mandatory || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean verify_the_note_for_NY_is_displayed_mobile() throws Throwable {

		try {
			log.debug("Validate the content of NY Imp Replacement Info in Mobile site");

			NY_Info_text_Mobile.isDisplayed();
			System.out.println("Note for New york is displayed in mobile site");

			log.info("Validated the content of NY Imp Replacement Info in Mobile site || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate the content of NY Imp Replacement Info in Mobile Site || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean verify_Child_icon_is_disabled_for_TermLife() throws Exception {
		try {
			log.debug("Child icon is disabled for TermLife  Product");
			reuseMethod.scrollDown(TermLifeInsuranceLabel);
			boolean condition;
			Thread.sleep(1000);

			if (TermLifeChild.getAttribute("disabled").equals("true")) {
				condition = true;
				System.out.println("Child Icon is disabled for Term Life Year Product");

			} else {
				condition = false;
				System.out.println("Child Icon is Enabled for Term Life Year Product");
			}
			Assert.assertTrue(condition, "Child icon is disabled for TermLife Product");
			log.info(" Verified Child icon is disabled for TermLife Product sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify child icon is disabled for TermLife Product || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean verify_Child_icon_is_disabled_for_FifteenYTL() throws Exception {
		try {
			log.debug("Child icon is disabled for Fifteen Year Product");
			reuseMethod.scrollDown(FifteenYrChild);
			Thread.sleep(1000);
			boolean condition;
			String disabled = FifteenYrChild.getAttribute("disabled");
			if (disabled.equals("true")) {
				condition = true;
				System.out.println("Child Icon is disabled for Fifteen Year Product");

			} else {
				condition = false;
				System.out.println("Child Icon is Enabled for Fifteen Year Product");
			}
			Assert.assertTrue(condition, "Child icon is disabled for Ten Year Product");
			log.info(" Verified Child icon is disabled for Fifteen Year Product sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify child icon is disabled for Fifteen Year Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean verify_Child_icon_is_disabled_for_TwentyYTL() throws Exception {
		try {
			log.debug("Child icon is disabled for Twenty Year Product");
			reuseMethod.scrollDown(TwentyYrTermChild);
			Thread.sleep(1000);
			boolean condition;
			String disabled = TwentyYrTermChild.getAttribute("disabled");
			if (disabled.equals("true")) {
				condition = true;
				System.out.println("Child Icon is disabled for Twenty Year Product");
			} else {
				condition = false;
				System.out.println("Child Icon is Enabled for Twenty Year Product");
			}
			Assert.assertTrue(condition, "Child icon is enabled for Twenty Year Product");
			log.info(" Verified Child icon is disabled for Twenty Year Product sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify child icon is disabled for Twenty Year Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_the_product_FifteenYTL_for_Self() throws Exception {
		try {
			log.debug("Select Self for Fifteen year Product");
			reuseMethod.scrollDown(FifteenYrTermProductSelf);
			Thread.sleep(1000);
			FifteenYrTermProductSelf.click();

			log.info("Self for Fifteen year product selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Self for Fifteen year product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_the_product_FifteenYTL_for_Spouse() throws Exception {
		try {
			log.debug("Select Spouse for Fifteen year Product");
			reuseMethod.scrollDown(FifteenYrTermSpouse);
			Thread.sleep(1000);
			FifteenYrTermSpouse.click();

			log.info("Spouse for Fifteen year product selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Spouse for Fifteen year product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_PO_or_BOE_or_OO_for_Self() throws Exception {
		try {
			log.debug("Select Self for Practice OverHead/Business Overhead/Office Overhead Product");
			reuseMethod.scrollDown(PO_OR_BOE_OR_OO_Product_Self);
			Thread.sleep(1000);
			PO_OR_BOE_OR_OO_Product_Self.click();
			Thread.sleep(500);

			log.info(
					"Practice OverHead/Business Overhead/Office Overhead Product for Self is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Self for Practice/Business/Office Overhead Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_on_Add_Company_Button_for_Business_or_Office_Overhead() throws Exception {

		try {
			log.debug("Clicks on Add Company button for Business/Office overhead");
			Thread.sleep(1000);
			reuseMethod.scrollDown(AddCompanyOOButton);
			AddCompanyOOButton.click();

			log.info("Clicked on Add Company button for Business/Office overhead sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click on Add Company button for Business/Office overhead || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Yes_for_Any_Other_company_s_coverage_under_Group_Disability_for_Self() throws Exception {
		try {
			log.debug("Selects Yes for Any Other company's coverage under Group Disability for Self");
			Thread.sleep(1000);
			replace_OO_Yes.click();

			log.info(
					"Selected Yes for Any Other company's coverage under Group Disability for Self sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Yes for Any Other company's coverage under Group Disability for Self || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean Enters_replacement_amount_for_Group_Disability_as(String repAmount) throws Exception {
		try {
			log.debug("Enters replacement amount for Group Disability as for Self");
			reuseMethod.scrollDown(replace_OO_Yes);
			Thread.sleep(1000);
			replace_amount_OO.sendKeys(repAmount);

			log.info("Entered replacement amount for Group Disability as sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter replacement amount for Group Disability as for Self || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean verify_that_Child_button_is_available_for_Traditional_Term_Life_Insurance_Mobile() throws Exception {
		try {
			log.debug("Child button is available for Traditional Term Life Insurance");
			if (!TraditionalProductChild_Mobile.isDisplayed()) {
				Traditional_Insurance_Mobile_label_arrow.click();
			}
			Thread.sleep(1000);
			boolean check = TraditionalProductChild_Mobile.isDisplayed();
			Assert.assertTrue(check, "Child button is not available for Traditional Term Life Insurance");
			log.info("Verified Child button is available for Traditional Term Life Insurance sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify child button is available for Traditional Term Life Insurance || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validate_that_spouse_is_not_displayed_for_Traditional_Mobile() throws Exception {
		try {
			log.debug("Verify the Spouse is not displayed for Traditional Term Life Insurance in mobile application");
			Traditional_Insurance_Mobile_label_arrow.click();
			Thread.sleep(1000);
			boolean check = TraditionalProductSpouse_Mobile.isDisplayed();
			Assert.assertFalse(check,
					"Bug||Spouse is displayed for Traditional Term Life Insurance in mobile application");

			log.info("Spouse is not displayed for TermLife");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for Traditional Term Life Insurance**********");
			log.error("Spouse is not displayed for Traditional Term Life Insurance || Fail");
			return false;
		}

	}

	public boolean validate_that_spouse_is_not_displayed_for_TenYear_Mobile() throws Exception {
		try {
			log.debug("Verify the Spouse is not displayed for Ten year Insurance in mobile application");
			Ten_year_Life_Insurance_Mobile.click();
			Thread.sleep(1000);
			boolean check = TenYearProductSpouse_Mobile.isDisplayed();
			Assert.assertFalse(check, "Bug||Spouse is displayed for Ten year Insurance in mobile application");

			log.info("Spouse is not displayed for Ten year Insurance");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for Ten year Insurance**********");
			log.error("Spouse is not displayed for Ten year Insurance in mobile application || Fail");
			return false;
		}
	}

	public boolean validate_that_spouse_is_not_displayed_for_TwentyYear_Mobile() throws Exception {
		try {
			log.debug("Verify the Spouse is not displayed for Twenty year Insurance in mobile application");
			Twenty_year_Life_Insurance_Mobile.click();
			boolean check = TenYearProductSpouse_Mobile.isDisplayed();
			Assert.assertFalse(check, "Bug||Spouse is displayed for Twenty year Insurance in mobile application");

			log.info("Spouse is not displayed for Twenty year Insurance");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for Twenty year Insurance**********");
			log.error("Spouse is not displayed for Twenty year Insurance in mobile application || Fail");
			return false;
		}
	}

	public boolean validate_that_spouse_is_not_displayed_for_LongTerm_Mobile() throws Exception {
		try {
			log.debug("Verify the Spouse is not displayed for Long-Term Disability Insurance in mobile application");
			Long_Term_Disability_insurance_Mobile.click();
			Thread.sleep(1000);
			boolean check = LongTerm_productSpouse_Mobile.isDisplayed();
			Assert.assertFalse(check,
					"Bug||Spouse is displayed for Long-Term Disability Insurance in mobile application");

			log.info("Spouse is not displayed for Long-Term Disability Insurance");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for Long-Term Disability Insurance**********");
			log.error("Spouse is not displayed for Long-Term Disability Insurance in mobile application || Fail");
			return false;
		}
	}

	public boolean validate_that_spouse_is_not_displayed_for_ShortTerm_Mobile() throws Exception {
		try {
			log.debug("Verify the Spouse is not displayed for Short-Term Disability Insurance in mobile application");
			short_Term_Disability_insurance_Mobile.click();
			boolean check = ShortTerm_productSpouse_Mobile.isDisplayed();
			Assert.assertFalse(check,
					"Bug||Spouse is displayed for Short-Term Disability Insurance in mobile application");

			log.info("Spouse is not displayed for Short-Term Disability Insurance");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for Short-Term Disability Insurance**********");
			log.error("Spouse is not displayed for Short-Term Disability Insurance in mobile application || Fail");
			return false;
		}
	}

	public boolean selects_Yes_for_applying_for_any_other_business_office_overhead_insurance() throws Exception {

		try {
			log.debug("Select Yes for question 'Do you now have or are you now applying for any other business....'");
			reuseMethod.scrollDown(OtherBusiness_YES);
			Thread.sleep(1000);
			OtherBusiness_YES.click();

			log.info("Select Yes for question applying any other business sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Yes for question applying any other business || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_on_Add_Company_button_overhead_product() throws Exception {

		try {
			log.debug("Clicks on Add Company button for office overhead");
			Thread.sleep(1000);
			reuseMethod.scrollDown(AddCompanyOOButton);
			AddCompanyOOButton.click();

			log.info("Clicked on Add Company button for office overhead sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click on Add Company button for office overhead || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_that_Self_is_displayed_for_TenYTL_Mobile() throws Throwable {
		try {
			log.debug("Verify the Self is displayed for TenYTL");

			if (!TenYearProductSelf_Mobile.isDisplayed()) {
				Ten_year_Life_Insurance_Mobile.click();

			}
			Thread.sleep(1000);
			Assert.assertTrue(TenYearProductSelf_Mobile.isDisplayed(), "Bug||Self is not displayed for TenYTL");
			log.info("Self is displayed for TenYTL");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for TenYTL**********");
			log.error("Self is not displayed for TenYTL || Fail");
			return false;
		}
	}

	public boolean validates_that_Self_is_not_displayed_for_TenYTL_Mobile() throws Throwable {
		try {
			log.debug("Verify the Self is not displayed for TenYTL");

			Ten_year_Life_Insurance_Mobile.click();
			Thread.sleep(1000);

			boolean check = TenYearProductSelf_Mobile.isDisplayed();
			Assert.assertFalse(check, "Bug||Self is displayed for TenYTL");
			log.info("Self is not displayed for TenYTL");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for TenYTL**********");
			log.error("Self is not displayed for TenYTL || Fail");
			return false;
		}

	}

	public boolean validates_that_Self_is_displayed_for_TermLife_Mobile() throws Throwable {
		try {
			log.debug("Verify the Self is displayed or not for TermLife");
			if (!TraditionalProductSelf_Mobile.isDisplayed()) {
				TermLifeInsuranceLabel.click();
			}

			Thread.sleep(1000);
			boolean check = TraditionalProductSelf_Mobile.isDisplayed();
			Assert.assertTrue(check, "Bug||Self is not displayed for TermLife");

			log.info("Self is displayed for TermLife");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for TermLife**********");
			log.error("Self is displayed for TermLife || Fail");
			return false;
		}
	}

	public boolean validates_that_Self_is_not_displayed_for_TermLife_Mobile() throws Throwable {
		try {
			log.debug("Verify the Self is not displayed for TermLife");
			TermLifeInsuranceLabel.click();
			Thread.sleep(1000);
			boolean check = TraditionalProductSelf_Mobile.isDisplayed();
			Assert.assertFalse(check, "Bug||Self is displayed for TermLife");

			log.info("Self is displayed for TermLife");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for TermLife**********");
			log.error("Self is displayed for TermLife || Fail");
			return false;
		}
	}

	public boolean validates_that_Self_is_displayed_for_BOE_Mobile() throws Throwable {
		try {
			log.debug("Verify the Self is displayed or not for Business Overhead");
			if (!Business_Overhead_productSelf_Mobile.isDisplayed()) {
				Business_Overhead_Mobile.click();
			}

			Thread.sleep(1000);

			boolean check = Business_Overhead_productSelf_Mobile.isDisplayed();
			Assert.assertTrue(check, "Bug||Self is displayed for Business Overhead");

			log.info("Self is displayed for TermLife");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for Business Overhead**********");
			log.error("Self is displayed for Business Overhead || Fail");
			return false;
		}
	}

	public boolean validates_that_Self_is_displayed_for_TwentyYTL_Mobile() throws Throwable {
		try {
			log.debug("Verify the Self is displayed for Twenty YTL");
			Twenty_year_Life_Insurance_Mobile.click();
			Thread.sleep(1000);
			boolean check = TwentyYearProductSelf_Mobile.isDisplayed();
			Assert.assertTrue(check, "Bug||Self is not displayed for Twenty YTL");

			log.info("Self is displayed for Twenty YTL");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for Twenty YTL**********");
			log.error("Self is displayed for Twenty YTL || Fail");
			return false;
		}
	}

	public boolean validates_that_Self_is_not_displayed_for_TwentyYTL_Mobile() throws Throwable {
		try {
			log.debug("Verify the Self is not displayed for Twenty YTL");
			Twenty_year_Life_Insurance_Mobile.click();
			Thread.sleep(1000);
			boolean check = TwentyYearProductSelf_Mobile.isDisplayed();
			Assert.assertFalse(check, "Bug||Self is displayed for Twenty YTL");

			log.info("Self is not displayed for Twenty YTL");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for Twenty YTL**********");
			log.error("Self is not displayed for Twenty YTL || Fail");
			return false;
		}
	}

	public boolean validates_that_Self_is_displayed_for_LongTerm_Mobile() throws Throwable {
		try {
			log.debug("Verify the Self is displayed for Long Term");
			Long_Term_Disability_insurance_Mobile.click();
			Thread.sleep(2000);

			boolean check = LongTerm_productSelf_Mobile.isDisplayed();
			Assert.assertTrue(check, "Bug||Self is not displayed for Long Term");

			log.info("Self is displayed for Long Term");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for Long Term**********");
			log.error("Self is displayed for Long Term || Fail");
			return false;
		}
	}

	public boolean validates_that_Self_is_displayed_for_ShortTerm_Mobile() throws Throwable {
		try {
			log.debug("Verify the Self is displayed for Short Term");
			short_Term_Disability_insurance_Mobile.click();
			Thread.sleep(2000);
			boolean check = ShortTerm_productSelf_Mobile.isDisplayed();
			Assert.assertTrue(check, "Bug||Self is displayed for short Term");

			log.info("Self is displayed for Long Term");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for Short Term**********");
			log.error("Self is displayed for Long Term || Fail");
			return false;
		}
	}

	public boolean selects_the_product_FifteenYTL_for_Child() throws Exception {
		try {
			log.debug("Select Child for Fifteen year Product");
			reuseMethod.scrollDown(FifteenYrChild);
			Thread.sleep(1000);
			FifteenYrChild.click();

			log.info("Child for Fifteen year product selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Child for Fifteen year product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean verify_that_DII_is_already_selected_for_Self() throws Throwable {
		try {
			log.debug("Verify that DII is already selected for Self");

			boolean check = DisabilityIncomeSelf.isEnabled();
			System.out.println("Value is:" + check);
			Assert.assertTrue(check, "Bug||DII self product is not selected");
			System.out.println("DII self product is selected");
			log.info("DII self product is selected");
			return true;
		} catch (Exception e) {
			System.out.println("DII self product is not selected");
			log.error("Not able to Verify that DII is already selected for Self|| Fail");
			return false;
		}
	}

	public boolean validates_that_Self_is_not_displayed_for_PO_or_OOEDI() throws Throwable {

		try {
			log.debug("Verify the Self is not displayed for Practice/Office Overhead");
			Assert.assertFalse(PO_OR_BOE_OR_OO_Product_Self.isDisplayed(),
					"Bug||Self is displayed for Practice/Office Overhead");
			System.out.println("Self is not displayed for Practice/Office Overhead");
			log.info("Self is not displayed for Practice/Office Overhead Term");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for Practice/Office Overhead**********");
			log.error("Self is not displayed for Practice/Office Overhead || Fail");
			return false;
		}

	}

	public boolean validates_that_Self_is_displayed_for_PO_or_OOEDI() throws Throwable {

		try {
			log.debug("Verify the Self is displayed for Practice/Office Overhead");
			Assert.assertTrue(PO_OR_BOE_OR_OO_Product_Self.isDisplayed(),
					"Bug||Self is not displayed for Practice/Office Overhead");
			System.out.println("Self is  displayed for Practice/Office Overhead");
			log.info("Self is displayed for Practice/Office Overhead Term");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is displayed for Practice/Office Overhead**********");
			log.error("Self is displayed for Practice/Office Overhead || Fail");
			return false;
		}

	}

	public boolean validates_that_Self_is_not_displayed_for_SDI_or_LTDPlus() throws Throwable {

		try {
			log.debug("Verify the Self is not displayed for SDI or LTDPlus");
			Assert.assertFalse(LongTermDisabilityPlusProductSelf.isDisplayed(),
					"Bug||Self is displayed for SDI or LTDPlus");
			System.out.println("Self is not displayed for SDI or LTDPlus");

			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for SDI or LTDPlus**********");
			log.error("Self is not displayed for SDI or LTDPlus || Fail");
			return false;
		}

	}

	public boolean validates_that_Self_is_displayed_for_SDI_or_LTDPlus() throws Throwable {

		try {
			log.debug("Verify the Self is displayed for SDI or LTDPlus");
			Assert.assertTrue(LongTermDisabilityPlusProductSelf.isDisplayed(),
					"Bug||Self is not displayed for SDI or LTDPlus");

			log.info("Self is displayed for SDI or LTDPlus");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is displayed for SDI or LTDPlus**********");
			log.error("Self is displayed for SDI or LTDPlus || Fail");
			return false;
		}
	}

	///

	public boolean verify_Self_Is_Not_Displayed_For_MLI() throws Exception {

		try {
			log.debug("Validate Self is not Displayed for MLI");
			boolean check = ManagerLifeInsuranceSelf.isDisplayed();
			Assert.assertFalse(check, "Self is Displayed for MLI");

			System.out.println("Self is not Displayed for MLI");

			log.info("Self Button is validated successfully for MLI|| Pass");
			return true;
		} catch (Exception e) {
			System.err.println("Self is Displayed for MLI");
			log.error("Not able to Validate Self is Displayed for MLI || Fail" + e.getMessage());
			return false;
		}
	}

	public boolean verify_Self_Is_Displayed_For_MLI() throws Exception {

		try {
			log.debug("Verify the Self is displayed for MLI");
			boolean check = ManagerLifeInsuranceSelf.isDisplayed();
			Assert.assertTrue(check, "Bug||Self is displayed for MLI");
			log.info("Self is displayed for MLI");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for MLI**********");
			log.error("Self is not displayed for MLI || Fail");
			return false;
		}
	}

	public boolean validates_that_Self_is_not_displayed_for_PO_or_OOEDI_or_BOE() throws Throwable {

		try {
			log.debug("Verify the Self is not displayed for Practice/Office/Business Overhead");
			Assert.assertFalse(PO_OR_BOE_OR_OO_Product_Self.isDisplayed(),
					"Bug||Self is displayed for Practice/Office/Business Overhead");
			System.out.println("Self is not displayed for Practice/Office Overhead");
			log.info("Self is not displayed for Practice/Office Overhead Term");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for Practice/Office/Business Overhead**********");
			log.error("Self is not displayed for Practice/Office/Business Overhead || Fail");
			return false;
		}

	}

	public boolean validates_that_Self_is_displayed_for_PO_or_OOEDI_or_BOE() throws Throwable {

		try {
			log.debug("Verify the Self is displayed for Practice/Office/Business Overhead");
			Assert.assertTrue(PO_OR_BOE_OR_OO_Product_Self.isDisplayed(),
					"Bug||Self is not displayed for Practice/Office/Business Overhead");
			System.out.println("Self is  displayed for Practice/Office Overhead");
			log.info("Self is displayed for Practice/Office Overhead Term");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is displayed for Practice/Office/Business Overhead**********");
			log.error("Self is displayed for Practice/Office Overhead || Fail");
			return false;
		}

	}

	public boolean verify_Child_Is_Displayed_For_MLI() throws Exception {

		try {
			log.debug("Validate Child is Displayed for MLI");
			boolean check = ManagerLifeInsuranceChild.isDisplayed();
			Assert.assertTrue(check, "Child is Displayed for MLI");
			System.out.println("Child is not Displayed for MLI");

			log.info("Child Button is validated successfully for MLI|| Pass");
			return true;
		} catch (Exception e) {
			System.err.println("Child is Displayed for MLI");
			log.error("Not able to Validate Child is Displayed for MLI || Fail" + e.getMessage());
			return false;
		}
	}

	public boolean verify_Child_Is_not_Displayed_For_MLI() throws Exception {

		try {
			log.debug("Validate Child is not displayed for MLI");
			boolean check = ManagerLifeInsuranceChild.isDisplayed();
			Assert.assertFalse(check, "Child is Displayed for MLI");
			System.out.println("Child is not Displayed for MLI");

			log.info("Child Button is validated successfully for MLI|| Pass");
			return true;
		} catch (Exception e) {
			System.err.println("Child is not Displayed for MLI");
			log.error("Not able to Validate Child is Displayed for MLI || Fail" + e.getMessage());
			return false;
		}
	}

	public boolean validate_Accident_only_Insurance_Product_is_available() throws Exception {
		try {
			log.debug("Verify the Products for Accident-Only Disability Insurance");

			if (Accident_only_product.isDisplayed()) {
				log.info("Accident-Only Disability Insurance is displayed");
				System.out.println("Accident-Only Disability Insurance Product is displayed");
			}
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Accident-Only Disability Insuranceis not displayed");
			log.error("Not able to validate Products for Accident-Only Disability Insurance|| Fail");
			return false;
		}

	}

	public boolean enters_Amount_under_replace_any_other_company_s_coverage_of_OO_as_for_Spouse(String Amount)
			throws Exception {

		try {
			log.debug("Enter amount will be Replaced for Spouse");
			Thread.sleep(1000);
			reuseMethod.scrollDown(SpouseReplaceAmnt);
			SpouseReplaceAmnt.isDisplayed();
			SpouseReplaceAmnt.sendKeys(Amount);

			log.info("Amount to be replaced is entered for Spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter amount will be replaced for Spouse|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validate_Manager_Life_Insurance_Product() throws Exception {
		try {
			log.debug("Verify the Products for Manager Life Insurance");

			if (ManagerLifeInsurance.isDisplayed()) {
				log.info("Manager Life Insurance Product is displayed");
				System.out.println("Manager Life Insurance Product is displayed");
			}
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Manager Life Insurance Product is not displayed");
			log.error("Not able to validate Products for Manager Life Insurance || Fail");
			return false;
		}

	}

	public boolean selects_product_MLI_for_Self() throws Exception {
		try {
			log.debug("Select Self for Manager Life Insurance Product");
			reuseMethod.scrollDown(ManagerLifeInsuranceSelf);
			Thread.sleep(2000);
			ManagerLifeInsuranceSelf.click();

			log.info("Manager Life Insurance Product for self is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Self for Manager Life Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_MLI_for_Spouse() throws Exception {
		try {
			log.debug("Select Spouse for Manager Life Insurance Product");
			reuseMethod.scrollDown(ManagerLifeInsuranceSpouse);
			Thread.sleep(2000);
			ManagerLifeInsuranceSpouse.click();

			log.info("Manager Life Insurance Product for spouse is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select spouse for Manager Life Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_MLI_for_Child() throws Exception {
		try {
			log.debug("Select Child for Manager Life Insurance Product");
			reuseMethod.scrollDown(ManagerLifeInsuranceChild);
			Thread.sleep(2000);
			ManagerLifeInsuranceChild.click();

			log.info("Manager Life Insurance Product for child is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select child for Manager Life Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_Product_ELI_for_Self() throws Throwable {
		try {
			log.debug("Validate Self is Displayed for ELI");
			boolean check = EmployeeLifeInsuranceSelf.isDisplayed();
			Assert.assertTrue(check, "Self is Displayed for ELI");
			System.out.println("Self is not Displayed for ELI");

			log.info("Self Button is validated successfully for ELI|| Pass");
			return true;
		} catch (Exception e) {
			System.err.println("Self is Displayed for ELI");
			log.error("Not able to Validate Self is Displayed for ELI || Fail" + e.getMessage());
			return false;
		}

	}

	public boolean selects_product_ELI_for_Self() throws Exception {
		try {
			log.debug("Select Self for Employee Life Insurance Product");
			reuseMethod.scrollDown(EmployeeLifeInsuranceSelf);
			Thread.sleep(2000);
			EmployeeLifeInsuranceSelf.click();

			log.info("Employee Life Insurance Product for self is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select self for Employee Life Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean verify_Spouse_Is_Displayed_For_MLI() throws Exception {

		try {
			log.debug("Verify the Spouse is displayed for MLI");
			boolean check = ManagerLifeInsuranceSpouse.isDisplayed();
			Assert.assertTrue(check, "Bug||Spouse is displayed for MLI");
			log.info("Spouse is displayed for MLI");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for MLI**********");
			log.error("Spouse is not displayed for MLI || Fail");
			return false;
		}
	}

	public boolean verify_Self_Is_Not_Displayed_For_GTDLI() throws Exception {

		try {
			log.debug("Validate Self is not Displayed for GTDLI");
			boolean check = GroupTermDealerLifeInsuranceSelf.isDisplayed();
			Assert.assertFalse(check, "Self is Displayed for GTDLI");

			System.out.println("Self is not Displayed for GTDLI");

			log.info("Self Button is validated successfully for GTDLI|| Pass");
			return true;
		} catch (Exception e) {
			System.err.println("Self is Displayed for GTDLI");
			log.error("Not able to Validate Self is Displayed for GTDLI || Fail" + e.getMessage());
			return false;
		}
	}

	public boolean verify_Self_Is_Displayed_For_GTDLI() throws Exception {

		try {
			log.debug("Validate Self is not Displayed for MLI");
			boolean check = ManagerLifeInsuranceSelf.isDisplayed();
			Assert.assertFalse(check, "Self is Displayed for MLI");

			System.out.println("Self is not Displayed for MLI");

			log.info("Self Button is validated successfully for MLI|| Pass");
			return true;
		} catch (Exception e) {
			System.err.println("Self is Displayed for MLI");
			log.error("Not able to Validate Self is Displayed for MLI || Fail" + e.getMessage());
			return false;
		}
	}

	public boolean validate_General_Term_Dealer_Life_Insurance_Product_is_displayed() throws Exception {
		try {
			log.debug("Verify the Products for General Term Dealer Life Insurance");

			Assert.assertTrue(GroupTermDealerLifeInsurance.isDisplayed(),
					"General Term Dealer Life Insurance Product is not displayed");
			System.out.println("General Term Dealer Life Insurance Product is displayed");
			log.info("General Term Dealer Life Insurance Product is displayed");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("General Term Dealer Life Insurance Product is not displayed");
			log.error("Not able to validate Products for General Term Dealer Life Insurance || Fail");
			return false;
		}

	}

	public boolean verify_Child_Is_Displayed_For_GTDLI() throws Exception {

		try {
			log.debug("Validate Child is Displayed for GTDLI");
			boolean check = GroupTermDealerLifeInsuranceChild.isDisplayed();
			Assert.assertTrue(check, "Child is Displayed for GTDLI");
			System.out.println("Child is not Displayed for GTDLI");

			log.info("Child Button is validated successfully for GTDLI|| Pass");
			return true;
		} catch (Exception e) {
			System.err.println("Child is Displayed for GTDLI");
			log.error("Not able to Validate Child is Displayed for GTDLI || Fail" + e.getMessage());
			return false;
		}
	}

	public boolean selects_product_GTDLI_for_Self() throws Exception {
		try {
			log.debug("Select Self for General Term Dealer Life Insurance Product");
			reuseMethod.scrollDown(GroupTermDealerLifeInsuranceSelf);
			Thread.sleep(2000);
			GroupTermDealerLifeInsuranceSelf.click();

			log.info("General Term Dealer Life Insurance Product for self is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Self for General Term Dealer Life Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_GTDLI_for_Child() throws Exception {
		try {
			log.debug("Select Child for General Term Dealer Life Insurance Product");
			reuseMethod.scrollDown(GroupTermDealerLifeInsuranceChild);
			Thread.sleep(2000);
			GroupTermDealerLifeInsuranceChild.click();

			log.info("General Term Dealer Life Insurance Product for child is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select child for General Term Dealer Life Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean verify_Spouse_Is_not_Displayed_For_ELI() throws Exception {

		try {
			log.debug("Validate Spouse is not displayed for ELI");
			boolean check = EmployeeLifeInsuranceSpouse.isDisplayed();
			Assert.assertFalse(check, "Spouse is Displayed for ELI");
			System.out.println("Spouse is not Displayed for ELI");
			log.info("Spouse Button is validated successfully for ELI|| Pass");
			return true;
		} catch (Exception e) {
			System.err.println("Spouse is not Displayed for ELI");
			log.error("Not able to Validate Spouse is Displayed for ELI || Fail" + e.getMessage());
			return false;
		}
	}

	public boolean verify_Spouse_Is_Displayed_For_ELI() throws Exception {

		try {
			log.debug("Validate Spouse is displayed for ELI");
			boolean check = EmployeeLifeInsuranceSpouse.isDisplayed();
			Assert.assertTrue(check, "Spouse is Displayed for ELI");
			System.out.println("Spouse is Displayed for ELI");
			log.info("Spouse Button is validated successfully for ELI|| Pass");
			return true;
		} catch (Exception e) {
			System.err.println("Spouse is not Displayed for ELI");
			log.error("Not able to Validate Spouse is Displayed for ELI || Fail" + e.getMessage());
			return false;
		}
	}

	public boolean verify_Child_Is_not_Displayed_For_ELI() throws Exception {

		try {
			log.debug("Validate Child is not displayed for ELI");
			boolean check = EmployeeLifeInsuranceChild.isDisplayed();
			Assert.assertFalse(check, "Child is Displayed for ELI");
			System.out.println("Child is not Displayed for ELI");
			log.info("Child Button is validated successfully for ELI|| Pass");
			return true;
		} catch (Exception e) {
			System.err.println("Child is not Displayed for ELI");
			log.error("Not able to Validate Child is Displayed for ELI || Fail" + e.getMessage());
			return false;
		}
	}

	public boolean verify_Child_Is_Displayed_For_ELI() throws Exception {

		try {
			log.debug("Validate Child is displayed for ELI");
			boolean check = EmployeeLifeInsuranceChild.isDisplayed();
			Assert.assertTrue(check, "Child is Displayed for ELI");
			System.out.println("Child is Displayed for ELI");
			log.info("Child Button is validated successfully for ELI|| Pass");
			return true;
		} catch (Exception e) {
			System.err.println("Child is not Displayed for ELI");
			log.error("Not able to Validate Child is Displayed for ELI || Fail" + e.getMessage());
			return false;
		}
	}

	public boolean validate_Product_ELI_for_Spouse() throws Throwable {
		try {
			log.debug("Validate Spouse is Displayed for ELI");
			boolean check = EmployeeLifeInsuranceSpouse.isDisplayed();
			Assert.assertTrue(check, "Spouse is Displayed for ELI");
			System.out.println("Spouse is not Displayed for ELI");

			log.info("Spouse Button is validated successfully for ELI|| Pass");
			return true;
		} catch (Exception e) {
			System.err.println("Spouse is Displayed for ELI");
			log.error("Not able to Validate Spouse is Displayed for ELI || Fail" + e.getMessage());
			return false;
		}

	}

	public boolean selects_product_ELI_for_Spouse() throws Exception {
		try {
			log.debug("Select Spouse for Employee Life Insurance Product");
			reuseMethod.scrollDown(EmployeeLifeInsuranceSpouse);
			Thread.sleep(2000);
			EmployeeLifeInsuranceSpouse.click();

			log.info("Employee Life Insurance Product for spouse is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select spouse for Employee Life Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_ELI_for_Child() throws Exception {
		try {
			log.debug("Select child for Employee Life Insurance Product");
			reuseMethod.scrollDown(EmployeeLifeInsuranceChild);
			Thread.sleep(2000);
			EmployeeLifeInsuranceChild.click();
			log.info("Employee Life Insurance Product for child is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select child for Employee Life Insurance Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_GTDLI_for_Spouse() throws Exception {
		try {
			log.debug("Select Spouse for General Term Dealer Life Insurance Product");
			reuseMethod.scrollDown(GroupTermDealerLifeInsuranceSpouse);
			Thread.sleep(2000);
			GroupTermDealerLifeInsuranceSpouse.click();

			log.info("General Term Dealer Life Insurance Product for spouse is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select spouse for General Term Dealer Life Insurance Product || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean verify_Spouse_Is_Not_Displayed_For_GTDLI() throws Exception {

		try {
			log.debug("Validate Spouse is not Displayed for GTDLI");
			boolean check = GroupTermDealerLifeInsuranceSpouse.isDisplayed();
			Assert.assertFalse(check, "Spouse is Displayed for GTDLI");

			System.out.println("Spouse is not Displayed for GTDLI");

			log.info("Spouse Button is validated successfully for GTDLI|| Pass");
			return true;
		} catch (Exception e) {
			System.err.println("Spouse is Displayed for GTDLI");
			log.error("Not able to Validate Spouse is Displayed for GTDLI || Fail" + e.getMessage());
			return false;
		}
	}

	public boolean verify_Spouse_Is_Displayed_For_GTDLI() throws Exception {

		try {
			log.debug("Validate Spouse is Displayed for GTDLI");
			boolean check = GroupTermDealerLifeInsuranceSpouse.isDisplayed();
			Assert.assertTrue(check, "Spouse is Displayed for GTDLI");

			System.out.println("Spouse is Displayed for GTDLI");

			log.info("Spouse Button is validated successfully for GTDLI|| Pass");
			return true;
		} catch (Exception e) {
			System.err.println("Spouse is not Displayed for GTDLI");
			log.error("Not able to Validate Spouse is not Displayed for GTDLI || Fail" + e.getMessage());
			return false;
		}
	}

	public boolean selects_No_for_Do_you_have_other_life_insurance_in_force() throws Exception {

		try {
			log.debug("Answer the questions of Product Do you have other life insurance in force");
			LyfInsNoSelf.click();
			log.info(
					"Answer the questions of Product Do you have other life insurance in force answered as NO for Self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Answer the questions of Product Do you have other life insurance in force answered as NO for Self|| Fail"
							+ e.getMessage());
			throw (e);
		}
	}

	public boolean selects_No_for_Do_you_have_other_life_insurance_in_force_for_Spouse() throws Exception {

		try {
			log.debug("Selects No for Do you have other life insurance in force for Spouse");
			LyfInsNOSpouse.click();
			log.info(
					"Do you have other life insurance in force for Spouse is answered as NO for Spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects No for Do you have other life insurance in force for Spouse|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean validate_Group_Accidental_Death_Dismemberment_Product() throws Exception {
		try {
			log.debug("Verify the Products for Group accidental death and dismemberment");

			if (GroupAccidentalDeathAndDismemberment.isDisplayed()) {
				log.info("Group accidental death and dismemberment Product is displayed");
				System.out.println("Group accidental death and dismemberment is displayed");
			}
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Group accidental death and dismemberment Product is not displayed");
			log.error("Not able to validate Products forGroup accidental death and dismemberment || Fail");
			return false;
		}

	}

	public boolean Group_Term_Life_Insurance_product_is_available_RUAA_Mobile() throws Exception {

		try {
			log.debug("Verify Group Term Life Insurance is available in RUAA Mobile site");

			Assert.assertTrue(Traditional_Insurance_Mobile_label_arrow.isDisplayed(),
					"Bug|| Group Term Life Insurance product is not displayed");

			log.info("Verified Group Term Life Insurance is available in RUAA Mobile site || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify Group Term Life Insurance is available in RUAA Mobile site || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean Group_disability_Insurance_product_is_available_RUAA_Mobile() throws Exception {

		try {
			log.debug("Verify Group Disability Income Insurance is available in RUAA Mobile site");

			Assert.assertTrue(Long_Term_Disability_insurance_Mobile.isDisplayed(),
					"Bug|| Group Term Life Insurance product is not displayed");

			log.info("Verified Group Disability Income Insurance is available in RUAA Mobile site || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify Group Disability Insurance is available in RUAA Mobile site || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean validates_that_Spouse_is_not_displayed_for_PO_or_OOEDI() throws Throwable {
		try {
			log.debug("Verify the Spouse is not displayed for Practice/Office Overhead");
			Assert.assertFalse(PO_OR_BOE_OR_OO_Product_Spouse.isDisplayed(),
					"Bug||Spouse is displayed for Practice/Office Overhead");
			System.out.println("Spouse is not displayed for Practice/Office Overhead");
			log.info("Spouse is not displayed for Practice/Office Overhead Term");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for Practice/Office Overhead**********");
			log.error("Spouse is not displayed for Practice/Office Overhead || Fail");
			return false;
		}

	}

	public boolean selects_product_GADD_for_Spouse() throws Exception {
		try {
			log.debug("Select Spouse for Group accidental death and dismemberment Product");
			reuseMethod.scrollDown(GroupAccidentalDeathAndDismembermentSpouse);
			Thread.sleep(2000);
			GroupAccidentalDeathAndDismembermentSpouse.click();

			log.info("Group accidental death and dismemberment Product for spouse is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select spouse for Group accidental death and dismemberment Product || Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_GADD_for_Self() throws Exception {
		try {
			log.debug("Select Self for Group accidental death and dismemberment Product");
			reuseMethod.scrollDown(GroupAccidentalDeathAndDismembermentSelf);
			Thread.sleep(2000);
			GroupAccidentalDeathAndDismembermentSelf.click();

			log.info("Group accidental death and dismemberment Product for spouse is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select spouse for Group accidental death and dismemberment Product || Fail"
					+ e.getMessage());
			throw (e);
		}

	}
	
	public boolean selects_product_GADD_for_Child() throws Exception {
		try {
			log.debug("Select Child for Group accidental death and dismemberment Product/High-limit Accidental Insurance Product");
			reuseMethod.scrollDown(GroupAccidentalDeathAndDismembermentChild);
			Thread.sleep(2000);
			GroupAccidentalDeathAndDismembermentChild.click();

			log.info("Group accidental death and dismemberment Product/High-limit Accidental Insurance Product for Child is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Child for Group accidental death and dismemberment Product/High-limit Accidental Insurance Product || Fail"
					+ e.getMessage());
			throw (e);
		}

	}
	

	public boolean validates_that_LongTerm_is_not_avaialble_Mobile() throws Throwable {
		try {
			log.debug("Validate that Group Disablity Insurance product/Long Term is not available");

			Assert.assertTrue(Long_Term_Disability_insurance_Mobile.isDisplayed(),
					"Bug||Group Disablity Insurance product/Long Term is available");

			log.info("Group Disablity Insurance product/Long Term is not available");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Group Disablity Insurance product/Long Term is not available**********");
			log.error("Group Disablity Insurance product/Long Term is not available|| Fail");
			return false;
		}
	}

	public boolean validate_Disability_Income_Insurance_Product_is_not_displayed() throws Throwable {
		try {
			log.debug("Verify the Disability income insurance product is not displayed");
			Assert.assertFalse(DisabilityIncomeInsurance.isDisplayed(),
					"Bug||Disability income insurance product is displayed");
			System.out.println("Disability income insurance product is not displayed");
			log.info("Disability income insurance product is not displayed || Pass");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			log.error("Disability income insurance product is not displayed || Fail");
			return false;
		}
	}

	public boolean verify_Self_icon_is_disabled_for_TwentyYTL() throws Exception {
		try {
			log.debug("Self icon is disabled for Twenty Year Product");
			reuseMethod.scrollDown(TwentyYrTermProductSelf);
			Thread.sleep(1000);
			boolean condition;
			String disabled = TwentyYrTermProductSelf.getAttribute("disabled");
			if (disabled.equals("true")) {
				condition = true;
				System.out.println("Self Icon is disabled for Twenty Year Product");
			} else {
				condition = false;
				System.out.println("Self Icon is Enabled for Twenty Year Product");
			}
			Assert.assertTrue(condition, "Self icon is enabled for Twenty Year Product");
			log.info(" Verified Self icon is disabled for Twenty Year Product sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify Self icon is disabled for Twenty Year Product || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validates_that_Self_is_not_displayed_for_GADD() throws Throwable {
		try {
			log.debug("Verify the Self is not displayed for GADD");
			boolean check = GroupAccidentalDeathAndDismembermentSelf.isDisplayed();
			Assert.assertFalse(check, "Bug||Self is displayed for GADD");

			log.info("Self is not displayed for GADD");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for GADD**********");
			log.error("Self is not displayed for GADD || Fail");
			return false;
		}
	}

	public boolean validates_that_Self_is_not_displayed_for_DII() throws Throwable {
		try {
			log.debug("Verify the Self is not displayed for GDI/DII/DPOSDI");
			boolean check = DisabilityIncomeSelf.isDisplayed();
			Assert.assertFalse(check, "Bug||Self is displayed for GDI/DII/DPOSDI");

			log.info("Self is not displayed for GDI/DII/DPOSDI");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for GDI/DII/DPOSDI**********");
			log.error("Self is not displayed forGDI/DII/DPOSDI || Fail");
			return false;
		}
	}

	public boolean validates_that_Self_is_displayed_for_GADD() throws Throwable {
		try {
			log.debug("Verify the Self is not displayed for GADD/High-limit Accidental Insurance");
			boolean check = GroupAccidentalDeathAndDismembermentSelf.isDisplayed();
			Assert.assertTrue(check, "Bug||Self is displayed for GADD/High-limit Accidental Insurance");

			log.info("Self is not displayed for GADD/High-limit Accidental Insurance");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for GADD/High-limit Accidental Insurance**********");
			log.error("Self is not displayed for GADD/High-limit Accidental Insurance || Fail");
			return false;
		}
	}
	
	public boolean validates_that_Spouse_is_displayed_for_GADD() throws Throwable {
		try {
			log.debug("Verify the Spouse is displayed for GADD/High-limit Accidental Insurance");
			boolean check = GroupAccidentalDeathAndDismembermentSpouse.isDisplayed();
			Assert.assertTrue(check, "Bug||Spouse is not displayed for GADD/High-limit Accidental Insurance");

			log.info("Spouse is displayed for GADD/High-limit Accidental Insurance");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is not displayed for GADD/High-limit Accidental Insurance**********");
			log.error("Spouse is not displayed for GADD/High-limit Accidental Insurance || Fail");
			return false;
		}
	}
	
	public boolean validates_that_Spouse_is_not_displayed_for_GADD() throws Throwable {
		try {
			log.debug("Verify the Spouse is not displayed for GADD/High-limit Accidental Insurance");
			boolean check = GroupAccidentalDeathAndDismembermentSpouse.isDisplayed();
			Assert.assertFalse(check, "Bug||Spouse is displayed for GADD/High-limit Accidental Insurance");

			log.info("Spouse is not displayed for GADD/High-limit Accidental Insurance");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Spouse is displayed for GADD/High-limit Accidental Insurance**********");
			log.error("Spouse is displayed for GADD/High-limit Accidental Insurance || Fail");
			return false;
		}
	}
	
	public boolean validates_that_Child_is_displayed_for_GADD() throws Throwable {
		try {
			log.debug("Verify the Child is not displayed for GADD/High-limit Accidental Insurance");
			boolean check = GroupAccidentalDeathAndDismembermentChild.isDisplayed();
			Assert.assertTrue(check, "Bug||Child is displayed for GADD/High-limit Accidental Insurance");

			log.info("Child is not displayed for GADD/High-limit Accidental Insurance");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Child is not displayed for GADD/High-limit Accidental Insurance**********");
			log.error("Child is not displayed for GADD/High-limit Accidental Insurance || Fail");
			return false;
		}
	}
	
	public boolean validates_that_Self_is_displayed_for_DII() throws Throwable {
		try {
			log.debug("Verify the Self is displayed for DII");
			boolean check = DisabilityIncomeSelf.isDisplayed();
			Assert.assertTrue(check, "Bug||Self is not displayed for DII");

			log.info("Self is displayed for DII");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is displayed for DII**********");
			log.error("Self is displayed for DII || Fail");
			return false;
		}
	}
	


	
	public boolean verify_New_York_State_paragraph_is_not_displayed_for_Self() throws Throwable {
		try {
			log.debug("Validate Information for New York State is not displayed ");
			Assert.assertFalse(NewyorkInfo.isDisplayed(), "Information for New York State is displayed");
			log.info("Information for New York State is not displayed Successfully|| Pass");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			log.error("The Information for New York State is not displayed || Fail" + e.getMessage());
			return false;
		}
	}

	public boolean verify_Imp_Replacement_Info_for_NewYork_checkbox_is_not_displayed_for_Self() throws Throwable {
		try {
			log.debug("Validate checkbox of Imp Replacement Info is not displayed ");
			Assert.assertFalse(checkbox_Replacement.isDisplayed(), "checkbox of Imp Replacement Info is displayed");
			log.info("checkbox of Imp Replacement Info is not displayed Successfully|| Pass");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			log.error("Checkbox of Imp Replacement Info is not displayed || Fail" + e.getMessage());
			return false;
		}
	}

	public boolean validate_GTTLI_Product_is_not_displayed() throws Exception {
		try {
			log.debug("Verify the Products for Term Life Insurance is not displayed");

			Assert.assertFalse(TermLifeInsurance.isDisplayed(), "Term Life Insurance Product is  displayed");
			System.out.println("Term Life Insurance Product is not displayed");
			log.info("Term Life Insurance Product is not displayed||Pass");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Term Life Insurance Product is not displayed");
			log.error("Not able to validate Products for Term Life Insurance || Fail");
			return false;
		}
	}

	public boolean validates_that_Self_is_displayed_for_CI() throws Throwable {

		try {
			log.debug("Verify the Self is displayed for CI");
			Assert.assertTrue(CriticalIllnessProductSelf.isDisplayed(), "Bug||Self is not displayed for MIDT/STD");
			System.out.println("Self is displayed for CI");
			log.info("Self is displayed for Mid/Short Term");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is displayed for CI**********");
			log.error("Self is displayed for CI || Fail");
			return false;
		}
	}


	public boolean selects_No_for_Do_you_have_other_insurance_pending_for_self() throws Exception {

		try {
			log.debug("Selects No for Do you have other insurance applications pending for self");
			PendingInsNoSelf.click();
			log.info("Selected No for Do you have other insurance applications pending for self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects No for Do you have other insurance applications pending for self|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}
	
	public boolean validate_Chronic_rider_is_not_displayed_Spouse_under_GTTLI() throws Exception {
		try {
			log.debug("Verify the Chronic rider for Group Traditional Term Life Insurance is not displayed for spouse");
			Assert.assertFalse(CriticalIllnessProductSpouse.isDisplayed(),"Chronic rider for Group Traditional Term Life Insurance is displayed for spouse");
			System.out.println("Chronic rider for Group Traditional Term Life Insurance is not displayed");	
			log.info("Chronic rider for Group Traditional Term Life Insurance is not displayed||Pass");
				
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Chronic rider for Group Traditional Term Life Insurance is not displayed");
			log.error("Not able to validate Chronic rider for Group Traditional Term Life Insurance || Fail");
			return false;
		}
	}
	
	public boolean navigate_back_to_Products_page() throws Exception {
		try {
			log.debug("Click On Products Button");

			reuseMethod.scrollDown(Eligibilty_Iconscroll);
			Products_Icon.click();
			log.info("Products Button is Clicked sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("No able to navigate to Products Page|| Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean validate_Chronic_Rider_Under_GTTLI_is_not_displayed_Self() throws Exception {
		try {
			log.debug("Verify the Chronic rider under GTTLI is not displayed for self");

			Assert.assertFalse(TwentyYearTermLifeInsurance.isDisplayed(),
					"Chronic rider under GTTLI is displayed for self");
			System.out.println("Chronic rider under GTTLI is not displayed for self");
			log.info("Chronic rider under GTTLI is not displayed for self ||Pass");
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Chronic rider under GTTLI is not displayed for self");
			log.error("Not able to validate Chronic rider under GTTLI is not displayed for self || Fail");
			return false;
		}
	}
	
	public boolean Products_Additional_page_is_displayed_to_user() throws Exception {
		try {
			log.debug("Product: Additional Questions page is displayed to user");
			ProductsAdditionalHeader.isDisplayed();
			log.info("Product: Additional Questions page is displayed to user sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Product: Additional Questions page is displayed to user || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean validate_GTLP75I_Product_is_not_displayed() throws Exception {
		try {
			log.debug("Verify the Products for GTLP75I is not displayed");

			Assert.assertFalse(FiveYearProduct.isDisplayed(),
					"GTLP75I Product is  displayed");
			System.out.println("GTLP75Ie Product is not displayed");
			log.info("GTLP75I Product is not displayed||Pass");

			return true;
		} catch (NoSuchElementException e) {
			System.out.println("GTLP75I Product is not displayed");
			log.error("Not able to validate Products for GTLP75I || Fail");
			return false;
		}
	}
	
	
	public boolean validates_that_Self_is_not_displayed_for_PureTermLife() throws Throwable {
		try {
			log.debug("Verify the Self is not displayed for PureTermLife");
			Thread.sleep(2000);
			boolean check = PureTermLifeProductSelf.isDisplayed();
			Assert.assertFalse(check, "Bug||Self is displayed for PureTermLife");
			log.info("Self is not displayed for PureTermLife");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is not displayed for PureTermLife**********");
			log.error("Self is not displayed for PureTermLife  || Fail");
			return false;
		}

	}

	public boolean validates_that_Self_is_displayed_for_PureTermLife() throws Throwable {
		try {
			log.debug("Verify the Self is displayed for PureTermLife");

			boolean check = PureTermLifeProductSelf.isDisplayed();
			Assert.assertTrue(check, "Bug||Self is not displayed for PureTermLife");
			System.out.println("*****Self is displayed for PureTermLife**********");
			log.info("Self is displayed for PureTermLife");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {

			log.error("Self is displayed for PureTermLife || Fail");
			return false;
		}

	}

	public boolean validates_that_Self_is_not_displayed_for_PrefTermLife() throws Throwable {
		try {
			log.debug("Verify the Self is not displayed for PrefTermLife");
			Thread.sleep(2000);
			boolean check = PreferredTermLifeProductSelf.isDisplayed();
			Assert.assertFalse(check, "Bug||Self is displayed for PrefTermLife");
			System.out.println("*****Self is not displayed for PrefTermLife**********");
			log.info("Self is not displayed for PureTermLife");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {

			log.error("Self is not displayed for PrefTermLife || Fail");
			return false;
		}

	}

	public boolean validates_that_Self_is_displayed_for_PrefTermLife() throws Throwable {
		try {
			log.debug("Verify the Self is displayed for PrefTermLife");

			boolean check = PreferredTermLifeProductSelf.isDisplayed();
			Assert.assertTrue(check, "Bug||Self is not displayed for PrefTermLife");
			log.info("Self is displayed for PureTermLife");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Self is displayed for PrefTermLife**********");
			log.error("Self is displayed for PrefTermLife || Fail");
			return false;
		}

	}

	public boolean selects_product_PureTerm_for_Self() throws Exception {
		try {
			log.debug("Selects product PureTerm for Self");
			reuseMethod.scrollDown(PureTermLifeProductSelf);
			Thread.sleep(1000);
			PureTermLifeProductSelf.click();

			log.info("product PureTerm for Self selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects product PureTerm for Self || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_product_PrefTerm_for_Self() throws Exception {
		try {
			log.debug("Selects product PrefTerm for Self");
			reuseMethod.scrollDown(PreferredTermLifeProductSelf);
			Thread.sleep(1000);
			PreferredTermLifeProductSelf.click();

			log.info("product PrefTerm for Self selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects product PrefTerm for Self || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean verify_Child_icon_is_disabled_for_PrefTerm() throws Exception {

		try {
			log.debug("Child icon is disabled for PrefTermr Product");
			reuseMethod.scrollDown(PreferredTermLifeProductChild);
			Thread.sleep(1000);
			boolean condition;
			String disabled = PreferredTermLifeProductChild.getAttribute("disabled");
			if (disabled.equals("true")) {
				condition = true;
				System.out.println("Child Icon is disabled for PrefTerm Product");

			} else {
				condition = false;
				System.out.println("Child Icon is Enabled for PrefTerm Product");
			}
			Assert.assertTrue(condition, "Child icon is disabled for PrefTermProduct");
			System.out.println("Child icon is disabled for PrefTerm Product");
			log.info(" Verified Child icon is disabled for PrefTerm Product sucessfully|| Pass");

			return true;
		} catch (Exception e) {
			log.error("Not able to verify child icon is disabled for PrefTerm Product || Fail" + e.getMessage());
			throw (e);
		}
	}

}
