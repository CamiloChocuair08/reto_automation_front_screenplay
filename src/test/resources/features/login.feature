Feature: login test

  @loginsuccess
  Scenario Outline: testing the successful login
    Given the user is on the sausedemo login page
    When he types <user> and <password>
    #Then he should see the text on screen <title>

    Examples:
      | user          | password     | title     |
      | standard_user | secret_sauce | Swag Labs |