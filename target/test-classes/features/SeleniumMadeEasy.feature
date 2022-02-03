Feature: SeleniumMAdeEasy

  Background:
    Given user logs in to the Application
    And user passes "XpathFile" file to retrieve related xPaths

@deneme
    Scenario: User use commondxPath
      Given user enters value "xuser, Gmi1234" into the designated "username, password" fields
      And user clicks on the "SignIn_Button"
      Given user validates values "Sign In, Failed to sign in! Please check your credentials and try again." as "Login_Title, Login_Failure_Message"

