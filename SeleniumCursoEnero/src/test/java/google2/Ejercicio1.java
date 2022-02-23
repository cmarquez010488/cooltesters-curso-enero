package google2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ejercicio1 {

	public static WebDriver driver;

	  @BeforeTest
	  public void beforeTest() {
	  }
	  
	  @Test
	  public void facebookTest() {
		  
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
	
			// Explicit wait
			WebDriverWait wait = new WebDriverWait(driver,10);	
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")));			
			System.out.println("Cargo la Pagina");
			
			// Validation - Hard Assertion
			Assert.assertEquals(driver.getTitle(), "Facebook - Inicia sesión o regístrate");
	  }
	  
	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }

}
