package com.test.testrun;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.test.base.TestBase;

public class PracticeSelenium_DropDown_1 extends TestBase {

	public static void main(String[] args) throws IOException, InterruptedException {
		TestBase.initializeDriver();
		PracticeSelenium_DropDown_1 dropdownclass = new PracticeSelenium_DropDown_1();
		System.out.println(prop.getProperty("url"));

		driver.navigate().to(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement dropelement = driver.findElement(By.id(prop.getProperty("DropDownMenu")));
		Select options = dropdownclass.selectInstantiation(dropelement);
		dropdownclass.chooseByValue("benz");
		dropdownclass.chooseByIndex(0);
		dropdownclass.chooseByText("Honda");
		dropdownclass.chooseByIndex(0);
		dropdownclass.chooseAndPrintAll(options);
		Thread.sleep(1000);
		driver.quit();

	}

}
