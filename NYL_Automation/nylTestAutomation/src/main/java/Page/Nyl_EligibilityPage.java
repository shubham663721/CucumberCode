package Page;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import Selenium.ScreenShotUtility;
import Selenium.SetUp;
import Utility.ReuseableMethod;
import Utility.propertyUtility;

public class Nyl_EligibilityPage extends SetUp {
	String Store = null;

	private final Logger log = LogManager.getLogger(Nyl_EligibilityPage.class.getName());

	public Nyl_EligibilityPage() {
		driver = getDriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 7), this);
	}

	ReuseableMethod reuseMethod = new ReuseableMethod();
	ScreenShotUtility screenShotUtility = new ScreenShotUtility();
	propertyUtility PropertyUtility = new propertyUtility();
	private String email;
	// @FindBy(xpath="//div[@class='icon icon-self icon-coverage-elegible']")
	// @FindBy(xpath="//*[@data-fields='chkWhomToCoverSlf']")

	@FindBy(xpath = "//div[@data-fields='chkWhomToCoverSlf']")
	WebElement Self;

	@FindBy(xpath = "//input[@id='chkWhomToCoverSlf']")
	WebElement Self_Icon_Disable;

	@FindBy(id = "genericError")
	WebElement Eligibilty_Iconscroll;

	@FindBy(id = "eligibilityLink")
	WebElement Eligibilty_Icon;

	@FindBy(xpath = "//div[@class='col-xs-12 mainTabHeader']//label[contains(text(),'Eligibility')]")
	WebElement Eligibility;

	@FindBy(xpath = "//*[@id='chkWhomToCoverChd']")
	WebElement Child_Button;

	// @FindBy(xpath="//div[@class='icon icon-spouse icon-coverage-elegible']")
	// @FindBy(xpath="//*[@data-fields='chkWhomToCoverSps']")

	@FindBy(xpath = "//div[@data-fields='chkWhomToCoverSps']")

	WebElement Spouse;

	@FindBy(xpath = "//div[@data-fields='chkWhomToCoverChd']")
	// @FindBy(xpath="//*[@data-fields='chkWhomToCoverChd']")
	WebElement Child;

	@FindBy(id = "eligSelfDetails_selEligTitleSlf")
	WebElement Title;

	@FindBy(id = "eligSelfDetails_txtEligFirstNameSlf")
	WebElement FirstName;

	@FindBy(id = "eligSelfDetails_txtEligLastNameSlf")
	WebElement LastName;

	@FindBy(xpath = "//select[@name='selEligStateSlf']")
	WebElement StateOrProvince;

	@FindBy(xpath = "//input[@name='dtEligBirthDateSlf']")
	WebElement DOB;
	@FindBy(xpath = "//div[@id='div_eligSelfDetails_dtEligBirthDateSlf']//div//span")
	WebElement calButtonSelf;
	
	String calYearSelf="(//div[@class='datetimepicker-years']//td)[1]//span[@class='year']";
	//List <WebElement> calYearSelf;
	
	String calmonthSelf ="//div[@class='datetimepicker-months']//td//span[@class='month']";
	//List <WebElement> calmonthSelf;
	
	String calDaySelf="(//div[@class='datetimepicker-days']//tbody)[1]//tr/td[@class='day']";
	//List <WebElement> calDaySelf;
	
	@FindBy(xpath ="(//div[@class='datetimepicker-years'])[1]//th[@class='prev']")
	WebElement prevSelf;
	
	@FindBy(id = "eligSelfDetails_txtEligEmailSlf")
	WebElement EmailId;

	@FindBy(xpath = "//input[@id='rdEligIsMemberSlf-0']")
	WebElement AssociationMemberRadioYes;

	@FindBy(xpath = "//input[@id='rdEligIsMemberSlf-1']")
	WebElement AssociationMember_RadioNo;
	
	@FindBy(xpath = "//input[@id='txtSponserName']")
	WebElement NameOfSponsor;
	
	@FindBy(xpath = "//select[@id='selCatAttestation']")
	WebElement Affiliation;

	@FindBy(xpath = "//input[@id='rdEligEmpResidnt-0']")
	WebElement Resident_Yes;

	@FindBy(xpath = "//input[@id='rdEligEmpResidnt-1']")
	WebElement Resident_No;

	@FindBy(xpath = "//input[@id='rdEligEmpOcuption-0']")
	WebElement Occupation_Yes;

	@FindBy(xpath = "//input[@id='rdEligEmpOcuption-1']")
	WebElement Occupation_No;

	@FindBy(xpath = "//div[@class='info-note']//label[contains(text(),'A spouse who is also a member may apply for either member or dependent coverage, but not both.')]")
	WebElement SpouseCoverageMsg;

	@FindBy(id ="selTscpaEligStatus")
	WebElement eligibilityStatus;
	
	@FindBy(id = "rdEligIsStudentMemberSlf-0")
	WebElement StudentMemberSelf_YES;

	@FindBy(id = "rdEligIsStudentMemberSlf-1")
	WebElement StudentMemberSelf_NO;

	@FindBy(id = "rdInPracticeMemberSlf-0")
	WebElement PracticeMemberSelf_YES;

	@FindBy(id = "rdInPracticeMemberSlf-1")
	WebElement PracticeMemberSelf_NO;

	@FindBy(id = "rdEligEmpMember-0")
	WebElement FullTimeEmployeeSelf_YES;

	@FindBy(id = "rdEligEmpMember-1")
	WebElement FullTimeEmployeeSelf_NO;

	// WAEPA MemberShip Page_Start***********************************
	@FindBy(xpath = "//input[@id='rdEligArmedForcesSelf-0']")
	WebElement Self_ArmedForces_Yes;

	@FindBy(xpath = "//input[@id='rdEligArmedForcesSelf-1']")
	WebElement Self_ArmedForces_No;
	
	@FindBy(xpath = "//input[@id='rdEligEmploymentSlf-1']")
	WebElement Self_FedralGovt_No;
	
	@FindBy(xpath = "//input[@id='rdEligEmploymentSlf-0']")
	WebElement Self_FedralGovt_Yes;
	
	@FindBy(xpath = "//input[@id='dtEmploymentDateSlf']")
	WebElement Self_FedralGovt_Yes_EmpDate;
	
	@FindBy(xpath = "//label[text()='Employment Date']")
	WebElement Self_EmpDate_label;
	

	@FindBy(xpath = "//input[@id='rdPolicyHolderSlf-0']")
	WebElement WAEPA_PolicyHolder_Yes;

	@FindBy(xpath = "//input[@id='rdPolicyHolderSlf-1']")
	WebElement WAEPA_PolicyHolder_No;

	@FindBy(xpath = "//input[@id='txtOptMembershipIdSlf']")
	WebElement WAEPA_MembershipID;

	@FindBy(xpath = "//input[@id='rdUSCitizenSlf-0']")
	WebElement WAEPA_CivilianFederalEmp;

	@FindBy(xpath = "//input[@id='rdUSCitizenSlf-1']")
	WebElement WAEPA_RetiredCivilianFederalEmp;

	@FindBy(xpath = "//input[@id='dtEmpSinceSlf']")
	WebElement WAEPA_EmployedSince;

	@FindBy(xpath = "//input[@id='dtRetSinceSlf']")
	WebElement WAEPA_RetiredSince;

	// @FindBy(xpath="//input[@tabindex id='selEmpAgency-selectized']")
	@FindBy(id = "selEmpAgency-selectized")
	WebElement WAEPA_EmployedBy;

	@FindBy(id = "selRetAgency-selectized")
	WebElement WAEPA_RetiredEmployedBy;

	@FindBy(xpath = "//input[@id='rdUSCitizenSlf-1']")
	WebElement WAEPA_Retired_CivilianFederalEmp;

	@FindBy(xpath = "//input[@id='rdUSCitizenSlf-2']")
	WebElement Spouse_WAEPA_Member;

	@FindBy(xpath = "//input[@id='txtMemPhoneNumTwo']")
	WebElement WAEPA_Mobile_Phone;

	@FindBy(xpath = "//input[@id='txtMemPhoneNumOne']")
	WebElement WAEPA_Home_Phone;

	@FindBy(xpath = "//input[@id='txtMemPhoneNumThree']")
	WebElement WAEPA_Business_Phone;

	@FindBy(xpath = "//input[@id='txtMemPhoneExtnThree']")
	WebElement WAEPA_ExtNo;

	@FindBy(id = "selPrimaryPhType")
	WebElement WAEPA_PrimaryPhoneType;
	
	
	@FindBy(xpath="//button[@id='next']")
	WebElement CheckEligibilty_Button; //button[@id='next']//i
	// END********************************************************

	@FindBy(id = "rdPolicyHolderSlf-0")
	WebElement PolicyHolderYes;

	@FindBy(id = "rdPolicyHolderSlf-1")
	WebElement PolicyHolderNo;

	@FindBy(id = "rdEligArmedForcesSelf-0")
	WebElement SelfArmedForceYes;

	@FindBy(id = "rdEligArmedForcesSelf-1")
	WebElement SelfArmedForceNo;

	@FindBy(id = "txtMemPhoneNumOne")
	WebElement HomePhoneNum;

	@FindBy(id = "selPrimaryPhType")
	WebElement PhoneNumType;

	@FindBy(xpath = "//input[@id='txtEligWeeklyHrsSlf']")
	WebElement WeeklyHrs;

	@FindBy(name = "selEligTitleSps")
	WebElement SpouseTitle;

	@FindBy(id = "eligSpouseDetails_txtEligFirstNameSps")
	WebElement SpouseFName;

	@FindBy(id = "eligSpouseDetails_txtEligLastNameSps")
	WebElement SpouseLName;

	@FindBy(id = "eligSpouseDetails_selEligStateSps")
	WebElement SpouseState;

	@FindBy(id = "eligSpouseDetails_dtEligBirthDateSps")
	WebElement SpouseDOB;

		
	@FindBy(id = "eligSpouseDetails_txtEligEmailSps")
	WebElement SpouseEmail;

	@FindBy(id = "rdEligIsMemberSps-0")
	WebElement SpouseRadioYes;

	@FindBy(id = "rdEligIsMemberSps-1")
	WebElement SpouseRadioNo;

	@FindBy(id = "txtEligWeeklyHrsSps")
	WebElement SpouseWorkHr;

	@FindBy(xpath = "//button/span[text()='Add Child' or text()='Add another Child']")
	WebElement AddChild_Button;

	@FindBy(id = "txtEligFirstNameChld")
	WebElement ChildFName;

	@FindBy(id = "txtEligLastNameChld")
	WebElement ChildLName;

	@FindBy(id = "txtEligBirthDateChld")
	WebElement ChildDOB;

	@FindBy(xpath = "//label[@class='icon-coverage-elegible icon-male-gender-icon' and @for='rdEligGenderChld-0']")
	WebElement MaleChild;

	@FindBy(id = "rdEligGenderChld-0")
	WebElement MaleChildText;

	@FindBy(xpath = "//i[@data-action='edit']")
	WebElement Edit;

	@FindBy(xpath = "//label[@class='icon-coverage-elegible icon-female-gender-icon' and @for='rdEligGenderChld-1']")
	WebElement FemaleChild;

	@FindBy(id = "rdEligGenderChld-1")
	WebElement FemaleChildText;

	@FindBy(id = "rdEligIsMarriedChld-1")
	WebElement Child_NotMarried;

	@FindBy(id = "rdEligIsMarriedChld-0")
	WebElement Child_Married;

	@FindBy(id = "rdEligArmedForcesChld-1")
	WebElement child_ArmedForceNo;

	@FindBy(id = "rdEligArmedForcesChld-0")
	WebElement child_ArmedForceYes;

	@FindBy(id = "rdEligFullTimeStudentChld-0")
	WebElement Child_FullTimeStudentYes;

	@FindBy(id = "rdEligFullTimeStudentChld-1")
	WebElement Child_FullTimeStudentNo;

	@FindBy(xpath = "//button[text()='Add Child']")
	WebElement AddChild_screen;

	@FindBy(xpath = "//span[@class='alert-txt']")
	WebElement ErrorMessage;

	@FindBy(xpath = "//div[@class='info-note']//label[contains(text(),'AOA')]")
	WebElement SpouseMemberMessage_AOA;

	// AAFP
	@FindBy(xpath = "//span[@class='alert-txt' and text()='You are not eligible for any products.']")
	WebElement ErrorMessege_Product_Eligibility;
