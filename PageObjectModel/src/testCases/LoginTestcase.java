package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.loginPageObjects;

public class LoginTestcase {

	@Test
	public void loginPage() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		loginPageObjects.userName(driver).sendKeys("user@phptravels.com");
		loginPageObjects.password(driver).sendKeys("demouser");
		loginPageObjects.loginButton(driver).click();
		
		
		
		
		/*WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("user@phptravels.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("demouser");
		WebElement submitButton = driver.findElement(By.id("submitBTN"));
		submitButton.click();*/
}
}