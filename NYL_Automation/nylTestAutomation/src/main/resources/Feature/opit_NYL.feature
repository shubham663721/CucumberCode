Feature: OPIT Test

@OpitRegression_1
Scenario Outline: <SC01> Application submission for Self, Spouse and Child and with all the products and rider(s)Beneficiaries- Maximum (Under ARTL for Spouse - 1 Prim Trust, 4 Cont Ind)(Under TenYTL fro Self - 4 Prim Ind, 1 Cont Trust)


Given Test set up for "NYL" feature and "NYL_OPIT" scenario
Given Customer navigate to NYL "<website>"
And Selects Association as "<Association>" at HomePage
When Clicks on Apply now button
Then Eligibility page details are displayed to user 
And Select NO for Association Membership
And Validate that NEXT button is Disabled
And Select YES Radio button of Membership
And Validate that NEXT button is Enabled
And Click on Self
And Click on Spouse  
And Click on Child
And Enter eligibility details for Self as "<Title>", "<Fname>", "<Lname>", "<DOB>", "<WorkHr>"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
And Select radio button Yes for Spouse is Member
And Enters Eligibility details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>","<SWorkHr>"
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<CGender>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Clicks on next button
And Verify that error message is displayed for state eligibility at top of the page
And Enter New State as "<State>"
And Enters DOB for Self as "<DOB1>" 
And Enters DOB for Spouse as "<SDOB1>"
And Clicks Edit button for Child Added
And Enters DOB for Child as "<CDOB1>"
And Click on Add Child button on Screen
And Clicks on next button
And Validate Age Restriction Message
And Enters DOB for Self as "<DOB>" 
And Enters DOB for Spouse as "<SDOB>"
And Clicks Edit button for Child Added
And Enters DOB for Child as "<CDOB>"
And Click on Add Child button on Screen
And Enters Self WorkHr as "<WorkHr1>"
And Enters Spouse WorkHr as "<SWorkHr1>"
And Clicks on next button
Then Product page details are displayed to user
And Verify Available Product List ARTL,TenYTL
And Clicks on Back or Previous button
And Enters Self WorkHr as "<WorkHr>"
And Enters Spouse WorkHr as "<SWorkHr>"
And Clicks on next button 
And Verify Available Product List ARTL,TenYTL,AOD,DIP,BOE
And Selects product ARTL for Self
And Selects product ARTL for Spouse
And Selects product ARTL for Child
And Selects product TenYTL for Self
And Selects product TenYTL for Spouse
And Selects product AOD for Self
And Selects product AOD for Spouse
And Selects product DIP for Self
And Selects product BOE for Self
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Self
And Enter additional details as "<TotalAmt>","<PAmount>","<PCompany>"
Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Spouse
And Enter additional details as "<STotalAmt>","<SPAmount>","<SPCompany>" for Spouse
And Enters Monthly Income for Self as "<MonthlyIncome>"
And Selects Yes for unable to work because of a disability for Self
And Clicks on Add Company Button
And Enters details for Company "<CCompany>","<CBenAmt>","<CBenPer>" and click on add button
And Selects Yes for replace any other company's coverage for Self
And Enters Amount under replace any other company's coverage as "<RAmt>"
And Enters details for Monthly Expense and Percentage Responsible as "<BussExp>","<BussExpPer>"
And Selects Yes for applying for any other business/office overhead insurance
And Clicks on Add Company button for overhead products
And Enters details for Company "<CCompany1>","<CBenAmt1>","<CBenPer1>" and click on add button
And Selects Yes for replace any other company's coverage for Self for overhead disability
And Enters Amount under replace any other company's coverage of overhead product as "<ReplaceAmt>"
And Enters Monthly Income as "<SMonthlyIncome>" for Spouse
And Selects Yes for unable to work because of a disability for Spouse
And Clicks on Add Company Button for Spouse
And Enters details for Company "<SCCompany>","<SCBenAmt>","<SCBenPer>" and click on add button
And Selects Yes for replace any other company's coverage for Spouse for overhead disability
And Enters Amount under replace any other company's coverage as "<SRAmt>" for Spouse for overhead disability
And Clicks on next button
Then Request Coverage page is displayed to user
And Selects Type of Coverage as "<TypeofCove>" under ARTL for Self
And Verify Type of Coverage Change in coverage is unavailable under ARTL for Spouse
And Selects Type of Coverage as "<TypeofCove1>" under ARTL for Self
And Verify Type of Coverage Change in coverage is available under ARTL for Spouse
And Selects Type of Coverage as "<TypeofCove>" under ARTL for Spouse
And Validates under ARTL for Self the Benefit Slider Range as "<Min_ARTL>" to "<Max_ARTL>" 
And Selects Benefit Amount for Self as "<Benefit>" under ARTL
And Validates under ARTL the Benefit Slider Range for Spouse as "<SMin_ARTL>" to "<SMax_ARTL>" 
And Selects Benefit Amount for Spouse as "<SBenefit>" under ARTL
And Selects Optional AD&D Rider under ARTL for Self
And Selects AD&D checkbox for Spouse under ARTL
And Selects Type of Coverage as "<TypeofCove>" for AD&D rider under ARTL for Self
And Verify Type of Coverage Change in coverage is unavailable for AD&D under ARTL for Spouse
And Selects Type of Coverage as "<TypeofCove1>" for AD&D rider under ARTL for Self
And Verify Type of Coverage Change in coverage is Available under AD&D under ARTL for Spouse
And Selects Type of Coverage as "<TypeofCove1>" for AD&D rider under ARTL for Spouse
And Validates under ARTL the AD&D Rider Benefit Slider Range for Self as "<Min_AD&D>" to "<Max_AD&D>" 
And Selects Rider Benefit Amount under ARTL for Self as "<Benefit1>"
And Validates Benefit Slider Range for AD&D rider under ARTL for Spouse as "<SMin_AD&D>" to "<SMax_AD&D>" 
And Selects Benefit Amount for Spouse as "<SBenefit1>" for AD&D under ARTL 
And Selects Benefit Amount for Child as "<CBenefit>" under ARTL
And Selects Type of Coverage as "<TypeofCove>" for Self under TenYTL
And Verify Type of Coverage Change in coverage is unavailable under TenYTL for Spouse
And Selects Type of Coverage as "<TypeofCove1>" for Self under TenYTL
And Verify Type of Coverage Change in coverage is available under TenYTL for Spouse
And Selects Type of Coverage as "<TypeofCove>" for Spouse under TenYTL
And Validates under TenYTL the Benefit Slider Range as "<Min_TenYTL>" to "<Max_TenYTL>" for self 
And Selects Benefit Amount for Self as "<Benefit2>" under TenYTL
And Validates under TenYTL the Benefit Slider Range as "<SMin_TenYTL>" to "<SMax_TenYTL>" for Spouse
And Selects Benefit Amount for Spouse as "<SBenefit2>" under TenYTL
And Selects Type of Coverage as "<TypeofCove>" under AOD for Self
And Verify Type of Coverage Change in coverage is unavailable under AOD for Spouse
And Selects Type of Coverage as "<TypeofCove1>" under AOD for Self
And Verify Type of Coverage Change in coverage is available under AOD for Spouse
And Validates under AOD the Benefit Slider Range as "<Min_AOD>" to "<Max_AOD>" for self 
And Selects Benefit Amount for Self as "<Benefit3>" under AOD
And Validate Waiting Period dropdown values for Self as "<WPeriod1>", "<WPeriod2>" under AOD
And Selects Waiting Period for Self as "<WaitP>" under AOD
And Selects Benefit Duration for Self as "<BenDur>" under AOD
And Selects Type of Coverage as "<TypeofCove>" under AOD for Spouse
And Validates under AOD the Benefit Slider Range as "<SMin_AOD>" to "<SMax_AOD>" for Spouse
And Selects Benefit Amount for Spouse as "<SBenefit3>" under AOD
And Validate Waiting Period dropdown values for Spouse as "<WPeriod1>", "<WPeriod2>" under AOD
And Selects Waiting Period for Spouse as "<SWaitP>" under AOD
And Selects Benefit Duration for Spouse as "<SBenDur>" under AOD
And Selects Type of Coverage as "<TypeofCove>" for Self under DIP 
And Validates under DIP the Benefit Slider Range as "<Min_DIP>" to "<Max_DIP>" for Self
And Selects Benefit Amount for Self as "<Benefit4>" under DIP
And Validate Waiting Period dropdown values for Self as "<WPeriod1>", "<WPeriod2>", "<WPeriod3>", "<WPeriod4>", "<WPeriod5>" under DIP
And Selects Waiting Period for Self as "<WaitP1>" under DIP
And Validate Benefit Duration dropdown values for Self as "<BenDuration1>", "<BenDuration2>" under DIP
And Selects Benefit Duration for Self as "<BenDur1>" under DIP
And Selects Accidental Death and Dismemberment checkbox for Self under DIP
And Validates for ADND under DIP the Benefit Slider Range as "<Min_ADND>" to "<Max_ADND>" for Self 
And Selects Benefit Amount for Self as "<Benefit5>" for ADND under DIP 
And Selects Recovery Option checkbox for Self under DIP
And Selects Residual Disability Benefit checkbox for Self under DIP
And Selects Cost of Living Adjustment Benefit checkbox for Self under DIP
And Selects Hospital Indemnity Protection checkbox for Self under DIP
And Validate amount for Hospital Indemnity Protection for Self from dropdown as "<HIPAmount>","<HIPAmount1>","<HIPAmount2>","<HIPAmount3>" under DIP
And Selects amount for Hospital Indemnity Protection for Self as "<HIPAmount>" under DIP
And Selects Type of Coverage as "<TypeofCove>" for Self under BOE
And Validates under BOE the Benefit Slider Range for Self as "<Min_BOE>" to "<Max_BOE>" 
And Selects Benefit Amount for Self as "<Benefit6>" under BOE
And Validate dropdown values of Waiting Period for Self as "<WaitP2>" under BOE
And Selects Wait Period for Self as "<WaitP2>" under BOE
And Validate Benefit Duration dropdown values for Self as "<BenDur2>" under BOE
And Selects Benefit Duration for Self as "<BenDur2>" under BOE
And Selects Guaranteed Purchase Option checkbox for Self under BOE
And Selects Recovery Option checkbox for Self under BOE
And Selects Retroactive checkbox for Self under BOE
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Spouse under ARTL
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And User Enters Beneficiary details as "<Tname>","<DateTrust>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under ARTL
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relation>","<Perc>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under ARTL
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bfname1>","<Blname1>","<Relation1>","<Perc1>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under ARTL
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bfname2>","<Blname2>","<Relation2>","<Perc2>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under ARTL
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bfname3>","<Blname3>","<Relation3>","<Perc3>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TenYTL
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
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
And User Enters Beneficiary details as "<STname>","<SDateTrust>" 
And Clicks on OK button
And Clicks on next button
Then Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<Phone>" for Self at contact page
##
And Selects Residential Radio Button
And Validate the Travel Question for Non QD application for Self
And Selects Yes for Travel Question Non QD for Self 
And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>"
And Selects Yes Radio Button for Business Address
And Enters Business Details as "<BusinessName>","<BusinessType>"
And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<SGender>","<SPhoneType>","<SPhoneNum>"
##
And Validate the Travel Question for Non QD application for Spouse
And Selects Yes for Travel Question Non QD for Spouse
And Enters details for Spouse as "<SCountry>","<SMonths>"
And Clicks on next button
And Validates Membership ID Required Message
And Enters Membership ID as "<MemId>" for Self
And Clicks on next button
Then Application Summary Page is displayed to user 
And Verify Benefit Amount for Self as "<Benefit>" under ARTL
And Verify Benefit Amount for Spouse as "<SBenefit>" under ARTL
And Verify Benefit Amount for Self as "<Benefit1>" under AD&D under ARTL
And Verify Benefit Amount for Spouse as "<SBenefit1>" under AD&D under ARTL 
And Verify Benefit Amount for Child as "<CBenefit>" under ARTL
And Verify Benefit Amount for Self as "<Benefit2>" under TenYTL
And Verify Benefit Amount for Spouse as "<SBenefit2>" under TenYTL
And Verify Benefit Amount for Self as "<Benefit3>" under AOD
And Verify Benefit Amount for Spouse as "<SBenefit3>" under AOD
And Verify Benefit Amount for Self as "<Benefit4>" under DIP
And Verify Benefit Amount for Self as "<Benefit6>" under BOE
And Verify Guaranteed Purchase Option as Yes for Self under BOE
And Verify Recovery Option as Yes for Self under BOE
And Verify Retroactive as Yes for Self under BOE
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
|website |Association                  |Title|Fname|Lname|State1  |State    |DOB        |DOB1       |SDOB1      |WorkHr1 |SWorkHr1|WorkHr |Stitle |Sfname|Slname|SDOB      |SWorkHr|Cfname |Clname |CDOB      |CDOB1     |CGender|TotalAmt|PAmount|PCompany   |STotalAmt|SPAmount|SPCompany  |MonthlyIncome |CCompany   |CBenAmt|CBenPer|RAmt |BussExp |BussExpPer|CCompany1  |CBenAmt1|CBenPer1 |ReplaceAmt|SMonthlyIncome|SCCompany   |SCBenAmt |SCBenPer |SRAmt |Min_ARTL|Max_ARTL |Benefit|SMin_ARTL |SMax_ARTL|SBenefit|Min_AD&D|Max_AD&D|Benefit1|SMin_AD&D|SMax_AD&D|SBenefit1|CBenefit|Min_TenYTL|Max_TenYTL|Benefit2|SMin_TenYTL|SMax_TenYTL|SBenefit2 |Min_AOD|Max_AOD |Benefit3|SMin_AOD|SMax_AOD|SBenefit3|WaitP  |BenDur  |SWaitP  |SBenDur |Min_DIP |Min_DIP |Benefit4 |WaitP1  |BenDur1 |Min_ADND|Max_ADND|Benefit5 |HIPAmount |HIPAmount1|HIPAmount2|HIPAmount3|Min_BOE|Max_BOE |Benefit6|WaitP2  |BenDur2 |Tname |DateTrust |Bfname |Blname |Relation |Perc|Bfname1|Blname1 |Relation1|Perc1|Bfname2 |Blname2 |Relation2|Perc2|Bfname3 |Blname3|Relation3 |Perc3 |Perc4 |Perc5 |Perc6|Perc7|STname    |SDateTrust |SSN         |Mstatus |Gender|MemId           |Height |Weight |Street    |City       |Zipcode|PhoneType|Phone     |BusinessName |BusinessType|SSSN      |SHeight |SWeight |SGender |SPhoneType |SPhoneNum  |Country|Months |SCountry |SMonths|TypeofCove|TypeofCove1       |WPeriod1|WPeriod2|WPeriod3|WPeriod4|WPeriod5|BenDuration1|BenDuration2|BeneType|
|opit    |Oklahoma Bar Association |Mr.  |Adam |Gill |New York|Oklahoma |08/01/2001 |01/15/2002 |05/15/2002 |15      |29      |31     |Mrs.   |Bella |Gill  |10/15/2001|30     |John   |Gill   |11/15/1998|11/15/1997|Male   |20,000  |2,000  |MNC Company|35,000   |1,000   |New Company|10,000        |XYZ Company|1000   |11     |1000 |150000  |99        |LMN Company|2000    |10       |1000      |14000         |Wow Company |2500     |1         |1500 |$25,000 |$500,000 |25000  |$25,000   |$500,000 |25000   |25000   |100,000 |25000   |25000    |100,000  |25000    |5000    |50,0000   |1,000,000 |50,000  |50,000     |1,000,000  |50,000    |1000   |3000    |1000    |1000    |3000    |1000     |30 Days|2 Years |60 Days |2 Years |200     |7000    |200      |365 Days|5-2 Plan|2000    |100,000 |2000     |$50       |$100      |$150      |$200      |$500   |$15,000 |500     |30 Days |24 Months |BOA |10/11/2017|Mia    |Gill   |Daughter |20  |Sarah  |Gill    |Daughter |20   |Rose    |Gill    |Mother   |30   |James   |Gill   |Father    |30    |50    |20    |20   |10   |MNC Trust |01/02/2018 |741-25-8963 |Married |Male  |545345343543543 |5.0    |188    |1 main st |HORSEHEADS |14845  |Mobile   |1234567890 |Gill company|Corporation |266464546 |5.9     |190     |Female  |Home       |0123456789 |Nepal  |7      |Cuba     |8      |New       |Change in Coverage|30 Days |60 Days |90 Days |180 Days|365 Days|65/65 Plan  | 5-2 Plan   |Primary |

