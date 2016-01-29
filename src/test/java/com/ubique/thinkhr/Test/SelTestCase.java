package com.ubique.thinkhr.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.ubique.thinkhr.Utils.Log;


public class SelTestCase {

	public static WebDriver driver;

	@BeforeSuite
	public void setUp() {

		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("sTestCaseName");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shahnawaz\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		Log.info("New driver instantiated");
		// Entering the URL
		driver.get("https://learn.thinkhr.com/training/");
		Log.info("Opening the URL");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void tearDown() {
		captureScreen();
		driver.close();
		driver.quit();
		Log.info("Closing the browser");
		Log.endTestCase("THIS IS AN END");
	}

	public String captureScreen() {

		String path;
		try {
			WebDriver augmentedDriver = new Augmenter().augment(driver);
			File source = ((TakesScreenshot) augmentedDriver)
					.getScreenshotAs(OutputType.FILE);
			path = "./target/screenshots/" + source.getName();
			FileUtils.copyFile(source, new File(path));
		} catch (IOException e) {
			path = "Failed to capture screenshot: " + e.getMessage();
		}
		return path;

	}
	
	/*public void Home() {
		driver.findElement(By.xpath(".//*[@id='menu']/li[2]/a")).click();
		
		}
	
	public void LogOut() {
		driver.findElement(By.xpath(".//*[@id='menu']/li[3]/a")).click();
	}*/
	
}
