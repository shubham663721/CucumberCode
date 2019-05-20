Feature: Acs Test

@AcsRegression_1
Scenario Outline: <ACS_SC01> Application submission for Self, Spouse and Child and with all the products and rider(s)  Beneficiaries- Maximum                  

Given Test set up for "NYL" feature and "NYL_ACS" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Click on Self
Then Click on Spouse
Then Click on Child
Then Eligibility page details are displayed to user 
Then Select NO for Association Membership
And Validate that NEXT button is Disabled
Then Select YES Radio button of Membership
And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<Workhr>"
And Select radio button Yes for Spouse is Member
And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
And Selects Married question as No for Child
And Click on Add Child button on Screen
And Clicks on next button
And Verify that error message is displayed for state eligibility at top of the page
And Enter New State as "<State1>"
And Clicks on next button
Then Product page details are displayed to user
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB1>"
And Clicks on next button
And Validates that Self is not displayed at product page for TermLife, TenYTL, FifteenYTL, TwentyYTL, ADDI, LTD, HII
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB2>"
And Enters DOB for Spouse as "<SDOB1>"
And Clicks on next button
And Validates that Self & Spouse are not displayed at product page for TermLife, TenYTL, FifteenYTL, TwentyYTL, HII
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB>"
And Enters DOB for Spouse as "<SDOB2>"
And Clicks on next button
And Validates that Spouse is not displayed at product page for TermLife, TenYTL, FifteenYTL, TwentyYTL, ADDI, LTD, HII
And Clicks on Back or Previous button
And Enters DOB for Spouse as "<SDOB>"
And Clicks on next button
And Selects product TermLife for Self
And Selects product TermLife for Spouse
And Selects product TermLife for Child
And Selects product TenYTL for Self
And Selects product TenYTL for Spouse
And Verify Child icon is disabled for TenYTL
And Selects product FifteenYTL for Self
And Selects product FifteenYTL for Spouse
And Verify Child icon is disabled for FifteenYTL
And Selects product TwentyYTL for Self
And Selects product TwentyYTL for Spouse
And Verify Child icon is disabled for TwentyYTL
And Selects product Accidental Death for Self
And Selects product Accidental Death for Spouse
And Selects product LTD for Self
And Selects product LTD for Spouse
And Selects product STD for Self
And Selects product OOEDI for Self
And Selects product SDI for Self
And Selects product HII for Self
And Selects product HII for Spouse
And Selects product HII for Child
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as No for Self and Spouse
And Selects Answer as No for all additional questions of Group Disability Insurance for Self
And Enters Monthly Income for Self as "<MonthlyIncome>"
And Enters details for Monthly Expense and Percentage Responsible as "<Mexpense>","<Percresp>"
And Clicks on next button
And Validate error message for required question
And Validate Imp Replacement Info text for NewYork state
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
And Clicks on next button
Then Request Coverage page is displayed to user
And Selects Type of Coverage as "<TypeofCove>" for Self under Term Life
And Validates under TermLife the Benefit Slider Range for Self as "<Min_Term>" to "<Max_Term>"
And Selects Benefit Amount for Self as "<Benefit>" under TermLife
And Verify Type of Coverage Change in coverage is unavailable under TermLife for Spouse
And Selects Type of Coverage as "<TypeofCove1>" for Self under Term Life
And Checks Chronic Illness Rider for Self checkbox under TermLife
And Validates under TermLife the Benefit Slider Range for CIR as "<Min_CIR>" to "<Max_CIR>" for Self
And Selects CIR portion for Self as "<RidBenefit>" under TermLife
And Selects Type of Coverage as "<TypeofCove>" for Spouse under Term Life
And Validates under TermLife the Benefit Slider Range for Spouse as "<SMin_Term>" to "<SMax_Term>" 
And Selects Benefit Amount for Spouse as "<Sbenefit>" under TermLife
And Checks CIR checkbox for Spouse
And Validates under TermLife the Benefit Slider Range for CIR as "<SMin_CIR>" to "<SMax_CIR>" for Spouse
And Selects CIR portion for Spouse as "<SRidBenefit>" under TermLife
And Validate Benefit Amount for Child as "<Cbenefit>" under TermLife
And Validates under TenYTL the Benefit Slider Range as "<Min_Ten>" to "<Max_Ten>" for self
And Selects Type of Coverage as "<TypeofCove>" for Self under TenYTL
And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
And Selects Type of Coverage as "<TypeofCove>" for Spouse under TenYTL
And Validates under TenYTL the Benefit Slider Range as "<SMin_Ten>" to "<SMax_Ten>" for Spouse
And Selects Benefit Amount for Spouse as "<Sbenefit1>" under TenYTL
And Selects Type of Coverage as "<TypeofCove1>" for Self under FifteenYTL
And Validates under FifteenYTL the Benefit Slider Range as "<Min_fifteen>" to "<Max_fifteen>" for self
And Selects Type of Coverage as "<TypeofCove1>" for Spouse under FifteenYTL
And Selects Benefit Amount for Spouse as "<Sbenefit2>" under FifteenYTL
And Validates under FifteenYTL the Benefit Slider Range as "<SMin_fifteen>" to "<SMax_fifteen>" for spouse
And Selects Benefit Amount for Self as "<Benefit2>" under FifteenYTL
And Selects Type of Coverage as "<TypeofCove>" for Self under TwentyYTL
And Validates under TwentyYTL the Benefit Slider Range as "<Min_twenty>" to "<Max_twenty>"
And Selects Benefit Amount for Self as "<Benefit3>" under TwentyYTL
And Selects Type of Coverage as "<TypeofCove>" for Spouse under TwentyYTL
And Validates under TwentyYTL the Benefit Slider Range as "<SMin_twenty>" to "<SMax_twenty>" for Spouse
And Selects Benefit Amount for Spouse as "<Sbenefit3>" under TwentyYTL
And Selects Type of Coverage as "<TypeofCove>" for Self under ADDI
And Validates under ADDI the Benefit Slider Range as "<Min_ADnD>" to "<Max_ADnD>"
And Selects Benefit Amount for Self as "<Benefit4>" under ADDI
And Selects Type of Coverage as "<TypeofCove>" for Spouse under Accidental Death
And Validates under ADDI the Benefit Amounts Listed for spouse are: "<ADnD_sAmount1>","<ADnD_sAmount2>"
And Selects Benefit Amount for Spouse as "<Sbenefit4>" under ADDI from dropdown
And Selects Type of Coverage as "<TypeofCove1>" for Self under LTD
And Selects Wait Period for Self as "<WaitPeriod>" under LTD
And Validates under LTD the Benefit Slider Range as "<Min_LTD>" to "<Max_LTD>"
And Selects Benefit Amount for Self as "<Benefit5>" under LTD
And Selects Cost of Living Adjustment Rider under LTD product
And Selects Future Purchase Option Rider under LTD product
And Selects FPO Rider Benefit Amount for Self as "<RidBenefit1>"
And Validates Benefit Amount for Spouse as "<Sbenefit5>" under LTD
And Selects Benefit Amount for Self as "<Benefit6>" under STD
And Selects Type of Coverage as "<TypeofCove>" for Self under STD
And Validates under STD the Benefit Slider Range as "<STDSliderMin>" to "<STDSliderMax>" for self
And Selects Wait Period for Self as "<WaitPeriod1>" under STD
And Validates Benefit Duration for Self as "<BenDuration>" under STD
And Selects Benefit Amount for Self as "<Benefit7>" under OOEDI
And Selects Type of Coverage as "<TypeofCove>" for Self under OOEDI
And Validates under OOEDI the Benefit Slider Range as "<OOEDISliderMin>" to "<OOEDISliderMax>"
And Validates Wait Period for Self as "<WaitPeriod2>" under OOEDI
And Validates Benefit Duration for Self as "<BenDuration1>" under OOEDI displayed in label
And Selects Type of Coverage as "<TypeofCove>" for Self under SDI
And Validates under SDI the Benefit Slider Range as "<SDISliderMin>" to "<SDISliderMax>" for self
And Selects Benefit Amount for Self as "<Benefit8>" under SDI
And Validates Wait Period for Self as "<WaitPeriod3>" under SDI
And Selects Benefit Duration for Self as "<BenDuration2>" under SDI
And Selects Type of Coverage as "<TypeofCove>" for Self under HII
And Validates under HII the Benefit Amounts for Self Listed are:"<HII_amount1>","<HII_amount2>","<HII_amount3>","<HII_amount4>","<HII_amount5>"
And Selects Benefit Amount for Self as "<Benefit9>" under HII
And Selects Type of Coverage as "<TypeofCove>" for Spouse under HII
And Validates Benefit Amount for Spouse as "<Sbenefit6>" under HII
And Selects Type of Coverage as "<TypeofCove>" for Child under HII
And Validates Benefit Amount for Child as "<Cbenefit1>" under HII
And Clicks on next button
And Validate Coverage related Error message at top
And Selects Benefit Amount for Self as "<Benefit10>" under TermLife
And Selects Benefit Amount for Spouse as "<Sbenefit7>" under TermLife
And Clicks on next button
And Verify Error Message in Spouse section for TermLife   
##Message=Spouse Coverage cannot be more than Self
And Selects Benefit Amount for Spouse as "<Sbenefit8>" under TermLife
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Self under TermLife 
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And User Enters Beneficiary details as "<Trust>","<Datetrust>"
And Clicks on OK button
And Verify that the Percent Displayed for Trust "<TrustSequence>" is "<TrustPercent>" for TermLife
And Clicks on Add Beneficiary Button for Self under TermLife
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
And User Enters Beneficiary details as "<Trust1>","<Datetrust>"
And Clicks on OK button
And Delete Contigent Beneficiary
And Delete box is displayed and clicks on Yes
And Clicks on Add Beneficiary Button for Self under TermLife
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TermLife
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship as other "<Bname1>","<Blname1>","<Relationship1>","<Perc1>","<Desc>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TermLife
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bname2>","<Blname2>","<Relationship2>","<Perc2>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TermLife
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bname3>","<Blname3>","<Relationship3>","<Perc3>"
And Clicks on OK button

