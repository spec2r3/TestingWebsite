import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class TransferFunds {

    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "G:\\Program Files\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/transfer.htm");
        
        driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("100");
        
        WebElement ToAccount = driver.findElement(By.xpath("//*[@id=\"toAccountId\"]"));
        ToAccount.click();
        ToAccount.sendKeys(Keys.DOWN, Keys.RETURN);
        
        Thread.sleep(5000);
        
        WebElement Transfer = driver.findElement(By.xpath("<input type=\"submit\" class=\"button\" value=\"Transfer\">"));
        Transfer.click();
        
        driver.close();
        
        
    }
}
