package Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chromeTest2 {

	@Test
	public void testChrome()
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();  
		
        driver.get("http://www.facebook.com");
        
        WebElement mailID = driver.findElement(By.id("email"));
        mailID.sendKeys("test1@gmail.com");
        
        driver.close();
	}

}
