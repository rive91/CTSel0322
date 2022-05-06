package commonClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WrapClass {
	
	public static void sendKeys(WebElement webElementUI, String textToSend) {
		webElementUI.sendKeys(textToSend);
	}
	
	public static void click(WebElement webElementUI) {
		webElementUI.click();
	}
	
	public static void selectByText(WebElement webElementUI, String textToSelect) {
		Select jobTitleDrpDwn = new Select(webElementUI);
		jobTitleDrpDwn.selectByVisibleText(textToSelect);	
	}

}
