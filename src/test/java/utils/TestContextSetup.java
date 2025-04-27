package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {

	
    public WebDriver driver;
    public PageObjectManager pageObjectManager;
    public TestBase testBase;
	public TestContextSetup() {
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
	}
}
