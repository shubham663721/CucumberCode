Feature: Abe Rate Test
@AsceRate_01
Scenario Outline: <ASCESCR01>Complete work flow of application for Smoker,Non Montana

	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	Then Select YES Radio button of Membership
	Then Click on Self
	Then Click on Spouse
	Then Click on Child
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	And Enters Eligibility details for Spouse as "<STitle>","<Sfname>","<Slname>","<SDOB>","<SWorkHr>"
	And Select radio button NO for Spouse is Member
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<CSex>"
	And Selects Married question as No for Child
	And Selects No for full time student for Child
	And Click on Add Child button on Screen
	And Clicks on next button
	Then Product page details are displayed to user
	And Selects product TermLife for Self
	And Selects product TermLife for Spouse
	And Selects product TermLife for Child
	And Selects product TenYTL for Self
	And Selects product TenYTL for Spouse
	And Verify Child icon is disabled for TenYTL
	And Selects product TwentyYTL for Self
	And Selects product TwentyYTL for Spouse
	And Verify Child icon is disabled for TwentyYTL
	And Selects product HLDD for Self
	And Selects product HLDD for Spouse
	And Selects product HLDD for Child
	And Selects product DII for Self
	And Selects product DII for Spouse
	And Selects product HII for Self
	And Selects product HII for Spouse
	And Selects product HII for Child
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
	And Confirms Imp Replacement Info for NewYork state
	And Selects Answer as No for all Group Disability Insurance for Self	
	And Enters Monthly Income for Self as "<MonthlyIncome>"
	And Selects Yes for Do you have other life insurance in force for Self
	And Enters Total Amount for Self as "<TotalAmt>"
	And Selects Yes for life insurance applied for intended to replace for Self
	And Selects Yes for Do you have other life insurance in force for Spouse
	And Enters Total Amount for Spouse as "<STotalAmt>"
	And Selects Yes for life insurance applied for intended to replace for Spouse
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under TermLife
	And Checks Chronic Illness Rider for Self checkbox under TermLife 
	And Selects CIR portion for Self as "<CIR>" under TermLife
	And Selects Benefit Amount for Spouse as "<Sbenefit>" under TermLife
	And Checks CIR checkbox for Spouse
	And Selects CIR portion for Spouse as "<Scir>" under TermLife
	And Selects Benefit Amount for Child as "<Cbenefit>" under TermLife
	And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit1>" under TenYTL
	And Selects Benefit Amount for Self as "<Benefit2>" under TwentyYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit2>" under TwentyYTL
	And Selects Benefit Amount for Self as "<Benefit3>" under HLDD
	And Selects Benefit Amount for Spouse as "<Sbenefit3>" under HLDD
	And Selects Benefit Amount for Child as "<Cbenefit3>" under HLDD
	And Selects Monthly Benefit Amount for Self as "<Benefit4>" under DII
	And Selects Waiting Period for Self as "<WaitP>" under DII
	And Selects Benefit Option for Self as "<BenOpt>" under DII
	And Validates Monthly Benefit Amount for Spouse as "<Sbenefit4>" under DII
	And Validates Waiting Period for Spouse as "<SWaitP>" under DII
	And Validates Benefit Period for Spouse as "<SBenPer>" under DII
	And Selects Benefit Amount for Self as "<Benefit5>" under HII
	And Selects Benefit Amount for Spouse as "<Sbenefit5>" under HII
	And Selects Benefit Amount for Child as "<Cbenefit5>" under HII
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on next button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No for Travel Question Non QD for Self
	And Selects Yes Radio button for Tobacco Question
	And Enters Last Used Tobacco Date Details for Self as "<TobDate>"
	And  Clicks on Products used textbox for Self and Selects Product as "<Product>"
	And Selects Residential Radio Button
	And Selects Yes Radio Button for Business Address
	And Enters Business Details as "<BusinessName>","<BusinessType>"
	And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>"
	And Selects No for Travel Question Non QD for Spouse
	And Selects Yes Radio button for Tobacco Question for Spouse
	And Enters Last Used Tobacco Date Details for Spouse as "<STobDate>"
	And Clicks on Products used textbox for Spouse and Selects Product as "<SProduct>"
	And Clicks on next button
	Then Application Summary Page is displayed to user
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Selects Payment Method for TermLife
	And Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for Term Life Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium>" for Benefit Amount "<Benefit>" under TermLife
	And Validates Estimated Premium for Spouse as "<Spremium>" for Benefit Amount "<Sbenefit>" under TermLife
	And Validates Estimated Premium for Child as "<Cpremium>" for Benefit Amount "<Cbenefit>" under TermLife
	And Validates Total Premium as "<Total>" under TermLife
	And Selects Payment Method for TenYTL
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Ten Year Product and reviews "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium1>" for Benefit Amount "<Benefit1>" under TenYTL
	And Validates Estimated Premium for Spouse as "<Spremium1>" for Benefit Amount "<Sbenefit1>" under TenYTL
	And Validates Total Premium as "<Total1>" under TenYTL
	And Selects Payment Method for TwentyYTL
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Twenty Year Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium2>" for Benefit Amount "<Benefit2>" under TwentyYTL
	And Validates Estimated Premium for Spouse as "<Spremium2>" for Benefit Amount "<Sbenefit2>" under TwentyYTL
	And Validates Total Premium as "<Total2>" under TwentyYTL
	And Clicks on Payment Method for HLDD 
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for HLDD Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium3>" for Benefit Amount "<Benefit3>"under HLDD
	And Validates Estimated Premium for Spouse as "<Spremium3>" for Benefit Amount "<Sbenefit3>" under HLDD
	And Validates Estimated Premium for Child as "<Cpremium3>" for Benefit Amount "<Cbenefit3>" under HLDD
	And Validates Total Premium as "<Total3>" under HLDD
	And Clicks on Payment Method for DII 	
	And Selects Radio Button for existing payment method
	And Clicks on Save button	
	And Selects Frequency for DII Product "<Frequency>"	
	And Validates Estimated Premium for Self as "<Mpremium4>" for Benefit Amount "<Benefit4>" under DII
	And Validates Estimated Premium for Spouse as "<Spremium4>" for Benefit Amount "<Sbenefit4>" under DII
	And Validates Total Premium as "<Total4>" under DII
	And Clicks on Payment Method for HII 
	And Selects Radio Button for existing payment method	
	And Clicks on Save button	
	And Selects Frequency for HII Product "<Frequency>"	
	And Validates Estimated Premium is not available under HII
	And Confirms I have read the Information Check Box on Payment Page	
	And Clicks on button to Save for later
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>" 
	And Clicks OK Button Save For Later
	Then Refresh the browser
	Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive
	And Navigate back to Eligibility page 
	And Enters DOB for Self as "<DOB1>"
	And Enters DOB for Spouse as "<SDOB1>"
	And Clicks Edit button for Child Added	
	And Enters DOB for Child as "<CDOB1>"
	And Click on Add Child button on Screen
	And Clicks on next button
	Then Product page details are displayed to user
	And DeSelects product TermLife for Child
	And Selects product TenYTL for Child
	And Clicks on next button
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit6>" under TermLife
	And Selects CIR portion for Self as "<CIR1>" under TermLife
	And Selects Benefit Amount for Spouse as "<Sbenefit6>" under TermLife
	And Selects CIR portion for Spouse as "<Scir1>" under TermLife
	And Selects Benefit Amount for Self as "<Benefit7>" under TenYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit7>" under TenYTL
	And Selects Benefit Amount for Child as "<Cbenefit7>" under TenYTL
	And Selects Benefit Amount for Self as "<Benefit8>" under HLDD
	And Selects Benefit Amount for Spouse as "<Sbenefit8>" under HLDD
	And Selects Benefit Amount for Child as "<Cbenefit8>" under HLDD
	And Selects Monthly Benefit Amount for Self as "<Benefit9>" under DII
	And Selects Waiting Period for Self as "<WaitP9>" under DII
	And Selects Benefit Option for Self as "<BenOpt9>" under DII
	And Selects Benefit Amount for Self as "<Benefit10>" under HII
	And Selects Benefit Amount for Spouse as "<Sbenefit10>" under HII
	And Selects Benefit Amount for Child as "<Cbenefit10>" under HII
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Validates Estimated Premium for Self as "<Mpremium6>" for Benefit Amount "<Benefit6>" under TermLife
	And Validates Estimated Premium for Spouse as "<Spremium6>" for Benefit Amount "<Sbenefit6>" under TermLife
	And Validates Total Premium as "<Total6>" under TermLife
	And Validates Estimated Premium for Self as "<Mpremium7>" for Benefit Amount "<Benefit7>" under TenYTL
	And Validates Estimated Premium for Spouse as "<Spremium7>" for Benefit Amount "<Sbenefit7>" under TenYTL
	And Validates Estimated Premium for Child as "<Cpremium7>" for Benefit Amount "<Cbenefit7>" under TenYTL
	And Validates Total Premium as "<Total7>" under TenYTL
	And Validates Estimated Premium for Self as "<Mpremium8>" for Benefit Amount "<Benefit8>"under HLDD
	And Validates Estimated Premium for Spouse as "<Spremium8>" for Benefit Amount "<Sbenefit8>" under HLDD
	And Validates Estimated Premium for Child as "<Cpremium8>" for Benefit Amount "<Cbenefit8>" under HLDD
	And Validates Total Premium as "<Total8>" under HLDD
	And Validates Estimated Premium for Self as "<Mpremium9>" for Benefit Amount "<Benefit9>" under DII
	And Validates Total Premium as "<Total9>" under DII
	And Validates Estimated Premium is not available under HII
	And Clicks on button to Save for later
	And Clicks OK Button Save For Later
	And Navigate back to Eligibility page 
	And Enters DOB for Self as "<DOB2>"
	And Enters DOB for Spouse as "<SDOB2>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Deselect Product TenYTL for Child
	And Selects product TwentyYTL for Child
	And Clicks on next button
	Then Click YES for Dependent Coverage information
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit11>" under TermLife
	And Selects Benefit Amount for Spouse as "<Sbenefit11>" under TermLife
	And Selects Benefit Amount for Child as "<Cbenefit12>" under TwentyYTL
	And Selects Benefit Amount for Child as "<Cbenefit13>" under HLDD
	And Selects Benefit Amount for Self as "<Benefit14>" under HII
	And Selects Benefit Amount for Spouse as "<Sbenefit14>" under HII
	And Selects Benefit Amount for Child as "<Cbenefit14>" under HII
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Validates Estimated Premium for Self as "<Mpremium11>" for Benefit Amount "<Benefit11>" under TermLife
	And Validates Estimated Premium for Spouse as "<Spremium11>" for Benefit Amount "<Sbenefit11>" under TermLife
	And Validates Total Premium as "<Total11>" under TermLife
	And Selects Payment Method for TwentyYTL
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Twenty Year Product "<Frequency>"
	And Validates Estimated Premium for Child as "<Cpremium12>" for Benefit Amount "<Cbenefit12>" under TwentyYTL
	And Validates Total Premium as "<Total12>" under TwentyYTL
	And Validates Estimated Premium for Child as "<Cpremium13>" for Benefit Amount "<Cbenefit13>" under HLDD
	And Validates Total Premium as "<Total13>" under HLDD
	And Validates Estimated Premium is not available under HII
	And Clicks on button to Save for later
	And Clicks OK Button Save For Later
	And Navigate back to Eligibility page
	And Enters DOB for Self as "<DOB3>"
	And Enters DOB for Spouse as "<SDOB3>"
	And Clicks Edit button for Child Added
	And Enters DOB for Child as "<CDOB3>"
	And Click on Add Child button on Screen
	And Clicks on next button
	And Clicks on next button
	Then Click YES for Dependent Coverage information
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit15>" under HII
	And Selects Benefit Amount for Spouse as "<Sbenefit15>" under HII
	And Selects Benefit Amount for Child as "<Cbenefit15>" under HII
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Validates Estimated Premium is not available under HII
	
	
Examples:
|Website |Title   |Fname |Lname |State    |DOB                |WorkHr  |Stitle |Sfname |Slname |SDOB                |SWorkHr |Cfname |Clname |CDOB                 |CSex |MonthlyIncome  |TotalAmt |STotalAmt |Benefit |CIR   |Sbenefit |Scir   |Cbenefit |Benefit1 |Sbenefit1 |Benefit2 |Sbenefit2 |Benefit3 |Sbenefit3 |Cbenefit3 |Benefit4 |WaitP     |BenOpt                   |Sbenefit4 |SWaitP  |SBenPer |Benefit5 |Sbenefit5 |Cbenefit5 |SSN         |Mstatus  |Height |Weight  |Gender_Self |MemberId   |StreetAddress   |City     |Zip   |PrimaryPhType |PrimaryPhNo   |BusinessName |BusinessType |SSSN      |SHeight |SWeight |Gender_Spouse |SPhoneType |SPhoneNum  |Password |VPassword |TobDate          |Product  |STobDate         |SProduct  |Bank               |AccName |Rnum      |Anum   |Frequency |Mpremium |Spremium |Cpremium |Total   |Mpremium1 |Spremium1 |Total1  |Mpremium2 |Spremium2 |Total2   |Mpremium3 |Spremium3 |Cpremium3 |Total3 |Mpremium4 |Spremium4 |Total4   |DOB1              |SDOB1             |CDOB1             |Benefit6 |CIR1      |Sbenefit6 |Scir1    |Benefit7  |Sbenefit7  |Cbenefit7  |Benefit8 |Sbenefit8 |Cbenefit8 |Benefit9 |WaitP9    |BenOpt9               |Benefit10 |Sbenefit10 |Cbenefit10  |Mpremium6 |Spremium6 |Total6      |Mpremium7 |Spremium7 |Cpremium7 |Total7  |Mpremium8 |Spremium8 |Cpremium8 |Total8 |Mpremium9 |Total9    |DOB2             |SDOB2            |Benefit11 |Sbenefit11 |Cbenefit12 |Cbenefit13 |Benefit14 |Sbenefit14 |Cbenefit14  |Mpremium11 |Spremium11 |Total11   |Cpremium12 |Total12 |Cpremium13 |Total13 |DOB3             |SDOB3            |CDOB3            |Benefit15 |Sbenefit15 |Cbenefit15 |
|asce    |Mr.     |Adam  |Gill  |New York |SYSDATE - 17Y/0M/0D|40      |Mrs.   |Bella  |Gill   |SYSDATE - 17Y/0M/0D |45      |John   |Gill   |SYSDATE - 00Y/0M/14D |Male |25000          |15000    |15000     |500000  |50000 |500000   |25000  |10000    |500000   |500000    |500000   |500000    |50000    |50000     |10000     |1500     |90 Days   |Option A (Five Year Plan)|$500      |30 Days |2 Years |200      |200       |200       |070045000   |Married  |5.0    |188     |Male        |745858     |2699 Centre Ave |Bellmore |11710 |Home          |7412589963    |Lex Corp     |Corporation  |990067501 |5.0     |188     |Female        |Mobile     |6767564545 |Adam@123 |Adam@123  |SYSDATE-00Y/6M/0D|Cigar    |SYSDATE-00Y/6M/0D|Cigar     |bank of america    |Adam    |745588512 |687877 |Monthly   |$17.64   |$16.26   |$0.60    |$34.50  |$66.67    |$55.83    |$122.50 |$91.67    |$64.17    |$155.84  |$2.17     |$2.17     |$0.87     |$5.21  |$5.40     |$5.40     |$10.80   |SYSDATE-64Y/0M/0D |SYSDATE-64Y/0M/0D |SYSDATE-22Y/0M/0D |$300,000 |$250,000  |$300,000  |$250,000 |$250,000  |$250,000   |10000      |$250,000 |$250,000  |10000     |$8,550   |180 Days  |Option B (Career Plan)|$500      |$500       |$500        |$297.99   |$227.05   |$525.04     |$425.00   |$238.33   |$0.68     |$664.01 |$10.83    |$10.83    |$0.87     |$22.53 |$135.09   |$135.09   |SYSDATE-75Y/0M/0D|SYSDATE-75Y/0M/0D|$350,000  |$350,000   |10000      |10000      |100       |100        |100         |$819.95    |$579.60    |$1,399.55 |$0.68      |$0.68   |$0.65      |$0.65   |SYSDATE-79Y/0M/0D|SYSDATE-79Y/0M/0D|SYSDATE-25Y/0M/0D|400       |400        |400        |

