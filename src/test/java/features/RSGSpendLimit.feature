Feature: Resposible gaming limit
In order to seeting and breaching limits 
As a User
I am able to set the rsg limits

 Background:
    Given user is created with "referfriend80 " and password "password1" 
    
   Scenario: Spend Limit
    Given User is on Home Page
    Then Click on responsible gaming link
    And Click on Set limit button 
    And Select Per "1 day" option
    And Enter the "20" amount
   And Click on set spend limit button
   And Click on Confirm spend limit
    And Click on Update Spend limit
   And Select Per "7 days" option
   And Enter the "18" amount
   And Click on set spend limit button
And Click on Confirm spend limit
   And Click on Update Spend limit
   And  Select Per "30 days" option
   And Enter the "15" amount
     And Click on set spend limit button
 And Click on Confirm spend limit
  And Click on right menu
 And Click on Account History
 And Verify Account history is updated
 
 
    