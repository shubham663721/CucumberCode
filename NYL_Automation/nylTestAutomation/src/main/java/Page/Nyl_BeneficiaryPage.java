package Page;

import static org.testng.Assert.assertFalse;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
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
import Utility.propertyUtility;

public class Nyl_BeneficiaryPage extends SetUp {

	public WebDriver driver = getDriver();

	private final Logger log = LogManager.getLogger(Nyl_BeneficiaryPage.class.getName());

	public Nyl_BeneficiaryPage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	ReuseableMethod reuseMethod = new ReuseableMethod();
	ScreenShotUtility screenShotUtility = new ScreenShotUtility();

	propertyUtility PropertyUtility = new propertyUtility();

	@FindBy(id = "skipBeneficiaries")
	WebElement SkipBeneficiaries;

	@FindBy(xpath = "//div[@id='beneficiariesTab']//label[contains(text(),'Beneficiary')]")
	WebElement beneficiariesPage;
	
	@FindBy(xpath = "//div[@class='PA-15 confirmationMsg' and contains(text(),'If you skip, you will lose information on the page. Do you want to proceed with next button click?')]")
	WebElement SkipBeneDeleteText;

	@FindBy(xpath = "//span[@class='add-btn-txt']")
	WebElement AddBenefiary;

	@FindBy(xpath = "//button[@id='addBenefSlf']//following::span[@class='add-btn-txt']")
	WebElement AddBeneficiary_Self;

	@FindBy(xpath = "//button[@id='addBenefSps']")
	WebElement addBaneficiary_Spouse;

	@FindBy(xpath = "//button[@id='addBenefSps']//following::span[@class='add-btn-txt']")
	WebElement AddBeneficiary_Spouse;

	@FindBy(xpath = "//div[@data-fields='lblhdrbenLIFiveYr']")
	WebElement GroupTermLifeLabel;

	@FindBy(xpath = "//div[@data-fields='benLIFiveYrSlf']//button[@id='addBenefSlf']/span[@class='add-btn-txt']")
	WebElement AddBeneButtonGroupTerm_Self;
	
	@FindBy(xpath = "//div[@data-fields='benLIFiftyYrSlf']//button[@id='addBenefSlf']/span[@class='add-btn-txt']")
	WebElement AddBeneButtonGroupTerm_Life50;
	
	@FindBy(xpath = "//div[@data-fields='benADOnlyAccidntDthOnlySlf']//button[@id='addBenefSlf']/span[@class='add-btn-txt']")
	WebElement AddBeneButtonGroupTerm_ACCDeath;

	@FindBy(xpath = "//div[@data-fields='benLIFiveYrSps']//button[@id='addBenefSps']/span[@class='add-btn-txt']")
	WebElement AddBeneButtonGroupTerm_Spouse;

	@FindBy(xpath = "//label[starts-with(text(),'Term Life Insurance')or starts-with (text(),'Group Term Life') or starts-with (text(),'Traditional')or starts-with (text(),'Annual Renewable')]")
	WebElement TermLifeInsurance;

	@FindBy(xpath = "//div[@data-fields='benLIAnnualSlf']//button[@id='addBenefSlf']/span[@class='add-btn-txt']")
	WebElement AddBeneButtonTermLife_Self;

	@FindBy(xpath = "//div[@data-fields='benLIAnnualSps']//button[@id='addBenefSps']/span[@class='add-btn-txt']")
	WebElement AddBeneButtonTermLife_Spouse;

	@FindBy(xpath = "//div[@data-fields='lblhdrbenLITenYr']")
	WebElement TenYearLabel;

	@FindBy(xpath = "//div[@data-fields='lblhdrbenLITwentyYr']")
	WebElement TwentyYearLabel;

	@FindBy(xpath = "//div[@data-fields='benLITenYrSlf']//button[@id='addBenefSlf']/span[@class='add-btn-txt']")
	WebElement AddBeneButtonTenYear_Self;

	@FindBy(xpath = "//div[@data-fields='benLITenYrSps']//button[@id='addBenefSps']/span[@class='add-btn-txt']")
	WebElement AddBeneButtonTenYear_Spouse;

	@FindBy(xpath = "//div[@data-fields='benLITwentyYrSlf']//button[@id='addBenefSlf']/span[@class='add-btn-txt']")
	WebElement AddBeneButtonTwentyYear_Self;

	@FindBy(xpath = "//div[@data-fields='benLITwentyYrSps']//button[@id='addBenefSps']/span[@class='add-btn-txt']")
	WebElement AddBeneButtonTwentyYear_Spouse;
	
	@FindBy(xpath = "//div[@data-fields='benLIFifteenYrSlf']//button[@id='addBenefSlf']/span[@class='add-btn-txt']")
	WebElement AddBeneButtonFifteenYTL_Self;

	@FindBy(xpath = "//div[@data-fields='benLIFifteenYrSps']//button[@id='addBenefSps']/span[@class='add-btn-txt']")
	WebElement AddBeneButtonFifteenYTL_Spouse;

	@FindBy(xpath = "//div[@data-fields='benAccdntDeathSlf']//button[@id='addBenefSlf']/span[@class='add-btn-txt']")
	WebElement AddBeneButtonADD_Self;

	@FindBy(xpath = "//div[@data-fields='benAccdntDeathSlf']//button[@id='addBenefSlf']/span[@class='add-btn-txt']")
	WebElement AddBeneButtonHLDD_Self;

	@FindBy(xpath = "//div[@data-fields='benAccdntDeathSlf']//label[contains(text(),'Self')]")
	WebElement HLDD_Self;

	@FindBy(xpath = "//div[@data-fields='benAccdntDeathSps']//button[@id='addBenefSps']/span[@class='add-btn-txt']")
	WebElement AddBeneButtonHLDD_Spouse;
	
	@FindBy(xpath = "//div[@data-fields='benLIFtDTermLifSlf']//button[@id='addBenefSlf']/span[@class='add-btn-txt']")
	WebElement AddBeneButton_FirstToDieTermLife_Self;

	@FindBy(xpath = "//div[@data-fields='benLIFtDTermLifSps']//button[@id='addBenefSps']/span[@class='add-btn-txt']")
	WebElement AddBeneButton_FirstToDieTermLife_Spouse;

	@FindBy(xpath = "//div[@data-fields='benAccdntDeathSps']//label[contains(text(),'Spouse')]")
	WebElement HLDD_Spouse;

	@FindBy(xpath = "//input[@selectedmembindex='0']")
	WebElement FirstBeneficiary;

	@FindBy(xpath = "//div[@id='trust_benf_tbl']//input[@selectedmembindex='0']")
	WebElement FirstBeneficiaryTrust;

	@FindBy(xpath = "//input[@selectedmembindex='1']")
	WebElement SecondBeneficiary;

	@FindBy(xpath = "//input[@selectedmembindex='2']")
	WebElement ThirdBeneficiary;

	@FindBy(xpath = "//input[@selectedmembindex='3']")
	WebElement FourthBeneficiary;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tbody/tr[1]/td[3]/select[@id='drpdwnlst_selIndBenType']")
	WebElement FirstBeneType;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tbody/tr[2]/td[3]/select[@id='drpdwnlst_selIndBenType']")
	WebElement SecondBeneType;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tbody/tr[3]/td[3]/select[@id='drpdwnlst_selIndBenType']")
	WebElement ThirdBeneType;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tbody/tr[4]/td[3]/select[@id='drpdwnlst_selIndBenType']")
	WebElement FourthBeneType;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tbody/tr[1]/td[3]/select[@id='drpdwnlst_selTrustBenType']")
	WebElement FirstBeneTypeTrust;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tbody/tr[1]/td[4]/input[@data-editor='txtIndShare']")
	WebElement FirstBenePerc;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tbody/tr[2]/td[4]/input[@data-editor='txtIndShare']")
	WebElement SecondBenePerc;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tbody/tr[3]/td[4]/input[@data-editor='txtIndShare']")
	WebElement ThirdBenePerc;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tbody/tr[4]/td[4]/input[@data-editor='txtIndShare']")
	WebElement FourthBenePerc;

	@FindBy(xpath = "//div[@name='benLIAnnualSlf' or @name='benLIFiveYrSlf']//table//tbody//tr//label[contains(text(),'Trust')]//parent::td//following-sibling::td//label[contains(text(),'%')]")
	WebElement TrustPercTermLife;

	@FindBy(xpath = "//div[@name='benLIAnnualSps']//table//tbody//tr//label[contains(text(),'Trust')]//parent::td//following-sibling::td//label[contains(text(),'%')]")
	WebElement TrustPercSpouseTermLife;

	@FindBy(xpath = "//div[@name='benLITenYrSlf']//table//tbody//tr//label[contains(text(),'Trust')]//parent::td//following-sibling::td//label[contains(text(),'%')]")
	WebElement TrustPercTenYTL;

	@FindBy(xpath = "//div[@name='benLIFiveYrSlf']//table//tbody//tr//label[contains(text(),'Trust')]//parent::td//following-sibling::td//label[contains(text(),'%')]")
	WebElement TrustPerc_TermLife_Self;

	// AAFP
	@FindBy(xpath = "//div[@name='benLITenYrSps']//table//tbody//tr//label[contains(text(),'Trust')]//parent::td//following-sibling::td//label[contains(text(),'%')]")
	WebElement TrustPerc_SpouseTenYTL;

	@FindBy(xpath ="//div[@name='benLITwentyYrSps']//table//tbody//tr//label[contains(text(),'Trust')]//parent::td//following-sibling::td//label[contains(text(),'%')]")
	WebElement TrustPerc_SpouseTwentyYTL;
	
	@FindBy(id = "back")
	WebElement Previous;

	@FindBy(id = "cancel")
	WebElement Cancel;

	@FindBy(id = "saveForLater")
	WebElement SaveForLater;

	@FindBy(id = "next")
	WebElement Next;

	@FindBy(id = "rdBeneficiaryRole-0")
	WebElement Individual;

	@FindBy(id = "rdBeneficiaryRole-1")
	WebElement Trust;

	@FindBy(id = "rdBeneficiaryType-0")
	WebElement Primary;

	@FindBy(id = "rdBeneficiaryType-1")
	WebElement Contingent;

	@FindBy(id = "txtTrustName")
	WebElement TrustName;

	@FindBy(id = "dtTrustDate")
	WebElement TrustDate;

	@FindBy(xpath = "//input[@id='txtIndFirstName']")
	WebElement Fname;

	@FindBy(xpath = "//input[@id='txtIndLastName']")
	WebElement Lname;

	@FindBy(xpath = "//select[@id='selIndRelation']")
	WebElement Relationship;

	@FindBy(id = "txtIndOtherInfo")
	WebElement OtherDescription;

	@FindBy(xpath = "//input[@id='txtIndShare']")
	WebElement Percentage;

	@FindBy(id = "beneficiariesLink")
	WebElement BeneficiaryTab;

	@FindBy(id = "addBen")
	WebElement Ok;

	@FindBy(xpath = "//*[@id='addBen']")
	WebElement AddBeneficiary_Ok_Button;
	
	@FindBy(xpath = "//i[@data-action='edit']")
	WebElement Edit;

	@FindBy(xpath = "//i[@data-action='remove']")
	WebElement Delete;

	@FindBy(xpath = "//button[@class='btn btn-success ok' or @id='submit']")
	WebElement DeleteYes;

	@FindBy(xpath = "//button[@class='btn btn-cancel ']")
	WebElement DeleteNo;

	@FindBy(xpath = "(//tbody//tr//td/label[text()='Primary']/parent::td/following-sibling::td[2]//i)[1]")
	WebElement DeleteFirstPrimary;
	
	@FindBy(xpath = "//div[@name='benADOnlyAccidntDthOnlySlf']//tr[2]/td[5]/i[@data-action='remove']")
	WebElement DeleteSecondPrimaryAccDB;
	
	
	@FindBy(xpath = "//tbody//tr//td/label[text()='Contingent']/parent::td/following-sibling::td[2]/i")
	WebElement DeleteContingent;

	@FindBy(xpath = "(//tbody//tr//td/label[text()='Contingent']/parent::td/following-sibling::td[2]//i)[1]")
	WebElement DeleteFirstContingent;

	@FindBy(xpath = "//div[@data-fields='benLITenYrSps']//tr[1]//i[@data-action='edit']")
	WebElement EditFirstBeneficiary_SpouseTenYTI;

	@FindBy(xpath = "//div[@data-fields='benLITenYrSps']//tr[2]//i[@data-action='edit']")
	WebElement EditSecondBeneficiary_SpouseTenYTI;

	@FindBy(xpath = "//div[@data-fields='benLITenYrSlf']//tr[1]//i[@data-action='edit']")
	WebElement EditFirstBeneficiary_SelfTenYTI;

	@FindBy(xpath = "//div[@data-fields='benLITenYrSlf']//label[text()='Contingent']//parent::td//following-sibling::td//i[@data-action='edit']")
	WebElement EditFirstContingentBeneficiary_SelfTenYTI;
		
	@FindBy(xpath = "//div[@data-fields='benLIAnnualSps']//tr[1]//i[@data-action='edit']")
	WebElement EditFirstBeneficiary_TermLife_Spouse;


	@FindBy(xpath = "//div[@name='benLIAnnualSlf']//table//tbody//tr")
	List<WebElement> noBeneficiary;
	
	@FindBy(xpath = "//div[@name='benAccdntDeathSlf']//tbody//tr//td[3]//label[contains(text(),'Contingent')]")
	WebElement ContingentSelf;


	@FindBy(xpath = "(//div[@data-fields='benLIFiveYrSlf']//label[text()='Contingent']//parent::td//following-sibling::td//i[@data-action='edit'])[3]")
	WebElement EditThirdContingentBeneficiary_SelfGroupTermLife;


/////////////////////MOBILE///////////////////
	@FindBy(xpath = "//div[@id='rdAddBeneSlf']//label[@for='rdAddBeneSlf-1']")
	WebElement selfNOclickMobile;

	@FindBy(xpath = "//div[@id='rdAddBeneSlf']//label[@for='rdAddBeneSlf-0']")
	WebElement selfYesclickMobile;

	@FindBy(xpath = "//div[@id='rdAddBeneSps']//label[@for='rdAddBeneSps-1']")
	WebElement spouseNO_Mobile;

	@FindBy(xpath = "//div[@id='rdAddBeneSps']//label[@for='rdAddBeneSps-0']")
	WebElement spouseYes_Mobile;

	@FindBy(xpath = "(//div[@id='lblhdrbenLIFiveYr']/parent::div/following-sibling::div)[1]")
	WebElement traditional_Arrow_mobile;

	@FindBy(xpath = "(//div[@id='lblhdrbenLIFiveYr']/parent::div/following-sibling::div)[2]")
	WebElement traditional_ArrowSpouse_mobile;

	@FindBy(id = "1-benLIFiveYrSlf_txtIndOtherInfo")
	WebElement otherRel_traditional_SecondBen_mobile;

	@FindBy(xpath = "//label[@for='0-benLIFiveYrSlf_rdBeneficiaryType-0']")
	WebElement primary1_Self_Traditional_mobile;

	@FindBy(xpath = "//label[@for='1-benLIFiveYrSlf_rdBeneficiaryType-0']")
	WebElement primary2_Self_Traditional_mobile;

	@FindBy(id = "1-benLIFiveYrSlf_rdBeneficiaryType-0")
	WebElement primary2_Self_disabled_Tradinl_mobile;

	@FindBy(id = "2-benLIFiveYrSlf_rdBeneficiaryType-0")
	WebElement primary3_Self_disabled_Tradinl_mobile;

	@FindBy(xpath = "//label[@for='2-benLIFiveYrSlf_rdBeneficiaryType-0']")
	WebElement primary3_Self_Traditional_mobile;

	@FindBy(id = "3-benLIFiveYrSlf_rdBeneficiaryType-0")
	WebElement primary4_Self_disabled_Tradinl_mobile;

	@FindBy(id = "4-benLIFiveYrSlf_rdBeneficiaryType-0")
	WebElement primary5_Self_disabled_Tradinl_mobile;

	@FindBy(xpath = "//input[@id='3-benLIFiveYrSlf_rdBeneficiaryType']")
	WebElement primary4_Self_Traditional_mobile;

	@FindBy(xpath = "//label[@for='0-benLIFiveYrSps_rdBeneficiaryType-0']")
	WebElement primary1_Spouse_Traditional_mobile;

	@FindBy(xpath = "//label[@for='1-benLIFiveYrSps_rdBeneficiaryType-0']")
	WebElement primary2_Spouse_Traditional_mobile;

	@FindBy(id = "1-benLIFiveYrSps_rdBeneficiaryType-0")
	WebElement primary2_Spouse_Traditional_disabled_mobile;

	@FindBy(xpath = "//label[@for='2-benLIFiveYrSps_rdBeneficiaryType-0']")
	WebElement primary3_Spouse_Traditional_mobile;

	@FindBy(xpath = "//label[@for='0-benLIFiveYrSlf_rdBeneficiaryType-1']")
	WebElement contigent1_Self_Traditional_mobile;

	@FindBy(xpath = "//label[@for='1-benLIFiveYrSlf_rdBeneficiaryType-1']")
	WebElement contigent2_Self_Traditional_mobile;

	@FindBy(xpath = "//label[@for='2-benLIFiveYrSlf_rdBeneficiaryType-1']")
	WebElement contigent3_Self_Traditional_mobile;

	@FindBy(xpath = "//label[@for='3-benLIFiveYrSlf_rdBeneficiaryType-1']")
	WebElement contigent4_Self_Traditional_mobile;

	@FindBy(id = "3-benLIFiveYrSlf_rdBeneficiaryType-1")
	WebElement contigent4_Self_disabled_Tradinl_mobile;
	@FindBy(id = "4-benLIFiveYrSlf_rdBeneficiaryType-1")
	WebElement contigent5_Self_disabled_Tradinl_mobile;

	@FindBy(xpath = "//label[@for='0-benLIFiveYrSps_rdBeneficiaryType-1']")
	WebElement contigent1_Spouse_Traditional_mobile;

