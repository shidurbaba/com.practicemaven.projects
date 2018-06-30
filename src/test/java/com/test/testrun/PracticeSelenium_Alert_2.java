package com.test.testrun;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.base.TestBase;

public class PracticeSelenium_Alert_2 extends TestBase{

	public static void main(String[] args) throws IOException, InterruptedException {
		PracticeSelenium_Action_3 psa = new PracticeSelenium_Action_3();
		TestBase.initializeDriver();
		psa.navigateToUrl("url");
		psa.urlImplicitWait(1000, TimeUnit.SECONDS);
		psa.urlWindowMaximize();
		
		WebElement element1 = driver.findElement(By.id(prop.getProperty("AlertTextBox")));
		WebElement element2 = driver.findElement(By.id(prop.getProperty("AlertButton")));
		element1.sendKeys("Yeah Moses");
		element2.click();
		Thread.sleep(3000);
		psa.popupDismiss();
		
		driver.quit();
	}

}
