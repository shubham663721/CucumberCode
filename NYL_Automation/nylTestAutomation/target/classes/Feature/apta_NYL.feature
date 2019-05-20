Feature: Apta Test
  
  @AptaRegression_1
  Scenario Outline: <APTASC01> Application submission for Self, Spouse and Child and with all the products and rider(s)Beneficiaries- Maximum
    Given Test set up for "NYL" feature and "NYL_APTA" scenario
    Given Customer navigate to NYL "<website>"
    When Clicks on Apply now button
    Then Let’s get started page is displayed and enters login details as Username and "<Password>"
    And Clicks on next button
    Then Eligibility page details are displayed to user and enters details as  "<Fname>","<Lname>","<MM>","<DD>","<YYYY>","<Address>","<WorkHr>","<Mstatus>"
    And Select Member Associaton as YES for self
    And Select Dependent as YES for self
    And Clicks on next button
    Then Spouse Eligibility page is displayed
    Then select spouse eligibility as YES and enter details as  "<Sfname>", "<Slname>" , "<SMM>", "<SDD>", "<SYYYY>","<SWorkHr>"
    And Clicks Spouse Member Association as YES
    And Clicks on next button
    Then Child Eligibility page is displayed select "<CeligiYes>" for child
    And enter details for child as  "<Cfname>", "<Clname>" , "<CMM>", "<CDD>", "<CYYYY>"
    And Select Sex as "<Cgender>" and Married as "<Childmarried>" for child
    And Select Full time student as "<Ftstudent>" for child
    And Click on ADD ANOTHER CHILD button
    And enter details for second child as "<Cfname1>", "<Clname1>" , "<CMM1>", "<CDD1>", "<CYYYY1>"
    And Select Sex as "<Cgender1>" and Married as "<CMarried1>" for second child
  	And Select Full time student as "<Ftstudent1>" for second child
		And Click on Delete button for second child
    And Clicks on next button
    Then Product page is displayed with product list
		And Validate that No product is available for Spouse
		And Clicks on Back or Previous button
		And Clicks on Back or Previous button
		And User enters year as "<NSYYYY>" on eligibility page for Spouse
		And Clicks on next button
		And Clicks on next button
    And Verify that Child button is available for Traditional Term Life Insurance
    And Select Self, Spouse and Child for Traditional Term Life Insurance
    And Select Self, Spouse for Ten Year Level Term Life Insurance
    And Select Self, Spouse for Twenty Year Level Term Life Insurance
    And Select Self, Spouse for Long Term Disability Insurance
    And Select Self, Spouse for Short Term Disability Insurance
    And Select Self for Business Overhead Expense Insurance
    And Clicks on next button
    And Verify the note for NY is displayed
		 And Validate the content of NY Imp Replacement Info
    Then Your product questions page is displayed select Yes for group term life insurance questions
    And enter detail for self for group term life insurance question as "<Totalamtinforce>", "<Totalamtpending>","<Company>"
    And Verify New York State paragraph is displayed for Self
    And Your product questions page is displayed Select Yes and enter details for self for group disability questions as "<GDImonthlyincome>","<GDIcompany1>","<GDIMonthlybenamt1>","<GDIBenperiod1>","<GDIReplaced1>"
    And Your product questions page is displayed and select YES for all the questions and enter details for Business Overhead "<BOEmonthbusexp>","<Percentmonthbusexp>","<GDIcompany2>","<GDIMonthlybenamt2>","<GDIBenperiod2>","<GDIReplaced2>"
    And Clicks on next button
    And Validate error message for required question
    And select the NY Imp Info checkbox
     And Clicks on next button
    Then Spouse Product questions page is displayed And select the checkbox and YES for all the questions and enter details "<STotalamtinforce>","<STotalamtpending>","<SCompany>","<SGDImonthlyincome>","<SGDIcompany1>","<SGDIMonthlybenamt1>","<SGDIBenperiod1>","<SGDIReplaced1>"
    And Clicks on next button
    Then Your Coverage page is displayed
    Then Select the amount of Traditional Term coverage for self as "<Benefit>"
    Then Select the amount of TenYTL coverage for self as "<Benefit1>"
    Then Select the amount of TwentyYTL coverage for self as "<Benefit2>"
    Then Select the amount of Long Term Disability Insurance coverage for self as "<Benefit3>" and enter details "<GDIwait>", "<GDIduration>"
    And Select checkbox for BOTH riders COLA and CDB for self
    Then Select the amount of Short Term Disability Insurance coverage for self as "<Benefit4>" and enter details "<SDIwait>", "<SDIduration>"
    Then Select the amount of Business Overhead Expense Insurance coverage for self as "<Benefit5>" and enter details "<BOEwait>", "<BOEduration>"
    And Clicks on next button
    Then Spouse Coverage page is displayed
    Then Select the amount of Traditional Term coverage for spouse as "<SBenefit>"
    Then Select the amount of TenYTL coverage for Spouse as "<SBenefit1>"
    Then Select the amount of TwentyYTL coverage for Spouse as "<SBenefit2>"
    Then Enter the details of Long Term Disability Insurance coverage for Spouse as "<SBenefit3>", "<SGDIwait>", "<SGDIduration>"
    And Select check box for BOTH riders COLA and CDB for Spouse
    Then Enter the details of Short Term Disability Insurance coverage for Spouse as "<SBenefit4>", "<SSDIwait>", "<SSDIduration>"
    And Clicks on next button
    Then Child Coverage page is displayed
    And Select the amount of child coverage as "<CBenefit>" under Traditional Term Life
    And Validate that Child Name "<Cfname>" is eligible for Child coverage
    And Clicks on next button
    Then Your Beneficiary page displayed user select YES to the question
    Then Expand Traditional Term Life Insurance tab on beneficiary page for Self
    And Select first beneficiary, select Primary and Individual and enter details for self for Traditional product "<Bname1>", "<Blname1>", "<Relationship1>", "<Perc1>"
    Then Click ADD ANOTHER BENEFICIARY for Self for Traditional Insurance
    And Verify that Primary button is disabled for Traditional Insurance for Self for Second Beneficiary
    Then Select second beneficiary, select Contingent and Individual and enter details for self for Traditional product as "<Bname2>", "<Blname2>", "<Relationship2>", "<Perc2>"
    Then expand Ten-Year Level Term Life Insurance tab on beneficiary page for Self
    And select first beneficiary, select Primary and Individual and select previous details for self for Ten Year Insurance "<Benprevious>","<Benpercent>"
    Then click ADD ANOTHER BENEFICIARY for Self Ten Year Insurance
    And Verify that Second Primary button is disabled for Ten Year Insurance for Self
    Then select second beneficiary, select Contingent and Trust and enter details for self for Ten Year Insurance"<Trust1>","<DTtrust1>","<MMtrust1>","<YYtrust1>"
    Then expand Twenty-Year Level Term Life Insurance tab on beneficiary page for Self
    And select first beneficiary, select Primary and Trust and enter details for self for Twenty Year Insurance"<Trust2>","<DTtrust2>","<MMtrust2>","<YYtrust2>"
    Then click ADD ANOTHER BENEFICIARY for Self Twenty Year Insurance
    And Verify that Second Primary button is disabled for Twenty Year Insurance for Self
    Then select second beneficiary, select Contingent and Individual and enter details for self for Twenty Year Insurance "<Bname3>", "<Blname3>", "<Relationship3>", "<Perc3>"
    And Clicks on next button
    Then Spouse Beneficiary page displayed user select YES to the question
    Then expand Traditional Term Life Insurance tab on beneficiary page for Spouse
    And select first beneficiary, select Primary and Individual and enter details for Spouse for Traditional Insurance"<Bname4>", "<Blname4>", "<Relationship4>", "<Perc4>"
    Then click ADD ANOTHER BENEFICIARY for Spouse Traditional Insurance
    And verify that Second Primary button is disabled for Traditional Insurance for Spouse
    Then select second beneficiary, select Contingent and Individual and enter details for Spouse for Traditional Insurance "<Bname5>", "<Blname5>", "<Relationship5>", "<Perc5>"
    Then expand Ten-Year Level Term Life Insurance tab on beneficiary page for Spouse
    And select first beneficiary, select Primary and Individual and select previous details for Spouse for Ten Year Insurance "<SBenprevious>","<SBenpercent>"
    Then click ADD ANOTHER BENEFICIARY for Spouse Ten Year Insurance
    And verify that Second Primary button is disabled for Ten Year Insurance for Spouse
    Then select second beneficiary, select Contingent and Trust and enter details for Spouse for Ten Year Insurance "<Trust3>","<DTtrust3>","<MMtrust3>","<YYtrust3>"
    Then expand Twenty-Year Level Term Life Insurance tab on beneficiary page for Spouse
    And select first beneficiary, select Primary and Trust and enter details for Spouse for Twenty Year Insurance "<Trust4>","<DTtrust4>","<MMtrust4>","<YYtrust4>"
    Then click ADD ANOTHER BENEFICIARY for Spouse Twenty Year Insurance
    And verify that Second Primary button is disabled for Twenty Year Insurance for Spouse
    Then select second beneficiary, select Contingent and Individual and enter details for Spouse for Twenty Year Insurance "<Bname6>", "<Blname6>", "<Relationship6>", "<Perc6>"
    And click on Delete button for first beneficiary of Twenty-Year Level Term Life for spouse
    And click ADD ANOTHER BENEFICIARY for Spouse Twenty Year Insurance
		And Verify that Primary button is enabled for Twenty Year Insurance for Spouse for third beneficiary
		And select third beneficiary, select Primary and Trust and enter details for Spouse for Twenty Year Insurance "<Trust4>","<DTtrust4>","<MMtrust4>","<YYtrust4>"
     And Clicks on next button
    Then Your personal details page displayed and select "<gender>", enters details as "<SSN>","<Height>","<Weight>" and reside outside as "<Resideoutside>"
    Then Select Tabacco as "<Issmoker>" for Self
    And enters details for self for country "<Country>","<Monthshowlong>"
    And enters details for tobacco for self as "<TMM>","<TDD>","<TYYYY>", "<Tobaccoprd>"
    And Clicks on next button
    Then Spouse personal details page displayed and select "<Sgender>" and enter details as "<SSSN>", "<SHeight>","<SWeight>" and reside outside as "<Sresideoutside>"
   Then Select Tabacco as "<Sissmoker>" for Spouse
   And enters details for spouse for country "<Scountry>","<Smonthshowlong>"
    And enters details for tobacco for spouse as "<TSMM>","<TSDD>","<TSYYYY>", "<Stobaccoprd>"
    And Clicks on next button
    Then Your Contact details page displayed and select Business and select NO and user enters details as "<Phtype>","<Number>","<Bsname>","<Typebusiness>","<Baddress>"
    And Clicks on next button
    Then Spouse Contact details page displayed and user enters details as emailid and "<SPhtype>","<Sno>"
    And Clicks on next button
    And Preview Page is displayed in Mobile site
    And Expand Your Info
    And Verify coverage amount "<Benefit>" for Self under Traditional Term Insurance
		And Verify coverage amount "<Benefit1>" for Self under TenYTL
		And Verify coverage amount "<Benefit2>" for Self under TwentyYTL
		And Verify coverage amount "<Benefit3>" for Self under LTD
		And Verify coverage amount "<Benefit4>" for Self under STD
 		And Verify coverage amount "<Benefit5>" for Self under Business Overhead
 		And Expand Spouse Info
 		And Verify coverage amount "<SBenefit>" for Spouse under Traditional Term Insurance
    And Verify coverage amount "<SBenefit1>" for Spouse under TenYTL
    And Verify coverage amount "<SBenefit2>" for Spouse under TwentyYTL
    And Verify coverage amount "<SBenefit3>" for Spouse under LTD
    And Verify coverage amount "<SBenefit4>" for Spouse under STD
    And Expand Child Info
    And Verify coverage amount "<CBenefit>" for Child under Traditional Term Insurance
		And verify that the Child name is displayed as "<Cfname>" and "<Clname>" in Preview page
    And Clicks on next button
    Then Payment page is displayed, select Yes
    And Click on traditional term product and select method Bill Me and Select "<Freq>"
    Then Click on Ten Year Level Term Life Insurance coverage and Select method Bill Me and Select "<Freq1>"
    Then Click on Twenty Year Level Term Life Insurance coverage and Select method Bill Me and Select "<Freq2>"
    Then Click on Long Term Disability Insurance coverage and Select method Bill Me and Select "<Freq3>"
    Then Click on Short Term Disability Insurance coverage and Select method Bill Me and Select "<Freq4>"
    Then Click on Business Overhead Expense Insurance coverage and Select method Bill Me and Select "<Freq5>"
    And Clicks on next button
    Then Authorization & Consent Page is displayed and users Clicks the checkbox for Self
    Then Authorization & Consent Page is displayed and users Clicks the checkbox for Spouse
    And Clicks on next button
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Thank you page is displayed to user in Mobile site
    And Verify that Confirmation number is generated in Mobile site for "<website>"
    And Verify PDF information in mobile as "<pdfScenario>","<pdfEnable>"
    
     Examples: 													
 | website | Username      | Password | Fname | Lname | MM | DD | YYYY | Address                   | WorkHr | Mstatus | Sfname | Slname | SMM | SDD | SYYYY | SWorkHr | CeligiYes | Cfname | Clname | CMM | CDD | CYYYY | Cgender | Childmarried | Ftstudent |Cfname1 | Clname1| CMM1| CDD1| CYYYY1| Cgender1| CMarried1 | CFull1 | NSYYYY| Totalamtinforce | Totalamtpending | Company | GDImonthlyincome | GDIcompany1 | GDIMonthlybenamt1 | GDIBenperiod1 |GDIReplaced1 | BOEmonthbusexp |Percentmonthbusexp| GDIcompany2 | GDIMonthlybenamt2 | GDIBenperiod2 | GDIReplaced2 | STotalamtinforce | STotalamtpending |SCompany | SGDImonthlyincome | SGDIcompany1 | SGDIMonthlybenamt1 | SGDIBenperiod1 | SGDIReplaced1 | Benefit | Benefit1 | Benefit2 | Benefit3 | GDIwait | GDIduration | Benefit4 | SDIwait | SDIduration | Benefit5 | BOEwait | BOEduration | SBenefit | SBenefit1 | SBenefit2 | SBenefit3 | SGDIwait | SGDIduration | SBenefit4 | SSDIwait | SSDIduration | CBenefit | Bname1|Blname1|Relationship1|Perc1|Bname2|Blname2|Relationship2|Perc2| Benprevious|  Benpercent| Trust1|DTtrust1|MMtrust1|YYtrust1|Trust2   |DTtrust2|MMtrust2|YYtrust2| Bname3|Blname3|Relationship3|Perc3|Bname4   |Blname4|Relationship4|Perc4|Bname5  |Blname5|Relationship5|Perc5| SBenprevious   | SBenpercent | Trust3  |DTtrust3|MMtrust3|YYtrust3|Trust4    |DTtrust4|MMtrust4|YYtrust4|Bname6|Blname6|Relationship6|Perc6| gender | Issmoker | Resideoutside | Country   | Monthshowlong | SSN       | Height | Weight | TMM | TDD | TYYYY | Tobaccoprd | Sgender | Sissmoker | Sresideoutside | Scountry  | Smonthshowlong | SSSN      | SHeight | SWeight | TSMM | TSDD | TSYYYY | Stobaccoprd | Phtype | Number     | Bsname     | Typebusiness | Baddress                               | SEmailid       | SPhtype | Sno        | Freq      | Mpremium | Spremium | Cpremium | Total   | Freq1        | Mpremium1 | Spremium1 | Total1  | Freq2   | Mpremium2 | Spremium2 | Total2  | Freq3     | Mpremium3 | Spremium3 | Total3  | Freq4       | Mpremium4 | Spremium4 | Total4    | Freq5     | Mpremium5 | Total5  | Bname7|Blname7|Relationship7|Perc7|pdfEnable|pdfScenario|
 | apta    | test@test.com | Test1@@@ | Adam  | David | 12 | 06 | 2000 | 60 NY-31, Lyons, NY, USA  |     40 | Married | Alley  | David  |  04 |  25 |  2002 |  40     | Yes       | John   | David  |  07 |  17 |  2016 | Male    | No           | No        |Ricky   | David  |  11 |  15 |  2000 | Male    | Yes       | Yes    |2000   |500000           |          250000 | C1      |            10000 | C2          |             50000 |             3|         5000 |         100000 |              100 | C3          |              5000 |             3 |        50000 |           500000 |           250000 | C4      |             10000 | C5           | 5000               |              3 |         50000 |  550000 |   450000 |   300000 |     6600 | 60 Days | Age 65      |     4000 | 0/7     | 6 months    |    15000 | 30 Days | 24 Months   |   450000 |    300000 |    250000 |      6600 | 90 Days  | Age 65       |      4000 | 0/7      | 6 months     |    10000 | Mike  | David | Son         | 100 | Mile | David | Mother      | 100 | Mike David |        100 | Bright|    11  |    11  |  2001  | Spirit  |    11 |    11 |    2002  | Rosey | David | Daughter    | 100 | Angelina| David | Daughter    | 100 | Hussain| David | Other       | 100 | Angelina David |         100 | Sunrise |     11 |     11 |   2001 | Ambition |     11 |     11 | 2002   | Johny| David | Son         |100  | Male   | Yes      | Yes           | Australia |            12 | 125458796 |    5.0 |    180 |  11 |  11 |  2017 | Test       | Female  | Yes       | Yes            | Australia |             12 | 215454578 |     5.0 |     150 |   11 |   11 |   2017 |  Test       | Home   | 1245874125 | JohnPlayer | Corporation  | 10 S Kansas Ave, Olathe, KS 66061, USA | test1@test.com | Home    | 0254789654 | Quarterly | $99.00   | $29.70   | $3.99    | $132.69 | Semiannually | $233.01   | $36.00    | $269.01 |Annually | $171.00   | $46.95    | $217.95 | Quarterly | $413.22   | $374.61   | $787.83 | Semiannually| $1,100.40 | $1,100.40 | $2,200.80 | Quarterly | $171.00   | $171.00 |Swan   | Yung  |Other        | 10  |0        |APTA01     |
