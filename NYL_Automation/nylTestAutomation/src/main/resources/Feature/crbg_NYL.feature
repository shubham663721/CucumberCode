Feature: CRBG Test

@CrbgRegression_1
Scenario Outline: <SC01> Application submission for Self and Child with Group Term Life Insurance and Spouse (Supplemental Spouse Coverage)
Beneficiaries- Maximum (For Self - 1 Primary Trust, 4 Contingent Individual)

	Given Test set up for "NYL" feature and "NYL_CRBG" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB1>"
	And Enter details for Employment Date as "<EDate>"
	And Enter Employer Or Agency Name as "<EAgency>"											
	And Selects No Radio button of full- or part-time civilian employee for Self
	 And Validate that NEXT button is Disabled	
	And Selects Yes Radio button of full- or part-time civilian employee for Self
	And Validate that NEXT button is Enabled
	And Selects Yes Radio Button for Dependent Children
	And Selects Marital Status as "<MStatus>"
	And Selects Hear about us as "<Hear>"
	And Enters Details about other Source as "<Hdetails>"
	And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
	And Enters Marraige Date for Spouse as "<MDate>"
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB1>","<CGender>"
	And Selects Married question as No for Child
	And Click on Add Child button on Screen
	And Clicks on next button
	Then Product page details are displayed to user
	And Verify that Self icon is not displayed under GTLI
	And Clicks on Back or Previous button
	And Enters DOB for Self as "<DOB>"
	And Enters DOB for Spouse as "<SDOB1>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Verify that Spouse icon is not displayed under GTLI
	And Clicks on Back or Previous button
	And Enters DOB for Spouse as "<SDOB>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Verify that Self and Spouse are available under GTLI
	And Clicks on Back or Previous button
	And Enter New State as "<State1>"
	And Clicks on next button
	And Verify that error message is displayed for state eligibility at top of the page
	And Enter New State as "<State>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Verify that Self and Spouse are available under GTLI
	And Selects product GTLI for Self
	And Selects product GTLI for Spouse
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Verify that Child Benefit is not rendered under GTLI
	And Navigate back to Eligibility page
	And Clicks Edit button for Child Added	
	And Enters DOB for Child as "<CDOB>"	
	And Click on Add Child button on Screen
	And Clicks on next button
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Validates that Rider Message is displayed for Self under GTLI
	And Validates that Basic Life Coverage Message is displayed for Self under GTLI
	And Validates Guaranteed Issue Coverage is Not displayed for Self under GTLI
	And Validates that Supplemental Spouse Coverage Message is displayed for Spouse under GTLI
	And Validates Guaranteed Issue Coverage is Not displayed for Spouse under GTLI
	And Selects Type of Coverage as "<TypeofCove>" for Self under GTLI
	And Verify Type of Coverage Change in Coverage is Unavailable for Spouse under GTLI
	And Selects Type of Coverage as "<TypeofCove1>" for Self under GTLI
	And Verify Type of Coverage Change in Coverage is Available for Spouse under GTLI
	And Selects Type of Coverage as "<TypeofCove>" for Spouse under G-TLI
	And Selects Benefit Amount for Self as "<Benefit>" under GTLI
	And Validates under GTLI the Benefit Slider Range for Self as "<Min_Self>" to "<Max_Self>"
	And Selects Benefit Amount for Spouse as "<SBenefit>" under GTLI
	And Validates under GTLI the Benefit Slider Range for Spouse as "<Min_Spouse>" to "<Max_Spouse>"
	And Verify Benefit Amount as "<CBenefit>" for Child under GTLI on Request Coverage Page
	And Clicks on next button
	Then Request Coverage - Health Questions page is displayed to user
	And Selects Yes for all Health Questions of Request Coverage under Self
	And Clicks on Add Details Button of First question for Self
	And Explanation Screen is displayed to User and Enters details as "<EMonth1>","<EYear1>","<ECon1>","<EAddress1>"
	And Clicks on Add Button
	And Clicks on Add Details Button of Second question for Self
	And Explanation Screen is displayed to User and Enters details as "<EMonth2>","<EYear2>","<ECon2>","<EAddress2>"
	And Clicks on Add Button
	And Clicks on Add Details Button of Third question for Self
	And Explanation Screen is displayed to User and Enters details as "<EMonth2>","<EYear2>","<ECon2>","<EAddress2>"
	And Clicks on Add Button
	And Selects Yes for all Health Questions Request Coverage under Spouse
	And Clicks on Add Details Button of First question for Spouse
	And Explanation Screen is displayed to User and Enters details as "<SEMonth1>","<SEYear1>","<SECon1>","<SEAddress1>"
	And Clicks on Add Button
	And Clicks on Add Details Button of Second question for Spouse
	And Explanation Screen is displayed to User and Enters details as "<SEMonth2>","<SEYear2>","<SECon2>","<SEAddress2>"
	And Clicks on Add Button
	And Clicks on Add Details Button of Third question for Spouse
	And Explanation Screen is displayed to User and Enters details as "<SEMonth2>","<SEYear2>","<SECon2>","<SEAddress2>"
	And Clicks on Add Button
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Add Beneficiary Button for Self under GTLI
	Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
	And User Enters Beneficiary details as "<Tname>","<DateTrust>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GTLI
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relation>","<Perc>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GTLI
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname1>","<Blname1>","<Relation1>","<Perc1>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GTLI
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname2>","<Blname2>","<Relation2>","<Perc2>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GTLI
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname3>","<Blname3>","<Relation3>","<Perc3>"
	And Clicks on OK button
	And Clicks on next button
	Then Enters contact Details for Self without MemberShipID,Mstatus as "<SSN>","<Height>","<Weight>","<Gender_Self>","<StreetAddress>","<City>","<ZipCode>"
	And Selects "<PhoneType>" and enter phonenumber "<PhoneNo>" for Self at contact page
	And Enter optional SSN "<SSSN>" for Spouse
	And Enters contact Details for Spouse without SSN as "<SGender>","<SHeight>","<SWeight>","<SPhoneType>","<SPhoneNum>"
	And Clicks on next button
	Then Application Preview Page is displayed to user
	And Verify Benefit Amount for Self as "<Benefit>" under GTLI
	And Verify Benefit Amount for Spouse as "<SBenefit1>" under GTLI
	And Verify Benefit Amount for Child as "<CBenefit1>" under GTLI
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Selects Payment Method for GTLI
	Then Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for GTLI Product "<Frequency>"
	And Confirms I have read the Information Check Box on Payment Page
	And Clicks on next button
	Then Authorize page details are displayed to user
	And Validates Fraud Notice in Read and Sign Box
	And Validates I Understand verbiage one in Read and Sign Box
	And Validates I Understand verbiage two in Read and Sign Box
	And Validates Consent message Non GI in Read and Sign Box																			
	And Validate Authorization message NY in Read and Sign Box
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	Then Authorize page details are displayed to user and confirm the term and conditions for Spouse
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Payment Authorization Letter is displayed to user and clicks on Continue
	And Signs Payment Authorization Letter
	And Clicks on next button to finish
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"
	

