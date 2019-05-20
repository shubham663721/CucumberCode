Feature: WeapaGI Test

@WaepagiSC_01
Scenario Outline:<WAEPAGISC01>Application Submission for Self with all eligible products

	Given Test set up for "NYL" feature and "NYL_WAEPAGI" scenario
	Given Customer navigate to NYL "<Website>"
	Then Eligibility details are displayed to user
	And Select NO for Association Membership
	And Validates check eligibility button is disabled
	And Select YES Radio button of Membership
	And Validates check eligibility button is enabled

	And Selects YES Radio button for Armed forces
	And Validates check eligibility button is disabled
	And Selects NO Radio button for Armed forces
	And Validates check eligibility button is enabled

	And Selects NO Radio button for Federal Government
	And Validates check eligibility button is disabled
	And  Selects YES Radio button for Federal Government
	And Enter details for Employment Date as "<EmpDate>"
	And Validates check eligibility button is disabled

	And  Enter details for Employment Date as "<EmpDate1>"	
	And Validates check eligibility button is enabled

	And  Enter New State as "<StateMT>"
	And  Enters DOB for Self as "<DOB18>"
	And Clicks on Check eligibility Button
	And Verify that error message is displayed for state eligibility at top of the page		

	And  Enter New State as "<StateNovaScotia>"
	And Clicks on Check eligibility Button
	And Verify that error message is displayed for state eligibility at top of the page		

	And  Scroll to Membership Radio button
	
	And  Enters DOB for Self as "<DOB17>"
	And  Enter New State as "<StateNY>"
	
	And Clicks on Check eligibility Button
	And Validate Age Restriction Message		

	And Clicks on Edit Button
	And  Enters DOB for Self as "<DOB70>"
	And Clicks on Check eligibility Button
	And Validate Age Restriction Message

	And  Clicks on Edit Button
	And  Enters DOB for Self as "<DOB69>"
	And Clicks on Check eligibility Button
	Then Verify Additional Questions details are displayed

	And  Clicks on Edit Button
	And  Enters DOB for Self as "<DOB18>"
	And Clicks on Check eligibility Button

	Then Verify Additional Questions details are displayed
	And  Selects Yes for Do you have other life insurance in force for Self
	And  Selects Yes for life insurance applied for intended to replace for Self
	
	And Verify New York State paragraph is displayed for Self
	
	And Clicks on Continue Button
	And Validate error message for required question
	And Confirms Imp Replacement Info for NewYork state
	And Clicks on Continue Button

	Then Request Coverage page is displayed to user
	And Validate that Guaranteed Issue Group Term Life is displayed
	And Selects Benefit amount as "<MaxBenefit>" for Self under GIGTL
	And Validates under GIGTL the Benefit Slider Range as "<MinBenefit>" to "<MaxBenefit>"
	And Clicks on Continue Button

	Then Contact Details page is displayed to user
	And Clicks on Continue Button
	And Validate error message for required question
	Then Contact Details is displayed to user and enters contact Details for self "<Title>","<Fname>","<Lname>"
	And Enters contact Details without SSN, MemberID, Height, Weight for Self as "<Mstatus>","<Sex>","<Street>","<City>","<Zipcode>"
	And Clicks on Continue Button
	And Validate error message for required question
	And Enters SSN "<SSN>" for Self
	And Clicks on Continue Button

	Then Beneficiary details are displayed to user
	And Clicks on Add Beneficiary button for Self
	And Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
	And User Enters Beneficiary details as "<Tname>","<DateTrust>"
	And Clicks on OK button
	And Verify that the Percent Displayed for Trust under Guaranteed Issue Group Term Life is "<TrustPercent>"
	And Clicks on Add Beneficiary button for Self
	Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
	And User Enters Beneficiary details as "<Tname1>","<DateTrust>"
	And Clicks on OK button
	And Validates error message on Add Beneficiary page-Only one Trust is allowed as Primary	

	Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
	And Clicks on OK button
	And Delete Contingent Beneficiary
	And Delete box is displayed and clicks on Yes
	
	And Click Delete button for first Primary Beneficiary for Self
	And Delete box is displayed and clicks on Yes
	
	
	And Clicks on Add Beneficiary button for Self
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
	And Clicks on OK button
	And Clicks on Add Beneficiary button for Self
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship as other "<Bname1>","<Blname1>","<Relationship1>","<Perc1>","<Desc>"
	And Clicks on OK button
	And Clicks on Add Beneficiary button for Self
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons 
	And User Enters Beneficiary details as name and relationship"<Bname2>","<Blname2>","<Relationship2>","<Perc2>"	
	And Clicks on OK button
	And Clicks on Add Beneficiary button for Self
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship as other "<Bname3>","<Blname3>","<Relationship3>","<Perc3>","<Desc1>"	
	And Clicks on OK button
	And Clicks on Add Beneficiary button for Self
	Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
	And User Enters Beneficiary details as name and relationship"<Bname4>","<Blname4>","<Relationship4>","<Perc4>"
	And Clicks on OK button
	And Validate Maximum Beneficiaries Error message
	And Clicks on Close button
	And Clicks on Continue Button
	And Verify Error Message is displayed for share of Beneficiaries
	And Clicks on Edit button for fourth primary Beneficiary for Self for GIGTL
	And Add Beneficiary page will be displayed to user and User Enters Beneficiary details as "<Perc5>" for Individual Primary
	And Clicks on OK button
	And Clicks on Add Beneficiary button for Self
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname5>","<Blname5>","<Relationship5>","<Perc6>"
	And Clicks on OK button
	And Clicks on Add Beneficiary button for Self
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname6>","<Blname6>","<Relationship6>","<Perc7>"
	And Clicks on OK button
	And Clicks on Add Beneficiary button for Self
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname7>","<Blname7>","<Relationship7>","<Perc8>"
	And Clicks on OK button
	And Clicks on Add Beneficiary button for Self
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship"<Bname8>","<Blname8>","<Relationship8>","<Perc9>"
	And Clicks on OK button
	And Clicks on Add Beneficiary button for Self
	Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
	And User Enters Beneficiary details as name and relationship as other "<Bname9>","<Blname9>","<Relationship9>","<Perc10>","<Desc2>"
	And Clicks on OK button
	And Validate Maximum Contingent Beneficiaries Error message
	And Clicks on Close button
	And Clicks on Continue Button
	And Verify Error Message is displayed for share of Beneficiaries	
	And Clicks on Edit button for eighth Beneficiary for Self for GIGTL
	And Add Beneficiary page will be displayed to user and User Enters Beneficiary details as "<Perc11>" for Individual Contingent
	And Clicks on OK button
	And Clicks on Continue Button

	Then Signature details are displayed to user
	And Enters First name as "<Fname1>"
	And Validate Error message for mismatch in first name
	And Enters Details for Self as "<Fname>","<Lname>","<DOB18>" on Submit Application page
	And Confirms use of electronic records
	And Clicks on Submit button
	Then Thank you page is displayed to user
	And Verify that Confirmation number is generated for "<Website>"

