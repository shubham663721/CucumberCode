Feature: NADA GI Test 
@NADAGIRegression_1
Scenario Outline: <NADAGISC01>Application Submission for Self, Spouse and Child for GTLI and AD&D Insurance rider (Rider R7) 
	Given Test set up for "NYL" feature and "NYL_NADAGI" scenario 
	Given Customer navigate to NYL "<website>" 
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user 
	And Select NO for Association Membership 
	And Validate that NEXT button is Disabled 
	And Select YES Radio button of Membership 
	And Click on Self 
	And Click on Spouse 
	And Click on Child 
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>" 
	And Select radio button Yes for Spouse is Member 
	And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>" 
	And Click on Add Child button 
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>" 
	And Selects No for full time student for Child 
	And Click on Add Child button on Screen 
	And Clicks on next button 
	And Verify that error message is displayed as help us to display at top of the page 
	And Enters Basic salary as "<Sal>" for Self 
	And Clicks on next button 
	Then Product page details are displayed to user 
	And Clicks on Back or Previous button 
	And Enters DOB for Self as "<DOB1>" 
	And Clicks on next button 
	Then Product page details are displayed to user
	And Validates that Self is not displayed for TermLife 
	And Clicks on Back or Previous button 
	And Enters DOB for Self as "<DOB>" 
	And Clicks on next button 
	Then Product page details are displayed to user
	And Validates that Self is displayed for TermLife 
	And Clicks on Back or Previous button 
	And Enter New State as "<State1>" 
	And Clicks on next button 
	And Verify that error message is displayed for state eligibility at top of the page 
	And Enter New State as "<State>" 
	And Clicks on next button 
	Then Product page details are displayed to user
	And Clicks on next button 
	And Validate Error Message on Product Page 
	And Verify Available Product List TermLife 
	And Selects product TermLife for Self 
	And Selects product TermLife for Spouse 
	And Selects product TermLife for Child 
	And Clicks on next button 
	And Selects Yes for Do you have other life insurance in force for Self
	And Selects Yes for life insurance applied for intended to replace for Self 
	And Selects Yes for Do you have other life insurance in force for Spouse
	And Selects Yes for life insurance applied for intended to replace for Spouse 
	And Clicks on next button 
	Then Request Coverage page is displayed to user 
	And Selects Benefit Amount for Self as "<Benefit>" under GTLI using multiplying factor of base salary 
	And Selects Optional AD&D Rider for Self for GTLI 
	And Selects Optional AD&D Rider Benefit Amount for Self as "<RidBenefit>" under GTLI using multiplying factor of base salary 
	And Selects Benefit Amount for Spouse as "<SBenefit>" under GTLI 
	And Selects Optional AD&D Rider for Spouse for GTLI 
	And Select Optional AD&D Rider Benefit Amount as "<SRidBenefit>" for Spouse under GTLI 
	And Selects Benefit Amount for Child as "<CBenefit>" under GTLI 
	And Selects Optional AD&D Rider for Child for GTLI 
	And Clicks on next button 
	And Verify Error Message is displayed for Spouse exceeding the member benefit amount under GTLI 
	And Selects Benefit Amount for Spouse as "<SBenefit1>" under GTLI 
	And Clicks on next button 
	Then Request Coverage - Health Questions page is displayed to user 
	And Request Coverage - Health Questions page is displayed to user and selects Answer as YES for all questions for Self 
	And Clicks on Add Details Button of First question for Self 
	Then Explanation Screen is displayed to User and Enters details as "<MOnset>","<YOnset>","<ConditionDetails>","<NameAddress>" 
	And Clicks on Add Button 
	And Clicks on Add Details Button of Second question for Self 
	Then Explanation Screen is displayed to User and Enters details as "<MOnset1>","<YOnset1>","<ConditionDetails1>","<NameAddress1>" 
	And Clicks on Add Button 
	And Clicks on Add Details Button of Third question for Self 
	Then Explanation Screen is displayed to User and Enters details as "<MOnset2>","<YOnset2>","<ConditionDetails2>","<NameAddress2>" 
	And Clicks on Add Button 
	And Clicks on Add Details Button of Fourth question for Self 
	Then Explanation Screen is displayed to User and Enters details as "<MOnset3>","<YOnset3>","<ConditionDetails3>","<NameAddress3>" 
	And Clicks on Add Button 
	And Clicks on Add Details Button of Fifth question for Self 
	Then Explanation Screen is displayed to User and Enters details as "<MOnset4>","<YOnset4>","<ConditionDetails4>","<NameAddress4>" 
	And Clicks on Add Button 
	And Request Coverage - Health Questions page is displayed to user and selects Answer as YES for all questions for Spouse 
	And Clicks on Add Details Button of First question for Spouse 
	Then Explanation Screen is displayed to User and Enters details as "<SMOnset>","<SYOnset>","<SConditionDetails>","<SNameAddress>" 
	And Clicks on Add Button 
	And Clicks on Add Details Button of Second question for Spouse 
	Then Explanation Screen is displayed to User and Enters details as "<SMOnset1>","<SYOnset1>","<SConditionDetails1>","<SNameAddress1>" 
	And Clicks on Add Button 
	And Clicks on Add Details Button of Third question for Spouse 
	Then Explanation Screen is displayed to User and Enters details as "<SMOnset2>","<SYOnset2>","<SConditionDetails2>","<SNameAddress2>" 
	And Clicks on Add Button 
	And Clicks on Add Details Button of Fourth question for Spouse 
	Then Explanation Screen is displayed to User and Enters details as "<SMOnset3>","<SYOnset3>","<SConditionDetails3>","<SNameAddress3>" 
	And Clicks on Add Button 
	And Clicks on Add Details Button of Fifth question for Spouse 
	Then Explanation Screen is displayed to User and Enters details as "<SMOnset4>","<SYOnset4>","<SConditionDetails4>","<SNameAddress4>" 
	And Clicks on Add Button 
	And Clicks on next button 
	Then Contact Details page is displayed to user 
	And Selects Yes for Travel Question Non QD for Self 
	And Selects Residential Radio Button 
	And Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender>","<Street>","<City>","<Zipcode>" 
	And Enter details for Outside US country and How Long months for Self as "<Country>","<HowLong>" 
	And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page 
	And Selects Yes for Travel Question Non QD for Spouse 
	And Enters contact Details for Spouse without SSN as "<SGender>","<SHeight>","<SWeight>","<SPhoneType>","<SPhoneNum>" 
	And Enter datails for Outside US country and How Long months for Spouse as "<SCountry>","<SHowLong>" 
	And Clicks on next button	
	Then Application Summary Page is displayed to user 
	And Verify Benefit Amount for Self as "<BenefitAmt>" under TermLife
	And Verify Benefit Amount for Self as "<RidBenefitAmt>" under AD&D under TermLife
	And Verify Benefit Amount for Spouse as "<SBenefit1>" under TermLife 
	And Verify Rider Benefit Amount for Spouse as "<SRidBenefit>" under MLI 
	And Verify Benefit Amount for Child as "<CBenefit>" under TermLife
	And Clicks on next button 	
	Then Submit Application is displayed to user and confirms the terms for Self
	And Verify mandatory fields First name, Last name and DOB present for Self on Submit Application page 
	And Verify mandatory fields First name, Last name and DOB present for Spouse on Submit Application page
	And Submit Application is displayed to user and confirms the terms for Spouse
	And Enters Details for Self as "<Fname>","<Lname>","<DOB>" on Submit Application page
	And Enters Details for Spouse as "<Sfname>","<Slname>","<SDOB>" on Submit Application page 
	And Clicks on Submit button 	
	Then Thank you page is displayed to user 
	And Verify that Confirmation number is generated for "<website>" 
	And Verify PDF information as "<pdfScenario>","<pdfEnable>"
	
	Examples: 
		|website 		|Title   	|Fname  |Lname 	|State    	|DOB       				|Sal  	|State1  |DOB1     				|Stitle |Sfname |Slname |SDOB       			|Cfname |Clname |CDOB       			|Benefit|RidBenefit |SBenefit 	|SRidBenefit 	|CBenefit 	|SBenefit1  |MOnset |YOnset |ConditionDetails 	|NameAddress        						|MOnset1 	|YOnset1 	|ConditionDetails1 	|NameAddress1        						|MOnset2 	|YOnset2 	|ConditionDetails2 	|NameAddress2             										|MOnset3 	|YOnset3 	|ConditionDetails3 	|NameAddress3              											|MOnset4 	|YOnset4 	|ConditionDetails4 	|NameAddress4            									|SMOnset 	|SYOnset 	|SConditionDetails 	|SNameAddress               										|SMOnset1 	|SYOnset1 	|SConditionDetails1 |SNameAddress1            									|SMOnset2 	|SYOnset2 	|SConditionDetails2 |SNameAddress2             										|SMOnset3 	|SYOnset3 	|SConditionDetails3 |SNameAddress3              										|SMOnset4 	|SYOnset4 	|SConditionDetails4 |SNameAddress4             										|SSN   			|Mstatus |Gender 	|Height |Weight |Country |HowLong 	|Street   		|City |Zipcode 	|PhoneType 	|PhoneNum  		|SGender 	|SHeight 	|SWeight 	|SCountry 	|SHowLong 	|SPhoneType |SPhoneNum		|Csex|pdfEnable	|BenefitAmt  	|RidBenefitAmt|
		|nada-employee 	|Mr.  		|Axl  	|Rose 	|Texas   	|SYSDate-17Y/00M/01D 	|50000  |Nunavut |SYSDate-16Y/11M/29D 	|Mrs. 	|Jenny 	|Rose 	|SYSDate-17Y/00M/01D 	|Sam 	|Rose 	|SYSDate-00Y/00M/01D 	|2X  	|3X   		|110000  	|50000   		|10000  	|50000  	|09  	|2001 	|Leg Injury   		|Dr. Jake Allen 7th avenue, Plaza building 	|11   		|2010  		|Spine injury  		|DR. Mona Gallo 52 Green Global NY 10011 	|11   		|2011  		|Eye injury   		|Dr. Ken Moadel 10 East 40th Street, Fl6, New York, NY 10016 	|02   		|2000  		|Brain Injury  		|New York Doctors Urgent Care 65 W 13th St, New York, NY 10011, USA |01   		|1999  		|Limb Broken  		|Hylton Heather M 1275 York Ave, New York, NY 10065, USA 	|01   		|2005  		|Kindey Damage  	|Oz Mehmet C MD Fort Washington Ave #435, New York, NY 10032, USA  	|05   		|2005  		|Nose broken  		|Weller Rachel J MD 21 W 86th St, New York, NY 10024, USA 	|01   		|2001  		|Joint pains  		|Dr. Alan R. Dayan, MD 310 E 14th St, New York, NY 10003, USA 	|11   		|2011  		|Sinus    			|Dr. James J. Douglas, MD 425 E 84th St, New York, NY 10028, USA 	|04   		|2015  		|Meningitis   		|Mahowald Carrie MD 227 Madison St, New York, NY 10002, USA  	|115-45-6445 	|Married |Male  	|5.5 	|200 	|Belgium |12   		|12,Lemon rd 	|SAND |12579  	|Home  		|(454) 114-8484 |Female  	|5.2  		|180  		|Belgium 	|12   		|Home  		|(454) 114-8484	|Male|0			|100000   		|150000|

