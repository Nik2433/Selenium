package frameAndPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopups {

	public static void main(String[] args) {
		
		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		

		// Step 4: Load the URL - 
			driver.get("https://www.foundit.in/seeker/registration");
			//for uploading any file it should be input type
			WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
	
			ele.sendKeys("C:\\Users\\Nikanand\\Desktop\\Resume\\CV_Nikita.docx");
		System.out.println("file uploaded");
		
		
		
		
		
	}

}
