package pages;
import locators.Locators;

import Browser.Browser;
public class LoginPage {
public static void cpage(String url) {
	 Browser.gotourl(url);
		Locators.username().sendKeys("Admin");
		Locators.password().sendKeys("admin123");
	  //  Locators.loginbtn().click();
}
public static void lpage(String url) {
	 Browser.gotourl(url);
		Locators.username().sendKeys("Admin");
		Locators.password().sendKeys("admin123");
	   Locators.loginbtn().click();
}
public static String geturl() {
	 String curl = Locators.geturl();
	    return curl;
}
}
