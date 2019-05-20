Feature: Acog Test

@IbmRegression_1
Scenario Outline: <IBMSC01> Application submission for Self, Spouse and Child and with all the products and rider(s) Beneficiaries- Maximum
	Given Test set up for "NYL" feature and "NYL_IBM" scenario
	Given Customer navigate to NYL "<Website>"
	And Selects Association as "<Association>" at HomePage
	When Clicks on Apply now button
	Then Click on Self
	Then Click on Spouse
	Then Click on Child
	Then Eligibility page details are displayed to user
	And Validates Eligibility Question as "<Question>"
	Then Select NO for Association Membership
	Then Select YES Radio button of Membership
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
	And Select radio button NO for Spouse is Member
	And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<CGender>"
  	And Selects Married question as No for Child
  	And Click on Add Child button on Screen							
	And Clicks on next button
	And Verify that error message is displayed for state eligibility at top of the page
	And Enter New State as "<State1>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Clicks on Back or Previous button
	And Enters DOB for Self as "<DOB1>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Validates that Self is not displayed for TGTLI,TenPGTL Products
	And Clicks on Back or Previous button
	And Enters DOB for Self as "<DOB2>"
	And Enters DOB for Spouse as "<SDOB1>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Validates that Self is not displayed for TGTLI,TenPGTL Products
	And Validates that Spouse is not displayed for TGTLI,TenPGTL Products
	And Clicks on Back or Previous button
	And Enters DOB for Self as "<DOB>"
	And Enters DOB for Spouse as "<SDOB2>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Validates that Spouse is not displayed for TGTLI,TenPGTL Products
	And Clicks on Back or Previous button
	And Enters DOB for Spouse as "<SDOB>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Selects product TGTLI for Self
	And Selects product TGTLI for Spouse
	And Selects product TGTLI for Child
	And Selects product TenPGTL for Self
	And Selects product TenPGTL for Spouse
	And Verify Child Icon is disabled for TenPGTL
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
	And Clicks on next button
	Then Validate error message for required question
	And Confirms Imp Replacement Info for NewYork state	
	And Clicks on next button
	And Clicks on Back or Previous button
	Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Self
	And Enter additional details as "<TotalAmt>","<IAmount>","<Company>"
	And Verify New York State paragraph is displayed for Self
	Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Spouse
	And Enter additional details as "<STotalAmt>","<SIAmount>","<SCompany>" for Spouse
	And Verify New York State paragraph is displayed for Spouse
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under TGTLI
	And Selects Type of Coverage as "<Typeofcov>" for Self under TGTLI
	And Validates Change in Coverage Option for Spouse is not displayed under TGTLI
	And Selects Type of Coverage as "<Typeofcov1>" for Self under TGTLI
	And Validates under TGTLI the Benefit Slider Range for Self as "<Min_Term>" to "<Max_Term>"
	And Selects Automatic Benefit Increase Option Rider for Self under TGTLI
	And Selects Benefit Amount for Spouse as "<Sbenefit>" under TGTLI
	And Selects Type of Coverage as "<Typeofcov>" for Spouse under TGTLI
	And Validates under TGTLI the Benefit Slider Range for Spouse as "<SMin_Term>" to "<SMax_Term>"
	And Selects Automatic Benefit Increase Option Rider for Spouse under TGTLI
	And Selects Benefit Amount for Child as "<Cbenefit>" under TGTLI
	And Selects Benefit Amount for Self as "<Benefit2>" under TenYTL
	And Selects Type of Coverage as "<Typeofcov>" for Self under TenYTL
	And Validates under TenYTL the Benefit Slider Range as "<Min_Ten>" to "<Max_Ten>" for self
	And Selects Benefit Amount for Spouse as "<Sbenefit1>" under TenYTL
	And Selects Type of Coverage as "<Typeofcov>" for Spouse under TenYTL
	And Validates under TenYTL the Benefit Slider Range as "<SMin_Ten>" to "<SMax_Ten>" for Spouse
	And Clicks on next button
	And Validate Exceed Member Benefit Amount Coverage Error Messege for Spouse under TGTLI 
	And Selects Benefit Amount for Spouse as "<Sbenefit2>" under TGTLI
	And Clicks on next button
	And Validate Max Aggregate error message
	And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
	And User Enters Beneficiary details as "<Trust>","<DateTrust>"
	And Clicks on OK button
	And Verify that the Percent Displayed for Trust is "<TrustPercent>"
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
	And User Enters Beneficiary details as "<Trust1>","<DateTrust>"
	And Clicks on OK button
	And Delete Contingent Beneficiary 
	And Delete box is displayed and clicks on Yes
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship as other "<Bname1>","<Blname1>","<Relationship1>","<Perc1>","<Desc>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname2>","<Blname2>","<Relationship2>","<Perc2>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname3>","<Blname3>","<Relationship3>","<Perc3>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse under TenYTL
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname4>","<Blname4>","<Relationship4>","<Perc4>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse under TenYTL
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And Selects the First Option from Existing Beneficiaries List and select Type as "<BeneType>"	
	And Enters Percentage for First Option as "<Perc5>"	
	And Selects the Second Option from Existing Beneficiaries List and select Type as "<BeneType>"
	And Enters Percentage Second Option as "<Perc6>"
	And Selects the Third Option from Existing Beneficiaries List and select Type as "<BeneType>"
	And Enters Percentage Third Option as "<Perc7>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse under TenYTL
	Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
	And Selects the First Option from Existing Beneficiaries List and select Type as "<BeneType1>" for Trust	
	And Clicks on OK button
	And Verify that the Percent Displayed for Trust is "<TrustPercent>"
	And Clicks on next button
	Then Contact Details page is displayed to user
	Then Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<StreetAddress>","<City>","<ZipCode>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Validate the Travel Question for Non QD application for Self
	And Selects Yes for Travel Question Non QD for Self 
	And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>"
	And Selects Residential Radio Button
	And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>"
	And Validate the Travel Question for Non QD application for Spouse
	And Selects Yes for Travel Question Non QD for Spouse
	And Enter datails for Outside US country and How Long months for Spouse as "<Country>","<Months>"
	And Clicks on next button
	Then Application Summary Page is displayed to user
	And Validates Benefit Amount for Self as "<Benefit>" under TGTLI
	And Validates Automatic Benefit Increase Option Rider as "<AutoBenefit>" for Self under TGTLI
	And Validates Benefit Amount for Self as "<Benefit1>" under TenPGTL
	And Validates Benefit Amount for Spouse as "<Sbenefit2>" under TGTLI
	And Validates Automatic Benefit Increase Option Rider as "<SAutoBenefit>" for Spouse under TGTLI
	And Validates Benefit Amount for Spouse as "<Sbenefit1>" under TenPGTL
	And Validates Benefit Amount for Child as "<Cbenefit>" under TGTLI
	And Clicks on next button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	Then Authorize page details are displayed to user and confirm the term and conditions for Spouse
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"
	And Verify PDF information as "<pdfScenario>","<pdfEnable>"
	

