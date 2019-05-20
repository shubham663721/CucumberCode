Feature: ITFP Test

@ITFPRegression_1
Scenario Outline: <SASSSC01> Application submission for Self and Spouse with all the products and rider(s)  Beneficiaries- Maximum                  

Given Test set up for "NYL" feature and "NYL_SASS" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user 
Then Click on Self
Then Click on Spouse
And Select NO for Association Membership
And Validate that NEXT button is Disabled                                    
And Select YES Radio button of Membership
And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
And Select radio button NO for Spouse is Member
And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
And Clicks on next button
And Verify that error message is displayed for state eligibility at top of the page                                       
And Enter New State as "<State1>"
And Clicks on next button
Then Product page details are displayed to user
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB1>"                                 
And Clicks on next button
Then Product page details are displayed to user
And Validates the following products are not displayed for Self: GTLI, TenYTL, GADD, GDI, GOOEI
And Validate product GOOEDI not displayed for spouse
And Validate product GDI not displayed for spouse
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB>"
And Clicks on next button
Then Product page details are displayed to user
And Selects product GTLI for Self
And Selects product GTLI for Spouse
And Selects product TenYTL for Self
And Selects product TenYTL for Spouse
And Selects Product GADD for Self
And Selects Product GADD for Spouse
And Selects product GDI for Self
And Selects product GOOEI for Self
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
And Selects Answer as No for all additional questions of Group Disability Insurance for Self 
And Enters Monthly Income for Self as "<MonthlyIncome>"
And Enters details for Monthly Expense and Percentage Responsible as "<Mexpense>","<Percresp>"
And Clicks on next button
And Clicks on next button
And Validate error message for required question                               
And Confirms Imp Replacement Info for NewYork state
And Clicks on next button
And Clicks on Back or Previous button
Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Self
And Enter additional details as "<TotalAmt>","<Iamount>","<Company>"
And Verify New York State paragraph is displayed for Self
Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Spouse
And Enter additional details as "<STotalAmt>","<SIAmount>","<SCompany>" for Spouse
And Verify New York State paragraph is displayed for Spouse
And Selects Yes for unable to work because of a disability for Self
And Clicks on Add Company Button
And Enters details for Company "<Company1>","<BenAmt>","<BenPeriod>" and click on add button
And Selects Yes for replace any other company's coverage for Self
And Enters Amount under replace any other company's coverage as "<RepAmount>"
And Selects Yes for applying for any other business/office overhead insurance
And Clicks on Add Company button for overhead products
And Enters details for Company "<Company2>","<BenAmt1>","<BenPeriod1>" and click on add button
And Selects Yes for Any Other company's coverage for Group Disability for Self
And Enters replacement amount for Group Disability as "<RepAmount1>"
And Enters details for Monthly Expense and Percentage Responsible as "<Mexpense>","<Percresp>"
And Clicks on next button
Then Request Coverage page is displayed to user 
And Selects Benefit Amount for Self as "<Benefit5>" under GTLI
And Selects Type of Coverage as "<TypeofCove>" for Self under GTLI 
And Verify Type of Coverage Change in coverage is unavailable under GTLI for Spouse
And Selects Type of Coverage as "<TypeofCove1>" for Self under GTLI 
And Validates under GTLI the Benefit Slider Range for Self as "<Min_Term>" to "<Max_Term>"
And Selects Benefit Amount for Spouse as "<Sbenefit>" under GTLI
And Selects Type of Coverage as "<TypeofCove>" for Spouse under GTLI  
And Validates under GTLI the Benefit Slider Range for Spouse as "<SMin_Term>" to "<SMax_Term>" 
And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
And Selects Type of Coverage as "<TypeofCove>" for Self under TenYTL
And Validates under TenYTL the Benefit Slider Range as "<Min_Ten>" to "<Max_Ten>" for self
And Selects Benefit Amount for Spouse as "<Sbenefit1>" under TenYTL
And Selects Type of Coverage as "<TypeofCove>" for Spouse under TenYTL
And Validates under TenYTL the Benefit Slider Range as "<SMin_Ten>" to "<SMax_Ten>" for Spouse
And Selects Benefit Amount for Self as "<Benefit2>" under GADD
And Selects Type of Coverage as "<TypeofCove1>" for Self under GADD
And Validates under GADD the Benefit Slider Range for Self as "<Min_ADnD>" to "<Max_ADnD>"
And Selects Benefit Amount for Spouse as "<Sbenefit2>" under GADD
And Selects Type of Coverage as "<TypeofCove1>" for Spouse under GADD
And Validates under GADD the Benefit Amount listed for Spouse are: "<ADnD_amount1>","<ADnD_amount2>","<ADnD_amount3>"
And Selects Monthly Benefit Amount for Self as "<Benefit3>" under GDI
And Selects Type of Coverage as "<TypeofCove1>" for Self under GDI
And Validates under GDI the Benefit Slider Range as "<DISliderMin>" to "<DISliderMax>" for self
And Selects Benefit Option for Self as "<BenOption>" under GDI
And Selects Waiting Period for Self as "<WaitPeriod>" under GDI
And Selects Partial Disability Benefit Rider for self under GDI
And Selects Benefit Amount for Self as "<Benefit4>" under GOOEI
And Selects Type of Coverage as "<TypeofCove>" for Self under GOOEI
And Validates under GOOEI the Benefit Slider Range as "<GOOEISliderMin>" to "<GOOEISliderMax>"
And Selects Wait Period for Self as "<WaitPeriod1>" under GOOEI
And Validate Benefit Duration dropdown values for Self as "<BenDuration>" under GOOEI
And Selects Benefit Duration for Self as "<BenDuration>" under GOOEI
And Clicks on next button
And Verify Error Message in Spouse section for TermLife                                                     
And Selects Benefit Amount for Self as "<Benefit>" under GTLI
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Spouse under GTLI
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And User Enters Beneficiary details as "<Trust>","<Datetrust>"
And Clicks on OK button
And Verify that the Percent Displayed for Trust is "<TrustPercent>"
And Clicks on Add Beneficiary Button for Spouse under GTLI
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And User Enters Beneficiary details as "<Trust1>","<Datetrust>"
And Clicks on OK button
And Validates error message on Add Beneficiary page-Only one Trust is allowed as Primary
And Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons  
And User Enters Beneficiary details as "<Trust1>","<Datetrust>"
And Clicks on OK button
And Delete Contingent Beneficiary
And Delete box is displayed and clicks on Yes
And Clicks on Add Beneficiary Button for Spouse under GTLI
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under GTLI
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship as other "<Bname1>","<Blname1>","<Relationship1>","<Perc1>","<Desc>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under GTLI
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bname2>","<Blname2>","<Relationship2>","<Perc2>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under GTLI
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bname3>","<Blname3>","<Relationship3>","<Perc3>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TenYTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bname4>","<Blname4>","<Relationship4>","<Perc4>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TenYTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And Selects the First Option from Existing Beneficiaries List and select Type as "<BeneType>"
And Enters Percentage for First Option as "<Perc5>"
And Selects the Second Option from Existing Beneficiaries List and select Type as "<BeneType>"
And Enters Percentage Second Option as "<Perc6>"
And Selects the Third Option from Existing Beneficiaries List and select Type as "<BeneType>"
And Enters Percentage Third Option as "<Perc7>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TenYTL
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons 
And Selects the First Option from Existing Beneficiaries List and select Type as "<BeneType1>" for Trust
And Clicks on OK button
And Clicks on next button
Then Contact Details page is displayed to user
And Validate the Travel Question for Non QD application for Self
And Selects Yes for Travel Question Non QD for Self
And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>"
And Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Selects Residential Radio Button
And Selects Yes Radio Button for Business Address
And Enters Business Details as "<BusinessName>","<BusinessType>"
And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<SSex>","<SPhoneType>","<SPhoneNum>"
And Validate the Travel Question for Non QD application for Spouse
And Selects Yes for Travel Question Non QD for Spouse
And Enter datails for Outside US country and How Long months for Spouse as "<Country>","<Months>"
And Clicks on next button
Then Application Summary Page is displayed to user 
And Verify Benefit Amount for Self as "<Benefit>" under GTLI
And Verify Benefit Amount for Self as "<Benefit1>" under TenYTL
And Verify Benefit Amount for Self as "<Benefit2>" under GADD
And Verify Benefit Amount for Self as "<Benefit3>" under GDI
And Verify Benefit Option for Self as "<BenOption>" under GDI
And Verify Partial Disability Benefit Rider as "<PartialBene>" for self under GDI
And Verify Benefit Amount for Self as "<Benefit4>" under GOOEI
And Verify Benefit Amount for Spouse as "<Sbenefit>" under GTLI
And Verify Benefit Amount for Spouse as "<Sbenefit1>" under TenYTL
And Verify Benefit Amount for Spouse as "<Sbenefit2>" under GADD
And Clicks on next button
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
|website |Title   |Fname  |Lname    |State    	|DOB        |WorkHr  |Stitle |Sfname  |Slname   |SDOB       |State1   |DOB1        |MonthlyIncome  |Mexpense    |Percresp 	|TotalAmt |Iamount |Company |STotalAmt 	|SIAmount 	|SCompany |Company1 |BenAmt |BenPeriod 	|RepAmount 	|Company2 	|BenAmt1 	|BenPeriod1  	|RepAmount1 |Benefit  	|Min_Term |Max_Term |Sbenefit 	|SMin_Term |SMax_Term 	|Benefit1 |Min_Ten |Max_Ten |Sbenefit1 	|SMin_Ten |SMax_Ten |Benefit2 |Min_ADnD |Max_ADnD 	|Sbenefit2 	|Benefit3 	|DISliderMin 	|DISliderMax 	|BenOption 	|WaitPeriod |Benefit4 	|GOOEISliderMin |GOOEISliderMax |WaitPeriod1 	|BenDuration  |Benefit5|Trust   |Datetrust  |Trust1 |Bname |Blname |Relationship 	|Perc |Bname1   |Blname1 |Relationship1 |Perc1 |Desc    |Bname2|Blname2|Relationship2 	|Perc2 |Bname3 |Blname3 |Relationship3 |Perc3 |Bname4 |Blname4 |Relationship4 	|Perc4 |Perc5 |Perc6 |Perc7  |Country   |Months |SSN    	|Mstatus |Height 	|Weight |Sex   |Street  |City      		|Zipcode |PhoneType 	|PhoneNum  	|BusinessName |BusinessType     |SSSN    	|SHeight 		|SWeight |SSex 		|SPhoneType |SPhoneNum  |ADnD_amount1 	|ADnD_amount2 	|ADnD_amount3	|pdfEnable	|TypeofCove	|TypeofCove1		|BeneType	|BeneType1|PartialBene|TrustPercent|
|itfp    |Mr.     |Adam   |Gill     |Louisiana 	|01-17-1965 |40      |Mrs.   |Bella   |Gill     |05/20/1978 |New York |07/01/2003  |50000          |20000    	|100     	|25000    |5000    |Chubb   |25000  	|5000    	|Chubb    |Metlife 	|25000 	|6   		|35000  	|ICICI  	|35000  	|6    			|35000  	|$500,000  	|50000    |500000  	|$250,000   |50000     |500000  	|$500,000 |100000  |500000 	|$500,000 	|100000   |500000 	|$200,000 |100000  	|300000  	|$100,000 	|$3,000  	|500   			|100000   		|5-2 Plan 	|90 Days 	|$14,000 	|100   			|14000   		|30 Days  		|24 months    |100000  |kennedy |05/02/2012 |arthur |John  |Adams  |Son       		|50   |Samantha |Jonas   |Other     	|20    |Friend  |Jack  |Jones  |Son       		|20    |Jake   |Charls  |Father        |10    |Carter |Jonas   |Son     		|50    |20    |20    |10     |Mali     	|6      |990067673  |Married |6.0  		|220    |Male  |main st |providence   	|10110   |Mobile      	|5343545436 |Arthur Corp  |Sole Proprietary |990067501 	|5.0     	  	|180     |Female  	|Home       |5454856876 |50000  		|100000   		|150000			| 0			|New		|Change in Coverage	|   Primary	|Contingent|Yes	|100 %|                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              

