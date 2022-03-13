package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {
	
	@FindBy(name="username") public WebElement usernametextbox;
	@FindBy(name="signin") public WebElement usernamennextbotton;
//	@FindBy(name="persistent") public WebElement checkbox;
	@FindBy(name="password") public WebElement pwdtextbox;
	@FindBy(name="verifyPassword") public WebElement pwnextbutton;
	@FindBy(xpath="//div[@title='Mail']") public WebElement mailboxbutton;
//	@FindBy(xpath="//img[text()='     Yahoo Mail']") public WebElement yahoo;
	public Login(RemoteWebDriver driver) {
		PageFactory.initElements(driver,this);		
	}
	public void username(String x) throws Exception
	{
		usernametextbox.sendKeys(x);
		Thread.sleep(2000);
	}
	public void userbutton() throws Exception
	{
		usernamennextbotton.click();
		Thread.sleep(5000);
	}
	public void password(String pw) throws Exception
	{
		pwdtextbox.sendKeys(pw);
		Thread.sleep(2000);
	}
	public void passbutton() throws Exception
	{
		pwnextbutton.click();
		Thread.sleep(5000);
	}
/*	public boolean yahoo() throws Exception
	{
	if	(yahoo.isDisplayed()) {
		return(true);
	}
	else
	{
		return(false);
	}
	}*/
	public void maillogobuttondisplayed(RemoteWebDriver driver) throws Exception
	{
	if	(mailboxbutton.isDisplayed()) {
		mailboxbutton.click();
		Thread.sleep(5000);
		String url=driver.getCurrentUrl();
		System.out.println("system.out=/nbelow");
		System.out.println("URL = "+url);
	}
	else
	{
		
		System.out.println("URL = +Error");
		System.exit(0);
	}
	}
}