@AsceRate_02
Scenario Outline: <ASCESCR02>Complete work flow of application for Non Smoker,Non Montana

	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	Then Select YES Radio button of Membership
	Then Click on Self
	Then Click on Spouse
	Then Click on Child
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	And Enters Eligibility details for Spouse as "<STitle>","<Sfname>","<Slname>","<SDOB>","<SWorkHr>"
	And Select radio button NO for Spouse is Member
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<CSex>"
	And Selects Married question as No for Child
	And Selects No for full time student for Child
	And Click on Add Child button on Screen
	And Clicks on next button
	Then Product page details are displayed to user
	And Selects product TermLife for Self
	And Selects product TermLife for Spouse
	And Selects product TermLife for Child
	And Selects product TenYTL for Self
	And Selects product TenYTL for Spouse
	And Verify Child icon is disabled for TenYTL
	And Selects product TwentyYTL for Self
	And Selects product TwentyYTL for Spouse
	And Verify Child icon is disabled for TwentyYTL
	And Selects product HLDD for Self
	And Selects product HLDD for Spouse
	And Selects product HLDD for Child
	And Selects product DII for Self
	And Selects product DII for Spouse
	And Selects product HII for Self
	And Selects product HII for Spouse
	And Selects product HII for Child
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
  	And Confirms Imp Replacement Info for NewYork state	
	And Selects Answer as No for all Group Disability Insurance for Self	
	And Enters Monthly Income for Self as "<MonthlyIncome>"
	And Selects Yes for Do you have other life insurance in force for Self
	And Enters Total Amount for Self as "<TotalAmt>"
	And Selects Yes for life insurance applied for intended to replace for Self
	And Selects Yes for Do you have other life insurance in force for Spouse
	And Enters Total Amount for Spouse as "<STotalAmt>"
	And Selects Yes for life insurance applied for intended to replace for Spouse
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under TermLife
	And Checks Chronic Illness Rider for Self checkbox under TermLife 
	And Selects CIR portion for Self as "<CIR>" under TermLife
	And Selects Benefit Amount for Spouse as "<Sbenefit>" under TermLife
	And Checks CIR checkbox for Spouse
	And Selects CIR portion for Spouse as "<Scir>" under TermLife
	And Selects Benefit Amount for Child as "<Cbenefit>" under TermLife
	And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit1>" under TenYTL
	And Selects Benefit Amount for Self as "<Benefit2>" under TwentyYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit2>" under TwentyYTL
	And Selects Benefit Amount for Self as "<Benefit3>" under HLDD
	And Selects Benefit Amount for Spouse as "<Sbenefit3>" under HLDD
	And Selects Benefit Amount for Child as "<Cbenefit3>" under HLDD
	And Selects Monthly Benefit Amount for Self as "<Benefit4>" under DII
	And Selects Waiting Period for Self as "<WaitP>" under DII
	And Selects Benefit Option for Self as "<BenOpt>" under DII
	And Validates Monthly Benefit Amount for Spouse as "<Sbenefit4>" under DII
	And Validates Waiting Period for Spouse as "<SWaitP>" under DII
	And Validates Benefit Period for Spouse as "<SBenPer>" under DII
	And Selects Benefit Amount for Self as "<Benefit5>" under HII
	And Selects Benefit Amount for Spouse as "<Sbenefit5>" under HII
	And Selects Benefit Amount for Child as "<Cbenefit5>" under HII
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on next button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No for Travel Question Non QD for Self
	And Selects No Radio button for Tobacco Question Self
	And Selects Residential Radio Button
	And Selects Yes Radio Button for Business Address
	And Enters Business Details as "<BusinessName>","<BusinessType>"
	And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>"
	And Selects No for Travel Question Non QD for Spouse
	And Selects No Radio button for Tobacco Question Spouse
	And Clicks on next button
	Then Application Summary Page is displayed to user
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Selects Payment Method for TermLife
	And Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for Term Life Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium>" for Benefit Amount "<Benefit>" under TermLife
	And Validates Estimated Premium for Spouse as "<Spremium>" for Benefit Amount "<Sbenefit>" under TermLife
	And Validates Estimated Premium for Child as "<Cpremium>" for Benefit Amount "<Cbenefit>" under TermLife
	And Validates Total Premium as "<Total>" under TermLife
	And Selects Payment Method for TenYTL
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Ten Year Product and reviews "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium1>" for Benefit Amount "<Benefit1>" under TenYTL
	And Validates Estimated Premium for Spouse as "<Spremium1>" for Benefit Amount "<Sbenefit1>" under TenYTL
	And Validates Total Premium as "<Total1>" under TenYTL
	And Selects Payment Method for TwentyYTL
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Twenty Year Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium2>" for Benefit Amount "<Benefit2>" under TwentyYTL
	And Validates Estimated Premium for Spouse as "<Spremium2>" for Benefit Amount "<Sbenefit2>" under TwentyYTL
	And Validates Total Premium as "<Total2>" under TwentyYTL
	And Clicks on Payment Method for HLDD 
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for HLDD Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium3>" for Benefit Amount "<Benefit3>"under HLDD
	And Validates Estimated Premium for Spouse as "<Spremium3>" for Benefit Amount "<Sbenefit3>" under HLDD
	And Validates Estimated Premium for Child as "<Cpremium3>" for Benefit Amount "<Cbenefit3>" under HLDD
	And Validates Total Premium as "<Total3>" under HLDD
	And Clicks on Payment Method for DII 	
	And Selects Radio Button for existing payment method
	And Clicks on Save button	
	And Selects Frequency for DII Product "<Frequency>"	
	And Validates Estimated Premium for Self as "<Mpremium4>" for Benefit Amount "<Benefit4>" under DII
	And Validates Estimated Premium for Spouse as "<Spremium4>" for Benefit Amount "<Sbenefit4>" under DII
	And Validates Total Premium as "<Total4>" under DII
	And Clicks on Payment Method for HII 
	And Selects Radio Button for existing payment method	
	And Clicks on Save button	
	And Selects Frequency for HII Product "<Frequency>"	
	And Validates Estimated Premium is not available under HII
	And Confirms I have read the Information Check Box on Payment Page	
	And Clicks on button to Save for later
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>" 
	And Clicks OK Button Save For Later
	Then Refresh the browser
	Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive
	And Navigate back to Eligibility page 
	And Enters DOB for Self as "<DOB1>"
	And Enters DOB for Spouse as "<SDOB1>"
	And Clicks Edit button for Child Added	
	And Enters DOB for Child as "<CDOB1>"
	And Click on Add Child button on Screen
	And Clicks on next button
	Then Product page details are displayed to user
	And DeSelects product TermLife for Child
	And Selects product TenYTL for Child
	And Clicks on next button
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit6>" under TermLife
	And Selects CIR portion for Self as "<CIR1>" under TermLife
	And Selects Benefit Amount for Spouse as "<Sbenefit6>" under TermLife
	And Selects CIR portion for Spouse as "<Scir1>" under TermLife
	And Selects Benefit Amount for Self as "<Benefit7>" under TenYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit7>" under TenYTL
	And Selects Benefit Amount for Child as "<Cbenefit7>" under TenYTL
	And Selects Benefit Amount for Self as "<Benefit8>" under HLDD
	And Selects Benefit Amount for Spouse as "<Sbenefit8>" under HLDD
	And Selects Benefit Amount for Child as "<Cbenefit8>" under HLDD
	And Selects Monthly Benefit Amount for Self as "<Benefit9>" under DII
	And Selects Waiting Period for Self as "<WaitP9>" under DII
	And Selects Benefit Option for Self as "<BenOpt9>" under DII
	And Selects Benefit Amount for Self as "<Benefit10>" under HII
	And Selects Benefit Amount for Spouse as "<Sbenefit10>" under HII
	And Selects Benefit Amount for Child as "<Cbenefit10>" under HII
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Validates Estimated Premium for Self as "<Mpremium6>" for Benefit Amount "<Benefit6>" under TermLife
	And Validates Estimated Premium for Spouse as "<Spremium6>" for Benefit Amount "<Sbenefit6>" under TermLife
	And Validates Total Premium as "<Total6>" under TermLife
	And Validates Estimated Premium for Self as "<Mpremium7>" for Benefit Amount "<Benefit7>" under TenYTL
	And Validates Estimated Premium for Spouse as "<Spremium7>" for Benefit Amount "<Sbenefit7>" under TenYTL
	And Validates Estimated Premium for Child as "<Cpremium7>" for Benefit Amount "<Cbenefit7>" under TenYTL
	And Validates Total Premium as "<Total7>" under TenYTL
	And Validates Estimated Premium for Self as "<Mpremium8>" for Benefit Amount "<Benefit8>"under HLDD
	And Validates Estimated Premium for Spouse as "<Spremium8>" for Benefit Amount "<Sbenefit8>" under HLDD
	And Validates Estimated Premium for Child as "<Cpremium8>" for Benefit Amount "<Cbenefit8>" under HLDD
	And Validates Total Premium as "<Total8>" under HLDD
	And Validates Estimated Premium for Self as "<Mpremium9>" for Benefit Amount "<Benefit9>" under DII
	And Validates Total Premium as "<Total9>" under DII
	And Validates Estimated Premium is not available under HII
	And Clicks on button to Save for later
	And Clicks OK Button Save For Later
	And Navigate back to Eligibility page 
	And Enters DOB for Self as "<DOB2>"
	And Enters DOB for Spouse as "<SDOB2>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Deselect Product TenYTL for Child
	And Selects product TwentyYTL for Child
	And Clicks on next button
	Then Click YES for Dependent Coverage information
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit11>" under TermLife
	And Selects Benefit Amount for Spouse as "<Sbenefit11>" under TermLife
	And Selects Benefit Amount for Child as "<Cbenefit12>" under TwentyYTL
	And Selects Benefit Amount for Child as "<Cbenefit13>" under HLDD
	And Selects Benefit Amount for Self as "<Benefit14>" under HII
	And Selects Benefit Amount for Spouse as "<Sbenefit14>" under HII
	And Selects Benefit Amount for Child as "<Cbenefit14>" under HII
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Validates Estimated Premium for Self as "<Mpremium11>" for Benefit Amount "<Benefit11>" under TermLife
	And Validates Estimated Premium for Spouse as "<Spremium11>" for Benefit Amount "<Sbenefit11>" under TermLife
	And Validates Total Premium as "<Total11>" under TermLife
	And Selects Payment Method for TwentyYTL
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Twenty Year Product "<Frequency>"
	And Validates Estimated Premium for Child as "<Cpremium12>" for Benefit Amount "<Cbenefit12>" under TwentyYTL
	And Validates Total Premium as "<Total12>" under TwentyYTL
	And Validates Estimated Premium for Child as "<Cpremium13>" for Benefit Amount "<Cbenefit13>" under HLDD
	And Validates Total Premium as "<Total13>" under HLDD
	And Validates Estimated Premium is not available under HII
	And Clicks on button to Save for later
	And Clicks OK Button Save For Later
	And Navigate back to Eligibility page
	And Enters DOB for Self as "<DOB3>"
	And Enters DOB for Spouse as "<SDOB3>"
	And Clicks Edit button for Child Added
	And Enters DOB for Child as "<CDOB3>"
	And Click on Add Child button on Screen
	And Clicks on next button
	And Clicks on next button
	Then Click YES for Dependent Coverage information
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit15>" under HII
	And Selects Benefit Amount for Spouse as "<Sbenefit15>" under HII
	And Selects Benefit Amount for Child as "<Cbenefit15>" under HII
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Validates Estimated Premium is not available under HII
	
