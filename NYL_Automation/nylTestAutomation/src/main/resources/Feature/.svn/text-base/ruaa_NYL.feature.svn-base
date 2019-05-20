Feature: RUAA Test
  
  @RuaaRegression_1
  Scenario Outline: <RUAASC01> RUAA Mobility Automation E2E

Given Test set up for "NYL" feature and "NYL_RUAA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user and enters details as  "<Fname>","<Lname>","<MM>","<DD>","<YYYY>","<Address>","<WorkHr>","<Mstatus>"
And Select Member Associaton as YES for self
And Select Dependent as YES for self
And Clicks on next button
Then Child Eligibility page is displayed select "<CeligiYes>" for child
And enter details for child as  "<Cfname>", "<Clname>" , "<CMM>", "<CDD>", "<CYYYY>"
And Select Sex as "<Cgender>" and Married as "<Childmarried>" for child
And Clicks on next button
And Verify that error message is displayed for state eligibility at top of the page
And Clicks on Back or Previous button
Then Change address as "<Address1>"
And Clicks on next button
And Clicks on next button
Then Product page is displayed with product list
And Clicks on Back or Previous button
And Clicks on Back or Previous button
Then User enters year as "<NYYYY2>" on eligibility page for Self
And Clicks on next button
And Clicks on next button
Then Product page is displayed with product list
And Validate that Group Term product is available
And Clicks on Back or Previous button
And Clicks on Back or Previous button
Then User enters year as "<NYYYY1>" on eligibility page for Self
And Clicks on next button
And Clicks on next button
Then Product page is displayed with product list
Then Validate that Group Term Life Insurance and Group Disability Income Insurance products are available
And Select Self for Group Term Life Insurance product
And Select Child for Group Term Life Insurance
And Select Self for Group Disability Insurance
And Clicks on next button
Then Your product questions page is displayed select Yes for group term life insurance questions
And enter detail for self for group term life insurance question as "<Totalamtinforce>", "<Totalamtpending>","<Company>"
And Your product questions page is displayed Select Yes and enter details for self for group disability questions as "<GDImonthlyincome>","<GDIcompany1>","<GDIMonthlybenamt1>","<GDIBenperiod1>","<GDIReplaced1>"
And Clicks on next button
Then Your Coverage page is displayed
Then Select the amount of Group Term coverage for self as "<Benefit>"
Then Select the amount of Group Disability Insurance coverage as "<Benefit1>","<GDIwait>"
And Clicks on next button
Then Child Coverage page is displayed
And Clicks on next button
Then Your Beneficiary page displayed user select YES to the question
Then Expand Group Term tab on beneficiary page for Self
And  Select first beneficiary, select Primary and Individual and enter details for self for Group Term product as "<BTrfname1>", "<BTrlname1>", "<BTrrelation1>", "<BTrpercent1>"
Then Click ADD ANOTHER BENEFICIARY for Self for Group Term
Then Select second beneficiary, select Primary and Individual and enter details for self for Group Term product as "<BTrfname2>", "<BTrlname2>", "<BTrrelation2>", "<OtherRel>","<BTrpercent2>"
Then Click ADD ANOTHER BENEFICIARY for Self for Group Term
And Verify that Primary button is disabled for Group Term for Self for third Beneficiary
Then Select third beneficiary, select Contingent and Individual and enter details for self for Group Term product as "<BTrfname2>", "<BTrlname2>", "<BTrrelation3>", "<BTrpercent3>"
Then Click ADD ANOTHER BENEFICIARY for Self for Group Term
Then Select fourth beneficiary, select Contingent and Individual and enter details for self for Group Term product as "<BTrfname4>", "<BTrlname4>", "<BTrrelation4>", "<BTrpercent4>"
And Verify that Trust is disabled for Group Term for Self for Fourth Beneficiary
And click on Delete button for fourth Beneficiary for Self for Group Term Insurance
And Clicks on next button
And Validates error message for Beneficiaries Percentage share
And Enter individual beneficiary percentage for third beneficiary as "<Newperc>" for Group Term
Then Click ADD ANOTHER BENEFICIARY for Self for Group Term
And Verify that Primary button is disabled for Group Term for Self while adding fifth beneficiary
And Verify that Contingent button is disabled for Group Term for Self while adding fifth beneficiary
And click on Delete button for fifth Beneficiary for Self for Group Term Insurance
And Clicks on next button
Then Your personal details page displayed and select "<gender>", enters details as "<SSN>","<Height>","<Weight>" and reside outside as "<Resideoutside>"
And enters details for self for country "<Country>","<Monthshowlong>"
And Clicks on next button
And Clicks on button to Save for later
Then Save Information page will be displayed to user and user will enter Login details as "<Password>","<Vpassword>" 
And Clicks OK Button Save For Later
Then  Refresh the browser
Then Clicks on Login in saved application and Enter stored EmailId and "<Password>" and clicks retrive
And enter details as "<SSN>" for self
And Clicks on next button
Then Your Contact details page displayed and select Home and select NO and user enters details as "<Phtype>","<Number>","<Bsname>","<Typebusiness>","<Baddress>"
And Clicks on next button
And Preview Page is displayed in Mobile site
#And Verify details in preview page
And Clicks on next button
 Then Authorization & Consent Page is displayed and users Clicks the checkbox for Self