#@AptaRegression_pdf
 #
    #Examples: 
     #| website | Username      | Password | Fname | Lname | MM | DD | YYYY | Address                   | WorkHr | Mstatus | Sfname | Slname | SMM | SDD | SYYYY | SWorkHr | CeligiYes | Cfname | Clname | CMM | CDD | CYYYY | Cgender | Childmarried | Ftstudent |Cfname1 | Clname1| CMM1| CDD1| CYYYY1| Cgender1| CMarried1 | CFull1 | NSYYYY| Totalamtinforce | Totalamtpending | Company | GDImonthlyincome | GDIcompany1 | GDIMonthlybenamt1 | GDIBenperiod1 |GDIReplaced1 | BOEmonthbusexp |Percentmonthbusexp| GDIcompany2 | GDIMonthlybenamt2 | GDIBenperiod2 | GDIReplaced2 | STotalamtinforce | STotalamtpending |SCompany | SGDImonthlyincome | SGDIcompany1 | SGDIMonthlybenamt1 | SGDIBenperiod1 | SGDIReplaced1 | Benefit | Benefit1 | Benefit2 | Benefit3 | GDIwait | GDIduration | Benefit4 | SDIwait | SDIduration | Benefit5 | BOEwait | BOEduration | SBenefit | SBenefit1 | SBenefit2 | SBenefit3 | SGDIwait | SGDIduration | SBenefit4 | SSDIwait | SSDIduration | CBenefit | Bname1|Blname1|Relationship1|Perc1|Bname2|Blname2|Relationship2|Perc2| Benprevious|  Benpercent| Trust1|DTtrust1|MMtrust1|YYtrust1|Trust2   |DTtrust2|MMtrust2|YYtrust2| Bname3|Blname3|Relationship3|Perc3|Bname4   |Blname4|Relationship4|Perc4|Bname5  |Blname5|Relationship5|Perc5| SBenprevious   | SBenpercent | Trust3  |DTtrust3|MMtrust3|YYtrust3|Trust4    |DTtrust4|MMtrust4|YYtrust4|Bname6|Blname6|Relationship6|Perc6| gender | Issmoker | Resideoutside | Country   | Monthshowlong | SSN       | Height | Weight | TMM | TDD | TYYYY | Tobaccoprd | Sgender | Sissmoker | Sresideoutside | Scountry  | Smonthshowlong | SSSN      | SHeight | SWeight | TSMM | TSDD | TSYYYY | Stobaccoprd | Phtype | Number     | Bsname     | Typebusiness | Baddress                               | SEmailid       | SPhtype | Sno        | Freq      | Mpremium | Spremium | Cpremium | Total   | Freq1        | Mpremium1 | Spremium1 | Total1  | Freq2   | Mpremium2 | Spremium2 | Total2  | Freq3     | Mpremium3 | Spremium3 | Total3  | Freq4       | Mpremium4 | Spremium4 | Total4    | Freq5     | Mpremium5 | Total5  | Bname7|Blname7|Relationship7|Perc7|pdfEnable|pdfScenario|
     #| apta    | test@test.com | Test1@@@ | Adam  | David | 12 | 06 | 2000 | 60 NY-31, Lyons, NY, USA  |     40 | Married | Alley  | David  |  04 |  25 |  2002 |  40     | Yes       | John   | David  |  07 |  17 |  2016 | Male    | No           | No        |Ricky   | David  |  11 |  15 |  2000 | Male    | Yes       | Yes    |2000   |500000           |          250000 | C1      |            10000 | C2          |             50000 |             3|         5000 |         100000 |              100 | C3          |              5000 |             3 |        50000 |           500000 |           250000 | C4      |             10000 | C5           | 5000               |              3 |         50000 |  550000 |   450000 |   300000 |     6600 | 60 Days | Age 65      |     4000 | 0/7     | 6 months    |    15000 | 30 Days | 24 Months   |   450000 |    300000 |    250000 |      6600 | 90 Days  | Age 65       |      4000 | 0/7      | 6 months     |    10000 | Mike  | David | Son         | 100 | Mile | David | Mother      | 100 | Mike David |        100 | Bright|    11  |    11  |  2001  | Spirit  |    11 |    11 |    2002  | Rosey | David | Daughter    | 100 | Angelina| David | Daughter    | 100 | Hussain| David | Other       | 100 | Angelina David |         100 | Sunrise |     11 |     11 |   2001 | Ambition |     11 |     11 | 2002   | Johny| David | Son         |100  | Male   | Yes      | Yes           | Australia |            12 | 125458796 |    5.0 |    180 |  11 |  11 |  2017 | Test       | Female  | Yes       | Yes            | Australia |             12 | 215454578 |     5.0 |     150 |   11 |   11 |   2017 |  Test       | Home   | 1245874125 | JohnPlayer | Corporation  | 10 S Kansas Ave, Olathe, KS 66061, USA | test1@test.com | Home    | 0254789654 | Quarterly | $99.00   | $29.70   | $3.99    | $132.69 | Semiannually | $233.01   | $36.00    | $269.01 |Annually | $171.00   | $46.95    | $217.95 | Quarterly | $413.22   | $374.61   | $787.83 | Semiannually| $1,100.40 | $1,100.40 | $2,200.80 | Quarterly | $171.00   | $171.00 |Swan   | Yung  |Other        | 10  |1        |APTA01     |

@AptaRegression_3
Scenario Outline: <APTASC03> Application submission for Self only with all the products, Beneficiary and rider(s), Site Residency
   
    Given Test set up for "NYL" feature and "NYL_APTA" scenario
    Given Customer navigate to NYL "<website>"
    When Clicks on Apply now button
    Then Let’s get started page is displayed and enters login details as Username and "<Password>"
    And Clicks on next button
    Then Eligibility page details are displayed to user and enters details as  "<Fname>","<Lname>","<MM>","<DD>","<YYYY>","<Address>","<WorkHr>","<Mstatus>"
    And Select Member Associaton as YES for self
    And Select Dependent as YES for self
    And Clicks on next button
    And Verify that error message is displayed as help us to display at top of the page
    Then Change address as "<State1>"
    And Clicks on next button
    Then Child Eligibility page is displayed select "<CeligiNo>" for child
    And Clicks on next button
    Then Product page is displayed with product list
    Then Validate that Long Term DI, Short Term DI and Business OEI are available
    Then Navigate back to Eligibility page
    And Change address as "<State2>"
    And Clicks on next button
    And Clicks on next button
    Then Product page is displayed with product list
    And Validate that Traditional, TenYTL and TwentyYTL products of group term are available
    And Validate that Long Term DI, Short Term DI and Business OEI are available
    Then Select Self for all the Products
    And Clicks on next button
    Then Your product questions page is displayed and select the checkbox as NO for all the questions for group term life insurance
    Then Your product questions page is displayed and Select No and enter the details for All Group Disability Insurance for self as "<MonthlyIncome>","<Monthbusexp>","<Percentmonthbusexp>"
    And Clicks on next button
    Then Select the amount of Traditional Term coverage for self as "<MBenefit1>"
    Then Select the amount of TenYTL coverage for self as "<MBenefit2>"
    Then Select the amount of TwentyYTL coverage for self as "<MBenefit3>"
    Then Select the amount of Long Term Disability Insurance coverage for self as "<Benefit4>" and enter details "<Bwait4>", "<Bduration4>"
    Then Select checkbox for BOTH riders COLA and CDB for self
    Then Select the amount of Short Term Disability Insurance coverage for self as "<Benefit5>" and enter details "<Bwait5>", "<Bduration5>"
    Then Select the amount of Business Overhead Expense Insurance coverage for self as "<Benefit6>" and enter details "<Bwait6>", "<Bduration6>"
    And Clicks on next button
		And Validate Max Aggregate error message
    Then Select the amount of Traditional Term coverage for self as "<Benefit1>"
    Then Select the amount of TenYTL coverage for self as "<Benefit2>"
    Then Select the amount of TwentyYTL coverage for self as "<Benefit3>"
    And Clicks on next button 
    Then Your Beneficiary page displayed user select YES to the question
    Then Expand Traditional Term Life Insurance tab on beneficiary page for Self
    And Select first beneficiary, select Primary and Individual and enter details for self for Traditional product "<BTrfname1>", "<BTrlname1>", "<BTrrelation1>", "<BTrpercent1>"
    Then Click ADD ANOTHER BENEFICIARY for Self for Traditional Insurance
    Then Select second beneficiary, select Contingent and Individual and enter details for self for Traditional product as "<BTrfname2>", "<BTrlname2>", "<BTrrelation2>", "<BTrpercent2>"
		Then expand Ten-Year Level Term Life Insurance tab on beneficiary page for Self
    And  select first beneficiary, select Primary and Individual and enter New details for self for Ten Year Insurance "<BTrfname3>","<BTrlname3>", "<BTrrelation3>","<BTrpercent3>"
    Then expand Twenty-Year Level Term Life Insurance tab on beneficiary page for Self
    And select first beneficiary, select Primary and Trust and enter details for self for Twenty Year Insurance"<Trust2>","<DTtrust2>","<MMtrust2>","<YYtrust2>"
    And Clicks on next button
    Then Your personal details page displayed and select "<gender>", enters details as "<SSN>","<Height>","<Weight>" and reside outside as "<Resideoutside>"
    Then Select Tabacco as "<Issmoker>" for Self
    And Clicks on next button
    Then Your Contact details page displayed and select Business and select NO and user enters details as "<Phtype>","<Number>","<Bsname>","<Typebusiness>","<Baddress>"
    And Clicks on next button
    Then Preview Page is displayed in Mobile site
    And Clicks on next button
    Then Payment page is displayed, select Yes
    And Click on traditional term product and select method Bill Me and Select "<Freq1>"
    And Click on Ten Year Level Term Life Insurance coverage and Select method Bill Me and Select "<Freq2>"
    And Click on Twenty Year Level Term Life Insurance coverage and Select method Bill Me and Select "<Freq3>"
    And Click on Long Term Disability Insurance coverage and Select method Bill Me and Select "<Freq4>"
    And Click on Short Term Disability Insurance coverage and Select method Bill Me and Select "<Freq5>"
    Then Click on Business Overhead Expense Insurance coverage and Select method Bill Me and Select "<Freq6>"
    And Clicks on next button
    Then Authorization & Consent Page is displayed and users Clicks the checkbox for Self
    And Clicks on next button
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Thank you page is displayed to user in Mobile site
    And Verify that Confirmation number is generated in Mobile site for "<website>" 
And Verify PDF information in mobile as "<pdfScenario>","<pdfEnable>"

 Examples:
