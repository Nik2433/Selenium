package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHolds {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//Step2: Maximize the window
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		WebElement ClickAndHolds = driver.findElement(By.xpath("//button[.='Click Me']"));
		 //Click And Holds Operation 
		Actions act = new Actions(driver);
		
		act.clickAndHold(ClickAndHolds).perform();
		System.out.println("Click");
		
		Thread.sleep(2000);
		
		act.release(ClickAndHolds).perform();
		System.out.println("Release");
	}	
}
