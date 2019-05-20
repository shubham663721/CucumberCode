Feature: Abe Test

@AbeRegression_1
Scenario Outline:<ABESC01>	Member only 5 YTL (Primary & Beneficiary and Contingent Trust)  Place of Residence: New York Verify NY Imp.Replacement Information																																
	Given Test set up for "NYL" feature and "NYL_ABE" scenario																																	
	Given Customer navigate to NYL "<Website>"																																	
	When Clicks on Apply now button																																	
	Then Scroll down and click on I Attest To Having Read the Above Information button	
	Then Click on Self																																
	Then Select YES Radio button of Membership
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<Workhr>"																																															
	And Clicks on next button
	And Verify that error message is displayed for state eligibility at top of the page
	And Enter New State as "<State1>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Clicks on Back or Previous button	
	And Enters DOB for Self as "<DOB1>"
	And Clicks on next button
	And Validate Age Restriction Message
	And Enters DOB for Self as "<DOB>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Clicks on next button
	And Validate Error Message on Product Page																																	
	And Selects product FiveYTL for Self
	And Verify Available Product List FiveYTL,TenYTL,TwentyYTL,ADD,LTDPlus,LTD,MTD,RTDI,PO,HO,CI
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	And Clicks on next button
	Then Validate error message for required question
	And Confirms Imp Replacement Info for NewYork state	
	And Clicks on next button
	Then Request Coverage page is displayed to user	
	And Selects Chronic Illness Rider for FiveYTL Product Self
	And Verify that Quick Decision is Unavailable for FiveYTL Self
	And Deselects Chronic Illness Rider for FiveYTL self
	And Verify that Quick Decision is Available for FiveYTL Self
	And Clicks on Back or Previous button
	Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Self
	And Enter additional details as "<Tamount>","<Iamount>","<Company>"
	And Clicks on next button 
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under FiveYTL
	And Validates under FiveYTL the Benefit Slider Range as "<Min_Five>" to "<Max_Five>"
	And Clicks on next button																																	
	Then Beneficiary Page is displayed to user																																	
	And Clicks on Add Beneficiary button for Self																																	
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons																																	
	And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relationship>","<Perc>"																																	
	And Clicks on OK button																																	
	And Clicks on Add Beneficiary button for Self																																	
	Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons																																	
	And User Enters Beneficiary details as "<Trust>","<Datetrust>"																																	
	And Clicks on OK button	
	And Delete Contingent Beneficiary 
	And Delete box is displayed and clicks on Yes
	And Clicks on next button	
	Then Contact page details are displayed to user and validate details
	And Validate the Travel Question for Non QD application for Self
	Then Enters contact Details for Self without MemberShipID as "<SSN_Self>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<StreetAddress>","<City>","<Zip>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects Yes Radio button for Tobacco Question 
	And Validates Last Used Date Textbox and Specify the products used Textbox is displayed
	And Selects No Radio button for Tobacco Question Self 
	And Selects No for Travel Question Non QD for Self
	And Selects Residential Radio Button
	And Clicks on next button
	And Validates Membership ID Required Message
	And Enters Membership ID as "<MemberId>" for Self
	And Clicks on next button																																
	Then Application Summary Page is displayed to user
	And Verify Benefit Amount for Self as "<Benefit>" under FiveYTL																																
	And Clicks on next button
	Then Payment Information Page is displayed to user and user Selects Payment option as Bank for FiveYTL Product																																	
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"																																	
	And Clicks on Save button																																	
	And Selects Frequency for FiveYTL Product and reviews "<Frequency>"
	And Verify Premium Rates
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
	And Verify PDF information as "<pdfScenario>","<pdfEnable>"
	
Examples: 
|Website|Title |Fname   |Lname |State |DOB                |Workhr|State1  | DOB1                |Tamount|Iamount|Company| Benefit   |Min_Five|Max_Five  |Bfname |Blname |Relationship |Perc |Trust  |Datetrust           |SSN_Self |Mstatus  |Height|Weight |Gender_self  |MemberId|StreetAddress   |City     |Zip    |PrimaryPhType|PrimaryPhNo  |Bank    |AccName|Rnum     |Anum  |Frequency|pdfEnable|						
|abe    |Mr.   |Chandler|Bing  |Guam  |SYSDate - 25Y/0M/0D|45    |New York|SYSDate -16Y/11M/30D |2000   |2000   |ABCD   | $500,000  |$20,000 |$2,000,000|Monica |Geller | Spouse      |100  |Bright |SYSDate - 25Y/0M/0D |000000777|Married  | 5.5  | 188   |Male         |322424  |70 Grove St #03 |New York |10014  |Mobile       |1234567898   |ABC Bank|GHF    |242342256|353455|Monthly  | 0       |						




@AbeRegression_2
Scenario Outline:<ABESC02>Application Submission for Self  only with 50+ TL (Max of primary and contingent individual Beneficiary)    

	Given Test set up for "NYL" feature and "NYL_ABE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Scroll down and click on I Attest To Having Read the Above Information button
	Then Click on Self
	Then Select YES Radio button of Membership 
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"  
	And Clicks on next button
	And Validate Age Restriction Message
	And Enters DOB for Self as "<DOB1>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Selects product FiftyYTL for Self
	And Verify Available Product List FiveYTL,TenYTL,FiftyMBTL,ADD,LTDPlus,LTD,MTD,RTDI,PO,HMI
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self	
	And Clicks on next button
	Then Request Coverage page is displayed to user 
	And Selects Benefit Amount for Self as "<Benefit>" under FiftyYTL
	And Validates under FiftyYTL the Benefit Slider Range as "<Min_Fifty>" to "<Max_Fifty>"	
	And Clicks on next button
	Then Beneficiary Page is displayed to user
 	 And Clicks on Add Beneficiary button for Self
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
	And Clicks on OK button
	And Clicks on Add Beneficiary button for Self
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname1>","<Blname2>","<Relationship1>","<Perc1>"
	And Clicks on OK button
	And Clicks on Add Beneficiary button for Self
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname2>","<Blname2>","<Relationship2>","<Perc2>"
	And Clicks on OK button
	And Clicks on Add Beneficiary button for Self
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship as other "<Bname3>","<Blname3>","<Relationship3>","<Perc3>","<Desc3>" 
	And Clicks on OK button
	And Clicks on Add Beneficiary button for Self
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship as other "<Bname4>","<Blname4>","<Relationship4>","<Perc4>","<Desc4>" 
	And Clicks on OK button
	And Clicks on Add Beneficiary button for Self
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname5>","<Blname5>","<Relationship5>","<Perc5>"
	And Clicks on OK button
	And Clicks on Add Beneficiary button for Self
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname6>","<Blname6>","<Relationship6>","<Perc6>"
	And Clicks on OK button
	And Clicks on Add Beneficiary button for Self
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname7>","<Blname7>","<Relationship7>","<Perc7>"
	And Clicks on OK button
	And Clicks on next button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN_Self>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Validate the Travel Question for Non QD application for Self
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects Yes for Travel Question Non QD for Self 
	And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>"
	And Selects Yes Radio button for Tobacco Question 
	And Validates Last Used Date Textbox and Specify the products used Textbox is displayed
	And Enters Last Used Tobacco Date Details for Self as "<TobDate>"
	And Clicks on Products used textbox for Self and Selects Product as "<Product>"
	And Selects Residential Radio Button
	And Clicks on next button	
	Then Application Summary Page is displayed to user
	And Clicks on next button
	Then Payment Information Page is displayed to user And Selects Payment Method for FiftyYTL 
	And Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for Fifty Year Product "<Frequency>"
	And Verify Premium Rates
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
	And Verify PDF information as "<pdfScenario>","<pdfEnable>"
	

Examples:
|Website |Title |Fname  |Lname    |State   |DOB                 |WorkHr | DOB1              |Benefit |Min_Fifty|Max_Fifty|  Bname | Blname |Relationship| Perc| Bname1 | Blname1 |Relationship1| Perc1| Bname2 | Blname2 |Relationship2| Perc2| Bname3 | Blname3 |Relationship3| Perc3|Desc3  | Bname4 | Blname4 |Relationship4| Perc4|Desc4      | Bname5 | Blname5 |Relationship5| Perc5| Bname6 | Blname6 |Relationship6| Perc6| Bname7 | Blname7 |Relationship7| Perc7| SSN_Self |Mstatus |Height |Weight|Gender_Self |MemberId |StreetAddress    |City       |Zip    |PrimaryPhType|PrimaryPhNo   |Country|Months|TobDate    |Product      | Bank   |AccName|Rnum     | Anum  |Frequency|pdfEnable|
|abe     |Mr.   | Jamie |Lannister|Maryland|SYSDate - 100Y/0M/1D|45     |SYSDate - 58Y/0M/0D|$40,000 |$25,000  |$100,000 |  Rock  |Pol     |Son         |25   | Hary   | Pol     |Son          |25    |Swan    | Pol     |Daughter     |25    | Mike   | Pol     | Other       | 25   |Friend |James   |Arthur   |Other        | 25   |Professor  | Mary   |Adams    |Mother       |25    | Arthur |Adams    |Father       | 25   | Amanda |Pol      |Spouse       |25    |000000777 |Married |5.0    |188   | Male       |254256   |241 Pine Grove Rd|Lonaconing | 21539 |Mobile       | 1234567898   |India  |6     |08/02/2015 |E-Cigarettes |ABC Bank|GHF    |242342256|353455 |Monthly  |0        |
 

@AbeRegression_1_2
Scenario Outline:<ABESC03>Application Submission for Self only with Critical Illness (No Benes)

	Given Test set up for "NYL" feature and "NYL_ABE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Scroll down and click on I Attest To Having Read the Above Information button
	Then Click on Self
	Then Select YES Radio button of Membership 
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"  
	And Clicks on next button  
	And Verify that error message is displayed for state eligibility at top of the page
	And Enter New State as "<State1>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Verify FiftyMBTL is not displayed
	And Verify Available Product List FiveYTL,TenYTL,TwentyYTL,ADD,LTDPlus,LTD,MTD,RTDI,PO,HMI
	And Clicks on Back or Previous button
	And Enter New State as "<State2>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Verify Available Product List FiveYTL,TenYTL,TwentyYTL,ADD,LTDPlus,LTD,MTD,RTDI,PO,HO,CI
	And Selects product CI for Self
	And Clicks on next button
	Then Request Coverage page is displayed to user 
	And Selects Benefit Amount for Self as "<Benefit>" under CI
	And Validates under CI the Benefit Slider Range as "<Min_CI>" to "<Max_CI>"
	And Clicks on next button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN_Self>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects Yes Radio button for Tobacco Question 
	And Validates Last Used Date Textbox and Specify the products used Textbox is displayed
	And Selects No Radio button for Tobacco Question Self 
	And Selects No for Travel Question Non QD for Self
	And Selects Residential Radio Button
	And Clicks on next button	
	Then Application Summary Page is displayed to user
	And Clicks on next button
	And Selects Payment Method for CI
	And Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for Critical Illness Product "<Frequency>"
	And Verify Premium Rates
	And Confirms I have read the Information Check Box on Payment Page
	And Clicks on next button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	And Verify Supplemental Health Note in Authorization Page	
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign																																	
	And Clicks on next button to finish
	Then Payment Authorization Letter is displayed to user and clicks on Continue																																	
	And Signs Payment Authorization Letter																																	
	And Clicks on next button to finish	
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"
	##And Verify PDF information as "<pdfScenario>","<pdfEnable>"	
	
	
	
Examples:
|Website|Title|Fname   |Lname |State   |DOB                |WorkHr|State1     |State2|Benefit|Min_CI |Max_CI    |SSN_Self |Mstatus |Height|Weight|Gender_Self  |MemberId |StreetAddress  |City       |Zip  |PrimaryPhType|PrimaryPhNo  | Password   | Vpassword | Bank   |AccName|Rnum     | Anum | Frequency|pdfEnable|
|abe    |Mr.  |Stewart |Brown |Nunavut |SYSDate - 45Y/0M/0D|45    |Connecticut|Kansas| 40000 |$5,000 |$100,000  |968732984|Married |5.0   |188   | Male        |965425   |182 Cathole Rd |Litchfield |06759|Home         |7496859685   | ABCD@1993  |ABCD@1993  |ABC Bank|GHF    |242342256|353455| Monthly  |0        |


