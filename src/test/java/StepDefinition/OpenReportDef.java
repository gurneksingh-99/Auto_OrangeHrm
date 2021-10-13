package StepDefinition;

import ReadData.ReadData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Locators;
import pages.DashboardPage;
import pages.LoginPage;
import pages.ReportTab;

public class OpenReportDef {
	@Given("I logged in OrangeHrm")
	public void i_logged_in_orange_hrm() {
	  	LoginPage.lpage(ReadData.config("url"));
	  	
		System.out.println("Open--Given");
	}

	@Given("I click on PIM tab")
	public void i_click_on_pim_tab() {
	DashboardPage.pimTab();
	}

	@When("I click on Reports")
	public void i_click_on_reports() {
	  ReportTab.Report();
		System.out.println("Open--when");
	}

	@Then("I should be able to see Reports pannel")
	public void i_should_be_able_to_see_reports_pannel() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Open --Then");
		Locators.close();
	}

}
