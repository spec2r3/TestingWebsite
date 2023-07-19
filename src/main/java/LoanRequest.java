import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoanRequest{
	
	public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "G:\\Program Files\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       
    
        driver.get("https://parabank.parasoft.com/parabank/requestloan.htm");
	
        driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("100");
        driver.findElement(By.xpath("//*[@id=\"downPayment\"]")).sendKeys("10");
        WebElement ddown1 = driver.findElement(By.xpath("//*[@id=\\\"fromAccountId\\\"]"));
        Select select1 = new Select(ddown1);
        select1.selectByIndex(0);
        
        Thread.sleep(1000);
        
        WebElement applyButton = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/table/tbody/tr[4]/td[2]/input"));
        applyButton.click();
        
        driver.close();
        
        
    
	
}
	
}