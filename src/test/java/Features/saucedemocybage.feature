Feature: sauce demo Application 

Scenario:  Validate login functionality 
Given User enter URL on browser
When User enter valid user name and password 
Then User click on login button 

  Scenario: add to card Functionality
When User click on filter and select price hign to low 
And User add first three products to card 
Then  user click on add to cart container 
And  user is on checkout 

Scenario: validate personal information functionality 
When  USer enter first name , lastname and pin code 
And user click on continue button 
Then Uesr click on finish button  