@AbeRegression_1_4
Scenario Outline: <ABESC04> Complete work flow of application Member only 5,10,20 YTL, AD&D, PO, HI, LTD Plus, LTD, MidTerm DI, Retirement DI, Critical Illness  
	Given Test set up for "NYL" feature and "NYL_ABE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	And Scroll down and click on I Attest To Having Read the Above Information button
	Then Click on Self 
	Then Select YES Radio button of Membership 
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"  
	And Clicks on next button                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
	And Verify that error message is displayed for state eligibility at top of the page
	And Enter New State as "<State1>"
	And Clicks on next button
	Then Product page details are displayed to user and Verify FiveYTL,TenYTL,TwentyYTL
	And Clicks on Back or Previous button
	And Enter New State as "<State2>"
	And Clicks on next button
	And Verify Available Product List FiveYTL,TenYTL,TwentyYTL,ADD,LTDPlus,LTD,MTD,RTDI,PO,HO,CI
	And Selects product FiveYTL for Self
	And Selects product TenYTL for Self
	And Selects product TwentyYTL for Self
	And Selects product Accidental Death for Self
	And Selects product LTDPlus for Self
	And Selects product LTD for Self
	And Selects product MTDI for Self
	And Selects product CI for Self
	And Selects product RDI for Self
	And Selects product POEDI for Self
	And Selects product HMI for Self
	And Clicks on next button
	And Confirms Imp Replacement Info for NewYork state	
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	And Selects Yes for Do you have other life insurance in force for Self
	And Enters Total Amount for Self as "<TotalAmt>"
	And Selects Yes for life insurance applied for intended to replace for Self
	And Verify New York State paragraph is displayed for Self
	And Enters Monthly Income for Self as "<MonthlyIncome>"
	And Enters details for Monthly Expense and Percentage Responsible as "<MonthExpense>","<PercResp>"
	And Selects Answer as No for all additional questions of Group Disability Insurance for Self	
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under FiveYTL
	Then Validates Quick Decision is not displayed for FiveYTL
	And Validates under FiveYTL the Benefit Slider Range as "<Min_Five>" to "<Max_Five>"
	And Selects Chronic Illness Rider for FiveYTL Product Self
	And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
	Then Validates Quick Decision is not displayed for TenYTL
	And Validates under TenYTL the Benefit Slider Range as "<Min_Ten>" to "<Max_Ten>" for self
	And Selects Waiver of Premium Rider for TenYear for Self
	And Selects Benefit Amount for Self as "<Benefit2>" under TwentyYTL
	And Validates under TwentyYTL the Benefit Slider Range as "<Min_Twenty>" to "<Max_Twenty>"
	And Selects Waiver Rider for Twenty Year Product
	And Selects Benefit Amount for Self as "<Benefit3>" under ADDI
	And Validates under ADDI the Benefit Slider Range as "<Min_ACC>" to "<Max_ACC>"
	And Selects Benefit Amount for Self as "<Benefit4>" under LTDPlus
	And Selects Wait Period for Self as "<WaitPeriod>" under LTDPlus
	And Validates under LTDPlus the Benefit Slider Range as "<Min_LTDP>" to "<Max_LTDP>"
	And Selects Catastrophic Disability Benefit Rider for LDTP
	And Selects Cost of Living Adjustment Rider under LTDP Product
	And Selects Benefit Amount for Self as "<Benefit5>" under LTD
	And Selects Wait Period for Self as "<WaitPeriod1>" under LTD
	And Validates under LTD the Benefit Slider Range as "<Min_LTD>" to "<Max_LTD>" 
	And Selects Cost of Living Adjustment Rider under LTD product
	And Selects Benefit Amount for Self as "<Benefit6>" under MTDI
	And Selects Wait Period for Self as "<WaitPeriod2>" under MTDI
	And Validates under MTDI the Benefit Slider Range as "<Min_MID>" to "<Max_MID>"
	And Selects Benefit Amount for Self as "<Benefit8>" under RDI
	And Selects Wait Period for Self as "<WaitPeriod3>" under RDI
	And Validates under RDI the Benefit Slider Range as "<Min_Retire>" to "<Max_Retire>"
	And Selects Benefit Amount for Self as "<Benefit9>" under POEDI
	And Validates under POEDI the Benefit Slider Range as "<Min_Prof>" to "<Max_Prof>"
	And Selects Benefit Amount for Self as "<Benefit7>" under CI
	And Validates under CI the Benefit Slider Range as "<Min_CI>" to "<Max_CI>"
	And Selects Benefit Amount for Self as "<Benefit10>" under HMI
	And Selects Surgical Option Rider for Self under HMI
	And Selects Surgical Amount as "<SAmount>"
	And Clicks on next button
	And Validate Max Aggregate error message 
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit11>" under FiveYTL	
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on next button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN_Self>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects Yes Radio button for Tobacco Question 
	And Validates Last Used Date Textbox and Specify the products used Textbox is displayed
	And Selects No Radio button for Tobacco Question Self 
	And Selects No for Travel Question Non QD for Self
	And Selects Residential Radio Button
	And Selects Yes Radio Button for Business Address
	And Enters Business Details as "<BusinessName>","<BusinessType>"
	And Clicks on next button
	Then Application Summary Page is displayed to user 
	And Clicks on next button
	Then Payment Information Page is displayed to user and user Selects Payment option as Bank for FiveYTL Product																																	
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"																																	
	And Clicks on Save button
	And Selects Frequency for FiveYTL Product and reviews "<Frequency>"
	And Selects Payment Method for TenYTL
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Ten Year Product and reviews "<Frequency>"
	And Selects Payment Method for TwentyYTL
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Twenty Year Product "<Frequency>"
	And Selects Payment Method for ADDI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Accidental Death Product and reviews "<Frequency>"
	And Selects Payment Method for LTDPlus
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Long Term Disability Plus Product "<Frequency>"
	And Selects Payment Method for LTD
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Long Term Disability Product "<Frequency>"
	And Selects Payment Method for MTDI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Mid Term Disability Product "<Frequency>"
	And Selects Payment Method for RTDI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Retirement Disability Product "<Frequency>"
	And Selects Payment Method for POEDI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Professional Disability Product "<Frequency>"
	And Selects Payment Method for CI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Critical Illness Product "<Frequency>"
	And Selects Payment Method for HMI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Hospital Money Insurance Product and reviews "<Frequency>"
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

|Website |Title  |Fname |Lname |State       |DOB                 |State1  |DOB1                |State2   |WorkHr |TotalAmt|MonthlyIncome |MonthExpense |PercResp |Benefit  |Benefit11|Min_Five  |Max_Five     |Min_Ten   |Max_Ten   |Min_Twenty|Max_Twenty |Min_ACC    |Max_ACC |Min_LTDP |Max_LTDP | Min_LTD|Max_LTD  |Min_MID| Max_MID  | Min_Retire| Max_Retire|Min_Prof|Max_Prof | Min_Prof|Max_Prof    |Min_CI  |Max_CI   |Benefit1 |Benefit2 |Benefit3 |Benefit4 |WaitPeriod |Benefit5 |WaitPeriod1 |Benefit6 |WaitPeriod2 |Benefit7  |Benefit8 |WaitPeriod3 |Benefit9 |Benefit10 |SAmount |SSN_Self  |Mstatus |Height |Weight |Gender_Self |Wt12MonthAgo  |MemberId  |StreetAddress   |City    |Zip    |PrimaryPhType|PrimaryPhNo  |BusinessName |BusinessType |Bank     |AccName |Rnum      |Anum             |Frequency|pdfEnable|
|abe     |Mr.    |Lans  |Arthur|Nova Scotia |SYSDate - 48Y/0M/0D |Vermont |SYSDate - 50Y/0M/0D |New York |45     | 150000 |10000         |  5000       |100      |610000   | 600000  |$20,000   | $2,000,000  |$100,000  |$2,000,000|$100,000  |$2,000,000 | $100,000  |$500,000|$100     |$6,000   |$100    |$6,000   |$100   |$6,000    |$1,000     |$3,500    | $500   |$5,000   |  $500   |  $5,000     |$5,000  | $100,000|700000   | 700000  | 200000  | 100     |90 Days    | 100     |90 Days     | 100     |90 Days     | 10000    |1000     |180 Days    | 5000    | 300      | 1000   |553434348 |Single  |6.0    |180    |Male        |   180        |789658745 |2699 Centre Ave |Bellmore| 11710 | Mobile      |  5343543543 |Arthur Corp  |Partnership  |abc bank |adam    |745688999 |35434354879988588|Monthly  |0        |


@AbeRegression_5
Scenario Outline:<ABESC05>Application Submission for Self and Spouse with 5 YTL(Primary & Beneficiary and Contingent Trust)  & BillMe														
														
	Given Test set up for "NYL" feature and "NYL_ABE" scenario													
	Given Customer navigate to NYL "<Website>" 														
	When Clicks on Apply now button														
	Then Scroll down and click on I Attest To Having Read the Above Information button														
	Then Select NO for Association Membership
	Then Click on Self
    Then Click on Spouse
    And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<Workhr>"
    And Enters Eligibility details for Spouse as "<STitle>","<Sfname>","<Slname>","<SDOB>","<Sworkhr>"	
    And Select radio button NO for Spouse is Member
    And Validate that NEXT button is Disabled					
	Then Select YES Radio button of Membership					
   	And Clicks on next button														
   	Then Product page details are displayed to user	
   	And Verify that No Product is Available for Spouse				
   	And Clicks on Back or Previous button
   	And Enters DOB for Spouse as "<SDOB1>"
   	And Clicks on next button                 
   	And Verify Available Products for Spouse as FiveYTL,TenYTL,TwentyYTL,ADD,LTD,LTDPlus,MTD,HO
   	And Selects product FiveYTL for Self														
	And Selects product FiveYTL for Spouse														
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self													
    Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse	
   	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under FiveYTL
	And Validates under FiveYTL the Benefit Slider Range as "<MinTerm_Self>" to "<MaxTerm_Self>"														
	And Selects Benefit Amount for Spouse as "<Sbenefit>" under FiveYTL 
	And Validates under FiveYTL the Benefit Slider Range as "<MinTerm_Spouse>" to "<MaxTerm_Spouse>" for Spouse														
	And Clicks on next button
	Then Beneficiary Page is displayed to user
   	And Clicks on Add Beneficiary button for Self
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
    And Clicks on OK button
    And Clicks on Add Beneficiary button for Self
    Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
    And User Enters Beneficiary details as "<Trust>","<Datetrust>"
    And Clicks on OK button
    And Clicks on next button
   	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN_Self>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page													
	And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
	And Validates the Travel Question for QD application
	And Selects No Radio button for Driving Licensing Question for Self
	And Selects Yes for Travel Question QD for Self 
	And Enters details for Travel Question QD for Self as "<Country>"
	And Selects No Radio button for Tobacco Question Self
	And Selects Residential Radio Button	
  	And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>"
  	And Enters WeightTwelveMonths ago details for Spouse as "<S12mnthsWeight>"
  	And Select DrivingLicense Question as No for Spouse
  	And Select No for Travel Question-SixMonths for Spouse
  	And Selects No Radio button for Tobacco Question Spouse
	And Clicks on next button														
	Then Application Summary Page is displayed to user 														
	And Clicks on next button														
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<Vpassword>" 														
	And Clicks on Next and OK Button
 	Then Authorize page details are displayed to user and confirm the term and conditions for Self
  	Then Authorize page details are displayed to user and confirm the term and conditions for Spouse
  	And Validate Authorization Message MN in Read and Sign Box 
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
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"	
	And Verify PDF information as "<pdfScenario>","<pdfEnable>"														
														
																												
Examples:														
|Website | Title | Fname | Lname             | State    | DOB       | Workhr   |STitle|Sfname | Slname              | SDOB                 | Sworkhr|SDOB1     | Benefit|MinTerm_Self |MaxTerm_Self  |Sbenefit |MinTerm_Spouse |MaxTerm_Spouse |  Bname | Blname |Relationship| Perc| Trust  | Datetrust | SSN_Self  | Mstatus | Height  | Weight |Gender_Self | Wt12MonthAgo | MemberId  | StreetAddress  | City       | Zip   |PrimaryPhType | PrimaryPhNo | SSSN     | SHeight | SWeight | Gender_Spouse|S12mnthsWeight | SPhoneType  |SPhoneNum  |Country|Months |Password    | Vpassword | Frequency  |pdfEnable|														
|  abe   |  Mr.  | Jack  | Snmmmmtestcasejm  |Minnesota | 12-12-1977| 45       | Mrs. | Vonda | Snmmmmtestcasese    |SYSDATE - 16Y/11M/30D |  45    |12-12-1982|50000   |$20,000      |$2,000,000    |20000    | $20,000       |$2,000,000     | Rock   |Pol     |Son         |100  | Bright | 12-12-1978|700000000  |Married  |5.5      |188     |Male        |188           |256389     | 200 9th St SE  | New Prague | 56071 | Mobile       |1234567898   |990067140 |  5.0    |188      |Female        |188            | Mobile      |1234567890 |India  |6      | Yogesh@1993|Yogesh@1993| Quarterly  |0        |														


@AbeRegression_1_6
Scenario Outline:<ABESC06>Complete work flow of application Member and Child 10 YTL (add max children)(primary trust, contingent individual) JET        							
							
	Given Test set up for "NYL" feature and "NYL_ABE" scenario							
	Given Customer navigate to NYL "<Website>" 														
	When Clicks on Apply now button														
	Then Scroll down and click on I Attest To Having Read the Above Information button														
	Then Click on Self
  	Then Select YES Radio button of Membership 
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<Workhr>"							
	And Click on Child                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               							
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<C1fname>","<C1lname>","<C1DOB>","<Csex_M>"
  	And Selects Married question as No for Child
  	And Honorably Discharged question as No
  	And Click on Add Child button on Screen							
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<C2fname>","<C2lname>","<C2DOB>","<Csex_F>"
  	And Selects Married question as No for Child
  	And Honorably Discharged question as No
  	And Click on Add Child button on Screen	 							
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<C3fname>","<C3lname>","<C3DOB>","<Csex_M>"
  	And Selects Married question as Yes for Child
  	And Honorably Discharged question as No							
	And Click on Add Child button on Screen	
  	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<C4fname>","<C4lname>","<C4DOB>","<Csex_F>"
    And Selects Married question as No for Child
    And Honorably Discharged question as Yes							
	And Click on Add Child button on Screen	
    And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<C5fname>","<C5lname>","<C5DOB>","<Csex_F>"
    And Selects Married question as No for Child
  	And Honorably Discharged question as No
    And Click on Add Child button on Screen	
    And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<C6fname>","<C6lname>","<C6DOB>","<Csex_F>"
    And Selects Married question as No for Child
  	And Honorably Discharged question as No
    And Click on Add Child button on Screen	
    And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<C7fname>","<C7lname>","<C7DOB>","<Csex_F>"
  	 And Selects Married question as No for Child
  	And Honorably Discharged question as No
    And Click on Add Child button on Screen	
    And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<C8fname>","<C8lname>","<C8DOB>","<Csex_F>"
    And Selects Married question as No for Child
  	And Honorably Discharged question as No
    And Click on Add Child button on Screen								
	And Clicks on next button							
	Then Product page details are displayed to user								
	And Selects product TenYTL for Self						
	And Selects product TenYTL for Child							
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self								
	And Clicks on next button							
	Then Request Coverage page is displayed to user 							
	And Selects Benefit Amount for Self as "<Benefit>" under TenYTL
	And Validates under TenYTL the Benefit Slider Range as "<Min_Ten>" to "<Max_Ten>" for self
	And Selects Benefit Amount for Child as "<Cbenefit>" under TenYTL						
	And Validates under TenYTL the Benefit Amounts Listed are: "<Ten_amount1>","<Ten_amount2>","<Ten_amount3>","<Ten_amount4>","<Ten_amount5>"
	And Validates"<C1fname>","<C2fname>","<C3fname>" are not displayed in eligible children							
	And Clicks on next button							
	Then Beneficiary Page is displayed to user
	And Clicks on Add Beneficiary button for Self							
	Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons							
	 And User Enters Beneficiary details as "<Trust>","<Datetrust>"						
	And Clicks on OK button							
	And Clicks on Add Beneficiary button for Self							
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relationship>","<Perc>"
	And Clicks on OK button						
	And Clicks on next button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN_Self>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No for Travel Question Non QD for Self
	And Selects No Radio button for Tobacco Question Self						
	And Selects Residential Radio Button							
	And Clicks on next button							
	Then Application Summary Page is displayed to user
	And Verify Benefit Amount for Self as "<Benefit>" under TenYTL
	And Verify Benefit Amount for child "<Cfname4>","<TenYTL_SequenceNo>" as "<Cbenefit>" under TenYTL
	And Verify Benefit Amount for child "<Cfname5>","<TenYTL_SequenceNo1>" as "<Cbenefit>" under TenYTL
	And Verify Benefit Amount for child "<Cfname6>","<TenYTL_SequenceNo2>" as "<Cbenefit>" under TenYTL
	And Verify Benefit Amount for child "<Cfname7>","<TenYTL_SequenceNo3>" as "<Cbenefit>" under TenYTL
	And Verify Benefit Amount for child "<Cfname8>","<TenYTL_SequenceNo4>" as "<Cbenefit>" under TenYTL
	And Verify Child name as "<C4fname>","<C4lname>"
	And Verify Child name as "<C5fname>","<C5lname>"
	And Verify Child name as "<C6fname>","<C6lname>"
	And Verify Child name as "<C7fname>","<C7lname>"
	And Verify Child name as "<C8fname>","<C8lname>"
	And Clicks on next button							
	And Selects Payment Method for TenYTL 
	Then Selects Payment option as Bill Me																																	
	And Clicks on Save button																																	
	And Selects Frequency for Ten Year Product and reviews "<Frequency>"						
	And Clicks on next button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self	
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign																																	
	And Clicks on next button to finish
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"
		
						
							
