package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("abc");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='10476']")).click();
		
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if (title.contains("Duplicate")) {
			
			System.out.println("Duplicate created");
		}
		else {
			System.out.println("Duplicate not created");
		}
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		Thread.sleep(2000);
		
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		if (text.contains("sowmya")) {
			System.out.println("I confirm");
		}
		else {
			System.out.println("I do not confirm");
		}
		
		driver.close();
		

	}

}
