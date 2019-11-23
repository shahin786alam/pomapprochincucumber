$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Shahin Alam/eclipse-workspace/pomapprochincucumber/src/main/java/com/qa/free/crm/feature/testlogin.feature");
formatter.feature({
  "line": 1,
  "name": "free crm application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "validate free crm home page",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user logs in to app",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate home page title",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#Then validate logged in username"
    }
  ],
  "line": 10,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsFile.user_opens_browser()"
});
formatter.result({
  "duration": 13334882000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsFile.user_is_on_login_page()"
});
formatter.result({
  "duration": 133669600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsFile.user_logs_in_to_app()"
});
formatter.result({
  "duration": 3538868099,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsFile.validate_home_page_title()"
});
formatter.result({
  "duration": 9062200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsFile.user_close_the_browser()"
});
formatter.result({
  "duration": 855137200,
  "status": "passed"
});
});