package week4.day1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtStationFrom")).clear();
		driver .findElement(By.id("txtStationFrom")).sendKeys("MDU" , Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("Tpj",Keys .ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		 
	 WebElement elemntTable = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
		
	 List<WebElement> rows = elemntTable.findElements(By.tagName("tr"));
		
	for (int i = 0; i < rows.size(); i++) {
		List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
		for (int j = 0; j <=1; j++) 
		{
			System.out.println(cols.get(j).getText() + " ");
			
		}
		
	}	
	  
		 
		
	}
		
	}	
		
	
