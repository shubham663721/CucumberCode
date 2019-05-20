Feature: CAA Test

@CAARegression_1
Scenario Outline: <CAASC01> Application submission for Self, Spouse and Child and with all the products and rider(s)  (Columbia Graduate) Beneficiaries- Maximum                 

Given Test set up for "NYL" feature and "NYL_CAA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Click on Self
Then Click on Spouse
Then Click on Child
Then Eligibility page details are displayed to user 
And Select NO for Association Membership
And Validate that NEXT button is Disabled
And Select YES Radio button of Membership
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Selects Eligibility status as "<EStatus>"
And Selects Last school attented/ currently attending and graduation date as "<LastSchool>","<GradDate>"
And Select radio button Yes for Spouse is Member
And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Clicks on next button
And Verify that error message is displayed for state eligibility at top of the page
And Enter New State as "<State1>"
And Clicks on next button
Then Product page details are displayed to user
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB1>"
And Clicks on next button
Then Validates that Self is not displayed at product page for TGTLI, TenPGTL
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB2>"
And Enters DOB for Spouse as "<SDOB1>"
And Clicks on next button
Then Validates that Self & Spouse are not displayed at product page for TGTLI, TenPGTL
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB>"
And Enters DOB for Spouse as "<SDOB2>"
And Clicks on next button
Then Validates that Spouse is not displayed at product page for TGTLI, TenPGTL
And Clicks on Back or Previous button
And Enters DOB for Spouse as "<SDOB>"
And Clicks on next button
Then Product page details are displayed to user
And Selects product TGTLI for Self
And Selects product TGTLI for Spouse
And Selects product TGTLI for Child
And Selects product TenPGTL for Self
And Selects product TenPGTL for Spouse
And Verify Child icon is disabled for TenYTL
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as No for Self and Spouse
And Clicks on next button 
And Validate error message for required question
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
And Selects Type of Coverage as "<TypeofCove>" for Self under TGTLI
And Verify Type of Coverage Change in coverage is unavailable under TermLife for Spouse
And Selects Type of Coverage as "<TypeofCove1>" for Self under TGTLI
And Validates under TGTLI the Benefit Slider Range for Self as "<Min_Term>" to "<Max_Term>"
And Selects Automatic Benefit Increase Option Rider for Self under TGTLI
And Selects Benefit Amount for Spouse as "<Sbenefit>" under TGTLI
And Selects Type of Coverage as "<TypeofCove>" for Spouse under TGTLI
And Validates under TGTLI the Benefit Slider Range for Spouse as "<SMin_Term>" to "<SMax_Term>" 
And Selects Automatic Benefit Increase Option Rider for Spouse under TGTLI
And Selects Benefit Amount for Child as "<Cbenefit>" under TGTLI
And Selects Benefit Amount for Self as "<Benefit2>" under TenYTL
And Selects Type of Coverage as "<TypeofCove>" for Self under TenYTL 
And Validates under TenYTL the Benefit Slider Range as "<Min_Ten>" to "<Max_Ten>" for self
And Selects Benefit Amount for Spouse as "<Sbenefit1>" under TenYTL
And Selects Type of Coverage as "<TypeofCove>" for Spouse under TenYTL 
And Validates under TenYTL the Benefit Slider Range as "<SMin_Ten>" to "<SMax_Ten>" for Spouse
And Clicks on next button
And Verify Error Message in Spouse section for TermLife
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
And Delete Contigent Beneficiary
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
And Selects the First Option from Existing Beneficiaries List and select Type as "<TypeAs>"
And Enters Percentage for First Option as "<Perc5>"
And Selects the Second Option from Existing Beneficiaries List and select Type as "<TypeAs>"
And Enters Percentage Second Option as "<Perc6>"
And Selects the Third Option from Existing Beneficiaries List and select Type as "<TypeAs>"
And Enters Percentage Third Option as "<Perc7>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under TenYTL
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
And Selects the First Option from Existing Beneficiaries List and select Type as "<TypeAs1>" for Trust
And Clicks on OK button
And Verify that the Percent Displayed for Trust is "<TrustPercent>" 
And Clicks on next button
Then Contact Details page is displayed to user
And Validate the Travel Question for Non QD application for Self
And Selects Yes for Travel Question Non QD for Self
And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>"
And Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Selects Residential Radio Button
And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<SSex>","<SPhoneType>","<SPhoneNum>"
And Validate the Travel Question for Non QD application for Spouse
And Selects Yes for Travel Question Non QD for Spouse
And Enter datails for Outside US country and How Long months for Spouse as "<Country>","<Months>"
And Clicks on next button
Then Application Summary Page is displayed to user 
And Validates Benefit Amount for Self as "<Benefit>" under TGTLI
And Verify Automatic Benefit Increase Option Rider as "<AutoBenefit>" for self under GLI
And Validates Benefit Amount for Self as "<Benefit1>" under TenPGTL
And Validates Benefit Amount for Spouse as "<Sbenefit2>" under TGTLI
And Verify Automatic Benefit Increase Option Rider as "<SAutoBenefit>" for spouse under GLI
And Validates Benefit Amount for Spouse as "<Sbenefit1>" under TenPGTL
And Validates Benefit Amount for Child as "<Cbenefit1>" under TGTLI
And Clicks on next button
And Click and scroll Consent message in Read and Sign Box
Then Authorize page details are displayed to user and confirm the term and conditions for Self 
And Authorize page details are displayed to user and confirm the term and conditions for Spouse
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish  
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"
And Verify PDF information as "<pdfScenario>","<pdfEnable>"