Examples:
|Website |Title  |Fname |Lname |State    |State1|DOB                   |DOB1                   |EAgency     |EDate                 |Hear  |Hdetails |MStatus |SDOB1                |Stitle |Sfname |Slname |SDOB                  |MDate                |Cfname |Clname |CDOB                 |CDOB1                |CGender |Min_Self |Max_Self  |Min_Spouse |Max_Spouse |Benefit |SBenefit |SBenefit1 |CBenefit |CBenefit1|EMonth1 |EYear1 |ECon1        |EAddress1              |EMonth2 |EYear2 |ECon2 |EAddress2             |EMonth3 |EYear3 |ECon3    |EAddress3              |SEMonth1 |SEYear1 |SECon1 |SEAddress1                |SEMonth2 |SEYear2 |SECon2   |SEAddress2              |SEMonth3 |SEYear3 |SECon3  |SEAddress3         |Tname |DateTrust  |Bfname |Blname |Relation |Perc |Bfname1 |Blname1 |Relation1 |Perc1 |Bfname2 |Blname2 |Relation2 |Perc2 |Bfname3 |Blname3 |Relation3 |Perc3 |SSN         |Gender_Self |Height |Weight |StreetAddress     |City     |ZipCode |PhoneType |PhoneNo    |SSSN        |SHeight |SWeight |SGender |SPhoneType |SPhoneNum   |Bank    |AccName   |Rnum      |Anum              |Frequency|TypeofCove|TypeofCove1       |
|crbg    |Mr.    |Adam  |Gill  |New York |Guam  |SYSDate - 17Y/00M/00D |SYSDate - 16Y/11M/29D  |Greyson Co. |SYSDate - 00Y/00M/61D |Other |Poster   |Married |SYSDate - 16Y/11M/29D|Mrs.   |Bella  |Gill   |SYSDate - 17Y/00M/00D |SYSDate - 00Y/00M/61D|John   |Gill   |SYSDate - 25Y/11M/29D|SYSDate - 26Y/00M/00D|Male    |$50,000  | $500,000 |$10,000    |$100,000   |$50,000 |$10,000  |$20,000*  |$20,000  |$20,000* |02      |2000   |Kidney Stone |Dr. Miller, Warren, NJ |05      |2012   |Cyst  |Dr. Brian, Denver, Co |12      |2013   |Migraine |Dr. Benson, Miami, FL  |10       |2018    |Cynus  |Dr. Vagghn, Las Vegas, NV |09       |2016    |Fracture |Dr. Boxwell, Boston, MA |08       |2014    |Rupture |Dr. Toigo, Chicago |BOA   |10/11/2017 |Mia    |Gill   |Daughter |20   |Sarah   |Gill    |Daughter  |20    |Rose    |Gill    |Mother    |30    |James   |Gill    |Father    |30    |741-25-8963 |Male        |5.7    |140    |44 Downing St #3C |New York |10014   |Mobile    |1234567890 |266-46-4546 |5.9     |184     |Female  |Home       |0123456789  |NY Bank |Adam Gill |745688999 |35434354879988588 |Monthly  |New       |Change in Coverage|


@CrbgRegression_2
Scenario Outline: <SC02> Application submission for Self and Spouse  with Group Term Life Insurance Only Beneficiaries- (4 Primary Individual, 4 Contingent Individual)

	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB1>"
	And Enter details for Employment Date as "<EDate>"
	And Enter Employer Or Agency Name as "<EAgency>"
	And Selects Yes Radio button of full- or part-time civilian employee for Self
	And Selects No Radio Button for Dependent Children
	And Selects Marital Status as "<MStatus>"
	And Selects Hear about us as "<Hear>"
	And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB1>"
	And Enters Marraige Date for Spouse as "<MDate>"
	And Clicks on next button
	Then Product page details are displayed to user 
	And Verify Self is displayed for GTLI
	And Verify that Spouse icon is not displayed under GTLI
	And Selects product GTLI for Self
	And Clicks on next button

	Then Request Coverage page is displayed to user
	And Verify that Spouse Benefit is not rendered under GTLI
	And Navigate back to Eligibility page
	And Enters DOB for Self as "<DOB>"
	And Enters DOB for Spouse as "<SDOB>"
	And Clicks on next button

	Then Product page details are displayed to user
	And Verify that Self and Spouse are available under GTLI
	And Clicks on next button

	Then Request Coverage page is displayed to user
	And Validates that Rider Message is displayed for Self under GTLI
	And Validates that Basic Life Coverage Message is displayed for Self under GTLI
	And Validates Guaranteed Issue Coverage is Not displayed for Self under GTLI
	And Validates Guaranteed Issue Coverage is Not displayed for Spouse under GTLI
	And Selects Type of Coverage as "<TypeofCove>" for Self under GTLI
	And Selects Benefit Amount for Self as "<Benefit>" under GTLI
	And Validates under GTLI the Benefit Slider Range for Self as "<Min_Self>" to "<Max_Self>"
	And Verify Benefit Amount as "<SBenefit>" for Spouse under GTLI on Request Coverage Page
	And Clicks on next button

	Then Request Coverage - Health Questions page is displayed to user
	And Selects No for all Health Questions of Request Coverage under Self
	And Clicks on next button
	And Clicks on Add Beneficiary Button for Self under GTLI
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bfname1>","<Blname1>","<Relation1>","<Perc1>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GTLI
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bfname2>","<Blname2>","<Relation2>","<Perc2>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GTLI
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bfname3>","<Blname3>","<Relation3>","<Perc3>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GTLI
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship as other "<Bfname4>","<Blname4>","<Relation4>","<Perc4>","<Description>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GTLI
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname5>","<Blname5>","<Relation5>","<Perc5>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GTLI
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname6>","<Blname6>","<Relation6>","<Perc6>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GTLI
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname7>","<Blname7>","<Relation7>","<Perc7>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GTLI
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname8>","<Blname8>","<Relation8>","<Perc8>"
	And Clicks on OK button
	And Delete First Contingent Beneficiary
	And Delete box is displayed and clicks on Yes
	And Clicks on next button
	And Validates error message for Beneficiaries Percentage share
	And Clicks on Add Beneficiary Button for Self under GTLI
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname5>","<Blname5>","<Relation5>","<Perc5>"
	And Clicks on OK button
	And Clicks on next button

	Then Enters contact Details for Self without MemberShipID,Mstatus as "<SSN>","<Height>","<Weight>","<Gender>","<StreetAddress>","<City>","<ZipCode>"
	And Selects "<PhoneType>" and enter phonenumber "<PhoneNo>" for Self at contact page
	And Clicks on next button

	Then Application Preview Page is displayed to user
	And Verify Benefit Amount for Self as "<Benefit>" under GTLI
	And Verify Benefit Amount for Spouse as "<SBenefit1>" under GTLI
	And Clicks on next button

	Then Payment Information Page is displayed to user
	And Selects Payment Method for GTLI
	Then Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for GTLI Product "<Frequency>"
	And Confirms I have read the Information Check Box on Payment Page
	And Clicks on next button
	

	Then Authorize page details are displayed to user
	And Clicks on next button
	And Validate Error message for Authorization 
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	And Clicks on next button

	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Payment Authorization Letter is displayed to user and clicks on Continue
	And Signs Payment Authorization Letter
	And Clicks on next button to finish
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"
	


Examples:
|Website |Title  |Fname   |Lname  |State   |DOB                  |DOB1                  |EAgency  |EDate                 |Hear    |MStatus          |SDOB1                 |Stitle |Sfname |Slname |SDOB                  |MDate                |Benefit  |SBenefit |SBenefit1|Min_Self |Max_Self  |Bfname1 |Blname1 |Relation1 |Perc1 |Bfname2 |Blname2 |Relation2 |Perc2 |Bfname3  |Blname3 |Relation3|Perc3 |Bfname3     |Blname3 |Relation3|Perc3 |Bfname4 |Blname4 |Relation4 |Description |Perc4 |Bfname5 |Blname5 |Relation5 |Perc5 |Bfname6 |Blname6 |Relation6 |Perc6 |Bfname7 |Blname7 |Relation7 |Perc7 |Bfname8   |Blname8 |Relation8 |Perc8 |SSN         |Gender |Height|Weight |StreetAddress  |City      |ZipCode |PhoneType |PhoneNo   |Bank    |AccName   |Rnum      |Anum              |Frequency	|TypeofCove|
|crbg    |Mr.    |William |Smith  |Florida |SYSDate - 69Y/11M/29D|SYSDate - 75Y/00M/00D |Buzz Co. |SYSDate - 00Y/00M/61D |Mailing |Domestic Partner |SYSDate - 75Y/00M/00D |Mrs.   |Emma   |Smith  |SYSDate - 74Y/11M/29D |SYSDate - 00Y/00M/59D|$32,500  |$10,000  |$10,000* |$32,500  |$325,000  |Olivia  |Smith   |Daughter  |20    |Ava     |Smith   |Daughter  |20    |Isabella |Smith   |Mother   |30    |Christopher |Smith   |Father   |30    |Joshua  |Smith   |Other     |Son-in-law  |30    |Michael |Smith   |Spouse    |70    |Jackson |Smith   |Son       |10    |Sophia  |Smith   |Mother    |10    |Charlotte |Smith   |Daughter  |10    |701-05-8963 |Male   |5.4   |130    |3300 N Surf Rd |Hollywood |33019   |Mobile    |1230007890|NY Bank |Adam Gill |723688999 |35434300000988588 |Monthly   |New       |

