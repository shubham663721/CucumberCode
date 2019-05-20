Feature: OMA Test 

@OMARegression_1
Scenario Outline: <OMA_SC01> Application submission for Self, Spouse and with all the products and rider(s)

Given Test set up for "NYL" feature and "NYL_OMA" scenario
Given Customer navigate to NYL "<website>"
And Select Association from Drop down value as "<Association>"
When Clicks on Apply now button 
Then Eligibility page details are displayed to user 
Then Click on Self
And Enter details for self as "<Title>","<Fname>","<Lname>","<Province>","<DOB16>"
And Select NO for Association Membership 
And Validate that NEXT button is Disabled
And Select YES Radio button of Membership 
And Validate that NEXT button is Enabled
And Selects Career Stage as "<Career>"
And Selects Began Undergraduate medical studies date and place as "<Date>","<Place>"
And Selects Expect to Complete Undergraduate medical studies date as "<CompletionDate>"
Then Click on Spouse
And Enter details for Spouse as "<STitle>","<SFname>","<SLname>","<DOB17>"
And Select radio button Yes for Spouse is Member  
And Validate that NEXT button is Disabled
And Select radio button NO for Spouse is Member
And Clicks on next button
Then Product page details are displayed to user 
And Validate the following products are displayed: GTLP75I,Flex10,Flex20
And Verify Available Products for Spouse as GTLP75I,Flex10,Flex20
And Navigate back to Eligibility page
And Enters DOB for Self as "<DOB17>"
And Enters DOB for Spouse as "<DOB16>"
And Clicks on next button
Then Product page details are displayed to user 
And Validate the following products are displayed: GTLP75I,Flex10,Flex20
And Validates that Self is displayed for GTLP75I,Flex10,Flex20
And Navigate back to Eligibility page
And Enters DOB for Self as "<DOB16>"
And Clicks on next button
And Validate Age Restriction Message
And Enters DOB for Self as "<DOB65>"
And Enters DOB for Spouse as "<DOB64>"
And Clicks on next button
Then Product page details are displayed to user
And Verify Available Product: Flex10
And Validates the following products are not displayed: GTLP75I,Flex20
And Validates that Spouse is displayed for Flex10
And Navigate back to Eligibility page
And Enters DOB for Self as "<DOB64>"
And Enters DOB for Spouse as "<DOB65>"
And Clicks on next button
Then Product page details are displayed to user
And Verify Available Product: Flex10
And Validates that Self is displayed for Flex10
And Validates the following products are not displayed: GTLP75I,Flex20
And Navigate back to Eligibility page
And Enters DOB for Self as "<DOB65>"
And Clicks on next button
And Validate Age Restriction Message
And Enters DOB for Self as "<DOB64>"
And Enters DOB for Spouse as "<DOB64>"
And Clicks on next button
Then Product page details are displayed to user
And Verify Available Product: Flex10
And Validates that Self is displayed for Flex10
And Validates that Spouse is displayed for Flex10
And Validates the following products are not displayed: GTLP75I,Flex20
And Selects product Flex10 for Self
And Selects product Flex10 for Spouse
And Clicks on next button
And Verify that optional Rider AD is displayed for Self under Flex10
And Verify that optional Rider AD is displayed for Spouse under Flex10 
And Verify that optional Rider WOP is not displayed for Self under Flex10
And Navigate back to Eligibility page
And Enters DOB for Self as "<DOB54>"
And Enters DOB for Spouse as "<DOB54>"
And Clicks on next button
Then Product page details are displayed to user
And Validate the following products are displayed: GTLP75I,Flex10,Flex20
And Validates that Self is displayed for GTLP75I,Flex10,Flex20
And Verify Available Products for Spouse as GTLP75I,Flex10,Flex20
And Navigate back to Eligibility page
And Enters DOB for Self as "<DOB55>"
And Enters DOB for Spouse as "<DOB55>"
And Clicks on next button
Then Product page details are displayed to user
And Validate the following products are displayed: GTLP75I,Flex10
And Validates Flex20 products are not displayed
And Validates that Self is displayed for GTLP75I
And Verify Available Products for Spouse as GTLP75I
And Validates that Self is displayed for Flex10
And Validates that Spouse is displayed for Flex10
And Navigate back to Eligibility page
And Enters DOB for Self as "<DOB59>"
And Enters DOB for Spouse as "<DOB59>"
And Clicks on next button
Then Product page details are displayed to user
And Validate the following products are displayed: GTLP75I,Flex10
And Validates Flex20 products are not displayed
And Validates that Self is displayed for GTLP75I
And Verify Available Products for Spouse as GTLP75I
And Validates that Self is displayed for Flex10
And Validates that Spouse is displayed for Flex10
And Selects product GTLP75I for Self 
And Selects product GTLP75I for Spouse
And Selects product Flex10 for Self 
And Selects product Flex10 for Spouse
And Clicks on next button
And Clicks on OK Button on Dependent Coverage Window
And Verify that optional Rider AD is displayed for Self under GTLP75I
And Verify that optional Rider AD is displayed for Spouse under GTLP75I
And Verify that optional Rider WOP is displayed for Self under GTLP75I
And Verify that optional Rider AD is displayed for Self under Flex10
And Verify that optional Rider AD is displayed for Spouse under Flex10 
And Verify that optional Rider WOP is displayed for Self under Flex10
And Navigate back to Eligibility page 
And Enters DOB for Self as "<DOB60>"
And Enters DOB for Spouse as "<DOB60>"
And Clicks on next button
Then Product page details are displayed to user
And Verify Available Product: Flex10
And Validates the following products are not displayed: GTLP75I,Flex20
And Validates that Self is displayed for Flex10
And Validates that Spouse is displayed for Flex10
And Navigate back to Eligibility page 
And Enters DOB for Self as "<DOB17>"
And Enters DOB for Spouse as "<DOB17>"
And Clicks on next button
And Navigate back to Eligibility page 
And Enter New State as "<Province>"
And Clicks on next button
Then Product page details are displayed to user
#And Selects product GTLP75I for Self 
#And Selects product GTLP75I for Spouse
And Selects product Flex10 for Self 
And Selects product Flex10 for Spouse
And Selects product Flex20 for Self
And Selects product Flex20 for Spouse
And Clicks on next button
And Clicks on OK Button on Dependent Coverage Window
Then Request Coverage page is displayed to user
And Validates under GTLP75I the Benefit Slider Range for Self as "<MinTermTL>" to "<MaxTermTL>"
And Validates under GTLP75I for Spouse the Benefit Slider Range for Spouse as "<MinTermTL>" to "<MaxTermTL>"
And Validates under Flex10 the Benefit Slider Range as "<MinF10>" to "<MaxF10>" for Self
And Validates under Flex10 the Benefit Slider Range as "<MinF10>" to "<MaxF10>" for Spouse
And Validates under Flex20 the Benefit Slider Range as "<MinF20>" to "<MaxF20>" for Self
And Validates under Flex20 for Spouse the Benefit Slider Range as "<MinF20>" to "<MaxF20>"
And Selects Benefit Amount for Self as "<Benefit>" under GTLP75I
And Selects Benefit Amount for Spouse as "<MinTermTL>" under GTLP75I
And Selects Benefit Amount for Self as "<Benefit1>" under Flex10
And Selects Benefit Amount for Spouse as "<MinF10>" under Flex10
And Selects Benefit Amount for Self as "<Benefit2error>" under Flex20
And Selects Benefit Amount for Spouse as "<MinF20>" under Flex20
And Clicks on next button
And Validate Max Aggregate error message
And Selects Benefit Amount for Self as "<Benefit2>" under Flex20
And Selects Optional Rider as AD for Self under GTLP75I
And Selects Benefit Amount for Self as "<ADBenefitTL>" for Optional Rider as AD under GTLP75I
And Validates AD under GTLP75I the Benefit Slider Range for Self as "<MinAD>" to "<MaxAD>"
And Selects Optional Rider as WOP for Self under GTLP75I
And Selects Optional Rider as AD for Self under Flex10
And Selects Benefit Amount for Self as "<ADBenefitF10>" for Optional Rider as AD under Flex10
And Validates AD under Flex10 the Benefit Slider Range for Self as "<MinAD>" to "<MaxAD>"
And Selects Optional Rider as WOP for Self under Flex10
And Selects Optional Rider as AD for Self under Flex20
And Selects Benefit Amount for Self as "<ADBenefitF20>" for Optional Rider as AD under Flex20
And Validates AD under Flex20 the Benefit Slider Range for Self as "<MinAD>" to "<MaxAD>"
And Selects Optional Rider as WOP for Self under Flex20
And Clicks on next button
Then Interim Insurance page is displayed to user 
And Clicks on Back or Previous button
And Selects Benefit Amount for Spouse as "<SBenefit>" under GTLP75I
And Selects Benefit Amount for Spouse as "<SBenefit1error>" under Flex10
And Selects Benefit Amount for Spouse as "<SBenefit2>" under Flex20
And Clicks on next button
And Validate Max Aggregate error message
And Selects Benefit Amount for Spouse as "<SBenefit1>" under Flex10
And Selects Optional Rider as AD for Spouse under GTLP75I
And Selects Benefit Amount for Spouse as "<AD_SBenefitTL>" for Optional Rider as AD under GTLP75I
And Validates AD under GTLP75I the Benefit Slider Range for Spouse as "<MinAD>" to "<MaxAD>"
And Selects Optional Rider as AD for Spouse under Flex10
And Selects Benefit Amount for Spouse as "<AD_SBenefitF10Error>" for Optional Rider as AD under Flex10
And Validates AD under Flex10 the Benefit Slider Range for Spouse as "<MinAD>" to "<MaxAD>"
And Selects Optional Rider as AD for Spouse under Flex20
And Selects Benefit Amount for Spouse as "<AD_SBenefitF20>" for Optional Rider as AD under Flex20
And Validates AD under Flex20 the Benefit Slider Range for Spouse as "<MinAD>" to "<MaxAD>"
And Clicks on next button
And verify that error message is displayed for Spouse under Flex10
#Spouse AD&D benefit amount cannot exceed member benefit amount.
And Selects Benefit Amount for Spouse as "<AD_SBenefitF10>" for Optional Rider as AD under Flex10
And Clicks on next button
Then Interim Insurance page is displayed to user 
And Clicks on I do not wish to request Interim Insurance 
Then Terminate or Reduce Coverage page is displayed to user
And Clicks I do not wish to Terminate or Reduce Coverage 
Then Transfer Ownership page is displayed to user
And Clicks I do not wish to Transfer Ownership
Then Applicant Details Page is displayed to user
And Enters Contact Details for Self without SSN,Marital Status,Height and Weight as "<Sex>","<MemberID>","<Street>","<City>","<Postcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page 
And Selects Yes for Travel Question Non QD for Self
And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>"
And Selects Yes Radio button for Nicotine Question for Self
And Validates How Long Used Text box and Last Used Date Textbox is displayed for Self
And Enters How Long used Details for self as "<HowLong>"
And Enters Last Used Tobacco or Nicotine Date Details for Self as "<TobDate>"
And Selects Residential Radio Button
And Enters Details for Spouse like Gender,Phone type and Phone number "<Spouse_Sex>","<SPhoneType>","<SPhoneNum>" 
And Selects Yes for Travel Question Non QD for Spouse 
And Enters details for Spouse as "<SCountry>","<SMonths>"
And Selects Yes Radio button for Nicotine Question for Spouse
And Validates How Long Used Text box and Last Used Date Textbox is displayed for Spouse
And Enters How Long used Details for spouse as "<SHowLong>"
And Enters Last Used Tobacco or Nicotine Date Details for Spouse as "<STobDate>"
And Clicks on next button
Then Application Summary Page is displayed to user
And Verify Benefit Amount for Self as "<Benefit>" under TermLife
And Verify Benefit Amount for Self as "<Benefit1>" under Flex10
And Verify Benefit Amount for Self as "<Benefit2>" under Flex20
And Verify Riders Accidental Death & Dismemberment for Self as "<ADBenefitTL>" under GTLP75I
And Verify Riders Accidental Death & Dismemberment for Self as "<ADBenefitF10>" under Flex10
And Verify Riders Accidental Death & Dismemberment for Self as "<ADBenefitF20>" under Flex20
And Verify Waiver of Premium Rider for Self under GTLP75I as YES
And Verify Waiver of Premium Rider for Self under Flex10 as YES
And Verify Waiver of Premium Rider for Self under Flex20 as YES
And Verify Benefit Amount for Spouse as "<SBenefit>" under TermLife
And Verify Benefit Amount for Spouse as "<SBenefit1>" under Flex10
And Verify Benefit Amount for Spouse as "<SBenefit2>" under Flex20
And Verify Riders Accidental Death & Dismemberment for Spouse as "<AD_SBenefitTL>" under GTLP75I
And Verify Riders Accidental Death & Dismemberment for Spouse as "<AD_SBenefitF10>" under Flex10
And Verify Riders Accidental Death & Dismemberment for Spouse as "<AD_SBenefitF20>" under Flex20
And Clicks on next button
Then Payment Information Page is displayed to user and user Selects Payment option as Bank for Group Term Life Product
And Select Yes Radio button for account holder
And User enters Details for Bank Account as "<NameAcc>","<Tnum>","<Inum>","<Anum>"
And Clicks on Save button
And Selects Frequency for Group Term Life Product and reviews "<FrequencyTL>"
And Validates Estimated Premium for Self under GTLP75I as "<MpremiumTL>" 
And Validates Estimated Premium for Spouse under GTLP75I as "<SpremiumTL>"
And Validates Estimated Premium for Tax under GTLP75I as "<PTaxTL>"
And Validates Total Premium under GTLP75I as "<TPremTL>"
And Payment Information Page is displayed to user and user Selects Payment option as Credit card for Flex10 Product
And User enters Details for Card as "<Fname>","<Lname>","<Cardnum>","<ExpDate>"
And Clicks on Save button
And Selects Frequency for Flex10 Product and reviews "<FrequencyF10>"
And Validates Estimated Premium for Self under Flex10 as "<MpremiumF10>"
And Validates Estimated Premium for Spouse under Flex10 as "<SpremiumF10>"
And Validates Estimated Premium for Tax under Flex10 as "<PTaxF10>"
And Validates Total Premium under Flex10 as "<TPremF10>"

