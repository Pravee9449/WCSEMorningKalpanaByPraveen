package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) throws Throwable {
		//String key= "webdriver.chrome.driver";
	    //String value="./drivers/chromedriver.exe";
		//System.setProperty(key, value);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.id("email")).sendKeys("9449708286");
	    Thread.sleep(5000);
	    driver.findElement(By.name("pass")).sendKeys("8884209957@Pr");
	    Thread.sleep(5000);
	    driver.findElement(By.name("login")).click();
	}

}