Examples:													
|Website |Title |Fname  |Lname |State     |DOB                 |Workhr |C1fname |C1lname |C1DOB                |Csex_M|Csex_F |C2fname |C2lname |C2DOB               |C3fname |C3lname |C3DOB              |C4fname |C4lname |C4DOB              |C5fname   |C5lname |C5DOB              |C6fname |C6lname |C6DOB              |C7fname |C7lname |C7DOB               |C8fname |C8lname |C8DOB              |Benefit  |Min_Ten |Max_Ten    |Cbenefit |Ten_amount1|Ten_amount2|Ten_amount3|Ten_amount4|Ten_amount5 |Trust |Datetrust  |Bfname  |Blname |Relationship|Perc |SSN_Self  |Mstatus  |Height|Weight |Gender_Self|MemberId|StreetAddress |City        |Zip    |PrimaryPhType|PrimaryPhNo|Frequency     |TenYTL_SequenceNo|TenYTL_SequenceNo1|TenYTL_SequenceNo2|TenYTL_SequenceNo3|TenYTL_SequenceNo4|pdfEnable|						
|abe    |Mr.    |Arthur |Jonas |Tennessee |SYSDate - 50Y/0M/0D |45     |John    |Jonas   |SYSDate - 00Y/0M/12D |Male  |Female |Samantha|Jonas   |SYSDate - 28Y/0M/0D |Martha  |Gill    |SYSDate - 16Y/0M/0D|Peter   |Gill    |SYSDate - 17Y/0M/0D|Josephine |Gill    |SYSDate - 15Y/0M/0D|Lola    |Gill    |SYSDate - 19Y/0M/0D|Carter  |Simons  |SYSDate - 18Y/0M/0D |Joney   |Simons  |SYSDate - 17Y/0M/0D|$550,000 |$100,000|$2,000,000 |5000     |$5,000     | $10,000   |$15,000    | $20,000   | $25,000    |Murphy| 04/09/1974|Jonas   |Gill   |Spouse      |100  |741155885 |Divorced |6.0   |180    |Male       |741968  |7623 Bonnie Dr|Chattanooga |37416   |Mobile      |8965585656 |Semiannually  |1                |2                 |3                 |4                 |5                 |0        |						


							
@AbeRegression_1_7
Scenario Outline:<ABESC07> Spouse only 50+ TL (add max of primary & contingent individual benes)                                                                               

	Given Test set up for "NYL" feature and "NYL_ABE" scenario
	Given Customer navigate to NYL "<Website>" 
	When Clicks on Apply now button
	Then Scroll down and click on I Attest To Having Read the Above Information button
	Then Select YES Radio button of Membership 
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<Workhr>"
  	Then Click on Spouse                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
	And Select radio button NO for Spouse is Member 
	And Enters Eligibility details for Spouse as "<STitle>","<Sfname>","<Slname>","<SDOB>","<Sworkhr>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Verify Available Product List FiveYTL,TenYTL,TwentyYTL,ADD,LTDPlus,LTD,MTD,HO
	And Navigate back to Eligibility page 
	And Enters DOB for Spouse as "<SDOB1>"                                                                                                                                     
	And Clicks on next button
	Then Product page details are displayed to user 
	And Verify Available Product List FiveYTL,TenYTL,FiftyYTL,ADD,LTDPlus,LTD,MTD,CI,HO
	And Selects product FiftyYTL for Spouse
	And Clicks on next button
	Then Click YES for Dependent Coverage information
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
	And Clicks on next button
	Then Request Coverage page is displayed to user 
	And Selects Benefit Amount for Spouse as "<Sbenefit>" under FiftyYTL
	And Validates under FiftyYTL for Spouse the Benefit Slider Range as "<Min_Fifty>" to "<Max_Fifty>"	
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Add Beneficiary Button for Spouse
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname1>","<Blname2>","<Relationship1>","<Perc1>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname2>","<Blname2>","<Relationship2>","<Perc2>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname3>","<Blname3>","<Relationship3>","<Perc3>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname4>","<Blname4>","<Relationship4>","<Perc4>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname5>","<Blname5>","<Relationship5>","<Perc5>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname6>","<Blname6>","<Relationship6>","<Perc6>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname7>","<Blname7>","<Relationship7>","<Perc7>"
	And Clicks on OK button
	And Clicks on next button
	Then Contact Details page is displayed to user and enters contact Details for self as "<SSN>","<Mstatus>","<Gender_Self>","<MembershipID>","<Street>","<City>","<ZipCode>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page 
	And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>"
	And Answer all other questions of Spouse as No for Nicotin and Outside US Twelve
	And Selects Residential Radio Button	
	And Clicks on next button
	Then Application Summary Page is displayed to user 
	And Clicks on next button
	Then Payment Information Page is displayed to user And Selects Payment Method for FiftyYTL 
	And Selects Payment option as Bill Me
	And Clicks on Save button
	And Selects Frequency for Fifty Year Product "<Frequency>"
	And Verify Premium Rates
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
	


Examples:
 |Website | Title | Fname | Lname   | State  | DOB               | Workhr  |STitle|Sfname | Slname  | SDOB               | Sworkhr|SDOB1               |Sbenefit| Min_Fifty|Max_Fifty| Bname | Blname |Relationship| Perc| Bname1 | Blname1 |Relationship1| Perc1| Bname2 | Blname2 |Relationship2| Perc2| Bname3 | Blname3 |Relationship3| Perc3| Bname4 | Blname4 |Relationship4| Perc4| Bname5 | Blname5 |Relationship5| Perc5| Bname6  | Blname6 |Relationship6| Perc6| Bname7 | Blname7 |Relationship7| Perc7| SSN      |Mstatus |Gender_Self|MembershipID | Street             |City      |ZipCode  | PrimaryPhType|PrimaryPhNo |SSSN      |SHeight |SWeight |Gender_Spouse|S12mnthsWeight|SPhoneType|SPhoneNum |Frequency |pdfEnable|
 |  abe   |  Mr.  |Leonard|Hofstater|Alabama |SYSDate - 19Y/0M/0D| 45      |Mrs.  |Penny  |Hofstater|SYSDate - 22Y/0M/0D |  45    |SYSDate - 63Y/0M/0D |100000  | $25,000  | $100,000| James |Pol     |Son         |25   | Mary   | Pol     |Son          |25    |Ron     | Pol     | Son         |25    | Carter | Pol     | Son         | 25   |Norma   | Pol     | Son         | 25   | Lucas  | Pol     | Son         |25    | Jonathan|Pol      | Son         | 25   | Parker | Pol     | Son         | 25   |066000777 |Married |Male       | 254257      |6441 Ridge View Cir | Bessemer |35022    | Mobile       |1234567898  |000000778 |  5.0   |188     |Female       |200           |Mobile    |1234567890|Annually  |0        |


@AbeRegression_8
Scenario Outline:<ABESC08> Complete work flow of application Spouse only 5,10,20 YTL, AD&D, LTD Plus, LTD, MidTerm, Critical Illness, Hospital money insurance

	Given Test set up for "NYL" feature and "NYL_ABE" scenario
	Given Customer navigate to NYL "<Website>" 
	When Clicks on Apply now button
	Then Scroll down and click on I Attest To Having Read the Above Information button
	Then Select YES Radio button of Membership 
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
    Then Click on Spouse                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
	And Select radio button Yes for Spouse is Member
	And Enters Eligibility details for Spouse as "<STitle>","<Sfname>","<Slname>","<SDOB>","<SWorkHr>"
	And Clicks on next button
	And Verify that error message is displayed for state eligibility at top of the page
	And Enter New State as "<State1>"
	And Clicks on next button
	And Product page details are displayed to user
	And Clicks on Back or Previous button
	And Enters DOB for Spouse as "<SDOB1>"
	And Clicks on next button
	And Validates the following products are not displayed: LTDPlus,LTD, MTDI,CI
	And Clicks on Back or Previous button
	And Enter New State as "<State2>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Selects product FiveYTL for Spouse
	And Selects product TenYTL for Spouse
	And Selects product TwentyYTL for Spouse
	And Selects product Accidental Death for Spouse
	And Selects product LTDPlus for Spouse
	And Selects product LTD for Spouse
	And Selects product MTDI for Spouse
	And Selects product CI for Spouse
	And Selects product HMI for Spouse
	And Clicks on next button
	Then Click YES for Dependent Coverage information
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
	And Enters Monthly Income as "<SMonthlyIncome>" for Spouse
	And Selects Answer as No for Additional Questions as No for all for Spouse of Group Disability Insuranse
	And Clicks on next button 
	And Selects Benefit Amount for Spouse as "<Sbenefit>" under FiveYTL   
	And Validates under FiveYTL the Benefit Slider Range as "<Min_Five>" to "<Max_Five>" for Spouse
	And Selects Benefit Amount for Spouse as "<Sbenefit1>" under TenYTL
	And Validates under TenYTL the Benefit Slider Range as "<Min_Ten>" to "<Max_Ten>" for Spouse
	And Selects Benefit Amount for Spouse as "<Sbenefit2>" under TwentyYTL
	And Validates under TwentyYTL the Benefit Slider Range as "<Min_Twenty>" to "<Max_Twenty>" for Spouse
	And Selects Benefit Amount for Spouse as "<Sbenefit3>" under ADDI
	And Validates under ADDI the Benefit Slider Range as "<Min_ACC>" to "<Max_ACC>" for Spouse
	And Selects Benefit Amount for Spouse as "<Sbenefit4>" under LTDPlus
	And Selects Wait Period for Spouse as "<WaitPeriod>" under LTDPlus
	And Validates under LTDPlus the Benefit Slider Range as "<Min_LTDP>" to "<Max_LTDP>" for Spouse
	And Selects Benefit Amount for Spouse as "<Sbenefit5>" under LTD
	And Selects Wait Period for Spouse as "<WaitPeriod1>" under LTD
	And Validates under LTD the Benefit Slider Range as "<Min_LTD>" to "<Max_LTD>" for Spouse
	And Selects Benefit Amount for Spouse as "<Sbenefit6>" under MTDI
	And Selects Wait Period for Spouse as "<WaitPeriod2>" under MTDI
	And Validates under MTDI the Benefit Slider Range as "<Min_MID>" to "<Max_MID>" for Spouse
	And Selects Benefit Amount for Spouse as "<Sbenefit7>" under CI
	And Validates under CI the Benefit Slider Range as "<Min_CI>" to "<Max_CI>" for Spouse
	And Selects Benefit Amount for Spouse as "<Sbenefit8>" under HMI
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on next button
	Then Contact Details page is displayed to user and enters contact Details for self as "<SSN>","<Mstatus>","<Gender_Self>","<MembershipID>","<Street>","<City>","<ZipCode>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page 
	And Selects Residential Radio Button
	And Selects Yes Radio Button for Business Address
	And Enters Business Details as "<BusinessName>","<BusinessType>"
	And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>"
	And Enters WeightTwelveMonths ago details for Spouse as "<S12mnthsWeight>"
	And Selects No for Travel Question Non QD for Spouse
	And Select DrivingLicense Question as No for Spouse
  	And Select No for Travel Question-SixMonths for Spouse
  	And Selects No Radio button for Tobacco Question Spouse
	And Clicks on next button
	Then Application Summary Page is displayed to user 
	And Clicks on next button
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<Vpassword>" 
	And Clicks on Next and OK Button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	Then Authorize page details are displayed to user and confirm the term and conditions for Spouse
	And Clicks on next button
	Then Statement of Health page one is displayed to user and answeres as No for all questions on both pages for Spouse
	Then Statement of Health page two is displayed to user and answeres as No for all questions on both pages for Spouse
	Then Almost done page is displayed to user
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign																																	
	And Clicks on next button to finish
	Then Review and sign page details are displayed to user and Click on continue and attached the sign																																	
	And Clicks on next button to finish
	Then Payment Authorization Letter is displayed to user and clicks on Continue																																	
	And Signs Payment Authorization Letter																																	
	And Clicks on next button to finish	
	Then Payment Authorization Letter is displayed to user and clicks on Continue																																	
	And Signs Payment Authorization Letter																																	
	And Clicks on next button to finish		
	Then Your Insurance Request Decision Page is displayed to user
	And Clicks on next button
	Then Payment Information Page is displayed to user and user Selects Payment option as Bank for FiveYTL Product																																	
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"																																	
	And Clicks on Save button
	And Selects Frequency for FiveYTL Product and reviews "<Frequency>"
	And Selects Payment Method for TenYTL
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Ten Year Product and reviews "<Frequency>"
	And Selects Payment Method for TwentyYTL
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Twenty Year Product "<Frequency>"
	And Selects Payment Method for ADDI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Accidental Death Product and reviews "<Frequency>"
	And Selects Payment Method for LTDPlus
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Long Term Disability Plus Product "<Frequency>"
	And Selects Payment Method for LTD
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Long Term Disability Product "<Frequency>"
	And Selects Payment Method for MTDI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Mid Term Disability Product "<Frequency>"
	And Selects Payment Method for CI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Critical Illness Product "<Frequency>"
	And Selects Payment Method for HMI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Hospital Money Insurance Product and reviews "<Frequency>"
	And Confirms I have read the Information Check Box on Payment Page																																
	And Clicks on next button
	Then Payment Authorization Letter is displayed to user and clicks on Continue																																	
	And Signs Payment Authorization Letter																																	
	And Clicks on next button to finish	
	Then Thank you page is displayed to user
	And Verify that two confirmation number is generated for "<Website>"
	
	
		
