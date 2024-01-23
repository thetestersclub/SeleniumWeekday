package Testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {
	
	public static String browser = "chrome";
	public static WebDriver driver;
	
	public static boolean isElementPresent(String locator) {
//		try {
//		driver.findElement(By.id(locator));
//		return true;
//		}catch(Throwable t) {
//			return false;
//		}
		
		int size = driver.findElements(By.xpath(locator)).size();
		if(size==0) {
			return false;
		}else {
			return true;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		
		
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		String title = driver.getTitle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//		driver.findElement(By.xpath("//div[4]/input[1]")).click();
//		driver.findElement(By.xpath("//div[4]/input[2]")).click();
//		driver.findElement(By.xpath("//div[4]/input[3]")).click();
//		driver.findElement(By.xpath("//div[4]/input[4]")).click();
		
//		for(int i = 1;i<=4;i++) {
//			driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
//		}
		
//		int i = 1;
//		while(isElementPresent("//div[4]/input["+i+"]")) {
//			driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
//			i++;
//		}
		
		WebElement checkboxblock = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
		List<WebElement> checkboxes = checkboxblock.findElements(By.name("sports"));
		System.out.println("No of checkboxes"+checkboxes.size());
		for(WebElement checkbox: checkboxes) {
			checkbox.click();
		}
		
	
		System.out.println("Title is "+title);
		driver.manage().window().maximize();
		//driver.close();	


	}

}