@NADAGIRegression_2
Scenario Outline:<NADAGISC02>Application Submission for Self only for GTLI and AD&D Insurance rider (Rider R7)

Given Test set up for "NYL" feature and "NYL_NADAGI" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user 
And Select NO for Association Membership 
And Validate that NEXT button is Disabled 
And Select YES Radio button of Membership
And Click on Self 
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Enters Basic salary as "<Sal>" for Self
And Clicks on next button
Then Product page details are displayed to user 
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB1>"
And Clicks on next button
And Validate Age Restriction Message
And Enters DOB for Self as "<DOB2>"
And Clicks on next button
And Validate Age Restriction Message
And Enters DOB for Self as "<DOB>"
And Clicks on next button
Then Product page details are displayed to user
And Verify Available Product List TermLife 
And Selects product TermLife for Self
And Clicks on next button
And Selects No for Do you have other life insurance in force for Self
And Clicks on next button
Then Request Coverage page is displayed to user 
And Verify the benefit amount for Self under GTLI is in Multiplier: 1x, 2x, 3x, 4x, 5x, 6x of Base Salary
And Selects Optional AD&D Rider for Self for GTLI 
And Verify the benefit amount of rider for Self under GTLI is in Multiplier: 1x, 2x, 3x, 4x, 5x of Base Salary
And Selects Benefit Amount for Self as "<Benefit>" under GTLI using multiplying factor of base salary
And Selects Optional AD&D Rider Benefit Amount for Self as "<RidBenefit>" under GTLI using multiplying factor of base salary 
And Clicks on next button
Then Request Coverage - Health Questions page is displayed to user
And Request Coverage - Health Questions page is displayed to user and selects Answer as NO for all questions for Self
And Clicks on next button
Then Contact Details page is displayed to user
And Selects No for Travel Question Non QD for Self
And Selects Business Address Radio Button for Send Correspondence To
And Selects NO Radio Button for Business Address
And Enters contact Details without SSN and MemberID for Self as "<Mstatus>","<Height>","<Weight>","<Gender>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Enters Business Details as "<BusName>","<BusType>"
And Enter Business Address Details as "<BusStreet>","<BusCity>","<BusState>","<BusZip>"
And Clicks on next button
And Validate error message for required question
And Enters SSN "<SSN>" for Self
And Clicks on next button
Then Application Summary Page is displayed to user 
And Clicks on next button
Then Submit Application is displayed to user
And Clicks on Submit button
And Validate Error message for Authorization
And Submit Application is displayed to user and confirms the terms for Self 
And Verify mandatory fields First name, Last name and DOB present for Self on Submit Application page
And Enters Details for Self as "<Fname>","<Lname>","<DOB>" on Submit Application page
And Clicks on Submit button
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"
And Verify PDF information as "<pdfScenario>","<pdfEnable>"

