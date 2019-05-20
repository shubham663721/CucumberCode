Feature: NSPE Test

  @NSPERegression_1
  Scenario Outline: <NSPESC01> Application Submission for Self,  Spouse, Child All eligible products where self is member of NSPE(Primary Individual and Contingent Trust beneficiaries for all)
    Given Test set up for "NYL" feature and "NYL_NSPE" scenario
    Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
    Then Eligibility page details are displayed to user
		And Click on Self
		And Click on Spouse
		And Click on Child
		And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
		And Select NO Radio button of NSPE Membership for Self
		And Select NO for Full time Employee of NSPE Member for self
		And Validate that NEXT button is Disabled
		And Select YES for Full time Employee of NSPE Member for self
		And Validate that NEXT button is Enable
		And Select YES Radio button of NSPE Membership for Self
		And Validate that NEXT button is Enable
		And Enters Self WorkHr as "<WorkHr>"
		And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
		And Select NO Radio button of NSPE Membership for Spouse
		And Click on Add Child button
		Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
		And Selects Married question as No for Child
		And Selects No for full time student for Child
		And Click on Add Child button on Screen
		And Clicks on next button
		And Clicks on next button
		Then Product page details are displayed to user
		##Hide - And Validates that Self is displayed for TraditionalGroupTermLife, TenYTL, ADnD, DII
		##Hide - And Validates that Spouse is displayed for TraditionalGroupTermLife, TenYTL, ADnD
		##Hide - And Validates that Child is displayed for TraditionalGroupTermLife, TenYTL, ADnD
		And Clicks on Back or Previous button
		And Enter New State as "<State1>"
		And Clicks on next button
		And Verify that error message is displayed for state eligibility at top of the page
		And Enter New State as "<State>"
		And Clicks on next button
		Then Product page details are displayed to user
		And Clicks on next button
		And Verify Error Message for ATLEAST ONE PRODUCT is displayed on Product page
		##Hide - And Verify Available Product List GroupTerm TenYTL,TwentyYTL,DII
		##Hide - And Verify Available Product: ADnD
		##Hide - And Validates that Spouse is not displayed for DII
		##Hide - And Validates that Child is not displayed for DII
		And Selects product TenYTL for Self
    And Selects product TenYTL for Spouse
    And Selects product TenYTL for Child
		And Selects the product for Self, Spouse and Children for Group Term Life Insurance
		And Selects Product AccidentalDeath for Self
		And Selects Product AccidentalDeath for Spouse
		And Selects Product AccidentalDeath for Child
		And Selects product DII for Self
		And Clicks on next button
		Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for Self and enter details as "<TAmount>","<lamount>","<Company>"
		And Selects Yes for life insurance applied for intended to replace for Self
		Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Spouse
		And Selects Yes for life insurance applied for intended to replace for Spouse
		And Enter additional details as "<STAmount>","<Slamount>","<SCompany>" for Spouse
		And Selects Yes for unable to work because of a disability for Self
		And Enters Monthly Income for Self as "<MAmount>"
		And Clicks on Add Company Button
		And Enters details for Company "<Company1>","<BAmount>","<BPeriod>" and click on add button
		And Selects Yes for replace any other company's coverage for Self
		And Enters Amount under replace any other company's coverage as "<RAmount>"
		And Clicks on next button
		Then Request Coverage page is displayed to user
		And Select Benefit Amount for Self as "<Benefit>" under Group Term Product
		And Selects Benefit Amount for Spouse as "<SBenefit>" under Group Term Life
		And Validate Benefit Amount for Child as "<CBenefit>" under Group Term Life
		And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
		And Selects Benefit Amount for Spouse as "<SBenefit1>" under TenYTL
		And Validates benefit amount for Child as "<CBenefit1>" under TenYTL displayed in label
		And Selects Benefit Amount for Self as "<Benefit2>" under ADnD
		And Validates Benefit Amount for Spouse as "<SBenefit2>" under ADDI
		And Selects Benefit Amount for Child as "<CBenefit2>" under ADDI
		And Validates under ADDI the Benefit Amounts for Child Listed are: "<CBenefit2>"
		And NSPE_Selects Benefit Amount for Self as "<Benefit3>" under DII
    And Selects Waiting Period for Self under DII as "<WPeriod>"
    And Selects Benefit Duration for Self under DII as "<BDuration>"
		And Clicks on next button
		And Verify Error Message in Spouse section for TermLife
		#Note: Verifying Error Message is displayed for Spouse exceeding 50% of the member's benefit amount
		And Selects Benefit Amount for Spouse as "<SBenefit3>" under Group Term Life
		And Clicks on next button
		Then Beneficiary Page is displayed to user
		And Clicks on Add Beneficiary Button for Self under GroupTerm
		Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
		And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relationship>","<Perc>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button for Self under GroupTerm
		Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
		And User Enters Beneficiary details as "<Trust>","<Datetrust>"
		And Clicks on OK button
		 And Clicks on Add Beneficiary Button for Spouse under GroupTerm
		Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
		And User Enters Beneficiary details as name and relationship"<SBfname>","<SBlname>","<SRelationship>","<SPerc>"
		And Clicks on OK button
		 And Clicks on Add Beneficiary Button for Spouse under GroupTerm
		Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
		And User Enters Beneficiary details as "<STrust>","<SDatetrust>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button for Self under TenYTL
		Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
		And User Enters Beneficiary details as name and relationship"<Bfname1>","<Blname1>","<Relationship1>","<Perc1>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button for Self under TenYTL
		Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
		And User Enters Beneficiary details as "<Trust1>","<Datetrust1>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button for Spouse under TenYTL
		Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
		And User Enters Beneficiary details as name and relationship"<SBfname1>","<SBlname1>","<SRelationship1>","<SPerc1>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button for Spouse under TenYTL
		Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
		And User Enters Beneficiary details as "<STrust1>","<SDatetrust1>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button under ADDI for Self
		Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
		And User Enters Beneficiary details as name and relationship"<Bfname2>","<Blname2>","<Relationship2>","<Perc2>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button under ADDI for Self
		Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
		And User Enters Beneficiary details as "<Trust2>","<Datetrust2>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button for Spouse under ADDI
		Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
		And User Enters Beneficiary details as name and relationship"<SBfname2>","<SBlname2>","<SRelationship2>","<SPerc2>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button for Spouse under ADDI
		Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
		And User Enters Beneficiary details as "<STrust2>","<SDatetrust2>"
		And Clicks on OK button
		And Clicks on next button
		Then Contact Details page is displayed to user
		Then Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<Street>","<City>","<Zipcode>"
		And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page		
		And Selects Yes for Travel Question-TwelveMonths and Enters details for Self as "<Country>", "<HowLong>"
		And Selects Yes Radio button for Tobacco Question
    And Enters Last Used Tobacco Date Details for Self as "<TobDate>"
    And Clicks on Products used textbox for Self and Selects Product as "<Product>"
		And Selects Residential Radio Button
		And Selects Yes Radio Button for Business Address
		And Enters Business Address Details as "<BusinessName>","<BusinessType>"
		And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>"
		And Selects Yes for Travel Question Non QD for Spouse
	  And Enter datails for Outside US country and How Long months for Spouse as "<SCountry>","<SHowLong>"
		And Selects Yes Radio button for Tobacco Question for Spouse
    And Enters Last Used Tobacco Date Details for Spouse as "<STobDate>"
    And Clicks on Products used textbox for Spouse and Selects Product as "<SProduct>"
		And Clicks on next button
		Then Application Summary Page is displayed to user
		And Verify Benefit Amount for Self as "<Benefit>" under TermLife
		And Verify Benefit Amount for Spouse as "<SBenefit>" under TermLife
		And Verify Benefit Amount for Child as "<CBenefit>" under TermLife
		And Verify Benefit Amount for Self as "<Benefit1>" under TenYTL
		And Verify Benefit Amount for Spouse as "<SBenefit1>" under TenYTL
		And Verify Benefit Amount for child "<C4fname>","<TenYTL_SequenceNo1>" as "<CBenefit>" under TenYTL
		And Verify Benefit Amount for Self as "<Benefit2>" under ADDI
		And Verify Benefit Amount for Spouse as "<SBenefit2>" under ADDI
		And Verify Benefit Amount for Child as "<CBenefit2>" under ADDI
		And Verify Benefit Amount for Self as "<Benefit3>" under DII
		And Clicks on next button
		And Validates Consent message in Read and Sign Box for NonUW
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
|Website |Title|Fname |Lname |State     |DOB                 |State1|Stitle|Sfname|Slname|SDOB               |Cfname |Clname |CDOB                |Csex|WorkHr |TAmount |lamount |Company |STAmount |Slamount |SCompany |MAmount |Company1 |BAmount |BPeriod |RAmount |Benefit|SBenefit|CBenefit|Benefit1|SBenefit1 |CBenefit1 |Benefit2 |SBenefit2 |CBenefit2 |Benefit3 |WPeriod |BDuration |SBenefit3 |Bfname |Blname |Relationship |Perc |Trust    |Datetrust  |SBfname |SBlname |SRelationship |SPerc |STrust   |SDatetrust |Bfname1 |Blname1 |Relationship1 |Perc1 |Trust1          |Datetrust1 |SBfname1 |SBlname1 |SRelationship1 |SPerc1 |STrust1     |SDatetrust1 |Bfname2|Blname2 |Relationship2 |Perc2 |Trust2    |Datetrust2 |SBfname2 |SBlname2 |SRelationship2 |SPerc2 |STrust2      |SDatetrust2 |SSN         |Mstatus |Height |Weight |Gender_Self|Country |HowLong |Street      |City |Zipcode |PhoneType |PhoneNum       |TobDate    |Product    |BusinessName |BusinessType |SSSN        |SHeight |SWeight |Gender_Spouse|SCountry |SHowLong |SPhoneType |SPhoneNum  |STobDate   |SProduct   |pdfEnable |
|NSPE    |Mr.  |Alex  |Smith |Minnesota |SYSDate-18Y/00M/00D |Guam  |Mrs.  |Jenny |Smith |SYSDate-18Y/00M/00D|Sam    |Smith  |SYSDate-00Y/00M/14D |Male|45     |2000    |2000    |JFMA    |2000     |2000     |JFMA     |250000  |MSTP     |5000    |12      |5000    |25000  |50000   |$5,000    |50000   |50000     |5000      |50000    |100000    |5000      |$700      |60 Days |5 Years   |25000     |Axl    |Rose   |Son          |100  |MGM CORP |01/01/2001 |Dizzy   |Reeds   |Other         |100   |GNR CORP |01/01/1986 |Slash   |Rains   |Son           |100   |Pink Floyd Corp |01/01/1980 |Myles    |Keneddy  |Father         |100    |Dylan Trust |01/01/1970  |Marry  |Fox     |Mother        |100   |NMS Trust |01/01/2006 |David    |Gilmore  |Father         |100    |Phantom corp |01/01/1970  |115-45-6445 |Married |5.5    |200    |    Male   |Belgium |12      |12,Lemon rd |SAND |12579   |Home      |(454) 114-8484 |01/01/2010 |Cigarettes |Sun Corp     |Corporation |305-79-3167 |5.2     |180     |  Female     |Belgium  |12       |Home       |4541148484 |06/09/2013 |Cigarettes |0         |


 @NSPERegression_2
  Scenario Outline: <NSPESC02>Application Submission for Self only with all eligible products where self is member of NSPE (Benefitiary as Primary trust)
		Given Test set up for "NYL" feature and "NYL_NSPE" scenario
		Given Customer navigate to NYL "<Website>"
		When Clicks on Apply now button
		Then Eligibility page details are displayed to user
		And Click on Self
		And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"		
		And Select YES Radio button of NSPE Membership for Self
		And Enters Self WorkHr as "<WorkHr>"
		And Clicks on next button
		Then Product page details are displayed to user
		And Validates that Self is displayed for ADnD, DII
		And Clicks on Back or Previous button
		And Enters DOB for Self as "<DOB1>"
		#Note: Age validation for DOB SYSDate-16Y/11M/29D
		And Clicks on next button
		And Validate Age Restriction Message
		And Enters DOB for Self as "<DOB2>"
		#Note: Age validation for DOB SYSDate-65Y/00M/01D
		And Clicks on next button
		And Validate Age Restriction Message
		And Enters DOB for Self as "<DOB3>"
		#Note: Age validation for DOB SYSDate-59Y/11M/29D
		And Clicks on next button
		Then Product page details are displayed to user
		##Hide -And Validates that Self is displayed for TraditionalGroupTermLife, TenYTL, ADnD, DII
		And Clicks on Back or Previous button
		And Enters DOB for Self as "<DOB4>"
		#Note: Age validation for DOB SYSDate-60Y/00M/00D
		And Clicks on next button
		Then Product page details are displayed to user
		##Hide -And Verify Available Product: TenYTL
		Then Product page details are displayed to user
		And Clicks on Back or Previous button
		And Enters DOB for Self as "<DOB5>"
		And Clicks on next button
		##Hide -And Validates that Self is displayed for TraditionalGroupTermLife, TenYTL, ADnD, DII
		Then Product page details are displayed to user
		And Clicks on next button
		#And Verify Error Message is displayed
		And Validate Error Message on Product Page
		#And verify Self icon is available for TermLife, TenYTL, ADnD, DII
		##Hide -And Validates that Self is displayed for TraditionalGroupTermLife, TenYTL, ADnD, DII
		And Selects product TenYTL for Self
		And Selects product Group Term for Self
		And Selects product DII for Self
		And Selects Product AccidentalDeath for Self
		And Clicks on next button
		Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
		And Clicks on next button
		And Validate error message for required question
    And Confirms Imp Replacement Info for NewYork state
    Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for Self and enter details as "<MAmount>","<Iamount>","<Company>"
		#And Selects Yes for life insurance applied for intended to replace
		And Selects Yes for life insurance applied for intended to replace for Self
		And Enters Monthly Income for Self as "<MAmount>"
		And Selects Answer as No for Applying any Other Insurance
		#And Verify New York State paragraph is displayed
		#And Selects Yes for applications pending Question
		#And Enters details as "<Iamount>","<Company>"
		And Clicks on next button
		Then Request Coverage page is displayed to user
		And Validates under Group Term Life the Benefit Slider Range as "<RangeMin>" to "<RangeMax>"		
		And Select Benefit Amount for Self as "<Benefit>" under Group Term Product
		And Validates under TenYTL the Benefit Slider Range as "<RangeMin1>" to "<RangeMax1>" for self
		And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
		And Validates under ADDI the Benefit Slider Range as "<RangeMin2>" to "<RangeMax2>"
		And Selects Benefit Amount for Self as "<Benefit2>" under ADDI
		And Validates under DisabilityIncomeInsurance the Benefit Slider Range as "<RangeMin3>" to "<RangeMax3>"
		And NSPE_Selects Benefit Amount for Self as "<Benefit3>" under DII
		And Selects Waiting Period for Self under DII as "<WPeriod>"
    And Selects Benefit Duration for Self under DII as "<BDuration>"
		And Clicks on next button
		And Clicks on button to Save for later
		Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VerifyPass>"
		And Clicks OK Button Save For Later
		Then Refresh the browser
		Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive
