Feature: Way2sms login
  Scenario: validate site launching
    Given launch site using "chrome"
    Then title contains "free"
    And close site

  
  Scenario Outline: validate login validations
    Given launch site using "chrome"
    When enter mobile no as"<x>"
    And enter password as"<y>"
    And click login
    Then validate output criteria as "<z>"
    And close site

    Examples: 
      | x        |   y      |     z      |
      |          |9704197258| mbno blank |
      |9100748987|          | pwd blank  |
      |9100000000|9704197258|mbno invalid|
      |9100748987|975215622 |pwd invalid |
      |9100748987|9704197258|all valid   |