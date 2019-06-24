Feature: Resposible gaming limit
In order to seeting and breaching limits 
As a User
I am able to set the rsg limits

 Background:
    Given user is created with "referfriend80 " and password "password1" 
     
     
 Scenario: Spend Limit
    Given User is on Home Page
    Then Click on responsible gaming link
     And Click on Set limit button in timelimit
     And Click on Limit(in hours)
     And Enter the "1" hours
     And Click on Set Time limit button
     And Click on Confirm Time limit button
     
     