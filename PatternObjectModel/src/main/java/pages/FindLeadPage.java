package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{

	public FindLeadPage() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.NAME,using="id")
	private WebElement eleLeadId;
	public void enterLeadId(String data) {
		type(eleLeadId, data);
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	private WebElement eleFindLeadsButton;
	public void clickFindLeadsButton() {
		click(eleFindLeadsButton);
		
	}

}
