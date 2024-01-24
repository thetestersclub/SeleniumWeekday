package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_frames2");
		String title = driver.getTitle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame("iframeResult");
		System.out.println("frame text "+driver.findElement(By.xpath("//body/h2")).getText());
		
		driver.switchTo().frame(1);
		//driver.findElement(By.xpath("locatorinside frame")).click();
		
//		driver.switchTo().parentFrame();
//		System.out.println("frame text "+driver.findElement(By.xpath("//body/h2")).getText());
		
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("runbtn")).click();
		System.out.println("Title is "+title);
		driver.manage().window().maximize();
		driver.quit();	

	}

}
