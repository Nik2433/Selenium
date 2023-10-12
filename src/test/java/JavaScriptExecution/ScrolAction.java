package JavaScriptExecution;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		
		//Scrol down action- upcasting
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0, 2000)", "");
		
		Thread.sleep(2000);
		
		//Scrol up action- 
		
	js.executeAsyncScript("window.scrollBy(0, -1000)", " ");
	
	//Scroll until botton of the page 
	 
	js.executeScript("window.scrollTo(0,document.body.scrollHeight);", "");
	
	
	
	
	
	
	}

}