And Selects Payment Method for Flex20
And Selects Existing Bank Account 
And Clicks on Save button
And Selects Frequency for Flex20 Product and reviews "<FrequencyF20>"
And Validates Estimated Premium for Self under Flex20 as "<MpremiumF20>"
And Validates Estimated Premium for Spouse under Flex20 as "<SpremiumF20>"
And Validates Estimated Premium for Tax under Flex20 as "<PTaxF20>"
And Validates Total Premium under Flex20 as "<TPremF20>"
And Confirms I have read the Information Check Box on Payment Page
And Confirms I authorize sunlife Check Box on Payment Page
And Clicks on next button
Then Submit Application is displayed to user and confirms the terms for Self
Then Submit Application is displayed to user and confirms the terms for Spouse
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish 
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Thank you page is displayed to user 
And Verify that Confirmation number is generated for "<website>" 

Examples:
|website |Association                                    |Title |Fname  | Lname| Province  |DOB16       | Career         | Date      | Place       |CompletionDate | STitle | SFname| SLname |  DOB65     | DOB64      | DOB54      | DOB55      |DOB59    		|DOB60    		| DOB17     	| MinTermTL | MaxTermTL | MinF10    | MaxF10     |MinF20     | MaxF20    | Benefit   | Benefit1  | Benefit2error | Benefit2  | ADBenefitTL | ADBenefitF10 | ADBenefitF20 | MinAD   | MaxAD   | SBenefit  | SBenefit1error | SBenefit2  | SBenefit1 | AD_SBenefitTL | AD_SBenefitF10Error | AD_SBenefitF20 | AD_SBenefitF10 |  Sex | MemberID    | Street           | City       | Postcode | PhoneType | PhoneNum   | Country | Months | HowLong | TobDate | Spouse_Sex | SPhoneType | SPhoneNum  | SCountry | SMonths | SHowLong | STobDate  | NameAcc   | Tnum | Inum | Anum         | FrequencyTL |  MpremiumTL |  SpremiumTL  | PTaxTL   | TPremTL   | Cardnum          | ExpDate| FrequencyF10         |  MpremiumF10 |  SpremiumF10  | PTaxF10   | TPremF10  | FrequencyF20       |  MpremiumF20 |  SpremiumF20  | PTaxF20 | TPremF20|
|oma     |MSPEI - Medical Society of Prince Edward Island|Mr.   | Oliver| Jones|  Ontario  | 01/09/2002 | Medical Student| 01/11/2017| Nova Scotia | 01/11/2022    | Mrs.   | Karen | jones  | 01/09/1952 | 01/09/1954 | 01/09/1964 | 01/09/1963 | 01/09/1959 	| 01/09/1958 	| 01/09/2001 	| 100,000   |  1,000,000| 100,000   | 3,000,000  | 100,000   | 3,000,000 | 1,000,000 | 3,000,000 | 1,025,000     | 1,000,000 | 500,000     | 250,000      | 50,000       | 50,000  | 500,000 | 1,000,000 | 1,025,000      | 3,000,000  | 1,000,000 | 500,000       | 300,000             | 50,000         | 200,000        | Male | 65214789636 |7 Illinois Avenue | Manitoulin |  K1A 0B1 | Mobile    | 5560465465 | China   | 8      |    1    | 10/2018 |  Female    | Home       | 2546320147 | Jordan   | 12      | 0        | 12/2017   | Oliver J  | 24564| 564  | 987498756045 | Annually    | $ 1,060.00  | $ 620.00     | $ 134.40 | $ 1,814.00| 4444090101010103 | 10/25  | Monthly on the 1st   |   $275.00    | 47.20         | 25.78     |347.98     | Monthly on the 1st |  97.80       |  153.40       | 20.10   | 271.30  |   

