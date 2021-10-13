package StepDefinition;

import Browser.Browser;

import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Locators;
import pages.LoginPage;
import pages.DashboardPage;
import pages.ReportTab;

import ReadData.ReadData;

public class SearchDef extends Browser{
	@Given("I am already Logged into OrangeHrm and have opened Reports Pannel")
	public void i_am_already_logged_into_orange_hrm_and_have_opened_reports_pannel() {
	try {
		String url =ReadData.config("url"); // config_properties
	    String loginBtn = ReadData.config("loginbtn");
	    LoginPage.cpage(url);       
	    driver.findElement(By.id(loginBtn)).click();
	   
		 // login page
		      
		// Dashboard and Then PIM
		DashboardPage.pimTab();	
		
		System.out.println("step 1 passed");  
      	}
	catch (Exception e) {
		System.out.println("error in Given method");
	}
	}

	@When("I enter Valid report name and Click on Search Button")
	public void i_enter_valid_report_name_and_click_on_search_button() {
		try {
			System.out.println(Locators.geturl());
			ReportTab.Report();
			ReportTab.inputReportName(ReadData.readExcel(0, 3));
			ReportTab.searchreport();
			System.out.println("step 2 passed");
		}
		catch (Exception e) {
			System.out.println("error in When ");
		}
	}

	@Then("I should be able to see searched report with same name")
	public void i_should_be_able_to_see_searched_report_with_same_name() {
	   System.out.println(Locators.geturl());
	   Locators.close();
	   
	}

}
