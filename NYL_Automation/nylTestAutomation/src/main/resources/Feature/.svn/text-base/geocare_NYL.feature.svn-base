Feature: GEOCARE Test

  @GEOCARERegression_1
  Scenario Outline: <GEOCAREC01> Application Submission for Self,  Spouse, Child All eligible products (Primary Individual and Contingent Trust beneficiaries for all)
    Given Test set up for "NYL" feature and "NYL_GEOCARE" scenario
    Given Customer navigate to NYL "<Website>"
    And Select Association as "<Association>"
    When Clicks on Apply now button
    Then Eligibility page details are displayed to user
And Click on Self
And Click on Spouse
And Click on Child
And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
And Select YES Radio button of Membership
And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
And Select radio button NO for Spouse is Member
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
And Selects Married question as No
And Click on Add Child button on Screen
And Clicks on next button

Then Product page details are displayed to user
And Clicks on next button
And Validate Error Message on Product Page
#And Verify Available Product List TLI TenYTL FTD HLAI DII IHI for self
##Hide-And Validates that Self is displayed at product page for TermLife, TenYTL, FirstToDieTermLife, HLAI, DII, IHI
#And Verify Available Product List TLI TenYTL FTD HLAI IHI for Spouse
##Hide-And Validates that Spouse is displayed at product page for TermLife, TenYTL, FirstToDieTermLife, HLAI, IHI
#And Verify Available Product List TLI TenYTL HLAI IHI for Child
##Hide-And Validates that Child is displayed at product page for TermLife, TenYTL, HLAI, IHI
#And Selects product TLI for Self, Spouse and Child
And Selects product TermLife for Self
And Selects product TermLife for Spouse
And Selects product TermLife for Child
#And Selects product TenYTL for Self, Spouse and Child
And Selects product TenYTL for Self
And Selects product TenYTL for Spouse
And Selects product TenYTL for Child
And Selects product FirstToDie TLI for Self
And Verify that Spouse icon is selected for FirstToDie TLI
#And Selects product HLAI for Self, Spouse and Child
And Selects Product HLAI for Self
And Selects Product HLAI for Spouse
And Selects Product HLAI for Child
And Selects product DII for Self
#And Selects product IHI for Self, Spouse and Child
And Selects product InHospitalInsurance for Self
And Selects product InHospitalInsurance for Spouse
And Selects product InHospitalInsurance for Child
And Clicks on next button

#Then Product: Additional Questions page details are displayed to user and selects Answer as YES for all questions for Self
#And Selects Yes for life insurance applied for intended to replace for Self
#And Enters value"<TAmount>","<lamount>","<Company>" for Self
#And Selects Answer as YES for all questions for Spouse
Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for Self and Spouse and enter details as "<TAmount>","<lamount>","<Company>"
#And Selects Yes for life insurance applied for intended to replace for Spouse
#And Enters value"<STAmount>","<Slamount>","<SCompany>" for Spouse
#And Selects Answer as YES for all questions for Self
#And Enters value"<MAmount>" for Self
#And Clicks on Add Company Button
#And Enters value"<Company1>","<BAmount>","<BPeriod>"
#And Selects Yes for Will this disability coverage replace any other company's coverage for Self
#And Enters value as "<RAmount>" for Self
And Enters Monthly Income for Self as "<MAmount>"
And Selects Yes for unable to work because of a disability for Self
And Clicks on Add Company Button
And Enters details for Company "<Company1>","<BAmount>","<BPeriod>" and click on add button
And Selects Yes for replace any other company's coverage for Self
And Enters Amount under replace any other company's coverage as "<RAmount>"


And Clicks on next button

Then Request Coverage page is displayed to user
#And Selects Type of Coverage as "<TypeofCove>" for Self under TLI
#And Selects Benefit Amount for Self as "<Benefit>" under TLI
And Selects Type of Coverage as "<TypeofCove>" for Self under Term Life
And Selects Benefit Amount for Self as "<Benefit>" under TermLife
#And Selects Type of Coverage as "<TypeofCove>" for Spouse under TLI
#And Selects Benefit Amount for Spouse as "<SBenefit>" under TLI
And Selects Type of Coverage as "<TypeofCove>" for Spouse under Term Life
And Selects Benefit Amount for Spouse as "<SBenefit>" under TermLife
#And Select Benefit Amount for Child is "<CBenefit>" under TLI
And Selects Benefit Amount for Child as "<CBenefit>" under TermLife


And Selects Type of Coverage as "<TypeofCove>" for Self under TenYTL
And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
And Selects Type of Coverage as "<TypeofCove>" for Spouse under TenYTL
And Selects Benefit Amount for Spouse as "<SBenefit1>" under TenYTL
And Selects Benefit Amount for Child as "<CBenefit1>" under TenYTL




#And Selects Type of Coverage as "<TypeofCove>" for Self & Spouse under FTD
And Selects Type of Coverage as "<TypeofCove>" for Self and Spouse under FirstToDie
#And Validates under FTD the Benefit Slider Range as "<RangeMin>" to "<RangeMax>"
##Hide-And Validates under FirstToDie the Benefit Slider Range for Self as "<RangeMin>" to "<RangeMax>"
#And Selects Benefit Amount for Self as "<Benefit2>" under FTD
And Selects Benefit Amount for Self as "<Benefit2>" under FirstToDie



And Selects Type of Coverage as "<TypeofCove>" for Self under HLAI
And Selects Benefit Amount for Self as "<Benefit3>" under HLAI
And Selects Type of Coverage as "<TypeofCove>" for Spouse under HLAI
And Selects Benefit Amount for Spouse as "<SBenefit3>" under HLAI
##Hide-And Validates Benefit Amount for Child as "<CBenefit3>" under HLAI displayed in label

And Selects Type of Coverage as "<TypeofCove>" for Self under DII
#And Verify Maximum Monthly Benefit Amount for Self is "<Benefit4>" under DII
##Hide-And Validate Maximum Monthly Benefit Amount for DII "<Benefit4>"
And Selects Monthly Benefit Amount for Self as "<Benefit4>" under DisabilityIncomeInsurance
#And Enters value"<WPeriod>","<PType>" for Self under DII
And Selects Waiting Period for Self as "<WPeriod>" under DII
And Selects Plan Type for Self as "<PType>" under DII
And Validates Plan Type for Self as "<PType>" under DII
And Selects Cost of Living Adjustment Rider for DII Self

And Selects Type of Coverage as "<TypeofCove>" for Self under InHospitalInsurance
And Selects Benefit Amount for Self as "<Benefit5>" under InHospitalInsurance
And Selects Type of Coverage as "<TypeofCove>" for Spouse under InHospitalInsurance
And Selects Benefit Amount for Spouse as "<SBenefit5>" under InHospitalInsurance
And Selects Type of Coverage as "<TypeofCove>" for Child under InHospitalInsurance
And Selects Benefit Amount for Child as "<CBenefit5>" under InHospitalInsurance
And Clicks on next button
And Verify Error Message in Spouse section for TermLife
And Selects Benefit Amount for Spouse as "<SBenefit2>" under TermLife
And Clicks on next button

Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Self under TenYTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relationship>","<Perc>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TenYTL
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
And User Enters Beneficiary details as "<Trust>","<Datetrust>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under TenYTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<SBfname>","<SBlname>","<SRelationship>","<SPerc>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under TenYTL
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
And User Enters Beneficiary details as "<STrust>","<SDatetrust>"
And Clicks on OK button

