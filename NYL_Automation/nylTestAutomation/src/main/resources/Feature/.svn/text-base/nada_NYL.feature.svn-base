Feature: NADA Test

@NADARegression_1
Scenario Outline:<NADASC01>Application Submission for Self,  Spouse, Child All eligible products and all riders where member is Manager (Primary Individual and Contingent Trust beneficiaries for all)

Given Test set up for "NYL" feature and "NYL_NADA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user 
And Select YES Radio button of Membership
And Click on Self
And Click on Spouse
And Click on Child
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
And Select radio button NO for Spouse is Member
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Clicks on next button
And Verify that error message is displayed as help us to display at top of the page
And Selects employment status as "<EmploymentStatus>"
And Enter New State as "<State1>"
And Clicks on next button
And Verify that error message is displayed for state eligibility at top of the page
And Enter New State as "<State>"
And Clicks on next button
Then Product page details are displayed to user
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB1>"
#And Enters DOB as "<DOB1>"
And Clicks on next button
Then Product page details are displayed to user
And Verify Self is not displayed for MLI,TenYTL,TwentyYTL on product page
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB>"
And Clicks on next button
Then Product page details are displayed to user
And Validates that Self is displayed for MLI,TenYTL,TwentyYTL on product page
And Clicks on Back or Previous button
And Clicks Edit button for Child Added
And Enters DOB for Child as "<CDOB1>"
And Click on Add Child button on Screen
And Clicks on next button
Then Product page details are displayed to user
And Validates that Child is not displayed for MLI,TenYTL,TwentyYTL on product page
And Clicks on Back or Previous button
And Clicks Edit button for Child Added
And Enters DOB for Child as "<CDOB>"
And Click on Add Child button on Screen
And Clicks on next button
Then Product page details are displayed to user
And Verify for Child only MLI product is Available
And Clicks on next button
And Validate Error Message on Product Page
And Verify Available Product List MLI,TenYTL,TwentyYTL
And Verify for Child only MLI product is Available
And Selects product MLI for Self
And Selects product MLI for Spouse
And Selects product MLI for Child
And Selects product TenYTL for Self
And Selects product TenYTL for Spouse
And Verify Child icon is not displayed for TenYTL
And Selects product TwentyYTL for Self
And Selects product TwentyYTL for Spouse
And Verify Child icon is not displayed for TwentyYTL
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Self
And Selects Yes for life insurance applied for intended to replace for Self
And Verify New York State paragraph is displayed for Self
And Enter additional details as "<TAmount>","<Amount>","<Company>"
And Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Spouse
And Verify New York State paragraph is displayed for Spouse
And Enter additional details as "<STAmount>","<SAmount>","<SCompany>" for Spouse
And Clicks on next button
And Validate error message for required question
And Confirms Imp Replacement Info for NewYork state
And Clicks on next button
Then Request Coverage page is displayed to user 
And Selects Type of Coverage as "<TypeofCove>" for Self under MLI
And Selects Benefit Amount for Self as "<Benefit>" under MLI
And Selects Optional AD&D Rider for Self for MLI
And Selects Optional AD&D Rider Benefit Amount as "<RidBenefit>" for Self under MLI
And Selects Type of Coverage as "<TypeofCove>" for Spouse under MLI
And Selects Benefit Amount for Spouse as "<SBenefit>" under MLI
And Selects Optional AD&D Rider for Spouse for MLI
And Selects Optional AD&D Rider Benefit Amount as "<SRidBenefit>" for Spouse under MLI
And Selects Benefit Amount for Child as "<CBenefit>" under MLI
And Selects AD&D Rider for Child for MLI
And Selects Type of Coverage as "<TypeofCove>" for Self under TenYTL
And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
And Selects Type of Coverage as "<TypeofCove>" for Spouse under TenYTL
And Selects Benefit Amount for Spouse as "<SBenefit1>" under TenYTL
And Selects Type of Coverage as "<TypeofCove>" for Self under TwentyYTL
And Selects Benefit Amount for Self as "<Benefit2>" under TwentyYTL
And Selects Type of Coverage as "<TypeofCove>" for Spouse under TwentyYTL
And Selects Benefit Amount for Spouse as "<SBenefit2>" under TwentyYTL
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
And Clicks on Add Beneficiary Button for Self under TwentyYTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname1>","<Blname1>","<Relationship1>","<Perc1>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TwentyYTL
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
And User Enters Beneficiary details as "<Trust1>","<Datetrust1>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under TwentyYTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<SBfname1>","<SBlname1>","<SRelationship1>","<SPerc1>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under TwentyYTL
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
And User Enters Beneficiary details as "<STrust1>","<SDatetrust1>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under MLI
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname2>","<Blname2>","<Relationship2>","<Perc2>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under MLI
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
And User Enters Beneficiary details as "<Trust2>","<Datetrust2>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under MLI
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<SBfname2>","<SBlname2>","<SRelationship2>","<SPerc2>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under MLI
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
And User Enters Beneficiary details as "<STrust2>","<SDatetrust2>"
And Clicks on OK button
And Clicks on next button
Then Contact Details page is displayed to user
And Selects Yes for Travel Question Non QD for Self
And Selects Residential Radio Button
And Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender>","<Street>","<City>","<Zipcode>"
And Enter details for Outside US country and How Long months for Self as "<Country>","<HowLong>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Enters Dealership name as "<DealershipName>" and Dealership address as "<DealershipStreet>","<DealershipCity>","<DealershipState>","<DealershipZipcode>"
And Selects Yes for Travel Question Non QD for Spouse
And Enters contact Details for Spouse without SSN as "<SGender>","<SHeight>","<SWeight>","<SPhoneType>","<SPhoneNum>"
And Enter datails for Outside US country and How Long months for Spouse as "<SCountry>","<SHowLong>"
And Clicks on next button
Then Application Summary Page is displayed to user 
And Verify Benefit Amount for Self as "<Benefit>" under MLI
And Verify Rider Benefit Amount for Self as "<RidBenefit>" under MLI
And Verify Benefit Amount for Spouse as "<SBenefit>" under MLI
And Verify Rider Benefit Amount for Spouse as "<SRidBenefit>" under MLI
And Verify Benefit Amount for Child as "<CBenefit>" under MLI
And Verify Benefit Amount for Self as "<Benefit1>" under TenYTL
And Verify Benefit Amount for Spouse as "<SBenefit1>" under TenYTL
And Verify Benefit Amount for Self as "<Benefit2>" under TwentyYTL
And Verify Benefit Amount for Spouse as "<SBenefit2>" under TwentyYTL
And Clicks on next button
Then Authorize page details are displayed to user and confirm the term and conditions for Self
And Verify that fraud notice is not rendered at Authorization page
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
|website 	|Title   |Fname  	|Lname |State     	|DOB     				|State1  	|DOB1  					|CDOB1   				|Stitle |Sfname |Slname |SDOB    				|Cfname |Clname |CDOB    				|Csex|EmploymentStatus  	|TAmount  	|Amount |Company 	|STAmount  	|SAmount 	|SCompany 	|Benefit |RidBenefit 	|SBenefit 	|SRidBenefit 	|CBenefit 	|Benefit1 	|SBenefit1  |Benefit2 	|SBenefit2 	|Bfname |Blname |Relationship 	|Perc 	|Trust  	|Datetrust 	|SBfname 	|SBlname 	|SRelationship 	|SPerc 	|STrust  	|SDatetrust |Bfname1 	|Blname1 	|Relationship1 	|Perc1 	|Trust1    			|Datetrust1 |SBfname1 	|SBlname1 	|SRelationship1 |SPerc1 |STrust1  		|SDatetrust1 |Bfname2 	|Blname2 	|Relationship2 	|Perc2 	|Trust2  	|Datetrust2 |SBfname2 	|SBlname2 	|SRelationship2 |SPerc2 |STrust2  		|SDatetrust2 |SSN   		|Mstatus |Height 	|Weight |Country |HowLong 	|Street   		|City |Zipcode 	|PhoneType 	|PhoneNum  		|DealershipName |DealershipStreet 	|DealershipCity |DealershipState 	|DealershipZipcode 	|SHeight 	|SWeight 	|SCountry 	|SHowLong 	|SPhoneType |SPhoneNum		|TypeofCove	|Gender	|SGender|pdfEnable	|
|NADA 		|Mr. 	 |Alex  	|Smith |New York   	|SYSDate-17Y/00M/00D  	|Guam  		|SYSDate-16Y/11M/29D 	|SYSDate-26Y/00M/00D  	|Mrs. 	|Jenny 	|Smith 	|SYSDate-17Y/00M/00D 	|Sam 	|Smith 	|SYSDate-00Y/00M/00D 	|Male|Manager   			|2000  		|2000 	|JFMA  		|2000  		|2000  		|JFMA  		|250000  |$25,000  		|100000  	|$10,000   		|10000  	|200000  	|100000  	|200000  	|100000  	|Axl 	|Rose 	|Son   			|100 	|MGM CORP 	|01/01/2001 |Dizzy  	|Reeds  	|Father   		|100 	|GNR CORP 	|01/01/1986 |Slash  	|Rains  	|Son   			|100 	|Pink Floyd Corp 	|01/01/1980 |Myles  	|Keneddy 	|Father   		|100 	|Dylan Trust 	|01/01/1970  |Marry  	|Fox  		|Mother   		|100 	|NMS Trust 	|01/01/2006 |David  	|Gilmore 	|Father   		|100 	|Phantom corp 	|01/01/1970  |115-45-6445 	|Married |5.5	 	|200 	|Belgium |12   		|12,Lemon rd 	|SAND |12579  	|Home  		|(454) 114-8484 |MC Dealers  	|4th Long Avanue 	|Lexus   		|Texas    			|15634    			|5.2	  	|180  		|Belgium 	|12   		|Home  		|(454) 114-8484	|New		|Male	|Female	|0			|

