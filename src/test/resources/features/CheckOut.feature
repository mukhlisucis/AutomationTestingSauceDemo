@CheckOut
  Feature: CheckOut
    User can click button tambah item
  Scenario: Can check out list of cart that user choosing
    Given User open the website sauce demo
    When User input "standard_user" ad userName and input "secret_sauce" as password
    Given Sort Name Z to A
    And User pick itemSauce Labs Onesie
    And User pick item Sauce Labs Fleece Jacket
    And User click shopping cart
    And Cek items 1 name on cart menu
    And Cek items 2 name on cart menu
    And Click button checkout
    And User input "Mukhlis" as firstName and input "Anshori" as lastName and input "65134" as ZIP code
    And Cek total Price
    And Click button finish
    And verify value THANK YOU FOR YOUR ORDER
    Then Verify THANK YOU FOR YOUR ORDER displayed