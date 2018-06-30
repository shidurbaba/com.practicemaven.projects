package com.test.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.test.dummyclass.SumAndSub;

public class testngSum {

	@Test
	public void testmethod1() {
		SumAndSub sas = new SumAndSub();
		SoftAssert sa = new SoftAssert();
		int result = sas.add(1, 2);
		sa.assertEquals(result, 2);
		System.out.println("\nLine after assert 1");
		sa.assertEquals(result, 3);
		System.out.println("\nLine after assert 2");
		sa.assertAll();
	}
}
