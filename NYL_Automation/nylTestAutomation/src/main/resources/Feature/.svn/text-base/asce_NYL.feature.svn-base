Feature: Asce Test

@AsceRegression_1
Scenario Outline:<ASCESC01> Application submission for Self, Spouse and Child and with all the products and rider(s) Beneficiaries- Maximum (Under TTL for Spouse - 1 Prim Trust, 4 Cont Ind)(Under TenYTL fro Self - 4 Prim Ind, 1 Cont Trust)
	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"		
	When Clicks on Apply now button
	Then Select NO for Association Membership
	And Validate that NEXT button is Disabled		
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	Then Select YES Radio button of Membership
	And Validate that NEXT button is Enabled		
	Then Click on Self                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
	Then Click on Spouse
	And Click on Child                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
	And Enters Eligibility details for Spouse as "<STitle>","<Sfname>","<Slname>","<SDOB>","<SWorkHr>"
	And Select radio button NO for Spouse is Member 
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<CSex>"
	And Selects Married question as No for Child
	And Selects No for full time student for Child
	And Click on Add Child button on Screen
	And Clicks on next button
	And Verify that error message is displayed for state eligibility at top of the page
	And Enter New State as "<State1>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Verify Available Product List HII
	And Verify that Member and Spouse are not displayed for HII
	And Clicks on Back or Previous button
	And Enters DOB for Self as "<DOB1>" 
	And Enters DOB for Spouse as "<SDOB1>"
	And Clicks Edit button for Child Added	
	And Enters DOB for Child as "<CDOB1>"	
	And Click on Add Child button on Screen
	And Enters Self WorkHr as "<WorkHr1>"
	And Enters Spouse WorkHr as "<SWorkHr1>"
	And Clicks on next button 
	Then Product page details are displayed to user
	And Verify Available Product List TermLife,TenYTL,TwentyYTL,HLDD,HII
	And Clicks on Back or Previous button
	And Enters Self WorkHr as "<WorkHr>"
	And Enters Spouse WorkHr as "<SWorkHr>"
	And Clicks on next button
  	Then Product page details are displayed to user
  	And Verify Available Product List TermLife,TenYTL,TwentyYTL,HLDD,DII,HII
	And Selects product TermLife for Self
	And Selects product TermLife for Spouse
	And Selects product TermLife for Child
	And Selects product TenYTL for Self
	And Selects product TenYTL for Spouse
	And Selects product TwentyYTL for Self
	And Selects product TwentyYTL for Spouse
	## Note: HLDD(High-Limit Death and Dismemberment Insurance)
	And Selects product HLDD for Self
	And Selects product HLDD for Spouse
	And Selects product HLDD for Child
	## Note: DII(Disability Income Insurance)
	And Selects product DII for Self
	And Selects product DII for Spouse
	## Note: HII(Hospital Indemnity Insurance)
	And Selects product HII for Self
	And Selects product HII for Spouse
	And Selects product HII for Child
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
  	And Confirms Imp Replacement Info for NewYork state	
	Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Self
	And Enter additional details as "<Tamount>","<Iamount>","<Company>"
	And Verify New York State paragraph is displayed for Self
	Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Spouse
	And Enter additional details as "<sTamount>","<sIamount>","<sCompany>" for Spouse
	And Verify New York State paragraph is displayed for Spouse
	And Enters Monthly Income for Self as "<MonthlyIncome>"
	And Selects Yes for unable to work because of a disability for Self
	And Clicks on Add Company Button
	And Enters details for Company "<CCompany>","<CBenAmt>","<CBenPer>" and click on add button
	And Selects Yes for replace any other company's coverage for Self
	And Enters Amount under replace any other company's coverage as "<RAmt>"
	And Selects Yes for self employed for less than One year under Self
	And Clicks on next button
	Then Request Coverage page is displayed to user
	#And Verify that Quick Decision is Unavailable under TermLife for Self
	And Selects Benefit Amount for Self as "<Benefit>" under TermLife
	And Checks Chronic Illness Rider for Self checkbox under TermLife 
	And Selects CIR portion for Self as "<CIR>" under TermLife
	#And Verify that Quick Decision is Unavailable under TermLife for Spouse
	And Selects Benefit Amount for Spouse as "<SBenefit>" under TermLife
	And Checks CIR checkbox for Spouse 
	And Selects CIR portion for Spouse as "<Scir>" under TermLife
	And Selects Benefit Amount for Child as "<CBenefit>" under TermLife
	And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
	And Selects Benefit Amount for Spouse as "<SBenefit1>" under TenYTL
	And Selects Benefit Amount for Self as "<Benefit2>" under TwentyYTL
	And Selects Benefit Amount for Spouse as "<SBenefit2>" under TwentyYTL
	And Selects Benefit Amount for Self as "<Benefit3>" under HLDD	
	And Selects Benefit Amount for Spouse as "<SBenefit3>" under HLDD	
	And Selects Benefit Amount for Child as "<CBenefit3>" under HLDD	
	And Selects Monthly Benefit Amount for Self as "<Benefit4>" under DII
	And Selects Waiting Period for Self as "<WaitP>" under DII
	And Selects Benefit Option for Self as "<BenOpt>" under DII
	And Selects Benefit Amount for Self as "<Benefit5>" under HII
	And Selects Benefit Amount for Spouse as "<SBenefit5>" under HII
	And Selects Benefit Amount for Child as "<CBenefit5>" under HII
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Add Beneficiary Button for Spouse under TermLife
	Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
	And User Enters Beneficiary details as "<Trust>","<DateTrust>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse under TermLife
	Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
	And User Enters Beneficiary details as "<Trust>","<DateTrust>"
	And Clicks on OK button
	And Validate Error Message is displayed on Beneficiary Page
	And Clicks on Close button
	And Clicks on Add Beneficiary Button for Spouse under TermLife
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relation>","<Perc>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse under TermLife
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname1>","<Blname1>","<Relation1>","<Perc1>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse under TermLife
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname2>","<Blname2>","<Relation2>","<Perc2>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse under TermLife
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname3>","<Blname3>","<Relation3>","<Perc3>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And Selects the First Option from Existing Beneficiaries List and select Type as "<BeneType>"
	And Enters Percentage for First Option as "<Perc4>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And Selects the Second Option from Existing Beneficiaries List and select Type as "<BeneType>"
	And Enters Percentage Second Option as "<Perc5>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And Selects the Third Option from Existing Beneficiaries List and select Type as "<BeneType>"
	And Enters Percentage Third Option as "<Perc6>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And Selects the Fourth Option from Existing Beneficiaries List and select Type as "<BeneType>"
	And Enters Percentage Fourth Option as "<Perc7>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons																																	
	And User Enters Beneficiary details as "<STrust>","<SDateTrust>"	
	And Clicks on OK button
	And Clicks on next button
	Then Enters contact Details for Self without MemberShipID as "<SSN_Self>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<StreetAddress>","<City>","<Zipcode>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Validate the Travel Question for Non QD application for Self
	And Selects Yes for Travel Question Non QD for Self 
	And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>"
	And Selects No Radio button for Tobacco Question Self
	And Selects Residential Radio Button	
	And Selects Yes Radio Button for Business Address
	And Enters Business Details as "<BusinessName>","<BusinessType>"
	And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>"
  	And Validate the Travel Question for Non QD application for Spouse
	And Selects Yes for Travel Question Non QD for Spouse 
	And Enters details for Spouse as "<SCountry>","<SMonths>"
	And Selects No Radio button for Tobacco Question Spouse
	And Clicks on next button
	And Validates Membership ID Required Message
	And Enters Membership ID as "<MemId>" for Self
	And Clicks on next button
	Then Application Summary Page is displayed to user 
	And Verify Benefit Amount for Self as "<Benefit>" under TermLife
	And Verify CIR portion for Self as "<CIR>" under TermLife
	And Verify Benefit Amount for Spouse as "<SBenefit>" under TermLife
	And Verify CIR portion for Spouse as "<Scir>" under TermLife
	And Verify Benefit Amount for Child as "<CBenefit>" under TermLife
	And Verify Benefit Amount for Self as "<Benefit1>" under TenYTL
	And Verify Benefit Amount for Spouse as "<SBenefit1>" under TenYTL
	And Verify Benefit Amount for Self as "<Benefit2>" under TwentyYTL
	And Verify Benefit Amount for Spouse as "<SBenefit2>" under TwentyYTL
	And Verify Benefit Amount for Self as "<Benefit3>" under HLDD
	And Verify Benefit Amount for Spouse as "<SBenefit3>" under HLDD
	And Verify Benefit Amount for Child as "<CBenefit3>" under HLDD
	And Verify Benefit Amount for Self as "<Benefit4>" under DII
	And Verify Benefit Option for Self as "<BenOpt>" under DII_Five Year Plan
	And Verify Benefit Amount for Spouse as "<SBenefit4>" under DII
	And Verify Maximum Daily Benefit Amount for Self as "<Benefit5>" under HII
	And Verify Maximum Daily Benefit Amount for Spouse as "<SBenefit5>" under HII
	And Verify Benefit Amount for child as "<CBenefit5>" under HII	
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Selects Payment Method for TermLife
	Then Selects Payment option as Bill Me
	And Clicks on Save button
	And Selects Frequency for Term Life Product "<Frequency>"
	And Selects Payment Method for TenYTL
	Then Selects Payment option as Bill Me
	And Clicks on Save button
	And Selects Frequency for Ten Year Product and reviews "<Frequency>"
	And Selects Payment Method for TwentyYTL
	Then Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button	
	And Selects Frequency for Twenty Year Product "<Frequency1>"
	
	## Note: HLDD(High-Limit Death and Dismemberment Insurance)
	And Clicks on Payment Method for HLDD 
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for HLDD Product "<Frequency1>"
	
	## Note: DII(Disability Income Insurance)
	And Clicks on Payment Method for DII 
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for DII Product "<Frequency1>"
	
	## Note: HII(Hospital Indemnity Insurance)
	And Clicks on Payment Method for HII 
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for HII Product "<Frequency1>"
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
|Website	|Title 	|Fname	|Lname	|State	|State1		|DOB1		        |DOB		          |SDOB		            |WorkHr1|SWorkHr1|WorkHr|Stitle	|Sfname	|Slname	|SDOB1		          |SWorkHr|Cfname	|Clname	|CSex|CDOB		 |CDOB1		         |MonthlyIncome	|Benefit	|CIR		|SBenefit	|Scir		|CBenefit|Benefit1 |SBenefit1|Benefit2	|SBenefit2 |Benefit3|SBenefit3|CBenefit3|WaitP		|Benefit4	|SBenefit4|BenOpt				      |Benefit5	|SBenefit5	|CBenefit5	|Trust	|DateTrust	|Bfname	  |Blname	|Relation	|Perc	|Bfname1	|Blname1	  |Relation1	|Perc1	|Bfname2	|Blname2	|Relation2	|Perc2	|Bfname3	|Blname3      |Relation3	|BeneType|Perc3	|Perc4	|Perc5	|Perc6	|Perc7	|STrust		|SDateTrust	|SSN_Self	|Mstatus	|MemId				|Height	|Weight	|Gender_Self|StreetAddress  |City		|Zipcode|PrimaryPhType|PrimaryPhNo  |BusinessName	|BusinessType	|SSSN			|SHeight  |SWeight	|Gender_Spouse|SPhoneType	|SPhoneNum		|Bank		  |AccName	  |Rnum		    |Anum				|Country	|Months	|SCountry	|SMonths	|Tamount|Iamount |Company    |sTamount |sIamount|sCompany	|CCompany	|CBenAmt	|CBenPer	|RAmt  |Frequency|Frequency1|
|asce	    |Mr.	|Adam	|Gill	|Guam	|New York	|SYSDate - 17Y/0M/0D|SYSDate - 16Y/11M/29D|SYSDate - 16Y/11M/29D|29	    |29		 |30	|Mrs.	|Bella	|Gill	|SYSDate - 17Y/00M/00D|30		|John	|Gill	|Male|CurrentDate|SYSDate - 00Y/0M/14D|10000			|$260,000	|$200,000	|$220,000	|$175,000	|10000   |$480,000 |$270,000 |$320,000	|$190,000  |$200,000|$150,000 |10000	|90 Days	|$900		|$500     |Option A (Five Year Plan)  |300		|200		|100		|BOA	|10/11/2017	|Mia	  |Gill	    |Daughter	|20		|Sarah		|Gill		  |Daughter	    |20		|Rose		|Gill		|Other		|30		|James		|Gill		  |Father		|Primary |30	|50		|20		|20		|10		|MNC Trust	|01/02/2018	|741-25-8963|Married	|545345343543543	|6.0  	|500	|Male       |1 main st, Gold|HORSEHEADS	|14845	|Mobile		  |1234567890	|Gill company	|Corporation	|266-46-4546	|5.9  	  |400		|Female       |Home		    |0123456789		|NY Bank	  |Adam Gill  |745688999	|35434354879988588	|Nepal		|7		|Cuba		|8			|5000   |3000	 |Google Inc |2500	   |1000    |Blackcops	|Nile		|4500		|5			|2000  |Annually |Monthly   |
 
 
@AsceRegression_2
Scenario Outline: <ASCESC02> Application submission for Self, Spouse with TenYTL  Beneficiaries - (Under TenYTL for Self & Spouse) Primary Trust

	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"		
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user 
	Then Click on Self 
	Then Select NO for Association Membership
	And Validate that NEXT button is Disabled   
	Then Select YES Radio button of Membership
	And Validate that NEXT button is Enabled
	Then Click on Spouse
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	And Enters Eligibility details for Spouse as "<STitle>","<Sfname>","<Slname>","<SDOB>","<SWorkHr>"
	And Select radio button NO for Spouse is Member
	And Clicks on next button
	Then Product page details are displayed to user
	And Verify Available Product List TermLife,HLDD,DII,HII
	And Verify Available Product List TermLife,HLDD,HII for Spouse
	And Clicks on Back or Previous button
	And Enters DOB for Self as "<DOB1>" 
	And Enters DOB for Spouse as "<SDOB1>"
	And Clicks on next button
	Then Product page details are displayed to user 
	And Verify Available Product List TermLife,TenYTL,HLDD,DII,HII
	And Selects product TenYTL for Self
	And Selects product TenYTL for Spouse
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
	And Clicks on next button
	Then Request Coverage page is displayed to user 
	And Selects Benefit Amount for Self as "<Benefit>" under TenYTL
	And Validates under TenYTL the Benefit Slider Range as "<Min_Ten>" to "<Max_Ten>" for self
	And Selects Benefit Amount for Spouse as "<SBenefit>" under TenYTL
	And Validates under TenYTL the Benefit Slider Range as "<Min_Ten>" to "<Max_Ten>" for Spouse
	And Clicks on next button
	Then Beneficiary Page is displayed to user 
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
	And User Enters Beneficiary details as "<Trust>","<DateTrust>"
	And Clicks on OK button
	And Verify that the Percent Displayed for Trust is "<TrustPercent>"
	And Clicks on Add Beneficiary Button for Spouse under TenYTL
	Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
	And Selects the First Option from Existing Beneficiaries List and select Type as "<BeneType>" for Trust
	And Clicks on OK button
	And Clicks on next button
	Then Enters contact Details for Self without MemberShipID as "<SSN_Self>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<StreetAddress>","<City>","<Zipcode>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No for Travel Question Non QD for Self
	And Selects Yes Radio button for Tobacco Question 
	And Validates Last Used Date Textbox and Specify the products used Textbox is displayed
	And Enters Last Used Tobacco Date Details for Self as "<TobDate>"
	And Clicks on Products used textbox for Self and Selects Product as "<Product>"
	And Selects Business Address Radio Button for Send Correspondence To
	And Selects Yes Radio Button for Business Address
	And Enters Business Details as "<BusinessName>","<BusinessType>"
	And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>"
  	And Selects Yes Radio button for Tobacco Question for Spouse
	And Validates Last Used Date Textbox and Specify the products used Textbox is displayed for Spouse
	And Enters Last Used Tobacco Date Details for Spouse as "<STobDate>"
	And Clicks on Products used textbox for Spouse and Selects Product as "<SProduct>"
	And Answer for Outside the US or Canada in the next twelve months for Spouse
	And Clicks on next button
	And Validates Membership ID Required Message
	And Enters Membership ID as "<MemId>" for Self
	And Clicks on next button
	Then Application Summary Page is displayed to user 
	And Clicks on next button
	And Selects Payment Method for TenYTL
	Then Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for Ten Year Product and reviews "<Frequency>"
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

