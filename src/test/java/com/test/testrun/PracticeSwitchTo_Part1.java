package com.test.testrun;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.base.TestBase;

public class PracticeSwitchTo_Part1 extends TestBase {

	public static void main(String[] args) throws IOException, InterruptedException {
		TestBase.initializeDriver();
		PracticeSwitchTo_Part1 psa = new PracticeSwitchTo_Part1();
		psa.navigateToUrl("url");
		psa.urlImplicitWait(1000, TimeUnit.SECONDS);
		psa.urlWindowMaximize();

		WebElement windowbutton = driver.findElement(By.id(prop.getProperty("OpenWindow")));
		windowbutton.click();
		
		Thread.sleep(2000);

		
		//Storing window handles of parent and child inside my string variables parentwindow and child window
		Iterator<String> getAllWindow = psa.getAllWindowHandles().iterator();
		String parentwindow = getAllWindow.next();
		String childwindow = getAllWindow.next();

		psa.switchToWindow(childwindow);

		psa.urlWindowMaximize();

		Thread.sleep(3000);
		
		WebElement seleniumCourse = driver.findElement(By.xpath(prop.getProperty("SeleniumWithWebDriver")));
		seleniumCourse.click();
		psa.urlWindowMaximize();
		Thread.sleep(2000);
		
		driver.close();
		
		psa.switchToWindow(parentwindow);
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