@ITFPRegression_2
Scenario Outline: <SASSSC02> Application Submission for Spouse Only with All Products

Given Test set up for "NYL" feature and "NYL_SASS" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user 
And Select YES Radio button of Membership 
Then Click on Spouse
And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
And Clicks on next button
And Verify Spouse Membership mandatory validation message on Eligibility page
And Select radio button Yes for Spouse is Member          
And Clicks on next button
And Verify Error Message for spouse to apply separately
And Select radio button NO for Spouse is Member
And Clicks on next button
Then Product page details are displayed to user
And Validates that Spouse is displayed for TenYTL
And Verify Available Product List GTLI,GADD,GDI,GOOEI
And Clicks on Back or Previous button
And Enters DOB for Spouse as "<SDOB1>"                                        
And Clicks on next button
And Validate Age Restriction Message                         
And Enters DOB for Spouse as "<SDOB2>"                                       
And Clicks on next button
And Validate Age Restriction Message                       
And Enters DOB for Spouse as "<SDOB3>"                                        
And Clicks on next button
Then Product page details are displayed to user
And Clicks on next button
And Validate Error Message on Product Page                               
And Selects product GTLI for Spouse
And Selects product TenYTL for Spouse
And Selects Product GADD for Spouse
And Clicks on next button
And Click YES for Dependent Coverage information
Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Self
And Enter additional details as "<STotalAmt>","<SIAmount>","<SCompany>" for Spouse 
And Clicks on next button
Then Request Coverage page is displayed to user 
And Selects Type of Coverage as "<Sbenefit>" for Spouse under GTLI
And Selects Type of Coverage as "<TypeofCove>" for Spouse under GTLI 
And Selects Benefit Amount for Spouse as "<Sbenefit1>" under TenYTL
And Selects Type of Coverage as "<TypeofCove1>" for Spouse under TenYTL
And Selects Type of Coverage as "<TypeofCove>" for Spouse under GADD
And Selects Benefit Amount for Spouse as "<Sbenefit2>" under GADD
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Spouse under TenYTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under TenYTL
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons 
And User Enters Beneficiary details as "<Trust>","<DateTrust>"
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
|website |Title  	|Fname |Lname |State         |DOB        |WorkHr  |Stitle |Sfname   |Slname |SDOB       |SDOB1   	|SDOB2    	|SDOB3    	|Sbenefit 	|Sbenefit1 |Sbenefit2 		|Bname |Blname |Relationship |Perc |Trust  |DateTrust  |SSN   		|Mstatus |Sex  |Street  |City  		|Zipcode |PhoneType |PhoneNum  	|SSSN     	|SHeight 	|SWeight |SSex   |SPhoneType |SPhoneNum	|pdfEnable	|TypeofCove	|TypeofCove1		|STotalAmt	|SIAmount	|SCompany|
|itfp    |Mr. 		|Adam  |Gill  |Massachusetts |04/07/1958 |40      |Mrs.   |Bella    |Gill   |05/20/1958 |05/20/2003 |05/20/1938	|05/20/1973 |500000    	|400000    |$150,000      	|Adam  |Gill   |Spouse       |100  |Arthur |05/02/2012 |990067673   |Married |Male |main st |providence |10110   |Business  |5343545431 |990067501 	|5.0     	|180     |Female |Home       |5454856876|0			|New		|Change in Coverage	|25000     	|15000    	|Wayne Enterprise|