|Website |Title  |Fname |Lname |State  |DOB1                 |DOB                  |SDOB                 |WorkHr |Stitle |Sfname |Slname |SDOB1                |SWorkHr |Benefit     |SBenefit   |Min_Ten |Max_Ten   |Trust     |DateTrust  |SSN_Self    |Mstatus |MemId           |Gender_Self |Height |Weight |StreetAddress    |City   |Zipcode |PrimaryPhType|PrimaryPhNo|BusinessName  |BusinessType |SSSN        |SHeight |SWeight |Gender_Spouse |SPhoneType |SPhoneNum |Bank    |AccName   |Rnum      |Anum              |TobDate    |Product |TrustPercent |BeneType|STobDate   |SProduct|Frequency|
|asce    |Mr.    |Liam  |Smith |Georgia|SYSDate - 64Y/11M/29D|SYSDate - 65Y/00M/00D|SYSDate - 65Y/00M/00D|45     |Mrs.   |Emma   |Smith  |SYSDate - 64Y/11M/29D|45      | $1,320,000 |$1,450,000 |$100,000|$2,000,000|KYC Trust |05/06/2018 |741258963   |Married |545345343543543 |Male        |6.0    |200    |44 Downing St #3C|Bogart |30622   |Mobile       |1234567890 |Smith company |Corporation  |266-46-4546 |5.9     |200     |Female        |Home       |0123456789|NY Bank |Liam Smith|745688999 |35434354879988588 |01/12/2018 |Pipe    |100 %        |Primary |05/11/2018 |Cigar   |Monthly  |



@AsceRegression_3
Scenario Outline: <ASCESC03> Application submission for Self and Child with TwentyYTL (Bill Me - Quarterly) Beneficiaries (Under TwentyYTL for Self)- 2 Primary Individuals, Contingent Trust

	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user 
	Then Click on Self 
	Then Select NO for Association Membership
	And Validate that NEXT button is Disabled   
	Then Select YES Radio button of Membership
	And Validate that NEXT button is Enabled
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB1>", "<WorkHr>"
	And Click on Child
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB1>","<Csex>"
	And Selects Married question as No for Child
	And Selects No for full time student for Child
	And Click on Add Child button on Screen
	And Clicks on next button
	Then Product page details are displayed to user 
	And Verify Available Product List TermLife,TenYTL,HLDD,DII,HII
	And Verify that Child is only available for HII
	And Clicks on Back or Previous button
	And Enters DOB for Self as "<DOB>" 
	And Clicks Edit button for Child Added	
	And Enters DOB for Child as "<CDOB>"	
	And Click on Add Child button on Screen
	And Clicks on next button
	Then Product page details are displayed to user
	And Verify Available Product List TermLife,TenYTL,TwentyYTL,HLDD,DII,HII
	And Clicks on next button
	And Validate Error Message on Product Page
	And Selects product TwentyYTL for Self
	And Selects product TwentyYTL for Child
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	And Clicks on next button
	Then Request Coverage page is displayed to user 
	And Selects Benefit Amount for Self as "<Benefit>" under TwentyYTL
	And Validates under TwentyYTL the Benefit Slider Range as "<Min_Twenty>" to "<Max_Twenty>"
	And Selects Benefit Amount for Child as "<CBenefit>" under TwentyYTL
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Add Beneficiary Button for Self under TwentyYTL
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relation>","<Perc>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under TwentyYTL
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bfname1>","<Blname1>","<Relation1>","<Perc1>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under TwentyYTL
	Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons																																	
	And User Enters Beneficiary details as "<Trust>","<DateTrust>"	
	And Clicks on OK button
	And Clicks on next button
	Then Enters contact Details for Self without MemberShipID as "<SSN_Self>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<StreetAddress>","<City>","<Zipcode>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No Radio button for Tobacco Question Self
	And Selects No for Travel Question Non QD for Self 
	And Selects Business Address Radio Button for Send Correspondence To
	And Selects Yes Radio Button for Business Address
	And Enters Business Details as "<BusinessName>","<BusinessType>"
	And Clicks on next button
	And Validates Membership ID Required Message
	And Enters Membership ID as "<MemId>" for Self
	And Clicks on next button
	Then Application Summary Page is displayed to user 
	And Clicks on next button
	And Selects Payment Method for TwentyYTL
	Then Selects Payment option as Bill Me
	And Clicks on Save button
	And Selects Frequency for Twenty Year Product "<Frequency>"
	And Clicks on next button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"



Examples:
|Website |Title  |Fname |Lname |State     |DOB                  |DOB1                 |WorkHr |Cfname  |Clname |CSex  |CDOB                  |CDOB1                |Benefit    |Min_Twenty|Max_Twenty |CBenefit |Bfname |Blname |Relation |Perc |Bfname1|Blname1 |Relation1 |Perc1 |Trust      |DateTrust  |SSN_Self  |Mstatus |MemId           |Height |Weight |Gender_Self |StreetAddress   |City       |Zipcode |PrimaryPhType|PrimaryPhNo  |BusinessName |BusinessType |Frequency|
|asce    |Mr.    |Noah  |Cook  |Tennessee |SYSDate - 54Y/11M/29D|SYSDate - 55Y/00M/00D|45     |William |Cook   |Male  |SYSDate - 00Y/00M/13D |SYSDate - 00Y/00M/12D|$2,000,000 |$100,000  |$2,000,000 |10000    |Ava    |Cook   |Daughter |50   |Olivia |Cook    |Daughter  |50    |Calc Trust |05/06/2018 |741258963 |Married |545345343543543 |6.0    |200    |Male        |7860, Neshoba Rd|Germantown |14845   |Mobile       |1234567890   |Gill company |Corporation  |Quarterly|


@AsceRegression_4
Scenario Outline: <ASCESC04> Application submission for Spouse only with TwentyYTL Beneficiaries - (Under TwentyYTL for Spouse) - Primary Individual, Contingent Trust
	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user 
	Then Click on Spouse
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	Then Select YES Radio button of Membership
	And Enters Eligibility details for Spouse as "<STitle>","<Sfname>","<Slname>","<SDOB1>","<SWorkHr>"
	And Select radio button Yes for Spouse is Member
	And Clicks on next button
	Then Product page details are displayed to user
	And Verify Available Product List TermLife,TenYTL,HLDD,DII,HII
	And Clicks on Back or Previous button
	And Enters DOB for Spouse as "<SDOB>"
	And Clicks on next button 
	Then Product page details are displayed to user
	And Verify Available Product List TermLife,TenYTL,TwentyYTL,HLDD,DII,HII
	And Selects product TwentyYTL for Spouse
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
	And Clicks on next button
	Then Request Coverage page is displayed to user 
	And Selects Benefit Amount for Spouse as "<SBenefit>" under TwentyYTL
	And Validates under TwentyYTL for Spouse the Benefit Slider Range as "<Min_Twenty>" to "<Max_Twenty>"	
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Add Beneficiary Button for Spouse under TwentyYTL
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relation>","<Perc>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse under TwentyYTL
	Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons																																	
	And User Enters Beneficiary details as "<Trust>","<DateTrust>"
	And Clicks on OK button
	And Clicks on next button
	Then Contact Details page is displayed to user and enters contact Details for self as "<SSN>","<Mstatus>","<Gender_Self>","<MembershipID>","<StreetAddress>","<City>","<ZipCode>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects Residential Radio Button
	And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>"
	And Validate Tobacco Question for Spouse
	And Selects No Radio button for Tobacco Question Spouse
	And Validate the Travel Question for Non QD application for Spouse
  	And Selects No for Travel Question Non QD for Spouse
  	And Clicks on next button
	Then Application Summary Page is displayed to user 
	And Clicks on next button
	And Selects Payment Method for TwentyYTL
	And Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for Twenty Year Product "<Frequency>"
	And Confirms I have read the Information Check Box on Payment Page
	And Clicks on next button
	Then Authorize page details are displayed to user 
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
|Website |Title  |Fname |Lname |State  |DOB                 |WorkHr |SDOB1              |Stitle |Sfname   |Slname|SDOB                |SWorkHr |SBenefit   |Min_Twenty |Max_Twenty |Bfname |Blname |Relation |Perc |Trust     |DateTrust  |SSN        |Gender_Self |Mstatus |MembershipID    |StreetAddress      |City   |ZipCode |PrimaryPhType|PrimaryPhNo|SSSN        |SGender |SHeight |SWeight |SPhoneType |SPhoneNum  |Bank       |AccName    |Rnum      |Anum              | Frequency|
|asce    |Prof.  |Logan |Cox   |Kansas |SYSDate-50Y/11M/29D |45     |SYSDate-55Y/00M/00D|Mrs.   |Isabella |Cox   |SYSDate-54Y/11M/29D |45      |$2,000,000 |$100,000   |$2,000,000 |Sophia |Cox    |Daughter |100  |JKC Trust |05/06/2018 |741258963  |Male        |Married |545345343543543 |1220 N Dougherty St|Wichita|67212   |Mobile       |1234567890 |266-46-4546 |Female  |5.9     |200     |Home       |0123456789 |NY Bank    |Lohgan Cox |745688999 |35434354879988588 |Monthly   |