#		Then Request Coverage page is displayed to user
#		And Clicks on next button
#		Then Request Coverage page is displayed to user
#		And Clicks on next button
		Then Beneficiary Page is displayed to user
		And Clicks on Add Beneficiary Button for Self under GroupTerm
		Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
		And User Enters Beneficiary details as "<Trust>","<Datetrust>"
		And Clicks on OK button
		And Click Delete button for first Primary Beneficiary for Self
		And Delete box is displayed and clicks on Yes
		And Clicks on Add Beneficiary Button for Self under GroupTerm
		Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
		And User Enters Beneficiary details as "<Trust>","<Datetrust>"
		And Clicks on OK button
		And Clicks on next button
		Then Contact Details page is displayed to user
		#And Selects reside outside the U.S. or Canada question as NO for Self
		And Selects No for Travel Question Non QD for Self
		#And Selects Send Correspondence to question as Business Address for Self		
		#And Enters contact Details for Male Self as "<SSN>", "<Mstatus>","<Height>","<Weight>", "<Street>","<City>","<Zipcode>","<PhoneType>","<PhoneNum>"
		Then Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"
		And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
		#And Validate Tobacco Question by  Selecting Answer YES for Self
		And Selects Yes Radio button for Tobacco Question
		#And Enters Details as "<TobDate>"
		#And Clicks on Products used textbox and Selects Product as "<Product>"		
		And Enters Last Used Tobacco Date Details for Self as "<TobDate>"
    And Clicks on Products used textbox for Self and Selects Product as "<Product>"
    And Selects Residential Radio Button
    And Selects Yes Radio Button for Business Address
		#And Selects Business Address question as Yes for Self
		And Enters Business Address Details as "<BusinessName>","<BusinessType>"
		And Clicks on next button
		Then Application Summary Page is displayed to user
		And Clicks on next button
		Then Authorize page details are displayed to user and confirm the term and conditions for Self
		And Validate Fraud Notice NY in Read and Sign Box
		#And confirm the term and conditions for Self
		And Clicks on next button
		Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
		Then Thank you page is displayed to user
		And Verify that Confirmation number is generated for "<Website>"

