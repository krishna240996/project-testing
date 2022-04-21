package org.dailytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;

public  void browserConfigchrome() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
}

public void openURL (String url) {
	driver.get("https://adactinhotelapp.com/");
	}	
	
public void maximizeWindow() {
    driver.manage().window().maximize();
    }

public  WebElement  locatorByID(String id) {
	WebElement findElement=driver.findElement(By.id(id));
	return findElement;
	
}

public void inputtext (WebElement element,String value) {
	element.sendKeys(value);
}
public void click (WebElement element) {
	element.click();
}

public void close() {
	driver.close();
}

public void quit() {
	driver.quit();
}

public String getthetext(WebElement element) {
	String text = element.getText();
	return text;
}
public String gettheAttribute(WebElement element,String value) {
	String attribute = element.getAttribute(value);
	return attribute;
}
	
public WebElement actionsel(String xpath){
	WebElement Inkaction =driver.findElement(By.xpath("xpath"));
	return Inkaction;
}
 








}
	
