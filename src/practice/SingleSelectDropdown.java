package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdown {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Pravee/OneDrive/Desktop/Selenium%20html/SingleSelectDropdown1.html");
		WebElement ele = driver.findElement(By.id("Taj"));
		Select sel = new Select(ele);
		sel.selectByIndex(2);
		Thread.sleep(3000);
		sel.selectByValue("Z");
		Thread.sleep(3000);
		sel.selectByVisibleText("gobi");
		Thread.sleep(3000);
		driver.close();
	
	}

}
