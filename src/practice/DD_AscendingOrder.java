package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD_AscendingOrder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Pravee/OneDrive/Desktop/Selenium%20html/MultipleDropdown.html");
		WebElement ele = driver.findElement(By.id("Taj"));
		Select sel = new Select(ele);
		List<WebElement> option = sel.getOptions();
		int count = option.size();
		System.out.println(count);
		
		ArrayList list = new ArrayList<String>();
		for (int i = 0; i < args.length; i++) 
		{
			
		}
		driver.close();
		
		
		}

}
