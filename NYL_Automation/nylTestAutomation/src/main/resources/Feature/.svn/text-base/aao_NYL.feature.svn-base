Feature: AAO Test 

@AAORegression_1 
Scenario Outline:<AAOSC01>Application Submission for Self, Spouse with all eligible products and Child with Group Traditional TLI (No benes) 

	Given Test set up for "NYL" feature and "NYL_AAO" scenario
	Given Customer navigate to NYL "<website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	And Select YES Radio button of Membership
	And Click on Self
	And Click on Spouse 
	And Click on Child 
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
	And Select radio button Yes for Spouse is Member 
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>" 
	And Selects Married question as No for Child
	And Click on Add Child button on Screen 
	And Clicks on next button 
	Then Product page details are displayed to user 
	And Selects product GTTLI for Self
	And Selects product GTTLI for Spouse
	And Selects product GTTLI for Child
	And Selects product GTenYTL for Self
	And Selects product GTenYTL for Spouse
	And Verify Child icon is disabled for GTenYTL
	And Selects product GTwentyYTL for Self
	And Selects product GTwentyYTL for Spouse 
	And Verify Child icon is disabled for GTwentyYTL
	And Selects product GDII for Self
	And Selects product GDIIST for Self
	And Selects product GPOEI for Self 
	And Selects product CI for Self
	And Selects product CI for Spouse 
	And Clicks on next button 
	Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for Self and enter details as "<TotalAmt>","<IndAmt>","<Cname>"
	And Verify Imp Replacement Info for NewYork state checkbox is not displayed
	And Verify New York State paragraph is not displayed for Self
	Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Spouse
	And Enter additional details as "<STotalAmt>","<SIndAmt>","<SCname>" for Spouse  
	And Enters Monthly Income for Self as "<MonthlyIncome>" 
	And Selects Yes for unable to work because of a disability for Self
	And Clicks on Add Company Button
	And Enters details for Company "<ACname>","<ACBamount>","<ACBperiod>" and click on add button 
	And Selects Yes for replace any other company's coverage for Self
    And Enters Amount under replace any other company's coverage as "<Ramount>" 
	And Enters details for Monthly Expense and Percentage Responsible as "<MonthlyExpense>","<Eperc>" 
	And Selects Yes for applying for any other business/office overhead insurance 
	And Clicks on Add Company button for overhead products
	And Enters details for Company "<ACname1>","<ACBamount1>","<ACBperiod1>" and click on add button 
	And Selects Yes for replace any other company's coverage for Self for overhead disability
    And Enters Amount under replace any other company's coverage of overhead product as "<Ramount1>" 
	And Clicks on next button 
	Then Request Coverage page is displayed to user 
	And Selects Type of Coverage as "<TypeofCove>" for Self under GTTLI 
	And Selects Benefit Amount for Self as "<Benefit>" under GTTLI 
	And Checks Chronic Illness Rider for Self checkbox under GTTLI
	And Selects CIR portion for Self as "<RidBenefit>" under GTTLI
	And Selects Type of Coverage as "<TypeofCove>" for Spouse under GTTLI 
	And Selects Benefit Amount for Spouse as "<SBenefit>" under GTTLI
	And Checks CIR checkbox for Spouse 
	And Selects CIR portion for Spouse as "<SRidBenefit>" under GTTLI 
	And Selects Benefit Amount for Child as "<CBenefit>" under GTTLI 
	And Selects Type of Coverage as "<TypeofCove>" for Self under GTenYTL
	And Selects Benefit Amount for Self as "<Benefit1>" under GTenYTL 
	And Selects Type of Coverage as "<TypeofCove>" for Spouse under GTenYTL 
	And Selects Benefit Amount for Spouse as "<SBenefit1>" under GTenYTL 
	And Selects Type of Coverage as "<TypeofCove>" for Self under GTwentyYTL 
	And Selects Benefit Amount for Self as "<Benefit2>" under GTwentyYTL
	And Selects Type of Coverage as "<TypeofCove>" for Spouse under GTwentyYTL
	And Selects Benefit Amount for Spouse as "<SBenefit2>" under GTwentyYTL 
	And Validate Maximum Monthly Benefit Amount for Self as "<MaxBenefit>" under GDIILT
	And Selects Type of Coverage as "<TypeofCove>" for Self under GDIILT
	And Selects Wait Period for Self as "<Waitperiod>" under GDIILT
	And Selects Benefit Amount for Self as "<MBamount>" under GDIILT 
	And Selects Cost of Living Adjustment Rider under GDIILT product
	And Selects Future Purchase Option Rider under GDIILT product
	And Selects FPO Rider Benefit Amount for Self as "<MBamount1>"
    And Validate Maximum Monthly Benefit Amount for Self as "<MaxBenefit1>" under GDIIST 
	And Selects Type of Coverage as "<TypeofCove>" for Self under GDIIST 
	And Validate Waiting Period for Self as "<Waitperiod1>" under GDIIST 
	And Selects Benefit Amount for Self as "<MBamount2>" under GDIIST
	And Validate Maximum Monthly Benefit Amount for Self as "<MaxBenefit2>" under GPOEI 
	And Selects Type of Coverage as "<TypeofCove>" for Self under GPOEI 
	And Selects Benefit Amount for Self as "<MBamount3>" under GPOEI
	And Selects Benefit Duration for Self as "<BDuration>" under GPOEI
	And Selects Type of Coverage as "<TypeofCove>" for Self under CI 
	And Selects Benefit Amount for Self as "<Benefit3>" under CI 
	And Selects Type of Coverage as "<TypeofCove>" for Spouse under CI
	And Selects Benefit Amount for Spouse as "<SBenefit3>" under CI 
	And Clicks on next button 
	Then Beneficiary Page is displayed to user 
	And Clicks on Skip Beneficiary Button 
	Then Contact Details page is displayed to user 
	And Validates Height and Weight is displayed for Self
	And Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<MemId>","<Street>","<City>","<Zipcode>" 
	And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
	And Validate the Travel Question for Non QD application for Self 
	And Selects Yes for Travel Question Non QD for Self
	And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>" 
	And Selects Residential Radio Button 
	And Selects Yes Radio Button for Business Address 
	And Enters Business Details as "<BusinessName>","<BusinessType>" 
	And Enters contact Details for Spouse with SSN and MembershipID as "<SSSN>","<SHeight>","<SWeight>","<SSex>","<SMemId>","<SPhoneType>","<SPhoneNum>" 
	And Validate the Travel Question for Non QD application for Spouse
	And Selects Yes for Travel Question Non QD for Spouse
	And Enter datails for Outside US country and How Long months for Spouse as "<SCountry>","<SMonths>"
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
	
	Examples: 
		|website|Title|Fname|Lname |State |DOB                |WorkHr|Stitle|Sfname|Slname|SDOB               |Cfname|Clname|CDOB               |Csex|TotalAmt|IndAmt|Cname             |STotalAmt|SIndAmt|SCname      |MonthlyIncome|ACname        |ACBamount|ACBperiod|Ramount|MonthlyExpense	|Eperc	|ACanme1           	|ACBamount1	|ACBperiod1|Ramount1|TypeofCove|Benefit|RidBenefit|SBenefit|SRidBenefit|CBenefit|Benefit1|SBenefit1|Benefit2|SBenefit2	|MaxBenefit|Waitperiod|MBamount|MBamount1|MaxBenefit1|Waitperiod1|MBamount2|MaxBenefit2|MBamount3	|BDuration|Benefit3|SBenefit3|SSN      |Mstatus|Height	|Weight|Sex |MemId |Street            |City       |Zipcode|PhoneType|PhoneNum  |Country|Months|BusinessName|BusinessType|SSSN     |SMemId|SHeight	|SWeight|SSex  |SPhoneType|SPhoneNum |SCountry|SMonths|
		|aao    |Mr.  |John |Parker|Hawaii|SYSDate-45Y/00M/00D|25    |Mrs.  |Leena |Parker|SYSDate-38Y/00M/00D|Alex  |Parker|SYSDate-15Y/00M/00D|Male|1000    |20000 |Software Solutions|1500     |18000  |IT Solutions|4000         |SP Enterprises|6000     |8        |800    |19,999         |100   	|AP Enterprises		|2000      	|8        	|500     |New       |560000 |100000    |260000  |100000     |5000    |470000  |280000   |550000  |220000   	|$2,400    |90 Days   |700     |600      |$2,400     |30 Days    |600      |$19,900    |1000      	|12 months|15000   |10000    |254875695|Married|5.0 	|165   |Male|954354|89 Dove Rd. Kahuku|Hawaii City|96731  |Home     |1215454878|Germany|12    |Eretail     |Corporation |835375869|249358|4.6  		|160    |Female|Home      |2125455454|Belgium |12     |

