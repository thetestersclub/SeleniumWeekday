package ActionTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		
		//driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		String title = driver.getTitle();
//		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
//		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		WebElement img = driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));
		
		
		
//		actions.dragAndDrop(drag, drop).perform();
		actions.contextClick(img).perform();
		
		System.out.println("Title is "+title);
		driver.manage().window().maximize();
		//driver.quit();	

	}

}
