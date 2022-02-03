Feature:As a user I am  able to create an account on Amazon.com

  Scenario: User create an account on amazon
       Given user goes to "app_url"
        And  user move to Account_List dropdown button
        And  user click the start here link
        And user enter the all data for create an account
        Then  verify the Solve this puzzle to protect your account text is appear

