package webElementInterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnallCheckbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		//Step2: Maximize the window
		driver.manage().window().maximize();
		//Step3: load the url
		driver.get("http://localhost:8888");
		//Step4: identify user name
		//driver.findElement(By.className (<element class>))
	driver.findElement(By.name("user_name")).sendKeys("admin");
	//Step5: identify user name
			//driver.findElement(By.className (<element class>))
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
		//Step6: login button
		driver.findElement(By.id("submitButton")).click();
		//Step7: click on organisation tab
		driver.findElement(By.linkText("Organizations")).click();
		 // step8 : identify all the chceck box
		List<WebElement> list =driver.findElements(By.xpath("//input[@name='selected_id']"));
// Step9: Navigate through the list and click on each web element
		for(WebElement element:list)
		{
			element.click();
			Thread.sleep(1000);
		}
		
		
		//capture name and print in concolse
		
		//input[@name=selected_id ][4]
	}

}
