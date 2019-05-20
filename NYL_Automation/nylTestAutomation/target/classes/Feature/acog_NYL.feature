Feature: Acog Test

@AcogRegression_1
Scenario Outline: <ACOG_SC01> Application submission for Self and Spouse with all the products, Beneficiary and rider(s)
 
	Given Test set up for "NYL" feature and "NYL_ACOG" scenario
	Given Customer navigate to NYL "<Website>"		
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user 
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
	Then Click on Self
	Then Select NO for Association Membership	
	Then Select NO for Resident
	Then Select YES for all Duties of Regular Occupation
	And Validate that NEXT button is Disabled   
	Then Select YES Radio button of Membership
	And Validate that NEXT button is Enabled
	Then Select YES for all Duties of Regular Occupation
	Then Click on Spouse
	And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"  
	Then Select radio button NO for Spouse is Member
	And Clicks on next button
	And Validate Age Restriction Message
	#Error: You are not eligible for any products.
	And Enters DOB for Self as "<DOB1>"
	And Enters DOB for Spouse as "<SDOB1>"
	And Clicks on next button
	And Validate Age Restriction Message
	#Error: You are not eligible for any products.
	And Enters DOB for Self as "<DOB2>"
	And Enters DOB for Spouse as "<SDOB2>"   
	And Clicks on next button
	Then Product page details are displayed to user
	And Clicks on Back or Previous button
	And Enters DOB for Self as "<DOB3>"
	And Enters DOB for Spouse as "<SDOB3>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Clicks on Back or Previous button 	
	Then Eligibility page details are displayed to user 
	And Enter New State as "<State1>"   
	And Clicks on next button
	Then Product page details are displayed to user 
	And Validate the following products are displayed: GroupTerm TenYTL TwentyYTL   
	# DI product restricted
	And Clicks on Back or Previous button	
	Then Eligibility page details are displayed to user 
	And Enter New State as "<State2>" 
	And Clicks on next button
	And Validate Age Restriction Message
	And Enter New State as "<State>"  
	And Clicks on next button
	Then Product page details are displayed to user
	And Clicks on next button
	And Validate Error Message on Product Page 
	And Selects product Group Term for Self
	And Selects product Group Term for Spouse
	And Selects product TenYTL for Self
	And Selects product TenYTL for Spouse
	And Selects product TwentyYTL for Self
	And Selects product TwentyYTL for Spouse
	And Selects product DII for Self
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
	And Enters Monthly Income for Self as "<MonthlyIncome>"
	And Selects Answer as No for Applying any Other Insurance
	And Clicks on next button
	Then Request Coverage page is displayed to user 
	And Validate Max aggregrate Message is displayed for Group Term Product
	And Click on Group Ten-Year Level Term Life Insurance on Request Coverage Page
	And Validate Max aggregrate Message is displayed for TenYTL Product
	And Click on Group Twenty-Year Level Term Life Insurance on Request Coverage Page
	And Validate Max aggregrate Message is displayed for TwentyYTL Product
	Then Select Benefit Amount for Self as "<Benefit>" under Group Term Product
	And Validates under Group Term Life the Benefit Slider Range as "<Min>" to "<Max>"
	And Selects Benefit Amount for Spouse as "<SBenefit>" under Group Term Life
	And Validates under Group Term Life for Spouse the Benefit Slider Range as "<Min>" to "<Max>"
	And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
	And Validates under TenYTL the Benefit Slider Range as "<Min>" to "<Max>" for self
	And Selects Benefit Amount for Spouse as "<SBenefit1>" under TenYTL
	And Validates under TenYTL the Benefit Slider Range as "<Min>" to "<Max>" for Spouse
	And Selects Benefit Amount for Self as "<Benefit2>" under TwentyYTL
	And Validates under TwentyYTL the Benefit Slider Range as "<Min>" to "<Max>"
	And Selects Benefit Amount for Spouse as "<SBenefit2>" under TwentyYTL
	And Validates under TwentyYTL the Benefit Slider Range as "<Min>" to "<Max>" for Spouse
	And Selects Monthly Benefit Amount for Self as "<Benefit3>" under DII
	And Validates under DII the Benefit Slider Range as "<Min_DII>" to "<Max_DII>"
	And Selects Waiting Period for Self as "<WaitP>" under DII
	And Validate Maximum Monthly Benefit Amount for DII "<MonthlyBenefit>"
	And Selects Benefit Option for Self as "<BenOpt>" under DII
	And Validate that the Catastrophic Disability Benefit Rider is not rendered
	And Selects Benefit Option for Self as "<BenOpt1>" under DII
	And Validate that the Catastrophic Disability Benefit Rider is rendered
	And Selects Catastrophic Disability Benefit Rider for DII Self 
	And Validate that the Rider message is displayed
	And Select Rider Benefit Amount for DII Self as "<RidBenefit>"
	And Validates under Rider the Benefit Slider Range for DII Self as "<MinRid>" to "<MaxRid>"
	And Selects Cost of Living Adjustment Rider for DII Self 
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
	And User Enters Beneficiary details as "<Trust>","<DateTrust>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons	
	And User Enters Beneficiary details as "<Trust1>","<DateTrust1>"
	And Clicks on OK button
	And Delete Contingent Beneficiary 
	And Delete box is displayed and clicks on Yes
	And Clicks on Add Beneficiary Button for Spouse under TwentyYTL
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse under TwentyYTL
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship as other "<Bname1>","<Blname1>","<Relationship1>","<Perc1>","<Desc>"
	And Clicks on OK button
	And Delete Contingent Beneficiary 
	And Delete box is displayed and clicks on Yes
	And Clicks on next button
	Then Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<StreetAddress>","<City>","<ZipCode>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page 
	And Selects Yes for Travel Question Non QD for Self 
	And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>"
	And Selects Yes Radio button for Tobacco Question 
	And Validates Last Used Date Textbox and Specify the products used Textbox is displayed
	And Enters Last Used Tobacco Date Details for Self as "<TobDate>"
	And Clicks on Products used textbox for Self and Selects Product as "<Product>"
	And Selects Residential Radio Button
	And Selects Yes Radio Button for Business Address
	And Enters Business Details as "<BusinessName>","<BusinessType>"
	And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>"
	And Selects Yes for Travel Question Non QD for Spouse 
	And Enters details for Spouse as "<SCountry>","<SMonths>"
	And Selects Yes Radio button for Tobacco Question for Spouse
	And Validates Last Used Date Textbox and Specify the products used Textbox is displayed for Spouse
	And Enters Last Used Tobacco Date Details for Spouse as "<STobDate>"
	And Clicks on Products used textbox for Spouse and Selects Product as "<SProduct>"
	And Clicks on next button
	Then Application Summary Page is displayed to user 
	And Verify Benefit Amount for Self as "<Benefit>" under Group Term
	And Verify Benefit Amount for Self as "<Benefit1>" under TenYTL
	And Verify Benefit Amount for Self as "<Benefit2>" under TwentyYTL
	And Verify Benefit Amount for Self as "<Benefit3>" under DII
	And Verify Benefit Option for Self as "<BenOpt1>" under DII Plan Age65
	And Verify Riders portion for Self amount as "<RidBenefit>" under DII 
	And Verify Riders COLA is displayed
	And Verify Benefit Amount for Spouse as "<SBenefit>" under Group Term
	And Verify Benefit Amount for Spouse as "<SBenefit1>" under TenYTL
	And Verify Benefit Amount for Spouse as "<SBenefit2>" under TwentyYTL
	And Clicks on next button
	Then Authorize page details are displayed to user 
	And Clicks on next button
	And Validate Error message for Authorization
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
| Website | Title   | Fname   | Lname   | State                  | DOB                | Stitle | Sfname | Slname   | SDOB                |  DOB1                 |  SDOB1             | DOB2                 |SDOB2                | DOB3                |SDOB3               |State1       |State2 |MonthlyIncome |  Min      | Max         | Min_DII  |  Max_DII  |Benefit |SBenefit | Benefit1| SBenefit1| Benefit2 | SBenefit2  |MonthlyBenefit |WaitP  | Benefit3  | BenOpt1     		|BenOpt             | RidBenefit| MinRid  | MaxRid | Trust        |DateTrust  |Trust1    | DateTrust1 | Bname  | Blname |Relationship|Perc|Bname1 | Blname1 |Relationship1 |  Perc1   |  Desc    | SSN       | Mstatus | Height | Weight |Gender_Self |MemberId          |StreetAddress          |City       | ZipCode|PrimaryPhType|  PrimaryPhNo |Country    |Months |TobDate            | Product    | BusinessName  | BusinessType   | SSSN       | SHeight  |  SWeight   | Gender_Spouse   | SPhoneType   |  SPhoneNum   |  SCountry   | SMonths  |STobDate             |SProduct       |
| acog    | Mr.     | Allen   | Shoey   | District of Columbia   |SYSDate- 16Y/11M/29D|  Mrs.  |  Donna |  Shoey   | SYSDate- 16Y/11M/29D|  SYSDate- 60Y/00M/00D |SYSDate- 60Y/00M/00D| SYSDate- 59Y/11M/29D |SYSDate- 59Y/11M/29D |SYSDate- 17Y/00M/00D |SYSDate- 17Y/00M/00D|New Hampshire|Florida|25,000        |  $100,000 |  $2,000,000 | $1,000   | $10,000   |140000  |150000   | 110000  | 120000   | 140000   |  480000    | $10,000       |60 days|    5500   | Plan A - To age 65| Plan C - 24 months|  1000     |	1,000 | 3,000  | Trustone Pvt |10121985   |Trust Ltd.| 10122001   | Bernice| Shoey  |Daughter    |100 |Bethany| Tom     |Other         |  100     | Gaurdian | 564878954 | Married |   6.2  | 200    |Male        |52874596314698571 | 14th, St NE Street Park| Washington| 20008  |Home         |  2545247898  | Azerbaijan|  8    |SYSDate- 0Y/01M/15D| Betel Nut  |  Insurance    |  Corporation   |  524178963 | 5.3      |  250       | Female          |  Home        |  5241789684  |   Armenia   |  12      |SYSDate- 00Y/06M/00D |Chewing tobacco|


