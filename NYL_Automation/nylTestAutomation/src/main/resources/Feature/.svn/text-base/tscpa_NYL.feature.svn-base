Feature: TSCPA Test

@TscpaRegression_1
Scenario Outline: <TSCPA01> Application Submission for Self,  Spouse, Child All eligible products (No benes)    

Given Test set up for "NYL" feature and "NYL_TSCPA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user 
And Click on Self 
And Click on Spouse  
And Click on Child 
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Select eligibility status as "<Estatus>"
And Enters Self WorkHr as "<WorkHr>"
And Select YES Radio button of Membership
And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
And Select radio button NO for Spouse is Member
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Clicks on next button
Then Product page details are displayed to user 
And Selects product GTLI for Self
And Selects product GTLI for Spouse
And Selects product GTLI for Child
And Selects product GTenYTL for Self
And Selects product GTenYTL for Spouse
And Verify Child icon is disabled for GTenYTL
And Selects product GDII for Self
And Selects product GHII for Self
And Selects product GHII for Spouse
And Selects product GHII for Child
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse 
And Enters Monthly Income for Self as "<MonthlyIncome>"
And Clicks on next button
Then Validate error message for required question
And Validate Imp Replacement Info text for NewYork state
And Confirms Imp Replacement Info for NewYork state	
And Selects Yes for Do you have other life insurance in force for Self
And Selects Yes for life insurance applied for intended to replace for Self
And Verify New York State paragraph is displayed for Self
And Selects Yes for Do you have other insurance pending for Self
And Enter additional details as "<TotalAmt>","<IndAmt>","<Cname>"
And Selects Yes for Do you have other life insurance in force for Spouse
And Selects Yes for life insurance applied for intended to replace for Spouse
And Verify New York State paragraph is displayed for Spouse
And Selects Yes for Do you have other insurance pending for Spouse
And Enter additional details as "<STotalAmt>","<SIndAmt>","<SCname>" for Spouse
And Selects Yes for unable to work because of a disability for Self
And Clicks on Add Company Button
And Enters details for Company "<ACname>","<ACBamount>","<ACBperiod>" and click on add button
And Selects Yes for replace any other company's coverage for Self
And Enters Amount under replace any other company's coverage as "<Ramount>"
And Clicks on next button
Then Request Coverage page is displayed to user
And Selects Type of Coverage as "<TypeofCove>" for Self under GTLI 
And Selects Benefit Amount for Self as "<Benefit>" under GTLI 
And Selects Type of Coverage as "<TypeofCove>" for Spouse under GTLI
And Selects Benefit Amount for Spouse as "<SBenefit>" under GTLI 
And Selects Benefit Amount for Child as "<BenAmount>" under GTLI 
And Selects Type of Coverage as "<TypeofCove>" for Self under GTenYTL
And Selects Benefit Amount for Self as "<Benefit1>" under GTenYTL
And Selects Type of Coverage as "<TypeofCove>" for Spouse under GTenYTL
And Selects Benefit Amount for Spouse as "<SBenefit1>" under GTenYTL
And Validate Maximum Monthly Benefit Amount for Self as "<MaxMBenefit>" under GDII
And Selects Type of Coverage as "<TypeofCove>" for Self under GDII
And Selects Waiting Period for Self as "<Waitperiod>" under GDII
And Selects Benefit Option for Self as "<BenOpt>" under GDII
And Selects Benefit Amount for Self as "<Benefit2>" under GDII
And Selects Type of Coverage as "<TypeofCove>" for Self under GHII
And Selects Benefit Amount for Self as "<BenOpt1>" under GHII
And Selects Type of Coverage as "<TypeofCove>" for Spouse under GHII
And Selects Benefit Amount for Spouse as "<SBenOpt>" under GHII
And Selects Type of Coverage as "<TypeofCove>" for Child under GHII
And Selects Benefit Amount for Child as "<CBenOpt>" under GHII
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Skip Beneficiary Button
Then Contact Details page is displayed to user 
And Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>" 
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Validate the Travel Question for Non QD application for Self
And Selects Yes for Travel Question Non QD for Self
And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>"
And Selects Residential Radio Button
And Selects Yes Radio Button for Business Address
And Enters Business Details as "<BusinessName>","<BusinessType>"
And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<SSex>","<SPhoneType>","<SPhoneNum>"
And Validate the Travel Question for Non QD application for Spouse
And Selects Yes for Travel Question Non QD for Spouse
And Enter datails for Outside US country and How Long months for Spouse as "<SCountry>","<SMonths>"
And Clicks on next button
Then Application Summary Page is displayed to user 
And Verify Benefit Amount for Self as "<Benefit>" under GTLI
And Verify Benefit Amount for Self as "<Benefit1>" under GTenYTL
And Verify Benefit Amount for Self as "<Benefit2>" under GDII
And Verify Benefit Amount for Self as "<BenOpt1>" under GHII
And Verify Benefit Amount for Spouse as "<SBenefit>" under GTLI
And Verify Benefit Amount for Spouse as "<SBenefit1>" under GTenYTL
And Verify Benefit Amount for Spouse as "<SBenOpt>" under GHII
And Verify Benefit Amount for Child as "<BenAmount>" under GTLI
And Verify Benefit Amount for Child as "<CBenOpt>" under GHII
And Verify Child name as "<Cfname>","<Clname>"
And Clicks on next button 
And Validate Consent message in Read and Sign Box
And Verify Supplemental Health Note in Authorization Page
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
|website|Title|Fname|Lname |State   |DOB                |Estatus     |WorkHr |Stitle|Sfname|Slname|SDOB               |Cfname|Clname|CDOB               |Csex|TotalAmt|IndAmt|Cname   |STotalAmt|SIndAmt|SCname      |MonthlyIncome|ACname            |ACBamount|ACBperiod|Ramount|TypeofCove|Benefit  |SBenefit|BenAmount|Benefit1|SBenefit1|MaxMBenefit|Waitperiod|BenOpt                       |Benefit2|BenOpt1|SBenOpt |CBenOpt |SSN      |Mstatus|Height|Weight|Sex |Street          |City |Zipcode|PhoneType|PhoneNum  |Country|Months|BusinessName  |BusinessType|SSSN      |SHeight|SWeight|SSex  |SPhoneType|SPhoneNum |SCountry|SMonths|pdfScenario|pdfEnable|
|TSCPA  |Mr.  |John |Mathew|New York|SYSDate-29Y/00M/00D|TSCPA Member|40     |Mrs.  |Leena |Mathew|SYSDate-27Y/00M/00D|Alex  |Mathew|SYSDate-18Y/00M/00D|Male|2500    |6254  |Majesco |2000     |5000   |IT Solutions|3500         |Software Solutions|4500     |12       |2500   |New       |$200,000 |$150,000|$2,000   |$750,000|$450,000 |$2,100     |30 Days   |Plan 5 (5 Years of Coverage) |$700    |$100   |$75     |$50     |254875695|Married|5.0   |165   |Male|252 SE. Brook St|Bronx|10456  |Home     |1215454878|Germany|12    |Emart Services|Corporation |576442245 |4.6    |160    |Female|Home      |2125455454|Belgium |12     |TSCPA01    |  0   |