@OpitRegression_2
Scenario Outline: <SC02> Application submission for Self, Spouse with TenYTL  Beneficiaries - (Under TenYTL for Self & Spouse) Primary Trust


Given Test set up for "NYL" feature and "NYL_OPIT" scenario
Given Customer navigate to NYL "<website>"
And Selects Association as "<Association>" at HomePage
When Clicks on Apply now button
Then Eligibility page details are displayed to user 
And Click on Self
And Click on Spouse
And Enter eligibility details for Self as "<Title>", "<Fname>", "<Lname>", "<DOB1>", "<WorkHr>"   
And Select YES Radio button of Membership 
And Enters Eligibility details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB1>","<SWorkHr>"
And Select radio button NO for Spouse is Member
And Clicks on next button
And Validate Age Restriction Message
And Enters DOB for Self as "<DOB>" 
And Enters DOB for Spouse as "<SDOB>"
And Clicks on next button
Then Product page details are displayed to user
And Verify Available Product List ARTL,TenYTL,AOD
And Selects product TenYTL for Self
And Selects product TenYTL for Spouse
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
And Clicks on next button
Then Request Coverage page is displayed to user 
And Selects Type of Coverage as "<TypeofCove>" for Self under TenYTL
And Validates under TenYTL the Benefit Slider Range as "<Min_TenYTL>" to "<Max_TenYTL>" for self
And Selects Benefit Amount for Self as "<Benefit>" under TenYTL
And Selects Type of Coverage as "<TypeofCove>" for Spouse under TenYTL
And Validates under TenYTL the Benefit Slider Range as "<SMin_TenYTL>" to "<SMax_TenYTL>" for Spouse 
And Selects Benefit Amount for Spouse as "<SBenefit1>" under TenYTL
And Clicks on next button
And Verify Error Message in Spouse section for TenYTL
And Selects Benefit Amount for Spouse as "<SBenefit>" under TenYTL
And Clicks on next button 
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Self under TenYTL
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And User Enters Beneficiary details as "<Tname>","<DateTrust>"
And Clicks on OK button
And Verify that the Percent Displayed for Trust is "<TrustPercent>"
And Clicks on Add Beneficiary Button for Spouse under TenYTL
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And Selects the First Option from Existing Beneficiaries List and select Type as "<benType>"
And Clicks on OK button
And Clicks on next button
Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender>","<MemId>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<Phone>" for Self at contact page
And Validate the Travel Question for Non QD application for Self
And Selects No for Travel Question Non QD for Self  
And Verify Tobacco Question is Unavailable for Self
And Selects Residential Radio Button
And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<SGender>","<SPhoneType>","<SPhoneNum>" 
And Validate the Travel Question for Non QD application for Spouse
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
And Verify that Confirmation number is generated for "<website>"

