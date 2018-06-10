package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{

	public ViewLeadPage() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement elefirstName;
	@Then("Lead is Created")
	public ViewLeadPage verifyFirstName(String data) {
		verifyExactText(elefirstName, data);
		return this;
	}





}
