package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Jayendran");
		
		driver.findElement(By.id("lastNameField")).sendKeys("Rajkumar");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Jayendran");
		
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Rajkumar");
		
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createContactForm_description")).sendKeys("Learning Selenium");
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("jayendran.rajkumar@gmail.com");
		
		WebElement dropDown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		
		Select state = new Select(dropDown);
		
		state.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.xpath("//a[@class='subMenuButton'][1]")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Learn Selenium");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);

	}

}
