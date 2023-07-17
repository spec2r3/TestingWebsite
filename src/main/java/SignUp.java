import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignUp {

    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "G:\\Program Files\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://parabank.parasoft.com/parabank/register.htm");

        driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"customer.username\"]")).sendKeys("Hunt");
        driver.findElement(By.xpath("//*[@id=\"customer.password\"]")).sendKeys("test1234");
        driver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]")).sendKeys("test1234");
        driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();

        driver.quit();

    }
}
