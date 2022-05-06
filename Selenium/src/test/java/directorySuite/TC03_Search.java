package directorySuite;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.GlobalVariables;
import commonClasses.SetupDriver;
import navigationPages.DashboardPage;
import navigationPages.DirectoryPage;
import navigationPages.LoginPage;

public class TC03_Search {
  WebDriver driver = SetupDriver.setupDriver();

	// LoginPage Object
	LoginPage login = new LoginPage(driver);
	DashboardPage dashboard = new DashboardPage(driver);
	DirectoryPage directory = new DirectoryPage(driver);

	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		driver.manage().window().maximize();
	}

	@Test
	public void TC_03() {
		login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
		
		dashboard.clickMenuDirectory();
		
		directory.searchName("Nathan");
		
		directory.selectJobTitle("Sales Representative");
		
		directory.selectLocation("  United States");
		
		boolean isPresent = directory.userPresent("Nathan");
		
		Assert.assertTrue(isPresent);
		
		dashboard.logout();
	}
	
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
}
