@run
Feature: Contact Us Page Feature

  Scenario Outline: Verify that the contact form can be submitted successfully with all required fields filled in correctly.

    Given Given the User is on the contact us page
    And  User Enter Full Name "<FullName>"
    And  User Enter email "<Email>"
    And  User Enter Mobile number "<MobileNumber>"
    And  User Selects Company size "<CompanySize>"
    And  User Selects the type of service "<Services>"
    And  User Enter how can we help you text "<HelpText>"
    When The user clicks on the Send message button
    Then A success Message is displayed


    Examples:
      | FullName           | Email           |MobileNumber  | CompanySize | Services  | HelpText                                  |
      | Farisani Nonyana   | rof@gmail.com   | 0794188672   |   1 - 25    | Web App   | Web automation using selenium and cucumber|


  Scenario: Test the form's validation by submitting it with missing or incorrect information in one or more fields.

    Given Given the User is on the contact us page
    When The user clicks on the Send message button
    Then Then verify if errors are being displayed

  Scenario Outline: Verify that the form displays an error message when submitted without a valid email address.

    Given Given the User is on the contact us page
    And  User Enter Full Name "<FullName>"
    And  User Enter email "<Email>"
    And  User Enter Mobile number "<MobileNumber>"
    And  User Selects Company size "<CompanySize>"
    And  User Selects the type of service "<Services>"
    And  User Enter how can we help you text "<HelpText>"
    Then Verify expected error "<ErrorMessage>"

    Examples:
      | FullName           | Email           |MobileNumber  | CompanySize | Services  | HelpText                                 | ErrorMessage                      |
      | Farisani Nonyana   | rofgmail.com   | 0794188672   |   1 - 25    | Web App   | Web automation using selenium and cucumber| Email must be formatted correctly.|


  Scenario Outline: Verify that the form displays an error message when submitted with mobile number that is shorter than expected

    Given Given the User is on the contact us page
    And  User Enter Full Name "<FullName>"
    And  User Enter email "<Email>"
    And  User Enter Mobile number "<MobileNumber>"
    And  User Selects Company size "<CompanySize>"
    And  User Selects the type of service "<Services>"
    And  User Enter how can we help you text "<HelpText>"
    When The user clicks on the Send message button
    Then Verify expected error "<ErrorMessage>"

    Examples:
      | FullName           | Email           |MobileNumber  | CompanySize | Services  | HelpText                                  | ErrorMessage                           |
      | Farisani Nonyana   | rof@gmail.com   | 07941        |   1 - 25    | Web App   | Web automation using selenium and cucumber| The number you entered is not in range.|

  Scenario Outline: Verify that the form displays an error message when submitted with non numeric character on the mobile number field.

    Given Given the User is on the contact us page
    And  User Enter Full Name "<FullName>"
    And  User Enter email "<Email>"
    And  User Enter Mobile number "<MobileNumber>"
    And  User Selects Company size "<CompanySize>"
    And  User Selects the type of service "<Services>"
    And  User Enter how can we help you text "<HelpText>"
    When The user clicks on the Send message button
    Then Verify expected error "<ErrorMessage>"

    Examples:
      | FullName           | Email           |MobileNumber  | CompanySize | Services  | HelpText                                  | ErrorMessage                           |
      | Farisani Nonyana   | rof@gmail.com   | 07941xy      |   1 - 25    | Web App   | Web automation using selenium and cucumber| Must contain only numbers, +()-. and x.|
