package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffsetValue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		//Step2: Maximize the window
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
// Move by offset value
		Actions act= new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		System.out.println("move by offset value");
		Thread.sleep(1000);
		
		//Mouse hovring action
		
		WebElement element=driver.findElement(By.xpath("//div[.='Electronics']"));
		act.moveToElement(element).perform();
		System.out.println("mouse hovring action");
	}

}