@AcogRegression_2
Scenario Outline: <ACOG_SC02> Application submission for Self only with LI products

	Given Test set up for "NYL" feature and "NYL_ACOG" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
	Then Click on Self
	Then Select YES Radio button of Membership
	Then Select YES for all Duties of Regular Occupation
	And Clicks on next button
	And Validate Age Restriction Message
	And Enters DOB for Self as "<DOB1>"  
	And Clicks on next button
	Then Product page details are displayed to user 
	And Validates TwentyYTL products are not displayed
	And Verify Available Product List GroupTerm,TenYTL,DII
	And Clicks on Back or Previous button
	Then Eligibility page details are displayed to user
	And Enters DOB for Self as "<DOB2>"  
	And Clicks on next button
	Then Product page details are displayed to user 
	And Verify Available Product List GroupTerm TenYTL,TwentyYTL,DII
	And Selects product Group Term for Self
	And Selects product TenYTL for Self
	And Selects product TwentyYTL for Self
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	And Clicks on next button
	Then Validate error message for required question
	And Confirms Imp Replacement Info for NewYork state	
	And Clicks on next button
	And Clicks on Back or Previous button
	Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Self
	And Enter additional details as "<TotalAmount>","<Iamount>","<Company>"
	And Verify New York State paragraph is displayed for Self
	And Clicks on next button
	Then Request Coverage page is displayed to user
	Then Select Benefit Amount for Self as "<MaxBenefit>" under Group Term Product
	And Selects Benefit Amount for Self as "<MaxBenefit1>" under TenYTL
	And Selects Benefit Amount for Self as "<MaxBenefit2>" under TwentyYTL
	And Clicks on next button
	And Validate Max Aggregate error message
	And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"  
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname1>","<Blname1>","<Relationship1>","<Perc1>"   
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname2>","<Blname2>","<Relationship2>","<Perc2>"     
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And Selects the First Option from Existing Beneficiaries List and select Type as "<BeneType>"	
	And Enters Percentage for First Option as "<Perc3>"	
	And Selects the Second Option from Existing Beneficiaries List and select Type as "<BeneType>"
	And Enters Percentage Second Option as "<Perc4>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons	
	And User Enters Beneficiary details as "<Trust>","<DateTrust>"
	And Clicks on OK button
	And Verify that the Percent Displayed for Trust is "<TrustPercent>"
	And Clicks on Add Beneficiary Button for Self under TenYTL
	Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons	
	And User Enters Beneficiary details as "<Trust1>","<DateTrust1>"
	And Clicks on OK button
	And Validates error message on Beneficiary page that Only one Trust is allowed as Contingent
	And Clicks on Close button
	And Clicks on next button
	And Enters contact Details without SSN and MemberID for Self as "<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No for Travel Question Non QD for Self
	And Selects No Radio button for Tobacco Question Self 
	And Selects Business Address Radio Button for Send Correspondence To
	And Selects Yes Radio Button for Business Address
	And Enters Business Details as "<BusinessName>","<BusinessType>"
	And Clicks on next button
	And Validates SSN Required Error Message for Self
	And Enters SSN "<SSN>" for Self
	And Clicks on next button
	Then Application Summary Page is displayed to user 
	And Clicks on next button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	And Verify that fraud notice is not rendered at Authorization page 
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish 
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"
		