Examples:
|website|Association                                     |Title|Fname|Lname|DOB        |DOB1       |SDOB1      |WorkHr |State   |Stitle |Sfname|Slname|SDOB       |SWorkHr |Min_TenYTL |Max_TenYTL |Benefit |SMin_TenYTL |SMax_TenYTL |SBenefit |SBenefit1 |Tname     |DateTrust |TrustPercent |SSN         |Mstatus |Gender|MemId          |Height|Weight |Street              |City       |Zipcode|PhoneType|Phone     |SSSN        |SHeight |SWeight |SGender |SPhoneType|SPhoneNum|TypeofCove|benType|
|opit   |Association of Oklahoma Nurse Practitioners|Mr.  |Adam |Gill |08/01/1985 |01/15/1953 |05/15/1953 |31     |Oklahoma|Mrs.   |Bella |Gill  |10/15/1975 |30      |$50,000    |$1,000,000 |800,000 |$50,000     |$1,000,000  |$800,000 |$1,000,000|New Trust |01/19/2017 |100 %       |741-25-8963 |Married |Male  |545345343543543 |5.10 |188    |531 Hahaione St #3C |HORSEHEADS |14845  |Mobile   |1234567890|266-46-4546 |5.5     |140     |Female  |Home      |0123456789|New      |Primary| 