|website | Password | Fname | Lname | MM | DD | YYYY | Address                                | WorkHr | Mstatus | State1                           | State2                              | CeligiNo | MonthlyIncome | Monthbusexp | Percentmonthbusexp | MBenefit1 | MBenefit2 | MBenefit3 | Benefit1 | Benefit2 | Benefit3 | Benefit4 | Bwait4  | Bduration4| Benefit5 | Bwait5 | Bduration5 | Benefit6| Bwait6  | Bduration6 | BTrfname1 | BTrlname1 | BTrrelation1 | BTrpercent1 | BTrfname2 | BTrlname2 | BTrrelation2 | BTrpercent2 | BTrfname3 | BTrlname3 | BTrrelation3 | BTrpercent3 | Trust2   | DTtrust2 | MMtrust2 | YYtrust2 | gender | SSN       | Height | Weight | Issmoker | Resideoutside | Phtype | Number     | Bsname   | Typebusiness | Baddress                               | Freq1    | Freq2    | Freq3        |Freq4     | Freq5     | Freq6     | pdfEnable|pdfScenario|
|apta    | Test1@@@ | Jason | Smith | 12 | 06 | 1980 | 12 Rue Ontario E, Montréal, QC, Canada | 45     | Single  | 10 N Montana St, Dillon, MT, USA | 11 Kansas Ave, Kansas City, KS, USA | No       | 60000         | 10000       | 50                 | 700000    | 700000    | 650000    | 300000   | 400000   | 450000   | 9000     | 60 Days | Age 65    | 2800     | 0/7    | 6 months   | 1500    | 30 Days | 24 Months  | Noah      | Smith     | Son          | 100         | William   | Smith     | Son          | 100         | Emma      | Smith     | Mother       | 100         | MNCTrust | 11       | 11       | 2018     | Female | 125458700 | 5.0    | 180    | No       | No            | Home   | 1245004125 | HomeWork | Corporation  | 10 S Kansas Ave, Olathe, KS 66061, USA | Annually | Annually | Semiannually | Quarterly| Quarterly | Quarterly | 0        |APTA03 |


 #@AptaRegression_PDF
#Examples: 
#|website | Password | Fname | Lname | MM | DD | YYYY | Address                                | WorkHr | Mstatus | State1                           | State2                              | CeligiNo | MonthlyIncome | Monthbusexp | Percentmonthbusexp | MBenefit1 | MBenefit2 | MBenefit3 | Benefit1 | Benefit2 | Benefit3 | Benefit4 | Bwait4  | Bduration4 | Benefit5 | Bwait5 | Bduration5 | Benefit6| Bwait6  | Bduration6 | BTrfname1 | BTrlname1 | BTrrelation1 | BTrpercent1 | BTrfname2 | BTrlname2 | BTrrelation2 | BTrpercent2 | BTrfname3 | BTrlname3 | BTrrelation3 | BTrpercent3 | Trust2   | DTtrust2 | MMtrust2 | YYtrust2 | gender | SSN       | Height | Weight | Issmoker | Resideoutside | Phtype | Number     | Bsname   | Typebusiness | Baddress                               | Freq1    | Freq2    | Freq3        | Freq4     | Freq5     | Freq6     | pdfEnable|pdfScenario|
#|apta    | Test1@@@ | Jason | Smith | 12 | 06 | 1980 | 12 Rue Ontario E, Montréal, QC, Canada | 45     | Single  | 10 N Montana St, Dillon, MT, USA | 11 Kansas Ave, Kansas City, KS, USA | No       | 60000         | 10000       | 50                 | 700000    | 700000    | 650000    | 300000   | 400000   | 450000   | 9000     | 60 Days | Age 65     | 2800     | 0/7    | 6 months   | 1500    | 30 Days | 24 Months  | Noah      | Smith     | Son          | 100         | William   | Smith     | Son          | 100         | Emma      | Smith     | Mother       | 100         | MNCTrust | 11       | 11       | 2018     | Female | 125458700 | 5.0    | 180    | No       | No            | Home   | 1245004125 | HomeWork | Corporation  | 10 S Kansas Ave, Olathe, KS 66061, USA | Annually | Annually | Semiannually | Quarterly | Quarterly | Quarterly | 1        |APTA03|


  @AptaRegression_4
  Scenario Outline: <APTASC04> Application submission for Spouse only with all the products and riders
    Given Test set up for "NYL" feature and "NYL_APTA" scenario
    Given Customer navigate to NYL "<website>"
    When Clicks on Apply now button
    Then Let’s get started page is displayed and enters login details as Username and "<Password>"
    And Clicks on next button
    Then Eligibility page details are displayed to user and enters details as  "<Fname>","<Lname>","<MM>","<DD>","<YYYY>","<Address>","<WorkHr>","<Mstatus>"
    And Select Member Associaton as No for self
    And Select Dependent as YES for self
    And Validate that NEXT button is Disabled
    Then Select Member Associaton as YES for self
    And Clicks on next button
    Then Spouse Eligibility page is displayed
    Then select spouse eligibility as YES and enter details as  "<Sfname>", "<Slname>" , "<SMM>", "<SDD>", "<SYYYY>","<SWorkHr>"
    And Clicks Spouse Member Association as NO
    And Clicks on next button
    Then Child Eligibility page is displayed select "<CeligiNo>" for child
    And Clicks on next button
    Then Product page is displayed with product list
    And Validate that Traditional, TenYTL and TwentyYTL products of group term are available
    And Clicks on next button
    And Validate Error Message on Product Page
    Then Navigate back to Eligibility page
    And Change address as "<Address1>"
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    Then Product page is displayed with product list
    And Validate that Traditional, TenYTL and TwentyYTL products of group term are available
    And Validate that Long Term DI, Short Term DI and Business OEI are available
    And Select Spouse for Traditional, TenYTL, TwentyYTL, LongTerm and ShortTerm Products
    And Clicks on next button
    Then Validate Dependent only Pop up message and click on ok
    Then Spouse Product questions page is displayed And select the checkbox NO for all the questions for group term life insurance
    Then Spouse product questions page is displayed and select NO for other insurance questions and enter detail "<MonthlyIncome>"
    And Clicks on next button
    Then Spouse Coverage page is displayed
    Then Select the amount of Traditional Term coverage for spouse as "<Benefit1>"
    And Select the amount of TenYTL coverage for Spouse as "<Benefit2>"
    And Select the amount of TwentyYTL coverage for Spouse as "<Benefit3>"
    Then Enter the details of Long Term Disability Insurance coverage for Spouse as "<Benefit4>", "<Bwait4>", "<Bduration4>"
    And Select check box for BOTH riders COLA and CDB for Spouse
    Then Enter the details of Short Term Disability Insurance coverage for Spouse as "<Benefit5>", "<Bwait5>", "<Bduration5>"
    And Clicks on next button
    Then Spouse Beneficiary page displayed user select NO to the question
    And Clicks on next button
    Then Your Personal details page displayed and select "<gender>", "<SSN>"
    And Clicks on next button
    Then Spouse personal details page displayed and select "<Sgender>" and enter details as "<SSSN>", "<SHeight>","<SWeight>" and reside outside as "<Sresideoutside>"
    Then Select Tabacco as "<Sissmoker>" for Spouse
    And enters details for spouse for country "<Scountry>","<Smonthshowlong>"
    And enters details for tobacco for spouse as "<TSMM>","<TSDD>","<TSYYYY>", "<Stobaccoprd>"
    And Clicks on next button
    Then Your Contact details page displayed and select Business and select NO and user enters details as "<Phtype>","<Number>","<Bsname>","<Typebusiness>","<Baddress>"
    And Clicks on next button
    Then Spouse Contact details page displayed and user enters details as emailid and "<SPhtype>","<Sno>"
    And Clicks on next button
    And Preview Page is displayed in Mobile site
    And Clicks on next button
    Then Payment page is displayed, select Yes
    Then Click on traditional term product and select method Bill Me and Select "<Freq1>"
    Then Click on Ten Year Level Term Life Insurance coverage and Select method Bill Me and Select "<Freq2>"
    Then Click on Twenty Year Level Term Life Insurance coverage and Select method Bill Me and Select "<Freq3>"
    And Click on Long Term Disability Insurance coverage and Select method Bill Me and Select "<Freq4>"
    And Click on Short Term Disability Insurance coverage and Select method Bill Me and Select "<Freq5>"
    And Clicks on next button
    Then Authorization & Consent Page is displayed and users Clicks the checkbox for Self
    Then Authorization & Consent Page is displayed and users Clicks the checkbox for Spouse
    And Clicks on next button
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Thank you page is displayed to user in Mobile site
    And Verify that Confirmation number is generated in Mobile site for "<website>"
		And Verify PDF information in mobile as "<pdfScenario>","<pdfEnable>"


    Examples: 
      | website | Password | Fname | Lname | MM | DD | YYYY | Address                                       | WorkHr | Mstatus | Sfname | Slname| SMM | SDD | SYYYY | SWorkHr | CeligiNo | Address1                            | MonthlyIncome | Monthbusexp | Percentmonthbusexp | Benefit1 | Benefit2 | Benefit3 | Benefit4 | Bwait4  | Bduration4 | Benefit5 | Bwait5 | Bduration5 | gender | SSN       | Sgender | Sissmoker | Sresideoutside | Scountry  | Smonthshowlong | SSSN      |Phtype|Number     |Bsname           |Typebusiness|Baddress                            |SPhtype|Sno       | SHeight| SWeight | TSMM | TSDD | TSYYYY | Stobaccoprd | Freq1    | Freq2    | Freq3        | Freq4     | Freq5     |pdfEnable|pdfScenario|
      | apta    | Test1@@@ | Ethan  | Hall | 12 | 06 | 1980 | 1 Camp Vermont Court Grand Isle Vermont 05458 |     45 | Married | Alley  | Hall  |  04 |  25 |  1999 |      45 | No       | 11 Kansas Ave, Kansas City, KS, USA |         40000 |      100000 |             150000 |   200000 |   200000 |   200000 |      200 | 90 Days | Five Year  |     3000 | 0/7    | 6 months   | Male   | 125008796 | Female  | Yes       | Yes            | Australia |             12 | 115454578 |Mobile| 9700382901|Tim Manufacturers|Corporation |11 Kansas Ave, Kansas City, KS, USA |Mobile |7650073264| 5.0    |     150 |   11 |   11 |   2017 | Test        | Annually | Annually | Semiannually | Quarterly | Quarterly |0        |APTA04 |

#@AptaRegression_pdf
#
    #Examples: 
    #| website | Password | Fname | Lname | MM | DD | YYYY | Address                                       | WorkHr | Mstatus | Sfname | Slname| SMM | SDD | SYYYY | SWorkHr | CeligiNo | Address1                            | MonthlyIncome | Monthbusexp | Percentmonthbusexp | Benefit1 | Benefit2 | Benefit3 | Benefit4 | Bwait4  | Bduration4 | Benefit5 | Bwait5 | Bduration5 | gender | SSN       | Sgender | Sissmoker | Sresideoutside | Scountry  | Smonthshowlong | SSSN      |Phtype|Number     |Bsname           |Typebusiness|Baddress                            |SPhtype|Sno       | SHeight| SWeight | TSMM | TSDD | TSYYYY | Stobaccoprd | Freq1    | Freq2    | Freq3        | Freq4     | Freq5     |pdfEnable|pdfScenario|
    #| apta    | Test1@@@ | Ethan  | Hall | 12 | 06 | 1980 | 1 Camp Vermont Court Grand Isle Vermont 05458 |     45 | Married | Alley  | Hall  |  04 |  25 |  1999 |      45 | No       | 11 Kansas Ave, Kansas City, KS, USA |         40000 |      100000 |             150000 |   200000 |   200000 |   200000 |      200 | 90 Days | Five Year  |     3000 | 0/7    | 6 months   | Male   | 125008796 | Female  | Yes       | Yes            | Australia |             12 | 115454578 |Mobile| 9700382901|Tim Manufacturers|Corporation |11 Kansas Ave, Kansas City, KS, USA |Mobile |7650073264| 5.0    |     150 |   11 |   11 |   2017 | Test        | Annually | Annually | Semiannually | Quarterly | Quarterly |1        |APTA04 |

