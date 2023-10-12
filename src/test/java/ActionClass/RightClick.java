package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//Step2: Maximize the window
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement ele = driver.findElement(By.xpath("//span[.='right click me']"));
		WebElement edit = driver.findElement(By.xpath("//span[.='Edit']"));
          Actions act = new Actions(driver);
          
          act.contextClick(ele).perform();
          
          System.out.println("drag done");
          
          Thread.sleep(1000);
          
          act.click(edit).perform();
          
	System.out.println("editd");
	
	}

}
