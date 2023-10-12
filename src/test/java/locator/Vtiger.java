package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) {
		//Step1: launch Browser
		WebDriver driver= new ChromeDriver();
		//Step2: Maximize the window
		driver.manage().window().maximize();
		//Step3: load the url
		driver.get("http://localhost:8888/");
		//Step4: identify user name
		WebElement usernameEle = driver.findElement(By.name("user_name"));
		
		//Perform action on web element identifier 
		usernameEle.sendKeys("admin");
		//Step5: identify Password
	    WebElement passwordEle = driver.findElement(By.name("user_password"));
		//Perform action on web element identifier 
	    passwordEle.sendKeys("admin");
        //Step6 : identify the login button in demo vtiger
		WebElement loginEle = driver.findElement(By.id("submitButton"));
	//performe action on the web element identifer	
		loginEle.click();
		//Step7 : click on Organisation link in home page 
		//driver.findElement(By.linkText("Contacts")).click();
		//Step8 : click on Organisation Partical link in home page 
				driver.findElement(By.partialLinkText("Con")).click();
	}

}