@AsceRegression_5
Scenario Outline: <ASCESC05> Application submission for Child only with all the products Beneficiaries - NO

	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user 
	And Click on Child
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	Then Select YES Radio button of Membership
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<CGender>"
  	And Selects Married question as No for Child
	And Selects No for full time student for Child
  	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname1>","<Clname1>","<CDOB1>","<CGender1>"
  	And Selects Married question as No for Child
	And Selects No for full time student for Child
  	And Click on Add Child button on Screen
  	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname2>","<Clname2>","<CDOB2>","<CGender2>"
	And Selects Married question as No for Child
	And Selects Yes for full time student for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname3>","<Clname3>","<CDOB3>","<CGender3>"
	And Selects Married question as No for Child
	And Selects No for full time student for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname4>","<Clname4>","<CDOB4>","<CGender4>"
  	And Selects Married question as No for Child
	And Selects No for full time student for Child
  	And Click on Add Child button on Screen
  	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname5>","<Clname5>","<CDOB5>","<CGender5>"
	And Selects Married question as No for Child
	And Selects Yes for full time student for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname6>","<Clname6>","<CDOB6>","<CGender6>"
 	 And Selects Married question as No for Child
	And Selects No for full time student for Child
  	And Click on Add Child button on Screen
  	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname7>","<Clname7>","<CDOB7>","<CGender7>"
	And Selects Married question as Yes for Child
	And Selects No for full time student for Child
	And Click on Add Child button on Screen
	And Validates Add Child Button on Eligibility page is not present
	And Clicks on next button 
	And Selects product TenYTL for Child
	And Selects product HLDD for Child
	And Selects product HII for Child
	And Clicks on next button
	Then Click YES for Dependent Coverage information
	Then Request Coverage page is displayed to user 
	And Validates "<Cfname>","<Cfname1>","<Cfname3>" and "<Cfname7>" are not displayed in eligible children under TenYTL
	And Selects Benefit Amount for Child as "<CBenefit>" under TenYTL
	And Validates under TenYTL the Benefit Amounts Listed are: "<TenYear_Amount>"
	And Selects Benefit Amount for Child as "<CBenefit1>" under HLDD
	And Validates under HLDD the Benefit Amounts Listed are:"<HLDD_Amount>"
	And Validates "<Cfname>","<Cfname3>" and "<Cfname7>" are not displayed in eligible children under HLDD																		
	And Selects Benefit Amount for Child as "<CBenefit2>" under HII
	And Validates under HII the Benefit Amounts for Child Listed are:"<HII_amount1>","<HII_amount2>","<HII_amount3>","<HII_amount4>","<HII_amount5>"
	And Validates "<Cfname3>","<Cfname7>" are not displayed in eligible children under HII																				
	And Clicks on next button
	Then Contact Details page is displayed to user and enters contact Details for self as "<SSN>","<Mstatus>","<Gender_Self>","<MembershipID>","<Street>","<City>","<ZipCode>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects Residential Radio Button
	And Clicks on next button
	Then Application Summary Page is displayed to user
	And Verify Child name as "<Cfname>","<Clname>"
	And Verify Benefit Amount for Child "<Cfname>","<HII_SequenceNo>" as "<CBenefit2>" under HII				
	And Verify Child name as "<Cfname1>","<Clname1>"
	And Verify Benefit Amount for Child "<Cfname1>","<HLDD_SequenceNo>" as "<CBenefit1>" under HLDD
	And Verify Benefit Amount for Child "<Cfname1>","<HII_SequenceNo1>" as "<CBenefit2>" under HII				
	And Verify Child name as "<Cfname2>","<Clname2>"
	And Verify Benefit Amount for child "<Cfname2>","<TenYTL_SequenceNo>" as "<CBenefit>" under TenYTL
	And Verify Benefit Amount for Child "<Cfname2>","<HLDD_SequenceNo1>" as "<CBenefit1>" under HLDD
	And Verify Benefit Amount for Child "<Cfname2>","<HII_SequenceNo2>" as "<CBenefit2>" under HII
	And Verify Child name as "<Cfname4>","<Clname4>"				
	And Verify Benefit Amount for child "<Cfname4>","<TenYTL_SequenceNo1>" as "<CBenefit>" under TenYTL
	And Verify Benefit Amount for Child "<Cfname4>","<HLDD_SequenceNo2>" as "<CBenefit1>" under HLDD
	And Verify Benefit Amount for Child "<Cfname4>","<HII_SequenceNo3>" as "<CBenefit2>" under HII				
	And Verify Child name as "<Cfname5>","<Clname5>"
	And Verify Benefit Amount for child "<Cfname5>","<TenYTL_SequenceNo2>" as "<CBenefit>" under TenYTL
	And Verify Benefit Amount for Child "<Cfname5>","<HLDD_SequenceNo3>" as "<CBenefit1>" under HLDD
	And Verify Benefit Amount for Child "<Cfname5>","<HII_SequenceNo4>" as "<CBenefit2>" under HII					
	And Verify Child name as "<Cfname6>","<Clname6>"
	And Verify Benefit Amount for Child "<Cfname6>","<HII_SequenceNo5>" as "<CBenefit2>" under HII				
	And Clicks on next button
	And Selects Payment Method for TenYTL
	Then Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for Ten Year Product and reviews "<Frequency>"
	And Clicks on Payment Method for HLDD 
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for HLDD Product "<Frequency>"
	And Clicks on Payment Method for HII 
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for HII Product "<Frequency>"
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
|Website |Title  |Fname    |Lname |State    |DOB                |WorkHr |Cfname |Clname	 |CDOB		 |CGender	|Cfname1 |Clname1|CDOB1	              |CGender1	|Cfname2   |Clname2	|CDOB2		        |CGender2	|Cfname3 |Clname3|CDOB3		           |CGender3|Cfname4 |Clname4 |CDOB4		       |CGender4|Cfname5 |Clname5|CDOB5		           |CGender5 |Cfname6 |Clname6	|CDOB6		          |CGender6	|Cfname7  |Clname7 |CDOB7		         |CGender7 |CBenefit  |CBenefit1 |CBenefit2|TenYear_Amount |HLDD_Amount |HII_amount1|HII_amount2 |HII_amount3 | HII_amount4|HII_amount5 |SSN         |Mstatus |MembershipID    |Gender_Self |Street                   |City   |ZipCode |PrimaryPhType|PrimaryPhNo |Bank       |AccName    |Rnum      |Anum              |Frequency |TenYTL_SequenceNo|TenYTL_SequenceNo1|TenYTL_SequenceNo2|HII_SequenceNo|HII_SequenceNo1|HII_SequenceNo2|HII_SequenceNo3|HII_SequenceNo4|HII_SequenceNo5|HLDD_SequenceNo|HLDD_SequenceNo1|HLDD_SequenceNo2|HLDD_SequenceNo3|
|asce    |Mr.    |Benjamin |Watson|Illinois |SYSDate-40Y/00M/00D|45     |Mason  |Watson  |CurrentDate|Male		|Elijah  |Watson |SYSDate- 23Y/00M/00D|Male		|Charlotte |Watson  |SYSDate-24Y/11M/29D|Female		|Amelia  |Watson |SYSDate- 26Y/00M/00D |Female	|Oliver  |Watson  |SYSDate- 22Y/11M/29D|Male	|Jacob   |Watson |SYSDate- 22Y/11M/29D |Male     |Evelyn  |Watson   |SYSDate- 00Y/00M/15Y |Female   |Abigail  |Watson  |SYSDate- 22Y/11M/29D |Female   |10000     |10000     |500      |$10,000        |$10,000     |$100       |$200        |$300        |$400        |$500        |741-25-8963 |Married |545345343543543 |Male        |36707, N Old Woods, Trl  |Gurnee |60031   |Mobile       |6985632090  |Swiss Bank |Ben Watson |745688999 |35434354879988588 |Monthly   |1                |2                 |3                 |1             |2              |3              |4              |5              |6              |1              |2               |3               |4               |

@AsceRegression_6
Scenario Outline: <ASCESC06> Application Submission for Self and Child with 10 YTL Add Max Children - Married Child, Full Time Student Beneficiaries - Primary Trust, Contingent Individual
	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user 
	Then Click on Self 
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	Then Select YES Radio button of Membership	
	And Click on Child
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<CGender>"
	And Selects Married question as No for Child
	And Selects Yes for full time student for Child
	And Click on Add Child button on Screen
	And Clicks on next button
	And Product page details are displayed to user
	And Verify Available Product List TermLife,TenYTL,TwentyYTL,HLDD,DII,HII
	And Verify that Child is not displayed for TermLife,TenYTL,TwentyYTL,HLDD
	And Verify that Child is only available for HII												
	And Clicks on Back or Previous button			
	And Clicks Edit button for Child Added			
	And Enters DOB for Child as "<CDOB1>"			
	And Click on Add Child button on Screen			
	And Clicks on next button			
	Then Product page details are displayed to user
	And Verify Available Product List TermLife,TenYTL,TwentyYTL,HLDD,DII,HII										
	And Verify that Child is not displayed for TermLife,TenYTL,TwentyYTL,HLDD										
	And Clicks on Back or Previous button
	And Clicks Edit button for Child Added	
	And Enters DOB for Child as "<CDOB2>" 
	And Click on Add Child button on Screen	
	And Clicks on next button
	Then Product page details are displayed to user
	And Verify Available Product List TermLife,TenYTL,TwentyYTL,HLDD,HII
	And Verify that Child is displayed for TermLife,TenYTL,TwentyYTL,HLDD,HII											
	And Selects product TenYTL for Self
	And Selects product TenYTL for Child
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	And Confirms Imp Replacement Info for NewYork state
	And Clicks on next button
	Then Request Coverage page is displayed to user 
	And Selects Benefit Amount for Self as "<Benefit>" under TenYTL
	And Validates under TenYTL the Benefit Slider Range as "<Min_Ten>" to "<Max_Ten>" for self
	And Selects Benefit Amount for Child as "<CBenefit>" under TenYTL
	And Validates under TenYTL the Benefit Amounts Listed are: "<TenYear_Amount>"
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
	And User Enters Beneficiary details as "<Trust>","<DateTrust>"
	And Clicks on OK button	
	And Verify that the Percent Displayed for Trust is "<TrustPercent>"
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relation>","<Perc>"	
	And Clicks on OK button
	And Clicks on next button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No for Travel Question Non QD for Self 
	And Selects No Radio button for Tobacco Question Self
	And Selects Residential Radio Button
	And Clicks on next button
	Then Application Summary Page is displayed to user 
	And Clicks on next button
	And Selects Payment Method for TenYTL
	Then Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for Ten Year Product and reviews "<Frequency>"
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
|Website|Title 	|Fname	|Lname	|State	  |DOB		            |WorkHr	|Cfname	 |Clname |CGender|CDOB1		 |CDOB		            |CDOB2		            |Benefit	|CBenefit	|TenYear_Amount|Trust		|DateTrust	|Bfname	|Blname	|Relation	|Perc	|SSN		|Mstatus	|MemberId		    |Height	|Weight	|StreetAddress	       |Gender_Self|City		|Zip	|PrimaryPhType |PrimaryPhNo|Bank	 |AccName	 |Rnum		|Anum			   |TrustPercent|Frequency|
|asce	|Mr.	|Lucas  |Walker |New York |SYSDate - 33Y/11M/29D|45		|Michael |Walker |Male   |CurrentDate|SYSDate - 25Y/00M/00D |SYSDate - 24Y/11M/29D	|$1,770,000	|10000	    |$10,000       |RNR Trust	|05/06/2018	|Harper |Walker	|Daughter	|100	|741-25-8963|Married	|545345343543543	|6.0	|200	|156, Salmons Hollow Rd|Female     |Brewster 	|10509  |Mobile        |1234567890 |ATG Bank |Gorge Gill |745688999 |35434354879988588 |100 %       |Monthly  | 

