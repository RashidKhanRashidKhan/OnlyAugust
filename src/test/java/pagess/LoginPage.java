package pagess;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import bases.ReusableMethods;


public class LoginPage extends ReusableMethods{
	
	
	
	public void go_to_login_page() {
            
WebElement LoginPage=driver.findElement(By.xpath("//a[@class='btn btn-xs uppercase']"));
LoginPage.click();

	}
	
	
	
	public void fill_valid_user_name(String userName) {
	  
		WebElement User=driver.findElement(By.xpath("(//input[@type='email'])[2]"));
		User.sendKeys(userName);
		
	}

	
	public void fill_valid_password(String password) {
		WebElement pass=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	pass.sendKeys(password);
	   
		
		
	}

	
	/*
	 * public void fill_valid_user_name() {
	 * 
	 * WebElement Email=driver.findElement(By.xpath("(//input[@type='email'])[2]"));
	 * Email.sendKeys(prop.getProperty("userName"));
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 * public void fill_valid_password() {
	 * 
	 * WebElement
	 * Pass=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	 * Pass.sendKeys(prop.getProperty("password"));
	 * 
	 * 
	 * }
	 */

	
	public void click_on_login_button() {

		WebElement LoginButton=driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		LoginButton.click();

    
        WebElement Validation=driver.findElement(By.xpath("//div[@class='header_info']"));
        Assert.assertTrue(Validation.isDisplayed());
       System.out.println("Assertion");
		
		
	}

	
	
	}
	
	
	