Examples:
|Website |Title   |Fname  |Lname   |State    |DOB                 |WorkHr  |Stitle |Sfname |Slname   |SDOB                |SWorkHr |Cfname |Clname    |CDOB                 |CSex   |MonthlyIncome  |TotalAmt |STotalAmt |Benefit |CIR   |Sbenefit |Scir   |Cbenefit |Benefit1 |Sbenefit1 |Benefit2 |Sbenefit2 |Benefit3 |Sbenefit3 |Cbenefit3 |Benefit4 |WaitP     |BenOpt                   |Sbenefit4 |SWaitP  |SBenPer |Benefit5 |Sbenefit5 |Cbenefit5 |SSN         |Mstatus  |Height |Weight  |Gender_Self |MemberId   |StreetAddress   |City     |Zip   |PrimaryPhType |PrimaryPhNo   |BusinessName |BusinessType |SSSN      |SHeight |SWeight |Gender_Spouse |SPhoneType |SPhoneNum  |Password |VPassword  |Bank               |AccName |Rnum      |Anum   |Frequency |Mpremium |Spremium |Cpremium |Total   |Mpremium1 |Spremium1 |Total1  |Mpremium2 |Spremium2 |Total2   |Mpremium3 |Spremium3 |Cpremium3 |Total3 |Mpremium4 |Spremium4 |Total4   |DOB1             |SDOB1             |CDOB1             |Benefit6 |CIR1      |Sbenefit6 |Scir1    |Benefit7  |Sbenefit7  |Cbenefit7  |Benefit8 |Sbenefit8 |Cbenefit8 |Benefit9 |WaitP9    |BenOpt9                    |Benefit10 |Sbenefit10 |Cbenefit10  |Mpremium6 |Spremium6 |Total6      |Mpremium7 |Spremium7 |Cpremium7 |Total7  |Mpremium8 |Spremium8|Cpremium8 |Total8 |Mpremium9 |Total9    |DOB2             |SDOB2             |Benefit11 |Sbenefit11 |Cbenefit12|Cbenefit13 |Benefit14 |Sbenefit14 |Cbenefit14  |Mpremium11 |Spremium11 |Total11   |Cpremium12|Total12 |Cpremium13 |Total13 |DOB3             |SDOB3            |CDOB3             |Benefit15 |Sbenefit15 |Cbenefit15|
|asce    |Mrs.    |Rihanna|Stewart |New York |SYSDATE - 17Y/0M/0D |40      |Mr.    |Bill   |Stewart  |SYSDATE - 17Y/0M/0D |45      |Amy    |Stewart   |SYSDATE - 00Y/0M/14D |Female |25000          |15000     |15000    |500000  |50000 |500000   |25000  |10000    |500000   |500000    |500000   |500000    |50000    |50000     |10000     |1500     |90 Days   |Option A (Five Year Plan)|$500      |30 Days |2 Years |200      |200       |200       |070045000   |Married  |5.0    |188     |Female      |745858     |2699 Centre Ave |Bellmore |11710 |Home          |7412589963    |Lex Corp     |Corporation  |990067501 |5.0     |188     |Male          |Mobile     |6767564545 |Adam@123 |Adam@123   |bank of america    |Adam    |745588512 |687877 |Monthly   |$14.94   |$13.56   |$0.60    |$29.10  |$15.00    |$17.50    |$32.50  |$27.92    |$35.42    |$63.34   |$2.17     |$2.17     |$0.87     |$5.21  |$5.40     |$5.40     |$10.80   |SYSDATE-64Y/0M/0D|SYSDATE-64Y/0M/0D |SYSDATE-22Y/0M/0D |$300,000 |$250,000  |$300,000  |$250,000 |$250,000  |$250,000   |10000      |$250,000 |$250,000  |10000     |$8,550   |180 Days  |Option B (Career Plan)     |$500      |$500       |$500        |$258.03   |$198.97   |$457.00     |$73.54    |$118.54   |$0.68     |$192.76 |$10.83    |$10.83   |$0.87     |$22.53 |$135.09   |$135.09   |SYSDATE-75Y/0M/0D|SYSDATE-75Y/0M/0D |$350,000  |$350,000   |10000     |10000      |100       |100        |100         |$696.47    |$494.87    |$1,191.34 |$0.68     |$0.68   |$0.65      |$0.65   |SYSDATE-79Y/0M/0D|SYSDATE-79Y/0M/0D|SYSDATE-25Y/0M/0D |400       |400        |400       |