	@FindBy(xpath = "//label[@for='1-benLIFiveYrSps_rdBeneficiaryType-1']")
	WebElement contigent2_Spouse_Traditional_mobile;

	@FindBy(xpath = "//label[@for='0-benLIFiveYrSlf_rdBeneficiaryRole-0']")
	WebElement individual1_Self_Traditional_mobile;

	@FindBy(xpath = "//label[@for='1-benLIFiveYrSlf_rdBeneficiaryRole-0']")
	WebElement individual2_Self_Traditional_mobile;

	@FindBy(xpath = "//label[@for='2-benLIFiveYrSlf_rdBeneficiaryRole-0']")
	WebElement individual3_Self_Traditional_mobile;

	@FindBy(xpath = "//label[@for='3-benLIFiveYrSlf_rdBeneficiaryRole-0']")
	WebElement individual4_Self_Traditional_mobile;

	@FindBy(xpath = "//label[@for='0-benLIFiveYrSps_rdBeneficiaryRole-0']")
	WebElement individual1_Spouse_Traditional_mobile;

	@FindBy(xpath = "//label[@for='1-benLIFiveYrSps_rdBeneficiaryRole-0']")
	WebElement individual2_Spouse_Traditional_mobile;

	@FindBy(xpath = "//label[@for='2-benLIFiveYrSps_rdBeneficiaryRole-0']")
	WebElement individual3_Spouse_Traditional_mobile;

	@FindBy(xpath = "//label[@for='0-benLIFiveYrSlf_rdBeneficiaryRole-1']")
	WebElement trust1_Self_Traditional_mobile;

	@FindBy(xpath = "//label[@for='1-benLIFiveYrSlf_rdBeneficiaryRole-1']")
	WebElement trust2_Self_Traditional_mobile;

	@FindBy(xpath = "//label[@for='2-benLIFiveYrSlf_rdBeneficiaryRole-1']")
	WebElement trust3_Self_Traditional_mobile;

	@FindBy(id = "3-benLIFiveYrSlf_rdBeneficiaryRole-1")
	WebElement trust4_Self_disabled_Traditional_mobile;

	@FindBy(xpath = "//label[@for='0-benLIFiveYrSps_rdBeneficiaryRole-1']")
	WebElement trust_Spouse_Traditional_mobile;

	@FindBy(xpath = "//label[@for='1-benLIFiveYrSps_rdBeneficiaryRole-1']")
	WebElement trust1_Spouse_Traditional_mobile;

	@FindBy(id = "0-benLIFiveYrSlf_txtIndFirstName")
	WebElement individualFirstName1_Traditional_Mob;

	@FindBy(id = "1-benLIFiveYrSlf_txtIndFirstName")
	WebElement individualFirstName2_Traditional_Mob;

	@FindBy(id = "2-benLIFiveYrSlf_txtIndFirstName")
	WebElement individualFirstName3_Traditional_Mob;

	@FindBy(id = "3-benLIFiveYrSlf_txtIndFirstName")
	WebElement individualFirstName4_Traditional_Mob;

	@FindBy(id = "0-benLIFiveYrSps_txtIndFirstName")
	WebElement individualFName1_Spouse_Traditional_Mob;

	@FindBy(id = "1-benLIFiveYrSps_txtIndFirstName")
	WebElement individualFName2_Spouse_Traditional_Mob;

	@FindBy(id = "0-benLIFiveYrSlf_txtIndLastName")
	WebElement individualLastName1_Traditional_Mob;

	@FindBy(id = "1-benLIFiveYrSlf_txtIndLastName")
	WebElement individualLastName2_Traditional_Mob;

	@FindBy(id = "2-benLIFiveYrSlf_txtIndLastName")
	WebElement individualLastName3_Traditional_Mob;

	@FindBy(id = "3-benLIFiveYrSlf_txtIndLastName")
	WebElement individualLastName4_Traditional_Mob;

	@FindBy(id = "0-benLIFiveYrSps_txtIndLastName")
	WebElement individualLName1_Spouse_Traditional_Mob;

	@FindBy(id = "1-benLIFiveYrSps_txtIndLastName")
	WebElement individualLName2_Spouse_Traditional_Mob;

	@FindBy(id = "0-benLIFiveYrSlf_selIndRelation")
	WebElement individualrelation1_Traditional_Mob;

	@FindBy(id = "1-benLIFiveYrSlf_selIndRelation")
	WebElement individualrelation2_Traditional_Mob;

	@FindBy(id = "2-benLIFiveYrSlf_selIndRelation")
	WebElement individualrelation3_Traditional_Mob;

	@FindBy(id = "3-benLIFiveYrSlf_selIndRelation")
	WebElement individualrelation4_Traditional_Mob;

	@FindBy(id = "0-benLIFiveYrSps_selIndRelation")
	WebElement individualrelation1_Spouse_Traditional_Mob;

	@FindBy(id = "1-benLIFiveYrSps_selIndRelation")
	WebElement individualrelation2_Spouse_Traditional_Mob;

	@FindBy(id = "0-benLIFiveYrSlf_txtIndShare")
	WebElement individualPercent1_Traditional_Mob;

	@FindBy(id = "1-benLIFiveYrSlf_txtIndShare")
	WebElement individualPercent2_Traditional_Mob;

	@FindBy(id = "2-benLIFiveYrSlf_txtIndShare")
	WebElement individualPercent3_Traditional_Mob;

	@FindBy(id = "3-benLIFiveYrSlf_txtIndShare")
	WebElement individualPercent4_Traditional_Mob;

	@FindBy(id = "0-benLIFiveYrSps_txtIndShare")
	WebElement individualPercent1_Spouse_Traditional_Mob;

	@FindBy(id = "1-benLIFiveYrSps_txtIndShare")
	WebElement individualPercent2_Spouse_Traditional_Mob;

	@FindBy(id = "0-benLIFiveYrSlf_txtTrustName")
	WebElement trustname1_Traditional_Mob;

	@FindBy(id = "1-benLIFiveYrSlf_txtTrustName")
	WebElement trustname2_Traditional_Mob;

	@FindBy(id = "2-benLIFiveYrSlf_txtTrustName")
	WebElement trustname3_Traditional_Mob;

	@FindBy(id = "0-benLIFiveYrSps_txtTrustName")
	WebElement trustname1_Spouse_Traditional_Mob;

	@FindBy(id = "1-benLIFiveYrSps_txtTrustName")
	WebElement trustname2_Spouse_Traditional_Mob;

	@FindBy(xpath = "//div[@id='div_0-benLIFiveYrSlf_dtTrustDate']//input[@data-type='month']")
	WebElement trustMonth1_Traditional_Mob;

	@FindBy(xpath = "//div[@id='div_0-benLIFiveYrSlf_dtTrustDate']//input[@data-type='day']")
	WebElement trustDate1_Traditional_Mob;

	@FindBy(xpath = "//div[@id='div_0-benLIFiveYrSlf_dtTrustDate']//input[@data-type='year']")
	WebElement trustYear1_Traditional_Mob;

	@FindBy(xpath = "//div[@id='div_1-benLIFiveYrSlf_dtTrustDate']//input[@data-type='month']")
	WebElement trustMonth2_Traditional_Mob;

	@FindBy(xpath = "//div[@id='div_1-benLIFiveYrSlf_dtTrustDate']//input[@data-type='day']")
	WebElement trustDate2_Traditional_Mob;

	@FindBy(xpath = "//div[@id='div_1-benLIFiveYrSlf_dtTrustDate']//input[@data-type='year']")
	WebElement trustYear2_Traditional_Mob;

	@FindBy(xpath = "//div[@id='div_2-benLIFiveYrSlf_dtTrustDate']//input[@data-type='month']")
	WebElement trustMonth3_Traditional_Mob;

	@FindBy(xpath = "//div[@id='div_2-benLIFiveYrSlf_dtTrustDate']//input[@data-type='day']")
	WebElement trustDate3_Traditional_Mob;

	@FindBy(xpath = "//div[@id='div_2-benLIFiveYrSlf_dtTrustDate']//input[@data-type='year']")
	WebElement trustYear3_Traditional_Mob;

	@FindBy(xpath = "//div[@id='div_0-benLIFiveYrSps_dtTrustDate']//input[@data-type='month']")
	WebElement trustMonth_Spouse_Traditional_Mob;

	@FindBy(xpath = "//div[@id='div_0-benLIFiveYrSps_dtTrustDate']//input[@data-type='day']")
	WebElement trustDate_Spouse_Traditional_Mob;

	@FindBy(xpath = "//div[@id='div_0-benLIFiveYrSps_dtTrustDate']//input[@data-type='year']")
	WebElement trustYear_Spouse_Traditional_Mob;

	@FindBy(xpath = "//div[@id='div_1-benLIFiveYrSps_dtTrustDate']//input[@data-type='month']")
	WebElement trustMonth_Spouse1_Traditional_Mob;

	@FindBy(xpath = "//div[@id='div_1-benLIFiveYrSps_dtTrustDate']//input[@data-type='day']")
	WebElement trustDate_Spouse1_Traditional_Mob;

	@FindBy(xpath = "//div[@id='div_1-benLIFiveYrSps_dtTrustDate']//input[@data-type='year']")
	WebElement trustYear_Spouse1_Traditional_Mob;

	@FindBy(xpath = "//div[@id='benLIFiveYrSps']/div/div/div/following-sibling::button/span")
	WebElement AddbeneficiaryFive_Spouse_Mobile;

	@FindBy(xpath = "//div[@id='benLIFiveYrSlf']/div/div/div/following-sibling::button/span")
	WebElement AddbeneficiaryFiveSelf_Mobile;

	@FindBy(xpath = "//div[@id='div_0-benLIFiveYrSlf_rdBeneficiaryRole']//parent::div//preceding-sibling::div//div[@class='deleteOption']//button")
	WebElement Delete_TraditionalFirstBen_Mobile_Self;

	@FindBy(xpath = "//div[@id='div_3-benLIFiveYrSlf_rdBeneficiaryRole']//parent::div//preceding-sibling::div//div[@class='deleteOption']//button")
	WebElement Delete_Traditional_FourthBen_Mobile_Self;

	@FindBy(xpath = "//div[@id='div_0-benLITwentyYrSps_rdBeneficiaryType']//parent::div//preceding-sibling::div//div[@class='deleteOption']//button")
	WebElement DeleteFirstBen_Spouse_Twenty_Mobile;

	@FindBy(xpath = "//span[@class='alert-txt']")
	WebElement BeneficiaryErrorMsg;
	
	@FindBy(xpath = "//div[@id='popUpError']//span[@class='alert-txt']")
	WebElement BeneficiaryPopUpErrorMsg;
	
	//NSPE
	
	@FindBy(xpath = "//div[@id='popUpError' and @class='row']//span[@class='alert-txt']")
	WebElement BeneficiaryPopUpErrorMsg_ShareExceed;
	
	@FindBy(xpath = "//label[contains(text(),'Add Beneficiary')]//parent::h4//preceding-sibling::button")
	WebElement CloseButton;

	@FindBy(xpath = "//div[@id='div_4-benLIFiveYrSlf_rdBeneficiaryRole']//parent::div//preceding-sibling::div//div[@class='deleteOption']//button")
	WebElement Delete_Traditional_FifthBen_Mobile_Self;
	// div[@id='div_0-benLITwentyYrSps_rdBeneficiaryType']//parent::div//preceding-sibling::div//div[@class='deleteOption']
	// ******************************* Ten year Mobile
	// ***********************************//
	@FindBy(xpath = "(//div[@id='lblhdrbenLITenYr']/parent::div/following-sibling::div)[1]")
	WebElement tenYear_Arrow_mobile;

	@FindBy(xpath = "(//div[@id='lblhdrbenLITenYr']/parent::div/following-sibling::div)[2]")
	WebElement tenYear_ArrowSpouse_mobile;

	@FindBy(xpath = "//label[@for='0-benLITenYrSlf_rdBeneficiaryType-0']")
	WebElement primary1_Self_Ten_mobile;

	@FindBy(id = "1-benLITenYrSlf_rdBeneficiaryType-0")
	WebElement primary2_Self_disabled_Ten_mobile;

	@FindBy(xpath = "//label[@for='1-benLITenYrSlf_rdBeneficiaryType-0']")
	WebElement primary2_Self_Ten_mobile;

	@FindBy(xpath = "//label[@for='0-benLITenYrSps_rdBeneficiaryType-0']")
	WebElement primary1_Spouse_Ten_mobile;

	@FindBy(xpath = "//label[@for='1-benLITenYrSps_rdBeneficiaryType-0']")
	WebElement primary2_Spouse_Ten_mobile;

	@FindBy(id = "1-benLITenYrSps_rdBeneficiaryType-0")
	WebElement primary2_Spouse_Ten_disabled_mobile;

	@FindBy(xpath = "//label[@for='0-benLITenYrSlf_rdBeneficiaryType-1']")
	WebElement contigent1_Self_Ten_mobile;

	@FindBy(xpath = "//label[@for='1-benLITenYrSlf_rdBeneficiaryType-1']")
	WebElement contigent2_Self_Ten_mobile;

	@FindBy(xpath = "//label[@for='0-benLITenYrSps_rdBeneficiaryType-1']")
	WebElement contigent_Spouse_Ten_mobile;

	@FindBy(xpath = "//label[@for='1-benLITenYrSps_rdBeneficiaryType-1']")
	WebElement contigent2_Spouse_Ten_mobile;

	@FindBy(xpath = "//label[@for='0-benLITenYrSlf_rdBeneficiaryRole-0']")
	WebElement individual1_Self_Ten_mobile;

	@FindBy(xpath = "//label[@for='1-benLITenYrSlf_rdBeneficiaryRole-0']")
	WebElement individual2_Self_Ten_mobile;

	@FindBy(xpath = "//label[@for='0-benLITenYrSps_rdBeneficiaryRole-0']")
	WebElement individual1_Spouse_Ten_mobile;

	@FindBy(xpath = "//label[@for='1-benLITenYrSps_rdBeneficiaryRole-0']")
	WebElement individual2_Spouse_Ten_mobile;

	@FindBy(xpath = "//label[@for='0-benLITenYrSlf_rdBeneficiaryRole-1']")
	WebElement trust_Self_Ten_mobile;

	@FindBy(xpath = "//label[@for='1-benLITenYrSlf_rdBeneficiaryRole-1']")
	WebElement trust2_Self_Ten_mobile;

	@FindBy(xpath = "//label[@for='0-benLITenYrSps_rdBeneficiaryRole-1']")
	WebElement trust1_Spouse_Ten_mobile;

	@FindBy(xpath = "//label[@for='1-benLITenYrSps_rdBeneficiaryRole-1']")
	WebElement trust2_Spouse_Ten_mobile;

	@FindBy(id = "0-benLITenYrSlf_txtIndFirstName")
	WebElement individualFirstName1_Ten_Mob;

	@FindBy(id = "1-benLITenYrSlf_txtIndFirstName")
	WebElement individualFirstName2_Ten_Mob;

	@FindBy(id = "0-benLITenYrSps_txtIndFirstName")
	WebElement individualFName1_Spouse_Ten_Mob;

	@FindBy(id = "1-benLITenYrSps_txtIndFirstName")
	WebElement individualFName2_Spouse_Ten_Mob;

	@FindBy(id = "0-benLITenYrSlf_txtIndLastName")
	WebElement individualLastName1_Ten_Mob;

	@FindBy(id = "1-benLITenYrSlf_txtIndLastName")
	WebElement individualLastName2_Ten_Mob;

	@FindBy(id = "0-benLITenYrSps_txtIndLastName")
	WebElement individualLName1_Spouse_Ten_Mob;

	@FindBy(id = "1-benLITenYrSps_txtIndLastName")
	WebElement individualLName2_Spouse_Ten_Mob;

	@FindBy(id = "0-benLITenYrSlf_selIndRelation")
	WebElement individualrelation1_Ten_Mob;

	@FindBy(id = "1-benLITenYrSlf_selIndRelation")
	WebElement individualrelation2_Ten_Mob;

	@FindBy(id = "0-benLITenYrSps_selIndRelation")
	WebElement individualrelation1_Spouse_Ten_Mob;

	@FindBy(id = "1-benLITenYrSps_selIndRelation")
	WebElement individualrelation2_Spouse_Ten_Mob;

	@FindBy(id = "0-benLITenYrSlf_txtIndShare")
	WebElement individualPercent1_Ten_Mob;

	@FindBy(id = "1-benLITenYrSlf_txtIndShare")
	WebElement individualPercent2_Ten_Mob;

	@FindBy(id = "0-benLITenYrSps_txtIndShare")
	WebElement individualPercent1_Spouse_Ten_Mob;

	@FindBy(id = "1-benLITenYrSps_txtIndShare")
	WebElement individualPercent2_Spouse_Ten_Mob;

	@FindBy(id = "0-benLITenYrSlf_txtTrustName")
	WebElement trustname1_Ten_Mob;

	@FindBy(id = "1-benLITenYrSlf_txtTrustName")
	WebElement trustname2_Ten_Mob;

	@FindBy(id = "0-benLITenYrSps_txtTrustName")
	WebElement trustname1_Spouse_Ten_Mob;

	@FindBy(id = "1-benLITenYrSps_txtTrustName")
	WebElement trustname2_Spouse_Ten_Mob;

	@FindBy(xpath = "//div[@id='div_0-benLITenYrSlf_dtTrustDate']//input[@data-type='month']")
	WebElement trustMonth1_Ten_Mob;

	@FindBy(xpath = "//div[@id='div_0-benLITenYrSlf_dtTrustDate']//input[@data-type='day']")
	WebElement trustDate1_Ten_Mob;

	@FindBy(xpath = "//div[@id='div_0-benLITenYrSlf_dtTrustDate']//input[@data-type='year']")
	WebElement trustYear1_Ten_Mob;

	@FindBy(xpath = "//div[@id='div_1-benLITenYrSlf_dtTrustDate']//input[@data-type='month']")
	WebElement trustMonth2_Ten_Mob;

	@FindBy(xpath = "//div[@id='div_1-benLITenYrSlf_dtTrustDate']//input[@data-type='day']")
	WebElement trustDate2_Ten_Mob;

