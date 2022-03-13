package gluecode;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Login;

public class Stepdef {
	
	RemoteWebDriver driver;
	Login obj;
	@Given("open {string} with {string}")
	public void open_with(String string, String string2) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(string2);
		Thread.sleep(5000);
		obj=new Login(driver);
	}

	@When("enter valid username {string}")
	public void enter_valid_username(String string) throws Exception {
		obj.username(string);
		//Thread.sleep(5000);
	}

	@When("click username next button")
	public void click_username_next_button() throws Exception {
	  obj.userbutton();
	 // Thread.sleep(5000);
	}

	@Then("validate username page should be redirected to password page")
	public void validate_username_page_should_be_redirected_to_password_page() throws Exception {
		//Thread.sleep(5000); 
	  
	}

	@When("Enter valid password {string}")
	public void enter_valid_password(String string) throws Exception {
		 obj.password(string);
		// Thread.sleep(5000);
	}

	@When("click password next button")
	public void click_password_next_button() throws Exception {
	  obj.passbutton();
	  Thread.sleep(5000); 
	}

	@Then("validate password page should be redirected to mail inbox page")
	public void validate_password_page_should_be_redirected_to_mail_inbox_page() throws Exception {
		obj.maillogobuttondisplayed(driver);
		System.out.println("true");
		Thread.sleep(5000);
	
	}
}