@TscpaRegression_2
Scenario Outline:<TSCPASC02>Application Submission for Self with all eligible products             

Given Test set up for "NYL" feature and "NYL_TSCPA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user
And Click on Self  
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Select eligibility status as "<Estatus>"
And Enters Self WorkHr as "<WorkHr>"
And Select YES Radio button of Membership
And Clicks on next button
And Verify that error message is displayed for state eligibility at top of the page
And Enter New State as "<State1>"
And Enters DOB for Self as "<DOB1>"
And Clicks on next button
And Validate Age Restriction Message
And Enters DOB for Self as "<DOB2>"
And Clicks on next button
And Validate Age Restriction Message
And Enters DOB for Self as "<DOB3>"
And Selects NO Radio button of eligible member
And Validate that NEXT button is Disabled
And Select YES Radio button of Membership
And Clicks on next button 
Then Product page details are displayed to user
And Verify Available Product List GTLI, GTenYTL, GHII
And Verify product GDII is not displayed
And Clicks on Back or Previous button
And Enters Self WorkHr as "<WorkHr1>"
And Clicks on next button
Then Product page details are displayed to user
And Verify Available Product List GTLI, GTenYTL, GDII and GHII
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB4>"
And Clicks on next button
Then Product page details are displayed to user
And Verify Available Product List GTLI, GTenYTL, GHII
And Verify product GDII is not displayed
And Clicks on Back or Previous button
And Enters DOB for Self as "<DOB5>"
And Clicks on next button 
Then Product page details are displayed to user
And Verify Available Product List GTLI, GTenYTL, GDII and GHII
And Clicks on next button
And Validate Error Message on Product Page
And Selects product GTLI for Self
And Selects product GTenYTL for Self
And Selects product GDII for Self
And Selects product GHII for Self
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Self
And Enter additional details as "<TotalAmt>","<IndAmt>","<Cname>"
And Enters Monthly Income for Self as "<MonthlyIncome>"
And Selects Yes for unable to work because of a disability for Self
And Clicks on Add Company Button
And Enters details for Company "<ACname>","<ACBamount>","<ACBperiod>" and click on add button
And Selects Yes for replace any other company's coverage for Self
And Enters Amount under replace any other company's coverage as "<Ramount>"
And Clicks on next button
Then Request Coverage page is displayed to user
And Validate Maximum Monthly Benefit Amount for Self as "<MaxMBenefit>" under GDII
And Clicks on Back or Previous button
And Enters Monthly Income for Self as "<MonthlyIncome1>"
And Clicks on next button 
And Selects Type of Coverage as "<TypeofCove>" for Self under GTLI
And Validates under GTLI the Benefit Slider Range for Self as "<MinBamount>" to "<MaxBamount>"
And Selects Benefit Amount for Self as "<Benefit>" under GTLI
And Selects Type of Coverage as "<TypeofCove>" for Self under GTenYTL
And Validates under GTenYTL the Benefit Slider Range for Self as "<MinBamount1>" to "<MaxBamount1>"
And Selects Benefit Amount for Self as "<Benefit1>" under GTenYTL
And Selects Type of Coverage as "<TypeofCove>" for Self under GDII
And Validate Maximum Monthly Benefit Amount for Self as "<MaxMBenefit1>" under GDII
And Validates dropdown values of Wait Period for Self as "<Waitperiod>","<Waitperiod1>","<Waitperiod2>" under GDII
And Selects Waiting Period for Self as "<Waitperiod3>" under GDII
And Validates dropdown values of Benefit Option as "<BenOpt>","<BenOpt1>" under GDII
And Selects Benefit Option for Self as "<BenOpt1>" under GDII
And Validates under GDII the Benefit Slider Range for Self as "<MinMBamount>" to "<MaxMBamount>"
And Selects Benefit Amount for Self as "<Benefit2>" under GDII
And Selects Type of Coverage as "<TypeofCove>" for Self under GHII
And Validates under GHII the Benefit Amounts for Self Listed are: "<BenOpt3>","<BenOpt4>","<BenOpt5>"
And Selects Benefit Amount for Self as "<BenOpt5>" under GHII
And Clicks on next button
And Validate Max Aggregate error message
And Selects Benefit Amount for Self as "<Benefit3>" under GTLI
And Selects Waiting Period for Self as "<Waitperiod4>" under GDII
And Selects Benefit Amount for Self as "<Benefit5>" under GDII
And Selects Benefit Amount for Self as "<BenOpt4>" under GHII
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Self under GTenYTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relation>","<Percen>"
And Clicks on OK button
And Clicks on Skip Beneficiary Button
And Delete box is displayed and clicks on Yes
Then Contact Details page is displayed to user 
And Clicks on Back or Previous button
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Self under GTenYTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname1>","<Blname1>","<Relation1>","<Percen1>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under GTenYTL
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bfname2>","<Blname2>","<Relation2>","<Percen2>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under GTenYTL
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bfname3>","<Blname3>","<Relation3>","<Percen3>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under GTenYTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname4>","<Blname4>","<Relation4>","<Percen4>"
And Clicks on OK button
And Click Delete button for first Primary Beneficiary for Self
And Delete box is displayed and clicks on Yes
And Clicks on next button
And Verify Error Message is displayed for share of Beneficiaries
And Clicks on Add Beneficiary Button for Self under GTenYTL
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bfname5>","<Blname5>","<Relation5>","<Percen5>"
And Clicks on OK button
And Clicks on next button 
Then Contact Details page is displayed to user 
And Clicks on next button
And Validate error message for required question
And Enters contact Details without SSN and MemberID for Self as "<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>" 
And Selects No for Travel Question Non QD for Self
And Selects Business Address Radio Button for Send Correspondence To
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Selects NO Radio Button for Business Address
And Enters Business Details as "<BusinessName>","<BusinessType>"
And Enter Business Address Details as "<Bstreet>","<Bcity>","<Bstate>","<Bzipcode>"
And Clicks on next button
And Validates SSN Required Error Message for Self 
And Enters SSN "<SSN>" for Self
And Clicks on next button
Then Application Summary Page is displayed to user 
And Verify Benefit Amount for Self as "<Benefit3>" under GTLI
And Verify Benefit Amount for Self as "<Benefit1>" under GTenYTL
And Verify Benefit Amount for Self as "<Benefit5>" under GDII
And Verify Benefit Amount for Self as "<BenOpt4>" under GHII
And Clicks on next button
Then Authorize page details are displayed to user and confirm the term and conditions for Self 
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<Website>"

