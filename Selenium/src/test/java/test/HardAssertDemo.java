package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDemo {
	@Test
	public void verificarTituloDePagina() {
		String exePath = "./driver/chromedriver.exe"; // especificar la ruta del ChromeDriver
		System.setProperty("webdriver.chrome.driver", exePath); // Agregando la propepiedas con la ruta del chrome driver
		WebDriver driver = new ChromeDriver(); // Objeto de webDriver

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();// Maxizimar Ventana
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM_5";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		boolean titulo = actualTitle.equals(expectedTitle);
		
		Assert.assertTrue(titulo);
	}
}
