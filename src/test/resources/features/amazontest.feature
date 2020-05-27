#As a <user> when i perform <some action> then expected beahaviour should be <this>
# anonymous user, registered user, admin 
Feature: Feature to test Cart functionality
	As an anonymous/registered/admin user when I add/delete/update so that cart should get updated accordingly
	
	Scenario: To test whether a product can be added to cart
		As an ananymous user, when I add a product to cart so that it gets added successfully
		Given I have opened browser 
		When I am on home page
		And I search for "RockDove Men's Two-Tone Lightweight Slip-On with Memory Foam"
		And I click on first product in results page
		And I select required size in product page
		And I add the product to basket from product page
		Then cart should get updated with added item