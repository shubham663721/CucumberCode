Feature: AAFP Test

  @AAFPRegression_1
  Scenario Outline: <AAFPSC01> Application submission for Self, Spouse and Child and with all the products and rider(s) (JET) Beneficiaries- Maximum
    Given Test set up for "NYL" feature and "NYL_AAFP" scenario
    Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
    Then Eligibility page details are displayed to user
    Then Click on Self
    Then Click on Spouse
    Then Click on Child
    Then Select YES Radio button of Membership
    And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
    And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
    And Select radio button Yes for Spouse is Member
    And Click on Add Child button
    Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
    And Selects Married question as No for Child
    And Click on Add Child button on Screen
    And Clicks on next button
    And Verify that error message is displayed for state eligibility at top of the page
    And Enter New State as "<State1>"
    And Clicks on next button
    Then Verify that Product page are displayed to user
    And Clicks on Back or Previous button
    And Enters DOB for Self as "<DOB1>"
    And Enters DOB for Spouse as "<SDOB1>"
    And Clicks on next button
    Then Verify that Product page are displayed to user
    Then Validates that Self is not displayed for TermLife,TenYTL,TwentyYTL
    Then Validates that Spouse is not displayed for TermLife,TenYTL,TwentyYTL
    And Clicks on Back or Previous button
    And Enters DOB for Self as "<DOB>"
    And Enters DOB for Spouse as "<SDOB>"
    And Clicks on next button
    Then Verify that Product page are displayed to user
    And Selects product TermLife for Self
    And Selects product TermLife for Spouse
    And Selects product TermLife for Child
    And Selects product TenYTL for Self
    And Selects product TenYTL for Spouse
    And Verify Child icon is disabled for TenYTL
    And Selects product TwentyYTL for Self
    And Selects product TwentyYTL for Spouse
    And Verify Child icon is disabled for TwentyYTL
    And Selects product DII for Self
    And Selects product PO for Self  
    And Clicks on next button
    Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
    Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
    And Selects Answer as YES for Additional Questions of Group Disability Insurance for Self
    And Enter Hazardous duty explanation as "<Explanation>"
    And Enters details for Monthly Expense and Percentage Responsible as "<Mexpense>","<Percresp>"
    And Selects Yes for applying for any other business/office overhead insurance
    And Clicks on Add Company button for overhead products
    And Enters details for Company "<Company>","<BenAmt>","<BenPeriod>" and click on add button
    And Selects Yes for replace any other company's coverage for Self for overhead disability
    And Enters Amount under replace any other company's coverage of overhead product as "<RepAmount>"
    And Clicks on next button
    Then Request Coverage page is displayed to user
    Then Selects Benefit Amount for Self as "<Benefit>" under TermLife
    And Validates under TermLife the Benefit Slider Range for Self as "<Min>" to "<Max>"
    And Selects Optional AD&D Rider under TermLife
    And Selects Rider Benefit Amount under TermLife for Self as "<RidBenefit>"
    And Validates under TermLife the AD&D Rider Benefit Slider Range for Self as "<Min_Rider>" to "<Max_Rider>"
    And Selects Waiver of Premium Rider under TermLife for Self
    And Selects Benefit Amount for Spouse as "<Sbenefit>" under TermLife
    And Validates under TermLife the Benefit Slider Range for Spouse as "<Min>" to "<Max>"
    And Selects Benefit Amount for Child as "<Cbenefit>" under TermLife
    And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
    And Validates under TenYTL the Benefit Slider Range as "<Min>" to "<Max>" for self
    And Selects Benefit Amount for Spouse as "<Sbenefit1>" under TenYTL
    And Validates under TenYTL the Benefit Slider Range as "<Min>" to "<Max>" for Spouse
    And Selects Benefit Amount for Self as "<Benefit2>" under TwentyYTL
    And Validates under TwentyYTL the Benefit Slider Range as "<Min>" to "<Max>"
    And Selects Benefit Amount for Spouse as "<Sbenefit2>" under TwentyYTL
    And Validates under TwentyYTL for Spouse the Benefit Slider Range as "<Min>" to "<Max>"
    And AAFP_Selects Monthly Benefit Amount for Self as "<Benefit3>" under DII     
    And Validates under Disability Insurance the Benefit Option Listed are: "<BenOpt_DII1>","<BenOpt_DII2>","<BenOpt_DII3>","<BenOpt_DII4>"  
    And Selects Inflation Protection Option Rider under DII
    And Selects Benefit Amount for Self as "<Benefit4>" under PO
    And Selects Wait Period for Self as "<WaitPeriod1>" under PO
    And Validates under PO the Benefit Slider Range for Self as "<Min_PO>" to "<Max_PO>"
    And Clicks on next button
    Then Beneficiary Page is displayed to user
    ###Note- currently added Beneficiary for term life
    And Clicks on Add Beneficiary Button for Spouse under TermLife
    Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
    And User Enters Beneficiary details as "<Trust>","<Datetrust>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Spouse under TermLife
    Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
    And User Enters Beneficiary details as "<Trust1>","<Datetrust>"
    And Clicks on OK button
    And Delete Contigent Beneficiary
    And Delete box is displayed and clicks on Yes
    And Clicks on Add Beneficiary Button for Spouse under TermLife
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Spouse under TermLife
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship"<Bname1>","<Blname1>","<Relationship1>","<Perc1>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Spouse under TermLife
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship"<Bname2>","<Blname2>","<Relationship2>","<Perc2>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Spouse under TermLife
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship"<Bname3>","<Blname3>","<Relationship3>","<Perc3>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Self under TenYTL
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bname4>","<Blname4>","<Relationship4>","<Perc4>"    
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
    And User Enters Beneficiary details as "<Trust1>","<Datetrust>"
    And Clicks on OK button
    And Clicks on next button
    
    Then Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<StreetAddress>","<City>","<Zip>"
    And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
    And Select DrivingLicense Question as Yes and Enters details for driving info for Self as "<DrivingLicenseNo>","<DrivingLicenseState>"
    And Selects Yes for Travel Question-TwelveMonths and Enters details for Self as "<Country>", "<Months>"
    And Enters Membership ID as "<MemberId>" for Self
    And Selects Yes for Travel Question QD for Self 
		And Enters details for Travel Question QD for Self as "<Country>"    
    And Selects Yes Radio button for Tobacco Question
    And Enters Last Used Tobacco Date Details for Self as "<TobDate>"
    And Clicks on Products used textbox for Self and Selects Product as "<Product>"
    And Selects Residential Radio Button
    And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
    And Selects Yes Radio Button for Business Address
    And Enters Business Address Details as "<BusinessName>","<BusinessType>"
    And Enters contact Details for Spouse with SSN and MembershipID as "<SSSN>","<SHeight>","<SWeight>","<Gender_Spouse>","<SMemId>","<PrimaryPhType>","<PrimaryPhNo>"
    And Enters WeightTwelveMonths ago details for Spouse as "<S12mnthsWeight>"
    And Select DrivingLicense Question as Yes and Enters details for Spouse as "<SDrivingLicenseNo>","<SDrivingLicenseState>"
    And Selects Yes for Travel Question Non QD for Spouse
	  And Enter datails for Outside US country and How Long months for Spouse as "<SCountry>","<SMonths>"
		And Selects Yes for Travel Question QD for Spouse
		And Enters details for Travel Question QD for spouse as "<SCountry>"
		And Selects Yes Radio button for Tobacco Question for Spouse
		And Enters Last Used Tobacco Date Details for Spouse as "<STobDate>"
		And Clicks on Products used textbox for Spouse and Selects Product as "<SProduct>"
    And Clicks on next button
    Then Application Summary Page is displayed to user
    And Verify Benefit Amount for Self as "<Benefit>" under TermLife  
    And Verify Benefit Amount for Self as "<RidBenefit>" under AD&D under TermLife
    #And Validates Quick Decision under TermLife    
    And Verify Waiver of Premium Rider for Self as YES
    And Verify Benefit Amount for Self as "<Benefit1>" under TenYTL
    And Verify Benefit Amount for Self as "<Benefit2>" under TwentyYTL
    And Verify Benefit Amount for Self as "<Benefit3_DII>" under DII
    And Verify Inflation Protection Option Rider for Self as YES
    And Verify Benefit Amount for Self as "<Benefit4>" under PO
    And Verify Benefit Amount for Spouse as "<Sbenefit>" under TermLife
    And Verify Benefit Amount for Spouse as "<Sbenefit1>" under TenYTL
    And Verify Benefit Amount for Spouse as "<Sbenefit2>" under TwentyYTL
    And Verify Benefit Amount for Child as "<Cbenefit>" under TermLife
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
    And Clicks on next button
    Then Almost done page is displayed to user
    And Clicks on next button   
    Then Your Insurance Request Decision Page is displayed to user
    And Clicks on next button
    Then Thank you page is displayed to user  
    And Verify that two confirmation number is generated for "<Website>" 
    And Verify that Confirmation number is generated for "<Website>"

    Examples: 
