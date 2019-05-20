Feature: Abe Rate Test
@AbeRate_01
Scenario Outline: <ABESCR01>Complete work flow of application for Smoker,Non Montana
	Given Test set up for "NYL" feature and "NYL_ABE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	And Scroll down and click on I Attest To Having Read the Above Information button
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
  	And Honorably Discharged question as No
	And Click on Add Child button on Screen
	And Clicks on next button
	Then Product page details are displayed to user
	And Selects product FiveYTL for Self
	And Selects product FiveYTL for Spouse
	And Selects product FiveYTL for Child
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
	And Selects product HMI for Self
	And Selects product HMI for Spouse
	And Selects product HMI for Child
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self	
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
	And Confirms Imp Replacement Info for NewYork state
	And Selects Answer as No for all additional questions of Group Disability Insurance for Self
	And Enters Monthly Income for Self as "<MonthlyIncome>"
	And Enters details for Monthly Expense and Percentage Responsible as "<Mexpense>","<Percresp>"
	And Selects Answer as No for Additional Questions as No for all for Spouse of Group Disability Insuranse
	And Enters Monthly Income as "<SMonthlyIncome>" for Spouse
	And Selects Yes for Do you have other life insurance in force for Self
	And Enters Total Amount for Self as "<TotalAmt>"
	And Selects Yes for life insurance applied for intended to replace for Self
	And Selects Yes for Do you have other life insurance in force for Spouse
	And Enters Total Amount for Spouse as "<STotalAmt>"
	And Selects Yes for life insurance applied for intended to replace for Spouse
	And Clicks on next button
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
	And Selects Benefit Amount for Self as "<Benefit3>" under ADnD
	And Selects Benefit Amount for Spouse as "<Sbenefit3>" under ADDI
	And Selects Benefit Amount for Child as "<Cbenefit3>" under ADDI
	And Selects Benefit Amount for Self as "<Benefit4>" under LTDPlus
	And Selects Wait Period for Self as "<WaitPeriod>" under LTDPlus
	And Selects Catastrophic Disability Benefit Rider for LDTP
	And Selects Law School Loan Payment Benefit Rider under LTDP
	And Selects Cost of Living Adjustment Rider under LTDP Product
	And Selects Benefit Amount for Spouse as "<Sbenefit4>" under LTDPlus
	And Selects Wait Period for Spouse as "<SWaitPeriod>" under LTDPlus
	And Selects Catastrophic Disability Benefit Rider for Spouse under LTDPlus
	And Selects Cost of Living Adjustment Rider for LTDP Product for Spouse
	And Selects Benefit Amount for Self as "<Benefit5>" under LTD
	And Selects Wait Period for Self as "<WaitPeriod1>" under LTD
	And Selects Cost of Living Adjustment Rider under LTD product
	And Selects Law School Loan Payment Benefit Rider under LTD
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
	And Selects Benefit Amount for Self as "<Benefit9>" under HMI
	And Selects Surgical Option Rider for Self under HMI
	And Selects Surgical Amount as "<SAmount>"
	And Selects Benefit Amount for Spouse as "<Sbenefit9>" under HMI
	And Selects Benefit Amount for Child as "<Cbenefit9>" under HMI
	And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on next button
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No for Travel Question Non QD for Self
	And Selects Yes Radio button for Tobacco Question
	And Enters Last Used Tobacco Date Details for Self as "<TobDate>"
	And Clicks on Products used textbox for Self and Selects Product as "<Product>"
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
	Then Payment Information Page is displayed to user and user Selects Payment option as Bank for FiveYTL Product
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for FiveYTL Product and reviews "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium>" for Benefit Amount "<Benefit>" under FiveYTL
	And Validates Estimated Premium for Spouse as "<Spremium>" for Benefit Amount "<Sbenefit>" under FiveYTL
	And Validates Estimated Premium for Child as "<Cpremium>" for Benefit Amount "<Cbenefit>" under FiveYTL
	And Validates Total Premium as "<Total>" under FiveYTL
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
	And Selects Payment Method for ADDI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Accidental Death Product and reviews "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium3>" for Benefit Amount "<Benefit3>" under ADDI
	And Validates Estimated Premium for Spouse as "<Spremium3>" for Benefit Amount "<Sbenefit3>" under ADDI
	And Validates Estimated Premium for Child as "<Cpremium3>" for Benefit Amount "<Cbenefit3>" under ADDI
	And Validates Total Premium as "<Total3>" under ADnD
	And Selects Payment Method for LTDPlus
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Long Term Disability Plus Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium4>" for Benefit Amount "<Benefit4>" under LTDPlus
	And Validates Estimated Premium for Spouse as "<Spremium4>" for Benefit Amount "<Sbenefit4>" under LTDPlus
	And Validates Total Premium as "<Total4>" under LTDPlus
	And Selects Payment Method for LTD
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Long Term Disability Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium5>" for Benefit Amount "<Benefit5>" under LTD
	And Validates Estimated Premium for Spouse as "<Spremium5>" for Benefit Amount "<Sbenefit5>" under LTD
	And Validates Total Premium as "<Total5>" under LTD
	And Selects Payment Method for MTDI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Mid Term Disability Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium6>" for Benefit Amount "<Benefit6>" under MTDI
	And Validates Estimated Premium for Spouse as "<Spremium6>" for Benefit Amount "<Sbenefit6>" under MTDI
	And Validates Total Premium as "<Total6>" under MTDI
	And Selects Payment Method for RTDI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Retirement Disability Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium7>" for Benefit Amount "<Benefit7>" under RDI
	And Validates Total Premium as "<Total7>" under RDI
	And Selects Payment Method for POEDI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Professional Disability Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium8>" for Benefit Amount "<Benefit8>" under POEDI
	And Validates Total Premium as "<Total8>"under POEDI
	And Selects Payment Method for HMI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Hospital Money Insurance Product and reviews "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium9>" for Benefit Amount "<Benefit9>" under HMI
	And Validates Estimated Premium for Spouse as "<Spremium9>" for Benefit Amount "<Sbenefit9>" under HMI
	And Validates Estimated Premium for Child as "<Cpremium9>" for Benefit Amount "<Cbenefit9>" under HMI
	And Validates Total Premium as "<Total9>" under HMI
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
	And Deselect Product FiveYTL for Child
	And Selects product TenYTL for Child
	And Selects product CI for Self
	And Selects product CI for Spouse
	And Clicks on next button
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit10>" under FiveYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit10>" under FiveYTL
	And Selects Benefit Amount for Self as "<Benefit11>" under TenYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit11>" under TenYTL
	And Selects Benefit Amount for Child as "<Cbenefit11>" under TenYTL
	And Selects Benefit Amount for Self as "<Benefit12>" under TwentyYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit12>" under TwentyYTL
	And Selects Benefit Amount for Self as "<Benefit13>" under ADDI
	And Selects Benefit Amount for Spouse as "<Sbenefit13>" under ADDI
	And Selects Benefit Amount for Child as "<Cbenefit13>" under ADDI
	And Selects Benefit Amount for Self as "<Benefit14>" under LTDPlus
	And Selects Wait Period for Self as "<WaitPeriod14>" under LTDPlus
	And Selects Benefit Amount for Spouse as "<Sbenefit14>" under LTDPlus
	And Selects Wait Period for Spouse as "<SWaitPeriod14>" under LTDPlus
	And Selects Benefit Amount for Self as "<Benefit15>" under LTD
	And Selects Wait Period for Self as "<WaitPeriod15>" under LTD
	And Selects Benefit Amount for Spouse as "<Sbenefit15>" under LTD
	And Selects Wait Period for Spouse as "<SWaitPeriod15>" under LTD
	And Selects Benefit Amount for Self as "<Benefit16>" under MTDI
	And Selects Wait Period for Self as "<WaitPeriod16>" under MTDI
	And Selects Benefit Amount for Spouse as "<Sbenefit16>" under MTDI
	And Selects Wait Period for Spouse as "<SWaitPeriod16>" under MTDI
	And Selects Benefit Amount for Self as "<Benefit17>" under RDI
	And Selects Wait Period for Self as "<WaitPeriod17>" under RDI
	And Selects Benefit Amount for Self as "<Benefit18>" under POEDI
	And Selects Benefit Amount for Self as "<Benefit19>" under HMI
	And Selects Surgical Amount as "<SAmount19>"
	And Selects Benefit Amount for Spouse as "<Sbenefit19>" under HMI
	And Selects Benefit Amount for Child as "<Cbenefit19>" under HMI
	And Selects Benefit Amount for Self as "<Benefit20>" under CI
	And Selects Benefit Amount for Spouse as "<Sbenefit20>" under CI
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Validates Estimated Premium for Self as "<Mpremium10>" for Benefit Amount "<Benefit10>" under FiveYTL
	And Validates Estimated Premium for Spouse as "<Spremium10>" for Benefit Amount "<Sbenefit10>" under FiveYTL
	And Validates Total Premium as "<Total10>" under FiveYTL
	And Validates Estimated Premium for Self as "<Mpremium11>" for Benefit Amount "<Benefit11>" under TenYTL
	And Validates Estimated Premium for Spouse as "<Spremium11>" for Benefit Amount "<Sbenefit11>" under TenYTL
	And Validates Estimated Premium for Child as "<Cpremium11>" for Benefit Amount "<Cbenefit11>" under TenYTL
	And Validates Total Premium as "<Total11>" under TenYTL
	And Validates Estimated Premium for Self as "<Mpremium12>" for Benefit Amount "<Benefit12>" under TwentyYTL
	And Validates Estimated Premium for Spouse as "<Spremium12>" for Benefit Amount "<Sbenefit12>" under TwentyYTL
	And Validates Total Premium as "<Total12>" under TwentyYTL
	And Validates Estimated Premium for Self as "<Mpremium13>" for Benefit Amount "<Benefit13>" under ADDI
	And Validates Estimated Premium for Spouse as "<Spremium13>" for Benefit Amount "<Sbenefit13>" under ADDI
	And Validates Estimated Premium for Child as "<Cpremium13>" for Benefit Amount "<Cbenefit13>" under ADDI
	And Validates Total Premium as "<Total13>" under ADnD
	And Validates Estimated Premium for Self as "<Mpremium14>" for Benefit Amount "<Benefit14>" under LTDPlus
	And Validates Estimated Premium for Spouse as "<Spremium14>" for Benefit Amount "<Sbenefit14>" under LTDPlus
	And Validates Total Premium as "<Total14>" under LTDPlus
	And Validates Estimated Premium for Self as "<Mpremium15>" for Benefit Amount "<Benefit15>" under LTD
	And Validates Estimated Premium for Spouse as "<Spremium15>" for Benefit Amount "<Sbenefit15>" under LTD
	And Validates Total Premium as "<Total15>" under LTD
	And Validates Estimated Premium for Self as "<Mpremium16>" for Benefit Amount "<Benefit16>" under MTDI
	And Validates Estimated Premium for Spouse as "<Spremium16>" for Benefit Amount "<Sbenefit16>" under MTDI
	And Validates Total Premium as "<Total16>" under MTDI
	And Validates Estimated Premium for Self as "<Mpremium17>" for Benefit Amount "<Benefit17>" under RDI
	And Validates Total Premium as "<Total17>" under RDI
	And Validates Estimated Premium for Self as "<Mpremium18>" for Benefit Amount "<Benefit18>" under POEDI
	And Validates Total Premium as "<Total18>"under POEDI
	And Validates Estimated Premium for Self as "<Mpremium19>" for Benefit Amount "<Benefit19>" under HMI
	And Validates Estimated Premium for Spouse as "<Spremium19>" for Benefit Amount "<Sbenefit19>" under HMI
	And Validates Estimated Premium for Child as "<Cpremium19>" for Benefit Amount "<Cbenefit19>" under HMI
	And Validates Total Premium as "<Total19>" under HMI
	And Selects Payment Method for CI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Critical Illness Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium20>" for Benefit Amount "<Benefit20>" under CI
	And Validates Estimated Premium for Spouse as "<Spremium20>" for Benefit Amount "<Sbenefit20>" under CI
	And Validates Total Premium as "<Total20>" under CI
	And Clicks on button to Save for later
	And Clicks OK Button Save For Later
	And Navigate back to Eligibility page 
	And Enters DOB for Self as "<DOB2>"
	And Enters DOB for Spouse as "<SDOB2>"
	And Clicks Edit button for Child Added	
	And Enters DOB for Child as "<CDOB2>"
	And Click on Add Child button on Screen
	And Clicks on next button
	Then Product page details are displayed to user
	And Deselect Product TenYTL for Child
	And Selects product TwentyYTL for Child
	And Selects product FiftyYTL for Self
	And Selects product FiftyYTL for Spouse
	And Clicks on next button
	And Clicks on next button
	Then Request Coverage page is displayed to user 
	And Selects Benefit Amount for Self as "<Benefit21>" under FiveYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit21>" under FiveYTL
	And Selects Benefit Amount for Self as "<Benefit22>" under TenYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit22>" under TenYTL
	And Selects Benefit Amount for Self as "<Benefit23>" under TwentyYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit23>" under TwentyYTL
	And Selects Benefit Amount for Child as "<Cbenefit23>" under TwentyYTL
	And Selects Benefit Amount for Self as "<Benefit24>" under ADDI
	And Selects Benefit Amount for Spouse as "<Sbenefit24>" under ADDI
	And Selects Benefit Amount for Child as "<Cbenefit24>" under ADDI
	And Selects Benefit Amount for Self as "<Benefit25>" under LTDPlus
	And Selects Wait Period for Self as "<WaitPeriod25>" under LTDPlus
	And Selects Benefit Amount for Spouse as "<Sbenefit25>" under LTDPlus
	And Selects Wait Period for Spouse as "<SWaitPeriod25>" under LTDPlus
	And Selects Benefit Amount for Self as "<Benefit26>" under LTD
	And Selects Wait Period for Self as "<WaitPeriod26>" under LTD
	And Selects Benefit Amount for Spouse as "<Sbenefit26>" under LTD
	And Selects Wait Period for Spouse as "<SWaitPeriod26>" under LTD
	And Selects Benefit Amount for Self as "<Benefit27>" under MTDI
	And Selects Wait Period for Self as "<WaitPeriod27>" under MTDI
	And Selects Benefit Amount for Spouse as "<Sbenefit27>" under MTDI
	And Selects Wait Period for Spouse as "<SWaitPeriod27>" under MTDI
	And Selects Benefit Amount for Self as "<Benefit28>" under RDI
	And Selects Wait Period for Self as "<WaitPeriod28>" under RDI
	And Selects Benefit Amount for Self as "<Benefit29>" under POEDI
	And Selects Benefit Amount for Self as "<Benefit30>" under HMI
	And Selects Surgical Amount as "<SAmount30>"
	And Selects Benefit Amount for Spouse as "<Sbenefit30>" under HMI
	And Selects Benefit Amount for Child as "<Cbenefit30>" under HMI
	And Selects Benefit Amount for Self as "<Benefit31>" under CI
	And Selects Benefit Amount for Spouse as "<Sbenefit31>" under CI
	And Selects Benefit Amount for Self as "<Benefit32>" under FiftyYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit32>" under FiftyYTL
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Validates Estimated Premium for Self as "<Mpremium21>" for Benefit Amount "<Benefit21>" under FiveYTL
	And Validates Estimated Premium for Spouse as "<Spremium21>" for Benefit Amount "<Sbenefit21>" under FiveYTL
	And Validates Total Premium as "<Total21>" under FiveYTL
	And Validates Estimated Premium for Self as "<Mpremium22>" for Benefit Amount "<Benefit22>" under TenYTL
	And Validates Estimated Premium for Spouse as "<Spremium22>" for Benefit Amount "<Sbenefit22>" under TenYTL
	And Validates Total Premium as "<Total22>" under TenYTL
	And Validates Estimated Premium for Self as "<Mpremium23>" for Benefit Amount "<Benefit23>" under TwentyYTL
	And Validates Estimated Premium for Spouse as "<Spremium23>" for Benefit Amount "<Sbenefit23>" under TwentyYTL
	And Validates Estimated Premium for Child as "<Cpremium23>" for Benefit Amount "<Benefit23>" under TwentyYTL
	And Validates Total Premium as "<Total23>" under TwentyYTL
	And Validates Estimated Premium for Self as "<Mpremium24>" for Benefit Amount "<Benefit24>" under ADDI
	And Validates Estimated Premium for Spouse as "<Spremium24>" for Benefit Amount "<Sbenefit24>" under ADDI
	And Validates Estimated Premium for Child as "<Cpremium24>" for Benefit Amount "<Cbenefit24>" under ADDI
	And Validates Total Premium as "<Total24>" under ADnD
	And Validates Estimated Premium for Self as "<Mpremium25>" for Benefit Amount "<Benefit25>" under LTDPlus
	And Validates Estimated Premium for Spouse as "<Spremium25>" for Benefit Amount "<Sbenefit25>" under LTDPlus
	And Validates Total Premium as "<Total25>" under LTDPlus
	And Validates Estimated Premium for Self as "<Mpremium26>" for Benefit Amount "<Benefit26>" under LTD
	And Validates Estimated Premium for Spouse as "<Spremium26>" for Benefit Amount "<Sbenefit26>" under LTD
	And Validates Total Premium as "<Total26>" under LTD
	And Validates Estimated Premium for Self as "<Mpremium27>" for Benefit Amount "<Benefit27>" under MTDI
	And Validates Estimated Premium for Spouse as "<Spremium27>" for Benefit Amount "<Sbenefit27>" under MTDI
	And Validates Total Premium as "<Total27>" under MTDI
	And Validates Estimated Premium for Self as "<Mpremium28>" for Benefit Amount "<Benefit28>" under RDI
	And Validates Total Premium as "<Total28>" under RDI
	And Validates Estimated Premium for Self as "<Mpremium29>" for Benefit Amount "<Benefit29>" under POEDI
	And Validates Total Premium as "<Total29>"under POEDI
	And Validates Estimated Premium for Self as "<Mpremium30>" for Benefit Amount "<Benefit30>" under HMI
	And Validates Estimated Premium for Spouse as "<Spremium30>" for Benefit Amount "<Sbenefit30>" under HMI
	And Validates Estimated Premium for Child as "<Cpremium30>" for Benefit Amount "<Cbenefit30>" under HMI
	And Validates Total Premium as "<Total30>" under HMI
	And Validates Estimated Premium for Self as "<Mpremium31>" for Benefit Amount "<Benefit31>" under CI
	And Validates Estimated Premium for Spouse as "<Spremium31>" for Benefit Amount "<Sbenefit31>" under CI
	And Validates Total Premium as "<Total31>" under CI
	Then Payment Information Page is displayed to user And Selects Payment Method for FiftyYTL
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Fifty Year Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium32>" for Benefit Amount "<Benefit32>" under FiftyYTL
	And Validates Estimated Premium for Spouse as "<Spremium32>" for Benefit Amount "<Sbenefit32>" under FiftyYTL
	And Validates Total Premium as "<Total32>" under FiftyYTL
	And Clicks on button to Save for later
	And Clicks OK Button Save For Later
	And Navigate back to Eligibility page 
	And Enters DOB for Self as "<DOB3>"
	And Enters DOB for Spouse as "<SDOB3>"
	And Clicks Edit button for Child Added
	And Enters DOB for Child as "<CDOB3>"
	And Click on Add Child button on Screen
	And Clicks on next button
	Then Product page details are displayed to user
	And Deselect product TwentyYTL for Child
	And Selects product FiveYTL for Child
	And Clicks on next button
	Then Click YES for Dependent Coverage information
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit33>" under FiveYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit33>" under FiveYTL
	And Selects Benefit Amount for Child as "<Cbenefit33>" under FiveYTL
	And Selects Benefit Amount for Child as "<Cbenefit34>" under ADDI
	And Selects Benefit Amount for Self as "<Benefit35>" under HMI
	And Selects Surgical Amount as "<SAmount35>"
	And Selects Benefit Amount for Spouse as "<Sbenefit35>" under HMI
	And Selects Benefit Amount for Child as "<Cbenefit35>" under HMI
	And Selects Benefit Amount for Self as "<Benefit36>" under FiftyYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit36>" under FiftyYTL
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Validates Estimated Premium for Self as "<Mpremium33>" for Benefit Amount "<Benefit33>" under FiveYTL
	And Validates Estimated Premium for Spouse as "<Spremium33>" for Benefit Amount "<Sbenefit33>" under FiveYTL
	And Validates Estimated Premium for Child as "<Cpremium33>" for Benefit Amount "<Cbenefit33>" under FiveYTL
	And Validates Total Premium as "<Total33>" under FiveYTL
	And Validates Estimated Premium for Child as "<Cpremium34>" for Benefit Amount "<Cbenefit34>" under ADDI
	And Validates Total Premium as "<Total34>" under ADnD
	And Validates Estimated Premium for Self as "<Mpremium35>" for Benefit Amount "<Benefit35>" under HMI
	And Validates Estimated Premium for Spouse as "<Spremium35>" for Benefit Amount "<Sbenefit35>" under HMI
	And Validates Estimated Premium for Child as "<Cpremium35>" for Benefit Amount "<Cbenefit935>" under HMI
	And Validates Total Premium as "<Total35>" under HMI
	And Validates Estimated Premium for Self as "<Mpremium36>" for Benefit Amount "<Benefit36>" under FiftyYTL
	And Validates Estimated Premium for Spouse as "<Spremium36>" for Benefit Amount "<Sbenefit36>" under FiftyYTL
	And Validates Total Premium as "<Total36>" under FiftyYTL
	
