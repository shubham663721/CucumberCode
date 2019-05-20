Feature: Cat Test

@CatSC_01
Scenario Outline: <CATSC01> Application submission for Self and Child and with all the products

	Given Test set up for "NYL" feature and "NYL_CAT" scenario
 	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user and enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>"
	And Select NO radio button for affiliated with a sponsoring
	And Click on Self  
    And Click on Child
	
    And Enters Sponsor name as "<Sponsor>"
    And Selects Affiliation under eligibility as "<Affiliation>"
	And Validate that NEXT button is Disabled 
	Then selects Yes Radio button for affiliated with a sponsoring
    And Click on Add Child button 
    Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>"
    And Click on Add Child button on Screen
    And Clicks on next button
    And Verify that error message is displayed for state eligibility at top of the page
    And Enter New State as "<State1>"
    And Clicks on next button
	Then Product page details are displayed to user
    And Verify Available Product List Group Term LI, LifeNinetyFive and ADDI displayed for self
    And Clicks on next button
    And Validate Error Message on Product Page
    And Clicks on Back or Previous button
    And Enters DOB for Self as "<DOB1>"
    And Clicks on next button
    And Verify Available Product List Group Term LI and ADDI displayed
    And Verify Product LifeNinetyFive is not displayed
    And Clicks on Back or Previous button
    And Enters DOB for Self as "<DOB2>"
    And Clicks Edit button for Child Added
    And Enters DOB for Child as "<CDOB1>"
    And Click on Add Child button on Screen
    And Clicks on next button
    And Verify Available Product List LifeNinetyFive displayed for Self
    
    And Verify Group Term LI and ADDI not displayed for Self
    And Verify Group Term LI is displayed for Child
    And Clicks on Back or Previous button
    And Enters DOB for Self as "<DOB3>"
    And Clicks Edit button for Child Added
    And Enters DOB for Child as "<CDOB2>"
    And Click on Add Child button on Screen
    And Clicks on next button
    And Verify Available Product List Group Term LI, LifeNinetyFive and ADDI displayed for self
    And Verify Group Term LI is displayed for Child
    And Selects product Group Term LI for Child
    And Selects product Group Term LI, LifeNinetyFive, ADDI for Self
    And Clicks on next button

	Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
    And Clicks on next button

	Then Request Coverage page is displayed to user 
    And Validates under Group Term LI the Benefit Slider Range for Self as "<MinBamount>", "<MaxBamount>"
    And Selects Benefit Amount for Self as "<Benefit>" under GroupTermLife
    And Verify under Group Term LI the Benefit Amount for Child as "<Cbenefit> "
    And Validates under LifeNinetyFive the Benefit Slider Range for Self as "<MinBamount1>", "<MaxBamount1>"
    And Selects Benefit Amount for Self as "<Benefit1>" under LifeNinetyFive
    And Validates under ADDI the Benefit Slider Range for Self as "<MinBamount2>", "<MaxBamount2>"
    And Selects Benefit Amount for Self as "<Benefit2>" under ADDI_cat
    And Clicks on next button

	Then Request Coverage - Health Questions page is displayed to user
    And Clicks on next button
    And Validate error message for required question
    
    And Request Coverage - selects No for all Medical history questions
    
    And Clicks on next button

	Then Beneficiary Page is displayed to user
    And Clicks on Add Beneficiary Button for Self under GroupTermLife
    Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
    And User Enters Beneficiary details as "<Trust>","<DateTrust>"
    And Clicks on OK button
    And Verify that the Percent Displayed for Trust under GroupTermLife is "<TrustPercent>" 
    And Clicks on Add Beneficiary Button for Self under GroupTermLife
    Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
    And User Enters Beneficiary details as "<Trust1>","<Datetrust1>"
    And Clicks on OK button
    And Validates error message on Add Beneficiary page-Only one Trust is allowed as Primary
    Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
    And Clicks on OK button
    And Delete Contingent Beneficiary 
    And Delete box is displayed and clicks on Yes
    And Clicks on Add Beneficiary Button Under LifeNintyFive for Self
    Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
    And Selects the First Option from Existing Beneficiaries List and select Type as "<BeneType1>" for Trust
    And Clicks on OK button
    And Clicks on Add Beneficiary Button Under ADDI for Self
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons 
    And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button Under ADDI for Self
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons 
    And User Enters Beneficiary details as name and relationship"<Bname1>","<Blname1>","<Relationship1>","<Perc1>"
    And Clicks on OK button
    And Clicks on next button
    And Clicks on Back or Previous button
    And Clicks on Delete second Individual Beneficiary under ADDI for self
    And Delete box is displayed and clicks on Yes
    And Clicks on next button
    And Verify Error Message is displayed for share of Beneficiaries
    And Clicks on Add Beneficiary Button Under ADDI for Self
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons 
    And User Enters Beneficiary details as name and relationship"<Bname2>","<Blname2>","<Relationship2>","<Perc2>"
    And Clicks on OK button
    And Clicks on next button
	
	And Enters contact Details for Self without MemberShipID as "<SSN_Self>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"
	
	And Selects No for Travel Question Non QD for Self
	And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
    
    And Selects Residential Radio Button
    And Selects Yes Radio button for Tobacco Question
    And Enters Last Used Tobacco Date Details for Self as "<TobDate>"
    And Clicks on Products used textbox for Self and Selects Product as "<Product>"
    And Clicks on next button

	Then Application Summary Page is displayed to user
    And Verify Benefit Amount for Self as "<Benefit>" under Group Term LI
    And Verify Benefit Amount for Self as "<Benefit1>" under LifeNinetyFive
    And Verify Benefit Amount for Self as "<Benefit2>" under ADDI
    And Verify Benefit Amount for Child as "<Cbenefit>" under Group Term LI
    And Clicks on next button
	Then Authorize page details are displayed to user 
    And Clicks on next button
    And Validate Error message for Authorization
     
    And Validate Fraud Notice WM in Read and Sign Box
    And Validate Consent message in Read and Sign Box
    And Authorize page details are displayed to user and confirm the term and conditions for Self
    And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
    
    And Clicks on next button to finish
	Then Thank you page is displayed to user
    And Verify that Confirmation number is generated for "<Website>"