Examples:
|Website  |Association                  |Question                                              |Title  |Fname   |Lname  |State    |DOB                  |Stitle |Sfname  |Slname   |SDOB                 |Cfname    |Clname |CDOB                  |CGender|State1     |DOB1                  |DOB2                  |SDOB1                 |SDOB2                 |TotalAmt  |IAmount  |Company |STotalAmt |SIAmount |SCompany|Benefit  |Sbenefit  |Cbenefit |Benefit2   |Sbenefit1 |Benefit1  |Sbenefit2 |Trust    |DateTrust             |TrustPercent|Trust1 |Bname |Blname |Relationship |Perc |Bname1   |Blname1 |Relationship1  |Perc1 |Desc    |Bname2    |Blname2 |Relationship2 |Perc2 |Bname3 |Blname3 |Relationship3 |Perc3 |Bname4 |Blname4 |Relationship4 |Perc4 |Perc5 |Perc6 |Perc7  |Country  |Months  |SSN        |Mstatus |Height |Weight |Gender_Self |StreetAddress            |City     |ZipCode|PrimaryPhType|PrimaryPhNo |SSSN      |SHeight|SWeight |Gender_Spouse |SPhoneType |SPhoneNum   |Min_Term |Max_Term |SMin_Term |SMax_Term |Min_Ten |Max_Ten |SMin_Ten |SMax_Ten|Typeofcov|Typeofcov1        |BeneType|BeneType1 |AutoBenefit|SAutoBenefit|pdfEnable|
|lifering |Visions Federal Credit Union |Are you a member of the Visions Federal Credit Union? |Mr.    |Mark    |Simson |Ontario  |SYSDATE - 64Y/11M/30D|Mrs.   |Bella   |Gill     |SYSDATE - 64Y/11M/30D|John      |Gill   |SYSDATE - 00Y/00M/14D |Male   |New York   |SYSDATE - 16Y/11M/30D |SYSDATE - 65Y/00M/00D |SYSDATE - 16Y/11M/30D |SYSDATE - 65Y/00M/00D |250000    |250000   |Wayne Co|35000     |15000    |Wayne Co|$125,000 |$200,000  |4000     |$1,000,000 |$225,000  |$500,000  |$75,000   |kennedy  |SYSDATE - 99Y/10M/12D |100 %       |arthur |John  |Adams  |Father       |50   |Samantha |Jonas   |Other          |25    |Friend  |Rihanna   |Jones   |Mother        |15    |Jake   |Charles |Son           |10    |Carter |Jonas   |Father        |25    |25    |25    |25     |Malaysia |24      |741320598  |Married |6.0    |220    |Male        |70260 111st Hwy #SPC 101 |Flushing |11367  |Mobile       |7441021589  |789236540 |6.0    |220     |Female        |Mobile     |7410326039  |25000    |500000   |25000     |500000    |100000  |1000000 |100000   |1000000 |New      |Change in Coverage|Primary |Contingent|Yes        |Yes         |0        |