Examples:
|website|Title|Fname|Lname  |State                    |DOB                |Estatus     |WorkHr|State1  |DOB1               |DOB2               |DOB3               |WorkHr1|DOB4               |DOB5               |TotalAmt|IndAmt|Cname        |MonthlyIncome|MonthlyIncome1|ACname|ACBamount| ACBperiod|Ramount|TypeofCove|MinBamount|MaxBamount|Benefit|MinBamount1|MaxBamount1|Benefit1|MaxMBenefit|MaxMBenefit1|Waitperiod|Waitperiod1|Waitperiod2|Waitperiod3|BenOpt                      |BenOpt1                          |MinMBamount|MaxMBamount|Benefit2|BenOpt3|BenOpt4|BenOpt5|Benefit3|Waitperiod4|Benefit5|Bfname|Blname |Relation|Percen|Bfname1|Blname1|Relation1|Percen1|Bfname2|Blname2|Relation2|Percen2|Bfname3|Blname3|Relation3|Percen3|Bfname4|Blname4|Relation4|Percen4|Bfname5|Blname5|Relation5|Percen5|Mstatus|Height|Weight|Sex |Street               |City       |Zipcode|PhoneType|PhoneNum  |BusinessName     |BusinessType|Bstreet                  |Bcity |Bstate|Bzipcode|SSN      |pdfScenario|pdfEnable|
|TSCPA  |Mr.  |Colin|Lambert|U.S. Armed Forces Pacific|SYSDate-30Y/00M/00D|TSCPA Member|19    |Hawaii  |SYSDate-16Y/11M/29D|SYSDate-65Y/00M/00D|SYSDate-59Y/11M/29D|20     |SYSDate-60Y/00M/00D|SYSDate-17Y/00M/00D|60000   |8500  |LTPI Infotech|8180         |8500          |ICICI |9500     |7         |6000   |New       |$25,000   |$750,000  |525,000|$100,000   |$2,000,000 |1500000 |$4,900     |$5,000      |30 Days   |90 Days    |180 Days   |30 Days    |Plan 5 (5 Years of Coverage)|Plan 65 (Coverage through age 65)|$200       |$5,000     |1800    |$50    |$75    |$100   |500000  |30 Days    |1500    |Trevor|Lambert|Son     |100   |Wendy  |Lambert|Spouse   |50     |Keith  |Lambert|Son      |50     |Stephen|Lambert|Father   |50     |Una    |Lambert|Daughter |50     |Austin |Lambert|Son      |50     |Single |5.1   |165   |Male|59, Glen Ridge Circle|Huwaii City|96839  |Home     |3677864322|Netgear Solutions|Partnership | 15208, West 119th Street|Olathe|Kansas|66062   |896368535|TSCPA02   |  0  |

@TscpaRegression_3
Scenario Outline: <TSCPASC03> Application Submission for Spouse with all eligible products             

Given Test set up for "NYL" feature and "NYL_TSCPA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user
And Click on Spouse 
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Select eligibility status as "<Estatus>"
And Select YES Radio button of Membership 
And Clicks on next button
And Verify that error message is displayed as help us to display at top of the page
Then Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
And Select radio button NO for Spouse is Member
And Clicks on next button
And Validate Age Restriction Message
And Enters DOB for Spouse as "<SDOB1>"
And Clicks on next button
And Validate Age Restriction Message
And Enters DOB for Spouse as "<SDOB2>"
And Enter New State as "<State1>"
And Clicks on next button
And Verify that error message is displayed for state eligibility at top of the page
And Enter New State as "<State2>"
And Clicks on next button
Then Product page details are displayed to user 
And Verify product GTLI is displayed
And Verify GTenYTL and GHII are not displayed 
And Clicks on Back or Previous button
And Select eligibility status as "<Estatus1>"
And Enters Self WorkHr as "<WorkHr>"
And Clicks on next button
And Verify Available Product List GTLI, GTenYTL, GHII
And Selects product GTLI for Spouse
And Selects product GTenYTL for Spouse
And Selects product GHII for Spouse
And Clicks on next button
Then Click YES for Dependent Coverage information
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse 
And Clicks on next button 
Then Request Coverage page is displayed to user
And Selects Type of Coverage as "<TypeofCove>" for Spouse under GTLI 
And Validates under GTLI the Benefit Slider Range for Spouse as "<MinBamount>" to "<MaxBamount>"
And Selects Benefit Amount for Spouse as "<Benefit>" under GTLI
And Selects Type of Coverage as "<TypeofCove>" for Spouse under GTenYTL
And Validates under GTenYTL the Benefit Slider Range for Spouse as "<MinBamount1>" to "<MaxBamount1>"
And Selects Benefit Amount for Spouse as "<Benefit1>" under GTenYTL
And Selects Type of Coverage as "<TypeofCove>" for Spouse under GHII
And Validates under GHII the Benefit Amounts for Spouse Listed are:"<BenOpt>","<BenOpt1>","<BenOpt2>"
And Selects Benefit Amount for Spouse as "<BenOpt3>" under GHII
And Clicks on next button 
And Validate Max Aggregate error message
And Selects Benefit Amount for Spouse as "<Benefit2>" under GTLI 
And Selects Benefit Amount for Spouse as "<BenOpt4>" under GHII
And Clicks on next button 
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Spouse under GTLI
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And User Enters Beneficiary details as "<Trust>","<DateTrust>"
And Clicks on OK button
And Verify that the Percent Displayed for Trust is "<TrustPercent>" for Spouse under GTLI
And Clicks on Add Beneficiary Button for Spouse under GTLI
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And User Enters Beneficiary details as "<Trust1>","<DateTrust1>"
And Clicks on OK button
And Validates error message on Add Beneficiary page-Only one Trust is allowed as Primary
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
And User Enters Beneficiary details as "<Trust1>","<DateTrust1>"
And Clicks on OK button
And Delete Contingent Beneficiary 
And Delete box is displayed and clicks on Yes
And Clicks on Add Beneficiary Button for Spouse under GTLI
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
And Clicks on OK button
And Verify Error Message individual can not be added if trust already exist
And Clicks on Close button
And Clicks on next button
Then Contact Details page is displayed to user 
And Validates Height and Weight is not displayed for Self
And Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<Sex>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page 
And Selects Residential Radio Button
And Enters contact Details for Spouse without SSN as "<SSex>","<SHeight>","<SWeight>","<SPhoneType>","<SPhoneNum>"
And Selects No for Travel Question Non QD for Spouse
And Clicks on next button 
Then Application Summary Page is displayed to user 
And Verify Benefit Amount for Spouse as "<Benefit2>" under GTLI
And Verify Benefit Amount for Spouse as "<Benefit1>" under GTenYTL
And Verify Benefit Amount for Spouse as "<BenOpt4>" under GHII
And Clicks on next button 
Then Authorize page details are displayed to user and confirm the term and conditions for Self 
And Clicks on next button 
And Validate Error message for Authorization
Then Authorize page details are displayed to user and confirm the term and conditions for Spouse
And Clicks on next button to finish
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<Website>"

