package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		System.out.println("Page loaded successfully");
		driver.manage().window().maximize();
		System.out.println("maximized successfully");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();	
		System.out.println("logged in successfully");
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println("clicked on CRM/SFA successfully");
		
		driver.findElement(By.linkText("Contacts")).click();
		System.out.println("Contact Tab clicked Successfully");
		
		driver.findElement(By.linkText("Find Contacts")).click();
		System.out.println("Clicked on Find contacts successfully");
		
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		System.out.println("Email clicked successfully");
		driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		
		driver.findElement(By.linkText("Find Contacts")).click();
		System.out.println("Clicked on Find contacts button Successfully");
		
		
		driver.close();
		

	}

}
