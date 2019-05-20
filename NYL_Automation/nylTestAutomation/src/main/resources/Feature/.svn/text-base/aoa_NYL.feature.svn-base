Feature: AOA Test

@AoaRegression_1
Scenario Outline: <AOA_SC01> Application submission for Self, Spouse and Child with all products, Beneficiary and rider(s)	Test Data

	Given Test set up for "NYL" feature and "NYL_AOA" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user
	Then Click on Self
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State3>","<DOB16>"
	Then Select NO for Association Membership
	And Validate that NEXT button is Disabled		
	Then Select YES Radio button of Membership
	And Validate that NEXT button is Enabled	
	And Select NO Radio Button for Student Member
	And Select YES Radio Button for Practice for More than Six Months
	And Enters Self WorkHr as "<WorkHr31>"
	Then Click on Spouse
	And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<DOB17>"
	And Select radio button NO for Spouse is Member
	And Clicks on next button
	Then Product page details are displayed to user
	And Verify that Self icon is not displayed for GroupTermLife,GLTDI,GSTDI,GBOE
	And Verify that Spouse icon is displayed for only for GroupTermLife
	And Clicks on Back or Previous button
	And Enters DOB for Self as "<DOB17>"
	And Enters DOB for Spouse as "<DOB16>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Verify that Spouse icon is not displayed for GroupTermLife
	And Verify that Self icon is displayed for GroupTermLife,GLTDI,GSTDI,GBOE
	And Clicks on Back or Previous button
	And Enters DOB for Self as "<DOB64>"
	And Enters DOB for Spouse as "<DOB64>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Verify Available Product List: GroupTermLife,GBOE
	And Clicks on Back or Previous button
	And Enters DOB for Self as "<DOB65>"
	And Enters DOB for Spouse as "<DOB65>"
	And Clicks on next button
	And Validate Age Restriction Message
	And Enters DOB for Self as "<DOB17>"
	And Enters DOB for Spouse as "<DOB17>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Verify Available Product List: GroupTermLife,GLTDI,GSTDI,GBOE
	And Clicks on Back or Previous button
	And Select radio button Yes for Spouse is Member
	And Verify Custom Message for Spouse Member AOA is displayed
	And Clicks on next button
	And Verify that Spouse icon is not displayed for GroupTermLife
	And Clicks on Back or Previous button
	And Select radio button NO for Spouse is Member
	And Click on Child
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDob>","<Csex>"
	And Selects Married question as No for Child
	And Selects No for full time student for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname1>","<Clname1>","<CDob1>","<Csex1>"
	And Selects Married question as No for Child
	And Selects No for full time student for Child
	And Click on Add Child button on Screen
	And Enter New State as "<State>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Verify Available Product List GSTDI,GLTDI,GBOE
	And Clicks on Back or Previous button
	And Enter New State as "<State1>"
	And Clicks on next button	
	Then Product page details are displayed to user
	And Verify Available Product List GroupTermLife,GSTDI,GBOE
	And Clicks on Back or Previous button
	And Enter New State as "<State2>"
	And Clicks on next button	
	Then Product page details are displayed to user
	And Verify Available Product List GroupTermLife
	And Clicks on Back or Previous button
	And Enter New State as "<State4>"
	And Clicks on next button	
	Then Product page details are displayed to user
	And Verify Available Product List GroupTermLife
	And Clicks on Back or Previous button
	And Enter New State as "<State3>"
	And Clicks on next button	
	Then Product page details are displayed to user
	And Verify Available Product List: GroupTermLife,GLTDI,GSTDI,GBOE
	And Verify Child icon is available for GroupTermLife product only
	And Verify Spouse icon is available for GroupTermLife product only
	And Selects product GroupTermLife for Self
	And Selects product GroupTermLife for Spouse
	And Selects product GroupTermLife for Child
	And Selects product GLTDI for Self
	And Selects product GSTDI for Self
	And Selects product GBOE for Self
	And Clicks on next button	
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
	And Selects Answer as No for all additional questions of Group Disability Insurance for Self
	And Enters Monthly Income for Self as "<MonthlyIncome>"
	And Enters details for Monthly Expense and Percentage Responsible as "<Mexpense>","<Percresp>"
	And Clicks on next button
	Then Validate error message for required question
	And Confirms Imp Replacement Info for NewYork state
	Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Self
	And Enter additional details as "<TotalAmt>","<IAmount>","<Company>"
	Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Spouse
	And Enter additional details as "<STotalAmt>","<SIAmount>","<SCompany>" for Spouse
	And Selects Yes for unable to work because of a disability for Self
	And Clicks on Add Company Button
	And Enters details for Company "<DICompany>","<DIBenAmt>","<DIBenPeriod>" and click on add button
	And Selects Yes for replace any other company's coverage for Self
	And Enters Amount under replace any other company's coverage as "<RepAmount>"
	And Selects Yes for applying for any other business/office overhead insurance
	And Clicks on Add Company Button for Business or Office Overhead
	And Enters details for Company "<SDICompany>","<SDIBenAmt>","<SDIBenPeriod>" and click on add button
	And Selects Yes for replace any other company's coverage for Self for overhead disability
	And Enters Amount under replace any other company's coverage of overhead product as "<SRepAmount>"
	And Clicks on next button	
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Self as "<Benefit>" under GroupTermLife
	And Validates under GroupTermLife the Benefit Slider Range for Self as "<MinTerm>" to "<MaxTerm>"
	And Selects Benefit Amount for Spouse as "<SBenefit>" under GroupTermLife
	And Verify that Spouse Benefit Message is displayed
	And Validates under GroupTermLife the Benefit Slider Range for Spouse as "<MinTerm>" to "<MaxTerm>"
	And Selects Benefit Amount for Child as "<CBenefit>" under GroupTermLife
	And Selects Benefit Amount for Self as "<Benefit2>" under GLTDI
	And Validates under GLTDI the Benefit Slider Range as "<MinLTDI>" to "<MaxLTDI>"
	And Selects Wait Period for Self as "<WaitPeriod2>" under GLTDI
	And Selects Benefit duration for Self as "<BenDuration2>" under GLTDI
	And Selects Benefit Amount for Self as "<Benefit3>" under GSTDI
	And Validates under GSTDI the Benefit Slider Range as "<MinSTDI>" to "<MaxSTDI>"
	And Selects Wait Period for Self as "<WaitPeriod3>" under GSTDI
	And Selects Benefit duration for Self as "<BenDuration3>" under GSTDI
	And Selects Benefit Amount for Self as "<Benefit4>" under GBOE
	And Validates under GBOE the Benefit Slider Range as "<MinBOE>" to "<MaxBOE>"
	And Selects Wait Period for Self as "<WaitPeriod4>" under GBOE
	And Selects Benefit duration for Self as "<BenDuration4>" under GBOE
	And Clicks on next button	
	Then Beneficiary Page is displayed to user	
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname1>","<Blname1>","<Relationship1>","<Perc1>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname2>","<Blname2>","<Relationship2>","<Perc2>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname3>","<Blname3>","<Relationship3>","<Perc3>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
	And User Enters Beneficiary details as "<Trust>","<DateTrust>"
	And Clicks on OK button
	And Verify that error message is displayed as trust cannot be added if individual already exists
	And Clicks on Close button
	And Delete Contingent Beneficiary 
	And Delete box is displayed and clicks on Yes
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
	And User Enters Beneficiary details as "<Trust>","<DateTrust>"
	And Clicks on OK button
	And Verify that the Percent Displayed for Trust under GroupTermLife is "<TrustPercent>"
	And Clicks on next button	
	Then Contact Details page is displayed to user
	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects Yes for Travel Question Non QD for Self
	And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>"
	And Selects Yes Radio button for Tobacco Question
	And Enters Last Used Tobacco Date Details for Self as "<TobDate>"
	And Clicks on Products used textbox for Self and Selects Product as "<Product>"
	And Selects Business Address Radio Button for Send Correspondence To
	And Selects Yes Radio Button for Business Address
	And Enters Business Details as "<BusinessName>","<BusinessType>"
	And Enters contact Details for Spouse as "<SSSN>","<SHeight>","<SWeight>","<SSex>","<SPhoneType>","<SPhoneNum>"
	And Selects Yes Radio button for Tobacco Question for Spouse
	And Enters Last Used Tobacco Date Details for Spouse as "<STobDate>"
	And Clicks on Products used textbox for Spouse and Selects Product as "<SProduct>"
	And Selects Yes for Travel Question Non QD for Spouse
	And Enters details for Spouse as "<Country>","<Months>"
	And Clicks on next button	
	Then Application Summary Page is displayed to user
	And Verify Benefit Amount for Self as "<Benefit>" under GTLI
	And Verify Benefit Amount for Spouse as "<SBenefit>" under GTLI
	And Verify Benefit Amount for Child as "<CBenefit>" under GTLI
	And Verify Benefit Amount for Self as "<Benefit2>" under GLTDI
	And Verify Benefit Amount for Self as "<Benefit3>" under GSTDI
	And Verify Benefit Amount for Self as "<Benefit4>" under GBOEI
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
|Website| Title | Fname | Lname | State     | State1      | State2 |State3  | DOB16                | WorkHr31 | Stitle| Sfname | Slname |DOB17               |DOB64               |DOB65               |Cfname |Clname|CDob              |Csex|Cfname1 |Clname1|CDob1              |Csex1  | State1   | MonthlyIncome | Mexpense | Percresp | TotalAmt| IAmount | Company  | STotalAmt| SIAmount | SCompany | DICompany       | DIBenAmt |DIBenPeriod| RepAmount | SDICompany | SDIBenAmt | SDIBenPeriod | SRepAmount |Benefit  | SBenefit | CBenefit | Benefit2 |WaitPeriod2 |BenDuration2 | Benefit3 |WaitPeriod3               |BenDuration3| Benefit4 |WaitPeriod4 |BenDuration4                                    | MinTerm  | MaxTerm | MinLTDI  | MaxLTDI | MinSTDI | MaxSTDI | MinBOE |MaxBOE  | Bname1  | Blname1 |  Relationship1 | Perc1 | Bname2 | Blname2 |  Relationship2 | Perc2 | Bname3 |Blname3| Relationship3|Perc3 | Trust | DateTrust           | TrustPercent|SSN       | Mstatus | Height | Weight | Gender_Self | MemberId | StreetAddress     | City     | Zip  | PrimaryPhType | PrimaryPhNo | Country  | Months |  TobDate          | Product| BusinessName | BusinessType | SSSN      | SHeight|SWeight|SSex  |SPhoneType | SPhoneNum | STobDate           | SProduct| State4       |
|aoa    | Mr.   | John  | Shoey | Louisiana | Washignton  |Vermont |New York| SYSDate- 16Y/11M/29D | 31       | Mrs.  |   jane | Shoey  |SYSDate- 17Y/00M/00D|SYSDate- 64Y/11M/29D|SYSDate- 65Y/00M/00D|Allen  |Shoey |SYSDate- 04Y/0M/0D|Male|Kevin   | Shoey |SYSDate- 02Y/0M/0D |Female | New York | 10,000        | 1000     | 10       |  1200   | 800     | Ticon    | 1000     |   1000   | Delta    | Corporate World | 500      | 4         |  200      |   Ticona   |  5000     |   12         |  1000      | 550,000 | 750,000  | 10,000   | 7,500    |45 days     |2 year Plan  | 3,500    |Injury:0 days; Sick:7 days|26 weeks    | 15,000   |15 days     |Injury/Sick:18 months; Organ Donation:12 months | 20,000   | 750,000 | 500      | 7,500   | 1,000   | 3,5000  | 100    | 15,000 |  Kelly  | Shoey   | Spouse         | 99    | Jin    | Shoey   | Son            | 100   | Silvia |shoey  | Daughter     | 1    | Trutey| SYSDate-40Y/05M/10D | 100 %       | 254178968| Married | 5.10   | 150    | Male        | 25417895 | 44 Downing St #3C | New York |10014 | Business      | 2541789587  |  Belgium | 6      | SYSDate-00Y/06M/0D| Cigar  | Business 10  | Corporation  | 214578965 | 5.10   | 120   |Female| Business  | 8547898751| SYSDate- 00Y/0M/5D | Pipe    | New Hampshire|

