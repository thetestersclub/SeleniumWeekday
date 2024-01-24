package Testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static String browser = "chrome";
	public static WebDriver driver;
	

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

		
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		String title = driver.getTitle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		int rowsize = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		int colsize = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[1]/td")).size();
		System.out.println(rowsize);
		System.out.println(colsize);
		
		String text1 = driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[3]/td[5]")).getText();
		System.out.println(text1);
//		for(int rows=1;rows<=rowsize;rows++) {
//			for(int col=1;col<=colsize;col++) {
//				String text = driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr["+rows+"]/td["+col+"]")).getText();
//				System.out.print(text+"  ");
//			}
//			System.out.println();
//		}
		
		
		System.out.println("Title is "+title);
		driver.manage().window().maximize();
		driver.close();	

	}

}