Examples:
|Website |Title   |Fname |Lname |State    |DOB                 |WorkHr  |Stitle |Sfname |Slname |SDOB                |SWorkHr |Cfname |Clname |CDOB                |CSex |MonthlyIncome |Mexpense |Percresp |SMonthlyIncome |TotalAmt |STotalAmt |Benefit  |Sbenefit|Cbenefit |Benefit1 |Sbenefit1 |Benefit2 |Sbenefit2 |Benefit3 |Sbenefit3 |Cbenefit3 |Benefit4 |WaitPeriod|Sbenefit4  |SWaitPeriod  |Benefit5 |WaitPeriod1|Sbenefit5|SWaitPeriod1 |Benefit6 |WaitPeriod2 |Sbenefit6 |SWaitPeriod2 |Benefit7   |WaitPeriod3 |Benefit8  |Benefit9 |SAmount |Sbenefit9 |Cbenefit9  |SSN         |Mstatus  |Height |Weight  |Gender_Self |MemberId   |StreetAddress   |City     |Zip   |PrimaryPhType |PrimaryPhNo   |BusinessName |BusinessType |SSSN      |SHeight |SWeight |Gender_Spouse |SPhoneType |SPhoneNum  |Password |VPassword |TobDate       |Product   |STobDate      |SProduct  |Bank               |AccName |Rnum      |Anum   |Frequency |Mpremium |Spremium |Cpremium |Total   |Mpremium1 |Spremium1 |Total1  |Mpremium2 |Spremium2 |Total2   |Mpremium3 |Spremium3 |Cpremium3 |Total3 |Mpremium4 |Spremium4 |Total4  |Mpremium5 |Spremium5 |Total5 |Mpremium6 |Spremium6 |Total6 |Mpremium7 |Total7 |Mpremium8 |Total8 |Mpremium9 |Spremium9 |Cpremium9 |Total9  |DOB1             |SDOB1            |CDOB1             |Benefit10  |Sbenefit10 |Benefit11 |Sbenefit11 |Cbenefit11 |Benefit12 |Sbenefit12 |Benefit13 |Sbenefit13 |Cbenefit13 |Benefit14 |WaitPeriod14 |Sbenefit14 |SWaitPeriod14 |Benefit15 |WaitPeriod15 |Sbenefit15 |SWaitPeriod15 |Benefit16 |WaitPeriod16 |Sbenefit16 |SWaitPeriod16 |Benefit17 |WaitPeriod17 |Benefit18 |Benefit19 |SAmount19 |Sbenefit19 |Cbenefit19 |Benefit20 |Sbenefit20 |Mpremium10 |Spremium10 |Total10 |Mpremium11 |Spremium11 |Cpremium11 |Total11 |Mpremium12 |Spremium12 |Total12 |Mpremium13 |Spremium13 |Cpremium13 |Total13 |Mpremium14 |Spremium14 |Total14  |Mpremium15 |Spremium15 |Total15 |Mpremium16 |Spremium16 |Total16 |Mpremium17 |Total17 |Mpremium18 |Total18 |Mpremium19 |Spremium19 |Cpremium19 |Total19 |Mpremium20 |Spremium20 |Total20 |DOB2              |SDOB2             |CDOB2            |Benefit21 |Sbenefit21 |Benefit22 |Sbenefit22 |Benefit23 |Sbenefit23 |Cbenefit23 |Benefit24 |Sbenefit24 |Cbenefit24 |Benefit25 |WaitPeriod25 |Sbenefit25 |SWaitPeriod25 |Benefit26 |WaitPeriod26 |Sbenefit26 |SWaitPeriod26 |Benefit27 |WaitPeriod27 |Sbenefit27 |SWaitPeriod27 |Benefit28 |WaitPeriod28 |Benefit29 |Benefit30 |Sbenefit30 |Cbenefit30 |SAmount30 |Benefit31 |Sbenefit31 |Benefit32 |Sbenefit32 |Mpremium21 |Spremium21 |Total21 |Mpremium22 |Spremium22 |Total22   |Mpremium23 |Spremium23 |Cpremium23 |Total23 |Mpremium24 |Spremium24 |Cpremium24 |Total24 |Mpremium25 |Spremium25 |Total25 |Mpremium26 |Spremium26 |Total26 |Mpremium27 |Spremium27 |Total27 |Mpremium28 |Total28 |Mpremium29 |Total29 |Mpremium30 |Spremium30 |Cpremium30 |Total30 |Mpremium31 |Spremium31 |Total31 |Mpremium32 |Spremium32 |Total32 |DOB3              |SDOB3             |CDOB3             |Benefit33 |Sbenefit33 |Cbenefit33|Cbenefit34 |Benefit35 |Sbenefit35 |Cbenefit35 |SAmount35 |Benefit36 |Sbenefit36 |Mpremium33 |Spremium33 |Cpremium33 |Total33  |Cpremium34 |Total34 |Mpremium35 |Spremium35 |Cpremium35 |Total35 |Mpremium36 |Spremium36 |Total36  |
|abe     |Mr.     |Adam  |Gill  |New York |SYSDATE - 17Y/0M/0D |40      |Mrs.   |Bella  |Gill   |SYSDATE - 17Y/0M/0D |45      |John   |Gill   |SYSDATE -00Y/0M/14D |Male |15000         |10000    |100      |20000          |15000    |15000     |500000   |500000  |5000     |500000   |500000    |500000   |500000    |100000   |100000    |25000     |1000     |90 Days   |100        |90 Days      |100      |30 Days    |100      |90 Days      |3000     |90 Days     |100       |90 Days      |1000       |180 Days    |500       |200      |1000    |200       |200        |070000000   |Married  |5.0    |188     |Male        |745858     |2699 Centre Ave |Bellmore |11710 |Home          |7412589963    |Lex Corp     |Corporation  |990067501 |5.0     |188     |Female        |Mobile     |6767564545 |Adam@123 |Adam@123  |05/04/2018    |Cigar     |05/04/2018    |Cigar     |bank of america    |Adam    |745588512 |687877 |Monthly   |$30.92   |$29.54   |$0.83    |$61.29  |$88.75    |$76.66    |$165.41 |$82.91    |$60.84    |$143.75  |$7.00     |$5.60     |$1.00     |$13.60 |$9.98     |$0.42     |$10.40  |$20.95    |$0.39     |$21.34 |$7.36     |$0.31     |$7.67  |$2.51     |$2.51  |$1.67     |$1.67  |$17.12    |$22.62    |$25.30    |$65.04  |SYSDATE-25Y/0M/0D|SYSDATE-25Y/0M/0D|SYSDATE-16Y/0M/0D |$300,000   |$300,000   |$250,000  |$250,000   |15000      |$250,000  |$250,000   |$250,000  |$250,000   |50000      |$3,000    |180 Days     |$2,500     |180 Days      |$1,000    |60 Days      |$1,000     |180 Days      |$1,500    |14 Days      |$500       |180 Days      |$2,000    |365 Days     |$1,500    |300       |2000      |300        |300        |$5,000    |$5,000     |$19.57     |$18.75     |$38.32  |$45.42     |$38.96     |$2.50      |$86.88  |$43.54     |$32.29     |$75.83  |$17.50     |$14.00     |$2.00      |$33.50  |$13.57     |$8.67      |$22.24   |$19.58     |$3.23      |$22.81  |$12.20     |$1.35      |$13.55  |$4.22      |$4.22   |$5.00      |$5.00   |$26.73     |$35.20     |$39.26     |$101.19 |$3.02      |$3.02      |$6.04   |SYSDATE-54Y/0M/0D |SYSDATE-54Y/0M/0D |SYSDATE-25Y/0M/0D|$100,000  |$100,000   |$190,000  |$190,000   |$100,000  |$100,000   |10000      |$350,000  |$350,000   |25000      |$1,500    |365 Days     |$2,000     |365 Days      |$3,500    |180 Days     |$1,500     |365 Days      |$3,500    |30 Days      |$1,500     |180 Days      |$3,500    |365 Days     |$10,000   |400       |400        |400        |1000      |$100,000  |$100,000   |$25,000   |$25,000    |$60.08     |$45.82     |$105.90 |$204.72    |$142.50    |$347.22   |$147.17    |$91.09     |$1.67      |$239.93 |$24.50     |$19.60     |$1.00      |$45.10  |$31.40     |$46.20     |$77.60  |$66.62     |$32.18     |$98.80  |$65.28     |$20.38     |$85.66  |$58.32     |$58.32  |$125.00    |$125.00 |$65.51     |$84.54     |$47.96     |$198.01 |$349.25    |$349.25    |$698.50 |$30.48     |$17.73     |$48.21  |SYSDATE-75Y/0M/0D |SYSDATE-75Y/0M/0D |SYSDATE-26Y/0M/0D |$20,000   |$20,000    |25000     | 50000     |500       |500        |500        |2000      |$100,000  |$100,000   |$130.00    |$103.33    |$4.17      |$237.50  |$2.00      |$2.00   |$116.57    |$136.39    |$61.86     |$314.82 |$762.50    |$587.08    |$1,349.58|