Examples:
|Website |Title   |Fname  |Lname            |State                |State1        |State2       |DOB        |WorkHr  |STitle |Sfname  |Slname           |SDOB       |SDOB1      |SWorkHr |SMonthlyIncome |Sbenefit |Min_Five|Max_Five   |Sbenefit1 |Min_Ten |Max_Ten   |Sbenefit2 |Min_Twenty|Max_Twenty|Sbenefit3 |Min_ACC  |Max_ACC  |Sbenefit4 |WaitPeriod |Min_LTDP |Max_LTDP|Sbenefit5 |WaitPeriod1 |Min_LTD|Max_LTD|Sbenefit6 |WaitPeriod2 |Min_MID |Max_MID |Sbenefit7 |Min_CI |Max_CI  |Sbenefit8  |SSN       |Mstatus |Gender_Self|MembershipID |Street        |City    |ZipCode  |PrimaryPhType|PrimaryPhNo |BusinessName |BusinessType     | SSSN    |SHeight |SWeight |Gender_Spouse|S12mnthsWeight|SPhoneType|SPhoneNum |Password |Vpassword |Bank     |AccName |Rnum      |Anum     |Frequency|pdfEnable|
|abe     |Prof.   |Rayna  |Snmmmmtestcasesi |Prince Edward Island |New Hampshire |Rhode Island |07/01/1974 |45      |Mrs.   |Gleason |Snmmmmtestcasegt |09/04/1942 |05/20/1977 |45      | 10000         | 250000  |$20,000 |$2,000,000 | 1000000  |$100,000|$2,000,000| 250000   |$100,000  |$2,000,000|100000    |$100,000 |$500,000 | 100      |90 Days    |$100     |$5,000  | 100      |90 Days     |$100   |$5,000 | 100      |90 Days     |$100    |$5,000  | 5000     |$5,000 |$100,000|300        |061000002 |Married |Male       |574543543    |33 Fullam Cir |Suncook |03275    | Mobile      | 5343543543 |Arthur Corp  |Sole Proprietary |990067613|5.0     |180     |Female       | 200          |Mobile    |5454856876|Adam@123 |Adam@123  |abc bank |adam    |745688999 |354343548|Monthly  |0        |



@AbeRegression_1_9
Scenario Outline: <ABESC09> Complete work flow of application Spouse and Child 10YTL, AD&D, Hosp (Save for later after adding children)                               
	Given Test set up for "NYL" feature and "NYL_ABE" scenario
	Given Customer navigate to NYL "<Website>" 
	When Clicks on Apply now button
	Then Scroll down and click on I Attest To Having Read the Above Information button
	Then Select YES Radio button of Membership 
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
    Then Click on Spouse                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
	And Select radio button Yes for Spouse is Member                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
	And Enters Eligibility details for Spouse as "<STitle>","<Sfname>","<Slname>","<SDOB>","<SWorkHr>"
	And Click on Child
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
	And Selects Married question as No for Child
  	And Honorably Discharged question as No
	And Click on Add Child button on Screen
	And Clicks on next button
	And Verify that error message is displayed for state eligibility at top of the page
	And Enter New State as "<State1>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Validates the following products are not displayed: ADDI,HMI
	
	And Clicks on Back or Previous button
	And Enter New State as "<State2>"
	And Clicks on next button
	
	And Validates no coverages are displayed for Spouse
	And Clicks on Back or Previous button
	And Enters DOB for Spouse as "<SDOB1>"
	And Clicks on button to Save for later
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<Vpassword>" 
	And Clicks OK Button Save For Later
	Then  Refresh the browser
	Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive
	And Clicks on next button
	Then Product page details are displayed to user 
	And Selects product TenYTL for Spouse
	And Selects product TenYTL for Child
	And Selects product Accidental Death for Spouse
	And Selects product Accidental Death for Child
	And Selects product HMI for Spouse
	And Selects product HMI for Child
	And Clicks on next button
	Then Click YES for Dependent Coverage information 
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse	
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Spouse as "<Sbenefit>" under TenYTL
	And Validates under TenYTL the Benefit Slider Range as "<Min_Ten>" to "<Max_Ten>" for Spouse
	And Selects Benefit Amount for Child as "<Cbenefit>" under TenYTL
	And Validates under TenYTL the Benefit Amounts Listed are: "<Ten_amount1>","<Ten_amount2>","<Ten_amount3>","<Ten_amount4>","<Ten_amount5>"
	And Selects Benefit Amount for Spouse as "<Sbenefit1>" under ADDI
	And Validates under ADDI the Benefit Slider Range as "<Min_ACC>" to "<Max_ACC>" for Spouse
	And Selects Benefit Amount for Child as "<Cbenefit1>" under ADDI
	And Validates under ADDI the Benefit Amounts for Child Listed are: "<ACC_amount1>","<ACC_amount2>"
	And Selects Benefit Amount for Spouse as "<Sbenefit2>" under HMI
	And Validates under HMI the Benefit Amounts for Spouse Listed are: "<HMI_amount1>","<HMI_amount2>","<HMI_amount3>","<HMI_amount4>","<HMI_amount5>","<HMI_amount6>","<HMI_amount7>"
	And Selects Benefit Amount for Child as "<Cbenefit2>" under HMI
	And Validates under HMI the Benefit Amounts for Child Listed are: "<HMI_amount1>","<HMI_amount2>","<HMI_amount3>","<HMI_amount4>","<HMI_amount5>","<HMI_amount6>","<HMI_amount7>"
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on next button
	Then Contact Details page is displayed to user and enters contact Details for self as "<SSN>","<Mstatus>","<Gender_Self>","<MembershipID>","<Street>","<City>","<ZipCode>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page  
	And Selects Residential Radio Button
	And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>"
	And Answer all other questions of Spouse as No for Nicotin and Outside US Twelve
	And Clicks on next button
	Then Application Summary Page is displayed to user 
	And Clicks on next button
	And Selects Payment Method for TenYTL																																	
	And Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"																																	
	And Clicks on Save button																																	
	And Selects Frequency for Ten Year Product and reviews "<Frequency>"
	And Selects Payment Method for ADDI
	And Selects Radio Button for existing payment method
	And Clicks on Save button																																	
	And Selects Frequency for Accidental Death Product and reviews "<Frequency>"																																
	And Selects Payment Method for HMI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Hospital Money Insurance Product and reviews "<Frequency>"
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
	And Verify PDF information as "<pdfScenario>","<pdfEnable>"
	

Examples:
|Website |Title   |Fname  |Lname    |State   |State1     |State2  |DOB                |WorkHr  |STitle |Sfname  |Slname   |SDOB                |SDOB1               |SWorkHr |Cfname |Clname |Csex |CDOB               |Password |Vpassword |Sbenefit |Cbenefit |Min_Ten |Max_Ten   |Ten_amount1|Ten_amount2|Ten_amount3|Ten_amount4|Ten_amount5|Sbenefit1 |Min_ACC  |Max_ACC |Cbenefit1 |ACC_amount1|ACC_amount2|Sbenefit2 |Cbenefit2 |HMI_amount1 |HMI_amount2 |HMI_amount3 |HMI_amount4 |HMI_amount5 |HMI_amount6 |HMI_amount7 |SSN       |Mstatus |Gender_Self|MembershipID|Street         |City       |ZipCode  |PrimaryPhType|PrimaryPhNo    |SSSN      |SHeight |SWeight|Gender_Spouse|SPhoneType|SPhoneNum  |Bank     |AccName |Rnum      |Anum             | Frequency |pdfEnable|
|abe     |Mr.     |Harvard|Wolovitz |Quebec  |Washington |Delaware|SYSDate - 24Y/0M/0D|45      |Mrs.   |Bernadet|Wolovitz |SYSDate - 13Y/0M/0D |SYSDate - 17Y/0M/0D |45      |Hally |Wolovitz|Male |SYSDate - 1Y/0M/0D |Adam@123 |Adam@123  | 2000000 | 25000   |$100,000|$2,000,000| $5,000    | $10,000   |$15,000    | $20,000   | $25,000   |500000    |$100,000 |$500,000| 50000    |$25,000    |$50,000    | 500      | 500      |$200        |$250        |$300        |$350        |$400        |$450        |$500        |564879925 |Married |Male       |547654654   |3140 Adams Ave |Bellingham |98225    |Mobile       |5343543543     |741258963 |6.0     |220    |Female       |Mobile    |5454856876 |abc bank |adam    |745688999 |35434354879988588|Monthly    |0        |



@AbeRegression_1_10
Scenario Outline: <ABESC10> Complete work flow of application Spouse and Child 20 YTL (primary trust, contingent individual)                                     	
                   	
	Given Test set up for "NYL" feature and "NYL_ABE" scenario	
	Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
    And Scroll down and click on I Attest To Having Read the Above Information button
    Then Select YES Radio button of Membership 
	Then Click on Spouse
    And Click on Child
    And Select radio button Yes for Spouse is Member 
    And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
    And Enters Eligibility details for Spouse as "<STitle>","<Sfname>","<Slname>","<SDOB>","<SWorkHr>"
   	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<CSex>"
   And Selects Married question as No for Child
  	And Honorably Discharged question as No
    And Click on Add Child button on Screen
    And Clicks on next button
	Then Product page details are displayed to user	
	And Validates the product TwentyYTL is not displayed	
	And Clicks on Back or Previous button
	And Enters DOB for Spouse as "<SDOB1>"   
	And Clicks Edit button for Child Added	
	And Enters DOB for Child as "<CDOB1>"	
	And Click on Add Child button on Screen
	And Clicks on next button
	Then Product page details are displayed to user 
	And Selects product TwentyYTL for Spouse	
	And Selects product TwentyYTL for Child	
	And Clicks on next button	
	Then Click YES for Dependent Coverage information 
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse	
	And Clicks on next button	
	Then Request Coverage page is displayed to user 
	And Selects Benefit Amount for Spouse as "<Sbenefit>" under TwentyYTL
	And Validates under TwentyYTL for Spouse the Benefit Slider Range as "<Min_Twenty>" to "<Max_Twenty>"	
	And Selects Benefit Amount for Child as "<Cbenefit>" under TwentyYTL
	And Validates under TwentyYTL the Benefit Amounts for Child Listed are: "<Twenty_amount1>","<Twenty_amount2>","<Twenty_amount3>","<Twenty_amount4>","<Twenty_amount5>"
	And Clicks on next button	
	Then Beneficiary Page is displayed to user	
	And Clicks on Add Beneficiary Button for Spouse under TwentyYTL
	Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
	And User Enters Beneficiary details as "<Trust>","<Datetrust>"
	And Clicks on OK button	
	And Clicks on Add Beneficiary Button for Spouse under TwentyYTL
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relationship>","<Perc>"
	And Clicks on OK button
	And Clicks on next button
	Then Contact Details page is displayed to user and enters contact Details for self as "<SSN>","<Mstatus>","<Gender_Self>","<MembershipID>","<Street>","<City>","<ZipCode>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects Residential Radio Button  
	And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>"
   	Then Answer all other questions of Spouse as No for Nicotin and Outside US Twelve
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
	And Verify PDF information as "<pdfScenario>","<pdfEnable>"
	
	
	
Examples:	
|Website |Title   |Fname  |Lname  |State          |DOB                 |WorkHr  |STitle |Sfname|Slname |SDOB               |SDOB1               |SWorkHr |Cfname |Clname  |CDOB       |CSex  |CDOB1               |Sbenefit |Min_Twenty|Max_Twenty|Cbenefit |Twenty_amount1|Twenty_amount2|Twenty_amount3|Twenty_amount4|Twenty_amount5|Trust  |Datetrust  |Bfname  |Blname |Relationship |Perc |SSN       |Mstatus |Gender_Self|MembershipID  | Street        |City    |ZipCode  |PrimaryPhType |PrimaryPhNo|SSSN      |SHeight  |SWeight  |Gender_Spouse| S12mnthsWeight |SPhoneType  |SPhoneNum   |Bank     |AccName |Rnum      |Anum	     |Frequency|pdfEnable |
|abe     |Dr.     |Paul   |Johnson|South Carolina |SYSDate - 43Y/0M/0D |45      |Prof.  |Mary  |Johnson|SYSDate - 54Y/0M/1D|SYSDate - 45Y/0M/0D |45      |James  |Johnson |CurrentDate|Male  |SYSDate - 26Y/0M/1D | 600000  | $100,000 |$2,000,000|5000     |$5,000        | $10,000      |$15,000       | $20,000      | $25,000      |Murphy |04/09/1974 |Adam    |Gill   |Spouse       |100  |564879925 |Married |Male       | 796258963    |3560 Bolden Ln |Dalzell |29040    |Home          |7419856987 | 741498695|5.0      |180      |Female       |220             |Mobile      | 7894567894 |abc bank |adam    |745688999 |35434354  |Monthly  |0         |

	 						
	 						
