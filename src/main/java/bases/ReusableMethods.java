package bases;


import org.openqa.selenium.interactions.Actions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethods {

	public static WebDriver driver;
	public static Properties prop;


	
	static {
		try {
			FileInputStream file=new FileInputStream("DataOfThisSite/SiteData.properties");
			
			prop=new Properties();
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
//001
   public void getScreenshot() {
	   TakesScreenshot ts=(TakesScreenshot) driver;
	  File srcFile= ts.getScreenshotAs(OutputType.FILE);
	  try {
		FileUtils.copyFile(srcFile, new File("Screenshotss/"+System.currentTimeMillis()+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
   }
//002
	public void ExplicityWait(WebElement ele) {
		WebDriverWait W = new WebDriverWait(driver, Duration.ofSeconds(10));
		W.until(ExpectedConditions.visibilityOf(ele));
	}
//003
	public void ExecutorClick(WebDriver ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}
//004
	public void Actionsss(WebElement ele, String value) {
		Actions A=new Actions(driver);
		A.doubleClick(ele);
		A.click(ele);
		A.contextClick(ele);
		A.moveToElement(ele);
		A.sendKeys(ele, value);
		A.sendKeys(Keys.ENTER).build().perform();;
		
	}
	//005
	public void JavaScriptClick(WebDriver ele) {
		JavascriptExecutor jp=(JavascriptExecutor) driver;
		jp.executeScript("arguments[0].click();", ele);
	}
}












