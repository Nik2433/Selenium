package webElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod 
{

	public static void main(String[] args) throws InterruptedException
	{
		//Step1: launch Browser
		WebDriver driver= new ChromeDriver();
		//Step2: Maximize the window
		driver.manage().window().maximize();
		//Step3: load the url
		driver.get("https://demo.actitime.com/login.do");
		
		//Step4: web element method: Send keys'
		driver.findElement(By.className("textFiled")).sendKeys("trainee");

	    // Step5 :
		Thread.sleep(2000);
		
		//Setp6: web element method clear
		driver.findElement(By.className("textFiled")).clear();
		
		//Step4: web element method: Send keys'
		driver.findElement(By.className("textFiled")).sendKeys("trainee");
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		
		//web element method click 
		//driver.findElement(By.id("loginButton")).click();
		
		//web element method - getAttribute(String attribute)- get the attribute value
		String attribute=driver.findElement(By.id("loginButton")).getAttribute("align");
		System.out.println("Attribute value is"+attribute);
		
		//web element method - getTagname
		String tag= driver.findElement(By.id("loginButton")).getTagName();
		System.out.println(tag);
		
		//web element method  - getText()
		String text=driver.findElement(By.id("loginButton")).getText();
		System.out.println("login button"+text);
		
		//web element method  - getLocation()- Position of the web element
		Point position=driver.findElement(By.id("loginButton")).getLocation();
		int posx=position.getX();
		System.out.println("Xth position is"+posx);
		int posy=position.getY();
		System.out.println("Yth position is"+posy);
		
		//web element Method get size(); - Dimension of the Web element
	Dimension size=	driver.findElement(By.id("loginButton")).getSize();
	int height = size.getHeight();
	System.out.println("element hight is "+height);
	int width = size.getWidth();
	System.out.println("element width is "+width);
	
	//Web element Method get text() - Position and dimenssion of the Web element
	Rectangle rect = driver.findElement(By.id("loginButton")).getRect();
	int x=rect.getX();
	System.out.println("Xth position is"+x);
	int y=rect.getY();
	System.out.println("Xth position is"+y);
	int h=rect.getHeight();
	System.out.println("element hight is "+h);
	int W=rect.getWidth();
	System.out.println("element hight is "+W);

	// Web element Method - getCSS value()-TO get the CSS value for css properties
	
	String cssValue=driver.findElement(By.id("loginButton")).getCssValue("display");
	System.out.println("Css value is "+cssValue);
	
	//Web element Method - getAriaRole()-TO get the element design type
	
	String role=driver.findElement(By.id("loginButton")).getAriaRole();
	System.out.println("area role is "+role);
	
	String roleUserName=driver.findElement(By.className("textField")).getAriaRole();
	System.out.println("area role is "+roleUserName);
	
	//Web element Method - getAccessibleNmae() -  TO get the element acessibilty Name
	String accessibleName=driver.findElement(By.className("textField")).getAccessibleName();
	System.out.println("AccessibleName is"+accessibleName);
	
	String accessibleNameBtn= driver.findElement(By.id("loginButton")).getAccessibleName();
	System.out.println("Accessible Name is"+accessibleNameBtn);
	
	driver.get("http://localhost:8888");
	String name= driver.findElement(By.name("user_name")).getAccessibleName();
	System.out.println("name is"+name);
	
	//WebElement Method - isDisplay()- TO check if the element is dispaly /present in the current DOM
	
	boolean elementDispled= driver.findElement(By.name("user_name")).isDisplayed();
	if(elementDispled==true)
	{
		driver.findElement(By.name("user_name")).sendKeys("admin");
		System.out.println("element display");
		}
	else
	{
		System.out.println("element not present");
	}
	
	//WebElement Method - isEnabled() - TO check if the element is enable in the webpage or not
	
	boolean enable = driver.findElement(By.name("user_name")).isEnabled();
	
	
	
	
	
	}

}