@IbmRegression_2
Scenario Outline: <IBMSC02> Application submission for Self only with All Products

	Given Test set up for "NYL" feature and "NYL_IBM" scenario
	Given Customer navigate to NYL "<Website>"
	And Selects Association as "<Association>" at HomePage
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	Then Click on Self
	And Validates Eligibility Question as "<Question>"
	Then Select YES Radio button of Membership
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
	And Clicks on next button
	And Verify that error message is displayed for state eligibility at top of the page
	And Enter New State as "<State1>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Clicks on next button
	And Validate Error Message on Product Page
	And Selects product TGTLI for Self
	And Selects product TenPGTL for Self
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under TGTLI
	And Selects Type of Coverage as "<TypeofCove>" for Self under TGTLI
	And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
	And Selects Type of Coverage as "<TypeofCove1>" for Self under TenYTL
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship as other "<Bname1>","<Blname1>","<Relationship1>","<Perc1>","<Desc>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
	And User Enters Beneficiary details as "<Trust>","<DateTrust>"
	And Clicks on OK button
	And Verify that the Percent Displayed for Trust is "<TrustPercent>"
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
	And User Enters Beneficiary details as "<Trust1>","<DateTrust>"
	And Clicks on OK button
	And Validates error message on Beneficiary page that Only one Trust is allowed as Contingent
	And Clicks on Close button
	And Clicks on next button
	Then Contact Details page is displayed to user
	Then Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<StreetAddress>","<City>","<ZipCode>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects Residential Radio Button
	And Selects No for Travel Question Non QD for Self
	And Clicks on next button
	Then Application Summary Page is displayed to user
	And Clicks on next button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"
	And Verify PDF information as "<pdfScenario>","<pdfEnable>"
	