@NADARegression_2
Scenario Outline:<NADASC02>Application Submission for Self only with all eligible products where member is Employee (Benefitiary as Primary trust)

Given Test set up for "NYL" feature and "NYL_NADA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user 
And Select NO for Association Membership
And Validate that NEXT button is Disabled
And Select YES Radio button of Membership
And Click on Self
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Clicks on next button
And Verify that error message is displayed as help us to display at top of the page
And Selects employment status as "<EmploymentStatus>"
And Enter New State as "<State1>"
And Clicks on next button
And Verify that error message is displayed for state eligibility at top of the page
And Enter New State as "<State>"
And Clicks on next button
Then Product page details are displayed to user
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB1>"
And Clicks on next button
And Validate Age Restriction Message
And Enters DOB for Self as "<DOB>"
And Clicks on next button
Then Product page details are displayed to user
And Clicks on next button
And Validate Error Message on Product Page
And Verify Available Product ELI only for Self
And Selects product ELI for Self
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self	
And Clicks on next button
Then Request Coverage page is displayed to user 
And Selects Type of Coverage as "<TypeofCove>" for Self under ELI
And Validates under ELI the Benefit Slider Range as "<RangeMin>" to "<RangeMax>" for Self
And Selects Benefit Amount for Self as "<Benefit>" under ELI
And Selects Optional AD&D Rider for Self for ELI
And Selects Optional AD&D Rider Benefit Amount as "<RidBenefit>" for Self for ELI
And Clicks on button to Save for later
Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VerifyPass>"
And Clicks OK Button Save For Later
Then Refresh the browser
Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive
Then Request Coverage page is displayed to user 
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary button for Self
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And User Enters Beneficiary details as "<Trust>","<Datetrust>"
And Clicks on OK button
And Click Delete button for first Primary Beneficiary for Self
And Delete box is displayed and clicks on Yes
And Clicks on Add Beneficiary button for Self
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And User Enters Beneficiary details as "<Trust>","<Datetrust>"
And Clicks on OK button
And Clicks on next button
Then Contact Details page is displayed to user
And Selects No for Travel Question Non QD for Self
And Selects Residential Radio Button
And Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Enters Dealership name as "<DealershipName>" and Dealership address as "<DealershipStreet>","<DealershipCity>","<DealershipState>","<DealershipZipcode>"
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
|website 	|Title   	|Fname  |Lname |State     	|DOB       				|State1   		|DOB1      				|EmploymentStatus  	|RangeMin 	|RangeMax   |Benefit 	|RidBenefit |Trust  	|Datetrust 	|SSN   			|Mstatus |Gender    |Height |Weight |Street   		|City 	|Zipcode 	|PhoneType 	|PhoneNum  		|DealershipName |DealershipStreet 	|DealershipCity |DealershipState 	|DealershipZipcode	|TypeofCove	|pdfEnable	|Password |VerifyPass|
|NADA 		|Prof.  	|Alex  	|Smith |California  |SYSDate-17Y/00M/00D 	|New Brunswick 	|SYSDate-16Y/11M/29D 	|Employee   		|25000  	|250000    	|75000  	|$10,000  	|JFK Trust 	|01/09/2001 |895-72-6445 	|Married |Male	 	|5.5 	|200 	|12,Lemon rd 	|LA  	|89779  	|Home  		|(313) 454-8478 |LANDMAN & CO. 	|4th Long Avanue 	|Lexus   		|Texas    			|15634 				|New		|0			|Test@123 |Test@123  |

