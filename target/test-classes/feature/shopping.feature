Feature: Shopping Cart and CheckOut

Background:
Given User is login to the application

Scenario: Add products to the cart

When user search for "Mobile"
And add mobile to the cart
Then mobile  should be in cart

Scenario: remove product from the cart

When user navigate to the cart
And remove the mobile from the cart
Then mobile should not be in cart
