package frameAndPopups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopups {

	public static void main(String[] args) {
		//Browser setting
		//ChromeOptions op = new ChromeOptions();
		//op.addArguments("--disable-notification");
		
		ChromeOptions op = new ChromeOptions(); 
		op.addArguments("--disable-notifications");
		
            WebDriver driver = new ChromeDriver();
            
           driver.manage().window().maximize();
           
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           
           driver.get("https://yatra.com/");
	}

}