@AAORegression_2		
Scenario Outline:<AAOSC02>Application Submission for Self with all eligible products             

	Given Test set up for "NYL" feature and "NYL_AAO" scenario
	Given Customer navigate to NYL "<website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user 
    And Click on Self 
    And Selects NO Radio button of eligible member
    And Validate that NEXT button is Disabled
    Then Select YES Radio button of Membership 
    And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
     And Clicks on next button
    And Validate Age Restriction Message
    And Enters DOB for Self as "<DOB1>" 
    And Clicks on next button
	Then Product page details are displayed to user 
    And Verify Available Product List GTTLI,CI
    And Verify GTenYLTLI,GTwentyYLTLI,GDIILT,GDIIST,GPOEI is not displayed
    And Clicks on Back or Previous button
    And Enter New State as "<State1>"
    And Clicks on next button
    And Validate Age Restriction Message
    And Enters DOB for Self as "<DOB2>"
    And Clicks on next button
	Then Product page details are displayed to user 
    And Validates only GTenYLTLI is displayed for Self
    And Verify GTTLI,GTwentyYLTLI,GDIILT,GDIIST,GPOEI,CI is not displayed
    And Clicks on Back or Previous button 
    And Enter New State as "<State2>"
    And Clicks on next button
	Then Product page details are displayed to user 
    And Validates that Self is displayed at product page for GTenYTL,GDIILT,GDIIST
    And Verify GTTLI,GTwentyYLTLI,GPOEI,CI is not displayed
    And Clicks on Back or Previous button 
    And Enter New State as "<State3>"
    And Clicks on next button
	Then Product page details are displayed to user 
    And Validates that Self is displayed at product page for GTTLI,GTenYTL,GDIILT,GDIIST,CI
    And Verify GTwentyYLTLI,GPOEI is not displayed
    And Clicks on Back or Previous button 
    And Enters DOB for Self as "<DOB3>" 
    And Clicks on next button
	Then Product page details are displayed to user 
    And Validates that Self is displayed at product page for GTTLI,GTenYTL,GDIILT,GDIIST,GPOEI,CI
    And Validates GTwentyYTL products are not displayed
    And Clicks on Back or Previous button 
    And Enters DOB for Self as "<DOB4>" 
    And Clicks on next button
    And Validate Age Restriction Message
    And Enters DOB for Self as "<DOB5>" 
    And Enter New State as "<State4>"
    And Clicks on next button
    And Verify that error message is displayed for state eligibility at top of the page
    And Enter New State as "<State5>"
    And Clicks on next button
	Then Product page details are displayed to user 
    And Validates that Self is displayed at product page for GTTLI,GTenYTL,GTwentyYTL,GDIILT,GDIIST,GPOEI,CI
    And Clicks on next button
    And Validate Error Message on Product Page
    And Selects product GTTLI for Self
    And Selects product GTenYTL for Self
    And Selects product GTwentyYTL for Self
    And Selects product GDII for Self
	And Selects product GDIIST for Self
	And Selects product GPOEI for Self 
	And Selects product CI for Self
    And Clicks on next button
	Then Product: Additional Questions page details are displayed to user 
    And Clicks on next button
    And Validate error message for required question
    Then Confirms Imp Replacement Info for NewYork state
    And Selects Yes for Do you have other life insurance in force for Self
    And Enters Total Amount for Self as "<TotalAmt>"
    And Selects Yes for life insurance applied for intended to replace for Self
    And Verify New York State paragraph is displayed for Self
    And Selects No for Do you have other insurance pending for Self
    And Enters Monthly Income for Self as "<MonthlyIncome>"
    And Selects Answer as No for Applying any Other Insurance
    And Enters details for Monthly Expense and Percentage Responsible as "<MonthlyExpense>","<Eperc>"
    And Selects Answer as No for other business question for Group Disability Insurance for Self
    And Clicks on next button
	Then Request Coverage page is displayed to user
    And Validate Maximum Monthly Benefit Amount for Self as "<MBamountN1>" under GDIILT
    And Clicks on Back or Previous button
    And Enters Monthly Income for Self as "<MonthlyIncomeN>" 
    And Clicks on next button
	Then Request Coverage page is displayed to user
    And Selects Type of Coverage as "<TypeofCove>" for Self under GTTLI 
    And Validates under GTTLI the Benefit Slider Range for Self as "<MinBenefit>" to "<MaxBenefit>"
    And Selects Benefit Amount for Self as "<Benefit>" under GTTLI
    And Checks Chronic Illness Rider for Self checkbox under GTTLI
    And Validates under GTTLI the Benefit Slider Range for CIR as "<MinBenefit1>" to "<MaxBenefit1>" for Self
    And Selects CIR portion for Self as "<RidBenefit>" under GTTLI
    And Selects Type of Coverage as "<TypeofCove>" for Self under GTenYTL 
    And Validates under GTenYTL the Benefit Slider Range for Self as "<MinBenefit2>" to "<MaxBenefit2>"
    And Selects Benefit Amount for Self as "<Benefit1>" under GTenYTL
    And Selects Type of Coverage as "<TypeofCove>" for Self under GTwentyYTL
    And Validates under GTwentyYTL the Benefit Slider Range as "<MinBenefit3>" to "<MaxBenefit3>"
    And Selects Benefit Amount for Self as "<Benefit2>" under GTwentyYTL 
    And Selects Type of Coverage as "<TypeofCove>" for Self under GDIILT
    And Validate Maximum Monthly Benefit Amount for Self as "<MBamount>" under GDIILT
    And Validate Waiting Period dropdown values for Self as "<WaitPeriod>","<WaitPeriod1>","<WaitPeriod2>" under GDIILT
    And Selects Wait Period for Self as "<WaitPeriod3>" under GDIILT
    And Validates under GDII the Benefit Slider Range for Self as "<MinMBamount>" to "<MaxMBamount>"
    And Selects Benefit Amount for Self as "<MBamount1>" under GDIILT
    And Selects Cost of Living Adjustment Rider under GDIILT product
    And Selects Future Purchase Option Rider under GDIILT product
    And Validates under FPO the Benefit Slider Range for Self as "<MinMBamount1>" to "<MaxMBamount1>"
    And Selects FPO Rider Benefit Amount for Self as "<MBamount2>"
    And Selects Type of Coverage as "<TypeofCove>" for Self under GDIIST
    And Validate Maximum Monthly Benefit Amount for Self as "<MBamount3>" under GDIIST
    And Validate Waiting Period for Self as "<WaitPeriod4>" under GDIIST
    And Validates under GDIIST the Benefit Slider Range as "<MinMBamount2>" to "<MaxMBamount2>"
    And Selects Benefit Amount for Self as "<MBamount4>" under GDIIST
    And Selects Type of Coverage as "<TypeofCove>" for Self under GPOEI
    And Validate Maximum Monthly Benefit Amount for Self as "<MBamount5>" under GPOEI
   And Validate dropdown values of Waiting Period for Self as "<WaitPeriod5>" under GPOEI
    And Validates under GPOEI the Benefit Slider Range as "<BDuration>" to "<BDuration1>"
    And Selects Benefit Duration for Self as "<BDuration2>" under GPOEI
    And Selects Type of Coverage as "<TypeofCove>" for Self under CI
    And Validates under CI the Benefit Slider Range as "<MinBenefit4>" to "<MaxBenefit4>"
    And Selects Benefit Amount for Self as "<Benefit3>" under CI
    And Clicks on next button
    And Validates error message on GDIILT for exceed Monthly Benefit amount for self
    And Validates error message on GDIILT for exceed FPO Monthly Benefit amount for self
    And Selects Benefit Amount for Self as "<MBamount7>" under GDIILT
    And Selects FPO Rider Benefit Amount for Self as "<MBamount8>"
    And Clicks on next button
	Then Beneficiary Page is displayed to user
    And Clicks on Add Beneficiary Button for Self under GTTLI
    And Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
    And User Enters Beneficiary details as "<Tname>","<DateTrust>"
    And Clicks on OK button
    And Verify that the Percent Displayed for Trust "<TrustSeq>" is "<TrustPercent>" for TermLife
    And Verify Add Beneficiary Button for GTTLI, GTenYLI, GTwentyYLI is available for Self
    And Clicks on Add Beneficiary Button for Self under GTTLI    
	Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
    And User Enters Beneficiary details as "<Tname1>","<DateTrust>"
    And Clicks on OK button
    And Validates error message on Add Beneficiary page-Only one Trust is allowed as Primary
    Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
    And Clicks on OK button
    And Delete Contingent Beneficiary 
    And Delete box is displayed and clicks on Yes
    And Clicks on Add Beneficiary Button for Self under GTTLI
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
    And Clicks on OK button
    And Verify that error message is displayed as individual cannot be added if trust already exists
    And Clicks on Close button
    And Clicks on Add Beneficiary Button for Self under GTenYTL
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bname1>","<Blname1>","<Relationship1>","<Perc1>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Self under GTenYTL
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship as other "<Bname2>","<Blname2>","<Relationship2>","<Perc2>","<Desc>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Self under GTenYTL
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bname3>","<Blname3>","<Relationship3>","<Perc3>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Self under GTenYTL
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship as other "<Bname4>","<Blname4>","<Relationship4>","<Perc4>","<Desc1>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Self under GTenYTL
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bname5>","<Blname5>","<Relationship5>","<Perc5>"
    And Clicks on OK button
    And Validate Maximum Beneficiaries Error message
    And Clicks on Close button
    And Clicks on next button
    And Verify Error Message is displayed for share of Beneficiaries
    And Clicks on Edit button for fourth primary Beneficiary for Self under GTenYTLI
    And Add Beneficiary page will be displayed to user and User Enters Beneficiary details as "<Perc6>" for Individual Primary
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Self under GTenYTL
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship"<Bname6>","<Blname6>","<Relationship6>","<Perc7>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Self under GTenYTL
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship"<Bname7>","<Blname7>","<Relationship7>","<Perc8>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Self under GTenYTL
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship"<Bname8>","<Blname8>","<Relationship8>","<Perc9>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Self under GTenYTL
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship"<Bname9>","<Blname9>","<Relationship9>","<Perc10>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Self under GTenYTL
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship as other "<Bname10>","<Blname10>","<Relationship10>","<Perc11>","<Desc2>"
    And Clicks on OK button
    And Validate Maximum Contingent Beneficiaries Error message
    And Clicks on Close button
    And Clicks on next button
    And Verify Error Message is displayed for share of Beneficiaries
    And Clicks on Edit button for eighth Beneficiary for Self under GTenYTLI
    And Add Beneficiary page will be displayed to user and User Enters Beneficiary details as "<Perc12>" for Individual Contingent 
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Self under GTwentyYTL
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And Selects the First Option from Existing Beneficiaries List and select Type as "<TypeAs>"
    And Enters Percentage for First Option as "<Perc13>"
    And Clicks on OK button
    And Clicks on next button
	Then Contact Details page is displayed to user 
    And Clicks on next button
    And Validate error message for required question
    And Validates Height and Weight is displayed for Self
    Then Enters contact Details without SSN and MemberID for Self as "<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"
   	And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
   	And Validate the Travel Question for Non QD application for Self 
	And Selects Yes for Travel Question Non QD for Self
	And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>" 
    And Selects Residential Radio Button
    And Selects Yes Radio Button for Business Address
    And Enters Business Details as "<BusinessName>","<BusinessType>"
    And Clicks on next button
    And Validates Membership ID Required Message
    Then Enters Membership ID as "<MemID>" for Self
    And Clicks on next button
	Then Application Summary Page is displayed to user 
    And Verify Benefit Amount for Self as "<Benefit>" under GTTLI
    And Verify CIR portion for Self as "<RidBenefit>" under GTTLI
    And Verify Benefit Amount for Self as "<Benefit1>" under GTenYTL
    And Verify Benefit Amount for Self as "<Benefit2>" under GTwentyYTL
    And Verify Benefit Amount for Self as "<MBamount7>" under GDII
    And Verify Rider FPO Rider Benefit Amount for Self as "<MBamount8>" under GDIILT
    And Verify Cost of Living Adjustment Rider under GDIILT
    And Verify Benefit Amount for Self as "<MBamount4>" under GDIIST
    And Verify Benefit Amount for Self as "<MBamount6>" under GPOEI
    And Verify Benefit Amount for Self as "<Benefit3>" under CI
    And Clicks on next button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self 
    And Validate Fraud Notice NY in Read and Sign Box
    And Validate Consent message in Read and Sign Box
    And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign	
	And Clicks on next button to finish 
	Then Thank you page is displayed to user
    And Verify that Confirmation number is generated for "<website>"

