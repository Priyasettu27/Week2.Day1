package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

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
		
		driver.findElement(By.linkText("Create Contact")).click();
		System.out.println("clicked on Create Contact successfully");
		
		driver.findElement(By.id("firstNameField")).sendKeys("Priya");
		System.out.println("First Name is entered successfully");
		
		driver.findElement(By.id("lastNameField")).sendKeys("Settu");
		System.out.println("Last Name is entered successfully");
				
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Clicked on create contact button Successfully");
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		String text=driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println(text);		
		driver.close();
		

	}

}