And Clicks on Add Beneficiary Button for Spouse under FifteenYTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bname4>","<Blname4>","<Relationship4>","<Perc4>"
And Clicks on OK button

And Clicks on Add Beneficiary Button for Spouse under FifteenYTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And Selects the First Option from Existing Beneficiaries List and select Type as "<BeneType>"
And Enters Percentage for First Option as "<Perc5>"
And Selects the Second Option from Existing Beneficiaries List and select Type as "<BeneType>"
And Enters Percentage Second Option as "<Perc6>"
And Selects the Third Option from Existing Beneficiaries List and select Type as "<BeneType>"
And Enters Percentage Third Option as "<Perc7>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under TwentyYTL
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons

## chnaged bene type as primary as first bene can not be contingent
And Selects the First Option from Existing Beneficiaries List and select Type as "<BeneType>" for Trust
And Clicks on OK button
And Verify that the Percent Displayed for Trust is "<TrustPercent>" for Spouse under TwentyYTL
And Clicks on next button
Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<MemId>","<Street>","<City>","<Zipcode>"
And Selects Frequency as "<Frequency>" at contact page
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Validate the Travel Question for Non QD application for Self
And Selects Yes for Travel Question Non QD for Self 
And  Enter details for Outside US country and How Long months for Self as "<Country>","<Months>"
And Selects Residential Radio Button
And Selects NO Radio Button for Business Address
And Enters Business Details as "<BusinessName>","<BusinessType>"
And Enter Business Address Details as "<BStreet>","<BCity>","<BState>","<BZipcode>"
And Enters contact Details for Spouse with SSN and MembershipID as "<SSSN>","<SHeight>","<SWeight>","<SSex>","<SMemId>","<SPhoneType>","<SPhoneNum>"
And Validate the Travel Question for Non QD application for Spouse
And Selects Yes for Travel Question Non QD for Spouse 
And Enters details for Spouse as "<SCountry>","<SMonths>"
And Clicks on next button
Then Application Summary Page is displayed to user 
And Verify Benefit Amount for Self as "<Benefit10>" under TermLife
And Verify CIR portion for Self as "<RidBenefit>" under TermLife
And Verify Benefit Amount for Self as "<Benefit1>" under TenYTL
And Verify Benefit Amount for Self as "<Benefit2>" under FifteenYTL
And Verify Benefit Amount for Self as "<Benefit3>" under TwentyYTL
And Verify Benefit Amount for Self as "<Benefit4>" under ADDI
And Verify Benefit Amount for Self as "<Benefit5>" under LTD
And Verify Rider FPO Rider Benefit Amount for Self as "<RidBenefit1>" under LTD
And Verify Cost of Living Adjustment Rider under LTD
And Verify Benefit Amount for Self as "<Benefit6>" under STD
And Verify Benefit Amount for Self as "<Benefit7>" under OOEDI
And Verify Benefit Amount for Self as "<Benefit8>" under SDI
And Verify FPO Rider Benefit Amount for Self as "<RidBenefit1>" under SDI
And Verify Cost of Living Adjustment Rider under SDI
And Verify Benefit Amount for Self as "<Benefit9>" under HII
And Verify Benefit Amount for Spouse as "<Sbenefit8>" under TermLife
And Verify CIR portion for Spouse as "<SRidBenefit>" under TermLife
And Verify Benefit Amount for Spouse as "<Sbenefit1>" under TenYTL
And Verify Benefit Amount for Spouse as "<Sbenefit2>" under FifteenYTL
And Verify Benefit Amount for Spouse as "<Sbenefit3>" under TwentyYTL
And Verify Benefit Amount for Spouse as "<Sbenefit4>" under ADDI
And Verify Benefit Amount for Spouse as "<Sbenefit5>" under LTD
And Verify Benefit Amount for Spouse as "<Sbenefit6>" under HII
And Verify Benefit Amount for Child as "<Cbenefit>" under TermLife
And Verify Benefit Amount for child as "<Cbenefit1>" under HII
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