Examples:
|Website|EmpDate             | EmpDate1            | StateMT | DOB18               | StateNovaScotia | StateNY  |  DOB17               | DOB70                | DOB69                | MinBenefit  | MaxBenefit | Title | Fname | Lname | Mstatus | Sex  | MemberShipID | Street            | City     |Zipcode |Tname       |DateTrust           |TrustPercent|Tname1    |DateTrust1          |Bname|Blname|Relationship|Perc|Bname1|Blname1|Relationship1|Perc1|Desc       |Bname2|Blname2|Relationship2|Perc2|Bname3|Blname3|Relationship3|Perc3|Desc1   |Bname4|Blname4|Relationship4|Perc4|Perc5|Bname5|Blname5|Relationship5|Perc6|Bname6|Blname6|Relationship6|Perc7|Bname7|Blname7|Relationship7|Perc8|Bname8|Blname8|Relationship8|Perc9|Bname9 |Blname9 |Relationship9|Perc10|Desc2   |Perc11|Fname1|SSN 		|
|waepagi|SYSDate-01Y/00M/01D | SYSDate-01Y/00M/00D | Montana | SYSDate- 18Y/00M/00D| Nova Scotia     | New York | SYSDate- 17Y/11M/29D | SYSDate- 70Y/00M/00D | SYSDate- 69y/11m/29d | 25,000      | 100,000    | Mr.   | Scott | Covey | Single  | Male | 521459774    | 44 Downing St #3C | Westbury | 11590  |Helping Hand|SYSDate- 10y/00m/00d|100 %       |Life Saver|SYSDate- 08y/00m/00d|Kylie|Covey |Spouse      |25  |Boris |Carson |Other        |25   |Housekeeper|Henry |Covey  |Son          |25   |Joseph|Kelly  |Other        |15   |Neighbor|Rosey |Covey  |Daughter     |10   |25   |Simon |Covey  |Mother       |25   |Kevin |Covey  |Father       |25   |Colin |Covey  |Son          |25   |Anne  |Covey  |Daughter     |15   |Donna  |Ferguson|Other        |10    |Grandma |25    |Andrew|536636423|




