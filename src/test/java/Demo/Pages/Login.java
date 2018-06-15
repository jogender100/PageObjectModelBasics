package Demo.Pages;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
	ResourceBundle pageElements;
	WebDriver driver;
	WebDriverWait wait;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		pageElements= ResourceBundle.getBundle("Element");
		wait=new WebDriverWait(driver, 20);
	}
	
	public void enterUserID(String uid)
	{
		driver.findElement(By.cssSelector(pageElements.getString("useridCSS"))).sendKeys(uid);;
	}

	public void enterPassword(String password)
	{
WebElement password1 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(pageElements.getString("passwordCSS"))));

		password1.sendKeys(password);
		//driver.findElement(By.cssSelector(pageElements.getString("passwordCSS"))).sendKeys(password);;
		//driver.findElement(By.xpath(pageElements.getString("passwordXPATH"))).sendKeys(password);
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
