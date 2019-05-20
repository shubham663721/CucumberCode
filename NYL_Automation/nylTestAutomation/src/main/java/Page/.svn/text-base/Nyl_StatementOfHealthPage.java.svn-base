package Page;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import Selenium.ScreenShotUtility;
import Selenium.SetUp;
//import Utility.Excel_Utility;
import Utility.ReuseableMethod;
public class Nyl_StatementOfHealthPage extends SetUp {
	
  public WebDriver driver = null;
  private final Logger log =LogManager.getLogger(Nyl_StatementOfHealthPage.class.getName());

	public Nyl_StatementOfHealthPage() {
		driver = getDriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}
	
	ReuseableMethod reuseMethod = new ReuseableMethod();
	ScreenShotUtility screenShotUtility = new ScreenShotUtility();
	
	//label[contains(text(),'Health History')]
	@FindBy(xpath="//label[contains(text(),'Health History')]")
	WebElement Label_HealthHistory;
	
	@FindBy(id="case_life_CriminalHistory_ConfinedToHospitalPrison_2_option_0_icon")
	WebElement Question1No;
	
	@FindBy(id="case_life_CriminalHistory_ConfinedToHospitalPrison_2_option_1_icon")
	WebElement Question1Yes;
	
	@FindBy(id="case_life_PreviousAdverseDecision_PreviousAdverseDecision_3_option_0_icon")
	WebElement Question2No;
	
	@FindBy(id="case_life_PreviousAdverseDecision_PreviousAdverseDecision_3_option_1_icon")
	WebElement Question2Yes;
	
	@FindBy(id="case_life_MedicalGeneral_undiagnosedMedical_4_option_0_icon")
	WebElement Question3No;
	
	@FindBy(id="case_life_MedicalGeneral_undiagnosedMedical_4_option_1_icon")
	WebElement Question3Yes;
	
	@FindBy(id="case_life_CriminalHistory_HasCriminalHistory_5_option_0_icon")
	WebElement Question4No;
	
	@FindBy(id="case_life_CriminalHistory_HasCriminalHistory_5_option_1_icon")
	WebElement Question4Yes;
	
	@FindBy(id="case_life_MedicalGeneral_AidsDiagnosis_6_option_0_icon")
	WebElement Question5No;
	
	@FindBy(id="case_life_MedicalGeneral_AidsDiagnosis_6_option_1_icon")
	WebElement Question5Yes;
	
	@FindBy(id="case_life_MedicalGeneral_AppFormImp1_3_option_0_icon")
	WebElement Question6No;  
	
	
	@FindBy(id="case_life_MedicalGeneral_AppFormImp1_3_option_1_icon")
	WebElement Question6Yes;
	
	@FindBy(id="case_life_MedicalGeneral_AppFormImp2_7_option_0_icon")
	WebElement Question7No; 
	
	@FindBy(id="case_life_MedicalGeneral_AppFormImp2_7_option_1_icon")
	WebElement Question7Yes;
	
	@FindBy(id="case_life_MedicalGeneral_AppFormImp3_11_option_0_icon")
	WebElement Question8No;
	
	@FindBy(id="case_life_MedicalGeneral_AppFormImp3_11_option_1_icon")
	WebElement Question8Yes;
	
	@FindBy(id="case_life_MedicalGeneral_AppFormImp4_18_option_0_icon")
	WebElement Question9No;
	
	@FindBy(id="case_life_MedicalGeneral_AppFormImp4_18_option_1_icon")
	WebElement Question9Yes;
	
	@FindBy(id="case_life_MedicalGeneral_AppFormImp5_22_option_0_icon")
	WebElement Question10No;
	
	@FindBy(id="case_life_MedicalGeneral_AppFormImp5_22_option_1_icon")
	WebElement Question10Yes;
	
	@FindBy(id="case_life_MedicalGeneral_AppFormImp6_26_option_0_icon")
	WebElement Question11No;
	
	@FindBy(id="case_life_MedicalGeneral_AppFormImp6_26_option_1_icon")
	WebElement Question11Yes;
	
	@FindBy(id="case_life_MedicalGeneral_AppFormImp7_30_option_0_icon")
	WebElement Question12No;
	
	@FindBy(id="case_life_MedicalGeneral_AppFormImp7_30_option_1_icon")
	WebElement Question12Yes;
	
	@FindBy(id="case_life_MedicalGeneral_AppFormImp8_34_option_0_icon")
	WebElement Question13No;
	
	@FindBy(id="case_life_MedicalGeneral_AppFormImp8_34_option_1_icon")
	WebElement Question13Yes;
	
	@FindBy(id="case_life_Avocations_AnyHazardousAvocations_42_option_0_icon")
	WebElement Question14No;
	
	@FindBy(id="case_life_Avocations_AnyHazardousAvocations_42_option_1_icon")
	WebElement Question14Yes;
	
	@FindBy(id="case_life_FamilyHistories_HasFamilyHistory_49_option_0_icon")
	WebElement Question15No;
	
	@FindBy(id="case_life_FamilyHistories_HasFamilyHistory_49_option_1_icon")
	WebElement Question15Yes;
	
	//WAEPA Health History Question page for Self	
	
	//Question1************************************************
	@FindBy(id="rdWeightChangeSlf-0")
	WebElement waepaQ1aYes;
	
	@FindBy(id="rdWeightChangeSlf-1")
	WebElement waepaQ1aNo;
	
	@FindBy(id="txtWeightChangeAmtSlf")
	WebElement waepaQ1aAmount;
	
	@FindBy(id="txtWeightChangeReasonSlf")
	WebElement waepaQ1aReason;
	
	//Question2**************************************************
	
	@FindBy(id="rdInsuranceDeclineSlf-0")
	WebElement waepaQ2aYes;
	
	@FindBy(id="rdInsuranceDeclineSlf-1")
	WebElement waepaQ2aNo;
	
	@FindBy(id="txtInsuranceDeclineSlf")
	WebElement waepaQ2aDetails;
	
	@FindBy(id="rdInsuranceBenSlf-0")
	WebElement waepaQ2bYes;
	
	@FindBy(id="rdInsuranceBenSlf-1")
	WebElement waepaQ2bNo;
	
	@FindBy(id="txtInsuranceBenSlf")
	WebElement waepaQ2bDetails;
	
	//Question3*****************************************************************
	
	@FindBy(id="rdMedSurgTreatSlf-0")
	WebElement waepaQ3aYes;
	
	@FindBy(id="rdMedSurgTreatSlf-1")
	WebElement waepaQ3aNo;

	@FindBy(xpath="//table[@id='MedSurgTreatDetailsTableSlf']//input[@data-key-editor='surgDate']")
	WebElement waepaQ3aDate;
	
	@FindBy(xpath="//table[@id='MedSurgTreatDetailsTableSlf']//input[@data-key-editor='surgTreatment']")
	WebElement waepaQ3aTreatment;
	
	@FindBy(xpath="//table[@id='MedSurgTreatDetailsTableSlf']//input[@data-key-editor='nameAddPhyHosp']")
	WebElement waepaQ3aNameAddress;
	
	@FindBy(id="rdTreatMedSlf-0")
	WebElement waepaQ3bYes;
	
	@FindBy(id="rdTreatMedSlf-1")
	WebElement waepaQ3bNo;
	
	@FindBy(xpath="//table[@id='TreatMedDetailsTableSlf']//input[@data-key-editor='medication']")
	WebElement waepaQ3bMedication;
	
	@FindBy(xpath="//table[@id='TreatMedDetailsTableSlf']//input[@data-key-editor='dosage']")
	WebElement waepaQ3bDosage;
	
	@FindBy(xpath="//table[@id='TreatMedDetailsTableSlf']//input[@data-key-editor='frequency']")
	WebElement waepaQ3bFrequency;
	
	@FindBy(xpath="//table[@id='TreatMedDetailsTableSlf']//input[@data-key-editor='nameAddPhyHosp']")
	//table[@id='TreatMedDetailsTableSlf']//input[@data-key-editor='nameAddPhyHosp']
	WebElement waepaQ3bNameAddress;
	
	@FindBy(id="rdPregnantSlf-0")
	WebElement waepaQ3cYes;
	
	@FindBy(id="rdPregnantSlf-1")
	WebElement waepaQ3cNo;
	
	@FindBy(id="rdPregnancyCompSlf-0")
	WebElement waepaQ3dYes;
	
	@FindBy(id="rdPregnancyCompSlf-1")
	WebElement waepaQ3dNo;
	
	//Question4*************************************************************
	@FindBy(id="txtPhyFullNameSlf")
	WebElement waepaPhyName;
	
	@FindBy(id="txtPhyFullNameSps")
	WebElement waepaPhyNameSpouse;
	
	@FindBy(id="txtPhyFullAddSlf")
	WebElement waepaPhyAddress;
	
	@FindBy(id="txtPhyFullAddSps")
	WebElement waepaPhyAddressSpouse;
	
	@FindBy(id="dtOfConsultSlf")
	WebElement waepaDate;
	
	@FindBy(id="dtOfConsultSps")
	WebElement waepaDateSpouse;
	
	@FindBy(id="txtPhyReasonSlf")
	WebElement waepaReason;
	
	@FindBy(id="txtPhyReasonSps")
	WebElement waepaReasonSpouse;
	
	@FindBy(id="txtPhyDiagTreatSlf")
	WebElement waepaPhyDiagTreatSlf;
	
	@FindBy(id="txtPhyDiagTreatSps")
	WebElement waepaPhyDiagTreatSpouse;
	
	@FindBy(id="rdXRaySlf-0")
	WebElement waepaQ4dYes;
	
	@FindBy(id="rdXRaySlf-1")
	WebElement waepaQ4dNo;
	
	@FindBy(id="txtXRaySlf")
	WebElement waepaQ4dEKG;
	
	//Question5***********************************************************

	@FindBy(id="rdBloodPressureSlf-0")
	WebElement waepaQ5aYes;
	
	@FindBy(id="rdBloodPressureSlf-1")
	WebElement waepaQ5aNo;
	
	@FindBy(xpath="//table[@id='BloodPressureDetailsTableSlf']//input[@data-key-editor='dateOfOnset']")
	//table[@id='JaundiceDetailsTableSlf']//input[@data-key-editor='dateOfOnset']
	WebElement waepaQ5aDateOfOnset;
	
	@FindBy(xpath="//table[@id='BloodPressureDetailsTableSlf']//input[@data-key-editor='illnessOrInjury']")
	WebElement waepaQ5aIllnessOrInjury;
	
	@FindBy(xpath="//table[@id='BloodPressureDetailsTableSlf']//input[@data-key-editor='symptoms']")
	WebElement waepaQ5aSymptoms;
	
	@FindBy(xpath="//table[@id='BloodPressureDetailsTableSlf']//input[@data-key-editor='dateOfTreatment']")
	WebElement waepaQ5aDateOfTreatment;
	
	@FindBy(xpath="//table[@id='BloodPressureDetailsTableSlf']//input[@data-key-editor='numberOfAttacks']")
	WebElement waepaQ5aNumberOfAttacks;
	
	@FindBy(xpath="//table[@id='BloodPressureDetailsTableSlf']//input[@data-key-editor='treatmentResult']")
	WebElement waepaQ5aTreatmentResult;
	
	@FindBy(xpath="//table[@id='BloodPressureDetailsTableSlf']//input[@data-key-editor='nameAddPhyHosp']")
	WebElement waepaQ5aNameAddress;

	@FindBy(id="rdJaundiceSlf-0")
	WebElement waepaQ5bYes;
	
	@FindBy(id="rdJaundiceSlf-1")
	WebElement waepaQ5bNo;
	
	@FindBy(xpath="//table[@id='JaundiceDetailsTableSlf']//input[@data-key-editor='dateOfOnset']")
	WebElement waepaQ5bDateOfOnset;
	
	@FindBy(xpath="//table[@id='JaundiceDetailsTableSlf']//input[@data-key-editor='illnessOrInjury']")
	WebElement waepaQ5bIllnessOrInjury;
	
	@FindBy(xpath="//table[@id='JaundiceDetailsTableSlf']//input[@data-key-editor='symptoms']")
	WebElement waepaQ5bSymptoms;
	
	@FindBy(xpath="//table[@id='JaundiceDetailsTableSlf']//input[@data-key-editor='dateOfTreatment']")
	WebElement waepaQ5bDateOfTreatment;
	
	@FindBy(xpath="//table[@id='JaundiceDetailsTableSlf']//input[@data-key-editor='numberOfAttacks']")
	WebElement waepaQ5bNumberOfAttacks;
	
	@FindBy(xpath="//table[@id='JaundiceDetailsTableSlf']//input[@data-key-editor='treatmentResult']")
	WebElement waepaQ5bTreatmentResult;
	
	@FindBy(xpath="//table[@id='JaundiceDetailsTableSlf']//input[@data-key-editor='nameAddPhyHosp']")
	WebElement waepaQ5bNameAddress;

	@FindBy(id="rdAsthmaSlf-0")
	WebElement waepaQ5cYes;
	
	@FindBy(id="rdAsthmaSlf-1")
	WebElement waepaQ5cNo;
	
	@FindBy(xpath="//table[@id='AsthmaDetailsTableSlf']//input[@data-key-editor='dateOfOnset']")
	WebElement waepaQ5cDateOfOnset;
	
	@FindBy(xpath="//table[@id='AsthmaDetailsTableSlf']//input[@data-key-editor='illnessOrInjury']")
	WebElement waepaQ5cIllnessOrInjury;
	
	@FindBy(xpath="//table[@id='AsthmaDetailsTableSlf']//input[@data-key-editor='symptoms']")
	WebElement waepaQ5cSymptoms;
	
	@FindBy(xpath="//table[@id='AsthmaDetailsTableSlf']//input[@data-key-editor='dateOfTreatment']")
	WebElement waepaQ5cDateOfTreatment;
	
	@FindBy(xpath="//table[@id='AsthmaDetailsTableSlf']//input[@data-key-editor='numberOfAttacks']")
	WebElement waepaQ5cNumberOfAttacks;
	
	@FindBy(xpath="//table[@id='AsthmaDetailsTableSlf']//input[@data-key-editor='treatmentResult']")
	WebElement waepaQ5cTreatmentResult;
	
	@FindBy(xpath="//table[@id='AsthmaDetailsTableSlf']//input[@data-key-editor='nameAddPhyHosp']")
	WebElement waepaQ5cNameAddress;

	@FindBy(id="rdKidneySlf-0")
	WebElement waepaQ5dYes;
	
	@FindBy(id="rdKidneySlf-1")
	WebElement waepaQ5dNo;
	
	@FindBy(xpath="//table[@id='KidneyDetailsTableSlf']//input[@data-key-editor='dateOfOnset']")
	WebElement waepaQ5dDateOfOnset;
	
	@FindBy(xpath="//table[@id='KidneyDetailsTableSlf']//input[@data-key-editor='illnessOrInjury']")
	WebElement waepaQ5dIllnessOrInjury;
	
	@FindBy(xpath="//table[@id='KidneyDetailsTableSlf']//input[@data-key-editor='symptoms']")
	WebElement waepaQ5dSymptoms;
	
	@FindBy(xpath="//table[@id='KidneyDetailsTableSlf']//input[@data-key-editor='dateOfTreatment']")
	WebElement waepaQ5dDateOfTreatment;
	
	@FindBy(xpath="//table[@id='KidneyDetailsTableSlf']//input[@data-key-editor='numberOfAttacks']")
	WebElement waepaQ5dNumberOfAttacks;
	
	@FindBy(xpath="//table[@id='KidneyDetailsTableSlf']//input[@data-key-editor='treatmentResult']")
	WebElement waepaQ5dTreatmentResult;
	
	@FindBy(xpath="//table[@id='KidneyDetailsTableSlf']//input[@data-key-editor='nameAddPhyHosp']")
	WebElement waepaQ5dNameAddress;

	@FindBy(id="rdArthriticSlf-0")
	WebElement waepaQ5eYes;
	
	@FindBy(id="rdArthriticSlf-1")
	WebElement waepaQ5eNo;
	
	@FindBy(xpath="//table[@id='ArthriticDetailsTableSlf']//input[@data-key-editor='dateOfOnset']")
	WebElement waepaQ5eDateOfOnset;
	
	@FindBy(xpath="//table[@id='ArthriticDetailsTableSlf']//input[@data-key-editor='illnessOrInjury']")
	WebElement waepaQ5eIllnessOrInjury;
	
	@FindBy(xpath="//table[@id='ArthriticDetailsTableSlf']//input[@data-key-editor='symptoms']")
	WebElement waepaQ5eSymptoms;
	
	@FindBy(xpath="//table[@id='ArthriticDetailsTableSlf']//input[@data-key-editor='dateOfTreatment']")
	WebElement waepaQ5eDateOfTreatment;
	
	@FindBy(xpath="//table[@id='ArthriticDetailsTableSlf']//input[@data-key-editor='numberOfAttacks']")
	WebElement waepaQ5eNumberOfAttacks;
	
	@FindBy(xpath="//table[@id='ArthriticDetailsTableSlf']//input[@data-key-editor='treatmentResult']")
	WebElement waepaQ5eTreatmentResult;
	
	@FindBy(xpath="//table[@id='ArthriticDetailsTableSlf']//input[@data-key-editor='nameAddPhyHosp']")
	WebElement waepaQ5eNameAddress;

	@FindBy(id="rdParalysisSlf-0")
	WebElement waepaQ5fYes;
	
	@FindBy(id="rdParalysisSlf-1")
	WebElement waepaQ5fNo;
	
	@FindBy(xpath="//table[@id='ParalysisDetailsTableSlf']//input[@data-key-editor='dateOfOnset']")
	WebElement waepaQ5fDateOfOnset;
	