Examples:
|website 	|Title  |Fname   |Lname   |State    |DOB        	|EStatus       					|LastSchool  	|GradDate   |Stitle |Sfname  |Slname   |SDOB     	|Cfname  	|Clname |CDOB    	|Csex   |State1    	|DOB1       |DOB2       	|SDOB1      	|SDOB2    	|TotalAmt  |IAmount  |Company |STotalAmt |SIAmount |SCompany  |Benefit  |Sbenefit  	|Cbenefit 	|Benefit2   |Sbenefit1 |Benefit1  	|Sbenefit2 	|Trust    |DateTrust  |TrustPercent |Trust1 |Bname |Blname |Relationship |Perc |Bname1   |Blname1 |Relationship1  |Perc1 |Desc    |Bname2    |Blname2 |Relationship2 |Perc2 |Bname3 |Blname3 |Relationship3 |Perc3 |Bname4 |Blname4 |Relationship4 |Perc4 |Perc5 |Perc6 |Perc7  |Country |Months  |SSN       	|Mstatus |Height 	|Weight |Sex    |Street  |City        |Zipcode   |PhoneType |PhoneNum   |SSSN      |SHeight  	|SWeight |SSex    		|SPhoneType |SPhoneNum   |Min_Term 	|Max_Term 	|SMin_Term 	|SMax_Term 	|Min_Ten 	|Max_Ten |SMin_Ten 	|SMax_Ten 	|TypeofCove	|pdfEnable	|TypeofCove1		|TypeAs	|TypeAs1	|Cbenefit1	|AutoBenefit|SAutoBenefit|
|caa  		|Mr.    |Adam    |Gill    |Nunavut  |02/06/1975  	|CAA Member (Columbia Graduate) |School of Law  |05/10/2014 |Mrs.   |Bella   |Gill     |05/20/1978  |John      	|Gill   |07/03/2008 |Male  	|New York   |02/06/2003 |02/06/1938  	|05/20/2012  	|05/20/1938 |250000    |250000   |Chubb   |35000     |15000    |Chubb     |$125,000 |$200,000 	|4000   	|$1,000,000 |$300,000  |$500,000 	|$75,000  	|kennedy  |05/02/2012 |100 %        |arthur |John  |Adams  |Father       |50   |Samantha |Jonas   |Other          |25    |Friend  |Rihanna   |Jones   |Mother        |15    |Jake   |Charles |Son           |10    |Carter |Jonas   |Father        |25    |25    |25    |25     |Croatia |12      |990067673  	|Married |6.0      	|220    |Male   |main st |providence  |10110     |Business  |5343545436 |990067501 |6.0    		|220     |Female     	|Mobile     |5454856876  |25000   	|500000 	|25000   	|500000 	|100000 	|1000000 |100000 	|1000000	|New		|0			|Change in Coverage	|Primary|Contingent	|$4,000		|Yes		|Yes		|

