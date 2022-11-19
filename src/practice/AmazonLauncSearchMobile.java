package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLauncSearchMobile {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
	    ele.sendKeys("mobiles");
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    Thread.sleep(3000);
	    driver.close();
	}
}