And Clicks on Add Beneficiary Button for Self under FirstToDieTermLife
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname1>","<Blname1>","<Relationship1>","<Perc1>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under FirstToDieTermLife
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
And User Enters Beneficiary details as "<Trust1>","<Datetrust1>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under FirstToDieTermLife
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<SBfname1>","<SBlname1>","<SRelationship1>","<SPerc1>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under FirstToDieTermLife
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
And User Enters Beneficiary details as "<STrust1>","<SDatetrust1>"
And Clicks on OK button

And Clicks on Add Beneficiary Button for Self under TermLife
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname2>","<Blname2>","<Relationship2>","<Perc2>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TermLife
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
And User Enters Beneficiary details as "<Trust2>","<Datetrust2>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under TermLife
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<SBfname2>","<SBlname2>","<SRelationship2>","<SPerc2>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under TermLife
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
And User Enters Beneficiary details as "<STrust2>","<SDatetrust2>"
And Clicks on OK button

And Clicks on Add Beneficiary Button for Self under HLAI
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname3>","<Blname3>","<Relationship3>","<Perc3>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under HLAI
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
And User Enters Beneficiary details as "<Trust3>","<Datetrust3>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under HLAI
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<SBfname3>","<SBlname3>","<SRelationship3>","<SPerc3>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under HLAI
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
And User Enters Beneficiary details as "<STrust3>","<SDatetrust3>"
And Clicks on OK button
And Clicks on next button

Then Contact Details page is displayed to user
Then Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page		
And Selects Yes for Travel Question-TwelveMonths and Enters details for Self as "<Country>", "<HowLong>"	
And Validate the Travel Question for Non QD application for Self
And Selects Business Address Radio Button for Send Correspondence To
And Selects Yes Radio Button for Business Address
		And Enters Business Address Details as "<BusinessName>","<BusinessType>"


And Enters contact Details for Spouse without SSN as "<SGender>","<SHeight>","<SWeight>","<SPhoneType>","<SPhoneNum>"
And Selects Yes for Travel Question Non QD for Spouse
And Enter datails for Outside US country and How Long months for Spouse as "<SCountry>","<SHowLong>"
And Clicks on next button

Then Application Summary Page is displayed to user
#And Verify Benefit Amount for "<Self>" as "<Benefit>" for product "<Term Life Insurance>" under "<Group Life Insurance>"
#And Verify Benefit Amount for "<Self>" as "<Benefit1>" for product "<10 Year Level Term Insurance>" under "<Group Life Insurance>"
#And Verify Benefit Amount for "<Self>" as "<Benefit2>" for product "<First-to-Die Term Life Insurance>" under "<Group Life Insurance>"
#And Verify Benefit Amount for "<Self>" as "<Benefit3>" for product "<High-limit Accidental Insurance>" under "<Group Life Insurance>"
#And Verify Benefit Amount for "<Self>" as "<Benefit4>" for product "<Disability Income Insurance>" under "<Group Disability Insurance>"
#And Verify Benefit Amount for "<Self>" as "<Value_Yes>" for product "<Cost of Living Adjustment (COLA)>" under "<Group Disability Insurance>"
#And Verify Benefit Amount for "<Self>" as "<Benefit5>" for product "<In-Hospital Insurance>" under "<Supplemental Health Benefits>"
#
#And Verify Benefit Amount for "<Spouse>" as "<SBenefit2>" for product "<Term Life Insurance>" under "<Group Life Insurance>"
#And Verify Benefit Amount for "<Spouse>" as "<SBenefit1>" for product "<10 Year Level Term Insurance>" under "<Group Life Insurance>"
#And Verify Benefit Amount for "<Spouse>" as "<Benefit2>" for product "<First-to-Die Term Life Insurance>" under "<Group Life Insurance>"
#And Verify Benefit Amount for "<Spouse>" as "<SBenefit5>" for product "<In-Hospital Insurance>" under "<Supplemental Health Benefits>"
#
#And Verify Benefit Amount for child "<Cfname>","<TermLife_SequenceNo_1>" as "<CBenefit>" under "<Term Life Insurance>"
#And Verify Benefit Amount for child "<Cfname>","<10YearLevel_SequenceNo_2>" as "<CBenefit1>" under "<10 Year Level Term Insurance>"
#And Verify Benefit Amount for child "<Cfname>","<HighlimitAccidental_SequenceNo_3>" as "<CBenefit3>" under "<High-limit Accidental Insurance>"
#And Verify Benefit Amount for child "<Cfname>","<In-Hospital_SequenceNo_4>" as "<CBenefit5>" under "<In-Hospital Insurance>"
#
And Clicks on next button

And Validate Consent message in Read and Sign Box
And Clicks on next button
And Validate Error message for Authorization
Then Authorize page details are displayed to user and confirm the term and conditions for Self
Then Authorize page details are displayed to user and confirm the term and conditions for Spouse
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
And Clicks on next button
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<Website>"
And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario>","<pdfEnable>","<pdfName>"

