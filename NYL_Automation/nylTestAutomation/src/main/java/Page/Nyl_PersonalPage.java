package Page;


//import org.jsoup.nodes.BooleanAttribute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import Selenium.ScreenShotUtility;
import Selenium.SetUp;
import Utility.ReuseableMethod;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Nyl_PersonalPage extends SetUp {

	public WebDriver driver = getDriver();
	private final Logger log = LogManager.getLogger(Nyl_PersonalPage.class.getName());

	public Nyl_PersonalPage() {

		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	ReuseableMethod reuseMethod = new ReuseableMethod();
	ScreenShotUtility screenShotUtility = new ScreenShotUtility();

	
	
	@FindBy(id="txtSsnSlf-0")
	WebElement mobSlfSSN;
	@FindBy(id="txtOptMembershipIdSlf")
	WebElement mobSlfmembershipId;
	
	@FindBy(xpath="//select[@id='selfHeightNdWeight_selHeight']")
	WebElement mobSlfHeight;
	
	@FindBy(id="selfHeightNdWeight_selWeight")
	WebElement mobSlfWeight;
	
	@FindBy(xpath="//div[@id='rdGenderSlf']/input[@id='rdGenderSlf-0']")
	WebElement mobSlfMaleVal;
	
	@FindBy(xpath="//label[@for='rdGenderSlf-0']//div")
	WebElement mobSlfMale;
	
	@FindBy(xpath="//div[@id='rdGenderSlf']/input[@id='rdGenderSlf-1']")
	WebElement mobSlfFemaleVal;
	
	@FindBy(xpath="//label[@for='rdGenderSlf-1']//div")
	WebElement mobSlfFemale;
	
	@FindBy(xpath="//label[@for='rdNonUSAddrSlf-0']/div")
	WebElement mobSlfOutsideUSYes;
	
	@FindBy(xpath="//div[@id='rdNonUSAddrSlf']/input[@id='rdNonUSAddrSlf-0']")
	WebElement mobSlfOutsideUSYesVal;
	
	@FindBy(xpath="//label[@for='rdNonUSAddrSlf-1']/div")
	WebElement mobSlfOutsideUSNo;
	
	@FindBy(xpath="//div[@id='rdNonUSAddrSlf']/input[@id='rdNonUSAddrSlf-1']")
	WebElement mobSlfOutsideUSNoVal;
	
	@FindBy(xpath="//label[@for='rdFormOfTobaccoConsumptionSlf12-0']/div")
	WebElement mobSlfTobaccoYes;
	
	@FindBy(xpath="//div[@id='rdFormOfTobaccoConsumptionSlf12']/input[@id='rdFormOfTobaccoConsumptionSlf12-0']")
	WebElement mobSlfTobaccoYesVal;
	
	@FindBy(xpath="//label[@for='rdFormOfTobaccoConsumptionSlf12-1']/div")
	WebElement mobSlfTobaccoNo;
	
	@FindBy(xpath="//div[@id='rdFormOfTobaccoConsumptionSlf12']/input[@id='rdFormOfTobaccoConsumptionSlf12-1']")
	WebElement mobSlfTobaccoNoVal;
	
	@FindBy(id="txtSsnSps-0")
	WebElement mobSpouseSSN;
	
	@FindBy(id="spouseHeightNdWeight_selHeight")
	WebElement mobSpouseHeight;
	
	@FindBy(id="spouseHeightNdWeight_selWeight")
	WebElement mobSpouseWeight;
	
	@FindBy(xpath="//div[@id='rdGenderSps']/input[@id='rdGenderSps-0']")
	WebElement mobSpouseMaleVal;
	
	@FindBy(xpath="//label[@for='rdGenderSps-0']//div")
	WebElement mobSpouseMale;
	
	@FindBy(xpath="//div[@id='rdGenderSps']/input[@id='rdGenderSps-1']")
	WebElement mobSpouseFemaleVal;
	
	@FindBy(xpath="//label[@for='rdGenderSps-1']//div")
	WebElement mobSpouseFemale;
	
	@FindBy(xpath="//div[@id='rdNonUSAddrSps']/input[@id='rdNonUSAddrSps-0']")
	WebElement mobSpouseOutsideUSYesVal;
	
	@FindBy(xpath="//label[@for='rdNonUSAddrSps-0']//div")
	WebElement mobSpouseOutsideUSYes;
	
	@FindBy(xpath="//label[@for='rdNonUSAddrSps-1']//div")
	WebElement mobSpouseOutsideUSNo;
	
	@FindBy(xpath="//div[@id='rdNonUSAddrSps']/input[@id='rdNonUSAddrSps-1']")
	WebElement mobSpouseOutsideUSNoVal;
	
	@FindBy(xpath="//label[@for='rdFormOfTobaccoConsumptionSps12-0']//div")
	WebElement mobSpouseTobaccoYes;
	
	@FindBy(xpath="//div[@id='rdFormOfTobaccoConsumptionSps12']/input[@id='rdFormOfTobaccoConsumptionSps12-0']")
	WebElement mobSpouseTobaccoYesVal;
	
	@FindBy(xpath="//label[@for='rdFormOfTobaccoConsumptionSps12-1']//div")
	WebElement mobSpouseTobaccoNo;
	
	@FindBy(xpath="//div[@id='rdFormOfTobaccoConsumptionSps12']/input[@id='rdFormOfTobaccoConsumptionSps12-1']")
	WebElement mobSpouseTobaccoNoVal;
	
	@FindBy(xpath="(//div[@data-fields='dtLastTobaccoUsedSps']//input[contains(@class,'input')])[1]")
	WebElement spouseTobaccoMonth_Mobile;
	
	@FindBy(xpath="(//div[@data-fields='dtLastTobaccoUsedSps']//input[contains(@class,'input')])[2]")
	WebElement spouseTobaccoDate_Mobile;
	
	@FindBy(xpath="(//div[@data-fields='dtLastTobaccoUsedSps']//input[contains(@class,'input')])[3]")
	WebElement spouseTobaccoYear_Mobile;
	
	@FindBy(xpath="//h1[text()='Spouse Personal Details']")
	WebElement spousePersonalPage;
	
	@FindBy(xpath="//h1[text()='Your Personal Details']")
	WebElement yourPersonalPage;
	
	@FindBy(xpath="(//div[@data-fields='dtLastTobaccoUsed']//input[contains(@class,'input')])[1]")
	WebElement selfTobaccoMonth_Mobile;
	
	@FindBy(xpath="(//div[@data-fields='dtLastTobaccoUsed']//input[contains(@class,'input')])[2]")
	WebElement selfTobaccoDate_Mobile;
	
	@FindBy(xpath="(//div[@data-fields='dtLastTobaccoUsed']//input[contains(@class,'input')])[3]")
	WebElement selfTobaccoYear_Mobile;
	
	@FindBy(id="txtTobaccoName")
	WebElement SelftobaccoProduct_Mob;
	
	@FindBy(id="txtTobaccoNameSps")
	WebElement SpousetobaccoProduct_Mob;
	
	@FindBy(id="selCountrySlf")
	WebElement Self_Country_Mob;
	
	@FindBy(id="txtDurationOfStaySlf")
	WebElement Self_Country_duration_Mob;
	
	@FindBy(id="selCountrySps")
	WebElement Spouse_Country_Mob;
	
	@FindBy(id="txtDurationOfStaySps")
	WebElement Spouse_Country_duration_Mob;
	
	
	/*public boolean your_personal_details_page_displayed_and_select_Tabacco_as_and_reside_outside_as_and_enters_details_as_Mobile(String gender,String SSN, String Height, String Weight,String smoker,String Routside) throws Exception{
		
		try {
			log.debug("Enter Self Product page details for mobile application");
			Thread.sleep(1000);
			your_personal_detail_page_is_displayed_Mob();
			mobSlfSSN.click();
			mobSlfSSN.sendKeys(SSN);
			reuseMethod.dropDownselectbyvalue(mobSlfHeight, Height);
			mobSlfWeight.sendKeys(Weight);
			reuseMethod.select_Single_value_Icon(mobSlfFemaleVal, mobSlfFemale, mobSlfMale, gender);
			reuseMethod.select_Single_value_Icon(mobSlfOutsideUSNoVal,mobSlfOutsideUSNo,mobSlfOutsideUSYes,Routside);
			reuseMethod.scrollDown(mobSlfOutsideUSNo);
			reuseMethod.select_Single_value_Icon(mobSlfTobaccoNoVal, mobSlfTobaccoNo, mobSlfTobaccoYes, smoker);
			
			
			Thread.sleep(500);
			log.info("Enter Self Product page details successfully || Pass");
		return true;
		}catch (Exception e) {
			log.error("Notable to enter Self Product details || Fail"+e.getMessage());
			 throw(e);
		}
	
	}*/
	
	
/*public boolean spouse_personal_details_page_displayed_and_select_and_enter_details_as_and_Tabacco_as_and_reside_outside_as_Mobile(String Sgender,String SSSN, String SHeight, String SWeight,String Ssmoker,String SRoutside) throws Exception{
		
		try {
			log.debug("Enter Spouse Personal page details for mobile application with Tobacco Ques");
			spouse_personal_detail_page_is_displayed_Mob();
			mobSpouseSSN.click();
			Thread.sleep(1000);
			mobSpouseSSN.sendKeys(SSSN);
			reuseMethod.dropDownselectbyvalue(mobSpouseHeight, SHeight);
			mobSpouseWeight.sendKeys(SWeight);
			reuseMethod.select_Single_value_Icon(mobSpouseMaleVal, mobSpouseMale, mobSpouseFemale, Sgender);
			reuseMethod.select_Single_value_Icon(mobSpouseOutsideUSNoVal,mobSpouseOutsideUSNo, mobSpouseOutsideUSYes, SRoutside);
			reuseMethod.scrollDown(mobSpouseOutsideUSNo);
			reuseMethod.select_Single_value_Icon(mobSpouseTobaccoNoVal, mobSpouseTobaccoNo, mobSpouseTobaccoYes, Ssmoker);
			
			Thread.sleep(1000);
			log.info("Enter Spouse Personal page details successfully with Tobacco Ques || Pass");
		return true;
		}catch (Exception e) {
			log.error("Not able to enter Spouse personal details with Tobacco Ques || Fail"+e.getMessage());
			 throw(e);
		}
}*/

public boolean spouse_personal_details_page_displayed_and_select_and_enter_details_as_and_reside_outside_as_Mobile(String Sgender,String SSSN, String SHeight, String SWeight,String SRoutside) throws Exception{
	
	try {
		log.debug("Enter Spouse Personal page details (Without Tobacco Ques case) for mobile application");
		spouse_personal_detail_page_is_displayed_Mob();
		mobSpouseSSN.click();
		Thread.sleep(1000);
		mobSpouseSSN.sendKeys(SSSN);
		reuseMethod.dropDownselectbyvalue(mobSpouseHeight, SHeight);
		mobSpouseWeight.sendKeys(SWeight);
		reuseMethod.select_Single_value_Icon(mobSpouseMaleVal, mobSpouseMale, mobSpouseFemale, Sgender);
		reuseMethod.select_Single_value_Icon(mobSpouseOutsideUSNoVal,mobSpouseOutsideUSNo, mobSpouseOutsideUSYes, SRoutside);
		reuseMethod.scrollDown(mobSpouseOutsideUSNo);
		
		
		Thread.sleep(1000);
		log.info("Enter Spouse Personal page details (Without Tobacco Ques case) successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to enter Spouse personal details (Without Tobacco Ques case) || Fail"+e.getMessage());
		 throw(e);
	}
}
	public	boolean spouse_personal_detail_page_is_displayed_Mob() throws Exception
		{
			
				try {
					log.debug("Spouse Personal Details page is displayed in Mobile");
					String Expected="SPOUSE PERSONAL DETAILS";
					Assert.assertEquals(spousePersonalPage.getText(),Expected, "Spouse Personal Details Page is Displayed");
				log.info("Spouse Personal Details page is displayed in Mobile || Pass");
				return true;
				}
				catch(Exception e)
				{
					log.error("Spouse Personal Details is displayed in Mobile || Fail"+e.getMessage());
					 throw(e);
				}
		}
				public	boolean your_personal_detail_page_is_displayed_Mob() throws Exception
				{
					
						try {
							log.debug("Your Personal Details page is displayed in Mobile");
							String Expected="YOUR PERSONAL DETAILS";
							Assert.assertEquals(yourPersonalPage.getText(),Expected,"Your Personal Details Page is Displayed");
						log.info("Your Personal Details page is displayed in Mobile || Pass");
						return true;
						}
						catch(Exception e)
						{
							log.error("Your Personal Details is displayed in Mobile || Fail"+e.getMessage());
							 throw(e);
						}	
				}
				
	public boolean enters_details_for_tobacco_as_Yes_for_Self_Mobile(String TMM, String TDD, String TYYYY, String Tobaccoprd) throws Throwable {
							   
		try {
			log.debug("Enter details for tobacco as YES for self in Mobile");
			Thread.sleep(1000);
			reuseMethod.scrollDown(mobSlfTobaccoYes);
			selfTobaccoMonth_Mobile.clear();
			selfTobaccoDate_Mobile.clear();
			selfTobaccoYear_Mobile.clear();
			if(TYYYY.contains("SYSDate")||TYYYY.contains("SYSDATE"))
			{
				
		String date=reuseMethod.Enter_customized_previous_Date(TYYYY);
		
		selfTobaccoMonth_Mobile.click();
		selfTobaccoMonth_Mobile.sendKeys(date.substring(0, 2));
		selfTobaccoDate_Mobile.sendKeys(date.substring(2, 4));
		selfTobaccoYear_Mobile.sendKeys(date.substring(4, 8));
			}
	else
	{
		selfTobaccoMonth_Mobile.sendKeys(TMM);
		selfTobaccoDate_Mobile.sendKeys(TDD);
		selfTobaccoYear_Mobile.sendKeys(TYYYY);
	}
			
			SelftobaccoProduct_Mob.sendKeys(Tobaccoprd);
			Thread.sleep(500);
		log.info("Enter details for tobacco as YES for Self in Mobile || Pass");
		return true;
		}
		catch(Exception e)
		{
			log.error("Enter details for tobacco as YES for Self in Mobile || Fail"+e.getMessage());
			 throw(e);
		}				
	
	}
	
	public boolean enters_details_for_tobacco_as_Yes_for_Spouse_Mobile(String TSMM, String TSDD, String TSYYYY, String Stobaccoprd) throws Throwable {
		   
		try {
			log.debug("Enter details for tobacco as YES for Spouse in Mobile");
			Thread.sleep(500);
			reuseMethod.scrollDown(mobSpouseTobaccoNo);
			spouseTobaccoMonth_Mobile.clear();
			spouseTobaccoDate_Mobile.clear();
			spouseTobaccoYear_Mobile.clear();
			if(TSYYYY.contains("SYSDate")||TSYYYY.contains("SYSDATE"))
					{
				String date=reuseMethod.Enter_customized_previous_Date(TSYYYY);
				
				spouseTobaccoMonth_Mobile.click();
				spouseTobaccoMonth_Mobile.sendKeys(date.substring(0, 2));
				spouseTobaccoDate_Mobile.sendKeys(date.substring(2, 4));
				spouseTobaccoYear_Mobile.sendKeys(date.substring(4, 8));
					}
			else
			{
		spouseTobaccoMonth_Mobile.sendKeys(TSMM);
			spouseTobaccoDate_Mobile.sendKeys(TSDD);
			spouseTobaccoYear_Mobile.sendKeys(TSYYYY);
			}
			SpousetobaccoProduct_Mob.sendKeys(Stobaccoprd);
			Thread.sleep(500);
		log.info("Enter details for tobacco as YES for Spouse in Mobile || Pass");
		return true;
		}
		catch(Exception e)
		{
			log.error("Enter details for tobacco as YES for Spouse in Mobile || Fail"+e.getMessage());
			 throw(e);
		}				
	
	}
		
	public boolean enters_details_for_self_for_country_mobile(String Country, String Monthshowlong) throws Throwable {
	
		try {
			log.debug("Enter details for Country for Self in Mobile");
			reuseMethod.scrollDown(mobSlfOutsideUSYes);
			reuseMethod.dropDownselectbyvalue(Self_Country_Mob, Country);
		Self_Country_duration_Mob.sendKeys(Monthshowlong);
		Thread.sleep(300);
		log.info("Enter details for Country for Self in Mobile || Pass");
		return true;
		}
		catch(Exception e)
		{
			log.error("Enter details for Country for Self in Mobile || Fail"+e.getMessage());
			 throw(e);
		}				
	
	}
	
	public boolean enters_details_for_spouse_for_country_mobile(String Scountry, String Smonthshowlong) throws Throwable {
		
		try {
			log.debug("Enter details for Country for Spouse in Mobile");
			reuseMethod.scrollDown(mobSpouseOutsideUSYes);
			reuseMethod.dropDownselectbyvalue(Spouse_Country_Mob, Scountry);
		Spouse_Country_duration_Mob.sendKeys(Smonthshowlong);
		Thread.sleep(300);
			
		log.info("Enter details for Country for Spouse in Mobile || Pass");
		return true;
		}
		catch(Exception e)
		{
			log.error("Enter details for Country for Spouse in Mobile || Fail"+e.getMessage());
			 throw(e);
		}				
	
	}
	
	
	public boolean your_personal_details_page_displayed_and_select_Mobile(String gender, String SSN) throws Throwable {
		try {
			log.debug("Your personal details page displayed and select gender and SSN in Mobile");
			
		Thread.sleep(300);
		your_personal_detail_page_is_displayed_Mob();
		mobSlfSSN.click();
		mobSlfSSN.sendKeys(SSN);
		
		reuseMethod.select_Single_value_Icon(mobSlfFemaleVal, mobSlfFemale, mobSlfMale, gender);
		Thread.sleep(500);
		log.info("Your personal details page displayed and select gender and SSN in Mobile || Pass");
		return true;
		}
		catch(Exception e)
		{
			log.error("Enter details of gender and SSN  in Mobile || Fail"+e.getMessage());
			 throw(e);
		}		
	}

	public boolean enter_details_as_for_self_Mobile(String SSN) throws Throwable {
		try {
			log.debug("Your personal details page displayed and select SSN in Mobile");
			
		Thread.sleep(300);
		mobSlfSSN.click();
		mobSlfSSN.sendKeys(SSN);
		
		Thread.sleep(500);
		log.info("Your personal details page displayed and select SSN in Mobile || Pass");
		return true;
		}
		catch(Exception e)
		{
			log.error("Enter details of SSN  in Mobile || Fail"+e.getMessage());
			 throw(e);
		}		
	}
	
	public boolean enter_details_as_for_self_MembershipID_Mobile(String MembershipID) throws Throwable {
		try {
			log.debug("Your personal details page displayed and select MembershipID in Mobile");
			
		Thread.sleep(300);
		reuseMethod.scrollDown(mobSlfSSN);
		mobSlfmembershipId.click();
		mobSlfmembershipId.sendKeys(MembershipID);
		
		Thread.sleep(500);
		log.info("Your personal details page displayed and enter MembershipID in Mobile || Pass");
		return true;
		}
		catch(Exception e)
		{
			log.error("Enter details of SSN  in Mobile || Fail"+e.getMessage());
			 throw(e);
		}		
	}
	
	
	
public boolean height_is_not_rendered_Mobile() throws Exception{
	
	try {
		log.debug("Verify that Underwriting input fields Height is not rendered for mobile application");
		Thread.sleep(1000);
		
		
		Assert.assertFalse(mobSlfHeight.isDisplayed(),"height is displayed");
		
		
		log.info("Verified that Underwriting input fields Height is not rendered successfully || Pass");
	return true;
	}catch (Exception e) {
		System.out.println("Height is not Dispalyed");
		log.error("Not able to verify that Underwriting input fields Height is not rendered || Fail"+e.getMessage());
		return false;
	}

}

public boolean weight_is_not_rendered_Mobile() throws Exception{
	
	try {
		log.debug("Verify that Underwriting input fields Weight is not rendered for mobile application");
		Thread.sleep(1000);
		
		
		Assert.assertFalse(mobSlfWeight.isDisplayed(),"Weight is displayed");
				
		log.info("Verified that Underwriting input fields Weight is not rendered successfully || Pass");
	return true;
	}catch (Exception e) {
		System.out.println("Height is not Dispalyed");
		log.error("Not able to verify that Underwriting input fields Weight is not rendered || Fail"+e.getMessage());
		return false;
	}

}

public boolean select_tobacco_as_for_Spouse_Mobile(String smoker) throws Exception{
	
	try {
		log.debug("Enter Spouse Personal page details for mobile application with Tobacco Ques");
		
		reuseMethod.scrollDown(mobSpouseOutsideUSNo);
		reuseMethod.select_Single_value_Icon(mobSpouseTobaccoNoVal, mobSpouseTobaccoNo, mobSpouseTobaccoYes, smoker);
		
		Thread.sleep(1000);
		log.info("Enter Spouse Personal page details successfully with Tobacco Ques || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to enter Spouse personal details with Tobacco Ques || Fail"+e.getMessage());
		 throw(e);
	}
}

public boolean select_tobacco_for_self_Mobile(String smoker) throws Exception{
	
	try {
		log.debug("Enter Self Product page details for mobile application for Tobacco Ques Case");
		reuseMethod.scrollDown(mobSlfOutsideUSNo);
		reuseMethod.select_Single_value_Icon(mobSlfTobaccoNoVal, mobSlfTobaccoNo, mobSlfTobaccoYes, smoker);
		log.info("Enter Self Product page details successfully for Tobacco Ques Case || Pass");
	return true;
	}catch (Exception e) {
		log.error("Notable to enter Self Product details for Tobacco Ques Case || Fail"+e.getMessage());
		 throw(e);
	}

}

public boolean your_personal_details_page_displayed_and_reside_outside_as_and_enters_details_as_without_Tobacco_Mobile(String gender,String SSN, String Height, String Weight,String Routside) throws Exception{
	
	try {
		log.debug("Enter Self Product page details for mobile application");
		Thread.sleep(1000);
		your_personal_detail_page_is_displayed_Mob();
		mobSlfSSN.click();
		mobSlfSSN.sendKeys(SSN);
		reuseMethod.dropDownselectbyvalue(mobSlfHeight, Height);
		mobSlfWeight.sendKeys(Weight);
		reuseMethod.select_Single_value_Icon(mobSlfFemaleVal, mobSlfFemale, mobSlfMale, gender);
		reuseMethod.select_Single_value_Icon(mobSlfOutsideUSNoVal,mobSlfOutsideUSNo,mobSlfOutsideUSYes,Routside);
		
		
		Thread.sleep(500);
		log.info("Enter Self Product page details successfully || Pass");
	return true;
	}catch (Exception e) {
		log.error("Notable to enter Self Product details || Fail"+e.getMessage());
		 throw(e);
	}

}

public boolean spouse_personal_details_page_displayed_and_select_and_enter_details_as_and_reside_outside_as_without_Tobacco_Mobile(String Sgender,String SSSN, String SHeight, String SWeight,String SRoutside) throws Exception{
	
	try {
		log.debug("Enter Spouse Personal page details for mobile application with Tobacco Ques");
		spouse_personal_detail_page_is_displayed_Mob();
		mobSpouseSSN.click();
		Thread.sleep(1000);
		mobSpouseSSN.sendKeys(SSSN);
		reuseMethod.dropDownselectbyvalue(mobSpouseHeight, SHeight);
		mobSpouseWeight.sendKeys(SWeight);
		reuseMethod.select_Single_value_Icon(mobSpouseMaleVal, mobSpouseMale, mobSpouseFemale, Sgender);
		reuseMethod.select_Single_value_Icon(mobSpouseOutsideUSNoVal,mobSpouseOutsideUSNo, mobSpouseOutsideUSYes, SRoutside);
		
		Thread.sleep(1000);
		log.info("Enter Spouse Personal page details successfully with Tobacco Ques || Pass");
	return true;
	}catch (Exception e) {
		log.error("Not able to enter Spouse personal details with Tobacco Ques || Fail"+e.getMessage());
		 throw(e);
	}
}
}
	
	
	
	
	
	
	
	
	
	

