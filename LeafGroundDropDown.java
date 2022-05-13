package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropDown {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select select1 = new Select(dropdown1);
		select1.selectByIndex(1);
		
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		Select  select2 = new Select(dropdown2);
		select2.selectByVisibleText("Loadrunner");
		
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		Select select3 = new Select (dropdown3);
		select3.selectByValue("3");
		
		WebElement dropdown4 = driver.findElement(By.className("dropdown"));
		Select select4= new Select (dropdown4);
		int size = select4.getOptions().size();
			System.out.println("the no.of dropdownlist is :" + size);
			
		WebElement drop = driver.findElement(By.xpath("(//div[@class = 'example']/select)[6]"));
		Select select5 = new Select(drop);	
			select5.selectByIndex(3);
		}
		
		
		
		
		
		
		
		
		
	}