@AoaRegression_2
Scenario Outline: <AOA_SC02> Application Submission for Self only with LI product 

	Given Test set up for "NYL" feature and "NYL_AOA" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button 
	Then Eligibility page details are displayed to user 
	Then Click on Self
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB44>"
	Then Select YES Radio button of Membership
	And Select NO Radio Button for Student Member
	And Select YES Radio Button for Practice for More than Six Months
	And Enters Self WorkHr as "<WorkHr19>"
	And Clicks on next button
	And Verify that error message is displayed for state eligibility at top of the page
	And Enter New State as "<State1>"
	And Clicks on next button
	And Verify that error message is displayed for state eligibility at top of the page
	And Enter New State as "<State2>"
	And Clicks on next button
	Then Product page details are displayed to user 
	And Verify Available Product List GroupTermLife
	And Clicks on Back or Previous button
	And Enters Self WorkHr as "<WorkHr20>"
	And Clicks on next button	
	Then Product page details are displayed to user
	And Verify Available Product List GroupTermLife,GSTDI,GBOE 
	And Clicks on Back or Previous button
	And Enters Self WorkHr as "<WorkHr30>"
	And Clicks on next button	
	Then Product page details are displayed to user
	And Verify Available Product List: GroupTermLife,GLTDI,GSTDI,GBOE 
	And Selects product GroupTermLife for Self
	And Clicks on next button  	
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
	And Confirms Imp Replacement Info for NewYork state
	And Clicks on next button	
	Then Request Coverage page is displayed to user  
	And Selects Benefit Amount for Self as "<Benefit>" under GroupTermLife 
	And Validates under GroupTermLife the Benefit Slider Range for Self as "<MinTerm>" to "<MaxTerm>"  
	And Clicks on next button	
	Then Beneficiary Page is displayed to user
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	 Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	 Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship as other "<Bname1>","<Blname1>","<Relationship1>","<Perc1>","<Desc>"     
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	 Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons                  
	And User Enters Beneficiary details as name and relationship"<Bname2>","<Blname2>","<Relationship2>","<Perc2>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	 Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname3>","<Blname3>","<Relationship3>","<Perc3>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname4>","<Blname4>","<Relationship4>","<Perc4>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname5>","<Blname5>","<Relationship5>","<Perc5>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname6>","<Blname6>","<Relationship6>","<Perc6>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname7>","<Blname7>","<Relationship7>","<Perc7>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname8>","<Blname8>","<Relationship8>","<Perc8>"                               
	And Clicks on OK button
	And Validate Maximum Contingent Beneficiaries Error message	
	And Clicks on Close button
	And Clicks on next button
	And Verify Error Message is displayed for share of Beneficiaries 	
	And Click on Edit Button for Third Contingent Individual Beneficiary under GroupTermLife
	And Enter Percentage as "<Perc9>"
	And Clicks on OK button
	And Clicks on next button	
	Then Contact Details page is displayed to user 
	And Enters Contact Details for Self Without SSN as "<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects Yes for Travel Question Non QD for Self
	And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>"
	And Selects No Radio button for Tobacco Question Self
	And Selects Residential Radio Button
	And Clicks on next button
	And Validates SSN Required Error Message for Self
	And Enters SSN "<SSN>" for Self
	And Clicks on next button
	Then Application Summary Page is displayed to user
	And Clicks on next button
	Then Authorize page details are displayed to user and confirm the term and conditions for Self 
	And Validate Fraud Notice NY in Read and Sign Box
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	And Clicks on next button to finish 
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"
	

