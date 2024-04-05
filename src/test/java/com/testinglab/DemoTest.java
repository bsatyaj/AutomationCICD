package com.testinglab;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void passedTest() {
		System.out.println("Passed Test");
		String browserName = System.getProperty("browser");
		System.out.println("Browser lunched in : " + browserName);
		Assert.assertEquals("Passed", "Passed");
	}
	
	@Test
	public void failedTest() {
		System.out.println("Failed Test");
		String browserName = System.getProperty("browser");
		System.out.println("Browser lunched in : " + browserName);
		Assert.assertEquals("Failed", "Passed");
	}
}
