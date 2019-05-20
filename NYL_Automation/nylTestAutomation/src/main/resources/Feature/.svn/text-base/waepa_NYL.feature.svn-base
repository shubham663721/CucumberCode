Feature: waepa Test

  @WaepaRegression_1
  Scenario Outline: <WAEPA_SC1> Application Submission with Lowest valid Member Age (New York)
    Given Test set up for "NYL" feature and "NYL_WAEPA" scenario
    Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
    Then Eligibility page details are displayed to user and Enter details as Mobile"<MobPh>","<Phtype>"
    Then Select YES Radio button of Membership
    And select radio button for policyholder as "<policyholder>"
    And Click on Self
    And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
    And select ArmedForce "<Armedforces>"
    And Clicks on next button
    Then Product page details are displayed to user
    And Selects product Group Term for Self
    And Clicks on next button
    Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for Self and enter details as "<TotalAmount>","<PendingAmount>","<Company>"
    And Validate Imp Replacement Info text for NewYork state
    And Confirms Imp Replacement Info for NewYork state
    And Clicks on next button
    Then Request Coverage page is displayed to user
    And Select "<riderOnly>" for Rider Only question for self
    And Select Benefit Amount for Self as "<Benefit>" under Group Term Product
   	And Validates under Group Term Life the Benefit Slider Range as "<Min>" to "<Max>"
    And Clicks on button to Save for later
    Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<VerifyPass>"
    And Clicks OK Button Save For Later
    Then Refresh the browser
    Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive
    And Clicks on next button
    And Clicks on Add Beneficiary button for Self
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<BRelation>","<BPercen>"
    And Clicks on OK button
    And Clicks on Add Beneficiary button for Self
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship"<Bfname1>","<Blname1>","<BRelation1>","<BPercen1>"
    And Clicks on OK button
    And Clicks on next button
    Then WAEPA Contact Details page is displayed to user and enter contact Details for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<gender>","<Street>","<City>","<Zip>"
    And Selects No for Travel Question Non QD for Self
    And Clicks on TV checkbox
    And Clicks on next button
    Then Application Summary Page is displayed to user
    And Verify that the coverage amount for Self is "<Benefit>"
    And Clicks on next button
    Then Health History Page are displayed and user Select NO for all the questions
    And Enters details  for Question forth as "<Physician>","<Address>","<Date>","<Reason>","<Result>"
    And Clicks on next button
    Then Authorize page details are displayed to user and confirm the term and conditions for Self
    And Clicks on next button
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Thank you page is displayed to user
    And Verify that Confirmation number is generated for "<Website>"
    And Verify PDF information as "<pdfScenario>","<pdfEnable>"

    Examples: 
       | Website | MobPh      | Phtype | policyholder | Title | Fname | Lname | State    | DOB                   |  Armedforces | TotalAmount | PendingAmount | Company | riderOnly | Benefit | Password | VerifyPass |  Password | riderOnly1 |  Benefit1 | Bfname | Blname | BRelation | BPercen | Bfname1 | Blname1 | BRelation1 | BPercen1 | gender | Outside | SSN       | Mstatus | Height | Weight | Street              | City     | Zip       | Physician      | Address                                  | Date   | Reason  | Result      | Min | Max       |
       | waepa   | 0124578962 | Mobile | yes          | Mr.   | Allen | Shoey | New York | SYSDate- 18y/00m/00d  |  No          |        5000 |          1000 | TISCO   | No        |   25000 | Test@123 | Test@123   |  Test@123 | No         |     25000 | John   | Shoey  | Daughter  |     100 | Alis    | Shoey   | Son        |      100 | Male   | No      | 124001968 | Single  |    5.1 |    180 | 1 Main^ street Park | New York | 012588455 | Dr. John David | #22 Main St,Park Avenue , New York 01254 | 012014 | illness | Pescription |   0 | 1,500,000 |

  @WaepaRegression_2
  Scenario Outline: <WAEPA_SC02> Application Submission with Highest valid Member Age (Connecticut)
    Given Test set up for "NYL" feature and "NYL_WAEPA" scenario
    Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
    Then Eligibility page details are displayed to user and Enter details as HomePhone "<HomePh>","<Phtype>"
    Then Select YES Radio button of Membership
    And select radio button for policyholder as "<policyholder>"
    And verify that the SELF button is selected already
    And select ArmedForce "<Armedforces>"
    And Enter details for self as "<title>","<Fname>","<Lname>","<State>","<Dob>"
    And Clicks on next button
    And Validate Age Restriction Message
    And Enters DOB for Self as "<Dob1>"
    And Click on Child
    And Click on Add Child button
    Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDob>","<Csex>"
    And Click on Add Child button on Screen
    And Clicks on next button
    Then Product page details are displayed to user
    And Selects product Group Term for Self
    And Selects product Group Term Life Insurance for Child
    And Clicks on next button
    Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
    And Clicks on next button
    Then Select Benefit Amount for Self as "<Benefit>" under Group Term Product
    And Selects benefit amount for Group Term Product Child as "<Cbenefit>"
    And Validates under Group Term Life the Benefit Slider Range as "<Min>" to "<Max>"
    And Clicks on next button
    Then Beneficiary Page is displayed to user
    And Clicks on Add Beneficiary button for Self
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<BRelation>","<BPercen>"
    And Clicks on OK button
    And Clicks on Add Beneficiary button for Self
    Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
    And User Enters Beneficiary details as "<Trust>","<Datetrust>"
    And Clicks on OK button
    And Clicks on next button
    Then WAEPA Contact Details page is displayed to user and enter contact Details for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<gender>","<Street>","<City>","<Zip>"
    And Selects Yes for Travel Question Non QD for Self
    And Enter details for Outside US country and How Long months for Self as "<Country>","<Months>"
    And Clicks on TV checkbox
    And Clicks on next button
    Then Application Summary Page is displayed to user
    And Clicks on next button
    Then Health History Page are displayed and user Select NO for all the questions
    And Enters details  for Question forth as "<Physician>","<Address>","<Date>","<Reason>","<Result>"
    And Clicks on next button
    Then Payment Information Page is displayed to user and user Selects Payment option as Bank for Group Term Life Product
    And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
    And Clicks on Save button
    And Selects Frequency for Group Term Life Product and reviews "<Frequency>"
    And Validate the estimated rates values for Group Term Life for Self and Dependents as "<Mpremium>","<Dependents1>","<Total>"
    And Confirms I have read the Information Check Box on Payment Page
    And Clicks on next button
    Then Authorize page details are displayed to user and confirm the term and conditions for Self
    And Clicks on next button
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Payment Authorization Letter is displayed to user and clicks on Continue
    And Signs Payment Authorization Letter
    And Clicks on next button to finish
    Then Thank you page is displayed to user
    And Verify that Confirmation number is generated for "<Website>"
    And Verify PDF information as "<pdfScenario>","<pdfEnable>"

    Examples: 
     | Website | HomePh     | Phtype | policyholder | Armedforces | title | Fname | Lname | State       | Dob                  | Dob1                  | Cfname | Clname | CDob                 | Csex   | Benefit | Cbenefit | Min   | Max    | Bfname | Blname | BRelation | BPercen | Trust       | Datetrust | SSN       | Mstatus | Height | Weight | Street                            | City      | Zip       | gender | Country | Months | Physician      | Address                                 | Date   | Reason  | Result      | Bank     | AccName | Rnum      | Anum        | Frequency | Mpremium      | Dependents1     | Total      | pdfEnable | pdfScenario |
     | waepa   | 0221458987 | Home   | No           | No          | Mr.   | Joey  | Shawn | Connecticut | SYSDate- 70y/00m/00d | SYSDate- 69y/11m/30d  | Pamela | Shawn  | SYSDate- 07y/00m/00d | Female |  400000 |    15000 | 25000 | 400000 | Sandy  | Shawn  | Daughter  |     100 | Corporation |  01012010 | 390526768 | Married |    5.1 |    180 | 388@STAMM RD, NEWINGTON, CT 06111 | NEWINGTON | 012588455 | Male   | Belgium |      6 | Dr. John David | 177 * HARTFORD RD, MANCHESTER, CT 06040 | 012014 | illness | Pescription | Bank one | Allen   | 012547896 | 21564564654 | Quarterly |     $1,300.00 |         $285.00 |  $1,585.00 |         0 | WAEPASC02   |

  @WaepaRegression_3
  Scenario Outline: <WAEPA_SC3> Application Submission for a civilian federal employee of the U.S. Government actively at work (California)
    Given Test set up for "NYL" feature and "NYL_WAEPA" scenario
    Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
    And Select NO for Association Membership
    And Select radio button for CIVILIAN FEDERAL EMPLOYEE and enter EmployedSince and EmployedBy details as "<EmpSince>","<EmpBy>" and Select the checkbox for I attest
    Then Eligibility page details are displayed to user and Enter details as Mobile"<MobPh>","<Phtype>"
    And verify that the SELF button is selected already
    And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<Dob>"
    And select ArmedForce "<Armedforces>"
    And Clicks on next button
    Then Product page details are displayed to user
    And Selects product Group Term for Self
    And Clicks on next button
    Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for Self and enter details as "<TotalAmount>","<PendingAmount>","<Company>"
    And Clicks on next button
    Then Request Coverage page is displayed to user
    Then Select Benefit Amount for Self as "<benefit>" under Group Term Product   
    And Select "<OptionalRider>" to Optional Rider question for Self
    And Clicks on next button
    Then Clicks on Add Beneficiary button for Self
    Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
    And User Enters Beneficiary details as "<Tname>","<DTrust>"
    And Clicks on OK button
    And Clicks on Add Beneficiary button for Self
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<BRelation>","<BPercen>"
    And Clicks on OK button
    And Clicks on next button
    Then WAEPA Contact Details page is displayed to user and enter contact Details for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<gender>","<Street>","<City>","<Zip>"
    And Selects No for Travel Question Non QD for Self
    And Clicks on TV checkbox
    And Clicks on next button
    Then Application Summary Page is displayed to user
    And Clicks on next button
    Then Health History Page are displayed and user Select NO for all the questions
    And Enters details  for Question forth as "<Physician>","<Address>","<Date>","<Reason>","<Result>"
    And Clicks on next button
    Then Payment Information Page is displayed to user and user Selects Payment option as Bank for Group Term Life Product
    And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
    And Clicks on Save button
    And Selects Frequency for Group Term Life Product and reviews "<Frequency>"
    And Validate the estimated rates values for Group Term Life for self as "<Mpremium>","<Total>"
    And Confirms I have read the Information Check Box on Payment Page
    And Clicks on next button
    Then Authorize page details are displayed to user and confirm the term and conditions for Self
    And Clicks on next button
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Payment Authorization Letter is displayed to user and clicks on Continue
    And Signs Payment Authorization Letter
    And Clicks on next button to finish
    Then Thank you page is displayed to user
    And Verify that Confirmation number is generated for "<Website>"
    And Verify PDF information as "<pdfScenario>","<pdfEnable>"

    Examples: 
     | Website | MobPh      | Phtype | EmpSince | EmpBy                                               | Title | Fname | Lname 	 | State      | Dob                   | Armedforces | TotalAmount | PendingAmount | Company | OptionalRider | benefit | Tname           | DTrust   | Bfname | Blname | BRelation | BPercen | SSN       | Mstatus | Height | Weight | Street                               | City        | Zip       | gender |  Physician | Address                               | Date   | Reason  | Result      | Bank     | AccName | Rnum      | Anum        | Frequency | Mpremium | Total  | pdfEnable | pdfScenario |
     | waepa   | 0221458987 | Mobile | 01012018 | U.S. Postal Service Office of the Inspector General | Mr.   | David | Lee	     | California | SYSDate- 49y/00m/00d  | No          |        2000 |           500 | Retis   | No            |  125000 | Sun Corporation | 01012010 | Masey  | Lee	   | Daughter  |     100 | 337587968 | Single  |    5.1 |    180 | 14751 #192nd Rd Porterville,CA 93257 | Porterville | 012588455 | Male   |  Dr.Allis  | 7225*Central Ave,Lemon Grove,CA 91945 | 012014 | illness | Pescription | Bank one | Allen   | 012547896 | 21564564654 | Quarterly | $45.00   | $45.00 |         0 | WAEPASC03   |

  @WaepaRegression_4
  Scenario Outline: <WAEPA_SC4> Application Submission for a retired civilian federal annuitant (Massachusetts)
    Given Test set up for "NYL" feature and "NYL_WAEPA" scenario
    Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
    And Select NO for Association Membership
    And Select radio button for RETIRED CIVILIAN FEDERAL EMPLOYEE and enter RetiredSince and EmployedBy details as "<RetiredSince>","<EmpBy>" and Select the checkbox for I attest
    Then Eligibility page details are displayed to user and Enter details as Mobile"<MobPh>","<Phtype>"
    And verify that the SELF button is selected already
    And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
    And select ArmedForce "<Armedforces>"
    And Clicks on next button
    Then Product page details are displayed to user
    And Selects product Group Term for Self
    And Clicks on next button
    Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
    And Clicks on next button
    Then Request Coverage page is displayed to user
    And Validates under Group Term Life the Benefit Slider Range as "<Min>" to "<Max>"
    Then Select Benefit Amount for Self as "<Benefit>" under Group Term Product
   	And Select "<OptionalRider>" to Optional Rider question for Self
    And Clicks on next button
    Then Beneficiary Page is displayed to user
    And Clicks on Add Beneficiary button for Self
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<BRelation>","<BPercen>"
    And Clicks on OK button
    And Clicks on Add Beneficiary button for Self
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bfname1>","<Blname1>","<BRelation1>","<BPercen1>"
    And Clicks on OK button
    And Clicks on Add Beneficiary button for Self
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bfname2>","<Blname2>","<BRelation2>","<BPercen2>"
    And Clicks on OK button
    And Clicks on Add Beneficiary button for Self
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bfname3>","<Blname3>","<BRelation3>","<BPercen3>"
    And Clicks on OK button
    And Clicks on Add Beneficiary button for Self
    Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
    And User Enters Beneficiary details as "<Tname>","<DTrust>"
    And Clicks on OK button
    And Clicks on next button
    Then WAEPA Contact Details page is displayed to user and enter contact Details for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<gender>","<Street>","<City>","<Zip>"
    And Selects No for Travel Question Non QD for Self
    And Clicks on TV checkbox
    And Clicks on next button
    Then Application Summary Page is displayed to user
    And Clicks on next button
    Then Health History Page are displayed and user Select NO for all the questions
    And Enters details  for Question forth as "<Physician>","<Address>","<Date>","<Reason>","<Result>"
    And Clicks on next button
    Then Payment Information Page is displayed to user and user Selects Payment option as Bank for Group Term Life Product
    And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
    And Clicks on Save button
    And Selects Frequency for Group Term Life Product and reviews "<Frequency>"
    And Validate the estimated rates values for Group Term Life for self as "<Mpremium>","<Total>"
    And Confirms I have read the Information Check Box on Payment Page
    And Clicks on next button
    Then Authorize page details are displayed to user and confirm the term and conditions for Self
    And Clicks on next button
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Payment Authorization Letter is displayed to user and clicks on Continue
    And Signs Payment Authorization Letter
    And Clicks on next button to finish
    Then Thank you page is displayed to user
    And Verify that Confirmation number is generated for "<Website>"
    And Verify PDF information as "<pdfScenario>","<pdfEnable>"

    Examples: 
    | Website | MobPh      | Phtype | RetiredSince | EmpBy                                               | Title | Fname  | Lname | State         | DOB                  | Armedforces | Min   | Max    | OptionalRider | Benefit | Bfname  | Blname | BRelation | BPercen | Bfname1 | Blname1 | BRelation1 | BPercen1 | Bfname2  | Blname2 | BRelation2 | BPercen2 | Bfname3 | Blname3 | BRelation3 | BPercen3 | Tname       | DTrust   | SSN       | Mstatus | Height | Weight | Street                    | City  | Zip       | gender |  Physician     | Address                     | Date   | Reason  | Result      | Bank     | AccName | Rnum      | Anum        | Frequency | Mpremium  | Total     | pdfEnable | pdfScenario |
    | waepa   | 0221458987 | Mobile |     12312010 | U.S. Postal Service Office of the Inspector General | Mr.   | Martin | Lopez | Massachusetts | SYSDate- 60y/00m/00d | No          | 25000 | 900000 | No            |  900000 | Marry   | Lopez  | Daughter  |      20 | James   | Lopez   | Son        |       20 | Monica   | Lopez   | Mother     |       20 | Lora    | Lopez   | Spouse     |       40 | Corporation | 01012010 | 607587968 | Single  |    5.1 |    180 | 12# Yale Milford,MA 01757 | Malden | 012588455 | Male   | Dr.John David | 10*Anis Rd,Belmont,MA 02478 | 012014 | illness | Pescription | Bank one | Allen   | 012547896 | 21564564654 | Quarterly | $1,292.40 | $1,292.40 |         0 | WAEPASC04   |
 
  @WaepaRegression_5
  Scenario Outline: <WAEPA_SC5> Application Submission for Spouse as a Associate Member (Alabama)
    Given Test set up for "NYL" feature and "NYL_WAEPA" scenario
    Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
    Then Eligibility page details are displayed to user and Enter details as Mobile"<MobPh>","<Phtype>"
    And Select NO for Association Membership
    And Select radio button I AM A SPOUSE OF A WAEPA MEMBER
    And Clicks on DEPENDENT icon
    And Verify the Informational Message is displayed and all the icons for Self,Spouse,Child are disabled for selection
    And Clicks on BECOME AN ASSOCIATE MEMBER radio button to enter details as "<Sfname>","<Slname>","<MembershipID>" and select the checkbox for attest
    And Click on Self
    And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
    And select ArmedForce "<Armedforces>"
    And Clicks on next button
    And Validate Age Restriction Message
    And Enters DOB for Self as "<DOB1>"
    And Clicks on next button
    Then Product page details are displayed to user 
    And Selects product Group Term for Self
    And Clicks on next button
    Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for Self and enter details as "<InforcePolicyAmount>","<PendingPolicyAmount>","<Company>"
    And Clicks on next button
    Then Request Coverage page is displayed to user
    And Validates under Group Term Life the Benefit Slider Range as "<Min>" to "<Max>"
    Then Select Benefit Amount for Self as "<Benefit>" under Group Term Product
    And Select "<OptionalRider>" to Optional Rider question for Self
    And Clicks on next button
    And Clicks on Add Beneficiary button for Self
    Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
    And User Enters Beneficiary details as "<Tname>","<DTrust>"
    And Clicks on OK button
    And Verify that the Percent Displayed for Trust "<TrustSequence1>" is "<TrustPercent>" for TermLife
    And Clicks on Add Beneficiary button for Self
    Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
    And User Enters Beneficiary details as "<Tname1>","<DTrust1>"
    And Clicks on OK button
   	And Verify that the Percent Displayed for Trust "<TrustSequence2>" is "<TrustPercent>" for TermLife
    And Clicks on next button
    Then WAEPA Contact Details page is displayed to user and enter contact Details for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<gender>","<Street>","<City>","<Zip>"
    And Selects No for Travel Question Non QD for Self
    And Clicks on TV checkbox
    And Clicks on next button
    Then Application Summary Page is displayed to user
    And Clicks on next button
    Then Health History Page are displayed and user Select NO for all the questions
    And Enters details  for Question forth as "<Physician>","<Address>","<Date>","<Reason>","<Result>"
    And Clicks on next button
    Then Payment Information Page is displayed to user and user Selects Payment option as Bank for Group Term Life Product
    And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
    And Clicks on Save button
    And Selects Frequency for Group Term Life Product and reviews "<Frequency>"
    And Validate the estimated rates values for Group Term Life for self as "<Mpremium>","<Total>"
    And Confirms I have read the Information Check Box on Payment Page
    And Clicks on next button
    Then Authorize page details are displayed to user and confirm the term and conditions for Self
    And Clicks on next button
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Payment Authorization Letter is displayed to user and clicks on Continue
    And Signs Payment Authorization Letter
    And Clicks on next button to finish
    Then Thank you page is displayed to user
    And Verify that Confirmation number is generated for "<Website>"
    And Verify PDF information as "<pdfScenario>","<pdfEnable>"

    Examples: 
     | Website | MobPh      | Phtype | Sfname | Slname |MembershipID| Title | Fname | Lname  | State   | Armedforces |  gender |  Frequency  | DOB                  | DOB1                 | InforcePolicyAmount | PendingPolicyAmount | Company        | Min | Max     | Benefit | OptionalRider | Tname       | DTrust   |TrustSequence1| Tname1     | DTrust1  |TrustPercent|TrustSequence2| SSN       | Mstatus | Height | Weight | Street          | City       | Zip       | Physician | Address                           | Date   | Reason  | Result      | Bank     | AccName | Rnum      | Anum          | Mpremium | Total   | pdfEnable | pdfScenario |
     | waepa   | 0221458987 | Mobile | Jamie  | Turner | 436373     |Mrs.    | Jenny | Turner | Alabama | No          | Female |  Quarterly  | SYSDate- 70y/00m/00d   | SYSDate- 18y/00m/00d |                2500 |                1500 | Enigma Corp    |   0 | 1500000 | 1500000 | No            | Corporation | 01012010 | 1          |F T Corp   | 01012010 | 100 %      | 2             |193757968  | Married |    5.1 |    180 | 2709@12th Ave N | Tuscaloosa | 012588455 | Dr. Dave  | 16 ^Kalin St,Phenix City,AL 36869 | 012014 | illness | Pescription | Bank one | Allen   | 012547896 | 21564564654 | $139.50  | $139.50 |         0 | WAEPASC05   |

  @WaepaRegression_6
  Scenario Outline: <WAEPA_SC6> Application Submission for Child only.
    Given Test set up for "NYL" feature and "NYL_WAEPA" scenario
    Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
    Then Eligibility page details are displayed to user and Enter details as Mobile"<MobPh>","<Phtype>"
    Then Select YES Radio button of Membership
    And select radio button for policyholder as "<policyholder>"
    And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
    And select ArmedForce "<Armedforces>"
    And Click on Child
    And Click on Add Child button
    Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDob>","<Csex>"
    And Click on Add Child button on Screen
    And Click on Add Child button
    Then Add Child Screen is displayed and Enters Child details as "<Cfname1>","<Clname1>","<CDob1>","<Csex1>"
    And Click on Add Child button on Screen
    And Click on Add Child button
    Then Add Child Screen is displayed and Enters Child details as "<Cfname2>","<Clname2>","<CDob2>","<Csex2>"
    And Click on Add Child button on Screen
    And Click on Add Child button
    Then Add Child Screen is displayed and Enters Child details as "<Cfname3>","<Clname3>","<CDob3>","<Csex3>"
    And Click on Add Child button on Screen
    And Click on Add Child button
    Then Add Child Screen is displayed and Enters Child details as "<Cfname4>","<Clname4>","<CDob4>","<Csex4>"
    And Click on Add Child button on Screen
    And Click on Add Child button
    Then Add Child Screen is displayed and Enters Child details as "<Cfname5>","<Clname5>","<CDob5>","<Csex5>"
    And Click on Add Child button on Screen
    And Click on Add Child button
    Then Add Child Screen is displayed and Enters Child details as "<Cfname6>","<Clname6>","<CDob6>","<Csex6>"
    And Click on Add Child button on Screen
    And Click on Add Child button
    Then Add Child Screen is displayed and Enters Child details as "<Cfname7>","<Clname7>","<CDob7>","<Csex7>"
    And Click on Add Child button on Screen
    And Clicks on next button
    And Selects product Group Term Life Insurance for Child
    And Clicks on next button
    Then Click YES for Dependent Coverage information
    Then Request Coverage page is displayed to user
    And Validates under the Benefit Amounts for child Listed are: "Select","$2,500","$5,000","$7,500","$10,000","$12,500","$15,000","$17,500","$20,000","$22,500","$25,000"
    And Selects benefit amount for Group Term Product Child as "<Cbenefit>"
    And Clicks on next button
    Then Contact Details page is displayed to user
    And Enter Contact Details for self for Child only policy as "<SSN>","<Mstatus>","<Gender>","<Street>","<City>","<Zip>"
    And Clicks on TV checkbox
    And Clicks on next button
    Then Application Summary Page is displayed to user 
    And Verify Child name as "<Cfname>","<Clname>"
    And Verify Child name as "<Cfname3>","<Clname3>"
    And Verify Child name as "<Cfname6>","<Clname6>"
    And Verify Child name as "<Cfname7>","<Clname7>"
    And Clicks on next button
    And Clicks on Payment and Health page to verify that the Screen is not rendered
    Then Authorize page details are displayed to user and confirm the term and conditions for Self
    And Clicks on next button
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Thank you page is displayed to user
    And Verify that Confirmation number is generated for "<Website>"
    And Verify PDF information as "<pdfScenario>","<pdfEnable>"

    Examples: 
      | Website | MobPh      | policyholder | Phtype | Title | Fname    | Lname | State    | DOB                  | Armedforces | Cfname | Clname | CDob     | Csex | Cfname1 | Clname1 | CDob1                | Csex1  | Cfname2 | Clname2 | CDob2                | Csex2 | Cfname3 | Clname3 | CDob3                | Csex3  | Cfname4 | Clname4 | CDob4                | Csex4 | Cfname5 | Clname5 | CDob5                | Csex5 | Cfname6 | Clname6 | CDob6                | Csex6 | Cfname7 | Clname7 | CDob7    | Csex7 | Cbenefit | SSN       | Mstatus | Gender | Street                     | City  | Zip       | pdfScenario | pdfEnable |
      | waepa   | 0124578962 | Yes          | Mobile | Mr.   | Marshall | Cook  | New York | SYSDate- 18y/00m/00d | No          | Sam    | Cook   | SYSDate  | Male | Donna   | Cook    | SYSDate- 26y/00m/00d | Female | Robert  | Cook    | SYSDate- 27y/00m/00d | Male  | Pamela  | Cook    | SYSDate- 18y/00m/00d | Female | Jhon    | Cook    | SYSDate- 30y/00m/00d | Male  | Frank   | Cook    | SYSDate- 40y/00m/00d | Male  | Harry   | Cook    | SYSDate- 17y/00m/00d | Male  | Jack    | Cook    | SYSDate  | Male  |    25000 | 309793968 | Single  | Male | 1 *main street Park^ venue   | asdfg | 012588455 | WAEPASC06   |         0 |
      

  @WaepaRegression_7
  Scenario Outline: <WAEPA_SC07>	Application Submission for Self , Spouse and Child (Illinois)
   Given Test set up for "NYL" feature and "NYL_WAEPA" scenario
    Given Customer navigate to NYL "<Website>"
    Then HomePage is Displayed
    When Clicks on Apply now button
    Then Eligibility page details are displayed to user and Enter details as Mobile"<MobPh>","<Phtype>"
    Then Select YES Radio button of Membership
    And select radio button for policyholder as "<policyholder>"
    And verify that the SELF button is selected already
    And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<Dob>"
    And select ArmedForce "<Armedforces>"
    Then Click on Spouse
    And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
    And Select radio button Yes for Spouse is Member 
		And Validate that NEXT button is Disabled 
    And Select radio button NO for Spouse is Member
    And Click on Child
    And Click on Add Child button
    Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDob>","<Csex>"
    And Click on Add Child button on Screen
    And Click on Add Child button
    Then Add Child Screen is displayed and Enters Child details as "<Cfname1>","<Clname1>","<CDob1>","<Csex1>"
    And Click on Add Child button on Screen
    And Clicks on next button
    Then Selects the product for Self, Spouse and Children for Group Term Life Insurance
    And Clicks on next button
    Then Product: Additional Questions page details are displayed to user and selects Answer as No for Self and Spouse
    And Clicks on next button
    Then Request Coverage page is displayed to user
    Then Select Benefit Amount for Self as "<benefit>" under Group Term Product   
    And Select "<OptionalRider>" to Optional Rider question for Self
    And Validates under Group Term Life the Benefit Slider Range as "<Min>" to "<Max>"
    And Selects Benefit Amount for Spouse as "<Sbenefit>" under Group Term Life
    And Select "<OptionalRider>" to Optional Rider question for Spouse
    And Validates under Group Term Life for Spouse the Benefit Slider Range as "<SMin>" to "<SMax>"
    And Validates that the Child benefit amount for Group Term Product is disabled and selected as "<Cbenefit>"
    Then Select Benefit Amount for Self as "<benefit1>" under Group Term Product
  	And Selects Benefit Amount for Spouse as "<Sbenefit1>" under Group Term Life
    And Validates that the Child benefit amount for Group Term Product is disabled and selected as "<Cbenefit1>"
    Then Select Benefit Amount for Self as "<benefit2>" under Group Term Product
   	And Selects Benefit Amount for Spouse as "<Sbenefit2>" under Group Term Life
    And Validates that the Child benefit amount for Group Term Product is disabled and selected as "<Cbenefit2>"
    And Select "<OptionalRider>" to Optional Rider question for Self
    And Select "<OptionalRider>" to Optional Rider question for Spouse
    And Clicks on next button
    And Clicks on Add Beneficiary Button for Spouse
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<BRelation>","<BPercen>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Spouse
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship"<Bfname1>","<Blname1>","<BRelation1>","<BPercen1>"
    And Clicks on OK button
    And Clicks on next button
    Then WAEPA Contact Details page is displayed to user and enter contact Details for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<gender>","<Street>","<City>","<Zip>"
    And Selects No for Travel Question Non QD for Self
    And Clicks on TV checkbox
    And Enters Spouse contact details as in Waepa "<Sgender>","<Sheight>","<Sweight>","<SPType>","<SPPhone>"
    And Selects No for Travel Question Non QD for Spouse
    And Clicks on next button
    Then Application Summary Page is displayed to user
    And Verify that the coverage amount for Self is "<benefit2>"
    And Verify Benefit Amount for Spouse as "<Sbenefit2>" under TermLife
    And Verify Benefit Amount for Child as "<Cbenefit2>" under TermLife
    And verify that the Chronic Illness Rider is rendered on screen as Yes
    And Clicks on next button
    Then Health History Page are displayed and user Select NO for all the questions
    And Enters details  for Question forth as "<Physician4a>","<Address4a>","<Date4b>","<Reason4b>","<Result4c>"
    And Clicks on next button
    Then Verify Health History Page are displayed to user
    And Select YES for Spouse question one, two and enter details as "<Amount1a>","<WeightReason1a>","<Details2a>","<Details2b>"
    And Select YES for Spouse question three and enter details as "<Date3a>","<Treatment3a>","<NameAddress3a>","<Medicine3b>","<Dosage3b>","<Freq3b>","<NameAddress3b>","<Duedate3c>","<Details3d>"
    And Select YES for Spouse question Four as "<Physician4a>","<Address4a>","<Date4b>","<Reason4b>","<Result4c>","<EKG4d>","<Details4d>"
    And Select YES for Spouse question FiveA blood pressure and enter details as "<Date5a>","<Illness5a>","<Symptoms5a>","<LastDate5a>","<Attacks5a>","<Treatment5a>","<NameAddress5a>"
    And Select YES for Spouse question FiveB ulcer and enter details as "<Date5b>","<Illness5b>","<Symptoms5b>","<LastDate5b>","<Attacks5b>","<Treatment5b>","<NameAddress5b>"
    And Select YES for Spouse question FiveC asthma and enter details as "<Date5c>","<Illness5c>","<Symptoms5c>","<LastDate5c>","<Attacks5c>","<Treatment5c>","<NameAddress5c>"
    And Select YES for Spouse question FiveD venereal disease and enter details as "<Date5d>","<Illness5d>","<Symptoms5d>","<LastDate5d>","<Attacks5d>","<Treatment5d>","<NameAddress5d>"
    And Select YES for Spouse question FiveE fibrositis and enter details as "<Date5e>","<Illness5e>","<Symptoms5e>","<LastDate5e>","<Attacks5e>","<Treatment5e>","<NameAddress5e>"
    And Select YES for Spouse question FiveF convulsions and enter details as "<Date5f>","<Illness5f>","<Symptoms5f>","<LastDate5f>","<Attacks5f>","<Treatment5f>","<NameAddress5f>"
    And Select YES for Spouse question FiveG stress and enter details as "<Date5g>","<Illness5g>","<Symptoms5g>","<LastDate5g>","<Attacks5g>","<Treatment5g>","<NameAddress5g>"
    And Select YES for Spouse question FiveH diabetes and enter details as "<Date5h>","<Illness5h>","<Symptoms5h>","<LastDate5h>","<Attacks5h>","<Treatment5h>","<NameAddress5h>"
    And Select YES for Spouse question FiveI any disease and enter details as "<Date5i>","<Illness5i>","<Symptoms5i>","<LastDate5i>","<Attacks5i>","<Treatment5i>","<NameAddress5i>"
    And Select YES for Spouse question FiveJ anemia and enter details as "<Date5j>","<Illness5j>","<Symptoms5j>","<LastDate5j>","<Attacks5j>","<Treatment5j>","<NameAddress5j>"
    And Select YES for Spouse question FiveK cancer and enter details as "<Date5k>","<Illness5k>","<Symptoms5k>","<LastDate5k>","<Attacks5k>","<Treatment5k>","<NameAddress5k>"
    And Select YES for Spouse question FiveL any other illness and enter details as "<Date5l>","<Illness5l>","<Symptoms5l>","<LastDate5l>","<Attacks5l>","<Treatment5l>","<NameAddress5l>"
    And Select YES for Spouse question SixA alcoholic and enter details as "<Freq6a>","<Wine6a>","<Beer6a>","<Liquor6a>"
    And Select YES for Spouse question SixB more alcohol and enter details as "<Date6b>","<Details6b>"
    And Select YES for Spouse question SixC sedatives and enter details as "<Date6c>","<Freq6c>","<Drug6c>","<Details6c>"
    And Select YES for Spouse question SixD marijuana and enter details as "<Date6d>","<Freq6d>","<Drug6d>","<Details6d>"
    And Select YES for Spouse question SixE nicotine and enter details as "<Date6e>","<Product6e>"
    And Select YES for Spouse question SixF physician and enter details as "<Date6f>","<Details6f>","<NameAddress6f>"
    And Select YES for Spouse question seven eight and enter details as "<Details7a>","<Date7b>","<Details7b>","<Family8a>","<Age8a>","<Status8a>","<Condition8a>"
    And Clicks on next button
    Then Payment Information Page is displayed to user and user Selects Payment option as Bank for Group Term Life Product
    And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
    And Clicks on Save button
    And Selects Frequency for Group Term Life Product and reviews "<Frequency>"
    And Validate the estimated rates values for Group Term Life for Self and Dependents as "<Mpremium>","<Dependent>","<Total>"	
    And Confirms I have read the Information Check Box on Payment Page
    And Clicks on next button
    Then Authorize page details are displayed to user and confirm the term and conditions for Self
    Then Authorize page details are displayed to user and confirm the term and conditions for Spouse
    And Clicks on next button
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Payment Authorization Letter is displayed to user and clicks on Continue
    And Signs Payment Authorization Letter
    And Clicks on next button to finish
    Then Thank you page is displayed to user
    And Verify that Confirmation number is generated for "<Website>"

    Examples: 
      | Website | MobPh      | Phtype | policyholder | Title | Fname | Lname | State    | Dob                 |   Armedforces | Stitle | Sfname  | Slname | SDOB                 | Cfname | Clname | CDob                 | Csex | Cfname1 | Clname1 | CDob1                | Csex1  | OptionalRider | benefit  | Sbenefit | Cbenefit | benefit1 | Sbenefit1 | Cbenefit1 | benefit2 | Sbenefit2 | Cbenefit2 | Bfname | Blname | BRelation | BPercen | Bfname1 | Blname1  | BRelation1 | BPercen1 | gender |  SSN      | Mstatus | Height | Weight | Street        | City      | Zip       | Sheight | Sweight | Sgender |  SPType | SPPhone    | Physician4a      | Address4a                        | Date4b  | Reason4b | Result4c | Amount1a | WeightReason1a | Details2a    | Details2b                  | Date3a  | Treatment3a | NameAddress3a                                          | Medicine3b | Dosage3b | Freq3b        | NameAddress3b                                     | Duedate3c  | Details3d    | EKG4d | Details4d | Date5a  | Illness5a | Symptoms5a | LastDate5a | Attacks5a | Treatment5a | NameAddress5a                                  | Date5b  | Illness5b    | Symptoms5b   | LastDate5b | Attacks5b | Treatment5b | NameAddress5b                                       | Date5c  | Illness5c | Symptoms5c | LastDate5c | Attacks5c | Treatment5c | NameAddress5c                                        | Date5d  | Illness5d    | Symptoms5d   | LastDate5d | Attacks5d | Treatment5d | NameAddress5d                                          | Date5e    | Illness5e | Symptoms5e | LastDate5e | Attacks5e | Treatment5e | NameAddress5e                                           | Date5f  | Illness5f    | Symptoms5f   | LastDate5f | Attacks5f | Treatment5f | NameAddress5f                                         | Date5g  | Illness5g | Symptoms5g | LastDate5g | Attacks5g | Treatment5g | NameAddress5g                                              | Date5h  | Illness5h    | Symptoms5h   | LastDate5h | Attacks5h | Treatment5h | NameAddress5h                                                  | Date5i  | Illness5i | Symptoms5i | LastDate5i | Attacks5i | Treatment5i | NameAddress5i                                            | Date5j  | Illness5j    | Symptoms5j   | LastDate5j | Attacks5j | Treatment5j | NameAddress5j                                             | Date5k  | Illness5k | Symptoms5k | LastDate5k | Attacks5k | Treatment5k | NameAddress5k                                            | Date5l  | Illness5l    | Symptoms5l   | LastDate5l | Attacks5l | Treatment5l | NameAddress5l                                               | Freq6a | Wine6a | Beer6a | Liquor6a | Date6b  | Details6b | Date6c  | Freq6c | Drug6c | Details6c  | Date6d  | Freq6d | Drug6d    | Details6d | Date6e     | Product6e | Date6f  | Details6f | NameAddress6f                                 | Details7a | Date7b  | Details7b | Family8a | Age8a | Status8a | Condition8a | Bank       | AccName | Rnum      | Anum        | Min     | Max      | SMin    | SMax     | Frequency | Mpremium | Dependent | Total   |
      | waepa   | 0124578967 | Mobile | No           | Mr.   | Axl   | Rose  | Illinois |SYSDate- 55y/00m/00d | No            | Mrs.   | Rachel  | Rose   | SYSDate- 59y/00m/00d | Ron    | Rose   | SYSDate- 15y/00m/00d | Male | Skylar  | Rose    | SYSDate- 19y/11m/29d | female | Yes           |400000    |   100000 |    25000 | $25,000  | $10,000   |      2500 | $300,000 | $50,000   | $12,500   | Ben    | Rose   | Son       |     100 | Alexa   | Rose     | Daughter |      100   | Male   | 309778941 | Married |    5.1 |    150 | 1 main street | Manhatten | 012588455 |     5.1 |     180 | Female  | Home    | 0124578976 | Dr. Brain Walker | 1 main street, Denver, CO, 80014 | 01/2015 | Diabetis | Yoga     |      100 | Over eating    | late payment | claim received for pension | 01/2017 | Eye Surgery | Dr. Brian Walker, 123 Park St , Melvon city,Denver, CO | Asprin     | 1 tab    | 3 times a day | Dr. Brian 2 main st , Test City,Walker,Denver, CO | 01/06/2019 | mis carriage | Yes   | Yes       | 01/2016 | Fracture  | Pain       | 02/2016    |         1 | Medication  | Dr. Maya Shane,3 main rd , City park,Miami, FL | 05/2015 | Kidney stone | Stomach pain | 08/2015    |         1 | Surgery     | Dr. Anthony Graza 456 main street , City, Warren,NJ | 01/2016 | Fracture  | Pain       | 02/2016    |         1 | Medication  | Dr. Maya Shane, 8 main street , test city ,Miami, FL | 05/2015 | Kidney stone | Stomach pain | 08/2015    |         1 | Surgery     | Dr. 12 Mn street, Warren city,Anthony Graza, Warren,NJ | 01/2016 | Fracture  | Pain       | 02/2016      |     1     | Medication  | Dr. Maya Shane, 587 Beechwood St. Casselberry, FL 32707 | 05/2015 | Kidney stone | Stomach pain | 08/2015    |         1 | Surgery     | Dr. Anthony Graza,692 Hamilton Ave. Orlando, FL 32835 | 01/2016 | Fracture  | Pain       | 02/2016    |         1 | Medication  | Dr. Maya, Shane 229 NE. Alderwood Street Dunedin, FL 34698 | 05/2015 | Kidney stone | Stomach pain | 08/2015    |         1 | Surgery     | Dr. Anthony Graza , 9900 South Armstrong Drive Tampa, FL 33612 | 01/2016 | Fracture  | Pain       | 02/2016    |         1 | Medication  | Dr. Maya Shane, 2 Oak Valley St. Laguna Niguel, CA 92677 | 05/2015 | Kidney stone | Stomach pain | 08/2015    |         1 | Surgery     | Dr. Anthony Graza, 8279 New Saddle Dr. Milpitas, CA 95035 | 01/2016 | Fracture  | Pain       | 02/2016    |         1 | Medication  | Dr. Maya Shane, 34 Erwin Park RdMontclair, NJ 07042, USA | 05/2015 | Kidney stone | Stomach pain | 08/2015    |         1 | Surgery     | Dr. Anthony Graza, 34 Erwin Park RdMontclair, NJ 07042, USA | Daily  |      2 |      3 |        1 | 01/2018 | New Year  | 05/2015 |      2 | Restil | Sleep Drug | 07/2014 |      1 | Marijuana | Medical   | 08/02/2017 | Cigar     | 05/2017 | Addict    | Dr. Mia Roger, 1 Main st , City ,San Frnc, CA | Speeding  | 09/2015 | Speeding  | Father   |    56 | Living   | Diagnosis   | Bank of CA |  Allen  |  012547896| 21564564654 | $25,000 | $900,000 | $10,000 | $450,000 | Quarterly |$334.50   | $73.63    | $408.13 |
  
      
 @WaepaRegression_8