	@FindBy(xpath="//table[@id='ParalysisDetailsTableSlf']//input[@data-key-editor='illnessOrInjury']")
	WebElement waepaQ5fIllnessOrInjury;
	
	@FindBy(xpath="//table[@id='ParalysisDetailsTableSlf']//input[@data-key-editor='symptoms']")
	WebElement waepaQ5fSymptoms;
	
	@FindBy(xpath="//table[@id='ParalysisDetailsTableSlf']//input[@data-key-editor='dateOfTreatment']")
	WebElement waepaQ5fDateOfTreatment;
	
	@FindBy(xpath="//table[@id='ParalysisDetailsTableSlf']//input[@data-key-editor='numberOfAttacks']")
	WebElement waepaQ5fNumberOfAttacks;
	
	@FindBy(xpath="//table[@id='ParalysisDetailsTableSlf']//input[@data-key-editor='treatmentResult']")
	WebElement waepaQ5fTreatmentResult;
	
	@FindBy(xpath="//table[@id='ParalysisDetailsTableSlf']//input[@data-key-editor='nameAddPhyHosp']")
	WebElement waepaQ5fNameAddress;
	
	@FindBy(id="rdStressSlf-0")
	WebElement waepaQ5gYes;
	
	@FindBy(id="rdStressSlf-1")
	WebElement waepaQ5gNo;
	
	@FindBy(xpath="//table[@id='StressDetailsTableSlf']//input[@data-key-editor='dateOfOnset']")
	WebElement waepaQ5gDateOfOnset;
	
	@FindBy(xpath="//table[@id='StressDetailsTableSlf']//input[@data-key-editor='illnessOrInjury']")
	WebElement waepaQ5gIllnessOrInjury;
	
	@FindBy(xpath="//table[@id='StressDetailsTableSlf']//input[@data-key-editor='symptoms']")
	WebElement waepaQ5gSymptoms;
	
	@FindBy(xpath="//table[@id='StressDetailsTableSlf']//input[@data-key-editor='dateOfTreatment']")
	WebElement waepaQ5gDateOfTreatment;
	
	@FindBy(xpath="//table[@id='StressDetailsTableSlf']//input[@data-key-editor='numberOfAttacks']")
	WebElement waepaQ5gNumberOfAttacks;
	
	@FindBy(xpath="//table[@id='StressDetailsTableSlf']//input[@data-key-editor='treatmentResult']")
	WebElement waepaQ5gTreatmentResult;
	
	@FindBy(xpath="//table[@id='StressDetailsTableSlf']//input[@data-key-editor='nameAddPhyHosp']")
	WebElement waepaQ5gNameAddress;
	
	@FindBy(id="rdDiabetesSlf-0")
	WebElement waepaQ5hYes;
	
	@FindBy(id="rdDiabetesSlf-1")
	WebElement waepaQ5hNo;
	
	@FindBy(xpath="//table[@id='DiabetesDetailsTableSlf']//input[@data-key-editor='dateOfOnset']")
	WebElement waepaQ5hDateOfOnset;
	
	@FindBy(xpath="//table[@id='DiabetesDetailsTableSlf']//input[@data-key-editor='illnessOrInjury']")
	WebElement waepaQ5hIllnessOrInjury;
	
	@FindBy(xpath="//table[@id='DiabetesDetailsTableSlf']//input[@data-key-editor='symptoms']")
	WebElement waepaQ5hSymptoms;
	
	@FindBy(xpath="//table[@id='DiabetesDetailsTableSlf']//input[@data-key-editor='dateOfTreatment']")
	WebElement waepaQ5hDateOfTreatment;
	
	@FindBy(xpath="//table[@id='DiabetesDetailsTableSlf']//input[@data-key-editor='numberOfAttacks']")
	WebElement waepaQ5hNumberOfAttacks;
	
	@FindBy(xpath="//table[@id='DiabetesDetailsTableSlf']//input[@data-key-editor='treatmentResult']")
	WebElement waepaQ5hTreatmentResult;
	
	@FindBy(xpath="//table[@id='DiabetesDetailsTableSlf']//input[@data-key-editor='nameAddPhyHosp']")
	WebElement waepaQ5hNameAddress;
	
	@FindBy(id="rdAnemiaSlf-0")
	WebElement waepaQ5iYes;
	
	@FindBy(id="rdAnemiaSlf-1")
	WebElement waepaQ5iNo;
	
	@FindBy(xpath="//table[@id='AnemiaDetailsTableSlf']//input[@data-key-editor='dateOfOnset']")
	WebElement waepaQ5iDateOfOnset;
	
	@FindBy(xpath="//table[@id='AnemiaDetailsTableSlf']//input[@data-key-editor='illnessOrInjury']")
	WebElement waepaQ5iIllnessOrInjury;
	
	@FindBy(xpath="//table[@id='AnemiaDetailsTableSlf']//input[@data-key-editor='symptoms']")
	WebElement waepaQ5iSymptoms;
	
	@FindBy(xpath="//table[@id='AnemiaDetailsTableSlf']//input[@data-key-editor='dateOfTreatment']")
	WebElement waepaQ5iDateOfTreatment;
	
	@FindBy(xpath="//table[@id='AnemiaDetailsTableSlf']//input[@data-key-editor='numberOfAttacks']")
	WebElement waepaQ5iNumberOfAttacks;
	
	@FindBy(xpath="//table[@id='AnemiaDetailsTableSlf']//input[@data-key-editor='treatmentResult']")
	WebElement waepaQ5iTreatmentResult;
	
	@FindBy(xpath="//table[@id='AnemiaDetailsTableSlf']//input[@data-key-editor='nameAddPhyHosp']")
	WebElement waepaQ5iNameAddress;
	
	@FindBy(id="rdThroatSlf-0")
	WebElement waepaQ5jYes;
	
	@FindBy(id="rdThroatSlf-1")
	WebElement waepaQ5jNo;
	
	@FindBy(xpath="//table[@id='ThroatDetailsTableSlf']//input[@data-key-editor='dateOfOnset']")
	WebElement waepaQ5jDateOfOnset;
	
	@FindBy(xpath="//table[@id='ThroatDetailsTableSlf']//input[@data-key-editor='illnessOrInjury']")
	WebElement waepaQ5jIllnessOrInjury;
	
	@FindBy(xpath="//table[@id='ThroatDetailsTableSlf']//input[@data-key-editor='symptoms']")
	WebElement waepaQ5jSymptoms;
	
	@FindBy(xpath="//table[@id='ThroatDetailsTableSlf']//input[@data-key-editor='dateOfTreatment']")
	WebElement waepaQ5jDateOfTreatment;
	
	@FindBy(xpath="//table[@id='ThroatDetailsTableSlf']//input[@data-key-editor='numberOfAttacks']")
	WebElement waepaQ5jNumberOfAttacks;
	
	@FindBy(xpath="//table[@id='ThroatDetailsTableSlf']//input[@data-key-editor='treatmentResult']")
	WebElement waepaQ5jTreatmentResult;
	
	@FindBy(xpath="//table[@id='ThroatDetailsTableSlf']//input[@data-key-editor='nameAddPhyHosp']")
	WebElement waepaQ5jNameAddress;
	
	@FindBy(id="rdCancerSlf-0")
	WebElement waepaQ5kYes;
	
	@FindBy(id="rdCancerSlf-1")
	WebElement waepaQ5kNo;
	
	@FindBy(xpath="//table[@id='CancerDetailsTableSlf']//input[@data-key-editor='dateOfOnset']")
	WebElement waepaQ5kDateOfOnset;
	
	@FindBy(xpath="//table[@id='CancerDetailsTableSlf']//input[@data-key-editor='illnessOrInjury']")
	WebElement waepaQ5kIllnessOrInjury;
	
	@FindBy(xpath="//table[@id='CancerDetailsTableSlf']//input[@data-key-editor='symptoms']")
	WebElement waepaQ5kSymptoms;
	
	@FindBy(xpath="//table[@id='CancerDetailsTableSlf']//input[@data-key-editor='dateOfTreatment']")
	WebElement waepaQ5kDateOfTreatment;
	
	@FindBy(xpath="//table[@id='CancerDetailsTableSlf']//input[@data-key-editor='numberOfAttacks']")
	WebElement waepaQ5kNumberOfAttacks;
	
	@FindBy(xpath="//table[@id='CancerDetailsTableSlf']//input[@data-key-editor='treatmentResult']")
	WebElement waepaQ5kTreatmentResult;
	
	@FindBy(xpath="//table[@id='CancerDetailsTableSlf']//input[@data-key-editor='nameAddPhyHosp']")
	WebElement waepaQ5kNameAddress;
	
	@FindBy(id="rdIllnessSlf-0")
	WebElement waepaQ5lYes;
	
	@FindBy(id="rdIllnessSlf-1")
	WebElement waepaQ5lNo;
	
	@FindBy(xpath="//table[@id='IllnessDetailsTableSlf']//input[@data-key-editor='dateOfOnset']")
	WebElement waepaQ5lDateOfOnset;
	
	@FindBy(xpath="//table[@id='IllnessDetailsTableSlf']//input[@data-key-editor='illnessOrInjury']")
	WebElement waepaQ5lIllnessOrInjury;
	
	@FindBy(xpath="//table[@id='IllnessDetailsTableSlf']//input[@data-key-editor='symptoms']")
	WebElement waepaQ5lSymptoms;
	
	@FindBy(xpath="//table[@id='IllnessDetailsTableSlf']//input[@data-key-editor='dateOfTreatment']")
	WebElement waepaQ5lDateOfTreatment;
	
	@FindBy(xpath="//table[@id='IllnessDetailsTableSlf']//input[@data-key-editor='numberOfAttacks']")
	WebElement waepaQ5lNumberOfAttacks;
	
	@FindBy(xpath="//table[@id='IllnessDetailsTableSlf']//input[@data-key-editor='treatmentResult']")
	WebElement waepaQ5lTreatmentResult;
	
	@FindBy(xpath="//table[@id='IllnessDetailsTableSlf']//input[@data-key-editor='nameAddPhyHosp']")
	WebElement waepaQ5lNameAddress;
	
	//Question6************************************************************************
	
	@FindBy(id="rdAlcoholSlf-0")
	WebElement waepaQ6aYes;
	
	@FindBy(id="rdAlcoholSlf-1")
	WebElement waepaQ6aNo;
	
	@FindBy(id="selAlcoholAmtSlf")
	WebElement waepaQ6aFrequency;
	
	@FindBy(id="txtWineSlf")
	WebElement waepaQ6aWine;
	
	@FindBy(id="txtBeerSlf")
	WebElement waepaQ6aBeer;
	
	@FindBy(id="txtLiquorSlf")
	WebElement waepaQ6aLiquor;
	
	@FindBy(id="rdAlcoholFiveYrSlf-0")
	WebElement waepaQ6a1Yes;
	
	@FindBy(id="rdAlcoholFiveYrSlf-1")
	WebElement waepaQ6a1No;
		
	
	@FindBy(id="rdPastFiveYrAlcoholSlf-0")
	WebElement waepaQ6bYes;
	
	@FindBy(id="rdPastFiveYrAlcoholSlf-1")
	WebElement waepaQ6bNo;
	
	@FindBy(xpath="//table[@id='PastFiveYrAlcoDetailsTableSlf']//input[@data-key-editor='pastAlcoholMonthYear']")
	WebElement waepaQ6bPastAlcoholMonthYear;
	
	@FindBy(xpath="//table[@id='PastFiveYrAlcoDetailsTableSlf']//input[@data-key-editor='pastAlcoholDetails']")
	WebElement waepaQ6bPastAlcoholDetails;
	
	
	@FindBy(id="rdPastFiveSedAlcoholSlf-0")
	WebElement waepaQ6cYes;
	
	@FindBy(id="rdPastFiveSedAlcoholSlf-1")
	WebElement waepaQ6cNo;
	
	@FindBy(xpath="//table[@id='PastFiveSedAlcoholTableSlf']//input[@data-key-editor='alcoholMonthYear']")
	WebElement waepaQ6cPastAlcoholMonthYear;
	
	@FindBy(xpath="//table[@id='PastFiveSedAlcoholTableSlf']//input[@data-key-editor='alcoholFreq']")
	WebElement waepaQ6cAlcoholFrequency;
	
	@FindBy(xpath="//table[@id='PastFiveSedAlcoholTableSlf']//input[@data-key-editor='alcoholDrugs']")
	WebElement waepaQ6cAlcoholDrugs;
	
	@FindBy(xpath="//table[@id='PastFiveSedAlcoholTableSlf']//input[@data-key-editor='alcoholDetails']")
	WebElement waepaQ6cAlcoholDetails;
	
	@FindBy(id="rdPastFiveMarAlcoholSlf-0")
	WebElement waepaQ6dYes;
	
	@FindBy(id="rdPastFiveMarAlcoholSlf-1")
	WebElement waepaQ6dNo;
	
	@FindBy(xpath="//table[@id='PastFiveMarAlcoholDetailsTableSlf']//input[@data-key-editor='alcoholMonthYear']")
	WebElement waepaQ6dPastAlcoholMonthYear;
	
	@FindBy(xpath="//table[@id='PastFiveMarAlcoholDetailsTableSlf']//input[@data-key-editor='alcoholFreq']")
	WebElement waepaQ6dAlcoholFrequency;
	
	@FindBy(xpath="//table[@id='PastFiveMarAlcoholDetailsTableSlf']//input[@data-key-editor='alcoholDrugs']")
	WebElement waepaQ6dAlcoholDrugs;
	
	@FindBy(xpath="//table[@id='PastFiveMarAlcoholDetailsTableSlf']//input[@data-key-editor='alcoholDetails']")
	WebElement waepaQ6dAlcoholDetails;
	
	@FindBy(id="rdJetSmokerQuestSlf-0")
	WebElement waepaQ6eYes;
	
	@FindBy(id="rdJetSmokerQuestSlf-1")
	WebElement waepaQ6eNo;
	
	@FindBy(id="dtJetSmokerLastUsedSlf")
	WebElement waepaQ6eSmokerLastUsed;
	
	@FindBy(xpath="//input[@id='selJetSmokerPickListSlf-selectized']")
	WebElement waepaQ6eSmokerPickListSlf;
	
	@FindBy(id="rdPastFivePhyAlcoholSlf-0")
	WebElement waepaQ6fYes;
	
	@FindBy(id="rdPastFivePhyAlcoholSlf-1")
	WebElement waepaQ6fNo;
	
	@FindBy(id="dtPastFivePhyAlcoholSlf")
	WebElement waepaQ6fAlcoholDate;
	
	@FindBy(id="txtPastFivePhyAlcoholSlf")
	WebElement waepaQ6fDetails;
	
	@FindBy(id="txtPastFivePhyAlcoNameAddrSlf")
	WebElement waepaQ6fNameAddress;
	
	//Question7***********************************************************************
	@FindBy(id="rdPastFiveYrLicSuspSlf-0")
	WebElement waepaQ7aYes;
	
	@FindBy(id="rdPastFiveYrLicSuspSlf-1")
	WebElement waepaQ7aNo;
	
	@FindBy(id="txtSuspDetailsSlf")
	WebElement waepaQ7aDetails;
	
	@FindBy(id="rdConCrimeNonMNCTSlf-0")
	WebElement waepaQ7bYes;
	
	@FindBy(id="rdConCrimeMNCTSlf-1")
	WebElement waepaQ7bNo;
	
	@FindBy(xpath="//table[@id='CrimeDetailsTableSlf']//input[@data-key-editor='crimeDate']")
	WebElement waepaQ7bCrimeDate;
	
	@FindBy(xpath="//table[@id='CrimeDetailsTableSlf']//input[@data-key-editor='crimeDetails']")
	WebElement waepaQ7bCrimeDetails;
	
	//Question8*******************************************************************
	
	@FindBy(id="rdFamilyHistorySlf-0")
	WebElement waepaQ8aYes;
	
	@FindBy(id="rdFamilyHistorySlf-1")
	WebElement waepaQ8aNo;
	
	@FindBy(xpath="//table[@id='familyhisdettableslf']//select[@data-key-editor='familyMember']")
	WebElement waepaQ8aFamilyMember;
	
	@FindBy(xpath="//table[@id='familyhisdettableslf']//input[@data-key-editor='ageOfOnset']")
	WebElement waepaQ8aAgeOfOnset;
	
	@FindBy(xpath="//table[@id='familyhisdettableslf']//select[@data-key-editor='lifeStatus']")
	WebElement waepaQ8alifeStatus;
	
	@FindBy(xpath="//table[@id='familyhisdettableslf']//textarea[@data-key-editor='medicalCondition']")
	WebElement waepaQ8aMedicalCondition;
	
	//Question End for Self*********************************************************************
	
	
	//WAEPA Health History Question page for Spouse	
	
		//Question1************************************************
		@FindBy(id="rdWeightChangeSps-0")
		WebElement waepaQ1aYes_Spouse;
		
		@FindBy(id="rdWeightChangeSps-1")
		WebElement waepaQ1aNo_Spouse;
		
		@FindBy(id="txtWeightChangeAmtSps")
		WebElement waepaQ1aAmount_Spouse;
		
		@FindBy(id="txtWeightChangeReasonSps")
		WebElement waepaQ1aReason_Spouse;
		
		//Question2**************************************************
		
		@FindBy(id="rdInsuranceDeclineSps-0")
		WebElement waepaQ2aYes_Spouse;
		
		@FindBy(id="rdInsuranceDeclineSps-1")
		WebElement waepaQ2aNo_Spouse;
		
		@FindBy(id="txtInsuranceDeclineSps")
		WebElement waepaQ2aDetails_Spouse;
		
		@FindBy(id="rdInsuranceBenSps-0")
		WebElement waepaQ2bYes_Spouse;
		
		@FindBy(id="rdInsuranceBenSps-1")
		WebElement waepaQ2bNo_Spouse;
		
