package frameAndPopups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUps {

	public static void main(String[] args) throws InterruptedException {
	
	// Step 1: Launch the browser
	WebDriver driver = new ChromeDriver();

	// Step 2: maximize the window
	driver.manage().window().maximize();

	// Step 3: wait for 10 seconds
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
	
	// Step 4: Load the URL - 
		driver.get("https://demo.automationtesting.in/Windows.html");
	
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Thread.sleep(1000);
		Set<String> windows=driver.getWindowHandles();
		
		//String mainID=driver.getWindowHandle();
		System.out.println("main ID"+windows);
		
	
//		for(String win:windows)
//		{
//			WebDriver currentWindowID=driver.switchTo().window(win);
//			String CurrentWinTittle = currentWindowID.getTitle();
//			if(CurrentWinTittle.contains(("selenium"))
//					{
//				System.out.println("CurrentWinTittle");
//				break;
//					}}
//			Thread.sleep(1000);
		}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	