|website |Title  |Fname   |Lname  |State         |DOB               |Workhr |Stitle |Sfname  |Slname   |SDOB              |SWorkHr|Cfname |Clname |CDOB       |Csex  |State1    |DOB1                |DOB2              |SDOB1              |SDOB2            |MonthlyIncome |Mexpense |Percresp |TotalAmt  |Iamount  |Company|STotalAmt |SIAmount |SCompany |Company1 |BenAmt |BenPeriod |RepAmount |Company2 |BenAmt1 |BenPeriod1 |RepAmount1 |Benefit    |RidBenefit |Sbenefit   |SRidBenefit |Cbenefit |Benefit1 |Sbenefit1 |Benefit2 |Sbenefit2 |Benefit3 |Sbenefit3 |Benefit4 |Sbenefit4 |Benefit5 |WaitPeriod |RidBenefit1 |Sbenefit5 |Benefit6 |WaitPeriod1     |BenDuration |Benefit7 |WaitPeriod2 |BenDuration1 |Benefit8 |WaitPeriod3 |BenDuration2 |Benefit9 |Sbenefit6 |Cbenefit1 |Benefit10   |Sbenefit7  |Sbenefit8 |Trust    |Datetrust  |TrustPercent |TrustSequence |Trust1 |Bname |Blname |Relationship |Perc |Bname1   |Blname1 |Relationship1  |Perc1 |Desc    |Bname2    |Blname2 |Relationship2 |Perc2 |Bname3 |Blname3 |Relationship3 |Perc3 |Bname4 |Blname4 |Relationship4 |Perc4 |Perc5 |Perc6 |Perc7  |BeneType |BeneType1  |Country |Months  |SSN        |Mstatus |Height |Weight |Sex    |MemId  |Frequency |Street                   |City      |Zipcode   |PhoneType |PhoneNum   |BusinessName |BusinessType |BStreet   |BCity       |BState  |BZipcode |SSSN      |SHeight |SWeight |SSex       |SPhoneType |SPhoneNum  |SMemId   |TypeofCove |TypeofCove1     |Min_Term |Max_Term |Min_CIR |Max_CIR |SMin_Term |SMax_Term |SMin_CIR |SMax_CIR |Min_Ten |Max_Ten |SMin_Ten |SMax_Ten |Min_fifteen |Max_fifteen |SMin_fifteen |SMax_fifteen |Min_twenty |Max_twenty |SMin_twenty |SMax_twenty |Min_ADnD |Max_ADnD |ADnD_sAmount1 |ADnD_sAmount2 |Min_LTD |Max_LTD |STDSliderMin |STDSliderMax |OOEDISliderMin |OOEDISliderMax |SDISliderMin |SDISliderMax |HII_amount1 |HII_amount2 |HII_amount3 |HII_amount4 |HII_amount5 |SCountry |SMonths|pdfScenario|pdfEnable|
|acs     |Mr.    |Lauren  |Warren |Saskatchewan  |SYSDATE-17Y/0M/0D |45     |Mrs.   |Bella   |Gill     |SYSDATE-17Y/0M/0D |45     |John   |Gill   |CurrentDate|Male  |New York  |SYSDATE-16Y/11M/30D |SYSDATE-80Y/0M/0D |SYSDATE-16Y/11M/30D|SYSDATE-80Y/0M/0D|52000         |10000    |10       |250000    |250000   |Test   |35000     |15000    |TestNyl  |Majesco  |25000  |6         |10000     |Maxim    |35000   |6          |25000      |$2,000,000 |$200,000   |$200,000   |$100,000    |$10,000  |$900,000 |$275,000  |$700,000 |$200,000  |$500,000 |$275,000  |$100,000 |$50,000   |$6,000   |60 Days    |$1,000      |$500      |$700     |Plan II: 30 Day |6 Months    |$1,000   |30 Days     |24 months    |$600     |90 days     |5-Year       |$300     |$300      |$300      |$1,900,000  |$2,000,000 |$200,000  |kennedy  |05/02/2012 |100 %        |1             |arthur |John  |Adams  |Son          |25   |Samantha |Jonas   |Other          |25    |Friend  |Rihanna   |Jones   |Daughter      |35    |Jake   |Charles |Father        |15    |Carter |Jonas   |Father        |50    |15    |15    |20     |Primary  |Contingent |Belarus |12      |993667673  |Married |5.6    |150    |Male   |654596 |Quarterly |15523 Jewel Ave #APT 2D  |Flushing  |11367     |Cell      |4714258965 |Arthur Corp  |Partnership  |17 Lake St|Lake Placid |New York|12946    |990064152 |5.2     |170     |Female     |Cell       |7415487236 |65478255 |New     |Change in Coverage |50000    |4000000  |50000   |1000000 |25000     |2000000   |25000    |1000000  |100000  |4000000 |100000   |2000000  |100000      |4000000     |100000       |2000000      |100000     |4000000    |100000      |2000000     |50000    |500000   |50000         |100000        |1000    |6000    |200          |5000         |1000           |10000          |200          |2500         |100         |200         |300         |400         |500         |Barbados |12     |ACS01      |0        |

#@AcsRegression_1_PDF
#Examples:
#
#|website |Title  |Fname   |Lname  |State         |DOB               |Workhr |Stitle |Sfname  |Slname   |SDOB              |SWorkHr|Cfname |Clname |CDOB       |Csex  |State1    |DOB1                |DOB2              |SDOB1              |SDOB2            |MonthlyIncome |Mexpense |Percresp |TotalAmt  |Iamount  |Company|STotalAmt |SIAmount |SCompany |Company1 |BenAmt |BenPeriod |RepAmount |Company2 |BenAmt1 |BenPeriod1 |RepAmount1 |Benefit    |RidBenefit |Sbenefit   |SRidBenefit |Cbenefit |Benefit1 |Sbenefit1 |Benefit2 |Sbenefit2 |Benefit3 |Sbenefit3 |Benefit4 |Sbenefit4 |Benefit5 |WaitPeriod |RidBenefit1 |Sbenefit5 |Benefit6 |WaitPeriod1     |BenDuration |Benefit7 |WaitPeriod2 |BenDuration1 |Benefit8 |WaitPeriod3 |BenDuration2 |Benefit9 |Sbenefit6 |Cbenefit1 |Benefit10   |Sbenefit7  |Sbenefit8 |Trust    |Datetrust  |TrustPercent |TrustSequence |Trust1 |Bname |Blname |Relationship |Perc |Bname1   |Blname1 |Relationship1  |Perc1 |Desc    |Bname2    |Blname2 |Relationship2 |Perc2 |Bname3 |Blname3 |Relationship3 |Perc3 |Bname4 |Blname4 |Relationship4 |Perc4 |Perc5 |Perc6 |Perc7  |BeneType |BeneType1  |Country |Months  |SSN        |Mstatus |Height |Weight |Sex    |MemId  |Frequency |Street                   |City      |Zipcode   |PhoneType |PhoneNum   |BusinessName |BusinessType |BStreet   |BCity       |BState  |BZipcode |SSSN      |SHeight |SWeight |SSex       |SPhoneType|SPhoneNum  |SMemId   |TypeofCove |TypeofCove1     |Min_Term |Max_Term |Min_CIR |Max_CIR |SMin_Term |SMax_Term |SMin_CIR |SMax_CIR |Min_Ten |Max_Ten |SMin_Ten |SMax_Ten |Min_fifteen |Max_fifteen |SMin_fifteen |SMax_fifteen |Min_twenty |Max_twenty |SMin_twenty |SMax_twenty |Min_ADnD |Max_ADnD |ADnD_sAmount1 |ADnD_sAmount2 |Min_LTD |Max_LTD |STDSliderMin |STDSliderMax |OOEDISliderMin |OOEDISliderMax |SDISliderMin |SDISliderMax |HII_amount1 |HII_amount2 |HII_amount3 |HII_amount4 |HII_amount5 |SCountry |SMonths|pdfScenario|pdfEnable|
#|acs     |Mr.    |Lauren  |Warren |Saskatchewan  |SYSDATE-17Y/0M/0D |45     |Mrs.   |Bella   |Gill     |SYSDATE-17Y/0M/0D |45     |John   |Gill   |CurrentDate|Male  |New York  |SYSDATE-16Y/11M/30D |SYSDATE-80Y/0M/0D |SYSDATE-16Y/11M/30D|SYSDATE-80Y/0M/0D|52000         |10000    |10       |250000    |250000   |Test   |35000     |15000    |TestNyl  |Majesco  |25000  |6         |10000     |Maxim    |35000   |6          |25000      |$2,000,000 |$200,000   |$200,000   |$100,000    |$10,000  |$900,000 |$275,000  |$700,000 |$200,000  |$500,000 |$275,000  |$100,000 |$50,000   |$6,000   |60 Days    |$1,000      |$500      |$700     |Plan II: 30 Day |6 Months    |$1,000   |30 Days     |24 months    |$600     |90 days     |5-Year       |$300     |$300      |$300      |$1,900,000  |$2,000,000 |$200,000  |kennedy  |05/02/2012 |100 %        |1             |arthur |John  |Adams  |Son          |25   |Samantha |Jonas   |Other          |25    |Friend  |Rihanna   |Jones   |Daughter      |35    |Jake   |Charles |Father        |15    |Carter |Jonas   |Father        |50    |15    |15    |20     |Primary  |Contingent |Belarus |12      |993667673  |Married |5.6    |150    |Male   |654596 |Quarterly |15523 Jewel Ave #APT 2D  |Flushing  |11367     |Cell      |4714258965 |Arthur Corp  |Partnership  |17 Lake St|Lake Placid |New York|12946    |990064152 |5.2     |170     |Female     |Cell      |7415487236 |65478255 |New     |Change in Coverage |50000    |4000000  |50000   |1000000 |25000     |2000000   |25000    |1000000  |100000  |4000000 |100000   |2000000  |100000      |4000000     |100000       |2000000      |100000     |4000000    |100000      |2000000     |50000    |500000   |50000         |100000        |1000    |6000    |200          |5000         |1000           |10000          |200          |2500         |100         |200         |300         |400         |500         |Barbados |12     |ACS01 |1|


