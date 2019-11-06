$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Orange HRM Login Feature",
  "description": "",
  "id": "orange-hrm-login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2945066603,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Orange HRM Login Test using correct username and password",
  "description": "",
  "id": "orange-hrm-login-feature;orange-hrm-login-test-using-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "open the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "users enters correct username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "users enters correct password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "users click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I validate the outcomes",
  "keyword": "Then "
});
formatter.match({
  "location": "loginSteps.open_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 2279516709,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.users_enters_correct_username()"
});
formatter.result({
  "duration": 2105854,
  "error_message": "java.lang.NullPointerException\n\tat StepDefinition.loginSteps.users_enters_correct_username(loginSteps.java:34)\n\tat ✽.When users enters correct username(login.feature:6)\n",
  "status": "failed"
});
formatter.match({
  "location": "loginSteps.users_enters_correct_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginSteps.users_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginSteps.i_validate_the_outcomes()"
});
formatter.result({
  "status": "skipped"
});
});