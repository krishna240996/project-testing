package org.dailytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("krisskrishna");	
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("tripleK");
		
		WebElement btnlogin = driver.findElement(By.id("loginbutton"));
		btnlogin.click();
		
	}

}