@AbeRate_02
Scenario Outline: <ABESCR02>Complete work flow of application for Non Smoker,  Non Montana
	Given Test set up for "NYL" feature and "NYL_ABE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	And Scroll down and click on I Attest To Having Read the Above Information button
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
  	And Honorably Discharged question as No
	And Click on Add Child button on Screen
	And Clicks on next button
	Then Product page details are displayed to user
	And Selects product FiveYTL for Self
	And Selects product FiveYTL for Spouse
	And Selects product FiveYTL for Child
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
	And Selects product HMI for Self
	And Selects product HMI for Spouse
	And Selects product HMI for Child
	And Clicks on next button
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self	
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
	And Confirms Imp Replacement Info for NewYork state
	And Selects Answer as No for all additional questions of Group Disability Insurance for Self
	And Enters Monthly Income for Self as "<MonthlyIncome>"
	And Enters details for Monthly Expense and Percentage Responsible as "<Mexpense>","<Percresp>"
	And Selects Answer as No for Additional Questions as No for all for Spouse of Group Disability Insuranse
	And Enters Monthly Income as "<SMonthlyIncome>" for Spouse
	And Selects Yes for Do you have other life insurance in force for Self
	And Enters Total Amount for Self as "<TotalAmt>"
	And Selects Yes for life insurance applied for intended to replace for Self
	And Selects Yes for Do you have other life insurance in force for Spouse
	And Enters Total Amount for Spouse as "<STotalAmt>"
	And Selects Yes for life insurance applied for intended to replace for Spouse
	And Clicks on next button
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
	And Selects Law School Loan Payment Benefit Rider under LTDP
	And Selects Cost of Living Adjustment Rider under LTDP Product
	And Selects Benefit Amount for Spouse as "<Sbenefit4>" under LTDPlus
	And Selects Wait Period for Spouse as "<SWaitPeriod>" under LTDPlus
	And Selects Catastrophic Disability Benefit Rider for Spouse under LTDPlus
	And Selects Cost of Living Adjustment Rider for LTDP Product for Spouse
	And Selects Benefit Amount for Self as "<Benefit5>" under LTD
	And Selects Wait Period for Self as "<WaitPeriod1>" under LTD
	And Selects Cost of Living Adjustment Rider under LTD product
	And Selects Law School Loan Payment Benefit Rider under LTD
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
	And Selects Benefit Amount for Self as "<Benefit9>" under HMI
	And Selects Surgical Option Rider for Self under HMI
	And Selects Surgical Amount as "<SAmount>"
	And Selects Benefit Amount for Spouse as "<Sbenefit9>" under HMI
	And Selects Benefit Amount for Child as "<Cbenefit9>" under HMI
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
	Then Payment Information Page is displayed to user and user Selects Payment option as Bank for FiveYTL Product
	And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
	And Clicks on Save button
	And Selects Frequency for FiveYTL Product and reviews "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium>" for Benefit Amount "<Benefit>" under FiveYTL
	And Validates Estimated Premium for Spouse as "<Spremium>" for Benefit Amount "<Sbenefit>" under FiveYTL
	And Validates Estimated Premium for Child as "<Cpremium>" for Benefit Amount "<Cbenefit>" under FiveYTL
	And Validates Total Premium as "<Total>" under FiveYTL
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
	And Selects Payment Method for ADDI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Accidental Death Product and reviews "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium3>" for Benefit Amount "<Benefit3>" under ADDI
	And Validates Estimated Premium for Spouse as "<Spremium3>" for Benefit Amount "<Sbenefit3>" under ADDI
	And Validates Estimated Premium for Child as "<Cpremium3>" for Benefit Amount "<Cbenefit3>" under ADDI
	And Validates Total Premium as "<Total3>" under ADnD
	And Selects Payment Method for LTDPlus
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Long Term Disability Plus Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium4>" for Benefit Amount "<Benefit4>" under LTDPlus
	And Validates Estimated Premium for Spouse as "<Spremium4>" for Benefit Amount "<Sbenefit4>" under LTDPlus
	And Validates Total Premium as "<Total4>" under LTDPlus
	And Selects Payment Method for LTD
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Long Term Disability Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium5>" for Benefit Amount "<Benefit5>" under LTD
	And Validates Estimated Premium for Spouse as "<Spremium5>" for Benefit Amount "<Sbenefit5>" under LTD
	And Validates Total Premium as "<Total5>" under LTD
	And Selects Payment Method for MTDI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Mid Term Disability Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium6>" for Benefit Amount "<Benefit6>" under MTDI
	And Validates Estimated Premium for Spouse as "<Spremium6>" for Benefit Amount "<Sbenefit6>" under MTDI
	And Validates Total Premium as "<Total6>" under MTDI
	And Selects Payment Method for RTDI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Retirement Disability Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium7>" for Benefit Amount "<Benefit7>" under RDI
	And Validates Total Premium as "<Total7>" under RDI
	And Selects Payment Method for POEDI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Professional Disability Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium8>" for Benefit Amount "<Benefit8>" under POEDI
	And Validates Total Premium as "<Total8>"under POEDI
	And Selects Payment Method for HMI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Hospital Money Insurance Product and reviews "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium9>" for Benefit Amount "<Benefit9>" under HMI
	And Validates Estimated Premium for Spouse as "<Spremium9>" for Benefit Amount "<Sbenefit9>" under HMI
	And Validates Estimated Premium for Child as "<Cpremium9>" for Benefit Amount "<Cbenefit9>" under HMI
	And Validates Total Premium as "<Total9>" under HMI
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
	And Deselect Product FiveYTL for Child
	And Selects product TenYTL for Child
	And Selects product CI for Self
	And Selects product CI for Spouse
	And Clicks on next button
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit10>" under FiveYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit10>" under FiveYTL
	And Selects Benefit Amount for Self as "<Benefit11>" under TenYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit11>" under TenYTL
	And Selects Benefit Amount for Child as "<Cbenefit11>" under TenYTL
	And Selects Benefit Amount for Self as "<Benefit12>" under TwentyYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit12>" under TwentyYTL
	And Selects Benefit Amount for Self as "<Benefit13>" under ADDI
	And Selects Benefit Amount for Spouse as "<Sbenefit13>" under ADDI
	And Selects Benefit Amount for Child as "<Cbenefit13>" under ADDI
	And Selects Benefit Amount for Self as "<Benefit14>" under LTDPlus
	And Selects Wait Period for Self as "<WaitPeriod14>" under LTDPlus
	And Selects Benefit Amount for Spouse as "<Sbenefit14>" under LTDPlus
	And Selects Wait Period for Spouse as "<SWaitPeriod14>" under LTDPlus
	And Selects Benefit Amount for Self as "<Benefit15>" under LTD
	And Selects Wait Period for Self as "<WaitPeriod15>" under LTD
	And Selects Benefit Amount for Spouse as "<Sbenefit15>" under LTD
	And Selects Wait Period for Spouse as "<SWaitPeriod15>" under LTD
	And Selects Benefit Amount for Self as "<Benefit16>" under MTDI
	And Selects Wait Period for Self as "<WaitPeriod16>" under MTDI
	And Selects Benefit Amount for Spouse as "<Sbenefit16>" under MTDI
	And Selects Wait Period for Spouse as "<SWaitPeriod16>" under MTDI
	And Selects Benefit Amount for Self as "<Benefit17>" under RDI
	And Selects Wait Period for Self as "<WaitPeriod17>" under RDI
	And Selects Benefit Amount for Self as "<Benefit18>" under POEDI
	And Selects Benefit Amount for Self as "<Benefit19>" under HMI
	And Selects Surgical Amount as "<SAmount19>"
	And Selects Benefit Amount for Spouse as "<Sbenefit19>" under HMI
	And Selects Benefit Amount for Child as "<Cbenefit19>" under HMI
	And Selects Benefit Amount for Self as "<Benefit20>" under CI
	And Selects Benefit Amount for Spouse as "<Sbenefit20>" under CI
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Validates Estimated Premium for Self as "<Mpremium10>" for Benefit Amount "<Benefit10>" under FiveYTL
	And Validates Estimated Premium for Spouse as "<Spremium10>" for Benefit Amount "<Sbenefit10>" under FiveYTL
	And Validates Total Premium as "<Total10>" under FiveYTL
	And Validates Estimated Premium for Self as "<Mpremium11>" for Benefit Amount "<Benefit11>" under TenYTL
	And Validates Estimated Premium for Spouse as "<Spremium11>" for Benefit Amount "<Sbenefit11>" under TenYTL
	And Validates Estimated Premium for Child as "<Cpremium11>" for Benefit Amount "<Cbenefit11>" under TenYTL
	And Validates Total Premium as "<Total11>" under TenYTL
	And Validates Estimated Premium for Self as "<Mpremium12>" for Benefit Amount "<Benefit12>" under TwentyYTL
	And Validates Estimated Premium for Spouse as "<Spremium12>" for Benefit Amount "<Sbenefit12>" under TwentyYTL
	And Validates Total Premium as "<Total12>" under TwentyYTL
	And Validates Estimated Premium for Self as "<Mpremium13>" for Benefit Amount "<Benefit13>" under ADDI
	And Validates Estimated Premium for Spouse as "<Spremium13>" for Benefit Amount "<Sbenefit13>" under ADDI
	And Validates Estimated Premium for Child as "<Cpremium13>" for Benefit Amount "<Cbenefit13>" under ADDI
	And Validates Total Premium as "<Total13>" under ADnD
	And Validates Estimated Premium for Self as "<Mpremium14>" for Benefit Amount "<Benefit14>" under LTDPlus
	And Validates Estimated Premium for Spouse as "<Spremium14>" for Benefit Amount "<Sbenefit14>" under LTDPlus
	And Validates Total Premium as "<Total14>" under LTDPlus
	And Validates Estimated Premium for Self as "<Mpremium15>" for Benefit Amount "<Benefit15>" under LTD
	And Validates Estimated Premium for Spouse as "<Spremium15>" for Benefit Amount "<Sbenefit15>" under LTD
	And Validates Total Premium as "<Total15>" under LTD
	And Validates Estimated Premium for Self as "<Mpremium16>" for Benefit Amount "<Benefit16>" under MTDI
	And Validates Estimated Premium for Spouse as "<Spremium16>" for Benefit Amount "<Sbenefit16>" under MTDI
	And Validates Total Premium as "<Total16>" under MTDI
	And Validates Estimated Premium for Self as "<Mpremium17>" for Benefit Amount "<Benefit17>" under RDI
	And Validates Total Premium as "<Total17>" under RDI
	And Validates Estimated Premium for Self as "<Mpremium18>" for Benefit Amount "<Benefit18>" under POEDI
	And Validates Total Premium as "<Total18>"under POEDI
	And Validates Estimated Premium for Self as "<Mpremium19>" for Benefit Amount "<Benefit19>" under HMI
	And Validates Estimated Premium for Spouse as "<Spremium19>" for Benefit Amount "<Sbenefit19>" under HMI
	And Validates Estimated Premium for Child as "<Cpremium19>" for Benefit Amount "<Cbenefit19>" under HMI
	And Validates Total Premium as "<Total19>" under HMI
	And Selects Payment Method for CI
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Critical Illness Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium20>" for Benefit Amount "<Benefit20>" under CI
	And Validates Estimated Premium for Spouse as "<Spremium20>" for Benefit Amount "<Sbenefit20>" under CI
	And Validates Total Premium as "<Total20>" under CI
	And Clicks on button to Save for later
	And Clicks OK Button Save For Later
	And Navigate back to Eligibility page 
	And Enters DOB for Self as "<DOB2>"
	And Enters DOB for Spouse as "<SDOB2>"
	And Clicks Edit button for Child Added	
	And Enters DOB for Child as "<CDOB2>"
	And Click on Add Child button on Screen
	And Clicks on next button
	Then Product page details are displayed to user
	And Deselect Product TenYTL for Child
	And Selects product TwentyYTL for Child
	And Selects product FiftyYTL for Self
	And Selects product FiftyYTL for Spouse
	And Clicks on next button
	And Clicks on next button
	Then Request Coverage page is displayed to user 
	And Selects Benefit Amount for Self as "<Benefit21>" under FiveYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit21>" under FiveYTL
	And Selects Benefit Amount for Self as "<Benefit22>" under TenYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit22>" under TenYTL
	And Selects Benefit Amount for Self as "<Benefit23>" under TwentyYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit23>" under TwentyYTL
	And Selects Benefit Amount for Child as "<Cbenefit23>" under TwentyYTL
	And Selects Benefit Amount for Self as "<Benefit24>" under ADDI
	And Selects Benefit Amount for Spouse as "<Sbenefit24>" under ADDI
	And Selects Benefit Amount for Child as "<Cbenefit24>" under ADDI
	And Selects Benefit Amount for Self as "<Benefit25>" under LTDPlus
	And Selects Wait Period for Self as "<WaitPeriod25>" under LTDPlus
	And Selects Benefit Amount for Spouse as "<Sbenefit25>" under LTDPlus
	And Selects Wait Period for Spouse as "<SWaitPeriod25>" under LTDPlus
	And Selects Benefit Amount for Self as "<Benefit26>" under LTD
	And Selects Wait Period for Self as "<WaitPeriod26>" under LTD
	And Selects Benefit Amount for Spouse as "<Sbenefit26>" under LTD
	And Selects Wait Period for Spouse as "<SWaitPeriod26>" under LTD
	And Selects Benefit Amount for Self as "<Benefit27>" under MTDI
	And Selects Wait Period for Self as "<WaitPeriod27>" under MTDI
	And Selects Benefit Amount for Spouse as "<Sbenefit27>" under MTDI
	And Selects Wait Period for Spouse as "<SWaitPeriod27>" under MTDI
	And Selects Benefit Amount for Self as "<Benefit28>" under RDI
	And Selects Wait Period for Self as "<WaitPeriod28>" under RDI
	And Selects Benefit Amount for Self as "<Benefit29>" under POEDI
	And Selects Benefit Amount for Self as "<Benefit30>" under HMI
	And Selects Surgical Amount as "<SAmount30>"
	And Selects Benefit Amount for Spouse as "<Sbenefit30>" under HMI
	And Selects Benefit Amount for Child as "<Cbenefit30>" under HMI
	And Selects Benefit Amount for Self as "<Benefit31>" under CI
	And Selects Benefit Amount for Spouse as "<Sbenefit31>" under CI
	And Selects Benefit Amount for Self as "<Benefit32>" under FiftyYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit32>" under FiftyYTL
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validates Estimated Premium for Self as "<Mpremium21>" for Benefit Amount "<Benefit21>" under FiveYTL
	And Validates Estimated Premium for Spouse as "<Spremium21>" for Benefit Amount "<Sbenefit21>" under FiveYTL
	And Validates Total Premium as "<Total21>" under FiveYTL
	And Validates Estimated Premium for Self as "<Mpremium22>" for Benefit Amount "<Benefit22>" under TenYTL
	And Validates Estimated Premium for Spouse as "<Spremium22>" for Benefit Amount "<Sbenefit22>" under TenYTL
	And Validates Total Premium as "<Total22>" under TenYTL
	And Validates Estimated Premium for Self as "<Mpremium23>" for Benefit Amount "<Benefit23>" under TwentyYTL
	And Validates Estimated Premium for Spouse as "<Spremium23>" for Benefit Amount "<Sbenefit23>" under TwentyYTL
	And Validates Estimated Premium for Child as "<Cpremium23>" for Benefit Amount "<Benefit23>" under TwentyYTL
	And Validates Total Premium as "<Total23>" under TwentyYTL
	And Validates Estimated Premium for Self as "<Mpremium24>" for Benefit Amount "<Benefit24>" under ADDI
	And Validates Estimated Premium for Spouse as "<Spremium24>" for Benefit Amount "<Sbenefit24>" under ADDI
	And Validates Estimated Premium for Child as "<Cpremium24>" for Benefit Amount "<Cbenefit24>" under ADDI
	And Validates Total Premium as "<Total24>" under ADnD
	And Validates Estimated Premium for Self as "<Mpremium25>" for Benefit Amount "<Benefit25>" under LTDPlus
	And Validates Estimated Premium for Spouse as "<Spremium25>" for Benefit Amount "<Sbenefit25>" under LTDPlus
	And Validates Total Premium as "<Total25>" under LTDPlus
	And Validates Estimated Premium for Self as "<Mpremium26>" for Benefit Amount "<Benefit26>" under LTD
	And Validates Estimated Premium for Spouse as "<Spremium26>" for Benefit Amount "<Sbenefit26>" under LTD
	And Validates Total Premium as "<Total26>" under LTD
	And Validates Estimated Premium for Self as "<Mpremium27>" for Benefit Amount "<Benefit27>" under MTDI
	And Validates Estimated Premium for Spouse as "<Spremium27>" for Benefit Amount "<Sbenefit27>" under MTDI
	And Validates Total Premium as "<Total27>" under MTDI
	And Validates Estimated Premium for Self as "<Mpremium28>" for Benefit Amount "<Benefit28>" under RDI
	And Validates Total Premium as "<Total28>" under RDI
	And Validates Estimated Premium for Self as "<Mpremium29>" for Benefit Amount "<Benefit29>" under POEDI
	And Validates Total Premium as "<Total29>"under POEDI
	And Validates Estimated Premium for Self as "<Mpremium30>" for Benefit Amount "<Benefit30>" under HMI
	And Validates Estimated Premium for Spouse as "<Spremium30>" for Benefit Amount "<Sbenefit30>" under HMI
	And Validates Estimated Premium for Child as "<Cpremium30>" for Benefit Amount "<Cbenefit30>" under HMI
	And Validates Total Premium as "<Total30>" under HMI
	And Validates Estimated Premium for Self as "<Mpremium31>" for Benefit Amount "<Benefit31>" under CI
	And Validates Estimated Premium for Spouse as "<Spremium31>" for Benefit Amount "<Sbenefit31>" under CI
	And Validates Total Premium as "<Total31>" under CI
	Then Payment Information Page is displayed to user And Selects Payment Method for FiftyYTL
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Fifty Year Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium32>" for Benefit Amount "<Benefit32>" under FiftyYTL
	And Validates Estimated Premium for Spouse as "<Spremium32>" for Benefit Amount "<Sbenefit32>" under FiftyYTL
	And Validates Total Premium as "<Total32>" under FiftyYTL
	And Clicks on button to Save for later
	And Clicks OK Button Save For Later
	And Navigate back to Eligibility page 
	And Enters DOB for Self as "<DOB3>"
	And Enters DOB for Spouse as "<SDOB3>"
	And Clicks Edit button for Child Added
	And Enters DOB for Child as "<CDOB3>"
	And Click on Add Child button on Screen
	And Clicks on next button
	Then Product page details are displayed to user
	And Deselect product TwentyYTL for Child
	And Selects product FiveYTL for Child
	And Clicks on next button
	Then Click YES for Dependent Coverage information
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit33>" under FiveYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit33>" under FiveYTL
	And Selects Benefit Amount for Child as "<Cbenefit33>" under FiveYTL
	And Selects Benefit Amount for Child as "<Cbenefit34>" under ADDI
	And Selects Benefit Amount for Self as "<Benefit35>" under HMI
	And Selects Surgical Amount as "<SAmount35>"
	And Selects Benefit Amount for Spouse as "<Sbenefit35>" under HMI
	And Selects Benefit Amount for Child as "<Cbenefit35>" under HMI
	And Selects Benefit Amount for Self as "<Benefit36>" under FiftyYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit36>" under FiftyYTL
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Validates Estimated Premium for Self as "<Mpremium33>" for Benefit Amount "<Benefit33>" under FiveYTL
	And Validates Estimated Premium for Spouse as "<Spremium33>" for Benefit Amount "<Sbenefit33>" under FiveYTL
	And Validates Estimated Premium for Child as "<Cpremium33>" for Benefit Amount "<Cbenefit33>" under FiveYTL
	And Validates Total Premium as "<Total33>" under FiveYTL
	And Validates Estimated Premium for Child as "<Cpremium34>" for Benefit Amount "<Cbenefit34>" under ADDI
	And Validates Total Premium as "<Total34>" under ADnD
	And Validates Estimated Premium for Self as "<Mpremium35>" for Benefit Amount "<Benefit35>" under HMI
	And Validates Estimated Premium for Spouse as "<Spremium35>" for Benefit Amount "<Sbenefit35>" under HMI
	And Validates Estimated Premium for Child as "<Cpremium35>" for Benefit Amount "<Cbenefit935>" under HMI
	And Validates Total Premium as "<Total35>" under HMI
	And Validates Estimated Premium for Self as "<Mpremium36>" for Benefit Amount "<Benefit36>" under FiftyYTL
	And Validates Estimated Premium for Spouse as "<Spremium36>" for Benefit Amount "<Sbenefit36>" under FiftyYTL
	And Validates Total Premium as "<Total36>" under FiftyYTL
	

