Feature: AMA Test

@AmaRegression_1
Scenario Outline: <AMASC01> Application submission for Self, Spouse and Child and with all the products and rider(s) (JET)
Physician performing Normal Duties

	Given Test set up for "NYL" feature and "NYL_AMA" scenario
	Given Customer navigate to NYL "<Website>"	
	When Clicks on Start Your Application Button
	Then Eligibility page details are displayed to user
	And Selects I am as "<Occupation>"
	And Selects Yes Radio Button for Actively Performing Normal Duties of your occupation Question
	And Selects Yes Radio Button for Premier Accident or Hospital Income coverages for your spouse Question
	And Selects Yes Radio Button for Wish to apply for apply for insurance for any children Question
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
	And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
  	And Selects Married question as No for Child
  	And Selects No for full time student for Child
	And Honorably Discharged question as No
  	And Click on Add Child button on Screen							
	And Clicks on next button
	And Verify that error message is displayed for state eligibility at top of the page
	And Enter New State as "<State1>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Clicks on Back or Previous button
	And Enters DOB for Spouse as "<SDOB1>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Validates that Spouse is not displayed for following products: PAI,HII
	And Clicks on Back or Previous button
	And Enters DOB for Spouse as "<SDOB>"
	And Selects No Radio Button for Actively Performing Normal Duties of your occupation Question
	And Clicks on next button
	Then Product page details are displayed to user
	And Validates that Self is not displayed for following products: DPOSDI,OOEI
	#The following products will be displayed: TwentyYTL, FifteenYTL, TenYTL, PureTerm, PrefTerm, PAI, HII
	And Clicks on Back or Previous button
	And Selects Yes Radio Button for Actively Performing Normal Duties of your occupation Question
	And Clicks on next button

	Then Product page details are displayed to user
	And Selects product TwentyYTL for Self
	And Selects product TwentyYTL for Child
	And Selects product FifteenYTL for Self
	And Verify Child icon is disabled for FifteenYTL
	And Selects product TenYTL for Self
	And Verify Child icon is disabled for TenYTL
	And Selects product PureTerm for Self
	And Selects product PrefTerm for Self
	And Verify Child icon is disabled for PrefTerm
	And Selects product PAI for Child
	And Selects product DPOSDI for Self
	And Selects product OOEI for Self
	And Selects product HII for Child
	And Clicks on next button

	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	And Selects Answer as No for all additional questions of Group Disability Insurance for Self
	And Enters Monthly Income for Self as "<MonthlyIncome>"
	And Enters details for Monthly Expense and Percentage Responsible as "<Mexpense>","<Percresp>"
	And Clicks on next button
	Then Validate error message for required question
	And Confirms Imp Replacement Info for NewYork state
	And Clicks on next button
	And Clicks on Back or Previous button
	Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Self
	And Enter additional details as "<TotalAmt>","<IAmount>","<Company>"
	And Verify New York State paragraph is displayed for Self
	And Selects Yes for unable to work because of a disability for Self
	And Clicks on Add Company Button
	And Selects Benefit Option as "<BenPeriodOpt>"
	And Enters details for Company "<Company>","<BenAmt>","<BenefitPeriod>" and click on add button
	And Selects Yes for replace any other company's coverage for Self
	And Enters Amount under replace any other company's coverage as "<RepAmount>"
	And Selects Yes for applying for any other business/office overhead insurance
	And Clicks on Add Company Button for Business or Office Overhead
	And Enters details for Company "<Company2>","<BenAmt1>","<BenPeriod1>" and click on add button
	And Selects Yes for replace any other company's coverage for Self for overhead disability
	And Enters Amount under replace any other company's coverage of overhead product as "<RepAmount1>"
	And Clicks on next button	
	
	Then Request Coverage page is displayed to user
	#And Validates Quick Decision is not displayed for PureTerm
	And Clicks on Back or Previous button
	And Selects No for replace any other company's coverage for Self for overhead disability
	And Clicks on next button

	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit9>" under TwentyYTL
	And Validates under TwentyYTL the Benefit Slider Range as "<Min_Twenty>" to "<Max_Twenty>"
	And Selects Waiver Rider for Twenty Year Product
	And Selects AD&D Rider for Self under TwentyYTL
	And Selects Rider Benefit Amount for Self as "<RidBenefit>" for ADnD Rider under TwentyYTL
	And Validates under ADnD Rider TwentyYTL Benefit Slider Range as "<Min_ADnD>" to "<Max_ADnD>" for Self
	And Validates Benefit Amount for Child as "<Cbenefit>" under TwentyYTL
	And Selects Benefit Amount for Self as "<Benefit1>" under FifteenYTL
	And Validates under FifteenYTL the Benefit Slider Range as "<Min_Fifteen>" to "<Max_Fifteen>" for self
	And Selects Waiver of Premium Rider for Self under FifteenYTL
	And Selects AD&D Rider for Self under FifteenYTL
	And Selects Rider Benefit Amount for Self as "<RidBenefit1>" for ADnD Rider under FifteenYTL 
	And Validates under ADnD Rider FifteenYTL Benefit Slider Range as "<Min_ADnD1>" to "<Max_ADnD1>" for Self
	And Selects Benefit Amount for Self as "<Benefit2>" under TenYTL
	And Validates under TenYTL the Benefit Slider Range as "<Min_Ten>" to "<Max_Ten>" for self
	And Selects Waiver of Premium Rider for TenYear for Self
	And Selects AD&D Rider for Self under TenYTL
	And Selects Rider Benefit Amount for Self as "<RidBenefit2>" for ADnD Rider under TenYTL
	And Validates under ADnD Rider the Benefit Slider Range as "<Min_ADnD2>" to "<Max_ADnD2>" for Self
	#And Validates Quick Decision is available for Self under PureTerm
	And Selects Benefit Amount for Self as "<Benefit3>" under PureTerm
	And Validates under PureTerm the Benefit Slider Range as "<Min_Pure>" to "<Max_Pure>" for Self
	And Selects Waiver of Premium Rider for Self under PureTerm
	And Selects Benefit Amount for Self as "<Benefit4>" under PrefTerm
	And Validates under PrefTerm the Benefit Slider Range as "<Min_Pref>" to "<Max_Pref>" for Self
	And Selects Waiver of Premium Rider for Self under PrefTerm
	And Selects AD&D Rider for Self under PrefTerm
	And Selects Rider Benefit Amount for Self as "<RidBenefit3>" for ADnD Rider under PrefTerm 
	And Validates under ADnD Rider PrefTerm Benefit Slider Range as "<Min_ADnD3>" to "<Max_ADnD3>" for Self
	And Selects Benefit Amount for Self as "<Benefit5>" under PAI
	And Validates under PAI the Benefit Amount listed for Self are: "<PAI_amount1>","<PAI_amount2>","<PAI_amount3>"
	And Validates Benefit Amount for Spouse as "<Sbenefit>" under PAI
	And Validates Benefit Amount for Child as "<Cbenefit1>" under PAI
	And Selects Benefit Amount for Self as "<Benefit6>" under DPOSDI
	And Validates under DPOSDI the Benefit Slider Range as "<Min_DPOSDI>" to "<Max_DPOSDI>" for Self
	And Selects Wait Period for Self as "<WaitPeriod>" under DPOSDI
	And Validates Benefit Period for Self as "<BenPeriod>" under DPOSDI
	And Selects Cost of Living Adjustment Rider under DPOSDI
	And Selects Benefit Amount for Self as "<Benefit7>" under OOEI
	And Validates under OOEI the Benefit Slider Range as "<Min_OOEI>" to "<Max_OOEI>" for Self
	And Selects Wait Period for Self as "<WaitPeriod1>" under OOEI
	And Validates Benefit Duration for Self as "<BenDur>" under OOEI
	And Selects Benefit Amount for Self as "<Benefit8>" under HII
	And Validates under HII the Benefit Amount listed for Self are: "<HII_amount1>","<HII_amount2>","<HII_amount3>","<HII_amount4>","<HII_amount5>","<HII_amount6>"
	And Validates Benefit Amount for Spouse as "<Sbenefit1>" under HII
	And Validates Benefit Amount for Child as "<Cbenefit2>" under HII
	And Clicks on next button
	And Validate Max Aggregate error message 
	And Selects Benefit Amount for Self as "<Benefit10>" under TwentyYTL
	And Validate Max Aggregate error message 
	And Selects Benefit Amount for Self as "<Benefit>" under TwentyYTL
	And Clicks on next button

	Then Beneficiary Page is displayed to user
	And Clicks on Add Beneficiary Button for Self under TwentyYTL
	Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
	And User Enters Beneficiary details as "<Trust>","<DateTrust>"
	And Clicks on OK button
	And Verify that the Percent Displayed for Trust is "<TrustPercent>"
	And Clicks on Add Beneficiary Button for Self under TwentyYTL
	Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
	And User Enters Beneficiary details as "<Trust1>","<Datetrust>"
	And Clicks on OK button
	And Validates error message on Add Beneficiary page-Only one Trust is allowed as Primary
	And Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
	And User Enters Beneficiary details as "<Trust1>","<Datetrust>"
	And Clicks on OK button
	And Delete Contingent Beneficiary
	And Delete box is displayed and clicks on Yes
	And Clicks on Add Beneficiary Button for Self under TwentyYTL
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under TwentyYTL
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname1>","<Blname1>","<Relationship1>","<Perc1>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under TwentyYTL
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname2>","<Blname2>","<Relationship2>","<Perc2>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under TwentyYTL
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname3>","<Blname3>","<Relationship3>","<Perc3>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under FifteenYTL
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname4>","<Blname4>","<Relationship4>","<Perc4>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under FifteenYTL
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And Selects the First Option from Existing Beneficiaries List and select Type as "<BeneType>"	
	And Enters Percentage for First Option as "<Perc5>"	
	And Selects the Second Option from Existing Beneficiaries List and select Type as "<BeneType>"
	And Enters Percentage Second Option as "<Perc6>"
	And Selects the Third Option from Existing Beneficiaries List and select Type as "<BeneType>"
	And Enters Percentage Third Option as "<Perc7>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under FifteenYTL
	Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
	And Selects the First Option from Existing Beneficiaries List and select Type as "<BeneType1>" for Trust	
	And Clicks on OK button
	And Verify that the Percent Displayed for Trust is "<TrustPercent>"
	And Clicks on next button

	Then Contact Details page is displayed to user and validate details
	And Validate the Travel Question for Non QD application
	And Selects Yes for Travel Question Non QD for Self
	And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>"
	And Validate the Travel Question for QD application
	And Selects No for Travel Question QD for Self
	And Select DrivingLicense Question as Yes and Enters details for driving info for Self as "<DrivingLicenseNo>","<DrivingLicenseState>"
	And Enters WeightTwelveMonths ago details for Self as "<Weight12mnths>"
	And Enters contact Details for Self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"
	And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
	And Selects Yes Radio button for Tobacco Question Self
	And Enters Last Used Tobacco Date Details for Self as "<TobDate>"
	And Clicks on Products used textbox and Selects Product as "<Product>"
	And Selects Residential Radio Button
	And Selects Yes Radio Button for Business Address
	And Enters Business Address Details as "<BusinessName>","<BusinessType>"
	And Enters Physician details  for Self as "<PFname>","<PLname>","<PStreet>","<PState>","<PCity>","<PZipcode>","<PPhoneNum>"
	And Enters contact Details for Spouse as "<SSSN>","<SSex>","<SPhoneType>","<SPhoneNum>"
	And Enters Physician details  for Spouse as "<PFname1>","<PLname1>","<PStreet1>","<PState1>","<PCity1>","<PZipcode1>","<PPhoneNum1>"
	And Clicks on next button

	Then Application Summary Page is displayed to user
	And Validates Benefit Amount for Self as "<Benefit>" under TwentyYTL
	And Validates Waiver of Premium Rider
	And Validates Rider ADnD and Rider Benefit Amount for Self as "<RidBenefit>"
	And Validates Benefit Amount for Self as "<Benefit1>" under FifteenYTL
	And Validates Rider ADnD and Rider Benefit Amount for Self as "<RidBenefit1>"
	And Validates Waiver of Premium Rider
	And Validates Benefit Amount for Self as "<Benefit2>" under TenYTL
	And Validates Rider ADnD and Rider Benefit Amount for Self as "<RidBenefit2>"
	And Validates Waiver of Premium Rider
	And Validates Benefit Amount for Self as "<Benefit3>" under PureTerm
	And Validates Quick Decision under PureTerm
	And Validates Waiver of Premium Rider
	And Validates Benefit Amount for Self as "<Benefit4>" under PrefTerm
	And Validates Rider ADnD and Rider Benefit Amount for Self as "<RidBenefit3>"
	And Validates Waiver of Premium Rider
	And Validates Benefit Amount for Self as "<Benefit5>" under PAI
	And Validates Benefit Amount for Self as "<Benefit6>" under DPOSDI
	And Validates Cost of Living Adjustment Rider
	And Validates Benefit Amount for Self as "<Benefit7>" under OOEI
	And Validates Benefit Amount for Self as "<Benefit8>" under HII
	And Validates Benefit Amount for Spouse as "<Sbenefit>" under PAI
	And Validates Benefit Amount for Spouse as "<Sbenefit1>" under HII
	And Validates Benefit Amount for Child as "<Cbenefit>" under TwentyYTL
	And Validates Benefit Amount for Child as "<Cbenefit1>" under PAI
	And Validates Benefit Amount for Child as "<Cbenefit2>" under HII
	And Clicks on next button
	Then Save Information page will be displayed to user and user will enter Login details as  "<Password>","<Vpassword>"
	And Clicks on next and OK Button

	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	And Clicks on next button

	Then Statement of Health page one is displayed to user and answers as No for all questions for Self
	And Clicks on next button
	Then Statement of Health page two is displayed to user and answers as No for all questions for Self
	And Clicks on next button
	Then Almost done page is displayed to user
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish
	Then Your Insurance Request Decision Page is displayed to user
	And Clicks on next button

	Then Payment Information Page is displayed to user
	 And user Selects Payment option as Bank for TwentyYTL
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for TwentyYTL as "<Frequency>"
	And Selects Payment Method for FifteenYTL
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for FifteenYTL as "<Frequency>"
	And Selects Payment Method for TenYTL
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for TenYTL as "<Frequency>"
	And Selects Payment Method for PureTerm
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for PureTerm as "<Frequency>"
	And Selects Payment Method for PrefTerm
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for PrefTerm as "<Frequency>"
	And Selects Payment Method for PAI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for PAI as "<Frequency>"
	And Selects Payment Method for DPOSDI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for DPOSDI as "<Frequency>"
	And Selects Payment Method for OOEI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for OOEI as "<Frequency>"
	And Selects Payment Method for HII
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for HII as "<Frequency>" and reviews
	And Clicks on next button

	Then Payment Authorization Letter is displayed to user and clicks on Continue
	And Signs Payment Authorization Letter
	And Clicks on next button to finish

	Then Thank you page is displayed to user
	And Verify that two Confirmation numbers are generated for "<Website>"


