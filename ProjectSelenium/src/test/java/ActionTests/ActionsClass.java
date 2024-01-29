package ActionTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Actions act = new Actions(driver);
		
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("clothing");
		search.sendKeys(Keys.ENTER);
//		act.sendKeys(Keys.ENTER).perform();
//		WebElement fashionMenu = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[1]/div/div/span/span[1]"));
//		
//		
//		
//		act.moveToElement(fashionMenu).perform();
//		
//		WebElement winter = driver.findElement(By.xpath("//a[text()='Winter']"));
//		act.moveToElement(winter).perform();
		
		System.out.println("Title is "+title);
		driver.manage().window().maximize();
		//driver.quit();	
	}

}
