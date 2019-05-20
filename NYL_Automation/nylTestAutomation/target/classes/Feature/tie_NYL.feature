Feature: TIE Test

  @TIERegression_1
  Scenario Outline: <TIESC01> Application submission for Self, Spouse and Child and with all the products and Beneficiaries- Maximum
    Given Test set up for "NYL" feature and "NYL_TIE" scenario
    Given Customer navigate to NYL "<Website>"
    And Select Association from Drop down value as "<Association>"
		When Clicks on Apply now button
 		Then Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"   
 		Then Select YES Radio button of Membership
		And Click on Self  
		And Click on Spouse  
		And Click on Child   
		And select ArmedForce "<Armedforces>"
		And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
		And Select radio button Yes for Spouse is Member
		And Click on Add Child button
		#Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>" 
		Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
		And Selects Married question as No
		And Selects No for full time student for Child
		And Click on Add Child button on Screen
		And Clicks on next button
		#Hide-And Verify that error message is displayed for state eligibility at top of the page
		And Enter New State as "<State1>"
		And Clicks on next button
		#Hide-Then Verify that Product page are displayed to user
		And Clicks on Back or Previous button
		And Enters DOB for Self as "<DOB1>"
		And Enters DOB for Spouse as "<SDOB1>"
		And Clicks on next button
		#Then Product page details are displayed to user and Validates that Member and Spouse are not displayed
		#Hide-Then Validates that Self is not displayed for TermLife,TenYTL,ADDI,DII
    #Hide-Then Validates that Spouse is not displayed for TermLife,TenYTL,ADDI,DII
		And Clicks on Back or Previous button
		And Enters DOB for Self as "<DOB>"
		And Enters DOB for Spouse as "<SDOB>"
		And Clicks on next button		
		#And Verify Available Product List TermLife,TenYTL,ADDI,DI
		And Product page details are displayed to user and Verify Available Product List TermLife,TenYTL,ADD,DII
		And Selects product TermLife for Self
		And Selects product TermLife for Spouse
		And Selects product TermLife for Child
		And Selects product TenYTL for Self
		And Selects product TenYTL for Spouse
		#And Selects product ADDI for Self
		And Selects Self for Accidental Death Product
		#And Selects product ADDI for Spouse
		And Selects Spouse for Accidental Death Product
		And Selects product DII for Self
		And Clicks on next button
		Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
		And Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
		And Selects Answer as No for all Group Disability Insurance for Self
    And Enters Monthly Income for Self as "<MonthlyIncome>"
		And Clicks on next button
		And Verify Error message is displayed for Important Replacement Information CheckBox is Mandatory			
		And Validate Imp Replacement Info text for NewYork state
	#	And Selects Yes for Do you have other life insurance in force
	#	And Enters Total Amount as "<TotalAmt>"
		And Confirms Imp Replacement Info for NewYork state
		And Clicks on next button
		Then Request Coverage page is displayed to user
		And Selects Type of Coverage as "<TypeOfCove_TermLife>" for Self under Term Life
		And Selects Type of Coverage as "<TypeOfCove_TermLife>" for Spouse under Term Life
		And Selects Benefit Amount for Self as "<Benefit>" under TermLife
		#And Validates under TermLife the Benefit Slider Range as 20000 to 1000000
		 And Validates under TermLife the Benefit Slider Range for Self as "<Min_TermLife>" to "<Max_TermLife>"
		And Selects Benefit Amount for Spouse as "<SBenefit>" under TermLife
		#And Validates under TermLife the Benefit Slider Range as 20000 to 1000000
		And Validates under TermLife the Benefit Slider Range for Spouse as "<Min_TermLife>" to "<Max_TermLife>"	
		And Selects Benefit Amount for Child as "<Cbenefit>" under TermLife
		#And Clicks on TenYTL field
		And Selects Type of Coverage as "<TypeOfCove_TenYTL>" for Self under TenYTL
		And Selects Type of Coverage as "<TypeOfCove_TenYTL>" for Spouse under TenYTL
		And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
		#And Validates under TenYTL the Benefit Slider Range as 100000 to 1000000
		 And Validates under TenYTL the Benefit Slider Range as "<Min_TenYTL>" to "<Max_TenYTL>" for self
		 And Selects Benefit Amount for Spouse as "<Sbenefit1>" under TenYTL
		#And Validates under TenYTL the Benefit Slider Range as 100000 to 1000000
		 And Validates under TenYTL the Benefit Slider Range as "<Min_TenYTL>" to "<Max_TenYTL>" for Spouse
		#And Clicks on type of coverage as New for Child
		#And Selects Benefit Amount for Child as "<Cbenefit1>" under TenYTL
		#And Clicks on ADDI field
		And Selects Type of Coverage as "<TypeOfCove_ADnD>" for Self under ADDI
		And Selects Type of Coverage as "<TypeOfCove_ADnD>" for Spouse under ADDI
		And Selects Type of Coverage as "<TypeOfCove_ADnD>" for Child under ADDI
		#Type of Coverage of Child is required for ADDI Product only for TIE.		
		#And Selects Benefit Amount for Self as "<Benefit2>" under ADDI
		And Selects Benefit Amount for Self as "<Benefit2>" under ADnD
		#And Validates under ADDI the Benefit Slider Range as 30000 to 300000
		And Validates under ADDI the Benefit Slider Range as "<Min_ADDI>" to "<Max_ADDI>"
		#And Selects Benefit Amount for Spouse as "<Sbenefit2>" under ADDI
		#And Validates under ADDI the Benefit Amount value as 12000
		#And Validates under ADDI the Benefit Amount value as 1500
		#And Selects Spouse benefit amount for Accidental Death as "<Sbenefit2>"
		#And Validates under ADnD the Benefit Slider Range as "<Min_ADDI_Spouse>" to "<Max_ADDI_Spouse>" for Spouse				
		#And Clicks on DII field
		And Selects Type of Coverage as "<TypeOfCove_DII>" for Self under DII		
		And Selects Monthly Benefit Amount for Self as "<Benefit3>" under DisabilityIncomeInsurance
		#And Validates under DII Monthly Benefit Slider Range as 200 to 5000
		And Validates under DisabilityIncomeInsurance the Benefit Slider Range as "<Min_DII>" to "<Max_DII>" for Self	
		And Selects Waiting Period for Self as "<WaitPeriod>" under DisabilityIncomeInsurance
		And Selects Benefit Option for Self as "<BenefitOption>" under DisabilityIncomeInsurance
		And Clicks on next button
		Then Beneficiary Page is displayed to user
		And Clicks on Add Beneficiary Button for Self under TermLife
		Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
		And User Enters Beneficiary details as "<Trust>","<DateTrust>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button for Spouse under TermLife
		Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
		And User Enters Beneficiary details as "<STrust>","<SDateTrust>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button for Self under TenYTL
		Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
		And User Enters Beneficiary details as "<Trust1>","<DateTrust1>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button for Spouse under TenYTL
		Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
		And User Enters Beneficiary details as "<STrust1>","<SDateTrust1>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button for Self under DII
		Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
		And User Enters Beneficiary details as "<Trust2>","<DateTrust2>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button for Spouse under DII
		Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
		And User Enters Beneficiary details as "<STrust2>","<SDateTrust2>"
		And Clicks on OK button
		And Clicks on next button
		Then Contact Details page is displayed to user
		#And Enters contact Details for Self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>","<PhoneType>","<PhoneNum>" 
		And Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"	
		And Selects No for Travel Question Non QD for Self
		And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
		And Selects Residential Radio Button
		And Selects Yes Radio Button for Business Address
    And Enters Business Address Details as "<BusinessName>","<BusinessType>"
		And Enters contact Details for Spouse without SSN as "<Sex1>","<Height1>","<Weight1>","<PhoneType1>","<PhoneNum1>" 		
		And Selects No for Travel Question-TwelveMonths for Spouse
		And Clicks on next button
		Then Application Summary Page is displayed to user
		And Verify Benefit Amount for Self as "<Benefit>" under TermLife
		And Verify Benefit Amount for Self as "<Benefit1>" under TenYTL
		And Verify Benefit Amount for Self as "<Benefit2>" under ADnD
		And Verify Benefit Amount for Self as "<Benefit3>" under DII
		And Verify Benefit Amount for Spouse as "<SBenefit>" under TermLife
		And Verify Benefit Amount for Spouse as "<Sbenefit1>" under TenYTL
		#And Verify Benefit Amount for Spouse as "<SBenefit2>" under ADDI
		And Verify Benefit Amount for Child as "<Cbenefit>" under TermLife
		And Verify Benefit Amount for child as "<Cbenefit1>" under TenYTL
		#And Verify Benefit Amount for Child as "<Cbenefit2>" under ADDI
		And Clicks on next button
		Then Authorize page details are displayed to user and confirm the term and conditions for Self
		Then Authorize page details are displayed to user and confirm the term and conditions for Spouse
		#And Validates ELECTRONIC CONSENT section
		#And Selects the Check box for Self
		#And Selects the Check box for Spouse
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
|Website|Association|Title|Fname|Lname|State      |DOB       |WorkHr|Stitle |Sfname|Slname|SDOB      |Cfname    |Clname  |CDOB     |Csex   |State1  |DOB1      |SDOB1     |MonthlyIncome|TotalAmt|TypeOfCove_TermLife|Benefit|Min_TermLife|Max_TermLife|SBenefit|Cbenefit|TypeOfCove_TenYTL|Benefit1|Sbenefit1|Min_TenYTL|Max_TenYTL|Min_ADDI|Max_ADDI|Cbenefit1|Min_ADDI_Spouse|Max_ADDI_Spouse|TypeOfCove_ADnD|Benefit2|Min_DII|Max_DII|TypeOfCove_DII|Benefit3|WaitPeriod|BenefitOption             |Trust    |DateTrust |STrust    |SDateTrust|Trust1    |DateTrust1|STrust1   |SDateTrust1|Trust2    |DateTrust2|STrust2   |SDateTrust2|SSN      |Mstatus |Height|Weight|Sex |Street    |City    |Zipcode  |PhoneType |PhoneNum  |BusinessName | BusinessType |SSN1     |Mstatus1|Height1|Weight1|Sex1|Street1    |City1    |Zipcode1  |PhoneType1|PhoneNum1 |
|Tie    |AAFCS      |Mr.  |John |Smith|Nova Scotia|01-01-1985|45    |Mr.    |SJohn |SSmith|12/20/1995|TestFname|TestLname|08/25/2000|Male  |New York|07-01-2012|05/20/2012|20000        |25000   |   New             |$20,000|  $20,000   | $1,000,000 |$20,000 |12000 |    New          |$100,000|$100,000 | $100,000 |$1,000,000|$30,000 |$300,000|10000    | $1,500        |  $12,000      |  New          |$30,000 |$200   |$5,000 |   New        |$200    | 30 Days  |Plan 5 (5 Years of Coverage)|TestJohn |02/25/2010|STestJohn |07/22/2011|TestJohn1 |03/25/2010|STestJohn1|07/16/2014 |TestJohn2 |07/16/2014|STestJohn2|08/30/2012 |123456789|Married |5.7   |140   |Male|StreetTest|CityTest|123456789|Mobile    |1234567890|Johnson      | Partnership  |123456780|Married |5.9    |150    |Male|SStreetTest|SCityTest|12345-6780|Mobile    |2234567890|
 
 
 
  @TIERegression_2
  Scenario Outline: <TIESC02> Application submission for Self, Spouse with TenYTL
    Given Test set up for "NYL" feature and "NYL_TIE" scenario
    Given Customer navigate to NYL "<Website>"
    When Select Association from Drop down value as "<Association>"
		When Clicks on Apply now button 
		Then Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>" 
		And select ArmedForce "<ArmedForce_NO>"
		Then Select NO for Association Membership
		#Hide-And Validate that NEXT button is Disabled
		Then Select YES Radio button of Membership
		And Click on Self  
		And Click on Spouse 
		And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
		And Select radio button NO for Spouse is Member
		And Clicks on next button
		#Hide-And Validate Age Restriction Message
		And Enters DOB for Self as "<DOB1>"
		And Clicks on next button
		#Hide-Then Validates that Spouse is not displayed for TermLife,TenYTL,ADDI,DII
		And Clicks on Back or Previous button
		And Enters DOB for Spouse as "<SDOB1>"
		And Clicks on next button	
		#And Verify Available Product List TermLife TenYTL
		#Hide-And Product page details are displayed to user and Verify Available Product List TermLife,TenYTL
		And Clicks on next button
		#And Verify Error Message is displayed
		And Validate Error Message on Product Page
		Then Selects product TenYTL for Self
		And Selects product TenYTL for Spouse
		And Clicks on next button
		Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
		And Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
		And Clicks on next button
		Then Request Coverage page is displayed to user
		And Selects Benefit Amount for Self as "<Benefit>" under TenYTL
		And Selects Type of Coverage as "<TypeOfCove_TenYTL>" for Self under TenYTL
		#And Validates under TenYTL the Benefit Slider Range as 100000 to 1000000
		And Validates under TenYTL the Benefit Slider Range as "<Min_TenYTL_Self>" to "<Max_TenYTL_Self>" for self		
		#And Selects Benefit Amount for Spouse as "<Sbenefit5>" under TenYTL
		And Selects Benefit Amount for Spouse as "<Sbenefit5>" under TenYTL
		And Selects Type of Coverage as "<TypeOfCove_TenYTL>" for Spouse under TenYTL
		And Clicks on next button
		And Verify Spouse amount validation on Coverage Page for TenYTL
		#And Selects Benefit Amount for Spouse as "<Sbenefit>" under TenYTL
		And Selects Benefit Amount for Spouse as "<Sbenefit>" under TenYTL
		#And Validates under TenYTL the Benefit Slider Range as 100000 to 2000000
		And Validates under TenYTL the Benefit Slider Range as "<Min_TenYTL_Spouse>" to "<Max_TenYTL_Spouse>" for Spouse
		And Clicks on next button
		Then Beneficiary Page is displayed to user
		And Clicks on Add Beneficiary Button for Self under TenYTL
		Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
		#And User Enters Beneficiary details as "<Bfname>","<Blname>","<BRelation>","<BPercen>"
		And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<BRelation>","<BPercen>"
		And Clicks on OK button
		And Clicks on next button
		And Validates error message for Beneficiaries Percentage share
		And Clicks on Add Beneficiary Button for Self under TenYTL
		Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
		#And User Enters Beneficiary details as "<Bfname2>","<Blname2>","<BRelation2>","<BPercen2>"
		And User Enters Beneficiary details as name and relationship"<Bfname2>","<Blname2>","<BRelation2>","<BPercen2>"
		And Clicks on OK button
		And Clicks on Back or Previous button
		And Clicks on next button
		Then Users delete the beneficiary details
		And Clicks on next button 
		And Validates error message for Beneficiaries Percentage share
		And Clicks on Add Beneficiary Button for Self under TenYTL
		Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
		#And User Enters Beneficiary details as "<Bfname2>","<Blname2>","<BRelation2>","<BPercen2>"
		And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<BRelation>","<BPercen>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button for Spouse under TenYTL
		Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
		#And User Enters Beneficiary details as "<Bfname3>","<Blname3>","<BRelation3>","<BPercen3>"
		And User Enters Beneficiary details as name and relationship"<Bfname3>","<Blname3>","<BRelation3>","<BPercen3>"
		And Clicks on OK button
		And Clicks on next button
		#Then Contact Details page is displayed to user and validate details
		Then Contact Details page is displayed to user
		#And Enters contact Details for Self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<MembershipID>","<Street>","<City>","<Zipcode>","<PhoneType>","<PhoneNum>" 
	  Then Contact Details page is displayed to user and Enter contact details for Self as "<SSN>","<Mstatus>","<Height>","<Sex>","<Weight>"
    And Enter Residential Address and Preferred Contact details for Self as "<Street>","<City>","<Zipcode>","<PhoneType>","<PhoneNum>"
	  #And Additional questions are answered as No
	  And Selects No for Travel Question Non QD for Self
		And Selects Residential Radio Button
		#And Enters contact Details for Female Spouse as "<SSSN>","<SHeight>" ,"<SWeight>","<SSex>","<SPhoneType>","<SPhoneNum>"
		And Enters contact Details for Spouse without SSN as "<Sex1>","<Height1>","<Weight1>","<PhoneType1>","<PhoneNum1>" 
		#And Answer all other questions as No
		And Selects No for Travel Question-TwelveMonths for Spouse
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
|Website|Association|Title|Fname|Lname|State   |DOB       |WorkHr|Stitle|Sfname|Smname |Slname|SDOB      |SWorkHr|Cfname   |Clname   |CDOB      |Csex|Benefit|TypeOfCove_TermLife|Min_TermLife|Max_TermLife|SBenefit|Cbenefit|Benefit2|Min_ADDI|Max_ADDI|STrust   |SDateTrust|STrust2   |SDateTrust2|SSN      |Mstatus|Height|Weight|Sex |Street    |City       |Zipcode|PhoneType |PhoneNum  |SSN1     |Mstatus1|Height1|Weight1|Sex1|Street1    |City1    |Zipcode1  |PhoneType1|PhoneNum1 |
|Tie    |AAFCS      |Mr.  |John |Smith|Delaware|01-01-1985|45    |Mr.   |SJohn |SMiddle|SSmith|12/20/1995|43     |TestFname|TestLname|08/25/2005|Male|20000  |New                |  $20,000   | $1,000,000 |$20,000 |$12,000 |$30,000 | $30,000|$300,000|STestJohn|07/22/2011|STestJohn2|08/30/2012 |123456789|Married|5.7   |140   |Male|StreetTest|CityTest   |16789  |Mobile    |1234567890|123456780|Married |5.9    |150    |Male|SStreetTest|SCityTest|12345-6780|Mobile    |2234567890|


