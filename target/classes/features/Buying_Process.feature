@smoke
Feature:F01_Complete_Buying_Process

  Scenario: complete buying iphone process
    #Test Steps
    When user Click on English tab
    And Select Apple brand
    And Press in any returned product
    And Press Add to cart
    And Press Proceed to Checkout
    And Select Delivery Options As "Cairo" and "Ain Shams"
    And Select Deliver to My Address
    And Complete Address details
    And press continue
    Then Assert error message returned from Full Name field.