Examples:
|Website|Title|Fname|Lname|State  |DOB                |Sponsor |Affiliation|Cfname|Clname|CDOB               |Csex|State1 |DOB1               |DOB2               |CDOB1               |DOB3               |CDOB2              |MinBamount|MaxBamount|Benefit|Cbenefit|MinBamount1|MaxBamount1|Benefit1|MinBamount2|MaxBamount2|Benefit2|Trust                    |DateTrust |TrustPercent |Trust1                      |Datetrust1|Bname |Blname|Relationship|Perc|Bname1|Blname1|Relationship1|Perc1|Bname2|Blname2|Relationship2|Perc2|SSN_Self |Mstatus|Height |Weight|Sex |Street         |City        |Zipcode|PhoneType|PhoneNum  |TobDate   |Product        |BeneType1|
|CAT    |Mr.  |John |Smith|Alberta|SYSDate-50Y/00M/00D|AIG     |Alumnus/a  |Alex  |Smith |SYSDate-18Y/00M/00D|Male|Wyoming|SYSDate-49Y/11M/29D|SYSDate-75Y/00M/00D|SYSDate-17Y/11M/29D |SYSDate-74Y/11M/11D|SYSDate-00Y/00M/14D|$12,500   |$375,000   |32500 |$10000  |$10000     |$100000    |21000   |$50000     |$250,000   |225000  |American India Foundation|02/25/2010|100 %        |American Indian College Fund|07/22/2011|Gordon|Smith |Spouse      |50  |Tim   |Smith  |Son          |50   |Emily |Smith  |Mother       |50   |253468975|Married|5.7    |180   |Male|01 Main Street |Green River |54612  |Mobile   |6485697452|01/01/2017|Chewing Tobacco|Primary  |