Examples:
|Website |Title |Fname |Lname   |State    |DOB                 |WorkHr |DOB1                |DOB2                |DOB3               |DOB4                |DOB5               |MAmount |Iamount|Company|RangeMin |RangeMax |Benefit |RangeMin1 |RangeMax1 |Benefit1 |RangeMin2 |RangeMax2|Benefit2 |RangeMin3 |RangeMax3 |Benefit3 |WPeriod |BDuration |Password |VerifyPass|Trust |Datetrust  |SSN         |Mstatus  |Height |Weight |Sex  |Street        |City |Zipcode |PhoneType |PhoneNum   |TobDate     |Product |BusinessName |BusinessType      |pdfEnable |
|NSPE    |Mr.   |Blake |Jhonson |New York |SYSDate-17Y/11M/29D |45     |SYSDate-16Y/11M/29D |SYSDate-65Y/00M/01D |SYSDate-59Y/11M/29D|SYSDate-60Y/00M/00D |SYSDate-18Y/00M/00D|11600    |10000  |CHEL   |$25,000  |$500,000 |$25,000 |$50,000   |$1,000,000|$50,000  |$50,000   |$250,000 |$100,000 |$200      |$7,500   |$300     |60 Days |5 Years   |Test@123 |Test@123  |JNM   |01/06/2010 |115-45-6445 |Married  |5.5    |200    |Male |##12,Lemon rd |SAND |12579   |Home      |4541148484 |06/12/2014  |Cigar   |Howard INC   |Sole Proprietary |0         |



