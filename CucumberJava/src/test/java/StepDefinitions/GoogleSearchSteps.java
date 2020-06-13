package StepDefinitions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

	WebDriver driver = null;
	
	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step - Browser is open");
		String projectPath = System.getProperty("user.dir");
		System.out.println("The Project Path is: " +projectPath);
		
		System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("user is on the google search page")
	public void user_is_on_the_google_search_page() {
		System.out.println("Inside Step - user enters a text in search box");
		driver.navigate().to("https://www.google.com/");

	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("Inside Step - user enters a text in search box");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		

	}

	@When("hits enter")
	public void hits_enter() {
		System.out.println("Inside Step - hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside Step - user is navigated to search results");
		driver.getPageSource().contains("Online Courses");
		driver.close();
		driver.quit();
	}

}
