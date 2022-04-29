package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Practica {

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
		
		//Metodos del explorador
		String title = driver.getTitle();
		System.out.println("El titulo es: " + title);
		
		//Validacion de URL
		String url = driver.getCurrentUrl();
		System.out.println("URL actual: " + url);
		
		//Metodos de navegacion
		//driver.navigate().back();
		//Thread.sleep(3000);
		//driver.navigate().forward();
		//Thread.sleep(3000);
		//driver.navigate().refresh();
		
		//Click en assignLeave
		WebElement assignLeaveBtn = driver.findElement(By.className("quickLinkText"));
		assignLeaveBtn.click();
		
		//Verificar elemento desplegado en la pagina
		boolean assignBtnisPresent = driver.findElement(By.id("assignBtn")).isDisplayed();
		if(assignBtnisPresent) {
			System.out.println("El boton Assign esta desplegado");
		}
		
		//Verificar texto
		String welcomeMsj = driver.findElement(By.id("welcome")).getText();
		
		boolean msj = welcomeMsj.contains("Tim");//Contains() es un metodo para comparar 2 strings
		
		if(msj) {
			System.out.println("El welcome meessage contiene el nombre de Tim");
		}else {
			System.out.println("ERROR: el mensaje no contiene el nombre de Tim");
		}
		
		//DropDowns
		Thread.sleep(2000);
		Select drpdwnLeaveType = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
		drpdwnLeaveType.selectByVisibleText("US - FMLA");
		Thread.sleep(2000);
		drpdwnLeaveType.selectByIndex(3);
		Thread.sleep(2000);

		
		//Cerrando navegar
		//driver.close();//Cierra la ventana actual que el webdriver esta utilizando
		driver.quit();//Cierra todas las ventana que el webdriver haya abierto en la ejecucion

	}

}