@AbeRegression_1_11
Scenario Outline: <ABESC11> Application Submission for Child  only 5 YTL, AD&D, Hospital money insurance JET

	Given Test set up for "NYL" feature and "NYL_ABE" scenario
	Given Customer navigate to NYL "<Website>" 
	When Clicks on Apply now button
	Then Scroll down and click on I Attest To Having Read the Above Information button
	And Click on Child
	Then Select YES Radio button of Membership
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<Workhr>"
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
	And Selects Married question as No for Child
  	And Honorably Discharged question as No
	And Click on Add Child button on Screen
	And Clicks on next button
	And Validate Age Restriction Message
	And Clicks Edit button for Child Added	
	And Enters DOB for Child as "<CDOB1>"	
	And Click on Add Child button on Screen
	And Clicks on next button
	Then Product page details are displayed to user
	And Selects product FiveYTL for Child
	And Selects product Accidental Death for Child
	And Selects product HMI for Child
	And Clicks on next button
	Then Click YES for Dependent Coverage information
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Child as "<Cbenefit>" under FiveYTL
	And Validates under FiveYTL the Benefit Amounts for Child Listed are: "<Term_amount1>","<Term_amount2>","<Term_amount3>","<Term_amount4>","<Term_amount5>"
	And Selects Benefit Amount for Child as "<Cbenefit1>" under ADDI
	And Validates under ADDI the Benefit Amounts for Child Listed are: "<ACC_amount1>","<ACC_amount2>"
	And Selects Benefit Amount for Child as "<Cbenefit2>" under HMI
	And Validates under HMI the Benefit Amounts for Child Listed are: "<HMI_amount1>","<HMI_amount2>","<HMI_amount3>","<HMI_amount4>","<HMI_amount5>","<HMI_amount6>","<HMI_amount7>"
	And Clicks on next button
	Then Contact Details page is displayed to user and enters contact Details for self as "<SSN>","<Mstatus>","<Gender_Self>","<MembershipID>","<Street>","<City>","<ZipCode>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects Residential Radio Button	  
	And Clicks on next button
	Then Application Summary Page is displayed to user
	And Verify Benefit Amount for Child as "<Cbenefit>" under FiveYTL
	And Verify Benefit Amount for Child as "<Cbenefit1>" under ADDI	
	And Verify Benefit Amount for Child as "<Cbenefit2>" under HMI
	And Verify Child name as "<Cfname>","<Clname>"	
	And Clicks on next button
	Then Payment Information Page is displayed to user and user Selects Payment option as Bank for FiveYTL Product																																	
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"																																	
	And Clicks on Save button
	And Selects Frequency for FiveYTL Product and reviews "<Frequency>"
	And Selects Payment Method for ADDI
	And Selects Radio Button for existing payment method
	And Clicks on Save button																																	
	And Selects Frequency for Accidental Death Product and reviews "<Frequency>"																																
	And Selects Payment Method for HMI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Hospital Money Insurance Product and reviews "<Frequency>"
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
	And Verify PDF information as "<pdfScenario>","<pdfEnable>"
	
	
		
Examples:
|Website |Title   |Fname  |Lname |State    |DOB                 |Workhr  |Cfname |Clname |CDOB               |CDOB1               |Csex   |Cbenefit  |Term_amount1|Term_amount2|Term_amount3|Term_amount4|Term_amount5 |Cbenefit1 |ACC_amount1|ACC_amount2 |Cbenefit2  |HMI_amount1 |HMI_amount2 |HMI_amount3 |HMI_amount4 |HMI_amount5 |HMI_amount6 |HMI_amount7  |SSN       |Mstatus |Gender_Self  |MembershipID|Street          |City    |ZipCode|PrimaryPhType |PrimaryPhNo |Bank     |AccName |Rnum      |Anum         |Frequency |pdfEnable|
|abe     |Mr.     |Peter  |Parker|Oklahoma |SYSDate - 40Y/0M/0D |45      |John   |Parker |SYSDate - 28Y/0M/0D|SYSDate - 14Y/0M/0D | Female| 20000    |$5,000      | $10,000    |$15,000     | $20,000    | $25,000     | 25000    |$25,000    |$50,000     | 250       |$200        |$250        |$300        |$350        |$400        |$450        |$500         |789147258 |Single  |Male         |7418529     |19710 S Dobbs Rd|Newalla |74857  |Business      |7894567894  |abc bank |adam    |745688999 |354343548588 |Monthly   |0        |



@AbeRegression_1_12
Scenario Outline: <ABESC12> Application Submission for Self, Spouse and Child ADDI and Hospitality(primary trust, contingent individual)  

    Given Test set up for "NYL" feature and "NYL_ABE" scenario	
	Given Customer navigate to NYL "<Website>" 
	When Clicks on Apply now button
	Then Scroll down and click on I Attest To Having Read the Above Information button
	Then Click on Self                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
	Then Click on Spouse
	And Click on Child
	Then Select YES Radio button of Membership
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<Workhr>"
	And Select radio button Yes for Spouse is Member 
    And Enters Eligibility details for Spouse as "<STitle>","<Sfname>","<Slname>","<SDOB>","<Sworkhr>"
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<CSex>"
	And Selects Married question as No for Child
  	And Honorably Discharged question as No
	And Click on Add Child button on Screen
	And Clicks on next button
	Then Product page details are displayed to user
	Then Validate FiveYTL,TenYTL,TwentyYTL,FiftyMBTL,ADDI,LTDPlus,LTD,MTDI,RDI,POEDI,CI and HMI products are available
	And Selects product Accidental Death for Self
	And Selects product Accidental Death for Spouse
	And Selects product Accidental Death for Child
	And Selects product HMI for Self
	And Selects product HMI for Spouse
	And Selects product HMI for Child
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under ADDI
	And Validates under ADDI the Benefit Slider Range as "<Min_ACC>" to "<Max_ACC>"
	And Selects Benefit Amount for Spouse as "<Sbenefit>" under ADDI
	And Validates under ADDI the Benefit Slider Range as "<Mins_ACC>" to "<Maxs_ACC>" for Spouse
	And Selects Benefit Amount for Child as "<Cbenefit>" under ADDI
	And Selects Benefit Amount for Self as "<Benefit1>" under HMI
	And Selects Benefit Amount for Spouse as "<Sbenefit1>" under HMI
	And Selects Benefit Amount for Child as "<Cbenefit1>" under HMI
	And Clicks on next button	
	Then Beneficiary Page is displayed to user	
	And Clicks on Add Beneficiary Button for Spouse	
	Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
	And User Enters Beneficiary details as "<Trust>","<Datetrust>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse
	Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
	And User Enters Beneficiary details as "<Trust>","<Datetrust>"
	And Clicks on OK button
	And Validate Error Message is displayed on Beneficiary Page
	And Clicks on Close button
	And Clicks on Add Beneficiary Button for Spouse
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relationship>","<Perc>"
	And Clicks on OK button
	And Clicks on next button
	Then Contact Details page is displayed to user and enters contact Details for self as "<SSN>","<Mstatus>","<Gender_Self>","<MembershipID>","<Street>","<City>","<ZipCode>"
	And Validates Height and Weight is not displayed for Self
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects Residential Radio Button	  
	And Enters contact Details for Spouse as mimimum details "<SSSN>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>" 
	And Validates Height and Weight is not displayed for Spouse
	And Clicks on next button
	Then Application Summary Page is displayed to user 
	And Clicks on next button
	Then Payment Information Page is displayed to user and user Selects Payment option as Bank Accidental Death Product
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"																																	
	And Clicks on Save button																																	
	And Selects Frequency for Accidental Death Product and reviews "<Frequency>"
	And Selects Payment Method for HMI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Hospital Money Insurance Product and reviews "<Frequency>"
	And Confirms I have read the Information Check Box on Payment Page																																
	And Clicks on next button
	And Validates I Understand Verbiage in Read and Sign Box
	And Validates Consent message in Read and Sign Box for NonUW
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
	And Verify PDF information as "<pdfScenario>","<pdfEnable>"
	

Examples:
|Website|Title |Fname |Lname |State  |DOB                 |Workhr  |STitle |Sfname |Slname |SDOB               |Sworkhr |Cfname |Clname |CDOB               |CSex  |Benefit |Min_ACC   |Max_ACC |Sbenefit |Mins_ACC |Maxs_ACC|Cbenefit  |Benefit1|Sbenefit1|Cbenefit1|Trust  |Datetrust           |Bfname  |Blname|Relationship |Perc | SSN      |Mstatus|Gender_Self |MembershipID | Street           |City     |ZipCode|PrimaryPhType |PrimaryPhNo |SSSN      |Gender_Spouse |SPhoneType |SPhoneNum  |Bank     |AccName |Rnum      |Anum	     |Frequency|pdfEnable|
|Abe    |Dr.   |Carter|Smith |Texas  |SYSDate - 43Y/0M/0D |30      |Prof.  |Wanda  |Smith  |SYSDate - 55Y/0M/0D|30      |Kurian |Smith  |SYSDate - 13Y/0M/0D|Male  |400000  |$100,000  |$500,000|500000   |$100,000 |$500,000| 25000    |300     |300      |300      |Murphy |SYSDate - 44Y/0M/0D |Carter  |Smith |Spouse       |100  |7418529637|Married|Male        |789456       | 516 W Central Ave|Amarillo |79108  |Business      |7894568956  |741968596 |Female        |Mobile     |6597894589 |abc bank |adam    |745688999 |35434354588 |Monthly  |0        |	



