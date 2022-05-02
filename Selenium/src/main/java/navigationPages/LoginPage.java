package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);//Inicialiamoz los PageObjects/WebElements con Page Factory
										//THIS es un keyword de hava con el que estamos indicacno que es la misma clase donde vamos a incializar los webelements
	}
	
	//Login PageObject/WebElements
	@FindBy(id="txtUsername")
	private WebElement userNameTxt;
	@FindBy(id="txtPassword")
	private WebElement passwordTxt;
	@FindBy(id="btnLogin")
	private WebElement btnLogin;
	
	public void login(String user, String password) {
		WrapClass.sendKeys(userNameTxt, user);
		WrapClass.sendKeys(passwordTxt, password);
		WrapClass.click(btnLogin);
	}

}
