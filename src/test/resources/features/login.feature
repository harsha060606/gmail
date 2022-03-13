Feature: yahoo login module


  Scenario Outline: validation of login module with credintials
    Given open "chromebrowser" with "https://login.yahoo.com/"
    When enter valid username "<username>"
    And click username next button
    Then validate username page should be redirected to password page
    When Enter valid password "<password>"
    And click password next button
    Then validate password page should be redirected to mail inbox page
    Examples: 
      | username  | password |
      | sriharshn | yah06yah |
