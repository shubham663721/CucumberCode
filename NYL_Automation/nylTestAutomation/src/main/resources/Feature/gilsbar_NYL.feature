Feature: GILSBAR Test

@GILSBARRegression_1
Scenario Outline:<GILSBARSC01>Application Submission for Self with all eligible products (Female)

Given Test set up for "NYL" feature and "NYL_GILSBAR" scenario
Given Customer navigate to NYL "<website>"
Then Eligibility details are displayed to user 
And Select NO for Association Membership
And Validate that Check eligibility button is Disabled
Then Select YES Radio button of Membership
And Validates State as "<State>"
And Enters DOB for Self as "<DOB>"            
And Clicks on Check eligibility Button
And Validate Age Restriction Message
And Clicks on Edit Button
And Enters DOB for Self as "<DOB1>"            
And Clicks on Check eligibility Button
And Validate Age Restriction Message
And Clicks on Edit Button
And Enters DOB for Self as "<DOB2>"            
And Clicks on Check eligibility Button
Then Contact Details page is displayed to user 
And Clicks on Continue Button
And Validate error message for required question
Then Contact Details is displayed to user and enters contact Details for self "<Title>","<Fname>","<Lname>"
And Enters contact Details without SSN, MemberID, Height, Weight for Self as "<Mstatus>","<Sex>","<Street>","<City>","<Zipcode>"
And Selects NO Radio button for smoker question
And verify Semiannual rate "<SNRate>"
And Selects YES Radio button for smoker question
And verify Semiannual rate "<SRate>"
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
And Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
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
And User Enters Beneficiary details as name and relationship as other "<Bname9>","<Blname9>","<Relationship9>","<Perc10>","<Desc3>"
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
And Validates I Understand verbiage one in Read and Sign Box
And Validate Fraud Notice LA in Read and Sign Box
And Validate Consent message for LA in Read and Sign Box
And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario>","<pdfEnable>","<pdfName>"
And Enters First name as "<Fname1>"
And Validate Error message for mismatch in first name
And Enters Details for Self as "<Fname>","<Lname>","<DOB2>" on Submit Application page
And Confirms use of electronic records
And Clicks on Submit button
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"

Examples:
|website|State    |DOB                |DOB1               |DOB2               |Title|Fname |Lname|Mstatus|Sex |Street                       |City          |Zipcode|SNRate|SRate		|SSN      |Tname       |DateTrust |TrustPercent|Tname1    |DateTrust1|Bname|Blname|Relationship|Perc|Bname1|Blname1|Relationship1|Perc1|Desc  |Bname2|Blname2|Relationship2|Perc2|Bname3|Blname3|Relationship3|Perc3|Desc1   |Bname4|Blname4|Relationship4|Perc4|Perc5|Bname5|Blname5|Relationship5|Perc6|Bname6|Blname6|Relationship6|Perc7|Bname7|Blname7|Relationship7|Perc8|Bname8|Blname8|Relationship8|Perc9|Bname9 |Blname9 |Relationship9|Perc10|Desc2   |Perc11|Fname1|pdfScenario		|pdfEnable|pdfName                               |TypeAs	|Desc3|
|lsba-gi|Louisiana|SYSDate-16Y/11M/29D|SYSDate-50Y/00M/00D|SYSDate-49Y/11M/29D|Mr.  |Nathan|Covey|Married|Male|8798 Poor House Avenue Monroe|Louisiana City|71202  |$66.00|$93.50    	|536636423|Helping Hand|01/01/1995|100 %       |Life Saver|01/01/1999|Kylie|Covey |Spouse      |25  |Boris |Butler |Other        |25   |Friend|Henry |Covey  |Son          |25   |Joseph|Lyman  |Other        |15   |Neighbor|Rosey |Covey  |Daughter     |10   |25   |Simon |Covey  |Mother       |25   |Kevin |Covey  |Father       |25   |Colin |Covey  |Son          |25   |Anne  |Covey  |Daughter     |15   |Cameron|Ferguson|Other        |10    |Neighbor|25    |Andrew|GILSBAR01_LA 	|1        |Important Notice All except NM 2 08.12|Contingent|Neighbor|

@GILSBARRegression_2
Scenario Outline:<GILSBARSC02>Application Submission for Self with all eligible products

Given Test set up for "NYL" feature and "NYL_GILSBAR" scenario
Given Customer navigate to NYL "<website>"
Then Eligibility details are displayed to user 
And Select YES Radio button of Membership
And Validates State as "<State>"
And Enters DOB for Self as "<DOB>"            
And Clicks on Check eligibility Button
Then Contact Details is displayed to user and enters contact Details for self "<Title>","<Fname>","<Lname>"
Then Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<Sex>","<Street>","<City>","<Zipcode>"
And Selects NO Radio button for smoker question
And verify Semiannual rate "<SNRate>"
And Selects YES Radio button for smoker question
And verify Semiannual rate "<SRate>"
And Clicks on Continue Button
Then Beneficiary details are displayed to user 
And Clicks on Skip Beneficiary Button
Then Signature details are displayed to user 
And Clicks on Edit button for Beneficiary details
And Clicks on Add Beneficiary button for Self 
Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
And User Enters Beneficiary details as name and relationship"<Bname>","<Blname>","<Relationship>","<Perc>"
And Clicks on OK button
And Clicks on Add Beneficiary button for Self
Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons  
And User Enters Beneficiary details as name and relationship"<Bname1>","<Blname1>","<Relationship1>","<Perc1>"
And Clicks on OK button
And Clicks on Continue Button
Then Signature details are displayed to user 
And Enters Details for Self as "<Fname>","<Lname>","<DOB>" on Submit Application page
And Confirms use of electronic records
And Clicks on Submit button
Then Thank you page is displayed to user
And Verify that Confirmation number is generated for "<website>"

Examples:
|website|State    |DOB                |SSN      |Title|Fname  |Lname |Mstatus|Sex   |Street                     |City				|Zipcode|SNRate|SRate	|Bname|Blname|Relationship|Perc  	|Bname1 |Blname1|Relationship1|Perc1|
|lsba-gi|Louisiana|SYSDate-17Y/00M/00D|953570542|Mrs. |Vanessa|McLean|Single |Female|8408, Corona St. Shreveport|Louisiana City  	|71148  |$12.00|$21.50	|Sean |McLean|Son         |100  	|Theresa|McLean |Daughter     |100   |
