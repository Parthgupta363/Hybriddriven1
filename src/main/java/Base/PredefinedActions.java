package Base;

import java.time.Duration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;




public class PredefinedActions {
	
	protected static WebDriver driver;
	static WebDriverWait wait;
	public static void launchBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Duration time = Duration.ofSeconds(60);
		wait = new WebDriverWait(driver, time);
	}
	
	public static void closeBrowser() {
		driver.quit();
	}
	
	

}
