@Login
  Feature: Login
    As a user i want to login to website sauce demo

  Scenario: Normal login
    Given User open the website sauce demo
    When User input "standard_user" ad userName and input "secret_sauce" as password

    Scenario Outline: invalid login
      Given User open the website sauce demo
      When User input "<userName>" ad userName and input "<password>" as password
      Then User see error "<errorMassage>" on login page
  Examples:
    | userName | password | errorMassage                                                              |
    | mukhlis  | 123      | Epic sadface: Username and password do not match any user in this service |
    |          | 123      | Epic sadface: Username is required                                        |
    | mukhlis  |          | Epic sadface: Password is required                                        |