|Website |Title |Fname   |Lname            |State    |DOB        |WorkHr |Stitle |Sfname |Slname          |SDOB       |Cfname |Clname |CDOB      |Csex |State1      |DOB1                |SDOB1              |Explanation             |Mexpense |Percresp |Company  |BenAmt|BenPeriod |RepAmount|Benefit |RidBenefit|Sbenefit |Cbenefit |Benefit1 |Sbenefit1 |Benefit2 |Sbenefit2 |Benefit3                          |Benefit4|WaitPeriod1|Trust   |Datetrust  |Trust1 |Bname|Blname|Relationship|Perc|Bname1  |Blname1|Relationship1 |Perc1|Desc  |Bname2|Blname2|Relationship2 |Perc2 |Bname3 |Blname3 |Relationship3 |Perc3 |Bname4 |Blname4 |Relationship4 |Perc4 |BeneType|Perc5 |Perc6 |Perc7 |Country |Months |SSN       |Mstatus |Height |Weight |Gender_Self |Weight12mnths |MemberId |StreetAddress  |City     |Zip  |DrivingLicenseNo|DrivingLicenseState  |PrimaryPhType |PrimaryPhNo |BusinessName |BusinessType     |SSSN      |SHeight |SWeight |Gender_Spouse |S12mnthsWeight |SPhoneType |SPhoneNum |SDrivingLicenseNo |SDrivingLicenseState |Password |Vpassword|SMemId   |Min   |Max    |Min_Rider |Max_Rider |BenOpt_DII1    |BenOpt_DII2              |BenOpt_DII3                       |BenOpt_DII4                                 |Min_PO|Max_PO|TobDate            |Product   |SCountry|SMonths |STobDate            |SProduct    |Benefit3_DII|
|aafpins |Mr.   |Thierry |Snmmmmtestcasecl |Manitoba |01-17-1965 |40     |Mrs.   |Thalia |Snmmmmtestcasegt|05/20/1978 |John   |Gill   |07/03/2002|Male |Rhode Island|SYSDATE-16Y/11M/30D |SYSDATE-16Y/11M/30D|experimental stress duty|5000     |100      |Amity Co |25000 |6         |20000    |$300,000|$140,000  |$250,000 |$10,000  |$400,000 |$200,000  |$220,000 |$150,000  |$2,000 - Active - Grade 04 & Above|$5,000  |30 Days    |kennedy |05/02/2012 |arthur |John |Adams |Son         |50  |Samantha|Jonas  |Other         |20   |Friend|Jack  |Jones  |Son           |20    |Jake   |Charls  |Father        |10    |Carter |Jonas   |Son           |50    |Primary |20    |20    |10    |India   |6      |990067673 |Married |6.0    |220    |Male        |200           |987698   |1392 Main Rd #3|Tiverton |02878|2043310         |District of Columbia |Mobile        |5343545430  |Arthur Corp  |Sole Proprietary |990067501 |5.0     |180     |Female        |200            |Home       |5454856876|D05186280         |Arizona              |Adam@123 |Adam@123 |987987674|100000|2000000|100000    |500000    |$500 - Resident|$1500 - Active - Grade 03|$2000 - Active - Grade 04 & Above |$2500 - Active - Grade 04 & Above with MORB |100   |5000  |SYSDATE-00Y/08M/00D|Cigarettes|Belgium |12      |SYSDATE-00Y/02M/00D |Nicotine Gum|$2,000      |



  @AAFPRegression_2
  Scenario Outline: <AAFPSC02> Application submission for Self, Spouse with TenYTL
    Given Test set up for "NYL" feature and "NYL_AAFP" scenario
    Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
    Then Eligibility page details are displayed to user
    Then Click on Self
    Then Click on Spouse
    And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
    Then Select NO for Association Membership
    And Validate that NEXT button is Disabled
    Then Select YES Radio button of Membership
    And Validate that NEXT button is Enabled
    And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
    And Select radio button NO for Spouse is Member
    And Clicks on next button
    And Validate Age Restriction Message
    And Enters DOB for Self as "<DOB1>"
    And Clicks on next button
    Then Verify that Product page are displayed to user
    Then Validates that Spouse is not displayed for TenYTL
    And Verify Self is displayed for TenYTL,ADDI on product page 
		And Validate DII product is displayed 
    And Clicks on Back or Previous button
    And Enters DOB for Spouse as "<SDOB1>"
    And Enters DOB for Self as "<DOB1>"
    And Clicks on next button
    Then Verify that Product page are displayed to user
    And Selects product TenYTL for Self
    And Selects product TenYTL for Spouse
    And Selects product DII for Self
    And Clicks on next button
    Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
     And Selects Answer as No for Uniformed Service for Self of Group Disability Insurance
    And Selects Answer as No for Resident Member question for Self of Group Disability Insurance
    Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
   
   And Selects Answer as No for Applying any Other Insurance
    And Selects YES for Question-Are you a resident member
    And Enters Monthly Income for Self as "<MonthlyIncome>"
    And Clicks on next button
    And Selects Benefit Amount for Self as "<Benefit>" under TenYTL
    And Selects Benefit Amount for Spouse as "<Sbenefit>" under TenYTL 
    ## Note: benefit amount field is not available for this scenario
    And AAFP_Selects Monthly Benefit Amount for Self as "<Benefit1>" under DII
    And Selects Waiting Period for Self as "<WaitPeriod>" under DII
    And Validates under DII the Benefit Slider Range for Self as "<Min_DII>" to "<Max_DII>"
    And Clicks on next button
    And Verify Error Message in Spouse section for TenYTL
    And Selects Benefit Amount for Spouse as "<Sbenefit1>" under TenYTL
    And Clicks on next button
    Then Beneficiary Page is displayed to user
    And Clicks on Add Beneficiary Button for Self under TenYTL
    Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
    And User Enters Beneficiary details as "<Trust>","<DateTrust>"
    And Clicks on OK button
    And Verify that the Percent Displayed for Trust is "<TrustPercent>"
    And Clicks on Add Beneficiary Button for Spouse under TenYTL
    Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
    And Selects the First Option from Existing Beneficiaries List and select Type as "<BeneType>"
    And Clicks on OK button
    And Verify that the Trust Percentage Displayed for Spouse is "<TrustPercent>"
    And Clicks on next button
    Then Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"
    And Selects No for Travel Question Non QD for Self	
    And Selects Yes Radio button for Tobacco Question
    And Enters Last Used Tobacco Date Details for Self as "<TobDate>"
    And Clicks on Products used textbox for Self and Selects Product as "<Product>"
    And Enters Membership ID as "<MemId>" for Self
    And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
    And Selects Residential Radio Button
    And Selects Yes Radio Button for Business Address
    And Enters Business Address Details as "<BusinessName>","<BusinessType>"   
    And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>"
    And Selects No for Travel Question-TwelveMonths for Spouse
    And Selects Yes Radio button for Tobacco Question for Spouse
    And Validates Last Used Date Textbox and Specify the products used Textbox is displayed for Spouse
    And Enters Last Used Tobacco Date Details for Spouse as "<STobDate>"
    And Clicks on Products used textbox for Spouse and Selects Product as "<SProduct>"
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
      #| Website | Title | Fname | Lname | State    | DOB        | WorkHr | Stitle | Sfname | Slname | SDOB       | DOB1       | SDOB1      | MonthlyIncome | Min      | Max        | Benefit | Sbenefit | Benefit1 | Sbenefit1 | WaitPeriod | Min_DII | Max_DII | Trust   | DateTrust  | TrustPercent | BeneType | SSN       | Mstatus | Height | Weight | Sex  | MemId           | Street  | City       | Zipcode | PhoneType | PhoneNum   | TobDate    | Product | SSSN      | SHeight | SWeight | SSex   | SPhoneType | SPhoneNum  | STobDate   | SProduct         |BusinessName | BusinessType |
      #| aafpins | Mr.   | Adam  | Gill  | Arkansas | 09/04/1948 |     40 | Mrs.   | Bella  | Gill   | 05/20/2016 | 07/03/1973 | 05/20/1975 |          7500 | $100,000 | $2,000,000 | 1000000 |  1200000 |     1000 |    500000 | 90 Days    |     100 | $4,500  | kennedy | 05/02/2012 | 100 %        | Primary  | 990067673 | Married |    6.0 |    220 | Male | 547654654654654 | main st | providence |   10110 | Mobile    | 9900675011 | 08/02/2015 | Cigar   | 534354543 |     5.0 |     180 | Female | Home       | 5454856876 | 09/04/2016 | Nicotine Inhaler |Johnson      | Partnership  |
|Website |Title|Fname|Lname|State   |DOB               |WorkHr|Stitle|Sfname|Slname|SDOB                |DOB1                |SDOB1               |DOB2                |MonthlyIncome |Benefit |Sbenefit|Benefit1 |WaitPeriod |Sbenefit1|Trust   |DateTrust         |TrustPercent |BeneType|SSN       |Mstatus |Height |Weight |Sex  |MemId    |Street                         |City        |Zipcode |PrimaryPhType |PrimaryPhNo   |TobDate             |Product |SSSN      |SHeight |SWeight |Gender_Spouse|SPhoneType |SPhoneNum  |STobDate            |SProduct          |Min_DII |Max_DII |BusinessName      |BusinessType    |
|aafpins |Mr.  |Adam |Gill |Arkansas|SYSDATE-70Y/0M/0D |40    |Mrs.  |Bella |Gill  |SYSDATE-16Y/11M/30D |SYSDATE-59Y/11M/30D |SYSDATE-17Y/00M/00D |SYSDATE-69Y/11M/30D |7500          |1000000 |1200000 |1000     |90 Days    |500000   |kennedy |SYSDATE-9Y/11M/5D |100 %        |Primary |990067673 |Married |6.0    |220    |Male |14785968 |1501 N University Ave #STE 420 |Little Rock |72207   |Mobile        |  7564839274  |SYSDATE-02Y/00M/00D |Cigar   |534354543 |5.0     |180     |Female       |Home       |5454856876 |SYSDATE-02Y/00M/00D |Nicotine Inhaler  |100     |4500    |Wayne Enterprises |Sole Proprietary|



  @AAFPRegression_3
  Scenario Outline: <AAFPSC03> Application submission for Self, Spouse with TenYTL
    Given Test set up for "NYL" feature and "NYL_AAFP" scenario
    Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
    Then Eligibility page details are displayed to user
    Then Click on Self
    Then Click on Child
    Then Select YES Radio button of Membership
    And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
    And Click on Add Child button
    Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
    And Selects Married question as No for Child
    And Click on Add Child button on Screen
    And Clicks on next button
    Then Verify that Product page are displayed to user
    Then Validates that Child is not displayed for TermLife,TenYTL,TwentyYTL
    And Clicks on Back or Previous button
    And Clicks Edit button for Child Added
    And Enters DOB for Child as "<CDOB1>"
    And Click on Add Child button on Screen
    And Clicks on next button
    Then Verify that Product page are displayed to user
    And Clicks on next button
    And Verify Error Message for ATLEAST ONE PRODUCT is displayed on Product page
    And Selects product TwentyYTL for Self
    And Selects product TwentyYTL for Child
    And Selects product DII for Self
    And Clicks on next button
    Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
    And Selects Answer as YES for Additional Questions of Group Disability Insurance for Self
    And Enter Hazardous duty explanation as "<Explanation>"
    And Clicks on next button
    And Selects Benefit Amount for Self as "<Benefit>" under TwentyYTL
    And Selects Benefit Amount for Child as "<Cbenefit>" under TwentyYTL
    And AAFP_Selects Monthly Benefit Amount for Self as "<Benefit1>" under DII
    And Clicks on next button
    Then Beneficiary Page is displayed to user
    And Clicks on Add Beneficiary button for Self
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
    And Clicks on OK button
    And Clicks on Add Beneficiary button for Self
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bname1>","<Blname1>","<Relationship1>","<Perc1>"
    And Clicks on OK button
    And Clicks on Add Beneficiary button for Self
    Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
    And User Enters Beneficiary details as "<Trust>","<DateTrust>"
    And Clicks on OK button
    And Clicks on next button
    Then Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"
   	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
    And Selects No for Travel Question Non QD for Self
    And Selects No Radio button for Tobacco Question Self
    And Enters Membership ID as "<MemId>" for Self
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
     # | Website | Title | Fname | Lname | State   | DOB        | WorkHr | Cfname | Clname | CDOB       | CSex | CDOB1      | Explanation        | Benefit | Min      | Max        | Cbenefit | Benefit1        | Bname | Blname | Relationship | Perc | Bname1   | Blname1 | Relationship1 | Perc1 | Desc   | Trust   | DateTrust  | SSN       | Mstatus | Height | Weight | Sex  | MemId           | Street  | City       | Zipcode | PhoneType | PhoneNum   |BussinessName|BusinessType|
     # | aafpins | Mr.   | Adam  | Gill  | Georgia | 10/10/1969 |     40 | John   | Gill   | 07/03/1969 | Male | 07/01/2012 | handle toxic fuels |  750000 | $100,000 | $2,000,000 |    10000 | $500 - Resident | John  | Adams  | Son          |   50 | Samantha | Jonas   | Other         |    50 | Friend | kennedy | 05/02/2012 | 990067673 | Single  |    6.0 |    220 | Male | 547654654654654 | main st | providence |   10110 | Mobile    | 5343545431 |ABC Corp     |Corporation |