@CatSC_02
Scenario Outline: <CATSC02> Application Submission for Self with all eligible products 

	Given Test set up for "NYL" feature and "NYL_CAT" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user and enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>"
	And Select NO radio button for affiliated with a sponsoring
    And Click on Self  
    And Enters Sponsor name as "<Sponsor>"
    And Selects Affiliation under eligibility as "<Affiliation>"
    
    And Validate that NEXT button is Disabled
    And selects Yes Radio button for affiliated with a sponsoring
    And Clicks on next button
	Then Product page details are displayed to user
    And Verify Available Product List Group Term LI and ADDI displayed
    And Verify Product LifeNinetyFive is not displayed 
    And Clicks on Back or Previous button
    And Enter New State as "<State1>"
    And Clicks on next button
	Then Product page details are displayed to user
    And Verify Available Product List Group Term LI, LifeNinetyFive and ADDI displayed for self
    And Clicks on Back or Previous button
    And Enters DOB for Self as "<DOB1>"
    And Clicks on next button
    And Validate Age Restriction Message
    And Enters DOB for Self as "<DOB2>"
    And Clicks on next button
    And Validate Age Restriction Message
    And Enters DOB for Self as "<DOB3>"
    And Clicks on next button
	Then Product page details are displayed to user
    And Verify Available Product List LifeNinetyFive displayed for Self
    And Verify Group Term LI and ADDI not displayed for Self
    And Selects LifeNinetyFive Product for self 
    And Clicks on next button
    Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
    
    #--And Selects No for Do you have other life insurance in force for self
    #--And Selects No for Do you have other insurance applications pending for self
    
    And Clicks on next button
	Then Request Coverage page is displayed to user 
    And Validates under LifeNinetyFive the Benefit Slider Range for Self as "<MinBamount>", "<MaxBamount>"
    And Navigate back to Eligibility page
    And Enters DOB for Self as "<DOB4>"
    And Clicks on next button
    Then Product page details are displayed to user
    And Verify Available Product List Group Term LI, LifeNinetyFive and ADDI displayed for self
    And Selects product Group Term LI, ADDI for Self
    And Clicks on next button
	Then Product: Additional Questions page details are displayed to user
    And Clicks on next button
	Then Request Coverage page is displayed to user 
    And Validates under Group Term LI the Benefit Slider Range for Self as "<MinBamount1>", "<MaxBamount1>"
    And Validates under LifeNinetyFive the Benefit Slider Range for Self as "<MinBamount3>", "<MaxBamount3>"
    And Validates under ADDI the Benefit Slider Range for Self as "<MinBamount2>", "<MaxBamount2>"
	And Navigate back to Eligibility page
    And Enters DOB for Self as "<DOB5>"
    And Clicks on next button
	Then Product page details are displayed to user
    And Verify Available Product List Group Term LI, LifeNinetyFive and ADDI displayed for self
    
    And Clicks on next button
	Then Product: Additional Questions page details are displayed to user
    And Clicks on next button
	Then Request Coverage page is displayed to user 
    And Validates under Group Term LI the Benefit Slider Range for Self as "<MinBamount4>", "<MaxBamount4>"
    And Validates under LifeNinetyFive the Benefit Slider Range for Self as "<MinBamount3>", "<MaxBamount3>"
    And Validates under ADDI the Benefit Slider Range for Self as "<MinBamount6>", "<MaxBamount6>"
	And Navigate back to Eligibility page
    And Enters DOB for Self as "<DOB6>"
    And Clicks on next button
	Then Product page details are displayed to user
    And Verify Available Product List Group Term LI, LifeNinetyFive and ADDI displayed for self
    
    And Clicks on next button
	Then Product: Additional Questions page details are displayed to user
    And Clicks on next button
	Then Request Coverage page is displayed to user 
    And Validates under Group Term LI the Benefit Slider Range for Self as "<MinBamount7>", "<MaxBamount7>"
    And Selects Benefit Amount for Self as "<Benefit>" under GroupTermLife
    And Validates under ADDI the Benefit Slider Range for Self as "<MinBamount9>", "<MaxBamount9>"
    And Selects Benefit Amount for Self as "<Benefit1>" under ADDI_cat
    And Clicks on next button
	Then Request Coverage - Health Questions page is displayed to user
	And Navigate back to Products page
    
    And Clicks on next button
	Then Product: Additional Questions page details are displayed to user
    
    And Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Self 
    And Enter additional details as "<TotalAmt>","<IndAmt>","<Cname>"
    
    #And Selects Yes for Do you have other life insurance in force for Self
    #And Enters Total Amount as "<TotalAmt>" for self
    #And Selects Yes for life insurance applied for intended to replace for self
    #And Selects Yes for Do you have other insurance applications pending for self
    #And Enters  Amount as "<IndAmt>", "<Cname>" for self
    
    And Clicks on next button
	Then Request Coverage page is displayed to user 
    And Validates under LifeNinetyFive the Benefit Slider Range for Self as "<MinBamount3>", "<MaxBamount3>"
    And Selects Benefit Amount for Self as "<Benefit2>" under LifeNinetyFive
    And Clicks on next button
	Then Request Coverage - Health Questions page is displayed to user
    
    #And Verify Health  questions rendered
    
    And Select YES for Are you now taking any prescribed medication
    And Clicks on Add Details for Prescribed Medication
    And Explanation Screen is displayed to User and Enters details as "<MMOnset>","<YYYYOnset>","<Condition>","<PhyDetails>"
    And Clicks on Add Button 
    And Select YES for During the past five years have you ever been medically diagnosed by a physician
    And Clicks on Add Details for Physically diagnosed 
    And Explanation Screen is displayed to User and Enters details as "<MMOnset1>","<YYYYOnset1>","<Condition1>","<PhyDetails1>"
    And Clicks on Add Button 
    And Select YES for During the past five years have you ever been counselled
    And Clicks on Add Details for Alcohol Drugs
    And Explanation Screen is displayed to User and Enters details as "<MMOnset2>","<YYYYOnset2>","<Condition2>","<PhyDetails2>"
    And Clicks on Add Button
    And Clicks on next button
	Then Beneficiary Page is displayed to user
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname1>","<Blname1>","<Relationship1>","<Perc1>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	
	And User Enters Beneficiary details as name and relationship as other "<Bname2>","<Blname2>","<Relationship2>","<Perc2>","<Desc>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	
	And User Enters Beneficiary details as name and relationship"<Bname3>","<Blname3>","<Relationship3>","<Perc3>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	
	And User Enters Beneficiary details as name and relationship as other "<Bname4>","<Blname4>","<Relationship4>","<Perc4>","<Desc1>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	
	And User Enters Beneficiary details as name and relationship"<Bname5>","<Blname5>","<Relationship5>","<Perc5>"
	And Clicks on OK button
	And Validate Maximum Beneficiaries Error message
	And Clicks on Close button
	And Clicks on next button
	And Verify Error Message is displayed for share of Beneficiaries
	And Clicks on Edit button for fourth primary Beneficiary for Self under GroupTermLife
	
	And Add Beneficiary page will be displayed to user and User Enters Beneficiary details as "<Perc6>" for Individual Primary
	
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	
	And User Enters Beneficiary details as name and relationship"<Bname6>","<Blname6>","<Relationship6>","<Perc7>"
	And Clicks on OK button
	
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	
	And User Enters Beneficiary details as name and relationship"<Bname7>","<Blname7>","<Relationship7>","<Perc8>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	
	And User Enters Beneficiary details as name and relationship"<Bname8>","<Blname8>","<Relationship8>","<Perc9>"
	And Clicks on OK button
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname9>","<Blname9>","<Relationship9>","<Perc10>"
	And Clicks on OK button
	
	And Clicks on Add Beneficiary Button for Self under GroupTermLife
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	
	And User Enters Beneficiary details as name and relationship as other "<Bname10>","<Blname10>","<Relationship10>","<Perc11>","<Desc2>"
	And Clicks on OK button
	And Validate Maximum Contingent Beneficiaries Error message
	And Clicks on Close button
	And Clicks on next button
	And Verify Error Message is displayed for share of Beneficiaries
	
	And Clicks on Edit button for eighth Beneficiary for Self under GroupTermLife
	And Add Beneficiary page will be displayed to user and User Enters Beneficiary details as "<Perc12>" for Individual Primary
	And Clicks on OK button
	
	And Clicks on next button
	Then Contact Details page is displayed to user 
    And Clicks on next button
    And Validate error message for required question
    And Enters contact Details without SSN and MemberID for Self as "<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"
	
    And Selects Yes for Travel Question-TwelveMonths and Enters details for Self as "<Country>", "<Months>"
    And Enters Account Number as "<AccNum>"
    And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
    
    
    And Selects Yes Radio Button for Business Address
    And Selects NO Radio Button for Business Address
    And Enters Business Address Details as "<BusinessName>","<BusinessType>","<Bstreet>","<Bcity>","<Bstate>","<Bzipcode>"
    And Selects Yes Radio button for Tobacco Question
    And Enters Last Used Tobacco Date Details for Self as "<TobDate>"
    And Clicks on Products used textbox for Self and Selects Product as "<Product>"
    And Clicks on next button
    And Validate error message for required question
    And Enters SSN "<SSN>" for Self
    And Clicks on next button
	Then Application Summary Page is displayed to user
    And Verify Benefit Amount for Self as "<Benefit>" under Group Term LI
    And Verify Benefit Amount for Self as "<Benefit2>" under LifeNinetyFive
    And Verify Benefit Amount for Self as "<Benefit1>" under ADDI
    And Clicks on next button
	Then Authorize page details are displayed to user 
    And Validates Fraud Notice in Read and Sign Box
    And Validate Consent message in Read and Sign Box
    And Authorize page details are displayed to user and confirm the term and conditions for Self 
    And Clicks on next button
	
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
	
	#Then Please Review page is displayed to user and Clicks on Continue Button
    #And Clicks on Start Button
    #And Clicks on Sign Button
    #And Clicks on Add and adopt sign
    
    And Clicks on next button to finish
	Then Thank you page is displayed to user
    And Verify that Confirmation number is generated for "<Website>"

