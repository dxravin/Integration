package IntegrationPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class IntegrationClass {
	WebDriver driver= new FirefoxDriver();
	
	@Test
	public void main() {
		 driver.get("https://www.ultimatix.net/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.findElement(By.id("USER")).sendKeys("314374");
		  driver.findElement(By.id("PASSWORD")).sendKeys("5thMonth!");
		  driver.findElement(By.id("login_button")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     	}
	
	@AfterTest
	  public void afterTest() {
			  driver.quit();
	}
	  

}
