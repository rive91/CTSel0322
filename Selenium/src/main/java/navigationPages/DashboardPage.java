package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class DashboardPage {
	
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);//Inicialiamoz los PageObjects/WebElements con Page Factory
										//THIS es un keyword de hava con el que estamos indicacno que es la misma clase donde vamos a incializar los webelements
	}
	
	//Login PageObject/WebElements
	@FindBy(id = "welcome")
	private WebElement welcomeDropDown;
	@FindBy(xpath = "//*[@id=\"welcome-menu\"]/ul/li[3]/a")
	private WebElement logoutLink;
	
	public void logout() {
		WrapClass.click(welcomeDropDown);
		WrapClass.click(logoutLink);

	}

}
