package pages;




import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class HomePage extends PageObject{
	@FindBy(xpath="//input[@name='username']")
	public WebElementFacade inputUsername;
	@FindBy(xpath="//input[@name='password']")
	public WebElementFacade inputPassword;
	@FindBy(xpath="//button[@type='submit']")
	public WebElementFacade btnLogin;
	@FindBy(xpath="//p[text()='Quick Launch']")
	public WebElementFacade textQuickLaunch;
	
	
	
	

	public void enterUsername(String userName) {
		// TODO Auto-generated method stub
		inputUsername.sendKeys(userName);
		
	}

	public void enterPassword(String password) {
		// TODO Auto-generated method stub
		inputPassword.sendKeys(password);
		
	}

	public void clickLogin() {
//		 TODO Auto-generated method stub
		btnLogin.click();
		
		
		}

	public void user_validate_quick_launch_text(String quickLaunchText) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		Assert.assertEquals(quickLaunchText, textQuickLaunch.getText());
		
	}


	

}