@ITFPRegression_3
Scenario Outline: <SASSSC03> Application submission for Self with ADnD
Save for Later and Retrieve


Given Test set up for "NYL" feature and "NYL_SASS" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user
And Select YES Radio button of Membership
Then Click on Self
And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
And Clicks on next button
Then Product page details are displayed to user
And Validates that GDI and GOOEI are not displayed
And Product page details are displayed to user and Verify Available Product List GTLI,TenYTL,GADD
And Clicks on Back or Previous button
And Enters Self WorkHr as "<WorkHr1>"
And Clicks on next button
Then Product page details are displayed to user And Verify Available Product List GTLI,TenYTL,GADD,GDI,GOOEI
And Selects Product GADD for Self
And Clicks on next button
Then Request Coverage page is displayed to user 
And Selects Benefit Amount for Self as "<Benefit>" under GADD
And Selects Type of Coverage as "<TypeofCove>" for Self under GADD
And Clicks on button to Save for later 
Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>"
And Clicks OK Button Save For Later
Then Refresh the browser
Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button under GADD for Self
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
And Clicks on OK button
And Clicks on Add Beneficiary Button under GADD for Self
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship as other "<Bname1>","<Blname1>","<Relationship1>","<Perc1>","<Desc>"
And Clicks on OK button
And Clicks on Add Beneficiary Button under GADD for Self
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bname2>","<Blname2>","<Relationship2>","<Perc2>"
And Clicks on OK button
And Clicks on Add Beneficiary Button under GADD for Self
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bname3>","<Blname3>","<Relationship3>","<Perc3>"
And Clicks on OK button
And Clicks on Add Beneficiary Button under GADD for Self
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bname4>","<Blname4>","<Relationship4>","<Perc4>"
And Clicks on OK button
And Clicks on Add Beneficiary Button under GADD for Self
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bname5>","<Blname5>","<Relationship5>","<Perc5>"
And Clicks on OK button
And Clicks on Add Beneficiary Button under GADD for Self
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bname6>","<Blname6>","<Relationship6>","<Perc6>"
And Clicks on OK button
And Clicks on Add Beneficiary Button under GADD for Self
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bname7>","<Blname7>","<Relationship7>","<Perc7>"
And Clicks on OK button
And Clicks on next button
Then Contact Details page is displayed to user
And Validates Height and Weight is not displayed for Self
And Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<Sex>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Selects Residential Radio Button
And Clicks on next button
Then Application Summary Page is displayed to user 
And Clicks on next button
Then Authorize page details are displayed to user and confirm the term and conditions for Self 
And Validates I Understand Verbiage in Read and Sign Box
And Validates Consent message in Read and Sign Box for NonUW
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"
And Verify PDF information as "<pdfScenario>","<pdfEnable>"