Examples:
|website 		|Title   	|Fname  |Lname  	|State     		|DOB       				|Sal  		|DOB1     				|DOB2     				|Benefit 	|RidBenefit |SSN   			|Mstatus |Gender   	|Height 	|Weight  	|Street    			|City 	|Zipcode 	|PhoneType 	|PhoneNum  		|BusName  	|BusType  		|BusStreet  	|BusCity 	|BusState 	|BusZip  	|pdfEnable|
|nada-employee 	|Mr.  		|Blake  |Jhonson 	|California   	|SYSDate-17Y/00M/00D 	|45000  	|SYSDate-16Y/11M/29D 	|SYSDate-100Y/00M/00D 	|2X   		|1X   		|103-78-5019 	|Married |Male  	|5.7	 	|225  		|12,Vapor fade rd 	|LA  	|14259  	|Home  		|(565) 875-8484 |Westeros  	|Corporation 	|21 Bakers St 	|JK   		|Idaho  	|45905 		|0|

@NADAGIRegression_3
Scenario Outline:<NADAGISC03>Application Submission for Spouse only for GTLI and AD&D Insurance rider (Rider R7)

Given Test set up for "NYL" feature and "NYL_NADAGI" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user 
And Select NO for Association Membership
And Validate that NEXT button is Disabled 
And Select YES Radio button of Membership
And Click on Spouse
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Enters Basic salary as "<Sal>" for Self 
And Select radio button Yes for Spouse is Member  
And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
And Clicks on next button
Then Product page details are displayed to user
And Clicks on Back or Previous button
And Enters DOB for Spouse as "<SDOB1>"
And Clicks on next button
And Validate Age Restriction Message
And Enters DOB for Spouse as "<SDOB2>"
And Clicks on next button
And Validate Age Restriction Message
And Enters DOB for Spouse as "<SDOB>"
And Clicks on next button
Then Product page details are displayed to user
And Verify Available Product List TermLife 
And Selects product TermLife for Spouse 
And Clicks on next button
And Click YES for Dependent Coverage information
And Selects No for Do you have other life insurance in force for Spouse
And Clicks on next button
Then Request Coverage page is displayed to user 
And Validates under GTLI the Benefit Slider Range as "<SRangeMin>" to "<SRangeMax>" for Spouse
And Selects Benefit Amount for Spouse as "<SBenefit>" under GTLI
And Selects Optional AD&D Rider for Spouse for GTLI
And Select Optional AD&D Rider Benefit Amount as "<SRidBenefit>" for Spouse under GTLI 
And Clicks on button to Save for later
Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VerifyPass>"
And Clicks OK Button Save For Later
Then Refresh the browser
Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive
Then Eligibility page details are displayed to user
And Clicks on next button
And Clicks on next button
And Click YES for Dependent Coverage information
And Clicks on next button
Then Request Coverage page is displayed to user 
And Clicks on next button
Then Request Coverage - Health Questions page is displayed to user
And Request Coverage - Health Questions page is displayed to user and selects Answer as NO for all questions for Spouse
And Clicks on next button
Then Contact Details page is displayed to user
And Selects Residential Radio Button
And Enters contact Details without SSN, MemberID, Height, Weight for Self as "<Mstatus>","<Gender>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Selects No for Travel Question Non QD for Spouse
And Enters contact Details for Spouse without SSN as "<SGender>","<SHeight>","<SWeight>","<SPhoneType>","<SPhoneNum>"
And Clicks on next button
And Validate error message for required question
And Enters SSN "<SSN>" for Self
And Validates that SSN is optional for Spouse
And Clicks on next button
Then Application Summary Page is displayed to user 
And Clicks on next button
Then Submit Application is displayed to user
And Clicks on Submit button
And Validate Error message for Authorization
And Verify mandatory fields First name, Last name and DOB present for Self on Submit Application page 
And Verify mandatory fields First name, Last name and DOB present for Spouse on Submit Application page
Then Submit Application is displayed to user and confirms the terms for Self
Then Submit Application is displayed to user and confirms the terms for Spouse
And Enters Details for Self as "<Fname>","<Lname>","<DOB>" on Submit Application page
And Enters Details for Spouse as "<Sfname>","<Slname>","<SDOB>" on Submit Application page 
And Clicks on Submit button
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"
And Verify PDF information as "<pdfScenario>","<pdfEnable>"