@AcsRegression_2    
Scenario Outline: <ACS_SC02> Application submission for Spouse only with All Products                  

Given Test set up for "NYL" feature and "NYL_ACS" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Click on Spouse
Then Eligibility page details are displayed to user 
Then Select YES Radio button of Membership
And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
And Select radio button NO for Spouse is Member	
And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
And Clicks on next button
And Verify that error message is displayed for state eligibility at top of the page
And Enter New State as "<State1>"
And Clicks on next button
Then Product page details are displayed to user
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
Then Validates that only HII is displayed for Spouse
### Note: Validates TTLI, TenYTL, FifteenYTL, TwentyYTL, ADDI, LTDI are not displayed
And Clicks on Back or Previous button
And Enters DOB for Spouse as "<SDOB>"
And Clicks on next button
And Selects product TermLife for Spouse
And Selects product TenYTL for Spouse
And Selects product FifteenYTL for Spouse
And Selects product TwentyYTL for Spouse
And Selects product Accidental Death for Spouse
And Selects product LTD for Spouse
And Selects product HII for Spouse
And Clicks on next button
Then Click YES for Dependent Coverage information
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
And Clicks on next button
Then Request Coverage page is displayed to user
And Selects Benefit Amount for Spouse as "<Sbenefit>" under TermLife
And Selects Type of Coverage as "<TypeofCove>" for Spouse under Term Life
And Selects Benefit Amount for Spouse as "<Sbenefit1>" under TenYTL
And Selects Type of Coverage as "<TypeofCove1>" for Spouse under TenYTL 
And Selects Benefit Amount for Spouse as "<Sbenefit2>" under FifteenYTL
And Selects Type of Coverage as "<TypeofCove1>" for Spouse under FifteenYTL
And Selects Benefit Amount for Spouse as "<Sbenefit3>" under TwentyYTL
And Selects Type of Coverage as "<TypeofCove>" for Spouse under TwentyYTL
And Selects Type of Coverage as "<TypeofCove>" for Spouse under Accidental Death
And Selects Benefit Amount for Spouse as "<Sbenefit4>" under ADDI from dropdown
And Validates Benefit Amount for Spouse as "<Sbenefit5>" under LTD
And Selects Benefit Amount for Spouse as "<Sbenefit6>" under HII
And Selects Type of Coverage as "<TypeofCove>" for Spouse under HII
And Validates under HII the Benefit Amounts for Spouse Listed are:"<HII_amount1>","<HII_amount2>","<HII_amount3>","<HII_amount4>","<HII_amount5>"
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Spouse under TenYTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under TenYTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship as other "<Bname1>","<Blname1>","<Relationship1>","<Perc1>","<Desc>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under TenYTL
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons	
And User Enters Beneficiary details as "<Trust>","<DateTrust>"
And Clicks on OK button
And Verify that the Trust Percentage Displayed for Spouse is "<TrustPercent>"
And Clicks on next button
Then Contact Details page is displayed to user and enters contact Details for self as "<SSN>","<Mstatus>","<Sex>","<MemId>","<Street>","<City>","<Zipcode>"
And Selects Frequency as "<Frequency>" at contact page
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Selects Residential Radio Button
And Selects Yes Radio Button for Business Address
And Enters Business Details as "<BusinessName>","<BusinessType>"
And Enters contact Details for Spouse without SSN as "<SSex>","<SHeight>","<SWeight>","<SPhoneType>","<SPhoneNum>"
And Selects No for Travel Question Non QD for Spouse
And Clicks on next button
And Validates SSN Required Error Message for Spouse
#And Verify Error Message is displayed
And Enters SSN as "<SSSN>" for Spouse
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
|website |Title  |Fname   |Lname  |State   |DOB                  |WorkHr|Stitle |Sfname  |Slname   |SDOB                |State1         |SDOB1                |SDOB2                 |SDOB3                   |Sbenefit |Sbenefit1 |Sbenefit2 |Sbenefit3 |Sbenefit4 |Sbenefit5 |Sbenefit6 |Trust    |DateTrust              |TrustPercent  |Bname |Blname |Relationship |Perc |Bname1   |Blname1 |Relationship1  |Perc1 |Desc     |SSN        |Mstatus   |Sex    |MemId     |Frequency    |Street                  |City            |Zipcode   |PhoneType |PhoneNum   |BusinessName |BusinessType  |SSSN      |SHeight|SWeight |SSex    |SPhoneType |SPhoneNum    |TypeofCove |TypeofCove1        |HII_amount1 |HII_amount2 |HII_amount3 |HII_amount4 |HII_amount5 |pdfScenario|pdfEnable| 
|acs     |Mr.    |Edward  |Cullen |Quebec  |SYSDATE-64Y/11M/30D  |30    |Mrs.   |Bella   |Cullen   |SYSDATE-64Y/11M/30D |Rhode Island   |SYSDATE-16Y/11M/30D  |SYSDATE - 80Y/00M/00D |SYSDATE - 65Y/00M/00D   |550000   |375000    |475000    |300000    |100000    |500       |500       |kennedy  |SYSDATE - 69Y/02M/05D  |100 %          |John  |Adams  |Son          |99   |Samantha |Jonas   |Other          |1     |Friend   |744658954  |Married   |Male   |657125895 |Semiannually |2160 Mineral Spring Ave |North Providence|02911     |Home      |7854364751 |Arthur Corp  |Partnership   |472596847 |5.1    |180     |Female  |Business   |8798325897   |New        |Change in Coverage |100         |200         |300         |400         |500        |ACS02      |0         |	

#@AcsRegression_2_PDF
#Examples:
#|website |Title  |Fname   |Lname  |State   |DOB                  |WorkHr|Stitle |Sfname  |Slname   |SDOB                |State1         |SDOB1                |SDOB2                 |SDOB3                   |Sbenefit |Sbenefit1 |Sbenefit2 |Sbenefit3 |Sbenefit4 |Sbenefit5 |Sbenefit6 |Trust    |Datetrust              |TrustPercent  |Bname |Blname |Relationship |Perc |Bname1   |Blname1 |Relationship1  |Perc1 |Desc     |SSN        |Mstatus   |Sex    |MemId     |Frequency    |Street                  |City            |Zipcode   |PhoneType |PhoneNum   |BusinessName |BusinessType  |SSSN      |SHeight|SWeight |SSex    |SPhoneType |SPhoneNum    |TypeofCove |TypeofCove1        |HII_amount1 |HII_amount2 |HII_amount3 |HII_amount4 |HII_amount5 |pdfScenario|pdfEnable|                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
#|acs     |Mr.    |Edward  |Cullen |Quebec  |SYSDATE-64Y/11M/30D  |30    |Mrs.   |Bella   |Cullen   |SYSDATE-64Y/11M/30D |Rhode Island   |SYSDATE-16Y/11M/30D  |SYSDATE - 80Y/00M/00D |SYSDATE - 65Y/00M/00D   |550000   |375000    |475000    |300000    |100000    |500       |500       |kennedy  |SYSDATE - 69Y/02M/05D  |100 %         |John  |Adams  |Son          |99   |Samantha |Jonas   |Other          |1     |Friend   |744658954  |Married   |Male   |657125895 |Semiannually |2160 Mineral Spring Ave |North Providence|02911     |Home      |7854364751 |Arthur Corp  |Partnership   |472596847 |5.1    |180     |Female  |Business   |8798325897   |New        |Change in Coverage |100         |200         |300         |400         |500      |ACS02|1  | |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           

@AcsRegression_3
Scenario Outline:<ACSSC03> Application Submission for Child Only with TenYTL and HII

