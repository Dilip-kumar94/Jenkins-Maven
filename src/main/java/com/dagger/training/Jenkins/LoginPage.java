package com.dagger.training.Jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver dr;
	
	public LoginPage(WebDriver dr) {
		this.dr=dr;
	}
	
	public String getTit() {
		return dr.getTitle();
	}
	public void clickLink(String locator) {
		dr.findElement(By.linkText(locator)).click();
	}
}
