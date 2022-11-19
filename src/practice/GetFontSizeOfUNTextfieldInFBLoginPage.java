package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFontSizeOfUNTextfieldInFBLoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		String size = ele.getCssValue("Font-Size");
	System.out.println(size);
	}

}
