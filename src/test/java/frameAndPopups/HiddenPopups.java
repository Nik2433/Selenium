package frameAndPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("loginButton")).click();

Thread.sleep(1000);

//navigate to task

driver.findElement(By.id("container_tasks")).click();
Thread.sleep(1000);

//click on delete 

driver.findElement(By.xpath("(//div[.='Delete']")).click();




	}

}
