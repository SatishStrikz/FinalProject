Feature: To verify OrangeHRM Application


@OrangeHRM
Scenario Outline: To test the functionality of OrangeHRM Application
Given User is landed on the orange hrm login page
Then user enters username "<Username>"
#Then user enters username

#|Username|Admin|

Then user enters password "<Password>"
#Then user enters password
#Password|admin123|
Then user clicks on login button
Then user validate quick launch text "<QuickLaunchText>"




                 
Examples:
|Username|Password|QuickLaunchText|
|Admin|admin123|Quick Launch|