@OpitRegression_3
Scenario Outline: <SC03> Application submission for Child only with TenYTL Add Max Children - Married Child, Full Time Student Beneficiaries - NO


Given Test set up for "NYL" feature and "NYL_OPIT" scenario
Given Customer navigate to NYL "<website>"
And Selects Association as "<Association>" at HomePage
When Clicks on Apply now button
Then Eligibility page details are displayed to user 
And Click on Child
And Enter eligibility details for Self as "<Title>", "<Fname>", "<Lname>", "<DOB>", "<WorkHr>" 
And Select YES Radio button of Membership
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname1>","<Clname1>","<CDOB1>","<CGender1>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname2>","<Clname2>","<CDOB2>","<CGender2>"
And Selects Married question as No for Child
And Selects No for full time student for Child
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
And Selects Married question as Yes for Child
And Selects Yes for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname6>","<Clname6>","<CDOB6>","<CGender6>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname7>","<Clname7>","<CDOB7>","<CGender7>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname8>","<Clname8>","<CDOB8>","<CGender8>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Validates Add Child Button on Eligibility page is not present
And Clicks on next button
Then Product page details are displayed to user
And Verify Available Product List ARTL,TenYTL
And Clicks on next button
And Validate Error Message on Product Page
And Selects product TenYTL for Child
And Clicks on next button
Then Click YES for Dependent Coverage information
Then Request Coverage page is displayed to user 
And Validates "<Cfname1>","<Cfname3>","<Cfname5>" and "<Cfname7>" are not displayed in eligible children under TenYTL
And Validates under TenYTL the Benefit Amounts Listed are: "<Cbenefit>"
And Selects Benefit Amount for Child as "<Cbenefit>" under TenYTL
And Clicks on next button
Then Contact Details page is displayed to user and enters contact Details for self as "<SSN>","<Mstatus>","<Gender>","<MemId>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<Phone>" for Self at contact page 
And Selects Residential Radio Button
And Clicks on next button
Then Application Summary Page is displayed to user 
And Verify Child name as "<Cfname2>","<Clname2>"
And Verify Benefit Amount for child "<Cfname2>","<TenYTL_SequenceNo>" as "<Cbenefit>" under TenYTL
And Verify Child name as "<Cfname4>","<Clname4>"
And Verify Benefit Amount for child "<Cfname4>","<TenYTL_SequenceNo1>" as "<Cbenefit>" under TenYTL
And Verify Child name as "<Cfname6>","<Clname6>"
And Verify Benefit Amount for child "<Cfname6>","<TenYTL_SequenceNo2>" as "<Cbenefit>" under TenYTL
And Verify Child name as "<Cfname8>","<Clname8>"
And Verify Benefit Amount for child "<Cfname8>","<TenYTL_SequenceNo2>" as "<Cbenefit>" under TenYTL
And Clicks on next button
Then Authorize page details are displayed to user
And Validates that Authorization message is not displayed in Read and Sign Box
And Validates Consent message in Read and Sign Box for NonUW
And Validate Fraud Notice OK in Read and Sign Box
Then Authorize page details are displayed to user and confirm the term and conditions for Self
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"

Examples:
|website|Association                                      |Title|Fname|Lname|DOB        |WorkHr|Cfname1|Clname1|CDOB1      |CGender1|Cfname2|Clname2|CDOB2      |CGender2|Cfname3|Clname3 |CDOB3    |CGender3|Cfname4|Clname4 |CDOB4     |CGender4|Cfname5|Clname5|CDOB5     |CGender5 |Cfname6|Clname6|CDOB6     |CGender6|Cfname7 |Clname7 |CDOB7      |CGender7|Cfname8 |Clname8|CDOB8      |CGender8|Cbenefit|SSN        |Mstatus |Gender|MemId           |Street    |City       |Zipcode|PhoneType|Phone      |TenYTL_SequenceNo|TenYTL_SequenceNo1|TenYTL_SequenceNo2|TenYTL_SequenceNo3|
|opit   |Association of Oklahoma Nurse Practitioners |Mr.  |Adam |Gill |08/01/1985 |45    |John   |Gill   |01/02/1997 |Male    |Jack   |Gill   |CurrentDate|Male    |Bella  |Gill    |01/20/1997|Female  |Mary   |Gill    |11/20/1998|Female  |Brett  |Gill   |11/20/1998|Male     |Mark   |Gill   |11/20/1998|Male    |Anne    |Gill    |04/10/1997 |Female  |Judy    |Gill   |CurrentDate|Female  |$5,000  |741-25-8963 |Married|Male  |545345343543543 |1 main st |HORSEHEADS |14845  |Mobile   |1234567890 |1               |2                |3                  |4               |

@OpitRegression_4
Scenario Outline: <SC04> Application submission for Self and Child with ARTL Beneficiaries (Under ARTL for Self)- 2 Primary Individuals, Contingent Trust