Given Test set up for "NYL" feature and "NYL_ACS" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Click on Child
Then Eligibility page details are displayed to user 
Then Select YES Radio button of Membership
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
And Selects Married question as Yes for Child
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
And Validates Add Child Button on Eligibility page is not present
And Clicks on next button
Then Product page details are displayed to user
And Selects product TenYTL for Child
And Verify Child icon is disabled for TermLife
And Verify Child icon is disabled for FifteenYTL
And Verify Child icon is disabled for TwentyYTL
And Selects product HII for Child
And Clicks on next button
Then Click YES for Dependent Coverage information
Then Request Coverage page is displayed to user 
And Validates benefit amount for Child as "<Cbenefit>" under TenYTL displayed in label
And Validates "<C2fname>","<C3fname>","<C4fname>" and "<C5fname>" are not displayed in eligible children under TenYTL
And Selects Type of Coverage as "<TypeofCove>" for Child under HII
And Validates under HII the Benefit Amounts for Child Listed are:"<HII_amount1>","<HII_amount2>","<HII_amount3>","<HII_amount4>","<HII_amount5>"
And Selects Benefit Amount for Child as "<CBenefit1>" under HII
And Validates"<C2fname>","<C3fname>","<C4fname>" are not displayed in eligible children
And Clicks on next button
Then Contact Details page is displayed to user
And Enter Contact Details for self for Child only policy as "<SSN>","<Mstatus>","<Sex>","<Street>","<City>","<Zipcode>"
And Selects Frequency as "<Frequency>" at contact page
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Selects Residential Radio Button
And Clicks on next button
And Validates Membership ID Required Message
And Enters Membership ID as "<MemId>" for Self
And Clicks on next button
Then Application Summary Page is displayed to user 
And Verify Child name as "<C1fname>","<C1lname>"
And Verify Benefit Amount for child "<C1fname>","<TenSequenceNo>" as "<Cbenefit>" under TenYTL
And Verify Benefit Amount for child as "<CBenefit1>" under HII
And Verify Child name as "<C5fname>","<C5lname>"
And Verify Benefit Amount for child as "<CBenefit1>" under HII
And Verify Child name as "<C6fname>","<C6lname>"
And Verify Benefit Amount for child "<C6fname>","<TenSequenceNo1>" as "<Cbenefit>" under TenYTL
And Verify Benefit Amount for child as "<CBenefit1>" under HII
And Verify Child name as "<C7fname>","<C7lname>"
And Verify Benefit Amount for child "<C7fname>","<TenSequenceNo2>" as "<Cbenefit>" under TenYTL
And Verify Benefit Amount for child as "<CBenefit1>" under HII
And Verify Child name as "<C8fname>","<C8lname>"
And Verify Benefit Amount for child "<C8fname>","<TenSequenceNo3>" as "<Cbenefit>" under TenYTL
And Verify Benefit Amount for child as "<CBenefit1>" under HII
And Clicks on next button
Then Authorize page details are displayed to user 
And Clicks on next button
And Validate Error message for Authorization
Then Authorize page details are displayed to user and confirm the term and conditions for Self 
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"
And Verify PDF information as "<pdfScenario>","<pdfEnable>"


Examples:
|website  |Title  |Fname    |Lname        |State    |DOB                   |WorkHr |C1fname |C1lname  |C1DOB   |C1Sex  |C2fname  |C2lname  |C2DOB                  |C2Sex  |C3fname |C3lname |C3DOB                 |C3Sex   |C4fname |C4lname |C4DOB                 |C4Sex   |C5fname    |C5lname |C5DOB                  |C5Sex   |C6fname |C6lname |C6DOB                |C6Sex  |C7fname |C7lname |C7DOB                 |C7Sex   |C8fname |C8lname |C8DOB                 |C8Sex    |Cbenefit |CBenefit1  |SSN       |Mstatus  |Sex    |MemId           |Frequency|Street              |City       |Zipcode |PhoneType |PhoneNum   |TypeofCove |HII_amount1 |HII_amount2 |HII_amount3 |HII_amount4 |HII_amount5 |pdfScenario|pdfEnable|TenSequenceNo|TenSequenceNo1|TenSequenceNo2|TenSequenceNo3|                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
|acs      |Mr.    |Lucifer  |Morningstar  |Alaska   |SYSDATE - 59Y/11M/30D |45     |John    |Gill     |SYSDATE |Male   |Samantha |Gill     |SYSDATE - 26Y/00M/00D  |Female |Martha  |Gill    |SYSDATE - 24Y/11M/30D |Female  |Peter   |Gill    |SYSDATE - 24Y/11M/30D |Male    |Josephine  |Gill    |SYSDATE - 25Y/11M/30D  |Female  |Lola    |Gill    |SYSDATE - 12Y/06M/05D|Female |Carter  |Simons  |SYSDATE - 23Y/11M/30D |Male    |John    |Simons  |SYSDATE - 17Y/04M/16D |Male     |10000    |200        |987475896 |Divorced |Male   |665887422555455 |Annually |7025 Gold Kings Ave |Anchorage  |99504   |Home      |9869785965 |New        |100         |200         |300         |400         |500        |ACS03       |0        |1            |2             |3             |4             |

#@AcsRegression_3PDF
#Examples:
#
#|website  |Title  |Fname    |Lname        |State    |DOB                   |WorkHr |C1fname |C1lname  |C1DOB   |C1Sex  |C2fname  |C2lname  |C2DOB                  |C2Sex  |C3fname |C3lname |C3DOB                 |C3Sex   |C4fname |C4lname |C4DOB                 |C4Sex   |C5fname    |C5lname |C5DOB                  |C5Sex   |C6fname |C6lname |C6DOB                |C6Sex  |C7fname |C7lname |C7DOB                 |C7Sex   |C8fname |C8lname |C8DOB                 |C8Sex    |Cbenefit |Cbenefit1  |SSN       |Mstatus  |Sex    |MemId           |Frequency|Street              |City       |Zipcode |PhoneType |PhoneNum   |TypeofCove |HII_amount1 |HII_amount2 |HII_amount3 |HII_amount4 |HII_amount5 |pdfScenario|pdfEnable|TenSequenceNo|TenSequenceNo1|TenSequenceNo2|TenSequenceNo3|                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
#|acs      |Mr.    |Lucifer  |Morningstar  |Alaska   |SYSDATE - 59Y/11M/30D |45     |John    |Gill     |SYSDATE |Male   |Samantha |Gill     |SYSDATE - 26Y/00M/00D  |Female |Martha  |Gill    |SYSDATE - 24Y/11M/30D |Female  |Peter   |Gill    |SYSDATE - 24Y/11M/30D |Male    |Josephine  |Gill    |SYSDATE - 25Y/11M/30D  |Female  |Lola    |Gill    |SYSDATE - 12Y/06M/05D|Female |Carter  |Simons  |SYSDATE - 23Y/11M/30D |Male    |John    |Simons  |SYSDATE - 17Y/04M/16D |Male     |10000    |200        |987475896 |Divorced |Male   |665887422555455 |Annually |7025 Gold Kings Ave |Anchorage  |99504   |Home      |9869785965 |New        |100         |200         |300         |400         |500        |ACS03       |1        |1            |2             |3             |4             | 

@AcsRegression_4
Scenario Outline:<ACSSC04> Application Submission for Self, Spouse with HII and Child with FifteenYTL,HII