		@FindBy(id="txtInsuranceBenSps")
		WebElement waepaQ2bDetails_Spouse;
		
		//Question3*****************************************************************
		
		@FindBy(id="rdMedSurgTreatSps-0")
		WebElement waepaQ3aYes_Spouse;
		
		@FindBy(id="rdMedSurgTreatSps-1")
		WebElement waepaQ3aNo_Spouse;

		@FindBy(xpath="//table[@id='MedSurgTreatDetailsTableSps']//input[@data-key-editor='surgDate']")
		WebElement waepaQ3aDate_Spouse;
		
		@FindBy(xpath="//table[@id='MedSurgTreatDetailsTableSps']//input[@data-key-editor='surgTreatment']")
		WebElement waepaQ3aTreatment_Spouse;
		
		@FindBy(xpath="//table[@id='MedSurgTreatDetailsTableSps']//input[@data-key-editor='nameAddPhyHosp']")
		WebElement waepaQ3aNameAddress_Spouse;
		
		@FindBy(id="rdTreatMedSps-0")
		WebElement waepaQ3bYes_Spouse;
		
		@FindBy(id="rdTreatMedSps-1")
		WebElement waepaQ3bNo_Spouse;
		
		@FindBy(xpath="//table[@id='TreatMedDetailsTableSps']//input[@data-key-editor='medication']")
		WebElement waepaQ3bMedication_Spouse;
		
		@FindBy(xpath="//table[@id='TreatMedDetailsTableSps']//input[@data-key-editor='dosage']")
		WebElement waepaQ3bDosage_Spouse;
		
		@FindBy(xpath="//table[@id='TreatMedDetailsTableSps']//input[@data-key-editor='frequency']")
		WebElement waepaQ3bFrequency_Spouse;
		
		@FindBy(xpath="//table[@id='TreatMedDetailsTableSps']//input[@data-key-editor='nameAddPhyHosp']")
		//table[@id='TreatMedDetailsTableSps']//input[@data-key-editor='nameAddPhyHosp']
		WebElement waepaQ3bNameAddress_Spouse;
		
		@FindBy(id="rdPregnantSps-0")
		WebElement waepaQ3cYes_Spouse;
		
		@FindBy(id="rdPregnantSps-1")
		WebElement waepaQ3cNo_Spouse;
		
		@FindBy(id="dtExpectedDueDateSps")
		WebElement waepaQ3cExpectedDate_Spouse;		
		
		@FindBy(id="rdPregnancyCompSps-0")
		WebElement waepaQ3dYes_Spouse;
		
		@FindBy(id="rdPregnancyCompSps-1")
		WebElement waepaQ3dNo_Spouse;
		
		@FindBy(id="txtPregnancyCompSps")
		WebElement waepaQ3dDetails_Spouse;
		
		//Question4*************************************************************
		@FindBy(id="txtPhyFullNameSps")
		WebElement waepaPhyName_Spouse;
		
		
		@FindBy(id="txtPhyFullAddSps")
		WebElement waepaPhyAddress_Spouse;
		
		@FindBy(id="txtPhyFullAddSps")
		WebElement waepaPhyAddressSpouse_Spouse;
		
		@FindBy(id="dtOfConsultSps")
		WebElement waepaDate_Spouse;
		
		@FindBy(id="dtOfConsultSps")
		WebElement waepaDateSpouse_Spouse;
		
		@FindBy(id="txtPhyReasonSps")
		WebElement waepaReason_Spouse;
		
		@FindBy(id="txtPhyReasonSps")
		WebElement waepaReasonSpouse_Spouse;
		
		@FindBy(id="txtPhyDiagTreatSps")
		WebElement waepaPhyDiagTreatSps_Spouse;
		
		@FindBy(id="txtPhyDiagTreatSps")
		WebElement waepaPhyDiagTreatSpouse_Spouse;
		
		@FindBy(id="rdXRaySps-0")
		WebElement waepaQ4dYes_Spouse;
		
		@FindBy(id="rdXRaySps-1")
		WebElement waepaQ4dNo_Spouse;
		
		@FindBy(id="txtXRaySps")
		WebElement waepaQ4dEKG_Spouse;
		
		//Question5***********************************************************

		@FindBy(id="rdBloodPressureSps-0")
		WebElement waepaQ5aYes_Spouse;
		
		@FindBy(id="rdBloodPressureSps-1")
		WebElement waepaQ5aNo_Spouse;
		
		@FindBy(xpath="//table[@id='BloodPressureDetailsTableSps']//input[@data-key-editor='dateOfOnset']")
		//table[@id='JaundiceDetailsTableSps']//input[@data-key-editor='dateOfOnset']
		WebElement waepaQ5aDateOfOnset_Spouse;
		
		@FindBy(xpath="//table[@id='BloodPressureDetailsTableSps']//input[@data-key-editor='illnessOrInjury']")
		WebElement waepaQ5aIllnessOrInjury_Spouse;
		
		@FindBy(xpath="//table[@id='BloodPressureDetailsTableSps']//input[@data-key-editor='symptoms']")
		WebElement waepaQ5aSymptoms_Spouse;
		
		@FindBy(xpath="//table[@id='BloodPressureDetailsTableSps']//input[@data-key-editor='dateOfTreatment']")
		WebElement waepaQ5aDateOfTreatment_Spouse;
		
		@FindBy(xpath="//table[@id='BloodPressureDetailsTableSps']//input[@data-key-editor='numberOfAttacks']")
		WebElement waepaQ5aNumberOfAttacks_Spouse;
		
		@FindBy(xpath="//table[@id='BloodPressureDetailsTableSps']//input[@data-key-editor='treatmentResult']")
		WebElement waepaQ5aTreatmentResult_Spouse;
		
		@FindBy(xpath="//table[@id='BloodPressureDetailsTableSps']//input[@data-key-editor='nameAddPhyHosp']")
		WebElement waepaQ5aNameAddress_Spouse;

		@FindBy(id="rdJaundiceSps-0")
		WebElement waepaQ5bYes_Spouse;
		
		@FindBy(id="rdJaundiceSps-1")
		WebElement waepaQ5bNo_Spouse;
		
		@FindBy(xpath="//table[@id='JaundiceDetailsTableSps']//input[@data-key-editor='dateOfOnset']")
		WebElement waepaQ5bDateOfOnset_Spouse;
		
		@FindBy(xpath="//table[@id='JaundiceDetailsTableSps']//input[@data-key-editor='illnessOrInjury']")
		WebElement waepaQ5bIllnessOrInjury_Spouse;
		
		@FindBy(xpath="//table[@id='JaundiceDetailsTableSps']//input[@data-key-editor='symptoms']")
		WebElement waepaQ5bSymptoms_Spouse;
		
		@FindBy(xpath="//table[@id='JaundiceDetailsTableSps']//input[@data-key-editor='dateOfTreatment']")
		WebElement waepaQ5bDateOfTreatment_Spouse;
		
		@FindBy(xpath="//table[@id='JaundiceDetailsTableSps']//input[@data-key-editor='numberOfAttacks']")
		WebElement waepaQ5bNumberOfAttacks_Spouse;
		
		@FindBy(xpath="//table[@id='JaundiceDetailsTableSps']//input[@data-key-editor='treatmentResult']")
		WebElement waepaQ5bTreatmentResult_Spouse;
		
		@FindBy(xpath="//table[@id='JaundiceDetailsTableSps']//input[@data-key-editor='nameAddPhyHosp']")
		WebElement waepaQ5bNameAddress_Spouse;

		@FindBy(id="rdAsthmaSps-0")
		WebElement waepaQ5cYes_Spouse;
		
		@FindBy(id="rdAsthmaSps-1")
		WebElement waepaQ5cNo_Spouse;
		
		@FindBy(xpath="//table[@id='AsthmaDetailsTableSps']//input[@data-key-editor='dateOfOnset']")
		WebElement waepaQ5cDateOfOnset_Spouse;
		
		@FindBy(xpath="//table[@id='AsthmaDetailsTableSps']//input[@data-key-editor='illnessOrInjury']")
		WebElement waepaQ5cIllnessOrInjury_Spouse;
		
		@FindBy(xpath="//table[@id='AsthmaDetailsTableSps']//input[@data-key-editor='symptoms']")
		WebElement waepaQ5cSymptoms_Spouse;
		
		@FindBy(xpath="//table[@id='AsthmaDetailsTableSps']//input[@data-key-editor='dateOfTreatment']")
		WebElement waepaQ5cDateOfTreatment_Spouse;
		
		@FindBy(xpath="//table[@id='AsthmaDetailsTableSps']//input[@data-key-editor='numberOfAttacks']")
		WebElement waepaQ5cNumberOfAttacks_Spouse;
		
		@FindBy(xpath="//table[@id='AsthmaDetailsTableSps']//input[@data-key-editor='treatmentResult']")
		WebElement waepaQ5cTreatmentResult_Spouse;
		
		@FindBy(xpath="//table[@id='AsthmaDetailsTableSps']//input[@data-key-editor='nameAddPhyHosp']")
		WebElement waepaQ5cNameAddress_Spouse;

		@FindBy(id="rdKidneySps-0")
		WebElement waepaQ5dYes_Spouse;
		
		@FindBy(id="rdKidneySps-1")
		WebElement waepaQ5dNo_Spouse;
		
		@FindBy(xpath="//table[@id='KidneyDetailsTableSps']//input[@data-key-editor='dateOfOnset']")
		WebElement waepaQ5dDateOfOnset_Spouse;
		
		@FindBy(xpath="//table[@id='KidneyDetailsTableSps']//input[@data-key-editor='illnessOrInjury']")
		WebElement waepaQ5dIllnessOrInjury_Spouse;
		
		@FindBy(xpath="//table[@id='KidneyDetailsTableSps']//input[@data-key-editor='symptoms']")
		WebElement waepaQ5dSymptoms_Spouse;
		
		@FindBy(xpath="//table[@id='KidneyDetailsTableSps']//input[@data-key-editor='dateOfTreatment']")
		WebElement waepaQ5dDateOfTreatment_Spouse;
		
		@FindBy(xpath="//table[@id='KidneyDetailsTableSps']//input[@data-key-editor='numberOfAttacks']")
		WebElement waepaQ5dNumberOfAttacks_Spouse;
		
		@FindBy(xpath="//table[@id='KidneyDetailsTableSps']//input[@data-key-editor='treatmentResult']")
		WebElement waepaQ5dTreatmentResult_Spouse;
		
		@FindBy(xpath="//table[@id='KidneyDetailsTableSps']//input[@data-key-editor='nameAddPhyHosp']")
		WebElement waepaQ5dNameAddress_Spouse;

		@FindBy(id="rdArthriticSps-0")
		WebElement waepaQ5eYes_Spouse;
		
		@FindBy(id="rdArthriticSps-1")
		WebElement waepaQ5eNo_Spouse;
		
		@FindBy(xpath="//table[@id='ArthriticDetailsTableSps']//input[@data-key-editor='dateOfOnset']")
		WebElement waepaQ5eDateOfOnset_Spouse;
		
		@FindBy(xpath="//table[@id='ArthriticDetailsTableSps']//input[@data-key-editor='illnessOrInjury']")
		WebElement waepaQ5eIllnessOrInjury_Spouse;
		
		@FindBy(xpath="//table[@id='ArthriticDetailsTableSps']//input[@data-key-editor='symptoms']")
		WebElement waepaQ5eSymptoms_Spouse;
		
		@FindBy(xpath="//table[@id='ArthriticDetailsTableSps']//input[@data-key-editor='dateOfTreatment']")
		WebElement waepaQ5eDateOfTreatment_Spouse;
		
		@FindBy(xpath="//table[@id='ArthriticDetailsTableSps']//input[@data-key-editor='numberOfAttacks']")
		WebElement waepaQ5eNumberOfAttacks_Spouse;
		
		@FindBy(xpath="//table[@id='ArthriticDetailsTableSps']//input[@data-key-editor='treatmentResult']")
		WebElement waepaQ5eTreatmentResult_Spouse;
		
		@FindBy(xpath="//table[@id='ArthriticDetailsTableSps']//input[@data-key-editor='nameAddPhyHosp']")
		WebElement waepaQ5eNameAddress_Spouse;

		@FindBy(id="rdParalysisSps-0")
		WebElement waepaQ5fYes_Spouse;
		
		@FindBy(id="rdParalysisSps-1")
		WebElement waepaQ5fNo_Spouse;
		
		@FindBy(xpath="//table[@id='ParalysisDetailsTableSps']//input[@data-key-editor='dateOfOnset']")
		WebElement waepaQ5fDateOfOnset_Spouse;
		
		@FindBy(xpath="//table[@id='ParalysisDetailsTableSps']//input[@data-key-editor='illnessOrInjury']")
		WebElement waepaQ5fIllnessOrInjury_Spouse;
		
		@FindBy(xpath="//table[@id='ParalysisDetailsTableSps']//input[@data-key-editor='symptoms']")
		WebElement waepaQ5fSymptoms_Spouse;
		
		@FindBy(xpath="//table[@id='ParalysisDetailsTableSps']//input[@data-key-editor='dateOfTreatment']")
		WebElement waepaQ5fDateOfTreatment_Spouse;
		
		@FindBy(xpath="//table[@id='ParalysisDetailsTableSps']//input[@data-key-editor='numberOfAttacks']")
		WebElement waepaQ5fNumberOfAttacks_Spouse;
		
		@FindBy(xpath="//table[@id='ParalysisDetailsTableSps']//input[@data-key-editor='treatmentResult']")
		WebElement waepaQ5fTreatmentResult_Spouse;
		
		@FindBy(xpath="//table[@id='ParalysisDetailsTableSps']//input[@data-key-editor='nameAddPhyHosp']")
		WebElement waepaQ5fNameAddress_Spouse;
		
		@FindBy(id="rdStressSps-0")
		WebElement waepaQ5gYes_Spouse;
		
		@FindBy(id="rdStressSps-1")
		WebElement waepaQ5gNo_Spouse;
		
		@FindBy(xpath="//table[@id='StressDetailsTableSps']//input[@data-key-editor='dateOfOnset']")
		WebElement waepaQ5gDateOfOnset_Spouse;
		
		@FindBy(xpath="//table[@id='StressDetailsTableSps']//input[@data-key-editor='illnessOrInjury']")
		WebElement waepaQ5gIllnessOrInjury_Spouse;
		
		@FindBy(xpath="//table[@id='StressDetailsTableSps']//input[@data-key-editor='symptoms']")
		WebElement waepaQ5gSymptoms_Spouse;
		
		@FindBy(xpath="//table[@id='StressDetailsTableSps']//input[@data-key-editor='dateOfTreatment']")
		WebElement waepaQ5gDateOfTreatment_Spouse;
		
		@FindBy(xpath="//table[@id='StressDetailsTableSps']//input[@data-key-editor='numberOfAttacks']")
		WebElement waepaQ5gNumberOfAttacks_Spouse;
		
		@FindBy(xpath="//table[@id='StressDetailsTableSps']//input[@data-key-editor='treatmentResult']")
		WebElement waepaQ5gTreatmentResult_Spouse;
		
		@FindBy(xpath="//table[@id='StressDetailsTableSps']//input[@data-key-editor='nameAddPhyHosp']")
		WebElement waepaQ5gNameAddress_Spouse;
		
		@FindBy(id="rdDiabetesSps-0")
		WebElement waepaQ5hYes_Spouse;
		
		@FindBy(id="rdDiabetesSps-1")
		WebElement waepaQ5hNo_Spouse;
		
		@FindBy(xpath="//table[@id='DiabetesDetailsTableSps']//input[@data-key-editor='dateOfOnset']")
		WebElement waepaQ5hDateOfOnset_Spouse;
		
		@FindBy(xpath="//table[@id='DiabetesDetailsTableSps']//input[@data-key-editor='illnessOrInjury']")
		WebElement waepaQ5hIllnessOrInjury_Spouse;
		
		@FindBy(xpath="//table[@id='DiabetesDetailsTableSps']//input[@data-key-editor='symptoms']")
		WebElement waepaQ5hSymptoms_Spouse;
		
		@FindBy(xpath="//table[@id='DiabetesDetailsTableSps']//input[@data-key-editor='dateOfTreatment']")
		WebElement waepaQ5hDateOfTreatment_Spouse;
		
		@FindBy(xpath="//table[@id='DiabetesDetailsTableSps']//input[@data-key-editor='numberOfAttacks']")
		WebElement waepaQ5hNumberOfAttacks_Spouse;
		
		@FindBy(xpath="//table[@id='DiabetesDetailsTableSps']//input[@data-key-editor='treatmentResult']")
		WebElement waepaQ5hTreatmentResult_Spouse;
		
		@FindBy(xpath="//table[@id='DiabetesDetailsTableSps']//input[@data-key-editor='nameAddPhyHosp']")
		WebElement waepaQ5hNameAddress_Spouse;
		
		@FindBy(id="rdAnemiaSps-0")
		WebElement waepaQ5iYes_Spouse;
		
		@FindBy(id="rdAnemiaSps-1")
		WebElement waepaQ5iNo_Spouse;
		
		@FindBy(xpath="//table[@id='AnemiaDetailsTableSps']//input[@data-key-editor='dateOfOnset']")
		WebElement waepaQ5iDateOfOnset_Spouse;
		
		@FindBy(xpath="//table[@id='AnemiaDetailsTableSps']//input[@data-key-editor='illnessOrInjury']")
		WebElement waepaQ5iIllnessOrInjury_Spouse;
		
		@FindBy(xpath="//table[@id='AnemiaDetailsTableSps']//input[@data-key-editor='symptoms']")
		WebElement waepaQ5iSymptoms_Spouse;
		
