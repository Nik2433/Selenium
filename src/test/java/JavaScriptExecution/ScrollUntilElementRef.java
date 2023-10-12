package JavaScriptExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUntilElementRef {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		
	WebElement clickon = driver.findElement(By.xpath("//img[@alt='BrowserStack']"));
		
		 WebElement ScrollUP = driver.findElement(By.xpath("//h2[.='Selenium Level Sponsors']"));
		Thread.sleep(1000);
		
		//Scroll untill the element refrence
		
		JavascriptExecutor.js = driver;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