Given Test set up for "NYL" feature and "NYL_ACS" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Click on Self
Then Click on Spouse
Then Click on Child
Then Eligibility page details are displayed to user 
Then Select YES Radio button of Membership
And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
And Selects Married question as No for Child
And Click on Add Child button on Screen
And Clicks on next button
And Verify that error message is displayed as help us to display at top of the page
And Select radio button Yes for Spouse is Member
And Clicks on next button
Then Product page details are displayed to user
And Validates that Self & Spouse are not displayed at product page for TermLife, TenYTL, FifteenYTL, TwentyYTL
And Validates that Self and Spouse are displayed for HII
And Selects product FifteenYTL for Child
And Verify Child icon is disabled for TermLife
And Verify Child icon is disabled for TenYTL
And Verify Child icon is disabled for TwentyYTL
And Selects product HII for Self
And Selects product HII for Spouse
And Selects product HII for Child
And Clicks on next button
Then Click YES for Dependent Coverage information
Then Request Coverage page is displayed to user
Then Validates Benefit Amount for Child as "<Cbenefit>" under FifteenYTL
And Selects Type of Coverage as "<TypeofCove1>" for Self under HII
And Selects Benefit Amount for Self as "<Benefit>" under HII
And Validates Benefit Amount for Spouse as "<Sbenefit>" under HII
And Selects Type of Coverage as "<TypeofCove1>" for Spouse under HII
And Validates Benefit Amount for Child as "<Cbenefit1>" under HII
And Selects Type of Coverage as "<TypeofCove1>" for Child under HII
And Clicks on next button
Then Contact Details page is displayed to user and enters contact Details for self as "<SSN>","<Mstatus>","<Sex>","<MemId>","<Street>","<City>","<Zipcode>"
And Validates Height and Weight is not displayed for Self 
And Selects Frequency as "<Frequency>" at contact page
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Selects Residential Radio Button
And Enters contact Details for Spouse as mimimum details "<SSSN>","<SSex>","<SPhoneType>","<SPhoneNum>"
And Clicks on next button
Then Application Summary Page is displayed to user 
And Clicks on next button
Then Authorize page details are displayed to user and confirm the term and conditions for Self 
And Authorize page details are displayed to user and confirm the term and conditions for Spouse
And Validates I Understand verbiage one in Read and Sign Box
And Validates Consent message in Read and Sign Box for NonUW
And Verify Supplemental Health Note in Authorization Page 
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish  
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"
And Verify PDF information as "<pdfScenario>","<pdfEnable>"


Examples:
#|website |Title  |Fname   |Lname  |State       |DOB         |WorkHr|Stitle |Sfname  |Slname  |SDOB        |SWorkHr|Cfname |Clname |CDOB      |Csex   |Cbenefit |Benefit |Sbenefit |Cbenefit1   |SSN        |Mstatus          |Sex    |MemId  |Frequency |Street  |City        |ZipCode   |PhoneType |PhoneNum   |SSSN      |SSex   |SPhoneType |SPhoneNum |TypeofCove|TypeofCove1| 
#|acs     |Mr.    |Adam    |Gill   |Pennsylvania|02/06/1948  |45    |Mrs.   |Bella   |Gill    |05/20/1948  |45     |John   |Gill   |07/03/2012|Male   |10000    |400     |400      |400         |990067673  |Domestic Partner |Male   |147596 |Quarterly |main st |providence  |10110     |Business  |5343545143 |990067501 |Female |Business   |5454856876|New       |Change in Coverage| 

|website |Title  |Fname   |Lname  |State        |WorkHr|DOB                   |Stitle |Sfname  |Slname   |SDOB                  |Cfname |Clname |CDOB                 |Csex   |Cbenefit |Benefit |Sbenefit |Cbenefit1   |SSN        |Mstatus           |Sex    |MemId        |Frequency |Street         |City        |Zipcode   |PhoneType |PhoneNum   |SSSN      |SSex     |SPhoneType |SPhoneNum   |TypeofCove1       |pdfScenario|pdfEnable|                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
|acs     |Mr.    |Carter  |Jonas  |Pennsylvania |45  |SYSDATE - 65Y/00M/00D   |Mrs.   |Martha  |Jonas    |SYSDATE - 65Y/00M/00D |John   |Jonas  |SYSDATE - 24Y/11M/30D|Male   |10000    |400     |400      |400         |742103210  |Domestic Partner* |Male   |302145987969 |Quarterly |288 Meadow Ave |Pittsburgh  |15202     |Business  |6987547859 |987021201 |Female   |Business   |9874147021  |Change in Coverage|ACS04      |0   | 

#@AcsRegression_4_PDF
#Examples:
#|website |Title  |Fname   |Lname  |State        |WorkHr|DOB                   |Stitle |Sfname  |Slname   |SDOB                  |Cfname |Clname |CDOB                 |Csex   |Cbenefit |Benefit |Sbenefit |Cbenefit1   |SSN        |Mstatus           |Sex    |MemId        |Frequency |Street         |City        |Zipcode   |PhoneType |PhoneNum   |SSSN      |SSex     |SPhoneType |SPhoneNum   |TypeofCove1       |pdfScenario|pdfEnable|                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
#|acs     |Mr.    |Carter  |Jonas  |Pennsylvania |45  |SYSDATE - 65Y/00M/00D   |Mrs.   |Martha  |Jonas    |SYSDATE - 65Y/00M/00D |John   |Jonas  |SYSDATE - 24Y/11M/30D|Male   |10000    |400     |400      |400         |742103210  |Domestic Partner* |Male   |302145987969 |Quarterly |288 Meadow Ave |Pittsburgh  |15202     |Business  |6987547859 |987021201 |Female   |Business   |9874147021  |Change in Coverage|ACS04      |1   | 

@AcsRegression_5
Scenario Outline:<ACSSC05> Application Submission for Self only with All products Beneficiary - Primary Trust, Contingent Individual

Given Test set up for "NYL" feature and "NYL_ACS" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Click on Self
Then Eligibility page details are displayed to user
Then Select YES Radio button of Membership
And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
And Clicks on next button
And Validate Age Restriction Message
And Enters DOB for Self as "<DOB1>"
And Clicks on next button
Then Product page details are displayed to user
##And Validates that Self is not displayed at product page for TermLife, TenYTL, FifteenYTL, TwentyYTL, ADDI, LTD, STD, SDI,OOEDI
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB2>"
And Clicks on next button
#Then Validates that Self is not displayed at product page for SDI, OOEDI
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB3>"
And Clicks on next button
Then Validates that Self is not displayed at product page for SDI
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB4>"
And Clicks on next button
Then Validates that Self is displayed at product page for TermLife, TenYTL, FifteenYTL, TwentyYTL, ADDI, LTD, STD, OOEDI, SDI, HII
And Clicks on Back or Previous button
And Enter New State as "<State1>"
And Clicks on next button
#Then Validates that Self is not displayed at product page for FifteenYTL, ADDI, LTD, STD, OOEDI, SDI, HII
And Clicks on Back or Previous button
And Enter New State as "<State2>"
And Clicks on next button
Then Validates that Self is not displayed at product page for FifteenYTL, STD, SDI, HII
And Clicks on Back or Previous button
And Enter New State as "<State3>"
And Clicks on next button
#Then Validates that Self is not displayed at product page for STD, SDI, HII
And Clicks on Back or Previous button
And Enters Self WorkHr as "<WorkHr1>"
And Clicks on next button
#Then Validates that Self is not displayed at product page for LTD, STD, SDI, OOEDI
And Clicks on Back or Previous button
And Enters Self WorkHr as "<WorkHr2>"
And Clicks on next button
#Then Validates that Self is not displayed at product page for LTD, STD, OOEDI
And Clicks on Back or Previous button
And Enters Self WorkHr as "<WorkHr>"
And Enter New State as "<State>"
And Clicks on next button
Then Selects product TermLife for Self
And Selects product TenYTL for Self
And Selects product FifteenYTL for Self
And Selects product TwentyYTL for Self
And Selects product Accidental Death for Self 
And Selects product LTD for Self
And Selects product STD for Self
And Selects product OOEDI for Self
And Selects product SDI for Self
And Selects product HII for Self
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
And Selects Answer as No for all additional questions of Group Disability Insurance for Self
And Enters Monthly Income for Self as "<MonthlyIncome>"
And Enters details for Monthly Expense and Percentage Responsible as "<Mexpense>","<Percresp>"
And Clicks on next button
Then Request Coverage page is displayed to user
And Validates under LTD the Benefit Slider Range as "<Min_LTD>" to "<Max_LTD>"
And Clicks on Back or Previous button
And Enters Monthly Income for Self as "<MonthlyIncome1>"
And Clicks on next button
And Validates under STD the Benefit Slider Range as "<Min_STD>" to "<Max_STD>" for self
And Validates under OOEDI the Benefit Slider Range as "<Min_OOED>" to "<Max_OOED>"
And Clicks on Back or Previous button
And Enters Monthly Income for Self as "<MonthlyIncome2>"
And Enters Monthly Expense for Self as "<Mexpense1>"
And Clicks on next button
And Validates under LTD the Benefit Slider Range as "<Min_LTD1>" to "<Max_LTD1>"
And Clicks on Back or Previous button
And Enters Monthly Income for Self as "<MonthlyIncome3>"
And Enters Monthly Expense for Self as "<Mexpense1>"
And Clicks on next button
And Validates under STD the Benefit Slider Range as "<Min_STD1>" to "<Max_STD1>" for self
And Validates under OOEDI the Benefit Slider Range as "<Min_OOED1>" to "<Max_OOED1>"

