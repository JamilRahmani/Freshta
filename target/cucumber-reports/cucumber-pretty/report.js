$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddToCart.feature");
formatter.feature({
  "line": 1,
  "name": "add to cart",
  "description": "",
  "id": "add-to-cart",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5663449100,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "open Retail website",
  "keyword": "Given "
});
formatter.match({
  "location": "AddToCartMackBookStepDef.open_Retail_website()"
});
formatter.result({
  "duration": 1810908000,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "",
  "description": "",
  "id": "add-to-cart;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@AddToCartMacBook"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user click on Laptops\u0026NoteBooks",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User click on ShowAllLaptops\u0026NoteBooks",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User click on Macbook",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click on Add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "verify the success message ‘Success: You have added’",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartMackBookStepDef.user_click_on_Laptops_NoteBooks()"
});
formatter.result({
  "duration": 180017300,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartMackBookStepDef.user_click_on_ShowAllLaptops_NoteBooks()"
});
formatter.result({
  "duration": 678322000,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartMackBookStepDef.user_click_on_Macbook()"
});
formatter.result({
  "duration": 1529871900,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartMackBookStepDef.user_click_on_Add_to_cart()"
});
formatter.result({
  "duration": 151112700,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartMackBookStepDef.verify_the_success_message_Success_You_have_added()"
});
formatter.result({
  "duration": 543851400,
  "status": "passed"
});
formatter.after({
  "duration": 5134645500,
  "status": "passed"
});
});