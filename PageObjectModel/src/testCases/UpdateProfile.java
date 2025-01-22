package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.UpdateProfileObjects;
import pageObjects.loginPageObjects;

public class UpdateProfile {

	@Test
		public void updateProfile() throws InterruptedException {
			
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
	
			
			UpdateProfileObjects.myProfileButton(driver).click();
			UpdateProfileObjects.passwordUpdate(driver).sendKeys("demouser");
			UpdateProfileObjects.phoneNumber(driver).sendKeys("1234567");
			UpdateProfileObjects.cityName(driver).sendKeys("Bangalore");
			UpdateProfileObjects.UpdateClickButton(driver).click();
			
			
			/*WebElement myProfile = driver.findElement(By.xpath("//a[.=' My Profile']"));
			myProfile.click();
			Thread.sleep(3000);
			WebElement password1 = driver.findElement(By.id("Password"));
			password1.sendKeys("demouser");
			WebElement phoneNumber = driver.findElement(By.id("Phone"));
			phoneNumber.sendKeys("123456");
			WebElement cityName = driver.findElement(By.id("City"));
			cityName.sendKeys("Bangalore");
			Thread.sleep(3000);
			WebElement updateButton = driver.findElement(By.xpath("//button[.='Update Profile']"));
			updateButton.click();*/
	
	
	}
}
