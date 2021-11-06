package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingProgram {

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
		
		driver.findElement(By.linkText("Leads")).click();
		System.out.println("clicked on Leads successfully");
		
		driver.findElement(By.linkText("Create Lead")).click();
		System.out.println("clicked on Create Lead successfully");
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("cognizant");
		System.out.println("Comapny name entered successfully");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
		System.out.println("First name entered successfully");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Settu");
		System.out.println("Last name entered successfully");
		
		driver.findElement(By.name("submitButton")).click();
		System.out.println("submitted successfully");
		String Title=driver.getTitle();
		System.out.println(Title);
		String text=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);		
		driver.close();
		

	}

}