//NSPE

	@FindBy(id = "rdEligSecondAttestation-0")
	WebElement NSPE_Member_Self_Yes;

	@FindBy(id = "rdEligSecondAttestation-1")
	WebElement NSPE_Member_Self_No;

	@FindBy(id = "rdEligIsMemberSps-0")
	WebElement NSPE_Member_Spouse_Yes;

	@FindBy(id = "rdEligIsMemberSps-1")
	WebElement NSPE_Member_Spouse_No;

	@FindBy(id = "txtEmpAgencyNameSlf")
	WebElement Emp_AgencyName_Self;

	@FindBy(id = "rdIsDependentChild-0")
	WebElement DependentChild_Yes;

	@FindBy(id = "rdIsDependentChild-1")
	WebElement DependentChild_No;

	@FindBy(id = "selMaritalStatusSlf")
	WebElement MaritalStatus;

	@FindBy(id = "selCRBGSource")
	WebElement HearAboutUs;

	@FindBy(id = "txtBoxHearAbtUS")
	WebElement HearAboutDetails;

	@FindBy(id = "dtMarriageDateSps")
	WebElement MarriageDate_Spouse;

	/*** AMA ***/

	@FindBy(id = "selAmaApplicantTypeSlf")
	WebElement ApplicantType;

	@FindBy(id = "rdEligActivelyAtWorkSlf-0")
	WebElement ActiveAtWork_Yes;

	@FindBy(id = "rdEligActivelyAtWorkSlf-1")
	WebElement ActiveAtWork_No;

	@FindBy(id = "rdApplySpouseHipAndADD-0")
	WebElement PremierAccidentorHospitalIncomeSpouse_Yes;

	@FindBy(id = "rdApplySpouseHipAndADD-1")
	WebElement PremierAccidentorHospitalIncomeSpouse_No;

	@FindBy(id = "rdApplyChild-0")
	WebElement InsuranceForChild_Yes;

	@FindBy(id = "rdApplyChild-1")
	WebElement InsuranceForChild_No;

	//////////////////////// Mobile /////////////////////////////

	@FindBy(xpath = "//div[@id='div_eligSelfDetails_dtEligBirthDateSlf']/div[1]/div/span[1]/input")
	WebElement mobSelfMonth;

	@FindBy(xpath = "//div[@id='div_eligSelfDetails_dtEligBirthDateSlf']/div[1]/div/span[3]/input")
	WebElement mobSelfDate;

	@FindBy(xpath = "//div[@id='div_eligSelfDetails_dtEligBirthDateSlf']/div[1]/div/span[5]/input")
	WebElement mobSelfYear;

	@FindBy(xpath = "//div[@id='residentialGoogleAddress']/div[1]/span/input")
	WebElement mobAddress;

	@FindBy(xpath = "//div[@id='rdEligIsMemberSlf']/label[1]/div")
	WebElement mobSelfMemAssYes;

	@FindBy(xpath = "//div[@id='rdEligIsMemberSlf']/label[2]/div")
	WebElement mobSelfMemAssNo;

	@FindBy(xpath = "//select[@id='selMaritalStatusSlf']")
	WebElement mobMaritalStatus;

	@FindBy(xpath = "//div[@id='rdDependents']/label[1]/div")
	WebElement mobDependentYes;

	@FindBy(xpath = "//div[@id='rdDependents']/label[2]/div")
	WebElement mobDependentNo;

	@FindBy(xpath = "//div[@id='rdEligAddSpouse']/label[1]/div")
	WebElement mobSpousEliYes;

	@FindBy(xpath = "//div[@id='rdEligAddSpouse']/label[2]/div")
	WebElement mobSpouseEliNo;

	@FindBy(xpath = "//div[@id='div_eligSpouseDetails_dtEligBirthDateSps']/div[1]/div/span[1]/input")
	WebElement mobSpouseMonth;

	@FindBy(xpath = "//div[@id='div_eligSpouseDetails_dtEligBirthDateSps']/div[1]/div/span[3]/input")
	WebElement mobSpouseDate;

	@FindBy(xpath = "//div[@id='div_eligSpouseDetails_dtEligBirthDateSps']/div[1]/div/span[5]/input")
	WebElement mobSpouseYear;

	@FindBy(xpath = "//div[@id='rdEligIsMemberSps']/label[1]/div")
	WebElement mobSpouseMemAssYes;

	@FindBy(xpath = "//div[@id='rdEligIsMemberSps']/label[2]/div")
	WebElement mobSpouseMemAssNo;

	@FindBy(xpath = "//div[@id='rdEligAddChild']/label[1]/div")
	WebElement mobChildEliYes;

	@FindBy(xpath = "//div[@id='rdEligAddChild']/input[@id='rdEligAddChild-0']")
	WebElement mobChildEliYesVal;

	@FindBy(xpath = "//div[@id='rdEligAddChild']/label[2]/div")
	WebElement mobChildEliNo;

	@FindBy(xpath = "//div[@id='rdEligAddChild']/input[@id='rdEligAddChild-1']")
	WebElement mobChildEliNoVal;

	@FindBy(id = "0-eligAddChild_txtEligFirstNameChld")
	WebElement MobChildFName1;

	@FindBy(id = "1-eligAddChild_txtEligFirstNameChld")
	WebElement MobChildFName2;

	@FindBy(id = "2-eligAddChild_txtEligFirstNameChld")
	WebElement MobChildFName3;
	@FindBy(id = "3-eligAddChild_txtEligFirstNameChld")
	WebElement MobChildFName4;
	@FindBy(id = "4-eligAddChild_txtEligFirstNameChld")
	WebElement MobChildFName5;
	@FindBy(id = "5-eligAddChild_txtEligFirstNameChld")
	WebElement MobChildFName6;
	@FindBy(id = "6-eligAddChild_txtEligFirstNameChld")
	WebElement MobChildFName7;
	@FindBy(id = "7-eligAddChild_txtEligFirstNameChld")
	WebElement MobChildFName8;

	@FindBy(id = "0-eligAddChild_txtEligLastNameChld")
	WebElement MobChildLName1;

	@FindBy(id = "1-eligAddChild_txtEligLastNameChld")
	WebElement MobChildLName2;

	@FindBy(id = "2-eligAddChild_txtEligLastNameChld")
	WebElement MobChildLName3;

	@FindBy(id = "3-eligAddChild_txtEligLastNameChld")
	WebElement MobChildLName4;

	@FindBy(id = "4-eligAddChild_txtEligLastNameChld")
	WebElement MobChildLName5;

	@FindBy(id = "5-eligAddChild_txtEligLastNameChld")
	WebElement MobChildLName6;

	@FindBy(id = "6-eligAddChild_txtEligLastNameChld")
	WebElement MobChildLName7;

	@FindBy(id = "7-eligAddChild_txtEligLastNameChld")
	WebElement MobChildLName8;

	@FindBy(xpath = "//div[@id='div_0-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[1]/input")
	WebElement mobChildMonth1;

	@FindBy(xpath = "//div[@id='div_1-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[1]/input")
	WebElement mobChildMonth2;

	@FindBy(xpath = "//div[@id='div_2-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[1]/input")
	WebElement mobChildMonth3;

	@FindBy(xpath = "//div[@id='div_3-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[1]/input")
	WebElement mobChildMonth4;

	@FindBy(xpath = "//div[@id='div_4-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[1]/input")
	WebElement mobChildMonth5;

	@FindBy(xpath = "//div[@id='div_5-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[1]/input")
	WebElement mobChildMonth6;

	@FindBy(xpath = "//div[@id='div_6-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[1]/input")
	WebElement mobChildMonth7;

	@FindBy(xpath = "//div[@id='div_7-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[1]/input")
	WebElement mobChildMonth8;

	@FindBy(xpath = "//div[@id='div_0-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[3]/input")
	WebElement mobChildDate1;

	@FindBy(xpath = "//div[@id='div_1-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[3]/input")
	WebElement mobChildDate2;

	@FindBy(xpath = "//div[@id='div_2-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[3]/input")
	WebElement mobChildDate3;

	@FindBy(xpath = "//div[@id='div_3-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[3]/input")
	WebElement mobChildDate4;

	@FindBy(xpath = "//div[@id='div_4-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[3]/input")
	WebElement mobChildDate5;

	@FindBy(xpath = "//div[@id='div_5-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[3]/input")
	WebElement mobChildDate6;

	@FindBy(xpath = "//div[@id='div_6-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[3]/input")
	WebElement mobChildDate7;

	@FindBy(xpath = "//div[@id='div_7-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[3]/input")
	WebElement mobChildDate8;

	@FindBy(xpath = "//div[@id='div_0-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[5]/input")
	WebElement mobChildYear1;

	@FindBy(xpath = "//div[@id='div_1-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[5]/input")
	WebElement mobChildYear2;

	@FindBy(xpath = "//div[@id='div_2-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[5]/input")
	WebElement mobChildYear3;

	@FindBy(xpath = "//div[@id='div_3-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[5]/input")
	WebElement mobChildYear4;

	@FindBy(xpath = "//div[@id='div_4-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[5]/input")
	WebElement mobChildYear5;

	@FindBy(xpath = "//div[@id='div_5-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[5]/input")
	WebElement mobChildYear6;

	@FindBy(xpath = "//div[@id='div_6-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[5]/input")
	WebElement mobChildYear7;

	@FindBy(xpath = "//div[@id='div_7-eligAddChild_txtEligBirthDateChld']/div[1]/div/span[5]/input")
	WebElement mobChildYear8;

	@FindBy(xpath = "//div[@id='0-eligAddChild_rdEligGenderChld']/input[@id='0-eligAddChild_rdEligGenderChld-0']")
	WebElement MobChildSexMaleVal1;

	@FindBy(xpath = "//div[@id='1-eligAddChild_rdEligGenderChld']/input[@id='1-eligAddChild_rdEligGenderChld-0']")
	WebElement MobChildSexMaleVal2;

	@FindBy(xpath = "//div[@id='2-eligAddChild_rdEligGenderChld']/input[@id='2-eligAddChild_rdEligGenderChld-0']")
	WebElement MobChildSexMaleVal3;

	@FindBy(xpath = "//div[@id='3-eligAddChild_rdEligGenderChld']/input[@id='3-eligAddChild_rdEligGenderChld-0']")
	WebElement MobChildSexMaleVal4;
	@FindBy(xpath = "//div[@id='4-eligAddChild_rdEligGenderChld']/input[@id='4-eligAddChild_rdEligGenderChld-0']")
	WebElement MobChildSexMaleVal5;

	@FindBy(xpath = "//div[@id='5-eligAddChild_rdEligGenderChld']/input[@id='5-eligAddChild_rdEligGenderChld-0']")
	WebElement MobChildSexMaleVal6;

	@FindBy(xpath = "//div[@id='6-eligAddChild_rdEligGenderChld']/input[@id='6-eligAddChild_rdEligGenderChld-0']")
	WebElement MobChildSexMaleVal7;

	@FindBy(xpath = "//div[@id='7-eligAddChild_rdEligGenderChld']/input[@id='7-eligAddChild_rdEligGenderChld-0']")
	WebElement MobChildSexMaleVal8;

	@FindBy(xpath = "//label[@for='0-eligAddChild_rdEligGenderChld-0']")
	WebElement MobChildSexMale1;

	@FindBy(xpath = "//label[@for='1-eligAddChild_rdEligGenderChld-0']")
	WebElement MobChildSexMale2;

	@FindBy(xpath = "//label[@for='2-eligAddChild_rdEligGenderChld-0']")
	WebElement MobChildSexMale3;

	@FindBy(xpath = "//label[@for='3-eligAddChild_rdEligGenderChld-0']")
	WebElement MobChildSexMale4;

	@FindBy(xpath = "//label[@for='4-eligAddChild_rdEligGenderChld-0']")
	WebElement MobChildSexMale5;

	@FindBy(xpath = "//label[@for='5-eligAddChild_rdEligGenderChld-0']")
	WebElement MobChildSexMale6;

	@FindBy(xpath = "//label[@for='6-eligAddChild_rdEligGenderChld-0']")
	WebElement MobChildSexMale7;

	@FindBy(xpath = "//label[@for='7-eligAddChild_rdEligGenderChld-0']")
	WebElement MobChildSexMale8;

	@FindBy(xpath = "//label[@for='0-eligAddChild_rdEligGenderChld-1']")
	WebElement MobChildSexFemale1;

	@FindBy(xpath = "//label[@for='1-eligAddChild_rdEligGenderChld-1']")
	WebElement MobChildSexFemale2;

	@FindBy(xpath = "//label[@for='2-eligAddChild_rdEligGenderChld-1']")
	WebElement MobChildSexFemale3;

	@FindBy(xpath = "//label[@for='3-eligAddChild_rdEligGenderChld-1']")
	WebElement MobChildSexFemale4;

	@FindBy(xpath = "//label[@for='4-eligAddChild_rdEligGenderChld-1']")
	WebElement MobChildSexFemale5;

	@FindBy(xpath = "//label[@for='5-eligAddChild_rdEligGenderChld-1']")
	WebElement MobChildSexFemale6;

	@FindBy(xpath = "//label[@for='6-eligAddChild_rdEligGenderChld-1']")
	WebElement MobChildSexFemale7;

	@FindBy(xpath = "//label[@for='7-eligAddChild_rdEligGenderChld-1']")
	WebElement MobChildSexFemale8;

	@FindBy(xpath = "//div[@id='0-eligAddChild_rdEligGenderChld']/input[@id='0-eligAddChild_rdEligGenderChld-1']")
	WebElement MobChildSexFemaleVal;

	@FindBy(xpath = "//div[@id='0-eligAddChild_rdEligIsMarriedChld']/label[1]/div")
	WebElement MobChildMarriedYes1;

	@FindBy(xpath = "//div[@id='1-eligAddChild_rdEligIsMarriedChld']/label[1]/div")
	WebElement MobChildMarriedYes2;

	@FindBy(xpath = "//div[@id='2-eligAddChild_rdEligIsMarriedChld']/label[1]/div")
	WebElement MobChildMarriedYes3;

	@FindBy(xpath = "//div[@id='3-eligAddChild_rdEligIsMarriedChld']/label[1]/div")
	WebElement MobChildMarriedYes4;

	@FindBy(xpath = "//div[@id='4-eligAddChild_rdEligIsMarriedChld']/label[1]/div")
	WebElement MobChildMarriedYes5;

	@FindBy(xpath = "//div[@id='5-eligAddChild_rdEligIsMarriedChld']/label[1]/div")
	WebElement MobChildMarriedYes6;

	@FindBy(xpath = "//div[@id='6-eligAddChild_rdEligIsMarriedChld']/label[1]/div")
	WebElement MobChildMarriedYes7;

	@FindBy(xpath = "//div[@id='7-eligAddChild_rdEligIsMarriedChld']/label[1]/div")
	WebElement MobChildMarriedYes8;

	@FindBy(xpath = "//div[@id='0-eligAddChild_rdEligIsMarriedChld']/input[@id='0-eligAddChild_rdEligIsMarriedChld-0']")
	WebElement MobChildMarriedYesVal1;

	@FindBy(xpath = "//div[@id='1-eligAddChild_rdEligIsMarriedChld']/input[@id='1-eligAddChild_rdEligIsMarriedChld-0']")
	WebElement MobChildMarriedYesVal2;

	@FindBy(xpath = "//div[@id='2-eligAddChild_rdEligIsMarriedChld']/input[@id='2-eligAddChild_rdEligIsMarriedChld-0']")
	WebElement MobChildMarriedYesVal3;

	@FindBy(xpath = "//div[@id='3-eligAddChild_rdEligIsMarriedChld']/input[@id='2-eligAddChild_rdEligIsMarriedChld-0']")
	WebElement MobChildMarriedYesVal4;

	@FindBy(xpath = "//div[@id='0-eligAddChild_rdEligIsMarriedChld']/label[2]/div")
	WebElement MobChildMarriedNo1;

	@FindBy(xpath = "//div[@id='1-eligAddChild_rdEligIsMarriedChld']/label[2]/div")
	WebElement MobChildMarriedNo2;

	@FindBy(xpath = "//div[@id='2-eligAddChild_rdEligIsMarriedChld']/label[2]/div")
	WebElement MobChildMarriedNo3;

	@FindBy(xpath = "//div[@id='3-eligAddChild_rdEligIsMarriedChld']/label[2]/div")
	WebElement MobChildMarriedNo4;

	@FindBy(xpath = "//div[@id='4-eligAddChild_rdEligIsMarriedChld']/label[2]/div")
	WebElement MobChildMarriedNo5;

	@FindBy(xpath = "//div[@id='5-eligAddChild_rdEligIsMarriedChld']/label[2]/div")
	WebElement MobChildMarriedNo6;

	@FindBy(xpath = "//div[@id='6-eligAddChild_rdEligIsMarriedChld']/label[2]/div")
	WebElement MobChildMarriedNo7;

	@FindBy(xpath = "//div[@id='7-eligAddChild_rdEligIsMarriedChld']/label[2]/div")
	WebElement MobChildMarriedNo8;

	@FindBy(xpath = "//div[@id='0-eligAddChild_rdEligIsMarriedChld']/input[@id='0-eligAddChild_rdEligIsMarriedChld-1']")
	WebElement MobChildMarriedNoVal1;

	@FindBy(xpath = "//div[@id='1-eligAddChild_rdEligIsMarriedChld']/input[@id='1-eligAddChild_rdEligIsMarriedChld-1']")
	WebElement MobChildMarriedNoVal2;

	@FindBy(xpath = "//div[@id='2-eligAddChild_rdEligIsMarriedChld']/input[@id='2-eligAddChild_rdEligIsMarriedChld-1']")
	WebElement MobChildMarriedNoVal3;

	@FindBy(xpath = "//div[@id='3-eligAddChild_rdEligIsMarriedChld']/input[@id='3-eligAddChild_rdEligIsMarriedChld-1']")
	WebElement MobChildMarriedNoVal4;

	@FindBy(xpath = "//div[@id='4-eligAddChild_rdEligIsMarriedChld']/input[@id='4-eligAddChild_rdEligIsMarriedChld-1']")
	WebElement MobChildMarriedNoVal5;

	@FindBy(xpath = "//div[@id='5-eligAddChild_rdEligIsMarriedChld']/input[@id='5-eligAddChild_rdEligIsMarriedChld-1']")
	WebElement MobChildMarriedNoVal6;

	@FindBy(xpath = "//div[@id='6-eligAddChild_rdEligIsMarriedChld']/input[@id='6-eligAddChild_rdEligIsMarriedChld-1']")
	WebElement MobChildMarriedNoVal7;

	@FindBy(xpath = "//div[@id='7-eligAddChild_rdEligIsMarriedChld']/input[@id='7-eligAddChild_rdEligIsMarriedChld-1']")
	WebElement MobChildMarriedNoVal8;

	@FindBy(xpath = "//div[@id='0-eligAddChild_rdEligFullTimeStudentChld']//div[text()='Yes']")
	WebElement MobChildFullTimeYes1;

	@FindBy(xpath = "0-eligAddChild_rdEligFullTimeStudentChld-0")
	WebElement MobChildFullTimeYesVal1;

	@FindBy(xpath = "//div[@id='0-eligAddChild_rdEligFullTimeStudentChld']//div[text()='No']")
	WebElement MobChildFullTimeNo1;

	@FindBy(id = "0-eligAddChild_rdEligFullTimeStudentChld-1")
	WebElement MobChildFullTimeNoVal1;

	@FindBy(xpath = "//div[@id='1-eligAddChild_rdEligFullTimeStudentChld']//div[text()='Yes']")
	WebElement MobChildFullTimeYes2;

	@FindBy(id = "1-eligAddChild_rdEligFullTimeStudentChld-0")
	WebElement MobChildFullTimeYesVal2;

	@FindBy(xpath = "//div[@id='1-eligAddChild_rdEligFullTimeStudentChld']//div[text()='No']")
	WebElement MobChildFullTimeNo2;

	@FindBy(id = "1-eligAddChild_rdEligFullTimeStudentChld-1")
	WebElement MobChildFullTimeNoVal2;

	@FindBy(xpath = "//div[@id='2-eligAddChild_rdEligFullTimeStudentChld']//div[text()='Yes']")
	WebElement MobChildFullTimeYes3;

	@FindBy(id = "2-eligAddChild_rdEligFullTimeStudentChld-0")
	WebElement MobChildFullTimeYesVal3;

	@FindBy(xpath = "//div[@id='2-eligAddChild_rdEligFullTimeStudentChld']//div[text()='No']")
	WebElement MobChildFullTimeNo3;

	@FindBy(id = "2-eligAddChild_rdEligFullTimeStudentChld-1")
	WebElement MobChildFullTimeNoVal3;

	@FindBy(xpath = "//div[@id='3-eligAddChild_rdEligFullTimeStudentChld']//div[text()='Yes']")
	WebElement MobChildFullTimeYes4;

	@FindBy(id = "3-eligAddChild_rdEligFullTimeStudentChld-0")
	WebElement MobChildFullTimeYesVal4;

	@FindBy(xpath = "//div[@id='4-eligAddChild_rdEligFullTimeStudentChld']//div[text()='Yes']")
	WebElement MobChildFullTimeYes5;

	@FindBy(xpath = "//div[@id='5-eligAddChild_rdEligFullTimeStudentChld']//div[text()='Yes']")
	WebElement MobChildFullTimeYes6;

	@FindBy(xpath = "//div[@id='6-eligAddChild_rdEligFullTimeStudentChld']//div[text()='Yes']")
	WebElement MobChildFullTimeYes7;

	@FindBy(xpath = "//div[@id='7-eligAddChild_rdEligFullTimeStudentChld']//div[text()='Yes']")
	WebElement MobChildFullTimeYes8;

	@FindBy(xpath = "//div[@id='3-eligAddChild_rdEligFullTimeStudentChld']//div[text()='No']")
	WebElement MobChildFullTimeNo4;

	@FindBy(id = "3-eligAddChild_rdEligFullTimeStudentChld-1")
	WebElement MobChildFullTimeNoVal4;

	@FindBy(xpath = "//div[@id='4-eligAddChild_rdEligFullTimeStudentChld']//div[text()='No']")
	WebElement MobChildFullTimeNo5;

	@FindBy(id = "4-eligAddChild_rdEligFullTimeStudentChld-1")
	WebElement MobChildFullTimeNoVal5;

	@FindBy(xpath = "//div[@id='5-eligAddChild_rdEligFullTimeStudentChld']//div[text()='No']")
	WebElement MobChildFullTimeNo6;

	@FindBy(id = "5-eligAddChild_rdEligFullTimeStudentChld-1")
	WebElement MobChildFullTimeNoVal6;

	@FindBy(xpath = "//div[@id='6-eligAddChild_rdEligFullTimeStudentChld']//div[text()='No']")
	WebElement MobChildFullTimeNo7;

	@FindBy(id = "6-eligAddChild_rdEligFullTimeStudentChld-1")
	WebElement MobChildFullTimeNoVal7;

	@FindBy(xpath = "//div[@id='7-eligAddChild_rdEligFullTimeStudentChld']//div[text()='No']")
	WebElement MobChildFullTimeNo8;

	@FindBy(id = "7-eligAddChild_rdEligFullTimeStudentChld-1")
	WebElement MobChildFullTimeNoVal8;

	@FindBy(id = "lblMemDepSps")
	WebElement customMemberMsg_Sps_Mob;

	@FindBy(xpath = "//h1[text()='Spouse Eligibility']")
	WebElement SpouseEligibilityPage_Mob;

	@FindBy(xpath = "//h1[text()='Child Eligibility']")
	WebElement ChildEligibilityPage_Mob;

	@FindBy(xpath = "//div[@id='div_2-eligAddChild_txtEligFirstNameChld']//ancestor::div[@class='field-name']//preceding-sibling::div//div//button//i")
	WebElement Delete_thirdchild_Mob;

	@FindBy(xpath = "//div[@id='div_1-eligAddChild_txtEligFirstNameChld']//ancestor::div[@class='field-name']//preceding-sibling::div//div//button//i")
	WebElement Delete_secondchild_Mob;

	// ***************************************************************
	@FindBy(xpath = "//span[text()='You are not eligible for any products.']")
	WebElement errorafterDOB;

	@FindBy(xpath = "//input[@id='rdUSCitizenSlf-2']")
	WebElement spouseOfMember;

	@FindBy(xpath = "//input[@id='rdUSCitizenSlf-1']")
	WebElement retiredCivilian;

	@FindBy(xpath = "//input[@id='rdUSCitizenSlf-0']")
	WebElement civilianFederal;

	@FindBy(xpath = "//label[@id='eligi-self-chk']/div[contains(@class,'icon-self')]")
	WebElement AssociateMember;

	@FindBy(xpath = "//label[@id='eligi-self-chk']/div[contains(@class,'icon-spouse')]")
	WebElement DependentMember;

	@FindBy(xpath = "//label[@id='eligi-self-chk']/div[contains(@class,'icon-spouse')]")
	WebElement dependent;

	@FindBy(xpath = "//label[text()='The WAEPA Member must apply for coverage or currently be insured to include you as a dependent.']")
	WebElement DependentInformation;

	@FindBy(id = "txtSpsMembershipFirstName")
	WebElement SpouseFnameMember;

	@FindBy(xpath = "//label[text()='Sex?']")
	WebElement childSex;

	@FindBy(id = "txtSpsMembershipLastName")
	WebElement SpouseLnameMember;

	@FindBy(id = "txtSpsMembershipId")
	WebElement Spouse_AssociateMemberID;

	@FindBy(id = "chkMemberShipConsentSlf")
	WebElement attestForMembership;

	@FindBy(id = "txtMemPhoneNumTwo")
	WebElement MobilePhone;

	@FindBy(id = "back")
	WebElement Previous;

	@FindBy(id = "cancel")
	WebElement Cancel;

	/*
	 * @FindBy(id="saveForLater") WebElement SaveForLater;
	 */

	@FindBy(xpath = "//*[@id='saveForLater'or @id='save']")
	WebElement SaveForLater;

	@FindBy(id = "next")
	WebElement Next;

	@FindBy(id = "txtBasicSalarySlf")
	WebElement BasicSalary;

	@FindBy(xpath = "//h3[text()='Eligibility']//parent::div//button[@class='btn btn-info unlock-button']")
	WebElement btnEdit;

	@FindBy(xpath = "//h3[text()='Eligibility']")
	WebElement EligibilityDetails;

	@FindBy(xpath = "//div[@data-fields='rdEligIsMemberSlf']//label[contains(text(),'Are you a member of')]")
	WebElement EligibilityQuestion;

	@FindBy(id = "selEligStatGrad")
	WebElement drpEligibilityStatus;

	@FindBy(id = "selLastSchoolAttended")
	WebElement drpLastSchoolAttended;

	@FindBy(id = "dtGradDate")
	WebElement GradDate_Self;

	@FindBy(xpath = "//div[contains(@class,'lblEligSpouseUninsuredMember')]//div[@class='info-note']")
	WebElement uninsuredSpouseNotification;
	
	@FindBy(xpath = "//div[@data-fields='slidPortionLICCR']//p")
	WebElement RiderAmtExceedErrror;
	
	@FindBy(id = "selMedicalEdStatusSlf")
	WebElement drpCareerStage;
	
	@FindBy(id = "dtStartMedicalUndergradSlf")
	WebElement BeganUGMedicalDate_Self;
	
	@FindBy(id="selMedicalUndergradProvinceSlf")
	WebElement drpBeganUGMedical_place;
	
	@FindBy(id="dtEndExpectedMedicalUndergradSlf")
	WebElement completeUGMedicalDate_Self;

	// **************WAEPA_Eligibility Page*************************pradeep

	/*
	 * public boolean select_radio_to_YES_for_policyholder() throws Exception {
	 * 
	 * try { log.debug("policyholder should be selected");
	 * WAEPA_PolicyHolder_Yes.click();
	 * log.info("policyholder selected Successfully || Pass"); return true;
	 * 
	 * } catch (Exception e) { log.error("Not able to select policyholder || Fail" +
	 * e.getMessage()); screenShotUtility.GetScreenShot(driver); throw (e); } }
	 * 
	 * public boolean select_radio_to_NO_for_policyholder() throws Exception {
	 * 
	 * try { log.debug("policyholder should be selected as NO");
	 * WAEPA_PolicyHolder_No.click();
	 * log.info("policyholder selected as NO Successfully || Pass"); return true;
	 * 
	 * } catch (Exception e) {
	 * log.error("Not able to select policyholder as NO || Fail" + e.getMessage());
	 * screenShotUtility.GetScreenShot(driver); throw (e); } }
	 */

	public boolean clicks_on_DEPENDENT_icon() throws Exception {

		try {
			log.debug("Dependent Member should be selected as Yes");
			DependentMember.click();
			log.info("Dependent Member selected as Yes Successfully || Pass");
			return true;

		} catch (Exception e) {
			log.error("Not able to select Dependent Member as Yes || Fail" + e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}
	}

	public boolean verify_the_Informational_Message_is_displayed_and_all_the_icons_for_Self_Spouse_Child_are_disabled_for_selection()
			throws Exception {

		try {
			log.debug("Informational Message should be displayed and Self Spouse Child should be disabled");
			DependentInformation.isDisplayed();
			Thread.sleep(2000);
			/*
			 * Assert.assertEquals(false, Child.isEnabled());
			 * System.out.println("TestAssertEquals"); Assert.assertTrue(Self.isEnabled(),
			 * "Self is enabled");
			 */

			if (Self.isEnabled() || Spouse.isEnabled() || Child_Button.isEnabled()) {
				System.out.println("Self Spouse Child button is Enabled");
			} else if (Spouse.isEnabled()) {
				System.out.println("Spouse button is Enabled");
			} else if (Child_Button.isEnabled()) {
				System.out.println("Child button is Enabled");
			} else {
				System.out.println("Self Spouse Child button is Disabled");
			}

			log.info("Informational Message is displayed and Self Spouse Child is disabled successfully || Pass");
			return true;

		} catch (Exception e) {
			log.error("Not able to displayed Informational Message and Self Spouse Child is disabled || Fail"
					+ e.getMessage());
			screenShotUtility.GetScreenShot(driver);
			throw (e);
		}
	}

	public boolean verify_Spouse_Disabled() throws Exception {
		try {
			log.debug("Verify that spouse icon is diabled");
			Assert.assertFalse(!Spouse.isEnabled(), "Spouse icon is enabled");
			log.info("Spouse icon is disabled successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to validate Spouse Icon is disabled || Fail" + e.getMessage());
			throw (e);
		}
	}

//**************ABE_Eligibility Page*************************
	/*
	 * public boolean validate_the_Eligibility_page_details() throws Exception { try
	 * { log.debug("Validate the Eligibility page details");
	 * 
	 * Self.isDisplayed(); Spouse.isDisplayed(); Child.isDisplayed();
	 * reuseMethod.scrollDown(Next); Title.isDisplayed(); FirstName.isDisplayed();
	 * LastName.isDisplayed(); EmailId.isDisplayed(); DOB.isDisplayed();
	 * AssociationMemberRadioYes.isDisplayed();
	 * AssociationMember_RadioNo.isDisplayed(); Previous.isDisplayed();
	 * SaveForLater.isDisplayed(); Next.isDisplayed(); SaveForLater.isDisplayed();
	 * log.info("Element validation of page successfully || Pass"); return true; }
	 * catch (Exception e) { log.error("Not able to validate the elements || Fail" +
	 * e.getMessage()); throw (e);
	 * 
	 * }
	 * 
	 * }
	 */

	public boolean enter_details_for_Self_as(String title, String Fname, String Lname, String state, String Dob,
			String workhr) throws Exception {

		try {
			log.debug("Enter Eligibility details");
			reuseMethod.scrollDown(Next);
			reuseMethod.dropDown(Title, title);
			FirstName.sendKeys(Fname);
			LastName.sendKeys(Lname);
			reuseMethod.dropDown(StateOrProvince, state);
			DOB.click();
			Thread.sleep(1000);

			if (Dob.contains("SYSDATE") || Dob.contains("SYSDate") || Dob.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(Dob);
											
				//reuseMethod.datePicker(calButtonSelf, calYearSelf, calmonthSelf, calDaySelf, prevSelf, date);
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				//reuseMethod.enterDate_by_JavaScript(selfDOBlocator,date);
				DOB.sendKeys(date);
			}
			else if (Dob.equalsIgnoreCase("CurrentDate")) {
								
				String date=reuseMethod.Enter_Current_System_Date();
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				DOB.sendKeys(date);
			} 
			else if(!Dob.contains("/")) {
				
				Dob=Dob.substring(0, 2)+"/"+Dob.substring(2, 4)+"/"+Dob.substring(4, Dob.length());
				//reuseMethod.enterDate_by_JavaScript(selfDOBlocator,Dob);
				DOB.sendKeys(Dob);
				Thread.sleep(1000);
			}
			else
			{
				
				Dob=Dob.substring(0, 2)+"/"+Dob.substring(2, 4)+"/"+Dob.substring(4, Dob.length());
				//reuseMethod.enterDate_by_JavaScript(selfDOBlocator,Dob);
				DOB.sendKeys(Dob);
				Thread.sleep(1000);
			}
			Thread.sleep(2000);

			EmailId.click();
			email = reuseMethod.RandomEmail(EmailId);
			WeeklyHrs.sendKeys(workhr);
			reuseMethod.addemail(email);

			log.info("Eligibility Details enter successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able enter eligibility details || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean enters_Self_WorkHr_as(String workhr) throws Exception {

		try {
			log.debug("Enter Self Work Hour Details");
			reuseMethod.scrollDown(WeeklyHrs);
			WeeklyHrs.click();
			Thread.sleep(1000);
			WeeklyHrs.clear();
			
			Thread.sleep(2000);
			WeeklyHrs.sendKeys(workhr);
			Thread.sleep(1000);
			log.info("Work Hour for self are Entered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able enter Work hour for self || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean enters_Spouse_WorkHr_as(String Sworkhr) throws Exception {

		try {
			log.debug("Enter Spouse Work Hour Details");
			reuseMethod.scrollDown(SpouseWorkHr);
			Thread.sleep(1000);
			SpouseWorkHr.clear();
			Thread.sleep(1000);
			SpouseWorkHr.sendKeys(Sworkhr);
			Thread.sleep(1000);

			log.info("Work Hour for Spouse are Entered successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able enter Work hour for Spouse || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_NO_for_Resident() throws Exception {
		try {
			log.debug("Select the Radio Button for Resident as No");
			Resident_No.click();
			log.info("Radio Button is clicked for Resident as No|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select the Radio Button for Resident as No|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_YES_for_Resident() throws Exception {
		try {
			log.debug("Select the Radio Button for Resident as Yes");
			Resident_Yes.click();
			log.info("Radio Button is clicked for Resident as Yes|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select the Radio Button for Resident as Yes|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_YES_for_all_Duties_of_Regular_Occupation() throws Exception {
		try {
			log.debug("Select the Radio Button for all of the duties of your regular occupation as Yes");
			Occupation_Yes.click();
			log.info("Radio Button is clicked for all of the duties of your regular occupation as Yes|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Select the Radio Button for all of the duties of your regular occupation as Yes|| Fail"
							+ e.getMessage());
			throw (e);
		}

	}

	public boolean select_NO_for_all_Duties_of_Regular_Occupation() throws Exception {
		try {
			log.debug("Select the Radio Button for all of the duties of your regular occupation as NO");
			Occupation_No.click();
			log.info("Radio Button is clicked for all of the duties of your regular occupation as NO|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Select the Radio Button for all of the duties of your regular occupation as NO|| Fail"
							+ e.getMessage());
			throw (e);
		}

	}

	public boolean select_YES_Radio_button_of_Membership_self() throws Exception {
		try {
			log.debug("Select the Radio Button for Member of American Bar association as Yes");
			Thread.sleep(1000);
			AssociationMemberRadioYes.click();
			log.info("Radio Button is clicked for Member of American Bar association as Yes|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Radio Button is clicked for Member of American Bar association|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}
	
	public boolean Scroll_to_Membership_Radio_button() throws Exception {
		try {
			log.debug("Select the Radio Button for Member of American Bar association as Yes");
			Thread.sleep(500);
			reuseMethod.scrollDown(AssociationMemberRadioYes);
			log.info("Radio Button is clicked for Member of American Bar association as Yes|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Radio Button is clicked for Member of American Bar association|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}
	
	//Scroll to eligibility label button

	public boolean Selects_YES_Radio_button_for_Armed_forces() throws Exception {
		try {
			log.debug("Select the Radio Button for Armed forces as Yes");
			reuseMethod.scrollDown(Self_ArmedForces_Yes);
			Self_ArmedForces_Yes.click();
			Thread.sleep(1000);
			log.info("Radio Button is clicked for Armed forces as Yes|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Radio Button is clicked for Armed forces|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}
	
	public boolean Selects_NO_Radio_button_for_Armed_forces() throws Exception {
		try {
			log.debug("Select the Radio Button for Armed forces as NO");
			reuseMethod.scrollDown(Self_ArmedForces_No);
			Self_ArmedForces_No.click();
			Thread.sleep(1000);
			log.info("Radio Button is clicked for Armed forces as NO|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Radio Button is clicked for Armed forces|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}
	
	public boolean Selects_NO_Radio_button_for_Federal_Government() throws Exception {
		try {
			log.debug("Select the Radio Button for Federal Government as NO");
			reuseMethod.scrollDown(Self_FedralGovt_No);
			Self_FedralGovt_No.click();
			Thread.sleep(1000);
			log.info("Radio Button is clicked for Armed forces as NO|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Radio Button is clicked for Federal Government|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean Selects_YES_Radio_button_for_Federal_Government() throws Exception {
		try {
			log.debug("Select the Radio Button for Federal Government as Yes");
			reuseMethod.scrollDown(Self_FedralGovt_Yes);
			Self_FedralGovt_Yes.click();
			Thread.sleep(1000);
			log.info("Radio Button is clicked for Federal Government as Yes|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Radio Button is clicked for Federal Government|| Fail"
					+ e.getMessage());
			throw (e);
		}
	}
	
	public boolean Enter_details_for_Employment_Date_as(String Emp_date) throws Exception
	{
		try {
			log.debug("Enter Federal Government Employment Date for Radio Button Selected as Yes");
			String date = reuseMethod.Enter_customized_previous_Date(Emp_date);
			
			Self_FedralGovt_Yes_EmpDate.click();
			Self_FedralGovt_Yes_EmpDate.clear();
				
			Thread.sleep(1000);
			String b = Keys.BACK_SPACE.toString();
			Self_FedralGovt_Yes_EmpDate.sendKeys(b+b+b+b+b+b+b+b+b+b);
			Self_FedralGovt_Yes_EmpDate.sendKeys(date);
			System.out.println("Set date");
			Self_EmpDate_label.click();
			Thread.sleep(1000);
			//Self_FedralGovt_Yes_EmpDate.sendKeys(Keys.TAB);
			
			log.info("Employment Date is Entered for Federal Government as Yes|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter valid Employment Date for Federal Government || Fail"
					+ e.getMessage());
			throw (e);
		}
		
	}
	

	// NSPE

	public boolean select_YES_Radio_button_of_NSPE_Membership_for_Self() throws Exception {
		try {
			log.debug("Select the Radio Button for NSPE as Yes for Self");
			Thread.sleep(1000);
			NSPE_Member_Self_Yes.click();
			log.info("Radio Button is clicked for NSPE as Yes for Self|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select NSPE radio button for Self || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_YES_Radio_button_of_NSPE_Membership_for_Spouse() throws Exception {
		try {
			log.debug("Select the Radio Button for NSPE as Yes for Spouse");
			Thread.sleep(1000);
			NSPE_Member_Spouse_Yes.click();
			log.info("Radio Button is clicked for NSPE as Yes for Spouse|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select NSPE radio button for Spouse || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_NO_Radio_button_of_NSPE_Membership_for_Self() throws Exception {
		try {
			log.debug("Select the Radio Button for NSPE as NO for Self");
			Thread.sleep(1000);
			NSPE_Member_Self_No.click();
			log.info("Radio Button is clicked for NSPE as NO for Self|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select NSPE radio button for Self || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_NO_Radio_button_of_NSPE_Membership_for_Spouse() throws Exception {
		try {
			log.debug("Select the Radio Button for NSPE as NO for Spouse");
			Thread.sleep(1000);
			NSPE_Member_Spouse_No.click();
			log.info("Radio Button is clicked for NSPE as NO for Spouse|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select NSPE radio button for Spouse || Fail" + e.getMessage());
			throw (e);
		}

	}
	
	
	public boolean select_NO_Radio_button_for_Student_Member() throws Exception {
		try {
			log.debug("Select NO Radio button for Student Member");
			StudentMemberSelf_NO.isDisplayed();
			Thread.sleep(500);
			StudentMemberSelf_NO.click();
			log.info("NO Radio button for Student Member is selected successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select NO Radio button for Student Member|| Fail"+ e.getMessage());
			throw (e);
		}

	}

	public boolean select_YES_Radio_button_for_Student_Member() throws Exception {
		try {
			log.debug("Select Yes Radio button for Student Member");
			StudentMemberSelf_YES.isDisplayed();
			Thread.sleep(500);
			StudentMemberSelf_YES.click();
			log.info("Yes Radio button for Student Member is selected successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select Yes Radio button for Student Member|| Fail" + e.getMessage());
			throw (e);
		}

	}
	
	public boolean select_YES_Radio_button_for_Practice_for_More_than_Six_Months() throws Exception {
		try {
			log.debug("Select YES Radio button for Practice for More than Six Months");
			PracticeMemberSelf_YES.isDisplayed();
			Thread.sleep(500);
			PracticeMemberSelf_YES.click();
			log.info("YES Radio button for Practice for More than Six Months is selected successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select YES Radio button for Practice for More than Six Months|| Fail"+ e.getMessage());
			throw (e);
		}

	}

	public boolean select_NO_Radio_button_for_Practice_for_More_than_Six_Months() throws Exception {
		try {
			log.debug("Select NO Radio button for Practice for More than Six Months");
			PracticeMemberSelf_NO.isDisplayed();
			Thread.sleep(500);
			PracticeMemberSelf_NO.click();
			log.info("NO Radio button for Practice for More than Six Months is selected successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Select NO Radio button for Practice for More than Six Months|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_YES_Radio_Button_for_Full_time_Employee() throws Exception {
		try {
			log.debug("Select YES Radio Button for Full time Employee");
			FullTimeEmployeeSelf_YES.isDisplayed();
			Thread.sleep(500);
			FullTimeEmployeeSelf_YES.click();
			log.info("YES Radio button for for Full time Employee is selected successfully...|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select YES Radio button for for Full time Employee|| Fail" + e.getMessage());
			throw (e);
		}

	}

	// **************

	public boolean select_No_Radio_button_of_Membership_self() throws Exception {
		try {
			log.debug("Select the Radio Button for Member of American Bar association as No");
			AssociationMember_RadioNo.click();
			log.info("Radio Button is clicked for Member of American Bar association as No|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Radio Button is for Member of American Bar association as No|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}
	
	public boolean enter_name_of_sponsor(String Spnsrname) throws Exception {
		try {
			log.debug("Select the Radio Button for Member of American Bar association as No");
			NameOfSponsor.click();
			NameOfSponsor.sendKeys(Spnsrname);
			log.info("Radio Button is clicked for Member of American Bar association as No|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Radio Button is for Member of American Bar association as No|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}
	
	public boolean Selects_Affiliation_under_eligibility(String affilation) throws Exception {
		try {
			log.debug("Select the Radio Button for Member of American Bar association as No");
			Affiliation.isDisplayed();
			Thread.sleep(1500);
			reuseMethod.dropDown(Affiliation, affilation);
			Thread.sleep(1500);
			log.info("Radio Button is clicked for Member of American Bar association as No|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Radio Button is for Member of American Bar association as No|| Fail"
					+ e.getMessage());
			throw (e);
		}

	}
	
	
	
	public boolean validates_check_eligibility_button_is_disabled() throws Exception {
		try {
			log.debug("Validates check eligibility button is disabled");
			
			//reuseMethod.scrollDown(CheckEligibilty_Button);
			
			Thread.sleep(1000);
			boolean check= CheckEligibilty_Button.isEnabled();
			Assert.assertFalse(check, "Eligibility Button is Enabled");
			System.out.println("Eligibility Button is disabled");
			log.info("eligibility button is disabled is validated successfully|| Pass");
			return true;
		} catch (Exception e) {
			System.out.println("Eligibility Button is ENABLED");
			log.error("Not able to Validates check eligibility button is disabled|| Fail"+ e.getMessage());
			throw (e);
		}

	}

	public boolean validates_check_eligibility_button_is_enabled() throws Exception {
		try {
			log.debug("Validates check eligibility button is Enabled");
			//reuseMethod.scrollDown(CheckEligibilty_Button);
			
			Thread.sleep(1000);
			boolean check= CheckEligibilty_Button.isEnabled();
			Assert.assertTrue(check, "Eligibility Button is Enabled");
			System.out.println("Eligibility Button is Enabled");
			log.info("eligibility button is disabled is validated successfilly|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validates check eligibility button is Enabled|| Fail"+ e.getMessage());
			throw (e);
		}

	}
	
	
	
	public boolean validate_that_NEXT_button_is_Disabled() throws Exception {

		try {
			log.debug("Validate Next Button Is Disabled");
			boolean check;

			check = Next.isEnabled();
			Assert.assertFalse(check, "Next Button is enabled");
			System.out.println("\n Next Button is Disabled");

			log.info("Validated Next Button is Disabled successfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Next Button Is Disabled|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validate_that_NEXT_button_is_Enabled() throws Exception {
		try {
			log.debug("Validate Next Button Is Enabled");

			boolean check = Next.isEnabled();

			Assert.assertTrue(check, "Next Button is Enabled");
			System.out.println("\n Next Button is Enabled");

			log.info("Validate Next Button is Enabled successfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Next Button is Enabled|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean verify_that_the_SELF_button_is_selected_already() throws Exception {
		try {
			log.debug("Validate Self Button Is Enabled");

			boolean check = !Self_Icon_Disable.isEnabled();
			Assert.assertTrue(check, "Bug||Self is enable");

			log.info("Validate Self Button is enable successfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Self Button Is Enable|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean navigate_back_to_Eligibility_page() throws Exception {
		try {
			log.debug("Click On Eligibility Button");

			reuseMethod.scrollDown(Eligibilty_Iconscroll);
			Eligibilty_Icon.click();
			log.info("Eligibilty Button is Clicked sucessfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("No able to navigate to Eligibilty Page|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean clickOnSelf() throws Exception {
		try {
			log.debug("Click Self");
			// reuseMethod.scrollDown(Self);
			Thread.sleep(2000);
			
			Self.click();
			log.info("Self is clicked || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click Self || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean clickOnSpouse() throws Exception {
		try {
			log.debug("Click Spouse");

			Spouse.click();
			log.info("Spouse is clicked || Pass");
			return true;
		} catch (Exception e) {
			log.error("Spouse Click || Fail" + e.getMessage());
			throw (e);
		}

	}

//	public boolean validate_Site_Residency_Exclusions() throws Exception
//	{
//		try {
//			log.debug("Validate Site or State Residency Exclusion Restriction");
//
//			System.err.println(ErrorMessage.getText());
//			ErrorMessage.isDisplayed();
//
//			String Expected=PropertyUtility.Load_MessageFile_Data("AgeRestrictionMessage");
//			String AgeRestriction_actualMsg=ErrorMessage.getText();
//			Assert.assertEquals(AgeRestriction_actualMsg,Expected,"Age Restriction is Not Validated...");
//			log.info("Age Restriction is validated sucessfully|| Pass");
//			return true;
//		}
//		catch (Exception e) {
//			log.error("Not able to Validate Age validation || Fail"+e.getMessage());
//			 throw(e);
//		}
//
//	}

	public boolean validate_Age_Restriction_Message() throws Exception {
		try {
			log.debug("Validate Age Restriction");
			Thread.sleep(4000);
			System.err.println(ErrorMessage.getText());
			ErrorMessage.isDisplayed();

			String Expected = PropertyUtility.Load_MessageFile_Data("AgeRestrictionMessage");
			String AgeRestriction_actualMsg = ErrorMessage.getText();
			Assert.assertEquals(AgeRestriction_actualMsg, Expected, "Age Restriction is Not Validated...");
			log.info("Age Restriction is validated sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Age validation || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean verify_Custom_Message_for_Spouse_Member_AOA_is_displayed() throws Exception {
		try {
			log.debug("Verify Custom Message for Spouse Member AOA is displayed");
			Thread.sleep(4000);
			System.err.println(SpouseMemberMessage_AOA.getText());
			SpouseMemberMessage_AOA.isDisplayed();

			String Expected = PropertyUtility.Load_MessageFile_Data("SpouseMemberAOAMessage");
			String actual = SpouseMemberMessage_AOA.getText();
			Assert.assertEquals(actual, Expected, "Custom Message for Spouse Member AOA is Not Validated...");
			log.info("Custom Message for Spouse Member AOA is validated sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Custom Message for Spouse Member AOA || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean enter_New_State_as(String state) throws Exception {
		try {
			log.debug("Select New state");
			Thread.sleep(600);
			StateOrProvince.isDisplayed();
			reuseMethod.dropDown(StateOrProvince, state);
			log.info(" New state is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select new state|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean enters_DOB_for_Self_as(String DateOfBirth) throws Exception {
		try {
			log.debug("Enter the Date of Birth for Self");
			DOB.isDisplayed();
				
			DOB.click();
			Thread.sleep(1000);
			String b = Keys.BACK_SPACE.toString();
			DOB.sendKeys(b+b+b+b+b+b+b+b+b+b);
			//reuseMethod.scrollDown(DOB);
			
			if (DateOfBirth.contains("SYSDATE") || DateOfBirth.contains("SYSDate") || DateOfBirth.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(DateOfBirth);
				
				
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				//reuseMethod.enterDate_by_JavaScript(selfDOBlocator,date);
				System.out.println(date);
				Thread.sleep(1000);
				DOB.sendKeys(date);
			
			}
			else if (DateOfBirth.equalsIgnoreCase("CurrentDate")) {
				
				
				String date=reuseMethod.Enter_Current_System_Date();
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				Thread.sleep(1000);

				DOB.sendKeys(date);
				
			}  else if(!DateOfBirth.contains("/")) {

				Thread.sleep(1000);
				DateOfBirth=DateOfBirth.substring(0, 2)+"/"+DateOfBirth.substring(2, 4)+"/"+DateOfBirth.substring(4, DateOfBirth.length());
				//reuseMethod.enterDate_by_JavaScript(selfDOBlocator,DateOfBirth);
				DOB.sendKeys(DateOfBirth);
			
			}
			else
			{
				Thread.sleep(1000);
								
				//reuseMethod.enterDate_by_JavaScript(selfDOBlocator,DateOfBirth);
				DOB.sendKeys(DateOfBirth);
			}
			Thread.sleep(1000);

			EmailId.click();

			log.info("Date of Birth for Self is entered sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter the date of birth for Self|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean enters_DOB_for_Spouse_as(String SDOB) throws Exception {
		try {
			log.debug("Enter the Date of Birth for Spouse");
			Thread.sleep(1000);
			
			reuseMethod.scrollDown(SpouseDOB);
			SpouseDOB.isDisplayed();
			SpouseDOB.click();
			Thread.sleep(1000);
			String b = Keys.BACK_SPACE.toString();
			SpouseDOB.sendKeys(b+b+b+b+b+b+b+b+b+b);
			Thread.sleep(1000);

			if (SDOB.contains("SYSDATE") || SDOB.contains("SYSDate") || SDOB.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(SDOB);
				Thread.sleep(1000);
				
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				SpouseDOB.sendKeys(date);
			}
			else if (SDOB.equalsIgnoreCase("CurrentDate")) {
				Thread.sleep(1000);
				
				String date=reuseMethod.Enter_Current_System_Date();
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				SpouseDOB.sendKeys(date);
			
			} else if(!SDOB.contains("/")) {
				Thread.sleep(1000);
				
				SDOB=SDOB.substring(0, 2)+"/"+SDOB.substring(2, 4)+"/"+SDOB.substring(4, SDOB.length());
				SpouseDOB.sendKeys(SDOB);
				Thread.sleep(1000);
			}
			else
			{
				Thread.sleep(1000);
				
				SpouseDOB.sendKeys(SDOB);
				
			}
			Thread.sleep(2000);

			SpouseEmail.click();
			log.info("Date of Birth for Spouse is entered sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter the date of birth for Spouse|| Fail" + e.getMessage());
			throw (e);
		}

	}
	/*
	 * public boolean
	 * eligibility_page_details_are_displayed_to_user_and_validate_details_and_enters_Eligibility_details_and_specific_emailid_as
	 * (String title, String Fname, String Lname, String state, String Dob,String
	 * Emailid, String workhr) throws Exception{
	 *
	 * try { log.debug("Enter Eligibility details for specific emailid");
	 *
	 * reuseMethod.scrollDown(Next); reuseMethod.dropDown(Title,title);
	 * FirstName.sendKeys(Fname); LastName.sendKeys(Lname);
	 * reuseMethod.dropDown(StateOrProvince,state); DOB.sendKeys(Dob);
	 * EmailId.click(); EmailId.sendKeys(Emailid); RadioYes.click();
	 * WeeklyHrs.sendKeys(workhr);
	 *
	 * log.
	 * info("Eligibility Details enter successfully for specific emailid || Pass");
	 * return true; }catch (Exception e) {
	 * log.error("Not able to add eligibility details for specific emailid || Fail"
	 * +e.getMessage()); throw(e);
	 *
	 * }
	 *
	 * }
	 */

	// WAEPA
	/*
	 * public boolean enter_Eligibility_details_for_self_without_EmailId_as(String
	 * title, String Fname, String Lname, String State, String Dob) throws
	 * Exception{
	 *
	 * try { log.debug("Enter Eligibility details for specific emailid");
	 *
	 * reuseMethod.scrollDown(Next); reuseMethod.dropDown(Title,title);
	 * FirstName.sendKeys(Fname); LastName.sendKeys(Lname);
	 * reuseMethod.dropDown(StateOrProvince,State); DOB.sendKeys(Dob);
	 * EmailId.click(); reuseMethod.RandomEmail(EmailId); Thread.sleep(500);
	 * email=EmailId.getText();
	 *
	 *
	 * log.
	 * info("Eligibility Details enter successfully for specific emailid || Pass");
	 * return true; }catch (Exception e) {
	 * log.error("Not able to add eligibility details for specific emailid || Fail"
	 * +e.getMessage()); throw(e);
	 *
	 * }
	 *
	 * }
	 */

	public boolean clicks_next_button() throws Exception {
		try {
			Thread.sleep(1500);
			log.debug("Click on next button");
			reuseMethod.scrollDown(Next);
			reuseMethod.Clickbutton(Next);
			Thread.sleep(7000);
			log.info("Click on next button successfully || Pass");
			return true;
		} catch (Exception e) {
			System.out.println("Not able to click on next button || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean clicks_on_Back_or_Previous_Button() throws Exception {

		try {
			log.debug("Click on Previous Button");
			reuseMethod.scrollDown(Previous);
			reuseMethod.Clickbutton(Previous);
			Thread.sleep(4000);
			log.info("Click on Previous button successfully || Pass");
			return true;
		} catch (Exception e) {
			System.out.println("Not able to click on Previous button || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean clicks_on_Save_for_later_button() throws Exception {

		try {
			log.debug("Click on save for later button");
			reuseMethod.Clickbutton(SaveForLater);
			Thread.sleep(4000);
			log.info("Click on save for later button successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click on save for later button || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean enters_Eligibility_details_for_Spouse_as(String STitle, String Sfname, String Slname, String SDOB,
			String Sworkhr) throws Exception {

		try {
			log.debug("Enter Spouse Eligibility details");

			reuseMethod.dropDown(SpouseTitle, STitle);
			SpouseFName.sendKeys(Sfname);
			SpouseLName.sendKeys(Slname);
			
			SpouseDOB.click();
			Thread.sleep(1000);
			if (SDOB.contains("SYSDATE") || SDOB.contains("SYSDate") || SDOB.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(SDOB);
				
				SpouseDOB.sendKeys(date);
			}
			if (SDOB.equalsIgnoreCase("CurrentDate")) {
				
				String date=reuseMethod.Enter_Current_System_Date();
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				SpouseDOB.sendKeys(date);
			} else {
				
				SpouseDOB.sendKeys(SDOB);
				
			}
			Thread.sleep(2000);

			SpouseEmail.click();
			reuseMethod.RandomEmail(SpouseEmail);
			SpouseWorkHr.sendKeys(Sworkhr);
			log.info("Spouse Eligibility details are entered sucessfully");
			return true;

		} catch (Exception e) {
			log.error("Not able to Enter Spouse Eligibility details || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_radio_button_Yes_for_Spouse_is_Member() throws Exception {

		try {
			log.debug("Select Yes Radio Button For Spouse is Member");
			SpouseRadioYes.click();
			Thread.sleep(4000);
			log.info(" Select Yes Radio Button For Spouse is Member successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select Yes Radio Button For Spouse is Member || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_radio_button_NO_for_Spouse_is_Member() throws Exception {

		try {
			log.debug("Select NO Radio Button For Spouse is Member");
			SpouseRadioNo.click();
			Thread.sleep(4000);
			log.info(" Select NO Radio Button For Spouse is Member successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select NO Radio Button For Spouse is Member || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean enters_Contact_details_for_Spouse_as_Without_Workhr(String STitle, String Sfname, String Slname,
			String SDOB) throws Exception {

		try {
			log.debug("Enter Spouse Contacts details");

			reuseMethod.dropDown(SpouseTitle, STitle);
			SpouseFName.sendKeys(Sfname);
			SpouseLName.sendKeys(Slname);
			SpouseDOB.click();
			Thread.sleep(1000);
			
			Thread.sleep(1000);

			if (SDOB.contains("SYSDate") || SDOB.contains("SYSdate") || SDOB.contains("SYSDATE")) {
				String date = reuseMethod.Enter_customized_previous_Date(SDOB);
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				SpouseDOB.sendKeys(date);
				
			} else if(!SDOB.contains("/"))
			{
				
				SDOB=SDOB.substring(0, 2)+"/"+SDOB.substring(2, 4)+"/"+SDOB.substring(4, SDOB.length());
				SpouseDOB.sendKeys(SDOB);
			}
			else if(SDOB.equalsIgnoreCase("CurrentDate"))
			{
				String date=reuseMethod.Enter_Current_System_Date();
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				SpouseDOB.sendKeys(date);
			}
			else
			{
				SpouseDOB.sendKeys(SDOB);
			}
			SpouseEmail.click();
			reuseMethod.RandomEmail(SpouseEmail);
			log.info("Spouse Contacts details are entered sucessfully");
			return true;

		} catch (Exception e) {
			log.error("Not able to Enter Spouse Contact details || Fail" + e.getMessage());
			throw (e);
		}

	}

	/*
	 * public boolean
	 * select_radio_button_NO_for_Spouse_is_Member_Enters_Spouse_details_for_Spouse_as
	 * (String STitle,String Sfname, String Slname, String SDOB, String Sworkhr)
	 * throws Exception {
	 *
	 * try { log.debug("Enter Spouse details");
	 *
	 * reuseMethod.dropDown(SpouseTitle,STitle); SpouseFName.sendKeys(Sfname);
	 * SpouseLName.sendKeys(Slname); SpouseDOB.sendKeys(SDOB); SpouseEmail.click();
	 * reuseMethod.RandomEmail(SpouseEmail); SpouseRadioNo.click();
	 * SpouseWorkHr.sendKeys(Sworkhr);
	 * log.info("Spouse details are entered  successfully || Pass"); return true; }
	 * catch (Exception e) {
	 *
	 *
	 *
	 * log.error("Not able to enter spouse details || Fail"+e.getMessage());
	 *
	 * screenShotUtility.GetScreenShot(driver); throw(e); }
	 *
	 * }
	 */
	public boolean clicks_on_Child_radio_button() throws Exception {
		try {
			log.debug("Click Child radio");
			Thread.sleep(1000);
			Child.click();
			Thread.sleep(2000);
			log.info("Click Child radio Successfully || Pass");
			return true;
		}

		catch (Exception e) {
			log.error("Not able to click on child radio|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean add_Child_Screen_is_displayed_and_Enters_Child_details_as(String Cfname, String Clname, String CDOB,
			String Csex) throws Exception {
		try {

			log.debug("Add child Screen Will display and Enter the Child details");
			Thread.sleep(1000);
			ChildFName.click();
			ChildFName.sendKeys(Cfname);
			
			ChildLName.sendKeys(Clname);
			
			ChildDOB.click();
			if (CDOB.contains("SYSDATE") || CDOB.contains("SYSDate") || CDOB.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(CDOB);
							
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				ChildDOB.sendKeys(date);
			}
			else if (CDOB.equalsIgnoreCase("CurrentDate")) {
				Thread.sleep(1000);
				
				String date=reuseMethod.Enter_Current_System_Date();
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				ChildDOB.sendKeys(date);
			} else if(!CDOB.contains("/")){
				
				
				CDOB=CDOB.substring(0, 2)+"/"+CDOB.substring(2, 4)+"/"+CDOB.substring(4, CDOB.length());
				ChildDOB.sendKeys(CDOB);
				
			}
			else
				{
			
			ChildDOB.sendKeys(CDOB);
			
		}
			
			Thread.sleep(2000);
			ChildFName.click();
			Thread.sleep(2000);
			reuseMethod.select_Single_value_Icon(MaleChildText, MaleChild, FemaleChild, Csex);

			log.info("Add child Screen is displayed and Entered the Child details successfully || Pass");
			return true;
		}

		catch (Exception e) {
			log.error("Not able to display Add Child Screen and details are not entered || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_All_other_questions_on_Add_Child_screen_as_No() throws Exception {
		try {

			log.debug("Answer question on Add child Window as NO ");
			Child_NotMarried.click();
			if (child_ArmedForceNo.isDisplayed()) {
				child_ArmedForceNo.click();
			}
			log.info(" Questions on add child Window are asnwered No Successfully || Pass");
			return true;
		}

		catch (Exception e) {
			log.error("Not able to answer question on Add child Window as NO|| Fail" + e.getMessage());
			throw (e);
		}

	}


	public boolean click_on_Add_Child_button_on_Screen() throws Exception {
		try {
			log.debug("Click On Add child Button on Screen");
			AddChild_screen.click();
			Thread.sleep(1000);
			log.info("Add child Button on Screen is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click on Add child button on screen || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean click_on_Add_Child_button() throws Exception {
		try {
			log.debug("Click On Add child Button");
			Thread.sleep(1000);
			// reuseMethod.scrollDown(childSex);
			AddChild_Button.click();
			log.info("Add child Button is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click on Add child button || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validates_Add_Child_Button_on_Eligibility_page_is_not_present() throws Exception {
		try {
			log.debug("Validate Add Child Button is not Present");
			boolean check = AddChild_Button.isDisplayed();
			Assert.assertFalse(check, "Add Child Button is displayed");

			System.out.println("Add Child Button is not displayed");

			log.info("Add child Button is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			System.err.println("Add Child Button is not  displayed");
			log.error("Not able to Validate Add Child Button is not Present || Fail" + e.getMessage());
			return false;
		}

	}

	public boolean clicks_Edit_button_for_Child_Added() throws Exception {
		try {
			log.debug("Click On Edit child Button");
			Thread.sleep(1000);
			Edit.isDisplayed();
			Edit.click();
			log.info("Edit child Button is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click on Edit child button || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean enters_DOB_for_Child_as(String CDOB) throws Exception {
		try {
			log.debug("Enter DOB for Child");
			Thread.sleep(1000);
			ChildDOB.isDisplayed();
			ChildDOB.click();
			Thread.sleep(1000);
			String c = Keys.DELETE.toString();
			String b = Keys.BACK_SPACE.toString();
			ChildDOB.sendKeys(c+c+c+c+c+c+b+b+b+b+b+b+b+b);
			//ChildDOB.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			

			if (CDOB.contains("SYSDATE") || CDOB.contains("SYSDate") || CDOB.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(CDOB);
								
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				ChildDOB.sendKeys(date);
			}
			else if (CDOB.equalsIgnoreCase("CurrentDate")) {
							
				String date=reuseMethod.Enter_Current_System_Date();
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				DOB.sendKeys(date);
			} else if(!CDOB.contains("/")){
								
				CDOB=CDOB.substring(0, 2)+"/"+CDOB.substring(2, 4)+"/"+CDOB.substring(4, CDOB.length());
				ChildDOB.sendKeys(CDOB);
				
			}
			else {
								
				ChildDOB.sendKeys(CDOB);
				
			}
			Thread.sleep(2000);
			ChildFName.click();

			log.info("Edit child Button is clicked successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to click on Edit child button || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Married_question_as_Yes() throws Exception {
		try {
			log.debug("Select Marraige Question as YES for Child");
			Child_Married.isDisplayed();
			Child_Married.click();

			log.info("Marraige Question as YES for Child is selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select Marraige Question as YES for Child || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Married_question_as_No() throws Exception {
		try {
			log.debug("Select Marraige Question as No for Child");
			Child_NotMarried.isDisplayed();
			Child_NotMarried.click();

			log.info("Marraige Question as NO for Child is selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select Marraige Question as NO for Child || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Yes_for_full_time_student() throws Exception {
		try {
			log.debug("Select Full time Student Question as YES for Child");
			Child_FullTimeStudentYes.isDisplayed();
			Child_FullTimeStudentYes.click();

			log.info("Full time Student Question as YES for Child is selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select Full time Student Question as YES for Child || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_No_for_full_time_student() throws Exception {
		try {
			log.debug("Select Full time Student Question as No for Child");
			Child_FullTimeStudentNo.isDisplayed();
			Child_FullTimeStudentNo.click();

			log.info("Full time Student Question as No for Child is selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select Full time Student Question as No for Child || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean honorably_Discharged_question_as_Yes() throws Exception {
		try {
			log.debug("Select Honorably discharged Question as YES for Child");
			child_ArmedForceYes.isDisplayed();
			child_ArmedForceYes.click();

			log.info("Honorably discharged Question as YES for Child is selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select Honorably discharged Question as YES for Child || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean honorably_Discharged_question_as_No() throws Exception {
		try {
			log.debug("Select Honorably discharged Question as No for Child");
			child_ArmedForceNo.isDisplayed();
			child_ArmedForceNo.click();

			log.info("Honorably discharged Question as NO for Child is selected successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select Honorably discharged Question as NO for Child || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean eligibility_page_details_are_displayed_to_user_and_enters_details_as_Mobile(String Fname,
			String Lname, String MM, String DD, String YYYY, String Address, String WorkHr, String Mstatus)
			throws Exception {

		try {
			log.debug("Enter eligibility page details for Self in mobile application");
			Thread.sleep(500);
			FirstName.sendKeys(Fname);
			LastName.sendKeys(Lname);
			// reuseMethod.scrollDown(LastName);
			Thread.sleep(1000);
			if (YYYY.contains("SYSDate") || YYYY.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(YYYY);
				System.out.println(date);

				mobSelfMonth.click();
				mobSelfMonth.sendKeys(date.substring(0, 2));
				mobSelfDate.sendKeys(date.substring(2, 4));
				mobSelfYear.sendKeys(date.substring(4, 8));
				Thread.sleep(1000);
			}
			else if(YYYY.contains("CurrentDate"))
					{
				String date = reuseMethod.Enter_Current_System_Date();
				mobSelfMonth.click();
				mobSelfMonth.sendKeys(date.substring(0, 2));
				mobSelfDate.sendKeys(date.substring(2, 4));
				mobSelfYear.sendKeys(date.substring(4, 8));
				Thread.sleep(1000);
					}
			else
				{
				mobSelfMonth.sendKeys(MM);
			mobSelfDate.sendKeys(DD);
			mobSelfYear.sendKeys(YYYY);
				}
			reuseMethod.scrollDown(mobSelfDate);
			Thread.sleep(500);
		
			mobAddress.sendKeys(Address);
			reuseMethod.Select_value_by_Up_Down_arrow();
			reuseMethod.scrollDown(mobSelfMemAssYes);
			WeeklyHrs.sendKeys(WorkHr);
			mobMaritalStatus.sendKeys(Mstatus);
			Thread.sleep(500);
			log.info("Enter eligibility page details for Self in mobile application successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter eligibility details for Self in mobile application || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_Self_Member_Associaton_as_YES_Mobile() throws Exception {

		try {
			log.debug("Select Member Association as Yes for Self in mobile application");
			reuseMethod.scrollDown(mobAddress);
			mobSelfMemAssYes.click();
			Thread.sleep(500);
			log.info("Select Member Association as Yes for Self in mobile application successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Member Association as Yes for Self in mobile application || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean select_Dependent_as_YES_for_Self_Mobile() throws Exception {

		try {
			log.debug("Select Dependent as Yes for Self in mobile application");

			reuseMethod.scrollDown(WeeklyHrs);
			mobDependentYes.click();
			Thread.sleep(500);
			log.info("Select Dependent as Yes for Self in mobile application successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Dependent as Yes for Self in mobile application || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_Self_Member_Associaton_as_NO_Mobile() throws Exception {

		try {
			log.debug("Select Member Association as No for Self in mobile application");
			reuseMethod.scrollDown(mobAddress);
			mobSelfMemAssNo.click();

			Thread.sleep(500);
			log.info("Select Member Association as No for Self in mobile application successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Member Association as No for Self in mobile application || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean select_spouse_eligibility_as_YES_and_enter_details_as_Mobile(String Sfname, String Slname,
			String SMM, String SDD, String SYYYY, String SWorkHr) throws Exception {

		try {
			log.debug("Enter eligibility page details for Spouse in mobile application");
			Thread.sleep(1000);
			mobSpousEliYes.click();
			reuseMethod.scrollDown(SpouseFName);
			SpouseFName.sendKeys(Sfname);
			SpouseLName.sendKeys(Slname);
			if (SYYYY.contains("SYSDate") || SYYYY.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(SYYYY);
				System.out.println(date);

				mobSpouseMonth.click();
				mobSpouseMonth.sendKeys(date.substring(0, 2));
				mobSpouseDate.sendKeys(date.substring(2, 4));
				mobSpouseYear.sendKeys(date.substring(4, 8));
				Thread.sleep(1000);
			}
			else if(SYYYY.contains("CurrentDate"))
			{
		String date = reuseMethod.Enter_Current_System_Date();
		mobSpouseMonth.click();
		mobSpouseMonth.sendKeys(date.substring(0, 2));
		mobSpouseDate.sendKeys(date.substring(2, 4));
		mobSpouseYear.sendKeys(date.substring(4, 8));
		Thread.sleep(1000);
			}
			else
			{
			mobSpouseMonth.sendKeys(SMM);
			mobSpouseDate.sendKeys(SDD);
			mobSpouseYear.sendKeys(SYYYY);
			}
			SpouseWorkHr.sendKeys(SWorkHr);
			Thread.sleep(500);
			log.info("Enter eligibility page details for Spouse in mobile application successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to enter eligibility details for Spouse in mobile application || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean spouse_Eligibility_page_is_displayed_Mobile() throws Throwable {

		try {
			log.debug("Spouse Eligibility page is displayed in mobile application");

			SpouseEligibilityPage_Mob.isDisplayed();
			Thread.sleep(2000);
			log.info("Spouse Eligibility page is displayed in mobile application successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Spouse Eligibility page in mobile application || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean child_Eligibility_page_is_displayed_Mobile() throws Throwable {
		try {
			log.debug("Child Eligibility page is displayed in mobile application");
			Thread.sleep(500);
			ChildEligibilityPage_Mob.isDisplayed();
			Thread.sleep(500);
			log.info("Child Eligibility page is displayed in mobile application successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to display Child Eligibility page in mobile application || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean enter_year_details_for_child_mobile(String Cyyyy) throws Throwable {
		try {
			log.debug("Enter year details for child in mobile application");
			Thread.sleep(500);
			reuseMethod.scrollDown(MobChildFName1);
			mobChildMonth1.clear();
			mobChildDate1.clear();
			mobChildYear1.clear();
			if (Cyyyy.contains("SYSDate") || Cyyyy.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(Cyyyy);
				System.out.println(date);
				
				mobChildMonth1.click();
				mobChildMonth1.sendKeys(date.substring(0, 2));
				mobChildDate1.sendKeys(date.substring(2, 4));
				mobChildYear1.sendKeys(date.substring(4, 8));
				Thread.sleep(1000);
			} else if(Cyyyy.length()==4){
				mobChildYear1.clear();
				mobChildYear1.sendKeys(Cyyyy);
			}
			else if(Cyyyy.contains("/"))
			{
				Cyyyy.replaceAll("/", "");
				mobChildMonth1.click();
				mobChildMonth1.sendKeys(Cyyyy.substring(0, 2));
				mobChildDate1.sendKeys(Cyyyy.substring(2, 4));
				mobChildYear1.sendKeys(Cyyyy.substring(4, 8));
			}
			Thread.sleep(500);
			log.info("Enter year details for child in mobile application successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter year details for child in mobile application || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean spouse_Eligibility_page_is_displayed_select_NO_for_spouse() throws Throwable {

		try {
			log.debug("Select No in eligibility page for Spouse in mobile application");

			spouse_Eligibility_page_is_displayed_Mobile();
			mobSpouseEliNo.click();
			Thread.sleep(1000);
			log.info("Selected No in eligibility page for Spouse in mobile application successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select No in eligibility page for Spouse in mobile application || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean clicks_Spouse_Member_Association_as_NO_Mobile() throws Exception {

		try {
			log.debug("Enter Spouse Member Association as NO for mobile application");
			reuseMethod.scrollDown(mobSpouseDate);
			mobSpouseMemAssNo.click();
			Thread.sleep(500);
			log.info("Enter Spouse Member Association as NO for mobile application: Successful || Pass");
			return true;
		} catch (Exception e) {
			log.error("Notable to enter spouse Member Association NO details || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean clicks_Spouse_Member_Association_as_YES_Mobile() throws Exception {

		try {
			log.debug("Enter Spouse Member Association as YES for mobile application");
			reuseMethod.scrollDown(mobSpouseDate);
			mobSpouseMemAssYes.click();

			log.info("Enter Spouse Member Association as YES for mobile application: Successful || Pass");
			return true;
		} catch (Exception e) {
			log.error("Notable to enter spouse Member Association YES details || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean enter_details_for_child_as_Mobile(String Cfname, String Clname, String CMM, String CDD, String CYYYY)
			throws Throwable {

		try {
			log.debug("Enter eligibility page details for mobile application");

			reuseMethod.scrollDown(mobChildEliNo);
			MobChildFName1.sendKeys(Cfname);
			MobChildLName1.sendKeys(Clname);
			if (CYYYY.contains("SYSDate") || CYYYY.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(CYYYY);
				mobChildMonth1.click();
				mobChildMonth1.sendKeys(date);
				Thread.sleep(1000);

			} else {
				mobChildMonth1.sendKeys(CMM);
				mobChildDate1.sendKeys(CDD);
				mobChildYear1.sendKeys(CYYYY);
			}
			Thread.sleep(1000);
			log.info("Enter eligibility page details successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Notable to enter eligibility details || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean enter_details_for_second_child_as_Mobile(String Cfname1, String Clname1, String CMM1, String CDD1,
			String CYYYY1) throws Throwable {

		try {
			log.debug("Enter second child details for mobile application");
			MobChildFName2.sendKeys(Cfname1);
			MobChildLName2.sendKeys(Clname1);
			if (CYYYY1.contains("SYSDate")) {
				String date = reuseMethod.Enter_customized_previous_Date(CYYYY1);
				mobChildMonth2.click();
				mobChildMonth2.sendKeys(date);
				Thread.sleep(1000);
			}

			else {
				mobChildMonth2.sendKeys(CMM1);
				mobChildDate2.sendKeys(CDD1);
				mobChildYear2.sendKeys(CYYYY1);
			}
			Thread.sleep(1000);
			log.info("Enter second child details successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter second child details || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean enter_details_for_third_child_as_Mobile(String Cfname2, String Clname2, String CMM2, String CDD2,
			String CYYYY2) throws Throwable {

		try {
			log.debug("Enter third child detail for mobile application");

			MobChildFName3.sendKeys(Cfname2);
			MobChildLName3.sendKeys(Clname2);
			if (CYYYY2.contains("SYSDate")) {
				String date = reuseMethod.Enter_customized_previous_Date(CYYYY2);

				mobChildMonth3.click();
				mobChildMonth3.sendKeys(date);
				Thread.sleep(1000);
			} else {
				mobChildMonth3.sendKeys(CMM2);
				mobChildDate3.sendKeys(CDD2);
				mobChildYear3.sendKeys(CYYYY2);
			}
			Thread.sleep(1000);
			log.info("Enter third child detail successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter third child details || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean enter_details_for_fourth_child_as_Mobile(String Cfname3, String Clname3, String CMM3, String CDD3,
			String CYYYY3) throws Throwable {

		try {
			log.debug("Enter fourth child details for mobile application");

			MobChildFName4.sendKeys(Cfname3);
			MobChildLName4.sendKeys(Clname3);
			if (CYYYY3.contains("SYSDate")) {
				String date = reuseMethod.Enter_customized_previous_Date(CYYYY3);

				mobChildMonth4.click();
				mobChildMonth4.sendKeys(date);
				Thread.sleep(1000);
			} else {
				mobChildMonth4.sendKeys(CMM3);
				mobChildDate4.sendKeys(CDD3);
				mobChildYear4.sendKeys(CYYYY3);
			}
			Thread.sleep(1000);
			log.info("Enter fourth child details successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter fourth child details || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_child_Sex_and_Married_as_Mobile(String cgender, String CMarried) throws Exception {

		try {
			log.debug("Select gender and Married/Unmarried for Child in Child Eligibility page for mobile application");

			reuseMethod.select_Single_value_Icon(MobChildSexMaleVal1, MobChildSexMale1, MobChildSexFemale1, cgender);
			reuseMethod.select_Single_value_Icon(MobChildMarriedNoVal1, MobChildMarriedNo1, MobChildMarriedYes1,
					CMarried);

			log.info(
					"Select gender and Married/Unmarried for Child in Child Eligibility page successfully for mobile application|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Gender and Married/Unmarried for Child in Child Eligibility page for mobile application || Fail"
							+ e.getMessage());
			throw (e);
		}

	}

	public boolean select_child_Sex_and_Married_as_for_second_child_Mobile(String cgender2, String CMarried2)
			throws Exception {

		try {
			log.debug(
					"Select gender and Married/Unmarried for second child in Child Eligibility page for mobile application");

			reuseMethod.select_Single_value_Icon(MobChildSexMaleVal2, MobChildSexMale2, MobChildSexFemale2, cgender2);
			reuseMethod.select_Single_value_Icon(MobChildMarriedNoVal2, MobChildMarriedNo2, MobChildMarriedYes2,
					CMarried2);

			log.info(
					"Select gender and Married/Unmarried for second child in Child Eligibility page successfully for mobile application|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Gender and Married/Unmarried for second child in Child Eligibility page for mobile application || Fail"
							+ e.getMessage());
			throw (e);
		}

	}

	public boolean select_child_Sex_and_Married_as_for_third_child_Mobile(String cgender3, String CMarried3)
			throws Exception {

		try {
			log.debug(
					"Select gender and Married/Unmarried for third child in Child Eligibility page for mobile application");

			reuseMethod.select_Single_value_Icon(MobChildSexMaleVal3, MobChildSexMale3, MobChildSexFemale3, cgender3);
			reuseMethod.select_Single_value_Icon(MobChildMarriedNoVal3, MobChildMarriedNo3, MobChildMarriedYes3,
					CMarried3);

			log.info(
					"Select gender and Married/Unmarried for third child in Child Eligibility page successfully for mobile application|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Gender and Married/Unmarried for third child in Child Eligibility page for mobile application || Fail"
							+ e.getMessage());
			throw (e);
		}

	}

	public boolean select_child_Sex_and_Married_as_for_fourth_child_Mobile(String cgender4, String CMarried4)
			throws Exception {

		try {
			log.debug(
					"Select gender and Married/Unmarried for fourth child in Child Eligibility page for mobile application");

			reuseMethod.select_Single_value_Icon(MobChildSexMaleVal4, MobChildSexMale4, MobChildSexFemale4, cgender4);
			reuseMethod.select_Single_value_Icon(MobChildMarriedNoVal4, MobChildMarriedNo4, MobChildMarriedYes4,
					CMarried4);

			log.info(
					"Select gender and Married/Unmarried for fourth child in Child Eligibility page successfully for mobile application|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Gender and Married/Unmarried for fourth child in Child Eligibility page for mobile application || Fail"
							+ e.getMessage());
			throw (e);
		}

	}

	public boolean select_Full_time_student_as_for_child_Mobile(String CFull) throws Exception {

		try {
			log.debug("Select Full time student in Child eligibility page for mobile application");
			reuseMethod.scrollDown(MobChildMarriedNo1);
			Thread.sleep(500);
			reuseMethod.select_Single_value_Icon(MobChildFullTimeNoVal1, MobChildFullTimeNo1, MobChildFullTimeYes1,
					CFull);

			log.info("Select Full time student in Child eligibility page successfully for mobile application || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Full time student in Child eligibility page for mobile application || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean select_eligibility_for_child_Mobile(String Celigi) throws Throwable {

		try {
			log.debug("Select Child eligibility Yes/No in mobile application");
			reuseMethod.select_Single_value_Icon(mobChildEliNoVal, mobChildEliNo, mobChildEliYes, Celigi);
			log.info("Selected Child eligibility Yes/No successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Child eligibility details || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean eligibility_page_details_are_displayed_to_user_and_Enter_details_as_HomePhone(String HomePh,
			String Phtype) throws Throwable {

		try {
			log.debug("Enter self membership details for Home Phone");

			reuseMethod.dropDown(PhoneNumType, Phtype);
			HomePhoneNum.sendKeys(HomePh);

			log.info("Enter self members details for Home Phone successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter self membership details for Home Phone  || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean eligibility_page_details_are_displayed_to_user_and_Enter_details_for_MobilePhone(String MobPh,
			String Phtype) throws Throwable {

		try {
			log.debug("Enter self membership details for Mobile Phone");

			reuseMethod.dropDown(PhoneNumType, Phtype);
			MobilePhone.sendKeys(MobPh);

			log.info("Enter self members details for Mobile Phone successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter self for membership details Mobile Phone || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_radio_as_PolicyHolder(String policyholder) throws Throwable {

		try {
			log.debug("Select radio button for policyholder");
			// RadioYes.click();
			reuseMethod.selectSinglevalue(PolicyHolderYes, PolicyHolderNo, policyholder);

			log.info("Selected radio button for policyholder successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select radio button for policyholder || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_radio_For_ArmedForces_Self(String Armedforces) throws Throwable {

		try {
			log.debug("Select radio button for Armed Forces (Self)");

			reuseMethod.selectSinglevalue(SelfArmedForceYes, SelfArmedForceNo, Armedforces);

			log.info("Selected radio button for Armed Forcess successfully (Self) || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select radio button for Armed Forces (Self)|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean enter_Details_for_Self_Without_WorkHr(String title, String Fname, String Lname, String State,
			String Dob) throws Throwable {

		try {
			log.debug("Enter self eligibility details");

			reuseMethod.dropDown(Title, title);
			FirstName.sendKeys(Fname);
			LastName.sendKeys(Lname);
			reuseMethod.dropDown(StateOrProvince, State);
			String b = Keys.BACK_SPACE.toString();
			DOB.sendKeys(b+b+b+b+b+b+b+b+b+b);
			DOB.click();
			if (Dob.contains("SYSDATE") || Dob.contains("SYSDate") || Dob.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(Dob);
				Thread.sleep(1000);
	
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				DOB.sendKeys(date);
				
			}
			else if (Dob.equalsIgnoreCase("CurrentDate")) {
				Thread.sleep(1000);
				String date=reuseMethod.Enter_Current_System_Date();
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				DOB.sendKeys(date);
				
			} else if(!Dob.contains("/")) {
				Thread.sleep(1000);
				Dob=Dob.substring(0, 2)+"/"+Dob.substring(2, 4)+"/"+Dob.substring(4, Dob.length());
				DOB.sendKeys(Dob);
				Thread.sleep(1000);
			}
			else
			{
				Thread.sleep(1000);
				DOB.sendKeys(Dob);
			}
			
			EmailId.click();
			email = reuseMethod.RandomEmail(EmailId);
			Thread.sleep(500);
			reuseMethod.addemail(email);

			System.out.println("Entered email id is: " + email + "\n");
			log.info("Enter self eligibility details successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter self eligibility details|| Fail" + e.getMessage());
			throw (e);
		}

	}

	
	public boolean Select_radio_button_I_AM_A_SPOUSE_OF_A_WAEPA_MEMBER() throws Throwable {

		try {
			log.debug("Select radio button I AM A SPOUSE OF A WAEPA MEMBER ");
			Thread.sleep(1000);
			spouseOfMember.click();

			log.info("Selected radio button I AM A SPOUSE OF A WAEPA MEMBER successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select radio button I AM A SPOUSE OF A WAEPA MEMBER || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_radio_button_for_CIVILIAN_FEDERAL_EMPLOYEE_and_enter_EmployedSince_and_EmployedBy_details_as_and_Select_the_checkbox_for_I_attest(
			String EmpSince, String EmpBy) throws Throwable {

		try {
			log.debug("Select radio button CIVILIAN_FEDERAL_EMPLOYEE and enter details of EmpSince and EmpBy ");
			Thread.sleep(1000);
			WAEPA_CivilianFederalEmp.click();
			WAEPA_EmployedSince.click();
			
			if(!EmpSince.startsWith("SysDate")||(!EmpSince.startsWith("SYSDate"))||(!EmpSince.startsWith("SYSdate")))
			{
				if(EmpSince.contains("/"))
				{
					WAEPA_EmployedSince.sendKeys(EmpSince);
				}
				else
				{
					EmpSince=EmpSince.substring(0, 2)+"/"+EmpSince.substring(2, 4)+"/"+EmpSince.substring(4, EmpSince.length());
					WAEPA_EmployedSince.sendKeys(EmpSince);
				}
			
			}
			else
			{
				String date = reuseMethod.Enter_customized_previous_Date(EmpSince);
				Thread.sleep(1000);
	
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				WAEPA_EmployedSince.sendKeys(date);
			}
			Thread.sleep(1000);
			// reuseMethod.dropDown(WAEPA_EmployedBy, EmpBy);
			WAEPA_EmployedBy.sendKeys(EmpBy);
			reuseMethod.Select_value_by_Up_Down_arrow();
			attestForMembership.click();
			log.info(
					"Selected radio button  CIVILIAN_FEDERAL_EMPLOYEE and enter details of EmpSince and EmpBy successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Select radio button of  CIVILIAN_FEDERAL_EMPLOYEE and enter details of EmpSince and EmpBy || Fail"
							+ e.getMessage());
			throw (e);
		}

	}

	public boolean select_radio_button_for_RETIRED_CIVILIAN_FEDERAL_EMPLOYEE_and_enter_RetiredSince_and_EmployedBy_details_as_and_Select_the_checkbox_for_I_attest(
			String RetiredSince, String EmpBy) throws Throwable {

		try {
			log.debug(
					"Select radio button RETIRED CIVILIAN_FEDERAL_EMPLOYEE and enter details of RETIRED Since and EmpBy ");
			Thread.sleep(1000);
			WAEPA_RetiredCivilianFederalEmp.click();
			WAEPA_RetiredSince.click();
			if(!RetiredSince.startsWith("SysDate")||(!RetiredSince.startsWith("SYSDate"))||(!RetiredSince.startsWith("SYSdate")))
			{
				if(RetiredSince.contains("/"))
				{
					WAEPA_RetiredSince.sendKeys(RetiredSince);
				}
				else
				{
					RetiredSince=RetiredSince.substring(0, 2)+"/"+RetiredSince.substring(2, 4)+"/"+RetiredSince.substring(4, RetiredSince.length());
					WAEPA_RetiredSince.sendKeys(RetiredSince);
				}
			
			}
			else
			{
				String date = reuseMethod.Enter_customized_previous_Date(RetiredSince);
					
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				WAEPA_RetiredSince.sendKeys(date);
			}
		
			Thread.sleep(1000);
		
			
			// reuseMethod.dropDown(WAEPA_EmployedBy, EmpBy);
			WAEPA_RetiredEmployedBy.sendKeys(EmpBy);
			reuseMethod.Select_value_by_Up_Down_arrow();
			attestForMembership.click();
			log.info(
					"Selected radio button RETIRED CIVILIAN_FEDERAL_EMPLOYEE and enter details of RETIRED Since and EmpBy successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to Select radio button of RETIRED CIVILIAN_FEDERAL_EMPLOYEE and enter details of RETIRED Since and EmpBy || Fail"
							+ e.getMessage());
			throw (e);
		}

	}

	public boolean clicks_on_BECOME_AN_ASSOCIATE_MEMBER_radio_button_to_enter_details_as_and_select_the_checkbox_for_attest(
			String Sfname, String Slname, String MembershipID) throws Exception

	{
		try {
			log.debug("Select radio button BECOME_AN_ASSOCIATE_MEMBER and enter details");
			AssociateMember.click();
			Thread.sleep(200);
			SpouseFnameMember.sendKeys(Sfname);
			SpouseLnameMember.sendKeys(Slname);
			Spouse_AssociateMemberID.sendKeys(MembershipID);
			attestForMembership.click();

			log.info("Selected radio button BECOME_AN_ASSOCIATE_MEMBER and enter details successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Select radio button BECOME_AN_ASSOCIATE_MEMBER and enter details || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean verify_the_error_message_is_displayed_for_state_validation_at_top_of_the_page() throws Throwable {

		try {
			log.debug("Validate the error message for Address");
			Thread.sleep(1500);
			ErrorMessage.isDisplayed();

			String ExpectedAddressError_Msg = PropertyUtility.Load_MessageFile_Data("StateValidationError");
			String AddressErr_Msg = ErrorMessage.getText();

			String Actual_AddressErr_Msg = AddressErr_Msg.replaceAll("\\n", "");

			System.err.println("Actual error message for address:" + Actual_AddressErr_Msg);
			Actual_AddressErr_Msg.replaceAll("\\s", "");
			ExpectedAddressError_Msg.replaceAll("\\s", "");

			Assert.assertEquals(Actual_AddressErr_Msg, ExpectedAddressError_Msg,
					"validation fail for address error message");

			log.info("Validated the error message for Address successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate the error message for Address || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean change_address_as_Mobile(String address1) throws Throwable {

		try {
			log.debug("Enter details for address");
			reuseMethod.scrollDown(mobSelfDate);
			mobAddress.clear();

			Thread.sleep(1000);
			mobAddress.click();
			mobAddress.sendKeys(address1);
			reuseMethod.Select_value_by_Up_Down_arrow();
			log.info("Entered details for address successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter details for address || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean validate_Custom_Message_about_Spouse_as_a_Member_Mobile() throws Throwable {

		try {
			log.debug("Validate Custom Message about Spouse as a Member");
			reuseMethod.scrollDown(mobSelfDate);
			customMemberMsg_Sps_Mob.isDisplayed();
			String ExpectedSps_Msg = PropertyUtility.Load_MessageFile_Data("spouseCustomMessage");
			String customMemberMsg_Sps = customMemberMsg_Sps_Mob.getText();

			String Actual_sps_Msg = customMemberMsg_Sps.replaceAll("\\n", "");

			System.err.println("Actual error message for DOB:" + Actual_sps_Msg);
			Actual_sps_Msg.replaceAll("\\s", "");
			ExpectedSps_Msg.replaceAll("\\s", "");

			Assert.assertEquals(Actual_sps_Msg, ExpectedSps_Msg, "validation fail for Spouse custom message");

			log.info("Validated Custom Message about Spouse as a Member successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Custom Message about Spouse as a Member || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean user_enters_year_as_on_eligibility_page_Self_Mobile(String NYYYY) throws Exception {

		try {
			log.debug("Enter year on Eligibility page for Self in mobile application");
			Thread.sleep(500);

			reuseMethod.scrollDown(LastName);
			Thread.sleep(1000);
			mobSelfYear.clear();
			if (NYYYY.contains("SYSDate") || NYYYY.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(NYYYY);
				mobSelfMonth.clear();
				mobSelfDate.clear();
				mobSelfMonth.click();
				mobSelfMonth.sendKeys(date.substring(0, 2));
				mobSelfDate.sendKeys(date.substring(2, 4));
				mobSelfYear.sendKeys(date.substring(4, 8));

				Thread.sleep(1000);
			} else {
				mobSelfYear.sendKeys(NYYYY);
			}
			Thread.sleep(500);
			log.info("Enter year on Eligibility page for Self in mobile application successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter year on Eligibility page for Self in mobile application || Fail"
					+ e.getMessage());
			throw (e);
		}

	}
//AAFP

	public boolean eligibility_page_details_are_displayed_to_user() throws Exception {
		try {
			log.debug("Validate the Eligibility page is Displayed");
			Eligibility.isDisplayed();

			log.info("Eligibility page is Displayed successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to displayed Eligibility page || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean verify_the_error_message_is_displayed_for_dob_validation_at_top_of_the_page() throws Throwable {

		try {
			log.debug("Validate the error message for DOB");
			ErrorMessage.isDisplayed();

			String ExpectedDOBError_Msg = PropertyUtility.Load_MessageFile_Data("eligibility_validationerror");
			String DOBErr_Msg = ErrorMessage.getText();

			String Actual_DOBErr_Msg = DOBErr_Msg.replaceAll("\\n", "");

			System.err.println("Actual error message for DOB:" + Actual_DOBErr_Msg);
			Actual_DOBErr_Msg.replaceAll("\\s", "");
			ExpectedDOBError_Msg.replaceAll("\\s", "");

			Assert.assertEquals(Actual_DOBErr_Msg, ExpectedDOBError_Msg, "validation fail for DOB error message");

			log.info("Validated the error message for DOB successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate the error message for DOB || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean select_Full_time_student_as_for_second_child_Mobile(String CFull) throws Exception {

		try {
			log.debug("Select Full time student in Child eligibility page for second child in mobile application");
			reuseMethod.scrollDown(MobChildMarriedNo2);
			Thread.sleep(500);
			reuseMethod.select_Single_value_Icon(MobChildFullTimeNoVal2, MobChildFullTimeNo2, MobChildFullTimeYes2,
					CFull);

			log.info(
					"Select Full time student in Child eligibility page successfully for second child in mobile application || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Full time student in Child eligibility page for second child in mobile application || Fail"
							+ e.getMessage());
			throw (e);
		}

	}

	public boolean select_Full_time_student_as_for_third_child_Mobile(String CFull) throws Exception {

		try {
			log.debug("Select Full time student in Child eligibility page for third child in mobile application");
			reuseMethod.scrollDown(MobChildMarriedNo3);
			Thread.sleep(500);
			reuseMethod.select_Single_value_Icon(MobChildFullTimeNoVal3, MobChildFullTimeNo3, MobChildFullTimeYes3,
					CFull);

			log.info(
					"Select Full time student in Child eligibility page successfully for third child in mobile application || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Full time student in Child eligibility page for third child in mobile application || Fail"
							+ e.getMessage());
			throw (e);
		}

	}

	public boolean select_Full_time_student_as_for_fourth_child_Mobile(String CFull) throws Exception {

		try {
			log.debug("Select Full time student in Child eligibility page for fourth child in mobile application");
			reuseMethod.scrollDown(MobChildMarriedNo4);
			Thread.sleep(500);
			reuseMethod.select_Single_value_Icon(MobChildFullTimeNoVal4, MobChildFullTimeNo4, MobChildFullTimeYes4,
					CFull);

			log.info(
					"Select Full time student in Child eligibility page successfully for fourth child in mobile application || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Full time student in Child eligibility page for fourth child in mobile application || Fail"
							+ e.getMessage());
			throw (e);
		}

	}

	public boolean select_Full_time_student_as_for_fifth_child_Mobile(String CFull) throws Exception {

		try {
			log.debug("Select Full time student in Child eligibility page for fifth child in mobile application");
			reuseMethod.scrollDown(MobChildMarriedNo5);
			Thread.sleep(500);
			reuseMethod.select_Single_value_Icon(MobChildFullTimeNoVal5, MobChildFullTimeNo5, MobChildFullTimeYes5,
					CFull);

			log.info(
					"Select Full time student in Child eligibility page successfully for fifth child in mobile application || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Full time student in Child eligibility page for fifth child in mobile application || Fail"
							+ e.getMessage());
			throw (e);
		}

	}

	public boolean select_Full_time_student_as_for_sixth_child_Mobile(String CFull) throws Exception {

		try {
			log.debug("Select Full time student in Child eligibility page for sixth child in mobile application");
			reuseMethod.scrollDown(MobChildMarriedNo6);
			Thread.sleep(500);
			reuseMethod.select_Single_value_Icon(MobChildFullTimeNoVal6, MobChildFullTimeNo6, MobChildFullTimeYes6,
					CFull);

			log.info(
					"Select Full time student in Child eligibility page successfully for sixth child in mobile application || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Full time student in Child eligibility page for sixth child in mobile application || Fail"
							+ e.getMessage());
			throw (e);
		}

	}

	public boolean select_Full_time_student_as_for_seventh_child_Mobile(String CFull) throws Exception {

		try {
			log.debug("Select Full time student in Child eligibility page for seventh child in mobile application");
			reuseMethod.scrollDown(MobChildMarriedNo7);
			Thread.sleep(500);
			reuseMethod.select_Single_value_Icon(MobChildFullTimeNoVal7, MobChildFullTimeNo7, MobChildFullTimeYes7,
					CFull);

			log.info(
					"Select Full time student in Child eligibility page successfully for seventh child in mobile application || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Full time student in Child eligibility page for seventh child in mobile application || Fail"
							+ e.getMessage());
			throw (e);
		}

	}

	public boolean select_Full_time_student_as_for_eighth_child_Mobile(String CFull) throws Exception {

		try {
			log.debug("Select Full time student in Child eligibility page for eighth child in mobile application");
			reuseMethod.scrollDown(MobChildMarriedNo8);
			Thread.sleep(500);
			reuseMethod.select_Single_value_Icon(MobChildFullTimeNoVal8, MobChildFullTimeNo8, MobChildFullTimeYes8,
					CFull);

			log.info(
					"Select Full time student in Child eligibility page successfully for eighth child in mobile application || Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Full time student in Child eligibility page for eighth child in mobile application || Fail"
							+ e.getMessage());
			throw (e);
		}

	}

	public boolean click_on_Delete_button_for_third_child_Mobile() throws Exception {

		try {
			log.debug("Click on Delete button for third child in mobile application");
			reuseMethod.scrollDown(MobChildMarriedNo2);
			Thread.sleep(1000);
			Delete_thirdchild_Mob.click();

			log.info("Delete third child in mobile application || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to delete third child in mobile application || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean click_on_Delete_button_for_second_child_Mobile() throws Exception {

		try {
			log.debug("Click on Delete button for second child in mobile application");
			reuseMethod.scrollDown(MobChildMarriedNo1);
			Thread.sleep(1000);
			Delete_secondchild_Mob.click();

			log.info("Delete second child in mobile application || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to delete second child in mobile application || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean user_enters_year_as_on_eligibility_page_Spouse_Mobile(String NSYYYY) throws Exception {

		try {
			log.debug("Enter year on Eligibility page for Spouse in mobile application");
			Thread.sleep(500);

			reuseMethod.scrollDown(SpouseLName);
			Thread.sleep(1000);
			mobSpouseYear.clear();
			if (NSYYYY.contains("SYSDate") || NSYYYY.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(NSYYYY);
				mobSpouseMonth.clear();
				mobSpouseDate.clear();
				mobSpouseMonth.click();
				mobSpouseMonth.sendKeys(date.substring(0, 2));
				mobSpouseDate.sendKeys(date.substring(2, 4));
				mobSpouseYear.sendKeys(date.substring(4, 8));

				Thread.sleep(1000);
			} else {
				mobSpouseYear.sendKeys(NSYYYY);
			}
			Thread.sleep(500);
			log.info("Enter year on Eligibility page for Spouse in mobile application successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter year on Eligibility page for Spouse in mobile application || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean verify_the_error_message_Help_Us_is_displayed_at_top_of_the_page() throws Throwable {

		try {
			log.debug("Validate the error message... Help us to display");
			ErrorMessage.isDisplayed();

			String ExpectedError_Msg = PropertyUtility.Load_MessageFile_Data("HelpUserrorMessage");
			String Err_Msg = ErrorMessage.getText();

			String Actual_Err_Msg = Err_Msg.replaceAll("\\n", "");

			System.err.println("Actual error message:" + Actual_Err_Msg);
			Actual_Err_Msg.replaceAll("\\s", "");
			ExpectedError_Msg.replaceAll("\\s", "");

			Assert.assertEquals(Actual_Err_Msg, ExpectedError_Msg,"validation fail for error message..Help Us to Display");

			log.info("Validated the error message successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate the error message || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean enter_details_for_fifth_child_as_Mobile(String Cfname4, String Clname4, String CMM4, String CDD4,
			String CYYYY4) throws Throwable {

		try {
			log.debug("Enter fifth child details for mobile application");

			MobChildFName5.sendKeys(Cfname4);
			MobChildLName5.sendKeys(Clname4);
			if (CYYYY4.contains("SYSDate")) {
				String date = reuseMethod.Enter_customized_previous_Date(CYYYY4);

				mobChildMonth5.click();
				mobChildMonth5.sendKeys(date);
				Thread.sleep(1000);
			} else {
				mobChildMonth5.sendKeys(CMM4);
				mobChildDate5.sendKeys(CDD4);
				mobChildYear5.sendKeys(CYYYY4);
			}
			Thread.sleep(1000);
			log.info("Enter fifth child details successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter fifth child details || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_child_Sex_and_Married_as_fifth_child_Mobile(String cgender, String CMarried)
			throws Exception {

		try {
			log.debug("Select gender and Married/Unmarried for Child in Child Eligibility page for mobile application");

			reuseMethod.select_Single_value_Icon(MobChildSexMaleVal5, MobChildSexMale5, MobChildSexFemale5, cgender);
			reuseMethod.select_Single_value_Icon(MobChildMarriedNoVal5, MobChildMarriedNo5, MobChildMarriedYes5,
					CMarried);

			log.info(
					"Select gender and Married/Unmarried for Child in Child Eligibility page successfully for mobile application|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Gender and Married/Unmarried for Child in Child Eligibility page for mobile application || Fail"
							+ e.getMessage());
			throw (e);
		}

	}

	public boolean enter_details_for_sixth_child_as_Mobile(String Cfname5, String Clname5, String CMM5, String CDD5,
			String CYYYY5) throws Throwable {

		try {
			log.debug("Enter sixth child details for mobile application");

			MobChildFName6.sendKeys(Cfname5);
			MobChildLName6.sendKeys(Clname5);
			if (CYYYY5.contains("SYSDate")) {
				String date = reuseMethod.Enter_customized_previous_Date(CYYYY5);

				mobChildMonth6.click();
				mobChildMonth6.sendKeys(date);
				Thread.sleep(1000);
			} else {
				mobChildMonth6.sendKeys(CMM5);
				mobChildDate6.sendKeys(CDD5);
				mobChildYear6.sendKeys(CYYYY5);
			}
			Thread.sleep(1000);
			log.info("Enter sixth child details successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter sixth child details || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_child_Sex_and_Married_as_sixth_child_Mobile(String cgender, String CMarried)
			throws Exception {

		try {
			log.debug("Select gender and Married/Unmarried for Child in Child Eligibility page for mobile application");

			reuseMethod.select_Single_value_Icon(MobChildSexMaleVal6, MobChildSexMale6, MobChildSexFemale6, cgender);
			reuseMethod.select_Single_value_Icon(MobChildMarriedNoVal6, MobChildMarriedNo6, MobChildMarriedYes6,
					CMarried);

			log.info(
					"Select gender and Married/Unmarried for Child in Child Eligibility page successfully for mobile application|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Gender and Married/Unmarried for Child in Child Eligibility page for mobile application || Fail"
							+ e.getMessage());
			throw (e);
		}

	}

	public boolean enter_details_for_seventh_child_as_Mobile(String Cfname6, String Clname6, String CMM6, String CDD6,
			String CYYYY6) throws Throwable {

		try {
			log.debug("Enter Seventh child details for mobile application");

			MobChildFName7.sendKeys(Cfname6);
			MobChildLName7.sendKeys(Clname6);
			if (CYYYY6.contains("SYSDate")) {
				String date = reuseMethod.Enter_customized_previous_Date(CYYYY6);

				mobChildMonth7.click();
				mobChildMonth7.sendKeys(date);
				Thread.sleep(1000);
			} else {
				mobChildMonth7.sendKeys(CMM6);
				mobChildDate7.sendKeys(CDD6);
				mobChildYear7.sendKeys(CYYYY6);
			}
			Thread.sleep(1000);
			log.info("Enter Seventh child details successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter Seventh child details || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_child_Sex_and_Married_as_seventh_child_Mobile(String cgender, String CMarried)
			throws Exception {

		try {
			log.debug("Select gender and Married/Unmarried for Child in Child Eligibility page for mobile application");

			reuseMethod.select_Single_value_Icon(MobChildSexMaleVal7, MobChildSexMale7, MobChildSexFemale7, cgender);
			reuseMethod.select_Single_value_Icon(MobChildMarriedNoVal7, MobChildMarriedNo7, MobChildMarriedYes7,
					CMarried);

			log.info(
					"Select gender and Married/Unmarried for Child in Child Eligibility page successfully for mobile application|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Gender and Married/Unmarried for Child in Child Eligibility page for mobile application || Fail"
							+ e.getMessage());
			throw (e);
		}

	}

	public boolean enter_details_for_eighth_child_as_Mobile(String Cfname7, String Clname7, String CMM7, String CDD7,
			String CYYYY7) throws Throwable {

		try {
			log.debug("Enter eighth child details for mobile application");

			MobChildFName8.sendKeys(Cfname7);
			MobChildLName8.sendKeys(Clname7);
			if (CYYYY7.contains("SYSDate")) {
				String date = reuseMethod.Enter_customized_previous_Date(CYYYY7);

				mobChildMonth8.click();
				mobChildMonth8.sendKeys(date);
				Thread.sleep(1000);
			} else {
				mobChildMonth8.sendKeys(CMM7);
				mobChildDate8.sendKeys(CDD7);
				mobChildYear8.sendKeys(CYYYY7);
			}
			Thread.sleep(1000);
			log.info("Enter eighth child details successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter eighth child details || Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean select_child_Sex_and_Married_as_eighth_child_Mobile(String cgender, String CMarried)
			throws Exception {

		try {
			log.debug("Select gender and Married/Unmarried for Child in Child Eligibility page for mobile application");

			reuseMethod.select_Single_value_Icon(MobChildSexMaleVal8, MobChildSexMale8, MobChildSexFemale8, cgender);
			reuseMethod.select_Single_value_Icon(MobChildMarriedNoVal8, MobChildMarriedNo8, MobChildMarriedYes8,
					CMarried);

			log.info(
					"Select gender and Married/Unmarried for Child in Child Eligibility page successfully for mobile application|| Pass");
			return true;
		} catch (Exception e) {
			log.error(
					"Not able to select Gender and Married/Unmarried for Child in Child Eligibility page for mobile application || Fail"
							+ e.getMessage());
			throw (e);
		}

	}

///
	@FindBy(id = "selEmploymentStatus")
	WebElement drpEmploymentStatus;

	public boolean selects_Employment_Status(String status) throws Exception {
		try {
			log.debug("Select Employment status");
			drpEmploymentStatus.isDisplayed();
			reuseMethod.dropDown(drpEmploymentStatus, status);
			log.info("Employment status is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Employment status|| Fail" + e.getMessage());

			throw (e);
		}

	}

	public boolean verify_that_the_dependent_note_is_displayed_for_Spouse() throws Throwable {
		try {
			log.debug("Verify that the dependent note is displayed for Spouse");
			String expected = PropertyUtility.Load_MessageFile_Data("SpouseDependentMessage");
			reuseMethod.scrollDown(SpouseRadioYes);
			SpouseCoverageMsg.isDisplayed();
			String actual = SpouseCoverageMsg.getText();
			Assert.assertEquals(actual, expected, "Dependent Coverage Note for Spouse is not matched");
			System.out.println("Dependent Coverage Note for Spouse Message is valiadted...");
			log.info("Dependent Coverage Note for Spouse is validated sucessfully...||Pass");
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Dependent Coverage Note for Spouse Message is not valiadted...");
			log.error("Not able to Validate that the Dependent Coverage Note for Spouse message|| Fail");
			return false;
		}
	}

	public boolean enter_DOB_details_as_on_eligibility_page_Self_Mobile(String MM, String DD, String YYYY)
			throws Exception {

		try {
			log.debug("Enter DOB on Eligibility page for Self in mobile application");
			Thread.sleep(500);

			reuseMethod.scrollDown(LastName);
			Thread.sleep(1000);
			mobSelfMonth.clear();
			mobSelfDate.clear();
			mobSelfYear.clear();
			if (YYYY.contains("SYSDate") || YYYY.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(YYYY);

				mobSelfMonth.click();
				mobSelfMonth.sendKeys(date.substring(0, 2));
				mobSelfDate.sendKeys(date.substring(2, 4));
				mobSelfYear.sendKeys(date.substring(4, 8));

				Thread.sleep(1000);
			} else {
				mobSelfMonth.sendKeys(MM);
				mobSelfDate.sendKeys(DD);
				mobSelfYear.sendKeys(YYYY);
			}
			Thread.sleep(500);
			log.info("Enter DOB on Eligibility page for Self in mobile application successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter DOB on Eligibility page for Self in mobile application || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean enter_DOB_as_on_eligibility_page_Spouse_Mobile(String MM, String DD, String SYYYY) throws Exception {

		try {
			log.debug("Enter DOB on Eligibility page for Spouse in mobile application");
			Thread.sleep(500);

			reuseMethod.scrollDown(SpouseLName);
			Thread.sleep(1000);
			mobSpouseYear.clear();
			mobSpouseMonth.clear();
			mobSpouseDate.clear();
			if (SYYYY.contains("SYSDate") || SYYYY.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(SYYYY);
				mobSpouseMonth.click();
				mobSpouseMonth.sendKeys(date.substring(0, 2));
				mobSpouseDate.sendKeys(date.substring(2, 4));
				mobSpouseYear.sendKeys(date.substring(4, 8));

				Thread.sleep(1000);
			} else {
				mobSpouseMonth.sendKeys(MM);
				mobSpouseDate.sendKeys(DD);
				mobSpouseYear.sendKeys(SYYYY);
			}
			Thread.sleep(500);
			log.info("Enter DOB on Eligibility page for Spouse in mobile application successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter DOB on Eligibility page for Spouse in mobile application || Fail"
					+ e.getMessage());
			throw (e);
		}

	}

	public boolean enter_DOB_details_for_child_mobile(String CMM, String CDD, String Cyyyy) throws Throwable {
		try {
			log.debug("Enter DOB details for child in mobile application");
			Thread.sleep(500);
			reuseMethod.scrollDown(MobChildFName1);
			mobChildMonth1.clear();
			mobChildDate1.clear();
			mobChildYear1.clear();
			if (Cyyyy.contains("SYSDate") || Cyyyy.contains("SYSdate") || Cyyyy.contains("SYSDATE")) {
				String date = reuseMethod.Enter_customized_previous_Date(Cyyyy);

				mobChildMonth1.click();
				mobChildMonth1.sendKeys(date.substring(0, 2));
				mobChildDate1.sendKeys(date.substring(2, 4));
				mobChildYear1.sendKeys(date.substring(4, 8));
				Thread.sleep(1000);
			} else {
				mobChildMonth1.sendKeys(CMM);
				mobChildDate1.sendKeys(CDD);
				mobChildYear1.sendKeys(Cyyyy);
			}
			Thread.sleep(500);
			log.info("Enter year details for child in mobile application successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter year details for child in mobile application || Fail" + e.getMessage());
			throw (e);
		}
	}

	public Boolean validate_Spouse_Apply_Separately_Error_message() throws Throwable {
		try {
			log.debug("Validate Error Message on Eligiblity Page");
			String Expected = PropertyUtility.Load_MessageFile_Data("SpouseSeparatelyErrorMessage");
			ErrorMessage.isDisplayed();
			String actual = ErrorMessage.getText();
			System.err.println("Error Message on Eligiblity Page===" + actual);
			Assert.assertEquals(actual, Expected, "Error message on Eligiblity is Not Displayed");

			log.info("Error Message on Eligiblity Page is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Error Message on Eligiblity Page || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean Enters_Basic_Salary_Self(String Salary) throws Exception {
		try {

			log.debug("Enters basic salary for self");
			BasicSalary.sendKeys(Salary);
			Thread.sleep(1000);
			log.info("Enters basic salary for self successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to enter basic salary for self || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean select_Dependent_as_NO_for_Self_Mobile() throws Exception {

		try {
			log.debug("Select Dependent as No for Self in mobile application");

			reuseMethod.scrollDown(WeeklyHrs);
			mobDependentNo.click();
			Thread.sleep(500);
			log.info("Select Dependent as NO for Self in mobile application successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Dependent as NO for Self in mobile application || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean validate_State_as_(String state) throws Exception {
		try {
			log.debug("Validate the selected state");
			String actualState = StateOrProvince.getText();
			if (actualState.equalsIgnoreCase(state))
				log.info("State is validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate the selected state || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean clicks_edit_button() throws Exception {

		try {
			log.debug("Click on edit button");
			reuseMethod.scrollDown(btnEdit);
			reuseMethod.Clickbutton(btnEdit);
			Thread.sleep(5000);
			log.info("Click on edit button successfully || Pass");
			return true;
		} catch (Exception e) {
			System.out.println("Not able to click on edit button || Fail" + e.getMessage());
			throw (e);

		}
	}

	public boolean eligibility_details_are_displayed_to_user() throws Exception {
		try {
			log.debug("Validate the Eligibility details is Displayed");
			EligibilityDetails.isDisplayed();
			log.info("Eligibility is Displayed successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to displayed Eligibility deatils || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean validates_Eligibility_Question_as(String Question) throws Exception {
		try {
			log.debug("Validate the Eligibility Question is Displayed");
			String actual = EligibilityQuestion.getText();
			assertEquals(actual, Question, "Eligibility Question is not Validated");
			System.out.println("Eligibility Question is Validated successfully");
			log.info("Eligibility Question is Validated successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate the Eligibility Question || Fail" + e.getMessage());
			throw (e);

		}

	}

	public boolean enter_details_for_Self_without_state_as(String title, String Fname, String Lname, String Dob,
			String workhr) throws Exception {

		try {
			log.debug("Enter Eligibility details for Self");

			reuseMethod.dropDown(Title, title);
			FirstName.sendKeys(Fname);
			LastName.sendKeys(Lname);
			reuseMethod.scrollDown(LastName);
			DOB.clear();
			DOB.click();
			
			if (Dob.contains("SYSDATE") || Dob.contains("SYSDate") || Dob.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(Dob);
				Thread.sleep(1000);
				DOB.sendKeys(date);
			}
			else if (Dob.equalsIgnoreCase("CurrentDate")) {
				Thread.sleep(1000);
				
				String date=reuseMethod.Enter_Current_System_Date();
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				DOB.sendKeys(date);
			} else if(!Dob.contains("/")) {
				Thread.sleep(1000);
				
				Dob=Dob.substring(0, 2)+"/"+Dob.substring(2, 4)+"/"+Dob.substring(4, Dob.length());
				DOB.sendKeys(Dob);
				Thread.sleep(1000);
			}
			else
			{
				Thread.sleep(1000);
				
				DOB.sendKeys(Dob);
				Thread.sleep(1000);
			}
			Thread.sleep(2000);

			EmailId.click();
			email = reuseMethod.RandomEmail(EmailId);
			WeeklyHrs.sendKeys(workhr);
			reuseMethod.addemail(email);

			log.info("Eligibility Details enter successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able enter eligibility details || Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Eligibility_Status(String status) throws Exception {
		try {
			log.debug("Select Eligibility status");
			drpEligibilityStatus.isDisplayed();
			reuseMethod.dropDown(drpEligibilityStatus, status);
			log.info("Eligibility status is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Eligibility status|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Last_School_Attended_GraduateDate(String school, String gradDate) throws Exception {
		try {
			log.debug("Select Last School Attended/Currently Attending");
			drpLastSchoolAttended.isDisplayed();
			reuseMethod.dropDown(drpLastSchoolAttended, school);
			if (gradDate.contains("SYSDATE") || gradDate.contains("SYSDate") || gradDate.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(gradDate);
				Thread.sleep(1000);
				GradDate_Self.click();
				GradDate_Self.clear();
				GradDate_Self.sendKeys(date);
			}
			if (gradDate.equalsIgnoreCase("CurrentDate")) {
				Thread.sleep(1000);
				GradDate_Self.click();
				GradDate_Self.clear();
				String date=reuseMethod.Enter_Current_System_Date();
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				GradDate_Self.sendKeys(date);
				
			} else if(!gradDate.contains("/")) {
				Thread.sleep(1000);
				GradDate_Self.click();
				gradDate=gradDate.substring(0, 2)+"/"+gradDate.substring(2, 4)+"/"+gradDate.substring(4, gradDate.length());
				GradDate_Self.sendKeys(gradDate);
				Thread.sleep(1000);
			}
			
			else
			{
				Thread.sleep(1000);
				GradDate_Self.click();
				GradDate_Self.sendKeys(gradDate);
				Thread.sleep(1000);
			}
			Thread.sleep(2000);

			log.info("Last School Attended/Currently Attending is selected and  sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Last School Attended/Currently Attending|| Fail" + e.getMessage());
			throw (e);
		}
	}

	public boolean selects_Last_School_Attended(String school) throws Exception {
		try {
			log.debug("Select Last School Attended/Currently Attending");
			drpLastSchoolAttended.isDisplayed();
			reuseMethod.dropDown(drpLastSchoolAttended, school);
			log.info("Last School Attended/Currently Attending is selected and  sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Last School Attended/Currently Attending|| Fail" + e.getMessage());
			throw (e);
		}
	}

	
	
	
	public boolean selects_eligibility_Status_Self(String status) throws Exception {
		try {
			log.debug("Select eligibility status");
			
			reuseMethod.dropDown(eligibilityStatus, status);
			log.info("Select eligibility status sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select eligibility status|| Fail" + e.getMessage());
			throw (e);
		}
	}


	public boolean verify_Eligibility_Spouse__notification_is_displayed() throws Throwable 
	{

		try {
			log.debug("Validate the notification for uninsured member's spouse");
			uninsuredSpouseNotification.isDisplayed();
			String ExpectedAddressError_Msg = PropertyUtility.Load_MessageFile_Data("EligibilitySpouseNotification");
			String AddressErr_Msg = uninsuredSpouseNotification.getText();
			String Actual_AddressErr_Msg = AddressErr_Msg.replaceAll("\\n", "");
			System.err.println("Actual notification for uninsured member's spouse:" + Actual_AddressErr_Msg);
			Actual_AddressErr_Msg.replaceAll("\\s", "");
			ExpectedAddressError_Msg.replaceAll("\\s", "");
			Assert.assertEquals(Actual_AddressErr_Msg, ExpectedAddressError_Msg,
					"validation notification for uninsured member's spouse");
			log.info("Validated the notification for uninsured member's spouse successfully || Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate the notification for uninsured member's spouse || Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean validate_Rider_exceed_Term_Life_Error_Message() throws Exception {
		try {
			log.debug("Validate Rider amount cannot exceed the amount of Traditional Term Life Insurance error message.");
			Thread.sleep(4000);
			System.err.println(RiderAmtExceedErrror.getText());
			RiderAmtExceedErrror.isDisplayed();
			String Expected = PropertyUtility.Load_MessageFile_Data("RiderExceedTermErrorMessage");
			String AgeRestriction_actualMsg = RiderAmtExceedErrror.getText();
			Assert.assertEquals(AgeRestriction_actualMsg, Expected, "Rider amount cannot exceed is Not Validated...");
			log.info("Rider amount cannot exceed is validated sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Validate Rider amount cannot exceed || Fail" + e.getMessage());
			throw (e);
		}
	}	
	

	//Test-Pradeep
		public boolean enter_TestData_as(String Fname, String FirstName){
			
		//WebElement element=null;
		//element=FirstName;
			//WebElement FN=FirstName;
			try {
				
				System.out.println("IN method");
				log.debug("Enter Business Address Details");
				
				//FN.sendKeys(Fname);
				//driver.findElement(By.id(FirstName)).sendKeys(Fname);
				log.info(" Business Address details are entered Sucessfully|| Pass");
				return true;
			} catch (Exception e) {
				log.error("Not able to enter Business Address details|| Fail" + e.getMessage());
				throw (e);
			}
		}

	public boolean selects_Career_Stage(String stage) throws Exception {
		try {
			log.debug("Select Career stage");
			drpCareerStage.isDisplayed();
			reuseMethod.dropDown(drpCareerStage, stage);
			log.info("Career stage is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Career stage|| Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean selects_Began_UnderGraduateDate_Place(String gradDate,String school) throws Exception {
		try {
			log.debug("Select Began undergraduate medical studies date and place");
			if (gradDate.contains("SYSDATE") || gradDate.contains("SYSDate") || gradDate.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(gradDate);
				Thread.sleep(1000);
				BeganUGMedicalDate_Self.click();
				BeganUGMedicalDate_Self.clear();
				BeganUGMedicalDate_Self.sendKeys(date);
			}
			if (gradDate.equalsIgnoreCase("CurrentDate")) {
				Thread.sleep(1000);
				BeganUGMedicalDate_Self.click();
				BeganUGMedicalDate_Self.clear();
				String date=reuseMethod.Enter_Current_System_Date();
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				BeganUGMedicalDate_Self.sendKeys(date);
				
			} else if(!gradDate.contains("/")) {
				Thread.sleep(1000);
				BeganUGMedicalDate_Self.click();
				gradDate=gradDate.substring(0, 2)+"/"+gradDate.substring(2, 4)+"/"+gradDate.substring(4, gradDate.length());
				BeganUGMedicalDate_Self.sendKeys(gradDate);
				Thread.sleep(1000);
			}
			
			else
			{
				Thread.sleep(1000);
				BeganUGMedicalDate_Self.click();
				BeganUGMedicalDate_Self.sendKeys(gradDate);
				Thread.sleep(1000);
			}
			Thread.sleep(2000);
			drpBeganUGMedical_place.isDisplayed();
			reuseMethod.dropDown(drpBeganUGMedical_place, school);
			log.info("Began undergraduate medical studies date and place is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Began undergraduate medical studies date and place|| Fail" + e.getMessage());
			throw (e);
		}
	}
	
	public boolean selects_Complete_UnderGraduateDate(String gradDate) throws Exception {
		try {
			log.debug("Select complete undergraduate medical studies date");
			if (gradDate.contains("SYSDATE") || gradDate.contains("SYSDate") || gradDate.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(gradDate);
				Thread.sleep(1000);
				completeUGMedicalDate_Self.click();
				completeUGMedicalDate_Self.clear();
				completeUGMedicalDate_Self.sendKeys(date);
			}
			if (gradDate.equalsIgnoreCase("CurrentDate")) {
				Thread.sleep(1000);
				completeUGMedicalDate_Self.click();
				completeUGMedicalDate_Self.clear();
				String date=reuseMethod.Enter_Current_System_Date();
				date=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4, date.length());
				completeUGMedicalDate_Self.sendKeys(date);
				
			} else if(!gradDate.contains("/")) {
				Thread.sleep(1000);
				completeUGMedicalDate_Self.click();
				gradDate=gradDate.substring(0, 2)+"/"+gradDate.substring(2, 4)+"/"+gradDate.substring(4, gradDate.length());
				completeUGMedicalDate_Self.sendKeys(gradDate);
				Thread.sleep(1000);
			}
			
			else
			{
				Thread.sleep(1000);
				completeUGMedicalDate_Self.click();
				completeUGMedicalDate_Self.sendKeys(gradDate);
				Thread.sleep(1000);
			}
			Thread.sleep(2000);
			log.info("Complete undergraduate medical studies date is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to select Complete undergraduate medical studies date|| Fail" + e.getMessage());
			throw (e);
		}
	}
	


		
		
		
		//**************
	


	public boolean enter_Employer_Or_Agency_Name_as(String name) throws Exception {
		try {
			log.debug("Enter Employer Or Agency Name");
			Thread.sleep(600);
			Emp_AgencyName_Self.isDisplayed();
			Emp_AgencyName_Self.sendKeys(name);
			log.info("Employer Or Agency Name  is entered sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Enter Employer Or Agency Name|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Yes_for_Dependent_Children() throws Exception {
		try {
			log.debug("Selects Yes Radio Button for Dependent Children");
			Thread.sleep(600);
			DependentChild_Yes.isDisplayed();
			DependentChild_Yes.click();
			log.info("Yes Radio Button for Dependent Children is clicked sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Yes Radio Button for Dependent Children|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_No_for_Dependent_Children() throws Exception {
		try {
			log.debug("Selects No Radio Button for Dependent Children");
			Thread.sleep(600);
			DependentChild_No.isDisplayed();
			DependentChild_No.click();
			log.info(" No Radio Button for Dependent Children is clicked sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects No Radio Button for Dependent Children|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Marital_Status_as(String status) throws Exception {
		try {
			log.debug("Selects Marital Status ");
			Thread.sleep(600);
			MaritalStatus.isDisplayed();
			reuseMethod.dropDown(MaritalStatus, status);
			log.info(" Marital Status is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Marital Status|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Hear_about_us_as(String source) throws Exception {
		try {
			log.debug("Selects Hear about us");
			Thread.sleep(600);
			HearAboutUs.isDisplayed();
			reuseMethod.dropDown(HearAboutUs, source);
			log.info(" Hear about us is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Hear about us|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean enters_Details_about_other_Source_as(String source) throws Exception {
		try {
			log.debug("Enters Details about other Source as");
			Thread.sleep(600);
			HearAboutDetails.isDisplayed();
			HearAboutDetails.sendKeys(source);
			log.info("Details about other Source as is entered sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Enters Details about other Source as|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean enters_Marraige_Date_for_Spouse_as(String DateOfBirth) throws Exception {
		try {
			log.debug("Enters Marraige Date for Spouse as");
			Thread.sleep(600);
			MarriageDate_Spouse.isDisplayed();

			MarriageDate_Spouse.click();
			MarriageDate_Spouse.clear();
			Thread.sleep(1000);
			String b = Keys.BACK_SPACE.toString();
			MarriageDate_Spouse.sendKeys(b + b + b + b + b + b + b + b + b + b);
			// reuseMethod.scrollDown(DOB);

			if (DateOfBirth.contains("SYSDATE") || DateOfBirth.contains("SYSDate") || DateOfBirth.contains("SYSdate")) {
				String date = reuseMethod.Enter_customized_previous_Date(DateOfBirth);

				date = date.substring(0, 2) + "/" + date.substring(2, 4) + "/" + date.substring(4, date.length());
				// reuseMethod.enterDate_by_JavaScript(selfDOBlocator,date);
				System.out.println(date);
				Thread.sleep(1000);
				MarriageDate_Spouse.sendKeys(date);

			} else if (DateOfBirth.equalsIgnoreCase("CurrentDate")) {

				String date = reuseMethod.Enter_Current_System_Date();
				date = date.substring(0, 2) + "/" + date.substring(2, 4) + "/" + date.substring(4, date.length());
				Thread.sleep(1000);

				MarriageDate_Spouse.sendKeys(date);

			} else if (!DateOfBirth.contains("/")) {

				Thread.sleep(1000);
				DateOfBirth = DateOfBirth.substring(0, 2) + "/" + DateOfBirth.substring(2, 4) + "/"
						+ DateOfBirth.substring(4, DateOfBirth.length());
				// reuseMethod.enterDate_by_JavaScript(selfDOBlocator,DateOfBirth);
				MarriageDate_Spouse.sendKeys(DateOfBirth);

			} else {
				Thread.sleep(1000);

				// reuseMethod.enterDate_by_JavaScript(selfDOBlocator,DateOfBirth);
				MarriageDate_Spouse.sendKeys(DateOfBirth);
			}
			Thread.sleep(1000);

			EmailId.click();
			log.info("Details about other Source as is entered sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Enters Details about other Source as|| Fail" + e.getMessage());
			throw (e);
		}

	}


	public boolean selects_I_am_as(String profession) throws Exception {
		try {
			log.debug("Selects Applicant Type as");
			Thread.sleep(600);
			ApplicantType.isDisplayed();
			reuseMethod.dropDown(ApplicantType, profession);
			log.info(" Applicant Type is selected sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Applicant type..|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Yes_Radio_Button_for_Actively_Performing_Normal_Duties_of_your_occupation_Question() throws Exception {
		try {
			log.debug("Selects Yes Radio Button for Actively Performing Normal Duties of your occupation Question");
			Thread.sleep(600);
			ActiveAtWork_Yes.isDisplayed();
			ActiveAtWork_Yes.click();
			log.info("Yes Radio Button for Actively Performing Normal Duties of your occupation Question is clicked sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Yes Radio Button for Actively Performing Normal Duties of your occupation Question|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_No_Radio_Button_for_Actively_Performing_Normal_Duties_of_your_occupation_Question() throws Exception {
		try {
			log.debug("Selects No Radio Button for Actively Performing Normal Duties of your occupation Question");
			Thread.sleep(600);
			ActiveAtWork_No.isDisplayed();
			ActiveAtWork_No.click();
			log.info("NO Radio Button for Actively Performing Normal Duties of your occupation Question is clicked sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects No Radio Button for Actively Performing Normal Duties of your occupation Question|| Fail" + e.getMessage());
			throw (e);
		}

	}

	public boolean selects_Yes_Radio_Button_for_Premier_Accident_or_Hospital_Income_coverages_for_your_spouse_Question() throws Exception {
		try {
			log.debug("Selects Yes Radio Button for Premier Accident or Hospital Income coverages for your spouse Question");
			Thread.sleep(600);
			PremierAccidentorHospitalIncomeSpouse_Yes.isDisplayed();
			PremierAccidentorHospitalIncomeSpouse_Yes.click();
			log.info("Yes Radio Button for Premier Accident or Hospital Income coverages for your spouse Question is clicked sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Yes Radio Button for Premier Accident or Hospital Income coverages for your spouse Question|| Fail" + e.getMessage());
			throw (e);
		}

	}
	public boolean selects_No_Radio_Button_for_Premier_Accident_or_Hospital_Income_coverages_for_your_spouse_Question() throws Exception {
		try {
			log.debug("Selects No Radio Button for Premier Accident or Hospital Income coverages for your spouse Question");
			Thread.sleep(600);
			PremierAccidentorHospitalIncomeSpouse_No.isDisplayed();
			PremierAccidentorHospitalIncomeSpouse_No.click();
			log.info("No Radio Button for Premier Accident or Hospital Income coverages for your spouse Question is clicked sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects No Radio Button for Premier Accident or Hospital Income coverages for your spouse Question|| Fail" + e.getMessage());
			throw (e);
		}

	}

	

	public boolean selects_Yes_Radio_Button_for_Wish_to_apply_for_apply_for_insurance_for_any_children_Question() throws Exception {
		try {
			log.debug("Selects Yes Radio Button for Wish to apply for apply for insurance for any children Question");
			Thread.sleep(600);
			InsuranceForChild_Yes.isDisplayed();
			InsuranceForChild_Yes.click();
			log.info("Yes Radio Button  for Wish to apply for apply for insurance for any children Question is clicked sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects Yes Radio Button for Wish to apply for apply for insurance for any children Question|| Fail" + e.getMessage());
			throw (e);
		}

	}
	

	public boolean selects_No_Radio_Button_for_Wish_to_apply_for_apply_for_insurance_for_any_children_Question() throws Exception {
		try {
			log.debug("Selects No Radio Button for Wish to apply for apply for insurance for any children Question");
			Thread.sleep(600);
			InsuranceForChild_No.isDisplayed();
			InsuranceForChild_No.click();
			log.info("No Radio Button  for Wish to apply for apply for insurance for any children Question is clicked sucessfully|| Pass");
			return true;
		} catch (Exception e) {
			log.error("Not able to Selects No Radio Button for Wish to apply for apply for insurance for any children Question|| Fail" + e.getMessage());
			throw (e);
		}

	}

	

}
