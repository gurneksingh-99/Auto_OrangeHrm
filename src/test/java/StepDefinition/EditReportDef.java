package StepDefinition;

import ReadData.ReadData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Locators;
import pages.DashboardPage;
import pages.LoginPage;
import pages.ReportTab;

public class EditReportDef {

@Given("I Have Already Logged in OrangeHrm And opened Report pannel")
public void i_have_already_logged_in_orange_hrm_and_opened_report_pannel() {
    LoginPage.lpage(ReadData.config("url"));
    DashboardPage.pimTab();
    ReportTab.Report();
    ReportTab.addreport();
    ReportTab.newreportname("test");
    ReportTab.adddisplayfield();
    ReportTab.Savereport();
	System.out.println("Edit--Given");
}

@When("I clickon Edit Button")
public void i_clickon_edit_button() {
   ReportTab.editreport();
	System.out.println("Edit WHen");
}

@Then("Edit Report page must open")
public void edit_report_page_must_open() {
    
	System.out.println("Edit--TThen");
	Locators.close();
	
}

}
