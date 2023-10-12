package frameAndPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHnadling {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://jqueryui.com/droppable/");
	
	//Hadle the frame
	driver.switchTo().frame(0);
	System.out.println("Swith the controll to frame");
	
	// Drag and Drop
	
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	
	//Action 
	
	Actions act = new Actions(driver);
	act.dragAndDrop(drag, drop).perform() ;
	System.out.println(" drag and drop success full");
	
	//Switch controll to the main page
	
	driver.switchTo().defaultContent();
	 System.out.println("Swithc controll back to main page");
	
	// Click accepct link
	 
	 driver.findElement(By.linkText("Accept")).click();
	System.out.println("Click on link text");
	
}
}