And Clicks on next button
 Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Thank you page is displayed to user in Mobile site
And Verify that Confirmation number is generated in Mobile site for "<website>"
And Verify PDF information as "<pdfScenario>","<pdfEnable>"


Examples: 

| website |  Fname | Lname | MM |DD     |YYYY                  |  Address                              | WorkHr | Mstatus|Address1                                 |CeligiYes| Cfname| Clname | CMM | CDD | CYYYY             | Cgender | Childmarried |  NYYYY1            |NYYYY2             |Totalamtinforce| Totalamtpending| Company | GDImonthlyincome| GDIcompany1 | GDIMonthlybenamt1| GDIBenperiod1    | GDIReplaced1 |  Benefit| Benefit1| GDIwait  |BenDuration |Cbenefit  |BTrfname1 | BTrlname1 | BTrrelation1 | BTrpercent1| BTrfname2 |BTrlname2| BTrrelation2|OtherRel|BTrpercent2   |BTrfname3 | BTrlname3 | BTrrelation3 | BTrpercent3 |BTrfname4 | BTrlname4| BTrrelation4 | BTrpercent4 | Newperc|gender |SSN        | Height |Weight  |Resideoutside | Country    | Monthshowlong |Password | Vpassword | Phtype | Number     | Bsname| Typebusiness | Baddress                              |pdfEnable | pdfScenario |
| RUAA    |  Adam  | David |    |       | SYSDate-18Y/00M/01D  | 10 MB-52, Kleefeld, MB R0A 0V0, Canada|     45 | Married|10 Kansas Avenue Kansas City Kansas 66105| Yes     |John   | David  |     |     |SYSDate-17Y/00M/01D| Male    | No           |SYSDate-59Y/11M/29D |SYSDate-64Y/11M/29D|  50000         | 2500          | C1      | 10000           | C2          | 50000            |             30   | 5000         | 50000   |  4000   | 60 Days  | Five Years |  40000   |Ginny    | David      | Son          |       50   | Beth      | David   | Other       |  Cousin|        50    | Sophia   | David     |Daughter      |50           |Jacob    | David     |Father        |50           | 100    |Male   |6694587596 |    5.0 |    180 | Yes          |  Australia |            12 | Test@123|Test@123   | Home   | 1245874125 | Levis |Corporation   | 10 S Kansas Ave, Olathe, KS 66061, USA|    0     | RUAASC01   |							

 #@RuaaRegression_PDF 