@AsceRegression_7
Scenario Outline: <ASCESC07> Application submission for Self with all LI products(JET) Beneficiaries - (Under TLI fro Self ) Maximum (4 Pri Ind, 4 Cont Ind)
	
	Given Test set up for "NYL" feature and "NYL_ASCE" scenario	
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user 
	Then Click on Self 
	Then Select NO for Association Membership
	And Validate that NEXT button is Disabled   
	Then Select YES Radio button of Membership
	And Validate that NEXT button is Enabled
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB1>", "<WorkHr>"	
	And Clicks on next button	
	And Validate Age Restriction Message
	And Enters DOB for Self as "<DOB2>" 										
	And Clicks on next button										
	Then Product page details are displayed to user							
	Then Selects product TermLife for Self										
	And Clicks on next button										
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self										
	And Clicks on next button										
	Then Request Coverage page is displayed to user										
	And Validates under TermLife the Benefit Slider Range for Self as "<Min_Term2>" to "<Max_Term2>"
	And Navigate back to Eligibility page										
	And Enters DOB for Self as "<DOB3>" 										
	And Clicks on next button										
	Then Product page details are displayed to user										
	And Clicks on next button										
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self										
	And Clicks on next button										
	Then Request Coverage page is displayed to user										
	And Validates under TermLife the Benefit Slider Range for Self as "<Min_Term3>" to "<Max_Term3>"
	And Navigate back to Eligibility page										
	And Enters DOB for Self as "<DOB>" 										
	And Clicks on next button										
	Then Product page details are displayed to user									
	And Selects product TenYTL for Self	
	And Selects product TwentyYTL for Self	
	And Clicks on next button	
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self	
	And Clicks on next button	
	Then Request Coverage page is displayed to user	
	And Selects Benefit Amount for Self as "<Benefit>" under TermLife
	And Validates under TermLife the Benefit Slider Range for Self as "<Min_Term>" to "<Max_Term>"	
	And Verify that Quick Decision is Available under TermLife	
	And Checks Chronic Illness Rider for Self checkbox under TermLife	
	Then Request Coverage page is displayed to user
	And Verify that Quick Decision is Unavailable under TermLife for Self	
	And Deselects Chronic Illness Rider for self under TermLife	
	And Verify that Quick Decision is Available under TermLife	
	And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
	And Validates under TenYTL the Benefit Slider Range as "<Min_Ten>" to "<Max_Ten>" for self
	And Selects Benefit Amount for Self as "<Benefit2>" under TwentyYTL
	And Validates under TwentyYTL the Benefit Slider Range as "<Min_Twenty>" to "<Max_Twenty>"	
	And Clicks on next button	
	And Validate Max Aggregate error message
	And Selects Benefit Amount for Self as "<Benefit3>" under TwentyYTL	
	And Clicks on next button	
	Then Beneficiary Page is displayed to user	
	And Clicks on Add Beneficiary Button for Self under TermLife	
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relation>","<Perc>"
	And Clicks on OK button	
	And Clicks on Add Beneficiary Button for Self under TermLife	
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bfname1>","<Blname1>","<Relation1>","<Perc1>"	
	And Clicks on OK button	
	And Clicks on Add Beneficiary Button for Self under TermLife	
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bfname2>","<Blname2>","<Relation2>","<Perc2>"	
	And Clicks on OK button	
	And Clicks on Add Beneficiary Button for Self under TermLife	
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bfname3>","<Blname3>","<Relation3>","<Perc3>"	
	And Clicks on OK button	
	And Clicks on Add Beneficiary Button for Self under TermLife	
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname4>","<Blname4>","<Relation4>","<Perc4>"	
	And Clicks on OK button	
	And Clicks on Add Beneficiary Button for Self under TermLife		
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname5>","<Blname5>","<Relation5>","<Perc5>"	
	And Clicks on OK button	
	And Clicks on Add Beneficiary Button for Self under TermLife	
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname6>","<Blname6>","<Relation6>","<Perc6>"	
	And Clicks on OK button	
	And Clicks on Add Beneficiary Button for Self under TermLife		
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname7>","<Blname7>","<Relation7>","<Perc7>"	
	And Clicks on OK button	
	And Clicks on next button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
	And Select DrivingLicense Question as Yes and Enters details for driving info for Self as "<DrivingLicenseNo>","<DrivingLicenseState>"														
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects Yes Radio button for Tobacco Question 
	And Validates Last Used Date Textbox and Specify the products used Textbox is displayed
	And Enters Last Used Tobacco Date Details for Self as "<TobDate>"
	And Clicks on Products used textbox for Self and Selects Product as "<Product>"
	And Validates the Travel Question for QD application	
	And Selects No for Travel Question QD for Self
	And Selects Yes for Travel Question Non QD for Self 									
	And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>"									
	And Selects Residential Radio Button	
	And Clicks on next button
	Then Application Summary Page is displayed to user 	
	And Clicks on next button	
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>" 	
	And Clicks on Next and OK Button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	And Clicks on next button	
	Then Statement of Health page one is displayed to user and answeres as No for all questions on both pages for Self
    Then Statement of Health page two is displayed to user and answeres as No for all questions on both pages for Self	
	Then Almost done page is displayed to user	
	And Clicks on next button	
	Then Review and sign page details are displayed to user and Click on continue and attached the sign	
	And Clicks on next button to finish	
	Then Payment Authorization Letter is displayed to user and clicks on Continue
	And Signs Payment Authorization Letter	
	And Clicks on next button to finish	
	Then Your Insurance Request Decision Page is displayed to user	
	And Clicks on next button
	Then Payment page details are displayed to user and skip payment	
	Then Thank you page is displayed to user	
	And Verify that two confirmation number is generated for "<Website>"	

	
	
Examples:	
|Website |Title  |Fname |Lname            |State   |DOB        |DOB1               |WorkHr |Benefit  |Min_Term |Max_Term  |Benefit1   |Min_Ten   |Max_Ten    |Benefit2   |Benefit3  |Min_Twenty |Max_Twenty |Bfname |Blname |Relation |Perc |Bfname1  |Blname1 |Relation1 |Perc1 |Bfname2 |Blname2 |Relation2 |Perc2 |Bfname3   |Blname3 |Relation3 |Perc3 |Bfname4 |Blname4 |Relation4 |Perc4 |Bfname5 |Blname5 |Relation5 |Perc5 |Bfname6 |Blname6 |Relation6 |Perc6 |Bfname7 |Blname7 |Relation7 |Perc7 |Weight12mnths |SSN         |Mstatus |Gender_Self |MemberId        |Height |Weight |StreetAddress  |City       |Zip    |PrimaryPhType|PrimaryPhNo|Password |VPassword|Country |Months |TobDate    |Product |DrivingLicenseNo|DrivingLicenseState| DOB2              |DOB3                 |Min_Term2|Max_Term2|Min_Term3|Max_Term3|
|asce    |Mr.    |Jack  |Snmmmmtestcasejm |Kansas  |02/06/1977 |SYSDate-16Y/11M/29D|45     |$250,000 |$20,000  |$1,000,000|$1,050,000 |$100,000  |$2,000,000 |$1,040,000 |$680,000  |$100,000   |$2,000,000 |Emily  |Evans  |Daughter |20   |Elizabeth|Evans   |Daughter  |20    |Avery   |Evans   |Mother    |30    |Alexander |Evans   |Father    |30    |Ethan   |Evans   |Son       |10    |Daniel  |Evans   |Son       |10    |Sofia   |Evans   |Daughter  |40    |Ella    |Evans   |Daughter  |40    |220           |990-06-7737 |Married |Male        |545345343543543 |6.0    |200    |107 S 9th St   |Louisburg  |14845  |Mobile       |1234567890 |Adam@123 |Adam@123 |India   |12     |11/01/2018 |Cigar   |A12345678       |Nevada             |SYSDate-70Y/00M/00D| SYSDate-73Y/00M/00D |$20,000  |$500,000 |$20,000  |$350,000 |	
	 
	
@AsceRegression_8	
Scenario Outline: <ASCESC08> Application submission for Self with DI & Hospital (Bill Me-Semi Anually) Save for Later and Retrieve Beneficiaries - NO	
	Given Test set up for "NYL" feature and "NYL_ASCE" scenario	
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button	
	Then Eligibility page details are displayed to user 	
	Then Click on Self 
	Then Select NO for Association Membership
	And Validate that NEXT button is Disabled   
	Then Select YES Radio button of Membership
	And Validate that NEXT button is Enabled
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB1>", "<WorkHr>"
    And Clicks on next button	
	And Validate Age Restriction Message	
	And Enters DOB for Self as "<DOB2>"	
	And Clicks on next button	
	And Verify Available Product List TermLife,HII
	And Verify HLDD,DII are not available	
	And Clicks on Back or Previous button
	And Enters DOB for Self as "<DOB>"
	And Clicks on next button
	And Verify Available Product List HLDD,DII
	And Clicks on Back or Previous button
	And Enter New State as "<State1>"
	And Clicks on next button	
	And Verify Available Product List TermLife
	And Verify HLDD,DII,HII are not available
	And Clicks on Back or Previous button
	And Enter New State as "<State>"
	And Clicks on next button	
	Then Product page details are displayed to user
	And Verify Available Product List TermLife,HLDD,DII,HII	
	And Selects product DII for Self	
	And Selects product HII for Self	
	And Clicks on next button	
	And Enters Monthly Income for Self as "<MonthlyIncome1>"
	And Selects Answer as No for all Group Disability Insurance for Self
	And Clicks on next button	
	Then Request Coverage page is displayed to user 
	And Validates under DII the Benefit Slider Range as "<Min_DII>" to "<Max_DII>"		
	And Clicks on Back or Previous button	
	And Enters Monthly Income for Self as "<MonthlyIncome>"
	And Clicks on next button	
	Then Request Coverage page is displayed to user
	And Validates under DII the Benefit Slider Range as "<Min_DII1>" to "<Max_DII1>"	 	
	And Validates under DII the Waiting Period Listed are: "<WP_DII1>","<WP_DII2>","<WP_DII3>","<WP_DII4>"	
	And Validates under DII the Benefit Option Listed are: "<BenOpt_DII1>","<BenOpt_DII2>"             
	And Selects Waiting Period for Self as "<WaitP>" under DII	
	And Selects Monthly Benefit Amount for Self as "<Benefit>" under DII	
	And Selects Benefit Option for Self as "<BenOpt>" under DII	
	And Selects Benefit Amount for Self as "<Benefit1>" under HII
	And Validates under HII the Benefit Amounts for Self Listed are:"<HII_amount1>","<HII_amount2>","<HII_amount3>","<HII_amount4>","<HII_amount5>"
	And Clicks on button to Save for later
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>" 
	And Clicks OK Button Save For Later
	Then Refresh the browser
	Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive	
	And Clicks on next button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No for Travel Question Non QD for Self
	And Selects Residential Radio Button
	And Selects Yes Radio Button for Business Address	
	And Enters Business Details as "<BusinessName>","<BusinessType>"	
	And Clicks on next button	
	Then Application Summary Page is displayed to user 	
	And Clicks on next button	
	And Clicks on Payment Method for DII 	
	Then Selects Payment option as Bill Me
	And Clicks on Save button	
	And Selects Frequency for DII Product "<Frequency>"	
	And Clicks on Payment Method for HII 
	Then Selects Payment option as Bill Me	
	And Clicks on Save button	
	And Selects Frequency for HII Product "<Frequency>"		
	And Clicks on next button	
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	And Verify Supplemental Health Note in Authorization Page
	And Clicks on next button	
	Then Review and sign page details are displayed to user and Click on continue and attached the sign	
	And Clicks on next button to finish	
	Then Thank you page is displayed to user	
	And Verify that Confirmation number is generated for "<Website>"	

