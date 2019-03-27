package Laksh.vikram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googelSearch {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchtext = driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		searchtext.sendKeys("Selenium ");
		Thread.sleep(3000);
		List<WebElement> searchvalue =driver.findElements(By.xpath("//div[@class=\"aajZCb\"]"));
		
		for(int i=0;i<searchvalue.size();i++) {
			System.out.println(searchvalue.get(i).getText());
			if(searchvalue.get(i).getText().equals("selenium hq")) {
				searchvalue.get(i).click();
				break;
		}
			System.out.println("SELECTED SUCCESFULLY");
		
		}
		
		//driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		List<WebElement> findelements = driver.findElements(By.xpath("gLFyf gsfi"));
		for(WebElement values : findelements) {
			System.out.println(values.getAttribute("href"));
		}
		
		driver.close();

	}

}