	@FindBy(xpath = "//div[@id='div_1-benLITenYrSlf_dtTrustDate']//input[@data-type='year']")
	WebElement trustYear2_Ten_Mob;

	@FindBy(xpath = "//div[@id='div_0-benLITenYrSps_dtTrustDate']//input[@data-type='month']")
	WebElement trustMonth_Spouse_Ten_Mob;

	@FindBy(xpath = "//div[@id='div_0-benLITenYrSps_dtTrustDate']//input[@data-type='day']")
	WebElement trustDate_Spouse_Ten_Mob;

	@FindBy(xpath = "//div[@id='div_0-benLITenYrSps_dtTrustDate']//input[@data-type='year']")
	WebElement trustYear_Spouse_Ten_Mob;

	@FindBy(xpath = "//div[@id='div_1-benLITenYrSps_dtTrustDate']//input[@data-type='month']")
	WebElement trustMonth2_Spouse_Ten_Mob;

	@FindBy(xpath = "//div[@id='div_1-benLITenYrSps_dtTrustDate']//input[@data-type='day']")
	WebElement trustDate2_Spouse_Ten_Mob;

	@FindBy(xpath = "//div[@id='div_1-benLITenYrSps_dtTrustDate']//input[@data-type='year']")
	WebElement trustYear2_Spouse_Ten_Mob;

	@FindBy(xpath = "//div[@id='benLITenYrSlf']/div/div/div/following-sibling::button/span")
	WebElement AddbeneficiaryTenSelf_Mobile;

	@FindBy(xpath = "//div[@id='benLITenYrSps']/div/div/div/following-sibling::button/span")
	WebElement AddbeneficiaryTenSpouse_Mobile;

	@FindBy(xpath = "//div[@id='benLITenYrSlf']//div[@class='prev-benes']//select")
	WebElement PrevBen_tenYearSelf_Mob;

	@FindBy(xpath = "//div[@id='benLITenYrSps']//div[@class='prev-benes']//select")
	WebElement PrevBen_tenYearSpouse_Mob;
	// ******************************* Twenty year Mobile
	// ***********************************//

	@FindBy(xpath = "(//div[@id='lblhdrbenLITwentyYr']/parent::div/following-sibling::div)[1]")
	WebElement twentyYear_Arrow_mobile;

	@FindBy(xpath = "(//div[@id='lblhdrbenLITwentyYr']/parent::div/following-sibling::div)[2]")
	WebElement twentyYear_ArrowSpouse_mobile;

	@FindBy(xpath = "//label[@for='0-benLITwentyYrSlf_rdBeneficiaryType-0']")
	WebElement primary1_Self_Twenty_mobile;

	@FindBy(xpath = "//label[@for='1-benLITwentyYrSlf_rdBeneficiaryType-0']")
	WebElement primary2_Self_Twenty_mobile;

	@FindBy(id = "1-benLITwentyYrSlf_rdBeneficiaryType-0")
	WebElement primary2_Self_disabledTwenty_mobile;

	@FindBy(xpath = "//label[@for='0-benLITwentyYrSps_rdBeneficiaryType-0']")
	WebElement primary1_Spouse_Twenty_mobile;

	@FindBy(xpath = "//label[@for='1-benLITwentyYrSps_rdBeneficiaryType-0']")
	WebElement primary2_Spouse_Twenty_mobile;

	@FindBy(xpath = "//label[@for='2-benLITwentyYrSps_rdBeneficiaryType-0']")
	WebElement primary3_Spouse_Twenty_mobile;

	@FindBy(id = "1-benLITwentyYrSps_rdBeneficiaryType-0")
	WebElement primary2_Spouse_Twentydisabled_mobile;

	@FindBy(id = "2-benLITwentyYrSps_rdBeneficiaryType-0")
	WebElement primary3_Spouse_Twentydisabled_mobile;

	@FindBy(xpath = "//label[@for='0-benLITwentyYrSlf_rdBeneficiaryType-1']")
	WebElement contigent1_Self_Twenty_mobile;

	@FindBy(xpath = "//label[@for='1-benLITwentyYrSlf_rdBeneficiaryType-1']")
	WebElement contigent2_Self_Twenty_mobile;

	@FindBy(xpath = "//label[@for='0-benLITwentyYrSps_rdBeneficiaryType-1']")
	WebElement contigent1_Spouse_Twenty_mobile;

	@FindBy(xpath = "//label[@for='1-benLITwentyYrSps_rdBeneficiaryType-1']")
	WebElement contigent2_Spouse_Twenty_mobile;

	@FindBy(xpath = "//label[@for='0-benLITwentyYrSlf_rdBeneficiaryRole-0']")
	WebElement individual1_Self_Twenty_mobile;

	@FindBy(xpath = "//label[@for='1-benLITwentyYrSlf_rdBeneficiaryRole-0']")
	WebElement individual2_Self_Twenty_mobile;

	@FindBy(xpath = "//label[@for='0-benLITwentyYrSps_rdBeneficiaryRole-0']")
	WebElement individual1_Spouse_Twenty_mobile;

	@FindBy(xpath = "//label[@for='1-benLITwentyYrSps_rdBeneficiaryRole-0']")
	WebElement individual2_Spouse_Twenty_mobile;

	@FindBy(xpath = "//label[@for='0-benLITwentyYrSlf_rdBeneficiaryRole-1']")
	WebElement trust1_Self_Twenty_mobile;

	@FindBy(xpath = "//label[@for='1-benLITwentyYrSlf_rdBeneficiaryRole-1']")
	WebElement trust2_Self_Twenty_mobile;

	@FindBy(xpath = "//label[@for='0-benLITwentyYrSps_rdBeneficiaryRole-1']")
	WebElement trust1_Spouse_Twenty_mobile;

	@FindBy(xpath = "//label[@for='1-benLITwentyYrSps_rdBeneficiaryRole-1']")
	WebElement trust2_Spouse_Twenty_mobile;

	@FindBy(xpath = "//label[@for='2-benLITwentyYrSps_rdBeneficiaryRole-1']")
	WebElement trust3_Spouse_Twenty_mobile;

	@FindBy(id = "0-benLITwentyYrSlf_txtIndFirstName")
	WebElement individualFirstName1_Twenty_Mob;

	@FindBy(id = "1-benLITwentyYrSlf_txtIndFirstName")
	WebElement individualFirstName2_Twenty_Mob;

	@FindBy(id = "0-benLITwentyYrSps_txtIndFirstName")
	WebElement individualFName1_Spouse_Twenty_Mob;

	@FindBy(id = "1-benLITwentyYrSps_txtIndFirstName")
	WebElement individualFName2_Spouse_Twenty_Mob;

	@FindBy(id = "0-benLITwentyYrSlf_txtIndLastName")
	WebElement individualLastName1_Twenty_Mob;

	@FindBy(id = "1-benLITwentyYrSlf_txtIndLastName")
	WebElement individualLastName2_Twenty_Mob;

	@FindBy(id = "0-benLITwentyYrSps_txtIndLastName")
	WebElement individualLName1_Spouse_Twenty_Mob;

	@FindBy(id = "1-benLITwentyYrSps_txtIndLastName")
	WebElement individualLName2_Spouse_Twenty_Mob;

	@FindBy(id = "0-benLITwentyYrSlf_selIndRelation")
	WebElement individualrelation1_Twenty_Mob;

	@FindBy(id = "1-benLITwentyYrSlf_selIndRelation")
	WebElement individualrelation2_Twenty_Mob;

	@FindBy(id = "0-benLITwentyYrSps_selIndRelation")
	WebElement individualrelation1_spouse_Twenty_Mob;

	@FindBy(id = "1-benLITwentyYrSps_selIndRelation")
	WebElement individualrelation2_spouse_Twenty_Mob;

	@FindBy(id = "0-benLITwentyYrSlf_txtIndShare")
	WebElement individualPercent1_Twenty_Mob;

	@FindBy(id = "1-benLITwentyYrSlf_txtIndShare")
	WebElement individualPercent2_Twenty_Mob;

	@FindBy(id = "0-benLITwentyYrSps_txtIndShare")
	WebElement individualPercent1_Spouse_Twenty_Mob;

	@FindBy(id = "1-benLITwentyYrSps_txtIndShare")
	WebElement individualPercent2_Spouse_Twenty_Mob;

	@FindBy(id = "0-benLITwentyYrSlf_txtTrustName")
	WebElement trustname1_Twenty_Mob;

	@FindBy(id = "1-benLITwentyYrSlf_txtTrustName")
	WebElement trustname2_Twenty_Mob;

	@FindBy(id = "0-benLITwentyYrSps_txtTrustName")
	WebElement trustname1_spouse_Twenty_Mob;

	@FindBy(id = "1-benLITwentyYrSps_txtTrustName")
	WebElement trustname2_Spouse_Twenty_Mob;

	@FindBy(id = "2-benLITwentyYrSps_txtTrustName")
	WebElement trustname3_Spouse_Twenty_Mob;

	@FindBy(xpath = "//div[@id='div_0-benLITwentyYrSlf_dtTrustDate']//input[@data-type='month']")
	WebElement trustMonth1_Twenty_Mob;

	@FindBy(xpath = "//div[@id='div_0-benLITwentyYrSlf_dtTrustDate']//input[@data-type='day']")
	WebElement trustDate1_Twenty_Mob;

	@FindBy(xpath = "//div[@id='div_0-benLITwentyYrSlf_dtTrustDate']//input[@data-type='year']")
	WebElement trustYear1_Twenty_Mob;

	@FindBy(xpath = "//div[@id='div_1-benLITwentyYrSlf_dtTrustDate']//input[@data-type='month']")
	WebElement trustMonth2_Twenty_Mob;

	@FindBy(xpath = "//div[@id='div_1-benLITwentyYrSlf_dtTrustDate']//input[@data-type='day']")
	WebElement trustDate2_Twenty_Mob;

	@FindBy(xpath = "//div[@id='div_1-benLITwentyYrSlf_dtTrustDate']//input[@data-type='year']")
	WebElement trustYear2_Twenty_Mob;

	@FindBy(xpath = "//div[@id='div_0-benLITwentyYrSps_dtTrustDate']//input[@data-type='month']")
	WebElement trustMonth1_spouse_Twenty_Mob;

	@FindBy(xpath = "//div[@id='div_0-benLITwentyYrSps_dtTrustDate']//input[@data-type='day']")
	WebElement trustDate1_spouse_Twenty_Mob;

	@FindBy(xpath = "//div[@id='div_0-benLITwentyYrSps_dtTrustDate']//input[@data-type='year']")
	WebElement trustYear1_spouse_Twenty_Mob;

	@FindBy(xpath = "//div[@id='div_1-benLITwentyYrSps_dtTrustDate']//input[@data-type='month']")
	WebElement trustMonth2_spouse_Twenty_Mob;

	@FindBy(xpath = "//div[@id='div_1-benLITwentyYrSps_dtTrustDate']//input[@data-type='day']")
	WebElement trustDate2_spouse_Twenty_Mob;

	@FindBy(xpath = "//div[@id='div_1-benLITwentyYrSps_dtTrustDate']//input[@data-type='year']")
	WebElement trustYear2_spouse_Twenty_Mob;

	@FindBy(xpath = "//div[@id='div_2-benLITwentyYrSps_dtTrustDate']//input[@data-type='month']")
	WebElement trustMonth3_spouse_Twenty_Mob;

	@FindBy(xpath = "//div[@id='div_2-benLITwentyYrSps_dtTrustDate']//input[@data-type='day']")
	WebElement trustDate3_spouse_Twenty_Mob;

	@FindBy(xpath = "//div[@id='div_2-benLITwentyYrSps_dtTrustDate']//input[@data-type='year']")
	WebElement trustYear3_spouse_Twenty_Mob;

	@FindBy(xpath = "//div[@id='benLITwentyYrSlf']/div/div/div/following-sibling::button/span")
	WebElement AddbeneficiaryTwentySelf_Mobile;

	@FindBy(xpath = "//div[@id='benLITwentyYrSps']/div/div/div/following-sibling::button/span")
	WebElement AddbeneficiaryTwentySpouse_Mobile;

	@FindBy(xpath = "//div[@name='benAccdntDeathSlf']//table//tbody//tr//label[contains(text(),'Trust')]//parent::td//following-sibling::td//label[contains(text(),'%')]")
	WebElement TrustPercent_AcciDeath_Self;

	@FindBy(xpath = "//div[@data-fields='benLIManagerSlf']//button[@id='addBenefSlf']/span[@class='add-btn-txt']")
	WebElement AddBeneButtonMLI_Self;

	@FindBy(xpath = "//div[@data-fields='benLIManagerSps']//button[@id='addBenefSps']/span[@class='add-btn-txt']")
	WebElement AddBeneButtonMLI_Spouse;

	@FindBy(xpath = "//div[@data-fields='benHiLimitAccdntDSlf']//button[@id='addBenefSlf']/span[@class='add-btn-txt']")
	WebElement AddBeneButtonGADD_Self;
	
	@FindBy(xpath = "//div[@data-fields='benHiLimitAccdntDSps']//button[@id='addBenefSps']/span[@class='add-btn-txt']")
	WebElement AddBeneButtonGADD_Spouse;

	@FindBy(xpath = "//h3[text()='Beneficiary(ies)']")
	WebElement BeneficiaryDetails;

	@FindBy(xpath = "//h3[text()='Beneficiary(ies)']//parent::div//button[@class='btn btn-info unlock-button']")
	WebElement BeneficiaryEdit;

	@FindBy(xpath = "//div[@data-fields='benLIFiveYrSlf']//tr[4]//i[@data-action='edit']")
	WebElement EditFourthBeneficiary_SelfGIGTL;
	
	@FindBy(xpath = "//div[@data-fields='benLIFiveYrSlf']//tr[2]//i[@data-action='edit']")
	WebElement EditSecondBeneficiary_SelfGIGTL;
	
	
	
	
	@FindBy(xpath = "//div[@data-fields='benLIFiveYrSlf']//tr[8]//i[@data-action='edit']")
	WebElement EditEighthBeneficiary_SelfGIGTL;
	
	@FindBy(xpath = "//div[@data-fields='benLITenYrSlf']//tr[4]//i[@data-action='edit']")
	WebElement EditFourthBeneficiary_SelfGIenYTLI;
	
	@FindBy(xpath = "//div[@data-fields='benLITenYrSlf']//tr[8]//i[@data-action='edit']")
	WebElement EditEighthBeneficiary_SelfGIenYTLI;
	
	@FindBy(xpath = "//div[@data-fields='benLITenYrSps']")
	WebElement EditBeneficiary_SpouseTenYTI;

	// *****************************************************************************************************
	// AAFP
	@FindBy(xpath = "//span[@class='alert-txt']")
	WebElement ErrorMsg;

	// *******************************************************************************************************************//

	
	public boolean beneficiary_Page_is_displayed_to_user() throws Exception {
		try {
			log.debug("Beneficiary page is displayed to User");
			Thread.sleep(4000);
			SkipBeneficiaries.isDisplayed();
			beneficiariesPage.isDisplayed();
			
			log.info("Beneficiary page is displayed  successfully || Pass");
			return true;
		} catch (Exception e) {
			System.out.println("Not able to display Beneficiary page  || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean clicks_on_Add_Beneficiery_button_for_Self() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Self");
			Thread.sleep(2000);
			reuseMethod.Clickbutton(AddBeneficiary_Self);
			log.info("Add Beneficiary Button for Selfis clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Add beneficiary Button for Self|| Fail" + e.getMessage());
			throw (e);

		}
	}

	/*
	 * public boolean clicks_on_Add_Beneficiery_button_for_Spouse() throws Exception
	 * { try { log.debug("Click on Add Beneficiary Button for Spouse"); //
	 * Thread.sleep(2000);
	 * 
	 * reuseMethod.Clickbutton(addBaneficiary_Spouse);
	 * log.info("Add Beneficiary Button is clicked successfully || Pass"); return
	 * true; } catch (Exception e) {
	 * log.error("Not able to click Add beneficiary Button|| Fail" +
	 * e.getMessage()); screenShotUtility.GetScreenShot(driver); throw (e);
	 * 
	 * } }
	 */

	public boolean clicks_on_Add_Beneficiary_Button_for_Spouse() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Spouse");
			// Thread.sleep(2000);