@AptaRegression_5
  Scenario Outline: <APTASC05> Application submission for child only with Traditional Term life Insurance
    Given Test set up for "NYL" feature and "NYL_APTA" scenario
    Given Customer navigate to NYL "<website>"
    When Clicks on Apply now button
    Then Let’s get started page is displayed and enters login details as Username and "<Password>"
    And Clicks on next button
    Then Eligibility page details are displayed to user and enters details as  "<Fname>","<Lname>","<MM>","<DD>","<YYYY>","<Address>","<WorkHr>","<Mstatus>"
    And Select Member Associaton as YES for self
    And Select Dependent as YES for self
    And Clicks on next button
    Then Spouse Eligibility page is displayed select NO for spouse
    And Clicks on next button
    Then Child Eligibility page is displayed select "<CeligiYes>" for child
    And enter details for child as  "<Cfname>", "<Clname>" , "<CMM>", "<CDD>", "<CYYYY>"
     And Select Sex as "<Cgender>" and Married as "<CMarried>" for child
    And Select Full time student as "<CFull>" for child
    And Clicks on next button
    Then Product page is displayed with product list
    And Validate that Traditional TLI, TenYTL, TwentyYTL and Business OEI are available for Self only
    Then Navigate back to Eligibility page
    And Clicks on next button
    Then Spouse Eligibility page is displayed
    And Clicks on next button
    Then Child Eligibility page is displayed and enter year details for child as "<CYYYY1>"
    And Clicks on next button
    Then Product page is displayed with product list
    And Clicks on Back or Previous button
    And Click on ADD ANOTHER CHILD button
    And enter details for second child as "<Cfname1>", "<Clname1>" , "<CMM1>", "<CDD1>", "<CYYYY1>"
    And Select Sex as "<Cgender1>" and Married as "<CMarried1>" for second child
  	And Select Full time student as "<CFull1>" for second child
		And Click on ADD ANOTHER CHILD button
    And enter details for third child as "<Cfname2>", "<Clname2>" , "<CMM2>", "<CDD2>", "<CYYYY2>"
    And Select Sex as "<Cgender2>" and Married as "<CMarried2>" for third child
  	And Select Full time student as "<CFull2>" for third child
  	And Click on ADD ANOTHER CHILD button
  	And enter details for fourth child as "<Cfname3>", "<Clname3>" , "<CMM3>", "<CDD3>", "<CYYYY3>"
    And Select Sex as "<Cgender3>" and Married as "<CMarried3>" for fourth child
  	And Select Full time student as "<CFull3>" for fourth child
		And Click on ADD ANOTHER CHILD button
    And enter details for fifth child as "<Cfname4>", "<Clname4>" , "<CMM4>", "<CDD4>", "<CYYYY4>"
    And Select Sex as "<Cgender4>" and Married as "<CMarried4>" for fifth child
  	And Select Full time student as "<CFull4>" for fifth child
  	And Click on ADD ANOTHER CHILD button
    And enter details for sixth child as "<Cfname5>", "<Clname5>" , "<CMM5>", "<CDD5>", "<CYYYY5>"
    And Select Sex as "<Cgender5>" and Married as "<CMarried5>" for sixth child
  	And Select Full time student as "<CFull5>" for sixth child
  	And Click on ADD ANOTHER CHILD button
    And enter details for seventh child as "<Cfname6>", "<Clname6>" , "<CMM6>", "<CDD6>", "<CYYYY6>"
    And Select Sex as "<Cgender6>" and Married as "<CMarried6>" for seventh child
  	And Select Full time student as "<CFull6>" for seventh child
  	And Click on ADD ANOTHER CHILD button
    And enter details for eighth child as "<Cfname7>", "<Clname7>" , "<CMM7>", "<CDD7>", "<CYYYY7>"
    And Select Sex as "<Cgender7>" and Married as "<CMarried7>" for eighth child
  	And Select Full time student as "<CFull7>" for eighth child
    And verify that Child Expandable button is not available
    And Clicks on next button
    Then Product page is displayed with product list
		And Clicks on next button
		And Validate Error Message on Product Page
		And Select Child for Traditional Term Life Insurance
		And Clicks on next button
    Then Validate Dependent only Pop up message and click on ok
    Then Child Coverage page is displayed
    And Validate that "<Cbenamount>" is Child coverage amount under Traditional Term Life
    And Select the amount of child coverage as "<CBenefit>" under Traditional Term Life
    And Verify that Eligible Child Names as "<Cfname>","<Cfname1>","<Cfname2>","<Cfname7>" under Traditional Term Life
    #John, Rosey, Henry and Heena
    And Clicks on next button
    Then Your Personal details page displayed and select "<gender>", "<SSN>"
    And Verify that Underwriting input fields Height and Weight are not rendered
    And Clicks on next button
    Then Your Contact details page displayed and select Home and user enters phone details as "<Phtype>","<Number>"
    And Clicks on next button
    Then Preview Page is displayed in Mobile site
    And Expand Child Info
    And Verify coverage amount "<CBenefit>" for Child under Traditional Term Insurance
    And verify that the Child name is displayed as "<Cfname>" and "<Clname>" in Preview page
    And verify that the Child name is displayed as "<Cfname1>" and "<Clname1>" in Preview page
    And verify that the Child name is displayed as "<Cfname2>" and "<Clname2>" in Preview page
    And verify that the Child name is displayed as "<Cfname7>" and "<Clname7>" in Preview page
    And Clicks on next button
    Then Payment page is displayed, select Yes
    Then Click on traditional term product and select method Bill Me and Select "<Freq>"
    And validate the estimated rates values for Traditional product for child "<Cpremium>", "<Total>"
    And Clicks on next button
    Then Authorization & Consent Page is displayed and users Clicks the checkbox for Self
    And Clicks on next button
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Thank you page is displayed to user in Mobile site
    And Verify that Confirmation number is generated in Mobile site for "<website>"
   And Verify PDF information in mobile as "<pdfScenario>","<pdfEnable>"


    Examples: 
| website | Password | Fname | Lname | MM | DD| YYYY                | Address                              | WorkHr | Mstatus | CeligiYes | Cfname | Clname | CMM | CDD | CYYYY            | Cgender | CMarried |CFull| CYYYY1           |Cfname1 | Clname1 | CMM1|CDD1| CYYYY1               | Cgender1 | CMarried1 | CFull1 | Cfname2 | Clname2 | CMM2 | CDD2 | CYYYY2            | Cgender2| CMarried2|CFull2|Cfname3 | Clname3 | CMM3|CDD3| CYYYY3              | Cgender3| CMarried3 | CFull3 | Cfname4 | Clname4 | CMM4| CDD4| CYYYY4              | Cgender4 | CMarried4 | CFull4|Cfname5 | Clname5 | CMM5 | CDD5 | CYYYY5            | Cgender5|CMarried5| CFull5 | Cfname6 | Clname6 | CMM6| CDD6| CYYYY6               | Cgender6| CMarried6|CFull6| Cfname7| Clname7 | CMM7| CDD7| CYYYY7              | Cgender7 | CMarried7| CFull7|Cbenamount|CBenefit| gender | SSN       | Phtype | Number     | Freq         | Cpremium | Total |pdfEnable|pdfScenario|
| apta    | Test1@@@ | Ryan  | Miller |   |   | SYSDate-28Y/00M/00D | 1409 W 11th St, Kansas City, MO, USA |     45 | Married | Yes       | John   | Miller |  |        |SYSDate - 13 days | Male    | No       | No  |SYSDate - 15 days |Rosey   | Miller  |     |    |  SYSDate-23Y/12M/29D | Female    | No       | Yes    |  Henry   | Miller  |     |      |SYSDate-10Y/00M/16D| Male    | No       | No   |Simon   | Miller  |     |    |  SYSDate-19Y/00M/00D| Male    | Yes       | No     |  Bravo  | Miller  |     |     | SYSDate-25Y/00M/00D | Male     | Yes       | Yes   |Kevin   | Miller  |     |     | SYSDate-25Y/00M/00D | Male    | No      | No     |  Andrew | Miller  |     |     |  SYSDate-23Y/00M/00D | Male    | No       | No   |Heena   | Miller  |     |     |  SYSDate-01/00M/00D | Female   | No       | No    | 10000    |  10000 | Male   | 995458796 | Home   | 9945874125 | Semiannually | $7.98    | $7.98 |0        |APTA05 |

#@AptaRegression_pdf
#
    #Examples: 
  #| website | Password | Fname | Lname | MM | DD| YYYY                | Address                              | WorkHr | Mstatus | CeligiYes | Cfname | Clname | CMM | CDD | CYYYY            | Cgender | CMarried |CFull| CYYYY1           |Cfname1 | Clname1 | CMM1|CDD1| CYYYY1               | Cgender1 | CMarried1 | CFull1 | Cfname2 | Clname2 | CMM2 | CDD2 | CYYYY2            | Cgender2| CMarried2|CFull2|Cfname3 | Clname3 | CMM3|CDD3| CYYYY3              | Cgender3| CMarried3 | CFull3 | Cfname4 | Clname4 | CMM4| CDD4| CYYYY4              | Cgender4 | CMarried4 | CFull4|Cfname5 | Clname5 | CMM5 | CDD5 | CYYYY5            | Cgender5|CMarried5| CFull5 | Cfname6 | Clname6 | CMM6| CDD6| CYYYY6               | Cgender6| CMarried6|CFull6| Cfname7| Clname7 | CMM7| CDD7| CYYYY7              | Cgender7 | CMarried7| CFull7|Cbenamount|CBenefit| gender | SSN       | Phtype | Number     | Freq         | Cpremium | Total |pdfEnable|pdfScenario|
  #| apta    | Test1@@@ | Ryan  | Miller |   |   | SYSDate-28Y/00M/00D | 1409 W 11th St, Kansas City, MO, USA |     45 | Married | Yes       | John   | Miller |  |        |SYSDate - 13 days | Male    | No       | No  |SYSDate - 15 days |Rosey   | Miller  |     |    |  SYSDate-23Y/12M/29D | Female    | No       | Yes    |  Henry   | Miller  |     |      |SYSDate-10Y/00M/16D| Male    | No       | No   |Simon   | Miller  |     |    |  SYSDate-19Y/00M/00D| Male    | Yes       | No     |  Bravo  | Miller  |     |     | SYSDate-25Y/00M/00D | Male     | Yes       | Yes   |Kevin   | Miller  |     |     | SYSDate-25Y/00M/00D | Male    | No      | No     |  Andrew | Miller  |     |     |  SYSDate-23Y/00M/00D | Male    | No       | No   |Heena   | Miller  |     |     |  SYSDate-01/00M/00D | Female   | No       | No    | 10000    |  10000 | Male   | 995458796 | Home   | 9945874125 | Semiannually | $7.98    | $7.98 |1        |APTA05|

  @AptaRegression_6 
  Scenario Outline: <APTASC06> Application submission for Self,Spouse and Child with all LI products
    Given Test set up for "NYL" feature and "NYL_APTA" scenario
    Given Customer navigate to NYL "<website>"
    When Clicks on Apply now button
    Then Let’s get started page is displayed and enters login details as Username and "<Password>"
    And Clicks on next button
    Then Eligibility page details are displayed to user and enters details as  "<Fname>","<Lname>","<MM>","<DD>","<YYYY>","<Address>","<WorkHr>","<Mstatus>"
    And Select Member Associaton as YES for self
    And Select Dependent as YES for self
    And Clicks on next button
    Then Spouse Eligibility page is displayed
    Then select spouse eligibility as YES and enter details as  "<Sfname>", "<Slname>" , "<SMM>", "<SDD>", "<SYYYY>","<SWorkHr>"
    And Clicks Spouse Member Association as NO
    And Clicks on next button
    Then Child Eligibility page is displayed select "<CeligiYes>" for child
    And enter details for child as  "<Cfname>", "<Clname>" , "<CMM>", "<CDD>", "<CYYYY>"
     And Select Sex as "<Cgender>" and Married as "<Childmarried>" for child
    And Select Full time student as "<Ftstudent>" for child
    And Clicks on next button
    And Verify that error message is displayed for DOB Eligibility
    And Clicks on Back or Previous button
    And Clicks on Back or Previous button
		Then User enters year as "<NYYYY>" on eligibility page for Self
    And Clicks on next button
     And Clicks on next button
     And Clicks on next button
    Then Product page is displayed with product list
   	And  Validate that Traditional, TenYTL and TwentyYTL products of group term are available for Self
   	And Validate that Long Term DI, Short Term DI and Business OEI are available for Self
		And Clicks on Back or Previous button
		And Child Eligibility page is displayed and enter year details for child as "<NCYYYY>"
		And Clicks on Back or Previous button
		And User enters year as "<NSYYYY>" on eligibility page for Spouse
    And Clicks on next button
    And Clicks on next button
    And Select Self, Spouse and Child for Traditional Term Life Insurance
    And Select Self, Spouse for Ten Year Level Term Life Insurance
    And Select Self, Spouse for Twenty Year Level Term Life Insurance
    And Clicks on next button
    And Verify the note for NY is displayed
		 And Validate the content of NY Imp Replacement Info
		 And select the NY Imp Info checkbox
    Then Your product questions page is displayed and select the checkbox as NO for all the questions for group term life insurance
    And Clicks on next button
    Then Spouse Product questions page is displayed And select the checkbox NO for all the questions for group term life insurance
    And Clicks on next button
    Then Your Coverage page is displayed
    And Validate min and max values of Traditional TLI for Self as "<Min1>", "<Max1>"
    Then Select the amount of Traditional Term coverage for self as "<Benefit1>"
    And validate min and max values of TenYTL for Self as "<Min2>", "<Max2>"
    Then Select the amount of TenYTL coverage for self as "<Benefit2>"
    And validate min and max values of TwentyYTL for Self as "<Min3>", "<Max3>"
    Then Select the amount of TwentyYTL coverage for self as "<Benefit3>"
    And Clicks on next button
    Then Spouse Coverage page is displayed
    And Validate message for spouse displayed in blue box in coverage page
    And validate min and max values of Traditional TLI for Spouse as "<Smin1>", "<Smax1>"
    Then Select the amount of Traditional Term coverage for spouse as "<SBenefitMore>"
    And validate min and max values of TenYTL for Spouse as "<Smin2>", "<Smax2>"
    Then Select the amount of TenYTL coverage for Spouse as "<SBenefit2More>"
    And validate min and max values of TwentyYTL for Spouse as "<Smin3>", "<Smax3>"
    Then Select the amount of TwentyYTL coverage for Spouse as "<SBenefit2>"
    And Clicks on next button
		And Validate Max Aggregate error message
    Then Select the amount of Traditional Term coverage for spouse as "<SBenefit>"
    Then Select the amount of TenYTL coverage for Spouse as "<SBenefit1>"
    And Clicks on next button
    Then Child Coverage page is displayed
    And Select the amount of child coverage as "<CBenefit>" under Traditional Term Life
    And Clicks on next button
    Then Your Beneficiary page displayed user select NO to the question
    And Clicks on next button
    Then Spouse Beneficiary page displayed user select NO to the question
    And Clicks on next button
    Then Your personal details page displayed and select "<gender>", enters details as "<SSN>","<Height>","<Weight>" and reside outside as "<Resideoutside>"
    Then Select Tabacco as "<Issmoker>" for Self
    And Enter MembershipID as "<MembershipID>" for self
    And Clicks on next button
    Then Spouse personal details page displayed and select "<Sgender>" and enter details as "<SSSN>", "<SHeight>","<SWeight>" and reside outside as "<Sresideoutside>"
    Then Select Tabacco as "<Sissmoker>" for Spouse
    And Clicks on next button
    Then Your Contact details page displayed and select Home and user enters phone details as "<Phtype>","<Number>"
    And Clicks on next button
    Then Spouse Contact details page displayed and user enters details as emailid and "<SPhtype>","<Sno>"
    And Clicks on next button
    Then Preview Page is displayed in Mobile site
    And Clicks on next button
    Then Payment page is displayed, select Yes
    And Click on traditional term product and select method Bill Me and Select "<Freq>"
   # And validate the estimated rates values for Traditional product for self, spouse and child "<Mpremium>", "<Spremium>", "<Cpremium>", "<Total>"
    Then Click on Ten Year Level Term Life Insurance coverage and Select method Bill Me and Select "<Freq1>"
  #  And  validate the premium values for Ten Year for self and spouse "<Mpremium1>", "<Spremium1>","<Total1>"
    Then Click on Twenty Year Level Term Life Insurance coverage and Select method Bill Me and Select "<Freq2>"
   # And validate the premium values for Twenty Year for self and spouse "<Mpremium2>", "<Spremium2>","<Total2>"
    And Clicks on next button
    And Verify that fraud notice is not rendered at Authorization page
    Then Authorization & Consent Page is displayed and users Clicks the checkbox for Self
    Then Authorization & Consent Page is displayed and users Clicks the checkbox for Spouse
    And Clicks on next button
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Thank you page is displayed to user in Mobile site
    And Verify that Confirmation number is generated in Mobile site for "<website>"
     And Verify PDF information in mobile as "<pdfScenario>","<pdfEnable>"
  
  
    Examples: 
  | website | Password | Fname | Lname | MM | DD | YYYY | Address                    | WorkHr | Mstatus | NYYYY|Sfname| Slname | SMM | SDD | SYYYY | SWorkHr | CeligiYes | Cfname | Clname | CMM | CDD | CYYYY            | Cgender | Childmarried | Ftstudent | NCYYYY          |NSYYYY|Min1    | Max1       | Benefit1 | Min2     | Max2       | Benefit2 | Min3     | Max3       | Benefit3 | Smin1   | Smax1      | Smin2    | Smax2      | Smin3    | Smax3      | SBenefit | SBenefitMore |SBenefit1 | SBenefit2 | CBenefit | gender | SSN      |MembershipID| Height | Weight | Issmoker | Resideoutside | Sgender | SSSN      |SMembershipID| SHeight | SWeight | Sissmoker | Sresideoutside | Phtype | Number     | SPhtype | Sno        | Freq      | Mpremium | Spremium | Cpremium | Total  | Freq1     | Mpremium1 | Spremium1 | Total1  | Freq2     | Mpremium2 | Spremium2 | Total2  | SBenefit1More | SBenefit2More |pdfEnable|pdfScenario|
  | apta    | Test1@@@ | Samuel  | Foster | 01 | 06 | 2003 | 60 NY-31, Lyons, NY, USA|     45 | Married | 2000 |Olivia| Foster |  04 |  25 |  2002 |      45 | Yes       | Jayden | Foster |     |     |SYSdate - 13 days | Male    | No           | Yes       |SYSdate - 16 days|  2000| $50,000| $1,000,000 |   450000 | $100,000 | $2,000,000 |   550000 | $100,000 | $2,000,000 |   300000 | $50,000 | $1,000,000 | $100,000 | $1,000,000 | $100,000 | $1,000,000 |   150000 | 550000       |   150000 |    150000 |    10000 | Female | 125123796|21475636    | 5.0    |    180 | No       | No            | Male    | 210234578 |7885276      |     5.0 |     150 | No        | No             | Home   | 1248964125 | Home    | 0252149654 | Quarterly | $86.40   | $15.00   | $3.99    | 105.39 | Quarterly | $68.97    | $40.14    | $109.11 | Quarterly | $70.56    | $70.92    | $141.48 | 600000        | 400000        |0        | APTA06|