Examples:
|Website |Title |Fname |Lname |State   |DOB                 |Sponsor |Affiliation |State1   |DOB1               |DOB2               |DOB3                    |DOB4                |MinBamount|MaxBamount     |MinBamount1|MaxBamount1|MinBamount2|MaxBamount2|MinBamount3|MaxBamount3|DOB5               |MinBamount4|MaxBamount4|MinBamount6|MaxBamount6|DOB6               |MinBamount7|MaxBamount7|MinBamount9|MaxBamount9 |Benefit|Benefit1|TotalAmt|IndAmt|Cname          |Benefit2|MMOnset|YYYYOnset|CondMDetails                                 |PhyDetails                          |MMOnset1 |YYYYOnset1|CondMDetails1                                 |PhyDetails1                         |MMOnset2|YYYYOnset2|CondMDetails2                                 |PhyDetails2                         |Bname1|Blname1|Relationship1|Perc1|Bname2|Blname2|Relationship2|Perc2|Desc  |Bname3|Blname3|Relationship3|Perc3|Bname4|Blname4|Relationship4|Perc4|Desc1    |Bname5  |Blname5|Relationship5|Perc5|Perc6|Bname6|Blname6|Relationship6|Perc7|Bname7|Blname7|Relationship7|Perc8|Bname8|Blname8|Relationship8|Perc9|Bname9 |Blname9|Relationship9|Perc10|Bname10|Blname10|Relationship10|Perc11|Desc2    |Perc12|Mstatus|Height   |Weight|Sex |Street                      |City       |Zipcode|PhoneType|PhoneNum |Country|Months|AccNum |BusinessName     |BusinessType|Bstreet                  |Bcity |Bstate|Bzipcode|TobDate   |Product|SSN      |
|CAT     |Mr.   |Max   |Welch |Texas   |SYSDate- 50Y/11M/29D|AIG     |Student     |Hawaii   |SYSDate-17Y/11M/29D|SYSDate-76Y/00M/00D|SYSDate-75Y/11M/29D     |SYSDate-64Y/11M/29D |10000     |20000          |25000      |750000     |50000      |1000000    |10000      |100000     |SYSDate-69Y/11M/29D|18750      |562500     |50000      |500000     |SYSDate-74Y/11M/29D|12500      |375000     |50000      |250000      |42500  |150000  |6000    |4500  |Asian Solutions|43000   |10     |1982     |Hepatitis treatment, now good, 09th Apr 1990 |585 W Main St, Green River, UT 84525|07       |1980      |Hepatitis treatment, now good, 15th Jan 1985  |585 W Main St, Green River, UT 84525|03      |1985      |Alcohol addiction, now good, 10th Nov 1985    |585 W Main St, Green River, UT 84525|Heena |Welch  |Spouse       |25   |John  |Peake  |Other        |25   |Friend|Henry |Welch  |Son          |25   |Bravo |Lambert|Other        |15   |Neighbour|Rosey   |Welch  |Daughter     |10   |25   |Simon |Welch  |Mother       |25   |Kevin |Welch  |Father       |25   |Andrew|Welch  |Son          |25   |Martina|Welch  |Daughter     |15    |Alex   |Gray    |Other         |10    |Neighbour|25    |Widowed|5.1      |185   |Male|7360 NW. Old York St. Hauula|Hawaii City|96717  |Home     |954821548|Benin  |8     |AC00157|Netgear Solutions|Partnership | 15208, West 119th Street|Olathe|Hawaii|66062   |01/01/2000|Cigar  |356897532|



