package StepDef;

import Page.Nyl_AuthorizePage;
import Page.Nyl_BasicInfo;
import Page.Nyl_BeneficiaryPage;
import Page.Nyl_ContactPage;
import Page.Nyl_CoveragePage;
import Page.Nyl_EligibilityPage;
import Page.Nyl_FinalPage;
import Page.Nyl_PaymentPage;
import Page.Nyl_PersonalPage;
import Page.Nyl_PreviewPage;
import Page.Nyl_ProductPage;
import Page.Nyl_SignaturePage;
import Page.Nyl_StatementOfHealthPage;
import Utility.ReuseableMethod;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NYL_StepDef {

	Nyl_BasicInfo basicInfo = new Nyl_BasicInfo();
	Nyl_EligibilityPage EligibilityPage = new Nyl_EligibilityPage();
	Nyl_ProductPage ProductPage = new Nyl_ProductPage();
	Nyl_CoveragePage CoveragePage = new Nyl_CoveragePage();
	Nyl_BeneficiaryPage BeneficiaryPage = new Nyl_BeneficiaryPage();
	Nyl_ContactPage contact = new Nyl_ContactPage();
	Nyl_PreviewPage Preview = new Nyl_PreviewPage();
	Nyl_AuthorizePage Authorize = new Nyl_AuthorizePage();
	Nyl_StatementOfHealthPage HealthPage = new Nyl_StatementOfHealthPage();
	Nyl_SignaturePage Signature = new Nyl_SignaturePage();
	Nyl_PaymentPage Payment = new Nyl_PaymentPage();
	Nyl_PersonalPage Personal = new Nyl_PersonalPage();
	Nyl_FinalPage FinalPage = new Nyl_FinalPage();
	ReuseableMethod reuseMethod = new ReuseableMethod();

	// **********************Setup (Common for web and
	// Mobile)******************************//
	@Given("^Customer navigate to NYL \"([^\"]*)\"$")
	public void customer_navigate_to_NYL(String website) throws Throwable {
		basicInfo.navigate_to_NYL_URL(website);
	}

	// ******************************BasicInfo [Web]*****************************//
	@When("^Clicks on Apply now button$")
	public void clicks_on_Apply_now_button() throws Throwable {
		basicInfo.clicks_on_Apply_now_button();
	}

	@When("^Clicks on Start Your Application Button$")
	public void clicks_on_Start_Your_Application_Button() throws Throwable {
		basicInfo.clicks_on_Apply_now_button();
	}


	// TIE
	//@Given("^Select Association from Drop down value as \"([^\"]*)\"$")
	@Given("^Select Association as \"([^\"]*)\"$")
	public void select_Association_as(String Association_value) throws Throwable {
		basicInfo.select_Association_from_Drop_down_value_as(Association_value);
	}

	@When("^Scroll down and click on I Attest To Having Read the Above Information button$")
	public void scroll_down_and_click_on_I_Attest_To_Having_Read_the_Above_Information_button() throws Throwable {
		basicInfo.scroll_down_and_click_on_I_Attest_To_Having_Read_the_Above_Information_button();
	}

	@Then("^Thank you page is displayed to user$")
	public void thank_you_page_is_displayed_to_user() throws Throwable {
		basicInfo.thank_you_page_is_displayed_to_user();
	}

	@Then("^Thank you page is displayed to user in Mobile site$")
	public void thank_you_page_is_displayed_to_user_in_Mobile_Site() throws Throwable {
		basicInfo.thank_you_page_is_displayed_to_user_Mobile();
	}

	@Then("^Verify that Confirmation number is generated in Mobile site for \"([^\"]*)\"$")
	public void verify_that_Confirmation_number_is_generated_in_Mobile_site_for(String website) throws Throwable {
		basicInfo.confirmation_Number_is_generated_Mobile(website);
	}

	@Then("^Verify that Confirmation number is generated for \"([^\"]*)\"$")
	public void verify_that_Confirmation_number_is_generated(String website) throws Throwable {
		basicInfo.confirmation_Number_is_generated(website);

	}
	@Then("^Verify that two confirmation number is generated for \"([^\"]*)\"$")
	public void verify_that_two_confirmation_number_is_generated_for(String website) throws Throwable {
		basicInfo.Two_confirmation_Number_are_generated(website);
	}

	@Then("^HomePage is Displayed$")
	public void homepage_is_Displayed() throws Throwable {
		basicInfo.Home_Page_is_displayed();
	}

	@Then("^Selects Association as \"([^\"]*)\" at HomePage$")
	public void selects_association_as_at_HomePage(String association) throws Throwable {
		basicInfo.selects_association_as_at_HomePage(association);
	}

	@Then("^Clicks on Log in and Enter stored Email ID and \"([^\"]*)\" and click on Next$")
	public void clicks_on_Log_in_and_Enter_stored_Email_ID_and_click_on_Next(String Password) throws Throwable {
		basicInfo.clicks_on_Login_in_and_Enter_emailId_and_Mobile(Password);
	}

//********************************Eligibility Web***********************************//

	// ********SELF With Specific email [Eligibility]*************//

	/*
	 * @Then("^Eligibility page details are displayed to user and validate details and enters Eligibility details and specific emailid as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$"
	 * ) public void
	 * eligibility_page_details_are_displayed_to_user_and_validate_details_and_enters_Eligibility_details_and_specific_emailid_as
	 * (String title, String Fname, String Lname, String state, String Dob,String
	 * Emailid, String workhr) throws Throwable { EligibilityPage.
	 * eligibility_page_details_are_displayed_to_user_and_validate_details_and_enters_Eligibility_details_and_specific_emailid_as
	 * (title, Fname, Lname, state, Dob, Emailid, workhr); }
	 */

	// WAEPA
	/*
	 * @Then("^Enter Eligibility details for self without EmailId as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$"
	 * ) public void enter_Eligibility_details_for_self_without_EmailId_as(String
	 * Title, String Fname, String Lname, String State, String DOB) throws Throwable
	 * {
	 * EligibilityPage.enter_Eligibility_details_for_self_without_EmailId_as(Title,
	 * Fname, Lname, State, DOB); }
	 */

	@Then("^Selects I am as \"([^\"]*)\"$")
	public void selects_I_am_as(String profession) throws Throwable {
		EligibilityPage.selects_I_am_as(profession);
	}
	@Then("^Clicks on DEPENDENT icon$")
	public void clicks_on_DEPENDENT_icon() throws Throwable {
		EligibilityPage.clicks_on_DEPENDENT_icon();
	}

	@Then("^Verify the Informational Message is displayed and all the icons for Self,Spouse,Child are disabled for selection$")
	public void verify_the_Informational_Message_is_displayed_and_all_the_icons_for_Self_Spouse_Child_are_disabled_for_selection()
			throws Throwable {
		EligibilityPage
				.verify_the_Informational_Message_is_displayed_and_all_the_icons_for_Self_Spouse_Child_are_disabled_for_selection();
	}

	@Then("^Eligibility page details are displayed to user$")
	public void eligibility_page_details_are_displayed_to_user() throws Throwable {
		EligibilityPage.eligibility_page_details_are_displayed_to_user();
	}
	
	@Then("^Eligibility details are displayed to user$")
	public void eligibility_details_are_displayed_to_user() throws Throwable {
		EligibilityPage.eligibility_details_are_displayed_to_user();
	}

	@Then("^Validates Eligibility Question as \"([^\"]*)\"$")
	public void validates_Eligibility_Question_as(String Question) throws Throwable {
		EligibilityPage.validates_Eligibility_Question_as(Question);
	}

	// *************SELF Scenarios [Eligibility]***************//

	@Then("^Navigate back to Eligibility page$")
	public void navigate_back_to_Eligibility_page() throws Throwable {
		EligibilityPage.navigate_back_to_Eligibility_page();
	}

	@Then("^Click on Self$")
	public void click_on_Self() throws Throwable {
		EligibilityPage.clickOnSelf();

	}

	@Then("^Select YES Radio button of Membership$")
	public void select_YES_Radio_button_of_Membership() throws Throwable {
		EligibilityPage.select_YES_Radio_button_of_Membership_self();
	}
	
	@Then("^selects Yes Radio button for affiliated with a sponsoring$")
	public void selects_Yes_Radio_button_of_affiliated_with_a_sponsoring() throws Throwable {
		EligibilityPage.select_YES_Radio_button_of_Membership_self();
	}
	
	@Then("^Scroll to Membership Radio button$")
	public void scroll_to_Membership_Radio_button() throws Throwable {
		EligibilityPage.Scroll_to_Membership_Radio_button();
	}

	@Then("^Select NO for Association Membership$")
	public void select_NO_for_Association_Membership() throws Throwable {
		EligibilityPage.select_No_Radio_button_of_Membership_self();
	}
	
	@Then("^Select NO radio button for affiliated with a sponsoring$")
	public void select_NO_radio_button_for_affiliated_with_a_sponsoring() throws Throwable {
		EligibilityPage.select_No_Radio_button_of_Membership_self();
	}
	
	@Then("^Validates check eligibility button is disabled$")
	public void validates_check_eligibility_button_is_disabled() throws Throwable {
	   EligibilityPage.validates_check_eligibility_button_is_disabled();
	}
	
	@Then("^Validates check eligibility button is enabled$")
	public void validates_check_eligibility_button_is_enabled() throws Throwable {
		EligibilityPage.validates_check_eligibility_button_is_enabled();
	}
	
	@Then("^Selects YES Radio button for Armed forces$")
	public void selects_YES_Radio_button_for_Armed_forces() throws Throwable {
		EligibilityPage.Selects_YES_Radio_button_for_Armed_forces();
	}
	
	@Then("^Selects NO Radio button for Armed forces$")
	public void selects_NO_Radio_button_for_Armed_forces() throws Throwable {
		EligibilityPage.Selects_NO_Radio_button_for_Armed_forces();
	}

	@Then("^Selects NO Radio button for Federal Government$")
	public void selects_NO_Radio_button_for_Federal_Government() throws Throwable {
		EligibilityPage.Selects_NO_Radio_button_for_Federal_Government();
	}

	@Then("^Selects YES Radio button for Federal Government$")
	public void selects_YES_Radio_button_for_Federal_Government() throws Throwable {
		EligibilityPage.Selects_YES_Radio_button_for_Federal_Government();
	}

	@Then("^Enter details for Employment Date as \"([^\"]*)\"$")
	public void enter_details_for_Employment_Date_as(String Empdate) throws Throwable {
		EligibilityPage.Enter_details_for_Employment_Date_as(Empdate);
	
	}
	

	@Then("^Selects NO Radio button of eligible member$")
	public void select_NO_eligible_Membership() throws Throwable {
		EligibilityPage.select_No_Radio_button_of_Membership_self();
	}
	

	//NSPE
	@Then("^Select YES Radio button of NSPE Membership for Self$")
	public void select_YES_Radio_button_of_NSPE_Membership_for_Self() throws Throwable {
		EligibilityPage.select_YES_Radio_button_of_NSPE_Membership_for_Self();
	}

	@Then("^Select YES Radio button of NSPE Membership for Spouse$")
	public void select_YES_Radio_button_of_NSPE_Membership_for_Spouse() throws Throwable {
		EligibilityPage.select_YES_Radio_button_of_NSPE_Membership_for_Spouse();
	}
	
	@Then("^Select NO Radio button of NSPE Membership for Self$")
	public void select_NO_Radio_button_of_NSPE_Membership_for_Self() throws Throwable {
		EligibilityPage.select_NO_Radio_button_of_NSPE_Membership_for_Self();
	}

	@Then("^Select NO Radio button of NSPE Membership for Spouse$")
	public void select_NO_Radio_button_of_NSPE_Membership_for_Spouse() throws Throwable {
		EligibilityPage.select_NO_Radio_button_of_NSPE_Membership_for_Spouse();
	}
	
	@Then("^Select NO for Full time Employee of NSPE Member for self$")
	public void select_NO_for_Full_time_Employee_of_NSPE_Member_for_self() throws Throwable {
		EligibilityPage.select_No_Radio_button_of_Membership_self();
	}

	@Then("^Select YES for Full time Employee of NSPE Member for self$")
	public void select_YES_for_Full_time_Employee_of_NSPE_Member_for_self() throws Throwable {
		EligibilityPage.select_YES_Radio_button_of_Membership_self();
	}
	

	@Then("^Select NO Radio Button for Student Member$")
	public void select_NO_Radio_Button_for_Student_Member() throws Throwable {
		EligibilityPage.select_NO_Radio_button_for_Student_Member();
	}

	@Then("^Select YES Radio Button for Student Member$")
	public void select_YES_Radio_Button_for_Student_Member() throws Throwable {
		EligibilityPage.select_YES_Radio_button_for_Student_Member();
	}

	@Then("^Select YES Radio Button for Practice for More than Six Months$")
	public void select_YES_Radio_Button_for_Practice_for_More_than_Six_Months() throws Throwable {
		EligibilityPage.select_YES_Radio_button_for_Practice_for_More_than_Six_Months();
	}

	@Then("^Select NO Radio Button for Practice for More than Six Months$")
	public void select_NO_Radio_Button_for_Practice_for_More_than_Six_Months() throws Throwable {
		EligibilityPage.select_NO_Radio_button_for_Practice_for_More_than_Six_Months();
	}

	@Then("^Select YES Radio Button for Full time Employee$")
	public void select_YES_Radio_Button_for_Full_time_Employee() throws Throwable {
		EligibilityPage.select_YES_Radio_Button_for_Full_time_Employee();
	}


	@Then("^Select eligibility status as \"([^\"]*)\"$")
	public void selects_eligibility_Status_as(String status) throws Throwable {
		EligibilityPage.selects_eligibility_Status_Self( status);
	}
	

	//******************

	@Then("^Select NO for Resident$")
	public void select_NO_for_Resident() throws Throwable {
		EligibilityPage.select_NO_for_Resident();
	}

	@Then("^Select YES for Resident$")
	public void select_YES_for_Resident() throws Throwable {
		EligibilityPage.select_YES_for_Resident();
	}

	@Then("^Select YES for all Duties of Regular Occupation$")
	public void select_YES_for_all_Duties_of_Regular_Occupation() throws Throwable {
		EligibilityPage.select_YES_for_all_Duties_of_Regular_Occupation();
	}

	@Then("^Select NO for all Duties of Regular Occupation$")
	public void select_NO_for_all_Duties_of_Regular_Occupation() throws Throwable {
		EligibilityPage.select_NO_for_all_Duties_of_Regular_Occupation();
	}

	@Then("^Validate that NEXT button is Disabled$")
	public void validate_that_NEXT_button_is_Disabled() throws Throwable {
		EligibilityPage.validate_that_NEXT_button_is_Disabled();
	}


	/*@Then("^Validate that NEXT button is Enable$")
	public void validate_that_NEXT_button_is_Enable() throws Throwable {
		EligibilityPage.validate_that_NEXT_button_is_Enabled();
	}
*/
	@Then("^Enter details for Self as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void enter_details_for_Self_as(String title, String Fname, String Lname, String state, String Dob,
			String workhr) throws Throwable {
		EligibilityPage.enter_details_for_Self_as(title, Fname, Lname, state, Dob, workhr);
	}
	
	@Then("^Enter eligibility details for Self as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void enter_eligibility_details_for_Self_as(String title, String Fname, String Lname, String Dob,
			String workhr) throws Throwable {
		EligibilityPage.enter_details_for_Self_without_state_as(title, Fname, Lname, Dob, workhr);
	}

	@Then("^verify that the SELF button is selected already$")
	public void verify_that_the_SELF_button_is_selected_already() throws Throwable {
		EligibilityPage.verify_that_the_SELF_button_is_selected_already();

	}

	@Then("^Eligibility page details are displayed to user and Enter details as HomePhone \"([^\"]*)\",\"([^\"]*)\"$")
	public void eligibility_page_details_are_displayed_to_user_and_Enter_details_as_HomePhone(String HomePh,
			String Phtype) throws Throwable {
		EligibilityPage.eligibility_page_details_are_displayed_to_user_and_Enter_details_as_HomePhone(HomePh, Phtype);
	}

	@Then("^Eligibility page details are displayed to user and Enter details as Mobile\"([^\"]*)\",\"([^\"]*)\"$")
	public void eligibility_page_details_are_displayed_to_user_and_Enter_details_as_Mobile(String MobPh, String Phtype)
			throws Throwable {
		EligibilityPage.eligibility_page_details_are_displayed_to_user_and_Enter_details_for_MobilePhone(MobPh, Phtype);
	}

	@Then("^select radio button for policyholder as \"([^\"]*)\"$")
	public void select_No_as(String policyholder) throws Throwable {
		EligibilityPage.select_radio_as_PolicyHolder(policyholder);
	}

	@Then("^select ArmedForce \"([^\"]*)\"$")
	public void select_ArmedForce(String Armedforces) throws Throwable {
		EligibilityPage.select_radio_For_ArmedForces_Self(Armedforces);
	}

	/*
	 * @Then("^Validate Site Residency Exclusions$") public void
	 * validate_Site_Residency_Exclusions() throws Throwable {
	 * EligibilityPage.validate_Site_Residency_Exclusions(); }
	 */

	@Then("^Enter New State as \"([^\"]*)\"$")
	public void enter_New_State_as(String state) throws Throwable {
		EligibilityPage.enter_New_State_as(state);
	}

	@Then("^Enter details for self as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_details_for_self_as(String title, String Fname, String Lname, String State, String Dob)
			throws Throwable {
		EligibilityPage.enter_Details_for_Self_Without_WorkHr(title, Fname, Lname, State, Dob);
	}

	@Then("^Eligibility page details are displayed to user and enter details for Self as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\"$")
	public void eligibility_page_details_are_displayed_to_user_and_enter_details_for_Self_as(String title, String Fname, String Lname, String State, String Dob) throws Throwable {
		EligibilityPage.enter_Details_for_Self_Without_WorkHr(title, Fname, Lname, State, Dob);
	}
	
	@Then("^Enters Sponsor name as \"([^\"]*)\"$")
	public void enters_Sponsor_name_as(String name) throws Throwable {
		EligibilityPage.enter_name_of_sponsor(name);
	}
	
	@Then("^Selects Affiliation under eligibility as \"([^\"]*)\"$")
	public void selects_Affiliation_under_eligibility_as(String affiliation) throws Throwable {
		EligibilityPage.Selects_Affiliation_under_eligibility(affiliation);
	}
	
	
/*	@Then("^Enter DOB for Self as \"([^\"]*)\"$")
	public void enter_DOB_for_Self_as(String Dob1) throws Throwable {
		EligibilityPage.enter_DOB_for_Self_as(Dob1);

	}*/

	@Then("^Select radio button I AM A SPOUSE OF A WAEPA MEMBER$")
	public void select_radio_button_I_AM_A_SPOUSE_OF_A_WAEPA_MEMBER() throws Throwable {
		EligibilityPage.Select_radio_button_I_AM_A_SPOUSE_OF_A_WAEPA_MEMBER();
	}

	@When("^Select radio button for CIVILIAN FEDERAL EMPLOYEE and enter EmployedSince and EmployedBy details as \"([^\"]*)\",\"([^\"]*)\" and Select the checkbox for I attest$")
	public void select_radio_button_for_CIVILIAN_FEDERAL_EMPLOYEE_and_enter_EmployedSince_and_EmployedBy_details_as_and_Select_the_checkbox_for_I_attest(
			String EmpSince, String EmpBy) throws Throwable {
		EligibilityPage
				.select_radio_button_for_CIVILIAN_FEDERAL_EMPLOYEE_and_enter_EmployedSince_and_EmployedBy_details_as_and_Select_the_checkbox_for_I_attest(
						EmpSince, EmpBy);
	}

	@When("^Select radio button for RETIRED CIVILIAN FEDERAL EMPLOYEE and enter RetiredSince and EmployedBy details as \"([^\"]*)\",\"([^\"]*)\" and Select the checkbox for I attest$")
	public void select_radio_button_for_RETIRED_CIVILIAN_FEDERAL_EMPLOYEE_and_enter_RetiredSince_and_EmployedBy_details_as_and_Select_the_checkbox_for_I_attest(
			String RetiredSince, String EmpBy) throws Throwable {
		EligibilityPage
				.select_radio_button_for_RETIRED_CIVILIAN_FEDERAL_EMPLOYEE_and_enter_RetiredSince_and_EmployedBy_details_as_and_Select_the_checkbox_for_I_attest(
						RetiredSince, EmpBy);
	}

	@Then("^Validate Age Restriction Message$")
	public void validate_Age_Restriction_Message() throws Throwable {
		EligibilityPage.validate_Age_Restriction_Message();
	}
	
	@Then("^Validate Rider Amount Exceed error Message$")
	public void validate_Rider_exceed_Term_Life_Error_Message() throws Throwable {
		EligibilityPage.validate_Rider_exceed_Term_Life_Error_Message();
	}

	
	@Then("^Validate NSPE Membership is mandatory for Self$")
	public void validate_NSPE_Membership_is_mandatory_for_Self() throws Throwable {
		EligibilityPage.validate_Age_Restriction_Message();
	}

	
	@Then("^Verify Custom Message for Spouse Member AOA is displayed$")
	public void verify_Custom_Message_for_Spouse_Member_AOA_is_displayed() throws Throwable {
		EligibilityPage.verify_Custom_Message_for_Spouse_Member_AOA_is_displayed();
	}


	@Then("^Verify Error Message for member is not eligible$")
	public void verify_error_message_for_member_is_not_eligible() throws Throwable {
		EligibilityPage.validate_Age_Restriction_Message();
	}
	

	@Then("^Enters DOB for Self as \"([^\"]*)\"$")
	public void enters_DOB_for_Self_as(String DateOfBirth) throws Throwable {
		EligibilityPage.enters_DOB_for_Self_as(DateOfBirth);
	}

	@Then("^Enters DOB for Spouse as \"([^\"]*)\"$")
	public void enters_DOB_for_Spouse_as(String DateOfBirth) throws Throwable {
		EligibilityPage.enters_DOB_for_Spouse_as(DateOfBirth);
	}

	@Then("^Clicks on Back or Previous button$")
	public void clicks_on_Back_or_Previous_Button() throws Throwable {
		EligibilityPage.clicks_on_Back_or_Previous_Button();
	}

	@Then("^Validate that NEXT button is Enabled$")
	public void validate_that_NEXT_button_is_Enabled() throws Throwable {
		EligibilityPage.validate_that_NEXT_button_is_Enabled();
	}

	@Then("^Enters Self WorkHr as \"([^\"]*)\"$")
	public void enters_Self_WorkHr_as(String workhr) throws Throwable {
		EligibilityPage.enters_Self_WorkHr_as(workhr);
	}

	@Then("^Enters Spouse WorkHr as \"([^\"]*)\"$")
	public void enters_Spouse_WorkHr_as(String Sworkhr) throws Throwable {
		EligibilityPage.enters_Spouse_WorkHr_as(Sworkhr);
	}

	@Then("^Clicks on BECOME AN ASSOCIATE MEMBER radio button to enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and select the checkbox for attest$")
	public void clicks_on_BECOME_AN_ASSOCIATE_MEMBER_radio_button_to_enter_details_as_and_select_the_checkbox_for_attest(
			String Sfname, String Slname, String MembershipID) throws Throwable {
		EligibilityPage
				.clicks_on_BECOME_AN_ASSOCIATE_MEMBER_radio_button_to_enter_details_as_and_select_the_checkbox_for_attest(
						Sfname, Slname, MembershipID);

	}

	@Then("^Verify that error message is displayed for DOB Eligibility$")
	public void verify_that_error_message_is_displayed_for_DOB_eligibility() throws Throwable {
		EligibilityPage.verify_the_error_message_is_displayed_for_dob_validation_at_top_of_the_page();
	}

	@Then("^Verify that error message is displayed for state eligibility at top of the page$")
	public void verify_the_error_message_is_displayed_for_state_validation_at_top_of_the_page() throws Throwable {
		EligibilityPage.verify_the_error_message_is_displayed_for_state_validation_at_top_of_the_page();
	}

	@Then("^Verify that error message is displayed as help us to display at top of the page$")
	public void verify_the_error_message_Help_Us_is_displayed_at_top_of_the_page() throws Throwable {
		EligibilityPage.verify_the_error_message_Help_Us_is_displayed_at_top_of_the_page();
	}

	@Then("^Selects employment status as \"([^\"]*)\"$")
	public void selects_Employment_Status(String status) throws Throwable {
		EligibilityPage.selects_Employment_Status(status);
	}
	
	@Then("^Selects Eligibility status as \"([^\"]*)\"$")
	public void selects_Eligibility_Status(String status) throws Throwable {
		EligibilityPage.selects_Eligibility_Status(status);
	}
	
	@Then("^Selects Last school attented/ currently attending and graduation date as \"([^\"]*)\",\"([^\"]*)\"$")
	public void selects_Last_School_Attended(String school,String graddate) throws Throwable {
		EligibilityPage.selects_Last_School_Attended_GraduateDate(school, graddate);
	}
	
	@Then("^Selects Last school attented/ currently attending as \"([^\"]*)\"$")
	public void selects_Last_School_Attended(String school) throws Throwable {
		EligibilityPage.selects_Last_School_Attended(school);
	}
	
//error message is same for restricted state and dob
	@Then("^Verify that error message is displayed for restricted state$")
	public void verify_that_error_message_is_displayed_for_restricted_state() throws Throwable {
		EligibilityPage.verify_the_error_message_is_displayed_for_dob_validation_at_top_of_the_page();
	}

	@Then("^Selects Career Stage as \"([^\"]*)\"$")
	public void selects_Career_Stage(String stage) throws Throwable {
		EligibilityPage.selects_Career_Stage(stage);
	}
	
	@Then("^Selects Began Undergraduate medical studies date and place as \"([^\"]*)\",\"([^\"]*)\"$")
	public void selects_Began_UnderGraduateDate_Place(String graddate,String school) throws Throwable {
		EligibilityPage.selects_Began_UnderGraduateDate_Place(graddate,school);
	}
	
	@Then("^Selects Expect to Complete Undergraduate medical studies date as \"([^\"]*)\"$")
	public void selects_Complete_UnderGraduateDate(String graddate) throws Throwable {
		EligibilityPage.selects_Complete_UnderGraduateDate(graddate);
	}
	
	@Then("^Enter Employer Or Agency Name as \"([^\"]*)\"$")
	public void enter_Employer_Or_Agency_Name_as(String name) throws Throwable {
		EligibilityPage.enter_Employer_Or_Agency_Name_as(name);
	}

	@Then("^Selects No Radio button of full- or part-time civilian employee for Self$")
	public void selects_No_Radio_button_of_full_or_part_time_civilian_employee_for_Self() throws Throwable {
		EligibilityPage.select_No_Radio_button_of_Membership_self();
	}

	@Then("^Selects Yes Radio button of full- or part-time civilian employee for Self$")
	public void selects_Yes_Radio_button_of_full_or_part_time_civilian_employee_for_Self() throws Throwable {
		EligibilityPage.select_YES_Radio_button_of_Membership_self();
	}

	@Then("^Selects Yes Radio Button for Dependent Children$")
	public void selects_Yes_for_Dependent_Children() throws Throwable {
		EligibilityPage.selects_Yes_for_Dependent_Children();
	}

	@Then("^Selects No Radio Button for Dependent Children$")
	public void selects_No_for_Dependent_Children() throws Throwable {
		EligibilityPage.selects_No_for_Dependent_Children();
	}

	@Then("^Selects Marital Status as \"([^\"]*)\"$")
	public void selects_Marital_Status_as(String status) throws Throwable {
		EligibilityPage.selects_Marital_Status_as(status);
	}

	@Then("^Selects Hear about us as \"([^\"]*)\"$")
	public void selects_Hear_about_us_as(String source) throws Throwable {
		EligibilityPage.selects_Hear_about_us_as(source);
	}

	@Then("^Enters Details about other Source as \"([^\"]*)\"$")
	public void enters_Details_about_other_Source_as(String source) throws Throwable {
		EligibilityPage.enters_Details_about_other_Source_as(source);
	}

	@Then("^Enters Marraige Date for Spouse as \"([^\"]*)\"$")
	public void enters_Marraige_Date_for_Spouse_as(String DateOfBirth) throws Throwable {
		EligibilityPage.enters_Marraige_Date_for_Spouse_as(DateOfBirth);
	}
	
	
	
	@Then("^Selects Yes Radio Button for Actively Performing Normal Duties of your occupation Question$")
	public void selects_Yes_Radio_Button_for_Actively_Performing_Normal_Duties_of_your_occupation_Question() throws Throwable {
		EligibilityPage.selects_Yes_Radio_Button_for_Actively_Performing_Normal_Duties_of_your_occupation_Question();
	}

	@Then("^Selects Yes Radio Button for Premier Accident or Hospital Income coverages for your spouse Question$")
	public void selects_Yes_Radio_Button_for_Premier_Accident_or_Hospital_Income_coverages_for_your_spouse_Question() throws Throwable {
		EligibilityPage.selects_Yes_Radio_Button_for_Premier_Accident_or_Hospital_Income_coverages_for_your_spouse_Question();
	}

	@Then("^Selects Yes Radio Button for Wish to apply for apply for insurance for any children Question$")
	public void selects_Yes_Radio_Button_for_Wish_to_apply_for_apply_for_insurance_for_any_children_Question() throws Throwable {
		EligibilityPage.selects_Yes_Radio_Button_for_Wish_to_apply_for_apply_for_insurance_for_any_children_Question();
	}
	
	@Then("^Selects No Radio Button for Actively Performing Normal Duties of your occupation Question$")
	public void selects_No_Radio_Button_for_Actively_Performing_Normal_Duties_of_your_occupation_Question() throws Throwable {
		EligibilityPage.selects_No_Radio_Button_for_Actively_Performing_Normal_Duties_of_your_occupation_Question();
	}

	@Then("^Selects No Radio Button for Premier Accident or Hospital Income coverages for your spouse Question$")
	public void selects_No_Radio_Button_for_Premier_Accident_or_Hospital_Income_coverages_for_your_spouse_Question() throws Throwable {
		EligibilityPage.selects_No_Radio_Button_for_Premier_Accident_or_Hospital_Income_coverages_for_your_spouse_Question();
	}

	@Then("^Selects No Radio Button for Wish to apply for apply for insurance for any children Question$")
	public void selects_No_Radio_Button_for_Wish_to_apply_for_apply_for_insurance_for_any_children_Question() throws Throwable {
		EligibilityPage.selects_No_Radio_Button_for_Wish_to_apply_for_apply_for_insurance_for_any_children_Question();
	}


	// *************SPOUSE******************//

	@Then("^Click on Spouse$")
	public void click_on_Spouse() throws Throwable {

		EligibilityPage.clickOnSpouse();
	}

	@Then("^Select radio button Yes for Spouse is Member$")
	public void select_radio_button_Yes_for_Spouse_is_Member() throws Throwable {
		EligibilityPage.select_radio_button_Yes_for_Spouse_is_Member();
	}

	@Then("^Select radio button NO for Spouse is Member$")
	public void select_radio_button_NO_for_Spouse_is_Member() throws Throwable {
		EligibilityPage.select_radio_button_NO_for_Spouse_is_Member();
	}

	@Then("^Enters Eligibility details for Spouse as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_Eligibility_details_for_Spouse_as(String STitle, String Sfname, String Slname, String SDOB,
			String Sworkhr) throws Throwable {
		EligibilityPage.enters_Eligibility_details_for_Spouse_as(STitle, Sfname, Slname, SDOB, Sworkhr);
	}

	@Then("^Enter details for Spouse as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_etails_for_Spouse_as(String STitle, String Sfname, String Slname, String SDOB) throws Throwable {
		EligibilityPage.enters_Contact_details_for_Spouse_as_Without_Workhr(STitle, Sfname, Slname, SDOB);
	}
	// ************************Add Child*******************//

	@Then("^Click on Child$")
	public void clicks_on_Child_radio_button() throws Throwable {
		EligibilityPage.clicks_on_Child_radio_button();

	}

	@Then("^Click on Add Child button$")
	public void click_on_Add_Child_button() throws Throwable {
		EligibilityPage.click_on_Add_Child_button();
	}

	@Then("^Add Child Screen is displayed and Enters Child details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void add_Child_Screen_is_displayed_and_Enters_Child_details_as(String Cfname, String Clname, String CDob,
			String Csex) throws Throwable {
		EligibilityPage.add_Child_Screen_is_displayed_and_Enters_Child_details_as(Cfname, Clname, CDob, Csex);
	}

	@Then("^Selects Married question as No for Child$")
	public void selects_Married_question_as_No_for_Child() throws Throwable {
		EligibilityPage.selects_Married_question_as_No();
	}

	@Then("^Validates Add Child Button on Eligibility page is not present$")
	public void validates_Add_Child_Button_on_Eligibility_page_is_not_present() throws Throwable {
		EligibilityPage.validates_Add_Child_Button_on_Eligibility_page_is_not_present();
	}

	@Then("^Click on Add Child button on Screen$")
	public void click_on_Add_Child_button_on_Screen() throws Throwable {
		EligibilityPage.click_on_Add_Child_button_on_Screen();
	}

	@Then("^Clicks Edit button for Child Added$")
	public void clicks_Edit_button_for_Child_Added() throws Throwable {
		EligibilityPage.clicks_Edit_button_for_Child_Added();
	}

	@Then("^Enters DOB for Child as \"([^\"]*)\"$")
	public void enters_DOB_for_Child_as(String DOB) throws Throwable {
		EligibilityPage.enters_DOB_for_Child_as(DOB);
	}

	@Then("^Selects Married question as Yes for Child$")
	public void selects_Married_question_as_Yes() throws Throwable {
		EligibilityPage.selects_Married_question_as_Yes();
	}

	@Then("^Honorably Discharged question as No$")
	public void honorably_Discharged_question_as_No() throws Throwable {
		EligibilityPage.honorably_Discharged_question_as_No();
	}

	@Then("^Selects Married question as No$")
	public void selects_Married_question_as_No() throws Throwable {
		EligibilityPage.selects_Married_question_as_No();
	}

	@Then("^Honorably Discharged question as Yes$")
	public void honorably_Discharged_question_as_Yes() throws Throwable {
		EligibilityPage.honorably_Discharged_question_as_Yes();
	}

	@Then("^Selects Yes for full time student for Child$")
	public void selects_Yes_for_full_time_student() throws Throwable {
		EligibilityPage.selects_Yes_for_full_time_student();
	}

	@Then("^Selects No for full time student for Child$")
	public void selects_No_for_full_time_student() throws Throwable {
		EligibilityPage.selects_No_for_full_time_student();
	}

	@Then("^Verify that the dependent note is displayed for Spouse$")
	public void verify_that_the_dependent_note_is_displayed_for_Spouse() throws Throwable {
		EligibilityPage.verify_that_the_dependent_note_is_displayed_for_Spouse();
	}

	@Then("^Verify Error Message for spouse to apply separately$")
	public void validate_Spouse_Apply_Separately_Error_message() throws Throwable {
		EligibilityPage.validate_Spouse_Apply_Separately_Error_message();

	}

	@Then("^Enters Basic salary as \"([^\"]*)\" for Self$")
	public void enters_Basic_Salary_for_self(String sal) throws Throwable {
		EligibilityPage.Enters_Basic_Salary_Self(sal);
	}
	
	@Then("^Validate that Check eligibility button is Disabled$")
	public void validate_that_Check_Eligibility_button_is_Disabled() throws Throwable {
		EligibilityPage.validate_that_NEXT_button_is_Disabled();
	}
	
	@Then("^Validates State as \"([^\"]*)\"$")
	public void validate_State_as_(String state) throws Throwable{
		EligibilityPage.validate_State_as_(state);
	}
	
	@Then("^Clicks on Check eligibility Button$")
	public void clicks_Check_Eligibility_button() throws Throwable{
		EligibilityPage.clicks_next_button();
	}
	
	@Then("^Clicks on Edit Button$")
	public void clicks_Edit_button() throws Throwable{
		EligibilityPage.clicks_edit_button();
	}
	
	@Then("^Clicks on Edit for Eligibility$")
	public void clicks_on_Edit_for_Eligibility() throws Throwable {
		EligibilityPage.clicks_edit_button();
	}

	
	@Then("^Validates Spouse Icon gets disabled$")
	public void verify_Spouse_Disabled() throws Throwable{
		EligibilityPage.verify_Spouse_Disabled();
	}
	
	@Then("^Validate uninsured member spouse notification is displayed$")
	public void verify_Uninsured_member_spouse_notification_displayed() throws Throwable{
		EligibilityPage.verify_Eligibility_Spouse__notification_is_displayed();
	}

//********************************************Product Page [Web] ************************************************//

	@Then("^Product page details are displayed to user$")
	public void product_page_details_are_displayed_to_user() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		ProductPage.product_page_details_are_displayed_to_user();
	}

	/*@Then("^Verify that Product page are displayed to user$")
	public void verify_that_product_page_are_displayed_to_user() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		ProductPage.verify_that_product_page_are_displayed_to_user();
	}*/

	/*@Then("^Click on Yes on Dependent CoverageWindow$")
	public void click_on_Yes_on_Dependent_CoverageWindow() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		ProductPage.click_on_Yes_on_Dependent_CoverageWindow();
	}*/

	

	@Then("^Selects product FiveYTL for Self$")
	public void selects_the_product_as_Term_Life_insurance_for_self() throws Throwable {
		ProductPage.selects_the_product_as_FiveYr_Term_Life_insurance_for_self();
	}

	@Then("^Verify Available Product List FiveYTL,TenYTL,TwentyYTL,ADD,LTDPlus,LTD,MTD,RTDI,PO,HO,CI$")
	public void verify_Available_Product_List_FiveYTL_TenYTL_TwentyYTL_ADD_LTDPlus_LTD_MTD_RTDI_PO_HO_CI()
			throws Throwable {

		ProductPage.validate_Five_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Accidental_Death_and_Dismemberment_Insurance_Product_is_displayed();
		ProductPage.validate_Long_Term_Disability_Plus_Insurance_Product_is_displayed();
		ProductPage.validate_Long_Term_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Mid_Term_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Retirement_Disability_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Professional_Overhead_Expense_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Critical_Illness_Product_is_displayed();
		ProductPage.validate_Hospital_Money_Insurance_Product_is_displayed();

	}

	@Then("^Verify Available Product List FiveYTL,TenYTL,TwentyYTL,ADD,LTDPlus,LTD,MTD,RTDI,PO,HMI$")
	public void verify_Available_Product_List_FiveYTL_TenYTL_TwentyYTL_ADD_LTDPlus_LTD_MTD_RTDI_PO_HMI()
			throws Throwable {

		ProductPage.validate_Five_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Accidental_Death_and_Dismemberment_Insurance_Product_is_displayed();
		ProductPage.validate_Long_Term_Disability_Plus_Insurance_Product_is_displayed();
		ProductPage.validate_Long_Term_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Mid_Term_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Retirement_Disability_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Professional_Overhead_Expense_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Hospital_Money_Insurance_Product_is_displayed();

	}

	@Then("^Verify Available Product List FiveYTL,TenYTL,TwentyYTL,FiftyMBTL,ADnD,LTDPlus,LTD,MTD,RTDI,CI,PO,HO$")
	public void verify_Available_Product_List_FiveYTL_TenYTL_TwentyYTL_FiftyMBTL_ADnD_LTDPlus_LTD_MTD_RTDI_CI_PO_HO()
			throws Throwable {

		ProductPage.validate_Five_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Fifty_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Accidental_Death_and_Dismemberment_Insurance_Product_is_displayed();
		ProductPage.validate_Long_Term_Disability_Plus_Insurance_Product_is_displayed();
		ProductPage.validate_Long_Term_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Mid_Term_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Retirement_Disability_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Professional_Overhead_Expense_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Critical_Illness_Product_is_displayed();
		ProductPage.validate_Hospital_Money_Insurance_Product_is_displayed();

	}

	@Then("^Verify Available Product List FiveYTL,TenYTL,FiftyYTL,ADD,LTDPlus,LTD,MTD,RTDI,CI,PO$")
	public void verify_Available_Product_List_FiveYTL_TenYTL_FiftyYTL_ADD_LTDPlus_LTD_MTD_RTDI_CI_PO()
			throws Throwable {

		ProductPage.validate_Five_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Fifty_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Accidental_Death_and_Dismemberment_Insurance_Product_is_displayed();
		ProductPage.validate_Long_Term_Disability_Plus_Insurance_Product_is_displayed();
		ProductPage.validate_Long_Term_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Mid_Term_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Retirement_Disability_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Professional_Overhead_Expense_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Critical_Illness_Product_is_displayed();

	}

	@Then("^Verify Available Product List FiveYTL,TenYTL,TwentyYTL,ADD,LTDPlus,LTD,MTD,HO$")
	public void verify_Available_Product_List_FiveYTL_TenYTL_TwentyYTL_ADD_LTDPlus_LTD_MTD_HO() throws Throwable {
		ProductPage.validate_Five_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Accidental_Death_and_Dismemberment_Insurance_Product_is_displayed();
		ProductPage.validate_Long_Term_Disability_Plus_Insurance_Product_is_displayed();
		ProductPage.validate_Long_Term_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Mid_Term_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Hospital_Money_Insurance_Product_is_displayed();
	}

	@Then("^Verify Available Product List FiveYTL,TenYTL,FiftyYTL,ADD,LTDPlus,LTD,MTD,CI,HO$")
	public void verify_Available_Product_List_FiveYTL_TenYTL_FiftyYTL_ADD_LTDPlus_LTD_MTD_CI_HO() throws Throwable {
		ProductPage.validate_Five_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Fifty_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Accidental_Death_and_Dismemberment_Insurance_Product_is_displayed();
		ProductPage.validate_Long_Term_Disability_Plus_Insurance_Product_is_displayed();
		ProductPage.validate_Long_Term_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Mid_Term_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Critical_Illness_Product_is_displayed();
		ProductPage.validate_Hospital_Money_Insurance_Product_is_displayed();

	}

	@Then("^Verify FiftyMBTL is not displayed$")
	public void verify_FiftyMBTL_is_not_displayed() throws Throwable {
		ProductPage.validates_that_FiftyYTL_product_is_not_displayed();
	}
	
	@Then("^Verify ADDI is not available for Child$")
	public void verify_ADDI_is_not_available_for_Child() throws Throwable {
		ProductPage.validates_Accidental_Death_Product_is_not_displayed_for_self();
	}
	
	@Then("^Verify Product LifeNinetyFive is not displayed$")
	public void verify_Product_LifeNinetyFive_is_not_displayed() throws Throwable {
		ProductPage.validates_that_Life_To_95_product_is_not_displayed();
	}
	
	@Then("^Verify Group Term LI and ADDI not displayed for Self$")
	public void verify_Group_Term_LI_and_ADDI_not_displayed_for_Self() throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_FiveYTL();
		ProductPage.validates_Accidental_Death_Product_is_not_displayed_for_self();
	}

	@Then("^Verify Group Term LI is displayed for Child$")
	public void verify_Group_Term_LI_is_displayed_for_Child() throws Throwable {
		ProductPage.select_Product_page_displayed_with_Group_Term_Life_Insurance_Product_For_Child();
	}

	@Then("^Selects product Group Term LI for Child$")
	public void selects_product_Group_Term_LI_for_Child() throws Throwable {
		ProductPage.selects_product_FiveYrTerm_Life_Insurance_Child();
	}
	
	@Then("^Selects product Group Term LI, LifeNinetyFive, ADDI for Self$")
	public void selects_product_Group_Term_LI_LifeNinetyFive_ADDI_for_Self() throws Throwable {
		ProductPage.selects_the_product_as_FiveYr_Term_Life_insurance_for_self();
		ProductPage.selects_the_product_as_FiftyYTL_for_Self();
		ProductPage.select_Product_Accidental_Death_Product_for_self();
	}
	
	@Then("^Selects product Group Term LI, ADDI for Self$")
	public void selects_product_Group_Term_ADDI_for_Self() throws Throwable {
		ProductPage.selects_the_product_as_FiveYr_Term_Life_insurance_for_self();
		//ProductPage.selects_the_product_as_FiftyYTL_for_Self();
		ProductPage.select_Product_Accidental_Death_Product_for_self();
	}
	
	@Then("^Selects LifeNinetyFive Product for self$")
	public void selects_LifeNinetyFive_Product_for_self() throws Throwable {
		ProductPage.selects_the_product_as_FiftyYTL_for_Self();
	}
	
	@Then("^Verify Available Product List Group Term LI, LifeNinetyFive and ADDI displayed for self$")
	public void verify_Available_Product_List_Group_Term_LI_LifeNinetyFive_and_ADDI_displayed_for_self() throws Throwable {
		ProductPage.select_Product_page_displayed_with_Group_Term_Life_Insurance_Product();
		ProductPage.select_Product_page_displayed_with_Life_To_95_Product();
		ProductPage.select_Product_page_displayed_with_Accidental_Death_Product();
	}
	
	
	@Then("^Verify Available Product List Group Term LI and ADDI displayed$")
	public void verify_Available_Product_List_Group_Term_LI_and_ADDI_displayed() throws Throwable {
		ProductPage.select_Product_page_displayed_with_Group_Term_Life_Insurance_Product();
		ProductPage.select_Product_page_displayed_with_Accidental_Death_Product();
	}
	
	@Then("^Verify Available Product List LifeNinetyFive displayed for Self$")
	public void verify_Available_Product_List_LifeNinetyFive_displayed_for_Self() throws Throwable {
		ProductPage.select_Product_page_displayed_with_Life_To_95_Product();
	}

	
	@Then("^Verify Available Product List FiveYTL,TenYTL,FiftyMBTL,ADD,LTDPlus,LTD,MTD,RTDI,PO,HMI$")
	public void verify_Available_Product_List_FiveYTL_TenYTL_FiftyMBTL_ADD_LTDPlus_LTD_MTD_RTDI_PO_HMI()
			throws Throwable {
		ProductPage.validate_Five_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Fifty_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Accidental_Death_and_Dismemberment_Insurance_Product_is_displayed();
		ProductPage.validate_Long_Term_Disability_Plus_Insurance_Product_is_displayed();
		ProductPage.validate_Long_Term_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Mid_Term_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Retirement_Disability_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Professional_Overhead_Expense_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Hospital_Money_Insurance_Product_is_displayed();
	}

	@Then("^Validate FiveYTL,TenYTL,TwentyYTL,FiftyMBTL,ADDI,LTDPlus,LTD,MTDI,RDI,POEDI,CI and HMI products are available$")
	public void validate_FiveYTL_TenYTL_TwentyYTL_FiftyMBTL_ADDI_LTDPlus_LTD_MTDI_RDI_POEDI_CI_and_HMI_products_are_available()
			throws Throwable {
		ProductPage.validate_Five_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Fifty_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Accidental_Death_and_Dismemberment_Insurance_Product_is_displayed();
		ProductPage.validate_Long_Term_Disability_Plus_Insurance_Product_is_displayed();
		ProductPage.validate_Long_Term_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Mid_Term_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Retirement_Disability_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Professional_Overhead_Expense_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Hospital_Money_Insurance_Product_is_displayed();
	}

	@Then("^Product page details are displayed to user and Verify FiveYTL,TenYTL,TwentyYTL$")
	public void Product_page_details_are_displayed_to_user_and_Verify_FiveYTL_TenYTL_TwentyYTL() throws Throwable {
		ProductPage.validate_Five_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_displayed();
	}

	@Then("^Validates the product TwentyYTL is not displayed$")
	public void validates_the_product_TwentyYTL_is_not_displayed() throws Throwable {
		ProductPage.validates_the_product_TwentyYTL_is_not_displayed();
	}

	@Then("^Validates the following products are not displayed: ADDI, LTDPlus, LTD, MTDI, RDI, POEDI, CI, HMI$")
	public void validates_the_following_products_are_not_displayed_ADDI_LTDPlus_LTD_MTDI_RDI_POEDI_CI_HMI()
			throws Throwable {
		ProductPage.validates_Accidental_Death_product_is_not_displayed();
		ProductPage.validates_LTDPlus_is_not_displayed();
		ProductPage.validates_LTD_is_not_displayed();
		ProductPage.validates_MTDI_is_not_displayed();
		ProductPage.validate_Retirement_Disability_Disability_Insurance_Product_is_not_displayed();
		ProductPage.validate_Professional_Overhead_Expense_Disability_Insurance_Product_is_not_displayed();
		ProductPage.validates_CI_is_not_displayed();
		ProductPage.validates_HMI_product_is_not_displayed();
	}

	@Then("^Verify that No Product is Available for Spouse$")
	public void verify_that_No_Product_is_Available_for_Spouse() throws Throwable {
		ProductPage.validates_that_Spouse_is_not_displayed_for_FiveYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TwentyYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_ADDI();
		ProductPage.validates_that_Spouse_is_not_displayed_for_LTDP();
		ProductPage.validates_that_Spouse_is_not_displayed_for_LTD();
		ProductPage.validates_that_Spouse_is_not_displayed_for_MIDT();
		ProductPage.validates_that_Spouse_is_not_displayed_for_CI();
		ProductPage.validates_that_Spouse_is_not_displayed_for_HII();

	}

	@Then("^Verify Available Products for Spouse as FiveYTL,TenYTL,TwentyYTL,ADD,LTD,LTDPlus,MTD,HO$")
	public void verify_Available_Products_for_Spouse_as_FiveYTL_TenYTL_TwentyYTL_ADD_LTD_LTDPlus_MTD_HO()
			throws Throwable {
		ProductPage.validates_that_Spouse_is_displayed_for_FiveYTL();
		ProductPage.validates_that_Spouse_is_displayed_for_TenYTL();
		ProductPage.validates_that_Spouse_is_displayed_for_TwentyYTL();
		ProductPage.validates_that_Spouse_is_displayed_for_ADDI();
		ProductPage.validates_that_Spouse_is_displayed_for_LTDP();
		ProductPage.validates_that_Spouse_is_displayed_for_LTD();
		ProductPage.validates_that_Spouse_is_displayed_for_MIDT();
		ProductPage.validates_that_Spouse_is_displayed_for_HII();
	}
	
	@Then("^Verify Available Products for Spouse as GTLP75I,Flex10,Flex20$")
	public void verify_Available_Products_for_Spouse_as_GTLP75I_Flex10_Flex20()
			throws Throwable {
		ProductPage.validates_that_Spouse_is_displayed_for_FiveYTL();
		ProductPage.validates_that_Spouse_is_displayed_for_TenYTL();
		ProductPage.validates_that_Spouse_is_displayed_for_TwentyYTL();
	}
	
	@Then("^Verify Available Products for Spouse as GTLP75I$")
	public void verify_Available_Products_for_Spouse_as_GTLP75I()throws Throwable {
		ProductPage.validates_that_Spouse_is_displayed_for_FiveYTL();
	}

	@Then("^Validates Quick Decision is not displayed for FiveYTL$")
	public void validates_Quick_Decision_is_not_displayed_for_FiveYTL() throws Throwable {
		CoveragePage.validates_Quick_Decision_is_not_displayed_for_FiveYTL();

	}

	@Then("^Validates Quick Decision is not displayed for TenYTL$")
	public void validates_Quick_Decision_is_not_displayed_for_TenYTL() throws Throwable {
		CoveragePage.validates_Quick_Decision_is_not_displayed_for_TenYTL();
	}

	@Then("^Validates the following products are not displayed: LTDPlus,LTD, MTDI,CI$")
	public void validates_the_following_products_are_not_displayed_LTDPlus_LTD_MTDI_CI() throws Throwable {
		ProductPage.validates_LTDPlus_is_not_displayed();
		ProductPage.validates_LTD_is_not_displayed();
		ProductPage.validates_MTDI_is_not_displayed();
		ProductPage.validates_CI_is_not_displayed();
	}

	@Then("^Validates the following products are not displayed: ADDI,HMI$")
	public void validates_the_following_products_are_not_displayed_ADnD_HMI() throws Throwable {
		ProductPage.validates_Accidental_Death_product_is_not_displayed();
		ProductPage.validates_HMI_product_is_not_displayed();
	}

	@Then("^Validates no coverages are displayed for Spouse$")
	public void validates_no_coverages_are_displayed_for_Spouse() throws Throwable {

		ProductPage.validates_that_Spouse_is_not_displayed_for_FiveYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TwentyYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_ADDI();
		ProductPage.validates_that_Spouse_is_not_displayed_for_HII();
	}

	// TIE
	@Then("^Validates that Self is not displayed for TermLife,TenYTL,ADDI,DII$")
	public void validates_that_Self_is_not_displayed_for_TermLife_TenYTL_ADDI_DII() throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_not_displayed_for_ADDI();
		ProductPage.validate_Disability_Income_Insurance_Product_is_not_displayed();
	}

	@Then("^Validates that Self is not displayed for TermLife,TenYTL,ADDI$")
	public void validates_that_Self_is_not_displayed_for_TermLife_TenYTL_ADDI() throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_not_displayed_for_ADDI();
	}

	@Then("^Validates that Spouse is not displayed for TermLife,TenYTL,ADDI,DII$")
	public void validates_that_Spouse_is_not_displayed_for_TermLife_TenYTL_ADDI_DII() throws Throwable {
		ProductPage.validates_that_Spouse_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_ADDI();
		ProductPage.validates_that_Spouse_is_not_displayed_for_DII();
	}

	@Then("^Verify Available Product List TermLife,TenYTL,TwentyYTL,HLDD,HII$")
	public void verify_Available_Product_List_TermLife_TenYTL_TwentyYTL_HLDD_HII()
			throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_High_Limit_Death_Insurance_Product_is_displayed();
		ProductPage.validate_Hospital_Indemnity_Insurance_Product_is_displayed();
	}

	@Then("^Verify Available Product List TermLife,TenYTL,TwentyYTL,HLDD,DII$")
	public void verify_Available_Product_List_TermLife_TenYTL_TwentyYTL_HLDD_DII()
			throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_High_Limit_Death_Insurance_Product_is_displayed();
		ProductPage.validate_Disability_Income_Insurance_Product_is_displayed();
	}
	
	//NSPE
	@Then("^Validates that Spouse is displayed for ADnD$")
	public void validates_that_Spouse_is_displayed_for_ADnD() throws Throwable {
	    ProductPage.validates_that_Spouse_is_displayed_for_ADDI();
	}

	
	@Then("^Verify Available Product List GTLI, GTenYTL, GHII$")
	public void verify_Available_Product_List_GTLI_GtenYTL_GHII()throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Hospital_Indemnity_Insurance_Product_is_displayed();
	}
	
	@Then("^Verify product GTLI is displayed$")
	public void verify_product_GTLI_is_displayed()throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
		
	}
	@Then("^Verify GTenYTL and GHII are not displayed$")
	public void verify_product_GTenYTL_and_GHII_are_not_displayed()throws Throwable {
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_not_displayed();
		ProductPage.validate_Hospital_Indemnity_Insurance_Product_is_not_displayed();
		
	}
	@Then("^Verify product GTLI, GTenYTL are not displayed$")
	public void verify_product_GTLI_GTenYTL_are_not_displayed()throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_not_available();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_not_displayed();
		
		
	}
	@Then("^Verify product GHII is displayed$")
	public void verify_product_GHII_is_displayed()throws Throwable {
		ProductPage.validate_Hospital_Indemnity_Insurance_Product_is_displayed();
		
	}
	
	@Then("^Verify product GTenYTL is not displayed$")
	public void verify_product_GTenYTL_is_not_displayed()throws Throwable {
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_not_displayed();
		
	}
	@Then("^Verify product GDII is not displayed$")
	public void verify_GDII_is_not_dispalyed()throws Throwable {
		ProductPage.validates_LTD_is_not_displayed();
	}

	@Then("^Validates that Self is not displayed for ADnD$")
	public void validates_that_Self_is_not_displayed_for_ADnD() throws Throwable {
	    ProductPage.validates_that_Self_is_not_displayed_for_ADDI();
	}

	@Then("^Validates that Child is not displayed for ADnD$")
	public void validates_that_Child_is_not_displayed_for_ADnD() throws Throwable {
	    ProductPage.validates_that_Child_is_not_displayed_for_ADDI();
	}

	
	@Then("^Validates that Spouse is not displayed for TraditionalGroupTermLife,TenYTL,ADnD$")
	public void validates_that_Spouse_is_not_displayed_for_TraditionalGroupTermLife_TenYTL_ADnD() throws Throwable {
		ProductPage.validates_that_Spouse_is_not_displayed_for_FiveYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TenYTL();		
		ProductPage.validates_that_Spouse_is_not_displayed_for_ADDI();
	}
	

	@Then("^Verify Available Product List GTLI, GTenYTL, GDII and GHII$")
	public void verify_Available_Product_List_GTLI_GTenYTL_GDII_GHII()throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Long_Term_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Hospital_Indemnity_Insurance_Product_is_displayed();
	}

	// TIE
	@Then("^Product page details are displayed to user and Verify Available Product List TermLife,TenYTL,ADD,DII$")
	public void product_page_details_are_displayed_to_user_and_Verify_Available_Product_List_TermLife_TenYTL_ADD_DII()
			throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validates_that_Self_is_displayed_for_ADDI();
		ProductPage.validate_Disability_Income_Insurance_Product_is_displayed();
	}

	@Then("^Product page details are displayed to user and Verify Available Product List TermLife,TenYTL,ADD$")
	public void product_page_details_are_displayed_to_user_and_Verify_Available_Product_List_TermLife_TenYTL_ADD()
			throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validates_that_Self_is_displayed_for_ADDI();
	}

	@Then("^Product page details are displayed to user and Verify Available Product List TermLife,TenYTL$")
	public void product_page_details_are_displayed_to_user_and_Verify_Available_Product_List_TermLife_TenYTL()
			throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
	}


	@Then("^Validates that Self is not displayed for TGTLI,TenPGTL Products$")
	public void validates_that_Self_is_not_displayed_for_TGTLI_TenPGTL_products() throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_not_displayed_for_TenYTL();
	}

	@Then("^Validates that Spouse is not displayed for TGTLI,TenPGTL Products$")
	public void validates_that_Spouse_is_not_displayed_for_TGTLI_TenPGTL_products() throws Throwable {
		ProductPage.validates_that_Spouse_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TenYTL();
	}

	@Then("^Selects product TGTLI for Self$")
	public void selects_product_TGTLI_for_Self() throws Throwable {
		ProductPage.selects_product_TermLife_for_Self();
	}
	

	@Then("^Selects product TGTLI for Spouse$")
	public void selects_product_TGTLI_for_Spouse() throws Throwable {
		ProductPage.selects_product_TermLife_for_Spouse();
	}

	@Then("^Selects product TGTLI for Child$")
	public void selects_product_TGTLI_for_Child() throws Throwable {
		ProductPage.selects_product_TermLife_for_Child();
	}

	@Then("^Selects product TenPGTL for Self$")
	public void selects_product_TenPGTL_for_Self() throws Throwable {
		ProductPage.selects_product_TenYTL_for_Self();
	}

	@Then("^Selects product TenPGTL for Spouse$")
	public void selects_product_TenPGTL_for_Spouse() throws Throwable {
		ProductPage.selects_product_for_Spouse_as_Ten_YTL();
	}

	@Then("^Verify Child Icon is disabled for TenPGTL$")
	public void verify_Child_Icon_is_disabled_for_TenPGTL() throws Throwable {
		ProductPage.verify_Child_icon_is_disabled_for_TenYTL();
	}

	@Then("^Selects product TenPGTL for Child$")
	public void selects_product_TenPGTL_for_Child() throws Throwable {
		ProductPage.selects_product_TenYTL_for_Child();
	}

	@Then("^Verify Child icon is disabled for TGTLI$")
	public void verify_Child_icon_is_disabled_for_TGTLI() throws Throwable {
		ProductPage.verify_Child_icon_is_disabled_for_TermLife();
	}


	
	@Then("^Product page details are displayed to user and Verify Available Product List GTLI,TenYTL,GADD$")
	public void product_page_details_are_displayed_to_user_and_Verify_Available_Product_List_GTLI_TenYTL_GADD()
			throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validates_that_Self_is_displayed_for_ADDI();
	}
	
	
	
	@Then("^Validates that Spouse is not displayed for following products: PAI,HII$")
	public void validates_that_Spouse_is_not_displayed_for_following_products_PAI_HII() throws Throwable {
		ProductPage.validates_that_Spouse_is_not_displayed_for_HII();
		ProductPage.validates_that_Spouse_is_not_displayed_for_ADDI();
	}
	
	@Then("^Validates that Self is not displayed for following products: DPOSDI,OOEI$")
	public void validates_that_Self_is_not_displayed_for_following_products_DPOSDI_OOEI() throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_DII();
		ProductPage.validates_that_Self_is_not_displayed_for_PO_or_OOEDI();
		ProductPage.validates_that_Self_is_displayed_for_TwentyYTL();
		ProductPage.validates_that_Self_is_displayed_for_FifteenYTL();
		ProductPage.validates_that_Self_is_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_displayed_for_PureTermLife();
		ProductPage.validates_that_Self_is_displayed_for_PrefTermLife();
		ProductPage.validates_that_Self_is_displayed_for_HII();
		ProductPage.validates_that_Self_is_displayed_for_ADDI();
	}


//*****************

	@Then("^Verify Available Product List HII$")
	public void verify_Available_Product_HII() throws Throwable {
		ProductPage.verify_Available_Product_HII();
	}


	@Then("^Verify Available Product: HLDD$")
	public void Verify_Available_Product_HLDD() throws Throwable {
		ProductPage.validate_High_Limit_Death_Insurance_Product_is_displayed();
	}
	
	@Then("^Verify Available Product: ADnD$")
	public void verify_Available_Product_List_ADnD() throws Throwable {
	    ProductPage.validate_Accidental_Death_and_Dismemberment_Insurance_Product_is_displayed();
	}

	@Then("^Verify Available Product: DII$")
	public void verify_Available_Product_List_DII() throws Throwable {
		 ProductPage.validate_Disability_Income_Insurance_Product_is_displayed();
	}
	
	@Then("^Verify Available Product: TenYTL$")
	public void verify_Available_Product_List_TenYTL() throws Throwable {
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
	}
	
	@Then("^Verify Available Product: Flex10$")
	public void verify_Available_Product_List_Flex10() throws Throwable {
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
	}
	
	@Then("^Verify Available Product List ARTL,TenYTL,AOD$")
	public void verify_Available_Product_List_ARTL_TenYTL_AOD() throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Accident_only_Insurance_Product_is_available();
	}
	
	@Then("^Verify Available Product List TenYTL,AOD$")
	public void verify_Available_Product_List_TenYTL_AOD() throws Throwable {
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Accident_only_Insurance_Product_is_available();
	}


	@Then("^Verify Available Product List TermLife,TenYTL,TwentyYTL,HLDD,DII,HII$")
	public void Verify_Available_Product_List_TermLife_TenYTL_TwentyYTL_HLDD_DII_HII() throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_High_Limit_Death_Insurance_Product_is_displayed();
		ProductPage.validate_Disability_Income_Insurance_Product_is_displayed();
		ProductPage.validate_Hospital_Indemnity_Insurance_Product_is_displayed();
	}


	@Then("^Verify Available Product List TermLife,HLDD,DII,HII$")
	public void Verify_Available_Product_List_TermLife_HLDD_DII_HII() throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
		ProductPage.validate_High_Limit_Death_Insurance_Product_is_displayed();
		ProductPage.validate_Disability_Income_Insurance_Product_is_displayed();
		ProductPage.validate_Hospital_Indemnity_Insurance_Product_is_displayed();
	}

	@Then("^Verify Available Product List TermLife,HII$")
	public void verify_Available_Product_List_TermLife_HII() throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
		ProductPage.validate_Hospital_Indemnity_Insurance_Product_is_displayed();
	}

	@Then("^Verify Available Product List TermLife$")
	public void verify_Available_Product_List_TermLife() throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
	}

	@Then("^Verify Available Product List TermLife,TenYTL,TwentyYTL$")
	public void verify_Available_Product_List_TermLife_TenYTL_TwentyYTL() throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_displayed();
	}
	
	@Then("^Verify the Quick Decision is Available under TermLife on Product Page$")
	public void verify_the_Quick_Decision_is_Available_under_TermLife_on_Product_Page() throws Throwable {
		ProductPage.verify_the_Quick_Decision_is_Available_under_TermLife_on_Product_Page();
	}

	@Then("^Verify the Quick Decision is not Available under TermLife on Product Page$")
	public void verify_the_Quick_Decision_is_not_Available_under_TermLife_on_Product_Page() throws Throwable {
		ProductPage.verify_the_Quick_Decision_is_not_Available_under_TermLife_on_Product_Page();
	}

	//AAFP
	@Then("^Verify Available Product List TermLife,TenYTL,DII,PO$")
	public void verify_Available_Product_List_TermLife_TenYTL_DII_PO() throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Disability_Income_Insurance_Product_is_displayed();
		ProductPage.Validates_that_PO_or_OO_or_BOE_is_displayed();
		
	}

	@Then("^Verify Available Product List TermLife,HLDD,HII for Spouse$")
	public void verify_Available_Product_List_TermLife_HLDD_HII_spouse() throws Throwable {
		ProductPage.validates_that_Spouse_is_displayed_for_TermLife();
		ProductPage.validates_that_Spouse_is_displayed_for_ADDI();
		ProductPage.validates_that_Spouse_is_displayed_for_HII();
	}
	
	@Then("^Verify Available Product List GTTLI,CI for Spouse$")
	public void verify_Available_Product_List_GTTLI_CI_spouse() throws Throwable {
		ProductPage.validates_that_Spouse_is_displayed_for_TermLife();
		ProductPage.validates_that_Spouse_is_displayed_for_CI();
	}
	
	@Then("^Verify Available Product List GTTLI,GTenYTL,CI for Spouse$")
	public void verify_Available_Product_List_GTTLI_GTenYTL_CI_spouse() throws Throwable {
		ProductPage.validates_that_Spouse_is_displayed_for_TermLife();
		ProductPage.validates_that_Spouse_is_displayed_for_TenYTL();
		ProductPage.validates_that_Spouse_is_displayed_for_CI();
	}
	
	@Then("^Verify Available Product List GTTLI,GTenYTL,GTwentyYTL,CI for Spouse$")
	public void verify_Available_Product_List_GTTLI_GTenYTL_GTwentyYTL_CI_spouse() throws Throwable {
		ProductPage.validates_that_Spouse_is_displayed_for_TermLife();
		ProductPage.validates_that_Spouse_is_displayed_for_TenYTL();
		ProductPage.validates_that_Spouse_is_displayed_for_TwentyYTL();
		ProductPage.validates_that_Spouse_is_displayed_for_CI();
	}

	@Then("^Verify that Child is only available for HII$")
	public void verify_that_Child_is_only_available_for_HII() throws Throwable {
		ProductPage.validates_that_Child_is_displayed_for_HII();
	}

	@Then("^Verify that Child is not displayed for TermLife,TenYTL,TwentyYTL,HLDD$")
	public void verify_that_Child_is_not_displayed_for_TermLife_TenYTL_TwentyYTL_HLDD() throws Throwable {
		ProductPage.validates_that_Child_is_displayed_for_TermLife();
		ProductPage.validates_that_Child_is_displayed_for_TenYTL();
		ProductPage.validates_that_Child_is_displayed_for_TwentyYTL();
		ProductPage.validates_that_Child_is_displayed_for_ADDI();
	}

	@Then("^Verify that Child is displayed for TermLife,TenYTL,TwentyYTL,HLDD,HII$")
	public void verify_that_Child_is_displayed_for_TermLife_TenYTL_TwentyYTL_HLDD_HII() throws Throwable {
		ProductPage.validates_that_Child_is_displayed_for_TermLife();
		ProductPage.validates_that_Child_is_displayed_for_TenYTL();
		ProductPage.validates_that_Child_is_displayed_for_TwentyYTL();
		ProductPage.validates_that_Child_is_displayed_for_ADDI();
		ProductPage.validates_that_Child_is_displayed_for_HII();
	}

	@Then("^Verify Child is displayed for GHII$")
	public void verify_that_Child_is_displayed_for_GHII() throws Throwable {
	
		ProductPage.validates_that_Child_is_displayed_for_HII();
	}
	@Then("^Verify Child is displayed for GTenYTL, GTLI and GHII$")
	public void verify_that_Child_is_displayed_for_GTenYTL_GTLI_and_GHII() throws Throwable {
		ProductPage.validates_that_Child_is_displayed_for_TermLife();
		ProductPage.validates_that_Child_is_displayed_for_TenYTL();
		ProductPage.validates_that_Child_is_displayed_for_HII();
	}
	@Then("^Verify HLDD,DII are not available$")
	public void verify_HLDD_DII_are_not_available_for_Self() throws Throwable {
		ProductPage.validate_High_Limit_Death_Insurance_Product_is_not_displayed();
		ProductPage.validate_Disability_Income_Insurance_Product_is_not_displayed();
	}

	@Then("^Verify Available Product List HLDD,DII$")
	public void verify_Available_Product_List_HLDD_DII() throws Throwable {
		ProductPage.validate_High_Limit_Death_Insurance_Product_is_displayed();
		ProductPage.validate_Disability_Income_Insurance_Product_is_displayed();
	}

	@Then("^Verify HLDD,DII,HII are not available$")
	public void verify_HLDD_DII_HII_are_not_available() throws Throwable {
		ProductPage.validate_High_Limit_Death_Insurance_Product_is_not_displayed();
		ProductPage.validate_Disability_Income_Insurance_Product_is_not_displayed();
		ProductPage.validate_Hospital_Indemnity_Insurance_Product_is_not_displayed();

	}

	@Then("^Verify TermLife,TenYTL,TwentyYTL available for Spouse$")
	public void verify_TermLife_TenYTL_TwentyYTL_available_for_Spouse() throws Throwable {
		ProductPage.validates_that_Spouse_is_displayed_for_TermLife();
		ProductPage.validates_that_Spouse_is_displayed_for_TenYTL();
		ProductPage.validates_that_Spouse_is_displayed_for_TwentyYTL();
	}

// Note: ARTL is same as TermLife of other Sites***********//
	@Then("^Verify Available Product List ARTL,TenYTL$")
	public void verify_Available_Product_List_ARTL_TenYTL() throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
	}

	@Then("^Verify Available Product List ARTL,TenYTL,AOD,DIP,BOE$")
	public void verify_Available_Product_List_ARTL_TenYTL_AOD_DIP_BOE() throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Accident_only_Insurance_Product_is_available();
		ProductPage.validate_Disability_Income_Insurance_Product_is_displayed();
		ProductPage.Validates_that_PO_or_OO_or_BOE_is_displayed();
	}

	@Then("^Verify Available Product List TermLife,TenYTL,HLDD,DII,HII$")
	public void Verify_Available_Product_List_TermLife_TenYTL_HLDD_DII_HII()
			throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_High_Limit_Death_Insurance_Product_is_displayed();
		ProductPage.validate_Disability_Income_Insurance_Product_is_displayed();
		ProductPage.validate_Hospital_Indemnity_Insurance_Product_is_displayed();
	}

	@Then("^Verify that Member and Spouse are not displayed for HII$")
	public void verify_that_Member_and_Spouse_are_not_displayed() throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_HII();
		ProductPage.validates_that_Spouse_is_not_displayed_for_HII();
	}

	// AAFP
	

	

	@Then("^Validates that DII and PO are not displayed$")
	public void Validates_that_DII_and_PO_are_not_displayed()throws Throwable {
		ProductPage.Validates_that_PO_or_OO_or_BOE_is_not_displayed();
		ProductPage.validate_Disability_Income_Insurance_Product_is_not_displayed();
	}

	@Then("^Validates that PO is not displayed$")
	public void Validates_that_PO_is_not_displayed() throws Throwable {

		ProductPage.Validates_that_PO_or_OO_or_BOE_is_not_displayed();
	}
	
	@Then("^Validates that GDI and GOOEI are not displayed$")
	public void Validates_that_GDI_and_GOOEI_are_not_displayed()throws Throwable {
		ProductPage.Validates_that_PO_or_OO_or_BOE_is_not_displayed();
		ProductPage.validate_Disability_Income_Insurance_Product_is_not_displayed();
	}

	// Method already commented

	/*
	 * @Then("^Product page details are displayed to user and Selects the product DII for Self$"
	 * ) public void
	 * product_page_details_are_displayed_to_user_and_Selects_the_product_DII_for_Self
	 * () throws Throwable { // ProductPage.
	 * product_page_details_are_displayed_to_user_and_Selects_the_product_DII_for_Self
	 * (); }
	 */

	/*
	 * @Then("^Verify Error Message on Product Page$") public void
	 * verify_Error_Message_on_Product_Page() throws Throwable { // Write code here
	 * that turns the phrase above into concrete actions throw new
	 * PendingException(); }
	 */

	// AAFP

	@Then("^Validates that Self is not displayed for TermLife,TenYTL,TwentyYTL$")
	public void validates_that_Self_is_not_displayed_for_TermLife_TenYTL_TwentyYTL() throws Throwable {

		ProductPage.validates_that_Self_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_not_displayed_for_TwentyYTL();

	}

	@Then("^Validates that Self is not displayed for TermLife,TwentyYTL$")
	public void validates_that_Self_is_not_displayed_for_TermLife_TwentyYTL() throws Throwable {

		ProductPage.validates_that_Self_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_not_displayed_for_TwentyYTL();

	}
	
	@Then("^Validates that Spouse is not displayed for DII$")
	public void validates_that_Spouse_is_not_displayed_for_DII() throws Throwable {
		 ProductPage.validates_that_Spouse_is_not_displayed_for_DII();
	}

	@Then("^Validates that Child is not displayed for DII$")
	public void validates_that_Child_is_not_displayed_for_DII() throws Throwable {
		 ProductPage.validates_that_Child_is_not_displayed_for_DII();
	}

	@Then("^Validates that Child is displayed for TermLife,TenYTL,TwentyYTL$")
	public void validates_that_Child_is_displayed_for_TermLife_TenYTL_TwentyYTL() throws Throwable {
		ProductPage.validates_that_Child_is_displayed_for_TermLife();
		ProductPage.validates_that_Child_is_displayed_for_TenYTL();
		ProductPage.validates_that_Child_is_displayed_for_TwentyYTL();
	}
	
	@Then("^Validates that Child is displayed for GTTLI,GTenYTL,GTwentyYTL$")
	public void validates_that_Child_is_displayed_for_GTTLI_GTenYTL_GTwentyYTL() throws Throwable {
		ProductPage.validates_that_Child_is_displayed_for_TermLife();
		ProductPage.validates_that_Child_is_displayed_for_TenYTL();
		ProductPage.validates_that_Child_is_displayed_for_TwentyYTL();
	}
	
	@Then("^Validates that Child is displayed for TenYTL,TwentyYTL$")
	public void validates_that_Child_is_displayed_for_TenYTL_TwentyYTL() throws Throwable {
		ProductPage.validates_that_Child_is_displayed_for_TenYTL();
		ProductPage.validates_that_Child_is_displayed_for_TwentyYTL();
	}

	@Then("^Validates that Self is not displayed at product page for TermLife, TenYTL, FifteenYTL, TwentyYTL, ADDI, LTD, HII$")

	public void validates_that_Self_is_not_displayed_at_product_page_for_TermLife_TenYTL_FifteenYTL_TwentyYTL_ADDI_LTD_HII()
			throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_not_displayed_for_FifteenYTL();
		ProductPage.validates_that_Self_is_not_displayed_for_TwentyYTL();
		ProductPage.validates_that_Self_is_not_displayed_for_ADDI();
		ProductPage.validates_that_Self_is_not_displayed_for_LTD();
		ProductPage.validates_that_Self_is_not_displayed_for_HII();

	}

	@Then("^Validates that Spouse is not displayed for TermLife,TenYTL,TwentyYTL$")
	public void validates_that_Spouse_is_not_displayed_for_TermLife_TenYTL_TwentyYTL() throws Throwable {

		ProductPage.validates_that_Spouse_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TwentyYTL();
	}

	@Then("^Validates that Self is not displayed at product page for TermLife, TenYTL, FifteenYTL, TwentyYTL, ADDI, LTD, STD, SDI,OOEDI$")
	public void validates_that_Self_is_not_displayed_at_product_page_for_TermLife_TenYTL_FifteenYTL_TwentyYTL_ADDI_LTD_STD_SDI_OOEDI()
			throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_not_displayed_for_FifteenYTL();
		ProductPage.validates_that_Self_is_not_displayed_for_TwentyYTL();
		ProductPage.validates_that_Self_is_not_displayed_for_ADDI();
		ProductPage.validates_that_Self_is_not_displayed_for_LTD();
		ProductPage.validates_that_Self_is_not_displayed_for_MIDT_or_STD();
		ProductPage.validates_that_Self_is_not_displayed_for_SDI_or_LTDPlus();
		ProductPage.validates_that_Self_is_not_displayed_for_PO_or_OOEDI_or_BOE();
	}

	@Then("^Validates that Self is not displayed at product page for SDI, OOEDI$")
	public void validates_that_Self_is_not_displayed_at_product_page_for_SDI_OOEDI() throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_SDI_or_LTDPlus();
		ProductPage.validates_that_Self_is_not_displayed_for_PO_or_OOEDI_or_BOE();
	}

	@Then("^Validates that Self is not displayed at product page for SDI$")
	public void validates_that_Self_is_not_displayed_at_product_page_for_SDI() throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_SDI_or_LTDPlus();
	}

	@Then("^Validates that Self is displayed at product page for TermLife, TenYTL, FifteenYTL, TwentyYTL, ADDI, LTD, STD, OOEDI, SDI, HII$")
	public void validates_that_Self_is_displayed_at_product_page_for_TermLife_TenYTL_FifteenYTL_TwentyYTL_ADDI_LTD_STD_OOEDI_SDI_HII()
			throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_displayed_for_FifteenYTL();
		ProductPage.validates_that_Self_is_displayed_for_TwentyYTL();
		ProductPage.validates_that_Self_is_displayed_for_ADDI();
		ProductPage.validates_that_Self_is_displayed_for_LTD();
		ProductPage.validates_that_Self_is_displayed_for_MIDT_or_STD();
		ProductPage.validates_that_Self_is_displayed_for_SDI_or_LTDPlus();
		ProductPage.validates_that_Self_is_displayed_for_PO_or_OOEDI_or_BOE();
		ProductPage.validates_that_Self_is_displayed_for_HII();
	}

	@Then("^Validates that Self is displayed at product page for TermLife, TenYTL, FirstToDieTermLife, HLAI, DII, IHI$")
	public void validates_that_Self_is_displayed_at_product_page_for_TermLife_TenYTL_FirstToDieTermLife_HLAI_DII_IHI() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_displayed_for_FirstToDie_TLI();
		ProductPage.validates_that_Self_is_displayed_for_GADD();
		ProductPage.validates_that_Self_is_displayed_for_DII();	
		ProductPage.validates_that_Self_is_displayed_for_HII();
	}
	
	@Then("^Validates that Self is displayed at product page for TermLife, TenYTL, HLAI, IHI$")
	public void validates_that_Self_is_displayed_at_product_page_for_TermLife_TenYTL_HLAI_IHI() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_displayed_for_GADD();
		ProductPage.validates_that_Self_is_displayed_for_HII();
	}
	
	@Then("^Validates that Spouse is displayed at product page for TermLife, TenYTL, HLAI, IHI$")
	public void validates_that_Spouse_is_displayed_at_product_page_for_TermLife_TenYTL_HLAI_IHI() throws Throwable {
		ProductPage.validates_that_Spouse_is_displayed_for_TermLife();
		ProductPage.validates_that_Spouse_is_displayed_for_TenYTL();
		ProductPage.validates_that_Spouse_is_displayed_for_GADD();
		ProductPage.validates_that_Spouse_is_displayed_for_HII();
	}
	
	@Then("^Validates that Self is displayed at product page for TermLife, HLAI, IHI$")
	public void validates_that_Self_is_displayed_at_product_page_for_TermLife_HLAI_IHI() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_displayed_for_GADD();
		ProductPage.validates_that_Self_is_displayed_for_HII();
	}
	
	@Then("^Validates that Spouse is displayed at product page for TermLife, HLAI, IHI$")
	public void validates_that_Spouse_is_displayed_at_product_page_for_TermLife_HLAI_IHI() throws Throwable {
		ProductPage.validates_that_Spouse_is_displayed_for_TermLife();
		ProductPage.validates_that_Spouse_is_displayed_for_GADD();
		ProductPage.validates_that_Spouse_is_displayed_for_HII();
	}
	
	@Then("^Validates that Self is displayed at product page for IHI$")
	public void validates_that_Self_is_displayed_at_product_page_for_IHI() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_HII();
	}
	
	@Then("^Validates that Spouse is displayed at product page for IHI$")
	public void validates_that_Spouse_is_displayed_at_product_page_for_IHI() throws Throwable {
		ProductPage.validates_that_Spouse_is_displayed_for_HII();
	}
	
	@Then("^Validates that Self is displayed at product page for TermLife, TenYTL, HLAI, DII, IHI$")
	public void validates_that_Self_is_displayed_at_product_page_for_TermLife_TenYTL_HLAI_DII_IHI() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_displayed_for_GADD();
		ProductPage.validates_that_Self_is_displayed_for_DII();	
		ProductPage.validates_that_Self_is_displayed_for_HII();
	}
	
	@Then("^Validates that Self is displayed at product page for GTenYTL,GDIILT,GDIIST$")
	public void validates_that_Self_is_displayed_at_product_page_for_GTenYTL_GDIILT_GDIIST() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_displayed_for_LTD();
		ProductPage.validates_that_Self_is_displayed_for_MIDT_or_STD();
	}
	
	@Then("^Validates that Self is displayed at product page for GTTLI,GTenYTL,GDIILT,GDIIST,CI$")
	public void validates_that_Self_is_displayed_at_product_page_for_GTTLI_GTenYTL_GDIILT_GDIIST_CI() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_displayed_for_LTD();
		ProductPage.validates_that_Self_is_displayed_for_MIDT_or_STD();
		ProductPage.validates_that_Self_is_displayed_for_CI();
	}
	
	@Then("^Validates that Self is displayed at product page for GTTLI,CI$")
	public void validates_that_Self_is_displayed_at_product_page_for_GTTLI_CI() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_displayed_for_CI();
	}
	
	@Then("^Validates that Self is displayed at product page for GTTLI,GTenYTL,GDIILT,GDIIST,GPOEI,CI$")
	public void validates_that_Self_is_displayed_at_product_page_for_GTTLI_GTenYTL_GDIILT_GDIIST_GPOEI_CI() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_displayed_for_LTD();
		ProductPage.validates_that_Self_is_displayed_for_MIDT_or_STD();
		ProductPage.validates_that_Self_is_displayed_for_PO_or_OOEDI_or_BOE();
		ProductPage.validates_that_Self_is_displayed_for_CI();
	}
	
	@Then("^Validates that Self is displayed at product page for GTTLI,GTenYTL,GTwentyYTL,GDIILT,GDIIST,GPOEI,CI$")
	public void validates_that_Self_is_displayed_at_product_page_for_GTTLI_GTenYTL_GTwentyYTL_GDIILT_GDIIST_GPOEI_CI() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_displayed_for_TwentyYTL();
		ProductPage.validates_that_Self_is_displayed_for_LTD();
		ProductPage.validates_that_Self_is_displayed_for_MIDT_or_STD();
		ProductPage.validates_that_Self_is_displayed_for_PO_or_OOEDI_or_BOE();
		ProductPage.validates_that_Self_is_displayed_for_CI();
	}
	
	@Then("^Validates that Self is displayed at product page for GTTLI,GTenYTL,GTwentyYTL,CI$")
	public void validates_that_Self_is_displayed_at_product_page_for_GTTLI_GTenYTL_GTwentyYTL_CI() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_displayed_for_TwentyYTL();		
		ProductPage.validates_that_Self_is_displayed_for_CI();
	}

	@Then("^Validates that Self is not displayed at product page for FifteenYTL, ADDI, LTD, STD, OOEDI, SDI, HII$")
	public void validates_that_Self_is_not_displayed_at_product_page_for_FifteenYTL_ADDI_LTD_STD_OOEDI_SDI_HII()
			throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_FifteenYTL();
		ProductPage.validates_that_Self_is_not_displayed_for_ADDI();
		ProductPage.validates_that_Self_is_not_displayed_for_LTD();
		ProductPage.validates_that_Self_is_not_displayed_for_MIDT_or_STD();
		ProductPage.validates_that_Self_is_not_displayed_for_PO_or_OOEDI_or_BOE();
		ProductPage.validates_that_Self_is_not_displayed_for_SDI_or_LTDPlus();
		ProductPage.validates_that_Self_is_not_displayed_for_HII();
	}

	@Then("^Validates that Self is not displayed at product page for FifteenYTL, STD, SDI, HII$")
	public void validates_that_Self_is_not_displayed_at_product_page_for_FifteenYTL_STD_SDI_HII() throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_FifteenYTL();
		ProductPage.validates_that_Self_is_not_displayed_for_MIDT_or_STD();
		ProductPage.validates_that_Self_is_not_displayed_for_SDI_or_LTDPlus();
		ProductPage.validates_that_Self_is_not_displayed_for_HII();
	}

	@Then("^Validates that Self is not displayed at product page for STD, SDI, HII$")
	public void validates_that_Self_is_not_displayed_at_product_page_for_STD_SDI_HII() throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_MIDT_or_STD();
		ProductPage.validates_that_Self_is_not_displayed_for_SDI_or_LTDPlus();
		ProductPage.validates_that_Self_is_not_displayed_for_HII();
	}

	@Then("^Validates that Self is not displayed at product page for LTD, STD, SDI, OOEDI$")
	public void validates_that_Self_is_not_displayed_at_product_page_for_LTD_STD_SDI_OOEDI() throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_LTD();
		ProductPage.validates_that_Self_is_not_displayed_for_MIDT_or_STD();
		ProductPage.validates_that_Self_is_not_displayed_for_SDI_or_LTDPlus();
		ProductPage.validates_that_Self_is_not_displayed_for_PO_or_OOEDI_or_BOE();

	}

	@Then("^Validates that Self is not displayed at product page for LTD, STD, OOEDI$")
	public void validates_that_Self_is_not_displayed_at_product_page_for_LTD_STD_OOEDI() throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_LTD();
		ProductPage.validates_that_Self_is_not_displayed_for_MIDT_or_STD();
		ProductPage.validates_that_Self_is_not_displayed_for_PO_or_OOEDI_or_BOE();

	}

	@Then("^Validate Error Message on Product Page$")
	public void validate_Error_Message_on_Product_Page() throws Throwable {
		ProductPage.validate_Error_Message_on_Product_Page();

	}

	@Then("^Validates that Spouse is not displayed for TenYTL$")
	public void validates_that_Spouse_is_not_displayed_for_TenYTL() throws Throwable {
		ProductPage.validates_that_Spouse_is_not_displayed_for_TenYTL();
	}

	@Then("^Validates that Spouse is displayed only for TenYTL$")
	public void validates_that_Spouse_is_displayed_only_for_TenYTL() throws Throwable {
		ProductPage.validates_that_Spouse_is_displayed_for_TenYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TwentyYTL();

	}
	
	@Then("^Validates that Spouse is displayed for TenYTL$")
	public void validates_that_Spouse_is_displayed_for_TenYTL() throws Throwable {
		ProductPage.validates_that_Spouse_is_displayed_for_TenYTL();
	}
	
	@Then("^Validates that Spouse is displayed for Flex10$")
	public void validates_that_Spouse_is_displayed_for_Flex10() throws Throwable {
		ProductPage.validates_that_Spouse_is_displayed_for_TenYTL();
	}

	@Then("^Validates that Spouse is not displayed for TwentyYTL$")
	public void validates_that_Spouse_is_not_displayed_for_TwentyYTL() throws Throwable {
		ProductPage.validates_that_Spouse_is_not_displayed_for_TwentyYTL();

	}

	@Then("^Validates that Child is not displayed for TermLife,TenYTL,TwentyYTL$")
	public void validates_that_Child_is_not_displayed_for_TermLife_TenYTL_TwentyYTL() throws Throwable {
		ProductPage.validates_that_Child_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Child_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Child_is_not_displayed_for_TwentyYTL();
	}

	// TIE
	@Then("^Validates that Child is not displayed for TermLife,TenYTL,ADDI$")
	public void validates_that_Child_is_not_displayed_for_TermLife_TenYTL_ADDI() throws Throwable {
		ProductPage.validates_that_Child_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Child_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Child_is_not_displayed_for_ADDI();

	}

	@Then("^Verify Error Message for ATLEAST ONE PRODUCT is displayed on Product page$")
	public void verify_Error_Message_for_ATLEAST_ONE_PRODUCT_is_displayed_on_Product_page() throws Throwable {
		ProductPage.verify_Error_Message_for_ATLEAST_ONE_PRODUCT_is_displayed_on_Product_page();
	}

	@Then("^Validates that Self & Spouse are not displayed at product page for TermLife, TenYTL, FifteenYTL, TwentyYTL, HII$")

	public void validates_that_Self_Spouse_are_not_displayed_at_product_page_for_TermLife_TenYTL_FifteenYTL_TwentyYTL_HII()
			throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_TermLife();

		ProductPage.validates_that_Spouse_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_not_displayed_for_FifteenYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_FifteenYTL();
		ProductPage.validates_that_Self_is_not_displayed_for_TwentyYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TwentyYTL();
		ProductPage.validates_that_Self_is_not_displayed_for_HII();
		ProductPage.validates_that_Spouse_is_not_displayed_for_HII();
	}

	@Then("^Validates that Self & Spouse are not displayed at product page for TermLife, TenYTL, FifteenYTL, TwentyYTL$")
	public void validates_that_Self_Spouse_are_not_displayed_at_product_page_for_TermLife_TenYTL_FifteenYTL_TwentyYTL()
			throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_not_displayed_for_FifteenYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_FifteenYTL();
		ProductPage.validates_that_Self_is_not_displayed_for_TwentyYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TwentyYTL();

	}

	@Then("^Validates that Spouse is not displayed at product page for TermLife, TenYTL, FifteenYTL, TwentyYTL, ADDI, LTD, HII$")
	public void validates_that_Spouse_is_not_displayed_at_product_page_for_TermLife_TenYTL_FifteenYTL_TwentyYTL_ADDI_LTD_HII()
			throws Throwable {
		ProductPage.validates_that_Spouse_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_FifteenYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TwentyYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_ADDI();
		ProductPage.validates_that_Spouse_is_not_displayed_for_LTD();
		ProductPage.validates_that_Spouse_is_not_displayed_for_HII();

	}
	
	@Then("^Validates that Spouse is not displayed at product page for TermLife, TenYTL, HLAI, DII, IHI$")
	public void validates_that_Spouse_is_not_displayed_at_product_page_for_TermLife_TenYTL_HLAI_DII_IHI()
			throws Throwable {
		ProductPage.validates_that_Spouse_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_GADD();
		ProductPage.validates_that_Spouse_is_not_displayed_for_DII();
		ProductPage.validates_that_Spouse_is_not_displayed_for_HII();

	}
	

	@Then("^Validates that only HII is displayed for Spouse")
	public void validates_that_only_HII_is_displayed_for_Spouse() throws Throwable {
		ProductPage.validates_that_Spouse_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_FifteenYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TwentyYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_ADDI();
		ProductPage.validates_that_Spouse_is_not_displayed_for_LTD();
		ProductPage.validates_that_Spouse_is_displayed_for_HII();

	}

	@Then("^Validate the following products are displayed: GroupTerm TenYTL TwentyYTL$")
	public void validates_the_following_products_are_displayed_GroupTerm_TenYTL_TwentyYTL() throws Throwable {
		ProductPage.validate_Five_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_displayed();
	}
	
	@Then("^Validate the following products are displayed: GTLP75I,Flex10,Flex20$")
	public void validates_the_following_products_are_displayed_GTLP75I_Flex10_Flex20() throws Throwable {
		ProductPage.validate_Five_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_displayed();
	}
	
	@Then("^Validate the following products are displayed: GTLP75I,Flex10$")
	public void validates_the_following_products_are_displayed_GTLP75I_Flex10() throws Throwable {
		ProductPage.validate_Five_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
	}

	@Then("^Verify Available Product List GroupTerm,TenYTL,DII$")
	public void verify_Available_Product_List_GroupTerm_TenYTL_DII() throws Throwable {
		ProductPage.validate_Five_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Disability_Income_Insurance_Product_is_displayed();
	}

	@Then("^Verify Available Product List: GroupTerm,TenYTL$")
	public void verify_Available_Product_List_GroupTerm_TenYTL() throws Throwable {
		ProductPage.validate_Five_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();

	}

	@Then("^Verify Available Product List GroupTerm TenYTL,TwentyYTL,DII$")
	public void verify_Available_Product_List_GroupTerm_TenYTL_TwentyYTL_DII() throws Throwable {
		ProductPage.validate_Five_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Disability_Income_Insurance_Product_is_displayed();
	}
	


	@Then("^Validates that Self and Spouse are displayed for HII")
	public void validates_that_Self_and_Spouse_is_dispalyed_for_HII() throws Throwable {
		ProductPage.validates_that_Spouse_is_displayed_for_HII();
		ProductPage.validates_that_Self_is_displayed_for_HII();
	}

	@Then("^Validates TwentyYTL products are not displayed$")
	public void validates_TwentyYTL_product_is_not_displayed() throws Throwable {
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_not_displayed();
	}
	
	@Then("^Validates Flex20 products are not displayed$")
	public void validates_Flex20_product_is_not_displayed() throws Throwable {
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_not_displayed();
	}
	
	@Then("^Validates the following products are not displayed: GTLP75I,Flex20$")
	public void validates_GTLP75I_Flex20_product_is_not_displayed() throws Throwable {
		ProductPage.validate_GTLP75I_Product_is_not_displayed();
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_not_displayed();
	}
	
	@Then("^Validates GTwentyYTL products are not displayed$")
	public void validates_GTwentyYTL_product_is_not_displayed() throws Throwable {
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_not_displayed();
	}

	@Then("^Verify GTenYLTLI,GTwentyYLTLI,GDIILT,GDIIST,GPOEI is not displayed$")
	public void validates_GTenYLTLI_GTwentyYLTLI_GDIILT_GDIIST_GPOEI_product_is_not_displayed() throws Throwable {
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_not_displayed();
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_not_displayed();		
		ProductPage.validates_LTD_is_not_displayed();
		ProductPage.validates_MTDI_is_not_displayed();
		ProductPage.Validates_that_PO_or_OO_or_BOE_is_not_displayed();
	}
	
	@Then("^Verify GTenYLTLI,GTwentyYLTLI is not displayed$")
	public void validates_GTenYLTLI_GTwentyYLTLI_product_is_not_displayed() throws Throwable {
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_not_displayed();
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_not_displayed();	
	}
	
	@Then("^Verify GTTLI,GTwentyYLTLI,GDIILT,GDIIST,GPOEI,CI is not displayed$")
	public void validates_GTTLT_GTwentyYLTLI_GDIILT_GDIIST_GPOEI_CI_product_is_not_displayed() throws Throwable {
		ProductPage.validate_GTTLI_Product_is_not_displayed();
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_not_displayed();		
		ProductPage.validates_LTD_is_not_displayed();
		ProductPage.validates_MTDI_is_not_displayed();
		ProductPage.Validates_that_PO_or_OO_or_BOE_is_not_displayed();
		ProductPage.validates_CI_is_not_displayed();
	}
	
	@Then("^Verify GTTLI,GTwentyYLTLI,GPOEI,CI is not displayed$")
	public void validates_GTTLT_GTwentyYLTLI_GPOEI_CI_product_is_not_displayed() throws Throwable {
		ProductPage.validate_GTTLI_Product_is_not_displayed();
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_not_displayed();
		ProductPage.Validates_that_PO_or_OO_or_BOE_is_not_displayed();
		ProductPage.validates_CI_is_not_displayed();
	}
	
	@Then("^Verify product CI is not available$")
	public void validates_CI_is_not_displayed() throws Throwable {
	ProductPage.validates_CI_is_not_displayed();
	}
	@Then("^Verify GTwentyYLTLI,GPOEI is not displayed$")
	public void validates_GTwentyYLTLI_GPOEI_product_is_not_displayed() throws Throwable {
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_not_displayed();
		ProductPage.Validates_that_PO_or_OO_or_BOE_is_not_displayed();
	}
	
	@Then("^Validate that DII product is not displayed$")
	public void validates_that_DII_product_is_not_displayed() throws Throwable {
		ProductPage.validate_Disability_Income_Insurance_Product_is_not_displayed();
	}
	
	@Then("^Validate that DII product is not displayed for Self$")
	public void validates_that_DII_product_is_not_displayed_for_Self() throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_DII();
	}
	

	@Then("^Verify that DII is already selected for Self$")
	public void verify_that_DII_is_already_selected_for_Self() throws Throwable {
		ProductPage.verify_that_DII_is_already_selected_for_Self();
	}

	@Then("^Confirms Imp Replacement Info for NewYork state$")
	public void confirms_Imp_Replacement_Info_for_NewYork_state() throws Throwable {

		ProductPage.confirms_Imp_Replacement_Info_for_NewYork_state();
	}
	
	@Then("^Verify Imp Replacement Info for NewYork state checkbox is not displayed$")
	public void verify_Imp_Replacement_Info_for_NewYork_checkbox_is_not_displayed_for_Self() throws Throwable {
		ProductPage.verify_Imp_Replacement_Info_for_NewYork_checkbox_is_not_displayed_for_Self();
	}

	@And("^Validate Imp Replacement Info text for NewYork state$")
	public void validate_Imp_Replacement_Info_text_for_NewYork_state() throws Throwable {
		ProductPage.validate_Imp_Replacement_Info_for_NewYork_state();

	}

	/*@Then("^Product page details are displayed to user and selects the product as Five Year Banded Term Life insurance for self$")
	public void product_page_details_are_displayed_to_user_and_selects_the_product_as_Five_Year_Banded_Term_Life_insurance_for_self()
			throws Throwable {

		ProductPage.selects_the_product_as_FiveYr_Term_Life_insurance_for_self();

	}

	@Then("^Product page details are displayed to user and selects the product as Group Term Life Insurance Product for self$")
	public void product_page_details_are_displayed_to_user_and_selects_the_product_as_Group_Term_Life_Insurance_Product_for_self()
			throws Throwable {
		ProductPage.selects_the_product_as_FiveYr_Term_Life_insurance_for_self();
	}

	@Then("^Product page details are displayed to user and selects the product as Five Year Banded Term Life insurance for self and Spouse$")
	public void product_page_details_are_displayed_to_user_and_selects_the_product_as_Five_Year_Banded_Term_Life_insurance_for_self_and_Spouse()
			throws Throwable {

		ProductPage.selects_the_product_as_FiveYr_Term_Life_insurance_for_self();
		ProductPage.select_the_product_as_Term_Life_Insurance_for_Spouse();
	}

	@Then("^Product page details are displayed to user and selects the product as Group Term Life Insurance for self and Spouse$")
	public void product_page_details_are_displayed_to_user_and_selects_the_product_as_Group_Term_Life_Insurance_for_self_and_Spouse()
			throws Throwable {
		ProductPage.selects_the_product_as_FiveYr_Term_Life_insurance_for_self();
		ProductPage.select_the_product_as_Term_Life_Insurance_for_Spouse();
	}

	@Then("^Product page details are displayed to user and selects the product as Group Term Life Insurance for Spouse$")
	public void product_page_details_are_displayed_to_user_and_selects_the_product_as_Group_Term_Life_Insurance_for_Spouse()
			throws Throwable {
		ProductPage.select_the_product_as_Term_Life_Insurance_for_Spouse();
	}*/

	@Then("^Verify New York State paragraph is displayed for Spouse$")
	public void verify_New_York_State_paragraph_is_displayed_for_Spouse() throws Throwable {
		ProductPage.verify_New_York_State_paragraph_is_displayed_for_Self();
	}

	// ********************Self****************//

	@Then("^Selects product TenYTL for Self$")
	public void selects_product_TenYTL_for_Self() throws Throwable {
		ProductPage.selects_product_TenYTL_for_Self();
	}
	@Then("^Selects product GTenYTL for Self$")
	public void selects_product_GTenYTL_for_Self() throws Throwable {
		ProductPage.selects_product_TenYTL_for_Self();
	}
	
	@Then("^Selects product Flex10 for Self$")
	public void selects_product_Flex10_for_Self() throws Throwable {
		ProductPage.selects_product_TenYTL_for_Self();
	}
	
	@Then("^Deselects product GTenYTL for Self$")
	public void deselects_product_GTenYTL_for_Self() throws Throwable {
		ProductPage.selects_product_TenYTL_for_Self();
	}

	@Then("^Selects product GTwentyYTL for Self$")
	public void selects_product_GTwentyYTL_for_Self() throws Throwable {
		ProductPage.selects_product_TwentyYTL_for_Self();
	}

	@Then("^Selects product TwentyYTL for Self$")
	public void selects_product_TwentyYTL_for_Self() throws Throwable {
		ProductPage.selects_product_TwentyYTL_for_Self();
	}
	
	@Then("^Selects product Flex20 for Self$")
	public void selects_product_Flex20_for_Self() throws Throwable {
		ProductPage.selects_product_TwentyYTL_for_Self();
	}

	@Then("^Selects product FiftyYTL for Self$")
	public void selects_the_product_as_FiftyYTL_for_Self() throws Throwable {
		ProductPage.selects_the_product_as_FiftyYTL_for_Self();
	}
	
	@Then("^Selects product FirstToDie TLI for Self$")
	public void selects_product_FirstToDie_TLI_for_Self() throws Throwable {
	    ProductPage.selects_product_FirstToDie_TLI_for_Self();
	}
	
	@Then("^Selects product FirstToDie TLI for Spouse$")
	public void selects_product_FirstToDie_TLI_for_Spouse() throws Throwable {
	    ProductPage.selects_product_FirstToDie_TLI_for_Spouse();
	}
	
	@Then("^Verify that Spouse icon is selected for FirstToDie TLI$")
	public void verify_that_Spouse_icon_is_selected_for_FirstToDie_TLI() throws Throwable {
	    ProductPage.verify_that_Spouse_icon_is_selected_for_FirstToDie_TLI();
	    
	}
	
	//@Then("^Selects Self for Accidental Death Product$")
	@Then("^Selects product Accidental Death for Self$")
	public void selects_Self_for_AccidentalDeath_Product() throws Throwable {
		ProductPage.selects_Self_for_Accidental_Death_Product();
	}

	
	@Then("^Deselects Self for Accidental Death Product$")
	public void deselects_Self_for_Accidental_Death_Product() throws Throwable {
		ProductPage.selects_Self_for_Accidental_Death_Product();
	}


	@Then("^Selects product LTDPlus for Self$")
	public void selects_product_LTDPlus_for_Self() throws Throwable {
		ProductPage.selects_product_LTDPlus_for_Self();
	}

	@Then("^Selects product LTD for Self$")
	public void selects_product_LTD_for_Self() throws Throwable {
		ProductPage.selects_product_LTD_for_Self();
	}

	@Then("^Selects product MTDI for Self$")
	public void selects_product_MTDI_for_Self() throws Throwable {
		ProductPage.selects_product_MTDI_for_Self();
	}

	@Then("^Selects product CI for Self$")
	public void selects_product_CI_for_Self() throws Throwable {
		ProductPage.selects_product_CI_for_Self();
	}

	@Then("^Selects product RDI for Self$")
	public void selects_product_RDI_for_Self() throws Throwable {
		ProductPage.selects_product_RDI_for_Self();
	}

	@Then("^Selects product POEDI for Self$")
	public void selects_product_POEDI_for_Self() throws Throwable {
		ProductPage.selects_product_POEDI_for_Self();
	}
	
	@Then("^Selects product GPOEI for Self$")
	public void selects_product_GPOEI_for_Self() throws Throwable {
		ProductPage.selects_product_POEDI_for_Self();
	}

	@Then("^Selects product HMI for Self$")
	public void selects_product_HMI_for_Self() throws Throwable {
		ProductPage.selects_product_HII_for_Self();
	}//changes
	
	@Then("^Selects product InHospitalInsurance for Self$")
	public void selects_product_InHospitalInsurance_for_Self() throws Throwable {
		ProductPage.selects_product_HII_for_Self();
	}

	@Then("^Clicks on Add Company button for overhead products$")
	public void clicks_on_Add_Company_button_overhead_products() throws Throwable {
		ProductPage.clicks_on_Add_Company_button_overhead_product();
	}

	@Then("^Selects product ARTL for Self$")
	public void selects_product_ARTL_for_Self() throws Throwable {
		ProductPage.selects_product_TermLife_for_Self();
	}

	@Then("^Selects product AOD for Self$")
	public void selects_product_AOD_for_Self() throws Throwable {
		ProductPage.selects_product_AccidentOnly_for_Self();
	}

	@Then("^Selects product BOE for Self$")
	public void selects_product_BOE_for_Self() throws Throwable {
		ProductPage.selects_product_PO_or_BOE_or_OO_for_Self();
	}
	
	@Then("^Selects product GOOEI for Self$")
	public void selects_product_GOOEI_for_Self() throws Throwable {
		ProductPage.selects_product_PO_or_BOE_or_OO_for_Self();
	}
	
	@Then("^Validates the following products are not displayed for Self: GTLI, TenYTL, GADD, GDI, GOOEI$")
	public void validates_that_Self_is_not_displayed_at_product_page_for_GTLI_TenYTL_GADD_GDI_GOOEI() throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_not_displayed_for_GADD();
		ProductPage.validates_that_Self_is_not_displayed_for_DII();
		ProductPage.validates_that_Self_is_not_displayed_for_PO_or_OOEDI_or_BOE();
	}

	/*-------------------------------ASCE Site-----------------------------*/

	@Then("^Selects product TermLife for Self$")
	public void selects_product_TermLife_for_Self() throws Throwable {
		ProductPage.selects_product_TermLife_for_Self();
	}
	
	@Then("^Selects product GTLI for Self$")
	public void selects_product_GTLI_for_Self() throws Throwable {
		ProductPage.selects_product_TermLife_for_Self();
	}
	
	@Then("^Selects product GTTLI for Self$")
	public void selects_product_GTTLI_for_Self() throws Throwable {
		ProductPage.selects_product_TermLife_for_Self();
	}
	
	@Then("^Deselects product GTTLI for Self$")
	public void deselects_product_GTTLI_for_Self() throws Throwable {
		ProductPage.selects_product_TermLife_for_Self();
	}
	
	@Then("^Deselects product TermLife for Self$")
	public void deselects_product_TermLife_for_Self() throws Throwable {
		ProductPage.selects_product_TermLife_for_Self();
	}

	@Then("^Selects product HLDD for Self$")
	public void selects_product_HLDD_for_Self() throws Throwable {
		ProductPage.selects_Self_for_Accidental_Death_Product();
	}

	@Then("^Selects product DII for Self$")
	public void selects_product_DII_for_Self() throws Throwable {
		ProductPage.selects_product_DII_for_Self();
	}
	
	@Then("^Selects product GDI for Self$")
	public void selects_product_GDI_for_Self() throws Throwable {
		ProductPage.selects_product_DII_for_Self();
	}
	@Then("^Selects product GDII for Self$")
	public void selects_product_GDII_for_Self() throws Throwable {
		ProductPage.selects_product_LTD_for_Self();
	}
	
	@Then("^Deselects product GDIILT for Self$")
	public void deselects_product_GDIILT_for_Self() throws Throwable {
		ProductPage.selects_product_LTD_for_Self();
	}
	
	@Then("^Selects product DIP for Self$")
	public void selects_product_DIP_for_Self() throws Throwable {
		ProductPage.selects_product_DII_for_Self();
	}

	@Then("^Selects product HII for Self$")
	public void selects_product_HII_for_Self() throws Throwable {
		ProductPage.selects_product_HII_for_Self();
	}
	
	@Then("^Selects product GHII for Self$")
	public void selects_product_GHII_for_Self() throws Throwable {
		ProductPage.selects_product_HII_for_Self();
	}

	@Then("^Selects product STD for Self$")
	public void selects_product_STD_for_Self() throws Throwable {
		ProductPage.selects_product_MTDI_for_Self();
	}
	
	@Then("^Selects product GDIIST for Self$")
	public void selects_product_GDIIST_for_Self() throws Throwable {
		ProductPage.selects_product_MTDI_for_Self();
	}
	
	@Then("^Deselects product GDIIST for Self$")
	public void deselects_product_GDIIST_for_Self() throws Throwable {
		ProductPage.selects_product_MTDI_for_Self();
	}

	@Then("^Selects product OOEDI for Self$")
	public void selects_product_OOEDI_for_Self() throws Throwable {
		ProductPage.selects_product_POEDI_for_Self();
	}

	@Then("^Selects product SDI for Self$")
	public void selects_product_SDI_for_Self() throws Throwable {
		ProductPage.selects_product_LTDPlus_for_Self();
	}

	@Then("^Selects product FifteenYTL for Self$")
	public void selects_product_FifteenYTL_for_Self() throws Throwable {
		ProductPage.selects_the_product_FifteenYTL_for_Self();
	}


//AAFP-Self

	@Then("^Selects product PO for Self$")
	public void selects_product_PO_for_Self() throws Throwable {
		ProductPage.selects_product_PO_or_BOE_or_OO_for_Self();
	}

	/*------------AGOG------------------------*/
	@Then("^Selects product Group Term for Self$")
	public void selects_product_Group_Term_for_Self() throws Throwable {
		ProductPage.selects_the_product_as_FiveYr_Term_Life_insurance_for_self();
	}

	// ***************************** SPOUSE PRODUCT
	// *************************************//

	@Then("^Selects product GTenYTL for Spouse$")
	public void selects_product_GTenYTL_for_Spouse() throws Throwable {
		ProductPage.selects_product_for_Spouse_as_Ten_YTL();
	}
	
	@Then("^Selects product FiveYTL for Spouse$")
	public void selects_the_product_for_Spouse_as_Five_YearTL() throws Throwable {
		ProductPage.selects_product_FiveYr_Term_Life_Insurance_Spouse();
	}

	@Then("^Selects product TenYTL for Spouse$")
	public void selects_product_for_Spouse_as_Ten_YTL() throws Throwable {
		ProductPage.selects_product_for_Spouse_as_Ten_YTL();
	}
	
	@Then("^Selects product Flex10 for Spouse$")
	public void selects_product_for_Spouse_as_Flex10() throws Throwable {
		ProductPage.selects_product_for_Spouse_as_Ten_YTL();
	}

	@Then("^Selects product TwentyYTL for Spouse$")
	public void selects_the_product_TwentyYTL_for_Spouse() throws Throwable {
		ProductPage.selects_the_product_TwentyYTL_for_Spouse();
	}
	
	@Then("^Selects product GTwentyYTL for Spouse$")
	public void selects_the_product_GTwentyYTL_for_Spouse() throws Throwable {
		ProductPage.selects_the_product_TwentyYTL_for_Spouse();
	}
	
	@Then("^Selects product Flex20 for Spouse$")
	public void selects_the_product_Flex20_for_Spouse() throws Throwable {
		ProductPage.selects_the_product_TwentyYTL_for_Spouse();
	}

	@Then("^Selects product ARTL for Spouse$")
	public void selects_product_ARTL_for_Spouse() throws Throwable {
		ProductPage.selects_product_TermLife_for_Spouse();
	}

	@Then("^Selects product AOD for Spouse$")
	public void selects_product_AOD_for_Spouse() throws Throwable {
		ProductPage.selects_product_AccidentOnly_for_Spouse();
	}

	@Then("^Validates that Spouse is displayed for MLI,TenYTL on product page$")
	public void verify_Spouse_Is_Displayed_For_MLI_TenYTL() throws Throwable {
		ProductPage.verify_Spouse_Is_Displayed_For_MLI();
		ProductPage.validates_that_Spouse_is_displayed_for_TenYTL();
	}

	@Then("^Validates that Spouse is displayed for MLI,TenYTL,TwentyYTL on product page$")
	public void verify_Spouse_Is_Displayed_For_MLI_TenYTL_TwentyYTL() throws Throwable {
		ProductPage.verify_Spouse_Is_Displayed_For_MLI();
		ProductPage.validates_that_Spouse_is_displayed_for_TenYTL();
		ProductPage.validates_that_Spouse_is_displayed_for_TwentyYTL();
	}
	
	@Then("^Verify Available Product List for Spouse as GTTLI$")
	public void verify_Spouse_displayed_for_GTTLI() throws Throwable {
	ProductPage.validates_that_Spouse_is_displayed_for_TermLife();
}
	/*-------------------------------ASCE Site-----------------------------*/

	@Then("^Selects product FiftyYTL for Spouse$")
	public void selects_Product_for_Spouse_as_FiftyYTL() throws Throwable {
		ProductPage.selects_Product_for_Spouse_as_FiftyYTL();
	}


	//@Then("^Selects Spouse for Accidental Death Product$")	
	@Then("^Selects product Accidental Death for Spouse$")
	public void selects_Spouse_for_AccidentalDeath_Product() throws Throwable {
		ProductPage.selects_Spouse_for_Accidental_Death_Product();
	}

	@Then("^Selects product LTDPlus for Spouse$")
	public void selects_product_LTDPlus_for_Spouse() throws Throwable {
		ProductPage.selects_product_LTDPlus_for_Spouse();
	}

	@Then("^Selects product LTD for Spouse$")
	public void selects_product_LTD_for_Spouse() throws Throwable {
		ProductPage.selects_product_LTD_for_Spouse();
	}

	@Then("^Selects product MTDI for Spouse$")
	public void selects_product_MTDI_for_Spouse() throws Throwable {
		ProductPage.selects_product_MTDI_for_Spouse();
	}

	@Then("^Selects product CI for Spouse$")
	public void selects_product_CI_for_Spouse() throws Throwable {
		ProductPage.selects_product_CI_for_Spouse();
	}

	@Then("^Selects product HMI for Spouse$")
	public void selects_product_HMI_for_Spouse() throws Throwable {
		ProductPage.selects_product_HII_for_Spouse();
	}//chnages
	
	@Then("^Selects product InHospitalInsurance for Spouse$")
	public void selects_product_InHospitalInsurance_for_Spouse() throws Throwable {
		ProductPage.selects_product_HII_for_Spouse();
	}

	@Then("^Selects product FifteenYTL for Spouse$")
	public void selects_product_FifteenYTL_for_Spouse() throws Throwable {
		ProductPage.selects_the_product_FifteenYTL_for_Spouse();
	}

	/*-------------------------------ASCE Site-----------------------------*/

	/*-------------------------------ACOG Site-----------------------------*/

	@Then("^Selects product Group Term for Spouse$")
	public void selects_product_Group_Term_for_Spouse() throws Throwable {
		ProductPage.selects_product_FiveYr_Term_Life_Insurance_Spouse();
	}

	@Then("^Selects product TermLife for Spouse$")
	public void selects_product_TermLife_for_Spouse() throws Throwable {
		ProductPage.selects_product_TermLife_for_Spouse();
	}
	
	@Then("^Selects product GTLI for Spouse$")
	public void selects_product_GTLI_for_Spouse() throws Throwable {
		ProductPage.selects_product_TermLife_for_Spouse();
	}
	
	@Then("^Selects product GTTLI for Spouse$")
	public void selects_product_GTTLI_for_Spouse() throws Throwable {
		ProductPage.selects_product_TermLife_for_Spouse();
	}
	
	@Then("^Deselects product GTTLI for Spouse$")
	public void deselects_product_GTTLI_for_Spouse() throws Throwable {
		ProductPage.selects_product_TermLife_for_Spouse();
	}

	@Then("^Selects product HLDD for Spouse$")
	public void selects_product_HLDD_for_Spouse() throws Throwable {
		ProductPage.selects_Spouse_for_Accidental_Death_Product();
	}

	@Then("^Selects product DII for Spouse$")
	public void selects_product_DII_for_Spouse() throws Throwable {
		ProductPage.selects_product_DII_for_Spouse();
	}

	@Then("^Selects product HII for Spouse$")
	public void selects_product_HII_for_Spouse() throws Throwable {
		ProductPage.selects_product_HII_for_Spouse();
	}

	@Then("^Selects product GHII for Spouse$")
	public void selects_product_GHII_for_Spouse() throws Throwable {
		ProductPage.selects_product_HII_for_Spouse();
	}
	@Then("^Selects the product for Self, Spouse and Children for Five Year Banded Term Life insurance$")
	public void selects_the_product_for_Self_Spouse_and_Children_for_Five_Year_Banded_Term_Life_insurance()
			throws Throwable {
		ProductPage.selects_the_product_as_FiveYr_Term_Life_insurance_for_self();
		ProductPage.selects_product_FiveYr_Term_Life_Insurance_Spouse();
		ProductPage.selects_product_FiveYrTerm_Life_Insurance_Child();
	}

	@Then("^Selects the product for Self, Spouse and Children for Group Term Life Insurance$")
	public void selects_the_product_for_Self_Spouse_and_Children_for_Group_Term_Life_Insurance() throws Throwable {
		ProductPage.selects_the_product_as_FiveYr_Term_Life_insurance_for_self();
		ProductPage.selects_product_FiveYr_Term_Life_Insurance_Spouse();
		ProductPage.selects_product_FiveYrTerm_Life_Insurance_Child();
	}

	
	
	// ***************************** CHILD PRODUCT
	// *************************************//


	//@Then("^Selects Child for Accidental Death Product$")
	@Then("^Selects product Accidental Death for Child$")
	public void selects_Child_for_AccidentalDeath_Product() throws Throwable {
		ProductPage.selects_Child_for_Accidental_Death_Product();
	}

	@Then("^Selects product TenYTL for Child$")
	public void selects_product_TenYTL_for_Child() throws Throwable {
		ProductPage.selects_product_TenYTL_for_Child();
	}
	@Then("^Selects product GTenYTL for Child$")
	public void selects_product_GTenYTL_for_Child() throws Throwable {
		ProductPage.selects_product_TenYTL_for_Child();
	}
	@Then("^Selects product TwentyYTL for Child$")
	public void selects_product_TwentyYTL_for_Child() throws Throwable {
		ProductPage.selects_product_TwentyYTL_for_Child();
	}
	
	@Then("^Selects product GTwentyYTL for Child$")
	public void selects_product_GTwentyYTL_for_Child() throws Throwable {
		ProductPage.selects_product_TwentyYTL_for_Child();
	}

	@Then("^Deselect product TwentyYTL for Child$")
	public void deselect_product_TwentyYTL_for_Child() throws Throwable {
		ProductPage.selects_product_TwentyYTL_for_Child();
	}

	@Then("^Selects product HMI for Child$")
	public void selects_product_HMI_for_Child() throws Throwable {
		ProductPage.selects_product_HII_for_Child();
	}

	
	@Then("^Selects product InHospitalInsurance for Child$")
	public void selects_product_InHospitalInsurance_for_Child() throws Throwable {
		ProductPage.selects_product_HII_for_Child();
	}


//changes
	@Then("^Selects product ARTL for Child$")
	public void selects_product_ARTL_for_Child() throws Throwable {
		ProductPage.selects_product_TermLife_for_Child();
	}

	@Then("^Deselect Product FiveYTL for Child$")
	public void deselect_Product_FiveYTL_for_Child() throws Throwable {
		ProductPage.selects_product_FiveYrTerm_Life_Insurance_Child();
	}

	@Then("^Deselect Product TenYTL for Child$")
	public void deselect_Product_TenYTL_for_Child() throws Throwable {
		ProductPage.selects_product_TenYTL_for_Child();
	}
	
	@Then("^Deselects Product GTenYTL for Child$")
	public void deselect_Product_GTenYTL_for_Child() throws Throwable {
		ProductPage.selects_product_TenYTL_for_Child();
	}
	
	@Then("^Selects product GTLI for Child$")
	public void selects_product_GTLI_for_Child() throws Throwable {
		ProductPage.selects_product_TermLife_for_Child();
	}
	@Then("^Deselects product GTLI for Child$")
	public void deselects_product_GTLI_for_Child() throws Throwable {
		ProductPage.selects_product_TermLife_for_Child();
	}
	@Then("^Selects product GTTLI for Child$")
	public void selects_product_GTTLI_for_Child() throws Throwable {
		ProductPage.selects_product_TermLife_for_Child();
	}
	
	@Then("^Deselects product GTTLI for Child$")
	public void deselects_product_GTTLI_for_Child() throws Throwable {
		ProductPage.selects_product_TermLife_for_Child();
	}
	/*-------------------------------ASCE Site-----------------------------*/

	@Then("^Selects product TermLife for Child$")
	public void selects_product_TermLife_for_Child() throws Throwable {
		ProductPage.selects_product_TermLife_for_Child();
	}

	@Then("^DeSelects product TermLife for Child$")
	public void deselects_product_TermLife_for_Child() throws Throwable {
		ProductPage.selects_product_TermLife_for_Child();
	}

	@Then("^Selects product HLDD for Child$")
	public void selects_product_HLDD_for_Child() throws Throwable {
		ProductPage.selects_Child_for_Accidental_Death_Product();
	}

	@Then("^Selects product HII for Child$")
	public void selects_product_HII_for_Child() throws Throwable {
		ProductPage.selects_product_HII_for_Child();
	}
	
	@Then("^Selects product GHII for Child$")
	public void selects_product_GHII_for_Child() throws Throwable {
		ProductPage.selects_product_HII_for_Child();
	}

	/*
	 * @Then("^Selects product for Child as FiveYearTermLife, Accidental Death and Hospital Money Insurance$"
	 * ) public void
	 * selects_product_for_Child_as_FiveYearTermLife_Accidental_Death_and_Hospital_Money_Insurance
	 * () throws Throwable { ProductPage.
	 * selects_the_product_for_Child_for_Five_Year_Banded_Term_Life_insurance();
	 * ProductPage.selects_Child_for_Accidental_Death_Product();
	 * ProductPage.selects_Child_for_Hospital_Product(); }
	 */

	@Then("^Selects product FiveYTL for Child$")
	public void selects_product_FiveYrTerm_Life_Insurance_Child() throws Throwable {
		ProductPage.selects_product_FiveYrTerm_Life_Insurance_Child();
	}

	@Then("^Selects product Group Term Life Insurance for Child$")
	public void selects_product_Group_Term_Life_Insurance_for_Child() throws Throwable {
		ProductPage.selects_product_FiveYrTerm_Life_Insurance_Child();
	}

	@Then("^Click YES for Dependent Coverage information$")
	public void click_YES_for_Dependent_Coverage_information() throws Throwable {
		ProductPage.validate_message_and_click_YES_for_Dependent_Coverage_information();
	}

	@Then("^Verify Child icon is disabled for TermLife$")
	public void verify_Child_icon_is_disabled_for_TermLife() throws Throwable {
		ProductPage.verify_Child_icon_is_disabled_for_TermLife();
	}
	
	@Then("^Verify Child icon is disabled for GTTLI$")
	public void verify_Child_icon_is_disabled_for_GTTLI() throws Throwable {
		ProductPage.verify_Child_icon_is_disabled_for_TermLife();
	}

	@Then("^Verify Child icon is disabled for TenYTL$")
	public void verify_Child_icon_is_disabled_for_TenYTL() throws Throwable {
		ProductPage.verify_Child_icon_is_disabled_for_TenYTL();
	}
	
	@Then("^Verify Child icon is disabled for GTenYTL$")
	public void verify_Child_icon_is_disabled_for_GTenYTL() throws Throwable {
		ProductPage.verify_Child_icon_is_disabled_for_TenYTL();
	}

	@Then("^Verify Child icon is disabled for FifteenYTL$")
	public void verify_Child_icon_is_disabled_for_FifteenYTL() throws Throwable {
		ProductPage.verify_Child_icon_is_disabled_for_FifteenYTL();
	}

	@Then("^Verify Child icon is disabled for TwentyYTL$")
	public void verify_Child_icon_is_disabled_for_TwentyYTL() throws Throwable {
		ProductPage.verify_Child_icon_is_disabled_for_TwentyYTL();
	}
	
	@Then("^Verify Child icon is disabled for GTwentyYTL$")
	public void verify_Child_icon_is_disabled_for_GTwentyYTL() throws Throwable {
		ProductPage.verify_Child_icon_is_disabled_for_TwentyYTL();
	}
	
	@Then("^Verify Self icon is disabled for TwentyYTL$")
	public void verify_Self_icon_is_disabled_for_TwentyYTL() throws Throwable {
		ProductPage.verify_Child_icon_is_disabled_for_TwentyYTL();
	}

	@Then("^Selects product PureTerm for Self$")
	public void selects_product_PureTerm_for_Self() throws Throwable {
		ProductPage.selects_product_PureTerm_for_Self();
	}

	@Then("^Selects product PrefTerm for Self$")
	public void selects_product_PrefTerm_for_Self() throws Throwable {
		ProductPage.selects_product_PrefTerm_for_Self();
	}

	@Then("^Verify Child icon is disabled for PrefTerm$")
	public void verify_Child_icon_is_disabled_for_PrefTerm() throws Throwable {
		ProductPage.verify_Child_icon_is_disabled_for_PrefTerm();
	}

	@Then("^Selects product PAI for Child$")
	public void selects_product_PAI_for_Child() throws Throwable {
		ProductPage.selects_Child_for_Accidental_Death_Product();
	}

	@Then("^Selects product DPOSDI for Self$")
	public void selects_product_DPOSDI_for_Self() throws Throwable {
		ProductPage.selects_product_DII_for_Self();
	}

	@Then("^Selects product OOEI for Self$")
	public void selects_product_OOEI_for_Self() throws Throwable {
		ProductPage.selects_product_PO_or_BOE_or_OO_for_Self();
	}

	// ***************************** SELF AND CHILD PRODUCT
	// *************************************//

	/*
	 * @Then("^Product page details are displayed to user and selects the product for Self and Child for Five Year Banded Term Life insurance$"
	 * ) public void
	 * product_page_details_are_displayed_to_user_and_selects_the_product_for_Self_and_Child_for_Five_Year_Banded_Term_Life_insurance
	 * () throws Throwable {
	 *
	 * ProductPage.selects_the_product_as_Term_Life_insurance_for_self();
	 * ProductPage.selects_product_Term_Life_Insurance_Child();
	 *
	 * }
	 */

	@Then("^selects the product for Self and Child for Group Term Life Insurance$")
	public void selects_the_product_for_Self_and_Child_for_Group_Term_Life_Insurance()
			throws Throwable {

		ProductPage.selects_the_product_as_FiveYr_Term_Life_insurance_for_self();
		ProductPage.selects_product_FiveYrTerm_Life_Insurance_Child();

	}

	@Then("^Verify Available Product ELI only for Self$")
	public void verify_Available_Product_ELI_Self() throws Throwable {
		ProductPage.validate_Product_ELI_for_Self();
	}

	@Then("^Verify Spouse is not displayed for ELI Product$")
	public void verify_Spouse_Is_not_Displayed_For_ELI() throws Throwable {
		ProductPage.verify_Spouse_Is_not_Displayed_For_ELI();
	}

	@Then("^Verify Spouse is displayed for ELI Product$")
	public void verify_Spouse_Is_Displayed_For_ELI() throws Throwable {
		ProductPage.verify_Spouse_Is_Displayed_For_ELI();
	}

	@Then("^Verify Child is not displayed for ELI Product$")
	public void verify_Child_Is_not_Displayed_For_ELI() throws Throwable {
		ProductPage.verify_Child_Is_not_Displayed_For_ELI();
	}

	@Then("^Verify Child is displayed for ELI Product$")
	public void verify_Child_Is_Displayed_For_ELI() throws Throwable {
		ProductPage.verify_Child_Is_Displayed_For_ELI();
	}

	@Then("^Selects product ELI for Self$")
	public void selects_product_ELI_for_Self() throws Throwable {
		ProductPage.selects_product_ELI_for_Self();
	}

	@Then("^Selects ELI product for Spouse$")
	public void selects_product_ELI_for_Spouse() throws Throwable {
		ProductPage.selects_product_ELI_for_Spouse();
	}

	@Then("^Selects ELI product for Child$")
	public void selects_product_ELI_for_Child() throws Throwable {
		ProductPage.selects_product_ELI_for_Child();
	}

	@Then("^Verify Self is not displayed for GTDLI,TenYTL,TwentyYTL on product page$")
	public void verify_Self_Is_Not_Displayed_For_GTDLI_TenYTL_TwentyYTL() throws Throwable {
		ProductPage.verify_Self_Is_Not_Displayed_For_GTDLI();
		ProductPage.validates_that_Self_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_not_displayed_for_TwentyYTL();
	}

	@Then("^Verify Self is displayed for GTDLI,TenYTL,TwentyYTL on product page$")
	public void verify_Self_Is_Displayed_For_GTDLI_TenYTL_TwentyYTL() throws Throwable {
		ProductPage.verify_Self_Is_Displayed_For_GTDLI();
		ProductPage.validates_that_Self_is_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_displayed_for_TwentyYTL();
	}
	
	@Then("^Verify Self is displayed for TenYTL,ADDI on product page$")
	public void verify_Self_Is_Displayed_For_TenYTL_ADDI() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_displayed_for_ADDI();
	}

	@Then("^Selects product GTDLI for Self$")
	public void selects_product_GTDLI_for_Self() throws Throwable {
		ProductPage.selects_product_GTDLI_for_Self();
	}

	@Then("^Selects product GTDLI for Child$")
	public void selects_product_GTDLI_for_Child() throws Throwable {
		ProductPage.selects_product_GTDLI_for_Child();
	}

	@Then("^Verify Available Product List ELI only for Spouse and Child$")
	public void verify_available_product_list_ELI_Spouse_Child() throws Throwable {
		ProductPage.validate_General_Term_Dealer_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_displayed();
	}

	@Then("^Selects product GTDLI for Spouse$")
	public void selects_product_GTDLI_for_Spouse() throws Throwable {
		ProductPage.selects_product_GTDLI_for_Spouse();
	}

	@Then("^Verify Spouse is displayed for GTLI$")
	public void verify_that_Spouse_is_displayed_for_GTLI() throws Throwable {
		ProductPage.validates_that_Spouse_is_displayed_for_TermLife();
		
	}
	
	@Then("^Verify Spouse is not displayed for GHII$")
	public void verify_that_Spouse_is_not_displayed_for_GHII() throws Throwable {
		ProductPage.validates_that_Spouse_is_not_displayed_for_HII();
		
	}
	@Then("^Verify Spouse is not displayed for GTDLI,TenYTL,TwentyYTL on product page$")
	public void verify_Spouse_Is_Not_Displayed_For_GTDLI_TenYTL_TwentyYTL() throws Throwable {
		ProductPage.verify_Spouse_Is_Not_Displayed_For_GTDLI();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TwentyYTL();
	}

	@Then("^Verify Spouse is displayed for GTDLI,TenYTL,TwentyYTL on product page$")
	public void verify_Spouse_Is_Displayed_For_GTDLI_TenYTL_TwentyYTL() throws Throwable {
		ProductPage.verify_Spouse_Is_Displayed_For_GTDLI();
		ProductPage.validates_that_Spouse_is_displayed_for_TenYTL();
		ProductPage.validates_that_Spouse_is_displayed_for_TwentyYTL();
	}

	@Then("^Validates that Self is not displayed for TermLife$")
	public void validates_that_Self_is_not_displayed_for_TermLife() throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_TermLife();

	}
	
	@Then("^Verify that Self icon is not displayed under GTLI$")
	public void verify_that_Self_icon_is_not_displayed_under_GTLI() throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Spouse_is_displayed_for_TermLife();
	}

	@Then("^Verify that Spouse icon is not displayed under GTLI$")
	public void verify_that_Spouse_icon_is_not_displayed_under_GTLI() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TermLife();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TermLife();
	}

	@Then("^Verify that GTLI is not available for Self and Spouse$")
	public void verify_that_GTLI_is_not_available_for_Self_and_Spouse() throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TermLife();
	}

	@Then("^Verify that Self and Spouse are available under GTLI$")
	public void verify_that_Self_and_Spouse_are_available_under_GTLI() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TermLife();
		ProductPage.validates_that_Spouse_is_displayed_for_TermLife();
	}

	@Then("^Validates that Self is displayed for TermLife$")
	public void validates_that_Self_is_displayed_for_TermLife() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TermLife();
	}
	@Then("^Verify Self is displayed for GTLI and GHII$")
	public void verify_that_Self_is_displayed_for_GTLI_and_GHII() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_displayed_for_HII();

	}
	@Then("^Verify Self is displayed for GTLI, GTenYTL and GHII$")
	public void verify_that_Self_is_displayed_for_GTLI_GTenYTL_and_GHII() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_displayed_for_HII();

	}
	@Then("^Verify Self is displayed for GTLI$")
	public void verify_that_Self_is_displayed_for_GTLI() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TermLife();
	

	}
	@Then("^Verify Self is displayed for GTLI GTenYTL, GDII and GHII$")
	public void verify_that_Self_is_displayed_for_GTLI_GtenYTL_GDII_and_GHII() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_displayed_for_LTD();
		ProductPage.validates_that_Self_is_displayed_for_HII();

	}
	@Then("^Verify Self is displayed for GTLI, GDII and GHII$")
	public void verify_that_Self_is_displayed_for_GTLI_GDII_and_GHII() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_displayed_for_LTD();
		ProductPage.validates_that_Self_is_displayed_for_HII();

	}
	@Then("^Selects Product GADD for Self$")
	public void selects_Product_GADD_Self() throws Throwable {
		ProductPage.selects_product_GADD_for_Self();
	}
	
	@Then("^Selects Product HLAI for Self$")
	public void selects_Product_HLAI_Self() throws Throwable {
		ProductPage.selects_product_GADD_for_Self();
	}
	
	@Then("^Deselects Product GADD for Self$")
	public void deselects_Product_GADD_Self() throws Throwable {
		ProductPage.selects_product_GADD_for_Self();
	}
	
	@Then("^Selects Product GADD for Spouse$")
	public void selects_Product_GADD_Spouse() throws Throwable {
		ProductPage.selects_product_GADD_for_Spouse();
	}
		
	@Then("^Selects Product HLAI for Spouse$")
	public void selects_Product_HLAI_Spouse() throws Throwable {
		ProductPage.selects_product_GADD_for_Spouse();
	}
	

	@Then("^Selects Product HLAI for Child$")
	public void selects_Product_HLAI_Child() throws Throwable {
		ProductPage.selects_product_GADD_for_Child();
	}
	
	//@Then("^Validates only TenYTL is displayed for Self$")

	@Then("^Validates Self is displayed for TenYTL$")

	public void verify_Self_Is_Displayed_For_TenYTL() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TenYTL();
		
	}
	
	@Then("^Validates only GTenYLTLI is displayed for Self$")
	public void verify_Self_Is_Displayed_For_GTenYLTLI() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TenYTL();
	}
	
	@Then("^Validates that Self is displayed for Flex10$")
	public void verify_Self_Is_Displayed_For_Flex10() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TenYTL();
	}
	
	@Then("^Validates that Self is not displayed at product page for TGTLI, TenPGTL$")
	public void validates_that_Self_is_not_displayed_at_product_page_for_Traditional_TenYTL() throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_not_displayed_for_TenYTL();
	}
	
	@Then("^Validates that Self & Spouse are not displayed at product page for TGTLI, TenPGTL$")
	public void validates_that_Self_Spouse_are_not_displayed_at_product_page_for_Traditional_TenYTL() throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Self_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TenYTL();
	}
	
	@Then("^Validates that Spouse is not displayed at product page for TGTLI, TenPGTL$")
	public void validates_that_Spouse_is_not_displayed_at_product_page_for_Traditional_TenYTL()	throws Throwable {
		ProductPage.validates_that_Spouse_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Spouse_is_not_displayed_for_TenYTL();
	}

	@Then("^Verify that Self icon is not displayed for GroupTermLife,GLTDI,GSTDI,GBOE$")
	public void verify_that_Self_icon_is_not_displayed_for_GroupTermLife_LTD_STD_BOE() throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_FiveYTL();
		ProductPage.validates_that_Self_is_not_displayed_for_LTD();
		ProductPage.validates_that_Self_is_not_displayed_for_MIDT_or_STD();
		ProductPage.validates_that_Self_is_not_displayed_for_PO_or_OOEDI();
	}

	@Then("^Verify that Spouse icon is displayed for only for GroupTermLife$")
	public void verify_that_Spouse_icon_is_displayed_for_only_for_GroupTermLife() throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_FiveYTL();
		ProductPage.validates_that_Spouse_is_displayed_for_FiveYTL();
		ProductPage.validates_that_Child_is_not_displayed_for_FiveYTL();
	}

	@Then("^Verify that Spouse icon is not displayed for GroupTermLife$")
	public void verify_that_Spouse_icon_is_not_displayed_for_GroupTermLife() throws Throwable {
		ProductPage.validates_that_Spouse_is_not_displayed_for_FiveYTL();
	}

	@Then("^Verify that Self icon is displayed for GroupTermLife,GLTDI,GSTDI,GBOE$")
	public void verify_that_Self_icon_is_displayed_for_GroupTermLife_LTDI_STDI_BOE() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_FiveYTL();
		ProductPage.validates_that_Self_is_displayed_for_LTD();
		ProductPage.validates_that_Self_is_displayed_for_MIDT_or_STD();
		ProductPage.validates_that_Self_is_displayed_for_PO_or_OOEDI();
	}

	@Then("^Verify Available Product List: GroupTermLife,GBOE$")
	public void verify_Available_Product_List_GroupTermLife_BOE() throws Throwable {
		ProductPage.validate_Five_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.Validates_that_PO_or_OO_or_BOE_is_displayed();
	}

	@Then("^Verify Available Product List: GroupTermLife,GLTDI,GSTDI,GBOE$")
	public void verify_Available_Product_List_GroupTermLife_GLTDI_GSTDI_GBOE() throws Throwable {
		ProductPage.validate_Five_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Long_Term_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Mid_Term_Disability_Insurance_Product_is_displayed();
		ProductPage.Validates_that_PO_or_OO_or_BOE_is_displayed();
	}

	@Then("^Verify Available Product List GSTDI,GLTDI,GBOE$")
	public void verify_Available_Product_List_GSTDI_GLTDI_GBOE() throws Throwable {
		ProductPage.validate_Long_Term_Disability_Insurance_Product_is_displayed();
		ProductPage.validate_Mid_Term_Disability_Insurance_Product_is_displayed();
		ProductPage.Validates_that_PO_or_OO_or_BOE_is_displayed();
	}

	@Then("^Verify Available Product List GroupTermLife,GSTDI,GBOE$")
	public void verify_Available_Product_List_GroupTermLife_GSTDI_GBOE() throws Throwable {
		ProductPage.validate_Five_Year_Term_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Mid_Term_Disability_Insurance_Product_is_displayed();
		ProductPage.Validates_that_PO_or_OO_or_BOE_is_displayed();

	}

	@Then("^Verify Available Product List GroupTermLife$")
	public void verify_Available_Product_List_GroupTermLife() throws Throwable {
		ProductPage.validate_Five_Year_Term_Life_Insurance_Product_is_displayed();
	}

	@Then("^Verify Child icon is available for GroupTermLife product only$")
	public void verify_Child_icon_is_available_for_GroupTermLife_product_only() throws Throwable {
		ProductPage.validates_that_Child_is_displayed_for_FiveYTL();
	}

	@Then("^Verify Spouse icon is available for GroupTermLife product only$")
	public void verify_Spouse_icon_is_available_for_Term_Life_product_only() throws Throwable {
		ProductPage.validates_that_Spouse_is_displayed_for_FiveYTL();
	}

	@Then("^Selects product GroupTermLife for Self$")
	public void selects_product_GroupTermLife_for_Self() throws Throwable {
		ProductPage.selects_the_product_as_FiveYr_Term_Life_insurance_for_self();
	}

	@Then("^Selects product GroupTermLife for Spouse$")
	public void selects_product_GroupTermLife_for_Spouse() throws Throwable {
		ProductPage.selects_product_FiveYr_Term_Life_Insurance_Spouse();
	}
	
	@Then("^Selects product GTLP75I for Self$")
	public void selects_product_GTLP75I_for_Self() throws Throwable {
		ProductPage.selects_the_product_as_FiveYr_Term_Life_insurance_for_self();
	}

	@Then("^Selects product GTLP75I for Spouse$")
	public void selects_product_GTLP75I_for_Spouse() throws Throwable {
		ProductPage.selects_product_FiveYr_Term_Life_Insurance_Spouse();
	}

	@Then("^Selects product GroupTermLife for Child$")
	public void selects_product_GroupTermLife_for_Child() throws Throwable {
		ProductPage.selects_product_FiveYrTerm_Life_Insurance_Child();
	}

	@Then("^Selects product GLTDI for Self$")
	public void selects_product_GLTDI_for_Self() throws Throwable {
		ProductPage.selects_product_LTD_for_Self();
	}

	@Then("^Selects product GSTDI for Self$")
	public void selects_product_GSTDI_for_Self() throws Throwable {
		ProductPage.selects_product_MTDI_for_Self();
	}

	@Then("^Selects product GBOE for Self$")
	public void selects_product_GBOE_for_Self() throws Throwable {
		ProductPage.selects_product_PO_or_BOE_or_OO_for_Self();
	}
	
	@Then("^Verify Chronic rider is not available under GTTLI for Self$")
	public void validate_Chronic_Rider_Under_GTTLI_is_not_displayed_Self() throws Throwable {
		ProductPage.validate_Chronic_Rider_Under_GTTLI_is_not_displayed_Self();
	}

	// ************************ Additional Questions*****************************//

	@Then("^Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self$")
	public void product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_No_for_all_for_Self()
			throws Throwable {

		ProductPage	.product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_No_for_all_for_Self();

	}

	@Then("^Product: Additional Questions page details are displayed to user and selects Answer as No for Self and Spouse$")
	public void product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_No_for_Self_and_Spouse()
			throws Throwable {

		// ProductPage.product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_No_for_Self_and_Spouse();
		ProductPage	.product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_No_for_all_for_Self();
		ProductPage	.product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_No_for_all_for_Spouse();
	}

	@Then("^Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse$")
	public void product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_No_for_all_for_Spouse()
			throws Throwable {
		
		ProductPage		.product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_No_for_all_for_Spouse();
	}

	@Then("^Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Self$")
	public void product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_Yes_for_all_questions_for_Self()
			throws Throwable {
		ProductPage
				.product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_Yes_for_all_questions_for_Self();
	}

	@Then("^Enter additional details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_additional_details_as(String total, String pending, String company) throws Throwable {
		ProductPage.enter_additional_details_as(total, pending, company);
	}

	@Then("^Selects Yes for Do you have other life insurance in force for Self$")
	public void selects_Yes_for_Do_you_have_other_life_insurance_in_force() throws Throwable {
		ProductPage.selects_Yes_for_Do_you_have_other_life_insurance_in_force();
	}

	@Then("^Selects No for Do you have other life insurance in force for Self$")
	public void selects_No_for_Do_you_have_other_life_insurance_in_force() throws Throwable {
		ProductPage.selects_No_for_Do_you_have_other_life_insurance_in_force();
	}

	@Then("^Enters Total Amount for Self as \"([^\"]*)\"$")
	public void enters_Total_Amount_as(String total) throws Throwable {
		ProductPage.enters_Total_Amount_as(total);
	}

	@Then("^Selects Yes for life insurance applied for intended to replace for Self$")
	public void selects_Yes_for_life_insurance_applied_for_intended_to_replace() throws Throwable {
		ProductPage.selects_Yes_for_life_insurance_applied_for_intended_to_replace();
	}

	@Then("^Validate error message for required question$")
	public void validate_error_message() throws Throwable {
		ProductPage.validate_error_message_for_required_question();
	}
	
	@Then("^Verify Additional Questions details are displayed$")
	public void verify_additional_Questions_details_are_displayed() throws Throwable {
		ProductPage.verify_additional_Questions_details_are_displayed();
	}
	
	// WAEPA
	@Then("^Product: Additional Questions page details are displayed to user and selects Answer as Yes for Self and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_Yes_for_Self_and_enter_details_as(
			String InforcePolicyAmount, String PendingPolicyAmount, String Company) throws Throwable {
		ProductPage	.product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_Yes_for_Self_and_enter_details_as(
						InforcePolicyAmount, PendingPolicyAmount, Company);
	}

	@Then("^Product: Additional Questions page details are displayed to user and selects Answer as Yes for Self and Spouse and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_Yes_for_Self_and_Spouse_and_enter_details_as(
			String InforcePolicyAmount, String PendingPolicyAmount, String Company) throws Throwable {
		ProductPage.product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_Yes_for_Self_and_Spouse_and_enter_details_as(
						InforcePolicyAmount, PendingPolicyAmount, Company);
	}

	@Then("^Enters Monthly Income for Self as \"([^\"]*)\"$")
	public void enters_Monthly_Income_for_Self_as(String Income) throws Throwable {
		ProductPage.enters_Monthly_Income_for_disability_coverage_as(Income);
	}
	/*
	 * @Then("^Enters New Monthly Income as \"([^\"]*)\"$") public void
	 * enters_New_Monthly_Income_as(String Income) throws Throwable {
	 * ProductPage.enters_New_Monthly_Income_as(Income); }
	 */

	// AAFP
	@Then("^Selects YES for Question-Are you a resident member$")
	public void selects_YES_for_Question_Are_you_a_resident_member() throws Throwable {
		ProductPage.selects_YES_for_Question_Are_you_a_resident_member();
	}

	@Then("^Enters details for Monthly Expense and Percentage Responsible as \"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_details_for_Monthly_Expense_and_Percentage_Responsible_as(String MonthlyExpense, String Percent)
			throws Throwable {
		ProductPage.enters_details_for_Monthly_Expense_and_Percentage_Responsible_as(MonthlyExpense, Percent);
	}
	
		@Then("^Enters Monthly Expense for Self as \"([^\"]*)\"$")
	public void enters_Monthly_Expense_for_Self_as(String MonthlyExpense) throws Throwable {
		ProductPage.enters_details_for_Monthly_Expense_as(MonthlyExpense);
	}

	@Then("^Selects Answer as No for all additional questions of Group Disability Insurance for Self$")
	public void selects_Answer_as_No_for_all_additional_questions_of_Group_Disability_Insuranse_for_Self()
			throws Throwable {
		ProductPage.selects_Answer_as_No_for_Additional_Questions_as_No_for_all_for_Self_of_Group_Disability_Insuranse();
	}

	@Then("^Selects Answer as No for all Group Disability Insurance for Self$")
	public void selects_Answer_as_No_for_all_Group_Disability_Insurance_for_Self() throws Throwable {
		ProductPage.selects_Answer_as_No_for_all_Group_Disability_Insurance_for_Self();
	}
	@Then("^Selects Answer as No for other business question for Group Disability Insurance for Self$")
	public void selects_Answer_as_No_for_other_business_question_for_Self_of_Group_Disability_Insuranse() throws Throwable {
		ProductPage.selects_Answer_as_No_for_other_business_question_for_Self_of_Group_Disability_Insurance();
	}

	// AAFP
	@Then("^Selects Answer as No for Uniformed Service for Self of Group Disability Insurance$")
	public void selects_Answer_as_No_for_Additional_Questions_for_Self_of_Group_Disability_Insurance()
			throws Throwable {
		ProductPage.selects_Answer_as_No_for_Uniformed_Service_for_Self_of_Group_Disability_Insurance();
	}
	@Then("^Selects Answer as No for Resident Member question for Self of Group Disability Insurance$")
	public void selects_Answer_as_No_for_resident_member_Questions_for_Self_of_Group_Disability_Insurance()
			throws Throwable {
		ProductPage.selects_Answer_as_No_for_resident_member_for_Self_of_Group_Disability_Insurance();
	}

	@Then("^Selects Answer as YES for Additional Questions of Group Disability Insurance for Self$")
	public void selects_Answer_as_YES_for_Additional_Questions_of_Group_Disability_Insurance_for_Self()
			throws Throwable {
		ProductPage.selects_Answer_as_YES_for_Additional_Questions_of_Group_Disability_Insurance_for_Self();
	}

	@Then("^Enter Hazardous duty explanation as \"([^\"]*)\"$")
	public void enter_Hazardous_duty_explanation_as(String HazardousExplanation) throws Throwable {
		ProductPage.enter_Hazardous_duty_explanation_as(HazardousExplanation);
	}

	@Then("^Enters Monthly Income as \"([^\"]*)\" for Spouse$")
	public void enters_Monthly_Income_as_for_Spouse(String Income) throws Throwable {
		ProductPage.enters_Monthly_Income_as_for_Spouse(Income);
	}

	@Then("^Selects Answer as No for Additional Questions as No for all for Spouse of Group Disability Insuranse$")
	public void selects_Answer_as_No_for_Additional_Questions_as_No_for_all_for_Spouse_of_Group_Disability_Insuranse()
			throws Throwable {
		ProductPage.selects_Answer_as_No_for_other_insurance_question_for_Spouse_of_Group_Disability_Insurance();
	}

	@Then("^Verify New York State paragraph is displayed for Self$")
	public void verify_New_York_State_paragraph_is_displayed_for_Self() throws Throwable {
		ProductPage.verify_New_York_State_paragraph_is_displayed_for_Self();
	}
	
	@Then("^Verify New York State paragraph is not displayed for Self$")
	public void verify_New_York_State_paragraph_is_not_displayed_for_Self() throws Throwable {
	ProductPage.verify_New_York_State_paragraph_is_not_displayed_for_Self();
	}

	@Then("^Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Spouse$")
	public void product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_Yes_for_all_questions_for_Spouse()
			throws Throwable {
		ProductPage	.product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_Yes_for_all_questions_for_Spouse();
	}

	@Then("^Enter additional details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" for Spouse$")
	public void enter_additional_details_as_for_Spouse(String total, String pending, String company) throws Throwable {
		ProductPage.enter_additional_details_as_for_Spouse(total, pending, company);
	}
	@Then("^Selects Yes for Do you have other insurance pending for Self$")
	public void selects_Yes_for_Do_you_have_other_insurance_pending_for_self() throws Throwable {
		ProductPage.selects_Yes_for_Do_you_have_other_insurance_pending_for_self();
	}
	
	@Then("^Selects No for Do you have other insurance pending for Self$")
	public void selects_No_for_Do_you_have_other_insurance_pending_for_self() throws Throwable {
		ProductPage.selects_No_for_Do_you_have_other_insurance_pending_for_self();
	}
	@Then("^Selects Yes for Do you have other insurance pending for Spouse$")
	public void selects_Yes_for_Do_you_have_other_insurance_pending_for_Spouse() throws Throwable {
		ProductPage.selects_Yes_for_Do_you_have_other_insurance_pending_for_Spouse();
	}
	

	@Then("^Selects Yes for unable to work because of a disability for Self$")
	public void selects_Yes_for_unable_to_work_because_of_a_disability_for_Self() throws Throwable {
		ProductPage.selects_Yes_for_unable_to_work_because_of_a_disability_for_Self();
	}

	@Then("^Selects Yes for unable to work because of a disability for Spouse$")
	public void selects_Yes_for_unable_to_work_because_of_a_disability_for_Spouse() throws Throwable {
		ProductPage.selects_Yes_for_unable_to_work_because_of_a_disability_for_Spouse();
	}

	@Then("^Clicks on Add Company Button$")
	public void clicks_on_Add_Company_Button() throws Throwable {
		ProductPage.clicks_on_Add_Company_Button();
	}

	@Then("^Clicks on Add Company Button for Spouse$")
	public void clicks_on_Add_Company_Button_for_spouse() throws Throwable {
		ProductPage.clicks_on_Add_Company_Button_Spouse();

	}

	@Then("^Clicks on Add Company Button for Business or Office Overhead$")
	public void clicks_on_Add_Company_Button_for_Business_or_Office_Overhead() throws Throwable {
		ProductPage.clicks_on_Add_Company_Button_for_Business_or_Office_Overhead();
	}

	@Then("^Selects Yes for Do you have other life insurance in force for Spouse$")
	public void selects_Yes_for_Do_you_have_other_life_insurance_in_force_for_Spouse() throws Throwable {
		ProductPage.selects_Yes_for_Do_you_have_other_life_insurance_in_force_for_Spouse();
	}

	@Then("^Selects No for Do you have other life insurance in force for Spouse$")
	public void selects_No_for_Do_you_have_other_life_insurance_in_force_for_Spouse() throws Throwable {
		ProductPage.selects_No_for_Do_you_have_other_life_insurance_in_force_for_Spouse();
	}

	@Then("^Enters Total Amount for Spouse as \"([^\"]*)\"$")
	public void enters_Total_Amount_for_Spouse_as(String total) throws Throwable {
		ProductPage.enters_Total_Amount_for_Spouse_as(total);
	}

	@Then("^Selects Yes for life insurance applied for intended to replace for Spouse$")
	public void selects_Yes_for_life_insurance_applied_for_intended_to_replace_for_Spouse() throws Throwable {
		ProductPage.selects_Yes_for_life_insurance_applied_for_intended_to_replace_for_Spouse();
	}
	// AAFP
	/*
	 * @Then("^Clicks on Add Company Button under DII$") public void
	 * clicks_on_Add_Company_Button_AAFP() throws Throwable {
	 * ProductPage.clicks_on_Add_Company_Button_AAFP();
	 *
	 * }
	 */
	@Then("^Selects Benefit Option as \"([^\"]*)\"$")
	public void selects_Benefit_Option_as(String BeneOpt) throws Throwable {
		ProductPage.selects_Benefit_Option_as(BeneOpt);
	}
	@Then("^Enters details for Company \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and click on add button$")
	public void enters_details_for_Company_and_click_on_add_button(String Company, String Amount, String period)
			throws Throwable {
		ProductPage.enters_details_for_Company_and_click_on_add_button(Company, Amount, period);
	}

	@Then("^Selects Yes for replace any other company's coverage for Self$")
	public void selects_Yes_for_replace_any_other_company_s_coverage_for_Self() throws Throwable {
		ProductPage.selects_Yes_for_replace_any_other_company_s_coverage_for_Self();
	}

	@Then("^Selects Yes for replace any other company's coverage for Spouse for overhead disability$")
	public void selects_Yes_for_replace_any_other_company_s_coverage_for_Spouse() throws Throwable {
		ProductPage.selects_Yes_for_replace_any_other_company_s_coverage_for_Spouse_for_OO();
	}

	// AAFP
	@Then("^Selects Yes for replace any other company's coverage for Self for overhead disability$")
	public void selects_Yes_for_replace_any_other_company_s_coverage_for_Self_overhead_disability() throws Throwable {
		ProductPage.selects_Yes_for_replace_any_other_company_s_coverage_for_Self_for_OO();
	}

	@Then("^Selects No for replace any other company's coverage for Self for overhead disability$")
	public void selects_No_for_replace_any_other_company_s_coverage_for_Self_overhead_disability() throws Throwable {
		ProductPage.selects_No_for_replace_any_other_company_s_coverage_for_Self_for_OO();
	}

	@Then("^Enters Amount under replace any other company's coverage as \"([^\"]*)\"$")
	public void enters_Amount_under_replace_any_other_company_s_coverage_as(String Amount) throws Throwable {
		ProductPage.enters_Amount_under_replace_any_other_company_s_coverage_as_DI(Amount);
	}

	@Then("^Enters Amount under replace any other company's coverage as \"([^\"]*)\" for Spouse for overhead disability$")
	public void enters_Amount_under_replace_any_other_company_s_coverage_as_for_Spouse_for_overhead_disability(
			String Amount) throws Throwable {
		ProductPage.enters_Amount_under_replace_any_other_company_s_coverage_of_OO_as_for_Spouse(Amount);
	}

	// AAFP
	@Then("^Enters Amount under replace any other company's coverage of overhead product as \"([^\"]*)\"$")
	public void enters_Amount_under_replace_any_other_company_s_coverage_of_overhead_product_as(String Amount)
			throws Throwable {
		ProductPage.enters_Amount_under_replace_any_other_company_s_coverage_of_OO_as(Amount);
	}

	@Then("^Selects Yes for self employed for less than One year under Self$")
	public void selects_Yes_for_self_employed_for_less_than_One_year_under_Self() throws Throwable {
		ProductPage.selects_Yes_for_self_employed_for_less_than_One_year_under_Self();
	}

	@Then("^Selects Yes for applying for any other business/office overhead insurance$")
	public void selects_Yes_for_applying_for_any_other_business_office_overhead_insurance() throws Throwable {
		ProductPage.selects_Yes_for_applying_for_any_other_business_office_overhead_insurance();
	}

	@Then("^Selects Yes for Any Other company's coverage for Group Disability for Self$")
	public void selects_Yes_for_Any_Other_company_s_coverage_for_Group_Disability_for_Self() throws Throwable {
		ProductPage.selects_Yes_for_Any_Other_company_s_coverage_under_Group_Disability_for_Self();
	}

	@Then("^Enters replacement amount for Group Disability as \"([^\"]*)\"$")
	public void enters_replacement_amount_for_Group_Disability_as(String repAmount) throws Throwable {
		ProductPage.Enters_replacement_amount_for_Group_Disability_as(repAmount);
	}

	@Then("^Selects product FifteenYTL for Child$")
	public void selects_product_FifteenYTL_for_Child() throws Throwable {
		ProductPage.selects_the_product_FifteenYTL_for_Child();
	}

	// ACOG
	@Then("^Selects Answer as No for Applying any Other Insurance$")
	public void selects_Answer_as_No_for_Applying_any_Other_Insurance() throws Throwable {
		ProductPage.selects_Answer_as_No_for_Applying_any_Other_Insurance();
	}

	@Then("^Product page details are displayed to user And Verify Available Product List GTLI,TenYTL,GADD,GDI,GOOEI$")
	public void product_page_details_are_displayed_to_user_And_Verify_Available_Product_List_GTLI_TenYTL_GADD_DII_GOOEI()
			throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Group_Accidental_Death_Dismemberment_Product();
		ProductPage.validate_Disability_Income_Insurance_Product_is_displayed();
		ProductPage.Validates_that_PO_or_OO_or_BOE_is_displayed();
	}
	
	@Then("^Verify Available Product List GTLI,GADD,GDI,GOOEI$")
	public void product_page_details_are_displayed_to_user_And_Verify_Available_Product_List_GTLI_GADD_GDI_GOOEI()
			throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
		ProductPage.validate_Group_Accidental_Death_Dismemberment_Product();
		ProductPage.validate_Disability_Income_Insurance_Product_is_displayed();
		ProductPage.Validates_that_PO_or_OO_or_BOE_is_displayed();
	}
	
	@Then("^Verify Available Product List GTTLI,CI$")
	public void product_page_details_are_displayed_to_user_And_Verify_Available_Product_List_GTTLI_CI() throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
		ProductPage.validate_Critical_Illness_Product_is_displayed();
	}
	
	@Then("^Verify Available Product List GTLI$")
	public void verify_Available_Product_List_GTLI() throws Throwable {
		ProductPage.validate_Term_Life_ARTL_Insurance_Product_is_available();
	}

	
	

	@Then("^Validate product GOOEDI not displayed for spouse$")
	public void validate_product_OOEDI_Not_Displayed_for_Spouse() throws Throwable {
		ProductPage.validates_that_Spouse_is_not_displayed_for_PO_or_OOEDI();
	}

	@Then("^Validate product GDI not displayed for spouse$")
	public void validate_product_DII_Not_Displayed_for_Spouse() throws Throwable {
		ProductPage.validates_that_Spouse_is_not_displayed_for_DII();
	}
	
	@Then("^Validate DII product is displayed$")
	public void validate_Disability_Income_Insurance_Product_is_displayed() throws Throwable {
		ProductPage.validate_Disability_Income_Insurance_Product_is_displayed();
	}
	
	@Then("^Verify Product TenYTL is displayed$")
	public void verify_TenYTL_Product_is_displayed() throws Throwable {
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
	}
	
	@Then("^Verify Chronic rider is not available under GTTLI for Spouse$")
	public void validate_Chronic_rider_is_not_displayed_Spouse_under_GTTLI() throws Throwable{
		ProductPage.validate_Chronic_rider_is_not_displayed_Spouse_under_GTTLI();
	}
	
	@Then("^Navigate back to Products page$")
	public void navigate_back_to_Products_page() throws Throwable {
		ProductPage.navigate_back_to_Products_page();
	}

	@Then("^Product: Additional Questions page details are displayed to user$")
	public void Products_Additional_page_is_displayed_to_user() throws Throwable {
		ProductPage.Products_Additional_page_is_displayed_to_user();
	}

	// ****************************************Coverage Page// [Web]*************************************************//

	@Then("^Validate Maximum Monthly Benefit Amount for Self as \"([^\"]*)\" under AOD$")
	public void validate_Maximum_Monthly_Benefit_Amount_for_Self_as_under_AOD(String maxMonAmount) throws Throwable {
		CoveragePage.validate_Maximum_Monthly_Benefit_Amount_for_Self_as_under_AOD( maxMonAmount);
	}
	
	@Then("^Navigate back to Coverage page$")
	public void navigate_back_to_Coverage_page() throws Throwable {
		CoveragePage.navigate_back_to_Coverage_page();
	}

	@Then("^Validate Maximum Monthly Benefit Amount for Spouse as \"([^\"]*)\" under AOD$")
	public void validate_Maximum_Monthly_Benefit_Amount_for_Spouse_as_under_AOD(String maxMonAmount) throws Throwable {
		CoveragePage.validate_Maximum_Monthly_Benefit_Amount_for_Spouse_as_under_AOD(maxMonAmount);
	}
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under ELI$")
	public void selects_type_of_Coverage_as_for_Self_under_ELI(String TypeofCove) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_self_ELI(TypeofCove);
	}

	@Then("^Validates under ELI the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Self$")
	public void validates_under_ELI_the_Benefit_Slider_Range_as_to_Self(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_ELI_the_Benefit_Slider_Range_as_to_Self(Min, Max);
	}

	@Then("^Validates under ELI the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Spouse$")
	public void validates_under_ELI_the_Benefit_Slider_Range_as_to_Spouse(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_ELI_the_Benefit_Slider_Range_as_to_Spouse(Min, Max);
	}

	@Then("^Validates under MLI the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Spouse$")
	public void validates_under_MLI_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_MLI_the_Benefit_Slider_Range_as_to_for_Spouse(Min, Max);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under ELI$")
	public void selects_Benefit_Amount_for_Self_as_under_ELI(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_ELI(sBenefit);
	}

	@Then("^Selects Optional AD&D Rider for Self for ELI$")
	public void selects_Optional_AD_D_Rider_Self_under_EmployeeLifeInsurance() throws Throwable {
		CoveragePage.selects_Optional_AD_D_Rider_Self_under_EmployeeLifeInsurance();
	}

	@Then("Selects Optional AD&D Rider Benefit Amount as \"([^\"]*)\" for Self for ELI$")
	public void selects_optional_AD_D_Rider_Benefit_Amount_Self_for_ELI(String amount) throws Throwable {
		CoveragePage.selects_optional_AD_D_Rider_Benefit_Amount_Self_for_ELI(amount);
	}

	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under ELI$")
	public void selects_Benefit_Amount_for_Spouse_as_under_ELI(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_ELI(sBenefit);
	}

	@Then("^Selects Optional AD&D Rider for Spouse for ELI$")
	public void selects_Optional_AD_D_Rider_Spouse_under_EmployeeLifeInsurance() throws Throwable {
		CoveragePage.selects_Optional_AD_D_Rider_Spouse_under_EmployeeLifeInsurance();
	}

	@Then("Selects Optional AD&D Rider Benefit Amount as \"([^\"]*)\" for Spouse for ELI$")
	public void selects_optional_AD_D_Rider_Benefit_Amount_Spouse_for_ELI(String amount) throws Throwable {
		CoveragePage.selects_optional_AD_D_Rider_Benefit_Amount_Spouse_for_ELI(amount);
	}

	@Then("^Selects Benefit Amount for Child as \"([^\"]*)\" under ELI$")
	public void selects_Benefit_Amount_for_Child_as_under_ELI(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Child_as_under_ELI(sBenefit);
	}

	@Then("^Selects Optional AD&D Rider for Child for ELI$")
	public void selects_Optional_AD_D_Rider_Child_under_EmployeeLifeInsurance() throws Throwable {
		CoveragePage.selects_Optional_AD_D_Rider_Child_under_EmployeeLifeInsurance();
	}

	@Then("^Request Coverage page is displayed to user$")
	public void request_Coverage_page_is_displayed_to_user() throws Throwable {
		CoveragePage.Request_coverage_page_is_displayed_to_user();
	}
	
	@Then("^Validate that Guaranteed Issue Group Term Life is displayed$")
	public void validate_that_Guaranteed_Issue_Group_Term_Life_is_displayed() throws Throwable {
		CoveragePage.Validate_that_Guaranteed_Issue_Group_Term_Life_is_displayed();
	}
	
	@Then("^Interim Insurance page is displayed to user$")
	public void Interim_Insurance_page_is_displayed_to_user() throws Throwable {
		CoveragePage.Interim_Insurance_page_is_displayed_to_user();
	}
	
	@Then("^Terminate or Reduce Coverage page is displayed to user$")
	public void Terminate_Reduce_Coverage_page_is_displayed_to_user() throws Throwable {
		CoveragePage.Terminate_Reduce_Coverage_page_is_displayed_to_user();
	}
	@Then("^Transfer Ownership page is displayed to user$")
	public void Transfer_Ownership_page_is_displayed_to_user() throws Throwable {
	CoveragePage.Transfer_Ownership_page_is_displayed_to_user();
}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under Term Life$")
	public void selects_Type_of_Coverage_as_for_Self_TermLife(String TypeofCove) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_self_TermLife(TypeofCove);
	}
	
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under GTLI$")
	public void selects_Type_of_Coverage_as_for_Self_GTLI(String TypeofCove) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_self_TermLife(TypeofCove);
	}
	
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under GTTLI$")
	public void selects_Type_of_Coverage_as_for_Self_GTTLI(String TypeofCove) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_self_TermLife(TypeofCove);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under TenYTL$")
	public void selects_Type_of_Coverage_as_for_Self_for_TenYTL(String TypeofCove_ten) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_self_TenYTL(TypeofCove_ten);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under GTenYTL$")
	public void selects_Type_of_Coverage_as_for_Self_for_GTenYTL(String TypeofCove_ten) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_self_TenYTL(TypeofCove_ten);
	}
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under FifteenYTL$")
	public void selects_Type_of_Coverage_as_for_Self_under_FifteenYTL(String TypeofCov_ten) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_self_FifteenYTL(TypeofCov_ten);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under TwentyYTL$")
	public void selects_Type_of_Coverage_as_for_Self_under_TwentyYTL(String TypeofCov_Twenty) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_self_TwentyYTL(TypeofCov_Twenty);
	}
	
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under GTwentyYTL$")
	public void selects_Type_of_Coverage_as_for_Self_under_GTwentyYTL(String TypeofCov_Twenty) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_self_TwentyYTL(TypeofCov_Twenty);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under ADDI$")
	public void selects_Type_of_Coverage_as_for_Self_under_ADDI(String TypeofCov_ADnD) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_self_ADDI(TypeofCov_ADnD);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under LTD$")
	public void selects_Type_of_Coverage_as_for_Self_under_LTD(String TypeofCov) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_self_LTD(TypeofCov);
	}
	
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under GDIILT$")
	public void selects_Type_of_Coverage_as_for_Self_under_GDIILT(String TypeofCov) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_self_LTD(TypeofCov);
	}
	
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under GDIIST$")
	public void selects_Type_of_Coverage_as_for_Self_under_GDIIST(String TypeofCov) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Self_under_GDIIST(TypeofCov);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under STD$")
	public void selects_Type_of_Coverage_as_for_Self_under_STD(String TypeofCov) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Self_under_STD(TypeofCov);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under OOEDI$")
	public void selects_Type_of_Coverage_as_for_Self_under_OOEDI(String TypeofCov) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Self_under_OOEDI(TypeofCov);
	}
	
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under GPOEI$")
	public void selects_Type_of_Coverage_as_for_Self_under_GPOEI(String TypeofCov) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Self_under_OOEDI(TypeofCov);
	}
	
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under CI$")
	public void selects_Type_of_Coverage_as_for_Self_under_CI(String TypeofCov) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Self_under_CI(TypeofCov);
	}
	
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Spouse under CI$")
	public void selects_Type_of_Coverage_as_for_Spouse_under_CI(String TypeofCov) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Spouse_under_CI(TypeofCov);
	}
	
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under GOOEI$")
	public void selects_Type_of_Coverage_as_for_Self_under_GOOEI(String TypeofCov) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Self_under_OOEDI(TypeofCov);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under BOE$")
	public void selects_Type_of_Coverage_as_for_Self_under_BOE(String TypeofCov) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Self_under_OOEDI(TypeofCov);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under SDI$")
	public void selects_Type_of_Coverage_as_for_Self_under_SDI(String TypeofCov) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Self_under_SDI(TypeofCov);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under HII$")
	public void selects_Type_of_Coverage_as_for_Self_under_HII(String TypeofCov) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Self_under_HII(TypeofCov);
	}
	
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under InHospitalInsurance$")
	public void selects_Type_of_Coverage_as_for_Self_under_InHospitalInsurance(String TypeofCov) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Self_under_HII(TypeofCov);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under GHII$")
	public void selects_Type_of_Coverage_as_for_Self_under_GHII(String TypeofCov) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Self_under_HII(TypeofCov);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" under ARTL for Self$")
	public void selects_Type_of_Coverage_as_under_ARTL_for_Self(String TypeofCove) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_self_TermLife(TypeofCove);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under DII$")
	public void selects_Type_of_Coverage_as_for_Self_under_DII(String TypeofCov) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Self_under_DII_or_DIP(TypeofCov);
	}

	
	@Then("^Verify Type of Coverage Change in coverage is unavailable under ARTL for Spouse$")
	public void verify_Type_of_Coverage_Change_in_coverage_is_unavailable_under_ARTL_for_Spouse() throws Throwable {
		CoveragePage.verify_Change_in_Coverage_is_unavailable_under_ARTL_or_TermLife_for_Spouse();
	}

	@Then("^Verify Type of Coverage Change in coverage is available under ARTL for Spouse$")
	public void verify_Type_of_Coverage_Change_in_coverage_is_available_under_ARTL_for_Spouse() throws Throwable {
		CoveragePage.verify_Change_in_Coverage_is_available_under_ARTL_or_TermLife_for_Spouse();
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under FiveYTL$")
	public void select_Benefit_Amount_for_Term_Life_ABE_Product_self_as(String Benefit) throws Throwable {

		CoveragePage.select_Benefit_Amount_for_FiveYTL_Insurance_Product_Self_as(Benefit);
	}
	
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under GTLP75I$")
	public void select_Benefit_Amount_for_GTLP75I_Product_self_as(String Benefit) throws Throwable {
		CoveragePage.select_Benefit_Amount_for_FiveYTL_Insurance_Product_Self_as(Benefit);
	}
	
	@Then("^Selects Benefit amount as \"([^\"]*)\" for Self under GIGTL$")
	public void selects_Benefit_amount_as_for_Self_under_GIGTL(String Benefit) throws Throwable {
		CoveragePage.select_Benefit_Amount_for_FiveYTL_Insurance_Product_Self_as(Benefit);
	}

	@Then("^Select Benefit Amount for Self as \"([^\"]*)\" under Group Term Product$")
	public void select_Benefit_Amount_for_Group_Term_Product_Self_as(String Benefit) throws Throwable {
		CoveragePage.select_Benefit_Amount_for_FiveYTL_Insurance_Product_Self_as(Benefit);
	}

	@Then("^Request Coverage page is displayed to user and select Benefit Amount for Group Term Product self as \"([^\"]*)\"$")
	public void request_Coverage_page_is_displayed_to_user_and_select_Benefit_Amount_for_Group_Term_Product_self_as(
			String Benefit) throws Throwable {
		CoveragePage.select_Benefit_Amount_for_FiveYTL_Insurance_Product_Self_as(Benefit);

	}

	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under FiveYTL$")
	public void selects_Benefit_amount_for_Five_Year_Product_Spouse_as(String Sbenefit) throws Throwable {

		CoveragePage.selects_Benefit_amount_for_Five_Year_Product_Spouse_as(Sbenefit);
	}
	
	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under GTLP75I$")
	public void selects_Benefit_amount_for_GTLP75I_Product_Spouse_as(String Sbenefit) throws Throwable {
		CoveragePage.selects_Benefit_amount_for_Five_Year_Product_Spouse_as(Sbenefit);
	}

	// WAEPA
	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under Group Term Life$")
	public void selects_benefit_amount_for_Group_Term_Life_Product_Spouse_as(String Sbenefit) throws Throwable {

		CoveragePage.selects_Benefit_amount_for_Five_Year_Product_Spouse_as(Sbenefit);
	}

	@Then("^Selects Benefit Amount for Child as \"([^\"]*)\" under FiveYTL$")
	public void selects_benefit_amount_for_FiveYTL_Product_Child_as(String Cbenefit) throws Throwable {

		CoveragePage.selects_benefit_amount_for_FiveYTL_Child_as(Cbenefit);
	}

	@Then("^Selects benefit amount for Group Term Product Child as \"([^\"]*)\"$")
	public void selects_benefit_amount_for_Group_Term_Product_Child_as(String Cbenefit) throws Throwable {
		CoveragePage.selects_benefit_amount_for_FiveYTL_Child_as(Cbenefit);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under ADDI$")
	public void selects_Self_benefit_amount_of_for_Accidental_Death_as(String Benefit) throws Throwable {
		CoveragePage.selects_Self_benefit_amount_of_for_Accidental_Death_as(Benefit);
	}

	@Then("^Validates under FiveYTL the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_TLI_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_FiveYTL_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	// WAEPA
	@Then("^Validates under Group Term Life the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_Group_Term_Life_the_Benefit_Slider_Range_as_to(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_FiveYTL_the_Benefit_Slider_Range_as_to(Min, Max);
	}
	
	@Then("^Validates under GIGTL the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_GIGTL_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_FiveYTL_the_Benefit_Slider_Range_as_to(Min, Max);
	}
	
	@Then("^Validates under GTLP75I the Benefit Slider Range for Self as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_GTLP75I_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_FiveYTL_the_Benefit_Slider_Range_as_to(Min, Max);
	}
	
	@Then("^Validates AD under GTLP75I the Benefit Slider Range for Self as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_AD_Under_GTLP75I_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_AD_Under_GTLP75I_the_Benefit_Slider_Range_as_to(Min, Max);
	}
	
	@Then("^Validates AD under GTLP75I the Benefit Slider Range for Spouse as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_AD_Under_GTLP75I_the_Benefit_Slider_Range_Spouse_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_AD_Under_GTLP75I_the_Benefit_Slider_Range__for_spouse_as_to(Min, Max);
	}
	
	@Then("^Validates AD under Flex10 the Benefit Slider Range for Self as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_AD_Under_Flex10_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_AD_Under_Flex10_the_Benefit_Slider_Range_as_to(Min, Max);
	}
	
	@Then("^Validates AD under Flex10 the Benefit Slider Range for Spouse as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_AD_Under_Flex10_the_Benefit_Slider_Range_Spouse_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_AD_Under_Flex10_the_Benefit_Slider_Range_Spouse_as_to(Min, Max);
	}
	
	@Then("^Validates AD under Flex20 the Benefit Slider Range for Self as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_AD_Under_Flex20_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_AD_Under_Flex20_the_Benefit_Slider_Range_as_to(Min, Max);
	}
	
	@Then("^Validates AD under Flex20 the Benefit Slider Range for Spouse as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_AD_Under_Flex20_the_Benefit_Slider_Range_Spouse_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_AD_Under_Flex20_the_Benefit_Slider_Range_Spouse_as_to(Min, Max);
	}
	
	@Then("^Selects Chronic Illness Rider for FiveYTL Product Self$")
	public void selects_Chronic_Illness_Rider_for_FiveYTL_Product_Self() throws Throwable {
		CoveragePage.selects_Chronic_Illness_Rider_for_Five_Year_Product();
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under TenYTL$")
	public void selects_Benefit_Amount_for_Self_as_under_TenYTL(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_TenYTL(sBenefit);
	}
	
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under Flex10$")
	public void selects_Benefit_Amount_for_Self_as_under_Flex10(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_TenYTL(sBenefit);
	}

	@Then("^Validates under TenYTL the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for self$")
	public void validates_under_TenYTL_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_TenYTL_the_Benefit_Slider_Range_as_to_Self(Min, Max);
	}
	
	@Then("^Validates under Flex10 the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Self$")
	public void validates_under_Flex10_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_TenYTL_the_Benefit_Slider_Range_as_to_Self(Min, Max);
	}
	
	@Then("^Validates under GTenYTL the Benefit Slider Range for Self as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_GTenYTL_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_TenYTL_the_Benefit_Slider_Range_as_to_Self(Min, Max);
	}

	@Then("^Selects Waiver of Premium Rider for TenYear for Self$")
	public void selects_Waiver_of_Premium_Rider_for_TenYear_for_Self() throws Throwable {
		CoveragePage.selects_Waiver_of_Premium_Rider_for_TenYear_for_Self();
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under GTenYTL$")
	public void selects_Benefit_Amount_for_Self_as_under_GTenYTL(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_TenYTL(sBenefit);
	}
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under TwentyYTL$")
	public void selects_Benefit_Amount_for_Self_as_under_TwentyYTL(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_TwentyYTL(sBenefit);
	}
	
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under Flex20$")
	public void selects_Benefit_Amount_for_Self_as_under_Flex20(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_TwentyYTL(sBenefit);
	}
	
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" for Optional Rider as AD under GTLP75I$")
	public void selects_Benefit_Amount_for_Self_as_AD_under_GTLP75I(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_AD_under_GTLP75I(sBenefit);
	}
	
	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" for Optional Rider as AD under GTLP75I$")
	public void selects_Benefit_Amount_for_Spouse_as_AD_under_GTLP75I(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_AD_under_GTLP75I(sBenefit);
	}
	
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" for Optional Rider as AD under Flex10$")
	public void selects_Benefit_Amount_for_Self_as_AD_under_Flex10(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_AD_under_Flex10(sBenefit);
	}
	
	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" for Optional Rider as AD under Flex10$")
	public void selects_Benefit_Amount_for_Spouse_as_AD_under_Flex10(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_AD_under_Flex10(sBenefit);
	}
	
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" for Optional Rider as AD under Flex20$")
	public void selects_Benefit_Amount_for_Self_as_AD_under_Flex20(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_AD_under_Flex20(sBenefit);
	}
	
	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" for Optional Rider as AD under Flex20$")
	public void selects_Benefit_Amount_for_Spouse_as_AD_under_Flex20(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_AD_under_Flex20(sBenefit);
	}
	
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under GTwentyYTL$")
	public void selects_Benefit_Amount_for_Self_as_under_GTwentyYTL(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_TwentyYTL(sBenefit);
	}

	@Then("^Validates under TwentyYTL the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_TwentyYTL_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_TwentyYTL_the_Benefit_Slider_Range_as_to(Min, Max);
	}
	
	@Then("^Validates under Flex20 the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Self$")
	public void validates_under_Flex20_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_TwentyYTL_the_Benefit_Slider_Range_as_to(Min, Max);
	}
	
	@Then("^Validates under GTwentyYTL the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_GTwentyYTL_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_TwentyYTL_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Selects Waiver Rider for Twenty Year Product$")
	public void selects_Waiver_Rider_for_Twenty_Year_Product() throws Throwable {
		CoveragePage.selects_Waiver_Rider_for_Twenty_Year_Product();
	}

	@Then("^Selects AD&D Rider for Self under TwentyYTL$")
	public void selects_AD_D_Rider_for_Self_under_TwentyYTL() throws Throwable {
		CoveragePage.selects_Optional_Rider_Self_under_Flex20();
	}

	@Then("^Selects Rider Benefit Amount for Self as \"([^\"]*)\" for ADnD Rider under TwentyYTL$")
	public void selects_Rider_Benefit_Amount_for_Self_as_under_ADnD_Rider(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_AD_under_Flex20(sBenefit);
	}

	@Then("^Validates under ADnD Rider TwentyYTL Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Self$")
	public void validates_under_ADnD_Rider_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_AD_Under_Flex20_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Validates Benefit Amount for Child as \"([^\"]*)\" under TwentyYTL$")
	public void validates_Benefit_Amount_for_Child_as_under_TwentyYTL(String amount) throws Throwable {
		CoveragePage.validates_under_TwentyYTL_the_Benefit_Amounts_for_Child_Listed_are(amount);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under FiftyYTL$")
	public void selects_Benefit_Amount_for_Self_as_under_FiftyYTL(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_FiftyYTL(sBenefit);
	}
	
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under LifeNinetyFive$")
	public void selects_Benefit_Amount_for_Self_as_under_LifeNinetyFive(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_FiftyYTL(sBenefit);
	}
	
	

	@Then("^Validates under FiftyYTL the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_FiftyYTL_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_FiftyYTL_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Validates under LifeNinetyFive the Benefit Slider Range for Self as \"([^\"]*)\", \"([^\"]*)\"$")
	public void validates_under_LifeNinetyFive_the_Benefit_Slider_Range_for_Self_as(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_FiftyYTL_the_Benefit_Slider_Range_as_to(Min, Max);
	}
	
	@Then("^Validates under ADDI the Benefit Slider Range for Self as \"([^\"]*)\", \"([^\"]*)\"$")
	public void validates_under_ADDI_the_Benefit_Slider_Range_for_Self_as(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_Accidental_Death_Benefit_Slider_Range_as_to(Min, Max);
	}
	
	@Then("^Validates under Group Term LI the Benefit Slider Range for Self as \"([^\"]*)\", \"([^\"]*)\"$")
	public void validates_under_Group_Term_LI_the_Benefit_Slider_Range_for_Self_as(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_FiveYTL_the_Benefit_Slider_Range_as_to(Min, Max);
	}
	
	
	// TIE - ADDI locater is different as compare to ADnD and HDD
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under ADnD$")
	public void selects_Benefit_Amount_for_Self_as_under_ADnD(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_ADDI(sBenefit);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under ADDI_cat$")
	public void selects_Benefit_Amount_for_Self_as_under_ADDI_cat(String ADBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_AccidentalDeath(ADBenefit);
	}
	
	@Then("^Validates under ADnD the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_ADnD_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_ADnD_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	//@Then("^Validates Benefit Amount value for Spouse under ADDI as \"([^\"]*)\"$")
	@Then("^Validates Benefit Amount for Spouse as \"([^\"]*)\" under ADDI$")
	public void validates_Benefit_Amount_value_for_Spouse_under_ADDI_as(String Benefit) throws Throwable {
		CoveragePage.validates_Benefit_Amount_value_for_Spouse_under_ADDI_as(Benefit);
	}

	@Then("^Validates Benefit Amount value for Child under ADDI as \"([^\"]*)\"$")
	public void validates_Benefit_Amount_value_for_Child_under_ADDI_as(String Benefit) throws Throwable {
		CoveragePage.validates_Benefit_Amount_value_for_Child_under_ADDI_as(Benefit);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under DIP$")
	public void selects_Type_of_Coverage_as_for_Self_under_DIP(String TypeofCov) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Self_under_DII_or_DIP(TypeofCov);
	}

	// *****************

	@Then("^Validates under ADDI the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_ADDI_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_AccidentalDeath_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under LTDPlus$")
	public void selects_Benefit_Amount_for_Self_as_under_LTDPlus(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_LTDPlus(sBenefit);
	}

	@Then("^Selects Wait Period for Self as \"([^\"]*)\" under LTDPlus$")
	public void selects_Wait_Period_for_Self_as_under_LTDPlus(String period) throws Throwable {
		CoveragePage.selects_Wait_Period_for_Self_as_under_LTDPlus(period);
	}

	@Then("^Validates under LTDPlus the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_LTDPlus_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_LTDPlus_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Selects Catastrophic Disability Benefit Rider for LDTP$")
	public void selects_Catastrophic_Disability_Benefit_Rider_for_LDTP() throws Throwable {
		CoveragePage.selects_Catastrophic_Disability_Benefit_Rider_for_LDTP();
	}

	@Then("^Selects Cost of Living Adjustment Rider under LTDP Product$")
	public void selects_Cost_of_Living_Adjustment_Rider_under_LTDP_Product() throws Throwable {
		CoveragePage.selects_Cost_of_Living_Adjustment_Rider_under_LTDP_Product();
	}

	@Then("^Selects Law School Loan Payment Benefit Rider under LTDP$")
	public void selects_Law_School_Loan_Payment_Benefit_Rider_under_LTDP() throws Throwable {
		CoveragePage.selects_Law_School_Loan_Payment_Benefit_Rider_under_LTDP();
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under LTD$")
	public void selects_Benefit_Amount_for_Self_as_under_LTD(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_LTD(sBenefit);
	}
	
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under GDIILT$")
	public void selects_Benefit_Amount_for_Self_as_under_GDIILT(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_LTD(sBenefit);
	}

	@Then("^Selects Wait Period for Self as \"([^\"]*)\" under LTD$")
	public void selects_Wait_Period_for_Self_as_under_LTD(String period) throws Throwable {
		CoveragePage.selects_Wait_Period_for_Self_as_under_LTD(period);
	}
	
	@Then("^Selects Wait Period for Self as \"([^\"]*)\" under GDIILT$")
	public void selects_Wait_Period_for_Self_as_under_GDIILT(String period) throws Throwable {
		CoveragePage.selects_Wait_Period_for_Self_as_under_LTD(period);
	}

	@Then("^Validates under GDII the Benefit Slider Range for Self as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_GDII_the_Benefit_Slider_Range_for_self_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_LTD_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Validates under LTD the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_LTD_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_LTD_the_Benefit_Slider_Range_as_to(Min, Max);
	}
	
	@Then("^Selects Cost of Living Adjustment Rider under LTD product$")
	public void selects_Cost_of_Living_Adjustment_Rider_under_LTD_product() throws Throwable {
		CoveragePage.selects_Cost_of_Living_Adjustment_Rider_under_LTD_product();
	}
	
	@Then("^Selects Cost of Living Adjustment Rider under GDIILT product$")
	public void selects_Cost_of_Living_Adjustment_Rider_under_GDIILT_product() throws Throwable {
		CoveragePage.selects_Cost_of_Living_Adjustment_Rider_under_LTD_product();
	}

	@Then("^Selects Law School Loan Payment Benefit Rider under LTD$")
	public void selects_Law_School_Loan_Payment_Benefit_Rider_under_LTD() throws Throwable {
		CoveragePage.selects_Law_School_Loan_Payment_Benefit_Rider_under_LTD();
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under MTDI$")
	public void selects_Benefit_Amount_for_Self_as_under_MTDI(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_MTDI(sBenefit);
	}
	
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under GDIIST$")
	public void selects_Benefit_Amount_for_Self_as_under_GDIIST(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_MTDI(sBenefit);
	}

	@Then("^Selects Wait Period for Self as \"([^\"]*)\" under MTDI$")
	public void selects_Wait_Period_for_Self_as_under_MTDI(String period) throws Throwable {
		CoveragePage.selects_Wait_Period_for_Self_as_under_MTDI(period);
	}

	@Then("^Validates under MTDI the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_MTDI_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_MTDI_the_Benefit_Slider_Range_as_to(Min, Max);
	}
	
	@Then("^Validates under GDIIST the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_GDIIST_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_MTDI_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under CI$")
	public void selects_Benefit_Amount_for_Self_as_under_CI(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_CI(sBenefit);
	}

	@Then("^Validates under CI the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_CI_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_CI_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under RDI$")
	public void selects_Benefit_Amount_for_Self_as_under_RDI(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_RDI(sBenefit);
	}

	@Then("^Validates under RDI the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_RDI_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_RDI_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Selects Wait Period for Self as \"([^\"]*)\" under RDI$")
	public void selects_Wait_Period_for_Self_as_under_RDI(String period) throws Throwable {
		CoveragePage.selects_Wait_Period_for_Self_as_under_RDI(period);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under POEDI$")
	public void selects_Benefit_Amount_for_Self_as_under_POEDI(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_POEDI_BOE_OO(sBenefit);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under BOE$")
	public void selects_Benefit_Amount_for_Self_as_under_BOE(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_POEDI_BOE_OO(sBenefit);
	}

	@Then("^Click on Long-Term Disability Plus Insurance on Request Coverage Page$")
	public void click_on_Long_Term_Disability_Plus_Insurance_on_Request_Coverage_Page() throws Throwable {
		CoveragePage.click_on_Long_Term_Disability_Plus_Insurance_on_Request_Coverage_Page();
	}

	@Then("^Click on Long-Term Disability Insurance on Request Coverage Page$")
	public void click_on_Long_Term_Disability_Insurance_on_Request_Coverage_Page() throws Throwable {
		CoveragePage.click_on_Long_Term_Disability_Insurance_on_Request_Coverage_Page();
	}

	@Then("^Click on Mid-Term Disability Insurance on Request Coverage Page$")
	public void click_on_Mid_Term_Disability_Insurance_on_Request_Coverage_Page() throws Throwable {
		CoveragePage.click_on_Mid_Term_Disability_Insurance_on_Request_Coverage_Page();
	}

	@Then("^Verify that Quick Decision is Unavailable for FiveYTL Self$")
	public void verify_that_Quick_Decision_is_Unavailable_for_FiveYTL_Self() throws Throwable {
		CoveragePage.verify_that_Quick_Decision_is_Unavailable_for_FiveYTL_Self();
	}

	@Then("^Deselects Chronic Illness Rider for FiveYTL self$")
	public void deselects_Chronic_Illness_Rider_for_TLI_self() throws Throwable {
		CoveragePage.selects_Chronic_Illness_Rider_for_Five_Year_Product();
	}

	@Then("^Verify that Quick Decision is Available for FiveYTL Self$")
	public void verify_that_Quick_Decision_is_Available_for_FiveYTL_Self() throws Throwable {
		CoveragePage.verify_that_Quick_Decision_is_Available_for_FiveYTL_Self();
	}

	// AAFP
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under PO$")
	public void selects_Benefit_Amount_for_Self_as_under_PO(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_POEDI_BOE_OO(sBenefit);
	}

	@Then("^Selects Wait Period for Self as \"([^\"]*)\" under PO$")
	public void selects_Wait_Period_for_Self_as_under_PO(String WaitPeriod1) throws Throwable {
		CoveragePage.selects_Wait_Period_for_Self_as_under_PO_POEDI_BOE(WaitPeriod1);
	}

	@Then("^Selects Wait Period for Self as \"([^\"]*)\" under BOE$")
	public void selects_Wait_Period_for_Self_as_under_BOE(String waitPeriod) throws Throwable {
		CoveragePage.selects_Wait_Period_for_Self_as_under_PO_POEDI_BOE(waitPeriod);
	}
	
	@Then("^Selects Wait Period for Self as \"([^\"]*)\" under GOOEI$")
	public void selects_Wait_Period_for_Self_as_under_GOOEI(String waitPeriod) throws Throwable {
		CoveragePage.selects_Wait_Period_for_Self_as_under_PO_POEDI_BOE(waitPeriod);
	}

	@Then("^Validate Benefit Duration dropdown values for Self as \"([^\"]*)\" under BOE$")
	public void validate_Benefit_Duration_values_for_Self_as_under_BOE(String amount) throws Throwable {
		CoveragePage.validate_Benefit_Duration_values_for_Self_as_under_BOE_from_dropdown(amount);
	}
	
	@Then("^Validate Benefit Duration dropdown values for Self as \"([^\"]*)\" under GOOEI$")
	public void validate_Benefit_Duration_values_for_Self_as_under_GOOEI(String amount) throws Throwable {
		CoveragePage.validate_Benefit_Duration_values_for_Self_as_under_BOE_from_dropdown(amount);
	}

	@Then("^Validates under POEDI the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_POEDI_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_POEDI_OR_BOE_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Validates under PO the Benefit Slider Range for Self as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_PO_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_POEDI_OR_BOE_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Validates under BOE the Benefit Slider Range for Self as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_BOE_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_POEDI_OR_BOE_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under HMI$")
	public void selects_Benefit_Amount_for_Self_as_under_HMI(String benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_HMI(benefit);
	}

	@Then("^Selects Surgical Option Rider for Self under HMI$")
	public void selects_Surgical_Option_Rider() throws Throwable {
		CoveragePage.selects_Surgical_Option_Rider();
	}

	@Then("^Selects Surgical Amount as \"([^\"]*)\"$")
	public void selects_Surgical_Amount_as(String amount) throws Throwable {
		CoveragePage.selects_Surgical_Amount_as(amount);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under HII$")
	public void selects_Benefit_Amount_for_Self_as_under_HII(String benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_HMI(benefit);
	}
	
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under InHospitalInsurance$")
	public void selects_Benefit_Amount_for_Self_as_under_InHospitalInsurance(String benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_HMI(benefit);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under GHII$")
	public void selects_Benefit_Amount_for_Self_as_under_GHII(String benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_HMI(benefit);
	}
	@Then("^Validates Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Self under HLDD$")
	public void validates_Benefit_Slider_Range_as_to_for_Self_under_HLDD(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_AccidentalDeath_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Validates under AOD the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for self$")
	public void validates_under_AOD_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_AOD_the_Benefit_Slider_Range_as_to_for_Self(Min, Max);
	}

	// TIE
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Spouse under ADDI$")
	public void selects_Type_of_Coverage_as_for_Spouse_under_ADDI(String TypeofCov_ADDI) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_spouse_ADDI(TypeofCov_ADDI);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Child under ADDI$")
	public void selects_Type_of_Coverage_as_for_Child_under_ADDI(String TypeofCov_ADD) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_child_ADDI(TypeofCov_ADD);
	}

	@Then("^Validates under TermLife the Benefit Slider Range for CIR as \"([^\"]*)\" to \"([^\"]*)\" for Self$")
	public void validates_under_TermLife_the_Benefit_Slider_Range_for_CIR_as_to_for_Self(String Min_CIR, String Max_CIR)
			throws Throwable {
		CoveragePage.validates_under_TermLife_the_Benefit_Slider_Range_for_CIR_as_to_for_Self(Min_CIR, Max_CIR);
	}
	
	@Then("^Validates under GTTLI the Benefit Slider Range for CIR as \"([^\"]*)\" to \"([^\"]*)\" for Self$")
	public void validates_under_GTTLI_the_Benefit_Slider_Range_for_CIR_as_to_for_Self(String Min_CIR, String Max_CIR)
			throws Throwable {
		CoveragePage.validates_under_TermLife_the_Benefit_Slider_Range_for_CIR_as_to_for_Self(Min_CIR, Max_CIR);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under FifteenYTL$")
	public void selects_Benefit_Amount_for_Self_as_under_FifteenYTL(String Benefit2) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_FifteenYr(Benefit2);
	}

	@Then("^Validates under FifteenYTL the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for self$")
	public void validates_under_FifteenYTL_the_Benefit_Slider_Range_as_to_for_self(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_FifteenYTL_the_Benefit_Slider_Range_for_Self(Min, Max);
	}
	
	@Then("^Selects Waiver of Premium Rider for Self under FifteenYTL$")
	public void selects_Waiver_of_Premium_Rider_for_Self_under_FifteenYTL() throws Throwable {
		CoveragePage.selects_Waiver_of_Premium_Rider_for_Self_under_FifteenYTL();
	}

	@Then("^Selects AD&D Rider for Self under FifteenYTL$")
	public void selects_AD_D_Rider_for_Self_under_FifteenYTL() throws Throwable {
		CoveragePage.selects_AD_D_Rider_for_Self_under_FifteenYTL();
	}

	@Then("^Selects Rider Benefit Amount for Self as \"([^\"]*)\" for ADnD Rider under FifteenYTL$")
	public void selects_Rider_Benefit_Amount_for_Self_as_for_ADnD_Rider_under_FifteenYTL(String Benefit2) throws Throwable {
		CoveragePage.selects_Rider_Benefit_Amount_for_Self_as_for_ADnD_Rider_under_FifteenYTL(Benefit2);
	}

	@Then("^Validates under ADnD Rider FifteenYTL Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Self$")
	public void validates_under_ADnD_Rider_FifteenYTL_Benefit_Slider_Range_as_to_for_Self(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_ADnD_Rider_FifteenYTL_Benefit_Slider_Range_as_to_for_Self(Min, Max);
	}

	
	@Then("^Selects AD&D Rider for Self under TenYTL$")
	public void selects_AD_D_Rider_for_Self_under_TenYTL() throws Throwable {
		CoveragePage.selects_Optional_Rider_Self_under_Flex10();
	}

	@Then("^Selects Rider Benefit Amount for Self as \"([^\"]*)\" for ADnD Rider under TenYTL$")
	public void selects_Rider_Benefit_Amount_for_Self_as_for_ADnD_Rider_under_TenYTL(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_AD_under_Flex10(sBenefit);
	}

	@Then("^Validates under ADnD Rider the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Self$")
	public void validates_under_ADnD_Rider_the_Benefit_Slider_Range_as_to_for_Self(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_AD_Under_Flex10_the_Benefit_Slider_Range_as_to(Min, Max);
	}
	
	

	@Then("^Selects Future Purchase Option Rider under LTD product$")
	public void selects_Future_Purchase_Option_Rider_under_LTD_product() throws Throwable {
		CoveragePage.selects_Future_Purchase_Option_rider_under_LTD_product();
	}
	
	@Then("^Selects Future Purchase Option Rider under GDIILT product$")
	public void selects_Future_Purchase_Option_Rider_under_GDIILT_product() throws Throwable {
		CoveragePage.selects_Future_Purchase_Option_rider_under_LTD_product();
	}

	@Then("^Selects FPO Rider Benefit Amount for Self as \"([^\"]*)\"$")
	public void selects_FPO_Rider_Benefit_Amount_for_Self_as(String Benefit) throws Throwable {
		CoveragePage.selects_FPO_Rider_Benefit_Amount_for_Self_as(Benefit);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under STD$")
	public void selects_Benefit_Amount_for_Self_as_under_STD(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_STD(sBenefit);
	}

	@Then("^Validates Benefit Duration for Self as \"([^\"]*)\" under STD$")
	public void validates_Benefit_Duration_for_Self_as_under_STD(String duration) throws Throwable {
		CoveragePage.validates_Benefit_Duration_for_Self_as_under_STD(duration);
	}

	@Then("^Selects Wait Period for Self as \"([^\"]*)\" under STD$")
	public void selects_Wait_Period_for_Self_as_under_STD(String period) throws Throwable {
		CoveragePage.selects_Wait_Period_for_Self_as_under_STD(period);
	}

	@Then("^Validates under STD the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for self$")
	public void validates_under_STD_the_Benefit_Slider_Range_as_to_for_self(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_STD_the_Benefit_Slider_Range_for_Self(Min, Max);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under OOEDI$")
	public void selects_Benefit_Amount_for_Self_as_under_OOEDI(String Benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_POEDI_BOE_OO(Benefit);
	}
	
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under GOOEI$")
	public void selects_Benefit_Amount_for_Self_as_under_GOOEI(String Benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_POEDI_BOE_OO(Benefit);
	}
	
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under GPOEI$")
	public void selects_Benefit_Amount_for_Self_as_under_GPOEI(String Benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_POEDI_BOE_OO(Benefit);
	}

	@Then("^Validates Wait Period for Self as \"([^\"]*)\" under OOEDI$")
	public void validates_Wait_Period_for_Self_as_under_OOEDI(String wPeriod) throws Throwable {
		CoveragePage.validates_Wait_Period_for_Self_as_under_OOEDI_displayed_as_label(wPeriod);
	}

	@Then("^Validate dropdown values of Waiting Period for Self as \"([^\"]*)\" under BOE$")
	public void validates_dropdown_values_of_Waiting_Period_for_Self_as_under_BOE(String wPeriod) throws Throwable {
		CoveragePage.validates_dropdown_values_for_Wait_Period_for_Self_as_under_BOE_POEDI_PO(wPeriod);
	}
	
	@Then("^Validate dropdown values of Waiting Period for Self as \"([^\"]*)\" under GOOEI$")
	public void validates_dropdown_values_of_Waiting_Period_for_Self_as_under_GOOEI(String wPeriod) throws Throwable {
		CoveragePage.validates_dropdown_values_for_Wait_Period_for_Self_as_under_BOE_POEDI_PO(wPeriod);
	}
	
	@Then("^Validate dropdown values of Waiting Period for Self as \"([^\"]*)\" under GPOEI$")
	public void validates_dropdown_values_of_Waiting_Period_for_Self_as_under_GPOEI(String wPeriod) throws Throwable {
		CoveragePage.validates_dropdown_values_for_Wait_Period_for_Self_as_under_BOE_POEDI_PO(wPeriod);
	}

	@Then("^Validates Benefit Duration for Self as \"([^\"]*)\" under OOEDI displayed in label$")
	public void validates_Benefit_Duration_for_Self_as_under_OOEDI(String bDuration) throws Throwable {
		CoveragePage.validates_Benefit_duration_for_Self_as_under_OOEDI_displayed_as_label(bDuration);
	}

	@Then("^Validates under OOEDI the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_OOEDI_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_POEDI_OR_BOE_the_Benefit_Slider_Range_as_to(Min, Max);
	}
	
	@Then("^Validates under GOOEI the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_GOOEI_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_POEDI_OR_BOE_the_Benefit_Slider_Range_as_to(Min, Max);
	}
	
	@Then("^Validates under GPOEI the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_GPOEI_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_POEDI_OR_BOE_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under SDI$")
	public void selects_Benefit_Amount_for_Self_as_under_SDI(String bAmount) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_SDI(bAmount);
	}

	@Then("^Validates under SDI the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for self$")
	public void validates_under_SDI_the_Benefit_Slider_Range_as_to_for_self(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_SDI_the_Benefit_Slider_Range_for_Self(Min, Max);
	}

	@Then("^Validates Wait Period for Self as \"([^\"]*)\" under SDI$")
	public void validates_Wait_Period_for_Self_as_under_SDI(String wPeriod) throws Throwable {
		CoveragePage.validates_Wait_Period_for_Self_as_under_SDI(wPeriod);
	}

	@Then("^Validates dropdown values of Wait Period for Self as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" under GDII$")
	public void validates_Wait_Period_for_Self_as_under_GDII(String wPeriod,String wPeriod1,String wPeriod2) throws Throwable {
		CoveragePage.validates_Wait_Period_for_Self_as_under_GDII(wPeriod);
		CoveragePage.validates_Wait_Period_for_Self_as_under_GDII(wPeriod1);
		CoveragePage.validates_Wait_Period_for_Self_as_under_GDII(wPeriod2);
	}
	
	@Then("^Validates dropdown values of Benefit Option as \"([^\"]*)\",\"([^\"]*)\" under GDII$")
	public void validates_benefit_option_for_Self_as_under_GDII(String option,String option1) throws Throwable {
		CoveragePage.validates_dropdown_values_benefit_option_for_Self_as_under_GDII(option);
		CoveragePage.validates_dropdown_values_benefit_option_for_Self_as_under_GDII(option1);
		
	}
	
	@Then("^Selects Benefit Duration for Self as \"([^\"]*)\" under SDI$")
	public void selects_Benefit_Duration_for_Self_as_under_SDI(String bDuration) throws Throwable {
		CoveragePage.selects_Benefit_Duration_for_Self_as_under_SDI(bDuration);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for AD&D rider under ARTL for Self$")
	public void selects_Type_of_Coverage_as_for_AD_D_rider_under_ARTL_for_Self(String TypeofCov) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Self_for_ADDRider_under_ARTL_or_TermLife(TypeofCov);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under AOD$")
	public void selects_Benefit_Amount_for_Self_as_under_AOD(String Benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_AOD(Benefit);
	}

	@Then("^Selects Benefit Duration for Self as \"([^\"]*)\" under AOD$")
	public void selects_Benefit_Duration_for_Self_as_under_AOD(String Benefit) throws Throwable {
		CoveragePage.select_Benefit_Duration_for_Self_as_under_AOD(Benefit);
	}

	@Then("^Selects Benefit Duration for Self as \"([^\"]*)\" under BOE$")
	public void selects_Benefit_Duration_for_Self_as_under_BOE(String duration) throws Throwable {
		CoveragePage.selects_Benefit_Duration_for_Self_as_under_BOE(duration);
	}
	
	@Then("^Selects Benefit Duration for Self as \"([^\"]*)\" under GOOEI$")
	public void selects_Benefit_Duration_for_Self_as_under_GOOEI(String duration) throws Throwable {
		CoveragePage.selects_Benefit_Duration_for_Self_as_under_BOE(duration);
	}
	
	@Then("^Selects Benefit Duration for Self as \"([^\"]*)\" under GPOEI$")
	public void selects_Benefit_Duration_for_Self_as_under_GPOEI(String duration) throws Throwable {
		CoveragePage.selects_Benefit_Duration_for_Self_as_under_BOE(duration);
	}

	@Then("^Selects Guaranteed Purchase Option checkbox for Self under BOE$")
	public void selects_Guaranteed_Purchase_Option_checkbox_for_Self_under_BOE() throws Throwable {
		CoveragePage.selects_Guaranteed_Purchase_Option_checkbox_for_Self_under_BOE();
	}

	@Then("^Selects Recovery Option checkbox for Self under BOE$")
	public void selects_Recovery_Option_checkbox_for_Self_under_BOE() throws Throwable {
		CoveragePage.selects_Recovery_Option_checkbox_for_Self_under_BOE();
	}

	@Then("^Selects Retroactive checkbox for Self under BOE$")
	public void selects_Retroactive_checkbox_for_Self_under_BOE() throws Throwable {
		CoveragePage.selects_Retroactive_checkbox_for_Self_under_BOE();
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under TGTLI$")
	public void selects_Benefit_Amount_for_Self_as_under_TGTLI(String Benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_TermLife_or_ARTL(Benefit);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under TGTLI$")
	public void selects_Type_of_Coverage_as_for_Self_under_TGTLI(String TypeofCove) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_self_TermLife(TypeofCove);
	}

	@Then("^Validates Change in Coverage Option for Spouse is not displayed under TGTLI$")
	public void validates_Change_in_Coverage_Option_for_Spouse_is_not_displayed_under_TGTLI() throws Throwable {
	CoveragePage.verify_Change_in_Coverage_is_unavailable_under_ARTL_or_TermLife_for_Spouse();
	}

	@Then("^Validates under TGTLI the Benefit Slider Range for Self as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_TGTLI_the_Benefit_Slider_Range_for_Self_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_TermLife_or_ARTL_the_Benefit_Slider_Range_for_Self_as_to(Min, Max);
	}
	
	@Then("^Validates under GTTLI the Benefit Slider Range for Self as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_GTTLI_the_Benefit_Slider_Range_for_Self_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_TermLife_or_ARTL_the_Benefit_Slider_Range_for_Self_as_to(Min, Max);
	}

	@Then("^Selects Automatic Benefit Increase Option Rider for Self under TGTLI$")
	public void selects_Automatic_Benefit_Increase_Option_Rider_for_Self_under_TGTLI() throws Throwable {
		CoveragePage.selects_Automatic_Benefit_Increase_Option_Self_under_TraditionalGroupTermLifeInsurance();
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Spouse under TGTLI$")
	public void selects_Type_of_Coverage_as_for_Spouse_under_TGTLI(String STypeofCove) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_spouse_ARTL_or_TermLife(STypeofCove);
	}

	@Then("^Validates under TGTLI the Benefit Slider Range for Spouse as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_TGTLI_the_Benefit_Slider_Range_for_Spouse_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_TermLife_or_ARTL_the_Benefit_Slider_Range_for_Spouse_as_to(Min, Max);
	}

	@Then("^Selects Automatic Benefit Increase Option Rider for Spouse under TGTLI$")
	public void selects_Automatic_Benefit_Increase_Option_Rider_for_Spouse_under_TGTLI() throws Throwable {
		CoveragePage.selects_Automatic_Benefit_Increase_Option_Spouse_under_TraditionalGroupTermLifeInsurance();
	}
	
	@Then("^Validates under FPO the Benefit Slider Range for Self as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_FPO_the_Benefit_Slider_Range_for_self_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_FPO_the_Benefit_Slider_Range_as_to(Min, Max);
	}
	
	@Then("^Validates that Rider Message is displayed for Self under GTLI$")
	public void validates_that_Rider_Message_is_displayed_for_Self_under_GTLI() throws Throwable {
		CoveragePage.validates_that_Rider_Message_is_displayed_for_Self_under_GTLI();
	}

	@Then("^Validates that Basic Life Coverage Message is displayed for Self under GTLI$")
	public void validates_that_Basic_Life_Coverage_Message_is_displayed_for_Self_under_GTLI() throws Throwable {
		CoveragePage.validates_that_Basic_Life_Coverage_Message_is_displayed_for_Self_under_GTLI();
	}

	@Then("^Validates Guaranteed Issue Coverage is Not displayed for Self under GTLI$")
	public void validates_Guaranteed_Issue_Coverage_is_Not_displayed_for_Self_under_GTLI() throws Throwable {
		CoveragePage.validates_Guaranteed_Issue_Coverage_is_Not_displayed_for_Self_under_GTLI();
	}

	@Then("^Validates Guaranteed Issue Coverage is displayed for Self under GTLI$")
	public void validates_Guaranteed_Issue_Coverage_is_displayed_for_Self_under_GTLI() throws Throwable {
		CoveragePage.validates_Guaranteed_Issue_Coverage_is_displayed_for_Self_under_GTLI();
	}

	@Then("^Validates that Supplemental Spouse Coverage Message is displayed for Spouse under GTLI$")
	public void validates_that_Supplemental_Spouse_Coverage_Message_is_displayed_for_Spouse_under_GTLI()
			throws Throwable {
		CoveragePage.validates_that_Supplemental_Spouse_Coverage_Message_is_displayed_for_Spouse_under_GTLI();
	}

	@Then("^Validates Guaranteed Issue Coverage is Not displayed for Spouse under GTLI$")
	public void validates_Guaranteed_Issue_Coverage_is_Not_displayed_for_Spouse_under_GTLI() throws Throwable {
		CoveragePage.validates_Guaranteed_Issue_Coverage_is_Not_displayed_for_Spouse_under_GTLI();
	}

	@Then("^Validates Guaranteed Issue Coverage is displayed for Spouse under GTLI$")
	public void validates_Guaranteed_Issue_Coverage_is_displayed_for_Spouse_under_GTLI() throws Throwable {
		CoveragePage.validates_Guaranteed_Issue_Coverage_is_displayed_for_Spouse_under_GTLI();
	}

	@Then("^Verify Type of Coverage Change in Coverage is Unavailable for Spouse under GTLI$")
	public void verify_Type_of_Coverage_Change_in_Coverage_is_Unavailable_for_Spouse_under_GTLI() throws Throwable {
		CoveragePage.verify_Type_of_Coverage_Change_in_Coverage_is_Unavailable_for_Spouse_under_GTLI();
	}

	@Then("^Verify Type of Coverage Change in Coverage is Available for Spouse under GTLI$")
	public void verify_Type_of_Coverage_Change_in_Coverage_is_Available_for_Spouse_under_GTLI() throws Throwable {
		CoveragePage.verify_Type_of_Coverage_Change_in_Coverage_is_Available_for_Spouse_under_GTLI();
	}


	/*---------------------------Spouse----------------------------------------------------*/

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Spouse under Term Life$")
	public void selects_Type_of_Coverage_as_for_Spouse_under_TermLife(String STypeofCove) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_spouse_ARTL_or_TermLife(STypeofCove);
	}
	
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Spouse under GTLI$")
	public void selects_Type_of_Coverage_as_for_Spouse_under_GTLI(String STypeofCove) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_spouse_ARTL_or_TermLife(STypeofCove);
	}
	
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Spouse under G-TLI$")
	public void selects_Type_of_Coverage_as_for_Spouse_under_GroupTLI(String STypeofCove) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Spouse_under_GTLI(STypeofCove);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Spouse under GTTLI$")
	public void selects_Type_of_Coverage_as_for_Spouse_under_GTTLI(String STypeofCove) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_spouse_ARTL_or_TermLife(STypeofCove);
	}

//ARTL is same as TermLife
	@Then("^Selects Type of Coverage as \"([^\"]*)\" under ARTL for Spouse$")
	public void selects_Type_of_Coverage_as_under_ARTL_for_Spouse(String STypeofCove) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_spouse_ARTL_or_TermLife(STypeofCove);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Spouse under TenYTL$")
	public void selects_Type_of_Coverage_as_for_Spouse_under_TenYTL(String TypeofCov_ten) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_spouse_TenYTL(TypeofCov_ten);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Spouse under GTenYTL$")
	public void selects_Type_of_Coverage_as_for_Spouse_under_GTenYTL(String TypeofCov_ten) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_spouse_TenYTL(TypeofCov_ten);
	}
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Spouse under FifteenYTL$")
	public void selects_Type_of_Coverage_as_for_Spouse_under_FifteenYTL(String TypeofCov_fifteen) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_spouse_FifteenYTL(TypeofCov_fifteen);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Spouse under TwentyYTL$")
	public void selects_Type_of_Coverage_as_for_Spouse_under_TwentyYTL(String TypeofCov_Twenty) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_spouse_TwentyYTL(TypeofCov_Twenty);
	}
	
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Spouse under GTwentyYTL$")
	public void selects_Type_of_Coverage_as_for_Spouse_under_GTwentyYTL(String TypeofCov_Twenty) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_spouse_TwentyYTL(TypeofCov_Twenty);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Spouse under Accidental Death$")
	public void selects_Type_of_Coverage_as_for_Spouse_under_Accidental_Death(String TypeofCov_ADnD) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_spouse_Accidental_Death(TypeofCov_ADnD);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Spouse under HII$")
	public void selects_Type_of_Coverage_as_New_for_Spouse_under_HII(String TypeofCov_HII) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Spouse_under_HII(TypeofCov_HII);
	}
	
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Spouse under InHospitalInsurance$")
	public void selects_Type_of_Coverage_as_New_for_Spouse_under_InHospitalInsurance(String TypeofCov_HII) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Spouse_under_HII(TypeofCov_HII);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Spouse under GHII$")
	public void selects_Type_of_Coverage_as_New_for_Spouse_under_GHII(String TypeofCov_HII) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Spouse_under_HII(TypeofCov_HII);
	}
	@Then("^Verify Type of Coverage Change in coverage is unavailable for AD&D under ARTL for Spouse$")
	public void verify_Type_of_Coverage_Change_in_coverage_is_unavailable_for_AD_D_under_ARTL_for_Spouse()
			throws Throwable {
		CoveragePage.verify_Change_in_Coverage_is_unavailable_for_ADDRider_under_ARTL_or_TermLife_for_Spouse();
	}

	@Then("^Verify Type of Coverage Change in coverage is Available under AD&D under ARTL for Spouse$")
	public void verify_Type_of_Coverage_Change_in_coverage_is_Available_under_AD_D_under_ARTL_for_Spouse()
			throws Throwable {
		CoveragePage.verify_Change_in_Coverage_is_available_for_ADDRider_under_ARTL_or_TermLife_for_Spouse();
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for AD&D rider under ARTL for Spouse$")
	public void selects_Type_of_Coverage_as_for_AD_D_rider_under_ARTL_for_Spouse(String TypeofCov) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Spouse_for_ADDRider_under_ARTL_or_TermLife(TypeofCov);
	}

	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under FiftyYTL$")
	public void selects_Benefit_Amount_for_Spouse_as_under_FiftyYTL(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_FiftyYTL(sBenefit);
	}

	@Then("^Validates under FiftyYTL for Spouse the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_FiftyYTL_for_Spouse_the_Benefit_Slider_Range_as_to(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_FiftyYTL_for_Spouse_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Validates under TLI for Spouse the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_FiveYTL_for_Spouse_the_Benefit_Slider_Range_as_to(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_FiveYTL_for_Spouse_the_Benefit_Slider_Range_as_to(Min, Max);
	}
	
	@Then("^Validates under GTLP75I for Spouse the Benefit Slider Range for Spouse as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_GTLP75I_for_Spouse_the_Benefit_Slider_Range_as_to(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_FiveYTL_for_Spouse_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	// WAEPA
	@Then("^Validates under Group Term Life for Spouse the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_Group_Term_Life_for_Spouse_the_Benefit_Slider_Range_as_to(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_FiveYTL_for_Spouse_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under TwentyYTL$")
	public void selects_Benefit_Amount_for_Spouse_as_under_TwentyYTL(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_TwentyYTL(sBenefit);
	}
	
	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under Flex20$")
	public void selects_Benefit_Amount_for_Spouse_as_under_Flex20(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_TwentyYTL(sBenefit);
	}
	
	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under GTwentyYTL$")
	public void selects_Benefit_Amount_for_Spouse_as_under_GTwentyYTL(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_TwentyYTL(sBenefit);
	}

	@Then("^Validates under TwentyYTL for Spouse the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_TwentyYTL_for_Spouse_the_Benefit_Slider_Range_as_to(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_TwentyYTL_for_Spouse_the_Benefit_Slider_Range_as_to(Min, Max);
	}
	
	@Then("^Validates under Flex20 for Spouse the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_Flex20_for_Spouse_the_Benefit_Slider_Range_as_to(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_TwentyYTL_for_Spouse_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under TenYTL$")
	public void selects_benefit_amount_for_Ten_Year_Product_Spouse_as(String Sbenefit) throws Throwable {
		CoveragePage.selects_benefit_amount_for_Ten_Year_Product_Spouse_as(Sbenefit);
	}
	
	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under Flex10$")
	public void selects_benefit_amount_for_Flex10_Product_Spouse_as(String Sbenefit) throws Throwable {
		CoveragePage.selects_benefit_amount_for_Ten_Year_Product_Spouse_as(Sbenefit);
	}

	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under GTenYTL$")
	public void selects_benefit_amount_for_Group_Ten_Year_Product_Spouse_as(String Sbenefit) throws Throwable {
		CoveragePage.selects_benefit_amount_for_Ten_Year_Product_Spouse_as(Sbenefit);
	}
	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under ADDI$")
	public void selects_Spouse_benefit_amount_for_Accidental_Death_as(String SBenefit) throws Throwable {
		CoveragePage.selects_Spouse_benefit_amount_for_Accidental_Death_as(SBenefit);
	}
	
	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under ADDI from dropdown$")
	public void selects_Spouse_benefit_amount_for_Accidental_Death_as_from_dropdown(String SBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_Accidental_death_from_dropdown(SBenefit);
	}

	@Then("^Validates under ADDI the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Spouse$")
	public void validates_under_ADDI_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_ADDI_the_Benefit_Slider_Range_as_to_for_Spouse(Min, Max);
	}

	@Then("^Selects Chronic Illness Rider for FiveYTL Product Spouse$")
	public void selects_Chronic_Illness_Rider_for_Five_Year_Product_Spouse() throws Throwable {
		CoveragePage.selects_Chronic_Illness_Rider_for_Five_Year_Product_Spouse();
	}

	@Then("^Verify Type of Coverage Change in coverage is unavailable under TermLife for Spouse$")
	public void validates_Change_in_Coverage_Option_for_Spouse_is_not_displayed() throws Throwable {
		CoveragePage.verify_Change_in_Coverage_is_unavailable_under_ARTL_or_TermLife_for_Spouse();
	}
	
	@Then("^Verify Type of Coverage Change in coverage is unavailable under GTLI for Spouse$")
	public void validates_Change_in_Coverage_Option_for_Spouse_is_not_displayed_GTLI() throws Throwable {
		CoveragePage.verify_Change_in_Coverage_is_unavailable_under_ARTL_or_TermLife_for_Spouse();
	}

	@Then("^Selects Waiver of Premium Rider for TenYear Spouse$")
	public void selects_Waiver_of_Premium_Rider_for_TenYear_Spouse() throws Throwable {
		CoveragePage.selects_Waiver_of_Premium_Rider_for_TenYear_Spouse();
	}

	@Then("^Selects Waiver Rider for Twenty Year Product Spouse$")
	public void selects_Waiver_Rider_for_Twenty_Year_Product_Spouse() throws Throwable {
		CoveragePage.selects_Waiver_Rider_for_Twenty_Year_Product_Spouse();
	}

	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under LTDPlus$")
	public void selects_Benefit_Amount_for_Spouse_as_under_LTDPlus(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_LTDPlus(sBenefit);
	}

	@Then("^Selects Wait Period for Spouse as \"([^\"]*)\" under LTDPlus$")
	public void selects_Wait_Period_for_Spouse_as_under_LTDPlus(String period) throws Throwable {
		CoveragePage.selects_Wait_Period_for_Spouse_as_under_LTDPlus(period);
	}

	@Then("^Selects Catastrophic Disability Benefit Rider for Spouse under LTDPlus$")
	public void selects_Catastrophic_Disability_Benefit_Rider_for_Spouse_under_LTDPlus() throws Throwable {
		CoveragePage.selects_Catastrophic_Disability_Benefit_Rider_for_Spouse_under_LTDPlus();
	}

	@Then("^Selects Cost of Living Adjustment Rider for LTDP Product for Spouse$")
	public void selects_Cost_of_Living_Adjustment_Rider_for_LTDP_Product_for_Spouse() throws Throwable {
		CoveragePage.selects_Catastrophic_Disability_Benefit_Rider_for_Spouse_under_LTDPlus();
	}

	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under LTD$")
	public void selects_Benefit_Amount_for_Spouse_as_under_LTD(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_LTD(sBenefit);
	}

	@Then("^Selects Wait Period for Spouse as \"([^\"]*)\" under LTD$")
	public void selects_Wait_Period_for_Spouse_as_under_LTD(String period) throws Throwable {
		CoveragePage.selects_Wait_Period_for_Spouse_as_under_LTD(period);
	}

	@Then("^Selects Cost of Living Adjustment Rider for Spouse under LTD$")
	public void selects_Cost_of_Living_Adjustment_Rider_for_Spouse_under_LTD() throws Throwable {
		CoveragePage.selects_Cost_of_Living_Adjustment_Rider_for_Spouse_under_LTD();
	}

	@Then("^Validates under TermLife the Benefit Slider Range for Spouse as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_TermLife_the_Benefit_Slider_Range_for_Spouse_as_to(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_TermLife_or_ARTL_the_Benefit_Slider_Range_for_Spouse_as_to(Min, Max);
	}
	
	@Then("^Validates under GTLI the Benefit Slider Range for Spouse as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_GTLI_the_Benefit_Slider_Range_for_Spouse_as_to(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_TermLife_or_ARTL_the_Benefit_Slider_Range_for_Spouse_as_to(Min, Max);
	}

	@Then("^Validates under GTTLI the Benefit Slider Range for Spouse as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_GTTLI_the_Benefit_Slider_Range_for_Spouse_as_to(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_TermLife_or_ARTL_the_Benefit_Slider_Range_for_Spouse_as_to(Min, Max);
	}
	
	@Then("^Validates under ARTL the Benefit Slider Range for Spouse as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_ARTL_the_Benefit_Slider_Range_for_Spouse_as_to(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_TermLife_or_ARTL_the_Benefit_Slider_Range_for_Spouse_as_to(Min, Max);
	}

	@Then("^Validate Max aggregrate Message is displayed for Group Term Product$")
	public void validate_Max_aggregrate_Message_is_displayed_for_GroupTerm_Product() throws Throwable {
		CoveragePage.validate_Max_aggregrate_Message_is_displayed_for_GroupTerm_Product();
	}

	@Then("^Click on Group Ten-Year Level Term Life Insurance on Request Coverage Page$")
	public void click_on_Group_Ten_Year_Level_Term_Life_Insurance_on_Request_Coverage_Page() throws Throwable {
		CoveragePage.click_on_Group_Ten_Year_Level_Term_Life_Insurance_on_Request_Coverage_Page();
	}

	@Then("^Validate Max aggregrate Message is displayed for TenYTL Product$")
	public void validate_Max_aggregrate_Message_is_displayed_for_TenYTL_Product() throws Throwable {
		CoveragePage.validate_Max_aggregrate_Message_is_displayed_for_TenYTL_Product();
	}

	@Then("^Click on Group Twenty-Year Level Term Life Insurance on Request Coverage Page$")
	public void click_on_Group_Twenty_Year_Level_Term_Life_Insurance_on_Request_Coverage_Page() throws Throwable {
		CoveragePage.click_on_Group_Twenty_Year_Level_Term_Life_Insurance_on_Request_Coverage_Page();
	}

	@Then("^Validate Max aggregrate Message is displayed for TwentyYTL Product$")
	public void validate_Max_aggregrate_Message_is_displayed_for_TwentyYTL_Product() throws Throwable {
		CoveragePage.validate_Max_aggregrate_Message_is_displayed_for_TwentyYTL_Product();
	}

	@Then("^Verify Type of Coverage Change in coverage is unavailable under TenYTL for Spouse$")
	public void verify_Type_of_Coverage_is_unavailable_under_TenYTL_for_Spouse() throws Throwable {
		CoveragePage.verify_Change_in_Coverage_is_unavailable_under_TenYTL_for_Spouse();
	}

	@Then("^Verify Type of Coverage Change in coverage is available under TenYTL for Spouse$")
	public void verify_Type_of_Coverage_is_available_under_TenYTL_for_Spouse() throws Throwable {
		CoveragePage.verify_Change_in_Coverage_is_available_under_TenYTL_for_Spouse();
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" under AOD for Self$")
	public void selects_Type_of_Coverage_as_under_AOD_for_Self(String TypeofCov) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_self_AOD(TypeofCov);
	}

	@Then("^Verify Type of Coverage Change in coverage is unavailable under AOD for Spouse$")
	public void verify_Type_of_Coverage_is_unavailable_under_AOD_for_Spouse() throws Throwable {
		CoveragePage.verify_Change_in_Coverage_is_unavailable_under_AOD_for_Spouse();
	}

	@Then("^Verify Type of Coverage Change in coverage is available under AOD for Spouse$")
	public void verify_Type_of_Coverage_is_Available_under_AOD_for_Spouse() throws Throwable {
		CoveragePage.verify_Change_in_Coverage_is_available_under_AOD_for_Spouse();

	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" under AOD for Spouse$")
	public void selects_Type_of_Coverage_as_under_AOD_for_Spouse(String typeOfCov) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_Spouse_under_AOD(typeOfCov);
	}

	@Then("^Selects Benefit Duration for Spouse as \"([^\"]*)\" under AOD$")
	public void selects_Benefit_Duration_for_Spouse_as_under_AOD(String duration) throws Throwable {
		CoveragePage.selects_Benefit_Duration_for_Spouse_as_under_AOD(duration);
	}

	@Then("^Validates under AOD the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Spouse$")
	public void validates_under_AOD_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_AOD_the_Benefit_Slider_Range_as_to_for_Spouse(Min, Max);
	}

	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under AOD$")
	public void selects_Benefit_Amount_for_Spouse_as_under_AOD(String Benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_AOD(Benefit);
	}
	// ***************************************

	/*
	 * @Then("^Selects Waiting Period for Self as \"([^\"]*)\" under DII$") public
	 * void selects_Waiting_Period_for_Self_as_under_DII(String Period) throws
	 * Throwable {
	 * CoveragePage.selects_Waiting_Period_for_Self_as_under_DII(Period); }
	 */
	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under MTDI$")
	public void selects_Benefit_Amount_for_Spouse_as_under_MTDI(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_MTDI(sBenefit);
	}

	/*
	 * @Then("^Selects Monthly Benefit Amount for Self as \"([^\"]*)\" under DII$")
	 * public void selects_Monthly_Benefit_Amount_for_Self_as_under_DII(String
	 * Benefit) throws Throwable {
	 * CoveragePage.selects_Monthly_Benefit_Amount_for_Self_as_under_DII(Benefit); }
	 */
	@Then("^Validate Maximum Monthly Benefit Amount for DII \"([^\"]*)\"$")
	public void validate_Maximum_Monthly_Benefit_Amount_for_DII(String amount) throws Throwable {
		CoveragePage.validate_Maximum_Monthly_Benefit_Amount_for_Self_for_DII(amount);
	}

	@Then("^Selects Catastrophic Disability Benefit Rider for DII Self$")
	public void selects_Catastrophic_Disability_Benefit_Rider_for_DII_Self() throws Throwable {
		CoveragePage.selects_Catastrophic_Disability_Benefit_Rider_for_DII_Self();
	}

	@Then("^Validate that the Catastrophic Disability Benefit Rider is not rendered$")
	public void validate_that_the_Catastrophic_Disability_Benefit_Rider_is_not_rendered() throws Throwable {
		CoveragePage.validate_that_the_Catastrophic_Disability_Benefit_Rider_is_not_rendered();
	}

	@Then("^Validate that the Catastrophic Disability Benefit Rider is rendered$")
	public void validate_that_the_Catastrophic_Disability_Benefit_Rider_is_rendered() throws Throwable {
		CoveragePage.validate_that_the_Catastrophic_Disability_Benefit_Rider_is_rendered();
	}

	@Then("^Validate that the Rider message is displayed$")
	public void validate_that_the_Rider_message_is_displayed() throws Throwable {
		CoveragePage.validate_that_the_Rider_message_is_displayed();
	}

	// TIE
	@Then("^Selects Monthly Benefit Amount for Self as \"([^\"]*)\" under DisabilityIncomeInsurance$")
	public void selects_Monthly_Benefit_Amount_for_Self_as_under_DisabilityIncomeInsurance(String Benefit)
			throws Throwable {
		CoveragePage.selects_Monthly_Benefit_Amount_for_Self_as_under_DisabilityIncomeInsurance_OR_DIP(Benefit);
	}

	@Then("^Validates under DisabilityIncomeInsurance the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Self$")
	public void validates_under_DisabilityIncomeInsurance_the_Benefit_Slider_Range_as_to_for_Self(String Min,
			String Max) throws Throwable {
		CoveragePage
				.validates_under_DisabilityIncomeInsurance_or_DisabilityIncomeProtectionInsurance_the_Benefit_Slider_Range_as_to_for_Self(
						Min, Max);
	}

	@Then("^Selects Waiting Period for Self as \"([^\"]*)\" under DisabilityIncomeInsurance$")
	public void selects_Waiting_Period_for_Self_as_under_DisabilityIncomeInsurance(String WaitingPeriod)
			throws Throwable {
		CoveragePage.selects_Waiting_Period_for_Self_as_under_DisabilityIncomeInsurance_OR_DIP(WaitingPeriod);
	}

	@Then("^Selects Benefit Option for Self as \"([^\"]*)\" under DisabilityIncomeInsurance$")
	public void selects_Benefit_Option_for_Self_as_under_DisabilityIncomeInsurance(String BenefitOption)
			throws Throwable {
		CoveragePage.selects_Benefit_Option_for_Self_as_under_DisabilityIncomeInsurance(BenefitOption);
	}

	@Then("^Select Rider Benefit Amount for DII Self as \"([^\"]*)\"$")
	public void select_Rider_Benefit_Amount_for_DII_Self_as(String Benefit) throws Throwable {
		CoveragePage.select_Rider_Benefit_Amount_for_DII_Self_as(Benefit);

	}

	@Then("^Validates under Rider the Benefit Slider Range for DII Self as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_Rider_the_Benefit_Slider_Range_for_DII_Self_as_to(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_Rider_the_Benefit_Slider_Range_for_DII_Self_as_to(Min, Max);
	}

	@Then("^Selects Cost of Living Adjustment Rider for DII Self$")
	public void selects_Cost_of_Living_Adjustment_Rider_for_DII_Self() throws Throwable {
		CoveragePage.selects_Cost_of_Living_Adjustment_Rider_for_DII_Self();
	}

	// AAFP

	/*
	 * @Then("^Selects Inflation Protection Option Rider under DII$") public void
	 * selects_Inflation_Protection_Option_Rider_under_DII() throws Throwable {
	 * CoveragePage.selects_Inflation_Protection_Option_Rider_under_DII(); }
	 */

	@Then("^Selects Wait Period for Spouse as \"([^\"]*)\" under MTDI$")
	public void selects_Wait_Period_for_Spouse_as_under_MTDI(String period) throws Throwable {
		CoveragePage.selects_Wait_Period_for_Spouse_as_under_MTDI(period);
	}

	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under CI$")
	public void selects_Benefit_Amount_for_Spouse_as_under_CI(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_CI(sBenefit);
	}

	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under HMI$")
	public void selects_Benefit_Amount_for_Spouse_as_under_HMI(String benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_HMI(benefit);
	}

	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under GHII$")
	public void selects_Benefit_Amount_for_Spouse_as_under_GHII(String benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_HMI(benefit);
	}
	@Then("^Validates under FiveYTL the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Spouse$")
	public void validates_under_FiveYTL_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_FiveYTL_the_Benefit_Slider_Range_as_to_for_Spouse(Min, Max);
	}

	@Then("^Validates under TenYTL the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Spouse$")
	public void validates_under_TenYTL_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_TenYTL_the_Benefit_Slider_Range_as_to_for_Spouse(Min, Max);
	}
	
	@Then("^Validates under Flex10 the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Spouse$")
	public void validates_under_Flex10_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_TenYTL_the_Benefit_Slider_Range_as_to_for_Spouse(Min, Max);
	}

	@Then("^Validates under GTenYTL the Benefit Slider Range for Spouse as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_GTenYTL_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_TenYTL_the_Benefit_Slider_Range_as_to_for_Spouse(Min, Max);
	}
	@Then("^Validates under TwentyYTL the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Spouse$")
	public void validates_under_TwentyYTL_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_TwentyYTL_the_Benefit_Slider_Range_as_to_for_Spouse(Min, Max);
	}
	
	@Then("^Validates under GTwentyYTL the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Spouse$")
	public void validates_under_GTwentyYTL_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_TwentyYTL_the_Benefit_Slider_Range_as_to_for_Spouse(Min, Max);
	}

	@Then("^Validates under LTDPlus the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Spouse$")
	public void validates_under_LTDPlus_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_LTDPlus_the_Benefit_Slider_Range_as_to_for_Spouse(Min, Max);
	}

	@Then("^Validates under LTD the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Spouse$")
	public void validates_under_LTD_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_LTD_the_Benefit_Slider_Range_as_to_for_Spouse(Min, Max);
	}

	@Then("^Validates under MTDI the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Spouse$")
	public void validates_under_MTDI_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_MTDI_the_Benefit_Slider_Range_as_to_for_Spouse(Min, Max);
	}

	@Then("^Validates under CI the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Spouse$")
	public void validates_under_CI_the_Benefit_Slider_Range_as_to_for_Spouse(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_CI_the_Benefit_Slider_Range_as_to_for_Spouse(Min, Max);
	}

	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under HII$")
	public void selects_Benefit_Amount_for_Spouse_as_under_HII(String benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_HMI(benefit);
	}

	@Then("^Selects Benefit Amount for Child as \"([^\"]*)\" under HII$")
	public void selects_Benefit_Amount_for_Child_as_under_HII(String benefit) throws Throwable {
		CoveragePage.selects_benefit_amount_for_Child_as_under_HMI(benefit);
	}
	
	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under InHospitalInsurance$")
	public void selects_Benefit_Amount_for_Spouse_as_under_InHospitalInsurance(String benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_HMI(benefit);
	}

	@Then("^Selects Benefit Amount for Child as \"([^\"]*)\" under InHospitalInsurance$")
	public void selects_Benefit_Amount_for_Child_as_under_InHospitalInsurance(String benefit) throws Throwable {
		CoveragePage.selects_benefit_amount_for_Child_as_under_HMI(benefit);
	}
	
	@Then("^Selects Benefit Amount for Child as \"([^\"]*)\" under GHII$")
	public void selects_Benefit_Amount_for_Child_as_under_GHII(String benefit) throws Throwable {
		CoveragePage.selects_benefit_amount_for_Child_as_under_HMI(benefit);
	}


	@Then("^Validates Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Spouse under HLDD$")
	public void validates_Benefit_Slider_Range_as_to_for_Spouse_under_HLDD(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_ADDI_the_Benefit_Slider_Range_as_to_for_Spouse(Min, Max);
	}

	@Then("^Validates under TermLife the Benefit Slider Range for CIR as \"([^\"]*)\" to \"([^\"]*)\" for Spouse$")
	public void validates_under_TermLife_the_Benefit_Slider_Range_for_CIR_as_to_for_Spouse(String SMin_CIR,
			String SMax_CIR) throws Throwable {
		CoveragePage.validates_under_TermLife_the_Benefit_Slider_Range_for_CIR_as_to_for_Spouse(SMin_CIR, SMax_CIR);
	}
	
	@Then("^Validates under GTTLI the Benefit Slider Range for CIR as \"([^\"]*)\" to \"([^\"]*)\" for Spouse$")
	public void validates_under_GTTLI_the_Benefit_Slider_Range_for_CIR_as_to_for_Spouse(String SMin_CIR,
			String SMax_CIR) throws Throwable {
		CoveragePage.validates_under_TermLife_the_Benefit_Slider_Range_for_CIR_as_to_for_Spouse(SMin_CIR, SMax_CIR);
	}


	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under FifteenYTL$")
	public void selects_Benefit_Amount_for_Spouse_as_under_FifteenYTL(String sBenefit) throws Throwable {
		CoveragePage.selects_benefit_amount_for_Fifteen_Year_Product_Spouse_as(sBenefit);
	}

	@Then("^Validates under FifteenYTL the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for spouse$")
	public void validates_under_FifteenYTL_the_Benefit_Slider_Range_as_to_for_spouse(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_FifteenYTL_the_Benefit_Slider_Range_for_Spouse(Min, Max);
	}

	@Then("^Validates under ADDI the Benefit Amounts Listed for spouse are: \"([^\"]*)\",\"([^\"]*)\"$")
	public void validates_under_ADDI_the_Benefit_Amounts_Listed_for_spouse_are(String ADD_sAmount1,
			String ADD_sAmount2) throws Throwable {
		CoveragePage.validates_under_ADDI_the_Benefit_Amounts_Listed_for_spouse(ADD_sAmount1);
		CoveragePage.validates_under_ADDI_the_Benefit_Amounts_Listed_for_spouse(ADD_sAmount2);
	}

	@Then("^Validates Benefit Amount for Spouse as \"([^\"]*)\" under LTD$")
	public void validates_Benefit_Amount_for_Spouse_as_under_LTD(String SBenefit) throws Throwable {
		CoveragePage.validates_Benefit_Amount_for_Spouse_as_under_LTD(SBenefit);
	}

	@Then("^Validate Waiting Period dropdown values for Self as \"([^\"]*)\", \"([^\"]*)\" under AOD$")
	public void validate_Waiting_Period_dropdown_values_for_Self_as_under_AOD(String wPeriod1, String wPeriod2)
			throws Throwable {
		CoveragePage.validates_Wait_Period_for_Self_as_under_AOD_from_dropdown(wPeriod1);
		CoveragePage.validates_Wait_Period_for_Self_as_under_AOD_from_dropdown(wPeriod2);
	}

	@Then("^Selects Waiting Period for Self as \"([^\"]*)\" under AOD$")
	public void selects_Waiting_Period_for_Self_as_under_AOD(String WaitingPeriod) throws Throwable {
		CoveragePage.selects_Waiting_Period_for_Self_as_under_AOD(WaitingPeriod);
	}

	@Then("^Validates under DIP the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Self$")
	public void validates_under_DIP_the_Benefit_Slider_Range_as_to_for_Self(String Min, String Max) throws Throwable {
		CoveragePage
				.validates_under_DisabilityIncomeInsurance_or_DisabilityIncomeProtectionInsurance_the_Benefit_Slider_Range_as_to_for_Self(
						Min, Max);
	}

	// DII and DIP is same
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under DIP$")
	public void selects_Benefit_Amount_for_Self_as_under_DIP(String Benefit) throws Throwable {
		CoveragePage.selects_Monthly_Benefit_Amount_for_Self_as_under_DisabilityIncomeInsurance_OR_DIP(Benefit);
	}

	@Then("^Selects Waiting Period for Self as \"([^\"]*)\" under DIP$")
	public void selects_Waiting_Period_for_Self_as_under_DIP(String WaitingPeriod) throws Throwable {
		CoveragePage.selects_Waiting_Period_for_Self_as_under_DisabilityIncomeInsurance_OR_DIP(WaitingPeriod);
	}
	
	//NSPE- DII Locater is different as compare to other DII
	@Then("^Selects Waiting Period for Self under DII as \"([^\"]*)\"$")
	public void select_Waiting_Period_for_Self_under_DII_as(String WaitingPeriod) throws Throwable {
		CoveragePage.NSPE_select_Waiting_Period_for_Self_as_under_DII_from_dropdown(WaitingPeriod);
	}

	@Then("^Validate Waiting Period dropdown values for Self as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" under DIP$")
	public void validate_Waiting_Period_dropdown_values_for_Self_as_under_DIP(String wPeriod1, String wPeriod2,
			String wPeriod3, String wPeriod4, String wPeriod5) throws Throwable {
		CoveragePage.validates_Wait_Period_for_Self_as_under_DIP_or_DII_from_dropdown(wPeriod1);
		CoveragePage.validates_Wait_Period_for_Self_as_under_DIP_or_DII_from_dropdown(wPeriod2);
		CoveragePage.validates_Wait_Period_for_Self_as_under_DIP_or_DII_from_dropdown(wPeriod3);
		CoveragePage.validates_Wait_Period_for_Self_as_under_DIP_or_DII_from_dropdown(wPeriod4);
		CoveragePage.validates_Wait_Period_for_Self_as_under_DIP_or_DII_from_dropdown(wPeriod5);
	}

	@Then("^Validate Benefit Duration dropdown values for Self as \"([^\"]*)\", \"([^\"]*)\" under DIP$")
	public void validate_Benefit_Duration_dropdown_values_for_Self_as_under_DIP(String bDuration1, String bDuration2)
			throws Throwable {
		CoveragePage.validates_benefit_Duration_for_Self_as_under_DIP_or_DII_from_dropdown(bDuration1);
		CoveragePage.validates_benefit_Duration_for_Self_as_under_DIP_or_DII_from_dropdown(bDuration2);

	}

	@Then("^Selects Benefit Duration for Self as \"([^\"]*)\" under DIP$")
	public void validate_Benefit_Duration_dropdown_values_for_Self_as_under_DIP(String bDuration) throws Throwable {
		CoveragePage.select_benefit_Duration_for_Self_as_under_DIP_or_DII_from_dropdown(bDuration);

	}
	
	//NSPE- DII Locater is different as compare to other DII
	@Then("^Selects Benefit Duration for Self under DII as \"([^\"]*)\"$")
	public void select_benefit_Duration_for_Self_under_DII_as(String bDuration) throws Throwable {
		CoveragePage.NSPE_select_benefit_Duration_for_Self_as_under_DII_from_dropdown(bDuration);

	}

	@Then("^Selects Accidental Death and Dismemberment checkbox for Self under DIP$")
	public void selects_Accidental_Death_and_Dismemberment_checkbox_for_Self() throws Throwable {
		CoveragePage.selects_Accidental_Death_and_Dismemberment_checkbox_for_Self_under_DIP();
	}

	@Then("^Validates for ADND under DIP the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Self$")
	public void validates_for_ADND_under_DIP_for_Self_the_Benefit_Slider_Range_as_to(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_for_ADND_under_DIP_the_Benefit_Slider_Range_as_to_for_Self(Min, Max);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" for ADND under DIP$")
	public void selects_Benefit_Amount_for_Self_as_under_ADND_under_DIP(String Benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_ADND_under_DIP(Benefit);
	}

	@Then("^Selects Recovery Option checkbox for Self under DIP$")
	public void selects_Recovery_Option_checkbox_for_Self_under_DIP() throws Throwable {
		CoveragePage.selects_Recovery_Option_checkbox_for_Self_under_DIP();
	}

	@Then("^Selects Residual Disability Benefit checkbox for Self under DIP$")
	public void selects_Residual_Disability_Benefit_checkbox_for_Self() throws Throwable {
		CoveragePage.selects_Residual_Disability_Benefit_checkbox_for_Self_under_DIP();
	}

	@Then("^Selects Cost of Living Adjustment Benefit checkbox for Self under DIP$")
	public void selects_Cost_of_Living_Adjustment_Benefit_checkbox_for_Self() throws Throwable {
		CoveragePage.selects_Cost_of_Living_Adjustment_Benefit_checkbox_for_Self_under_DIP();
	}

	@Then("^Selects Hospital Indemnity Protection checkbox for Self under DIP$")
	public void selects_Hospital_Indemnity_Protection_checkbox_for_Self() throws Throwable {
		CoveragePage.selects_Hospital_Indemnity_Protection_checkbox_for_Self_under_DIP();
	}

	@Then("^Validate amount for Hospital Indemnity Protection for Self from dropdown as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" under DIP$")
	public void validate_amount_for_Hospital_Indemnity_Protection_for_Self_as_from_dropdown_under_DIP(String bDuration1,
			String bDuration2, String bDuration3, String bDuration4) throws Throwable {
		CoveragePage.validate_amount_for_Hospital_Indemnity_Protection_for_Self_as_from_dropdown_under_DIP(bDuration1);
		CoveragePage.validate_amount_for_Hospital_Indemnity_Protection_for_Self_as_from_dropdown_under_DIP(bDuration2);
		CoveragePage.validate_amount_for_Hospital_Indemnity_Protection_for_Self_as_from_dropdown_under_DIP(bDuration3);
		CoveragePage.validate_amount_for_Hospital_Indemnity_Protection_for_Self_as_from_dropdown_under_DIP(bDuration4);
	}

	@Then("^Selects amount for Hospital Indemnity Protection for Self as \"([^\"]*)\" under DIP$")
	public void select_amount_for_Hospital_Indemnity_Protection_under_Self_as(String amount) throws Throwable {
		CoveragePage.select_amount_for_Hospital_Indemnity_Protection_for_Self_as_under_DIP(amount);
	}
	//TIE
		@Then("^Verify that Eligible Child Names under TermLife as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
		public void verify_that_Eligible_Child_Names_under_TermLife_as(String CNameEli1, String CNameEli2, String CNameEli3,
				String CNameEli4) throws Throwable {
			CoveragePage.verify_that_Eligible_Child_Names_under_TermLife_as(CNameEli1);
			CoveragePage.verify_that_Eligible_Child_Names_under_TermLife_as(CNameEli2);
			CoveragePage.verify_that_Eligible_Child_Names_under_TermLife_as(CNameEli3);
			CoveragePage.verify_that_Eligible_Child_Names_under_TermLife_as(CNameEli4);
		}
		
		@Then("^Verify that Eligible Child Names under HLAI as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
		public void verify_that_Eligible_Child_Names_under_HLAI_as(String CNameEli1,String CNameEli2,String CNameEli3) throws Throwable {
			CoveragePage.verify_that_Eligible_Child_Names_under_HLAI_as(CNameEli1);
			CoveragePage.verify_that_Eligible_Child_Names_under_HLAI_as(CNameEli2);
			CoveragePage.verify_that_Eligible_Child_Names_under_HLAI_as(CNameEli3);
		}

	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under TGTLI$")
	public void selects_Benefit_Amount_for_Spouse_as_under_TGTLI(String Benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_TermLife_or_ARTL(Benefit);
	}
	/*---------------------------Child----------------------------------------------------*/

	@Then("^Selects Benefit Amount for Child as \"([^\"]*)\" under TGTLI$")
	public void selects_Benefit_Amount_for_Child_as_under_TGTLI(String CBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Child_as_under_TermLife_or_ARTL(CBenefit);
	}
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Child under HII$")
	public void selects_Type_of_Coverage_as_New_for_Child_under_HII(String CTypeofCove) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Child_HII(CTypeofCove);
	}
	
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Child under InHospitalInsurance$")
	public void selects_Type_of_Coverage_as_New_for_Child_under_InHospitalInsurance(String CTypeofCove) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Child_HII(CTypeofCove);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Child under GHII$")
	public void selects_Type_of_Coverage_as_New_for_Child_under_GHII(String CTypeofCove) throws Throwable {
		CoveragePage.selects_Type_of_Coverage_as_for_Child_HII(CTypeofCove);
	}
	@Then("^Selects benefit amount for TLI Product Child as  \"([^\"]*)\"$")
	public void selects_Benefit_Amount_for_Child_as_under_TLI(String CBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Child_as_under_TLI(CBenefit);
	}

	@Then("^Selects Benefit Amount for Child as \"([^\"]*)\" under TenYTL$")
	public void selects_benefit_amount_for_Ten_Year_Product_Child_as(String CBenefit) throws Throwable {
		CoveragePage.selects_benefit_amount_for_Ten_Year_Product_Child_as(CBenefit);
	}

	@Then("^Selects Benefit Amount for Child as \"([^\"]*)\" under GTenYTL$")
	public void selects_benefit_amount_for_GTenYTL_Child_as(String CBenefit) throws Throwable {
		CoveragePage.selects_benefit_amount_for_Ten_Year_Product_Child_as(CBenefit);
	}
	@Then("^Selects Benefit Amount for Child as \"([^\"]*)\" under TwentyYTL$")
	public void selects_benefit_amount_for_Child_as_under_TwentyYTL(String CBenefit) throws Throwable {
		CoveragePage.selects_benefit_amount_for_Child_as_under_TwentyYTL(CBenefit);
	}
	
	@Then("^Selects Benefit Amount for Child as \"([^\"]*)\" under GTwentyYTL$")
	public void selects_benefit_amount_for_Child_as_under_GTwentyYTL(String CBenefit) throws Throwable {
		CoveragePage.selects_benefit_amount_for_Child_as_under_TwentyYTL(CBenefit);
	}

	@Then("^Selects Benefit Amount for Child as \"([^\"]*)\" under ADDI$")
	public void selects_Child_benefit_amount_for_Accidental_Death_as(String Cbenefit) throws Throwable {
		CoveragePage.selects_Child_benefit_amount_for_Accidental_Death_as(Cbenefit);
	}

	@Then("^Selects Benefit Amount for Child as \"([^\"]*)\" under HMI$")
	public void selects_benefit_amount_for_Child_as_under_HMI(String cBenefit) throws Throwable {
		CoveragePage.selects_benefit_amount_for_Child_as_under_HMI(cBenefit);
	}

	@Then("^Verify that Quick Decision is Unavailable under TermLife for Self$")
	public void verify_that_Quick_Decision_is_Unavailable_under_TermLife_for_Self() throws Throwable {
		CoveragePage.verify_that_Quick_Decision_is_Unavailable_under_TermLife_for_Self();
	}

	@Then("^Verify that Quick Decision is Available under TermLife$")
	public void Verify_that_Quick_Decision_is_Available_under_TermLife_for_Self() throws Throwable {
		CoveragePage.Verify_that_Quick_Decision_is_Available_under_TermLife_for_Self();
	}


	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under TermLife$")

	public void selects_Benefit_Amount_for_Self_as_under_TermLife(String Benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_TermLife_or_ARTL(Benefit);
	}
	
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under GTLI$")
	public void selects_Benefit_Amount_for_Self_as_under_GTLI(String Benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_TermLife_or_ARTL(Benefit);
	}

	@Then("^Selects Inforce Benefit Amount for Self as \"([^\"]*)\" under GTLI$")
	public void selects_Inforce_Benefit_Amount_for_Self_as_under_GTLI(String Benefit) throws Throwable {
		CoveragePage.selects_Inforce_Benefit_Amount_for_Self_as_under_GTLI(Benefit);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under GTTLI$")
	public void selects_Benefit_Amount_for_Self_as_under_GTTLI(String Benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_TermLife_or_ARTL(Benefit);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under ARTL$")
	public void selects_Benefit_Amount_for_Self_as_under_ARTL(String Benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_TermLife_or_ARTL(Benefit);
	}

	@Then("^Checks Chronic Illness Rider for Self checkbox under TermLife$")
	public void checks_Chronic_Illness_Rider_for_Self_checkbox_under_TermLife() throws Throwable {
		CoveragePage.checks_Chronic_Illness_Rider_for_Self_checkbox_under_TermLife();
	}

	@Then("^Deselects Chronic Illness Rider for self under TermLife$")
	public void Deselects_Chronic_Illness_Rider_for_self_under_TermLife() throws Throwable {
		CoveragePage.checks_Chronic_Illness_Rider_for_Self_checkbox_under_TermLife();
	}
	
	@Then("^Checks Chronic Illness Rider for Self checkbox under GTTLI$")
	public void checks_Chronic_Illness_Rider_for_Self_checkbox_under_GTTLI() throws Throwable {
		CoveragePage.checks_Chronic_Illness_Rider_for_Self_checkbox_under_TermLife();
	}

	@Then("^Selects CIR portion for Self as \"([^\"]*)\" under TermLife$")
	public void selects_CIR_portion_for_Self_as_under_TermLife(String Benefit) throws Throwable {
		CoveragePage.selects_CIR_portion_for_Self_as_under_TermLife(Benefit);
	}
	
	@Then("^Selects CIR portion for Self as \"([^\"]*)\" under GTTLI$")
	public void selects_CIR_portion_for_Self_as_under_GTTLI(String Benefit) throws Throwable {
		CoveragePage.selects_CIR_portion_for_Self_as_under_TermLife(Benefit);
	}

	@Then("^Verify that Quick Decision is Unavailable under TermLife for Spouse$")
	public void verify_that_Quick_Decision_is_Unavailable_under_TermLife_for_Spouse() throws Throwable {
		CoveragePage.verify_that_Quick_Decision_is_Unavailable_under_TermLife_for_Spouse();
	}

	@Then("^Verify that Quick Decision is Available under TermLife for Spouse$")
	public void verify_that_Quick_Decision_is_Available_under_TermLife_for_Spouse() throws Throwable {
		CoveragePage.verify_that_Quick_Decision_is_Available_under_TermLife_for_Spouse();
	}

	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under TermLife$")
	public void selects_Benefit_Amount_for_Spouse_as_under_TermLife(String Benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_TermLife_or_ARTL(Benefit);
	}

	@Then("^Checks CIR checkbox for Spouse$")
	public void checks_CIR_checkbox_for_Spouse() throws Throwable {
		CoveragePage.checks_CIR_checkbox_for_Spouse();
	}

	@Then("^Selects CIR portion for Spouse as \"([^\"]*)\" under TermLife$")
	public void selects_CIR_portion_for_Spouse_as_under_TermLife(String Benefit) throws Throwable {
		CoveragePage.selects_CIR_portion_for_Spouse_as_under_TermLife(Benefit);
	}

	@Then("^Selects CIR portion for Spouse as \"([^\"]*)\" under GTTLI$")
	public void selects_CIR_portion_for_Spouse_as_under_GTTLI(String Benefit) throws Throwable {
		CoveragePage.selects_CIR_portion_for_Spouse_as_under_TermLife(Benefit);
	}
	
	@Then("^Selects Benefit Amount for Child as \"([^\"]*)\" under TermLife$")
	public void selects_Benefit_Amount_for_Child_as_under_TermLife(String CBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Child_as_under_TermLife_or_ARTL(CBenefit);
	}
	
	/*@Then("^Selects Benefit Amount for Child as \"([^\"]*)\" under TraditionalGroupTermLife$")
	public void selects_Benefit_Amount_for_Child_as_under_TraditionalGroupTermLife(String CBenefit) throws Throwable {
		CoveragePage.selects_benefit_amount_for_TLI_Child_as(CBenefit);
		CoveragePage.selects_Benefit_Amount_for_Child_as_under_GTLI(CBenefit);
	}*/

	@Then("^Validate Benefit Amount for Child as \"([^\"]*)\" under TermLife$")
	public void validate_Benefit_Amount_for_Child_as_under_TermLife(String cBenefit) throws Throwable {
		CoveragePage.validates_Benefit_Amount_for_Child_as_under_TermLife(cBenefit);
	}
	
	@Then("^Validate Benefit amount for child as \"([^\"]*)\",\"([^\"]*)\" under GTTLI$")
	public void validate_Benefit_Amount_for_Child_as_under_GTTLI(String cBenefit,String cBenefit1) throws Throwable {
		CoveragePage.validate_Benefit_Amount_for_Child_from_dropdown_as_under_GTLI(cBenefit);
		CoveragePage.validate_Benefit_Amount_for_Child_from_dropdown_as_under_GTLI(cBenefit1);
	}
	
	@Then("^Validate Benefit Amount for Child as \"([^\"]*)\" under Group Term Life$")
	public void validate_Benefit_Amount_for_Child_as_under_Group_Term_Life(String cBenefit) throws Throwable {
		CoveragePage.validates_Benefit_Amount_for_Child_as_under_TraditionalGroupTermLife(cBenefit);
	}
	
	
	@Then("^Validates benefit amount for Child as \"([^\"]*)\" under TenYTL displayed in label$")
	public void validates_benefit_amount_for_Child_as_under_TenYTL_displayed_in_label(String cBenefit)
			throws Throwable {
		CoveragePage.validates_Benefit_Amount_for_Child_as_under_TenYTL_as_label(cBenefit);

	}

	@Then("^Validates benefit amount for Child as \"([^\"]*)\" under TwentyYTL displayed in label$")
	public void validates_benefit_amount_for_Child_as_under_TwentyYTL_displayed_in_label(String cBenefit)
			throws Throwable {
		CoveragePage.validates_Benefit_Amount_for_Child_as_under_TwentyYTL_as_label(cBenefit);

	}

	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under ARTL$")
	public void selects_Benefit_Amount_for_Spouse_as_under_ARTL(String Benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_TermLife_or_ARTL(Benefit);
	}

	@Then("^Validate Waiting Period dropdown values for Spouse as \"([^\"]*)\", \"([^\"]*)\" under AOD$")
	public void validate_Waiting_Period_dropdown_values_for_Spouse_as_under_AOD(String wPeriod1, String wPeriod2)
			throws Throwable {
		CoveragePage.validates_Wait_Period_for_Spouse_as_under_AOD_from_dropdown(wPeriod1);
		CoveragePage.validates_Wait_Period_for_Spouse_as_under_AOD_from_dropdown(wPeriod2);
	}

	@Then("^Selects Waiting Period for Spouse as \"([^\"]*)\" under AOD$")
	public void selects_Waiting_Period_for_Spouse_as_under_AOD(String WaitingPeriod) throws Throwable {
		CoveragePage.selects_Waiting_Period_for_Spouse_as_under_AOD(WaitingPeriod);
	}
	// AAFP********TermLife Product**************

	@Then("^Validates under TermLife the Benefit Slider Range for Self as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_TermLife_the_Benefit_Slider_Range_for_Self_as_to(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_TermLife_or_ARTL_the_Benefit_Slider_Range_for_Self_as_to(Min, Max);
	}
	
	@Then("^Validates under GTLI the Benefit Slider Range for Self as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_GTLI_the_Benefit_Slider_Range_for_Self_as_to(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_TermLife_or_ARTL_the_Benefit_Slider_Range_for_Self_as_to(Min, Max);
	}

	@Then("^Validates under GTLI the Inforce Benefit Slider Range for Self as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_GTLI_the_Inforce_Benefit_Slider_Range_for_Self_as_to(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_GTLI_the_Inforce_Benefit_Slider_Range_for_Self_as_to(Min, Max);
	}

	@Then("^Validates under TermLife the AD&D Rider Benefit Slider Range for Self as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_TermLife_the_ADnD_Rider_Benefit_Slider_Range_for_Self_as_to(String Min_Rider,
			String Max_Rider) throws Throwable {
		CoveragePage.validates_under_TermLife_or_ARTL_the_ADnD_Rider_Benefit_Slider_Range_for_Self_as_to(Min_Rider,
				Max_Rider);
	}

	@Then("^Validates under ARTL the AD&D Rider Benefit Slider Range for Self as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_ARTL_the_ADnD_Rider_Benefit_Slider_Range_for_Self_as_to(String Min_Rider,
			String Max_Rider) throws Throwable {
		CoveragePage.validates_under_TermLife_or_ARTL_the_ADnD_Rider_Benefit_Slider_Range_for_Self_as_to(Min_Rider,
				Max_Rider);
	}

	@Then("^Selects Optional AD&D Rider under TermLife$")
	public void selects_Optional_AD_D_Rider_under_TermLife() throws Throwable {
		CoveragePage.selects_Optional_AD_D_Rider_under_TermLife_or_ARTL();
	}

	@Then("^Selects Optional AD&D Rider under ARTL for Self$")
	public void selects_Optional_AD_D_Rider_under_ARTL() throws Throwable {
		CoveragePage.selects_Optional_AD_D_Rider_under_TermLife_or_ARTL();
	}

	@Then("^Selects AD&D checkbox for Spouse under ARTL$")
	public void selects_Optional_AD_D_Rider_under_ARTL_for_Spouse() throws Throwable {
		CoveragePage.selects_Optional_AD_D_Rider_under_TermLife_or_ARTL_for_Spouse();
	}

	@Then("^Selects Rider Benefit Amount under TermLife for Self as \"([^\"]*)\"$")
	public void selects_Rider_Benefit_Amount_under_TermLife_for_Self_as(String DRiderBenefit) throws Throwable {
		CoveragePage.selects_Rider_Benefit_Amount_under_TermLife_or_ARTL_for_Self_as(DRiderBenefit);
	}

	@Then("^Selects Rider Benefit Amount under ARTL for Self as \"([^\"]*)\"$")
	public void selects_Rider_Benefit_Amount_under_ARTL_for_Self_as(String DRiderBenefit) throws Throwable {
		CoveragePage.selects_Rider_Benefit_Amount_under_TermLife_or_ARTL_for_Self_as(DRiderBenefit);
	}

	@Then("^Selects Waiver of Premium Rider under TermLife for Self$")
	public void selects_Waiver_of_Premium_Rider_under_TermLife_for_Self() throws Throwable {
		CoveragePage.selects_Waiver_of_Premium_Rider_under_TermLife_for_Self();
	}

	@Then("^Validates under ARTL for Self the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_ARTL_the_Benefit_Slider_Range_for_Self_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_TermLife_or_ARTL_the_Benefit_Slider_Range_for_Self_as_to(Min, Max);
	}

	@Then("^Validate Maximum Monthly Benefit Amount for Self as \"([^\"]*)\" under DIP$")
	public void validate_Maximum_Monthly_Benefit_Amount_for_Self_as_under_DIP(String amount) throws Throwable {
		CoveragePage.validate_Maximum_Monthly_Benefit_Amount_for_Self_for_DII(amount);
	}
	
	@Then("^Validate Maximum Monthly Benefit Amount for Self as \"([^\"]*)\" under GDI$")
	public void validate_Maximum_Monthly_Benefit_Amount_for_Self_as_under_GDI(String amount) throws Throwable {
		CoveragePage.validate_Maximum_Monthly_Benefit_Amount_for_Self_for_DII(amount);
	}

	
	@Then("^Validate Maximum Monthly Benefit Amount for Self as \"([^\"]*)\" under BOE$")
	public void validate_Maximum_Monthly_Benefit_Amount_for_Self_as_under_BOE(String maxMonAmount) throws Throwable {
		CoveragePage.validate_Maximum_Monthly_Benefit_Amount_for_Self_as_BOE(maxMonAmount);
	}
	
	@Then("^Validate Maximum Monthly Benefit Amount for Self as \"([^\"]*)\" under GOOEI$")
	public void validate_Maximum_Monthly_Benefit_Amount_for_Self_as_under_GOOEI(String maxMonAmount) throws Throwable {
		CoveragePage.validate_Maximum_Monthly_Benefit_Amount_for_Self_as_BOE(maxMonAmount);
	}
	
	@Then("^Validate Maximum Monthly Benefit Amount for Self as \"([^\"]*)\" under GPOEI$")
	public void validate_Maximum_Monthly_Benefit_Amount_for_Self_as_under_GPOEI(String maxMonAmount) throws Throwable {
		CoveragePage.validate_Maximum_Monthly_Benefit_Amount_for_Self_as_BOE(maxMonAmount);
	}
	
	@Then("^Validate Maximum Monthly Benefit Amount for Self as \"([^\"]*)\" under GDII$")
	public void validate_Maximum_Monthly_Benefit_Amount_for_Self_as_under_GDII(String amount) throws Throwable {
		CoveragePage.validate_Maximum_Monthly_Benefit_Amount_for_Self_as_under_LTD_or_GDII(amount);
	}
	
	@Then("^Validate Maximum Monthly Benefit Amount for Self as \"([^\"]*)\" under GDIILT$")
	public void validate_Maximum_Monthly_Benefit_Amount_for_Self_as_under_GDIILT(String amount) throws Throwable {
		CoveragePage.validate_Maximum_Monthly_Benefit_Amount_for_Self_as_under_GDII(amount);
	}
	
	@Then("^Validate Waiting Period for Self as \"([^\"]*)\" under GDIIST$")
	public void validate_Waiting_Period_Self_as_under_GDIIST(String amount) throws Throwable {
		CoveragePage.validate_Waiting_Period_Self_as_under_GDIIST(amount);
	}
	
	@Then("^Validate Maximum Monthly Benefit Amount for Self as \"([^\"]*)\" under GDIIST$")
	public void validate_Maximum_Monthly_Benefit_Amount_for_Self_as_under_GDIIST(String amount) throws Throwable {
		CoveragePage.validate_Maximum_Monthly_Benefit_Amount_for_Self_as_under_GDIIST(amount);
	}
	// ***************************************
	@Then("^Validates under Disability Insurance the Benefit Option Listed are: \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validates_under_Disability_insurance_the_Benefit_options_Listed_are(String amount1, String amount2,String amount3,String amount4) throws Throwable {
		CoveragePage.validates_under_AAFP_DII_the_Benefit_Option_Listed_are(amount1);
		CoveragePage.validates_under_AAFP_DII_the_Benefit_Option_Listed_are(amount2);
		CoveragePage.validates_under_AAFP_DII_the_Benefit_Option_Listed_are(amount3);
		CoveragePage.validates_under_AAFP_DII_the_Benefit_Option_Listed_are(amount4);
	}
	@Then("^Selects Waiting Period for Self as \"([^\"]*)\" under DII$")
	public void selects_Waiting_Period_for_Self_as_under_DII(String Period) throws Throwable {
		CoveragePage.selects_Waiting_Period_for_Self_as_under_DII(Period);
	}
	
	@Then("^Selects Waiting Period for Self as \"([^\"]*)\" under GDI$")
	public void selects_Waiting_Period_for_Self_as_under_GDI(String Period) throws Throwable {
		CoveragePage.selects_Waiting_Period_for_Self_as_under_DII(Period);
	}
	
	@Then("^Selects Waiting Period for Self as \"([^\"]*)\" under GDII$")
	public void selects_Waiting_Period_for_Self_as_under_GDII(String Period) throws Throwable {
		CoveragePage.selects_Waiting_Period_for_Self_as_under_GDII(Period);
	}
	
	@Then("^Selects Benefit Option for Self as \"([^\"]*)\" under GDII$")
	public void selects_benefit_option_for_Self_as_under_GDII(String option) throws Throwable {
		CoveragePage.selects_benefit_option_for_Self_as_under_GDII( option);
	}

	@Then("^Validate that the Wait Period is disabled with value as \"([^\"]*)\"$")
	public void validate_that_the_Wait_Period_is_disabled_with_value_as(String Period) throws Throwable {
		CoveragePage.validate_that_the_Wait_Period_is_disabled_with_value_as(Period);
	}

	@Then("^Selects Monthly Benefit Amount for Self as \"([^\"]*)\" under DII$")
	public void selects_Monthly_Benefit_Amount_for_Self_as_under_DII(String Benefit) throws Throwable {
		CoveragePage.selects_Monthly_Benefit_Amount_for_Self_as_under_DII(Benefit);
	}

	@Then("^Selects Monthly Benefit Amount for Self as \"([^\"]*)\" under GDI$")
	public void selects_Monthly_Benefit_Amount_for_Self_as_under_GDI(String Benefit) throws Throwable {
		CoveragePage.selects_Monthly_Benefit_Amount_for_Self_as_under_DII(Benefit);
	}
	
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under GDII$")
	public void selects_Benefit_Amount_for_Self_as_under_GDII(String Benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_LTD(Benefit);
	}

	
	// AAFP
	@Then("^AAFP_Selects Monthly Benefit Amount for Self as \"([^\"]*)\" under DII$")
	public void AAFP_selects_Monthly_Benefit_Amount_for_Self_as_under_DII(String Benefit) throws Throwable {
		CoveragePage.AAFP_selects_Monthly_Benefit_Amount_for_Self_as_under_DII(Benefit);
	}
	
	// NSPE
		@Then("^NSPE_Selects Benefit Amount for Self as \"([^\"]*)\" under DII$")
		public void NSPE_selects_Benefit_Amount_for_Self_as_under_DII(String Benefit) throws Throwable {
			CoveragePage.selects_Benefit_Amount_for_Self_as_under_DII(Benefit);
		}

	@Then("^Selects Inflation Protection Option Rider under DII$")
	public void selects_Inflation_Protection_Option_Rider_under_DII() throws Throwable {
		CoveragePage.selects_Inflation_Protection_Option_Rider_under_DII();
	}

	@Then("^Selects Benefit Option for Self as \"([^\"]*)\" under DII$")
	public void selects_Benefit_Option_for_Self_as_under_DII(String Period) throws Throwable {
		CoveragePage.selects_Benefit_Option_for_Self_as_under_DII(Period);
	}
	
	@Then("^Selects Plan Type for Self as \"([^\"]*)\" under DII$")
	public void selects_Plan_Type_for_Self_as_under_DII(String PlanType) throws Throwable {
		CoveragePage.selects_Plan_Type_for_Self_as_under_DII(PlanType);
	}
	
	@Then("^Selects Benefit Option for Self as \"([^\"]*)\" under GDI$")
	public void selects_Benefit_Option_for_Self_as_under_GDI(String Period) throws Throwable {
		CoveragePage.selects_Benefit_Option_for_Self_as_under_DII(Period);
	}


	@Then("^Validates Monthly Benefit Amount for Spouse as \"([^\"]*)\" under DII$")
	public void validates_Monthly_Benefit_Amount_for_Spouse_as_under_DII(String Benefit) throws Throwable {
		CoveragePage.validates_Monthly_Benefit_Amount_for_Spouse_as_under_DII(Benefit);
	}

	@Then("^Validates Waiting Period for Spouse as \"([^\"]*)\" under DII$")
	public void validates_Waiting_Period_for_Spouse_as_under_DII(String waitPeriod) throws Throwable {
		CoveragePage.validates_Waiting_Period_for_Spouse_as_under_DII(waitPeriod);
	}
	
	@Then("^Validates Plan Type for Self as \"([^\"]*)\" under DII$")
	public void validates_Plan_Type_for_Self_as_under_DII(String PlanType) throws Throwable {
		CoveragePage.validates_Plan_Type_for_Self_as_under_DII(PlanType);
	}
	
	
	@Then("^Validates Benefit Period for Spouse as \"([^\"]*)\" under DII$")
	public void validates_Benefit_Period_for_Spouse_as_under_DII(String benefitPeriod) throws Throwable {
		CoveragePage.validates_Benefit_Period_for_Spouse_as_under_DII(benefitPeriod);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under HLDD$")
	public void selects_Benefit_Amount_for_Self_as_under_HLDD(String Benefit) throws Throwable {
		CoveragePage.selects_Self_benefit_amount_of_for_Accidental_Death_as(Benefit);
	}

	// AAFP
	@Then("^Validates under DII the Benefit Slider Range for Self as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_DII_the_Benefit_Slider_Range_for_Self_as_to(String Min_DII, String Max_DII)
			throws Throwable {
		CoveragePage.validates_under_DII_the_Benefit_Slider_Range_for_Self_as_to(Min_DII, Max_DII);
	}

	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under HLDD$")
	public void selects_Benefit_Amount_for_Spouse_as_under_HLDD(String SBenefit) throws Throwable {
		CoveragePage.selects_Spouse_benefit_amount_for_Accidental_Death_as(SBenefit);
	}

	@Then("^Selects Benefit Amount for Child as \"([^\"]*)\" under HLDD$")
	public void selects_Benefit_Amount_for_Child_as_under_HLDD(String Cbenefit) throws Throwable {
		CoveragePage.selects_Child_benefit_amount_for_Accidental_Death_as(Cbenefit);
	}

	@Then("^Validates under TenYTL the Benefit Amounts Listed are: \"([^\"]*)\"$")
	public void validates_under_TenYTL_the_Benefit_Amounts_Listed_are(String amount) throws Throwable {
		CoveragePage.validates_under_TenYTL_the_Benefit_Amounts_Listed_are(amount);
	}
	
	@Then("^Validates under GTenYTL the Benefit Amounts Listed are: \"([^\"]*)\"$")
	public void validates_under_GTenYTL_the_Benefit_Amounts_Listed_are(String amount) throws Throwable {
		CoveragePage.validates_under_TenYTL_the_Benefit_Amounts_Listed_are(amount);
	}
	
	@Then("^Validates under FiveYTL the Benefit Amounts for Child Listed are: \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validates_under_FiveYTL_the_Benefit_Amounts_for_Child_Listed_are(String amount1, String amount2,
			String amount3, String amount4, String amount5) throws Throwable {
		CoveragePage.validates_under_FiveYTL_the_Benefit_Amounts_for_Child_Listed_are(amount1);
		CoveragePage.validates_under_FiveYTL_the_Benefit_Amounts_for_Child_Listed_are(amount2);
		CoveragePage.validates_under_FiveYTL_the_Benefit_Amounts_for_Child_Listed_are(amount3);
		CoveragePage.validates_under_FiveYTL_the_Benefit_Amounts_for_Child_Listed_are(amount4);
		CoveragePage.validates_under_FiveYTL_the_Benefit_Amounts_for_Child_Listed_are(amount5);
	}

	// TIE
	@Then("^Validates under Term Life the Benefit Amounts for Child Listed are: \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validates_under_Term_Life_the_Benefit_Amounts_for_Child_Listed_are(String amount1, String amount2,
			String amount3, String amount4) throws Throwable {
		CoveragePage.validates_under_Term_Life_the_Benefit_Amounts_for_Child_Listed_are(amount1);
		CoveragePage.validates_under_Term_Life_the_Benefit_Amounts_for_Child_Listed_are(amount2);
		CoveragePage.validates_under_Term_Life_the_Benefit_Amounts_for_Child_Listed_are(amount3);
		CoveragePage.validates_under_Term_Life_the_Benefit_Amounts_for_Child_Listed_are(amount4);
	}

	@Then("^Validates under TenYTL the Benefit Amounts Listed are: \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validates_under_TenYTL_the_Benefit_Amounts_Listed_are(String amount1, String amount2, String amount3,
			String amount4, String amount5) throws Throwable {
		CoveragePage.validates_under_TenYTL_the_Benefit_Amounts_Listed_are(amount1);
		CoveragePage.validates_under_TenYTL_the_Benefit_Amounts_Listed_are(amount2);
		CoveragePage.validates_under_TenYTL_the_Benefit_Amounts_Listed_are(amount3);
		CoveragePage.validates_under_TenYTL_the_Benefit_Amounts_Listed_are(amount4);
		CoveragePage.validates_under_TenYTL_the_Benefit_Amounts_Listed_are(amount5);
	}
	
	@Then("^Validate Benefit amount for child as \"([^\"]*)\",\"([^\"]*)\" under GTenYTL$")
	public void validates_under_GTenYTL_the_Benefit_Amounts_Listed_are(String amount1, String amount2) throws Throwable {
		CoveragePage.validates_under_TenYTL_the_Benefit_Amounts_Listed_are(amount1);
		CoveragePage.validates_under_TenYTL_the_Benefit_Amounts_Listed_are(amount2);
	}

	@Then("^Validates under TwentyYTL the Benefit Amounts for Child Listed are: \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validates_under_TwentyYTL_the_Benefit_Amounts_for_Child_Listed_are(String amount1, String amount2,
			String amount3, String amount4, String amount5) throws Throwable {
		CoveragePage.validates_under_TwentyYTL_the_Benefit_Amounts_for_Child_Listed_are(amount1);
		CoveragePage.validates_under_TwentyYTL_the_Benefit_Amounts_for_Child_Listed_are(amount2);
		CoveragePage.validates_under_TwentyYTL_the_Benefit_Amounts_for_Child_Listed_are(amount3);
		CoveragePage.validates_under_TwentyYTL_the_Benefit_Amounts_for_Child_Listed_are(amount4);
		CoveragePage.validates_under_TwentyYTL_the_Benefit_Amounts_for_Child_Listed_are(amount5);
	}
	
	@Then("^Validate Benefit amount for child as \"([^\"]*)\",\"([^\"]*)\" under GTwentyYTL$")
	public void validates_under_GTwentyYTL_the_Benefit_Amounts_for_Child_Listed_are(String amount1, String amount2) throws Throwable {
		CoveragePage.validates_under_TwentyYTL_the_Benefit_Amounts_for_Child_Listed_are(amount1);
		CoveragePage.validates_under_TwentyYTL_the_Benefit_Amounts_for_Child_Listed_are(amount2);
	}

	@Then("^Validates under HLDD the Benefit Amounts Listed are:\"([^\"]*)\"$")
	public void validates_under_HLDD_the_Benefit_Amounts_Listed_are(String amount) throws Throwable {
		CoveragePage.validates_under_HLDD_the_Benefit_Amounts_Listed_are(amount);

	}

	@Then("^Validates under ADDI the Benefit Amounts for Child Listed are: \"([^\"]*)\",\"([^\"]*)\"$")
	public void validates_under_ADDI_the_Benefit_Amounts_for_Child_Listed_are(String amount1, String amount2)
			throws Throwable {
		CoveragePage.validates_under_HLDD_the_Benefit_Amounts_Listed_are(amount1);
		CoveragePage.validates_under_HLDD_the_Benefit_Amounts_Listed_are(amount2);
	}
	
	@Then("^Validates under ADDI the Benefit Amounts for Child Listed are: \"([^\"]*)\"$")
	public void validates_under_ADDI_the_Benefit_Amounts_for_Child_Listed_are(String amount1)
			throws Throwable {
		CoveragePage.validates_under_HLDD_the_Benefit_Amounts_Listed_are(amount1);
		
	}

	@Then("^Validates under HII the Benefit Amounts for Self Listed are:\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validates_under_HII_the_Benefit_Amounts_for_Self_Listed_are(String amount1, String amount2,
			String amount3, String amount4, String amount5) throws Throwable {
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Self_Listed_are(amount1);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Self_Listed_are(amount2);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Self_Listed_are(amount3);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Self_Listed_are(amount4);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Self_Listed_are(amount5);
	}

	@Then("^Validates under HII the Benefit Amounts for Spouse Listed are:\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validates_under_HII_the_Benefit_Amounts_for_Spouse_Listed_are(String amount1, String amount2,
			String amount3, String amount4, String amount5) throws Throwable {
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Spouse_Listed_are(amount1);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Spouse_Listed_are(amount2);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Spouse_Listed_are(amount3);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Spouse_Listed_are(amount4);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Spouse_Listed_are(amount5);

	}
	
	@Then("^Validates under GHII the Benefit Amounts for Spouse Listed are:\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validates_under_GHII_the_Benefit_Amounts_for_Spouse_Listed_are(String amount1, String amount2,String amount3) throws Throwable {
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Spouse_Listed_are(amount1);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Spouse_Listed_are(amount2);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Spouse_Listed_are(amount3);
		

	}

	@Then("^Validates under HMI the Benefit Amounts for Spouse Listed are: \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validates_under_HMI_the_Benefit_Amounts_for_Spouse_Listed_are(String amount1, String amount2,
			String amount3, String amount4, String amount5, String amount6, String amount7) throws Throwable {
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Spouse_Listed_are(amount1);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Spouse_Listed_are(amount2);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Spouse_Listed_are(amount3);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Spouse_Listed_are(amount4);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Spouse_Listed_are(amount5);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Spouse_Listed_are(amount6);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Spouse_Listed_are(amount7);
	}

	@Then("^Validates under HII the Benefit Amounts for Child Listed are:\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validates_under_HII_the_Benefit_Amounts_for_Child_Listed_are(String amount1, String amount2,
			String amount3, String amount4, String amount5) throws Throwable {
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Child_Listed_are(amount1);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Child_Listed_are(amount2);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Child_Listed_are(amount3);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Child_Listed_are(amount4);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Child_Listed_are(amount5);

	}

	@Then("^Validates under HMI the Benefit Amounts for Child Listed are: \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validates_under_HMI_the_Benefit_Amounts_for_Child_Listed_are(String amount1, String amount2,
			String amount3, String amount4, String amount5, String amount6, String amount7) throws Throwable {
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Child_Listed_are(amount1);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Child_Listed_are(amount2);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Child_Listed_are(amount3);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Child_Listed_are(amount4);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Child_Listed_are(amount5);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Child_Listed_are(amount6);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Child_Listed_are(amount7);

	}

	@Then("^Validates under GHII the Benefit Amounts for Child Listed are: \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validates_under_GHII_the_Benefit_Amounts_for_Child_Listed_are(String amount1, String amount2,
			String amount3) throws Throwable {
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Child_Listed_are(amount1);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Child_Listed_are(amount2);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Child_Listed_are(amount3);

	}
	@Then("^Validates under GHII the Benefit Amounts for Self Listed are: \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validates_under_GHII_the_Benefit_Amounts_for_Self_Listed_are(String amount1, String amount2,String amount3) throws Throwable {
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Self_Listed_are(amount1);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Self_Listed_are(amount2);
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Self_Listed_are(amount3);
		
	}
	@Then("^Validates under DII the Waiting Period Listed are: \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validates_under_DII_the_Waiting_Period_Listed_are(String period1, String period2, String period3,
			String period4) throws Throwable {
		CoveragePage.validates_under_DII_the_Waiting_Period_Listed_are(period1);
		CoveragePage.validates_under_DII_the_Waiting_Period_Listed_are(period2);
		CoveragePage.validates_under_DII_the_Waiting_Period_Listed_are(period3);
		CoveragePage.validates_under_DII_the_Waiting_Period_Listed_are(period4);
	}

	@Then("^Validates under DII the Benefit Option Listed are: \"([^\"]*)\",\"([^\"]*)\"$")
	public void validates_under_DII_the_Benefit_Option_Listed_are(String option1, String option2) throws Throwable {
		CoveragePage.validates_under_DII_the_Benefit_Option_Listed_are(option1);
		CoveragePage.validates_under_DII_the_Benefit_Option_Listed_are(option2);
	}
	
	@Then("^Verify Maximum Monthly Benefit Amount under GDI for Self as \"([^\"]*)\"$")
	public void validates_max_monthly_DII_Benefit_Option_for_self(String option1) throws Throwable {
		CoveragePage.validates_under_DII_the_Benefit_Option_Listed_are(option1);
	}

//AAFP
	@Then("^Validates under DII the Benefit Option Listed are: \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validates_under_DII_the_Benefit_Option_Listed_are(String option1, String option2, String option3,
			String option4) throws Throwable {
		CoveragePage.validates_under_DII_the_Benefit_Option_Listed_are(option1);
		CoveragePage.validates_under_DII_the_Benefit_Option_Listed_are(option2);
		CoveragePage.validates_under_DII_the_Benefit_Option_Listed_are(option3);
		CoveragePage.validates_under_DII_the_Benefit_Option_Listed_are(option4);
	}

	@Then("^Validates Benefit Amount for Spouse as \"([^\"]*)\" under HII$")
	public void validates_Benefit_Amount_for_Spouse_as_under_HII(String amount1) throws Throwable {
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Spouse_Listed_are(amount1);
	}

	@Then("^Validates Benefit Amount for Child as \"([^\"]*)\" under HII$")
	public void validates_Benefit_Amount_for_Child_as_under_HII(String amount1) throws Throwable {
		CoveragePage.validates_under_HII_the_Benefit_Amounts_for_Child_Listed_are(amount1);
	}

	@Then("^Validates Benefit Amount for Child as \"([^\"]*)\" under FifteenYTL$")
	public void validates_Benefit_Amount_for_Child_as_under_FifteenYTL(String amount1) throws Throwable {
		CoveragePage.validates_under_FifteenYTL_the_Benefit_Amounts_for_Child_Listed_are(amount1);
	}

	@Then("^Validates under the Benefit Amounts for child Listed are: \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validates_under_the_Benefit_Amounts_for_child_Listed_are(String amount1, String amount2, String amount3,
			String amount4, String amount5, String amount6, String amount7, String amount8, String amount9,
			String amount10, String amount11) throws Throwable {

		CoveragePage.validates_under_the_Benefit_Amounts_for_child_Listed_are(amount1, amount2, amount3, amount4,
				amount5, amount6, amount7, amount8, amount9, amount10, amount11);
	}

	@Then("^Validates\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" are not displayed in eligible children$")
	public void validates_are_not_displayed_in_eligible_children(String child1, String child2, String child3)
			throws Throwable {
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_TenYTL(child1);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_TenYTL(child2);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_TenYTL(child3);
	}
	
	@Then("^Validates\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" are displayed as eligible children under GTenYTL$")
	public void validates_are_displayed_in_eligible_children(String child1, String child2, String child3)
			throws Throwable {
		CoveragePage.validates_and_are_displayed_in_eligible_children_TenYTL(child1);
		CoveragePage.validates_and_are_displayed_in_eligible_children_TenYTL(child2);
		CoveragePage.validates_and_are_displayed_in_eligible_children_TenYTL(child3);
	}

	@Then("^Validates \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" are not displayed in eligible children under TenYTL$")
	public void validates_and_are_not_displayed_in_eligible_children_under_TenYTL(String child1, String child2,
			String child3, String child4) throws Throwable {
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_TenYTL(child1);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_TenYTL(child2);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_TenYTL(child3);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_TenYTL(child4);
	}
	
	@Then("^Validates \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" are not displayed in eligible children under TenPGTL$")
	public void validates_and_are_not_displayed_in_eligible_children_under_TenYTL(String child1, String child2,
			String child3, String child4, String child5) throws Throwable {
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_TenYTL(child1);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_TenYTL(child2);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_TenYTL(child3);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_TenYTL(child4);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_TenYTL(child5);
	}
	
	@Then("^Validates \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" are not displayed in eligible children under GTenYTL$")
	public void validates_and_are_not_displayed_in_eligible_children_under_GTenYTL(String child1, String child2,
			String child3, String child4) throws Throwable {
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_TenYTL(child1);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_TenYTL(child2);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_TenYTL(child3);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_TenYTL(child4);
	}
	
	@Then("^Validates \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" are not displayed in eligible children under GTwentyYTL$")
	public void validates_and_are_not_displayed_in_eligible_children_under_GTwentyYTL(String child1, String child2,
			String child3, String child4) throws Throwable {
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_GTwentyYTL(child1);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_GTwentyYTL(child2);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_GTwentyYTL(child3);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_GTwentyYTL(child4);
	}
	
	@Then("^Validates \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" are not displayed in eligible children under GTTLI$")
	public void validates_and_are_not_displayed_in_eligible_children_GTTLI(String child1, String child2,
			String child3, String child4) throws Throwable {
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_GTTLI(child1);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_GTTLI(child2);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_GTTLI(child3);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_GTTLI(child4);
	}
	
	@Then("^Validates \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" are not displayed in eligible children under HLDD$")
	public void validates_and_are_not_displayed_in_eligible_children_under_HLDD(String child1, String child2,
			String child3) throws Throwable {
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_HLDD(child1);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_HLDD(child2);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_HLDD(child3);
	}

	@Then("^Validates \"([^\"]*)\",\"([^\"]*)\" are not displayed in eligible children under HII$")
	public void validates_are_not_displayed_in_eligible_children_under_HII(String child1, String child2)
			throws Throwable {
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_HII(child1);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_HII(child2);
	}


	@Then("^Validates eligible children Names displayed as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" under GroupTermLife$")
	public void validates_eligible_children_Names_displayed_as_under_GroupTermLife(String ChildName1, String ChildName2, String ChildName3, String ChildName4) throws Throwable {
	    CoveragePage.validates_eligible_children_Names_displayed_as_under_GroupTermLife(ChildName1);
	    CoveragePage.validates_eligible_children_Names_displayed_as_under_GroupTermLife(ChildName2);
	    CoveragePage.validates_eligible_children_Names_displayed_as_under_GroupTermLife(ChildName3);
	    CoveragePage.validates_eligible_children_Names_displayed_as_under_GroupTermLife(ChildName4);
	}

	
	@Then("^Validates \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\" are available for Eligible Child\\(ren\\) under Group Term LI$")
	public void validates_are_available_for_Eligible_Child_ren_under_Group_Term_LI(String ChildName1, String ChildName2, String ChildName3, String ChildName4, String ChildName5) throws Throwable {
		CoveragePage.validates_eligible_children_Names_displayed_as_under_GroupTermLife(ChildName1);
	    CoveragePage.validates_eligible_children_Names_displayed_as_under_GroupTermLife(ChildName2);
	    CoveragePage.validates_eligible_children_Names_displayed_as_under_GroupTermLife(ChildName3);
	    CoveragePage.validates_eligible_children_Names_displayed_as_under_GroupTermLife(ChildName4);
	    CoveragePage.validates_eligible_children_Names_displayed_as_under_GroupTermLife(ChildName4);
	}
	
	@Then("^Validates \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" are not displayed for Eligible Child\\(ren\\) under eligible child Group Term LI$")
	public void validates_are_not_displayed_for_Eligible_Child_ren_under_eligible_child_Group_Term_LI(String ChildName1, String ChildName2, String ChildName3) throws Throwable {
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_GroupTermLife(ChildName1);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_GroupTermLife(ChildName2);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_GroupTermLife(ChildName3);
	}

	
	@Then("^Validates eligible children Names displayed as \"([^\"]*)\" under TermLife$")
	public void validates_eligible_children_Names_displayed_as_under_TermLife(String ChildName1) throws Throwable {
	    CoveragePage.validates_eligible_children_Names_displayed_as_under_GroupTermLife(ChildName1);    
	}


	@Then("^Validates \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" are not displayed in eligible children under HII$")
	public void validates_are_not_displayed_in_eligible_children_under_HII(String child1, String child2,String child3)
			throws Throwable {
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_HII(child1);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_HII(child2);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_HII(child3);
	}


	@Then("^Validates \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" are displayed as eligible children under GTLI$")
	public void validates_and_are_displayed_in_eligible_children_under_GTLI(String child1, String child2,
			String child3) throws Throwable {
		CoveragePage.validates_are_displayed_in_eligible_children_GTLI(child1);
		CoveragePage.validates_are_displayed_in_eligible_children_GTLI(child2);
		CoveragePage.validates_are_displayed_in_eligible_children_GTLI(child3);
		
	}
	

	@Then("^Validates Benefit amount for child as \"([^\"]*)\" under GTLI$")
	public void validates_Benefit_Amount_for_Child_from_dropdown_as_under_GTLI(String amount) throws Throwable {
		CoveragePage.validate_Benefit_Amount_for_Child_from_dropdown_as_under_GTLI(amount);
		
	}
	
	@Then("^Validates \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" are displayed as eligible children under GHII$")
	public void validates_are_displayed_in_eligible_children_under_HII(String child1, String child2,String child3,String child4)
			throws Throwable {
		CoveragePage.validates_and_are_displayed_in_eligible_children_HII(child1);
		CoveragePage.validates_and_are_displayed_in_eligible_children_HII(child2);
		CoveragePage.validates_and_are_displayed_in_eligible_children_HII(child3);
		CoveragePage.validates_and_are_displayed_in_eligible_children_HII(child4);
	}
	
	@Then("^Validates \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" are displayed as eligible children under InHospitalInsurance$")
	public void validates_are_displayed_in_eligible_children_under_IHI(String child1, String child2,String child3,String child4)
			throws Throwable {
		CoveragePage.validates_and_are_displayed_in_eligible_children_HII(child1);
		CoveragePage.validates_and_are_displayed_in_eligible_children_HII(child2);
		CoveragePage.validates_and_are_displayed_in_eligible_children_HII(child3);
		CoveragePage.validates_and_are_displayed_in_eligible_children_HII(child4);
	}
	

	@Then("^Validates eligible children Names displayed as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" under TenYTL$")
	public void validates_eligible_children_Names_displayed_as_under_TenYTL(String ChildName1, String ChildName2, String ChildName3, String ChildName4) throws Throwable {
	    CoveragePage.validates_eligible_children_Names_displayed_as_under_TenYTL(ChildName1);
	    CoveragePage.validates_eligible_children_Names_displayed_as_under_TenYTL(ChildName2);
	    CoveragePage.validates_eligible_children_Names_displayed_as_under_TenYTL(ChildName3);
	    CoveragePage.validates_eligible_children_Names_displayed_as_under_TenYTL(ChildName4);
	}
	
	@Then("^Validates eligible children Names displayed as \"([^\"]*)\" under TenYTL$")
	public void validates_eligible_children_Names_displayed_as_under_TenYTL(String ChildName1) throws Throwable {
	    CoveragePage.validates_eligible_children_Names_displayed_as_under_TenYTL(ChildName1);    
	}
	
	

	@Then("^Validates eligible children Names are not displayed as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" under ADnD$")
	public void validates_eligible_children_Names_are_not_displayed_as_under_ADnD(String ChildName1, String ChildName2, String ChildName3, String ChildName4, String ChildName5) throws Throwable {
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_HLDD(ChildName1);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_HLDD(ChildName2);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_HLDD(ChildName3);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_HLDD(ChildName4);
		CoveragePage.validates_and_are_not_displayed_in_eligible_children_HLDD(ChildName5);
	}
	


	@Then("^Verify Error Message in Spouse section$")
	public void verify_Error_Message_in_Spouse_section() throws Throwable {
		CoveragePage.verify_Coverage_Error_Message_in_Spouse_section_FiveYear();
	}

	@Then("^Verify Error Message in Spouse section for TermLife$")
	public void verify_Error_Message_in_Spouse_section_TermLife() throws Throwable {
		CoveragePage.verify_Coverage_Error_Message_in_Spouse_section_TermLife();
	}

	@Then("^Verify Error Message in Spouse section for TwentyYrLI$")
	public void verify_Error_Message_in_Spouse_section_TwentyYrLI() throws Throwable {
		CoveragePage.verify_Coverage_Error_Message_in_Spouse_section_TwentyYrLI();
	}
	
	@Then("^Validate Error Message Spouse benefit amount cannot exceed member benefit amount under Group 20Yr LTLI for spouse$")
	public void verify_Error_Message_in_Spouse_section_GTwentyYrLI() throws Throwable {
		CoveragePage.verify_Coverage_Error_Message_in_Spouse_section_GTwentyYrLI();
	}
	
	@Then("^Validate Error Message Spouse benefit amount cannot exceed member benefit amount under Group 10Yr LTLI for spouse$")
	public void verify_Error_Message_in_Spouse_section_GTenYrLI() throws Throwable {
		CoveragePage.verify_Coverage_Error_Message_in_Spouse_section_GTenYrLI();
	}
	
	@Then("^Validate Error Message Spouse benefit amount cannot exceed member benefit amount under CI for spouse$")
	public void verify_Error_Message_in_Spouse_section_CI() throws Throwable {
		CoveragePage.verify_Coverage_Error_Message_in_Spouse_section_CI();
	}

	@Then("^Validate Exceed Member Benefit Amount Coverage Error Messege for Spouse under TGTLI$")
	public void validate_Exceed_Member_Error_Messege_Benefit_Amount_for_Spouse_under_TGTLI() throws Throwable {
		CoveragePage.verify_Coverage_Error_Message_in_Spouse_section_TermLife();
	}
	
	@Then("^Validate Error Message Spouse benefit amount cannot exceed member benefit amount under Group Traditional TLI for spouse$")
	public void validate_Exceed_Member_Error_Messege_Benefit_Amount_for_Spouse_under_GTTLI() throws Throwable {
		CoveragePage.verify_Coverage_Error_Message_in_Spouse_section_TermLife();
	}

	// AAFP
	
	@Then("^Verify Error Message in Spouse section for TenYTL$")
	public void verify_Spouse_amount_validation_on_Coverage_Page_for_TenYTL() throws Throwable {
		CoveragePage.verify_Coverage_Error_Message_in_Spouse_section_for_TenYTL();
	}
	@Then("^Verify Error Message in Spouse section for AOD$")
	public void verify_Spouse_amount_validation_on_Coverage_Page_for_AOD() throws Throwable {
		CoveragePage.verify_Coverage_Error_Message_in_Spouse_section_for_AOD() ;
	}
	@Then("^Verify Spouse Membership mandatory validation message on Eligibility page$")
	public void verify_Spouse_Membership_mandatory_validation_message_on_Eligibility_page() throws Throwable {
		CoveragePage.verify_Spouse_Membership_mandatory_validation_message_on_Eligibility_page();
	}

	@Then("^Select \"([^\"]*)\" for Rider Only question for self$")
	public void Select_for_Rider_Only_question_for_self(String riderOnly) throws Throwable {
		CoveragePage.Select_for_Rider_Only_question_for_self(riderOnly);
	}

	@Then("^Select \"([^\"]*)\" to Rider only question for spouse$")
	public void select_to_Rider_only_question_for_spouse(String sRiderOnly) throws Throwable {
		CoveragePage.select_to_Rider_only_question_for_spouse(sRiderOnly);
	}

	// WAEPA for OptionalRider
	@Then("^Select \"([^\"]*)\" to Optional Rider question for Self$")
	public void select_to_Optional_Rider_question_for_Self(String OptionalRider) throws Throwable {
		CoveragePage.select_to_Optional_Rider_question_for_Self(OptionalRider);

	}

	@Then("^Select \"([^\"]*)\" to Optional Rider question for Spouse$")
	public void select_to_Optional_Rider_question_for_Spouse(String sOptionalRider) throws Throwable {
		CoveragePage.select_to_Optional_Rider_question_for_Spouse(sOptionalRider);
	}

	@Then("^Validates under DII the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_DII_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_DII_the_Benefit_Slider_Range_as_to(Min, Max);
	}
	
	//NSPE
	@Then("^Validates under DisabilityIncomeInsurance the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_DisabilityIncomeInsurance_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_DisabilityIncomeInsurance_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Verify that the Optional rider is disabled for Spouse$")
	public void verify_that_the_Optional_rider_is_disabled_for_Spouse() throws Throwable {
		CoveragePage.verify_that_the_Optional_rider_is_disabled_for_Spouse();
	}

	@Then("^Verify that the optional rider is enabled for Spouse$")
	public void verify_that_the_optional_rider_is_enabled_for_Spouse() throws Throwable {
		CoveragePage.verify_that_the_optional_rider_is_enabled_for_Spouse();
	}

	@Then("^Validates Benefit Slider Range for AD&D rider under ARTL for Spouse as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_AD_D_under_ARTL_for_Spouse_the_Benefit_Slider_Range_as_to(String SMin, String SMax)
			throws Throwable {
		CoveragePage.validates_under_TermLife_the_Benefit_Slider_Range_for_ADDRider_as_to_for_Spouse(SMin, SMax);
	}

	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" for AD&D under ARTL$")
	public void selects_Benefit_Amount_for_Spouse_as_under_AD_D_under_ARTL(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_for_ADDRider_under_ARTL(sBenefit);
	}

	@Then("^Selects Benefit Amount for Child as \"([^\"]*)\" under ARTL$")
	public void selects_Benefit_Amount_for_Child_as_under_ARTL(String CBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Child_as_under_TermLife_or_ARTL(CBenefit);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self for GTDLI$")
	public void selects_Type_of_Coverage_as_for_Self_for_GTDLI(String TypeofCove_ten) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_self_GTDLI(TypeofCove_ten);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Spouse under GTDLI$")
	public void selects_Type_of_Coverage_as_for_Spouse_for_GTDLI(String TypeofCove_ten) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_spouse_GTDLI(TypeofCove_ten);
	}

	@Then("^Validates under GTDLI the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for self$")
	public void validates_under_GTDLI_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_TenYTL_the_Benefit_Slider_Range_as_to_Self(Min, Max);
	}

	@Then("^Selects Optional AD&D Rider for Self for GTDLI$")
	public void selects_Optional_AD_D_Rider_Self_under_GeneralTermDealerLifeInsurance() throws Throwable {
		CoveragePage.selects_Optional_AD_D_Rider_Self_under_GeneralTermDealerLifeInsurance();
	}
	
	@Then("^Selects Optional Rider as AD for Self under GTLP75I$")
	public void selects_Optional_AD_D_Rider_Self_under_GTLP75I() throws Throwable {
		CoveragePage.selects_Optional_Rider_Self_under_GTLP75I();
	}
	
	@Then("^Selects Optional Rider as AD for Spouse under GTLP75I$")
	public void selects_Optional_AD_D_Rider_Spouse_under_GTLP75I() throws Throwable {
		CoveragePage.selects_Optional_Rider_Spouse_under_GTLP75I();
	}
	
	@Then("^Selects Optional Rider as WOP for Self under GTLP75I$")
	public void selects_Optional_Rider_Wavier_Premium_Self_under_GTLP75I() throws Throwable {
		CoveragePage.selects_Optional_Rider_Wavier_Premium_Self_under_GTLP75I();
	}
	
	@Then("^Selects Optional Rider as AD for Self under Flex10$")
	public void selects_Optional_AD_D_Rider_Self_under_Flex10() throws Throwable {
		CoveragePage.selects_Optional_Rider_Self_under_Flex10();
	}
	
	@Then("^Selects Optional Rider as AD for Spouse under Flex10$")
	public void selects_Optional_AD_D_Rider_Spouse_under_Flex10() throws Throwable {
		CoveragePage.selects_Optional_Rider_Spouse_under_Flex10();
	}
	
	@Then("^Selects Optional Rider as WOP for Self under Flex10$")
	public void selects_Optional_Rider_Wavier_Premium_Self_under_Flex10() throws Throwable {
		CoveragePage.selects_Optional_Rider_Wavier_Premium_Self_under_Flex10();
	}
	
	@Then("^Selects Optional Rider as AD for Self under Flex20$")
	public void selects_Optional_AD_D_Rider_Self_under_Flex20() throws Throwable {
		CoveragePage.selects_Optional_Rider_Self_under_Flex20();
	}
	
	@Then("^Selects Optional Rider as AD for Spouse under Flex20$")
	public void selects_Optional_AD_D_Rider_Spouse_under_Flex20() throws Throwable {
		CoveragePage.selects_Optional_Rider_Spouse_under_Flex20();
	}
	
	@Then("^Selects Optional Rider as WOP for Self under Flex20$")
	public void selects_Optional_Rider_Wavier_Premium_Self_under_Flex20() throws Throwable {
		CoveragePage.selects_Optional_Rider_Wavier_Premium_Self_under_Flex20();
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under GTDLI$")
	public void selects_Benefit_Amount_for_Self_as_under_GTDLI(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_GTDLI(sBenefit);
	}

	@Then("Selects Optional AD&D Rider Benefit Amount as \"([^\"]*)\" for Self for GTDLI$")
	public void selects_optional_AD_D_Rider_Benefit_Amount_Self_for_GTDLI(String amount) throws Throwable {
		CoveragePage.selects_optional_AD_D_Rider_Benefit_Amount_Self_for_GTDLI(amount);
	}

	@Then("^Selects Benefit Amount for Child as \"([^\"]*)\" under GTDLI$")
	public void selects_Benefit_Amount_for_Child_as_under_GTDLI(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Child_as_under_GTDLI(sBenefit);
	}

	@Then("^Selects Optional AD&D Rider for Child for GTDLI$")
	public void selects_Optional_AD_D_Rider_Child_under_GeneralTermDealerLifeInsurance() throws Throwable {
		CoveragePage.selects_Optional_AD_D_Rider_Child_under_GeneralTermDealerLifeInsurance();
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Spouse under ELI$")
	public void selects_type_of_Coverage_as_for_Spouse_under_ELI(String TypeofCove) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_spouse_ELI(TypeofCove);
	}

	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under GTDLI$")
	public void selects_Benefit_Amount_for_Spouse_as_under_GTDLI(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_GTDLI(sBenefit);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under GTLI using multiplying factor of base salary$")
	public void selects_Benefit_Amt_Base_Salary_for_Self_under_GTLI(String Amt) throws Throwable {
		CoveragePage.selects_multiply_base_Salary_self_GTLI(Amt);
	}

	@Then("^Selects Optional AD&D Rider for Self for GTLI$")
	public void selects_Optional_AD_D_Rider_Self_under_TraditionalGroupTermLifeInsurance() throws Throwable {
		CoveragePage.selects_Optional_AD_D_Rider_Self_under_TraditionalGroupTermLifeInsurance();
	}

	@Then("^Selects Optional AD&D Rider Benefit Amount for Self as \"([^\"]*)\" under GTLI using multiplying factor of base salary$")
	public void selects_Optional_AD_D_Rider_Benefit_Amt_Base_Salary_for_Self_under_GTLI(String Amt) throws Throwable {
		CoveragePage.selects_optional_AD_D_Rider_multiply_base_Salary_self_GTLI(Amt);
	}

	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under GTLI$")
	public void selects_Benefit_Amount_for_Spouse_as_under_GTLI(String BenefirAmt) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_GTLI(BenefirAmt);
	}
	
	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under GTTLI$")
	public void selects_Benefit_Amount_for_Spouse_as_under_GTTLI(String BenefirAmt) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_GTLI(BenefirAmt);
	}
	
	@Then("^Verify Spouse cannot exceed Member Error Message under GTLI$")
	public void verify_Spouse_cannot_exceed_Member_Error_Message_under_GTLI() throws Throwable {
		CoveragePage.verify_Spouse_cannot_exceed_Member_Error_Message_under_GTLI();
	}

	@Then("^Selects Optional AD&D Rider for Spouse for GTLI$")
	public void selects_Optional_AD_D_Rider_Spouse_under_TraditionalGroupTermLifeInsurance() throws Throwable {
		CoveragePage.selects_Optional_AD_D_Rider_Spouse_under_TraditionalGroupTermLifeInsurance();
	}

	@Then("^Select Optional AD&D Rider Benefit Amount as \"([^\"]*)\" for Spouse under GTLI$")
	public void selects_Optional_AD_D_Rider_Benefit_Amt__for_Spouse_under_GTLI(String Amt) throws Throwable {
		CoveragePage.selects_Optional_ADD_Benefit_Amount_for_Spouse_as_under_GTLI(Amt);
	}

	@Then("^Selects Benefit Amount for Child as \"([^\"]*)\" under GTLI$")
	public void selects_Benefit_Amount_for_Child_as_under_GTLI(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Child_as_under_GTLI(sBenefit);
	}
	
	@Then("^Selects Benefit Amount for Child as \"([^\"]*)\" under GTTLI$")
	public void selects_Benefit_Amount_for_Child_as_under_GTTLI(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Child_as_under_GTLI(sBenefit);
	}

	@Then("^Selects Optional AD&D Rider for Child for GTLI$")
	public void selects_Optional_AD_D_Rider_Child_under_GeneralTermLifeInsurance() throws Throwable {
		CoveragePage.selects_Optional_AD_D_Rider_Child_under_GeneralTermLifeInsurance();
	}

	@Then("^Verify Error Message is displayed for Spouse exceeding the member benefit amount under GTLI$")
	public void verify_Coverage_Error_Message_in_Spouse_section_GTLI() throws Throwable {
		CoveragePage.verify_Coverage_Error_Message_in_Spouse_section_GTLI();
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under GDII$")
	public void selects_Type_of_Coverage_as_for_Self_for_GDII(String TypeofCove) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_self_GDII(TypeofCove);
	}
	@Then("^Request Coverage - Health Questions page is displayed to user$")
	public void request_Coverage_Health_Questions_page_is_displayed_to_user() throws Throwable {
		CoveragePage.Request_coverage_Health_Question_page_is_displayed_to_user();
	}
	
	@Then("^Validates that Request Coverage - Health Questions page is Not displayed to user$")
	public void validates_that_Request_Coverage_Health_Questions_page_is_Not_displayed_to_user() throws Throwable {
		CoveragePage.validates_that_Request_Coverage_Health_Questions_page_is_Not_displayed_to_user();
	}

	@Then("^Verify that Health Questions are rendered for Self$")
	public void verify_that_Health_Questions_are_rendered_for_Self() throws Throwable {
		CoveragePage.verify_that_Health_Questions_are_rendered_for_Self();
	}

	@Then("^Verify that Health Questions are not rendered for Self$")
	public void verify_that_Health_Questions_are_not_rendered_for_Self() throws Throwable {
		CoveragePage.verify_that_Health_Questions_are_not_rendered_for_Self();
	}

	@Then("^Verify that Health Questions are rendered for Spouse$")
	public void verify_that_Health_Questions_are_rendered_for_Spouse() throws Throwable {
		CoveragePage.verify_that_Health_Questions_are_rendered_for_Spouse();
	}

	@Then("^Verify that Health Questions are not rendered for Spouse$")
	public void verify_that_Health_Questions_are_not_rendered_for_Spouse() throws Throwable {
		CoveragePage.verify_that_Health_Questions_are_not_rendered_for_Spouse();
	}

	@Then("^Request Coverage - Health Questions page is displayed to user and selects Answer as YES for all questions for Self$")
	public void Request_Coverage_Health_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_Yes_for_all_questions_for_Self()
			throws Throwable {
		CoveragePage.Request_Coverage_Health_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_Yes_for_all_questions_for_Self();
	}

	@Then("^Request Coverage - Health Questions page is displayed to user and selects Answer as YES for all questions for Spouse$")
	public void Request_Coverage_Health_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_Yes_for_all_questions_for_Spouse()
			throws Throwable {
		CoveragePage.Request_Coverage_Health_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_Yes_for_all_questions_for_Spouse();
	}

	@Then("^Clicks on Add Details Button of First question for Self$")
	public void clicks_Add_Details_FirstQuestion_Self() throws Throwable {
		CoveragePage.clicks_Add_Details_FirstQuestion_Self();
	}
	
	@Then("^Clicks on Add Details for Prescribed Medication$")
	public void clicks_on_Add_Details_for_Prescribed_Medication() throws Throwable {
		CoveragePage.clicks_Add_Details_FirstQuestion_Self();
	}

	@Then("^Explanation Screen is displayed to User and Enters details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void Explanation_page_displayed_And_User_Enters_Details(String MOnSet, String YrOnset, String Condition,
			String physician) throws Throwable {
		CoveragePage.verify_explanation_page_displayed_And_User_Enters_Details(MOnSet, YrOnset, Condition, physician);
	}

	@Then("^Clicks on Add Button$")
	public void click_on_Add_Button() throws Throwable {
		CoveragePage.click_on_Add_Button();
	}

	@Then("^Clicks on Add Details Button of Second question for Self$")
	public void clicks_Add_Details_SecondQuestion_Self() throws Throwable {
		CoveragePage.clicks_Add_Details_SecondQuestion_Self();
	}

	@Then("^Clicks on Add Details for Physically diagnosed$")
	public void clicks_on_Add_Details_for_Physically_diagnosed() throws Throwable {
		CoveragePage.clicks_Add_Details_SecondQuestion_Self();
	}
	
	@Then("^Clicks on Add Details Button of Third question for Self$")
	public void clicks_Add_Details_ThirdQuestion_Self() throws Throwable {
		CoveragePage.clicks_Add_Details_ThirdQuestion_Self();
	}

	@Then("^Clicks on Add Details for Alcohol Drugs$")
	public void clicks_on_Add_Details_for_Alcohol_Drugs() throws Throwable {
		CoveragePage.clicks_Add_Details_ThirdQuestion_Self();
	}
	
	@Then("^Clicks on Add Details Button of Fourth question for Self$")
	public void clicks_Add_Details_FourthQuestion_Self() throws Throwable {
		CoveragePage.clicks_Add_Details_FourthQuestion_Self();
	}

	@Then("^Clicks on Add Details Button of Fifth question for Self$")
	public void clicks_Add_Details_FifthQuestion_Self() throws Throwable {
		CoveragePage.clicks_Add_Details_FifthQuestion_Self();
	}

	@Then("^Clicks on Add Details Button of First question for Spouse$")
	public void clicks_Add_Details_FirstQuestion_Spouse() throws Throwable {
		CoveragePage.clicks_Add_Details_FirstQuestion_Spouse();
	}

	@Then("^Clicks on Add Details Button of Second question for Spouse$")
	public void clicks_Add_Details_SecondQuestion_Spouse() throws Throwable {
		CoveragePage.clicks_Add_Details_SecondQuestion_Spouse();
	}

	@Then("^Clicks on Add Details Button of Third question for Spouse$")
	public void clicks_Add_Details_ThirdQuestion_Spouse() throws Throwable {
		CoveragePage.clicks_Add_Details_ThirdQuestion_Spouse();
	}

	@Then("^Clicks on Add Details Button of Fourth question for Spouse$")
	public void clicks_Add_Details_FourthQuestion_Spouse() throws Throwable {
		CoveragePage.clicks_Add_Details_FourthQuestion_Spouse();
	}

	@Then("^Clicks on Add Details Button of Fifth question for Spouse$")
	public void clicks_Add_Details_FifthQuestion_Spouse() throws Throwable {
		CoveragePage.clicks_Add_Details_FifthQuestion_Spouse();
	}

	@Then("^Request Coverage - Health Questions page is displayed to user and selects Answer as NO for all questions for Self$")
	public void Request_Coverage_Health_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_No_for_all_questions_for_Self()
			throws Throwable {
		CoveragePage
				.Request_Coverage_Health_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_No_for_all_questions_for_Self();
	}

	
	@Then("^Request Coverage - selects No for all Medical history questions$")
	public void request_Coverage_selects_No_for_all_Medical_history_questions() throws Throwable {
		CoveragePage
		.Request_Coverage_Health_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_No_for_all_questions_for_Self_wihtout_Cooking_family();
	}
	
	
	@Then("^Verify the benefit amount for Self under GTLI is in Multiplier: 1x, 2x, 3x, 4x, 5x, 6x of Base Salary$")
	public void validate_Multiplier_Benefit_Amount_Self_GTLI() throws Throwable {
		CoveragePage.validate_Multiplier_Benefit_Amount_Self_GTLI();
	}

	@Then("^Verify the benefit amount of rider for Self under GTLI is in Multiplier: 1x, 2x, 3x, 4x, 5x of Base Salary$")
	public void validate_Multiplier_Rider_Benefit_Amount_Self_GTLI() throws Throwable {
		CoveragePage.validate_Multiplier_Rider_Benefit_Amount_Self_GTLI();
	}

	@Then("^Request Coverage - Health Questions page is displayed to user and selects Answer as NO for all questions for Spouse$")
	public void Request_Coverage_Health_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_No_for_all_questions_for_Spouse()
			throws Throwable {
		CoveragePage
				.Request_Coverage_Health_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_No_for_all_questions_for_Spouse();
	}

	@Then("^Validates under GTLI the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Spouse$")
	public void validates_under_GTLI_the_Benefit_Slider_Range_as_to_Spouse(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_GTLI_the_Benefit_Slider_Range_as_to_Spouse(Min, Max);
	}
	
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under GADD$")
	public void selects_Type_of_Coverage_as_for_Self_under_GADD(String TypeofCov_GADD) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_self_GADD(TypeofCov_GADD);
	}
	
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under HLAI$")
	public void selects_Type_of_Coverage_as_for_Self_under_HLAI(String TypeofCov_GADD) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_self_GADD(TypeofCov_GADD);
	}
	
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self and Spouse under FirstToDie$")
	public void selects_Type_of_Coverage_as_for_Self_under_FirstToDie(String TypeofCov_FirstToDie) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_self_FirstToDie(TypeofCov_FirstToDie);
	}
	
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under GADD$")
	public void selects_Self_benefit_amount_of_for_Group_Accidental_Death_and_Dismemberment_as(String bAmount) throws Throwable{
		CoveragePage.selects_Self_benefit_amount_of_for_Group_Accidental_Death_and_Dismemberment_as(bAmount);
	}
	
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under HLAI$")
	public void selects_Self_benefit_amount_of_for_HLAI_as(String bAmount) throws Throwable{
		CoveragePage.selects_Self_benefit_amount_of_for_Group_Accidental_Death_and_Dismemberment_as(bAmount);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under FirstToDie$")
	public void selects_Self_benefit_amount_of_for_FirstToDie_as(String Benefit) throws Throwable{
		CoveragePage.selects_Self_benefit_amount_for_FirstToDie_as(Benefit);
	}
	
	
	@Then("^Validates under GADD the Benefit Slider Range for Self as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_GADD_the_Benefit_Slider_Range_for_Self_as_to(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_GADD_the_Benefit_Slider_Range_for_Self_as_to(Min, Max);
	}
	
	@Then("^Validates under HLAI the Benefit Slider Range for Self as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_HLAI_the_Benefit_Slider_Range_for_Self_as_to(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_GADD_the_Benefit_Slider_Range_for_Self_as_to(Min, Max);
	}
	
	@Then("^Validates under HLAI the Benefit Slider Range for Spouse as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_HLAI_the_Benefit_Slider_Range_for_Spouse_as_to(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_HLAI_the_Benefit_Slider_Range_for_Spouse_as_to(Min, Max);
	}
	
	
	@Then("^Validates under FirstToDie the Benefit Slider Range for Self as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_FirstToDie_the_Benefit_Slider_Range_for_Self_as_to(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_FirstToDie_the_Benefit_Slider_Range_for_Self_as_to(Min, Max);
	}
	
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Spouse under GADD$")
	public void selects_Type_of_Coverage_as_for_Spouse_under_GADD(String TypeofCov_GADD) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_spouse_GADD(TypeofCov_GADD);
	}
	
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Spouse under HLAI$")
	public void selects_Type_of_Coverage_as_for_Spouse_under_HLAI(String TypeofCov_GADD) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_spouse_GADD(TypeofCov_GADD);
	}
	
	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under GADD$")
	public void selects_Benefit_Amount_Spouse_GADD(String amount) throws Throwable{
		CoveragePage.selects_Benefit_Amount_Spouse_GADD(amount);
	}
	
	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under HLAI$")
	public void selects_Benefit_Amount_for_Spouse_as_under_HLAI(String amount) throws Throwable{
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_HLAI(amount);
	}
	
	@Then("^Validates Benefit Amount for Child as \"([^\"]*)\" under HLAI displayed in label$")
	public void validates_Benefit_Amount_for_Child_as_under_HLAI_displayed_in_label(String Benefit) throws Throwable {
		CoveragePage.validates_Benefit_Amount_for_Child_as_under_HLAI_displayed_in_label(Benefit);
	}
	
	
	@Then("^Validates under GADD the Benefit Amount listed for Spouse are: \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validates_under_GADD_the_Benefit_Option_Listed_Spouse_are(String option1, String option2, String option3) throws Throwable {
		CoveragePage.validates_under_GADD_the_Benefit_Option_Listed_Spouse_are(option1);
		CoveragePage.validates_under_GADD_the_Benefit_Option_Listed_Spouse_are(option2);
		CoveragePage.validates_under_GADD_the_Benefit_Option_Listed_Spouse_are(option3);
	}
	
	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under GDI$")
	public void selects_Type_of_Coverage_as_for_Self_under_GDI(String coverage) throws Throwable{
		CoveragePage.selects_Type_of_Coverage_as_for_Self_under_GDI(coverage);
	}
	
	@Then("^Validates under GDI the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for self$")
	public void validates_under_GDI_the_Benefit_Slider_Range_as_to_for_self(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_GDI_the_Benefit_Slider_Range_for_Self(Min, Max);
	}
	
	@Then("^Selects Partial Disability Benefit Rider for self under GDI$")
	public void selects_Partial_Disability_Benefit_Self_under_GDI() throws Throwable{
		CoveragePage.selects_Partial_Disability_Benefit_Self_under_GDI();
	}
	
	//AOA
	
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under GroupTermLife$")
	public void selects_Benefit_Amount_for_Self_as_under_GroupTermLife(String Benefit) throws Throwable {
		CoveragePage.select_Benefit_Amount_for_FiveYTL_Insurance_Product_Self_as(Benefit);
	}

	@Then("^Verify under Group Term LI the Benefit Amount for Child as \"([^\"]*)\"$")
	public void verify_under_Group_Term_LI_the_Benefit_Amount_for_Child_as(String Benefit) throws Throwable {
		CoveragePage.Validate_benefit_amount_for_GroupTermLife_Child(Benefit);
	}
	
	@Then("^Validates under GroupTermLife the Benefit Slider Range for Self as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_GroupTermLife_the_Benefit_Slider_Range_for_Self_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_FiveYTL_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under GroupTermLife$")
	public void selects_Benefit_Amount_for_Spouse_as_under_GroupTermLife(String Sbenefit) throws Throwable {
		CoveragePage.selects_Benefit_amount_for_Five_Year_Product_Spouse_as(Sbenefit);
	}

	@Then("^Verify that Spouse Benefit Message is displayed$")
	public void verify_that_Spouse_Benefit_Message_is_displayed() throws Throwable {
		CoveragePage.verify_that_Spouse_Benefit_Message_is_displayed();
	}

	@Then("^Validates under GroupTermLife the Benefit Slider Range for Spouse as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_GroupTermLife_the_Benefit_Slider_Range_for_Spouse_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_FiveYTL_for_Spouse_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Selects Benefit Amount for Child as \"([^\"]*)\" under GroupTermLife$")
	public void selects_Benefit_Amount_for_Child_as_under_GroupTermLife(String Cbenefit) throws Throwable {
		CoveragePage.selects_benefit_amount_for_FiveYTL_Child_as(Cbenefit);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under GLTDI$")
	public void selects_Benefit_Amount_for_Self_as_under_GLTDI(String Benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_GLTDI(Benefit);
	}

	@Then("^Validates under GLTDI the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_GLTDI_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_GLTDI_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Selects Wait Period for Self as \"([^\"]*)\" under GLTDI$")
	public void selects_Wait_Period_for_Self_as_under_GLTDI(String period) throws Throwable {
		CoveragePage.selects_Wait_Period_for_Self_as_under_GLTDI(period);
	}

	@Then("^Selects Benefit duration for Self as \"([^\"]*)\" under GLTDI$")
	public void selects_Benefit_duration_for_Self_as_under_GLTDI(String duration) throws Throwable {
		CoveragePage.selects_Benefit_duration_for_Self_as_under_GLTDI(duration);
	}

	
	@Then("^Validates Benefit Duration Dropdown for Self value under GTLDI as \"([^\"]*)\"$")
	public void validates_Benefit_Duration_Dropdown_for_Self_value_under_GTLDI_as(String amount) throws Throwable {
		CoveragePage.validates_Benefit_Duration_Dropdown_for_Self_value_under_GTLDI_as(amount);
	}

	@Then("^Validates Benefit Amount for Self under GTLDI is displayed as \"([^\"]*)\"$")
	public void validates_Benefit_Amount_for_Self_under_GTLDI_is_displayed_as(String Benefit) throws Throwable {
		CoveragePage.validates_Benefit_Amount_for_Self_under_GTLDI_is_displayed_as(Benefit);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under GSTDI$")
	public void selects_Benefit_Amount_for_Self_as_under_GSTDI(String Benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_STD(Benefit);
	}

	@Then("^Validates under GSTDI the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_GSTDI_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_STD_the_Benefit_Slider_Range_for_Self(Min, Max);
	}

	@Then("^Selects Wait Period for Self as \"([^\"]*)\" under GSTDI$")
	public void selects_Wait_Period_for_Self_as_under_GSTDI(String period) throws Throwable {
		CoveragePage.selects_Wait_Period_for_Self_as_under_STD(period);
	}

	@Then("^Selects Benefit duration for Self as \"([^\"]*)\" under GSTDI$")
	public void selects_Benefit_duration_for_Self_as_under_GSTDI(String duration) throws Throwable {
		CoveragePage.selects_Benefit_duration_for_Self_as_under_GSTDI(duration);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under GBOE$")
	public void selects_Benefit_Amount_for_Self_as_under_GBOE(String Benefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_POEDI_BOE_OO(Benefit);
	}

	@Then("^Validates under GBOE the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validates_under_GBOE_the_Benefit_Slider_Range_as_to(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_POEDI_OR_BOE_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Selects Wait Period for Self as \"([^\"]*)\" under GBOE$")
	public void selects_Wait_Period_for_Self_as_under_GBOE(String WaitPeriod1) throws Throwable {
		CoveragePage.selects_Wait_Period_for_Self_as_under_PO_POEDI_BOE(WaitPeriod1);
	}

	@Then("^Selects Benefit duration for Self as \"([^\"]*)\" under GBOE$")
	public void selects_Benefit_duration_for_Self_as_under_GBOE(String duration) throws Throwable {
		CoveragePage.selects_Benefit_Duration_for_Self_as_under_BOE(duration);
	}
	
	@Then("^Validate Waiting Period dropdown values for Self as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" under GDIILT$")
	public void validate_Waiting_Period_dropdown_values_for_Self_as_under_AOD(String wPeriod1, String wPeriod2, String wPeriod3)
			throws Throwable {
		CoveragePage.validates_Wait_Period_for_Self_as_under_GDIILT_from_dropdown(wPeriod1);
		CoveragePage.validates_Wait_Period_for_Self_as_under_GDIILT_from_dropdown(wPeriod2);
		CoveragePage.validates_Wait_Period_for_Self_as_under_GDIILT_from_dropdown(wPeriod3);
	}
	
	@Then("^Validates error message on GDIILT for exceed Monthly Benefit amount for self$")
	public void validates_error_message_on_Monthly_Benefit_Amount_Exceed()throws Throwable {
		CoveragePage.validates_error_message_on_Monthly_Benefit_Amount_Exceed();
	}
	
	@Then("^Validates error message on GDIILT for exceed FPO Monthly Benefit amount for self$")
	public void validates_error_message_on_Monthly_Benefit_Amount_Exceed_FPO()throws Throwable {
		CoveragePage.validates_error_message_on_Monthly_Benefit_Amount_Exceed_FPO();
	}
	

	@Then("^Verify that Child Benefit is not rendered under GTLI$")
	public void verify_that_Child_Benefit_is_not_rendered_under_GTLI() throws Throwable {
		CoveragePage.verify_that_Child_Benefit_is_not_rendered_under_GTLI();
	}

	@Then("^Verify that Spouse Benefit is not rendered under GTLI$")
	public void verify_that_Spouse_Benefit_is_not_rendered_under_GTLI() throws Throwable {
		CoveragePage.verify_that_Spouse_Benefit_is_not_rendered_under_GTLI();
	}

	@Then("^Verify Benefit Amount as \"([^\"]*)\" for Child under GTLI on Request Coverage Page$")
	public void verify_Benefit_Amount_as_for_Child_under_GTLI_on_Request_Coverage_Page(String Value) throws Throwable {
		CoveragePage.verify_Benefit_Amount_as_for_Child_under_GTLI_on_Request_Coverage_Page(Value);
	}
	
	@Then("^Verify Benefit Amount as \"([^\"]*)\" for Spouse under GTLI on Request Coverage Page$")
	public void verify_Benefit_Amount_as_for_Spouse_under_GTLI_on_Request_Coverage_Page(String Value) throws Throwable {
		CoveragePage.verify_Benefit_Amount_as_for_Spouse_under_GTLI_on_Request_Coverage_Page(Value);
	}
	
	@Then("^Selects Yes for all Health Questions of Request Coverage under Self$")
	public void selects_Yes_for_all_Health_Questions_of_Request_Coverage_under_Self() throws Throwable {
		CoveragePage.selects_Yes_for_all_Health_Questions_of_Request_Coverage_under_Self();
	}
	
	@Then("^Select YES for Are you now taking any prescribed medication$")
	public void select_YES_for_Are_you_now_taking_any_prescribed_medication() throws Throwable {
		CoveragePage.selects_Yes_for_Prescribed_Medication_of_Request_Coverage_under_Self();
	}


	@Then("^Select YES for During the past five years have you ever been medically diagnosed by a physician$")
	public void select_YES_for_During_the_past_five_years_have_you_ever_been_medically_diagnosed_by_a_physician() throws Throwable {
		CoveragePage.selects_Yes_for_Physician_diagnose_of_Request_Coverage_under_Self();
	}

	@Then("^Selects No for all Health Questions of Request Coverage under Self$")
	public void selects_No_for_all_Health_Questions_of_Request_Coverage_under_Self() throws Throwable {
		CoveragePage.selects_No_for_all_Health_Questions_of_Request_Coverage_under_Self();
	}


	@Then("^Select YES for During the past five years have you ever been counselled$")
	public void select_YES_for_During_the_past_five_years_have_you_ever_been_counselled() throws Throwable {
		CoveragePage.selects_Yes_for_Alcohol_Drugs_of_Request_Coverage_under_Self();
	}
	
	@Then("^Selects Yes for all Health Questions Request Coverage under Spouse$")
	public void selects_Yes_for_all_Health_Questions_Request_Coverage_under_Spouse() throws Throwable {
		CoveragePage.selects_Yes_for_all_Health_Questions_Request_Coverage_under_Spouse();
	}

	
	@Then("^Selects No for all Health Questions of Request Coverage under Spouse$")
	public void selects_No_for_all_Health_Questions_Request_Coverage_under_Spouse() throws Throwable {
		CoveragePage.selects_No_for_all_Health_Questions_Request_Coverage_under_Spouse();
	}


	@Then("^Verify that optional Rider AD is displayed for Self under Flex10$")

	public void validates_that_Optional_Rider_displayed_for_Self_under_Flex10()throws Throwable {
		CoveragePage.validates_that_Optional_Rider_displayed_for_Self_under_Flex10();
	}
	
	@Then("^Verify that optional Rider AD is displayed for Spouse under Flex10$")
	public void validates_that_Optional_Rider_displayed_for_Spouse_under_Flex10()throws Throwable {
		CoveragePage.validates_that_Optional_Rider_displayed_for_Spouse_under_Flex10();
	}
	
	@Then("^Verify that optional Rider WOP is not displayed for Self under Flex10$")
	public void validates_that_Wavier_Premium_not_displayed_for_Self_under_Flex10()throws Throwable {
		CoveragePage.validates_that_Wavier_Premium_not_displayed_for_Self_under_Flex10();
	}
	
	@Then("^Verify that optional Rider WOP is displayed for Self under Flex10$")
	public void validates_that_Wavier_Premium_displayed_for_Self_under_Flex10()throws Throwable {
		CoveragePage.validates_that_Wavier_Premium_displayed_for_Self_under_Flex10();
	}
	
	@Then("^Verify that optional Rider WOP is displayed for Self under GTLP75I$")
	public void validates_that_Wavier_Premium_displayed_for_Self_under_GTLP75I()throws Throwable {
		CoveragePage.validates_that_Wavier_Premium_displayed_for_Self_under_GTLP75I();
	}
	
	@Then("^Verify that optional Rider AD is displayed for Self under GTLP75I$")
	public void validates_that_Optional_Rider_displayed_for_Self_under_GTLP75I()throws Throwable {
		CoveragePage.validates_that_Optional_Rider_displayed_for_Self_under_GTLP75I();
	}
	
	@Then("^Verify that optional Rider AD is displayed for Spouse under GTLP75I$")
	public void validates_that_Optional_Rider_displayed_for_Spouse_under_GTLP75I()throws Throwable {
		CoveragePage.validates_that_Optional_Rider_displayed_for_Spouse_under_GTLP75I();
	}
	
	@Then("^Clicks on I do not wish to request Interim Insurance$")
	public void clicks_dont_wish_Interim_Insurance() throws Throwable{
		CoveragePage.clicks_dont_wish_Interim_Insurance();
	}
	
	@Then("^Clicks I do not wish to Terminate or Reduce Coverage$")
	public void clicks_dont_wish_Terminate_Reduce_Coverage() throws Throwable{
		CoveragePage.clicks_dont_wish_Terminate_Reduce_Coverage();
	}
	
	@Then("^Clicks I do not wish to Transfer Ownership$")
	public void clicks_dont_wish_Transfer_Ownership() throws Throwable{
		CoveragePage.clicks_dont_wish_Transfer_Ownership();
	}
	
	
	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under PureTerm$")
	public void selects_Benefit_Amount_for_Self_as_under_PureTerm(String Benefit2) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_PureTerm(Benefit2);
	}

	@Then("^Validates under PureTerm the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Self$")
	public void validates_under_PureTerm_the_Benefit_Slider_Range_as_to_for_Self(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_PureTerm_the_Benefit_Slider_Range_as_to_for_Self(Min, Max);
	}

	@Then("^Selects Waiver of Premium Rider for Self under PureTerm$")
	public void selects_Waiver_of_Premium_Rider_for_Self_under_PureTerm() throws Throwable {
		CoveragePage.selects_Waiver_of_Premium_Rider_for_Self_under_PureTerm();
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under PrefTerm$")
	public void selects_Benefit_Amount_for_Self_as_under_PrefTerm(String Benefit2) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_PrefTerm(Benefit2);
	}

	@Then("^Validates under PrefTerm the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Self$")
	public void validates_under_PrefTerm_the_Benefit_Slider_Range_as_to_for_Self(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_PrefTerm_the_Benefit_Slider_Range_as_to_for_Self(Min, Max);
	}

	@Then("^Selects Waiver of Premium Rider for Self under PrefTerm$")
	public void selects_Waiver_of_Premium_Rider_for_Self_under_PrefTerm() throws Throwable {
		CoveragePage.selects_Waiver_of_Premium_Rider_for_Self_under_PrefTerm();
	}

	@Then("^Selects AD&D Rider for Self under PrefTerm$")
	public void selects_AD_D_Rider_for_Self_under_PrefTerm() throws Throwable {
		CoveragePage.selects_AD_D_Rider_for_Self_under_PrefTerm();
	}

	@Then("^Selects Rider Benefit Amount for Self as \"([^\"]*)\" for ADnD Rider under PrefTerm$")
	public void selects_Rider_Benefit_Amount_for_Self_as_for_ADnD_Rider_under_PrefTerm(String Benefit2) throws Throwable {
		CoveragePage.selects_Rider_Benefit_Amount_for_Self_as_for_ADnD_Rider_under_PrefTerm(Benefit2);
	}

	@Then("^Validates under ADnD Rider PrefTerm Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Self$")
	public void validates_under_ADnD_Rider_PrefTerm_Benefit_Slider_Range_as_to_for_Self(String Min, String Max) throws Throwable {
		CoveragePage.validates_under_ADnD_Rider_PrefTerm_Benefit_Slider_Range_as_to_for_Self(Min, Max);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under PAI$")
	public void selects_Benefit_Amount_for_Self_as_under_PAI(String amount) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_PAI(amount);
	}

	@Then("^Validates under PAI the Benefit Amount listed for Self are: \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validates_under_PAI_the_Benefit_Amount_listed_for_Self_are(String amount1, String amount2, String amount3) throws Throwable {
		CoveragePage.validates_under_PAI_the_Benefit_Amount_listed_for_Self_are(amount1);
		CoveragePage.validates_under_PAI_the_Benefit_Amount_listed_for_Self_are(amount2);
		CoveragePage.validates_under_PAI_the_Benefit_Amount_listed_for_Self_are(amount3);
	}

	@Then("^Validates Benefit Amount for Spouse as \"([^\"]*)\" under PAI$")
	public void validates_Benefit_Amount_for_Spouse_as_under_PAI(String amount) throws Throwable {
		CoveragePage.validates_Benefit_Amount_for_Spouse_as_under_PAI(amount);
	}

	@Then("^Validates Benefit Amount for Child as \"([^\"]*)\" under PAI$")
	public void validates_Benefit_Amount_for_Child_as_under_PAI(String amount) throws Throwable {
		CoveragePage.validates_Benefit_Amount_for_Child_as_under_PAI(amount);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under DPOSDI$")
	public void selects_Benefit_Amount_for_Self_as_under_DPOSDI(String Benefit) throws Throwable {
		CoveragePage.selects_Monthly_Benefit_Amount_for_Self_as_under_DII(Benefit);
	}

	@Then("^Validates under DPOSDI the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Self$")
	public void validates_under_DPOSDI_the_Benefit_Slider_Range_as_to_for_Self(String Min, String Max)
			throws Throwable {
		CoveragePage.validates_under_DII_the_Benefit_Slider_Range_as_to(Min, Max);
	}

	@Then("^Selects Wait Period for Self as \"([^\"]*)\" under DPOSDI$")
	public void selects_Wait_Period_for_Self_as_under_DPOSDI(String Period) throws Throwable {
		CoveragePage.selects_Waiting_Period_for_Self_as_under_DII(Period);
	}

	@Then("^Validates Benefit Period for Self as \"([^\"]*)\" under DPOSDI$")
	public void validates_Benefit_Period_for_Self_as_under_DPOSDI(String benefitPeriod) throws Throwable {
		CoveragePage.validates_Benefit_Period_for_Self_as_under_DPOSDI(benefitPeriod);
	}

	@Then("^Selects Cost of Living Adjustment Rider under DPOSDI$")
	public void selects_Cost_of_Living_Adjustment_Rider_under_DPOSDI() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under OOEI$")
	public void selects_Benefit_Amount_for_Self_as_under_OOEI(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Validates under OOEI the Benefit Slider Range as \"([^\"]*)\" to \"([^\"]*)\" for Self$")
	public void validates_under_OOEI_the_Benefit_Slider_Range_as_to_for_Self(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Selects Wait Period for Self as \"([^\"]*)\" under OOEI$")
	public void selects_Wait_Period_for_Self_as_under_OOEI(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Validates Benefit Duration for Self as \"([^\"]*)\" under OOEI$")
	public void validates_Benefit_Duration_for_Self_as_under_OOEI(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Validates under HII the Benefit Amount listed for Self are: \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validates_under_HII_the_Benefit_Amount_listed_for_Self_are(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	

	// ************************Beneficiary Page*********************//

	/*
	 * @Then("^Beneficiary page details are displayed to user and add beneficiary as \"([^\"]*)\" , \"([^\"]*)\"$"
	 * ) public void
	 * beneficiary_page_details_are_displayed_to_user_and_add_beneficiary_as(String
	 * trustName, String trustDate) throws Throwable {
	 * BeneficiaryPage.validate_the_beneficiary_page_details(); BeneficiaryPage.
	 * beneficiary_page_details_are_displayed_to_user_and_add_beneficiary(trustName,
	 * trustDate); }
	 */

	@Then("^Users updates the beneficiary details as \"([^\"]*)\"$")
	public void users_updates_the_beneficiary_details_as(String trustName) throws Throwable {
		BeneficiaryPage.users_updates_the_beneficiary_details(trustName);
	}

	
	@Then("^Beneficiary Page is displayed to user$")
	public void beneficiary_Page_is_displayed_to_user() throws Throwable {
		BeneficiaryPage.beneficiary_Page_is_displayed_to_user();

	}
	
	@Then("^Beneficiary details are displayed to user$")
	public void beneficiary_details_is_displayed_to_user() throws Throwable {
		BeneficiaryPage.beneficiary_details_are_displayed_to_user();

	}

	@Then("^Clicks on Add Beneficiary button for Self$")
	public void clicks_on_Add_Beneficiary_Button_for_Self() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiery_button_for_Self();

	}
	
	@Then("^Clicks on Add Beneficiary Button Under Group Term LI for Self$")
	public void clicks_on_Add_Beneficiary_Button_Under_Group_Term_LI_for_Self() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		BeneficiaryPage.clicks_on_Add_Beneficiery_button_for_Self();
	}


	@Then("^Clicks on Add Beneficiary Button for Spouse$")
	public void clicks_on_Add_Beneficiary_Button_for_Spouse() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Spouse();

	}

	@Then("^Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons$")
	public void add_Beneficiary_page_will_be_displayed_to_user_and_user_will_select_Individual_and_Primary_Radio_Buttons()
			throws Throwable {

		BeneficiaryPage.add_Beneficiary_page_will_be_displayed_to_user_and_user_will_select_Individual_and_Primary_Radio_Buttons();
	}

	@Then("^Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons$")
	public void add_Beneficiary_page_will_be_displayed_to_user_and_user_will_select_Individual_and_Contingent_Radio_Buttons()
			throws Throwable {

		BeneficiaryPage.add_Beneficiary_page_will_be_displayed_to_user_and_user_will_select_Individual_and_Contingent_Radio_Buttons();
	}

	@Then("^Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons$")
	public void add_Beneficiary_page_will_be_displayed_to_user_and_user_will_select_Contingent_and_Trust_Radio_Buttons()
			throws Throwable {
		BeneficiaryPage.add_Beneficiary_page_will_be_displayed_to_user_and_user_will_select_Contingent_and_Trust_Radio_Buttons();

	}

	@Then("^Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons$")
	public void add_Beneficiary_page_will_be_displayed_to_user_and_user_will_select_Trust_and_Primary_Radio_Buttons()
			throws Throwable {
		BeneficiaryPage.add_Beneficiary_page_will_be_displayed_to_user_and_user_will_select_Trust_and_Primary_Radio_Buttons();
	}

	@Then("^User Enters Beneficiary details as name and relationship\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_Enters_Beneficiary_details_as_name_and_relationship(String Bfname, String Blname, String Relation,
			String Perc) throws Throwable {
		BeneficiaryPage.user_Enters_Beneficiary_details_as_name_and_relationship(Bfname, Blname, Relation, Perc);

	}

	@Then("^User Enters Beneficiary details as name and relationship as other \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_Enters_Beneficiary_details_as_name_and_relationship_as_other(String Bfname, String Blname,
			String Relation, String Perc, String Description) throws Throwable {
		BeneficiaryPage.user_Enters_Beneficiary_details_as_name_and_relationship_as_Other(Bfname, Blname, Relation,Perc, Description);
	}

	@Then("^Clicks on Skip Beneficiary Button$")
	public void clicks_on_Skip_Beneficiary_ies_Button() throws Throwable {
		BeneficiaryPage.clicks_on_Skip_Beneficiary_ies_Button();
	}

	@Then("^Delete box is displayed and clicks on Yes$")
	public void delete_box_is_displayed_and_clicks_on_Yes() throws Throwable {
		BeneficiaryPage.delete_box_is_displayed_and_clicks_on_Yes();
	}
	
	@Then("^Clicks on YES button for skip Beneficiries$")
	public void clicks_on_YES_button_for_skip_Beneficiries() throws Throwable {
		BeneficiaryPage.delete_box_is_displayed_and_clicks_on_Yes();
	}
	
	@Then("^Clicks on NO button for skip Beneficiries$")
	public void clicks_on_NO_button_for_skip_Beneficiries() throws Throwable {
		BeneficiaryPage.delete_box_is_displayed_and_clicks_on_No();
	}

	@Then("^Delete Contingent Beneficiary$")
	public void delete_Contigent_Beneficiary() throws Throwable {
		BeneficiaryPage.delete_Contigent_Beneficiary();

	}

	@Then("^Clicks Delete button for first Individual and Contingent Beneficiary for Self under HLDD$")
	public void clicks_Delete_button_for_first_Individual_and_Contingent_Beneficiary_for_Self_under_HLDD()
			throws Throwable {
		BeneficiaryPage.delete_Contigent_Beneficiary();
	}

	@Then("^Clicks on Delete second Individual Beneficiary under ADDI for self$")
	public void clicks_on_Delete_second_Individual_Beneficiary_under_ADDI_for_self() throws Throwable {
		BeneficiaryPage.delete_Second_Individual_Beneficiary_AccidentalDeath();
		
	}

	
	@Then("^Click Delete button for first Primary Beneficiary for Self$")
	public void clicks_Delete_button_for_first_Primary_Beneficiary_for_Self()
			throws Throwable {
		BeneficiaryPage.delete_first_primary_Beneficiary();
	}
	@Then("^Verify that there is no beneficary for Self under ARTL$")
	public void there_is_no_beneficiary_for_self_under_ARTL()throws Throwable {
		BeneficiaryPage.there_is_no_beneficiary_for_self_under_ARTL();
	}
	
	@Then("^Verify that Contingent Beneficiary is Deleted Successfully$")
	public void verify_that_Contingent_Beneficiary_is_Deleted_Successfully() throws Throwable {
		BeneficiaryPage.verify_that_Contingent_Beneficiary_is_Deleted_Successfully();
	}
	

	@Then("^Clicks on Next and OK Button$")
	public void clicks_on_Next_and_OK_Button() throws Throwable {
		Preview.clicks_on_Next_and_OK_Button();

	}

	@Then("^Clicks OK Button Save For Later$")
	public void clicks_OK_Button_Save_For_Later() throws Throwable {
		Preview.clicks_OK_Button_Save_For_Later();
	}

	@Then("^Clicks on Add Beneficiary Button for Self under TermLife$")
	public void clicks_on_Add_Beneficiary_Button_for_Self_under_TermLife() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Self_under_TermLife_ARTL();
	}
	
	
	@Then("^Clicks on Add Beneficiary Button for Self under TGTLI$")
	public void clicks_on_Add_Beneficiary_Button_for_Self_under_TGTLI() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Self_under_TermLife_ARTL();
	}
	
	@Then("^Clicks on Add Beneficiary Button for Self under GTLI$")
	public void clicks_on_Add_Beneficiary_Button_for_Self_under_GTLI() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Self_under_TermLife_ARTL();
	}
	
	@Then("^Clicks on Add Beneficiary Button for Self under GTTLI$")
	public void clicks_on_Add_Beneficiary_Button_for_Self_under_GTTLI() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Self_under_TermLife_ARTL();
	}

	@Then("^Clicks on Add Beneficiary Button for Spouse under TermLife$")
	public void clicks_on_Add_Beneficiary_Button_for_Spouse_under_TermLife() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Spouse_under_TermLife_ARTL();
	}
	
	@Then("^Clicks on Add Beneficiary Button for Spouse under TGTLI$")
	public void clicks_on_Add_Beneficiary_Button_for_Spouse_under_TGTLI() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Spouse_under_TermLife_ARTL();
	}
	
	@Then("^Clicks on Add Beneficiary Button for Spouse under GTLI$")
	public void clicks_on_Add_Beneficiary_Button_for_Spouse_under_GTLI() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Spouse_under_TermLife_ARTL();
	}
	
	@Then("^Clicks on Add Beneficiary Button for Spouse under GTTLI$")
	public void clicks_on_Add_Beneficiary_Button_for_Spouse_under_GTTLI() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Spouse_under_TermLife_ARTL();
	}

	@Then("^Clicks on Add Beneficiary Button for Spouse under ARTL$")
	public void clicks_on_Add_Beneficiary_Button_for_Spouse_under_ARTL() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Spouse_under_TermLife_ARTL();
	}
	
	@Then("^Clicks on Add Beneficiary Button for Self under ARTL$")
	public void clicks_on_Add_Beneficiary_Button_for_Self_under_ARTL() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Self_under_TermLife_ARTL();
	}

	@Then("^Clicks on Add Beneficiary Button for Self under GroupTermLife$")
	public void clicks_on_Add_Beneficiary_Button_for_Self_under_GroupTerm() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Self_under_GroupTerm();
	}
	
	@Then("^Clicks on Add Beneficiary Button Under LifeNintyFive for Self$")
	public void clicks_on_Add_Beneficiary_Button_Under_LifeNintyFive_for_Self() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Self_under_LifeTo95();
	}
	
	@Then("^Clicks on Add Beneficiary Button Under ADDI for Self$")
	public void clicks_on_Add_Beneficiary_Button_Under_ADDI_for_Self() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Self_under_AccidentalDeath();
	}

	@Then("^Clicks on Add Beneficiary Button for Spouse under GroupTermLife$")
	public void clicks_on_Add_Beneficiary_Button_for_Spouse_under_GroupTerm() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Spouse_under_GroupTerm();
	}

	@Then("^Clicks on Add Beneficiary Button for Self under TenYTL$")
	public void clicks_on_Add_Beneficiary_Button_for_Self_under_TenYTL() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Self_under_TenYTL();
	}

	@Then("^Clicks on Add Beneficiary Button for Spouse under TenYTL$")
	public void clicks_on_Add_Beneficiary_Button_for_Spouse_under_TenYTL() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Spouse_under_TenYTL();
	}
	
	@Then("^Clicks on Add Beneficiary Button for Spouse under GTenYTL$")
	public void clicks_on_Add_Beneficiary_Button_for_Spouse_under_GTenYTL() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Spouse_under_TenYTL();
	}

	@Then("^Clicks on Add Beneficiary Button for Self under GTenYTL$")
	public void clicks_on_Add_Beneficiary_Button_for_Self_under_GTenYTL() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Self_under_TenYTL();
	}

	@Then("^Clicks on Add Beneficiary Button for Self under FifteenYTL$")
	public void clicks_on_Add_Beneficiary_Button_for_Self_under_FifteenYTL() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Self_under_FifteenYTL();

	}

	@Then("^Clicks on Add Beneficiary Button for Spouse under FifteenYTL$")
	public void clicks_on_Add_Beneficiary_Button_for_Spouse_under_FifteenYTL() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Spouse_under_FifteenYTL();
	}
	@Then("^Clicks on Add Beneficiary Button for Self under TwentyYTL$")
	public void clicks_on_Add_Beneficiary_Button_for_Self_under_TwentyYTL() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Self_under_TwentyYTL();
	}
	
	@Then("^Clicks on Add Beneficiary Button for Self under GTwentyYTL$")
	public void clicks_on_Add_Beneficiary_Button_for_Self_under_GTwentyYTL() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Self_under_TwentyYTL();
	}

	@Then("^Clicks on Add Beneficiary Button for Spouse under TwentyYTL$")
	public void clicks_on_Add_Beneficiary_Button_for_Spouse_under_TwentyYTL() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Spouse_under_TwentyYTL();
	}
	
	@Then("^Clicks on Add Beneficiary Button for Spouse under GTwentyYTL$")
	public void clicks_on_Add_Beneficiary_Button_for_Spouse_under_GSTwentyYTL() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Spouse_under_TwentyYTL();
	}

	@Then("^Clicks on Add Beneficiary Button for Self under MLI$")
	public void clicks_on_Add_Beneficiary_Button_for_Self_under_MLI() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Self_under_MLI();
	}

	@Then("^Clicks on Add Beneficiary Button for Spouse under MLI$")
	public void clicks_on_Add_Beneficiary_Button_for_Spouse_under_MLI() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Spouse_under_MLI();
	}

	@Then("^Clicks on Add Beneficiary Button for Self under HLDD$")
	public void clicks_on_Add_Beneficiary_Button_for_Self_under_HLDD() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Self_under_HLDD();
	}

	@Then("^Clicks on Add Beneficiary Button for Spouse under HLDD$")
	public void clicks_on_Add_Beneficiary_Button_for_Spouse_under_HLDD() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Spouse_under_HLDD();
	}

	@Then("^Clicks on Add Beneficiary Button for Spouse under ADDI$")
	public void clicks_on_Add_Beneficiary_Button_for_Spouse_under_ADDI() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Spouse_under_HLDD();
	}

	@Then("^Clicks on Add Beneficiary Button for Self under DII$")
	public void clicks_on_Add_Beneficiary_Button_for_Self_under_DII() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Self_under_HLDD();
	}

	@Then("^Clicks on Add Beneficiary Button for Spouse under DII$")
	public void clicks_on_Add_Beneficiary_Button_for_Spouse_under_DII() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Spouse_under_HLDD();
	}

	@Then("^Clicks on Add Beneficiary Button under ADDI for Self$")
	public void clicks_on_Add_Beneficiary_Button_under_ADDI_for_Self() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Self_under_ADDI();
	}
	
	@Then("^Clicks on Add Beneficiary Button for Self under FirstToDieTermLife$")
	public void clicks_on_Add_Beneficiary_Button_for_Self_under_FirstToDieTermLife() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Self_under_FirstToDieTermLife();
	}
	
	@Then("^Clicks on Add Beneficiary Button for Spouse under FirstToDieTermLife$")
	public void clicks_on_Add_Beneficiary_Button_for_Spouse_under_FirstToDieTermLife() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Spouse_under_FirstToDieTermLife();
	}
	

	@Then("^Selects the First Option from Existing Beneficiaries List and select Type as \"([^\"]*)\"$")
	public void selects_the_First_Option_from_Existing_Beneficiaries_List_and_select_Type_as(String type)
			throws Throwable {
		BeneficiaryPage.selects_the_First_Option_from_Existing_Beneficiaries_List_and_select_Type_as(type);
	}

	@Then("^Selects the Second Option from Existing Beneficiaries List and select Type as \"([^\"]*)\"$")
	public void selects_the_Second_Option_from_Existing_Beneficiaries_List_and_select_Type_as(String type)
			throws Throwable {
		BeneficiaryPage.selects_the_Second_Option_from_Existing_Beneficiaries_List_and_select_Type_as(type);
	}

	@Then("^Selects the Third Option from Existing Beneficiaries List and select Type as \"([^\"]*)\"$")
	public void selects_the_Third_Option_from_Existing_Beneficiaries_List_and_select_Type_as(String type)
			throws Throwable {
		BeneficiaryPage.selects_the_Third_Option_from_Existing_Beneficiaries_List_and_select_Type_as(type);
	}

	@Then("^Selects the Fourth Option from Existing Beneficiaries List and select Type as \"([^\"]*)\"$")
	public void selects_the_Fourth_Option_from_Existing_Beneficiaries_List_and_select_Type_as(String type)
			throws Throwable {
		BeneficiaryPage.selects_the_Fourth_Option_from_Existing_Beneficiaries_List_and_select_Type_as(type);
	}

	@Then("^Selects the First Option from Existing Beneficiaries List and select Type as \"([^\"]*)\" for Trust$")
	public void selects_the_First_Option_from_Existing_Beneficiaries_List_and_select_Type_as_for_Trust(String type)
			throws Throwable {
		BeneficiaryPage.selects_the_First_Option_from_Existing_Beneficiaries_List_and_select_Type_as_for_Trust(type);
	}

	@Then("^Enters Percentage for First Option as \"([^\"]*)\"$")
	public void enters_Percentage_for_First_Option_as(String Percent) throws Throwable {
		BeneficiaryPage.enters_Percentage_for_First_Option_as(Percent);
	}

	@Then("^Enters Percentage Second Option as \"([^\"]*)\"$")
	public void enters_Percentage_Second_Option_as(String Percent) throws Throwable {
		BeneficiaryPage.enters_Percentage_Second_Option_as(Percent);
	}
	
	//NSPE
	@Then("^Enter new Beneficiary Percentage as \"([^\"]*)\"$")
	public void enter_new_Beneficiary_Percentage_as(String Percentage) throws Throwable {
	    BeneficiaryPage.enter_new_Beneficiary_Percentage_as(Percentage);
	}

	@Then("^Enters Percentage Third Option as \"([^\"]*)\"$")
	public void enters_Percentage_Third_Option_as(String Percent) throws Throwable {
		BeneficiaryPage.enters_Percentage_Third_Option_as(Percent);
	}

	@Then("^Enters Percentage Fourth Option as \"([^\"]*)\"$")
	public void enters_Percentage_Fourth_Option_as(String Percent) throws Throwable {
		BeneficiaryPage.enters_Percentage_Fourth_Option_as(Percent);
	}

	@Then("^Verify that the Percent Displayed for Trust is \"([^\"]*)\"$")
	public void verify_that_the_Percent_Displayed_is_for_Trust(String Percent) throws Throwable {
		BeneficiaryPage.verify_that_the_Percent_Displayed_is_for_Trust(Percent);
	}
	
	@Then("^Verify that the Percent Displayed for Trust under Guaranteed Issue Group Term Life is \"([^\"]*)\"$")
	public void verify_that_the_Percent_Displayed_is_for_Trust_under_GIGTL(String Percent) throws Throwable {
		BeneficiaryPage.verify_that_the_Percent_Displayed_is_for_Trust_under_GIGTL(Percent);
	}

	@Then("^Verify that the Percent Displayed for Trust under GroupTermLife is \"([^\"]*)\"$")
	public void verify_that_the_Percent_Displayed_is_for_Trust_under_GroupTermLife(String Percent) throws Throwable {
		BeneficiaryPage.verify_that_the_Percent_Displayed_is_for_Trust_under_GIGTL(Percent);
	}

	@Then("^Verify that the Percent Displayed for Trust \"([^\"]*)\" is \"([^\"]*)\" for TermLife$")
	public void verify_that_the_Percent_Displayed_is_for_Trust_TermLife(String TrustSequence, String Percent)
			throws Throwable {
		BeneficiaryPage.verify_that_the_Percent_Displayed_is_for_Trust_TermLife(TrustSequence, Percent);
	}
	
	@Then("^Verify that the Percent Displayed for Trust \"([^\"]*)\" is \"([^\"]*)\" for TGTLI$")
	public void verify_that_the_Percent_Displayed_is_for_Trust_TGTLI(String TrustSequence, String Percent) throws Throwable {
		BeneficiaryPage.verify_that_the_Percent_Displayed_is_for_Trust_TermLife(TrustSequence, Percent);
	}

	@Then("^Verify that the Percent Displayed for Trust is \"([^\"]*)\" for ADDI$")
	public void verify_that_the_Percent_Displayed_is_for_Trust_ADDI(String Percent) throws Throwable {
		BeneficiaryPage.verify_that_the_Percent_Displayed_is_for_Trust_Self_ADDI(Percent);
	}

	@Then("^Verify that the Percent Displayed for Trust is \"([^\"]*)\" for Spouse under TermLife$")
	public void verify_that_the_Percent_Displayed_for_Trust_is_for_Spouse_under_TermLife(String Percent)
			throws Throwable {
		BeneficiaryPage.verify_that_the_Percent_Displayed_is_for_Trust_for_Spouse_under_TermLife(Percent);
	}

	@Then("^Verify that the Percent Displayed for Trust is \"([^\"]*)\" for Spouse under GTLI$")
	public void verify_that_the_Percent_Displayed_for_Trust_is_for_Spouse_under_GTLI(String Percent)
			throws Throwable {
		BeneficiaryPage.verify_that_the_Percent_Displayed_is_for_Trust_for_Spouse_under_TermLife(Percent);
	}
	
	@Then("^Verify that the Percent Displayed for Trust is \"([^\"]*)\" for Spouse under GTTLI$")
	public void verify_that_the_Percent_Displayed_for_Trust_is_for_Spouse_under_GTTLI(String Percent)
			throws Throwable {
		BeneficiaryPage.verify_that_the_Percent_Displayed_is_for_Trust_for_Spouse_under_TermLife(Percent);
	}
	// AAFP
	@Then("^Verify that the Trust Percentage Displayed for Spouse is \"([^\"]*)\"$")
	public void verify_that_the_Trust_Percent_Displayed_for_Spouse(String Percent) throws Throwable {
		BeneficiaryPage.verify_that_the_Trust_Percent_Displayed_for_Spouse(Percent);
	}

	@Then("^Verify that the Percent Displayed for Trust is \"([^\"]*)\" for Spouse under TwentyYTL$")
	public void verify_that_the_Trust_Percent_Displayed_for_Spouse_under_TwentyYTL(String Percent) throws Throwable {
		BeneficiaryPage.verify_that_the_Trust_Percent_Displayed_for_Spouse_under_TwentyYTL( Percent);
	}
	@Then("^Validate Error Message is displayed on Beneficiary Page$")
	public void validate_Error_Message_is_displayed_on_Beneficiary_Page() throws Throwable {
		BeneficiaryPage.validate_Error_Message_is_displayed_on_Beneficiary_Page();
	}

	@Then("^Validates error message on Add Beneficiary page-Only one Trust is allowed as Primary$")
	public void validates_error_message_on_Add_Beneficiary_page_Only_one_Trust_is_allowed_as_Primary()
			throws Throwable {
		BeneficiaryPage.validates_error_message_on_Add_Beneficiary_page_Only_one_Trust_is_allowed_as_Primary();
	}

	@Then("^Validates error message on Beneficiary page that Only one Trust is allowed as Contingent$")
	public void validates_error_message_on_Beneficiary_page_that_Only_one_Trust_is_allowed_as_Contingent()
			throws Throwable {
		BeneficiaryPage.validates_error_message_on_Add_Beneficiary_page_that_Only_one_Trust_is_allowed_as_Contingent();

	}

	// TIE
	@Then("^Validates error message for Beneficiaries Percentage share$")
	public void validates_error_message_for_Beneficiaries_Percentage_share() throws Throwable {
		BeneficiaryPage.validates_error_message_for_Beneficiaries_Percentage_share();
	}

	@Then("^Clicks on Payment and Health page to verify that the Screen is not rendered$")
	public void clicks_on_Payment_and_Health_page_to_verify_that_the_Screen_is_not_rendered() throws Throwable {
		Preview.clicks_on_Payment_and_Health_page_to_verify_that_the_Screen_is_not_rendered();
	}

	@Then("^Clicks on Close button$")
	public void clicks_on_Close_button() throws Throwable {
		BeneficiaryPage.clicks_on_Close_button();
	}

	@Then("^Clicks on Edit button for first Beneficiary for Spouse for TenYTI$")
	public void click_on_Edit_button_for_First_Beneficiary_for_spouse_for_TenYTL() throws Throwable {
		BeneficiaryPage.click_on_Edit_button_for_First_Beneficiary_for_spouse_for_TenYTL();
	}

	@Then("^Clicks on Edit button for second Beneficiary for Spouse for TenYTI$")
	public void click_on_Edit_button_for_Second_Beneficiary_for_spouse_for_TenYTL() throws Throwable {
		BeneficiaryPage.click_on_Edit_button_for_Second_Beneficiary_for_spouse_for_TenYTL();
	}
	
	@Then("^Clicks on \"([^\"]*)\" Edit button for Beneficiary for Spouse for GTenYTLI$")
	public void click_on_Edit_button_for_Fourth_Beneficiary_for_spouse_for_GTenYTLI(String rowNo) throws Throwable {
		BeneficiaryPage.click_on_Edit_button_for_Fourth_Beneficiary_for_spouse_for_TenYTL(rowNo);
	}

	@Then("^Add Beneficiary page will be displayed to user and User Enters Beneficiary details as \"([^\"]*)\" for Individual Primary$")
	public void user_Enters_Beneficiary_details_as_Percentage_Individual_Primary(String Percent) throws Throwable {
		BeneficiaryPage.user_Enters_Beneficiary_details_as_Percentage(Percent);
	}
	
	@Then("^Click on Edit Button for Third Contingent Individual Beneficiary under GroupTermLife$")
	public void click_on_Edit_Button_for_Third_Contingent_Individual_Beneficiary_under_GroupTermLife() throws Throwable {
		BeneficiaryPage.click_on_Edit_Button_for_Third_Contingent_Individual_Beneficiary_for_self_TermLife_FiveYr();
	}

	@Then("^Enter Percentage as \"([^\"]*)\"$")
	public void enter_Percentage_as(String Percent) throws Throwable {
		BeneficiaryPage.user_Enters_Beneficiary_details_as_Percentage(Percent);
	}

	@Then("^Add Beneficiary page will be displayed to user and User Enters Beneficiary details as \"([^\"]*)\" for Individual Contingent$")
	public void user_Enters_Beneficiary_details_as_Percentage_Individual_Contingent(String Percent) throws Throwable {
		BeneficiaryPage.user_Enters_Beneficiary_details_as_Percentage(Percent);
	}
	
	//NSPE
	@Then("^Clicks on Edit button of \"([^\"]*)\" Beneficiary for Spouse under GroupTermLife$")
	public void clicks_on_Edit_button_of_Beneficiary_for_Spouse_under_GroupTermLife(String Sequence) throws Throwable {
	    BeneficiaryPage.clicks_on_Edit_button_of_Beneficiary_for_Spouse_under_GroupTermLife(Sequence);
	}
	
	@Then("^Clicks on Edit button of \"([^\"]*)\" Beneficiary for Spouse under TermLife$")
	public void clicks_on_Edit_button_of_Beneficiary_for_Spouse_under_TermLife(String Sequence) throws Throwable {
	    BeneficiaryPage.clicks_on_Edit_button_of_Beneficiary_for_Spouse_under_GroupTermLife(Sequence);
	}
	
	
	@Then("^Clicks on Edit button of \"([^\"]*)\" Beneficiary for Self under TenYTI$")
	public void clicks_on_Edit_button_of_Beneficiary_for_Self_under_TenYTI(String Sequence) throws Throwable {
	    BeneficiaryPage.clicks_on_Edit_button_of_Beneficiary_for_Self_under_TenYTI(Sequence);
	}
	
	@Then("^Clicks on edit button of \"([^\"]*)\" Beneficiary for Self under GTenYTL$")
	public void clicks_on_Edit_button_of_Beneficiary_for_Self_under_GTenYTL(String Sequence) throws Throwable {
	    BeneficiaryPage.clicks_on_Edit_button_of_Beneficiary_for_Self_under_TenYTI(Sequence);
	}

	@Then("^Verify that error message is displayed as trust cannot be added if individual already exists$")
	public void verify_the_error_message_trust_cannot_added_individual_exists() throws Throwable {
		BeneficiaryPage.verify_the_error_message_trust_cannot_added_Individual_Exists();
	}
	
	@Then("^Verify that error message is displayed as individual cannot be added if trust already exists$")
	public void verify_the_error_message_individual_cannot_added_trust_exists() throws Throwable {
		BeneficiaryPage.verify_the_error_message_Individual_cannot_added_Trust_Exists();
	}

	@Then("^Verify Error Message is displayed for share of Beneficiaries$")
	public void verify_the_error_message_beneficiaries_must_contain_share() throws Throwable {
		BeneficiaryPage.verify_the_error_message_beneficiaries_must_contain_share();
	}

	@Then("^Verify Error Message is displayed for share Exceeding of Beneficiaries$")
	public void verify_Error_Message_is_displayed_for_share_Exceeding_of_Beneficiaries() throws Throwable {
		BeneficiaryPage.verify_the_error_message_beneficiaries_must_not_Exceed_100_share();
	}
	
	
	@Then("^Validate Maximum Beneficiaries Error message$")
	public void validate_Maximum_Beneficiaries_Error_message() throws Throwable {
		BeneficiaryPage.validate_Maximum_Beneficiaries_Error_message();
	}

	@Then("^Clicks on Edit button for first primary Beneficiary for Self for TenYTI$")
	public void click_on_Edit_button_for_First_Primary_Beneficiary_for_self_for_TenYTL() throws Throwable {
		BeneficiaryPage.click_on_Edit_button_for_First_Primary_Beneficiary_for_self_for_TenYTL();
	}

	@Then("^Validate Maximum Contingent Beneficiaries Error message$")
	public void validate_Maximum_Contingent_Beneficiaries_Error_message() throws Throwable {
		BeneficiaryPage.validate_Maximum_Contingent_Beneficiaries_Error_message();
	}
	
	//NSPE
	@Then("^Validate Maximum Beneficiaries Error message for Individual Type$")
	public void validate_Maximum_Beneficiaries_Error_message_for_Individual_Type() throws Throwable {
	    BeneficiaryPage.validate_Maximum_Beneficiaries_Error_message_for_Individual_Type();
	}

	@Then("^Clicks on Edit button for first Contingent Beneficiary for Self for TenYTI$")
	public void click_on_Edit_button_for_First_Contingent_Beneficiary_for_self_for_TenYTL() throws Throwable {
		BeneficiaryPage.click_on_Edit_button_for_First_Contingent_Beneficiary_for_self_for_TenYTL();
	}
	
	@Then("^Clicks on Add Beneficiary Button under GADD for Self$")
	public void clicks_on_Add_Beneficiary_Button_under_GADD_for_Self() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Self_under_GADD();
	}
	
	@Then("^Clicks on Add Beneficiary Button for Self under HLAI$")
	public void clicks_on_Add_Beneficiary_Button_for_Self_under_HLAI() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Self_under_GADD();
	}
	
	@Then("^Clicks on Add Beneficiary Button for Spouse under HLAI$")
	public void clicks_on_Add_Beneficiary_Button_for_Spouse_under_HLAI() throws Throwable {
		BeneficiaryPage.clicks_on_Add_Beneficiary_Button_for_Spouse_under_GADD();
	}
	
	@Then("^Clicks on Edit button for Beneficiary details$")
	public void clicks_beneficiary_edit_button() throws Throwable{
		BeneficiaryPage.clicks_beneficiary_edit_button();
	}
	
	@Then("^Clicks on Edit button for fourth primary Beneficiary for Self for GIGTL$")
	public void click_on_Edit_button_for_Fourth_Primary_Beneficiary_for_self_for_GIGTL() throws Throwable {
		BeneficiaryPage.click_on_Edit_button_for_Fourth_Primary_Beneficiary_for_self_for_GIGTL();
	}
	
	@Then("^Clicks on Edit button for fourth primary Beneficiary for Self under GroupTermLife$")
	public void clicks_on_Edit_button_for_fourth_primary_Beneficiary_for_Self_under_GroupTermLife() throws Throwable {
		BeneficiaryPage.click_on_Edit_button_for_Fourth_Primary_Beneficiary_for_self_for_GIGTL();
	}
	
	@Then("^Clicks on Edit button for fourth primary Beneficiary for Self under GTenYTLI$")
	public void click_on_Edit_button_for_Fourth_Primary_Beneficiary_for_self_for_GIenYTLI() throws Throwable {
		BeneficiaryPage.click_on_Edit_button_for_Fourth_Primary_Beneficiary_for_self_for_GTenYTLI();
	}
	
	@Then("^Clicks on Edit button for eighth Beneficiary for Self for GIGTL$")
	public void click_on_Edit_button_for_Eighth_Primary_Beneficiary_for_self_for_GIGTL() throws Throwable {
		BeneficiaryPage.click_on_Edit_button_for_Eighth_Primary_Beneficiary_for_self_for_GIGTL();
	}

	@Then("^Clicks on Edit button for eighth Beneficiary for Self under GroupTermLife$")
	public void clicks_on_Edit_button_for_eighth_Beneficiary_for_Self_under_GroupTermLife() throws Throwable {
		BeneficiaryPage.click_on_Edit_button_for_Eighth_Primary_Beneficiary_for_self_for_GIGTL();
	}
	
	@Then("^Clicks on Edit button for eighth Beneficiary for Self under GTenYTLI$")
	public void click_on_Edit_button_for_Eighth_Primary_Beneficiary_for_self_for_GIenYTLI() throws Throwable {
		BeneficiaryPage.click_on_Edit_button_for_Eighth_Primary_Beneficiary_for_self_for_GTenYTLI();
	}
	
	@Then("^Verify Add Beneficiary Button for GTTLI, GTenYLI, GTwentyYLI is available for Self$")
	public void verify_Add_Beneficiary_Button_Displayed_Self_Under_GTTLI_GTenYLI_GTwenty_YLI() throws Throwable {
		BeneficiaryPage.validates_Add_Beneficiary_button_is_displayed_for_GTTLI();
		BeneficiaryPage.validates_Add_Beneficiary_button_is_displayed_for_GTenYTL();
		BeneficiaryPage.validates_Add_Beneficiary_button_is_displayed_for_GTwentyYLI();
	}

	@Then("^Verify Error Message individual can not be added if trust already exist$")
	public void validates_error_message_on_Add_Beneficiary_page_Individual_can_not_be_added_if_trust_already_exists() throws Throwable {
		BeneficiaryPage.validates_error_message_on_Add_Beneficiary_page_Individual_can_not_be_added_if_trust_already_exists();
	}


	// ***************************************Contact Page***************************************//

	@Then("^Contact page details are displayed to user and validate details$")
	public void contact_page_details_are_displayed_to_user_and_validate_details() throws Throwable {
		contact.contact_page_details_are_displayed_to_user_and_validate_details();

	}

	@Then("^Contact Details page is displayed to user$")
	public void contact_details_page_is_displayed_to_user() throws Throwable {
		contact.contact_details_page_are_displayed_to_user();
	}
	
/*	@Then("^Contact details are displayed to user$")
	public void contact_details_is_displayed_to_user() throws Throwable {
		contact.contact_details_page_are_displayed_to_user();

	}*/

	@Then("^Validates Height and Weight is displayed for Self$")
	public void validates_Height_and_Weight_is_displayed_for_Self() throws Throwable {
		contact.validates_that_Height_is_displayed_for_Self();
		contact.validates_that_Weight_is_displayed_for_Self();
	}

	@Then("^Validates Height and Weight is not displayed for Self$")
	public void validates_Height_and_Weight_is_not_displayed_for_Self() throws Throwable {
		contact.validates_that_Height_is_not_displayed_for_Self();
		contact.validates_that_Weight_is_not_displayed_for_Self();
	}

	@Then("^Validates Height and Weight is not displayed for Spouse$")
	public void validates_Height_and_Weight_is_not_displayed_for_Spouse() throws Throwable {
		contact.validates_that_Height_is_not_displayed_for_Spouse();
		contact.validates_that_Weight_is_not_displayed_for_Spouse();
	}

	@Then("^WAEPA Contact Details page is displayed to user and enter contact Details for self as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void waepa_Contact_Details_page_is_displayed_to_user_and_enter_contact_Details_for_self_as(
			String SocialSecurityNo, String MaritalStatus, String Height, String Weight, String Gender, String Address,
			String City, String Zip) throws Throwable {
		contact.enters_contact_Details_for_Self_without_MemberShipID_as(SocialSecurityNo, MaritalStatus, Height, Weight,
				Gender, Address, City, Zip);
	}

	
	@Then("^Selects Yes Radio button for Tobacco Question$")
	public void selects_Yes_Radio_button_for_Tobacco_Question() throws Throwable {
		contact.selects_Yes_Radio_button_for_Tobacco_Question();
	}
	
	@Then("^Selects Yes Radio button for Nicotine Question for Self$")
	public void selects_Yes_Radio_button_for_Nicotine_Question_Self() throws Throwable {
		contact.selects_Yes_Radio_button_for_Nicotine_Question_Self();
	}
	
	@Then("^Selects No Radio button for Nicotine Question for Self$")
	public void selects_No_Radio_button_for_Nicotine_Question_Self() throws Throwable {
		contact.selects_No_Radio_button_for_Nicotine_Question_Self();
	}
	
	@Then("^Selects Yes Radio button for Nicotine Question for Spouse$")
	public void selects_Yes_Radio_button_for_Nicotine_Question_Spouse() throws Throwable {
		contact.selects_Yes_Radio_button_for_Nicotine_Question_Spouse();
	}

	@Then("^Validates Last Used Date Textbox and Specify the products used Textbox is displayed$")
	public void validates_Last_Used_Date_Textbox_and_Specify_the_products_used_Textbox_is_displayed() throws Throwable {
		contact.validates_Last_Used_Date_Textbox_and_Specify_the_products_used_Textbox_is_displayed();
	}

	@Then("^Selects No Radio button for Tobacco Question Self$")
	public void selects_No_Radio_button_for_Tobacco_Question_Self() throws Throwable {
		contact.selects_No_Radio_button_for_Tobacco_Question_Self();
	}

	@Then("^Selects No Radio button for Tobacco Question Spouse$")
	public void selects_No_Radio_button_for_Tobacco_Question_Spouse() throws Throwable {
		contact.selects_No_Radio_button_for_Tobacco_Question_Spouse();
	}

	@Then("^Enters Details for Spouse like Gender,Phone type and Phone number \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_contact_Details_for_Spouse_as_minimum_details_without_SSN(String Gender,String PhoneType,String PhoneNo)throws Throwable{
		contact.enters_contact_Details_for_Spouse_as_minimum_details_without_SSN(Gender, PhoneType, PhoneNo);
	}

	@Then("^Selects Residential Radio Button$")
	public void selects_Residential_Radio_Button() throws Throwable {
		contact.selects_Residential_Radio_Button();
	}

	@Then("^Selects Yes Radio Button for Business Address$")
	public void selects_Yes_Radio_Button_for_Business_Address() throws Throwable {
		contact.selects_Yes_Radio_Button_for_Business_Address();

	}

	@Then("^Selects NO Radio Button for Business Address$")
	public void selects_NO_Radio_Button_for_Business_Address() throws Throwable {
		contact.selects_NO_Radio_Button_for_Business_Address();
	}
	
	@Then("^Enter Business Address Details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_Address_Details_as(String BStreet, String BCity, String BState, String BZipcode)
			throws Throwable {
		contact.enters_Business_Address_Details_as(BStreet, BCity, BState, BZipcode);
	}
//Test-Pradeep
/*	@Then("^Enter TestData as \"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_TestData_as(String Fname, String FirstName)
			throws Throwable {
EligibilityPage.enter_TestData_as(Fname, FirstName);
		
	}*/
//***************
	@Then("^Enters Business Address Details as \"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_Business_Address_Details_as(String BussinessName, String BusinessType) throws Throwable {
		contact.enters_Business_Details_as(BussinessName, BusinessType);
	}
	
	
	@Then("^Enters Business Details as \"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_Business_Details_as(String BussinessName, String BusinessType) throws Throwable {
		contact.enters_Business_Details_as(BussinessName, BusinessType);
	}
	
	@Then("^Enters Business Address Details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_Business_Address_Details_as(String BussinessName, String BusinessType, String BStreet, String BCity, String BState, String BZipcode) throws Throwable {
		contact.enters_Business_Details_as(BussinessName, BusinessType);
		contact.enters_Business_Address_Details_as(BStreet, BCity, BState, BZipcode);
	}

	@Then("^Selects No Radio button for Driving Licensing Question for Self$")
	public void selects_No_Radio_button_for_Driving_Licensing_Question_for_Self() throws Throwable {

		contact.selects_No_Radio_button_for_Driving_Licensing_Question_for_Self();
	}

	@Then("^Validate Max Aggregate error message$")
	public void validate_Max_Aggregate_error_message() throws Throwable {
		CoveragePage.validate_Coverage_related_Error_message();
	}

	@Then("^Validate Coverage related Error message at top$")
	public void validate_Coverage_related_Error_message_at_top() throws Throwable {
		CoveragePage.validate_Coverage_related_Error_message_ACS();
	}
	
	@Then("^Validate Coverage Required Questions error message$")
	public void validate_Coverage_Required_Questions_Error_message() throws Throwable {
		CoveragePage.validate_Coverage_Required_Questions_Error_message();
	}
	
	@Then("^Select Self icon for Interim$")
	public void click_Interim_Self() throws Throwable{
		CoveragePage.click_Interim_Self();
	}
	
	@Then("^verify that error message is displayed for Spouse under Flex10$")
	public void validate_Spouse_AD_D_Benefit_Exceed_Error_message() throws Throwable{
		CoveragePage.validate_Spouse_AD_D_Benefit_Exceed_Error_message();
	}

//WAEPA
	@Then("^Enter datails for Outside US country and How Long months for Spouse as \"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_datails_for_Outside_US_country_and_How_Long_months_for_Spouse_as(String Country, String Months)
			throws Throwable {
		contact.enter_datails_for_Outside_US_country_and_How_Long_months_for_Spouse_as(Country, Months);
	}

	@Then("^Enter details for Outside US country and How Long months for Self as \"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_details_for_Outside_US_country_and_How_Long_months_for_Self_as(String Country, String Months)
			throws Throwable {
		contact.enter_details_for_Outside_US_country_and_How_Long_months_for_Self_as(Country, Months);
	}

	@Then("^Clicks on TV checkbox$")
	public void clicks_on_TV_checkbox() throws Throwable {
		contact.Clicks_on_TV_checkbox();
	}

	@Then("^Clicks on FAMILY checkbox$")
	public void clicks_on_FAMILY_checkbox() throws Throwable {
		contact.Clicks_on_Family_checkbox();
	}

	//thisone
	@Then("^Contact Details page is displayed to user and enters contact Details for self as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void contact_Details_page_is_displayed_to_user_and_enters_contact_Details_for_self_as(String SSN,String Mstatus, String Gender_Self, String MembershipID, String Street, String City, String Zip)
			throws Throwable {
		contact.contact_Details_page_is_displayed_to_user_and_enters_contact_Details_for_self_without_height_weight_as(SSN, Mstatus, Gender_Self, MembershipID, Street, City, Zip);
	}

	@Then("^Contact Details page is displayed to user and enters complete detail of contact page for self as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void contact_Details_page_is_displayed_to_user_and_enters_complete_details_of_contact_page_for_self_as_(String SocialSecurityNo, String MaritalStatus, String Height, String Weight, String Gender, String MemberId,String Address, String City, String Zip) throws Throwable {
		contact.contact_Details_page_is_displayed_to_user_and_enters_contact_Details_for_self_complete_details_as(
				SocialSecurityNo, MaritalStatus, Height, Weight, Gender, MemberId, Address, City, Zip);

	}
	
	
	@Then("^Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void contact_Details_page_is_displayed_to_user_and_enters_contact_Details_for_self_Without_MemberID_and_Weight_as(
			String SSN, String Mstatus, String gender, String Street, String City, String Zip) throws Throwable {
		contact.contact_Details_page_is_displayed_to_user_and_enters_contact_Details_for_self_Without_MemberID_and_Weight_as(
				SSN, Mstatus, gender, Street, City, Zip);
	}
	
	
	@Then("^Enters contact Details for self Without MemberID,Height,Weight,Mstatus as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_contact_Details_for_self_Without_MemberID_Height_Weight_and_Mstatus_as(String SSN,String gender, String Street, String City, String Zip) throws Throwable {
		contact.enters_contact_Details_for_self_Without_MemberID_Height_Weight_and_Mstatus_as(SSN, gender, Street, City, Zip);
	}

	@Then("^Enters contact Details for self Without SSN,MemberID,Height,Weight,Mstatus as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_contact_Details_for_self_Without_SSN_MemberID_Height_Weight_and_Mstatus_as(String gender, String Street, String City, String Zip) throws Throwable {
		contact.enters_contact_Details_for_self_Without_SSN_MemberID_Height_Weight_and_Mstatus_as(gender, Street,City, Zip);
	}

	@Then("^Enters contact Details for Spouse as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_contact_Details_for_Spouse_as(String SSN_Spouse, String SHeight, String SWeight, String Gender,
			String SPhoneType, String SPhoneNum) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		contact.enters_contact_Details_for_Spouse_as(SSN_Spouse, SHeight, SWeight, Gender, SPhoneType, SPhoneNum);
	}

	@Then("^Enters WeightTwelveMonths ago details for Spouse as \"([^\"]*)\"$")
	public void enters_WeightTwelveMonths_ago_details_for_Spouse_as(String S12mnthsWeight) throws Throwable {
		contact.enters_WeightTwelveMonths_ago_details_for_Spouse_as(S12mnthsWeight);
	}
	
	@Then("^Enters Contact Details for Self Without SSN as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_Contact_Details_for_Self_Without_SSN_as(String MaritalStatus, String Height, String Weight, String Gender, String MemberId, String Address, String City, String Zip) throws Throwable {
		contact.enters_Contact_Details_for_Self_Without_SSN_as(MaritalStatus, Height, Weight, Gender, MemberId, Address, City, Zip);
	}

	
	@Then("^Enters Contact Details for Self without SSN ,Height and Weight as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_Contact_Details_for_Self_without_SSN_Height_and_Weight_as(String MaritalStatus, String Gender, String MemberId, String Address, String City, String Zip) throws Throwable {
		contact.enters_Contact_Details_for_Self_without_SSN_Height_and_Weight_as(MaritalStatus, Gender, MemberId, Address, City, Zip);
	}
	
	@Then("^Enters Contact Details for Self without SSN,Marital Status,Height and Weight as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_Contact_Details_for_Self_without_SSN_MaritalStatus_Height_and_Weight_as(String Gender, String MemberId, String Address, String City, String Zip) throws Throwable {
		contact.enters_Contact_Details_for_Self_without_SSN_MaritalStatus_Height_and_Weight_as(Gender, MemberId, Address, City, Zip);
	}

	@Then("^Enters contact Details without SSN and MemberID for Self as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_contact_Details_without_SSN_and_MemberId_for_Self_as(String MaritalStatus, String Height,
			String Weight, String Gender, String Address, String City, String Zip) throws Throwable {
		contact.enters_contact_Details_without_SSN_and_MemberId_for_Self_as(MaritalStatus, Height, Weight, Gender,
				Address, City, Zip);
	}

	@Then("^Enters contact Details without SSN, MemberID, Height, Weight for Self as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_contact_Details_without_SSN_MemberId_Height_Weight_for_Self_as(String MaritalStatus,
			String Gender, String Address, String City, String Zip) throws Throwable {
		contact.enters_contact_Details_without_SSN_MemberId_Height_Weight_for_Self_as(MaritalStatus, Gender, Address,
				City, Zip);
	}

	@Then("^Enters SSN \"([^\"]*)\" for Self$")
	public void enters_SSN_for_Self(String SocialSecurityNo) throws Throwable {
		contact.enters_SSN_for_Self(SocialSecurityNo);
	}

	// AAFP
	@Then("^Enters contact Details for Spouse with SSN and MembershipID as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_contact_Details_for_Spouse_with_SSN_and_MembershipID_as(String SSN_Spouse, String SHeight,
			String SWeight, String SSex,String SMemId, String SPhoneType, String SPhoneNum) throws Throwable {
		contact.enters_contact_Details_for_Spouse_with_SSN_and_MembershipID_as(SSN_Spouse, SHeight, SWeight, SSex,SMemId,
				 SPhoneType, SPhoneNum);
	}

	@Then("^Enters contact Details for Spouse as mimimum details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_contact_Details_for_Spouse_as_minimum_details(String SSSN, String SGender,String SPhoneType, String SPhoneNum) throws Throwable {
		contact.enters_contact_Details_for_Spouse_as_minimum_details(SSSN, SGender, SPhoneType, SPhoneNum);
	}

	@Then("^Enters contact Details for Spouse as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" for HII$")
	public void enters_contact_Details_for_Spouse_as_for_HII(String SSSN, String SGender, String SPhoneType,String SPhoneNum) throws Throwable {
		 contact.enters_contact_Details_for_Spouse_as_minimum_details(SSSN, SGender, SPhoneType, SPhoneNum);
	}

	@Then("^Enters contact Details for Spouse without SSN as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_contact_Details_for_Spouse_without_SSN_as(String SGender, String SHeight, String SWeight,
			String SPhoneType, String SPhoneNum) throws Throwable {
		contact.enters_contact_Details_for_Spouse_as_without_SSN(SGender, SHeight, SWeight, SPhoneType, SPhoneNum);
	}
	
	  /*@Then("^Enters contact Details for Spouse without MembershipID as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$") public void
	  enters_contact_Details_for_Spouse_without_MembershipID_as(String SSSN, String SGender, String SPhoneType, String SPhoneNum) throws Throwable {
	  contact.enters_contact_Details_for_Spouse_as_without_membershipId(SSSN,SGender, SPhoneType, SPhoneNum);
	 
	  }*/
	 

	@Then("^Enters Spouse contact details as in Waepa \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_Spouse_contact_details_as(String Sgender, String SHeight, String SWeight, String SPhoneType,
			String SPhoneNum) throws Throwable {
		contact.enters_contact_Details_for_Spouse_as_without_SSN(Sgender, SHeight, SWeight, SPhoneType, SPhoneNum);
	}

	// WAEPA
	@Then("^Enter Contact Details for self for Child only policy as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_contact_Details_for_self_for_Child_only_policy_as(String SSN, String Mstatus, String Gender,
			String Street, String City, String Zip) throws Throwable {
		contact.enter_contact_details_for_self_for_Child_only_policy_as(SSN, Mstatus, Gender, Street, City, Zip);
	}

/*	@Then("^Answer all other questions as No for Spouse$")
	public void answer_all_other_questions_as_No_for_Spouse() throws Throwable {
		contact.answer_all_other_questions_as_No_for_Spouse();
	}*/

	@Then("^Answer for Outside the US or Canada in the next twelve months for Spouse$")
	public void answer_for_Outside_the_US_or_Canada_in_the_next_twelve_months_for_Spouse() throws Throwable {
		contact.answer_for_Outside_the_US_or_Canada_in_the_next_twelve_months_for_Spouse();
	}

	@Then("^Answer all other questions of Spouse as No for Nicotin and Outside US Twelve$")
	public void answer_all_other_questions_of_Spouse_as_No_for_Nicotin_and_Outside_US_Twelve() throws Throwable {
		contact.answer_all_other_questions_of_Spouse_as_No_for_Nicotin_and_Outside_US_Twelve();
	}

	@Then("^Enters contact Details for Self without MemberShipID as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_contact_Details_for_Self_without_MemberShipID_as(String SocialSecurityNo, String MaritalStatus,String Height, String Weight, String Gender, String Address, String City, String Zip) throws Throwable {
		contact.enters_contact_Details_for_Self_without_MemberShipID_as(SocialSecurityNo, MaritalStatus, Height, Weight,
				Gender, Address, City, Zip);
	}
	
//	@Then("^Enters contact Details for Self without MemberShipID as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
//	public void enters_contact_Details_for_Self_without_MemberShipID_as(String SocialSecurityNo, String MaritalStatus, String Height, 
//			String Weight, String Gender, String Address, String City, String Zip, String arg9) throws Throwable {
//		contact.enters_contact_Details_for_Self_without_MemberShipID_as(SocialSecurityNo, MaritalStatus, Height, Weight,
//				Gender, Address, City, Zip);
//	}
	
		
	@Then("^Enters contact Details for Self without MemberShipID,Mstatus as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_contact_Details_for_Self_without_MemberShipID_Mstatus_as(String SocialSecurityNo, String Height,
			String Weight, String Gender, String Address, String City, String Zip) throws Throwable {
		contact.enters_contact_Details_for_Self_without_MemberShipID_Mstatus_as(SocialSecurityNo, Height, Weight,
				Gender, Address, City, Zip);
	}

	@Then("^Validate the Travel Question for Non QD application for Self$")
	public void validate_the_Travel_Question_for_Non_QD_application_for_Self() throws Throwable {
		contact.validate_the_Travel_Question_for_Non_QD_application_for_Self();
	}

	@Then("^Validate the Travel Question for Non QD application for Spouse$")
	public void validate_the_Travel_Question_for_Non_QD_application_for_Spouse() throws Throwable {
		contact.validate_the_Travel_Question_for_Non_QD_application_for_Spouse();
	}

	@Then("^Selects Yes for Travel Question Non QD for Self$")
	public void selects_Yes_for_Travel_Question_Non_QD_for_Self() throws Throwable {
		contact.selects_Yes_for_Travel_Question_Non_QD_for_Self();
	}

	@Then("^Selects No for Travel Question Non QD for Self$")
	public void selects_No_for_Travel_Question_Non_QD_for_Self() throws Throwable {
		contact.selects_No_for_Travel_Question_Non_QD_for_Self();
	}

	@Then("^Selects Yes for Travel Question Non QD for Spouse$")
	public void selects_Yes_for_Travel_Question_Non_QD_for_Spouse() throws Throwable {
		contact.selects_Yes_for_Travel_Question_Non_QD_for_Spouse();
	}

	@Then("^Selects No for Travel Question Non QD for Spouse$")
	public void selects_No_for_Travel_Question_Non_QD_for_Spouse() throws Throwable {
		contact.selects_No_for_Travel_Question_Non_QD_for_Spouse();
	}

	@Then("^Enters details for Spouse as \"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_details_for_Spouse_as(String Country, String Month) throws Throwable {
		contact.enters_details_for_Spouse_as(Country, Month);
	}

	@Then("^Validates the Travel Question for QD application$")
	public void validates_the_Travel_Question_for_QD_application() throws Throwable {
		contact.validates_the_Travel_Question_for_QD_application();
	}

	@Then("^Validates the Travel Question for QD application for Spouse$")
	public void validates_the_Travel_Question_for_QD_application_for_Spouse() throws Throwable {
		contact.validates_the_Travel_Question_for_QD_application_for_Spouse();
	}

	@Then("^Selects Yes for Travel Question QD for Self$")
	public void selects_Yes_for_Travel_Question_QD_for_Self() throws Throwable {
		contact.selects_Yes_for_Travel_Question_QD_for_Self();
	}

	@Then("^Selects Yes for Travel Question QD for Spouse$")
	public void selects_Yes_for_Travel_Question_QD_for_Spouse() throws Throwable {
		contact.selects_Yes_for_Travel_Question_QD_for_Spouse();
	}

	@Then("^Enters details for Travel Question QD for spouse as \"([^\"]*)\"$")
	public void selects_Yes_for_Travel_Question_QD_and_Enters_details_as_Spouse(String Country) throws Throwable {
		contact.selects_Yes_for_Travel_Question_QD_and_Enters_details_as_Spouse(Country);
	}

	@Then("^Enters details for Travel Question QD for Self as \"([^\"]*)\"$")
	public void selects_Yes_for_Travel_Question_QD_and_Enters_details_as_Self(String Country) throws Throwable {
		contact.selects_Yes_for_Travel_Question_QD_and_Enters_details_as_Self(Country);
	}

	@Then("^Selects No for Travel Question QD for Self$")
	public void selects_No_for_Travel_Question_QD_for_Self() throws Throwable {
		contact.select_No_for_Travel_Question_SixMonths_for_Self();
	}

	@Then("^Validates Membership ID Required Message$")
	public void validates_Membership_ID_Required_Message() throws Throwable {
		contact.validates_Membership_ID_Required_Message();
	}

	@Then("^Enters Membership ID as \"([^\"]*)\" for Self$")
	public void enters_Membership_ID_as_for_Self(String MembershipId) throws Throwable {
		contact.enters_Membership_ID_as_for_Self(MembershipId);
	}

	@Then("^Enters Membership ID as \"([^\"]*)\" for Spouse$")
	public void enters_Membership_ID_as_for_Spouse(String MembershipId) throws Throwable {
		contact.enters_MembershipID_for_Spouse_as(MembershipId);
	}
	@Then("^Validates SSN Required Error Message for Self$")
	public void validates_SSN_Required_Message_for_Self() throws Throwable {
		contact.validates_SSN_Required_Message_for_Self();
	}

	@Then("^Validates SSN Required Error Message for Spouse$")
	public void validates_SSN_Required_Message_for_Spouse() throws Throwable {
		contact.validates_SSN_Required_Message_for_Spouse();
	}

	@Then("^Enters SSN as \"([^\"]*)\" for Spouse$")
	public void enters_SSN_as_for_Spouse(String SSN) throws Throwable {
		contact.enters_SSN_as_for_Spouse(SSN);
	}

	@Then("^Enter optional SSN \"([^\"]*)\" for Spouse$")
	public void enters_optional_SSN_for_Spouse(String SocialSecurityNo) throws Throwable {
		contact.enters_Optional_Ssn_for_Spouse(SocialSecurityNo);
	}
	 
	@Then("^Enters Last Used Tobacco Date Details for Self as \"([^\"]*)\"$")
	public void enters_Last_Used_Tobacco_Date_Details_for_Self_as(String date) throws Throwable {
		contact.enters_Last_Used_Tobacco_Date_Details_for_Self_as(date);
	}

	@Then("^Validate Tobacco Question for Spouse$")
	public void validate_Tobacco_Question_for_Spouse() throws Throwable {
		contact.validate_Tobacco_Question_for_Spouse();
	}

//AAFP-Contact Page


	@Then("^Clicks on Products used textbox for Self and Selects Product as \"([^\"]*)\"$")
	public void clicks_on_Products_used_textbox_for_Self_and_Selects_Product_as(String product) throws Throwable {
		contact.clicks_on_Products_used_textbox_for_Self_and_Selects_Product_as(product);
	}

	@Then("^Enters WeightTwelveMonths ago details for Self as \"([^\"]*)\"$")
	public void enters_WeightTwelveMonths_ago_details_for_Self_as(String Weight12mnths) throws Throwable {
		contact.enters_WeightTwelveMonths_ago_details_for_Self_as(Weight12mnths);
	}

	@Then("^Select DrivingLicense Question as Yes and Enters details for driving info for Self as \"([^\"]*)\",\"([^\"]*)\"$")
	public void select_DrivingLicense_Question_as_Yes_and_Enters_details_for_Self_as(String DrivingLicenseNo,
			String DrivingLicenseState) throws Throwable {
		contact.select_DrivingLicense_Question_as_Yes_and_Enters_details_for_Self_as(DrivingLicenseNo,
				DrivingLicenseState);
	}

	@Then("^Select DrivingLicense Question as Yes and Enters details for Spouse as \"([^\"]*)\",\"([^\"]*)\"$")
	public void select_DrivingLicense_Question_as_Yes_and_Enters_details_for_Spouse_as(String DrivingLicenseNo,
			String DrivingLicenseState) throws Throwable {
		contact.select_DrivingLicense_Question_as_Yes_and_Enters_details_for_Spouse_as(DrivingLicenseNo,
				DrivingLicenseState);
	}

	@Then("^Selects Yes for Travel Question-TwelveMonths and Enters details for Self as \"([^\"]*)\", \"([^\"]*)\"$")
	public void selects_Yes_for_Travel_Question_TwelveMonths_and_Enters_details_for_Self_as(String Country,
			String Months) throws Throwable {
		contact.selects_Yes_for_Travel_Question_Non_QD_for_Self();
		contact.enter_details_for_Outside_US_country_and_How_Long_months_for_Self_as(Country, Months);
	}
	
	@Then("^Enters Account Number as \"([^\"]*)\"$")
	public void enters_Account_Number_as(String AcctNo) throws Throwable {
		contact.enter_current_Account_NO_for_Self_as(AcctNo);
	}

	@Then("^Select No for Travel Question-SixMonths for Self$")
	public void select_No_for_Travel_Question_SixMonths_for_Self() throws Throwable {
		contact.select_No_for_Travel_Question_SixMonths_for_Self();
	}

	@Then("^Select DrivingLicense Question as No for Spouse$")
	public void select_DrivingLicense_Question_as_No_for_Spouse() throws Throwable {
		contact.select_DrivingLicense_Question_as_No_for_Spouse();
	}

	@Then("^Selects No for Travel Question-TwelveMonths for Spouse$")
	public void selects_No_for_Travel_Question_TwelveMonths_for_Spouse() throws Throwable {
		contact.selects_No_for_Travel_Question_TwelveMonths_for_Spouse();
	}

	@Then("^Select No for Travel Question-SixMonths for Spouse$")
	public void select_No_for_Travel_Question_SixMonths_for_Spouse() throws Throwable {
		contact.select_No_for_Travel_Question_SixMonths_for_Spouse();
	}

	@Then("^Selects Business Address Radio Button for Send Correspondence To$")
	public void selects_Business_Address_Radio_Button_for_Send_Correspondence_To() throws Throwable {
		contact.selects_Business_Address_Radio_Button_for_Send_Correspondence_To();
	}

	@Then("^Selects Yes Radio button for Tobacco Question for Spouse$")
	public void selects_Yes_Radio_button_for_Tobacco_Question_for_Spouse() throws Throwable {
		contact.selects_Yes_Radio_button_for_Tobacco_Question_for_Spouse();
	}

	@Then("^Validates Last Used Date Textbox and Specify the products used Textbox is displayed for Spouse$")
	public void validates_Last_Used_Date_Textbox_and_Specify_the_products_used_Textbox_is_displayed_for_Spouse()
			throws Throwable {
		contact.validates_Last_Used_Date_Textbox_and_Specify_the_products_used_Textbox_is_displayed_for_Spouse();
	}
	
	@Then("^Validates How Long Used Text box and Last Used Date Textbox is displayed for Self$")
	public void validates_How_Long_Used_and_Last_Used_Date_Textbox_is_displayed_for_Self()throws Throwable {
		contact.validates_How_Long_Used_and_Last_Used_Date_Textbox_is_displayed_for_Self();
	}
	
	@Then("^Validates How Long Used Text box and Last Used Date Textbox is displayed for Spouse$")
	public void validates_How_Long_Used_and_Last_Used_Date_Textbox_is_displayed_for_Spouse()throws Throwable {
		contact.validates_How_Long_Used_and_Last_Used_Date_Textbox_is_displayed_for_Spouse();
	}
	
	@Then("^Enters Last Used Tobacco or Nicotine Date Details for Self as \"([^\"]*)\"$")
	public void enters_Last_Used_Nicotine_Date_Details_for_Self_as(String date) throws Throwable {
		contact.enters_Last_Used_Nicotine_Date_Details_for_Self_as(date);
	}
	
	@Then("^Enters How Long used Details for self as \"([^\"]*)\"$")
	public void enters_How_Long_Used_details_for_Self_as(String years)throws Throwable{
		contact.enters_How_Long_Used_details_for_Self_as(years);
	}

	@Then("^Enters Last Used Tobacco Date Details for Spouse as \"([^\"]*)\"$")
	public void enters_Last_Used_Tobacco_Date_Details_for_Spouse_as(String date) throws Throwable {
		contact.enters_Last_Used_Tobacco_Date_Details_for_Spouse_as(date);
	}
	
	@Then("^Enters How Long used Details for spouse as \"([^\"]*)\"$")
	public void enters_How_Long_Used_details_for_Spouse_as(String years)throws Throwable{
		contact.enters_How_Long_Used_details_for_Spouse_as(years);
	}

	@Then("^Enters Last Used Tobacco or Nicotine Date Details for Spouse as \"([^\"]*)\"$")
	public void enters_Last_Used_Nicotine_Date_Details_for_Spouse_as(String date) throws Throwable {
		contact.enters_Last_Used_Nicotine_Date_Details_for_Spouse_as(date);
	}

	@Then("^Clicks on Products used textbox for Spouse and Selects Product as \"([^\"]*)\"$")
	public void clicks_on_Products_used_textbox_for_Spouse_and_Selects_Product_as(String product) throws Throwable {
		contact.clicks_on_Products_used_textbox_for_Spouse_and_Selects_Product_as(product);
	}

	@Then("^Selects Frequency as \"([^\"]*)\" at contact page$")
	public void selects_Frequency_as_at_contact_page(String PaymentFrequency) throws Throwable {
		contact.selects_Frequency_as_at_contact_page(PaymentFrequency);
	}

	@Then("^Selects \"([^\"]*)\" and enter phonenumber \"([^\"]*)\" for Self at contact page$")
	public void selects_and_enter_phonenumber_for_Self_at_contact_page(String phoneType, String phoneNum)
			throws Throwable {
		contact.selects_and_enter_phonenumber_for_Self_at_contact_page(phoneType, phoneNum);
	}

	@Then("^Validate \"([^\"]*)\" is not displayed in Marital Status Drop Down$")
	public void validate_is_not_displayed_in_Marital_Status_Drop_Down(String mstatus) throws Throwable {
		contact.validate_is_not_displayed_in_Marital_Status_Drop_Down(mstatus);
	}

	@Then("^Validate Tobacco Question$")
	public void validate_Tobacco_Question() throws Throwable {
		contact.validate_Tobacco_Question();
	}

	@Then("^Enters Stockowned Percentage as \"([^\"]*)\" in self$")
	public void enter_StockOwned_for_Self(String stockOwned) throws Throwable {
		contact.enter_StockOwned_for_Self(stockOwned);
	}

	@Then("^Verify mandatory field present Stock Owned$")
	public void validate_Mandatory_field_StockOwned_Displayed_for_Self() throws Throwable {
		contact.validate_Mandatory_field_StockOwned_Displayed_for_Self();
	}

	@Then("^Validates that SSN is optional for Spouse$")
	public void validate_SSN_Optional_Spouse() throws Throwable {
		contact.validate_SSN_Optional_Spouse();
	}
	@Then("^Verify Tobacco Question is Unavailable for Self$")
	public void validate_Tobacco_Question_is_unavailable() throws Throwable {
		contact.validate_Tobacco_Question_is_not_displayed();
	}
	
	@Then("^Clicks on Continue Button$")
	public void clicks_Continue_button() throws Throwable{
		contact.clicks_Continue_button();
	}
	
	@Then("^Contact Details is displayed to user and enters contact Details for self \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_Contact_details_for_Self_as(String title, String Fname, String Lname) throws Throwable {
		contact.enter_Contact_details_for_Self_as(title, Fname, Lname);
	}
	
	@Then("^Selects NO Radio button for smoker question$")
	public void select_NO_Radio_button_for_Smoker() throws Throwable {
		contact.select_NO_Radio_button_for_Smoker();
	}
	
	@Then("^Selects YES Radio button for smoker question$")
	public void select_YES_Radio_button_for_Smoker() throws Throwable {
		contact.select_YES_Radio_button_for_Smoker();
	}
	
	@Then("^verify Semiannual rate \"([^\"]*)\"$")
	public void verify_Semiannual_rate(String rate)throws Throwable {
		contact.verify_Semiannual_rate(rate);
	}
	
	@Then("^Applicant Details Page is displayed to user$")
	public void applicant_details_page_are_displayed_to_user() throws Throwable{
		contact.applicant_details_page_are_displayed_to_user();
	}
	
	@Then("^Enters Height and Weight for Self as \"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_Height_and_Weight_for_Self_as(String Height, String Weight) throws Throwable {
		contact.enters_Height_and_Weight_for_Self_as(Height, Weight);
	}

	@Then("^Enters Height and Weight for Spouse as \"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_Height_and_Weight_for_Spouse_as(String Height, String Weight) throws Throwable {
		contact.enters_Height_and_Weight_for_Spouse_as(Height, Weight);
	}

	// *************************************Preview*****************************************//
	@Then("^User scroll to next in preview page$")
	public void user_scroll_to_next_in_preview_page() throws Throwable {
		Preview.user_scroll_to_next_in_preview_page();

	}

	@Then("^Application Summary Page is displayed to user$")
	public void application_Summary_Page_is_displayed_to_user() throws Throwable {

		Preview.application_Summary_Page_is_displayed_to_user();

	}

	@Then("^Application Preview Page is displayed to user$")
	public void application_Preview_Page_is_displayed_to_user() throws Throwable {
		Preview.application_Preview_Page_is_displayed_to_user();
	}

	@Then("^verify that the Chronic Illness Rider is rendered on screen as Yes$")
	public void verify_that_the_Chronic_Illness_Rider_is_rendered_on_screen_as_Yes() throws Throwable {
		Preview.verify_that_the_Chronic_Illness_Rider_is_rendered_on_screen_as_Yes();
	}

	// WAEPA
	@Then("^Verify that the coverage amount for Self is \"([^\"]*)\"$")
	public void verify_that_the_coverage_amount_for_Self_is(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_TermLife_ARTL_FiveYTL(Benefit);
	}

	@Then("^Save Information page will be displayed to user and user will enter Login details as \"([^\"]*)\",\"([^\"]*)\"$")
	public void save_Information_page_will_be_displayed_to_user_and_user_will_enter_Login_details_as(String Password,
			String VPassword) throws Throwable {

		Preview.save_Information_page_will_be_displayed_to_user_and_user_will_enter_Login_details_as(Password,
				VPassword);
	}

	@Then("^Validates that the Child benefit amount for Group Term Product is disabled and selected as \"([^\"]*)\"$")
	public void validates_that_the_Child_benefit_amount_for_Group_Term_Product_is_disabled_and_selected_as(
			String Cbenefit) throws Throwable {
		CoveragePage.validates_that_the_Child_benefit_amount_for_Group_Term_Product_is_disabled_and_selected_as(Cbenefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under AD&D under TermLife$")
	public void verify_Benefit_Amount_for_Self_as_under_ADD_under_TermLife(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_ADnDRider_under_ARTL(Benefit);
	}
	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under AD&D under ARTL$")
	public void verify_Benefit_Amount_for_Self_as_under_ADD_under_ARTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_ADnDRider_under_ARTL(Benefit);
	}

	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under AD&D under ARTL$")
	public void verify_Benefit_Amount_for_Spouse_as_under_ADD_under_ARTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_ADDRider_under_ARTL(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under FifteenYTL$")
	public void verify_Benefit_Amount_for_Self_as_under_FifteenYTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_FifteenYTL(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under TermLife$")
	public void verify_Benefit_Amount_for_Self_as_under_TermLife(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_TermLife_ARTL_FiveYTL(Benefit);
	}
	
	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under GTLI$")
	public void verify_Benefit_Amount_for_Self_as_under_GTLI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_TermLife_ARTL_FiveYTL(Benefit);
	}
	
	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under GTTLI$")
	public void verify_Benefit_Amount_for_Self_as_under_GTTLI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_TermLife_ARTL_FiveYTL(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under ARTL$")
	public void verify_Benefit_Amount_for_Self_as_under_ARTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_TermLife_ARTL_FiveYTL(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under FiveYTL$")
	public void verify_Benefit_Amount_for_Self_as_under_FiveYTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_TermLife_ARTL_FiveYTL(Benefit);
	}
	
	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under Group Term LI$")
	public void verify_Benefit_Amount_for_Self_as_under_Group_Term_LI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_TermLife_ARTL_FiveYTL(Benefit);
	}
	
	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under LifeNinetyFive$")
	public void verify_Benefit_Amount_for_Self_as_under_LifeNinetyFive(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_LifeTo95(Benefit);
	}

	@Then("^Verify CIR portion for Self as \"([^\"]*)\" under TermLife$")
	public void verify_CIR_portion_for_Self_as_under_TermLife(String Benefit) throws Throwable {
		Preview.verify_CIR_portion_for_Self_as_under_TermLife(Benefit);
	}
	
	@Then("^Verify CIR portion for Self as \"([^\"]*)\" under GTTLI$")
	public void verify_CIR_portion_for_Self_as_under_GTTLI(String Benefit) throws Throwable {
		Preview.verify_CIR_portion_for_Self_as_under_TermLife(Benefit);
	}

	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under TermLife$")
	public void verify_Benefit_Amount_for_Spouse_as_under_TermLife(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_TermLife_ARTL_FiveYTL(Benefit);
	}
	
	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under GTLI$")
	public void verify_Benefit_Amount_for_Spouse_as_under_GTLI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_TermLife_ARTL_FiveYTL(Benefit);
	}
	
	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under GTTLI$")
	public void verify_Benefit_Amount_for_Spouse_as_under_GTTLI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_TermLife_ARTL_FiveYTL(Benefit);
	}

	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under FiveYTL$")
	public void verify_Benefit_Amount_for_Spouse_as_under_FiveYTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_TermLife_ARTL_FiveYTL(Benefit);
	}

	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under ARTL$")
	public void verify_Benefit_Amount_for_Spouse_as_under_ARTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_TermLife_ARTL_FiveYTL(Benefit);
	}

	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under AOD$")
	public void verify_Benefit_Amount_for_Spouse_as_under_AOD(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_ADDI(Benefit);
	}
	
	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under GADD$")
	public void verify_Benefit_Amount_for_Spouse_as_under_GADD(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_ADDI(Benefit);
	}

	@Then("^Verify CIR portion for Spouse as \"([^\"]*)\" under TermLife$")
	public void verify_CIR_portion_for_Spouse_as_under_TermLife(String Benefit) throws Throwable {
		Preview.verify_CIR_portion_for_Spouse_as_under_TermLife(Benefit);
	}
	
	@Then("^Verify CIR portion for Spouse as \"([^\"]*)\" under GTTLI$")
	public void verify_CIR_portion_for_Spouse_as_under_GTTLI(String Benefit) throws Throwable {
		Preview.verify_CIR_portion_for_Spouse_as_under_TermLife(Benefit);
	}

	@Then("^Verify Benefit Amount for Child as \"([^\"]*)\" under TermLife$")
	public void verify_Benefit_Amount_for_Child_as_under_TermLife(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Child_as_under_TermLife_FiveYTL_ARTL(Benefit);
	}
	
	@Then("^Verify Benefit Amount for Child as \"([^\"]*)\" under Group Term LI$")
	public void verify_Benefit_Amount_for_Child_as_under_Group_Term_LI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Child_as_under_TermLife_FiveYTL_ARTL(Benefit);
	}

	@Then("^Verify Benefit Amount for Child as \"([^\"]*)\" under FiveYTL$")
	public void verify_Benefit_Amount_for_Child_as_under_FiveYTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Child_as_under_TermLife_FiveYTL_ARTL(Benefit);
	}

	@Then("^Verify Benefit Amount for Child as \"([^\"]*)\" under ARTL$")
	public void verify_Benefit_Amount_for_Child_as_under_ARTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Child_as_under_TermLife_FiveYTL_ARTL(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under TenYTL$")
	public void verify_Benefit_Amount_for_Self_as_under_TenYTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_TenYTL(Benefit);
	}

	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under TenYTL$")
	public void verify_Benefit_Amount_for_Spouse_as_under_TenYTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_TenYTL(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under GTenYTL$")
	public void verify_Benefit_Amount_for_Self_as_under_GTenYTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_TenYTL(Benefit);
	}
	
	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under GTenYTL$")
	public void verify_Benefit_Amount_for_Spouse_as_under_GTenYTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_TenYTL(Benefit);
	}
	
	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under Flex10$")
	public void verify_Benefit_Amount_for_Self_as_under_Flex10(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_TenYTL(Benefit);
	}

	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under Flex10$")
	public void verify_Benefit_Amount_for_Spouse_as_under_Flex10(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_TenYTL(Benefit);
	}
	
	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under TwentyYTL$")
	public void verify_Benefit_Amount_for_Self_as_under_TwentyYTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_TwentyYTL(Benefit);
	}
	
	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under Flex20$")
	public void verify_Benefit_Amount_for_Self_as_under_Flex20(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_TwentyYTL(Benefit);
	}
	
	@Then("^Verify Riders Accidental Death & Dismemberment for Self as \"([^\"]*)\" under GTLP75I$")
	public void verify_Benefit_Amount_for_Self_as_under_ADD_Under_GTLP75I(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_ADD_Under_GTLP75I(Benefit);
	}
	
	@Then("^Verify Riders Accidental Death & Dismemberment for Self as \"([^\"]*)\" under Flex10$")
	public void verify_Benefit_Amount_for_Self_as_under_ADD_Under_Flex10(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_ADD_Under_Flex10(Benefit);
	}
	
	@Then("^Verify Riders Accidental Death & Dismemberment for Self as \"([^\"]*)\" under Flex20$")
	public void verify_Benefit_Amount_for_Self_as_under_ADD_Under_Flex20(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_ADD_Under_Flex20(Benefit);
	}
	
	@Then("^Verify Riders Accidental Death & Dismemberment for Spouse as \"([^\"]*)\" under GTLP75I$")
	public void verify_Benefit_Amount_for_Spouse_as_under_ADD_Under_GTLP75I(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_ADD_Under_GTLP75I(Benefit);
	}
	
	@Then("^Verify Riders Accidental Death & Dismemberment for Spouse as \"([^\"]*)\" under Flex10$")
	public void verify_Benefit_Amount_for_Spouse_as_under_ADD_Under_Flex10(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_ADD_Under_Flex10(Benefit);
	}
	
	@Then("^Verify Riders Accidental Death & Dismemberment for Spouse as \"([^\"]*)\" under Flex20$")
	public void verify_Benefit_Amount_for_Spouse_as_under_ADD_Under_Flex20(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_ADD_Under_Flex20(Benefit);
	}
	
	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under GTwentyYTL$")
	public void verify_Benefit_Amount_for_Self_as_under_GTwentyYTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_TwentyYTL(Benefit);
	}

	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under TwentyYTL$")
	public void verify_Benefit_Amount_for_Spouse_as_under_TwentyYTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_TwentyYTL(Benefit);
	}
	
	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under Flex20$")
	public void verify_Benefit_Amount_for_Spouse_as_under_Flex20(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_TwentyYTL(Benefit);
	}
	
	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under GTwentyYTL$")
	public void verify_Benefit_Amount_for_Spouse_as_under_GTwentyYTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_TwentyYTL(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under HLDD$")
	public void verify_Benefit_Amount_for_Self_as_under_HLDD(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_HLDD(Benefit);
	}

	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under HLDD$")
	public void verify_Benefit_Amount_for_Spouse_as_under_HLDD(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_HLDD(Benefit);
	}

	@Then("^Verify Benefit Amount for Child as \"([^\"]*)\" under HLDD$")
	public void verify_Benefit_Amount_for_Child_as_under_HLDD(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Child_as_under_HLDD(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under DII$")
	public void verify_Monthly_Benefit_Amount_for_Self_as_under_DII(String Benefit) throws Throwable {
		Preview.verify_Monthly_Benefit_Amount_for_Self_as_under_DII(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under DIP$")
	public void verify_Monthly_Benefit_Amount_for_Self_as_under_DIP(String Benefit) throws Throwable {
		Preview.verify_Monthly_Benefit_Amount_for_Self_as_under_DII(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under GDII$")
	public void verify_Monthly_Benefit_Amount_for_Self_as_under_GDII(String Benefit) throws Throwable {
		Preview.verify_Monthly_Benefit_Amount_for_Self_as_under_DII(Benefit);
	}
	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under DII$")
	public void verify_Monthly_Benefit_Amount_for_Spouse_as_under_DII(String Benefit) throws Throwable {
		Preview.verify_Monthly_Benefit_Amount_for_Spouse_as_under_DII(Benefit);
	}

	@Then("^Verify Benefit Option for Self as \"([^\"]*)\" under DII_Five Year Plan$")
	public void verify_Benefit_Option_for_Self_as_under_DII(String Option) throws Throwable {
		Preview.verify_Benefit_Option_for_Self_as_under_DII_FiveYear_Plan(Option);
	}

	@Then("^Verify Benefit Option for Self as \"([^\"]*)\" under DII Plan Age65$")
	public void verify_Benefit_Option_for_Self_as_under_DII_Plan(String Option) throws Throwable {
		Preview.verify_Benefit_Option_for_Self_as_under_DII_Plan_Age65(Option);
	}

	@Then("^Verify Maximum Daily Benefit Amount for Self as \"([^\"]*)\" under HII$")
	public void verify_Maximum_Daily_Benefit_Amount_for_Self_as_under_HII(String Benefit) throws Throwable {
		Preview.verify_Maximum_Daily_Benefit_Amount_for_Self_as_under_HII(Benefit);
	}

	@Then("^Verify Maximum Daily Benefit Amount for Spouse as \"([^\"]*)\" under HII$")
	public void verify_Maximum_Daily_Benefit_Amount_for_Spouse_as_under_HII(String Benefit) throws Throwable {
		Preview.verify_Maximum_Daily_Benefit_Amount_for_Spouse_as_under_HII(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under ADDI$")
	public void verify_Benefit_Amount_for_Self_as_under_ADDI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_ADnDRider_under_ARTL(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under AOD$")
	public void verify_Benefit_Amount_for_Self_as_under_AOD(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_ADDI(Benefit);
	}
	
	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under GADD$")
	public void verify_Benefit_Amount_for_Self_as_under_GADD(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_ADDI(Benefit);
	}

	//GEOCARE
	@Then("^Verify Benefit Amount for \"([^\"]*)\" as \"([^\"]*)\" for product \"([^\"]*)\" under \"([^\"]*)\"$")
	public void verify_Benefit_Amount_for_as_for_product_under(String Type, String Benefit, String product, String UnderProduct) throws Throwable {
	    Preview.verify_Benefit_Amount_for_as_for_product_under(Type, Benefit, product, UnderProduct);
	}
	
	//************
	

	// TIE - Copy a method for ADDI separate steps
	@Then("^Verify Benefit Amount for Child as \"([^\"]*)\" under ADDI$")
	public void verify_Benefit_Amount_for_Child_as_under_ADDI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Child_as_under_ADDI(Benefit);
	}

	@Then("^Verify Benefit Amount for Child as \"([^\"]*)\" under HMI$")
	public void verify_Benefit_Amount_for_Child_as_under_HMI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_child_as_under_HII(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under LTD$")
	public void verify_Benefit_Amount_for_Self_as_under_LTD(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_LTD(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under LTDP$")
	public void verify_Benefit_Amount_for_Self_as_under_LTDP(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_LTDP(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under MTDI$")
	public void verify_Benefit_Amount_for_Self_as_under_MTDI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_MTDI(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under RDI$")
	public void verify_Benefit_Amount_for_Self_as_under_RDI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_RDI(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under POEDI$")
	public void verify_Benefit_Amount_for_Self_as_under_POEDI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_POEDI(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under CI$")
	public void verify_Benefit_Amount_for_Self_as_under_CI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_CI(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under HMI$")
	public void verify_Benefit_Amount_for_Self_as_under_HMI(String Benefit) throws Throwable {
		Preview.verify_Maximum_Daily_Benefit_Amount_for_Self_as_under_HII(Benefit);
	}
	
	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under GHII$")
	public void verify_Benefit_Amount_for_Self_as_under_GHII(String Benefit) throws Throwable {
		Preview.verify_Maximum_Daily_Benefit_Amount_for_Self_as_under_HII(Benefit);
	}

	@Then("^Verify Rider FPO Rider Benefit Amount for Self as \"([^\"]*)\" under LTD$")
	public void verify_Rider_FPO_Rider_Benefit_Amount_for_Self_as_under_LTD(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_for_FPO_under_LTD(Benefit);
	}
	
	@Then("^Verify Rider FPO Rider Benefit Amount for Self as \"([^\"]*)\" under GDIILT$")
	public void verify_Rider_FPO_Rider_Benefit_Amount_for_Self_as_under_GDIILT(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_for_FPO_under_LTD(Benefit);
	}

	@Then("^Verify Cost of Living Adjustment Rider under LTD$")
	public void verify_Cost_of_Living_Adjustment_Rider_under_LTD() throws Throwable {
		Preview.verify_Cost_of_Living_Adjustment_Rider_under_LTD();
	}
	
	@Then("^Verify Cost of Living Adjustment Rider under GDIILT$")
	public void verify_Cost_of_Living_Adjustment_Rider_under_GDIILT() throws Throwable {
		Preview.verify_Cost_of_Living_Adjustment_Rider_under_LTD();
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under STD$")
	public void verify_Benefit_Amount_for_Self_as_under_STD(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_STD(Benefit);
	}
	
	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under GDIIST$")
	public void verify_Benefit_Amount_for_Self_as_under_GDIIST(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_STD(Benefit);
	}
	
	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under GOOEI$")
	public void verify_Benefit_Amount_for_Self_as_under_GOOEI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_OOEDI(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under GPOEI$")
	public void verify_Benefit_Amount_for_Self_as_under_GPOEI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_OOEDI(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under OOEDI$")
	public void verify_Benefit_Amount_for_Self_as_under_OOEDI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_OOEDI(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under BOE$")
	public void verify_Benefit_Amount_for_Self_as_under_BOE(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_OOEDI(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under SDI$")
	public void verify_Benefit_Amount_for_Self_as_under_SDI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_SDI(Benefit);
	}

	@Then("^Verify FPO Rider Benefit Amount for Self as \"([^\"]*)\" under SDI$")
	public void verify_FPO_Rider_Benefit_Amount_for_Self_as_under_SDI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_for_FPO_under_SDI(Benefit);
	}

	@Then("^Verify Cost of Living Adjustment Rider under SDI$")
	public void verify_Cost_of_Living_Adjustment_Rider_under_SDI() throws Throwable {
		Preview.verify_Cost_of_Living_Adjustment_Rider_under_SDI();
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under HII$")
	public void verify_Benefit_Amount_for_Self_as_under_HII(String Benefit) throws Throwable {
		Preview.verify_Maximum_Daily_Benefit_Amount_for_Self_as_under_HII(Benefit);
	}

	
	// TIE - Copy a method for ADDI separate steps
	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under ADDI$")
	public void verify_Benefit_Amount_for_Spouse_as_under_ADDI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_ADDI(Benefit);
	}

	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under FifteenYTL$")
	public void verify_Benefit_Amount_for_Spouse_as_under_FifteenYTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_FifteenYTL(Benefit);
	}

	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under LTD$")
	public void verify_Benefit_Amount_for_Spouse_as_under_LTD(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_LTD(Benefit);
	}

	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under LTDP$")
	public void verify_Benefit_Amount_for_Spouse_as_under_LTDP(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_LTDP(Benefit);
	}

	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under MTDI$")
	public void verify_Benefit_Amount_for_Spouse_as_under_MTDI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_MTDI(Benefit);
	}

	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under CI$")
	public void verify_Benefit_Amount_for_Spouse_as_under_CI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_CI(Benefit);
	}

	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under HMI$")
	public void verify_Benefit_Amount_for_Spouse_as_under_HMI(String Benefit) throws Throwable {
		Preview.verify_Maximum_Daily_Benefit_Amount_for_Spouse_as_under_HII(Benefit);
	}

	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under HII$")
	public void verify_Benefit_Amount_for_Spouse_as_under_HII(String Benefit) throws Throwable {
		Preview.verify_Maximum_Daily_Benefit_Amount_for_Spouse_as_under_HII(Benefit);
	}

	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under GHII$")
	public void verify_Benefit_Amount_for_Spouse_as_under_GHII(String Benefit) throws Throwable {
		Preview.verify_Maximum_Daily_Benefit_Amount_for_Spouse_as_under_HII(Benefit);
	}
	@Then("^Verify Benefit Amount for child as \"([^\"]*)\" under HII$")
	public void verify_Benefit_Amount_for_Child_as_under_HII(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_child_as_under_HII(Benefit);
	}
	
	@Then("^Verify Benefit Amount for Child as \"([^\"]*)\" under GHII$")
	public void verify_Benefit_Amount_for_Child_as_under_GHII(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_child_as_under_HII(Benefit);
	}


	@Then("^Verify Benefit Amount for Child as \"([^\"]*)\" under GTLI$")
	public void verify_Benefit_Amount_for_Child_as_under_GTLI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Child_as_under_TermLife_FiveYTL_ARTL(Benefit);
	}
	@Then("^Verify Child name as \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_Child_name_as(String fname, String lname) throws Throwable {
		Preview.verify_Child_name_at_summary_page_as(fname, lname);
	}

	@Then("^Verify Benefit Amount for child as \"([^\"]*)\" under TenYTL$")
	public void verify_Benefit_Amount_for_child_as_under_TenYTL( String amount) throws Throwable {
		Preview.verify_Benefit_Amount_for_child_as_under_TenYTL(amount);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under Group Term$")
	public void verify_Benefit_Amount_for_Self_as_under_Group_Term(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_TermLife_ARTL_FiveYTL(Benefit);
	}

	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under Group Term$")
	public void verify_Benefit_Amount_for_Spouse_as_under_Group_Term(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_TermLife_ARTL_FiveYTL(Benefit);
	}

	@Then("^Verify Riders portion for Self amount as \"([^\"]*)\" under DII$")
	public void verify_Riders_portion_for_Self_amount_as_under_DII(String Benefit) throws Throwable {
		Preview.verify_Riders_portion_for_Self_amount_as_under_DII(Benefit);
	}

	@Then("^Verify Riders COLA is displayed$")
	public void verify_Riders_COLA_is_displayed() throws Throwable {
		Preview.verify_Riders_COLA_is_displayed();
	}

	@Then("^Verify that the Beneficiary tab is disabled$")
	public void verify_that_the_Beneficiary_tab_is_disabled() throws Throwable {
		BeneficiaryPage.verify_that_the_Beneficiary_tab_is_disabled();
	}

	// AAFP
	@Then("^Verify Benefit Amount for child \"([^\"]*)\",\"([^\"]*)\" as \"([^\"]*)\" under TenYTL$")
	public void verify_Benefit_Amount_for_child_as_under_TenYTL(String CFname, String SequenceNo, String CBenefit)
			throws Throwable {
		Preview.verify_Benefit_Amount_for_child_as_under_TenYTL(CFname, SequenceNo, CBenefit);
	}
	
	//GEOCARE
	@Then("^Verify Benefit Amount for child \"([^\"]*)\",\"([^\"]*)\" as \"([^\"]*)\" under \"([^\"]*)\"$")
	public void verify_Benefit_Amount_for_child_as_under(String CFname, String SequenceNo, String CBenefit, String Product)
			throws Throwable {
		Preview.verify_Benefit_Amount_for_child_as_under(CFname, SequenceNo, CBenefit, Product);
	}
	//*************
	@Then("^Verify Benefit Amount for Child \"([^\"]*)\",\"([^\"]*)\" as \"([^\"]*)\" under GTenYTL$")
	public void verify_Benefit_Amount_for_Child_as_under_GTenYTL(String CFname, String SequenceNo, String CBenefit)
			throws Throwable {
		Preview.verify_Benefit_Amount_for_child_as_under_TenYTL(CFname, SequenceNo, CBenefit);
	}
	
	@Then("^Verify Benefit Amount for child \"([^\"]*)\",\"([^\"]*)\" as \"([^\"]*)\" under TenPGTL$")
	public void verify_Benefit_Amount_for_child_as_under_TenPGTL(String CFname, String SequenceNo, String CBenefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_child_as_under_TenYTL(CFname, SequenceNo, CBenefit);
	}

	@Then("^Verify Benefit Amount for child \"([^\"]*)\",\"([^\"]*)\" as \"([^\"]*)\" under TermLife$")
	public void verify_Benefit_Amount_for_child_as_under_TermLife(String CFname, String SequenceNo, String CBenefit)
			throws Throwable {
		Preview.verify_Benefit_Amount_for_child_as_under_TermLife(CFname, SequenceNo, CBenefit);
	}
	
	@Then("^Verify Benefit Amount for child \"([^\"]*)\",\"([^\"]*)\" as \"([^\"]*)\" under GTwentyYTL$")
	public void verify_Benefit_Amount_for_child_as_under_GTwentyYTL(String CFname, String SequenceNo, String CBenefit)throws Throwable {
		Preview.verify_Benefit_Amount_for_child_as_under_TermLife(CFname, SequenceNo, CBenefit);
	}

	@Then("^Verify under Group Group Term LI for \"([^\"]*)\", \"([^\"]*)\" coverage amount as \"([^\"]*)\"$")
	public void verify_under_Group_Group_Term_LI_for_coverage_amount_as(String CFname, String CLname, String CBenefit) throws Throwable {
		Preview.verify_Child_name_BenefitAmt_at_summary_page_as_Under_GrpTermLife(CFname, CLname, CBenefit);
	}
	
	@Then("^Verify Benefit Amount for Child \"([^\"]*)\",\"([^\"]*)\" as \"([^\"]*)\" under GroupTermLife$")
	public void verify_Benefit_Amount_for_child_as_under_GroupTermLife(String CFname, String SequenceNo,
			String CBenefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_child_as_under_TermLife(CFname, SequenceNo, CBenefit);
	}

	@Then("^Verify Benefit Amount for child \"([^\"]*)\",\"([^\"]*)\" as \"([^\"]*)\" under ADDI$")
	public void verify_Benefit_Amount_for_child_as_under_ADDI(String CFname, String SequenceNo, String CBenefit)
			throws Throwable {
		Preview.verify_Benefit_Amount_for_child_as_under_ADDI(CFname, SequenceNo, CBenefit);
	}
	
	@Then("^Verify Benefit Amount for Child \"([^\"]*)\",\"([^\"]*)\" as \"([^\"]*)\" under HLAI$")
	public void verify_Benefit_Amount_for_child_as_under_HLAI(String CFname, String SequenceNo, String CBenefit)
			throws Throwable {
		Preview.verify_Benefit_Amount_for_child_as_under_ADDI(CFname, SequenceNo, CBenefit);
	}
	
	@Then("^Verify Benefit Amount for Child \"([^\"]*)\",\"([^\"]*)\" as \"([^\"]*)\" under HII$")
	public void verify_Benefit_Amount_for_Child_as_under_HII(String CFname, String SequenceNo, String CBenefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Child_as_under_HII(CFname, SequenceNo, CBenefit);
	}
	
	@Then("^Verify Benefit Amount for Child \"([^\"]*)\",\"([^\"]*)\" as \"([^\"]*)\" under InHospitalInsurance$")
	public void verify_Benefit_Amount_for_Child_as_under_InHospitalInsurance(String CFname, String SequenceNo, String CBenefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Child_as_under_HII(CFname, SequenceNo, CBenefit);
	}
		
	
	@Then("^Verify Benefit Amount for Child \"([^\"]*)\",\"([^\"]*)\" as \"([^\"]*)\" under GHII$")
	public void verify_Benefit_Amount_for_Child_as_under_HHII(String CFname, String SequenceNo, String CBenefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Child_as_under_HII(CFname, SequenceNo, CBenefit);
	}
	@Then("^Verify Benefit Amount for Child \"([^\"]*)\",\"([^\"]*)\" as \"([^\"]*)\" under HLDD$")
	public void verify_Benefit_Amount_for_Child_as_under_HLDD(String CFname, String SequenceNo, String CBenefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Child_as_under_HLDD(CFname, SequenceNo, CBenefit);
	}

		
	// AAFP
	// TEST
	/*
	 * @Then("^Verify Benefit Amount for child \"([^\"]*)\" as \"([^\"]*)\" under TenYTL$"
	 * ) public void verify_Benefit_Amount_for_child_as_under_TenYTL(String CFname,
	 * String CBenefit) throws Throwable {
	 * Preview.verify_Benefit_Amount_for_child_as_under_TenYTL(CFname, CBenefit); }
	 */

	// AAFP
	@Then("^Verify Waiver of Premium Rider for Self as YES$")
	public void verify_Waiver_of_Premium_Rider_for_Self_as_YES() throws Throwable {
		Preview.verify_Waiver_of_Premium_Rider_for_Self_as_YES();
	}
	
	@Then("^Verify Waiver of Premium Rider for Self under GTLP75I as YES$")
	public void verify_Waiver_of_Premium_Rider_for_Self_under_GTLP75I_as_YES() throws Throwable {
		Preview.verify_Waiver_of_Premium_Rider_for_Self_under_GTLP75I_as_YES();
	}
	
	@Then("^Verify Waiver of Premium Rider for Self under Flex10 as YES$")
	public void verify_Waiver_of_Premium_Rider_for_Self_under_Flex10_as_YES() throws Throwable {
		Preview.verify_Waiver_of_Premium_Rider_for_Self_under_Flex10_as_YES();
	}
	
	@Then("^Verify Waiver of Premium Rider for Self under Flex20 as YES$")
	public void verify_Waiver_of_Premium_Rider_for_Self_under_Flex20_as_YES() throws Throwable {
		Preview.verify_Waiver_of_Premium_Rider_for_Self_under_Flex20_as_YES();
	}

	@Then("^Verify Inflation Protection Option Rider for Self as YES$")
	public void verify_Inflation_Protection_Option_Rider_for_Self_as_YES() throws Throwable {
		Preview.verify_Inflation_Protection_Option_Rider_for_Self_as_YES();
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under PO$")
	public void verify_Benefit_Amount_for_Self_as_under_PO(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_OOEDI(Benefit);
	}

	@Then("^Validates Self as \"([^\"]*)\",\"([^\"]*)\"$")
	public void validate_Self_Fname_Lname(String fname, String lname) throws Throwable {
		Preview.validate_Self_Fname_Lname(fname, lname);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under GTDLI$")
	public void verify_Benefit_Amount_for_Self_as_under_GTDLI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_GTDLI(Benefit);
	}

	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under GTDLI$")
	public void verify_Benefit_Amount_for_Spouse_as_under_GTDLI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_GTDLI(Benefit);
	}

	@Then("^Validates Spouse as \"([^\"]*)\",\"([^\"]*)\"$")
	public void validate_Spouse_Fname_Lname(String fname, String lname) throws Throwable {
		Preview.validate_Spouse_Fname_Lname(fname, lname);
	}

	@Then("^Verify Benefit Amount for First child as \"([^\"]*)\" under GTDLI$")
	public void verify_Benefit_Amount_for_First_Child_as_under_GTDLI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_First_Child_as_under_GTDLI(Benefit);
	}

	@Then("^Verify Benefit Amount for Second child as \"([^\"]*)\" under GTDLI$")
	public void verify_Benefit_Amount_for_Second_Child_as_under_GTDLI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Second_Child_as_under_GTDLI(Benefit);
	}

	@Then("^Verify Benefit Amount for Third child as \"([^\"]*)\" under GTDLI$")
	public void verify_Benefit_Amount_for_Third_Child_as_under_GTDLI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Third_Child_as_under_GTDLI(Benefit);
	}

	@Then("^Verify Benefit Amount for Fourth child as \"([^\"]*)\" under GTDLI$")
	public void verify_Benefit_Amount_for_Fourth_Child_as_under_GTDLI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Fourth_Child_as_under_GTDLI(Benefit);
	}

	@Then("^Verify Benefit Amount for Fifth child as \"([^\"]*)\" under GTDLI$")
	public void verify_Benefit_Amount_for_Fifth_Child_as_under_GTDLI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Fifth_Child_as_under_GTDLI(Benefit);
	}

	@Then("^Verify Child Firstname and Lastname as \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_Child_Fname_Lname(String fname, String lname) throws Throwable {
		Preview.verify_Child_Fname_Lname(fname, lname);
	}

	@Then("^Verify Guaranteed Purchase Option as Yes for Self under BOE$")
	public void verify_Guaranteed_Purchase_Option_as_Yes_for_Self_under_BOE() throws Throwable {
		Preview.verify_Guaranteed_Purchase_Option_as_Yes_for_Self_under_BOE();
	}

	@Then("^Verify Recovery Option as Yes for Self under BOE$")
	public void verify_Recovery_Option_as_Yes_for_Self_under_BOE() throws Throwable {
		Preview.verify_Recovery_Option_as_Yes_for_Self_under_BOE();
	}

	@Then("^Verify Retroactive as Yes for Self under BOE$")
	public void verify_Retroactive_Option_as_Yes_for_Self_under_BOE() throws Throwable {
		Preview.verify_Retroactive_Option_as_Yes_for_Self_under_BOE();
	}
	
	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under GDI$")
	public void verify_Benefit_Amount_for_Self_as_under_GDI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_GDI(Benefit);
	}
	
	@Then("^Verify Benefit Option for Self as \"([^\"]*)\" under GDI$")
	public void verify_Benefit_Option_for_Self_as_under_GDI(String Option) throws Throwable {
		Preview.verify_Benefit_Option_for_Self_as_under_GDI(Option);
	}
	
	@Then("^Verify Partial Disability Benefit Rider as \"([^\"]*)\" for self under GDI$")
	public void verify_Partial_Disability_Benefit_Rider_for_Self_as_under_GDI(String Option) throws Throwable {
		Preview.verify_Partial_Disability_Benefit_Rider_for_Self_as_under_GDI(Option);
	}
	
	@Then("^Verify Automatic Benefit Increase Option Rider as \"([^\"]*)\" for self under GLI$")
	public void verify_Automatic_Benefit_Increase_Option_Rider_for_Self_as_under_GLI(String Option) throws Throwable {
		Preview.verify_Automatic_Benefit_Increase_Option_Rider_for_Self_as_under_GLI(Option);
	}


	@Then("^Validates Benefit Amount for Self as \"([^\"]*)\" under TGTLI$")
	public void validates_Benefit_Amount_for_Self_as_under_TGTLI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_TermLife_ARTL_FiveYTL(Benefit);
	}

	@Then("^Validates Automatic Benefit Increase Option Rider as \"([^\"]*)\" for Self under TGTLI$")
	public void validates_Rider_Automatic_Benefit_Increase_Option_for_Self_under_TGTLI(String Option) throws Throwable {
		Preview.verify_Automatic_Benefit_Increase_Option_Rider_for_Self_as_under_GLI(Option);
	}


	@Then("^Validates Benefit Amount for Self as \"([^\"]*)\" under TenPGTL$")
	public void validates_Benefit_Amount_for_Self_as_under_TenPGTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_TenYTL(Benefit);
	}

	@Then("^Validates Benefit Amount for Spouse as \"([^\"]*)\" under TGTLI$")
	public void validates_Benefit_Amount_for_Spouse_as_under_TGTLI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_TermLife_ARTL_FiveYTL(Benefit);
	}

	@Then("^Validates Automatic Benefit Increase Option Rider as \"([^\"]*)\" for Spouse under TGTLI$")
	public void validates_Rider_Automatic_Benefit_Increase_Option_for_Spouse_under_TGTLI(String Option)
			throws Throwable {
		Preview.verify_Automatic_Benefit_Increase_Option_Rider_for_Spouse_as_under_GLI(Option);
	}

	@Then("^Validates Benefit Amount for Spouse as \"([^\"]*)\" under TenPGTL$")
	public void validates_Benefit_Amount_for_Spouse_as_under_TenPGTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_TenYTL(Benefit);
	}

	@Then("^Validates Benefit Amount for Child as \"([^\"]*)\" under TGTLI$")
	public void validates_Benefit_Amount_for_Child_as_under_TGTLI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Child_as_under_TermLife_FiveYTL_ARTL(Benefit);
	}



	@Then("^Verify Automatic Benefit Increase Option Rider as \"([^\"]*)\" for spouse under GLI$")
	public void verify_Automatic_Benefit_Increase_Option_Rider_for_Spouse_as_under_GLI(String Option) throws Throwable {
		Preview.verify_Automatic_Benefit_Increase_Option_Rider_for_Spouse_as_under_GLI(Option);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under GLTDI$")
	public void verify_Benefit_Amount_for_Self_as_under_GLTDI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_LTD(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under GSTDI$")
	public void verify_Benefit_Amount_for_Self_as_under_GSTDI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_STD(Benefit);
	}

	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under GBOEI$")
	public void verify_Benefit_Amount_for_Self_as_under_GBOEI(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_POEDI(Benefit);
	}

	// *******************************Authorize Page
	// Web*******************************//

	@Then("^Authorize page details are displayed to user and confirm the term and conditions for Self$")
	public void authorize_page_details_are_displayed_to_user_and_confirm_the_term_and_conditions_for_Self()
			throws Throwable {

		Authorize.authorize_page_details_are_displayed_to_user_and_confirm_the_term_and_conditions_for_Self();

	}

	@Then("^Authorize page details are displayed to user and confirm the term and conditions for Spouse$")
	public void authorize_page_details_are_displayed_to_user_and_confirm_the_term_and_conditions_for_Spouse()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Authorize.authorize_page_details_are_displayed_to_user_and_confirm_the_term_and_conditions_for_Spouse();
	}

	@Then("^Authorize page details are displayed to user$")
	public void authorize_page_details_are_displayed_to_user() throws Throwable {
		Authorize.authorize_page_details_are_displayed_to_user();
	}

	@Then("^Validate Error message for Authorization$")
	public void validate_Error_message_for_Authorization() throws Throwable {
		Authorize.validate_Error_message_for_Authorization();
	}

	@Then("^Verify Supplemental Health Note in Authorization Page$")
	public void verify_Supplemental_Health_Note_in_Authorization_Page() throws Throwable {
		Authorize.verify_Supplemental_Health_Note_in_Authorization_Page();
	}


	@Then("^Verify Benefit Amount for Self as \"([^\"]*)\" under MLI$")
	public void verify_Benefit_Amount_for_Self_as_under_MLIL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_MLI(Benefit);
	}

	@Then("^Verify Benefit Amount for Spouse as \"([^\"]*)\" under MLI$")
	public void verify_Benefit_Amount_for_Spouse_as_under_MLIL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_MLI(Benefit);
	}

	@Then("^Verify Benefit Amount for Child as \"([^\"]*)\" under MLI$")
	public void verify_Benefit_Amount_for_Child_as_under_MLIL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Child_as_under_MLI(Benefit);
	}

	@Then("^Verify Rider Benefit Amount for Self as \"([^\"]*)\" under MLI$")
	public void verify_Rider_Benefit_Amount_for_Self_as_under_MLIL(String Benefit) throws Throwable {
		Preview.verify_Rider_Benefit_Amount_for_Self_as_under_MLI(Benefit);
	}

	@Then("^Verify Rider Benefit Amount for Spouse as \"([^\"]*)\" under MLI$")
	public void verify_Rider_Benefit_Amount_for_Spouse_as_under_MLIL(String Benefit) throws Throwable {
		Preview.verify_Rider_Benefit_Amount_for_Spouse_as_under_MLI(Benefit);
	}

	@Then("^Submit Application is displayed to user and confirms the terms for Self$")
	public void submit_application_page_details_are_displayed_to_user_and_confirm_the_term_and_conditions_for_Self()
			throws Throwable {

		Authorize.submit_application_page_details_are_displayed_to_user_and_confirm_the_term_and_conditions_for_Self();

	}

	@Then("^Submit Application is displayed to user and confirms the terms for Spouse$")
	public void submit_application_page_details_are_displayed_to_user_and_confirm_the_term_and_conditions_for_Spouse()
			throws Throwable {

		Authorize
				.submit_application_page_details_are_displayed_to_user_and_confirm_the_term_and_conditions_for_Spouse();

	}

	@Then("^Verify mandatory fields First name, Last name and DOB present for Self on Submit Application page$")
	public void verify_FirstName_LastName_DOB_Self_Displayed() throws Throwable {
		Authorize.verify_FirstName_LastName_DOB_Self_Displayed();
	}

	@Then("^Verify mandatory fields First name, Last name and DOB present for Spouse on Submit Application page$")
	public void verify_FirstName_LastName_DOB_Spouse_Displayed() throws Throwable {
		Authorize.verify_FirstName_LastName_DOB_Spouse_Displayed();
	}

	@Then("^Enters Details for Self as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" on Submit Application page$")
	public void enters_FirstName_LastName_DOB_Self(String fname, String lname, String dob) throws Throwable {
		Authorize.enters_FirstName_LastName_DOB_Self(fname, lname, dob);
	}
	
	@Then("^Enters First name as \"([^\"]*)\"$")
	public void enters_FirstName_Self(String fname) throws Throwable {
		Authorize.enters_FirstName_Self(fname);
	}

	@Then("^Enters Details for Spouse as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" on Submit Application page$")
	public void enters_FirstName_LastName_DOB_Spouse(String fname, String lname, String dob) throws Throwable {
		Authorize.enters_FirstName_LastName_DOB_Spouse(fname, lname, dob);
	}

	@Then("^Clicks on Submit button$")
	public void click_submit_button_on_submit_application_page() throws Throwable {
		Authorize.click_Submit_button();
	}

	@Then("^Submit Application is displayed to user$")
	public void validate_Submit_Application_Displayed() throws Throwable {
		Authorize.validate_Submit_Application_Displayed();
	}
	
	@Then("^Confirms use of electronic records$")
	public void confirm_the_electronic_record_term_and_conditions_for_Self()throws Throwable {
		Authorize.confirm_the_term_and_conditions_for_Self();
	}
	
	@Then("^Validate Error message for mismatch in first name$")
	public void validate_Error_message_for_FirstName_Mismatch() throws Throwable {
		Authorize.validate_Error_message_for_FirstName_Mismatch();
	}

	// *********************************Health Page
	// Web***********************************//

	@Then("^Statement of Health page one details are displayed to user and user answers the all the questions$")
	public void statement_of_Health_page_one_details_are_displayed_to_user_and_user_answers_the_all_the_questions()
			throws Throwable {
		HealthPage
				.statement_of_Health_page_one_is_displayed_to_user_and_answeres_as_No_for_all_questions_on_both_pages_for_Self();
	}

	@Then("^Statement of Health page two details are displayed to user and user answers the all the questions$")
	public void statement_of_Health_page_two_details_are_displayed_to_user_and_user_answers_the_all_the_questions()
			throws Throwable {
		HealthPage
				.statement_of_Health_page_two_is_displayed_to_user_and_answeres_as_No_for_all_questions_on_both_pages_for_Self();
	}

	@Then("^Almost Done are displayed to user$")
	public void almost_Done_are_displayed_to_user() throws Throwable {

	}

	@Then("^Health History Page are displayed and user Select NO for all the questions$")
	public void health_History_Page_are_displayed_and_user_Select_NO_for_all_the_questions() throws Throwable {
		HealthPage.health_History_Page_are_displayed_and_user_Select_NO_for_all_the_questions();

	}

	@Then("^Enters details  for Question forth as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_details_for_Question_forth_as(String Physician, String Address, String Date, String Reason,
			String Result) throws Throwable {

		HealthPage.enters_details_for_Question_forth_as_Waepa(Physician, Address, Date, Reason, Result);
	}

	@Then("^Health History Page are displayed and user for Spouse Select NO for all the questions$")
	public void health_History_Page_are_displayed_and_user_for_Spouse_Select_NO_for_all_the_questions()
			throws Throwable {
		HealthPage.health_History_Page_are_displayed_and_user_Select_NO_for_all_the_questions();
	}

	@Then("^Enters details  for Question forth for Spouse as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_details_for_Question_forth_for_Spouse_as(String Physician1, String Address1, String Date1,
			String Reason1, String Result1) throws Throwable {
		HealthPage.enters_details_for_Question_forth_for_Spouse_as_Waepa(Physician1, Address1, Date1, Reason1, Result1);
	}

	// ****************************************************************************************************************************
	// WAEPA - Health History Page for Self with All Yes options

	@Then("^Verify Health History Page are displayed to user$")
	public void verify_Health_History_Page_are_displayed_to_user() throws Throwable {
		HealthPage.verify_Health_History_Page_are_displayed_to_user();
	}

	@Then("^Select YES for self question one, two and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_self_question_one_two_and_enter_details_as(String Amount1a, String WeightReason1a,
			String Details2a, String Details2b) throws Throwable {
		HealthPage.select_YES_for_self_question_one_two_and_enter_details_as(Amount1a, WeightReason1a, Details2a,
				Details2b);
	}

	@Then("^Select YES for Self question three and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Self_question_three_and_enter_details_as(String Date3a, String Treatment3a,
			String NameAddress3a, String Medicine3b, String Dosage3b, String Freq3b, String NameAddress3b)
			throws Throwable {
		HealthPage.select_YES_for_Self_question_three_and_enter_details_as(Date3a, Treatment3a, NameAddress3a,
				Medicine3b, Dosage3b, Freq3b, NameAddress3b);
	}

	@Then("^Select YES for Self question Four as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Self_question_Four_as(String Physician4a, String Address4a, String Date4b,
			String Reason4b, String Result4c, String EKG4d, String Details4d) throws Throwable {
		HealthPage.select_YES_for_Self_question_Four_as(Physician4a, Address4a, Date4b, Reason4b, Result4c, EKG4d,
				Details4d);
	}

	@Then("^Select YES for Self question FiveA blood pressure and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Self_question_FiveA_blood_pressure_and_enter_details_as(String Date5a, String Illness5a,
			String Symptoms5a, String LastDate5a, String Attacks5a, String Treatment5a, String NameAddress5a)
			throws Throwable {
		HealthPage.select_YES_for_Self_question_FiveA_blood_pressure_and_enter_details_as(Date5a, Illness5a, Symptoms5a,
				LastDate5a, Attacks5a, Treatment5a, NameAddress5a);
	}

	@Then("^Select YES for Self question FiveB ulcer and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Self_question_FiveB_ulcer_and_enter_details_as(String Date5b, String Illness5b,
			String Symptoms5b, String LastDate5b, String Attacks5b, String Treatment5b, String NameAddress5b)
			throws Throwable {
		HealthPage.select_YES_for_Self_question_FiveB_ulcer_and_enter_details_as(Date5b, Illness5b, Symptoms5b,
				LastDate5b, Attacks5b, Treatment5b, NameAddress5b);
	}

	@Then("^Select YES for Self question FiveC asthma and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Self_question_FiveC_asthma_and_enter_details_as(String Date5c, String Illness5c,
			String Symptoms5c, String LastDate5c, String Attacks5c, String Treatment5c, String NameAddress5c)
			throws Throwable {
		HealthPage.select_YES_for_Self_question_FiveC_asthma_and_enter_details_as(Date5c, Illness5c, Symptoms5c,
				LastDate5c, Attacks5c, Treatment5c, NameAddress5c);
	}

	@Then("^Select YES for Self question FiveD venereal disease and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Self_question_FiveD_venereal_disease_and_enter_details_as(String Date5d,
			String Illness5d, String Symptoms5d, String LastDate5d, String Attacks5d, String Treatment5d,
			String NameAddress5d) throws Throwable {
		HealthPage.select_YES_for_Self_question_FiveD_venereal_disease_and_enter_details_as(Date5d, Illness5d,
				Symptoms5d, LastDate5d, Attacks5d, Treatment5d, NameAddress5d);
	}

	@Then("^Select YES for Self question FiveE fibrositis and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Self_question_FiveE_fibrositis_and_enter_details_as(String Date5e, String Illness5e,
			String Symptoms5e, String LastDate5e, String Attacks5e, String Treatment5e, String NameAddress5e)
			throws Throwable {
		HealthPage.select_YES_for_Self_question_FiveE_fibrositis_and_enter_details_as(Date5e, Illness5e, Symptoms5e,
				LastDate5e, Attacks5e, Treatment5e, NameAddress5e);
	}

	@Then("^Select YES for Self question FiveF convulsions and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Self_question_FiveF_convulsions_and_enter_details_as(String Date5f, String Illness5f,
			String Symptoms5f, String LastDate5f, String Attacks5f, String Treatment5f, String NameAddress5f)
			throws Throwable {
		HealthPage.select_YES_for_Self_question_FiveF_convulsions_and_enter_details_as(Date5f, Illness5f, Symptoms5f,
				LastDate5f, Attacks5f, Treatment5f, NameAddress5f);
	}

	@Then("^Select YES for Self question FiveG stress and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Self_question_FiveG_stress_and_enter_details_as(String Date5g, String Illness5g,
			String Symptoms5g, String LastDate5g, String Attacks5g, String Treatment5g, String NameAddress5g)
			throws Throwable {
		HealthPage.select_YES_for_Self_question_FiveG_stress_and_enter_details_as(Date5g, Illness5g, Symptoms5g,
				LastDate5g, Attacks5g, Treatment5g, NameAddress5g);
	}

	@Then("^Select YES for Self question FiveH diabetes and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Self_question_FiveH_diabetes_and_enter_details_as(String Date5h, String Illness5h,
			String Symptoms5h, String LastDate5h, String Attacks5h, String Treatment5h, String NameAddress5h)
			throws Throwable {
		HealthPage.select_YES_for_Self_question_FiveH_diabetes_and_enter_details_as(Date5h, Illness5h, Symptoms5h,
				LastDate5h, Attacks5h, Treatment5h, NameAddress5h);
	}

	@Then("^Select YES for Self question FiveI any disease and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Self_question_FiveI_any_disease_and_enter_details_as(String Date5i, String Illness5i,
			String Symptoms5i, String LastDate5i, String Attacks5i, String Treatment5i, String NameAddress5i)
			throws Throwable {
		HealthPage.select_YES_for_Self_question_FiveI_any_disease_and_enter_details_as(Date5i, Illness5i, Symptoms5i,
				LastDate5i, Attacks5i, Treatment5i, NameAddress5i);
	}

	@Then("^Select YES for Self question FiveJ anemia and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Self_question_FiveJ_anemia_and_enter_details_as(String Date5j, String Illness5j,
			String Symptoms5j, String LastDate5j, String Attacks5j, String Treatment5j, String NameAddress5j)
			throws Throwable {
		HealthPage.select_YES_for_Self_question_FiveJ_anemia_and_enter_details_as(Date5j, Illness5j, Symptoms5j,
				LastDate5j, Attacks5j, Treatment5j, NameAddress5j);
	}

	@Then("^Select YES for Self question FiveK cancer and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Self_question_FiveK_cancer_and_enter_details_as(String Date5k, String Illness5k,
			String Symptoms5k, String LastDate5k, String Attacks5k, String Treatment5k, String NameAddress5k)
			throws Throwable {
		HealthPage.select_YES_for_Self_question_FiveK_cancer_and_enter_details_as(Date5k, Illness5k, Symptoms5k,
				LastDate5k, Attacks5k, Treatment5k, NameAddress5k);
	}

	@Then("^Select YES for Self question FiveL any other illness and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Self_question_FiveL_any_other_illness_and_enter_details_as(String Date5l,
			String Illness5l, String Symptoms5l, String LastDate5l, String Attacks5l, String Treatment5l,
			String NameAddress5l) throws Throwable {
		HealthPage.select_YES_for_Self_question_FiveL_any_other_illness_and_enter_details_as(Date5l, Illness5l,
				Symptoms5l, LastDate5l, Attacks5l, Treatment5l, NameAddress5l);
	}

	@Then("^Select YES for Self question SixA alcoholic and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Self_question_SixA_alcoholic_and_enter_details_as(String Freq6a, String Wine6a,
			String Beer6a, String Liquor6a) throws Throwable {
		HealthPage.select_YES_for_Self_question_SixA_alcoholic_and_enter_details_as(Freq6a, Wine6a, Beer6a, Liquor6a);
	}

	@Then("^Select YES for Self question SixB more alcohol and enter details as \"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Self_question_SixB_more_alcohol_and_enter_details_as(String Date6b, String Details6b)
			throws Throwable {
		HealthPage.select_YES_for_Self_question_SixB_more_alcohol_and_enter_details_as(Date6b, Details6b);
	}

	@Then("^Select YES for Self question SixC sedatives and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Self_question_SixC_sedatives_and_enter_details_as(String Date6c, String Freq6c,
			String Drug6c, String Details6c) throws Throwable {
		HealthPage.select_YES_for_Self_question_SixC_sedatives_and_enter_details_as(Date6c, Freq6c, Drug6c, Details6c);
	}

	@Then("^Select YES for Self question SixD marijuana and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Self_question_SixD_marijuana_and_enter_details_as(String Date6d, String Freq6d,
			String Drug6d, String Details6d) throws Throwable {
		HealthPage.select_YES_for_Self_question_SixD_marijuana_and_enter_details_as(Date6d, Freq6d, Drug6d, Details6d);
	}

	@Then("^Select YES for Self question SixE nicotine and enter details as \"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Self_question_SixE_nicotine_and_enter_details_as(String Date6e, String Product6e)
			throws Throwable {
		HealthPage.select_YES_for_Self_question_SixE_nicotine_and_enter_details_as(Date6e, Product6e);
	}

	@Then("^Select YES for Self question SixF physician and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Self_question_SixF_physician_and_enter_details_as(String Date6f, String Details6f,
			String NameAddress6f) throws Throwable {
		HealthPage.select_YES_for_Self_question_SixF_physician_and_enter_details_as(Date6f, Details6f, NameAddress6f);
	}

	@Then("^Select YES for Self question seven eight and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Self_question_seven_eight_and_enter_details_as(String Details7a, String Date7b,
			String Details7b, String Family8a, String Age8a, String Status8a, String Condition8a) throws Throwable {
		HealthPage.select_YES_for_Self_question_seven_eight_and_enter_details_as(Details7a, Date7b, Details7b, Family8a,
				Age8a, Status8a, Condition8a);
	}

	@Then("^Select NO for QuestionSevenB for Self-Convicted of a crime in Last Five Years$")
	public void select_NO_for_QuestionSevenB_for_Self_Convicted_of_a_crime_in_Last_Five_Years() throws Throwable {
		HealthPage.select_NO_for_QuestionSevenB_for_Self_Convicted_of_a_crime_in_Last_Five_Years();
	}

	// WAEPA Health History For Spouse

	@Then("^Select YES for Spouse question one, two and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Spouse_question_one_two_and_enter_details_as(String Amount1a, String WeightReason1a,
			String Details2a, String Details2b) throws Throwable {
		HealthPage.select_YES_for_Spouse_question_one_two_and_enter_details_as(Amount1a, WeightReason1a, Details2a,
				Details2b);
	}

	/*
	 * @Then("^Select YES for Spouse question three and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$"
	 * ) public void
	 * select_YES_for_Spouse_question_three_and_enter_details_as(String Date3a,
	 * String Treatment3a, String NameAddress3a, String Medicine3b, String Dosage3b,
	 * String Freq3b, String NameAddress3b) throws Throwable {
	 * HealthPage.select_YES_for_Spouse_question_three_and_enter_details_as(Date3a,
	 * Treatment3a, NameAddress3a, Medicine3b, Dosage3b, Freq3b, NameAddress3b); }
	 */

	@Then("^Select YES for Spouse question three and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Spouse_question_three_and_enter_details_as(String Date3a, String Treatment3a,
			String NameAddress3a, String Medicine3b, String Dosage3b, String Freq3b, String NameAddress3b,
			String Duedate3c, String Details3d) throws Throwable {
		HealthPage.select_YES_for_Spouse_question_three_and_enter_details_as(Date3a, Treatment3a, NameAddress3a,
				Medicine3b, Dosage3b, Freq3b, NameAddress3b, Duedate3c, Details3d);
	}

	@Then("^Select YES for Spouse question Four as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Spouse_question_Four_as(String Physician4a, String Address4a, String Date4b,
			String Reason4b, String Result4c, String EKG4d, String Details4d) throws Throwable {
		HealthPage.select_YES_for_Spouse_question_Four_as(Physician4a, Address4a, Date4b, Reason4b, Result4c, EKG4d,
				Details4d);
	}

	@Then("^Select YES for Spouse question FiveA blood pressure and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Spouse_question_FiveA_blood_pressure_and_enter_details_as(String Date5a,
			String Illness5a, String Symptoms5a, String LastDate5a, String Attacks5a, String Treatment5a,
			String NameAddress5a) throws Throwable {
		HealthPage.select_YES_for_Spouse_question_FiveA_blood_pressure_and_enter_details_as(Date5a, Illness5a,
				Symptoms5a, LastDate5a, Attacks5a, Treatment5a, NameAddress5a);
	}

	@Then("^Select YES for Spouse question FiveB ulcer and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Spouse_question_FiveB_ulcer_and_enter_details_as(String Date5b, String Illness5b,
			String Symptoms5b, String LastDate5b, String Attacks5b, String Treatment5b, String NameAddress5b)
			throws Throwable {
		HealthPage.select_YES_for_Spouse_question_FiveB_ulcer_and_enter_details_as(Date5b, Illness5b, Symptoms5b,
				LastDate5b, Attacks5b, Treatment5b, NameAddress5b);
	}

	@Then("^Select YES for Spouse question FiveC asthma and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Spouse_question_FiveC_asthma_and_enter_details_as(String Date5c, String Illness5c,
			String Symptoms5c, String LastDate5c, String Attacks5c, String Treatment5c, String NameAddress5c)
			throws Throwable {
		HealthPage.select_YES_for_Spouse_question_FiveC_asthma_and_enter_details_as(Date5c, Illness5c, Symptoms5c,
				LastDate5c, Attacks5c, Treatment5c, NameAddress5c);
	}

	@Then("^Select YES for Spouse question FiveD venereal disease and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Spouse_question_FiveD_venereal_disease_and_enter_details_as(String Date5d,
			String Illness5d, String Symptoms5d, String LastDate5d, String Attacks5d, String Treatment5d,
			String NameAddress5d) throws Throwable {
		HealthPage.select_YES_for_Spouse_question_FiveD_venereal_disease_and_enter_details_as(Date5d, Illness5d,
				Symptoms5d, LastDate5d, Attacks5d, Treatment5d, NameAddress5d);
	}

	@Then("^Select YES for Spouse question FiveE fibrositis and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Spouse_question_FiveE_fibrositis_and_enter_details_as(String Date5e, String Illness5e,
			String Symptoms5e, String LastDate5e, String Attacks5e, String Treatment5e, String NameAddress5e)
			throws Throwable {
		HealthPage.select_YES_for_Spouse_question_FiveE_fibrositis_and_enter_details_as(Date5e, Illness5e, Symptoms5e,
				LastDate5e, Attacks5e, Treatment5e, NameAddress5e);
	}

	@Then("^Select YES for Spouse question FiveF convulsions and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Spouse_question_FiveF_convulsions_and_enter_details_as(String Date5f, String Illness5f,
			String Symptoms5f, String LastDate5f, String Attacks5f, String Treatment5f, String NameAddress5f)
			throws Throwable {
		HealthPage.select_YES_for_Spouse_question_FiveF_convulsions_and_enter_details_as(Date5f, Illness5f, Symptoms5f,
				LastDate5f, Attacks5f, Treatment5f, NameAddress5f);
	}

	@Then("^Select YES for Spouse question FiveG stress and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Spouse_question_FiveG_stress_and_enter_details_as(String Date5g, String Illness5g,
			String Symptoms5g, String LastDate5g, String Attacks5g, String Treatment5g, String NameAddress5g)
			throws Throwable {
		HealthPage.select_YES_for_Spouse_question_FiveG_stress_and_enter_details_as(Date5g, Illness5g, Symptoms5g,
				LastDate5g, Attacks5g, Treatment5g, NameAddress5g);
	}

	@Then("^Select YES for Spouse question FiveH diabetes and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Spouse_question_FiveH_diabetes_and_enter_details_as(String Date5h, String Illness5h,
			String Symptoms5h, String LastDate5h, String Attacks5h, String Treatment5h, String NameAddress5h)
			throws Throwable {
		HealthPage.select_YES_for_Spouse_question_FiveH_diabetes_and_enter_details_as(Date5h, Illness5h, Symptoms5h,
				LastDate5h, Attacks5h, Treatment5h, NameAddress5h);
	}

	@Then("^Select YES for Spouse question FiveI any disease and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Spouse_question_FiveI_any_disease_and_enter_details_as(String Date5i, String Illness5i,
			String Symptoms5i, String LastDate5i, String Attacks5i, String Treatment5i, String NameAddress5i)
			throws Throwable {
		HealthPage.select_YES_for_Spouse_question_FiveI_any_disease_and_enter_details_as(Date5i, Illness5i, Symptoms5i,
				LastDate5i, Attacks5i, Treatment5i, NameAddress5i);
	}

	@Then("^Select YES for Spouse question FiveJ anemia and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Spouse_question_FiveJ_anemia_and_enter_details_as(String Date5j, String Illness5j,
			String Symptoms5j, String LastDate5j, String Attacks5j, String Treatment5j, String NameAddress5j)
			throws Throwable {
		HealthPage.select_YES_for_Spouse_question_FiveJ_anemia_and_enter_details_as(Date5j, Illness5j, Symptoms5j,
				LastDate5j, Attacks5j, Treatment5j, NameAddress5j);
	}

	@Then("^Select YES for Spouse question FiveK cancer and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Spouse_question_FiveK_cancer_and_enter_details_as(String Date5k, String Illness5k,
			String Symptoms5k, String LastDate5k, String Attacks5k, String Treatment5k, String NameAddress5k)
			throws Throwable {
		HealthPage.select_YES_for_Spouse_question_FiveK_cancer_and_enter_details_as(Date5k, Illness5k, Symptoms5k,
				LastDate5k, Attacks5k, Treatment5k, NameAddress5k);
	}

	@Then("^Select YES for Spouse question FiveL any other illness and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Spouse_question_FiveL_any_other_illness_and_enter_details_as(String Date5l,
			String Illness5l, String Symptoms5l, String LastDate5l, String Attacks5l, String Treatment5l,
			String NameAddress5l) throws Throwable {
		HealthPage.select_YES_for_Spouse_question_FiveL_any_other_illness_and_enter_details_as(Date5l, Illness5l,
				Symptoms5l, LastDate5l, Attacks5l, Treatment5l, NameAddress5l);
	}

	@Then("^Select YES for Spouse question SixA alcoholic and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Spouse_question_SixA_alcoholic_and_enter_details_as(String Freq6a, String Wine6a,
			String Beer6a, String Liquor6a) throws Throwable {
		HealthPage.select_YES_for_Spouse_question_SixA_alcoholic_and_enter_details_as(Freq6a, Wine6a, Beer6a, Liquor6a);
	}

	@Then("^Select YES for Spouse question SixB more alcohol and enter details as \"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Spouse_question_SixB_more_alcohol_and_enter_details_as(String Date6b, String Details6b)
			throws Throwable {
		HealthPage.select_YES_for_Spouse_question_SixB_more_alcohol_and_enter_details_as(Date6b, Details6b);
	}

	@Then("^Select YES for Spouse question SixC sedatives and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Spouse_question_SixC_sedatives_and_enter_details_as(String Date6c, String Freq6c,
			String Drug6c, String Details6c) throws Throwable {
		HealthPage.select_YES_for_Spouse_question_SixC_sedatives_and_enter_details_as(Date6c, Freq6c, Drug6c,
				Details6c);
	}

	@Then("^Select YES for Spouse question SixD marijuana and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Spouse_question_SixD_marijuana_and_enter_details_as(String Date6d, String Freq6d,
			String Drug6d, String Details6d) throws Throwable {
		HealthPage.select_YES_for_Spouse_question_SixD_marijuana_and_enter_details_as(Date6d, Freq6d, Drug6d,
				Details6d);
	}

	@Then("^Select YES for Spouse question SixE nicotine and enter details as \"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Spouse_question_SixE_nicotine_and_enter_details_as(String Date6e, String Product6e)
			throws Throwable {
		HealthPage.select_YES_for_Spouse_question_SixE_nicotine_and_enter_details_as(Date6e, Product6e);
	}

	@Then("^Select YES for Spouse question SixF physician and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Spouse_question_SixF_physician_and_enter_details_as(String Date6f, String Details6f,
			String NameAddress6f) throws Throwable {
		HealthPage.select_YES_for_Spouse_question_SixF_physician_and_enter_details_as(Date6f, Details6f, NameAddress6f);
	}

	@Then("^Select YES for Spouse question seven eight and enter details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_YES_for_Spouse_question_seven_eight_and_enter_details_as(String Details7a, String Date7b,
			String Details7b, String Family8a, String Age8a, String Status8a, String Condition8a) throws Throwable {
		HealthPage.select_YES_for_Spouse_question_seven_eight_and_enter_details_as(Details7a, Date7b, Details7b,
				Family8a, Age8a, Status8a, Condition8a);
	}

	// *********************************END************************************************

//****************************Signature [Web and Mobile]********************************//

	@Then("^Review and sign page details are displayed to user and Click on continue and attached the sign$")
	public void review_and_sign_page_details_are_displayed_to_user_and_Click_on_continue_and_attached_the_sign()
			throws Throwable {
		Signature.review_and_sign_page_details_are_displayed_to_user_and_Click_on_continue_and_attached_the_sign();
	}

	@Then("^Clicks on next button to finish$")
	public void clicks_on_next_button_to_finish() throws Throwable {
		Signature.clicks_on_next_button_to_finish();
	}
	
	@Then("^Signature details are displayed to user$")
	public void signature_details_are_displayed_to_user() throws Throwable {
		Signature.signature_details_are_displayed_to_user();

	}

	// **************************Payment ************************//

	@Then("^Payment Information Page is displayed to user$")
	public void payment_Information_Page_is_displayed_to_user() throws Throwable {
		Payment.payment_Information_Page_is_displayed_to_user();
	}

	@Then("^Payment page details are displayed to user and skip payment$")
	public void payment_page_details_are_displayed_to_user_and_skip_payment() throws Throwable {
		Payment.payment_page_details_are_displayed_to_user_and_skip_payment();
	}

	@Then("^User get the receipt number and validate Application has  been recieved$")
	public void user_get_the_receipt_number_and_validate_Application_has_been_recieved() throws Throwable {
		Payment.user_get_the_receipt_number_and_validate_Application_has_been_recieved();
	}

	@Then("^Payment Information Page is displayed to user and user Selects Payment option as Bank for FiveYTL Product$")
	public void payment_Information_Page_is_displayed_to_user_and_user_Selects_Payment_option_as_Bank_for_Five_Yr_Product()
			throws Throwable {
		Payment.payment_Information_Page_is_displayed_to_user_and_user_Selects_Payment_option_as_Bank_for_Five_Yr_Product();
	}

	@Then("^Payment Information Page is displayed to user and user Selects Payment option as Bank for Group Term Life Product$")
	public void payment_Information_Page_is_displayed_to_user_and_user_Selects_Payment_option_as_Bank_for_Group_Term_Life_Product()
			throws Throwable {
		Payment.payment_Information_Page_is_displayed_to_user_and_user_Selects_Payment_option_as_Bank_for_Five_Yr_Product();
	}
	
	@Then("^Payment Information Page is displayed to user and user Selects Payment option as Credit card for Flex10 Product$")
	public void payment_Information_Page_is_displayed_to_user_and_user_Selects_Payment_option_as_CreditCard_for_Flex10_Product()
			throws Throwable {
		Payment.payment_Information_Page_is_displayed_to_user_and_user_Selects_Payment_option_as_CreditCard_for_Flex10_Product();
	}

	@Then("^Selects Frequency for FiveYTL Product and reviews \"([^\"]*)\"$")
	public void selects_Frequency_for_Five_Year_Product_and_reviews(String frequency) throws Throwable {

		Payment.selects_Frequency_for_Five_Year_Product_and_reviews(frequency);
	}

	@Then("^Selects Frequency for Group Term Life Product and reviews \"([^\"]*)\"$")
	public void selects_Frequency_for_Group_Term_Life_Product_and_reviews(String frequency) throws Throwable {

		Payment.selects_Frequency_for_Five_Year_Product_and_reviews(frequency);
	}

	@Then("^Payment Information Page is displayed to user and user Selects Payment option as Bank for Ten Year Product$")
	public void payment_Information_Page_is_displayed_to_user_and_user_Selects_Payment_option_as_Bank_for_Ten_Year_Product()
			throws Throwable {
		Payment.payment_Information_Page_is_displayed_to_user_and_user_Selects_Payment_option_as_Bank_for_Ten_Year_Product();
	}

	@Then("^Selects Frequency for Ten Year Product and reviews \"([^\"]*)\"$")
	public void selects_Frequency_for_Ten_Year_Product_and_reviews(String frequency) throws Throwable {
		Payment.selects_Frequency_for_Ten_Year_Product_and_reviews(frequency);
	}
	
	@Then("^Selects Frequency for Flex10 Product and reviews \"([^\"]*)\"$")
	public void selects_Frequency_for_Flex10_Product_and_reviews(String frequency) throws Throwable {
		Payment.selects_Frequency_for_Ten_Year_Product_and_reviews(frequency);
	}

	@Then("^Payment Information Page is displayed to user and user Selects Payment option as Bank Accidental Death Product$")
	public void payment_Information_Page_is_displayed_to_user_and_user_Selects_Payment_option_as_Bank_Accidental_Death_Product()
			throws Throwable {
		Payment.payment_Information_Page_is_displayed_to_user_and_user_Selects_Payment_option_as_Bank_Accidental_Death_Product();
	}

	@Then("^Selects Frequency for Accidental Death Product and reviews \"([^\"]*)\"$")
	public void selects_Frequency_for_Accidental_Death_Product_and_reviews(String frequency) throws Throwable {
		Payment.selects_Frequency_for_Accidental_Death_Product_and_reviews(frequency);
	}

	@Then("^User Selects Payment option as Bank for Hopsital Money Insurance$")
	public void user_Selects_Payment_option_as_Bank_for_Hopsital_Money_Insurance() throws Throwable {
		Payment.user_Selects_Payment_option_as_Bank_for_Hopsital_Money_Insurance();
	}

	@Then("^Selects Frequency for Hospital Money Insurance Product and reviews \"([^\"]*)\"$")
	public void selects_Frequency_for_Hospital_Money_Insurance_Product_and_reviews(String frequency) throws Throwable {
		Payment.selects_Frequency_for_Hospital_Money_Insurance_Product_and_reviews(frequency);
	}

	@Then("^Selects Payment Method for FiveYTL$")
	public void selects_Payment_Method_for_FiveYTL_Product() throws Throwable {
		Payment.selects_Payment_Method_for_FiveYTL_Product();
	}

	@Then("^Selects Payment Method for TenYTL$")
	public void selects_Payment_Method_for_TenYTL() throws Throwable {
		Payment.selects_Payment_Method_for_TenYTL();
	}

	@Then("^Selects Radio Button for existing payment method$")
	public void selects_Radio_Button_for_existing_payment_method() throws Throwable {
		Payment.selects_Radio_Button_for_existing_payment_method();
	}

	@Then("^Selects Payment Method for TwentyYTL$")
	public void selects_Payment_Method_for_TwentyYTL() throws Throwable {
		Payment.selects_Payment_Method_for_TwentyYTL();
	}
	
	@Then("^Selects Payment Method for Flex20$")
	public void selects_Payment_Method_for_Flex20() throws Throwable {
		Payment.selects_Payment_Method_for_TwentyYTL();
	}

	@Then("^Selects Frequency for Twenty Year Product \"([^\"]*)\"$")
	public void selects_Frequency_for_Twenty_Year_Product(String frequency) throws Throwable {
		Payment.selects_Frequency_for_Twenty_Year_Product(frequency);
	}
	
	@Then("^Selects Frequency for Flex20 Product and reviews \"([^\"]*)\"$")
	public void selects_Frequency_for_Flex20_Product(String frequency) throws Throwable {
		Payment.selects_Frequency_for_Twenty_Year_Product(frequency);
	}

	@Then("^Payment Information Page is displayed to user And Selects Payment Method for FiftyYTL$")
	public void payment_Information_Page_is_displayed_to_user_And_Selects_Payment_Method_for_FiftyYTL()
			throws Throwable {
		Payment.payment_Information_Page_is_displayed_to_user_And_Selects_Payment_Method_for_FiftyYTL();
	}

	@Then("^Selects Payment option as Bank$")
	public void selects_Payment_option_as_Bank() throws Throwable {
		Payment.selects_Payment_option_as_Bank();
	}

	@Then("^Selects Frequency for Fifty Year Product \"([^\"]*)\"$")
	public void selects_Frequency_for_Fifty_Year_Product(String frequency) throws Throwable {
		Payment.selects_Frequency_for_Fifty_Year_Product(frequency);
	}

	@Then("^Verify Premium Rates$")
	public void verify_Premium_Rates() throws Throwable {
		Payment.verify_Premium_Rates();
	}

	@Then("^Selects Payment Method for ADDI$")
	public void selects_Payment_Method_for_ADDI() throws Throwable {
		Payment.selects_Payment_Method_for_ADDI();
	}

	@Then("^Selects Payment Method for LTDPlus$")
	public void selects_Payment_Method_for_LTDPlus() throws Throwable {
		Payment.selects_Payment_Method_for_LTDPlus();
	}

	@Then("^Selects Frequency for Long Term Disability Plus Product \"([^\"]*)\"$")
	public void selects_Frequency_for_Long_Term_Disablitity_Plus_Product(String frequency) throws Throwable {
		Payment.selects_Frequency_for_Long_Term_Disablitity_Plus_Product(frequency);
	}

	@Then("^Selects Payment Method for LTD$")
	public void selects_Payment_Method_for_LTD() throws Throwable {
		Payment.selects_Payment_Method_for_LTD();
	}

	@Then("^Selects Frequency for Long Term Disability Product \"([^\"]*)\"$")
	public void selects_Frequency_for_Long_Term_Disablitity_Product(String frequency) throws Throwable {
		Payment.selects_Frequency_for_Long_Term_Disablitity_Product(frequency);
	}

	@Then("^Selects Payment Method for MTDI$")
	public void selects_Payment_Method_for_MTDI() throws Throwable {
		Payment.selects_Payment_Method_for_MTDI();
	}

	@Then("^Selects Frequency for Mid Term Disability Product \"([^\"]*)\"$")
	public void selects_Frequency_for_Mid_Term_Disablitity_Product(String frequency) throws Throwable {
		Payment.selects_Frequency_for_Mid_Term_Disablitity_Product(frequency);
	}

	@Then("^Selects Payment Method for RTDI$")
	public void selects_Payment_Method_for_RTDI() throws Throwable {
		Payment.selects_Payment_Method_for_RTDI();
	}

	@Then("^Selects Frequency for Retirement Disability Product \"([^\"]*)\"$")
	public void selects_Frequency_for_Retirement_Disablitity_Product(String frequency) throws Throwable {
		Payment.selects_Frequency_for_Retirement_Disablitity_Product(frequency);
	}

	@Then("^Selects Payment Method for POEDI$")
	public void selects_Payment_Method_for_POEDI() throws Throwable {
		Payment.selects_Payment_Method_for_POEDI();
	}

	@Then("^Selects Frequency for Professional Disability Product \"([^\"]*)\"$")
	public void selects_Frequency_for_Professional_Disablitity_Product(String frequency) throws Throwable {
		Payment.selects_Frequency_for_Professional_Disablitity_Product(frequency);
	}

	@Then("^Selects Payment Method for CI$")
	public void selects_Payment_Method_for_CI() throws Throwable {
		Payment.selects_Payment_Method_for_CI();
	}

	@Then("^Selects Frequency for Critical Illness Product \"([^\"]*)\"$")
	public void selects_Frequency_for_Critical_Illness_Product(String frequency) throws Throwable {
		Payment.selects_Frequency_for_Critical_Illness_Product(frequency);
	}

	@Then("^Selects Payment Method for HMI$")
	public void selects_Payment_Method_for_HMI() throws Throwable {
		Payment.selects_Payment_Method_for_HMI();
	}

	@Then("^Selects Payment option as Bill Me$")
	public void selects_Payment_option_as_Bill_Me() throws Throwable {
		Payment.selects_Payment_option_as_Bill_Me();
	}

	@Then("^Confirms I have read the Information Check Box on Payment Page$")
	public void confirms_I_have_read_the_Information_Check_Box_on_Payment_Page() throws Throwable {
		Payment.confirms_I_have_read_the_Information_Check_Box_on_Payment_Page();
	}
	
	@Then("^Confirms I authorize sunlife Check Box on Payment Page$")
	public void confirms_I_authorize_sunlife_Check_Box_on_Payment_Page() throws Throwable {
		Payment.confirms_I_authorize_SunLife_Check_Box_on_Payment_Page();
	}

	@Then("^Payment Authorization Letter is displayed to user and clicks on Continue$")
	public void payment_Authorization_Letter_is_displayed_to_user_and_clicks_on_Continue() throws Throwable {

		Signature.payment_Authorization_Letter_is_displayed_to_user_and_clicks_on_Continue();
	}

	@Then("^Signs Payment Authorization Letter$")
	public void signs_Payment_Authorization_Letter() throws Throwable {
		Signature.signs_Payment_Authorization_Letter();
	}

	@Then("^Selects Payment Method for TermLife$")
	public void selects_Payment_Method_for_TermLife() throws Throwable {
		Payment.selects_Payment_Method_for_TermLife();
	}

	@Then("^Selects Frequency for Term Life Product \"([^\"]*)\"$")
	public void selects_Frequency_for_Term_Life_Product(String frequency) throws Throwable {
		Payment.selects_Frequency_for_Term_Life_Product(frequency);
	}

	@Then("^Selects Payment Method for GTLI$")
	public void selects_Payment_Method_for_GTLI() throws Throwable {
		Payment.selects_Payment_Method_for_TermLife();
	}

	@Then("^Selects Frequency for GTLI Product \"([^\"]*)\"$")
	public void selects_Frequency_for_GTLI_Product(String frequency) throws Throwable {
		Payment.selects_Frequency_for_Term_Life_Product(frequency);
	}

	@Then("^Clicks on Payment Method for HLDD$")
	public void clicks_on_Payment_Method_for_HLDD() throws Throwable {
		Payment.selects_Payment_Method_for_ADDI();
	}

	@Then("^Selects Frequency for HLDD Product \"([^\"]*)\"$")
	public void selects_Frequency_for_HLDD_Product(String frequency) throws Throwable {
		Payment.selects_Frequency_for_Accidental_Death_Product_and_reviews(frequency);
	}

	@Then("^Clicks on Payment Method for DII$")
	public void clicks_on_Payment_Method_for_DII() throws Throwable {
		Payment.clicks_on_Payment_Method_for_DII();
	}

	@Then("^Selects Frequency for DII Product \"([^\"]*)\"$")
	public void selects_Frequency_for_DII_Product(String frequency) throws Throwable {
		Payment.selects_Frequency_for_DII_Product(frequency);
	}

	@Then("^Clicks on Payment Method for HII$")
	public void clicks_on_Payment_Method_for_HII() throws Throwable {
		Payment.selects_Payment_Method_for_HMI();
	}

	@Then("^Selects Frequency for HII Product \"([^\"]*)\"$")
	public void selects_Frequency_for_HII_Product(String frequency) throws Throwable {
		Payment.selects_Frequency_for_Hospital_Money_Insurance_Product_and_reviews(frequency);
	}
	
	@Then("^Selects Existing Bank Account$")
	public void selects_Existing_Bank_Acc() throws Throwable{
		Payment.selects_Existing_Bank_Acc();
	}

	/*************************
	 * RATE VERIFICATION
	 ****************************************/

	@Then("^Validates Estimated Premium for Self as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under FiveYTL$")
	public void validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_FiveYTL(String premium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_FiveYTL(premium, amount);
	}

	@Then("^Validates Estimated Premium for Spouse as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under FiveYTL$")
	public void validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_FiveYTL(String Spremium,
			String amount) throws Throwable {
		Payment.validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_FiveYTL(Spremium, amount);
	}

	@Then("^Validates Estimated Premium for Child as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under FiveYTL$")
	public void validates_Estimated_Premium_for_Child_as_for_Benefit_Amount_under_FiveYTL(String Cpremium,
			String amount) throws Throwable {
		Payment.validates_Estimated_Premium_for_Child_as_for_Benefit_Amount_under_FiveYTL(Cpremium, amount);
	}

	@Then("^Validates Total Premium as \"([^\"]*)\" under FiveYTL$")
	public void validates_Total_Premium_as_under_FiveYTL(String TotalAmt) throws Throwable {
		Payment.validates_Total_Premium_as_under_FiveYTL(TotalAmt);
	}

	@Then("^Validates Estimated Premium for Self as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under TenYTL$")
	public void validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_TenYTL(String premium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_TenYTL(premium, amount);
	}

	@Then("^Validates Estimated Premium for Spouse as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under TenYTL$")
	public void validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_TenYTL(String Spremium,
			String amount) throws Throwable {
		Payment.validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_TenYTL(Spremium, amount);
	}

	@Then("^Validates Estimated Premium for Child as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under TenYTL$")
	public void validates_Estimated_Premium_for_Child_as_for_Benefit_Amount_under_TenYTL(String Spremium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Child_as_for_Benefit_Amount_under_TenYTL(Spremium, amount);
	}

	@Then("^Validates Total Premium as \"([^\"]*)\" under TenYTL$")
	public void validates_Total_Premium_as_under_TenYTL(String TotalAmt) throws Throwable {
		Payment.validates_Total_Premium_as_under_TenYTL(TotalAmt);
	}

	@Then("^Validates Estimated Premium for Self as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under TwentyYTL$")
	public void validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_TwentyYTL(String premium,
			String amount) throws Throwable {
		Payment.validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_TwentyYTL(premium, amount);
	}

	@Then("^Validates Estimated Premium for Spouse as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under TwentyYTL$")
	public void validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_TwentyYTL(String Spremium,
			String amount) throws Throwable {
		Payment.validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_TwentyYTL(Spremium, amount);
	}

	@Then("^Validates Estimated Premium for Child as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under TwentyYTL$")
	public void validates_Estimated_Premium_for_Child_as_for_Benefit_Amount_under_TwentyYTL(String Spremium,
			String amount) throws Throwable {
		Payment.validates_Estimated_Premium_for_Child_as_for_Benefit_Amount_under_TwentyYTL(Spremium, amount);
	}

	@Then("^Validates Total Premium as \"([^\"]*)\" under TwentyYTL$")
	public void validates_Total_Premium_as_under_TwentyYTL(String TotalAmt) throws Throwable {
		Payment.validates_Total_Premium_as_under_TwentyYTL(TotalAmt);
	}

	@Then("^Validates Estimated Premium for Self as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under FiftyYTL$")
	public void validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_FiftyYTL(String premium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_FiftyYTL(premium, amount);
	}

	@Then("^Validates Estimated Premium for Spouse as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under FiftyYTL$")
	public void validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_FiftyYTL(String Spremium,
			String amount) throws Throwable {
		Payment.validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_FiftyYTL(Spremium, amount);
	}

	@Then("^Validates Total Premium as \"([^\"]*)\" under FiftyYTL$")
	public void validates_Total_Premium_as_under_FiftyYTL(String TotalAmt) throws Throwable {
		Payment.validates_Total_Premium_as_under_FiftyYTL(TotalAmt);
	}

	@Then("^Validates Estimated Premium for Self as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under ADDI$")
	public void validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_ADDI(String premium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_ADDI(premium, amount);
	}

	@Then("^Validates Estimated Premium for Spouse as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under ADDI$")
	public void validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_ADDI(String Spremium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_ADDI(Spremium, amount);
	}

	@Then("^Validates Estimated Premium for Child as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under ADDI$")
	public void validates_Estimated_Premium_for_Child_as_for_Benefit_Amount_under_ADDI(String Cpremium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Child_as_for_Benefit_Amount_under_ADDI(Cpremium, amount);
	}

	@Then("^Validates Total Premium as \"([^\"]*)\" under ADnD$")
	public void validates_Total_Premium_as_under_ADDI(String TotalAmt) throws Throwable {
		Payment.validates_Total_Premium_as_under_ADDI(TotalAmt);
	}

	@Then("^Validates Estimated Premium for Self as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under LTDPlus$")
	public void validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_LTDPlus(String premium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_LTDPlus(premium, amount);
	}

	@Then("^Validates Estimated Premium for Spouse as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under LTDPlus$")
	public void validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_LTDPlus(String Spremium,
			String amount) throws Throwable {
		Payment.validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_LTDPlus(Spremium, amount);
	}

	@Then("^Validates Total Premium as \"([^\"]*)\" under LTDPlus$")
	public void validates_Total_Premium_as_under_LTDPlus(String TotalAmt) throws Throwable {
		Payment.validates_Total_Premium_as_under_LTDPlus(TotalAmt);
	}

	@Then("^Validates Estimated Premium for Self as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under LTD$")
	public void validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_LTD(String premium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_LTD(premium, amount);
	}

	@Then("^Validates Estimated Premium for Spouse as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under LTD$")
	public void validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_LTD(String Spremium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_LTD(Spremium, amount);
	}

	@Then("^Validates Total Premium as \"([^\"]*)\" under LTD$")
	public void validates_Total_Premium_as_under_LTD(String TotalAmt) throws Throwable {
		Payment.validates_Total_Premium_as_under_LTD(TotalAmt);
	}

	@Then("^Validates Estimated Premium for Self as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under MTDI$")
	public void validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_MTDI(String premium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_MTDI(premium, amount);
	}

	@Then("^Validates Estimated Premium for Spouse as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under MTDI$")
	public void validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_MTDI(String Spremium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_MTDI(Spremium, amount);
	}

	@Then("^Validates Total Premium as \"([^\"]*)\" under MTDI$")
	public void validates_Total_Premium_as_under_MTDI(String TotalAmt) throws Throwable {
		Payment.validates_Total_Premium_as_under_MTDI(TotalAmt);
	}

	@Then("^Validates Estimated Premium for Self as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under RDI$")
	public void validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_RDI(String premium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_RDI(premium, amount);
	}

	@Then("^Validates Total Premium as \"([^\"]*)\" under RDI$")
	public void validates_Total_Premium_as_under_RDI(String TotalAmt) throws Throwable {
		Payment.validates_Total_Premium_as_under_RDI(TotalAmt);
	}

	@Then("^Validates Estimated Premium for Self as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under POEDI$")
	public void validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_POEDI(String premium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_POEDI(premium, amount);
	}

	@Then("^Validates Total Premium as \"([^\"]*)\"under POEDI$")
	public void validates_Total_Premium_as_under_POEDI(String TotalAmt) throws Throwable {
		Payment.validates_Total_Premium_as_under_POEDI(TotalAmt);
	}

	@Then("^Validates Estimated Premium for Self as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under HMI$")
	public void validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_HMI(String premium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_HMI(premium, amount);
	}

	@Then("^Validates Estimated Premium for Spouse as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under HMI$")
	public void validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_HMI(String Spremium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_HMI(Spremium, amount);
	}

	@Then("^Validates Estimated Premium for Child as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under HMI$")
	public void validates_Estimated_Premium_for_Child_as_for_Benefit_Amount_under_HMI(String Cpremium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Child_as_for_Benefit_Amount_under_HMI(Cpremium, amount);
	}

	@Then("^Validates Total Premium as \"([^\"]*)\" under HMI$")
	public void validates_Total_Premium_as_under_HMI(String TotalAmt) throws Throwable {
		Payment.validates_Total_Premium_as_under_HMI(TotalAmt);
	}

	@Then("^Validates Estimated Premium for Self as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under CI$")
	public void validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_CI(String premium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_CI(premium, amount);
	}

	@Then("^Validates Estimated Premium for Spouse as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under CI$")
	public void validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_CI(String Spremium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_CI(Spremium, amount);
	}

	@Then("^Validates Total Premium as \"([^\"]*)\" under CI$")
	public void validates_Total_Premium_as_under_CI(String TotalAmt) throws Throwable {
		Payment.validates_Total_Premium_as_under_CI(TotalAmt);
	}

	@Then("^Validates Estimated Premium for Self as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under TermLife$")
	public void validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_TermLife(String premium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_TermLife(premium, amount);
	}

	@Then("^Validates Estimated Premium for Spouse as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under TermLife$")
	public void validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_TermLife(String Spremium,
			String amount) throws Throwable {
		Payment.validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_TermLife(Spremium, amount);
	}

	@Then("^Validates Estimated Premium for Child as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under TermLife$")
	public void validates_Estimated_Premium_for_Child_as_for_Benefit_Amount_under_TermLife(String Cpremium,
			String amount) throws Throwable {
		Payment.validates_Estimated_Premium_for_Child_as_for_Benefit_Amount_under_TermLife(Cpremium, amount);
	}

	@Then("^Validates Total Premium as \"([^\"]*)\" under TermLife$")
	public void validates_Total_Premium_as_under_TermLife(String TotalAmt) throws Throwable {
		Payment.validates_Total_Premium_as_under_TermLife(TotalAmt);
	}
	
	@Then("^Validates Estimated Cost for Self as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under GTLI$")
	public void validates_Estimated_Cost_for_Self_as_for_Benefit_Amount_under_GTLI(String premium, String amount)throws Throwable {
		Payment.validates_Estimated_Cost_for_Self_as_for_Benefit_Amount_under_GTLI(premium, amount);
	}

	@Then("^Validates Estimated Cost for Spouse as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under GTLI$")
	public void validates_Estimated_Cost_for_Spouse_as_for_Benefit_Amount_under_GTLI(String Spremium,String amount) throws Throwable {
		Payment.validates_Estimated_Cost_for_Spouse_as_for_Benefit_Amount_under_GTLI(Spremium, amount);
	}

	@Then("^Validates Estimated Cost for Child as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under GTLI$")
	public void validates_Estimated_Cost_for_Child_as_for_Benefit_Amount_under_GTLI(String Cpremium,String amount) throws Throwable {
		Payment.validates_Estimated_Cost_for_Child_as_for_Benefit_Amount_under_GTLI(Cpremium, amount);
	}

	@Then("^Validates Total Cost as \"([^\"]*)\" under GTLI$")
	public void validates_Total_Cost_as_under_GTLI(String TotalAmt) throws Throwable {
		Payment.validates_Total_Cost_as_under_GTLI(TotalAmt);
	}

	@Then("^Validates Estimated Premium for Self as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\"under HLDD$")
	public void validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_HLDD(String premium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_ADDI(premium, amount);
	}

	@Then("^Validates Estimated Premium for Spouse as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under HLDD$")
	public void validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_HLDD(String Spremium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_ADDI(Spremium, amount);
	}

	@Then("^Validates Estimated Premium for Child as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under HLDD$")
	public void validates_Estimated_Premium_for_Child_as_for_Benefit_Amount_under_HLDD(String Cpremium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Child_as_for_Benefit_Amount_under_ADDI(Cpremium, amount);
	}

	@Then("^Validates Total Premium as \"([^\"]*)\" under HLDD$")
	public void validates_Total_Premium_as_under_HLDD(String TotalAmt) throws Throwable {
		Payment.validates_Total_Premium_as_under_ADDI(TotalAmt);
	}

	@Then("^Validates Estimated Premium for Self as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under DII$")
	public void validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_DII(String premium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Self_as_for_Benefit_Amount_under_DII(premium, amount);
	}

	@Then("^Validates Estimated Premium for Spouse as \"([^\"]*)\" for Benefit Amount \"([^\"]*)\" under DII$")
	public void validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_DII(String Spremium, String amount)
			throws Throwable {
		Payment.validates_Estimated_Premium_for_Spouse_as_for_Benefit_Amount_under_DII(Spremium, amount);
	}

	@Then("^Validates Total Premium as \"([^\"]*)\" under DII$")
	public void validates_Total_Premium_as_under_DII(String TotalAmt) throws Throwable {
		Payment.validates_Total_Premium_as_under_DII(TotalAmt);
	}

	@Then("^Validates Estimated Premium is not available under HII$")
	public void validates_Estimated_Premium_is_not_available_under_HII() throws Throwable {
		Payment.validates_Estimated_Premium_is_not_available_under_HII();
	}
	
	@Then("^Select Yes Radio button for account holder$")
	public void clicks_on_Yes_Account_Holder() throws Throwable{
		Payment.clicks_on_Yes_Account_Holder();
	}
	
	@Then("^Validates Estimated Premium for Self under GTLP75I as \"([^\"]*)\"$")
	public void validate_the_estimated_cost_values_For_GTLP75I_Self(String TotalAmt) throws Throwable {
		Payment.validate_the_estimated_cost_values_For_GTLP75I_Self(TotalAmt);
	}
	
	@Then("^Validates Estimated Premium for Spouse under GTLP75I as \"([^\"]*)\"$")
	public void validate_the_estimated_cost_values_For_GTLP75I_Spouse(String TotalAmt) throws Throwable {
		Payment.validate_the_estimated_cost_values_For_GTLP75I_Spouse(TotalAmt);
	}
	
	@Then("^Validates Estimated Premium for Tax under GTLP75I as \"([^\"]*)\"$")
	public void validate_the_estimated_cost_values_For_GTLP75I_ProvincialTax(String TotalAmt) throws Throwable {
		Payment.validate_the_estimated_cost_values_For_GTLP75I_ProvincialTax(TotalAmt);
	}
	
	@Then("^Validates Total Premium under GTLP75I as \"([^\"]*)\"$")
	public void validate_the_estimated_cost_values_For_GTLP75I_Total(String TotalAmt) throws Throwable {
		Payment.validate_the_estimated_cost_values_For_GTLP75I_Total(TotalAmt);
	}
	
	@Then("^User enters Details for Card as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_enters_Details_for_Card_as(String Fname, String Lname, String Cnum, String ExpDate)
			throws Throwable {
		Payment.user_enters_Details_for_Card_as(Fname, Lname, Cnum, ExpDate);

	}
	
	@Then("^Validates Estimated Premium for Self under Flex10 as \"([^\"]*)\"$")
	public void validate_the_estimated_cost_values_For_Flex10_Self(String TotalAmt) throws Throwable {
		Payment.validate_the_estimated_cost_values_For_Flex10_Self(TotalAmt);
	}
	
	@Then("^Validates Estimated Premium for Spouse under Flex10 as \"([^\"]*)\"$")
	public void validate_the_estimated_cost_values_For_Flex10_Spouse(String TotalAmt) throws Throwable {
		Payment.validate_the_estimated_cost_values_For_Flex10_Spouse(TotalAmt);
	}
	
	@Then("^Validates Estimated Premium for Tax under Flex10 as \"([^\"]*)\"$")
	public void validate_the_estimated_cost_values_For_Flex10_ProvincialTax(String TotalAmt) throws Throwable {
		Payment.validate_the_estimated_cost_values_For_Flex10_ProvincialTax(TotalAmt);
	}
	
	@Then("^Validates Total Premium under Flex10 as \"([^\"]*)\"$")
	public void validate_the_estimated_cost_values_For_Flex10_Total(String TotalAmt) throws Throwable {
		Payment.validate_the_estimated_cost_values_For_Flex10_Total(TotalAmt);
	}
	
	@Then("^Validates Estimated Premium for Self under Flex20 as \"([^\"]*)\"$")
	public void validate_the_estimated_cost_values_For_Flex20_Self(String TotalAmt) throws Throwable {
		Payment.validate_the_estimated_cost_values_For_Flex20_Self(TotalAmt);
	}
	
	@Then("^Validates Estimated Premium for Spouse under Flex20 as \"([^\"]*)\"$")
	public void validate_the_estimated_cost_values_For_Flex20_Spouse(String TotalAmt) throws Throwable {
		Payment.validate_the_estimated_cost_values_For_Flex20_Spouse(TotalAmt);
	}
	
	@Then("^Validates Estimated Premium for Tax under Flex20 as \"([^\"]*)\"$")
	public void validate_the_estimated_cost_values_For_Flex20_ProvincialTax(String TotalAmt) throws Throwable {
		Payment.validate_the_estimated_cost_values_For_Flex20_ProvincialTax(TotalAmt);
	}
	
	@Then("^Validates Total Premium under Flex20 as \"([^\"]*)\"$")
	public void validate_the_estimated_cost_values_For_Flex20_Total(String TotalAmt) throws Throwable {
		Payment.validate_the_estimated_cost_values_For_Flex20_Total(TotalAmt);
	}

	/*****************************************************************/

	@Then("^Clicks on OK button$")
	public void clicks_on_OK_button() throws Throwable {
		BeneficiaryPage.clicks_on_OK_button();

	}

	@Then("^Delete First Contingent Beneficiary$")
	public void delete_First_Contingent_Beneficiary() throws Throwable {
		BeneficiaryPage.delete_First_Contingent_Beneficiary();

	}

	@Then("^User Enters Beneficiary details as \"([^\"]*)\",\"([^\"]*)\"$")
	public void user_Enters_Beneficiary_details_as(String Trust, String Datetrust) throws Throwable {
		BeneficiaryPage.user_Enters_Beneficiary_details_as(Trust, Datetrust);

	}

	@Then("^Statement of Health page one is displayed to user and answeres as No for all questions on both pages for Self$")
	public void statement_of_Health_page_one_is_displayed_to_user_and_answeres_as_No_for_all_questions_on_both_pages_for_Self()
			throws Throwable {
		HealthPage.statement_of_Health_page_one_is_displayed_to_user_and_answeres_as_No_for_all_questions_on_both_pages_for_Self();

	}

	@Then("^Statement of Health page two is displayed to user and answeres as No for all questions on both pages for Self$")
	public void statement_of_Health_page_two_is_displayed_to_user_and_answeres_as_No_for_all_questions_on_both_pages_for_Self()
			throws Throwable {
		HealthPage.statement_of_Health_page_two_is_displayed_to_user_and_answeres_as_No_for_all_questions_on_both_pages_for_Self();

	}

	@Then("^Statement of Health page one is displayed to user and answeres as No for all questions on both pages for Spouse$")
	public void statement_of_Health_page_one_is_displayed_to_user_and_answeres_as_No_for_all_questions_on_both_pages_for_Spouse()
			throws Throwable {
		HealthPage.statement_of_Health_page_one_is_displayed_to_user_and_answeres_as_No_for_all_questions_on_both_pages_for_Self();

	}

	@Then("^Statement of Health page two is displayed to user and answeres as No for all questions on both pages for Spouse$")
	public void statement_of_Health_page_two_is_displayed_to_user_and_answeres_as_No_for_all_questions_on_both_pages_for_Spouse()
			throws Throwable {
		HealthPage.statement_of_Health_page_two_is_displayed_to_user_and_answeres_as_No_for_all_questions_on_both_pages_for_Self();

	}

	@Then("^Almost done page is displayed to user$")
	public void almost_done_page_is_displayed_to_user() throws Throwable {
		basicInfo.almost_done_page_is_displayed_to_user();

	}

	@Then("^Your Insurance Request Decision Page is displayed to user$")
	public void your_Insurance_Request_Decision_Page_is_displayed_to_user() throws Throwable {
		basicInfo.your_Insurance_Request_Decision_Page_is_displayed_to_user();
	}

	@Then("^Clicks on Save button$")
	public void clicks_on_Save_button() throws Throwable {
		Payment.clicks_on_Save_button();

	}

	@Then("^Clicks on button to Save for later$")
	public void clicks_on_Save_for_later_button() throws Throwable {
		EligibilityPage.clicks_on_Save_for_later_button();
	}

	@When("^Clicks on Login in saved application and Enter stored EmailId and \"([^\"]*)\" and clicks retrive$")
	public void clicks_on_Login_in_saved_application_and_Enter_strored_email_and(String Password) throws Throwable {
		basicInfo.clicks_on_Login_in_saved_application_and_Enter_emailId_and(Password);
	}
	
	@Then("^Clicks on Login in saved application and Enter stored EmailId and \"([^\"]*)\" and clicks retrive under CAT$")
	public void clicks_on_Login_in_saved_application_and_Enter_stored_EmailId_and_and_clicks_retrive_under_CAT(String Password) throws Throwable {
		basicInfo.clicks_on_Login_in_saved_application_and_Enter_emailId_Under_CAT(Password);
	}

	@Then("^Refresh the browser$")
	public void refresh_the_browser() throws Throwable {
		reuseMethod.RefreshBrowser();
	}

	/*------Mayuri start-------*/

	@Then("^User enters Details for Bank Account as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_enters_Details_for_Bank_Account_as(String Bank, String AccName, String Rnum, String Anum)
			throws Throwable {
		Payment.user_enters_Details_for_Bank_Account_as(Bank, AccName, Rnum, Anum);

	}
	/*----------------------------------------- Mobile Application-------------------------------------------*/

	/*----------------------------------- BasicPage--------------------------*/
	@Then("^Let’s get started page is displayed and enters login details as Username and \"([^\"]*)\"$")
	public void let_s_get_started_page_is_displayed_and_enters_login_details_as(String Password) throws Throwable {
		basicInfo.let_s_get_started_page_is_displayed_and_enters_login_details_as_Mobile(Password);

	}

	// ********************************Eligibility Page
	// Mobile***********************************//

	@Then("^Eligibility page details are displayed to user and enters details as  \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void eligibility_page_details_are_displayed_to_user_and_enters_details_as(String Fname, String Lname,
			String MM, String DD, String YYYY, String Address, String WorkHr, String Mstatus) throws Throwable {
		EligibilityPage.eligibility_page_details_are_displayed_to_user_and_enters_details_as_Mobile(Fname, Lname, MM,
				DD, YYYY, Address, WorkHr, Mstatus);
	}

	@Then("^Select Member Associaton as No for self$")
	public void select_Member_Associaton_as_No_for_self() throws Throwable {
		EligibilityPage.select_Self_Member_Associaton_as_NO_Mobile();

	}

	@Then("^Select Member Associaton as YES for self$")
	public void select_Member_Associaton_as_YES_for_self() throws Throwable {
		EligibilityPage.select_Self_Member_Associaton_as_YES_Mobile();
	}

	@Then("^Select Dependent as YES for self$")
	public void select_Dependent_as_YES_for_Self() throws Throwable {
		EligibilityPage.select_Dependent_as_YES_for_Self_Mobile();
	}
	@Then("^Select Dependent as NO for self$")
	public void select_Dependent_as_NO_for_Self() throws Throwable {
		EligibilityPage.select_Dependent_as_NO_for_Self_Mobile();
	}

	@Then("^Change address as \"([^\"]*)\"$")
	public void change_address_as(String address1) throws Throwable {
		EligibilityPage.change_address_as_Mobile(address1);
	}

	@Then("^User enters year as \"([^\"]*)\" on eligibility page for Self$")
	public void user_enters_year_as_on_eligibility_page_for_Self(String NYYYY) throws Throwable {
		EligibilityPage.user_enters_year_as_on_eligibility_page_Self_Mobile(NYYYY);
	}

	@Then("^Enter DOB details for Self as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_DOB_details_for_Self_as(String MM, String DD, String YYYY) throws Throwable {
		EligibilityPage.enter_DOB_details_as_on_eligibility_page_Self_Mobile(MM, DD, YYYY);
	}

	// ************************Spouse**********************//
	@Then("^Clicks Spouse Member Association as NO$")
	public void clicks_Spouse_Member_Association_as_NO() throws Throwable {
		EligibilityPage.clicks_Spouse_Member_Association_as_NO_Mobile();

	}

	@Then("^Clicks Spouse Member Association as YES$")
	public void clicks_Spouse_Member_Association_as_YES() throws Throwable {
		EligibilityPage.clicks_Spouse_Member_Association_as_YES_Mobile();

	}

	@Then("^Validate Custom Message about Spouse as a Member$")
	public void validate_Custom_Message_about_Spouse_as_a_Member() throws Throwable {
		EligibilityPage.validate_Custom_Message_about_Spouse_as_a_Member_Mobile();
	}

	@Then("^select spouse eligibility as YES and enter details as  \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
	public void select_spouse_eligibility_as_YES_and_enter_details_as(String Sfname, String Slname, String SMM,
			String SDD, String SYYYY, String SWorkHr) throws Throwable {
		EligibilityPage.select_spouse_eligibility_as_YES_and_enter_details_as_Mobile(Sfname, Slname, SMM, SDD, SYYYY,
				SWorkHr);
	}

	@Then("^Spouse Eligibility page is displayed select NO for spouse$")
	public void spouse_Eligibility_page_is_displayed_select_NO_for_spouse() throws Throwable {

		EligibilityPage.spouse_Eligibility_page_is_displayed_select_NO_for_spouse();
	}

	@Then("^Spouse Eligibility page is displayed$")
	public void spouse_Eligibility_page_is_displayed() throws Throwable {
		EligibilityPage.spouse_Eligibility_page_is_displayed_Mobile();
	}

	@Then("^User enters year as \"([^\"]*)\" on eligibility page for Spouse$")
	public void user_enters_year_as_on_eligibility_page_for_Spouse(String NSYYYY) throws Throwable {
		EligibilityPage.user_enters_year_as_on_eligibility_page_Spouse_Mobile(NSYYYY);

	}

	@Then("^Enter DOB details for Spouse as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void enter_DOB_details_for_Spouse_as(String MM, String DD, String SYYYY) throws Throwable {
		EligibilityPage.enter_DOB_as_on_eligibility_page_Spouse_Mobile(MM, DD, SYYYY);
	}

	// *******************Child***************************//

	@Then("^Click on ADD ANOTHER CHILD button$")
	public void click_on_Add_Another_Child_button() throws Throwable {
		EligibilityPage.click_on_Add_Child_button();
	}

	@Then("^Child Eligibility page is displayed select \"([^\"]*)\" for child$")
	public void child_Eligibility_page_is_displayed_select_for_child(String Celigi) throws Throwable {
		EligibilityPage.child_Eligibility_page_is_displayed_Mobile();
		EligibilityPage.select_eligibility_for_child_Mobile(Celigi);

	}

	@Then("^enter details for child as  \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void and_enter_details_for_child_as(String Cfname, String Clname, String CMM, String CDD, String CYYYY)
			throws Throwable {
		EligibilityPage.enter_details_for_child_as_Mobile(Cfname, Clname, CMM, CDD, CYYYY);
	}

	@Then("^Select Sex as \"([^\"]*)\" and Married as \"([^\"]*)\" for child$")
	public void select_Sex_as_and_Married_as_for_child(String cgender, String CMarried) throws Throwable {
		EligibilityPage.select_child_Sex_and_Married_as_Mobile(cgender, CMarried);
	}

	@Then("^Select Full time student as \"([^\"]*)\" for child$")
	public void select_Full_time_student_as_for_child(String CFull) throws Throwable {
		EligibilityPage.select_Full_time_student_as_for_child_Mobile(CFull);
	}

	@Then("^Child Eligibility page is displayed and enter year details for child as \"([^\"]*)\"$")
	public void child_Eligibility_page_is_displayed_and_enter_year_details_for_child(String Cyyyy) throws Throwable {
		EligibilityPage.child_Eligibility_page_is_displayed_Mobile();
		EligibilityPage.enter_year_details_for_child_mobile(Cyyyy);
	}

	@Then("^enter details for second child as \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void and_enter_details_for_second_child_as(String Cfname1, String Clname1, String CMM1, String CDD1,
			String CYYYY1) throws Throwable {
		EligibilityPage.enter_details_for_second_child_as_Mobile(Cfname1, Clname1, CMM1, CDD1, CYYYY1);
	}

	@Then("^enter details for third child as \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void and_enter_details_for_third_child_as(String Cfname2, String Clname2, String CMM2, String CDD2,
			String CYYYY2) throws Throwable {
		EligibilityPage.enter_details_for_third_child_as_Mobile(Cfname2, Clname2, CMM2, CDD2, CYYYY2);
	}

	@Then("^enter details for fourth child as \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void and_enter_details_for_fourth_child_as(String Cfname3, String Clname3, String CMM3, String CDD3,
			String CYYYY3) throws Throwable {
		EligibilityPage.enter_details_for_fourth_child_as_Mobile(Cfname3, Clname3, CMM3, CDD3, CYYYY3);
	}

	@Then("^enter details for fifth child as \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void and_enter_details_for_fifth_child_as(String Cfname4, String Clname4, String CMM4, String CDD4,
			String CYYYY4) throws Throwable {
		EligibilityPage.enter_details_for_fifth_child_as_Mobile(Cfname4, Clname4, CMM4, CDD4, CYYYY4);
	}

	@Then("^enter details for sixth child as \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void and_enter_details_for_sixth_child_as(String Cfname5, String Clname5, String CMM5, String CDD5,
			String CYYYY5) throws Throwable {
		EligibilityPage.enter_details_for_sixth_child_as_Mobile(Cfname5, Clname5, CMM5, CDD5, CYYYY5);
	}

	@Then("^enter details for seventh child as \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void and_enter_details_for_seventh_child_as(String Cfname6, String Clname6, String CMM6, String CDD6,
			String CYYYY6) throws Throwable {
		EligibilityPage.enter_details_for_seventh_child_as_Mobile(Cfname6, Clname6, CMM6, CDD6, CYYYY6);
	}

	@Then("^enter details for eighth child as \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void and_enter_details_for_eighth_child_as(String Cfname7, String Clname7, String CMM7, String CDD7,
			String CYYYY7) throws Throwable {
		EligibilityPage.enter_details_for_eighth_child_as_Mobile(Cfname7, Clname7, CMM7, CDD7, CYYYY7);
	}

	@Then("^Select Sex as \"([^\"]*)\" and Married as \"([^\"]*)\" for second child$")
	public void select_Sex_as_and_Married_as_for_second_child(String cgender1, String CMarried1) throws Throwable {
		EligibilityPage.select_child_Sex_and_Married_as_for_second_child_Mobile(cgender1, CMarried1);
	}

	@Then("^Select Sex as \"([^\"]*)\" and Married as \"([^\"]*)\" for third child$")
	public void select_Sex_as_and_Married_as_for_third_child(String cgender2, String CMarried2) throws Throwable {
		EligibilityPage.select_child_Sex_and_Married_as_for_third_child_Mobile(cgender2, CMarried2);
	}

	@Then("^Select Sex as \"([^\"]*)\" and Married as \"([^\"]*)\" for fourth child$")
	public void select_Sex_as_and_Married_as_for_fourth_child(String cgender3, String CMarried3) throws Throwable {
		EligibilityPage.select_child_Sex_and_Married_as_for_fourth_child_Mobile(cgender3, CMarried3);
	}

	@Then("^Select Sex as \"([^\"]*)\" and Married as \"([^\"]*)\" for fifth child$")
	public void select_Sex_as_and_Married_as_for_fifth_child(String cgender, String CMarried) throws Throwable {
		EligibilityPage.select_child_Sex_and_Married_as_fifth_child_Mobile(cgender, CMarried);
	}

	@Then("^Select Sex as \"([^\"]*)\" and Married as \"([^\"]*)\" for sixth child$")
	public void select_Sex_as_and_Married_as_for_sixth_child(String cgender, String CMarried) throws Throwable {
		EligibilityPage.select_child_Sex_and_Married_as_sixth_child_Mobile(cgender, CMarried);
	}

	@Then("^Select Sex as \"([^\"]*)\" and Married as \"([^\"]*)\" for seventh child$")
	public void select_Sex_as_and_Married_as_for_seventh_child(String cgender, String CMarried) throws Throwable {
		EligibilityPage.select_child_Sex_and_Married_as_seventh_child_Mobile(cgender, CMarried);
	}

	@Then("^Select Sex as \"([^\"]*)\" and Married as \"([^\"]*)\" for eighth child$")
	public void select_Sex_as_and_Married_as_for_eighth_child(String cgender, String CMarried) throws Throwable {
		EligibilityPage.select_child_Sex_and_Married_as_eighth_child_Mobile(cgender, CMarried);
	}

	@Then("^Select Full time student as \"([^\"]*)\" for second child$")
	public void select_Full_time_student_as_for_second_child(String CFull) throws Throwable {
		EligibilityPage.select_Full_time_student_as_for_second_child_Mobile(CFull);
	}

	@Then("^Select Full time student as \"([^\"]*)\" for third child$")
	public void select_Full_time_student_as_for_third_child(String CFull) throws Throwable {
		EligibilityPage.select_Full_time_student_as_for_third_child_Mobile(CFull);
	}

	@Then("^Select Full time student as \"([^\"]*)\" for fourth child$")
	public void select_Full_time_student_as_for_fourth_child(String CFull) throws Throwable {
		EligibilityPage.select_Full_time_student_as_for_fourth_child_Mobile(CFull);
	}

	@Then("^Select Full time student as \"([^\"]*)\" for fifth child$")
	public void select_Full_time_student_as_for_fifth_child(String CFull) throws Throwable {
		EligibilityPage.select_Full_time_student_as_for_fifth_child_Mobile(CFull);
	}

	@Then("^Select Full time student as \"([^\"]*)\" for sixth child$")
	public void select_Full_time_student_as_for_sixth_child(String CFull) throws Throwable {
		EligibilityPage.select_Full_time_student_as_for_sixth_child_Mobile(CFull);
	}

	@Then("^Select Full time student as \"([^\"]*)\" for seventh child$")
	public void select_Full_time_student_as_for_seventhchild(String CFull) throws Throwable {
		EligibilityPage.select_Full_time_student_as_for_seventh_child_Mobile(CFull);
	}

	@Then("^Select Full time student as \"([^\"]*)\" for eighth child$")
	public void select_Full_time_student_as_for_eighth_child(String CFull) throws Throwable {
		EligibilityPage.select_Full_time_student_as_for_eighth_child_Mobile(CFull);
	}

	@Then("^Click on Delete button for third child$")
	public void click_on_Delete_button_for_third_child() throws Throwable {
		EligibilityPage.click_on_Delete_button_for_third_child_Mobile();
	}

	@Then("^Click on Delete button for second child$")
	public void click_on_Delete_button_for_second_child() throws Throwable {
		EligibilityPage.click_on_Delete_button_for_second_child_Mobile();
	}

	@Then("^verify that Child Expandable button is not available$")
	public void verify_that_Child_Expandable_button_is_not_available() throws Throwable {
		EligibilityPage.validates_Add_Child_Button_on_Eligibility_page_is_not_present();
	}

	@Then("^Enter DOB details for child as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void enter_DOB_details_for_child_as(String CMM, String CDD, String Cyyyy) throws Throwable {
		EligibilityPage.enter_DOB_details_for_child_mobile(CMM, CDD, Cyyyy);
	}
	// ************************************Product Page Mobile*****************************************//

	// *****************Select All Products*******************//

	@Then("^Product page is displayed with product list$")
	public void product_page_is_displayed_with_product_list() throws Throwable {
		ProductPage.Product_Page_is_displayed_Mobile();
	}

	@Then("^Deselect Self for Short Term and Long Term$")
	public void Deselect_Self_for_Short_Term_Long_Term_and_Business_Overhead() throws Throwable {
		ProductPage.Select_Self_for_Short_Term_Life_Insurance_Mobile();
		ProductPage.Select_Self_for_Long_Term_Life_Insurance_Mobile();

	}

	@Then("^Deselect Child for Traditional Term Life Insurance$")
	public void deselect_child_for_Traditional_product() throws Throwable {
		ProductPage.Select_child_for_Traditional_Term_Life_Insurance_Mobile();
	}

	@Then("^Deselect Spouse for Short Term and Long Term$")
	public void Deselect_Spouse_for_Short_Term_and_Long_Term() throws Throwable {
		ProductPage.Select_Spouse_for_Short_Term_Life_Insurance_Mobile();
		ProductPage.Select_Spouse_for_Long_Term_Life_Insurance_Mobile();

	}

	@Then("^Validate that Traditional TLI, TenYTL, TwentyYTL and Business OEI are available for Self only$")
	public void validate_that_Traditional_TLI_TenYTL_TwentyYTL_and_Business_OEI_are_available_for_Self_only()
			throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TermLife_Mobile();
		ProductPage.validates_that_Self_is_displayed_for_TenYTL_Mobile();
		ProductPage.validates_that_Self_is_displayed_for_TwentyYTL_Mobile();
		ProductPage.validates_that_Self_is_displayed_for_BOE_Mobile();

	}

	@Then("^Validate that self is not available for Traditional TLI, TenYTL, TwentyYTL and Business OEI$")
	public void validate_that_self_is_not_available_for_Traditional_TLI_TenYTL_TwentyYTL_and_Business_OEI()
			throws Throwable {
		ProductPage.validates_that_Self_is_not_displayed_for_TermLife_Mobile();
		ProductPage.validates_that_Self_is_not_displayed_for_TenYTL_Mobile();
		ProductPage.validates_that_Self_is_not_displayed_for_TwentyYTL_Mobile();

	}

	@Then("^Select all members for all products$")
	public void Select_all_members_for_all_products() throws Throwable {
		ProductPage.Product_page_is_displayed_with_product_list_And_select_all_members_for_all_products_Mobile();
	}

	@Then("^Your product questions page is displayed and select the checkbox as NO for all the questions for group term life insurance$")
	public void your_product_questions_page_is_displayed_and_select_the_checkbox_as_NO_for_all_the_questions_for_group_term_life_insurance()
			throws Throwable {
		ProductPage
				.Your_product_questions_page_is_displayed_And_select_the_checkbox_and_NO_for_all_the_questions_for_group_term_life_insurance_Mobile();

	}

	@Then("^Your product questions page is displayed and Select No and enter the details for All Group Disability Insurance for self as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void Your_product_questions_page_is_displayed_and_Select_No_and_enter_the_details_for_All_Group_Disability_Insurance_for_self_as(
			String Income, String Expense, String BusExp) throws Throwable {
		ProductPage
				.Your_product_questions_page_is_displayed_Select_No_and_enter_the_details_for_Long_OR_Short_Term_Insurance_for_self_as_Mobile(
						Income);
		ProductPage
				.Your_product_questions_page_is_displayed_Select_No_and_enter_the_details_for_Business_Overhead_for_self_as_Mobile(
						Expense, BusExp);
	}

	@Then("^Your product questions page is displayed select Yes for group term life insurance questions$")
	public void your_product_questions_page_is_displayed_select_Yes_for_group_term_life_insurance_questions()
			throws Throwable {
		ProductPage
				.your_product_questions_page_is_displayed_select_Yes_for_group_term_life_insurance_questions_Mobile();

	}

	@Then("^Your product questions page is displayed and Select No and enter the details for Business Overhead for self as \"([^\"]*)\",\"([^\"]*)\"$")
	public void your_product_questions_page_is_displayed_and_Select_No_and_enter_the_details_for_Business_Overhead_for_self_as(
			String Expense, String BusExp) throws Throwable {
		ProductPage
				.Your_product_questions_page_is_displayed_Select_No_and_enter_the_details_for_Business_Overhead_for_self_as_Mobile(
						Expense, BusExp);
	}

	@Then("^Your product questions page is displayed and select NO and enter the details for Group Disability Insurance for self as \"([^\"]*)\"$")
	public void your_product_questions_page_is_displayed_and_select_NO_and_enter_the_details_for_Long_Term_Group_Disability_Insurance_for_self_as(
			String Income) throws Throwable {
		ProductPage
				.Your_product_questions_page_is_displayed_Select_No_and_enter_the_details_for_Long_OR_Short_Term_Insurance_for_self_as_Mobile(
						Income);
	}

	@Then("^enter detail for self for group term life insurance question as \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_detail_for_self_for_group_term_life_insurance_question_as(String Totalamtinforce,
			String Totalamtpending, String Company) throws Throwable {
		ProductPage.enter_detail_for_Self_group_term_life_insurance_question_as_Mobile(Totalamtinforce, Totalamtpending,
				Company);
	}

	@Then("^Your product questions page is displayed Select Yes and enter details for self for group disability questions as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void your_product_questions_page_is_displayed_Select_Yes_and_enter_details_for_self_for_group_disability_questions_as(
			String GDImonthlyincome, String GDIcompany1, String GDIMonthlybenamt1, String GDIBenperiod1,
			String GDIReplaced1) throws Throwable {
		ProductPage.select_Yes_and_enter_details_for_self_for_Long_OR_Short_Term_group_disability_question_as_Mobile(
				GDImonthlyincome, GDIcompany1, GDIMonthlybenamt1, GDIBenperiod1, GDIReplaced1);
	}

	@Then("^Your product questions page is displayed and select YES for all the questions and enter details for Business Overhead \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void your_product_questions_page_is_displayed_and_select_YES_for_all_the_questions_and_enter_details_for_Business_Overhead(
			String BOEmonthbusexp, String Percentmonthbusexp, String GDIcompany2, String GDIMonthlybenamt2,
			String GDIBenperiod2, String GDIReplaced2) throws Throwable {

		ProductPage.select_Yes_and_enter_details_for_self_for_Business_Overhead_question_as_Mobile(BOEmonthbusexp,
				Percentmonthbusexp, GDIcompany2, GDIMonthlybenamt2, GDIBenperiod2, GDIReplaced2);
	}

	@Then("^Spouse Product questions page is displayed And select the checkbox NO for all the questions for group term life insurance$")
	public void spouse_Product_questions_page_is_displayed_And_select_the_checkbox_NO_for_all_the_questions_for_group_term_life_insurance()
			throws Throwable {
		ProductPage
				.spouse_Product_questions_page_is_displayed_And_select_the_checkbox_NO_for_group_term_life_insurance_for_all_the_questions_Mobile();
	}

	@Then("^Spouse Product questions page is displayed And select the checkbox and YES for all the questions and enter details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void spouse_Product_questions_page_is_displayed_And_select_the_checkbox_and_YES_for_all_the_questions_and_enter_details(
			String STotalamtinforce, String STotalamtpending, String SCompany, String SGDImonthlyincome,
			String SGDIcompany1, String SGDIMonthlybenamt1, String SGDIBenperiod1, String SGDIReplaced1)
			throws Throwable {
		ProductPage
				.spouse_Product_questions_page_is_displayed_And_select_the_checkbox_and_YES_for_all_the_questions_and_enter_details_Mobile(
						STotalamtinforce, STotalamtpending, SCompany, SGDImonthlyincome, SGDIcompany1,
						SGDIMonthlybenamt1, SGDIBenperiod1, SGDIReplaced1);
	}

	@Then("^Spouse product questions page is displayed and select NO for other insurance questions and enter detail \"([^\"]*)\"$")
	public void spouse_product_questions_page_is_displayed_and_select_NO_for_other_insurance_questions_and_enter_detail(
			String SIncome) throws Throwable {
		ProductPage
				.spouse_product_questions_page_is_displayed_and_select_NO_for_other_insurance_questions_and_enter_detail_Mobile(
						SIncome);
	}

	@Then("^Select Self, Spouse and Child for Traditional Term Life Insurance$")
	public void Select_Self_Spouse_Child_Traditional_Term_Life_Insurance() throws Throwable {

		ProductPage.Select_Self_for_Traditional_Term_Life_Insurance_Mobile();
		ProductPage.Select_Spouse_for_Traditional_Term_Life_Insurance_Mobile();
		ProductPage.Select_child_for_Traditional_Term_Life_Insurance_Mobile();

	}

	@Then("^Select Self, Spouse for Traditional Term Life Insurance$")
	public void select_Self_Spouse_for_Traditional_Term_Life_Insurance() throws Throwable {

		ProductPage.Select_Self_for_Traditional_Term_Life_Insurance_Mobile();
		ProductPage.Select_Spouse_for_Traditional_Term_Life_Insurance_Mobile();
	}

	@Then("^Select Self, Spouse for Ten Year Level Term Life Insurance$")
	public void select_Self_Spouse_for_Ten_Year_Level_Term_Life_Insurance() throws Throwable {

		ProductPage.Select_self_for_Ten_Year_Insurance_Mobile();
		ProductPage.Select_Spouse_for_Ten_Year_Insurance_Mobile();
	}

	@Then("^Select Self, Spouse for Twenty Year Level Term Life Insurance$")
	public void select_Self_Spouse_for_Twenty_Year_Level_Term_Life_Insurance() throws Throwable {

		ProductPage.Select_Self_for_Twenty_Year_Life_Insurance_Mobile();
		ProductPage.Select_Spouse_for_Twenty_Year_Life_Insurance_Mobile();
	}

	@Then("^Select Self for Business Overhead Expense Insurance$")
	public void select_Self_for_Business_Overhead_Expense_Insurance() throws Throwable {

		ProductPage.Select_self_for_Business_Overhead_Mobile();
	}

	@Then("^Select Self, Spouse for Long Term Disability Insurance$")
	public void select_Self_Spouse_for_Long_Term_Disability_Insurance() throws Throwable {

		ProductPage.Select_Self_for_Long_Term_Life_Insurance_Mobile();
		ProductPage.Select_Spouse_for_Long_Term_Life_Insurance_Mobile();
	}

	@Then("^Select Self, Spouse for Short Term Disability Insurance$")
	public void select_Self_Spouse_for_Short_Term_Disability_Insurance() throws Throwable {

		ProductPage.Select_Self_for_Short_Term_Life_Insurance_Mobile();
		ProductPage.Select_Spouse_for_Short_Term_Life_Insurance_Mobile();
	}

	@Then("^select the NY Imp Info checkbox$")
	public void select_the_NY_Imp_Info_checkbox() throws Throwable {
		ProductPage.select_the_NY_Imp_Info_checkbox_mobile();
	}

	@Then("^Validate the content of NY Imp Replacement Info$")
	public void validate_the_content_of_Ny_Replacemenet_Info() throws Throwable {
		ProductPage.validate_the_content_of_Ny_Replacemenet_Info_mobile();
	}

	@Then("^Verify the note for NY is displayed$")
	public void verify_the_note_for_NY_is_displayed() throws Throwable {
		ProductPage.verify_the_note_for_NY_is_displayed_mobile();
	}

	@Then("^Validate that Long Term DI, Short Term DI and Business OEI are available$")
	public void validate_that_Long_Term_DI_Short_Term_DI_and_Business_OEI_are_available() throws Throwable {

		ProductPage.validate_that_Long_Term_is_available_Mobile();
		ProductPage.validate_that_Short_Term_is_available_Mobile();
		ProductPage.validate_that_Business_OEI_is_available_Mobile();
	}

//TIE
	@Then("^Verify Error message is displayed for Important Replacement Information CheckBox is Mandatory$")
	public void verify_Error_message_is_displayed_for_Important_Replacement_Information_CheckBox_is_Mandatory()
			throws Throwable {
		ProductPage.verify_Error_message_is_displayed_for_Important_Replacement_Information_CheckBox_is_Mandatory();
	}

	@Then("^Validate that Long Term DI, Short Term DI and Business OEI are available for Self$")
	public void validate_that_Long_Term_DI_Short_Term_DI_and_Business_OEI_are_available_for_Self() throws Throwable {

		ProductPage.validates_that_Self_is_displayed_for_LongTerm_Mobile();
		ProductPage.validates_that_Self_is_displayed_for_ShortTerm_Mobile();
		ProductPage.validates_that_Self_is_displayed_for_BOE_Mobile();
	}

	@Then("^Validate that Traditional, TenYTL and TwentyYTL products of group term are available for Self$")
	public void validate_that_Traditional_TenYTL_TwentyYTL_products_of_group_term_are_available_for_self()
			throws Throwable {

		ProductPage.validates_that_Self_is_displayed_for_TermLife_Mobile();
		ProductPage.validates_that_Self_is_displayed_for_TenYTL_Mobile();
		ProductPage.validates_that_Self_is_displayed_for_TwentyYTL_Mobile();

	}

	@Then("^Validate that Traditional, TenYTL and TwentyYTL products of group term are available$")
	public void validate_that_Traditional_TenYTL_TwentyYTL_products_of_group_term_are_available() throws Throwable {

		ProductPage.validate_that_Traditional_TLI_is_available_Mobile();
		ProductPage.validate_that_TenYTL_is_available_Mobile();
		ProductPage.validate_that_TwentyYTL_is_available_Mobile();

	}

	@Then("^Select Self for all the Products$")
	public void select_Self_for_all_the_Products() throws Throwable {
		ProductPage.select_Self_for_all_the_Products_Mobile();

	}

	@Then("^Select Spouse for Traditional, TenYTL, TwentyYTL, LongTerm and ShortTerm Products$")
	public void select_Spouse_for_Traditional_TenYTL_TwentyYTL_LongTerm_and_ShortTerm_Products() throws Throwable {
		ProductPage.select_Spouse_for_Traditional_TenYTL_TwentyYTL_LongTerm_and_ShortTerm_Products_Mobile();
	}
	/*
	 * @Then("^Select Self for Short Term Disability Insurance$") public void
	 * select_Self_for_Short_Term_Disability_Insurance() throws Throwable {
	 * ProductPage.expand_Short_Term_Life_Insurance_Mobile();
	 * ProductPage.Select_Self_for_Short_Term_Life_Insurance_Mobile(); }
	 */

	@Then("^enter details for self for group disability questions as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_details_for_self_for_group_disability_question_as(String GDImonthlyincome, String GDIcompany1,
			String GDIMonthlybenamt1, String GDIBenperiod1, String GDIReplaced1) throws Throwable {
		ProductPage.select_Yes_and_enter_details_for_self_for_Long_OR_Short_Term_group_disability_question_as_Mobile(
				GDImonthlyincome, GDIcompany1, GDIMonthlybenamt1, GDIBenperiod1, GDIReplaced1);
	}

	@Then("^Select Self for Group Term Life Insurance product$")
	public void select_Self_for_Group_Term_coverage_or_Traditional_Term_coverage() throws Throwable {
		ProductPage.Select_Self_for_Traditional_Term_Life_Insurance_Mobile();
	}

	@Then("^Select Self for Group Disability Insurance$")
	public void select_Self_for_Group_Disability_Insurance_or_Long_Term_coverage() throws Throwable {

		ProductPage.Select_Self_for_Long_Term_Life_Insurance_Mobile();
	}

//Group Term product of RUAA is same as Traditional product of APTA
	@Then("^Validate that Self is available for Group Term$")
	public void validate_that_Self_is_displayed_for_Group_Term_coverage() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TermLife_Mobile();
	}

	@Then("^Validate that Group Term product is available$")
	public void validate_that_Group_Term_product_is_available() throws Throwable {
		ProductPage.Group_Term_Life_Insurance_product_is_available_RUAA_Mobile();
	}
//Group Disability product of RUAA is same as Long Term product of APTA
	@Then("^Validate that Self is available for Group Disablity Insurance$")
	public void validate_that_that_Self_is_displayed_for_Group_Disability_Insurance() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_LongTerm_Mobile();
	}
	
	@Then("^Validate that Group Disablity Insurance product is not available$")
	public void validate_that_that_Group_Disability_Insurance_is_not_available() throws Throwable {
		ProductPage.validates_that_LongTerm_is_not_avaialble_Mobile();
	}
	
	@Then("^Validate that Group Disablity Insurance is available$")
	public void validate_that_Group_Disability_Insurance_is_available() throws Throwable {
		ProductPage.Group_disability_Insurance_product_is_available_RUAA_Mobile();
	}
	
	@Then("^Validate that Group Term Life Insurance and Group Disability Income Insurance products are available$")
	public void validate_that_Group_Term_and_Group_Disability_Insurance_is_available() throws Throwable {
		ProductPage.Group_Term_Life_Insurance_product_is_available_RUAA_Mobile();
		ProductPage.Group_disability_Insurance_product_is_available_RUAA_Mobile();
	}
	 
	@Then("^Verify that Child button is available for Traditional Term Life Insurance$")
	public void verify_that_Child_button_is_available_for_Traditional_Term_Life_Insurance() throws Throwable {
		ProductPage.verify_that_Child_button_is_available_for_Traditional_Term_Life_Insurance_Mobile();

	}

	@Then("^Verify that Child button is available for Group Term Life Insurance$")
	public void verify_that_Child_button_is_available_for_Group_Term_Life_Insurance() throws Throwable {
		ProductPage.verify_that_Child_button_is_available_for_Traditional_Term_Life_Insurance_Mobile();

	}
	@Then("^Validate that No product is available for Spouse$")
	public void validate_that_No_product_is_available_for_Spouse() throws Throwable {
		ProductPage.validate_that_spouse_is_not_displayed_for_Traditional_Mobile();
		ProductPage.validate_that_spouse_is_not_displayed_for_TenYear_Mobile();
		ProductPage.validate_that_spouse_is_not_displayed_for_TwentyYear_Mobile();
		ProductPage.validate_that_spouse_is_not_displayed_for_LongTerm_Mobile();
		ProductPage.validate_that_spouse_is_not_displayed_for_ShortTerm_Mobile();
	}

//**************************CHILD ***********************//
	@Then("^Select Child for Traditional Term Life Insurance$")
	public void select_Child_for_Traditional_Term_Life_Insurance() throws Throwable {

		ProductPage.Select_child_for_Traditional_Term_Life_Insurance_Mobile();
	}

	@Then("^Validate Dependent only Pop up message and click on ok$")
	public void validate_Dependent_only_Pop_up_message_and_click_on_ok() throws Throwable {
		ProductPage.validate_Dependent_only_Pop_up_message_and_click_on_ok_Mobile();

	}

	@Then("^Verify the Dependent Note Displayed on Popup Window of Dependent Coverage$")
	public void verify_the_Dependent_Note_Displayed_on_Popup_Window_of_Dependent_Coverage() throws Throwable {
		ProductPage.verify_the_Dependent_Note_Displayed_on_Popup_Window_of_Dependent_Coverage();
	}

	@Then("^Clicks on OK Button on Dependent Coverage Window$")
	public void clicks_on_OK_Button_on_Dependent_Coverage_Window() throws Throwable {
		ProductPage.clicks_on_OK_Button_on_Dependent_Coverage_Window();
	}


//**************************** SELF AND CHILD RUAA PRODUCT PAGE MOBILE ***********************************//

	@Then("^Select Child for Group Term Life Insurance$")
	public void select_Child_for_Group_Term_Life_Insurance() throws Throwable {
		ProductPage.Select_child_for_Traditional_Term_Life_Insurance_Mobile();
	}
	


//**********************************Coverage Page Mobile******************************************//

	// *******************SELF********************//

	@Then("^Your Coverage page is displayed$")
	public void your_Coverage_page_is_displayed() throws Throwable {
		CoveragePage.your_Coverage_page_is_displayed();
	}

	@Then("^Select the amount for all coverages for self as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_the_amount_for_all_coverages_for_self_as(String Benefit, String Benefit1, String Benefit2,
			String Benefit3, String Benefit4, String GDIwait, String GDIduration, String SDIwait, String SDIduration1,
			String BOEwait, String BOEduration) throws Throwable {
		CoveragePage.select_the_amount_for_all_coverages_for_self_as_Mobile(Benefit, Benefit1, Benefit2, Benefit3,
				Benefit4, GDIwait, GDIduration, SDIwait, SDIduration1, BOEwait, BOEduration);
	}

	@Then("^Select the amount of Traditional Term coverage for self as \"([^\"]*)\"$")
	public void select_the_amount_of_Traditional_Term_coverage_for_self_as(String Benefit) throws Throwable {

		CoveragePage.select_the_amount_of_Traditional_Term_coverage_for_self_as_Mobile(Benefit);

	}

	@Then("^Select the amount of TenYTL coverage for self as \"([^\"]*)\"$")
	public void select_the_amount_of_TenYTL_coverage_for_self_as(String Benefit1) throws Throwable {
		CoveragePage.select_the_amount_of_Ten_Year_coverage_for_self_as_Mobile(Benefit1);
	}

	@Then("^Select the amount of TwentyYTL coverage for self as \"([^\"]*)\"$")
	public void select_the_amount_of_TwentyYTL_coverage_for_self_as(String Benefit2) throws Throwable {
		CoveragePage.select_the_amount_of_Twenty_Year_coverage_for_self_as_Mobile(Benefit2);
	}

	@Then("^Select the amount of Long Term Disability Insurance coverage for self as \"([^\"]*)\" and enter details \"([^\"]*)\", \"([^\"]*)\"$")
	public void select_the_amount_of_Long_Term_Disability_Insurance_coverage_for_self_as_and_enter_details_and_Select_check_box_for_BOTH_riders(
			String Benefit3, String GDIwait, String GDIduration) throws Throwable {
		CoveragePage.select_the_amount_of_Long_Term_coverage_for_self_as_Mobile(Benefit3, GDIwait, GDIduration);
	}

	@Then("^Select the amount of Short Term Disability Insurance coverage for self as \"([^\"]*)\" and enter details \"([^\"]*)\", \"([^\"]*)\"$")
	public void select_the_amount_of_Short_Term_Disability_Insurance_coverage_for_self_as_and_enter_details(
			String Benefit4, String SDIwait, String SDIduration1) throws Throwable {
		CoveragePage.select_the_amount_of_Short_Term_coverage_for_self_as_Mobile(Benefit4, SDIwait, SDIduration1);
	}

	@Then("^Select the amount of Business Overhead Expense Insurance coverage for self as \"([^\"]*)\" and enter details \"([^\"]*)\", \"([^\"]*)\"$")
	public void select_the_amount_of_Business_Overhead_Expense_Insurance_coverage_for_self_as_and_enter_details(
			String Benefit5, String BOEwait, String BOEduration) throws Throwable {
		CoveragePage.select_the_amount_of_Business_Overhead_coverage_for_self_as_Mobile(Benefit5, BOEwait, BOEduration);
	}

	@Then("^Select checkbox for BOTH riders COLA and CDB for self$")
	public void select_check_box_for_BOTH_riders_COLA_and_CDB_for_self() throws Throwable {
		CoveragePage.Select_BOTH_rider_Checkbox_COLA_and_CDB_self_Mobile();
	}

	@Then("^Validate min and max values for Short Term DI for self \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validate_min_and_max_values_for_Short_Term_DI_for_self_to(String STMin, String STMax) throws Throwable {
		CoveragePage.validate_min_and_max_values_for_Short_Term_for_self_Mobile(STMin, STMax);
	}

	@Then("^Validate min and max values for Long Term for self as \"([^\"]*)\", \"([^\"]*)\"$")
	public void validate_min_and_max_values_for_Long_Term_for_self_as(String LTMin, String LTMax) throws Throwable {
		CoveragePage.validate_min_and_max_values_for_Long_Term_for_self_as_Mobile(LTMin, LTMax);
	}

	@Then("^Validate min and max values of Traditional TLI for Self as \"([^\"]*)\", \"([^\"]*)\"$")
	public void validate_min_and_max_values_of_Traditional_TLI_for_Self_as(String Min1, String Max1) throws Throwable {
		CoveragePage.validate_min_and_max_values_for_Traditional_insurance_for_self_Mobile(Min1, Max1);
	}

	@Then("^validate min and max values of TenYTL for Self as \"([^\"]*)\", \"([^\"]*)\"$")
	public void validate_min_and_max_values_of_TenYTL_for_Self_as(String TYMin, String TYMax) throws Throwable {
		CoveragePage.validate_min_and_max_values_for_TenYR_for_self_Mobile(TYMin, TYMax);
	}

	@Then("^validate min and max values of TwentyYTL for Self as \"([^\"]*)\", \"([^\"]*)\"$")
	public void validate_min_and_max_values_of_TwentyYTL_for_Self_as(String TYMin, String TYMax) throws Throwable {
		CoveragePage.validate_min_and_max_values_for_TwentyYTL_for_self_Mobile(TYMin, TYMax);
	}

	@Then("^Validate min and max values of Business Overhead Expenses for Self as \"([^\"]*)\", \"([^\"]*)\"$")
	public void validate_min_and_max_values_of_Business_Overhead_Expenses_for_Self_as(String TYMin, String TYMax)
			throws Throwable {
		CoveragePage.validate_min_and_max_values_for_BOE_for_self_Mobile(TYMin, TYMax);
	}

	@Then("^Select the amount of Group Disability Insurance coverage as \"([^\"]*)\",\"([^\"]*)\"$")
	public void select_the_amount_of_Group_Disability_Insurance_coverage_as(String Benefit, String GDIwait)
			throws Throwable {
		CoveragePage.select_the_amount_of_Group_Disability_Insurance_coverage_as(Benefit, GDIwait);
	}

	@Then("^Validate min and max values of Group Term for Self as \"([^\"]*)\", \"([^\"]*)\"$")
	public void validate_min_and_max_values_of_Group_Term_for_Self_as(String Min1, String Max1) throws Throwable {
		CoveragePage.validate_min_and_max_values_for_Traditional_insurance_for_self_Mobile(Min1, Max1);
	}

//Group Term Coverage of RUAA is same as Traditional Product of APTA
	@Then("^Select the amount of Group Term coverage for self as \"([^\"]*)\"$")
	public void select_the_amount_of_Group_Term_coverage_for_self_as(String Benefit) throws Throwable {
		CoveragePage.select_the_amount_of_Traditional_Term_coverage_for_self_as_Mobile(Benefit);
	}

	@Then("^Validate min and max values for Group Disability for self as \"([^\"]*)\", \"([^\"]*)\"$")
	public void validate_min_and_max_values_for_Group_Disability_for_self_as(String LTMin, String LTMax)
			throws Throwable {
		CoveragePage.validate_min_and_max_values_for_Long_Term_for_self_as_Mobile(LTMin, LTMax);
	}
	@Then("^Verify that Benefit duration for Group Disability Insurance as \"([^\"]*)\" for Self$")
	public void verify_Benefit_duration_value_displayed_for_Self_Group_Disability_Insurance(String duration)throws Throwable {
		CoveragePage.verify_Benefit_duration_value_displayed_Mobile(duration);
	}
	
	// ***********************Spouse**************//

	@Then("^Spouse Coverage page is displayed$")
	public void spouse_Coverage_page_is_displayed() throws Throwable {
		CoveragePage.Spouse_Coverage_page_is_displayed_Mobile();
	}

	@Then("^Select the amount of all coverage for spouse as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_the_amount_of_all_coverage_for_spouse_as(String SBenefit, String SBenefit1, String SBenefit2,
			String SBenefit3, String SBenefit4, String SGDIwait, String SGDIduration, String SSDIwait,
			String SSDIduration1) throws Throwable {
		CoveragePage.select_the_amount_of_All_coverage_for_spouse_as_Mobile(SBenefit, SBenefit1, SBenefit2, SBenefit3,
				SBenefit4, SGDIwait, SGDIduration, SSDIwait, SSDIduration1);
	}

	@Then("^Select the amount of Traditional Term coverage for spouse as \"([^\"]*)\"$")
	public void select_the_amount_of_Traditional_Term_coverage_for_spouse_as(String SBenefit) throws Throwable {
		CoveragePage.select_the_amount_of_Traditional_Term_coverage_for_spouse_as_Mobile(SBenefit);
	}

	@Then("^Select the amount of TenYTL coverage for Spouse as \"([^\"]*)\"$")
	public void select_the_amount_of_TenYTL_coverage_for_Spouse_as(String SBenefit1) throws Throwable {
		CoveragePage.select_the_amount_of_Ten_Year_coverage_for_spouse_as_Mobile(SBenefit1);
	}

	@Then("^Select the amount of TwentyYTL coverage for Spouse as \"([^\"]*)\"$")
	public void select_the_amount_of_TwentyYTL_coverage_for_Spouse_as(String SBenefit2) throws Throwable {
		CoveragePage.select_the_amount_of_Twenty_Year_coverage_for_spouse_as_Mobile(SBenefit2);

	}

	@Then("^Enter the details of Long Term Disability Insurance coverage for Spouse as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void enter_the_details_of_Long_Term_Disability_Insurance_coverage_for_Spouse_as(String SBenefit3,
			String SGDIwait, String SGDIduration) throws Throwable {
		CoveragePage.select_the_amount_of_Long_Term_coverage_for_spouse_as_Mobile(SBenefit3, SGDIwait, SGDIduration);
	}

	@Then("^Select check box for BOTH riders COLA and CDB for Spouse$")
	public void select_check_box_for_BOTH_riders_COLA_and_CDB_for_Spouse() throws Throwable {
		CoveragePage.Select_BOTH_rider_Checkbox_COLA_and_CDB_Spouse_Mobile();
	}

	@Then("^Enter the details of Short Term Disability Insurance coverage for Spouse as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void enter_the_details_of_Short_Term_Disability_Insurance_coverage_for_Spouse_as(String SBenefit4,
			String SSDIwait, String SSDIduration1) throws Throwable {
		CoveragePage.select_the_amount_of_Short_Term_coverage_for_spouse_as_Mobile(SBenefit4, SSDIwait, SSDIduration1);
	}

	@Then("^Validate min and max values for Short Term DI for spouse \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validate_min_and_max_values_for_Short_Term_DI_for_spouse_to(String STMin1, String STMax1)
			throws Throwable {
		CoveragePage.validate_min_and_max_values_for_Short_Term_for_spouse_to_Mobile(STMin1, STMax1);
	}

	@Then("^Validate min and max values for Long Term DI for spouse \"([^\"]*)\" to \"([^\"]*)\"$")
	public void validate_min_and_max_valuesfor_Long_Term_DI_for_spouse_to(String LTMin1, String LTMax1)
			throws Throwable {
		CoveragePage.validate_min_and_max_values_for_Long_Term_for_spouse_to_Mobile(LTMin1, LTMax1);
	}

	@Then("^validate min and max values of Traditional TLI for Spouse as \"([^\"]*)\", \"([^\"]*)\"$")
	public void validate_min_and_max_values_of_Traditional_TLI_for_Spouse_as(String TMin1, String TMax1)
			throws Throwable {
		CoveragePage.validate_min_and_max_values_for_Traditional_Insurance_for_spouse_Mobile(TMin1, TMax1);
	}

	@Then("^validate min and max values of TenYTL for Spouse as \"([^\"]*)\", \"([^\"]*)\"$")
	public void validate_min_and_max_values_of_TenYTL_for_Spouse_as(String STYMin, String STYMax) throws Throwable {
		CoveragePage.validate_min_and_max_values_for_Ten_Year_Insurance_for_spouse_Mobile(STYMin, STYMax);
	}

	@Then("^validate min and max values of TwentyYTL for Spouse as \"([^\"]*)\", \"([^\"]*)\"$")
	public void validate_min_and_max_values_of_TwentyYTL_for_Spouse_as(String STYMin, String STYMax) throws Throwable {
		CoveragePage.validate_min_and_max_values_for_Twenty_Year_Insurance_for_spouse_Mobile(STYMin, STYMax);
	}

	@Then("^Validate message for spouse displayed in blue box in coverage page$")
	public void validate_message_for_spouse_displayed_in_blue_box_in_coverage_page() throws Throwable {
		CoveragePage.validate_message_for_spouse_displayed_in_blue_box_in_coverage_page();
	}

	// *********************Child******************//
	@Then("^Select the amount of child coverage as \"([^\"]*)\" under Traditional Term Life$")
	public void select_the_amount_of_child_coverage_as_under_TermLife(String CBenefit) throws Throwable {
		CoveragePage.select_the_amount_of_child_coverage_as_TermLife_Mobile(CBenefit);
	}

	@Then("^Child Coverage page is displayed$")
	public void child_Coverage_page_is_displayed() throws Throwable {
		CoveragePage.child_coverage_page_is_dispalyed_Mobile();
	}

	@Then("^Validate that Child Name \"([^\"]*)\" is eligible for Child coverage$")
	public void validate_that_Child_Name_is_Eligible_for_Child_coverage(String CNameEli) throws Throwable {
		CoveragePage.validate_that_Child_Name_is_Eligible_for_Child_coverage_Mobile(CNameEli);
	}

	@Then("^Validate that \"([^\"]*)\" is Child coverage amount under Traditional Term Life$")
	public void validate_that_is_Child_coverage_amount_Traditional_Term_Life(String CAmount) throws Throwable {
		CoveragePage.validate_that_is_Child_coverage_amount_dropdown_under_Traditional_Mobile(CAmount);
	}
	
	@Then("^Validate that \"([^\"]*)\" is Child coverage amount under Group Term Life$")
	public void validate_that_is_Child_coverage_amount_under_Group_Term_Life(String CAmount) throws Throwable {
		CoveragePage.validate_that_is_Child_coverage_amount_dropdown_under_Traditional_Mobile(CAmount);
	}

	@Then("^Verify that Eligible Child Names as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" under Traditional Term Life$")
	public void verify_that_Eligible_Child_Names_as_under_TermLife(String CNameEli1, String CNameEli2, String CNameEli3,
			String CNameEli4) throws Throwable {
		CoveragePage.validate_that_Child_Name_is_Eligible_for_Child_coverage_Mobile(CNameEli1);
		CoveragePage.validate_that_Child_Name_is_Eligible_for_Child_coverage_Mobile(CNameEli2);
		CoveragePage.validate_that_Child_Name_is_Eligible_for_Child_coverage_Mobile(CNameEli3);
		CoveragePage.validate_that_Child_Name_is_Eligible_for_Child_coverage_Mobile(CNameEli4);
	}

	
	@Then("^Verify that Eligible Child Names as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" under Group Term Life$")
	public void verify_that_Eligible_Child_Names_as_under_TermLife(String CNameEli1, String CNameEli2, String CNameEli3) throws Throwable {
		CoveragePage.validate_that_Child_Name_is_Eligible_for_Child_coverage_Mobile(CNameEli1);
		CoveragePage.validate_that_Child_Name_is_Eligible_for_Child_coverage_Mobile(CNameEli2);
		CoveragePage.validate_that_Child_Name_is_Eligible_for_Child_coverage_Mobile(CNameEli3);


	}

//****************************Beneficiary page Mobile*************************************//

	@Then("^Your Beneficiary page displayed user select NO to the question$")
	public void your_Beneficiary_page_displayed_user_select_NO_to_the_question() throws Throwable {
		BeneficiaryPage.your_Beneficiary_page_displayed_user_select_NO_to_the_question_Mobile();
	}

	@Then("^Spouse Beneficiary page displayed user select NO to the question$")
	public void spouse_Beneficiary_page_displayed_user_select_NO_to_the_question() throws Throwable {
		BeneficiaryPage.spouse_Beneficiary_page_displayed_user_select_NO_to_the_question_Mobile();
	}

	@Then("^Your Beneficiary page displayed user select YES to the question$")
	public void your_Beneficiary_page_displayed_user_select_YES_to_the_question() throws Throwable {
		BeneficiaryPage.your_Beneficiary_page_displayed_user_select_YES_to_the_question_Mobile();
	}

	@Then("^Expand Traditional Term Life Insurance tab on beneficiary page for Self$")
	public void expand_Traditional_Term_Life_Insurance_tab_on_beneficiary_page() throws Throwable {

		BeneficiaryPage.expand_Traditional_Term_Life_Insurance_tab_on_beneficiary_page_for_self_Mobile();
	}

	@Then("^expand Ten-Year Level Term Life Insurance tab on beneficiary page for Self$")
	public void expand_Ten_Year_Level_Term_Life_Insurance_tab_on_beneficiary_page() throws Throwable {
		BeneficiaryPage.expand_Ten_Year_Life_Insurance_tab_on_beneficiary_page_for_self_Mobile();
	}

	@Then("^expand Twenty-Year Level Term Life Insurance tab on beneficiary page for Self$")
	public void expand_Twenty_Year_Level_Term_Life_Insurance_tab_on_beneficiary_page() throws Throwable {
		BeneficiaryPage.expand_Twenty_Year_Life_Insurance_tab_on_beneficiary_page_for_self_Mobile();
	}

	@Then("^Select first beneficiary, select Primary and Individual and enter details for self for Traditional product \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void select_first_beneficiary_select_Primary_and_Individual_and_enter_details_for_self_for_Traditional_Insurance(
			String BTrfname1, String BTrlname1, String BTrrelation1, String BTrpercent1) throws Throwable {
		BeneficiaryPage
				.select_first_beneficiary_select_Primary_and_Individual_and_enter_details_for_self_for_Traditional_Insurance_Mobile(
						BTrfname1, BTrlname1, BTrrelation1, BTrpercent1);
	}

	@Then("^Click ADD ANOTHER BENEFICIARY for Self for Traditional Insurance$")
	public void click_ADD_ANOTHER_BENEFICIARY_for_Traditional_Insurance() throws Throwable {
		BeneficiaryPage.click_Add_Another_Beneficiary_For_Self_Traditional_Insurance_Mobile();
	}

	@Then("^click ADD ANOTHER BENEFICIARY for Self Ten Year Insurance$")
	public void click_ADD_ANOTHER_BENEFICIARY_for_Ten_Year_Insurance() throws Throwable {
		BeneficiaryPage.click_Add_Another_Beneficiary_For_Self_Ten_Year_Insurance_Mobile();
	}

	@Then("^click ADD ANOTHER BENEFICIARY for Self Twenty Year Insurance$")
	public void click_ADD_ANOTHER_BENEFICIARY_for_Twenty_Year_Insurance() throws Throwable {
		BeneficiaryPage.click_Add_Another_Beneficiary_For_Self_Twenty_Year_Insurance_Mobile();
	}

	@Then("^Select second beneficiary, select Contingent and Individual and enter details for self for Traditional product as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void select_second_beneficiary_select_Contingent_and_Individual_and_enter_details_for_self_for_Traditional_product(
			String BTrfname2, String BTrlname2, String BTrrelation2, String BTrpercent2) throws Throwable {
		BeneficiaryPage.select_second_beneficiary_select_Contingent_and_Individual_and_enter_details_for_self_for_Traditional_product_Mobile(
						BTrfname2, BTrlname2, BTrrelation2, BTrpercent2);
	}

	@Then("^select first beneficiary, select Primary and Individual and select previous details for self for Ten Year Insurance \"([^\"]*)\",\"([^\"]*)\"$")
	public void select_first_beneficiary_select_Primary_and_Individual_and_select_previous_details_for_self_for_Ten_Year_Insurance(
			String BTnprevious, String BTnpercent) throws Throwable {
		BeneficiaryPage	.select_first_beneficiary_select_Primary_and_Individual_and_select_previous_details_for_self_for_Ten_Year_Insurance_Mobile(
						BTnprevious, BTnpercent);
	}

	@Then("^select first beneficiary, select Primary and Individual and enter New details for self for Ten Year Insurance \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
	public void select_first_beneficiary_select_Primary_and_Individual_and_enter_New_details_for_self_for_Ten_Year_Insurance(
			String BTrfname3, String BTrlname3, String BTrrelation3, String BTrpercent3) throws Throwable {
		BeneficiaryPage	.select_first_beneficiary_select_Primary_and_Individual_and_enter_New_details_for_self_for_Ten_Year_Insurance_Mobile(
						BTrfname3, BTrlname3, BTrrelation3, BTrpercent3);
	}

	@Then("^select second beneficiary, select Contingent and Trust and enter details for self for Ten Year Insurance\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_second_beneficiary_select_Contingent_and_Trust_and_enter_details_for_self_for_Ten_Year_Insurance(
			String BTnTrust, String BTnMM, String BTnDD, String BTnYYYY) throws Throwable {
		BeneficiaryPage	.select_second_beneficiary_select_Contingent_and_Trust_and_enter_details_for_self_for_Ten_Year_Insurance_Mobile(
						BTnTrust, BTnMM, BTnDD, BTnYYYY);
	}

	@Then("^select first beneficiary, select Primary and Trust and enter details for self for Twenty Year Insurance\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_first_beneficiary_select_Primary_and_Trust_and_enter_details_for_self_for_Twenty_Year_Insurance(
			String BTwTrust, String BTwMM, String BTwDD, String BTwYYYY) throws Throwable {
		BeneficiaryPage	.select_first_beneficiary_select_Primary_and_Trust_and_enter_details_for_self_for_Twenty_Year_Insurance(
						BTwTrust, BTwMM, BTwDD, BTwYYYY);
	}

	@Then("^select second beneficiary, select Contingent and Individual and enter details for self for Twenty Year Insurance \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void select_second_beneficiary_select_Contingent_and_Individual_and_enter_details_for_self_for_Twenty_Year_Insurance(
			String BTwfname, String BTwlname, String BTwrelation, String BTwpercent) throws Throwable {
		BeneficiaryPage	.select_second_beneficiary_select_Contingent_and_Individual_and_enter_details_for_self_for_Twenty_Year_Insurance(
						BTwfname, BTwlname, BTwrelation, BTwpercent);
	}

////Group Term Coverage of RUAA is same as Traditional Product of APTA
	@Then("^Expand Group Term tab on beneficiary page for Self$")
	public void expand_Group_Term_tab_on_beneficiary_page_for_Self() throws Throwable {
		BeneficiaryPage.expand_Traditional_Term_Life_Insurance_tab_on_beneficiary_page_for_self_Mobile();
	}

	@Then("^Select first beneficiary, select Primary and Individual and enter details for self for Group Term product as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void select_first_beneficiary_select_Primary_and_Individual_and_enter_details_for_self_for_Group_Term(
			String BTrfname1, String BTrlname1, String BTrrelation1, String BTrpercent1) throws Throwable {
		BeneficiaryPage	.select_first_beneficiary_select_Primary_and_Individual_and_enter_details_for_self_for_Traditional_Insurance_Mobile(
						BTrfname1, BTrlname1, BTrrelation1, BTrpercent1);
	}

	@Then("^Click ADD ANOTHER BENEFICIARY for Self for Group Term$")
	public void click_ADD_ANOTHER_BENEFICIARY_for_Self_for_Group_Term() throws Throwable {
		BeneficiaryPage.click_Add_Another_Beneficiary_For_Self_Traditional_Insurance_Mobile();
	}

	@Then("^Select second beneficiary, select Primary and Individual and enter details for self for Group Term product as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void select_second_beneficiary_select_Primary_and_Individual_and_enter_details_for_self_for_Group_Term_product_as(
			String BTrfname2, String BTrlname2, String BTrrelation2, String BTrpercent2) throws Throwable {
		BeneficiaryPage	.select_second_beneficiary_select_Primary_and_Individual_and_enter_details_for_self_for_Traditional_Insurance_Mobile(
						BTrfname2, BTrlname2, BTrrelation2, BTrpercent2);
	}
	
	/*@Then("^Select third beneficiary, select Primary and Individual and enter details for self for Group Term product as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void select_third_beneficiary_select_Primary_and_Individual_and_enter_details_for_self_for_Group_Term_product_as(
			String BTrfname3, String BTrlname3, String BTrrelation3, String BTrpercent3) throws Throwable {
		BeneficiaryPage	.select_third_beneficiary_select_Primary_and_Individual_and_enter_details_for_self_for_Traditional_Insurance_Mobile(BTrfname3, BTrlname3, BTrrelation3, BTrpercent3);
	}
*/
	@Then("^Select third beneficiary, select Contigent and Trust and enter details for Self for Group Term product as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_third_beneficiary_select_Contigent_and_Trust_and_enter_details_for_Self_as(String BTnTrust,
			String BTnMM, String BTnDD, String BTnYYYY) throws Throwable {
		BeneficiaryPage	.select_third_beneficiary_select_Contingent_and_Trust_and_enter_details_for_self_for_Group_Term_Mobile(
						BTnTrust, BTnMM, BTnDD, BTnYYYY);
	}
	
	/*@Then("^Select second beneficiary, select Contigent and Trust and enter details for Self for Group Term product as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_second_beneficiary_select_Contigent_and_Trust_and_enter_details_for_Self_as(String BTnTrust,
			String BTnMM, String BTnDD, String BTnYYYY) throws Throwable {
		BeneficiaryPage	.select_second_beneficiary_select_Contingent_and_Trust_and_enter_details_for_self_for_Group_Term_Mobile(BTnTrust, BTnMM, BTnDD, BTnYYYY);
	}*/

	@Then("^Select second beneficiary, select Primary and Individual and enter details for self for Group Term product as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
	public void select_second_beneficiary_select_Primary_and_Individual_and_enter_details_for_self_for_Group_Term_product_as(String BTrfname1, String BTrlname1, String BTrrelation1, String otherRel, String BTrpercent1) throws Throwable {
		BeneficiaryPage.select_second_beneficiary_select_Primary_and_Individual_and_enter_details_for_self_for_Traditional_Insurance_Mobile(BTrfname1, BTrlname1, BTrrelation1, otherRel, BTrpercent1);
	}
	/*@Then("^Verify that Contigent and Primary buttons are disabled on adding fourth beneficiary$")
	public void verify_that_Contigent_and_Primary_buttons_are_disabled() throws Throwable {
		BeneficiaryPage.verify_that_Contigent_and_Primary_buttons_are_disabled_on_adding_fourth_beneficiary_Mobile();
	}*/

	@Then("^Select third beneficiary, select Contingent and Individual and enter details for self for Group Term product as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void select_third_beneficiary_select_Contingent_and_Individual_and_enter_details_for_self_for_Group_Term_product_as(String BTrfname3, String BTrlname3, String BTrrelation3, String BTrpercent3) throws Throwable {
		BeneficiaryPage.select_third_beneficiary_select_Contingent_and_Individual_and_enter_details_for_self_for_Traditional_product_Mobile(BTrfname3, BTrlname3, BTrrelation3, BTrpercent3) ;
	}
	@Then("^Select fourth beneficiary, select Contingent and Individual and enter details for self for Group Term product as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void select_fourth_beneficiary_select_Contingent_and_Individual_and_enter_details_for_self_for_Group_Term_product_as(String BTrfname4, String BTrlname4, String BTrrelation4, String BTrpercent4) throws Throwable {
		BeneficiaryPage.select_fourth_beneficiary_select_Contingent_and_Individual_and_enter_details_for_self_for_Traditional_product_Mobile(BTrfname4, BTrlname4, BTrrelation4, BTrpercent4);
	}
	
	@Then("^click on Delete button for first Beneficiary for Self for Traditional Insurance$")
	public void click_on_Delete_button_for_First_Beneficiary_for_self_for_traditional_insurance() throws Throwable {
		BeneficiaryPage.click_on_Delete_button_for_First_Beneficiary_Mobile();
	}

	@Then("^click on Delete button for fourth Beneficiary for Self for Group Term Insurance$")
	public void click_on_Delete_button_for_fourth_Beneficiary_for_self_for_Group_term_insurance() throws Throwable {
		BeneficiaryPage.click_on_Delete_button_for_Fourth_Beneficiary_for_GroupTerm_Mobile();
	}

	@Then("^click on Delete button for fifth Beneficiary for Self for Group Term Insurance$")
	public void click_on_Delete_button_for_fifth_Beneficiary_for_self_for_Group_term_insurance() throws Throwable {
		BeneficiaryPage.click_on_Delete_button_for_Fifth_Beneficiary_for_GroupTerm_Mobile();
	}

	@Then("^Verify that Primary button is disabled for Group Term for Self while adding fifth beneficiary$")
	public void verify_that_Primary_button_is_disabled_for_Group_Term_while_addding_fifth_beneficiary_for_self() throws Throwable {
		BeneficiaryPage.fifth_primary_button_is_disabled_for_Traditional_Insurance_self_mobile();
	}
	
	@Then("^Verify that Contingent button is disabled for Group Term for Self while adding fifth beneficiary$")
	public void verify_that_Contingent_button_is_disabled_for_Group_Term_while_addding_fifth_beneficiary_for_self() throws Throwable {
		BeneficiaryPage.fifth_Contingent_button_is_disabled_for_Traditional_Insurance_self_mobile();
	}
	
	@Then("^Verify that Primary button is disabled for Traditional Insurance for Self for Second Beneficiary$")
	public void verify_that_Primary_button_is_disabled_for_Traditional_Insurance_for_self() throws Throwable {
		BeneficiaryPage.second_primary_button_is_disabled_for_Traditional_Insurance_self_mobile();
	}
	
	@Then("^Verify that Primary button is disabled for Group Term for Self for third Beneficiary$")
	public void verify_that_Primary_button_is_disabled_for_Group_term_Insurance_for_self_third_beneficiary() throws Throwable {
		BeneficiaryPage.third_primary_button_is_disabled_for_Traditional_Insurance_self_mobile();
	}
	
	@Then("^Verify that Trust is disabled for Group Term for Self for Fourth Beneficiary$")
	public void verify_that_trust_is_disabled_for_Group_term_Insurance_for_self_fourth_beneficiary() throws Throwable {
		BeneficiaryPage.fourth_trust_is_disabled_for_Traditional_Insurance_self_mobile();
	}

	@Then("^Verify that Second Primary button is disabled for Ten Year Insurance for Self$")
	public void verify_that_Second_Primary_button_is_disabled_for_Ten_Year_Insurance_for_self() throws Throwable {
		BeneficiaryPage.second_primary_button_is_disabled_for_TenYear_Insurance_self_mobile();
	}

	@Then("^Verify that Second Primary button is disabled for Twenty Year Insurance for Self$")
	public void verify_that_Second_Primary_button_is_disabled_for_Twenty_Year_Insurance_for_self() throws Throwable {
		BeneficiaryPage.second_primary_button_is_disabled_for_TwentyYear_Insurance_self_mobile();
	}

	@Then("^verify that Second Primary button is disabled for Traditional Insurance for Spouse$")
	public void verify_that_Second_Primary_button_is_disabled_for_Traditional_Insurance_for_Spouse() throws Throwable {
		BeneficiaryPage.second_primary_button_is_disabled_for_Traditional_Insurance_spouse_mobile();
	}

	@Then("^verify that Second Primary button is disabled for Ten Year Insurance for Spouse$")
	public void verify_that_Second_Primary_button_is_disabled_for_Ten_Year_Insurance_for_Spouse() throws Throwable {
		BeneficiaryPage.second_primary_button_is_disabled_for_TenYear_Insurance_spouse_mobile();
	}

	@Then("^verify that Second Primary button is disabled for Twenty Year Insurance for Spouse$")
	public void verify_that_Second_Primary_button_is_disabled_for_Twenty_Year_Insurance_for_Spouse() throws Throwable {
		BeneficiaryPage.second_primary_button_is_disabled_for_TwentyYear_Insurance_spouse_mobile();
	}

	@Then("^click on Delete button for first beneficiary of Twenty-Year Level Term Life for spouse$")
	public void click_on_Delete_button_for_first_beneficiary_of_Twenty_Year_Level_Term_Life_for_spouse()throws Throwable {
		BeneficiaryPage.click_on_Delete_button_for_first_beneficiary_of_Twenty_Year_Level_Term_Life_for_spouse();
	}

	@Then("^Verify that Primary button is enabled for Twenty Year Insurance for Spouse for third beneficiary$")
	public void verify_that_Primary_button_is_enabled_for_Twenty_Year_Insurance_for_Spouse_for_third_beneficiary()throws Throwable {
		BeneficiaryPage.third_primary_button_is_enabled_for_TwentyYear_Insurance_spouse_mobile();
	}
	
	@Then("^Enter individual beneficiary percentage for third beneficiary as \"([^\"]*)\" for Group Term$")
	public void enter_individual_beneficiary_percentage_for_third_beneficiary_as_for_Group_Term(String BTrpercent1) throws Throwable {
		BeneficiaryPage.enter_percentage_for_third_beneficiary_for_self_for_Traditional_Insurance_Mobile(BTrpercent1);
	}

//*********************** Beneficiary page Spouse Mobile ************************************//

	@Then("^Spouse Beneficiary page displayed user select YES to the question$")
	public void spouse_Beneficiary_page_displayed_user_select_YES_to_the_question() throws Throwable {
		BeneficiaryPage.spouse_Beneficiary_page_displayed_user_select_YES_to_the_question_Mobile();
	}

	@Then("^expand Traditional Term Life Insurance tab on beneficiary page for Spouse$")
	public void expand_Traditional_Term_Life_Insurance_tab_on_beneficiary_page_for_Spouse() throws Throwable {
		BeneficiaryPage.expand_Traditional_Term_Life_Insurance_tab_on_beneficiary_page_for_spouse_Mobile();
	}

	@Then("^select first beneficiary, select Primary and Individual and enter details for Spouse for Traditional Insurance\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void select_first_beneficiary_select_Primary_and_Individual_and_enter_details_for_Spouse_for_Traditional_Insurance(
			String SBTrfname1, String SBTrlname1, String SBTrrelation1, String SBTrpercent1) throws Throwable {
BeneficiaryPage	.select_first_beneficiary_select_Primary_and_Individual_and_enter_details_for_spouse_for_Traditional_Insurance_Mobile(SBTrfname1, SBTrlname1, SBTrrelation1, SBTrpercent1);
	}

	@Then("^click ADD ANOTHER BENEFICIARY for Spouse Traditional Insurance$")
	public void click_ADD_ANOTHER_BENEFICIARY_for_Spouse_Traditional_Insurance() throws Throwable {
		BeneficiaryPage.click_Add_Another_Beneficiary_For_Spouse_Traditional_Insurance_Mobile();
	}

	@Then("^select second beneficiary, select Contingent and Individual and enter details for Spouse for Traditional Insurance \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void select_second_beneficiary_select_Contingent_and_Individual_and_enter_details_for_Spouse_for_Traditional_Insurance(
			String SBTrfname2, String SBTrlname2, String SBTrrelation2, String SBTrpercent2) throws Throwable {
		BeneficiaryPage
				.select_second_beneficiary_select_Contingent_and_Individual_and_enter_details_for_spouse_for_Traditional_Insurance(
						SBTrfname2, SBTrlname2, SBTrrelation2, SBTrpercent2);
	}

	@Then("^expand Ten-Year Level Term Life Insurance tab on beneficiary page for Spouse$")
	public void expand_Ten_Year_Level_Term_Life_Insurance_tab_on_beneficiary_page_for_Spouse() throws Throwable {
		BeneficiaryPage.expand_Ten_Year_Life_Insurance_tab_on_beneficiary_page_for_spouse_Mobile();
	}

	@Then("^select first beneficiary, select Primary and Individual and select previous details for Spouse for Ten Year Insurance \"([^\"]*)\",\"([^\"]*)\"$")
	public void select_first_beneficiary_select_Primary_and_Individual_and_select_previous_details_for_Spouse_for_Ten_Year_Insurance(
			String SBTnprevious, String SBTnpercent) throws Throwable {
		BeneficiaryPage
				.select_first_beneficiary_select_Primary_and_Individual_and_select_previous_details_for_spouse_for_Ten_Year_Insurance_Mobile(
						SBTnprevious, SBTnpercent);
	}

	@Then("^click ADD ANOTHER BENEFICIARY for Spouse Ten Year Insurance$")
	public void click_ADD_ANOTHER_BENEFICIARY_for_Spouse_Ten_Year_Insurance() throws Throwable {
		BeneficiaryPage.click_Add_Another_Beneficiary_For_Spouse_Ten_Year_Insurance_Mobile();
	}

	@Then("^select second beneficiary, select Contingent and Trust and enter details for Spouse for Ten Year Insurance \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_second_beneficiary_select_Contingent_and_Trust_and_enter_details_for_Spouse_for_Ten_Year_Insurance(
			String SBTnTrust, String SBTnMM, String SBTnDD, String SBTnYYYY) throws Throwable {
		BeneficiaryPage
				.select_second_beneficiary_select_Contingent_and_Trust_and_enter_details_for_spouse_for_Ten_Year_Insurance_Mobile(
						SBTnTrust, SBTnMM, SBTnDD, SBTnYYYY);
	}

	@Then("^expand Twenty-Year Level Term Life Insurance tab on beneficiary page for Spouse$")
	public void expand_Twenty_Year_Level_Term_Life_Insurance_tab_on_beneficiary_page_for_Spouse() throws Throwable {
		BeneficiaryPage.expand_Twenty_Year_Life_Insurance_tab_on_beneficiary_page_for_spouse_Mobile();
	}

	@Then("^select first beneficiary, select Primary and Trust and enter details for Spouse for Twenty Year Insurance \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_first_beneficiary_select_Primary_and_Trust_and_enter_details_for_Spouse_for_Twenty_Year_Insurance(
			String SBTwTrust, String SBTwMM, String SBTwDD, String SBTwYYYY) throws Throwable {
		BeneficiaryPage
				.select_first_beneficiary_select_Primary_and_Trust_and_enter_details_for_spouse_for_Twenty_Year_Insurance(
						SBTwTrust, SBTwMM, SBTwDD, SBTwYYYY);
	}

	@Then("^click ADD ANOTHER BENEFICIARY for Spouse Twenty Year Insurance$")
	public void click_ADD_ANOTHER_BENEFICIARY_for_Spouse_Twenty_Year_Insurance() throws Throwable {
		BeneficiaryPage.click_Add_Another_Beneficiary_For_Spouse_Twenty_Year_Insurance_Mobile();
	}

	@Then("^select second beneficiary, select Contingent and Individual and enter details for Spouse for Twenty Year Insurance \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void select_second_beneficiary_select_Contingent_and_Individual_and_enter_details_for_Spouse_for_Twenty_Year_Insurance(
			String SBTwfname, String SBTwlname, String SBTwrelation, String SBTwpercent) throws Throwable {
		BeneficiaryPage
				.select_second_beneficiary_select_Contingent_and_Individual_and_enter_details_for_spouse_for_Twenty_Year_Insurance(
						SBTwfname, SBTwlname, SBTwrelation, SBTwpercent);
	}

	@Then("^select third beneficiary, select Primary and Trust and enter details for Spouse for Twenty Year Insurance \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_third_beneficiary_select_Primary_and_Trust_and_enter_details_for_Spouse_for_Twenty_Year_Insurance(
			String STrustName, String STrustMonth, String STrustDate, String STrustYear) throws Throwable {
		BeneficiaryPage
				.select_third_beneficiary_select_Primary_and_Trust_and_enter_details_for_Spouse_for_Twenty_Year_Insurance(
						STrustName, STrustMonth, STrustDate, STrustYear);
	}

	/*---------------------------------------------Authorized page Mobile-----------------------------------------------------*/

	@Then("^Authorization & Consent Page is displayed and users Clicks the checkbox for Self$")
	public void authorization_Consent_Page_is_displayed_and_users_Clicks_the_checkbox_for_self() throws Throwable {
		Authorize.authorization_Consent_Page_is_displayed_and_users_Clicks_the_checkbox_for_Self_Mobile();

	}

	@Then("^Authorization & Consent Page is displayed and users Clicks the checkbox for Spouse$")
	public void authorization_Consent_Page_is_displayed_and_users_Clicks_the_checkbox_for_Spouse() throws Throwable {
		Authorize.authorization_Consent_Page_is_displayed_and_users_Clicks_the_checkbox_for_Spouse_Mobile();

	}

	@Then("^Authorization page is displayed to user in mobile site$")
	public void authorization_page_is_displayed_to_user_mobile() throws Throwable {
		Authorize.authorization_page_is_displayed_to_user_Mobile();
	}

	/*------------------------------------Mobile Personal Page---------------------------*/

	/*
	 * @Then("^Your personal details page displayed and select \"([^\"]*)\", enters details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and Tabacco as \"([^\"]*)\" and reside outside as \"([^\"]*)\"$"
	 * ) public void
	 * your_personal_details_page_displayed_and_select_enters_details_as_and_Tabacco_as_and_reside_outside_as(
	 * String gender, String SSN, String Height, String Weight, String smoker,
	 * String Routside) throws Throwable { Personal.
	 * your_personal_details_page_displayed_and_select_Tabacco_as_and_reside_outside_as_and_enters_details_as_Mobile(
	 * gender, SSN, Height, Weight, smoker, Routside); }
	 */

	@Then("^Your personal details page displayed and select \"([^\"]*)\", enters details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and reside outside as \"([^\"]*)\"$")
	public void your_personal_details_page_displayed_and_select_enters_details_as_and_reside_outside_as(String gender,
			String SSN, String Height, String Weight, String Routside) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Personal.your_personal_details_page_displayed_and_reside_outside_as_and_enters_details_as_without_Tobacco_Mobile(
				gender, SSN, Height, Weight, Routside);
	}

	@Then("^Select Tabacco as \"([^\"]*)\" for Self$")
	public void select_tobacco_as_for_Self(String Ssmoker) throws Throwable {
		Personal.select_tobacco_for_self_Mobile(Ssmoker);
	}

	@Then("^Select Tabacco as \"([^\"]*)\" for Spouse$")
	public void select_tobacco_as_for_Spouse(String Ssmoker) throws Throwable {
		Personal.select_tobacco_as_for_Spouse_Mobile(Ssmoker);
	}

	/*
	 * @Then("^Spouse personal details page displayed and select \"([^\"]*)\" and enter details as \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\" and Tabacco as \"([^\"]*)\" and reside outside as \"([^\"]*)\"$"
	 * ) public void
	 * spouse_personal_details_page_displayed_and_select_and_enter_details_as_and_Tabacco_as_and_reside_outside_as(
	 * String Sgender, String SSSN, String SHeight, String SWeight, String Ssmoker,
	 * String SRoutside) throws Throwable { Personal.
	 * spouse_personal_details_page_displayed_and_select_and_enter_details_as_and_Tabacco_as_and_reside_outside_as_Mobile(
	 * Sgender, SSSN, SHeight, SWeight, Ssmoker, SRoutside); }
	 */

	@Then("^Spouse personal details page displayed and select \"([^\"]*)\" and enter details as \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\" and reside outside as \"([^\"]*)\"$")
	public void spouse_personal_details_page_displayed_and_select_and_enter_details_as_and_reside_outside_as(
			String Sgender, String SSSN, String SHeight, String SWeight, String SRoutside) throws Throwable {
		Personal.spouse_personal_details_page_displayed_and_select_and_enter_details_as_and_reside_outside_as_without_Tobacco_Mobile(
				Sgender, SSSN, SHeight, SWeight, SRoutside);

	}

	@Then("^enters details for tobacco for self as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\"$")
	public void enters_details_for_tobacco_for_self_as(String TMM, String TDD, String TYYYY, String Tobaccoprd)
			throws Throwable {
		Personal.enters_details_for_tobacco_as_Yes_for_Self_Mobile(TMM, TDD, TYYYY, Tobaccoprd);
	}

	@Then("^enters details for tobacco for spouse as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\"$")
	public void enters_details_for_tobacco_for_spouse_as(String TSMM, String TSDD, String TSYYYY, String Stobaccoprd)
			throws Throwable {
		Personal.enters_details_for_tobacco_as_Yes_for_Spouse_Mobile(TSMM, TSDD, TSYYYY, Stobaccoprd);
	}

	@Then("^enters details for self for country \"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_details_for_self_for_country(String Country, String Monthshowlong) throws Throwable {
		Personal.enters_details_for_self_for_country_mobile(Country, Monthshowlong);
	}

	@Then("^enters details for spouse for country \"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_details_for_spouse_for_country(String Scountry, String Smonthshowlong) throws Throwable {
		Personal.enters_details_for_spouse_for_country_mobile(Scountry, Smonthshowlong);
	}

	@Then("^Your Personal details page displayed and select \"([^\"]*)\", \"([^\"]*)\"$")
	public void your_personal_details_page_displayed_and_select(String gender, String SSN) throws Throwable {
		Personal.your_personal_details_page_displayed_and_select_Mobile(gender, SSN);
	}

	@Then("^enter details as \"([^\"]*)\" for self$")
	public void enter_details_as(String SSN) throws Throwable {
		Personal.enter_details_as_for_self_Mobile(SSN);
	}

	@Then("^Enter MembershipID as \"([^\"]*)\" for self$")
	public void enter_MembershipID_as(String membershipID) throws Throwable {
		Personal.enter_details_as_for_self_MembershipID_Mobile(membershipID);
	}

	@Then("^Verify that Underwriting input fields Height and Weight are not rendered$")
	public void verify_that_underwriting_fields_height_and_weight_are_not_rendered() throws Throwable {
		Personal.height_is_not_rendered_Mobile();
		Personal.weight_is_not_rendered_Mobile();
	}

	/*------------------------------------Mobile contact Page---------------------------*/

	@Then("^Your Contact details page displayed and select Business and select YES and user enters details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void your_Contact_details_page_displayed_and_select_Business_and_select_YES_and_user_enters_details_as(
			String Phtype, String Number, String Bsname, String Typebusiness) throws Throwable {

		contact.your_Contact_details_page_displayed_and_select_Business_and_select_YES_and_user_enters_details_as_Mobile(
				Phtype, Number, Bsname, Typebusiness);
	}

	@Then("^Spouse Contact details page displayed and user enters details as emailid and \"([^\"]*)\",\"([^\"]*)\"$")
	public void spouse_Contact_details_page_displayed_and_user_enters_details_as(String SPhtype, String Sno)
			throws Throwable {
		contact.spouse_Contact_details_page_displayed_and_user_enters_details_as_mobile(SPhtype, Sno);
	}

	@Then("^Your Contact details page displayed and select Business and select NO and user enters details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void your_Contact_details_page_displayed_and_select_Business_and_select_NO_and_user_enters_details_as(
			String Phtype, String Number, String Bsname, String Typebusiness, String Baddress) throws Throwable {
		contact.your_Contact_details_page_displayed_and_select_Business_and_select_NO_and_user_enters_details_as_Mobile(
				Phtype, Number, Bsname, Typebusiness, Baddress);
	}

	@Then("^Your Contact details page displayed and select Home and user enters phone details as \"([^\"]*)\",\"([^\"]*)\"$")
	public void your_Contact_details_page_displayed_and_select_Home_and_user_enters_details_as(String Phtype,
			String Number) throws Throwable {
		contact.your_Contact_details_page_displayed_and_select_Home_and_user_enters_details_as_Mobile(Phtype, Number);
	}
	@Then("^Your Contact details page displayed and select Home and select NO and user enters details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void your_Contact_details_page_displayed_and_select_Home_select_NO_and_user_enters_details_as(String Phtype,String Number,String Bsname, String Typebusiness, String Baddress) throws Throwable {
		contact.your_Contact_details_page_displayed_and_select_Home_select_No_and_enters_details_as_Mobile(Phtype, Number, Bsname, Typebusiness, Baddress);
	}
	/*------------------------------Final Page-------------------------------------------------------*/

	@Then("^Verify PDF information in mobile as \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_PDF_information_in_mobile_as(String pdfScenario, String pdfEnable) throws Throwable {
		if (pdfEnable.equals("1")) {
			FinalPage.click_on_Application_and_validate_PDF_Mobile(pdfScenario);
		} else {
			System.out.println("pdf validation will not done");
		}
	}

	@Then("^Verify PDF information as \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_PDF_information_as(String pdfScenario, String pdfEnable) throws Throwable {
		if (pdfEnable.equals("1")) {
			FinalPage.click_on_Application_and_Validate_the_signature_from_the_PDF(pdfScenario);
		} else {
			System.out.println("pdf validation will not done");
		}
	}

	@Then("^Verify PDF  information as \"([^\"]*)\"$")
	public void verify_PDF_information_as(String pdfScenario, int i) throws Throwable {

	}

	@Then("^Click on Application and Validate the fields from the PDF as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void click_on_Application_and_Validate_the_fields_from_the_PDF_as(String Fname, String Lname, String Address,
			String WorkHr, String Mstatus) throws Throwable {
		// FinalPage.click_on_Application_and_Validate_the_signature_from_the_PDF(Fname,
		// Lname, Address, WorkHr, Mstatus);
	}

//********************* PAYMENT PAGE MOBILE ***********************************//

	@Then("^Payment page is displayed,select NO$")
	public void payment_page_is_displayed_select_NO() throws Throwable {
		Payment.payment_page_is_displayed_select_NO_Mobile();
	}

	@Then("^Payment page is displayed$")
	public void payment_page_is_displayed() throws Throwable {
		Payment.payment_page_is_displayed_Mobile();
	}

	@Then("^Payment page is displayed, select Yes$")
	public void payment_page_is_displayed_select_Yes() throws Throwable {
		Payment.payment_page_is_displayed_select_Yes_Mobile();
	}

	@Then("^Click on traditional term product and select method Bill Me and Select \"([^\"]*)\"$")
	public void click_on_traditional_term_product_and_select_method_Bill_Me_and_Select(String Freq) throws Throwable {
		Payment.click_on_traditional_term_product_and_select_method_Bill_Me_and_Select_Mobile(Freq);

	}

//WAEPA

	@Then("^Validate the estimated rates values for Group Term Life for self as \"([^\"]*)\",\"([^\"]*)\"$")
	public void validate_the_estimated_rates_values_for_Group_Term_Life_for_self_as(String Mpremium, String Total)
			throws Throwable {
		Payment.validate_the_estimated_rates_values_For_FiveYear_Self(Mpremium);
		Payment.validate_the_estimated_rates_values_For_FiveYear_Total(Total);
	}

	@Then("^Validate the estimated rates values for Group Term Life for self and spouse as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void validate_the_estimated_rates_values_for_Group_Term_Life_for_self_and_spouse_as(String Mpremium,
			String Dependents1, String Total) throws Throwable {
		Payment.validate_the_estimated_rates_values_For_FiveYear_Self(Mpremium);
//Payment.validate_the_estimated_rates_values_For_FiveYear_Spouse(Spremium);
		Payment.validate_the_estimated_rates_values_For_FiveYear_Dependents(Dependents1);
		Payment.validate_the_estimated_rates_values_For_FiveYear_Total(Total);
	}

	@Then("^validate the estimated rates values for Group Term Life for self, spouse and child as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void validate_the_estimated_rates_values_for_Group_Term_Life_for_self_spouse_and_child_as(String Mpremium,
			String Spremium, String Cpremium, String Total) throws Throwable {
		Payment.validate_the_estimated_rates_values_For_FiveYear_Self(Mpremium);
		Payment.validate_the_estimated_rates_values_For_FiveYear_Spouse(Spremium);
		Payment.validate_the_estimated_rates_values_For_FiveYear_child(Cpremium);
		Payment.validate_the_estimated_rates_values_For_FiveYear_Total(Total);
	}

	@Then("^validate the estimated rates values for Group Term Life for spouse and child as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void validate_the_estimated_rates_values_for_Group_Term_Life_for_spouse_and_child_as(String Spremium,
			String Dependents1, String Total) throws Throwable {
		Payment.validate_the_estimated_rates_values_For_FiveYear_Spouse(Spremium);
		// Payment.validate_the_estimated_rates_values_For_FiveYear_child(Cpremium);
		Payment.validate_the_estimated_rates_values_For_FiveYear_Dependents(Dependents1);
		Payment.validate_the_estimated_rates_values_For_FiveYear_Total(Total);
	}

	@Then("^Validate the estimated rates values for Group Term Life for Self and Dependents as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validate_the_estimated_rates_values_for_Group_Term_Life_for_Self_and_Dependents_as(String Mpremium,
			String Dependents1, String Total) throws Throwable {
		Payment.validate_the_estimated_rates_values_For_FiveYear_Self(Mpremium);
		Payment.validate_the_estimated_rates_values_For_FiveYear_Dependents(Dependents1);
		Payment.validate_the_estimated_rates_values_For_FiveYear_Total(Total);
	}

//**************************************************************************************

	@Then("^validate the estimated rates values for Traditional product for self and spouse \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void validate_the_estimated_rates_values_for_Traditional_product_for_self_and_spouse(String Mpremium,
			String Spremium, String Total) throws Throwable {

		Payment.validate_the_estimated_rates_values_For_Traditional_Self_Mobile(Mpremium);
		Payment.validate_the_estimated_rates_values_For_Traditional_Spouse_Mobile(Spremium);
		Payment.validate_the_estimated_rates_values_For_Traditional_Product_Total_Mobile(Total);
	}

	@Then("^validate the estimated rates values for Traditional product for self, spouse and child \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void validate_the_estimated_rates_values_for_Five_Year_for_self_spouse_and_child(String Mpremium,
			String Spremium, String Cpremium, String Total) throws Throwable {
		Payment.validate_the_estimated_rates_values_For_Traditional_Self_Mobile(Mpremium);
		Payment.validate_the_estimated_rates_values_For_Traditional_Spouse_Mobile(Spremium);
		Payment.validate_the_estimated_rates_values_For_Traditional_product_child_Mobile(Cpremium);
		Payment.validate_the_estimated_rates_values_For_Traditional_Product_Total_Mobile(Total);
	}

	/*
	 * @Then("^validate the estimated rates values for Traditional product for self and spouse \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$"
	 * ) public void
	 * validate_the_estimated_rates_values_for_Five_Year_for_self_and_spouse(String
	 * Mpremium,String Spremium, String Total) throws Throwable {
	 * Payment.validate_the_estimated_rates_values_For_Traditional_Self_Mobile(
	 * Mpremium);
	 * Payment.validate_the_estimated_rates_values_For_Traditional_Spouse_Mobile(
	 * Spremium); Payment.
	 * validate_the_estimated_rates_values_For_Traditional_Product_Total_Mobile(
	 * Total); }
	 */

	/*
	 * @Then("^validate the estimated rates values for Traditional product for self and spouse \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$"
	 * ) public void
	 * validate_the_estimated_rates_values_for_Five_Year_for_self_and_spouse(String
	 * Mpremium,String Spremium, String Total) throws Throwable {
	 * 
	 * Payment.validate_the_estimated_rates_values_For_Traditional_Self_Mobile(
	 * Mpremium);
	 * Payment.validate_the_estimated_rates_values_For_Traditional_Spouse_Mobile(
	 * Spremium); Payment.
	 * validate_the_estimated_rates_values_For_Traditional_Product_Total_Mobile(
	 * Total); }
	 */

	@Then("^Click on Ten Year Level Term Life Insurance coverage and Select method Bill Me and Select \"([^\"]*)\"$")
	public void click_on_Ten_Year_Level_Term_Life_Insurance_coverage_and_Select_method_Bill_Me_and_Select(String Freq1)
			throws Throwable {
		Payment.click_on_Ten_Year_Level_Term_Life_Insurance_coverage_and_Select_method_Bill_Me_and_Select_Mobile(Freq1);
	}

	@Then("^validate the premium values for Ten Year for self and spouse \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
	public void validate_the_premium_values_for_Ten_Year_for_self_and_spouse(String Mpremium1, String Spremium1,
			String Total1) throws Throwable {
		Payment.validate_the_estimated_rates_values_For_TenYear_Self_Mobile(Mpremium1);
		Payment.validate_the_estimated_rates_values_For_TenYear_Spouse_Mobile(Spremium1);
		Payment.validate_the_estimated_rates_values_For_TenYear_Total_Mobile(Total1);
	}

	@Then("^Click on Twenty Year Level Term Life Insurance coverage and Select method Bill Me and Select \"([^\"]*)\"$")
	public void click_on_Twenty_Year_Level_Term_Life_Insurance_coverage_and_Select_method_Bill_Me_and_Select(
			String Freq2) throws Throwable {
		Payment.click_on_Twenty_Year_Level_Term_Life_Insurance_coverage_and_Select_method_Bill_Me_and_Select(Freq2);
	}

	@Then("^validate the premium values for Twenty Year for self and spouse \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
	public void validate_the_premium_values_for_Twenty_Year_for_self_and_spouse(String Mpremium2, String Spremium2,
			String Total2) throws Throwable {
		Payment.validate_the_estimated_rates_values_For_TwentyYear_Self_Mobile(Mpremium2);
		Payment.validate_the_estimated_rates_values_For_TwentyYear_Spouse_Mobile(Spremium2);
		Payment.validate_the_estimated_rates_values_For_TwentyYear_Total_Mobile(Total2);
	}

	@Then("^Click on Long Term Disability Insurance coverage and Select method Bill Me and Select \"([^\"]*)\"$")
	public void click_on_Long_Term_Disability_Insurance_coverage_and_Select_method_Bill_Me_and_Select(String Freq3)
			throws Throwable {
		Payment.click_on_Long_Term_Life_Insurance_coverage_and_Select_method_Bill_Me_and_Select_Mobile(Freq3);
	}

	@Then("^validate the premium values for Long Term for self and spouse \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void validate_the_premium_values_for_Long_Term_for_self_and_spouse(String Mpremium3, String Spremium3,
			String Total3) throws Throwable {
		Payment.validate_the_estimated_rates_values_For_LongTerm_Self_Mobile(Mpremium3);
		Payment.validate_the_estimated_rates_values_For_LongTerm_Spouse_Mobile(Spremium3);
		Payment.validate_the_estimated_rates_values_For_LongTerm_Total_Mobile(Total3);
	}

	@Then("^Click on Short Term Disability Insurance coverage and Select method Bill Me and Select \"([^\"]*)\"$")
	public void click_on_Short_Term_Disability_Insurance_coverage_and_Select_method_Bill_Me_and_Select(String Freq4)
			throws Throwable {
		Payment.click_on_Short_Term_Life_Insurance_coverage_and_Select_method_Bill_Me_and_Select_Mobile(Freq4);
	}

	@Then("^validate the premium values for Short Term for self and spouse \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void validate_the_premium_values_for_Short_Term_for_self_and_spouse(String Mpremium4, String Spremium4,
			String Total4) throws Throwable {
		Payment.validate_the_estimated_rates_values_For_ShortTerm_Self_Mobile(Mpremium4);
		Payment.validate_the_estimated_rates_values_For_ShortTerm_Spouse_Mobile(Spremium4);
		Payment.validate_the_estimated_rates_values_For_ShortTerm_Total_Mobile(Total4);
	}

	@Then("^Click on Business Overhead Expense Insurance coverage and Select method Bill Me and Select \"([^\"]*)\"$")
	public void select_Business_Overhead_Expense_Insurance_coverage_and_Select_method_Bill_Me_and_Select(String Freq5)
			throws Throwable {
		Payment.click_on_Business_Overhead_coverage_and_Select_method_Bill_Me_and_Select_Mobile(Freq5);
	}

	@Then("^validate the premium values for Business Overhead for self \"([^\"]*)\",\"([^\"]*)\"$")
	public void validate_the_premium_values_for_Business_Overhead_for_self(String Mpremium5, String Total5)
			throws Throwable {
		Payment.validate_the_estimated_rates_values_For_Business_Overhead_Self_Mobile(Mpremium5);
		Payment.validate_the_estimated_rates_values_For_Business_Overhead_Total_Mobile(Total5);
	}

	@Then("^validate the estimated rates values for Traditional product for child \"([^\"]*)\", \"([^\"]*)\"$")
	public void validate_the_premium_values_for_Traditional_product_child(String Cpremium, String Total)
			throws Throwable {
		Payment.validate_the_estimated_rates_values_For_Traditional_product_child_Mobile(Cpremium);
		Payment.validate_the_estimated_rates_values_For_Traditional_Product_Total_Mobile(Total);
	}

	/*-----------------------------------------------------------------------------------*/
//**********Next Button [Common]************//

	@Then("^Clicks on next button$")
	public void clicks_on_next_button() throws Throwable {

		EligibilityPage.clicks_next_button();
	}

//***************************Preview page Mobile*****************************//

	@Then("^Preview Page is displayed in Mobile site$")
	public void preview_Page_is_displayed_Mobile_site() throws Throwable {
		Preview.Preview_Page_is_displayed_Mobile();
	}

	@Then("^Verify coverage amount \"([^\"]*)\" for Self under Traditional Term Insurance$")
	public void verify_coverage_amount_for_Self_under_Traditional_Term_Insurance(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_TraditionalTerm_Mobile(Benefit);
	}

	@Then("^Verify coverage amount \"([^\"]*)\" for Self under TenYTL$")
	public void verify_coverage_amount_for_Self_under_TenYTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_TenYTL_Mobile(Benefit);
	}

	@Then("^Verify coverage amount \"([^\"]*)\" for Self under TwentyYTL$")
	public void verify_coverage_amount_for_Self_under_TwentyYTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_TwentyYTL_Mobile(Benefit);
	}

	@Then("^Verify coverage amount \"([^\"]*)\" for Self under LTD$")
	public void verify_coverage_amount_for_Self_under_LTD(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_LTD_Mobile(Benefit);
	}

	@Then("^Verify coverage amount \"([^\"]*)\" for Self under STD$")
	public void verify_coverage_amount_for_Self_under_STD(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_STD_Mobile(Benefit);
	}

	@Then("^Verify coverage amount \"([^\"]*)\" for Self under Business Overhead$")
	public void verify_coverage_amount_for_Self_under_Business_Overhead(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Self_as_under_BOE_Mobile(Benefit);
	}

	@Then("^Verify coverage amount \"([^\"]*)\" for Spouse under Traditional Term Insurance$")
	public void verify_coverage_amount_for_Spouse_under_Traditional_Term_Insurance(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_TraditionalTerm_Mobile(Benefit);
	}

	@Then("^Verify coverage amount \"([^\"]*)\" for Spouse under TenYTL$")
	public void verify_coverage_amount_for_Spouse_under_TenYTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_TenYTL_Mobile(Benefit);
	}

	@Then("^Verify coverage amount \"([^\"]*)\" for Spouse under TwentyYTL$")
	public void verify_coverage_amount_for_Spouse_under_TwentyYTL(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_TwentyYTL_Mobile(Benefit);
	}

	@Then("^Verify coverage amount \"([^\"]*)\" for Spouse under LTD$")
	public void verify_coverage_amount_for_Spouse_under_LTD(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_LTD_Mobile(Benefit);
	}

	@Then("^Verify coverage amount \"([^\"]*)\" for Spouse under STD$")
	public void verify_coverage_amount_for_Spouse_under_STD(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Spouse_as_under_STD_Mobile(Benefit);
	}

	@Then("^Verify coverage amount \"([^\"]*)\" for Child under Traditional Term Insurance$")
	public void verify_coverage_amount_for_Child_under_Traditional_Term_Insurance(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Child_as_under_Traditional_term_Mobile(Benefit);
	}
	
	@Then("^Verify coverage amount \"([^\"]*)\" for Child under Group Term Life Insurance$")
	public void verify_coverage_amount_for_Child_under_Group_Term_Insurance(String Benefit) throws Throwable {
		Preview.verify_Benefit_Amount_for_Child_as_under_Traditional_term_Mobile(Benefit);
	}

	@Then("^Expand Your Info$")
	public void expand_Your_Info() throws Throwable {
		Preview.expand_Your_Info_Mobile();
	}

	@Then("^Expand Spouse Info$")
	public void expand_Spouse_Info() throws Throwable {
		Preview.expand_Spouse_Info_Mobile();
	}

	@Then("^Expand Child Info$")
	public void expand_Child_Info() throws Throwable {
		Preview.expand_Child_Info_Mobile();
	}

	@Then("^verify that the Child name is displayed as \"([^\"]*)\" and \"([^\"]*)\" in Preview page$")
	public void verify_that_the_Child_name_is_displayed_as_and_in_Preview_page(String fname, String lname)
			throws Throwable {
		Preview.verify_that_the_Child_name_is_displayed_as_and_preview_page_Mobile(fname, lname);
	}

	/*---------------------------------------------Authorized page Common-----------------------------------------------------*/
	@Then("^Validates I Understand verbiage one in Read and Sign Box$")
	public void validates_I_Understand_verbiage_one_in_Read_and_Sign_Box() throws Throwable {
		Authorize.Validates_I_Understand_verbiage_one_in_Read_and_Sign_Box();
	}

	@Then("^Validates I Understand verbiage two in Read and Sign Box$")
	public void validates_I_Understand_verbiage_two_in_Read_and_Sign_Box() throws Throwable {
		Authorize.Validates_I_Understand_verbiage_two_in_Read_and_Sign_Box();
	}
	
	@Then("^Validates that Second I understand verbiage is not displayed in Read and Sign Box$")
	public void validates_Second_I_Understand_verbiage_not_Displayed_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Second_I_Understand_verbiage_not_Displayed_in_Read_and_Sign_Box();
	}

	@Then("^Validate Authorization message in Read and Sign Box$")
	public void validate_Authorization_message_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validate_Authorization_message_in_Read_and_Sign_Box();
	}
	
	@Then("^Validates that Authorization message is not displayed in Read and Sign Box$")
	public void validate_Authorization_message_not_displayed_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validate_Authorization_message_not_displayed_in_Read_and_Sign_Box();
	}

	@Then("^Validate Fraud Notice CO in Read and Sign Box$")
	public void validate_Fraud_Notice_CO_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validate_Fraud_Notice_CO_in_Read_and_Sign_Box();
	}

	@Then("^Validate Consent message in Read and Sign Box$")
	public void validate_Consent_message_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validate_Consent_message_in_Read_and_Sign_Box();
	}
	
	@Then("^Validate Consent message TX in Read and Sign Box$")
	public void validate_Consent_message_TX_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validate_Consent_message_TX_in_Read_and_Sign_Box();
	}
	
	@Then("^Validate Consent message CO in Read and Sign Box$")
	public void validate_Consent_message_CO_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Consent_message_in_Read_and_Sign_Box_for_NonUW();
	}
	
	@Then("^Validate Consent message for LA in Read and Sign Box$")
	public void validate_Consent_message_for_LA_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validate_Consent_message_for_LA_in_Read_and_Sign_Box();
	}

	@Then("^Validate Fraud Notice CA in Read and Sign Box$")
	public void validate_Fraud_Notice_CA_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Fraud_Notice_CA_in_Read_and_Sign_Box();
	}

	@Then("^Validates I Understand Verbiage in Read and Sign Box$")
	public void validates_I_Understand_Verbiage_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_I_Understand_Verbiage_in_Read_and_Sign_Box();
	}

	@Then("^Validates additional Notes for Connecticut state$")
	public void validates_additional_Notes_for_Connecticut_state() throws Throwable {
		Authorize.validates_additional_Notes_for_Connecticut_state();
	}

	@Then("^Validates Consent message in Read and Sign Box for NonUW$")
	public void validates_Consent_message_in_Read_and_Sign_Box_for_NonUW() throws Throwable {
		Authorize.validates_Consent_message_in_Read_and_Sign_Box_for_NonUW();
	}

	@Then("^Validate Authorization Message MN in Read and Sign Box$")
	public void validate_Authorization_Message_MN_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validate_Authorization_Message_MN_in_Read_and_Sign_Box();
	}

	@Then("^Validates Consent message Non GI in Read and Sign Box$")
	public void validates_Consent_message_Non_GI_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Consent_message_Non_GI_in_Read_and_Sign_Box();
	}

	@Then("^Validates Consent message GI in Read and Sign Box$")
	public void validates_Consent_message_GI_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Consent_message_GI_in_Read_and_Sign_Box();
	}

	@Then("^Validate Authorization message NY in Read and Sign Box$")
	public void validate_Authorization_message_NY_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validate_Authorization_message_NY_in_Read_and_Sign_Box();
	}

	/*--------------------Divident Messeges for ABE Site------------------------------------*/

	@Then("^Validate Fraud Notice AL in Read and Sign Box$")
	public void validate_Fraud_Notice_AL_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Fraud_Notice_AL_in_Read_and_Sign_Box();
	}

	@Then("^Validate Fraud Notice AR in Read and Sign Box$")
	public void validate_Fraud_Notice_AR_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Fraud_Notice_AR_in_Read_and_Sign_Box();
	}

	@Then("^Validate Fraud Notice LA in Read and Sign Box$")
	public void validates_Fraud_Notice_LA_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Fraud_Notice_LA_in_Read_and_Sign_Box();
	}

	@Then("^Validate Fraud Notice PA in Read and Sign Box$")
	public void validates_Fraud_Notice_PA_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Fraud_Notice_PA_in_Read_and_Sign_Box();
	}

	@Then("^Validate Fraud Notice RI in Read and Sign Box$")
	public void validate_Fraud_Notice_RI_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Fraud_Notice_RI_in_Read_and_Sign_Box();
	}

	@Then("^Validate Dividend message in Dividend Box$")
	public void validate_Dividend_message_in_Dividend_Box() throws Throwable {
		Authorize.validate_Dividend_message_in_Dividend_Box();
	}

	@Then("^Validate Fraud Notice MD in Read and Sign Box$")
	public void validate_Fraud_Notice_MD_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Fraud_Notice_MD_in_Read_and_Sign_Box();
	}

	@Then("^Validate FiveYTL message in Dividend Box$")
	public void validate_FiveYTL_message_in_Dividend_Box() throws Throwable {
		Authorize.validate_FiveYTL_message_in_Dividend_Box();
	}

	@Then("^Validate Fraud Notice DC in Read and Sign Box$")
	public void validate_Fraud_Notice_DC_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Fraud_Notice_DC_in_Read_and_Sign_Box();
	}

	@Then("^Validates Fraud Notice in Read and Sign Box$")
	public void validates_Fraud_Notice_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Fraud_Notice_DC_in_Read_and_Sign_Box();
	}

	@Then("^Validate TenYTL message in Dividend Box$")
	public void validate_TenYTL_message_in_Dividend_Box() throws Throwable {
		Authorize.validate_TenYTL_message_in_Dividend_Box();
	}

	@Then("^Validate Fraud Notice FL in Read and Sign Box$")
	public void validate_Fraud_Notice_FL_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Fraud_Notice_FL_in_Read_and_Sign_Box();
	}

	@Then("^Validate Fraud Notice CT in Read and Sign Box$")
	public void validate_Fraud_Notice_CT_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validate_Fraud_Notice_CT_in_Read_and_Sign_Box();
	}

	@Then("^Validate Fraud Notice MN in Read and Sign Box$")
	public void validate_Fraud_Notice_MN_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validate_Fraud_Notice_MN_in_Read_and_Sign_Box();
	}

	@Then("^Validate TwentyYTL message in Dividend Box$")
	public void validate_TwentyYTL_message_in_Dividend_Box() throws Throwable {
		Authorize.validate_TwentyYTL_message_in_Dividend_Box();
	}

	@Then("^Validate FiftyMBTL message in Dividend Box$")
	public void validate_FiftyMBTL_message_in_Dividend_Box() throws Throwable {
		Authorize.validate_FiftyMBTL_message_in_Dividend_Box();
	}

	@Then("^Validate ADDI message in Dividend Box$")
	public void validate_ADDI_message_in_Dividend_Box() throws Throwable {
		Authorize.validate_ADDI_message_in_Dividend_Box();
	}

	@Then("^Validate LTDPlus message in Dividend Box$")
	public void validate_LTDPlus_message_in_Dividend_Box() throws Throwable {
		Authorize.validate_LTDPlus_message_in_Dividend_Box();
	}

	@Then("^Validate LTD message in Dividend Box$")
	public void validate_LTD_message_in_Dividend_Box() throws Throwable {
		Authorize.validate_LTD_message_in_Dividend_Box();
	}

	@Then("^Validate MTDI message in Dividend Box$")
	public void validate_MTDI_message_in_Dividend_Box() throws Throwable {
		Authorize.validate_MTDI_message_in_Dividend_Box();
	}

	@Then("^Validate RDI message in Dividend Box$")
	public void validate_RDI_message_in_Dividend_Box() throws Throwable {
		Authorize.validate_RDI_message_in_Dividend_Box();
	}

	@Then("^Validate POEDI message in Dividend Box$")
	public void validate_POEDI_message_in_Dividend_Box() throws Throwable {
		Authorize.validate_POEDI_message_in_Dividend_Box();
	}

	@Then("^Validate CI message in Dividend Box$")
	public void validate_CI_message_in_Dividend_Box() throws Throwable {
		Authorize.validate_CI_message_in_Dividend_Box();
	}

	@Then("^Validate HMI message in Dividend Box$")
	public void validate_HMI_message_in_Dividend_Box() throws Throwable {
		Authorize.validate_HMI_message_in_Dividend_Box();
	}

	@Then("^Validate Election message in Dividend Box$")
	public void validate_Election_message_in_Dividend_Box() throws Throwable {
		Authorize.validate_Election_message_in_Dividend_Box();
	}

	@Then("^Validate Fraud Notice KS in Read and Sign Box$")
	public void validate_Fraud_Notice_KS_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Fraud_Notice_KS_in_Read_and_Sign_Box();
	}

	@Then("^Validate Fraud Notice ME in Read and Sign Box$")
	public void validate_Fraud_Notice_ME_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Fraud_Notice_ME_in_Read_and_Sign_Box();
	}

	@Then("^Validate Fraud Notice NJ in Read and Sign Box$")
	public void validate_Fraud_Notice_NJ_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Fraud_Notice_NJ_in_Read_and_Sign_Box();
	}

	@Then("^Validate Fraud Notice NY in Read and Sign Box$")
	public void validate_Fraud_Notice_NY_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Fraud_Notice_NY_in_Read_and_Sign_Box();
	}

	@Then("^Validate Fraud Notice OK in Read and Sign Box$")
	public void validate_Fraud_Notice_OK_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Fraud_Notice_OK_in_Read_and_Sign_Box();
	}

	@Then("^Validate Fraud Notice PR in Read and Sign Box$")
	public void validate_Fraud_Notice_PR_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Fraud_Notice_PR_in_Read_and_Sign_Box();
	}

	@Then("^Validate Fraud Notice TN in Read and Sign Box$")
	public void validate_Fraud_Notice_TN_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Fraud_Notice_TN_in_Read_and_Sign_Box();
	}

	@Then("^Validate Fraud Notice WA in Read and Sign Box$")
	public void validate_Fraud_Notice_WA_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Fraud_Notice_WA_in_Read_and_Sign_Box();
	}

	@Then("^Validate Fraud Notice VA in Read and Sign Box$")
	public void validate_Fraud_Notice_VA_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Fraud_Notice_VA_in_Read_and_Sign_Box();
	}

	@Then("^Validate Fraud Notice WM in Read and Sign Box$")
	public void validate_Fraud_Notice_WM_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validates_Fraud_Notice_WM_in_Read_and_Sign_Box();
	}

	@Then("^Validate Fraud Notice NM in Read and Sign Box$")
	public void validate_Fraud_Notice_NM_in_Read_and_Sign_Box() throws Throwable {
		Authorize.validate_Fraud_Notice_NM_in_Read_and_Sign_Box();
	}

	@Then("^Clicks on IMPORTANT NOTICE and verify Important Notice from PDF \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_Important_Notice_from_PDF(String pdfScenario, String pdfEnable, String pdfName)
			throws Throwable {
		if (pdfEnable.equals("1")) {
			FinalPage.verify_Important_Notice_from_PDF(pdfScenario, pdfName);
		} else {
			System.out.println("Importanat Notice PDF validation will not done");
		}
	}
	
	@Then("^Clicks on IMPORTANT NOTICE and verify Important Notice from PDF \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" in mobile site$")
	public void verify_Important_Notice_from_PDF_mobile(String pdfScenario, String pdfEnable, String pdfName)
			throws Throwable {
		if (pdfEnable.equals("1")) {
			FinalPage.verify_Important_Notice_from_PDF_mobile(pdfScenario, pdfName);
		} else {
			System.out.println("Importanat Notice PDF validation will not done");
		}
	}


//AAFP

	@Then("^Verify that fraud notice is not rendered at Authorization page$")
	public void verify_that_fraud_notice_is_not_rendered_at_Authorization_page() throws Throwable {
		Authorize.verify_that_fraud_notice_is_not_rendered_at_Authorization_page();
	}
	
	@Then("^Click and scroll Consent message in Read and Sign Box$")
	public void click_Scroll_Consent_Message() throws Throwable{
		Authorize.click_Scroll_Consent_Message();
	}

////

	@Then("^Verify Self is not displayed for MLI,TenYTL,TwentyYTL on product page$")
	public void verify_Self_Is_Not_Displayed_For_MLI_TenYTL_TwentyYTL() throws Throwable {
		ProductPage.verify_Self_Is_Not_Displayed_For_MLI();
		ProductPage.validates_that_Self_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_not_displayed_for_TwentyYTL();
	}

	@Then("^Validates that Self is displayed for MLI,TenYTL,TwentyYTL on product page$")
	public void verify_Self_Is_Displayed_For_MLI_TenYTL_TwentyYTL() throws Throwable {
		ProductPage.verify_Self_Is_Displayed_For_MLI();
		ProductPage.validates_that_Self_is_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_displayed_for_TwentyYTL();
	}

	
	//NSPE
	@Then("^Validates that Self is displayed for TraditionalGroupTermLife, TenYTL, ADnD, DII$")
	public void validates_that_Self_is_displayed_for_TermLife_TenYTL_ADnD_DII() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TraditionalGroupTermLife();
		ProductPage.validates_that_Self_is_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_displayed_for_ADDI();
		ProductPage.validates_that_Self_is_displayed_for_DII();				
	}
	
	@Then("^Validates that Self is displayed for TraditionalGroupTermLife, TenYTL$")
	public void validates_that_Self_is_displayed_for_TermLife_TenYTL() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TraditionalGroupTermLife();
		ProductPage.validates_that_Self_is_displayed_for_TenYTL();			
	}
	
	@Then("^Validates that Self is displayed for GTLP75I,Flex10,Flex20$")
	public void validates_that_Self_is_displayed_for_GTLP75I_Flex10() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TraditionalGroupTermLife();
		ProductPage.validates_that_Self_is_displayed_for_TenYTL();	
		ProductPage.validates_that_Self_is_displayed_for_TwentyYTL();
	}
	
	@Then("^Validates that Self is displayed for GTLP75I$")
	public void validates_that_Self_is_displayed_for_GTLP75I() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TraditionalGroupTermLife();
	}
	
	@Then("^Validates that Self is displayed for ADnD, DII$")
	public void validates_that_Self_is_displayed_for_ADnD_DII() throws Throwable {		
		ProductPage.validates_that_Self_is_displayed_for_ADDI();
		ProductPage.validates_that_Self_is_displayed_for_DII();				
	}
	
	@Then("^Validates that Self is displayed for ADnD$")
	public void validates_that_Self_is_displayed_for_ADnD() throws Throwable {		
		ProductPage.validates_that_Self_is_displayed_for_ADDI();			
	}
	
	@Then("^Validates that Self is displayed for TenYTL,TwentyYTL on product page$")
	public void verify_Self_Is_Displayed_For_TenYTL_TwentyYTL() throws Throwable {
		ProductPage.validates_that_Self_is_displayed_for_TenYTL();
		ProductPage.validates_that_Self_is_displayed_for_TwentyYTL();
	}


	@Then("^Validates that Spouse is displayed for TraditionalGroupTermLife, TenYTL, ADnD$")
	public void validates_that_Spouse_is_displayed_for_TermLife_TenYTL_ADnD() throws Throwable {
		ProductPage.validates_that_Spouse_is_displayed_for_FiveYTL();
		ProductPage.validates_that_Spouse_is_displayed_for_TenYTL();
		ProductPage.validates_that_Spouse_is_displayed_for_ADDI();
	}
	
	@Then("^Validates that Spouse is displayed for TraditionalGroupTermLife, TenYTL$")
	public void validates_that_Spouse_is_displayed_for_TermLife_TenYTL() throws Throwable {
		ProductPage.validates_that_Spouse_is_displayed_for_FiveYTL();
		ProductPage.validates_that_Spouse_is_displayed_for_TenYTL();
	}
	
	@Then("^Validates that Spouse is displayed for TraditionalGroupTermLife, TenYTL, ADnD, DII$")
	public void validates_that_Spouse_is_displayed_for_TermLife_TenYTL_ADnD_DII() throws Throwable {
		ProductPage.validates_that_Spouse_is_displayed_for_FiveYTL();
		ProductPage.validates_that_Spouse_is_displayed_for_TenYTL();
		ProductPage.validates_that_Spouse_is_displayed_for_ADDI();
		ProductPage.validates_that_Spouse_is_displayed_for_DII();
	}

	@Then("^Validates that Child is displayed for TraditionalGroupTermLife, TenYTL, ADnD$")
	public void validates_that_Child_is_displayed_for_TermLife_TenYTL_ADnD() throws Throwable {
		ProductPage.validates_that_Child_is_displayed_for_TraditionalGroupTermLife();
		ProductPage.validates_that_Child_is_displayed_for_TenYTL();
		ProductPage.validates_that_Child_is_displayed_for_ADDI();
	}
	
	
	//GEOCARE
	
	@Then("^Validates that Spouse is displayed at product page for TermLife, TenYTL, FirstToDieTermLife, HLAI, IHI$")
	public void validates_that_Spouse_is_displayed_at_product_page_for_TermLife_TenYTL_FirstToDieTermLife_HLAI_IHI() throws Throwable {
	    ProductPage.validates_that_Spouse_is_displayed_for_TermLife();
	    ProductPage.validates_that_Spouse_is_displayed_for_TenYTL();
	    ProductPage.validates_that_Spouse_is_displayed_for_FirstToDie_TLI();
	    ProductPage.validates_that_Spouse_is_displayed_for_GADD();
	    ProductPage.validates_that_Spouse_is_displayed_for_HII();
	    
	}

	@Then("^Validates that Child is displayed at product page for TermLife, TenYTL, HLAI, IHI$")
	public void validates_that_Child_is_displayed_at_product_page_for_TermLife_TenYTL_HLAI_IHI() throws Throwable {
		ProductPage.validates_that_Child_is_displayed_for_TermLife();
	    ProductPage.validates_that_Child_is_displayed_for_TenYTL();
	    ProductPage.validates_that_Child_is_displayed_for_GADD();
	    ProductPage.validates_that_Child_is_displayed_for_HII();
	}
	
	//*******************

	@Then("^Validates that Child is not displayed for MLI,TenYTL,TwentyYTL on product page$")
	public void verify_Child_Is_Not_Displayed_For_MLI_TenYTL_TwentyYTL() throws Throwable {
		ProductPage.verify_Child_Is_not_Displayed_For_MLI();
		ProductPage.validates_that_Child_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Child_is_not_displayed_for_TwentyYTL();
	}

	@Then("^Validates that Child is not displayed for GTLI, GTenYTL, GHII$")
	public void verify_Child_is_not_Displayed_For_GTLI_GTenYTL_GHII() throws Throwable {
		ProductPage.validates_that_Child_is_not_displayed_for_TermLife();
		ProductPage.validates_that_Child_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Child_is_not_displayed_for_HII();
	}
	
	@Then("^Verify for Child only MLI product is Available$")
	public void verify_child_is_displayed_only_for_MLI() throws Throwable {
		ProductPage.verify_Child_Is_Displayed_For_MLI();
		ProductPage.validates_that_Child_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Child_is_not_displayed_for_TwentyYTL();
	}

	@Then("^Verify for Child only GTDLI product is Available$")
	public void verify_child_is_displayed_only_for_GTDLI() throws Throwable {
		ProductPage.verify_Child_Is_Displayed_For_GTDLI();
		ProductPage.validates_that_Child_is_not_displayed_for_TenYTL();
		ProductPage.validates_that_Child_is_not_displayed_for_TwentyYTL();
	}

	@Then("^Verify Child icon is not displayed for TenYTL$")
	public void validates_that_Child_is_not_displayed_for_TenYTL() throws Throwable {
		ProductPage.validates_that_Child_is_not_displayed_for_TenYTL();
	}

	@Then("^Verify Child icon is not displayed for TwentyYTL$")
	public void validates_that_Child_is_not_displayed_for_TwentyYTL() throws Throwable {
		ProductPage.validates_that_Child_is_not_displayed_for_TwentyYTL();
	}

	@Then("^Verify Available Product List MLI,TenYTL,TwentyYTL$")
	public void verify_available_product_list_MLI_TenYTL_TwentyYTL() throws Throwable {
		ProductPage.validate_Manager_Life_Insurance_Product();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_displayed();
	}

	@Then("^Verify Available Product List GTDLI,TenYTL,TwentyYTL$")
	public void verify_available_product_list_GTDLI_TenYTL_TwentyYTL() throws Throwable {
		ProductPage.validate_General_Term_Dealer_Life_Insurance_Product_is_displayed();
		ProductPage.validate_Ten_Year_Term_Life_Insurance_Product_is_available();
		ProductPage.validate_Twenty_Year_Term_Life_Insurance_Product_is_displayed();
	}

	@Then("^Selects product MLI for Self$")
	public void selects_product_MLI_for_Self() throws Throwable {
		ProductPage.selects_product_MLI_for_Self();
	}

	@Then("^Selects product MLI for Spouse$")
	public void selects_product_MLI_for_Spouse() throws Throwable {
		ProductPage.selects_product_MLI_for_Spouse();
	}

	@Then("^Selects product MLI for Child$")
	public void selects_product_MLI_for_Child() throws Throwable {
		ProductPage.selects_product_MLI_for_Child();
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Self under MLI$")
	public void selects_type_of_Coverage_as_for_Self_under_MLI(String TypeofCove) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_self_MLI(TypeofCove);
	}

	@Then("^Selects Benefit Amount for Self as \"([^\"]*)\" under MLI$")
	public void selects_Benefit_Amount_for_Self_as_under_MLI(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Self_as_under_MLI(sBenefit);
	}

	@Then("^Selects Type of Coverage as \"([^\"]*)\" for Spouse under MLI$")
	public void selects_type_of_Coverage_as_for_Spouse_under_MLI(String TypeofCove) throws Throwable {
		CoveragePage.select_Type_of_Coverage_as_for_spouse_MLI(TypeofCove);
	}

	@Then("^Selects Optional AD&D Rider for Self for MLI$")
	public void selects_Optional_AD_D_Rider_Self_under_ManagerLifeInsurance() throws Throwable {
		CoveragePage.selects_Optional_AD_D_Rider_Self_under_ManagerLifeInsurance();
	}

	@Then("Selects Optional AD&D Rider Benefit Amount as \"([^\"]*)\" for Self under MLI$")
	public void selects_optional_AD_D_Rider_Benefit_Amount_Self(String amount) throws Throwable {
		CoveragePage.selects_optional_AD_D_Rider_Benefit_Amount_Self(amount);
	}

	@Then("^Selects Benefit Amount for Spouse as \"([^\"]*)\" under MLI$")
	public void selects_Benefit_Amount_for_Spouse_as_under_MLI(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Spouse_as_under_MLI(sBenefit);
	}

	@Then("^Selects Optional AD&D Rider for Spouse for MLI$")
	public void selects_Optional_AD_D_Rider_Spouse_under_ManagerLifeInsurance() throws Throwable {
		CoveragePage.selects_Optional_AD_D_Rider_Spouse_under_ManagerLifeInsurance();
	}

	@Then("Selects Optional AD&D Rider Benefit Amount as \"([^\"]*)\" for Spouse under MLI$")
	public void selects_optional_AD_D_Rider_Benefit_Amount_Spouse_under_MLI(String amount) throws Throwable {

		CoveragePage.selects_optional_AD_D_Rider_under_MLI_Benefit_Amount_Spouse(amount);
	}

	@Then("^Selects Benefit Amount for Child as \"([^\"]*)\" under MLI$")
	public void selects_Benefit_Amount_for_Child_as_under_MLI(String sBenefit) throws Throwable {
		CoveragePage.selects_Benefit_Amount_for_Child_as_under_MLI(sBenefit);
	}

	@Then("^Selects AD&D Rider for Child for MLI$")
	public void Selects_AD_D_Rider_for_Child_for_MLI() throws Throwable {
		CoveragePage.Selects_AD_D_Rider_for_Child_for_MLI();
	}

	@Then("^Enters Dealership name as \"([^\"]*)\" and Dealership address as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enters_Dealership_name_and_Address(String dName, String dStreet, String dCity, String dState,
			String dZip) throws Throwable {
		contact.enters_Dealership_name_and_Address(dName, dStreet, dCity, dState, dZip);
	}
	
	
}
