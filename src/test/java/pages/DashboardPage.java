package pages;
import org.openqa.selenium.WebElement;

import locators.Locators;
public class DashboardPage {
public static void pimTab() {
	WebElement pim = Locators.pim();
	pim.click();
}
public static void adminTab() {
	WebElement adminEl = Locators.adminEl();
	adminEl.click();
	}
public static void myinfo() {
	WebElement myinfo = Locators.myinfoEl();
	myinfo.click();
	}

}
