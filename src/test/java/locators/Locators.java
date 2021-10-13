package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Browser.Browser;

public class Locators extends Browser {

	//Username
public static WebElement username() {
	
	WebElement uname =  driver.findElement(By.name("txtUsername"));
	return uname;
}
//Password
public static WebElement password() {
	
	WebElement passw =  driver.findElement(By.name("txtPassword"));
	return passw;
}
//login button
public static WebElement loginbtn() {
	
	WebElement loginbtn =  driver.findElement(By.id("btnLogin"));
	return loginbtn;
}
//Current url
public static String geturl() { 
	
	String url =  driver.getCurrentUrl();
	return url;
}
//PIM Tab
public static WebElement pim() {
	WebElement pim = driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b"));
    return pim;
}
//Report Tab
public static WebElement reportEl() {
	WebElement repo = driver.findElement(By.xpath("//*[@id='menu_core_viewDefinedPredefinedReports']"));
	return repo;
}
public static WebElement adminEl() {
    WebElement admin = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
	return admin;
}
public static WebElement myinfoEl() {
	WebElement myinfo = driver.findElement(By.xpath("//*[@id=\'menu_pim_viewMyDetails\']/b"));
	return myinfo;
}

public static WebElement inputReport() {
	WebElement reporttxt =  driver.findElement(By.id("search_search"));
	return reporttxt;
}
public static WebElement searchbtn() {
	WebElement  search  = driver.findElement(By.xpath("//*[@id=\"searchForm\"]/fieldset/p/input[1]"));
	return search;
}
public static WebElement resetbtn() {
	WebElement reset   = driver.findElement(By.xpath("//*[@id=\"searchForm\"]/fieldset/p/input[2]"));
	return reset;
}
public static WebElement addbtn() {
	WebElement add   = driver.findElement(By.xpath("//*[@id=\"btnAdd\"]"));
	return add;
}
public static WebElement deletebtn() {
	WebElement delete    = driver.findElement(By.xpath("//*[@id=\"btnDelete\"]"));
	return delete;
}

//select
public static WebElement selectreport() {
	WebElement selrep    = driver.findElement(By.xpath("//*[@id=\"ohrmList_chkSelectAll\"]"));
	return selrep;
}
public static WebElement okbtn() {
	WebElement ok    = driver.findElement(By.xpath("//*[@id=\"dialogDeleteBtn\"]"));
	return ok;
}
public static WebElement runbtn() {
	WebElement  run  = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[3]/a"));
	return run;
}
public static WebElement editbtn() {
	WebElement edit   = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[1]/td[4]/a"));
	return edit;
}
public static WebElement NewReportname() {
	WebElement newreporttxt =  driver.findElement(By.id("report_report_name"));
	return newreporttxt;
}
public static WebElement savereport() {
	WebElement savebtn =  driver.findElement(By.id("btnSave"));
	return savebtn;
}
public static WebElement displayfield() {
	WebElement dispfield =  driver.findElement(By.id("btnAddDisplayField"));
	return dispfield;
}
public static void close() {
	driver.close();
}
/*@SuppressWarnings("null")
public static String[] gettabletext() {
	String [] El = null;
	WebElement table1 = driver.findElement(By.xpath("//table[@id='resultTable']"));
	List<WebElement> col = table1.findElements(By.tagName("td"));
	//System.out.println("table have total no of rows: " + col.size());
	List<WebElement> row = col.get(2).findElements(By.tagName("tr"));
     for(int i =0;i<col.size();i++) {
    	El[i]= row.get(i).getText();
    		 }
return El;
}*/
public static String gettext(String el) {
	String text = driver.findElement(By.xpath(el)).getText();
	return text;
}
}