@NSPERegression_3
  Scenario Outline: <NSPESC03> Application Submission for Spouse only with all eligible products where self is member of NSPE (Benefitiary as Primary & contingent Individuals and Contingent trust)
    Given Test set up for "NYL" feature and "NYL_NSPE" scenario
    Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
		Then Eligibility page details are displayed to user
		And Click on Spouse
		And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
		And Select YES Radio button of NSPE Membership for Self
		And Enters Self WorkHr as "<WorkHr>"
		And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
		And Select NO Radio button of NSPE Membership for Spouse
		And Clicks on next button
		Then Product page details are displayed to user
		#And verify Spouse icon is available for TermLife, TenYTL, ADnD
		##Hide-And Validates that Spouse is displayed for TraditionalGroupTermLife, TenYTL, ADnD
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
		#Note: Verify only Spouse is Available for ADnD
		And Validates that Spouse is displayed for ADnD	
		And Clicks on Back or Previous button
		And Enters DOB for Spouse as "<SDOB4>"
		And Clicks on next button
		Then Product page details are displayed to user
		And Validates that Spouse is displayed for TenYTL
		Then Product page details are displayed to user
		And Clicks on Back or Previous button
		And Enters DOB for Spouse as "<SDOB>"
		And Clicks on next button
		Then Product page details are displayed to user
		And Clicks on next button
		And Validate Error Message on Product Page	
		And Validates that Spouse is displayed for TraditionalGroupTermLife, TenYTL, ADnD
		And Selects product TenYTL for Spouse
		And Selects product Group Term for Spouse
		#And Selects product ADDI for Spouse
		And Selects Product AccidentalDeath for Spouse
		And Clicks on next button
		#Then Dependent coverage note is displayed to user and selects OK button
		Then Click YES for Dependent Coverage information
		#Then Product: Additional Questions page details are displayed to user and selects Answer as NO for all questions for Spouse
		And Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
		And Clicks on next button
		Then Request Coverage page is displayed to user
		And Validates under Group Term Life for Spouse the Benefit Slider Range as "<SRangeMin>" to "<SRangeMax>"
		And Selects Benefit Amount for Spouse as "<SBenefit>" under Group Term Life
		#And Validates under TenYTL the Benefit Slider Range as "<SRangeMin1>" to "<SRangeMax1>"
		And Validates under TenYTL the Benefit Slider Range as "<SRangeMin1>" to "<SRangeMax1>" for Spouse
		And Selects Benefit Amount for Spouse as "<SBenefit1>" under TenYTL
		#And Verify Benefit Amount for Spouse is "<SBenefit2>" under ADnD
		And Validates Benefit Amount for Spouse as "<SBenefit2>" under ADDI
		And Clicks on next button
		Then Beneficiary Page is displayed to user		
		And Clicks on Add Beneficiary Button for Spouse under GroupTerm
		Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
		And User Enters Beneficiary details as name and relationship"<SBfname>","<SBlname>","<SRelationship>","<SPerc>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button for Spouse under GroupTerm
		Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
		And User Enters Beneficiary details as name and relationship"<SBfname1>","<SBlname1>","<SRelationship1>","<SPerc1>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button for Spouse under GroupTerm
		Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
		And User Enters Beneficiary details as "<STrust>","<SDatetrust>"
		And Clicks on OK button
		And Verify that error message is displayed as trust cannot be added if individual already exists
		And Clicks on next button
		#And Verify Error Message is displayed for 100% share of Beneficiaries
		And Verify Error Message is displayed for share of Beneficiaries
		And Clicks on Close button
		#And Clicks on Edit Beneficiary Button for Spouse under GTL
		#And Clicks on Add Beneficiary Button for Spouse under GroupTerm
		#Then Add Beneficiary page will be displayed to user
		#And User Enters Beneficiary details as "<SPerc2>" for Individual Primary
		#And User Enters Beneficiary details as "<SPerc3>" for Individual Contingent
		Then Clicks on Edit button of "<BeneficiarySequence1>" Beneficiary for Spouse under GroupTermLife
		And Enter new Beneficiary Percentage as "<SPerc2>"
		And Clicks on OK button
		Then Clicks on Edit button of "<BeneficiarySequence2>" Beneficiary for Spouse under GroupTermLife
		And Enter new Beneficiary Percentage as "<SPerc3>"
		And Clicks on OK button
		And Clicks on next button
		Then Contact Details page is displayed to user
		
		#And Enters contact Details for Male Self as "<SSN>", "<Mstatus>","<Street>","<City>","<Zipcode>","<PhoneType>","<PhoneNum>"
		Then Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<Self_Gender>","<Street>","<City>","<Zipcode>"
		And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page	
		And Selects Residential Radio Button
		#And Selects Send Correspondence to question as Residential for Self
		#And Selects Business Address question as Yes for Self	
		#And Enters contact Details for Female Spouse as "<SSSN>","<SHeight>","<SWeight>","<SPhoneType>","<SPhoneNum>"
		And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>"
		#And selects reside outside the U.S. or Canada question as NO for Spouse
		And Selects No for Travel Question-TwelveMonths for Spouse
		#And Validate Tobacco Question by  Selecting Answer NO for Spouse
		And Selects No Radio button for Tobacco Question Spouse		
		And Clicks on next button
		Then Application Summary Page is displayed to user
		And Clicks on next button
		#Then Authorization page details are displayed to user
		Then Authorize page details are displayed to user and confirm the term and conditions for Self
		Then Authorize page details are displayed to user and confirm the term and conditions for Spouse
		#And confirm the term and conditions for Spouse
		And Clicks on next button
		#Then Please Review page is displayed to user and Clicks on Continue Start Sign for Self
		#And Clicks on Finish button
		Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
		Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish

		Then Thank you page is displayed to user
		And Verify that Confirmation number is generated for "<Website>"


Examples:
|Website|Title|Fname |Lname|State    |DOB                 |Stitle |Sfname |Slname |SDOB                |WorkHr |SDOB1               |SDOB2               |SDOB3               |SDOB4               |SRangeMin |SRangeMax|SBenefit |SRangeMin1 |SRangeMax1 |SBenefit1 |SBenefit2 |SBfname |SBlname|SRelationship |SPerc |SBfname1 |SBlname1 |SRelationship1 |BeneficiarySequence1|BeneficiarySequence2|SPerc1 |STrust      |SDatetrust |SPerc2 |SPerc3 |SSN       |Mstatus |Self_Gender|Street      |City |Zipcode |PhoneType |PhoneNum  |SSSN     |SHeight|SWeight |SPhoneType |SPhoneNum  |pdfEnable|
|NSPE   |Dr.  |Jamie |Fao  |Arkansas |SYSDate-18Y/00M/01D |Dr.    |Jenny  |Fao    |SYSDate-18Y/00M/01D |60     |SYSDate-16Y/11M/29D |SYSDate-65Y/00M/01D |SYSDate-17Y/00M/00D |SYSDate-64Y/11M/29D |$25,000   |$250,000 |$50,000  |$50,000    |$1,000,000 |$50,000   |$100,000  |Dizzy   |Reeds  |Father        |10    |Myles    |Keneddy  |Father         | 1                  |2                   |10     |Dylan Trust |01/01/1970 |100    |100    |155459045 |Married |Male       |12,Lemon rd |SAND |12579   |Home      |4541148484|339939030|5.2    |180     |Home       |4541148484 |0        |


@NSPERegression_4
Scenario Outline: <NSPESC04> Application Submission for Child only with all eligible products where self is member of NSPE (Maximum number of child)

		Given Test set up for "NYL" feature and "NYL_NSPE" scenario
    Given Customer navigate to NYL "<Website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user
And Click on Child
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Select NO Radio button of NSPE Membership for Self
And Select YES for Full time Employee of NSPE Member for self
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname1>","<Clname1>","<CDOB1>","<Csex1>"
And Selects Married question as Yes for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname2>","<Clname2>","<CDOB2>","<Csex2>"
And Selects Married question as No for Child
And Selects Yes for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname3>","<Clname3>","<CDOB3>","<Csex3>"
And Selects Married question as No for Child
And Selects Yes for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname4>","<Clname4>","<CDOB4>","<Csex4>"
And Selects Married question as Yes for Child
And Selects Yes for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname5>","<Clname5>","<CDOB5>","<Csex5>"
And Selects Married question as No for Child
And Selects Yes for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname6>","<Clname6>","<CDOB6>","<Csex6>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname7>","<Clname7>","<CDOB7>","<Csex7>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
#And Verify that Add Child Button is not present on Eligibility page
And Validates Add Child Button on Eligibility page is not present
And Clicks on next button
And Validate NSPE Membership is mandatory for Self
And Select YES Radio button of NSPE Membership for Self
And Enters Self WorkHr as "<WorkHr>"
And Clicks on next button
Then Product page details are displayed to user
And Clicks on next button
And Validate Error Message on Product Page
#And Verify Available Product List TenYTL GTL ADnD for child
##Hide- And Validates that Child is displayed for TraditionalGroupTermLife, TenYTL, ADnD
And Selects product TenYTL for Child
And Selects product Group Term Life Insurance for Child
#And Selects product ADnD for Child
And Selects Product AccidentalDeath for Child
And Clicks on next button