@WaepagiSC_02
Scenario Outline:<WAEPAGISC02>Application for verification of Fraud Notice	
	
Given Test set up for "NYL" feature and "NYL_WAEPAGI" scenario	
Given Customer navigate to NYL "<Website>"	
Then Eligibility details are displayed to user	
And Select YES Radio button of Membership 	
And Selects NO Radio button for Armed forces 	
And Selects YES Radio button for Federal Government 	
And Enter details for Employment Date as "<EmpDate>"
And Enter New State as "<StateCO>"
And Enters DOB for Self as "<DOB69>"
And Clicks on Check eligibility Button	

Then Verify Additional Questions details are displayed	
And Selects No for Do you have other life insurance in force for Self 	
And Clicks on Continue Button	
	
Then Request Coverage page is displayed to user	
And Validate that Guaranteed Issue Group Term Life is displayed
And Selects Benefit amount as "<MinBenefit>" for Self under GIGTL	
And Clicks on Continue Button	
	
Then Contact Details page is displayed to user 

Then Contact Details is displayed to user and enters contact Details for self "<Title>","<Fname>","<Lname>"
And Contact Details page is displayed to user and enters contact Details for self as "<SSN>","<Mstatus>","<Sex>","<MemberShipID>","<Street>","<City>","<Zipcode>"	
And Clicks on Continue Button	

	
Then Beneficiary details are displayed to user 	
And Clicks on Add Beneficiary button for Self 	
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons	
And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
And Clicks on OK button	
And Clicks on Add Beneficiary button for Self 	
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bname1>","<Blname1>","<Relationship1>","<Perc1>"
And Clicks on OK button	
And Verify Error Message is displayed for share Exceeding of Beneficiaries
	
And Enter new Beneficiary Percentage as "<Perc2>"
And Clicks on OK button	
And Clicks on Skip Beneficiary Button	
And Clicks on YES button for skip Beneficiries	

	
Then Signature details are displayed to user 	
And Validates I Understand Verbiage in Read and Sign Box	
And Validate Fraud Notice CO in Read and Sign Box
And Validate Consent message CO in Read and Sign Box	
And Validates that Authorization message is not displayed in Read and Sign Box	
And Clicks on Edit for Eligibility
And Enter New State as "<StateCA>"	
And Clicks on Check eligibility Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Validate Fraud Notice CA in Read and Sign Box	
	
And Clicks on Edit for Eligibility 	
And Enter New State as "<StateAL>"
And Clicks on Check eligibility Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Validate Fraud Notice AL in Read and Sign Box	

And Clicks on Edit for Eligibility	
And Enter New State as "<StateAR>"	
And Clicks on Check eligibility Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Validate Fraud Notice AR in Read and Sign Box	

And Clicks on Edit for Eligibility	
And Enter New State as "<StateLA>"	
And Clicks on Check eligibility Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Validate Fraud Notice LA in Read and Sign Box	

And Clicks on Edit for Eligibility	
And Enter New State as "<StatePA>"	
And Clicks on Check eligibility Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Validate Fraud Notice PA in Read and Sign Box	
	
