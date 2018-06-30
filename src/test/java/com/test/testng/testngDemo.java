package com.test.testng;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.base.TestBase;
import com.test.dummyclass.PracticeClass;
import com.test.testrun.PracticeSelenium_Windows;

public class testngDemo extends TestBase {
	PracticeSelenium_Windows obj;

	@BeforeTest
	public void testMethod1() throws IOException {
		TestBase.initializeDriver();
		obj = new PracticeSelenium_Windows();
		obj.navigateToUrl("url");
		obj.urlWindowMaximize();
		obj.urlImplicitWait(1000, TimeUnit.MILLISECONDS);
	}

	@Test
	public void testMethod2() throws IOException, InterruptedException {
		WebElement windowElement = driver.findElement(By.id("openwindow"));
		windowElement.click();
		Thread.sleep(2000);
	}

	@Test
	public void testMethod3() throws InterruptedException {
		Iterator<String> allwindows = obj.getAllWindowHandles().iterator();
		String currentWindow = allwindows.next();
		String childWindow = allwindows.next();
		driver.switchTo().window(childWindow);
		obj.urlWindowMaximize();
		Thread.sleep(2000);
		driver.close();
	}

	@AfterTest
	public void testMethod4() {
		driver.quit();
	}

}