Examples:
| Website | Title   | Fname   | Lname |State   | DOB                 | DOB1                |DOB2                |TotalAmount|Iamount|Company |MaxBenefit |MaxBenefit1|MaxBenefit2|Benefit1 |Bname |Blname|Relationship|Perc|Bname1 | Blname1|Relationship1|Perc1|Bname2 |Blname2|Relationship2|Perc2|Perc3|Perc4| BeneType|Trust     | DateTrust           |Trust1   |DateTrust1          |TrustPercent|SSN       | Mstatus | Height | Weight | Sex   |Street           |City    | Zipcode |PrimaryPhType |PrimaryPhNo|BusinessName      |BusinessType    |
| acog    | Mr.     | Gerard  | Johnes|New York| SYSDate- 63Y/00M/10D| SYSDate- 50Y/00M/08D|SYSDate- 49Y/11M/29D|2500	    |500    |Corp U.S|1,000,000  | 1,000,000 | 100,000   |900,000  |Al    |John  |Father      |50  |Dennis |  John  |Son          |50   |Jane   |John   |Daughter     |40   |40   |20   |Primary  |Corp Trust| SYSDate- 50Y/08M/01D|Co Trust |SYSDate- 10Y/08M/01D|100 %       |564878954 | Single  |   5.4  | 150    | Male  |44 Downing St #3C|New York| 65488   |Home          |2545247898 |Kids Theme Dresses|Sole Proprietary|