And Clicks on Edit for Eligibility	
And Enter New State as "<StateRI>"	
And Clicks on Check eligibility Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Validate Fraud Notice RI in Read and Sign Box	
	
And Clicks on Edit for Eligibility	
And Enter New State as "<StateMD>"	
And Clicks on Check eligibility Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Validate Fraud Notice MD in Read and Sign Box	
	
And Clicks on Edit for Eligibility	
And Enter New State as "<StateDC>"	
And Clicks on Check eligibility Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Validate Fraud Notice DC in Read and Sign Box	
	
And Clicks on Edit for Eligibility	
And Enter New State as "<StateFL>"	
And Clicks on Check eligibility Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Validate Fraud Notice FL in Read and Sign Box	
	
And Clicks on Edit for Eligibility	
And Enter New State as "<StateKS>"	
And Clicks on Check eligibility Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Validate Fraud Notice KS in Read and Sign Box	
	
And Clicks on Edit for Eligibility	
And Enter New State as "<StateME>"	
And Clicks on Check eligibility Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Validate Fraud Notice ME in Read and Sign Box	
	
And Clicks on Edit for Eligibility	
And Enter New State as "<StateNJ>"	
And Clicks on Check eligibility Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Validate Fraud Notice NJ in Read and Sign Box	
	
And Clicks on Edit for Eligibility	
And Enter New State as "<StateNY>"	
And Clicks on Check eligibility Button	

#   And Clicks on Continue Button

And Confirms Imp Replacement Info for NewYork state	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button
And Clicks on Continue Button	
And Validate Fraud Notice NY in Read and Sign Box	
	
And Clicks on Edit for Eligibility	
And Enter New State as "<StateOK>"	
And Clicks on Check eligibility Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Validate Fraud Notice OK in Read and Sign Box	
	
And Clicks on Edit for Eligibility	
And Enter New State as "<StatePR>"	
And Clicks on Check eligibility Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Validate Fraud Notice PR in Read and Sign Box	
	
And Clicks on Edit for Eligibility	
And Enter New State as "<StateTN>"	
And Clicks on Check eligibility Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Validate Fraud Notice TN in Read and Sign Box	
	
And Clicks on Edit for Eligibility	
And Enter New State as "<StateWA>"	
And Clicks on Check eligibility Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Validate Fraud Notice WA in Read and Sign Box	

And Clicks on Edit for Eligibility	
And Enter New State as "<StateVA>"	
And Clicks on Check eligibility Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Validate Fraud Notice VA in Read and Sign Box	
	
And Clicks on Edit for Eligibility	
And Enter New State as "<StateNM>"	
And Clicks on Check eligibility Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Clicks on Continue Button	
And Validate Fraud Notice NM in Read and Sign Box
#Standard Fraud Notice	
	
Examples:	
|Website | EmpDate         | StateCO | DOB69                | MinBenefit | Title | Fname | Lname | SSN       | Mstatus | Sex  | Street                     | City      | Zipcode | Bname | Blname | Relationship | Perc | Bname1 | Blname1 | Relationship1 | Perc1  | Perc2 | StateCA     | StateAL  | StateAR  | StateLA   | StatePA      |  StateRI     | StateMD | StateDC              | StateFL | StateKS  | StateME | StateNJ   | StateNY | StateOK | StatePR    | StateTN  | StateWA    | StateVA  | StateNM    |MemberShipID |	
|waepagi | SYSDate 		   | Colorado| SYSDate- 69y/11m/29d | 25,000     | Mr.   | John  | Thomas| 521478968 | Married | Male | 5555 E Briarwood Ave #1203 | Littleton | 80122   | Jane  | Thomas | Spouse       | 90   | David  | Thomas  | Son           | 20     | 10    |  California | Alabama  | Arkansas | Louisiana | Pennsylvania | Rhode Island | Maryland| District of Columbia | Florida | Kansas   | Maine   | New Jersey| New York| Oklahoma| Puerto Rico| Tennessee| Washington | Virginia | New Mexico |521459774	 |  	

