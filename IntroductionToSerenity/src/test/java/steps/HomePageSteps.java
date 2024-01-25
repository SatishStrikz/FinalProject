package steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import pages.HomePage;

public class HomePageSteps extends PageObject {

	HomePage homepage;
@Step("User enters Username")
	public void enterUsername(String userName) {
		// TODO Auto-generated method stub
	homepage.enterUsername(userName);

	
		
	}
@Step("User enters password")
public void enterPassword(String password) {
	homepage.enterPassword(password);
	// TODO Auto-generated method stub
	
}
@Step("User clicks on login button")
public void clickLogin() {
	// TODO Auto-generated method stub
	homepage.clickLogin();
	
}
@Step("User validates quick launch text")
public void user_validate_quick_launch_text(String quickLaunchText) throws InterruptedException {
	homepage.user_validate_quick_launch_text(quickLaunchText);
	// TODO Auto-generated method stub
	
}

	



}