@TIERegression_3
  Scenario Outline: <TIESC03> Application submission for Spouse and Child with TIL and ADDI products and Beneficiarie
    Given Test set up for "NYL" feature and "NYL_TIE" scenario
    Given Customer navigate to NYL "<Website>"
    When Select Association from Drop down value as "<Association>"
		When Clicks on Apply now button 
		Then Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"   
		Then Select YES Radio button of Membership
		And Click on Spouse  
		And Click on Child   
		And select ArmedForce "<Armedforces>"
		And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
		And Select radio button Yes for Spouse is Member
		And Click on Add Child button
		Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>" 
		And Selects Married question as No
		And Selects No for full time student for Child
		And Click on Add Child button on Screen
		And Clicks on next button
		Then Verify that Product page are displayed to user
		And Selects product TermLife for Spouse
		And Selects product TermLife for Child
		And Selects Spouse for Accidental Death Product
		And Selects Child for Accidental Death Product
		And Clicks on next button
		Then Click on Yes on Dependent CoverageWindow
		And Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
		And Clicks on next button
		And Selects Benefit Amount for Spouse as "<SBenefit>" under TermLife
		And Selects Type of Coverage as "<TypeOfCove_TermLife>" for Spouse under Term Life
		And Validates under TermLife the Benefit Slider Range for Spouse as "<Min_TermLife>" to "<Max_TermLife>"	
		And Selects Benefit Amount for Child as "<Cbenefit>" under TermLife		
		And Selects Benefit Amount for Self as "<Benefit2>" under ADDI
		And Validates under ADDI the Benefit Slider Range as "<Min_ADDI>" to "<Max_ADDI>"
		And Selects Type of Coverage as "<TypeOfCove_ADnD>" for Spouse under ADDI	
		And Selects Type of Coverage as "<TypeOfCove_ADnD>" for Child under ADDI	
		#And Validates under ADDI the Benefit Amount value as 12000 for Spouse
		And Validates Benefit Amount value for Spouse under ADDI as "<Sbenefit_ADDI>"
		#And Validates under ADDI the Benefit Amount value as 1500 for Child	
		And Validates Benefit Amount value for Child under ADDI as "<Cbenefit_ADDI>"		
		And Clicks on next button
		Then Beneficiary Page is displayed to user
		And Clicks on Add Beneficiary Button for Spouse under TermLife
		Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
		And User Enters Beneficiary details as "<STrust>","<SDateTrust>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button for Spouse under ADDI		
		Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
		And User Enters Beneficiary details as "<STrust2>","<SDateTrust2>"
		And Clicks on OK button
		And Clicks on next button
		#And Enters contact Details for Self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>","<PhoneType>","<PhoneNum>" 
		Then Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<Sex>","<Street>","<City>","<Zipcode>"
   	And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page		
		And Selects Residential Radio Button
		#And Enters contact Details for Spouse as "<SSN1>","<Mstatus1>","<Height1>","<Weight1>","<Sex1>","<Street1>","<City1>","<Zipcode1>","<PhoneType1>","<PhoneNum1>" 
		And Enters contact Details for Spouse without SSN as "<Sex1>","<Height1>","<Weight1>","<PhoneType1>","<PhoneNum1>" 	
		And Selects No for Travel Question-TwelveMonths for Spouse
		And Clicks on next button
		Then Application Summary Page is displayed to user
		And Verify Benefit Amount for Spouse as "<SBenefit>" under TermLife
		And Verify Benefit Amount for Child as "<Cbenefit>" under TermLife
		And Verify Benefit Amount for Spouse as "<Sbenefit_ADDI>" under ADDI			
		And Verify Benefit Amount for Child as "<Cbenefit_ADDI>" under ADDI
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
|Website|Association|Title|Fname|Lname|State   |DOB       |WorkHr|Stitle|Sfname|Smname |Slname|SDOB      |SWorkHr|Cfname   |Clname   |CDOB      |Csex|Benefit|TypeOfCove_TermLife|Min_TermLife|Max_TermLife|SBenefit|Cbenefit|Benefit2|TypeOfCove_ADnD|Min_ADDI|Max_ADDI|Sbenefit_ADDI|Cbenefit_ADDI|STrust   |SDateTrust|STrust2   |SDateTrust2|SSN      |Mstatus|Height|Weight|Sex |Street    |City       |Zipcode|PhoneType |PhoneNum  |SSN1     |Mstatus1|Height1|Weight1|Sex1|Street1    |City1    |Zipcode1  |PhoneType1|PhoneNum1 |
|Tie    |AAFCS      |Mr.  |John |Smith|Delaware|01-01-1985|45    |Mr.   |SJohn |SMiddle|SSmith|12/20/1995|43     |TestFname|TestLname|08/25/2005|Male|20000  |New                |  $20,000   | $1,000,000 |$20,000 |$12,000 |$30,000 | New           |$30,000 |$300,000| $12,000     |   $1,500    |STestJohn|07/22/2011|STestJohn2|08/30/2012 |123456789|Married|5.7   |140   |Male|StreetTest|CityTest   |16789  |Mobile    |1234567890|123456780|Married |5.9    |150    |Male|SStreetTest|SCityTest|12345-6780|Mobile    |2234567890|
	
	
	@TIERegression_4
  Scenario Outline: <TIESC04> Application Submission for Self with All Products
    Given Test set up for "NYL" feature and "NYL_TIE" scenario
    Given Customer navigate to NYL "<Website>"
    When Select Association from Drop down value as "<Association>"
		When Clicks on Apply now button	
		Then Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>" 
		Then Select YES Radio button of Membership
		And Click on Self  
		And select ArmedForce "<Armedforces>"
		And Clicks on next button
		#And Verify Available Product List TermLife TenYTL ADDI DI
		And Product page details are displayed to user and Verify Available Product List TermLife,TenYTL,ADD,DII
		Then Selects product TermLife for Self
		And Selects product TenYTL for Self
		And Selects Self for Accidental Death Product
		And Selects product DII for Self
		And Clicks on next button
		Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
		And Verify New York State paragraph is displayed for Self
		And Enters Monthly Income for Self as "<MonthlyIncome>"
		And Clicks on next button
		Then Request Coverage page is displayed to user
		And Selects Benefit Amount for Self as "<Benefit>" under TermLife
		#And Validates under TermLife the Benefit Slider Range as 20000 to 1000000
		And Validates under TermLife the Benefit Slider Range for Self as "<Min_TermLife>" to "<Max_TermLife>"
		And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
		#And Validates under TenYTL the Benefit Slider Range as 100000 to 1000000
		And Validates under TenYTL the Benefit Slider Range as "<Min_TenYTL>" to "<Max_TenYTL>" for self
		And Selects Benefit Amount for Self as "<Benefit2>" under ADDI
		#And Validates under ADDI the Benefit Slider Range as 30000 to 300000
		And Validates under ADDI the Benefit Slider Range as "<Min_ADDI>" to "<Max_ADDI>"
		And Selects Monthly Benefit Amount for Self as "<Benefit3>" under DisabilityIncomeInsurance
		#And Validates under DII Monthly Benefit Slider Range as 200 to 5000
		And Validates under DisabilityIncomeInsurance the Benefit Slider Range as "<Min_DII>" to "<Max_DII>" for Self
		#And Selects Wait Period for Self as "<WaitPeriod>" under DII
		And Selects Waiting Period for Self as "<WaitPeriod>" under DisabilityIncomeInsurance	
		And Selects Benefit Option for Self as "<BenefitOption>" under DII
		And Clicks on next button
		Then Beneficiary Page is displayed to user
		And Clicks on Add Beneficiary Button for Self under TermLife
		Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
		And User Enters Beneficiary details as "<Trust>","<DateTrust>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button for Self under TenYTL
		Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
		And User Enters Beneficiary details as "<Trust1>","<DateTrust1>"
		And Clicks on OK button
		#And Clicks on Add Beneficiary Button Under ADDI for Self
		And Clicks on Add Beneficiary Button under ADnD for Self
		Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
		And User Enters Beneficiary details as "<Trust2>","<DateTrust2>"
		And Clicks on OK button
		And Clicks on next button
		#And Enters contact Details for Self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<MemId>","<Street>","<City>","<Zipcode>","<PhoneType>","<PhoneNum>" 
		And Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"		
		And Selects Residential Radio Button
		And Selects No for Travel Question Non QD for Self
		And Selects Yes Radio Button for Business Address
		And Enters Business Address Details as "<BusinessName>","<BusinessType>"
		And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
		And Clicks on next button
		Then Application Summary Page is displayed to user
		And Verify Benefit Amount for Self as "<Benefit>" under TermLife
		And Verify Benefit Amount for Self as "<Benefit1>" under TenYTL
		#And Verify Benefit Amount for Self as "<Benefit2>" under ADDI
		And Verify Benefit Amount for Self as "<Benefit2>" under ADnD
		And Verify Benefit Amount for Self as "<Benefit3>" under DII
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
|Website|Association|Title|Fname|Lname|State               |DOB       |WorkHr|MonthlyIncome|Benefit|Benefit1|Benefit2|Benefit3|WaitPeriod|BenefitOption|Trust   |Datetrust |Trust1   |Datetrust1|Trust2   |Datetrust2|SSN      |Mstatus|Height|Weight|Sex |MemId|Street    |City    |Zipcode|PhoneType|PhoneNum  |BusinessName|BusinessType|
|Tie    |AAFCS      |Mr.  |John |Smith|District of Columbia|01-01-1992|45    |20000        |260000 |250000  |90000   |1400    |90        |Plan 5       |TestJohn|02/25/2010|TestJohn1|04/25/2010|TestJohn2|07/16/2014|123456789|Married|5.7   |140   |Male|5    |StreetTest|CityTest|12345  |Mobile   |1234567890|TestBusiness|Corporation |
	
	
	@TIERegression_5
  Scenario Outline: <TIESC05> Application Submission for Self with All Products
    Given Test set up for "NYL" feature and "NYL_TIE" scenario
    Given Customer navigate to NYL "<Website>"
    When Select Association from Drop down value as "<Association>"
		When Clicks on Apply now button
		#Then Eligibility page details are displayed to user and selects YES Radio button of Membership and enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
		Then Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>" 
		Then Select YES Radio button of Membership
		And Click on Spouse  
		And select ArmedForce "<Armedforces>"
		#And Enters Spouse details for MALE Spouse as  "<Stitle>","<Sfname>","<Slname>","<SDOB>"
		And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
		And Select radio button Yes for Spouse is Member
		And Clicks on next button
		And Verify that error message is displayed for state eligibility at top of the page
		And Enter New State as "<State1>"
		And Clicks on next button
		Then Verify that Product page are displayed to user
		 And Clicks on Back or Previous button
		And Enters DOB for Self as "<DOB1>"
		And Enters DOB for Spouse as "<SDOB1>"
		And Clicks on next button
		And Validate Age Restriction Message
		And Enters DOB for Self as "<DOB>"
		And Enters DOB for Spouse as "<SDOB>"
		And Clicks on next button
		#Then Product page details are displayed to user and Validates that Member and Child are not displayed
		Then Validates that Self is not displayed for TermLife,TenYTL,ADDI
    Then Validates that Child is not displayed for TermLife,TenYTL,ADDI
		And Product page details are displayed to user and Verify Available Product List TermLife,TenYTL,ADD
		And Clicks on next button
		And Validate Error Message on Product Page
		And Selects product TermLife for Spouse
		And Selects product TenYTL for Spouse
		And Selects Spouse for Accidental Death Product
		And Clicks on next button
		Then Click on Yes on Dependent CoverageWindow
		#Then Product: Additional Questions page details are displayed to user and selects Answer as No for all
		Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
		And Clicks on next button
		Then Request Coverage page is displayed to user 
		And Selects Benefit Amount for Spouse as "<SBenefit>" under TermLife
		#And Clicks type of coverage as New for Spouse
		And Selects Type of Coverage as "<TypeOfCoverage>" for Spouse under Term Life
		And Selects Benefit Amount for Spouse as "<SBenefit1>" under TenYTL
		#And Clicks on type of coverage as New for Spouse
		And Selects Type of Coverage as "<TypeOfCoverage>" for Spouse under TenYTL
		And Selects Benefit Amount for Self as "<Benefit2>" under ADDI
		#And Validates Benefit Amount for Spouse as "<SBenefit2>" under ADDI
		And Validates Benefit Amount value for Spouse under ADDI as "<SBenefit2>"
		#And Clicks on type of coverage as New for Spouse
		And Selects Type of Coverage as "<TypeOfCoverage>" for Spouse under ADDI
		And Clicks on next button
		Then Beneficiary Page is displayed to user
		And Clicks on Add Beneficiary Button for Spouse under TermLife
		Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
		And User Enters Beneficiary details as "<STrust>","<SDateTrust>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button for Spouse under TenYTL
		Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
		And User Enters Beneficiary details as "<STrust1>","<SDateTrust1>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button for Spouse under DII
		Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
		And User Enters Beneficiary details as "<STrust2>","<SDateTrust2>"
		And Clicks on OK button
		And Clicks on next button
		#Then Contact Details page is displayed to user and validate details
		#And Enters contact Details for Self as "<SSN>","<Mstatus>","<Sex>","<Street>","<City>","<Zipcode>","<PhoneType>","<PhoneNum>" 
		Then Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<Sex>","<Street>","<City>","<Zipcode>"
		And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
		And Selects Residential Radio Button
		#And Enters contact Details for Spouse as "<SSSN>","<SHeight>" ,"<SWeight>","<SSex>","<SPhoneType>","<SPhoneNum>"
		And Enters contact Details for Spouse without SSN as "<SSex>","<SHeight>","<SWeight>","<SPhoneType>","<SPhoneNum>"
		#And Selects No Radio button for Travel Question Non QD for Spouse
		And Selects No for Travel Question-TwelveMonths for Spouse
		#And Additional questions are answered as No
		And Clicks on next button
		Then Application Summary Page is displayed to user
		And Verify Benefit Amount for Spouse as "<SBenefit>" under TermLife
		And Verify Benefit Amount for Spouse as "<SBenefit1>" under TenYTL
		And Verify Benefit Amount for Spouse as "<SBenefit2>" under ADDI
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
|Website|Association|Title|Fname|Lname|State      |DOB       |WorkHr|Armedforces|Stitle|Sfname|Slname|SDOB      |State1   |DOB1      |SDOB1     |TypeOfCoverage|SBenefit|SBenefit1|Benefit2|SBenefit2|STrust                   |SDateTrust|STrust1                     |SDateTrust1|STrust2           |SDateTrust2|SSN        |Mstatus|Sex |Street           |City  |Zipcode|PhoneType|PhoneNum   |   SSSN    |SHeight|SWeight|SSex  |SPhoneType|SPhoneNum  | 
|Tie    |AAFCS      |Mr.  |John |Smith|Nova Scotia|01-01-1992|45    |    No     |Mrs.  |Mary  |Smith |12/20/1995|Minnesota|07-01-2012|05/20/2012|New           |260000  |250000   |90000   |36000    |American India Foundation|02/25/2010|American Indian College Fund|07/22/2011 |American Red Cross|03/25/2010 |107-28-2854|Married|Male|#Block No 06 L-64|Carmel|10512  |Mobile   |07974123456|124-58-2452|5.9    |150    |Female|Mobile    |07774123456|  
	
	
	
	@TIERegression_6
  Scenario Outline: <TIESC06> Application Submission for Child with All Products
    Given Test set up for "NYL" feature and "NYL_TIE" scenario
    Given Customer navigate to NYL "<Website>"
    When Select Association from Drop down value as "<Association>"
		When Clicks on Apply now button	
		#Then Eligibility page details are displayed to user and selects YES Radio button of Membership and enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>"
		Then Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>" 
		Then Select YES Radio button of Membership	
		And select ArmedForce "<Armedforces>"	
		And Click on Child   		
		And Click on Add Child button
		#Then Add Child Screen is displayed to User and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
		Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>" 
		And Selects Married question as No
		And Selects No for full time student for Child
		And Click on Add Child button on Screen
		And Click on Add Child button
		Then Add Child Screen is displayed and Enters Child details as "<Cfname1>","<Clname1>","<CDOB1>","<Csex1>"
		And Selects Married question as No
		And Selects Yes for full time student for Child
		And Click on Add Child button on Screen
		And Click on Add Child button
		Then Add Child Screen is displayed and Enters Child details as "<Cfname2>","<Clname2>","<CDOB2>","<Csex2>"
		And Selects Married question as No
		And Selects No for full time student for Child
		And Click on Add Child button on Screen
		And Click on Add Child button 
		Then Add Child Screen is displayed and Enters Child details as "<Cfname3>","<Clname3>","<CDOB3>","<Csex3>"
		And Selects Married question as Yes for Child
		And Selects No for full time student for Child
		And Click on Add Child button on Screen
		And Click on Add Child button
		Then Add Child Screen is displayed and Enters Child details as "<Cfname4>","<Clname4>","<CDOB4>","<Csex4>"
		And Selects Married question as Yes for Child
		And Selects Yes for full time student for Child
		And Click on Add Child button on Screen
		And Click on Add Child button 
		Then Add Child Screen is displayed and Enters Child details as "<Cfname5>","<Clname5>","<CDOB5>","<Csex5>"
		And Selects Married question as No
		And Selects No for full time student for Child
		And Click on Add Child button on Screen
		And Click on Add Child button
		Then Add Child Screen is displayed and Enters Child details as "<Cfname6>","<Clname6>","<CDOB6>","<Csex6>"
		And Selects Married question as No
		And Selects No for full time student for Child
		And Click on Add Child button on Screen
		And Click on Add Child button 
		Then Add Child Screen is displayed and Enters Child details as "<Cfname7>","<Clname7>","<CDOB7>","<Csex7>"
		And Selects Married question as No
		And Selects No for full time student for Child
		And Click on Add Child button on Screen
		#Hide-And Validates Add Child Button on Eligibility page is not present
		#[NOTE:- Maximum Child ADDITION SCENARIO VERIFIED.]
		And Clicks on next button
		#Hide-Then Verify that Product page are displayed to user
		#Hide-And Product page details are displayed to user and Verify Available Product List TermLife,TenYTL,ADD
		And Selects product TermLife for Child
		And Selects product TenYTL for Child
		And Selects Child for Accidental Death Product
		And Clicks on next button
		And Click on Yes on Dependent CoverageWindow
		Then Request Coverage page is displayed to user 
		And Selects Benefit Amount for Child as "<Cbenefit>" under TermLife
		#And Verify that Eligible Child Names as John, Rosey, Henry and Heena
		#Hide-And Verify that Eligible Child Names under TermLife as "<ChildName1>","<ChildName2>","<ChildName3>","<ChildName7>"
		#And Validates under TermLife the Benefit Amounts Listed are: 3000,6000,9000,12000
		#Hide-And Validates under Term Life the Benefit Amounts for Child Listed are: "<Cbenefit1_TLI>","<Cbenefit2_TLI>","<Cbenefit3_TLI>","<Cbenefit4_TLI>"
		#And Clicks on TenYTL field
		And Selects Benefit Amount for Child as "<Cbenefit1>" under TenYTL
		#And Clicks on ADDI field
		And Selects Benefit Amount for Self as "<Benefit2>" under ADDI
		#And Validates min and max values of ADDI for Self as "<MinADD>", "<MaxADD>"
		#Hide-And Validates under ADDI the Benefit Slider Range as "<MinADD>" to "<MaxADD>"
		#And Clicks on type of coverage as New for Child
		And Selects Type of Coverage as "<TypeOfCove_ADnD>" for Child under ADDI
		#Hide-And Validates Benefit Amount value for Child under ADDI as "<Cbenefit2>"
		And Clicks on next button
		#Then Contact Details page is displayed to user and enters contact Details for Male Self as "<SSN>", "<Mstatus>","<Mehmed >","<Street>","<City>","<Zip code>", "<MobPh>" 
		Then Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<Sex>","<Street>","<City>","<Zipcode>"
		And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page	
		And Selects Residential Radio Button
		And Clicks on next button
		#Hide-Then Application Summary Page is displayed to user
		#Hide-And Verify Child name as "<Cfname>","<Clname>"
		#And Validates Child 3,4,5,6  are not displayed in eligible children		
		#And Verify Benefit Amount for Child as "<Cbenefit>" under TermLife
		And Verify Benefit Amount for child "<ChildName1>","<TermLife_SequenceNo>" as "<Cbenefit>" under TermLife
		And Verify Benefit Amount for child "<ChildName2>","<TermLife_SequenceNo>" as "<Cbenefit>" under TermLife
		And Verify Benefit Amount for child "<ChildName3>","<TermLife_SequenceNo>" as "<Cbenefit>" under TermLife
		And Verify Benefit Amount for child "<ChildName7>","<TermLife_SequenceNo>" as "<Cbenefit>" under TermLife		
		#And Verify Benefit Amount for Child as "<Cbenefit1>" under TenYTL
		And Verify Benefit Amount for child "<ChildName1>","<TenYTL_SequenceNo>" as "<Cbenefit1>" under TenYTL
		And Verify Benefit Amount for child "<ChildName2>","<TenYTL_SequenceNo>" as "<Cbenefit1>" under TenYTL
		And Verify Benefit Amount for child "<ChildName3>","<TenYTL_SequenceNo>" as "<Cbenefit1>" under TenYTL
		And Verify Benefit Amount for child "<ChildName7>","<TenYTL_SequenceNo>" as "<Cbenefit1>" under TenYTL
		#And Verify Benefit Amount for Child as "<Cbenefit2>" under ADDI
		And Verify Benefit Amount for child "<ChildName1>","<ADDI_SequenceNo>" as "<Cbenefit2>" under ADDI
		And Verify Benefit Amount for child "<ChildName2>","<ADDI_SequenceNo>" as "<Cbenefit2>" under ADDI
		And Verify Benefit Amount for child "<ChildName3>","<ADDI_SequenceNo>" as "<Cbenefit2>" under ADDI
		And Verify Benefit Amount for child "<ChildName7>","<ADDI_SequenceNo>" as "<Cbenefit2>" under ADDI
		And Clicks on next button
		Then Authorize page details are displayed to user and confirm the term and conditions for Self 
		#And Validates Height and Weight is not displayed for Child
		And Clicks on next button
		Then Review and sign page details are displayed to user and Click on continue and attached the sign
		And Clicks on next button to finish
		Then Thank you page is displayed to user
		And Verify that Confirmation number is generated for "<Website>"

	
