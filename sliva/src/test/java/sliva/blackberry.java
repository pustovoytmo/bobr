package sliva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class blackberry {
	 private String emailField = "//input[@type = 'email']";
	 private String nextSr = "//content[@class = 'CwaK9']/span[@class = 'RveJvd snByac']";
	@Test
	public void openGoogle() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pust\\eclipse-workspace\\sliva\\src\\test\\resources\\chromedriver.exe");	
					  
			  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://gmail.com");
		  
		  WebElement emailFieldBtm = driver.findElement(By.xpath(emailField));
		  emailFieldBtm.click();
		  emailFieldBtm.sendKeys("AT.Tuturial.mail.1@gmail.com");
		  
		  WebElement nextBtn =  driver.findElement(By.xpath(nextSr));
		  nextBtn.click();
		  
		  try {
		   Thread.sleep(10000);
		  } catch (InterruptedException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		  driver.close();
		  
		  
		 }
	}