Examples:
|Website    |Association                       |Question                                                  |Title  |Fname   |Lname  |State                      |DOB                    |State1         |Benefit |Benefit1  |Trust    |DateTrust             |TrustPercent |Bname |Blname |Relationship |Perc |Bname1   |Blname1 |Relationship1  |Perc1   |Desc  |SSN        |Mstatus   |Height |Weight |Gender_Self|StreetAddress   |City        |ZipCode   |PrimaryPhType|PrimaryPhNo |TypeofCove |TypeofCove1       |Trust1|pdfEnable|
|lifering   |US Alliance Federal Credit Union  |Are you a member of the US Alliance Federal Credit Union? |Mr.    |Ross    |Geller |Newfoundland and Labrador  |SYSDATE - 17Y/00M/00D  |Rhode Island   |500000  |500000    |kennedy  |SYSDATE - 12Y/11M/02D |100 %        |John  |Adams  |Son          |99   |Samantha |Jonas   |Other          |1       |Friend|749875201  |Married   |5.5    |180    |Male       |140 Killingly St|Providence  |02909     |Home         |98589698410 |New        |Change in Coverage|John  |0        |

@IbmRegression_3
Scenario Outline:<IBMSC03> Application Submission for Child Only with TenPGTL

	Given Test set up for "NYL" feature and "NYL_IBM" scenario
	Given Customer navigate to NYL "<Website>"
	And Selects Association as "<Association>" at HomePage
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	Then Click on Child
	And Validates Eligibility Question as "<Question>"
	Then Select YES Radio button of Membership
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<C1fname>","<C1lname>","<C1DOB>","<C1Sex>"
  	And Selects Married question as No for Child
  	And Click on Add Child button on Screen	
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<C2fname>","<C2lname>","<C2DOB>","<C2Sex>"
	And Selects Married question as No for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<C3fname>","<C3lname>","<C3DOB>","<C3Sex>"
	And Selects Married question as Yes for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<C4fname>","<C4lname>","<C4DOB>","<C4Sex>"
	And Selects Married question as No for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<C5fname>","<C5lname>","<C5DOB>","<C5Sex>"
	And Selects Married question as No for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<C6fname>","<C6lname>","<C6DOB>","<C6Sex>"
	And Selects Married question as No for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<C7fname>","<C7lname>","<C7DOB>","<C7Sex>"
	And Selects Married question as No for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<C8fname>","<C8lname>","<C8DOB>","<C8Sex>"
	And Selects Married question as No for Child
	And Click on Add Child button on Screen
	And Clicks on next button
	And Validates Add Child Button on Eligibility page is not present
	Then Product page details are displayed to user
	And Selects product TenPGTL for Child
	And Verify Child icon is disabled for TGTLI
	And Clicks on next button
	And Click YES for Dependent Coverage information
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Child as "<Cbenefit>" under TenYTL
	And Validates"<C1fname>","<C2fname>","<C3fname>" are not displayed in eligible children
	And Clicks on next button
	Then Contact Details page is displayed to user
	And Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<Gender_Self>","<StreetAddress>","<City>","<ZipCode>"
	And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
	And Validates Height and Weight is not displayed for Self
	And Selects Residential Radio Button
	And Clicks on next button
	Then Application Summary Page is displayed to user
	And Verify Child name as "<C4fname>","<C4lname>"
	And Verify Benefit Amount for child "<Cfname4>","<TenYTL_SequenceNo>" as "<Cbenefit>" under TenPGTL
	And Verify Child name as "<C5fname>","<C5lname>"
	And Verify Benefit Amount for child "<Cfname5>","<TenYTL_SequenceNo1>" as "<Cbenefit>" under TenPGTL
	And Verify Child name as "<C6fname>","<C6lname>"
	And Verify Benefit Amount for child "<Cfname6>","<TenYTL_SequenceNo2>" as "<Cbenefit>" under TenPGTL
	And Verify Child name as "<C7fname>","<C7lname>"
	And Verify Benefit Amount for child "<Cfname7>","<TenYTL_SequenceNo3>" as "<Cbenefit>" under TenPGTL
	And Verify Child name as "<C8fname>","<C8lname>"
	And Verify Benefit Amount for child "<Cfname8>","<TenYTL_SequenceNo4>" as "<Cbenefit>" under TenPGTL
	And Clicks on next button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	And Validates I Understand Verbiage in Read and Sign Box
	And Validates Consent message in Read and Sign Box for NonUW
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"
	And Verify PDF information as "<pdfScenario>","<pdfEnable>"
	