@CrbgRegression_3
Scenario Outline: <SC03> Application submission for Self and Spouse  with Guaranteed Issue Coverage,Beneficiaries - (For Self) - 4 Primary Individual, 1 Contingent Trust

	Given Test set up for "NYL" feature and "NYL_CRBG" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB1>"
	And Enter details for Employment Date as "<EDate>"
	And Enter Employer Or Agency Name as "<EAgency>"	
	
	And Selects Yes Radio button of full- or part-time civilian employee for Self
	And Selects No Radio Button for Dependent Children
	And Selects Marital Status as "<MStatus>"
	And Selects Hear about us as "<Hear>"
	And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB1>"
	And Enters Marraige Date for Spouse as "<MDate>"
	And Clicks on next button

	Then Product page details are displayed to user
	And Verify Self is displayed for GTLI
	And Verify that Spouse icon is not displayed under GTLI
	And Selects product GTLI for Self
	And Clicks on next button

	Then Request Coverage page is displayed to user
	And Validates Guaranteed Issue Coverage is displayed for Self under GTLI
	And Validates under GTLI the Benefit Slider Range for Self as "<Min_Self>" to "<Max_Self>"

	And Navigate back to Eligibility page
	And Enters DOB for Self as "<DOB2>"
	And Enters DOB for Spouse as "<SDOB2>"
	And Clicks on next button

	Then Product page details are displayed to user
	And Verify that Self and Spouse are available under GTLI
	And Selects product GTLI for Spouse
	And Clicks on next button

	Then Request Coverage page is displayed to user
	And Selects Type of Coverage as "<TypeofCove>" for Self under GTLI
	And Verify Type of Coverage Change in Coverage is Unavailable for Spouse under GTLI
	And Selects Type of Coverage as "<TypeofCove1>" for Self under GTLI
	And Verify Type of Coverage Change in Coverage is Available for Spouse under GTLI
	And Selects Type of Coverage as "<TypeofCove1>" for Spouse under G-TLI
	And Validates Guaranteed Issue Coverage is displayed for Self under GTLI
	And Validates that Rider Message is displayed for Self under GTLI
	And Validates that Basic Life Coverage Message is displayed for Self under GTLI
	And Validates under GTLI the Benefit Slider Range for Self as "<Min_Self>" to "<Max_Self>"
	And Selects Benefit Amount for Self as "<Benefit1>" under GTLI
	And Validates Guaranteed Issue Coverage is displayed for Self under GTLI
	And Validates under GTLI the Benefit Slider Range for Spouse as "<Min_Spouse>" to "<Max_Spouse>"
	And Selects Benefit Amount for Spouse as "<SBenefit1>" under GTLI
	And Clicks on next button

	And Request Coverage - Health Questions page is displayed to user
	And Verify that Health Questions are rendered for Self
	And Verify that Health Questions are rendered for Spouse
	And Clicks on Back or Previous button

	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit2>" under GTLI
	And Selects Benefit Amount for Spouse as "<SBenefit2>" under GTLI
	And Clicks on next button

	And Beneficiary Page is displayed to user
	And Navigate back to Eligibility page
	And Enters DOB for Self as "<DOB3>"
	And Enters DOB for Spouse as "<SDOB3>"
	And Clicks on next button
	And Clicks on next button

	Then Request Coverage page is displayed to user
	And Validates Guaranteed Issue Coverage is displayed for Self under GTLI
	And Validates under GTLI the Benefit Slider Range for Self as "<Min_Self1>" to "<Max_Self1>"
	And Selects Benefit Amount for Self as "<Benefit3>" under GTLI
	And Validates Guaranteed Issue Coverage is displayed for Spouse under GTLI
	And Validates under GTLI the Benefit Slider Range for Spouse as "<Min_Spouse1>" to "<Max_Spouse1>"
	And Selects Benefit Amount for Spouse as "<SBenefit3>" under GTLI
	And Clicks on next button

	Then Request Coverage - Health Questions page is displayed to user
	And Verify that Health Questions are rendered for Self
	And Verify that Health Questions are rendered for Spouse
	And Clicks on Back or Previous button

	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit4>" under GTLI
	And Selects Benefit Amount for Spouse as "<SBenefit4>" under GTLI
	And Clicks on next button
	And Beneficiary Page is displayed to user

	And Navigate back to Eligibility page
	And Enters DOB for Self as "<DOB4>"
	And Enters DOB for Spouse as "<SDOB4>"
	And Clicks on next button
	And Clicks on next button

	Then Request Coverage page is displayed to user
	And Validates Guaranteed Issue Coverage is displayed for Self under GTLI
	And Validates under GTLI the Benefit Slider Range for Self as "<Min_Self2>" to "<Max_Self2>"
	And Selects Benefit Amount for Self as "<Benefit5>" under GTLI
	And Validates Guaranteed Issue Coverage is displayed for Spouse under GTLI
	And Validates under GTLI the Benefit Slider Range for Spouse as "<Min_Spouse2>" to "<Max_Spouse2>"
	And Selects Benefit Amount for Spouse as "<SBenefit5>" under GTLI
	And Clicks on next button

	Then Request Coverage - Health Questions page is displayed to user
	And Verify that Health Questions are rendered for Self
	And Verify that Health Questions are rendered for Spouse
	And Clicks on Back or Previous button

	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit6>" under GTLI
	And Selects Benefit Amount for Spouse as "<SBenefit6>" under GTLI
	And Clicks on next button
	And Beneficiary Page is displayed to user

	 And Navigate back to Eligibility page
	And Enters DOB for Self as "<DOB>"
	And Enters DOB for Spouse as "<SDOB>"
	And Enter details for Employment Date as "<EDate1>"
	And Clicks on next button
	And Clicks on next button

	Then Request Coverage page is displayed to user
	And Validates Guaranteed Issue Coverage is Not displayed for Self under GTLI
	And Validates Guaranteed Issue Coverage is Not displayed for Spouse under GTLI

	And Navigate back to Eligibility page
	And Enter details for Employment Date as "<EDate>"
	And Clicks on next button
	And Clicks on next button

	Then Request Coverage page is displayed to user
	And Validates Guaranteed Issue Coverage is displayed for Self under GTLI
	And Selects Benefit Amount for Self as "<Benefit7>" under GTLI
	And Validates Guaranteed Issue Coverage is displayed for Spouse under GTLI
	And Selects Benefit Amount for Spouse as "<SBenefit7>" under GTLI
	And Clicks on next button

	Then Request Coverage - Health Questions page is displayed to user
	And Verify that Health Questions are rendered for Self
	And Verify that Health Questions are rendered for Spouse
	And Clicks on Back or Previous button

	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit9>" under GTLI
	And Clicks on next button
	And Verify Spouse cannot exceed Member Error Message under GTLI
	And Selects Benefit Amount for Self as "<Benefit8>" under GTLI
	And Selects Benefit Amount for Spouse as "<SBenefit8>" under GTLI
	And Clicks on next button
	

	Then Beneficiary Page is displayed to user
	And Clicks on Add Beneficiary Button for Self under GTLI
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relation>","<Perc>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GTLI
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bfname1>","<Blname1>","<Relation1>","<Perc1>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GTLI
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bfname2>","<Blname2>","<Relation2>","<Perc2>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GTLI
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bfname3>","<Blname3>","<Relation3>","<Perc3>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GTLI
	Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
    And User Enters Beneficiary details as "<Tname>","<DateTrust>"
	And Clicks on OK button
	And Clicks on next button

	Then Contact Details page is displayed to user
	And Validates Height and Weight is not displayed for Self
	And Enters contact Details for self Without MemberID,Height,Weight,Mstatus as "<SSN>","<Gender_Self>","<StreetAddress>","<City>","<ZipCode>"
	And Selects "<PhoneType>" and enter phonenumber "<PhoneNo>" for Self at contact page
	And Enters Details for Spouse like Gender,Phone type and Phone number "<SGender>","<SPhoneType>","<SPhoneNum>"
	And Clicks on next button

	Then Application Preview Page is displayed to user
	And Verify Benefit Amount for Self as "<Benefit8>" under GTLI
	And Verify Benefit Amount for Spouse as "<SBenefit9>" under GTLI
	And Clicks on next button

	Then Payment Information Page is displayed to user
	And Selects Payment Method for GTLI
	Then Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for GTLI Product "<Frequency>"
	And Confirms I have read the Information Check Box on Payment Page
	And Clicks on next button

	Then Authorize page details are displayed to user
	And Validates Fraud Notice in Read and Sign Box
	And Validates Consent message GI in Read and Sign Box	
	And Validates I Understand verbiage one in Read and Sign Box
	And Validates that Second I understand verbiage is not displayed in Read and Sign Box
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	Then Authorize page details are displayed to user and confirm the term and conditions for Spouse
	And Clicks on next button

	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Payment Authorization Letter is displayed to user and clicks on Continue
	And Signs Payment Authorization Letter
	And Clicks on next button to finish

	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"


