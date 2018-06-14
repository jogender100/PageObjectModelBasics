package Demo.Pages;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	ResourceBundle pageElements;
	WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		pageElements= ResourceBundle.getBundle("Element");
	}
	
	public void enterUserID(String uid)
	{
		driver.findElement(By.cssSelector(pageElements.getString("useridCSS"))).sendKeys(uid);;
	}

	public void enterPassword(String password)
	{
		driver.findElement(By.cssSelector(pageElements.getString("passwordCSS"))).sendKeys(password);;
	}
	
	public void clickButtonUserIdNext()
	{
		
		driver.findElement(By.cssSelector(pageElements.getString("ButtonUserIdNextCSS"))).click();
		//driver.findElement(ButtonUserIdNext).click();
	}
	
	public void clickButtonPasswordNext()
	{
		driver.findElement(By.cssSelector(pageElements.getString("ButtonPasswordNextCSS"))).click();
		
	}
	
	public void clickButtonGmail()
	{
		driver.findElement(By.cssSelector(pageElements.getString("ButtonGmailCSS"))).click();
		
	}
	
	public void clickMenuLogout()
	{
		driver.findElement(By.cssSelector(pageElements.getString("MenuLogoutCSS"))).click();
	}
	
	public void clickButtonLogout()
	{
		driver.findElement(By.cssSelector(pageElements.getString("ButtonLogoutCSS"))).click();
	}
}