|Website |Title|Fname   |Lname  |State   |DOB                 |WorkHr|Cfname |Clname |CDOB                |CSex |CDOB1               |Explanation        |Benefit |Cbenefit |Benefit1         |Bname |Blname|Relationship |Perc |Bname1   |Blname1 |Relationship1 |Perc1 |Desc   |Trust   |DateTrust           |SSN       |Mstatus |Height |Weight |Sex  |MemId      |Street           |City    |Zipcode |PrimaryPhType |PrimaryPhNo |BusinessName      |BusinessType    |
|aafpins |Mr.  |Sheldon |Cooper |Georgia |SYSDATE-49Y/00M/00D |40    |Mark   |Cooper |SYSDATE-25Y/00M/00D |Male |SYSDATE-24Y/11M/30D |handle toxic fuels |750000  |10000    |$500 - Resident  |John  |Adams |Son          |50   |Samantha |Jonas   |Other         |50    |Friend |kennedy |SYSDATE-60Y/05M/11D |990067673 |Single  |6.0    |220    |Male |3698749868 |9235 Bluejack Ln |Roswell |30076   |Mobile        |5343545438  |Wayne Enterprises |Sole Proprietary|

  @AAFPRegression_4
  Scenario Outline: <AAFPSC04> Application submission for Spouse only with TwentyYTL
    Given Test set up for "NYL" feature and "NYL_AAFP" scenario
    Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
    Then Eligibility page details are displayed to user
    Then Click on Spouse
    Then Select YES Radio button of Membership
    And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
    And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
    And Clicks on next button
    And Verify Spouse Membership mandatory validation message on Eligibility page
    #Spouse Membership Mandatory
    And Select radio button Yes for Spouse is Member   
    And Clicks on next button
    Then Verify that Product page are displayed to user
    Then Validates that Spouse is not displayed for TwentyYTL
    And Clicks on Back or Previous button
    And Enters DOB for Spouse as "<SDOB1>"
    And Clicks on next button
    Then Verify that Product page are displayed to user
    And Selects product TwentyYTL for Spouse
    And Clicks on next button
    And Click YES for Dependent Coverage information
    Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Spouse
    And Enter additional details as "<STotalAmt>","<SIAmount>","<SCompany>" for Spouse
    And Clicks on next button
    And Selects Benefit Amount for Spouse as "<Sbenefit>" under TwentyYTL
    And Validates under TwentyYTL for Spouse the Benefit Slider Range as "<Min>" to "<Max>"
    And Clicks on next button
    Then Beneficiary Page is displayed to user
    Then Clicks on Add Beneficiary Button for Spouse under TwentyYTL
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
    And Clicks on OK button
    Then Clicks on Add Beneficiary Button for Spouse under TwentyYTL
    Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
    And User Enters Beneficiary details as "<Trust>","<DateTrust>"
    And Clicks on OK button
    And Clicks on next button
    Then Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN_Self>","<Mstatus>","<Gender_Self>","<StreetAddress>","<City>","<Zipcode>"

    And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
    And Selects Residential Radio Button
    And Enters contact Details for Spouse with SSN and MembershipID as "<SSSN>","<SHeight>","<SWeight>","<SSex>","<SMembershipID>","<SPhoneType>","<SPhoneNum>"
    And Selects No for Travel Question-TwelveMonths for Spouse
    And Selects No Radio button for Tobacco Question Spouse
    And Clicks on next button
    And Validates Membership ID Required Message
    And Enters Membership ID as "<MembershipID>" for Self
    And Clicks on next button
    Then Application Summary Page is displayed to user
    And Clicks on next button
    Then Authorize page details are displayed to user and confirm the term and conditions for Self
    #And Confirms the terms for Spouse
    And Clicks on next button
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Thank you page is displayed to user
    And Verify that Confirmation number is generated for "<Website>"


    Examples: 
      #| Website | Title | Fname | Lname | State                | DOB        | WorkHr | Stitle | Sfname | Slname | SDOB     | SDOB1    | SBenefit | Min      | Max        | Bname | Blname | Relationship | Perc | Trust  | DateTrust | SSN       | Mstatus | Sex  | MembershipID_Blank | Street  | City       | Zipcode | PhoneType | PhoneNum   | MembershipID | SSSN      | SHeight | SWeight | SSex   | SPhoneType | SPhoneNum  | SMembershipID |
      #| aafpins | Mr.   | Adam  | Gill  | District of Columbia | 01-17-1948 |     40 | Mrs.   | Bella  | Gill   | 05201959 | 05201969 |   600000 | $100,000 | $2,000,000 | Adam  | Gill   | Spouse       | 1000 | Arthur |  05022012 | 990067673 | Married | Male |                    | main st | providence |   10110 | Mobile    | 5343545432 |     46554545 | 990067501 |     5.0 |     180 | Female | Home       | 5454856876 |      46554545 |


|Website |Title|Fname   |Lname     |State                |DOB                 |WorkHr  |Stitle |Sfname |Slname    |SDOB                |SDOB1               |STotalAmt |SIAmount |SCompany    |Sbenefit |Bname   |Blname    |Relationship |Perc |Trust  |DateTrust           |SSN_Self  |Mstatus |Gender_Self |MembershipID  |StreetAddress |City       |Zipcode |PrimaryPhType |PrimaryPhNo |SSSN      |SHeight |SWeight |SSex   |SPhoneType |SPhoneNum  |MembershipID_Blank|SMembershipID|
|aafpins |Mr.  |Leonard |Hofstater |District of Columbia |SYSDATE-32Y/00M/00D |40      |Mrs.   |Penny  |Hofstater |SYSDATE-55Y/00M/00D |SYSDATE-54Y/11M/30D |25000     |25000    |Mc Conolley |2000000  |Leonard |Hofstater |Spouse       |1000 |Arthur |SYSDATE-02Y/02M/02D |990067673 |Married |Male        |748596 |27 53rd Pl SE |Washington |20002   |Mobile        |5343545430  |990067501 |5.0      |180    |Female |Home       |5454856876 |                  |46554545    |


  @AAFPRegression_5
  Scenario Outline: <AAFPSC05> Application submission for Child only with all the products
    Given Test set up for "NYL" feature and "NYL_AAFP" scenario
    Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
    Then Eligibility page details are displayed to user
    Then Select YES Radio button of Membership
    Then Click on Child
    And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
    And Click on Add Child button
    Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
    And Selects Married question as No for Child
    And Click on Add Child button on Screen
    And Clicks on next button
    And Verify that error message is displayed for state eligibility at top of the page
    And Enter New State as "<State1>"
    And Clicks on next button
    Then Validates that Child is displayed for TermLife,TenYTL,TwentyYTL
    And Clicks on Back or Previous button
    And Clicks Edit button for Child Added
    And Enters DOB for Child as "<CDOB1>"
    And Click on Add Child button on Screen
    And Clicks on next button
    And Validate Age Restriction Message
    And Clicks Edit button for Child Added
    And Enters DOB for Child as "<CDOB>"
    And Click on Add Child button on Screen
    And Clicks on next button
    Then Verify that Product page are displayed to user
    And Selects product TenYTL for Child
    And Clicks on next button
    And Click YES for Dependent Coverage information
    And Selects Benefit Amount for Child as "<Cbenefit>" under TenYTL
    And Clicks on next button
    Then Contact Details page is displayed to user and enters contact Details for self as "<SSN>","<Mstatus>","<Gender_Self>","<MembershipID>","<Street>","<City>","<ZipCode>"
    And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
    And Validates Height and Weight is not displayed for Self   
    And Selects Residential Radio Button
    And Clicks on next button
    Then Application Summary Page is displayed to user
    And Clicks on next button
    Then Authorize page details are displayed to user and confirm the term and conditions for Self
    And Validates I Understand verbiage one in Read and Sign Box
		And Validates Consent message in Read and Sign Box for NonUW    
    And Clicks on next button
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Thank you page is displayed to user
    And Verify that Confirmation number is generated for "<Website>"

    Examples: 
