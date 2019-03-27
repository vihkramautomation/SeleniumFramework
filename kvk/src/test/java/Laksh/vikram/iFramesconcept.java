package Laksh.vikram;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFramesconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/draggable/");
		
		WebElement FrameA = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(FrameA);
		WebElement dd = driver.findElement(By.id("draggable"));
		driver.switchTo().defaultContent();
		
		driver.get("http://www.stqatools.com");
		// Store all currently open tabs in tabs
		ArrayList<String> tabs =new ArrayList<String>( driver.getWindowHandles());
		driver.findElement(By.id("Url_Link")).click();
		driver.switchTo().window(tabs.get(1));
		driver.close();
		driver.switchTo().window(tabs.get(0));
		System.out.println("Passeff");
		System.out.println("Passeff");

		
	}

}
