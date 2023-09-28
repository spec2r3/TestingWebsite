import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FunctionalityTest {
	
	@Test(priority=1,groups="functionality")
	public void BillPaymentTest() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("Hunt");
	    driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("test1234");
	    driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
	        
	    Thread.sleep(2500);
	        
	    driver.get("https://parabank.parasoft.com/parabank/billpay.htm");

	    driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("test");
	    driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("test");
	    driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("test");
	    driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("test");
	    driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("test");
	    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/form/table/tbody/tr[6]/td[2]/input")).sendKeys("123");
	    driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[8]/td[2]/input")).sendKeys("123");
	    driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[9]/td[2]/input")).sendKeys("123");
	    driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[11]/td[2]/input")).sendKeys("Hunt");
	    
	    Thread.sleep(2500);
	    
	    WebElement sendButton = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[14]/td[2]/input"));
	    sendButton.click();
	    
	        
	    String welc = wel.getText();
	    String Wel = "Welcome";
	    Assert.assertEquals(Wel,welc);
	    
		driver.quit();
	}
	
	
	@Test(priority=1,groups="functionality")
	public void LoanRequestTest() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("Hunt");
	    driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("test1234");
	    driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
	        
	    Thread.sleep(2500);
	        
	    driver.get("https://parabank.parasoft.com/parabank/requestloan.htm");
		
        driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("100");
        driver.findElement(By.xpath("//*[@id=\"downPayment\"]")).sendKeys("10");
        WebElement ddown1 = driver.findElement(By.xpath("//*[@id=\\\"fromAccountId\\\"]"));
        Select select1 = new Select(ddown1);
        select1.selectByIndex(0);
        
        Thread.sleep(1000);
        
        WebElement applyButton = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/table/tbody/tr[4]/td[2]/input"));
        applyButton.click();
	    
	        
	    String welc = wel.getText();
	    String Wel = "Welcome";
	    Assert.assertEquals(Wel,welc);
	    
		driver.quit();
	}
	
	@Test(priority=1,groups="functionality")
	public void OpenNewAccountTest() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("Hunt");
	    driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("test1234");
	    driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
	        
	    Thread.sleep(2500);
	        
 driver.get("https://parabank.parasoft.com/parabank/openaccount.htm");
        
        //Open Checking Account
        WebElement ddown1 = driver.findElement(By.xpath("//*[@id=\"type\"]"));
        Select select1 = new Select(ddown1);
        
        select1.selectByIndex(0);
       
        Thread.sleep(5000);
        
        WebElement openButton1 = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input"));
        openButton1.click();
        
        Thread.sleep(1000);
        
        //Open Savings Account
        
        WebElement NewAccount = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a"));
        NewAccount.click();
        
        WebElement ddown2 = driver.findElement(By.xpath("//*[@id=\"type\"]"));
        Select select2 = new Select(ddown2);
        
        select2.selectByIndex(1);
        
        Thread.sleep(5000);
        
        WebElement openButton2 = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input"));
        openButton2.click();
        
        Thread.sleep(2000);
	    
		driver.quit();
	}
	
	@Test(priority=1,groups="functionality")
	public void TransferFundsTest() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("Hunt");
	    driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("test1234");
	    driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
	        
	    Thread.sleep(2500);
	        
driver.get("https://parabank.parasoft.com/parabank/transfer.htm");
        
        driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("100");
        
        WebElement ToAccount = driver.findElement(By.xpath("//*[@id=\"toAccountId\"]"));
        ToAccount.click();
        ToAccount.sendKeys(Keys.DOWN, Keys.RETURN);
        
        Thread.sleep(5000);
        
        WebElement Transfer = driver.findElement(By.xpath("<input type=\"submit\" class=\"button\" value=\"Transfer\">"));
        Transfer.click();
        
        driver.close();
	    
	 
	    String welc = wel.getText();
	    String Wel = "Welcome";
	    Assert.assertEquals(Wel,welc);
	    
		driver.quit();
	}
	
	

}