Examples:
|Website| Title | Fname | Lname   | State       | State1      | State2   | DOB44                 |  WorkHr19 | WorkHr20 |  WorkHr30 |   Benefit  | MinTerm | MaxTerm  | Bname | Blname | Relationship | Perc | Bname1 | Blname1 | Relationship1 | Perc1 | Desc | Bname2 | Blname2 | Relationship2 | Perc2 | Bname3 | Blname3 | Relationship3 | Perc3 | Bname4      | Blname4 | Relationship4 | Perc4 | Bname5 | Blname5 | Relationship5 | Perc5  | Bname6  | Blname6 | Relationship6 |Perc6 | Bname7   | Blname7 | Relationship7 |Perc7  | Bname8 | Blname8 |  Relationship8 | Perc8 | Perc9 | SSN         | Mstatus | Height | Weight | Gender_Self | MemberId  | StreetAddress     | City        |   Zip  | PrimaryPhType | PrimaryPhNo | Country  | Months | 
|aoa    | Mr.   | Jude  | Carson  | Saskatchewan| Puerto Rico |New York  | SYSDate- 44Y/11M/29D  |  19       |   20     |   30      |   $750,000 | $20,000 | $750,000 | Adler | Carson | Son          | 20   |  Emma  | Carson  |  Other        |    30 | Aunt | Mia    |  Carson | Daughter      | 40    | Emily  | Carson  | Mother        | 10    | Christopher | Carson  | Father        | 36    | Robert | Carson  | Son           |   46   | Jennifer| Carson  | Spouse        | 10   | Patricia | Carson  |  Daughter     | 1     | Julie  | Carson  | Daughter       | 7     |  17   | 547-85-4126 | Single  | 6.1    | 200    |  Male       | 658741589 |  656 Black Pine Dr| San Leandro | 94577  | Home          | 4064987987  | Bahamas  | 8      |