Examples:
|Website |Association |Title |Fname |Lname |State |DOB                 |WorkHr |Stitle |Sfname |Slname |SDOB                |Cfname |Clname |CDOB                |Csex |TAmount |lamount |Company |STAmount |Slamount |SCompany |MAmount |Company1 |BAmount |BPeriod|RAmount|TypeofCove |Benefit  |SBenefit |CBenefit |Benefit1 |SBenefit1|CBenefit1 |Benefit2 |Benefit3 |SBenefit3 |CBenefit3 |Benefit4 |WPeriod |PType                              |Benefit5 |SBenefit5 |CBenefit5 |SBenefit2 |Bfname |Blname |Relationship |Perc |Trust    |Datetrust |SBfname |SBlname |SRelationship |SPerc |STrust   |SDatetrust |Bfname1 |Blname1 |Relationship1 |Perc1 |Trust1          |Datetrust1 |SBfname1 |SBlname1 |SRelationship1 |SPerc1 |STrust1     |SDatetrust1 |Bfname2 |Blname2 |Relationship2 |Perc2 |Trust2    |Datetrust2 |SBfname2 |SBlname2 |SRelationship2 |SPerc2 |STrust2      |SDatetrust2 |Bfname3 |Blname3 |Relationship3 |Perc3 |Trust3     |Datetrust3 |STrust3     |SDatetrust3 |SSN       |Mstatus |Height|Weight |Country |HowLong |Street        |City |Zipcode |PhoneType |PhoneNum   |BusinessName |BusinessType |SHeight |SWeight |SCountry |SHowLong |SPhoneType |SPhoneNum  |Gender |SGender |RangeMin|RangeMax|Child|Term Life Insurance|Group Life Insurance|Self|Spouse|10 Year Level Term Insurance|First-to-Die Term Life Insurance|High-limit Accidental Insurance|Disability Income Insurance|Cost of Living Adjustment|In-Hospital Insurance|Group Disability Insurance|Supplemental Health Benefits|TermLife_SequenceNo_1|10YearLevel_SequenceNo_2|HighlimitAccidental_SequenceNo_3|In-Hospital_SequenceNo_4|Value_Yes|Cost of Living Adjustment (COLA)|
|GEOCARE |AAPG        |Mr.   |Alex  |Smith |Texas |SYSDate-17Y/00M/00D |60     |Mrs.   |Jenny  |Smith  |SYSDate-17Y/00M/00D |Sam    |Smith  |SYSDate-00Y/00M/16D |Male |2000    |2000    |JFMA    |2000     |2000     |JFMA     |16500   |MSTP     |5000    |12     |5000   |New        |$200,000 |$250,000 |$5,000   |$230,000 |$100,000 |$5,000    |$500,000 |$500,000 |$250,000  |$10,000   |$9,900   |60 days |Plan-2 To Age 65 accident/sickness |$200     |$200      |$200      |$100,000  |Axl    |Rose   |Son          |100  |MGM CORP |01/01/2001|Dizzy   |Reeds   |Father        |100   |GNR CORP |01/01/1986 |Slash   |Rains   |Son           |100   |Pink Floyd Corp |01/01/1980 |Myles    |Keneddy  |Father         |100    |Dylan Trust |01/01/1970  |Marry   |Fox     |Mother        |100   |NMS Trust |01/01/2006 |David    |Gilmore  |Father         |100    |Phantom corp |01/01/1970  |Jenny   |Jon     |Mother        |100   |Bonus Club |01/12/2006 |Dylan Trust |01/01/1970  |115456445 |Married |5.5   |200    |Belgium |12      |#$12,Lemon rd |SA   |12579   |Home      |4541148484 |Sun Corp     |Corporation  |5.2     |180     |Belgium  |12       |Home       |4541148484 |Male   |Female  |$50,000 |$500,000|Child|Term Life Insurance|Group Life Insurance|Self|Spouse|10 Year Level Term Insurance|First-to-Die Term Life Insurance|High-limit Accidental Insurance|Disability Income Insurance|Cost of Living Adjustment|In-Hospital Insurance|Group Disability Insurance|Supplemental Health Benefits|1                    |2                       |3                               |4                       |Yes      |Cost of Living Adjustment|


@GEOCARERegression_2
  Scenario Outline: <GEOCAREC02> Application Submission for Self only with all eligible products where GEOCARE association is AAPL (Benefitiary as Primary trust)
Given Test set up for "NYL" feature and "NYL_GEOCARE" scenario
Given Customer navigate to NYL "<Website>"
And Select Association as "<Association>"
And Clicks on Apply now button
Then Eligibility page details are displayed to user
And Click on Self
And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
#And Selects radio button for Are you a member of the <Association> as No for Self
And Select NO for Association Membership
And Validate that NEXT button is Disabled
And Select YES Radio button of Membership
And Clicks on next button
Then Product page details are displayed to user
And Clicks on Back or Previous button
And Enter New State as "<State1>"
And Clicks on next button
And Verify that error message is displayed for state eligibility at top of the page
And Enter New State as "<State2>"
And Clicks on next button
Then Product page details are displayed to user
#And Verify Available Product List TLI TenYTL only for self
And Validates that Self is displayed for TermLife
###Hide-And Validates that Self is displayed for TenYTL
And Clicks on Back or Previous button
And Enter New State as "<State>"
And Clicks on next button
Then Product page details are displayed to user
#And Verify Available Product List TLI TenYTL HLAI IHI for self
###Hide-And Validates that Self is displayed at product page for TermLife, TenYTL, HLAI, IHI
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
#And Verify Available Product List TLI TenYTL HLAI DII IHI for self
###Hide-And Validates that Self is displayed at product page for TermLife, TenYTL, HLAI, DII, IHI
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB4>" 
And Clicks on next button
Then Product page details are displayed to user
#And Verify Available Product List TLI TenYTL HLAI IHI for self
###Hide-And Validates that Self is displayed at product page for TermLife, TenYTL, HLAI, IHI
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB5>" 
And Clicks on next button
Then Product page details are displayed to user
#And Verify Available Product List TLI HLAI IHI for self
###Hide-And Validates that Self is displayed at product page for TermLife, HLAI, IHI
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB6>"
And Clicks on next button
Then Product page details are displayed to user
#And Verify Available Product List IHI for self
###Hide-And Validates that Self is displayed at product page for IHI
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB>"
And Clicks on next button

Then Product page details are displayed to user
#And Verify Available Product List TLI TenYTL HLAI DII IHI for self
###Hide-And Validates that Self is displayed at product page for TermLife, TenYTL, HLAI, DII, IHI
#And Selects product TLI TenYTL HLAI DII IHI for Self
And Selects product TermLife for Self
And Selects product TenYTL for Self
And Selects Product HLAI for Self
And Selects product DII for Self
And Selects product InHospitalInsurance for Self

And Clicks on next button

#Then Product: Additional Questions page details are displayed to user and selects Answer as YES for all questions for Self
And Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Self
And Enter additional details as "<TAmount>","<lamount>","<Company>"
#And Verify New York State paragraph is displayed
And Verify New York State paragraph is displayed for Self
And Selects Yes for life insurance applied for intended to replace for Self
#And Enters value"<TAmount>","<lamount>","<Company>" for Self
#And Selects Answer as YES for all questions for Self


#And Selects Yes for Will this disability coverage replace any other company's coverage for Self
And Selects Yes for unable to work because of a disability for Self
And Enters Monthly Income for Self as "<MAmount>"
And Clicks on Add Company Button
#And Enters value"<Company1>","<BAmount>","<BPeriod>"
And Enters details for Company "<Company1>","<BAmount>","<BPeriod>" and click on add button
And Selects Yes for replace any other company's coverage for Self
#And Enters value as "<RAmount>" for Self
And Enters Amount under replace any other company's coverage as "<RAmount>"
#And Enters value"<MAmount>" for Self

And Clicks on next button
And Validate error message for required question
#And Confirms Imp Replacement Info for New York State
And Confirms Imp Replacement Info for NewYork state


And Clicks on next button
Then Request Coverage page is displayed to user
#And Verify Maximum Monthly Benefit Amount for Self is "<MaxBenefit>" under DII
And Validate Maximum Monthly Benefit Amount for DII "<MaxBenefit>"
And Clicks on Back or Previous button
#Then Product: Additional Questions page details are displayed to user
#And Enters value"<MAmount1>" for Self
And Enters Monthly Income for Self as "<MAmount1>"
And Clicks on next button
Then Request Coverage page is displayed to user
#And Verify Maximum Monthly Benefit Amount for Self is <MaxBenefit1> under DII
And Validate Maximum Monthly Benefit Amount for DII "<MaxBenefit1>"
#And Validates under DII the Benefit Slider Range as <RangeMin> to <RangeMax>
And Validates under DisabilityIncomeInsurance the Benefit Slider Range as "<RangeMin>" to "<RangeMax>" for Self

