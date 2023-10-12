package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//Step2: Maximize the window
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=java ");
	
		  WebElement Add = driver.findElement(By.id("add"));
		WebElement Minus = driver.findElement(By.id("minus"));
		
		Actions act = new Actions(driver);
		act.contextClick(Add).perform();
		System.out.println("Double click");
		act.contextClick(Add).perform();
		System.out.println("Double click");
		Thread.sleep(2000);
		act.contextClick(Minus).perform();
		System.out.println("minus click");
	}

}
