package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateProfileObjects {

	public static WebElement myProfileButton(WebDriver driver) {
		 return driver.findElement(By.xpath("//a[.=' My Profile']"));
	}
	
	public static WebElement passwordUpdate(WebDriver driver) {
		return driver.findElement(By.id("Password"));
	}
	
	public static WebElement phoneNumber(WebDriver driver) {
		return driver.findElement(By.id("Phone"));
	}
	
	public static WebElement cityName(WebDriver driver) {
		return driver.findElement(By.id("City"));
	}
	public static WebElement UpdateClickButton(WebDriver driver) {
		return driver.findElement(By.xpath("//button[.='Update Profile']"));
	}
}