And Selects Type of Coverage as "<TypeofCove>" for Self under Term Life
And Selects Benefit Amount for Self as "<Benefit>" under TermLife
And Selects Type of Coverage as "<TypeofCove1>" for Self under TenYTL
And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
And Selects Type of Coverage as "<TypeofCove>" for Self under FifteenYTL
And Selects Benefit Amount for Self as "<Benefit2>" under FifteenYTL
And Selects Type of Coverage as "<TypeofCove1>" for Self under TwentyYTL
And Selects Benefit Amount for Self as "<Benefit3>" under TwentyYTL
And Selects Type of Coverage as "<TypeofCove1>" for Self under ADDI
And Selects Benefit Amount for Self as "<Benefit4>" under ADDI
And Selects Type of Coverage as "<TypeofCove>" for Self under LTD
And Selects Benefit Amount for Self as "<Benefit5>" under LTD
And Selects Wait Period for Self as "<WaitPeriod>" under LTD
And Selects Type of Coverage as "<TypeofCove1>" for Self under STD
And Selects Benefit Amount for Self as "<Benefit6>" under STD
And Selects Wait Period for Self as "<WaitPeriod1>" under STD
And Validates Benefit Duration for Self as "<BenDuration>" under STD
And Selects Type of Coverage as "<TypeofCove1>" for Self under OOEDI
And Selects Benefit Amount for Self as "<Benefit7>" under OOEDI
And Validates Wait Period for Self as "<WaitPeriod2>" under OOEDI
And Validates Benefit Duration for Self as "<BenDuration1>" under OOEDI displayed in label
And Selects Type of Coverage as "<TypeofCove1>" for Self under SDI
And Selects Benefit Amount for Self as "<Benefit8>" under SDI
And Validates Wait Period for Self as "<WaitPeriod3>" under SDI
And Selects Benefit Duration for Self as "<BenDuration2>" under SDI
And Selects Type of Coverage as "<TypeofCove1>" for Self under HII
And Selects Benefit Amount for Self as "<Benefit9>" under HII
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button under ADDI for Self
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And User Enters Beneficiary details as "<Trust>","<DateTrust>"
And Clicks on OK button
And Verify that the Percent Displayed for Trust is "<TrustPercent>" for ADDI
And Clicks on Add Beneficiary Button under ADDI for Self
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And User Enters Beneficiary details as "<Trust1>","<DateTrust>"
And Clicks on OK button
And Validates error message on Add Beneficiary page-Only one Trust is allowed as Primary
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
And Clicks on OK button
And Clicks on next button
Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<MemId>","<Street>","<City>","<Zipcode>"
And Selects Frequency as "<Frequency>" at contact page
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Validate the Travel Question for Non QD application for Self
And Selects No for Travel Question Non QD for Self
And Selects Residential Radio Button
And Selects Yes Radio Button for Business Address
And Enters Business Details as "<BusinessName>","<BusinessType>"
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

|website |Title  |Fname   |Lname  |State      |DOB                    |WorkHr   |DOB1                 |DOB2                  |DOB3                  |DOB4                   |State1     |State2   |State3  |WorkHr1 |WorkHr2 |MonthlyIncome |Mexpense  |Percresp |MonthlyIncome1 |MonthlyIncome2 |Mexpense1 |Benefit    |Benefit1 |Benefit2 |Benefit3 |Benefit4 |Benefit5 |WaitPeriod |Benefit6 |WaitPeriod1   |BenDuration |Benefit7 |WaitPeriod2 |BenDuration1 |Benefit8 |WaitPeriod3 |BenDuration2 |Benefit9 |Trust  |DateTrust               |TrustPercent |Trust1    |Bname |Blname |Relationship |Perc|SSN        |Mstatus |Height |Weight  |Sex    |MemId    |Frequency |Street     |City        |Zipcode   |PhoneType |PhoneNum     |BusinessName |BusinessType |Min_LTD |Max_LTD |Min_STD |Max_STD |Min_OOED|Max_OOED|Min_LTD1 |Max_LTD1 |MonthlyIncome3 |Min_STD1 |Max_STD1 |Min_OOED1 |Max_OOED1|TypeofCove |TypeofCove1 |pdfScenario|pdfEnable|        
|acs     |Mr.    |Adam    |Gill   |Delaware   |SYSDATE - 80Y/00M/00D  |30       |SYSDATE - 79Y/11M/30D|SYSDATE - 64Y/11M/30D |SYSDATE - 50Y/00M/00D |SYSDATE - 49Y/11M/30D  |Washington |Florida  |Montana |19      |20      |33500         |19500     |100      |7000           |33000          |21000     |$1,000,000 |$500,000 |$500,000 |$100,000 |$100,000 |$4,500   |30 Days    |$1,500   |Plan I:  7 Day|6 Months    |$1,000   |30 Days     |24 months    |$2,500   |90 days     |10-Year      |$200     |Arthur |SYSDATE - 12Y/00M/00D   |100 %        |Mc Arthur |Nick  |Jonas  |Son          |100 |784120320  |Widowed |5.0    |180     |Male   |74154001 |Annually  |35 Lynn Dr |Newark      |19711     |Business  |7410102154   |Charters Co. |Corporation  |$1,000  |$20,000 |$200    |$4,900  |$1,000  |$19,000 |$1,000   |$19,500  |8000           |$200      |5000    |$1,000    |$20,000  |New |Change in Coverage | ACS05     |0   |

#@AcsRegression_5_PDF
#Examples:
#|website |Title  |Fname   |Lname  |State      |DOB                    |WorkHr   |DOB1                 |DOB2                  |DOB3                  |DOB4                   |State1     |State2   |State3  |WorkHr1 |WorkHr2 |MonthlyIncome |Mexpense  |Percresp |MonthlyIncome1 |MonthlyIncome2 |Mexpense1 |Benefit    |Benefit1 |Benefit2 |Benefit3 |Benefit4 |Benefit5 |WaitPeriod |Benefit6 |WaitPeriod1   |BenDuration |Benefit7 |WaitPeriod2 |BenDuration1 |Benefit8 |WaitPeriod3 |BenDuration2 |Benefit9 |Trust  |DateTrust               |TrustPercent |Trust1    |Bname |Blname |Relationship |Perc |SSN        |Mstatus |Height |Weight  |Sex    |MemId    |Frequency |Street     |City        |Zipcode   |PhoneType |PhoneNum     |BusinessName |BusinessType |Min_LTD |Max_LTD |Min_STD |Max_STD |Min_OOED|Max_OOED|Min_LTD1 |Max_LTD1 |MonthlyIncome3 |Min_STD1 |Max_STD1 |Min_OOED1 |Max_OOED1|TypeofCove |TypeofCove1 |pdfScenario|pdfEnable|        
#|acs     |Mr.    |Adam    |Gill   |Delaware   |SYSDATE - 80Y/00M/00D  |30       |SYSDATE - 79Y/11M/30D|SYSDATE - 64Y/11M/30D |SYSDATE - 50Y/00M/00D |SYSDATE - 49Y/11M/30D  |Washington |Florida  |Montana |19      |20      |33500         |19500     |100      |7000           |33000          |21000     |$1,000,000 |$500,000 |$500,000 |$100,000 |$100,000 |$4,500   |30 Days    |$1,500   |Plan I:  7 Day|6 Months    |$1,000   |30 Days     |24 months    |$2,500   |90 days     |10-Year      |$200     |Arthur |SYSDATE - 12Y/00M/00D   |100 %        |Mc Arthur |Nick  |Jonas  |Son          |100  |784120320  |Widowed |5.0    |180     |Male   |74154001 |Annually  |35 Lynn Dr |Newark      |19711     |Business  |7410102154   |Charters Co. |Corporation  |$1,000  |$20,000 |$200    |$4,900  |$1,000  |$19,000 |$1,000   |$19,500  |8000           |$200      |5000    |$1,000    |$20,000  |New |Change in Coverage | ACS05     |0   |