|Website |Title  |Fname |Lname  |State   |DOB                 |WorkHr |Cfname |Clname |CDOB                |CSex |State1    |CDOB1               |Cbenefit |SSN       |Mstatus |Gender_Self |MembershipID |Street        |City       |ZipCode |PrimaryPhType |PrimaryPhNo|
|aafpins |Mr.    |Ross  |Geller |Alberta |SYSDATE-69Y/11M/30D |20     |Ben    |Geller |SYSDATE-24Y/11M/30D |Male |Minnesota |SYSDATE-25Y/00M/00D |10000    |997467673 |Single  |Male        |9147368745   |200 9th St SE |New Prague |56071   |Mobile        |3475896879 |

  @AAFPRegression_6
  Scenario Outline: <AAFPSC06> Application Submission for Self and Child with 10 YTL
    Given Test set up for "NYL" feature and "NYL_AAFP" scenario
    Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
    Then Click on Self
    Then Click on Child
    Then Eligibility page details are displayed to user
    And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
    Then Select YES Radio button of Membership
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
    Then Selects product TenYTL for Self
    And Selects product TenYTL for Child
    And Clicks on next button
    Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
    And Clicks on next button
    Then Request Coverage page is displayed to user
    And Selects Benefit Amount for Self as "<Benefit>" under TenYTL
    And Selects Benefit Amount for Child as "<Cbenefit>" under TenYTL
    And Validates"<C1fname>","<C2fname>","<C3fname>" are not displayed in eligible children
    And Clicks on next button
    Then Beneficiary Page is displayed to user
    And Clicks on Add Beneficiary Button for Self under TenYTL
    Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
    And User Enters Beneficiary details as "<Trust>","<DateTrust>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Self under TenYTL
    Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
    And User Enters Beneficiary details as "<Trust1>","<DateTrust>"
    And Clicks on OK button
    And Validates error message on Add Beneficiary page-Only one Trust is allowed as Primary
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<BRelationship>","<BPerc>"
    And Clicks on OK button
    And Clicks on next button

    Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<MembershipID>","<Street>","<City>","<Zipcode>"
    And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page

    And Selects No for Travel Question Non QD for Self
    And Selects No Radio button for Tobacco Question Self
    And Selects Residential Radio Button
    And Clicks on next button
    Then Application Summary Page is displayed to user
    And Verify Child name as "<C4fname>","<C4lname>"
    And Verify Benefit Amount for child "<C4fname>","<TenYTL_SequenceNo1>" as "<Cbenefit>" under TenYTL
    And Verify Child name as "<C5fname>","<C5lname>"
    And Verify Benefit Amount for child "<C5fname>","<TenYTL_SequenceNo2>" as "<Cbenefit>" under TenYTL
    And Verify Child name as "<C6fname>","<C6lname>"
    And Verify Benefit Amount for child "<C6fname>","<TenYTL_SequenceNo3>" as "<Cbenefit>" under TenYTL
    And Verify Child name as "<C7fname>","<C7lname>"
    And Verify Benefit Amount for child "<C7fname>","<TenYTL_SequenceNo4>" as "<Cbenefit>" under TenYTL
    And Verify Child name as "<C8fname>","<C8lname>"
    And Verify Benefit Amount for child "<C8fname>","<TenYTL_SequenceNo5>" as "<Cbenefit>" under TenYTL
    And Clicks on next button
    Then Authorize page details are displayed to user and confirm the term and conditions for Self
    And Clicks on next button
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Thank you page is displayed to user
    And Verify that Confirmation number is generated for "<Website>"

Examples: 
|Website  |Title  |Fname     |Lname |State    |DOB                 |WorkHr |C1fname |C1lname |C1DOB  |C1Sex |C2fname |C2lname|C2DOB               |C2Sex  |C3fname |C3lname |C3DOB               |C3Sex  |C4fname |C4lname |C4DOB               |C4Sex |C5fname  |C5lname|C5DOB              |C5Sex  |C6fname |C6lname |C6DOB              |C6Sex  |C7fname |C7lname |C7DOB              |C7Sex |C8fname |C8lname |C8DOB              |C8Sex |Benefit |Cbenefit |Trust |DateTrust  |Trust1 |Bfname |Blname |BRelationship|BPerc|SSN       |Mstatus |Height|Weight|Gender_Self|MembershipID |StreetAddress     |City        |Zipcode |PrimaryPhType |PrimaryPhNo |TenYTL_SequenceNo1|TenYTL_SequenceNo2|TenYTL_SequenceNo3|TenYTL_SequenceNo4|TenYTL_SequenceNo5|    
|aafpins  |Mr.    |Chandler  |Bing  |Missouri |SYSDATE-54Y/00M/00D |45     |Jack    |Geller  |SYSDATE|Male  |Samantha|Gill   |SYSDATE-25Y/00M/00D |Female |Martha  |Gill    |SYSDATE-19Y/00M/00D |Female |Peter   |Gill    |SYSDATE-17Y/00M/00D |Male  |Josephine|Gill   |SYSDATE-15Y/00M/00D|Female  |Lola   |Gill    |SYSDATE-00Y/00M/14D|Female |Carter  |Simons  |SYSDATE-24Y/11M/30D|Male  |John    |Simons  |SYSDATE-23Y/11M/30D|Male  |450000  |10000    |Murphy|04/09/1974 |Arthur |Adam   |Gill   |Spouse       |100  |741155885 |Married |6.0   |180   |Male       |369748598678 |3805 Lindell Blvd |Saint Louis |63108   |Business      |7485748541  |  1               |  2               |  3               |  4               |  5               |


    #  | Website | Title | Fname | Lname | State    | DOB        | DOB1       | WorkHr | C1fname | C1lname | C1DOB   | C1Sex | C2fname  | C2lname | C2DOB      | C2Sex  | C3fname | C3lname | C3DOB      | C3Sex  | C4fname | C4lname | C4DOB      | C4Sex | C5fname   | C5lname | C5DOB      | C5Sex  | C6fname | C6lname | C6DOB      | C6Sex  | C7fname | C7lname | C7DOB      | C7Sex | C8fname | C8lname | C8DOB      | C8Sex | Benefit |Min      | Max        | Cbenefit | C1fname | C2fname  | C3fname | Trust  | DateTrust  | Trust1 | Bfname | Blname | BRelationship | BPerc | SSN       | Mstatus | Height | Weight | Sex  | MembershipID    | Street  | City       | Zipcode | PhoneType | PhoneNum   |
    #  | aafpins | Mr.   | Adam  | Gill  | Missouri | 09/04/2005 | 09/04/1999 |     45 | John    | Gill    | SYSDATE | Male  | Samantha | Gill    | 01/04/1990 | Female | Martha  | Gill    | 12/09/1999 | Female | Peter   | Gill    | 09/10/2001 | Male  | Josephine | Gill    | 09/04/2003 | Female | Lola    | Gill    | 07/04/1999 | Female | Carter  | Simons  | 07/04/2000 | Male  | John    | Simons  | 09/01/2001 | Male  |  450000 |$100,000 | $2,000,000 |    10000 | John    | Samantha | Martha  | Murphy | 04/09/1974 | Arthur | Adam   | Gill   | Spouse        |   100 | 741155885 | Married |    6.0 |    180 | Male | 741154545454545 | main st | providence |   70010 | Business  | 5343545434 |


  @AAFPRegression_7
  Scenario Outline: <AAFPSC07> Application submission for Self with all LI products
    Given Test set up for "NYL" feature and "NYL_AAFP" scenario
    Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
    Then Eligibility page details are displayed to user
    And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
    Then Select YES Radio button of Membership
    Then Click on Self
    And Clicks on next button
    And Verify that error message is displayed for state eligibility at top of the page
    And Enter New State as "<State1>"
    And Clicks on next button
    And Clicks on Back or Previous button
    And Enters DOB for Self as "<DOB1>"
    And Clicks on next button
    And Validate Age Restriction Message
    #Note- Validation for Min Age
    And Enters DOB for Self as "<DOB2>"
    And Clicks on next button
    Then Verify that Product page are displayed to user
    And Validates that Self is not displayed for TermLife,TwentyYTL
    And Clicks on Back or Previous button
    And Enters DOB for Self as "<DOB>"    
    And Enters DOB for Self as "<DOB3>"                 
    #Note- Validation for Age Limit 64Y/11M/30D
		And Clicks on next button
		And Product page details are displayed to user and Verify Available Product List TermLife,TenYTL
		And Clicks on Back or Previous button
		And Enters DOB for Self as "<DOB4>"                 
		#Note- Validation for Age Limit 59Y/11M/30D
		And Clicks on next button		
		Then Validates the product TwentyYTL is not displayed	
		And Verify Available Product List TermLife,TenYTL,DII,PO 
    And Clicks on next button
    Then Selects product TermLife for Self
    And Selects product TenYTL for Self
    And Selects product TwentyYTL for Self
    And Clicks on next button
    Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
    And Clicks on next button
    And Validate error message for required question
    And Confirms Imp Replacement Info for NewYork state
    Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for Self and enter details as "<TotalAmt>","<Iamount>","<Company>"
    And Clicks on next button
    Then Request Coverage page is displayed to user
    Then Verify the Quick Decision is not Available under TermLife on Product Page
    And Selects Benefit Amount for Self as "<Benefit>" under TermLife
    And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
    And Selects Benefit Amount for Self as "<Benefit2>" under TwentyYTL
    And Clicks on next button
    And Validate Max Aggregate error message
    And Selects Benefit Amount for Self as "<Benefit3>" under TermLife
    And Clicks on next button
    Then Beneficiary Page is displayed to user
    And Clicks on Add Beneficiary Button for Self under TermLife
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Self under TermLife
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bname1>","<Blname1>","<Relationship1>","<Perc1>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Self under TermLife
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bname2>","<Blname2>","<Relationship2>","<Perc2>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Self under TermLife
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bname3>","<Blname3>","<Relationship3>","<Perc3>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Self under TermLife
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship"<Bname4>","<Blname4>","<Relationship4>","<Perc4>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Self under TermLife
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship"<Bname5>","<Blname5>","<Relationship5>","<Perc5>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Self under TermLife
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship"<Bname6>","<Blname6>","<Relationship6>","<Perc6>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Self under TermLife
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship"<Bname7>","<Blname7>","<Relationship7>","<Perc7>"
    And Clicks on OK button
    And Clicks on next button
    Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<MembershipID>","<Street>","<City>","<Zipcode>"
    And Validate the Travel Question for Non QD application for Self
    And Selects Yes for Travel Question-TwelveMonths and Enters details for Self as "<Country>", "<Months>"
    And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
    And Selects No Radio button for Tobacco Question Self
    And Selects Residential Radio Button
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
     # | Website | Title | Fname | Lname | State   | DOB        | WorkHr | State1   | DOB1       | DOB2       | TotalAmt | Iamount | Company | Benefit | Benefit1 | Benefit2 | Benefit3 | Min      | Max        | Bname | Blname | Relationship | Perc | Bname1   | Blname1 | Relationship1 | Perc1 | Desc   | Bname2 | Blname2 | Relationship2 | Perc2 | Bname3 | Blname3 | Relationship3 | Perc3 | Bname4 | Blname4 | Relationship4 | Perc4 | Bname5   | Blname5 | Relationship5 | Perc5 | Bname6 | Blname6 | Relationship6 | Perc6 | Bname7 | Blname7 | Relationship7 | Perc7 | Country | Months | SSN       | Mstatus | Height | Weight | Sex  | MembershipID    | Street  | City       | Zipcode | PhoneType | PhoneNum   |
     # | aafpins | Mr.   | Adam  | Gill  | Ontario | 09/04/1973 |     40 | New York | 07/01/2012 | 04/10/1953 |   150000 |   10000 | Chubb   | 2000000 |   500000 |   700000 |   700000 | $100,000 | $2,000,000 | John  | Adams  | Son          |   50 | Samantha | Jonas   | Other         |    20 | Friend | Jack   | Jones   | Son           |    20 | Jake   | Charls  | Father        |    10 | Carter | Jonas   | Son           |    50 | Esabella | Swan    | Daughter      |    20 | James  | Arthur  | Son           |    20 | Kurian | Molly   | Mother        |    10 | India   |     10 | 990067673 | Single  |    6.0 |    220 | Male | 547654654654654 | main st | providence |   10110 | Home      | 6856468687 |