Examples:
|website 		|Title   	|Fname  |Lname 	|State    	|DOB       				|Sal  	|Stitle  	|Sfname |Slname |SDOB       			|SDOB1     				|SDOB2     				|SRangeMin 	|SRangeMax 	|SRangeIncr |SBenefit 	|SRidBenefit 	|SSN   			|Mstatus |Street    		|City 	|Zipcode 	|PhoneType 	|PhoneNum  		|SHeight 	|SWeight 	|SPhoneType |SPhoneNum 		|Gender	|SGender|pdfEnable	|Password |VerifyPass  |
|nada-employee 	|Dr.  		|Jamie  |Fao 	|New Jersey |SYSDate-17Y/00M/00D 	|60000  |Dr.   		|Jenny 	|Fao 	|SYSDate-17Y/00M/00D 	|SYSDate-16Y/11M/29D 	|SYSDate-100Y/00M/00D 	|50000  	|500000  	|10000  	|70000  	|70000   		|106-79-3029 	|Married |12,Vapor fade rd 	|LA  	|14259  	|Home  		|(306) 597-2222 |5.6  		|185  		|Mobile  	|(681) 304-3333 |Male	|Female	|0			|Test@123 |Test@123  |

@NADAGIRegression_4
Scenario Outline:<NADAGISC04>Application Submission for Child only for GTLI (Maximum number of children) (No Rider)

