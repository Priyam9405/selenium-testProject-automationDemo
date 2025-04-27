package stepDefinitions;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PageObjectManager;
import pageObjects.RegistrationPage;
import utils.TestContextSetup;

public class RegistrationPageStepDefinitions {
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
RegistrationPage registrationPage;
	public RegistrationPageStepDefinitions(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;

	}
	
	@Given("User is on the Automation Demo site URL")
	public void user_is_on_the_automation_demo_site_url() {
	   
		  

	}

	@When("User enetrs all the informations {string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}")
	public void user_enetrs_all_the_informations(String firstName,String lastName,String address,String mail,String tel,String gender,String hobby,String language,String skill,String country,String dob,String password) {
		registrationPage = this.testContextSetup.pageObjectManager.getRegistrationPage();
		registrationPage.enterFirstName(firstName);
		registrationPage.enterLasttName(lastName);
		registrationPage.enterAddress(address);
		registrationPage.enterMail(mail);
		registrationPage.enterPhoneNumber(tel);
		registrationPage.enterGender(gender);
		registrationPage.enterHobby(hobby);
		registrationPage.selectLanguage(language);
		registrationPage.selectSkills(skill);
		registrationPage.selectCountry(country);
		registrationPage.selectDOB(dob);
		registrationPage.enterPassWord(password);
		registrationPage.enterConfirmPassWord(password);
		this.testContextSetup.pageObjectManager.quitDriver();
	}

	@When("clicks on Submit button")
	public void clicks_on_submit_button() {
	    
	}

	@Then("User will get successfully registered")
	public void user_will_get_successfully_registered() {
	    
	}
	
}
