package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class hi {
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver","./soft/chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("https://www.flipkart.com");
		w.quit();
	}
}