#And Validates under TLI the Benefit Slider Range as <RangeMin1> to <RangeMax1>
And Validates under TermLife the Benefit Slider Range for Self as "<RangeMin1>" to "<RangeMax1>"
#And Selects Type of Coverage as "<TypeofCove>" for Self under TLI
#And Selects Benefit Amount for Self as "<Benefit>" under TLI
And Selects Type of Coverage as "<TypeofCove>" for Self under Term Life
And Selects Benefit Amount for Self as "<Benefit>" under TermLife


#And Validates under TenYTL the Benefit Slider Range as <RangeMin2> to <RangeMax2>
And Validates under TenYTL the Benefit Slider Range as "<RangeMin2>" to "<RangeMax2>" for self
And Selects Type of Coverage as "<TypeofCove>" for Self under TenYTL
And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL

#And Validates under HLAI the Benefit Slider Range as <RangeMin3> to <RangeMax3>
And Validates under HLAI the Benefit Slider Range for Self as "<RangeMin3>" to "<RangeMax3>"
And Selects Type of Coverage as "<TypeofCove>" for Self under HLAI
And Selects Benefit Amount for Self as "<Benefit2>" under HLAI

And Selects Type of Coverage as "<TypeofCove>" for Self under DII
#And Verify Maximum Monthly Benefit Amount for Self is <Benefit3> under DII
And Validate Maximum Monthly Benefit Amount for DII "<Benefit3>"
#And Enters value"<WPeriod>","<PType>" for Self under DII
And Selects Waiting Period for Self as "<WPeriod>" under DII
And Selects Plan Type for Self as "<PType>" under DII
#And Selects Type of Coverage as "<TypeofCove>" for Self under IHI
#And Selects Benefit Amount for Self as "<Benefit4>" under IHI
And Selects Type of Coverage as "<TypeofCove>" for Self under InHospitalInsurance
And Selects Benefit Amount for Self as "<Benefit4>" under InHospitalInsurance
And Clicks on next button

And Clicks on button to Save for later
Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VerifyPass>"
Then Refresh the browser
Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive
#And Clicks OK Button Saved application
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Self under TermLife
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And User Enters Beneficiary details as "<Trust>","<Datetrust>"
And Clicks on OK button
And Click Delete button for first Primary Beneficiary for Self
And Delete box is displayed and clicks on Yes
And Clicks on Add Beneficiary Button for Self under TermLife
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And User Enters Beneficiary details as "<Trust>","<Datetrust>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TermLife
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And User Enters Beneficiary details as "<STrust1>","<SDatetrust1>"
And Clicks on OK button
And Validates error message on Add Beneficiary page-Only one Trust is allowed as Primary
And Clicks on Close button
And Clicks on next button
Then Contact Details page is displayed to user
#And Selects reside outside the U.S. or Canada question as NO for Self
#And Selects Physician Business Address question as No for Self
And Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN_Blank>","<Mstatus>","<Height>","<Weight>","<Gender>","<MemId>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Selects No for Travel Question Non QD for Self
And Selects Business Address Radio Button for Send Correspondence To
And Selects NO Radio Button for Business Address
#And Enters Business Address Details as "<BusinessName>","<BusinessType>","<Bstreet>","<Bcity>","<Bstate>"
And Enters Business Address Details as "<BusinessName>","<BusinessType>"
And Enter Business Address Details as "<Bstreet>","<Bcity>","<Bstate>","<BZipcode>"
And Clicks on next button
And Validates SSN Required Error Message for Self
And Enters SSN "<SSN>" for Self
And Clicks on next button

Then Application Summary Page is displayed to user
And Clicks on next button


#And Verify that Supplemental Health Products note is displayed
And Verify Supplemental Health Note in Authorization Page
#Then Authorization page details are displayed to user
#And confirm the term and conditions for Self
Then Authorize page details are displayed to user and confirm the term and conditions for Self

And Clicks on next button

Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish

Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<Website>"
And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario>","<pdfEnable>","<pdfName>"

Examples:
|Website |Association |Title |Fname |Lname    |State    |DOB                 |DOB1                |DOB2                 |DOB3                |DOB4                |DOB5                |DOB6                |WorkHr|State1 |State2  |TAmount|lamount |Company |Company1 |BAmount |BPeriod |RAmount |MAmount  |MaxBenefit |TypeofCove |RangeMin |RangeMax |MAmount1 |MaxBenefit1 |RangeMin1|RangeMax1|Benefit |RangeMin2 |RangeMax2 |Benefit1|RangeMin3 |RangeMax3|Benefit2 |Benefit3 |WPeriod  |PType                            |Benefit4 |Password |VerifyPass |Trust     |Datetrust  |STrust1    |SDatetrust1 |SSN_Blank|SSN         |Mstatus |Height |Weight |Street      |City |Zipcode |PhoneType |PhoneNum   |BusinessName |BusinessType|Bstreet        |Bcity    |Bstate  |BZipcode |Gender |MemId           |
|GEOCARE |AAPL        |Mr.   |James |Kingston |New York |SYSDate-59Y/11M/29D |SYSDate-16Y/11M/29D |SYSDate-101Y/00M/00D |SYSDate-17Y/00M/00D |SYSDate-60Y/00M/00D |SYSDate-65Y/00M/00D |SYSDate-70Y/00M/00D |60    |Quebec |Vermont |2000   |2000    |JFMA    |MSTP     |5000    |12      |5000    |16300    |9750       |New        |300      |9900     |16500    |9900        |100000   |1000000  |100000  |100000    |1000000   |100000  |50000     |500000   |50000    |9900     |180 days |Plan-1 Two year accident/sickness|100      |Test@123 |Test@123   |GNR TRUST |12/01/2010 |FKTM Corp  |01/01/2010  |         |936-75-4525 |Married |5.5    |200    |12,Lemon rd |ND   |12579   |Home      |4541148484 |Public Corp  |Corporation |New High Street| New city|New York|214053123|Male   |214053123324540 |
   
   
   @GEOCARERegression_3
   Scenario Outline:<GEOCARESC03> Application Submission for Spouse only with all eligible products where GEOCARE association is AEG (Benefitiary as Primary & contingent Individuals and Contingent trust)

