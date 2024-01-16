package Testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotTest {
	public static String browser = "chrome";
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		
		
		driver.get("https://www.gmail.com/");
		String title = driver.getTitle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("himanisrivastava1996@gmail.com");
		WebElement nextbutton = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
		File screenshot = nextbutton.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("./screenshots/nextbtnimg.jpg"));
		nextbutton.click();
		File pagescreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pagescreenshot, new File("./screenshots/fullpagess.jpg"));
		System.out.println("Title is "+title);
		driver.manage().window().maximize();
		driver.close();	
		
		
	}

}