Examples:
|Website |Title  |Fname  |Lname |State    |DOB                   |EAgency       |EDate                 |Hear         |MStatus |Stitle |Sfname |Slname|SDOB                   |MDate                 |DOB1                  |SDOB1                 |DOB2                  |SDOB2                 |DOB3                  |SDOB3                 |DOB4                  |SDOB4                 |EDate1                |Min_Self |Max_Self |Min_Spouse |Max_Spouse |Min_Self1  |Max_Self1  |Min_Spouse1  |Max_Spouse1 |Min_Self2 |Max_Self2 |Min_Spouse2 |Max_Spouse2|Benefit1 |SBenefit1 |Benefit2 |SBenefit2 |Benefit3 |SBenefit3 |Benefit4 |SBenefit4 |Benefit5 |SBenefit5 |Benefit6 |SBenefit6 |Benefit7 |SBenefit7 |Benefit8  |SBenefit8 |Benefit9  |SBenefit9|Tname       |DateTrust  |Bfname |Blname |Relation |Perc |Bfname1 |Blname1 |Relation1 |Perc1 |Bfname2 |Blname2 |Relation2 |Perc2 |Bfname3 |Blname3 |Relation3 |Perc3 |SSN         |Gender_Self |StreetAddress         |City  |ZipCode|PhoneType |PhoneNo    |SGender |SPhoneType |SPhoneNum   |Bank        |AccName     |Rnum      |Anum              |Frequency  |TypeofCove|TypeofCove1       |
|crbg    |Prof.  |Jayden |Hall  |Delaware |SYSDate - 49Y/11M/29D |Blackcops Co. |SYSDate - 00Y/00M/59D |CRBG Website |Married |Ms.    |Amelia |Hall  |SYSDate - 49Y/11M/29D  |SYSDate - 00Y/02M/00D |SYSDate - 75Y/00M/00D |SYSDate - 75Y/00M/00D |SYSDate - 74Y/11M/29D |SYSDate - 74Y/11M/29D |SYSDate - 69Y/11M/29D |SYSDate - 69Y/11M/29D |SYSDate - 64Y/11M/29D |SYSDate - 64Y/11M/29D |SYSDate - 00Y/00M/60D |$25,000  |$250,000 |$5,000     |$50,000    |$32,500    |$325,000   |$6,500       |$65,000     |$50,000   |$500,000  |$10,000     |$100,000   |137,500  |$27,500    |125,000  |25,000    |178,750  |26,000    |162,500  |22,750    |275,000   |30,000   |250,000  |25,000    |275,000  |55,000    |$250,000  |50,000    |50,000    |$60,000* |French Bank |10/11/2018 |Evelyn |Hall   |Daughter |10   |Abigail |Hall    |Daughter  |10    |Harper  |Hall    |Mother    |70    |Ethan   |Hall    |Father    |10    |123-12-1234 |Male        |1080 Silver Lake Blvd |Dover |19904  |Mobile    |1235252890 |Female  |Home       |0127788789  |Canada Bank |Jayden Hall |744561299 |35434745968288588 |Monthly    |New       |Change in Coverage|

@CrbgRegression_4
Scenario Outline: <SC04> Application submission for Spouse Only with (Supplemental Spouse Coverage) Beneficiaries - NA

	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
	And Enter details for Employment Date as "<EDate>"
	And Enter Employer Or Agency Name as "<EAgency>"
	And Selects Yes Radio button of full- or part-time civilian employee for Self
	And Selects No Radio Button for Dependent Children
	And Selects Marital Status as "<MStatus>"
	And Selects Hear about us as "<Hear>"
	And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB1>"
	And Enters Marraige Date for Spouse as "<MDate>"
	And Clicks on next button

	Then Product page details are displayed to user
	And Verify Self is displayed for GTLI
	And Verify that Spouse icon is not displayed under GTLI
	And Clicks on Back or Previous button

	And Enters DOB for Spouse as "<SDOB>"
	And Clicks on next button

	Then Product page details are displayed to user
	And Verify that Self and Spouse are available under GTLI
	And Selects product GTLI for Spouse
	And Clicks on next button
	Then Click YES for Dependent Coverage information 

	Then Request Coverage page is displayed to user
	And Selects Inforce Benefit Amount for Self as "<Benefit>" under GTLI
	And Validates under GTLI the Inforce Benefit Slider Range for Self as "<Min_Self>" to "<Max_Self>"
	And Validates that Supplemental Spouse Coverage Message is displayed for Spouse under GTLI
	And Selects Benefit Amount for Spouse as "<SBenefit>" under GTLI
	And Validates under GTLI the Benefit Slider Range for Spouse as "<Min_Spouse>" to "<Max_Spouse>"
	And Selects Type of Coverage as "<TypeofCove>" for Spouse under G-TLI
	And Clicks on next button

	And Request Coverage - Health Questions page is displayed to user
	And Verify that Health Questions are not rendered for Self
	And Selects No for all Health Questions of Request Coverage under Spouse
	And Clicks on next button

	Then Contact Details page is displayed to user
	And Validates Height and Weight is not displayed for Self
	And Enters contact Details for self Without MemberID,Height,Weight,Mstatus as "<SSN>","<Gender_Self>","<StreetAddress>","<City>","<ZipCode>"
	And Selects "<PhoneType>" and enter phonenumber "<PhoneNo>" for Self at contact page
	And Enters contact Details for Spouse without SSN as "<SGender>","<SHeight>","<SWeight>","<SPhoneType>","<SPhoneNum>"
	And Clicks on next button

	Then Application Preview Page is displayed to user
	And Verify Benefit Amount for Spouse as "<SBenefit1>" under GTLI
	And Clicks on next button

	Then Payment Information Page is displayed to user
	And Selects Payment Method for GTLI
	Then Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for GTLI Product "<Frequency>"
	And Confirms I have read the Information Check Box on Payment Page
	And Clicks on next button

	Then Authorize page details are displayed to user
	And Validates Consent message Non GI in Read and Sign Box
	And Validates Fraud Notice in Read and Sign Box
	And Validate Authorization message NY in Read and Sign Box
	And Validates I Understand verbiage one in Read and Sign Box
	And Validates I Understand verbiage two in Read and Sign Box
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	Then Authorize page details are displayed to user and confirm the term and conditions for Spouse
	And Clicks on next button

	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Payment Authorization Letter is displayed to user and clicks on Continue
	And Signs Payment Authorization Letter
	And Clicks on next button to finish

	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"

Examples:
|Website |Title  |Fname |Lname |State                |DOB                   |EAgency   |EDate                 |Hear     |MStatus     |SDOB1                 |Stitle |Sfname |Slname |SDOB                  |MDate                 |Min_Self |Max_Self |Min_Spouse |Max_Spouse |Benefit  |SBenefit |SBenefit1|SSN         |Gender_Self |StreetAddress           |City       |ZipCode|PhoneType |PhoneNo    |SHeight |SWeight |SGender |SPhoneType |SPhoneNum   |Bank     |AccName   |Rnum      |Anum              |Frequency |TypeofCove        |
|crbg    |Mr.    |Tyler |Cox   |District of Columbia |SYSDate - 35Y/00M/00D |Smile Co. |SYSDate - 00Y/00M/61D |Referral |Civil Union |SYSDate - 75Y/00M/00D |Mrs.   |Emily  |Cox    |SYSDate - 69Y/11M/29D |SYSDate - 00Y/00M/61D |50,000   |500,000  |6,500      |65,000     |$500,000 |$65,000  |$75,000* |111-25-8222 |Male        |333 Constitution Avenue |Washington |20521  |Mobile    |1123654890 |5.9     |175     |Female  |Home       |0121111119  |IBI Bank |Tyler Cox |746547099 |35434352222288588 |Monthly   |Change in Coverage|


