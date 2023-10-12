package lanuchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	public static void main(String args[]) throws InterruptedException
	{
		//Chrome launch Browser
//		
//		ChromeDriver Driver= new ChromeDriver();
//		System.out.println(" Chrome Launch browser");
//		//Firefox launch Browser
//		FirefoxDriver driver1 = new FirefoxDriver();
//		System.out.println(" Firefox Launch browser");
		
		WebDriver driver= new ChromeDriver();
		System.out.println(" Chrome Launch browser");
		
		//To maximise the Browser - method chaining
		driver.manage().window().maximize();
		
		//to load url
		driver.get("https://flipkart.com"); //url is the only way to access the web application
		System.out.println("flipkart loaded");
		
		//to capture the page title
		String tittle = driver.getTitle();
		System.out.println(" Page Tittle is->"+ tittle);
		
		//to capture the Current URL
		String url = driver.getCurrentUrl();
		System.out.println(" Current URL  is->"+ url);
		
		//to capture the source code of current page
		String sourcecode = driver.getPageSource();
		System.out.println(" Source code of current page  is->"+ sourcecode);
		
		//to capture the Session id
		String id = driver.getWindowHandle();
		System.out.println(" Session id of current page  is->"+ id);
		
		//To close the Browser
		Thread.sleep(2000);
		driver.close();
		System.out.println(" close Browser");
		driver.quit();
	}

}