Examples:
|Website |Title   |Fname    |Lname     |State    |DOB                 |WorkHr   |Stitle |Sfname |Slname    |SDOB                |SWorkHr |Cfname |Clname    |CDOB                 |Csex |MonthlyIncome |Mexpense |Percresp |SMonthlyIncome |TotalAmt |STotalAmt |Benefit|Sbenefit|Cbenefit |Benefit1 |Sbenefit1 |Benefit2 |Sbenefit2 |Benefit3 |Sbenefit3 |Cbenefit3 |Benefit4 |WaitPeriod |Sbenefit4|SWaitPeriod |Benefit5 |WaitPeriod1|Sbenefit5|SWaitPeriod1|Benefit6 |WaitPeriod2 |Sbenefit6 |SWaitPeriod2 |Benefit7   |WaitPeriod3 |Benefit8  |Benefit9 |SAmount |Sbenefit9 |Cbenefit9 |SSN      |Mstatus  |Height |Weight  |Gender_Self |MemberId|StreetAddress   |City     |Zip   |PrimaryPhType |PrimaryPhNo   |BusinessName |BusinessType |SSSN     |SHeight |SWeight |Gender_Spouse |SPhoneType |SPhoneNum  |Password |VPassword |Bank           |AccName |Rnum     |Anum   |Frequency |Mpremium |Spremium |Cpremium |Total   |Mpremium1 |Spremium1 |Total1 |Mpremium2 |Spremium2 |Total2   |Mpremium3 |Spremium3 |Cpremium3 |Total3 |Mpremium4 |Spremium4 |Total4|Mpremium5 |Spremium5 |Total5 |Mpremium6 |Spremium6 |Total6 |Mpremium7 |Total7 |Mpremium8 |Total8 |Mpremium9 |Spremium9 |Cpremium9 |Total9  |DOB1             |SDOB1             |CDOB1             |Benefit10|Sbenefit10 |Benefit11 |Sbenefit11 |Cbenefit11 |Benefit12 |Sbenefit12 |Benefit13 |Sbenefit13|Cbenefit13|Benefit14|WaitPeriod14|Sbenefit14|SWaitPeriod14|Benefit15|WaitPeriod15|Sbenefit15|SWaitPeriod15|Benefit16 |WaitPeriod16|Sbenefit16|SWaitPeriod16|Benefit17|WaitPeriod17|Benefit18 |Benefit19 |SAmount19 |Sbenefit19 |Cbenefit19 |Benefit20 |Sbenefit20 |Mpremium10 |Spremium10 |Total10 |Mpremium11|Spremium11|Cpremium11|Total11 |Mpremium12 |Spremium12 |Total12 |Mpremium13 |Spremium13 |Cpremium13 |Total13 |Mpremium14 |Spremium14 |Total14  |Mpremium15 |Spremium15 |Total15 |Mpremium16 |Spremium16 |Total16 |Mpremium17 |Total17 |Mpremium18 |Total18 |Mpremium19 |Spremium19 |Cpremium19 |Total19 |Mpremium20 |Spremium20 |Total20 |DOB2              |SDOB2             |CDOB2            |Benefit21 |Sbenefit21 |Benefit22 |Sbenefit22 |Benefit23 |Sbenefit23 |Cbenefit23 |Benefit24 |Sbenefit24 |Cbenefit24 |Benefit25 |WaitPeriod25 |Sbenefit25 |SWaitPeriod25 |Benefit26 |WaitPeriod26 |Sbenefit26 |SWaitPeriod26 |Benefit27 |WaitPeriod27 |Sbenefit27 |SWaitPeriod27 |Benefit28 |WaitPeriod28 |Benefit29 |Benefit30 |Sbenefit30 |Cbenefit30 |SAmount30 |Benefit31 |Sbenefit31 |Benefit32 |Sbenefit32 |Mpremium21 |Spremium21 |Total21 |Mpremium22 |Spremium22 |Total22   |Mpremium23 |Spremium23 |Cpremium23 |Total23 |Mpremium24 |Spremium24 |Cpremium24 |Total24 |Mpremium25 |Spremium25 |Total25 |Mpremium26 |Spremium26 |Total26 |Mpremium27 |Spremium27 |Total27 |Mpremium28 |Total28 |Mpremium29 |Total29 |Mpremium30 |Spremium30 |Cpremium30 |Total30 |Mpremium31 |Spremium31 |Total31 |Mpremium32 |Spremium32 |Total32 |DOB3             |SDOB3            |CDOB3             |Benefit33 |Sbenefit33 |Cbenefit33 |Cbenefit34 |Benefit35 |Sbenefit35 |Cbenefit35 |SAmount35 |Benefit36 |Sbenefit36 |Mpremium33 |Spremium33 |Cpremium33 |Total33  |Cpremium34 |Total34 |Mpremium35 |Spremium35 |Cpremium35 |Total35 |Mpremium36|Spremium36 |Total36|
|abe     |Mrs.    |Rihanna  |Stewart   |New York |SYSDATE - 17Y/0M/0D |40       |Mr.    |Bill   |Stewart   |SYSDATE - 17Y/0M/0D |45      |Amy    |Stewart   |SYSDATE - 00Y/0M/14D |Male |15000         |10000    |100      |20000          |15000    |15000     |500000 |500000  |5000     |500000   |500000    |500000   |500000    |100000   |100000    |25000     |1000     |90 Days    |100      |90 Days     |100      |30 Days    |100      |90 Days     |3000     |90 Days     |100       |90 Days      |1000       |180 Days    |500       |200      |1000    |200       |200       |070990000|Married  |5.0    |188     |Female      |748968  |2699 Centre Ave |Bellmore |11710 |Home          |7412589963    |Lex Corp     |Corporation  |991167501|5.0     |188     |Male          |Mobile     |6767564545 |Adam@123 |Adam@123  |bank of america|Adam    |745588512|687877 |Monthly   |$19.25   |$17.88   |$0.83    |$37.96  |$24.59    |$26.66    |$51.25 |$29.58    |$34.59    |$64.17   |$7.00     |$5.60     |$1.00     |$13.60 |$9.98     |$0.42     |$10.40|$20.95    |$0.39     |$21.34 |$7.36     |$0.31     |$7.67  |$2.51     |$2.51  |$1.67     |$1.67  |$17.12    |$22.62    |$25.30    |$65.04  |SYSDATE-25Y/0M/0D|SYSDATE-25Y/0M/0D |SYSDATE-16Y/0M/0D |$300,000 |$300,000   |$250,000  |$250,000   |15000      |$250,000  |$250,000   |$250,000  |$250,000  |50000     |$3,000   |180 Days    |$2,500    |180 Days     |$1,000   |60 Days     |$1,000    |180 Days     |$1,500    |14 Days     |$500      |180 Days     |$2,000   |365 Days    |$1,500    |300       |2000      |300        |300        |$5,000    |$5,000     |$12.57     |$11.75     |$24.32  |$12.71    |$13.75    |$2.50     |$28.96  |$16.67     |$19.16     |$35.83  |$17.50     |$14.00     |$2.00      |$33.50  |$13.57     |$8.67      |$22.24   |$19.58     |$3.23      |$22.81  |$12.20     |$1.35      |$13.55  |$4.22      |$4.22   |$5.00      |$5.00   |$26.73     |$35.20     |$39.26     |$101.19 |$2.01      |$2.01      |$4.02   |SYSDATE-54Y/0M/0D |SYSDATE-54Y/0M/0D |SYSDATE-25Y/0M/0D|$100,000  |$100,000   |$190,000  |$190,000   |$100,000  |$100,000   |10000      |$350,000  |$350,000   |25000      |$1,500    |365 Days     |$2,000     |365 Days      |$3,500    |180 Days     |$1,500     |365 Days      |$3,500    |30 Days      |$1,500     |180 Days      |$3,500    |365 Days     |$10,000   |400       |400        |400        |1000      |$100,000  |$100,000   |$25,000   |$25,000    |$42.08     |$32.15     |$74.23  |$44.81     |$58.58     |$103.39   |$34.50     |$49.75     |$1.67      |$85.92  |$24.50     |$19.60     |$1.00      |$45.10  |$31.40     |$46.20     |$77.60  |$66.62     |$32.18     |$98.80  |$65.28     |$20.38     |$85.66  |$58.32     |$58.32  |$125.00    |$125.00 |$65.51     |$84.54     |$47.96     |$198.01 |$198.50    |$198.50    |$397.00 |$10.60     |$18.25     |$28.85  |SYSDATE-75Y/0M/0D|SYSDATE-75Y/0M/0D|SYSDATE-26Y/0M/0D |$20,000   |$20,000    |25000      |50000      |500       |500        |500        |2000      |$100,000  |$100,000   |$115.33    |$92.40     |$4.17      |$211.90  |$2.00      |$2.00   |$116.57    |$136.39    |$61.86     |$314.82 |$351.50   |$456.67    |$808.17|