Examples:
|website |Title   |Fname |Lname |State     		|DOB     	|WorkHr  	|WorkHr1  |Benefit |Password |VPassword 	|Emailid         		|Bname |Blname |Relationship 	|Perc |Bname1   |Blname1 |Relationship1 |Perc1 |Desc    |Bname2|Blname2|Relationship2 	|Perc2 |Bname3 |Blname3 |Relationship3 	|Perc3 |Bname4 |Blname4 |Relationship4 	|Perc4 |Bname5  |Blname5 |Relationship5 |Perc5 |Bname6 |Blname6 |Relationship6 	|Perc6 |Bname7 |Blname7 |Relationship7 |Perc7   |SSN       |Mstatus |Sex   |Street  |City       |Zipcode  |PhoneType |PhoneNum   |pdfEnable	|TypeofCove	|
|itfp    |Mr.     |Adam  |Gill  |Pennsylvania 	|09/04/1979 |29   		|30       |300000  |Adam@123 |Adam@123	 	|adam@testabcabcper.com |John  |Adams  |Son      		|50   |Samantha |Jonas   |Other       	|20    |Friend  |Jack  |Jones  |Son      		|20    |Jake   |Charls  |Father     	|10    |Carter |Jonas   |Son        	|50    |Esabella|Swan    |Daughter      |20    |James  |Arthur  |Son     		|20    |Kurian |Molly   |Mother        |10      |990067673 |Single  |Male  |main st |providence |10110    |Mobile    |6856468687 |0			|New		|


