package cms.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverPage {
	
	public static WebDriver driver;

	
	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/fatemakhaleda/eclipse-workspace/Automation/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://portaldev.cms.gov/portal/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// for browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// for driver
	}

	@AfterMethod
	public void tearup() {
		driver.quit();
	}

	
	////
}