@NADARegression_3
Scenario Outline:<NADASC03>Application Submission for Spouse only with all eligible products where member is Manager (Benefitiary as Primary & contingent Individuals and Contingent trust)

Given Test set up for "NYL" feature and "NYL_NADA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user
And Select YES Radio button of Membership
And Click on Spouse
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Selects employment status as "<EmploymentStatus>"
And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
And Select radio button NO for Spouse is Member
And Clicks on next button
Then Product page details are displayed to user
And Clicks on Back or Previous button
And Enters DOB for Spouse as "<SDOB1>"
And Clicks on next button
And Validate Age Restriction Message
And Enters DOB for Spouse as "<SDOB2>"
And Clicks on next button
Then Product page details are displayed to user
And Validates that Spouse is displayed for MLI,TenYTL on product page
And Clicks on Back or Previous button
And Enters DOB for Spouse as "<SDOB>"
And Clicks on next button
Then Product page details are displayed to user
And Validates that Spouse is displayed for MLI,TenYTL,TwentyYTL on product page
And Selects product MLI for Spouse
And Selects product TenYTL for Spouse
And Selects product TwentyYTL for Spouse
And Clicks on next button
And Click YES for Dependent Coverage information
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
And Clicks on next button
Then Request Coverage page is displayed to user 
And Selects Type of Coverage as "<TypeofCove>" for Spouse under MLI
And Validates under MLI the Benefit Slider Range as "<SRangeMin>" to "<SRangeMax>" for Spouse
And Selects Benefit Amount for Spouse as "<SBenefit>" under MLI
And Selects Optional AD&D Rider for Spouse for MLI
And Selects Optional AD&D Rider Benefit Amount as "<SRidBenefit>" for Spouse under MLI
And Selects Type of Coverage as "<TypeofCove>" for Spouse under TenYTL
And Validates under TenYTL the Benefit Slider Range as "<SRangeMin1>" to "<SRangeMax1>" for Spouse
And Selects Benefit Amount for Spouse as "<SBenefit1>" under TenYTL
And Selects Type of Coverage as "<TypeofCove>" for Spouse under TwentyYTL
And Validates under TwentyYTL for Spouse the Benefit Slider Range as "<SRangeMin2>" to "<SRangeMax2>"
And Selects Benefit Amount for Spouse as "<SBenefit2>" under TwentyYTL
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Spouse under TenYTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<SBfname>","<SBlname>","<SRelationship>","<SPerc>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under TenYTL
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<SBfname1>","<SBlname1>","<SRelationship1>","<SPerc1>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under TenYTL
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
And User Enters Beneficiary details as "<STrust>","<SDatetrust>"
And Clicks on OK button
And Verify that error message is displayed as trust cannot be added if individual already exists
And Clicks on Close button
And Clicks on Add Beneficiary Button for Spouse under TwentyYTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<SBfname2>","<SBlname2>","<SRelationship2>","<SPerc2>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under TwentyYTL
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<SBfname3>","<SBlname3>","<SRelationship3>","<SPerc3>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under MLI
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<SBfname4>","<SBlname4>","<SRelationship4>","<SPerc4>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under MLI
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<SBfname5>","<SBlname5>","<SRelationship5>","<SPerc5>"
And Clicks on OK button
And Clicks on next button
And Verify Error Message is displayed for share of Beneficiaries
And Clicks on Edit button for first Beneficiary for Spouse for TenYTI
Then Add Beneficiary page will be displayed to user and User Enters Beneficiary details as "<SPerc6>" for Individual Primary
And Clicks on OK button
And Clicks on Edit button for second Beneficiary for Spouse for TenYTI
Then Add Beneficiary page will be displayed to user and User Enters Beneficiary details as "<SPerc7>" for Individual Contingent
And Clicks on OK button
And Clicks on next button
Then Contact Details page is displayed to user
And Selects Residential Radio Button
And Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<Gender>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Enters Dealership name as "<DealershipName>" and Dealership address as "<DealershipStreet>","<DealershipCity>","<DealershipState>","<DealershipZipcode>"
And Selects No for Travel Question Non QD for Spouse
And Enters contact Details for Spouse without SSN as "<SGender>","<SHeight>","<SWeight>","<SPhoneType>","<SPhoneNum>"
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
And Verify PDF information as "<pdfScenario>","<pdfEnable>"

