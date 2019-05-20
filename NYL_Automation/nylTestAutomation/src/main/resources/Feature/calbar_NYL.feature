Feature: CALBAR Test

@CALBARRegression_1
Scenario Outline:<CALBARSC01>Application Submission for Self and Child with Group 10-Year Level Term Life

Given Test set up for "NYL" feature and "NYL_CALBAR" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user
And Click on Self  
And Click on Child   
And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
And Select YES Radio button of Membership
And Click on Add Child button  
Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<CSex>"
And Selects Married question as No for Child
And Selects No for full time student for Child 
And Click on Add Child button on Screen 
And Clicks on next button
And Verify that error message is displayed for state eligibility at top of the page 
And Enter New State as "<State1>" 
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname1>","<Clname1>","<CDOB1>","<CSex1>"
And Selects Married question as No for Child
And Selects No for full time student for Child 
And Click on Add Child button on Screen
And Click on Add Child button  
Then Add Child Screen is displayed and Enters Child details as "<Cfname2>","<Clname2>","<CDOB2>","<CSex2>"
And Selects Married question as No for Child
And Selects Yes for full time student for Child
And Click on Add Child button on Screen 
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname3>","<Clname3>","<CDOB3>","<CSex3>"
And Selects Married question as Yes for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen 
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname4>","<Clname4>","<CDOB4>","<CSex4>"
And Selects Married question as Yes for Child
And Selects Yes for full time student for Child
And Click on Add Child button on Screen 
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname5>","<Clname5>","<CDOB5>","<CSex5>"
And Selects Married question as No for Child
And Selects Yes for full time student for Child
And Click on Add Child button on Screen  
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname6>","<Clname6>","<CDOB6>","<CSex6>"
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen 
And Click on Add Child button
Then Add Child Screen is displayed and Enters Child details as "<Cfname7>","<Clname7>","<CDOB7>","<CSex7>" 
And Selects Married question as No for Child
And Selects No for full time student for Child
And Click on Add Child button on Screen 
And Validates Add Child Button on Eligibility page is not present
And Clicks on next button
Then Verify that Product page are displayed to user
And Validates that Self is displayed for TenYTL,TwentyYTL on product page
And Validates that Child is displayed for TenYTL,TwentyYTL
And Clicks on next button
And Validate Error Message on Product Page
And Selects product TenYTL for Self
And Selects product TenYTL for Child
And Verify Self and Child icon is disabled for Group 20 Yr LTLI
And Verify Child icon is disabled for TwentyYTL
And Clicks on next button
Then Product: Additional Questions page details are displayed to user 
And Selects Yes for Do you have other life insurance in force for Self
And Enters Total Amount as "<TotalAmt>" for self
And Selects Yes for life insurance applied for intended to replace for Self
And Verify New York State paragraph is not displayed for self
And Selects Yes for Do you have other insurance applications pending for self
And Enters  Amount as "<IndAmt>", "<Cname>" for self
And Clicks on next button
Then Request Coverage page is displayed to user
And Validates under Group 10 Yr LTLI the Benefit Slider Range as "<MinBenefit>", "<MaxBenefit>" for self
And Selects Benefit Amount for Self as "<Benefit>" under Group 10 Yr LTLI
And Validates Waiver of Premium Rider is applicable
And Selects Waiver of Premium Rider
And Validates under Group 10 Yr LTLI the Benefit Amount as "<CBenefit>" for child
And Validate Child1, 2, 3 and 7 are displayed in eligible children
And Clicks on next button
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio Buttons
And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
And Clicks on Skip Beneficiary Button
And Delete box is displayed and clicks on Yes
Then Contact Details page is displayed to user 
And Validates Height and Weight is displayed for Self
And Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"
And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
And Validate the Travel Question for Non QD application for Self
And Selects Yes for Travel Question Non QD for Self 
And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>"
And Validate Tobacco Question by  Selecting Answer YES for Self
And Selects Yes Radio button for Tobacco Question
And Enters Details as "<TobDate>"
And Clicks on Products used textbox and Selects Product as "<Product>"
And Selects Residential Radio Button
And Clicks on next button
And Verify Error Message is displayed
And Enters Membership ID as "<MemID>" for Self
And Verify Error Message is displayed
And Enters Membership ID as "<MemID1>" for Self
And Clicks on next button
Then Application Summary Page is displayed to user 
And Verify Benefit Amount for Self as "<Benefit>" under Group 10 Yr LTLI
And Verify Details for Child  as "<Cfname1>", "<Clname1>"under Group 10 Yr LTLI
And Verify Details for Child  as "<Cfname2>", "<Clname2>"under Group 10 Yr LTLI
And Verify Details for Child  as "<Cfname3>", "<Clname3>"under Group 10 Yr LTLI
And Verify Details for Child  as "<Cfname7>", "<Clname7>"under Group 10 Yr LTLI
And Verify Waiver of Premium Rider for Self as YES
And Verify Benefit Amount for Child as "<CBenefit>" under  Group 10 Yr LTLI
And Clicks on next button
Then Authorize page details are displayed to user 
And Validates Fraud Notice in Read and Sign Box
And Validate Consent message in Read and Sign Box
And Authorize page details are displayed to user and confirm the term and conditions for Self
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"

Examples:
|website|Title|Fname |Lname|State        |DOB                |Cfname  |Clname|CDOB   |Csex|State1      |Cfname1|Clname1|CDOB1              |CSex1|Cfname2|Clname2|CDOB2              |CSex2 |Cfname3|Clname3|CDOB3              |CSex3|Cfname4|Clname4|CDOB4              |CSex4 |Cfname5|Clname5|CDOB5              |CSex5 |Cfname6|Clname6|CDOB6              |CSex6 |Cfname7|Clname7|CDOB7              |CSex7|TotalAmt|IndAmt|Cname  |MinBenefit|MaxBenefit|Benefit|CBenefit|Bname|Blname|Relationship|Perc|SSN      |Mstatus|Height|Weight|Sex |Street                   |City             |Zipcode|PhoneType|PhoneNum  |Country  |Months|TobDate   |Product   |MemID|MemID1|Gender|
|calbar |MR.  |Joseph|Brown|New Brunswick|SYSDate-59Y/11M/30D|Nicholas|Brown |SYSDate|Male|South Dakota|Phil   |Brown  |SYSDate-20Y/11M/30D|Male |Grace  |Brown  |SYSDate-24Y/11M/30D|Female|Stephen|Brown  |SYSDate-19Y/00M/00D|Male |Carol  |Brown  |SYSDate-23Y/00M/00D|Female|Emily  |Brown  |SYSDate-25Y/00M/00D|Female|Molly  |Brown  |SYSDate-15Y/00M/00D|Female|Luke   |Brown  |SYSDate-27Y/00M/00D|Male |5000    |6500  |Majesco|100000    |3000000   |925000 |5000    |Lucas|Brown |Father      |100 |935572365|Married|5.5  	|180   |Male|8369 Charles Drive Presho|South Dakota City|57568  |Home     |6057295076|Australia|10    |01/01/2019|Cigarettes|23344|233445|Male	|