|Website |Title |Fname    |Lname       |State   |DOB                |WorkHr |State1    |DOB1                |DOB2                |DOB3               |DOB4                |TotalAmt |Iamount |Company  |Benefit |Benefit1 |Benefit2 |Benefit3 |Bname |Blname |Relationship |Perc |Bname1   |Blname1 |Relationship1 |Perc1 |Desc   |Bname2|Blname2|Relationship2 |Perc2 |Bname3 |Blname3 |Relationship3 |Perc3 |Bname4 |Blname4 |Relationship4 |Perc4 |Bname5  |Blname5 |Relationship5 |Perc5 |Bname6 |Blname6 |Relationship6 |Perc6 |Bname7 |Blname7 |Relationship7 |Perc7|Country |Months |SSN       |Mstatus |Height |Weight |Gender_Self |MemberId    |StreetAddress        |City     |Zip   |PrimaryPhType |PrimaryPhNo |
|aafpins |Mr.   |Lucifer  |Morningstar |Ontario |SYSDATE-54Y/11M/30D|40     |New York  |SYSDATE-16Y/11M/30D |SYSDATE-65Y/00M/00D |SYSDATE-64Y/11M/30D|SYSDATE-59Y/11M/30D |150000   |10000   |Chubb    |810000  |500000   |700000   |800000   |John  |Adams  |Son          |50   |Samantha |Jonas   |Other         |20    |Friend |Jack  |Jones  |Son           |20    |Jake   |Charls  |Father        |10    |Carter |Jonas   |Son           |50    |Esabella|Swan    |Daughter      |20    |James  |Arthur  |Son           |20    |Kurian |Molly   |Mother        |10   |India   |10     |991467673 |Single  |6      |220    |Male        |36584769584 |104 Miller Hollow Rd |Lockwood |14859 |Home          |7485124596  | 


  @AAFPRegression_8
  Scenario Outline: <AAFPSC08> Application submission for Self with DI & OO
    Given Test set up for "NYL" feature and "NYL_AAFP" scenario
    Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
    Then Eligibility page details are displayed to user
    Then Click on Self
    And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
    Then Select YES Radio button of Membership
    And Clicks on next button
    Then Product page details are displayed to user
    And Validate that DII product is not displayed
    And Clicks on Back or Previous button
    And Enter New State as "<State1>"
    And Clicks on next button
    Then Validate DII product is displayed
    And Clicks on Back or Previous button
    And Enters Self WorkHr as "<WorkHr1>"
    And Clicks on next button
    Then Validates that DII and PO are not displayed
    And Clicks on Back or Previous button
    And Enters Self WorkHr as "<WorkHr2>"
    And Clicks on next button
    Then Validates that PO is not displayed
    And Clicks on Back or Previous button
    And Enters Self WorkHr as "<WorkHr>"
    And Clicks on next button
    Then Selects product DII for Self
    And Selects product PO for Self
    And Clicks on next button
    And Selects Answer as No for Uniformed Service for Self of Group Disability Insurance
    And Selects Answer as No for Resident Member question for Self of Group Disability Insurance
    And Selects Answer as No for all additional questions of Group Disability Insurance for Self
    And Enters Monthly Income for Self as "<MonthlyIncome>"
    And Enters details for Monthly Expense and Percentage Responsible as "<Mexpense>","<Percresp>"
    And Clicks on next button
    Then Request Coverage page is displayed to user
    #And Validates under DII the Benefit Slider Range as 100 to 12000
    And Validates under DII the Benefit Slider Range for Self as "<Min_DII>" to "<Max_DII>"
    #And Validates under PO the Benefit Slider Range as 100 to 15000
    And Validates under PO the Benefit Slider Range for Self as "<Min_PO>" to "<Max_PO>"
    And Clicks on Back or Previous button
    #And Enters Monthly Income for Self as "<MonthlyIncome1>"
    And Enters Monthly Income for Self as "<MonthlyIncome1>"
    And Enters details for Monthly Expense and Percentage Responsible as "<Mexpense1>","<Percresp1>"
    And Clicks on next button
    Then Request Coverage page is displayed to user
    #And Selects Benefit Amount for Self as "<Benefit>" under DII
    #And Selects Wait Period for Self as "<WaitPeriod>" under DII
    #And Validates under DII the Benefit Slider Range as 100 to 3000
    And Selects Monthly Benefit Amount for Self as "<Benefit>" under DII
    And Selects Waiting Period for Self as "<WaitPeriod>" under DII
    And Validates under DII the Benefit Slider Range for Self as "<Min_DII_updated>" to "<Max_DII_updated>"
    And Selects Benefit Amount for Self as "<Benefit1>" under PO
    And Selects Wait Period for Self as "<WaitPeriod1>" under PO
    #And Validates under PO the Benefit Slider Range as 100 to 5000
    And Validates under PO the Benefit Slider Range for Self as "<Min_PO_updated>" to "<Max_PO_updated>"
    #And Clicks on Save for later button
    #Then User enters "<Password>" and "<VPassword>" and submit
    And Clicks on button to Save for later
    Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>"
    And Clicks OK Button Save For Later
    Then Refresh the browser
    #Then Clicks on Login in saved application and Enter "<Emailid>" and "<Password>"
    #And Clicks on retrieve button and OK
    Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive
    And Clicks on next button
    #Then Contact Details page is displayed to user
    Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<Street>","<City>","<Zip>"
    And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
    And Selects No for Travel Question Non QD for Self
    And Selects Residential Radio Button
    And Selects NO Radio Button for Business Address   
    And Enters Business Address Details as "<BusinessName>","<BusinessType>"
    And Enter Business Address Details as "<BStreet>","<BCity>","<BState>","<BZipcode>"    
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
      #| Website | Title | Fname | Lname | State   | DOB        | WorkHr | State1       | WorkHr1 | WorkHr2 | MonthlyIncome | Mexpense | Percresp | Min_DII | Max_DII | Min_PO | Max_PO  | MonthlyIncome1 | Mexpense1 | Percresp1 | Benefit | WaitPeriod | Min_DII_updated | Max_DII_updated | Min_PO_updated | Max_PO_updated | Benefit1 | WaitPeriod1 | Password | VPassword | Emailid                | SSN       | Mstatus | Height | Weight | Sex  | MembershipID    | Street  | City       | Zipcode | PhoneType | PhoneNum   | BusinessName | BusinessType |
      #| aafpins | Mr.   | Adam  | Gill  | Vermont | 09/04/1979 |     40 | North Dakota |      18 |      25 |         20000 |    20000 |      100 | $100    | $12,000 | $100   | $15,000 |           5000 |     10000 |        50 |    3000 | 90 Days    | $100            | $3,000          | $100           | $5,000         |     5000 | 90 Days     | Adam@123 | Adam@123  | adam@testabcabcper.com | 990067673 | Single  |    6.0 |    220 | Male | 547654654654654 | main st | providence |   10110 | Home      | 6856468687 | Johnson      | Partnership  |
