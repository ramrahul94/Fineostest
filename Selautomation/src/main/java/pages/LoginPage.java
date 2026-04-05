package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	//all the locator for login page 
	
	private By usernametextbox = By.id("Email");
	private By passwordTextBox = By.id("Password");
	private By LoginButton = By.xpath("//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button");
	
	public LoginPage(WebDriver driver) 
	{  
		this.driver = driver;                  //creation of constructor
		
	}
	//Creation /performing of all Actions 
	
	public void enterUsername(String  username) { 
		driver.findElement(usernametextbox).clear();
		driver.findElement(usernametextbox).sendKeys(username);     //perform A//perform Actions 
		
		
		
	}
	public  void enterpassword(String password) {
		driver.findElement(passwordTextBox).clear();
		driver.findElement(passwordTextBox).sendKeys("password");     //perform A//perform Actions 
		
		
	}
	public void clickLogin() {
		driver.findElement(LoginButton).click();
		
		
		
	}
	
	
	

	
	
	
	
	
	
	
	
	

}