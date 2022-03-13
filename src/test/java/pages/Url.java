package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Url {
	@FindBy(name="signin") public WebElement usnnext;	
	public Url(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void browserlaunch(String browser)
	{
		browser="chrome";
	//	return(browser);
	}
	public void urlNavigation(String url, String env) throws Exception
	{
		url="https://login.yahoo.com/";
		env="test";
Thread.sleep(10000);
	}
	public void medun() throws Exception
	{
		usnnext.click();
		Thread.sleep(5000);
	}

}