Scenario Outline: <WAEPA_SC8> To verify Application Submission for Self and Spouse with state Texas

    Given Test set up for "NYL" feature and "NYL_WAEPA" scenario
    Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
    Then Eligibility page details are displayed to user and Enter details as Mobile"<MobPh>","<Phtype>"
    Then Select YES Radio button of Membership
    And select radio button for policyholder as "<policyholder>"
    And verify that the SELF button is selected already
    And select ArmedForce "<Armedforces>"
    And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
    Then Click on Spouse
    And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
    And Select radio button NO for Spouse is Member
    And Clicks on next button
    Then Product page details are displayed to user 
    And Selects product Group Term for Self
    And Selects product Group Term for Spouse
    And Clicks on next button
    Then Product: Additional Questions page details are displayed to user and selects Answer as Yes for Self and Spouse and enter details as "<TotalAmount>","<PendingAmount>","<Company>"
    And Clicks on next button
    Then Request Coverage page is displayed to user
    Then Select Benefit Amount for Self as "<Benefit>" under Group Term Product
    And Select "<OptionalRider>" to Optional Rider question for Self
    And Selects Benefit Amount for Spouse as "<Sbenefit>" under Group Term Life
    And Select "<sOptionalRider>" to Optional Rider question for Spouse
    And Clicks on next button
    And Verify Error Message in Spouse section
    And Selects Benefit Amount for Spouse as "<Sbenefit1>" under Group Term Life
    And Clicks on next button
    And Clicks on Add Beneficiary Button for Spouse
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<BRelation>","<BPercen>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Spouse
    Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
    And User Enters Beneficiary details as "<Tname>","<DTrust>"
    And Clicks on OK button
    And Clicks on next button
    Then WAEPA Contact Details page is displayed to user and enter contact Details for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<gender>","<Street>","<City>","<Zip>"
    And Selects No for Travel Question Non QD for Self
    And Clicks on TV checkbox
    And Enters Spouse contact details as in Waepa "<Sgender>","<Sheight>","<Sweight>","<PType>","<PPhone>"
    And Selects No for Travel Question Non QD for Spouse
    And Clicks on next button
    And Verify that the coverage amount for Self is "<Benefit>"
    And Clicks on next button
    Then Health History Page are displayed and user Select NO for all the questions
    And Enters details  for Question forth as "<Physician>","<Address>","<Date>","<Reason>","<Result>"
    And Clicks on next button
    Then Health History Page are displayed and user for Spouse Select NO for all the questions
    And Enters details  for Question forth for Spouse as "<Physician1>","<Address1>","<Date1>","<Reason1>","<Result1>"
    And Clicks on next button
    Then Payment Information Page is displayed to user and user Selects Payment option as Bank for Group Term Life Product
    And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
    And Clicks on Save button
    And Selects Frequency for Group Term Life Product and reviews "<Frequency>"
    And Validate the estimated rates values for Group Term Life for self and spouse as "<Mpremium>", "<Dependents1>", "<Total>"
    And Confirms I have read the Information Check Box on Payment Page
    And Clicks on next button
    Then Authorize page details are displayed to user and confirm the term and conditions for Self
    Then Authorize page details are displayed to user and confirm the term and conditions for Spouse
    And Clicks on next button
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Payment Authorization Letter is displayed to user and clicks on Continue
    And Signs Payment Authorization Letter
    And Clicks on next button to finish
    Then Thank you page is displayed to user
    And Verify that Confirmation number is generated for "<Website>"

    Examples: 
      | Website | MobPh      | Phtype | policyholder | Armedforces | Title | Fname    | Lname   | State | DOB                   | Stitle | Sfname | Slname  | SDOB                   | TotalAmount | PendingAmount | Company     | OptionalRider | sOptionalRider | Benefit  | Sbenefit | Sbenefit1 | Bfname | Blname | BRelation | BPercen | Tname | DTrust   | SSN       | Mstatus | Height | Weight | Street    | City      | Zip       | gender | Sheight | Sweight | PType | PPhone     | Sgender | Physician | Address                              | Date   | Reason  | Result | Physician1     | Address1                               | Date1  | Reason1 | Result1 | Bank     | AccName | Rnum      | Anum        | Frequency | Mpremium | Dependents1 | Total   |
      | waepa   | 0124578962 | Mobile | No           | No          | Mr.   | Nicholas | Spencer | Texas | SYSDate- 64y/00m/00d  | Mrs.   | Autumn | Spencer |   SYSDate- 60y/00m/00d |        5000 |          1000 | Co. Limited | No            | No             | $100,000 |    60000 |     50000 | Harvey | Spencer | Son      |     100 | Corp  | 01012011 | 340688941 | Married |    5.1 |     15 | 1 Road St | Manhatten | 012588455 | male   |   5.1   |     180 | Home  | 0124578962 | Female  | Dr. Mark  | 295 Jefferson Avenue Indio, CA 92201 | 012010 | Illness | Good   | Dr. Denis kevin| 312# Oak Drive Ext Honea Path,SC 29654 | 012014 | Illness | Good    | Bank one | Allen   | 012547896 | 21564564654 | Quarterly | $144.00  | $92.50      | $236.50 |

  @WaepaRegression_9
  Scenario Outline: <WAEPA_SC9> Application Submission for Self and Spouse CIR only application (South Carolina)
    Given Test set up for "NYL" feature and "NYL_WAEPA" scenario
    Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
    Then Eligibility page details are displayed to user and Enter details as Mobile"<MobPh>","<Phtype>"
    Then Select YES Radio button of Membership
    And select radio button for policyholder as "<policyholder>"
    Then Click on Self
    And select ArmedForce "<Armedforces>"
    And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<DOB>"
    Then Click on Spouse
    And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
    And Select radio button NO for Spouse is Member
    And Clicks on next button
    Then Product page details are displayed to user  
    And Selects product Group Term for Self
    And Selects product Group Term for Spouse
    And Clicks on next button
    Then Product: Additional Questions page details are displayed to user and selects Answer as No for Self and Spouse
    And Clicks on next button
    Then Request Coverage page is displayed to user
    And Select "<riderOnly>" for Rider Only question for self
    And Select "<sRiderOnly>" to Rider only question for spouse
    And Clicks on next button
    Then WAEPA Contact Details page is displayed to user and enter contact Details for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<gender>","<Street>","<City>","<Zip>"
    And Selects No for Travel Question Non QD for Self
    And Clicks on TV checkbox
    And Enters Spouse contact details as in Waepa "<Sgender>","<Sheight>","<Sweight>","<PType>","<PPhone>"
    And Selects Yes for Travel Question Non QD for Spouse
    And Enter datails for Outside US country and How Long months for Spouse as "<Country>","<Months>"
    And Clicks on next button
    Then Application Summary Page is displayed to user
    And verify that the Chronic Illness Rider is rendered on screen as Yes
    And Verify that the coverage amount for Self is "<Benefit>"
    And Verify Benefit Amount for Spouse as "<Sbenefit>" under TermLife
    And Clicks on next button
    Then Verify Health History Page are displayed to user
    And Select YES for self question one, two and enter details as "<Amount1a>","<WeightReason1a>","<Details2a>","<Details2b>"
    And Select YES for Self question three and enter details as "<Date3a>","<Treatment3a>","<NameAddress3a>","<Medicine3b>","<Dosage3b>","<Freq3b>","<NameAddress3b>"
    And Select YES for Self question Four as "<Physician4a>","<Address4a>","<Date4b>","<Reason4b>","<Result4c>","<EKG4d>","<Details4d>"
    And Select YES for Self question FiveA blood pressure and enter details as "<Date5a>","<Illness5a>","<Symptoms5a>","<LastDate5a>","<Attacks5a>","<Treatment5a>","<NameAddress5a>"
    And Select YES for Self question FiveB ulcer and enter details as "<Date5b>","<Illness5b>","<Symptoms5b>","<LastDate5b>","<Attacks5b>","<Treatment5b>","<NameAddress5b>"
    And Select YES for Self question FiveC asthma and enter details as "<Date5c>","<Illness5c>","<Symptoms5c>","<LastDate5c>","<Attacks5c>","<Treatment5c>","<NameAddress5c>"
    And Select YES for Self question FiveD venereal disease and enter details as "<Date5d>","<Illness5d>","<Symptoms5d>","<LastDate5d>","<Attacks5d>","<Treatment5d>","<NameAddress5d>"
    And Select YES for Self question FiveE fibrositis and enter details as "<Date5e>","<Illness5e>","<Symptoms5e>","<LastDate5e>","<Attacks5e>","<Treatment5e>","<NameAddress5e>"
    And Select YES for Self question FiveF convulsions and enter details as "<Date5f>","<Illness5f>","<Symptoms5f>","<LastDate5f>","<Attacks5f>","<Treatment5f>","<NameAddress5f>"
    And Select YES for Self question FiveG stress and enter details as "<Date5g>","<Illness5g>","<Symptoms5g>","<LastDate5g>","<Attacks5g>","<Treatment5g>","<NameAddress5g>"
    And Select YES for Self question FiveH diabetes and enter details as "<Date5h>","<Illness5h>","<Symptoms5h>","<LastDate5h>","<Attacks5h>","<Treatment5h>","<NameAddress5h>"
    And Select YES for Self question FiveI any disease and enter details as "<Date5i>","<Illness5i>","<Symptoms5i>","<LastDate5i>","<Attacks5i>","<Treatment5i>","<NameAddress5i>"
    And Select YES for Self question FiveJ anemia and enter details as "<Date5j>","<Illness5j>","<Symptoms5j>","<LastDate5j>","<Attacks5j>","<Treatment5j>","<NameAddress5j>"
    And Select YES for Self question FiveK cancer and enter details as "<Date5k>","<Illness5k>","<Symptoms5k>","<LastDate5k>","<Attacks5k>","<Treatment5k>","<NameAddress5k>"
    And Select YES for Self question FiveL any other illness and enter details as "<Date5l>","<Illness5l>","<Symptoms5l>","<LastDate5l>","<Attacks5l>","<Treatment5l>","<NameAddress5l>"
    And Select YES for Self question SixA alcoholic and enter details as "<Freq6a>","<Wine6a>","<Beer6a>","<Liquor6a>"
    And Select YES for Self question SixB more alcohol and enter details as "<Date6b>","<Details6b>"
    And Select YES for Self question SixC sedatives and enter details as "<Date6c>","<Freq6c>","<Drug6c>","<Details6c>"
    And Select YES for Self question SixD marijuana and enter details as "<Date6d>","<Freq6d>","<Drug6d>","<Details6d>"
    And Select YES for Self question SixE nicotine and enter details as "<Date6e>","<Product6e>"
    And Select YES for Self question SixF physician and enter details as "<Date6f>","<Details6f>","<NameAddress6f>"
    And Select YES for Self question seven eight and enter details as "<Details7a>","<Date7b>","<Details7b>","<Family8a>","<Age8a>","<Status8a>","<Condition8a>"
    And Clicks on next button
    Then Health History Page are displayed and user for Spouse Select NO for all the questions
    And Enters details  for Question forth for Spouse as "<Physician4a>","<Address4a>","<Date4b>","<Reason4b>","<Result4c>"
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
      | Website | MobPh      | Phtype | policyholder | Armedforces | Title | Fname  | Lname | State          | Nullvalue | DOB                  | Stitle | Sfname | Slname | SDOB                 | riderOnly | sRiderOnly | gender |  SSN      | Mstatus | Height | Weight | Street        | City      | Zip       | Sheight | Sweight | PType | PPhone     | Sgender |  Country | Months | Benefit | Sbenefit | Physician | Address       | Date   | Reason  | Result | Amount1a | WeightReason1a    | Details2a                    | Details2b                  | Date3a  | Treatment3a       | NameAddress3a                                     | Medicine3b          | Dosage3b | Freq3b     | NameAddress3b                                 | Physician4a | Address4a                                | Date4b | Reason4b              | Result4c              | EKG4d | Details4d                                        | Date5a | Illness5a | Symptoms5a | LastDate5a | Attacks5a | Treatment5a                 | NameAddress5a                               | Date5b | Illness5b | Symptoms5b         | LastDate5b | Attacks5b | Treatment5b | NameAddress5b                   | Date5c | Illness5c | Symptoms5c         | LastDate5c | Attacks5c | Treatment5c | NameAddress5c                                   | Date5d | Illness5d | Symptoms5d         | LastDate5d | Attacks5d | Treatment5d | NameAddress5d                              | Date5e | Illness5e | Symptoms5e             | LastDate5e | Attacks5e | Treatment5e | NameAddress5e                               | Date5f | Illness5f | Symptoms5f             | LastDate5f | Attacks5f | Treatment5f | NameAddress5f                               | Date5g | Illness5g | Symptoms5g | LastDate5g | Attacks5g | Treatment5g            | NameAddress5g                               | Date5h  | Illness5h    | Symptoms5h   | LastDate5h | Attacks5h | Treatment5h | NameAddress5h                | Date5i  | Illness5i | Symptoms5i | LastDate5i | Attacks5i | Treatment5i | NameAddress5i            | Date5j  | Illness5j    | Symptoms5j   | LastDate5j | Attacks5j | Treatment5j | NameAddress5j                | Date5k  | Illness5k | Symptoms5k | LastDate5k | Attacks5k | Treatment5k | NameAddress5k            | Date5l  | Illness5l    | Symptoms5l   | LastDate5l | Attacks5l | Treatment5l | NameAddress5l                | Freq6a | Wine6a | Beer6a | Liquor6a | Date6b  | Details6b | Date6c  | Freq6c | Drug6c | Details6c  | Date6d  | Freq6d | Drug6d    | Details6d | Date6e     | Product6e | Date6f  | Details6f | NameAddress6f               | Details7a | Date7b  | Details7b | Family8a | Age8a | Status8a | Condition8a |  
      | waepa   | 0124578962 | Mobile | yes          | No          | Mr.   | Austin | Fox   | South Carolina |         0 | SYSDate- 45y/00m/00d | Mrs.   | Hailey | Fox    | SYSDate- 40y/00m/00d | yes       | yes        | male   | 930908941 | Married |    5.1 |    150 | 1 main street | Manhatten | 012588455 |     5.1 |     180 | Home  | 0124578962 | Female  | Angola   |     10 | $0      | $0       | Dr. Mark  | 1 main street | 012010 | Illness | Good   |       20 | Due to overeating | Declined due to late payment | claim received for pension | 10/2011 | medicine provided | Dr.Jane Adams 1133 W Stephenson St port, IL 61032 | High Blood pressure | 10mg     | once a day | Dr. John 906 E Prairie StLitchfield, IL 62056 | Dr. Adam    | 1208 Bush River Rd J3 Columbia, SC 29210 | 012011 | Having fever and cold | Prescription provided | Yes   | Blood test done due to Alternate days high fever | 012005 | Injuiry   | chest pain |     052005 |         1 | Prescribtion and medication | Dr. John 1 main street South Carolina 25418 | 052011 | Illness   | Low Blood pressure |     052011 |         0 | Medication  | Dr. Jane Silvia 3435 Kel Sam Dr | 052011 | Illness   | Low Blood pressure |     052011 |         0 | Medication  | Dr. Jane Silvia 3435 Kel Sam DrDalzell SC 29040 | 052011 | Illness   | Low Blood pressure |     052011 |         0 | Medication  | Dr. Silvia 3435 Kel Sam DrDalzell SC 29040 | 022015 | Injuiru   | Headache and body pain |     022015 |         0 | Medication  | Dr. Silvia 3435 Kel Sam DrDalzell, SC 29040 | 022015 | Injuiru   | Headache and body pain |     022015 |         0 | Medication  | Dr. Silvia 3435 Kel Sam DrDalzell, SC 29040 | 102015 | Illness   | Back ache  |     102015 |         0 | Medication and Therapy | Dr. Silvia 3435 Kel Sam DrDalzell, SC 29040 | 05/2015 | Kidney stone | Stomach pain | 08/2015    |         1 | Surgery     | Dr. Anthony Graza, Warren,NJ | 01/2016 | Fracture  | Pain       | 02/2016    |         1 | Medication  | Dr. Maya Shane,Miami, FL | 05/2015 | Kidney stone | Stomach pain | 08/2015    |         1 | Surgery     | Dr. Anthony Graza, Warren,NJ | 01/2016 | Fracture  | Pain       | 02/2016    |         1 | Medication  | Dr. Maya Shane,Miami, FL | 05/2015 | Kidney stone | Stomach pain | 08/2015    |         1 | Surgery     | Dr. Anthony Graza, Warren,NJ | Daily  |      2 |      3 |        1 | 01/2018 | New Year  | 05/2015 |      2 | Restil | Sleep Drug | 07/2014 |      1 | Marijuana | Medical   | 07/07/2017 | Cigar     | 05/2017 | Addict    | Dr. Mia Roger, San Frnc, CA | Speeding  | 09/2015 | Speeding  | Father   |    56 | Living   | Diagnosis   | 

 @WaepaRegression_10
