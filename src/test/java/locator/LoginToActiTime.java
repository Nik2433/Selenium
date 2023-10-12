package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActiTime {

	public static void main(String[] args) {
		//Step1: launch Browser
				WebDriver driver= new ChromeDriver();
				//Step2: Maximize the window
				driver.manage().window().maximize();
				//Step3: load the url
				driver.get("https://demo.actitime.com/login.do");
				//Step4: identify user name
				//driver.findElement(By.className (<element class>))
				driver.findElement(By.className("username"));

	}

}
