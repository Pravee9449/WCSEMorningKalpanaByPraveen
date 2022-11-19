package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElementUsingJSETest {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Pravee/OneDrive/Desktop/Selenium%20html/DisabledTextField.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('t1').value='World'");
	  //js.executeScript("document.getElementById('t1').value''");
		Thread.sleep(2000);
		driver.close();
	}

}