Examples:
|website|Title|Fname   |Lname|State   |DOB                |Estatus                          |Stitle|Sfname|Slname|SDOB               |SDOB1              |SDOB2              |State1|State2    |Estatus1    |WorkHr|TypeofCove|MinBamount|MaxBamount|Benefit|MinBamount1|MaxBamount1|Benefit1   |BenOpt|BenOpt1|BenOpt2|BenOpt3|Benefit2|BenOpt4|Trust       |DateTrust |TrustPercent|Trust1   |DateTrust1|Bname|Blname|Relationship|Perc|SSN      |Mstatus|Sex |Street                    |City         |Zipcode|PhoneType|PhoneNum  |SHeight|SWeight|SSex  |SPhoneType|SPhoneNum |Benefit2|Benefit3|Benefit4|pdfScenario|pdfEnable|
|TSCPA  |Mr.  |Leonard |Rees |Colorado|SYSDate-45Y/00M/00D|Employee working 20 or more hours|Mrs.  |Amelia|Rees  |SYSDate-16Y/11M/29D|SYSDate-65Y/00M/00D|SYSDate-64Y/11M/29D|Guam  |Washington|TSCPA Member|20    |New       |$25,000   |$750,000  |525000 |$100,000   |$2,000,000 |$1,500,000 |$50   |$75    |$100   |$100   |500000  |$75    |Helping Hand|01/01/1996|100 %       |Bright   |01/01/1990|Jane |Rees  |Daughter    |100 |224244412|Married|Male|6 Serenity St. Springfield|Colorado City|81073  |Home     |1215454265|4.9  |186    |Female|Mobile    |2443525667|300000  |650000  |75      |TSCPA03   | 0 |

@TscpaRegression_4
Scenario Outline: <TSCPASC04>Application Submission for Child with all eligible products  

Given Test set up for "NYL" feature and "NYL_TSCPA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user 
And Click on Child 
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Select eligibility status as "<Estatus>"
And Select YES Radio button of Membership
And Clicks on next button
And Verify that error message is displayed as help us to display at top of the page
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Clicks on next button
And Verify Error Message for member is not eligible
And Select eligibility status as "<Estatus1>"
And Enters Self WorkHr as "<WorkHr>"
And Clicks on next button
Then Product page details are displayed to user 
And Verify product GHII is displayed
And Verify product GTLI, GTenYTL are not displayed
And Clicks on Back or Previous button
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname1>","<Clname1>","<CDOB1>","<Csex1>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button 
Then Add Child Screen is displayed and Enters Child details as "<Cfname2>","<Clname2>","<CDOB2>","<Csex2>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button 
Then Add Child Screen is displayed and Enters Child details as "<Cfname3>","<Clname3>","<CDOB3>","<Csex3>"
And Selects Married question as Yes for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Click on Add Child button 
Then Add Child Screen is displayed and Enters Child details as "<Cfname4>","<Clname4>","<CDOB4>","<Csex4>"
And Selects Married question as No for Child
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
And Selects Married question as Yes for Child
And Selects Yes for full time student for Child
And Click on Add Child button on Screen
And Validates Add Child Button on Eligibility page is not present
And Clicks on next button
Then Product page details are displayed to user 
And Verify Available Product List GTLI, GTenYTL, GHII
And Selects product GTLI for Child
And Verify Child icon is disabled for GTenYTL
And Selects product GHII for Child
And Clicks on next button
And Click YES for Dependent Coverage information
Then Request Coverage page is displayed to user
And Validates "<Cfname1>","<Cfname4>" and "<Cfname6>" are displayed as eligible children under GTLI
And Validates Benefit amount for child as "<BenOpt>" under GTLI
And Validates "<Cfname>","<Cfname1>","<Cfname4>" and "<Cfname6>" are displayed as eligible children under GHII
And Validates under GHII the Benefit Amounts for Child Listed are: "<MaxDBamount>","<MaxDBamount1>","<MaxDBamount2>"
And Clicks on Back or Previous button
And Deselects product GTLI for Child
And Selects product GTenYTL for Child
And Clicks on next button
And Click YES for Dependent Coverage information
Then Request Coverage page is displayed to user
And Validates"<Cfname1>","<Cfname4>","<Cfname6>" are displayed as eligible children under GTenYTL
And Validates under GTenYTL the Benefit Amounts Listed are: "<Benefit>"
And Selects Benefit Amount for Child as "<Benefit>" under GTenYTL 
And Selects Type of Coverage as "<TypeofCove>" for Child under GHII
And Selects Benefit Amount for Child as "<Benefit1>" under GHII
And Clicks on next button
Then Contact Details page is displayed to user 
And Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<Sex>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Selects Residential Radio Button
And Clicks on next button
Then Application Summary Page is displayed to user  
And Verify Child name as "<Cfname>","<Clname>"
And Verify Benefit Amount for Child "<Cfname>","<HIISequenceNo>" as "<Benefit1>" under GHII 
And Verify Child name as "<Cfname1>","<Clname1>"
And Verify Benefit Amount for Child "<Cfname1>","<TenSequenceNo>" as "<Benefit>" under GTenYTL 
And Verify Child name as "<Cfname1>","<Clname1>"
And Verify Benefit Amount for Child "<Cfname1>","<HIISequenceNo1>" as "<Benefit1>" under GHII 
And Verify Child name as "<Cfname4>","<Clname4>"
And Verify Benefit Amount for Child "<Cfname4>","<TenSequenceNo1>" as "<Benefit>" under GTenYTL 
And Verify Child name as "<Cfname4>","<Clname4>"
And Verify Benefit Amount for Child "<Cfname4>","<HIISequenceNo2>" as "<Benefit1>" under GHII 
And Verify Child name as "<Cfname6>","<Clname6>"
And Verify Benefit Amount for Child "<Cfname6>","<TenSequenceNo2>" as "<Benefit>" under GTenYTL
And Verify Child name as "<Cfname6>","<Clname6>"
And Verify Benefit Amount for Child "<Cfname6>","<HIISequenceNo3>" as "<Benefit1>" under GHII 
And Clicks on next button
Then Authorize page details are displayed to user and confirm the term and conditions for Self 
And Validates Consent message in Read and Sign Box for NonUW
And Verify Supplemental Health Note in Authorization Page
And Validates that Second I understand verbiage is not displayed in Read and Sign Box
And Validates that Authorization message is not displayed in Read and Sign Box
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"