@CrbgRegression_5
Scenario Outline: <SC05> Application submission for Self and Max Child  with Group Term Life Insurance Only Beneficiaries- Primary Individual, Contingent Trust

	Given Test set up for "NYL" feature and "NYL_CRBG" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB1>"
	And Enter details for Employment Date as "<EDate>"
	And Enter Employer Or Agency Name as "<EAgency>"
	And Selects Yes Radio button of full- or part-time civilian employee for Self
	And Selects Yes Radio Button for Dependent Children
	And Selects Marital Status as "<MStatus1>"												
	And Selects Hear about us as "<Hear>"
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname1>","<Clname1>","<CDOB1>","<CGender1>"
	And Selects Married question as Yes for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname2>","<Clname2>","<CDOB2>","<CGender2>"
	And Selects Married question as No for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname3>","<Clname3>","<CDOB3>","<CGender3>"
	And Selects Married question as No for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname4>","<Clname4>","<CDOB4>","<CGender4>"
	And Selects Married question as Yes for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname5>","<Clname5>","<CDOB5>","<CGender5>"
	And Selects Married question as No for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname6>","<Clname6>","<CDOB6>","<CGender6>"
	And Selects Married question as No for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname7>","<Clname7>","<CDOB7>","<CGender7>"
	And Selects Married question as No for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname8>","<Clname8>","<CDOB8>","<CGender8>"
	And Selects Married question as No for Child
	And Click on Add Child button on Screen
	And Validates Add Child Button on Eligibility page is not present
	And Clicks on next button
	
	Then Product page details are displayed to user 
	And Verify that GTLI is not available for Self and Spouse
	And Clicks on Back or Previous button
	And Enters DOB for Self as "<DOB>" 												
	And Selects Marital Status as "<MStatus>"												
	And Clicks on next button
	
	Then Product page details are displayed to user
	And Verify Self is displayed for GTLI
	And Selects product GTLI for Self
	And Clicks on next button
	
	Then Request Coverage page is displayed to user
	And Validates under GTLI the Benefit Slider Range for Self as "<Min_Self>" to "<Max_Self>"
	And Selects Benefit Amount for Self as "<Benefit>" under GTLI
	And Selects Type of Coverage as "<TypeofCove>" for Self under GTLI
	And Verify Benefit Amount as "<CBenefit>" for Child under GTLI on Request Coverage Page
	And Clicks on next button
	
	Then Request Coverage - Health Questions page is displayed to user
	And Selects No for all Health Questions of Request Coverage under Self
	And Clicks on next button
	
	Then Beneficiary Page is displayed to user
	And Clicks on Add Beneficiary Button for Self under GTLI
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relation>","<Perc>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GTLI
	Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
    And User Enters Beneficiary details as "<Tname>","<DateTrust>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GTLI
	Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
    And User Enters Beneficiary details as "<Tname1>","<DateTrust1>"
	And Clicks on OK button
	And Validates error message on Beneficiary page that Only one Trust is allowed as Contingent
	And Clicks on Close button
	And Clicks on next button
	
	Then Enters contact Details for Self without MemberShipID,Mstatus as "<SSN>","<Height>","<Weight>","<Gender>","<StreetAddress>","<City>","<ZipCode>"
	And Selects "<PhoneType>" and enter phonenumber "<PhoneNo>" for Self at contact page
	And Clicks on next button
	
	Then Application Preview Page is displayed to user
	And Verify Benefit Amount for Self as "<Benefit>" under GTLI
	And Verify Child name as "<Cfname3>","<Cfname3>"
	And Verify Benefit Amount for Child "<Cfname3>","<GTL_SequenceNo1>" as "<CBenefit1>" under GroupTermLife
	And Verify Child name as "<Cfname5>","<Cfname5>"
	And Verify Benefit Amount for Child "<Cfname5>","<GTL_SequenceNo2>" as "<CBenefit1>" under GroupTermLife
	And Verify Child name as "<Cfname6>","<Cfname6>"
	And Verify Benefit Amount for Child "<Cfname6>","<GTL_SequenceNo3>" as "<CBenefit1>" under GroupTermLife
	And Verify Child name as "<Cfname7>","<Cfname7>"
	And Verify Benefit Amount for Child "<Cfname7>","<GTL_SequenceNo4>" as "<CBenefit1>" under GroupTermLife
	And Verify Child name as "<Cfname8>","<Cfname8>"
	And Verify Benefit Amount for Child "<Cfname8>","<GTL_SequenceNo5>" as "<CBenefit1>" under GroupTermLife
	And Clicks on next button
	
	Then Payment Information Page is displayed to user
	And Selects Payment Method for GTLI
	Then Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for GTLI Product "<Frequency>"
	And Confirms I have read the Information Check Box on Payment Page
	And Clicks on next button
	
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	And Clicks on next button
	
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Payment Authorization Letter is displayed to user and clicks on Continue
	And Signs Payment Authorization Letter
	And Clicks on next button to finish
	
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"

Examples:
|Website |Title  |Fname |Lname  |State     |DOB                   |DOB1                   |EAgency    |EDate                 |Hear       |MStatus  |MStatus1 |Cfname1   |Clname1 |CDOB1                 |CGender1 |Cfname2 |Clname2 |CDOB2                 |CGender2 |Cfname3 |Clname3 |CDOB3                |CGender3 |Cfname4 |Clname4 |CDOB4                 |CGender4 |Cfname5 |Clname5 |CDOB5                 |CGender5 |Cfname6 |Clname6 |CDOB6                 |CGender6 |Cfname7 |Clname7 |CDOB7       |CGender7 |Cfname8 |Clname8 |CDOB8                 |CGender8 |Min_Self |Max_Self |Benefit |CBenefit |CBenefit1|Tname      |DateTrust  |Tname1     |DateTrust1 |Bfname |Blname |Relation |Perc |SSN         |Gender |Height |Weight |StreetAddress     |City       |ZipCode |PhoneType |PhoneNo    |Bank    |AccName   |Rnum      |Anum              |Frequency|TypeofCove|GTL_SequenceNo1|GTL_SequenceNo2|GTL_SequenceNo3|GTL_SequenceNo4|GTL_SequenceNo5|
|crbg    |Mr.    |Aiden |Cooper |Minnesota |SYSDate - 70Y/00M/00D |SYSDate - 16Y/11M/29D  |Vision Co. |SYSDate - 01Y/00M/00D |Newsletter |Divorced |Widowed  |Elizabeth |Cooper  |SYSDate - 22Y/11M/29D |Female   |Avery   |Cooper  |SYSDate - 26Y/00M/00D |Female   |Nancy   |Cooper  |SYSDate - 25Y/11M/29D|Female   |Fiona   |Cooper  |SYSDate - 25Y/11M/29D |Female   |Jack    |Cooper  |SYSDate - 23Y/00M/00D |Male     |Mark    |Cooper  |SYSDate - 22Y/00M/00D |Male     |Johnny  |Cooper  |CurrentDate |Male     |Gregg   |Cooper  |SYSDate - 01Y/00M/00D |Male     |$25,000  |$250,000 |$25,000 |$20,000  |$20,000* |Naya Trust |10/11/2017 |Mera Trust |11/11/2017 |Mia    |Cooper |Daughter |100  |777-11-5555 |Male   |6.0    |200    |44 Downing St #3C |Saint Paul |55101   |Mobile    |1234777222 |NY Bank |Adam Gill |722266699 |35445612399988588 |Monthly  |New       |1              |2              |3              |4              |5              |