Examples:	
|Website |Title  |Fname   |Lname   |State1  |State |DOB                   |DOB1                  |DOB2                 |WorkHr |MonthlyIncome |MonthlyIncome1 |WaitP    |Min_DII|Max_DII|Min_DII1|Max_DII1|WP_DII1 |WP_DII2|WP_DII3 |WP_DII4 |Benefit |BenOpt                 |BenOpt_DII1               | BenOpt_DII2          |Benefit1 |HII_amount1|HII_amount2 |HII_amount3 | HII_amount4|HII_amount5 |Password |VPassword |SSN         |Mstatus |Gender_Self |MemberId           |Height |Weight |StreetAddress    |City        |Zip     |PrimaryPhType |PrimaryPhNo  |BusinessName     |BusinessType|Frequency   |
|asce    |Mr.    |Matthew |Russell |Vermont |Utah  |SYSDate - 69Y/11M/29D |SYSDate - 80Y/00M/00D |SYSDate - 70Y/00M/00D|45     |7300          |6850           |180 Days |$150   |$4,050 |$150    | $4,200 |30 Days |90 Days|180 Days|365 Days|$4,200  |Option B (Career Plan) |Option A (Five Year Plan) |Option B (Career Plan)|500      |$100       |$200        |$300        |$400        |$500        |Adam@123 |Adam@123  |741-25-8963 |Married |Male        |545345343543543    |6.0    |300    |Hahaione St #3C  |Springfield |14845   |Mobile        |1234567890   |Russell company  |Corporation |Semiannually| 	


@AsceRegression_9	
Scenario Outline: <ASCESC09> Application submission for Self with only Term Life Insurance (JET) Beneficiaries - Primary Individual and Contingent Trust Validate Travel Question - 6 months
	Given Test set up for "NYL" feature and "NYL_ASCE" scenario	
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user 
	Then Click on Self 
	Then Select NO for Association Membership
	And Validate that NEXT button is Disabled   
	Then Select YES Radio button of Membership
	And Validate that NEXT button is Enabled
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB1>", "<WorkHr>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Verify Available Product List HII
	And Clicks on Back or Previous button
	And Enter New State as "<State1>"
	And Enters DOB for Self as "<DOB>" 
	And Clicks on next button
	And Verify Available Product List TermLife
	And Selects product TermLife for Self
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self	
	And Clicks on next button
	Then Request Coverage page is displayed to user 
	And Validates under TermLife the Benefit Slider Range for Self as "<Min_Term>" to "<Max_Term>"	
	And Selects Benefit Amount for Self as "<Benefit>" under TermLife
	And Verify that Quick Decision is Available under TermLife
	And Clicks on next button
	And Clicks on Add Beneficiary Button for Self under TermLife	
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relation>","<Perc>"
	And Clicks on OK button	
	And Clicks on Add Beneficiary Button for Self under TermLife
	Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons																																	
	And User Enters Beneficiary details as "<Trust>","<DateTrust>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under TermLife
	Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons																																	
	And User Enters Beneficiary details as "<Trust>","<DateTrust>"
	And Clicks on OK button
	And Validate Error Message is displayed on Beneficiary Page
	And Clicks on Close button
	And Clicks on next button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<ZipCode>"
	And Select DrivingLicense Question as Yes and Enters details for driving info for Self as "<DrivingLicenseNo>","<DrivingLicenseState>"
	And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No Radio button for Tobacco Question Self
	And Validates the Travel Question for QD application
	And Selects No for Travel Question QD for Self	
	And Selects Residential Radio Button
	And Clicks on next button
	Then Application Summary Page is displayed to user 
	And Clicks on next button
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>" 
	And Clicks on Next and OK Button
	Then Authorize page details are displayed to user
	And Validate Authorization Message MN in Read and Sign Box 
	And Clicks on next button
	And Validate Error message for Authorization
	Then Authorize page details are displayed to user and confirm the term and conditions for Self	
	And Clicks on next button
	Then Statement of Health page one is displayed to user and answeres as No for all questions on both pages for Self
  	Then Statement of Health page two is displayed to user and answeres as No for all questions on both pages for Self
	Then Almost done page is displayed to user														
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign																																	
	And Clicks on next button to finish
	Then Your Insurance Request Decision Page is displayed to user		
	And Clicks on next button
	Then Payment Information Page is displayed to user 
	And Selects Payment Method for TermLife
	Then Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for Term Life Product "<Frequency>"
	And Confirms I have read the Information Check Box on Payment Page
	And Clicks on next button
	Then Payment Authorization Letter is displayed to user and clicks on Continue																																	
	And Signs Payment Authorization Letter
	And Clicks on next button to finish
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"
	


Examples: 
|Website|Title 	|Fname		|Lname				|State	|State1		|DOB		|DOB1		            |WorkHr	|Benefit	|Min_Term |Max_Term  |Bfname	|Blname	|Relation	|Perc	|Trust		|DateTrust	|SSN			|Gender_Self|Mstatus	|MemberId	    |Height	|Weight	|StreetAddress	     |City		|ZipCode|PrimaryPhType|PrimaryPhNo  |Weight12mnths|Password|VPassword   |DrivingLicenseNo|DrivingLicenseState|Bank		|AccName	|Rnum		|Anum              |Frequency   |
|asce	|Mr.	|Kendrick	|Snmmmmtestcasesp	|Kansas |Minnesota	|01/17/1972	|SYSDate - 76Y/00M/00D	|45		|$20,000	|$20,000  |$1,000,000| Maria    |Gill	|Daughter	|100	|MNC Trust	|05/06/2018	|070-00-0019	|Male	    |Married	|545345343543543|6.0	|200	|3116 Golfview Ln SW |Rochester |14845  |Mobile       |1234567890   |250 		  |Adam@123|Adam@123	|A12345678	     |Nevada             |NY Bank	|Adam Gill	|745688999	|35434354879988588 |Monthly     |        


@AsceRegression_10	
Scenario Outline: <ASCESC10> Application Submission for Self,Spouse and Child with Term Life (JET) Beneficiaries - Primary Individual, Contingent Individual 

	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	Then Click on Self 
	Then Click on Spouse
	And Click on Child
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB1>", "<WorkHr>"
	Then Select YES Radio button of Membership                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
	And Enters Eligibility details for Spouse as "<STitle>","<Sfname>","<Slname>","<SDOB1>","<SWorkHr>"
	And Select radio button Yes for Spouse is Member
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB1>","<CGender>"
	And Selects Married question as No for Child
	And Selects No for full time student for Child
	And Click on Add Child button on Screen
	And Clicks on next button
	Then Product page details are displayed to user
	And Verify Available Product List HII
	And Clicks on Back or Previous button
	And Enters DOB for Self as "<DOB2>"
	And Enters DOB for Spouse as "<SDOB2>"
	And Clicks on next button							
	Then Product page details are displayed to user
	And Verify Available Product List TermLife,TenYTL,TwentyYTL,HLDD,DII,HII						
	And Verify the Quick Decision is not Available under TermLife on Product Page 							
	And Clicks on Back or Previous button
	And Enters DOB for Self as "<DOB>" 			
	And Enters DOB for Spouse as "<SDOB>"
	And Clicks Edit button for Child Added	
	And Enters DOB for Child as "<CDOB>"	
	And Click on Add Child button on Screen
	And Clicks on next button
	Then Product page details are displayed to user
	And Verify Available Product List TermLife,TenYTL,TwentyYTL,HLDD,DII,HII							
	And Verify the Quick Decision is Available under TermLife on Product Page							
	And Selects product TermLife for Self							
	And Selects product TermLife for Spouse
	And Selects product TermLife for Child
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under TermLife
	And Validates under TermLife the Benefit Slider Range for Self as "<Min_Term>" to "<Max_Term>"
	And Verify that Quick Decision is Available under TermLife							
	And Selects Benefit Amount for Spouse as "<SBenefit>" under TermLife
	And Validates under TermLife the Benefit Slider Range for Spouse as "<SMin_Term>" to "<SMax_Term>" 
	And Verify that Quick Decision is Available under TermLife for Spouse
	And Selects Benefit Amount for Child as "<CBenefit>" under TermLife
	And Clicks on next button
	And Clicks on Add Beneficiary Button for Spouse under TermLife
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship as other "<Bfname>","<Blname>","<Relation>","<Perc>","<Desc>" 											
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse under TermLife
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname1>","<Blname1>","<Relation1>","<Perc1>"
	And Clicks on OK button
	And Clicks on next button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<ZipCode>"
	And Select DrivingLicense Question as Yes and Enters details for driving info for Self as "<DrivingLicenseNo>","<DrivingLicenseState>"
	And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No Radio button for Tobacco Question Self
	And Validates the Travel Question for QD application
	And Selects No for Travel Question QD for Self	
	And Selects Residential Radio Button
	And Validates the Travel Question for QD application
	And Enters contact Details for Spouse without SSN as "<Gender_Spouse>","<SHeight>","<SWeight>","<SPhoneType>","<SPhoneNum>"												
	And Enters WeightTwelveMonths ago details for Spouse as "<S12mnthsWeight>"
	And Validates the Travel Question for QD application for Spouse
	And Selects Yes for Travel Question QD for Spouse 
	And Enters details for Travel Question QD for spouse as "<SCountry>"
	And Select DrivingLicense Question as No for Spouse
	And Selects No Radio button for Tobacco Question Spouse
	And Clicks on next button
	And Validates SSN Required Error Message for Spouse
	And Enters SSN as "<SSSN>" for Spouse
	And Clicks on next button				
	Then Application Summary Page is displayed to user 
	And Clicks on next button
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>" 
	And Clicks on Next and OK Button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	Then Authorize page details are displayed to user and confirm the term and conditions for Spouse
	And Clicks on next button
	Then Statement of Health page one is displayed to user and answeres as No for all questions on both pages for Self
  	Then Statement of Health page two is displayed to user and answeres as No for all questions on both pages for Self
	Then Statement of Health page one is displayed to user and answeres as No for all questions on both pages for Spouse
  	Then Statement of Health page two is displayed to user and answeres as No for all questions on both pages for Spouse
	Then Almost done page is displayed to user
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign																																	
	And Clicks on next button to finish
	Then Review and sign page details are displayed to user and Click on continue and attached the sign																																	
	And Clicks on next button to finish
	Then Your Insurance Request Decision Page is displayed to user	
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Selects Payment Method for TermLife								
	Then Selects Payment option as Bill Me								
	And Clicks on Save button								
	And Selects Frequency for Term Life Product "<Frequency>"								
	And Clicks on next button
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"

Examples: 
|Website|Title 	|Fname	|Lname		|State	 |DOB        |DOB1                  |DOB2                   |SDOB2                 |SDOB1		         |WorkHr	|Stitle	|Sfname		|Slname				|SDOB		|SWorkHr	|Cfname	|Clname	 |CDOB		            |CDOB1		            |CGender	|Benefit |Min_Term |Max_Term   |SBenefit	|SMin_Term|SMax_Term |CBenefit	|Bfname   |Blname |Relation |Desc |Perc |Bfname1|Blname1|Relation1	|Perc1	|SSN			|Mstatus	|Gender_Self|MemberId	    |Height |Weight|StreetAddress         |City   |ZipCode |PrimaryPhType|PrimaryPhNo  |Weight12mnths|Password|VPassword  |SSSN			|SHeight	|SWeight	|SGender	|SPhoneType	|SPhoneNum	|SCountry	|Frequency|DrivingLicenseNo|DrivingLicenseState|
|asce	|Mr.	|Pablo	|Snmmmmtee	|Missouri|05/21/2001 |SYSDate - 79Y/00M/00D |SYSDate - 50Y/11M/29D  |SYSDate - 50Y/11M/29D |SYSDate - 79Y/00M/00D |45		|Mrs.	|Quinlan	|Snmmmmtestcasesj	|01/17/1972	|30			|Henry  | Turner |SYSDate - 22Y/11M/29D |SYSDate - 25Y/00M/00D	|Male		|$20,000 |$20,000  |$1,000,000 | $250,000	|$20,000  |$1,000,000|10000	    |Scarlett |Turner |Other    |Maid |100  |Joseph |Turner |Son		|100	|990-06-7344	|Married	|Male	    |369856302147896|5.9    |180   | 1147, N Mckelvy Ave |Clovis |93611   |Mobile       |5298741369   |200		    |Adam@123|Adam@123   |040-00-0019	|5.4		|188		|Female		|Home		|2369856410	|Laos		|Quarterly|436566767       |Kansas             |