@CatSC_03
Scenario Outline: <CATSC03> Application Submission for Child with Group Term LI

	Given Test set up for "NYL" feature and "NYL_CAT" scenario
	Given Customer navigate to NYL "<Website>"
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user and enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>"
	And Click on Child  
	And Enters Sponsor name as "<Sponsor>"
	And Selects Affiliation under eligibility as "<Affiliation>"
	And selects Yes Radio button for affiliated with a sponsoring
    And Click on Add Child button 
    
    Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDOB>","<Csex>" 
    And Click on Add Child button on Screen
    And Clicks on next button
    And Verify that error message is displayed for state eligibility at top of the page
    
    And Enter New State as "<State1>"
    And Click on Add Child button 
    Then Add Child Screen is displayed and Enters Child details as "<Cfname1>","<Clname1>","<CDOB1>","<Csex1>"
    And Click on Add Child button on Screen
    And Click on Add Child button 
    Then Add Child Screen is displayed and Enters Child details as "<Cfname2>","<Clname2>","<CDOB2>","<Csex2>"
    And Click on Add Child button on Screen
    And Click on Add Child button 
    Then Add Child Screen is displayed and Enters Child details as "<Cfname3>","<Clname3>","<CDOB3>","<Csex3>"
    And Click on Add Child button on Screen
    And Click on Add Child button 
    Then Add Child Screen is displayed and Enters Child details as "<Cfname4>","<Clname4>","<CDOB4>","<Csex4>"
    And Click on Add Child button on Screen
    And Click on Add Child button 
    Then Add Child Screen is displayed and Enters Child details as "<Cfname5>","<Clname5>","<CDOB5>","<Csex5>"
    And Click on Add Child button on Screen
    And Click on Add Child button 
    Then Add Child Screen is displayed and Enters Child details as "<Cfname6>","<Clname6>","<CDOB6>","<Csex6>"
    And Click on Add Child button on Screen
    And Click on Add Child button 
    Then Add Child Screen is displayed and Enters Child details as "<Cfname7>","<Clname7>","<CDOB7>","<Csex7>"
    And Click on Add Child button on Screen
    And Validates Add Child Button on Eligibility page is not present
    And Clicks on next button
	Then Product page details are displayed to user
    And Verify Group Term LI is displayed for Child
    And Verify Product LifeNinetyFive is not displayed
    And Verify ADDI is not available for Child
    
    And Selects product Group Term LI for Child
    And Clicks on next button
    And Click YES for Dependent Coverage information
	Then Request Coverage page is displayed to user 
    And Verify under Group Term LI the Benefit Amount for Child as "<Cbenefit>"
    
    And Validates "<Cfname>","<Cfname3>","<Cfname4>", "<Cfname5>","<Cfname6>" are available for Eligible Child(ren) under Group Term LI
	And Validates "<Cfname1>","<Cfname2>","<Cfname7>" are not displayed for Eligible Child(ren) under eligible child Group Term LI
    
    And Clicks on next button
	Then Contact Details page is displayed to user 
    
    
    And Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<Sex>","<Street>","<City>","<Zipcode>"
    And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
    
    And Selects Residential Radio Button
    And Clicks on next button
	Then Application Summary Page is displayed to user
    And Verify under Group Group Term LI for "<Cfname>", "<Clname>" coverage amount as "<Cbenefit>"
    
    And Verify under Group Group Term LI for "<Cfname3>", "<Clname3>" coverage amount as "<Cbenefit>"
    
    And Verify under Group Group Term LI for "<Cfname4>", "<Clname4>" coverage amount as "<Cbenefit>"
    
    And Verify under Group Group Term LI for "<Cfname5>", "<Clname5>" coverage amount as "<Cbenefit>"
    
    And Verify under Group Group Term LI for "<Cfname6>", "<Clname6>" coverage amount as "<Cbenefit>"
    
    And Clicks on next button
	Then Authorize page details are displayed to user 
	And Validates that Second I understand verbiage is not displayed in Read and Sign Box
	And Validates that Authorization message is not displayed in Read and Sign Box
    
    And Validate Fraud Notice WM in Read and Sign Box
    And Validate Consent message TX in Read and Sign Box
    And Authorize page details are displayed to user and confirm the term and conditions for Self 
    And Clicks on next button
	Then Review and sign page details are displayed to user and Click on continue and attached the sign
    
    And Clicks on next button to finish
	Then Thank you page is displayed to user
    And Verify that Confirmation number is generated for "<Website>"

