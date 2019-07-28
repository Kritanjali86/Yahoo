package yahooLogin.stepDefination;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_StepDefination {
	WebDriver driver;

	@Before()
	public void setup() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C://Users//Dev_Programs//chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	}

	@After()
	public void teardown() {
		driver.manage().deleteAllCookies();
		driver.quit();

	}

	@Given("^User navigate to the <\"([^\"]*)\">$")
	public void user_navigate_to_the(String url) throws Throwable {
		driver.get(url);
	}

	@When("^User clicks on the login portal$")
	public void user_clicks_on_the_login_portal() throws Throwable {
		driver.findElement(By.name("login")).click();
	}

	@And("^User enters the <\"([^\"]*)\"> username$")
	public void user_enters_the_username(String username) throws Throwable {
		// tab code
		for (String windHandle : driver.getWindowHandles()) {
			driver.switchTo().window(windHandle);
		}
		// send username keys
		driver.findElement(By.name("userName")).sendKeys(username);
	}

	@And("^User enters the <\"([^\"]*)\"> password$")
	public void user_enters_the_password(String password) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		driver.findElement(By.name("login")).click();
	}

}
