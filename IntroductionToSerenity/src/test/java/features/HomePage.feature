Feature: To verify BookMyShow Application



Scenario Outline:   To test the functionality of BMS Application


Given User is landed on the orange hrm login page
Then user enters username "<Username>"
Then user enters password "<Password>"
Then user clicks on login button
Then user validate quick launch text "<QuickLaunchText>"


                  

Examples:
|Username|Password|QuickLaunchText|
|Admin|admin123|Quick Launch|