#Examples: 
#| website |  Fname | Lname | MM |DD     |YYYY                  |  Address                              | WorkHr | Mstatus|Address1                                 |CeligiYes| Cfname| Clname | CMM | CDD | CYYYY             | Cgender | Childmarried |  NYYYY1            |NYYYY2             |Totalamtinforce| Totalamtpending| Company | GDImonthlyincome| GDIcompany1 | GDIMonthlybenamt1| GDIBenperiod1    | GDIReplaced1 |  Benefit| Benefit1| GDIwait  |BenDuration |Cbenefit  |BTrfname1 | BTrlname1 | BTrrelation1 | BTrpercent1| BTrfname2 |BTrlname2| BTrrelation2|OtherRel|BTrpercent2   |BTrfname3 | BTrlname3 | BTrrelation3 | BTrpercent3 |BTrfname4 | BTrlname4| BTrrelation4 | BTrpercent4 | Newperc|gender |SSN        | Height |Weight  |Resideoutside | Country    | Monthshowlong |Password | Vpassword | Phtype | Number     | Bsname| Typebusiness | Baddress                              |pdfEnable | pdfScenario |
#| RUAA    |  Adam  | David |    |       | SYSDate-18Y/00M/01D  | 10 MB-52, Kleefeld, MB R0A 0V0, Canada|     45 | Married|10 Kansas Avenue Kansas City Kansas 66105| Yes     |John   | David  |     |     |SYSDate-17Y/00M/01D| Male    | No           |SYSDate-59Y/11M/29D |SYSDate-64Y/11M/29D|  50000         | 2500          | C1      | 10000           | C2          | 50000            |             30   | 5000         | 50000   |  4000   | 60 Days  | Five Years |  40000   |Ginny    | David      | Son          |       50   | Beth      | David   | Other       |  Cousin|        50    | Sophia   | David     |Daughter      |50           |Jacob    | David     |Father        |50           | 100    |Male   |6694587596 |    5.0 |    180 | Yes          |  Australia |            12 | Test@123|Test@123   | Home   | 1245874125 | Levis |Corporation   | 10 S Kansas Ave, Olathe, KS 66061, USA|    1     | RUAASC01   |							

@RuaaRegression_2
Scenario Outline: <RUAASC02> Application submission for Self only with All

Given Test set up for "NYL" feature and "NYL_RUAA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user and enters details as  "<Fname>","<Lname>","<MM>","<DD>","<YYYY>","<Address>","<WorkHr>","<Mstatus>"
And Select Member Associaton as No for self
And Select Dependent as NO for self
And Validate that NEXT button is Disabled
And Select Member Associaton as YES for self
And Clicks on next button
And Verify that error message is displayed for DOB Eligibility
Then User enters year as "<NYYYY>" on eligibility page for Self
And Clicks on next button
And Verify that error message is displayed for DOB Eligibility
Then User enters year as "<NYYYY1>" on eligibility page for Self
And Clicks on next button
Then Product page is displayed with product list
And Validate that Self is available for Group Term
And Validate that Self is available for Group Disablity Insurance
And Navigate back to Eligibility page
Then User enters year as "<NYYYY2>" on eligibility page for Self
And Clicks on next button
And Validate that Group Term product is available
And Validate that Group Disablity Insurance product is not available
And Navigate back to Eligibility page
Then User enters year as "<NYYYY1>" on eligibility page for Self
And Clicks on next button
Then Product page is displayed with product list
Then Validate that Group Term Life Insurance and Group Disability Income Insurance products are available
And Clicks on Back or Previous button
And Enters Self WorkHr as "<Nwokhr>"
And Clicks on next button
And Validate that Group Disablity Insurance product is not available
And Clicks on Back or Previous button
And Enters Self WorkHr as "<WorkHr>"
And Clicks on next button
And Select Self for Group Term Life Insurance product
And Select Self for Group Disability Insurance
And Clicks on next button
Then Your product questions page is displayed select Yes for group term life insurance questions
And enter detail for self for group term life insurance question as "<Totalamtinforce>", "<Totalamtpending>","<Company>"
Then Your product questions page is displayed and select NO and enter the details for Group Disability Insurance for self as "<GDImonthlyincome>"
And Clicks on next button
Then Your Coverage page is displayed
And Validate min and max values of Group Term for Self as "<Min>", "<Max>"
And Validate min and max values for Group Disability for self as "<Min1>", "<Max1>"
And Clicks on Back or Previous button
And Enters Monthly Income for Self as "<GDImonthlyincome1>"
And Clicks on next button
And Validate min and max values for Group Disability for self as "<Min2>", "<Max2>"
And Select the amount of Group Term coverage for self as "<Benefit>"
And Select the amount of Group Disability Insurance coverage as "<Benefit1>","<GDIwait>"
And Verify that Benefit duration for Group Disability Insurance as "<BenDuration>" for Self
And Clicks on next button
Then Your Beneficiary page displayed user select YES to the question
Then Expand Group Term tab on beneficiary page for Self
And  Select first beneficiary, select Primary and Individual and enter details for self for Group Term product as "<BTrfname1>", "<BTrlname1>", "<BTrrelation1>", "<BTrpercent1>"
And Clicks on next button
And Validates error message for Beneficiaries Percentage share
Then Click ADD ANOTHER BENEFICIARY for Self for Group Term
And  Select second beneficiary, select Primary and Individual and enter details for self for Group Term product as "<BTrfname2>", "<BTrlname2>", "<BTrrelation2>", "<BTrpercent2>"
Then Click ADD ANOTHER BENEFICIARY for Self for Group Term
And Select third beneficiary, select Contigent and Trust and enter details for Self for Group Term product as "<BTwTrust>","<BTwMM>","<BTwDD>","<BTwYYYY>"
##And Verify that Contigent and Primary buttons are disabled on adding fourth beneficiary
And Clicks on next button
Then Your personal details page displayed and select "<gender>", enters details as "<SSN>","<Height>","<Weight>" and reside outside as "<Resideoutside>"
And enters details for self for country "<Country>","<Monthshowlong>"
And Clicks on next button
Then Your Contact details page displayed and select Home and select NO and user enters details as "<Phtype>","<Number>","<Bsname>","<Typebusiness>","<Baddress>"
And Clicks on next button
And Preview Page is displayed in Mobile site
##And Verify details in Preview Page
And Clicks on next button
Then Authorization page is displayed to user in mobile site
And Clicks on next button
And Validate Error message for Authorization
Then Authorization & Consent Page is displayed and users Clicks the checkbox for Self
And Clicks on next button
Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Thank you page is displayed to user in Mobile site
And Verify that Confirmation number is generated in Mobile site for "<website>"
And Verify PDF information in mobile as "<pdfScenario>","<pdfEnable>"