@AbeRate_03
Scenario Outline: <ABESCR03>Complete work flow of application for Smoker,Montana
	Given Test set up for "NYL" feature and "NYL_ABE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	And Scroll down and click on I Attest To Having Read the Above Information button
	Then Eligibility page details are displayed to user
	And Select YES Radio button of Membership
	Then Click on Self
	Then Click on Spouse
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	And Enters Eligibility details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>","<SWorkHr>"
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
	And Navigate back to Eligibility page
	And Enters DOB for Self as "<DOB1>"
	And Enters DOB for Spouse as "<SDOB1>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Selects product FiftyYTL for Self
	And Selects product FiftyYTL for Spouse
	And Clicks on next button
	And Clicks on next button
	Then Request Coverage page is displayed to user 
	And Selects Benefit Amount for Self as "<Benefit2>" under TenYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit2>" under TenYTL
	And Selects Benefit Amount for Self as "<Benefit3>" under TwentyYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit3>" under TwentyYTL
	And Selects Benefit Amount for Self as "<Benefit4>" under FiftyYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit4>" under FiftyYTL
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
	Then Payment Information Page is displayed to user And Selects Payment Method for FiftyYTL
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Fifty Year Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium4>" for Benefit Amount "<Benefit4>" under FiftyYTL
	And Validates Estimated Premium for Spouse as "<Spremium4>" for Benefit Amount "<Sbenefit4>" under FiftyYTL
	And Validates Total Premium as "<Total4>" under FiftyYTL
	And Clicks on button to Save for later
	And Clicks OK Button Save For Later
	And Navigate back to Eligibility page
	And Enters DOB for Self as "<DOB2>"
	And Enters DOB for Spouse as "<SDOB2>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit5>" under TenYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit5>" under TenYTL
	And Selects Benefit Amount for Self as "<Benefit6>" under FiftyYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit6>" under FiftyYTL
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Validates Estimated Premium for Self as "<Mpremium5>" for Benefit Amount "<Benefit5>" under TenYTL
	And Validates Estimated Premium for Spouse as "<Spremium5>" for Benefit Amount "<Sbenefit5>" under TenYTL
	And Validates Total Premium as "<Total5>" under TenYTL
	And Validates Estimated Premium for Self as "<Mpremium6>" for Benefit Amount "<Benefit6>" under FiftyYTL
	And Validates Estimated Premium for Spouse as "<Spremium6>" for Benefit Amount "<Sbenefit6>" under FiftyYTL
	And Validates Total Premium as "<Total6>" under FiftyYTL
	And Navigate back to Eligibility page
	And Enters DOB for Self as "<DOB3>"
	And Enters DOB for Spouse as "<SDOB3>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit7>" under FiftyYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit7>" under FiftyYTL
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Validates Estimated Premium for Self as "<Mpremium7>" for Benefit Amount "<Benefit7>" under FiftyYTL
	And Validates Estimated Premium for Spouse as "<Spremium7>" for Benefit Amount "<Sbenefit7>" under FiftyYTL
	And Validates Total Premium as "<Total7>" under FiftyYTL
	