		@FindBy(xpath="//table[@id='AnemiaDetailsTableSps']//input[@data-key-editor='dateOfTreatment']")
		WebElement waepaQ5iDateOfTreatment_Spouse;
		
		@FindBy(xpath="//table[@id='AnemiaDetailsTableSps']//input[@data-key-editor='numberOfAttacks']")
		WebElement waepaQ5iNumberOfAttacks_Spouse;
		
		@FindBy(xpath="//table[@id='AnemiaDetailsTableSps']//input[@data-key-editor='treatmentResult']")
		WebElement waepaQ5iTreatmentResult_Spouse;
		
		@FindBy(xpath="//table[@id='AnemiaDetailsTableSps']//input[@data-key-editor='nameAddPhyHosp']")
		WebElement waepaQ5iNameAddress_Spouse;
		
		@FindBy(id="rdThroatSps-0")
		WebElement waepaQ5jYes_Spouse;
		
		@FindBy(id="rdThroatSps-1")
		WebElement waepaQ5jNo_Spouse;
		
		@FindBy(xpath="//table[@id='ThroatDetailsTableSps']//input[@data-key-editor='dateOfOnset']")
		WebElement waepaQ5jDateOfOnset_Spouse;
		
		@FindBy(xpath="//table[@id='ThroatDetailsTableSps']//input[@data-key-editor='illnessOrInjury']")
		WebElement waepaQ5jIllnessOrInjury_Spouse;
		
		@FindBy(xpath="//table[@id='ThroatDetailsTableSps']//input[@data-key-editor='symptoms']")
		WebElement waepaQ5jSymptoms_Spouse;
		
		@FindBy(xpath="//table[@id='ThroatDetailsTableSps']//input[@data-key-editor='dateOfTreatment']")
		WebElement waepaQ5jDateOfTreatment_Spouse;
		
		@FindBy(xpath="//table[@id='ThroatDetailsTableSps']//input[@data-key-editor='numberOfAttacks']")
		WebElement waepaQ5jNumberOfAttacks_Spouse;
		
		@FindBy(xpath="//table[@id='ThroatDetailsTableSps']//input[@data-key-editor='treatmentResult']")
		WebElement waepaQ5jTreatmentResult_Spouse;
		
		@FindBy(xpath="//table[@id='ThroatDetailsTableSps']//input[@data-key-editor='nameAddPhyHosp']")
		WebElement waepaQ5jNameAddress_Spouse;
		
		@FindBy(id="rdCancerSps-0")
		WebElement waepaQ5kYes_Spouse;
		
		@FindBy(id="rdCancerSps-1")
		WebElement waepaQ5kNo_Spouse;
		
		@FindBy(xpath="//table[@id='CancerDetailsTableSps']//input[@data-key-editor='dateOfOnset']")
		WebElement waepaQ5kDateOfOnset_Spouse;
		
		@FindBy(xpath="//table[@id='CancerDetailsTableSps']//input[@data-key-editor='illnessOrInjury']")
		WebElement waepaQ5kIllnessOrInjury_Spouse;
		
		@FindBy(xpath="//table[@id='CancerDetailsTableSps']//input[@data-key-editor='symptoms']")
		WebElement waepaQ5kSymptoms_Spouse;
		
		@FindBy(xpath="//table[@id='CancerDetailsTableSps']//input[@data-key-editor='dateOfTreatment']")
		WebElement waepaQ5kDateOfTreatment_Spouse;
		
		@FindBy(xpath="//table[@id='CancerDetailsTableSps']//input[@data-key-editor='numberOfAttacks']")
		WebElement waepaQ5kNumberOfAttacks_Spouse;
		
		@FindBy(xpath="//table[@id='CancerDetailsTableSps']//input[@data-key-editor='treatmentResult']")
		WebElement waepaQ5kTreatmentResult_Spouse;
		
		@FindBy(xpath="//table[@id='CancerDetailsTableSps']//input[@data-key-editor='nameAddPhyHosp']")
		WebElement waepaQ5kNameAddress_Spouse;
		
		@FindBy(id="rdIllnessSps-0")
		WebElement waepaQ5lYes_Spouse;
		
		@FindBy(id="rdIllnessSps-1")
		WebElement waepaQ5lNo_Spouse;
		
		@FindBy(xpath="//table[@id='IllnessDetailsTableSps']//input[@data-key-editor='dateOfOnset']")
		WebElement waepaQ5lDateOfOnset_Spouse;
		
		@FindBy(xpath="//table[@id='IllnessDetailsTableSps']//input[@data-key-editor='illnessOrInjury']")
		WebElement waepaQ5lIllnessOrInjury_Spouse;
		
		@FindBy(xpath="//table[@id='IllnessDetailsTableSps']//input[@data-key-editor='symptoms']")
		WebElement waepaQ5lSymptoms_Spouse;
		
		@FindBy(xpath="//table[@id='IllnessDetailsTableSps']//input[@data-key-editor='dateOfTreatment']")
		WebElement waepaQ5lDateOfTreatment_Spouse;
		
		@FindBy(xpath="//table[@id='IllnessDetailsTableSps']//input[@data-key-editor='numberOfAttacks']")
		WebElement waepaQ5lNumberOfAttacks_Spouse;
		
		@FindBy(xpath="//table[@id='IllnessDetailsTableSps']//input[@data-key-editor='treatmentResult']")
		WebElement waepaQ5lTreatmentResult_Spouse;
		
		@FindBy(xpath="//table[@id='IllnessDetailsTableSps']//input[@data-key-editor='nameAddPhyHosp']")
		WebElement waepaQ5lNameAddress_Spouse;
		
		//Question6************************************************************************
		
		@FindBy(id="rdAlcoholSps-0")
		WebElement waepaQ6aYes_Spouse;
		
		@FindBy(id="rdAlcoholSps-1")
		WebElement waepaQ6aNo_Spouse;
		
		@FindBy(id="selAlcoholAmtSps")
		WebElement waepaQ6aFrequency_Spouse;
		
		@FindBy(id="txtWineSps")
		WebElement waepaQ6aWine_Spouse;
		
		@FindBy(id="txtBeerSps")
		WebElement waepaQ6aBeer_Spouse;
		
		@FindBy(id="txtLiquorSps")
		WebElement waepaQ6aLiquor_Spouse;
		
		@FindBy(id="rdAlcoholFiveYrSps-0")
		WebElement waepaQ6a1Yes_Spouse;
		
		@FindBy(id="rdAlcoholFiveYrSps-1")
		WebElement waepaQ6a1No_Spouse;
			
		
		@FindBy(id="rdPastFiveYrAlcoholSps-0")
		WebElement waepaQ6bYes_Spouse;
		
		@FindBy(id="rdPastFiveYrAlcoholSps-1")
		WebElement waepaQ6bNo_Spouse;
		
		@FindBy(xpath="//table[@id='PastFiveYrAlcoDetailsTableSps']//input[@data-key-editor='pastAlcoholMonthYear']")
		WebElement waepaQ6bPastAlcoholMonthYear_Spouse;
		
		@FindBy(xpath="//table[@id='PastFiveYrAlcoDetailsTableSps']//input[@data-key-editor='pastAlcoholDetails']")
		WebElement waepaQ6bPastAlcoholDetails_Spouse;
		
		
		@FindBy(id="rdPastFiveSedAlcoholSps-0")
		WebElement waepaQ6cYes_Spouse;
		
		@FindBy(id="rdPastFiveSedAlcoholSps-1")
		WebElement waepaQ6cNo_Spouse;
		
		@FindBy(xpath="//table[@id='PastFiveSedAlcoholTableSps']//input[@data-key-editor='alcoholMonthYear']")
		WebElement waepaQ6cPastAlcoholMonthYear_Spouse;
		
		@FindBy(xpath="//table[@id='PastFiveSedAlcoholTableSps']//input[@data-key-editor='alcoholFreq']")
		WebElement waepaQ6cAlcoholFrequency_Spouse;
		
		@FindBy(xpath="//table[@id='PastFiveSedAlcoholTableSps']//input[@data-key-editor='alcoholDrugs']")
		WebElement waepaQ6cAlcoholDrugs_Spouse;
		
		@FindBy(xpath="//table[@id='PastFiveSedAlcoholTableSps']//input[@data-key-editor='alcoholDetails']")
		WebElement waepaQ6cAlcoholDetails_Spouse;
		
		@FindBy(id="rdPastFiveMarAlcoholSps-0")
		WebElement waepaQ6dYes_Spouse;
		
		@FindBy(id="rdPastFiveMarAlcoholSps-1")
		WebElement waepaQ6dNo_Spouse;
		
		@FindBy(xpath="//table[@id='PastFiveMarAlcoholDetailsTableSps']//input[@data-key-editor='alcoholMonthYear']")
		WebElement waepaQ6dPastAlcoholMonthYear_Spouse;
		
		@FindBy(xpath="//table[@id='PastFiveMarAlcoholDetailsTableSps']//input[@data-key-editor='alcoholFreq']")
		WebElement waepaQ6dAlcoholFrequency_Spouse;
		
		@FindBy(xpath="//table[@id='PastFiveMarAlcoholDetailsTableSps']//input[@data-key-editor='alcoholDrugs']")
		WebElement waepaQ6dAlcoholDrugs_Spouse;
		
		@FindBy(xpath="//table[@id='PastFiveMarAlcoholDetailsTableSps']//input[@data-key-editor='alcoholDetails']")
		WebElement waepaQ6dAlcoholDetails_Spouse;
		
		@FindBy(id="rdJetSmokerQuestSps-0")
		WebElement waepaQ6eYes_Spouse;
		
		@FindBy(id="rdJetSmokerQuestSps-1")
		WebElement waepaQ6eNo_Spouse;
		
		@FindBy(id="dtJetSmokerLastUsedSps")
		WebElement waepaQ6eSmokerLastUsed_Spouse;
		
		@FindBy(xpath="//input[@id='selJetSmokerPickListSps-selectized']")
		WebElement waepaQ6eSmokerPickListSlf_Spouse;
		//selecting from list
	/*	@FindBy(xpath="//*[@class='selectize-dropdown-content']//div[@data-value='Cigar']")
		WebElement waepaQ6eProduct_CIGAR_Self;
		@FindBy(xpath="//*[@class='selectize-dropdown-content']//div[@data-value='Cigar']")
		WebElement waepaQ6eProduct_CIGAR_Spouse;*/
		
		@FindBy(id="rdPastFivePhyAlcoholSps-0")
		WebElement waepaQ6fYes_Spouse;
		
		@FindBy(id="rdPastFivePhyAlcoholSps-1")
		WebElement waepaQ6fNo_Spouse;
		
		@FindBy(id="dtPastFivePhyAlcoholSps")
		WebElement waepaQ6fAlcoholDate_Spouse;
		
		@FindBy(id="txtPastFivePhyAlcoholSps")
		WebElement waepaQ6fDetails_Spouse;
		
		@FindBy(id="txtPastFivePhyAlcoNameAddrSps")
		WebElement waepaQ6fNameAddress_Spouse;
		
		//Question7***********************************************************************
		@FindBy(id="rdPastFiveYrLicSuspSps-0")
		WebElement waepaQ7aYes_Spouse;
		
		@FindBy(id="rdPastFiveYrLicSuspSps-1")
		WebElement waepaQ7aNo_Spouse;
		
		@FindBy(id="txtSuspDetailsSps")
		WebElement waepaQ7aDetails_Spouse;
		
		@FindBy(id="rdConCrimeNonMNCTSps-0")
		WebElement waepaQ7bYes_Spouse;
		
		@FindBy(id="rdConCrimeMNCTSps-1")
		WebElement waepaQ7bNo_Spouse;
		
		@FindBy(xpath="//table[@id='CrimeDetailsTableSps']//input[@data-key-editor='crimeDate']")
		WebElement waepaQ7bCrimeDate_Spouse;
		
		@FindBy(xpath="//table[@id='CrimeDetailsTableSps']//input[@data-key-editor='crimeDetails']")
		WebElement waepaQ7bCrimeDetails_Spouse;
		
		//Question8*******************************************************************
		
		@FindBy(id="rdFamilyHistorySps-0")
		WebElement waepaQ8aYes_Spouse;
		
		@FindBy(id="rdFamilyHistorySps-1")
		WebElement waepaQ8aNo_Spouse;
		
		@FindBy(xpath="//table[@id='familyhisdettablesps']//select[@data-key-editor='familyMember']")
		WebElement waepaQ8aFamilyMember_Spouse;
		
		@FindBy(xpath="//table[@id='familyhisdettablesps']//input[@data-key-editor='ageOfOnset']")
		WebElement waepaQ8aAgeOfOnset_Spouse;
		
		@FindBy(xpath="//table[@id='familyhisdettablesps']//select[@data-key-editor='lifeStatus']")
		WebElement waepaQ8alifeStatus_Spouse;
		
		@FindBy(xpath="//table[@id='familyhisdettablesps']//textarea[@data-key-editor='medicalCondition']")
		WebElement waepaQ8aMedicalCondition_Spouse;
		
		//Question End for Spouse*********************************************************************
	
	
	@FindBy(id="next")
	WebElement next;


	@FindBy(id="nav_ctrl_continue")
	WebElement Next;
	
	
	@FindBy(xpath="//input[@value='No']")
	List<WebElement> allElements;
	
	@FindBy(xpath="//button[@data-code='No'] [@id !='case_life_Relation_LivingRelative_53_option_0']")
	List<WebElement> HealthPage2;
	
	public boolean statement_of_Health_page_one_is_displayed_to_user_and_answeres_as_No_for_all_questions_on_both_pages_for_Self() throws Exception{
		
		try {
			log.debug("Answer the questions of 1st page of statement_of_health");
			Thread.sleep(3000);
			Question1No.click();
			Question2No.click();
			Question3No.click();
			reuseMethod.scrollDown(Next);
			Question4No.click();
			Question5No.click();
			Next.click();
			Thread.sleep(5000);

			log.info("Answer the questions of 1st page of statement_of_health are successfully || Pass");
		return true;
		}catch (Exception e) {
			log.error("Not able to answer the questions of 1st page of statement_of_health || Fail"+e.getMessage());
			 throw(e);
		}
		
	}
	