Examples: 
|website 	|Title   	|Fname 		|Lname  |State    	|DOB       				|EmploymentStatus 	|Stitle |Sfname 	|Slname |SDOB       			|SDOB1      			|SDOB2     				|SRangeMin 	|SRangeMax 	|SRangeMin1 |SRangeMax1 |SRangeMin2 |SRangeMax2 |SBenefit 	|SRidBenefit 	|SBenefit1  |SBenefit2 	|SBfname 	|SBlname 	|SRelationship 	|SPerc 	|SBfname1 	|SBlname1 	|SRelationship1 |SPerc1 |STrust    			|SDatetrust |SBfname2 	|SBlname2 	|SRelationship2 |SPerc2 |SBfname3 	|SBlname3 	|SRelationship3 |SPerc3 |SBfname4 	|SBlname4 	|SRelationship4 |SPerc4 |SBfname5 	|SBlname5 	|SRelationship5 |SPerc5 |SPerc6 |SPerc7  	|SSN   			|Mstatus |Street   		|City 	|Zipcode 	|PhoneType 	|PhoneNum  		|DealershipName |DealershipStreet 	|DealershipCity |DealershipState 	|DealershipZipcode 	|SHeight 	|SWeight 	|SPhoneType |SPhoneNum  	|TypeofCove	|Gender	|SGender|pdfEnable|
|NADA 		|Dr.  		|Jose		|Jordan |Texas  	|SYSDate-17Y/00M/00D 	|Manager   			|Mrs. 	|Marry 		|Jordan |SYSDate-53Y/11M/29D 	|SYSDate-16Y/11M/29D 	|SYSDate-55Y/01M/01D 	|10000  	|500000  	|100000  	|500000  	|100000  	|500000  	|20000  	|$10,000   		|200000  	|200000  	|Jeff  		|John  		|Father   		|20  	|Jenny  	|John  		|Other   		|25  	|John Foundation 	|02/20/2001 |Vicky  	|Jefferson 	|Spouse   		|100 	|Jon  		|Jovi  		|Father   		|100 	|Angie  	|Jovi  		|Mother   		|100 	|Lora  		|Harry  	|Other   		|100 	|100 	|100  		|128-75-1101 	|Married |12,Lime rd  	|SF  	|58979  	|Home  		|(127) 160-0006 |ZACK   		|4th Long Avenue 	|Fort Wayne  	|Texas    			|15634    			|5.3	  	|180  		|Home  		|(268) 458-7878	|New		|Male	|Female	|0|

@NADARegression_4
Scenario Outline:<NADASC04>Application Submission for Child only with all eligible products where member is Manager and Rider R19 

Given Test set up for "NYL" feature and "NYL_NADA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user
And Select YES Radio button of Membership
And Click on Child  
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"                      
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Clicks on next button
And Verify that error message is displayed as help us to display at top of the page
And Selects employment status as "<EmploymentStatus>"
And Clicks on next button
Then Product page details are displayed to user
And Verify for Child only MLI product is Available
And Selects product MLI for Child
And Clicks on next button
And Click YES for Dependent Coverage information
Then Request Coverage page is displayed to user 
And Selects Benefit Amount for Child as "<CBenefit>" under MLI
And Selects AD&D Rider for Child for MLI
And Clicks on next button
Then Contact Details page is displayed to user
And Selects Residential Radio Button
And Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<Gender>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Enters Dealership name as "<DealershipName>" and Dealership address as "<DealershipStreet>","<DealershipCity>","<DealershipState>","<DealershipZipcode>"
And Clicks on next button
Then Application Summary Page is displayed to user 
And Clicks on next button
Then Authorize page details are displayed to user
And Validates that Second I understand verbiage is not displayed in Read and Sign Box
And Validates that Authorization message is not displayed in Read and Sign Box
And Validates Consent message in Read and Sign Box for NonUW
And Validate Fraud Notice CT in Read and Sign Box
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
|website 	|Title   	|Fname   	|Lname   |State     	|DOB       				|Cfname |Clname  |CDOB       			|EmploymentStatus  	|CBenefit 	|SSN   			|Mstatus |Gender|Height |Weight |Street   		|City 	|Zipcode 	|PhoneType 	|PhoneNum  		|DealershipName |DealershipStreet 	|DealershipCity |DealershipState 	|DealershipZipcode 	|Csex|pdfEnable|
|NADA 		|Mr.  		|Robert 	|Spectre |Connecticut  	|SYSDate-17Y/00M/00D 	|Ron 	|Spectre |SYSDate-19Y/11M/29D 	|Manager    		|10000  	|598-26-1030 	|Married |Male 	|5.5 	|220 	|31,Bakers St 	|LA  	|89779  	|Home  		|(302) 597-2361 |Pearson Co. 	|54th street  		|Miami   		|Florida   			|32104    			|Male|0|

@NADARegression_5
Scenario Outline:<NADASC05>Application Submission for Self and Child only with all eligible products where member is Dealer (Benefitiary as maximum Primary Individuals and maximum Contingent individuals number)