			reuseMethod.Clickbutton(AddBeneficiary_Spouse);
			log.info("Add Beneficiary Button for Spouse is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Add beneficiary Button for Spouse|| Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean add_Beneficiary_page_will_be_displayed_to_user_and_user_will_select_Individual_and_Primary_Radio_Buttons()
			throws Exception {
		try {
			log.debug("Add Beneficiary Page is displayed and  user selects Individual and primary radio button");
			Thread.sleep(1500);
			Individual.isDisplayed();
			Primary.isDisplayed();
			
			Individual.click();
			Thread.sleep(2000);
			Primary.click();

			log.info(
					"Add Beneficiary Page is displayed and  user selects Individual and primary radio button successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able Add Beneficiary Page is displayed and  user not able to selects Individual and primary radio button|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean add_Beneficiary_page_will_be_displayed_to_user_and_user_will_select_Individual_and_Contingent_Radio_Buttons()
			throws Exception {
		try {
			log.debug("Add Beneficiary Page is displayed and  user selects Individual and Contingent radio button");
			Thread.sleep(2000);
			Individual.isDisplayed();
			Trust.isDisplayed();
			Primary.isDisplayed();
			Contingent.isDisplayed();
			Thread.sleep(1000);
			Individual.click();
			Thread.sleep(1000);
			Contingent.click();
			Thread.sleep(1000);
			Ok.isDisplayed();
			log.info(
					"Add Beneficiary Page is displayed and  user selects Individual and Contingent radio button successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able Add Beneficiary Page is displayed and  user not able to selects Individual and primary radio button|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean user_Enters_Beneficiary_details_as_name_and_relationship(String Bfname, String Blname,
			String Relation, String Perc) throws Exception {
		try {
			log.debug("User enter beneficiary details");

			Fname.sendKeys(Bfname);
			Lname.sendKeys(Blname);
			reuseMethod.dropDownselectbyvalue(Relationship, Relation);
			Percentage.sendKeys(Perc);
			log.info("User enter beneficiary successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter Beneficiary details|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_on_OK_button() throws Exception {

		try {
			log.debug("Click on OK button");
			Ok.isDisplayed();
			reuseMethod.Clickbutton(Ok);
			Thread.sleep(4000);
			log.info("Click on OK button successfully || Pass");
			return true;
		} catch (Exception e) {
			System.out.println("Not able to click on OK button || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean add_Beneficiary_page_will_be_displayed_to_user_and_user_will_select_Contingent_and_Trust_Radio_Buttons()
			throws Exception {
		try {
			log.debug("Add Beneficiary Page is displayed and  user selects contingent and trust radio button");

			Trust.isDisplayed();

			Contingent.isDisplayed();
			Trust.click();
			Thread.sleep(1000);
			Contingent.click();

			log.info(
					"Add Beneficiary Page is displayed and  user selects Contingent and Trust radio button successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able Add Beneficiary Page is displayed and  user not able to selects Contingent and trust radio button|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean add_Beneficiary_page_will_be_displayed_to_user_and_user_will_select_Trust_and_Primary_Radio_Buttons()
			throws Exception {
		try {
			log.debug("Add Beneficiary Page is displayed and  user selects Primary and trust radio button");
			Individual.isDisplayed();
			Trust.isDisplayed();
			Primary.isDisplayed();
			Contingent.isDisplayed();
			Trust.click();
			Primary.click();
			Ok.isDisplayed();
			log.info(
					"Add Beneficiary Page is displayed and  user selects Primary and Trust radio button successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able Add Beneficiary Page is displayed and  user not able to selects Primary and trust radio button|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean user_Enters_Beneficiary_details_as(String Trust, String Datetrust) throws Exception {
		try {
			log.debug("User Enters Beneficiary details as Trust and Datetrust");
			Thread.sleep(1500);
			TrustName.clear();
			TrustName.sendKeys(Trust);
			TrustDate.click();
			TrustDate.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			
			Thread.sleep(1000);
			if (Datetrust.contains("SYSDATE") || Datetrust.contains("SYSDate") || Datetrust.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(Datetrust);
				
				
				
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				System.out.println("trust date: "+date);
				TrustDate.sendKeys(date);
			}
			else if (Datetrust.equalsIgnoreCase("CurrentDate")) {
				
							
				String date=reuseMethod.Enter_Current_System_Date();
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				TrustDate.sendKeys(date);
				
			} else if(!Datetrust.contains("/")) {
				
				Datetrust=Datetrust.substring(0, 2)+"/"+Datetrust.substring(2, 4)+"/"+Datetrust.substring(4, Datetrust.length());
				TrustDate.sendKeys(Datetrust);
				
			}
			else  {
				
				
				TrustDate.sendKeys(Datetrust);
				
			}
			
			Thread.sleep(2000);
			TrustName.click();
			log.info("User Enters Beneficiary details as Trust and Datetrust || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter the beneficiary details.|| Fail" + e.getMessage());
			throw (e);

		}
	}
	/*
	 * public boolean
	 * beneficiary_page_details_are_displayed_to_user_and_add_beneficiary(String
	 * trustName, String trustDate) throws Exception{
	 *
	 * try { log.debug("Add beneficiary details"); AddBeneficiary_Self.click();
	 * Trust.click(); Primary.click(); TrustName.sendKeys(trustName);
	 * TrustDate.sendKeys(trustDate); Ok.click(); Thread.sleep(2000);
	 * log.info("Beneficiary details added successfully || Pass"); return true;
	 * }catch (Exception e) {
	 * log.error("Not able to ass beneficiary details || Fail"+e.getMessage());
	 * screenShotUtility.GetScreenShot(driver); throw(e);
	 *
	 * }
	 *
	 * }
	 */

	public boolean users_updates_the_beneficiary_details(String trustName) throws Exception {

		try {
			log.debug("Update beneficiary details");
			Edit.click();
			Thread.sleep(500);
			TrustName.click();
			TrustName.clear();
			TrustName.sendKeys(trustName);
			Thread.sleep(500);
			Ok.click();
			Thread.sleep(2000);
			log.info("Beneficiary details updated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to update beneficiary details|| Fail" + e.getMessage());
			throw (e);

		}

	}

	
	public boolean delete_Contigent_Beneficiary() throws Exception {

		try {
			log.debug("Delete the Contingent beneficiary details");
			Thread.sleep(2000);
			DeleteContingent.isDisplayed();
			DeleteContingent.click();
			Thread.sleep(2000);

			log.info("Delete icon for Contingent beneficiary is clicked Successfully successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to delete Contingent beneficiary details|| Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean delete_Second_Individual_Beneficiary_AccidentalDeath() throws Exception {

		try {
			log.debug("Delete the Contingent beneficiary details");
			Thread.sleep(2000);
			DeleteSecondPrimaryAccDB.isDisplayed();
			DeleteSecondPrimaryAccDB.click();
			Thread.sleep(2000);

			log.info("Delete icon for Contingent beneficiary is clicked Successfully successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to delete Contingent beneficiary details|| Fail" + e.getMessage());
			throw (e);

		}

	}
	
	public boolean clicks_on_Skip_Beneficiary_ies_Button() throws Exception {

		try {
			log.debug("Click On Skip Beneficiary Link");
			reuseMethod.scrollDown(SkipBeneficiaries);
			SkipBeneficiaries.isDisplayed();
			SkipBeneficiaries.click();

			Thread.sleep(2000);

			log.info("Skip Beneficiary Link is Clicked Successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click on Skip Beneficiary|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean delete_box_is_displayed_and_clicks_on_Yes() throws Exception {

		try {
			log.debug("Delete Box is Displyed and Click On Yes Button");

			Thread.sleep(2000);
			DeleteYes.click();

			Thread.sleep(2000);

			log.info("Yes Button is Clicked Successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click on Yes Button|| Fail" + e.getMessage());
			throw (e);

		}
	}
	
	public boolean delete_box_is_displayed_and_clicks_on_No() throws Exception {

		try {
			log.debug("Delete Box is Displyed and Click On NO Button");

			Thread.sleep(2000);
			DeleteNo.click();

			Thread.sleep(2000);

			log.info("NO Button is Clicked Successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click on NO Button|| Fail" + e.getMessage());
			throw (e);

		}
	}

	// ==========================MOBILE==============================================//

	public boolean your_Beneficiary_page_displayed_user_select_NO_to_the_question_Mobile() throws Exception {
		try {
			log.debug("Beneficiary details are displayed for self and Select No");
			selfNOclickMobile.click();
			log.info("Beneficiary details are displayed for self and selected No for self  || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select No in Beneficiary details for self|| Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean your_Beneficiary_page_displayed_user_select_YES_to_the_question_Mobile() throws Exception {
		try {
			log.debug("Beneficiary details are displayed for self select Yes");
			selfYesclickMobile.click();
			Thread.sleep(500);
			log.info("Beneficiary details are displayed and selected Yes for self || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Yes in Beneficiary details for self|| Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean spouse_Beneficiary_page_displayed_user_select_NO_to_the_question_Mobile() throws Exception

	{
		try {
			log.debug("Beneficiary details are displayed for Spouse and Select No");
			spouseNO_Mobile.click();
			log.info("Beneficiary details are displayed for Spouse and Selected No || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select No in Beneficiary details for Spouse|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean expand_Traditional_Term_Life_Insurance_tab_on_beneficiary_page_for_self_Mobile() throws Exception

	{
		try {
			log.debug("Expand Traditional Term Life Insurance tab on beneficiary page");

			Thread.sleep(500);
			traditional_Arrow_mobile.click();
			Thread.sleep(1000);
			log.info("Expanded Traditional Term Life Insurance tab on beneficiary page || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to expand Traditional Term Life Insurance tab on beneficiary page|| Fail"
					+ e.getMessage());
			throw (e);

		}
	}

	public boolean expand_Ten_Year_Life_Insurance_tab_on_beneficiary_page_for_self_Mobile() throws Exception

	{
		try {
			log.debug("Expand Ten Year Term Life Insurance tab on beneficiary page");
			tenYear_Arrow_mobile.click();
			Thread.sleep(500);
			log.info("Expanded Ten Year Term Life Insurance tab on beneficiary page || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to expand Ten Year Term Life Insurance tab on beneficiary page|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean expand_Twenty_Year_Life_Insurance_tab_on_beneficiary_page_for_self_Mobile() throws Exception

	{
		try {
			log.debug("Expand Twenty Year Term Life Insurance tab on beneficiary page");
			twentyYear_Arrow_mobile.click();
			Thread.sleep(500);
			log.info("Expanded Twenty Year Term Life Insurance tab on beneficiary page || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to expand Twenty Year Term Life Insurance tab on beneficiary page|| Fail"
					+ e.getMessage());
			throw (e);

		}
	}

	public boolean select_first_beneficiary_select_Primary_and_Individual_and_enter_details_for_self_for_Traditional_Insurance_Mobile(
			String BTrfname1, String BTrlname1, String BTrrelation1, String BTrpercent1) throws Exception

	{
		try {
			log.debug(
					"Select Primary select Individual and enter details for self on beneficiary page First Time for Traditional Insurance");
			Thread.sleep(1000);
			primary1_Self_Traditional_mobile.click();
			Thread.sleep(300);
			individual1_Self_Traditional_mobile.click();
			Thread.sleep(300);
			individualFirstName1_Traditional_Mob.sendKeys(BTrfname1);
			individualLastName1_Traditional_Mob.sendKeys(BTrlname1);
			reuseMethod.dropDownselectbyvalue(individualrelation1_Traditional_Mob, BTrrelation1);
			individualPercent1_Traditional_Mob.sendKeys(BTrpercent1);

			log.info(
					"Select Primary select Individual and enter details for self on beneficiary page First Time for Traditional Insurance || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Primary select Individual and enter details for self on beneficiary page First Time for Traditional Insurance|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean click_Add_Another_Beneficiary_For_Self_Traditional_Insurance_Mobile() throws Exception

	{
		try {
			log.debug("Add other beneficiary");

			AddbeneficiaryFiveSelf_Mobile.click();
			Thread.sleep(300);
			log.info("Added other beneficiary|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add other beneficiary|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean click_Add_Another_Beneficiary_For_Self_Ten_Year_Insurance_Mobile() throws Exception

	{
		try {
			log.debug("Add other beneficiary for Ten Year Insurance");

			AddbeneficiaryTenSelf_Mobile.click();
			Thread.sleep(300);
			log.info("Added other beneficiary for Ten Year Insurance|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add other beneficiary for Ten Year Insurance|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean click_Add_Another_Beneficiary_For_Self_Twenty_Year_Insurance_Mobile() throws Exception

	{
		try {
			log.debug("Add other beneficiary for Twenty Year Insurance");

			AddbeneficiaryTwentySelf_Mobile.click();
			Thread.sleep(300);
			log.info("Added other beneficiary for Twenty Year Insurance|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add other beneficiary for Twenty Year Insurance|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean select_second_beneficiary_select_Contingent_and_Individual_and_enter_details_for_self_for_Traditional_product_Mobile(
			String BTrfname2, String BTrlname2, String BTrrelation2, String BTrpercent2) throws Throwable {

		try {
			log.debug(
					"Select Contigent and Individual and enter details for self on beneficiary page for Traditional Insurance");

			contigent2_Self_Traditional_mobile.click();
			Thread.sleep(300);
			individual2_Self_Traditional_mobile.click();
			individualFirstName2_Traditional_Mob.sendKeys(BTrfname2);
			individualLastName2_Traditional_Mob.sendKeys(BTrlname2);
			reuseMethod.dropDownselectbyvalue(individualrelation2_Traditional_Mob, BTrrelation2);
			individualPercent2_Traditional_Mob.sendKeys(BTrpercent2);

			log.info(
					"Selected Contigent and Individual and enter details for self on beneficiary page for Traditional Insurance|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Contigent and Individual and enter details for self on beneficiary page for|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean select_first_beneficiary_select_Primary_and_Individual_and_select_previous_details_for_self_for_Ten_Year_Insurance_Mobile(
			String BTnprevious, String BTnpercent) throws Throwable {

		try {
			log.debug(
					"Select Contigent and Individual and enter details for self on beneficiary page for Ten year Insurance");

			primary1_Self_Ten_mobile.click();
			Thread.sleep(300);
			individual1_Self_Ten_mobile.click();
			Thread.sleep(300);
			reuseMethod.dropDown(PrevBen_tenYearSelf_Mob, BTnprevious);
			individualPercent1_Ten_Mob.sendKeys(BTnpercent);

			log.info(
					"Selected Contigent and Individual and enter details for self on beneficiary page for Ten year Insurance|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Contigent and Individual and enter details for self on beneficiary page for Ten year|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean select_first_beneficiary_select_Primary_and_Individual_and_enter_New_details_for_self_for_Ten_Year_Insurance_Mobile(
			String BTrfname3, String BTrlname3, String BTrrelation3, String BTrpercent3) throws Throwable {

		try {
			log.debug(
					"Select Contigent and Individual and enter details for self on beneficiary page for Ten year Insurance");

			primary1_Self_Ten_mobile.click();
			Thread.sleep(300);
			individual1_Self_Ten_mobile.click();
			individualFirstName1_Ten_Mob.sendKeys(BTrfname3);
			individualLastName1_Ten_Mob.sendKeys(BTrlname3);
			reuseMethod.dropDownselectbyvalue(individualrelation1_Ten_Mob, BTrrelation3);
			individualPercent1_Ten_Mob.sendKeys(BTrpercent3);

			log.info(
					"Selected Contigent and Individual and enter details for self on beneficiary page for Ten year Insurance|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Contigent and Individual and enter details for self on beneficiary page for Ten year|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean select_second_beneficiary_select_Contingent_and_Trust_and_enter_details_for_self_for_Ten_Year_Insurance_Mobile(
			String BTnTrust, String BTnMM, String BTnDD, String BTnYYYY) throws Throwable {

		try {
			log.debug(
					"Select Contigent and Trust and enter details for self on beneficiary page for Ten year Insurance");

			contigent2_Self_Ten_mobile.click();
			Thread.sleep(300);
			trust2_Self_Ten_mobile.click();
			Thread.sleep(300);
			trustname2_Ten_Mob.sendKeys(BTnTrust);
			trustMonth2_Ten_Mob.sendKeys(BTnMM);
			trustDate2_Ten_Mob.sendKeys(BTnDD);
			trustYear2_Ten_Mob.sendKeys(BTnYYYY);

			log.info(
					"Selected Contigent and Trust and enter details for self on beneficiary page for Ten year Insurance|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Contigent and Trust and enter details for self on beneficiary page for Ten year|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean select_first_beneficiary_select_Primary_and_Trust_and_enter_details_for_self_for_Twenty_Year_Insurance(
			String BTwTrust, String BTwMM, String BTwDD, String BTwYYYY) throws Throwable {
		try {
			log.debug(
					"Select Primary and Trust and enter details for self on beneficiary page for Twenty year Insurance");

			primary1_Self_Twenty_mobile.click();
			Thread.sleep(300);
			trust1_Self_Twenty_mobile.click();
			Thread.sleep(300);
			trustname1_Twenty_Mob.sendKeys(BTwTrust);
			trustMonth1_Twenty_Mob.sendKeys(BTwMM);
			trustDate1_Twenty_Mob.sendKeys(BTwDD);
			trustYear1_Twenty_Mob.sendKeys(BTwYYYY);

			log.info(
					"Selected Primary and Trust and enter details for self on beneficiary page for Twenty year Insurance|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Primary and Trust and enter details for self on beneficiary page for Twenty year Insurance|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean select_second_beneficiary_select_Contingent_and_Individual_and_enter_details_for_self_for_Twenty_Year_Insurance(
			String BTwfname, String BTwlname, String BTwrelation, String BTwpercent) throws Throwable {
		try {
			log.debug(
					"Select Contigent and Individual and enter details for self on beneficiary page for Twenty year Insurance");

			contigent2_Self_Twenty_mobile.click();
			Thread.sleep(300);
			individual2_Self_Twenty_mobile.click();
			individualFirstName2_Twenty_Mob.sendKeys(BTwfname);
			individualLastName2_Twenty_Mob.sendKeys(BTwlname);
			reuseMethod.dropDownselectbyvalue(individualrelation2_Twenty_Mob, BTwrelation);
			individualPercent2_Twenty_Mob.sendKeys(BTwpercent);

			log.info(
					"Selected Contigent and Individual and enter details for self on beneficiary page for Twenty year Insurance|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Contigent and Individual and enter details for self on beneficiary page for Twenty year Insurance|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean spouse_Beneficiary_page_displayed_user_select_YES_to_the_question_Mobile() throws Exception

	{
		try {
			log.debug("Beneficiary details are displayed for Spouse and Select Yes");
			spouseYes_Mobile.click();
			Thread.sleep(300);
			log.info("Beneficiary details are displayed for Spouse and Selected Yes || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Yes in Beneficiary details for Spouse|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean expand_Traditional_Term_Life_Insurance_tab_on_beneficiary_page_for_spouse_Mobile() throws Exception

	{
		try {
			log.debug("Expand Traditional Term Life Insurance tab for Spouse on beneficiary page");
			traditional_ArrowSpouse_mobile.click();
			Thread.sleep(500);
			log.info("Expanded Traditional Term Life Insurance tab for Spouse on beneficiary page || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to expand Traditional Term Life Insurance tab for Spouse on beneficiary page|| Fail"
					+ e.getMessage());
			throw (e);

		}
	}

	public boolean expand_Ten_Year_Life_Insurance_tab_on_beneficiary_page_for_spouse_Mobile() throws Exception

	{
		try {
			log.debug("Expand Ten Year Term Life Insurance tab on for Spouse beneficiary page");
			tenYear_ArrowSpouse_mobile.click();
			Thread.sleep(500);
			log.info("Expanded Ten Year Term Life Insurance tab on for Spouse beneficiary page || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to expand Ten Year Term Life Insurance tab for Spouse on beneficiary page|| Fail"
					+ e.getMessage());
			throw (e);

		}
	}

	public boolean expand_Twenty_Year_Life_Insurance_tab_on_beneficiary_page_for_spouse_Mobile() throws Exception

	{
		try {
			log.debug("Expand Twenty Year Term Life Insurance tab for Spouse on beneficiary page");
			twentyYear_ArrowSpouse_mobile.click();
			Thread.sleep(500);
			log.info("Expanded Twenty Year Term Life Insurance tab for Spouse on beneficiary page || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to expand Twenty Year Term Life Insurance tab for Spouse on beneficiary page|| Fail"
					+ e.getMessage());
			throw (e);

		}
	}

	public boolean select_first_beneficiary_select_Primary_and_Individual_and_enter_details_for_spouse_for_Traditional_Insurance_Mobile(
			String SBTrfname1, String SBTrlname1, String SBTrrelation1, String SBTrpercent1) throws Exception

	{
		try {
			log.debug(
					"Select Primary select Individual and enter details for Spouse on beneficiary page First Time for Traditional Insurance");
			primary1_Spouse_Traditional_mobile.click();
			Thread.sleep(300);
			individual1_Spouse_Traditional_mobile.click();
			Thread.sleep(300);
			individualFName1_Spouse_Traditional_Mob.sendKeys(SBTrfname1);
			individualLName1_Spouse_Traditional_Mob.sendKeys(SBTrlname1);
			reuseMethod.dropDownselectbyvalue(individualrelation1_Spouse_Traditional_Mob, SBTrrelation1);
			individualPercent1_Spouse_Traditional_Mob.sendKeys(SBTrpercent1);

			log.info(
					"Select Primary select Individual and enter details for spouse on beneficiary page First Time for Traditional Insurance || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Primary select Individual and enter details for spouse on beneficiary page First Time for Traditional Insurance|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean click_Add_Another_Beneficiary_For_Spouse_Traditional_Insurance_Mobile() throws Exception

	{
		try {
			log.debug("Add other beneficiary for Spouse Traditional Insurance");

			AddbeneficiaryFive_Spouse_Mobile.click();
			Thread.sleep(300);
			log.info("Added other beneficiary for Spouse Traditional Insurance|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add other beneficiary for Spouse Traditional Insurance|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean click_Add_Another_Beneficiary_For_Spouse_Ten_Year_Insurance_Mobile() throws Exception

	{
		try {
			log.debug("Add other beneficiary for Spouse Ten Year Insurance");

			AddbeneficiaryTenSpouse_Mobile.click();
			Thread.sleep(300);
			log.info("Added other beneficiary for Spouse Ten Year Insurance|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add other beneficiary for Spouse Ten Year Insurance|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean click_Add_Another_Beneficiary_For_Spouse_Twenty_Year_Insurance_Mobile() throws Exception

	{
		try {
			log.debug("Add other beneficiary for Spouse Twenty Year Insurance");

			AddbeneficiaryTwentySpouse_Mobile.click();
			Thread.sleep(300);
			log.info("Added other beneficiary for Spouse Twenty Year Insurance|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to add other beneficiary for Spouse Twenty Year Insurance|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean select_second_beneficiary_select_Contingent_and_Individual_and_enter_details_for_spouse_for_Traditional_Insurance(
			String SBTrfname2, String SBTrlname2, String SBTrrelation2, String SBTrpercent2) throws Throwable {

		try {
			log.debug(
					"Select Contigent and Individual and enter details for spouse on beneficiary page for Traditional Insurance");

			contigent2_Spouse_Traditional_mobile.click();
			Thread.sleep(300);
			individual2_Spouse_Traditional_mobile.click();
			individualFName2_Spouse_Traditional_Mob.sendKeys(SBTrfname2);
			individualLName2_Spouse_Traditional_Mob.sendKeys(SBTrlname2);
			reuseMethod.dropDownselectbyvalue(individualrelation2_Spouse_Traditional_Mob, SBTrrelation2);
			individualPercent2_Spouse_Traditional_Mob.sendKeys(SBTrpercent2);

			log.info(
					"Selected Contigent and Individual and enter details for spouse on beneficiary page for Traditional Insurance|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Contigent and Individual and enter details for spouse on beneficiary page for|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean select_first_beneficiary_select_Primary_and_Individual_and_select_previous_details_for_spouse_for_Ten_Year_Insurance_Mobile(
			String SBTnprevious, String SBTnpercent) throws Throwable {

		try {
			log.debug(
					"Select Contigent and Individual and enter details for spouse on beneficiary page for Ten year Insurance");

			primary1_Spouse_Ten_mobile.click();
			Thread.sleep(300);
			individual1_Spouse_Ten_mobile.click();
			Thread.sleep(300);
			reuseMethod.dropDown(PrevBen_tenYearSpouse_Mob, SBTnprevious);
			individualPercent1_Spouse_Ten_Mob.sendKeys(SBTnpercent);

			log.info(
					"Selected Contigent and Individual and enter details for spouse on beneficiary page for Ten year Insurance|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Contigent and Individual and enter details for spouse on beneficiary page for Ten year|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean select_second_beneficiary_select_Contingent_and_Trust_and_enter_details_for_spouse_for_Ten_Year_Insurance_Mobile(
			String SBTnTrust, String SBTnMM, String SBTnDD, String SBTnYYYY) throws Throwable {

		try {
			log.debug(
					"Select Contigent and Trust and enter details for spouse on beneficiary page for Ten year Insurance");

			contigent2_Spouse_Ten_mobile.click();
			Thread.sleep(300);
			trust2_Spouse_Ten_mobile.click();
			Thread.sleep(300);
			trustname2_Spouse_Ten_Mob.sendKeys(SBTnTrust);
			trustMonth2_Spouse_Ten_Mob.sendKeys(SBTnMM);
			trustDate2_Spouse_Ten_Mob.sendKeys(SBTnDD);
			trustYear2_Spouse_Ten_Mob.sendKeys(SBTnYYYY);

			log.info(
					"Selected Contigent and Trust and enter details for spouse on beneficiary page for Ten year Insurance|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Contigent and Trust and enter details for spouse on beneficiary page for Ten year|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean select_first_beneficiary_select_Primary_and_Trust_and_enter_details_for_spouse_for_Twenty_Year_Insurance(
			String SBTwTrust, String SBTwMM, String SBTwDD, String SBTwYYYY) throws Throwable {
		try {
			log.debug(
					"Select Primary and Trust and enter details for spouse on beneficiary page for Twenty year Insurance");

			primary1_Spouse_Twenty_mobile.click();
			Thread.sleep(300);
			trust1_Spouse_Twenty_mobile.click();
			Thread.sleep(300);
			trustname1_spouse_Twenty_Mob.sendKeys(SBTwTrust);
			trustMonth1_spouse_Twenty_Mob.sendKeys(SBTwMM);
			trustDate1_spouse_Twenty_Mob.sendKeys(SBTwDD);
			trustYear1_spouse_Twenty_Mob.sendKeys(SBTwYYYY);

			log.info(
					"Selected Primary and Trust and enter details for spouse on beneficiary page for Twenty year Insurance|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Primary and Trust and enter details for spouse on beneficiary page for Twenty year Insurance|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean select_second_beneficiary_select_Contingent_and_Individual_and_enter_details_for_spouse_for_Twenty_Year_Insurance(
			String SBTwfname, String SBTwlname, String SBTwrelation, String SBTwpercent) throws Throwable {
		try {
			log.debug(
					"Select Contigent and Individual and enter details for spouse on beneficiary page for Twenty year Insurance");

			contigent2_Spouse_Twenty_mobile.click();
			Thread.sleep(300);
			individual2_Spouse_Twenty_mobile.click();
			Thread.sleep(300);
			individualFName2_Spouse_Twenty_Mob.sendKeys(SBTwfname);
			individualLName2_Spouse_Twenty_Mob.sendKeys(SBTwlname);
			reuseMethod.dropDownselectbyvalue(individualrelation2_spouse_Twenty_Mob, SBTwrelation);
			individualPercent2_Spouse_Twenty_Mob.sendKeys(SBTwpercent);

			log.info(
					"Selected Contigent and Individual and enter details for spouse on beneficiary page for Twenty year Insurance|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Contigent and Individual and enter details for spouse on beneficiary page for Twenty year Insurance|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean select_second_beneficiary_select_Primary_and_Individual_and_enter_details_for_self_for_Traditional_Insurance_Mobile(
			String BTrfname2, String BTrlname2, String BTrrelation2, String BTrpercent2) throws Exception

	{
		try {
			log.debug(
					"Select Primary select Individual and enter details for self on beneficiary page Second Time for Traditional Insurance");
			primary2_Self_Traditional_mobile.click();
			Thread.sleep(300);
			individual2_Self_Traditional_mobile.click();
			Thread.sleep(300);
			individualFirstName2_Traditional_Mob.sendKeys(BTrfname2);
			individualLastName2_Traditional_Mob.sendKeys(BTrlname2);
			reuseMethod.dropDownselectbyvalue(individualrelation2_Traditional_Mob, BTrrelation2);
			individualPercent2_Traditional_Mob.sendKeys(BTrpercent2);

			log.info(
					"Select Primary select Individual and enter details for self on beneficiary page Second Time for Traditional Insurance || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Primary select Individual and enter details for self on beneficiary page Second Time for Traditional Insurance|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean select_third_beneficiary_select_Contingent_and_Trust_and_enter_details_for_self_for_Group_Term_Mobile(
			String BTnTrust, String BTnMM, String BTnDD, String BTnYYYY) throws Throwable {

		try {
			log.debug("Select Contigent and Trust and enter details for self on beneficiary page for Group Term");

			contigent3_Self_Traditional_mobile.click();
			Thread.sleep(500);
			trust3_Self_Traditional_mobile.click();
			Thread.sleep(500);
			trustname3_Traditional_Mob.sendKeys(BTnTrust);
			trustMonth3_Traditional_Mob.sendKeys(BTnMM);
			trustDate3_Traditional_Mob.sendKeys(BTnDD);
			trustYear3_Traditional_Mob.sendKeys(BTnYYYY);
			Thread.sleep(500);
			log.info(
					"Selected Contigent and Trust and enter details for self on beneficiary page for Group Term|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Contigent and Trust and enter details for self on beneficiary page for Group Term|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	/*
	 * public boolean
	 * verify_that_Contigent_and_Primary_buttons_are_disabled_on_adding_fourth_beneficiary_Mobile
	 * () throws Throwable {
	 * 
	 * try { log.debug(
	 * "Contigent and Primary buttons are disabled for self on beneficiary page for Group Term in mobile application"
	 * );
	 * 
	 * if (!contigent4_Self_disabled_Tradinl_mobile.isEnabled()) {
	 * System.err.println("Contigent button is disabled"); } Thread.sleep(500); if
	 * (!primary4_Self_disabled_Tradinl_mobile.isEnabled()) {
	 * System.err.println("Primary button is disabled"); }
	 * 
	 * log.info(
	 * "Contigent and Primary buttons are disabled for self on beneficiary page for Group Term in mobile application|| Pass"
	 * ); return true; } catch (Exception e) { log.error(
	 * "Contigent and Primary buttons are not disabled for self on beneficiary page for Group Term in mobile application|| Fail"
	 * + e.getMessage()); throw (e);
	 * 
	 * } }
	 */

	public boolean clicks_on_Add_Beneficiary_Button_for_Self_under_GroupTerm() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Self under Group Term Life");
			Thread.sleep(1000);
			reuseMethod.scrollDown(GroupTermLifeLabel);
			reuseMethod.Clickbutton(AddBeneButtonGroupTerm_Self);
			log.info("Add Beneficiary Button for Self under Group Term Life is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to click Add beneficiary Button for Self under Group Term Life|| Fail" + e.getMessage());
			throw (e);

		}
	}
	
	public boolean clicks_on_Add_Beneficiary_Button_for_Self_under_LifeTo95() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Self under LifeTo95");
			Thread.sleep(1000);
			reuseMethod.scrollDown(AddBeneButtonGroupTerm_Life50);
			reuseMethod.Clickbutton(AddBeneButtonGroupTerm_Life50);
			log.info("Add Beneficiary Button for Self under LifeTo95 is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to click Add beneficiary Button for Self under LifeTo95|| Fail" + e.getMessage());
			throw (e);

		}
	}
	
	public boolean clicks_on_Add_Beneficiary_Button_for_Self_under_AccidentalDeath() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Self under AccidentalDeath");
			Thread.sleep(1000);
			reuseMethod.scrollDown(AddBeneButtonGroupTerm_ACCDeath);
			reuseMethod.Clickbutton(AddBeneButtonGroupTerm_ACCDeath);
			log.info("Add Beneficiary Button for Self under AccidentalDeath is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to click Add beneficiary Button for Self under AccidentalDeath|| Fail" + e.getMessage());
			throw (e);

		}
	}
	

	public boolean clicks_on_Add_Beneficiary_Button_for_Spouse_under_GroupTerm() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Spouse under Group Term Life");
			Thread.sleep(1000);
			reuseMethod.scrollDown(GroupTermLifeLabel);
			reuseMethod.Clickbutton(AddBeneButtonGroupTerm_Spouse);
			log.info("Add Beneficiary Button for Spouse under Group Term Life is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Add beneficiary Button for Spouse under Group Term Life|| Fail"
					+ e.getMessage());
			throw (e);

		}
	}

	public boolean clicks_on_Add_Beneficiary_Button_for_Self_under_TermLife_ARTL() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Self under Term Life/ARTL");
			Thread.sleep(1000);
			reuseMethod.scrollDown(TermLifeInsurance);
			reuseMethod.Clickbutton(AddBeneButtonTermLife_Self);
			log.info("Add Beneficiary Button for Self under Term Life/ARTL is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Add beneficiary Button for Self under Term Life/ARTL|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean clicks_on_Add_Beneficiary_Button_for_Spouse_under_TermLife_ARTL() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Spouse under Term Life/ARTL");
			Thread.sleep(1000);
			reuseMethod.scrollDown(AddBeneButtonTermLife_Spouse);
			reuseMethod.Clickbutton(AddBeneButtonTermLife_Spouse);
			log.info("Add Beneficiary Button for Spouse under Term Life/ARTL is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to click Add beneficiary Button for Spouse under Term Life/ARTL|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean clicks_on_Add_Beneficiary_Button_for_Self_under_TenYTL() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Self under Ten Years");
			reuseMethod.scrollDown(TenYearLabel);
			Thread.sleep(1000);
			reuseMethod.scrollDown(AddBeneButtonTenYear_Self);
			reuseMethod.Clickbutton(AddBeneButtonTenYear_Self);
			log.info("Add Beneficiary Button for Self under Ten Years is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Add beneficiary Button for Self under Ten Years|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean clicks_on_Add_Beneficiary_Button_for_Spouse_under_TenYTL() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Spouse under Ten Years");
			reuseMethod.scrollDown(TenYearLabel);
			Thread.sleep(1000);
			reuseMethod.scrollDown(AddBeneButtonTenYear_Spouse);
			reuseMethod.Clickbutton(AddBeneButtonTenYear_Spouse);
			log.info("Add Beneficiary Button for Spouse under Ten Years is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Add beneficiary Button for Spouse under Ten Years|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean clicks_on_Add_Beneficiary_Button_for_Self_under_TwentyYTL() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Self under Twenty Years");
			Thread.sleep(1000);
			reuseMethod.scrollDown(AddBeneButtonTwentyYear_Self);
			reuseMethod.Clickbutton(AddBeneButtonTwentyYear_Self);
			log.info("Add Beneficiary Button for Self under Twenty Years is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Add beneficiary Button for Self under Twenty Years|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean clicks_on_Add_Beneficiary_Button_for_Spouse_under_TwentyYTL() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Spouse under Twenty Years");
			Thread.sleep(1000);
			reuseMethod.scrollDown(TwentyYearLabel);
			reuseMethod.Clickbutton(AddBeneButtonTwentyYear_Spouse);
			log.info("Add Beneficiary Button for Spouse under Twenty Years is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Add beneficiary Button for Spouse under Twenty Years|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean clicks_on_Add_Beneficiary_Button_for_Self_under_MLI() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Self under MLI");
			Thread.sleep(1000);
			reuseMethod.scrollDown(AddBeneButtonMLI_Self);
			reuseMethod.Clickbutton(AddBeneButtonMLI_Self);
			log.info("Add Beneficiary Button for Self under MLI is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Add beneficiary Button for Self under MLI|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean clicks_on_Add_Beneficiary_Button_for_Spouse_under_MLI() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Spouse under MLI");
			Thread.sleep(1000);
			reuseMethod.scrollDown(AddBeneButtonMLI_Spouse);
			reuseMethod.Clickbutton(AddBeneButtonMLI_Spouse);
			log.info("Add Beneficiary Button for Spouse under MLI is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Add beneficiary Button for Spouse under MLI|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean clicks_on_Add_Beneficiary_Button_for_Self_under_HLDD() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Self under HLDD");
			Thread.sleep(1000);
			reuseMethod.scrollDown(HLDD_Self);
			reuseMethod.Clickbutton(AddBeneButtonHLDD_Self);
			log.info("Add Beneficiary Button for Self under HLDD is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Add beneficiary Button for Self under HLDD|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean clicks_on_Add_Beneficiary_Button_for_Spouse_under_HLDD() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Spouse under HLDD");
			Thread.sleep(1000);
			reuseMethod.scrollDown(HLDD_Spouse);
			reuseMethod.Clickbutton(AddBeneButtonHLDD_Spouse);
			log.info("Add Beneficiary Button for Spouse under HLDD is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Add beneficiary Button for Spouse under HLDD|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean clicks_on_Add_Beneficiary_Button_for_Self_under_ADDI() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Self under ADDI");
			Thread.sleep(1000);
			reuseMethod.scrollDown(AddBeneButtonADD_Self);
			reuseMethod.Clickbutton(AddBeneButtonADD_Self);
			log.info("Add Beneficiary Button for Self under ADDI is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Add beneficiary Button for Self under ADDI|| Fail" + e.getMessage());
			throw (e);

		}
	}
	
	public boolean clicks_on_Add_Beneficiary_Button_for_Self_under_FirstToDieTermLife() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Self under FirstToDieTermLife");
			Thread.sleep(1000);
			reuseMethod.scrollDown(AddBeneButton_FirstToDieTermLife_Self);
			reuseMethod.Clickbutton(AddBeneButton_FirstToDieTermLife_Self);
			log.info("Add Beneficiary Button for Self under FirstToDieTermLife is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Add beneficiary Button for Self under FirstToDieTermLife|| Fail" + e.getMessage());
			throw (e);

		}
	}	

	public boolean clicks_on_Add_Beneficiary_Button_for_Spouse_under_FirstToDieTermLife() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Spouse under FirstToDieTermLife");
			Thread.sleep(1000);
			reuseMethod.scrollDown(AddBeneButton_FirstToDieTermLife_Spouse);
			reuseMethod.Clickbutton(AddBeneButton_FirstToDieTermLife_Spouse);
			log.info("Add Beneficiary Button for Spouse under FirstToDieTermLife is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Add beneficiary Button for Spouse under FirstToDieTermLife|| Fail" + e.getMessage());
			throw (e);

		}
	}
	
	public boolean selects_the_First_Option_from_Existing_Beneficiaries_List_and_select_Type_as(String type)
			throws Exception {
		try {
			log.debug("Selects the First Option from Existing Beneficiaries List and select Type");
			Thread.sleep(1000);
			FirstBeneficiary.click();
			Thread.sleep(1000);
			reuseMethod.dropDown(FirstBeneType, type);

			log.info("First Option from Existing Beneficiaries List and select Type is selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects the First Option from Existing Beneficiaries List and select Type|| Fail"
					+ e.getMessage());
			throw (e);

		}
	}

	public boolean selects_the_Second_Option_from_Existing_Beneficiaries_List_and_select_Type_as(String type)
			throws Exception {
		try {
			log.debug("Selects the Second Option from Existing Beneficiaries List and select Type as Primary");
			Thread.sleep(1000);
			SecondBeneficiary.click();
			Thread.sleep(1000);
			reuseMethod.dropDown(SecondBeneType, type);

			log.info(
					"Second Option from Existing Beneficiaries List and select Type as Primary is selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Selects the Second Option from Existing Beneficiaries List and select Type as Primary|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean selects_the_Third_Option_from_Existing_Beneficiaries_List_and_select_Type_as(String type)
			throws Exception {
		try {
			log.debug("Selects the Third Option from Existing Beneficiaries List and select Type as Primary");
			Thread.sleep(1000);
			ThirdBeneficiary.click();
			Thread.sleep(1000);
			reuseMethod.dropDown(ThirdBeneType, type);

			log.info(
					"Third Option from Existing Beneficiaries List and select Type as Primary is selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Selects the Third Option from Existing Beneficiaries List and select Type as Primary|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean selects_the_Fourth_Option_from_Existing_Beneficiaries_List_and_select_Type_as(String type)
			throws Exception {
		try {
			log.debug("Selects the Fourth Option from Existing Beneficiaries List and select Type as Primary");
			Thread.sleep(1000);
			FourthBeneficiary.click();
			Thread.sleep(500);
			reuseMethod.dropDown(FourthBeneType, type);

			log.info(
					"Fourth Option from Existing Beneficiaries List and select Type as Primary is selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Selects the Fourth Option from Existing Beneficiaries List and select Type as Primary|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean selects_the_First_Option_from_Existing_Beneficiaries_List_and_select_Type_as_for_Trust(String type)
			throws Exception {
		try {
			log.debug("Selects the First Option from Existing Beneficiaries List and select Type as Primary for Trust");
			Thread.sleep(1000);
			FirstBeneficiaryTrust.click();
			Thread.sleep(700);
			reuseMethod.dropDown(FirstBeneTypeTrust, type);

			log.info(
					"First Option from Existing Beneficiaries List and select Type as Primary is selected successfully for Trust || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Selects the First Option from Existing Beneficiaries List and select Type as Primary for Trust|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean enters_Percentage_for_First_Option_as(String Percent) throws Exception {
		try {
			log.debug("Enters Percentage for First Option ");
			Thread.sleep(2000);
			FirstBenePerc.isDisplayed();
			FirstBenePerc.clear();
			Thread.sleep(1000);
			FirstBenePerc.sendKeys(Percent);
			log.info("Percentage for First Option is entered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Enters Percentage for First Option || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean enters_Percentage_Second_Option_as(String Percent) throws Exception {
		try {
			log.debug("Enters Percentage for Second Option ");
			Thread.sleep(500);
			SecondBenePerc.isDisplayed();
			SecondBenePerc.clear();
			Thread.sleep(1000);
			SecondBenePerc.sendKeys(Percent);
			log.info("Percentage for Second Option is entered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Enters Percentage for Second Option || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean enters_Percentage_Third_Option_as(String Percent) throws Exception {
		try {
			log.debug("Enters Percentage for Third Option ");
			Thread.sleep(500);
			ThirdBenePerc.isDisplayed();
			ThirdBenePerc.clear();
			Thread.sleep(1000);
			ThirdBenePerc.sendKeys(Percent);
			log.info("Percentage for Third Option is entered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Enters Percentage for Third Option || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean enters_Percentage_Fourth_Option_as(String Percent) throws Exception {
		try {
			log.debug("Enters Percentage for First Option ");
			Thread.sleep(500);
			FourthBenePerc.isDisplayed();
			FourthBenePerc.clear();
			Thread.sleep(1000);
			FourthBenePerc.sendKeys(Percent);
			log.info("Percentage for Fourth Option is entered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Enters Percentage for Fourth Option || Fail" + e.getMessage());
			throw (e);

		}
	}
	
	//NSPE
	public boolean enter_new_Beneficiary_Percentage_as(String Perc) throws Exception {
		try {
			log.debug("Enters Percentage Option ");
			Thread.sleep(500);
			Percentage.isDisplayed();
			Percentage.clear();
			Thread.sleep(1000);
			Percentage.sendKeys(Perc);
			log.info("Percentage Option is entered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Enters Percentage Option || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean verify_that_the_Percent_Displayed_is_for_Trust(String Percent) throws Exception {
		try {
			log.debug("Verify Percentage for Trust");
			Thread.sleep(500);
			TrustPercTenYTL.isDisplayed();
			String Actual = TrustPercTenYTL.getText();
			Assert.assertEquals(Actual, Percent, "Percentage for Trust is Verified");

			log.info("Percentage for Trust is validated successfully || Pass");
			return true;

		} catch (Exception e) {
			log.error("Not able to validate Percentage for Trust || Fail" + e.getMessage());
			throw (e);

		}
	}
	// WAEPA trust percent
	/*
	 * public boolean
	 * verify_that_the_Percent_Displayed_for_Trust_Self_GroupTermLife(String
	 * Percent) throws Exception { try { log.debug("Verify Percentage for Trust");
	 * Thread.sleep(500); TrustPerc_TermLife_Self.isDisplayed(); String Actual =
	 * TrustPerc_TermLife_Self.getText(); Assert.assertEquals(Actual, Percent,
	 * "Percentage for Trust is Verified");
	 * 
	 * log.info("Percentage for Trust is validated successfully || Pass"); return
	 * true;
	 * 
	 * } catch (Exception e) {
	 * log.error("Not able to validate Percentage for Trust || Fail" +
	 * e.getMessage()); throw (e);
	 * 
	 * } }
	 */

	public boolean verify_that_the_Percent_Displayed_is_for_Trust_Self_ADDI(String Percent) throws Exception {
		try {
			log.debug("Verify Percentage for Trust for ADnD Product");
			Thread.sleep(500);
			TrustPercent_AcciDeath_Self.isDisplayed();
			String Actual = TrustPercent_AcciDeath_Self.getText();
			Assert.assertEquals(Actual, Percent, "Percentage for Trust is Verified");

			log.info("Percentage for Trust is validated successfully for ADnD Product || Pass");
			return true;

		} catch (Exception e) {
			log.error("Not able to validate Percentage for Trust for ADnD Product|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean verify_that_the_Percent_Displayed_is_for_Trust_TermLife(String TrustSequence, String Percent)
			throws Exception {
		try {
			log.debug("Verify Percentage for Trust");
			Thread.sleep(500);
			String actual = driver
					.findElement(By.xpath("//div[@name='benLIAnnualSlf' or @name='benLIFiveYrSlf']//table//tbody//tr["
							+ TrustSequence
							+ "]//label[contains(text(),'Trust')]//parent::td//following-sibling::td//label[contains(text(),'%')]"))
					.getText();
			// Trust1PercTermLife.isDisplayed();
			// String actual = Trust1PercTermLife.getText();
			actual = actual.replaceAll("\\s", "");
			Percent = Percent.replaceAll("\\s", "");
			Assert.assertEquals(actual, Percent, "Percentage for Trust is Verified");

			log.info("Percentage for Trust is validated successfully || Pass");
			return true;

		} catch (Exception e) {
			log.error("Not able to validate Percentage for Trust || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean verify_that_the_Percent_Displayed_is_for_Trust_for_Spouse_under_TermLife(String Percent)
			throws Exception {
		try {
			log.debug("Verify Percentage for Trust for Spouse Under TermLife");
			Thread.sleep(500);
			TrustPercSpouseTermLife.isDisplayed();
			String actual = TrustPercSpouseTermLife.getText();
			actual = actual.replaceAll("\\s", "");
			Percent = Percent.replaceAll("\\s", "");
			Assert.assertEquals(actual, Percent, "Percentage for Trust for Spouse Under TermLife is Verified");

			log.info("Percentage for Trust for Spouse Under TermLife is validated successfully || Pass");
			return true;

		} catch (Exception e) {
			log.error("Not able to validate Percentage for Trust for Spouse Under TermLife|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean verify_that_the_Trust_Percent_Displayed_for_Spouse(String Percent) throws Exception {
		try {
			log.debug("Verify Percentage for Trust_Spouse");
			Thread.sleep(500);
			TrustPerc_SpouseTenYTL.isDisplayed();
			String Actual = TrustPerc_SpouseTenYTL.getText();
			Assert.assertEquals(Actual, Percent, "Percentage for Trust is Verified");

			log.info("Spouse Percentage for Trust is validated successfully || Pass");
			return true;

		} catch (Exception e) {
			log.error("Not able to validate Spouse Percentage for Trust || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean click_on_Delete_button_for_First_Beneficiary_Mobile() throws Throwable {

		try {
			log.debug(
					"Click on Delete button for First Beneficiary for self for Traditional/Group Term Product in mobile site ");
			Thread.sleep(500);
			reuseMethod.scrollDown(traditional_Arrow_mobile);
			Delete_TraditionalFirstBen_Mobile_Self.click();
			log.info(
					"Clicked on Delete button for First Beneficiary for self for Traditional/Group Term Product in mobile site successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Click on Delete button for First Beneficiary for self for Traditional/Group Term Product in mobile site || Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean change_the_share_percentage_of_the_individual_beneficiary_to_hundred_percent(String BTrpercent3)
			throws Throwable {
		try {
			log.debug("Change the share percentage of the beneficiary to 100 percent ");
			Thread.sleep(500);
			individualPercent2_Traditional_Mob.clear();
			Thread.sleep(500);
			individualPercent2_Traditional_Mob.sendKeys(BTrpercent3);
			log.info("Change the share percentage of the beneficiary to 100 percent successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to change the share percentage of the beneficiary to 100 percent || Fail"
					+ e.getMessage());
			throw (e);

		}
	}

//AAFP

	public boolean validates_error_message_on_Add_Beneficiary_page_Only_one_Trust_is_allowed_as_Primary()
			throws Throwable {
		try {
			log.debug("Validate Error Messege on Add Beneficiary Page");
			Thread.sleep(2000);
			String ExpectedBeneficiaryMsg = PropertyUtility.Load_MessageFile_Data("Beneficiary_TrustValidation");
			ErrorMsg.isDisplayed();
			String actual = ErrorMsg.getText();
			Assert.assertEquals(actual, ExpectedBeneficiaryMsg, "Error messege for Add Beneficiary Page is Not Displayed");

			log.info("Error Messege on Add Beneficiary Page is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Error Messege on Add Beneficiary Page|| Fail" + e.getMessage());
			throw (e);
		}
	}

	// TIE

	public Boolean validates_error_message_for_Beneficiaries_Percentage_share() throws Throwable {
		try {
			log.debug("Validate Error Messege on Beneficiary Page");
			String Expected = PropertyUtility.Load_MessageFile_Data("Beneficiary_PercentageValidation");

			BeneficiaryErrorMsg.isDisplayed();
			String actual = BeneficiaryErrorMsg.getText();
			System.err.println("Error Messege on Beneficiary Page===" + actual);
			Assert.assertEquals(actual, Expected, "Error messege on Beneficiary Page is not Displayed");

			log.info("Error Messege on Beneficiary Page is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Error Messege on Beneficiary Page || Fail" + e.getMessage());
			throw (e);
		}

	}

	public Boolean validates_error_message_on_Add_Beneficiary_page_that_Only_one_Trust_is_allowed_as_Contingent()
			throws Throwable {
		try {
			log.debug("Validate Error Messege on Add Beneficiary Page");

			String ExpectedBeneficiaryMsg = PropertyUtility.Load_MessageFile_Data("TrustContigentErrorMessage");
			ErrorMsg.isDisplayed();
			String actual = ErrorMsg.getText();
			Assert.assertEquals(actual, ExpectedBeneficiaryMsg,
					"Error messege for Add Beneficiary Page trust Contingent is Displayed");

			log.info("Error Messege on Add Beneficiary Page is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Error Messege on Add Beneficiary Page|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public Boolean validate_Error_Message_is_displayed_on_Beneficiary_Page() throws Throwable {
		try {
			log.debug("Validate Error Messege on Beneficiary Page");
			String Expected = PropertyUtility.Load_MessageFile_Data("BeneficiaryErrorMessege");

			BeneficiaryErrorMsg.isDisplayed();
			String actual = BeneficiaryErrorMsg.getText();
			System.err.println("Error Messege on Beneficiary Page===" + actual);
			Assert.assertEquals(actual, Expected, "Error messege on Beneficiary Page is not Displayed");

			log.info("Error Messege on Beneficiary Page is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Error Messege  on Beneficiary Page || Fail" + e.getMessage());
			throw (e);
		}

	}

	public Boolean clicks_on_Close_button() throws Throwable {
		try {
			log.debug("Click On Close Button");
			Thread.sleep(1000);
			CloseButton.isDisplayed();
			CloseButton.click();
			log.info("Close Button is Clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Close Button on Add Beneficiary Page || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean user_Enters_Beneficiary_details_as_name_and_relationship_as_Other(String Bfname, String Blname,
			String Relation, String Perc, String Description) throws Exception {
		try {
			log.debug("User enter beneficiary details when relationship is taken as other");

			Fname.sendKeys(Bfname);
			Lname.sendKeys(Blname);
			reuseMethod.dropDownselectbyvalue(Relationship, Relation);
			OtherDescription.sendKeys(Description);
			Percentage.sendKeys(Perc);
			log.info("User enter beneficiary when relationship is taken as other successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter Beneficiary details when relationship is taken as other|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean second_primary_button_is_disabled_for_Traditional_Insurance_self_mobile() throws Exception {
		try {
			log.debug("Verify that Primary button is disabled for Traditional Insurance");
			boolean check = false;
			if (!primary2_Self_disabled_Tradinl_mobile.isEnabled()) {
				check = true;
			}
			Assert.assertTrue(check, "Second Primary button is not disabled for Traditional Insurance");
			log.info("Verified that Primary button is disabled for Traditional Insurance successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify that Primary button is disabled for Traditional Insurance|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean second_primary_button_is_disabled_for_TenYear_Insurance_self_mobile() throws Exception {
		try {
			log.debug("Verify that Primary button is disabled for Ten year Insurance");
			boolean check = false;
			if (!primary2_Self_disabled_Ten_mobile.isEnabled()) {
				check = true;
			}
			Assert.assertTrue(check, "Second Primary button is not disabled for Ten year Insurance");
			log.info("Verified that Primary button is disabled for Ten year Insurance successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify that Primary button is disabled for Ten year Insurance|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean second_primary_button_is_disabled_for_TwentyYear_Insurance_self_mobile() throws Exception {
		try {
			log.debug("Verify that Primary button is disabled for Twenty year Insurance");
			boolean check = false;
			if (!primary2_Self_disabledTwenty_mobile.isEnabled()) {
				check = true;
			}
			Assert.assertTrue(check, "Second Primary button is not disabled for Twenty year Insurance");
			log.info("Verified that Primary button is disabled for Twenty year Insurance successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify that Primary button is disabled for Twenty year Insurance|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean second_primary_button_is_disabled_for_Traditional_Insurance_spouse_mobile() throws Exception {
		try {
			log.debug("Verify that Primary button is disabled for Traditional Insurance for Spouse");
			boolean check = false;
			if (!primary2_Spouse_Traditional_disabled_mobile.isEnabled()) {
				check = true;
			}
			Assert.assertTrue(check, "Second Primary button is not disabled for Traditional Insurance for Spouse");
			log.info(
					"Verified that Primary button is disabled for Traditional Insurance for Spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify that Primary button is disabled for Traditional Insurance for Spouse|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean second_primary_button_is_disabled_for_TenYear_Insurance_spouse_mobile() throws Exception {
		try {
			log.debug("Verify that Primary button is disabled for Ten year Insurance for Spouse");
			boolean check = false;
			if (!primary2_Spouse_Ten_disabled_mobile.isEnabled()) {
				check = true;
			}
			Assert.assertTrue(check, "Second Primary button is not disabled for Ten year Insurance for Spouse");
			log.info("Verified that Primary button is disabled for for Spouse Ten year Insurance successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify that Primary button is disabled for Ten year Insurance for Spouse|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean second_primary_button_is_disabled_for_TwentyYear_Insurance_spouse_mobile() throws Exception {
		try {
			log.debug("Verify that Primary button is disabled for Twenty year Insurance for Spouse");
			boolean check = false;
			if (!primary2_Spouse_Twentydisabled_mobile.isEnabled()) {
				check = true;
			}
			Assert.assertTrue(check, "Second Primary button is not disabled for Twenty year Insurance for Spouse");
			log.info(
					"Verified that Primary button is disabled for Twenty year Insurance  for Spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify that Primary button is disabled for Twenty year Insurance for Spouse|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean click_on_Delete_button_for_first_beneficiary_of_Twenty_Year_Level_Term_Life_for_spouse()
			throws Throwable {

		try {
			log.debug("Click on Delete button for first beneficiary of Twenty-Year Level Term Life for spouse");
			reuseMethod.scrollDown(twentyYear_ArrowSpouse_mobile);
			DeleteFirstBen_Spouse_Twenty_Mobile.click();

			log.info(
					"clicked on Delete button for first beneficiary of Twenty-Year Level Term Life for spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to click on Delete button for first beneficiary of Twenty-Year Level Term Life for spouse|| Fail"
							+ e.getMessage());
			throw (e);
		}
	}

	public boolean third_primary_button_is_enabled_for_TwentyYear_Insurance_spouse_mobile() throws Exception {
		try {
			log.debug("Verify that Primary button is enabled for Twenty year Insurance for Spouse");
			boolean check = false;
			if (primary3_Spouse_Twentydisabled_mobile.isEnabled()) {
				check = true;
			}
			Assert.assertTrue(check, "Second Primary button is disabled for Twenty year Insurance for Spouse");
			log.info(
					"Verified that Primary button is enabled for Twenty year Insurance  for Spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify that Primary button is enabled for Twenty year Insurance for Spouse|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean select_third_beneficiary_select_Primary_and_Trust_and_enter_details_for_Spouse_for_Twenty_Year_Insurance(
			String STrustName, String STrustMonth, String STrustDate, String STrustYear) throws Throwable {
		try {
			log.debug(
					"select third beneficiary, select Primary and Trust and enter details for Spouse for Twenty Year Insurance");
			primary3_Spouse_Twenty_mobile.click();
			Thread.sleep(300);
			trust3_Spouse_Twenty_mobile.click();
			Thread.sleep(300);
			trustname3_Spouse_Twenty_Mob.sendKeys(STrustName);
			trustMonth3_spouse_Twenty_Mob.sendKeys(STrustMonth);
			trustDate3_spouse_Twenty_Mob.sendKeys(STrustDate);
			trustYear3_spouse_Twenty_Mob.sendKeys(STrustYear);

			log.info(
					"select third beneficiary, select Primary and Trust and enter details for Spouse for Twenty Year Insurance || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select third beneficiary, select Primary and Trust and enter details for Spouse for Twenty Year Insurance|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean click_on_Edit_button_for_First_Beneficiary_for_spouse_for_TenYTL() throws Exception {

		try {
			log.debug("Clicks on first beneficiary details for spouse for TenYTL edit button");
			EditFirstBeneficiary_SpouseTenYTI.click();
			Thread.sleep(500);
			log.info("Clicked on first beneficiary details for spouse for TenYTL edit button successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Click on first beneficiary details for spouse for TenYTL edit button|| Fail"
					+ e.getMessage());
			throw (e);

		}
	}

	public boolean click_on_Edit_button_for_Second_Beneficiary_for_spouse_for_TenYTL() throws Exception {

		try {
			log.debug("Clicks on second beneficiary details for spouse for TenYTL edit button");
			EditSecondBeneficiary_SpouseTenYTI.click();
			Thread.sleep(500);
			log.info("Clicked on first beneficiary details for spouse for TenYTL edit button successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Click on first beneficiary details for spouse for TenYTL edit button|| Fail"
					+ e.getMessage());
			throw (e);

		}
	}
	
	//NSPE
	
	public boolean clicks_on_Edit_button_of_Beneficiary_for_Spouse_under_GroupTermLife(String Sequence) throws Exception {

		try {
			log.debug("Clicks on beneficiary details for spouse for GroupTermLife/TermLife edit button");
			Thread.sleep(1000);
			WebElement EditButton=driver.findElement(By.xpath("//div[@data-fields='benLIFiveYrSps' or @data-fields='benLIAnnualSps']//tr["+Sequence+"]//i[@data-action='edit']"));
			Thread.sleep(1000);
			EditButton.click();
			log.info("Clicked on beneficiary details for spouse for GroupTermLife/TermLife edit button successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Click on beneficiary details for spouse for GroupTermLife/TermLife edit button|| Fail"
					+ e.getMessage());
			throw (e);

		}
	}
	
	
	
	public boolean clicks_on_Edit_button_of_Beneficiary_for_Self_under_TenYTI(String Sequence) throws Exception {

		try {
			log.debug("Clicks on beneficiary details for Self for TenYTI edit button");
			Thread.sleep(1000);
			WebElement EditButton=driver.findElement(By.xpath("//div[@data-fields='benLITenYrSlf']//tr["+Sequence+"]//i[@data-action='edit']"));
			Thread.sleep(1000);
			EditButton.click();
			log.info("Clicked on beneficiary details for Self for TenYTI edit button successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Click on beneficiary details for Self for TenYTI edit button|| Fail"
					+ e.getMessage());
			throw (e);

		}
	}

	public boolean user_Enters_Beneficiary_details_as_Percentage(String Perc) throws Exception {
		try {
			log.debug("Add Beneficiary Page is displayed and User enter beneficiary details as percentage");
			Thread.sleep(2000);
			Percentage.clear();
			Percentage.click();
			Percentage.sendKeys(Perc);
			//reuseMethod.Clickbutton(Ok);
			AddBeneficiary_Ok_Button.click();
			log.info("User enter beneficiary details as percentage successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter Beneficiary details details as percentage|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean verify_that_the_Beneficiary_tab_is_disabled() throws Throwable {
		try {
			log.debug("Verify that the Beneficiary tab is disabled");

			if (BeneficiaryTab.isSelected()) {
				System.out.println("Beneficiary Tab is Enabled");
				return true;
			} else {
				System.out.println("Beneficiary Tab is Disabled");
				return false;
			}

		} catch (Exception e) {
			System.out.println("Beneficiary Tab is not Disabled");
			log.error("Not able to Verify that the Beneficiary tab is disabled || Fail");
			return false;
		}
	}

	public boolean verify_the_error_message_trust_cannot_added_Individual_Exists() throws Throwable {

		try {
			log.debug("Validate the error message...Trust cannot be added if Individual already exist.");
			BeneficiaryErrorMsg.isDisplayed();

			String ExpectedError_Msg = PropertyUtility.Load_MessageFile_Data("TrustCannotAddedErrorMessage");
			String Err_Msg = BeneficiaryErrorMsg.getText();

			String Actual_Err_Msg = Err_Msg.replaceAll("\\n", "");

			System.err.println("Actual error message for Trust:" + Actual_Err_Msg);
			Actual_Err_Msg.replaceAll("\\s", "");
			ExpectedError_Msg.replaceAll("\\s", "");

			Assert.assertEquals(Actual_Err_Msg, ExpectedError_Msg,
					"validation fail for error message..Trust cannot be added if Individual already exist.");

			log.info("Validated the error message successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate the error message || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean verify_the_error_message_beneficiaries_must_contain_share() throws Throwable {

		try {
			log.debug("Validate the error message...Beneficiaries must contain exact 100% share.");
			BeneficiaryErrorMsg.isDisplayed();

			String ExpectedError_Msg = PropertyUtility.Load_MessageFile_Data("BeneficiariesShareErrorMessage");
			String Err_Msg = BeneficiaryErrorMsg.getText();

			String Actual_Err_Msg = Err_Msg.replaceAll("\\n", "");

			System.err.println("Actual error message for Trust:" + Actual_Err_Msg);
			Actual_Err_Msg.replaceAll("\\s", "");
			ExpectedError_Msg.replaceAll("\\s", "");

			Assert.assertEquals(Actual_Err_Msg, ExpectedError_Msg,
					"validation fail for error message..Beneficiaries must contain exact 100% share.");

			log.info("Validated the error message successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate the error message || Fail" + e.getMessage());
			throw (e);
		}
	}

	
	public boolean verify_the_error_message_beneficiaries_must_not_Exceed_100_share() throws Throwable {

		try {
			log.debug("Validate the error message...Beneficiaries must not exceed 100% share.");
			BeneficiaryErrorMsg.isDisplayed();

			String ExpectedError_Msg = PropertyUtility.Load_MessageFile_Data("BeneficiariesShareExceedErrorMessage");
			String Err_Msg = BeneficiaryErrorMsg.getText();

			String Actual_Err_Msg = Err_Msg.replaceAll("\\n", "");

			System.err.println("Actual error message for Trust:" + Actual_Err_Msg);
			Actual_Err_Msg.replaceAll("\\s", "");
			ExpectedError_Msg.replaceAll("\\s", "");

			Assert.assertEquals(Actual_Err_Msg, ExpectedError_Msg,
					"validation fail for error message..Beneficiaries must contain exact 100% share.");

			log.info("Validated the error message successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate the error message || Fail" + e.getMessage());
			throw (e);
		}
	}
	

	
	public boolean validate_Maximum_Beneficiaries_Error_message_for_Individual_Type() throws Throwable {

		try {
			log.debug("Validate the error message...Sum of share for added beneficiaries of Individual type should not exceed 100.");
			BeneficiaryPopUpErrorMsg_ShareExceed.isDisplayed();

			String ExpectedError_Msg = PropertyUtility.Load_MessageFile_Data("BeneficiariesShareErrorMessage1");
			String Err_Msg = BeneficiaryPopUpErrorMsg_ShareExceed.getText();

			String Actual_Err_Msg = Err_Msg.replaceAll("\\n", "");

			System.err.println("Actual error message for Individual:" + Actual_Err_Msg);
			Actual_Err_Msg.replaceAll("\\s", "");
			ExpectedError_Msg.replaceAll("\\s", "");

			Assert.assertEquals(Actual_Err_Msg, ExpectedError_Msg,
					"validation fail for error message..Sum of share for added beneficiaries of Individual type should not exceed 100.");

			log.info("Validated the error message successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate the error message || Fail" + e.getMessage());
			throw (e);
		}
	}


	public Boolean validate_Maximum_Beneficiaries_Error_message() throws Throwable {
		try {
			log.debug("Validate Error Messege on Maximum beneficiaries Page");
			String Expected = PropertyUtility.Load_MessageFile_Data("MaximumBeneficiariesErrorMessage");
			BeneficiaryErrorMsg.isDisplayed();
			String actual = BeneficiaryErrorMsg.getText();
			System.err.println("Error Messege on Coverage Page===" + actual);
			Assert.assertEquals(actual, Expected, "Error messege on Maximum beneficiaries is Not Displayed");

			log.info("Error Messege on Maximum beneficiaries is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Error Messege on Maximum beneficiaries || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean click_on_Edit_button_for_First_Primary_Beneficiary_for_self_for_TenYTL() throws Exception {

		try {
			log.debug("Clicks on first primary beneficiary details for self for TenYTL edit button");
			reuseMethod.scrollDown(EditFirstBeneficiary_SelfTenYTI);
			EditFirstBeneficiary_SelfTenYTI.click();
			Thread.sleep(500);
			log.info(
					"Clicked on first primary beneficiary details for self for TenYTL edit button successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Click on first primary beneficiary details for self for TenYTL edit button|| Fail"
					+ e.getMessage());
			throw (e);

		}
	}

	public boolean validate_Maximum_Contingent_Beneficiaries_Error_message() throws Throwable {
		try {
			log.debug("Validate Error Messege on Maximum Contingent beneficiaries Page");
			String Expected = PropertyUtility.Load_MessageFile_Data("MaxContingentBeneficiariesErrorMessage");
			BeneficiaryPopUpErrorMsg.isDisplayed();
			String actual = BeneficiaryPopUpErrorMsg.getText();
			System.err.println("Error Messege on Coverage Page===" + actual);
			Assert.assertEquals(actual, Expected, "Error messege on Maximum Contingent beneficiaries is Not Displayed");

			log.info("Error Messege on Maximum Contingent beneficiaries is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Validate Error Messege on Maximum Contingent beneficiaries || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean click_on_Edit_button_for_First_Contingent_Beneficiary_for_self_for_TenYTL() throws Exception {

		try {
			log.debug("Clicks on first Contingent beneficiary details for self for TenYTL edit button");
			reuseMethod.scrollDown(EditFirstContingentBeneficiary_SelfTenYTI);
			Thread.sleep(500);
			EditFirstContingentBeneficiary_SelfTenYTI.click();
			log.info(
					"Clicked on first Contingent beneficiary details for self for TenYTL edit button successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Click on first Contingent beneficiary details for self for TenYTL edit button|| Fail"
					+ e.getMessage());
			throw (e);

		}
	}
	
	public boolean click_on_Edit_Button_for_Third_Contingent_Individual_Beneficiary_for_self_TermLife_FiveYr() throws Exception {

		try {
			log.debug("Click on Edit Button for Third Contingent Individual Beneficiary under GroupTermLife");
			reuseMethod.scrollDown(EditThirdContingentBeneficiary_SelfGroupTermLife);
			Thread.sleep(500);
			EditThirdContingentBeneficiary_SelfGroupTermLife.click();
			log.info(" Edit Button for Third Contingent Individual Beneficiary under GroupTermLife is clicked  successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Click on Edit Button for Third Contingent Individual Beneficiary under GroupTermLife|| Fail"+ e.getMessage());
			throw (e);

		}
	}

	public boolean select_third_beneficiary_select_Contingent_and_Individual_and_enter_details_for_self_for_Traditional_product_Mobile(
			String BTrfname3, String BTrlname3, String BTrrelation3, String BTrpercent3) throws Throwable {

		try {
			log.debug(
					"Select Contigent and Individual for Third Beneficiary and enter details for self on beneficiary page for Traditional Insurance");

			contigent3_Self_Traditional_mobile.click();
			Thread.sleep(300);
			individual3_Self_Traditional_mobile.click();
			individualFirstName3_Traditional_Mob.sendKeys(BTrfname3);
			individualLastName3_Traditional_Mob.sendKeys(BTrlname3);
			reuseMethod.dropDownselectbyvalue(individualrelation3_Traditional_Mob, BTrrelation3);
			individualPercent3_Traditional_Mob.sendKeys(BTrpercent3);

			log.info(
					"Selected Contigent and Individual and enter details for self on beneficiary page for Traditional Insurance|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Contigent and Individual and enter details for self on beneficiary page for|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean select_fourth_beneficiary_select_Contingent_and_Individual_and_enter_details_for_self_for_Traditional_product_Mobile(
			String BTrfname4, String BTrlname4, String BTrrelation4, String BTrpercent4) throws Throwable {

		try {
			log.debug(
					"Select Contigent and Individual for Fourth Beneficiary and enter details for self on beneficiary page for Traditional Insurance");

			contigent4_Self_Traditional_mobile.click();
			Thread.sleep(300);
			individual4_Self_Traditional_mobile.click();
			individualFirstName4_Traditional_Mob.sendKeys(BTrfname4);
			individualLastName4_Traditional_Mob.sendKeys(BTrlname4);
			reuseMethod.dropDownselectbyvalue(individualrelation4_Traditional_Mob, BTrrelation4);
			individualPercent4_Traditional_Mob.sendKeys(BTrpercent4);

			log.info(
					"Selected Contigent and Individual and enter details for self on beneficiary page for Traditional Insurance|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Contigent and Individual and enter details for self on beneficiary page for|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean select_second_beneficiary_select_Primary_and_Individual_and_enter_details_for_self_for_Traditional_Insurance_Mobile(
			String BTrfname1, String BTrlname1, String BTrrelation1, String otherRel, String BTrpercent1)
			throws Exception

	{
		try {
			log.debug(
					"Select Primary select Individual and enter details for self on beneficiary page Second Time for Traditional Insurance");
			Thread.sleep(1000);
			primary2_Self_Traditional_mobile.click();
			Thread.sleep(300);
			individual2_Self_Traditional_mobile.click();
			Thread.sleep(300);
			individualFirstName2_Traditional_Mob.sendKeys(BTrfname1);
			individualLastName2_Traditional_Mob.sendKeys(BTrlname1);
			reuseMethod.dropDownselectbyvalue(individualrelation2_Traditional_Mob, BTrrelation1);
			otherRel_traditional_SecondBen_mobile.sendKeys(otherRel);
			individualPercent2_Traditional_Mob.sendKeys(BTrpercent1);

			log.info(
					"Select Primary select Individual and enter details for self on beneficiary page Second Time for Traditional Insurance || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Primary select Individual and enter details for self on beneficiary page Second Time for Traditional Insurance|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean click_on_Delete_button_for_Fourth_Beneficiary_for_GroupTerm_Mobile() throws Throwable {

		try {
			log.debug(
					"Click on Delete button for Fourth Beneficiary for self for Traditional/Group Term Product in mobile site ");
			Thread.sleep(500);
			reuseMethod.scrollDown(individual2_Self_Traditional_mobile);
			Delete_Traditional_FourthBen_Mobile_Self.click();
			log.info(
					"Clicked on Delete button for Fourth Beneficiary for self for Traditional/Group Term Product in mobile site successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Click on Delete button for Fourth Beneficiary for self for Traditional/Group Term Product in mobile site || Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean enter_percentage_for_third_beneficiary_for_self_for_Traditional_Insurance_Mobile(String BTrpercent1)
			throws Exception

	{
		try {
			log.debug("Enter individual beneficiary percentage for third beneficiary for Traditional Insurance");
			Thread.sleep(1000);
			individualPercent3_Traditional_Mob.clear();
			individualPercent3_Traditional_Mob.sendKeys(BTrpercent1);

			log.info("Enter individual beneficiary percentage for third beneficiary for Traditional Insurance || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to enter individual beneficiary percentage for third beneficiary for Traditional Insurance|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean third_primary_button_is_disabled_for_Traditional_Insurance_self_mobile() throws Exception {
		try {
			log.debug("Verify that Primary button is disabled for Traditional Insurance");
			boolean check = false;
			if (!primary3_Self_disabled_Tradinl_mobile.isEnabled()) {
				check = true;
			}
			Assert.assertTrue(check, "Third Primary button is not disabled for Traditional Insurance");
			log.info("Verified that Third Primary button is disabled for Traditional Insurance successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify that Third Primary button is disabled for Traditional Insurance|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean fourth_trust_is_disabled_for_Traditional_Insurance_self_mobile() throws Exception {
		try {
			log.debug("Verify that Trust button is disabled for Traditional Insurance");
			boolean check = false;
			if (!trust4_Self_disabled_Traditional_mobile.isEnabled()) {
				check = true;
			}
			Assert.assertTrue(check, "Fourth Trust button is not disabled for Traditional Insurance");
			log.info("Verified that Fourth Trust button is disabled for Traditional Insurance successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify that Fourth Trust button is disabled for Traditional Insurance|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean select_second_beneficiary_select_Contingent_and_Trust_and_enter_details_for_self_for_Group_Term_Mobile(
			String BTnTrust, String BTnMM, String BTnDD, String BTnYYYY) throws Throwable {

		try {
			log.debug(
					"Select Contigent and Trust and enter details for self on beneficiary page for second beneficiary for Group Term");

			contigent2_Self_Traditional_mobile.click();
			Thread.sleep(500);
			trust2_Self_Traditional_mobile.click();
			Thread.sleep(500);
			trustname2_Traditional_Mob.sendKeys(BTnTrust);
			trustMonth2_Traditional_Mob.sendKeys(BTnMM);
			trustDate2_Traditional_Mob.sendKeys(BTnDD);
			trustYear2_Traditional_Mob.sendKeys(BTnYYYY);
			Thread.sleep(500);
			log.info(
					"Selected Contigent and Trust and enter details for self for second beneficiary on beneficiary page for Group Term|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Contigent and Trust and enter details for self for second beneficiary on beneficiary page for Group Term|| Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	/*
	 * public boolean
	 * select_third_beneficiary_select_Primary_and_Individual_and_enter_details_for_self_for_Traditional_Insurance_Mobile(
	 * String BTrfname3, String BTrlname3, String BTrrelation3, String BTrpercent3)
	 * throws Exception
	 * 
	 * { try { log.debug(
	 * "Select Primary select Individual and enter details for self on beneficiary page Third Time for Traditional Insurance"
	 * ); primary3_Self_Traditional_mobile.click(); Thread.sleep(300);
	 * individual3_Self_Traditional_mobile.click(); Thread.sleep(300);
	 * individualFirstName3_Traditional_Mob.sendKeys(BTrfname3);
	 * individualLastName3_Traditional_Mob.sendKeys(BTrlname3);
	 * reuseMethod.dropDownselectbyvalue(individualrelation3_Traditional_Mob,
	 * BTrrelation3); individualPercent3_Traditional_Mob.sendKeys(BTrpercent3);
	 * 
	 * log.info(
	 * "Select Primary select Individual and enter details for self on beneficiary page Third Time for Traditional Insurance || Pass"
	 * ); return true; } catch (Exception e) { log.error(
	 * "Not able to select Primary select Individual and enter details for self on beneficiary page Third Time for Traditional Insurance|| Fail"
	 * + e.getMessage()); throw (e);
	 * 
	 * } }
	 */

	public boolean fifth_primary_button_is_disabled_for_Traditional_Insurance_self_mobile() throws Exception {
		try {
			log.debug("Verify that Primary button is disabled for Traditional Insurance");
			boolean check = false;
			if (!primary5_Self_disabled_Tradinl_mobile.isEnabled()) {
				check = true;
			}
			Assert.assertTrue(check, "Fifth Primary button is not disabled for Traditional Insurance");
			log.info("Verified that Primary button is disabled for Traditional Insurance successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify that Primary button is disabled for Traditional Insurance|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean fifth_Contingent_button_is_disabled_for_Traditional_Insurance_self_mobile() throws Exception {
		try {
			log.debug("Verify that Contingent button is disabled for Traditional Insurance");
			boolean check = false;
			if (!contigent5_Self_disabled_Tradinl_mobile.isEnabled()) {
				check = true;
			}
			Assert.assertTrue(check, "Fifth Contingent button is not disabled for Traditional Insurance");
			log.info("Verified that Contingent button is disabled for Traditional Insurance successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify that Contingent button is disabled for Traditional Insurance|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean click_on_Delete_button_for_Fifth_Beneficiary_for_GroupTerm_Mobile() throws Throwable {

		try {
			log.debug(
					"Click on Delete button for Fifth Beneficiary for self for Traditional/Group Term Product in mobile site ");
			Thread.sleep(500);
			reuseMethod.scrollDown(individual4_Self_Traditional_mobile);
			Delete_Traditional_FifthBen_Mobile_Self.click();
			log.info(
					"Clicked on Delete button for Fifth Beneficiary for self for Traditional/Group Term Product in mobile site successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Click on Delete button for Fifth Beneficiary for self for Traditional/Group Term Product in mobile site || Fail"
							+ e.getMessage());
			throw (e);

		}
	}

	public boolean clicks_on_Add_Beneficiary_Button_for_Self_under_GADD() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Self under GADD/HLAI");
			Thread.sleep(1000);
			reuseMethod.scrollDown(AddBeneButtonGADD_Self);
			reuseMethod.Clickbutton(AddBeneButtonGADD_Self);
			log.info("Add Beneficiary Button for Self under GADD/HLAI is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Add beneficiary Button for Self under GADD/HLAI || Fail" + e.getMessage());
			throw (e);

		}
	}
	
	public boolean clicks_on_Add_Beneficiary_Button_for_Spouse_under_GADD() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Spouse under GADD/HLAI");
			Thread.sleep(1000);
			reuseMethod.scrollDown(AddBeneButtonGADD_Spouse);
			reuseMethod.Clickbutton(AddBeneButtonGADD_Spouse);
			log.info("Add Beneficiary Button for Spouse under GADD/HLAI is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Add beneficiary Button for Spouse under GADD/HLAI || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean beneficiary_details_are_displayed_to_user() throws Exception {
		try {
			log.debug("Validate the Beneficiary details is Displayed");
			BeneficiaryDetails.isDisplayed();
			log.info("Beneficiary details is Displayed successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to displayed Beneficiary deatils || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean verify_that_the_Percent_Displayed_is_for_Trust_under_GIGTL(String Percent) throws Exception {
		try {
			log.debug("Verify Percentage for Trust under Guaranteed Issue Group Term Life");
			Thread.sleep(500);
			TrustPerc_TermLife_Self.isDisplayed();
			String Actual = TrustPerc_TermLife_Self.getText();
			
			Assert.assertEquals(Actual, Percent,
					"Percentage for Trust under Guaranteed Issue Group Term Life is Verified");

			log.info("Percentage for Trust under Guaranteed Issue Group Term Life is validated successfully || Pass");
			return true;

		} catch (Exception e) {
			log.error("Not able to validate Percentage for Trust under Guaranteed Issue Group Term Life || Fail"
					+ e.getMessage());
			throw (e);

		}
	}

	public boolean clicks_beneficiary_edit_button() throws Exception {

		try {
			log.debug("Click on beneficiary edit button");
			reuseMethod.scrollDown(BeneficiaryEdit);
			reuseMethod.Clickbutton(BeneficiaryEdit);
			Thread.sleep(5000);
			log.info("Click on beneficiary edit button successfully || Pass");
			return true;
		} catch (Exception e) {
			System.out.println("Not able to click on beneficiary edit button || Fail" + e.getMessage());
			throw (e);

		}
	}
	public boolean click_on_Edit_button_for_Fourth_Primary_Beneficiary_for_self_for_GIGTL() throws Exception {

		try {
			log.debug("Clicks on fourth primary beneficiary details for self for GIGTL edit button");
			reuseMethod.scrollDown(EditFourthBeneficiary_SelfGIGTL);
			EditFourthBeneficiary_SelfGIGTL.click();
			Thread.sleep(500);
			log.info(
					"Clicked on fourth primary beneficiary details for self for GIGTL edit button successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Click on fourth primary beneficiary details for self for GIGTL edit button|| Fail"
					+ e.getMessage());
			throw (e);

		}
	}

	public boolean click_on_Edit_button_for_Eighth_Primary_Beneficiary_for_self_for_GIGTL() throws Exception {

		try {
			log.debug("Clicks on Eighth beneficiary details for self for GIGTL edit button");
			reuseMethod.scrollDown(EditEighthBeneficiary_SelfGIGTL);
			EditEighthBeneficiary_SelfGIGTL.click();
			Thread.sleep(500);
			log.info(
					"Clicked on Eighth beneficiary details for self for GIGTL edit button successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Click on Eighth beneficiary details for self for GIGTL edit button|| Fail"
					+ e.getMessage());
			throw (e);

		}
	}

	public boolean delete_first_primary_Beneficiary() throws Exception {

		try {
			log.debug("Delete first Primary beneficiary details");
			Thread.sleep(2000);
			
			DeleteFirstPrimary.click();

			Thread.sleep(2000);

			log.info("Delete icon for first Primary beneficiary is clicked Successfully successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to delete first Primary beneficiary details|| Fail" + e.getMessage());
			throw (e);

		}

	}
	
	public boolean delete_First_Contingent_Beneficiary() throws Exception {

		try {
			log.debug("Delete first Contingent beneficiary details");
			Thread.sleep(2000);

			DeleteFirstContingent.click();

			Thread.sleep(2000);

			log.info("Delete icon for first Contingent beneficiary is clicked Successfully successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to delete first Contingent beneficiary details|| Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean there_is_no_beneficiary_for_self_under_ARTL() throws Exception {

		try {
			log.debug("Verify that there is no beneficary for Self under ARTL");
			Thread.sleep(2000);
			int values=noBeneficiary.size();
			if(values==0)
			{
				System.out.println("There is no beneficary for Self under ARTL");
			}

			Thread.sleep(2000);

			log.info("Verified that there is no beneficary for Self under ARTL successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to verify that there is no beneficary for Self under ARTL|| Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean verify_that_Contingent_Beneficiary_is_Deleted_Successfully() throws Exception {

		try {
			log.debug("Verify Contingent Beneficiary is Deleted Successfully");
			boolean check = ContingentSelf.isDisplayed();
			assertFalse(check, "Contingent Beneficiary is not deleted");
			log.info("Contingent Beneficiary is Deleted Successfully || Pass");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Contingent Beneficiary is Deleted Successfully...");
			log.error("Not able to verify that Contingent Beneficiary is Deleted Successfully|| Fail" + e.getMessage());
			return false;

		}

	}
	
	public boolean clicks_on_Add_Beneficiary_Button_for_Self_under_FifteenYTL() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Self under FifteenYTL");
			Thread.sleep(1000);
			reuseMethod.scrollDown(AddBeneButtonFifteenYTL_Self);
			reuseMethod.Clickbutton(AddBeneButtonFifteenYTL_Self);
			log.info("Add Beneficiary Button for Self under FifteenYTL is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Add beneficiary Button for Self under FifteenYTL|| Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean clicks_on_Add_Beneficiary_Button_for_Spouse_under_FifteenYTL() throws Exception {
		try {
			log.debug("Click on Add Beneficiary Button for Spouse under Fifteen YTL");
			Thread.sleep(1000);
			reuseMethod.scrollDown(AddBeneButtonFifteenYTL_Spouse);
			reuseMethod.Clickbutton(AddBeneButtonFifteenYTL_Spouse);
			log.info("Add Beneficiary Button for Spouse under Fifteen YTL is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to click Add beneficiary Button for Spouse under Fifteen YTL|| Fail" + e.getMessage());
			throw (e);

		}
	}
	public boolean verify_that_the_Trust_Percent_Displayed_for_Spouse_under_TwentyYTL(String Percent) throws Exception {
		try {
			log.debug("Verify Percentage for Trust for Spouse under Twenty YTL");
			Thread.sleep(500);
			TrustPerc_SpouseTwentyYTL.isDisplayed();
			String Actual = TrustPerc_SpouseTwentyYTL.getText();
			Assert.assertEquals(Actual, Percent, "Percentage for Trust is Verified");

			log.info("Spouse Percentage for Trust for Spouse under Twenty YTL is validated successfully || Pass");
			return true;

		} catch (Exception e) {
			log.error("Not able to validate Spouse Percentage for Trust under Twenty YTL|| Fail" + e.getMessage());
			throw (e);
		}
	}
	public boolean validates_Add_Beneficiary_button_is_displayed_for_GTenYTL() throws Throwable {
		try {
			log.debug("Verify the Add Beneficiary button is displayed for GTenYTL");
			boolean check = AddBeneButtonTenYear_Self.isDisplayed();
			Assert.assertTrue(check, "Bug||Add Beneficiary button is not displayed for GTenYTL");
			log.info("Add Beneficiary button is displayed for GTenYTL");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Add Beneficiary button is not displayed for GTenYTL**********");
			log.error("Add Beneficiary button is not displayed for GTenYTL || Fail");
			return false;
		}
	}
	
	public boolean validates_Add_Beneficiary_button_is_displayed_for_GTTLI() throws Throwable {
		try {
			log.debug("Verify the Add Beneficiary button is displayed for GTTLI");
			boolean check = AddBeneButtonTermLife_Self.isDisplayed();
			Assert.assertTrue(check, "Bug||Add Beneficiary button is not displayed for GTTLI");
			log.info("Add Beneficiary button is displayed for GTTLI");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Add Beneficiary button is not displayed for GTTLI**********");
			log.error("Add Beneficiary button is not displayed for GTTLI || Fail");
			return false;
		}
	}
	
	public boolean validates_Add_Beneficiary_button_is_displayed_for_GTwentyYLI() throws Throwable {
		try {
			log.debug("Verify the Add Beneficiary button is displayed for GTwentyYLI");
			boolean check = AddBeneButtonTwentyYear_Self.isDisplayed();
			Assert.assertTrue(check, "Bug||Add Beneficiary button is not displayed for GTwentyYLI");
			log.info("Add Beneficiary button is displayed for GTwentyYLI");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("*****Add Beneficiary button is not displayed for GTwentyYLI**********");
			log.error("Add Beneficiary button is not displayed for GTwentyYLI || Fail");
			return false;
		}
	}
	
	public boolean verify_the_error_message_Individual_cannot_added_Trust_Exists() throws Throwable {

		try {
			log.debug("Validate the error message...Individual cannot be added if Trust already exist.");
			BeneficiaryErrorMsg.isDisplayed();

			String ExpectedError_Msg = PropertyUtility.Load_MessageFile_Data("IndividualCannotAddedErrorMessage");
			String Err_Msg = BeneficiaryErrorMsg.getText();

			String Actual_Err_Msg = Err_Msg.replaceAll("\\n", "");

			System.err.println("Actual error message for Individual:" + Actual_Err_Msg);
			Actual_Err_Msg.replaceAll("\\s", "");
			ExpectedError_Msg.replaceAll("\\s", "");

			Assert.assertEquals(Actual_Err_Msg, ExpectedError_Msg,
					"validation fail for error message..Individual cannot be added if Trust already exist.");

			log.info("Validated the error message successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate the error message || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean click_on_Edit_button_for_Fourth_Primary_Beneficiary_for_self_for_GTenYTLI() throws Exception {

		try {
			log.debug("Clicks on fourth primary beneficiary details for self for GTenYTLI edit button");
			reuseMethod.scrollDown(EditFourthBeneficiary_SelfGIenYTLI);
			EditFourthBeneficiary_SelfGIenYTLI.click();
			Thread.sleep(500);
			log.info(
					"Clicked on fourth primary beneficiary details for self for GTenYTLI edit button successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Click on fourth primary beneficiary details for self for GTenYTLI edit button|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}

	public boolean click_on_Edit_button_for_Eighth_Primary_Beneficiary_for_self_for_GTenYTLI() throws Exception {

		try {
			log.debug("Clicks on Eighth beneficiary details for self for GTenYTLI edit button");
			reuseMethod.scrollDown(EditEighthBeneficiary_SelfGIenYTLI);
			EditEighthBeneficiary_SelfGIenYTLI.click();
			Thread.sleep(500);
			log.info(
					"Clicked on Eighth beneficiary details for self for GTenYTLI edit button successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Click on Eighth beneficiary details for self for GTenYTLI edit button|| Fail"
					+ e.getMessage());
			throw (e);

		}
	}
	
	public Boolean validates_error_message_on_Add_Beneficiary_page_Individual_can_not_be_added_if_trust_already_exists()
			throws Throwable {
		try {
			log.debug("Validate Error Message on Add Beneficiary Page for--Individual cannot be added if Trust already exist.");

			String ExpectedBeneficiaryMsg = PropertyUtility.Load_MessageFile_Data("IndividualTrustErrorMessage");
			ErrorMsg.isDisplayed();
			String actual = ErrorMsg.getText();
			Assert.assertEquals(actual, ExpectedBeneficiaryMsg, "Error message-Individual cannot be added if Trust already exist.--at Add Beneficiary Page does not match");

			log.info("Error Message on Add Beneficiary Page is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Error Messege on Add Beneficiary Page-Individual cannot be added if Trust already exist.|| Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean click_on_Edit_button_for_Fourth_Beneficiary_for_spouse_for_TenYTL(String rowNo) throws Exception {

		try {
			log.debug("Clicks on"+rowNo+" beneficiary details for spouse for TenYTL edit button");
			EditBeneficiary_SpouseTenYTI.findElement(By.xpath("//tr["+rowNo+"]//i[@data-action='edit']")).click();
			Thread.sleep(500);
			log.info("Clicked on"+rowNo+" beneficiary details for spouse for TenYTL edit button successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Click on "+rowNo+"beneficiary details for spouse for TenYTL edit button|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}	
}