	public boolean statement_of_Health_page_two_is_displayed_to_user_and_answeres_as_No_for_all_questions_on_both_pages_for_Self() throws Exception{
	
		try {
			log.debug("Answer the questions of 1st page of statement_of_health of Waepa website");
			Thread.sleep(2000);
			System.out.println(HealthPage2.size());
			for (int i = 0; i < HealthPage2.size(); i++)
			{
				Thread.sleep(500);
				HealthPage2.get(i).click();	
					
			}
			Thread.sleep(1000);
			reuseMethod.scrollDown(Next);
			Thread.sleep(5000);
	    	Next.click();
			log.info("Answer the questions of 1st page of statement_of_health are successfully || Pass");
		return true;
		}catch (Exception e) {
			log.error("Not able to answer the questions of 1st page of statement_of_health || Fail"+e.getMessage());
			 throw(e);
		}
			
		}
	
public boolean health_History_Page_Two_are_displayed_and_user_Select_NO_for_all_the_questions() throws Exception{
		
	try {
		log.debug("Answer the questions of 1st page of statement_of_health of Waepa website");
		Thread.sleep(1000);

		for(int i=0;i<HealthPage2.size();i++)
		{
			Thread.sleep(1000);
			HealthPage2.get(i).click();					
		}
        Thread.sleep(1000);
    	Next.click();
		log.info("Answer the questions of 1st page of statement_of_health are successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to answer the questions of 1st page of statement_of_health || Fail"+e.getMessage());
		 throw(e);
	}
		
	}
	
	
public boolean health_History_Page_are_displayed_and_user_Select_NO_for_all_the_questions() throws Exception{
		
		try {
			log.debug("Answer the questions of 1st page of statement_of_health of Waepa website");
			Thread.sleep(1000);
	
			for(int i=0;i<allElements.size();i++)
			{				
				allElements.get(i).click();					
			}
            Thread.sleep(1000);
			log.info("Answer the questions of 1st page of statement_of_health are successfully || Pass");
		return true;
		}catch (Exception e) {
			log.error("Not able to answer the questions of 1st page of statement_of_health || Fail"+e.getMessage());
			 throw(e);
		}
		
	}
	
public boolean enters_details_for_Question_forth_as_Waepa(String Physician, String Address, String Date, String Reason, String Result) throws Exception{
	
	try {
		log.debug("Answer the 4th questions of statement_of_health of Waepa website");
		waepaPhyName.sendKeys(Physician);
		waepaPhyAddress.sendKeys(Address);
		waepaDate.clear();
		waepaDate.click();
		Thread.sleep(2000);
		if(!Date.startsWith("SysDate")||(!Date.startsWith("SYSDate"))||(!Date.startsWith("SYSdate")))
		{
			if(Date.contains("/"))
			{
		waepaDate.sendKeys(Date);
			}
			else
			{
				Date=Date.substring(0, 2)+"/"+Date.substring(2, 4)+"/"+Date.substring(4, Date.length());
				waepaDate.sendKeys(Date);
			}
		}
		Thread.sleep(1000);
		waepaReason.sendKeys(Reason);
		waepaPhyDiagTreatSlf.sendKeys(Result);
		waepaQ4dNo.click();
		reuseMethod.scrollDown(next);
        Thread.sleep(1000);
		log.info("Answer the 4th questions of statement_of_health are successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to answer the 4th question of statement_of_health || Fail"+e.getMessage());
		 throw(e);
	}
	
}

public boolean enters_details_for_Question_forth_for_Spouse_as_Waepa(String Physician1, String Address1, String Date, String Reason1, String Result1) throws Exception{
	
	try {
		log.debug("Answer the 4th questions of statement of health of for Spouse Waepa website");
		waepaPhyNameSpouse.sendKeys(Physician1);
		waepaPhyAddressSpouse.sendKeys(Address1);
		waepaDateSpouse.click();
		Thread.sleep(2000);

		if(Date.contains("/"))
		{
			waepaDateSpouse.sendKeys(Date);
		}
		else
		{
			Date=Date.substring(0, 2)+"/"+Date.substring(2, 4)+"/"+Date.substring(4, Date.length());
			waepaDateSpouse.sendKeys(Date);
		}
		
		waepaReasonSpouse.click();
		waepaReasonSpouse.sendKeys(Reason1);
		waepaPhyDiagTreatSpouse.sendKeys(Result1);
		reuseMethod.scrollDown(next);
        Thread.sleep(1000);
		log.info("Answered the 4th questions of statement of health for Spouse Waepa website are successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to answer the 4th question of statement of health for Spouse Waepa website || Fail"+e.getMessage());
		 throw(e);
	}
	
}


public boolean verify_Health_History_Page_are_displayed_to_user() throws Exception{
	
	try {
		log.debug("Health History Page should be displayed to user");
		Label_HealthHistory.isDisplayed();
		log.info("Health History Page are displayed successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to displayed Health History Page || Fail"+e.getMessage());
		 throw(e);
	}
	
}



public boolean select_YES_for_self_question_one_two_and_enter_details_as(String Amount1a, String WeightReason1a, String Details2a, String Details2b) throws Exception{
	
	try {
		log.debug("Question One and Two should be selected to user");
		
		waepaQ1aYes.click();
		Thread.sleep(1000);
		waepaQ1aAmount.sendKeys(Amount1a);
		waepaQ1aReason.sendKeys(WeightReason1a);
		waepaQ2aYes.click();
		Thread.sleep(1000);
		waepaQ2aDetails.sendKeys(Details2a);
		waepaQ2bYes.click();
		Thread.sleep(1000);
		waepaQ2bDetails.sendKeys(Details2b);
		
		log.info("Question One and Two selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question One and Two || Fail"+e.getMessage());
		 throw(e);
	}
	
}

public boolean select_YES_for_Self_question_three_and_enter_details_as(String Date3a, String Treatment3a, String NameAddress3a, String Medicine3b, String Dosage3b, String Freq3b, String NameAddress3b) throws Exception{
	
	try {
		log.debug("Question three should be selected to user");
		
		waepaQ3aYes.click();
		Thread.sleep(1000);
		waepaQ3aDate.click();
		waepaQ3aDate.clear();
		Thread.sleep(2000);
		if(Date3a.contains("/"))
		{
			waepaQ3aDate.sendKeys(Date3a);
		}
		else
		{
			Date3a=Date3a.substring(0, 2)+"/"+Date3a.substring(2, Date3a.length());
			waepaQ3aDate.sendKeys(Date3a);
		}
		
		waepaQ3aTreatment.sendKeys(Treatment3a);
		waepaQ3aNameAddress.sendKeys(NameAddress3a);
		waepaQ3bYes.click();
		Thread.sleep(1000);
		waepaQ3bMedication.sendKeys(Medicine3b);
		waepaQ3bDosage.sendKeys(Dosage3b);
		waepaQ3bFrequency.sendKeys(Freq3b);
		waepaQ3bNameAddress.sendKeys(NameAddress3b);
		//waepaQ3cYes.click();
		//waepaQ3dYes.click();
		
		log.info("Question three selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question three || Fail"+e.getMessage());
		 throw(e);
	}
	
}

public boolean select_YES_for_Self_question_Four_as (String Physician4a,String Address4a,String Date4b,String Reason4b,String Result4c,String EKG4d,String Details4d) throws Exception{
	
	try {
		log.debug("Question One and Two should be selected to user");
		waepaPhyName.sendKeys(Physician4a);
		waepaPhyAddress.sendKeys(Address4a);
		waepaDate.clear();
		waepaDate.click();
		
		Thread.sleep(2000);
		if(Date4b.contains("/"))
		{
			waepaDate.sendKeys(Date4b);
		}
		else
		{
			Date4b=Date4b.substring(0, 2)+"/"+Date4b.substring(2, Date4b.length());
			waepaDate.sendKeys(Date4b);
		}
		
		waepaReason.sendKeys(Reason4b);
		waepaPhyDiagTreatSlf.sendKeys(Result4c);
		if(EKG4d.equalsIgnoreCase("Yes"))
		{
			waepaQ4dYes.click();
		}
		else{
			waepaQ4dNo.click();
		}	
		Thread.sleep(1000);
		waepaQ4dEKG.sendKeys(Details4d);
		reuseMethod.scrollDown(next);
		
		
		log.info("Question One and Two selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question One and Two || Fail"+e.getMessage());
		 throw(e);
	}
	
}

public boolean select_YES_for_Self_question_FiveA_blood_pressure_and_enter_details_as(String Date5a, String Illness5a, String Symptoms5a, String LastDate5a, String Attacks5a, String Treatment5a, String NameAddress5a) throws Exception{
	
	try {
		log.debug("Question FiveA should be selected to user");
		waepaQ5aYes.click();
		Thread.sleep(1000);
		waepaQ5aDateOfOnset.click();
		waepaQ5aDateOfOnset.clear();
		Thread.sleep(1000);
		if(Date5a.contains("/"))
		{
			waepaQ5aDateOfOnset.sendKeys(Date5a);
		}
		else
		{
			Date5a=Date5a.substring(0, 2)+"/"+Date5a.substring(2, Date5a.length());
			waepaQ5aDateOfOnset.sendKeys(Date5a);
		}
		
		waepaQ5aIllnessOrInjury.sendKeys(Illness5a);
		waepaQ5aSymptoms.sendKeys(Symptoms5a);
		waepaQ5aDateOfTreatment.click();
		waepaQ5aDateOfTreatment.clear();
		Thread.sleep(1000);
		if(LastDate5a.contains("/"))
		{
			waepaQ5aDateOfTreatment.sendKeys(LastDate5a);
		}
		else
		{
			LastDate5a=LastDate5a.substring(0, 2)+"/"+LastDate5a.substring(2, LastDate5a.length());
			waepaQ5aDateOfTreatment.sendKeys(LastDate5a);
		}
		
		waepaQ5aNumberOfAttacks.sendKeys(Attacks5a);
		waepaQ5aTreatmentResult.sendKeys(Treatment5a);
		waepaQ5aNameAddress.sendKeys(NameAddress5a);
		
		log.info("Question FiveA selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveA || Fail"+e.getMessage());
		 throw(e);
	}
	
}


public boolean select_YES_for_Self_question_FiveB_ulcer_and_enter_details_as(String Date5b, String Illness5b, String Symptoms5b, String LastDate5b, String Attacks5b, String Treatment5b, String NameAddress5b) throws Exception{
	
	
	try {
		log.debug("Question FiveB should be selected to user");
		waepaQ5bYes.click();
		Thread.sleep(1000);
		waepaQ5bDateOfOnset.click();
		Thread.sleep(1000);
		waepaQ5bDateOfOnset.clear();
		if(Date5b.contains("/"))
		{
			waepaQ5bDateOfOnset.sendKeys(Date5b);
			
		}
		else
		{
			Date5b=Date5b.substring(0, 2)+"/"+Date5b.substring(2, Date5b.length());
			waepaQ5bDateOfOnset.sendKeys(Date5b);
			
		}
		waepaQ5bIllnessOrInjury.sendKeys(Illness5b);
		waepaQ5bSymptoms.sendKeys(Symptoms5b);
		waepaQ5bDateOfTreatment.click();
		Thread.sleep(1000);
		waepaQ5bDateOfTreatment.clear();
		if(LastDate5b.contains("/"))
		{
			waepaQ5bDateOfTreatment.sendKeys(LastDate5b);
			
		}
		else
		{
			LastDate5b=LastDate5b.substring(0, 2)+"/"+LastDate5b.substring(2, LastDate5b.length());
			waepaQ5bDateOfTreatment.sendKeys(LastDate5b);
			
		}
		
		waepaQ5bNumberOfAttacks.sendKeys(Attacks5b);
		waepaQ5bTreatmentResult.sendKeys(Treatment5b);
		waepaQ5bNameAddress.sendKeys(NameAddress5b);
		
		log.info("Question FiveA selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveA || Fail"+e.getMessage());
		 throw(e);
	}
	
}

public boolean select_YES_for_Self_question_FiveC_asthma_and_enter_details_as(String Date5c, String Illness5c, String Symptoms5c, String LastDate5c, String Attacks5c, String Treatment5c, String NameAddress5c) throws Exception{
	
	try {
		log.debug("Question FiveC should be selected to user");
		waepaQ5cYes.click();
		Thread.sleep(1000);
		waepaQ5cDateOfOnset.click();
		Thread.sleep(1000);
		waepaQ5cDateOfOnset.clear();
		if(Date5c.contains("/"))
		{
			
			waepaQ5cDateOfOnset.sendKeys(Date5c);
		}
		else
		{
			Date5c=Date5c.substring(0, 2)+"/"+Date5c.substring(2, Date5c.length());
			
			waepaQ5cDateOfOnset.sendKeys(Date5c);
		}
		
		waepaQ5cIllnessOrInjury.sendKeys(Illness5c);
		waepaQ5cSymptoms.sendKeys(Symptoms5c);
		waepaQ5cDateOfTreatment.click();
		Thread.sleep(1000);
		waepaQ5cDateOfTreatment.clear();
		if(LastDate5c.contains("/"))
		{
			
			waepaQ5cDateOfTreatment.sendKeys(LastDate5c);
		}
		else
		{
			LastDate5c=LastDate5c.substring(0, 2)+"/"+LastDate5c.substring(2, LastDate5c.length());
			
			waepaQ5cDateOfTreatment.sendKeys(LastDate5c);
		}
	
		waepaQ5cNumberOfAttacks.sendKeys(Attacks5c);
		waepaQ5cTreatmentResult.sendKeys(Treatment5c);
		waepaQ5cNameAddress.sendKeys(NameAddress5c);
		
		log.info("Question FiveC selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveC || Fail"+e.getMessage());
		 throw(e);
	}
	
}

public boolean select_YES_for_Self_question_FiveD_venereal_disease_and_enter_details_as(String Date5d, String Illness5d, String Symptoms5d, String LastDate5d, String Attacks5d, String Treatment5d, String NameAddress5d) throws Exception{
	
	try {
		log.debug("Question FiveD should be selected to user");
		waepaQ5dYes.click();
		Thread.sleep(1000);
		waepaQ5dDateOfOnset.click();
		Thread.sleep(1000);
		waepaQ5dDateOfOnset.clear();
		if(Date5d.contains("/"))
		{
			
			waepaQ5dDateOfOnset.sendKeys(Date5d);
		}
		else
		{
			Date5d=Date5d.substring(0, 2)+"/"+Date5d.substring(2, Date5d.length());
			
			waepaQ5dDateOfOnset.sendKeys(Date5d);
		}
		
		waepaQ5dIllnessOrInjury.sendKeys(Illness5d);
		waepaQ5dSymptoms.sendKeys(Symptoms5d);
		waepaQ5dDateOfTreatment.click();
		waepaQ5dDateOfTreatment.clear();
		Thread.sleep(1000);
		if(LastDate5d.contains("/"))
		{
			
			waepaQ5dDateOfTreatment.sendKeys(LastDate5d);
		}
		else
		{
			LastDate5d=LastDate5d.substring(0, 2)+"/"+LastDate5d.substring(2, LastDate5d.length());
			
			waepaQ5dDateOfTreatment.sendKeys(LastDate5d);
		}
		
		waepaQ5dNumberOfAttacks.sendKeys(Attacks5d);
		waepaQ5dTreatmentResult.sendKeys(Treatment5d);
		waepaQ5dNameAddress.sendKeys(NameAddress5d);
		
		
		log.info("Question FiveD selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveD || Fail"+e.getMessage());
		 throw(e);
	}
	
}


public boolean select_YES_for_Self_question_FiveE_fibrositis_and_enter_details_as(String Date5e, String Illness5e, String Symptoms5e, String LastDate5e, String Attacks5e, String Treatment5e, String NameAddress5e) throws Exception{
	
	try {
		log.debug("Question FiveE should be selected to user");
		waepaQ5eYes.click();
		Thread.sleep(1000);
		waepaQ5eDateOfOnset.click();
		Thread.sleep(1000);
		waepaQ5eDateOfOnset.clear();
		if(Date5e.contains("/"))
		{
			
			waepaQ5eDateOfOnset.sendKeys(Date5e);
		}
		else
		{
			Date5e=Date5e.substring(0, 2)+"/"+Date5e.substring(2, Date5e.length());
			
			waepaQ5eDateOfOnset.sendKeys(Date5e);
		}
		
		waepaQ5eIllnessOrInjury.sendKeys(Illness5e);
		waepaQ5eSymptoms.sendKeys(Symptoms5e);
		waepaQ5eDateOfTreatment.click();
		Thread.sleep(1000);
		waepaQ5eDateOfTreatment.clear();
		if(LastDate5e.contains("/"))
		{
			
			waepaQ5eDateOfTreatment.sendKeys(LastDate5e);
		}
		else
		{
			LastDate5e=LastDate5e.substring(0, 2)+"/"+LastDate5e.substring(2,LastDate5e.length());
			
			waepaQ5eDateOfTreatment.sendKeys(LastDate5e);
		}
		
		waepaQ5eNumberOfAttacks.sendKeys(Attacks5e);
		waepaQ5eTreatmentResult.sendKeys(Treatment5e);
		waepaQ5eNameAddress.sendKeys(NameAddress5e);
		
		
		log.info("Question FiveE selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveE || Fail"+e.getMessage());
		 throw(e);
	}
	
}


public boolean select_YES_for_Self_question_FiveF_convulsions_and_enter_details_as(String Date5f, String Illness5f, String Symptoms5f, String LastDate5f, String Attacks5f, String Treatment5f, String NameAddress5f) throws Exception{
	
	try {
		log.debug("Question FiveF should be selected to user");
		waepaQ5fYes.click();
		Thread.sleep(1000);
		waepaQ5fDateOfOnset.click();
		Thread.sleep(1000);
		waepaQ5fDateOfOnset.clear();
		if(Date5f.contains("/"))
		{
			
			waepaQ5fDateOfOnset.sendKeys(Date5f);
		}
		else
		{
			Date5f=Date5f.substring(0, 2)+"/"+Date5f.substring(2, Date5f.length());
			
			waepaQ5fDateOfOnset.sendKeys(Date5f);
		}
		
		waepaQ5fIllnessOrInjury.sendKeys(Illness5f);
		waepaQ5fSymptoms.sendKeys(Symptoms5f);
		waepaQ5fDateOfTreatment.click();
		Thread.sleep(1000);
		waepaQ5fDateOfTreatment.clear();
		if(LastDate5f.contains("/"))
		{
			
			waepaQ5fDateOfTreatment.sendKeys(LastDate5f);
		}
		else
		{
			LastDate5f=LastDate5f.substring(0, 2)+"/"+LastDate5f.substring(2, LastDate5f.length());
			
			waepaQ5fDateOfTreatment.sendKeys(LastDate5f);
		}
		
		waepaQ5fNumberOfAttacks.sendKeys(Attacks5f);
		waepaQ5fTreatmentResult.sendKeys(Treatment5f);
		waepaQ5fNameAddress.sendKeys(NameAddress5f);
		
		
		log.info("Question FiveF selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveF || Fail"+e.getMessage());
		 throw(e);
	}
}



public boolean select_YES_for_Self_question_FiveG_stress_and_enter_details_as(String Date5g, String Illness5g, String Symptoms5g, String LastDate5g, String Attacks5g, String Treatment5g, String NameAddress5g) throws Exception{
	
	try {
		log.debug("Question FiveG should be selected to user");
		waepaQ5gYes.click();
		Thread.sleep(1000);
		waepaQ5gDateOfOnset.click();
		Thread.sleep(1000);
		waepaQ5gDateOfOnset.clear();
		if(Date5g.contains("/"))
		{
			
			waepaQ5gDateOfOnset.sendKeys(Date5g);
		}
		else
		{
			Date5g=Date5g.substring(0, 2)+"/"+Date5g.substring(2, Date5g.length());
			
			waepaQ5gDateOfOnset.sendKeys(Date5g);
		}
		
		waepaQ5gIllnessOrInjury.sendKeys(Illness5g);
		waepaQ5gSymptoms.sendKeys(Symptoms5g);
		waepaQ5gDateOfTreatment.click();
		waepaQ5gDateOfTreatment.clear();
		if(LastDate5g.contains("/"))
		{
			
			waepaQ5gDateOfTreatment.sendKeys(LastDate5g);
		}
		else
		{
			LastDate5g=LastDate5g.substring(0, 2)+"/"+LastDate5g.substring(2, LastDate5g.length());
			
			waepaQ5gDateOfTreatment.sendKeys(LastDate5g);
		}
		
		Thread.sleep(1000);
		waepaQ5gNumberOfAttacks.sendKeys(Attacks5g);
		waepaQ5gTreatmentResult.sendKeys(Treatment5g);
		waepaQ5gNameAddress.sendKeys(NameAddress5g);
		
		
		log.info("Question FiveG selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveG || Fail"+e.getMessage());
		 throw(e);
	}
}



public boolean select_YES_for_Self_question_FiveH_diabetes_and_enter_details_as(String Date5h, String Illness5h, String Symptoms5h, String LastDate5h, String Attacks5h, String Treatment5h, String NameAddress5h) throws Exception{
	
	try {
		log.debug("Question FiveH should be selected to user");
		waepaQ5hYes.click();
		Thread.sleep(1000);
		waepaQ5hDateOfOnset.click();
		waepaQ5hDateOfOnset.clear();
		Thread.sleep(1000);
		if(Date5h.contains("/"))
		{
			
			waepaQ5hDateOfOnset.sendKeys(Date5h);
		}
		else
		{
			Date5h=Date5h.substring(0, 2)+"/"+Date5h.substring(2, Date5h.length());
			
			waepaQ5hDateOfOnset.sendKeys(Date5h);
		}
		
		
		waepaQ5hIllnessOrInjury.sendKeys(Illness5h);
		waepaQ5hSymptoms.sendKeys(Symptoms5h);
		waepaQ5hDateOfTreatment.click();
		waepaQ5hDateOfTreatment.clear();
		Thread.sleep(1000);
		if(LastDate5h.contains("/"))
		{
			
			waepaQ5hDateOfTreatment.sendKeys(LastDate5h);
		}
		else
		{
			LastDate5h=LastDate5h.substring(0, 2)+"/"+LastDate5h.substring(2,LastDate5h.length());
			
			waepaQ5hDateOfTreatment.sendKeys(LastDate5h);
		}
		
		waepaQ5hNumberOfAttacks.sendKeys(Attacks5h);
		waepaQ5hTreatmentResult.sendKeys(Treatment5h);
		waepaQ5hNameAddress.sendKeys(NameAddress5h);
		
		
		log.info("Question FiveH selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveH || Fail"+e.getMessage());
		 throw(e);
	}
}


public boolean select_YES_for_Self_question_FiveI_any_disease_and_enter_details_as(String Date5i, String Illness5i, String Symptoms5i, String LastDate5i, String Attacks5i, String Treatment5i, String NameAddress5i) throws Exception{
	
	try {
		log.debug("Question FiveI should be selected to user");
		waepaQ5iYes.click();
		Thread.sleep(1000);
		waepaQ5iDateOfOnset.click();
		waepaQ5iDateOfOnset.clear();
		Thread.sleep(1000);
		if(Date5i.contains("/"))
		{
			
			waepaQ5iDateOfOnset.sendKeys(Date5i);
		}
		else
		{
			Date5i=Date5i.substring(0, 2)+"/"+Date5i.substring(2, Date5i.length());
			
			waepaQ5iDateOfOnset.sendKeys(Date5i);
		}
		
		
		waepaQ5iIllnessOrInjury.sendKeys(Illness5i);
		waepaQ5iSymptoms.sendKeys(Symptoms5i);
		waepaQ5iDateOfTreatment.click();
		Thread.sleep(1000);
		waepaQ5iDateOfTreatment.clear();
		if(LastDate5i.contains("/"))
		{
			
			waepaQ5iDateOfTreatment.sendKeys(LastDate5i);
		}
		else
		{
			LastDate5i=LastDate5i.substring(0, 2)+"/"+LastDate5i.substring(2, LastDate5i.length());
			
			waepaQ5iDateOfTreatment.sendKeys(LastDate5i);
		}
		
		waepaQ5iNumberOfAttacks.sendKeys(Attacks5i);
		waepaQ5iTreatmentResult.sendKeys(Treatment5i);
		waepaQ5iNameAddress.sendKeys(NameAddress5i);
		
		
		log.info("Question FiveI selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveI || Fail"+e.getMessage());
		 throw(e);
	}
}

public boolean select_YES_for_Self_question_FiveJ_anemia_and_enter_details_as(String Date5j, String Illness5j, String Symptoms5j, String LastDate5j, String Attacks5j, String Treatment5j, String NameAddress5j) throws Exception{
	
	try {
		log.debug("Question FiveJ should be selected to user");
		waepaQ5jYes.click();
		Thread.sleep(1000);
		waepaQ5jDateOfOnset.click();
		Thread.sleep(1000);
		waepaQ5jDateOfOnset.clear();
		if(Date5j.contains("/"))
		{
			
			waepaQ5jDateOfOnset.sendKeys(Date5j);
		}
		else
		{
			Date5j=Date5j.substring(0, 2)+"/"+Date5j.substring(2, Date5j.length());
			
			waepaQ5jDateOfOnset.sendKeys(Date5j);
		}
		
		
		waepaQ5jIllnessOrInjury.sendKeys(Illness5j);
		waepaQ5jSymptoms.sendKeys(Symptoms5j);
		waepaQ5jDateOfTreatment.click();
		waepaQ5jDateOfTreatment.clear();
		Thread.sleep(1000);
		if(LastDate5j.contains("/"))
		{
			
			waepaQ5jDateOfTreatment.sendKeys(LastDate5j);
		}
		else
		{
			LastDate5j=LastDate5j.substring(0, 2)+"/"+LastDate5j.substring(2, LastDate5j.length());
			
			waepaQ5jDateOfTreatment.sendKeys(LastDate5j);
		}
		
		
		waepaQ5jNumberOfAttacks.sendKeys(Attacks5j);
		waepaQ5jTreatmentResult.sendKeys(Treatment5j);
		waepaQ5jNameAddress.sendKeys(NameAddress5j);
		
		
		log.info("Question FiveJ selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveJ || Fail"+e.getMessage());
		 throw(e);
	}
}


public boolean select_YES_for_Self_question_FiveK_cancer_and_enter_details_as(String Date5k, String Illness5k, String Symptoms5k, String LastDate5k, String Attacks5k, String Treatment5k, String NameAddress5k) throws Exception{
	
	try {
		log.debug("Question FiveJ should be selected to user");
		waepaQ5kYes.click();
		Thread.sleep(1000);
		waepaQ5kDateOfOnset.click();
		Thread.sleep(1000);
		waepaQ5kDateOfOnset.clear();
		if(Date5k.contains("/"))
		{
			
			waepaQ5kDateOfOnset.sendKeys(Date5k);
		}
		else
		{
			Date5k=Date5k.substring(0, 2)+"/"+Date5k.substring(2, Date5k.length());
			
			waepaQ5kDateOfOnset.sendKeys(Date5k);
		}
	
		waepaQ5kIllnessOrInjury.sendKeys(Illness5k);
		waepaQ5kSymptoms.sendKeys(Symptoms5k);
		waepaQ5kDateOfTreatment.click();
		Thread.sleep(1000);
		waepaQ5kDateOfTreatment.clear();
		if(LastDate5k.contains("/"))
		{
			
			waepaQ5kDateOfTreatment.sendKeys(LastDate5k);
		}
		else
		{
			LastDate5k=LastDate5k.substring(0, 2)+"/"+LastDate5k.substring(2, LastDate5k.length());
			
			waepaQ5kDateOfTreatment.sendKeys(LastDate5k);
		}
		
		waepaQ5kNumberOfAttacks.sendKeys(Attacks5k);
		waepaQ5kTreatmentResult.sendKeys(Treatment5k);
		waepaQ5kNameAddress.sendKeys(NameAddress5k);
		
		
		log.info("Question FiveK selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveK || Fail"+e.getMessage());
		 throw(e);
	}
}



public boolean select_YES_for_Self_question_FiveL_any_other_illness_and_enter_details_as(String Date5l, String Illness5l, String Symptoms5l, String LastDate5l, String Attacks5l, String Treatment5l, String NameAddress5l) throws Exception{
	
	try {
		log.debug("Question FiveL should be selected to user");
		waepaQ5lYes.click();
		Thread.sleep(1000);
		waepaQ5lDateOfOnset.click();
		Thread.sleep(1000);
		waepaQ5lDateOfOnset.clear();
		if(Date5l.contains("/"))
		{
			
			waepaQ5lDateOfOnset.sendKeys(Date5l);
		}
		else
		{
			Date5l=Date5l.substring(0, 2)+"/"+Date5l.substring(2, Date5l.length());
			
			waepaQ5lDateOfOnset.sendKeys(Date5l);
		}
		
		
		waepaQ5lIllnessOrInjury.sendKeys(Illness5l);
		waepaQ5lSymptoms.sendKeys(Symptoms5l);
		waepaQ5lDateOfTreatment.click();
		Thread.sleep(1000);
		waepaQ5lDateOfTreatment.clear();
		if(LastDate5l.contains("/"))
		{
			
			waepaQ5lDateOfTreatment.sendKeys(LastDate5l);
		}
		else
		{
			LastDate5l=LastDate5l.substring(0, 2)+"/"+LastDate5l.substring(2,  LastDate5l.length());
			
			waepaQ5lDateOfTreatment.sendKeys(LastDate5l);
		}
		
		
		waepaQ5lNumberOfAttacks.sendKeys(Attacks5l);
		waepaQ5lTreatmentResult.sendKeys(Treatment5l);
		waepaQ5lNameAddress.sendKeys(NameAddress5l);
		
		
		log.info("Question FiveL selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveL || Fail"+e.getMessage());
		 throw(e);
	}
}

public boolean select_YES_for_Self_question_SixA_alcoholic_and_enter_details_as(String Freq6a, String Wine6a, String Beer6a, String Liquor6a) throws Exception{
	
	try {
		log.debug("Question SixA should be selected to user");
			waepaQ6aYes.click();
			Thread.sleep(1000);
			reuseMethod.dropDown(waepaQ6aFrequency, Freq6a);	
			waepaQ6aWine.sendKeys(Wine6a);
			waepaQ6aBeer.sendKeys(Beer6a);
			waepaQ6aLiquor.sendKeys(Liquor6a);
				
		log.info("Question SixA selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question SixA || Fail"+e.getMessage());
		 throw(e);
	}
}


public boolean select_YES_for_Self_question_SixB_more_alcohol_and_enter_details_as(String Date6b, String Details6b) throws Exception{
	
	try {
		log.debug("Question SixB should be selected to user");
			waepaQ6bYes.click();
			Thread.sleep(1000);
			waepaQ6bPastAlcoholMonthYear.click();
			Thread.sleep(1000);
			waepaQ6bPastAlcoholMonthYear.clear();
			if(Date6b.contains("/"))
			{
				
				waepaQ6bPastAlcoholMonthYear.sendKeys(Date6b);
			}
			else
			{
				Date6b=Date6b.substring(0, 2)+"/"+Date6b.substring(2, Date6b.length());
				
				waepaQ6bPastAlcoholMonthYear.sendKeys(Date6b);
			}
			
			waepaQ6bPastAlcoholDetails.sendKeys(Details6b);
				
		log.info("Question SixB selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question SixB || Fail"+e.getMessage());
		 throw(e);
	}
}



public boolean select_YES_for_Self_question_SixC_sedatives_and_enter_details_as(String Date6c, String Freq6c, String Drug6c, String Details6c) throws Exception{
	
	try {
		log.debug("Question SixC should be selected to user");
			waepaQ6cYes.click();
			Thread.sleep(1000);
			waepaQ6cPastAlcoholMonthYear.click();
			waepaQ6cPastAlcoholMonthYear.clear();
			Thread.sleep(1000);
			if(Date6c.contains("/"))
			{
				
				waepaQ6cPastAlcoholMonthYear.sendKeys(Date6c);	
			}
			else
			{
				Date6c=Date6c.substring(0, 2)+"/"+Date6c.substring(2, Date6c.length());
				
				waepaQ6cPastAlcoholMonthYear.sendKeys(Date6c);	
			}
					
			waepaQ6cAlcoholFrequency.sendKeys(Freq6c);
			waepaQ6cAlcoholDrugs.sendKeys(Drug6c);
			waepaQ6cAlcoholDetails.sendKeys(Details6c);
				
		log.info("Question SixC selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question SixC || Fail"+e.getMessage());
		 throw(e);
	}
}



public boolean select_YES_for_Self_question_SixD_marijuana_and_enter_details_as(String Date6d, String Freq6d, String Drug6d, String Details6d) throws Exception{
	
	try {
		log.debug("Question SixD should be selected to user");
			waepaQ6dYes.click();
			Thread.sleep(1000);
			waepaQ6dPastAlcoholMonthYear.click();
			waepaQ6dPastAlcoholMonthYear.clear();
			Thread.sleep(1000);
			if(Date6d.contains("/"))
			{
				
				waepaQ6dPastAlcoholMonthYear.sendKeys(Date6d);
			}
			else
			{
				Date6d=Date6d.substring(0, 2)+"/"+Date6d.substring(2, Date6d.length());
				
				waepaQ6dPastAlcoholMonthYear.sendKeys(Date6d);
			}
		
			waepaQ6dAlcoholFrequency.sendKeys(Freq6d);
			waepaQ6dAlcoholDrugs.sendKeys(Drug6d);
			waepaQ6dAlcoholDetails.sendKeys(Details6d);
				
		log.info("Question SixD selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question SixD || Fail"+e.getMessage());
		 throw(e);
	}
}



public boolean select_YES_for_Self_question_SixE_nicotine_and_enter_details_as(String Date6e, String Product6e) throws Exception{
	
	try {
		log.debug("Question SixE should be selected to user");
			waepaQ6eYes.click();
			Thread.sleep(1000);
			waepaQ6eSmokerLastUsed.clear();
			waepaQ6eSmokerLastUsed.click();
			
			Thread.sleep(2000);
			
			if(Date6e.contains("/"))
			{
				
				waepaQ6eSmokerLastUsed.sendKeys(Date6e);
			}
			else
			{
				Date6e=Date6e.substring(0, 2)+"/"+Date6e.substring(2, 4)+"/"+Date6e.substring(4, Date6e.length());
				
				waepaQ6eSmokerLastUsed.sendKeys(Date6e);	
			}
			
			Thread.sleep(2000);
			waepaQ6eSmokerPickListSlf.sendKeys(Product6e);			
			//waepaQ6eProduct_CIGAR_Self.sendKeys(Product6e);
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1000);
			action.sendKeys(Keys.TAB).build().perform();						
			//reuseMethod.Select_value_by_Up_Down_arrow();
				
		log.info("Question SixE selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question SixE || Fail"+e.getMessage());
		 throw(e);
	}
}


