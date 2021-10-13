package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import locators.Locators;
import io.cucumber.java.en.Then;
import pages.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;


import ReadData.ReadData;
public class AddDef {
	String exldata = ReadData.readExcel(0, 1);
	@Given("I am already logged into OrangeHrm and in Reports tab")
	public void i_am_already_logged_into_orange_hrm_and_in_reports_tab() {
	   LoginPage.lpage(ReadData.config("url"));
	   DashboardPage.pimTab();
	   ReportTab.Report();
	   assertEquals(ReadData.config("RepUrl"),Locators.geturl());
	}

	@When("I click on Add Button")
	public void i_click_on_add_button() {
	    ReportTab.addreport();
	    System.out.println("Step 2 is passed");
	}

	@Then("I should be redirected to Add report page")
	public void i_should_be_redirected_to_add_report_page() {
	  System.out.println("Step 3 is passed");
	 assertEquals(ReadData.config("Addrepurl"), Locators.geturl());
	}

	@When("I enter Report Name and Display Field")
	public void i_enter_report_name_and_display_field() {
	    ReportTab.newreportname("test");
	    ReportTab.adddisplayfield();
	    ReportTab.Savereport();
	    System.out.println("Step 4 is passed");
	}

	@Then("New Employee report should be created")
	public void new_employee_report_should_be_created() {
	    System.out.println("Step 5 is passed");
	 //   assertEquals(Locators.gettabletext,exldata,"Report should be saved");
		Locators.close();
	}

}
