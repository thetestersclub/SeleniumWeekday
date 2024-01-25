package Testcases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabsAndWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		System.out.println("Title is "+title);
		String mainWinHandle = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("water");
		String mainWinHandle2 = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("water");
		
		System.out.println(driver.getWindowHandles().size());
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		
		
		List<String> winIndex = new ArrayList<String>();
		while(itr.hasNext()) {
			winIndex.add(itr.next());
		}
		
		for(String ind:winIndex) {
			System.out.println(ind);
		}
		
		
		driver.switchTo().window(mainWinHandle);
		System.out.println("First window Tilte"+driver.getTitle());
		
		driver.switchTo().window(mainWinHandle2);
		System.out.println("sec window Tilte"+driver.getTitle());
//		
//		driver.switchTo().window(winIndex.get(1));
//		System.out.println("Second window Tilte"+driver.getTitle());
//		
//		driver.switchTo().window(winIndex.get(2));
//		System.out.println("third window Tilte"+driver.getTitle());
//		
		
		
		
		
		
		driver.manage().window().maximize();
		driver.quit();	

	}

}