@AsceRegression_11
Scenario Outline: <ASCESC11> Application submission for Self, Spouse and Child with High-Limit DI (Bill Me-Quarterly) Beneficiaries - (Under HighADnD for Self & Spouse) - 1 Primary Trust, 4 Contingent Individual	
	
	Given Test set up for "NYL" feature and "NYL_ASCE" scenario	
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button	
	Then Eligibility page details are displayed to user 	
	Then Click on Self                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
	Then Click on Spouse
	And Click on Child    	
	Then Select NO for Association Membership
	And Validate that NEXT button is Disabled   
	Then Select YES Radio button of Membership
	And Validate that NEXT button is Enabled                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      	
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB1>", "<WorkHr>"
	And Enters Eligibility details for Spouse as "<STitle>","<Sfname>","<Slname>","<SDOB1>","<SWorkHr>"	
	And Select radio button NO for Spouse is Member	
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB1>","<CGender>"
	And Selects Married question as No for Child
	And Selects No for full time student for Child
	And Click on Add Child button on Screen
	And Clicks on next button	
	And Verify Available Product List TermLife,HII	
	And Clicks on Back or Previous button
	And Enters DOB for Self as "<DOB>" 	
	And Enters DOB for Spouse as "<SDOB>" 	
	And Clicks Edit button for Child Added	
	And Enters DOB for Child as "<CDOB>"	
	And Click on Add Child button on Screen
	And Enter New State as "<State1>"	
	And Clicks on next button	
	And Verify Available Product List TermLife,TenYTL,TwentyYTL	
	And Verify TermLife,TenYTL,TwentyYTL available for Spouse																									
	And Clicks on Back or Previous button
	And Enter New State as "<State>"	
	And Clicks on next button	
	Then Product page details are displayed to user
	And Verify Available Product List TermLife,TenYTL,TwentyYTL,HLDD,DII,HII
	And Verify TermLife,TenYTL,TwentyYTL available for Spouse	
	And Selects product HLDD for Self	
	And Selects product HLDD for Spouse	
	And Selects product HLDD for Child	
	And Clicks on button to Save for later
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>" 
	And Clicks OK Button Save For Later
	Then Refresh the browser
	Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive	
	And Clicks on next button	
	Then Request Coverage page is displayed to user 	
	And Selects Benefit Amount for Self as "<Benefit>" under HLDD
	And Validates Benefit Slider Range as "<Min_HLDD>" to "<Max_HLDD>" for Self under HLDD	
	And Selects Benefit Amount for Spouse as "<SBenefit>" under HLDD
	And Validates Benefit Slider Range as "<Min_HLDD1>" to "<Max_HLDD1>" for Spouse under HLDD		
	And Selects Benefit Amount for Child as "<CBenefit>" under HLDD	
	And Clicks on next button	
	Then Beneficiary Page is displayed to user	
	And Clicks on Add Beneficiary Button for Spouse under HLDD	
	Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
	And User Enters Beneficiary details as "<Trust>","<DateTrust>"	
	And Clicks on OK button	
	And Clicks on Add Beneficiary Button for Spouse under HLDD	
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relation>","<Perc>"	
	And Clicks on OK button	
	And Clicks on Add Beneficiary Button for Spouse under HLDD	
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname1>","<Blname1>","<Relation1>","<Perc1>"	
	And Clicks on OK button	
	And Clicks on Add Beneficiary Button for Spouse under HLDD	
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname2>","<Blname2>","<Relation2>","<Perc2>"	
	And Clicks on OK button	
	And Clicks on Add Beneficiary Button for Spouse under HLDD	
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname3>","<Blname3>","<Relation3>","<Perc3>"	
	And Clicks on OK button	
	And Clicks on Add Beneficiary Button for Self under HLDD	
	Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
	And Selects the First Option from Existing Beneficiaries List and select Type as "<BeneType1>" for Trust	
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under HLDD	
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons	
	And Selects the First Option from Existing Beneficiaries List and select Type as "<BeneType>"	
	And Enters Percentage for First Option as "<Perc4>"	
	And Clicks on OK button									
	And Clicks Delete button for first Individual and Contingent Beneficiary for Self under HLDD	
	And Delete box is displayed and clicks on Yes
	And Verify that Contingent Beneficiary is Deleted Successfully																									
	And Clicks on Add Beneficiary Button for Self under HLDD	
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons	
	And Selects the First Option from Existing Beneficiaries List and select Type as "<BeneType>"	
	And Enters Percentage for First Option as "<Perc4>"	
	And Clicks on OK button	
	And Clicks on Add Beneficiary Button for Self under HLDD	
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons	
	And Selects the Second Option from Existing Beneficiaries List and select Type as "<BeneType>"
	And Enters Percentage Second Option as "<Perc5>"	
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under HLDD	
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons	
	And Selects the Third Option from Existing Beneficiaries List and select Type as "<BeneType>"
	And Enters Percentage Third Option as "<Perc6>"	
	And Clicks on OK button	
	And Clicks on Add Beneficiary Button for Self under HLDD	
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And Selects the Fourth Option from Existing Beneficiaries List and select Type as "<BeneType>"
	And Enters Percentage Fourth Option as "<Perc7>"	
	And Clicks on OK button	
	And Clicks on next button	
	Then Contact Details page is displayed to user and enters contact Details for self as "<SSN>","<Mstatus>","<Gender_Self>","<MembershipID>","<Street>","<City>","<Zip>"
	And Validates Height and Weight is not displayed for Self
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects Residential Radio Button
	And Enters contact Details for Spouse as mimimum details "<SSSN>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>" 
	And Clicks on next button
	Then Application Summary Page is displayed to user 	
	And Clicks on next button	
	And Clicks on Payment Method for HLDD 
	Then Selects Payment option as Bill Me
	And Clicks on Save button
	And Selects Frequency for HLDD Product "<Frequency>"
	And Clicks on next button
	Then Authorize page details are displayed to user
	And Validates Consent message in Read and Sign Box for NonUW
	And Validates that Second I understand verbiage is not displayed in Read and Sign Box					
	And Validates that Authorization message is not displayed in Read and Sign Box					
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	Then Authorize page details are displayed to user and confirm the term and conditions for Spouse
   	And Clicks on next button 	
	Then Review and sign page details are displayed to user and Click on continue and attached the sign	
	And Clicks on next button to finish	
	Then Review and sign page details are displayed to user and Click on continue and attached the sign	
	And Clicks on next button to finish	
	Then Thank you page is displayed to user	
	And Verify that Confirmation number is generated for "<Website>"	
	
	
Examples:	
|Website |Title  |Fname  |Lname  |State1     |State    |DOB                  |DOB1                 |SDOB1                 |WorkHr |Stitle |Sfname   |Slname |SDOB                  |SWorkHr |Cfname    |Clname |CDOB                  |CGender |CDOB1                 |Benefit |Min_HLDD|Max_HLDD |SBenefit  |Min_HLDD1|Max_HLDD1 |CBenefit |Trust    |DateTrust |Bfname |Blname |Relation |Perc |Bfname1 |Blname1 |Relation1 |Perc1 |Bfname2 |Blname2 |Relation2 |Perc2 |Bfname3 |Blname3 |Relation3 |Perc3 |Perc4 |Perc5 |Perc6 |Perc7 |BeneType  |BeneType1|SSN         |Mstatus |Gender_Self|MembershipID    |Street                      |City      |Zip     |PrimaryPhType|PrimaryPhNo |SSSN        |Gender_Spouse |SPhoneType |SPhoneNum  |Password  |VPassword|Frequency|
|asce    |Mr.    |Samuel |Nelson |Washington |Colorado |SYSDate - 69Y/11M/29D|SYSDate - 71Y/00M/00D|SYSDate - 70Y/11M/29D |45     |Mrs.   |Victoria |Nelson |SYSDate - 43Y/11M/29D |30      |Sebastian |Nelson |SYSDate - 24Y/11M/29D |Male    |SYSDate - 25Y/00M/00D |$300,000|$50,000 | $500,000| $150,000 |$50,000  |$250,000  |10000    |CAT Comp |10/11/2017|Aria   |Nelson |Daughter |10   |Grace   |Nelson  |Daughter  |10    |Chloe   |Nelson  |Mother    |70    |David   |Nelson  |Father    |10    |40    |30    |20    |10    |Contingent|Primary  |259-46-8510 |Married |Male       |669988774455661 |5555 E Briarwood Ave, #1203 |Littleton | 80122  |Mobile       |9869433221  |269-47-3012 |Female        |Home       |7896541230 |Adam@123	|Adam@123 |Quarterly|
	 
	
@AsceRegression_12	
Scenario Outline: <ASCESC12> Application Submission for Spouse and Child with Hospital Indemnity Beneficiaries - NO

	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user 
	Then Click on Spouse
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	And Select YES Radio button of Membership
	And Enters Eligibility details for Spouse as "<STitle>","<Sfname>","<Slname>","<SDOB1>","<SWorkHr>"	
	And Select radio button Yes for Spouse is Member
	And Click on Child
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB1>","<CSex>"
	And Selects Married question as No for Child
	And Selects No for full time student for Child
	And Click on Add Child button on Screen
	And Clicks on next button
	And Validate Age Restriction Message
	And Enters DOB for Spouse as "<SDOB>" 
	And Clicks Edit button for Child Added	
	And Enters DOB for Child as "<CDOB>"	
	And Click on Add Child button on Screen
	And Enter New State as "<State1>"
	And Clicks on next button
	And Validate Age Restriction Message
	And Enter New State as "<State>"
	And Clicks on next button
	And Selects product HII for Spouse
	And Selects product HII for Child
	And Clicks on next button
	Then Request Coverage page is displayed to user 
	And Selects Benefit Amount for Spouse as "<SBenefit>" under HII
	And Validates under HII the Benefit Amounts for Spouse Listed are:"<HII_Samount1>","<HII_Samount2>","<HII_Samount3>","<HII_Samount4>","<HII_Samount5>"
	And Selects Benefit Amount for Child as "<CBenefit>" under HII	
	And Validates under HII the Benefit Amounts for Child Listed are:"<HII_amount1>","<HII_amount2>","<HII_amount3>","<HII_amount4>","<HII_amount5>"
	And Clicks on next button
	Then Contact Details page is displayed to user
	And Enters Contact Details for Self without SSN ,Height and Weight as "<Mstatus>","<Gender_Self>","<MembershipID>","<Street>","<City>","<Zip>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects Residential Radio Button 
	And Enters contact Details for Spouse as mimimum details "<SSSN>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>" 
	And Clicks on next button
	And Validates SSN Required Error Message for Self
	And Enters SSN "<SSN>" for Self			
	And Clicks on next button			
	Then Application Summary Page is displayed to user
	And Clicks on next button
	And Clicks on Payment Method for HII 
	Then Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for HII Product "<Frequency>"
	And Confirms I have read the Information Check Box on Payment Page
	And Clicks on next button
	Then Authorize page details are displayed to user
	And Validates Consent message in Read and Sign Box for NonUW
	And Validates that Second I understand verbiage is not displayed in Read and Sign Box					
	And Validates that Authorization message is not displayed in Read and Sign Box
	And Verify Supplemental Health Note in Authorization Page
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
|Website |Title  |Fname       |Lname   |State    |State1  |DOB                   |WorkHr |Stitle |Sfname   |Slname |SDOB                  |SWorkHr |SDOB1                 |Cfname |Clname |CGender |CDOB                  |CDOB1                 |SBenefit |CBenefit |SSN         |Mstatus |MembershipID    |Gender_Self |Street                |City   |Zip     |PrimaryPhType|PrimaryPhNo |SSSN        |MembershipID    |Gender_Spouse |SPhoneType |SPhoneNum  |Bank        |AccName      |Rnum      |Anum              |Frequency|HII_Samount1|HII_Samount2|HII_Samount3|HII_Samount4|HII_Samount5|HII_amount1|HII_amount2 |HII_amount3 |HII_amount4|HII_amount5|
|asce    |Mr.    |Christopher |Brooks  |Illinois |Florida |SYSDate - 45Y/11M/29D |45     |Mrs.   |Penelope |Brooks |SYSDate - 78Y/11M/29D |45      |SYSDate - 80Y/00M/00D |Ryan   |Brooks |Female  |SYSDate - 25Y/11M/29D |SYSDate - 26Y/00M/00D |400      |100      |579851645   |Married |275694110036988 |Male        |36707,N Old Woods Trl |Gurnee |60031   |Mobile       |6655447788  |111-22-4444 |456987125489630 |Female        |Home       |3322116655 |Baroda Bank |Chris Brooks |219634598 |77889944556611223 |Monthly  |$100        |$200        |$300        |$400        |$500        |$100       |$200        |$300        |$400       |$500        |
	