#@AptaRegression_pdf 
    #Examples: 
    #| website | Password | Fname | Lname | MM | DD | YYYY | Address                    | WorkHr | Mstatus | NYYYY|Sfname| Slname | SMM | SDD | SYYYY | SWorkHr | CeligiYes | Cfname | Clname | CMM | CDD | CYYYY            | Cgender | Childmarried | Ftstudent | NCYYYY          |NSYYYY|Min1    | Max1       | Benefit1 | Min2     | Max2       | Benefit2 | Min3     | Max3       | Benefit3 | Smin1   | Smax1      | Smin2    | Smax2      | Smin3    | Smax3      | SBenefit | SBenefitMore |SBenefit1 | SBenefit2 | CBenefit | gender | SSN      |MembershipID| Height | Weight | Issmoker | Resideoutside | Sgender | SSSN      |SMembershipID| SHeight | SWeight | Sissmoker | Sresideoutside | Phtype | Number     | SPhtype | Sno        | Freq      | Mpremium | Spremium | Cpremium | Total  | Freq1     | Mpremium1 | Spremium1 | Total1  | Freq2     | Mpremium2 | Spremium2 | Total2  |pdfEnable| SBenefit1More | SBenefit2More |pdfScenario|pdfEnable|
    #| apta    | Test1@@@ | Samuel  | Foster | 01 | 06 | 2003 | 60 NY-31, Lyons, NY, USA|     45 | Married | 2000|Olivia | Foster |  04 |  25 |  2002 |      45 | Yes       | Jayden | Foster |     |     |SYSdate - 13 days | Male    | No           | Yes       |SYSdate - 16 days|  2000| $50,000| $1,000,000 |   450000 | $100,000 | $2,000,000 |   550000 | $100,000 | $2,000,000 |   300000 | $50,000 | $1,000,000 | $100,000 | $1,000,000 | $100,000 | $1,000,000 |   150000 | 550000       |   150000 |    150000 |    10000 | Female | 125123796|21475636    | 5.0    |    180 | No       | No            | Male    | 210234578 |7885276      |     5.0 |     150 | No        | No             | Home   | 1248964125 | Home    | 0252149654 | Quarterly | $86.40   | $15.00   | $3.99    | 105.39 | Quarterly | $68.97    | $40.14    | $109.11 | Quarterly | $70.56    | $70.92    | $141.48 |1        | 600000        | 400000        |APTA06|1  |


  @AptaRegression_7
  Scenario Outline: <APTASC07> Application submission for Self and Sposue with all DI products and Riders R4a, R22
    Given Test set up for "NYL" feature and "NYL_APTA" scenario
    Given Customer navigate to NYL "<website>"
    When Clicks on Apply now button
    Then Let’s get started page is displayed and enters login details as Username and "<Password>"
    And Clicks on next button
    Then Eligibility page details are displayed to user and enters details as  "<Fname>","<Lname>","<MM>","<DD>","<YYYY>","<Address>","<WorkHr>","<Mstatus>"
    And Select Member Associaton as YES for self
    And Select Dependent as YES for self
    And Clicks on next button
    Then Spouse Eligibility page is displayed
    Then select spouse eligibility as YES and enter details as  "<Sfname>", "<Slname>" , "<SMM>", "<SDD>", "<SYYYY>","<SWorkHr>"
    And Clicks Spouse Member Association as YES
    And Validate Custom Message about Spouse as a Member
    And Clicks on next button
    Then Child Eligibility page is displayed select "<CeligiNo>" for child
    And Clicks on next button
    Then Product page is displayed with product list
    And Validate that self is not available for Traditional TLI, TenYTL, TwentyYTL and Business OEI
    And Clicks on Back or Previous button
    And Clicks on Back or Previous button
    And Clicks on Back or Previous button
		Then User enters year as "<NYYYY>" on eligibility page for Self
    And Clicks on next button
     And Clicks on next button
     And Clicks on next button
    Then Product page is displayed with product list
    And Validate that Traditional, TenYTL and TwentyYTL products of group term are available
		And Clicks on Back or Previous button
		And Clicks on Back or Previous button
		And Enters Spouse WorkHr as "<Nswokhr>"	
		And Clicks on Back or Previous button
		And Enters Self WorkHr as "<Nwokhr>"	
    And Clicks on next button	
    And Clicks on next button	
    And Clicks on next button
    And Select Self, Spouse for Long Term Disability Insurance
    Then Select Self, Spouse for Short Term Disability Insurance
    And Clicks on next button
    Then Your product questions page is displayed and select NO and enter the details for Group Disability Insurance for self as "<MonthlyIncome>"
    And Clicks on next button
    Then Spouse product questions page is displayed and select NO for other insurance questions and enter detail "<SMonthlyIncome>"
    And Clicks on next button
    Then Your Coverage page is displayed
    And Validate min and max values for Long Term for self as "<LTMin>", "<LTMax>"
    Then Select the amount of Long Term Disability Insurance coverage for self as "<Benefit>" and enter details "<Bwait>", "<Bduration>"
    And Validate min and max values for Short Term DI for self "<STMin>" to "<STMax>"
    Then Select the amount of Short Term Disability Insurance coverage for self as "<Benefit1>" and enter details "<Bwait1>", "<Bduration1>"
    And Clicks on next button
    Then Spouse Coverage page is displayed
    And Validate min and max values for Long Term DI for spouse "<LTMin1>" to "<LTMax1>"
    Then Enter the details of Long Term Disability Insurance coverage for Spouse as "<Benefit2>", "<Bwait2>", "<Bduration2>"
    And Validate min and max values for Short Term DI for spouse "<STMin1>" to "<STMax1>"
    Then Enter the details of Short Term Disability Insurance coverage for Spouse as "<Benefit3>", "<Bwait3>", "<Bduration3>"
     And Clicks on Back or Previous button
     And Clicks on Back or Previous button
     And Clicks on Back or Previous button
		And Enters Monthly Income for Self as "<MonthlyIncome>"
    And Clicks on next button
		And Enters Monthly Income as "<SMonthlyIncome1>" for Spouse
    And Clicks on next button
  Then Your Coverage page is displayed
	And Validate min and max values for Long Term for self as "<LTMin2>", "<LTMax2>"
	Then Select the amount of Long Term Disability Insurance coverage for self as "<Benefit>" and enter details "<Bwait>", "<Bduration>"
	And Select checkbox for BOTH riders COLA and CDB for self
	And Validate min and max values for Short Term DI for self "<STMin2>" to "<STMax2>"
	Then Select the amount of Short Term Disability Insurance coverage for self as "<Benefit1>" and enter details "<Bwait1>", "<Bduration1>"
	And Clicks on next button
	Then Spouse Coverage page is displayed
	And Validate min and max values for Long Term DI for spouse "<LTMin3>" to "<LTMax3>"
	Then Enter the details of Long Term Disability Insurance coverage for Spouse as "<Benefit>", "<Bwait2>", "<Bduration2>"
	And Select check box for BOTH riders COLA and CDB for Spouse
	And Validate min and max values for Short Term DI for spouse "<STMin3>" to "<STMax3>"
	Then Enter the details of Short Term Disability Insurance coverage for Spouse as "<Benefit>", "<Bwait3>", "<Bduration3>"
	And Clicks on next button
    Then Your personal details page displayed and select "<gender>", enters details as "<SSN>","<Height>","<Weight>" and reside outside as "<Resideoutside>"
    And enters details for self for country "<Country>","<Monthshowlong>"
    And Clicks on next button
    Then Spouse personal details page displayed and select "<Sgender>" and enter details as "<SSSN>", "<SHeight>","<SWeight>" and reside outside as "<Sresideoutside>"
    And enters details for spouse for country "<Scountry>","<Smonthshowlong>"
    And Clicks on next button
    Then Your Contact details page displayed and select Business and select YES and user enters details as "<Phtype>","<Number>","<Bsname>","<Typebusiness>"
    And Clicks on next button
    Then Spouse Contact details page displayed and user enters details as emailid and "<SPhtype>","<Sno>"
    And Clicks on next button
    Then Preview Page is displayed in Mobile site
    And Clicks on next button
    Then Payment page is displayed, select Yes
    Then Click on Long Term Disability Insurance coverage and Select method Bill Me and Select "<Freq>"
   ## Then validate the premium values for Long Term for self and spouse "<Mpremium>", "<Spremium>", "<Total>"
    Then Click on Short Term Disability Insurance coverage and Select method Bill Me and Select "<Freq1>"
  ##  And validate the premium values for Short Term for self and spouse "<Mpremium1>", "<Spremium1>", "<Total1>"
    And Clicks on next button
    Then Authorization & Consent Page is displayed and users Clicks the checkbox for Self
    Then Authorization & Consent Page is displayed and users Clicks the checkbox for Spouse
    And Clicks on next button
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Thank you page is displayed to user in Mobile site
    And Verify that Confirmation number is generated in Mobile site for "<website>"
	And Verify PDF information in mobile as "<pdfScenario>","<pdfEnable>"
		

    Examples: 
 | website | Password | Fname | Lname | MM | DD | YYYY | Address                        | WorkHr | Mstatus |NYYYY| Sfname | Slname | SMM | SDD | SYYYY | SWorkHr | CeligiNo | Nswokhr|Nwokhr|MonthlyIncome | SMonthlyIncome | MonthlyIncome1 | SMonthlyIncome1 | LTMin | LTMax |LTMin1 | LTMax1  | STMin1 | STMax1 | STMin  | STMax | Benefit | Bwait   | Bduration | Benefit1 | Bwait1 | Bduration1 | Benefit2 | Bwait2     | Bduration2 | Benefit3 | Bwait3 | Bduration3|  LTMin2 | LTMax2 |LTMin3 | LTMax3 | STMin2 | STMax2 | STMin3  | STMax3 |gender | SSN       | Height | Weight | Resideoutside | Country | Monthshowlong | Sgender | SSSN      | SHeight | SWeight | Sresideoutside | Scountry | Smonthshowlong | Phtype | Number     | Bsname  | Typebusiness | SPhtype | Sno        | Freq     | Mpremium  | Spremium | Total     | Freq1    | Mpremium1 | Spremium1 | Total1    | LTMin1 | LTMax1  | STMin1 | STMax1 | STMin  | STMax  |pdfEnable|pdfScenario|
 | apta    | Test1@@@ | Daniel| Cooper| 01 | 06 | 1953 |10 Texas 114 Justin Texas 76247 |     19 | Married | 2001|Ava     | Cooper |  04 |  25 |  2000 |      18 | No       |20      |20    |         16000|16000            |5000           |4500             | 100   | 10000 |100    | 10000   |1200    | 4000   |1200    |4000 | 2800      |60 Days  | Age 65    |   2000   |   0/7    | 6 months   | 2800   |    90 Days | Five Year  | 2000     |  0/7   | 6 months  |  100     |3300   |100   |3000     | 1200   |3300    | 1200    | 3000   |Female | 125123796 |    5.0 |    200 | Yes           | India   |             3 | Male    | 346000089 |     5.1 |     200 | Yes            | India    |              3 | Home   | 1245555555 | Majesco | Corporation  | Home    | 0257777754 | Annually | $2,253.96 | $728.89  | $2,982.85 | Annually | $3,081.12 | $2,751.00 | $5,832.12 | $100   | $10,000 | $1,200 | $4,000 | $1,200 | $4,000 |0        |APTA07|

 		