Examples: 
|website|Title|Fname|Lname|State|DOB                |Estatus                          |Cfname|Clname|CDOB   |Csex|Estatus1     |WorkHr|Cfname1|Clname1|CDOB1             |Csex1|Cfname2|Clname2|CDOB2              |Csex2|Cfname3|Clname3|CDOB3              |Csex3|Cfname4|Clname4|CDOB4              |Csex4 |Cfname5|Clname5|CDOB5              |Csex5 |Cfname6|Clname6|CDOB6              |Csex6 |Cfname7|Clname7|CDOB7              |Csex7|BenOpt  |MaxDBamount |MaxDBamount1|MaxDBamount2|Benefit|TypeofCove|Benefit1|SSN        |Mstatus|Height |Weight|Sex |Street          |City         |Zipcode|PhoneType|PhoneNum  |HIISequenceNo|HIISequenceNo1|HIISequenceNo2|HIISequenceNo3|TenSequenceNo|TenSequenceNo1|TenSequenceNo2|pdfScenario|pdfEnable|
|TSCPA  |Mr.  |Phil |Walsh|Texas|SYSDate-35Y/00M/00D|Employee working 20 or more hours|Sean  |Walsh |SYSDate|Male|TSCPA Member |25    |Antony |Walsh  |SYSDate-0Y/00M/14D|Male |Tim    |Walsh  |SYSDate-20Y/00M/00D|Male |Shaun  |Walsh  |SYSDate-19Y/11M/29D|Male |Carol  |Walsh  |SYSDate-25Y/11M/29D|Female|Emily  |Walsh  |SYSDate-26Y/00M/00D|Female|Anna   |Walsh  |SYSDate-19Y/11M/29D|Female|Luke   |Walsh  |SYSDate-23Y/00M/00D|Male |$2,000  |$50         |$75         |$100        |$10,000|New       |$75     |224244875  |Married|5.4   |180   |Male|7672 Taylor Lane|Laredo       |78041  |Mobile   |5715454964|1           | 2             | 3            |4             |1           | 2             | 3            |TSCPA04    |0    |

@TscpaRegression_5
Scenario Outline:<TSCPASC05>Application Submission for Self and Child with all eligible products                      

