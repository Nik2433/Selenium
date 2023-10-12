package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id="Username")
private WebElement UsernameEdt;


@FindBy(name="pwd")
private WebElement passwordEdt;

@FindBy(id="longinButton")
private WebElement loginlink;

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this );
}

public WebElement getUsernameEdt() {
	return UsernameEdt;
}

public WebElement getPasswordEdt() {
	return passwordEdt;
}

public WebElement getLoginlink() {
	return loginlink;
}










}