|Website |Title |Fname  |Lname  |State   |DOB                 |WorkHr |State1       |WorkHr1 |WorkHr2  |MonthlyIncome |Mexpense |Percresp |MonthlyIncome1 |Mexpense1 |Percresp1|Benefit|WaitPeriod |Benefit1 |WaitPeriod1  |Password |VPassword |SSN       |Mstatus |Height|Weight |Gender_Self |MemberId |StreetAddress      |City   |Zip  |PrimaryPhType |PrimaryPhNo|BusinessName |BusinessType |Min_DII |Max_DII |Min_PO |Max_PO |Min_DII1 |Max_DII1 |Min_PO1|Max_PO1|BStreet          |BCity       |BState   |BZipcode|
|aafpins |Mr.   |Charlie|Harper |Vermont |SYSDATE-17Y/00M/00D |30     |North Dakota |19      |21       |20000         |15100    |100      |19990          |14900     |100      |3000   |90 Days    |5000     |90 Days      |Adam@123 |Adam@123  |990067841 |Single  |6.0   |220    |Male        |142574   |100 3rd St NW #C64 |Mandan |58554|Home          |3475847912 |Johnson      |Partnership  |100     |12000   |100    |15000  |100      |11900    |100    |14900  |5310 Hamilton St |Hyattsville |Maryland |20781   |

  @AAFPRegression_9
  Scenario Outline: <AAFPSC09> Application submission for Self with only Traditional Term Life Insurance (JET) & Rider(s)
    Given Test set up for "NYL" feature and "NYL_AAFP" scenario
    Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
    Then Eligibility page details are displayed to user
    Then Click on Self
    And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
    Then Select YES Radio button of Membership
    And Clicks on next button
    Then Verify that Product page are displayed to user
    And Selects product TermLife for Self
    And Clicks on next button
    Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
    And Clicks on next button
    Then Request Coverage page is displayed to user
    Then Selects Benefit Amount for Self as "<Benefit>" under TermLife
    And Selects Optional AD&D Rider under TermLife
    And Selects Rider Benefit Amount under TermLife for Self as "<AD&DRiderBenefit>"
    And Selects Waiver of Premium Rider under TermLife for Self
    And Clicks on next button
    Then Beneficiary Page is displayed to user
    And Clicks on Add Beneficiary Button for Self under TermLife
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Self under TermLife
    Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
    And User Enters Beneficiary details as "<Trust>","<DateTrust>"
    And Clicks on OK button
    And Clicks on next button
    Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MembershipID>","<Street>","<City>","<Zip>"
    And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
    And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
    And Select DrivingLicense Question as Yes and Enters details for driving info for Self as "<DrivingLicenseNo>","<DrivingLicenseState>"
    And Validates the Travel Question for QD application
    And Selects Yes for Travel Question QD for Self
    And Enters details for Travel Question QD for Self as "<Country>"
    And Selects No Radio button for Tobacco Question Self
    And Selects Residential Radio Button
    And Clicks on next button
    Then Application Summary Page is displayed to user
    And Clicks on next button
    Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<Vpassword>"
    And Clicks OK Button Save For Later
    Then Authorize page details are displayed to user
    And Validate Authorization message in Read and Sign Box
    And Clicks on next button
    And Validate Error message for Authorization
    And Authorize page details are displayed to user and confirm the term and conditions for Self
    And Clicks on next button
    Then Statement of Health page one is displayed to user and answeres as No for all questions on both pages for Self
    And Clicks on next button
    Then Statement of Health page two is displayed to user and answeres as No for all questions on both pages for Self
    And Clicks on next button
    Then Almost done page is displayed to user
    And Clicks on next button
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Your Insurance Request Decision Page is displayed to user
    And Clicks on next button
    Then Thank you page is displayed to user
    And Verify that Confirmation number is generated for "<Website>"

    Examples: 
     # | Website | Title | Fname | Lname            | State     | DOB        | WorkHr | Benefit | AD&DRiderBenefit | Bname | Blname | Relationship | Perc | Trust   | DateTrust  | SSN       | Mstatus | Height | Weight | Weight12mnths | Sex  | MembershipID | Street  | City       | Zipcode | DrivingLicenseNo | DrivingLicenseState | PhoneType | PhoneNum   | Password | Vpassword |
    #  | aafpins | Mrs.  | Vonda | Snmmmmtestcasese | Tennessee | 08/22/1982 |     40 |  500000 |           100000 | John  | Adams  | Son          |  100 | kennedy | 05/02/2012 | 990067140 | Single  |    6.0 |    220 |           200 | Male |  54765464654 | main st | providence |   10110 | K02445440        | Kansas              | Mobile    | 5343545432 | Adam@123 | Adam@123  |
|Website |Title   |Fname  |Lname            |State     |DOB        |WorkHr|Benefit |RidBenefit |Bname |Blname |Relationship |Perc |Trust  |DateTrust  |SSN       |Mstatus |Height|Weight |Weight12mnths |Gender_Self |MembershipID |StreetAddress |City      |Zip  |DrivingLicenseNo |DrivingLicenseState|PrimaryPhType |PrimaryPhNo |Password |Vpassword |Country|
|aafpins |Mrs.    |Vonda  |Snmmmmtestcasese |Minnesota |08/22/1982 |40    |500000  |100000     |John  |Adams  |Son          |100 | kennedy|05/02/2012 |990067140 |Single  |6.0   |220    |200           |Female      |741365       |881 Autumn Dr |Saint Paul|55125|K02445440        |Kansas             |Mobile        |7534354543  |Adam@123 |Adam@123  |Belize |

  @AAFPRegression_10
  Scenario Outline: <AAFPSC10> Application Submission for Spouse and Child with Traditional Term Life (JET)
    Given Test set up for "NYL" feature and "NYL_AAFP" scenario
    Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
    Then Eligibility page details are displayed to user
    Then Click on Spouse
    Then Click on Child
    And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
    Then Select YES Radio button of Membership
    And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
    And Select radio button Yes for Spouse is Member
    And Click on Add Child button
    Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<CSex>"
    And Selects Married question as No for Child
    And Click on Add Child button on Screen
    And Clicks on next button
    #Hide-Then Validates that Spouse is not displayed for TermLife,TenYTL,TwentyYTL
    And Clicks on Back or Previous button
    And Enters DOB for Spouse as "<SDOB1>"
    And Clicks on next button
    #Hide-Then Verify that Product page are displayed to user
    #Hide-And Validates that Spouse is displayed only for TenYTL
    And Clicks on Back or Previous button
    And Enters DOB for Spouse as "<SDOB2>"
    And Clicks on next button
    #Hide-Then Validates that Spouse is not displayed for TwentyYTL
    And Clicks on Back or Previous button
    And Enters DOB for Spouse as "<SDOB3>"
    And Clicks on next button
    #Hide-Then Verify that Product page are displayed to user
    And Clicks on next button
    And Validate Error Message on Product Page
    #Note: Verifying Product Selection is Mandatory
    And Selects product TermLife for Spouse
    And Selects product TermLife for Child
    And Clicks on next button
    And Click YES for Dependent Coverage information
    Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
    And Clicks on next button
    And Selects Benefit Amount for Spouse as "<SBenefit>" under TermLife
    And Selects Benefit Amount for Child as "<Cbenefit>" under TermLife
    And Clicks on next button
    Then Beneficiary Page is displayed to user
    And Clicks on Add Beneficiary Button for Spouse under TermLife
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Spouse under TermLife
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship"<Bname1>","<Blname1>","<Relationship1>","<Perc1>"
    And Clicks on OK button
    And Clicks on next button
    Then Contact Details page is displayed to user and enters contact Details for self as "<SSN>","<Mstatus>","<Gender_Self>","<MembershipID>","<Street>","<City>","<ZipCode>"
    And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
    And Selects Residential Radio Button
    And Enters contact Details for Spouse as "<SSSN_Blank>","<SHeight>","<SWeight>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>"
    And Select DrivingLicense Question as Yes and Enters details for Spouse as "<SDrivingLicenseNo>","<SDrivingLicenseState>"
    And Enters WeightTwelveMonths ago details for Spouse as "<S12mnthsWeight>"
    And Select DrivingLicense Question as No for Spouse 
    And Select No for Travel Question-SixMonths for Spouse
    And Selects No Radio button for Tobacco Question Spouse
    And Clicks on next button
    Then Validates SSN Required Error Message for Spouse
    #Note: SSN Mandatory for Spouse
    And Enters SSN as "<SSSN>" for Spouse
    And Clicks on next button
    And Clicks on next button
    Then Application Summary Page is displayed to user
    And Clicks on next button
    Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<Vpassword>"
    And Clicks on Next and OK Button
    Then Authorize page details are displayed to user and confirm the term and conditions for Self
    Then Authorize page details are displayed to user and confirm the term and conditions for Spouse
    And Clicks on next button
    Then Statement of Health page one is displayed to user and answeres as No for all questions on both pages for Spouse
    And Clicks on next button
    Then Statement of Health page two is displayed to user and answeres as No for all questions on both pages for Spouse
    And Clicks on next button
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

    Examples: 
     # | Website | Title | Fname | Lname     | State       | DOB        | WorkHr | Stitle | Sfname | Slname    | SDOB       | Cfname | Clname | CDOB       | CSex   | SDOB1      | SDOB2      | SDOB3      | SBenefit | Cbenefit | Bname | Blname | Relationship | Perc | Bname1   | Blname1 | Relationship1 | Perc1 | Desc   | SSN       | Mstatus | Sex  | MemId    | Street  | City       | Zipcode | PhoneType | PhoneNum  | SSSN_Blank | SSSN        | SHeight | SWeight | SWeight12mnths | SSex   | SPhoneType | SPhoneNum  | SDrivingLicenseNo | SDrivingLicenseState | Password | Vpassword |
     # | aafpins | Mr.   | Jack  | Snmcasejm | Connecticut | 06-02-1977 |     40 | Mrs.   | Linda  | Snmcaseim | 05/20/2017 | Talina | Gill   | 07/03/2017 | Female | 12/01/1952 | 12/01/1960 | 01/12/1980 |   300000 |    10000 | John  | Adams  | Son          |   50 | Samantha | Jonas   | Other         |    20 | Friend | 070000000 | Married | Male | 35465464 | main st | providence |   10110 | Mobile    | 534354543 |            | 36363666346 |     5.0 |     180 |            200 | Female | Home       | 5454856876 |          38259499 | Connecticut          | Adam@123 | Adam@123  |
