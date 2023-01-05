$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CheckOut.feature");
formatter.feature({
  "line": 2,
  "name": "CheckOut",
  "description": "User can click button tambah item",
  "id": "checkout",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CheckOut"
    }
  ]
});
formatter.before({
  "duration": 12277844100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Can check out list of cart that user choosing",
  "description": "",
  "id": "checkout;can-check-out-list-of-cart-that-user-choosing",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User open the website sauce demo",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User input \"standard_user\" ad userName and input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Sort Name Z to A",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User pick itemSauce Labs Onesie",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User pick item Sauce Labs Fleece Jacket",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Cek items 1 name on cart menu",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Cek items 2 name on cart menu",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click button checkout",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User input \"Mukhlis\" as firstName and input \"Anshori\" as lastName and input \"65134\" as ZIP code",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Cek total Price",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Click button finish",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "verify value THANK YOU FOR YOUR ORDER",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Verify THANK YOU FOR YOUR ORDER displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyDisplay()"
});
formatter.result({
  "duration": 591555800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 50
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 5856384200,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.selectSort()"
});
formatter.result({
  "duration": 3371336100,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickItemBasket1()"
});
formatter.result({
  "duration": 2156059100,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickItemBasket2()"
});
formatter.result({
  "duration": 2133115800,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickShoppingCart()"
});
formatter.result({
  "duration": 5186622700,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.cekNameCart1()"
});
formatter.result({
  "duration": 105310600,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.cekNameCart2()"
});
formatter.result({
  "duration": 71954800,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickCheckout()"
});
formatter.result({
  "duration": 5215521800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mukhlis",
      "offset": 12
    },
    {
      "val": "Anshori",
      "offset": 45
    },
    {
      "val": "65134",
      "offset": 77
    }
  ],
  "location": "PurchaseSteps.inputDataDiri(String,String,String)"
});
formatter.result({
  "duration": 8863930600,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.cekTotalPrice()"
});
formatter.result({
  "duration": 4064608400,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickFinish()"
});
formatter.result({
  "duration": 5165462300,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.cekValueThanks()"
});
formatter.result({
  "duration": 4079399500,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verivyOrderFinished()"
});
formatter.result({
  "duration": 59489200,
  "status": "passed"
});
formatter.after({
  "duration": 1219870700,
  "status": "passed"
});
});