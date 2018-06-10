package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{

	public CreateLeadPage() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement elecName;
	@And("Enter the cName as (.*)")
	public CreateLeadPage entercName(String data) {
		type(elecName,data);
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefName;
	@And("Enter the fName as (.*)")
	public CreateLeadPage enterfName(String data) {
		type(elefName,data);
		return this;
	}


	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelName;
	@And("Enter the lName as (.*)")
	public CreateLeadPage enterlName(String data) {
		type(elelName,data);
		return this;
	}

	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleCreateLeadButton;
	@When("Click on CreatLead")
	public ViewLeadPage clickCreateLeadButton() {
		click(eleCreateLeadButton);
		return new ViewLeadPage();
	}
}