#Then Dependent coverage note is displayed to user and selects OK button
#Then Verify that the dependent note is displayed for Spouse
And Click YES for Dependent Coverage information
Then Request Coverage page is displayed to user
#And Verify Benefit Amount for Child is "<Cbenefit>" under GTL
And Validate Benefit Amount for Child as "<Cbenefit>" under Group Term Life
And Validates eligible children Names displayed as "<Cfname2>","<Cfname5>","<Cfname6>","<Cfname7>" under GroupTermLife
#And Verify Benefit Amount for Child is "<Cbenefit>" under TenYTL
And Validates benefit amount for Child as "<Cbenefit>" under TenYTL displayed in label
And Validates eligible children Names displayed as "<Cfname2>","<Cfname5>","<Cfname6>","<Cfname7>" under TenYTL
#And Verify Benefit Amount for Child is "<Cbenefit>" under ADnD
And Validates under ADDI the Benefit Amounts for Child Listed are: "<Cbenefit>"
And Validates eligible children Names are not displayed as "<Cfname>","<Cfname2>","<Cfname5>","<Cfname6>","<Cfname7>" under ADnD
And Clicks on next button

Then Contact Details page is displayed to user
#And Selects Send Correspondence to question as Residential for Self
#And Enters contact Details for Male Self as "<SSN>", "<Mstatus>", "<Street>","<City>","<Zipcode>","<PhoneType>","<PhoneNum>

Then Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<Self_Gender>","<Street>","<City>","<Zipcode>"
		And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page	
		And Selects Residential Radio Button


And Clicks on next button

Then Application Summary Page is displayed to user
And Validates Self as "<Fname>","<Lname>"
#And Validates Child1 as "<Cfname>","<Clname>"
#And Validates Benefit Amount for Child1 as "<Cbenefit>" under ADnD
#And Validates Child3 as "<Cfname2>","<Clname2>"
#And Validates Benefit Amount for Child3 as "<Cbenefit>" under ADnD
#And Validates Benefit Amount for Child3 as "<Cbenefit>" under TenYTL
#And Validates Benefit Amount for Child3 as "<Cbenefit>" under GTL
#And Validates Child6 as "<Cfname5>","<Clname5>"
#And Validates Benefit Amount for Child6 as "<Cbenefit>" under ADnD
#And Validates Benefit Amount for Child6 as "<Cbenefit>" under TenYTL
#And Validates Benefit Amount for Child6 as "<Cbenefit>" under GTL
#And Validates Child8 as "<Cfname7>","<Clname7>"
#And Validates Benefit Amount for Child8 as "<Cbenefit>" under ADnD
#And Validates Benefit Amount for Child8 as "<Cbenefit>" under TenYTL
#And Validates Benefit Amount for Child8 as "<Cbenefit>" under GTL


		And Verify Child name as "<Cfname>","<Clname>"
		And Verify Child name as "<Cfname2>","<Clname2>"
		And Verify Child name as "<Cfname5>","<Clname5>"
		And Verify Child name as "<Cfname7>","<Clname7>"
		
		And Verify Benefit Amount for child "<Cfname2>","<TermLife_SequenceNo_1>" as "<Cbenefit>" under TermLife
		And Verify Benefit Amount for child "<Cfname5>","<TermLife_SequenceNo_1>" as "<Cbenefit>" under TermLife
		And Verify Benefit Amount for child "<Cfname7>","<TermLife_SequenceNo_1>" as "<Cbenefit>" under TermLife	
			
		And Verify Benefit Amount for child "<Cfname2>","<TenYTL_SequenceNo_2>" as "<Cbenefit>" under TenYTL
		And Verify Benefit Amount for child "<Cfname5>","<TenYTL_SequenceNo_2>" as "<Cbenefit>" under TenYTL
		And Verify Benefit Amount for child "<Cfname7>","<TenYTL_SequenceNo_2>" as "<Cbenefit>" under TenYTL

		And Verify Benefit Amount for child "<Cfname>","<ADDI_SequenceNo_1>" as "<Cbenefit>" under ADDI
		And Verify Benefit Amount for child "<Cfname2>","<ADDI_SequenceNo_3>" as "<Cbenefit>" under ADDI
		And Verify Benefit Amount for child "<Cfname5>","<ADDI_SequenceNo_3>" as "<Cbenefit>" under ADDI
		And Verify Benefit Amount for child "<Cfname7>","<ADDI_SequenceNo_3>" as "<Cbenefit>" under ADDI

		And Clicks on next button
		And Validates Consent message in Read and Sign Box for NonUW
		#And Validates Consent message in Read and Sign Box
		And Clicks on next button
		And Validate Error message for Authorization
		Then Authorize page details are displayed to user and confirm the term and conditions for Self
		And Clicks on next button
		Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
		Then Thank you page is displayed to user
		And Verify that Confirmation number is generated for "<Website>"


Examples:
|Website |Title |Fname  |Lname  |State     |DOB                  |Cfname |Clname |CDOB    |Cfname1 |Clname1 |CDOB1               |Cfname2 |Clname2 |CDOB2               |Cfname3 |Clname3 |CDOB3               |Cfname4 |Clname4 |CDOB4               |Cfname5 |Clname5 |CDOB5               |Cfname6 |Clname6 |CDOB6               |Cfname7 |Clname7 |CDOB7               |WorkHr  |Cbenefit |TermLife_SequenceNo_1|TenYTL_SequenceNo_2|ADDI_SequenceNo_1|ADDI_SequenceNo_3|SSN         |Mstatus |Self_Gender|Street      |City |Zipcode |PhoneType |PhoneNum   |pdfEnable |
|NSPE    |Mr.   |Robert |Jones  |Minnesota |SYSDate-18Y/00M/01D  |Larry  |Jones  |SYSDate |Marry   |Jones   |SYSDate-18Y/11M/29D |Nick    |Jones   |SYSDate-25Y/11M/29D |Enrique |Jones   |SYSDate-26Y/00M/00D |Ariana  |Jones   |SYSDate-18Y/11M/29D |Perry   |Jones   |SYSDate-19Y/00M/00D |Indiana |Jones   |SYSDate-00Y/00M/14D |Lucy    |Jones   |SYSDate-18Y/11M/29D |45      |$5,000   |     1               |      2            |      1          |      3          |115-45-6445 |Married |Male       |12,Lemon rd |SAND |12579   |Home      |4541148484 |0         |


@NSPERegression_5
Scenario Outline:<NSPESC05> Application Submission for Self and Child only with all eligible products where self is member of NSPE (Benefitiary as maximum Primary Individuals and maximum Contingent individuals number)

Given Test set up for "NYL" feature and "NYL_NSPE" scenario
    Given Customer navigate to NYL "<Website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user