#@AptaRegression_pdf
#		
    #Examples: 
     #| website | Password | Fname | Lname | MM | DD | YYYY | Address                        | WorkHr | Mstatus |NYYY| Sfname | Slname | SMM | SDD | SYYYY | SWorkHr | CeligiNo | Nswokhr|Nwokhr|MonthlyIncome | SMonthlyIncome | MonthlyIncome1 | SMonthlyIncome1 | LTMin | LTMax |LTMin1 | LTMax1  | STMin1 | STMax1 | STMin  | STMax | Benefit | Bwait   | Bduration | Benefit1 | Bwait1 | Bduration1 | Benefit2 | Bwait2     | Bduration2 | Benefit3 | Bwait3 | Bduration3 |  LTMin2 | LTMax2 |LTMin3 | LTMax3 | STMin2 | STMax2 | STMin3  | STMax3 |gender | SSN       | Height | Weight | Resideoutside | Country | Monthshowlong | Sgender | SSSN      | SHeight | SWeight | Sresideoutside | Scountry | Smonthshowlong | Phtype | Number     | Bsname  | Typebusiness | SPhtype | Sno        | Freq     | Mpremium  | Spremium | Total     | Freq1    | Mpremium1 | Spremium1 | Total1    | LTMin1 | LTMax1  | STMin1 | STMax1 | STMin  | STMax  |pdfEnable|pdfScenario|
     #| apta    | Test1@@@ | Daniel| Cooper| 01 | 06 | 1953 |10 Texas 114 Justin Texas 76247 |     19 | Married  | 2001|Ava  | Cooper  |  04 |  25 |  2000 |      18 | No       |20      |20    |         16000|16000            |5000           |4500             | 100   | 10000 |100    | 10000   |1200    | 4000   |1200    |4000 | 2800      |60 Days  | Age 65    |   2000   |   0/7    | 6 months   | 2800   |    90 Days | Five Year  | 2000     |  0/7    | 6 Months  |  100     |3300   |100   |3000     | 1200   |3300    | 1200    | 3000   |Female | 125123796 |    5.0 |    200 | Yes           | India   |             3 | Male    | 346000089 |     5.1 |     200 | Yes            | India    |              3 | Home   | 1245555555 | Majesco | Corporation  | Home    | 0257777754 | Annually | $2,253.96 | $728.89  | $2,982.85 | Annually | $3,081.12 | $2,751.00 | $5,832.12 | $100   | $10,000 | $1,200 | $4,000 | $1,200 | $4,000 |1        |APTA07|

  
 @AptaRegression_8
  Scenario Outline: <APTASC08> Application submission for Self only with Business Overhead Expense Insurance and Self & Spouse with Short Term Disability Insurance (primary trust, contingent individual)               
    Given Test set up for "NYL" feature and "NYL_APTA" scenario
    Given Customer navigate to NYL "<website>"
    When Clicks on Apply now button
    Then Let’s get started page is displayed and enters login details as Username and "<Password>"
    And Clicks on next button
    Then Eligibility page details are displayed to user and enters details as  "<Fname>","<Lname>","<MM>","<DD>","<YYYY>","<Address>","<WorkHr>","<Mstatus>"
    And Select Member Associaton as YES for self
    And Select Dependent as YES for self
    And Clicks on next button
     And Verify that error message is displayed as help us to display at top of the page
    Then Change address as "<Address1>"
    And Clicks on next button
    Then Spouse Eligibility page is displayed
    Then select spouse eligibility as YES and enter details as  "<Sfname>", "<Slname>" , "<SMM>", "<SDD>", "<SYYYY>","<SWorkHr>"
    And Clicks Spouse Member Association as NO
    And Clicks on next button
    Then Child Eligibility page is displayed select "<CeligiNo>" for child
    And Clicks on next button
    Then Product page is displayed with product list
    And Select Self, Spouse for Short Term Disability Insurance
    And Select Self for Business Overhead Expense Insurance
    And Clicks on next button
    Then  Refresh the browser
		Then Clicks on Log in and Enter stored Email ID and "<Password>" and click on Next
    Then Your product questions page is displayed and select NO and enter the details for Group Disability Insurance for self as "<MonthlyIncome>"
    Then Your product questions page is displayed and Select No and enter the details for Business Overhead for self as "<Monthbusexp>","<Percentmonthbusexp>"
    And Clicks on next button
    Then Spouse product questions page is displayed and select NO for other insurance questions and enter detail "<SIncome>"
    And Clicks on next button
    Then Your Coverage page is displayed
    Then Select the amount of Short Term Disability Insurance coverage for self as "<Benefit>" and enter details "<SDIwait>", "<SDIduration>"
     And Validate min and max values of Business Overhead Expenses for Self as "<Min1>", "<Max1>"
    Then Select the amount of Business Overhead Expense Insurance coverage for self as "<Benefit1>" and enter details "<BOEwait>", "<BOEduration>"
    And Clicks on next button
    Then Spouse Coverage page is displayed
    Then Enter the details of Short Term Disability Insurance coverage for Spouse as "<SBenefit>", "<SSDIwait>", "<SSDIduration>"
    And Clicks on next button
    Then Your personal details page displayed and select "<gender>", enters details as "<SSN>","<Height>","<Weight>" and reside outside as "<Resideoutside>"
    And Clicks on next button
    Then Spouse personal details page displayed and select "<Sgender>" and enter details as "<SSSN>", "<SHeight>","<SWeight>" and reside outside as "<SRoutside>"
    And Clicks on next button
    Then Your Contact details page displayed and select Business and select NO and user enters details as "<Phtype>","<Number>","<Bsname>","<Typebusiness>","<Baddress>"
    And Clicks on next button
    Then Spouse Contact details page displayed and user enters details as emailid and "<SPhtype>","<Sno>"
    And Clicks on next button
    And Preview Page is displayed in Mobile site
    And Clicks on next button
    Then Payment page is displayed, select Yes
    Then Click on Short Term Disability Insurance coverage and Select method Bill Me and Select "<Freq>"
    And validate the premium values for Short Term for self and spouse "<Mpremium>", "<Spremium>", "<Total>"
    Then Click on Business Overhead Expense Insurance coverage and Select method Bill Me and Select "<Freq1>"
    And validate the premium values for Business Overhead for self "<Mpremium1>","<Total1>"
    And Clicks on next button
    Then Authorization & Consent Page is displayed and users Clicks the checkbox for Self
    Then Authorization & Consent Page is displayed and users Clicks the checkbox for Spouse
    And Clicks on next button
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Review and sign page details are displayed to user and Click on continue and attached the sign
    And Clicks on next button to finish
    Then Thank you page is displayed to user in Mobile site
    And Verify that Confirmation number is generated in Mobile site for "<website>"
		And Verify PDF information in mobile as "<pdfScenario>","<pdfEnable>"
		
 
    Examples: 
    | website | Password | Fname | Lname | MM | DD | YYYY | Address             | Address1                                   | WorkHr | Mstatus | Sfname  | Slname | SMM | SDD | SYYYY | SWorkHr | CeligiNo | MonthlyIncome | Monthbusexp | Percentmonthbusexp | SIncome | Benefit | SDIwait | SDIduration | Min1|Max1 |Benefit1 | BOEwait | BOEduration | SBenefit | SSDIwait | SSDIduration | gender | Resideoutside | SSN       | Height | Weight | Sgender | SSSN      | SHeight | SWeight | SRoutside | Phtype | Number     | Bsname     | Typebusiness | Baddress                            | SPhtype | Sno        | Freq      | Mpremium | Spremium | Total     | Freq1        | Mpremium1 | Total1 |pdfEnable|pdfScenario|
    | apta    | Test1@@@ | Diego | Baker | 12 | 06 | 2000 | Guam, MO 63846, USA | 10724 E 112th Pl, Henderson, CO 80640, USA |     40 | Married | Isabella| Baker  |  04 |  25 |  2000 |      45 | No       |         50000 |        4000 |                 20 |   20000 |    2000 | 0/7     | 6 months    |  500|800  |   600   | 30 Days | 24 Months   |     2000 | 0/7      | 6 months     | Male   | No            | 125145696 |    5.0 |    200 | Female  | 340000789 |     5.1 |     200 | No        | Home   | 1248596125 | Greyson | Corporation  | 10 S Kansas Ave, Olathe, KS 66061, USA | Home    | 0254123554 | Quarterly | $550.20  | $550.20  | $1,100.40 | Semiannually | $13.68    | $13.68 |0       |APTA08|

#@AptaRegression_pdf
 #Examples: 
      #| website | Password | Fname | Lname | MM | DD | YYYY | Address             | Address1                                   | WorkHr | Mstatus | Sfname  | Slname | SMM | SDD | SYYYY | SWorkHr | CeligiNo | MonthlyIncome | Monthbusexp | Percentmonthbusexp | SIncome | Benefit | SDIwait | SDIduration | Min1|Max1 |Benefit1 | BOEwait | BOEduration | SBenefit | SSDIwait | SSDIduration | gender | Resideoutside | SSN       | Height | Weight | Sgender | SSSN      | SHeight | SWeight | SRoutside | Phtype | Number     | Bsname     | Typebusiness | Baddress                            | SPhtype | Sno        | Freq      | Mpremium | Spremium | Total     | Freq1        | Mpremium1 | Total1 |pdfEnable|pdfScenario|
      #| apta    | Test1@@@ | Diego | Baker | 12 | 06 | 2000 | Guam, MO 63846, USA | 10724 E 112th Pl, Henderson, CO 80640, USA |     40 | Married | Isabella| Baker  |  04 |  25 |  2000 |      45 | No       |         50000 |        4000 |                 20 |   20000 |    2000 | 0/7     | 6 months    |  500|800  |   600   | 30 Days | 24 Months   |     2000 | 0/7      | 6 months     | Male   | No            | 125145696 |    5.0 |    200 | Female  | 340000789 |     5.1 |     200 | No        | Home   | 1248596125 | Greyson | Corporation  | 10 S Kansas Ave, Olathe, KS 66061, USA | Home    | 0254123554 | Quarterly | $550.20  | $550.20  | $1,100.40 | Semiannually | $13.68    | $13.68 |1       |APTA08|

@AptaRegression_2
  Scenario Outline: <APTASC02> Complete flow till Read & Sign Page with 21 different States one by one in loop
    Given Test set up for "NYL" feature and "NYL_APTA" scenario
    Given Customer navigate to NYL "<website>"
    When Clicks on Apply now button
    Then Let’s get started page is displayed and enters login details as Username and "<Password>"
    And Clicks on next button
    Then Eligibility page details are displayed to user and enters details as  "<Fname>","<Lname>","<MM>","<DD>","<YYYY>","<Address>","<WorkHr>","<Mstatus>"
    And Select Member Associaton as YES for self
    And Select Dependent as YES for self
    And Clicks on next button
    Then Child Eligibility page is displayed select "<CeligiNo>" for child
    And Clicks on next button
    Then Product page is displayed with product list
    Then Select Self for all the Products
    And Clicks on next button
    Then Your product questions page is displayed and select the checkbox as NO for all the questions for group term life insurance
    Then Your product questions page is displayed and Select No and enter the details for All Group Disability Insurance for self as "<MonthlyIncome>","<Monthbusexp>","<Percentmonthbusexp>"
    And Clicks on next button
    Then Your Coverage page is displayed
    Then Select the amount of Traditional Term coverage for self as "<Benefit1>"
    Then Select the amount of TenYTL coverage for self as "<Benefit2>"
    Then Select the amount of TwentyYTL coverage for self as "<Benefit3>"
    Then Select the amount of Long Term Disability Insurance coverage for self as "<Benefit4>" and enter details "<Bwait4>", "<Bduration4>"
    And Select checkbox for BOTH riders COLA and CDB for self
    Then Select the amount of Short Term Disability Insurance coverage for self as "<Benefit5>" and enter details "<Bwait5>", "<Bduration5>"
    Then Select the amount of Business Overhead Expense Insurance coverage for self as "<Benefit6>" and enter details "<Bwait6>", "<Bduration6>"
    And Clicks on next button
    Then Your Beneficiary page displayed user select NO to the question
    And Clicks on next button
    Then Your personal details page displayed and select "<gender>", enters details as "<SSN>","<Height>","<Weight>" and reside outside as "<Resideoutside>"
    Then Select Tabacco as "<Issmoker>" for Self
    And Clicks on next button
    Then Your Contact details page displayed and select Business and select NO and user enters details as "<Phtype>","<Number>","<Bsname>","<Typebusiness>","<Baddress>"
    And Clicks on next button
    Then Preview Page is displayed in Mobile site
    And Clicks on next button
    Then Payment page is displayed,select NO
    And Clicks on next button
    Then Authorization page is displayed to user in mobile site
    And Validate Authorization message in Read and Sign Box
    Then Validates I Understand verbiage one in Read and Sign Box
    And Validate Fraud Notice CO in Read and Sign Box
    And Validate Consent message in Read and Sign Box
    Then Navigate back to Eligibility page
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
    And Clicks on next button
    And Validate Fraud Notice CA in Read and Sign Box
    Then Navigate back to Eligibility page
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
    And Clicks on next button
    And Validate Fraud Notice AL in Read and Sign Box
    Then Navigate back to Eligibility page
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
    And Clicks on next button
    And Validate Fraud Notice AR in Read and Sign Box
    Then Navigate back to Eligibility page
    Then Change address as "<Address4>"
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
    And Validate Fraud Notice LA in Read and Sign Box
   Then Navigate back to Eligibility page
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
    And Clicks on next button
    And Validate Fraud Notice PA in Read and Sign Box
    Then Navigate back to Eligibility page
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
    And Clicks on next button
    And Validate Fraud Notice RI in Read and Sign Box
    Then Navigate back to Eligibility page
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
    And Clicks on next button
    And Validate Fraud Notice MD in Read and Sign Box
    Then Navigate back to Eligibility page
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
    And Clicks on next button
    And Validate Fraud Notice DC in Read and Sign Box
    Then Navigate back to Eligibility page
    Then Change address as "<Address9>"
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
    And Validate Fraud Notice FL in Read and Sign Box
    Then Navigate back to Eligibility page
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
    And Clicks on next button
    And Validate Fraud Notice KS in Read and Sign Box
    Then Navigate back to Eligibility page
    Then Change address as "<Address11>"
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
    And Validate Fraud Notice ME in Read and Sign Box
    Then Navigate back to Eligibility page
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
    And Clicks on next button
    And Validate Fraud Notice NJ in Read and Sign Box
   Then Navigate back to Eligibility page
    Then Change address as "<Address13>"
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And select the NY Imp Info checkbox
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    And Validate Fraud Notice NY in Read and Sign Box
    Then Navigate back to Eligibility page
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
    And Clicks on next button
    And Validate Fraud Notice OK in Read and Sign Box
    Then Navigate back to Eligibility page
   Then Change address as "<Address16>"
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
    And Validate Fraud Notice TN in Read and Sign Box
   Then Navigate back to Eligibility page
   Then Change address as "<Address17>"
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
    And Validate Fraud Notice WA in Read and Sign Box
    Then Navigate back to Eligibility page
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
    And Clicks on next button
    And Validate Fraud Notice VA in Read and Sign Box
    Then Navigate back to Eligibility page
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
    And Clicks on next button
    And Validate Fraud Notice WM in Read and Sign Box
    And Clicks on IMPORTANT NOTICE and verify Important Notice from PDF "<pdfScenario>","<pdfEnable>","<pdfName>" in mobile site
    And Navigate back to Eligibility page
