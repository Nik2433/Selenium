package JavaScriptExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesableEle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//Step2: Maximize the window
		driver.manage().window().maximize();
		driver.get(" https://demoapp.skillrary.com/product.php?product=java");
		WebElement disabledTextField = driver.findElement(By.xpath("//input[@class='form-control']"));
		
		//Enter data using desable text field using JSE
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(1000);
		
	
		js.executeAsyncScript("arguments[0].value='ABC'", disabledTextField);
		
















	}

}
