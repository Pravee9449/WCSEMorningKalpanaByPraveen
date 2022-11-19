package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws IOException, Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("./data.properties");
		p.load(fis);
		WebDriver driver= new ChromeDriver();
		driver.get("url");
		driver.findElement(By.id("email")).sendKeys("username");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.close();

	}

}