Examples:
|Website |Title  |Fname   |Lname |State     |DOB                |Sponsor |Affiliation         |Cfname|Clname|CDOB               |Csex  |State1|State3 |Cfname1|Clname1            |CDOB1              |Csex1 |Cfname2|Clname2|CDOB2              |Csex2|Cfname3|Clname3|CDOB3              |Csex3 |Cfname4|Clname4|CDOB4              |Csex4 |Cfname5|Clname5|CDOB5              |Csex5 |Cfname6|Clname6|CDOB6              |Csex6 |Cfname7|Clname7|CDOB7      |Csex7 |Cbenefit|SSN      |Mstatus|Sex   |Street                      |City      |Zipcode|PhoneType |PhoneNum  | 
|CAT     |Mrs.   |Felicity|Lewis |Washington|SYSDate-50Y/00M/00D|Colgate |Faculty/Staff Member|Neil  |Lewis |SYSDate-17Y/11M/29D|Male  |Texas |Diana  |Lewis  |Benjamin           |SYSDate-18Y/00M/00D|Female|Jacob  |Lewis  |SYSDate-00Y/00M/13D|Male |Amanda |Lewis  |SYSDate-00Y/00M/14D|Female|Frank  |Lewis  |SYSDate-10Y/00M/00D|Male  | Trevor|Lewis  |SYSDate-00Y/01M/00D|Male  |Fiona  |Lewis  |SYSDate-01Y/00M/00D|Female|Melanie|Lewis  |Currentdate|Female|$10000  |265485147|Married|Female|8560 W. Woodsman Lane Dallas|Texas City|75261  |Home      |0225488747|


