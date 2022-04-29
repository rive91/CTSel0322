package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_ejercicio1 {

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
		
		//Step 2: Click en el menu directory
		WebElement menuDirectory = driver.findElement(By.id("menu_directory_viewDirectory"));
		menuDirectory.click();
		
		//Step 3: Buscar por Nathan
		WebElement inputName = driver.findElement(By.id("searchDirectory_emp_name_empName"));
		inputName.sendKeys("Nathan");
		Thread.sleep(1000);
		
		//Step 4: Seleccionar el Job title "Sales Representative"
		Select jobtitleDrpDwn = new Select(driver.findElement(By.id("searchDirectory_job_title")));
		jobtitleDrpDwn.selectByVisibleText("Sales Representative");
		Thread.sleep(1000);
		
		//Step 5: Seleccionar la Location "  United States"
		Select locationDrpDwn = new Select(driver.findElement(By.id("searchDirectory_location")));
		locationDrpDwn.selectByVisibleText("  United States");
		Thread.sleep(1000);

		
		//Step 6: Click en search button
		WebElement searchBtn = driver.findElement(By.id("searchBtn"));
		searchBtn.click();
		Thread.sleep(2000);
		
		//Validacion
		String nameResult = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b")).getText();
		boolean nameContains = nameResult.contains("Nathan");
		
		if(nameContains) {
			System.out.println("El nombre esperado esta presente en la pagina");
		}else {
			System.out.println("ERROR: el nombre no esta presente");
		}

		driver.quit();
	}

}