@CrbgRegression_6
Scenario Outline: <SC06> Application submission for Self Group Term Life Insurance  and Spouse Guaranteed Issue Coverage ,Beneficiaries - NO

	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
	And Enter details for Employment Date as "<EDate>"
	And Enter Employer Or Agency Name as "<EAgency>"	
	And Selects Yes Radio button of full- or part-time civilian employee for Self
	And Selects No Radio Button for Dependent Children
	And Selects Marital Status as "<MStatus>"
	And Selects Hear about us as "<Hear>"
	And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
	And Enters Marraige Date for Spouse as "<MDate1>"
	And Clicks on next button

	Then Product page details are displayed to user
	And Verify that Self and Spouse are available under GTLI
	And Selects product GTLI for Self
	And Selects product GTLI for Spouse
	And Clicks on next button

	Then Request Coverage page is displayed to user
	And Validates Guaranteed Issue Coverage is Not displayed for Self under GTLI
	And Validates Guaranteed Issue Coverage is Not displayed for Spouse under GTLI

	And Navigate back to Eligibility page
	And Enters Marraige Date for Spouse as "<MDate>"
	And Clicks on next button
	And Clicks on next button

	Then Request Coverage page is displayed to user
	And Selects Type of Coverage as "<TypeofCove>" for Self under GTLI
	And Validates Guaranteed Issue Coverage is Not displayed for Self under GTLI
	And Validates Guaranteed Issue Coverage is Not displayed for Spouse under GTLI
	And Selects Type of Coverage as "<TypeofCove>" for Spouse under G-TLI
	And Clicks on next button

	Then Request Coverage - Health Questions page is displayed to user
	And Verify that Health Questions are rendered for Self
	And Verify that Health Questions are rendered for Spouse
	And Clicks on Back or Previous button

	Then Request Coverage page is displayed to user
	And Selects Type of Coverage as "<TypeofCove1>" for Self under GTLI
	And Validates Guaranteed Issue Coverage is Not displayed for Self under GTLI
	And Validates Guaranteed Issue Coverage is displayed for Spouse under GTLI
	And Validates under GTLI the Benefit Slider Range for Self as "<Min_Self>" to "<Max_Self>"
	And Selects Benefit Amount for Self as "<Benefit>" under GTLI
	And Validates under GTLI the Benefit Slider Range for Spouse as "<Min_Spouse>" to "<Max_Spouse>"
	And Selects Benefit Amount for Spouse as "<SBenefit>" under GTLI
	And Clicks on next button

	Then Request Coverage - Health Questions page is displayed to user
	And Verify that Health Questions are not rendered for Spouse
	And Verify that Health Questions are rendered for Self
 	And Selects No for all Health Questions of Request Coverage under Self
	And Clicks on next button

	Then Beneficiary Page is displayed to user
	And Clicks on next button

	Then Contact Details page is displayed to user
	And Validates Height and Weight is displayed for Self
	Then Enters contact Details for Self without MemberShipID,Mstatus as "<SSN>","<Height>","<Weight>","<Gender>","<StreetAddress>","<City>","<ZipCode>"
	And Selects "<PhoneType>" and enter phonenumber "<PhoneNo>" for Self at contact page
	And Validates Height and Weight is not displayed for Spouse
	And Enters Details for Spouse like Gender,Phone type and Phone number "<SGender>","<SPhoneType>","<SPhoneNum>"
	And Clicks on next button

	Then Application Preview Page is displayed to user
	And Clicks on next button

	Then Payment Information Page is displayed to user
	And Selects Payment Method for GTLI
	Then Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for GTLI Product "<Frequency>"
	And Confirms I have read the Information Check Box on Payment Page
	And Clicks on next button

	Then Authorize page details are displayed to user
	And Validates Fraud Notice in Read and Sign Box
	And Validates Consent message Non GI in Read and Sign Box
	And Validate Authorization message NY in Read and Sign Box
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	Then Authorize page details are displayed to user and confirm the term and conditions for Spouse
	And Clicks on next button

	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Payment Authorization Letter is displayed to user and clicks on Continue
	And Signs Payment Authorization Letter
	And Clicks on next button to finish

	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"

Examples:
|Website |Title  |Fname |Lname  |State    |DOB                   |EAgency        |EDate                 |Hear         |MStatus |Stitle |Sfname |Slname |SDOB                  |MDate                 |MDate1                |Min_Self |Max_Self |Min_Spouse |Max_Spouse |Benefit  |SBenefit |SSN         |Height |Weight |Gender |StreetAddress              |City      |ZipCode |PhoneType |PhoneNo    |SGender |SPhoneType |SPhoneNum   |Bank     |AccName     |Rnum      |Anum              |Frequency|TypeofCove |TypeofCove1       |
|crbg    |Mr.    |Noah  |Turner |Colorado |SYSDate - 65Y/11M/29D |Rommelling Co. |SYSDate - 00Y/00M/60D |CRBG Website |Married |Mrs.   |Sofia  |Turner |SYSDate - 50Y/00M/00D |SYSDate - 00Y/00M/59D |SYSDate - 00Y/00M/60D |$32,500  |$325,000 |$10,000    |$100,000   |$325,000 |$15,000  |888-88-8888 |5.5    |166    |Male   |5555 E Briarwood Ave #1203 |Littleton |80122G  |Mobile    |1555557890 |Female  |Home       |0555556789  |BMC Bank |Noah Turner |745644444 |35434354444448588 |Monthly	 |New        |Change in Coverage|

@CrbgRegression_7
Scenario Outline: <SC07> Application submission for Spouse and ChildOnly with (Supplemental Spouse Coverage),Beneficiaries - NA

	Given Test set up for "NYL" feature and "NYL_CRBG" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
	And Enter details for Employment Date as "<EDate>"
	And Enter Employer Or Agency Name as "<EAgency>"													
	And Selects Yes Radio button of full- or part-time civilian employee for Self
	And Selects Yes Radio Button for Dependent Children
	And Selects Marital Status as "<MStatus>"
	And Selects Hear about us as "<Hear>"
	And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
	And Enters Marraige Date for Spouse as "<MDate>"													
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<CGender>"
	And Selects Married question as No for Child
	And Click on Add Child button on Screen
	And Clicks on next button

	Then Product page details are displayed to user
	And Verify that Self and Spouse are available under GTLI
	And Clicks on next button
	And Validate Error Message on Product Page
	And Selects product GTLI for Spouse
	And Clicks on next button
	Then Click YES for Dependent Coverage information

	Then Request Coverage page is displayed to user
	And Validates under GTLI the Inforce Benefit Slider Range for Self as "<Min_Self>" to "<Max_Self>"
	And Selects Inforce Benefit Amount for Self as "<Benefit>" under GTLI
	And Validates under GTLI the Benefit Slider Range for Spouse as "<Min_Spouse>" to "<Max_Spouse>"
	And Selects Benefit Amount for Spouse as "<SBenefit>" under GTLI
	And Selects Type of Coverage as "<TypeofCove>" for Spouse under G-TLI
	And Verify Benefit Amount as "<CBenefit>" for Child under GTLI on Request Coverage Page

	And Clicks on button to Save for later
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>" 
	And Clicks OK Button Save For Later
	Then Refresh the browser
	Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive
	And Clicks on next button

	Then Request Coverage - Health Questions page is displayed to user
	And Selects No for all Health Questions of Request Coverage under Spouse
	And Clicks on next button

	Then Enters contact Details for self Without SSN,MemberID,Height,Weight,Mstatus as "<Gender>","<StreetAddress>","<City>","<ZipCode>"
	And Selects "<PhoneType>" and enter phonenumber "<PhoneNo>" for Self at contact page
	And Enters contact Details for Spouse without SSN as "<SGender>","<SHeight>","<SWeight>","<SPhoneType>","<SPhoneNum>"
	And Clicks on next button
	And Validates SSN Required Error Message for Self
	And Enters SSN "<SSN>" for Self
	And Clicks on next button

	Then Application Preview Page is displayed to user
	And Verify Benefit Amount for Spouse as "<SBenefit1>" under GTLI
	And Verify Benefit Amount for Child as "<CBenefit1>" under GTLI
	And Clicks on next button

	Then Payment Information Page is displayed to user
	And Selects Payment Method for GTLI
	Then Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for GTLI Product "<Frequency>"
	And Confirms I have read the Information Check Box on Payment Page
	And Clicks on next button

	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	Then Authorize page details are displayed to user and confirm the term and conditions for Spouse
	And Clicks on next button

	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Payment Authorization Letter is displayed to user and clicks on Continue
	And Signs Payment Authorization Letter
	And Clicks on next button to finish

	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"

