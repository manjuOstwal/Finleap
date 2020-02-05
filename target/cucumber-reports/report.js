$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Fineleap/Automation/Fineleap.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# test upload"
    }
  ],
  "line": 2,
  "name": "open home page and upload file",
  "description": "",
  "id": "open-home-page-and-upload-file",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "flow till signup page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Open home page \"\u003cbrowser\u003e\"",
  "rows": [
    {
      "cells": [
        "chrome"
      ],
      "line": 5
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter url of signup \"\u003curl\u003e\"",
  "rows": [
    {
      "cells": [
        "http://qa.cockpit.pylot.de/"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "signup page open up",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage.Open_Home_page(DataTable)"
});
formatter.result({
  "duration": 11094821200,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.enter_url(DataTable)"
});
formatter.result({
  "duration": 13342945500,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.test_page_open_up()"
});
formatter.result({
  "duration": 55046800,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "SignIn with valid details",
  "description": "",
  "id": "open-home-page-and-upload-file;signin-with-valid-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "click on SignIn button",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "enter credentials",
  "rows": [
    {
      "cells": [
        "testfineleap20@yopmail.com",
        "Password@123"
      ],
      "line": 13
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Welcome page open up",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage.click_on_SignIn_button()"
});
formatter.result({
  "duration": 42024100,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.enter_credentials(DataTable)"
});
formatter.result({
  "duration": 3064262700,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.Welcome_page_open_up()"
});
formatter.result({
  "duration": 2829940900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "flow till signup page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Open home page \"\u003cbrowser\u003e\"",
  "rows": [
    {
      "cells": [
        "chrome"
      ],
      "line": 5
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter url of signup \"\u003curl\u003e\"",
  "rows": [
    {
      "cells": [
        "http://qa.cockpit.pylot.de/"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "signup page open up",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage.Open_Home_page(DataTable)"
});
formatter.result({
  "duration": 9838857000,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.enter_url(DataTable)"
});
formatter.result({
  "duration": 13142048800,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.test_page_open_up()"
});
formatter.result({
  "duration": 104723700,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "SignIn with invalid details",
  "description": "",
  "id": "open-home-page-and-upload-file;signin-with-invalid-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "click on SignIn button",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "enter credentials",
  "rows": [
    {
      "cells": [
        "testfineleap20@yopmail.com",
        "Password@187"
      ],
      "line": 19
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "error invalid credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage.click_on_SignIn_button()"
});
formatter.result({
  "duration": 82417900,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.enter_credentials(DataTable)"
});
formatter.result({
  "duration": 1459857800,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.error_invalid_credentials()"
});
formatter.result({
  "duration": 84949500,
  "status": "passed"
});
});