package com.test.testrun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.test.base.TestBase;

public class PracticeSelenium_Action_3 extends TestBase {

	public static void main(String[] args) throws IOException, InterruptedException {
		PracticeSelenium_Action_3 psa = new PracticeSelenium_Action_3();
		TestBase.initializeDriver();
		/* Navigate to JQuery UI */
		System.out.println(prop.getProperty("url_2_jquery_slidder"));

		driver.navigate().to(prop.getProperty("url_2_jquery_slidder"));
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		psa.switchToFrameByIndex(0);
		Thread.sleep(3000);
		WebElement element1 = driver.findElement(By.xpath(prop.getProperty("SlideHandle")));
		
		psa.mouseDragRelease(element1, 300, 0);
		Thread.sleep(3000);
		driver.quit();
	}
}
