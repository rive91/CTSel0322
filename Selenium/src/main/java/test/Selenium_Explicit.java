package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Explicit {

	public static void main(String[] args) {
		String exePath = "./driver/chromedriver.exe"; //especificar la ruta del ChromeDriver
		System.setProperty("webdriver.chrome.driver", exePath); //Agregando la propepiedas con la ruta del chrome driver
		
		WebDriver driver = new ChromeDriver(); //Objeto de webDriver
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();//Maxizimar Ventana
		
		WebElement userName = new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.id("btnLogin123")));
		

	}

}
