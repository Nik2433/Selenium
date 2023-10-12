package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndSendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		//Step2: Maximize the window
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		WebElement un = driver.findElement(By.name("user_name"));
               WebElement submit = driver.findElement(By.id("submitButton"));
               
             Actions act = new Actions(driver);
     act.sendKeys(un, "admin",Keys.TAB,"admin").perform();
     act.click(submit).perform();
	}

}
