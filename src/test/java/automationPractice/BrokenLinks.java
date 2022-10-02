
package automationPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

private static WebDriver driver = null;
private static HttpURLConnection huc = null;
public static void main(String[] args) {
// TODO Auto-generated method stub

String homepage="http://www.gmail.com";
WebDriverManager.chromedriver().setup();
driver= new ChromeDriver();
driver.get(homepage);

List<WebElement> links=driver.findElements(By.tagName("a"));
for(WebElement link:links) {
	String url=link.getAttribute("href");
	
	if(url==null || url.isEmpty())
	{
		continue;
	}
	
	if(!url.startsWith(homepage))
	{
		continue;
	}
	
	
try {
	huc	=(HttpURLConnection)(new URL(url).openConnection());
	
	huc.connect();
	huc.setRequestMethod("HEAD");
	int resCode=huc.getResponseCode();
	
	if(resCode >= 400) {
		System.out.println("link is broken "+resCode);
	}
	else {
		System.out.println("link is invalid  "+resCode);
	}
	
	
} 
catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 
catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


}
driver.quit();
}
}
