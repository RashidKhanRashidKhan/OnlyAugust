package bases;


import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends ReusableMethods {
	

	@Before
	public void launch_url() {
		
		String browserName=prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--incognito*");
		driver=new ChromeDriver(option);
		}
		else if(browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions option=new EdgeOptions();
			option.addArguments("--remote-allow-origins=*");
			option.addArguments("--incognito*");
			driver=new EdgeDriver(option);			
		}
		else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions option=new FirefoxOptions();
			option.addArguments("--remote-allow-origins=*");
			option.addArguments("--incognito*");
			driver=new FirefoxDriver(option);
		}
		
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(13));
		
		
		


	}
	@After
	public void tearDown(Scenario s) {
		
		if(s.isFailed()) {
			getScreenshot();
		}
		driver.quit();
	}
	
	
	
	
	
	
	

}
             


