@CAARegression_2
Scenario Outline: <CAASC02> Application submission for Self only with All Products       (Spouse of CAA Member)   

Given Test set up for "NYL" feature and "NYL_CAA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Click on Self
Then Eligibility page details are displayed to user 
And Select YES Radio button of Membership
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Selects Eligibility status as "<EStatus>"
And Validates Spouse Icon gets disabled
And Validate uninsured member spouse notification is displayed 
And Clicks on next button
And Verify that error message is displayed for state eligibility at top of the page
And Enter New State as "<State1>"
And Clicks on next button
Then Product page details are displayed to user
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
And Clicks on next button
Then Contact Details page is displayed to user
And Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Selects Residential Radio Button
And Selects No for Travel Question Non QD for Self
And Clicks on next button
Then Application Summary Page is displayed to user 
And Clicks on next button
And Click and scroll Consent message in Read and Sign Box
Then Authorize page details are displayed to user and confirm the term and conditions for Self 
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"
And Verify PDF information as "<pdfScenario>","<pdfEnable>"

Examples:
|website |Title  |Fname   |Lname  |State   |DOB         |EStatus     									|State1         |Benefit |Benefit1  |Trust    |DateTrust  |TrustPercent  	|Bname |Blname |Relationship |Perc |Bname1   |Blname1 |Relationship1  |Perc1    |SSN        |Mstatus   	|Height |Weight |Sex    |Street  |City        |Zipcode   |PhoneType |PhoneNum	|pdfEnable	|TypeofCove1		|TypeofCove	|Desc|  
|caa     |Mr.    |Adam    |Gill   |Quebec  |02/06/1975  |Spouse of a CAA Member (member is not insured)	|Rhode Island   |350000  |570000    |kennedy  |05/02/2012 |100 %       		|John  |Adams  |Son          |99   |Samantha |Jonas   |Other          |1        |990067673  |Married 	|5.0 	|180  	|Male   |main st |providence  |10110     |Mobile    |5343545436	|0			|Change in Coverage	|New		|Friend|
       
@CAARegression_3
Scenario Outline:<CAASC03> Application Submission for Child Only with TenPGTL (Former Columbia Student)