@AsceRegression_13	
Scenario Outline: <ASCESC13> Validation Read & Sign Page with 20 different States one by one in loop
	Given Test set up for "NYL" feature and "NYL_ASE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Click on Self   
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	And Select YES Radio button of Membership                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
	And Clicks on next button
	And Selects product TermLife for Self
	And Selects product TenYTL for Self
	And Selects product TwentyYTL for Self
	And Selects product HLDD for Self
	And Selects product DII for Self
	And Selects product HII for Self
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	And Enters Monthly Income for Self as "<MonthlyIncome>"
	Then Selects Answer as No for all Group Disability Insurance for Self
	And Clicks on next button
	And Selects Benefit Amount for Self as "<Benefit>" under TermLife
	And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
	And Selects Benefit Amount for Self as "<Benefit2>" under TwentyYTL
	And Selects Benefit Amount for Self as "<Benefit3>" under HLDD
	And Selects Monthly Benefit Amount for Self as "<Benefit4>" under DII
	And Selects Waiting Period for Self as "<WaitPeriod>" under DII
	And Selects Benefit Option for Self as "<BenOpt>" under DII
	And Selects Benefit Amount for Self as "<Benefit5>" under HII
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Add Beneficiary Button for Self under TermLife
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relation>","<Percen>"
	And Clicks on OK button
	And Clicks on Skip Beneficiary Button					
	And Delete box is displayed and clicks on Yes
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No Radio button for Tobacco Question Self 
	And Selects No for Travel Question Non QD for Self 
	And Selects Residential Radio Button
	And Selects Yes Radio Button for Business Address
	And Enters Business Details as "<BusinessName>","<BusinessType>"
	And Clicks on next button
	Then Application Summary Page is displayed to user 
	And Clicks on next button
	Then Payment page details are displayed to user and skip payment
	 Then Authorize page details are displayed to user 	 
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
	Then Payment page details are displayed to user and skip payment			
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
	Then Payment page details are displayed to user and skip payment							
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
	Then Payment page details are displayed to user and skip payment			
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
	Then Payment page details are displayed to user and skip payment			
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
	Then Payment page details are displayed to user and skip payment			
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
	Then Payment page details are displayed to user and skip payment				
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
	Then Payment page details are displayed to user and skip payment								
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
	Then Payment page details are displayed to user and skip payment				
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
	Then Payment page details are displayed to user and skip payment				
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
	Then Payment page details are displayed to user and skip payment			
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
	Then Payment page details are displayed to user and skip payment							
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
	Then Payment page details are displayed to user and skip payment							
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
	Then Payment page details are displayed to user and skip payment			
	And Validate Fraud Notice NY in Read and Sign Box					
	And Navigate back to Eligibility page					
	And Enter New State as "<State14>"					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	Then Payment page details are displayed to user and skip payment			
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
	Then Payment page details are displayed to user and skip payment				
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
	Then Payment page details are displayed to user and skip payment				
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
	Then Payment page details are displayed to user and skip payment				
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
	Then Payment page details are displayed to user and skip payment				
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
	Then Payment page details are displayed to user and skip payment				
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
	Then Payment page details are displayed to user and skip payment				
	And Validate Fraud Notice NM in Read and Sign Box
	And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario1>","<pdfEnable>","<pdfName1>"
	
Examples:
|Website |Title  |Fname  |Lname    |WorkHr |State    |DOB                   |MonthlyIncome |Benefit  |Benefit1 |Benefit2 |Benefit3 |WaitPeriod |Benefit4 |BenOpt                 |Benefit5 |Bfname |Blname |Relation |Percen |SSN         |Mstatus |Height |Weight |MemberId        |Gender_Self|StreetAddress  |City       |Zip   |PrimaryPhType|PrimaryPhNo  |BusinessName |BusinessType|State1     |State2  |State3    |State4    |State5        |State6        |State7    |State8               |State9  |State10 |State11 |State12    |State13  |State14   |State15     |State16    |State17    |State18  |State19 |State20    |pdfScenario|pdfScenario1|pdfEnable|pdfName                               |pdfName1                   |
|asce    |Mr.    |Nathan |Collins  |45     |Colorado |SYSDate - 35Y/11M/29D |$10,000       |$300,000 |$760,000 |$710,000 |$150,000 |30 Days    |$1,200   |Option B (Career Plan) |400      |Layla  |Collins|Spouse   |100    |553-43-4348 |Single  |6.0    |180    |545345343543543 |Male       |main st        |providence |00001 |Mobile       |5343545436   |Gill company |Corporation |California |Alabama |Arkansas  |Louisiana |Pennsylvania  |Rhode Island  |Maryland  |District of Columbia |Florida |Kansas  |Maine   |New Jersey |New York |Oklahoma  |Puerto Rico |Tennessee  |Washington |Virginia |Wyoming |New Mexico |ASCE13_WM  |ASCE13_NM   |1        |Important Notice All except NM 2 08.12|Important Notice NM 2 08.12|
	

@AsceRegression_14
Scenario Outline: <SC14_1>Complete work flow of application Self only  with Term Life Insurance 
     
	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	Then Click on Self
	Then Select YES Radio button of Membership
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	And Clicks on next button
	Then Product page details are displayed to user
	Then Selects product TermLife for Self
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under TermLife
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Skip Beneficiary Button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Select DrivingLicense Question as Yes and Enters details for driving info for Self as "<DrivingLicenseNo>","<DrivingLicenseState>"
	And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No Radio button for Tobacco Question Self
	And Selects No for Travel Question QD for Self
	And Selects Residential Radio Button
	And Clicks on next button
	Then Application Summary Page is displayed to user
	And Clicks on next button
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>"
	And Clicks on Next and OK Button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	And Clicks on next button
	Then Statement of Health page one is displayed to user and answeres as No for all questions on both pages for Self
	Then Statement of Health page two is displayed to user and answeres as No for all questions on both pages for Self
	Then Almost done page is displayed to user
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Payment Authorization Letter is displayed to user and clicks on Continue
	And Signs Payment Authorization Letter
	And Clicks on next button to finish
	Then Your Insurance Request Decision Page is displayed to user
	And Clicks on next button
	Then Payment page details are displayed to user and skip payment
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"
	

Examples:
|Website |Title  |Fname |Lname            |State      |DOB        |WorkHr   |Benefit  |Weight12mnths |SSN         |Mstatus |Gender_Self |MemberId        |Height |Weight |StreetAddress  |City       |Zip    |DrivingLicenseNo|DrivingLicenseState|PrimaryPhType|PrimaryPhNo|Password |VPassword|
|asce    |Mr.    |Jack  |Snmmmmtestcasejm |California |02/06/1977 |45       |$250,000 |  220         |990-06-7737 |Married |Male        |545245343568543 |6.0    |200    |107 S 9th St   |Louisburg  |14845  |5467676778      |Kansas             |Mobile       |1234567890 |Adam@123 |Adam@123 |
	
@AsceRegression_15
Scenario Outline: <SC14_2>Complete work flow of application Self only  with Term Life Insurance 
     
	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	Then Click on Self
	Then Select YES Radio button of Membership
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	And Clicks on next button
	Then Product page details are displayed to user
	Then Selects product TermLife for Self
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under TermLife
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Skip Beneficiary Button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Select DrivingLicense Question as Yes and Enters details for driving info for Self as "<DrivingLicenseNo>","<DrivingLicenseState>"
	And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No Radio button for Tobacco Question Self
	And Selects No for Travel Question QD for Self
	And Selects Residential Radio Button
	And Clicks on next button
	Then Application Summary Page is displayed to user
	And Clicks on next button
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>"
	And Clicks on Next and OK Button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	And Clicks on next button
	Then Statement of Health page one is displayed to user and answeres as No for all questions on both pages for Self
	Then Statement of Health page two is displayed to user and answeres as No for all questions on both pages for Self
	Then Almost done page is displayed to user
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Payment Authorization Letter is displayed to user and clicks on Continue
	And Signs Payment Authorization Letter
	And Clicks on next button to finish
	Then Your Insurance Request Decision Page is displayed to user
	And Clicks on next button
	Then Payment page details are displayed to user and skip payment
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"
	

Examples:
|Website |Title  |Fname |Lname            |State       |DOB        |WorkHr   |Benefit  |Weight12mnths |SSN         |Mstatus |Gender_Self |MemberId        |Height |Weight |StreetAddress  |City       |Zip    |DrivingLicenseNo|DrivingLicenseState|PrimaryPhType|PrimaryPhNo|Password |VPassword|
|asce    |Mr.    |Jack  |Snmmmmtestcasejm |Connecticut |02/06/1977 |45       |$250,000 |  220         |990-06-7737 |Married |Male        |545245343568543 |6.0    |200    |107 S 9th St   |Louisburg  |14845  |5467676778      |Kansas             |Mobile       |1234567890 |Adam@123 |Adam@123 |

@AsceRegression_16
Scenario Outline: <SC14_3>Complete work flow of application Self only  with Term Life Insurance 
     
	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	Then Click on Self
	Then Select YES Radio button of Membership
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	And Clicks on next button
	Then Product page details are displayed to user
	Then Selects product TermLife for Self
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under TermLife
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Skip Beneficiary Button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Select DrivingLicense Question as Yes and Enters details for driving info for Self as "<DrivingLicenseNo>","<DrivingLicenseState>"
	And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No Radio button for Tobacco Question Self
	And Selects No for Travel Question QD for Self
	And Selects Residential Radio Button
	And Clicks on next button
	Then Application Summary Page is displayed to user
	And Clicks on next button
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>"
	And Clicks on Next and OK Button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	And Clicks on next button
	Then Statement of Health page one is displayed to user and answeres as No for all questions on both pages for Self
	Then Statement of Health page two is displayed to user and answeres as No for all questions on both pages for Self
	Then Almost done page is displayed to user
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Payment Authorization Letter is displayed to user and clicks on Continue
	And Signs Payment Authorization Letter
	And Clicks on next button to finish
	Then Your Insurance Request Decision Page is displayed to user
	And Clicks on next button
	Then Payment page details are displayed to user and skip payment
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"
	

Examples:
|Website |Title  |Fname |Lname            |State       |DOB        |WorkHr   |Benefit  |Weight12mnths |SSN         |Mstatus |Gender_Self |MemberId        |Height |Weight |StreetAddress  |City       |Zip    |DrivingLicenseNo|DrivingLicenseState|PrimaryPhType|PrimaryPhNo|Password |VPassword|
|asce    |Mr.    |Jack  |Snmmmmtestcasejm |Pennsylvania|02/06/1977 |45       |$250,000 |  220         |990-06-7737 |Married |Male        |545245343568543 |6.0    |200    |107 S 9th St   |Louisburg  |14845  |5467676778      |Kansas             |Mobile       |1234567890 |Adam@123 |Adam@123 |

@AsceRegression_17
Scenario Outline: <SC14_4>Complete work flow of application Self only  with Term Life Insurance 
     
	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	Then Click on Self
	Then Select YES Radio button of Membership
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	And Clicks on next button
	Then Product page details are displayed to user
	Then Selects product TermLife for Self
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under TermLife
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Skip Beneficiary Button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Select DrivingLicense Question as Yes and Enters details for driving info for Self as "<DrivingLicenseNo>","<DrivingLicenseState>"
	And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No Radio button for Tobacco Question Self
	And Selects No for Travel Question QD for Self
	And Selects Residential Radio Button
	And Clicks on next button
	Then Application Summary Page is displayed to user
	And Clicks on next button
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>"
	And Clicks on Next and OK Button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	And Clicks on next button
	Then Statement of Health page one is displayed to user and answeres as No for all questions on both pages for Self
	Then Statement of Health page two is displayed to user and answeres as No for all questions on both pages for Self
	Then Almost done page is displayed to user
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Payment Authorization Letter is displayed to user and clicks on Continue
	And Signs Payment Authorization Letter
	And Clicks on next button to finish
	Then Your Insurance Request Decision Page is displayed to user
	And Clicks on next button
	Then Payment page details are displayed to user and skip payment
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"
	

