package ActionTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		String title = driver.getTitle();
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]"));
		
		int width = slider.getSize().width/2;
		
		System.out.println(width);
		
		
		new Actions(driver).dragAndDropBy(slider, width, 0).perform();
		
		
		System.out.println("Title is "+title);
		driver.manage().window().maximize();
		//driver.quit();	

	}

}