@AoaRegression_3
Scenario Outline: <AOA_SC03> Application submission for Self only with DI & OO products.

	Given Test set up for "NYL" feature and "NYL_AOA" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button 	
	Then Eligibility page details are displayed to user 
	Then Click on Self
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB59>"
	Then Select YES Radio button of Membership
	And Select NO Radio Button for Student Member
	And Select NO Radio Button for Practice for More than Six Months
	And Enters Self WorkHr as "<WorkHr40>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Verify that Self icon is displayed for GroupTermLife,GLTDI,GSTDI,GBOE 	
	And Clicks on Back or Previous button
	And Enters DOB for Self as "<DOB60>"
	And Clicks on next button
	Then Product page details are displayed to user 
	And Clicks on next button
	And Validate Error Message on Product Page
	And Verify Available Product List: GroupTermLife,GBOE
	And Clicks on Back or Previous button
	And Enters DOB for Self as "<DOB44>"
	And Clicks on next button
	Then Product page details are displayed to user
	And Selects product GLTDI for Self
	And Selects product GSTDI for Self
	And Selects product GBOE for Self 
	And Clicks on next button	
	And Selects Answer as No for all additional questions of Group Disability Insurance for Self
	And Enters Monthly Income for Self as "<MonthlyIncome>"
	And Enters details for Monthly Expense and Percentage Responsible as "<Mexpense>","<Percresp>"
	And Clicks on next button	
	Then Request Coverage page is displayed to user
	And Validates under GLTDI the Benefit Slider Range as "<MinLTDI>" to "<MaxLTDI>"
	And Navigate back to Eligibility page
	And Enters DOB for Self as "<DOB45>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validates under GLTDI the Benefit Slider Range as "<MinLTDI1>" to "<MaxLTDI1>"
	And Navigate back to Eligibility page
	Then Select NO for Association Membership
	And Select NO Radio Button for Student Member
	And Select YES Radio Button for Full time Employee
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validates under GLTDI the Benefit Slider Range as "<MinLTDI2>" to "<MaxLTDI2>"
	And Validates under GSTDI the Benefit Slider Range as "<MinSTDI>" to "<MaxSTDI>"
	And Navigate back to Eligibility page
	And Clicks on next button
	And Clicks on next button
	And Enters Monthly Income for Self as "<MonthlyIncome700>"
	And Clicks on next button
	And Validates under GLTDI the Benefit Slider Range as "<MinLTDI3>" to "<MaxLTDI3>"
	And Navigate back to Eligibility page
	And Clicks on next button
	And Clicks on next button
	And Enters Monthly Income for Self as "<MonthlyIncome2000>"
	And Clicks on next button
	And Validates under GLTDI the Benefit Slider Range as "<MinLTDI4>" to "<MaxLTDI4>"
	And Navigate back to Eligibility page
	And Clicks on next button
	And Clicks on next button
	And Enters Monthly Income for Self as "<MonthlyIncome4400>"
	And Clicks on next button
	And Validates under GLTDI the Benefit Slider Range as "<MinLTDI5>" to "<MaxLTDI5>"
	And Navigate back to Eligibility page
	Then Select YES Radio button of Membership
	And Select YES Radio Button for Student Member
	And Enters Self WorkHr as "<WorkHr40>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validates Benefit Duration Dropdown for Self value under GTLDI as "<BeneDuration>"
	And Validates Benefit Amount for Self under GTLDI is displayed as "<BeneAmt>"
	And Navigate back to Eligibility page
	And Select NO Radio Button for Student Member
	And Select YES Radio Button for Practice for More than Six Months
	And Enters Self WorkHr as "<WorkHr40>"
	And Clicks on next button
	And Selects product GSTDI for Self
	And Selects product GBOE for Self
	And Clicks on next button
	And Enters details for Monthly Expense and Percentage Responsible as "<Mexpense>","<Percresp>"
	And Selects Answer as No for other business question for Group Disability Insurance for Self
	And Clicks on next button	
	Then Request Coverage page is displayed to user	
	And Selects Benefit Amount for Self as "<BenefitLT>" under GLTDI   
	And Selects Wait Period for Self as "<WaitPeriodLT>" under GLTDI                                   
	And Selects Benefit duration for Self as "<BenDurationLT>" under GLTDI                             
	And Selects Benefit Amount for Self as "<BenefitST>" under GSTDI      
	And Selects Wait Period for Self as "<WaitPeriodST>" under GSTDI                                   
	And Selects Benefit duration for Self as "<BenDurationST>" under GSTDI
	And Selects Benefit Amount for Self as "<BenefitBO>" under GBOE       
	And Selects Wait Period for Self as "<WaitPeriodBO>" under GBOE                                    
	And Selects Benefit duration for Self as "<BenDurationBO>" under GBOE
	And Clicks on next button
	Then Contact Details page is displayed to user 
	And Enters contact Details without SSN and MemberID for Self as "<Mstatus>","<Height>","<Weight>","<Gender_Self>","<StreetAddress>","<City>","<Zip>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Verify that the Beneficiary tab is disabled
	And Selects Yes for Travel Question Non QD for Self
	And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>"
	And Selects Residential Radio Button
	And Selects Yes Radio Button for Business Address
	And Selects NO Radio Button for Business Address
	And Enters Business Details as "<BusinessName>","<BusinessType>"
	And Enter Business Address Details as "<BStreet>","<BCity>","<BState>","<BZipcode>"
	And Clicks on next button
	And Validates SSN Required Error Message for Self
	And Enters SSN "<SSN>" for Self
	And Clicks on next button	
	Then Application Summary Page is displayed to user
	And Clicks on next button	
	Then Authorize page details are displayed to user and confirm the term and conditions for Self 
	And Clicks on next button	
	Then Review and sign page details are displayed to user and Click on continue and attached the sign	
	And Clicks on next button to finish 
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"