Examples:
|Website |Title   |Fname     |Lname   |State    |DOB                 |WorkHr|Stitle |Sfname    |Slname  |SDOB                |SWorkHr    |Benefit    |Sbenefit  |Benefit1   |Sbenefit1 |SSN      |Mstatus |Height |Weight |Gender_Self |MemberId |StreetAddress  |City       |Zip   |PrimaryPhType |PrimaryPhNo|SSSN      |SHeight |SWeight |Gender_Spouse |SPhoneType|SPhoneNum |TobDate            |Product |STobDate           |SProduct |Bank |AccName  |Rnum     |Anum    |Frequency |Mpremium |Spremium |Total   |Mpremium1 |Spremium1 |Total1  |Password |VPassword |DOB1              |SDOB1             |Benefit2 	|Sbenefit2 	|Benefit3 	|Sbenefit3 	|Benefit4 	|Sbenefit4 |Mpremium2 |Spremium2 |Total2  |Mpremium3 |Spremium3 |Total3  |Mpremium4 |Spremium4 |Total4 |DOB2             |SDOB2             |Benefit5 |Sbenefit5 |Benefit6 |Sbenefit6 |Mpremium5 |Spremium5 |Total5    |Mpremium6|Spremium6  |Total6  |DOB3              |SDOB3              |Benefit7  |Sbenefit7 |Mpremium7 |Spremium7 |Total7    |
|abe     |Mr.     |Sheldon   |Cooper  |Montana  |SYSDATE - 17Y/0M/0D |40    |Mrs.   |Carla     |Cooper  |SYSDATE - 17Y/0M/0D |45         |$1,000,000 |$1,000,000|$1,000,000 |$1,000,000|070000019|Married |5.5    |220    |Male        |147258   |309 E Lewis St |Livingston |59047 |Home          |7412589963 |990041720 |6.0     |180     |Female        |Mobile    |4557858745|SYSDATE-00Y/06M/0D |Cigar   |SYSDATE-00Y/06M/0D |Cigar    |BOA  |Kendrick |798654985|45889665|Monthly   |$130.00  |$130.00  |$260.00 |$150.00   |$150.00   |$300.00 |Adam@123 |Adam@123  |SYSDATE-50Y/0M/0D |SYSDATE-50Y/0M/0D |750000 	|750000 	|250000 	|250000 	|25000 		|25000     |$399.37   |$399.37   |$798.74 |$192.92   |$192.92   |$385.84 |$30.48    |$30.48    |$60.96 |SYSDATE-64Y/0M/0D|SYSDATE-64Y/0M/0D |$510,000 |$510,000  |$100,000 |$100,000  |$850.85   |$850.85   |$1,701.70 |$206.75  |$206.75    |$413.50 |SYSDATE-75Y/0M/0D |SYSDATE-75Y/0M/0D  |$99,000   |$99,000   |$888.11   |$888.11   |$1,776.22 |