Scenario Outline: <WAEPA_SC10>	Application Submission for Spouse and Child (Alabama)

    Given Test set up for "NYL" feature and "NYL_WAEPA" scenario
    Given Customer navigate to NYL "<Website>"
    When Clicks on Apply now button
    Then Eligibility page details are displayed to user and Enter details as HomePhone "<HomePh>","<Phtype>"
    And Select NO for Association Membership
    And Select radio button I AM A SPOUSE OF A WAEPA MEMBER   
    And Clicks on BECOME AN ASSOCIATE MEMBER radio button to enter details as "<Sfname>","<Slname>","<MembershipID>" and select the checkbox for attest
    And Click on Self
    And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<Dob>"
    And select ArmedForce "<Armedforces>"
    And Click on Child
    And Click on Add Child button
    Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDob>","<Csex>"
    And Click on Add Child button on Screen
    And Click on Add Child button
    Then Add Child Screen is displayed and Enters Child details as "<Cfname1>","<Clname1>","<CDob1>","<Csex1>"
    And Click on Add Child button on Screen
    And Click on Add Child button
    Then Add Child Screen is displayed and Enters Child details as "<Cfname2>","<Clname2>","<CDob2>","<Csex2>"
    And Click on Add Child button on Screen
    And Clicks on next button
    Then Product page details are displayed to user
    And selects the product for Self and Child for Group Term Life Insurance
    And Clicks on next button
    Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
    And Clicks on next button
    Then Select Benefit Amount for Self as "<Benefit>" under Group Term Product
    And Select "<OptionalRider>" to Optional Rider question for Self
    And Selects benefit amount for Group Term Product Child as "<Cbenefit>"
    And Clicks on next button
    And Clicks on Add Beneficiary button for Self
    Then Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons
    And User Enters Beneficiary details as "<Tname>","<DTrust>"
    And Clicks on OK button
    And Clicks on Add Beneficiary button for Self
    Then Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons
    And User Enters Beneficiary details as name and relationship"<Bfname>","<Blname>","<BRelation>","<BPercen>"
    And Clicks on OK button
    And Clicks on next button
    Then WAEPA Contact Details page is displayed to user and enter contact Details for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<gender>","<Street>","<City>","<Zip>"
    And Selects No for Travel Question Non QD for Self
    And Clicks on FAMILY checkbox
    And Clicks on next button
    Then Application Summary Page is displayed to user
    And Clicks on next button
    Then Health History Page are displayed and user Select NO for all the questions
    And Enters details  for Question forth as "<Physician>","<Address>","<Date>","<Reason>","<Result>"
    And Clicks on next button
    Then Payment Information Page is displayed to user and user Selects Payment option as Bank for Group Term Life Product
    And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
    And Clicks on Save button
    And Selects Frequency for Group Term Life Product and reviews "<Frequency>"
    And Validate the estimated rates values for Group Term Life for Self and Dependents as "<Mpremium>","<Dependents1>","<Total>"
    And Confirms I have read the Information Check Box on Payment Page
    And Clicks on next button
    Then Authorize page details are displayed to user and confirm the term and conditions for Self
    And Clicks on next button
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Payment Authorization Letter is displayed to user and clicks on Continue
    And Signs Payment Authorization Letter
    And Clicks on next button to finish
    Then Thank you page is displayed to user
    And Verify that Confirmation number is generated for "<Website>"

    Examples: 
      | Website | HomePh     | Phtype | Sfname | Slname | MembershipID | Title | Fname   | Lname | State   | Dob                   | Cfname | Clname | CDob                 | Csex | Cfname1     | Clname1 | CDob1                | Csex1 | Cfname2 | Clname2 | CDob2                | Csex2 | Benefit | OptionalRider | Cbenefit | Tname | DTrust   | Bfname | Blname | BRelation | BPercen | SSN       | Mstatus | Height | Weight | gender | Street        | City      | Zip       | Physician      | Address       | Date   | Reason  | Result |  Bank         | AccName     | Rnum       | Anum      | Frequency | Mpremium | Dependents1 | Total   |
      | waepa   | 0124578962 | Home   | Rob    | Bryson |   608603     | Mrs.  | Clara   | Bryson | Alabama | SYSDate- 54y/00m/00d | Ryan   | Bryson | SYSDate- 12y/00m/00d | Male | Christopher | Bryson  | SYSDate- 19y/00m/00d | Male  | Joshua  | Bryson  | SYSDate- 25y/00m/00d | Male  |  200000 | No            |    22500 | IMRB  | 02021985 | Johnny  | Bryson | Father   |     100 | 637968941 | Married |    5.1 |    150 | Male   | 1 main street | Manhatten | 012588455 | Dr. Allis Mark | 1 main street | 012010 | Illness | Good   |  Bank of OHIO | Allen Shoey | 0222222222 | 142587125 | Quarterly | $110.00  | $72.00      | $182.00 |
      
 
  @WaepaRegression_11
  Scenario Outline: <WAEPA_SC11> Application Submission with Highest valid Spouse Age (Louisiana)
    Given Test set up for "NYL" feature and "NYL_WAEPA" scenario
    Given Customer navigate to NYL "<Website>"
    Then HomePage is Displayed
    When Clicks on Apply now button
    Then Eligibility page details are displayed to user and Enter details as Mobile"<MobPh>","<Phtype>"
    Then Select YES Radio button of Membership
    And select radio button for policyholder as "<policyholder>"
    And Click on Self
    And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<Dob>"
    And select ArmedForce "<Armedforces>"
    And Clicks on next button
    Then Product page details are displayed to user 
    And Selects product Group Term for Self
    And Clicks on next button
    Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self
    And Clicks on next button
    Then Request Coverage page is displayed to user
    And Select "<riderOnly>" for Rider Only question for self
    Then Select Benefit Amount for Self as "<Benefit>" under Group Term Product
    And Select "<OptionalRider>" to Optional Rider question for Self
    And Clicks on next button
    Then Clicks on Skip Beneficiary Button
    Then WAEPA Contact Details page is displayed to user and enter contact Details for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<gender>","<Street>","<City>","<Zip>"
    And Selects No for Travel Question Non QD for Self
    And Clicks on TV checkbox
    And Clicks on next button
    Then Application Summary Page is displayed to user
    And Clicks on next button
    Then Health History Page are displayed and user Select NO for all the questions
    And Enters details  for Question forth as "<Physician>","<Address>","<Date>","<Reason>","<Result>"
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
    And Select "<OptionalRider>" to Optional Rider question for Self
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
    And Select "<OptionalRider>" to Optional Rider question for Self
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
    And Select "<OptionalRider>" to Optional Rider question for Self
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
    And Clicks on next button
    And Validate Fraud Notice LA in Read and Sign Box
    And Navigate back to Eligibility page
    And Enter New State as "<State5>"
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Select "<riderOnly>" for Rider Only question for self
    And Select "<OptionalRider>" to Optional Rider question for Self
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
    And Select "<OptionalRider>" to Optional Rider question for Self
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
    And Select "<OptionalRider>" to Optional Rider question for Self
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
    And Select "<OptionalRider>" to Optional Rider question for Self
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
    And Select "<OptionalRider>" to Optional Rider question for Self
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
    And Select "<OptionalRider>" to Optional Rider question for Self
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
    And Select "<OptionalRider>" to Optional Rider question for Self
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
    And Select "<OptionalRider>" to Optional Rider question for Self
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
    And Select "<OptionalRider>" to Optional Rider question for Self
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
    And Select "<OptionalRider>" to Optional Rider question for Self
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
    And Select "<OptionalRider>" to Optional Rider question for Self
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
    And Select "<OptionalRider>" to Optional Rider question for Self
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
    And Select "<riderOnly>" for Rider Only question for self
    And Select "<OptionalRider>" to Optional Rider question for Self
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
    And Select "<OptionalRider>" to Optional Rider question for Self
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Validate Fraud Notice WM in Read and Sign Box
    And Navigate back to Eligibility page
    And Enter New State as "<State20>"
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Select "<OptionalRider>" to Optional Rider question for Self
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Validate Fraud Notice NM in Read and Sign Box
    And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario>","<pdfEnable>","<pdfName>"  
    And Navigate back to Eligibility page
    And Enter New State as "<State21>"
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button 
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Select NO for QuestionSevenB for Self-Convicted of a crime in Last Five Years
    And Clicks on next button
    And Validate Fraud Notice CT in Read and Sign Box
    #Note: After Read & Sign and Electronic Consent, a third box is generated only for CT
		And Validates additional Notes for Connecticut state
		#Note: Verifying Additional Notes as "REVIEW THE ANSWERS ON THIS APPLICATION CAREFULLY. IF ANY OF YOUR ANSWERS ARE INCORRECT OR UNTRUE..."
    And Navigate back to Eligibility page
    And Enter New State as "<State22>"
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Validate Fraud Notice MN in Read and Sign Box
    And Validate Authorization Message MN in Read and Sign Box
    