Examples: 
|Website | Title | Fname   | Lname | State  |  DOB59               | WorkHr40 | DOB60              | DOB44                | DOB45              |MonthlyIncome | Mexpense | Percresp |MinLTDI  | MaxLTDI   | MinLTDI1 | MaxLTDI1   | MinSTDI  |  MaxSTDI  | BenefitLT | WaitPeriodLT| BenDurationLT | BenefitST | WaitPeriodST              | BenDurationST | BenefitBO | WaitPeriodBO | BenDurationBO                                   | Mstatus |Height | Weight | Gender_Self | StreetAddress     | City       | Zip   | Country | Months | BusinessName  | BusinessType     | BStreet             | BCity    | BState  | BZipcode | SSN        | PrimaryPhType | PrimaryPhNo | MonthlyIncome700 | MonthlyIncome2000 | MonthlyIncome4400 |MinLTDI2   | MaxLTDI2   | MinLTDI3  |MaxLTDI3| MinLTDI4 |MaxLTDI4 |MinLTDI5 |MaxLTDI5 |BeneDuration                          |BeneAmt|
|aoa     | Mr.   | William | Clark | Florida| SYSDate- 59Y/11M/29D | 40       | SYSDate- 60Y/0M/0D | SYSDate- 44Y/11M/29D | SYSDate- 45Y/0M/0D | 4800         | 1,000    | 10       | $500    | $2,000    | $500     | $7,500     | $100     | $2,000    | 500       | 90 days     | 5 year Plan   | 1,500     | Injury:0 days; Sick:7 days|  26 weeks     | 100       | 30 days      | Injury/Sick:18 months; Organ Donation:12 months | Married | 4.10  | 180    | Male        |  2829 Downs Mnr   | Lady Lake  | 32162 | Benin   | 11     |  Stock Ex     | Sole Proprietary | 1 Main^ street Park | Newington| Colorado| 57896    |  547942439 | Business     | 2145789658   |  700             | 2000              | 4400              | $500      | $3,000     | $500      | $500   | $500     | $1,300  |   $500  |  $2,900 |Graduating Student Member: 1 Year Plan|$500   |