Examples: 
|website|Title|Fname|Lname|State   |DOB                |WorkHr|DOB1               |State1 |DOB2               |State2    |State3|DOB3               |DOB4               |DOB5               |State4                   |State5  |TotalAmt|MonthlyIncome|MonthlyExpense|Eperc|TypeofCove|MinBenefit|MaxBenefit|Benefit|MinBenefit1|MaxBenefit1|RidBenefit|MinBenefit2|MaxBenefit2|Benefit1|MinBenefit3|MaxBenefit3|Benefit2|MBamount	|WaitPeriod|WaitPeriod1|WaitPeriod2|WaitPeriod3|MinMBamount|MaxMBamount	|MBamount1	|MinMBamount1|MaxMBamount1|MBamount2|MBamount3|WaitPeriod4|MinMBamount2|MaxMBamount2|MBamount4|MBamount5	|WaitPeriod5|BDuration|BDuration1|BDuration2|MinBenefit4|MaxBenefit4|Benefit3|MBamount7|MBamount8|Tname     |DateTrust |TrustPercent|Tname1      |DateTrust1|Bname|Blname|Relationship|Perc|Bname1|Blname1|Relationship1|Perc1|Bname2|Blname2|Relationship2|Perc2|Desc  |Bname3|Blname3|Relationship3|Perc3|Bname4|Blname4|Relationship4|Perc4|Desc1   |Bname5|Blname5|Relationship5|Perc5|Perc6|Bname6|Blname6|Relationship6|Perc7|Bname7|Blname7|Relationship7|Perc8|Bname8|Blname8|Relationship8|Perc9|Bname9|Blname9|Relationship9|Perc10|Bname10|Blname10|Relationship10|Perc11|Desc2   |Perc12|Perc13|Mstatus|Height	|Weight|Sex |Street                       |City         |Zipcode|PhoneType|PhoneNum  |Country|Months|BusinessName    |BusinessType|MemID |MBamountN1|MonthlyIncomeN	|TypeAs	|TrustSeq	|MBamount6|
|aao    |Mr.  |Luke |James|Georgia |SYSDate-70Y/00M/00D|25    |SYSDate-65Y/11M/29D|Vermont|SYSDate-60Y/11M/29D|Washington|Hawaii|SYSDate-55Y/00M/00D|SYSDate-16Y/11M/29D|SYSDate-17Y/00M/00D|U.S. Armed Forces Pacific|New York|30000   |24900        |$25000        |85   |New       |100000    |3000000   |420000 |50000      |1000000    |150000    |100000     |3000000    |290000  |100000     |3000000    |270000  |$15,000  	|30 Days   |90 Days    |180 Days   |90 Days    |500        |15000		|15000   	|500         |2500        |1000     |$5,000   |30 Days    |500         |5000        |1300     |$20,000      |30 Days    |12 months|24 months |12 months |5000       |100000     |20000   |7000     |1500     |Life Saver|01/01/2000|100 %       |Helping Hand|01/01/2001|Sam  |James |Son         |100 |Heena |James  |Spouse       |25   |John  |Parker |Other        |25   |Friend|Henry |James  |Son          |25   |Bravo |Parker |Other        |15   |Neighbor|Rosey |James  |Daughter     |10   |25   |Simon |James  |Mother       |25   |Kevin |James  |Father       |25   |Andrew|James  |Son          |25   |Martina|James |Daughter     |15    |Alex   |Parker  |Other         |10    |Neighbor|25    |100   |Married|5.0		|165   |Male|581 N. Warren Street Fairport|New York City|14450  |Home     |5715454878|Germany|12    |Logitek Services|Corporation |695472|$14,900	|25300			|Primary|1			|1000		|	
	
	@AAORegression_3
	Scenario Outline:<AAOSC03>Application Submission for Spouse with all eligible products           
	Given Test set up for "NYL" feature and "NYL_AAO" scenario 
	Given Customer navigate to NYL "<website>" 
	When Clicks on Apply now button 
	Then Eligibility page details are displayed to user 
	And Select YES Radio button of Membership 
	And Click on Spouse  
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
	And Select radio button Yes for Spouse is Member 
    And Clicks on next button
    And Validate Age Restriction Message
    And Enters DOB for Spouse as "<SDOB1>"
    And Clicks on next button
	Then Product page details are displayed to user 
    And Verify Available Product List GTTLI,CI for Spouse
    And Verify GTenYLTLI,GTwentyYLTLI is not displayed
    And Clicks on Back or Previous button 
	And Enters DOB for Spouse as "<SDOB2>"
    And Clicks on next button
    And Verify Available Product List GTTLI,CI for Spouse
    And Verify GTenYLTLI,GTwentyYLTLI is not displayed
    And Selects product GTTLI for Spouse
    And Clicks on next button
	Then Click YES for Dependent Coverage information
	Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Spouse
    And Enter additional details as "<STotalAmt>","<SIndAmt>","<SCname>" for Spouse  
    And Clicks on next button
	Then Request Coverage page is displayed to user
    And Verify Chronic rider is not available under GTTLI for Spouse
    And Navigate back to Eligibility page
    And Enter New State as "<State1>"
    And Clicks on next button
    And Verify Error Message for member is not eligible
    Then Enter New State as "<State2>"
    And Clicks on next button
	Then Product page details are displayed to user 
    And Verify Available Product List for Spouse as GTTLI
    And Verify product CI is not available
    And Clicks on Back or Previous button
    And Enter New State as "<State3>"
    And Enters DOB for Spouse as "<SDOB3>"
    And Clicks on next button
	Then Product page details are displayed to user 
    And Verify Available Product List GTTLI,GTenYTL,CI for Spouse
    And Validates GTwentyYTL products are not displayed
    And Clicks on Back or Previous button
    And Enters DOB for Spouse as "<SDOB4>"
    And Clicks on next button
	Then Product page details are displayed to user 
    And Verify Available Product List GTTLI,GTenYTL,CI for Spouse
    And Validates GTwentyYTL products are not displayed
    And Clicks on Back or Previous button
    And Enters DOB for Spouse as "<SDOB5>"
    And Clicks on next button
	Then Product page details are displayed to user 
    And Verify Available Product List GTTLI,GTenYTL,GTwentyYTL,CI for Spouse
    And Clicks on Back or Previous button
    And Enters DOB for Spouse as "<SDOB6>"
    And Clicks on next button
    And Validate Age Restriction Message 
    And Enters DOB for Spouse as "<SDOB7>"
    And Clicks on next button
	Then Product page details are displayed to user 
    And Verify Available Product List GTTLI,GTenYTL,GTwentyYTL,CI for Spouse
    And Deselects product GTTLI for Spouse
    And Clicks on next button
    And Validate Error Message on Product Page
    And Selects product GTTLI for Spouse
    And Selects product GTenYTL for Spouse
    And Selects product GTwentyYTL for Spouse
    And Selects product CI for Spouse
    And Clicks on next button
	Then Click YES for Dependent Coverage information
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse 
    And Validate Imp Replacement Info text for NewYork state
    And Confirms Imp Replacement Info for NewYork state
    And Clicks on next button
	Then Request Coverage page is displayed to user
    And Selects Type of Coverage as "<TypeofCove>" for Spouse under GTTLI 
    And Validates under GTTLI the Benefit Slider Range for Spouse as "<MinBenefit>" to "<MaxBenefit>"
    And Selects Benefit Amount for Spouse as "<Benefit>" under GTTLI
    And Checks CIR checkbox for Spouse 
    And Validates under GTTLI the Benefit Slider Range for CIR as "<MinBenefit1>" to "<MaxBenefit1>" for Spouse
    And Selects CIR portion for Spouse as "<RidBenefit>" under GTTLI
    And Selects Type of Coverage as "<TypeofCove>" for Spouse under GTenYTL 
    And Validates under GTenYTL the Benefit Slider Range for Spouse as "<MinBenefit2>" to "<MaxBenefit2>" 
    And Selects Benefit Amount for Spouse as "<Benefit1>" under GTenYTL 
    And Selects Type of Coverage as "<TypeofCove>" for Spouse under GTwentyYTL 
    And Validates under GTwentyYTL the Benefit Slider Range as "<MinBenefit3>" to "<MaxBenefit3>" for Spouse
    And Selects Benefit Amount for Spouse as "<Benefit2>" under GTwentyYTL 
    And Selects Type of Coverage as "<TypeofCove>" for Spouse under CI
    And Validates under CI the Benefit Slider Range as "<MinBenefit4>" to "<MaxBenefit4>" for Spouse
    And Selects Benefit Amount for Spouse as "<Benefit3>" under CI
    And Clicks on next button
    And Validate Rider Amount Exceed error Message
    Then Selects CIR portion for Spouse as "<RidBenefit1>" under GTTLI
    And Clicks on next button
	Then Beneficiary Page is displayed to user
    And Clicks on Add Beneficiary Button for Spouse under GTTLI
    And Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
    And User Enters Beneficiary details as "<Tname>","<DateTrust>"
    And Clicks on OK button
    And Verify that the Percent Displayed for Trust is "<TrustPercent>" for Spouse under GTTLI 
    And Clicks on Add Beneficiary Button for Spouse under GTTLI
    Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
    And User Enters Beneficiary details as "<Tname1>","<DateTrust>"
    And Clicks on OK button
    And Validates error message on Add Beneficiary page-Only one Trust is allowed as Primary
    Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
    And Clicks on OK button
    And Delete Contingent Beneficiary  
    And Delete box is displayed and clicks on Yes
    Then Beneficiary Page is displayed to user
    And Clicks on Add Beneficiary Button for Spouse under GTTLI
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relationship>","<Perc>"
    And Clicks on OK button
    And Verify that error message is displayed as individual cannot be added if trust already exists
    And Clicks on Close button
    And Clicks on Add Beneficiary Button for Spouse under GTenYTL
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bfname1>","<Blname1>","<Relationship1>","<Perc1>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Spouse under GTenYTL
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship as other "<Bfname2>","<Blname2>","<Relationship2>","<Perc2>","<Desc>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Spouse under GTenYTL
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bfname3>","<Blname3>","<Relationship3>","<Perc3>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Spouse under GTenYTL
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship as other "<Bfname4>","<Blname4>","<Relationship4>","<Perc4>","<Desc1>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Spouse under GTenYTL
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bfname5>","<Blname5>","<Relationship5>","<Perc5>"
    And Clicks on OK button
    And Validate Maximum Beneficiaries Error message
    And Clicks on Close button
    And Clicks on next button
    And Verify Error Message is displayed for share of Beneficiaries
    And Clicks on "<RowNo>" Edit button for Beneficiary for Spouse for GTenYTLI
    And Enter Percentage as "<Perc6>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Spouse under GTenYTL
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship"<Bfname6>","<Blname6>","<Relationship6>","<Perc7>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Spouse under GTenYTL
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship"<Bfname7>","<Blname7>","<Relationship7>","<Perc8>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Spouse under GTenYTL
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship"<Bfname8>","<Blname8>","<Relationship8>","<Perc9>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Spouse under GTenYTL
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship"<Bfname9>","<Blname9>","<Relationship9>","<Perc10>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Spouse under GTenYTL
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship as other "<Bfname10>","<Blname10>","<Relationship10>","<Perc11>","<Desc2>"
    And Clicks on OK button
    And Validate Maximum Contingent Beneficiaries Error message
    And Clicks on Close button
    And Clicks on next button
    And Verify Error Message is displayed for share of Beneficiaries
    And Clicks on "<RowNo1>" Edit button for Beneficiary for Spouse for GTenYTLI
    And Enter Percentage as "<Perc12>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Spouse under GTwentyYTL
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And Selects the First Option from Existing Beneficiaries List and select Type as "<TypeAs>"
    And Enters Percentage for First Option as "<Perc13>"
    And Clicks on OK button
    And Clicks on next button
	Then Contact Details page is displayed to user 
    And Clicks on next button
    And Validate error message for required question
    And Contact Details page is displayed to user and enters contact Details for self as "<SSN>","<Mstatus>","<Sex>","<MemId>","<Street>","<City>","<Zipcode>"
    And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page 
    And Enters contact Details for Spouse without SSN as "<SSex>","<SHeight>","<SWeight>","<SPhoneType>","<SPhoneNum>"
    And Selects Yes for Travel Question Non QD for Spouse
    And Enter datails for Outside US country and How Long months for Spouse as "<SCountry>","<SMonths>"
     And Selects Residential Radio Button
    And Clicks on next button
	Then Application Summary Page is displayed to user
    And Verify Benefit Amount for Spouse as "<Benefit>" under GTTLI
    And Verify CIR portion for Spouse as "<RidBenefit1>" under GTTLI
    And Verify Benefit Amount for Spouse as "<Benefit1>" under GTenYTL
    And Verify Benefit Amount for Spouse as "<Benefit2>" under GTwentyYTL
    And Verify Benefit Amount for Spouse as "<Benefit3>" under CI 
    And Clicks on next button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self 
	Then Authorize page details are displayed to user and confirm the term and conditions for Spouse
    And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
	Then Thank you page is displayed to user
    And Verify that Confirmation number is generated for "<website>"


