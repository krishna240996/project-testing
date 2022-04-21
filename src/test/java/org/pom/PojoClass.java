package org.pom;

import org.dailytask.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {



	//POJOclass----Hotel
	public WebDriver driver;
	public void login(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtkrishna;

	@FindBy(id="password")
	private WebElement txt2409;
	
	@FindBy(name="login")
	private WebElement login;
	
	public WebElement gettxtkrishna() {
    return txtkrishna;
	}
	public WebElement gettxt2409() {
    return txt2409;
	}


}

