package StepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class loginSteps {
	public WebDriver driver = null;
	
	

	@Given("^open the browser and enter the url$")
	public void open_the_browser_and_enter_the_url() throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();	
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://opensource-demo.orangehrmlive.com/");		
		    
	}

	@When("^users enters correct username$")
	public void users_enters_correct_username()  {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
	}

	@When("^users enters correct password$")
	public void users_enters_correct_password()  {
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	   
	}

	@When("^users click on login button$")
	public void users_click_on_login_button()  {		
		driver.findElement(By.id("btnLogin")).click();
	    
	}
	
	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() {		
		String pageTitle= driver.getTitle();
		System.out.println(pageTitle);
			   
	}


}