Given Test set up for "NYL" feature and "NYL_NADAGI" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user 
And Select NO for Association Membership
And Validate that NEXT button is Disabled 
And Select YES Radio button of Membership
And Click on Child                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Enters Basic salary as "<Sal>" for Self
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<CSex>" 
And Selects Yes for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button 
Then Add Child Screen is displayed and Enters Child details as "<Cfname1>","<Clname1>","<CDOB1>","<CSex1>"
And Selects Yes for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname2>","<Clname2>","<CDOB2>","<CSex>"
And Selects Yes for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button 
Then Add Child Screen is displayed and Enters Child details as "<Cfname3>","<Clname3>","<CDOB3>","<CSex>"
And Selects Yes for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button 
Then Add Child Screen is displayed and Enters Child details as "<Cfname4>","<Clname4>","<CDOB4>","<CSex1>"
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button 
Then Add Child Screen is displayed and Enters Child details as "<Cfname5>","<Clname5>","<CDOB5>","<CSex>"
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname6>","<Clname6>","<CDOB6>","<CSex>"
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname7>","<Clname7>","<CDOB7>","<CSex1>"
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Validates Add Child Button on Eligibility page is not present
And Clicks on next button
Then Product page details are displayed to user
And Clicks on Back or Previous button
And Enter New State as "<State1>"
And Clicks on next button
And Verify that error message is displayed for state eligibility at top of the page 
And Enter New State as "<State>"
And Clicks on next button
Then Product page details are displayed to user
And Clicks on next button
And Validate Error Message on Product Page
And Verify Available Product List TermLife 
And Selects product TermLife for Child 
And Clicks on next button
And Click YES for Dependent Coverage information
Then Request Coverage page is displayed to user 
And Selects Benefit Amount for Child as "<Cbenefit>" under GTLI
And Clicks on next button
Then Request Coverage - Health Questions page is displayed to user
And Clicks on next button
Then Contact Details page is displayed to user
And Selects Residential Radio Button
And Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<Gender>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Clicks on next button
Then Application Summary Page is displayed to user 
And Validates Self as "<Fname>","<Lname>"
And Validates Self as "<Fname>","<Lname>"
And Verify Child Firstname and Lastname as "<Cfname>","<Clname>"
And Verify Benefit Amount for First child as "<Cbenefit>" under GTDLI
And Verify Child Firstname and Lastname as "<Cfname1>","<Clname1>"
And Verify Benefit Amount for Second child as "<Cbenefit>" under GTDLI
And Verify Child Firstname and Lastname as "<Cfname3>","<Clname3>"
And Verify Benefit Amount for Third child as "<Cbenefit>" under GTDLI
And Verify Child Firstname and Lastname as "<Cfname4>","<Clname4>"
And Verify Benefit Amount for Fourth child as "<Cbenefit>" under GTDLI
And Verify Child Firstname and Lastname as "<Cfname7>","<Clname7>"
And Verify Benefit Amount for Fifth child as "<Cbenefit>" under GTDLI
And Clicks on next button
Then Submit Application is displayed to user and confirms the terms for Self 
And Validates I Understand Verbiage in Read and Sign Box
And Validates that Second I understand verbiage is not displayed in Read and Sign Box
And Validates that Authorization message is not displayed in Read and Sign Box
And Validates Consent message in Read and Sign Box for NonUW
And Verify that fraud notice is not rendered at Authorization page
And Verify mandatory fields First name, Last name and DOB present for Self on Submit Application page
And Enters Details for Self as "<Fname>","<Lname>","<DOB>" on Submit Application page
And Clicks on Submit button
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"
And Verify PDF information as "<pdfScenario>","<pdfEnable>"