Given Test set up for "NYL" feature and "NYL_OPIT" scenario
Given Customer navigate to NYL "<website>"
And Selects Association as "<Association>" at HomePage
When Clicks on Apply now button
Then Eligibility page details are displayed to user 
And Select NO for Association Membership
And Validate that NEXT button is Disabled
And Select YES Radio button of Membership
And Validate that NEXT button is Enabled
And Click on Self
And Click on Child
And Enter eligibility details for Self as "<Title>", "<Fname>", "<Lname>", "<DOB1>", "<WorkHr>"
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<CGender>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Clicks on next button
Then Product page details are displayed to user
And Verify Available Product List TenYTL,AOD
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB>"
And Clicks Edit button for Child Added
And Selects Yes for full time student for Child
And Click on Add Child button on Screen
And Clicks on next button
And Verify Available Product List ARTL,TenYTL,AOD
And Selects product ARTL for Child
And Selects product ARTL for Self
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
And Clicks on next button
Then Request Coverage page is displayed to user 
And Selects Type of Coverage as "<TypeofCove1>" under ARTL for Self
And Validates under ARTL for Self the Benefit Slider Range as "<Min_ARTL>" to "<Max_ARTL>" 
And Selects Benefit Amount for Self as "<Benefit>" under ARTL
And Selects Benefit Amount for Child as "<CBenefit>" under ARTL
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Self under ARTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relation>","<Perc>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under ARTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname1>","<Blname1>","<Relation1>","<Perc1>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under ARTL
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
And User Enters Beneficiary details as "<Tname>","<DateTrust>"
And Clicks on OK button
And Clicks on next button
##Then Contact Details page is displayed and Validates Height and Weight is displayed for Self
Then Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<Phone>" for Self at contact page 
And Verify Tobacco Question is Unavailable for Self
And Validate the Travel Question for Non QD application for Self
And Selects Yes for Travel Question Non QD for Self 
And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>"
And Selects Residential Radio Button
And Clicks on next button
And Validates Membership ID Required Message
And Enters Membership ID as "<MemId>" for Self
And Clicks on next button
Then Application Summary Page is displayed to user 
And Clicks on next button
Then Authorize page details are displayed to user and confirm the term and conditions for Self
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"

Examples:
|website |Association                     |Title|Fname|Lname|DOB        |State   |DOB1       |WorkHr |Cfname |Clname |CDOB       |CGender |Min_ARTL|Max_ARTL  |Benefit |CBenefit|Bfname|Blname|Relation |Perc|Bfname1|Blname1|Relation1|Perc1 |Tname     |DateTrust  |SSN         |Mstatus |Gender|MemId           |Height|Weight |Street   |City       |Zipcode|PhoneType|Phone      |Country |Months|TypeofCove1       | 
|opit    |Oklahoma Dental Association |Mr.  |Adam |Gill |08/01/1985 |Oklahoma|07/08/1958 |45     |Mia    |Gill   |01/01/1998 |Female  |$25,000  |$500,000 |$275,000|$5,000  |Mia   |Gill  |Daughter |50  |Sarah  |Gill   |Daughter |50    |MNC Trust |05/06/2018 |741-25-8963 |Married |Male  |545345343543543 |5.10  |188    |1 main st|HORSEHEADS |14845  |Mobile   |1234567890 |Algeria |3     |Change in Coverage|

@OpitRegression_5
Scenario Outline: <SC05> Application submission for Self with all LI products Beneficiaries - (Under ARTL fro Self ) Maximum (4 Pri Ind, 4 Cont Ind) 


Given Test set up for "NYL" feature and "NYL_OPIT" scenario
Given Customer navigate to NYL "<website>"
And Selects Association as "<Association>" at HomePage
When Clicks on Apply now button
Then Eligibility page details are displayed to user 
And Click on Self
And Enter eligibility details for Self as "<Title>", "<Fname>", "<Lname>", "<DOB1>", "<WorkHr>"
And Select YES Radio button of Membership 
And Clicks on next button
And Validate Age Restriction Message
And Enters DOB for Self as "<DOB2>" 
And Clicks on next button
Then Product page details are displayed to user
And Verify Available Product List TenYTL,AOD
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB>"
And Clicks on next button
Then Product page details are displayed to user
And Verify Available Product List ARTL,TenYTL,AOD
And Selects product ARTL for Self
And Selects product TenYTL for Self
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
And Clicks on next button
Then Request Coverage page is displayed to user
And Selects Type of Coverage as "<TypeofCove>" under ARTL for Self
And Validates under ARTL for Self the Benefit Slider Range as "<Min_ARTL>" to "<Max_ARTL>" 
And Selects Benefit Amount for Self as "<Benefit>" under ARTL
And Selects Optional AD&D Rider under ARTL for Self
And Selects Type of Coverage as "<TypeofCove1>" for AD&D rider under ARTL for Self
And Validates under ARTL the AD&D Rider Benefit Slider Range for Self as "<Min_AD&D>" to "<Max_AD&D>"
And Selects Rider Benefit Amount under ARTL for Self as "<Benefit1>"
And Selects Type of Coverage as "<TypeofCove1>" for Self under TenYTL 
And Validates under ARTL for Self the Benefit Slider Range as "<Min_TenYTL>" to "<Max_TenYTL>" 
And Selects Benefit Amount for Self as "<Benefit2>" under TenYTL
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Self under ARTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relation>","<Perc>"
And Clicks on OK button
And Click Delete button for first Primary Beneficiary for Self
And Delete box is displayed and clicks on Yes
And Verify that there is no beneficary for Self under ARTL
And Clicks on Add Beneficiary Button for Self under ARTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relation>","<Perc>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under ARTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname1>","<Blname1>","<Relation1>","<Perc1>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under ARTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname2>","<Blname2>","<Relation2>","<Perc2>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under ARTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname3>","<Blname3>","<Relation3>","<Perc3>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under ARTL
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bfname4>","<Blname4>","<Relation4>","<Perc4>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under ARTL
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bfname5>","<Blname5>","<Relation5>","<Perc5>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under ARTL
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bfname6>","<Blname6>","<Relation6>","<Perc6>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under ARTL
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship as other "<Bfname7>","<Blname7>","<Relation7>","<Perc7>","<Desc>"
And Clicks on OK button
And Clicks on next button
Then Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<Phone>" for Self at contact page 
And Validate the Travel Question for Non QD application for Self
And Selects Yes for Travel Question Non QD for Self 
And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>"
And Selects Residential Radio Button 
And Clicks on next button
And Validates Membership ID Required Message
And Enters Membership ID as "<MemId>" for Self
And Clicks on next button
Then Application Summary Page is displayed to user 
And Clicks on next button
Then Authorize page details are displayed to user and confirm the term and conditions for Self
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"

