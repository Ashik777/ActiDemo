package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Constants {
	public WebDriver driver;
	@BeforeMethod(alwaysRun=true)
	public void init() {
		System.setProperty(CHROME_KEY, CHROME_PATH);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(TEST_URL);
		
	}
	@AfterMethod(alwaysRun=true)
	public void close() {
		driver.quit();
	}


}
