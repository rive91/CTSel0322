package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Implicit {

	public static void main(String[] args) {
		String exePath = "./driver/chromedriver.exe"; //especificar la ruta del ChromeDriver
		System.setProperty("webdriver.chrome.driver", exePath); //Agregando la propepiedas con la ruta del chrome driver
		
		WebDriver driver = new ChromeDriver(); //Objeto de webDriver
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();//Maxizimar Ventana
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		
		WebElement userName = driver.findElement(By.id("txtUsernameCountry"));


	}

}
