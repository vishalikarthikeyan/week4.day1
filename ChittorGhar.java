package week4.day1;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.formula.functions.Rows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChittorGhar {
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("navbtn_stockmarket")).click();
		
		driver.findElement(By.xpath("(//a[contains(text(),'NSE Bulk Deals')])[1]")).click();
		
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']"));
	
	     List<WebElement> row = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr/td[3]"));
		
	        for (int i = 1; i < row.size(); i++) {
			System.out.println(row.get(i).getText());
			
		}
		
	}
	    
	    
	    
	   

			   
		   }
			
		
	   
	
	
	
	
	


