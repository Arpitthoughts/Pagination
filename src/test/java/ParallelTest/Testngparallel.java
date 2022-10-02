package ParallelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testngparallel {
	WebDriver driver;
	
	@Test
	public void paratest1() {
		
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://google.com");
	
		
	}


	@Test
	public void paratest2() {
		
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	driver.get("https://www.javatpoint.com/");
	
		
	}


}