public boolean select_YES_for_Self_question_SixF_physician_and_enter_details_as(String Date6f, String Details6f, String NameAddress6f) throws Exception{
	
	try {
		log.debug("Question SixF should be selected to user");
			waepaQ6fYes.click();
			Thread.sleep(1000);
			waepaQ6fAlcoholDate.clear();
			waepaQ6fAlcoholDate.click();
			
			Thread.sleep(2000);
			
			if(Date6f.contains("/"))
			{
				
				waepaQ6fAlcoholDate.sendKeys(Date6f);
			}
			else
			{
				Date6f=Date6f.substring(0, 2)+"/"+Date6f.substring(2, Date6f.length());
				
				waepaQ6fAlcoholDate.sendKeys(Date6f);	
			}
			
			
			waepaQ6fDetails.sendKeys(Details6f);
			waepaQ6fNameAddress.sendKeys(NameAddress6f);
				
		log.info("Question SixF selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question SixF || Fail"+e.getMessage());
		 throw(e);
	}
}


public boolean select_YES_for_Self_question_seven_eight_and_enter_details_as(String Details7a, String Date7b, String Details7b, String Family8a, String Age8a, String Status8a, String Condition8a) throws Exception{
	
	try {
		log.debug("Question Seven and Eight should be selected to user");
		waepaQ7aYes.click();
		Thread.sleep(1000);
		waepaQ7aDetails.sendKeys(Details7a);
		
		waepaQ7bYes.click();
		Thread.sleep(1000);
		waepaQ7bCrimeDate.click();
		Thread.sleep(1000);
		waepaQ7bCrimeDate.clear();
		if(Date7b.contains("/"))
		{
			
			waepaQ7bCrimeDate.sendKeys(Date7b);
		}
		else
		{
			Date7b=Date7b.substring(0, 2)+"/"+Date7b.substring(2,Date7b.length());
			
			waepaQ7bCrimeDate.sendKeys(Date7b);
		}
		
		waepaQ7bCrimeDetails.sendKeys(Details7b);
		waepaQ8aYes.click();	
		Thread.sleep(1000);
		reuseMethod.dropDown(waepaQ8aFamilyMember, Family8a);
		waepaQ8aAgeOfOnset.sendKeys(Age8a);
		reuseMethod.dropDown(waepaQ8alifeStatus, Status8a);
		waepaQ8aMedicalCondition.sendKeys(Condition8a);
		
		log.info("Question Seven and Eight selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question Seven and Eight || Fail"+e.getMessage());
		 throw(e);
	}
}

public boolean select_NO_for_QuestionSevenB_for_Self_Convicted_of_a_crime_in_Last_Five_Years() throws Exception{
	
	try {
		log.debug("Select NO for QuestionSevenB for Self-Convicted of a crime in Last Five Years");
		Thread.sleep(3000);	
		reuseMethod.scrollDown(waepaQ7bNo);
		waepaQ7bNo.click();				
		log.info("NO for QuestionSevenB for Self-Convicted of a crime in Last Five Years is selected succesfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select NO for QuestionSevenB for Self-Convicted of a crime in Last Five Years || Fail"+e.getMessage());
		 throw(e);
	}
}



//WAEPA Health History question for Spouse



public boolean select_YES_for_Spouse_question_one_two_and_enter_details_as(String Amount1a, String WeightReason1a, String Details2a, String Details2b) throws Exception{
	
	try {
		log.debug("Question One and Two should be selected to user");
		
		waepaQ1aYes_Spouse.click();
		waepaQ1aAmount_Spouse.sendKeys(Amount1a);
		waepaQ1aReason_Spouse.sendKeys(WeightReason1a);
		waepaQ2aYes_Spouse.click();
		waepaQ2aDetails_Spouse.sendKeys(Details2a);
		waepaQ2bYes_Spouse.click();
		waepaQ2bDetails_Spouse.sendKeys(Details2b);
		
		log.info("Question One and Two selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question One and Two || Fail"+e.getMessage());
		 throw(e);
	}
	
}

