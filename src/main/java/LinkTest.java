import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkTest{
	
	
	@Test(priority=2,groups="smoke")
	public void homeurltest(){
		
		String WebUrl = "https://parabank.parasoft.com/parabank/index.htm";
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        String Url = driver.getCurrentUrl();
        Assert.assertEquals(Url, WebUrl);
        driver.quit();
        
}
	
	@Test(priority=2,groups="smoke")
	public void abouturltest(){
		
		String WebUrl = "https://parabank.parasoft.com/parabank/about.htm";
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/about.htm");
        String Url = driver.getCurrentUrl();
        Assert.assertEquals(Url, WebUrl);
        driver.quit();
        
}
	
	@Test(priority=2,groups="smoke")
	public void servicesurltest(){
		
		String WebUrl = "https://parabank.parasoft.com/parabank/services.htm";
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/services.htm");
        String Url = driver.getCurrentUrl();
        Assert.assertEquals(Url, WebUrl);
        driver.quit();
        
}
	
	@Test(priority=2,groups="smoke")
	public void adminurltest(){
		
		String WebUrl = "https://parabank.parasoft.com/parabank/admin.htm";
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/admin.htm");
        String Url = driver.getCurrentUrl();
        Assert.assertEquals(Url, WebUrl);
        driver.quit();
        
}
	
	@Test(priority=2,groups="smoke")
	public void contacturltest(){
		
		String WebUrl = "https://parabank.parasoft.com/parabank/contact.htm";
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/contact.htm");
        String Url = driver.getCurrentUrl();
        Assert.assertEquals(Url, WebUrl);
        driver.quit();
        
}

	@Test(priority=2,groups="smoke")
	public void siteurltest(){
		
		String WebUrl = "https://parabank.parasoft.com/parabank/sitemap.htm";
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/sitemap.htm");
        String Url = driver.getCurrentUrl();
        Assert.assertEquals(Url, WebUrl);
        driver.quit();
        
}
}