Examples:
|Website  |Association                  |Question                                               |Title  |Fname  |Lname    |State    |DOB                  |C1fname |C1lname  |C1DOB       |C1Sex  |C2fname  |C2lname |C2DOB                 |C2Sex  |C3fname |C3lname |C3DOB                 |C3Sex     |C4fname |C4lname |C4DOB                 |C4Sex   |C5fname    |C5lname |C5DOB                |C5Sex   |C6fname |C6lname |C6DOB                 |C6Sex  |C7fname |C7lname |C7DOB                 |C7Sex   |C8fname  |C8lname  |C8DOB               |C8Sex    |Cbenefit |SSN       |Mstatus  |Gender_Self  |StreetAddress |City       |ZipCode |PhoneType |PhoneNum   |TenYTL_SequenceNo|TenYTL_SequenceNo1|TenYTL_SequenceNo2|TenYTL_SequenceNo3|TenYTL_SequenceNo4|pdfEnable|
|lifering |Coastal Federal Credit Union |Are you a member of the Coastal Federal Credit Union?  |Mr.    |Leonard|Hofstater|Alaska   |SYSDATE - 42Y/03M/15D| John   |Brown    |CurrentDate |Male   |Samantha |Brown   |SYSDATE - 25Y/00M/00D |Female |Martha  |Brown   |SYSDATE - 24Y/11M/30D |Female    |Peter   |Gill    |SYSDATE - 24Y/11M/30D |Male    |Josephine  |Gill    |SYSDATE - 00Y/00M/14D|Female  |Lola    |Gill    |SYSDATE - 00Y/06M/00D |Female |Carter  |Simons  |SYSDATE - 24Y/00M/00D |Male    |John     |Simons   |SYSDATE -14Y/05M/15D|Male     |4000     |741155885 |Divorced |Male         |Po Box 616    |Willow     |99688   |Business  |9857410054 |1                |2                 |3                 |4                 |5                 |0        |


@IbmRegression_4
Scenario Outline:<IBMSC04> Application Submission for Spouse Only with All Products

	Given Test set up for "NYL" feature and "NYL_IBM" scenario
	Given Customer navigate to NYL "<Website>"
	And Selects Association as "<Association>" at HomePage
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	Then Click on Spouse
	And Validates Eligibility Question as "<Question>"
	Then Select YES Radio button of Membership
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
	And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
	And Clicks on next button
	And Verify that error message is displayed as help us to display at top of the page
	And Select radio button Yes for Spouse is Member
	And Clicks on next button
	And Verify Error Message for spouse to apply separately
	And Select radio button NO for Spouse is Member
	And Enters DOB for Spouse as "<SDOB1>"
	And Clicks on next button
	And Validate Age Restriction Message
	And Enters DOB for Spouse as "<SDOB2>"
	And Clicks on next button
	And Validate Age Restriction Message
	And Enters DOB for Spouse as "<SDOB>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Selects product TGTLI for Spouse
	And Selects product TenPGTL for Spouse
	And Clicks on next button
	And Click YES for Dependent Coverage information
	Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Spouse
	And Enter additional details as "<STotalAmt>","<SIAmount>","<SCompany>" for Spouse
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Spouse as "<Sbenefit>" under TGTLI
	And Selects Type of Coverage as "<TypeofCove>" for Spouse under TGTLI
	And Selects Benefit Amount for Spouse as "<Sbenefit1>" under TenYTL
	And Selects Type of Coverage as "<TypeofCove1>" for Spouse under TenYTL
	And Clicks on button to Save for later
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>" 
	And Clicks OK Button Save For Later
	Then  Refresh the browser
	Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Add Beneficiary Button for Spouse under TGTLI 
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
	And Clicks on OK button
	And Clicks on next button
	Then Contact Details page is displayed to user
	And Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<Sex>","<Street>","<City>","<Zipcode>"
	And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
	And Selects Residential Radio Button
	And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<SSex>","<SPhoneType>","<SPhoneNum>"
	And Selects No for Travel Question Non QD for Spouse
	And Clicks on next button
	Then Application Summary Page is displayed to user
	And Clicks on next button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	Then Authorize page details are displayed to user and confirm the term and conditions for Spouse
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"
	And Verify PDF information as "<pdfScenario>","<pdfEnable>"
	