Examples: 
      | Website | MobPh      | Phtype | Title | Fname | Lname | State    | Dob      | Armedforces | policyholder | riderOnly | OptionalRider | Benefit | SSN       | Mstatus | Height | Weight | Street                                         | City       | Zip       | Sheight | Sweight | gender | Outside | Physician | Address                        | Date   | Reason   | Result         | State1     | State2  | State3   | State4    | State5       | State6       | State7   | State8               | State9  | State10 | State11 | State12    | State13  | State14  | State15     | State16   | State17    | State18  | State19 | State20    |State21    |State22   |pdfScenario  |pdfEnable|pdfName                               |	
      | waepa   | 0446465465 | Mobile | Mr.   | David | Wane  | Colorado | 10011987 | No          | Yes          | No        | No            | 750,000 | 125478941 | Married |    5.1 |     15 | 250 RIVERCHASE PKY E 6TH, BIRMINGHAM, AL 35244 | BIRMINGHAM | 012535244 |     3.5 |     100 | Female | No      | Dr.Phyll  | 1 main street , New York 25417 | 102010 | Not well | Now good to go | California | Alabama | Arkansas | Louisiana | Pennsylvania | Rhode Island | Maryland | District of Columbia | Florida | Kansas  | Maine   | New Jersey | New York | Oklahoma | Puerto Rico | Tennessee | Washington | Virginia | Wyoming | New Mexico |Connecticut|Minnesota |WAEPA11_NM   |1        |Important Notice All except NM 2 08.12|

  @WaepaRegression_12
  Scenario Outline: <WAEPA_SC12> Application Submission for Spouse Only (member and a Existing policyholder)
    Given Test set up for "NYL" feature and "NYL_WAEPA" scenario
    Given Customer navigate to NYL "<Website>"
    Then HomePage is Displayed
    When Clicks on Apply now button
    Then Eligibility page details are displayed to user and Enter details as Mobile"<MobPh>","<Phtype>"
    And Select YES Radio button of Membership
    And select radio button for policyholder as "<policyholder>"
    And Click on Spouse
    And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<Dob>"
    And select ArmedForce "<Armedforces>"
    And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB>"
    And Select radio button NO for Spouse is Member
    And Clicks on next button
    Then Product page details are displayed to user 
    And Selects product Group Term for Spouse
    And Clicks on next button
    And Click YES for Dependent Coverage information
    Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
    And Clicks on next button
    And Select "<riderOnly>" to Rider only question for spouse
    And Selects Benefit Amount for Spouse as "<Benefit>" under Group Term Life
    And Verify that the Optional rider is disabled for Spouse
    And Selects Benefit Amount for Spouse as "<Benefit1>" under Group Term Life
    And Verify that the optional rider is enabled for Spouse
    And Select "<OptionalRider>" to Optional Rider question for Spouse
    And Validates under Group Term Life for Spouse the Benefit Slider Range as "<Min30>" to "<Max30>"
    And Navigate back to Eligibility page
    And Enters DOB for Spouse as "<SDob1>"
    And Clicks on next button
    And Clicks on next button
    Then Click YES for Dependent Coverage information
    And Clicks on next button
    Then Request Coverage page is displayed to user
    And Validates under Group Term Life for Spouse the Benefit Slider Range as "<Min65>" to "<Max65>"
    And Clicks on next button
    Then Beneficiary Page is displayed to user
    And Clicks on Add Beneficiary Button for Spouse
    Then Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons
    And User Enters Beneficiary details as name and relationship as other "<Bfname>","<Blname>","<BRelation>","<BPercen>","<Bdescription>"
    And Clicks on OK button
    And Clicks on Add Beneficiary Button for Spouse
    Then Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons
    And User Enters Beneficiary details as "<Trust>","<Datetrust>"
    And Clicks on OK button
    And Clicks on next button
    Then Contact Details page is displayed to user and enters contact Details for self Without MemberID,Height and Weight as "<SSN>","<Mstatus>","<gender>","<Street>","<City>","<Zip>"
    And Clicks on TV checkbox
    And Enters Spouse contact details as in Waepa "<Sgender>","<Sheight>","<Sweight>","<PType>","<PPhone>"
    And Selects Yes for Travel Question Non QD for Spouse
    And Enter datails for Outside US country and How Long months for Spouse as "<Country>","<Months>"
    And Clicks on next button
    Then Application Summary Page is displayed to user
    And Clicks on next button
    Then Health History Page are displayed and user Select NO for all the questions
    And Enters details  for Question forth for Spouse as "<Physician>","<Address>","<Date>","<Reason>","<Result>"
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
      | Website | MobPh      | Phtype | policyholder | Title | Fname | Lname | State   | Dob                  | Sfname | Slname | Stitle | Fname | Lname | SDOB                 | SDob1                | Armedforces | Benefit | Benefit1 | riderOnly | OptionalRider | Bfname | Blname | BRelation | Bdescription | BPercen | Trust | Datetrust | SSN       | Mstatus | Sheight | Sweight | Street        | City      | Zip       | Physician      | Address                                  | Date   | Reason  | Result      | gender |  Min30 | Max30  | Min65   | Max65    | PType | PPhone     | Sgender |  Country | Months  |
      | waepa   | 0221458987 | Mobile | Yes          | Mr.   | Usher | West  | Arizona | SYSDate- 30y/00m/00d | Lily   | West   | Mrs.   | Ricky | West  | SYSDate- 30y/00m/00d | SYSDate- 65y/00m/00d | NO          |   40000 |   170000 | No        | No            | Luke   | West   | Other     | Gaurdian     |     100 | Corp  |  01012010 | 508587968 | Married |     5.1 |     180 | 1 main street | Manhatten | 012588455 | Dr. John David | 36707 N Old Woods Trl , Gurnee, IL 60031 | 012014 | illness | Pescription | Male   |    0   | 500000 | $10,000 | $200,000 | Home  | 1032145646 | Female  | Algeria  |     12  |

      
  @WaepaRegression_13
  Scenario Outline: <WAEPA_SC13> Rate Verification
			Given Test set up for "NYL" feature and "NYL_WAEPA" scenario
	    Given Customer navigate to NYL "<Website>"
	    Then HomePage is Displayed
	    And Clicks on Apply now button
			Then Eligibility page details are displayed to user and Enter details as Mobile"<MobPh>","<Phtype>"
			Then Select YES Radio button of Membership
			And select radio button for policyholder as "<policyholder>"
			And verify that the SELF button is selected already
			And Enter details for self as "<Title>","<Fname>","<Lname>","<State>","<Dob24>"
			And select ArmedForce "<Armedforces>"
			Then Click on Spouse
			And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB18>"
			And Select radio button NO for Spouse is Member
			And Click on Child
			And Click on Add Child button
			Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDob15>","<Csex>"
			And Click on Add Child button on Screen
			And Clicks on next button
			Then Selects the product for Self, Spouse and Children for Group Term Life Insurance
			And Clicks on next button
			Then Product: Additional Questions page details are displayed to user and selects Answer as No for Self and Spouse
			And Clicks on next button
			Then Request Coverage page is displayed to user
			Then Request Coverage page is displayed to user and select Benefit Amount for Group Term Product self as "<benefit24>"
			And Select "<OptionalRider>" to Optional Rider question for Self
			And Selects Benefit Amount for Spouse as "<Sbenefit18>" under Group Term Life
			And Select "<OptionalRider>" to Optional Rider question for Spouse
			And Validates that the Child benefit amount for Group Term Product is disabled and selected as "<Cbenefit15>"
			And Clicks on next button
			Then Clicks on Skip Beneficiary Button
			Then WAEPA Contact Details page is displayed to user and enter contact Details for self as "<SSN>","<Mstatus>","<Height>","<Weight>","<gender>","<Street>","<City>","<Zip>"
			And Selects No for Travel Question Non QD for Self
			And Clicks on TV checkbox
			And Enters Spouse contact details as in Waepa "<Sgender>","<Sheight>","<Sweight>","<SPType>","<SPPhone>"
			And Selects No for Travel Question Non QD for Spouse
			And Clicks on next button
			Then Application Summary Page is displayed to user
			And Clicks on next button
			Then Health History Page are displayed and user Select NO for all the questions
			And Enters details  for Question forth as "<Physician4a>","<Address4a>","<Date4b>","<Reason4b>","<Result4c>"
			And Clicks on next button
			Then Health History Page are displayed and user for Spouse Select NO for all the questions
			And Enters details  for Question forth for Spouse as "<Physician4a>","<Address4a>","<Date4b>","<Reason4b>","<Result4c>"
			And Clicks on next button
			Then Payment Information Page is displayed to user and user Selects Payment option as Bank for Group Term Life Product
			And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
			And Clicks on Save button
			And Selects Frequency for Group Term Life Product and reviews "<Frequency>"
			And Validate the estimated rates values for Group Term Life for Self and Dependents as "<Mpremium>","<Dependents18>","<Total>" 
			And Navigate back to Eligibility page
			And Enters DOB for Self as "<Dob34>"
			And Enters DOB for Spouse as "<SDob34>"
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			Then Select Benefit Amount for Self as "<benefit34>" under Group Term Product
			And Selects Benefit Amount for Spouse as "<Sbenefit34>" under Group Term Life
			And Select "<OptionalRider>" to Optional Rider question for Self
			And Select "<OptionalRider>" to Optional Rider question for Spouse
			And Validates that the Child benefit amount for Group Term Product is disabled and selected as "<Cbenefit15>"
			And Clicks on next button
			Then Clicks on Skip Beneficiary Button
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			Then Payment Information Page is displayed to user and user Selects Payment option as Bank for Group Term Life Product
			And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
			And Clicks on Save button
			And Selects Frequency for Group Term Life Product and reviews "<Frequency>"
			And Validate the estimated rates values for Group Term Life for Self and Dependents as "<Mpremium34>","<Dependents34>","<Total1>"
			And Navigate back to Eligibility page
			And Enter New State as "<State1>"
			And Enters DOB for Self as "<Dob39>"
			And Enters DOB for Spouse as "<SDob39>"
			And Click on Child
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			Then Select Benefit Amount for Self as "<benefit39>" under Group Term Product
			And Select "<OptionalRider>" to Optional Rider question for Self
			And Selects Benefit Amount for Spouse as "<Sbenefit39>" under Group Term Life
			And Select "<OptionalRider>" to Optional Rider question for Spouse
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			Then Payment Information Page is displayed to user and user Selects Payment option as Bank for Group Term Life Product
			And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
			And Clicks on Save button
			And Selects Frequency for Group Term Life Product and reviews "<Frequency>"
			And Validate the estimated rates values for Group Term Life for self and spouse as "<Mpremium39>", "<Dependents39>", "<Total2>"
			And Navigate back to Eligibility page
			And Enters DOB for Self as "<Dob49>"
			And Enters DOB for Spouse as "<SDob49>"
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			Then Select Benefit Amount for Self as "<benefit49>" under Group Term Product
			And Select "<OptionalRiderNo>" to Optional Rider question for Self
			And Selects Benefit Amount for Spouse as "<Sbenefit49>" under Group Term Life
			And Select "<OptionalRiderNo>" to Optional Rider question for Self
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			Then Payment Information Page is displayed to user and user Selects Payment option as Bank for Group Term Life Product
			And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
			And Clicks on Save button
			And Selects Frequency for Group Term Life Product and reviews "<Frequency>"
			And Validate the estimated rates values for Group Term Life for self and spouse as "<Mpremium49>", "<Dependents49>", "<Total3>"
			And Navigate back to Eligibility page
			And Enter New State as "<State2>"
			And Enters DOB for Self as "<Dob44>"
			And Enters DOB for Spouse as "<SDob44>"
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			Then Select Benefit Amount for Self as "<benefit44>" under Group Term Product
			And Select "<OptionalRider>" to Optional Rider question for Self
			And Selects Benefit Amount for Spouse as "<Sbenefit44>" under Group Term Life
			And Select "<OptionalRider>" to Optional Rider question for Spouse
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			Then Payment Information Page is displayed to user and user Selects Payment option as Bank for Group Term Life Product
			And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
			And Clicks on Save button
			And Selects Frequency for Group Term Life Product and reviews "<Frequency>"
			And Validate the estimated rates values for Group Term Life for self and spouse as "<Mpremium44>", "<Dependents44>", "<Total4>"
			And Navigate back to Eligibility page
			And Enter New State as "<State3>"
			And Enters DOB for Self as "<Dob54>"
			And Click on Spouse
			And Click on Child
			And Click on Add Child button
			Then Add Child Screen is displayed and Enters Child details as "<Cfname>","<Clname>","<CDob24>","<Csex>"
			And Click on Add Child button on Screen
			And Clicks on next button
			And Selects product Group Term Life Insurance for Child
			And Clicks on next button
			And Clicks on next button
			Then Select Benefit Amount for Self as "<benefit54>" under Group Term Product
			And Select "<OptionalRider>" to Optional Rider question for Self
			And Selects benefit amount for Group Term Product Child as "<Cbenefit24>"
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			Then Payment Information Page is displayed to user and user Selects Payment option as Bank for Group Term Life Product
			And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
			And Clicks on Save button
			And Selects Frequency for Group Term Life Product and reviews "<Frequency>"
			And Validate the estimated rates values for Group Term Life for self and spouse as "<Mpremium54>", "<Dependents24>", "<Total5>"		
			And Navigate back to Eligibility page
			And Enter New State as "<State4>"
			And Enters DOB for Self as "<Dob29>"
			And Click on Spouse
			And Enter details for Spouse as "<Stitle>","<Sfname>","<Slname>","<SDOB29>"
			And Select radio button NO for Spouse is Member
			#And Enter DOB for child as "<CDob01>"
			And Clicks on next button
			Then Product page details are displayed to user 
    		And Selects product Group Term for Spouse
			And Clicks on next button
			Then Product: Additional Questions page details are displayed to user and selects Answer as No for all for Spouse
			And Clicks on next button
			Then Request Coverage page is displayed to user and select Benefit Amount for Group Term Product self as "<benefit29>"
			And Select "<OptionalRider>" to Optional Rider question for Self
			And Selects Benefit Amount for Spouse as "<Sbenefit29>" under Group Term Life
			And Select "<OptionalRider>" to Optional Rider question for Spouse
			And Validates that the Child benefit amount for Group Term Product is disabled and selected as "<Cbenefit01>"
			And Clicks on next button
			And Clicks on next button
			And Enters Spouse contact details as in Waepa "<Sgender>","<Sheight>","<Sweight>","<PType>","<PPhone>"
			And Selects No for Travel Question Non QD for Spouse
			And Clicks on next button
			And Clicks on next button
			Then Health History Page are displayed and user Select NO for all the questions
			And Enters details  for Question forth as "<Physician4a>","<Address4a>","<Date4b>","<Reason4b>","<Result4c>"		
			And Clicks on next button
			Then Health History Page are displayed and user for Spouse Select NO for all the questions
			And Enters details  for Question forth for Spouse as "<Physician4a>","<Address4a>","<Date4b>","<Reason4b>","<Result4c>"
			And Clicks on next button
			Then Payment Information Page is displayed to user and user Selects Payment option as Bank for Group Term Life Product
			And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
			And Clicks on Save button
			And Selects Frequency for Group Term Life Product and reviews "<Frequency>"
			And Validate the estimated rates values for Group Term Life for self and spouse as "<Mpremium29>", "<Dependents29>", "<Total6>" 	
			And Navigate back to Eligibility page
			And Enter New State as "<State5>"
			And Enters DOB for Self as "<Dob69>"
			And Enters DOB for Spouse as "<SDob69>"
			#And Click on Child
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			Then Select Benefit Amount for Self as "<benefit69>" under Group Term Product
			And Selects Benefit Amount for Spouse as "<Sbenefit69>" under Group Term Life
			#Note: Optional rider not rendered due to age 
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			And Clicks on next button
			Then Payment Information Page is displayed to user and user Selects Payment option as Bank for Group Term Life Product
			And User enters Details for Bank Account as "<Bank>","<AccName>","<Rnum>","<Anum>"
			And Clicks on Save button
			And Selects Frequency for Group Term Life Product and reviews "<Frequency>"
			And Validate the estimated rates values for Group Term Life for self and spouse as "<Mpremium69>", "<Dependents69>", "<Total7>"
			      