@AbeRate_04
Scenario Outline: <ABESCR04>Complete work flow of application for Non Smoker,  Montana

	Given Test set up for "NYL" feature and "NYL_ABE" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	And Scroll down and click on I Attest To Having Read the Above Information button
	Then Eligibility page details are displayed to user
	And Select YES Radio button of Membership
	Then Click on Self
	Then Click on Spouse
	And Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
	And Enters Eligibility details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>","<SWorkHr>"
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
	Then Payment Information Page is displayed to user and user Selects Payment option as Bank for Ten Year Product
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
	And Navigate back to Eligibility page
	And Enters DOB for Self as "<DOB1>"
	And Enters DOB for Spouse as "<SDOB1>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Selects product FiftyYTL for Self
	And Selects product FiftyYTL for Spouse
	And Clicks on next button
	And Clicks on next button
	Then Request Coverage page is displayed to user 
	And Selects Benefit Amount for Self as "<Benefit2>" under TenYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit2>" under TenYTL
	And Selects Benefit Amount for Self as "<Benefit3>" under TwentyYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit3>" under TwentyYTL
	And Selects Benefit Amount for Self as "<Benefit4>" under FiftyYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit4>" under FiftyYTL
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
	And Payment Information Page is displayed to user And Selects Payment Method for FiftyYTL
	And Selects Radio Button for existing payment method
	And Clicks on Save button
	And Selects Frequency for Fifty Year Product "<Frequency>"
	And Validates Estimated Premium for Self as "<Mpremium4>" for Benefit Amount "<Benefit4>" under FiftyYTL
	And Validates Estimated Premium for Spouse as "<Spremium4>" for Benefit Amount "<Sbenefit4>" under FiftyYTL
	And Validates Total Premium as "<Total4>" under FiftyYTL
	And Clicks on button to Save for later
	And Clicks OK Button Save For Later
	And Navigate back to Eligibility page
	And Enters DOB for Self as "<DOB2>"
	And Enters DOB for Spouse as "<SDOB2>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Request Coverage page is displayed to user 
	And Selects Benefit Amount for Self as "<Benefit5>" under TenYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit5>" under TenYTL
	And Selects Benefit Amount for Self as "<Benefit6>" under FiftyYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit6>" under FiftyYTL
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Validates Estimated Premium for Self as "<Mpremium5>" for Benefit Amount "<Benefit5>" under TenYTL
	And Validates Estimated Premium for Spouse as "<Spremium5>" for Benefit Amount "<Sbenefit5>" under TenYTL
	And Validates Total Premium as "<Total5>" under TenYTL
	And Validates Estimated Premium for Self as "<Mpremium6>" for Benefit Amount "<Benefit6>" under FiftyYTL
	And Validates Estimated Premium for Spouse as "<Spremium6>" for Benefit Amount "<Sbenefit6>" under FiftyYTL
	And Validates Total Premium as "<Total6>" under FiftyYTL
	And Navigate back to Eligibility page
	And Enters DOB for Self as "<DOB3>"
	And Enters DOB for Spouse as "<SDOB3>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Request Coverage page is displayed to user 
	And Selects Benefit Amount for Self as "<Benefit7>" under FiftyYTL
	And Selects Benefit Amount for Spouse as "<Sbenefit7>" under FiftyYTL
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	Then Payment Information Page is displayed to user
	And Validates Estimated Premium for Self as "<Mpremium7>" for Benefit Amount "<Benefit7>" under FiftyYTL
	And Validates Estimated Premium for Spouse as "<Spremium7>" for Benefit Amount "<Sbenefit7>" under FiftyYTL
	And Validates Total Premium as "<Total7>" under FiftyYTL
	

