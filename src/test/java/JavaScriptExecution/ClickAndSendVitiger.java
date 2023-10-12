package JavaScriptExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAndSendVitiger {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//Step2: Maximize the window
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
WebElement User = driver.findElement(By.name("user_name"));
WebElement Pass = driver.findElement(By.name("user_password"));	
WebElement Sub = driver.findElement(By.id("submitButton"));	
		//Enter data using desable text field using JSE
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(1000);
		
	js.executeAsyncScript("arguments[0].value='admin'", User);
	js.executeAsyncScript("arguments[0].value='admin'", Pass);
	js.executeAsyncScript("arguments[0].click()", Sub);
	
		need to add moew
	}

}