Examples:
|website 		|Title   	|Fname  |Lname  |State    |State1  |DOB       			|Sal  	|Cfname |Clname |CDOB     				|Cfname1 	|Clname1 	|CDOB1     				|Cfname2 	|Clname2 	|CDOB2     				|Cfname3 |Clname3 	|CDOB3     				|Cfname4 |Clname4 	|CDOB4     				|Cfname5 	|Clname5 	|CDOB5     				|Cfname6 |Clname6 	|CDOB6     				|Cfname7 	|Clname7 	|CDOB7      			|Cbenefit 	|SSN   			|Mstatus |Gender 	|Street     			|City 	|Zipcode 	|PhoneType 	|PhoneNum  		|CSex	|CSex1	|
|nada-employee 	|Prof.  	|Heith  |Jones  |New York |Alberta |SYSDate-17Y/00M/00D |65000  |Larry 	|Jones 	|SYSDate-24Y/11M/29D 	|Marry  	|Jones  	|SYSDate-19Y/11M/29D 	|Nick  		|Jones  	|SYSDate-25Y/00M/00D 	|Enrique |Jones  	|SYSDate-18Y/11M/29D 	|Ariana  |Jones  	|SYSDate-00Y/00M/00D 	|Perry  	|Jones  	|SYSDate-20Y/00M/00D 	|Indiana |Jones  	|SYSDate-24Y/00M/00D 	|Lucy  		|Jones  	|SYSDate-19Y/11M/29D 	|10000  	|980-25-9076 	|Married |Male  	|12,Electrode charge rd |LA  	|19259  	|Home  		|839) 257-8506 	|Male	|Female	|

