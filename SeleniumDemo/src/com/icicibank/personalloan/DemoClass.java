package com.icicibank.personalloan;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver");
		ChromeDriver driver=new ChromeDriver();
	}
}
