package steps;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import pages.WindowHandlingPages;

public class WindowHandlingSteps extends PageObject {
	WindowHandlingPages windohandlingpages;
	
	@Step("User Select Blink text")
	public void selectBlinkText() {
		// TODO Auto-generated method stub
		windohandlingpages.selectBlink();
		
	}
	@Step("User sort the email")
	public void sortEmail() throws InterruptedException {
		// TODO Auto-generated method stub
		windohandlingpages.emailSort();
		
	}
	@Step("User switch back to parent window")
	public void switchBack() {
		// TODO Auto-generated method stub
		windohandlingpages.switchingBack();
		
	}
	@Step("User input sorted")

	public void inputSorted() {
		// TODO Auto-generated method stub
		windohandlingpages.inputSortedEmail();
		
	}

}
