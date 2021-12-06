package com.dagger.training.Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver Dr;
	LoginPage LP;
	
	@BeforeClass
	public void sysSetup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		Dr=new ChromeDriver();
		LP=new LoginPage(Dr);
		Dr.get("https://www.facebook.com/");
		Dr.manage().window().maximize();
	}
	
	@Test
	public void clickForgotLink() {
		LP.clickLink("Forgotten password?");
		Assert.assertEquals(LP.getTit(),"Forgotten Password | Can't Log In | Facebook");
	}
	@Test
	public void navigateBack() {
		Dr.navigate().back();
		Assert.assertEquals(LP.getTit(),"Facebook – log in or sign up");
	}
	@AfterClass
	public void tearDown() {
		Dr.quit();
	}
	
}