Given Test set up for "NYL" feature and "NYL_NADA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user
And Select YES Radio button of Membership
And Click on Self
And Click on Child
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"                    
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Clicks on next button
And Verify that error message is displayed as help us to display at top of the page
And Selects employment status as "<EmploymentStatus>"
And Enter New State as "<State1>"
And Clicks on next button
And Verify that error message is displayed for state eligibility at top of the page
And Enter New State as "<State>"
And Clicks on next button
Then Product page details are displayed to user
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB1>"
And Clicks on next button
Then Product page details are displayed to user
And Verify Self is not displayed for GTDLI,TenYTL,TwentyYTL on product page
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB>"
And Verify Self is displayed for GTDLI,TenYTL,TwentyYTL on product page
And Clicks on next button
Then Product page details are displayed to user
And Verify Available Product List GTDLI,TenYTL,TwentyYTL
And Verify for Child only GTDLI product is Available
And Selects product GTDLI for Self
And Selects product GTDLI for Child
And Selects product TenYTL for Self
And Verify Child icon is not displayed for TenYTL
And Selects product TwentyYTL for Self
And Verify Child icon is not displayed for TwentyYTL
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
And Clicks on next button
Then Request Coverage page is displayed to user 
And Selects Type of Coverage as "<TypeofCove>" for Self for GTDLI
And Validates under GTDLI the Benefit Slider Range as "<RangeMin>" to "<RangeMax>" for self
And Selects Benefit Amount for Self as "<MaxBenefit>" under GTDLI
And Selects Optional AD&D Rider for Self for GTDLI
And Selects Optional AD&D Rider Benefit Amount as "<MaxRidBenefit>" for Self for GTDLI
And Selects Benefit Amount for Child as "<MaxCBenefit>" under GTDLI
And Selects Optional AD&D Rider for Child for GTDLI
And Selects Type of Coverage as "<TypeofCove>" for Self under TenYTL
And Validates under TenYTL the Benefit Slider Range as "<RangeMin1>" to "<RangeMax1>" for self
And Selects Benefit Amount for Self as "<MaxBenefit1>" under TenYTL
And Selects Type of Coverage as "<TypeofCove>" for Self under TwentyYTL
And Validates under TwentyYTL the Benefit Slider Range as "<RangeMin2>" to "<RangeMax2>"
And Selects Benefit Amount for Self as "<MaxBenefit2>" under TwentyYTL
And Clicks on next button
And Click YES for Dependent Coverage information
And Selects Benefit Amount for Self as "<Benefit>" under GTDLI
And Selects Optional AD&D Rider Benefit Amount as "<RidBenefit>" for Self for GTDLI
And Selects Benefit Amount for Child as "<CBenefit>" under GTDLI
And Selects Optional AD&D Rider for Child for GTDLI
And Selects Type of Coverage as "<TypeofCove>" for Self under TenYTL
And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
And Selects Type of Coverage as "<TypeofCove>" for Self under TwentyYTL
And Selects Benefit Amount for Self as "<Benefit2>" under TwentyYTL
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
And Validate Maximum Beneficiaries Error message
And Clicks on Close button
And Clicks on Edit button for first primary Beneficiary for Self for TenYTI
Then Add Beneficiary page will be displayed to user and User Enters Beneficiary details as "<Perc5>" for Individual Primary
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
And Validate Maximum Contingent Beneficiaries Error message
And Clicks on Close button
And Clicks on Edit button for first Contingent Beneficiary for Self for TenYTI
And Add Beneficiary page will be displayed to user and User Enters Beneficiary details as "<Perc11>" for Individual Contingent
And Clicks on OK button
And Clicks on next button
Then Contact Details page is displayed to user
And Selects No for Travel Question Non QD for Self
And Selects Residential Radio Button
And Verify mandatory field present Stock Owned
And Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Enters Dealership name as "<DealershipName>" and Dealership address as "<DealershipStreet>","<DealershipCity>","<DealershipState>","<DealershipZipcode>"
And Enters Stockowned Percentage as "<StockPerc>" in self
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
|website 	|Title   	|Fname   	|Lname   	|State     		|DOB       				|State1   		|DOB1     				|Cfname |Clname |CDOB       			|EmploymentStatus  	|RangeMin 	|RangeMax 	|RangeIncr 	|RangeMin1 	|RangeMax1 	|RangeIncr1 |RangeMin2 	|RangeMax2 	|RangeIncr2  	|Benefit |RidBenefit 	|CBenefit 	|Benefit1 	|Benefit2 	|Bfname |Blname |Relationship 	|Perc 	|Bfname1 	|Blname1 |Relationship1 |Perc1 	|Bfname2 	|Blname2 	|Relationship2 	|Perc2 	|Bfname3 	|Blname3 |Relationship3 |Perc3 	|Bfname4 	|Blname4 |Relationship4 |Perc4 	|Perc5 	|Bfname6 	|Blname6 	|Relationship6 	|Perc6  |Bfname7 	|Blname7 	|Relationship7 	|Perc7 	|Bfname8 	|Blname8 	|Relationship8 	|Perc8 	|Bfname9 	|Blname9 	|Relationship9 	|Perc9 	|Bfname10 	|Blname10 	|Relationship10 |Perc10 |Perc11  	|SSN   			|Mstatus |Gender|Height |Weight |Street   		|City 	|Zipcode 	|PhoneType 	|PhoneNum  		|DealershipName |StockPerc   	|DealershipStreet 	|DealershipCity |DealershipState 	|DealershipZipcode 	|Csex|TypeofCove|pdfEnable	|MaxBenefit	|MaxRidBenefit	|MaxBenefit1	|MaxBenefit2|MaxCBenefit|
|NADA 		|Mr.  		|Jim  		|Gallo  	|California  	|SYSDate-17Y/00M/00D 	|New Brunswick 	|SYSDate-16Y/11M/29D 	|Frank 	|Gallo 	|SYSDate-00Y/00M/00D 	|Dealer    			|50000  	|3000000 	|50000  	|200000  	|1000000 	|100000  	|200000  	|1000000 	|100000   		|100000  |$10,000  		|$10,000  	|200000  	|300000  	|George |Rose 	|Other   		|10  	|Ron  		|Weasley |Father   		|10  	|Jon  		|Smith  	|Spouse   		|10  	|John  		|Potter  |Father   		|10  	|Larry  	|Johnson |Mother   		|10  	|70  	|Marry  	|Jane  		|Daughter  		|10   	|Kim  		|Jane  		|Daughter  		|10  	|Mark  		|Jane  		|Son   			|10  	|Jenny  	|Keith  	|Other   		|10  	|Jackob  	|Khan  		|Father   		|10  	|70   		|145-77-0358 	|Married |Male 	|5.6	|180 	|12,Tamrind st 	|SF  	|58474  	|Home  		|(336) 149-3079 |ZACK   		|25     		|4th Long Avenue 	|Fort Wayne  	|Texas    			|15634   			|Male|New		|0			|3000000	|$300,000		|1000000		|1000000	|10000		|