Given Test set up for "NYL" feature and "NYL_TSCPA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user 
And Click on Self  
And Click on Child 
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Select eligibility status as "<Estatus>"
And Select YES Radio button of Membership
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>" 
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen
And Clicks on next button
And Verify that error message is displayed for state eligibility at top of the page
And Enter New State as "<State1>"
And Clicks on next button
Then Product page details are displayed to user 
#And Validates that Child is not displayed for GTLI, GTenYTL, GHII
And Verify Self is displayed for GTLI and GHII
And Verify product GDII is not displayed
And Clicks on Back or Previous button
And Select eligibility status as "<Estatus1>"
And Enters Self WorkHr as "<WorkHr>"
And Enters DOB for Self as "<DOB1>"
And Clicks Edit button for Child Added
And Enters DOB for Child as "<CDOB1>"
And Click on Add Child button on Screen
And Clicks on next button
Then Product page details are displayed to user
And Verify Self is displayed for GTLI, GTenYTL and GHII
And Verify product GDII is not displayed
And Verify Child is displayed for GHII
And Clicks on Back or Previous button
And Enters Self WorkHr as "<WorkHr1>"
And Clicks Edit button for Child Added
And Enters DOB for Child as "<CDOB2>"
And Click on Add Child button on Screen
And Clicks on next button
Then Product page details are displayed to user
And Verify Self is displayed for GTLI GTenYTL, GDII and GHII
And Verify Child is displayed for GTenYTL, GTLI and GHII
And Selects product GTLI for Self
And Selects product GTenYTL for Self
And Selects product GDII for Self
And Selects product GHII for Self
And Selects product GTLI for Child
And Verify Child icon is disabled for GTenYTL
And Selects product GHII for Child
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
And Selects Answer as No for Applying any Other Insurance
And Enters Monthly Income for Self as "<MonthlyIncome>"
And Clicks on next button
Then Request Coverage page is displayed to user
And Selects Type of Coverage as "<TypeofCove>" for Self under GTLI 
And Selects Benefit Amount for Self as "<Benefit>" under GTLI
And Selects Benefit Amount for Child as "<CBenefit>" under GTLI
And Selects Type of Coverage as "<TypeofCove>" for Self under GTenYTL 
And Selects Benefit Amount for Self as "<Benefit1>" under GTenYTL
And Selects Type of Coverage as "<TypeofCove>" for Self under GDII  
And Validate Maximum Monthly Benefit Amount for Self as "<MaxMBamont>" under GDII 
And Selects Waiting Period for Self as "<Waitperiod>" under GDII
And Selects Benefit Option for Self as "<BenOpt>" under GDII
And Selects Benefit Amount for Self as "<Benefit2>" under GDII
And Selects Type of Coverage as "<TypeofCove>" for Self under GHII
And Selects Benefit Amount for Self as "<BenOpt1>" under GHII
And Selects Type of Coverage as "<TypeofCove>" for Child under GHII
And Selects Benefit Amount for Child as "<CBenOpt>" under GHII
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Self under GTenYTL 
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons 
And User Enters Beneficiary details as name and relationship"<Bfname1>","<Blname1>","<Relationship1>","<Percen1>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under GTenYTL 
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons 
And User Enters Beneficiary details as name and relationship as other "<Bfname2>","<Blname2>","<Relationship2>","<Percen2>","<Desc>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under GTenYTL 
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons 
And User Enters Beneficiary details as name and relationship"<Bfname3>","<Blname3>","<Relationship3>","<Percen3>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under GTenYTL 
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship as other "<Bfname4>","<Blname4>","<Relationship4>","<Percen4>","<Desc1>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under GTenYTL 
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons 
And User Enters Beneficiary details as name and relationship"<Bfname5>","<Blname5>","<Relationship5>","<Percen5>"
And Clicks on OK button
And Validate Maximum Beneficiaries Error message
And Clicks on Close button
And Clicks on next button
And Verify Error Message is displayed for share of Beneficiaries
And Clicks on edit button of "<Sequence>" Beneficiary for Self under GTenYTL 
And Enter Percentage as "<Percen6>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under GTenYTL
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bfname6>","<Blname6>","<Relationship6>","<Percen7>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under GTenYTL
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons 
And User Enters Beneficiary details as name and relationship"<Bfname7>","<Blname7>","<Relationship7>","<Percen8>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under GTenYTL 
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons 
And User Enters Beneficiary details as name and relationship"<Bfname8>","<Blname8>","<Relationship8>","<Percen9>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under GTenYTL 
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons 
And User Enters Beneficiary details as name and relationship"<Bfname9>","<Blname9>","<Relationship9>","<Percen10>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under GTenYTL 
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship as other "<Bfname10>","<Blname10>","<Relationship10>","<Percen11>","<Desc2>"
And Clicks on OK button
And Validate Maximum Contingent Beneficiaries Error message
And Clicks on Close button
And Clicks on next button
And Verify Error Message is displayed for share of Beneficiaries
And Clicks on edit button of "<Sequence1>" Beneficiary for Self under GTenYTL 
And Enter Percentage as "<Percen12>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Self under GTLI
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And Selects the First Option from Existing Beneficiaries List and select Type as "<bentype>"
And Enters Percentage for First Option as "<Percen13>"
And Clicks on OK button
And Clicks on next button
Then Contact Details page is displayed to user 
And Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Selects Yes for Travel Question Non QD for Self
And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>"
And Selects Residential Radio Button
And Selects Yes Radio Button for Business Address
And Enters Business Details as "<BusinessName>","<BusinessType>"
And Clicks on next button
Then Application Summary Page is displayed to user 
And Verify Benefit Amount for Self as "<Benefit>" under GTLI
And Verify Benefit Amount for Self as "<Benefit1>" under GTenYTL 
And Verify Benefit Amount for Self as "<Benefit2>" under GDII
And Verify Benefit Amount for Self as "<BenOpt1>" under GHII
And Verify Child name as "<Cfname>","<Clname>"
And Verify Benefit Amount for Child as "<CBenefit>" under GTLI
And Verify Benefit Amount for Child as "<CBenOpt>" under GHII
And Clicks on next button
Then Authorize page details are displayed to user and confirm the term and conditions for Self 
And Validate Consent message in Read and Sign Box
And Verify Supplemental Health Note in Authorization Page
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"


Examples: 

|website|Title  |Fname|Lname |State    |DOB                |Estatus                          |Cfname|Clname|CDOB               |Csex  |State1   |Estatus1    |WorkHr|DOB1                |CDOB1              |WorkHr1|CDOB2              |MonthlyIncome|TypeofCove|Benefit |CBenefit|Benefit1|MaxMBamont|Waitperiod|BenOpt                           |Benefit2|BenOpt1|CBenOpt|Bfname1|Blname1|Relationship1|Percen1|Bfname2|Blname2|Relationship2|Percen2|Desc  |Bfname3|Blname3|Relationship3|Percen3|Bfname4|Blname4|Relationship4|Percen4|Desc1   |Bfname5  |Blname5|Relationship5|Percen5|Percen6|Bfname6|Blname6|Relationship6|Percen7|Bfname7|Blname7|Relationship7|Percen8|Bfname8|Blname8|Relationship8|Percen9|Bfname9|Blname9|Relationship9|Percen10|Bfname10|Blname10|Relationship10|Percen11|Desc2   |Percen12|Percen13|SSN      |Mstatus |Height|Weight|Sex |Street                        |City|Zipcode|PhoneType|PhoneNum  |Country|Months|BusinessName    |BusinessType|bentype|Sequence|Sequence1|
|TSCPA  |Prof.  |Owen |Glover|Quebec   |SYSDate-64Y/11M/29D|Employee working 20 or more hours|Sue   |Glover|SYSDate-00Y/05M/00D|Female|Alabama  |TSCPA Member|19    |SYSDate-59Y/11M/29D |SYSDate-00Y/00M/12D|20     |SYSDate-00Y/08M/00D|3000         |New       |$125,000|$2,000  |$250,000|$1,800    |180 Days  |Plan 65 (Coverage through age 65)|$1,200  |$50    |$50    |Heena  |Glover |Spouse       |25     |John   |Peake  |Other        |25     |Friend|Henry  |Glover |Son          |25     |Bravo  |Lambert|Other        |15     |Neighbor|Rosey    |Glover |Daughter     |10     |25     |Simon  |Glover |Mother       |25     |Kevin  |Glover |Father       |25     |Andrew |Glover |Son          |25     |Martina|Glover |Daughter     |15      |Alex    |Gray    |Other         |10      |Neighbor|25      |100     |224246248|Divorced|5.6   |180   |Male|550 Lawrence Avenue Moose Lake|MN  |55767  |Home     |6978554878|Cuba   |10    |Dell Corporation|Corporation |Primary|4       |8     |

