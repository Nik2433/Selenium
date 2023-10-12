package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveringAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		//Step2: Maximize the window
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Actions act= new Actions(driver);
		
		act.moveByOffset(10, 10).click().perform();
		System.out.println("move by offset value");
		Thread.sleep(1000);
         //driver.findElement(By.xpath("//button[.='X']")).click();
      
         
         //mouse hovring action

 		WebElement element=driver.findElement(By.xpath("//div[.='Electronics']"));
 		//Actions act= new Actions(driver);
 		act.moveToElement(element).perform();
 		System.out.println("mouse hovring action");
         
 		WebElement element1=driver.findElement(By.xpath("//a[.='Gaming']"));
 		Actions act1= new Actions(driver);
 		act1.moveToElement(element1).perform();
 		System.out.println("Game hovring action");
	}

}