And Change address as "<Address20>"
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
And Change address as "<Address21>"
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
And Validates additional Notes for Connecticut state
And Navigate back to Eligibility page
And Change address as "<Address22>"
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
     | website | Password | Fname | Lname | MM | DD | YYYY | Address                          | WorkHr | CeligiNo | Mstatus | MonthlyIncome | Monthbusexp | Percentmonthbusexp | Benefit1 | Benefit2 | Benefit3 | Benefit4 | Bwait4  | Bduration4 | Benefit5 | Bwait5 | Bduration5 | Benefit6 | Bwait6  | Bduration6 | gender | SSN       | Height | Weight | Issmoker | Resideoutside | Phtype | Number     | Bsname     | Typebusiness | Baddress                               | Address1                                      | Address2                           | Address3                              | Address4                                                               | Address5                                   | Address6                                    | Address7                             | Address8                                       | Address9                                     | Address10                              | Address11                             | Address12                           | Address13                                    | Address14                           | Address15                                           | Address16                                  | Address17                       | Address18                                 | Address19                        | Address20                                | Address21                                | Address22                              |pdfScenario|pdfScenario1|pdfEnable|pdfName                               |pdfName1                  |
     | apta    | Test1@@@ | Adam  | David | 12 | 06 | 1980 | 11 CO-67, Sedalia, CO 80135, USA |     45 | No       | Single  |         60000 |       10000 |                 50 |   300000 |   400000 |   450000 |     9000 | 60 Days | Age 65     |     2800 | 0/7    | 6 months   |     1500 | 30 Days | 24 Months  | Female | 125458796 |    5.0 |    180 | No       | No            | Home   | 1245874125 | JohnPlayer | Corporation  | 10 S Kansas Ave, Olathe, KS 66061, USA | 11 W California Blvd, Pasadena, CA 91105, USA | 11 AL-157, Danville, AL 35619, USA | 32 AR-5, Mountain Home, AR 72653, USA | A B Dock Services Heliport, 501 Gulf Beach Hwy, Cameron, LA 70631, USA | 1 North Pennell Road, Media, PA 19063, USA | 82 Rhode Island Ave, Newport, RI 02840, USA | 10 Maryland Ave, Rockville, MD 20850 | 32 DC Village Ln SW, Washington, DC 20032, USA | 10 Florida A1A, St. Augustine, FL 32080, USA | 10 S Kansas Ave, Olathe, KS 66061, USA | 11 Maine St, Brunswick, ME 04011, USA | 11 NJ-35, Lavallette, NJ 08735, USA | 60 NY-25A, Cold Spring Harbor, NY 11724, USA | 11 Oklahoma, Walters, OK 73572, USA | 408 Av. Andalucía, Puerto Nuevo, San Juan, PR 00920 | 10 TN-25, Castalian Springs, TN 37031, USA | 1800 James St, Seattle, WA, USA | 1201 S Joyce St, Arlington, VA 22202, USA | 150 E B St, Casper, WY 82601, USA| 10 New Mexico 9 Columbus New Mexico 88029|10 Connecticut Ave, Norwalk, CT 06850, USA|10 Minnesota 210 Vining Minnesota 56588 |APTA02_WM  |APTA02_NM   |1        |Important Notice All except NM 2 08.12|Important Notice NM 2 08.12|
  
  
   @AptaRegression_9
    Scenario Outline: <APTASC09> Complete flow for Premium rates
    
Given Test set up for "NYL" feature and "NYL_APTA" scenario
Given Customer navigate to NYL "<website>"
When Clicks on Apply now button
Then Let’s get started page is displayed and enters login details as Username and "<Password>"
And Clicks on next button
Then Eligibility page details are displayed to user and enters details as  "<Fname>","<Lname>","<MM>","<DD>","<YYYY>","<Address>","<WorkHr>","<Mstatus>"
And Select Member Associaton as YES for self
And Select Dependent as YES for self
And Clicks on next button
Then Spouse Eligibility page is displayed
Then select spouse eligibility as YES and enter details as  "<Sfname>", "<Slname>" , "<SMM>", "<SDD>", "<SYYYY>","<SWorkHr>"
And Clicks Spouse Member Association as NO
And Clicks on next button
Then Child Eligibility page is displayed select "<CeligiYes>" for child
And enter details for child as  "<Cfname>", "<Clname>" , "<CMM>", "<CDD>", "<CYYYY>"
And Select Sex as "<Cgender>" and Married as "<Childmarried>" for child
And Select Full time student as "<Ftstudent>" for child
And Clicks on next button
Then Product page is displayed with product list
Then Select Self for all the Products
And Select Spouse for Traditional, TenYTL, TwentyYTL, LongTerm and ShortTerm Products
And Select Child for Traditional Term Life Insurance
And Clicks on next button
Then Your product questions page is displayed and select the checkbox as NO for all the questions for group term life insurance
Then Your product questions page is displayed and Select No and enter the details for All Group Disability Insurance for self as "<MonthlyIncome>","<Monthbusexp>","<Percentmonthbusexp>"
And Clicks on next button
Then Spouse Product questions page is displayed And select the checkbox NO for all the questions for group term life insurance
Then Spouse product questions page is displayed and select NO for other insurance questions and enter detail "<SMonthlyIncome>"
And Clicks on next button
Then Your Coverage page is displayed
Then Select the amount of Traditional Term coverage for self as "<Benefit>"
Then Select the amount of TenYTL coverage for self as "<Benefit1>"
Then Select the amount of TwentyYTL coverage for self as "<Benefit2>"
Then Select the amount of Long Term Disability Insurance coverage for self as "<Benefit3>" and enter details "<GDIwait>", "<GDIduration>"
Then Select the amount of Short Term Disability Insurance coverage for self as "<Benefit4>" and enter details "<SDIwait>", "<SDIduration>"
Then Select the amount of Business Overhead Expense Insurance coverage for self as "<Benefit5>" and enter details "<BOEwait>", "<BOEduration>"
 And Clicks on next button
Then Spouse Coverage page is displayed
Then Select the amount of Traditional Term coverage for spouse as "<SBenefit>"
Then Select the amount of TenYTL coverage for Spouse as "<SBenefit1>"
Then Select the amount of TwentyYTL coverage for Spouse as "<SBenefit2>"
Then Enter the details of Long Term Disability Insurance coverage for Spouse as "<SBenefit3>", "<SGDIwait>", "<SGDIduration>"
Then Enter the details of Short Term Disability Insurance coverage for Spouse as "<SBenefit4>", "<SSDIwait>", "<SSDIduration>"
And Clicks on next button
Then Child Coverage page is displayed
And Select the amount of child coverage as "<CBenefit>" under Traditional Term Life
And Clicks on next button
Then Your Beneficiary page displayed user select NO to the question
And Clicks on next button
Then Spouse Beneficiary page displayed user select NO to the question
And Clicks on next button
Then Your personal details page displayed and select "<gender>", enters details as "<SSN>","<Height>","<Weight>" and reside outside as "<Resideoutside>"
Then Select Tabacco as "<Issmoker>" for Self
And Clicks on next button
Then Spouse personal details page displayed and select "<Sgender>" and enter details as "<SSSN>", "<SHeight>","<SWeight>" and reside outside as "<Sresideoutside>"
Then Select Tabacco as "<Sissmoker>" for Spouse
And Clicks on next button
Then Your Contact details page displayed and select Business and select NO and user enters details as "<Phtype>","<Number>","<Bsname>","<Typebusiness>","<Baddress>"
And Clicks on next button
Then Spouse Contact details page displayed and user enters details as emailid and "<SPhtype>","<Sno>"
And Clicks on next button
And Preview Page is displayed in Mobile site
And Clicks on next button
Then Payment page is displayed, select Yes
And Click on traditional term product and select method Bill Me and Select "<Freq>"
And validate the estimated rates values for Traditional product for self, spouse and child "<Mpremium>", "<Spremium>", "<Cpremium>", "<Total>"
Then Click on Ten Year Level Term Life Insurance coverage and Select method Bill Me and Select "<Freq1>"
And validate the premium values for Ten Year for self and spouse "<Mpremium1>", "<Spremium1>","<Total1>"
Then Click on Twenty Year Level Term Life Insurance coverage and Select method Bill Me and Select "<Freq2>"
And validate the premium values for Twenty Year for self and spouse "<Mpremium2>", "<Spremium2>","<Total2>"
Then Click on Long Term Disability Insurance coverage and Select method Bill Me and Select "<Freq3>"
And validate the premium values for Long Term for self and spouse "<Mpremium3>", "<Spremium3>", "<Total3>"
Then Click on Short Term Disability Insurance coverage and Select method Bill Me and Select "<Freq4>"
And validate the premium values for Short Term for self and spouse "<Mpremium4>", "<Spremium4>", "<Total4>"
Then Click on Business Overhead Expense Insurance coverage and Select method Bill Me and Select "<Freq5>"
And validate the premium values for Business Overhead for self "<Mpremium5>","<Total5>"
######################2
And Clicks on next button
Then Navigate back to Eligibility page
And Enter DOB details for Self as "<MM1>","<DD1>","<YYYY1>"
And Clicks on next button
Then Enter DOB details for Spouse as "<SMM1>", "<SDD1>", "<SYYYY1>"
And Clicks on next button
And Enter DOB details for child as "<CMM1>", "<CDD1>", "<CYYYY1>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
Then Your Coverage page is displayed
Then Select the amount of Traditional Term coverage for self as "<BenefitNew>"
Then Select the amount of TenYTL coverage for self as "<BenefitNew1>"
Then Select the amount of Long Term Disability Insurance coverage for self as "<BenefitNew2>" and enter details "<GDIwaitNew>", "<GDIdurationNew>"
Then Select the amount of Short Term Disability Insurance coverage for self as "<BenefitNew3>" and enter details "<SDIwaitNew>", "<SDIdurationNew>"
 And Clicks on next button
Then Spouse Coverage page is displayed
Then Select the amount of Traditional Term coverage for spouse as "<SBenefitNew>"
Then Select the amount of TenYTL coverage for Spouse as "<SBenefitNew1>"
Then Enter the details of Long Term Disability Insurance coverage for Spouse as "<SBenefitNew2>", "<SGDIwaitNew>", "<SGDIdurationNew>"
Then Enter the details of Short Term Disability Insurance coverage for Spouse as "<SBenefitNew3>", "<SSDIwaitNew>", "<SSDIdurationNew>"
And Clicks on next button
Then Child Coverage page is displayed
And Clicks on next button
Then Your Beneficiary page displayed user select NO to the question
And Clicks on next button
Then Spouse Beneficiary page displayed user select NO to the question
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
Then Payment page is displayed
And validate the estimated rates values for Traditional product for self, spouse and child "<MpremiumTrad>", "<SpremiumTrad>", "<CpremiumTrad>", "<TotalTrad>"
And validate the premium values for Ten Year for self and spouse "<MpremiumTen>", "<SpremiumTen>","<TotalTen>"
And validate the premium values for Long Term for self and spouse "<MpremiumLong>", "<SpremiumLong>", "<TotalLong>"
And validate the premium values for Short Term for self and spouse "<MpremiumShort>", "<SpremiumShort>", "<TotalShort>"
And Clicks on next button
######3
And Navigate back to Eligibility page 
Then Enter DOB details for Self as "<MMN1>","<DDN1>","<YYYYN1>"
Then Change address as "<AddressN1>"
And Clicks on next button
Then Enter DOB details for Spouse as "<SMMN1>", "<SDDN1>", "<SYYYYN1>"
And Clicks on next button
And Clicks on next button
 And Select Self for Business Overhead Expense Insurance
And Clicks on next button
Then Your product questions page is displayed and Select No and enter the details for All Group Disability Insurance for self as "<MonthlyIncome1>","<Monthbusexp1>","<Percentmonthbusexp1>"
And Clicks on next button
And Clicks on next button
Then Your Coverage page is displayed
Then Select the amount of Long Term Disability Insurance coverage for self as "<Benefit3N1>" and enter details "<GDIwaitN1>", "<GDIdurationN1>"
And Select checkbox for BOTH riders COLA and CDB for self
Then Select the amount of Short Term Disability Insurance coverage for self as "<Benefit4N1>" and enter details "<SDIwaitN1>", "<SDIdurationN1>"
Then Select the amount of Business Overhead Expense Insurance coverage for self as "<Benefit5N1>" and enter details "<BOEwaitN1>", "<BOEdurationN1>"
 And Clicks on next button
Then Spouse Coverage page is displayed
Then Enter the details of Long Term Disability Insurance coverage for Spouse as "<SBenefit3N1>", "<SGDIwaitN1>", "<SGDIdurationN1>"
And Select check box for BOTH riders COLA and CDB for Spouse
Then Enter the details of Short Term Disability Insurance coverage for Spouse as "<SBenefit4N1>", "<SSDIwaitN1>", "<SSDIdurationN1>"
And Clicks on next button
##Then Child Coverage page is displayed
##And Clicks on next button
##Then Your Beneficiary page displayed user select NO to the question
##And Clicks on next button
##Then Spouse Beneficiary page displayed user select NO to the question
##And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
Then Payment page is displayed
And validate the premium values for Long Term for self and spouse "<Mpremium3N1>", "<Spremium3N1>", "<Total3N1>"
And validate the premium values for Short Term for self and spouse "<Mpremium4N1>", "<Spremium4N1>", "<Total4N1>"
Then Click on Business Overhead Expense Insurance coverage and Select method Bill Me and Select "<Freq5N1>"
And validate the premium values for Business Overhead for self "<Mpremium5N1>","<Total5N1>"
And Clicks on next button
##########4
And Navigate back to Eligibility page 
Then Enter DOB details for Self as "<MMN2>","<DDN2>","<YYYYN2>"
And Clicks on next button
Then Enter DOB details for Spouse as "<SMMN2>", "<SDDN2>", "<SYYYYN2>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
Then Your Coverage page is displayed
Then Select the amount of Long Term Disability Insurance coverage for self as "<Benefit3N2>" and enter details "<GDIwaitN2>", "<GDIdurationN2>"
And Select checkbox for BOTH riders COLA and CDB for self
Then Select the amount of Short Term Disability Insurance coverage for self as "<Benefit4N2>" and enter details "<SDIwaitN2>", "<SDIdurationN2>"
 And Clicks on next button