Examples:  
|Website|Association|Title|Fname|Lname|State   |DOB       |WorkHr|Armedforces|Cfname| Clname |CDOB                |CSex|Cfname1|Clname1|CDOB1              |CSex1 |Cfname2|Clname2|CDOB2             |CSex2|Cfname3|Clname3|CDOB3               |CSex3|Cfname4|Clname4|CDOB4              |CSex4|Cfname5 |Clname5|CDOB5               |CSex5|Cfname6|Clname6|CDOB6              |CSex6|Cfname7|Clname7|CDOB7             |CSex7 |Cbenefit|Cbenefit1_TLI|Cbenefit2_TLI|Cbenefit3_TLI|Cbenefit4_TLI|Cbenefit1|Benefit2|MinADD  |MaxADD  |TypeOfCove_ADnD|Cbenefit2|ChildName1|ChildName2|ChildName3|ChildName7|TermLife_SequenceNo|TenYTL_SequenceNo|ADDI_SequenceNo|SSN      |Mstatus|Sex  |Street                 |City  |Zipcode|PhoneType|PhoneNum   |
|Tie    |AAFCS      |Mr.  |John |Smith|Missouri|01-01-1985|45    |No         |John  | David  | SYSDATE-0Y/11M/29D |Male|Rosey  |David  |SYSDATE-22Y/11M/29D|Female|Henry  |David  |SYSDATE-9Y/11M/29D| Male|Simon  |David  |SYSDATE-18Y/11M/29D |Male |Bravo  |David  |SYSDATE-24Y/11M/29D|Male |Kevin   |David  |SYSDATE-24Y/11M/29D | Male|Andrew |David  |SYSDATE-22Y/11M/29D| Male|Heena  |David  |SYSDATE-1Y/00M/00D|Female|    6000| 3000        | 6000        |  9000       | 12000       |$10,000  |$30,000 |$30,000 |$300,000| New           | $1,500  |  John    |  Rosey   |  Henry   | Heena    | 1                 |     2           |  3            |271536241|Married|Male |# Main Street, 19 Lane |Camrel|12456  |Mobile   |1234567890|


	@TIERegression_7
  Scenario Outline: <TIESC07> Application Submission for Self & Child with All Products
    Given Test set up for "NYL" feature and "NYL_TIE" scenario
    Given Customer navigate to NYL "<Website>"
    When Select Association from Drop down value as "<Association>"
		When Clicks on Apply now button	
		Then Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>" 
		Then Select YES Radio button of Membership	
		And select ArmedForce "<Armedforces>"			
		And Click on Self
		And Click on Child   	
		And Click on Add Child button
		Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>" 
		And Selects Married question as No
		And Selects No for full time student for Child
		And Click on Add Child button on Screen				
		And Clicks on next button
		#Hide-And Verify that error message is displayed for state eligibility at top of the page
		And Enter New State as "<State1>"
		And Clicks on next button
		#Then Product page details are displayed to user and Validates that Member and Spouse are not displayed
		#Hide-Then Validates that Self is not displayed for TermLife,TenYTL,ADDI,DII
    #Hide-Then Validates that Spouse is not displayed for TermLife,TenYTL,ADDI,DII
		And Clicks on Back or Previous button
		And Enters DOB for Self as "<DOB1>"
		#[*Note: Here we verified the min age for the Self.]
		And Clicks on next button
		#Then Product page details are displayed to user and Validates that Member and Spouse are not displayed
		#Hide-Then Validates that Self is not displayed for TermLife,TenYTL,ADDI,DII
    #Hide-Then Validates that Spouse is not displayed for TermLife,TenYTL,ADDI,DII
		And Clicks on Back or Previous button
		#[*Note: Here we verified the Max age for the Self.]
		And Enters DOB for Self as "<DOB2>"
		And Clicks on next button
		And Selects product TermLife for Self
		And Selects product TermLife for Child
		And Selects product TenYTL for Self
		And Selects product TenYTL for Child
		And Selects Self for Accidental Death Product
		And Selects Child for Accidental Death Product
		And Selects product DII for Self
		And Clicks on next button
		Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
		#And Confirms Imp Replacement Info for New York State	
		And Confirms Imp Replacement Info for NewYork state
		And Validate Imp Replacement Info text for NewYork state
		And Enters Monthly Income for Self as "<MonthlyIncome>"
		And Selects Answer as No for Applying any Other Insurance
		And Selects Answer as No for all Group Disability Insurance for Self
		And Clicks on next button
		#Then Request Coverage page is displayed to user and Selects Benefit Amount for Self as "<Benefit>" under Term Life Insurance	
		And Selects Type of Coverage as "<TypeOfCove_TermLife>" for Self under Term Life
		And Selects Benefit Amount for Self as "<Benefit>" under TermLife
		#And Selects Benefit Amount for Child as "<Cbenefit>" under Term Life Insurance
		And Selects Benefit Amount for Child as "<Cbenefit>" under TermLife
		#And Clicks on TenYTL field
		And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
		#And Clicks on type of coverage as New for Child
		And Selects Type of Coverage as "<TypeOfCove_TenYTL>" for Self under TenYTL
		And Selects Benefit Amount for Child as "<Cbenefit1>" under TenYTL
		And Selects Benefit Amount for Self as "<Benefit2>" under ADDI
		#And Validates under ADDI the CBenefit2 Amount value as 1500
		And Validates Benefit Amount value for Child under ADDI as "<CBenefit2>"	
		#And Clicks on type of coverage as New for Self
		#And Clicks on type of coverage as New for Child
		And Selects Type of Coverage as "<TypeOfCove_ADnD>" for Self under ADDI
		And Selects Type of Coverage as "<TypeOfCove_ADnD>" for Child under ADDI
		And Selects Type of Coverage as "<TypeOfCove_DII>" for Self under DII
		#And Selects Benefit Amount for Self as "<Benefit3>" under DII
		And Selects Monthly Benefit Amount for Self as "<Benefit3>" under DisabilityIncomeInsurance
		#And Selects Wait Period for Self as "<WaitPeriod>" under DII
		And Selects Waiting Period for Self as "<WaitPeriod>" under DisabilityIncomeInsurance
		And Selects Benefit Option for Self as "<BenOpt>" under DII
		And Clicks on next button
		Then Beneficiary Page is displayed to user
		And Clicks on Add Beneficiary Button for Self under TermLife
		Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
		And User Enters Beneficiary details as "<Trust>","<DateTrust>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button for Self under TenYTL
		Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
		And User Enters Beneficiary details as "<Trust1>","<DateTrust1>"
		And Clicks on OK button
		And Clicks on Add Beneficiary Button under ADnD for Self
		Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
		And User Enters Beneficiary details as "<Trust2>","<DateTrust2>"
		And Clicks on OK button
		And Clicks on next button
		#Then Contact Details page is displayed to user and validate details
		#And Enters contact Details for Self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<MemId>","<Street>","<City>","<Zipcode>","<PhoneType>","<PhoneNum>" 
		#And Validates Height and Weight is displayed for Self
		#And Additional questions are answered as No
		And Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"	
		And Selects No for Travel Question Non QD for Self
		And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
		And Selects Residential Radio Button
		And Selects Yes Radio Button for Business Address
    And Enters Business Address Details as "<BusinessName>","<BusinessType>"
		And Clicks on next button
		Then Application Summary Page is displayed to user
		#And Verify Benefit Amount for Self as "<Benefit>" under Term Life Insurance
		And Verify Benefit Amount for Self as "<Benefit>" under TermLife
		And Verify Benefit Amount for Self as "<Benefit1>" under TenYTL
		#And Verify Benefit Amount for Self as "<Benefit2>" under ADDI
		And Verify Benefit Amount for Self as "<Benefit2>" under ADnD
		And Verify Benefit Amount for Self as "<Benefit3>" under DII
		#And Verify Benefit Amount for Child as "<Cbenefit>" under Term Life Insurance
		And Verify Benefit Amount for Child as "<Cbenefit>" under TermLife
		#And Verify Benefit Amount for Child as "<Cbenefit1>" under TenYTL
		And Verify Benefit Amount for child as "<Cbenefit1>" under TenYTL
		And Verify Benefit Amount for Child as "<Cbenefit2>" under ADDI
		And Clicks on next button
		Then Authorize page details are displayed to user and confirm the term and conditions for Self 
		And Clicks on next button
		Then Review and sign page details are displayed to user and Click on continue and attached the sign
		And Clicks on next button to finish
		Then Your Insurance Request Decision Page is displayed to user
		And Clicks on next button
		Then Thank you page is displayed to user
		And Verify that Confirmation number is generated for "<Website>"

		
