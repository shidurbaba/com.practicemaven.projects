package com.test.util;

import org.openqa.selenium.By;

import com.test.base.TestBase;

public class TestUtil extends TestBase {

	public static By getObjectParser(String locatorName) {
		By locator = null;
		String locatorProperty = prop.getProperty(locatorName);
		String locatorType  = locatorProperty.split(";")[0];
		String locatorValue = locatorProperty.split(";")[1];
		
			if(locatorType == "Id") {
				locator = By.id(locatorValue);
			}else {
				locator = By.xpath(locatorValue);
			}
		return locator;
	}

}
