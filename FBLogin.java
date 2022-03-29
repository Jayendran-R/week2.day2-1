package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBLogin {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Jayendran");
		
		driver.findElement(By.name("lastname")).sendKeys("Rajkumar");
		
		driver.findElement(By.name("reg_email__")).sendKeys("9842045722");
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Jay@1212");
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select day = new Select(dropDown);
		
		day.selectByValue("12");
		
		WebElement dropDown1 = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select month = new Select(dropDown1);
		
		month.selectByValue("12");
		
		WebElement dropDown2 = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select year = new Select(dropDown2);
		
		year.selectByValue("1988");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		

	}

}