Examples: 
| website|Fname  |Lname  |MM|DD|YYYY                |NYYYY               |NYYYY1              |NYYYY2             | Address                                   |WorkHr|Mstatus|CeligiNo|Nwokhr|Totalamtinforce|Totalamtpending| Company| GDImonthlyincome|   Min | Max   |Min1   |Max1  |GDImonthlyincome1|Min2|Max2  |Benefit  |Benefit1| GDIwait |BenDuration |BTrfname1 | BTrlname1 | BTrrelation1 | BTrpercent1| BTrfname2 | BTrlname2 | BTrrelation2 | BTrpercent2 |BTwTrust|BTwMM|BTwDD|BTwYYYY |gender |SSN       | Height |Weight  |Resideoutside | Country    | Monthshowlong | Phtype   | Number    | Bsname| Typebusiness | Baddress                             |pdfEnable | pdfScenario |
| RUAA   |Roberta|Johnson|  |  |SYSDate-17Y/00M/01D |SYSDate-65Y/00M/01D |SYSDate-18Y/00M/00D |SYSDate-60Y/00M/01D| 10724 E 112th Pl, Henderson, CO 80640, USA|30    |Single |No      |29    |50000          |25000          | C1     |5000             | 50000 |500000 | 1000  | 2500 | 11000           |1000| 5000 | 200000  |3000    |60 Days  | Five Years | James    | Johnson   | Son          |         10 | Rina      |Johnson    | Mother       |90           | ABC    |10   |10   |1999    |Female |627458796 |    5.0 |    180 | Yes          |  Australia |            12 |  Home   | 1245874125 | JK    |Corporation  | 10 S Kansas Ave, Olathe, KS 66061, USA|    0     | RUAASC02   |
#@RuaaRegression_PDF
#
#Examples: 
#| website|Fname  |Lname  |MM|DD|YYYY                |NYYYY               |NYYYY1              |NYYYY2             | Address                                   |WorkHr|Mstatus|CeligiNo|Nwokhr|Totalamtinforce|Totalamtpending| Company| GDImonthlyincome|   Min | Max   |Min1   |Max1  |GDImonthlyincome1|Min2|Max2  |Benefit  |Benefit1| GDIwait |BenDuration |BTrfname1 | BTrlname1 | BTrrelation1 | BTrpercent1| BTrfname2 | BTrlname2 | BTrrelation2 | BTrpercent2 |BTwTrust|BTwMM|BTwDD|BTwYYYY |gender |SSN       | Height |Weight  |Resideoutside | Country    | Monthshowlong | Phtype   | Number    | Bsname| Typebusiness | Baddress                             |pdfEnable | pdfScenario |
#| RUAA   |Roberta|Johnson|  |  |SYSDate-17Y/00M/01D |SYSDate-65Y/00M/01D |SYSDate-18Y/00M/00D |SYSDate-60Y/00M/01D| 10724 E 112th Pl, Henderson, CO 80640, USA|30    |Single |No      |29    |50000          |25000          | C1     |5000             | 50000 |500000 | 1000  | 2500 | 11000           |1000| 5000 | 200000  |3000    |60 Days  | Five Years | James    | Johnson   | Son          |         10 | Rina      |Johnson    | Mother       |90           | ABC    |10   |10   |1999    |Female |627458796 |    5.0 |    180 | Yes          |  Australia |            12 |  Home   | 1245874125 | JK    |Corporation  | 10 S Kansas Ave, Olathe, KS 66061, USA|    1     | RUAASC02   |

