package practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LanchbothChromeAndFirefox {

	public static void main(String[] args) {
			String key1 = "webdriver.chrome.driver";
			String value1 = "./drivers/chromedriver.exe";
			System.setProperty(key1, value1);
			ChromeDriver driver= new ChromeDriver();

			String key2 = "webdriver.gecko.driver";
			String value2 = "./drivers/geckodriver.exe";
			System.setProperty(key2, value2);
			FirefoxDriver driver2= new FirefoxDriver();
	}

}
