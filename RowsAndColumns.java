package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RowsAndColumns {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		
		List<WebElement> rows1 = driver.findElements(By.xpath("//div[@class='render']//tr"));
		int r1 = rows1.size();
		List<WebElement> rows2 = driver.findElements(By.xpath("//table[@class ='attributes-list']//tr"));
		int r2 = rows2.size();
		int rows = r1+r2;
		System.out.println("no.of rows:" + rows );
		
		
		List<WebElement> cols = driver.findElements(By.xpath("//div[@class='render']//td"));
		int col1 = cols.size();
		List<WebElement> cols2 = driver.findElements(By.xpath("//table[@class ='attributes-list']//td"));
		
		int col2 = cols2.size();
		int columns = col1+col2;
		System.out.println("no.of columns: " + columns );
			
			
	 
				 
		
			
			
		}
		
		
		
		
		
		
	}