|Website |Title |Fname |Lname            |State      |DOB        |WorkHr|Stitle |Sfname |Slname           |SDOB                  |Cfname |Clname |CDOB                 |CSex   |SDOB1                 |SDOB2               |SDOB3       |SBenefit|Cbenefit|Bname|Blname |Relationship |Perc |Bname1  |Blname1|Relationship1 |Perc1|Desc   |SSN       |Mstatus |Gender_Self |MembershipID|Street            |City       |ZipCode|PrimaryPhType |PrimaryPhNo |SSSN_Blank|SSSN      |SHeight |SWeight |S12mnthsWeight|Gender_Spouse |SPhoneType |SPhoneNum |SDrivingLicenseNo |SDrivingLicenseState |Password |Vpassword|
|aafpins |Mr.   |Jack  |Snmmmmtestcasejm |California |02/06/1977 |40    |Mrs.   |Linda  |Snmmmmtestcaseim |SYSDate - 16Y/11M/30D |Talina |Gill   |SYSDate - 00Y/0M/14D |Female |SYSDate - 65Y/00M/00D |SYSDate - 55Y/0M/0D |01/12/1980  |300000  |10000   |John |Adams  |Son          |100  |Samantha|Jonas  |Other         |100  |Friend |070000000 |Married |Male        |174968      |9616-1/2 Cedar St |Bellflower |90706  |Mobile        | 8747589678 |          |040000000 |5.0     |180     |200           |Female        |Home       |9685896878|38259499          |Connecticut          |Adam@123 |Adam@123 |


  @AAFPRegression_11
  Scenario Outline: <AAFPSC11> Validation Read & Sign Page with 20 different States one by one in loop
    Given Test set up for "NYL" feature and "NYL_AAFP" scenario
    Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
    Then Eligibility page details are displayed to user
    Then Click on Self
    And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
    Then Select YES Radio button of Membership
    And Clicks on next button
    Then Verify that Product page are displayed to user
    And Selects product TermLife for Self
    And Selects product TenYTL for Self
    And Selects product TwentyYTL for Self
    And Selects product DII for Self
    And Selects product PO for Self
    And Clicks on next button
    Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
    And Selects Answer as No for Uniformed Service for Self of Group Disability Insurance
    And Selects Answer as No for Resident Member question for Self of Group Disability Insurance
  #
    And Selects Answer as No for all additional questions of Group Disability Insurance for Self
    And Enters Monthly Income for Self as "<MonthlyIncome>"
    And Enters details for Monthly Expense and Percentage Responsible as "<Mexpense>","<Percresp>"
    And Clicks on next button
    #Then Request Coverage page is displayed to user and Selects Benefit Amount for Self as "<Benefit>" under TTLI
    Then Request Coverage page is displayed to user
    Then Selects Benefit Amount for Self as "<Benefit>" under TermLife
    And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
    And Selects Benefit Amount for Self as "<Benefit2>" under TwentyYTL
    And Selects Monthly Benefit Amount for Self as "<Benefit3>" under DII
    And Selects Waiting Period for Self as "<WaitPeriod>" under DII
    And Selects Benefit Amount for Self as "<Benefit4>" under PO
    And Selects Wait Period for Self as "<WaitPeriod1>" under PO
    And Clicks on next button
    Then Beneficiary Page is displayed to user
    And Clicks on Add Beneficiary Button for Self under TermLife
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relation>","<Percen>"
    And Clicks on OK button
    Then Clicks on Skip Beneficiary Button
    And Delete box is displayed and clicks on Yes
    Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<MembershipID>","<Street>","<City>","<Zipcode>"
    And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
    And Selects No for Travel Question Non QD for Self
    And Selects No Radio button for Tobacco Question Self
    And Enters Membership ID as "<MembershipID>" for Self
    And Selects Residential Radio Button
    And Selects Yes Radio Button for Business Address
    And Enters Business Address Details as "<BusinessName>","<BusinessType>"
    And Clicks on next button
    Then Application Summary Page is displayed to user
    And Clicks on next button
    Then Authorize page details are displayed to user
    Then Validates I Understand verbiage one in Read and Sign Box
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
    #And Validate Fraud Notice in Read and Sign Box
    And Validate Fraud Notice WM in Read and Sign Box
    #And Clicks on IMPORTANT NOTICE in the Consent message in Read and Sign Box
    And Validate Consent message in Read and Sign Box
    #And Verify PDF as Important Notice
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
    #And Clicks on IMPORTANT NOTICE in the Consent message in Read and Sign Box
    And Validate Consent message in Read and Sign Box
    And Navigate back to Eligibility page
    And Enter New State as "<State21>"
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Validate Fraud Notice CT in Read and Sign Box
    #Note: After Read & Sign and Electronic Consent, a third box is generated only for CT
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
    And Validate Fraud Notice MN in Read and Sign Box

    Examples: 
      | Website | Title | Fname | Lname | State    | DOB        | WorkHr | MonthlyIncome | Mexpense | Percresp | Benefit | Benefit1 | Benefit2 | WaitPeriod | Benefit3 | WaitPeriod1 | Benefit4 | Bfname | Blname | Relation | Percen | SSN         | Mstatus | Height | Sex  | Weight | MembershipID    | Street  | City       | Zipcode | PhoneType | PhoneNum   | BusinessName | BusinessType | State1     | State2  | State3   | State4    | State5       | State6       | State7   | State8               | State9  | State10 | State11 | State12    | State13  | State14  | State15     | State16   | State17    | State18  | State19 | State20    | State21     | State22   |
      | aafpins | Mr.   | Adam  | Gill  | Colorado | 08/01/1965 |     45 |         10000 |     7000 |      100 |  600000 |   250000 |   100000 | 60 Days    |      100 | 30 Days     |     5000 | JOHN   | CARTER | Spouse   |    100 | 553-43-4348 | Single  |    6.0 | Male |    180 | 545345343543543 | main st | providence |   10110 | Mobile    | 5343545432 | Chubb        | Corporation  | California | Alabama | Arkansas | Louisiana | Pennsylvania | Rhode Island | Maryland | District of Columbia | Florida | Kansas  | Maine   | New Jersey | New York | Oklahoma | Puerto Rico | Tennessee | Washington | Virginia | Wyoming | New Mexico | Connecticut | Minnesota |


@AAFPRegression_12
Scenario Outline:<AAFPSC12_1> Complete work flow of application Self only with Term Life Insurance       
       
       Given Test set up for "NYL" feature and "NYL_AAFP" scenario
       Given Customer navigate to NYL "<Website>" 
       When Clicks on Apply now button
       #Then Scroll down and click on I Attest To Having Read the Above Information button
       Then Select YES Radio button of Membership 
       Then Click on Self      
       And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
       And Clicks on next button
       Then Product page details are displayed to user
       And Selects product TermLife for Self
       And Clicks on next button
       Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
       And Clicks on next button    
       Then Request Coverage page is displayed to user
			 And Selects Benefit Amount for Self as "<Benefit>" under TermLife	
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
       Then Thank you page is displayed to user
       And Verify that Confirmation number is generated for "<Website>"            
       
Examples:                   
|Website |Title   |Fname  |Lname            |State     |DOB        |WorkHr    |Benefit     |SSN       |Mstatus |Height|Weight|Gender_Self|Wt12MonthAgo|MemberId        |StreetAddress |City      |Zip  |PrimaryPhType|PrimaryPhNo |BusinessName |BusinessType      |Password |Vpassword  |
|aafpins |Prof.   |Rayna  |Snmmmmtestcasesi |California|07/01/1974 |45        | 100000     |061000002 |Married |5.0   |180   |Male       |200         |545345343543543 |Street,123@   |providence|00001| Mobile      | 5343543543 |Arthur Corp  |Sole Proprietary  |Adam@123 |Adam@123   |   
       

@AAFPRegression_13
Scenario Outline:<AAFPSC12_2> Complete work flow of application Self only  with Term Life Insurance       
       
       Given Test set up for "NYL" feature and "NYL_AAFP" scenario
       Given Customer navigate to NYL "<Website>" 
       When Clicks on Apply now button
       Then Select YES Radio button of Membership 
       Then Click on Self
       And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
       And Clicks on next button
       Then Product page details are displayed to user
       And Selects product TermLife for Self
       And Clicks on next button
       Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
       And Clicks on next button    
       Then Request Coverage page is displayed to user
				And Selects Benefit Amount for Self as "<Benefit>" under TermLife	
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
       Then Thank you page is displayed to user
       And Verify that Confirmation number is generated for "<Website>"
       
       
       
Examples:     
       
       
|Website |Title   |Fname  |Lname            |State      |DOB        |WorkHr    |Benefit    |SSN       |Mstatus |Height|Weight|Gender_Self|Wt12MonthAgo|MemberId        |StreetAddress |City      |Zip  |PrimaryPhType|PrimaryPhNo |BusinessName |BusinessType      |Password |Vpassword  |Bank     |AccName   |Rnum      |Anum             |Frequency|pdfEnable| 
|aafpins |Prof.   |Rayna  |Snmmmmtestcasesi |Connecticut|07/01/1974 |45        | 100000    |061000002 |Married |5.0   |180   |Male       |200         |545345343543543 |Street,123@   |providence|00001| Mobile      | 5343543543 |Arthur Corp  |Sole Proprietary  |Adam@123 |Adam@123   |abc bank |adam      |745688999 |35434354879988588|Monthly  |0        |    
       

@AAFPRegression_14
Scenario Outline:<AAFPSC12_3> Complete work flow of application Self only with Term Life Insurance       
       
       Given Test set up for "NYL" feature and "NYL_AAFP" scenario
       Given Customer navigate to NYL "<Website>" 
       When Clicks on Apply now button
       Then Select YES Radio button of Membership 
       Then Click on Self
       And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
       And Clicks on next button
       Then Product page details are displayed to user
       And Selects product TermLife for Self
       And Clicks on next button
       Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
       And Clicks on next button    
       Then Request Coverage page is displayed to user
				And Selects Benefit Amount for Self as "<Benefit>" under TermLife	
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
       Then Thank you page is displayed to user
       And Verify that Confirmation number is generated for "<Website>"
       
       
       
Examples:     
       
       
|Website |Title   |Fname  |Lname            |State       |DOB        |WorkHr    |Benefit    |SSN       |Mstatus |Height|Weight|Gender_Self|Wt12MonthAgo|MemberId        |StreetAddress |City      |Zip  |PrimaryPhType|PrimaryPhNo |BusinessName |BusinessType      |Password |Vpassword  |Bank     |AccName   |Rnum      |Anum             |Frequency|pdfEnable| 
|aafpins |Prof.   |Rayna  |Snmmmmtestcasesi |Pennsylvania|07/01/1974 |45        | 100000     |061000002 |Married |5.0   |180   |Male       |200         |545345343543543 |Street,123@   |providence|00001| Mobile        | 5343543543 |Arthur Corp  |Sole Proprietary  |Adam@123 |Adam@123   |abc bank |adam      |745688999 |35434354879988588|Monthly  |0        |    
       

 
@AAFPRegression_15
Scenario Outline:<AAFPSC12_4> Complete work flow of application Self only  with Term Life Insurance       
       
       Given Test set up for "NYL" feature and "NYL_AAFP" scenario
       Given Customer navigate to NYL "<Website>" 
       When Clicks on Apply now button
       Then Select YES Radio button of Membership 
       Then Click on Self
       And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
       And Clicks on next button
       Then Product page details are displayed to user
       And Selects product TermLife for Self
       And Clicks on next button
       Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
       And Clicks on next button    
       Then Request Coverage page is displayed to user
			 And Selects Benefit Amount for Self as "<Benefit>" under TermLife	
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
       Then Thank you page is displayed to user
       And Verify that Confirmation number is generated for "<Website>"
       
       
       
Examples:     
       
       
|Website |Title   |Fname  |Lname            |State    |DOB        |WorkHr    |Benefit    |SSN       |Mstatus |Height|Weight|Gender_Self|Wt12MonthAgo|MemberId        |StreetAddress |City      |Zip  |PrimaryPhType|PrimaryPhNo |BusinessName |BusinessType      |Password |Vpassword  |Bank     |AccName   |Rnum      |Anum             |Frequency|pdfEnable| 
|aafpins |Prof.   |Rayna  |Snmmmmtestcasesi |Wisconsin|07/01/1974 |45        | 100000     |061000002 |Married |5.0   |180   |Male       |200         |545345343543543 |Street,123@   |providence|00001| Mobile        | 5343543543 |Arthur Corp  |Sole Proprietary  |Adam@123 |Adam@123   |abc bank |adam      |745688999 |35434354879988588|Monthly  |0        |    
       

