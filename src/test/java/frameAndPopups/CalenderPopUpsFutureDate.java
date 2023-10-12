package frameAndPopups;

import java.util.Date;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderPopUpsFutureDate {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");

		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		
		act.moveByOffset(10, 10).click().perform();
		
		Thread.sleep(1000);
		//identify source and distination
		WebElement Src = driver.findElement(By.xpath("//input[@id='fromCity']"));
		
		WebElement Dist = driver.findElement(By.xpath("//input[@id='toCity']"));
		
		Src.sendKeys("BOM"); 
		driver.findElement(By.xpath("//p[.='Mumbai, India']")).click();
		Thread.sleep(1000);
		Dist.sendKeys("BKK");
		driver.findElement(By.xpath("//p[.='Bangkok, Thailand']")).click();
		
		// navigate to any future Date date in calendar
				Thread.sleep(1000); 
		
		for(;;)//1 2 3 4 5
		{
			try 
			{ //not visible - exception - visible - click()
				driver.findElement(By.xpath("//div[@aria-label='Fri Oct 06 2023']")).click();
				break;
			} 
			catch (Exception e) 
			{//click on next month
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				Thread.sleep(1000);
			}
		}
		
		
		
	}
}
