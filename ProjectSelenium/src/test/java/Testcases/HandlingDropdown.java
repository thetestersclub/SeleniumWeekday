package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		String var = driver.getTitle();
		System.out.println(var);
		driver.manage().window().maximize();
//		driver.findElement(By.id("searchLanguage")).click();
//		driver.findElement(By.xpath("//option[text()='English']")).click();
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		Select select = new Select(dropdown);
		//select.selectByValue("fi");
		select.selectByVisibleText("English");
		select.selectByIndex(3);
		List<WebElement> values = dropdown.findElements(By.tagName("option"));
		int size = values.size();
		System.out.println(size);
//		71 -> 0 - 71-1 = 70
		System.out.println(values.get(8).getText());
		
		for(int i=0;i<values.size();i++) {
			System.out.println(values.get(i).getAttribute("lang"));
		}
		
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println("All links "+links.size());
//		
//		for(WebElement link: links) {
//			System.out.println(link.getAttribute("href"));
//		}
//		
//		WebElement allLinks = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[7]/div[3]"));
//		
//		List<WebElement> urls = allLinks.findElements(By.tagName("a"));
//		
//		for(WebElement link: urls) {
//			System.out.println(link.getAttribute("href"));
//		}
//		
		driver.close();

	}

}
