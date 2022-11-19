package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeTheScreen {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		//Dimension d=new Dimension(200, 300);
		//driver.manage().window().setSize(d);
		//Point p=new Point(200, 300);
		//Thread.sleep(3000);
		//driver.manage().window().setPosition(p);
		
		driver.close();
	}

}
