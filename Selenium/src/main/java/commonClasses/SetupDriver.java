package commonClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupDriver {
	
	public static WebDriver setupDriver() {
		String exePath = "./driver/chromedriver"; //especificar la ruta del ChromeDriver
		System.setProperty("webdriver.chrome.driver", exePath); //Agregando la propepiedas con la ruta del chrome driver
		WebDriver driver = new ChromeDriver(); //Objeto de webDriver		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