Examples:
|Website |Title  |Fname     |Lname  |State      |DOB                   |EAgency     |EDate                 |Hear                 |MStatus |Stitle |Sfname |Slname |SDOB                  |MDate                 |Cfname  |Clname |CDOB                   |CGender |Min_Self |Max_Self |Min_Spouse |Max_Spouse |Benefit  |SBenefit |CBenefit |SBenefit1 |CBenefit1 |SSN         |Gender |StreetAddress       |City     |ZipCode |PhoneType |PhoneNo    |SSSN       |SHeight |SWeight |SGender |SPhoneType |SPhoneNum   |Bank       |AccName          |Rnum      |Anum              |Frequency |Password	|VPassword|TypeofCove|
|crbg    |Dr.    |Alexander |Parker |California |SYSDate - 64Y/11M/29D |Jigisha Co. | SYSDate - 00Y/00M/61D|New Hire Orientation |Married |Mrs.   |Ella   |Parker |SYSDate - 70Y/00M/00D | SYSDate - 00Y/00M/61D|Madison |Parker |SYSDate - 25Y/00M/00D  |Female  |$50,000  |$500,000 |$5,000     |$50,000    |$225,000 |$15,000  |$20,000  |$25,000*  |$20,000*  |888-25-8900 |Male   |6130 Monterey Hw Rd |San Jose |95138   |Mobile    |1234777790 |103-22-896 |5.3     |120     |Female  |Home       |0125555789  |Sabka Bank |Alexander Parker |700000999 |35434300000988588 |Monthly   |Adam@123	|Adam@123 |New       |



@CrbgRegression_8
Scenario Outline: <SC08> Application submission Spouse Only Guaranteed Issue Coverage,Beneficiaries - NA

	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
	And Enter details for Employment Date as "<EDate>"
	And Enter Employer Or Agency Name as "<EAgency>"
	And Selects Yes Radio button of full- or part-time civilian employee for Self
	And Selects No Radio Button for Dependent Children
	And Selects Marital Status as "<MStatus>"
	And Selects Hear about us as "<Hear>"
	And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
	And Enters Marraige Date for Spouse as "<MDate1>"
	And Clicks on next button

	Then Product page details are displayed to user
	And Verify that Self and Spouse are available under GTLI
	And Selects product GTLI for Spouse
	And Clicks on next button
	Then Click YES for Dependent Coverage information

	Then Request Coverage page is displayed to user
	And Validates Guaranteed Issue Coverage is Not displayed for Spouse under GTLI
	And Selects Type of Coverage as "<TypeofCove>" for Spouse under G-TLI
	And Clicks on next button

	Then Request Coverage - Health Questions page is displayed to user
	And Verify that Health Questions are rendered for Spouse

	And Navigate back to Eligibility page
	And Enters Marraige Date for Spouse as "<MDate>"
	And Clicks on next button
	And Clicks on next button
	Then Click YES for Dependent Coverage information

	Then Request Coverage page is displayed to user
	And Validates under GTLI the Inforce Benefit Slider Range for Self as "<Min_Self>" to "<Max_Self>"
	And Selects Inforce Benefit Amount for Self as "<Benefit>" under GTLI
	And Selects Type of Coverage as "<TypeofCove1>" for Spouse under G-TLI
	And Validates Guaranteed Issue Coverage is Not displayed for Spouse under GTLI
	And Validates under GTLI the Benefit Slider Range for Spouse as "<Min_Spouse>" to "<Max_Spouse>"
	And Selects Benefit Amount for Spouse as "<SBenefit1>" under GTLI
	And Clicks on next button

	Then Request Coverage - Health Questions page is displayed to user
	And Verify that Health Questions are rendered for Spouse
	And Clicks on Back or Previous button

	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Spouse as "<SBenefit>" under GTLI
	And Clicks on next button
	
	And Validates that Request Coverage - Health Questions page is Not displayed to user

	Then Contact Details page is displayed to user
	And Validates Height and Weight is not displayed for Self
	And Enters contact Details for self Without MemberID,Height,Weight,Mstatus as "<SSN>","<Gender>","<StreetAddress>","<City>","<ZipCode>"
	And Selects "<PhoneType>" and enter phonenumber "<PhoneNo>" for Self at contact page
	And Validates Height and Weight is not displayed for Spouse
	And Enter optional SSN "<SSSN>" for Spouse
	And Enters Details for Spouse like Gender,Phone type and Phone number "<SGender>","<SPhoneType>","<SPhoneNum>"
	And Clicks on next button

	Then Application Preview Page is displayed to user
	And Clicks on next button

	Then Payment Information Page is displayed to user
	And Selects Payment Method for GTLI
	Then Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for GTLI Product "<Frequency>"
	And Confirms I have read the Information Check Box on Payment Page
	And Clicks on next button

	Then Authorize page details are displayed to user
	And Validates Fraud Notice in Read and Sign Box
	And Validates that Authorization message is not displayed in Read and Sign Box
	And Validates Consent message GI in Read and Sign Box
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	Then Authorize page details are displayed to user and confirm the term and conditions for Spouse
	And Clicks on next button

	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Payment Authorization Letter is displayed to user and clicks on Continue
	And Signs Payment Authorization Letter
	And Clicks on next button to finish

	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"

Examples:
|Website |Title  |Fname   |Lname |State  |DOB                   |EAgency     |EDate                |Hear         |MStatus     |Stitle |Sfname   |Slname |SDOB                  |MDate       |MDate1                |Min_Self |Max_Self |Min_Spouse|Max_Spouse |Benefit |SBenefit |SBenefit1 |SSN         |Gender |StreetAddress       |City    |ZipCode |PhoneType |PhoneNo    |SSSN        |SGender |SPhoneType |SPhoneNum   |Bank     |AccName      |Rnum      |Anum              |Frequency|TypeofCove|TypeofCove1       |
|crbg    |Mr.    |Anthony |Diaz  |Kansas |SYSDate - 35Y/11M/29D |Greyson Co. |SYSDate - 00Y/00M/60D|CRBG Website |Civil Union |Mrs.   |Scarlett |Diaz   |SYSDate - 70Y/00M/00D |CurrentDate |SYSDate - 00Y/00M/61D |$50,000  |$500,000 |$5,000    |$50,000    |425,000 |7,500    |27,500    |741-25-1582 |Male   |531 Hahaione St #3C |Wichita |67212   |Mobile    |1034507890 |278-06-4546 |Female  |Home       |0333456789  |KYU Bank |Anthony Diaz |740680990 |35434300870088008 |Monthly	 |New       |Change in Coverage|