@AcogRegression_3
Scenario Outline: <ACOG_SC03> Validation Read & Sign Page with 20 different States one by one in loop  (spouse only where self as Resident)

	Given Test set up for "NYL" feature and "NYL_ACOG" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
	Then Select NO for Association Membership
	Then Select YES for Resident 
	Then Select YES for all Duties of Regular Occupation
	Then Click on Self
	Then Click on Spouse
	And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"  
	Then Select radio button NO for Spouse is Member
	And Clicks on next button
	Then Product page details are displayed to user
	And Verify Available Product List GroupTerm,TenYTL,DII
	And Selects product Group Term for Self				
	And Selects product Group Term for Spouse
	And Selects product DII for Self
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
	And Selects Answer as No for Applying any Other Insurance 				
	And Enters Monthly Income for Self as "<MonthlyIncome>"   				
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Select Benefit Amount for Self as "<Benefit>" under Group Term Product
	And Selects Benefit Amount for Spouse as "<SBenefit>" under Group Term Life
	And Selects Monthly Benefit Amount for Self as "<Benefit1>" under DII
	And Selects Waiting Period for Self as "<WaitPeriod>" under DII
	And Selects Benefit Option for Self as "<BenOpt>" under DII
	And Validate that the Wait Period is disabled with value as "<WaitPeriod>"
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Add Beneficiary Button for Spouse under GroupTermLife
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relationship>","<Percen>"
	And Clicks on OK button
	And Clicks on Skip Beneficiary Button					
	And Delete box is displayed and clicks on Yes
	Then Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<StreetAddress>","<City>","<ZipCode>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No Radio button for Tobacco Question Self
	And Selects No for Travel Question Non QD for Self 
	And Selects Yes Radio Button for Business Address
	And Enters Business Details as "<BusinessName>","<BusinessType>" 
	And Selects Residential Radio Button
	And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>"
	And Answer all other questions of Spouse as No for Nicotin and Outside US Twelve
	And Clicks on next button
	Then Application Summary Page is displayed to user 
	And Clicks on next button
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
	And Validate Fraud Notice CA in Read and Sign Box					
	And Navigate back to Eligibility page 						
	And Enter New State as "<State2>"					
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
	And Enter New State as "<State3>"					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button						
	And Validate Fraud Notice AL in Read and Sign Box					
	And Navigate back to Eligibility page 	 					
	And Enter New State as "<State4>"					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button							
	And Validate Fraud Notice PA in Read and Sign Box					
	And Navigate back to Eligibility page 	 					
	And Enter New State as "<State5>"					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button						
	And Validate Fraud Notice RI in Read and Sign Box					
	And Navigate back to Eligibility page 					
	And Enter New State as "<State6>"					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Validate Fraud Notice DC in Read and Sign Box					
	And Navigate back to Eligibility page 					
	And Enter New State as "<State7>"					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button	
	And Validate Fraud Notice KS in Read and Sign Box					
	And Navigate back to Eligibility page 					
	And Enter New State as "<State8>"					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button						
	And Validate Fraud Notice NJ in Read and Sign Box					
	And Navigate back to Eligibility page 					
	And Enter New State as "<State9>"					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button	
	And Validate Fraud Notice OK in Read and Sign Box					
	And Navigate back to Eligibility page 					
	And Enter New State as "<State10>"					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button						
	And Validate Fraud Notice TN in Read and Sign Box					
	And Navigate back to Eligibility page 					
	And Enter New State as "<State11>"					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button		
	And Validate Fraud Notice VA in Read and Sign Box					
	And Navigate back to Eligibility page 					
	And Enter New State as "<State12>"					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button	
	And Validate Fraud Notice AR in Read and Sign Box
	And Navigate back to Eligibility page 					
	And Enter New State as "<State13>"					
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
	And Enter New State as "<State14>"					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Validate Fraud Notice MN in Read and Sign Box					
	And Navigate back to Eligibility page 					
	And Enter New State as "<State15>"					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Validate Fraud Notice CT in Read and Sign Box 
	And Validates additional Notes for Connecticut state					
	And Navigate back to Eligibility page 					
	And Enter New State as "<State16>"					
	And Clicks on next button
	And Validate that DII product is not displayed	
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Validate Fraud Notice MD in Read and Sign Box					
	And Navigate back to Eligibility page 					
	And Enter New State as "<State17>"					
	And Clicks on next button
	And Validate that DII product is not displayed					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Clicks on next button					
	And Validate Fraud Notice WM in Read and Sign Box
	And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario>","<pdfEnable>","<pdfName>"				
	