Given Test set up for "NYL" feature and "NYL_CAA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Click on Child
Then Eligibility page details are displayed to user 
And Select YES Radio button of Membership 
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Selects Eligibility status as "<EStatus>"
And Selects Last school attented/ currently attending as "<LastSchool>"
And Click on Add Child button 
Then Add Child Screen is displayed and Enters Child details as "<C1fname>","<C1lname>","<C1DOB>","<C1Sex>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button 
Then Add Child Screen is displayed and Enters Child details as "<C2fname>","<C2lname>","<C2DOB>","<C2Sex>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<C3fname>","<C3lname>","<C3DOB>","<C3Sex>"
And Selects Married question as Yes for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button 
Then Add Child Screen is displayed and Enters Child details as "<C4fname>","<C4lname>","<C4DOB>","<C4Sex>"
And Selects Married question as No for Child
And Selects Yes for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button 
Then Add Child Screen is displayed and Enters Child details as "<C5fname>","<C5lname>","<C5DOB>","<C5Sex>"
And Selects Married question as No for Child
And Selects Yes for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button 
Then Add Child Screen is displayed and Enters Child details as "<C6fname>","<C6lname>","<C6DOB>","<C6Sex>"
And Selects Married question as Yes for Child
And Selects Yes for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button 
Then Add Child Screen is displayed and Enters Child details as "<C7fname>","<C7lname>","<C7DOB>","<C7Sex>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<C8fname>","<C8lname>","<C8DOB>","<C8Sex>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Clicks on next button
Then Product page details are displayed to user 
And Selects product TenPGTL for Child
And Verify Child icon is disabled for TGTLI
And Clicks on next button
And Click YES for Dependent Coverage information
Then Request Coverage page is displayed to user 
And Validates "<C1fname>","<C2fname>","<C3fname>","<C5fname>" and "<C6fname>" are not displayed in eligible children under TenPGTL
And Selects Benefit Amount for Child as "<Cbenefit>" under TenYTL
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Skip Beneficiary Button
Then Contact Details page is displayed to user
And Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<Sex>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Validates Height and Weight is not displayed for Self
And Selects Residential Radio Button
And Clicks on next button
Then Application Summary Page is displayed to user 
And Verify Child Firstname and Lastname as "<C4fname>","<C4lname>"
And Verify Benefit Amount for child "<C4fname>","<C4Sequence>" as "<Cbenefit>" under TenPGTL
And Verify Child Firstname and Lastname as "<C7fname>","<C7lname>"
And Verify Benefit Amount for child "<C7fname>","<C7Sequence>" as "<Cbenefit>" under TenPGTL
And Verify Child Firstname and Lastname as "<C8fname>","<C8lname>"
And Verify Benefit Amount for child "<C8fname>","<C8Sequence>" as "<Cbenefit>" under TenPGTL
And Clicks on next button
And Click and scroll Consent message in Read and Sign Box
Then Authorize page details are displayed to user and confirm the term and conditions for Self 
And Validates I Understand verbiage one in Read and Sign Box
And Validates Consent message in Read and Sign Box for NonUW
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"
And Verify PDF information as "<pdfScenario>","<pdfEnable>"

Examples:
|website  |Title  |Fname  |Lname |State    |DOB         |EStatus             								|LastSchool    		|C1fname |C1lname  |C1DOB   	|C1Sex  |C2fname  |C2lname  |C2DOB      |C2Sex  |C3fname |C3lname |C3DOB      |C3Sex     |C4fname |C4lname |C4DOB      |C4Sex   |C5fname    |C5lname |C5DOB       |C5Sex   |C6fname |C6lname |C6DOB        |C6Sex  |C7fname |C7lname |C7DOB      |C7Sex   |C8fname  |C8lname  |C8DOB        |C8Sex    |Cbenefit |SSN       |Mstatus  |Sex   |Street   |City       |Zipcode |PhoneType |PhoneNum 	|pdfEnable	|C4Sequence	|C7Sequence	|C8Sequence|           
|caa      |Mr.    |Adam   |Gill  |Alaska   |09/04/1979  |CAA Member (former Columbia student non graduate) 	|Barnard College   	|John    |Gill     |CurrentDate |Male   |Samantha |Gill     |01/04/1992 |Female |Martha  |Gill    |12/09/2002 |Female    |Peter   |Gill    |09/10/1996 |Male    |Josephine  |Gill    |09/04/1994  |Female  |Lola    |Gill    |07/04/2001   |Female |Carter  |Simons  |07/04/2009 |Male    |John     |Simons   |09/01/2012   |Male     |4000     |741155885 |Divorced |Male  |main st  |providence |70010   |Business  |5343545436	|0			|1			|2			|3			|              

@CAARegression_4   
Scenario Outline:<CAASC04> Application Submission for Self only with All products (Columbia Student) Beneficiary - Primary Trust, Contingent Individual