@CrbgRegression_9
Scenario Outline:<CRBGSC09>Self, Spouse and Child Application flow for Premium Rates verification
	#Loop 1:
	Given Test set up for "NYL" feature and "NYL_CRBG" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
	And Enter details for Employment Date as "<EDate>"
	And Enter Employer Or Agency Name as "<EAgency>"
	And Selects Marital Status as "<MStatus>"
	And Selects Hear about us as "<Hear>"
	Then Select YES Radio button of Membership
	And Selects Yes Radio Button for Dependent Children
	And Enter details for Spouse as "<STitle>","<Sfname>","<Slname>","<SDOB>"
	And Enters Marraige Date for Spouse as "<MDate>"
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
	And Selects Married question as No for Child
	And Click on Add Child button on Screen
	And Clicks on next button

	Then Product page details are displayed to user
	And Verify Available Product List GTLI
	And Selects product GTLI for Self
	And Selects product GTLI for Spouse
	And Clicks on next button

	Then Request Coverage page is displayed to user
	And Selects Type of Coverage as "<TypeofCove>" for Self under GTLI
	And Selects Benefit Amount for Self as "<Benefit>" under GTLI
	And Selects Type of Coverage as "<TypeofCove>" for Spouse under G-TLI
	And Selects Benefit Amount for Spouse as "<SBenefit>" under GTLI
	And Clicks on next button

	Then Beneficiary Page is displayed to user
	And Clicks on next button
	And Enters contact Details for self Without MemberID,Height,Weight,Mstatus as "<SSN>","<Gender_Self>","<StreetAddress>","<City>","<ZipCode>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Enter optional SSN "<SSSN>" for Spouse
	And Enters Details for Spouse like Gender,Phone type and Phone number "<Gender_Spouse>","<SPhoneType>","<SPhoneNum>"
	And Clicks on next button

	Then Application Preview Page is displayed to user
	And Clicks on next button

	Then Payment Information Page is displayed to user
	And Selects Payment Method for GTLI
	Then Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for GTLI Product "<Frequency>"
	And Validates Estimated Cost for Self as "<Mpremium>" for Benefit Amount "<Benefit>" under GTLI
	And Validates Estimated Cost for Spouse as "<Spremium>" for Benefit Amount "<SBenefit>" under GTLI
	And Validates Estimated Cost for Child as "<Cpremium>" for Benefit Amount "<CBenefit>" under GTLI
	And Validates Total Cost as "<Total>" under GTLI
	And Confirms I have read the Information Check Box on Payment Page
	And Clicks on next button


	#Loop 2:
	
	And Navigate back to Coverage page
	And Selects Benefit Amount for Self as "<Benefit1>" under GTLI
	And Selects Benefit Amount for Spouse as "<SBenefit1>" under GTLI
	And Clicks on next button

	Then Beneficiary Page is displayed to user
	And Clicks on next button

	Then Contact Details page is displayed to user
	And Clicks on next button


	Then Application Preview Page is displayed to user
	And Clicks on next button

	Then Payment Information Page is displayed to user
	And Validates Estimated Cost for Self as "<Mpremium1>" for Benefit Amount "<Benefit1>" under GTLI
	And Validates Estimated Cost for Spouse as "<Spremium1>" for Benefit Amount "<SBenefit1>" under GTLI
	And Validates Estimated Cost for Child as "<Cpremium1>" for Benefit Amount "<CBenefit>" under GTLI
	And Validates Total Cost as "<Total1>" under GTLI

	#Loop 3:
	
	And Navigate back to Coverage page
	And Selects Benefit Amount for Self as "<Benefit2>" under GTLI
	And Selects Benefit Amount for Spouse as "<SBenefit2>" under GTLI
	And Clicks on next button

	Then Request Coverage - Health Questions page is displayed to user
	And Selects No for all Health Questions of Request Coverage under Self
	And Selects No for all Health Questions of Request Coverage under Spouse
	And Clicks on next button

	Then Beneficiary Page is displayed to user
	And Clicks on next button

	Then Contact Details page is displayed to user
	And Enters Height and Weight for Self as "<Height>","<Weight>"
	And Enters Height and Weight for Spouse as "<SHeight>","<SWeight>"
	And Clicks on next button


	Then Application Preview Page is displayed to user
	And Clicks on next button

	Then Payment Information Page is displayed to user
	And Validates Estimated Cost for Self as "<Mpremium2>" for Benefit Amount "<Benefit2>" under GTLI
	And Validates Estimated Cost for Spouse as "<Spremium2>" for Benefit Amount "<SBenefit2>" under GTLI
	And Validates Estimated Cost for Child as "<Cpremium2>" for Benefit Amount "<CBenefit>" under GTLI
	And Validates Total Cost as "<Total2>" under GTLI


	#Loop 4:
	And Navigate back to Eligibility page
	And Enters DOB for Self as "<DOB1>"							
	And Enters DOB for Spouse as "<SDOB1>"										
	And Clicks on next button


	Then Product page details are displayed to user
	And Verify Available Product List GTLI
	And Clicks on next button

	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit3>" under GTLI
	And Selects Benefit Amount for Spouse as "<SBenefit3>" under GTLI
	And Clicks on next button

	Then Request Coverage - Health Questions page is displayed to user
	And Clicks on next button

	Then Beneficiary Page is displayed to user
	And Clicks on next button

	Then Contact Details page is displayed to user
	And Clicks on next button

	Then Application Preview Page is displayed to user
	And Clicks on next button

	Then Payment Information Page is displayed to user
	And Validates Estimated Cost for Self as "<Mpremium3>" for Benefit Amount "<Benefit3>" under GTLI
	And Validates Estimated Cost for Spouse as "<Spremium3>" for Benefit Amount "<SBenefit3>" under GTLI
	And Validates Estimated Cost for Child as "<Cpremium3>" for Benefit Amount "<CBenefit>" under GTLI
	And Validates Total Cost as "<Total3>" under GTLI
	#Loop 5:
	
	And Navigate back to Coverage page
	And Selects Benefit Amount for Self as "<Benefit4>" under GTLI
	And Selects Benefit Amount for Spouse as "<SBenefit4>" under GTLI
	And Clicks on next button

	Then Beneficiary Page is displayed to user
	And Clicks on next button

	Then Contact Details page is displayed to user
	And Clicks on next button


	Then Application Preview Page is displayed to user
	And Clicks on next button

	Then Payment Information Page is displayed to user
	And Validates Estimated Cost for Self as "<Mpremium4>" for Benefit Amount "<Benefit4>" under GTLI
	And Validates Estimated Cost for Spouse as "<Spremium4>" for Benefit Amount "<SBenefit4>" under GTLI
	And Validates Estimated Cost for Child as "<Cpremium4>" for Benefit Amount "<CBenefit>" under GTLI
	And Validates Total Cost as "<Total4>" under GTLI

	#Loop 6:
	
	And Navigate back to Coverage page
	And Selects Benefit Amount for Self as "<Benefit5>" under GTLI
	And Selects Benefit Amount for Spouse as "<SBenefit5>" under GTLI
	And Clicks on next button

	Then Beneficiary Page is displayed to user
	And Clicks on next button

	Then Contact Details page is displayed to user
	And Clicks on next button


	And Clicks on next button

	Then Payment Information Page is displayed to user
	And Validates Estimated Cost for Self as "<Mpremium5>" for Benefit Amount "<Benefit5>" under GTLI
	And Validates Estimated Cost for Spouse as "<Spremium5>" for Benefit Amount "<SBenefit5>" under GTLI
	And Validates Estimated Cost for Child as "<Cpremium5>" for Benefit Amount "<CBenefit>" under GTLI
	And Validates Total Cost as "<Total5>" under GTLI


Examples:
|Website|Title|Fname|Lname|State |DOB                 |EDate              |EAgency  |MStatus  |Hear      |STitle|Sfname|Slname|SDOB                |MDate               |Cfname|Clname|CDOB               |Csex   |Benefit  |SBenefit  |CBenefit |SSN      |Gender_Self|StreetAddress  |City   |ZipCode|PrimaryPhType|PrimaryPhNo|SSSN     |Gender_Spouse|SPhoneType|SPhoneNum |Bank     |AccName    |Rnum     |Anum     |Frequency|Mpremium|Spremium|Cpremium|Total|Benefit1 |SBenefit1|Mpremium1  |Spremium1|Cpremium1 |Total1|Benefit2|SBenefit2|Height|Weight|SHeight|SWeight|Mpremium2|Spremium2|Cpremium2|Total2 |DOB1                |SDOB1              |Benefit3|SBenefit3|Mpremium3 |Spremium3 |Cpremium3|Total3   |Benefit4|SBenefit4|Mpremium4|Spremium4|Cpremium4  |Total4 |Benefit5|SBenefit5|Mpremium5|Spremium5|Cpremium5   |Total5 |TypeofCove|
|CRBG   | Mr. |Roger|Hock |Kansas|SYSDATE-17Y/00M/00D |SYSDATE-00Y/01M/00D| MDH Copr| Married |Newsletter|Mrs.  |Lisa  |Hock  |SYSDATE-17Y/00M/00D |SYSDATE-00Y/01M/00D |Linda |Hock  |SYSDATE-02Y/01M/00D|Female |$50,000  |$10,000   |$20,000  |345876987|Male       |2699 Centre Ave| kansas|11710  |Home         |2345987654 |876987654|Female       |Home      |2345909654|ABC Bank |Roger Hock |235356356|645675767|Monthly  |2.00    |0.40    |0.00    |2.40 |250000   |50000    |10.00      |2.00     |0.00      |12.00  |500000  |100000   |4.6   |188   |4.6    |188   |20.00    |4.00     |0.00     |24.00  |SYSDATE-74Y/11M/29D |SYSDATE-74Y/11M/29D|250000  |50000    |232.50    |46.50     |0.00     |279.00   |125000  |25000    |116.25   |23.25    |0.00       |139.50 |25,000  |5,000    |23.25    |4.65     |0.00        |27.90  |New       |



