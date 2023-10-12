package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//Step2: Maximize the window
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	WebElement Drag = driver.findElement(By.xpath("//div[.='Seoul'][2]"));
	WebElement Drop = driver.findElement(By.xpath("//div[.='South Korea']"));
	
	WebElement Drag1 = driver.findElement(By.xpath("//div[.='Madrid'][2]"));
	WebElement Drop1 = driver.findElement(By.xpath("//div[.='Norway']"));
	
Actions act = new Actions(driver);
act.dragAndDrop(Drag, Drop).perform();
Thread.sleep(1000);
System.out.println("Drag and drop ");


act.dragAndDrop(Drag1, Drop1).perform();
Thread.sleep(1000);
System.out.println("Drag1 and drop1 ");

	}
}