@ITFPRegression_4
Scenario Outline: <SASSSC04> Application submission for Self with GDI & GOOEI

Given Test set up for "NYL" feature and "NYL_SASS" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user 
And Select YES Radio button of Membership 
Then Click on Self
And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
And Clicks on next button
And Verify that error message is displayed for state eligibility at top of the page
And Enter New State as "<State1>"                                                    
And Clicks on next button
Then Product page details are displayed to user
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB1>"                                             
And Clicks on next button
And Validate Age Restriction Message
And Enters DOB for Self as "<DOB2>"                                           
And Clicks on next button
And Validate Age Restriction Message
And Enters DOB for Self as "<DOB3>"                                            
And Clicks on next button
Then Product page details are displayed to user
And Validates Self is displayed for TenYTL
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB>"                                            
And Clicks on next button
Then Product page details are displayed to user
And Selects product GDI for Self
And Selects product GOOEI for Self
And Clicks on next button
And Selects Answer as No for all additional questions of Group Disability Insurance for Self
And Enters Monthly Income for Self as "<MonthlyIncome>"
And Enters details for Monthly Expense and Percentage Responsible as "<Mexpense>","<Percresp>"
And Clicks on next button
Then Request Coverage page is displayed to user 
And Validate Maximum Monthly Benefit Amount for Self as "<MaxBen>" under GDI
And Validate Maximum Monthly Benefit Amount for Self as "<MaxBen1>" under GOOEI
And Clicks on Back or Previous button
And Enters Monthly Income for Self as "<MonthlyIncome1>"
And Enters Monthly Expense for Self as "<Mexpense1>"
And Clicks on next button
Then Request Coverage page is displayed to user 
And Validate Maximum Monthly Benefit Amount for Self as "<MaxBen2>" under GDI
And Validate Maximum Monthly Benefit Amount for Self as "<MaxBen3>" under GOOEI
And Navigate back to Eligibility page
And Enters DOB for Self as "<DOB4>"                                  
And Clicks on next button
And Clicks on next button
And Enters Monthly Expense for Self as "<Mexpense2>"
And Clicks on next button
Then Request Coverage page is displayed to user 
And Validate Maximum Monthly Benefit Amount for Self as "<MaxBen4>" under GOOEI
And Clicks on Back or Previous button
And Enters Monthly Expense for Self as "<Mexpense3>"
And Clicks on next button
Then Request Coverage page is displayed to user 
And Validate Maximum Monthly Benefit Amount for Self as "<MaxBen5>" under GOOEI
And Selects Monthly Benefit Amount for Self as "<Benefit>" under GDI
And Selects Type of Coverage as "<TypeofCove>" for Self under GDI
And Selects Benefit Option for Self as "<BenOption>" under GDI
And Selects Waiting Period for Self as "<WaitPeriod>" under GDI
And Selects Benefit Amount for Self as "<Benefit4>" under GOOEI
And Selects Type of Coverage as "<TypeofCove1>" for Self under GOOEI
And Selects Wait Period for Self as "<WaitPeriod1>" under GOOEI
And Validate Benefit Duration dropdown values for Self as "<BenDuration>" under GOOEI
And Selects Benefit Duration for Self as "<BenDuration>" under GOOEI
And Clicks on next button
Then Contact Details page is displayed to user 
And Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>" 
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Selects No for Travel Question Non QD for Self
And Selects Residential Radio Button
And Selects NO Radio Button for Business Address
And Enters Business Details as "<BusinessName>","<BusinessType>"
And Enter Business Address Details as "<BStreet>","<BCity>","<BState>","<BZipcode>" 
And Clicks on next button
Then Application Summary Page is displayed to user 
And Clicks on next button
Then Authorize page details are displayed to user and confirm the term and conditions for Self 
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"
And Verify PDF information as "<pdfScenario>","<pdfEnable>"

