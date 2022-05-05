package pomfilewrk.naistam;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.lang.System.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Xpathp {
	WebDriver driver;
	@Parameters("broswer")
	@BeforeClass
	public void xps(String broswer) {
		//Logger logger= Logger.getlogger("Xpathp");
		PropertyConfigurator.configure("log4j.properties");
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://mail.google.com/");
	}	
	
	@Test
	public void methods1() {
		driver.findElement(By.id("identifierId")).sendKeys("rajesh.janapala10@gmail.com");
	
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	
String text=driver.findElement(By.xpath("//*[@id=\"headingText\"]/span")).getText();
	System.out.println(text);
	
	}
	
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
}