Then Spouse Coverage page is displayed
Then Enter the details of Long Term Disability Insurance coverage for Spouse as "<SBenefit3N2>", "<SGDIwaitN2>", "<SGDIdurationN2>"
And Select check box for BOTH riders COLA and CDB for Spouse
Then Enter the details of Short Term Disability Insurance coverage for Spouse as "<SBenefit4N2>", "<SSDIwaitN2>", "<SSDIdurationN2>"
And Clicks on next button
##Then Child Coverage page is displayed
##And Clicks on next button
##Then Your Beneficiary page displayed user select NO to the question
##And Clicks on next button
##Then Spouse Beneficiary page displayed user select NO to the question
##And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
Then Payment page is displayed
And validate the premium values for Long Term for self and spouse "<Mpremium3N2>", "<Spremium3N2>", "<Total3N2>"
And validate the premium values for Short Term for self and spouse "<Mpremium4N2>", "<Spremium4N2>", "<Total4N2>"
And Clicks on next button
#####5
And Navigate back to Eligibility page 
Then Enter DOB details for Self as "<MMN3>","<DDN3>","<YYYYN3>"
Then Change address as "<AddressN3>"
And Clicks on next button
Then Enter DOB details for Spouse as "<SMMN3>", "<SDDN3>", "<SYYYYN3>"
And Clicks on next button
And Enter DOB details for child as "<CMMN3>", "<CDDN3>", "<CYYYYN3>"
And Select Full time student as "<FtstudentN3>" for child
And Clicks on next button
And Select Child for Traditional Term Life Insurance
### changed line BOE removed
And Deselect Self for Short Term and Long Term
And Deselect Spouse for Short Term and Long Term
And Select Self, Spouse for Twenty Year Level Term Life Insurance
And Clicks on next button
Then Validate Dependent only Pop up message and click on ok
Then Your product questions page is displayed and select the checkbox as NO for all the questions for group term life insurance
And Clicks on next button
Then Spouse Product questions page is displayed And select the checkbox NO for all the questions for group term life insurance
And Clicks on next button
Then Your Coverage page is displayed
Then Select the amount of TwentyYTL coverage for self as "<Benefit2N3>"
 And Clicks on next button
Then Select the amount of TwentyYTL coverage for Spouse as "<SBenefit2N3>"
 And Clicks on next button
Then Child Coverage page is displayed
And Clicks on next button
Then Your Beneficiary page displayed user select NO to the question
And Clicks on next button
Then Spouse Beneficiary page displayed user select NO to the question
And Clicks on next button
Then Your personal details page displayed and select "<genderN3>", enters details as "<SSNN3>","<HeightN3>","<WeightN3>" and reside outside as "<ResideoutsideN3>"
Then Select Tabacco as "<IssmokerN3>" for Self
And Clicks on next button
Then Spouse personal details page displayed and select "<SgenderN3>" and enter details as "<SSSNN3>", "<SHeightN3>","<SWeightN3>" and reside outside as "<SresideoutsideN3>"
Then Select Tabacco as "<SissmokerN3>" for Spouse
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
Then Payment page is displayed
And Click on traditional term product and select method Bill Me and Select "<FreqN3>"
And validate the estimated rates values for Traditional product for child "<CpremiumTradN3>", "<TotalTradN3>"
Then Click on Twenty Year Level Term Life Insurance coverage and Select method Bill Me and Select "<Freq2N3>"
And validate the premium values for Twenty Year for self and spouse "<Mpremium2N3>", "<Spremium2N3>","<Total2N3>"
And Clicks on next button
###############6
And Navigate back to Eligibility page 
Then Enter DOB details for Self as "<MMN4>","<DDN4>","<YYYYN4>"
And Clicks on next button
Then Enter DOB details for Spouse as "<SMMN4>", "<SDDN4>", "<SYYYYN4>"
And Clicks on next button
And Clicks on next button
And Select Self, Spouse for Traditional Term Life Insurance
And Select Self, Spouse for Ten Year Level Term Life Insurance
And Select Self, Spouse for Twenty Year Level Term Life Insurance
And Deselect Child for Traditional Term Life Insurance
And Clicks on next button
Then Your product questions page is displayed and select the checkbox as NO for all the questions for group term life insurance
And Clicks on next button
Then Spouse Product questions page is displayed And select the checkbox NO for all the questions for group term life insurance
And Clicks on next button
Then Your Coverage page is displayed
Then Select the amount of Traditional Term coverage for self as "<BenefitT4>"
Then Select the amount of TenYTL coverage for self as "<BenefitT5>"
Then Select the amount of TwentyYTL coverage for self as "<Benefit2N6>"
 And Clicks on next button
Then Select the amount of Traditional Term coverage for spouse as "<SBenefitT4>"
Then Select the amount of TenYTL coverage for Spouse as "<SBenefitT5>"
Then Select the amount of TwentyYTL coverage for Spouse as "<SBenefit2N6>"
 And Clicks on next button
#Then Child Coverage page is displayed
#And Clicks on next button
Then Your Beneficiary page displayed user select NO to the question
And Clicks on next button
Then Spouse Beneficiary page displayed user select NO to the question
And Clicks on next button
Then Select Tabacco as "<IssmokerN4>" for Self
And enters details for tobacco for self as "<TMM>","<TDD>","<TYYYY>", "<Tobaccoprd>"
And Clicks on next button
Then Select Tabacco as "<SissmokerN4>" for Spouse
And enters details for tobacco for spouse as "<TSMM>","<TSDD>","<TSYYYY>", "<Stobaccoprd>"
And Clicks on next button
And Clicks on next button
And Clicks on next button
And Clicks on next button
Then Payment page is displayed
And Click on traditional term product and select method Bill Me and Select "<FreqNT4>"
And validate the estimated rates values for Traditional product for self and spouse "<MpremiumTrad4>", "<SpremiumTrad4>", "<TotalTrad4>" 
Then Click on Ten Year Level Term Life Insurance coverage and Select method Bill Me and Select "<Freq1NT4>"
And validate the premium values for Ten Year for self and spouse "<Mpremium04>", "<Spremium04>","<Total04>"
Then Click on Twenty Year Level Term Life Insurance coverage and Select method Bill Me and Select "<Freq2N4>"
And validate the premium values for Twenty Year for self and spouse "<MpremiumT4>", "<SpremiumT4>","<TotalT4>"
And Clicks on next button




Examples: 

| website | Password | Fname | Lname | MM | DD | YYYY                | Address                            | WorkHr | Mstatus | Sfname| Slname |SMM|SDD | SYYYY               | SWorkHr | CeligiYes|  Cfname | Clname | CMM | CDD | CYYYY               | Cgender | Childmarried | Ftstudent  | MonthlyIncome | Monthbusexp | Percentmonthbusexp  |SMonthlyIncome|Benefit| Benefit1 | Benefit2 | Benefit3 | GDIwait | GDIduration | Benefit4| SDIwait | SDIduration  | Benefit5 |  BOEwait| BOEduration  |  SBenefit| SBenefit1 | SBenefit2 | SBenefit3 | SGDIwait | SGDIduration | SBenefit4 | SSDIwait | SSDIduration | CBenefit |gender | SSN         |Height|Weight |Issmoker | Resideoutside| Sgender|SSSN      | SHeight| SWeight| Sissmoker| Sresideoutside |Phtype | Number   | Bsname    | Typebusiness| Baddress                         |SPhtype |Sno        | Freq     | Mpremium| Spremium| Cpremium | Total   | Freq1    | Mpremium1| Spremium1 | Total1| Freq2     | Mpremium2 | Spremium2 | Total2 | Freq3    | Mpremium3 | Spremium3| Total3 | Freq4     | Mpremium4 | Spremium4 | Total4  | Freq5     | Mpremium5| Total5  |MM1 | DD1 | YYYY1             | SMM1| SDD1| SYYYY1             |CMM1| CDD1| CYYYY1             |BenefitNew| BenefitNew1 | BenefitNew2 | GDIwaitNew | GDIdurationNew | BenefitNew3 | SDIwaitNew | SDIdurationNew  |  SBenefitNew | SBenefitNew1 |  SBenefitNew2 | SGDIwaitNew | SGDIdurationNew | SBenefitNew3 | SSDIwaitNew | SSDIdurationNew | MpremiumTrad| SpremiumTrad | CpremiumTrad | TotalTrad   | MpremiumTen | SpremiumTen | TotalTen      | MpremiumLong | SpremiumLong | TotalLong| MpremiumShort | SpremiumShort | TotalShort |MMN1| DDN1| YYYYN1               | AddressN1                            |SMMN1| SDDN1 | SYYYYN1            |  MonthlyIncome1|Monthbusexp1   |Percentmonthbusexp1 |Benefit3N1| GDIwaitN1| GDIdurationN1 | Benefit4N1| SDIwaitN1 | SDIdurationN1 | Benefit5N1 |  BOEwaitN1 | BOEdurationN1|SBenefit3N1| SGDIwaitN1 | SGDIdurationN1 | SBenefit4N1 | SSDIwaitN1 | SSDIdurationN1 |  Mpremium3N1 | Spremium3N1 | Total3N1   | Mpremium4N1| Spremium4N1| Total4N1 |   Freq5N1 | Mpremium5N1|Total5N1|MMN2 | DDN2 | YYYYN2              | AddressN2                            |SMMN2 | SDDN2 | SYYYYN2             | Benefit3N2 | GDIwaitN2 | GDIdurationN2 | Benefit4N2 | SDIwaitN2 | SDIdurationN2 | SBenefit3N2| SGDIwaitN2 | SGDIdurationN2 | SBenefit4N2 | SSDIwaitN2 | SSDIdurationN2 |  Mpremium3N2 | Spremium3N2 | Total3N2   | Mpremium4N2 | Spremium4N2 | Total4N2|MMN3 | DDN3 | YYYYN3             | AddressN3                          |SMMN3| SDDN3| SYYYYN3            |  CMMN3|CDDN3|CYYYYN3             | FtstudentN3|Benefit2N3|SBenefit2N3|genderN3 | SSNN3    |HeightN3|WeightN3|IssmokerN3| ResideoutsideN3| SgenderN3|SSSNN3     | SHeightN3| SWeightN3| SissmokerN3| SresideoutsideN3 | FreqN3    | CpremiumTradN3|TotalTradN3|Freq2N3     |Mpremium2N3|Spremium2N3|Total2N3|MMN4|DDN4| YYYYN4               |SMMN4 | SDDN4 | SYYYYN4                 |BenefitT4|BenefitT5|Benefit2N6|SBenefitT4|SBenefitT5|SBenefit2N6 |IssmokerN4 | TMM| TDD| TYYYY               | Tobaccoprd | SissmokerN4 | TSMM | TSDD | TSYYYY            | Stobaccoprd | FreqNT4 | MpremiumTrad4|SpremiumTrad4|TotaTrad4 | Freq1NT4 |Mpremium04|Spremium04|Total04|Freq2N4 |MpremiumT4|SpremiumT4|TotalT4|TotalTrad4|         
| apta    | Test1@@@ | Adam  | David |    |    |SYSDate- 31Y/00M/00D | 11 Kansas Ave, Kansas City, KS, USA|     45 | Married | Alley | David  |   |    |SYSDate- 28y/00m/00d |  45     | Yes      | John    | David  |     |     |SYSDate- 02Y/00M/00D | Male    | No           | No         |    16000      |       10000 |           80        |16000         |50000  |100000    | 100000    |100      |60 Days  | Age 65      |1200     | 0/7     | 6 months     |500       | 30 Days | 24 Months    |  50000   |   100000  |    100000 |     100   | 90 Days  | Age 65       |     1200  | 0/7      | 6 months     |    10000 |Male   |125458796    |5.0   |188    |No       |No            |Female  |1236789333|  5.0   | 180    |   No     |  No            | Home  |1234567890|Bright LTD |Corporation  |10 S Kansas Ave, Olathe, KS 66061 |Home    | 1234567898| Quarterly| $9.90   | $4.20   | $3.99    | $18.09 | Quarterly | $26.76   | $24.30    | $51.06| Quarterly | $47.28    | $38.52    | $85.80 | Quarterly | $6.07    | $5.51    | $11.58 | Quarterly | $197.64   | $330.12   | $527.76 | Quarterly | $7.50    | $7.50   |    |    | SYSDate-64Y/00M/00D|     |     | SYSDate-64Y/00M/00D|    |     | SYSDate-20Y/00M/00D|150000    |350000       |1500         |90 Days     | Five Year      |2000          | 0/7       | 6 months        |  150000      |    350000    |    1500      | 90 Days      | Five Year       |    2000      | 0/7         | 6 months        | $466.20     | $316.80      | $3.99        | $786.99     |  $631.05    | $389.55     | $1,020.60     | $312.66      | $312.66      | $625.32  | $455.40       | $455.40       | $910.80    |    |     | SYSDate- 17Y/00M/00D |10 N Montana St, Dillon, MT 59725, USA|     |       | SYSDate-17Y/00M/00D|  16000         |       10000   |           80       |1500      |180 Days  | Five Year     |2000       | 0/7       | 6 months      | 3000       | 30 Days    | 24 Months    |  1500     | 90 Days    | Five Year      |    2000     | 0/7        | 6 months       | $43.43       | $53.61      | $97.04     | $550.20    | $550.20    | $1,100.40 | Quarterly| $34.20     | $34.20 |     |      |SYSDate- 64Y/00M/00D |10 N Montana St, Dillon, MT 59725, USA|      |       | SYSDate-64Y/00M/00D |1500        |60 Days    | Age 65        |2000        | 0/7       | 6 months      |  1500      | 90 Days    | Age 65         |    2000     | 0/7        | 6 months       | $338.59      | $322.43     | $661.02    | $455.40     | $455.40     | $910.80 |     |    | SYSDate- 54Y/00M/00D |11 Kansas Ave, Kansas City, KS, USA |     |      | SYSDate-17Y/00M/00D|       |     |SYSDate-24Y/00M/00D |  Yes       |650000    | 650000    |Male     |125458796 |5.0     |188     |No        |No              |Female    |1236789333 |  5.0     |    180   |   No       |  No              |Quarterly  |$3.99          | $3.99     | Quarterly  |$651.69    | $109.20   | $760.89|    |    | SYSDate- 17Y/00M/00D |      |       | SYSDate-54Y/00M/00D     |50000    | 100000  |100000    |50000     | 100000   |100000      |Yes        |    |     | SYSDate-00Y/01M/01D|E cigarette |Yes          |      |      |SYSDate-00Y/01M/01D|E cigarette  |Quarterly|$12.60        | $53.10      |65.70     | Quarterly|$71.52    |$235.80   |$307.32|Quarterly|$84.30   |$321.30   |$405.60| $65.70   | 