package pages;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class WindowHandlingPages extends PageObject {
	@FindBy(css="a[class='blinkingText']")
	public WebElementFacade blinktext;
	@FindBy(css="p[class='im-para red']")
	public WebElementFacade redText;
	@FindBy(id="username")
	public WebElementFacade sorted;
	String parentID;
	String emailID;

	public void selectBlink() {
		// TODO Auto-generated method stub
		blinktext.click();
		
		
	}

	public void emailSort() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		Set<String> windows =getDriver().getWindowHandles();// [parentid,chid ID]
		Iterator<String> it = windows.iterator();
		String data = it.next();
		parentID = it.next();
		String childId = it.next();
		getDriver().switchTo().window(childId);
		
		System.out.println(redText.getText());
		redText.getText();
		emailID = redText.getText().split("at")[1].trim().split(" ")[0];
		System.out.println(redText.getText().split("at")[1].trim().split(" ")[0]);// to split any text
		
	}

	public void switchingBack() {
		// TODO Auto-generated method stub
		getDriver().switchTo().window(parentID);
		
	}

	public void inputSortedEmail() {
		sorted.sendKeys(emailID);
		// TODO Auto-generated method stub
		
	}

}
