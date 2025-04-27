package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	WebDriver driver;
	RegistrationPage registrationPage;
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	public RegistrationPage getRegistrationPage() {
		registrationPage = new RegistrationPage(driver);
		return registrationPage;
	}
	public void quitDriver() {
		driver.quit();
	}
}
