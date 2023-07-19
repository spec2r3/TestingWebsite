import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenNewAccount {

    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "G:\\Program Files\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       
        
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("Hunt");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("test1234");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
        
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
  
        
        driver.close();
       
  
       }
}