@AAFPRegression_16
Scenario Outline:<AAFPSC12_5> Complete work flow of application Self only  with Term Life Insurance       
       
       Given Test set up for "NYL" feature and "NYL_AAFP" scenario
       Given Customer navigate to NYL "<Website>" 
       When Clicks on Apply now button
       Then Select YES Radio button of Membership 
       Then Click on Self
       And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
       And Clicks on next button
       Then Product page details are displayed to user
       And Selects product TermLife for Self
       And Clicks on next button
       Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
       And Clicks on next button    
      Then Request Coverage page is displayed to user
		  And Selects Benefit Amount for Self as "<Benefit>" under TermLife	
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
       Then Thank you page is displayed to user
       And Verify that Confirmation number is generated for "<Website>"
       
       
       
Examples:     
       
       
|Website |Title   |Fname  |Lname            |State  |DOB        |WorkHr    |Benefit    |SSN       |Mstatus |Height|Weight|Gender_Self|Wt12MonthAgo|MemberId        |StreetAddress |City      |Zip  |PrimaryPhType|PrimaryPhNo |BusinessName |BusinessType      |Password |Vpassword  |Bank     |AccName   |Rnum      |Anum             |Frequency|pdfEnable| 
|aafpins |Prof.   |Rayna  |Snmmmmtestcasesi |Vermont|07/01/1974 |45        | 100000     |061000002 |Married |5.0   |180   |Male       |200         |545345343543543 |Street,123@   |providence|00001| Mobile        | 5343543543 |Arthur Corp  |Sole Proprietary  |Adam@123 |Adam@123   |abc bank |adam      |745688999 |35434354879988588|Monthly  |0        |    
       
@AAFPRegression_17
Scenario Outline:<AAFPSC12_6> Complete work flow of application Self only  with Term Life Insurance       
       
       Given Test set up for "NYL" feature and "NYL_AAFP" scenario
       Given Customer navigate to NYL "<Website>" 
       When Clicks on Apply now button
       Then Select YES Radio button of Membership 
       Then Click on Self
       And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
       And Clicks on next button
       Then Product page details are displayed to user
       And Selects product TermLife for Self
       And Clicks on next button
       Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
       And Clicks on next button    
       Then Request Coverage page is displayed to user
		   And Selects Benefit Amount for Self as "<Benefit>" under TermLife
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
       Then Thank you page is displayed to user
       And Verify that Confirmation number is generated for "<Website>"
       
       
       
Examples:     
       
       
|Website |Title   |Fname  |Lname      |State        |DOB        |WorkHr    |Benefit    |SSN       |Mstatus |Height|Weight|Gender_Self|Wt12MonthAgo|MemberId     |StreetAddress |City      |Zip  |PrimaryPhType|PrimaryPhNo |BusinessName |BusinessType      |Password |Vpassword  |Mstatus1    |Mstatus2        |Bank       |AccName   |Rnum      |Anum             |Frequency|pdfEnable| 
|aafpins |Prof.   |Talina |Snmmmmtef  |New Hampshire|07/01/1974 |45        | 100000    |990067411 |Married |5.0   |180   |Male       |200         |545693543543 |Street,123@   |providence|00001| Mobile      | 7923543543 |Arthur Corp  |Sole Proprietary  |Adam@123 |Adam@123   |Civil Union |Domestic Partner|abc bank   |adam      |745688999 |35434354879988588|Monthly  |0        |    
       
@AAFPRegression_18
Scenario Outline:<AAFPSC12_7> Complete work flow of application Self only  with Term Life Insurance       
       
       Given Test set up for "NYL" feature and "NYL_AAFP" scenario
       Given Customer navigate to NYL "<Website>" 
       When Clicks on Apply now button
       Then Select YES Radio button of Membership 
       Then Click on Self
       And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
       And Clicks on next button
       Then Product page details are displayed to user
       And Selects product TermLife for Self
       And Clicks on next button
       Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
       And Clicks on next button    
       Then Request Coverage page is displayed to user
		   And Selects Benefit Amount for Self as "<Benefit>" under TermLife
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
       Then Thank you page is displayed to user
       And Verify that Confirmation number is generated for "<Website>"
       
       
       
Examples:     
       
       
|Website |Title   |Fname  |Lname            |State   |DOB        |WorkHr    |Benefit    |SSN       |Mstatus |Height|Weight|Gender_Self|Wt12MonthAgo|MemberId        |StreetAddress |City      |Zip  |PrimaryPhType|PrimaryPhNo |BusinessName |BusinessType      |Password |Vpassword  |Bank     |AccName   |Rnum      |Anum             |Frequency|pdfEnable| 
|aafpins |Prof.   |Rayna  |Snmmmmtestcasesi |Missouri|07/01/1974 |45        | 100000     |061000002 |Married |5.0   |180   |Male       |200         |545345343543543 |Street,123@   |providence|00001| Mobile        | 5343543543 |Arthur Corp  |Sole Proprietary  |Adam@123 |Adam@123   |abc bank |adam      |745688999 |35434354879988588|Monthly  |0        |    
       

 @AAFPRegression_19
Scenario Outline:<AAFPSC12_8> Complete work flow of application Self only  with Term Life Insurance       
       
       Given Test set up for "NYL" feature and "NYL_AAFP" scenario
       Given Customer navigate to NYL "<Website>" 
       When Clicks on Apply now button
       Then Select YES Radio button of Membership 
       Then Click on Self
       And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
       And Clicks on next button
       Then Product page details are displayed to user
       And Selects product TermLife for Self
       And Clicks on next button
       Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
       And Clicks on next button    
       Then Request Coverage page is displayed to user
			 And Selects Benefit Amount for Self as "<Benefit>" under TermLife
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
       Then Thank you page is displayed to user
       And Verify that Confirmation number is generated for "<Website>"
       
       
       
Examples:     
       
       
|Website |Title   |Fname  |Lname            |State         |DOB        |WorkHr    |Benefit    |SSN       |Mstatus |Height|Weight|Gender_Self|Wt12MonthAgo|MemberId        |StreetAddress |City      |Zip  |PrimaryPhType|PrimaryPhNo |BusinessName |BusinessType      |Password |Vpassword  |Bank     |AccName   |Rnum      |Anum             |Frequency|pdfEnable| 
|aafpins |Prof.   |Rayna  |Snmmmmtestcasesi |North Carolina|07/01/1974 |45        | 100000     |061000002 |Married |5.0   |180   |Male       |200         |545345343543543 |Street,123@   |providence|00001| Mobile        | 5343543543 |Arthur Corp  |Sole Proprietary  |Adam@123 |Adam@123   |abc bank |adam      |745688999 |35434354879988588|Monthly  |0        |    
       

 
 
 
 @AAFPRegression_20
Scenario Outline:<AAFPSC12_9> Complete work flow of application Self only  with Term Life Insurance       
       
       Given Test set up for "NYL" feature and "NYL_AAFP" scenario
       Given Customer navigate to NYL "<Website>" 
       When Clicks on Apply now button
       Then Select YES Radio button of Membership 
       Then Click on Self
       And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
       And Clicks on next button
       Then Product page details are displayed to user
       And Selects product TermLife for Self
       And Clicks on next button
       Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
       And Clicks on next button    
       Then Request Coverage page is displayed to user
			 And Selects Benefit Amount for Self as "<Benefit>" under TermLife
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
       Then Thank you page is displayed to user
       And Verify that Confirmation number is generated for "<Website>"
       
       
       
Examples:     
       
       
|Website |Title   |Fname  |Lname            |State      |DOB        |WorkHr    |Benefit    |SSN       |Mstatus |Height|Weight|Gender_Self|Wt12MonthAgo|MemberId        |StreetAddress |City      |Zip  |PrimaryPhType|PrimaryPhNo |BusinessName |BusinessType      |Password |Vpassword  |Bank     |AccName   |Rnum      |Anum             |Frequency|pdfEnable| 
|aafpins |Prof.   |Rayna  |Snmmmmtestcasesi |Minnesota  |07/01/1974 |45        | 100000     |061000002 |Married |5.0   |180   |Male       |200         |545345343543543 |Street,123@   |providence|00001| Mobile        | 5343543543 |Arthur Corp  |Sole Proprietary  |Adam@123 |Adam@123   |abc bank |adam      |745688999 |35434354879988588|Monthly  |0        |    
       

@AAFPRegression_21
Scenario Outline:<AAFPSC12_10> Complete work flow of application Self only  with Term Life Insurance       
       
       Given Test set up for "NYL" feature and "NYL_AAFP" scenario
       Given Customer navigate to NYL "<Website>" 
       When Clicks on Apply now button
       Then Select YES Radio button of Membership 
       Then Click on Self
       And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
       And Clicks on next button
       Then Product page details are displayed to user
       And Selects product TermLife for Self
       And Clicks on next button
       Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
       And Clicks on next button    
       Then Request Coverage page is displayed to user
		   And Selects Benefit Amount for Self as "<Benefit>" under TermLife
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
       Then Thank you page is displayed to user
       And Verify that Confirmation number is generated for "<Website>"
       
       
       
Examples:     
       
       
|Website |Title   |Fname  |Lname            |State   |DOB        |WorkHr    |Benefit    |SSN       |Mstatus |Height|Weight|Gender_Self|Wt12MonthAgo|MemberId        |StreetAddress |City      |Zip  |PrimaryPhType|PrimaryPhNo |BusinessName |BusinessType      |Password |Vpassword  |Bank     |AccName   |Rnum      |Anum             |Frequency|pdfEnable| 
|aafpins |Prof.   |Rayna  |Snmmmmtestcasesi |Maryland|07/01/1974 |45        | 100000     |061000002 |Married |5.0   |180   |Male       |200         |545345343543543 |Street,123@   |providence|00001| Mobile        | 5343543543 |Arthur Corp  |Sole Proprietary  |Adam@123 |Adam@123   |abc bank |adam      |745688999 |35434354879988588|Monthly  |0        |    
       