Examples:
|website |Title   |Fname |Lname |State   |DOB    		|WorkHr |State1    |DOB1       |DOB2    	|DOB3  		|MonthlyIncome 	|Mexpense 	|Percresp 	|MaxBen |MaxBen1 	|MonthlyIncome1 |Mexpense1 	|MaxBen2 	|MaxBen3 |DOB4     		|Mexpense2 		|MaxBen4 	|Mexpense3 	|MaxBen5 	|Benefit 	|BenOption 	|WaitPeriod |Benefit1 	|WaitPeriod1 	|BenDuration |SSN      	|Mstatus |Height 	|Weight |Sex  |Street  |City       |Zipcode  |PhoneType |PhoneNum  	|BusinessName 	|BusinessType|pdfEnable	|TypeofCove	|TypeofCove1		|BStreet		|BCity  	|BState       |BZipcode|
|itfp    |Mr.     |Adam  |Gill  |Ontario |09/04/1964 	|40    	|Maryland  |07/01/2006 |04/10/1953  |08/04/1958 |16000     		|25000  	|100  		|10000 	|15000  	|14000    		|20000      |9800  		|14000   |08/04/1960  	|16000  		|10000  	|13500  	|9400  		|9800  		|67/67 Plan |180 Days 	|9400   	|30 Days    	|24 months   |990067673 |Single  |6.0      	|220    |Male |main st |providence |10110    |Business  |6856468687 |Capgemini   	|Corporation |0			|New		|Change in Coverage	|38 E 103rd St  |Chicago    |Illinois     |60628 |


