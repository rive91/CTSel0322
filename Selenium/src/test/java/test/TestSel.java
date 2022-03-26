package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSel {
	@Test
	public void selenium_test01() {
		String exePath = "./driver/chromedriver.exe"; // especificar la ruta del ChromeDriver
		System.setProperty("webdriver.chrome.driver", exePath); // Agregando la propepiedas con la ruta del chrome driver
		WebDriver driver = new ChromeDriver(); // Objeto de webDriver
		driver.get("https://www.google.com");
	}
}
