import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class regressiontest {
	
	 public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver(); 
	        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
	        
	        String title = driver.getTitle();
	        System.out.println("Title is :"+title);
	        
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	         driver.findElement(By.name("my-text")).sendKeys("Selenium");
	         driver.findElement(By.cssSelector("button")).click();
	         
	         
	         
	        
	         //  driver.quit();

}
}