@TscpaRegression_6
Scenario Outline:<TSCPASC06>Application Submission for Self and Spouse with all eligible products                      

Given Test set up for "NYL" feature and "NYL_TSCPA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user 
And Click on Self
And Click on Spouse
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Select eligibility status as "<Estatus>"
And Select YES Radio button of Membership 
And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
And Select radio button Yes for Spouse is Member
And Clicks on next button
Then Product page details are displayed to user 
And Verify Self is displayed for GTLI, GDII and GHII
And Verify product GTenYTL is not displayed
And Verify Spouse is displayed for GTLI
And Verify Spouse is not displayed for GHII
And Selects product GTLI for Self
And Selects product GDII for Self
And Selects product GHII for Self
And Selects product GTLI for Spouse
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse 
And Selects Answer as No for Applying any Other Insurance
And Enters Monthly Income for Self as "<MonthlyIncome>"
And Clicks on next button
Then Request Coverage page is displayed to user
And Selects Type of Coverage as "<TypeofCove>" for Self under GTLI
And Validates under GTLI the Benefit Slider Range for Self as "<MinBamount>" to "<MaxBamount>"
And Selects Benefit Amount for Self as "<Benefit>" under GTLI
And Selects Type of Coverage as "<TypeofCove>" for Spouse under GTLI
And Validates under GTLI the Benefit Slider Range for Spouse as "<SMinBamount>" to "<SMaxBamount>"
And Selects Benefit Amount for Spouse as "<SBenefit>" under GTLI
And Selects Type of Coverage as "<TypeofCove>" for Self under GDII
And Validate Maximum Monthly Benefit Amount for Self as "<MaxMBamount>" under GDII
And Selects Waiting Period for Self as "<Waitperiod>" under GDII
And Selects Benefit Option for Self as "<BenOpt>" under GDII
And Selects Benefit Option for Self as "<BenOpt>" under GDII
And Validates under GDII the Benefit Slider Range for Self as "<MinMBamount>" to "<MaxMBamount>"
And Selects Benefit Amount for Self as "<Benefit1>" under GDII
And Selects Type of Coverage as "<TypeofCove>" for Self under GHII
And Selects Benefit Amount for Self as "<BenOpt1>" under GHII
And Clicks on next button
And Verify Error Message in Spouse section for TermLife
And Selects Benefit Amount for Spouse as "<SBenefit1>" under GTLI
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Add Beneficiary Button for Spouse under GTLI
Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
And User Enters Beneficiary details as "<Trust>","<DateTrust>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under GTLI
Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
And User Enters Beneficiary details as "<Trust1>","<DateTrust1>"
And Clicks on OK button
And Delete Contingent Beneficiary 
And Delete box is displayed and clicks on Yes
And Clicks on Add Beneficiary Button for Spouse under GTLI
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<Relationship>","<Percen>"
And Clicks on OK button
And Clicks on Add Beneficiary Button for Spouse under GTLI
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bfname1>","<Blname1>","<Relationship1>","<Percen1>"
And Clicks on OK button
And Clicks on next button
Then Contact Details page is displayed to user 
And Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Selects No for Travel Question Non QD for Self 
And Selects Residential Radio Button
And Selects Yes Radio Button for Business Address
And Enters Business Details as "<BusinessName>","<BusinessType>"
And Enters contact Details for Spouse without SSN as "<SSex>","<SHeight>","<SWeight>","<SPhoneType>","<SPhoneNum>"
And Enter optional SSN "<SSSN>" for Spouse
And Selects Yes for Travel Question Non QD for Spouse
And Enter datails for Outside US country and How Long months for Spouse as "<SCountry>","<SMonths>"
And Clicks on next button
Then Application Summary Page is displayed to user 
And Verify Benefit Amount for Self as "<Benefit>" under GTLI
And Verify Benefit Amount for Self as "<Benefit1>" under GDII
And Verify Benefit Amount for Self as "<BenOpt1>" under GHII
And Verify Benefit Amount for Spouse as "<SBenefit1>" under GTLI
And Clicks on next button
Then Authorize page details are displayed to user and confirm the term and conditions for Self 
And Authorize page details are displayed to user and confirm the term and conditions for Spouse 
#And Validate Consent message in Read and Sign Box
#And Verify Supplemental Health Note in Authorization Page
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"


Examples: 

|website|Title|Fname  |Lname|State   |DOB                |Estatus                          |Stitle|Sfname|Slname|SDOB               |MonthlyIncome|TypeofCove|MinBamount|MaxBamount|Benefit|SMinBamount|SMaxBamount|SBenefit|MaxMBamount|Waitperiod|BenOpt                      |MinMBamount|MaxMBamount|Benefit1|BenOpt1|SBenefit1|Trust   |DateTrust |Trust1       |DateTrust1|Bfname|Blname|Relationship|Percen|Bfname1|Blname1|Relationship1|Desc  |Percen1|SSN      |Mstatus|Height|Weight|Sex |Street          |City  |Zipcode|PhoneType|PhoneNum  |BusinessName|BusinessType|SSSN     |SHeight|SWeight|SSex  |SPhoneType|SPhoneNum |SCountry|SMonths|
|TSCPA  |Dr.  |Gordon |Mills|Arkansas|SYSDate-59Y/11M/29D|Employee working 20 or more hours|Mrs.  |Ella  |Mills |SYSDate-17Y/00M/00D|1000         |New       |$25,000   |$100,000  |$50,000|$2,5000    |$100,000   |$75,000 |$600       |90 Days   |Plan 5 (5 Years of Coverage)|$200       |$600       |$300    |$75    |$25,000  |SP Trust|01/01/2000|Bright Nation|01/01/2000|Emily |Mills |Daughter    |50    |Jason  |Mills  |Father       |Friend|50   |223584444|Married|5.1   |200   |Male|190 Fremont Ave.|Bryant|72022  |Home     |2435454878|IT Services |Corporation |256357787|5.0    |168    |Female|Mobile    |3412454877|Benin   |8      |

