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

public class PracticeSelenium_Action_2 extends TestBase {

	public static void main(String[] args) throws IOException, InterruptedException {
		PracticeSelenium_Action_2 psa = new PracticeSelenium_Action_2();
		TestBase.initializeDriver();
		/* Navigate to JQuery UI */
		System.out.println(prop.getProperty("url_2_jquery_droppable"));

		driver.navigate().to(prop.getProperty("url_2_jquery_droppable"));
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		psa.switchToFrameByIndex(0);
		Thread.sleep(3000);
		WebElement element1 = driver.findElement(By.id(prop.getProperty("DragMeToMyTarget")));
		WebElement element2 = driver.findElement(By.id(prop.getProperty("Dropped")));
		psa.mouseDragAndDropMethodTwo(element1, element2);
		Thread.sleep(3000);
		driver.quit();
	}
}