@AoaRegression_4
Scenario Outline: <AOA_SC04> Application submission for Spouse only with LI products (self as a Student)

	Given Test set up for "NYL" feature and "NYL_AOA" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button 
	Then Eligibility page details are displayed to user
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB27>" 
	Then Select YES Radio button of Membership
	And Select YES Radio Button for Student Member
	And Enters Self WorkHr as "<WorkHr31>"
	And Click on Spouse
	And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<DOB25>"
	And Select radio button NO for Spouse is Member
	And Clicks on next button
	Then Product page details are displayed to user 
	And Clicks on next button
	And Validate Error Message on Product Page
	And Selects product GroupTermLife for Spouse
	And Clicks on next button
	And Verify the Dependent Note Displayed on Popup Window of Dependent Coverage
	And Clicks on OK Button on Dependent Coverage Window
	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
	And Clicks on next button
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Spouse as "<Benefit>" under GroupTermLife
	And Clicks on next button
	Then Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<Gender_Self>","<StreetAddress>","<City>","<Zip>"
	And Verify that the Beneficiary tab is disabled
	And Validates Height and Weight is not displayed for Self
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects Residential Radio Button
	And Enters contact Details for Spouse without SSN as "<SSex>","<SHeight>","<SWeight>","<SPhoneType>","<SPhoneNum>"
	And Selects Yes Radio button for Tobacco Question for Spouse
	And Enters Last Used Tobacco Date Details for Spouse as "<STobDate>"
	And Clicks on Products used textbox for Spouse and Selects Product as "<SProduct>"
	And Selects Yes for Travel Question Non QD for Spouse
	And Enter datails for Outside US country and How Long months for Spouse as "<Country>","<Months>"
	And Clicks on next button
	And Validates SSN Required Error Message for Spouse
	And Enters SSN as "<SSSN>" for Spouse
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
|Website | Title| Fname |  Lname |State     |DOB27             |Stitle |Sfname |Slname |DOB25             |WorkHr31 |Benefit  |SSN       |Mstatus |Gender_Self   | StreetAddress  | City         |Zip     |PrimaryPhType |PrimaryPhNo |SHeight | SWeight | SSex  | SPhoneType|SPhoneNum  |STobDate             |SProduct      |Country |Months |SSSN        | 
|aoa     | Mr.  | Tony  | Brown  |Minnesota |SYSDate-27Y/0M/0D |Mrs.   |Ava    |Brown  |SYSDate- 25Y/0M/0D|31       | 400,000 |254178963 |Married |Male          | 820 Lavers Cir | Delray Beach | 33444  | Home         | 5478963248 | 6.1    | 190     | Female| Mobile    | 1423014789| SYSDate- 00Y/0M/20D | Nicotine gum | Egypt  | 2     | 541279868  |


