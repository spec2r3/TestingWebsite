import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Slider {
        public static void main(String args[]) throws InterruptedException {

                System.setProperty("webdriver.chrome.driver", "G:\\Program Files\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");

                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                
                driver.get("https://parabank.parasoft.com/parabank/index.htm");

                driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("Hunt");
                driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("test1234");
                driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();

                
                
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.get("https://parabank.parasoft.com/parabank/services.htm");

                JavascriptExecutor slider = (JavascriptExecutor) driver;
                slider.executeScript("window.scrollBy(0,400)");

                Thread.sleep(3000);
                slider.executeScript("window.scrollBy(0,800)");

                Thread.sleep(3000);
                slider.executeScript("window.scrollBy(0,1200)");

                Thread.sleep(3000);
                slider.executeScript("window.scrollTo(0,0)");

                driver.quit();

        }
}
