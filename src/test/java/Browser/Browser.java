package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	protected static WebDriver driver;
public static void gotourl(String url){
	String datapath = System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",datapath);
    driver= new ChromeDriver();
    driver.get(url);//orangeHrm
    driver.manage().window().maximize();  
    }

}