@NADARegression_6
Scenario Outline:<NADASC06>Application Submission for Spouse and Child only with all eligible products where member is Employee (All Riders)(No Beneficiary)

Given Test set up for "NYL" feature and "NYL_NADA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user
And Select YES Radio button of Membership
And Click on Spouse
And Click on Child
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
And Select radio button Yes for Spouse is Member
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>" 
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Clicks on next button
And Verify that error message is displayed as help us to display at top of the page
And Selects employment status as "<EmploymentStatus>"
And Clicks on next button
And Verify Error Message for spouse to apply separately
And Select radio button NO for Spouse is Member
And Clicks on next button
Then Product page details are displayed to user
And Clicks on Back or Previous button
And Enters DOB for Spouse as "<SDOB1>"
And Clicks on next button
Then Product page details are displayed to user
And Verify Spouse is not displayed for ELI Product
And Clicks on Back or Previous button
And Enters DOB for Spouse as "<SDOB>"
And Clicks on next button
And Verify Spouse is displayed for ELI Product
And Clicks on Back or Previous button
And Clicks Edit button for Child Added
And Enters DOB for Child as "<CDOB1>"
And Click on Add Child button on Screen
And Clicks on next button
Then Product page details are displayed to user
And Verify Child is not displayed for ELI Product
And Clicks on Back or Previous button
And Clicks Edit button for Child Added
And Enters DOB for Child as "<CDOB>"
And Click on Add Child button on Screen
And Clicks on next button
And Verify Child is displayed for ELI Product
And Clicks on Back or Previous button
And Enter New State as "<State1>"
And Clicks on next button
And Verify that error message is displayed for state eligibility at top of the page
And Enter New State as "<State>"
And Clicks on next button
Then Product page details are displayed to user
And Verify Spouse is displayed for ELI Product
And Verify Child is displayed for ELI Product
And Selects ELI product for Spouse
And Selects ELI product for Child
And Clicks on next button
And Click YES for Dependent Coverage information
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
And Clicks on next button
Then Request Coverage page is displayed to user 
And Selects Type of Coverage as "<TypeofCove>" for Spouse under ELI
And Validates under ELI the Benefit Slider Range as "<SRangeMin>" to "<SRangeMax>" for Spouse
And Selects Benefit Amount for Spouse as "<SBenefit>" under ELI
And Selects Optional AD&D Rider for Spouse for ELI
And Selects Optional AD&D Rider Benefit Amount as "<SRidBenefit>" for Spouse for ELI
And Selects Benefit Amount for Child as "<CBenefit>" under ELI
And Selects Optional AD&D Rider for Child for ELI
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Skip Beneficiary Button
Then Contact Details page is displayed to user
And Selects Residential Radio Button
And Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<Gender>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Enters Dealership name as "<DealershipName>" and Dealership address as "<DealershipStreet>","<DealershipCity>","<DealershipState>","<DealershipZipcode>"
And Selects No for Travel Question Non QD for Spouse
And Enters contact Details for Spouse without SSN as "<SGender>","<SHeight>","<SWeight>","<SPhoneType>","<SPhoneNum>"
And Validates that SSN is optional for Spouse
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
|website 	|Title   	|Fname  |Lname  	|State     |DOB       			|Stitle |Sfname  	|Slname  |SDOB      			|Cfname |Clname  |CDOB      			|State1  	|SDOB1     				|CDOB1     				|EmploymentStatus  	|SRangeMin 	|SRangeMax 	|SRangeIncr  	|SBenefit 	|SRidBenefit 	|CBenefit 	|SSN   			|Mstatus |Street   		|City 	|Zipcode 	|PhoneType 	|PhoneNum  		|DealershipName |DealershipStreet 	|DealershipCity |DealershipState 	|DealershipZipcode 	|SHeight 	|SWeight 	|SPhoneType |SPhoneNum  	|Csex	|Gender	|SGender|pdfEnable	|TypeofCove|
|NADA 		|Dr.  		|Carlos |Aniston 	|Delaware  |SYSDate-17Y/00M/00D |Dr. 	|Jennifer 	|Aniston |SYSDate-17Y/00M/00D	|Jenny 	|Aniston |SYSDate-00Y/00M/00D	|Manitoba 	|SYSDate-100Y/00M/00D 	|SYSDate-21Y/00M/00D 	|Employee   		|10000  	|120000  	|10000   		|30000  	|$10,000   		|10000  	|308-65-3075 	|Married |16,PPT st  	|MJ  	|78039  	|Mobile  	|(308) 120-7806 |ZACK   		|4th Long Avenue 	|Fort Wayne  	|Texas    			|15634    			|5.6  		|180  		|Home  		|(268) 458-7878	|Female	|Male	|Female	|0			|New		|

@NADARegression_7
Scenario Outline:<NADASC07>Application Submission for Self,  Spouse, Child All eligible products and where member is Dealer (Maximum number of child) (No Riders)(Benefitiary more than 1 primary trust)

