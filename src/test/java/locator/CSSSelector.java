package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {
	public static void main(String[] args) {
		//Step1: launch Browser
				WebDriver driver= new ChromeDriver();
				//Step2: Maximize the window
				driver.manage().window().maximize();
				//Step3: load the url
				driver.get("https://demo.actitime.com/login.do");
				//Step4: identify user name text filed 
				
				driver.findElement(By.cssSelector("input[type='text']")).sendKeys("trainee");
				
				//Step5: identify password text filed  
				//driver.findElement(By.cssSelector("[class='textField pwdfield']")).sendKeys("trainee");
				driver.findElement(By.cssSelector(".pwdfield")).sendKeys("trainee");
				//Step6: login
				//driver.findElement(By.cssSelector("[id='loginButton']")).click();
				driver.findElement(By.cssSelector("#loginButton")).click();
	}
}
