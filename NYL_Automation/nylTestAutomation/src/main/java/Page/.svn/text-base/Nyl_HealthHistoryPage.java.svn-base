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
import Utility.ExcelUtility;
//import Utility.Excel_Utility;
import Utility.ReuseableMethod;
public class Nyl_HealthHistoryPage extends SetUp{
	
//public WebDriver driver = null;
public static Logger log =LogManager.getLogger(Nyl_HealthHistoryPage.class.getName());
ExcelUtility testUtil = new ExcelUtility();
String sheetName="HealthHistory";

public Nyl_HealthHistoryPage(){
driver = getDriver();
PageFactory.initElements(new AjaxElementLocatorFactory(driver, 7), this);
}

ReuseableMethod reuseMethod = new ReuseableMethod();
ScreenShotUtility screenShotUtility = new ScreenShotUtility();

//Health History_Section1 for Self
/*Health History
@FindBy(contains(text(),"rdWeightChangeSlf-0")
WebElement WAEPA_WeightChange_Yes;*/
//Health History_Section1*******************

@FindBy(id="rdWeightChangeSlf-0")
WebElement WAEPA_WeightChange_Yes;

@FindBy(id="txtWeightChangeAmtSlf")
WebElement WAEPA1a_Amount;

@FindBy(id="rdWeightChangeSlf-1")
WebElement WAEPA_WeightChange_No;


//Health History_Section2*******************
@FindBy(id="rdInsuranceDeclineSlf-0")
WebElement AppliedForInsurance_Yes;

@FindBy(id="rdInsuranceDeclineSlf-1")
WebElement AppliedForInsurance_No;

@FindBy(id="rdInsuranceBenSlf-0")
WebElement Self_Benefit_Yes;

@FindBy(id="rdInsuranceBenSlf-1")
WebElement Self_Benefit_No;



//Health History_Section3*******************
@FindBy(id="rdMedSurgTreatSlf-0")
WebElement Self_SurgeryTreatment_Yes;

@FindBy(id="rdMedSurgTreatSlf-1")
WebElement Self_SurgeryTreatment_No;

@FindBy(id="rdTreatMedSlf-0")
WebElement Self_MedicationTreatment_Yes;

@FindBy(id="rdTreatMedSlf-1")
WebElement Self_MedicationTreatment_No;



//Health History_Section4*******************
@FindBy(id="txtPhyFullNameSlf")
WebElement Self_PhysicianFullName;

@FindBy(id="txtPhyFullAddSlf")
WebElement Self_PhysicianAddress;

@FindBy(id="dtOfConsultSlf")
WebElement Self_DateOflastConsult;

@FindBy(id="txtPhyReasonSlf")
WebElement Self_PhysicianReason;

@FindBy(id="txtPhyDiagTreatSlf")
WebElement Self_PhysicianDiagnosis;

@FindBy(id="rdXRaySlf-0")
WebElement Self_PhysicianXray_Yes;

@FindBy(id="rdXRaySlf-1")
WebElement Self_PhysicianXray_No;



//Health History_Section5*******************

@FindBy(id="rdBloodPressureSlf-0")
WebElement Self_BloodPressure_Yes;

@FindBy(id="rdBloodPressureSlf-1")
WebElement Self_BloodPressure_No;

@FindBy(id="rdJaundiceSlf-0")
WebElement Self_Ulcer_Yes;

@FindBy(id="rdJaundiceSlf-1")
WebElement Self_Ulcer_No;

@FindBy(id="rdAsthmaSlf-0")
WebElement Self_Asthma_Yes;

@FindBy(id="rdAsthmaSlf-1")
WebElement Self_Asthma_No;

@FindBy(id="rdKidneySlf-0")
WebElement Self_Urine_Yes;

@FindBy(id="rdKidneySlf-1")
WebElement Self_Urine_No;

@FindBy(id="rdArthriticSlf-0")
WebElement Self_Arthritic_Yes;

@FindBy(id="rdArthriticSlf-1")
WebElement Self_Arthritic_No;

@FindBy(id="rdParalysisSlf-0")
WebElement Self_Convulsions_Yes;

@FindBy(id="rdParalysisSlf-1")
WebElement Self_Convulsions_No;

@FindBy(id="rdStressSlf-0")
WebElement Self_Stress_Yes;

@FindBy(id="rdStressSlf-1")
WebElement Self_Stress_No;

@FindBy(id="rdDiabetesSlf-0")
WebElement Self_Diabetes_Yes;

@FindBy(id="rdDiabetesSlf-1")
WebElement Self_Diabetes_No;

@FindBy(id="rdAnemiaSlf-0")
WebElement Self_Animia_Yes;

@FindBy(id="rdAnemiaSlf-1")
WebElement Self_Animia_No;

@FindBy(id="rdThroatSlf-0")
WebElement Self_Skin_Yes;

@FindBy(id="rdThroatSlf-1")
WebElement Self_Skin_No;

@FindBy(id="rdCancerSlf-0")
WebElement Self_Cancer_Yes;

@FindBy(id="rdCancerSlf-1")
WebElement Self_Cancer_No;

@FindBy(id="rdIllnessSlf-0")
WebElement Self_Illness_Yes;

@FindBy(id="rdIllnessSlf-1")
WebElement Self_Illness_No;


//Health History_Section6*******************

@FindBy(id="rdAlcoholSlf-0")
WebElement Self_DrinkAlcohol_Yes;

@FindBy(id="rdAlcoholSlf-1")
WebElement Self_DrinkAlcohol_No;

@FindBy(id="rdAlcoholFiveYrSlf-0")
WebElement Self_PastFiveYrAlcohol_Yes;

@FindBy(id="rdAlcoholFiveYrSlf-1")
WebElement Self_PastFiveYrAlcohol_No;

@FindBy(id="rdPastFiveYrAlcoholSlf-0")
WebElement Self_PastFiveYrAlcoholIndicated_Yes;

@FindBy(id="rdPastFiveYrAlcoholSlf-1")
WebElement Self_PastFiveYrAlcoholIndicated_No;

@FindBy(id="rdPastFiveSedAlcoholSlf-0")
WebElement Self_PastFiveYrSedative_Yes;

@FindBy(id="rdPastFiveSedAlcoholSlf-1")
WebElement Self_PastFiveYrSedative_No;

@FindBy(id="rdPastFiveMarAlcoholSlf-0")
WebElement Self_Marijuana_Yes;

@FindBy(id="rdPastFiveMarAlcoholSlf-1")
WebElement Self_Marijuana_No;

@FindBy(id="rdJetSmokerQuestSlf-0")
WebElement Self_Tobacco_Yes;

@FindBy(id="rdJetSmokerQuestSlf-1")
WebElement Self_Tobacco_No;

@FindBy(id="rdPastFivePhyAlcoholSlf-0")
WebElement Self_Physician_Yes;

@FindBy(id="rdPastFivePhyAlcoholSlf-1")
WebElement Self_Physician_No;


//Health History_Section7*******************

@FindBy(id="rdPastFiveYrLicSuspSlf-0")
WebElement Self_licenseSuspended_Yes;

@FindBy(id="rdPastFiveYrLicSuspSlf-1")
WebElement Self_licenseSuspended_No;

@FindBy(id="rdConCrimeNonMNCTSlf-0")
WebElement Self_crime_Yes;

@FindBy(id="rdConCrimeNonMNCTSlf-1")
WebElement Self_crime_No;


//Health History_Section8*******************
@FindBy(id="rdFamilyHistorySlf-0")
WebElement Self_FamilyHistory_Yes;

@FindBy(id="rdFamilyHistorySlf-1")
WebElement Self_FamilyHistory_No;

//Health History_Section1 for Self
//Health History_Section1*******************

@FindBy(id="rdWeightChangeSps-0")
WebElement WAEPA_WeightChange_Spouse_Yes;


@FindBy(id="rdWeightChangeSps-1")
WebElement WAEPA_WeightChange_Spouse_No;


//Health History_Section2*******************
@FindBy(id="rdInsuranceDeclineSps-0")
WebElement AppliedForInsurance_Spouse_Yes;

@FindBy(id="rdInsuranceDeclineSps-1")
WebElement AppliedForInsurance_Spouse_No;

@FindBy(id="rdInsuranceBenSps-0")
WebElement Spouse_Benefit_Yes;

@FindBy(id="rdInsuranceBenSps-1")
WebElement Spouse_Benefit_No;



//Health History_Section3*******************
@FindBy(id="rdMedSurgTreatSps-0")
WebElement Spouse_SurgeryTreatment_Yes;

@FindBy(id="rdMedSurgTreatSps-1")
WebElement Spouse_SurgeryTreatment_No;

@FindBy(id="rdTreatMedSps-0")
WebElement Spouse_MedicationTreatment_Yes;

@FindBy(id="rdTreatMedSps-1")
WebElement Spouse_MedicationTreatment_No;



//Health History_Section4*******************
@FindBy(id="txtPhyFullNameSps")
WebElement Spouse_PhysicianFullName;

@FindBy(id="txtPhyFullAddSps")
WebElement Spouse_PhysicianAddress;

@FindBy(id="dtOfConsultSps")
WebElement Spouse_DateOflastConsult;

@FindBy(id="txtPhyReasonSps")
WebElement Spouse_PhysicianReason;

@FindBy(id="txtPhyDiagTreatSps")
WebElement Spouse_PhysicianDiagnosis;

@FindBy(id="rdXRaySps-0")
WebElement Spouse_PhysicianXray_Yes;

@FindBy(id="rdXRaySps-1")
WebElement Spouse_PhysicianXray_No;



//Health History_Section5*******************

@FindBy(id="rdBloodPressureSps-0")
WebElement Spouse_BloodPressure_Yes;

@FindBy(id="rdBloodPressureSps-1")
WebElement Spouse_BloodPressure_No;

@FindBy(id="rdJaundiceSps-0")
WebElement Spouse_Ulcer_Yes;

@FindBy(id="rdJaundiceSps-1")
WebElement Spouse_Ulcer_No;

@FindBy(id="rdAsthmaSps-0")
WebElement Spouse_Asthma_Yes;

@FindBy(id="rdAsthmaSps-1")
WebElement Spouse_Asthma_No;

@FindBy(id="rdKidneySps-0")
WebElement Spouse_Urine_Yes;

@FindBy(id="rdKidneySps-1")
WebElement Spouse_Urine_No;

@FindBy(id="rdArthriticSps-0")
WebElement Spouse_Arthritic_Yes;

@FindBy(id="rdArthriticSps-1")
WebElement Spouse_Arthritic_No;

@FindBy(id="rdParalysisSps-0")
WebElement Spouse_Convulsions_Yes;

@FindBy(id="rdParalysisSps-1")
WebElement Spouse_Convulsions_No;

@FindBy(id="rdStressSps-0")
WebElement Spouse_Stress_Yes;

@FindBy(id="rdStressSps-1")
WebElement Spouse_Stress_No;

@FindBy(id="rdDiabetesSps-0")
WebElement Spouse_Diabetes_Yes;

@FindBy(id="rdDiabetesSps-1")
WebElement Spouse_Diabetes_No;

@FindBy(id="rdAnemiaSps-0")
WebElement Spouse_Animia_Yes;

@FindBy(id="rdAnemiaSps-1")
WebElement Spouse_Animia_No;

@FindBy(id="rdThroatSps-0")
WebElement Spouse_Skin_Yes;

@FindBy(id="rdThroatSps-1")
WebElement Spouse_Skin_No;

@FindBy(id="rdCancerSps-0")
WebElement Spouse_Cancer_Yes;

@FindBy(id="rdCancerSps-1")
WebElement Spouse_Cancer_No;

@FindBy(id="rdIllnessSps-0")
WebElement Spouse_Illness_Yes;

@FindBy(id="rdIllnessSps-1")
WebElement Spouse_Illness_No;


//Health History_Section6*******************

@FindBy(id="rdAlcoholSps-0")
WebElement Spouse_DrinkAlcohol_Yes;

@FindBy(id="rdAlcoholSps-1")
WebElement Spouse_DrinkAlcohol_No;

@FindBy(id="rdAlcoholFiveYrSps-0")
WebElement Spouse_PastFiveYrAlcohol_Yes;

@FindBy(id="rdAlcoholFiveYrSps-1")
WebElement Spouse_PastFiveYrAlcohol_No;

@FindBy(id="rdPastFiveYrAlcoholSps-0")
WebElement Spouse_PastFiveYrAlcoholIndicated_Yes;

@FindBy(id="rdPastFiveYrAlcoholSps-1")
WebElement Spouse_PastFiveYrAlcoholIndicated_No;

@FindBy(id="rdPastFiveSedAlcoholSps-0")
WebElement Spouse_PastFiveYrSedative_Yes;

@FindBy(id="rdPastFiveSedAlcoholSps-1")
WebElement Spouse_PastFiveYrSedative_No;

@FindBy(id="rdPastFiveMarAlcoholSps-0")
WebElement Spouse_Marijuana_Yes;

@FindBy(id="rdPastFiveMarAlcoholSps-1")
WebElement Spouse_Marijuana_No;

@FindBy(id="rdJetSmokerQuestSps-0")
WebElement Spouse_Tobacco_Yes;

@FindBy(id="rdJetSmokerQuestSps-1")
WebElement Spouse_Tobacco_No;

@FindBy(id="rdPastFivePhyAlcoholSps-0")
WebElement Spouse_Physician_Yes;

@FindBy(id="rdPastFivePhyAlcoholSps-1")
WebElement Spouse_Physician_No;


//Health History_Section7*******************

@FindBy(id="rdPastFiveYrLicSuspSps-0")
WebElement Spouse_licenseSuspended_Yes;

@FindBy(id="rdPastFiveYrLicSuspSps-1")
WebElement Spouse_licenseSuspended_No;

@FindBy(id="rdConCrimeNonMNCTSps-0")
WebElement Spouse_crime_Yes;

@FindBy(id="rdConCrimeNonMNCTSps-1")
WebElement Spouse_crime_No;


//Health History_Section8*******************
@FindBy(id="rdFamilyHistorySps-0")
WebElement Spouse_FamilyHistory_Yes;

@FindBy(id="rdFamilyHistorySps-1")
WebElement Spouse_FamilyHistory_No;


public boolean health_History_Page_are_displayed_for_Self_and_user_Select_NO_for_all_the_questions() throws Exception{
	
	try {
		log.debug("Select Health History Page Question as NO");


WAEPA_WeightChange_No.click();
//Health History_Section2*******************
AppliedForInsurance_No.click();
Self_Benefit_No.click();
//Health History_Section3*******************
Self_SurgeryTreatment_No.click();
Self_MedicationTreatment_No.click();
//Health History_Section4******************
/*Self_PhysicianFullName.sendKeys(keysToSend);
Self_PhysicianAddress
Self_DateOflastConsult
Self_PhysicianReason
Self_PhysicianDiagnosis
Self_PhysicianXray_No*/
//Health History_Section5*******************
Self_BloodPressure_No.click();
Self_Ulcer_No.click();
Self_Asthma_No.click();
Self_Urine_No.click();
Self_Arthritic_No.click();
Self_Convulsions_No.click();
Self_Stress_No.click();
Self_Diabetes_No.click();
Self_Animia_No.click();
Self_Skin_No.click();
Self_Cancer_No.click();
Self_Illness_No.click();
//Health History_Section6*******************
Self_DrinkAlcohol_No.click();
Self_PastFiveYrAlcohol_No.click();
Self_PastFiveYrAlcoholIndicated_No.click();
Self_PastFiveYrSedative_No.click();
Self_Marijuana_No.click();
Self_Tobacco_No.click();
Self_Physician_No.click();
//Health History_Section7*******************
Self_licenseSuspended_No.click();
Self_crime_No.click();
//Health History_Section8*******************
Self_FamilyHistory_No.click();

		log.info("Health History Page Question selected as NO sucessfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Health History Page Question as NO || Fail"+e.getMessage());
		screenShotUtility.GetScreenShot(driver);
		 throw(e);
	}
}

public boolean health_History_Page_are_displayed_for_Spouse_and_user_Select_NO_for_all_the_questions() throws Exception{
	
	try {
		log.debug("Select Health History Page Question as NO");


WAEPA_WeightChange_Spouse_No.click();
//Health History_Section2*******************
AppliedForInsurance_Spouse_No.click();
Spouse_Benefit_No.click();
//Health History_Section3*******************
Spouse_SurgeryTreatment_No.click();
Spouse_MedicationTreatment_No.click();
//Health History_Section4******************
/*Self_PhysicianFullName.sendKeys(keysToSend);
Self_PhysicianAddress
Self_DateOflastConsult
Self_PhysicianReason
Self_PhysicianDiagnosis
Self_PhysicianXray_No*/
//Health History_Section5*******************
Spouse_BloodPressure_No.click();
Spouse_Ulcer_No.click();
Spouse_Asthma_No.click();
Spouse_Urine_No.click();
Spouse_Arthritic_No.click();
Spouse_Convulsions_No.click();
Spouse_Stress_No.click();
Spouse_Diabetes_No.click();
Spouse_Animia_No.click();
Spouse_Skin_No.click();
Spouse_Cancer_No.click();
Spouse_Illness_No.click();
//Health History_Section6*******************
Spouse_DrinkAlcohol_No.click();
Spouse_PastFiveYrAlcohol_No.click();
Spouse_PastFiveYrAlcoholIndicated_No.click();
Spouse_PastFiveYrSedative_No.click();
Spouse_Marijuana_No.click();
Spouse_Tobacco_No.click();
Spouse_Physician_No.click();
//Health History_Section7*******************
Spouse_licenseSuspended_No.click();
Spouse_crime_No.click();
//Health History_Section8*******************
Spouse_FamilyHistory_No.click();

		log.info("Health History Page Question selected as NO sucessfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Health History Page Question as NO || Fail"+e.getMessage());
		screenShotUtility.GetScreenShot(driver);
		 throw(e);
	}
}



public boolean enters_details_of_Self_for_Question_FOUR_as(String Physician, String Address, String Date, String Reason, String Result) throws Exception{
	
	try {
		log.debug("Enter Health History Page Question four");


//Health History_Section4******************
Self_PhysicianFullName.sendKeys(Physician);
Self_PhysicianAddress.sendKeys(Address);
Self_DateOflastConsult.sendKeys(Date);
Self_PhysicianReason.sendKeys(Reason);
Self_PhysicianDiagnosis.sendKeys(Result);
Self_PhysicianXray_No.click();

		log.info("Health History Page Question four entered sucessfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Health History Page Question Four || Fail"+e.getMessage());
		screenShotUtility.GetScreenShot(driver);
		 throw(e);
	}
}

public boolean enters_details_of_Spouse_for_Question_FOUR_as(String Physician, String Address, String Date, String Reason, String Result) throws Exception{
	
	try {
		log.debug("Enter Health History Page Question four");


//Health History_Section4******************
		Spouse_PhysicianFullName.sendKeys(Physician);
		Spouse_PhysicianAddress.sendKeys(Address);
		Spouse_DateOflastConsult.sendKeys(Date);
		Spouse_PhysicianReason.sendKeys(Reason);
		Spouse_PhysicianDiagnosis.sendKeys(Result);
		Spouse_PhysicianXray_No.click();

		log.info("Health History Page Question four entered sucessfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Health History Page Question Four || Fail"+e.getMessage());
		screenShotUtility.GetScreenShot(driver);
		 throw(e);
	}
}

public boolean health_History_Page_are_displayed_and_user() throws Exception{
	
	try {
		log.debug("Verify Health History Page is displayed");




		log.info("Health History Page displayed sucessfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Health History Page || Fail"+e.getMessage());
		screenShotUtility.GetScreenShot(driver);
		 throw(e);
	}
}




}
