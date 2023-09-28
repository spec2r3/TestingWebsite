import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(priority=1,groups="functionality")
	public void logintest() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("Hunt");
	    driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("test1234");
	    driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
	        
	    Thread.sleep(2500);
	        
	    WebElement wel = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/p/b"));
	        
	    String welc = wel.getText();
	    String Wel = "Welcome";
	    Assert.assertEquals(Wel,welc);
	    
		driver.quit();
	}
	
	@Test(priority=1,groups="functionality")
	public void logouttest() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("Hunt");
	    driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("test1234");
	    driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
	        
	    Thread.sleep(1500);
	        
	    
	    driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
	    
	    Thread.sleep(1500);
	    
	    WebElement cust = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/h2"));
	    String cl = cust.getText();
	    String CL = "Customer Login";
	    Assert.assertEquals(CL ,cl);
	    
		driver.quit();
	}
	
}


