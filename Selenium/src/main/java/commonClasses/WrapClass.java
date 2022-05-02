package commonClasses;

import org.openqa.selenium.WebElement;

public class WrapClass {
	
	public static void sendKeys(WebElement webElementUI, String textToSend) {
		webElementUI.sendKeys(textToSend);
	}
	
	public static void click(WebElement webElementUI) {
		webElementUI.click();
	}

}