Given Test set up for "NYL" feature and "NYL_GEOCARE" scenario
Given Customer navigate to NYL "<Website>"
And Select Association as "<Association>"
And Clicks on Apply now button
Then Eligibility page details are displayed to user
And Click on Spouse
And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
And Select YES Radio button of Membership
And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
And Select radio button Yes for Spouse is Member
And Clicks on next button
Then Product page details are displayed to user
#And Verify Available Product List TLI TenYTL HLAI IHI for spouse
###Hide-And Validates that Spouse is displayed at product page for TermLife, TenYTL, HLAI, IHI
And Clicks on Back or Previous button
And Click on Self
And Enters DOB for Spouse as "<SDOB1>"
And Clicks on next button
#And Verify Spouse icon is missing on Product page
###Hide-And Validates that Spouse is not displayed at product page for TermLife, TenYTL, HLAI, DII, IHI
And Clicks on Back or Previous button
And Enters DOB for Spouse as "<SDOB2>"
And Clicks on next button
#And Verify Spouse icon is missing on Product page
###Hide-And Validates that Spouse is not displayed at product page for TermLife, TenYTL, HLAI, DII, IHI
And Clicks on Back or Previous button
And Enters DOB for Spouse as "<SDOB3>"
And Clicks on next button
Then Product page details are displayed to user
#And Verify Available Product List TLI HLAI IHI for spouse
###Hide-And Validates that Spouse is displayed at product page for TermLife, HLAI, IHI
And Clicks on Back or Previous button
And Enters DOB for Spouse as "<SDOB4>"
And Clicks on next button
Then Product page details are displayed to user
#And Verify Available Product List IHI for spouse
###Hide-And Validates that Spouse is displayed at product page for IHI
And Clicks on Back or Previous button
And Enters DOB for Spouse as "<SDOB>"
And Clicks on next button

Then Product page details are displayed to user
#And Verify Available Product List TLI TenYTL HLAI IHI for Spouse
###Hide-And Validates that Spouse is displayed at product page for TermLife, TenYTL, HLAI, IHI
#And Selects product TLI TenYTL HLAI IHI for Spouse
And Selects product TermLife for Spouse
And Selects product TenYTL for Spouse
And Selects Product HLAI for Spouse
And Selects product InHospitalInsurance for Spouse
And Clicks on next button

Then Click YES for Dependent Coverage information

Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
And Clicks on next button

Then Request Coverage page is displayed to user
#And Validates under TLI the Benefit Slider Range as <SRangeMin> to <SRangeMax> for spouse
###Hide-And Validates under TermLife the Benefit Slider Range for Spouse as "<SRangeMin>" to "<SRangeMax>"
And Selects Type of Coverage as "<TypeofCove>" for Spouse under Term Life
And Selects Benefit Amount for Spouse as "<SBenefit>" under TermLife

#And Validates under TenYTL the Benefit Slider Range as <SRangeMin1> to <SRangeMax1> for spouse
###Hide-And Validates under TenYTL the Benefit Slider Range as "<SRangeMin1>" to "<SRangeMax1>" for Spouse
And Selects Type of Coverage as "<TypeofCove>" for Spouse under TenYTL
And Selects Benefit Amount for Spouse as "<SBenefit1>" under TenYTL

###Hide-And Validates under HLAI the Benefit Slider Range for Spouse as "<SRangeMin2>" to "<SRangeMax2>"
And Selects Type of Coverage as "<TypeofCove>" for Spouse under HLAI
And Selects Benefit Amount for Spouse as "<SBenefit2>" under HLAI

And Selects Type of Coverage as "<TypeofCove>" for Spouse under InHospitalInsurance
And Selects Benefit Amount for Spouse as "<SBenefit3>" under InHospitalInsurance
And Clicks on next button

Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Spouse under TermLife
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<SBfname>","<SBlname>","<SRelationship>","<SPerc>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under TermLife
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<SBfname1>","<SBlname1>","<SRelationship1>","<SPerc1>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under TermLife
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
And User Enters Beneficiary details as "<STrust>","<SDatetrust>"
And Clicks on OK button
And Verify that error message is displayed as trust cannot be added if individual already exists
And Clicks on Close button
And Clicks on next button
#Note: Verification of Error Message as "Beneficiaries must contain exact 100% share."
And Validates error message for Beneficiaries Percentage share
#And Clicks on Edit Beneficiary Button for Spouse under TLI
And Clicks on Edit button of "<PrimaryBen_Sequence1>" Beneficiary for Spouse under TermLife
#Then Add Beneficiary page will be displayed to user
##Note:  User Beneficiary Percentage for Individual Primary
And Enter new Beneficiary Percentage as "<SPerc2>"
And Clicks on OK button

And Clicks on Edit button of "<PrimaryBen_Sequence2>" Beneficiary for Spouse under TermLife
#Then Add Beneficiary page will be displayed to user
And Clicks on OK button
##Note:  User Beneficiary Percentage for Individual Contingent
And Enter new Beneficiary Percentage as "<SPerc3>"
And Clicks on OK button
And Clicks on Skip Beneficiary Button
And Clicks on NO button for skip Beneficiries
And Clicks on next button
Then Contact Details page is displayed to user
And Selects Residential Radio Button
#And Enters contact Details for Male Self as "<SSN_Blank>", "<Mstatus>","<Height>","<Weight>","<Street>","<City>","<Zipcode>","<PhoneType>","<PhoneNum>,"<Gender>"

And Contact Details page is displayed to user and enters contact Details for self as "<SSN>","<Mstatus>","<Gender>","<MemId_Blank>","<Street>","<City>","<Zipcode>"
##Note: Verifying Membership ID is not mandatory for Self by giving membership input as blank
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Selects Residential Radio Button
#And Enters contact Details for Female Spouse as "<SHeight>","<SWeight>","<SPhoneType>","<SPhoneNum>","<SGender>"
And Enters contact Details for Spouse without SSN as "<SHeight>","<SWeight>","<SGender>","<SPhoneType>","<SPhoneNum>"
##Note:  Verifying SSN is not mandatory for Spouse by giving SSN value as Blank
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
And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario>","<pdfEnable>","<pdfName>"


Examples:
|Website |Association |Title |Fname |Lname   |State   |DOB                 |WorkHr|Stitle|Sfname|Slname  |SDOB                 |SDOB1               |SDOB2                |SDOB3               |SDOB4               |SRangeMin|SRangeMax|TypeofCove |SBenefit |SRangeMin1 |SRangeMax1 |SBenefit1 |SRangeMin2 |SRangeMax2  |SBenefit2 |SBenefit3 |SBfname |SBlname |SRelationship |SPerc |SBfname1 |SBlname1 |SRelationship1|SPerc1|STrust      |SDatetrust |PrimaryBen_Sequence1|PrimaryBen_Sequence2|SPerc2 |SPerc3  |SSN       |MemId_Blank|Mstatus   |Street       |City |Zipcode |PhoneType |PhoneNum  |SSSN_Blank|SHeight|SWeight |SPhoneType |SPhoneNum  |Gender|SGender |
|GEOCARE |AEG         |Dr.   |Blake |Jhonson |Florida |SYSDate-17Y/00M/00D |30    |Dr.   |Jenny |Jhonson |SYSDate-64Y/11M/29D  |SYSDate-16Y/11M/29D |SYSDate-101Y/00M/00D |SYSDate-65Y/00M/00D |SYSDate-70Y/00M/00D |100000   |1000000  |New        |100000   |100000     |1000000    |100000    |50000      |250000      |50000     |100       |Dizzy   |Reeds   |Father        |10    |Myles    |Keneddy  |Father        |10    |Dylan Trust |01/01/1970 |     1              |     2              |100    |100     |454114848 |           |Married   |12,Lemon rd  |MT   |12579   |Home      |4541148484|          |5.3    |180     |Home       |3567598484 |Male  |Female  |
 
 
 @GEOCARERegression_4
 Scenario Outline: <GEOCARESC04> Application Submission for Child only with all eligible products where GEOCARE association is AIPG (Maximum number of child)

