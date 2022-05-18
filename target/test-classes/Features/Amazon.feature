Feature: login to the amazon page

Scenario Outline: Tc_1 validation of signIn Id
Given User launch Amazon Web Application
When  user enter valid "<Email or phoneNo>"
And User click continue button

Examples:
|Email or phoneNo|
|8128638748|

Scenario Outline: Tc_2 validation of signIn Id
Given User launch Amazon Web Application
When  user enter invalid "<Email or phoneNo>"
And User click continue button

Examples:
|Email or phoneNo|
|sathyashaki2595@gmail.com|


Scenario Outline: Tc_3 validation of signIn Id
Given User launch Amazon Web Application
When  user enter Empty "<Email or phoneNo>"
And User click continue button

Examples:
|Email or phoneNo|
|vishaliraj@gmail.com|


