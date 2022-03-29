package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logOutAndCloseBrowser {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://acme-test.uipath.com/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if (driver.getTitle().contains("ACME")){
			
			System.out.println("I confirm");
		}
		else 
			System.out.println("The title does not contain Acme uipath");
		
		driver.findElement(By.linkText("Log Out")).click();
		
		driver.close();
		

	}

}