public boolean select_YES_for_Spouse_question_three_and_enter_details_as(String Date3a, String Treatment3a, String NameAddress3a, String Medicine3b, String Dosage3b, String Freq3b, String NameAddress3b, String Duedate3c, String Details3d) throws Exception{
	
	try {
		log.debug("Question Three should be selected to user");
		
		waepaQ3aYes_Spouse.click();
		Thread.sleep(1000);
		waepaQ3aDate_Spouse.click();
		Thread.sleep(1000);
		waepaQ3aDate_Spouse.clear();
		if(Date3a.contains("/"))
		{
		waepaQ3aDate_Spouse.sendKeys(Date3a);
	}
	else
	{
		Date3a=Date3a.substring(0, 2)+"/"+Date3a.substring(2, Date3a.length());
		waepaQ3aDate_Spouse.sendKeys(Date3a);
	}
		waepaQ3aTreatment_Spouse.sendKeys(Treatment3a);
		waepaQ3aNameAddress_Spouse.sendKeys(NameAddress3a);
		waepaQ3bYes_Spouse.click();
		waepaQ3bMedication_Spouse.sendKeys(Medicine3b);
		waepaQ3bDosage_Spouse.sendKeys(Dosage3b);
		waepaQ3bFrequency_Spouse.sendKeys(Freq3b);
		waepaQ3bNameAddress_Spouse.sendKeys(NameAddress3b);
		waepaQ3cYes_Spouse.click();
		Thread.sleep(1000);
		waepaQ3cExpectedDate_Spouse.clear();
		waepaQ3cExpectedDate_Spouse.click();
		
		Thread.sleep(2000);
		
		if(Duedate3c.contains("/"))
		{
			
			waepaQ3cExpectedDate_Spouse.sendKeys(Duedate3c);
		}
		else
		{
			Duedate3c=Duedate3c.substring(0, 2)+"/"+Duedate3c.substring(2,4)+"/"+Duedate3c.substring(4, Duedate3c.length());
			waepaQ3cExpectedDate_Spouse.sendKeys(Duedate3c);
		}
		
		waepaQ3dYes_Spouse.click();
		Thread.sleep(1000);
		waepaQ3dDetails_Spouse.sendKeys(Details3d);
		
		log.info("Question Three selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question Three || Fail"+e.getMessage());
		 throw(e);
	}
	
}

public boolean select_YES_for_Spouse_question_Four_as (String Physician4a,String Address4a,String Date4b,String Reason4b,String Result4c,String EKG4d,String Details4d) throws Exception{
	
	try {
		log.debug("Question Four should be selected to user");
		waepaPhyName_Spouse.sendKeys(Physician4a);
		waepaPhyAddress_Spouse.sendKeys(Address4a);
		waepaDate_Spouse.clear();
		waepaDate_Spouse.click();
		Thread.sleep(1000);
		
		if(Date4b.contains("/"))
		{
			
			waepaDate_Spouse.sendKeys(Date4b);
		}
		else
		{
			Date4b=Date4b.substring(0, 2)+"/"+Date4b.substring(2, Date4b.length());
			
			waepaDate_Spouse.sendKeys(Date4b);
		}
	

		waepaReason_Spouse.sendKeys(Reason4b);
		waepaPhyDiagTreatSps_Spouse.sendKeys(Result4c);
		if(EKG4d.equalsIgnoreCase("Yes"))
		{
			
			waepaQ4dYes_Spouse.click();
		}
		else{
			waepaQ4dNo_Spouse.click();
		}		
		waepaQ4dEKG_Spouse.sendKeys(Details4d);
		reuseMethod.scrollDown(next);
		
		
		log.info("Question Four selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question Four || Fail"+e.getMessage());
		 throw(e);
	}
	
}

public boolean select_YES_for_Spouse_question_FiveA_blood_pressure_and_enter_details_as(String Date5a, String Illness5a, String Symptoms5a, String LastDate5a, String Attacks5a, String Treatment5a, String NameAddress5a) throws Exception{
	
	try {
		log.debug("Question FiveA should be selected to user");
		waepaQ5aYes_Spouse.click();
		Thread.sleep(1000);
		waepaQ5aDateOfOnset_Spouse.click();
		waepaQ5aDateOfOnset_Spouse.clear();
		Thread.sleep(1000);
		if(Date5a.contains("/"))
		{
			
			waepaQ5aDateOfOnset_Spouse.sendKeys(Date5a);
		}
		else
		{
			Date5a=Date5a.substring(0, 2)+"/"+Date5a.substring(2, Date5a.length());
			
			waepaQ5aDateOfOnset_Spouse.sendKeys(Date5a);
		}
	
		
		waepaQ5aIllnessOrInjury_Spouse.sendKeys(Illness5a);
		waepaQ5aSymptoms_Spouse.sendKeys(Symptoms5a);
		waepaQ5aDateOfTreatment_Spouse.click();
		Thread.sleep(1000);
		waepaQ5aDateOfTreatment_Spouse.clear();
		if(LastDate5a.contains("/"))
		{
			
			waepaQ5aDateOfTreatment_Spouse.sendKeys(LastDate5a);
		}
		else
		{
			LastDate5a=LastDate5a.substring(0, 2)+"/"+Date5a.substring(2, Date5a.length());
			
			waepaQ5aDateOfTreatment_Spouse.sendKeys(LastDate5a);
		}
		
		waepaQ5aNumberOfAttacks_Spouse.sendKeys(Attacks5a);
		waepaQ5aTreatmentResult_Spouse.click();
		waepaQ5aTreatmentResult_Spouse.sendKeys(Treatment5a);
		waepaQ5aNameAddress_Spouse.sendKeys(NameAddress5a);
		
		log.info("Question FiveA selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveA || Fail"+e.getMessage());
		 throw(e);
	}
	
}


public boolean select_YES_for_Spouse_question_FiveB_ulcer_and_enter_details_as(String Date5b, String Illness5b, String Symptoms5b, String LastDate5b, String Attacks5b, String Treatment5b, String NameAddress5b) throws Exception{
	
	
	try {
		log.debug("Question FiveB should be selected to user");
		waepaQ5bYes_Spouse.click();
		Thread.sleep(1000);
		waepaQ5bDateOfOnset_Spouse.click();
		waepaQ5bDateOfOnset_Spouse.clear();
		Thread.sleep(1000);
		if(Date5b.contains("/"))
		{
			
			waepaQ5bDateOfOnset_Spouse.sendKeys(Date5b);
		}
		else
		{
			Date5b=Date5b.substring(0, 2)+"/"+Date5b.substring(2, Date5b.length());
			
			waepaQ5bDateOfOnset_Spouse.sendKeys(Date5b);
		}
		
		waepaQ5bIllnessOrInjury_Spouse.sendKeys(Illness5b);
		waepaQ5bSymptoms_Spouse.sendKeys(Symptoms5b);
		waepaQ5bDateOfTreatment_Spouse.click();
		Thread.sleep(1000);
		waepaQ5bDateOfTreatment_Spouse.clear();
		if(LastDate5b.contains("/"))
		{
			
			waepaQ5bDateOfTreatment_Spouse.sendKeys(LastDate5b);
		}
		else
		{
			LastDate5b=LastDate5b.substring(0, 2)+"/"+LastDate5b.substring(2, LastDate5b.length());
			
			waepaQ5bDateOfTreatment_Spouse.sendKeys(LastDate5b);
		}
		
		waepaQ5bNumberOfAttacks_Spouse.sendKeys(Attacks5b);
		waepaQ5bTreatmentResult_Spouse.click();
		waepaQ5bTreatmentResult_Spouse.sendKeys(Treatment5b);
		waepaQ5bNameAddress_Spouse.sendKeys(NameAddress5b);
		
		log.info("Question FiveA selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveA || Fail"+e.getMessage());
		 throw(e);
	}
	
}

public boolean select_YES_for_Spouse_question_FiveC_asthma_and_enter_details_as(String Date, String Illness5c, String Symptoms5c, String LastDate5c, String Attacks5c, String Treatment5c, String NameAddress5c) throws Exception{
	
	try {
		log.debug("Question FiveC should be selected to user");
		waepaQ5cYes_Spouse.click();
		Thread.sleep(1000);
		waepaQ5cDateOfOnset_Spouse.click();
		waepaQ5cDateOfOnset_Spouse.clear();
		Thread.sleep(1000);
		if(Date.contains("/"))
		{
			
			waepaQ5cDateOfOnset_Spouse.sendKeys(Date);
		}
		else
		{
			Date=Date.substring(0, 2)+"/"+Date.substring(2, Date.length());
			
			waepaQ5cDateOfOnset_Spouse.sendKeys(Date);
		}
		
		
		waepaQ5cIllnessOrInjury_Spouse.sendKeys(Illness5c);
		waepaQ5cSymptoms_Spouse.sendKeys(Symptoms5c);
		waepaQ5cDateOfTreatment_Spouse.click();
		waepaQ5cDateOfTreatment_Spouse.clear();
		Thread.sleep(1000);
		if(LastDate5c.contains("/"))
		{
			
			waepaQ5cDateOfTreatment_Spouse.sendKeys(LastDate5c);
		}
		else
		{
			LastDate5c=LastDate5c.substring(0, 2)+"/"+LastDate5c.substring(2,LastDate5c.length());
			
			waepaQ5cDateOfTreatment_Spouse.sendKeys(LastDate5c);
		}
		
		waepaQ5cNumberOfAttacks_Spouse.sendKeys(Attacks5c);
		waepaQ5cTreatmentResult_Spouse.click();
		waepaQ5cTreatmentResult_Spouse.sendKeys(Treatment5c);
		waepaQ5cNameAddress_Spouse.sendKeys(NameAddress5c);
		
		log.info("Question FiveC selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveC || Fail"+e.getMessage());
		 throw(e);
	}
	
}

public boolean select_YES_for_Spouse_question_FiveD_venereal_disease_and_enter_details_as(String Date, String Illness5d, String Symptoms5d, String LastDate5d, String Attacks5d, String Treatment5d, String NameAddress5d) throws Exception{
	
	try {
		log.debug("Question FiveD should be selected to user");
		waepaQ5dYes_Spouse.click();
		Thread.sleep(1000);
		waepaQ5dDateOfOnset_Spouse.click();
		waepaQ5dDateOfOnset_Spouse.clear();
		Thread.sleep(1000);
		if(Date.contains("/"))
		{
			
			waepaQ5dDateOfOnset_Spouse.sendKeys(Date);
		}
		else
		{
			Date=Date.substring(0, 2)+"/"+Date.substring(2, Date.length());
			
			waepaQ5dDateOfOnset_Spouse.sendKeys(Date);
		}
	
		waepaQ5dIllnessOrInjury_Spouse.sendKeys(Illness5d);
		waepaQ5dSymptoms_Spouse.sendKeys(Symptoms5d);
		waepaQ5dDateOfTreatment_Spouse.click();
		waepaQ5dDateOfTreatment_Spouse.clear();
		Thread.sleep(1000);
		if(LastDate5d.contains("/"))
		{
			
			waepaQ5dDateOfTreatment_Spouse.sendKeys(LastDate5d);
		}
		else
		{
			LastDate5d=LastDate5d.substring(0, 2)+"/"+LastDate5d.substring(2, LastDate5d.length());
			
			waepaQ5dDateOfTreatment_Spouse.sendKeys(LastDate5d);
		}
		
		waepaQ5dNumberOfAttacks_Spouse.sendKeys(Attacks5d);
		
		waepaQ5dTreatmentResult_Spouse.sendKeys(Treatment5d);
		waepaQ5dNameAddress_Spouse.sendKeys(NameAddress5d);
		
		
		log.info("Question FiveD selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveD || Fail"+e.getMessage());
		 throw(e);
	}
	
}


public boolean select_YES_for_Spouse_question_FiveE_fibrositis_and_enter_details_as(String Date, String Illness5e, String Symptoms5e, String LastDate5e, String Attacks5e, String Treatment5e, String NameAddress5e) throws Exception{
	
	try {
		log.debug("Question FiveE should be selected to user");
		waepaQ5eYes_Spouse.click();
		Thread.sleep(1000);
		waepaQ5eDateOfOnset_Spouse.click();
		waepaQ5eDateOfOnset_Spouse.clear();
		Thread.sleep(1000);
		if(Date.contains("/"))
		{
			
			waepaQ5eDateOfOnset_Spouse.sendKeys(Date);
		}
		else
		{
			Date=Date.substring(0, 2)+"/"+Date.substring(2,  Date.length());
			
			waepaQ5eDateOfOnset_Spouse.sendKeys(Date);
		}

		waepaQ5eIllnessOrInjury_Spouse.sendKeys(Illness5e);
		waepaQ5eSymptoms_Spouse.sendKeys(Symptoms5e);
		waepaQ5eDateOfTreatment_Spouse.click();
		Thread.sleep(1000);
		waepaQ5eDateOfTreatment_Spouse.clear();
		if(LastDate5e.contains("/"))
		{
			
			waepaQ5eDateOfTreatment_Spouse.sendKeys(LastDate5e);
		}
		else
		{
			LastDate5e=LastDate5e.substring(0, 2)+"/"+LastDate5e.substring(2, LastDate5e.length());
			
			waepaQ5eDateOfTreatment_Spouse.sendKeys(LastDate5e);
		}

		
		waepaQ5eNumberOfAttacks_Spouse.sendKeys(Attacks5e);
		
		waepaQ5eTreatmentResult_Spouse.sendKeys(Treatment5e);
		waepaQ5eNameAddress_Spouse.sendKeys(NameAddress5e);
		
		
		log.info("Question FiveE selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveE || Fail"+e.getMessage());
		 throw(e);
	}
	
}


public boolean select_YES_for_Spouse_question_FiveF_convulsions_and_enter_details_as(String Date, String Illness5f, String Symptoms5f, String LastDate5f, String Attacks5f, String Treatment5f, String NameAddress5f) throws Exception{
	
	try {
		log.debug("Question FiveF should be selected to user");
		waepaQ5fYes_Spouse.click();
		Thread.sleep(1000);
		waepaQ5fDateOfOnset_Spouse.click();
		waepaQ5fDateOfOnset_Spouse.clear();
		Thread.sleep(1000);
		if(Date.contains("/"))
		{
			
			waepaQ5fDateOfOnset_Spouse.sendKeys(Date);
		}
		else
		{
			Date=Date.substring(0, 2)+"/"+Date.substring(2, Date.length());
			
			waepaQ5fDateOfOnset_Spouse.sendKeys(Date);
		}
		
		waepaQ5fIllnessOrInjury_Spouse.sendKeys(Illness5f);
		waepaQ5fSymptoms_Spouse.sendKeys(Symptoms5f);
		waepaQ5fDateOfTreatment_Spouse.click();
		waepaQ5fDateOfTreatment_Spouse.clear();
		Thread.sleep(1000);
		
		if(LastDate5f.contains("/"))
		{
			
			waepaQ5fDateOfTreatment_Spouse.sendKeys(LastDate5f);
		}
		else
		{
			LastDate5f=LastDate5f.substring(0, 2)+"/"+LastDate5f.substring(2, LastDate5f.length());
			
			waepaQ5fDateOfTreatment_Spouse.sendKeys(LastDate5f);
		}
		waepaQ5fNumberOfAttacks_Spouse.sendKeys(Attacks5f);
	
		waepaQ5fTreatmentResult_Spouse.sendKeys(Treatment5f);
		waepaQ5fNameAddress_Spouse.sendKeys(NameAddress5f);
		
		
		log.info("Question FiveF selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveF || Fail"+e.getMessage());
		 throw(e);
	}
}



public boolean select_YES_for_Spouse_question_FiveG_stress_and_enter_details_as(String Date, String Illness5g, String Symptoms5g, String LastDate5g, String Attacks5g, String Treatment5g, String NameAddress5g) throws Exception{
	
	try {
		log.debug("Question FiveG should be selected to user");
		waepaQ5gYes_Spouse.click();
		Thread.sleep(1000);
		waepaQ5gDateOfOnset_Spouse.click();
		Thread.sleep(1000);
		waepaQ5gDateOfOnset_Spouse.clear();
		if(Date.contains("/"))
		{
			
			waepaQ5gDateOfOnset_Spouse.sendKeys(Date);
		}
		else
		{
			Date=Date.substring(0, 2)+"/"+Date.substring(2, Date.length());
			
			waepaQ5gDateOfOnset_Spouse.sendKeys(Date);
		}
		
		waepaQ5gIllnessOrInjury_Spouse.sendKeys(Illness5g);
		waepaQ5gSymptoms_Spouse.sendKeys(Symptoms5g);
		waepaQ5gDateOfTreatment_Spouse.click();
		Thread.sleep(1000);
		waepaQ5gDateOfTreatment_Spouse.clear();
		if(LastDate5g.contains("/"))
		{
			
			waepaQ5gDateOfTreatment_Spouse.sendKeys(LastDate5g);
		}
		else
		{
			LastDate5g=LastDate5g.substring(0, 2)+"/"+LastDate5g.substring(2,LastDate5g.length());
			
			waepaQ5gDateOfTreatment_Spouse.sendKeys(LastDate5g);
		}
		
		waepaQ5gNumberOfAttacks_Spouse.sendKeys(Attacks5g);
		
		waepaQ5gTreatmentResult_Spouse.sendKeys(Treatment5g);
		waepaQ5gNameAddress_Spouse.sendKeys(NameAddress5g);
		
		
		log.info("Question FiveG selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveG || Fail"+e.getMessage());
		 throw(e);
	}
}



