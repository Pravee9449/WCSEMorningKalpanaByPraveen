package practice;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD_AscendingOrderUsingTreeSet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Pravee/OneDrive/Desktop/Selenium%20html/MultipleDropdown.html");
		WebElement ele = driver.findElement(By.id("Taj"));
		Select sel = new Select(ele);
		List<WebElement> option = sel.getOptions();
		int count = option.size();
		System.out.println(count);
		
		TreeSet<String> set = new TreeSet<String>();
		for (WebElement text : option) 
		{
			String alltext = text.getText();
			set.add(alltext);
		}
		for (String sortedtext : set) 
		{
			System.out.println(sortedtext);
			
		}
		
		driver.close();
	}

}