And Click on Self
And Click on Child
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<CSex>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Clicks on next button
#And Verify Error Message is displayed
And Verify that error message is displayed as help us to display at top of the page
And Select NO Radio button of NSPE Membership for Self
And Select YES for Full time Employee of NSPE Member for self
And Clicks on next button
Then Product page details are displayed to user
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB1>"
And Clicks on next button
#And Validate Age Restriction Message
###Hide-And Validates that Self is displayed for ADnD
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB>"
And Clicks on next button
Then Product page details are displayed to user
And Clicks on Back or Previous button
And Enter New State as "<State1>"
And Clicks on next button
#And Verify Error Message is displayed for Site Residency Exclusions
And Validate Age Restriction Message
And Enter New State as "<State2>"
And Clicks on next button
Then Product page details are displayed to user
#And Verify Available Product List is TenYTL GTL for Self
###Hide-And Validates that Self is displayed for TraditionalGroupTermLife, TenYTL
#And  verify ADnD DII is not available for Self
###Hide-And Validates that Self is not displayed for ADnD
###Hide-And Validate that DII product is not displayed for Self
And Clicks on Back or Previous button
And Enter New State as "<State>"
And Clicks on next button
Then Product page details are displayed to user
#And Verify Available Product List TenYTL GTL ADnD for Self
###Hide-And Validates that Self is displayed for TraditionalGroupTermLife, TenYTL
###Hide-And Validates that Self is displayed for ADnD
#And Verify Product DII is missing on Product page
###Hide-And Validate that DII product is not displayed
#And Verify Child icon missing on Product page
###Hide-And Validates that Child is not displayed for TermLife,TenYTL,ADDI
###Hide-And Validates that Child is not displayed for DII
And Clicks on Back or Previous button
And Select YES Radio button of NSPE Membership for Self
And Enters Self WorkHr as "<WorkHr>"
And Clicks on next button
#And Verify Self icon missing on Product page
###Hide-And Validates that Self is not displayed for TermLife,TenYTL,ADDI,DII
###Hide-And Validates that Spouse is not displayed for TermLife,TenYTL,ADDI,DII
And Clicks on Back or Previous button
And Enters Self WorkHr as "<WorkHr1>"
And Clicks on next button
#And Verify Self icon is displayed on Product page
###Hide-And Validates that Self is displayed for TraditionalGroupTermLife, TenYTL, ADnD, DII
Then Product page details are displayed to user
#And Verify Available Product List TenYTL GTL DII ADnD for Self
###Hide-And Validates that Self is displayed for TraditionalGroupTermLife, TenYTL, ADnD, DII
And Selects product TenYTL for Self
And Selects product TenYTL for Child
And Selects product Group Term for Self
And Selects product Group Term Life Insurance for Child
And Selects Product AccidentalDeath for Self
And Selects Product AccidentalDeath for Child
And Selects product DII for Self
And Clicks on next button

Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
#And Enters value"<MAmount>" for Self
And Enters Monthly Income for Self as "<MAmount>"
And Selects Answer as No for Applying any Other Insurance
And Clicks on next button

Then Request Coverage page is displayed to user
And Validates under Group Term Life the Benefit Slider Range as "<RangeMin>" to "<RangeMax>"
#And Selects Benefit Amount for Self as "<Benefit>" under GTL
#And Verify Benefit Amount for Child is "<CBenefit>" under GTL

And Select Benefit Amount for Self as "<Benefit>" under Group Term Product
And Validate Benefit Amount for Child as "<CBenefit>" under Group Term Life

And Validates under TenYTL the Benefit Slider Range as "<RangeMin1>" to "<RangeMax1>" for self
And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
#And Validate Benefit Amount for Child as "<CBenefit1>" under TenYTL
And Validates benefit amount for Child as "<CBenefit>" under TenYTL displayed in label

And Validates under ADDI the Benefit Slider Range as "<RangeMin2>" to "<RangeMax2>"
And Selects Benefit Amount for Self as "<Benefit2>" under ADDI
#And Verify Benefit Amount for Child is "<CBenefit2>" under ADnD
And Validates under ADDI the Benefit Amounts for Child Listed are: "<CBenefit2>"

And Validates under DisabilityIncomeInsurance the Benefit Slider Range as "<RangeMin3>" to "<RangeMax3>"
#And Selects Benefit Amount for Self as "<Benefit3>" under DII
#And Enters value"<WPeriod>","<BDuration>" for Self under DII

And NSPE_Selects Benefit Amount for Self as "<Benefit3>" under DII
    And Selects Waiting Period for Self under DII as "<WPeriod>"
    And Selects Benefit Duration for Self under DII as "<BDuration>"
And Clicks on next button

Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Self under TenYTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relationship>","<Perc>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TenYTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname1>","<Blname1>","<Relationship1>","<Perc1>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TenYTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname2>","<Blname2>","<Relationship2>","<Perc2>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TenYTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname3>","<Blname3>","<Relationship3>","<Perc3>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TenYTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname4>","<Blname4>","<Relationship4>","<Perc4>"
And Clicks on OK button
#And Verify Error Message is displayed for Maximum Primary beneficiaries
And Validate Maximum Beneficiaries Error message
And Clicks on Close button
#And Clicks on Edit Beneficiary Button for Self under TenYTL
#Then Add Beneficiary page will be displayed to user
#And User Enters Beneficiary details as "<Perc5>" for Individual Primary

Then Clicks on Edit button for first primary Beneficiary for Self for TenYTI
		And Enter new Beneficiary Percentage as "<Perc5>"
		And Clicks on OK button


And Clicks on Add Beneficiary Button for Self under TenYTL

Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
		And User Enters Beneficiary details as name and relationship"<Bfname6>","<Blname6>","<Relationship6>","<Perc6>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TenYTL
#Then Add Beneficiary page will be displayed to user and user will select Individual and Contingent Radio Buttons
#And User Enters Beneficiary details as "<Bfname7>","<Blname7>","<Relationship7>","<Perc7>"
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bfname7>","<Blname7>","<Relationship7>","<Perc7>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TenYTL
#Then Add Beneficiary page will be displayed to user and user will select Individual and Contingent Radio Buttons
#And User Enters Beneficiary details as "<Bfname8>","<Blname8>","<Relationship8>","<Perc8>"
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bfname8>","<Blname8>","<Relationship8>","<Perc8>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TenYTL
#Then Add Beneficiary page will be displayed to user and user will select Individual and Contingent Radio Buttons
#And User Enters Beneficiary details as "<Bfname9>","<Blname9>","<Relationship9>","<Perc9>"
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bfname9>","<Blname9>","<Relationship9>","<Perc9>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TenYTL
#Then Add Beneficiary page will be displayed to user and user will select Individual and Contingent Radio Buttons
#And User Enters Beneficiary details as "<Bfname10>","<Blname10>","<Relationship10>","<Perc10>"
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
		And User Enters Beneficiary details as name and relationship"<Bfname10>","<Blname10>","<Relationship10>","<Perc10>"
And Clicks on OK button
#And Verify Error Message is displayed for Maximum Contingent beneficiaries
And Validate Maximum Contingent Beneficiaries Error message
And Clicks on Close button
#And Clicks on Edit Beneficiary Button for Self under TenYTL
#Then Add Beneficiary page will be displayed to user
#And User Enters Beneficiary details as "<Perc11>" for Individual Contingent

Then Clicks on Edit button of "<Contingent_Sequence5>" Beneficiary for Self under TenYTI
		And Enter new Beneficiary Percentage as "<Perc11>"
And Clicks on OK button
And Clicks on next button

Then Contact Details page is displayed to user
    Then Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<Street>","<City>","<Zipcode>"
		And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page		
		And Selects No for Travel Question Non QD for Self
		And Selects Yes Radio button for Tobacco Question
    And Enters Last Used Tobacco Date Details for Self as "<TobDate>"
    And Clicks on Products used textbox for Self and Selects Product as "<Product>"
		And Selects Residential Radio Button
		And Selects Yes Radio Button for Business Address
		And Enters Business Address Details as "<BusinessName>","<BusinessType>"
