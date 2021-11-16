Feature: add to cart

Background: 

	Given open Retail website
	
@AddToCartMacBook
Scenario:
	When user click on Laptops&NoteBooks
	When User click on ShowAllLaptops&NoteBooks
	And User click on Macbook
	And User click on Add to cart
	Then verify the success message ‘Success: You have added’

	