

Feature: Loin Feature
this feature is used for login functionality

@tag1
Scenario: verify valid user login
Given Launch application
When user enters user name text field
And user enters password in password text field
And click submit button
Then user enter successfull msg displayed

#@tag
#Scenario: verify invalid user login