Examples:
| Website |Title |Fname |Lname |State      |DOB               | Stitle | Sfname| Slname|SDOB               |MonthlyIncome|Benefit |SBenefit| Benefit1 |WaitPeriod |WaitPeriod1 | BenOpt            |Bfname |Blname |Relationship |Percen |SSN        |Mstatus  |Gender_Self|Height |Weight|StreetAddress           |City    |ZipCode|PrimaryPhType|PrimaryPhNo|BusinessName | BusinessType | SSSN     |  SHeight| SWeight |Gender_Spouse |   SPhoneType | SPhoneNum   |State1     |State2  |State3   |State4       |State5       |State6               |State7  |State8     |State9   |State10    |State11  |State12 |State13    |State14   |State15     |State16   |State17  |pdfScenario|pdfScenario1|pdfEnable|pdfName                               |pdfName1                   |
| acog    |Mr.   |Adam  |Gill  |Colorado   |SYSDate- 59Y/0M/0D|  Mrs.  | Jane  | Gill  |SYSDate- 50Y/0M/0D |20,000       |670,000 |600,000 |  1700    |180 Days   |60 Days     | Plan C - 24 months|JOHN   |CARTER |Spouse       |100    |553-43-4348|Married  |Male       | 4.10  | 150  | 22main Street Add Park |New Port| 54789 |Mobile       |5343545435 | Tanks supply|  Partnership | 254789687|  6.5    | 125     | Female       |  Home        |  2147896587 |California |New York| Alabama |Pennsylvania |Rhode Island |District of Columbia |Kansas  |New Jersey |Oklahoma |Tennessee  |Virginia |Arkansas|New Mexico |Minnesota |Connecticut |Maryland  |Wyoming  |ACOG03_WY  |ACOG03_NM   |1        |Important Notice All except NM 2 08.12|Important Notice NM 2 08.12|


