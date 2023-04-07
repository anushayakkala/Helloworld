package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class HelloWorld {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Webdrivers\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Webdrivers\\chrome\\msedgedriver.exe");
		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://www.google.com");
		
		
		
		
		
		
		
	}

}
