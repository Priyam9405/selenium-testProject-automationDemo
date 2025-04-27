package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	WebDriver driver;
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}

	By firstName = By.xpath("//input[@placeholder='First Name']");
	By lastName = By.xpath("//input[@placeholder='Last Name']");
	By address = By.xpath("//textarea[@ng-model='Adress']");
	By mail = By.xpath("//input[@type='email']");
	By tel = By.xpath("//input[@type='tel']");
	By password = By.xpath("//input[@id='firstpassword']");
	By confirmPassword = By.xpath("//input[@id='secondpassword']");

	

	By skills = By.xpath("//*[@id='Skills']");


	By year =By.xpath("//*[@id='yearbox']");
	By month =By.xpath("//*[@placeHolder='Month']");
	By date =By.xpath("//*[@placeHolder='Day']");

	By countryField =By.xpath("//*[@aria-labelledby='select2-country-container']");

	By countrySearch =By.xpath("//*[@type='search']");
	By countrySelect =By.xpath("//*[@id='select2-country-results']/li");


	By languageField =By.xpath("//div[@id='msdd']");


	public void enterFirstName(String firstname) {
		driver.findElement(firstName).sendKeys(firstname);

	}
	public void enterLasttName(String lastname) {
		driver.findElement(lastName).sendKeys(lastname);
	}
	public void enterAddress(String address1) {
		driver.findElement(address).sendKeys(address1);
	}
	public void enterMail(String email) {
		driver.findElement(mail).sendKeys(email);
	}
	public void enterPhoneNumber(String phoneNumber) {
		driver.findElement(tel).sendKeys(phoneNumber);
	}
	public void enterPassWord(String psw) {
		driver.findElement(password).sendKeys(psw);
	}
	public void enterConfirmPassWord(String psw) {
		driver.findElement(confirmPassword).sendKeys(psw);
	}
	public void enterGender(String gender) {
		driver.findElement(By.xpath("//input[@value='"+gender+"']")).click();
	}
	public void selectSkills(String skill) {
		new Select(driver.findElement(skills)).selectByVisibleText(skill);
	}
	public void enterHobby(String hobby) {
		driver.findElement(By.xpath("//input[@value='"+hobby+"']")).click();
	}
	public void selectDOB(String dob) {

	new Select(driver.findElement(year)).selectByVisibleText(dob.split("\\,")[1]);
	new Select(driver.findElement(month)).selectByVisibleText(dob.split(" ")[0]);
	new Select(driver.findElement(date)).selectByVisibleText(dob.split(" ")[1].split("\\,")[0]);
	}
	public void selectCountry(String country) {

	driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span")).click();

	driver.findElement(countryField).sendKeys("");
	
	driver.findElement(countrySearch).sendKeys(country);
	driver.findElement(countrySelect).click();
	}
	public void selectLanguage(String language) {
	driver.findElement(languageField).click();
	driver.findElement(By.linkText(language)).click();
	driver.findElement(password).click();
}
}