package Laksh.vikram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageLoad {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// ctrl+shift+o
		System.out.println("Browser Initialisation Started");
		long startTime = System.currentTimeMillis();
		driver.get("http://www.pptshopee.in/#/home");
		// driver.get("https://www.bing.com/account/general?ru=");
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total Page Load Time is" + totalTime + "MilliSexonds");

	}

}