Given Test set up for "NYL" feature and "NYL_NADA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user
And Select YES Radio button of Membership
And Click on Self
And Click on Spouse
And Click on Child
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Selects employment status as "<EmploymentStatus>"
And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"                 
And Select radio button NO for Spouse is Member
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<CSex>" 
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname1>","<Clname1>","<CDOB1>","<CSex1>"
And Selects Married question as Yes for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname2>","<Clname2>","<CDOB2>","<CSex2>"
And Selects Married question as No for Child
And Selects Yes for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button 
Then Add Child Screen is displayed and Enters Child details as "<Cfname3>","<Clname3>","<CDOB3>","<CSex3>"
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
And Validates Add Child Button on Eligibility page is not present
And Clicks on next button
Then Product page details are displayed to user
And Clicks on Back or Previous button
And Enters DOB for Spouse as "<SDOB1>"
And Clicks on next button
Then Product page details are displayed to user
And Verify Spouse is not displayed for GTDLI,TenYTL,TwentyYTL on product page
And Clicks on Back or Previous button
And Enters DOB for Spouse as "<SDOB>"
And Clicks on next button
And Verify Spouse is displayed for GTDLI,TenYTL,TwentyYTL on product page
And Verify Available Product List GTDLI,TenYTL,TwentyYTL
And Verify for Child only GTDLI product is Available
And Selects product GTDLI for Self
And Selects product GTDLI for Spouse
And Selects product GTDLI for Child
And Selects product TenYTL for Self
And Selects product TenYTL for Spouse
And Verify Child icon is not displayed for TenYTL
And Selects product TwentyYTL for Self
And Selects product TwentyYTL for Spouse
And Verify Child icon is not displayed for TwentyYTL
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as No for Self and Spouse
And Clicks on next button
Then Request Coverage page is displayed to user 
And Selects Type of Coverage as "<TypeofCove>" for Self for GTDLI
And Selects Benefit Amount for Self as "<Benefit>" under GTDLI
And Selects Type of Coverage as "<TypeofCove>" for Spouse under GTDLI
And Selects Benefit Amount for Spouse as "<SBenefit>" under GTDLI
And Selects Benefit Amount for Child as "<Cbenefit>" under GTDLI
And Selects Type of Coverage as "<TypeofCove>" for Self under TenYTL
And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
And Selects Type of Coverage as "<TypeofCove>" for Spouse under TenYTL
And Selects Benefit Amount for Spouse as "<SBenefit1>" under TenYTL
And Selects Type of Coverage as "<TypeofCove>" for Self under TwentyYTL
And Selects Benefit Amount for Self as "<Benefit2>" under TwentyYTL
And Selects Type of Coverage as "<TypeofCove>" for Spouse under TwentyYTL
And Selects Benefit Amount for Spouse as "<SBenefit2>" under TwentyYTL
And Clicks on next button
And Verify Error Message in Spouse section for TwentyYrLI
And Selects Benefit Amount for Spouse as "<SBenefit3>" under TwentyYTL
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Self under TenYTL
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And User Enters Beneficiary details as "<Trust>","<Datetrust>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under TenYTL
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And User Enters Beneficiary details as "<Trust1>","<Datetrust1>"
And Clicks on OK button
And Validates error message on Add Beneficiary page-Only one Trust is allowed as Primary
And Clicks on Close button
And Clicks on next button
Then Contact Details page is displayed to user
And Selects No for Travel Question Non QD for Self
And Selects Residential Radio Button
And Verify mandatory field present Stock Owned
And Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender>","<MemID>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Enters Dealership name as "<DealershipName>" and Dealership address as "<DealershipStreet>","<DealershipCity>","<DealershipState>","<DealershipZipcode>"
And Enters Stockowned Percentage as "<StockPerc>" in self
And Selects No for Travel Question Non QD for Spouse
And Enters contact Details for Spouse without SSN as "<SGender>","<SHeight>","<SWeight>","<SPhoneType>","<SPhoneNum>"
And Clicks on next button
Then Application Summary Page is displayed to user 
And Validates Self as "<Fname>","<Lname>"
And Verify Benefit Amount for Self as "<Benefit1>" under TenYTL
And Verify Benefit Amount for Spouse as "<SBenefit1>" under TenYTL
And Verify Benefit Amount for Self as "<Benefit2>" under TwentyYTL
And Verify Benefit Amount for Spouse as "<SBenefit3>" under TwentyYTL
And Verify Benefit Amount for Self as "<Benefit>" under GTDLI
And Validates Spouse as "<Sfname>","<Slname>"
And Verify Benefit Amount for Spouse as "<SBenefit>" under GTDLI
And Verify Child Firstname and Lastname as "<Cfname>","<Clname>"
And Verify Benefit Amount for First child as "<Cbenefit>" under GTDLI
And Verify Child Firstname and Lastname as "<Cfname2>","<Clname2>"
And Verify Benefit Amount for Second child as "<Cbenefit>" under GTDLI
And Verify Child Firstname and Lastname as "<Cfname5>","<Clname5>"
And Verify Benefit Amount for Third child as "<Cbenefit>" under GTDLI
And Verify Child Firstname and Lastname as "<Cfname7>","<Clname7>"
And Verify Benefit Amount for Fourth child as "<Cbenefit>" under GTDLI
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
|website 	|Title   	|Fname  |Lname |State     	|DOB       				|EmploymentStatus 	|Stitle |Sfname |Slname |SDOB       			|SDOB1     				|Cfname |Clname |CDOB     				|Cfname1 	|Clname1 	|CDOB1     				|Cfname2 	|Clname2 	|CDOB2     				|Cfname3 |Clname3 	|CDOB3     				|Cfname4 |Clname4 	|CDOB4     				|Cfname5 	|Clname5 	|CDOB5     				|Cfname6  	|Clname6 	|CDOB6     				|Cfname7 	|Clname7 	|CDOB7      			|Benefit |SBenefit 	|Cbenefit 	|Benefit1 	|SBenefit1  |Benefit2 	|SBenefit2 	|SBenefit3 	|Trust  	|Datetrust 	|Trust1  	|Datetrust1  |SSN   		|Mstatus |Gender  	|Height |Weight |Street   		|City 	|Zipcode 	|PhoneType 	|PhoneNum  		|DealershipName  	|StockPerc 	|DealershipStreet 	|DealershipCity |DealershipState 	|DealershipZipcode 	|SGender |SHeight 	|SWeight 	|SPhoneType |SPhoneNum  	|CSex|CSex1	|CSex2	|CSex3	|Csex4	|CSex5	|CSex6	|Csex7	|TypeofCove	|pdfEnable	|MemID    |
|NADA 		|Prof.  	|Heith  |Jones |Connecticut |SYSDate-17Y/00M/00D 	|Dealer    			|Dr. 	|Gina 	|Jones 	|SYSDate-17Y/00M/00D 	|SYSDate-16Y/11M/29D 	|Larry 	|Jones 	|SYSDate-00Y/00M/00D	|Marry  	|Jones  	|SYSDate-19Y/11M/29D 	|Nick  		|Jones  	|SYSDate-24Y/11M/29D 	|Enrique |Jones  	|SYSDate-26Y/00M/00D 	|Ariana  |Jones  	|SYSDate-21Y/00M/00D 	|Perry  	|Jones  	|SYSDate-21Y/00M/00D 	|Indiana 	|Jones  	|SYSDate-26Y/00M/00D 	|Lucy  		|Jones  	|SYSDate-19Y/11M/29D 	|700000  |100000  	|10000  	|300000  	|100000  	|300000  	|350000  	|150000  	|GNR Trust 	|01/06/1985 |MNC Group 	|11/09/1990  |308-85-1101 	|Married |Male  	|5.5 	|180 	|52,Mainland 	|SF  	|58979  	|Business 	|(908) 160-0006 |ZACK    			|50   		|4th Long Avenue 	|Fort Wayne  	|Texas    			|15634    			|Female  |5.3  		|172  		|Home  		|(772) 607-5279	|Male|Female|Male	|Male	|Female	|Male	|Male	|Female	|New		|0			|564156406141054 |

