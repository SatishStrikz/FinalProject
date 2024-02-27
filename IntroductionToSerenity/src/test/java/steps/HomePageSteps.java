package steps;

import java.util.List;

import io.cucumber.datatable.DataTable;
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
//public void userName(DataTable dataTable) {
//	List<List<String>>data = dataTable.asList(Type)List.class);
//	for(int i=0;i<=data.size();i++) {
//      homepage.enteringUsername(data.get(i).get(1));
//}}
//public void password(DataTable dataTable) {
//	// TODO Auto-generated method stub
//	homepage.enteringPassword(dataTable);
//	
//}

	



}
