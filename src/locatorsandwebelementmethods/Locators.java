package locatorsandwebelementmethods;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
//		locator by id
		By un = By.id("user-name");
		
//		locator by name
		By pw = By.name("password");
		
//		locator by class name
		By loginbtn = By.id("login-button");
		
		WebElement un_ele = driver.findElement(un);
		WebElement pw_ele = driver.findElement(pw);
		WebElement loginbtn_ele = driver.findElement(loginbtn);
		
		un_ele.click();
		un_ele.clear();
		un_ele.sendKeys("standard_user");
		Thread.sleep(5000);
		un_ele.clear();
		un_ele.sendKeys("standard_user");
		
		String str = un_ele.getAttribute("value");
		System.out.println(str);
	
		
		pw_ele.click();
		pw_ele.clear();
		pw_ele.sendKeys("secret_sauce");
		Thread.sleep(5000);
		
	    Thread.sleep(5000);
	    loginbtn_ele.click();
		
		
	}

}
