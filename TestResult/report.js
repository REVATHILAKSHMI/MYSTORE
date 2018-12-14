$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Dresses.feature");
formatter.feature({
  "line": 1,
  "name": "build BDD Frame for given case Statement",
  "description": "",
  "id": "build-bdd-frame-for-given-case-statement",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Launch \"FireFox\" Browser and load Url",
  "rows": [
    {
      "cells": [
        "http://automationpractice.com"
      ],
      "line": 5
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "FireFox",
      "offset": 8
    }
  ],
  "location": "TC02_EMAILID.launch(String,DataTable)"
});
formatter.result({
  "duration": 12491976408,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "This scenario is to validate whethe User is able to register using a valid email address",
  "description": "",
  "id": "build-bdd-frame-for-given-case-statement;this-scenario-is-to-validate-whethe-user-is-able-to-register-using-a-valid-email-address",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@sc1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Verify \u0027Sign-in link\u0027 is available in \u0027My Store\u0027 page If Sig-in exist click on Sigin",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "In \u0027sign page\u0027  Verify  \u0027Create- Account header\u0027 is available or not",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Verify \u0027Email address\u0027 is preasent under Create Account if present enter a valid Email-id if mailid exist should display error messege",
  "rows": [
    {
      "cells": [
        "abcd@gmail.com"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "If Email-id entered is  valid and does not exist then create a new account by Clicking on Create Account  Button",
  "rows": [
    {
      "cells": [
        "revprasad123@gmail.com"
      ],
      "line": 15
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Verify Create an Account Page has all fields and enter the details to create account",
  "rows": [
    {
      "cells": [
        "Mrs",
        "Revathi",
        "Lakshmi",
        "revathi9",
        "Revathi",
        "prasad",
        "TechMahendhra",
        "Hitech city,phase 2,500081,TechMahendhra",
        "Hitech city,phase 2,500081,TechMahendhra",
        "Binghamton",
        "13903",
        "cucumber classes online",
        "1234567890",
        "8989334567",
        "Hitech city"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Click on \u0027Register\u0027  button",
  "keyword": "Then "
});
formatter.match({
  "location": "TC02_EMAILID.Sigin()"
});
formatter.result({
  "duration": 705299307,
  "status": "passed"
});
formatter.match({
  "location": "TC02_EMAILID.createAcc()"
});
formatter.result({
  "duration": 1964497455,
  "status": "passed"
});
formatter.match({
  "location": "TC02_EMAILID.aeEid(DataTable)"
});
formatter.result({
  "duration": 1604960611,
  "status": "passed"
});
formatter.match({
  "location": "TC02_EMAILID.e(DataTable)"
});
formatter.result({
  "duration": 423410423,
  "status": "passed"
});
formatter.match({
  "location": "TC02_EMAILID.ypIf(DataTable)"
});
formatter.result({
  "duration": 7706445632,
  "status": "passed"
});
formatter.match({
  "location": "TC02_EMAILID.Regis()"
});
formatter.result({
  "duration": 2095231903,
  "status": "passed"
});
});