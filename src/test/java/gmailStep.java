import static org.junit.Assert.assertTrue;

import java.awt.List;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Set;
import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

import Demo.Base.CreateDriverInstance;
import Demo.Pages.Login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class gmailStep {

	Login loginPage;
	WebDriver driver;
	ResourceBundle config = ResourceBundle.getBundle("Configuration");

	@Given("^user navigates to GoogleMail website$")
	public void user_navigates_to_GoogleMail_website() throws Throwable {
		System.out.println("33344navigates_to_GoogleMail_website");
		System.out.println(System.getProperty("user.dir"));
		CreateDriverInstance driverInstance = new CreateDriverInstance();

		// Constructor will return driver & open URL GoogleAccount
		driver = driverInstance.generateDriverInstance();
		System.out.println("Page Laumched");
	}

	@When("^user entered the password$")
	public void user_entered_the_password() throws Throwable {
		loginPage.enterPassword(config.getString("password"));
		System.out.println("user_entered_the_password");
	}
	
	@When("^user entered the user name$")
	public void user_entered_the_user_name() throws Throwable {
		loginPage = new Login(driver);
		loginPage.enterUserID(config.getString("username"));
		loginPage.clickButtonUserIdNext();
		System.out.println("user_entered_the_user_name");
		// driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}



	@When("^user click Login button$")
	public void user_click_Login_button() throws Throwable {
		loginPage.clickButtonPasswordNext();
		System.out.println("user_click_Login_button");
	}

	@Then("^user should be successfully logged in$")
	public void user_should_be_successfully_logged_in() throws Throwable {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String loginName = driver.findElement(By.cssSelector("#yDmH0d > div.FaV4Jb.xAuNcb > c-wiz > div > div > div.hdPVYc.xpKNgc > div:nth-child(2) > c-wiz > div > div.PoG2cf > div > div.ZrQ9j"))
				.getText();
		System.out.println(loginName);
		Assert.assertTrue(loginName.equalsIgnoreCase("Welcome, Jogender Sharma"));
		// Assert.assertTrue(loginName).
		System.out.println("successfully_logged_in");
	driver.close();
	}

	//scenario2
	@Given("^user navigates to Wiki website$")
	public void user_navigates_to_Wiki_website() throws Throwable {
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver = new ChromeDriver();

		driver.get("https://www.wikipedia.org/");
	
	}

	@When("^user select the Language Hindi$")
	public void user_select_the_Language_Hindi() throws Throwable {
	   driver.findElement(By.cssSelector("#searchInput")).sendKeys("ENGLISH");
	   driver.findElement(By.cssSelector("#search-form > fieldset > button > i")).click();
	}

	@Then("^Search page is displayed$")
	public void search_page_is_displayed() throws Throwable {
	   System.out.println("Assert to be written");
	}
	
}
