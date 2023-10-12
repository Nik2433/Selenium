package frameAndPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(1000);
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		alert.dismiss();
		
		String successMsg = driver.findElement(By.xpath("//span[@class='text-success']")).getText();
        System.out.println(successMsg);
        
        
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(3000);
		alert.sendKeys("Nik");
		Thread.sleep(3000);
		alert.accept();
       String Msg = driver.findElement(By.xpath("(//span[@class='text-success'])[2]")).getText();
   
	System.out.println(Msg);
	}
 
}
