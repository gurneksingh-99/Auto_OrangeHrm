package pages;
import org.openqa.selenium.WebElement;

import locators.Locators;
public class ReportTab {
	public static void Report() {
		WebElement reportbtn = Locators.reportEl();
		reportbtn.click();
		
	}
public static void inputReportName(String name) {
	WebElement reporttxt = Locators.inputReport();
	reporttxt.sendKeys(name);
}
public static void searchreport() {
	WebElement srchbtn = Locators.searchbtn();
	srchbtn.click();
}
public static void resetreport() {
	WebElement rstbtn = Locators.resetbtn();
	rstbtn.click();
}
public static void addreport() {
	WebElement addbtn = Locators.addbtn();
	addbtn.click();
}
public static void deletereport() {
	WebElement delbtn = Locators.deletebtn();
	delbtn.click();
}
public static void selectreport() {
	WebElement selbtn = Locators.selectreport();
	selbtn.click();
}
public static void runreport() {
	WebElement runbtn = Locators.runbtn();
	runbtn.click();
}
public static void editreport() {
	WebElement editbtn = Locators.editbtn();
	editbtn.click();
}
public static void newreportname(String name) {
	WebElement newrep = Locators.NewReportname();
	newrep.sendKeys(name);
}
public static void adddisplayfield() {
	WebElement adddispbtn = Locators.displayfield();
	adddispbtn.click();
}
public static void Savereport() {
	WebElement savebtn = Locators.savereport();
	savebtn.click();
	
}
public static void Okbtn(){
	WebElement kkbtn = Locators.okbtn();
	kkbtn.click();
	
}

}
