package parallelTeting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallelExecution {
	
	WebDriver driver = null;
	
	@Test
	@Parameters({"browser"})
	public void loginZoho(String browser)
	{
		 if(browser.equalsIgnoreCase("chrome"))
		 {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		 }
		 else if(browser.equalsIgnoreCase("mozilla"))
		 {
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		 }
		 
		 driver.get("http://www.zoho.com");
		 driver.findElement(By.xpath("//a[text()='Login']")).click();
		 driver.findElement(By.xpath("//input[@id='lid']")).sendKeys("jainmayankengr@gmail.com");
		 driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("Zoho@123");
		 driver.findElement(By.xpath("//div[@id='signin_submit']")).click();
	}

}