Examples:
|Website  |Association                          |Question                                                       |Title  |Fname   |Lname   |State        |DOB                     |Stitle |Sfname  |Slname   |SDOB                  |Error                             |SDOB1                  |SDOB2                 |Sbenefit |Sbenefit1 |Password |VPassword |Bname |Blname |Relationship |Perc  |SSN        |Mstatus  |Sex    |Street      |City       |Zipcode   |PhoneType |PhoneNum    |SSSN      |SHeight  |SWeight |SSex     |SPhoneType |SPhoneNum   |STotalAmt |SIAmount |SCompany          |TypeofCove |TypeofCove1       |pdfEnable|
|lifering |Your Community Federal Credit Union  |Are you a member of the Your Community Federal Credit Union?   |Mr.    |Peter   |Parker  |Pennsylvania |SYSDATE - 32Y/00M/00D   |Mrs.   |Bella   |Gill     |SYSDATE - 64Y/11M/30D |Your spouse must apply separately.|SYSDATE - 16Y/11M/30D  |SYSDATE - 65Y/00M/00D |$500,000 |$500,000  |Adam@123 |Adam@123  |John  |Adams  |Spouse       |100   |997465201  |Married  |Male   |81 Manor Dr |Dillsburg  |17019     |Mobile    |9870125410  |990125473 |5.7      |220     |Female   |Mobile     |9874548787  |25000     |25000    |Wayne Enterprises |New        |Change in Coverage|0        |


