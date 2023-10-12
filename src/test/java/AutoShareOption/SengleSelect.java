package AutoShareOption;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SengleSelect {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		//Step2: Maximize the window
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		//Step 4: locate a drop dwon
		WebElement singleSelectDropdown = driver.findElement(By.id("oldSelectMenu"));

		//Step5: To handle the dropdown - using Index
		//sel.selectByIndex(8);
		//System.out.println() 
		
		
		
		
		
		
		
	}

}
