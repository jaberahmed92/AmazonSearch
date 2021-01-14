Feature: Amazon search
 Scenario Outline: checkout QA book
 Given user navigate to the amazon home page
 When user enter the item name on "<search>" button 
 And  user click on search button
 And click on the item
 And click on add cart
 And click on proceed to checkout
 Then checkout should be successful
 Examples:
 |search|
 |qa testing for beginners|