@AbeRegression_13
Scenario Outline: <ABESC13> Application Submission for Self,  Spouse, Child All eligible produscts and riders JET(No benes)                     
	Given Test set up for "NYL" feature and "NYL_ABE" scenario
	Given Customer navigate to NYL "<Website>" 
	When Clicks on Apply now button
	Then Scroll down and click on I Attest To Having Read the Above Information button
	Then Click on Self                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
	Then Click on Spouse
	And Click on Child
	Then Select YES Radio button of Membership
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	And Select radio button NO for Spouse is Member 
	And Enters Eligibility details for Spouse as "<STitle>","<Sfname>","<Slname>","<SDOB>","<Sworkhr>"
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<CSex>"
	And Selects Married question as No for Child
  	And Honorably Discharged question as No
	And Click on Add Child button on Screen
	And Clicks on next button
	Then Product page details are displayed to user 
	And Verify Available Product List FiveYTL,TenYTL,TwentyYTL,ADD,LTDPlus,LTD,MTD,RTDI,PO,HO,CI
	And Selects the product for Self, Spouse and Children for Five Year Banded Term Life insurance
	And Selects product TenYTL for Self
	And Selects product TenYTL for Spouse
	And Verify Child icon is disabled for TenYTL
	And Selects product TwentyYTL for Self
	And Selects product TwentyYTL for Spouse
	And Verify Child icon is disabled for TwentyYTL
	And Selects product Accidental Death for Self
	And Selects product Accidental Death for Spouse
	And Selects product Accidental Death for Child	
	And Selects product LTDPlus for Self
	And Selects product LTDPlus for Spouse
	And Selects product LTD for Self
	And Selects product LTD for Spouse
	And Selects product MTDI for Self
	And Selects product MTDI for Spouse
	And Selects product RDI for Self
	And Selects product POEDI for Self
	And Selects product CI for Self
	And Selects product CI for Spouse
	And Selects product HMI for Self
	And Selects product HMI for Spouse
	And Selects product HMI for Child
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self	
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
	And Enters Monthly Income for Self as "<MonthlyIncome>"
	And Enters details for Monthly Expense and Percentage Responsible as "<MonthExpense>","<PercResp>"
	And Selects Answer as No for all additional questions of Group Disability Insurance for Self	
	And Enters Monthly Income as "<SMonthlyIncome>" for Spouse
	And Selects Answer as No for Additional Questions as No for all for Spouse of Group Disability Insuranse
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Click on Long-Term Disability Plus Insurance on Request Coverage Page
	And Validates under LTDPlus the Benefit Slider Range as "<Min_LTDP>" to "<Max_LTDP1>"
	And Click on Long-Term Disability Insurance on Request Coverage Page
	And Validates under LTD the Benefit Slider Range as "<Min_LTD>" to "<Max_LTD1>" 
	And Click on Mid-Term Disability Insurance on Request Coverage Page
	And Validates under MTDI the Benefit Slider Range as "<Min_MID>" to "<Max_MID1>"
	And Clicks on Back or Previous button	
	And Enters Monthly Income for Self as "<MonthlyIncome1>"
	And Clicks on next button
	And Click on Long-Term Disability Plus Insurance on Request Coverage Page
	And Validates under LTDPlus the Benefit Slider Range as "<Min_LTDP>" to "<Max_LTDP2>"
	And Click on Long-Term Disability Insurance on Request Coverage Page
	And Validates under LTD the Benefit Slider Range as "<Min_LTD>" to "<Max_LTD2>" 
	And Click on Mid-Term Disability Insurance on Request Coverage Page
	And Validates under MTDI the Benefit Slider Range as "<Min_MID>" to "<Max_MID2>"
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under FiveYTL	
	And Selects Chronic Illness Rider for FiveYTL Product Self
	And Selects Benefit Amount for Spouse as "<Sbenefit>" under FiveYTL	
	And Selects Chronic Illness Rider for FiveYTL Product Spouse
	And Selects Benefit Amount for Child as "<Cbenefit>" under FiveYTL	
	And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
	And Selects Waiver of Premium Rider for TenYear for Self
	And Selects Benefit Amount for Spouse as "<Sbenefit1>" under TenYTL
	And Selects Waiver of Premium Rider for TenYear Spouse
	And Selects Benefit Amount for Self as "<Benefit2>" under TwentyYTL
	And Selects Waiver Rider for Twenty Year Product
	And Selects Benefit Amount for Spouse as "<Sbenefit2>" under TwentyYTL
	And Selects Waiver Rider for Twenty Year Product Spouse
	And Selects Benefit Amount for Self as "<Benefit3>" under ADDI
	And Selects Benefit Amount for Spouse as "<Sbenefit3>" under ADDI
	And Selects Benefit Amount for Child as "<Cbenefit3>" under ADDI
	And Selects Benefit Amount for Self as "<Benefit4>" under LTDPlus
	And Selects Wait Period for Self as "<WaitPeriod>" under LTDPlus
	And Selects Catastrophic Disability Benefit Rider for LDTP
	And Selects Cost of Living Adjustment Rider under LTDP Product
	And Selects Benefit Amount for Spouse as "<Sbenefit4>" under LTDPlus
	And Selects Wait Period for Spouse as "<SWaitPeriod>" under LTDPlus
	And Selects Catastrophic Disability Benefit Rider for Spouse under LTDPlus
	And Selects Cost of Living Adjustment Rider for LTDP Product for Spouse
	And Selects Benefit Amount for Self as "<Benefit5>" under LTD
	And Selects Wait Period for Self as "<WaitPeriod1>" under LTD
	And Selects Cost of Living Adjustment Rider under LTD product
	And Selects Benefit Amount for Spouse as "<Sbenefit5>" under LTD
	And Selects Wait Period for Spouse as "<SWaitPeriod1>" under LTD
	And Selects Cost of Living Adjustment Rider for Spouse under LTD
	And Selects Benefit Amount for Self as "<Benefit6>" under MTDI
	And Selects Wait Period for Self as "<WaitPeriod2>" under MTDI
	And Selects Benefit Amount for Spouse as "<Sbenefit6>" under MTDI
	And Selects Wait Period for Spouse as "<SWaitPeriod2>" under MTDI
	And Selects Benefit Amount for Self as "<Benefit7>" under RDI
	And Selects Wait Period for Self as "<WaitPeriod3>" under RDI
	And Selects Benefit Amount for Self as "<Benefit8>" under POEDI
	And Selects Benefit Amount for Self as "<Benefit9>" under CI
	And Selects Benefit Amount for Spouse as "<Sbenefit9>" under CI
	And Selects Benefit Amount for Self as "<Benefit10>" under HMI
	And Selects Surgical Option Rider for Self under HMI
	And Selects Surgical Amount as "<SAmount>"
	And Selects Benefit Amount for Spouse as "<Sbenefit10>" under HMI
	And Selects Benefit Amount for Child as "<Cbenefit10>" under HMI
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on next button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<ZipCode>"
	And Select DrivingLicense Question as Yes and Enters details for driving info for Self as "<DrivingLicenseNo>","<DrivingLicenseState>"
	And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page 
	And Selects No for Travel Question Non QD for Self	
	And Selects No for Travel Question QD for Self	
	And Selects No Radio button for Tobacco Question Self
	And Selects Residential Radio Button
	And Selects Yes Radio Button for Business Address
	And Enters Business Details as "<BusinessName>","<BusinessType>"
	And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>"
	And Select DrivingLicense Question as Yes and Enters details for Spouse as "<SDrivingLicenseNo>","<SDrivingLicenseState>"
	And Enters WeightTwelveMonths ago details for Spouse as "<S12mnthsWeight>"
   	And Answer all other questions of Spouse as No for Nicotin and Outside US Twelve
   	And Select No for Travel Question-SixMonths for Spouse
	And Clicks on next button
	Then Application Summary Page is displayed to user
	And Verify Child name as "<Cfname>","<Clname>" 
	And Verify Benefit Amount for Self as "<Benefit>" under FiveYTL
	And Verify Benefit Amount for Self as "<Benefit1>" under TenYTL
	And Verify Benefit Amount for Self as "<Benefit2>" under TwentyYTL
	And Verify Benefit Amount for Self as "<Benefit3>" under ADDI
	And Verify Benefit Amount for Self as "<Benefit4>" under LTDP
	And Verify Benefit Amount for Self as "<Benefit5>" under LTD
	And Verify Benefit Amount for Self as "<Benefit6>" under MTDI
	And Verify Benefit Amount for Self as "<Benefit7>" under RDI
	And Verify Benefit Amount for Self as "<Benefit8>" under POEDI
	And Verify Benefit Amount for Self as "<Benefit9>" under CI
	And Verify Benefit Amount for Self as "<Benefit10>" under HMI
	And Verify Benefit Amount for Spouse as "<Sbenefit>" under FiveYTL
	And Verify Benefit Amount for Spouse as "<Sbenefit1>" under TenYTL
	And Verify Benefit Amount for Spouse as "<Sbenefit2>" under TwentyYTL
	And Verify Benefit Amount for Spouse as "<Sbenefit3>" under ADDI
	And Verify Benefit Amount for Spouse as "<Sbenefit4>" under LTDP
	And Verify Benefit Amount for Spouse as "<Sbenefit5>" under LTD
	And Verify Benefit Amount for Spouse as "<Sbenefit6>" under MTDI
	And Verify Benefit Amount for Spouse as "<Sbenefit9>" under CI
	And Verify Benefit Amount for Spouse as "<Sbenefit10>" under HMI
	And Verify Benefit Amount for Child as "<Cbenefit>" under FiveYTL
	And Verify Benefit Amount for Child as "<Cbenefit3>" under ADDI
	And Verify Benefit Amount for Child as "<Cbenefit10>" under HMI	
	And Clicks on next button
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<Vpassword>" 
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
	Then Payment Authorization Letter is displayed to user and clicks on Continue																																	
	And Signs Payment Authorization Letter																																	
	And Clicks on next button to finish	
	Then Payment Authorization Letter is displayed to user and clicks on Continue																																	
	And Signs Payment Authorization Letter																																	
	And Clicks on next button to finish		
	Then Your Insurance Request Decision Page is displayed to user
	And Clicks on next button
	And Selects Payment Method for FiveYTL
	Then Selects Payment option as Bill Me
	And Clicks on Save button
	And Selects Frequency for FiveYTL Product and reviews "<Frequency>"
	And Selects Payment Method for TenYTL
	Then Selects Payment option as Bill Me
	And Clicks on Save button
	And Selects Frequency for Ten Year Product and reviews "<Frequency1>"
	And Selects Payment Method for TwentyYTL
	Then Selects Payment option as Bill Me
	And Clicks on Save button
	And Selects Frequency for Twenty Year Product "<Frequency2>"
	And Selects Payment Method for ADDI
	Then Selects Payment option as Bill Me
	And Clicks on Save button
	And Selects Frequency for Accidental Death Product and reviews "<Frequency3>"
	And Selects Payment Method for LTDPlus
	Then Selects Payment option as Bill Me
	And Clicks on Save button
	And Selects Frequency for Long Term Disability Plus Product "<Frequency4>"
	And Selects Payment Method for LTD
	Then Selects Payment option as Bill Me
	And Clicks on Save button
	And Selects Frequency for Long Term Disability Product "<Frequency5>"
	And Selects Payment Method for MTDI
	Then Selects Payment option as Bill Me
	And Clicks on Save button
	And Selects Frequency for Mid Term Disability Product "<Frequency6>"
	And Selects Payment Method for RTDI
	Then Selects Payment option as Bill Me
	And Clicks on Save button
	And Selects Frequency for Retirement Disability Product "<Frequency7>"
	And Selects Payment Method for POEDI
	Then Selects Payment option as Bill Me
	And Clicks on Save button
	And Selects Frequency for Professional Disability Product "<Frequency8>"
	And Selects Payment Method for CI
	Then Selects Payment option as Bill Me
	And Clicks on Save button
	And Selects Frequency for Critical Illness Product "<Frequency9>"
	And Selects Payment Method for HMI
	Then Selects Payment option as Bill Me
	And Clicks on Save button
	And Selects Frequency for Hospital Money Insurance Product and reviews "<Frequency10>"
	And Clicks on next button
	Then Thank you page is displayed to user
	And Verify that two confirmation number is generated for "<Website>"
	
	
	

Examples:
|Website |Title   |Fname |Lname             |Gender_Self|State  |DOB        |WorkHr  |STitle |Sfname |Slname            |Gender_Spouse|SDOB       |Sworkhr |Cfname |Clname |CDOB               |CSex |MonthlyIncome |MonthExpense|PercResp |SMonthlyIncome |MonthlyIncome1|Min_LTDP |Max_LTDP1|Min_LTD |Max_LTD1|Min_MID |Max_MID1 |Max_LTDP2 |Max_LTD2 |Max_MID2|Benefit    |Sbenefit   |Cbenefit|Benefit1  | Sbenefit1 |Benefit2  | Sbenefit2 |Benefit3  |Sbenefit3 | Cbenefit3|Benefit4|WaitPeriod|Sbenefit4  |SWaitPeriod|Benefit5  |WaitPeriod1|Sbenefit5  |SWaitPeriod1 |Benefit6   |WaitPeriod2 |Sbenefit6   |SWaitPeriod2|Benefit7  |WaitPeriod3|Benefit8 |Benefit9  |Sbenefit9 |Benefit10| SAmount |Sbenefit10|Cbenefit10 |SSN      |Mstatus  |Height|Weight |Gender_self  |Weightbeforeyear|DrivingLicenseNo |DrivingLicenseState  |MemberId        |StreetAddress    |City  |ZipCode|PrimaryPhType |PrimaryPhNo|BusinessName|BusinessType    | SSSN    | SHeight | SWeight | Gender_Spouse|S12mnthsWeight |SDrivingLicenseNo|SDrivingLicenseState| SPhoneType  |SPhoneNum  |Password |Vpassword|Frequency |Frequency1    |Frequency2|Frequency3|Frequency4    |Frequency5|Frequency6|Frequency7    |Frequency8|Frequency9|Frequency10   |pdfEnable|
|abe     |Dr.     |Jack  |Snmmmmtestcasejm  |Male       |Kansas |02/06/1977 |45      |Mrs.   |Thalia |Snmmmmtestcasesg  |Female       |09/04/1978 |45      |John   |Gill   |SYSDate - 4Y/0M/0D |Male |10000         |5000        |10       |20000          |7000          | $100    | $6,000  |$100    | $6,000 |$100    | $6,000  |$4,600    |$4,600   |$4,600  | $120,000  |$90,000    |5000    |$140,000  |110000     |$160,000  |130000     |$150,000  |100000    |25000     |$1,000  |60 Days   |$1,000     |90 Days    |$1,000    | 90 Days   |$1,000     |90 Days      |$1,000     | 90 Days    |$1,000      |90 Days     |$1,000    | 180 Days  |$1,500   | $10,000  | $10,000  |300      |1000     |300       |300        |070000000|Married  |  5.0 | 188   |Male         | 200            | K02445440       |Kansas               |545345343543543 |3304 SW 29th Ter |Topeka| 66614 |Mobile        |7412589963 |Arthur Co   |Sole Proprietary|990067501|5.0      |188      |Female        | 200           |7711440          |North Carolina      | Mobile      |6767564545 |Adam@123 |Adam@123 |Quarterly | Semiannually |Annually  |Quarterly | Semiannually |Annually  |Quarterly | Semiannually |Annually  |Quarterly | Semiannually |0        |




@AbeRegression_14
Scenario Outline: <ABESC14> Complete flow till Read & Sign Page with 20 different States one by one in loop Application Submission for Self      
					
	Given Test set up for "NYL" feature and "NYL_ABE" scenario					
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	And Scroll down and click on I Attest To Having Read the Above Information button
	Then Click on Self 
	Then Select YES Radio button of Membership 
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"  
	And Clicks on next button 				
	And Selects product FiveYTL for Self
	And Selects product TenYTL for Self
	And Selects product TwentyYTL for Self
	And Selects product FiftyYTL for Self
	And Selects product Accidental Death for Self
	And Selects product LTDPlus for Self
	And Selects product LTD for Self					
	And Selects product MTDI for Self					
	And Selects product RDI for Self					
	And Selects product POEDI for Self					
	And Selects product CI for Self					
	And Selects product HMI for Self					
	And Clicks on next button					
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self					
	And Enters Monthly Income for Self as "<MonthlyIncome>"					
	And Enters details for Monthly Expense and Percentage Responsible as "<Mexpense>","<Percresp>"
	And Selects Answer as No for all additional questions of Group Disability Insurance for Self					
	And Clicks on next button					
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under FiveYTL				
	And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL					
	And Selects Benefit Amount for Self as "<Benefit2>" under TwentyYTL					
	And Selects Benefit Amount for Self as "<Benefit3>" under FiftyYTL					
	And Selects Benefit Amount for Self as "<Benefit4>" under ADDI					
	And Selects Benefit Amount for Self as "<Benefit5>" under LTDPlus					
	And Selects Wait Period for Self as "<WaitPeriod>" under LTDPlus					
	And Selects Benefit Amount for Self as "<Benefit6>" under LTD					
	And Selects Wait Period for Self as "<WaitPeriod1>" under LTD					
	And Selects Benefit Amount for Self as "<Benefit7>" under MTDI					
	And Selects Wait Period for Self as "<WaitPeriod2>" under MTDI					
	And Selects Benefit Amount for Self as "<Benefit8>" under RDI					
	And Selects Wait Period for Self as "<WaitPeriod3>" under RDI					
	And Selects Benefit Amount for Self as "<Benefit9>" under POEDI					
	And Selects Benefit Amount for Self as "<Benefit10>" under CI					
	And Selects Benefit Amount for Self as "<Benefit11>" under HMI					
	And Clicks on next button					
	Then Beneficiary Page is displayed to user					
	And Clicks on Add Beneficiary button for Self
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relationship>","<Perc>"
    And Clicks on OK button				
	And Clicks on Skip Beneficiary Button					
	And Delete box is displayed and clicks on Yes
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN_Self>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"			
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No for Travel Question Non QD for Self
	And Selects No Radio button for Tobacco Question Self 
	And Selects Yes Radio Button for Business Address
	And Enters Business Details as "<BusinessName>","<BusinessType>"
	And Selects Residential Radio Button					
	And Clicks on next button					
	Then Application Summary Page is displayed to user 					
	And Clicks on next button					
	Then Payment page details are displayed to user and skip payment					
	Then Authorize page details are displayed to user 					
	And Validate Authorization message in Read and Sign Box					
	And Validate Fraud Notice CO in Read and Sign Box					
	And Validate Consent message in Read and Sign Box					
	And Validate Dividend message in Dividend Box					
	And Validate FiveYTL message in Dividend Box					
	And Validate TenYTL message in Dividend Box					
	And Validate TwentyYTL message in Dividend Box					
	And Validate FiftyMBTL message in Dividend Box					
	And Validate ADDI message in Dividend Box					
	And Validate LTDPlus message in Dividend Box					
	And Validate LTD message in Dividend Box					
	And Validate MTDI message in Dividend Box					
	And Validate RDI message in Dividend Box					
	And Validate POEDI message in Dividend Box					
	And Validate CI message in Dividend Box					
	And Validate HMI message in Dividend Box					
	And Validate Election message in Dividend Box					
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
	And Navigate back to Eligibility page 					
	And Enter New State as "<State21>"					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	Then Payment page details are displayed to user and skip payment
	And Validate Fraud Notice CT in Read and Sign Box 
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
	Then Payment page details are displayed to user and skip payment
	And Validate Fraud Notice MN in Read and Sign Box
	And Validate Authorization Message MN in Read and Sign Box
	