@NADARegression_8
Scenario Outline:<NADASC08>Validation Read & Sign Page with 21 different States one by one in loop
(All Validations done on Authorization and Consent Page)"

Given Test set up for "NYL" feature and "NYL_NADA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user
And Select YES Radio button of Membership
And Click on Self 
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Selects employment status as "<EmploymentStatus>"
And Clicks on next button
Then Product page details are displayed to user
And Verify Available Product List GTDLI,TenYTL,TwentyYTL
And Selects product GTDLI for Self
And Selects product TenYTL for Self
And Selects product TwentyYTL for Self
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self	
And Clicks on next button
Then Request Coverage page is displayed to user 
And Selects Type of Coverage as "<TypeofCove>" for Self for GTDLI
And Selects Benefit Amount for Self as "<Benefit>" under GTDLI
And Selects Type of Coverage as "<TypeofCove>" for Self under TenYTL
And Selects Benefit Amount for Self as "<Benefit1>" under TenYTL
And Selects Type of Coverage as "<TypeofCove>" for Self under TwentyYTL
And Selects Benefit Amount for Self as "<Benefit2>" under TwentyYTL
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Self under TenYTL
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And User Enters Beneficiary details as "<Trust>","<Datetrust>"
And Clicks on OK button
And Clicks on Skip Beneficiary Button
And Delete box is displayed and clicks on Yes
Then Contact Details page is displayed to user
And Selects No for Travel Question Non QD for Self
And Selects Business Address Radio Button for Send Correspondence To
And Selects NO Radio Button for Business Address
And Enter Business Address Details as "<BusinessStreet>","<BusinessCity>","<BusinessState>","<BusinessZip>"
And Verify mandatory field present Stock Owned
And Enters Business Details as "<BusinessName>","<BusinessType>"
And Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Enters Stockowned Percentage as "<StockPerc>" in self
And Enters Dealership name as "<DealershipName>" and Dealership address as "<DealershipStreet>","<DealershipCity>","<DealershipState>","<DealershipZipcode>"
And Clicks on next button
Then Application Summary Page is displayed to user 
And Clicks on next button
Then Authorize page details are displayed to user and confirm the term and conditions for Self
Then Authorize page details are displayed to user
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
And Clicks on next button
And Validate Fraud Notice VA in Read and Sign Box
And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario>","<pdfEnable>","<pdfName>"
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
And Validate Fraud Notice NM in Read and Sign Box
And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario1>","<pdfEnable>","<pdfName1>"
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
And Validate Authorization Message MN in Read and Sign Box

Examples:
|website 	|Title   	|Fname    	|Lname   	|State     		|DOB       				|EmploymentStatus 	|Benefit |Benefit1 	|Benefit2 	|Trust   		|Datetrust 	|BusinessName  		|BusinessType 	|SSN   			|Mstatus 	|Email    			|Height |Weight |Street   		|City 	|Zipcode 	|PhoneType 	|PhoneNum  		|DealershipName |StockPerc  |DealershipStreet 	|DealershipCity |DealershipState 	|DealershipZipcode 	|State1  	|State2   		|State3  |State4  	|State5  	|State6   		|State7   		|State8  	|State9     			|State10 |State11 |State12 	|State13 	|State14 	|State15 	|State16 	|State17  		|State18 	|State19 	|State20 	|TypeofCove	|Gender	|BusinessStreet	|BusinessCity	|BusinessState	|BusinessZip|pdfScenario|pdfScenario1|pdfEnable|pdfName                               |pdfName1                  |
|NADA 		|Prof.  	|Jonathan  	|Marshall 	|Connecticut 	|SYSDate-17Y/00M/00D 	|Dealer    			|450000  |300000  	|300000  	|GNR Foundation |01/11/1980 |Bridgedown Traders |Corporation 	|548-71-4444 	|Divorced 	|jmarshall@kkl.com 	|6.1 	|210 	|21,Bakers st 	|LA  	|54512  	|Mobile  	|(451) 745-6451 |Pearson Co. 	|52    		|54th street  		|Miami   		|Florida   			|32104    			|Colorado 	|California  	|Alabama |Arkansas 	|Louisiana 	|Pennsylvania 	|Rhode Island 	|Maryland 	|District of Columbia 	|Florida |Kansas  |Maine  	|New Jersey |New York 	|Oklahoma 	|Tennessee 	|Washington  	|Virginia 	|New Mexico |Minnesota 	|New		|Male	|101 Street		|MJ				|Texas			|78039		|NADA08_VA  |NADA08_NM   |1        |Important Notice All except NM 2 08.12|Important Notice NM 2 08.12|