Examples: 

|website|Title|Fname    |Lname|State  |DOB                |WorkHr|Stitle|Sfname|Slname|SDOB               |SDOB1              |SDOB2              |STotalAmt|SIndAmt|SCname     |State1    |State2    |State3  |SDOB3              |SDOB4              |SDOB5              |SDOB6              |SDOB7              |TypeofCove|MinBenefit|MaxBenefit|Benefit |MinBenefit1|MaxBenefit1|RidBenefit|MinBenefit2|MaxBenefit2|Benefit1|MinBenefit3|MaxBenefit3|Benefit2|MinBenefit4|MaxBenefit4|Benefit3|RidBenefit1|Tname      |DateTrust |Tname1|DateTrust1|Bfname|Blname|Relationship|Perc|Bfname1|Blname1|Relationship1|Perc1|Bfname2|Blname2|Relationship2|Perc2|Desc  |Bfname3|Blname3|Relationship3|Perc3|Bfname4|Blname4|Relationship4|Perc4|Desc1   |Bfname5|Blname5|Relationship5|Perc5|Perc6|Bfname6|Blname6|Relationship6|Perc7|Bfname7|Blname7|Relationship7|Perc8|Bfname8 |Blname8|Relationship8|Perc9|Bfname9|Blname9|Relationship9|Perc10|Bfname10|Blname10|Relationship10|Perc11|Desc2   |Perc12|Perc13|SSN      |Mstatus|Height|Weight|Sex |MemId |Street               |City   |Zipcode|PhoneType|PhoneNum  |SHeight|SWeight|SSex  |SPhoneType|SPhoneNum |SCountry|SMonths|TypeAs	|TrustPercent	|RowNo1	|RowNo|
|aao    |Mr.  |Sebastian|Piper|Alabama|SYSDate-56Y/00M/00D|40    |Mrs.  |Alison|Piper |SYSDate-70Y/00M/00D|SYSDate-69Y/11M/29D|SYSDate-65Y/00M/00D|5000     |6200   |IG Infotech|Washington|California|New York|SYSDate-64Y/11M/29D|SYSDate-55Y/00M/00D|SYSDate-54Y/11M/29D|SYSDate-16Y/11M/29D|SYSDate-17Y/00M/00D|New       |$100,000  |$1,500,000|$600,000|$25,000    |$1,000,000 |$6,25,000 |$100,000   |$1,500,000 |$470,000|$100,000   |$1,500,000 |$340,000|$5,000     |$100,000   |$20,000 |$475,000   |Save future|01/01/2000|Bright|01/01/2001|Adrian|Piper |Son         |100 |Carl   |Piper  |Spouse       |25   |John   |Greene |Other        |25   |Friend|Matt   |Piper  |Son          |25   |Bravo  |Kerr   |Other        |15   |Neighbor|Amanda |Piper  |Daughter     |10   |25   |Jessica|Piper  |Mother       |25   |Edward |Piper  |Father       |25   |Charles |Piper  |Son          |25   |Leah   |Piper  |Daughter     |15    |Max     |Duncan  |Other         |10    |Neighbor|25    |100   |754875695|Married|5.5   |180   |Male|925478|31 ,Beaver Ridge Ave.|Jamaica|11434  |Mobile   |9815454878|4.6    |160    |Female|Home      |2125455454|Belgium |12     |Primary|100 %			|8		|4	|