Examples:
|website |Association                          |Title |Fname|Lname|DOB        |WorkHr|DOB1       |DOB2       |DOB        |Min_ARTL|Max_ARTL |Benefit |Min_AD&D |Max_AD&D |Benefit1 |Min_TenYTL|Max_TenYTL |Benefit2   |Bfname |Blname|Relation |Perc|Bfname1|Blname1|Relation1|Perc1|Bfname2|Blname2|Relation2 |Perc2 |Bfname3|Blname3 |Relation3 |Perc3|Bfname4|Blname4|Relation4 |Perc4 |Bfname5|Blname5|Relation5 |Perc5|Bfname6|Blname6|Relation6|Perc6|Bfname7 |Blname7|Relation7|Desc |Perc7 |SSN         |Mstatus |Gender|MemId           |Height|Weight |Street    |City       |Zipcode|PhoneType |Phone      |Country|Months |TypeofCove|TypeofCove1|
|opit    |Oklahoma Association of Realtors |Mr.   |Adam |Gill |08/01/1985 |45    |11/10/1953 |07/09/1958 |09/14/1959 |$25,000 |$500,000 |$500,000|$25,000  |$100,000 |$100,000 |$50,0000  |$1,000,000 |$1,000,000 |Mia    |Gill  |Daughter |20  |Sarah  |Gill   |Daughter |20   |Rose   |Gill   |Mother    |30    |James  |Gill    |Father    |30   |Mark  |Gill    |Son       |10    |Gregg  |Gill   |Son       |10   |Lee    |Gill   |Daughter |40   |Hannah  |Gill   |Other    |Maid |40    |741-25-8963 |Married |Male  |545345343543543 |5.10  |188    |1 main st |HORSEHEADS |14845  |Mobile    |1234567890 |India  |15   | New   |Change in Coverage |

@OpitRegression_6
Scenario Outline: <SC06> Application submission for Self with DIP & BOE Save for Later and Retrieve Beneficiaries - NO


Given Test set up for "NYL" feature and "NYL_OPIT" scenario
Given Customer navigate to NYL "<website>"
And Selects Association as "<Association>" at HomePage
When Clicks on Apply now button
Then Eligibility page details are displayed to user
And Click on Self
And Enter eligibility details for Self as "<Title>", "<Fname>", "<Lname>", "<DOB1>", "<WorkHr>"
And Select YES Radio button of Membership 
And Clicks on next button 
Then Product page details are displayed to user
And Verify Available Product List TenYTL,AOD
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB>"
And Clicks on next button 
Then Verify Available Product List ARTL,TenYTL,AOD,DIP,BOE
And Selects product DIP for Self
And Selects product BOE for Self
And Clicks on next button
Then Selects Answer as No for all additional questions of Group Disability Insurance for Self
And Enters Monthly Income for Self as "<MonthlyIncome>"
And Enters details for Monthly Expense and Percentage Responsible as "<BussExp>","<BussExpPer>"
And Clicks on next button
Then Request Coverage page is displayed to user
And Validate Maximum Monthly Benefit Amount for Self as "<DIP_MaxBen>" under DIP
And Validate Maximum Monthly Benefit Amount for Self as "<BOE_MaxBen>" under BOE
And Clicks on Back or Previous button
And Enters Monthly Expense for Self as "<BussExp1>"
And Enters Monthly Income for Self as "<MonthlyIncome1>"
And Clicks on next button
And Validate Maximum Monthly Benefit Amount for Self as "<DIP_MaxBen1>" under DIP
And Validate Maximum Monthly Benefit Amount for Self as "<BOE_MaxBen1>" under BOE
And Clicks on Back or Previous button
And Enters Monthly Expense for Self as "<BussExp2>"
And Enters Monthly Income for Self as "<MonthlyIncome2>"
And Clicks on next button
And Validate Maximum Monthly Benefit Amount for Self as "<BOE_MaxBen2>" under BOE
And Selects Type of Coverage as "<TypeofCove>" for Self under DIP 
And Validates under DIP the Benefit Slider Range as "<Min_DIP>" to "<Max_DIP>" for Self
And Selects Benefit Amount for Self as "<Benefit>" under DIP
And Validate Waiting Period dropdown values for Self as "<WPeriod1>", "<WPeriod2>", "<WPeriod3>", "<WPeriod4>", "<WPeriod5>" under DIP
And Selects Waiting Period for Self as "<WaitP>" under DIP
And Validate Benefit Duration dropdown values for Self as "<BenDuration1>", "<BenDuration2>" under DIP
And Selects Benefit Duration for Self as "<BenDuration1>" under DIP
And Selects Accidental Death and Dismemberment checkbox for Self under DIP
And Validates for ADND under DIP the Benefit Slider Range as "<Min_ADND>" to "<Max_ADND>" for Self 
And Selects Benefit Amount for Self as "<Benefit1>" for ADND under DIP 
And Selects Recovery Option checkbox for Self under DIP
And Selects Residual Disability Benefit checkbox for Self under DIP
And Selects Cost of Living Adjustment Benefit checkbox for Self under DIP
And Selects Hospital Indemnity Protection checkbox for Self under DIP
And Validate amount for Hospital Indemnity Protection for Self from dropdown as "<HIPAmount>","<HIPAmount1>","<HIPAmount2>","<HIPAmount3>" under DIP
And Selects amount for Hospital Indemnity Protection for Self as "<HIPAmount>" under DIP
And Validate Maximum Monthly Benefit Amount for Self as "<BOE_MaxBen2>" under BOE
And Selects Type of Coverage as "<TypeofCove>" for Self under BOE
And Validates under BOE the Benefit Slider Range for Self as "<Min_BOE>" to "<Max_BOE>" 
And Selects Benefit Amount for Self as "<Benefit2>" under BOE
And Validate dropdown values of Waiting Period for Self as "<WaitP1>" under BOE
And Selects Wait Period for Self as "<WaitP1>" under BOE
And Validate Benefit Duration dropdown values for Self as "<BenDur1>" under BOE
And Selects Benefit Duration for Self as "<BenDur1>" under BOE
And Selects Guaranteed Purchase Option checkbox for Self under BOE
And Selects Recovery Option checkbox for Self under BOE
And Selects Retroactive checkbox for Self under BOE
And Clicks on next button
Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender>","<MemId>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<Phone>" for Self at contact page
And Selects No for Travel Question Non QD for Self  
And Selects Residential Radio Button
And Selects Yes Radio Button for Business Address
And Enters Business Address Details as "<BusinessName>","<BusinessType>"
And Clicks on next button
Then Application Summary Page is displayed to user 
And Clicks on next button
Then Authorize page details are displayed to user
And Validate Authorization message in Read and Sign Box
And Validate Consent message in Read and Sign Box
And Validate Fraud Notice OK in Read and Sign Box
And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario>","<pdfEnable>","<pdfName>"
Then Authorize page details are displayed to user and confirm the term and conditions for Self
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"

