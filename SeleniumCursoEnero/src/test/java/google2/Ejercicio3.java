package google2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ejercicio3 {
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
			
			//email textbox
			String element1 = driver.findElement(By.xpath("//*[@id=\"email\"]")).getText();
			//password textbox
			String element2 = driver.findElement(By.id("pass")).getText();
			//boton iniciar sesion
			String element3 = driver.findElement(By.name("login")).getText();
			//Olvidaste la contrasenia
			String element4 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a")).getText();
			//Label
			String element5 = driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]")).getText();
			
			System.out.println(element1 + " " + element2 + " " + element3 + " " + element4 + " " + element5 );
			
			
	  }
	  
	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }
}
