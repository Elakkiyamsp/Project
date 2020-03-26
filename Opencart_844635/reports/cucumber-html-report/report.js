$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/Opencart.feature");
formatter.feature({
  "line": 2,
  "name": "Opencart website",
  "description": "",
  "id": "opencart-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Testcase_Feature"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Register in opencart website",
  "description": "",
  "id": "opencart-website;register-in-opencart-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc01_opencart_register"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "the user launch the browser for register",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the  user opens opencart register page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user enters the valid register details",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "the user close the opencart register page",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.the_user_launch_the_browser_for_register()"
});
formatter.result({
  "duration": 11283611391,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.the_user_opens_opencart_register_page()"
});
formatter.result({
  "duration": 2478735157,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.the_user_enters_the_valid_register_details()"
});
formatter.result({
  "duration": 6441706143,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.the_user_close_the_opencart_register_page()"
});
formatter.result({
  "duration": 2271368941,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 14,
  "name": "Login in opencart website",
  "description": "",
  "id": "opencart-website;login-in-opencart-website",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@tc02_opencart_login"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "the user launch the browser for login",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "the  user opens opencart login page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "The user enters \"\u003cemailid\u003e\" and \"\u003cpass\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "the user close the opencart login page",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "opencart-website;login-in-opencart-website;",
  "rows": [
    {
      "cells": [
        "emailid",
        "pass"
      ],
      "line": 22,
      "id": "opencart-website;login-in-opencart-website;;1"
    },
    {
      "cells": [
        "soundaryariya27@gmail.com",
        "sound"
      ],
      "line": 23,
      "id": "opencart-website;login-in-opencart-website;;2"
    },
    {
      "cells": [
        "sound",
        "sound11"
      ],
      "line": 24,
      "id": "opencart-website;login-in-opencart-website;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "Login in opencart website",
  "description": "",
  "id": "opencart-website;login-in-opencart-website;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Testcase_Feature"
    },
    {
      "line": 13,
      "name": "@tc02_opencart_login"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "the user launch the browser for login",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "the  user opens opencart login page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "The user enters \"soundaryariya27@gmail.com\" and \"sound\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "the user close the opencart login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_user_launch_the_browser_for_login()"
});
formatter.result({
  "duration": 10047441328,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.the_user_opens_opencart_login_page()"
});
formatter.result({
  "duration": 2134026608,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "soundaryariya27@gmail.com",
      "offset": 17
    },
    {
      "val": "sound",
      "offset": 49
    }
  ],
  "location": "LoginSteps.the_user_enters_the_valid_login_details(String,String)"
});
formatter.result({
  "duration": 9239305083,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.the_user_close_the_opencart_login_page()"
});
formatter.result({
  "duration": 466230264,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Login in opencart website",
  "description": "",
  "id": "opencart-website;login-in-opencart-website;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Testcase_Feature"
    },
    {
      "line": 13,
      "name": "@tc02_opencart_login"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "the user launch the browser for login",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "the  user opens opencart login page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "The user enters \"sound\" and \"sound11\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "the user close the opencart login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_user_launch_the_browser_for_login()"
});
formatter.result({
  "duration": 8093237256,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.the_user_opens_opencart_login_page()"
});
formatter.result({
  "duration": 2244364074,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sound",
      "offset": 17
    },
    {
      "val": "sound11",
      "offset": 29
    }
  ],
  "location": "LoginSteps.the_user_enters_the_valid_login_details(String,String)"
});
formatter.result({
  "duration": 8141184409,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.the_user_close_the_opencart_login_page()"
});
formatter.result({
  "duration": 2187558005,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Searching products in opencart website",
  "description": "",
  "id": "opencart-website;searching-products-in-opencart-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@tc03_opencart_search"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "the user opens the opencart search page",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "the user search the product",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "the user close the search page",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.launch_the_browser()"
});
formatter.result({
  "duration": 4342003114,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.the_user_opens_the_opencart_search_page()"
});
formatter.result({
  "duration": 4539173275,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.the_user_search_the_product()"
});
formatter.result({
  "duration": 4190249512,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat com.Opencart.stepdefinition.SearchSteps.the_user_search_the_product(SearchSteps.java:34)\r\n\tat ✽.Then the user search the product(src/main/resources/feature/Opencart.feature:32)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SearchSteps.the_user_close_the_search_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 36,
  "name": "Add to cart in opencart website",
  "description": "",
  "id": "opencart-website;add-to-cart-in-opencart-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@tc04_opencart_add_to_cart"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "launching the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "the user opens the opencart page",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "the user select the product and add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "the user close the website",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.launching_the_browser()"
});
formatter.result({
  "duration": 3950699946,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartSteps.the_user_opens_the_opencart_page()"
});
formatter.result({
  "duration": 3981524897,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartSteps.the_user_select_the_product_and_add_to_cart()"
});
formatter.result({
  "duration": 16897639186,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartSteps.the_user_close_the_website()"
});
formatter.result({
  "duration": 519562263,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "Select desktop in opencart website",
  "description": "",
  "id": "opencart-website;select-desktop-in-opencart-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 43,
      "name": "@tc05_opencart_select_desktop"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "launching browser",
  "keyword": "Given "
});
formatter.step({
  "line": 47,
  "name": "the user opens the home page",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "the user select the desktop",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "the user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DesktopSteps.launching_browser()"
});
formatter.result({
  "duration": 4413212389,
  "status": "passed"
});
formatter.match({
  "location": "DesktopSteps.the_user_opens_the_home_page()"
});
formatter.result({
  "duration": 9316456713,
  "status": "passed"
});
formatter.match({
  "location": "DesktopSteps.the_user_select_the_desktop()"
});
formatter.result({
  "duration": 12173041905,
  "status": "passed"
});
formatter.match({
  "location": "DesktopSteps.the_user_close_the_browser()"
});
formatter.result({
  "duration": 2178990123,
  "status": "passed"
});
formatter.scenario({
  "line": 53,
  "name": "Address book in opencart website",
  "description": "",
  "id": "opencart-website;address-book-in-opencart-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 52,
      "name": "@tc06_opencart_address_book"
    }
  ]
});
formatter.step({
  "line": 55,
  "name": "the user launch the browser for address book scenario",
  "keyword": "Given "
});
formatter.step({
  "line": 56,
  "name": "the user opens the webpage",
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "the user enters the address book details",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "the user close the webpage",
  "keyword": "Then "
});
formatter.match({
  "location": "AddressBookSteps.the_user_launch_the_browser_for_address_book_scenario()"
});
formatter.result({
  "duration": 4482516388,
  "status": "passed"
});
formatter.match({
  "location": "AddressBookSteps.the_user_opens_the_webpage()"
});
formatter.result({
  "duration": 16298082774,
  "status": "passed"
});
formatter.match({
  "location": "AddressBookSteps.the_user_enters_the_address_book_details()"
});
formatter.result({
  "duration": 20505135231,
  "status": "passed"
});
formatter.match({
  "location": "AddressBookSteps.the_user_close_the_webpage()"
});
formatter.result({
  "duration": 2184804187,
  "status": "passed"
});
});