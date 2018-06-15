package Demo.Base;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateDriverInstance {

	public WebDriver generateDriverInstance() {
		WebDriver driver;
		ResourceBundle config = ResourceBundle.getBundle("Configuration");
		System.out.println(config.getString("browser"));
		if (config.getString("browser").equalsIgnoreCase("chrome")) {
			System.out.println("bundle worked");
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(config.getString("applicationurl"));
		} else {
			System.out.println("Hello");
			driver = new ChromeDriver();
		}
		return driver;

	}

	public void CloseDriver(WebDriver driver) {

		driver.close();
	}

}