@AAORegression_4
Scenario Outline:<AAOSC04>Application Submission for Child with LI Products and Self with LI, CI products           

	Given Test set up for "NYL" feature and "NYL_AAO" scenario 
	Given Customer navigate to NYL "<website>" 
	When Clicks on Apply now button 
	Then Eligibility page details are displayed to user 
    And Select YES Radio button of Membership 
    And Click on Self  
    And Click on Child  
    And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
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
    And Selects Married question as Yes for Child
    And Click on Add Child button on Screen 
    And Click on Add Child button 
    Then Add Child Screen is displayed and Enters Child details as "<C7fname>","<C7lname>","<C7DOB>","<C7Sex>"
    And Selects Married question as Yes for Child
    And Click on Add Child button on Screen 
    And Click on Add Child button
    Then Add Child Screen is displayed and Enters Child details as "<C8fname>","<C8lname>","<C8DOB>","<C8Sex>"
    And Selects Married question as No for Child
    And Click on Add Child button on Screen 
    And Validates Add Child Button on Eligibility page is not present
    And Clicks on next button
	Then Product page details are displayed to user 
    And Validates that Self is displayed at product page for GTTLI,CI
    And Validates that Child is displayed for GTTLI,GTenYTL,GTwentyYTL
    And Selects product GTTLI for Self
    And Selects product GTTLI for Child
    And Verify Child icon is disabled for GTenYTL
    And Verify Child icon is disabled for GTwentyYTL
    And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
    And Clicks on next button
	Then Request Coverage page is displayed to user
    And Verify Chronic rider is not available under GTTLI for Self
    And Validate Benefit amount for child as "<BenOpt>","<BenOpt1>" under GTTLI
    And Validates "<C2fname>","<C3fname>","<C6fname>" and "<C7fname>" are not displayed in eligible children under GTTLI
    And Navigate back to Eligibility page
    And Enters DOB for Self as "<DOB1>"
    And Clicks on next button
	Then Product page details are displayed to user 
    And Validates that Self is displayed at product page for GTTLI,GTenYTL,GTwentyYTL,GDIILT,GDIIST,GPOEI,CI
    And Validates that Child is displayed for GTTLI,GTenYTL,GTwentyYTL
    And Deselects product GTTLI for Self
    And Deselects product GTTLI for Child
    And Selects product GTenYTL for Self
    And Selects product GTenYTL for Child
    And Verify Child icon is disabled for GTTLI
    And Verify Child icon is disabled for GTwentyYTL
    And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self 
    And Clicks on next button
	Then Request Coverage page is displayed to user
    And Validate Benefit amount for child as "<BenOpt2>","<BenOpt3>" under GTenYTL
    And Validates "<C2fname>","<C3fname>","<C6fname>" and "<C7fname>" are not displayed in eligible children under GTenYTL
    And Navigate back to Products page
    And Deselects product GTenYTL for Self
    And Deselects Product GTenYTL for Child
    And Selects product GTwentyYTL for Self
    And Selects product GTwentyYTL for Child
    And Verify Child icon is disabled for GTTLI 
    And Verify Child icon is disabled for GTenYTL
    And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
    And Clicks on next button
	Then Request Coverage page is displayed to user
    And Selects Type of Coverage as "<TypeofCove>" for Self under GTwentyYTL
    And Selects Benefit Amount for Self as "<Benefit>" under GTwentyYTL
    And Validate Benefit amount for child as "<BenOpt4>","<BenOpt5>" under GTwentyYTL
    And Validates "<C2fname>","<C3fname>","<C6fname>" and "<C7fname>" are not displayed in eligible children under GTwentyYTL
    And Selects Benefit Amount for Child as "<BenOpt6>" under GTwentyYTL
    And Clicks on next button
	Then Beneficiary Page is displayed to user
    And Clicks on Add Beneficiary Button for Self under GTwentyYTL
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relation>","<Perc>"
    And Clicks on OK button
    And Clicks on Skip Beneficiary Button
    And Delete box is displayed and clicks on Yes
	Then Contact Details page is displayed to user
    And Enters Contact Details for Self Without SSN as "<Mstatus>","<Height>","<Weight>","<Sex>","<MemID>","<Street>","<City>","<Zipcode>"
    And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
    And Selects No for Travel Question Non QD for Self
    And Selects Business Address Radio Button for Send Correspondence To
    And Selects NO Radio Button for Business Address
    And Enters Business Details as "<BusinessName>","<BusinessType>"
    And Enter Business Address Details as "<Bstreet>","<Bcity>","<Bstate>","<Bzipcode>"
    And Clicks on next button
	Then Application Summary Page is displayed to user 
    And Verify Benefit Amount for Self as "<Benefit>" under GTwentyYTL
    And Verify Child Firstname and Lastname as "<C1fname>","<C1lname>"
    And Verify Benefit Amount for child "<C1fname>","<C1Sequence>" as "<BenOpt6>" under GTwentyYTL
    And Verify Child Firstname and Lastname as "<C4fname>","<C4lname>"
    And Verify Benefit Amount for child "<C4fname>","<C1Sequence>" as "<BenOpt6>" under GTwentyYTL
    And Verify Child Firstname and Lastname as "<C5fname>","<C5lname>"
    And Verify Benefit Amount for child "<C5fname>","<C1Sequence>" as "<BenOpt6>" under GTwentyYTL
    And Verify Child Firstname and Lastname as "<C8fname>","<C8lname>"
    And Verify Benefit Amount for child "<C8fname>","<C1Sequence>" as "<BenOpt6>" under GTwentyYTL
    And Clicks on next button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self 
    And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
	Then Thank you page is displayed to user
    And Verify that Confirmation number is generated for "<website>"