@AoaRegression_5
Scenario Outline: <AOA_SC05> Application submission for Child only with LI products 

	Given Test set up for "NYL" feature and "NYL_AOA" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button 
	Then Eligibility page details are displayed to user 
	And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB64>"
	Then Select YES Radio button of Membership
	And Select NO Radio Button for Student Member
	And Select NO Radio Button for Practice for More than Six Months
	And Enters Self WorkHr as "<WorkHr20>"
	Then Click on Child
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDob>","<Csex>" 
	And Selects Married question as No for Child
	And Selects No for full time student for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname1>","<Clname1>","<CDob1>","<Csex1>"
	And Selects Married question as No for Child
	And Selects No for full time student for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname2>","<Clname2>","<CDob2>","<Csex2>"
	And Selects Married question as No for Child
	And Selects No for full time student for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname3>","<Clname3>","<CDob3>","<Csex3>"
	And Selects Married question as No for Child
	And Selects Yes for full time student for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname4>","<Clname4>","<CDob4>","<Csex4>"
	And Selects Married question as No for Child
	And Selects Yes for full time student for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname5>","<Clname5>","<CDob5>","<Csex5>"
	And Selects Married question as No for Child
	And Selects Yes for full time student for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname6>","<Clname6>","<CDob6>","<Csex6>"
	And Selects Married question as Yes for Child
	And Selects Yes for full time student for Child
	And Click on Add Child button on Screen
	And Click on Add Child button
	Then Add Child Screen is displayed and Enters Child details as "<Cfname7>","<Clname7>","<CDob7>","<Csex7>"
	And Selects Married question as Yes for Child
	And Selects Yes for full time student for Child
	And Click on Add Child button on Screen
	And Validates Add Child Button on Eligibility page is not present
	And Clicks on button to Save for later
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VPassword>"
	And Clicks OK Button Save For Later
	Then Refresh the browser
	Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive
	And Clicks on next button
	Then Product page details are displayed to user
	And Selects product GroupTermLife for Child
	And Clicks on next button     
	And Verify the Dependent Note Displayed on Popup Window of Dependent Coverage
	And Clicks on OK Button on Dependent Coverage Window
	Then Request Coverage page is displayed to user
	And Selects Benefit Amount for Child as "<CBenefit>" under GroupTermLife  
	And Validates eligible children Names displayed as "<Cfname>","<Cfname1>","<Cfname3>","<Cfname4>" under GroupTermLife
	And Clicks on next button
	Then Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<Gender_Self>","<StreetAddress>","<City>","<Zip>"
	Then Verify that the Beneficiary tab is disabled
	And Validates Height and Weight is not displayed for Self
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects Residential Radio Button
	And Clicks on next button
	Then Application Summary Page is displayed to user 
	And Verify Benefit Amount for Child "<Cfname>","<GTL_SequenceNo>" as "<CBenefit>" under GroupTermLife
	And Verify Benefit Amount for Child "<Cfname1>","<GTL_SequenceNo1>" as "<CBenefit>" under GroupTermLife
	And Verify Benefit Amount for Child "<Cfname3>","<GTL_SequenceNo2>" as "<CBenefit>" under GroupTermLife
	And Verify Benefit Amount for Child "<Cfname4>","<GTL_SequenceNo3>" as "<CBenefit>" under GroupTermLife
	And Clicks on next button
	Then Authorize page details are displayed to user 
	And Validates that Second I understand verbiage is not displayed in Read and Sign Box
	And Validates that Authorization message is not displayed in Read and Sign Box
	And Clicks on next button
	And Validate Error message for Authorization
	Then Authorize page details are displayed to user and confirm the term and conditions for Self
	And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign	
	And Clicks on next button to finish 
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"


Examples:
| Website | Title | Fname   | Lname  | State        | DOB64                |  WorkHr20 | Cfname | Clname | CDob       | Csex   | Cfname1 | Clname1 | CDob1               | Csex1   | Cfname2 | Clname2 | CDob2              | Csex2 | Cfname3 | Clname3 | CDob3             | Csex3 | Cfname4 | Clname4 | CDob4               | Csex4 | Cfname5 | Clname5 | CDob5             | Csex5 | Cfname6 | Clname6 | CDob6               | Csex6 | Cfname7 | Clname7 | CDob7                | Csex7 | CBenefit | SSN        | Mstatus | Gender_Self | StreetAddress   | City           |  Zip   |  PrimaryPhType | PrimaryPhNo | Password | VPassword |GTL_SequenceNo|GTL_SequenceNo1|GTL_SequenceNo2|GTL_SequenceNo3|
| aoa     | Prof. | Araceli | Miller | Rhode Island | SYSDate- 64Y/11M/30D |    20     | John   | Miller | CurrentDate| Male   | Silvia  | Miller  | SYSDate- 22Y/11M/29D| Female  |  Henry  | Miller  | SYSDate- 23Y/0M/0D | Male  | Tom     | Miller  | SYSDate- 23Y/0M/0D| Male  | Donna   | Miller  | SYSDate- 24Y/11M/29D| Female| Kevin   | Miller  | SYSDate- 25Y/0M/0D| Male  |  David  | Miller  | SYSDate- 22Y/11M/29D| Male  | Emma    | Miller  | SYSDate- 24Y/11M/29D | Female|  10,000  | 214236574  | Married | Female      | 300 6th Ave #405| East Greenwich | 02818  |   Mobile       | 2510302587  | Test@123 | Test@123  |1             |2              |3              |4              |


