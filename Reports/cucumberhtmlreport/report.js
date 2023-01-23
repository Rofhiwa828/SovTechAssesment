$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature Files/SovTechFeatures/ContactUsFeature.feature");
formatter.feature({
  "line": 2,
  "name": "Contact Us Page Feature",
  "description": "",
  "id": "contact-us-page-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verify that the contact form can be submitted successfully with all required fields filled in correctly.",
  "description": "",
  "id": "contact-us-page-feature;verify-that-the-contact-form-can-be-submitted-successfully-with-all-required-fields-filled-in-correctly.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Given the User is on the contact us page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Enter Full Name \"\u003cFullName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Enter email \"\u003cEmail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User Enter Mobile number \"\u003cMobileNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Selects Company size \"\u003cCompanySize\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Selects the type of service \"\u003cServices\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Enter how can we help you text \"\u003cHelpText\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "The user clicks on the Send message button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "A success Message is displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "contact-us-page-feature;verify-that-the-contact-form-can-be-submitted-successfully-with-all-required-fields-filled-in-correctly.;",
  "rows": [
    {
      "cells": [
        "FullName",
        "Email",
        "MobileNumber",
        "CompanySize",
        "Services",
        "HelpText"
      ],
      "line": 18,
      "id": "contact-us-page-feature;verify-that-the-contact-form-can-be-submitted-successfully-with-all-required-fields-filled-in-correctly.;;1"
    },
    {
      "cells": [
        "Farisani Nonyana",
        "rof@gmail.com",
        "0794188672",
        "1 - 25",
        "Web App",
        "Web automation using selenium and cucumber"
      ],
      "line": 19,
      "id": "contact-us-page-feature;verify-that-the-contact-form-can-be-submitted-successfully-with-all-required-fields-filled-in-correctly.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "Verify that the contact form can be submitted successfully with all required fields filled in correctly.",
  "description": "",
  "id": "contact-us-page-feature;verify-that-the-contact-form-can-be-submitted-successfully-with-all-required-fields-filled-in-correctly.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Given the User is on the contact us page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Enter Full Name \"Farisani Nonyana\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Enter email \"rof@gmail.com\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User Enter Mobile number \"0794188672\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Selects Company size \"1 - 25\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Selects the type of service \"Web App\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Enter how can we help you text \"Web automation using selenium and cucumber\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "The user clicks on the Send message button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "A success Message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsPageStepDefs.given_the_User_is_on_the_contact_us_page()"
});