Given Test set up for "NYL" feature and "NYL_GEOCARE" scenario
Given Customer navigate to NYL "<Website>"
And Select Association as "<Association>"
And Clicks on Apply now button
Then Eligibility page details are displayed to user
And Click on Child
And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
And Select YES Radio button of Membership
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
And Selects Married question as No for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname1>","<Clname1>","<CDOB1>","<Csex1>"
And Selects Married question as No for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname2>","<Clname2>","<CDOB2>","<Csex2>"
And Selects Married question as No for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname3>","<Clname3>","<CDOB3>","<Csex3>"
And Selects Married question as No for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname4>","<Clname4>","<CDOB4>","<Csex4>"
And Selects Married question as No for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname5>","<Clname5>","<CDOB5>","<Csex5>"
And Selects Married question as Yes for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname6>","<Clname6>","<CDOB6>","<Csex6>"
And Selects Married question as Yes for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname7>","<Clname7>","<CDOB7>","<Csex7>"
And Selects Married question as Yes for Child
And Click on Add Child button on Screen
And Validates Add Child Button on Eligibility page is not present
And Clicks on next button
Then Product page details are displayed to user
#And Verify Available Product List TLI TenYTL HLAI IHI for Child
And Validates that Child is displayed at product page for TermLife, TenYTL, HLAI, IHI
#And Selects product TLI TenYTL HLAI IHI for Child
And Selects product TermLife for Child
And Selects product TenYTL for Child
And Selects Product HLAI for Child
And Selects product InHospitalInsurance for Child
And Clicks on next button

#Then Dependent coverage note is displayed to user and selects YES button
Then Click YES for Dependent Coverage information

Then Request Coverage page is displayed to user
And Selects Benefit Amount for Child as "<Cbenefit>" under TermLife
#And Validates Child  "<Cfname1>",   are displayed in eligible children under TLI
And Validates eligible children Names displayed as "<Cfname1>" under TermLife
#And Selects Benefit Amount for Child as <Cbenefit> under TenYTL
#And Validates Child  "<Cfname1>"  are displayed in eligible children under TenYTL
And Validates under TenYTL the Benefit Amounts Listed are: "<Cbenefit>"
And Selects Benefit Amount for Child as "<Cbenefit>" under TenYTL

#And Verify Benefit Amount for Child is <Cbenefit1> under HLAI

#And Selects Type of Coverage as New for Child under IHI
#And Selects Benefit Amount for Child as <Cbenefit2> under IHI
And Selects Type of Coverage as "<TypeofCove>" for Child under InHospitalInsurance
And Selects Benefit Amount for Child as "<Cbenefit2>" under InHospitalInsurance
#And Validates Child  "<Cfname>", "<Cfname1>","<Cfname2>", "<Cfname4>" are displayed in eligible children under IHI
And Validates "<Cfname>","<Cfname1>","<Cfname2>" and "<Cfname4>" are displayed as eligible children under InHospitalInsurance
And Validates Benefit Amount for Child as "<Cbenefit1>" under HLAI displayed in label
#And Validates Child  "<Cfname>", "<Cfname1>", "<Cfname4>"  are displayed in eligible children under HLAI
And Verify that Eligible Child Names under HLAI as "<Cfname>","<Cfname1>","<Cfname4>"
And Clicks on next button

Then Contact Details page is displayed to user
And Selects Residential Radio Button
#And Enters contact Details for Male Self as "<SSN>", "<Mstatus>", "<Street>","<City>","<Zipcode>","<PhoneType>","<PhoneNum>,"<Gender>"
Then Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<Gender>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page		

And Clicks on next button

Then Application Summary Page is displayed to user
And Validates Self as "<Fname>","<Lname>"
And Verify Child name as "<Cfname>","<Clname>"
And Verify Child name as "<Cfname1>","<Clname1>"
And Verify Child name as "<Cfname2>","<Clname2>"
And Verify Child name as "<Cfname4>","<Clname4>"
#And Validates Benefit Amount for Child2 as "<Cbenefit>" under TLI
And Verify Benefit Amount for child "<Cfname1>","<TermLife_SequenceNo_1>" as "<Cbenefit>" under TermLife
#And Validates Benefit Amount for Child2 as "<Cbenefit>" under TenYTL
And Verify Benefit Amount for child "<Cfname1>","<TenYTL_SequenceNo_2>" as "<Cbenefit>" under TenYTL
#And Validates Benefit Amount for Child1 as "<Cbenefit1>" under HLAI
#And Validates Benefit Amount for Child2 as "<Cbenefit1>" under HLAI
And Verify Benefit Amount for Child "<Cfname>","<HLAI_SequenceNo_1>" as "<Cbenefit1>" under HLAI
And Verify Benefit Amount for Child "<Cfname1>","<HLAI_SequenceNo_2>" as "<Cbenefit1>" under HLAI
#And Validates Benefit Amount for Child1 as "<Cbenefit2>" under IHI
#And Validates Benefit Amount for Child2 as "<Cbenefit2>" under IHI
#And Validates Benefit Amount for Child3 as "<Cbenefit2>" under IHI
#And Validates Benefit Amount for Child5 as "<Cbenefit2>" under IHI
And Verify Benefit Amount for Child "<Cfname>","<IHI_SequenceNo_2>" as "<Cbenefit2>" under InHospitalInsurance
And Verify Benefit Amount for Child "<Cfname1>","<IHI_SequenceNo_2>" as "<Cbenefit2>" under InHospitalInsurance
And Verify Benefit Amount for Child "<Cfname2>","<IHI_SequenceNo_2>" as "<Cbenefit2>" under InHospitalInsurance
And Verify Benefit Amount for Child "<Cfname4>","<IHI_SequenceNo_2>" as "<Cbenefit2>" under InHospitalInsurance

And Clicks on next button

#Then Authorization page details are displayed to user
And Validates that Second I understand verbiage is not displayed in Read and Sign Box
And Validates that Authorization message is not displayed in Read and Sign Box
#And Verify that Fraud notice is rendered in Read and Sign text
#And Validates Consent message in Read and Sign Box
#And Verify that Supplemental Health Products note is displayed
And Clicks on next button
#And Verify Error Message is displayed
#And confirm the term and conditions for Self
And Clicks on Submit button

Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish

Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<Website>"
#And Verify Important Notice from PDF "<pdfScenario>","<pdfEnable>","<pdfName>"