Examples:					
|Website |Title |Fname |Lname |State      |DOB                 |WorkHr |MonthlyIncome |Mexpense |Percresp |Benefit |Benefit1 |Benefit2 |Benefit3 |Benefit4 |Benefit5 |WaitPeriod |Benefit6 |WaitPeriod1 |Benefit7 |WaitPeriod2 |Benefit8 |WaitPeriod3 |Benefit9 |Benefit10 |Benefit11|Bfname  |Blname |Relationship |Perc  |SSN_Self   |Mstatus |Height |Weight |Gender_Self|MemberId        |StreetAddress|City       |Zip   |PrimaryPhType |PrimaryPhNo|BusinessName|BusinessType|State1     |State2  |State3   |State4    |State5       |State6       |State7   |State8               |State9  |State10 |State11 |State12    |State13  |State14  |State15    |State16   |State17    |State18 |State19|State20    |State21     |State22      |pdfScenario|pdfScenario1|pdfEnable|pdfName                               |pdfName1                   |			
|abe     |Mr.   |John  |Snow  |Colorado   |SYSDate - 53Y/0M/0D |45     |10000         |1000     |10       |600000  |600000   |100000   |25000    |100000   |2000     |90 Days    |2000     |90 Days     |1000     |90 Days     |1500     |180 Days    |1000     |5000      |300      |Daenrys |Snow   |Spouse       |100   |553-43-4348|Single  |6.0    |180    |Male       |545345343543543 |1338 Phay Ave|Canon City |81212 |Mobile        |5343545434 |Arthur Corp |Partnership |California |Alabama |Arkansas |Louisiana |Pennsylvania |Rhode Island |Maryland |District of Columbia |Florida |Kansas  |Maine   |New Jersey |New York |Oklahoma |Puerto Rico|Tennessee |Washington |Virginia|Wyoming|New Mexico |Connecticut |Minnesota    |ABE15_WM   |ABE15_NM    |1        |Important Notice All except NM 2 08.12|Important Notice NM 2 08.12|					
 
 
@AbeRegression_15
Scenario Outline:<ABESC15_1> Complete work flow of application Self only  with Term Life Insurance       
       
       Given Test set up for "NYL" feature and "NYL_ABE" scenario
       Given Customer navigate to NYL "<Website>" 
       When Clicks on Apply now button
       Then Scroll down and click on I Attest To Having Read the Above Information button
       Then Select YES Radio button of Membership 
       Then Click on Self
       And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
       And Clicks on next button
       Then Product page details are displayed to user
       And Selects product FiveYTL for Self
       And Clicks on next button
       Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
       And Clicks on next button    
       Then Request Coverage page is displayed to user
		And Selects Benefit Amount for Self as "<Benefit>" under FiveYTL	
       And Clicks on next button
       Then Beneficiary Page is displayed to user
       And Clicks on next button
       Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
       And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
       And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
       And Selects No Radio button for Tobacco Question Self
       And Selects No Radio button for Driving Licensing Question for Self
       And Selects No for Travel Question QD for Self
       And Selects Residential Radio Button     
       And Clicks on next button
       Then Application Summary Page is displayed to user
       And Clicks on next button
       Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<Vpassword>" 
       And Clicks on Next and OK Button
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
       Then Payment Information Page is displayed to user and user Selects Payment option as Bank for FiveYTL Product
       And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
       And Clicks on Save button
       And Selects Frequency for FiveYTL Product and reviews "<Frequency>"
       And Confirms I have read the Information Check Box on Payment Page   
       And Clicks on next button
       Then Payment Authorization Letter is displayed to user and clicks on Continue
       And Signs Payment Authorization Letter
       And Clicks on next button to finish
       Then Thank you page is displayed to user
       And Verify that Confirmation number is generated for "<Website>"
       
       
       
Examples:     
       
       
|Website |Title   |Fname  |Lname            |State     |DOB        |WorkHr    |Benefit     |SSN       |Mstatus |Height|Weight|Gender_Self|Wt12MonthAgo|MemberId        |StreetAddress |City      |Zip  |PrimaryPhType|PrimaryPhNo |BusinessName |BusinessType      |Password |Vpassword  |Bank     |AccName   |Rnum      |Anum             |Frequency|pdfEnable| 
|abe     |Prof.   |Rayna  |Snmmmmtestcasesi |California|07/01/1974 |45        | 100000     |061000002 |Married |5.0   |180   |Male       |200         |545345343543543 |Street,123@   |providence|00001| Mobile      | 5343543543 |Arthur Corp  |Sole Proprietary  |Adam@123 |Adam@123   |abc bank |adam      |745688999 |35434354879988588|Monthly  |0        |    
       

@AbeRegression_16
Scenario Outline:<ABESC15_2> Complete work flow of application Self only  with Term Life Insurance       
       
       Given Test set up for "NYL" feature and "NYL_ABE" scenario
       Given Customer navigate to NYL "<Website>" 
       When Clicks on Apply now button
       Then Scroll down and click on I Attest To Having Read the Above Information button
       Then Select YES Radio button of Membership 
       Then Click on Self
       And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
       And Clicks on next button
       Then Product page details are displayed to user
       And Selects product FiveYTL for Self
       And Clicks on next button
       Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
       And Clicks on next button    
       Then Request Coverage page is displayed to user
		And Selects Benefit Amount for Self as "<Benefit>" under FiveYTL	
       And Clicks on next button
       Then Beneficiary Page is displayed to user
       And Clicks on next button
       Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
       And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
       And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
       And Selects No Radio button for Tobacco Question Self
       And Selects No Radio button for Driving Licensing Question for Self
       And Selects No for Travel Question QD for Self
       And Selects Residential Radio Button     
       And Clicks on next button
       Then Application Summary Page is displayed to user
       And Clicks on next button
       Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<Vpassword>" 
       And Clicks on Next and OK Button
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
       Then Payment Information Page is displayed to user and user Selects Payment option as Bank for FiveYTL Product
       And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
       And Clicks on Save button
       And Selects Frequency for FiveYTL Product and reviews "<Frequency>"
       And Confirms I have read the Information Check Box on Payment Page   
       And Clicks on next button
       Then Payment Authorization Letter is displayed to user and clicks on Continue
       And Signs Payment Authorization Letter
       And Clicks on next button to finish
       Then Thank you page is displayed to user
       And Verify that Confirmation number is generated for "<Website>"
       
       
       
Examples:     
       
       
|Website |Title   |Fname  |Lname            |State      |DOB        |WorkHr    |Benefit    |SSN       |Mstatus |Height|Weight|Gender_Self|Wt12MonthAgo|MemberId        |StreetAddress |City      |Zip  |PrimaryPhType|PrimaryPhNo |BusinessName |BusinessType      |Password |Vpassword  |Bank     |AccName   |Rnum      |Anum             |Frequency|pdfEnable| 
|abe     |Prof.   |Rayna  |Snmmmmtestcasesi |Connecticut|07/01/1974 |45        | 100000    |061000002 |Married |5.0   |180   |Male       |200         |545345343543543 |Street,123@   |providence|00001| Mobile      | 5343543543 |Arthur Corp  |Sole Proprietary  |Adam@123 |Adam@123   |abc bank |adam      |745688999 |35434354879988588|Monthly  |0        |    
       

@AbeRegression_17
Scenario Outline:<ABESC15_3> Complete work flow of application Self only  with Term Life Insurance       
       
       Given Test set up for "NYL" feature and "NYL_ABE" scenario
       Given Customer navigate to NYL "<Website>" 
       When Clicks on Apply now button
       Then Scroll down and click on I Attest To Having Read the Above Information button
       Then Select YES Radio button of Membership 
       Then Click on Self
       And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
       And Clicks on next button
       Then Product page details are displayed to user
       And Selects product FiveYTL for Self
       And Clicks on next button
       Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
       And Clicks on next button    
       Then Request Coverage page is displayed to user
		And Selects Benefit Amount for Self as "<Benefit>" under FiveYTL	
       And Clicks on next button
       Then Beneficiary Page is displayed to user
       And Clicks on next button
       Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
       And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
       And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
       And Selects No Radio button for Tobacco Question Self
       And Selects No Radio button for Driving Licensing Question for Self
       And Selects No for Travel Question QD for Self
       And Selects Residential Radio Button     
       And Clicks on next button
       Then Application Summary Page is displayed to user
       And Clicks on next button
       Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<Vpassword>" 
       And Clicks on Next and OK Button
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
       Then Payment Information Page is displayed to user and user Selects Payment option as Bank for FiveYTL Product
       And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
       And Clicks on Save button
       And Selects Frequency for FiveYTL Product and reviews "<Frequency>"
       And Confirms I have read the Information Check Box on Payment Page   
       And Clicks on next button
       Then Payment Authorization Letter is displayed to user and clicks on Continue
       And Signs Payment Authorization Letter
       And Clicks on next button to finish
       Then Thank you page is displayed to user
       And Verify that Confirmation number is generated for "<Website>"
       
       
       
Examples:     
       
       
|Website |Title   |Fname  |Lname            |State       |DOB        |WorkHr    |Benefit    |SSN       |Mstatus |Height|Weight|Gender_Self|Wt12MonthAgo|MemberId        |StreetAddress |City      |Zip  |PrimaryPhType|PrimaryPhNo |BusinessName |BusinessType      |Password |Vpassword  |Bank     |AccName   |Rnum      |Anum             |Frequency|pdfEnable| 
|abe     |Prof.   |Rayna  |Snmmmmtestcasesi |Pennsylvania|07/01/1974 |45        | 100000     |061000002 |Married |5.0   |180   |Male       |200         |545345343543543 |Street,123@   |providence|00001| Mobile        | 5343543543 |Arthur Corp  |Sole Proprietary  |Adam@123 |Adam@123   |abc bank |adam      |745688999 |35434354879988588|Monthly  |0        |    
       

 
@AbeRegression_18
Scenario Outline:<ABESC15_4> Complete work flow of application Self only  with Term Life Insurance       
       
       Given Test set up for "NYL" feature and "NYL_ABE" scenario
       Given Customer navigate to NYL "<Website>" 
       When Clicks on Apply now button
       Then Scroll down and click on I Attest To Having Read the Above Information button
       Then Select YES Radio button of Membership 
       Then Click on Self
       And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
       And Clicks on next button
       Then Product page details are displayed to user
       And Selects product FiveYTL for Self
       And Clicks on next button
       Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
       And Clicks on next button    
       Then Request Coverage page is displayed to user
		And Selects Benefit Amount for Self as "<Benefit>" under FiveYTL	
       And Clicks on next button
       Then Beneficiary Page is displayed to user
       And Clicks on next button
       Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
       And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
       And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
       And Selects No Radio button for Tobacco Question Self
       And Selects No Radio button for Driving Licensing Question for Self
       And Selects No for Travel Question QD for Self
       And Selects Residential Radio Button     
       And Clicks on next button
       Then Application Summary Page is displayed to user
       And Clicks on next button
       Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<Vpassword>" 
       And Clicks on Next and OK Button
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
       Then Payment Information Page is displayed to user and user Selects Payment option as Bank for FiveYTL Product
       And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
       And Clicks on Save button
       And Selects Frequency for FiveYTL Product and reviews "<Frequency>"
       And Confirms I have read the Information Check Box on Payment Page   
       And Clicks on next button
       Then Payment Authorization Letter is displayed to user and clicks on Continue
       And Signs Payment Authorization Letter
       And Clicks on next button to finish
       Then Thank you page is displayed to user
       And Verify that Confirmation number is generated for "<Website>"
       
       
       
Examples:     
       
       
|Website |Title   |Fname  |Lname            |State    |DOB        |WorkHr    |Benefit    |SSN       |Mstatus |Height|Weight|Gender_Self|Wt12MonthAgo|MemberId        |StreetAddress |City      |Zip  |PrimaryPhType|PrimaryPhNo |BusinessName |BusinessType      |Password |Vpassword  |Bank     |AccName   |Rnum      |Anum             |Frequency|pdfEnable| 
|abe     |Prof.   |Rayna  |Snmmmmtestcasesi |Wisconsin|07/01/1974 |45        | 100000     |061000002 |Married |5.0   |180   |Male       |200         |545345343543543 |Street,123@   |providence|00001| Mobile        | 5343543543 |Arthur Corp  |Sole Proprietary  |Adam@123 |Adam@123   |abc bank |adam      |745688999 |35434354879988588|Monthly  |0        |    
       

@AbeRegression_19
Scenario Outline:<ABESC15_5> Complete work flow of application Self only  with Term Life Insurance       
       
       Given Test set up for "NYL" feature and "NYL_ABE" scenario
       Given Customer navigate to NYL "<Website>" 
       When Clicks on Apply now button
       Then Scroll down and click on I Attest To Having Read the Above Information button
       Then Select YES Radio button of Membership 
       Then Click on Self
       And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
       And Clicks on next button
       Then Product page details are displayed to user
       And Selects product FiveYTL for Self
       And Clicks on next button
       Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
       And Clicks on next button    
      Then Request Coverage page is displayed to user
		And Selects Benefit Amount for Self as "<Benefit>" under FiveYTL	
       And Clicks on next button
       Then Beneficiary Page is displayed to user
       And Clicks on next button
       Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
       And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
       And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
       And Selects No Radio button for Tobacco Question Self
       And Selects No Radio button for Driving Licensing Question for Self
       And Selects No for Travel Question QD for Self
       And Selects Residential Radio Button     
       And Clicks on next button
       Then Application Summary Page is displayed to user
       And Clicks on next button
       Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<Vpassword>" 
       And Clicks on Next and OK Button
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
       Then Payment Information Page is displayed to user and user Selects Payment option as Bank for FiveYTL Product
       And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
       And Clicks on Save button
       And Selects Frequency for FiveYTL Product and reviews "<Frequency>"
       And Confirms I have read the Information Check Box on Payment Page   
       And Clicks on next button
       Then Payment Authorization Letter is displayed to user and clicks on Continue
       And Signs Payment Authorization Letter
       And Clicks on next button to finish
       Then Thank you page is displayed to user
       And Verify that Confirmation number is generated for "<Website>"
       
       
       