Examples:
| Website | MobPh      | Phtype | policyholder | Title | Fname | Lname | State   |Dob24               |  Armedforces| Stitle | Sfname | Slname | SDOB18               | Cfname | Clname | CDob15                 | Csex | OptionalRider | benefit24 | Sbenefit18 | Cbenefit15 | gender | SSN        | Mstatus | Height | Weight | Street        | City      | Zip       |PType | PPhone    | Sheight | Sweight | Sgender | SPType | SPPhone    | Physician4a      | Address4a                        | Date4b  | Reason4b | Result4c | Bank        |AccName   | Rnum      |Anum           | Frequency  | Mpremium | Dependents18 |  Total   | Dob34                 | SDob34                | benefit34  | Sbenefit34   |Cbenefit34  |Mpremium34 | Dependents34 |Total1   |  State1      | Dob39               |SDob39                | benefit39  | OptionalRider | Sbenefit39 | Mpremium39 | Dependents39 |Total2  | Dob49                 | SDob49              | benefit49  |Sbenefit49 | OptionalRiderNo | Mpremium49 | Dependents49 | Total3  |  State2   |  Dob44             | SDob44               | benefit44  | Sbenefit44 | Mpremium44 | Dependents44 | Total4  | State3  | Dob54                | CDob24               | benefit54  | Cbenefit24 | Mpremium54 | Dependents24| Total5  | State4   | Dob29                | SDOB29               | CDob01                 | benefit29  | Sbenefit29 | Cbenefit01 |  Mpremium29 |  Dependents29 | Total6 | State5    | Dob69                | SDob69               | benefit69 | Sbenefit69 | Mpremium69 | Dependents69  | Total7 | 
| waepa   | 0124578967 | Mobile | No           | Mr.   | Allen | Shoey | Maine   |SYSDate- 24y/00m/00d| No          | Mrs.   | Jane   | Shoey  | SYSDate- 18y/00m/00d | Al     | Shoey  | SYSDate- 15y/00m/00d   | Male | Yes           |  750000   |   330000   |    25000   | Male   |  125478941 | Married |    5.1 |    150 | 1 main street | Manhatten | 012588455 |Home  | 0124578976|     4.1 |     120 | Female  | Home   | 0124578976 | Dr. Brain Walker | 1 main street, Denver, CO, 80014 | 01/2015 | Diabetis | Yoga     | Bank of CO  | Denial J | 5478596587| 6256574981798 |  Quarterly  | $82.50   |     $51.98   |  $134.48 |  SYSDate- 34y/03m/10d |  SYSDate- 34y/00m/00d |    200,000 |     $50,000  |  $12,500   |  $22.00   |  $11.63      | $33.63  | Pennsylvania | SYSDate- 39y/08m/04d| SYSDate- 39y/00m/00d | $1,300,000 | Yes           | $500,000   | $191.55    | $155.00      | $346.55| SYSDate- 49y/00m/00d| SYSDate- 49y/00m/25d| $325,000 | $80,000   | No              | $117.00    | $49.60       | $166.60 | Wisconsin |SYSDate -44y/00m/00d| SYSDate -44y/00m/00d | $1,500,000 | $100,000   | $334.50    | $43.25       | $377.75 | Tennesse| SYSDate -54y/00m/00d | SYSDate -24y/00m/00d |  $900,000  | $20,000    | $599.40     | $64.00     | $663.40 | Maryland | SYSDate- 29y/00m/00d | SYSDate- 29y/04m/00d | SYSDate-00y/00m/01d    | $1,075,000 | $90,000    | $22,500    |  $110.46    | $18.68        | $129.14| Florida   | SYSDate- 69y/00m/00d | SYSDate- 69y/00m/00d | 25,000    | 10,000     | $81.25     | $47.50        | $128.75| 
