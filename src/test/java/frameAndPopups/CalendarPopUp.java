package frameAndPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalendarPopUp {

	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");

		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		
		act.moveByOffset(10, 10).click().perform();
		//driver.findElement(By.xpath("//a[@class='close']")).click();
		Thread.sleep(1000);
 
		// Navigate to From and To Elements
		WebElement Src = driver.findElement(By.xpath("//input[@id='fromCity']"));
		
		WebElement Dst = driver.findElement(By.xpath("//input[@id='toCity']"));
		
		Src.sendKeys("Mumbai");

		driver.findElement(By.xpath("//p[.='Mumbai, India']")).click();
		
		Thread.sleep(1000);
		
		Dst.sendKeys("Del");
		driver.findElement(By.xpath("//p[.='New Delhi, India']")).click();
		
		Thread.sleep(1000);
		// navigate to departure
		//driver.findElement(By.xpath("//label[@for='departure']")).click();

		// navigate to desired date in calender
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@aria-label='Wed Aug 02 2023']")).click();
			
	}}
	
	