Examples: 
|website|Title|Fname |Lname|State   |DOB                |WorkHr|C1fname|C1lname|C1DOB      |C1Sex|C2fname|C2lname|C2DOB              |C2Sex |C3fname|C3lname|C3DOB              |C3Sex|C4fname |C4lname|C4DOB              |C4Sex |C5fname |C5lname|C5DOB              |C5Sex |C6fname|C6lname|C6DOB              |C6Sex |C7fname|C7lname|C7DOB              |C7Sex|C8fname|C8lname|C8DOB              |C8Sex|BenOpt|BenOpt1|DOB1               |BenOpt2|BenOpt3|TypeofCove|Benefit |BenOpt4|BenOpt5|BenOpt6|Bfname|Blname|Relation|Perc|Mstatus|Height|Weight|Sex |MemID |Street                  |City         |Zipcode|PhoneType|PhoneNum  |BusinessName     |BusinessType|Bstreet                 |Bcity        |Bstate  |Bzipcode|C1Sequence|
|aao    |Mr.  |Victor|Quinn|Colorado|SYSDate-65Y/00M/00D|40    |Oliver |Quinn  |CurrentDate|Male |Irene  |Quinn  |SYSDate-25Y/00M/00D|Female|Colin  |Quinn  |SYSDate-15Y/00M/00D|Male |Michelle|Quinn  |SYSDate-06Y/00M/00D|Female|Angelina|Quinn  |SYSDate-24Y/11M/29D|Female|Mary   |Quinn  |SYSDate-24Y/11M/29D|Female|Victor |Quinn  |SYSDate-20Y/00M/00D|Male |Trevor |Quinn  |SYSDate-01Y/00M/00D|Male |$5,000|$10,000|SYSDate-45Y/00M/00D|$5,000 |$10,000|New       |$550,000|$5,000 |$10,000|$5,000 |Rosey |Quinn |Spouse  |100 |Married|5.0   |165   |Male|248567|8567 Nichols Ave. Denver|Colorado City|80216  |Home     |9257454878|Netgear Solutions|Partnership |15208, West 119th Street|Colorado City|Colorado|81625   |1		|