Examples:
|Website |Title  |Fname |Lname            |State     |DOB        |WorkHr   |Benefit  |Weight12mnths |SSN         |Mstatus |Gender_Self |MemberId        |Height |Weight |StreetAddress  |City       |Zip    |DrivingLicenseNo|DrivingLicenseState|PrimaryPhType|PrimaryPhNo|Password |VPassword|
|asce    |Mr.    |Jack  |Snmmmmtestcasejm |Wisconsin |02/06/1977 |45       |$250,000 |  220         |990-06-7737 |Married |Male        |545245343568543 |6.0    |200    |107 S 9th St   |Louisburg  |14845  |5467676778      |Kansas             |Mobile       |1234567890 |Adam@123 |Adam@123 |

@AsceRegression_18
Scenario Outline: <SC14_5>Complete work flow of application Self only  with Term Life Insurance 
     
	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	Then Click on Self
	Then Select YES Radio button of Membership
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	And Clicks on next button
	Then Product page details are displayed to user
	Then Selects product TermLife for Self
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under TermLife
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Skip Beneficiary Button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Select DrivingLicense Question as Yes and Enters details for driving info for Self as "<DrivingLicenseNo>","<DrivingLicenseState>"
	And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No Radio button for Tobacco Question Self
	And Selects No for Travel Question QD for Self
	And Selects Residential Radio Button
	And Clicks on next button
	Then Application Summary Page is displayed to user
	And Clicks on next button
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>"
	And Clicks on Next and OK Button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	And Clicks on next button
	Then Statement of Health page one is displayed to user and answeres as No for all questions on both pages for Self
	Then Statement of Health page two is displayed to user and answeres as No for all questions on both pages for Self
	Then Almost done page is displayed to user
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Payment Authorization Letter is displayed to user and clicks on Continue
	And Signs Payment Authorization Letter
	And Clicks on next button to finish
	Then Your Insurance Request Decision Page is displayed to user
	And Clicks on next button
	Then Payment page details are displayed to user and skip payment
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"
	

Examples:
|Website |Title  |Fname |Lname            |State   |DOB        |WorkHr   |Benefit  |Weight12mnths |SSN         |Mstatus |Gender_Self |MemberId        |Height |Weight |StreetAddress  |City       |Zip    |DrivingLicenseNo|DrivingLicenseState|PrimaryPhType|PrimaryPhNo|Password |VPassword|
|asce    |Mr.    |Jack  |Snmmmmtestcasejm |Vermont |02/06/1977 |45       |$250,000 |  220         |990-06-7737 |Married |Male        |545245343568543 |6.0    |200    |107 S 9th St   |Louisburg  |14845  |5467676778      |Kansas             |Mobile       |1234567890 |Adam@123 |Adam@123 |

@AsceRegression_19
Scenario Outline: <SC14_6>Complete work flow of application Self only  with Term Life Insurance 
     
	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	Then Click on Self
	Then Select YES Radio button of Membership
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	And Clicks on next button
	Then Product page details are displayed to user
	Then Selects product TermLife for Self
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under TermLife
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Skip Beneficiary Button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Select DrivingLicense Question as Yes and Enters details for driving info for Self as "<DrivingLicenseNo>","<DrivingLicenseState>"
	And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No Radio button for Tobacco Question Self
	And Selects No for Travel Question QD for Self
	And Selects Residential Radio Button
	And Clicks on next button
	Then Application Summary Page is displayed to user
	And Clicks on next button
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>"
	And Clicks on Next and OK Button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	And Clicks on next button
	Then Statement of Health page one is displayed to user and answeres as No for all questions on both pages for Self
	Then Statement of Health page two is displayed to user and answeres as No for all questions on both pages for Self
	Then Almost done page is displayed to user
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Payment Authorization Letter is displayed to user and clicks on Continue
	And Signs Payment Authorization Letter
	And Clicks on next button to finish
	Then Your Insurance Request Decision Page is displayed to user
	And Clicks on next button
	Then Payment page details are displayed to user and skip payment
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"
	

Examples:
|Website |Title  |Fname |Lname            |State         |DOB        |WorkHr   |Benefit  |Weight12mnths |SSN         |Mstatus |Gender_Self |MemberId        |Height |Weight |StreetAddress  |City       |Zip    |DrivingLicenseNo|DrivingLicenseState|PrimaryPhType|PrimaryPhNo|Password |VPassword|
|asce    |Mr.    |Jack  |Snmmmmtestcasejm |New Hampshire |02/06/1977 |45       |$250,000 |  220         |990-06-7737 |Married |Male        |545245343568543 |6.0    |200    |107 S 9th St   |Louisburg  |14845  |5467676778      |Kansas             |Mobile       |1234567890 |Adam@123 |Adam@123 |

@AsceRegression_20
Scenario Outline: <SC14_7>Complete work flow of application Self only  with Term Life Insurance 
     
	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	Then Click on Self
	Then Select YES Radio button of Membership
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	And Clicks on next button
	Then Product page details are displayed to user
	Then Selects product TermLife for Self
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under TermLife
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Skip Beneficiary Button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Select DrivingLicense Question as Yes and Enters details for driving info for Self as "<DrivingLicenseNo>","<DrivingLicenseState>"
	And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No Radio button for Tobacco Question Self
	And Selects No for Travel Question QD for Self
	And Selects Residential Radio Button
	And Clicks on next button
	Then Application Summary Page is displayed to user
	And Clicks on next button
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>"
	And Clicks on Next and OK Button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	And Clicks on next button
	Then Statement of Health page one is displayed to user and answeres as No for all questions on both pages for Self
	Then Statement of Health page two is displayed to user and answeres as No for all questions on both pages for Self
	Then Almost done page is displayed to user
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Payment Authorization Letter is displayed to user and clicks on Continue
	And Signs Payment Authorization Letter
	And Clicks on next button to finish
	Then Your Insurance Request Decision Page is displayed to user
	And Clicks on next button
	Then Payment page details are displayed to user and skip payment
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"
	

Examples:
|Website |Title  |Fname |Lname            |State    |DOB        |WorkHr   |Benefit  |Weight12mnths |SSN         |Mstatus |Gender_Self |MemberId        |Height |Weight |StreetAddress  |City       |Zip    |DrivingLicenseNo|DrivingLicenseState|PrimaryPhType|PrimaryPhNo|Password |VPassword|
|asce    |Mr.    |Jack  |Snmmmmtestcasejm |Missouri |02/06/1977 |45       |$250,000 |  220         |990-06-7737 |Married |Male        |545245343568543 |6.0    |200    |107 S 9th St   |Louisburg  |14845  |5467676778      |Kansas             |Mobile       |1234567890 |Adam@123 |Adam@123 |

@AsceRegression_21
Scenario Outline: <SC14_8>Complete work flow of application Self only  with Term Life Insurance 
     
	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	Then Click on Self
	Then Select YES Radio button of Membership
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	And Clicks on next button
	Then Product page details are displayed to user
	Then Selects product TermLife for Self
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under TermLife
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Skip Beneficiary Button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Select DrivingLicense Question as Yes and Enters details for driving info for Self as "<DrivingLicenseNo>","<DrivingLicenseState>"
	And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No Radio button for Tobacco Question Self
	And Selects No for Travel Question QD for Self
	And Selects Residential Radio Button
	And Clicks on next button
	Then Application Summary Page is displayed to user
	And Clicks on next button
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>"
	And Clicks on Next and OK Button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	And Clicks on next button
	Then Statement of Health page one is displayed to user and answeres as No for all questions on both pages for Self
	Then Statement of Health page two is displayed to user and answeres as No for all questions on both pages for Self
	Then Almost done page is displayed to user
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Payment Authorization Letter is displayed to user and clicks on Continue
	And Signs Payment Authorization Letter
	And Clicks on next button to finish
	Then Your Insurance Request Decision Page is displayed to user
	And Clicks on next button
	Then Payment page details are displayed to user and skip payment
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"
	

Examples:
|Website |Title  |Fname |Lname            |State          |DOB        |WorkHr   |Benefit  |Weight12mnths |SSN         |Mstatus |Gender_Self |MemberId        |Height |Weight |StreetAddress  |City       |Zip    |DrivingLicenseNo|DrivingLicenseState|PrimaryPhType|PrimaryPhNo|Password |VPassword|
|asce    |Mr.    |Jack  |Snmmmmtestcasejm |North Carolina |02/06/1977 |45       |$250,000 |  220         |990-06-7737 |Married |Male        |545245343568543 |6.0    |200    |107 S 9th St   |Louisburg  |14845  |5467676778      |Kansas             |Mobile       |1234567890 |Adam@123 |Adam@123 |

@AsceRegression_22
Scenario Outline: <SC14_2>Complete work flow of application Self only  with Term Life Insurance 
     
	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	Then Click on Self
	Then Select YES Radio button of Membership
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	And Clicks on next button
	Then Product page details are displayed to user
	Then Selects product TermLife for Self
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under TermLife
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Skip Beneficiary Button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Select DrivingLicense Question as Yes and Enters details for driving info for Self as "<DrivingLicenseNo>","<DrivingLicenseState>"
	And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No Radio button for Tobacco Question Self
	And Selects No for Travel Question QD for Self
	And Selects Residential Radio Button
	And Clicks on next button
	Then Application Summary Page is displayed to user
	And Clicks on next button
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>"
	And Clicks on Next and OK Button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	And Clicks on next button
	Then Statement of Health page one is displayed to user and answeres as No for all questions on both pages for Self
	Then Statement of Health page two is displayed to user and answeres as No for all questions on both pages for Self
	Then Almost done page is displayed to user
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Payment Authorization Letter is displayed to user and clicks on Continue
	And Signs Payment Authorization Letter
	And Clicks on next button to finish
	Then Your Insurance Request Decision Page is displayed to user
	And Clicks on next button
	Then Payment page details are displayed to user and skip payment
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"
	

Examples:
|Website |Title  |Fname |Lname            |State     |DOB        |WorkHr   |Benefit  |Weight12mnths |SSN         |Mstatus |Gender_Self |MemberId        |Height |Weight |StreetAddress  |City       |Zip    |DrivingLicenseNo|DrivingLicenseState|PrimaryPhType|PrimaryPhNo|Password |VPassword|
|asce    |Mr.    |Jack  |Snmmmmtestcasejm |Minnesota |02/06/1977 |45       |$250,000 |  220         |990-06-7737 |Married |Male        |545245343568543 |6.0    |200    |107 S 9th St   |Louisburg  |14845  |5467676778      |Kansas             |Mobile       |1234567890 |Adam@123 |Adam@123 |

@AsceRegression_23
Scenario Outline: <SC14_10>Complete work flow of application Self only  with Term Life Insurance 
     
	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	Then Click on Self
	Then Select YES Radio button of Membership
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	And Clicks on next button
	Then Product page details are displayed to user
	Then Selects product TermLife for Self
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under TermLife
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Skip Beneficiary Button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Select DrivingLicense Question as Yes and Enters details for driving info for Self as "<DrivingLicenseNo>","<DrivingLicenseState>"
	And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No Radio button for Tobacco Question Self
	And Selects No for Travel Question QD for Self
	And Selects Residential Radio Button
	And Clicks on next button
	Then Application Summary Page is displayed to user
	And Clicks on next button
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>"
	And Clicks on Next and OK Button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	And Clicks on next button
	Then Statement of Health page one is displayed to user and answeres as No for all questions on both pages for Self
	Then Statement of Health page two is displayed to user and answeres as No for all questions on both pages for Self
	Then Almost done page is displayed to user
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Payment Authorization Letter is displayed to user and clicks on Continue
	And Signs Payment Authorization Letter
	And Clicks on next button to finish
	Then Your Insurance Request Decision Page is displayed to user
	And Clicks on next button
	Then Payment page details are displayed to user and skip payment
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"
	

Examples:
|Website |Title  |Fname |Lname            |State       |DOB        |WorkHr   |Benefit  |Weight12mnths |SSN         |Mstatus |Gender_Self |MemberId        |Height |Weight |StreetAddress  |City       |Zip    |DrivingLicenseNo|DrivingLicenseState|PrimaryPhType|PrimaryPhNo|Password |VPassword|
|asce    |Mr.    |Jack  |Snmmmmtestcasejm |Maryland    |02/06/1977 |45       |$250,000 |  220         |990-06-7737 |Married |Male        |545245343568543 |6.0    |200    |107 S 9th St   |Louisburg  |14845  |5467676778      |Kansas             |Mobile       |1234567890 |Adam@123 |Adam@123 |

	