@RuaaRegression_3
Scenario Outline: <RUAA_SC03> Application submission for child only with LI Product


Given Test set up for "NYL" feature and "NYL_RUAA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user and enters details as  "<Fname>","<Lname>","<MM>","<DD>","<YYYY>","<Address>","<WorkHr>","<Mstatus>"
And Select Member Associaton as YES for self
And Select Dependent as YES for self
And Clicks on next button
 Then Child Eligibility page is displayed select "<CeligiYes>" for child
 And enter details for child as  "<Cfname>", "<Clname>" , "<CMM>", "<CDD>", "<CYYYY>"
 And Select Sex as "<Cgender>" and Married as "<Childmarried>" for child
 And Clicks on next button
 And Verify that error message is displayed for restricted state
 And Clicks on Back or Previous button
 Then Change address as "<State1>"
And Clicks on next button
And Clicks on next button
Then Product page is displayed with product list
And Validate that Self is available for Group Term
And Clicks on Back or Previous button
Then Child Eligibility page is displayed and enter year details for child as "<CNYYYY>"
And Clicks on next button
Then Product page is displayed with product list
And Verify that Child button is available for Group Term Life Insurance
And Clicks on Back or Previous button
And Click on ADD ANOTHER CHILD button
And enter details for second child as "<Cfname1>", "<Clname1>" , "<CMM1>", "<CDD1>", "<CYYYY1>"
And Select Sex as "<Cgender1>" and Married as "<CMarried1>" for second child
And Click on ADD ANOTHER CHILD button
And enter details for third child as "<Cfname2>", "<Clname2>" , "<CMM2>", "<CDD2>", "<CYYYY2>"
And Select Sex as "<Cgender2>" and Married as "<CMarried2>" for third child
And Click on ADD ANOTHER CHILD button
And enter details for fourth child as "<Cfname3>", "<Clname3>" , "<CMM3>", "<CDD3>", "<CYYYY3>"
And Select Sex as "<Cgender3>" and Married as "<CMarried3>" for fourth child
And Click on ADD ANOTHER CHILD button
And enter details for fifth child as "<Cfname4>", "<Clname4>" , "<CMM4>", "<CDD4>", "<CYYYY4>"
And Select Sex as "<Cgender4>" and Married as "<CMarried4>" for fifth child
And Click on ADD ANOTHER CHILD button
And enter details for sixth child as "<Cfname5>", "<Clname5>" , "<CMM45>", "<CDD5>", "<CYYYY5>"
And Select Sex as "<Cgender5>" and Married as "<CMarried5>" for sixth child
And Click on ADD ANOTHER CHILD button
And enter details for seventh child as "<Cfname6>", "<Clname6>" , "<CMM6>", "<CDD6>", "<CYYYY6>"
And Select Sex as "<Cgender6>" and Married as "<CMarried6>" for seventh child
And Click on ADD ANOTHER CHILD button
And enter details for eighth child as "<Cfname7>", "<Clname7>" , "<CMM7>", "<CDD7>", "<CYYYY7>"
And Select Sex as "<Cgender7>" and Married as "<CMarried7>" for eighth child
And Clicks on next button
Then Product page is displayed with product list
And Select Child for Group Term Life Insurance
And Clicks on next button
Then Validate Dependent only Pop up message and click on ok
Then Child Coverage page is displayed
And Verify that Eligible Child Names as "<Cfname>","<Cfname2>","<Cfname7>" under Group Term Life
## Cfname1 to Cfname
And Validate that "<Cbenamount>" is Child coverage amount under Group Term Life
And Clicks on next button
Then Your Personal details page displayed and select "<gender>", "<SSN>"
And Clicks on next button
Then Your Contact details page displayed and select Home and user enters phone details as "<Phtype>","<Number>"
And Clicks on next button
And Preview Page is displayed in Mobile site
And Expand Child Info
And Verify coverage amount "<Cbenamount>" for Child under Group Term Life Insurance
And verify that the Child name is displayed as "<Cfname>" and "<Clname>" in Preview page
And verify that the Child name is displayed as "<Cfname2>" and "<Clname2>" in Preview page
And verify that the Child name is displayed as "<Cfname7>" and "<Clname7>" in Preview page
And Clicks on next button
 Then Authorization & Consent Page is displayed and users Clicks the checkbox for Self
