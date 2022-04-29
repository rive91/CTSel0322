package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_FindElements {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "./driver/chromedriver.exe"; //especificar la ruta del ChromeDriver
		System.setProperty("webdriver.chrome.driver", exePath); //Agregando la propepiedas con la ruta del chrome driver
		
		WebDriver driver = new ChromeDriver(); //Objeto de webDriver
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();//Maxizimar Ventana
		
		
		//Obteniendo objetos/WebElements de la pagina web
		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		
		//Login
		userName.sendKeys("Admin");
		Thread.sleep(2000);
		password.sendKeys("admin123");
		Thread.sleep(2000);
		btnLogin.click();
		Thread.sleep(2000);
		
		//FindElements
		List<WebElement> firstLevelMenu = driver.findElements(By.className("firstLevelMenu"));
		System.out.println("Numero de elementos en el menu: " + firstLevelMenu.size()); // Metodo de java para ver el numero de elementos en la lista
		//String primerMenu = firstLevelMenu.get(0).getText();
		//System.out.println(primerMenu);
		
		for(int i = 0; i<firstLevelMenu.size();i++) {
			System.out.println("El menu es: " + firstLevelMenu.get(i).getText());
		}

	}

}