Examples:     
       
       
|Website |Title   |Fname  |Lname            |State  |DOB        |WorkHr    |Benefit    |SSN       |Mstatus |Height|Weight|Gender_Self|Wt12MonthAgo|MemberId        |StreetAddress |City      |Zip  |PrimaryPhType|PrimaryPhNo |BusinessName |BusinessType      |Password |Vpassword  |Bank     |AccName   |Rnum      |Anum             |Frequency|pdfEnable| 
|abe     |Prof.   |Rayna  |Snmmmmtestcasesi |Vermont|07/01/1974 |45        | 100000     |061000002 |Married |5.0   |180   |Male       |200         |545345343543543 |Street,123@   |providence|00001| Mobile        | 5343543543 |Arthur Corp  |Sole Proprietary  |Adam@123 |Adam@123   |abc bank |adam      |745688999 |35434354879988588|Monthly  |0        |    
       
@AbeRegression_20
Scenario Outline:<ABESC15_6> Complete work flow of application Self only  with Term Life Insurance       
       
       Given Test set up for "NYL" feature and "NYL_ABE" scenario
       Given Customer navigate to NYL "<Website>" 
       When Clicks on Apply now button
       Then Scroll down and click on I Attest To Having Read the Above Information button
       Then Select YES Radio button of Membership 
       Then Click on Self
       And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
       And Clicks on next button
       Then Product page details are displayed to user
       And Selects product FiveYTL for Self
       And Clicks on next button
       Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
       And Clicks on next button    
       Then Request Coverage page is displayed to user
		And Selects Benefit Amount for Self as "<Benefit>" under FiveYTL
       And Clicks on next button
       Then Beneficiary Page is displayed to user
       And Clicks on next button
       Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
       And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
       And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
       And Validate "<Mstatus1>" is not displayed in Marital Status Drop Down
		And Validate "<Mstatus2>" is not displayed in Marital Status Drop Down
		And Validate Tobacco Question
       And Selects No Radio button for Tobacco Question Self
       And Selects No Radio button for Driving Licensing Question for Self
       And Selects No for Travel Question QD for Self
       And Selects Residential Radio Button     
       And Clicks on next button
       Then Application Summary Page is displayed to user
       And Clicks on next button
       Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<Vpassword>" 
       And Clicks on Next and OK Button
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
       Then Payment Information Page is displayed to user and user Selects Payment option as Bank for FiveYTL Product
       And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
       And Clicks on Save button
       And Selects Frequency for FiveYTL Product and reviews "<Frequency>"
       And Confirms I have read the Information Check Box on Payment Page   
       And Clicks on next button
       Then Payment Authorization Letter is displayed to user and clicks on Continue
       And Signs Payment Authorization Letter
       And Clicks on next button to finish
       Then Thank you page is displayed to user
       And Verify that Confirmation number is generated for "<Website>"
       
       
       
Examples:     
       
       
|Website |Title   |Fname  |Lname      |State        |DOB        |WorkHr    |Benefit    |SSN       |Mstatus |Height|Weight|Gender_Self|Wt12MonthAgo|MemberId     |StreetAddress |City      |Zip  |PrimaryPhType|PrimaryPhNo |BusinessName |BusinessType      |Password |Vpassword  |Mstatus1    |Mstatus2        |Bank       |AccName   |Rnum      |Anum             |Frequency|pdfEnable| 
|abe     |Prof.   |Talina |Snmmmmtef  |New Hampshire|07/01/1974 |45        | 100000    |990067411 |Married |5.0   |180   |Male       |200         |545693543543 |Street,123@   |providence|00001| Mobile      | 7923543543 |Arthur Corp  |Sole Proprietary  |Adam@123 |Adam@123   |Civil Union |Domestic Partner|abc bank   |adam      |745688999 |35434354879988588|Monthly  |0        |    
       
@AbeRegression_21
Scenario Outline:<ABESC15_7> Complete work flow of application Self only  with Term Life Insurance       
       
       Given Test set up for "NYL" feature and "NYL_ABE" scenario
       Given Customer navigate to NYL "<Website>" 
       When Clicks on Apply now button
       Then Scroll down and click on I Attest To Having Read the Above Information button
       Then Select YES Radio button of Membership 
       Then Click on Self
       And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
       And Clicks on next button
       Then Product page details are displayed to user
       And Selects product FiveYTL for Self
       And Clicks on next button
       Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
       And Clicks on next button    
       Then Request Coverage page is displayed to user
		And Selects Benefit Amount for Self as "<Benefit>" under FiveYTL
       And Clicks on next button
       Then Beneficiary Page is displayed to user
       And Clicks on next button
       Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
       And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
       And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
       And Selects No Radio button for Tobacco Question Self
       And Selects No Radio button for Driving Licensing Question for Self
       And Selects No for Travel Question QD for Self
       And Selects Residential Radio Button     
       And Clicks on next button
       Then Application Summary Page is displayed to user
       And Clicks on next button
       Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<Vpassword>" 
       And Clicks on Next and OK Button
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
       Then Payment Information Page is displayed to user and user Selects Payment option as Bank for FiveYTL Product
       And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
       And Clicks on Save button
       And Selects Frequency for FiveYTL Product and reviews "<Frequency>"
       And Confirms I have read the Information Check Box on Payment Page   
       And Clicks on next button
       Then Payment Authorization Letter is displayed to user and clicks on Continue
       And Signs Payment Authorization Letter
       And Clicks on next button to finish
       Then Thank you page is displayed to user
       And Verify that Confirmation number is generated for "<Website>"
       
       
       
Examples:     
       
       
|Website |Title   |Fname  |Lname            |State   |DOB        |WorkHr    |Benefit    |SSN       |Mstatus |Height|Weight|Gender_Self|Wt12MonthAgo|MemberId        |StreetAddress |City      |Zip  |PrimaryPhType|PrimaryPhNo |BusinessName |BusinessType      |Password |Vpassword  |Bank     |AccName   |Rnum      |Anum             |Frequency|pdfEnable| 
|abe     |Prof.   |Rayna  |Snmmmmtestcasesi |Missouri|07/01/1974 |45        | 100000     |061000002 |Married |5.0   |180   |Male       |200         |545345343543543 |Street,123@   |providence|00001| Mobile        | 5343543543 |Arthur Corp  |Sole Proprietary  |Adam@123 |Adam@123   |abc bank |adam      |745688999 |35434354879988588|Monthly  |0        |    
       

 @AbeRegression_22
Scenario Outline:<ABESC15_8> Complete work flow of application Self only  with Term Life Insurance       
       
       Given Test set up for "NYL" feature and "NYL_ABE" scenario
       Given Customer navigate to NYL "<Website>" 
       When Clicks on Apply now button
       Then Scroll down and click on I Attest To Having Read the Above Information button
       Then Select YES Radio button of Membership 
       Then Click on Self
       And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
       And Clicks on next button
       Then Product page details are displayed to user
       And Selects product FiveYTL for Self
       And Clicks on next button
       Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
       And Clicks on next button    
       Then Request Coverage page is displayed to user
		And Selects Benefit Amount for Self as "<Benefit>" under FiveYTL
       And Clicks on next button
       Then Beneficiary Page is displayed to user
       And Clicks on next button
       Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
       And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
       And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
       And Selects No Radio button for Tobacco Question Self
       And Selects No Radio button for Driving Licensing Question for Self
       And Selects No for Travel Question QD for Self
       And Selects Residential Radio Button     
       And Clicks on next button
       Then Application Summary Page is displayed to user
       And Clicks on next button
       Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<Vpassword>" 
       And Clicks on Next and OK Button
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
       Then Payment Information Page is displayed to user and user Selects Payment option as Bank for FiveYTL Product
       And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
       And Clicks on Save button
       And Selects Frequency for FiveYTL Product and reviews "<Frequency>"
       And Confirms I have read the Information Check Box on Payment Page   
       And Clicks on next button
       Then Payment Authorization Letter is displayed to user and clicks on Continue
       And Signs Payment Authorization Letter
       And Clicks on next button to finish
       Then Thank you page is displayed to user
       And Verify that Confirmation number is generated for "<Website>"
       
       
       
Examples:     
       
       
|Website |Title   |Fname  |Lname            |State         |DOB        |WorkHr    |Benefit    |SSN       |Mstatus |Height|Weight|Gender_Self|Wt12MonthAgo|MemberId        |StreetAddress |City      |Zip  |PrimaryPhType|PrimaryPhNo |BusinessName |BusinessType      |Password |Vpassword  |Bank     |AccName   |Rnum      |Anum             |Frequency|pdfEnable| 
|abe     |Prof.   |Rayna  |Snmmmmtestcasesi |North Carolina|07/01/1974 |45        | 100000     |061000002 |Married |5.0   |180   |Male       |200         |545345343543543 |Street,123@   |providence|00001| Mobile        | 5343543543 |Arthur Corp  |Sole Proprietary  |Adam@123 |Adam@123   |abc bank |adam      |745688999 |35434354879988588|Monthly  |0        |    
       

 
 
 
 @AbeRegression_23
Scenario Outline:<ABESC15_9> Complete work flow of application Self only  with Term Life Insurance       
       
       Given Test set up for "NYL" feature and "NYL_ABE" scenario
       Given Customer navigate to NYL "<Website>" 
       When Clicks on Apply now button
       Then Scroll down and click on I Attest To Having Read the Above Information button
       Then Select YES Radio button of Membership 
       Then Click on Self
       And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
       And Clicks on next button
       Then Product page details are displayed to user
       And Selects product FiveYTL for Self
       And Clicks on next button
       Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
       And Clicks on next button    
       Then Request Coverage page is displayed to user
		And Selects Benefit Amount for Self as "<Benefit>" under FiveYTL
       And Clicks on next button
       Then Beneficiary Page is displayed to user
       And Clicks on next button
       Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
       And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
       And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
       And Selects No Radio button for Tobacco Question Self
       And Selects No Radio button for Driving Licensing Question for Self
       And Selects No for Travel Question QD for Self
       And Selects Residential Radio Button     
       And Clicks on next button
       Then Application Summary Page is displayed to user
       And Clicks on next button
       Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<Vpassword>" 
       And Clicks on Next and OK Button
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
       Then Payment Information Page is displayed to user and user Selects Payment option as Bank for FiveYTL Product
       And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
       And Clicks on Save button
       And Selects Frequency for FiveYTL Product and reviews "<Frequency>"
       And Confirms I have read the Information Check Box on Payment Page   
       And Clicks on next button
       Then Payment Authorization Letter is displayed to user and clicks on Continue
       And Signs Payment Authorization Letter
       And Clicks on next button to finish
       Then Thank you page is displayed to user
       And Verify that Confirmation number is generated for "<Website>"
       
       
       
Examples:     
       
       
|Website |Title   |Fname  |Lname            |State      |DOB        |WorkHr    |Benefit    |SSN       |Mstatus |Height|Weight|Gender_Self|Wt12MonthAgo|MemberId        |StreetAddress |City      |Zip  |PrimaryPhType|PrimaryPhNo |BusinessName |BusinessType      |Password |Vpassword  |Bank     |AccName   |Rnum      |Anum             |Frequency|pdfEnable| 
|abe     |Prof.   |Rayna  |Snmmmmtestcasesi |Minnesota  |07/01/1974 |45        | 100000    |061000002 |Married |5.0   |180   |Male       |200         |545345343543543 |Street,123@   |providence|00001| Mobile        | 5343543543 |Arthur Corp  |Sole Proprietary  |Adam@123 |Adam@123   |abc bank |adam      |745688999 |35434354879988588|Monthly  |0        |    
       

@AbeRegression_24
Scenario Outline:<ABESC15_10> Complete work flow of application Self only  with Term Life Insurance       
       
       Given Test set up for "NYL" feature and "NYL_ABE" scenario
       Given Customer navigate to NYL "<Website>" 
       When Clicks on Apply now button
       Then Scroll down and click on I Attest To Having Read the Above Information button
       Then Select YES Radio button of Membership 
       Then Click on Self
       And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
       And Clicks on next button
       Then Product page details are displayed to user
       And Selects product FiveYTL for Self
       And Clicks on next button
       Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
       And Clicks on next button    
     	Then Request Coverage page is displayed to user
		And Selects Benefit Amount for Self as "<Benefit>" under FiveYTL
       And Clicks on next button
       Then Beneficiary Page is displayed to user
       And Clicks on next button
       Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
       And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
       And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
       And Selects No Radio button for Tobacco Question Self
       And Selects No Radio button for Driving Licensing Question for Self
       And Selects No for Travel Question QD for Self
       And Selects Residential Radio Button     
       And Clicks on next button
       Then Application Summary Page is displayed to user
       And Clicks on next button
       Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<Vpassword>" 
       And Clicks on Next and OK Button
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
       Then Payment Information Page is displayed to user and user Selects Payment option as Bank for FiveYTL Product
       And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
       And Clicks on Save button
       And Selects Frequency for FiveYTL Product and reviews "<Frequency>"
       And Confirms I have read the Information Check Box on Payment Page   
       And Clicks on next button
       Then Payment Authorization Letter is displayed to user and clicks on Continue
       And Signs Payment Authorization Letter
       And Clicks on next button to finish
       Then Thank you page is displayed to user
       And Verify that Confirmation number is generated for "<Website>"
       
       
       
Examples:     
       
       
|Website |Title   |Fname  |Lname            |State   |DOB        |WorkHr    |Benefit    |SSN       |Mstatus |Height|Weight|Gender_Self|Wt12MonthAgo|MemberId        |StreetAddress |City      |Zip  |PrimaryPhType|PrimaryPhNo |BusinessName |BusinessType      |Password |Vpassword  |Bank     |AccName   |Rnum      |Anum             |Frequency|pdfEnable| 
|abe     |Prof.   |Rayna  |Snmmmmtestcasesi |Maryland|07/01/1974 |45        | 100000     |061000002 |Married |5.0   |180   |Male       |200         |545345343543543 |Street,123@   |providence|00001| Mobile        | 5343543543 |Arthur Corp  |Sole Proprietary  |Adam@123 |Adam@123   |abc bank |adam      |745688999 |35434354879988588|Monthly  |0        |    
       

