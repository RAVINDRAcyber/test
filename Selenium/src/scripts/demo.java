package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo
{	
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
driver.get("http://www.facebook.com");
 POM P = new POM(driver);
P.button();
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(2000);
P.button();
	}
}
