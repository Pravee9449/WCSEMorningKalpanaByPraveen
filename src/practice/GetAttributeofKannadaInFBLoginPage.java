package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeofKannadaInFBLoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		String attributeValue = ele.getAttribute("href");
		System.out.println(attributeValue);
		
		
	}

}
