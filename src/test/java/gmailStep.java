import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Demo.Base.CreateDriverInstance;
import Demo.Pages.Login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class gmailStep {

	Login loginPage;
	WebDriver driver;
	@Given("^user navigates to GoogleMail website$")
	public void user_navigates_to_GoogleMail_website() throws Throwable {
	   System.out.println("333navigates_to_GoogleMail_website");
	   System.out.println(System.getProperty("user.dir"));
	   CreateDriverInstance driverInstance=new CreateDriverInstance();
	   driver=driverInstance.generateDriverInstance();
	  // System.setProperty("webdriver.chrome.driver", "C:\\Software\\ChromeDriver\\chromedriver.exe");
	   //System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	   
		//driver=new ChromeDriver();
	   //driver.get("https://accounts.google.com/");
	   System.out.println("Page Laumched");
	}

	@When("^user entered the user name$")
	public void user_entered_the_user_name() throws Throwable {
		System.out.println("user_entered_the_user_name");
	}

	@When("^user entered the password$")
	public void user_entered_the_password() throws Throwable {
		System.out.println("user_entered_the_password");
	}

	@When("^user click Login button$")
	public void user_click_Login_button() throws Throwable {
		System.out.println("user_click_Login_button");
	}

	@Then("^user should be successfully logged in$")
	public void user_should_be_successfully_logged_in() throws Throwable {
		System.out.println("successfully_logged_in");
	}


}