@AsceRate_03
Scenario Outline: <ASCESCR03>Complete work flow of application for Smoker,Montana
	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	Then Select YES Radio button of Membership
	Then Click on Self
	Then Click on Spouse
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	And Enters Eligibility details for Spouse as "<STitle>","<Sfname>","<Slname>","<SDOB>","<SWorkHr>"
	And Select radio button NO for Spouse is Member
	And Clicks on next button
	Then Product page details are displayed to user
	And Selects product TenYTL for Self
	And Selects product TenYTL for Spouse
	And Selects product TwentyYTL for Self
	And Selects product TwentyYTL for Spouse
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under TenYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit>" under TenYTL
	And Selects Benefit Amount for Self as "<Benefit1>" under TwentyYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit1>" under TwentyYTL
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on next button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No for Travel Question Non QD for Self
	And Selects Yes Radio button for Tobacco Question
	And Enters Last Used Tobacco Date Details for Self as "<TobDate>"
	And  Clicks on Products used textbox for Self and Selects Product as "<Product>"
	And Selects Residential Radio Button
	And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>"
	And Selects No for Travel Question Non QD for Spouse
	And Selects Yes Radio button for Tobacco Question for Spouse
	And Enters Last Used Tobacco Date Details for Spouse as "<STobDate>"
	And Clicks on Products used textbox for Spouse and Selects Product as "<SProduct>"
	And Clicks on next button
	Then Application Summary Page is displayed to user
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Selects Payment Method for TenYTL
	And Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for Ten Year Product and reviews "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium>" for Benefit Amount "<Benefit>" under TenYTL
	And Validates Estimated Premium for Spouse as "<Spremium>" for Benefit Amount "<Sbenefit>" under TenYTL
	And Validates Total Premium as "<Total>" under TenYTL
	And Selects Payment Method for TwentyYTL
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Twenty Year Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium1>" for Benefit Amount "<Benefit1>" under TwentyYTL
	And Validates Estimated Premium for Spouse as "<Spremium1>" for Benefit Amount "<Sbenefit1>" under TwentyYTL
	And Validates Total Premium as "<Total1>" under TwentyYTL
	And Confirms I have read the Information Check Box on Payment Page
	And Clicks on button to Save for later
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>" 
	And Clicks OK Button Save For Later
	Then Refresh the browser
	Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive
	And Navigate back to Eligibility page 
	And Enters DOB for Self as "<DOB1>"
	And Enters DOB for Spouse as "<SDOB1>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit2>" under TenYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit2>" under TenYTL
	And Selects Benefit Amount for Self as "<Benefit3>" under TwentyYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit3>" under TwentyYTL
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Validates Estimated Premium for Self as "<Mpremium2>" for Benefit Amount "<Benefit2>" under TenYTL
	And Validates Estimated Premium for Spouse as "<Spremium2>" for Benefit Amount "<Sbenefit2>" under TenYTL
	And Validates Total Premium as "<Total2>" under TenYTL
	And Validates Estimated Premium for Self as "<Mpremium3>" for Benefit Amount "<Benefit3>" under TwentyYTL
	And Validates Estimated Premium for Spouse as "<Spremium3>" for Benefit Amount "<Sbenefit3>" under TwentyYTL
	And Validates Total Premium as "<Total3>" under TwentyYTL
	And Clicks on button to Save for later
	And Clicks OK Button Save For Later
	And Navigate back to Eligibility page
	And Enters DOB for Self as "<DOB2>"
	And Enters DOB for Spouse as "<SDOB2>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit4>" under TenYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit4>" under TenYTL
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Validates Estimated Premium for Self as "<Mpremium4>" for Benefit Amount "<Benefit4>" under TenYTL
	And Validates Estimated Premium for Spouse as "<Spremium4>" for Benefit Amount "<Sbenefit4>" under TenYTL
	And Validates Total Premium as "<Total4>" under TenYTL
	
