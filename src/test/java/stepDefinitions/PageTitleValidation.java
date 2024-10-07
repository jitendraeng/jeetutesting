package stepDefinitions;

import java.time.Duration;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;
import io.cucumber.java.en.*;


public class PageTitleValidation {

	public WebDriver driver;

	@BeforeTest
	public void setup() {

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
		driver.get("https://singhsoft.testinguat.com/");

	}


	
	@Given("open Company website using URL")
	public void open_company_website_using_url() {

		System.out.println("User on company home page ");

	}


	@Then("Verify the group of company page title")
	public void verify_the_group_of_company_page_title() {

		String ActualTitle = driver.getTitle();
		new SoftAssert().assertEquals("Home : Singh Soft Technology", ActualTitle);

		System.out.println("Company title is.... " + ActualTitle);

	}


	@When("click on Home link")
	public void click_on_home_link() {
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();

	}


	@Then("check the Home page title")
	public void check_the_home_page_title() {
		String homePageTitle = driver.getTitle();

		new SoftAssert().assertEquals("Home : Singh Soft Technology", homePageTitle);

		System.out.println("Company title is.... " + homePageTitle);

	}

	@Then("click on the About us page titles")
	public void click_on_the_about_us_page_titles() {
		driver.findElement(By.xpath(" //a[@class='nav-link'][normalize-space()='About Us']"));

	}

	
	@Then("check the About us page title")
	public void check_the_about_us_page_title() {
		String AboutUsTitle = driver.getTitle();
		new SoftAssert().assertEquals("Home : Singh Soft Technology", AboutUsTitle);

		System.out.println("Company title is.... " + AboutUsTitle);

	}

	
	
	

}