public boolean select_YES_for_Spouse_question_FiveH_diabetes_and_enter_details_as(String Date, String Illness5h, String Symptoms5h, String LastDate5h, String Attacks5h, String Treatment5h, String NameAddress5h) throws Exception{
	
	try {
		log.debug("Question FiveH should be selected to user");
		waepaQ5hYes_Spouse.click();
		Thread.sleep(1000);
		waepaQ5hDateOfOnset_Spouse.click();
		waepaQ5hDateOfOnset_Spouse.clear();
		Thread.sleep(1000);
		if(Date.contains("/"))
		{
			
			waepaQ5hDateOfOnset_Spouse.sendKeys(Date);
		}
		else
		{
			Date=Date.substring(0, 2)+"/"+Date.substring(2, Date.length());
			
			waepaQ5hDateOfOnset_Spouse.sendKeys(Date);
		}
		
		waepaQ5hIllnessOrInjury_Spouse.sendKeys(Illness5h);
		waepaQ5hSymptoms_Spouse.sendKeys(Symptoms5h);
		waepaQ5hDateOfTreatment_Spouse.click();
		waepaQ5hDateOfTreatment_Spouse.clear();
		Thread.sleep(1000);
		if(LastDate5h.contains("/"))
		{
			
			waepaQ5hDateOfTreatment_Spouse.sendKeys(LastDate5h);
		}
		else
		{
			LastDate5h=LastDate5h.substring(0, 2)+"/"+LastDate5h.substring(2, LastDate5h.length());
			
			waepaQ5hDateOfTreatment_Spouse.sendKeys(LastDate5h);
		}
		
		waepaQ5hNumberOfAttacks_Spouse.sendKeys(Attacks5h);
		waepaQ5hTreatmentResult_Spouse.click();
		waepaQ5hTreatmentResult_Spouse.sendKeys(Treatment5h);
		waepaQ5hNameAddress_Spouse.sendKeys(NameAddress5h);
		Thread.sleep(1000);
		
		log.info("Question FiveH selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveH || Fail"+e.getMessage());
		 throw(e);
	}
}


public boolean select_YES_for_Spouse_question_FiveI_any_disease_and_enter_details_as(String Date, String Illness5i, String Symptoms5i, String LastDate5i, String Attacks5i, String Treatment5i, String NameAddress5i) throws Exception{
	
	try {
		log.debug("Question FiveI should be selected to user");
		waepaQ5iYes_Spouse.click();
		Thread.sleep(1000);
		waepaQ5iDateOfOnset_Spouse.click();
		waepaQ5iDateOfOnset_Spouse.clear();
		Thread.sleep(1000);
		if(Date.contains("/"))
		{
			
			waepaQ5iDateOfOnset_Spouse.sendKeys(Date);
		}
		else
		{
			Date=Date.substring(0, 2)+"/"+Date.substring(2, Date.length());
			
			waepaQ5iDateOfOnset_Spouse.sendKeys(Date);
		}
		
		waepaQ5iIllnessOrInjury_Spouse.sendKeys(Illness5i);
		waepaQ5iSymptoms_Spouse.sendKeys(Symptoms5i);
		waepaQ5iDateOfTreatment_Spouse.click();
		Thread.sleep(1000);
		waepaQ5iDateOfTreatment_Spouse.clear();
		if(LastDate5i.contains("/"))
		{
			
			waepaQ5iDateOfTreatment_Spouse.sendKeys(LastDate5i);
		}
		else
		{
			LastDate5i=LastDate5i.substring(0, 2)+"/"+LastDate5i.substring(2, LastDate5i.length());
			
			waepaQ5iDateOfTreatment_Spouse.sendKeys(LastDate5i);
		}
		
		waepaQ5iNumberOfAttacks_Spouse.sendKeys(Attacks5i);
		
		waepaQ5iTreatmentResult_Spouse.sendKeys(Treatment5i);
		waepaQ5iNameAddress_Spouse.sendKeys(NameAddress5i);
		Thread.sleep(1000);
		
		log.info("Question FiveI selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveI || Fail"+e.getMessage());
		 throw(e);
	}
}

public boolean select_YES_for_Spouse_question_FiveJ_anemia_and_enter_details_as(String Date, String Illness5j, String Symptoms5j, String LastDate5j, String Attacks5j, String Treatment5j, String NameAddress5j) throws Exception{
	
	try {
		log.debug("Question FiveJ should be selected to user");
		waepaQ5jYes_Spouse.click();
		Thread.sleep(1000);
		waepaQ5jDateOfOnset_Spouse.click();
		Thread.sleep(1000);
		waepaQ5jDateOfOnset_Spouse.clear();
		if(Date.contains("/"))
		{
			
			waepaQ5jDateOfOnset_Spouse.sendKeys(Date);
		}
		else
		{
			Date=Date.substring(0, 2)+"/"+Date.substring(2, Date.length());
			
			waepaQ5jDateOfOnset_Spouse.sendKeys(Date);
		}
		
		waepaQ5jIllnessOrInjury_Spouse.sendKeys(Illness5j);
		waepaQ5jSymptoms_Spouse.sendKeys(Symptoms5j);
		
		waepaQ5jDateOfTreatment_Spouse.click();
		Thread.sleep(1000);
		waepaQ5jDateOfTreatment_Spouse.clear();
		if(LastDate5j.contains("/"))
		{
			
			waepaQ5jDateOfTreatment_Spouse.sendKeys(LastDate5j);
		}
		else
		{
			LastDate5j=LastDate5j.substring(0, 2)+"/"+LastDate5j.substring(2, LastDate5j.length());
			
			waepaQ5jDateOfTreatment_Spouse.sendKeys(LastDate5j);
		}
		
		waepaQ5jNumberOfAttacks_Spouse.sendKeys(Attacks5j);
		waepaQ5jTreatmentResult_Spouse.click();
		waepaQ5jTreatmentResult_Spouse.sendKeys(Treatment5j);
		waepaQ5jNameAddress_Spouse.sendKeys(NameAddress5j);
		Thread.sleep(1000);
		
		log.info("Question FiveJ selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveJ || Fail"+e.getMessage());
		 throw(e);
	}
}


public boolean select_YES_for_Spouse_question_FiveK_cancer_and_enter_details_as(String Date, String Illness5k, String Symptoms5k, String LastDate5k, String Attacks5k, String Treatment5k, String NameAddress5k) throws Exception{
	
	try {
		log.debug("Question FiveJ should be selected to user");
		waepaQ5kYes_Spouse.click();
		Thread.sleep(1000);
		waepaQ5kDateOfOnset_Spouse.click();
		Thread.sleep(1000);
		waepaQ5kDateOfOnset_Spouse.clear();
		if(Date.contains("/"))
		{
			
			waepaQ5kDateOfOnset_Spouse.sendKeys(Date);
		}
		else
		{
			Date=Date.substring(0, 2)+"/"+Date.substring(2, Date.length());
			
			waepaQ5kDateOfOnset_Spouse.sendKeys(Date);
		}
		
		waepaQ5kIllnessOrInjury_Spouse.sendKeys(Illness5k);
		waepaQ5kSymptoms_Spouse.sendKeys(Symptoms5k);
		waepaQ5kDateOfTreatment_Spouse.click();
		Thread.sleep(1000);
		waepaQ5kDateOfTreatment_Spouse.clear();
		if(LastDate5k.contains("/"))
		{
			
			waepaQ5kDateOfTreatment_Spouse.sendKeys(LastDate5k);
		}
		else
		{
			LastDate5k=LastDate5k.substring(0, 2)+"/"+LastDate5k.substring(2, LastDate5k.length());
			
			waepaQ5kDateOfTreatment_Spouse.sendKeys(LastDate5k);
		}
		
		waepaQ5kNumberOfAttacks_Spouse.sendKeys(Attacks5k);
		waepaQ5kTreatmentResult_Spouse.sendKeys(Treatment5k);
		waepaQ5kNameAddress_Spouse.sendKeys(NameAddress5k);
		Thread.sleep(1000);
		
		log.info("Question FiveK selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveK || Fail"+e.getMessage());
		 throw(e);
	}
}



public boolean select_YES_for_Spouse_question_FiveL_any_other_illness_and_enter_details_as(String Date, String Illness5l, String Symptoms5l, String LastDate5l, String Attacks5l, String Treatment5l, String NameAddress5l) throws Exception{
	
	try {
		log.debug("Question FiveL should be selected to user");
		waepaQ5lYes_Spouse.click();
		Thread.sleep(1000);
		waepaQ5lDateOfOnset_Spouse.click();
		Thread.sleep(1000);
		waepaQ5lDateOfOnset_Spouse.clear();
		if(Date.contains("/"))
		{
			
			waepaQ5lDateOfOnset_Spouse.sendKeys(Date);
		}
		else
		{
			Date=Date.substring(0, 2)+"/"+Date.substring(2, Date.length());
			
			waepaQ5lDateOfOnset_Spouse.sendKeys(Date);
		}
	
		waepaQ5lIllnessOrInjury_Spouse.sendKeys(Illness5l);
		waepaQ5lSymptoms_Spouse.sendKeys(Symptoms5l);
		waepaQ5lDateOfTreatment_Spouse.click();
		Thread.sleep(1000);
		waepaQ5lDateOfTreatment_Spouse.clear();
		if(LastDate5l.contains("/"))
		{
			
			waepaQ5lDateOfTreatment_Spouse.sendKeys(LastDate5l);
		}
		else
		{
			LastDate5l=LastDate5l.substring(0, 2)+"/"+LastDate5l.substring(2, LastDate5l.length());
			
			waepaQ5lDateOfTreatment_Spouse.sendKeys(LastDate5l);
		}
		
		waepaQ5lNumberOfAttacks_Spouse.sendKeys(Attacks5l);
		waepaQ5lTreatmentResult_Spouse.sendKeys(Treatment5l);
		waepaQ5lNameAddress_Spouse.sendKeys(NameAddress5l);
		Thread.sleep(1000);
		
		log.info("Question FiveL selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question FiveL || Fail"+e.getMessage());
		 throw(e);
	}
}

public boolean select_YES_for_Spouse_question_SixA_alcoholic_and_enter_details_as(String Freq6a, String Wine6a, String Beer6a, String Liquor6a) throws Exception{
	
	try {
		log.debug("Question SixA should be selected to user");
			waepaQ6aYes_Spouse.click();
			Thread.sleep(1000);
			reuseMethod.dropDown(waepaQ6aFrequency_Spouse, Freq6a);	
			waepaQ6aWine_Spouse.sendKeys(Wine6a);
			waepaQ6aBeer_Spouse.sendKeys(Beer6a);
			waepaQ6aLiquor_Spouse.sendKeys(Liquor6a);
				
		log.info("Question SixA selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question SixA || Fail"+e.getMessage());
		 throw(e);
	}
}


public boolean select_YES_for_Spouse_question_SixB_more_alcohol_and_enter_details_as(String Date6b, String Details6b) throws Exception{
	
	try {
		log.debug("Question SixB should be selected to user");
			waepaQ6bYes_Spouse.click();
			Thread.sleep(1000);
			waepaQ6bPastAlcoholMonthYear_Spouse.click();
			Thread.sleep(1000);
			waepaQ6bPastAlcoholMonthYear_Spouse.clear();
			if(Date6b.contains("/"))
			{
				
				waepaQ6bPastAlcoholMonthYear_Spouse.sendKeys(Date6b);
			}
			else
			{
				Date6b=Date6b.substring(0, 2)+"/"+Date6b.substring(2, Date6b.length());
				
				waepaQ6bPastAlcoholMonthYear_Spouse.sendKeys(Date6b);
			}
			
			waepaQ6bPastAlcoholDetails_Spouse.sendKeys(Details6b);
				
		log.info("Question SixB selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question SixB || Fail"+e.getMessage());
		 throw(e);
	}
}



public boolean select_YES_for_Spouse_question_SixC_sedatives_and_enter_details_as(String Date6c, String Freq6c, String Drug6c, String Details6c) throws Exception{
	
	try {
		log.debug("Question SixC should be selected to user");
			waepaQ6cYes_Spouse.click();
			waepaQ6cPastAlcoholMonthYear_Spouse.click();
			Thread.sleep(1000);
			waepaQ6cPastAlcoholMonthYear_Spouse.clear();
			if(Date6c.contains("/"))
			{
				
				waepaQ6cPastAlcoholMonthYear_Spouse.sendKeys(Date6c);
			}
			else
			{
				Date6c=Date6c.substring(0, 2)+"/"+Date6c.substring(2, Date6c.length());
				
				waepaQ6cPastAlcoholMonthYear_Spouse.sendKeys(Date6c);	
			}
					
			waepaQ6cAlcoholFrequency_Spouse.sendKeys(Freq6c);
			waepaQ6cAlcoholDrugs_Spouse.sendKeys(Drug6c);
			waepaQ6cAlcoholDetails_Spouse.sendKeys(Details6c);
				
		log.info("Question SixC selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question SixC || Fail"+e.getMessage());
		 throw(e);
	}
}



public boolean select_YES_for_Spouse_question_SixD_marijuana_and_enter_details_as(String Date6d, String Freq6d, String Drug6d, String Details6d) throws Exception{
	
	try {
		log.debug("Question SixD should be selected to user");
			waepaQ6dYes_Spouse.click();
			waepaQ6dPastAlcoholMonthYear_Spouse.click();
			Thread.sleep(1000);
			waepaQ6dPastAlcoholMonthYear_Spouse.clear();
			if(Date6d.contains("/"))
			{
				
				waepaQ6dPastAlcoholMonthYear_Spouse.sendKeys(Date6d);
			}
			else
			{
				Date6d=Date6d.substring(0, 2)+"/"+Date6d.substring(2, Date6d.length());
				
				waepaQ6dPastAlcoholMonthYear_Spouse.sendKeys(Date6d);	
			}
			
			waepaQ6dAlcoholFrequency_Spouse.sendKeys(Freq6d);
			waepaQ6dAlcoholDrugs_Spouse.sendKeys(Drug6d);
			waepaQ6dAlcoholDetails_Spouse.sendKeys(Details6d);
				
		log.info("Question SixD selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question SixD || Fail"+e.getMessage());
		 throw(e);
	}
}



public boolean select_YES_for_Spouse_question_SixE_nicotine_and_enter_details_as(String Date6e, String Product6e) throws Exception{
	
	try {
		log.debug("Question SixE should be selected to user");
			waepaQ6eYes_Spouse.click();
			Thread.sleep(1000);
			waepaQ6eSmokerLastUsed_Spouse.clear();
			Thread.sleep(1000);
			waepaQ6eSmokerLastUsed_Spouse.click();
			Thread.sleep(1000);
			
			if(Date6e.contains("/"))
			{
				
				waepaQ6eSmokerLastUsed_Spouse.sendKeys(Date6e);
			}
			else
			{
				Date6e=Date6e.substring(0, 2)+"/"+Date6e.substring(2, 4)+"/"+Date6e.substring(4, Date6e.length());
				
				waepaQ6eSmokerLastUsed_Spouse.sendKeys(Date6e);
			}
			
			waepaQ6dAlcoholDetails_Spouse.click();
			waepaQ6eSmokerPickListSlf_Spouse.sendKeys(Product6e);
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1000);
			action.sendKeys(Keys.TAB).build().perform();		
				
		log.info("Question SixE selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question SixE || Fail"+e.getMessage());
		 throw(e);
	}
}


public boolean select_YES_for_Spouse_question_SixF_physician_and_enter_details_as(String Date6f, String Details6f, String NameAddress6f) throws Exception{
	
	try {
		log.debug("Question SixF should be selected to user");
			waepaQ6fYes_Spouse.click();
			Thread.sleep(1000);
			waepaQ6fAlcoholDate_Spouse.clear();
			Thread.sleep(1000);
			waepaQ6fAlcoholDate_Spouse.click();
			Thread.sleep(1000);
			
			if(Date6f.contains("/"))
			{
				
				waepaQ6fAlcoholDate_Spouse.sendKeys(Date6f);
			}
			else
			{
				Date6f=Date6f.substring(0, 2)+"/"+Date6f.substring(2, Date6f.length());
				
				waepaQ6fAlcoholDate_Spouse.sendKeys(Date6f);
			}
			
			waepaQ6fDetails_Spouse.sendKeys(Details6f);
			waepaQ6fNameAddress_Spouse.sendKeys(NameAddress6f);
				
		log.info("Question SixF selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question SixF || Fail"+e.getMessage());
		 throw(e);
	}
}


public boolean select_YES_for_Spouse_question_seven_eight_and_enter_details_as(String Details7a, String Date7b, String Details7b, String Family8a, String Age8a, String Status8a, String Condition8a) throws Exception{
	
	try {
		log.debug("Question Seven and Eight should be selected to user");
		waepaQ7aYes_Spouse.click();
		Thread.sleep(1000);
		waepaQ7aDetails_Spouse.sendKeys(Details7a);
		
		waepaQ7bYes_Spouse.click();
		Thread.sleep(1000);
		
		waepaQ7bCrimeDate_Spouse.clear();
		waepaQ7bCrimeDate_Spouse.click();
		Thread.sleep(1000);
		if(Date7b.contains("/"))
		{
			
			waepaQ7bCrimeDate_Spouse.sendKeys(Date7b);
		}
		else
		{
			Date7b=Date7b.substring(0, 2)+"/"+Date7b.substring(2, Date7b.length());
			
			waepaQ7bCrimeDate_Spouse.sendKeys(Date7b);
		}
		
		waepaQ7bCrimeDetails_Spouse.sendKeys(Details7b);
		waepaQ8aYes_Spouse.click();	
		Thread.sleep(1000);
		reuseMethod.dropDown(waepaQ8aFamilyMember_Spouse, Family8a);
		waepaQ8aAgeOfOnset_Spouse.sendKeys(Age8a);
		reuseMethod.dropDown(waepaQ8alifeStatus_Spouse, Status8a);
		waepaQ8aMedicalCondition_Spouse.sendKeys(Condition8a);
		
		log.info("Question Seven and Eight selected successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to select Question Seven and Eight || Fail"+e.getMessage());
		 throw(e);
	}
}



	
	}
	

	

