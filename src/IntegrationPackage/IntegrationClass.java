package IntegrationPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class IntegrationClass {
	WebDriver driver= new FirefoxDriver();
	
	@Test
	public void main() {
		driver.get("https://services.ultra.me/login.php");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     	}
	
	@AfterTest
	  public void afterTest() {
			  driver.quit();
	}
	  

}