Examples:
|Website |Title   |Fname     |Lname   |State    |DOB                 |WorkHr   |Stitle |Sfname    |Slname  |SDOB                |SWorkHr|Benefit    |Sbenefit   |Benefit1   |Sbenefit1   |SSN       |Mstatus |Height |Weight |Gender_Self |MemberId |StreetAddress  |City       |Zip  |PrimaryPhType |PrimaryPhNo|SSSN     |SHeight  |SWeight |Gender_Spouse |SPhoneType|SPhoneNum   |TobDate           |Product |STobDate         |SProduct |Bank |AccName  |Rnum     |Anum    |Frequency |Mpremium |Spremium |Total   |Mpremium1 |Spremium1 |Total1  |Password |VPassword |DOB1              |SDOB1             |Benefit2 |Sbenefit2 |Benefit3 |Sbenefit3 |Mpremium2 |Spremium2 |Total2    |Mpremium3   |Spremium3  |Total3    |DOB2               |SDOB2             |Benefit4   |Sbenefit4  |Mpremium4 |Spremium4 |Total4   |
|asce    |Mr.     |Sheldon   |Cooper  |Montana  |SYSDATE - 17Y/0M/0D |40       |Mrs.   |Carla     |Cooper  |SYSDATE - 17Y/0M/0D |45     |$1,000,000 |$1,000,000 |$1,000,000 |$1,000,000  |077400019 |Married |5.5    |150    |Male        |987458   |309 E Lewis St |Livingston |59047|Home          |7897894589 |996041720|6.0      |180     |Female        |Mobile    |9877858745  |SYSDATE-00Y/7M/0D |Cigar   |SYSDATE-00Y/7M/0D|Cigar    |BOA  |Kendrick |798654985|45889665|Monthly   |$133.33  |$133.33  |$266.66 |$180.83   |$180.83   |$361.66 |Adam@123 |Adam@123  |SYSDATE-54Y/0M/0D |SYSDATE-54Y/0M/0D |750000   |750000    |1250000  |1250000   |$526.25   |$526.25   |$1,052.50 |$1,573.96   |$1,573.96  |$3,147.92 |SYSDATE-64Y/0M/0D  |SYSDATE-64Y/0M/0D |$2,000,000 |$2,000,000 |$3,338.33 |$3,338.33 |$6,676.66|

