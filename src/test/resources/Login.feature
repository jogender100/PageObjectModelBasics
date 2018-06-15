#Author: your.email@your.domain.com

@Sanity
Feature: GmailLogin
  
  In order to perform successful login
  As a user
  I want to enter correct username and password

  Scenario: In order to verify login to Gmail
    Given user navigates to GoogleMail website
    When user entered the user name
    And user entered the password
    And user click Login button
    Then user should be successfully logged in
    
    Scenario: In order to verify login to Wiki
    Given user navigates to Wiki website
    When user select the Language Hindi
    Then Search page is displayed