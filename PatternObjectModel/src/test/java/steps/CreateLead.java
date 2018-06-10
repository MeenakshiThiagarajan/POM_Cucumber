package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
	/*public static RemoteWebDriver driver;
	@Given("Invoke LeafTaps Application")
	public void invokeApp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
	}
	@And("Enter the userName as (.*)")
	public void enterUserName(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}

	@And("Enter the passWord as (.*)")
	public void enterPassWord(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}

	@And("click on the Login button")
	public void clickLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@And("click on the crmsfa link")
	public void clickcrmsfaLink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("click on Create Lead")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@And("Enter the cName as (.*)")
	public void enterCName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}

	@And("Enter the fName as (.*)")
	public void enterFName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}

	@And("Enter the lName as (.*)")
	public void enterLName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}

	@When("Click on CreatLead")
	public void clickCreateLeadButton() {
		driver.findElementByName("submitButton").click();
	}
	@Then("Lead is Created")
	public void verifyLead() {
		System.out.println("Lead iss created");
	}*/
}
