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
  "duration": 19552233200,
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
  "name": "verify display landing page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User sort Name Z to A",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User pick itemSauce Labs Onesie",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User pick item Test.allTheThings T-Shirt Red",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Verify All item",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Remove item 2 T-Shirt Red",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Click button checkout",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User input \"Mukhlis\" as firstName and input \"Anshori\" as lastName and input \"65134\" as ZIP code",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "verify display item total",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "verify display Tax",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "verify display Total Payment",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click button finish",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Verify THANK YOU FOR YOUR ORDER displayed",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "verify value THANK YOU FOR YOUR ORDER",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyDisplay()"
});
formatter.result({
  "duration": 1284530000,
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
  "duration": 7285105500,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 133452000,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.selectProductContainer()"
});
formatter.result({
  "duration": 3379500500,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickItemBasket1()"
});
formatter.result({
  "duration": 2165514100,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickItemBasket2()"
});
formatter.result({
  "duration": 2146932900,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickShoppingCart()"
});
formatter.result({
  "duration": 5251553900,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyAllItem()"
});
formatter.result({
  "duration": 268897400,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.removeItem2()"
});
formatter.result({
  "duration": 3234019900,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickCheckout()"
});
formatter.result({
  "duration": 5328314000,
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
  "duration": 9171004200,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.displayItemTotal()"
});
formatter.result({
  "duration": 113222900,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.displayTax()"
});
formatter.result({
  "duration": 98775600,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.displayTotalPayment()"
});
formatter.result({
  "duration": 118469500,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickFinish()"
});
formatter.result({
  "duration": 5314256400,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verivyOrderFinished()"
});
formatter.result({
  "duration": 847906900,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.cekValueThanks()"
});
formatter.result({
  "duration": 5261844800,
  "status": "passed"
});
formatter.after({
  "duration": 1785287000,
  "status": "passed"
});
});