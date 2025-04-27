package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TestBase {
public WebDriver driver;
	public WebDriver WebDriverManager() {
		 System.setProperty("webdriver.chrome.driver", "src/test/java/resources/chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("https://demo.automationtesting.in/Register.html");
		    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[1]")));
			   Assert.assertEquals(driver.findElement(By.xpath("//h1[1]")).getText(), "Automation Demo Site");
		return driver;	   
	}
}
