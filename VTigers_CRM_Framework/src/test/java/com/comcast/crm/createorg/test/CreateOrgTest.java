package com.comcast.crm.createorg.test;

import org.testng.annotations.Test;

public class CreateOrgTest {
	@Test
	public void sampleTest() {
		System.out.println("Create organization test started=========");

		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");

		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);

		System.out.println("=======Create organization test Ended");

	}

}