Examples:
|Website |Occupation |Title  |Fname   |Lname           |State     |DOB         |Stitle |Sfname  |Slname           |SDOB       |Cfname |Clname |CDOB                    |Csex  |State1     |SDOB1                 |MonthlyIncome |Mexpense |Percresp |Benefit    |RidBenefit |Cbenefit |Benefit1 |RidBenefit1 |Benefit2 |RidBenefit2 |Benefit3 |Benefit4 |RidBenefit3 |Benefit5 |Sbenefit |Cbenefit1 |Benefit6  |WaitPeriod |BenPeriod      |Benefit7 |WaitPeriod1 |BenDur    |Benefit8 |Sbenefit1 |Cbenefit2 |Benefit9    |Benefit10 |Trust    |Datetrust              |TrustPercent |Trust1 |Bname |Blname |Relationship |Perc |Bname1   |Blname1 |Relationship1 |Perc1    |Bname2   |Blname2 |Relationship2 |Perc2 |Bname3 |Blname3 |Relationship3 |Perc3 |Bname4 |Blname4 |Relationship4 |Perc4 |Perc5 |Perc6 |Perc7  |Country |Months  |SSN        |Mstatus |Height |Weight |Sex  |Weight12mnths   |Street              |City      |Zipcode |DrivingLicenseNo  |DrivingLicenseState  |PhoneType |PhoneNum   |BusinessName |BusinessType     |SSSN      |SSex   |SPhoneType |SPhoneNum  |Password |Vpassword |TotalAmt |IAmount |Company |Company1 |BenAmt |BenPeriodOpt |BenefitPeriod |RepAmount |Company2         |BenAmt1 |BenPeriod1 |RepAmount1 |Min_Twenty |Max_Twenty |Min_Fifteen |Max_Fifteen |Min_Ten  |Max_Ten    |Min_ADnD   |Max_ADnD   |Min_ADnD1 |Max_ADnD1  |Min_ADnD2 |Max_ADnD2 |Min_Pure |Max_Pure  |Min_Pref |Max_Pref    |Min_ADnD3 |Max_ADnD3  |PAI_amount1 |PAI_amount2 |PAI_amount3 |Min_DPOSDI |Max_DPOSDI |Min_OOEI |Max_OOEI |HII_amount1  |HII_amount2 |HII_amount3 |HII_amount4 |HII_amount5 |HII_amount6 |Benefit9  |TobDate                |Product  |Bank            |AccName |Rnum      |Anum         |Frequency |BeneType  |BeneType1 |PFname |PLname |PStreet          |PState |PCity     |PZipcode |PPhoneNum  |PFname1 |PLname1 |PStreet1         |PState1 |PCity1    |PZipcode1 |PPhoneNum1 |
|ama     |Physician  |Mr.    |Jack    |Snmmmmtestcasejm|Manitoba  |02/06/1977  |Mrs.   |Thalia  |Snmmmmtestcasegt |05/20/1978 |John   |Gill   |SYSDATE  - 00Y/06M/00D  |Male  |New York   |SYSDATE - 16Y/11M/30D |10000         |5000     |100      |$1,750,000 |$250,000   |$25,000  |$500,000 |$150,000    |$500,000 |$150,000    |$500,000 |$750,000 |$200,000    |$750,000 |$300,000 |$75,000   |$1,500    |60 days    |To age 67 plan |$5,000   |60 days     |12 months |$500     |$500      |$500      |$1,775,000  |$150,000  |kennedy  |SYSDATE - 50Y/02M/04D  |100          |arthur |John  |Adams  |Son          |25   |Samantha |Jonas   |Other         |25       |Rihanna  |Jones   |Daughter      |35    |Jake   |Charles |Father        |15    |Carter |Jonas   |Father        |50    |15    |15    |20     |India   |6       |745878574  |Married |5.5    |220    |Male |200             |60 Warren Street #5 |Manhattan |10001   |2043310           |District of Columbia |Mobile    |7480235985 |Arthur Corp  |Sole Proprietary |985802145 |Female |Home       |9870326599 |Adam@123 |Adam@123  |125000   |65000   |ace     |lux corp |100000 |Through Age  |70            |95000     |wayne enterprise |94000   |24         |68000      |100000     |4000000    |100000      |4000000     |100000   |4000000    |25000      |1000000    |25000     |1000000    |25000     |1000000   |100000   |1000000   |25000    |3000000     |25000     |1000000    |500000      |750000      |1000000     |100        |6600       |1000     |20000    |100          |200         |300         |400         |500         |600         |2000000   |SYSDATE - 00Y/06M/00D  |Cigar    |Bank of America |Jack    |748596789 |789456789452 |Monthly   |Primary   |Contingent|Alan   |Harper |2302 S Rouse Ave |Kansas |Pittsburg |66762    |9878547854 |Judith  |Harper  |2302 S Rouse Ave |Kansas  |Pittsburg |66762     |7878410257 |
