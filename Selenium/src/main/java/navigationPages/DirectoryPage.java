package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class DirectoryPage {
	
	public DirectoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);//Inicialiamoz los PageObjects/WebElements con Page Factory
										//THIS es un keyword de hava con el que estamos indicacno que es la misma clase donde vamos a incializar los webelements
	}
	
	//WebElements de la pagina de Directory Page
	@FindBy(id = "searchDirectory_emp_name_empName")
	private WebElement name;
	@FindBy(id = "searchDirectory_job_title")
	private WebElement drpDwnJobTitle;
	@FindBy(id = "searchDirectory_location")
	private WebElement drpDwnLocation;
	@FindBy(id = "searchBtn")
	private WebElement searchBtn;
	@FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b")
	private WebElement searchResult;
	
	public void searchName(String nameTosearch) {
		WrapClass.sendKeys(name, nameTosearch);
	}
	
	public void selectJobTitle(String textToSelect) {
		WrapClass.selectByText(drpDwnJobTitle, textToSelect);
	}
	
	public void selectLocation(String textToSelect) {
		WrapClass.selectByText(drpDwnLocation, textToSelect);
	}
	
	public void clickSearchBtn() {
		WrapClass.click(searchBtn);
	}
	
	public boolean userPresent(String expectedUsername) {		
		return searchResult.getText().contains(expectedUsername);
	}
}