@AsceRate_04
Scenario Outline: <ASCESCR04>Complete work flow of application for Non Smoker, Montana
	Given Test set up for "NYL" feature and "NYL_ASCE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	Then Select YES Radio button of Membership
	Then Click on Self
	Then Click on Spouse
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	And Enters Eligibility details for Spouse as "<STitle>","<Sfname>","<Slname>","<SDOB>","<SWorkHr>"
	And Select radio button NO for Spouse is Member
	And Clicks on next button
	Then Product page details are displayed to user
	And Selects product TenYTL for Self
	And Selects product TenYTL for Spouse
	And Selects product TwentyYTL for Self
	And Selects product TwentyYTL for Spouse
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under TenYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit>" under TenYTL
	And Selects Benefit Amount for Self as "<Benefit1>" under TwentyYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit1>" under TwentyYTL
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on next button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No for Travel Question Non QD for Self
	And Selects No Radio button for Tobacco Question Self
	And Selects Residential Radio Button
	And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<Gender_Spouse>","<SPhoneType>","<SPhoneNum>"
	And Selects No for Travel Question Non QD for Spouse
	And Selects No Radio button for Tobacco Question Spouse
	And Clicks on next button
	Then Application Summary Page is displayed to user
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Selects Payment Method for TenYTL
	And Selects Payment option as Bank
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for Ten Year Product and reviews "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium>" for Benefit Amount "<Benefit>" under TenYTL
	And Validates Estimated Premium for Spouse as "<Spremium>" for Benefit Amount "<Sbenefit>" under TenYTL
	And Validates Total Premium as "<Total>" under TenYTL
	And Selects Payment Method for TwentyYTL
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Twenty Year Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium1>" for Benefit Amount "<Benefit1>" under TwentyYTL
	And Validates Estimated Premium for Spouse as "<Spremium1>" for Benefit Amount "<Sbenefit1>" under TwentyYTL
	And Validates Total Premium as "<Total1>" under TwentyYTL
	And Confirms I have read the Information Check Box on Payment Page
	And Clicks on button to Save for later
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>" 
	And Clicks OK Button Save For Later
	Then Refresh the browser
	Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive
	And Navigate back to Eligibility page 
	And Enters DOB for Self as "<DOB1>"
	And Enters DOB for Spouse as "<SDOB1>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit2>" under TenYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit2>" under TenYTL
	And Selects Benefit Amount for Self as "<Benefit3>" under TwentyYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit3>" under TwentyYTL
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Payment Information Page is displayed to user
	Then Payment Information Page is displayed to user
	And Validates Estimated Premium for Self as "<Mpremium2>" for Benefit Amount "<Benefit2>" under TenYTL
	And Validates Estimated Premium for Spouse as "<Spremium2>" for Benefit Amount "<Sbenefit2>" under TenYTL
	And Validates Total Premium as "<Total2>" under TenYTL
	And Validates Estimated Premium for Self as "<Mpremium3>" for Benefit Amount "<Benefit3>" under TwentyYTL
	And Validates Estimated Premium for Spouse as "<Spremium3>" for Benefit Amount "<Sbenefit3>" under TwentyYTL
	And Validates Total Premium as "<Total3>" under TwentyYTL
	And Clicks on button to Save for later
	And Clicks OK Button Save For Later
	And Navigate back to Eligibility page
	And Enters DOB for Self as "<DOB2>"
	And Enters DOB for Spouse as "<SDOB2>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit4>" under TenYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit4>" under TenYTL
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Validates Estimated Premium for Self as "<Mpremium4>" for Benefit Amount "<Benefit4>" under TenYTL
	And Validates Estimated Premium for Spouse as "<Spremium4>" for Benefit Amount "<Sbenefit4>" under TenYTL
	And Validates Total Premium as "<Total4>" under TenYTL
	