And Clicks on next button
Then Application Summary Page is displayed to user
And Clicks on next button
Then Authorize page details are displayed to user and confirm the term and conditions for Self
		And Clicks on next button
		Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish

Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<Website>"


Examples:
|Website |Title |Fname|Lname |State  |State1  |State2  |DOB                 |DOB1                |Cfname |Clname |CDOB                 |WorkHr |WorkHr1 |MAmount |RangeMin |RangeMax |Benefit |CBenefit |RangeMin1 |RangeMax1 |Benefit1 |CBenefit1 |RangeMin2 |RangeMax2 |Benefit2 |CBenefit2|RangeMin3 |RangeMax3 |Benefit3|WPeriod |BDuration |Bfname |Blname |Relationship |Perc |Bfname1 |Blname1 |Relationship1 |Perc1 |Bfname2 |Blname2 |Relationship2 |Perc2 |Bfname3 |Blname3 |Relationship3 |Perc3 |Bfname4 |Blname4 |Relationship4 |Perc4 |Perc5 |Bfname6 |Blname6 |Relationship6 |Perc6  |Bfname7 |Blname7 |Relationship7 |Perc7 |Bfname8 |Blname8 |Relationship8 |Perc8 |Bfname9 |Blname9 |Relationship9 |Perc9 |Bfname10 |Blname10 |Relationship10 |Perc10 |Contingent_Sequence5|Perc11 |SSN       |Mstatus |Height |Weight |Gender_Self|Street        |City |Zipcode |PhoneType |PhoneNum   |BusinessName |BusinessType    |TobDate    |Product    |pdfEnable |
|NSPE    |Mr.   |Jim  |Gallo |Alaska |Florida |Delaware|SYSDate-18Y/00M/01D |SYSDate-17Y/11M/29D |Frank  |Gallo  |SYSDate-17Y/11M/29D  |29     |30      |$4,500  |$25,000  |$500,000 |$50,000 |$5,000   |$50,000   |$1,000,000|$50,000  |$5,000    |$50,000   |$250,000  |$50,000  |$5,000   |$200      |$3,000    |$500    |60 Days |5 Years   |George |Rose   |Other        |10   |Ron     |Weasley |Father        |10    |Jon     |Smith   |Spouse        |10    |John    |Potter  |Father        |10    |Larry   |Johnson |Mother        |10    |70    |Marry   |Jane    |Daughter      |10     |Kim     |Jane    |Daughter      |10    |Mark    |Jane    |Son           |10    |Jenny   |Keith   |Other         |10    |Jackob   |Khan     |Father         |10     |    5               |70     |145770528 |Married |5.6    |180    |Male       |12,Tamrind st |SF   |58474   |Home      |1211493079 |Howard INC   |Sole Proprietary|01/01/2010 |Cigarettes |0         |


@NSPERegression_6
Scenario Outline:<NSPESC06> Application Submission for Spouse and Child only with all eligible products where self is member of NSPE (Benefitiary more than 1 primary trust)

Given Test set up for "NYL" feature and "NYL_NSPE" scenario
    Given Customer navigate to NYL "<Website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user
And Click on Spouse
And Click on Child
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"

And Select YES Radio button of NSPE Membership for Self
And Enters Self WorkHr as "<WorkHr>"
#And Enters Spouse details for FEMALE Spouse as  "<Stitle>","<Sfname>","<Slname>","<SDOB>"
And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
And Select YES Radio button of NSPE Membership for Spouse
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Clicks on next button
Then Product page details are displayed to user
#And Verify Spouse icon is missing on Product page
###Hide-And Validates that Spouse is not displayed for TermLife,TenYTL,ADDI,DII
And Clicks on Back or Previous button
And Enters DOB for Spouse as "<SDOB1>"
And Clicks on next button
Then Product page details are displayed to user
#And Verify Available Product List TenYTL GTL ADnD for Spouse and Child
###Hide-And Validates that Spouse is displayed for TraditionalGroupTermLife, TenYTL, ADnD
###Hide-And Validates that Child is displayed for TraditionalGroupTermLife, TenYTL, ADnD
And Selects product TenYTL for Child
And Selects product Group Term Life Insurance for Child
And Selects Product AccidentalDeath for Child
And Selects product TenYTL for Spouse
And Selects product Group Term for Spouse
And Selects Product AccidentalDeath for Spouse
And Clicks on next button

#Then Dependent coverage note is displayed to user and selects OK button
Then Click YES for Dependent Coverage information

#Then Product: Additional Questions page details are displayed to user and selects Answer as NO for all questions for Spouse
And Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
And Clicks on next button

Then Request Coverage page is displayed to user
#And Selects Benefit Amount for Spouse as "<SBenefit>" under GTL
#And Verify Benefit Amount for Child is "<CBenefit>" under GTL
And Selects Benefit Amount for Spouse as "<SBenefit>" under Group Term Life
And Validate Benefit Amount for Child as "<CBenefit>" under Group Term Life

And Selects Benefit Amount for Spouse as "<SBenefit1>" under TenYTL
#And Verify Benefit Amount for Child is <CBenefit1> under TenYTL
And Validates benefit amount for Child as "<CBenefit1>" under TenYTL displayed in label
#And Verify Benefit Amount for Spouse is <SBenefit2> under ADnD
#And Verify Benefit Amount for Child is <CBenefit2> under ADnD
And Validates Benefit Amount for Spouse as "<SBenefit2>" under ADDI
And Validates under ADDI the Benefit Amounts for Child Listed are: "<CBenefit2>"
And Clicks on next button

Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Spouse under TenYTL
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And User Enters Beneficiary details as "<STrust>","<SDatetrust>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under TenYTL
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And User Enters Beneficiary details as "<STrust1>","<SDatetrust1>"
And Clicks on OK button
And Validates error message on Add Beneficiary page-Only one Trust is allowed as Primary
And Clicks on Close button
And Clicks on next button

Then Contact Details page is displayed to user
#And Selects Send Correspondence to question as Residential for Self
#And Enters contact Details for Male Self as "<SSN>", "<Mstatus>","<Street>","<City>","<Zipcode>","<PhoneType>","<PhoneNum>"
Then Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<Self_Gender>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Selects Residential Radio Button
#And selects reside outside the U.S. or Canada question as YES for Spouse
#And Enters contact Details for Female Spouse as "<SSSN>","<SHeight>","<SWeight>", "<SPhoneType>","<SPhoneNum>"
#And Validate SSN is mandatory for Spouse
#And selects reside outside the U.S. or Canada question as NO for Spouse
#And Validate Tobacco Question by  Selecting Answer YES for Spouse
#And Enters Details as "<STobDate>"
#And Clicks on Products used textbox and Selects Product as "<SProduct>"

And Enters contact Details for Spouse as "<SSSN_Blank>","<SHeight>","<SWeight>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>"
		And Selects No for Travel Question-TwelveMonths for Spouse
		And Selects Yes Radio button for Tobacco Question for Spouse
    And Enters Last Used Tobacco Date Details for Spouse as "<STobDate>"
    And Clicks on Products used textbox for Spouse and Selects Product as "<SProduct>"
