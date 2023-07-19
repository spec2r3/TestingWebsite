import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Logout {

    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "G:\\Program Files\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        
        
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();

        driver.close();
    }
}