@OMARegression_2
Scenario Outline: <OMA_SC02> Application submission for Self only with Flex10 & Flex20 product with Rider

Given Test set up for "NYL" feature and "NYL_OMA" scenario
Given Customer navigate to NYL "<website>"
And Select Association from Drop down value as "<Association>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user 
Then Click on Self
And Enter details for self as "<Title>","<Fname>","<Lname>","<Province>","<DOB54>"
And Select YES Radio button of Membership 
And Selects Career Stage as "<Career>"
And Clicks on next button
Then Product page details are displayed to user
And Clicks on next button
And Validate Error Message on Product Page
And Selects product Flex10 for Self 
And Selects product Flex20 for Self
And Clicks on next button
Then Request Coverage page is displayed to user
And Selects Benefit Amount for Self as "<Benefiterror>" under Flex10 
And Selects Optional Rider as AD for Self under Flex10
And Selects Benefit Amount for Self as "<ADBenefitF10>" for Optional Rider as AD under Flex10
And Clicks on next button
And verify that error message is displayed under AD benefit amount for Flex10

And Selects Benefit Amount for Self as "<Benefit1>" under Flex10
And Selects Benefit Amount for Self as "<Benefit2>" under Flex20
And Selects Optional Rider as WOP for Self under Flex20
And Clicks on next button
Then Interim Insurance page is displayed to user
And Select Self icon for Interim
And Select No for all Health Statement questions
And Select Flex-10 radio button to Apply for Interim insurance
And Confirms the agreement for Interim insurance
And verify the link I do not wish to request Interim Insurance is displayed
And Clicks on next button