And Clicks on next button
Then Validates SSN Required Error Message for Spouse
Then Enters SSN as "<SSSN>" for Spouse
And Clicks on next button
Then Application Summary Page is displayed to user
And Clicks on next button
#Then Authorization page details are displayed to user
#And Validates Consent message in Read and Sign Box
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
|Website |Title|Fname  |Lname   |State       |DOB                 |Csex|State1 |State2 |Stitle |Sfname   |Slname  |SDOB               |SDOB1               |Cfname |Clname |CDOB                |WorkHr |SBenefit|CBenefit|SBenefit1 |CBenefit1 |SBenefit2 |CBenefit2 |STrust      |SDatetrust  |STrust1  |SDatetrust1 |SSN         |Mstatus |Street   |Self_Gender|City |Zipcode |PhoneType |PhoneNum   |SSSN_Blank|SSSN      |SHeight |SWeight |Gender_Spouse|SPhoneType |SPhoneNum  |STobDate   |SProduct|pdfEnable |
|NSPE    |Dr.  |Carlos |Aniston |Connecticut |SYSDate-18Y/00M/00D |Male|Guam   |Maine  |Dr.    |Jennifer |Aniston |SYSDate-16Y/11M/29D|SYSDate-18Y/00M/00D |Jenny  |Aniston|SYSDate-17Y/11M/29D |45     |$75,000 |$5,000  |$75,000   |$5,000    |$100,000  |$5,000    |Dylan Trust |01/01/1970  |GNR CORP |01/01/1986  |308-65-3075 |Married |16,PPT st|   Male    |MJ   |78039   |Mobile    |3081207806 |          |368705970 |5.6     |180     |  Female     |Home       |2684587878 |06/12/2014 |Pipe    |0         |


@NSPERegression_7
Scenario Outline:<NSPESC07> Validation Read & Sign Page with 18 different States one by one in loop (All Validations done on Authorization and Consent Page) (No beneficiary)

Given Test set up for "NYL" feature and "NYL_NSPE" scenario
    Given Customer navigate to NYL "<Website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user
And Click on Self

And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Select YES Radio button of NSPE Membership for Self
And Enters Self WorkHr as "<WorkHr>"
And Clicks on next button

Then Product page details are displayed to user
And Verify Available Product: TenYTL
And Selects product TenYTL for Self
And Clicks on next button

Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
And Clicks on next button

Then Request Coverage page is displayed to user
And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
And Clicks on next button

Then Beneficiary Page is displayed to user
And Clicks on Skip Beneficiary Button

Then Contact Details page is displayed to user
#And Selects reside outside the U.S. or Canada question as NO for Self
#And Selects Send Correspondence to question as Business Address for Self
#And Selects Business Address question as Yes for Self
#And Enters contact Details for Male Self as "<SSN>", "<Mstatus>","<Height>","<Weight>", "<Street>","<City>","<Zipcode>","<PhoneType>","<PhoneNum>
#And Validate Tobacco Question by  Selecting Answer YES for Self
#And Enters Details as "<TobDate>"
#And Clicks on Products used textbox and Selects Product as "<Product>"
#And Enters Business Address Details as "<BusinessName>","<BusinessType>"

Then Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<Street>","<City>","<Zipcode>"
		And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page		
		And Selects No for Travel Question Non QD for Self
		And Selects Yes Radio button for Tobacco Question
    And Enters Last Used Tobacco Date Details for Self as "<TobDate>"
    And Clicks on Products used textbox for Self and Selects Product as "<Product>"
		And Selects Business Address Radio Button for Send Correspondence To
		And Selects Yes Radio Button for Business Address
		And Enters Business Address Details as "<BusinessName>","<BusinessType>"

And Clicks on next button

Then Application Summary Page is displayed to user
#And validates details on Application Summary Page
And Clicks on next button

Then Authorize page details are displayed to user
    Then Validates I Understand verbiage one in Read and Sign Box
    And Validate Authorization message in Read and Sign Box
    And Validate Consent message in Read and Sign Box
And Validate Fraud Notice CT in Read and Sign Box
    #Note: After Read & Sign and Electronic Consent, a third box is generated only for CT
    And Validates additional Notes for Connecticut state
And Navigate back to Eligibility page
And Enter New State as "<State1>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate Fraud Notice CO in Read and Sign Box
And Validate Fraud Notice CO in Read and Sign Box
And Navigate back to Eligibility page
And Enter New State as "<State2>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate Fraud Notice CA in Read and Sign Box
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
And Validate Fraud Notice AR in Read and Sign Box
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
And Clicks on next button
And Validate Fraud Notice KS in Read and Sign Box
And Navigate back to Eligibility page
And Enter New State as "<State10>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate Fraud Notice NJ in Read and Sign Box
And Navigate back to Eligibility page
And Enter New State as "<State11>"
And Clicks on next button
And Clicks on next button
And Confirms Imp Replacement Info for NewYork state
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate Fraud Notice NY in Read and Sign Box
And Navigate back to Eligibility page
And Enter New State as "<State12>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate Fraud Notice OK in Read and Sign Box
And Navigate back to Eligibility page
And Enter New State as "<State13>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate Fraud Notice PR in Read and Sign Box
And Navigate back to Eligibility page
And Enter New State as "<State14>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate Fraud Notice TN in Read and Sign Box
And Navigate back to Eligibility page
And Enter New State as "<State15>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate Fraud Notice VA in Read and Sign Box

##Hide-And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario>","<pdfEnable>","<pdfName>"
And Navigate back to Eligibility page
And Enter New State as "<State16>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button

And Validate Fraud Notice NM in Read and Sign Box

##Hide-And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario>","<pdfEnable>","<pdfName>"

And Navigate back to Eligibility page
And Enter New State as "<State17>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
#And Validates Authorization Message MN in Read and Sign Box
And Validate Consent message in Read and Sign Box
And Validate Fraud Notice NM in Read and Sign Box
And Navigate back to Eligibility page
And Enter New State as "<State18>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
#And Validates Authorization Message MN in Read and Sign Box
And Validate Fraud Notice MN in Read and Sign Box
And Navigate back to Eligibility page
And Enter New State as "<State19>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
#And Validates Authorization Message MN in Read and Sign Box
And Validate Fraud Notice MN in Read and Sign Box

Examples:
|Website |Title   |Fname  |Lname  |State     |DOB       |WorkHr  |Benefit1  |SSN   |Mstatus |Height |Weight  |Gender_Self|Street   |City |Zipcode |PhoneType |PhoneNum   |TobDate  |Product  |BusinessName |BusinessType  |State1  |State2   |State3  |State4  |State5   |State6   |State7  |State8     |State9  |State10 |State11 |State12 |State13  |State14 |State15 |State16 |State17 |State18|State19|
|NSPE |Mr.  |Peter  |Downey |Connecticut  |SYSDate-64Y/11M/29D |45    |$250,000  |115456445 |Married |5.5 |200  |Male  |12,Lemon rd |SAND |12579  |Home  |4541148484  |06/12/2014  |Pipe    |Howard INC  |Sole Proprietary   |Colorado |California  |Alabama |Arkansas |Pennsylvania |Rhode Island |Maryland |District of Columbia |Kansas  |New Jersey |New York |Oklahoma |Puerto Rico |Tennessee |Virginia |New Mexico |Minnesota | Maine | Wyoming|
