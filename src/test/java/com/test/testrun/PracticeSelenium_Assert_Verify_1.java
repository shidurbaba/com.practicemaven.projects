package com.test.testrun;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.base.TestBase;

public class PracticeSelenium_Assert_Verify_1 extends TestBase{

	@BeforeTest
	public void initialize(){
		try {
			TestBase.initializeDriver();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRun1() {
		String url = prop.getProperty("url");
		TestBase.navigateToUrl(url);
	}
	
	
	}


