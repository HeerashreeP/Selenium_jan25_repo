package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenParameterTest {
	@Test
	public void launch() {
		String url = System.getProperty("url"); //mvn test -Dtest=MavenParameterTest -Durl=https://demowebshop.tricentis.com/
		Reporter.log(url, true);             //above code to be passed in cmd prompt 
		String email = System.getProperty("email");
		String pwd = System.getProperty("pwd");
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
	}

}
