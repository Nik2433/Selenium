package pomClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Logintoactitime {
	
private static final WebDriver driver = null;

private void PSVM() throws IOException {
	// TODO Auto-generated method stub



	FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\data.properties");

	Properties p = new Properties();
	
	p.load(fis);
	
	String USERNAME = p.getProperty("username");
	
			String PASSWORD = p.getProperty("password");

			
	
	//LoginPage lp = new LoginPage(driver);
	LoginPage lp = new LoginPage(driver);
	lp.getUsernameEdt().sendKeys(USERNAME);
	lp.getPasswordEdt().sendKeys(PASSWORD);
	lp.getLoginlink().click();
	
	System.out.println("Login Successfull");
}
}