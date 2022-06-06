package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


package get_attribute;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

{
	
	{


		public static void main(String[] args) 
		{
					
			System.setProperty("webdriver.chrome.driver.",  "chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();	
			driver.manage().deleteAllCookies();
			driver.get("http:\\google.com");
			
        String x = driver.findElement(By.linkText("gmail")).getAttribute("hrf"); 	
        System.out.print(x);
	}

}