@NADAGIRegression_5
Scenario Outline:<NADAGISC05>Validation Read & Sign Page with 21 different States one by one in loop (All Validations done on Authorization and Consent Page)

Given Test set up for "NYL" feature and "NYL_NADAGI" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user 
And Select YES Radio button of Membership
And Click on Self  
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Enters Basic salary as "<Sal>" for Self
And Clicks on next button
Then Product page details are displayed to user
And Verify Available Product List TermLife
And Selects product TermLife for Self
And Clicks on next button
And Selects No for Do you have other life insurance in force for Self
And Clicks on next button
Then Request Coverage page is displayed to user 
And Selects Benefit Amount for Self as "<Benefit>" under GTLI using multiplying factor of base salary
And Selects Optional AD&D Rider for Self for GTLI 
And Selects Optional AD&D Rider Benefit Amount for Self as "<RidBenefit>" under GTLI using multiplying factor of base salary 
And Clicks on next button
Then Request Coverage - Health Questions page is displayed to user
And Request Coverage - Health Questions page is displayed to user and selects Answer as NO for all questions for Self
And Clicks on next button
Then Contact Details page is displayed to user
And Selects No for Travel Question Non QD for Self
And Selects Residential Radio Button
And Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Clicks on next button
Then Application Summary Page is displayed to user 
And Clicks on next button
Then Submit Application is displayed to user
And Validate Authorization message in Read and Sign Box
And Validate Fraud Notice CT in Read and Sign Box
And Validate Consent message in Read and Sign Box
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
And Validate Fraud Notice NJ in Read and Sign Box
And Navigate back to Eligibility page
And Enter New State as "<State14>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate error message for required question
And Confirms Imp Replacement Info for NewYork state
And Selects Yes for Do you have other life insurance in force for Self
#And selects Answer as YES for all questions for Self
And Selects Yes for Do you have other life insurance in force for Self
And Selects Yes for life insurance applied for intended to replace for Self
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate Fraud Notice NY in Read and Sign Box
And Navigate back to Eligibility page 
And Enter New State as "<State15>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate Fraud Notice OK in Read and Sign Box
And Navigate back to Eligibility page
And Enter New State as "<State17>"
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
And Validate Fraud Notice VA in Read and Sign Box
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
And Validate Authorization Message MN in Read and Sign Box

Examples:
|website 		|Title   	|Fname    	|Lname   |State     	|DOB        			|Sal 	|Benefit 	|RidBenefit |SSN   			|Mstatus |Height |Weight 	|Street    			|City 	|Zipcode 	|PhoneType 	|PhoneNum  		|State1  	|State2   		|State3  |State4  	|State5  	|State6   		|State7   		|State8  	|State9     			|State10 |State11 |State12 	|State13 	|State14 	|State15 	|State16  		|State17  	|State18  		|State19 	|State20 	|State21 	|Gender	|pdfScenario1	|pdfEnable|pdfName1                               |
|nada-employee 	|Mr.  		|Robert  	|Spectre |Connecticut  	|SYSDate-17Y/00M/00D  	|62000 	|2X   		|1X   		|336-97-6924 	|Married |5.7 	|225 		|12,Lemon fade rd 	|LA  	|52647  	|Home  		|(928) 417-6328 |Colorado 	|California  	|Alabama |Arkansas 	|Louisiana 	|Pennsylvania 	|Rhode Island 	|Maryland 	|District of Columbia 	|Florida |Kansas  |Maine  	|New Jersey |New York 	|Oklahoma 	|Puerto Rico 	|Tennessee  |Washington  	|Virginia 	|New Mexico |Minnesota 	|Male	|NADAGI08_NM   	|1        |Important Notice NM 2 08.12	|