Given Test set up for "NYL" feature and "NYL_CAA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Click on Self
Then Eligibility page details are displayed to user 
And Select YES Radio button of Membership 
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Selects Eligibility status as "<EStatus>"
And Selects Last school attented/ currently attending and graduation date as "<LastSchool>","<GradDate>"
And Clicks on next button
Then Product page details are displayed to user
And Selects product TGTLI for Self
And Selects product TenPGTL for Self
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
And Clicks on next button
Then Request Coverage page is displayed to user 
And Selects Benefit Amount for Self as "<Benefit>" under TGTLI
And Selects Type of Coverage as "<TypeofCove1>" for Self under TGTLI
And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
And Selects Type of Coverage as "<TypeofCove>" for Self under TenYTL
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Self under TGTLI
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And User Enters Beneficiary details as "<Trust>","<DateTrust>"
And Clicks on OK button
And Verify that the Percent Displayed for Trust "<TGTLIRowNo>" is "<TrustPercent>" for TGTLI
And Clicks on Add Beneficiary Button for Self under TGTLI
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And User Enters Beneficiary details as "<Trust1>","<DateTrust>"
And Clicks on OK button
And Validates error message on Add Beneficiary page-Only one Trust is allowed as Primary
And Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
And Clicks on OK button
And Clicks on next button
Then Contact Details page is displayed to user
And Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Selects Residential Radio Button
And Selects No for Travel Question Non QD for Self
And Clicks on next button
Then Application Summary Page is displayed to user 
And Clicks on next button
And Click and scroll Consent message in Read and Sign Box
Then Authorize page details are displayed to user and confirm the term and conditions for Self 
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"
And Verify PDF information as "<pdfScenario>","<pdfEnable>"

Examples:
|website |Title  |Fname   |Lname  |State   	|DOB         |EStatus   					|LastSchool 	|GradDate       |Benefit |Benefit1  |Trust    |DateTrust  |TrustPercent |Trust1  |Bname |Blname |Relationship |Perc     |SSN        |Mstatus  |Height 	|Weight |Sex    |Street  |City        |Zipcode   |PhoneType |PhoneNum  |pdfEnable	|TypeofCove1		|TypeofCove	|TGTLIRowNo|
|caa     |Mr.    |Adam    |Gill   |Delaware |02/06/1975  |CAA Member (Columbia Student)	|King's College |05/04/2018  	|500000  |500000    |kennedy  |05/02/2017 |100 %  		|Arthur  |John  |Adams  |Son          |100      |990067673  |Married  |6.0 		|220  	|Male   |main st |providence  |10110     |Mobile    |5343545436|0			|Change in Coverage	|New		|1			|

@CAARegression_5
Scenario Outline:<CAASC05> Application Submission for Spouse Only (Former Columbia Student)

Given Test set up for "NYL" feature and "NYL_CAA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Click on Spouse
Then Eligibility page details are displayed to user 
And Select YES Radio button of Membership  
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Selects Eligibility status as "<EStatus>"
And Selects Last school attented/ currently attending as "<LastSchool>"
And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
And Clicks on next button
And Verify Spouse Membership mandatory validation message on Eligibility page
And Select radio button Yes for Spouse is Member
And Enters DOB for Spouse as "<SDOB1>"
And Clicks on next button
And Validate Age Restriction Message
And Enters DOB for Spouse as "<SDOB2>"
And Clicks on next button
And Validate Age Restriction Message
And Enters DOB for Spouse as "<SDOB>"
And Clicks on next button
Then Product page details are displayed to user
And Clicks on next button
And Validate Error Message on Product Page                  
And Selects product TGTLI for Spouse
And Clicks on next button
And Click YES for Dependent Coverage information
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
And Clicks on next button
Then Request Coverage page is displayed to user 
And Selects Benefit Amount for Spouse as "<Sbenefit>" under TGTLI
And Selects Type of Coverage as "<TypeofCove>" for Spouse under TGTLI
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
And Click and scroll Consent message in Read and Sign Box
Then Authorize page details are displayed to user and confirm the term and conditions for Self 
And Authorize page details are displayed to user and confirm the term and conditions for Spouse
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish  
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"
And Verify PDF information as "<pdfScenario>","<pdfEnable>"

