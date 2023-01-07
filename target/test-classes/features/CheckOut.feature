@CheckOut
  Feature: CheckOut
    User can click button tambah item
  Scenario: Can check out list of cart that user choosing
    Given User open the website sauce demo
    When User input "standard_user" ad userName and input "secret_sauce" as password
    Then verify display landing page
    When User sort Name Z to A
    And User pick itemSauce Labs Onesie
    And User pick item Test.allTheThings T-Shirt Red
    And User click shopping cart
    Then Verify All item
    And Remove item 2 T-Shirt Red
    And Click button checkout
    Given User input "Mukhlis" as firstName and input "Anshori" as lastName and input "65134" as ZIP code
    Then verify display item total
    Then verify display Tax
    Then verify display Total Payment
    And Click button finish
    And Verify THANK YOU FOR YOUR ORDER displayed
    Then verify value THANK YOU FOR YOUR ORDER