And Clicks on next button
 Then Review and sign page details are displayed to user and Click on continue and attached the sign
And Clicks on next button to finish
Then Thank you page is displayed to user in Mobile site
And Verify that Confirmation number is generated in Mobile site for "<website>"
And Verify PDF information in mobile as "<pdfScenario>","<pdfEnable>"


Examples:
| website |  Fname | Lname    | MM|DD|YYYY                |  Address                            | WorkHr | Mstatus|CeligiYes| Cfname| Clname  | CMM|CDD|CYYYY              |CNYYYY               | Cgender | Childmarried |State1                                    |Cfname1 | Clname1  |CMM1|CDD1| CYYYY1                | Cgender1 | CMarried1 | Cfname2 | Clname2  |CMM2|CDD2|CYYYY2              | Cgender2 | CMarried2 |Cfname3 | Clname3 | CMM3| CDD3| CYYYY3            | Cgender3 | CMarried3 |Cfname4 | Clname4 | CMM4| CDD4| CYYYY4            | Cgender4| CMarried4 | Cfname5 | Clname5  | CMM5| CDD5| CYYYY5            | Cgender5 | CMarried5 | Cfname6 | Clname6| CMM6| CDD6| CYYYY6               | Cgender6 | CMarried6 | Cfname7 | Clname7 | CMM7| CDD7| CYYYY7             | Cgender7| CMarried7 | Cbenamount|Benefit|BenDuration| gender |SSN       |  Phtype | Number  |pdfEnable | pdfScenario |
| RUAA    |  Peter  | Gilmore |   |  |SYSDate-18Y/00M/01D | 10 NY-25A, Centerport, NY 11721, USA|     45 | Single | Yes     |Ramsey | Gilmore |    |   |SYSDate-00Y/00M/13D|SYSDate-00Y/00M/15D  | Male    | No           |10 Washington Los Angeles California 90292|Rosey   | Gilmore  |    |    | SYSDate-23Y/00M/00D   | Female   | No        |   Henry | Gilmore  |    |    | SYSDate-21Y/00M/00D| Male     | No        |Simon   | Gilmore |     |     |SYSDate-19Y/00M/00D| Male     | Yes       |  Bravo | Gilmore |     |     |SYSDate-25Y/00M/00D| Male    | Yes        | Kevin   | Gilmore |     |     |SYSDate-23Y/00M/00D| Male     | No        | Andrew  |Gilmore |     |     |SYSDate-23Y/00M/00D   | Male     | No        |Heena   | Gilmore  |     |     |  SYSDate-1Y/00M/00D|Female   | No         |$4,000    |50000  | Five Years| Male   |830458796 | Home   | 1245874125 |  0     | RUAASC03   |

