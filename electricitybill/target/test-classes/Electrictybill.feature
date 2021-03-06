Feature: Calculate electricity bill

  #Background: Given My electricity bill is  <unit>

  Scenario Outline: Calculate Energy Charges Units consumed upto 50 units
    Given My electricity bill is  <unit>
    And my slab is <slab>
    When I check for the energy charges
    Then I verify the <energy charge>

    Examples: 
      | unit | slab | Energy charge |
      |   40 | 4.05 |           162 |
      |   50 | 4.05 |         202.5 |
      

  Scenario Outline: Calculate FCA Charges Units consumed upto 50 units
    When I check for the FCA charges
    And FCA charge is 0.13 paisa/unit
    Then I verify the FCA charge <FCA charge>

    Examples: 
      | unit | FCA charge |
      |   40 |        5.2 |
      |   50 |        6.5 |

  Scenario Outline: Calculate Duty Charge Units consumed upto 50 units
    Given my duty charge slab is <duty slab>
    When I check for the slab wise duty charges
    And I add FCA on duty charges
    Then I verify the Total Duty Charge <Total duty charge>

    Examples: 
      | unit | duty slab | Total duty charge |
      |   40 |      0.09 |             4.068 |
      |   50 |      0.09 |             5.085 |

  Scenario Outline: Calculate Total Charges Units consumed upto 50 units
    Given my units are upto 50 and duty slab is 0.09
    When I check for the Total bill amount
    Then I verify the Total amount <Total bill amount>

    Examples: 
      | unit | Total bill amount |
      |   40 |           171.268 |
      |   50 |           214.085 |
