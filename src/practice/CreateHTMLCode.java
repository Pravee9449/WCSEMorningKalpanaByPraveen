package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateHTMLCode {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("file:///C:/Users/Pravee/OneDrive/Desktop/Selenium%20html/cssexpr.html");
	    Thread.sleep(3000);
	    driver.findElement(By.tagName("input")).sendKeys("Ravi");
	   // driver.findElement(By.name("n1")).sendKeys("Praveen");
	   // driver.findElement(By.id("a1")).sendKeys("Hii guys");
	   
	    Thread.sleep(5000);
	    driver.close();
	}

}