@ITFPRegression_5
Scenario Outline: <SASSSC05> Validation Read & Sign Page with 20 different States one by one in loop

Given Test set up for "NYL" feature and "NYL_SASS" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user 
And Select YES Radio button of Membership 
Then Click on Self
And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
And Clicks on next button
Then Product page details are displayed to user
And Selects product GTLI for Self 
And Selects Product GADD for Self
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
And Clicks on next button
Then Request Coverage page is displayed to user 
And Selects Benefit Amount for Self as "<Benefit>" under GTLI
And Selects Type of Coverage as "<TypeofCove>" for Self under GTLI
And Selects Benefit Amount for Self as "<Benefit1>" under GADD
And Selects Type of Coverage as "<TypeofCove>" for Self under GADD
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Self under GTLI
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relation>","<Percen>"
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
And Validate Fraud Notice CA in Read and Sign Box
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
And Validate Fraud Notice PA in Read and Sign Box
And Navigate back to Eligibility page 
And Enter New State as "<State2>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate Fraud Notice MD in Read and Sign Box
And Navigate back to Eligibility page
And Enter New State as "<State3>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate Fraud Notice NJ in Read and Sign Box
And Navigate back to Eligibility page
And Enter New State as "<State4>"
And Clicks on next button
And Clicks on next button
And Confirms Imp Replacement Info for NewYork state
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate Fraud Notice NY in Read and Sign Box
And Navigate back to Eligibility page
And Enter New State as "<State5>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate Fraud Notice MN in Read and Sign Box
And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario>","<pdfEnable>","<pdfName>"
And Navigate back to Eligibility page
And Enter New State as "<State6>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validates additional Notes for Connecticut state
And Navigate back to Eligibility page 
And Enter New State as "<State4>"
And Clicks on next button
Then Product page details are displayed to user
And Deselects Product GADD for Self
And Clicks on next button
And Confirms Imp Replacement Info for NewYork state
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate Fraud Notice NY in Read and Sign Box

Examples:
|website |Title |Fname |Lname |State      |DOB        |WorkHr |Benefit |Benefit1 |Bfname |Blname |Relation |Percen  |SSN      |Mstatus |Height 	|Weight |Sex  |Street  |City    	|PhoneType  |PhoneNum  	|State1       |State2   |State3     |State4   |State5        |State6   	|TypeofCove	|Zipcode|pdfScenario|pdfEnable|pdfName                               | 
|itfp    |Mr.   |Adam  |Gill  |California |08/01/1965 |45     |150000  |200000   |JOHN   |CARTER |Spouse   |100     |553434348|Single  |6.0   	|180    |Male |main st |providence 	|Mobile     |5343545436 |Pennsylvania |Maryland |New Jersey |New York |Massachusetts |Connecticut|New		|10110 	|ITFP05_MN 	|1        |Important Notice All except NM 2 08.12| 
