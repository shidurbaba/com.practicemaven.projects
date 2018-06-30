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

public class PracticeSelenium_Action_1 extends TestBase {

	public static void main(String[] args) throws IOException, InterruptedException {
		PracticeSelenium_Action_1 psa = new PracticeSelenium_Action_1();
		TestBase.initializeDriver();
		/* Navigate to lets kodeit */
		System.out.println(prop.getProperty("url"));

		driver.navigate().to(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		psa.scrollUpDown("0", "700");
		Thread.sleep(2000);

		String mouseHover = prop.getProperty("MouseHover");
		String top = prop.getProperty("MouseHoverTop");
		String reload = prop.getProperty("MouseHoverReload");
		WebElement hoverAction = driver.findElement(By.xpath(mouseHover));
		WebElement mousetop = driver.findElement(By.xpath(top));
		WebElement mousereload = driver.findElement(By.xpath(reload));

		psa.mouseHoverAction(hoverAction);
		psa.mouseHoverAction(mousetop);
		psa.mouseHoverClick(mousetop);
		
		driver.quit();
	}
}