#@RuaaRegression_PDF
#Examples:
#| website |  Fname | Lname    | MM|DD|YYYY                |  Address                            | WorkHr | Mstatus|CeligiYes| Cfname| Clname  | CMM|CDD|CYYYY              |CNYYYY                | Cgender | Childmarried |State1                                              |Cfname1 | Clname1  |CMM1|CDD1| CYYYY1                | Cgender1 | CMarried1 | Cfname2 | Clname2  |CMM2|CDD2|CYYYY2              | Cgender2 | CMarried2 |Cfname3 | Clname3 | CMM3| CDD3| CYYYY3            | Cgender3 | CMarried3 |Cfname4 | Clname4 | CMM4| CDD4| CYYYY4            | Cgender4| CMarried4 | Cfname5 | Clname5  | CMM5| CDD5| CYYYY5            | Cgender5 | CMarried5 | Cfname6 | Clname6 | CMM6| CDD6| CYYYY6               | Cgender6 | CMarried6 | Cfname7 | Clname7 | CMM7| CDD7| CYYYY7             | Cgender7 | CMarried7 | Cbenamount|Benefit|BenDuration | gender |SSN       |  Phtype | Number  |pdfEnable | pdfScenario |
#| RUAA    |  Peter  | Gilmore |   |  |SYSDate-18Y/00M/01D | 10 NY-25A, Centerport, NY 11721, USA|     45 | Single | Yes     |Ramsey | Gilmore |    |   |SYSDate-00Y/00M/13D|SYSDate-00Y/00M/15D  | Male    | No           |10 Washington Boulevard Los Angeles California 90292|Rosey   | Gilmore  |    |    | SYSDate-23Y/00M/00D   | Female   | No        |   Henry | Gilmore  |    |    | SYSDate-21Y/00M/00D| Male     | No        |Simon   | Gilmore |     |     |SYSDate-19Y/00M/00D| Male     | Yes       |  Bravo | Gilmore |     |     |SYSDate-25Y/00M/00D| Male    | Yes        | Kevin   | Gilmore |     |     |SYSDate-23Y/00M/00D| Male     | No        |  Andrew  |Gilmore |     |     |SYSDate-23Y/00M/00D   | Male     | No        |Heena   | Gilmore  |     |     |  SYSDate-1Y/00M/00D|Female   | No         |4000       |50000   | Five Years| Male   |830458796 | Home   | 1245874125 |  1     | RUAASC03   |


@RuaaRegression_4
Scenario Outline: <RUAASC04> Read & Sign Verification Scenario

Given Test set up for "NYL" feature and "NYL_RUAA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Eligibility page details are displayed to user and enters details as  "<Fname>","<Lname>","<MM>","<DD>","<YYYY>","<Address>","<WorkHr>","<Mstatus>"
And Select Member Associaton as YES for self
And Select Dependent as YES for self
And Clicks on next button
Then Child Eligibility page is displayed select "<CeligiNo>" for child
And Clicks on next button
And Verify that error message is displayed for DOB Eligibility
And Clicks on Back or Previous button
Then User enters year as "<NYYYY>" on eligibility page for Self
And Clicks on next button
And Clicks on next button
Then Product page is displayed with product list
And Validate that Self is available for Group Term
And Validate that Self is available for Group Disablity Insurance
And Select Self for Group Term Life Insurance product
And Select Self for Group Disability Insurance
And Clicks on next button
Then Your product questions page is displayed and select the checkbox as NO for all the questions for group term life insurance
Then Your product questions page is displayed and select NO and enter the details for Group Disability Insurance for self as "<GDImonthlyincome>"
And Clicks on next button
Then Your Coverage page is displayed 
And Select the amount of Group Term coverage for self as "<Benefit>"
And Select the amount of Group Disability Insurance coverage as "<Benefit1>","<GDIwait>"
And Clicks on next button
Then Your Beneficiary page displayed user select NO to the question
And Clicks on next button
Then Your personal details page displayed and select "<gender>", enters details as "<SSN>","<Height>","<Weight>" and reside outside as "<Resideoutside>"
And enters details for self for country "<Country>","<Monthshowlong>"
And Clicks on next button
Then Your Contact details page displayed and select Home and select NO and user enters details as "<Phtype>","<Number>","<Bsname>","<Typebusiness>","<Baddress>"
And Clicks on next button
And Preview Page is displayed in Mobile site
And Clicks on next button
Then Authorization page is displayed to user in mobile site
And Validate Authorization message in Read and Sign Box
And Validate Fraud Notice CO in Read and Sign Box
And Validate Consent message in Read and Sign Box
  And Navigate back to Eligibility page
    Then Change address as "<Address1>"
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    
    And Validate Fraud Notice CA in Read and Sign Box
    And Navigate back to Eligibility page
    Then Change address as "<Address2>"
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
   
    And Validate Fraud Notice AL in Read and Sign Box
    And Navigate back to Eligibility page
   Then Change address as "<Address3>"
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    
    And Validate Fraud Notice AR in Read and Sign Box
    And Navigate back to Eligibility page
    # LA Address is restricted for RUAA
    Then Change address as "<Address5>"
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    
    And Validate Fraud Notice PA in Read and Sign Box
    And Navigate back to Eligibility page
    Then Change address as "<Address6>"
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    
    And Validate Fraud Notice RI in Read and Sign Box
    And Navigate back to Eligibility page
    Then Change address as "<Address7>"
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    
    And Validate Fraud Notice MD in Read and Sign Box
    And Navigate back to Eligibility page
    Then Change address as "<Address8>"
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    
    And Validate Fraud Notice DC in Read and Sign Box
    And Navigate back to Eligibility page
        # FL Address is restricted for RUAA

    Then Change address as "<Address10>"
    And Clicks on next button
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
            # ME Address is restricted for RUAA

    Then Change address as "<Address12>"
    And Clicks on next button
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
      # NY Address is restricted for RUAA

    Then Change address as "<Address14>"
    And Clicks on next button
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
   Then Change address as "<Address15>"
    And Clicks on next button
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
   ## WA Address is restricted for RUAA
   ## PR Address is restricted for RUAA

   Then Change address as "<Address18>"
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    
    And Validate Fraud Notice VA in Read and Sign Box
    And Navigate back to Eligibility page
    Then Change address as "<Address19>"
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Validate Fraud Notice WM in Read and Sign Box
    