@AcogRegression_4
Scenario Outline: <ACOG_SC04> Application submission for Spouse only with LI products

	Given Test set up for "NYL" feature and "NYL_ACOG" scenario
	Given Customer navigate to NYL "<Website>"	
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
	Then Select YES Radio button of Membership
	Then Select NO for all Duties of Regular Occupation
	Then Click on Spouse
	And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
	Then Select radio button Yes for Spouse is Member
	And Verify that the dependent note is displayed for Spouse  		
	And Clicks on next button
	And Verify that error message is displayed for state eligibility at top of the page
	And Enter New State as "<State1>"     
	And Clicks on next button
	And Verify that error message is displayed for state eligibility at top of the page
	And Enter New State as "<State2>"
	And Clicks on next button
	And Verify that error message is displayed for state eligibility at top of the page
	And Enter New State as "<State3>"
	And Clicks on next button
	Then Product page details are displayed to user 
	And Validate that DII product is not displayed 
	And Selects product Group Term for Spouse
	And Selects product TenYTL for Spouse
	And Selects product TwentyYTL for Spouse
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Spouse
	And Enter additional details as "<STamount>","<SIamount>","<SCompany>" for Spouse
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Spouse as "<MaxBenefit>" under Group Term Life
	And Selects Benefit Amount for Spouse as "<MaxBenefit1>" under TenYTL
	And Selects Benefit Amount for Spouse as "<MaxBenefit2>" under TwentyYTL
	And Clicks on next button
	And Validate Max Aggregate error message  
	And Selects Benefit Amount for Spouse as "<Benefit>" under Group Term Life
	And Selects Benefit Amount for Spouse as "<Benefit1>" under TenYTL
	And Selects Benefit Amount for Spouse as "<Benefit2>" under TwentyYTL
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Add Beneficiary Button for Spouse under TwentyYTL
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse under TwentyYTL
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship as other "<Bname1>","<Blname1>","<Relationship1>","<Perc1>","<Desc>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse under TwentyYTL
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname2>","<Blname2>","<Relationship2>","<Perc2>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse under TwentyYTL
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname3>","<Blname3>","<Relationship3>","<Perc3>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse under TwentyYTL
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname4>","<Blname4>","<Relationship4>","<Perc4>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse under TwentyYTL
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname5>","<Blname5>","<Relationship5>","<Perc5>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse under TwentyYTL
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname6>","<Blname6>","<Relationship6>","<Perc6>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Spouse under TwentyYTL
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname7>","<Blname7>","<Relationship7>","<Perc7>"
	And Clicks on OK button
	And Clicks on next button
	Then Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<Gender_Self>","<Street>","<City>","<ZipCode>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page 
	And Selects Residential Radio Button
	And Enters contact Details for Spouse without SSN as "<Gender_Spouse>","<SHeight>","<SWeight>","<SPhoneType>","<SPhoneNum>"	
	And Answer all other questions of Spouse as No for Nicotin and Outside US Twelve
	And Clicks on next button
	And Validates SSN Required Error Message for Spouse
	And Enters SSN as "<SSSN>" for Spouse
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
		