Examples: 
|Website|Association|Title|Fname|Lname|State  |DOB       |WorkHr|Armedforces|Cfname|Clname  |CDOB      |Csex|State1  |DOB1      |DOB2      |MonthlyIncome|Benefit|Cbenefit|Benefit1|Cbenefit1|Benefit2|Cbenefit2|Benefit3|WaitPeriod|BenOpt|Trust                    |Datetrust |Trust1                      |Datetrust1|Trust2            |Datetrust2|SSN      |Mstatus|Height|Weight|Sex |MemId|Street       |City  |Zipcode|PhoneType|PhoneNum  |
|Tie    |AAFCS      |Mr.  |John |Smith|Ontaria|12/26/1940|45    |No         |Alex  |Brigenja|08-25-2000|Male|New York|07-01-2012|07-28-2000|25000        |20000  |12000   |100000  |10000    |30000   |1500     |200     |30        |5     |American India Foundation|02/25/2010|American Indian College Fund|07/22/2011|American Red Cross|03/25/2010|567890987|Married|5.7   |185   |Male|5    |# Main Street|Camrel|65017  |Mobile   |0683928543|
	
	@TIERegression_8
  Scenario Outline: <TIESC08> Validation Read & Sign Page with 20 different States one by one in loop
    Given Test set up for "NYL" feature and "NYL_TIE" scenario
    Given Customer navigate to NYL "<Website>"
    When Select Association from Drop down value as "<Association>"
		When Clicks on Apply now button		
		Then Enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>", "<WorkHr>" 
		Then Select YES Radio button of Membership	
		And select ArmedForce "<Armedforces>"		
		And Click on Self  			
  	And Clicks on next button
		#And Verify Available Product List TermLife TenYTL
		And Product page details are displayed to user and Verify Available Product List TermLife,TenYTL
		And Selects product TermLife for Self
		And Selects product TenYTL for Self
		And Clicks on next button
		Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
		And Clicks on next button
		And Selects Type of Coverage as "<TypeOfCove>" for Self under Term Life
		And Selects Benefit Amount for Self as "<Benefit>" under TermLife
		And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
		And Selects Type of Coverage as "<TypeOfCove>" for Self under TenYTL
		And Clicks on next button
		Then Beneficiary Page is displayed to user
		#And Clicks on Skip Beneficiary(ies) button
		And Clicks on Skip Beneficiary Button
		#Then Contact Details page is displayed to user and validate details
		#And Enters contact Details for Self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<MemId>","<Street>","<City>","<Zipcode>","<PhoneType>","<PhoneNum>" 
		#And Additional questions are answered as No
		#And Selects Residential Radio Button
		#And Selects intend to reside outside the U.S. or Canada in the next 12 months Radio Button as No		
		And Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"	
		And Selects No for Travel Question Non QD for Self
		And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
		And Selects Residential Radio Button
		And Selects No for Travel Question Non QD for Self					
		And Clicks on next button
		Then Application Summary Page is displayed to user
		And Clicks on next button
		Then Authorize page details are displayed to user
    Then Validates I Understand verbiage one in Read and Sign Box
    And Validate Authorization message in Read and Sign Box
    And Validate Fraud Notice CO in Read and Sign Box
    And Validate Consent message in Read and Sign Box
    #And Navigate back to Eligibility page
