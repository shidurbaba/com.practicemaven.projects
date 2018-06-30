package com.test.testng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.base.TestBase;
import com.test.dummyclass.PracticeClass;

public class testngPracticeDemo extends TestBase {

	@BeforeTest
	public void initializer() throws IOException {
		initializeDriver();
		navigateToUrl("url");
		urlWindowMaximize();
		urlImplicitWait(2000, TimeUnit.SECONDS);
	}

	@Test
	public void testmethod1() throws InterruptedException {
		WebElement element1 = driver.findElement(By.id(prop.getProperty("AlertTextBox")));
		element1.sendKeys("Hello Master");
		Thread.sleep(2000);
	}

	@Test
	public void testmethod2() throws InterruptedException {
		WebElement element1 = driver.findElement(By.id(prop.getProperty("AlertButton")));
		element1.click();
		Thread.sleep(3000);
	}

	@Test
	public void testmethod3() throws InterruptedException {
		popupAccept();
		Thread.sleep(2000);
	}

	@Test
	public void testmethod4() throws InterruptedException {
		WebElement element1 = driver.findElement(By.id(prop.getProperty("AlertTextBox")));
		element1.clear();
		Thread.sleep(2000);
		element1.sendKeys("Selenium Practitioner");
		
	}
	
	@Test
	public void testmethod5() throws InterruptedException {
		WebElement element2 = driver.findElement(By.id(prop.getProperty("AlertConfirmButton")));
		element2.click();
		Thread.sleep(2000);
		popupDismiss();
		
	}
	

	@AfterTest
	public void methodender() {
		driver.quit();
	}

}