@IbmRegression_5
Scenario Outline: <IBMSC05> Validation Read & Sign Page with 20 different States one by one in loop
	Given Test set up for "NYL" feature and "NYL_IBM" scenario
	Given Customer navigate to NYL "<Website>"
	And Selects Association as "<Association>" at HomePage
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user 
	Then Click on Self
	And Validates Eligibility Question as "<Question>"
	Then Select YES Radio button of Membership
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Selects product TGTLI for Self
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under TGTLI
	And Selects Type of Coverage as "<TypeofCove>" for Self under TGTLI
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Add Beneficiary Button for Self under TGTLI
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relationship>","<Perc>"
	And Clicks on OK button
	And Clicks on Skip Beneficiary Button					
	And Delete box is displayed and clicks on Yes
	And Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>" 
	And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
	And Selects No for Travel Question Non QD for Self
	And Selects Residential Radio Button
	And Clicks on next button
	Then Application Summary Page is displayed to user 
	And Clicks on next button
	Then Authorize page details are displayed to user
	And Validates I Understand Verbiage in Read and Sign Box					
	And Validate Authorization message in Read and Sign Box					
	And Validate Fraud Notice CO in Read and Sign Box					
	And Validate Consent message in Read and Sign Box	
	And Navigate back to Eligibility page
	And Enter New State as "<State1>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice CA in Read and Sign Box
	
	And Navigate back to Eligibility page
	And Enter New State as "<State2>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice AL in Read and Sign Box
	
	And Navigate back to Eligibility page
	And Enter New State as "<State3>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice AR in Read and Sign Box
	
	And Navigate back to Eligibility page
	And Enter New State as "<State4>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice LA in Read and Sign Box
	
	And Navigate back to Eligibility page
	And Enter New State as "<State5>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice PA in Read and Sign Box
	
	And Navigate back to Eligibility page
	And Enter New State as "<State6>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice RI in Read and Sign Box
	
	And Navigate back to Eligibility page
	And Enter New State as "<State7>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice MD in Read and Sign Box
	
	And Navigate back to Eligibility page
	And Enter New State as "<State8>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice DC in Read and Sign Box
	
	And Navigate back to Eligibility page
	And Enter New State as "<State9>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice FL in Read and Sign Box
	
	And Navigate back to Eligibility page
	And Enter New State as "<State10>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice KS in Read and Sign Box
	
	And Navigate back to Eligibility page
	And Enter New State as "<State11>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice ME in Read and Sign Box
	
	And Navigate back to Eligibility page
	And Enter New State as "<State12>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice NJ in Read and Sign Box
	
	And Navigate back to Eligibility page
	And Enter New State as "<State13>"
	And Clicks on next button
	And Clicks on next button
	And Confirms Imp Replacement Info for NewYork state	
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Verify that fraud notice is not rendered at Authorization page
	
	And Navigate back to Eligibility page
	And Enter New State as "<State14>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice OK in Read and Sign Box
	
	And Navigate back to Eligibility page
	And Enter New State as "<State15>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice PR in Read and Sign Box
	
	And Navigate back to Eligibility page
	And Enter New State as "<State16>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice TN in Read and Sign Box
	
	And Navigate back to Eligibility page
	And Enter New State as "<State17>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice WA in Read and Sign Box
	
	And Navigate back to Eligibility page
	And Enter New State as "<State18>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice VA in Read and Sign Box
	
	And Navigate back to Eligibility page
	And Enter New State as "<State19>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice WM in Read and Sign Box
	And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario>","<pdfEnable>","<pdfName>"
	
	And Navigate back to Eligibility page
	And Enter New State as "<State20>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice NM in Read and Sign Box
	And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario1>","<pdfEnable>","<pdfName1>"
	And Navigate back to Eligibility page
	And Enter New State as "<State21>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validates additional Notes for Connecticut state
	
	And Navigate back to Eligibility page
	And Enter New State as "<State22>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Authorization Message MN in Read and Sign Box
	

Examples:
|Website  |Association                          |Question                                                      |Title |Fname |Lname |State      |DOB        |Benefit  |Bfname |Blname |Relationship |Perc |SSN       |Mstatus |Height |Weight |Sex    |Street             |City   |Zipcode|PhoneType |PhoneNum   |State1     |State2  |State3   |State4    |State5       |State6       |State7   |State8               |State9  |State10 |State11 |State12    |State13  |State14  |State15     |State16   |State17    |State18  |State19 |State20    |State21     |State22    |TypeofCove|pdfScenario |pdfScenario1 |pdfEnable|pdfName                               |pdfName1                   |
|lifering |Premier Members Federal Credit Union |Are you a member of the Premier Members Federal Credit Union? |Mr.   |Adam  |Gill  |Colorado   |08/01/1965 |200000   |JOHN   |CARTER |Spouse       |100  |587496840 |Single  |6.0    |180    |Male   |6550 Yank Way #324 |Arvada |41025  |Mobile    |9873202100 |California |Alabama |Arkansas |Louisiana |Pennsylvania |Rhode Island |Maryland |District of Columbia |Florida |Kansas  |Maine   |New Jersey |New York |Oklahoma |Puerto Rico |Tennessee |Washington |Virginia |Wyoming |New Mexico |Connecticut |Minnesota  |New       |IBMSC5_WM   |IBMSC5_NM    |1        |Important Notice All except NM 2 08.12|Important Notice NM 2 08.12|	