#		And Enter New State as "<State1>"
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		#And Validate Fraud Notice CA in Read and Sign Box
#		And Validate Fraud Notice CA in Read and Sign Box
#		And Navigate back to Eligibility page 
#		And Enter New State as "<State2>"
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Validate Fraud Notice AL in Read and Sign Box
#		And Navigate back to Eligibility page 
#		And Enter New State as "<State3>"
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Validate Fraud Notice AR in Read and Sign Box
#		And Navigate back to Eligibility page 
#		And Enter New State as "<State4>"
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Validate Fraud Notice LA in Read and Sign Box
#		And Navigate back to Eligibility page 
#		And Enter New State as "<State5>"
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Validate Fraud Notice PA in Read and Sign Box
#		And Navigate back to Eligibility page 
#		And Enter New State as "<State6>"
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Validate Fraud Notice RI in Read and Sign Box
#		And Navigate back to Eligibility page 
#		And Enter New State as "<State7>"
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Validate Fraud Notice MD in Read and Sign Box
#		And Navigate back to Eligibility page 
#		And Enter New State as "<State8>"
#		And Clicks on next button
#		And Clicks on next button
#		And Clicks on next button
#		And Clicks on next button
#		And Clicks on next button
#		And Clicks on next button
#		And Clicks on next button
#		And Validate Fraud Notice DC in Read and Sign Box
#		And Navigate back to Eligibility page 
#		And Enter New State as "<State9>"
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Validate Fraud Notice FL in Read and Sign Box
#		And Navigate back to Eligibility page 
#		And Enter New State as "<State10>"
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Validate Fraud Notice KS in Read and Sign Box
#		And Navigate back to Eligibility page 
#		And Enter New State as "<State11>"
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Validate Fraud Notice ME in Read and Sign Box
#		And Navigate back to Eligibility page 
#		And Enter New State as "<State12>"
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button  
#		And Validate Fraud Notice NJ in Read and Sign Box
#		And Navigate back to Eligibility page 
#		And Enter New State as "<State13>"
#		And Clicks on next button
#		And Clicks on next button
#		And Confirms Imp Replacement Info for NewYork state
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Clicks on next button 
#		And Validate Fraud Notice NY in Read and Sign Box
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
		And Clicks on IMPORTANT NOTICE in the Consent message in Read and Sign Box
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
		And Clicks on IMPORTANT NOTICE in the Consent message in Read and Sign Box
		#And Verify PDF as Important Notice New Mexico
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
		#Note: After Read & Sign and Electronic Consent, a third box is generated only for CT
		#And Validates Connecticut Note
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
|Website|Association| Title| Fname | Lname | State    |DOB        | WorkHr |Armedforces|Benefit |Benefit1 |TypeOfCove|SSN       |Mstatus |Height |Weight|Sex |MemId|Street         | City     | Zipcode  |PhoneType|PhoneNum  | State1    |State2  |State3  |State4   |State5       |State6       |State7   |State8               |State9  |State10 |State11|State12    |State13  |State14  |State15    |State16   |State17    | State18 |State19 |State20   |State21    | State22 |
|Tie    |AAFCS      | Mr.  | John  | Smith |  Colorado|10-01-1987 | 45     |No         |760,000 |$200,000 | New      |643276534 |Married |5.7    |185   |Male|5    |#1 main street | New York |25417 |Mobile   |0683928543|California |Alabama |Arkansas|Louisiana|Pennsylvania |Rhode Island |Maryland |District of Columbia |Florida |Kansas  |Maine  |New Jersey |New York |Oklahoma |Puerto Rico|Tennessee |Washington |Virginia |Wyoming |New Mexico|Connecticut|Minnesota|
		  