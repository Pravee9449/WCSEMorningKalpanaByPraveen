package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHeightAndWidthWithoutUsingCSSValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		int width = ele.getSize().getWidth();
		System.out.println(width);
		int height = ele.getSize().getHeight();
		System.out.println(height);
		driver.close();
	}

}