And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario>","<pdfEnable>","<pdfName>" in mobile site
    And Navigate back to Eligibility page
    Then Change address as "<Address20>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Validate Fraud Notice NM in Read and Sign Box

And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario1>","<pdfEnable>","<pdfName1>" in mobile site
And Navigate back to Eligibility page
Then Change address as "<Address21>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
#Note: After Read & Sign and Electronic Consent, a third box is generated only for CT
And Validates additional Notes for Connecticut state
And Navigate back to Eligibility page
Then Change address as "<Address22>"
And Clicks on next button
And Clicks on next button
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
| website   | Fname | Lname | MM | DD | YYYY               | Address                          | WorkHr | Mstatus |CeligiNo| NYYYY             | GDImonthlyincome  |Benefit  |Benefit1| GDIwait   |BenDuration   |gender |SSN       | Height |Weight  |Resideoutside | Country    | Monthshowlong | Phtype   | Number    |Bsname| Typebusiness| Baddress                              |    Address1                                   |                   Address2         |Address3                               |   Address5                                |Address6                                     |Address7                                   |   Address8                                     |Address10                               |Address12                            |Address14                            |Address15                           |Address18                                  |Address19                         |Address20                                 |Address21                                  |Address22                              |pdfScenario|pdfScenario1|pdfEnable|pdfName                               |pdfName1                  |
| RUAA      |  Bob | Dylan |     |    |SYSDate-65Y/00M/00D | 11 CO-67, Sedalia, CO 80135, USA |     45 | Married | No     |SYSDate-18Y/00M/01D| 10000             | 200000  |3000    |60 Days     | Five Years  |Female |284658796 |    5.0 |    180 | Yes          |  Australia |            12 |  Home   | 1245874125 | Wills|Corporation  | 10 S Kansas Ave, Olathe, KS 66061, USA| 11 W California Blvd, Pasadena, CA 91105, USA | 11 AL-157, Danville, AL 35619, USA | 32 AR-5, Mountain Home, AR 72653, USA |1 North Pennell Road, Media, PA 19063, USA | 82 Rhode Island Ave, Newport, RI 02840, USA | 10 Maryland Ave, Rockville, MD 20850, USA | 32 DC Village Ln SW, Washington, DC 20032, USA | 10 S Kansas Ave, Olathe, KS 66061, USA | 11 NJ-35, Lavallette, NJ 08735, USA | 11 Oklahoma, Walters, OK 73572, USA |10 TN-25, Castalian Springs, TN,USA | 1201 S Joyce St, Arlington, VA 22202, USA | 150 E B St, Casper, WY 82601, USA| 10 New Mexico 9 Columbus New Mexico 88029|10 Connecticut Ave, Norwalk, CT 06850, USA|10 Minnesota 210 Vining Minnesota 56588 |RUAA04_WM  |RUAA04_NM   |1        |Important Notice All except NM 2 08.12|Important Notice NM 2 08.12|




