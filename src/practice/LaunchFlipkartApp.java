package practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFlipkartApp {

	public static void main(String[] args) throws Throwable {
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.manage().window().notify();
		//Thread.sleep(2000);
		driver.get("https://www.flipkart.com/?ef_id=244f0739d6521b6e836e65da9e233f20:G:s&s_kwcid=AL!739!10!76484920232329!76485137405439&semcmpid=sem_F1167BY7_Brand_adcenter");
		//Point ij = driver.manage().window().getPosition();
		//System.out.println(ij);
		//List<WebElement> ele = driver.findElements(By.xpath("//a"));
		//System.out.println(tags);
		//int count = ele.size();
		//System.out.println(count);
		//for (WebElement one : ele) {
		//String text = one.getText();
		//System.out.println(text);
		//	
		//}
		
		driver.close();

	}

}
