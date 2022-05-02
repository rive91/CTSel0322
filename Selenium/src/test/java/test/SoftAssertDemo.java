package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	
	SoftAssert softAssert = new SoftAssert();
  @Test
  public void verificarTitulo() {
		String exePath = "./driver/chromedriver.exe"; // especificar la ruta del ChromeDriver
		System.setProperty("webdriver.chrome.driver", exePath); // Agregando la propepiedas con la ruta del chrome driver
		WebDriver driver = new ChromeDriver(); // Objeto de webDriver

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();// Maxizimar Ventana

		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		String badTitle = "OraneASD";
		
		softAssert.assertEquals(actualTitle, badTitle);
		softAssert.assertEquals(actualTitle, expectedTitle);
		
		softAssert.assertAll();

  }
}
