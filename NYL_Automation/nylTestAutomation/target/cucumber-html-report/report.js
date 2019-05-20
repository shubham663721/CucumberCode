$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/ama_NYL.feature");
formatter.feature({
  "line": 1,
  "name": "AMA Test",
  "description": "",
  "id": "ama-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "\u003cAMASC01\u003e Application submission for Self, Spouse and Child and with all the products and rider(s) (JET)",
  "description": "Physician performing Normal Duties",
  "id": "ama-test;\u003camasc01\u003e-application-submission-for-self,-spouse-and-child-and-with-all-the-products-and-rider(s)-(jet)",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@AmaRegression_1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Test set up for \"NYL\" feature and \"NYL_AMA\" scenario",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Customer navigate to NYL \"\u003cWebsite\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Clicks on Start Your Application Button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Eligibility page details are displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Selects I am as \"\u003cOccupation\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Selects Yes Radio Button for Actively Performing Normal Duties of your occupation Question",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Selects Yes Radio Button for Premier Accident or Hospital Income coverages for your spouse Question",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Selects Yes Radio Button for Wish to apply for apply for insurance for any children Question",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Enter details for self as \"\u003cTitle\u003e\",\"\u003cFname\u003e\",\"\u003cLname\u003e\",\"\u003cState\u003e\",\"\u003cDOB\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Enter details for Spouse as \"\u003cStitle\u003e\",\"\u003cSfname\u003e\",\"\u003cSlname\u003e\",\"\u003cSDOB\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Click on Add Child button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Add Child Screen is displayed and Enters Child details as \"\u003cCfname\u003e\",\"\u003cClname\u003e\",\"\u003cCDOB\u003e\",\"\u003cCsex\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Selects Married question as No for Child",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Selects No for full time student for Child",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Honorably Discharged question as No",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Click on Add Child button on Screen",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Verify that error message is displayed for state eligibility at top of the page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Enter New State as \"\u003cState1\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Product page details are displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Clicks on Back or Previous button",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Enters DOB for Spouse as \"\u003cSDOB1\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Product page details are displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Validates that Spouse is not displayed for following products: PAI,HII",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Clicks on Back or Previous button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Enters DOB for Spouse as \"\u003cSDOB\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Selects No Radio Button for Actively Performing Normal Duties of your occupation Question",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Product page details are displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Validates that Self is not displayed for following products: DPOSDI,OOEI",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 39,
      "value": "#The following products will be displayed: TwentyYTL, FifteenYTL, TenYTL, PureTerm, PrefTerm, PAI, HII"
    }
  ],
  "line": 40,
  "name": "Clicks on Back or Previous button",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Selects Yes Radio Button for Actively Performing Normal Duties of your occupation Question",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "Product page details are displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "Selects product TwentyYTL for Self",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Selects product TwentyYTL for Child",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "Selects product FifteenYTL for Self",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "Verify Child icon is disabled for FifteenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "Selects product TenYTL for Self",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "Verify Child icon is disabled for TenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "Selects product PureTerm for Self",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "Selects product PrefTerm for Self",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "Verify Child icon is disabled for PrefTerm",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "Selects product PAI for Child",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "Selects product DPOSDI for Self",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "Selects product OOEI for Self",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "Selects product HII for Child",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "Selects Answer as No for all additional questions of Group Disability Insurance for Self",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "Enters Monthly Income for Self as \"\u003cMonthlyIncome\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "Enters details for Monthly Expense and Percentage Responsible as \"\u003cMexpense\u003e\",\"\u003cPercresp\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "Validate error message for required question",
  "keyword": "Then "
});
formatter.step({
  "line": 66,
  "name": "Confirms Imp Replacement Info for NewYork state",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "Clicks on Back or Previous button",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Self",
  "keyword": "Then "
});
formatter.step({
  "line": 70,
  "name": "Enter additional details as \"\u003cTotalAmt\u003e\",\"\u003cIAmount\u003e\",\"\u003cCompany\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "Verify New York State paragraph is displayed for Self",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "Selects Yes for unable to work because of a disability for Self",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "Clicks on Add Company Button",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "Selects Benefit Option as \"\u003cBenPeriodOpt\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "Enters details for Company \"\u003cCompany\u003e\",\"\u003cBenAmt\u003e\",\"\u003cBenefitPeriod\u003e\" and click on add button",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "Selects Yes for replace any other company\u0027s coverage for Self",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "Enters Amount under replace any other company\u0027s coverage as \"\u003cRepAmount\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "Selects Yes for applying for any other business/office overhead insurance",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "Clicks on Add Company Button for Business or Office Overhead",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "Enters details for Company \"\u003cCompany2\u003e\",\"\u003cBenAmt1\u003e\",\"\u003cBenPeriod1\u003e\" and click on add button",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "Selects Yes for replace any other company\u0027s coverage for Self for overhead disability",
  "keyword": "And "
});
formatter.step({
  "line": 82,
  "name": "Enters Amount under replace any other company\u0027s coverage of overhead product as \"\u003cRepAmount1\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "Request Coverage page is displayed to user",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 86,
      "value": "#And Validates Quick Decision is not displayed for PureTerm"
    }
  ],
  "line": 87,
  "name": "Clicks on Back or Previous button",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "Selects No for replace any other company\u0027s coverage for Self for overhead disability",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "Request Coverage page is displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 92,
  "name": "Selects Benefit Amount for Self as \"\u003cBenefit9\u003e\" under TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "Validates under TwentyYTL the Benefit Slider Range as \"\u003cMin_Twenty\u003e\" to \"\u003cMax_Twenty\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "Selects Waiver Rider for Twenty Year Product",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "Selects AD\u0026D Rider for Self under TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 96,
  "name": "Selects Rider Benefit Amount for Self as \"\u003cRidBenefit\u003e\" for ADnD Rider under TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 97,
  "name": "Validates under ADnD Rider TwentyYTL Benefit Slider Range as \"\u003cMin_ADnD\u003e\" to \"\u003cMax_ADnD\u003e\" for Self",
  "keyword": "And "
});
formatter.step({
  "line": 98,
  "name": "Validates Benefit Amount for Child as \"\u003cCbenefit\u003e\" under TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 99,
  "name": "Selects Benefit Amount for Self as \"\u003cBenefit1\u003e\" under FifteenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 100,
  "name": "Validates under FifteenYTL the Benefit Slider Range as \"\u003cMin_Fifteen\u003e\" to \"\u003cMax_Fifteen\u003e\" for self",
  "keyword": "And "
});
formatter.step({
  "line": 101,
  "name": "Selects Waiver of Premium Rider for Self under FifteenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 102,
  "name": "Selects AD\u0026D Rider for Self under FifteenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 103,
  "name": "Selects Rider Benefit Amount for Self as \"\u003cRidBenefit1\u003e\" for ADnD Rider under FifteenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 104,
  "name": "Validates under ADnD Rider FifteenYTL Benefit Slider Range as \"\u003cMin_ADnD1\u003e\" to \"\u003cMax_ADnD1\u003e\" for Self",
  "keyword": "And "
});
formatter.step({
  "line": 105,
  "name": "Selects Benefit Amount for Self as \"\u003cBenefit2\u003e\" under TenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 106,
  "name": "Validates under TenYTL the Benefit Slider Range as \"\u003cMin_Ten\u003e\" to \"\u003cMax_Ten\u003e\" for self",
  "keyword": "And "
});
formatter.step({
  "line": 107,
  "name": "Selects Waiver of Premium Rider for TenYear for Self",
  "keyword": "And "
});
formatter.step({
  "line": 108,
  "name": "Selects AD\u0026D Rider for Self under TenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 109,
  "name": "Selects Rider Benefit Amount for Self as \"\u003cRidBenefit2\u003e\" for ADnD Rider under TenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 110,
  "name": "Validates under ADnD Rider the Benefit Slider Range as \"\u003cMin_ADnD2\u003e\" to \"\u003cMax_ADnD2\u003e\" for Self",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 111,
      "value": "#And Validates Quick Decision is available for Self under PureTerm"
    }
  ],
  "line": 112,
  "name": "Selects Benefit Amount for Self as \"\u003cBenefit3\u003e\" under PureTerm",
  "keyword": "And "
});
formatter.step({
  "line": 113,
  "name": "Validates under PureTerm the Benefit Slider Range as \"\u003cMin_Pure\u003e\" to \"\u003cMax_Pure\u003e\" for Self",
  "keyword": "And "
});
formatter.step({
  "line": 114,
  "name": "Selects Waiver of Premium Rider for Self under PureTerm",
  "keyword": "And "
});
formatter.step({
  "line": 115,
  "name": "Selects Benefit Amount for Self as \"\u003cBenefit4\u003e\" under PrefTerm",
  "keyword": "And "
});
formatter.step({
  "line": 116,
  "name": "Validates under PrefTerm the Benefit Slider Range as \"\u003cMin_Pref\u003e\" to \"\u003cMax_Pref\u003e\" for Self",
  "keyword": "And "
});
formatter.step({
  "line": 117,
  "name": "Selects Waiver of Premium Rider for Self under PrefTerm",
  "keyword": "And "
});
formatter.step({
  "line": 118,
  "name": "Selects AD\u0026D Rider for Self under PrefTerm",
  "keyword": "And "
});
formatter.step({
  "line": 119,
  "name": "Selects Rider Benefit Amount for Self as \"\u003cRidBenefit3\u003e\" for ADnD Rider under PrefTerm",
  "keyword": "And "
});
formatter.step({
  "line": 120,
  "name": "Validates under ADnD Rider PrefTerm Benefit Slider Range as \"\u003cMin_ADnD3\u003e\" to \"\u003cMax_ADnD3\u003e\" for Self",
  "keyword": "And "
});
formatter.step({
  "line": 121,
  "name": "Selects Benefit Amount for Self as \"\u003cBenefit5\u003e\" under PAI",
  "keyword": "And "
});
formatter.step({
  "line": 122,
  "name": "Validates under PAI the Benefit Amount listed for Self are: \"\u003cPAI_amount1\u003e\",\"\u003cPAI_amount2\u003e\",\"\u003cPAI_amount3\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 123,
  "name": "Validates Benefit Amount for Spouse as \"\u003cSbenefit\u003e\" under PAI",
  "keyword": "And "
});
formatter.step({
  "line": 124,
  "name": "Validates Benefit Amount for Child as \"\u003cCbenefit1\u003e\" under PAI",
  "keyword": "And "
});
formatter.step({
  "line": 125,
  "name": "Selects Benefit Amount for Self as \"\u003cBenefit6\u003e\" under DPOSDI",
  "keyword": "And "
});
formatter.step({
  "line": 126,
  "name": "Validates under DPOSDI the Benefit Slider Range as \"\u003cMin_DPOSDI\u003e\" to \"\u003cMax_DPOSDI\u003e\" for Self",
  "keyword": "And "
});
formatter.step({
  "line": 127,
  "name": "Selects Wait Period for Self as \"\u003cWaitPeriod\u003e\" under DPOSDI",
  "keyword": "And "
});
formatter.step({
  "line": 128,
  "name": "Validates Benefit Period for Self as \"\u003cBenPeriod\u003e\" under DPOSDI",
  "keyword": "And "
});
formatter.step({
  "line": 129,
  "name": "Selects Cost of Living Adjustment Rider under DPOSDI",
  "keyword": "And "
});
formatter.step({
  "line": 130,
  "name": "Selects Benefit Amount for Self as \"\u003cBenefit7\u003e\" under OOEI",
  "keyword": "And "
});
formatter.step({
  "line": 131,
  "name": "Validates under OOEI the Benefit Slider Range as \"\u003cMin_OOEI\u003e\" to \"\u003cMax_OOEI\u003e\" for Self",
  "keyword": "And "
});
formatter.step({
  "line": 132,
  "name": "Selects Wait Period for Self as \"\u003cWaitPeriod1\u003e\" under OOEI",
  "keyword": "And "
});
formatter.step({
  "line": 133,
  "name": "Validates Benefit Duration for Self as \"\u003cBenDur\u003e\" under OOEI",
  "keyword": "And "
});
formatter.step({
  "line": 134,
  "name": "Selects Benefit Amount for Self as \"\u003cBenefit8\u003e\" under HII",
  "keyword": "And "
});
formatter.step({
  "line": 135,
  "name": "Validates under HII the Benefit Amount listed for Self are: \"\u003cHII_amount1\u003e\",\"\u003cHII_amount2\u003e\",\"\u003cHII_amount3\u003e\",\"\u003cHII_amount4\u003e\",\"\u003cHII_amount5\u003e\",\"\u003cHII_amount6\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 136,
  "name": "Validates Benefit Amount for Spouse as \"\u003cSbenefit1\u003e\" under HII",
  "keyword": "And "
});
formatter.step({
  "line": 137,
  "name": "Validates Benefit Amount for Child as \"\u003cCbenefit2\u003e\" under HII",
  "keyword": "And "
});
formatter.step({
  "line": 138,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 139,
  "name": "Validate Max Aggregate error message",
  "keyword": "And "
});
formatter.step({
  "line": 140,
  "name": "Selects Benefit Amount for Self as \"\u003cBenefit10\u003e\" under TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 141,
  "name": "Validate Max Aggregate error message",
  "keyword": "And "
});
formatter.step({
  "line": 142,
  "name": "Selects Benefit Amount for Self as \"\u003cBenefit\u003e\" under TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 143,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 145,
  "name": "Beneficiary Page is displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 146,
  "name": "Clicks on Add Beneficiary Button for Self under TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 147,
  "name": "Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons",
  "keyword": "Then "
});
formatter.step({
  "line": 148,
  "name": "User Enters Beneficiary details as \"\u003cTrust\u003e\",\"\u003cDateTrust\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 149,
  "name": "Clicks on OK button",
  "keyword": "And "
});
formatter.step({
  "line": 150,
  "name": "Verify that the Percent Displayed for Trust is \"\u003cTrustPercent\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 151,
  "name": "Clicks on Add Beneficiary Button for Self under TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 152,
  "name": "Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons",
  "keyword": "Then "
});
formatter.step({
  "line": 153,
  "name": "User Enters Beneficiary details as \"\u003cTrust1\u003e\",\"\u003cDatetrust\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 154,
  "name": "Clicks on OK button",
  "keyword": "And "
});
formatter.step({
  "line": 155,
  "name": "Validates error message on Add Beneficiary page-Only one Trust is allowed as Primary",
  "keyword": "And "
});
formatter.step({
  "line": 156,
  "name": "Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons",
  "keyword": "And "
});
formatter.step({
  "line": 157,
  "name": "User Enters Beneficiary details as \"\u003cTrust1\u003e\",\"\u003cDatetrust\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 158,
  "name": "Clicks on OK button",
  "keyword": "And "
});
formatter.step({
  "line": 159,
  "name": "Delete Contingent Beneficiary",
  "keyword": "And "
});
formatter.step({
  "line": 160,
  "name": "Delete box is displayed and clicks on Yes",
  "keyword": "And "
});
formatter.step({
  "line": 161,
  "name": "Clicks on Add Beneficiary Button for Self under TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 162,
  "name": "Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons",
  "keyword": "Then "
});
formatter.step({
  "line": 163,
  "name": "User Enters Beneficiary details as name and relationship\"\u003cBname\u003e\",\"\u003cBlname\u003e\",\"\u003cRelationship\u003e\",\"\u003cPerc\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 164,
  "name": "Clicks on OK button",
  "keyword": "And "
});
formatter.step({
  "line": 165,
  "name": "Clicks on Add Beneficiary Button for Self under TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 166,
  "name": "Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons",
  "keyword": "Then "
});
formatter.step({
  "line": 167,
  "name": "User Enters Beneficiary details as name and relationship\"\u003cBname1\u003e\",\"\u003cBlname1\u003e\",\"\u003cRelationship1\u003e\",\"\u003cPerc1\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 168,
  "name": "Clicks on OK button",
  "keyword": "And "
});
formatter.step({
  "line": 169,
  "name": "Clicks on Add Beneficiary Button for Self under TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 170,
  "name": "Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons",
  "keyword": "Then "
});
formatter.step({
  "line": 171,
  "name": "User Enters Beneficiary details as name and relationship\"\u003cBname2\u003e\",\"\u003cBlname2\u003e\",\"\u003cRelationship2\u003e\",\"\u003cPerc2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 172,
  "name": "Clicks on OK button",
  "keyword": "And "
});
formatter.step({
  "line": 173,
  "name": "Clicks on Add Beneficiary Button for Self under TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 174,
  "name": "Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons",
  "keyword": "Then "
});
formatter.step({
  "line": 175,
  "name": "User Enters Beneficiary details as name and relationship\"\u003cBname3\u003e\",\"\u003cBlname3\u003e\",\"\u003cRelationship3\u003e\",\"\u003cPerc3\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 176,
  "name": "Clicks on OK button",
  "keyword": "And "
});
formatter.step({
  "line": 177,
  "name": "Clicks on Add Beneficiary Button for Self under FifteenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 178,
  "name": "Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons",
  "keyword": "Then "
});
formatter.step({
  "line": 179,
  "name": "User Enters Beneficiary details as name and relationship\"\u003cBname4\u003e\",\"\u003cBlname4\u003e\",\"\u003cRelationship4\u003e\",\"\u003cPerc4\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 180,
  "name": "Clicks on OK button",
  "keyword": "And "
});
formatter.step({
  "line": 181,
  "name": "Clicks on Add Beneficiary Button for Self under FifteenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 182,
  "name": "Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons",
  "keyword": "Then "
});
formatter.step({
  "line": 183,
  "name": "Selects the First Option from Existing Beneficiaries List and select Type as \"\u003cBeneType\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 184,
  "name": "Enters Percentage for First Option as \"\u003cPerc5\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 185,
  "name": "Selects the Second Option from Existing Beneficiaries List and select Type as \"\u003cBeneType\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 186,
  "name": "Enters Percentage Second Option as \"\u003cPerc6\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 187,
  "name": "Selects the Third Option from Existing Beneficiaries List and select Type as \"\u003cBeneType\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 188,
  "name": "Enters Percentage Third Option as \"\u003cPerc7\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 189,
  "name": "Clicks on OK button",
  "keyword": "And "
});
formatter.step({
  "line": 190,
  "name": "Clicks on Add Beneficiary Button for Self under FifteenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 191,
  "name": "Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons",
  "keyword": "Then "
});
formatter.step({
  "line": 192,
  "name": "Selects the First Option from Existing Beneficiaries List and select Type as \"\u003cBeneType1\u003e\" for Trust",
  "keyword": "And "
});
formatter.step({
  "line": 193,
  "name": "Clicks on OK button",
  "keyword": "And "
});
formatter.step({
  "line": 194,
  "name": "Verify that the Percent Displayed for Trust is \"\u003cTrustPercent\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 195,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 197,
  "name": "Contact Details page is displayed to user and validate details",
  "keyword": "Then "
});
formatter.step({
  "line": 198,
  "name": "Validate the Travel Question for Non QD application",
  "keyword": "And "
});
formatter.step({
  "line": 199,
  "name": "Selects Yes for Travel Question Non QD for Self",
  "keyword": "And "
});
formatter.step({
  "line": 200,
  "name": "Enter details for Outside US country and How Long months for Self as \"\u003cCountry\u003e\",\"\u003cMonths\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 201,
  "name": "Validate the Travel Question for QD application",
  "keyword": "And "
});
formatter.step({
  "line": 202,
  "name": "Selects No for Travel Question QD for Self",
  "keyword": "And "
});
formatter.step({
  "line": 203,
  "name": "Select DrivingLicense Question as Yes and Enters details for driving info for Self as \"\u003cDrivingLicenseNo\u003e\",\"\u003cDrivingLicenseState\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 204,
  "name": "Enters WeightTwelveMonths ago details for Self as \"\u003cWeight12mnths\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 205,
  "name": "Enters contact Details for Self as \"\u003cSSN\u003e\",\"\u003cMstatus\u003e\",\"\u003cHeight\u003e\",\"\u003cWeight\u003e\",\"\u003cSex\u003e\",\"\u003cStreet\u003e\",\"\u003cCity\u003e\",\"\u003cZipcode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 206,
  "name": "Selects \"\u003cPhoneType\u003e\" and enter phonenumber \"\u003cPhoneNum\u003e\" for Self at contact page",
  "keyword": "And "
});
formatter.step({
  "line": 207,
  "name": "Selects Yes Radio button for Tobacco Question Self",
  "keyword": "And "
});
formatter.step({
  "line": 208,
  "name": "Enters Last Used Tobacco Date Details for Self as \"\u003cTobDate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 209,
  "name": "Clicks on Products used textbox and Selects Product as \"\u003cProduct\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 210,
  "name": "Selects Residential Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 211,
  "name": "Selects Yes Radio Button for Business Address",
  "keyword": "And "
});
formatter.step({
  "line": 212,
  "name": "Enters Business Address Details as \"\u003cBusinessName\u003e\",\"\u003cBusinessType\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 213,
  "name": "Enters Physician details  for Self as \"\u003cPFname\u003e\",\"\u003cPLname\u003e\",\"\u003cPStreet\u003e\",\"\u003cPState\u003e\",\"\u003cPCity\u003e\",\"\u003cPZipcode\u003e\",\"\u003cPPhoneNum\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 214,
  "name": "Enters contact Details for Spouse as \"\u003cSSSN\u003e\",\"\u003cSSex\u003e\",\"\u003cSPhoneType\u003e\",\"\u003cSPhoneNum\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 215,
  "name": "Enters Physician details  for Spouse as \"\u003cPFname1\u003e\",\"\u003cPLname1\u003e\",\"\u003cPStreet1\u003e\",\"\u003cPState1\u003e\",\"\u003cPCity1\u003e\",\"\u003cPZipcode1\u003e\",\"\u003cPPhoneNum1\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 216,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 218,
  "name": "Application Summary Page is displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 219,
  "name": "Validates Benefit Amount for Self as \"\u003cBenefit\u003e\" under TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 220,
  "name": "Validates Waiver of Premium Rider",
  "keyword": "And "
});
formatter.step({
  "line": 221,
  "name": "Validates Rider ADnD and Rider Benefit Amount for Self as \"\u003cRidBenefit\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 222,
  "name": "Validates Benefit Amount for Self as \"\u003cBenefit1\u003e\" under FifteenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 223,
  "name": "Validates Rider ADnD and Rider Benefit Amount for Self as \"\u003cRidBenefit1\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 224,
  "name": "Validates Waiver of Premium Rider",
  "keyword": "And "
});
formatter.step({
  "line": 225,
  "name": "Validates Benefit Amount for Self as \"\u003cBenefit2\u003e\" under TenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 226,
  "name": "Validates Rider ADnD and Rider Benefit Amount for Self as \"\u003cRidBenefit2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 227,
  "name": "Validates Waiver of Premium Rider",
  "keyword": "And "
});
formatter.step({
  "line": 228,
  "name": "Validates Benefit Amount for Self as \"\u003cBenefit3\u003e\" under PureTerm",
  "keyword": "And "
});
formatter.step({
  "line": 229,
  "name": "Validates Quick Decision under PureTerm",
  "keyword": "And "
});
formatter.step({
  "line": 230,
  "name": "Validates Waiver of Premium Rider",
  "keyword": "And "
});
formatter.step({
  "line": 231,
  "name": "Validates Benefit Amount for Self as \"\u003cBenefit4\u003e\" under PrefTerm",
  "keyword": "And "
});
formatter.step({
  "line": 232,
  "name": "Validates Rider ADnD and Rider Benefit Amount for Self as \"\u003cRidBenefit3\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 233,
  "name": "Validates Waiver of Premium Rider",
  "keyword": "And "
});
formatter.step({
  "line": 234,
  "name": "Validates Benefit Amount for Self as \"\u003cBenefit5\u003e\" under PAI",
  "keyword": "And "
});
formatter.step({
  "line": 235,
  "name": "Validates Benefit Amount for Self as \"\u003cBenefit6\u003e\" under DPOSDI",
  "keyword": "And "
});
formatter.step({
  "line": 236,
  "name": "Validates Cost of Living Adjustment Rider",
  "keyword": "And "
});
formatter.step({
  "line": 237,
  "name": "Validates Benefit Amount for Self as \"\u003cBenefit7\u003e\" under OOEI",
  "keyword": "And "
});
formatter.step({
  "line": 238,
  "name": "Validates Benefit Amount for Self as \"\u003cBenefit8\u003e\" under HII",
  "keyword": "And "
});
formatter.step({
  "line": 239,
  "name": "Validates Benefit Amount for Spouse as \"\u003cSbenefit\u003e\" under PAI",
  "keyword": "And "
});
formatter.step({
  "line": 240,
  "name": "Validates Benefit Amount for Spouse as \"\u003cSbenefit1\u003e\" under HII",
  "keyword": "And "
});
formatter.step({
  "line": 241,
  "name": "Validates Benefit Amount for Child as \"\u003cCbenefit\u003e\" under TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 242,
  "name": "Validates Benefit Amount for Child as \"\u003cCbenefit1\u003e\" under PAI",
  "keyword": "And "
});
formatter.step({
  "line": 243,
  "name": "Validates Benefit Amount for Child as \"\u003cCbenefit2\u003e\" under HII",
  "keyword": "And "
});
formatter.step({
  "line": 244,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 245,
  "name": "Save Information page will be displayed to user and user will enter Login details as  \"\u003cPassword\u003e\",\"\u003cVpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 246,
  "name": "Clicks on next and OK Button",
  "keyword": "And "
});
formatter.step({
  "line": 248,
  "name": "Authorize page details are displayed to user and confirm the term and conditions for Self",
  "keyword": "Then "
});
formatter.step({
  "line": 249,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 251,
  "name": "Statement of Health page one is displayed to user and answers as No for all questions for Self",
  "keyword": "Then "
});
formatter.step({
  "line": 252,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 253,
  "name": "Statement of Health page two is displayed to user and answers as No for all questions for Self",
  "keyword": "Then "
});
formatter.step({
  "line": 254,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 255,
  "name": "Almost done page is displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 256,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 257,
  "name": "Review and sign page details are displayed to user and Click on continue and attached the sign",
  "keyword": "Then "
});
formatter.step({
  "line": 258,
  "name": "Clicks on next button to finish",
  "keyword": "And "
});
formatter.step({
  "line": 259,
  "name": "Review and sign page details are displayed to user and Click on continue and attached the sign",
  "keyword": "Then "
});
formatter.step({
  "line": 260,
  "name": "Clicks on next button to finish",
  "keyword": "And "
});
formatter.step({
  "line": 261,
  "name": "Your Insurance Request Decision Page is displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 262,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 264,
  "name": "Payment Information Page is displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 265,
  "name": "user Selects Payment option as Bank for TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 266,
  "name": "User enters Details for Bank Account as \"\u003cBank\u003e\",\"\u003cAccName\u003e\",\"\u003cRnum\u003e\",\"\u003cAnum\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 267,
  "name": "Clicks on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 268,
  "name": "Selects Frequency for TwentyYTL as \"\u003cFrequency\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 269,
  "name": "Selects Payment Method for FifteenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 270,
  "name": "Selects Radio Button for existing payment method",
  "keyword": "And "
});
formatter.step({
  "line": 271,
  "name": "Clicks on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 272,
  "name": "Selects Frequency for FifteenYTL as \"\u003cFrequency\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 273,
  "name": "Selects Payment Method for TenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 274,
  "name": "Selects Radio Button for existing payment method",
  "keyword": "And "
});
formatter.step({
  "line": 275,
  "name": "Clicks on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 276,
  "name": "Selects Frequency for TenYTL as \"\u003cFrequency\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 277,
  "name": "Selects Payment Method for PureTerm",
  "keyword": "And "
});
formatter.step({
  "line": 278,
  "name": "Selects Radio Button for existing payment method",
  "keyword": "And "
});
formatter.step({
  "line": 279,
  "name": "Clicks on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 280,
  "name": "Selects Frequency for PureTerm as \"\u003cFrequency\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 281,
  "name": "Selects Payment Method for PrefTerm",
  "keyword": "And "
});
formatter.step({
  "line": 282,
  "name": "Selects Radio Button for existing payment method",
  "keyword": "And "
});
formatter.step({
  "line": 283,
  "name": "Clicks on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 284,
  "name": "Selects Frequency for PrefTerm as \"\u003cFrequency\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 285,
  "name": "Selects Payment Method for PAI",
  "keyword": "And "
});
formatter.step({
  "line": 286,
  "name": "Selects Radio Button for existing payment method",
  "keyword": "And "
});
formatter.step({
  "line": 287,
  "name": "Clicks on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 288,
  "name": "Selects Frequency for PAI as \"\u003cFrequency\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 289,
  "name": "Selects Payment Method for DPOSDI",
  "keyword": "And "
});
formatter.step({
  "line": 290,
  "name": "Selects Radio Button for existing payment method",
  "keyword": "And "
});
formatter.step({
  "line": 291,
  "name": "Clicks on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 292,
  "name": "Selects Frequency for DPOSDI as \"\u003cFrequency\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 293,
  "name": "Selects Payment Method for OOEI",
  "keyword": "And "
});
formatter.step({
  "line": 294,
  "name": "Selects Radio Button for existing payment method",
  "keyword": "And "
});
formatter.step({
  "line": 295,
  "name": "Clicks on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 296,
  "name": "Selects Frequency for OOEI as \"\u003cFrequency\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 297,
  "name": "Selects Payment Method for HII",
  "keyword": "And "
});
formatter.step({
  "line": 298,
  "name": "Selects Radio Button for existing payment method",
  "keyword": "And "
});
formatter.step({
  "line": 299,
  "name": "Clicks on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 300,
  "name": "Selects Frequency for HII as \"\u003cFrequency\u003e\" and reviews",
  "keyword": "And "
});
formatter.step({
  "line": 301,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 303,
  "name": "Payment Authorization Letter is displayed to user and clicks on Continue",
  "keyword": "Then "
});
formatter.step({
  "line": 304,
  "name": "Signs Payment Authorization Letter",
  "keyword": "And "
});
formatter.step({
  "line": 305,
  "name": "Clicks on next button to finish",
  "keyword": "And "
});
formatter.step({
  "line": 307,
  "name": "Thank you page is displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 308,
  "name": "Verify that two Confirmation numbers are generated for \"\u003cWebsite\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 311,
  "name": "",
  "description": "",
  "id": "ama-test;\u003camasc01\u003e-application-submission-for-self,-spouse-and-child-and-with-all-the-products-and-rider(s)-(jet);",
  "rows": [
    {
      "cells": [
        "Website",
        "Occupation",
        "Title",
        "Fname",
        "Lname",
        "State",
        "DOB",
        "Stitle",
        "Sfname",
        "Slname",
        "SDOB",
        "Cfname",
        "Clname",
        "CDOB",
        "Csex",
        "State1",
        "SDOB1",
        "MonthlyIncome",
        "Mexpense",
        "Percresp",
        "Benefit",
        "RidBenefit",
        "Cbenefit",
        "Benefit1",
        "RidBenefit1",
        "Benefit2",
        "RidBenefit2",
        "Benefit3",
        "Benefit4",
        "RidBenefit3",
        "Benefit5",
        "Sbenefit",
        "Cbenefit1",
        "Benefit6",
        "WaitPeriod",
        "BenPeriod",
        "Benefit7",
        "WaitPeriod1",
        "BenDur",
        "Benefit8",
        "Sbenefit1",
        "Cbenefit2",
        "Benefit9",
        "Benefit10",
        "Trust",
        "Datetrust",
        "TrustPercent",
        "Trust1",
        "Bname",
        "Blname",
        "Relationship",
        "Perc",
        "Bname1",
        "Blname1",
        "Relationship1",
        "Perc1",
        "Bname2",
        "Blname2",
        "Relationship2",
        "Perc2",
        "Bname3",
        "Blname3",
        "Relationship3",
        "Perc3",
        "Bname4",
        "Blname4",
        "Relationship4",
        "Perc4",
        "Perc5",
        "Perc6",
        "Perc7",
        "Country",
        "Months",
        "SSN",
        "Mstatus",
        "Height",
        "Weight",
        "Sex",
        "Weight12mnths",
        "Street",
        "City",
        "Zipcode",
        "DrivingLicenseNo",
        "DrivingLicenseState",
        "PhoneType",
        "PhoneNum",
        "BusinessName",
        "BusinessType",
        "SSSN",
        "SSex",
        "SPhoneType",
        "SPhoneNum",
        "Password",
        "Vpassword",
        "TotalAmt",
        "IAmount",
        "Company",
        "Company1",
        "BenAmt",
        "BenPeriodOpt",
        "BenefitPeriod",
        "RepAmount",
        "Company2",
        "BenAmt1",
        "BenPeriod1",
        "RepAmount1",
        "Min_Twenty",
        "Max_Twenty",
        "Min_Fifteen",
        "Max_Fifteen",
        "Min_Ten",
        "Max_Ten",
        "Min_ADnD",
        "Max_ADnD",
        "Min_ADnD1",
        "Max_ADnD1",
        "Min_ADnD2",
        "Max_ADnD2",
        "Min_Pure",
        "Max_Pure",
        "Min_Pref",
        "Max_Pref",
        "Min_ADnD3",
        "Max_ADnD3",
        "PAI_amount1",
        "PAI_amount2",
        "PAI_amount3",
        "Min_DPOSDI",
        "Max_DPOSDI",
        "Min_OOEI",
        "Max_OOEI",
        "HII_amount1",
        "HII_amount2",
        "HII_amount3",
        "HII_amount4",
        "HII_amount5",
        "HII_amount6",
        "Benefit9",
        "TobDate",
        "Product",
        "Bank",
        "AccName",
        "Rnum",
        "Anum",
        "Frequency",
        "BeneType",
        "BeneType1",
        "PFname",
        "PLname",
        "PStreet",
        "PState",
        "PCity",
        "PZipcode",
        "PPhoneNum",
        "PFname1",
        "PLname1",
        "PStreet1",
        "PState1",
        "PCity1",
        "PZipcode1",
        "PPhoneNum1"
      ],
      "line": 312,
      "id": "ama-test;\u003camasc01\u003e-application-submission-for-self,-spouse-and-child-and-with-all-the-products-and-rider(s)-(jet);;1"
    },
    {
      "cells": [
        "ama",
        "Physician",
        "Mr.",
        "Jack",
        "Snmmmmtestcasejm",
        "Manitoba",
        "02/06/1977",
        "Mrs.",
        "Thalia",
        "Snmmmmtestcasegt",
        "05/20/1978",
        "John",
        "Gill",
        "SYSDATE  - 00Y/06M/00D",
        "Male",
        "New York",
        "SYSDATE - 16Y/11M/30D",
        "10000",
        "5000",
        "100",
        "$1,750,000",
        "$250,000",
        "$25,000",
        "$500,000",
        "$150,000",
        "$500,000",
        "$150,000",
        "$500,000",
        "$750,000",
        "$200,000",
        "$750,000",
        "$300,000",
        "$75,000",
        "$1,500",
        "60 days",
        "To age 67 plan",
        "$5,000",
        "60 days",
        "12 months",
        "$500",
        "$500",
        "$500",
        "$1,775,000",
        "$150,000",
        "kennedy",
        "SYSDATE - 50Y/02M/04D",
        "100",
        "arthur",
        "John",
        "Adams",
        "Son",
        "25",
        "Samantha",
        "Jonas",
        "Other",
        "25",
        "Rihanna",
        "Jones",
        "Daughter",
        "35",
        "Jake",
        "Charles",
        "Father",
        "15",
        "Carter",
        "Jonas",
        "Father",
        "50",
        "15",
        "15",
        "20",
        "India",
        "6",
        "745878574",
        "Married",
        "5.5",
        "220",
        "Male",
        "200",
        "60 Warren Street #5",
        "Manhattan",
        "10001",
        "2043310",
        "District of Columbia",
        "Mobile",
        "7480235985",
        "Arthur Corp",
        "Sole Proprietary",
        "985802145",
        "Female",
        "Home",
        "9870326599",
        "Adam@123",
        "Adam@123",
        "125000",
        "65000",
        "ace",
        "lux corp",
        "100000",
        "Through Age",
        "70",
        "95000",
        "wayne enterprise",
        "94000",
        "24",
        "68000",
        "100000",
        "4000000",
        "100000",
        "4000000",
        "100000",
        "4000000",
        "25000",
        "1000000",
        "25000",
        "1000000",
        "25000",
        "1000000",
        "100000",
        "1000000",
        "25000",
        "3000000",
        "25000",
        "1000000",
        "500000",
        "750000",
        "1000000",
        "100",
        "6600",
        "1000",
        "20000",
        "100",
        "200",
        "300",
        "400",
        "500",
        "600",
        "2000000",
        "SYSDATE - 00Y/06M/00D",
        "Cigar",
        "Bank of America",
        "Jack",
        "748596789",
        "789456789452",
        "Monthly",
        "Primary",
        "Contingent",
        "Alan",
        "Harper",
        "2302 S Rouse Ave",
        "Kansas",
        "Pittsburg",
        "66762",
        "9878547854",
        "Judith",
        "Harper",
        "2302 S Rouse Ave",
        "Kansas",
        "Pittsburg",
        "66762",
        "7878410257"
      ],
      "line": 313,
      "id": "ama-test;\u003camasc01\u003e-application-submission-for-self,-spouse-and-child-and-with-all-the-products-and-rider(s)-(jet);;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 564793727,
  "status": "passed"
});
formatter.scenario({
  "line": 313,
  "name": "\u003cAMASC01\u003e Application submission for Self, Spouse and Child and with all the products and rider(s) (JET)",
  "description": "Physician performing Normal Duties",
  "id": "ama-test;\u003camasc01\u003e-application-submission-for-self,-spouse-and-child-and-with-all-the-products-and-rider(s)-(jet);;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@AmaRegression_1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Test set up for \"NYL\" feature and \"NYL_AMA\" scenario",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Customer navigate to NYL \"ama\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Clicks on Start Your Application Button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Eligibility page details are displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Selects I am as \"Physician\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Selects Yes Radio Button for Actively Performing Normal Duties of your occupation Question",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Selects Yes Radio Button for Premier Accident or Hospital Income coverages for your spouse Question",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Selects Yes Radio Button for Wish to apply for apply for insurance for any children Question",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Enter details for self as \"Mr.\",\"Jack\",\"Snmmmmtestcasejm\",\"Manitoba\",\"02/06/1977\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Enter details for Spouse as \"Mrs.\",\"Thalia\",\"Snmmmmtestcasegt\",\"05/20/1978\"",
  "matchedColumns": [
    7,
    8,
    9,
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Click on Add Child button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Add Child Screen is displayed and Enters Child details as \"John\",\"Gill\",\"SYSDATE  - 00Y/06M/00D\",\"Male\"",
  "matchedColumns": [
    11,
    12,
    13,
    14
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Selects Married question as No for Child",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Selects No for full time student for Child",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Honorably Discharged question as No",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Click on Add Child button on Screen",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Verify that error message is displayed for state eligibility at top of the page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Enter New State as \"New York\"",
  "matchedColumns": [
    15
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Product page details are displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Clicks on Back or Previous button",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Enters DOB for Spouse as \"SYSDATE - 16Y/11M/30D\"",
  "matchedColumns": [
    16
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Product page details are displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Validates that Spouse is not displayed for following products: PAI,HII",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Clicks on Back or Previous button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Enters DOB for Spouse as \"05/20/1978\"",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Selects No Radio Button for Actively Performing Normal Duties of your occupation Question",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Product page details are displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Validates that Self is not displayed for following products: DPOSDI,OOEI",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 39,
      "value": "#The following products will be displayed: TwentyYTL, FifteenYTL, TenYTL, PureTerm, PrefTerm, PAI, HII"
    }
  ],
  "line": 40,
  "name": "Clicks on Back or Previous button",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Selects Yes Radio Button for Actively Performing Normal Duties of your occupation Question",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "Product page details are displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "Selects product TwentyYTL for Self",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Selects product TwentyYTL for Child",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "Selects product FifteenYTL for Self",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "Verify Child icon is disabled for FifteenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "Selects product TenYTL for Self",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "Verify Child icon is disabled for TenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "Selects product PureTerm for Self",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "Selects product PrefTerm for Self",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "Verify Child icon is disabled for PrefTerm",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "Selects product PAI for Child",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "Selects product DPOSDI for Self",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "Selects product OOEI for Self",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "Selects product HII for Child",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "Product: Additional Questions page details are displayed to user and selects Answer as No for all for Self",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "Selects Answer as No for all additional questions of Group Disability Insurance for Self",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "Enters Monthly Income for Self as \"10000\"",
  "matchedColumns": [
    17
  ],
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "Enters details for Monthly Expense and Percentage Responsible as \"5000\",\"100\"",
  "matchedColumns": [
    18,
    19
  ],
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "Validate error message for required question",
  "keyword": "Then "
});
formatter.step({
  "line": 66,
  "name": "Confirms Imp Replacement Info for NewYork state",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "Clicks on Back or Previous button",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "Product: Additional Questions page details are displayed to user and selects Answer as Yes for all questions for Self",
  "keyword": "Then "
});
formatter.step({
  "line": 70,
  "name": "Enter additional details as \"125000\",\"65000\",\"ace\"",
  "matchedColumns": [
    96,
    94,
    95
  ],
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "Verify New York State paragraph is displayed for Self",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "Selects Yes for unable to work because of a disability for Self",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "Clicks on Add Company Button",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "Selects Benefit Option as \"Through Age\"",
  "matchedColumns": [
    99
  ],
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "Enters details for Company \"ace\",\"100000\",\"70\" and click on add button",
  "matchedColumns": [
    96,
    98,
    100
  ],
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "Selects Yes for replace any other company\u0027s coverage for Self",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "Enters Amount under replace any other company\u0027s coverage as \"95000\"",
  "matchedColumns": [
    101
  ],
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "Selects Yes for applying for any other business/office overhead insurance",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "Clicks on Add Company Button for Business or Office Overhead",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "Enters details for Company \"wayne enterprise\",\"94000\",\"24\" and click on add button",
  "matchedColumns": [
    102,
    103,
    104
  ],
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "Selects Yes for replace any other company\u0027s coverage for Self for overhead disability",
  "keyword": "And "
});
formatter.step({
  "line": 82,
  "name": "Enters Amount under replace any other company\u0027s coverage of overhead product as \"68000\"",
  "matchedColumns": [
    105
  ],
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "Request Coverage page is displayed to user",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 86,
      "value": "#And Validates Quick Decision is not displayed for PureTerm"
    }
  ],
  "line": 87,
  "name": "Clicks on Back or Previous button",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "Selects No for replace any other company\u0027s coverage for Self for overhead disability",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "Request Coverage page is displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 92,
  "name": "Selects Benefit Amount for Self as \"$1,775,000\" under TwentyYTL",
  "matchedColumns": [
    42
  ],
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "Validates under TwentyYTL the Benefit Slider Range as \"100000\" to \"4000000\"",
  "matchedColumns": [
    106,
    107
  ],
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "Selects Waiver Rider for Twenty Year Product",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "Selects AD\u0026D Rider for Self under TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 96,
  "name": "Selects Rider Benefit Amount for Self as \"$250,000\" for ADnD Rider under TwentyYTL",
  "matchedColumns": [
    21
  ],
  "keyword": "And "
});
formatter.step({
  "line": 97,
  "name": "Validates under ADnD Rider TwentyYTL Benefit Slider Range as \"25000\" to \"1000000\" for Self",
  "matchedColumns": [
    112,
    113
  ],
  "keyword": "And "
});
formatter.step({
  "line": 98,
  "name": "Validates Benefit Amount for Child as \"$25,000\" under TwentyYTL",
  "matchedColumns": [
    22
  ],
  "keyword": "And "
});
formatter.step({
  "line": 99,
  "name": "Selects Benefit Amount for Self as \"$500,000\" under FifteenYTL",
  "matchedColumns": [
    23
  ],
  "keyword": "And "
});
formatter.step({
  "line": 100,
  "name": "Validates under FifteenYTL the Benefit Slider Range as \"100000\" to \"4000000\" for self",
  "matchedColumns": [
    108,
    109
  ],
  "keyword": "And "
});
formatter.step({
  "line": 101,
  "name": "Selects Waiver of Premium Rider for Self under FifteenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 102,
  "name": "Selects AD\u0026D Rider for Self under FifteenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 103,
  "name": "Selects Rider Benefit Amount for Self as \"$150,000\" for ADnD Rider under FifteenYTL",
  "matchedColumns": [
    24
  ],
  "keyword": "And "
});
formatter.step({
  "line": 104,
  "name": "Validates under ADnD Rider FifteenYTL Benefit Slider Range as \"25000\" to \"1000000\" for Self",
  "matchedColumns": [
    114,
    115
  ],
  "keyword": "And "
});
formatter.step({
  "line": 105,
  "name": "Selects Benefit Amount for Self as \"$500,000\" under TenYTL",
  "matchedColumns": [
    25
  ],
  "keyword": "And "
});
formatter.step({
  "line": 106,
  "name": "Validates under TenYTL the Benefit Slider Range as \"100000\" to \"4000000\" for self",
  "matchedColumns": [
    110,
    111
  ],
  "keyword": "And "
});
formatter.step({
  "line": 107,
  "name": "Selects Waiver of Premium Rider for TenYear for Self",
  "keyword": "And "
});
formatter.step({
  "line": 108,
  "name": "Selects AD\u0026D Rider for Self under TenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 109,
  "name": "Selects Rider Benefit Amount for Self as \"$150,000\" for ADnD Rider under TenYTL",
  "matchedColumns": [
    26
  ],
  "keyword": "And "
});
formatter.step({
  "line": 110,
  "name": "Validates under ADnD Rider the Benefit Slider Range as \"25000\" to \"1000000\" for Self",
  "matchedColumns": [
    116,
    117
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 111,
      "value": "#And Validates Quick Decision is available for Self under PureTerm"
    }
  ],
  "line": 112,
  "name": "Selects Benefit Amount for Self as \"$500,000\" under PureTerm",
  "matchedColumns": [
    27
  ],
  "keyword": "And "
});
formatter.step({
  "line": 113,
  "name": "Validates under PureTerm the Benefit Slider Range as \"100000\" to \"1000000\" for Self",
  "matchedColumns": [
    118,
    119
  ],
  "keyword": "And "
});
formatter.step({
  "line": 114,
  "name": "Selects Waiver of Premium Rider for Self under PureTerm",
  "keyword": "And "
});
formatter.step({
  "line": 115,
  "name": "Selects Benefit Amount for Self as \"$750,000\" under PrefTerm",
  "matchedColumns": [
    28
  ],
  "keyword": "And "
});
formatter.step({
  "line": 116,
  "name": "Validates under PrefTerm the Benefit Slider Range as \"25000\" to \"3000000\" for Self",
  "matchedColumns": [
    120,
    121
  ],
  "keyword": "And "
});
formatter.step({
  "line": 117,
  "name": "Selects Waiver of Premium Rider for Self under PrefTerm",
  "keyword": "And "
});
formatter.step({
  "line": 118,
  "name": "Selects AD\u0026D Rider for Self under PrefTerm",
  "keyword": "And "
});
formatter.step({
  "line": 119,
  "name": "Selects Rider Benefit Amount for Self as \"$200,000\" for ADnD Rider under PrefTerm",
  "matchedColumns": [
    29
  ],
  "keyword": "And "
});
formatter.step({
  "line": 120,
  "name": "Validates under ADnD Rider PrefTerm Benefit Slider Range as \"25000\" to \"1000000\" for Self",
  "matchedColumns": [
    122,
    123
  ],
  "keyword": "And "
});
formatter.step({
  "line": 121,
  "name": "Selects Benefit Amount for Self as \"$750,000\" under PAI",
  "matchedColumns": [
    30
  ],
  "keyword": "And "
});
formatter.step({
  "line": 122,
  "name": "Validates under PAI the Benefit Amount listed for Self are: \"500000\",\"750000\",\"1000000\"",
  "matchedColumns": [
    124,
    125,
    126
  ],
  "keyword": "And "
});
formatter.step({
  "line": 123,
  "name": "Validates Benefit Amount for Spouse as \"$300,000\" under PAI",
  "matchedColumns": [
    31
  ],
  "keyword": "And "
});
formatter.step({
  "line": 124,
  "name": "Validates Benefit Amount for Child as \"$75,000\" under PAI",
  "matchedColumns": [
    32
  ],
  "keyword": "And "
});
formatter.step({
  "line": 125,
  "name": "Selects Benefit Amount for Self as \"$1,500\" under DPOSDI",
  "matchedColumns": [
    33
  ],
  "keyword": "And "
});
formatter.step({
  "line": 126,
  "name": "Validates under DPOSDI the Benefit Slider Range as \"100\" to \"6600\" for Self",
  "matchedColumns": [
    128,
    127
  ],
  "keyword": "And "
});
formatter.step({
  "line": 127,
  "name": "Selects Wait Period for Self as \"60 days\" under DPOSDI",
  "matchedColumns": [
    34
  ],
  "keyword": "And "
});
formatter.step({
  "line": 128,
  "name": "Validates Benefit Period for Self as \"To age 67 plan\" under DPOSDI",
  "matchedColumns": [
    35
  ],
  "keyword": "And "
});
formatter.step({
  "line": 129,
  "name": "Selects Cost of Living Adjustment Rider under DPOSDI",
  "keyword": "And "
});
formatter.step({
  "line": 130,
  "name": "Selects Benefit Amount for Self as \"$5,000\" under OOEI",
  "matchedColumns": [
    36
  ],
  "keyword": "And "
});
formatter.step({
  "line": 131,
  "name": "Validates under OOEI the Benefit Slider Range as \"1000\" to \"20000\" for Self",
  "matchedColumns": [
    129,
    130
  ],
  "keyword": "And "
});
formatter.step({
  "line": 132,
  "name": "Selects Wait Period for Self as \"60 days\" under OOEI",
  "matchedColumns": [
    37
  ],
  "keyword": "And "
});
formatter.step({
  "line": 133,
  "name": "Validates Benefit Duration for Self as \"12 months\" under OOEI",
  "matchedColumns": [
    38
  ],
  "keyword": "And "
});
formatter.step({
  "line": 134,
  "name": "Selects Benefit Amount for Self as \"$500\" under HII",
  "matchedColumns": [
    39
  ],
  "keyword": "And "
});
formatter.step({
  "line": 135,
  "name": "Validates under HII the Benefit Amount listed for Self are: \"100\",\"200\",\"300\",\"400\",\"500\",\"600\"",
  "matchedColumns": [
    131,
    132,
    133,
    134,
    135,
    136
  ],
  "keyword": "And "
});
formatter.step({
  "line": 136,
  "name": "Validates Benefit Amount for Spouse as \"$500\" under HII",
  "matchedColumns": [
    40
  ],
  "keyword": "And "
});
formatter.step({
  "line": 137,
  "name": "Validates Benefit Amount for Child as \"$500\" under HII",
  "matchedColumns": [
    41
  ],
  "keyword": "And "
});
formatter.step({
  "line": 138,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 139,
  "name": "Validate Max Aggregate error message",
  "keyword": "And "
});
formatter.step({
  "line": 140,
  "name": "Selects Benefit Amount for Self as \"$150,000\" under TwentyYTL",
  "matchedColumns": [
    43
  ],
  "keyword": "And "
});
formatter.step({
  "line": 141,
  "name": "Validate Max Aggregate error message",
  "keyword": "And "
});
formatter.step({
  "line": 142,
  "name": "Selects Benefit Amount for Self as \"$1,750,000\" under TwentyYTL",
  "matchedColumns": [
    20
  ],
  "keyword": "And "
});
formatter.step({
  "line": 143,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 145,
  "name": "Beneficiary Page is displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 146,
  "name": "Clicks on Add Beneficiary Button for Self under TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 147,
  "name": "Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons",
  "keyword": "Then "
});
formatter.step({
  "line": 148,
  "name": "User Enters Beneficiary details as \"kennedy\",\"\u003cDateTrust\u003e\"",
  "matchedColumns": [
    44
  ],
  "keyword": "And "
});
formatter.step({
  "line": 149,
  "name": "Clicks on OK button",
  "keyword": "And "
});
formatter.step({
  "line": 150,
  "name": "Verify that the Percent Displayed for Trust is \"100\"",
  "matchedColumns": [
    46
  ],
  "keyword": "And "
});
formatter.step({
  "line": 151,
  "name": "Clicks on Add Beneficiary Button for Self under TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 152,
  "name": "Add Beneficiary page will be displayed to user and user will select Trust and Primary Radio Buttons",
  "keyword": "Then "
});
formatter.step({
  "line": 153,
  "name": "User Enters Beneficiary details as \"arthur\",\"SYSDATE - 50Y/02M/04D\"",
  "matchedColumns": [
    45,
    47
  ],
  "keyword": "And "
});
formatter.step({
  "line": 154,
  "name": "Clicks on OK button",
  "keyword": "And "
});
formatter.step({
  "line": 155,
  "name": "Validates error message on Add Beneficiary page-Only one Trust is allowed as Primary",
  "keyword": "And "
});
formatter.step({
  "line": 156,
  "name": "Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons",
  "keyword": "And "
});
formatter.step({
  "line": 157,
  "name": "User Enters Beneficiary details as \"arthur\",\"SYSDATE - 50Y/02M/04D\"",
  "matchedColumns": [
    45,
    47
  ],
  "keyword": "And "
});
formatter.step({
  "line": 158,
  "name": "Clicks on OK button",
  "keyword": "And "
});
formatter.step({
  "line": 159,
  "name": "Delete Contingent Beneficiary",
  "keyword": "And "
});
formatter.step({
  "line": 160,
  "name": "Delete box is displayed and clicks on Yes",
  "keyword": "And "
});
formatter.step({
  "line": 161,
  "name": "Clicks on Add Beneficiary Button for Self under TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 162,
  "name": "Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons",
  "keyword": "Then "
});
formatter.step({
  "line": 163,
  "name": "User Enters Beneficiary details as name and relationship\"John\",\"Adams\",\"Son\",\"25\"",
  "matchedColumns": [
    48,
    49,
    50,
    51
  ],
  "keyword": "And "
});
formatter.step({
  "line": 164,
  "name": "Clicks on OK button",
  "keyword": "And "
});
formatter.step({
  "line": 165,
  "name": "Clicks on Add Beneficiary Button for Self under TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 166,
  "name": "Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons",
  "keyword": "Then "
});
formatter.step({
  "line": 167,
  "name": "User Enters Beneficiary details as name and relationship\"Samantha\",\"Jonas\",\"Other\",\"25\"",
  "matchedColumns": [
    52,
    53,
    54,
    55
  ],
  "keyword": "And "
});
formatter.step({
  "line": 168,
  "name": "Clicks on OK button",
  "keyword": "And "
});
formatter.step({
  "line": 169,
  "name": "Clicks on Add Beneficiary Button for Self under TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 170,
  "name": "Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons",
  "keyword": "Then "
});
formatter.step({
  "line": 171,
  "name": "User Enters Beneficiary details as name and relationship\"Rihanna\",\"Jones\",\"Daughter\",\"35\"",
  "matchedColumns": [
    56,
    57,
    58,
    59
  ],
  "keyword": "And "
});
formatter.step({
  "line": 172,
  "name": "Clicks on OK button",
  "keyword": "And "
});
formatter.step({
  "line": 173,
  "name": "Clicks on Add Beneficiary Button for Self under TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 174,
  "name": "Add Beneficiary page will be displayed to user, and user will select Individual and Contingent Radio Buttons",
  "keyword": "Then "
});
formatter.step({
  "line": 175,
  "name": "User Enters Beneficiary details as name and relationship\"Jake\",\"Charles\",\"Father\",\"15\"",
  "matchedColumns": [
    60,
    61,
    62,
    63
  ],
  "keyword": "And "
});
formatter.step({
  "line": 176,
  "name": "Clicks on OK button",
  "keyword": "And "
});
formatter.step({
  "line": 177,
  "name": "Clicks on Add Beneficiary Button for Self under FifteenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 178,
  "name": "Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons",
  "keyword": "Then "
});
formatter.step({
  "line": 179,
  "name": "User Enters Beneficiary details as name and relationship\"Carter\",\"Jonas\",\"Father\",\"50\"",
  "matchedColumns": [
    64,
    65,
    66,
    67
  ],
  "keyword": "And "
});
formatter.step({
  "line": 180,
  "name": "Clicks on OK button",
  "keyword": "And "
});
formatter.step({
  "line": 181,
  "name": "Clicks on Add Beneficiary Button for Self under FifteenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 182,
  "name": "Add Beneficiary page will be displayed to user and user will select Individual and Primary Radio buttons",
  "keyword": "Then "
});
formatter.step({
  "line": 183,
  "name": "Selects the First Option from Existing Beneficiaries List and select Type as \"Primary\"",
  "matchedColumns": [
    145
  ],
  "keyword": "And "
});
formatter.step({
  "line": 184,
  "name": "Enters Percentage for First Option as \"15\"",
  "matchedColumns": [
    68
  ],
  "keyword": "And "
});
formatter.step({
  "line": 185,
  "name": "Selects the Second Option from Existing Beneficiaries List and select Type as \"Primary\"",
  "matchedColumns": [
    145
  ],
  "keyword": "And "
});
formatter.step({
  "line": 186,
  "name": "Enters Percentage Second Option as \"15\"",
  "matchedColumns": [
    69
  ],
  "keyword": "And "
});
formatter.step({
  "line": 187,
  "name": "Selects the Third Option from Existing Beneficiaries List and select Type as \"Primary\"",
  "matchedColumns": [
    145
  ],
  "keyword": "And "
});
formatter.step({
  "line": 188,
  "name": "Enters Percentage Third Option as \"20\"",
  "matchedColumns": [
    70
  ],
  "keyword": "And "
});
formatter.step({
  "line": 189,
  "name": "Clicks on OK button",
  "keyword": "And "
});
formatter.step({
  "line": 190,
  "name": "Clicks on Add Beneficiary Button for Self under FifteenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 191,
  "name": "Add Beneficiary page will be displayed to user, and user will select Contingent and Trust Radio buttons",
  "keyword": "Then "
});
formatter.step({
  "line": 192,
  "name": "Selects the First Option from Existing Beneficiaries List and select Type as \"Contingent\" for Trust",
  "matchedColumns": [
    146
  ],
  "keyword": "And "
});
formatter.step({
  "line": 193,
  "name": "Clicks on OK button",
  "keyword": "And "
});
formatter.step({
  "line": 194,
  "name": "Verify that the Percent Displayed for Trust is \"100\"",
  "matchedColumns": [
    46
  ],
  "keyword": "And "
});
formatter.step({
  "line": 195,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 197,
  "name": "Contact Details page is displayed to user and validate details",
  "keyword": "Then "
});
formatter.step({
  "line": 198,
  "name": "Validate the Travel Question for Non QD application",
  "keyword": "And "
});
formatter.step({
  "line": 199,
  "name": "Selects Yes for Travel Question Non QD for Self",
  "keyword": "And "
});
formatter.step({
  "line": 200,
  "name": "Enter details for Outside US country and How Long months for Self as \"India\",\"6\"",
  "matchedColumns": [
    71,
    72
  ],
  "keyword": "And "
});
formatter.step({
  "line": 201,
  "name": "Validate the Travel Question for QD application",
  "keyword": "And "
});
formatter.step({
  "line": 202,
  "name": "Selects No for Travel Question QD for Self",
  "keyword": "And "
});
formatter.step({
  "line": 203,
  "name": "Select DrivingLicense Question as Yes and Enters details for driving info for Self as \"2043310\",\"District of Columbia\"",
  "matchedColumns": [
    82,
    83
  ],
  "keyword": "And "
});
formatter.step({
  "line": 204,
  "name": "Enters WeightTwelveMonths ago details for Self as \"200\"",
  "matchedColumns": [
    78
  ],
  "keyword": "And "
});
formatter.step({
  "line": 205,
  "name": "Enters contact Details for Self as \"745878574\",\"Married\",\"5.5\",\"220\",\"Male\",\"60 Warren Street #5\",\"Manhattan\",\"10001\"",
  "matchedColumns": [
    80,
    81,
    73,
    74,
    75,
    76,
    77,
    79
  ],
  "keyword": "And "
});
formatter.step({
  "line": 206,
  "name": "Selects \"Mobile\" and enter phonenumber \"7480235985\" for Self at contact page",
  "matchedColumns": [
    84,
    85
  ],
  "keyword": "And "
});
formatter.step({
  "line": 207,
  "name": "Selects Yes Radio button for Tobacco Question Self",
  "keyword": "And "
});
formatter.step({
  "line": 208,
  "name": "Enters Last Used Tobacco Date Details for Self as \"SYSDATE - 00Y/06M/00D\"",
  "matchedColumns": [
    138
  ],
  "keyword": "And "
});
formatter.step({
  "line": 209,
  "name": "Clicks on Products used textbox and Selects Product as \"Cigar\"",
  "matchedColumns": [
    139
  ],
  "keyword": "And "
});
formatter.step({
  "line": 210,
  "name": "Selects Residential Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 211,
  "name": "Selects Yes Radio Button for Business Address",
  "keyword": "And "
});
formatter.step({
  "line": 212,
  "name": "Enters Business Address Details as \"Arthur Corp\",\"Sole Proprietary\"",
  "matchedColumns": [
    86,
    87
  ],
  "keyword": "And "
});
formatter.step({
  "line": 213,
  "name": "Enters Physician details  for Self as \"Alan\",\"Harper\",\"2302 S Rouse Ave\",\"Kansas\",\"Pittsburg\",\"66762\",\"9878547854\"",
  "matchedColumns": [
    147,
    148,
    149,
    150,
    151,
    152,
    153
  ],
  "keyword": "And "
});
formatter.step({
  "line": 214,
  "name": "Enters contact Details for Spouse as \"985802145\",\"Female\",\"Home\",\"9870326599\"",
  "matchedColumns": [
    88,
    89,
    90,
    91
  ],
  "keyword": "And "
});
formatter.step({
  "line": 215,
  "name": "Enters Physician details  for Spouse as \"Judith\",\"Harper\",\"2302 S Rouse Ave\",\"Kansas\",\"Pittsburg\",\"66762\",\"7878410257\"",
  "matchedColumns": [
    160,
    154,
    155,
    156,
    157,
    158,
    159
  ],
  "keyword": "And "
});
formatter.step({
  "line": 216,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 218,
  "name": "Application Summary Page is displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 219,
  "name": "Validates Benefit Amount for Self as \"$1,750,000\" under TwentyYTL",
  "matchedColumns": [
    20
  ],
  "keyword": "And "
});
formatter.step({
  "line": 220,
  "name": "Validates Waiver of Premium Rider",
  "keyword": "And "
});
formatter.step({
  "line": 221,
  "name": "Validates Rider ADnD and Rider Benefit Amount for Self as \"$250,000\"",
  "matchedColumns": [
    21
  ],
  "keyword": "And "
});
formatter.step({
  "line": 222,
  "name": "Validates Benefit Amount for Self as \"$500,000\" under FifteenYTL",
  "matchedColumns": [
    23
  ],
  "keyword": "And "
});
formatter.step({
  "line": 223,
  "name": "Validates Rider ADnD and Rider Benefit Amount for Self as \"$150,000\"",
  "matchedColumns": [
    24
  ],
  "keyword": "And "
});
formatter.step({
  "line": 224,
  "name": "Validates Waiver of Premium Rider",
  "keyword": "And "
});
formatter.step({
  "line": 225,
  "name": "Validates Benefit Amount for Self as \"$500,000\" under TenYTL",
  "matchedColumns": [
    25
  ],
  "keyword": "And "
});
formatter.step({
  "line": 226,
  "name": "Validates Rider ADnD and Rider Benefit Amount for Self as \"$150,000\"",
  "matchedColumns": [
    26
  ],
  "keyword": "And "
});
formatter.step({
  "line": 227,
  "name": "Validates Waiver of Premium Rider",
  "keyword": "And "
});
formatter.step({
  "line": 228,
  "name": "Validates Benefit Amount for Self as \"$500,000\" under PureTerm",
  "matchedColumns": [
    27
  ],
  "keyword": "And "
});
formatter.step({
  "line": 229,
  "name": "Validates Quick Decision under PureTerm",
  "keyword": "And "
});
formatter.step({
  "line": 230,
  "name": "Validates Waiver of Premium Rider",
  "keyword": "And "
});
formatter.step({
  "line": 231,
  "name": "Validates Benefit Amount for Self as \"$750,000\" under PrefTerm",
  "matchedColumns": [
    28
  ],
  "keyword": "And "
});
formatter.step({
  "line": 232,
  "name": "Validates Rider ADnD and Rider Benefit Amount for Self as \"$200,000\"",
  "matchedColumns": [
    29
  ],
  "keyword": "And "
});
formatter.step({
  "line": 233,
  "name": "Validates Waiver of Premium Rider",
  "keyword": "And "
});
formatter.step({
  "line": 234,
  "name": "Validates Benefit Amount for Self as \"$750,000\" under PAI",
  "matchedColumns": [
    30
  ],
  "keyword": "And "
});
formatter.step({
  "line": 235,
  "name": "Validates Benefit Amount for Self as \"$1,500\" under DPOSDI",
  "matchedColumns": [
    33
  ],
  "keyword": "And "
});
formatter.step({
  "line": 236,
  "name": "Validates Cost of Living Adjustment Rider",
  "keyword": "And "
});
formatter.step({
  "line": 237,
  "name": "Validates Benefit Amount for Self as \"$5,000\" under OOEI",
  "matchedColumns": [
    36
  ],
  "keyword": "And "
});
formatter.step({
  "line": 238,
  "name": "Validates Benefit Amount for Self as \"$500\" under HII",
  "matchedColumns": [
    39
  ],
  "keyword": "And "
});
formatter.step({
  "line": 239,
  "name": "Validates Benefit Amount for Spouse as \"$300,000\" under PAI",
  "matchedColumns": [
    31
  ],
  "keyword": "And "
});
formatter.step({
  "line": 240,
  "name": "Validates Benefit Amount for Spouse as \"$500\" under HII",
  "matchedColumns": [
    40
  ],
  "keyword": "And "
});
formatter.step({
  "line": 241,
  "name": "Validates Benefit Amount for Child as \"$25,000\" under TwentyYTL",
  "matchedColumns": [
    22
  ],
  "keyword": "And "
});
formatter.step({
  "line": 242,
  "name": "Validates Benefit Amount for Child as \"$75,000\" under PAI",
  "matchedColumns": [
    32
  ],
  "keyword": "And "
});
formatter.step({
  "line": 243,
  "name": "Validates Benefit Amount for Child as \"$500\" under HII",
  "matchedColumns": [
    41
  ],
  "keyword": "And "
});
formatter.step({
  "line": 244,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 245,
  "name": "Save Information page will be displayed to user and user will enter Login details as  \"Adam@123\",\"Adam@123\"",
  "matchedColumns": [
    92,
    93
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 246,
  "name": "Clicks on next and OK Button",
  "keyword": "And "
});
formatter.step({
  "line": 248,
  "name": "Authorize page details are displayed to user and confirm the term and conditions for Self",
  "keyword": "Then "
});
formatter.step({
  "line": 249,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 251,
  "name": "Statement of Health page one is displayed to user and answers as No for all questions for Self",
  "keyword": "Then "
});
formatter.step({
  "line": 252,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 253,
  "name": "Statement of Health page two is displayed to user and answers as No for all questions for Self",
  "keyword": "Then "
});
formatter.step({
  "line": 254,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 255,
  "name": "Almost done page is displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 256,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 257,
  "name": "Review and sign page details are displayed to user and Click on continue and attached the sign",
  "keyword": "Then "
});
formatter.step({
  "line": 258,
  "name": "Clicks on next button to finish",
  "keyword": "And "
});
formatter.step({
  "line": 259,
  "name": "Review and sign page details are displayed to user and Click on continue and attached the sign",
  "keyword": "Then "
});
formatter.step({
  "line": 260,
  "name": "Clicks on next button to finish",
  "keyword": "And "
});
formatter.step({
  "line": 261,
  "name": "Your Insurance Request Decision Page is displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 262,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 264,
  "name": "Payment Information Page is displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 265,
  "name": "user Selects Payment option as Bank for TwentyYTL",
  "keyword": "And "
});
formatter.step({
  "line": 266,
  "name": "User enters Details for Bank Account as \"Bank of America\",\"Jack\",\"748596789\",\"789456789452\"",
  "matchedColumns": [
    140,
    141,
    142,
    143
  ],
  "keyword": "And "
});
formatter.step({
  "line": 267,
  "name": "Clicks on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 268,
  "name": "Selects Frequency for TwentyYTL as \"Monthly\"",
  "matchedColumns": [
    144
  ],
  "keyword": "And "
});
formatter.step({
  "line": 269,
  "name": "Selects Payment Method for FifteenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 270,
  "name": "Selects Radio Button for existing payment method",
  "keyword": "And "
});
formatter.step({
  "line": 271,
  "name": "Clicks on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 272,
  "name": "Selects Frequency for FifteenYTL as \"Monthly\"",
  "matchedColumns": [
    144
  ],
  "keyword": "And "
});
formatter.step({
  "line": 273,
  "name": "Selects Payment Method for TenYTL",
  "keyword": "And "
});
formatter.step({
  "line": 274,
  "name": "Selects Radio Button for existing payment method",
  "keyword": "And "
});
formatter.step({
  "line": 275,
  "name": "Clicks on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 276,
  "name": "Selects Frequency for TenYTL as \"Monthly\"",
  "matchedColumns": [
    144
  ],
  "keyword": "And "
});
formatter.step({
  "line": 277,
  "name": "Selects Payment Method for PureTerm",
  "keyword": "And "
});
formatter.step({
  "line": 278,
  "name": "Selects Radio Button for existing payment method",
  "keyword": "And "
});
formatter.step({
  "line": 279,
  "name": "Clicks on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 280,
  "name": "Selects Frequency for PureTerm as \"Monthly\"",
  "matchedColumns": [
    144
  ],
  "keyword": "And "
});
formatter.step({
  "line": 281,
  "name": "Selects Payment Method for PrefTerm",
  "keyword": "And "
});
formatter.step({
  "line": 282,
  "name": "Selects Radio Button for existing payment method",
  "keyword": "And "
});
formatter.step({
  "line": 283,
  "name": "Clicks on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 284,
  "name": "Selects Frequency for PrefTerm as \"Monthly\"",
  "matchedColumns": [
    144
  ],
  "keyword": "And "
});
formatter.step({
  "line": 285,
  "name": "Selects Payment Method for PAI",
  "keyword": "And "
});
formatter.step({
  "line": 286,
  "name": "Selects Radio Button for existing payment method",
  "keyword": "And "
});
formatter.step({
  "line": 287,
  "name": "Clicks on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 288,
  "name": "Selects Frequency for PAI as \"Monthly\"",
  "matchedColumns": [
    144
  ],
  "keyword": "And "
});
formatter.step({
  "line": 289,
  "name": "Selects Payment Method for DPOSDI",
  "keyword": "And "
});
formatter.step({
  "line": 290,
  "name": "Selects Radio Button for existing payment method",
  "keyword": "And "
});
formatter.step({
  "line": 291,
  "name": "Clicks on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 292,
  "name": "Selects Frequency for DPOSDI as \"Monthly\"",
  "matchedColumns": [
    144
  ],
  "keyword": "And "
});
formatter.step({
  "line": 293,
  "name": "Selects Payment Method for OOEI",
  "keyword": "And "
});
formatter.step({
  "line": 294,
  "name": "Selects Radio Button for existing payment method",
  "keyword": "And "
});
formatter.step({
  "line": 295,
  "name": "Clicks on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 296,
  "name": "Selects Frequency for OOEI as \"Monthly\"",
  "matchedColumns": [
    144
  ],
  "keyword": "And "
});
formatter.step({
  "line": 297,
  "name": "Selects Payment Method for HII",
  "keyword": "And "
});
formatter.step({
  "line": 298,
  "name": "Selects Radio Button for existing payment method",
  "keyword": "And "
});
formatter.step({
  "line": 299,
  "name": "Clicks on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 300,
  "name": "Selects Frequency for HII as \"Monthly\" and reviews",
  "matchedColumns": [
    144
  ],
  "keyword": "And "
});
formatter.step({
  "line": 301,
  "name": "Clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 303,
  "name": "Payment Authorization Letter is displayed to user and clicks on Continue",
  "keyword": "Then "
});
formatter.step({
  "line": 304,
  "name": "Signs Payment Authorization Letter",
  "keyword": "And "
});
formatter.step({
  "line": 305,
  "name": "Clicks on next button to finish",
  "keyword": "And "
});
formatter.step({
  "line": 307,
  "name": "Thank you page is displayed to user",
  "keyword": "Then "
});
formatter.step({
  "line": 308,
  "name": "Verify that two Confirmation numbers are generated for \"ama\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "NYL",
      "offset": 17
    },
    {
      "val": "NYL_AMA",
      "offset": 35
    }
  ],
  "location": "CommonPageStepDef.test_set_up_for_feature_and_scenario(String,String)"
});
formatter.result({
  "duration": 4871098577,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ama",
      "offset": 26
    }
  ],
  "location": "NYL_StepDef.customer_navigate_to_NYL(String)"
});
formatter.result({
  "duration": 71790827449,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Start_Your_Application_Button()"
});
formatter.result({
  "duration": 116094541,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.eligibility_page_details_are_displayed_to_user()"
});
formatter.result({
  "duration": 1436984053,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Physician",
      "offset": 17
    }
  ],
  "location": "NYL_StepDef.selects_I_am_as(String)"
});
formatter.result({
  "duration": 930183555,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.selects_Yes_Radio_Button_for_Actively_Performing_Normal_Duties_of_your_occupation_Question()"
});
formatter.result({
  "duration": 727356553,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.selects_Yes_Radio_Button_for_Premier_Accident_or_Hospital_Income_coverages_for_your_spouse_Question()"
});
formatter.result({
  "duration": 736609478,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.selects_Yes_Radio_Button_for_Wish_to_apply_for_apply_for_insurance_for_any_children_Question()"
});
formatter.result({
  "duration": 736781707,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mr.",
      "offset": 27
    },
    {
      "val": "Jack",
      "offset": 33
    },
    {
      "val": "Snmmmmtestcasejm",
      "offset": 40
    },
    {
      "val": "Manitoba",
      "offset": 59
    },
    {
      "val": "02/06/1977",
      "offset": 70
    }
  ],
  "location": "NYL_StepDef.enter_details_for_self_as(String,String,String,String,String)"
});
formatter.result({
  "duration": 4468383060,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mrs.",
      "offset": 29
    },
    {
      "val": "Thalia",
      "offset": 36
    },
    {
      "val": "Snmmmmtestcasegt",
      "offset": 45
    },
    {
      "val": "05/20/1978",
      "offset": 64
    }
  ],
  "location": "NYL_StepDef.enter_etails_for_Spouse_as(String,String,String,String)"
});
formatter.result({
  "duration": 3044166119,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.click_on_Add_Child_button()"
});
formatter.result({
  "duration": 1172083877,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John",
      "offset": 59
    },
    {
      "val": "Gill",
      "offset": 66
    },
    {
      "val": "SYSDATE  - 00Y/06M/00D",
      "offset": 73
    },
    {
      "val": "Male",
      "offset": 98
    }
  ],
  "location": "NYL_StepDef.add_Child_Screen_is_displayed_and_Enters_Child_details_as(String,String,String,String)"
});
formatter.result({
  "duration": 7780969315,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.selects_Married_question_as_No_for_Child()"
});
formatter.result({
  "duration": 153333956,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.selects_No_for_full_time_student()"
});
formatter.result({
  "duration": 91128642,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.honorably_Discharged_question_as_No()"
});
formatter.result({
  "duration": 94031847,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.click_on_Add_Child_button_on_Screen()"
});
formatter.result({
  "duration": 1091650462,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button()"
});
formatter.result({
  "duration": 9630399049,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.verify_the_error_message_is_displayed_for_state_validation_at_top_of_the_page()"
});
formatter.result({
  "duration": 1622897285,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 20
    }
  ],
  "location": "NYL_StepDef.enter_New_State_as(String)"
});
formatter.result({
  "duration": 1654986813,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button()"
});
formatter.result({
  "duration": 9640230884,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.product_page_details_are_displayed_to_user()"
});
formatter.result({
  "duration": 2046938148,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Back_or_Previous_Button()"
});
formatter.result({
  "duration": 5096001422,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SYSDATE - 16Y/11M/30D",
      "offset": 26
    }
  ],
  "location": "NYL_StepDef.enters_DOB_for_Spouse_as(String)"
});
formatter.result({
  "duration": 8680316415,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button()"
});
formatter.result({
  "duration": 9608958884,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.product_page_details_are_displayed_to_user()"
});
formatter.result({
  "duration": 2046861495,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.validates_that_Spouse_is_not_displayed_for_following_products_PAI_HII()"
});
formatter.result({
  "duration": 90775785432,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Back_or_Previous_Button()"
});
formatter.result({
  "duration": 5095893016,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "05/20/1978",
      "offset": 26
    }
  ],
  "location": "NYL_StepDef.enters_DOB_for_Spouse_as(String)"
});
formatter.result({
  "duration": 7555338424,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.selects_No_Radio_Button_for_Actively_Performing_Normal_Duties_of_your_occupation_Question()"
});
formatter.result({
  "duration": 691451356,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button()"
});
formatter.result({
  "duration": 9574427673,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.product_page_details_are_displayed_to_user()"
});
formatter.result({
  "duration": 2054951469,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.validates_that_Self_is_not_displayed_for_following_products_DPOSDI_OOEI()"
});
formatter.result({
  "duration": 90981728279,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Back_or_Previous_Button()"
});
formatter.result({
  "duration": 5112079381,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.selects_Yes_Radio_Button_for_Actively_Performing_Normal_Duties_of_your_occupation_Question()"
});
formatter.result({
  "duration": 724567526,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button()"
});
formatter.result({
  "duration": 9623769979,
  "status": "passed"
});
formatter.match({
  "location": "NYL_StepDef.product_page_details_are_displayed_to_user()"
});
formatter.result({
  "duration": 47341050304,
  "error_message": "org.openqa.selenium.NoSuchElementException: Timed out after 10 seconds. Unable to locate the element\r\n\tat org.openqa.selenium.support.pagefactory.AjaxElementLocator.findElement(AjaxElementLocator.java:123)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy34.isDisplayed(Unknown Source)\r\n\tat Page.Nyl_ProductPage.product_page_details_are_displayed_to_user(Nyl_ProductPage.java:886)\r\n\tat StepDef.NYL_StepDef.product_page_details_are_displayed_to_user(NYL_StepDef.java:805)\r\n\tat ✽.Then Product page details are displayed to user(src/main/resources/Feature/ama_NYL.feature:44)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//label[contains(text(),\u0027Select Product(s)\u0027)]\"}\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.42.591088 (7b2b2dca23cca0862f674758c9a3933e685c27d5),platform\u003dWindows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027IND-MHP3DW10928\u0027, ip: \u0027172.17.220.235\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_65\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.42.591088 (7b2b2dca23cca0..., userDataDir: C:\\Users\\MAYURI~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:62756}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: 3c6bcd33b855dd0c5a83010025fe8c46\n*** Element info: {Using\u003dxpath, value\u003d//label[contains(text(),\u0027Select Product(s)\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.AjaxElementLocator.access$001(AjaxElementLocator.java:39)\r\n\tat org.openqa.selenium.support.pagefactory.AjaxElementLocator$SlowLoadingElement.isLoaded(AjaxElementLocator.java:194)\r\n\tat org.openqa.selenium.support.ui.SlowLoadableComponent.get(SlowLoadableComponent.java:78)\r\n\tat org.openqa.selenium.support.pagefactory.AjaxElementLocator.findElement(AjaxElementLocator.java:119)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy34.isDisplayed(Unknown Source)\r\n\tat Page.Nyl_ProductPage.product_page_details_are_displayed_to_user(Nyl_ProductPage.java:886)\r\n\tat StepDef.NYL_StepDef.product_page_details_are_displayed_to_user(NYL_StepDef.java:805)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedExecutionUnitRunner.run(ExtendedExecutionUnitRunner.java:32)\r\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedExamplesRunner.runChild(ExtendedExamplesRunner.java:102)\r\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedExamplesRunner.runChild(ExtendedExamplesRunner.java:19)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedExamplesRunner.run(ExtendedExamplesRunner.java:87)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedScenarioOutlineRunner.runChild(ExtendedScenarioOutlineRunner.java:69)\r\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedScenarioOutlineRunner.runChild(ExtendedScenarioOutlineRunner.java:17)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedScenarioOutlineRunner.run(ExtendedScenarioOutlineRunner.java:64)\r\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedFeatureRunner.runChild(ExtendedFeatureRunner.java:99)\r\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedFeatureRunner.runChild(ExtendedFeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedCucumber.runChild(ExtendedCucumber.java:107)\r\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedCucumber.runChild(ExtendedCucumber.java:31)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedCucumber.run(ExtendedCucumber.java:147)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:115)\r\n\tat org.junit.vintage.engine.execution.RunnerExecutor.execute(RunnerExecutor.java:42)\r\n\tat java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(Unknown Source)\r\n\tat java.util.Iterator.forEachRemaining(Unknown Source)\r\n\tat java.util.Spliterators$IteratorSpliterator.forEachRemaining(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyInto(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)\r\n\tat java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)\r\n\tat java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.evaluate(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.forEach(Unknown Source)\r\n\tat org.junit.vintage.engine.VintageTestEngine.executeAllChildren(VintageTestEngine.java:83)\r\n\tat org.junit.vintage.engine.VintageTestEngine.execute(VintageTestEngine.java:74)\r\n\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:170)\r\n\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:154)\r\n\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:90)\r\n\tat org.eclipse.jdt.internal.junit5.runner.JUnit5TestReference.run(JUnit5TestReference.java:82)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:539)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:761)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:461)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:207)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "NYL_StepDef.selects_product_TwentyYTL_for_Self()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_product_TwentyYTL_for_Child()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_product_FifteenYTL_for_Self()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.verify_Child_icon_is_disabled_for_FifteenYTL()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_product_TenYTL_for_Self()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.verify_Child_icon_is_disabled_for_TenYTL()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_product_PureTerm_for_Self()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_product_PrefTerm_for_Self()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.verify_Child_icon_is_disabled_for_PrefTerm()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_product_PAI_for_Child()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_product_DPOSDI_for_Self()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_product_OOEI_for_Self()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_product_HII_for_Child()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_No_for_all_for_Self()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_Answer_as_No_for_all_additional_questions_of_Group_Disability_Insuranse_for_Self()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "10000",
      "offset": 35
    }
  ],
  "location": "NYL_StepDef.enters_Monthly_Income_for_Self_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "5000",
      "offset": 66
    },
    {
      "val": "100",
      "offset": 73
    }
  ],
  "location": "NYL_StepDef.enters_details_for_Monthly_Expense_and_Percentage_Responsible_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.validate_error_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.confirms_Imp_Replacement_Info_for_NewYork_state()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Back_or_Previous_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.product_Additional_Questions_page_details_are_displayed_to_user_and_selects_Answer_as_Yes_for_all_questions_for_Self()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "125000",
      "offset": 29
    },
    {
      "val": "65000",
      "offset": 38
    },
    {
      "val": "ace",
      "offset": 46
    }
  ],
  "location": "NYL_StepDef.enter_additional_details_as(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.verify_New_York_State_paragraph_is_displayed_for_Self()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_Yes_for_unable_to_work_because_of_a_disability_for_Self()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Add_Company_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Through Age",
      "offset": 27
    }
  ],
  "location": "NYL_StepDef.selects_Benefit_Option_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "ace",
      "offset": 28
    },
    {
      "val": "100000",
      "offset": 34
    },
    {
      "val": "70",
      "offset": 43
    }
  ],
  "location": "NYL_StepDef.enters_details_for_Company_and_click_on_add_button(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_Yes_for_replace_any_other_company_s_coverage_for_Self()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "95000",
      "offset": 61
    }
  ],
  "location": "NYL_StepDef.enters_Amount_under_replace_any_other_company_s_coverage_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_Yes_for_applying_for_any_other_business_office_overhead_insurance()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Add_Company_Button_for_Business_or_Office_Overhead()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "wayne enterprise",
      "offset": 28
    },
    {
      "val": "94000",
      "offset": 47
    },
    {
      "val": "24",
      "offset": 55
    }
  ],
  "location": "NYL_StepDef.enters_details_for_Company_and_click_on_add_button(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_Yes_for_replace_any_other_company_s_coverage_for_Self_overhead_disability()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "68000",
      "offset": 81
    }
  ],
  "location": "NYL_StepDef.enters_Amount_under_replace_any_other_company_s_coverage_of_overhead_product_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.request_Coverage_page_is_displayed_to_user()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Back_or_Previous_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_No_for_replace_any_other_company_s_coverage_for_Self_overhead_disability()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.request_Coverage_page_is_displayed_to_user()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$1,775,000",
      "offset": 36
    }
  ],
  "location": "NYL_StepDef.selects_Benefit_Amount_for_Self_as_under_TwentyYTL(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "100000",
      "offset": 55
    },
    {
      "val": "4000000",
      "offset": 67
    }
  ],
  "location": "NYL_StepDef.validates_under_TwentyYTL_the_Benefit_Slider_Range_as_to(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_Waiver_Rider_for_Twenty_Year_Product()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_AD_D_Rider_for_Self_under_TwentyYTL()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$250,000",
      "offset": 42
    }
  ],
  "location": "NYL_StepDef.selects_Rider_Benefit_Amount_for_Self_as_under_ADnD_Rider(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "25000",
      "offset": 62
    },
    {
      "val": "1000000",
      "offset": 73
    }
  ],
  "location": "NYL_StepDef.validates_under_ADnD_Rider_the_Benefit_Slider_Range_as_to(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$25,000",
      "offset": 39
    }
  ],
  "location": "NYL_StepDef.validates_Benefit_Amount_for_Child_as_under_TwentyYTL(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$500,000",
      "offset": 36
    }
  ],
  "location": "NYL_StepDef.selects_Benefit_Amount_for_Self_as_under_FifteenYTL(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "100000",
      "offset": 56
    },
    {
      "val": "4000000",
      "offset": 68
    }
  ],
  "location": "NYL_StepDef.validates_under_FifteenYTL_the_Benefit_Slider_Range_as_to_for_self(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_Waiver_of_Premium_Rider_for_Self_under_FifteenYTL()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_AD_D_Rider_for_Self_under_FifteenYTL()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$150,000",
      "offset": 42
    }
  ],
  "location": "NYL_StepDef.selects_Rider_Benefit_Amount_for_Self_as_for_ADnD_Rider_under_FifteenYTL(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "25000",
      "offset": 63
    },
    {
      "val": "1000000",
      "offset": 74
    }
  ],
  "location": "NYL_StepDef.validates_under_ADnD_Rider_FifteenYTL_Benefit_Slider_Range_as_to_for_Self(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$500,000",
      "offset": 36
    }
  ],
  "location": "NYL_StepDef.selects_Benefit_Amount_for_Self_as_under_TenYTL(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "100000",
      "offset": 52
    },
    {
      "val": "4000000",
      "offset": 64
    }
  ],
  "location": "NYL_StepDef.validates_under_TenYTL_the_Benefit_Slider_Range_as_to(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_Waiver_of_Premium_Rider_for_TenYear_for_Self()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_AD_D_Rider_for_Self_under_TenYTL()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$150,000",
      "offset": 42
    }
  ],
  "location": "NYL_StepDef.selects_Rider_Benefit_Amount_for_Self_as_for_ADnD_Rider_under_TenYTL(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "25000",
      "offset": 56
    },
    {
      "val": "1000000",
      "offset": 67
    }
  ],
  "location": "NYL_StepDef.validates_under_ADnD_Rider_the_Benefit_Slider_Range_as_to_for_Self(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$500,000",
      "offset": 36
    }
  ],
  "location": "NYL_StepDef.selects_Benefit_Amount_for_Self_as_under_PureTerm(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "100000",
      "offset": 54
    },
    {
      "val": "1000000",
      "offset": 66
    }
  ],
  "location": "NYL_StepDef.validates_under_PureTerm_the_Benefit_Slider_Range_as_to_for_Self(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_Waiver_of_Premium_Rider_for_Self_under_PureTerm()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$750,000",
      "offset": 36
    }
  ],
  "location": "NYL_StepDef.selects_Benefit_Amount_for_Self_as_under_PrefTerm(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "25000",
      "offset": 54
    },
    {
      "val": "3000000",
      "offset": 65
    }
  ],
  "location": "NYL_StepDef.validates_under_PrefTerm_the_Benefit_Slider_Range_as_to_for_Self(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_Waiver_of_Premium_Rider_for_Self_under_PrefTerm()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_AD_D_Rider_for_Self_under_PrefTerm()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$200,000",
      "offset": 42
    }
  ],
  "location": "NYL_StepDef.selects_Rider_Benefit_Amount_for_Self_as_for_ADnD_Rider_under_PrefTerm(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "25000",
      "offset": 61
    },
    {
      "val": "1000000",
      "offset": 72
    }
  ],
  "location": "NYL_StepDef.validates_under_ADnD_Rider_PrefTerm_Benefit_Slider_Range_as_to_for_Self(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$750,000",
      "offset": 36
    }
  ],
  "location": "NYL_StepDef.selects_Benefit_Amount_for_Self_as_under_PAI(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "500000",
      "offset": 61
    },
    {
      "val": "750000",
      "offset": 70
    },
    {
      "val": "1000000",
      "offset": 79
    }
  ],
  "location": "NYL_StepDef.validates_under_PAI_the_Benefit_Amount_listed_for_Self_are(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$300,000",
      "offset": 40
    }
  ],
  "location": "NYL_StepDef.validates_Benefit_Amount_for_Spouse_as_under_PAI(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$75,000",
      "offset": 39
    }
  ],
  "location": "NYL_StepDef.validates_Benefit_Amount_for_Child_as_under_PAI(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$1,500",
      "offset": 36
    }
  ],
  "location": "NYL_StepDef.selects_Benefit_Amount_for_Self_as_under_DPOSDI(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 52
    },
    {
      "val": "6600",
      "offset": 61
    }
  ],
  "location": "NYL_StepDef.validates_under_DPOSDI_the_Benefit_Slider_Range_as_to_for_Self(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "60 days",
      "offset": 33
    }
  ],
  "location": "NYL_StepDef.selects_Wait_Period_for_Self_as_under_DPOSDI(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "To age 67 plan",
      "offset": 38
    }
  ],
  "location": "NYL_StepDef.validates_Benefit_Period_for_Self_as_under_DPOSDI(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_Cost_of_Living_Adjustment_Rider_under_DPOSDI()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$5,000",
      "offset": 36
    }
  ],
  "location": "NYL_StepDef.selects_Benefit_Amount_for_Self_as_under_OOEI(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1000",
      "offset": 50
    },
    {
      "val": "20000",
      "offset": 60
    }
  ],
  "location": "NYL_StepDef.validates_under_OOEI_the_Benefit_Slider_Range_as_to_for_Self(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "60 days",
      "offset": 33
    }
  ],
  "location": "NYL_StepDef.selects_Wait_Period_for_Self_as_under_OOEI(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "12 months",
      "offset": 40
    }
  ],
  "location": "NYL_StepDef.validates_Benefit_Duration_for_Self_as_under_OOEI(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$500",
      "offset": 36
    }
  ],
  "location": "NYL_StepDef.selects_Benefit_Amount_for_Self_as_under_HII(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 61
    },
    {
      "val": "200",
      "offset": 67
    },
    {
      "val": "300",
      "offset": 73
    },
    {
      "val": "400",
      "offset": 79
    },
    {
      "val": "500",
      "offset": 85
    },
    {
      "val": "600",
      "offset": 91
    }
  ],
  "location": "NYL_StepDef.validates_under_HII_the_Benefit_Amount_listed_for_Self_are(String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$500",
      "offset": 40
    }
  ],
  "location": "NYL_StepDef.validates_Benefit_Amount_for_Spouse_as_under_HII(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$500",
      "offset": 39
    }
  ],
  "location": "NYL_StepDef.validates_Benefit_Amount_for_Child_as_under_HII(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.validate_Max_Aggregate_error_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$150,000",
      "offset": 36
    }
  ],
  "location": "NYL_StepDef.selects_Benefit_Amount_for_Self_as_under_TwentyYTL(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.validate_Max_Aggregate_error_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$1,750,000",
      "offset": 36
    }
  ],
  "location": "NYL_StepDef.selects_Benefit_Amount_for_Self_as_under_TwentyYTL(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.beneficiary_Page_is_displayed_to_user()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Add_Beneficiary_Button_for_Self_under_TwentyYTL()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.add_Beneficiary_page_will_be_displayed_to_user_and_user_will_select_Trust_and_Primary_Radio_Buttons()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "kennedy",
      "offset": 36
    },
    {
      "val": "\u003cDateTrust\u003e",
      "offset": 46
    }
  ],
  "location": "NYL_StepDef.user_Enters_Beneficiary_details_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_OK_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 48
    }
  ],
  "location": "NYL_StepDef.verify_that_the_Percent_Displayed_is_for_Trust(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Add_Beneficiary_Button_for_Self_under_TwentyYTL()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.add_Beneficiary_page_will_be_displayed_to_user_and_user_will_select_Trust_and_Primary_Radio_Buttons()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "arthur",
      "offset": 36
    },
    {
      "val": "SYSDATE - 50Y/02M/04D",
      "offset": 45
    }
  ],
  "location": "NYL_StepDef.user_Enters_Beneficiary_details_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_OK_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.validates_error_message_on_Add_Beneficiary_page_Only_one_Trust_is_allowed_as_Primary()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.add_Beneficiary_page_will_be_displayed_to_user_and_user_will_select_Contingent_and_Trust_Radio_Buttons()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "arthur",
      "offset": 36
    },
    {
      "val": "SYSDATE - 50Y/02M/04D",
      "offset": 45
    }
  ],
  "location": "NYL_StepDef.user_Enters_Beneficiary_details_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_OK_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.delete_Contigent_Beneficiary()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.delete_box_is_displayed_and_clicks_on_Yes()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Add_Beneficiary_Button_for_Self_under_TwentyYTL()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.add_Beneficiary_page_will_be_displayed_to_user_and_user_will_select_Individual_and_Contingent_Radio_Buttons()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "John",
      "offset": 57
    },
    {
      "val": "Adams",
      "offset": 64
    },
    {
      "val": "Son",
      "offset": 72
    },
    {
      "val": "25",
      "offset": 78
    }
  ],
  "location": "NYL_StepDef.user_Enters_Beneficiary_details_as_name_and_relationship(String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_OK_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Add_Beneficiary_Button_for_Self_under_TwentyYTL()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.add_Beneficiary_page_will_be_displayed_to_user_and_user_will_select_Individual_and_Contingent_Radio_Buttons()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Samantha",
      "offset": 57
    },
    {
      "val": "Jonas",
      "offset": 68
    },
    {
      "val": "Other",
      "offset": 76
    },
    {
      "val": "25",
      "offset": 84
    }
  ],
  "location": "NYL_StepDef.user_Enters_Beneficiary_details_as_name_and_relationship(String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_OK_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Add_Beneficiary_Button_for_Self_under_TwentyYTL()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.add_Beneficiary_page_will_be_displayed_to_user_and_user_will_select_Individual_and_Contingent_Radio_Buttons()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Rihanna",
      "offset": 57
    },
    {
      "val": "Jones",
      "offset": 67
    },
    {
      "val": "Daughter",
      "offset": 75
    },
    {
      "val": "35",
      "offset": 86
    }
  ],
  "location": "NYL_StepDef.user_Enters_Beneficiary_details_as_name_and_relationship(String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_OK_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Add_Beneficiary_Button_for_Self_under_TwentyYTL()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.add_Beneficiary_page_will_be_displayed_to_user_and_user_will_select_Individual_and_Contingent_Radio_Buttons()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Jake",
      "offset": 57
    },
    {
      "val": "Charles",
      "offset": 64
    },
    {
      "val": "Father",
      "offset": 74
    },
    {
      "val": "15",
      "offset": 83
    }
  ],
  "location": "NYL_StepDef.user_Enters_Beneficiary_details_as_name_and_relationship(String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_OK_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Add_Beneficiary_Button_for_Self_under_FifteenYTL()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.add_Beneficiary_page_will_be_displayed_to_user_and_user_will_select_Individual_and_Primary_Radio_Buttons()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Carter",
      "offset": 57
    },
    {
      "val": "Jonas",
      "offset": 66
    },
    {
      "val": "Father",
      "offset": 74
    },
    {
      "val": "50",
      "offset": 83
    }
  ],
  "location": "NYL_StepDef.user_Enters_Beneficiary_details_as_name_and_relationship(String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_OK_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Add_Beneficiary_Button_for_Self_under_FifteenYTL()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.add_Beneficiary_page_will_be_displayed_to_user_and_user_will_select_Individual_and_Primary_Radio_Buttons()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Primary",
      "offset": 78
    }
  ],
  "location": "NYL_StepDef.selects_the_First_Option_from_Existing_Beneficiaries_List_and_select_Type_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "15",
      "offset": 39
    }
  ],
  "location": "NYL_StepDef.enters_Percentage_for_First_Option_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Primary",
      "offset": 79
    }
  ],
  "location": "NYL_StepDef.selects_the_Second_Option_from_Existing_Beneficiaries_List_and_select_Type_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "15",
      "offset": 36
    }
  ],
  "location": "NYL_StepDef.enters_Percentage_Second_Option_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Primary",
      "offset": 78
    }
  ],
  "location": "NYL_StepDef.selects_the_Third_Option_from_Existing_Beneficiaries_List_and_select_Type_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 35
    }
  ],
  "location": "NYL_StepDef.enters_Percentage_Third_Option_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_OK_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Add_Beneficiary_Button_for_Self_under_FifteenYTL()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.add_Beneficiary_page_will_be_displayed_to_user_and_user_will_select_Contingent_and_Trust_Radio_Buttons()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Contingent",
      "offset": 78
    }
  ],
  "location": "NYL_StepDef.selects_the_First_Option_from_Existing_Beneficiaries_List_and_select_Type_as_for_Trust(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_OK_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 48
    }
  ],
  "location": "NYL_StepDef.verify_that_the_Percent_Displayed_is_for_Trust(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "NYL_StepDef.selects_Yes_for_Travel_Question_Non_QD_for_Self()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "India",
      "offset": 70
    },
    {
      "val": "6",
      "offset": 78
    }
  ],
  "location": "NYL_StepDef.enter_details_for_Outside_US_country_and_How_Long_months_for_Self_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "NYL_StepDef.selects_No_for_Travel_Question_QD_for_Self()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2043310",
      "offset": 87
    },
    {
      "val": "District of Columbia",
      "offset": 97
    }
  ],
  "location": "NYL_StepDef.select_DrivingLicense_Question_as_Yes_and_Enters_details_for_Self_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 51
    }
  ],
  "location": "NYL_StepDef.enters_WeightTwelveMonths_ago_details_for_Self_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "Mobile",
      "offset": 9
    },
    {
      "val": "7480235985",
      "offset": 40
    }
  ],
  "location": "NYL_StepDef.selects_and_enter_phonenumber_for_Self_at_contact_page(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "SYSDATE - 00Y/06M/00D",
      "offset": 51
    }
  ],
  "location": "NYL_StepDef.enters_Last_Used_Tobacco_Date_Details_for_Self_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "NYL_StepDef.selects_Residential_Radio_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_Yes_Radio_Button_for_Business_Address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Arthur Corp",
      "offset": 36
    },
    {
      "val": "Sole Proprietary",
      "offset": 50
    }
  ],
  "location": "NYL_StepDef.enters_Business_Address_Details_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.application_Summary_Page_is_displayed_to_user()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "$300,000",
      "offset": 40
    }
  ],
  "location": "NYL_StepDef.validates_Benefit_Amount_for_Spouse_as_under_PAI(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$500",
      "offset": 40
    }
  ],
  "location": "NYL_StepDef.validates_Benefit_Amount_for_Spouse_as_under_HII(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$25,000",
      "offset": 39
    }
  ],
  "location": "NYL_StepDef.validates_Benefit_Amount_for_Child_as_under_TwentyYTL(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$75,000",
      "offset": 39
    }
  ],
  "location": "NYL_StepDef.validates_Benefit_Amount_for_Child_as_under_PAI(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$500",
      "offset": 39
    }
  ],
  "location": "NYL_StepDef.validates_Benefit_Amount_for_Child_as_under_HII(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "NYL_StepDef.authorize_page_details_are_displayed_to_user_and_confirm_the_term_and_conditions_for_Self()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.almost_done_page_is_displayed_to_user()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.review_and_sign_page_details_are_displayed_to_user_and_Click_on_continue_and_attached_the_sign()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button_to_finish()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.review_and_sign_page_details_are_displayed_to_user_and_Click_on_continue_and_attached_the_sign()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button_to_finish()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.your_Insurance_Request_Decision_Page_is_displayed_to_user()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.payment_Information_Page_is_displayed_to_user()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "Bank of America",
      "offset": 41
    },
    {
      "val": "Jack",
      "offset": 59
    },
    {
      "val": "748596789",
      "offset": 66
    },
    {
      "val": "789456789452",
      "offset": 78
    }
  ],
  "location": "NYL_StepDef.user_enters_Details_for_Bank_Account_as(String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "NYL_StepDef.selects_Radio_Button_for_existing_payment_method()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "NYL_StepDef.selects_Payment_Method_for_TenYTL()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.selects_Radio_Button_for_existing_payment_method()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "NYL_StepDef.selects_Radio_Button_for_existing_payment_method()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "NYL_StepDef.selects_Radio_Button_for_existing_payment_method()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "NYL_StepDef.selects_Radio_Button_for_existing_payment_method()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "NYL_StepDef.selects_Radio_Button_for_existing_payment_method()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "NYL_StepDef.selects_Radio_Button_for_existing_payment_method()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "NYL_StepDef.selects_Radio_Button_for_existing_payment_method()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.payment_Authorization_Letter_is_displayed_to_user_and_clicks_on_Continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.signs_Payment_Authorization_Letter()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.clicks_on_next_button_to_finish()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NYL_StepDef.thank_you_page_is_displayed_to_user()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 601483740,
  "status": "passed"
});
});