Examples:
|website |Association                |Title|Fname|Lname|DOB        |WorkHr |DOB1       |MonthlyIncome|BussExp |BussExpPer |DIP_MaxBen |BOE_MaxBen |MonthlyIncome1 |BussExp1|DIP_MaxBen1 |BOE_MaxBen1 |MonthlyIncome2 |BussExp2|DIP_MaxBen2 |BOE_MaxBen2 |Min_DIP |Max_DIP |Benefit |WaitP    |Min_ADND |Max_ADND|Benefit1|HIPAmount |Min_BOE |Max_BOE |Benefit2|WaitP1  |BenDur1   |SSN         |Mstatus |Gender |MemId           |Height |Weight |Street    |City       |Zipcode|PhoneType |Phone      |BusinessName |BusinessType|WPeriod1|WPeriod2|WPeriod3|WPeriod4|WPeriod5|BenDuration1|BenDuration2|BeneType|HIPAmount |HIPAmount1|HIPAmount2|HIPAmount3|TypeofCove|
|opit |Oklahoma Society of CPAs |Mr.  |Adam |Gill |09/14/1959 |45     |07/09/1958 |$50,000      |50,000  |80         |$10,000    |$10,000    |10,000         |10,000  |$7,000       |$8,000     |150,000        |150,000 |$10,000     |$10,000      |200     |10,000  |10,000  |180 Days |2,000    |100,000 |100,000 |200       |500     |10,000  |10,000  |30 Days |24 Months |741-25-8963 |Married |Male   |545345343543543 |5.4    |150    |1 main st |HORSEHEADS |14845  |Mobile    |1234567890 |Gill company |Corporation |30 Days |60 Days |90 Days |180 Days|365 Days|65/65 Plan  | 5-2 Plan   |Primary |$50       |$100      |$150      |$200      |New   |

@OpitRegression_7
Scenario Outline: <SC07> Application submission for Self, and Spouse  with AOD


Given Test set up for "NYL" feature and "NYL_OPIT" scenario
Given Customer navigate to NYL "<website>"
And Selects Association as "<Association>" at HomePage
When Clicks on Apply now button
Then Eligibility page details are displayed to user
And Click on Self
And Click on Spouse  
And Enter eligibility details for Self as "<Title>", "<Fname>", "<Lname>", "<DOB1>", "<WorkHr>"
And Select YES Radio button of Membership 
And Enters Eligibility details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB1>","<SWorkHr>"
And Select radio button Yes for Spouse is Member 
And Clicks on next button
And Validate Age Restriction Message
And Enters DOB for Self as "<DOB>" 
And Enters DOB for Spouse as "<SDOB>"
And Enters Self WorkHr as "<WorkHr1>"
And Enters Spouse WorkHr as "<SWorkHr1>"
And Clicks on next button
Then Product page details are displayed to user
And Verify Product TenYTL is displayed 
And Clicks on Back or Previous button
And Enters Self WorkHr as "<WorkHr>"
And Enters Spouse WorkHr as "<SWorkHr>"
And Clicks on next button 
Then Verify Available Product List TenYTL,AOD
And Selects product AOD for Self
And Selects product AOD for Spouse
And Clicks on next button 
Then Selects Answer as No for Applying any Other Insurance
And Enters Monthly Income for Self as "<MonthlyIncome>"
And Selects Answer as No for Additional Questions as No for all for Spouse of Group Disability Insuranse
And Enters Monthly Income as "<SMonthlyIncome>" for Spouse
And Clicks on next button 
Then Request Coverage page is displayed to user
And Validate Maximum Monthly Benefit Amount for Self as "<MaxBen>" under AOD
And Validate Maximum Monthly Benefit Amount for Spouse as "<SMaxBen>" under AOD
And Clicks on Back or Previous button
And Enters Monthly Income for Self as "<MonthlyIncome1>"
And Enters Monthly Income as "<SMonthlyIncome1>" for Spouse
And Clicks on next button 
And Validate Maximum Monthly Benefit Amount for Self as "<MaxBen1>" under AOD
And Validate Maximum Monthly Benefit Amount for Spouse as "<SMaxBen1>" under AOD
And Clicks on Back or Previous button
And Enters Monthly Income for Self as "<MonthlyIncome2>"
And Enters Monthly Income as "<SMonthlyIncome2>" for Spouse
And Clicks on next button 
And Selects Type of Coverage as "<TypeofCove>" under AOD for Self
And Validate Maximum Monthly Benefit Amount for Self as "<MaxBen2>" under AOD
And Validates under AOD the Benefit Slider Range as "<Min_AOD>" to "<Max_AOD>" for self 
And Selects Benefit Amount for Self as "<Benefit1>" under AOD
And Validate Waiting Period dropdown values for Self as "<WPeriod1>", "<WPeriod2>" under AOD
And Selects Waiting Period for Self as "<WPeriod1>" under AOD
And Selects Benefit Duration for Self as "<BenDur>" under AOD
And Selects Type of Coverage as "<TypeofCove>" under AOD for Spouse
And Validate Maximum Monthly Benefit Amount for Spouse as "<SMaxBen2>" under AOD
And Validates under AOD the Benefit Slider Range as "<SMin_AOD>" to "<SMax_AOD>" for Spouse 
And Selects Benefit Amount for Spouse as "<SBenefit>" under AOD
And Validate Waiting Period dropdown values for Spouse as "<WPeriod1>", "<WPeriod2>" under AOD
And Selects Waiting Period for Spouse as "<SWaitP>" under AOD
And Selects Benefit Duration for Spouse as "<SBenDur>" under AOD
And Clicks on next button 
And Verify Error Message in Spouse section for AOD
And Selects Benefit Amount for Self as "<Benefit>" under AOD
And Clicks on button to Save for later
Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>"
 And Clicks OK Button Save For Later
 Then Refresh the browser
 Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive
 And Clicks on next button
 
