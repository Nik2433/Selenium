package takeScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
public static void main(String[] args) {
	
	
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//Step2: Maximize the window
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
 driver.findElement(By.name("user_name")).sendKeys("admin");
 driver.findElement(By.name("user_password"));	
 driver.findElement(By.id("submitButton"));
	
	
	
	
	
	
	
	
	
	
	
}
}
