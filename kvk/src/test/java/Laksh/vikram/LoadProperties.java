package Laksh.vikram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Properties prop = new Properties();
				
		FileInputStream ip = new FileInputStream(".\\src\\main\\java\\com\\laksh\\config\\properties\\Configuration.properties");
	    prop.load(ip);
	    
	    String url = prop.getProperty("powertexurl");
	    System.out.println(prop.getProperty("powertexurl"));
	    driver.get(url);
	}

}