@AoaRegression_6
Scenario Outline: <AOA_SC06> Complete flow till Read & Sign Page with 20 different States one by one in loop

	Given Test set up for "NYL" feature and "NYL_AOA" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button 
	Then Eligibility page details are displayed to user
	Then Click on Self
	 And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB50>"
	Then Select YES Radio button of Membership
	And Select NO Radio Button for Student Member
	And Select YES Radio Button for Practice for More than Six Months
	And Enters Self WorkHr as "<WorkHr50>"
	And Clicks on next button
	Then Product page details are displayed to user 
	And Selects product GBOE for Self
	And Clicks on next button
	Then Selects Answer as No for other business question for Group Disability Insurance for Self
	And Enters details for Monthly Expense and Percentage Responsible as "<Mexpense>","<Percresp>"
	And Clicks on next button
	
	Then Request Coverage page is displayed to user  
	And Selects Benefit Amount for Self as "<Benefit>" under GBOE
	And Selects Wait Period for Self as "<WaitPeriod>" under GBOE                                    
	And Selects Benefit duration for Self as "<BenDuration>" under GBOE                              
	And Clicks on next button          

	Then Contact Details page is displayed to user and enters complete detail of contact page for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<Gender_Self>","<MemberId>","<StreetAddress>","<City>","<Zip>"
	And Selects "<PrimaryPhType>" and enter phonenumber "<PrimaryPhNo>" for Self at contact page
	And Selects No for Travel Question Non QD for Self
	And Selects Residential Radio Button
	And Selects Yes Radio Button for Business Address
	And Enters Business Details as "<BusinessName>","<BusinessType>"
	And Clicks on next button

	Then Application Summary Page is displayed to user 
	And Clicks on next button

	Then Authorize page details are displayed to user
	And Validates I Understand verbiage one in Read and Sign Box
	And Validates I Understand verbiage two in Read and Sign Box
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
	And Validate Fraud Notice CA in Read and Sign Box
	And Navigate back to Eligibility page
	And Enter New State as "<State2>"
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
	And Validate Fraud Notice AR in Read and Sign Box
	And Navigate back to Eligibility page
	And Enter New State as "<State4>"
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
	And Validate Fraud Notice PA in Read and Sign Box
	And Navigate back to Eligibility page
	And Enter New State as "<State6>"
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
	And Validate Fraud Notice MD in Read and Sign Box
	And Navigate back to Eligibility page
	And Enter New State as "<State8>"
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
	And Validate Fraud Notice FL in Read and Sign Box
	And Navigate back to Eligibility page
	And Enter New State as "<State10>"
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
	And Validate Fraud Notice ME in Read and Sign Box
	And Navigate back to Eligibility page
	And Enter New State as "<State12>"
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
	And Validate Fraud Notice OK in Read and Sign Box
	And Navigate back to Eligibility page
	And Enter New State as "<State15>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice TN in Read and Sign Box
	And Navigate back to Eligibility page
	And Enter New State as "<State16>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice WA in Read and Sign Box
	And Navigate back to Eligibility page
	And Enter New State as "<State17>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice VA in Read and Sign Box
	And Navigate back to Eligibility page
	And Enter New State as "<State18>"
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice WM in Read and Sign Box
	And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario>","<pdfEnable>","<pdfName>"
	And Navigate back to Eligibility page
	And Enter New State as "<State19>"
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
	And Validates additional Notes for Connecticut state
	And Navigate back to Eligibility page
	And Enter New State as "<State21>"
	And Clicks on next button
	And Clicks on next button 
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Clicks on next button
	And Validate Fraud Notice MN in Read and Sign Box
	And Validate Authorization Message MN in Read and Sign Box

Examples:
|Website | Title | Fname  | Lname  | State     | DOB50              |  WorkHr50|  Mexpense | Percresp |  Benefit | WaitPeriod |  BenDuration                                    |  SSN      | Mstatus | Height | Weight | Gender_Self | MemberId  | StreetAddress               | City      |Zip   |PrimaryPhType |PrimaryPhNo | BusinessName | BusinessType |State1     | State2  | State3   | State4    | State5       | State6       | State7   | State8               | State9  | State10 | State11 | State12    | State13  | State14  | State15   | State16    | State17  | State18 | State19    |State20    |State21   |pdfScenario |pdfScenario1 |pdfEnable|pdfName                               |pdfName1                   |
| aoa    | Mrs.  | Cathey | Thomas | Colorado  | SYSDate- 50Y/0M/0D | 50       | 1000      | 5        |  7,400   | 15 days    | Injury/Sick:18 months; Organ Donation:12 months | 547896874 | Single  | 5.1    | 150    | Female      | 587412369 |  5555 E Briarwood Ave #1203 | Littleton |80122 | Business     | 5478963571 | Kevin C      | Corporation  |California | Alabama | Arkansas | Louisiana | Pennsylvania | Rhode Island | Maryland | District of Columbia | Florida | Kansas  | Maine   | New Jersey | New York | Oklahoma | Tennessee | Washington | Virginia | Wyoming | New Mexico |Connecticut|Minnesota |AOASC6_WM   |AOASC6_NM    |1        |Important Notice All except NM 2 08.12|Important Notice NM 2 08.12|	