Examples:
|Website |Association |Title|Fname |Lname |State    |DOB                 |Cfname |Clname |CDOB                |Csex   |Cfname1 |Clname1 |CDOB1               |Csex   |Cfname2 |Clname2 |CDOB2               |Csex |Cfname3 |Clname3 |CDOB3               |Csex |Cfname4 |Clname4 |CDOB4               |Csex  |Cfname5|Clname5 |CDOB5               |Csex|Cfname6 |Clname6 |CDOB6               |Csex|Cfname7 |Clname7 |CDOB7               |Csex   |WorkHr |Cbenefit |Cbenefit1 |Cbenefit2 |TypeofCove|SSN       |Mstatus |Street      |City |Zipcode |PhoneType |PhoneNum   |Gender|
|GEOCARE |AIPG        |Mr.  |John  |Jones |New York |SYSDate-59Y/11M/29D |Larry  |Jones  |SYSDate-00Y/00M/00D |Female |Marry   |Jones   |SYSDate-00Y/00M/15D |Female |Nick    |Jones   |SYSDate-25Y/00M/00D |Male |Enrique |Jones   |SYSDate-27Y/00M/00D |Male |Ariana  |Jones   |SYSDate-00Y/00M/13D |Female|Perry  |Jones   |SYSDate-24Y/11M/29D |Male|Indiana |Jones   |SYSDate-25Y/00M/00D |Male|Lucy    |Jones   |SYSDate-27Y/00M/00D |Female |20     |5000     |10000     |100       |   New    |115456445 |Married |12,Lemon rd |FLA  |12579   |Home      |3371148484 |Male  |

 
 @GEOCARERegression_5
 Scenario Outline:<GEOCARESC05> Application Submission for Self and Child only with all eligible products where GEOCARE association is COPAS (Benefitiary as maximum Primary Individuals and maximum Contingent individuals number)

Given Test set up for "NYL" feature and "NYL_GEOCARE" scenario
Given Customer navigate to NYL "<Website>"
And Select Association as "<Association>"
And Clicks on Apply now button
Then Eligibility page details are displayed to user
And Click on Self
And Click on Child
And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
And Select YES Radio button of Membership
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
And Selects Married question as No
And Click on Add Child button on Screen
And Clicks on next button

Then Product page details are displayed to user
#And Verify that Product DII is not displayed for Self
And Validate that DII product is not displayed
And Clicks on Back or Previous button
And Enters Self WorkHr as "<WorkHr1>"
And Clicks on next button
Then Product page details are displayed to user
#And Verify that Product DII is displayed for Self
#And Verify Available Product List TLI TenYTL HLAI DII IHI for self
And Validates that Self is displayed at product page for TermLife, TenYTL, HLAI, DII, IHI
#And Verify Available Product List TLI TenYTL HLAI IHI for Child
And Validates that Child is displayed at product page for TermLife, TenYTL, HLAI, IHI
#And Selects product TLI for Self and Child
And Selects product TermLife for Self
And Selects product TermLife for Child
#And Selects product TenYTL for Self and Child
And Selects product TenYTL for Self
And Selects product TenYTL for Child
And Selects Product HLAI for Child
And Selects product DII for Self
And Selects product InHospitalInsurance for Child
And Clicks on next button

Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
####Pending-And Enters value"<MAmount>" for Self

Then Request Coverage page is displayed to user

And Selects Type of Coverage as "<TypeofCove>" for Self under Term Life
And Selects Benefit Amount for Self as "<Benefit>" under TermLife
And Selects Benefit Amount for Child as "<CBenefit>" under TermLife

And Selects Type of Coverage as "<TypeofCove>" for Self under TenYTL
And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL

And Selects Benefit Amount for Child as "<CBenefit1>" under TenYTL

And Selects Type of Coverage as "<TypeofCove>" for Self under HLAI
And Selects Benefit Amount for Self as "<Benefit2>" under HLAI
And Validates Benefit Amount for Child as "<CBenefit2>" under HLAI displayed in label
And Selects Type of Coverage as "<TypeofCove>" for Self under DII
#And Selects Benefit Amount for Self as "<Benefit3>" under DII
And Selects Monthly Benefit Amount for Self as "<Benefit3>" under DII
#And Enters value"<WPeriod>","<PType>" for Self under DII
And Selects Waiting Period for Self as "<WPeriod>" under DII
And Selects Plan Type for Self as "<PType>" under DII
And Selects Type of Coverage as "<TypeofCove>" for Self under InHospitalInsurance
And Selects Benefit Amount for Self as "<Benefit4>" under InHospitalInsurance
And Selects Type of Coverage as "<TypeofCove>" for Child under InHospitalInsurance
And Selects Benefit Amount for Child as "<CBenefit4>" under InHospitalInsurance
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
####Pending-And Verify Error Message is displayed for Maximum Primary beneficiaries
And Clicks on Close button
####Pending-And Clicks on Edit button of "<PrimaryBen_Sequence2>" Beneficiary for Self under TenYTL

#And User Enters Beneficiary details as name and relationship"<Perc5>" for Individual Primary
And Enter new Beneficiary Percentage as "<Perc5>"
And Clicks on OK button

And Clicks on Add Beneficiary Button for Self under TenYTL
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bfname6>","<Blname6>","<Relationship6>","<Perc6>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TenYTL
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bfname7>","<Blname7>","<Relationship7>","<Perc7>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TenYTL
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bfname8>","<Blname8>","<Relationship8>","<Perc8>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TenYTL
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bfname9>","<Blname9>","<Relationship9>","<Perc9>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TenYTL
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bfname10>","<Blname10>","<Relationship10>","<Perc10>"
And Clicks on OK button
####Pending-And Verify Error Message is displayed for Maximum Contingent beneficiaries
####Pending-And Clicks on Edit button of "<PrimaryBen_Sequence2>" Beneficiary for Self under TenYTL
#Then Add Beneficiary page will be displayed to user
#And User Enters Beneficiary details as name and relationship"<Perc11>" for Individual Contingent
And Enter new Beneficiary Percentage as "<Perc11>"



And Clicks on OK button
And Clicks on next button

Then Contact Details page is displayed to user
And Selects No for Travel Question Non QD for Self
And Selects Residential Radio Button
And Selects Yes Radio Button for Business Address
#And Enters contact Details for Male Self as "<SSN>", "<Mstatus>","<Height>","<Weight>","<Street>","<City>","<Zipcode>","<PhoneType>","<PhoneNum>,"<Gender>"
Then Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page		

##NOTE: Verifying Membership ID is not mandatory for Self
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
####Pending-And Verify Important Notice from PDF "<pdfScenario>","<pdfEnable>","<pdfName>"