@AAORegression_5
Scenario Outline:<AAOSC05>Application Submission for Self with LI, DI products and spouse with LI products        

	Given Test set up for "NYL" feature and "NYL_AAO" scenario 
	Given Customer navigate to NYL "<website>" 
	When Clicks on Apply now button 
	Then Eligibility page details are displayed to user 
	And Select YES Radio button of Membership 
    And Click on Self 
    And Click on Spouse  
    And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
    And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
    And Select radio button NO for Spouse is Member
    And Clicks on next button
	Then Product page details are displayed to user 
	And Validates that Self is displayed at product page for GTTLI,GTenYTL,GDIILT,GDIIST,GPOEI,CI
    And Verify Available Product List GTTLI,GTenYTL,GTwentyYTL,CI for Spouse
    And Selects product GDII for Self
    And Selects product GDIIST for Self
    And Selects product GTTLI for Spouse
    And Selects product GTenYTL for Spouse
    And Selects product GTwentyYTL for Spouse
    And Clicks on next button
	Then Click YES for Dependent Coverage information
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
    And Enters Monthly Income for Self as "<MonthlyIncome>"
    And Selects Answer as No for Applying any Other Insurance
    And Clicks on next button
	Then Request Coverage page is displayed to user
    And Validate Maximum Monthly Benefit Amount for Self as "<MBamountN1>" under GDIILT
    And Validate Maximum Monthly Benefit Amount for Self as "<MBamountM1>" under GDIIST
    And Navigate back to Eligibility page
	And Enters DOB for Self as "<DOB1>"
    And Clicks on next button
	Then Product page details are displayed to user 
    And Clicks on next button
	Then Click YES for Dependent Coverage information
	Then Product: Additional Questions page details are displayed to user 
    And Enters Monthly Income for Self as "<MonthlyIncome1>"
    And Clicks on next button
	Then Request Coverage page is displayed to user
    And Validate Maximum Monthly Benefit Amount for Self as "<MBamountN2>" under GDIILT
    And Validate Maximum Monthly Benefit Amount for Self as "<MBamountM2>" under GDIIST
    And Navigate back to Eligibility page
    And Enters DOB for Self as "<DOB2>"
    And Clicks on next button
	Then Product page details are displayed to user 
    And Clicks on next button
	Then Click YES for Dependent Coverage information
	Then Product: Additional Questions page details are displayed to user 
    And Enters Monthly Income for Self as "<MonthlyIncome2>"
    And Clicks on next button
	Then Request Coverage page is displayed to user
    And Validate Maximum Monthly Benefit Amount for Self as "<MBamountN3>" under GDIILT
    And Validate Maximum Monthly Benefit Amount for Self as "<MBamountM3>" under GDIIST
    And Validate Waiting Period dropdown values for Self as "<WaitPeriod>","<WaitPeriod1>","<WaitPeriod2>" under GDIILT
    And Validates under GDII the Benefit Slider Range for Self as "<MinMBamount>" to "<MaxMBamount>"
    And Selects Cost of Living Adjustment Rider under GDIILT product
    And Selects Future Purchase Option Rider under GDIILT product
    And Validates under FPO the Benefit Slider Range for Self as "<MinMBamount1>" to "<MaxMBamount1>"
    And Validate Waiting Period for Self as "<WaitPeriod3>" under GDIIST
    And Validates under GDIIST the Benefit Slider Range as "<MinMBamount3>" to "<MaxMBamount3>"
	And Navigate back to Eligibility page
    And Enters DOB for Self as "<DOB3>"
    And Enter New State as "<State1>"
    And Clicks on next button
    And Verify that error message is displayed for state eligibility at top of the page
    And Enter New State as "<State2>"
    And Enters Self WorkHr as "<WorkHr1>"
    And Clicks on next button
	Then Product page details are displayed to user 
    And Validates that Self is displayed at product page for GTTLI,GTenYTL,GTwentyYTL,CI
    And Clicks on Back or Previous button
    And Enters Self WorkHr as "<WorkHr2>"
    And Clicks on next button
	Then Product page details are displayed to user 
    And Validates that Self is displayed at product page for GTTLI,GTenYTL,GTwentyYTL,GDIILT,GDIIST,GPOEI,CI
    And Verify Available Product List GTTLI,GTenYTL,GTwentyYTL,CI for Spouse
    And Selects product GTTLI for Self  
    And Selects product GTenYTL for Self
    And Selects product GTwentyYTL for Self 
    And Deselects product GDIILT for Self
    And Deselects product GDIIST for Self
    And Selects product CI for Self
    And Selects product CI for Spouse
    And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for Self and Spouse
    And Clicks on next button
	Then Request Coverage page is displayed to user
    And Selects Type of Coverage as "<TypeofCove>" for Self under GTTLI 
    And Selects Benefit Amount for Self as "<Benefit>" under GTTLI
    And Checks Chronic Illness Rider for Self checkbox under GTTLI
    And Selects CIR portion for Self as "<RidBenefit>" under GTTLI
    And Selects Type of Coverage as "<TypeofCove>" for Spouse under GTTLI 
    And Selects Benefit Amount for Spouse as "<SBenefit>" under GTTLI
    And Checks CIR checkbox for Spouse 
    And Selects CIR portion for Spouse as "<SRidBenefit>" under GTTLI
    And Selects Type of Coverage as "<TypeofCove>" for Self under GTenYTL 
    And Selects Benefit Amount for Self as "<Benefit1>" under GTenYTL 
    And Selects Type of Coverage as "<TypeofCove>" for Spouse under GTenYTL 
    And Selects Benefit Amount for Spouse as "<SBenefit1>" under GTenYTL 
    And Selects Type of Coverage as "<TypeofCove>" for Self under GTwentyYTL
    And Selects Benefit Amount for Self as "<Benefit2>" under GTwentyYTL
    And Selects Type of Coverage as "<TypeofCove>" for Spouse under GTwentyYTL
    And Selects Benefit Amount for Spouse as "<SBenefit2>" under GTwentyYTL
    And Selects Type of Coverage as "<TypeofCove>" for Self under CI
    And Selects Benefit Amount for Self as "<Benefit3>" under CI
    And Selects Type of Coverage as "<TypeofCove>" for Spouse under CI
    And Selects Benefit Amount for Spouse as "<SBenefit3>" under CI
    And Clicks on next button
    And Validate Coverage Required Questions error message
    And Validate Error Message Spouse benefit amount cannot exceed member benefit amount under Group Traditional TLI for spouse
    And Validate Error Message Spouse benefit amount cannot exceed member benefit amount under Group 10Yr LTLI for spouse
    And Validate Error Message Spouse benefit amount cannot exceed member benefit amount under Group 20Yr LTLI for spouse
    And Validate Error Message Spouse benefit amount cannot exceed member benefit amount under CI for spouse
    And Selects Benefit Amount for Spouse as "<SBenefit4>" under GTTLI
    And Selects Benefit Amount for Spouse as "<SBenefit5>" under GTenYTL 
    And Selects Benefit Amount for Spouse as "<SBenefit6>" under GTwentyYTL
    And Selects Benefit Amount for Spouse as "<SBenefit7>" under CI
    And Clicks on next button
	Then Beneficiary Page is displayed to user
    And Clicks on next button
	Then Contact Details page is displayed to user 
    And Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<MemId>","<Street>","<City>","<Zipcode>" 
    And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
    And Selects No for Travel Question Non QD for Self
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