Examples:
| Website | Title |Fname|Lname |State  |DOB                 |Stitle|Sfname |Slname |SDOB                |State1 |State2          |State3    |MaxBenefit|MaxBenefit1|MaxBenefit2|Benefit |Benefit1|Benefit2|Bname |Blname |Relationship|Perc  |Bname1|Blname1|Relationship1|Perc1 | Desc    | Bname2| Blname2 |  Relationship2 |   Perc2 |  Bname3   | Blname3    |Relationship3|   Perc3   |  Bname4|  Blname4   |  Relationship4   |  Perc4  | Bname5   |   Blname5   |Relationship5| Perc5   |Bname6|Blname6| Relationship6 |  Perc6  |  Bname7    | Blname7     |Relationship7| Perc7|SSN        |Mstatus |Gender_Self|Street                |City      |ZipCode|PrimaryPhType| PrimaryPhNo |SHeight|SWeight|Gender_Spouse|SPhoneType|SPhoneNum  | SSSN      |STamount |SIamount|SCompany       |
| acog    | Mr.   |John |Thomas|Nunavut|SYSDate- 40Y/00M/00D|Mrs.  |Cynthia|Thomas |SYSDate- 30Y/01M/14D|Ontario|British Columbia|California|500,000   |700,000    | 1,000,000 |600000  |500000  |900,000 |Allen |Thomas |Son         | 20   |Jane  |Dane   |Other        |20    | Grandma | Jim   |  Thomas |  Father        |   30    |  Kelly    | Thomas     | Mother      |    30     |   Laura| Thomas     |    Spouse        |  10     |    Oprah | Thomas      |  Daughter   |    10   |Helis | Thomas|    Son        |   10    |   Allis    |   Thomas    |  Son        |  70  |854126987  |Married |Male       |1048 Los/Kene Gamos Dr|San Rafael|94903  |Business     |  2541587496 |5.3    |120    |Female       |Home      | 1452789658| 125478968 | 5000    | 1200   |Corp world Ltd |               

 
@AcogRegression_5
Scenario Outline: <ACOG_SC05> Application submission for Self as Resident with DI product and Cost Of Living Adjustement rider 

	Given Test set up for "NYL" feature and "NYL_ACOG" scenario
	Given Customer navigate to NYL "<Website>"		
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user 
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
	Then Click on Self
	Then Select YES Radio button of Membership
	Then Select YES for all Duties of Regular Occupation
	And Clicks on next button
	Then Product page details are displayed to user 
	And Selects product DII for Self 
	And Clicks on next button
	And Enters Monthly Income for Self as "<MonthlyIncome>"
	Then Selects Answer as No for Applying any Other Insurance
	And Clicks on next button
	And Validates under DII the Benefit Slider Range for Self as "<MinDI>" to "<MaxDI>"
	And Clicks on Back or Previous button
	And Enters Monthly Income for Self as "<MonthlyIncome1>"
	And Clicks on next button
	And Validates under DII the Benefit Slider Range for Self as "<MinDI1>" to "<MaxDI1>"
	Then Navigate back to Eligibility page 
	And Enters DOB for Self as "<DOB1>"  
	Then Select NO for Association Membership
	Then Select YES for Resident 
	Then Select NO for all Duties of Regular Occupation
	And Clicks on next button
	Then Product page details are displayed to user 
	And Validate that DII product is not displayed 
	And Clicks on Back or Previous button 
	Then Select YES for all Duties of Regular Occupation
	And Clicks on next button
	Then Product page details are displayed to user 
    And Verify Available Product List GroupTerm,TenYTL,DII
	And Verify that DII is already selected for Self
	And Clicks on next button
	And Selects Yes for unable to work because of a disability for Self
	And Enters Monthly Income for Self as "<MonthlyIncome2>"
	And Clicks on Add Company Button
	And Enters details for Company "<Company>","<BenAmt>","<BenPeriod>" and click on add button
	And Selects Yes for replace any other company's coverage for Self
	And Enters Amount under replace any other company's coverage as "<RepAmount>"
	And Clicks on next button
	Then Request Coverage page is displayed to user 
	And Selects Monthly Benefit Amount for Self as "<MonthlyBenefit>" under DII
	And Validates under DII the Benefit Slider Range for Self as "<MinDI2>" to "<MaxDI2>"
	And Selects Waiting Period for Self as " <WaitPeriod>" under DII
	And Validate Maximum Monthly Benefit Amount for DII "<MonthlyBenefit>"
	And Selects Benefit Option for Self as "<BenOpt>" under DII
	#And Selects Cost of Living Adjustment Rider for DII Self
	And Clicks on button to Save for later
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>" 
	And Clicks OK Button Save For Later
	Then Refresh the browser
	Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive	 
	Then Request Coverage page is displayed to user 
	And Clicks on next button
	And Verify that the Beneficiary tab is disabled
	And Enters contact Details without SSN and MemberID for Self as "<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No for Travel Question Non QD for Self
	And Selects Residential Radio Button
	And Selects NO Radio Button for Business Address
	And Enters Business Details as "<BusinessName>","<BusinessType>"
	And Enter Business Address Details as "<BStreet>","<BCity>","<BState>","<BZipcode>"
	And Clicks on next button
	And Validates SSN Required Error Message for Self
	And Enters SSN "<SSN>" for Self
	And Clicks on next button
	Then Application Summary Page is displayed to user 
	#And Verify Riders COLA is displayed
	And Clicks on next button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish 
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"
	