Examples:
|Website |Title   |Fname     |Lname   |State    |DOB                 |WorkHr   |Stitle |Sfname    |Slname  |SDOB                |SWorkHr    |Benefit    |Sbenefit   |Benefit1   |Sbenefit1   |SSN       |Mstatus |Height |Weight |Gender_Self |MemberId |StreetAddress  |City       |Zip    |PrimaryPhType |PrimaryPhNo|SSSN     |SHeight|SWeight |Gender_Spouse |SPhoneType |SPhoneNum   |Bank |AccName  |Rnum     |Anum     |Frequency |Mpremium |Spremium |Total   |Mpremium1 |Spremium1 |Total1  |Password |VPassword |DOB1              |SDOB1             |Benefit2 |Sbenefit2 |Benefit3 |Sbenefit3 |Mpremium2 |Spremium2 |Total2    |Mpremium3   |Spremium3  |Total3    |DOB2             |SDOB2             |Benefit4   |Sbenefit4  |Mpremium4 |Spremium4 |Total4   |
|asce    |Mrs     |Rachel    |Green   |Montana  |SYSDATE - 17Y/0M/0D |40       |Mr.    |Ross      |Geller  |SYSDATE - 17Y/0M/0D |45         |$1,000,000 |$1,000,000 |$1,000,000 |$1,000,000  |967400019 |Married |5.5    |150    |Male        |987458   |309 E Lewis St |Livingston |59047  |Home          |7897894749 |978041720|6.0    |180     |Female        |Mobile     |9879858745  |BOA  |Kendrick |798654985|49889665 |Monthly   |$35.00   |$35.00   |$70.00  |$65.83    |$65.83    |$131.66 |Adam@123 |Adam@123  |SYSDATE-54Y/0M/0D |SYSDATE-54Y/0M/0D |750000   |750000    |1250000  |1250000   |$127.50   |$127.50   |$255.00   |$415.62     |$415.62    |$831.24   |SYSDATE-64Y/0M/0D|SYSDATE-64Y/0M/0D |$2,000,000 |$2,000,000 |$926.67   |$926.67   |$1,853.34|