And Selects "<PhoneType>" and enter phonenumber "<Phone>" for Self at contact page
And Selects No for Travel Question Non QD for Self  
And Selects Residential Radio Button
And Enters contact Details without SSN and MemberID for Self as "<Mstatus>","<Height>","<Weight>","<Gender>","<Street>","<City>","<Zipcode>"
And Enters Membership ID as "<MemId>" for Self 
And Selects "<PhoneType>" and enter phonenumber "<Phone>" for Self at contact page
And Validate the Travel Question for Non QD application for Self
And Selects Yes for Travel Question Non QD for Self 
And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>"
And Selects Residential Radio Button
And Selects Yes Radio Button for Business Address
And Enters Business Address Details as "<BusinessName>","<BusinessType>"
And Enters contact Details for Spouse without SSN as "<SGender>","<SHeight>","<SWeight>","<SPhoneType>","<SPhoneNum>"
And Enters Membership ID as "<MemId>" for Spouse 
And Validate the Travel Question for Non QD application for Spouse
And Selects Yes for Travel Question Non QD for Spouse 
And Enter datails for Outside US country and How Long months for Spouse as "<SCountry>","<SMonths>"
#And Answer all other questions as No
And Clicks on next button
And Validates SSN Required Error Message for Self
And Enters SSN "<SSN>" for Self
And Enters SSN as "<SSSN>" for Spouse 
And Clicks on next button
Then Application Summary Page is displayed to user 
And Clicks on next button
Then Authorize page details are displayed to user
And Validate Authorization message in Read and Sign Box
And Validate Consent message in Read and Sign Box
And Validate Fraud Notice OK in Read and Sign Box
And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario>","<pdfEnable>","<pdfName>"
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
|website |Association                      |Title |Fname|Lname|DOB        |WorkHr|DOB1       |SDOB1      |Stitle |Sfname|Slname |SDOB       |SWorkHr |WorkHr1 |SWorkHr1 |MonthlyIncome |SMonthlyIncome |MaxBen |SMaxBen |MonthlyIncome1 |SMonthlyIncome1 |MaxBen1 |SMaxBen1 |MonthlyIncome2 |SMonthlyIncome2 |MaxBen2 |SMaxBen2 |Min_AOD|Max_AOD|Benefit|Benefit1|WPeriod1|WPeriod2|BenDur  |SMin_AOD|SMax_AOD|SBenefit|SWaitP     |SBenDur|SSN        |Mstatus |Gender|MemId           |Height |Weight |Street    |City       |Zipcode|PhoneType |Phone      |BusinessName |BusinessType|SSSN        |SMemId          |SHeight |SWeight |SGender |SPhoneType |SPhoneNum  |Country |Months |SCountry |SMonths |Password|VPassword|TypeofCove|pdfScenario|pdfEnable|pdfName|
|opit    |Oklahoma Dental Association |Prof. |Adam |Gill |09/14/1954 |45    |07/09/1953 |01/06/1953 |Mrs.   |Bella |Gill   |10/15/1954 |30      |29      |29       |1400          |1000           |$0     |$0      |1500           |1500            |$1,000  |$1,000   |150,000        |200,000         |$3,000  |$3,000   |$1,000 |$3,000 |$3,000 |2000    |30 Days |60 Days |2 Years |$1000   |$3000   |3000    |60 Days    |2 Years|741-25-8963|Married |Male  |545345343543543 |5.10   |188    |1 main st |HORSEHEADS |14845  |Mobile    |1234567890 |Gill company |Corporation |266-46-4546 |545300003543543 |5.5     |140     |Female  |Home       |0123456789 |Bhutan  |18     |Thailand |20      |Adam@123|Adam@123 |New       |Opit_08NonNM|1        |Important Notice NM 2 08.12|

@OpitRegression_8
Scenario Outline: <SC08> Application Submission for Spouse and Child with ARTL Skip Beneficiary


Given Test set up for "NYL" feature and "NYL_OPIT" scenario
Given Customer navigate to NYL "<website>"
And Selects Association as "<Association>" at HomePage
When Clicks on Apply now button
Then Eligibility page details are displayed to user
And Click on Spouse  
And Click on Child
And Enter eligibility details for Self as "<Title>", "<Fname>", "<Lname>", "<DOB>", "<WorkHr>"
And Select YES Radio button of Membership
And Enters Eligibility details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB1>","<SWorkHr>"
And Select radio button NO for Spouse is Member
And Click on Add Child button 
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB1>","<CGender>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Clicks on next button
Then Product page details are displayed to user
And Verify Available Product List TenYTL,AOD
And Clicks on Back or Previous button
And Enters DOB for Spouse as "<SDOB>"
And Clicks Edit button for Child Added
And Enters DOB for Child as "<CDOB>" 
And Click on Add Child button on Screen
And Clicks on next button
And Verify Available Product List ARTL,TenYTL,AOD
And Selects product ARTL for Child
And Selects product ARTL for Spouse
And Clicks on next button
Then Click YES for Dependent Coverage information
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
And Clicks on next button
Then Request Coverage page is displayed to user 
And Selects Type of Coverage as "<TypeofCove1>" under ARTL for Spouse
And Validates under ARTL the Benefit Slider Range for Spouse as "<SMin_ARTL>" to "<SMax_ARTL>" 
And Selects Benefit Amount for Spouse as "<SBenefit>" under ARTL
And Selects Benefit Amount for Child as "<CBenefit>" under ARTL
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Skip Beneficiary Button
Then Contact details are displayed to user
Then Validates Height and Weight is not displayed for Self
Then Contact Details page is displayed to user and enters contact Details for self as "<SSN>","<Mstatus>","<Gender>","<MemId>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<Phone>" for Self at contact page
And Selects Residential Radio Button
And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<SGender>","<SPhoneType>","<SPhoneNum>"
And Validate the Travel Question for Non QD application for Spouse
And Selects No for Travel Question Non QD for Spouse
And Clicks on next button
Then Application Summary Page is displayed to user 
And Clicks on next button
Then Authorize page details are displayed to user
And Validate Authorization message in Read and Sign Box
And Validate Consent message in Read and Sign Box
And Validate Fraud Notice OK in Read and Sign Box
And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario>","<pdfEnable>","<pdfName>"
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
And Verify that Confirmation number is generated for "<website>"

Examples:

|website |Association                         |Title |Fname|Lname|DOB        |WorkHr |Stitle|Sfname|Slname|SDOB       |SDOB1      |SWorkHr |Cfname |Clname |CDOB       |CDOB1      |CGender |SMin_ARTL |SMax_ARTL |SBenefit|CBenefit |SSN         |Mstatus |Gender  |MemId           |Street            |City       |Zipcode|PhoneType |Phone      |SSSN        |SHeight |SWeight|SGender |SPhoneType |SPhoneNum  |pdfScenario|pdfEnable|pdfName|TypeofCove1|
|opit    |Oklahoma Association of Realtors|Dr.   |Adam |Gill |08/01/1985 |45     |Ms    |Bella |Gill  |08/01/1988 |11/20/1958 |30      |Mia    |Gill   |01/01/2000 |12/04/1997 |Female  |25,000    |500,000   |300,000 |5,000    |741-25-8963 |Married |Male    |545345343543543 |44 Downing St #3C |HORSEHEADS |14845  |Mobile    |1234567890 |266-46-4546 |5.5   |140    |Female  |Home       |0123456789 |Opit_08NonNM|1        |Important Notice All except NM 2 08.12|Change in Coverage|