Then Terminate or Reduce Coverage page is displayed to user
And Checks the box for following coverage be terminated
And Select Radio button Terminate all coverage for Coverage under Policy G-3900-0
And verify the link I do not wish to Terminate or Reduce Coverage is displayed
And Clicks on next button

Then Transfer Ownership page is displayed to user
And Select Self icon for Transfer Ownership and select checkbox for Flex-10
And Select Company for Owner and enter details as "<Compname>","<BusinessNo>","<CFname>","<CLname>","<CAddress>","<CCity>","<CProvince>","<CPostCode>","<Cphone>"
And verify the link I do not wish to Transfer Ownership is displayed
And Clicks on next button
Then Applicant Details Page is displayed to user
And Enters Details for Self as "<Sex>","<Street>","<City>","<Postcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page 
And Selects No for Travel Question Non QD for Self
And Selects No Radio button for Nicotine Question for Self
And Selects Business Address Radio Button for Send Correspondence To
And Selects NO Radio Button for Business Address 
And Enters Business Details as "<BName>","<BType>"
And Enter Business Address Details as "<BAddress>","<Bcity>","<Bprovince>","<Bpostcode>"
And Clicks on button to Save for later
Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>" 
And Clicks OK Button Save For Later
Then Refresh the browser
Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive
And Clicks on next button
Then Application Summary Page is displayed to user
And Verify that the Rider amount is displayed as "<ADBenefitF10>" for Accidental Death & Dismemberment under Flex10 product
And Clicks on next button
Then Payment Information Page is displayed to user and user Selects Payment option as Bank Account for F10 Product
And Select No Radio button for account holder and Click on Ok
And Selects Frequency for Flex10 Product and reviews "<FrequencyF10>"
And Validates Estimated Premium for Self as "<MpremiumF10>"
And user Clicks on Select Payment Method as Credit Card for F20 Product
And Enter Card Details as "<Fname>","<Lname>","<Cardnum>","<ExpDate>"
And Clicks on Save button
And Selects Frequency for Flex20 Product and reviews "<FrequencyF20>"
And Validates Estimated Premium for Self as "<MpremiumF20>"
And validate the Credit Card paragraph is displayed
And Clicks on next button
Then Submit Application is displayed to user and confirms the terms for Self
And Validates Member only paragraph in Read & Sign box
And Validates Declaration by Spouse paragraph in Read & Sign box
And Validates Member and Spouse paragraph in Read & Sign box
And Validates INTERIM INSURANCE paragraph in Read & Sign box
And Validate Authorization message in Read and Sign Box
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish 
Then Thank you page is displayed to user 
And Verify that Confirmation number is generated for "<website>" 