Examples:
|website 	|Title  |Fname   |Lname   |State    	|DOB        	|EStatus       										|LastSchool   			|Stitle |Sfname  |Slname   |SDOB  		|SDOB1  		|SDOB2  	|Sbenefit  |Password |VPassword |Bname |Blname |Relationship 	|Perc  |SSN       	|Mstatus  	|Sex    |Street  |City        |Zipcode   |PhoneType |PhoneNum  	 |SSSN      |SHeight  	|SWeight |SSex    		|SPhoneType |SPhoneNum	|pdfEnable	|TypeofCove|           
|caa  		|Mr.    |Adam    |Gill    |Pennsylvania |02/06/1975  	|CAA Member (former Columbia student non graduate) 	|School of the Arts   	|Mrs.   |Bella   |Gill     |05/20/1978 	|05/20/2002  	|05/20/1953 |$500,000  |Adam@123 |Adam@123	|John  |Adams  |Spouse      	|100   |990067673  	|Married 	|Male   |main st |providence  |10110     |Home 		|5343545436  |990067501 |6.0	    |220     |Female     	|Mobile     |5454856876 |0			|New		|

@CAARegression_6
Scenario Outline: <CAASC06> Validation Read & Sign Page with 20 different States one by one in loop


Given Test set up for "NYL" feature and "NYL_CAA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Click on Self
Then Eligibility page details are displayed to user 
And Select YES Radio button of Membership
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Selects Eligibility status as "<EStatus>"
And Selects Last school attented/ currently attending and graduation date as "<LastSchool>","<GradDate>"
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
Then Contact Details page is displayed to user 
And Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Selects No for Travel Question Non QD for Self
And Selects Residential Radio Button
And Clicks on next button
Then Application Summary Page is displayed to user 
And Clicks on next button
Then Authorize page details are displayed to user 
And Validates I Understand verbiage one in Read and Sign Box
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
|website 	|Title 	|Fname 	|Lname 	|State  	|DOB  		|EStatus 						|LastSchool 			|GradDate 	|Benefit  	|Bfname |Blname |Relationship 	|Perc	|SSN  		|Mstatus |Height 	|Weight |Sex    |Street  |City  		|PhoneType |PhoneNum 	|State1  	|State2  |State3  	|State4  	|State5   		|State6   		|State7  	|State8     			|State9  |State10 |State11 	|State12 	|State13 	|State14 	|State15 	|State16 	|State17 	|State18 	|State19 |State20 		|State21 		|State22	|pdfScenario1	|pdfEnable	|pdfName1                  	|TypeofCove	|pdfScenario|pdfName								|Zipcode|
|caa 		|Mr. 	|Adam 	|Gill 	|Colorado   |08/01/1965 |CAA Member (Columbia Graduate) |School of Social Work 	|04/05/2010 |200000  	|JOHN 	|CARTER |Spouse  		|100  	|553-43-4348|Single  |6.0 		|180 	|Male 	|main st |providence 	|Mobile    |5343545436 	|California |Alabama |Arkansas 	|Louisiana 	|Pennsylvania 	|Rhode Island 	|Maryland 	|District of Columbia 	|Florida |Kansas  |Maine  	|New Jersey |New York 	|Oklahoma 	|Puerto Rico|Tennessee 	|Washington |Virginia 	|Wyoming |New Mexico 	|Connecticut 	|Minnesota	|CAA06_NM   	|1        	|Important Notice NM 2 08.12|New		|CAA06_WY	|Important Notice All except NM 2 08.12	|10110	|
