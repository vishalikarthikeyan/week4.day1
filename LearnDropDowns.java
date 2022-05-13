package week4.day1;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.reactivex.rxjava3.internal.observers.ForEachWhileObserver;

public class LearnDropDowns {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Public Relations");
		
		WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select select1 = new Select (marketingCampaign);
		select1.selectByIndex(4);
		
		WebElement industryDropDown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select select2 = new Select (industryDropDown);
	    java.util.List<WebElement> options = select2.getOptions();
	    
	    for (WebElement eachOption : options) {
	    	System.out.println(eachOption.getText());
	    }
	    WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	    Select select3 = new Select(Ownership);
	    java.util.List<WebElement> options2 = select3.getOptions();
	    select3.selectByIndex(options2.size()-1);
	    
	    
	    	
			
	    	
		} 
		
		
	}
	