@CatSC_04
Scenario Outline: <CATSC04> Validation Read & Sign Page with different States one by one in loop	
	
	Given Test set up for "NYL" feature and "NYL_CAT" scenario	
	Given Customer navigate to NYL "<Website>"	
	When Clicks on Apply now button
	Then Eligibility page details are displayed to user and enter details for Self as "<Title>", "<Fname>", "<Lname>" , "<State>", "<DOB>"
    And Click on Self  	
    And Enters Sponsor name as "<Sponsor>"	
    And Selects Affiliation under eligibility as "<Affiliation>"
    And selects Yes Radio button for affiliated with a sponsoring	
    And Clicks on next button	
	Then Product page details are displayed to user	
    And Verify Available Product List Group Term LI, LifeNinetyFive and ADDI displayed for self
    
    And Selects product GroupTermLife for Self	
    And Clicks on next button	
	Then Product: Additional Questions page details are displayed to user
		
    And Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Self 
	And Enter additional details as "<TotalAmt>","<IndAmt>","<Cname>"
	
    And Clicks on next button	
	Then Request Coverage page is displayed to user 	
    And Selects Benefit Amount for Self as "<Benefit>" under GroupTermLife 
    And Clicks on next button	
	Then Beneficiary Page is displayed to user	
    And Clicks on Add Beneficiary Button Under Group Term LI for Self	
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons 	
    And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"	
    And Clicks on OK button	
    And Clicks on Skip Beneficiary Button	
    And Delete box is displayed and clicks on Yes	
	Then Contact Details page is displayed to user 	
    
    Then Enters contact Details for Self without MemberShipID as "<SSN>","<Mstatus>","<Height>","<Weight>","<Sex>","<Street>","<City>","<Zipcode>"    
    And Selects No for Travel Question Non QD for Self
    And Selects "<PhoneType>" and enter phonenumber "<PhoneNum>" for Self at contact page
    	
    And Selects Residential Radio Button	
    And Selects No Radio button for Tobacco Question Self 	
	
	And Clicks on button to Save for later 	
	Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VerifyPass>" 	
	And Clicks OK Button Save For Later 	
	Then Refresh the browser 	
	
	Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive under CAT
	
	Then Contact Details page is displayed to user 	
	And Clicks on next button	
	
	Then Application Summary Page is displayed to user 	
    And Clicks on next button	
	Then Authorize page details are displayed to user  	
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
    And Validate Fraud Notice PA in Read and Sign Box	
	And Navigate back to Eligibility page 	
    And Enter New State as "<State5>"	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Validate Fraud Notice RI in Read and Sign Box	
	And Navigate back to Eligibility page 	
    And Enter New State as "<State6>"	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Validate Fraud Notice MD in Read and Sign Box	
	And Navigate back to Eligibility page 	
    And Enter New State as "<State7>"	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Validate Fraud Notice DC in Read and Sign Box	
	And Navigate back to Eligibility page 	
    And Enter New State as "<State8>"	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Validate Fraud Notice FL in Read and Sign Box	
	And Navigate back to Eligibility page 	
    And Enter New State as "<State9>"	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Validate Fraud Notice KS in Read and Sign Box	
	And Navigate back to Eligibility page 	
    And Enter New State as "<State10>"	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Validate Fraud Notice ME in Read and Sign Box	
	And Navigate back to Eligibility page 	
    And Enter New State as "<State11>"	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Validate Fraud Notice NJ in Read and Sign Box	
	And Navigate back to Eligibility page 	
    And Enter New State as "<State12>"	
    And Clicks on next button	
    And Clicks on next button	
    And Confirms Imp Replacement Info for NewYork state	
    And Validate Imp Replacement Info text for NewYork state	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Verify that fraud notice is not rendered at Authorization page	
	And Navigate back to Eligibility page 	
    And Enter New State as "<State13>"	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Validate Fraud Notice OK in Read and Sign Box	
	And Navigate back to Eligibility page 	
    And Enter New State as "<State14>"	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Validate Fraud Notice TN in Read and Sign Box	
	And Navigate back to Eligibility page 	
    And Enter New State as "<State15>"	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Validate Fraud Notice VA in Read and Sign Box	
	And Navigate back to Eligibility page 	
    And Enter New State as "<State16>"	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    #--And Validates Fraud Notice in Read and Sign Box
    
    And Validate Fraud Notice WM in Read and Sign Box	
    And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario>","<pdfEnable>","<pdfName>" 	
	And Navigate back to Eligibility page 	
    And Enter New State as "<State17>"	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button	
    #--And Validates Fraud Notice in Read and Sign Box
    
    And Validate Fraud Notice NM in Read and Sign Box	
    And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario1>","<pdfEnable>","<pdfName1>"	
	