Examples:
|Website |Association |Title|Fname |Lname  |State   |DOB                 |WorkHr |WorkHr1|Cfname |Clname |CDOB                |Csex|MAmount|TypeofCove |Benefit |CBenefit |Benefit1|CBenefit1 |Benefit2 |CBenefit2 |Benefit3|Benefit4 |CBenefit4 |WPeriod |PType |Bfname |Blname |Relationship |Perc |Bfname1 |Blname1 |Relationship1 |Perc1 |Bfname2 |Blname2|Relationship2 |Perc2 |Bfname3 |Blname3 |Relationship3 |Perc3 |Bfname4 |Blname4 |Relationship4 |Perc4 |Perc5 |Bfname6 |Blname6 |Relationship6 |Perc6 |Bfname7|Blname7|Relationship7 |Perc7 |Bfname8 |Blname8 |Relationship8 |Perc8 |Bfname9 |Blname9 |Relationship9 |Perc9 |Bfname10 |Blname10 |Relationship10 |Perc10 |Perc11 |TypeofCove |SSN       |Mstatus |Height |Weight |Street      |City |Zipcode |PhoneType |PhoneNum   |BusinessName |BusinessType |Gender |
|GEOCARE |COPAS       |Dr.  |Jose  |Jordan |Georgia |SYSDate-17Y/00M/00D |19     |20     |Sammy  |Jordan |SYSDate-00Y/00M/15D |Male|17000  |New        |170000  |5000     |220000  |5000      |100000   |10000     |1200    |125      |125       |60 days |Plan-3|George |Rose   |Other        |10   |Ron     |Weasley |Father        |10    |Jon     |Smith  |Spouse        |10    |John    |Potter  |Father        |10    |Larry   |Johnson |Mother        |10    |70    |Marry   |Jane    |Daughter      |10    |Kim    |Jane   |Daughter      |10    |Mark    |Jane    |Son           |10    |Jenny   |Keith   |Other         |10    |Jackob   |Khan     |Father         |10     |70     |New        |859624239 |Married |5.5    |200    |12,Lemon rd |MI   |22079   |Home      |4594584506 |Sun Corp     |Corporation  |Male   |
  
  @GEOCARERegression_6
  Scenario Outline:<GEOCARESC06> Validation Read & Sign Page with 18 different States one by one in loop with self only and GEOCARE association is GSW
(All Validations done on Authorization and Consent Page) (No beneficiary)

Given Test set up for "NYL" feature and "NYL_GEOCARE" scenario
Given Customer navigate to NYL "<Website>"
And Select Association as "<Association>"
And Clicks on Apply now button
Then Eligibility page details are displayed to user
And Click on Self
And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
And Select YES Radio button of Membership
And Clicks on next button

Then Product page details are displayed to user
#And Selects product TLI for Self
And Selects product TermLife for Self
And Clicks on next button

Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
And Clicks on next button

Then Request Coverage page is displayed to user

And Selects Type of Coverage as "<TypeofCove>" for Self under Term Life
And Selects Benefit Amount for Self as "<Benefit>" under TermLife
And Clicks on next button

Then Beneficiary Page is displayed to user
And Clicks on Skip Beneficiary Button

Then Contact Details page is displayed to user
And Selects No for Travel Question Non QD for Self
And Selects Yes Radio Button for Business Address
#And Enters contact Details for Male Self as "<SSN>", "<Mstatus>","<Height>","<Weight>", "<Street>","<City>","<Zipcode>","<PhoneType>","<PhoneNum>,"<Gender>"
Then Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender>","<Street>","<City>","<Zipcode>"
And Enters Business Address Details as "<BusinessName>","<BusinessType>"
And Clicks on next button

Then Application Summary Page is displayed to user
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
And Validate Fraud Notice LA in Read and Sign Box
And Navigate back to Eligibility page
And Enter New State as "<State6>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate Fraud Notice PA in Read and Sign Box
And Navigate back to Eligibility page
And Enter New State as "<State7>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate Fraud Notice RI in Read and Sign Box
And Navigate back to Eligibility page
And Enter New State as "<State8>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate Fraud Notice MD in Read and Sign Box
And Navigate back to Eligibility page
And Enter New State as "<State9>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate Fraud Notice DC in Read and Sign Box
And Navigate back to Eligibility page
And Enter New State as "<State10>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate Fraud Notice FL in Read and Sign Box
And Navigate back to Eligibility page
And Enter New State as "<State11>"
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
And Enter New State as "<State12>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate Fraud Notice ME in Read and Sign Box
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
And Validate Fraud Notice NJ in Read and Sign Box
And Navigate back to Eligibility page
And Enter New State as "<State14>"
And Clicks on next button
And Clicks on next button
And Confirms Imp Replacement Info for NewYork state
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
#And Validate Fraud Notice is not displayed for NY in Read and Sign Box
And Verify that fraud notice is not rendered at Authorization page
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
And Validate Fraud Notice OK in Read and Sign Box
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
And Validate Fraud Notice PR in Read and Sign Box
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
And Validate Fraud Notice TN in Read and Sign Box
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
And Validate Fraud Notice WA in Read and Sign Box
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
And Validate Fraud Notice VA in Read and Sign Box
#And Clicks on IMPORTANT NOTICE in the Consent message in Read and Sign Box
#And Verify PDF as Important Notice
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
And Clicks on next button
And Validate Fraud Notice NM in Read and Sign Box
#And Clicks on IMPORTANT NOTICE in the Consent message in Read and Sign Box
#And Verify PDF as Important Notice New Mexico
And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario>","<pdfEnable>","<pdfName>"
And Navigate back to Eligibility page
And Enter New State as "<State21>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validates Authorization Message MN in Read and Sign Box
And Navigate back to Eligibility page
And Clicks on next button
And Deselects product TermLife for Self
And Selects Product HLAI for Self
And Clicks on next button
Then Request Coverage page is displayed to user
And Selects Type of Coverage as "<TypeofCove>" for Spouse under HLAI
And Selects Benefit Amount for Spouse as "<Benefit1>" under HLAI
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
#Then Authorization page details are displayed to user
And Validates that Second I understand verbiage is not displayed in Read and Sign Box
And Validates Consent message in Read and Sign Box for NonUW



Examples:
|Website |Association |Title |Fname    |Lname    |State      |DOB                 |WorkHr |MAmount |TypeofCove          |Benefit  |SSN         |Mstatus |Height |Weight|Street       |City |Zipcode |PhoneType |PhoneNum   |BusinessName |BusinessType |State1  |State2     |State3  |State4   |State5    |State6       |State7       |State8   |State9               |State10 |State11 |State12 |State13    |State14  |State15  |State16     |State17  |State18    |State19  |State20    |State21   |TypeofCove |Gender |Benefit1|
|GEOCARE |GSW         |Prof. |Jonathan |Marshall |Connecticut|SYSDate-17Y/00M/00D |20     |16500   |Change in Coverage  |1000000  |568-74-4545 |Married |5.10   |210   |#$11,Bant rd |GA   |36525   |Home       |5892354101|Public Corp  |Corporation  |Colorado|California |Alabama |Arkansas |Louisiana |Pennsylvania |Rhode Island |Maryland |District of Columbia |Florida |Kansas  |Maine   |New Jersey |New York |Oklahoma |Puerto Rico |Tennessee|Washington |Virginia |New Mexico |Minnesota |New        |Male   |50000   |
    