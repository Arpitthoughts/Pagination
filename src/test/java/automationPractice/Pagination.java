package automationPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/toys?f=Categories%3ASoft%20Toys%20and%20Dolls");

		String totalProducts = driver.findElement(By.xpath("//span[@class='title-count']")).getText().split(" ")[1];
		// WebElement nextButton =
		// driver.findElement(By.xpath("//li[@class='pagination-next']"));
		List<String> babyToys = new ArrayList<>();

		while (true) {

			List<WebElement> products = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']/h4[1]"));
			for (WebElement name : products) {
				babyToys.add(name.getText());
				//System.out.println(name.getText());
			}
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,5200);");

			WebElement nextButton = driver.findElement(By.xpath("//li[@class='pagination-next']"));
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOf(nextButton));
			nextButton.click();
			
			
			Thread.sleep(2000);
			
			


		}

		/*
		 * catch (Exception e) { System.out.println("No more Baby toys found"); }
		 */

		// System.out.println(babyToys.size());
		// System.out.println(totalProducts);

		
		

	}

public static void waitPageToLoad(WebDriver driver) {
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));
}

}
