@Testcase_Feature
Feature: Opencart website 

@tc01_opencart_register
Scenario: Register in opencart website 
	
	Given the user launch the browser for register
	When the  user opens opencart register page
	Then the user enters the valid register details
	Then the user close the opencart register page
	

@tc02_opencart_login
Scenario Outline: Login in opencart website
	
	Given the user launch the browser for login
	When the  user opens opencart login page
	Then The user enters "<emailid>" and "<pass>"
	Then the user close the opencart login page
	
Examples:
|emailid					|pass			|
|soundaryariya27@gmail.com	|sound			|
|sound						|sound11		|


@tc03_opencart_search
Scenario: Searching products in opencart website
	
	Given launch the browser
	When the user opens the opencart search page
	Then the user search the product
	Then the user close the search page
	
@tc04_opencart_add_to_cart
Scenario: Add to cart in opencart website
	
	Given launching the browser
	When the user opens the opencart page
	Then the user select the product and add to cart
	Then the user close the website
	
@tc05_opencart_select_desktop
Scenario: Select desktop in opencart website
	
	Given launching browser
	When the user opens the home page
	Then the user select the desktop
	Then the user close the browser	

	
@tc06_opencart_address_book
Scenario: Address book in opencart website
	
    Given the user launch the browser for address book scenario
	When the user opens the webpage
	Then the user enters the address book details
	Then the user close the webpage
	