Examples:
|website|Association                                           |Title|Fname  |Lname   |Province     |DOB54      | Career                          | Benefiterror| ADBenefitF10 | Benefit1 | Benefit2 | Compname  | BusinessNo | CFname | CLname | CAddress       | CCity         |CProvince             | CPostCode | Cphone     | Sex   | Street           |  City  | Postcode  | PhoneType  | PhoneNum  | BName            | BType        | BAddress        | Bcity | Bprovince            | Bpostcode |Password   | VPassword | FrequencyF10      | MpremiumF10 |  Cardnum        | ExpDate | FrequencyF20     |  MpremiumF20 | 
|oma    | NLMA - Newfoundland and Labrador Medical Association | Mr. | Robert| Wilson | Nova Scotia |01/09/1964 | Established Physician (6+ Years)| 100,000     | 150,000      | 2,000,000| 500,000  | Tisca ltd.| 203213251  | Adam   | Gill   | 228 Park Ave S | Charlottetown | Prince Edward island |  C1A 1B6  | 0654564650 | Female|1/2 MAIN STREET NW|MONTREAL|H3Z 2Y7    | Home       |2514069874 | Nurturing plants |  Partnership | Inverness, Subd | Canada| Prince Edward Island | NS B0E 2C0| Test@123  | Test@123  | Monthly on the 1st| $286.20     | 4444090101010103| 10/22   |Monthly on the 1st| $208.60      |       