Examples:
|Website |Title   |Fname     |Lname   |State    |DOB       				|WorkHr   |Stitle |Sfname    |Slname  |SDOB          		|SWorkHr    	|Benefit 	|Sbenefit  	|Benefit1  	|Sbenefit1  	|SSN  		|Mstatus |Height |Weight |Gender_Self |MemberId |StreetAddress  |City   	|Zip 	|SSSN  		|SHeight 	|SWeight |Gender_Spouse |SPhoneType 	|SPhoneNum  	|Bank 	|AccName 	|Rnum  		|Anum  		|Frequency 	|Mpremium |Spremium |Total  	|Mpremium1 	|Spremium1 |Total1 	|Password |VPassword 	|DOB1   			|SDOB1  			|Benefit2 	|Sbenefit2 	|Benefit3 	|Sbenefit3 	|Benefit4 	|Sbenefit4 	|Mpremium2 |Spremium2 |Total2  |Mpremium3 |Spremium3 	|Total3  |Mpremium4 |Spremium4 	|Total4 |DOB2   				|SDOB2   			|Benefit5 |Sbenefit5 |Benefit6 |Sbenefit6 |Mpremium5 |Spremium5 |Total5    |Mpremium6  	|Spremium6  |Total6 	|DOB3   			|SDOB3     				|Benefit7  |Sbenefit7 	|Mpremium7 |Spremium7 |Total7	|PrimaryPhType |PrimaryPhNo |
|abe     |Mrs     |Rachel    |Green   |Montana  |SYSDATE - 17Y/0M/0D  	|40       |Mr.    |Ross      |Geller  |SYSDATE - 17Y/0M/0D 	|45   			|$1,000,000 |$1,000,000 |$1,000,000 |$1,000,000  	|070000019 	|Married |5.5    |220    |Male        |147258   |309 E Lewis St |Livingston |59047 	|990041720 	|6.0        |180     |Female        |Mobile      	|4557858745  	|BOA 	|Kendrick 	|798654985  |45889665   |Monthly 	|$32.50   |$32.50  	|$65.00  	|$55.00 	|$55.00    |$110.00 |Adam@123 |Adam@123 	|SYSDATE-50Y/0M/0D 	|SYSDATE-50Y/0M/0D 	|750000 	|750000 	|250000 	|250000 	|25000 		|25000 		|$83.75    |$83.75    |$167.50 |$52.29    |$52.29  		|$104.58 |$18.25    |$18.25 	|$36.50 |SYSDATE-64Y/0M/0D    	|SYSDATE-64Y/0M/0D 	|$510,000 |$510,000  |$100,000 |$100,000  |$235.87   |$235.87   |$471.74   |$123.83  	|$123.83    |$247.66 	|SYSDATE-75Y/0M/0D 	|SYSDATE-75Y/0M/0D  	|$99,000   |$99,000  	|$531.88   |$531.88   |$1,063.76|Home          |7412589963	|

