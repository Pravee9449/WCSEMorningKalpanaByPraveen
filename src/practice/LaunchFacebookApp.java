package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebookApp {

	public static void main(String[] args) throws Throwable {
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String source=driver.getPageSource();
		System.out.println(source);
		driver.close();
	}

}
