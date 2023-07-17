import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasicTests{

    public static void main(String args[]) {

        System.setProperty("webdriver.chrome.driver", "G:\\Program Files\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        String Url = driver.getCurrentUrl();
        System.out.println(Url);

        String Title = driver.getTitle();
        System.out.println(Title);

        String Source = driver.getPageSource();
        System.out.println(Source);

        driver.navigate().to("https://parabank.parasoft.com/parabank/about.htm");

        driver.quit();

    }

}
