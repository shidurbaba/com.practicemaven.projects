package com.test.testng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.base.TestBase;

public class testngDropDown extends TestBase {
	
	@BeforeTest
		public void initializer() throws IOException {
			initializeDriver();
			urlWindowMaximize();
			getToUrl("url");
			urlImplicitWait(2000, TimeUnit.SECONDS);
	}
	
	@Test
		public void testMethod1() throws InterruptedException {
			WebElement element = driver.findElement(By.id("carselect"));
			choose = selectInstantiation(element);
			chooseAndPrintAll(choose);
			Thread.sleep(1000);
	}
	
	@AfterTest
		public void teardown() {
			driver.close();
	}
}
