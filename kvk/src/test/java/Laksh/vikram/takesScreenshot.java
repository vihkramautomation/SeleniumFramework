package Laksh.vikram;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takesScreenshot {

	public static void main(String[] args) throws InterruptedException, Exception {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\PROJECT\\WORKSPACE- Oxygen\\vikram\\Screenshots\\"+sdf.format(d)+".png"));
		System.out.println("Screnshot captured");
	driver.close();
	
	
	
	}
}
