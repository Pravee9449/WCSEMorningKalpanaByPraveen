package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHoverActionTest {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/?ef_id=8e5538825d7d12933a9d5a7fc6de38cc:G:s&s_kwcid=AL!739!10!76484920232329!76485137405439&semcmpid=sem_F1167BY7_Brand_adcenter");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//div[.='Fashion']"));
		Thread.sleep(3000);
		Actions act= new Actions(driver);
	    Thread.sleep(4000);
	    act.moveToElement(ele).perform();
	    Thread.sleep(5000);
		
		driver.close();
	
	}

}