Examples:
|website|Title|Fname |Lname |State   |DOB                 |WorkHr|Stitle|Sfname  |Slname|SDOB                 |MonthlyIncome|MBamountN1|MBamountM1|DOB1                 |MonthlyIncome1|MBamountN2|MBamountM2|DOB2                 |MonthlyIncome2|MBamountN3|MBamountM3|WaitPeriod| WaitPeriod1| WaitPeriod2|MinMBamount|MaxMBamount|MinMBamount1|MaxMBamount1|WaitPeriod3|MinMBamount3|MaxMBamount3|DOB3                 |State1|State2  |WorkHr1|WorkHr2|TypeofCove|Benefit |RidBenefit|SBenefit|SRidBenefit|Benefit1|SBenefit1|Benefit2|SBenefit2|Benefit3|SBenefit3|SBenefit4|SBenefit5|SBenefit6|SBenefit7|SSN      |Mstatus|Height|Weight|Sex |MemId |Street                  |City         |Zipcode|PhoneType|PhoneNum  |SSSN     |SHeight|SWeight|SSex  |SPhoneType|SPhoneNum |
|aao	|Mr.  |Trevor|Mathis|Virginia|SYSDate- 55Y/00M/00D|25    |Mrs.  |Kimberly|Mathis|SYSDate - 54Y/11M/29D|$6,900       |$4,000    |$4,000    |SYSDate - 54Y/11M/29D|$8,500        |$5,100    |$5,000    |SYSDate - 60Y/00M/00D|$2,700        |$1,500    |$1,500    |30 Days   |90 Days     |180 Days    |$500       |$1,500    |$500        |$2,500      |30 Days    |$500        	|$1,500      |SYSDate - 45Y/00M/00D|Quebec|Arkansas|19     |25     |New       |$410,000|$150,000  |$420,000|$175,000   |$240,000|$250,000 |$420,000|$430,000 |$25,000 |$30,000  |$400,000 |$230,000 |$410,000 |$20,000  |323442245|Married|5.5   |180   |Male|325418|176 N. Kings Lane Pearcy|Arkansas City|71964  |Home     |8416781512|243344253|5.1    |168    |Female|Home      |1125874159|


@AAORegression_6
Scenario Outline:<AAOSC06>Validation Read & Sign Page with 22 different States one by one in loop

	Given Test set up for "NYL" feature and "NYL_AAO" scenario 
	Given Customer navigate to NYL "<website>" 
	When Clicks on Apply now button 
	Then Eligibility page details are displayed to user 
    And Select YES Radio button of Membership 
    And Click on Self
    And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
    And Clicks on next button
	Then Product page details are displayed to user 
    And Validates that Self is displayed at product page for GTTLI,GTenYTL,GTwentyYTL,GDIILT,GDIIST,GPOEI,CI
    And Selects product GTenYTL for Self
    And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
    And Clicks on next button
	Then Request Coverage page is displayed to user
    And Selects Type of Coverage as "<TypeofCove>" for Self under GTenYTL 
    And Selects Benefit Amount for Self as "<Benefit>" under GTenYTL
    And Clicks on next button
	Then Beneficiary Page is displayed to user 
    And Clicks on Skip Beneficiary Button
	Then Contact Details page is displayed to user 
    And Enters Contact Details for Self Without SSN as "<Mstatus>","<Height>","<Weight>","<Sex>","<MemId>","<Street>","<City>","<Zipcode>" 
    And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
    And Selects No for Travel Question Non QD for Self
    And Selects Residential Radio Button 
	And Clicks on button to Save for later
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VerifyPass>" 
	And Clicks OK Button Save For Later
	Then Refresh the browser 
	Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive 
	Then Contact Details page is displayed to user 
	And Clicks on next button
	Then Application Summary Page is displayed to user 
    And Verify Benefit Amount for Self as "<Benefit>" under GTenYTL
    And Clicks on next button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
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
|website|Title|Fname |Lname     |State   |DOB                 |WorkHr|TypeofCove|Benefit |Mstatus|Height|Weight|Sex |MemId |Street                 |City         |Zipcode|PhoneType|PhoneNum  |BusinessType|Password|VerifyPass|State1     |State2  |State3   |State4    |State5       |State6       |State7   |State8               |State9  |State10 |State11|State12    |State13  |State14  |State15    |State16   |State17    |State18  |State19 |State20    |State21     |State22  |pdfScenario|pdfEnable|pdfName                               |pdfScenario1	|pdfName1					|BusinessName| 
|aao	|Mr.  |Sean  |Rutherford|Colorado|SYSDate- 17Y/00M/00D|25    |New       |$400,000|Single |5.2   |180   |Male|254871|836 Emerald St. Boulder|Colorado City|80944  |Mobile   |9575454878|Corporation |Test@123|Test@123  |California |Alabama |Arkansas |Louisiana |Pennsylvania |Rhode Island |Maryland |District of Columbia |Florida |Kansas  |Maine  |New Jersey |New York |Oklahoma |Puerto Rico|Tennessee |Washington |Virginia |Wyoming |New Mexico |Connecticut |Minnesota|AAO06_WY 	|1        |Important Notice All except NM 2 08.12|AAO06_NM		|Important Notice NM 2 08.12|EraTail|
		