@TscpaRegression_7

Scenario Outline: <TSCPASC07> Validation Read & Sign Page with 20 different States one by one in loop

Given Test set up for "NYL" feature and "NYL_TSCPA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user 
And Click on Self
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Select eligibility status as "<Estatus>"
And Enters Self WorkHr as "<WorkHr>"
And Select YES Radio button of Membership 
And Clicks on next button
Then Product page details are displayed to user 
And Selects product GTenYTL for Self
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
#And Selects No for Do you have other life insurance in force for Self
#And Selects No for Do you have other insurance applications pending for Self
And Clicks on next button
Then Request Coverage page is displayed to user
And Selects Type of Coverage as "<TypeofCove>" for Self under GTenYTL
And Selects Benefit Amount for Self as "<Benefit>" under GTenYTL
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on Skip Beneficiary Button
Then Contact Details page is displayed to user 
And Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Selects No for Travel Question Non QD for Self 
And Selects Residential Radio Button
And Selects Yes Radio Button for Business Address
And Enters Business Details as "<BusinessName>","<BusinessType>"

And Clicks on button to Save for later
Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VerifyPass>" 
And Clicks OK Button Save For Later 
Then Refresh the browser 
Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive
Then Contact Details page is displayed to user 
And Clicks on next button

Then Application Summary Page is displayed to user 
And Clicks on next button
Then Authorize page details are displayed to user and confirm the term and conditions for Self 
And Validate Authorization message in Read and Sign Box
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
And Enter New State as "<State21>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
#Note: After Read & Sign and Electronic Consent, a third box is generated only for CT
And Validate Fraud Notice CT in Read and Sign Box 
And Validates additional Notes for Connecticut state
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

|website|Title|Fname |Lname   |State   |DOB                 |Estatus    |WorkHr     |TypeofCove|Benefit |SSN      |Mstatus|Height|Weight|Sex |Street             |City         |Zipcode|PhoneType|PhoneNum |BusinessName        |BusinessType|Password|VerifyPass|State1     |State2  |State3   |State4    |State5       |State6       |State7   |State8               |State9  |State10 |State11|State12    |State13  |State14  |State15    |State16   |State17    |State18  |State19 |State20    |State21     |State22  |pdfScenario|pdfScenario1|pdfEnable|pdfName                               |pdfName1       |         
|TSCPA  |Mr.  |Keith |Anderson|Colorado|SYSDate- 20Y/00M/00D|TSCPAMember|25         |New       |$250,000|222487444|Widowed|5.1   |175   |Male|2025 North Broadway|Colorado City|10960  |Home     |123584878|Nutshell Corporation|Corporation |Test@123|Test@123  |California |Alabama |Arkansas |Louisiana |Pennsylvania |Rhode Island |Maryland |District of Columbia |Florida |Kansas  |Maine  |New Jersey |New York |Oklahoma |Puerto Rico|Tennessee |Washington |Virginia |Wyoming |New Mexico |Connecticut |Minnesota|TSCPA7_WM   |TSCPA7_NM  |1        |Important Notice All except NM 2 08.12|Important Notice NM 2 08.12|


@TscpaRegression_8

Scenario Outline:<TSCPASC08>Application Submission for Self with LI products             

Given Test set up for "NYL" feature and "NYL_TSCPA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user 
And Click on Self
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Select eligibility status as "<Estatus>"
And Enters Self WorkHr as "<WorkHr>"
And Select NO for Association Membership 
And Validate that NEXT button is Disabled
And Select YES Radio button of Membership 
And Clicks on next button
Then Product page details are displayed to user 
And Verify Self is displayed for GTLI GTenYTL, GDII and GHII
And Selects product GTenYTL for Self
And Clicks on next button
Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Self
And Validate Imp Replacement Info text for NewYork state
And Confirms Imp Replacement Info for NewYork state
#And Selects Yes for Do you have other life insurance in force for Self
#And Selects Yes for life insurance applied for intended to replace for Self
And Verify New York State paragraph is displayed for Self
#And Selects Yes for Do you have other insurance pending for Self
And Enter additional details as "<TotalAmt>","<IndAmt>","<Cname>"
And Clicks on next button
Then Request Coverage page is displayed to user
And Selects Type of Coverage as "<TypeofCove>" for Self under GTLI
And Selects Benefit Amount for Self as "<Benefit>" under GTLI
And Selects Type of Coverage as "<TypeofCove>" for Self under GTenYTL
And Selects Benefit Amount for Self as "<Benefit1>" under GTenYTL
And Clicks on next button
Then Beneficiary Page is displayed to user
And Clicks on next button
Then Contact Details page is displayed to user 
And Clicks on next button
And Validate error message for required question
And Enters contact Details without SSN and MemberID for Self as "<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Validate the Travel Question for Non QD application for Self
And Selects Yes for Travel Question Non QD for Self
And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>"
And Selects Residential Radio Button
And Clicks on next button
And Validates SSN Required Error Message for Self 
And Enters SSN "<SSN>" for Self
And Clicks on next button
Then Application Summary Page is displayed to user 
And Verify Benefit Amount for Self as "<Benefit>" under GTLI
And Verify Benefit Amount for Self as "<Benefit1>" under GTenYTL
And Clicks on next button
Then Authorize page details are displayed to user and confirm the term and conditions for Self 
And Verify that fraud notice is not rendered at Authorization page
##And Validate Consent message in Read and Sign Box
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"



Examples: 

|website|Title|Fname    |Lname   |State   |DOB                |Estatus     |WorkHr|TotalAmt|IndAmt|Cname |TypeofCove|Benefit |Benefit1  |Mstatus|Height|Weight|Sex |Street             |City   |Zipcode|PhoneType|PhoneNum |Country |Months|SSN      | 
|NSCPA  |Mr.  |Sebastian|Hardacre|New York|SYSDate-40Y/00M/00D|TSCPA Member|20    |60000   |4500  |CISCPO|New       |$350,000|$1,000,000|Single |5.0   |180   |Male|44 West Bridge Ave.|Buffalo|14221  |Home     |075342758|Malaysia|5     |323422578|