Examples:
| Website | Title| Fname |Lname    | State  | DOB                  | MonthlyIncome| MinDI   |  MaxDI  | MonthlyIncome1 | MinDI1| MaxDI1   |DOB1              | MonthlyIncome2 | Company | BenAmt | BenPeriod | RepAmount  |MinDI2  | MaxDI2   |WaitPeriod| MonthlyBenefit  |BenOpt             | Password | VPassword |  Mstatus    |Height|Weight |  Sex   | Street           |   City | Zipcode| PrimaryPhType| PrimaryPhNo  | BusinessName  | BusinessType  |  BStreet       | BCity     | BState  |BZipcode | SSN       | 
| acog    | Mrs. |Jane   |Catharine| Kansas |SYSDate- 50Y/11M/10D  | 10000        | $1,000  | $5,000  |  7000          | $1,000| $4,900   |SYSDate- 59Y/0M/0D|  5000          | Coral   |  2000  |  6        | 1500       | 1,000  |  3000    |90 days   |$3,000           |Plan B - 60 months |  Test@123| Test@123  | Married     | 4.8  | 120   | Female | 1153 140th St    | Eureka |  12578 |  Mobile      | 0845646504   |  Janeine      |  Partnership  | 388 STAMM RD   | NEWINGTON | Delaware| 06111   | 987451478 |
        
 