Examples:	
|Website|Title|Fname |Lname|State   |DOB                |Sponsor|Affiliation               |TotalAmt|IndAmt|Cname          |Benefit|Bname|Blname|Relationship|Perc|SSN      |Mstatus|Height|Weight|Sex |Street             |City         |Zipcode|PhoneType|PhoneNum  |Password|VerifyPass|State1     |State2  |State3   |State4       |State5       |State6   |State7               |State8  |State9  |State10|State11    |State12 |State13 |State14  |State15 |State16|State17   |pdfScenario|pdfScenario1|pdfEnable|pdfName                               |pdfName1                   |	
|CAT    |Mr.  |Edward|Peake|Colorado|SYSDate-52Y/00M/00D|Lenovo |Spouse or domestic partner|6500    |4500  |Asian Solutions|250000 |Maria|Peake |Daughter    |100 |625871254|Married|5.2   |185   |Male|53rd Street Houston|Colorado City|75261  |Home     |0242265841|Test@123|Test@123  |California |Alabama |Arkansas |Pennsylvania |Rhode Island |Maryland |District of Columbia |Florida |Kansas  |Maine  |New Jersey |New York|Oklahoma|Tennessee|Virginia|Wyoming|New Mexico|CAT04_WM   |CAT04_NM    |1        |Important Notice All except NM 2 08.12|Important Notice NM 2 08.12|	
