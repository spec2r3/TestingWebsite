import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class BasicTests{

	public static void main(String args[]) {

        System.setProperty("webdriver.chrome.driver", "G:\\Program Files\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        String CurrentUrl = "https://parabank.parasoft.com/parabank/index.htm";
        String Url = driver.getCurrentUrl();
        Assert.assertEquals(CurrentUrl, Url);

        String Title = driver.getTitle();
        System.out.println(Title);

        String Source = driver.getPageSource();
        System.out.println(Source);

        driver.navigate().to("https://parabank.parasoft.com/parabank/about.htm");

        driver.quit();

    }

}