@AcsRegression_6
Scenario Outline: <ACSSC06> Application submission for Self and Child and with TwentyYTL             

Given Test set up for "NYL" feature and "NYL_ACS" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Click on Self
Then Click on Child
Then Eligibility page details are displayed to user
Then Select YES Radio button of Membership
And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
And Click on Add Child button 
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
And Selects Married question as No for Child
And Click on Add Child button on Screen
And Clicks on next button
Then Product page details are displayed to user
And Clicks on next button
And Validate Error Message on Product Page
 And Selects product TwentyYTL for Self
And Selects product TwentyYTL for Child
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
And Clicks on next button
Then Request Coverage page is displayed to user
And Selects Benefit Amount for Self as "<Benefit>" under TwentyYTL
And Selects Type of Coverage as "<TypeofCove>" for Self under TwentyYTL
And Validates benefit amount for Child as "<Cbenefit>" under TwentyYTL displayed in label
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on button to Save for later
Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<Vpassword>" 
And Clicks OK Button Save For Later
Then  Refresh the browser
Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive
And Clicks on Skip Beneficiary Button
And Clicks on next button
Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<MemId>","<Street>","<City>","<Zipcode>"
And Selects Frequency as "<Frequency>" at contact page
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Selects No for Travel Question Non QD for Self
And Selects Residential Radio Button
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



#|website|Title  |Fname   |Lname  |State       |DOB         |WorkHr|Cfname |Clname |CDOB      |Csex   |Benefit     |Cbenefit |Password |Vpassword|SSN      |Mstatus   |Height|Weight |Sex    |MemId  |Frequency   |Street  |City        |Zipcode   |PhoneType|PhoneNum |TypeofCove|          
#|acs    |Mr.    |Adam    |Gill   |Washington  |02/06/1975  |40    |John   |Gill   |07/03/2016|Male   |$2,000,000  |$10,000 |Adam@123  |Adam@123 |990067673|CivilUnion|6.0   |220    |Male   |147596 |Semiannually|main st |providence  |10110     |Mobile     |5343545143 |    New   |      

Examples:
|website |Title  |Fname     |Lname  |State       |WorkHr |DOB                   |Cfname |Clname   |CDOB        |Csex     |Benefit     |Cbenefit |Password |Vpassword |SSN         |Mstatus     |Height  |Weight |Sex    |MemId      |Frequency      |Street             |City    |Zipcode   |PhoneType |PhoneNum     |TypeofCove |pdfScenario|pdfEnable|       
|acs     |Mr.    |Jameson   |Parker |Washington  |40     |SYSDATE - 17Y/11M/30D |Mary   |Parker   |CurrentDate |Female   |$4,000,000  |$10,000  |Adam@123 |Adam@123  |997415897   |Civil Union |6.0     |220    |Male   |0145789899 |Semiannually   |9520 Rainier Ave S |Seattle |98118     |Mobile    |7485784730   |New        | ACS06     |0        |      

#@AcsRegression_6_PDF
#Examples:
#|website |Title  |Fname     |Lname  |State       |WorkHr |DOB                   |Cfname |Clname   |CDOB        |Csex     |Benefit     |Cbenefit |Password |Vpassword |SSN         |Mstatus     |Height  |Weight |Sex    |MemId      |Frequency      |Street             |City    |Zipcode   |PhoneType |PhoneNum     |TypeofCove |pdfScenario|pdfEnable|       
#|acs     |Mr.    |Jameson   |Parker |Washington  |40     |SYSDATE - 17Y/11M/30D |Mary   |Parker   |CurrentDate |Female   |$4,000,000  |$10,000  |Adam@123 |Adam@123  |997415897   |Civil Union |6.0     |220    |Male   |0145789899 |Semiannually   |9520 Rainier Ave S |Seattle |98118     |Mobile    |7485784730   |New        | ACS06     |0        |      

@AcsRegression_7
Scenario Outline: <ACSSC07> Validation Read & Sign Page with 20 different States one by one in loop


Given Test set up for "NYL" feature and "NYL_ACS" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Click on Self
Then Eligibility page details are displayed to user 
Then Select YES Radio button of Membership 
And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
And Clicks on next button
Then Product page details are displayed to user
And Selects product TermLife for Self
And Selects product Accidental Death for Self 
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
And Clicks on next button
Then Request Coverage page is displayed to user
And Selects Benefit Amount for Self as "<Benefit>" under TermLife
And Selects Type of Coverage as "<TypeofCove>" for Self under Term Life
And Selects Benefit Amount for Self as "<Benefit1>" under ADDI
And Selects Type of Coverage as "<TypeofCove>" for Self under ADDI
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Self under TermLife
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relation>","<Percen>"
And Clicks on OK button
And Clicks on Skip Beneficiary Button
And Delete box is displayed and clicks on Yes
Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<MemId>","<Street>","<City>","<Zipcode>"
And Selects Frequency as "<Frequency>" at contact page
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Selects No for Travel Question Non QD for Self 
And Selects Residential Radio Button
And Clicks on next button
Then Application Summary Page is displayed to user 
And Clicks on next button
Then Authorize page details are displayed to user 	 
	And Validate Authorization message in Read and Sign Box
	And Validate Fraud Notice CO in Read and Sign Box
	And Validate Consent message in Read and Sign Box
Then Validates I Understand verbiage one in Read and Sign Box
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
And Validate Authorization Message MN in Read and Sign Box
And Validate Fraud Notice MN in Read and Sign Box
And Navigate back to Eligibility page
And Enter New State as "<State13>"
And Clicks on next button
Then Product page details are displayed to user
##And Deselects Self for Accidental Death Product
And Clicks on next button
And Confirms Imp Replacement Info for NewYork state
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Verify that fraud notice is not rendered at Authorization page





Examples:
|website|Title|Fname|Lname|State   |DOB        |WorkHr|Benefit |Benefit1|Bfname|Blname |Relation|Percen|SSN      |Mstatus |Height|Weight |MemId          |Street  |Zipcode|City       |PhoneType |PhoneNum  |Frequency|State1     |State2  |State3  |State4   |State5      |State6       |State7  |State8               |State9  |State10 |State11|State12    |State13 |State14 |State15    |State16   |State17   |State18 |State19 |State20    |State21    |State22|TypeofCove|
|acs    |Mr.  |Adam |Gill |Colorado|08/01/1965 |45    |1500000 |100000  |JOHN  |CARTER |Spouse  |100   |553434348|Single  |6.0   |180    |545345343543543|main st |10110  |providence |Mobile      |5343541543|Quarterly|California |Alabama |Arkansas|Louisiana|Pennsylvania|Rhode Island |Maryland|District of Columbia |Florida |Kansas  |Maine  |New Jersey |New York|Oklahoma|Puerto Rico|Tennessee |Washington|Virginia|Wyoming |New Mexico |Connecticut|Minnesota|New   |
